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

public class h67 extends g_3 {
   private static final wis w8l;
   private static final wis ypj;
   private static final wis wr0;
   private static final wis li5;
   private static final wis ecl;
   private static final wis qf4;
   private final erg[] pld = new erg[5];
   private boolean uu1;
   private long ssm;
   private int g7l;
   private boolean dup;
   private wis nyw;
   private wis wy5;
   private wis dpg;
   private wis ci4;
   private wis dyd;
   private wis _qz;
   private static final long c;
   private static final String[] d;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public h67(t9d var1) {
      super(var1);
      this.nyw = w8l;
      this.wy5 = ypj;
      this.dpg = wr0;
      this.ci4 = li5;
      this.dyd = ecl;
      this._qz = qf4;
      this.i11(true);
      this.kvx = this.opd();
      this.yxc(0.5F, 1.975F);
   }

   public h67(t9d var1, double var2, double var4, double var6) {
      this(var1);
      this.m6_(var2, var4, var6);
   }

   @Override
   public boolean de5() {
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
      // 05: invokespecial g_3.de5 ()Z
      // 08: iload 1
      // 09: ifne 21
      // 0c: ifeq 33
      // 0f: goto 16
      // 12: invokestatic h67.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: invokevirtual h67.opd ()Z
      // 1a: goto 21
      // 1d: invokestatic h67.a (Loov;)Loov;
      // 20: athrow
      // 21: iload 1
      // 22: ifne 30
      // 25: ifne 33
      // 28: goto 2f
      // 2b: invokestatic h67.a (Loov;)Loov;
      // 2e: athrow
      // 2f: bipush 1
      // 30: goto 34
      // 33: bipush 0
      // 34: ireturn
   }

   @Override
   public void tbj() {
      super.tbj();
      this.oit.kp2(10, (byte)0);
      this.oit.kp2(11, w8l);
      this.oit.kp2(12, ypj);
      this.oit.kp2(13, wr0);
      this.oit.kp2(14, li5);
      this.oit.kp2(15, ecl);
      this.oit.kp2(16, qf4);
   }

   @Override
   public erg tsc() {
      return this.pld[0];
   }

   @Override
   public erg rnq(int var1) {
      return this.pld[var1];
   }

   @Override
   public erg wfg(int var1) {
      return this.pld[var1 + 1];
   }

   @Override
   public void fga(int var1, erg var2) {
      this.pld[var1] = var2;
   }

   @Override
   public erg[] n7a() {
      return this.pld;
   }

   @Override
   public boolean ltx(int param1, erg param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: iload 1
      // 05: bipush 99
      // 07: iload 3
      // 08: ifne 28
      // 0b: if_icmpne 1c
      // 0e: goto 15
      // 11: invokestatic h67.a (Loov;)Loov;
      // 14: athrow
      // 15: bipush 0
      // 16: istore 4
      // 18: iload 3
      // 19: ifeq 60
      // 1c: iload 1
      // 1d: bipush 100
      // 1f: isub
      // 20: bipush 1
      // 21: goto 28
      // 24: invokestatic h67.a (Loov;)Loov;
      // 27: athrow
      // 28: iadd
      // 29: istore 4
      // 2b: iload 4
      // 2d: iload 3
      // 2e: ifne 5f
      // 31: iflt 57
      // 34: goto 3b
      // 37: invokestatic h67.a (Loov;)Loov;
      // 3a: athrow
      // 3b: iload 4
      // 3d: iload 3
      // 3e: ifne 5f
      // 41: goto 48
      // 44: invokestatic h67.a (Loov;)Loov;
      // 47: athrow
      // 48: aload 0
      // 49: getfield h67.pld [Lerg;
      // 4c: arraylength
      // 4d: if_icmplt 60
      // 50: goto 57
      // 53: invokestatic h67.a (Loov;)Loov;
      // 56: athrow
      // 57: bipush 0
      // 58: goto 5f
      // 5b: invokestatic h67.a (Loov;)Loov;
      // 5e: athrow
      // 5f: ireturn
      // 60: aload 2
      // 61: iload 3
      // 62: ifne 70
      // 65: ifnull b9
      // 68: goto 6f
      // 6b: invokestatic h67.a (Loov;)Loov;
      // 6e: athrow
      // 6f: aload 2
      // 70: invokestatic yqv.vu5 (Lerg;)I
      // 73: iload 3
      // 74: ifne c1
      // 77: iload 4
      // 79: if_icmpeq b9
      // 7c: goto 83
      // 7f: invokestatic h67.a (Loov;)Loov;
      // 82: athrow
      // 83: iload 4
      // 85: iload 3
      // 86: ifne b8
      // 89: goto 90
      // 8c: invokestatic h67.a (Loov;)Loov;
      // 8f: athrow
      // 90: bipush 4
      // 91: if_icmpne b7
      // 94: goto 9b
      // 97: invokestatic h67.a (Loov;)Loov;
      // 9a: athrow
      // 9b: aload 2
      // 9c: invokevirtual erg.gn1 ()Lu7m;
      // 9f: instanceof gun
      // a2: iload 3
      // a3: ifne c1
      // a6: goto ad
      // a9: invokestatic h67.a (Loov;)Loov;
      // ac: athrow
      // ad: ifne b9
      // b0: goto b7
      // b3: invokestatic h67.a (Loov;)Loov;
      // b6: athrow
      // b7: bipush 0
      // b8: ireturn
      // b9: aload 0
      // ba: iload 4
      // bc: aload 2
      // bd: invokevirtual h67.fga (ILerg;)V
      // c0: bipush 1
      // c1: ireturn
   }

   @Override
   public void srs(bdo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic h67.c J
      // 003: ldc2_w 13727564395772
      // 006: lxor
      // 007: lstore 2
      // 008: aload 0
      // 009: aload 1
      // 00a: invokespecial g_3.srs (Lbdo;)V
      // 00d: invokestatic t9d.b ()I
      // 010: new qhg
      // 013: dup
      // 014: invokespecial qhg.<init> ()V
      // 017: astore 5
      // 019: istore 4
      // 01b: bipush 0
      // 01c: istore 6
      // 01e: iload 6
      // 020: aload 0
      // 021: getfield h67.pld [Lerg;
      // 024: arraylength
      // 025: if_icmpge 076
      // 028: new bdo
      // 02b: dup
      // 02c: invokespecial bdo.<init> ()V
      // 02f: astore 7
      // 031: iload 4
      // 033: ifeq 071
      // 036: aload 0
      // 037: iload 4
      // 039: ifeq 08b
      // 03c: goto 043
      // 03f: invokestatic h67.a (Loov;)Loov;
      // 042: athrow
      // 043: getfield h67.pld [Lerg;
      // 046: iload 6
      // 048: aaload
      // 049: ifnull 067
      // 04c: goto 053
      // 04f: invokestatic h67.a (Loov;)Loov;
      // 052: athrow
      // 053: aload 0
      // 054: getfield h67.pld [Lerg;
      // 057: iload 6
      // 059: aaload
      // 05a: aload 7
      // 05c: invokevirtual erg.zy4 (Lbdo;)Lbdo;
      // 05f: pop
      // 060: goto 067
      // 063: invokestatic h67.a (Loov;)Loov;
      // 066: athrow
      // 067: aload 5
      // 069: aload 7
      // 06b: invokevirtual qhg.w2j (Lgdw;)V
      // 06e: iinc 6 1
      // 071: iload 4
      // 073: ifne 01e
      // 076: aload 1
      // 077: sipush 5920
      // 07a: ldc2_w 9108057418588675622
      // 07d: lload 2
      // 07e: lxor
      // 07f: invokedynamic q (IJ)Ljava/lang/String; bsm=h67.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 084: nop
      // 085: aload 5
      // 087: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 08a: aload 0
      // 08b: invokevirtual h67.bpc ()Z
      // 08e: iload 4
      // 090: ifeq 185
      // 093: ifeq 0f1
      // 096: goto 09d
      // 099: invokestatic h67.a (Loov;)Loov;
      // 09c: athrow
      // 09d: aload 0
      // 09e: invokevirtual h67.hei ()Ljava/lang/String;
      // 0a1: iload 4
      // 0a3: ifeq 0c2
      // 0a6: goto 0ad
      // 0a9: invokestatic h67.a (Loov;)Loov;
      // 0ac: athrow
      // 0ad: ifnull 0d4
      // 0b0: goto 0b7
      // 0b3: invokestatic h67.a (Loov;)Loov;
      // 0b6: athrow
      // 0b7: aload 0
      // 0b8: invokevirtual h67.hei ()Ljava/lang/String;
      // 0bb: goto 0c2
      // 0be: invokestatic h67.a (Loov;)Loov;
      // 0c1: athrow
      // 0c2: invokevirtual java/lang/String.length ()I
      // 0c5: iload 4
      // 0c7: ifeq 185
      // 0ca: ifne 0f1
      // 0cd: goto 0d4
      // 0d0: invokestatic h67.a (Loov;)Loov;
      // 0d3: athrow
      // 0d4: aload 1
      // 0d5: sipush 9261
      // 0d8: ldc2_w 9126724855100075301
      // 0db: lload 2
      // 0dc: lxor
      // 0dd: invokedynamic q (IJ)Ljava/lang/String; bsm=h67.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e2: nop
      // 0e3: aload 0
      // 0e4: invokevirtual h67.bpc ()Z
      // 0e7: invokevirtual bdo.zyu (Ljava/lang/String;Z)V
      // 0ea: goto 0f1
      // 0ed: invokestatic h67.a (Loov;)Loov;
      // 0f0: athrow
      // 0f1: aload 1
      // 0f2: sipush 11392
      // 0f5: ldc2_w 498635638610388368
      // 0f8: lload 2
      // 0f9: lxor
      // 0fa: invokedynamic q (IJ)Ljava/lang/String; bsm=h67.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ff: nop
      // 100: aload 0
      // 101: invokevirtual h67.h5u ()Z
      // 104: invokevirtual bdo.zyu (Ljava/lang/String;Z)V
      // 107: aload 1
      // 108: sipush 28873
      // 10b: ldc2_w 4930894747302705622
      // 10e: lload 2
      // 10f: lxor
      // 110: invokedynamic q (IJ)Ljava/lang/String; bsm=h67.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 115: nop
      // 116: aload 0
      // 117: invokevirtual h67.sba ()Z
      // 11a: invokevirtual bdo.zyu (Ljava/lang/String;Z)V
      // 11d: aload 1
      // 11e: sipush 19392
      // 121: ldc2_w 1270245868529550035
      // 124: lload 2
      // 125: lxor
      // 126: invokedynamic q (IJ)Ljava/lang/String; bsm=h67.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12b: nop
      // 12c: aload 0
      // 12d: invokevirtual h67.sd0 ()Z
      // 130: invokevirtual bdo.zyu (Ljava/lang/String;Z)V
      // 133: aload 1
      // 134: sipush 9090
      // 137: ldc2_w 2425506490322872972
      // 13a: lload 2
      // 13b: lxor
      // 13c: invokedynamic q (IJ)Ljava/lang/String; bsm=h67.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 141: nop
      // 142: aload 0
      // 143: getfield h67.g7l I
      // 146: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 149: aload 1
      // 14a: sipush 23012
      // 14d: ldc2_w 1758748237083250916
      // 150: lload 2
      // 151: lxor
      // 152: invokedynamic q (IJ)Ljava/lang/String; bsm=h67.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 157: nop
      // 158: aload 0
      // 159: invokevirtual h67.opd ()Z
      // 15c: invokevirtual bdo.zyu (Ljava/lang/String;Z)V
      // 15f: aload 1
      // 160: sipush 18358
      // 163: ldc2_w 1829905861272768187
      // 166: lload 2
      // 167: lxor
      // 168: invokedynamic q (IJ)Ljava/lang/String; bsm=h67.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16d: nop
      // 16e: aload 0
      // 16f: invokevirtual h67.wvw ()Z
      // 172: invokevirtual bdo.zyu (Ljava/lang/String;Z)V
      // 175: iload 4
      // 177: ifeq 1bb
      // 17a: aload 0
      // 17b: invokevirtual h67.c8q ()Z
      // 17e: goto 185
      // 181: invokestatic h67.a (Loov;)Loov;
      // 184: athrow
      // 185: ifeq 1a5
      // 188: aload 1
      // 189: sipush 2216
      // 18c: ldc2_w 9055198244584669628
      // 18f: lload 2
      // 190: lxor
      // 191: invokedynamic q (IJ)Ljava/lang/String; bsm=h67.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 196: nop
      // 197: aload 0
      // 198: invokevirtual h67.c8q ()Z
      // 19b: invokevirtual bdo.zyu (Ljava/lang/String;Z)V
      // 19e: goto 1a5
      // 1a1: invokestatic h67.a (Loov;)Loov;
      // 1a4: athrow
      // 1a5: aload 1
      // 1a6: sipush 3648
      // 1a9: ldc2_w 7747372905423685455
      // 1ac: lload 2
      // 1ad: lxor
      // 1ae: invokedynamic q (IJ)Ljava/lang/String; bsm=h67.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b3: nop
      // 1b4: aload 0
      // 1b5: invokespecial h67.z70 ()Lbdo;
      // 1b8: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 1bb: return
   }

