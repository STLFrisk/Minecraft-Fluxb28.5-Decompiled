import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.tileentity.TileEntityBanner;

public class jgn extends gun {
   private static final long b;
   private static final String[] j;
   private static final String[] k;
   private static final Map l = new HashMap(13);

   public jgn() {
      super(ox_.e2n);
      this.vgp = 16;
      this.qfy(uja.qqf);
      this.oml(true);
      this.rlr(0);
   }

   @Override
   public boolean ghw(erg param1, ha9 param2, t9d param3, mew param4, vt2 param5, float param6, float param7, float param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 9
      // 005: aload 5
      // 007: getstatic vt2.m3r Lvt2;
      // 00a: if_acmpne 013
      // 00d: bipush 0
      // 00e: ireturn
      // 00f: invokestatic jgn.a (Loov;)Loov;
      // 012: athrow
      // 013: aload 3
      // 014: aload 4
      // 016: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 019: invokeinterface zfz.r_y ()Le0x; 1
      // 01e: invokevirtual e0x.p1r ()Lp3y;
      // 021: invokevirtual p3y.gk6 ()Z
      // 024: iload 9
      // 026: ifeq 04b
      // 029: ifne 039
      // 02c: goto 033
      // 02f: invokestatic jgn.a (Loov;)Loov;
      // 032: athrow
      // 033: bipush 0
      // 034: ireturn
      // 035: invokestatic jgn.a (Loov;)Loov;
      // 038: athrow
      // 039: aload 4
      // 03b: aload 5
      // 03d: invokevirtual mew.offset (Lvt2;)Lmew;
      // 040: astore 4
      // 042: aload 2
      // 043: aload 4
      // 045: aload 5
      // 047: aload 1
      // 048: invokevirtual ha9.dzh (Lmew;Lvt2;Lerg;)Z
      // 04b: iload 9
      // 04d: ifeq 069
      // 050: ifne 060
      // 053: goto 05a
      // 056: invokestatic jgn.a (Loov;)Loov;
      // 059: athrow
      // 05a: bipush 0
      // 05b: ireturn
      // 05c: invokestatic jgn.a (Loov;)Loov;
      // 05f: athrow
      // 060: getstatic ox_.e2n Le0x;
      // 063: aload 3
      // 064: aload 4
      // 066: invokevirtual e0x.ctq (Lt9d;Lmew;)Z
      // 069: iload 9
      // 06b: ifeq 082
      // 06e: ifne 07e
      // 071: goto 078
      // 074: invokestatic jgn.a (Loov;)Loov;
      // 077: athrow
      // 078: bipush 0
      // 079: ireturn
      // 07a: invokestatic jgn.a (Loov;)Loov;
      // 07d: athrow
      // 07e: aload 3
      // 07f: getfield t9d.v0f Z
      // 082: iload 9
      // 084: ifeq 092
      // 087: ifeq 093
      // 08a: goto 091
      // 08d: invokestatic jgn.a (Loov;)Loov;
      // 090: athrow
      // 091: bipush 1
      // 092: ireturn
      // 093: aload 5
      // 095: getstatic vt2.rf3 Lvt2;
      // 098: if_acmpne 0d8
      // 09b: aload 2
      // 09c: getfield ha9.x5k F
      // 09f: ldc 180.0
      // 0a1: nop
      // 0a2: fadd
      // 0a3: ldc 16.0
      // 0a5: nop
      // 0a6: fmul
      // 0a7: ldc 360.0
      // 0a9: nop
      // 0aa: fdiv
      // 0ab: f2d
      // 0ac: ldc2_w 0.5
      // 0af: dadd
      // 0b0: invokestatic fe6.jqf (D)I
      // 0b3: bipush 15
      // 0b5: iand
      // 0b6: istore 10
      // 0b8: aload 3
      // 0b9: aload 4
      // 0bb: getstatic ox_.e2n Le0x;
      // 0be: invokevirtual e0x.l4i ()Lzfz;
      // 0c1: getstatic q7m.whz L_ku;
      // 0c4: iload 10
      // 0c6: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0c9: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 0ce: bipush 3
      // 0cf: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 0d2: pop
      // 0d3: iload 9
      // 0d5: ifne 0f7
      // 0d8: aload 3
      // 0d9: aload 4
      // 0db: getstatic ox_.swn Le0x;
      // 0de: invokevirtual e0x.l4i ()Lzfz;
      // 0e1: getstatic hkm.fdx Lqx_;
      // 0e4: aload 5
      // 0e6: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 0eb: bipush 3
      // 0ec: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 0ef: pop
      // 0f0: goto 0f7
      // 0f3: invokestatic jgn.a (Loov;)Loov;
      // 0f6: athrow
      // 0f7: aload 1
      // 0f8: dup
      // 0f9: getfield erg.qd2 I
      // 0fc: bipush 1
      // 0fd: isub
      // 0fe: putfield erg.qd2 I
      // 101: aload 3
      // 102: aload 4
      // 104: invokevirtual t9d.getTileEntity (Lmew;)Lpyk;
      // 107: astore 10
      // 109: aload 10
      // 10b: instanceof net/minecraft/tileentity/TileEntityBanner
      // 10e: iload 9
      // 110: ifeq 12e
      // 113: ifeq 12d
      // 116: goto 11d
      // 119: invokestatic jgn.a (Loov;)Loov;
      // 11c: athrow
      // 11d: aload 10
      // 11f: checkcast net/minecraft/tileentity/TileEntityBanner
      // 122: aload 1
      // 123: invokevirtual net/minecraft/tileentity/TileEntityBanner.m2b (Lerg;)V
      // 126: goto 12d
      // 129: invokestatic jgn.a (Loov;)Loov;
      // 12c: athrow
      // 12d: bipush 1
      // 12e: ireturn
   }

