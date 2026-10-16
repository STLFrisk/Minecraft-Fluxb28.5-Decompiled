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

public class flo extends EntityLivingBase {
   public int _u1;
   public int p43;
   public float p7w;
   public float omz;
   public int goc;
   public int bx4;
   public float ysq;
   public float xx_;
   public float aeh;
   public float li4;
   public float v5a;
   public float xof = 1.0F;
   public sla esr;
   public static double mrd;
   public static double txo;
   public static double bta;
   private static final long c;
   private static final String[] d;
   private static final String[] e;
   private static final Map g = new HashMap(13);

   public flo(OpaquePredicate var1, double var2, double var4, double var6) {
      super(var1);
      this.yxc(0.2F, 0.2F);
      this.m6_(var2, var4, var6);
      this.ivp = this.bc1 = var2;
      this.c54 = this.o_z = var4;
      this.e2b = this.a4d = var6;
      this.aeh = this.li4 = this.v5a = 1.0F;
      this.p7w = this.z2d.nextFloat() * 3.0F;
      this.omz = this.z2d.nextFloat() * 3.0F;
      this.ysq = (this.z2d.nextFloat() * 0.5F + 0.5F) * 2.0F;
      this.bx4 = (int)(4.0F / (this.z2d.nextFloat() * 0.9F + 0.1F));
      this.goc = 0;
   }

   public flo(OpaquePredicate var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this(var1, var2, var4, var6);
      this.icv = var8 + (Math.random() * 2.0 - 1.0) * 0.4F;
      this.mop = var10 + (Math.random() * 2.0 - 1.0) * 0.4F;
      this.bw4 = var12 + (Math.random() * 2.0 - 1.0) * 0.4F;
      float var14 = (float)(Math.random() + Math.random() + 1.0) * 0.15F;
      float var15 = fe6.dii(this.icv * this.icv + this.mop * this.mop + this.bw4 * this.bw4);
      this.icv = this.icv / (double)var15 * (double)var14 * 0.4F;
      this.mop = this.mop / (double)var15 * (double)var14 * 0.4F + 0.1F;
      this.bw4 = this.bw4 / (double)var15 * (double)var14 * 0.4F;
   }

   public flo o8j(float var1) {
      this.icv *= (double)var1;
      this.mop = (this.mop - 0.1F) * (double)var1 + 0.1F;
      this.bw4 *= (double)var1;
      return this;
   }

   public flo nd9(float var1) {
      this.yxc(0.2F * var1, 0.2F * var1);
      this.ysq *= var1;
      return this;
   }

   public void mcd(float var1, float var2, float var3) {
      this.aeh = var1;
      this.li4 = var2;
      this.v5a = var3;
   }

   public void rc6(float param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield flo.xof F
      // 08: fconst_1
      // 09: fcmpl
      // 0a: iload 2
      // 0b: ifeq 5d
      // 0e: ifne 45
      // 11: goto 18
      // 14: invokestatic flo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 17: athrow
      // 18: fload 1
      // 19: fconst_1
      // 1a: fcmpg
      // 1b: iload 2
      // 1c: ifeq 5d
      // 1f: goto 26
      // 22: invokestatic flo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 25: athrow
      // 26: ifge 45
      // 29: goto 30
      // 2c: invokestatic flo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2f: athrow
      // 30: invokestatic Minecraft.vz1 ()Lc05;
      // 33: getfield Minecraft.i4p Ljux;
      // 36: aload 0
      // 37: invokevirtual jux.l7r (Lflo;)V
      // 3a: iload 2
      // 3b: ifne 7e
      // 3e: goto 45
      // 41: invokestatic flo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 44: athrow
      // 45: aload 0
      // 46: iload 2
      // 47: ifeq 7f
      // 4a: goto 51
      // 4d: invokestatic flo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 50: athrow
      // 51: getfield flo.xof F
      // 54: fconst_1
      // 55: fcmpg
      // 56: goto 5d
      // 59: invokestatic flo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 5c: athrow
      // 5d: ifge 7e
      // 60: fload 1
      // 61: fconst_1
      // 62: fcmpl
      // 63: ifne 7e
      // 66: goto 6d
      // 69: invokestatic flo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 6c: athrow
      // 6d: invokestatic Minecraft.vz1 ()Lc05;
      // 70: getfield Minecraft.i4p Ljux;
      // 73: aload 0
      // 74: invokevirtual jux.lt_ (Lflo;)V
      // 77: goto 7e
      // 7a: invokestatic flo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 7d: athrow
      // 7e: aload 0
      // 7f: fload 1
      // 80: putfield flo.xof F
      // 83: return
   }

