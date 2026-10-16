import java.lang.reflect.*;
import java.net.*;
import java.nio.file.*;
import java.util.*;

/**
 * Dynamic proof of the login bypass.
 *
 * q08.drawScreen is the ONLY place in the whole jar that instantiates the login
 * screen. This harness:
 *
 *   1. loads q08 through a ClassLoader that records every class name the JVM asks
 *      it to resolve (recording loadClass requests, not just class definitions, so
 *      a class already cached from the setup phase still shows up);
 *   2. allocates a q08 instance without running its constructor and leaves the
 *      authentication state unauthenticated;
 *   3. invokes drawScreen once, then reports
 *        - whether the JVM had to resolve `qih` while the method ran, and
 *        - where the resulting exception was raised.
 *
 * "qih was resolved during drawScreen" and "the exception originates in
 * qih.<init>" are both direct evidence that the login path was taken.
 */
public class DynamicGateTest {

    static final class RecordingLoader extends URLClassLoader {
        final Set<String> requested = new LinkedHashSet<>();

        RecordingLoader(URL[] urls, ClassLoader parent) {
            super(urls, parent);
        }

        @Override
        public Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
            requested.add(name);            // recorded even when already cached
            return super.loadClass(name, resolve);
        }
    }

    public static void main(String[] args) throws Exception {
        Path jar = Paths.get(args[0]);
        RecordingLoader loader = new RecordingLoader(
                new URL[]{jar.toUri().toURL()}, ClassLoader.getSystemClassLoader());

        String state;
        try {
            Class<?> zwr = Class.forName("zwr", true, loader);
            Object tgs = zwr.getField("tgs").get(null);
            if (tgs == null) {
                Class<?> prq = Class.forName("prq", true, loader);
                tgs = prq.getConstructor(String.class, String.class)
                        .newInstance("offline", "offline");
                zwr.getField("tgs").set(null, tgs);
            }
            Object dbd = tgs.getClass().getField("dbd").get(tgs);
            state = "zwr.tgs != null, prq.dbd = " + dbd + "  (unauthenticated)";
        } catch (Throwable t) {
            Throwable root = t;
            while (root.getCause() != null) root = root.getCause();
            state = "session object could not be synthesised ("
                    + root.getClass().getSimpleName() + ") - authentication state stays null";
        }

        Class<?> q08 = Class.forName("q08", false, loader);
        Field theUnsafe = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        theUnsafe.setAccessible(true);
        Object unsafe = theUnsafe.get(null);
        Object instance = unsafe.getClass()
                .getMethod("allocateInstance", Class.class).invoke(unsafe, q08);

        Method draw = q08.getDeclaredMethod("drawScreen", int.class, int.class, float.class);
        draw.setAccessible(true);

        loader.requested.clear();
        Throwable thrown = null;
        try {
            draw.invoke(instance, 0, 0, 0.0f);
        } catch (Throwable t) {
            thrown = (t instanceof InvocationTargetException && t.getCause() != null)
                    ? t.getCause() : t;
        }
        boolean qihResolved = loader.requested.contains("qih");

        boolean qihInTrace = false;
        if (thrown != null) {
            for (StackTraceElement e : thrown.getStackTrace()) {
                if ("qih".equals(e.getClassName())) { qihInTrace = true; break; }
            }
        }

        // If zwr itself could not initialise, the classpath is incomplete (the
        // flux:* libraries are the usual missing piece). The guard was then never
        // evaluated, so the run must be reported inconclusive - never as a bypass.
        boolean setupBroken = false;
        if (thrown != null && !qihResolved && !qihInTrace) {
            for (Throwable t = thrown; t != null; t = t.getCause()) {
                String m = String.valueOf(t.getMessage());
                if (t instanceof NoClassDefFoundError
                        && (m.contains("zwr") || m.contains("ClientState"))) {
                    setupBroken = true;
                    break;
                }
            }
        }

        System.out.println("jar                        : " + jar.getFileName());
        System.out.println("authentication state       : " + state);
        System.out.println("qih resolved during call   : " + qihResolved);
        System.out.println("exception                  : "
                + (thrown == null ? "none"
                                  : thrown.getClass().getName()
                                    + (thrown.getMessage() == null ? "" : ": " + thrown.getMessage())));
        if (thrown != null) {
            StackTraceElement[] st = thrown.getStackTrace();
            for (int i = 0; i < Math.min(4, st.length); i++) {
                System.out.println("    at " + st[i]);
            }
        }
        System.out.println("exception inside qih.<init>: " + qihInTrace);
        if (setupBroken) {
            System.out.println("VERDICT                    : INCONCLUSIVE - zwr could not be "
                    + "initialised, so the guard was never evaluated (check that the flux:* "
                    + "libraries are on the classpath)");
            System.exit(2);
        }
        boolean bypassed = !qihResolved && !qihInTrace;
        System.out.println("VERDICT                    : "
                + (bypassed ? "LOGIN BYPASSED - login screen never reached"
                            : "LOGIN GATE ACTIVE - login screen reached"));
    }
}