   @Override
   public void cjb(bdo var1) {
      long var2 = c ^ 135044371191895L;
      int var4 = t9d.b();

      label53: {
         label57: {
            try {
               super.cjb(var1);
               if (var4 == 0) {
                  break label53;
               }

               if (!var1.inh(c<"q">(11939, 4753135399794739989L ^ var2), 9)) {
                  break label57;
               }
            } catch (oov var9) {
               throw a(var9);
            }

            qhg var5 = var1.bzb(c<"q">(11939, 4753135399794739989L ^ var2), 10);
            int var6 = 0;

            while (var6 < this.pld.length) {
               try {
                  this.pld[var6] = erg.qog(var5.kd6(var6));
                  var6++;
                  if (var4 == 0) {
                     break label53;
                  }

                  if (var4 == 0) {
                     break;
                  }
               } catch (oov var8) {
                  throw a(var8);
               }
            }
         }

         this.icv(var1.dvl(c<"q">(8811, 3961988715940218876L ^ var2)));
         this.w4k(var1.dvl(c<"q">(14231, 2165285590747222560L ^ var2)));
         this.og8(var1.dvl(c<"q">(12932, 103980733134706489L ^ var2)));
         this.g7l = var1.uz7(c<"q">(18784, 4626558976280456386L ^ var2));
         this.ouc(var1.dvl(c<"q">(10086, 4195019794140005064L ^ var2)));
         this.qhe(var1.dvl(c<"q">(32270, 5535397841985067950L ^ var2)));
         this.zpe(var1.dvl(c<"q">(787, 442405056687875759L ^ var2)));
      }

      h67 var10000;
      boolean var10001;
      label35: {
         label34: {
            try {
               var10000 = this;
               var10001 = this.c8q();
               if (var4 == 0) {
                  break label35;
               }

               if (!var10001) {
                  break label34;
               }
            } catch (oov var7) {
               throw a(var7);
            }

            var10001 = false;
            break label35;
         }

         var10001 = true;
      }

      var10000.dup = var10001;
      this.kvx = this.opd();
      bdo var10 = var1.b__(c<"q">(15038, 5640780827337760519L ^ var2));
      this.omm(var10);
   }

   private void omm(bdo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic h67.c J
      // 003: ldc2_w 16032300026573
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic t9d.b ()I
      // 00b: istore 4
      // 00d: aload 1
      // 00e: sipush 4554
      // 011: ldc2_w 4377955045581416185
      // 014: lload 2
      // 015: lxor
      // 016: invokedynamic q (IJ)Ljava/lang/String; bsm=h67.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01b: nop
      // 01c: bipush 5
      // 01d: invokevirtual bdo.bzb (Ljava/lang/String;I)Lqhg;
      // 020: astore 5
      // 022: iload 4
      // 024: ifeq 04a
      // 027: aload 5
      // 029: invokevirtual qhg.vek ()I
      // 02c: ifle 04f
      // 02f: goto 036
      // 032: invokestatic h67.a (Loov;)Loov;
      // 035: athrow
      // 036: aload 0
      // 037: new wis
      // 03a: dup
      // 03b: aload 5
      // 03d: invokespecial wis.<init> (Lqhg;)V
      // 040: invokevirtual h67.zn5 (Lwis;)V
      // 043: goto 04a
      // 046: invokestatic h67.a (Loov;)Loov;
      // 049: athrow
      // 04a: iload 4
      // 04c: ifne 05d
      // 04f: aload 0
      // 050: getstatic h67.w8l Lwis;
      // 053: invokevirtual h67.zn5 (Lwis;)V
      // 056: goto 05d
      // 059: invokestatic h67.a (Loov;)Loov;
      // 05c: athrow
      // 05d: aload 1
      // 05e: sipush 12140
      // 061: ldc2_w 8052680719173703770
      // 064: lload 2
      // 065: lxor
      // 066: invokedynamic q (IJ)Ljava/lang/String; bsm=h67.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06b: nop
      // 06c: bipush 5
      // 06d: invokevirtual bdo.bzb (Ljava/lang/String;I)Lqhg;
      // 070: astore 6
      // 072: iload 4
      // 074: ifeq 09a
      // 077: aload 6
      // 079: invokevirtual qhg.vek ()I
      // 07c: ifle 09f
      // 07f: goto 086
      // 082: invokestatic h67.a (Loov;)Loov;
      // 085: athrow
      // 086: aload 0
      // 087: new wis
      // 08a: dup
      // 08b: aload 6
      // 08d: invokespecial wis.<init> (Lqhg;)V
      // 090: invokevirtual h67.lcd (Lwis;)V
      // 093: goto 09a
      // 096: invokestatic h67.a (Loov;)Loov;
      // 099: athrow
      // 09a: iload 4
      // 09c: ifne 0ad
      // 09f: aload 0
      // 0a0: getstatic h67.ypj Lwis;
      // 0a3: invokevirtual h67.lcd (Lwis;)V
      // 0a6: goto 0ad
      // 0a9: invokestatic h67.a (Loov;)Loov;
      // 0ac: athrow
      // 0ad: aload 1
      // 0ae: sipush 23660
      // 0b1: ldc2_w 4137152706485267287
      // 0b4: lload 2
      // 0b5: lxor
      // 0b6: invokedynamic q (IJ)Ljava/lang/String; bsm=h67.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bb: nop
      // 0bc: bipush 5
      // 0bd: invokevirtual bdo.bzb (Ljava/lang/String;I)Lqhg;
      // 0c0: astore 7
      // 0c2: iload 4
      // 0c4: ifeq 0ea
      // 0c7: aload 7
      // 0c9: invokevirtual qhg.vek ()I
      // 0cc: ifle 0ef
      // 0cf: goto 0d6
      // 0d2: invokestatic h67.a (Loov;)Loov;
      // 0d5: athrow
      // 0d6: aload 0
      // 0d7: new wis
      // 0da: dup
      // 0db: aload 7
      // 0dd: invokespecial wis.<init> (Lqhg;)V
      // 0e0: invokevirtual h67.nqz (Lwis;)V
      // 0e3: goto 0ea
      // 0e6: invokestatic h67.a (Loov;)Loov;
      // 0e9: athrow
      // 0ea: iload 4
      // 0ec: ifne 0fd
      // 0ef: aload 0
      // 0f0: getstatic h67.wr0 Lwis;
      // 0f3: invokevirtual h67.nqz (Lwis;)V
      // 0f6: goto 0fd
      // 0f9: invokestatic h67.a (Loov;)Loov;
      // 0fc: athrow
      // 0fd: aload 1
      // 0fe: sipush 22601
      // 101: ldc2_w 3049827522163781500
      // 104: lload 2
      // 105: lxor
      // 106: invokedynamic q (IJ)Ljava/lang/String; bsm=h67.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10b: nop
      // 10c: bipush 5
      // 10d: invokevirtual bdo.bzb (Ljava/lang/String;I)Lqhg;
      // 110: astore 8
      // 112: iload 4
      // 114: ifeq 13a
      // 117: aload 8
      // 119: invokevirtual qhg.vek ()I
      // 11c: ifle 13f
      // 11f: goto 126
      // 122: invokestatic h67.a (Loov;)Loov;
      // 125: athrow
      // 126: aload 0
      // 127: new wis
      // 12a: dup
      // 12b: aload 8
      // 12d: invokespecial wis.<init> (Lqhg;)V
      // 130: invokevirtual h67.odv (Lwis;)V
      // 133: goto 13a
      // 136: invokestatic h67.a (Loov;)Loov;
      // 139: athrow
      // 13a: iload 4
      // 13c: ifne 14d
      // 13f: aload 0
      // 140: getstatic h67.li5 Lwis;
      // 143: invokevirtual h67.odv (Lwis;)V
      // 146: goto 14d
      // 149: invokestatic h67.a (Loov;)Loov;
      // 14c: athrow
      // 14d: aload 1
      // 14e: sipush 24340
      // 151: ldc2_w 5759853880951515195
      // 154: lload 2
      // 155: lxor
      // 156: invokedynamic q (IJ)Ljava/lang/String; bsm=h67.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15b: nop
      // 15c: bipush 5
      // 15d: invokevirtual bdo.bzb (Ljava/lang/String;I)Lqhg;
      // 160: astore 9
      // 162: iload 4
      // 164: ifeq 18a
      // 167: aload 9
      // 169: invokevirtual qhg.vek ()I
      // 16c: ifle 18f
      // 16f: goto 176
      // 172: invokestatic h67.a (Loov;)Loov;
      // 175: athrow
      // 176: aload 0
      // 177: new wis
      // 17a: dup
      // 17b: aload 9
      // 17d: invokespecial wis.<init> (Lqhg;)V
      // 180: invokevirtual h67.bnd (Lwis;)V
      // 183: goto 18a
      // 186: invokestatic h67.a (Loov;)Loov;
      // 189: athrow
      // 18a: iload 4
      // 18c: ifne 19d
      // 18f: aload 0
      // 190: getstatic h67.ecl Lwis;
      // 193: invokevirtual h67.bnd (Lwis;)V
      // 196: goto 19d
      // 199: invokestatic h67.a (Loov;)Loov;
      // 19c: athrow
      // 19d: aload 1
      // 19e: sipush 16018
      // 1a1: ldc2_w 1302338615299393970
      // 1a4: lload 2
      // 1a5: lxor
      // 1a6: invokedynamic q (IJ)Ljava/lang/String; bsm=h67.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ab: nop
      // 1ac: bipush 5
      // 1ad: invokevirtual bdo.bzb (Ljava/lang/String;I)Lqhg;
      // 1b0: astore 10
      // 1b2: iload 4
      // 1b4: ifeq 1da
      // 1b7: aload 10
      // 1b9: invokevirtual qhg.vek ()I
      // 1bc: ifle 1df
      // 1bf: goto 1c6
      // 1c2: invokestatic h67.a (Loov;)Loov;
      // 1c5: athrow
      // 1c6: aload 0
      // 1c7: new wis
      // 1ca: dup
      // 1cb: aload 10
      // 1cd: invokespecial wis.<init> (Lqhg;)V
      // 1d0: invokevirtual h67._xx (Lwis;)V
      // 1d3: goto 1da
      // 1d6: invokestatic h67.a (Loov;)Loov;
      // 1d9: athrow
      // 1da: iload 4
      // 1dc: ifne 1ed
      // 1df: aload 0
      // 1e0: getstatic h67.qf4 Lwis;
      // 1e3: invokevirtual h67._xx (Lwis;)V
      // 1e6: goto 1ed
      // 1e9: invokestatic h67.a (Loov;)Loov;
      // 1ec: athrow
      // 1ed: return
   }

