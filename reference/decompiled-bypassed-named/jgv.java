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

public class jgv {
   public Module swr;
   public String y84;
   public String hfz;
   public String kmv;
   public jgv$vro l23;
   private float pc8;
   private float vtj;
   private float xzu;
   private float _o6;
   public Minecraft kd5;
   public long x_u;
   public q6h ult;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public jgv(String var1, String var2, jgv$vro var3, long var4) {
      this(var1, var2, var3, var4, null);
   }

   public jgv(String param1, String param2, jgv$vro param3, long param4, Module param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic jgv.a J
      // 003: ldc2_w 84312338285965
      // 006: lxor
      // 007: lstore 7
      // 009: aload 0
      // 00a: invokespecial java/lang/Object.<init> ()V
      // 00d: invokestatic OpaquePredicate.c ()I
      // 010: aload 0
      // 011: invokestatic Minecraft.vz1 ()Lc05;
      // 014: putfield jgv.kd5 Lc05;
      // 017: aload 0
      // 018: aload 6
      // 01a: putfield jgv.swr Lar7;
      // 01d: aload 0
      // 01e: aload 2
      // 01f: putfield jgv.y84 Ljava/lang/String;
      // 022: istore 9
      // 024: aload 0
      // 025: aload 1
      // 026: putfield jgv.hfz Ljava/lang/String;
      // 029: aload 0
      // 02a: getstatic jsr.xib Lcyb;
      // 02d: aload 1
      // 02e: sipush 5548
      // 031: ldc2_w 8624469540662668837
      // 034: lload 7
      // 036: lxor
      // 037: invokedynamic u (IJ)Ljava/lang/String; bsm=jgv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03c: nop
      // 03d: ldc ""
      // 03f: nop
      // 040: invokevirtual java/lang/String.replaceAll (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 043: invokevirtual cyb.ax2 (Ljava/lang/String;)F
      // 046: getstatic jsr.kfx Lcyb;
      // 049: aload 2
      // 04a: sipush 12200
      // 04d: ldc2_w 8703946169260856355
      // 050: lload 7
      // 052: lxor
      // 053: invokedynamic u (IJ)Ljava/lang/String; bsm=jgv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 058: nop
      // 059: ldc ""
      // 05b: nop
      // 05c: invokevirtual java/lang/String.replaceAll (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 05f: invokevirtual cyb.ax2 (Ljava/lang/String;)F
      // 062: invokestatic java/lang/Math.max (FF)F
      // 065: ldc 40.0
      // 067: nop
      // 068: fadd
      // 069: putfield jgv.xzu F
      // 06c: aload 0
      // 06d: ldc 22.0
      // 06f: nop
      // 070: putfield jgv._o6 F
      // 073: aload 0
      // 074: aload 0
      // 075: getfield jgv.xzu F
      // 078: putfield jgv.pc8 F
      // 07b: aload 0
      // 07c: aload 3
      // 07d: putfield jgv.l23 Ljgv$vro;
      // 080: aload 0
      // 081: lload 4
      // 083: putfield jgv.x_u J
      // 086: aload 0
      // 087: new q6h
      // 08a: dup
      // 08b: invokespecial q6h.<init> ()V
      // 08e: putfield jgv.ult Lq6h;
      // 091: aload 0
      // 092: getfield jgv.ult Lq6h;
      // 095: invokevirtual q6h.u1k ()V
      // 098: iload 9
      // 09a: ifne 0da
      // 09d: getstatic jgv$1.tf8 [I
      // 0a0: aload 3
      // 0a1: invokevirtual jgv$vro.ordinal ()I
      // 0a4: iaload
      // 0a5: tableswitch 134 1 5 39 58 77 96 115
      // 0c8: invokestatic jgv.a (Loov;)Loov;
      // 0cb: athrow
      // 0cc: aload 0
      // 0cd: ldc "A"
      // 0cf: nop
      // 0d0: putfield jgv.kmv Ljava/lang/String;
      // 0d3: goto 0da
      // 0d6: invokestatic jgv.a (Loov;)Loov;
      // 0d9: athrow
      // 0da: iload 9
      // 0dc: ifeq 12b
      // 0df: aload 0
      // 0e0: ldc "B"
      // 0e2: nop
      // 0e3: putfield jgv.kmv Ljava/lang/String;
      // 0e6: iload 9
      // 0e8: ifeq 12b
      // 0eb: goto 0f2
      // 0ee: invokestatic jgv.a (Loov;)Loov;
      // 0f1: athrow
      // 0f2: aload 0
      // 0f3: ldc "C"
      // 0f5: nop
      // 0f6: putfield jgv.kmv Ljava/lang/String;
      // 0f9: iload 9
      // 0fb: ifeq 12b
      // 0fe: goto 105
      // 101: invokestatic jgv.a (Loov;)Loov;
      // 104: athrow
      // 105: aload 0
      // 106: ldc "D"
      // 108: nop
      // 109: putfield jgv.kmv Ljava/lang/String;
      // 10c: iload 9
      // 10e: ifeq 12b
      // 111: goto 118
      // 114: invokestatic jgv.a (Loov;)Loov;
      // 117: athrow
      // 118: aload 0
      // 119: aload 6
      // 11b: invokevirtual Module.oxx ()L_aj;
      // 11e: getfield _aj.h2b Ljava/lang/String;
      // 121: putfield jgv.kmv Ljava/lang/String;
      // 124: goto 12b
      // 127: invokestatic jgv.a (Loov;)Loov;
      // 12a: athrow
      // 12b: return
   }

