import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class i9k implements gnj {
   private static final long a;
   private static final String b;

   public i9k(hrb var1) {
      this.cq3 = var1;
   }

   public void xj8(x0l param1, float param2, float param3, float param4, float param5, float param6, float param7, float param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic i9k.a J
      // 003: ldc2_w 92456415706031
      // 006: lxor
      // 007: lstore 9
      // 009: invokestatic t9d.b ()I
      // 00c: istore 11
      // 00e: aload 1
      // 00f: invokevirtual x0l.noc ()Ljava/lang/String;
      // 012: getstatic i9k.b Ljava/lang/String;
      // 015: nop
      // 016: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 019: iload 11
      // 01b: ifeq 033
      // 01e: ifeq 112
      // 021: goto 028
      // 024: invokestatic i9k.a (Loov;)Loov;
      // 027: athrow
      // 028: aload 1
      // 029: invokevirtual x0l.t_p ()Z
      // 02c: goto 033
      // 02f: invokestatic i9k.a (Loov;)Loov;
      // 032: athrow
      // 033: iload 11
      // 035: ifeq 04d
      // 038: ifeq 112
      // 03b: goto 042
      // 03e: invokestatic i9k.a (Loov;)Loov;
      // 041: athrow
      // 042: aload 1
      // 043: invokevirtual x0l.h5u ()Z
      // 046: goto 04d
      // 049: invokestatic i9k.a (Loov;)Loov;
      // 04c: athrow
      // 04d: iload 11
      // 04f: ifeq 06f
      // 052: ifne 112
      // 055: goto 05c
      // 058: invokestatic i9k.a (Loov;)Loov;
      // 05b: athrow
      // 05c: aload 0
      // 05d: getfield i9k.cq3 Lhrb;
      // 060: aload 1
      // 061: invokevirtual x0l.q06 ()Lgdz;
      // 064: invokevirtual hrb.gu4 (Lgdz;)V
      // 067: bipush 0
      // 068: goto 06f
      // 06b: invokestatic i9k.a (Loov;)Loov;
      // 06e: athrow
      // 06f: istore 12
      // 071: iload 12
      // 073: bipush 2
      // 074: if_icmpge 112
      // 077: aload 1
      // 078: getfield x0l.p3h F
      // 07b: aload 1
      // 07c: getfield x0l.x5k F
      // 07f: aload 1
      // 080: getfield x0l.p3h F
      // 083: fsub
      // 084: fload 4
      // 086: fmul
      // 087: fadd
      // 088: aload 1
      // 089: getfield x0l.gsh F
      // 08c: aload 1
      // 08d: getfield x0l.ksw F
      // 090: aload 1
      // 091: getfield x0l.gsh F
      // 094: fsub
      // 095: fload 4
      // 097: fmul
      // 098: fadd
      // 099: fsub
      // 09a: fstore 13
      // 09c: aload 1
      // 09d: getfield x0l.j25 F
      // 0a0: aload 1
      // 0a1: getfield x0l.y2i F
      // 0a4: aload 1
      // 0a5: getfield x0l.j25 F
      // 0a8: fsub
      // 0a9: fload 4
      // 0ab: fmul
      // 0ac: fadd
      // 0ad: fstore 14
      // 0af: invokestatic hzu.dp2 ()V
      // 0b2: fload 13
      // 0b4: fconst_0
      // 0b5: fconst_1
      // 0b6: fconst_0
      // 0b7: invokestatic hzu.a2h (FFFF)V
      // 0ba: fload 14
      // 0bc: fconst_1
      // 0bd: fconst_0
      // 0be: fconst_0
      // 0bf: invokestatic hzu.a2h (FFFF)V
      // 0c2: ldc 0.375
      // 0c4: nop
      // 0c5: iload 12
      // 0c7: bipush 2
      // 0c8: imul
      // 0c9: bipush 1
      // 0ca: isub
      // 0cb: i2f
      // 0cc: fmul
      // 0cd: fconst_0
      // 0ce: fconst_0
      // 0cf: invokestatic hzu.a4k (FFF)V
      // 0d2: fconst_0
      // 0d3: ldc -0.375
      // 0d5: nop
      // 0d6: fconst_0
      // 0d7: invokestatic hzu.a4k (FFF)V
      // 0da: fload 14
      // 0dc: fneg
      // 0dd: fconst_1
      // 0de: fconst_0
      // 0df: fconst_0
      // 0e0: invokestatic hzu.a2h (FFFF)V
      // 0e3: fload 13
      // 0e5: fneg
      // 0e6: fconst_0
      // 0e7: fconst_1
      // 0e8: fconst_0
      // 0e9: invokestatic hzu.a2h (FFFF)V
      // 0ec: ldc 1.3333334
      // 0ee: nop
      // 0ef: fstore 15
      // 0f1: fload 15
      // 0f3: fload 15
      // 0f5: fload 15
      // 0f7: invokestatic hzu.syc (FFF)V
      // 0fa: aload 0
      // 0fb: getfield i9k.cq3 Lhrb;
      // 0fe: invokevirtual hrb.fy4 ()Let8;
      // 101: ldc 0.0625
      // 103: nop
      // 104: invokevirtual et8.unp (F)V
      // 107: invokestatic hzu.x3w ()V
      // 10a: iinc 12 1
      // 10d: iload 11
      // 10f: ifne 071
      // 112: return
   }

   @Override
   public boolean shouldCombineTextures() {
      return true;
   }

   @Override
   public void doRenderLayer(g_3 var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.xj8((x0l)var1, var2, var3, var4, var5, var6, var7, var8);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1651258796206523467L, -4286236606485206519L, MethodHandles.lookup().lookupClass()).a(216397922534078L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 118313240328851L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("û\u0091\u0084Ây\rl\u008aó=ëQ/=\u00890".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
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