   public float jmh() {
      return this.aeh;
   }

   public float t3o() {
      return this.li4;
   }

   public float gbn() {
      return this.v5a;
   }

   public float h6c() {
      return this.xof;
   }

   @Override
   public boolean _p9() {
      return false;
   }

   @Override
   public void tbj() {
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
      // 00: aload 0
      // 01: aload 0
      // 02: getfield flo.o2v D
      // 05: putfield flo.bc1 D
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: aload 0
      // 0c: aload 0
      // 0d: getfield flo.kfp D
      // 10: putfield flo.o_z D
      // 13: istore 1
      // 14: aload 0
      // 15: aload 0
      // 16: getfield flo.vbd D
      // 19: putfield flo.a4d D
      // 1c: aload 0
      // 1d: dup
      // 1e: getfield flo.goc I
      // 21: dup_x1
      // 22: bipush 1
      // 23: iadd
      // 24: putfield flo.goc I
      // 27: iload 1
      // 28: ifne 99
      // 2b: aload 0
      // 2c: getfield flo.bx4 I
      // 2f: if_icmplt 44
      // 32: goto 39
      // 35: invokestatic flo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 38: athrow
      // 39: aload 0
      // 3a: invokevirtual flo._kl ()V
      // 3d: goto 44
      // 40: invokestatic flo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 43: athrow
      // 44: aload 0
      // 45: dup
      // 46: getfield flo.mop D
      // 49: ldc2_w 0.04
      // 4c: aload 0
      // 4d: getfield flo.xx_ F
      // 50: f2d
      // 51: dmul
      // 52: dsub
      // 53: putfield flo.mop D
      // 56: aload 0
      // 57: aload 0
      // 58: getfield flo.icv D
      // 5b: aload 0
      // 5c: getfield flo.mop D
      // 5f: aload 0
      // 60: getfield flo.bw4 D
      // 63: invokevirtual flo.vjj (DDD)V
      // 66: aload 0
      // 67: dup
      // 68: getfield flo.icv D
      // 6b: ldc2_w 0.9800000190734863
      // 6e: dmul
      // 6f: putfield flo.icv D
      // 72: aload 0
      // 73: dup
      // 74: getfield flo.mop D
      // 77: ldc2_w 0.9800000190734863
      // 7a: dmul
      // 7b: putfield flo.mop D
      // 7e: aload 0
      // 7f: dup
      // 80: getfield flo.bw4 D
      // 83: ldc2_w 0.9800000190734863
      // 86: dmul
      // 87: putfield flo.bw4 D
      // 8a: aload 0
      // 8b: iload 1
      // 8c: ifne b0
      // 8f: getfield flo.lfk Z
      // 92: goto 99
      // 95: invokestatic flo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 98: athrow
      // 99: ifeq bb
      // 9c: aload 0
      // 9d: dup
      // 9e: getfield flo.icv D
      // a1: ldc2_w 0.699999988079071
      // a4: dmul
      // a5: putfield flo.icv D
      // a8: aload 0
      // a9: goto b0
      // ac: invokestatic flo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // af: athrow
      // b0: dup
      // b1: getfield flo.bw4 D
      // b4: ldc2_w 0.699999988079071
      // b7: dmul
      // b8: putfield flo.bw4 D
      // bb: return
   }

