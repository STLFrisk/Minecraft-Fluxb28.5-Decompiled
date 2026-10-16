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

public abstract class ttt {
   private long bzo;
   public ttt ty5;
   private long e7q;
   public long j8t;
   private static final long b;
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public static ttt[] wdj(long param0, gxq param2, String param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: new rsc
      // 003: dup
      // 004: lconst_1
      // 005: invokespecial rsc.<init> (J)V
      // 008: astore 5
      // 00a: new mi8
      // 00d: dup
      // 00e: ldc2_w 2000
      // 011: aload 5
      // 013: invokespecial mi8.<init> (JLttt;)V
      // 016: astore 5
      // 018: new olc
      // 01b: dup
      // 01c: lconst_1
      // 01d: aload 5
      // 01f: invokespecial olc.<init> (JLttt;)V
      // 022: astore 6
      // 024: new fwg
      // 027: dup
      // 028: ldc2_w 2001
      // 02b: aload 6
      // 02d: invokespecial fwg.<init> (JLttt;)V
      // 030: astore 7
      // 032: new olc
      // 035: dup
      // 036: ldc2_w 2
      // 039: aload 7
      // 03b: invokespecial olc.<init> (JLttt;)V
      // 03e: astore 8
      // 040: new olc
      // 043: dup
      // 044: ldc2_w 50
      // 047: aload 8
      // 049: invokespecial olc.<init> (JLttt;)V
      // 04c: astore 8
      // 04e: invokestatic t9d.b ()I
      // 051: new olc
      // 054: dup
      // 055: ldc2_w 70
      // 058: aload 8
      // 05a: invokespecial olc.<init> (JLttt;)V
      // 05d: astore 8
      // 05f: new c0c
      // 062: dup
      // 063: ldc2_w 2
      // 066: aload 8
      // 068: invokespecial c0c.<init> (JLttt;)V
      // 06b: astore 9
      // 06d: new rww
      // 070: dup
      // 071: ldc2_w 2
      // 074: aload 9
      // 076: invokespecial rww.<init> (JLttt;)V
      // 079: astore 10
      // 07b: istore 4
      // 07d: new olc
      // 080: dup
      // 081: ldc2_w 3
      // 084: aload 10
      // 086: invokespecial olc.<init> (JLttt;)V
      // 089: astore 11
      // 08b: new iod
      // 08e: dup
      // 08f: ldc2_w 2
      // 092: aload 11
      // 094: getstatic iod$shc.i06 Liod$shc;
      // 097: invokespecial iod.<init> (JLttt;Liod$shc;)V
      // 09a: astore 12
      // 09c: new iod
      // 09f: dup
      // 0a0: ldc2_w 2
      // 0a3: aload 12
      // 0a5: getstatic iod$shc.glh Liod$shc;
      // 0a8: invokespecial iod.<init> (JLttt;Liod$shc;)V
      // 0ab: astore 12
      // 0ad: new iod
      // 0b0: dup
      // 0b1: ldc2_w 3
      // 0b4: aload 12
      // 0b6: getstatic iod$shc.dxb Liod$shc;
      // 0b9: invokespecial iod.<init> (JLttt;Liod$shc;)V
      // 0bc: astore 12
      // 0be: new fwg
      // 0c1: dup
      // 0c2: ldc2_w 2002
      // 0c5: aload 12
      // 0c7: invokespecial fwg.<init> (JLttt;)V
      // 0ca: astore 13
      // 0cc: new fwg
      // 0cf: dup
      // 0d0: ldc2_w 2003
      // 0d3: aload 13
      // 0d5: invokespecial fwg.<init> (JLttt;)V
      // 0d8: astore 13
      // 0da: new olc
      // 0dd: dup
      // 0de: ldc2_w 4
      // 0e1: aload 13
      // 0e3: invokespecial olc.<init> (JLttt;)V
      // 0e6: astore 14
      // 0e8: new pid
      // 0eb: dup
      // 0ec: ldc2_w 5
      // 0ef: aload 14
      // 0f1: invokespecial pid.<init> (JLttt;)V
      // 0f4: astore 15
      // 0f6: new jk2
      // 0f9: dup
      // 0fa: ldc2_w 4
      // 0fd: aload 15
      // 0ff: invokespecial jk2.<init> (JLttt;)V
      // 102: astore 16
      // 104: ldc2_w 1000
      // 107: aload 16
      // 109: bipush 0
      // 10a: invokestatic fwg.h3v (JLttt;I)Lttt;
      // 10d: astore 17
      // 10f: aconst_null
      // 110: astore 18
      // 112: bipush 4
      // 113: istore 19
      // 115: iload 19
      // 117: istore 20
      // 119: aload 2
      // 11a: getstatic gxq.jhx Lgxq;
      // 11d: if_acmpne 158
      // 120: aload 3
      // 121: iload 4
      // 123: ifeq 142
      // 126: goto 12d
      // 129: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12c: athrow
      // 12d: invokevirtual java/lang/String.length ()I
      // 130: ifle 158
      // 133: goto 13a
      // 136: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 139: athrow
      // 13a: aload 3
      // 13b: goto 142
      // 13e: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 141: athrow
      // 142: invokestatic y_h$xfc.a2n (Ljava/lang/String;)Ly_h$xfc;
      // 145: invokevirtual y_h$xfc.dnk ()Ly_h;
      // 148: astore 18
      // 14a: aload 18
      // 14c: getfield y_h.xvk I
      // 14f: istore 19
      // 151: aload 18
      // 153: getfield y_h.tiw I
      // 156: istore 20
      // 158: aload 2
      // 159: getstatic gxq.m_m Lgxq;
      // 15c: if_acmpne 163
      // 15f: bipush 6
      // 161: istore 19
      // 163: ldc2_w 1000
      // 166: aload 17
      // 168: bipush 0
      // 169: invokestatic fwg.h3v (JLttt;I)Lttt;
      // 16c: astore 21
      // 16e: new se8
      // 171: dup
      // 172: ldc2_w 100
      // 175: aload 21
      // 177: invokespecial se8.<init> (JLttt;)V
      // 17a: astore 22
      // 17c: new he2
      // 17f: dup
      // 180: ldc2_w 200
      // 183: aload 17
      // 185: aload 2
      // 186: aload 3
      // 187: invokespecial he2.<init> (JLttt;Lgxq;Ljava/lang/String;)V
      // 18a: astore 23
      // 18c: ldc2_w 1000
      // 18f: aload 23
      // 191: bipush 2
      // 192: invokestatic fwg.h3v (JLttt;I)Lttt;
      // 195: astore 24
      // 197: new uhh
      // 19a: dup
      // 19b: ldc2_w 1000
      // 19e: aload 24
      // 1a0: invokespecial uhh.<init> (JLttt;)V
      // 1a3: astore 25
      // 1a5: ldc2_w 1000
      // 1a8: aload 22
      // 1aa: bipush 2
      // 1ab: invokestatic fwg.h3v (JLttt;I)Lttt;
      // 1ae: astore 26
      // 1b0: new ebo
      // 1b3: dup
      // 1b4: ldc2_w 1000
      // 1b7: aload 25
      // 1b9: aload 26
      // 1bb: invokespecial ebo.<init> (JLttt;Lttt;)V
      // 1be: astore 27
      // 1c0: ldc2_w 1000
      // 1c3: aload 22
      // 1c5: bipush 2
      // 1c6: invokestatic fwg.h3v (JLttt;I)Lttt;
      // 1c9: astore 28
      // 1cb: ldc2_w 1000
      // 1ce: aload 28
      // 1d0: iload 20
      // 1d2: invokestatic fwg.h3v (JLttt;I)Lttt;
      // 1d5: astore 28
      // 1d7: new ceu
      // 1da: dup
      // 1db: lconst_1
      // 1dc: aload 28
      // 1de: invokespecial ceu.<init> (JLttt;)V
      // 1e1: astore 29
      // 1e3: new uit
      // 1e6: dup
      // 1e7: ldc2_w 1000
      // 1ea: aload 29
      // 1ec: invokespecial uit.<init> (JLttt;)V
      // 1ef: astore 30
      // 1f1: new qw9
      // 1f4: dup
      // 1f5: ldc2_w 1001
      // 1f8: aload 27
      // 1fa: invokespecial qw9.<init> (JLttt;)V
      // 1fd: astore 27
      // 1ff: bipush 0
      // 200: istore 31
      // 202: iload 31
      // 204: iload 19
      // 206: if_icmpge 26f
      // 209: new fwg
      // 20c: dup
      // 20d: sipush 1000
      // 210: iload 31
      // 212: iadd
      // 213: i2l
      // 214: aload 27
      // 216: invokespecial fwg.<init> (JLttt;)V
      // 219: astore 27
      // 21b: iload 31
      // 21d: iload 4
      // 21f: ifeq 23c
      // 222: ifne 23a
      // 225: goto 22c
      // 228: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22b: athrow
      // 22c: new olc
      // 22f: dup
      // 230: ldc2_w 3
      // 233: aload 27
      // 235: invokespecial olc.<init> (JLttt;)V
      // 238: astore 27
      // 23a: iload 31
      // 23c: bipush 1
      // 23d: iload 4
      // 23f: ifeq 256
      // 242: if_icmpeq 259
      // 245: goto 24c
      // 248: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24b: athrow
      // 24c: iload 19
      // 24e: bipush 1
      // 24f: goto 256
      // 252: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 255: athrow
      // 256: if_icmpne 267
      // 259: new ug2
      // 25c: dup
      // 25d: ldc2_w 1000
      // 260: aload 27
      // 262: invokespecial ug2.<init> (JLttt;)V
      // 265: astore 27
      // 267: iinc 31 1
      // 26a: iload 4
      // 26c: ifne 202
      // 26f: new uit
      // 272: dup
      // 273: ldc2_w 1000
      // 276: aload 27
      // 278: invokespecial uit.<init> (JLttt;)V
      // 27b: astore 31
      // 27d: new aud
      // 280: dup
      // 281: ldc2_w 100
      // 284: aload 31
      // 286: aload 30
      // 288: invokespecial aud.<init> (JLttt;Lttt;)V
      // 28b: astore 32
      // 28d: new mi_
      // 290: dup
      // 291: ldc2_w 10
      // 294: aload 32
      // 296: invokespecial mi_.<init> (JLttt;)V
      // 299: astore 33
      // 29b: aload 32
      // 29d: lload 0
      // 29e: invokevirtual aud.uz5 (J)V
      // 2a1: aload 33
      // 2a3: lload 0
      // 2a4: invokevirtual ttt.uz5 (J)V
      // 2a7: bipush 3
      // 2a8: anewarray 12
      // 2ab: dup
      // 2ac: bipush 0
      // 2ad: aload 32
      // 2af: aastore
      // 2b0: dup
      // 2b1: bipush 1
      // 2b2: aload 33
      // 2b4: aastore
      // 2b5: dup
      // 2b6: bipush 2
      // 2b7: aload 32
      // 2b9: aastore
      // 2ba: areturn
   }