   public void ijf(float param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic jgv.a J
      // 003: ldc2_w 66340845572201
      // 006: lxor
      // 007: lstore 2
      // 008: new eka
      // 00b: dup
      // 00c: aload 0
      // 00d: getfield jgv.kd5 Lc05;
      // 010: invokespecial eka.<init> (Lc05;)V
      // 013: astore 5
      // 015: invokestatic OpaquePredicate.c ()I
      // 018: getstatic ClientState.gki Lc_3;
      // 01b: sipush 12226
      // 01e: ldc2_w 5836279525718901166
      // 021: lload 2
      // 022: lxor
      // 023: invokedynamic u (IJ)Ljava/lang/String; bsm=jgv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 028: nop
      // 029: invokevirtual ModeSetting.isAllowedValue (Ljava/lang/String;)Z
      // 02c: istore 6
      // 02e: istore 4
      // 030: aload 0
      // 031: iload 4
      // 033: ifne 04b
      // 036: invokespecial jgv.zuz ()Z
      // 039: ifeq 051
      // 03c: goto 043
      // 03f: invokestatic jgv.a (Loov;)Loov;
      // 042: athrow
      // 043: aload 0
      // 044: goto 04b
      // 047: invokestatic jgv.a (Loov;)Loov;
      // 04a: athrow
      // 04b: getfield jgv.xzu F
      // 04e: goto 052
      // 051: fconst_0
      // 052: fstore 7
      // 054: aload 0
      // 055: aload 0
      // 056: getfield jgv.pc8 F
      // 059: fload 7
      // 05b: ldc 10.0
      // 05d: nop
      // 05e: aload 0
      // 05f: getfield jgv.pc8 F
      // 062: fload 7
      // 064: fsub
      // 065: invokestatic java/lang/Math.abs (F)F
      // 068: ldc 40.0
      // 06a: nop
      // 06b: fmul
      // 06c: invokestatic java/lang/Math.max (FF)F
      // 06f: ldc 0.4
      // 071: nop
      // 072: fmul
      // 073: invokestatic InputState.lvf (FFF)F
      // 076: putfield jgv.pc8 F
      // 079: aload 0
      // 07a: getfield jgv.vtj F
      // 07d: fconst_0
      // 07e: fcmpl
      // 07f: iload 4
      // 081: ifne 0c2
      // 084: ifne 09a
      // 087: goto 08e
      // 08a: invokestatic jgv.a (Loov;)Loov;
      // 08d: athrow
      // 08e: aload 0
      // 08f: fload 1
      // 090: putfield jgv.vtj F
      // 093: goto 09a
      // 096: invokestatic jgv.a (Loov;)Loov;
      // 099: athrow
      // 09a: aload 0
      // 09b: aload 0
      // 09c: getfield jgv.vtj F
      // 09f: fload 1
      // 0a0: ldc 10.0
      // 0a2: nop
      // 0a3: aload 0
      // 0a4: getfield jgv.vtj F
      // 0a7: fload 1
      // 0a8: fsub
      // 0a9: invokestatic java/lang/Math.abs (F)F
      // 0ac: ldc 40.0
      // 0ae: nop
      // 0af: fmul
      // 0b0: invokestatic java/lang/Math.max (FF)F
      // 0b3: ldc 0.3
      // 0b5: nop
      // 0b6: fmul
      // 0b7: invokestatic InputState.lvf (FFF)F
      // 0ba: putfield jgv.vtj F
      // 0bd: aload 5
      // 0bf: invokevirtual eka.x05 ()I
      // 0c2: i2f
      // 0c3: aload 0
      // 0c4: getfield jgv.xzu F
      // 0c7: fsub
      // 0c8: aload 0
      // 0c9: getfield jgv.pc8 F
      // 0cc: fadd
      // 0cd: fstore 8
      // 0cf: aload 5
      // 0d1: invokevirtual eka.x05 ()I
      // 0d4: i2f
      // 0d5: aload 0
      // 0d6: getfield jgv.pc8 F
      // 0d9: fadd
      // 0da: fstore 9
      // 0dc: aload 0
      // 0dd: getfield jgv.vtj F
      // 0e0: fstore 10
      // 0e2: fload 10
      // 0e4: aload 0
      // 0e5: getfield jgv._o6 F
      // 0e8: fadd
      // 0e9: fstore 11
      // 0eb: ldc -16777216
      // 0ed: nop
      // 0ee: istore 12
      // 0f0: ldc -16777216
      // 0f2: nop
      // 0f3: istore 13
      // 0f5: getstatic jgv$1.tf8 [I
      // 0f8: aload 0
      // 0f9: getfield jgv.l23 Ljgv$vro;
      // 0fc: invokevirtual jgv$vro.ordinal ()I
      // 0ff: iaload
      // 100: iload 4
      // 102: ifne 134
      // 105: tableswitch 94 1 5 39 54 69 84 39
      // 128: invokestatic jgv.a (Loov;)Loov;
      // 12b: athrow
      // 12c: ldc -12667137
      // 12e: nop
      // 12f: istore 12
      // 131: ldc -12667137
      // 133: nop
      // 134: istore 13
      // 136: iload 4
      // 138: ifeq 163
      // 13b: ldc -1065966
      // 13d: nop
      // 13e: istore 12
      // 140: ldc -1065966
      // 142: nop
      // 143: istore 13
      // 145: iload 4
      // 147: ifeq 163
      // 14a: ldc -1030329
      // 14c: nop
      // 14d: istore 12
      // 14f: ldc -1030329
      // 151: nop
      // 152: istore 13
      // 154: iload 4
      // 156: ifeq 163
      // 159: ldc -9259682
      // 15b: nop
      // 15c: istore 12
      // 15e: ldc -14439076
      // 160: nop
      // 161: istore 13
      // 163: fload 8
      // 165: fload 10
      // 167: fload 9
      // 169: fload 11
      // 16b: iload 6
      // 16d: iload 4
      // 16f: ifne 188
      // 172: ifeq 186
      // 175: goto 17c
      // 178: invokestatic jgv.a (Loov;)Loov;
      // 17b: athrow
      // 17c: ldc -13553359
      // 17e: nop
      // 17f: goto 189
      // 182: invokestatic jgv.a (Loov;)Loov;
      // 185: athrow
      // 186: ldc -789517
      // 188: nop
      // 189: invokestatic hhf.cuu (FFFFI)V
      // 18c: fload 8
      // 18e: fload 10
      // 190: fload 8
      // 192: ldc 22.0
      // 194: nop
      // 195: fadd
      // 196: fload 11
      // 198: iload 12
      // 19a: invokestatic hhf.cuu (FFFFI)V
      // 19d: aload 0
      // 19e: fload 8
      // 1a0: ldc 21.0
      // 1a2: nop
      // 1a3: fadd
      // 1a4: fload 10
      // 1a6: ldc 5.0
      // 1a8: nop
      // 1a9: fadd
      // 1aa: fload 8
      // 1ac: ldc 27.0
      // 1ae: nop
      // 1af: fadd
      // 1b0: fload 11
      // 1b2: ldc 5.0
      // 1b4: nop
      // 1b5: fsub
      // 1b6: iload 12
      // 1b8: invokevirtual jgv.ubj (FFFFI)V
      // 1bb: getstatic jsr._t0 Lcyb;
      // 1be: aload 0
      // 1bf: getfield jgv.kmv Ljava/lang/String;
      // 1c2: fload 8
      // 1c4: ldc 3.5
      // 1c6: nop
      // 1c7: fadd
      // 1c8: fload 10
      // 1ca: ldc 3.0
      // 1cc: nop
      // 1cd: fadd
      // 1ce: getstatic z7e.a2_ Lz7e;
      // 1d1: getfield z7e.k0y I
      // 1d4: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // 1d7: pop
      // 1d8: getstatic jsr.xib Lcyb;
      // 1db: aload 0
      // 1dc: getfield jgv.hfz Ljava/lang/String;
      // 1df: fload 8
      // 1e1: ldc 30.0
      // 1e3: nop
      // 1e4: fadd
      // 1e5: fload 10
      // 1e7: fconst_1
      // 1e8: fsub
      // 1e9: iload 13
      // 1eb: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // 1ee: pop
      // 1ef: getstatic jsr.kfx Lcyb;
      // 1f2: aload 0
      // 1f3: getfield jgv.y84 Ljava/lang/String;
      // 1f6: fload 8
      // 1f8: ldc 30.0
      // 1fa: nop
      // 1fb: fadd
      // 1fc: fload 10
      // 1fe: ldc 10.0
      // 200: nop
      // 201: fadd
      // 202: iload 6
      // 204: iload 4
      // 206: ifne 21d
      // 209: ifeq 21b
      // 20c: goto 213
      // 20f: invokestatic jgv.a (Loov;)Loov;
      // 212: athrow
      // 213: bipush -1
      // 214: goto 21e
      // 217: invokestatic jgv.a (Loov;)Loov;
      // 21a: athrow
      // 21b: ldc -11514032
      // 21d: nop
      // 21e: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // 221: pop
      // 222: return
   }