   @Override
   public String ily(erg var1) {
      long var2 = b ^ 50380182956074L;
      String var4 = c<"o">(21643, 4141728266361409079L ^ var2);
      qvg var5 = this.vf8(var1);
      var4 = var4 + var5.lan() + c<"o">(3689, 3534401976712844502L ^ var2);
      return orr.zgh(var4);
   }

   @Override
   public void wra(erg param1, ha9 param2, List param3, boolean param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic jgn.b J
      // 003: ldc2_w 137340888076649
      // 006: lxor
      // 007: lstore 5
      // 009: invokestatic t9d.b ()I
      // 00c: istore 7
      // 00e: aload 1
      // 00f: sipush 26092
      // 012: ldc2_w 5672931351383918106
      // 015: lload 5
      // 017: lxor
      // 018: invokedynamic o (IJ)Ljava/lang/String; bsm=jgn.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01d: nop
      // 01e: bipush 0
      // 01f: invokevirtual erg.o4p (Ljava/lang/String;Z)Lbdo;
      // 022: astore 8
      // 024: aload 8
      // 026: iload 7
      // 028: ifeq 037
      // 02b: ifnull 122
      // 02e: goto 035
      // 031: invokestatic jgn.a (Loov;)Loov;
      // 034: athrow
      // 035: aload 8
      // 037: sipush 15650
      // 03a: ldc2_w 4651356474009001695
      // 03d: lload 5
      // 03f: lxor
      // 040: invokedynamic o (IJ)Ljava/lang/String; bsm=jgn.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 045: nop
      // 046: iload 7
      // 048: ifeq 070
      // 04b: invokevirtual bdo.dmw (Ljava/lang/String;)Z
      // 04e: ifeq 122
      // 051: goto 058
      // 054: invokestatic jgn.a (Loov;)Loov;
      // 057: athrow
      // 058: aload 8
      // 05a: sipush 20154
      // 05d: ldc2_w 6448439414353849668
      // 060: lload 5
      // 062: lxor
      // 063: invokedynamic o (IJ)Ljava/lang/String; bsm=jgn.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 068: nop
      // 069: goto 070
      // 06c: invokestatic jgn.a (Loov;)Loov;
      // 06f: athrow
      // 070: bipush 10
      // 072: invokevirtual bdo.bzb (Ljava/lang/String;I)Lqhg;
      // 075: astore 9
      // 077: bipush 0
      // 078: istore 10
      // 07a: iload 10
      // 07c: aload 9
      // 07e: invokevirtual qhg.vek ()I
      // 081: if_icmpge 122
      // 084: iload 10
      // 086: bipush 6
      // 088: if_icmpge 122
      // 08b: aload 9
      // 08d: iload 10
      // 08f: invokevirtual qhg.kd6 (I)Lbdo;
      // 092: astore 11
      // 094: aload 11
      // 096: sipush 24481
      // 099: ldc2_w 3663034713076890712
      // 09c: lload 5
      // 09e: lxor
      // 09f: invokedynamic o (IJ)Ljava/lang/String; bsm=jgn.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a4: nop
      // 0a5: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 0a8: invokestatic qvg.b7j (I)Lqvg;
      // 0ab: astore 12
      // 0ad: aload 11
      // 0af: sipush 23024
      // 0b2: ldc2_w 3192488705506671112
      // 0b5: lload 5
      // 0b7: lxor
      // 0b8: invokedynamic o (IJ)Ljava/lang/String; bsm=jgn.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bd: nop
      // 0be: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 0c1: invokestatic net/minecraft/tileentity/TileEntityBanner$swh.sk1 (Ljava/lang/String;)Lnet/minecraft/tileentity/TileEntityBanner$swh;
      // 0c4: astore 13
      // 0c6: iload 7
      // 0c8: ifeq 11d
      // 0cb: aload 13
      // 0cd: ifnull 11a
      // 0d0: goto 0d7
      // 0d3: invokestatic jgn.a (Loov;)Loov;
      // 0d6: athrow
      // 0d7: aload 3
      // 0d8: new java/lang/StringBuilder
      // 0db: dup
      // 0dc: invokespecial java/lang/StringBuilder.<init> ()V
      // 0df: sipush 28471
      // 0e2: ldc2_w 6183239255646489794
      // 0e5: lload 5
      // 0e7: lxor
      // 0e8: invokedynamic o (IJ)Ljava/lang/String; bsm=jgn.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: nop
      // 0ee: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f1: aload 13
      // 0f3: invokevirtual net/minecraft/tileentity/TileEntityBanner$swh.u4i ()Ljava/lang/String;
      // 0f6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f9: ldc "."
      // 0fb: nop
      // 0fc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ff: aload 12
      // 101: invokevirtual qvg.lan ()Ljava/lang/String;
      // 104: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 107: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 10a: invokestatic orr.zgh (Ljava/lang/String;)Ljava/lang/String;
      // 10d: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 112: pop
      // 113: goto 11a
      // 116: invokestatic jgn.a (Loov;)Loov;
      // 119: athrow
      // 11a: iinc 10 1
      // 11d: iload 7
      // 11f: ifne 07a
      // 122: return
   }

