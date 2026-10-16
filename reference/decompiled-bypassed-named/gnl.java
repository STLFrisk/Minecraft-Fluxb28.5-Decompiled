import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.optifine.reflect.ReflectorClass;
import net.optifine.reflect.ReflectorField;
import net.optifine.shaders.SVertexFormat;

public class gnl {
   public static be7 n6w;
   public static be7 jur;
   private static final be7 n6r;
   private static final be7 i0h;
   public static ReflectorClass _w9;
   public static ReflectorField bxa;
   private static final be7 ocp;
   public static final be7 q0i;
   public static final be7 aaz;
   public static final be7 gx3;
   public static final be7 gec;
   public static final be7 _r5;
   public static final be7 _zt;
   public static final be7 rad;
   public static final be7 c03;
   public static final be7 ch5;
   public static final be7 vql;
   public static final n0i rb9;
   public static final n0i ohw;
   public static final n0i uf0;
   public static final n0i jbs;
   public static final n0i la9;
   public static final n0i h9e;

   public static void oop() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 0
      // 04: invokestatic hxt.ly3 ()Z
      // 07: iload 0
      // 08: ifne 77
      // 0b: ifeq 53
      // 0e: goto 15
      // 11: invokestatic gnl.a (Loov;)Loov;
      // 14: athrow
      // 15: invokestatic net/optifine/shaders/SVertexFormat.makeDefVertexFormatBlock ()Lbe7;
      // 18: putstatic gnl.n6w Lbe7;
      // 1b: invokestatic net/optifine/shaders/SVertexFormat.makeDefVertexFormatItem ()Lbe7;
      // 1e: putstatic gnl.jur Lbe7;
      // 21: getstatic gnl.bxa Lnet/optifine/reflect/ReflectorField;
      // 24: iload 0
      // 25: ifne 49
      // 28: goto 2f
      // 2b: invokestatic gnl.a (Loov;)Loov;
      // 2e: athrow
      // 2f: invokevirtual net/optifine/reflect/ReflectorField.exists ()Z
      // 32: ifeq 89
      // 35: goto 3c
      // 38: invokestatic gnl.a (Loov;)Loov;
      // 3b: athrow
      // 3c: getstatic gnl.bxa Lnet/optifine/reflect/ReflectorField;
      // 3f: invokevirtual net/optifine/reflect/ReflectorField.getValue ()Ljava/lang/Object;
      // 42: goto 49
      // 45: invokestatic gnl.a (Loov;)Loov;
      // 48: athrow
      // 49: checkcast be7
      // 4c: invokestatic net/optifine/shaders/SVertexFormat.setDefBakedFormat (Lbe7;)V
      // 4f: iload 0
      // 50: ifeq 89
      // 53: getstatic gnl.n6r Lbe7;
      // 56: putstatic gnl.n6w Lbe7;
      // 59: getstatic gnl.i0h Lbe7;
      // 5c: iload 0
      // 5d: ifne 7d
      // 60: goto 67
      // 63: invokestatic gnl.a (Loov;)Loov;
      // 66: athrow
      // 67: putstatic gnl.jur Lbe7;
      // 6a: getstatic gnl.bxa Lnet/optifine/reflect/ReflectorField;
      // 6d: invokevirtual net/optifine/reflect/ReflectorField.exists ()Z
      // 70: goto 77
      // 73: invokestatic gnl.a (Loov;)Loov;
      // 76: athrow
      // 77: ifeq 89
      // 7a: getstatic gnl.ocp Lbe7;
      // 7d: getstatic gnl.bxa Lnet/optifine/reflect/ReflectorField;
      // 80: invokevirtual net/optifine/reflect/ReflectorField.getValue ()Ljava/lang/Object;
      // 83: checkcast be7
      // 86: invokestatic net/optifine/shaders/SVertexFormat.copy (Lbe7;Lbe7;)V
      // 89: return
   }

   public static Object t2u(ReflectorField var0) {
      try {
         Field var1 = var0.getTargetField();
         return var1 == null ? null : var1.get(null);
      } catch (Throwable var3) {
         var3.printStackTrace();
         return null;
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8691612808529339892L, -2984580898874547181L, MethodHandles.lookup().lookupClass()).a(256876812365704L);
      // $VF: monitorexit
      long var10 = var10000 ^ 95033954641003L;
      Cipher var1;
      Cipher var13 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[2];
      int var6 = 0;
      String var5 = "R«þ8\u0012F\u00002\u008fç\u0095û\u0089Û3\u0012\u008aÄ\u001eQ8¹À00æØ=u\u009b\u009e!A\"ZÑ \u00ad\u001eBõy\u0010*\u0007\u0013Ö\u0092\u0018\u0098§TSëo\u0097\tùôCØ~í\u0088o©Bp:©\u0080Ü\u0091";
      int var7 = "R«þ8\u0012F\u00002\u008fç\u0095û\u0089Û3\u0012\u008aÄ\u001eQ8¹À00æØ=u\u009b\u009e!A\"ZÑ \u00ad\u001eBõy\u0010*\u0007\u0013Ö\u0092\u0018\u0098§TSëo\u0097\tùôCØ~í\u0088o©Bp:©\u0080Ü\u0091"
         .length();
      char var4 = 24;
      int var3 = -1;

      while (true) {
         byte[] var9 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var15 = a(var9).intern();
         byte var10001 = -1;
         var8[var6++] = var15;
         if ((var3 += var4) >= var7) {
            n6w = new be7();
            jur = new be7();
            n6r = n6w;
            i0h = jur;
            _w9 = new ReflectorClass(var8[1]);
            bxa = new ReflectorField(_w9, var8[0]);
            ocp = SVertexFormat.duplicate((be7)t2u(bxa));
            q0i = new be7();
            aaz = new be7();
            gx3 = new be7();
            gec = new be7();
            _r5 = new be7();
            _zt = new be7();
            rad = new be7();
            c03 = new be7();
            ch5 = new be7();
            vql = new be7();
            rb9 = new n0i(0, n0i$p_w.hz0, n0i$pto.rrf, 3);
            ohw = new n0i(0, n0i$p_w._pa, n0i$pto.ltr, 4);
            uf0 = new n0i(0, n0i$p_w.hz0, n0i$pto.yu9, 2);
            jbs = new n0i(1, n0i$p_w.buq, n0i$pto.yu9, 2);
            la9 = new n0i(0, n0i$p_w.hih, n0i$pto.h1m, 3);
            h9e = new n0i(0, n0i$p_w.hih, n0i$pto.ci3, 1);
            n6w.cmt(rb9);
            n6w.cmt(ohw);
            n6w.cmt(uf0);
            n6w.cmt(jbs);
            jur.cmt(rb9);
            jur.cmt(ohw);
            jur.cmt(uf0);
            jur.cmt(la9);
            jur.cmt(h9e);
            q0i.cmt(rb9);
            q0i.cmt(uf0);
            q0i.cmt(la9);
            q0i.cmt(h9e);
            aaz.cmt(rb9);
            aaz.cmt(uf0);
            aaz.cmt(ohw);
            aaz.cmt(jbs);
            gx3.cmt(rb9);
            gec.cmt(rb9);
            gec.cmt(ohw);
            _r5.cmt(rb9);
            _r5.cmt(uf0);
            _zt.cmt(rb9);
            _zt.cmt(la9);
            _zt.cmt(h9e);
            rad.cmt(rb9);
            rad.cmt(uf0);
            rad.cmt(ohw);
            c03.cmt(rb9);
            c03.cmt(uf0);
            c03.cmt(la9);
            c03.cmt(h9e);
            ch5.cmt(rb9);
            ch5.cmt(uf0);
            ch5.cmt(jbs);
            ch5.cmt(ohw);
            vql.cmt(rb9);
            vql.cmt(uf0);
            vql.cmt(ohw);
            vql.cmt(la9);
            vql.cmt(h9e);
            return;
         }

         var4 = var5.charAt(var3);
      }
   }

   private static oov a(oov var0) {
      return var0;
   }

   private static String a(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for (int var4 = 0; var4 < var2; var4++) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else if (var5 < 224) {
            char var6 = (char)((char)(var5 & 31) << 6);
            byte var8 = var0[++var4];
            var6 = (char)(var6 | (char)(var8 & 63));
            var3[var1++] = var6;
         } else if (var4 < var2 - 2) {
            char var12 = (char)((char)(var5 & 15) << '\f');
            byte var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63) << 6);
            var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63));
            var3[var1++] = var12;
         }
      }

      return new String(var3, 0, var1);
   }
}