   public ttt(long var1) {
      this.j8t = var1;
      this.j8t = this.j8t * (this.j8t * 6364136223846793005L + 1442695040888963407L);
      this.j8t += var1;
      this.j8t = this.j8t * (this.j8t * 6364136223846793005L + 1442695040888963407L);
      this.j8t += var1;
      this.j8t = this.j8t * (this.j8t * 6364136223846793005L + 1442695040888963407L);
      this.j8t += var1;
   }

   public void uz5(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: aload 0
      // 05: lload 1
      // 06: putfield ttt.bzo J
      // 09: aload 0
      // 0a: getfield ttt.ty5 Lttt;
      // 0d: iload 3
      // 0e: ifne 84
      // 11: ifnull 2a
      // 14: goto 1b
      // 17: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a: athrow
      // 1b: aload 0
      // 1c: getfield ttt.ty5 Lttt;
      // 1f: lload 1
      // 20: invokevirtual ttt.uz5 (J)V
      // 23: goto 2a
      // 26: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29: athrow
      // 2a: aload 0
      // 2b: dup
      // 2c: getfield ttt.bzo J
      // 2f: aload 0
      // 30: getfield ttt.bzo J
      // 33: ldc2_w 6364136223846793005
      // 36: lmul
      // 37: ldc2_w 1442695040888963407
      // 3a: ladd
      // 3b: lmul
      // 3c: putfield ttt.bzo J
      // 3f: aload 0
      // 40: dup
      // 41: getfield ttt.bzo J
      // 44: aload 0
      // 45: getfield ttt.j8t J
      // 48: ladd
      // 49: putfield ttt.bzo J
      // 4c: aload 0
      // 4d: dup
      // 4e: getfield ttt.bzo J
      // 51: aload 0
      // 52: getfield ttt.bzo J
      // 55: ldc2_w 6364136223846793005
      // 58: lmul
      // 59: ldc2_w 1442695040888963407
      // 5c: ladd
      // 5d: lmul
      // 5e: putfield ttt.bzo J
      // 61: aload 0
      // 62: dup
      // 63: getfield ttt.bzo J
      // 66: aload 0
      // 67: getfield ttt.j8t J
      // 6a: ladd
      // 6b: putfield ttt.bzo J
      // 6e: aload 0
      // 6f: dup
      // 70: getfield ttt.bzo J
      // 73: aload 0
      // 74: getfield ttt.bzo J
      // 77: ldc2_w 6364136223846793005
      // 7a: lmul
      // 7b: ldc2_w 1442695040888963407
      // 7e: ladd
      // 7f: lmul
      // 80: putfield ttt.bzo J
      // 83: aload 0
      // 84: dup
      // 85: getfield ttt.bzo J
      // 88: aload 0
      // 89: getfield ttt.j8t J
      // 8c: ladd
      // 8d: putfield ttt.bzo J
      // 90: return
   }