   @Override
   public int bu9(erg param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: iload 2
      // 05: iload 3
      // 06: ifeq 1d
      // 09: ifne 1e
      // 0c: goto 13
      // 0f: invokestatic jgn.a (Loov;)Loov;
      // 12: athrow
      // 13: ldc 16777215
      // 15: nop
      // 16: goto 1d
      // 19: invokestatic jgn.a (Loov;)Loov;
      // 1c: athrow
      // 1d: ireturn
      // 1e: aload 0
      // 1f: aload 1
      // 20: invokespecial jgn.vf8 (Lerg;)Lqvg;
      // 23: astore 4
      // 25: aload 4
      // 27: invokevirtual qvg.f0q ()L_mi;
      // 2a: getfield _mi.eon I
      // 2d: ireturn
   }

   @Override
   public void jlj(u7m var1, uja var2, List var3) {
      long var4 = b ^ 101070578804243L;
      qvg[] var7 = qvg.values();
      int var10000 = t9d.b();
      int var8 = var7.length;
      int var9 = 0;
      int var6 = var10000;

      while (var9 < var8) {
         qvg var10 = var7[var9];
         bdo var11 = new bdo();
         TileEntityBanner.ds4(var11, var10.b9d(), (qhg)null);
         bdo var12 = new bdo();
         var12.rzm(c<"o">(26092, 5672963248375263584L ^ var4), var11);
         erg var13 = new erg(var1, 1, var10.b9d());
         var13.b67(var12);
         var3.add(var13);
         var9++;
         if (var6 == 0) {
            break;
         }
      }
   }

   @Override
   public uja f4r() {
      return uja.qqf;
   }