   private bdo z70() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic h67.c J
      // 003: ldc2_w 107028118252170
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic t9d.c ()I
      // 00b: istore 3
      // 00c: new bdo
      // 00f: dup
      // 010: invokespecial bdo.<init> ()V
      // 013: astore 4
      // 015: getstatic h67.w8l Lwis;
      // 018: aload 0
      // 019: getfield h67.nyw Lwis;
      // 01c: invokevirtual wis.equals (Ljava/lang/Object;)Z
      // 01f: iload 3
      // 020: ifne 058
      // 023: ifne 04e
      // 026: goto 02d
      // 029: invokestatic h67.a (Loov;)Loov;
      // 02c: athrow
      // 02d: aload 4
      // 02f: sipush 28479
      // 032: ldc2_w 544989393973934161
      // 035: lload 1
      // 036: lxor
      // 037: invokedynamic q (IJ)Ljava/lang/String; bsm=h67.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03c: nop
      // 03d: aload 0
      // 03e: getfield h67.nyw Lwis;
      // 041: invokevirtual wis.x4n ()Lqhg;
      // 044: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 047: goto 04e
      // 04a: invokestatic h67.a (Loov;)Loov;
      // 04d: athrow
      // 04e: getstatic h67.ypj Lwis;
      // 051: aload 0
      // 052: getfield h67.wy5 Lwis;
      // 055: invokevirtual wis.equals (Ljava/lang/Object;)Z
      // 058: iload 3
      // 059: ifne 091
      // 05c: ifne 087
      // 05f: goto 066
      // 062: invokestatic h67.a (Loov;)Loov;
      // 065: athrow
      // 066: aload 4
      // 068: sipush 18924
      // 06b: ldc2_w 7470683241869237889
      // 06e: lload 1
      // 06f: lxor
      // 070: invokedynamic q (IJ)Ljava/lang/String; bsm=h67.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 075: nop
      // 076: aload 0
      // 077: getfield h67.wy5 Lwis;
      // 07a: invokevirtual wis.x4n ()Lqhg;
      // 07d: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 080: goto 087
      // 083: invokestatic h67.a (Loov;)Loov;
      // 086: athrow
      // 087: getstatic h67.wr0 Lwis;
      // 08a: aload 0
      // 08b: getfield h67.dpg Lwis;
      // 08e: invokevirtual wis.equals (Ljava/lang/Object;)Z
      // 091: iload 3
      // 092: ifne 0ca
      // 095: ifne 0c0
      // 098: goto 09f
      // 09b: invokestatic h67.a (Loov;)Loov;
      // 09e: athrow
      // 09f: aload 4
      // 0a1: sipush 28781
      // 0a4: ldc2_w 551277467022747415
      // 0a7: lload 1
      // 0a8: lxor
      // 0a9: invokedynamic q (IJ)Ljava/lang/String; bsm=h67.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ae: nop
      // 0af: aload 0
      // 0b0: getfield h67.dpg Lwis;
      // 0b3: invokevirtual wis.x4n ()Lqhg;
      // 0b6: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 0b9: goto 0c0
      // 0bc: invokestatic h67.a (Loov;)Loov;
      // 0bf: athrow
      // 0c0: getstatic h67.li5 Lwis;
      // 0c3: aload 0
      // 0c4: getfield h67.ci4 Lwis;
      // 0c7: invokevirtual wis.equals (Ljava/lang/Object;)Z
      // 0ca: iload 3
      // 0cb: ifne 103
      // 0ce: ifne 0f9
      // 0d1: goto 0d8
      // 0d4: invokestatic h67.a (Loov;)Loov;
      // 0d7: athrow
      // 0d8: aload 4
      // 0da: sipush 5936
      // 0dd: ldc2_w 8589594392520949855
      // 0e0: lload 1
      // 0e1: lxor
      // 0e2: invokedynamic q (IJ)Ljava/lang/String; bsm=h67.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e7: nop
      // 0e8: aload 0
      // 0e9: getfield h67.ci4 Lwis;
      // 0ec: invokevirtual wis.x4n ()Lqhg;
      // 0ef: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 0f2: goto 0f9
      // 0f5: invokestatic h67.a (Loov;)Loov;
      // 0f8: athrow
      // 0f9: getstatic h67.ecl Lwis;
      // 0fc: aload 0
      // 0fd: getfield h67.dyd Lwis;
      // 100: invokevirtual wis.equals (Ljava/lang/Object;)Z
      // 103: iload 3
      // 104: ifne 13c
      // 107: ifne 132
      // 10a: goto 111
      // 10d: invokestatic h67.a (Loov;)Loov;
      // 110: athrow
      // 111: aload 4
      // 113: sipush 11144
      // 116: ldc2_w 6096915575448812799
      // 119: lload 1
      // 11a: lxor
      // 11b: invokedynamic q (IJ)Ljava/lang/String; bsm=h67.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 120: nop
      // 121: aload 0
      // 122: getfield h67.dyd Lwis;
      // 125: invokevirtual wis.x4n ()Lqhg;
      // 128: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 12b: goto 132
      // 12e: invokestatic h67.a (Loov;)Loov;
      // 131: athrow
      // 132: getstatic h67.qf4 Lwis;
      // 135: aload 0
      // 136: getfield h67._qz Lwis;
      // 139: invokevirtual wis.equals (Ljava/lang/Object;)Z
      // 13c: ifne 160
      // 13f: aload 4
      // 141: sipush 13768
      // 144: ldc2_w 4999021939057205931
      // 147: lload 1
      // 148: lxor
      // 149: invokedynamic q (IJ)Ljava/lang/String; bsm=h67.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14e: nop
      // 14f: aload 0
      // 150: getfield h67._qz Lwis;
      // 153: invokevirtual wis.x4n ()Lqhg;
      // 156: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 159: goto 160
      // 15c: invokestatic h67.a (Loov;)Loov;
      // 15f: athrow
      // 160: aload 4
      // 162: areturn
   }

   @Override
   public boolean tfh() {
      return false;
   }

   @Override
   public void v4n(i2h var1) {
   }

   @Override
   public void _v7() {
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
      // 05: getfield h67.oay Lt9d;
      // 08: aload 0
      // 09: aload 0
      // 0a: invokevirtual h67.aaw ()Lnh4;
      // 0d: invokevirtual t9d.p05 (Li2h;Lnh4;)Ljava/util/List;
      // 10: astore 2
      // 11: aload 2
      // 12: iload 1
      // 13: ifne 21
      // 16: ifnull a7
      // 19: goto 20
      // 1c: invokestatic h67.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 2
      // 21: invokeinterface java/util/List.isEmpty ()Z 1
      // 26: iload 1
      // 27: ifne 35
      // 2a: ifne a7
      // 2d: goto 34
      // 30: invokestatic h67.a (Loov;)Loov;
      // 33: athrow
      // 34: bipush 0
      // 35: istore 3
      // 36: iload 3
      // 37: aload 2
      // 38: invokeinterface java/util/List.size ()I 1
      // 3d: if_icmpge a7
      // 40: aload 2
      // 41: iload 3
      // 42: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 47: checkcast i2h
      // 4a: astore 4
      // 4c: iload 1
      // 4d: ifne a3
      // 50: aload 4
      // 52: instanceof _f3
      // 55: ifeq a0
      // 58: goto 5f
      // 5b: invokestatic h67.a (Loov;)Loov;
      // 5e: athrow
      // 5f: aload 4
      // 61: checkcast _f3
      // 64: invokevirtual _f3.x38 ()L_f3$c3d;
      // 67: getstatic _f3$c3d.g3j L_f3$c3d;
      // 6a: if_acmpne a0
      // 6d: goto 74
      // 70: invokestatic h67.a (Loov;)Loov;
      // 73: athrow
      // 74: aload 0
      // 75: iload 1
      // 76: ifne 9c
      // 79: goto 80
      // 7c: invokestatic h67.a (Loov;)Loov;
      // 7f: athrow
      // 80: aload 4
      // 82: invokevirtual h67.wxg (Li2h;)D
      // 85: ldc2_w 0.2
      // 88: dcmpg
      // 89: ifgt a0
      // 8c: goto 93
      // 8f: invokestatic h67.a (Loov;)Loov;
      // 92: athrow
      // 93: aload 4
      // 95: goto 9c
      // 98: invokestatic h67.a (Loov;)Loov;
      // 9b: athrow
      // 9c: aload 0
      // 9d: invokevirtual i2h.u_w (Li2h;)V
      // a0: iinc 3 1
      // a3: iload 1
      // a4: ifeq 36
      // a7: return
   }

   @Override
   public boolean rc1(ha9 param1, fqr param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 3
      // 004: aload 0
      // 005: invokevirtual h67.c8q ()Z
      // 008: iload 3
      // 009: ifne 023
      // 00c: ifeq 01c
      // 00f: goto 016
      // 012: invokestatic h67.a (Loov;)Loov;
      // 015: athrow
      // 016: bipush 0
      // 017: ireturn
      // 018: invokestatic h67.a (Loov;)Loov;
      // 01b: athrow
      // 01c: aload 0
      // 01d: getfield h67.oay Lt9d;
      // 020: getfield t9d.v0f Z
      // 023: iload 3
      // 024: ifne 3f4
      // 027: ifne 3f3
      // 02a: goto 031
      // 02d: invokestatic h67.a (Loov;)Loov;
      // 030: athrow
      // 031: aload 1
      // 032: invokevirtual ha9.myu ()Z
      // 035: iload 3
      // 036: ifne 3f4
      // 039: goto 040
      // 03c: invokestatic h67.a (Loov;)Loov;
      // 03f: athrow
      // 040: ifne 3f3
      // 043: goto 04a
      // 046: invokestatic h67.a (Loov;)Loov;
      // 049: athrow
      // 04a: bipush 0
      // 04b: istore 4
      // 04d: aload 1
      // 04e: invokevirtual ha9.b5z ()Lerg;
      // 051: astore 5
      // 053: aload 5
      // 055: ifnull 060
      // 058: bipush 1
      // 059: goto 061
      // 05c: invokestatic h67.a (Loov;)Loov;
      // 05f: athrow
      // 060: bipush 0
      // 061: istore 6
      // 063: iload 6
      // 065: iload 3
      // 066: ifne 118
      // 069: ifeq 116
      // 06c: goto 073
      // 06f: invokestatic h67.a (Loov;)Loov;
      // 072: athrow
      // 073: aload 5
      // 075: invokevirtual erg.gn1 ()Lu7m;
      // 078: instanceof jpt
      // 07b: iload 3
      // 07c: ifne 118
      // 07f: goto 086
      // 082: invokestatic h67.a (Loov;)Loov;
      // 085: athrow
      // 086: ifeq 116
      // 089: goto 090
      // 08c: invokestatic h67.a (Loov;)Loov;
      // 08f: athrow
      // 090: aload 5
      // 092: invokevirtual erg.gn1 ()Lu7m;
      // 095: checkcast jpt
      // 098: astore 7
      // 09a: aload 7
      // 09c: getfield jpt.nbs I
      // 09f: bipush 3
      // 0a0: iload 3
      // 0a1: ifne 0c2
      // 0a4: if_icmpne 0b5
      // 0a7: goto 0ae
      // 0aa: invokestatic h67.a (Loov;)Loov;
      // 0ad: athrow
      // 0ae: bipush 1
      // 0af: istore 4
      // 0b1: iload 3
      // 0b2: ifeq 116
      // 0b5: aload 7
      // 0b7: getfield jpt.nbs I
      // 0ba: bipush 2
      // 0bb: goto 0c2
      // 0be: invokestatic h67.a (Loov;)Loov;
      // 0c1: athrow
      // 0c2: iload 3
      // 0c3: ifne 0ef
      // 0c6: if_icmpne 0d7
      // 0c9: goto 0d0
      // 0cc: invokestatic h67.a (Loov;)Loov;
      // 0cf: athrow
      // 0d0: bipush 2
      // 0d1: istore 4
      // 0d3: iload 3
      // 0d4: ifeq 116
      // 0d7: aload 7
      // 0d9: getfield jpt.nbs I
      // 0dc: iload 3
      // 0dd: ifne 105
      // 0e0: goto 0e7
      // 0e3: invokestatic h67.a (Loov;)Loov;
      // 0e6: athrow
      // 0e7: bipush 1
      // 0e8: goto 0ef
      // 0eb: invokestatic h67.a (Loov;)Loov;
      // 0ee: athrow
      // 0ef: if_icmpne 0f9
      // 0f2: bipush 3
      // 0f3: istore 4
      // 0f5: iload 3
      // 0f6: ifeq 116
      // 0f9: aload 7
      // 0fb: getfield jpt.nbs I
      // 0fe: goto 105
      // 101: invokestatic h67.a (Loov;)Loov;
      // 104: athrow
      // 105: iload 3
      // 106: ifne 118
      // 109: ifne 116
      // 10c: goto 113
      // 10f: invokestatic h67.a (Loov;)Loov;
      // 112: athrow
      // 113: bipush 4
      // 114: istore 4
      // 116: iload 6
      // 118: ifeq 150
      // 11b: aload 5
      // 11d: invokevirtual erg.gn1 ()Lu7m;
      // 120: getstatic xbr.r9n Lu7m;
      // 123: iload 3
      // 124: ifne 14a
      // 127: goto 12e
      // 12a: invokestatic h67.a (Loov;)Loov;
      // 12d: athrow
      // 12e: if_acmpeq 14d
      // 131: goto 138
      // 134: invokestatic h67.a (Loov;)Loov;
      // 137: athrow
      // 138: aload 5
      // 13a: invokevirtual erg.gn1 ()Lu7m;
      // 13d: getstatic ox_.jzx Le0x;
      // 140: invokestatic u7m.gfm (Le0x;)Lu7m;
      // 143: goto 14a
      // 146: invokestatic h67.a (Loov;)Loov;
      // 149: athrow
      // 14a: if_acmpne 150
      // 14d: bipush 4
      // 14e: istore 4
      // 150: ldc2_w 0.1
      // 153: dstore 7
      // 155: ldc2_w 0.9
      // 158: dstore 9
      // 15a: ldc2_w 0.4
      // 15d: dstore 11
      // 15f: ldc2_w 1.6
      // 162: dstore 13
      // 164: bipush 0
      // 165: istore 15
      // 167: aload 0
      // 168: invokevirtual h67.sba ()Z
      // 16b: istore 16
      // 16d: iload 16
      // 16f: ifeq 181
      // 172: aload 2
      // 173: getfield fqr.gn5 D
      // 176: ldc2_w 2.0
      // 179: dmul
      // 17a: goto 185
      // 17d: invokestatic h67.a (Loov;)Loov;
      // 180: athrow
      // 181: aload 2
      // 182: getfield fqr.gn5 D
      // 185: dstore 17
      // 187: dload 17
      // 189: ldc2_w 0.1
      // 18c: iload 3
      // 18d: ifne 1ec
      // 190: dcmpl
      // 191: iflt 1e0
      // 194: goto 19b
      // 197: invokestatic h67.a (Loov;)Loov;
      // 19a: athrow
      // 19b: dload 17
      // 19d: ldc2_w 0.1
      // 1a0: iload 16
      // 1a2: ifeq 1b6
      // 1a5: goto 1ac
      // 1a8: invokestatic h67.a (Loov;)Loov;
      // 1ab: athrow
      // 1ac: ldc2_w 0.8
      // 1af: goto 1b9
      // 1b2: invokestatic h67.a (Loov;)Loov;
      // 1b5: athrow
      // 1b6: ldc2_w 0.45
      // 1b9: dadd
      // 1ba: iload 3
      // 1bb: ifne 1ec
      // 1be: dcmpg
      // 1bf: ifge 1e0
      // 1c2: goto 1c9
      // 1c5: invokestatic h67.a (Loov;)Loov;
      // 1c8: athrow
      // 1c9: aload 0
      // 1ca: getfield h67.pld [Lerg;
      // 1cd: bipush 1
      // 1ce: aaload
      // 1cf: ifnull 1e0
      // 1d2: goto 1d9
      // 1d5: invokestatic h67.a (Loov;)Loov;
      // 1d8: athrow
      // 1d9: bipush 1
      // 1da: istore 15
      // 1dc: iload 3
      // 1dd: ifeq 2db
      // 1e0: dload 17
      // 1e2: ldc2_w 0.9
      // 1e5: goto 1ec
      // 1e8: invokestatic h67.a (Loov;)Loov;
      // 1eb: athrow
      // 1ec: iload 16
      // 1ee: ifeq 1fb
      // 1f1: ldc2_w 0.3
      // 1f4: goto 1fc
      // 1f7: invokestatic h67.a (Loov;)Loov;
      // 1fa: athrow
      // 1fb: dconst_0
      // 1fc: dadd
      // 1fd: dcmpl
      // 1fe: iload 3
      // 1ff: ifne 25c
      // 202: iflt 24f
      // 205: goto 20c
      // 208: invokestatic h67.a (Loov;)Loov;
      // 20b: athrow
      // 20c: dload 17
      // 20e: ldc2_w 0.9
      // 211: iload 16
      // 213: ifeq 225
      // 216: goto 21d
      // 219: invokestatic h67.a (Loov;)Loov;
      // 21c: athrow
      // 21d: dconst_1
      // 21e: goto 228
      // 221: invokestatic h67.a (Loov;)Loov;
      // 224: athrow
      // 225: ldc2_w 0.7
      // 228: dadd
      // 229: dcmpg
      // 22a: iload 3
      // 22b: ifne 25c
      // 22e: ifge 24f
      // 231: goto 238
      // 234: invokestatic h67.a (Loov;)Loov;
      // 237: athrow
      // 238: aload 0
      // 239: getfield h67.pld [Lerg;
      // 23c: bipush 3
      // 23d: aaload
      // 23e: ifnull 24f
      // 241: goto 248
      // 244: invokestatic h67.a (Loov;)Loov;
      // 247: athrow
      // 248: bipush 3
      // 249: istore 15
      // 24b: iload 3
      // 24c: ifeq 2db
      // 24f: dload 17
      // 251: ldc2_w 0.4
      // 254: dcmpl
      // 255: goto 25c
      // 258: invokestatic h67.a (Loov;)Loov;
      // 25b: athrow
      // 25c: iload 3
      // 25d: ifne 2ba
      // 260: iflt 2ad
      // 263: goto 26a
      // 266: invokestatic h67.a (Loov;)Loov;
      // 269: athrow
      // 26a: dload 17
      // 26c: ldc2_w 0.4
      // 26f: iload 16
      // 271: ifeq 283
      // 274: goto 27b
      // 277: invokestatic h67.a (Loov;)Loov;
      // 27a: athrow
      // 27b: dconst_1
      // 27c: goto 286
      // 27f: invokestatic h67.a (Loov;)Loov;
      // 282: athrow
      // 283: ldc2_w 0.8
      // 286: dadd
      // 287: dcmpg
      // 288: iload 3
      // 289: ifne 2ba
      // 28c: ifge 2ad
      // 28f: goto 296
      // 292: invokestatic h67.a (Loov;)Loov;
      // 295: athrow
      // 296: aload 0
      // 297: getfield h67.pld [Lerg;
      // 29a: bipush 2
      // 29b: aaload
      // 29c: ifnull 2ad
      // 29f: goto 2a6
      // 2a2: invokestatic h67.a (Loov;)Loov;
      // 2a5: athrow
      // 2a6: bipush 2
      // 2a7: istore 15
      // 2a9: iload 3
      // 2aa: ifeq 2db
      // 2ad: dload 17
      // 2af: ldc2_w 1.6
      // 2b2: dcmpl
      // 2b3: goto 2ba
      // 2b6: invokestatic h67.a (Loov;)Loov;
      // 2b9: athrow
      // 2ba: iflt 2db
      // 2bd: aload 0
      // 2be: getfield h67.pld [Lerg;
      // 2c1: bipush 4
      // 2c2: aaload
      // 2c3: iload 3
      // 2c4: ifne 2e2
      // 2c7: goto 2ce
      // 2ca: invokestatic h67.a (Loov;)Loov;
      // 2cd: athrow
      // 2ce: ifnull 2db
      // 2d1: goto 2d8
      // 2d4: invokestatic h67.a (Loov;)Loov;
      // 2d7: athrow
      // 2d8: bipush 4
      // 2d9: istore 15
      // 2db: aload 0
      // 2dc: getfield h67.pld [Lerg;
      // 2df: iload 15
      // 2e1: aaload
      // 2e2: ifnull 2ed
      // 2e5: bipush 1
      // 2e6: goto 2ee
      // 2e9: invokestatic h67.a (Loov;)Loov;
      // 2ec: athrow
      // 2ed: bipush 0
      // 2ee: istore 19
      // 2f0: aload 0
      // 2f1: getfield h67.g7l I
      // 2f4: bipush 1
      // 2f5: iload 15
      // 2f7: ishl
      // 2f8: iand
      // 2f9: iload 3
      // 2fa: ifne 332
      // 2fd: ifne 325
      // 300: goto 307
      // 303: invokestatic h67.a (Loov;)Loov;
      // 306: athrow
      // 307: aload 0
      // 308: getfield h67.g7l I
      // 30b: bipush 1
      // 30c: iload 4
      // 30e: ishl
      // 30f: iand
      // 310: iload 3
      // 311: ifne 366
      // 314: goto 31b
      // 317: invokestatic h67.a (Loov;)Loov;
      // 31a: athrow
      // 31b: ifeq 364
      // 31e: goto 325
      // 321: invokestatic h67.a (Loov;)Loov;
      // 324: athrow
      // 325: iload 4
      // 327: istore 15
      // 329: aload 0
      // 32a: getfield h67.g7l I
      // 32d: bipush 1
      // 32e: iload 4
      // 330: ishl
      // 331: iand
      // 332: iload 3
      // 333: ifne 366
      // 336: ifeq 364
      // 339: goto 340
      // 33c: invokestatic h67.a (Loov;)Loov;
      // 33f: athrow
      // 340: aload 0
      // 341: getfield h67.g7l I
      // 344: bipush 1
      // 345: iand
      // 346: iload 3
      // 347: ifne 362
      // 34a: goto 351
      // 34d: invokestatic h67.a (Loov;)Loov;
      // 350: athrow
      // 351: ifeq 361
      // 354: goto 35b
      // 357: invokestatic h67.a (Loov;)Loov;
      // 35a: athrow
      // 35b: bipush 1
      // 35c: ireturn
      // 35d: invokestatic h67.a (Loov;)Loov;
      // 360: athrow
      // 361: bipush 0
      // 362: istore 15
      // 364: iload 6
      // 366: iload 3
      // 367: ifne 3ac
      // 36a: ifeq 3aa
      // 36d: goto 374
      // 370: invokestatic h67.a (Loov;)Loov;
      // 373: athrow
      // 374: iload 4
      // 376: iload 3
      // 377: ifne 3ac
      // 37a: goto 381
      // 37d: invokestatic h67.a (Loov;)Loov;
      // 380: athrow
      // 381: ifne 3aa
      // 384: goto 38b
      // 387: invokestatic h67.a (Loov;)Loov;
      // 38a: athrow
      // 38b: aload 0
      // 38c: invokevirtual h67.sd0 ()Z
      // 38f: iload 3
      // 390: ifne 3ac
      // 393: goto 39a
      // 396: invokestatic h67.a (Loov;)Loov;
      // 399: athrow
      // 39a: ifne 3aa
      // 39d: goto 3a4
      // 3a0: invokestatic h67.a (Loov;)Loov;
      // 3a3: athrow
      // 3a4: bipush 1
      // 3a5: ireturn
      // 3a6: invokestatic h67.a (Loov;)Loov;
      // 3a9: athrow
      // 3aa: iload 6
      // 3ac: iload 3
      // 3ad: ifne 3d5
      // 3b0: ifeq 3cc
      // 3b3: goto 3ba
      // 3b6: invokestatic h67.a (Loov;)Loov;
      // 3b9: athrow
      // 3ba: aload 0
      // 3bb: aload 1
      // 3bc: iload 4
      // 3be: invokespecial h67.mip (Lha9;I)V
      // 3c1: iload 3
      // 3c2: ifeq 3f1
      // 3c5: goto 3cc
      // 3c8: invokestatic h67.a (Loov;)Loov;
      // 3cb: athrow
      // 3cc: iload 19
      // 3ce: goto 3d5
      // 3d1: invokestatic h67.a (Loov;)Loov;
      // 3d4: athrow
      // 3d5: iload 3
      // 3d6: ifne 3f2
      // 3d9: ifeq 3f1
      // 3dc: goto 3e3
      // 3df: invokestatic h67.a (Loov;)Loov;
      // 3e2: athrow
      // 3e3: aload 0
      // 3e4: aload 1
      // 3e5: iload 15
      // 3e7: invokespecial h67.mip (Lha9;I)V
      // 3ea: goto 3f1
      // 3ed: invokestatic h67.a (Loov;)Loov;
      // 3f0: athrow
      // 3f1: bipush 1
      // 3f2: ireturn
      // 3f3: bipush 1
      // 3f4: ireturn
   }

   private void mip(ha9 param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 3
      // 004: aload 0
      // 005: getfield h67.pld [Lerg;
      // 008: iload 2
      // 009: aaload
      // 00a: astore 4
      // 00c: aload 4
      // 00e: iload 3
      // 00f: ifeq 03a
      // 012: ifnull 031
      // 015: goto 01c
      // 018: invokestatic h67.a (Loov;)Loov;
      // 01b: athrow
      // 01c: aload 0
      // 01d: getfield h67.g7l I
      // 020: bipush 1
      // 021: iload 2
      // 022: bipush 8
      // 024: iadd
      // 025: ishl
      // 026: iand
      // 027: ifne 16d
      // 02a: goto 031
      // 02d: invokestatic h67.a (Loov;)Loov;
      // 030: athrow
      // 031: aload 4
      // 033: goto 03a
      // 036: invokestatic h67.a (Loov;)Loov;
      // 039: athrow
      // 03a: ifnonnull 05d
      // 03d: aload 0
      // 03e: getfield h67.g7l I
      // 041: bipush 1
      // 042: iload 2
      // 043: bipush 16
      // 045: iadd
      // 046: ishl
      // 047: iand
      // 048: iload 3
      // 049: ifeq 06b
      // 04c: goto 053
      // 04f: invokestatic h67.a (Loov;)Loov;
      // 052: athrow
      // 053: ifne 16d
      // 056: goto 05d
      // 059: invokestatic h67.a (Loov;)Loov;
      // 05c: athrow
      // 05d: aload 1
      // 05e: getfield ha9.up_ Ljnq;
      // 061: getfield jnq.nb5 I
      // 064: goto 06b
      // 067: invokestatic h67.a (Loov;)Loov;
      // 06a: athrow
      // 06b: istore 5
      // 06d: aload 1
      // 06e: getfield ha9.up_ Ljnq;
      // 071: iload 5
      // 073: invokevirtual jnq.ibn (I)Lerg;
      // 076: astore 6
      // 078: aload 1
      // 079: getfield ha9.lls Lpj2;
      // 07c: getfield pj2.g40 Z
      // 07f: ifeq 0e8
      // 082: aload 4
      // 084: iload 3
      // 085: ifeq 0c2
      // 088: goto 08f
      // 08b: invokestatic h67.a (Loov;)Loov;
      // 08e: athrow
      // 08f: ifnull 0b9
      // 092: goto 099
      // 095: invokestatic h67.a (Loov;)Loov;
      // 098: athrow
      // 099: aload 4
      // 09b: iload 3
      // 09c: ifeq 0f1
      // 09f: goto 0a6
      // 0a2: invokestatic h67.a (Loov;)Loov;
      // 0a5: athrow
      // 0a6: invokevirtual erg.gn1 ()Lu7m;
      // 0a9: getstatic ox_.ibw Le0x;
      // 0ac: invokestatic u7m.gfm (Le0x;)Lu7m;
      // 0af: if_acmpne 0e8
      // 0b2: goto 0b9
      // 0b5: invokestatic h67.a (Loov;)Loov;
      // 0b8: athrow
      // 0b9: aload 6
      // 0bb: goto 0c2
      // 0be: invokestatic h67.a (Loov;)Loov;
      // 0c1: athrow
      // 0c2: iload 3
      // 0c3: ifeq 0f1
      // 0c6: ifnull 0e8
      // 0c9: goto 0d0
      // 0cc: invokestatic h67.a (Loov;)Loov;
      // 0cf: athrow
      // 0d0: aload 6
      // 0d2: invokevirtual erg.yaq ()Lerg;
      // 0d5: astore 7
      // 0d7: aload 7
      // 0d9: bipush 1
      // 0da: putfield erg.qd2 I
      // 0dd: aload 0
      // 0de: iload 2
      // 0df: aload 7
      // 0e1: invokevirtual h67.fga (ILerg;)V
      // 0e4: iload 3
      // 0e5: ifne 16d
      // 0e8: aload 6
      // 0ea: goto 0f1
      // 0ed: invokestatic h67.a (Loov;)Loov;
      // 0f0: athrow
      // 0f1: iload 3
      // 0f2: ifeq 101
      // 0f5: ifnull 154
      // 0f8: goto 0ff
      // 0fb: invokestatic h67.a (Loov;)Loov;
      // 0fe: athrow
      // 0ff: aload 6
      // 101: iload 3
      // 102: ifeq 11c
      // 105: getfield erg.qd2 I
      // 108: bipush 1
      // 109: if_icmple 154
      // 10c: goto 113
      // 10f: invokestatic h67.a (Loov;)Loov;
      // 112: athrow
      // 113: aload 4
      // 115: goto 11c
      // 118: invokestatic h67.a (Loov;)Loov;
      // 11b: athrow
      // 11c: iload 3
      // 11d: ifeq 136
      // 120: ifnonnull 16d
      // 123: goto 12a
      // 126: invokestatic h67.a (Loov;)Loov;
      // 129: athrow
      // 12a: aload 6
      // 12c: invokevirtual erg.yaq ()Lerg;
      // 12f: goto 136
      // 132: invokestatic h67.a (Loov;)Loov;
      // 135: athrow
      // 136: astore 7
      // 138: aload 7
      // 13a: bipush 1
      // 13b: putfield erg.qd2 I
      // 13e: aload 0
      // 13f: iload 2
      // 140: aload 7
      // 142: invokevirtual h67.fga (ILerg;)V
      // 145: aload 6
      // 147: dup
      // 148: getfield erg.qd2 I
      // 14b: bipush 1
      // 14c: isub
      // 14d: putfield erg.qd2 I
      // 150: iload 3
      // 151: ifne 16d
      // 154: aload 0
      // 155: iload 2
      // 156: aload 6
      // 158: invokevirtual h67.fga (ILerg;)V
      // 15b: aload 1
      // 15c: getfield ha9.up_ Ljnq;
      // 15f: iload 5
      // 161: aload 4
      // 163: invokevirtual jnq.cxl (ILerg;)V
      // 166: goto 16d
      // 169: invokestatic h67.a (Loov;)Loov;
      // 16c: athrow
      // 16d: return
   }

   @Override
   public boolean m1t(ofh param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic h67.c J
      // 003: ldc2_w 104829197095916
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic t9d.b ()I
      // 00b: istore 5
      // 00d: aload 0
      // 00e: getfield h67.oay Lt9d;
      // 011: getfield t9d.v0f Z
      // 014: iload 5
      // 016: ifeq 030
      // 019: ifeq 029
      // 01c: goto 023
      // 01f: invokestatic h67.a (Loov;)Loov;
      // 022: athrow
      // 023: bipush 0
      // 024: ireturn
      // 025: invokestatic h67.a (Loov;)Loov;
      // 028: athrow
      // 029: getstatic ofh.r2b Lofh;
      // 02c: aload 1
      // 02d: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 030: iload 5
      // 032: ifeq 04e
      // 035: ifeq 049
      // 038: goto 03f
      // 03b: invokestatic h67.a (Loov;)Loov;
      // 03e: athrow
      // 03f: aload 0
      // 040: invokevirtual h67._kl ()V
      // 043: bipush 0
      // 044: ireturn
      // 045: invokestatic h67.a (Loov;)Loov;
      // 048: athrow
      // 049: aload 0
      // 04a: aload 1
      // 04b: invokevirtual h67.nss (Lofh;)Z
      // 04e: iload 5
      // 050: ifeq 286
      // 053: ifne 285
      // 056: goto 05d
      // 059: invokestatic h67.a (Loov;)Loov;
      // 05c: athrow
      // 05d: aload 0
      // 05e: getfield h67.uu1 Z
      // 061: iload 5
      // 063: ifeq 286
      // 066: goto 06d
      // 069: invokestatic h67.a (Loov;)Loov;
      // 06c: athrow
      // 06d: ifne 285
      // 070: goto 077
      // 073: invokestatic h67.a (Loov;)Loov;
      // 076: athrow
      // 077: aload 0
      // 078: invokevirtual h67.c8q ()Z
      // 07b: iload 5
      // 07d: ifeq 286
      // 080: goto 087
      // 083: invokestatic h67.a (Loov;)Loov;
      // 086: athrow
      // 087: ifne 285
      // 08a: goto 091
      // 08d: invokestatic h67.a (Loov;)Loov;
      // 090: athrow
      // 091: aload 1
      // 092: invokevirtual ofh.yto ()Z
      // 095: iload 5
      // 097: ifeq 0c0
      // 09a: goto 0a1
      // 09d: invokestatic h67.a (Loov;)Loov;
      // 0a0: athrow
      // 0a1: ifeq 0b9
      // 0a4: goto 0ab
      // 0a7: invokestatic h67.a (Loov;)Loov;
      // 0aa: athrow
      // 0ab: aload 0
      // 0ac: invokespecial h67.zv7 ()V
      // 0af: aload 0
      // 0b0: invokevirtual h67._kl ()V
      // 0b3: bipush 0
      // 0b4: ireturn
      // 0b5: invokestatic h67.a (Loov;)Loov;
      // 0b8: athrow
      // 0b9: getstatic ofh.pho Lofh;
      // 0bc: aload 1
      // 0bd: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 0c0: iload 5
      // 0c2: ifeq 111
      // 0c5: ifeq 10a
      // 0c8: goto 0cf
      // 0cb: invokestatic h67.a (Loov;)Loov;
      // 0ce: athrow
      // 0cf: aload 0
      // 0d0: iload 5
      // 0d2: ifeq 102
      // 0d5: goto 0dc
      // 0d8: invokestatic h67.a (Loov;)Loov;
      // 0db: athrow
      // 0dc: invokevirtual h67.agj ()Z
      // 0df: ifne 0fa
      // 0e2: goto 0e9
      // 0e5: invokestatic h67.a (Loov;)Loov;
      // 0e8: athrow
      // 0e9: aload 0
      // 0ea: bipush 5
      // 0eb: invokevirtual h67.k03 (I)V
      // 0ee: iload 5
      // 0f0: ifne 108
      // 0f3: goto 0fa
      // 0f6: invokestatic h67.a (Loov;)Loov;
      // 0f9: athrow
      // 0fa: aload 0
      // 0fb: goto 102
      // 0fe: invokestatic h67.a (Loov;)Loov;
      // 101: athrow
      // 102: ldc 0.15
      // 104: nop
      // 105: invokespecial h67.zjo (F)V
      // 108: bipush 0
      // 109: ireturn
      // 10a: getstatic ofh.rpg Lofh;
      // 10d: aload 1
      // 10e: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 111: iload 5
      // 113: ifeq 160
      // 116: ifeq 14b
      // 119: goto 120
      // 11c: invokestatic h67.a (Loov;)Loov;
      // 11f: athrow
      // 120: aload 0
      // 121: invokevirtual h67.i55 ()F
      // 124: ldc 0.5
      // 126: nop
      // 127: fcmpl
      // 128: iload 5
      // 12a: ifeq 160
      // 12d: goto 134
      // 130: invokestatic h67.a (Loov;)Loov;
      // 133: athrow
      // 134: ifle 14b
      // 137: goto 13e
      // 13a: invokestatic h67.a (Loov;)Loov;
      // 13d: athrow
      // 13e: aload 0
      // 13f: ldc 4.0
      // 141: nop
      // 142: invokespecial h67.zjo (F)V
      // 145: bipush 0
      // 146: ireturn
      // 147: invokestatic h67.a (Loov;)Loov;
      // 14a: athrow
      // 14b: sipush 7744
      // 14e: ldc2_w 6170920819863302227
      // 151: lload 3
      // 152: lxor
      // 153: invokedynamic q (IJ)Ljava/lang/String; bsm=h67.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 158: nop
      // 159: aload 1
      // 15a: invokevirtual ofh.p_f ()Ljava/lang/String;
      // 15d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 160: istore 6
      // 162: sipush 28422
      // 165: ldc2_w 9159830614635757836
      // 168: lload 3
      // 169: lxor
      // 16a: invokedynamic q (IJ)Ljava/lang/String; bsm=h67.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16f: nop
      // 170: aload 1
      // 171: invokevirtual ofh.p_f ()Ljava/lang/String;
      // 174: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 177: istore 7
      // 179: iload 7
      // 17b: iload 5
      // 17d: ifeq 1af
      // 180: ifne 1a8
      // 183: goto 18a
      // 186: invokestatic h67.a (Loov;)Loov;
      // 189: athrow
      // 18a: iload 6
      // 18c: iload 5
      // 18e: ifeq 1af
      // 191: goto 198
      // 194: invokestatic h67.a (Loov;)Loov;
      // 197: athrow
      // 198: ifne 1a8
      // 19b: goto 1a2
      // 19e: invokestatic h67.a (Loov;)Loov;
      // 1a1: athrow
      // 1a2: bipush 0
      // 1a3: ireturn
      // 1a4: invokestatic h67.a (Loov;)Loov;
      // 1a7: athrow
      // 1a8: aload 1
      // 1a9: invokevirtual ofh.f8d ()Li2h;
      // 1ac: instanceof hy9
      // 1af: iload 5
      // 1b1: ifeq 1d3
      // 1b4: ifeq 1cc
      // 1b7: goto 1be
      // 1ba: invokestatic h67.a (Loov;)Loov;
      // 1bd: athrow
      // 1be: aload 1
      // 1bf: invokevirtual ofh.f8d ()Li2h;
      // 1c2: invokevirtual i2h._kl ()V
      // 1c5: goto 1cc
      // 1c8: invokestatic h67.a (Loov;)Loov;
      // 1cb: athrow
      // 1cc: aload 1
      // 1cd: invokevirtual ofh.nra ()Li2h;
      // 1d0: instanceof ha9
      // 1d3: iload 5
      // 1d5: ifeq 20f
      // 1d8: ifeq 20b
      // 1db: goto 1e2
      // 1de: invokestatic h67.a (Loov;)Loov;
      // 1e1: athrow
      // 1e2: aload 1
      // 1e3: invokevirtual ofh.nra ()Li2h;
      // 1e6: checkcast ha9
      // 1e9: getfield ha9.lls Lpj2;
      // 1ec: getfield pj2.x4a Z
      // 1ef: iload 5
      // 1f1: ifeq 20f
      // 1f4: goto 1fb
      // 1f7: invokestatic h67.a (Loov;)Loov;
      // 1fa: athrow
      // 1fb: ifne 20b
      // 1fe: goto 205
      // 201: invokestatic h67.a (Loov;)Loov;
      // 204: athrow
      // 205: bipush 0
      // 206: ireturn
      // 207: invokestatic h67.a (Loov;)Loov;
      // 20a: athrow
      // 20b: aload 1
      // 20c: invokevirtual ofh.neg ()Z
      // 20f: iload 5
      // 211: ifeq 22e
      // 214: ifeq 22f
      // 217: goto 21e
      // 21a: invokestatic h67.a (Loov;)Loov;
      // 21d: athrow
      // 21e: aload 0
      // 21f: invokespecial h67.up9 ()V
      // 222: aload 0
      // 223: invokevirtual h67._kl ()V
      // 226: bipush 0
      // 227: goto 22e
      // 22a: invokestatic h67.a (Loov;)Loov;
      // 22d: athrow
      // 22e: ireturn
      // 22f: aload 0
      // 230: getfield h67.oay Lt9d;
      // 233: invokevirtual t9d.p2b ()J
      // 236: lstore 8
      // 238: iload 5
      // 23a: ifeq 27f
      // 23d: lload 8
      // 23f: aload 0
      // 240: getfield h67.ssm J
      // 243: lsub
      // 244: ldc2_w 5
      // 247: lcmp
      // 248: ifle 270
      // 24b: goto 252
      // 24e: invokestatic h67.a (Loov;)Loov;
      // 251: athrow
      // 252: iload 6
      // 254: ifne 270
      // 257: goto 25e
      // 25a: invokestatic h67.a (Loov;)Loov;
      // 25d: athrow
      // 25e: aload 0
      // 25f: lload 8
      // 261: putfield h67.ssm J
      // 264: iload 5
      // 266: ifne 283
      // 269: goto 270
      // 26c: invokestatic h67.a (Loov;)Loov;
      // 26f: athrow
      // 270: aload 0
      // 271: invokespecial h67.bmo ()V
      // 274: aload 0
      // 275: invokespecial h67.up9 ()V
      // 278: goto 27f
      // 27b: invokestatic h67.a (Loov;)Loov;
      // 27e: athrow
      // 27f: aload 0
      // 280: invokevirtual h67._kl ()V
      // 283: bipush 0
      // 284: ireturn
      // 285: bipush 0
      // 286: ireturn
   }

   @Override
   public boolean xvv(double param1) {
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
      // 05: invokevirtual h67.aaw ()Lnh4;
      // 08: invokevirtual nh4.liq ()D
      // 0b: ldc2_w 4.0
      // 0e: dmul
      // 0f: dstore 4
      // 11: dload 4
      // 13: iload 3
      // 14: ifne 40
      // 17: invokestatic java/lang/Double.isNaN (D)Z
      // 1a: ifne 3d
      // 1d: goto 24
      // 20: invokestatic h67.a (Loov;)Loov;
      // 23: athrow
      // 24: dload 4
      // 26: dconst_0
      // 27: dcmpl
      // 28: iload 3
      // 29: ifne 51
      // 2c: goto 33
      // 2f: invokestatic h67.a (Loov;)Loov;
      // 32: athrow
      // 33: ifne 42
      // 36: goto 3d
      // 39: invokestatic h67.a (Loov;)Loov;
      // 3c: athrow
      // 3d: ldc2_w 4.0
      // 40: dstore 4
      // 42: dload 4
      // 44: ldc2_w 64.0
      // 47: dmul
      // 48: dstore 4
      // 4a: dload 1
      // 4b: dload 4
      // 4d: dload 4
      // 4f: dmul
      // 50: dcmpg
      // 51: iload 3
      // 52: ifne 60
      // 55: ifge 63
      // 58: goto 5f
      // 5b: invokestatic h67.a (Loov;)Loov;
      // 5e: athrow
      // 5f: bipush 1
      // 60: goto 64
      // 63: bipush 0
      // 64: ireturn
   }

   private void up9() {
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
      // 05: getfield h67.oay Lt9d;
      // 08: iload 1
      // 09: ifne 24
      // 0c: instanceof dug
      // 0f: ifeq 72
      // 12: goto 19
      // 15: invokestatic h67.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield h67.oay Lt9d;
      // 1d: goto 24
      // 20: invokestatic h67.a (Loov;)Loov;
      // 23: athrow
      // 24: checkcast dug
      // 27: getstatic w_0.jxl Lw_0;
      // 2a: aload 0
      // 2b: getfield h67.o2v D
      // 2e: aload 0
      // 2f: getfield h67.kfp D
      // 32: aload 0
      // 33: getfield h67.ikl F
      // 36: f2d
      // 37: ldc2_w 1.5
      // 3a: ddiv
      // 3b: dadd
      // 3c: aload 0
      // 3d: getfield h67.vbd D
      // 40: bipush 10
      // 42: aload 0
      // 43: getfield h67.uo6 F
      // 46: ldc 4.0
      // 48: nop
      // 49: fdiv
      // 4a: f2d
      // 4b: aload 0
      // 4c: getfield h67.ikl F
      // 4f: ldc 4.0
      // 51: nop
      // 52: fdiv
      // 53: f2d
      // 54: aload 0
      // 55: getfield h67.uo6 F
      // 58: ldc 4.0
      // 5a: nop
      // 5b: fdiv
      // 5c: f2d
      // 5d: ldc2_w 0.05
      // 60: bipush 1
      // 61: newarray 10
      // 63: dup
      // 64: bipush 0
      // 65: getstatic ox_.wb7 Le0x;
      // 68: invokevirtual e0x.l4i ()Lzfz;
      // 6b: invokestatic e0x.r2y (Lzfz;)I
      // 6e: iastore
      // 6f: invokevirtual dug.zra (Lw_0;DDDIDDDD[I)V
      // 72: return
   }

   private void zjo(float param1) {
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
      // 05: invokevirtual h67.i55 ()F
      // 08: fstore 3
      // 09: fload 3
      // 0a: fload 1
      // 0b: fsub
      // 0c: fstore 3
      // 0d: iload 2
      // 0e: ifeq 2f
      // 11: fload 3
      // 12: ldc 0.5
      // 14: nop
      // 15: fcmpg
      // 16: ifgt 33
      // 19: goto 20
      // 1c: invokestatic h67.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 0
      // 21: invokespecial h67.zv7 ()V
      // 24: aload 0
      // 25: invokevirtual h67._kl ()V
      // 28: goto 2f
      // 2b: invokestatic h67.a (Loov;)Loov;
      // 2e: athrow
      // 2f: iload 2
      // 30: ifne 3f
      // 33: aload 0
      // 34: fload 3
      // 35: invokevirtual h67.uh3 (F)V
      // 38: goto 3f
      // 3b: invokestatic h67.a (Loov;)Loov;
      // 3e: athrow
      // 3f: return
   }

   private void bmo() {
      e0x.ymu(this.oay, new mew(this), new erg(xbr.dca));
      this.zv7();
   }

   private void zv7() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: bipush 0
      // 05: istore 2
      // 06: iload 2
      // 07: aload 0
      // 08: getfield h67.pld [Lerg;
      // 0b: arraylength
      // 0c: if_icmpge 89
      // 0f: aload 0
      // 10: getfield h67.pld [Lerg;
      // 13: iload 2
      // 14: aaload
      // 15: iload 1
      // 16: ifne 30
      // 19: ifnull 82
      // 1c: goto 23
      // 1f: invokestatic h67.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 0
      // 24: getfield h67.pld [Lerg;
      // 27: iload 2
      // 28: aaload
      // 29: goto 30
      // 2c: invokestatic h67.a (Loov;)Loov;
      // 2f: athrow
      // 30: iload 1
      // 31: ifne 59
      // 34: getfield erg.qd2 I
      // 37: ifle 82
      // 3a: goto 41
      // 3d: invokestatic h67.a (Loov;)Loov;
      // 40: athrow
      // 41: aload 0
      // 42: getfield h67.pld [Lerg;
      // 45: iload 2
      // 46: iload 1
      // 47: ifne 80
      // 4a: goto 51
      // 4d: invokestatic h67.a (Loov;)Loov;
      // 50: athrow
      // 51: aaload
      // 52: goto 59
      // 55: invokestatic h67.a (Loov;)Loov;
      // 58: athrow
      // 59: ifnull 7b
      // 5c: aload 0
      // 5d: getfield h67.oay Lt9d;
      // 60: new mew
      // 63: dup
      // 64: aload 0
      // 65: invokespecial mew.<init> (Li2h;)V
      // 68: invokevirtual mew.nuv ()Lmew;
      // 6b: aload 0
      // 6c: getfield h67.pld [Lerg;
      // 6f: iload 2
      // 70: aaload
      // 71: invokestatic e0x.ymu (Lt9d;Lmew;Lerg;)V
      // 74: goto 7b
      // 77: invokestatic h67.a (Loov;)Loov;
      // 7a: athrow
      // 7b: aload 0
      // 7c: getfield h67.pld [Lerg;
      // 7f: iload 2
      // 80: aconst_null
      // 81: aastore
      // 82: iinc 2 1
      // 85: iload 1
      // 86: ifeq 06
      // 89: return
   }

   @Override
   public float _j7(float var1, float var2) {
      this.gsh = this.p3h;
      this.ksw = this.x5k;
      return 0.0F;
   }

   @Override
   public float c5y() {
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
      // 05: iload 1
      // 06: ifeq 26
      // 09: invokevirtual h67.ejl ()Z
      // 0c: ifeq 25
      // 0f: goto 16
      // 12: invokestatic h67.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield h67.ikl F
      // 1a: ldc 0.5
      // 1c: nop
      // 1d: fmul
      // 1e: goto 2d
      // 21: invokestatic h67.a (Loov;)Loov;
      // 24: athrow
      // 25: aload 0
      // 26: getfield h67.ikl F
      // 29: ldc 0.9
      // 2b: nop
      // 2c: fmul
      // 2d: freturn
   }

   @Override
   public void ge2(float param1, float param2) {
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
      // 05: iload 3
      // 06: ifne 1e
      // 09: invokevirtual h67.opd ()Z
      // 0c: ifne 23
      // 0f: goto 16
      // 12: invokestatic h67.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: goto 1e
      // 1a: invokestatic h67.a (Loov;)Loov;
      // 1d: athrow
      // 1e: fload 1
      // 1f: fload 2
      // 20: invokespecial g_3.ge2 (FF)V
      // 23: return
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
      // 001: invokespecial g_3.xx_ ()V
      // 004: invokestatic t9d.c ()I
      // 007: aload 0
      // 008: getfield h67.oit Lwl1;
      // 00b: bipush 11
      // 00d: invokevirtual wl1.n68 (I)Lwis;
      // 010: astore 2
      // 011: istore 1
      // 012: aload 0
      // 013: getfield h67.nyw Lwis;
      // 016: iload 1
      // 017: ifne 03d
      // 01a: aload 2
      // 01b: invokevirtual wis.equals (Ljava/lang/Object;)Z
      // 01e: ifne 034
      // 021: goto 028
      // 024: invokestatic h67.a (Loov;)Loov;
      // 027: athrow
      // 028: aload 0
      // 029: aload 2
      // 02a: invokevirtual h67.zn5 (Lwis;)V
      // 02d: goto 034
      // 030: invokestatic h67.a (Loov;)Loov;
      // 033: athrow
      // 034: aload 0
      // 035: getfield h67.oit Lwl1;
      // 038: bipush 12
      // 03a: invokevirtual wl1.n68 (I)Lwis;
      // 03d: astore 3
      // 03e: aload 0
      // 03f: getfield h67.wy5 Lwis;
      // 042: iload 1
      // 043: ifne 069
      // 046: aload 3
      // 047: invokevirtual wis.equals (Ljava/lang/Object;)Z
      // 04a: ifne 060
      // 04d: goto 054
      // 050: invokestatic h67.a (Loov;)Loov;
      // 053: athrow
      // 054: aload 0
      // 055: aload 3
      // 056: invokevirtual h67.lcd (Lwis;)V
      // 059: goto 060
      // 05c: invokestatic h67.a (Loov;)Loov;
      // 05f: athrow
      // 060: aload 0
      // 061: getfield h67.oit Lwl1;
      // 064: bipush 13
      // 066: invokevirtual wl1.n68 (I)Lwis;
      // 069: astore 4
      // 06b: aload 0
      // 06c: getfield h67.dpg Lwis;
      // 06f: iload 1
      // 070: ifne 098
      // 073: aload 4
      // 075: invokevirtual wis.equals (Ljava/lang/Object;)Z
      // 078: ifne 08f
      // 07b: goto 082
      // 07e: invokestatic h67.a (Loov;)Loov;
      // 081: athrow
      // 082: aload 0
      // 083: aload 4
      // 085: invokevirtual h67.nqz (Lwis;)V
      // 088: goto 08f
      // 08b: invokestatic h67.a (Loov;)Loov;
      // 08e: athrow
      // 08f: aload 0
      // 090: getfield h67.oit Lwl1;
      // 093: bipush 14
      // 095: invokevirtual wl1.n68 (I)Lwis;
      // 098: astore 5
      // 09a: aload 0
      // 09b: getfield h67.ci4 Lwis;
      // 09e: iload 1
      // 09f: ifne 0c7
      // 0a2: aload 5
      // 0a4: invokevirtual wis.equals (Ljava/lang/Object;)Z
      // 0a7: ifne 0be
      // 0aa: goto 0b1
      // 0ad: invokestatic h67.a (Loov;)Loov;
      // 0b0: athrow
      // 0b1: aload 0
      // 0b2: aload 5
      // 0b4: invokevirtual h67.odv (Lwis;)V
      // 0b7: goto 0be
      // 0ba: invokestatic h67.a (Loov;)Loov;
      // 0bd: athrow
      // 0be: aload 0
      // 0bf: getfield h67.oit Lwl1;
      // 0c2: bipush 15
      // 0c4: invokevirtual wl1.n68 (I)Lwis;
      // 0c7: astore 6
      // 0c9: aload 0
      // 0ca: getfield h67.dyd Lwis;
      // 0cd: iload 1
      // 0ce: ifne 0f6
      // 0d1: aload 6
      // 0d3: invokevirtual wis.equals (Ljava/lang/Object;)Z
      // 0d6: ifne 0ed
      // 0d9: goto 0e0
      // 0dc: invokestatic h67.a (Loov;)Loov;
      // 0df: athrow
      // 0e0: aload 0
      // 0e1: aload 6
      // 0e3: invokevirtual h67.bnd (Lwis;)V
      // 0e6: goto 0ed
      // 0e9: invokestatic h67.a (Loov;)Loov;
      // 0ec: athrow
      // 0ed: aload 0
      // 0ee: getfield h67.oit Lwl1;
      // 0f1: bipush 16
      // 0f3: invokevirtual wl1.n68 (I)Lwis;
      // 0f6: astore 7
      // 0f8: aload 0
      // 0f9: getfield h67._qz Lwis;
      // 0fc: aload 7
      // 0fe: invokevirtual wis.equals (Ljava/lang/Object;)Z
      // 101: iload 1
      // 102: ifne 120
      // 105: ifne 11c
      // 108: goto 10f
      // 10b: invokestatic h67.a (Loov;)Loov;
      // 10e: athrow
      // 10f: aload 0
      // 110: aload 7
      // 112: invokevirtual h67._xx (Lwis;)V
      // 115: goto 11c
      // 118: invokestatic h67.a (Loov;)Loov;
      // 11b: athrow
      // 11c: aload 0
      // 11d: invokevirtual h67.c8q ()Z
      // 120: istore 8
      // 122: aload 0
      // 123: getfield h67.dup Z
      // 126: iload 1
      // 127: ifne 166
      // 12a: ifne 15b
      // 12d: goto 134
      // 130: invokestatic h67.a (Loov;)Loov;
      // 133: athrow
      // 134: iload 8
      // 136: iload 1
      // 137: ifne 166
      // 13a: goto 141
      // 13d: invokestatic h67.a (Loov;)Loov;
      // 140: athrow
      // 141: ifeq 15b
      // 144: goto 14b
      // 147: invokestatic h67.a (Loov;)Loov;
      // 14a: athrow
      // 14b: aload 0
      // 14c: bipush 0
      // 14d: invokespecial h67.ji1 (Z)V
      // 150: iload 1
      // 151: ifeq 17f
      // 154: goto 15b
      // 157: invokestatic h67.a (Loov;)Loov;
      // 15a: athrow
      // 15b: aload 0
      // 15c: getfield h67.dup Z
      // 15f: goto 166
      // 162: invokestatic h67.a (Loov;)Loov;
      // 165: athrow
      // 166: iload 1
      // 167: ifne 176
      // 16a: ifeq 179
      // 16d: goto 174
      // 170: invokestatic h67.a (Loov;)Loov;
      // 173: athrow
      // 174: iload 8
      // 176: ifeq 17a
      // 179: return
      // 17a: aload 0
      // 17b: bipush 1
      // 17c: invokespecial h67.ji1 (Z)V
      // 17f: aload 0
      // 180: iload 8
      // 182: putfield h67.dup Z
      // 185: return
   }

   private void ji1(boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield h67.o2v D
      // 04: dstore 3
      // 05: invokestatic t9d.c ()I
      // 08: aload 0
      // 09: getfield h67.kfp D
      // 0c: dstore 5
      // 0e: istore 2
      // 0f: aload 0
      // 10: getfield h67.vbd D
      // 13: dstore 7
      // 15: iload 2
      // 16: ifne 35
      // 19: iload 1
      // 1a: ifeq 39
      // 1d: goto 24
      // 20: invokestatic h67.a (Loov;)Loov;
      // 23: athrow
      // 24: aload 0
      // 25: ldc 0.5
      // 27: nop
      // 28: ldc 1.975
      // 2a: nop
      // 2b: invokevirtual h67.yxc (FF)V
      // 2e: goto 35
      // 31: invokestatic h67.a (Loov;)Loov;
      // 34: athrow
      // 35: iload 2
      // 36: ifeq 46
      // 39: aload 0
      // 3a: fconst_0
      // 3b: fconst_0
      // 3c: invokevirtual h67.yxc (FF)V
      // 3f: goto 46
      // 42: invokestatic h67.a (Loov;)Loov;
      // 45: athrow
      // 46: aload 0
      // 47: dload 3
      // 48: dload 5
      // 4a: dload 7
      // 4c: invokevirtual h67.m6_ (DDD)V
      // 4f: return
   }

   @Override
   public void k0f() {
      this.icv(this.uu1);
   }

   @Override
   public void icv(boolean var1) {
      this.uu1 = var1;
      super.icv(var1);
   }

   @Override
   public boolean ejl() {
      return this.sba();
   }

   @Override
   public void aqu() {
      this._kl();
   }

   @Override
   public boolean zsp() {
      return this.h5u();
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   private void w4k(boolean var1) {
      int var2 = t9d.c();
      byte var3 = this.oit.miz(10);

      label37: {
         byte var10000;
         label44: {
            label41: {
               try {
                  var10000 = var1;
                  if (var2 != 0) {
                     break label44;
                  }

                  if (var1 == 0) {
                     break label41;
                  }
               } catch (oov var6) {
                  throw a(var6);
               }

               var3 = (byte)(var3 | 1);

               try {
                  if (var2 == 0) {
                     break label37;
                  }
               } catch (oov var5) {
                  boolean var10001 = false;
                  throw a(var5);
               }
            }

            try {
               var10000 = (byte)(var3 & -2);
            } catch (oov var4) {
               boolean var8 = false;
               throw a(var4);
            }
         }

         var3 = var10000;
      }

      this.oit.c66(10, var3);
   }

   public boolean sba() {
      int var1 = t9d.c();

      try {
         int var10000 = this.oit.miz(10) & 1;
         if (var1 != 0) {
            return (boolean)var10000;
         }

         if (var10000 != 0) {
            return (boolean)1;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return (boolean)0;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   private void ouc(boolean var1) {
      int var2 = t9d.b();
      byte var3 = this.oit.miz(10);

      label37: {
         byte var10000;
         label44: {
            label41: {
               try {
                  var10000 = var1;
                  if (var2 == 0) {
                     break label44;
                  }

                  if (var1 == 0) {
                     break label41;
                  }
               } catch (oov var6) {
                  throw a(var6);
               }

               var3 = (byte)(var3 | 2);

               try {
                  if (var2 != 0) {
                     break label37;
                  }
               } catch (oov var5) {
                  boolean var10001 = false;
                  throw a(var5);
               }
            }

            try {
               var10000 = (byte)(var3 & -3);
            } catch (oov var4) {
               boolean var8 = false;
               throw a(var4);
            }
         }

         var3 = var10000;
      }

      this.oit.c66(10, var3);
   }

   public boolean opd() {
      int var1 = t9d.c();

      try {
         int var10000 = this.oit.miz(10) & 2;
         if (var1 != 0) {
            return (boolean)var10000;
         }

         if (var10000 != 0) {
            return (boolean)1;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return (boolean)0;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   private void og8(boolean var1) {
      int var2 = t9d.c();
      byte var3 = this.oit.miz(10);

      label37: {
         byte var10000;
         label44: {
            label41: {
               try {
                  var10000 = var1;
                  if (var2 != 0) {
                     break label44;
                  }

                  if (var1 == 0) {
                     break label41;
                  }
               } catch (oov var6) {
                  throw a(var6);
               }

               var3 = (byte)(var3 | 4);

               try {
                  if (var2 == 0) {
                     break label37;
                  }
               } catch (oov var5) {
                  boolean var10001 = false;
                  throw a(var5);
               }
            }

            try {
               var10000 = (byte)(var3 & -5);
            } catch (oov var4) {
               boolean var8 = false;
               throw a(var4);
            }
         }

         var3 = var10000;
      }

      this.oit.c66(10, var3);
   }

   public boolean sd0() {
      int var1 = t9d.b();

      try {
         int var10000 = this.oit.miz(10) & 4;
         if (var1 == 0) {
            return (boolean)var10000;
         }

         if (var10000 != 0) {
            return (boolean)1;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return (boolean)0;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   private void qhe(boolean var1) {
      int var2 = t9d.b();
      byte var3 = this.oit.miz(10);

      label37: {
         byte var10000;
         label44: {
            label41: {
               try {
                  var10000 = var1;
                  if (var2 == 0) {
                     break label44;
                  }

                  if (var1 == 0) {
                     break label41;
                  }
               } catch (oov var6) {
                  throw a(var6);
               }

               var3 = (byte)(var3 | 8);

               try {
                  if (var2 != 0) {
                     break label37;
                  }
               } catch (oov var5) {
                  boolean var10001 = false;
                  throw a(var5);
               }
            }

            try {
               var10000 = (byte)(var3 & -9);
            } catch (oov var4) {
               boolean var8 = false;
               throw a(var4);
            }
         }

         var3 = var10000;
      }

      this.oit.c66(10, var3);
   }

   public boolean wvw() {
      int var1 = t9d.c();

      try {
         int var10000 = this.oit.miz(10) & 8;
         if (var1 != 0) {
            return (boolean)var10000;
         }

         if (var10000 != 0) {
            return (boolean)1;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return (boolean)0;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   private void zpe(boolean var1) {
      int var2 = t9d.c();
      byte var3 = this.oit.miz(10);

      label37: {
         byte var10000;
         label44: {
            label41: {
               try {
                  var10000 = var1;
                  if (var2 != 0) {
                     break label44;
                  }

                  if (var1 == 0) {
                     break label41;
                  }
               } catch (oov var6) {
                  throw a(var6);
               }

               var3 = (byte)(var3 | 16);

               try {
                  if (var2 == 0) {
                     break label37;
                  }
               } catch (oov var5) {
                  boolean var10001 = false;
                  throw a(var5);
               }
            }

            try {
               var10000 = (byte)(var3 & -17);
            } catch (oov var4) {
               boolean var8 = false;
               throw a(var4);
            }
         }

         var3 = var10000;
      }

      this.oit.c66(10, var3);
   }

   public boolean c8q() {
      int var1 = t9d.b();

      try {
         int var10000 = this.oit.miz(10) & 16;
         if (var1 == 0) {
            return (boolean)var10000;
         }

         if (var10000 != 0) {
            return (boolean)1;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return (boolean)0;
   }

   public void zn5(wis var1) {
      this.nyw = var1;
      this.oit.c66(11, var1);
   }

   public void lcd(wis var1) {
      this.wy5 = var1;
      this.oit.c66(12, var1);
   }

   public void nqz(wis var1) {
      this.dpg = var1;
      this.oit.c66(13, var1);
   }

   public void odv(wis var1) {
      this.ci4 = var1;
      this.oit.c66(14, var1);
   }

   public void bnd(wis var1) {
      this.dyd = var1;
      this.oit.c66(15, var1);
   }

   public void _xx(wis var1) {
      this._qz = var1;
      this.oit.c66(16, var1);
   }

   public wis l6k() {
      return this.nyw;
   }

   public wis pfz() {
      return this.wy5;
   }

   public wis xvb() {
      return this.dpg;
   }

   public wis wod() {
      return this.ci4;
   }

   public wis fby() {
      return this.dyd;
   }

   public wis wym() {
      return this._qz;
   }

   @Override
   public boolean mzu() {
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
      // 05: invokespecial g_3.mzu ()Z
      // 08: iload 1
      // 09: ifeq 21
      // 0c: ifeq 33
      // 0f: goto 16
      // 12: invokestatic h67.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: invokevirtual h67.c8q ()Z
      // 1a: goto 21
      // 1d: invokestatic h67.a (Loov;)Loov;
      // 20: athrow
      // 21: iload 1
      // 22: ifeq 30
      // 25: ifne 33
      // 28: goto 2f
      // 2b: invokestatic h67.a (Loov;)Loov;
      // 2e: athrow
      // 2f: bipush 1
      // 30: goto 34
      // 33: bipush 0
      // 34: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(8729071678100807044L, 7262104967640115783L, MethodHandles.lookup().lookupClass()).a(228681449121700L);
      // $VF: monitorexit
      c = var10000;
      long var0 = c ^ 19631515184638L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[33];
      int var7 = 0;
      String var6 = "å\ngkHä¦\u009d±ì\u0094z¼¶¾Ë \u0001V&§É\u0093ÍxÎ5\u0004\u001bÌ\u0087Qg/wZûFîþ¯VPX¬g&8b\u0010\u0098B1K\u0010¿» 1\u001cÖD\u0014÷<\n\u0010\u00008\u0083\u008b%Ç¨\u008eçH'Ç®Ò\u0092û\u0010ì£\u0090\u0010Å\u0086©kÿ~É¿I\u0082\u001eZ \u0003,¢\u00ad\r9;03Àp\u0012¶9¤Ø-½3ÇÓÆ:\u0080ÛÅÇGë¶<ã\u0010Rdô\nuý¥ \bø\u0010e\u0019÷rI\u0010ûy óM\u0014\u009aS\u0017{Ji\u0002ÀÒÛ\u0010\u0017\u009bO÷\u008co|7ÈÞPÕÏSE`\u0018w\u0002\u009fÂ\u009aÛÖ55XîçiÞ\u008f}`\u000f D)e5ô\u0018\u0081ËÖ¥SJe<>Ð;{\u009c&±:É6\u0084/\u0091\u00adW_\u0010ÿ\u0086L\u0096\u0003ÅÕêÌ¯ºU6Ôø2\u0018*¥?LD74;$G:Á¶D\fj*\u008d\u0010K\u008cLæ$ íI\u000b\u0085\f\u0013(î\u0086\u000bV]¾%Y\u009fV~¢U¦\nf\u0098÷/5\u001e¿\u0086\u0019\\\u0010õJ^[\u009f\u001b\b\u00adý:zû|gá¼\u0018Õú¬\f;¾ek~3»^X\u0096\u0081\u001de\u001eR\u0099'¶\u0082§\u0010(¬\u0017åêÞ$s<ë¦íé\u009bÿ; @83§!/Ì.ãGX4¸ë\u009dTK[FW\u00876Z¾¨\u0006P\u009bôÓ.E \f\u009dÈ§\u0014<§ÄIþÙD\u008fÕ²ÉÊ\u0080¹7K:VÊ!\u001frÛÖÝÕ_\u0010o·zàØ7y9~G¬\u008fÓð§+(RÚw\u0098\u0090rp\u008c:Ý8\u009a\u001e\u008fLG\u009a\u009dxØ\u0005\tû\t\u0091\u007ff\u008e\u0080\u0098\u0001®\f+\u0086\u0083W\u0084C#\u0018t/Ü ÍæUz\u0083Â÷Ak\u009b£ÚÙ\u008dtây;;\u0097\u00109\t\u001d\u001as\u001aõ¢\u0003Ý\u0013\u007fÊÑ$\u00ad µ\u001b¢\u0004H\u0019wÞ1·>më7\u0087ÒÂ\u0016KáX»FÖ\u0098CEµÐgj\u0002 \u0019 O\bE\u0085(}\u0007Õký3¨4\u000e@¨È\u0001Ø>~¼S\u0010¼ë8~àD\u0018\u0094h\u009cÁ0tT\u0018F\u0006ù ¯\u0005\u00adZ(òÄ\u001eÇL\u0014\u0087\u0018®²Ö\u0017J\u0004\u0091µþåÝ\u0088Çdé\u0084\u0090\u0091\b\u0086\u0005\u0018\\\u001a\u0010\u0099\u009a\u0007\u000f\u0000ðÍ5UaÀ9¯kñÙ \u0086\u0092ü©û*à/+ñ¹Ý7A\u0010\u0010\u0091wXÄ\n\u0003\tõ¨Ò²\u009b\u0011î\u0017ó\u0010B\u008bª×\u008c=Øg\u009b¯ÅÕ³\u0011jj\u0010È\u0002tÝ\" \u0019¼ò\u00890bßsÌ×";
      int var8 = "å\ngkHä¦\u009d±ì\u0094z¼¶¾Ë \u0001V&§É\u0093ÍxÎ5\u0004\u001bÌ\u0087Qg/wZûFîþ¯VPX¬g&8b\u0010\u0098B1K\u0010¿» 1\u001cÖD\u0014÷<\n\u0010\u00008\u0083\u008b%Ç¨\u008eçH'Ç®Ò\u0092û\u0010ì£\u0090\u0010Å\u0086©kÿ~É¿I\u0082\u001eZ \u0003,¢\u00ad\r9;03Àp\u0012¶9¤Ø-½3ÇÓÆ:\u0080ÛÅÇGë¶<ã\u0010Rdô\nuý¥ \bø\u0010e\u0019÷rI\u0010ûy óM\u0014\u009aS\u0017{Ji\u0002ÀÒÛ\u0010\u0017\u009bO÷\u008co|7ÈÞPÕÏSE`\u0018w\u0002\u009fÂ\u009aÛÖ55XîçiÞ\u008f}`\u000f D)e5ô\u0018\u0081ËÖ¥SJe<>Ð;{\u009c&±:É6\u0084/\u0091\u00adW_\u0010ÿ\u0086L\u0096\u0003ÅÕêÌ¯ºU6Ôø2\u0018*¥?LD74;$G:Á¶D\fj*\u008d\u0010K\u008cLæ$ íI\u000b\u0085\f\u0013(î\u0086\u000bV]¾%Y\u009fV~¢U¦\nf\u0098÷/5\u001e¿\u0086\u0019\\\u0010õJ^[\u009f\u001b\b\u00adý:zû|gá¼\u0018Õú¬\f;¾ek~3»^X\u0096\u0081\u001de\u001eR\u0099'¶\u0082§\u0010(¬\u0017åêÞ$s<ë¦íé\u009bÿ; @83§!/Ì.ãGX4¸ë\u009dTK[FW\u00876Z¾¨\u0006P\u009bôÓ.E \f\u009dÈ§\u0014<§ÄIþÙD\u008fÕ²ÉÊ\u0080¹7K:VÊ!\u001frÛÖÝÕ_\u0010o·zàØ7y9~G¬\u008fÓð§+(RÚw\u0098\u0090rp\u008c:Ý8\u009a\u001e\u008fLG\u009a\u009dxØ\u0005\tû\t\u0091\u007ff\u008e\u0080\u0098\u0001®\f+\u0086\u0083W\u0084C#\u0018t/Ü ÍæUz\u0083Â÷Ak\u009b£ÚÙ\u008dtây;;\u0097\u00109\t\u001d\u001as\u001aõ¢\u0003Ý\u0013\u007fÊÑ$\u00ad µ\u001b¢\u0004H\u0019wÞ1·>më7\u0087ÒÂ\u0016KáX»FÖ\u0098CEµÐgj\u0002 \u0019 O\bE\u0085(}\u0007Õký3¨4\u000e@¨È\u0001Ø>~¼S\u0010¼ë8~àD\u0018\u0094h\u009cÁ0tT\u0018F\u0006ù ¯\u0005\u00adZ(òÄ\u001eÇL\u0014\u0087\u0018®²Ö\u0017J\u0004\u0091µþåÝ\u0088Çdé\u0084\u0090\u0091\b\u0086\u0005\u0018\\\u001a\u0010\u0099\u009a\u0007\u000f\u0000ðÍ5UaÀ9¯kñÙ \u0086\u0092ü©û*à/+ñ¹Ý7A\u0010\u0010\u0091wXÄ\n\u0003\tõ¨Ò²\u009b\u0011î\u0017ó\u0010B\u008bª×\u008c=Øg\u009b¯ÅÕ³\u0011jj\u0010È\u0002tÝ\" \u0019¼ò\u00890bßsÌ×"
         .length();
      char var5 = 16;
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
                     g = new String[33];
                     w8l = new wis(0.0F, 0.0F, 0.0F);
                     ypj = new wis(0.0F, 0.0F, 0.0F);
                     wr0 = new wis(-10.0F, 0.0F, -10.0F);
                     li5 = new wis(-15.0F, 0.0F, 10.0F);
                     ecl = new wis(-1.0F, 0.0F, -1.0F);
                     qf4 = new wis(1.0F, 0.0F, 1.0F);
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

                  var6 = "ç!O6+7ð´ÉÏ\u0017ÛpRÆ« \u0089xj\u0097J\u0004\u008f3¾\"²\u0093=\u0094\u001fØ3ÿõ*{îiÊ³fÙÀE÷\u0012¸";
                  var8 = "ç!O6+7ð´ÉÏ\u0017ÛpRÆ« \u0089xj\u0097J\u0004\u008f3¾\"²\u0093=\u0094\u001fØ3ÿõ*{îiÊ³fÙÀE÷\u0012¸".length();
                  var5 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30064;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("h67", var10);
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
         g[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
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
         throw new RuntimeException("h67" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
