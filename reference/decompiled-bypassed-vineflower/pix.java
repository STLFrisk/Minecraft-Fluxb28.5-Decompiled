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

public class pix extends i2h {
   public int j_a;
   private static final long b;
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public pix(t9d var1) {
      super(var1);
      this.gz8 = true;
      this.yxc(0.98F, 0.98F);
   }

   public pix(t9d var1, double var2, double var4, double var6, g_3 var8) {
      this(var1);
      this.m6_(var2, var4, var6);
      float var9 = (float)(Math.random() * Math.PI * 2.0);
      this.icv = (double)(-((float)Math.sin((double)var9)) * 0.02F);
      this.mop = 0.2F;
      this.bw4 = (double)(-((float)Math.cos((double)var9)) * 0.02F);
      this.j_a = 80;
      this.bc1 = var2;
      this.o_z = var4;
      this.a4d = var6;
      this.zd3 = var8;
   }

   @Override
   public void tbj() {
   }

   @Override
   public boolean _p9() {
      return false;
   }

   @Override
   public boolean mzu() {
      int var1 = t9d.b();

      try {
         if (var1 == 0) {
            return this.ma9;
         }

         if (!this.ma9) {
            return true;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return false;
   }

   @Override
   public void xx_() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: aload 0
      // 002: getfield pix.o2v D
      // 005: putfield pix.bc1 D
      // 008: aload 0
      // 009: aload 0
      // 00a: getfield pix.kfp D
      // 00d: putfield pix.o_z D
      // 010: invokestatic t9d.b ()I
      // 013: aload 0
      // 014: aload 0
      // 015: getfield pix.vbd D
      // 018: putfield pix.a4d D
      // 01b: istore 1
      // 01c: aload 0
      // 01d: dup
      // 01e: getfield pix.mop D
      // 021: ldc2_w 0.03999999910593033
      // 024: dsub
      // 025: putfield pix.mop D
      // 028: aload 0
      // 029: aload 0
      // 02a: getfield pix.icv D
      // 02d: aload 0
      // 02e: getfield pix.mop D
      // 031: aload 0
      // 032: getfield pix.bw4 D
      // 035: invokevirtual pix.vjj (DDD)V
      // 038: aload 0
      // 039: dup
      // 03a: getfield pix.icv D
      // 03d: ldc2_w 0.9800000190734863
      // 040: dmul
      // 041: putfield pix.icv D
      // 044: aload 0
      // 045: dup
      // 046: getfield pix.mop D
      // 049: ldc2_w 0.9800000190734863
      // 04c: dmul
      // 04d: putfield pix.mop D
      // 050: aload 0
      // 051: dup
      // 052: getfield pix.bw4 D
      // 055: ldc2_w 0.9800000190734863
      // 058: dmul
      // 059: putfield pix.bw4 D
      // 05c: aload 0
      // 05d: getfield pix.lfk Z
      // 060: iload 1
      // 061: ifeq 0a4
      // 064: ifeq 099
      // 067: goto 06e
      // 06a: invokestatic pix.a (Loov;)Loov;
      // 06d: athrow
      // 06e: aload 0
      // 06f: dup
      // 070: getfield pix.icv D
      // 073: ldc2_w 0.699999988079071
      // 076: dmul
      // 077: putfield pix.icv D
      // 07a: aload 0
      // 07b: dup
      // 07c: getfield pix.bw4 D
      // 07f: ldc2_w 0.699999988079071
      // 082: dmul
      // 083: putfield pix.bw4 D
      // 086: aload 0
      // 087: dup
      // 088: getfield pix.mop D
      // 08b: ldc2_w -0.5
      // 08e: dmul
      // 08f: putfield pix.mop D
      // 092: goto 099
      // 095: invokestatic pix.a (Loov;)Loov;
      // 098: athrow
      // 099: aload 0
      // 09a: dup
      // 09b: getfield pix.j_a I
      // 09e: dup_x1
      // 09f: bipush 1
      // 0a0: isub
      // 0a1: putfield pix.j_a I
      // 0a4: iload 1
      // 0a5: ifeq 0ec
      // 0a8: ifgt 0e1
      // 0ab: goto 0b2
      // 0ae: invokestatic pix.a (Loov;)Loov;
      // 0b1: athrow
      // 0b2: aload 0
      // 0b3: invokevirtual pix._kl ()V
      // 0b6: aload 0
      // 0b7: iload 1
      // 0b8: ifeq 0da
      // 0bb: goto 0c2
      // 0be: invokestatic pix.a (Loov;)Loov;
      // 0c1: athrow
      // 0c2: getfield pix.oay Lt9d;
      // 0c5: getfield t9d.v0f Z
      // 0c8: ifne 10d
      // 0cb: goto 0d2
      // 0ce: invokestatic pix.a (Loov;)Loov;
      // 0d1: athrow
      // 0d2: aload 0
      // 0d3: goto 0da
      // 0d6: invokestatic pix.a (Loov;)Loov;
      // 0d9: athrow
      // 0da: invokespecial pix.hsp ()V
      // 0dd: iload 1
      // 0de: ifne 10d
      // 0e1: aload 0
      // 0e2: invokevirtual pix.r24 ()Z
      // 0e5: goto 0ec
      // 0e8: invokestatic pix.a (Loov;)Loov;
      // 0eb: athrow
      // 0ec: pop
      // 0ed: aload 0
      // 0ee: getfield pix.oay Lt9d;
      // 0f1: getstatic w_0.bac Lw_0;
      // 0f4: aload 0
      // 0f5: getfield pix.o2v D
      // 0f8: aload 0
      // 0f9: getfield pix.kfp D
      // 0fc: ldc2_w 0.5
      // 0ff: dadd
      // 100: aload 0
      // 101: getfield pix.vbd D
      // 104: dconst_0
      // 105: dconst_0
      // 106: dconst_0
      // 107: bipush 0
      // 108: newarray 10
      // 10a: invokevirtual t9d.zvy (Lw_0;DDDDDD[I)V
      // 10d: return
   }

   private void hsp() {
      float var1 = 4.0F;
      this.oay.s1r(this, this.o2v, this.kfp + (double)(this.ikl / 16.0F), this.vbd, var1, true);
   }

   @Override
   public void srs(bdo var1) {
      long var2 = b ^ 20597788261568L;
      var1.atr(b<"j">(10159, 8629248033725558379L ^ var2), (byte)this.j_a);
   }

   @Override
   public void cjb(bdo var1) {
      long var2 = b ^ 110043748192363L;
      this.j_a = var1.r_t(b<"j">(29958, 2573908920799858792L ^ var2));
   }

   public g_3 qrq() {
      return this.zd3;
   }

   @Override
   public float c5y() {
      return 0.0F;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(8242349968941233770L, 7615801452057191742L, MethodHandles.lookup().lookupClass()).a(116128367928961L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 429700089095L;
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
      String var6 = "j]¥)\u0087¹<W'Ë·\u0095´Ê,Í\u0010\u0018\u001d`\u0003wÞÜ\u0080E½¡ñÛ\u008f¬÷";
      int var8 = "j]¥)\u0087¹<W'Ë·\u0095´Ê,Í\u0010\u0018\u001d`\u0003wÞÜ\u0080E½¡ñÛ\u008f¬÷".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = b(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            c = var9;
            d = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static oov a(oov var0) {
      return var0;
   }

   private static String b(byte[] var0) {
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 13737;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("pix", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
         d[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("pix" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