   public void drx(long var1, long var3) {
      this.e7q = this.bzo;
      this.e7q = this.e7q * (this.e7q * 6364136223846793005L + 1442695040888963407L);
      this.e7q += var1;
      this.e7q = this.e7q * (this.e7q * 6364136223846793005L + 1442695040888963407L);
      this.e7q += var3;
      this.e7q = this.e7q * (this.e7q * 6364136223846793005L + 1442695040888963407L);
      this.e7q += var1;
      this.e7q = this.e7q * (this.e7q * 6364136223846793005L + 1442695040888963407L);
      this.e7q += var3;
   }

   public int nbt(int var1) {
      int var2 = t9d.c();
      int var3 = (int)((this.e7q >> 24) % (long)var1);

      label20: {
         try {
            if (var2 != 0) {
               return var3;
            }

            if (var3 >= 0) {
               break label20;
            }
         } catch (oov var4) {
            throw a(var4);
         }

         var3 += var1;
      }

      this.e7q = this.e7q * (this.e7q * 6364136223846793005L + 1442695040888963407L);
      this.e7q = this.e7q + this.bzo;
      return var3;
   }

   public abstract int[] ub9(int var1, int var2, int var3, int var4);

   public static boolean c_r(int param0, int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic ttt.b J
      // 003: ldc2_w 89224973031087
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic t9d.c ()I
      // 00b: istore 4
      // 00d: iload 0
      // 00e: iload 1
      // 00f: iload 4
      // 011: ifne 02b
      // 014: if_icmpne 024
      // 017: goto 01e
      // 01a: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01d: athrow
      // 01e: bipush 1
      // 01f: ireturn
      // 020: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 023: athrow
      // 024: iload 0
      // 025: getstatic gyu.q2z Lgyu;
      // 028: getfield gyu.mu9 I
      // 02b: iload 4
      // 02d: ifne 140
      // 030: if_icmpeq 12d
      // 033: goto 03a
      // 036: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 039: athrow
      // 03a: iload 0
      // 03b: getstatic gyu.rml Lgyu;
      // 03e: getfield gyu.mu9 I
      // 041: iload 4
      // 043: ifne 140
      // 046: goto 04d
      // 049: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04c: athrow
      // 04d: if_icmpeq 12d
      // 050: goto 057
      // 053: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 056: athrow
      // 057: iload 0
      // 058: invokestatic gyu.lxy (I)Lgyu;
      // 05b: astore 5
      // 05d: iload 1
      // 05e: invokestatic gyu.lxy (I)Lgyu;
      // 061: astore 6
      // 063: aload 5
      // 065: iload 4
      // 067: ifne 076
      // 06a: ifnull 08f
      // 06d: goto 074
      // 070: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 073: athrow
      // 074: aload 6
      // 076: iload 4
      // 078: ifne 087
      // 07b: ifnull 08f
      // 07e: goto 085
      // 081: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 084: athrow
      // 085: aload 5
      // 087: aload 6
      // 089: invokevirtual gyu.yrl (Lgyu;)Z
      // 08c: goto 090
      // 08f: bipush 0
      // 090: ireturn
      // 091: astore 7
      // 093: aload 7
      // 095: sipush 9750
      // 098: ldc2_w 7629947541774640421
      // 09b: lload 2
      // 09c: lxor
      // 09d: invokedynamic d (IJ)Ljava/lang/String; bsm=ttt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a2: nop
      // 0a3: invokestatic e1i.cor (Ljava/lang/Throwable;Ljava/lang/String;)Le1i;
      // 0a6: astore 8
      // 0a8: aload 8
      // 0aa: sipush 16951
      // 0ad: ldc2_w 8365104812071633158
      // 0b0: lload 2
      // 0b1: lxor
      // 0b2: invokedynamic d (IJ)Ljava/lang/String; bsm=ttt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b7: nop
      // 0b8: invokevirtual e1i.i_r (Ljava/lang/String;)Lwsc;
      // 0bb: astore 9
      // 0bd: aload 9
      // 0bf: sipush 31809
      // 0c2: ldc2_w 7157997096225374067
      // 0c5: lload 2
      // 0c6: lxor
      // 0c7: invokedynamic d (IJ)Ljava/lang/String; bsm=ttt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: nop
      // 0cd: iload 0
      // 0ce: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0d1: invokevirtual wsc._0p (Ljava/lang/String;Ljava/lang/Object;)V
      // 0d4: aload 9
      // 0d6: sipush 15108
      // 0d9: ldc2_w 6960322691852482610
      // 0dc: lload 2
      // 0dd: lxor
      // 0de: invokedynamic d (IJ)Ljava/lang/String; bsm=ttt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e3: nop
      // 0e4: iload 1
      // 0e5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0e8: invokevirtual wsc._0p (Ljava/lang/String;Ljava/lang/Object;)V
      // 0eb: aload 9
      // 0ed: sipush 25167
      // 0f0: ldc2_w 3375133575786586488
      // 0f3: lload 2
      // 0f4: lxor
      // 0f5: invokedynamic d (IJ)Ljava/lang/String; bsm=ttt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa: nop
      // 0fb: new ttt$1
      // 0fe: dup
      // 0ff: aload 5
      // 101: invokespecial ttt$1.<init> (Lgyu;)V
      // 104: invokevirtual wsc.h1o (Ljava/lang/String;Ljava/util/concurrent/Callable;)V
      // 107: aload 9
      // 109: sipush 9231
      // 10c: ldc2_w 2641987629140289343
      // 10f: lload 2
      // 110: lxor
      // 111: invokedynamic d (IJ)Ljava/lang/String; bsm=ttt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 116: nop
      // 117: new ttt$2
      // 11a: dup
      // 11b: aload 6
      // 11d: invokespecial ttt$2.<init> (Lgyu;)V
      // 120: invokevirtual wsc.h1o (Ljava/lang/String;Ljava/util/concurrent/Callable;)V
      // 123: new oov
      // 126: dup
      // 127: aload 8
      // 129: invokespecial oov.<init> (Le1i;)V
      // 12c: athrow
      // 12d: iload 1
      // 12e: iload 4
      // 130: ifne 168
      // 133: getstatic gyu.q2z Lgyu;
      // 136: getfield gyu.mu9 I
      // 139: goto 140
      // 13c: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13f: athrow
      // 140: if_icmpeq 160
      // 143: iload 1
      // 144: iload 4
      // 146: ifne 168
      // 149: goto 150
      // 14c: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14f: athrow
      // 150: getstatic gyu.rml Lgyu;
      // 153: getfield gyu.mu9 I
      // 156: if_icmpne 16b
      // 159: goto 160
      // 15c: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15f: athrow
      // 160: bipush 1
      // 161: goto 168
      // 164: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 167: athrow
      // 168: goto 16c
      // 16b: bipush 0
      // 16c: ireturn
   }