   public boolean wqd() {
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
      // 05: invokespecial jgv.zuz ()Z
      // 08: iload 1
      // 09: ifeq 26
      // 0c: ifeq 38
      // 0f: goto 16
      // 12: invokestatic jgv.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield jgv.pc8 F
      // 1a: aload 0
      // 1b: getfield jgv.xzu F
      // 1e: fcmpl
      // 1f: goto 26
      // 22: invokestatic jgv.a (Loov;)Loov;
      // 25: athrow
      // 26: iload 1
      // 27: ifeq 35
      // 2a: ifne 38
      // 2d: goto 34
      // 30: invokestatic jgv.a (Loov;)Loov;
      // 33: athrow
      // 34: bipush 1
      // 35: goto 39
      // 38: bipush 0
      // 39: ireturn
   }

   public float blk() {
      return this._o6;
   }

   private boolean zuz() {
      return this.ult.bgq(this.x_u);
   }

   public void ubj(float var1, float var2, float var3, float var4, int var5) {
      int var6 = OpaquePredicate.b();

      int var10000;
      label37: {
         label36: {
            try {
               float var16;
               var10000 = (var16 = var1 - var3) == 0.0F ? 0 : (var16 < 0.0F ? -1 : 1);
               if (var6 == 0) {
                  break label37;
               }

               if (var10000 >= 0) {
                  break label36;
               }
            } catch (oov var14) {
               throw a(var14);
            }

            float var7 = var1;
            var1 = var3;
            var3 = var7;
         }

         float var17;
         var10000 = (var17 = var2 - var4) == 0.0F ? 0 : (var17 < 0.0F ? -1 : 1);
      }

      label28: {
         label27: {
            try {
               if (var6 == 0) {
                  break label28;
               }

               if (var10000 >= 0) {
                  break label27;
               }
            } catch (oov var13) {
               throw a(var13);
            }

            float var15 = var2;
            var2 = var4;
            var4 = var15;
         }

         var10000 = var5 >> 24 & 0xFF;
      }

      float var8 = (float)var10000 / 255.0F;
      float var9 = (float)(var5 >> 16 & 0xFF) / 255.0F;
      float var10 = (float)(var5 >> 8 & 0xFF) / 255.0F;
      float var11 = (float)(var5 & 0xFF) / 255.0F;
      q3g var12 = jom.yut().zuq();
      hzu.spd();
      hzu.m_1();
      hzu.u39(770, 771, 1, 0);
      hzu.wn0(var9, var10, var11, var8);
      var12.ezr(7, gnl.gx3);
      var12.g5o((double)var1, (double)(var4 + 6.0F), 0.0).pzw();
      var12.g5o((double)var3, (double)var4, 0.0).pzw();
      var12.g5o((double)var3, (double)var2, 0.0).pzw();
      var12.g5o((double)var1, (double)(var2 - 6.0F), 0.0).pzw();
      jom.yut().q7g();
      hzu.rqj();
      hzu.ux6();
      hzu.wn0(1.0F, 1.0F, 1.0F, 1.0F);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7583431541235763885L, 5412640216351159478L, MethodHandles.lookup().lookupClass()).a(83816779017677L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 8056832739892L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[3];
      int var7 = 0;
      String var6 = "\u0016ø1\u0010Ë'\u0004:À©\u008c\u0018z¦f\u0094\u0010Ü×D(YCxzÉj}L5Ð|\u000f\u0010çkÂ5ÞD0f\u000b\u0092Ø\u0086Æö¦\u009d";
      int var8 = "\u0016ø1\u0010Ë'\u0004:À©\u008c\u0018z¦f\u0094\u0010Ü×D(YCxzÉj}L5Ð|\u000f\u0010çkÂ5ÞD0f\u000b\u0092Ø\u0086Æö¦\u009d".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[3];
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 2701;
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
            throw new RuntimeException("jgv", var10);
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
         throw new RuntimeException("jgv" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
