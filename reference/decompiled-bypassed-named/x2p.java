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

public class x2p extends g6r {
   public tf8 p54;
   public tf8 mu_;
   public tf8 gof;
   public tf8 iuo;
   public tf8 ggh;
   public tf8 pt7;
   public tf8 et7;
   public tf8 mo0;
   public int _5i;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public x2p() {
      long var1 = a ^ 59266975279727L;
      super();
      this._5i = 1;
      this.o15(a<"w">(9983, 7197102531248674862L ^ var1), 0, 0);
      this.o15(a<"w">(23743, 7503964139729265249L ^ var1), 0, 24);
      this.o15(a<"w">(27854, 1778160084862538266L ^ var1), 0, 10);
      this.o15(a<"w">(11353, 8898400167015600780L ^ var1), 6, 10);
      this.et7 = new tf8(this, a<"w">(2182, 1054887631200155217L ^ var1));
      this.et7.de4(a<"w">(16203, 547010468948853149L ^ var1), -2.5F, -2.0F, -3.0F, 5, 4, 5);
      this.et7.de4(a<"w">(7417, 4373226558505804329L ^ var1), -1.5F, 0.0F, -4.0F, 3, 2, 2);
      this.et7.de4(a<"w">(14116, 8897967781657463287L ^ var1), -2.0F, -3.0F, 0.0F, 1, 1, 2);
      this.et7.de4(a<"w">(10199, 2210892645220342021L ^ var1), 1.0F, -3.0F, 0.0F, 1, 1, 2);
      this.et7.i50(0.0F, 15.0F, -9.0F);
      this.mo0 = new tf8(this, 20, 0);
      this.mo0.q3x(-2.0F, 3.0F, -8.0F, 4, 16, 6, 0.0F);
      this.mo0.i50(0.0F, 12.0F, -10.0F);
      this.ggh = new tf8(this, 0, 15);
      this.ggh.ge4(-0.5F, 0.0F, 0.0F, 1, 8, 1);
      this.ggh.pod = 0.9F;
      this.ggh.i50(0.0F, 15.0F, 8.0F);
      this.pt7 = new tf8(this, 4, 15);
      this.pt7.ge4(-0.5F, 0.0F, 0.0F, 1, 8, 1);
      this.pt7.i50(0.0F, 20.0F, 14.0F);
      this.p54 = new tf8(this, 8, 13);
      this.p54.ge4(-1.0F, 0.0F, 1.0F, 2, 6, 2);
      this.p54.i50(1.1F, 18.0F, 5.0F);
      this.mu_ = new tf8(this, 8, 13);
      this.mu_.ge4(-1.0F, 0.0F, 1.0F, 2, 6, 2);
      this.mu_.i50(-1.1F, 18.0F, 5.0F);
      this.gof = new tf8(this, 40, 0);
      this.gof.ge4(-1.0F, 0.0F, 0.0F, 2, 10, 2);
      this.gof.i50(1.2F, 13.8F, -5.0F);
      this.iuo = new tf8(this, 40, 0);
      this.iuo.ge4(-1.0F, 0.0F, 0.0F, 2, 10, 2);
      this.iuo.i50(-1.2F, 13.8F, -5.0F);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   @Override
   public void s_q(EntityLivingBase var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      int var8 = OpaquePredicate.c();

      x2p var10000;
      label46: {
         label41: {
            try {
               this.ltd(var2, var3, var4, var5, var6, var7, var1);
               var10000 = this;
               if (var8 != 0) {
                  break label46;
               }

               if (!this._a0) {
                  break label41;
               }
            } catch (oov var12) {
               throw a(var12);
            }

            float var9 = 2.0F;

            try {
               hzu.dp2();
               hzu.syc(1.5F / var9, 1.5F / var9, 1.5F / var9);
               hzu.a4k(0.0F, 10.0F * var7, 4.0F * var7);
               this.et7.vca(var7);
               hzu.x3w();
               hzu.dp2();
               hzu.syc(1.0F / var9, 1.0F / var9, 1.0F / var9);
               hzu.a4k(0.0F, 24.0F * var7, 0.0F);
               this.mo0.vca(var7);
               this.p54.vca(var7);
               this.mu_.vca(var7);
               this.gof.vca(var7);
               this.iuo.vca(var7);
               this.ggh.vca(var7);
               this.pt7.vca(var7);
               hzu.x3w();
               if (var8 == 0) {
                  return;
               }
            } catch (oov var11) {
               boolean var10001 = false;
               throw a(var11);
            }
         }

         try {
            this.et7.vca(var7);
            this.mo0.vca(var7);
            this.ggh.vca(var7);
            this.pt7.vca(var7);
            this.p54.vca(var7);
            this.mu_.vca(var7);
            this.gof.vca(var7);
            var10000 = this;
         } catch (oov var10) {
            boolean var14 = false;
            throw a(var10);
         }
      }

      var10000.iuo.vca(var7);
   }

   @Override
   public void ltd(float param1, float param2, float param3, float param4, float param5, float param6, EntityLivingBase param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield x2p.et7 Ltf8;
      // 004: fload 5
      // 006: ldc 57.295776
      // 008: nop
      // 009: fdiv
      // 00a: putfield tf8.pod F
      // 00d: invokestatic OpaquePredicate.c ()I
      // 010: aload 0
      // 011: getfield x2p.et7 Ltf8;
      // 014: fload 4
      // 016: ldc 57.295776
      // 018: nop
      // 019: fdiv
      // 01a: putfield tf8.r80 F
      // 01d: istore 8
      // 01f: aload 0
      // 020: getfield x2p._5i I
      // 023: bipush 3
      // 024: iload 8
      // 026: ifne 049
      // 029: if_icmpeq 181
      // 02c: goto 033
      // 02f: invokestatic x2p.a (Loov;)Loov;
      // 032: athrow
      // 033: aload 0
      // 034: getfield x2p.mo0 Ltf8;
      // 037: ldc 1.5707964
      // 039: nop
      // 03a: putfield tf8.pod F
      // 03d: aload 0
      // 03e: getfield x2p._5i I
      // 041: bipush 2
      // 042: goto 049
      // 045: invokestatic x2p.a (Loov;)Loov;
      // 048: athrow
      // 049: iload 8
      // 04b: ifne 141
      // 04e: if_icmpne 0d5
      // 051: goto 058
      // 054: invokestatic x2p.a (Loov;)Loov;
      // 057: athrow
      // 058: aload 0
      // 059: getfield x2p.p54 Ltf8;
      // 05c: fload 1
      // 05d: ldc 0.6662
      // 05f: nop
      // 060: fmul
      // 061: invokestatic fe6.ssk (F)F
      // 064: fconst_1
      // 065: fmul
      // 066: fload 2
      // 067: fmul
      // 068: putfield tf8.pod F
      // 06b: aload 0
      // 06c: getfield x2p.mu_ Ltf8;
      // 06f: fload 1
      // 070: ldc 0.6662
      // 072: nop
      // 073: fmul
      // 074: ldc 0.3
      // 076: nop
      // 077: fadd
      // 078: invokestatic fe6.ssk (F)F
      // 07b: fconst_1
      // 07c: fmul
      // 07d: fload 2
      // 07e: fmul
      // 07f: putfield tf8.pod F
      // 082: aload 0
      // 083: getfield x2p.gof Ltf8;
      // 086: fload 1
      // 087: ldc 0.6662
      // 089: nop
      // 08a: fmul
      // 08b: ldc 3.1415927
      // 08d: nop
      // 08e: fadd
      // 08f: ldc 0.3
      // 091: nop
      // 092: fadd
      // 093: invokestatic fe6.ssk (F)F
      // 096: fconst_1
      // 097: fmul
      // 098: fload 2
      // 099: fmul
      // 09a: putfield tf8.pod F
      // 09d: aload 0
      // 09e: getfield x2p.iuo Ltf8;
      // 0a1: fload 1
      // 0a2: ldc 0.6662
      // 0a4: nop
      // 0a5: fmul
      // 0a6: ldc 3.1415927
      // 0a8: nop
      // 0a9: fadd
      // 0aa: invokestatic fe6.ssk (F)F
      // 0ad: fconst_1
      // 0ae: fmul
      // 0af: fload 2
      // 0b0: fmul
      // 0b1: putfield tf8.pod F
      // 0b4: aload 0
      // 0b5: getfield x2p.pt7 Ltf8;
      // 0b8: ldc 1.7278761
      // 0ba: nop
      // 0bb: ldc 0.31415927
      // 0bd: nop
      // 0be: fload 1
      // 0bf: invokestatic fe6.ssk (F)F
      // 0c2: fmul
      // 0c3: fload 2
      // 0c4: fmul
      // 0c5: fadd
      // 0c6: putfield tf8.pod F
      // 0c9: iload 8
      // 0cb: ifeq 181
      // 0ce: goto 0d5
      // 0d1: invokestatic x2p.a (Loov;)Loov;
      // 0d4: athrow
      // 0d5: aload 0
      // 0d6: getfield x2p.p54 Ltf8;
      // 0d9: fload 1
      // 0da: ldc 0.6662
      // 0dc: nop
      // 0dd: fmul
      // 0de: invokestatic fe6.ssk (F)F
      // 0e1: fconst_1
      // 0e2: fmul
      // 0e3: fload 2
      // 0e4: fmul
      // 0e5: putfield tf8.pod F
      // 0e8: aload 0
      // 0e9: getfield x2p.mu_ Ltf8;
      // 0ec: fload 1
      // 0ed: ldc 0.6662
      // 0ef: nop
      // 0f0: fmul
      // 0f1: ldc 3.1415927
      // 0f3: nop
      // 0f4: fadd
      // 0f5: invokestatic fe6.ssk (F)F
      // 0f8: fconst_1
      // 0f9: fmul
      // 0fa: fload 2
      // 0fb: fmul
      // 0fc: putfield tf8.pod F
      // 0ff: aload 0
      // 100: getfield x2p.gof Ltf8;
      // 103: fload 1
      // 104: ldc 0.6662
      // 106: nop
      // 107: fmul
      // 108: ldc 3.1415927
      // 10a: nop
      // 10b: fadd
      // 10c: invokestatic fe6.ssk (F)F
      // 10f: fconst_1
      // 110: fmul
      // 111: fload 2
      // 112: fmul
      // 113: putfield tf8.pod F
      // 116: aload 0
      // 117: getfield x2p.iuo Ltf8;
      // 11a: fload 1
      // 11b: ldc 0.6662
      // 11d: nop
      // 11e: fmul
      // 11f: invokestatic fe6.ssk (F)F
      // 122: fconst_1
      // 123: fmul
      // 124: fload 2
      // 125: fmul
      // 126: putfield tf8.pod F
      // 129: aload 0
      // 12a: iload 8
      // 12c: ifne 16d
      // 12f: goto 136
      // 132: invokestatic x2p.a (Loov;)Loov;
      // 135: athrow
      // 136: getfield x2p._5i I
      // 139: bipush 1
      // 13a: goto 141
      // 13d: invokestatic x2p.a (Loov;)Loov;
      // 140: athrow
      // 141: if_icmpne 165
      // 144: aload 0
      // 145: getfield x2p.pt7 Ltf8;
      // 148: ldc 1.7278761
      // 14a: nop
      // 14b: ldc 0.7853982
      // 14d: nop
      // 14e: fload 1
      // 14f: invokestatic fe6.ssk (F)F
      // 152: fmul
      // 153: fload 2
      // 154: fmul
      // 155: fadd
      // 156: putfield tf8.pod F
      // 159: iload 8
      // 15b: ifeq 181
      // 15e: goto 165
      // 161: invokestatic x2p.a (Loov;)Loov;
      // 164: athrow
      // 165: aload 0
      // 166: goto 16d
      // 169: invokestatic x2p.a (Loov;)Loov;
      // 16c: athrow
      // 16d: getfield x2p.pt7 Ltf8;
      // 170: ldc 1.7278761
      // 172: nop
      // 173: ldc 0.47123894
      // 175: nop
      // 176: fload 1
      // 177: invokestatic fe6.ssk (F)F
      // 17a: fmul
      // 17b: fload 2
      // 17c: fmul
      // 17d: fadd
      // 17e: putfield tf8.pod F
      // 181: return
   }

   @Override
   public void v3g(Entity param1, float param2, float param3, float param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: checkcast hu3
      // 004: astore 6
      // 006: invokestatic OpaquePredicate.b ()I
      // 009: aload 0
      // 00a: getfield x2p.mo0 Ltf8;
      // 00d: ldc 12.0
      // 00f: nop
      // 010: putfield tf8.ca7 F
      // 013: aload 0
      // 014: getfield x2p.mo0 Ltf8;
      // 017: ldc -10.0
      // 019: nop
      // 01a: putfield tf8.kit F
      // 01d: istore 5
      // 01f: aload 0
      // 020: getfield x2p.et7 Ltf8;
      // 023: ldc 15.0
      // 025: nop
      // 026: putfield tf8.ca7 F
      // 029: aload 0
      // 02a: getfield x2p.et7 Ltf8;
      // 02d: ldc -9.0
      // 02f: nop
      // 030: putfield tf8.kit F
      // 033: aload 0
      // 034: getfield x2p.ggh Ltf8;
      // 037: ldc 15.0
      // 039: nop
      // 03a: putfield tf8.ca7 F
      // 03d: aload 0
      // 03e: getfield x2p.ggh Ltf8;
      // 041: ldc 8.0
      // 043: nop
      // 044: putfield tf8.kit F
      // 047: aload 0
      // 048: getfield x2p.pt7 Ltf8;
      // 04b: ldc 20.0
      // 04d: nop
      // 04e: putfield tf8.ca7 F
      // 051: aload 0
      // 052: getfield x2p.pt7 Ltf8;
      // 055: ldc 14.0
      // 057: nop
      // 058: putfield tf8.kit F
      // 05b: aload 0
      // 05c: getfield x2p.gof Ltf8;
      // 05f: aload 0
      // 060: getfield x2p.iuo Ltf8;
      // 063: ldc 13.8
      // 065: nop
      // 066: dup_x1
      // 067: putfield tf8.ca7 F
      // 06a: putfield tf8.ca7 F
      // 06d: aload 0
      // 06e: getfield x2p.gof Ltf8;
      // 071: aload 0
      // 072: getfield x2p.iuo Ltf8;
      // 075: ldc -5.0
      // 077: nop
      // 078: dup_x1
      // 079: putfield tf8.kit F
      // 07c: putfield tf8.kit F
      // 07f: aload 0
      // 080: getfield x2p.p54 Ltf8;
      // 083: aload 0
      // 084: getfield x2p.mu_ Ltf8;
      // 087: ldc 18.0
      // 089: nop
      // 08a: dup_x1
      // 08b: putfield tf8.ca7 F
      // 08e: putfield tf8.ca7 F
      // 091: aload 0
      // 092: getfield x2p.p54 Ltf8;
      // 095: aload 0
      // 096: getfield x2p.mu_ Ltf8;
      // 099: ldc 5.0
      // 09b: nop
      // 09c: dup_x1
      // 09d: putfield tf8.kit F
      // 0a0: putfield tf8.kit F
      // 0a3: aload 0
      // 0a4: getfield x2p.ggh Ltf8;
      // 0a7: ldc 0.9
      // 0a9: nop
      // 0aa: putfield tf8.pod F
      // 0ad: aload 6
      // 0af: invokevirtual hu3.hzv ()Z
      // 0b2: iload 5
      // 0b4: ifeq 135
      // 0b7: ifeq 129
      // 0ba: goto 0c1
      // 0bd: invokestatic x2p.a (Loov;)Loov;
      // 0c0: athrow
      // 0c1: aload 0
      // 0c2: getfield x2p.mo0 Ltf8;
      // 0c5: dup
      // 0c6: getfield tf8.ca7 F
      // 0c9: fconst_1
      // 0ca: fadd
      // 0cb: putfield tf8.ca7 F
      // 0ce: aload 0
      // 0cf: getfield x2p.et7 Ltf8;
      // 0d2: dup
      // 0d3: getfield tf8.ca7 F
      // 0d6: fconst_2
      // 0d7: fadd
      // 0d8: putfield tf8.ca7 F
      // 0db: aload 0
      // 0dc: getfield x2p.ggh Ltf8;
      // 0df: dup
      // 0e0: getfield tf8.ca7 F
      // 0e3: fconst_1
      // 0e4: fadd
      // 0e5: putfield tf8.ca7 F
      // 0e8: aload 0
      // 0e9: getfield x2p.pt7 Ltf8;
      // 0ec: dup
      // 0ed: getfield tf8.ca7 F
      // 0f0: ldc -4.0
      // 0f2: nop
      // 0f3: fadd
      // 0f4: putfield tf8.ca7 F
      // 0f7: aload 0
      // 0f8: getfield x2p.pt7 Ltf8;
      // 0fb: dup
      // 0fc: getfield tf8.kit F
      // 0ff: fconst_2
      // 100: fadd
      // 101: putfield tf8.kit F
      // 104: aload 0
      // 105: getfield x2p.ggh Ltf8;
      // 108: ldc 1.5707964
      // 10a: nop
      // 10b: putfield tf8.pod F
      // 10e: aload 0
      // 10f: getfield x2p.pt7 Ltf8;
      // 112: ldc 1.5707964
      // 114: nop
      // 115: putfield tf8.pod F
      // 118: aload 0
      // 119: bipush 0
      // 11a: putfield x2p._5i I
      // 11d: iload 5
      // 11f: ifne 2ac
      // 122: goto 129
      // 125: invokestatic x2p.a (Loov;)Loov;
      // 128: athrow
      // 129: aload 6
      // 12b: invokevirtual hu3.ew1 ()Z
      // 12e: goto 135
      // 131: invokestatic x2p.a (Loov;)Loov;
      // 134: athrow
      // 135: iload 5
      // 137: ifeq 190
      // 13a: ifeq 184
      // 13d: goto 144
      // 140: invokestatic x2p.a (Loov;)Loov;
      // 143: athrow
      // 144: aload 0
      // 145: getfield x2p.pt7 Ltf8;
      // 148: aload 0
      // 149: getfield x2p.ggh Ltf8;
      // 14c: getfield tf8.ca7 F
      // 14f: putfield tf8.ca7 F
      // 152: aload 0
      // 153: getfield x2p.pt7 Ltf8;
      // 156: dup
      // 157: getfield tf8.kit F
      // 15a: fconst_2
      // 15b: fadd
      // 15c: putfield tf8.kit F
      // 15f: aload 0
      // 160: getfield x2p.ggh Ltf8;
      // 163: ldc 1.5707964
      // 165: nop
      // 166: putfield tf8.pod F
      // 169: aload 0
      // 16a: getfield x2p.pt7 Ltf8;
      // 16d: ldc 1.5707964
      // 16f: nop
      // 170: putfield tf8.pod F
      // 173: aload 0
      // 174: bipush 2
      // 175: putfield x2p._5i I
      // 178: iload 5
      // 17a: ifne 2ac
      // 17d: goto 184
      // 180: invokestatic x2p.a (Loov;)Loov;
      // 183: athrow
      // 184: aload 6
      // 186: invokevirtual hu3.ird ()Z
      // 189: goto 190
      // 18c: invokestatic x2p.a (Loov;)Loov;
      // 18f: athrow
      // 190: ifeq 2a0
      // 193: aload 0
      // 194: getfield x2p.mo0 Ltf8;
      // 197: ldc 0.7853982
      // 199: nop
      // 19a: putfield tf8.pod F
      // 19d: aload 0
      // 19e: getfield x2p.mo0 Ltf8;
      // 1a1: dup
      // 1a2: getfield tf8.ca7 F
      // 1a5: ldc -4.0
      // 1a7: nop
      // 1a8: fadd
      // 1a9: putfield tf8.ca7 F
      // 1ac: aload 0
      // 1ad: getfield x2p.mo0 Ltf8;
      // 1b0: dup
      // 1b1: getfield tf8.kit F
      // 1b4: ldc 5.0
      // 1b6: nop
      // 1b7: fadd
      // 1b8: putfield tf8.kit F
      // 1bb: aload 0
      // 1bc: getfield x2p.et7 Ltf8;
      // 1bf: dup
      // 1c0: getfield tf8.ca7 F
      // 1c3: ldc -3.3
      // 1c5: nop
      // 1c6: fadd
      // 1c7: putfield tf8.ca7 F
      // 1ca: aload 0
      // 1cb: getfield x2p.et7 Ltf8;
      // 1ce: dup
      // 1cf: getfield tf8.kit F
      // 1d2: fconst_1
      // 1d3: fadd
      // 1d4: putfield tf8.kit F
      // 1d7: aload 0
      // 1d8: getfield x2p.ggh Ltf8;
      // 1db: dup
      // 1dc: getfield tf8.ca7 F
      // 1df: ldc 8.0
      // 1e1: nop
      // 1e2: fadd
      // 1e3: putfield tf8.ca7 F
      // 1e6: aload 0
      // 1e7: getfield x2p.ggh Ltf8;
      // 1ea: dup
      // 1eb: getfield tf8.kit F
      // 1ee: ldc -2.0
      // 1f0: nop
      // 1f1: fadd
      // 1f2: putfield tf8.kit F
      // 1f5: aload 0
      // 1f6: getfield x2p.pt7 Ltf8;
      // 1f9: dup
      // 1fa: getfield tf8.ca7 F
      // 1fd: fconst_2
      // 1fe: fadd
      // 1ff: putfield tf8.ca7 F
      // 202: aload 0
      // 203: getfield x2p.pt7 Ltf8;
      // 206: dup
      // 207: getfield tf8.kit F
      // 20a: ldc -0.8
      // 20c: nop
      // 20d: fadd
      // 20e: putfield tf8.kit F
      // 211: aload 0
      // 212: getfield x2p.ggh Ltf8;
      // 215: ldc 1.7278761
      // 217: nop
      // 218: putfield tf8.pod F
      // 21b: aload 0
      // 21c: getfield x2p.pt7 Ltf8;
      // 21f: ldc 2.670354
      // 221: nop
      // 222: putfield tf8.pod F
      // 225: aload 0
      // 226: getfield x2p.gof Ltf8;
      // 229: aload 0
      // 22a: getfield x2p.iuo Ltf8;
      // 22d: ldc -0.15707964
      // 22f: nop
      // 230: dup_x1
      // 231: putfield tf8.pod F
      // 234: putfield tf8.pod F
      // 237: aload 0
      // 238: getfield x2p.gof Ltf8;
      // 23b: aload 0
      // 23c: getfield x2p.iuo Ltf8;
      // 23f: ldc 15.8
      // 241: nop
      // 242: dup_x1
      // 243: putfield tf8.ca7 F
      // 246: putfield tf8.ca7 F
      // 249: aload 0
      // 24a: getfield x2p.gof Ltf8;
      // 24d: aload 0
      // 24e: getfield x2p.iuo Ltf8;
      // 251: ldc -7.0
      // 253: nop
      // 254: dup_x1
      // 255: putfield tf8.kit F
      // 258: putfield tf8.kit F
      // 25b: aload 0
      // 25c: getfield x2p.p54 Ltf8;
      // 25f: aload 0
      // 260: getfield x2p.mu_ Ltf8;
      // 263: ldc -1.5707964
      // 265: nop
      // 266: dup_x1
      // 267: putfield tf8.pod F
      // 26a: putfield tf8.pod F
      // 26d: aload 0
      // 26e: getfield x2p.p54 Ltf8;
      // 271: aload 0
      // 272: getfield x2p.mu_ Ltf8;
      // 275: ldc 21.0
      // 277: nop
      // 278: dup_x1
      // 279: putfield tf8.ca7 F
      // 27c: putfield tf8.ca7 F
      // 27f: aload 0
      // 280: getfield x2p.p54 Ltf8;
      // 283: aload 0
      // 284: getfield x2p.mu_ Ltf8;
      // 287: fconst_1
      // 288: dup_x1
      // 289: putfield tf8.kit F
      // 28c: putfield tf8.kit F
      // 28f: aload 0
      // 290: bipush 3
      // 291: putfield x2p._5i I
      // 294: iload 5
      // 296: ifne 2ac
      // 299: goto 2a0
      // 29c: invokestatic x2p.a (Loov;)Loov;
      // 29f: athrow
      // 2a0: aload 0
      // 2a1: bipush 1
      // 2a2: putfield x2p._5i I
      // 2a5: goto 2ac
      // 2a8: invokestatic x2p.a (Loov;)Loov;
      // 2ab: athrow
      // 2ac: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2287321832917121000L, -4534932710757869227L, MethodHandles.lookup().lookupClass()).a(96957421744288L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 117526732481653L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[9];
      int var7 = 0;
      String var6 = "\u0003Ø¨\u0084NÎõAI\u0015¹d\u0098ÌDç\u0010¢åâ\u0006\u008e\u0013\rè\u000fqù\u009bðI¿P \u0010ë\u0004\u0097\u0016=\u0086äh\u007f\rÂ_Òb|CE\u000bpðB\u001eu-òb\u0084\u001e<»ô µÕ*¼²¾4¿\u0002çøMÃÝÚ÷\u0081Ï#¦Ã©|Û£\u0018Õ®ú;)\u0099\u0010\u0007\"'ÑM$\u008dÛyC\u001dâÅ>,M\u0010?è¬\u0090\u008f\u000f\u008aÌ\u008d²áúÆ[\u0085í\u0010 ó/\u0004fã\u008dsÐ\f@Ï\u0012ñ¦É";
      int var8 = "\u0003Ø¨\u0084NÎõAI\u0015¹d\u0098ÌDç\u0010¢åâ\u0006\u008e\u0013\rè\u000fqù\u009bðI¿P \u0010ë\u0004\u0097\u0016=\u0086äh\u007f\rÂ_Òb|CE\u000bpðB\u001eu-òb\u0084\u001e<»ô µÕ*¼²¾4¿\u0002çøMÃÝÚ÷\u0081Ï#¦Ã©|Û£\u0018Õ®ú;)\u0099\u0010\u0007\"'ÑM$\u008dÛyC\u001dâÅ>,M\u0010?è¬\u0090\u008f\u000f\u008aÌ\u008d²áúÆ[\u0085í\u0010 ó/\u0004fã\u008dsÐ\f@Ï\u0012ñ¦É"
         .length();
      char var5 = 16;
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
                     b = var9;
                     c = new String[9];
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

                  var6 = "\u0083G\u0003\u0095CÝ+\u0093|ä\u0013Dê¡îáÆ¤\u0096#E\u000e®Õ<\u001cÈgÍÄ½] \u0007Eªïý\u0011\bà¼Ù°x\u001bödK¹Ó-ëÅ®®³É\u0013ã\u0004P¥\u000f9";
                  var8 = "\u0083G\u0003\u0095CÝ+\u0093|ä\u0013Dê¡îáÆ¤\u0096#E\u000e®Õ<\u001cÈgÍÄ½] \u0007Eªïý\u0011\bà¼Ù°x\u001bödK¹Ó-ëÅ®®³É\u0013ã\u0004P¥\u000f9"
                     .length();
                  var5 = ' ';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16382;
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
            throw new RuntimeException("x2p", var10);
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
         throw new RuntimeException("x2p" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