   public static boolean bj_(int param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: iload 0
      // 05: iload 1
      // 06: ifeq 59
      // 09: getstatic gyu.jzy Lgyu;
      // 0c: getfield gyu.mu9 I
      // 0f: if_icmpeq 51
      // 12: goto 19
      // 15: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: iload 0
      // 1a: iload 1
      // 1b: ifeq 59
      // 1e: goto 25
      // 21: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: getstatic gyu.knf Lgyu;
      // 28: getfield gyu.mu9 I
      // 2b: if_icmpeq 51
      // 2e: goto 35
      // 31: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 34: athrow
      // 35: iload 0
      // 36: iload 1
      // 37: ifeq 59
      // 3a: goto 41
      // 3d: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 40: athrow
      // 41: getstatic gyu.wlo Lgyu;
      // 44: getfield gyu.mu9 I
      // 47: if_icmpne 5c
      // 4a: goto 51
      // 4d: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 50: athrow
      // 51: bipush 1
      // 52: goto 59
      // 55: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 58: athrow
      // 59: goto 5d
      // 5c: bipush 0
      // 5d: ireturn
   }

   public int d3q(int[] var1) {
      return var1[this.nbt(var1.length)];
   }

   public int m6x(int param1, int param2, int param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 5
      // 005: iload 2
      // 006: iload 3
      // 007: iload 5
      // 009: ifeq 039
      // 00c: if_icmpne 037
      // 00f: goto 016
      // 012: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 015: athrow
      // 016: iload 3
      // 017: iload 4
      // 019: iload 5
      // 01b: ifeq 039
      // 01e: goto 025
      // 021: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 024: athrow
      // 025: if_icmpne 037
      // 028: goto 02f
      // 02b: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02e: athrow
      // 02f: iload 2
      // 030: goto 20c
      // 033: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 036: athrow
      // 037: iload 1
      // 038: iload 2
      // 039: iload 5
      // 03b: ifeq 06a
      // 03e: if_icmpne 068
      // 041: goto 048
      // 044: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 047: athrow
      // 048: iload 1
      // 049: iload 3
      // 04a: iload 5
      // 04c: ifeq 06a
      // 04f: goto 056
      // 052: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 055: athrow
      // 056: if_icmpne 068
      // 059: goto 060
      // 05c: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05f: athrow
      // 060: iload 1
      // 061: goto 20c
      // 064: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 067: athrow
      // 068: iload 1
      // 069: iload 2
      // 06a: iload 5
      // 06c: ifeq 09c
      // 06f: if_icmpne 09a
      // 072: goto 079
      // 075: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 078: athrow
      // 079: iload 1
      // 07a: iload 4
      // 07c: iload 5
      // 07e: ifeq 09c
      // 081: goto 088
      // 084: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 087: athrow
      // 088: if_icmpne 09a
      // 08b: goto 092
      // 08e: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 091: athrow
      // 092: iload 1
      // 093: goto 20c
      // 096: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 099: athrow
      // 09a: iload 1
      // 09b: iload 3
      // 09c: iload 5
      // 09e: ifeq 0ce
      // 0a1: if_icmpne 0cc
      // 0a4: goto 0ab
      // 0a7: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0aa: athrow
      // 0ab: iload 1
      // 0ac: iload 4
      // 0ae: iload 5
      // 0b0: ifeq 0ce
      // 0b3: goto 0ba
      // 0b6: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b9: athrow
      // 0ba: if_icmpne 0cc
      // 0bd: goto 0c4
      // 0c0: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c3: athrow
      // 0c4: iload 1
      // 0c5: goto 20c
      // 0c8: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0cb: athrow
      // 0cc: iload 1
      // 0cd: iload 2
      // 0ce: iload 5
      // 0d0: ifeq 100
      // 0d3: if_icmpne 0fe
      // 0d6: goto 0dd
      // 0d9: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0dc: athrow
      // 0dd: iload 3
      // 0de: iload 4
      // 0e0: iload 5
      // 0e2: ifeq 100
      // 0e5: goto 0ec
      // 0e8: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0eb: athrow
      // 0ec: if_icmpeq 0fe
      // 0ef: goto 0f6
      // 0f2: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f5: athrow
      // 0f6: iload 1
      // 0f7: goto 20c
      // 0fa: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fd: athrow
      // 0fe: iload 1
      // 0ff: iload 3
      // 100: iload 5
      // 102: ifeq 133
      // 105: if_icmpne 130
      // 108: goto 10f
      // 10b: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10e: athrow
      // 10f: iload 2
      // 110: iload 4
      // 112: iload 5
      // 114: ifeq 133
      // 117: goto 11e
      // 11a: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11d: athrow
      // 11e: if_icmpeq 130
      // 121: goto 128
      // 124: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 127: athrow
      // 128: iload 1
      // 129: goto 20c
      // 12c: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12f: athrow
      // 130: iload 1
      // 131: iload 4
      // 133: iload 5
      // 135: ifeq 164
      // 138: if_icmpne 162
      // 13b: goto 142
      // 13e: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 141: athrow
      // 142: iload 2
      // 143: iload 3
      // 144: iload 5
      // 146: ifeq 164
      // 149: goto 150
      // 14c: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14f: athrow
      // 150: if_icmpeq 162
      // 153: goto 15a
      // 156: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 159: athrow
      // 15a: iload 1
      // 15b: goto 20c
      // 15e: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 161: athrow
      // 162: iload 2
      // 163: iload 3
      // 164: iload 5
      // 166: ifeq 197
      // 169: if_icmpne 194
      // 16c: goto 173
      // 16f: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 172: athrow
      // 173: iload 1
      // 174: iload 4
      // 176: iload 5
      // 178: ifeq 197
      // 17b: goto 182
      // 17e: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 181: athrow
      // 182: if_icmpeq 194
      // 185: goto 18c
      // 188: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18b: athrow
      // 18c: iload 2
      // 18d: goto 20c
      // 190: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 193: athrow
      // 194: iload 2
      // 195: iload 4
      // 197: iload 5
      // 199: ifeq 1c9
      // 19c: if_icmpne 1c6
      // 19f: goto 1a6
      // 1a2: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a5: athrow
      // 1a6: iload 1
      // 1a7: iload 3
      // 1a8: iload 5
      // 1aa: ifeq 1c9
      // 1ad: goto 1b4
      // 1b0: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b3: athrow
      // 1b4: if_icmpeq 1c6
      // 1b7: goto 1be
      // 1ba: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1bd: athrow
      // 1be: iload 2
      // 1bf: goto 20c
      // 1c2: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c5: athrow
      // 1c6: iload 3
      // 1c7: iload 4
      // 1c9: iload 5
      // 1cb: ifeq 1ed
      // 1ce: if_icmpne 1f4
      // 1d1: goto 1d8
      // 1d4: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d7: athrow
      // 1d8: iload 1
      // 1d9: iload 5
      // 1db: ifeq 1f1
      // 1de: goto 1e5
      // 1e1: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e4: athrow
      // 1e5: iload 2
      // 1e6: goto 1ed
      // 1e9: invokestatic ttt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ec: athrow
      // 1ed: if_icmpeq 1f4
      // 1f0: iload 3
      // 1f1: goto 20c
      // 1f4: aload 0
      // 1f5: bipush 4
      // 1f6: newarray 10
      // 1f8: dup
      // 1f9: bipush 0
      // 1fa: iload 1
      // 1fb: iastore
      // 1fc: dup
      // 1fd: bipush 1
      // 1fe: iload 2
      // 1ff: iastore
      // 200: dup
      // 201: bipush 2
      // 202: iload 3
      // 203: iastore
      // 204: dup
      // 205: bipush 3
      // 206: iload 4
      // 208: iastore
      // 209: invokevirtual ttt.d3q ([I)I
      // 20c: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(3182164527545340972L, 6490229491659498441L, MethodHandles.lookup().lookupClass()).a(182183638470833L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 28829324012190L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[6];
      int var7 = 0;
      String var6 = "\u0080l¥{\u008b®öÄ\u0094æ6óÂV\u0003É\u0080\u0092µ\u0086âl®D¾)\u009bã\u0018ºÐ?(^Ê²;qÀo\u001ea'á\u0083\u007f½¯\"]O\u0002]âQ\u0013;£\u0087·Lk\u00adÅ\n×.\u0012$\u0016Wî¥\u0010à\u0097jsÚüOj\u0083\u0087t«.\u0006 Z(ÏÆð\u0081Ú?ê\u009b\\1ó\u0010\u0013(»\u000f\u0083ÕÌ\u008f^x9¡(»oâ\u001cO\u0010 \u0015è\\2\u0093\u0098\u0018\u0007";
      int var8 = "\u0080l¥{\u008b®öÄ\u0094æ6óÂV\u0003É\u0080\u0092µ\u0086âl®D¾)\u009bã\u0018ºÐ?(^Ê²;qÀo\u001ea'á\u0083\u007f½¯\"]O\u0002]âQ\u0013;£\u0087·Lk\u00adÅ\n×.\u0012$\u0016Wî¥\u0010à\u0097jsÚüOj\u0083\u0087t«.\u0006 Z(ÏÆð\u0081Ú?ê\u009b\\1ó\u0010\u0013(»\u000f\u0083ÕÌ\u008f^x9¡(»oâ\u001cO\u0010 \u0015è\\2\u0093\u0098\u0018\u0007"
         .length();
      char var5 = ' ';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     c = var9;
                     d = new String[6];
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

                  var6 = "}\u00958\u008b*\u0091QöÚ³\u0087Ùí\u00011Ó°JÕ\u0092úöÄ\u0006}\u008f\u0000Îqç\\Q\u0010\u0014SP\tô\u0003¬\u001e/}8!¤«\u0007Í";
                  var8 = "}\u00958\u008b*\u0091QöÚ³\u0087Ùí\u00011Ó°JÕ\u0092úöÄ\u0006}\u008f\u0000Îqç\\Q\u0010\u0014SP\tô\u0003¬\u001e/}8!¤«\u0007Í".length();
                  var5 = ' ';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static Throwable a(Throwable var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 19369;
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
            throw new RuntimeException("ttt", var10);
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
         d[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("ttt" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
