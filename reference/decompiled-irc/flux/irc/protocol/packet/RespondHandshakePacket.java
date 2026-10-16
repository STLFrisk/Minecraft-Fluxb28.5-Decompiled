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
import today.flux.irc.client.network.ClientNetwork;
import today.flux.irc.protocol.c;
import today.flux.irc.protocol.e;
import today.flux.irc.protocol.packet.RespondHandshakePacket$IOException;

@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\f"}, d2={"Ltoday/flux/irc/protocol/packet/RespondHandshakePacket;", "Ltoday/flux/irc/protocol/e;", "Ltoday/flux/irc/protocol/c;", "()V", "key", "", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "pid", "", "IRCProtocol"})
public final class RespondHandshakePacket
extends e
implements c {
    @NotNull
    private String key;
    private static ClientNetwork.Companion[] f;
    private static final String i;
    private static final Object[] j;
    private static final String[] k;

    @NotNull
    public final String getKey() {
        return RespondHandshakePacket.b("\u00e1", (RespondHandshakePacket)this, (long)651347600447403L);
    }

    public final void setKey(@NotNull String string) {
        try {
            RespondHandshakePacket.b("\u00b5", string, (String)((Object)RespondHandshakePacket.b("\u00b5", (int)36, (int)124, (String)i, (long)563421421158756L)), (long)525105331907784L);
            RespondHandshakePacket.b("B", (RespondHandshakePacket)this, (String)string, (long)651347600447403L);
            return;
        }
        catch (RespondHandshakePacket$IOException respondHandshakePacket$IOException) {
            return;
        }
    }

    @Override
    public int pid() {
        return 2;
    }

    public RespondHandshakePacket() {
        RespondHandshakePacket.b("B", (RespondHandshakePacket)this, (String)"", (long)651347600447403L);
    }

    public static void b(ClientNetwork.Companion[] companionArray) {
        f = companionArray;
    }

    public static ClientNetwork.Companion[] a() {
        return f;
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
                RespondHandshakePacket.h();
                if (RespondHandshakePacket.a() == null) {
                    RespondHandshakePacket.b(new ClientNetwork.Companion[2]);
                }
                char[] cArray3 = "Sp TyA\u001d".toCharArray();
                int n5 = cArray3.length;
                n4 = 0;
                n3 = 87;
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
                            n9 = 100;
                            break;
                        }
                        case 1: {
                            n9 = 84;
                            break;
                        }
                        case 2: {
                            n9 = 86;
                            break;
                        }
                        case 3: {
                            n9 = 63;
                            break;
                        }
                        case 4: {
                            n9 = 15;
                            break;
                        }
                        case 5: {
                            n9 = 57;
                            break;
                        }
                        default: {
                            n9 = 32;
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
                n4 = 15;
                break;
            }
            case 1: {
                n4 = 43;
                break;
            }
            case 2: {
                n4 = 62;
                break;
            }
            case 3: {
                n4 = 51;
                break;
            }
            case 4: {
                n4 = 53;
                break;
            }
            case 5: {
                n4 = 35;
                break;
            }
            case 6: {
                n4 = 7;
                break;
            }
            case 7: {
                n4 = 13;
                break;
            }
            case 8: {
                n4 = 49;
                break;
            }
            case 9: {
                n4 = 30;
                break;
            }
            case 10: {
                n4 = 39;
                break;
            }
            case 11: {
                n4 = 58;
                break;
            }
            case 12: {
                n4 = 45;
                break;
            }
            case 13: {
                n4 = 9;
                break;
            }
            case 14: {
                n4 = 37;
                break;
            }
            case 15: {
                n4 = 38;
                break;
            }
            case 16: {
                n4 = 27;
                break;
            }
            case 17: {
                n4 = 8;
                break;
            }
            case 18: {
                n4 = 5;
                break;
            }
            case 19: {
                n4 = 17;
                break;
            }
            case 20: {
                n4 = 23;
                break;
            }
            case 21: {
                n4 = 1;
                break;
            }
            case 22: {
                n4 = 41;
                break;
            }
            case 23: {
                n4 = 56;
                break;
            }
            case 24: {
                n4 = 26;
                break;
            }
            case 25: {
                n4 = 57;
                break;
            }
            case 26: {
                n4 = 63;
                break;
            }
            case 27: {
                n4 = 47;
                break;
            }
            case 28: {
                n4 = 59;
                break;
            }
            case 29: {
                n4 = 10;
                break;
            }
            case 30: {
                n4 = 0;
                break;
            }
            case 31: {
                n4 = 50;
                break;
            }
            case 32: {
                n4 = 18;
                break;
            }
            case 33: {
                n4 = 2;
                break;
            }
            case 34: {
                n4 = 42;
                break;
            }
            case 35: {
                n4 = 12;
                break;
            }
            case 36: {
                n4 = 54;
                break;
            }
            case 37: {
                n4 = 31;
                break;
            }
            case 38: {
                n4 = 16;
                break;
            }
            case 39: {
                n4 = 4;
                break;
            }
            case 40: {
                n4 = 60;
                break;
            }
            case 41: {
                n4 = 14;
                break;
            }
            case 42: {
                n4 = 61;
                break;
            }
            case 43: {
                n4 = 44;
                break;
            }
            case 44: {
                n4 = 34;
                break;
            }
            case 45: {
                n4 = 24;
                break;
            }
            case 46: {
                n4 = 25;
                break;
            }
            case 47: {
                n4 = 32;
                break;
            }
            case 48: {
                n4 = 22;
                break;
            }
            case 49: {
                n4 = 40;
                break;
            }
            case 50: {
                n4 = 29;
                break;
            }
            case 51: {
                n4 = 28;
                break;
            }
            case 52: {
                n4 = 21;
                break;
            }
            case 53: {
                n4 = 33;
                break;
            }
            case 54: {
                n4 = 3;
                break;
            }
            case 55: {
                n4 = 36;
                break;
            }
            case 56: {
                n4 = 19;
                break;
            }
            case 57: {
                n4 = 52;
                break;
            }
            case 58: {
                n4 = 55;
                break;
            }
            case 59: {
                n4 = 20;
                break;
            }
            case 60: {
                n4 = 46;
                break;
            }
            case 61: {
                n4 = 6;
                break;
            }
            case 62: {
                n4 = 48;
                break;
            }
            default: {
                n4 = 11;
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
        RespondHandshakePacket.k[n5] = new String(cArray);
        return n5;
    }

    private static void h() {
        Object[] objectArray = j;
        j[0] = "e\n\u001aj 9 \u000f\u0018kg>`\u0011\u000bt'6bK'h=%g\u000b\u001do*$";
        objectArray[1] = "^\u0004\\5hFU\u000bMz\tH^\u0000I ";
        objectArray[2] = "%v\n!\u001cm.y\u001bnau=~\u0012'";
        objectArray[3] = Void.TYPE;
        RespondHandshakePacket.k[3] = "java/lang/Void";
        objectArray[4] = ".\u0006^}WT9\u0001\u0003}\\V9GV+UD=\u001dZ<XRc#d\u0007uS(\bG:YO\b\u0011P6FU$\u0006]w\u0007";
        objectArray[5] = Integer.TYPE;
        RespondHandshakePacket.k[5] = "java/lang/Integer";
        objectArray[6] = ",4\u0015%\u007f,>7\u0004<(k*8_4tm,4\u0012+j,(:\u0012/cvv\t\u00147vm6?9%hf+3\u0010/cR98\u001a!r";
        objectArray[7] = "<\u001ctM[MgJppVLkF)(TVoH'\fPVGV\f\u0017Aj{I.p\u0004\u0013oV;\rBB8MJIBNiLw\u0019BFv-p\u0015QF~P'\u0015_\u001c\u0006";
        objectArray[8] = "M(drF/\u0010&}q{&\n,lh\u0000\u0002\u00179v\u0014@/\r;\u007fk\u0004=\f;\u0016/\t&\b,ik\u001b'\bE/k\u00192\u0017x\u007fk\u0011-v|iv\u0014<K,i~\u000b]";
        Object[] objectArray2 = objectArray;
        objectArray[9] = "A&#~{'\u0016)-#\u0010\u007f\u0010:S~o~\u0012*n.ov\r";
    }

    private static Class f(long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = RespondHandshakePacket.e(l2);
            object = j[n2];
            try {
                if (!(object instanceof String)) break block2;
                RespondHandshakePacket.j[n2] = clazz = Class.forName(k[n2]);
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
        Field field = RespondHandshakePacket.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i2 = 0; i2 < classArray.length; ++i2) {
                field = RespondHandshakePacket.d(classArray[i2], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field g(long l2) {
        int n2 = RespondHandshakePacket.e(l2);
        Object object = j[n2];
        if (object instanceof String) {
            String string = k[n2];
            int n3 = string.indexOf(8);
            Class clazz = RespondHandshakePacket.f(Long.parseLong(string.substring(0, n3), 36));
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = RespondHandshakePacket.f(Long.parseLong(string.substring(++n4), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = RespondHandshakePacket.c(clazz3, string2, clazz2)) != null) {
                    RespondHandshakePacket.j[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i2 = 0; i2 < classArray.length; ++i2) {
                        field = RespondHandshakePacket.d(classArray[i2], string2, clazz2);
                        if (field == null) continue;
                        RespondHandshakePacket.j[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = RespondHandshakePacket.f(122154425318105L);
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
        Method method = RespondHandshakePacket.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i2 = 0; i2 < classArray2.length; ++i2) {
                method = RespondHandshakePacket.d(classArray2[i2], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method h(long l2) {
        int n2 = RespondHandshakePacket.e(l2);
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
                clazz3 = RespondHandshakePacket.f(Long.parseLong(string2.substring(0, n4), 36));
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
                    clazz2 = RespondHandshakePacket.f(Long.parseLong(string2.substring(n7, n8), 36));
                    if (i2 < n3) {
                        classArray2[i2] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = RespondHandshakePacket.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        RespondHandshakePacket.j[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = RespondHandshakePacket.f(122154425318105L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i3 = 0; i3 < classArray.length; ++i3) {
                        Method method = RespondHandshakePacket.d(classArray[i3], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        RespondHandshakePacket.j[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = RespondHandshakePacket.f(122154425318105L);
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
            if (c2 == '\u00e1' || c2 == 'B' || c2 == '\u00eb' || c2 == 't') {
                field = RespondHandshakePacket.g(l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c2 == '\u00e1' ? lookup.findGetter(clazz, string2, clazz2) : (c2 == 'B' ? lookup.findSetter(clazz, string2, clazz2) : (c2 == '\u00eb' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = RespondHandshakePacket.h(l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c2 == '\u00e0' ? lookup.findVirtual(clazz, string3, methodType2) : (c2 == '\u00b5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = RespondHandshakePacket.b(lookup, mutableCallSite, string, methodType, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("today/flux/irc/protocol/packet/RespondHandshakePacket" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(RespondHandshakePacket.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