   private qvg vf8(erg var1) {
      long var2 = b ^ 126730495859680L;
      bdo var5 = var1.o4p(c<"o">(32414, 6011662976802985964L ^ var2), false);
      int var10000 = t9d.b();
      Object var6 = null;
      int var4 = var10000;

      label34: {
         try {
            var10 = var5;
            if (var4 == 0) {
               break label34;
            }

            if (var5 == null) {
               return qvg.b7j(var1.j6_());
            }
         } catch (oov var8) {
            throw a(var8);
         }

         var10 = var5;
      }

      try {
         byte var11 = var10.dmw(c<"o">(197, 9008278140928551355L ^ var2));
         if (var4 == 0) {
            return qvg.b7j(var11);
         }

         if (var11 != 0) {
            return qvg.b7j(var5.uz7(c<"o">(22083, 1802937978549059376L ^ var2)));
         }
      } catch (oov var7) {
         throw a(var7);
      }

      return qvg.b7j(var1.j6_());
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(2870193894585892065L, -7483790429752624526L, MethodHandles.lookup().lookupClass()).a(137638889641739L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 108811855437487L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[11];
      int var7 = 0;
      String var6 = "\u00ad\u0014\u0094\u0097\u008eLì\u0093W\u0012p´¼\u009bVecð\u008fäW\u001eÂ½ j¶(\u008eGz7wæ!y3ò\u001cý\u0092\u008d\u009dð\u0088\u001b±è\u001evýR[\u0000\u009d·T [DpJ\u0084Ý\u001cÌéã/6ÅÇ6gG\u0097\u0086Úÿ\u009f\u0003\u009f\u0089M>\u0091<ýqà\u00106\u0089çtÅª<sl\u008bq\fZéÈÕ\u0018\u0081#\u0015\u0089í\u008cmÈ'\"Bð7\tg\u0095Ï\u000bÃ\u0080\tOÁÏ\u0010\u0010\u001a !w\u008d¨/÷>(\u009e,\u009bëí\u0010ÖH\u008bª\u001f\u0091m\u0015\u001d=!¿ü¨\u0013a\u0010xï\u0003g[»þEOí\u0082µ\u0091ÉÙ×\u0010Ö\u0087\u001dô.%\u0093Ì\u0005üâÜY\u0085\u0011í";
      int var8 = "\u00ad\u0014\u0094\u0097\u008eLì\u0093W\u0012p´¼\u009bVecð\u008fäW\u001eÂ½ j¶(\u008eGz7wæ!y3ò\u001cý\u0092\u008d\u009dð\u0088\u001b±è\u001evýR[\u0000\u009d·T [DpJ\u0084Ý\u001cÌéã/6ÅÇ6gG\u0097\u0086Úÿ\u009f\u0003\u009f\u0089M>\u0091<ýqà\u00106\u0089çtÅª<sl\u008bq\fZéÈÕ\u0018\u0081#\u0015\u0089í\u008cmÈ'\"Bð7\tg\u0095Ï\u000bÃ\u0080\tOÁÏ\u0010\u0010\u001a !w\u008d¨/÷>(\u009e,\u009bëí\u0010ÖH\u008bª\u001f\u0091m\u0015\u001d=!¿ü¨\u0013a\u0010xï\u0003g[»þEOí\u0082µ\u0091ÉÙ×\u0010Ö\u0087\u001dô.%\u0093Ì\u0005üâÜY\u0085\u0011í"
         .length();
      char var5 = 24;
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
                     j = var9;
                     k = new String[11];
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

                  var6 = "KÛî_\u0002#é¥\b\u0099\u001b\u0082:\u0006\u000e\u0084\u000f\f»Cß\u001b\u0085\u009e õ 4Q¸\u0085\u0080Ghg\u001f²'\"Â±\u0019{ß'²\u001em1iÝ\u0004\u0082.\u000eãé";
                  var8 = "KÛî_\u0002#é¥\b\u0099\u001b\u0082:\u0006\u000e\u0084\u000f\f»Cß\u001b\u0085\u009e õ 4Q¸\u0085\u0080Ghg\u001f²'\"Â±\u0019{ß'²\u001em1iÝ\u0004\u0082.\u000eãé"
                     .length();
                  var5 = 24;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 18237;
      if (k[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])l.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               l.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("jgn", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = j[var5].getBytes("ISO-8859-1");
         k[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return k[var5];
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
         throw new RuntimeException("jgn" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
