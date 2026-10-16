import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class qpg extends __a implements n6g {
   private static final long d;
   private static final String t;

   public qpg(OpaquePredicate var1) {
      super(var1);
      this.yxc(0.7F, 1.9F);
      ((zvv)this.zq2()).uuq(true);
      this.r1d.tn8(1, new wkr(this, 1.25, 20, 10.0F));
      this.r1d.tn8(2, new _tb(this, 1.0));
      this.r1d.tn8(3, new bdq(this, ha9.class, 6.0F));
      this.r1d.tn8(4, new ov6(this));
      this.g9o.tn8(1, new s24(this, yqv.class, 10, true, false, uv0.bja));
   }

   @Override
   public void nyy() {
      super.nyy();
      this.dgt(m6d.t9k).zf7(4.0);
      this.dgt(m6d.w7i).zf7(0.2F);
   }

   @Override
   public void e_a() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 1
      // 004: aload 0
      // 005: invokespecial __a.e_a ()V
      // 008: aload 0
      // 009: getfield qpg.oay Lt9d;
      // 00c: getfield OpaquePredicate.v0f Z
      // 00f: iload 1
      // 010: ifeq 02b
      // 013: ifne 17f
      // 016: goto 01d
      // 019: invokestatic qpg.a (Loov;)Loov;
      // 01c: athrow
      // 01d: aload 0
      // 01e: getfield qpg.o2v D
      // 021: invokestatic fe6.jqf (D)I
      // 024: goto 02b
      // 027: invokestatic qpg.a (Loov;)Loov;
      // 02a: athrow
      // 02b: istore 2
      // 02c: aload 0
      // 02d: getfield qpg.kfp D
      // 030: invokestatic fe6.jqf (D)I
      // 033: istore 3
      // 034: aload 0
      // 035: getfield qpg.vbd D
      // 038: invokestatic fe6.jqf (D)I
      // 03b: istore 4
      // 03d: aload 0
      // 03e: invokevirtual qpg.n08 ()Z
      // 041: iload 1
      // 042: ifeq 081
      // 045: ifeq 05f
      // 048: goto 04f
      // 04b: invokestatic qpg.a (Loov;)Loov;
      // 04e: athrow
      // 04f: aload 0
      // 050: getstatic ofh.e7v Lofh;
      // 053: fconst_1
      // 054: invokevirtual qpg.m1t (Lofh;F)Z
      // 057: pop
      // 058: goto 05f
      // 05b: invokestatic qpg.a (Loov;)Loov;
      // 05e: athrow
      // 05f: aload 0
      // 060: getfield qpg.oay Lt9d;
      // 063: new mew
      // 066: dup
      // 067: iload 2
      // 068: bipush 0
      // 069: iload 4
      // 06b: invokespecial mew.<init> (III)V
      // 06e: invokevirtual OpaquePredicate.getBiomeGenForCoords (Lmew;)Lgyu;
      // 071: new mew
      // 074: dup
      // 075: iload 2
      // 076: iload 3
      // 077: iload 4
      // 079: invokespecial mew.<init> (III)V
      // 07c: invokevirtual gyu.qa6 (Lmew;)F
      // 07f: fconst_1
      // 080: fcmpl
      // 081: iload 1
      // 082: ifeq 0a0
      // 085: ifle 09f
      // 088: goto 08f
      // 08b: invokestatic qpg.a (Loov;)Loov;
      // 08e: athrow
      // 08f: aload 0
      // 090: getstatic ofh.rpg Lofh;
      // 093: fconst_1
      // 094: invokevirtual qpg.m1t (Lofh;F)Z
      // 097: pop
      // 098: goto 09f
      // 09b: invokestatic qpg.a (Loov;)Loov;
      // 09e: athrow
      // 09f: bipush 0
      // 0a0: istore 5
      // 0a2: iload 5
      // 0a4: bipush 4
      // 0a5: if_icmpge 17f
      // 0a8: aload 0
      // 0a9: getfield qpg.o2v D
      // 0ac: iload 5
      // 0ae: bipush 2
      // 0af: irem
      // 0b0: bipush 2
      // 0b1: imul
      // 0b2: bipush 1
      // 0b3: isub
      // 0b4: i2f
      // 0b5: ldc 0.25
      // 0b7: nop
      // 0b8: fmul
      // 0b9: f2d
      // 0ba: dadd
      // 0bb: invokestatic fe6.jqf (D)I
      // 0be: istore 2
      // 0bf: aload 0
      // 0c0: getfield qpg.kfp D
      // 0c3: invokestatic fe6.jqf (D)I
      // 0c6: istore 3
      // 0c7: aload 0
      // 0c8: getfield qpg.vbd D
      // 0cb: iload 5
      // 0cd: bipush 2
      // 0ce: idiv
      // 0cf: bipush 2
      // 0d0: irem
      // 0d1: bipush 2
      // 0d2: imul
      // 0d3: bipush 1
      // 0d4: isub
      // 0d5: i2f
      // 0d6: ldc 0.25
      // 0d8: nop
      // 0d9: fmul
      // 0da: f2d
      // 0db: dadd
      // 0dc: invokestatic fe6.jqf (D)I
      // 0df: istore 4
      // 0e1: new mew
      // 0e4: dup
      // 0e5: iload 2
      // 0e6: iload 3
      // 0e7: iload 4
      // 0e9: invokespecial mew.<init> (III)V
      // 0ec: astore 6
      // 0ee: iload 1
      // 0ef: ifeq 17b
      // 0f2: aload 0
      // 0f3: getfield qpg.oay Lt9d;
      // 0f6: aload 6
      // 0f8: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 0fb: invokeinterface zfz.r_y ()Le0x; 1
      // 100: invokevirtual e0x.p1r ()Lp3y;
      // 103: getstatic p3y.cei Lp3y;
      // 106: if_acmpne 178
      // 109: goto 110
      // 10c: invokestatic qpg.a (Loov;)Loov;
      // 10f: athrow
      // 110: aload 0
      // 111: getfield qpg.oay Lt9d;
      // 114: new mew
      // 117: dup
      // 118: iload 2
      // 119: bipush 0
      // 11a: iload 4
      // 11c: invokespecial mew.<init> (III)V
      // 11f: invokevirtual OpaquePredicate.getBiomeGenForCoords (Lmew;)Lgyu;
      // 122: aload 6
      // 124: invokevirtual gyu.qa6 (Lmew;)F
      // 127: ldc 0.8
      // 129: nop
      // 12a: fcmpg
      // 12b: iload 1
      // 12c: ifeq 153
      // 12f: goto 136
      // 132: invokestatic qpg.a (Loov;)Loov;
      // 135: athrow
      // 136: ifge 178
      // 139: goto 140
      // 13c: invokestatic qpg.a (Loov;)Loov;
      // 13f: athrow
      // 140: getstatic ox_.dxo Le0x;
      // 143: aload 0
      // 144: getfield qpg.oay Lt9d;
      // 147: aload 6
      // 149: invokevirtual e0x.ctq (Lt9d;Lmew;)Z
      // 14c: goto 153
      // 14f: invokestatic qpg.a (Loov;)Loov;
      // 152: athrow
      // 153: iload 1
      // 154: ifeq 177
      // 157: ifeq 178
      // 15a: goto 161
      // 15d: invokestatic qpg.a (Loov;)Loov;
      // 160: athrow
      // 161: aload 0
      // 162: getfield qpg.oay Lt9d;
      // 165: aload 6
      // 167: getstatic ox_.dxo Le0x;
      // 16a: invokevirtual e0x.l4i ()Lzfz;
      // 16d: invokevirtual OpaquePredicate.gfy (Lmew;Lzfz;)Z
      // 170: goto 177
      // 173: invokestatic qpg.a (Loov;)Loov;
      // 176: athrow
      // 177: pop
      // 178: iinc 5 1
      // 17b: iload 1
      // 17c: ifne 0a2
      // 17f: return
   }

   @Override
   public u7m q4n() {
      return xbr.db4;
   }

   @Override
   public void ir3(boolean var1, int var2) {
      int var4 = this.z2d.nextInt(16);
      int var10000 = OpaquePredicate.b();
      int var5 = 0;
      int var3 = var10000;

      while (var5 < var4) {
         this.e70(xbr.db4, 1);
         var5++;
         if (var3 == 0) {
            break;
         }
      }
   }

   @Override
   public void mx4(Entity var1, float var2) {
      long var3 = d ^ 40722715400329L;
      txr var5 = new txr(this.oay, this);
      double var6 = var1.kfp + (double)var1.c5y() - 1.1F;
      double var8 = var1.o2v - this.o2v;
      double var10 = var6 - var5.kfp;
      double var12 = var1.vbd - this.vbd;
      float var14 = fe6.dii(var8 * var8 + var12 * var12) * 0.2F;
      var5.bob(var8, var10 + (double)var14, var12, 1.6F, 12.0F);
      this.lhu(t, 1.0F, 1.0F / (this.mbr().nextFloat() * 0.4F + 0.8F));
      this.oay.xzq(var5);
   }

   @Override
   public float c5y() {
      return 1.7F;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(4275289373801318151L, 6339066062070370345L, MethodHandles.lookup().lookupClass()).a(202661311602281L);
      // $VF: monitorexit
      d = var10000;
      long var0 = d ^ 69510095291450L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("ª\u001aZ]1.@y\u0014\u00834ò©n¦4".getBytes("ISO-8859-1"));
      String var6 = f(var4).intern();
      byte var10001 = -1;
      t = var6;
   }

   private static oov a(oov var0) {
      return var0;
   }

   private static String f(byte[] var0) {
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
