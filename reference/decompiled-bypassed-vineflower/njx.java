import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.network.play.client.C08PacketPlayerBlockPlacement;

public class njx extends ar7 {
   public static List anc;
   public static crk hc9;
   public static crk f35;
   public q6h eey;
   public static boolean e9o;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public njx() {
      long var1 = a ^ 97536434899584L;
      super(b<"h">(22600, 1855458018096874315L ^ var1), _aj.y49, false, new j1s[0]);
      this.eey = new q6h();
   }

   @jev
   public void zbz(axn var1) {
      anc.clear();
   }

   @jev
   public void tkn(fz2 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 2
      // 004: aload 0
      // 005: aconst_null
      // 006: putfield njx._16 Lmew;
      // 009: aload 1
      // 00a: invokevirtual fz2.lhw ()Z
      // 00d: iload 2
      // 00e: ifeq 039
      // 011: ifne 055
      // 014: goto 01b
      // 017: invokestatic njx.a (Loov;)Loov;
      // 01a: athrow
      // 01b: getstatic njx.ek1 Lc05;
      // 01e: getfield c05.vg8 Ll86;
      // 021: iload 2
      // 022: ifeq 03f
      // 025: goto 02c
      // 028: invokestatic njx.a (Loov;)Loov;
      // 02b: athrow
      // 02c: getfield l86.g25 I
      // 02f: bipush 10
      // 031: irem
      // 032: goto 039
      // 035: invokestatic njx.a (Loov;)Loov;
      // 038: athrow
      // 039: ifne 055
      // 03c: getstatic fyk.kfa Lg_3;
      // 03f: ifnonnull 055
      // 042: getstatic njx.ek1 Lc05;
      // 045: getfield c05.u0y Lgbe;
      // 048: instanceof zg9
      // 04b: ifeq 05a
      // 04e: goto 055
      // 051: invokestatic njx.a (Loov;)Loov;
      // 054: athrow
      // 055: return
      // 056: invokestatic njx.a (Loov;)Loov;
      // 059: athrow
      // 05a: getstatic njx.f35 Lcrk;
      // 05d: invokevirtual crk.d7c ()Ljava/lang/Float;
      // 060: invokevirtual java/lang/Float.floatValue ()F
      // 063: dup
      // 064: fstore 3
      // 065: fstore 4
      // 067: fload 4
      // 069: fload 3
      // 06a: fneg
      // 06b: fcmpl
      // 06c: iflt 1cb
      // 06f: fload 3
      // 070: fneg
      // 071: fstore 5
      // 073: fload 5
      // 075: fload 3
      // 076: fcmpg
      // 077: ifgt 1c1
      // 07a: fload 3
      // 07b: fneg
      // 07c: iload 2
      // 07d: ifeq 1c5
      // 080: fstore 6
      // 082: fload 6
      // 084: fload 3
      // 085: fcmpg
      // 086: ifgt 1b7
      // 089: new mew
      // 08c: dup
      // 08d: getstatic njx.ek1 Lc05;
      // 090: getfield c05.vg8 Ll86;
      // 093: getfield l86.o2v D
      // 096: ldc2_w 0.5
      // 099: dsub
      // 09a: fload 5
      // 09c: f2d
      // 09d: dadd
      // 09e: getstatic njx.ek1 Lc05;
      // 0a1: getfield c05.vg8 Ll86;
      // 0a4: getfield l86.kfp D
      // 0a7: ldc2_w 0.5
      // 0aa: dsub
      // 0ab: fload 4
      // 0ad: f2d
      // 0ae: dadd
      // 0af: getstatic njx.ek1 Lc05;
      // 0b2: getfield c05.vg8 Ll86;
      // 0b5: getfield l86.vbd D
      // 0b8: ldc2_w 0.5
      // 0bb: dsub
      // 0bc: fload 6
      // 0be: f2d
      // 0bf: dadd
      // 0c0: invokespecial mew.<init> (DDD)V
      // 0c3: astore 7
      // 0c5: getstatic njx.ek1 Lc05;
      // 0c8: getfield c05.tij Lkh3;
      // 0cb: aload 7
      // 0cd: invokevirtual kh3.getBlockState (Lmew;)Lzfz;
      // 0d0: invokeinterface zfz.r_y ()Le0x; 1
      // 0d5: astore 8
      // 0d7: new mew
      // 0da: dup
      // 0db: getstatic njx.ek1 Lc05;
      // 0de: getfield c05.vg8 Ll86;
      // 0e1: getfield l86.o2v D
      // 0e4: fload 5
      // 0e6: f2d
      // 0e7: dadd
      // 0e8: getstatic njx.ek1 Lc05;
      // 0eb: getfield c05.vg8 Ll86;
      // 0ee: getfield l86.kfp D
      // 0f1: fload 4
      // 0f3: f2d
      // 0f4: dadd
      // 0f5: getstatic njx.ek1 Lc05;
      // 0f8: getfield c05.vg8 Ll86;
      // 0fb: getfield l86.vbd D
      // 0fe: fload 6
      // 100: f2d
      // 101: dadd
      // 102: invokespecial mew.<init> (DDD)V
      // 105: astore 9
      // 107: iload 2
      // 108: ifeq 1b3
      // 10b: getstatic njx.ek1 Lc05;
      // 10e: getfield c05.vg8 Ll86;
      // 111: aload 9
      // 113: invokevirtual mew.getX ()I
      // 116: i2d
      // 117: aload 9
      // 119: invokevirtual mew.getY ()I
      // 11c: i2d
      // 11d: aload 9
      // 11f: invokevirtual mew.getZ ()I
      // 122: i2d
      // 123: invokevirtual l86.qww (DDD)D
      // 126: getstatic njx.ek1 Lc05;
      // 129: getfield c05.l7q Lhh6;
      // 12c: invokevirtual hh6.gxw ()F
      // 12f: f2d
      // 130: dcmpg
      // 131: iload 2
      // 132: ifeq 077
      // 135: goto 13c
      // 138: invokestatic njx.a (Loov;)Loov;
      // 13b: athrow
      // 13c: ifge 1ad
      // 13f: aload 8
      // 141: instanceof hrd
      // 144: iload 2
      // 145: ifeq 16a
      // 148: goto 14f
      // 14b: invokestatic njx.a (Loov;)Loov;
      // 14e: athrow
      // 14f: ifeq 1ad
      // 152: goto 159
      // 155: invokestatic njx.a (Loov;)Loov;
      // 158: athrow
      // 159: getstatic njx.anc Ljava/util/List;
      // 15c: aload 7
      // 15e: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 163: goto 16a
      // 166: invokestatic njx.a (Loov;)Loov;
      // 169: athrow
      // 16a: iload 2
      // 16b: ifeq 184
      // 16e: ifne 1ad
      // 171: goto 178
      // 174: invokestatic njx.a (Loov;)Loov;
      // 177: athrow
      // 178: aload 7
      // 17a: invokevirtual mew.getX ()I
      // 17d: goto 184
      // 180: invokestatic njx.a (Loov;)Loov;
      // 183: athrow
      // 184: i2d
      // 185: aload 7
      // 187: invokevirtual mew.getY ()I
      // 18a: i2d
      // 18b: aload 7
      // 18d: invokevirtual mew.getZ ()I
      // 190: i2d
      // 191: invokestatic bk4.cmx (DDD)[F
      // 194: astore 10
      // 196: aload 1
      // 197: aload 10
      // 199: bipush 0
      // 19a: faload
      // 19b: invokevirtual fz2.h8j (F)V
      // 19e: aload 1
      // 19f: aload 10
      // 1a1: bipush 1
      // 1a2: faload
      // 1a3: invokevirtual fz2.ni7 (F)V
      // 1a6: aload 0
      // 1a7: aload 7
      // 1a9: putfield njx._16 Lmew;
      // 1ac: return
      // 1ad: fload 6
      // 1af: fconst_1
      // 1b0: fadd
      // 1b1: fstore 6
      // 1b3: iload 2
      // 1b4: ifne 082
      // 1b7: fload 5
      // 1b9: fconst_1
      // 1ba: fadd
      // 1bb: fstore 5
      // 1bd: iload 2
      // 1be: ifne 073
      // 1c1: fload 4
      // 1c3: fconst_1
      // 1c4: fsub
      // 1c5: fstore 4
      // 1c7: iload 2
      // 1c8: ifne 067
      // 1cb: return
   }