   public void oss(q3g var1, EntityLivingBase var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      float var10 = (float)this._u1 / 16.0F;
      int var10000 = OpaquePredicate.b();
      float var11 = var10 + 0.0624375F;
      float var12 = (float)this.p43 / 16.0F;
      int var9 = var10000;
      float var13 = var12 + 0.0624375F;
      float var14 = 0.1F * this.ysq;

      label21: {
         label20: {
            try {
               var22 = this;
               if (var9 == 0) {
                  break label21;
               }

               if (this.esr == null) {
                  break label20;
               }
            } catch (RuntimeException var21) {
               throw a(var21);
            }

            var10 = this.esr.l3u();
            var11 = this.esr.w2b();
            var12 = this.esr.bhi();
            var13 = this.esr.e8_();
         }

         var22 = this;
      }

      float var15 = (float)(var22.bc1 + (this.o2v - this.bc1) * (double)var3 - mrd);
      float var16 = (float)(this.o_z + (this.kfp - this.o_z) * (double)var3 - txo);
      float var17 = (float)(this.a4d + (this.vbd - this.a4d) * (double)var3 - bta);
      int var18 = this.azk(var3);
      int var19 = var18 >> 16 & 65535;
      int var20 = var18 & 65535;
      var1.g5o((double)(var15 - var4 * var14 - var7 * var14), (double)(var16 - var5 * var14), (double)(var17 - var6 * var14 - var8 * var14))
         .h0a((double)var11, (double)var13)
         .gs4(this.aeh, this.li4, this.v5a, this.xof)
         .iu0(var19, var20)
         .pzw();
      var1.g5o((double)(var15 - var4 * var14 + var7 * var14), (double)(var16 + var5 * var14), (double)(var17 - var6 * var14 + var8 * var14))
         .h0a((double)var11, (double)var12)
         .gs4(this.aeh, this.li4, this.v5a, this.xof)
         .iu0(var19, var20)
         .pzw();
      var1.g5o((double)(var15 + var4 * var14 + var7 * var14), (double)(var16 + var5 * var14), (double)(var17 + var6 * var14 + var8 * var14))
         .h0a((double)var10, (double)var12)
         .gs4(this.aeh, this.li4, this.v5a, this.xof)
         .iu0(var19, var20)
         .pzw();
      var1.g5o((double)(var15 + var4 * var14 - var7 * var14), (double)(var16 - var5 * var14), (double)(var17 + var6 * var14 - var8 * var14))
         .h0a((double)var10, (double)var13)
         .gs4(this.aeh, this.li4, this.v5a, this.xof)
         .iu0(var19, var20)
         .pzw();
   }

   public int ikr() {
      return 0;
   }

   @Override
   public void srs(bdo var1) {
   }

   @Override
   public void cjb(bdo var1) {
   }

   public void nsd(sla param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic flo.c J
      // 03: ldc2_w 59042609426308
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: invokevirtual flo.ikr ()I
      // 11: istore 5
      // 13: iload 4
      // 15: ifeq 31
      // 18: iload 5
      // 1a: bipush 1
      // 1b: if_icmpne 36
      // 1e: goto 25
      // 21: invokestatic flo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 24: athrow
      // 25: aload 0
      // 26: aload 1
      // 27: putfield flo.esr Lsla;
      // 2a: goto 31
      // 2d: invokestatic flo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 30: athrow
      // 31: iload 4
      // 33: ifne 50
      // 36: new java/lang/RuntimeException
      // 39: dup
      // 3a: sipush 9545
      // 3d: ldc2_w 5404144181703526581
      // 40: lload 2
      // 41: lxor
      // 42: invokedynamic g (IJ)Ljava/lang/String; bsm=flo.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: nop
      // 48: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/String;)V
      // 4b: athrow
      // 4c: invokestatic flo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 4f: athrow
      // 50: return
   }

