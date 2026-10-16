import java.lang.invoke.MethodHandles;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class laq extends yqv {
   public static final UUID pui;
   public static final xk5 dv0;

   public laq(t9d var1) {
      super(var1);
   }

   public float ncy(mew var1) {
      return 0.0F;
   }

   @Override
   public boolean iaw() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: invokespecial yqv.iaw ()Z
      // 08: iload 1
      // 09: ifne 39
      // 0c: ifeq 4b
      // 0f: goto 16
      // 12: invokestatic laq.e (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: new mew
      // 1a: dup
      // 1b: aload 0
      // 1c: getfield laq.o2v D
      // 1f: aload 0
      // 20: invokevirtual laq.aaw ()Lnh4;
      // 23: getfield nh4.bx_ D
      // 26: aload 0
      // 27: getfield laq.vbd D
      // 2a: invokespecial mew.<init> (DDD)V
      // 2d: invokevirtual laq.ncy (Lmew;)F
      // 30: fconst_0
      // 31: fcmpl
      // 32: goto 39
      // 35: invokestatic laq.e (Loov;)Loov;
      // 38: athrow
      // 39: iload 1
      // 3a: ifne 48
      // 3d: iflt 4b
      // 40: goto 47
      // 43: invokestatic laq.e (Loov;)Loov;
      // 46: athrow
      // 47: bipush 1
      // 48: goto 4c
      // 4b: bipush 0
      // 4c: ireturn
   }

   public boolean w9l() {
      int var1 = t9d.b();

      try {
         boolean var10000 = this.f35.j07();
         if (var1 == 0) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (oov var2) {
         throw e(var2);
      }

      return false;
   }

   public boolean k8l() {
      return this.oon(new mew(this));
   }

   public boolean oon(mew param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield laq.a04 F
      // 08: ldc -1.0
      // 0a: nop
      // 0b: fcmpl
      // 0c: iload 2
      // 0d: ifeq 35
      // 10: ifne 22
      // 13: goto 1a
      // 16: invokestatic laq.e (Loov;)Loov;
      // 19: athrow
      // 1a: bipush 1
      // 1b: goto 48
      // 1e: invokestatic laq.e (Loov;)Loov;
      // 21: athrow
      // 22: aload 0
      // 23: getfield laq.gt_ Lmew;
      // 26: aload 1
      // 27: invokevirtual mew.t0u (Lwgo;)D
      // 2a: aload 0
      // 2b: getfield laq.a04 F
      // 2e: aload 0
      // 2f: getfield laq.a04 F
      // 32: fmul
      // 33: f2d
      // 34: dcmpg
      // 35: iload 2
      // 36: ifeq 44
      // 39: ifge 47
      // 3c: goto 43
      // 3f: invokestatic laq.e (Loov;)Loov;
      // 42: athrow
      // 43: bipush 1
      // 44: goto 48
      // 47: bipush 0
      // 48: ireturn
   }

   public void muf(mew var1, int var2) {
      this.gt_ = var1;
      this.a04 = (float)var2;
   }

   public mew plj() {
      return this.gt_;
   }

   public float pns() {
      return this.a04;
   }

   public void u_7() {
      this.a04 = -1.0F;
   }

   public boolean qg5() {
      int var1 = t9d.c();

      try {
         float var3;
         int var10000 = (var3 = this.a04 - -1.0F) == 0.0F ? 0 : (var3 < 0.0F ? -1 : 1);
         if (var1 != 0) {
            return (boolean)var10000;
         }

         if (var10000) {
            return (boolean)1;
         }
      } catch (oov var2) {
         throw e(var2);
      }

      return (boolean)0;
   }

   @Override
   public void r7q() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 1
      // 004: aload 0
      // 005: invokespecial yqv.r7q ()V
      // 008: aload 0
      // 009: invokevirtual laq.hk3 ()Z
      // 00c: iload 1
      // 00d: ifeq 1de
      // 010: ifeq 1d3
      // 013: goto 01a
      // 016: invokestatic laq.e (Loov;)Loov;
      // 019: athrow
      // 01a: aload 0
      // 01b: iload 1
      // 01c: ifeq 1db
      // 01f: goto 026
      // 022: invokestatic laq.e (Loov;)Loov;
      // 025: athrow
      // 026: invokevirtual laq.ohg ()Li2h;
      // 029: ifnull 1d3
      // 02c: goto 033
      // 02f: invokestatic laq.e (Loov;)Loov;
      // 032: athrow
      // 033: aload 0
      // 034: iload 1
      // 035: ifeq 1db
      // 038: goto 03f
      // 03b: invokestatic laq.e (Loov;)Loov;
      // 03e: athrow
      // 03f: invokevirtual laq.ohg ()Li2h;
      // 042: getfield i2h.oay Lt9d;
      // 045: aload 0
      // 046: getfield laq.oay Lt9d;
      // 049: if_acmpne 1d3
      // 04c: goto 053
      // 04f: invokestatic laq.e (Loov;)Loov;
      // 052: athrow
      // 053: aload 0
      // 054: invokevirtual laq.ohg ()Li2h;
      // 057: astore 2
      // 058: aload 0
      // 059: new mew
      // 05c: dup
      // 05d: aload 2
      // 05e: getfield i2h.o2v D
      // 061: d2i
      // 062: aload 2
      // 063: getfield i2h.kfp D
      // 066: d2i
      // 067: aload 2
      // 068: getfield i2h.vbd D
      // 06b: d2i
      // 06c: invokespecial mew.<init> (III)V
      // 06f: bipush 5
      // 070: invokevirtual laq.muf (Lmew;I)V
      // 073: aload 0
      // 074: aload 2
      // 075: invokevirtual laq.tm6 (Li2h;)F
      // 078: fstore 3
      // 079: aload 0
      // 07a: instanceof k9a
      // 07d: iload 1
      // 07e: ifeq 0c8
      // 081: ifeq 0c4
      // 084: goto 08b
      // 087: invokestatic laq.e (Loov;)Loov;
      // 08a: athrow
      // 08b: aload 0
      // 08c: checkcast k9a
      // 08f: invokevirtual k9a.ird ()Z
      // 092: iload 1
      // 093: ifeq 0c8
      // 096: goto 09d
      // 099: invokestatic laq.e (Loov;)Loov;
      // 09c: athrow
      // 09d: ifeq 0c4
      // 0a0: goto 0a7
      // 0a3: invokestatic laq.e (Loov;)Loov;
      // 0a6: athrow
      // 0a7: fload 3
      // 0a8: ldc 10.0
      // 0aa: nop
      // 0ab: fcmpl
      // 0ac: ifle 0c3
      // 0af: goto 0b6
      // 0b2: invokestatic laq.e (Loov;)Loov;
      // 0b5: athrow
      // 0b6: aload 0
      // 0b7: bipush 1
      // 0b8: bipush 1
      // 0b9: invokevirtual laq.xqh (ZZ)V
      // 0bc: goto 0c3
      // 0bf: invokestatic laq.e (Loov;)Loov;
      // 0c2: athrow
      // 0c3: return
      // 0c4: aload 0
      // 0c5: getfield laq.uhr Z
      // 0c8: iload 1
      // 0c9: ifeq 11f
      // 0cc: ifne 115
      // 0cf: goto 0d6
      // 0d2: invokestatic laq.e (Loov;)Loov;
      // 0d5: athrow
      // 0d6: aload 0
      // 0d7: getfield laq.r1d Ldak;
      // 0da: bipush 2
      // 0db: aload 0
      // 0dc: getfield laq.ewn Lcjm;
      // 0df: invokevirtual dak.tn8 (ILcjm;)V
      // 0e2: aload 0
      // 0e3: iload 1
      // 0e4: ifeq 111
      // 0e7: goto 0ee
      // 0ea: invokestatic laq.e (Loov;)Loov;
      // 0ed: athrow
      // 0ee: invokevirtual laq.zq2 ()Lp8a;
      // 0f1: instanceof zvv
      // 0f4: ifeq 110
      // 0f7: goto 0fe
      // 0fa: invokestatic laq.e (Loov;)Loov;
      // 0fd: athrow
      // 0fe: aload 0
      // 0ff: invokevirtual laq.zq2 ()Lp8a;
      // 102: checkcast zvv
      // 105: bipush 0
      // 106: invokevirtual zvv.uuq (Z)V
      // 109: goto 110
      // 10c: invokestatic laq.e (Loov;)Loov;
      // 10f: athrow
      // 110: aload 0
      // 111: bipush 1
      // 112: putfield laq.uhr Z
      // 115: aload 0
      // 116: fload 3
      // 117: invokevirtual laq.um3 (F)V
      // 11a: fload 3
      // 11b: ldc 4.0
      // 11d: nop
      // 11e: fcmpl
      // 11f: iload 1
      // 120: ifeq 143
      // 123: ifle 13e
      // 126: goto 12d
      // 129: invokestatic laq.e (Loov;)Loov;
      // 12c: athrow
      // 12d: aload 0
      // 12e: invokevirtual laq.zq2 ()Lp8a;
      // 131: aload 2
      // 132: dconst_1
      // 133: invokevirtual p8a.p6m (Li2h;D)Z
      // 136: pop
      // 137: goto 13e
      // 13a: invokestatic laq.e (Loov;)Loov;
      // 13d: athrow
      // 13e: fload 3
      // 13f: ldc 6.0
      // 141: nop
      // 142: fcmpl
      // 143: iload 1
      // 144: ifeq 1bf
      // 147: ifle 1ba
      // 14a: goto 151
      // 14d: invokestatic laq.e (Loov;)Loov;
      // 150: athrow
      // 151: aload 2
      // 152: getfield i2h.o2v D
      // 155: aload 0
      // 156: getfield laq.o2v D
      // 159: dsub
      // 15a: fload 3
      // 15b: f2d
      // 15c: ddiv
      // 15d: dstore 4
      // 15f: aload 2
      // 160: getfield i2h.kfp D
      // 163: aload 0
      // 164: getfield laq.kfp D
      // 167: dsub
      // 168: fload 3
      // 169: f2d
      // 16a: ddiv
      // 16b: dstore 6
      // 16d: aload 2
      // 16e: getfield i2h.vbd D
      // 171: aload 0
      // 172: getfield laq.vbd D
      // 175: dsub
      // 176: fload 3
      // 177: f2d
      // 178: ddiv
      // 179: dstore 8
      // 17b: aload 0
      // 17c: dup
      // 17d: getfield laq.icv D
      // 180: dload 4
      // 182: dload 4
      // 184: invokestatic java/lang/Math.abs (D)D
      // 187: dmul
      // 188: ldc2_w 0.4
      // 18b: dmul
      // 18c: dadd
      // 18d: putfield laq.icv D
      // 190: aload 0
      // 191: dup
      // 192: getfield laq.mop D
      // 195: dload 6
      // 197: dload 6
      // 199: invokestatic java/lang/Math.abs (D)D
      // 19c: dmul
      // 19d: ldc2_w 0.4
      // 1a0: dmul
      // 1a1: dadd
      // 1a2: putfield laq.mop D
      // 1a5: aload 0
      // 1a6: dup
      // 1a7: getfield laq.bw4 D
      // 1aa: dload 8
      // 1ac: dload 8
      // 1ae: invokestatic java/lang/Math.abs (D)D
      // 1b1: dmul
      // 1b2: ldc2_w 0.4
      // 1b5: dmul
      // 1b6: dadd
      // 1b7: putfield laq.bw4 D
      // 1ba: fload 3
      // 1bb: ldc 10.0
      // 1bd: nop
      // 1be: fcmpl
      // 1bf: ifle 1cf
      // 1c2: aload 0
      // 1c3: bipush 1
      // 1c4: bipush 1
      // 1c5: invokevirtual laq.xqh (ZZ)V
      // 1c8: goto 1cf
      // 1cb: invokestatic laq.e (Loov;)Loov;
      // 1ce: athrow
      // 1cf: iload 1
      // 1d0: ifne 247
      // 1d3: aload 0
      // 1d4: goto 1db
      // 1d7: invokestatic laq.e (Loov;)Loov;
      // 1da: athrow
      // 1db: invokevirtual laq.hk3 ()Z
      // 1de: iload 1
      // 1df: ifeq 1f7
      // 1e2: ifne 247
      // 1e5: goto 1ec
      // 1e8: invokestatic laq.e (Loov;)Loov;
      // 1eb: athrow
      // 1ec: aload 0
      // 1ed: getfield laq.uhr Z
      // 1f0: goto 1f7
      // 1f3: invokestatic laq.e (Loov;)Loov;
      // 1f6: athrow
      // 1f7: iload 1
      // 1f8: ifeq 22e
      // 1fb: ifeq 247
      // 1fe: goto 205
      // 201: invokestatic laq.e (Loov;)Loov;
      // 204: athrow
      // 205: aload 0
      // 206: bipush 0
      // 207: putfield laq.uhr Z
      // 20a: aload 0
      // 20b: getfield laq.r1d Ldak;
      // 20e: aload 0
      // 20f: getfield laq.ewn Lcjm;
      // 212: invokevirtual dak.hmq (Lcjm;)V
      // 215: aload 0
      // 216: iload 1
      // 217: ifeq 244
      // 21a: goto 221
      // 21d: invokestatic laq.e (Loov;)Loov;
      // 220: athrow
      // 221: invokevirtual laq.zq2 ()Lp8a;
      // 224: instanceof zvv
      // 227: goto 22e
      // 22a: invokestatic laq.e (Loov;)Loov;
      // 22d: athrow
      // 22e: ifeq 243
      // 231: aload 0
      // 232: invokevirtual laq.zq2 ()Lp8a;
      // 235: checkcast zvv
      // 238: bipush 1
      // 239: invokevirtual zvv.uuq (Z)V
      // 23c: goto 243
      // 23f: invokestatic laq.e (Loov;)Loov;
      // 242: athrow
      // 243: aload 0
      // 244: invokevirtual laq.u_7 ()V
      // 247: return
   }

   public void um3(float var1) {
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-620841642736451633L, -6455399178878608662L, MethodHandles.lookup().lookupClass()).a(124044657147287L);
      // $VF: monitorexit
      long var10 = var10000 ^ 74382465052030L;
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
      String var5 = "'¿×¿<]Á(µ\u0095°F\u0085åTJ¨\t¬\u001f\u0096}\u001aà`;\f_\r\u009bh\t,+\u009cº0\u001d\u0098 \u0018r\u0097\u000f}àVF¿+2\\5©T\u00925Ý¡~\u008b¦êw\u009e";
      int var7 = "'¿×¿<]Á(µ\u0095°F\u0085åTJ¨\t¬\u001f\u0096}\u001aà`;\f_\r\u009bh\t,+\u009cº0\u001d\u0098 \u0018r\u0097\u000f}àVF¿+2\\5©T\u00925Ý¡~\u008b¦êw\u009e"
         .length();
      char var4 = '(';
      int var3 = -1;

      while (true) {
         byte[] var9 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var15 = d(var9).intern();
         byte var10001 = -1;
         var8[var6++] = var15;
         if ((var3 += var4) >= var7) {
            pui = UUID.fromString(var8[0]);
            dv0 = new xk5(pui, var8[1], 2.0, 2).d2_(false);
            return;
         }

         var4 = var5.charAt(var3);
      }
   }

   private static oov e(oov var0) {
      return var0;
   }

   private static String d(byte[] var0) {
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