   @jev
   public void ztq(q8e param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic njx.a J
      // 003: ldc2_w 135303097897782
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic t9d.b ()I
      // 00b: istore 4
      // 00d: getstatic njx.e9o Z
      // 010: iload 4
      // 012: ifeq 03c
      // 015: ifeq 0db
      // 018: goto 01f
      // 01b: invokestatic njx.a (Loov;)Loov;
      // 01e: athrow
      // 01f: aload 0
      // 020: iload 4
      // 022: ifeq 068
      // 025: goto 02c
      // 028: invokestatic njx.a (Loov;)Loov;
      // 02b: athrow
      // 02c: getfield njx.eey Lq6h;
      // 02f: ldc2_w 1000.0
      // 032: invokevirtual q6h.hqu (D)Z
      // 035: goto 03c
      // 038: invokestatic njx.a (Loov;)Loov;
      // 03b: athrow
      // 03c: ifeq 060
      // 03f: sipush 6337
      // 042: ldc2_w 4414820249743792757
      // 045: lload 2
      // 046: lxor
      // 047: invokedynamic h (IJ)Ljava/lang/String; bsm=njx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04c: nop
      // 04d: invokestatic ncl.zpu (Ljava/lang/Object;)V
      // 050: bipush 0
      // 051: putstatic njx.e9o Z
      // 054: iload 4
      // 056: ifne 0db
      // 059: goto 060
      // 05c: invokestatic njx.a (Loov;)Loov;
      // 05f: athrow
      // 060: aload 0
      // 061: goto 068
      // 064: invokestatic njx.a (Loov;)Loov;
      // 067: athrow
      // 068: getfield njx.nbt Lmew;
      // 06b: iload 4
      // 06d: ifeq 0df
      // 070: ifnull 0db
      // 073: goto 07a
      // 076: invokestatic njx.a (Loov;)Loov;
      // 079: athrow
      // 07a: getstatic njx.ek1 Lc05;
      // 07d: getfield c05.u0y Lgbe;
      // 080: instanceof zg9
      // 083: iload 4
      // 085: ifeq 0d8
      // 088: goto 08f
      // 08b: invokestatic njx.a (Loov;)Loov;
      // 08e: athrow
      // 08f: ifeq 0db
      // 092: goto 099
      // 095: invokestatic njx.a (Loov;)Loov;
      // 098: athrow
      // 099: new java/lang/StringBuilder
      // 09c: dup
      // 09d: invokespecial java/lang/StringBuilder.<init> ()V
      // 0a0: sipush 28942
      // 0a3: ldc2_w 3710256179963851708
      // 0a6: lload 2
      // 0a7: lxor
      // 0a8: invokedynamic h (IJ)Ljava/lang/String; bsm=njx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ad: nop
      // 0ae: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b1: aload 0
      // 0b2: getfield njx.nbt Lmew;
      // 0b5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0b8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0bb: invokestatic ncl.zpu (Ljava/lang/Object;)V
      // 0be: getstatic njx.anc Ljava/util/List;
      // 0c1: aload 0
      // 0c2: getfield njx.nbt Lmew;
      // 0c5: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0ca: pop
      // 0cb: aload 0
      // 0cc: aconst_null
      // 0cd: putfield njx.nbt Lmew;
      // 0d0: bipush 0
      // 0d1: goto 0d8
      // 0d4: invokestatic njx.a (Loov;)Loov;
      // 0d7: athrow
      // 0d8: putstatic njx.e9o Z
      // 0db: aload 0
      // 0dc: getfield njx._16 Lmew;
      // 0df: ifnull 16a
      // 0e2: getstatic njx.ek1 Lc05;
      // 0e5: getfield c05.u0y Lgbe;
      // 0e8: instanceof zg9
      // 0eb: iload 4
      // 0ed: ifeq 11b
      // 0f0: goto 0f7
      // 0f3: invokestatic njx.a (Loov;)Loov;
      // 0f6: athrow
      // 0f7: ifne 16a
      // 0fa: goto 101
      // 0fd: invokestatic njx.a (Loov;)Loov;
      // 100: athrow
      // 101: getstatic njx.anc Ljava/util/List;
      // 104: invokeinterface java/util/List.size ()I 1
      // 109: i2f
      // 10a: getstatic njx.hc9 Lcrk;
      // 10d: invokevirtual crk.d7c ()Ljava/lang/Float;
      // 110: invokevirtual java/lang/Float.floatValue ()F
      // 113: fcmpg
      // 114: goto 11b
      // 117: invokestatic njx.a (Loov;)Loov;
      // 11a: athrow
      // 11b: iload 4
      // 11d: ifeq 12d
      // 120: ifge 16a
      // 123: goto 12a
      // 126: invokestatic njx.a (Loov;)Loov;
      // 129: athrow
      // 12a: getstatic njx.e9o Z
      // 12d: iload 4
      // 12f: ifeq 14f
      // 132: ifne 16a
      // 135: goto 13c
      // 138: invokestatic njx.a (Loov;)Loov;
      // 13b: athrow
      // 13c: getstatic njx.anc Ljava/util/List;
      // 13f: aload 0
      // 140: getfield njx._16 Lmew;
      // 143: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 148: goto 14f
      // 14b: invokestatic njx.a (Loov;)Loov;
      // 14e: athrow
      // 14f: ifne 16a
      // 152: aload 0
      // 153: aload 0
      // 154: getfield njx._16 Lmew;
      // 157: invokevirtual njx.gp6 (Lmew;)V
      // 15a: getstatic njx.ek1 Lc05;
      // 15d: getfield c05.vg8 Ll86;
      // 160: invokevirtual l86.hgb ()V
      // 163: goto 16a
      // 166: invokestatic njx.a (Loov;)Loov;
      // 169: athrow
      // 16a: return
   }

