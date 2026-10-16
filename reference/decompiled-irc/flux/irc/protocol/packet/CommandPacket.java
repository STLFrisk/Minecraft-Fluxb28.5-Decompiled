/*
 * Decompiled with CFR 0.152.
 */
package today.flux.irc.protocol.packet;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import today.flux.irc.protocol.c;
import today.flux.irc.protocol.e;
import today.flux.irc.protocol.packet.CommandPacket$Exception;

@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\f"}, d2={"Ltoday/flux/irc/protocol/packet/CommandPacket;", "Ltoday/flux/irc/protocol/e;", "Ltoday/flux/irc/protocol/c;", "()V", "command", "", "getCommand", "()Ljava/lang/String;", "setCommand", "(Ljava/lang/String;)V", "pid", "", "IRCProtocol"})
public final class CommandPacket
extends e
implements c {
    @NotNull
    private String command;
    private static int f;
    private static final String i;
    private static final Object[] j;
    private static final String[] k;

    @NotNull
    public final String getCommand() {
        return CommandPacket.b("k", (CommandPacket)this, (long)510206611103799L);
    }

    public final void setCommand(@NotNull String string) {
        try {
            CommandPacket.b("\u00f5", string, (String)((Object)CommandPacket.b("\u00f5", (int)108, (int)64, (String)i, (long)650304640011270L)), (long)563737039123915L);
            CommandPacket.b("\u00ed", (CommandPacket)this, (String)string, (long)510206611103799L);
            return;
        }
        catch (CommandPacket$Exception commandPacket$Exception) {
            return;
        }
    }

    @Override
    public int pid() {
        return 9;
    }

    public CommandPacket() {
        CommandPacket.b("\u00ed", (CommandPacket)this, (String)"", (long)510206611103799L);
    }

    public static void b(int n2) {
        f = n2;
    }

    public static int a() {
        return f;
    }

    public static int b() {
        int n2 = CommandPacket.a();
        try {
            if (n2 == 0) {
                return 74;
            }
        }
        catch (CommandPacket$Exception commandPacket$Exception) {
            throw CommandPacket.a(commandPacket$Exception);
        }
        return 0;
    }

    private static CommandPacket$Exception a(CommandPacket$Exception commandPacket$Exception) {
        return commandPacket$Exception;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block13: {
            int n2;
            char[] cArray2;
            int n3;
            int n4;
            block12: {
                j = new Object[10];
                k = new String[10];
                CommandPacket.h();
                if (CommandPacket.a() != 0) {
                    CommandPacket.b(29);
                }
                char[] cArray3 = "tOX\u000b\u0018^[".toCharArray();
                int n5 = cArray3.length;
                n4 = 0;
                n3 = 72;
                cArray2 = cArray3;
                n2 = n5;
                if (n5 <= 1) break block12;
                cArray = cArray2;
                n2 = n2;
                if (n2 <= n4) break block13;
            }
            do {
                int n6 = n3;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n7 = n3;
                int n8 = n4;
                while (true) {
                    int n9;
                    switch (n4 % 7) {
                        case 0: {
                            n9 = 76;
                            break;
                        }
                        case 1: {
                            n9 = 120;
                            break;
                        }
                        case 2: {
                            n9 = 57;
                            break;
                        }
                        case 3: {
                            n9 = 59;
                            break;
                        }
                        case 4: {
                            n9 = 49;
                            break;
                        }
                        case 5: {
                            n9 = 37;
                            break;
                        }
                        default: {
                            n9 = 97;
                        }
                    }
                    cArray4[n8] = (char)(cArray4[n8] ^ (n7 ^ n9));
                    ++n4;
                    n3 = n6;
                    if (n6 != 0) break;
                    n6 = n3;
                    cArray2 = cArray2;
                    n8 = n3;
                    cArray4 = cArray2;
                    n7 = n3;
                }
                cArray = cArray2;
                n2 = n2;
            } while (n2 > n4);
        }
        i = new String(cArray).intern();
    }

    private static int e(long l2) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)(l2 >>> 46);
        if (k[n5] != null) {
            return n5;
        }
        Object object = j[n5];
        int n6 = 0;
        switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 7;
                break;
            }
            case 1: {
                n4 = 63;
                break;
            }
            case 2: {
                n4 = 55;
                break;
            }
            case 3: {
                n4 = 41;
                break;
            }
            case 4: {
                n4 = 4;
                break;
            }
            case 5: {
                n4 = 39;
                break;
            }
            case 6: {
                n4 = 52;
                break;
            }
            case 7: {
                n4 = 35;
                break;
            }
            case 8: {
                n4 = 47;
                break;
            }
            case 9: {
                n4 = 1;
                break;
            }
            case 10: {
                n4 = 53;
                break;
            }
            case 11: {
                n4 = 38;
                break;
            }
            case 12: {
                n4 = 3;
                break;
            }
            case 13: {
                n4 = 40;
                break;
            }
            case 14: {
                n4 = 59;
                break;
            }
            case 15: {
                n4 = 31;
                break;
            }
            case 16: {
                n4 = 8;
                break;
            }
            case 17: {
                n4 = 32;
                break;
            }
            case 18: {
                n4 = 12;
                break;
            }
            case 19: {
                n4 = 27;
                break;
            }
            case 20: {
                n4 = 13;
                break;
            }
            case 21: {
                n4 = 15;
                break;
            }
            case 22: {
                n4 = 46;
                break;
            }
            case 23: {
                n4 = 20;
                break;
            }
            case 24: {
                n4 = 9;
                break;
            }
            case 25: {
                n4 = 44;
                break;
            }
            case 26: {
                n4 = 60;
                break;
            }
            case 27: {
                n4 = 11;
                break;
            }
            case 28: {
                n4 = 25;
                break;
            }
            case 29: {
                n4 = 28;
                break;
            }
            case 30: {
                n4 = 22;
                break;
            }
            case 31: {
                n4 = 45;
                break;
            }
            case 32: {
                n4 = 26;
                break;
            }
            case 33: {
                n4 = 24;
                break;
            }
            case 34: {
                n4 = 43;
                break;
            }
            case 35: {
                n4 = 36;
                break;
            }
            case 36: {
                n4 = 0;
                break;
            }
            case 37: {
                n4 = 48;
                break;
            }
            case 38: {
                n4 = 57;
                break;
            }
            case 39: {
                n4 = 5;
                break;
            }
            case 40: {
                n4 = 56;
                break;
            }
            case 41: {
                n4 = 50;
                break;
            }
            case 42: {
                n4 = 17;
                break;
            }
            case 43: {
                n4 = 21;
                break;
            }
            case 44: {
                n4 = 29;
                break;
            }
            case 45: {
                n4 = 51;
                break;
            }
            case 46: {
                n4 = 2;
                break;
            }
            case 47: {
                n4 = 42;
                break;
            }
            case 48: {
                n4 = 49;
                break;
            }
            case 49: {
                n4 = 10;
                break;
            }
            case 50: {
                n4 = 18;
                break;
            }
            case 51: {
                n4 = 34;
                break;
            }
            case 52: {
                n4 = 6;
                break;
            }
            case 53: {
                n4 = 33;
                break;
            }
            case 54: {
                n4 = 58;
                break;
            }
            case 55: {
                n4 = 19;
                break;
            }
            case 56: {
                n4 = 37;
                break;
            }
            case 57: {
                n4 = 23;
                break;
            }
            case 58: {
                n4 = 62;
                break;
            }
            case 59: {
                n4 = 14;
                break;
            }
            case 60: {
                n4 = 61;
                break;
            }
            case 61: {
                n4 = 16;
                break;
            }
            case 62: {
                n4 = 30;
                break;
            }
            default: {
                n4 = 54;
            }
        }
        n6 = n4;
        int[] nArray = new int[6];
        int n7 = 0;
        while (n7 < 6) {
            n3 = 7 * (5 - n7);
            n2 = (int)(l2 >>> n3 & 0x7FL);
            if ((n2 -= n6) < 0) {
                n2 += 128;
            }
            nArray[n7] = n2;
            ++n7;
        }
        char[] cArray = ((String)object).toCharArray();
        n3 = 0;
        while (n3 < cArray.length) {
            n2 = nArray[n3 % nArray.length];
            if (n2 == 0) break;
            cArray[n3] = (char)(cArray[n3] ^ n2);
            ++n3;
        }
        CommandPacket.k[n5] = new String(cArray);
        return n5;
    }

    private static void h() {
        Object[] objectArray = j;
        j[0] = "YJ[*$/KIJ3sh_F\u0011;/nYJ\\$1/]D\\ 8u\u0003fP&0`CAo*>jHQ";
        objectArray[1] = "e\u001a@fJZn\u0015Q)7B}\u0012X`";
        objectArray[2] = "J$%\u001bL'\u000f!'\u001a\u000b O?4\u0005K(Me\u0018\u0019Q;H%\"\u001eF:";
        objectArray[3] = "\u0012?\u001bs\u001ey\u00190\n<\u007fw\u0012;\u000ef";
        objectArray[4] = Void.TYPE;
        CommandPacket.k[4] = "java/lang/Void";
        objectArray[5] = "n\u0014)X\"\u0002y\u0013tX)\u0000yU!\u000e \u0012}\u000f-\u0019-\u0004#(-\u0011-\u0016y\u000e6\u0013\u0004\u0012c\u001e6\u00177\u001eb\u0015\u0001\u000e \u0012}\u000f-\u0019-S<";
        objectArray[6] = Integer.TYPE;
        CommandPacket.k[6] = "java/lang/Integer";
        objectArray[7] = "\u0018\u0002nM^F\u0018\u001a36Y^\u0017\u00189P^9\u000fA-\u000e\fBB\u00120";
        objectArray[8] = ">\u0002kf\nt8Zzel'g\bk84%}\fe6\u0010!}${\u001d\u000b0A\u0018d?lvg\\r)\\wf\u000e{[\u0011pz]> \\#ge;a\u001d'd[~:\u0017 \u0007";
        Object[] objectArray2 = objectArray;
        objectArray[9] = "g&Y\u001f\b\r=$AAu\u000e\"gLJ\u000ecgw\\VM\u001afbO_u_6c]\u0016\f^#pT.\b_&\"\u001bUE\f;\u001aX\u0012\b[ea\u0015A\u0015c";
    }

    private static Class f(long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = CommandPacket.e(l2);
            object = j[n2];
            try {
                if (!(object instanceof String)) break block2;
                CommandPacket.j[n2] = clazz = Class.forName(k[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = CommandPacket.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i2 = 0; i2 < classArray.length; ++i2) {
                field = CommandPacket.d(classArray[i2], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field g(long l2) {
        int n2 = CommandPacket.e(l2);
        Object object = j[n2];
        if (object instanceof String) {
            String string = k[n2];
            int n3 = string.indexOf(8);
            Class clazz = CommandPacket.f(Long.parseLong(string.substring(0, n3), 36));
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = CommandPacket.f(Long.parseLong(string.substring(++n4), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = CommandPacket.c(clazz3, string2, clazz2)) != null) {
                    CommandPacket.j[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i2 = 0; i2 < classArray.length; ++i2) {
                        field = CommandPacket.d(classArray[i2], string2, clazz2);
                        if (field == null) continue;
                        CommandPacket.j[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = CommandPacket.f(251235463226284L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method c(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        block0: for (Method method : clazz.getDeclaredMethods()) {
            Class<?>[] classArray2;
            if (!method.getName().equals(string) || method.getReturnType() != clazz2 || (classArray2 = method.getParameterTypes()).length != n2) continue;
            for (int i2 = 0; i2 < n2; ++i2) {
                if (classArray2[i2] != classArray[i2]) continue block0;
            }
            return method;
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = CommandPacket.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i2 = 0; i2 < classArray2.length; ++i2) {
                method = CommandPacket.d(classArray2[i2], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method h(long l2) {
        int n2 = CommandPacket.e(l2);
        Object object = j[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = k[n2];
                int n4 = string2.indexOf(8);
                clazz3 = CommandPacket.f(Long.parseLong(string2.substring(0, n4), 36));
                int n5 = string2.indexOf(8, ++n4);
                string = string2.substring(n4, n5);
                int n6 = -1;
                int n7 = n5;
                do {
                    ++n6;
                    ++n7;
                } while ((n7 = string2.indexOf(8, n7)) > -1);
                n3 = n6 - 1;
                classArray2 = new Class[n3];
                clazz2 = null;
                n7 = n5 + 1;
                for (int i2 = 0; i2 < n6; ++i2) {
                    int n8 = string2.indexOf(8, n7);
                    clazz2 = CommandPacket.f(Long.parseLong(string2.substring(n7, n8), 36));
                    if (i2 < n3) {
                        classArray2[i2] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = CommandPacket.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        CommandPacket.j[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = CommandPacket.f(251235463226284L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i3 = 0; i3 < classArray.length; ++i3) {
                        Method method = CommandPacket.d(classArray[i3], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        CommandPacket.j[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = CommandPacket.f(251235463226284L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchMethodException in ").append(clazz3.getName()).append(' ').append(clazz2.getName()).append(' ').append(string).append('(');
            int n9 = 0;
            while (n9 < n3) {
                stringBuffer.append(classArray2[n9].getName());
                if (++n9 >= n3) continue;
                stringBuffer.append(", ");
            }
            stringBuffer.append(')');
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Method)object;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2) {
        char c2 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c2 == 'k' || c2 == '\u00ed' || c2 == '\u00fb' || c2 == 'z') {
                field = CommandPacket.g(l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c2 == 'k' ? lookup.findGetter(clazz, string2, clazz2) : (c2 == '\u00ed' ? lookup.findSetter(clazz, string2, clazz2) : (c2 == '\u00fb' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = CommandPacket.h(l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c2 == 'A' ? lookup.findVirtual(clazz, string3, methodType2) : (c2 == '\u00f5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 1, new Class[]{Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 1;
        long l2 = (Long)objectArray[n2];
        MethodHandle methodHandle = CommandPacket.b(lookup, mutableCallSite, string, methodType, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("today/flux/irc/protocol/packet/CommandPacket" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CommandPacket.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

