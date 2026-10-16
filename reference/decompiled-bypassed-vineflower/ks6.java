import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ks6 implements dxd$v9l {
   private final s9r rea;
   public final c05 dbm;
   public final b1f$pll f74;
   private long y5f = 0L;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public ks6(s9r var1, b1f$pll var2) {
      this.rea = var1;
      this.f74 = var2;
      this.dbm = c05.vz1();
   }

   @Override
   public void is9(int param1, int param2, int param3, int param4, int param5, int param6, int param7, boolean param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic ks6.a J
      // 03: ldc2_w 10961492483527
      // 06: lxor
      // 07: lstore 9
      // 09: aload 0
      // 0a: getfield ks6.dbm Lc05;
      // 0d: getfield c05.tx1 Lowt;
      // 10: sipush 14532
      // 13: ldc2_w 2277308602682892781
      // 16: lload 9
      // 18: lxor
      // 19: invokedynamic s (IJ)Ljava/lang/String; bsm=ks6.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e: nop
      // 1f: bipush 0
      // 20: anewarray 16
      // 23: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 26: iload 2
      // 27: bipush 32
      // 29: iadd
      // 2a: bipush 3
      // 2b: iadd
      // 2c: i2f
      // 2d: iload 3
      // 2e: bipush 1
      // 2f: iadd
      // 30: i2f
      // 31: ldc 16777215
      // 33: nop
      // 34: invokevirtual owt.eh6 (Ljava/lang/String;FFI)I
      // 37: pop
      // 38: invokestatic t9d.b ()I
      // 3b: aload 0
      // 3c: getfield ks6.dbm Lc05;
      // 3f: getfield c05.tx1 Lowt;
      // 42: aload 0
      // 43: getfield ks6.f74 Lb1f$pll;
      // 46: invokevirtual b1f$pll.dz2 ()Ljava/lang/String;
      // 49: iload 2
      // 4a: bipush 32
      // 4c: iadd
      // 4d: bipush 3
      // 4e: iadd
      // 4f: i2f
      // 50: iload 3
      // 51: bipush 12
      // 53: iadd
      // 54: i2f
      // 55: ldc 8421504
      // 57: nop
      // 58: invokevirtual owt.eh6 (Ljava/lang/String;FFI)I
      // 5b: pop
      // 5c: istore 11
      // 5e: aload 0
      // 5f: getfield ks6.dbm Lc05;
      // 62: getfield c05.oxn Lmoh;
      // 65: getfield moh._qi Z
      // 68: iload 11
      // 6a: ifeq e0
      // 6d: ifeq b6
      // 70: goto 77
      // 73: invokestatic ks6.a (Loov;)Loov;
      // 76: athrow
      // 77: aload 0
      // 78: getfield ks6.dbm Lc05;
      // 7b: getfield c05.tx1 Lowt;
      // 7e: sipush 14886
      // 81: ldc2_w 8541870917191361294
      // 84: lload 9
      // 86: lxor
      // 87: invokedynamic s (IJ)Ljava/lang/String; bsm=ks6.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8c: nop
      // 8d: bipush 0
      // 8e: anewarray 16
      // 91: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 94: iload 2
      // 95: bipush 32
      // 97: iadd
      // 98: bipush 3
      // 99: iadd
      // 9a: i2f
      // 9b: iload 3
      // 9c: bipush 12
      // 9e: iadd
      // 9f: bipush 11
      // a1: iadd
      // a2: i2f
      // a3: ldc 3158064
      // a5: nop
      // a6: invokevirtual owt.eh6 (Ljava/lang/String;FFI)I
      // a9: pop
      // aa: iload 11
      // ac: ifne e1
      // af: goto b6
      // b2: invokestatic ks6.a (Loov;)Loov;
      // b5: athrow
      // b6: aload 0
      // b7: getfield ks6.dbm Lc05;
      // ba: getfield c05.tx1 Lowt;
      // bd: aload 0
      // be: getfield ks6.f74 Lb1f$pll;
      // c1: invokevirtual b1f$pll.tqj ()Ljava/lang/String;
      // c4: iload 2
      // c5: bipush 32
      // c7: iadd
      // c8: bipush 3
      // c9: iadd
      // ca: i2f
      // cb: iload 3
      // cc: bipush 12
      // ce: iadd
      // cf: bipush 11
      // d1: iadd
      // d2: i2f
      // d3: ldc 3158064
      // d5: nop
      // d6: invokevirtual owt.eh6 (Ljava/lang/String;FFI)I
      // d9: goto e0
      // dc: invokestatic ks6.a (Loov;)Loov;
      // df: athrow
      // e0: pop
      // e1: return
   }

   @Override
   public boolean r6b(int param1, int param2, int param3, int param4, int param5, int param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 7
      // 05: aload 0
      // 06: getfield ks6.rea Ls9r;
      // 09: iload 1
      // 0a: invokevirtual s9r.gzd (I)V
      // 0d: invokestatic c05.qgs ()J
      // 10: aload 0
      // 11: getfield ks6.y5f J
      // 14: lsub
      // 15: ldc2_w 250
      // 18: lcmp
      // 19: iload 7
      // 1b: ifne 3e
      // 1e: ifge 36
      // 21: goto 28
      // 24: invokestatic ks6.a (Loov;)Loov;
      // 27: athrow
      // 28: aload 0
      // 29: getfield ks6.rea Ls9r;
      // 2c: invokevirtual s9r.s5e ()V
      // 2f: goto 36
      // 32: invokestatic ks6.a (Loov;)Loov;
      // 35: athrow
      // 36: aload 0
      // 37: invokestatic c05.qgs ()J
      // 3a: putfield ks6.y5f J
      // 3d: bipush 0
      // 3e: ireturn
   }

   @Override
   public void _at(int var1, int var2, int var3) {
   }

   @Override
   public void l_a(int var1, int var2, int var3, int var4, int var5, int var6) {
   }

   public b1f$pll up6() {
      return this.f74;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7538238072283575799L, 5674709125307755546L, MethodHandles.lookup().lookupClass()).a(53119969619417L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 4583508159246L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[2];
      int var7 = 0;
      String var6 = "H -V¯h Ú/\u0000HÝ\u0006Âõ\u001e_{P?\u0007>ªÎ8qF««óñÅÎl\u0001\u00140$Uqj\u0017þ[´J¥9\u0089[ÑÁÓ¡y!Ä,|\u009e\u0097/ïÈL0\tµc\u0018\u0092Ü\f[á{bXüÍ¾";
      int var8 = "H -V¯h Ú/\u0000HÝ\u0006Âõ\u001e_{P?\u0007>ªÎ8qF««óñÅÎl\u0001\u00140$Uqj\u0017þ[´J¥9\u0089[ÑÁÓ¡y!Ä,|\u009e\u0097/ïÈL0\tµc\u0018\u0092Ü\f[á{bXüÍ¾"
         .length();
      char var5 = 24;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 2927;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("ks6", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("ks6" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