   @jev
   public void gi1(b5k var1) {
      int var2 = t9d.b();

      for (mew var4 : anc) {
         double var5 = (double)var4.getX() - ek1.ibs().uok;
         double var7 = (double)var4.getY() - ek1.ibs().zmw;
         double var9 = (double)var4.getZ() - ek1.ibs().klp;
         hhf.m4t(var5, var7, var9, var5 + 1.0, var7 + 1.0, var9 + 1.0, 0.0F, 1.0F, 0.0F, 0.3F);
         if (var2 == 0) {
            break;
         }
      }
   }

   public void gp6(mew var1) {
      C08PacketPlayerBlockPlacement var10000;
      C08PacketPlayerBlockPlacement var10001;
      mew var10002;
      byte var10003;
      label16: {
         try {
            var10000 = new C08PacketPlayerBlockPlacement;
            var10001 = var10000;
            var10002 = var1;
            if ((double)var1.getY() + 0.5 < ek1.vg8.kfp + 1.7) {
               var10003 = 1;
               break label16;
            }
         } catch (oov var3) {
            throw a(var3);
         }

         var10003 = 0;
      }

      var10001./* $VF: Unable to resugar constructor */<init>(var10002, var10003, ek1.vg8.b5z(), 0.0F, 0.0F, 0.0F);
      C08PacketPlayerBlockPlacement var2 = var10000;
      ek1.vg8.lq7.sxi(var2);
      this.eey.u1k();
      e9o = true;
      this.nbt = this._16;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3388821222855240617L, 5415837599034413465L, MethodHandles.lookup().lookupClass()).a(249235780194021L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 56539121527786L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[6];
      int var5 = 0;
      String var4 = "Å\u0095)\u0018H\u008eó*\u00988ã\u0097k)6Üáü¤H·®Í]$ÂäNÛÑÂ¶ T\u0015\u0086iø²\u0019¶\u001cEZ\u000b\u0085ß>êYÜ\u009fÕè\u0082NT\u001eÄ\u0082YTÏgø\u0010\u009b\u000b¦U¹ä×E\u000bÈ\u0000P3²l\u00998\u0091×Á\u0012¸üÊ\u0012E\r\u0081\b\u001eìÆ\n\u0099a\u0096\u00826ÍR\u001d¬è\u008dÜ'>ÚF\f\u0089£ð¤\u0086ã\u009eÕ¢pý«\u0085ÄêL\u009eaZ\u0015\u001e\u0000Ó";
      int var6 = "Å\u0095)\u0018H\u008eó*\u00988ã\u0097k)6Üáü¤H·®Í]$ÂäNÛÑÂ¶ T\u0015\u0086iø²\u0019¶\u001cEZ\u000b\u0085ß>êYÜ\u009fÕè\u0082NT\u001eÄ\u0082YTÏgø\u0010\u009b\u000b¦U¹ä×E\u000bÈ\u0000P3²l\u00998\u0091×Á\u0012¸üÊ\u0012E\r\u0081\b\u001eìÆ\n\u0099a\u0096\u00826ÍR\u001d¬è\u008dÜ'>ÚF\f\u0089£ð¤\u0086ã\u009eÕ¢pý«\u0085ÄêL\u009eaZ\u0015\u001e\u0000Ó"
         .length();
      char var3 = ' ';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     f = var7;
                     g = new String[6];
                     anc = new ArrayList();
                     hc9 = new crk(b<"h">(10729, 2269762391258616708L ^ var9), b<"h">(30142, 7156989716865617874L ^ var9), 3.0F, 1.0F, 30.0F, 1.0F);
                     f35 = new crk(b<"h">(10729, 2269762391258616708L ^ var9), b<"h">(24070, 4637351395582911593L ^ var9), 2.0F, 1.0F, 6.0F, 0.1F);
                     e9o = false;
                     return;
                  }

                  var3 = var4.charAt(var12);
                  break;
               default:
                  var7[var5++] = var20;
                  if ((var12 += var3) < var6) {
                     var3 = var4.charAt(var12);
                     continue label27;
                  }

                  var4 = "\u0018¥\u0000ý]jþó)\u0017õáXËòH\u0096¥Á~GÑ²¿\u0001\u009b÷\u0006\u0000f»Æ(.Dù¹e¢DÚ\u00061\u0080£·íÁ\u0012ÁíAR\u009d©v\u0000÷¼cr¸e\u0092´:æÏ³g\u0012qÔ";
                  var6 = "\u0018¥\u0000ý]jþó)\u0017õáXËòH\u0096¥Á~GÑ²¿\u0001\u009b÷\u0006\u0000f»Æ(.Dù¹e¢DÚ\u00061\u0080£·íÁ\u0012ÁíAR\u009d©v\u0000÷¼cr¸e\u0092´:æÏ³g\u0012qÔ"
                     .length();
                  var3 = ' ';
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22838;
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
            throw new RuntimeException("njx", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = f[var5].getBytes("ISO-8859-1");
         g[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
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
         throw new RuntimeException("njx" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
