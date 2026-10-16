import java.lang.reflect.*;
import java.net.*;
import java.nio.file.*;

/**
 * Bytecode-verification gate for the patched classes.
 *
 * `Class.forName(name, true, loader)` forces the JVM to LINK the class before it
 * initialises it.  A malformed patch therefore surfaces as
 * java.lang.VerifyError / ClassFormatError.  Any other exception (typically
 * ExceptionInInitializerError from a missing native library or an absent
 * Minecraft bootstrap) proves the class linked, i.e. the patch is well formed.
 */
public class VerifyPatch {
    public static void main(String[] args) throws Exception {
        Path jar = Paths.get(args[0]);
        URLClassLoader loader = new URLClassLoader(new URL[]{jar.toUri().toURL()},
                ClassLoader.getSystemClassLoader());
        int fatal = 0;
        for (int i = 1; i < args.length; i++) {
            String name = args[i];
            String verdict;
            try {
                Class.forName(name, true, loader);
                verdict = "LINK+INIT OK";
            } catch (VerifyError e) {
                verdict = "*** VERIFICATION FAILURE: " + e.getClass().getName() + ": " + e.getMessage();
                fatal++;
            } catch (ClassFormatError e) {          // also covers UnsupportedClassVersionError
                verdict = "*** CLASS FORMAT FAILURE: " + e.getClass().getName() + ": " + e.getMessage();
                fatal++;
            } catch (Throwable t) {
                Throwable root = t;
                while (root.getCause() != null) root = root.getCause();
                verdict = "LINKED OK (initialisation stopped later: "
                        + t.getClass().getSimpleName() + " / " + root.getClass().getSimpleName()
                        + (root.getMessage() != null ? ": " + root.getMessage() : "") + ")";
            }
            System.out.printf("%-34s %s%n", name, verdict);
        }
        System.out.println(fatal == 0
                ? "RESULT: every class linked and passed bytecode verification"
                : "RESULT: " + fatal + " class(es) failed verification");
        System.exit(fatal == 0 ? 0 : 2);
    }
}
