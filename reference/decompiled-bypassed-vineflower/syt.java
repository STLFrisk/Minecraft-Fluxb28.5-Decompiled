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

public class syt extends _f3 {
   private int kqh;
   public double tlr;
   public double dvt;
   private static final long c;
   private static final String[] d;
   private static final String[] i;
   private static final Map m = new HashMap(13);

   public syt(t9d var1) {
      super(var1);
   }

   public syt(t9d var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   @Override
   public _f3$c3d x38() {
      return _f3$c3d.j2j;
   }

   @Override
   public void tbj() {
      super.tbj();
      this.oit.kp2(16, new Byte((byte)0));
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
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: invokespecial _f3.xx_ ()V
      // 08: aload 0
      // 09: getfield syt.kqh I
      // 0c: iload 1
      // 0d: ifeq 3a
      // 10: ifle 2b
      // 13: goto 1a
      // 16: invokestatic syt.b (Loov;)Loov;
      // 19: athrow
      // 1a: aload 0
      // 1b: dup
      // 1c: getfield syt.kqh I
      // 1f: bipush 1
      // 20: isub
      // 21: putfield syt.kqh I
      // 24: goto 2b
      // 27: invokestatic syt.b (Loov;)Loov;
      // 2a: athrow
      // 2b: aload 0
      // 2c: iload 1
      // 2d: ifeq 4f
      // 30: getfield syt.kqh I
      // 33: goto 3a
      // 36: invokestatic syt.b (Loov;)Loov;
      // 39: athrow
      // 3a: ifgt 4e
      // 3d: aload 0
      // 3e: aload 0
      // 3f: dconst_0
      // 40: dup2_x1
      // 41: putfield syt.dvt D
      // 44: putfield syt.tlr D
      // 47: goto 4e
      // 4a: invokestatic syt.b (Loov;)Loov;
      // 4d: athrow
      // 4e: aload 0
      // 4f: aload 0
      // 50: getfield syt.kqh I
      // 53: iload 1
      // 54: ifeq 62
      // 57: ifle 65
      // 5a: goto 61
      // 5d: invokestatic syt.b (Loov;)Loov;
      // 60: athrow
      // 61: bipush 1
      // 62: goto 66
      // 65: bipush 0
      // 66: invokevirtual syt.jbt (Z)V
      // 69: aload 0
      // 6a: invokevirtual syt.mtb ()Z
      // 6d: iload 1
      // 6e: ifeq 95
      // 71: ifeq b8
      // 74: goto 7b
      // 77: invokestatic syt.b (Loov;)Loov;
      // 7a: athrow
      // 7b: aload 0
      // 7c: iload 1
      // 7d: ifeq 99
      // 80: goto 87
      // 83: invokestatic syt.b (Loov;)Loov;
      // 86: athrow
      // 87: getfield syt.z2d Ljava/util/Random;
      // 8a: bipush 4
      // 8b: invokevirtual java/util/Random.nextInt (I)I
      // 8e: goto 95
      // 91: invokestatic syt.b (Loov;)Loov;
      // 94: athrow
      // 95: ifne b8
      // 98: aload 0
      // 99: getfield syt.oay Lt9d;
      // 9c: getstatic w_0.vby Lw_0;
      // 9f: aload 0
      // a0: getfield syt.o2v D
      // a3: aload 0
      // a4: getfield syt.kfp D
      // a7: ldc2_w 0.8
      // aa: dadd
      // ab: aload 0
      // ac: getfield syt.vbd D
      // af: dconst_0
      // b0: dconst_0
      // b1: dconst_0
      // b2: bipush 0
      // b3: newarray 10
      // b5: invokevirtual t9d.zvy (Lw_0;DDDDDD[I)V
      // b8: return
   }

   @Override
   public double db_() {
      return 0.2;
   }

   @Override
   public void szd(ofh param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic syt.c J
      // 03: ldc2_w 112272782965577
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.b ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: aload 1
      // 0f: invokespecial _f3.szd (Lofh;)V
      // 12: aload 1
      // 13: invokevirtual ofh.yto ()Z
      // 16: iload 4
      // 18: ifeq 50
      // 1b: ifne 64
      // 1e: goto 25
      // 21: invokestatic syt.b (Loov;)Loov;
      // 24: athrow
      // 25: aload 0
      // 26: iload 4
      // 28: ifeq 54
      // 2b: goto 32
      // 2e: invokestatic syt.b (Loov;)Loov;
      // 31: athrow
      // 32: getfield syt.oay Lt9d;
      // 35: invokevirtual t9d.eir ()Lef9;
      // 38: sipush 23974
      // 3b: ldc2_w 7480256346612347113
      // 3e: lload 2
      // 3f: lxor
      // 40: invokedynamic q (IJ)Ljava/lang/String; bsm=syt.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: nop
      // 46: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 49: goto 50
      // 4c: invokestatic syt.b (Loov;)Loov;
      // 4f: athrow
      // 50: ifeq 64
      // 53: aload 0
      // 54: new erg
      // 57: dup
      // 58: getstatic ox_.o16 Le0x;
      // 5b: bipush 1
      // 5c: invokespecial erg.<init> (Le0x;I)V
      // 5f: fconst_0
      // 60: invokevirtual syt.qji (Lerg;F)Lnvf;
      // 63: pop
      // 64: return
   }

   @Override
   public void dfm(mew param1, zfz param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: aload 2
      // 03: invokespecial _f3.dfm (Lmew;Lzfz;)V
      // 06: invokestatic t9d.c ()I
      // 09: aload 0
      // 0a: getfield syt.tlr D
      // 0d: aload 0
      // 0e: getfield syt.tlr D
      // 11: dmul
      // 12: aload 0
      // 13: getfield syt.dvt D
      // 16: aload 0
      // 17: getfield syt.dvt D
      // 1a: dmul
      // 1b: dadd
      // 1c: dstore 4
      // 1e: istore 3
      // 1f: dload 4
      // 21: ldc2_w 1.0E-4
      // 24: dcmpl
      // 25: iload 3
      // 26: ifne 51
      // 29: ifle db
      // 2c: goto 33
      // 2f: invokestatic syt.b (Loov;)Loov;
      // 32: athrow
      // 33: aload 0
      // 34: getfield syt.icv D
      // 37: aload 0
      // 38: getfield syt.icv D
      // 3b: dmul
      // 3c: aload 0
      // 3d: getfield syt.bw4 D
      // 40: aload 0
      // 41: getfield syt.bw4 D
      // 44: dmul
      // 45: dadd
      // 46: ldc2_w 0.001
      // 49: dcmpl
      // 4a: goto 51
      // 4d: invokestatic syt.b (Loov;)Loov;
      // 50: athrow
      // 51: iload 3
      // 52: ifne 9d
      // 55: ifle db
      // 58: goto 5f
      // 5b: invokestatic syt.b (Loov;)Loov;
      // 5e: athrow
      // 5f: dload 4
      // 61: invokestatic fe6.dii (D)F
      // 64: f2d
      // 65: dstore 4
      // 67: aload 0
      // 68: dup
      // 69: getfield syt.tlr D
      // 6c: dload 4
      // 6e: ddiv
      // 6f: putfield syt.tlr D
      // 72: aload 0
      // 73: dup
      // 74: getfield syt.dvt D
      // 77: dload 4
      // 79: ddiv
      // 7a: putfield syt.dvt D
      // 7d: aload 0
      // 7e: getfield syt.tlr D
      // 81: aload 0
      // 82: getfield syt.icv D
      // 85: dmul
      // 86: aload 0
      // 87: getfield syt.dvt D
      // 8a: aload 0
      // 8b: getfield syt.bw4 D
      // 8e: dmul
      // 8f: dadd
      // 90: dconst_0
      // 91: iload 3
      // 92: ifne c2
      // 95: dcmpg
      // 96: goto 9d
      // 99: invokestatic syt.b (Loov;)Loov;
      // 9c: athrow
      // 9d: ifge b5
      // a0: aload 0
      // a1: dconst_0
      // a2: putfield syt.tlr D
      // a5: aload 0
      // a6: dconst_0
      // a7: putfield syt.dvt D
      // aa: iload 3
      // ab: ifeq db
      // ae: goto b5
      // b1: invokestatic syt.b (Loov;)Loov;
      // b4: athrow
      // b5: dload 4
      // b7: aload 0
      // b8: invokevirtual syt.db_ ()D
      // bb: goto c2
      // be: invokestatic syt.b (Loov;)Loov;
      // c1: athrow
      // c2: ddiv
      // c3: dstore 6
      // c5: aload 0
      // c6: dup
      // c7: getfield syt.tlr D
      // ca: dload 6
      // cc: dmul
      // cd: putfield syt.tlr D
      // d0: aload 0
      // d1: dup
      // d2: getfield syt.dvt D
      // d5: dload 6
      // d7: dmul
      // d8: putfield syt.dvt D
      // db: return
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   @Override
   public void zye() {
      int var1 = t9d.b();
      double var2 = this.tlr * this.tlr + this.dvt * this.dvt;

      label37: {
         label44: {
            label41: {
               try {
                  if (var1 == 0) {
                     break label44;
                  }

                  if (!(var2 > 1.0E-4)) {
                     break label41;
                  }
               } catch (oov var8) {
                  throw b(var8);
               }

               var2 = (double)fe6.dii(var2);
               this.tlr /= var2;
               this.dvt /= var2;
               double var4 = 1.0;

               try {
                  this.icv *= 0.8F;
                  this.mop *= 0.0;
                  this.bw4 *= 0.8F;
                  this.icv = this.icv + this.tlr * var4;
                  this.bw4 = this.bw4 + this.dvt * var4;
                  if (var1 != 0) {
                     break label37;
                  }
               } catch (oov var7) {
                  boolean var10001 = false;
                  throw b(var7);
               }
            }

            try {
               this.icv *= 0.98F;
               this.mop *= 0.0;
            } catch (oov var6) {
               boolean var10 = false;
               throw b(var6);
            }
         }

         this.bw4 *= 0.98F;
      }

      super.zye();
   }

   @Override
   public boolean k25(ha9 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: getfield ha9.up_ Ljnq;
      // 08: invokevirtual jnq.dxs ()Lerg;
      // 0b: astore 3
      // 0c: iload 2
      // 0d: ifne 9c
      // 10: aload 3
      // 11: ifnull 82
      // 14: goto 1b
      // 17: invokestatic syt.b (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 3
      // 1c: invokevirtual erg.gn1 ()Lu7m;
      // 1f: getstatic xbr.thr Lu7m;
      // 22: if_acmpne 82
      // 25: goto 2c
      // 28: invokestatic syt.b (Loov;)Loov;
      // 2b: athrow
      // 2c: aload 1
      // 2d: getfield ha9.lls Lpj2;
      // 30: getfield pj2.g40 Z
      // 33: iload 2
      // 34: ifne 5a
      // 37: goto 3e
      // 3a: invokestatic syt.b (Loov;)Loov;
      // 3d: athrow
      // 3e: ifne 76
      // 41: goto 48
      // 44: invokestatic syt.b (Loov;)Loov;
      // 47: athrow
      // 48: aload 3
      // 49: dup
      // 4a: getfield erg.qd2 I
      // 4d: bipush 1
      // 4e: isub
      // 4f: dup_x1
      // 50: putfield erg.qd2 I
      // 53: goto 5a
      // 56: invokestatic syt.b (Loov;)Loov;
      // 59: athrow
      // 5a: ifne 76
      // 5d: aload 1
      // 5e: getfield ha9.up_ Ljnq;
      // 61: aload 1
      // 62: getfield ha9.up_ Ljnq;
      // 65: getfield jnq.nb5 I
      // 68: aconst_null
      // 69: checkcast erg
      // 6c: invokevirtual jnq.cxl (ILerg;)V
      // 6f: goto 76
      // 72: invokestatic syt.b (Loov;)Loov;
      // 75: athrow
      // 76: aload 0
      // 77: dup
      // 78: getfield syt.kqh I
      // 7b: sipush 3600
      // 7e: iadd
      // 7f: putfield syt.kqh I
      // 82: aload 0
      // 83: aload 0
      // 84: getfield syt.o2v D
      // 87: aload 1
      // 88: getfield ha9.o2v D
      // 8b: dsub
      // 8c: putfield syt.tlr D
      // 8f: aload 0
      // 90: aload 0
      // 91: getfield syt.vbd D
      // 94: aload 1
      // 95: getfield ha9.vbd D
      // 98: dsub
      // 99: putfield syt.dvt D
      // 9c: bipush 1
      // 9d: ireturn
   }

   @Override
   public void srs(bdo var1) {
      long var2 = c ^ 97497240623505L;
      super.srs(var1);
      var1.von(c<"q">(4810, 4422530238315666777L ^ var2), this.tlr);
      var1.von(c<"q">(28373, 9222763922250588481L ^ var2), this.dvt);
      var1.ge7(c<"q">(31592, 7025366815555745021L ^ var2), (short)this.kqh);
   }

   @Override
   public void cjb(bdo var1) {
      long var2 = c ^ 50586615264570L;
      super.cjb(var1);
      this.tlr = var1.m9p(c<"q">(30348, 6748190331615188401L ^ var2));
      this.dvt = var1.m9p(c<"q">(31090, 7194680185249045067L ^ var2));
      this.kqh = var1.hp9(c<"q">(20077, 1986880273862405463L ^ var2));
   }

   public boolean mtb() {
      int var1 = t9d.c();

      try {
         int var10000 = this.oit.miz(16) & 1;
         if (var1 != 0) {
            return (boolean)var10000;
         }

         if (var10000 != 0) {
            return (boolean)1;
         }
      } catch (oov var2) {
         throw b(var2);
      }

      return (boolean)0;
   }

   public void jbt(boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: iload 1
      // 05: ifeq 2b
      // 08: aload 0
      // 09: getfield syt.oit Lwl1;
      // 0c: bipush 16
      // 0e: aload 0
      // 0f: getfield syt.oit Lwl1;
      // 12: bipush 16
      // 14: invokevirtual wl1.miz (I)B
      // 17: bipush 1
      // 18: ior
      // 19: i2b
      // 1a: invokestatic java/lang/Byte.valueOf (B)Ljava/lang/Byte;
      // 1d: invokevirtual wl1.c66 (ILjava/lang/Object;)V
      // 20: iload 2
      // 21: ifeq 4b
      // 24: goto 2b
      // 27: invokestatic syt.b (Loov;)Loov;
      // 2a: athrow
      // 2b: aload 0
      // 2c: getfield syt.oit Lwl1;
      // 2f: bipush 16
      // 31: aload 0
      // 32: getfield syt.oit Lwl1;
      // 35: bipush 16
      // 37: invokevirtual wl1.miz (I)B
      // 3a: bipush -2
      // 3c: iand
      // 3d: i2b
      // 3e: invokestatic java/lang/Byte.valueOf (B)Ljava/lang/Byte;
      // 41: invokevirtual wl1.c66 (ILjava/lang/Object;)V
      // 44: goto 4b
      // 47: invokestatic syt.b (Loov;)Loov;
      // 4a: athrow
      // 4b: return
   }

   @Override
   public zfz hcw() {
      try {
         if (this.mtb()) {
            return ox_.mqy.l4i().zvi(ovv.lnz, vt2.z9q);
         }
      } catch (oov var1) {
         throw b(var1);
      }

      return ox_.o16.l4i().zvi(ovv.lnz, vt2.z9q);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(109040838990395615L, -9200726783617481870L, MethodHandles.lookup().lookupClass()).a(174554442638716L);
      // $VF: monitorexit
      c = var10000;
      long var0 = c ^ 127303154708225L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[7];
      int var7 = 0;
      String var6 = "Sôý4ü\u0015\u0081\u0098gÊÄV\u00147[ciié:\u0015m\n¯?Z?ÊiWòÖ\u0010D\u0082\f\u001b®¼\u0014Îéþ\u009dS(\u0019k_\u0010¯ô\u0000kVÖúÜ^\u0018 \u0086é\u0000sd\u0010Q´Ãvu Ín%\u009fðw\u0088Â!H\u0010Màu\u001bm\u0004kD\u00adïÒ\u009fH5\u0006a";
      int var8 = "Sôý4ü\u0015\u0081\u0098gÊÄV\u00147[ciié:\u0015m\n¯?Z?ÊiWòÖ\u0010D\u0082\f\u001b®¼\u0014Îéþ\u009dS(\u0019k_\u0010¯ô\u0000kVÖúÜ^\u0018 \u0086é\u0000sd\u0010Q´Ãvu Ín%\u009fðw\u0088Â!H\u0010Màu\u001bm\u0004kD\u00adïÒ\u009fH5\u0006a"
         .length();
      char var5 = ' ';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = c(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     d = var9;
                     i = new String[7];
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

                  var6 = "b4Wý\u0083\u0003/!Î\u0010\u009d\u0001\u001d|\u000eT\u0010Ð\u0081\u0018>^uÏn:Y\u00ad\u0016\u0093EÆ¾";
                  var8 = "b4Wý\u0083\u0003/!Î\u0010\u009d\u0001\u001d|\u000eT\u0010Ð\u0081\u0018>^uÏn:Y\u00ad\u0016\u0093EÆ¾".length();
                  var5 = 16;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static oov b(oov var0) {
      return var0;
   }

   private static String c(byte[] var0) {
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

   private static String c(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 13307;
      if (i[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])m.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               m.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("syt", var10);
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
         i[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return i[var5];
   }

   private static Object c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = c(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("syt" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