   public void f0l(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic flo.c J
      // 03: ldc2_w 6539374072445
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: iload 4
      // 10: ifne 43
      // 13: invokevirtual flo.ikr ()I
      // 16: ifeq 3a
      // 19: goto 20
      // 1c: invokestatic flo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1f: athrow
      // 20: new java/lang/RuntimeException
      // 23: dup
      // 24: sipush 6383
      // 27: ldc2_w 3866580336098904300
      // 2a: lload 2
      // 2b: lxor
      // 2c: invokedynamic g (IJ)Ljava/lang/String; bsm=flo.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31: nop
      // 32: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/String;)V
      // 35: athrow
      // 36: invokestatic flo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 39: athrow
      // 3a: aload 0
      // 3b: iload 1
      // 3c: bipush 16
      // 3e: irem
      // 3f: putfield flo._u1 I
      // 42: aload 0
      // 43: iload 1
      // 44: bipush 16
      // 46: idiv
      // 47: putfield flo.p43 I
      // 4a: return
   }

   public void djm() {
      this._u1++;
   }

   @Override
   public boolean qvl() {
      return false;
   }

   @Override
   public String toString() {
      long var1 = c ^ 110259388828112L;
      return this.getClass().getSimpleName()
         + b<"g">(25348, 9024249806482483375L ^ var1)
         + this.o2v
         + ","
         + this.kfp
         + ","
         + this.vbd
         + b<"g">(11736, 6402426911424308849L ^ var1)
         + this.aeh
         + ","
         + this.li4
         + ","
         + this.v5a
         + ","
         + this.xof
         + b<"g">(26538, 6854225297667992576L ^ var1)
         + this.goc;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1066888464524691558L, 9120984924282729236L, MethodHandles.lookup().lookupClass()).a(31834907082751L);
      // $VF: monitorexit
      c = var10000;
      long var0 = c ^ 108215094971743L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[5];
      int var7 = 0;
      String var6 = "å1³\u008eû8\u0004à\u008fð\u008eº¤ªÃ\u001d\u0010\u0092\u009f£'²\u0012\u0097Zè\u0085ÈuÛvÁdX£uDµ\"ªZ}Ö³kèI\u008agdïü4ÃÀw\u0092ëù|Û\br\u001däØéÆàSI¨\u0012cT\"×\u0086\u009bATãMp³\u0081&pÄ+w¹áÊ·§l\u008ei\u001f*\u008aÎ@1&|s\u0099\u0098\u0089Ê\u001b\u0002½\u0095Ó\\]DÂ ";
      int var8 = "å1³\u008eû8\u0004à\u008fð\u008eº¤ªÃ\u001d\u0010\u0092\u009f£'²\u0012\u0097Zè\u0085ÈuÛvÁdX£uDµ\"ªZ}Ö³kèI\u008agdïü4ÃÀw\u0092ëù|Û\br\u001däØéÆàSI¨\u0012cT\"×\u0086\u009bATãMp³\u0081&pÄ+w¹áÊ·§l\u008ei\u001f*\u008aÎ@1&|s\u0099\u0098\u0089Ê\u001b\u0002½\u0095Ó\\]DÂ "
         .length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     d = var9;
                     e = new String[5];
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var20;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "iõý<\u0081¤Tó¬6¨yL-½X;Ö=\n\u000fÊ÷mÉÿ5\u0011i\u0095%ùHûòfæeÒ¥õñt¸µ)#\u0085Ò·cØåÿËæ\u0096q\u009b«Á¤ó?ø92±¦\u008d)\u008f\u009d\u0014¤}oq\u0089\u0095\u001aõNbÊð(\u008a\u0011µ\u0080\u009f\u0011R\rXñdlþ\u009c\u001c8\u0003n";
                  var8 = "iõý<\u0081¤Tó¬6¨yL-½X;Ö=\n\u000fÊ÷mÉÿ5\u0011i\u0095%ùHûòfæeÒ¥õñt¸µ)#\u0085Ò·cØåÿËæ\u0096q\u009b«Á¤ó?ø92±¦\u008d)\u008f\u009d\u0014¤}oq\u0089\u0095\u001aõNbÊð(\u008a\u0011µ\u0080\u009f\u0011R\rXñdlþ\u009c\u001c8\u0003n"
                     .length();
                  var5 = ' ';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static RuntimeException a(RuntimeException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 19342;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])g.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("flo", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         e[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("flo" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
