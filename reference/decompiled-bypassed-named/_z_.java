import com.google.common.base.Predicate;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class _z_ extends cjm {
   private static final Logger dlm;
   private yqv mcs;
   private final Predicate a4r;
   private final s24$tx3 ds8;
   private Entity nj7;
   private Class tnr;
   private static final long a;
   private static final String b;

   public _z_(yqv param1, Class param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic _z_.a J
      // 03: ldc2_w 79244162684443
      // 06: lxor
      // 07: lstore 3
      // 08: aload 0
      // 09: invokespecial cjm.<init> ()V
      // 0c: invokestatic OpaquePredicate.b ()I
      // 0f: aload 0
      // 10: aload 1
      // 11: putfield _z_.mcs Lyqv;
      // 14: istore 5
      // 16: aload 0
      // 17: aload 2
      // 18: putfield _z_.tnr Ljava/lang/Class;
      // 1b: iload 5
      // 1d: ifeq 59
      // 20: aload 1
      // 21: instanceof EntityPlayer
      // 24: ifeq 41
      // 27: goto 2e
      // 2a: invokestatic _z_.a (Loov;)Loov;
      // 2d: athrow
      // 2e: getstatic _z_.dlm Lorg/apache/logging/log4j/Logger;
      // 31: getstatic _z_.b Ljava/lang/String;
      // 34: nop
      // 35: invokeinterface org/apache/logging/log4j/Logger.warn (Ljava/lang/String;)V 2
      // 3a: goto 41
      // 3d: invokestatic _z_.a (Loov;)Loov;
      // 40: athrow
      // 41: aload 0
      // 42: new _z_$1
      // 45: dup
      // 46: aload 0
      // 47: invokespecial _z_$1.<init> (L_z_;)V
      // 4a: putfield _z_.a4r Lcom/google/common/base/Predicate;
      // 4d: aload 0
      // 4e: new s24$tx3
      // 51: dup
      // 52: aload 1
      // 53: invokespecial s24$tx3.<init> (Li2h;)V
      // 56: putfield _z_.ds8 Ls24$tx3;
      // 59: return
   }

   @Override
   public boolean vle() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual _z_.f_m ()D
      // 04: dstore 2
      // 05: invokestatic OpaquePredicate.b ()I
      // 08: aload 0
      // 09: getfield _z_.mcs Lyqv;
      // 0c: getfield yqv.oay Lt9d;
      // 0f: aload 0
      // 10: getfield _z_.tnr Ljava/lang/Class;
      // 13: aload 0
      // 14: getfield _z_.mcs Lyqv;
      // 17: invokevirtual yqv.aaw ()Lnh4;
      // 1a: dload 2
      // 1b: ldc2_w 4.0
      // 1e: dload 2
      // 1f: invokevirtual nh4.c2h (DDD)Lnh4;
      // 22: aload 0
      // 23: getfield _z_.a4r Lcom/google/common/base/Predicate;
      // 26: invokevirtual OpaquePredicate.vie (Ljava/lang/Class;Lnh4;Lcom/google/common/base/Predicate;)Ljava/util/List;
      // 29: astore 4
      // 2b: istore 1
      // 2c: aload 4
      // 2e: aload 0
      // 2f: getfield _z_.ds8 Ls24$tx3;
      // 32: invokestatic java/util/Collections.sort (Ljava/util/List;Ljava/util/Comparator;)V
      // 35: aload 4
      // 37: invokeinterface java/util/List.isEmpty ()Z 1
      // 3c: iload 1
      // 3d: ifeq 60
      // 40: ifeq 50
      // 43: goto 4a
      // 46: invokestatic _z_.a (Loov;)Loov;
      // 49: athrow
      // 4a: bipush 0
      // 4b: ireturn
      // 4c: invokestatic _z_.a (Loov;)Loov;
      // 4f: athrow
      // 50: aload 0
      // 51: aload 4
      // 53: bipush 0
      // 54: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 59: checkcast Entity
      // 5c: putfield _z_.nj7 Lg_3;
      // 5f: bipush 1
      // 60: ireturn
   }

   @Override
   public boolean wh3() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield _z_.mcs Lyqv;
      // 08: invokevirtual yqv.q4v ()Lg_3;
      // 0b: astore 2
      // 0c: aload 2
      // 0d: iload 1
      // 0e: ifne 22
      // 11: ifnonnull 21
      // 14: goto 1b
      // 17: invokestatic _z_.a (Loov;)Loov;
      // 1a: athrow
      // 1b: bipush 0
      // 1c: ireturn
      // 1d: invokestatic _z_.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 2
      // 22: invokevirtual Entity.gzr ()Z
      // 25: iload 1
      // 26: ifne 34
      // 29: ifne 35
      // 2c: goto 33
      // 2f: invokestatic _z_.a (Loov;)Loov;
      // 32: athrow
      // 33: bipush 0
      // 34: ireturn
      // 35: aload 0
      // 36: invokevirtual _z_.f_m ()D
      // 39: dstore 3
      // 3a: aload 0
      // 3b: getfield _z_.mcs Lyqv;
      // 3e: aload 2
      // 3f: invokevirtual yqv.wxg (Li2h;)D
      // 42: dload 3
      // 43: dload 3
      // 44: dmul
      // 45: dcmpl
      // 46: iload 1
      // 47: ifne 60
      // 4a: ifle 5c
      // 4d: goto 54
      // 50: invokestatic _z_.a (Loov;)Loov;
      // 53: athrow
      // 54: bipush 0
      // 55: goto 92
      // 58: invokestatic _z_.a (Loov;)Loov;
      // 5b: athrow
      // 5c: aload 2
      // 5d: instanceof z96
      // 60: iload 1
      // 61: ifne 8e
      // 64: ifeq 8d
      // 67: goto 6e
      // 6a: invokestatic _z_.a (Loov;)Loov;
      // 6d: athrow
      // 6e: aload 2
      // 6f: checkcast z96
      // 72: getfield z96._am Lrsh;
      // 75: invokevirtual rsh.u7c ()Z
      // 78: iload 1
      // 79: ifne 8e
      // 7c: goto 83
      // 7f: invokestatic _z_.a (Loov;)Loov;
      // 82: athrow
      // 83: ifne 91
      // 86: goto 8d
      // 89: invokestatic _z_.a (Loov;)Loov;
      // 8c: athrow
      // 8d: bipush 1
      // 8e: goto 92
      // 91: bipush 0
      // 92: ireturn
   }

   @Override
   public void mnp() {
      this.mcs.ux8(this.nj7);
      super.mnp();
   }

   @Override
   public void zly() {
      this.mcs.ux8((Entity)null);
      super.mnp();
   }

   public double f_m() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield _z_.mcs Lyqv;
      // 08: getstatic m6d.wg4 Lw9p;
      // 0b: invokevirtual yqv.dgt (Lw9p;)L_4o;
      // 0e: astore 2
      // 0f: aload 2
      // 10: iload 1
      // 11: ifeq 29
      // 14: ifnonnull 28
      // 17: goto 1e
      // 1a: invokestatic _z_.a (Loov;)Loov;
      // 1d: athrow
      // 1e: ldc2_w 16.0
      // 21: goto 2e
      // 24: invokestatic _z_.a (Loov;)Loov;
      // 27: athrow
      // 28: aload 2
      // 29: invokeinterface _4o.nz5 ()D 1
      // 2e: dreturn
   }

   public static yqv g3s(_z_ var0) {
      return var0.mcs;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(6336870331157789699L, -8380893016918023416L, MethodHandles.lookup().lookupClass()).a(143299901190546L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 832316673797L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal(
         "ô¥$\u0001\u0018A²$7Ùõ³ø\u001f¨\u0096\u008cGü¿Z\u00199i¤3¼i\u00adE&qT±«\u0013ú$Î\u0099Ä\u0085&Ôó\u0006,6\u0013-J\fsRB³\"jÌy¸jXX"
            .getBytes("ISO-8859-1")
      );
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
      dlm = LogManager.getLogger();
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
