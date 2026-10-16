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

public class _hv extends SubEngine {
   public static NumberSetting _48;
   public static BooleanSetting z8j;
   public static BooleanSetting cdj;
   public int iim;
   public double aeu;
   public double j14;
   public q6h _mi;
   private static final long a;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public _hv() {
      long var1 = a ^ 71018926558344L;
      super(a<"j">(188, 174565039825541708L ^ var1), a<"j">(24617, 4328158228647000798L ^ var1));
      this._mi = new q6h();
   }

   @Override
   public void onUpdate() {
      super.onUpdate();
   }

   @Override
   public void onRender() {
      double var10000;
      label16: {
         try {
            if (z8j.g7m()) {
               var10000 = 0.0;
               break label16;
            }
         } catch (oov var1) {
            throw a(var1);
         }

         var10000 = p_c.tz6() * 0.8;
      }

      p_c.u7g(var10000);
      this.wyl.gze.qeu = 1.0F;
      super.onRender();
   }

   @EventHandler
   public void _fx(PlayerUpdateEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield _hv.wyl Lc05;
      // 08: getfield Minecraft.vg8 Ll86;
      // 0b: getfield EntityPlayerSP.fcv Z
      // 0e: iload 2
      // 0f: ifne 2d
      // 12: ifeq 49
      // 15: goto 1c
      // 18: invokestatic _hv.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 0
      // 1d: getfield _hv.wyl Lc05;
      // 20: getfield Minecraft.vg8 Ll86;
      // 23: getfield EntityPlayerSP.lfk Z
      // 26: goto 2d
      // 29: invokestatic _hv.a (Loov;)Loov;
      // 2c: athrow
      // 2d: ifeq 49
      // 30: aload 1
      // 31: aload 0
      // 32: getfield _hv.wyl Lc05;
      // 35: getfield Minecraft.vg8 Ll86;
      // 38: getfield EntityPlayerSP.kfp D
      // 3b: ldc2_w 1.0E-14
      // 3e: dadd
      // 3f: invokevirtual PlayerUpdateEvent.o4n (D)V
      // 42: goto 49
      // 45: invokestatic _hv.a (Loov;)Loov;
      // 48: athrow
      // 49: return
   }

   @EventHandler
   public void nvr(Event var1) {
      double var2 = this.wyl.vg8.o2v - this.wyl.vg8.bc1;
      double var4 = this.wyl.vg8.vbd - this.wyl.vg8.a4d;
      this.j14 = Math.sqrt(var2 * var2 + var4 * var4);
   }

   @EventHandler
   public void qfv(_qa param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 2
      // 004: getstatic _hv.cdj Lcn7;
      // 007: invokevirtual BooleanSetting.getValue ()Ljava/lang/Boolean;
      // 00a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 00d: istore 3
      // 00e: invokestatic q0r.f2f ()Z
      // 011: iload 2
      // 012: ifne 064
      // 015: ifne 061
      // 018: goto 01f
      // 01b: invokestatic _hv.a (Loov;)Loov;
      // 01e: athrow
      // 01f: getstatic _hv.z8j Lcn7;
      // 022: invokevirtual BooleanSetting.g7m ()Z
      // 025: iload 2
      // 026: ifne 064
      // 029: goto 030
      // 02c: invokestatic _hv.a (Loov;)Loov;
      // 02f: athrow
      // 030: ifeq 061
      // 033: goto 03a
      // 036: invokestatic _hv.a (Loov;)Loov;
      // 039: athrow
      // 03a: aload 1
      // 03b: aload 1
      // 03c: aload 0
      // 03d: getfield _hv.wyl Lc05;
      // 040: getfield Minecraft.vg8 Ll86;
      // 043: aload 0
      // 044: getfield _hv.wyl Lc05;
      // 047: getfield Minecraft.vg8 Ll86;
      // 04a: dconst_0
      // 04b: dup2_x1
      // 04c: putfield EntityPlayerSP.icv D
      // 04f: dup2_x1
      // 050: putfield EntityPlayerSP.bw4 D
      // 053: dup2_x1
      // 054: putfield _qa.faq D
      // 057: putfield _qa.c6l D
      // 05a: goto 061
      // 05d: invokestatic _hv.a (Loov;)Loov;
      // 060: athrow
      // 061: invokestatic q0r.f2f ()Z
      // 064: iload 2
      // 065: ifne 08e
      // 068: ifeq 0ca
      // 06b: goto 072
      // 06e: invokestatic _hv.a (Loov;)Loov;
      // 071: athrow
      // 072: aload 0
      // 073: iload 2
      // 074: ifne 0cb
      // 077: goto 07e
      // 07a: invokestatic _hv.a (Loov;)Loov;
      // 07d: athrow
      // 07e: getfield _hv.wyl Lc05;
      // 081: getfield Minecraft.vg8 Ll86;
      // 084: getfield EntityPlayerSP.lfk Z
      // 087: goto 08e
      // 08a: invokestatic _hv.a (Loov;)Loov;
      // 08d: athrow
      // 08e: ifne 0ca
      // 091: aload 0
      // 092: getfield _hv.iim I
      // 095: iload 2
      // 096: ifne 0db
      // 099: goto 0a0
      // 09c: invokestatic _hv.a (Loov;)Loov;
      // 09f: athrow
      // 0a0: bipush 1
      // 0a1: if_icmpne 0d1
      // 0a4: goto 0ab
      // 0a7: invokestatic _hv.a (Loov;)Loov;
      // 0aa: athrow
      // 0ab: aload 0
      // 0ac: getfield _hv.wyl Lc05;
      // 0af: getfield Minecraft.vg8 Ll86;
      // 0b2: getfield EntityPlayerSP.fcv Z
      // 0b5: iload 2
      // 0b6: ifne 0db
      // 0b9: goto 0c0
      // 0bc: invokestatic _hv.a (Loov;)Loov;
      // 0bf: athrow
      // 0c0: ifeq 0d1
      // 0c3: goto 0ca
      // 0c6: invokestatic _hv.a (Loov;)Loov;
      // 0c9: athrow
      // 0ca: aload 0
      // 0cb: invokestatic p_c.tz6 ()D
      // 0ce: putfield _hv.aeu D
      // 0d1: aload 0
      // 0d2: getfield _hv.wyl Lc05;
      // 0d5: getfield Minecraft.vg8 Ll86;
      // 0d8: getfield EntityPlayerSP.lfk Z
      // 0db: iload 2
      // 0dc: ifne 1a8
      // 0df: ifeq 19d
      // 0e2: goto 0e9
      // 0e5: invokestatic _hv.a (Loov;)Loov;
      // 0e8: athrow
      // 0e9: invokestatic q0r.fsj ()Z
      // 0ec: iload 2
      // 0ed: ifne 1a8
      // 0f0: goto 0f7
      // 0f3: invokestatic _hv.a (Loov;)Loov;
      // 0f6: athrow
      // 0f7: ifeq 19d
      // 0fa: goto 101
      // 0fd: invokestatic _hv.a (Loov;)Loov;
      // 100: athrow
      // 101: aload 0
      // 102: getfield _hv.iim I
      // 105: bipush 2
      // 106: iload 2
      // 107: ifne 1b4
      // 10a: goto 111
      // 10d: invokestatic _hv.a (Loov;)Loov;
      // 110: athrow
      // 111: if_icmpne 19d
      // 114: goto 11b
      // 117: invokestatic _hv.a (Loov;)Loov;
      // 11a: athrow
      // 11b: iload 3
      // 11c: iload 2
      // 11d: ifne 177
      // 120: goto 127
      // 123: invokestatic _hv.a (Loov;)Loov;
      // 126: athrow
      // 127: ifeq 145
      // 12a: goto 131
      // 12d: invokestatic _hv.a (Loov;)Loov;
      // 130: athrow
      // 131: aload 0
      // 132: getfield _hv.wyl Lc05;
      // 135: getfield Minecraft.gze Laba;
      // 138: ldc 3.0
      // 13a: nop
      // 13b: putfield aba.qeu F
      // 13e: goto 145
      // 141: invokestatic _hv.a (Loov;)Loov;
      // 144: athrow
      // 145: aload 0
      // 146: getfield _hv.wyl Lc05;
      // 149: getfield Minecraft.vg8 Ll86;
      // 14c: invokevirtual EntityPlayerSP.xv1 ()V
      // 14f: aload 1
      // 150: aload 0
      // 151: getfield _hv.wyl Lc05;
      // 154: getfield Minecraft.vg8 Ll86;
      // 157: ldc2_w 0.40666
      // 15a: invokestatic p_c.vmu ()I
      // 15d: i2d
      // 15e: ldc2_w 0.1
      // 161: dmul
      // 162: dadd
      // 163: dup2_x1
      // 164: putfield EntityPlayerSP.mop D
      // 167: invokevirtual _qa.ziq (D)V
      // 16a: aload 0
      // 16b: dup
      // 16c: getfield _hv.aeu D
      // 16f: ldc2_w 1.61
      // 172: dmul
      // 173: putfield _hv.aeu D
      // 176: iload 3
      // 177: iload 2
      // 178: ifne 2fb
      // 17b: ifeq 2de
      // 17e: goto 185
      // 181: invokestatic _hv.a (Loov;)Loov;
      // 184: athrow
      // 185: aload 0
      // 186: getfield _hv.wyl Lc05;
      // 189: getfield Minecraft.gze Laba;
      // 18c: ldc 3.0
      // 18e: nop
      // 18f: putfield aba.qeu F
      // 192: iload 2
      // 193: ifeq 2de
      // 196: goto 19d
      // 199: invokestatic _hv.a (Loov;)Loov;
      // 19c: athrow
      // 19d: aload 0
      // 19e: getfield _hv.iim I
      // 1a1: goto 1a8
      // 1a4: invokestatic _hv.a (Loov;)Loov;
      // 1a7: athrow
      // 1a8: iload 2
      // 1a9: ifne 1ff
      // 1ac: bipush 3
      // 1ad: goto 1b4
      // 1b0: invokestatic _hv.a (Loov;)Loov;
      // 1b3: athrow
      // 1b4: if_icmpne 1f7
      // 1b7: ldc2_w 0.66
      // 1ba: aload 0
      // 1bb: getfield _hv.j14 D
      // 1be: invokestatic p_c.tz6 ()D
      // 1c1: dsub
      // 1c2: dmul
      // 1c3: dstore 4
      // 1c5: aload 0
      // 1c6: iload 2
      // 1c7: ifne 1e7
      // 1ca: aload 0
      // 1cb: getfield _hv.j14 D
      // 1ce: dload 4
      // 1d0: dsub
      // 1d1: putfield _hv.aeu D
      // 1d4: iload 3
      // 1d5: ifeq 1f3
      // 1d8: goto 1df
      // 1db: invokestatic _hv.a (Loov;)Loov;
      // 1de: athrow
      // 1df: aload 0
      // 1e0: goto 1e7
      // 1e3: invokestatic _hv.a (Loov;)Loov;
      // 1e6: athrow
      // 1e7: getfield _hv.wyl Lc05;
      // 1ea: getfield Minecraft.gze Laba;
      // 1ed: ldc 3.0
      // 1ef: nop
      // 1f0: putfield aba.qeu F
      // 1f3: iload 2
      // 1f4: ifeq 2de
      // 1f7: iload 3
      // 1f8: goto 1ff
      // 1fb: invokestatic _hv.a (Loov;)Loov;
      // 1fe: athrow
      // 1ff: ifeq 214
      // 202: aload 0
      // 203: getfield _hv.wyl Lc05;
      // 206: getfield Minecraft.gze Laba;
      // 209: fconst_1
      // 20a: putfield aba.qeu F
      // 20d: goto 214
      // 210: invokestatic _hv.a (Loov;)Loov;
      // 213: athrow
      // 214: aload 0
      // 215: getfield _hv.wyl Lc05;
      // 218: getfield Minecraft.tij Lkh3;
      // 21b: aload 0
      // 21c: getfield _hv.wyl Lc05;
      // 21f: getfield Minecraft.vg8 Ll86;
      // 222: aload 0
      // 223: getfield _hv.wyl Lc05;
      // 226: getfield Minecraft.vg8 Ll86;
      // 229: invokevirtual EntityPlayerSP.rhs ()Lnh4;
      // 22c: dconst_0
      // 22d: aload 0
      // 22e: getfield _hv.wyl Lc05;
      // 231: getfield Minecraft.vg8 Ll86;
      // 234: getfield EntityPlayerSP.mop D
      // 237: dconst_0
      // 238: invokevirtual nh4.sy_ (DDD)Lnh4;
      // 23b: invokevirtual WorldClient.bb4 (Li2h;Lnh4;)Ljava/util/List;
      // 23e: astore 4
      // 240: aload 4
      // 242: invokeinterface java/util/List.size ()I 1
      // 247: iload 2
      // 248: ifne 2a9
      // 24b: ifgt 293
      // 24e: goto 255
      // 251: invokestatic _hv.a (Loov;)Loov;
      // 254: athrow
      // 255: aload 0
      // 256: getfield _hv.wyl Lc05;
      // 259: getfield Minecraft.vg8 Ll86;
      // 25c: getfield EntityPlayerSP.fcv Z
      // 25f: iload 2
      // 260: ifne 2a9
      // 263: goto 26a
      // 266: invokestatic _hv.a (Loov;)Loov;
      // 269: athrow
      // 26a: ifne 293
      // 26d: goto 274
      // 270: invokestatic _hv.a (Loov;)Loov;
      // 273: athrow
      // 274: aload 0
      // 275: iload 2
      // 276: ifne 2ce
      // 279: goto 280
      // 27c: invokestatic _hv.a (Loov;)Loov;
      // 27f: athrow
      // 280: getfield _hv.wyl Lc05;
      // 283: getfield Minecraft.vg8 Ll86;
      // 286: getfield EntityPlayerSP.cbi Z
      // 289: ifeq 2cd
      // 28c: goto 293
      // 28f: invokestatic _hv.a (Loov;)Loov;
      // 292: athrow
      // 293: aload 0
      // 294: iload 2
      // 295: ifne 2ce
      // 298: goto 29f
      // 29b: invokestatic _hv.a (Loov;)Loov;
      // 29e: athrow
      // 29f: getfield _hv.iim I
      // 2a2: goto 2a9
      // 2a5: invokestatic _hv.a (Loov;)Loov;
      // 2a8: athrow
      // 2a9: ifle 2cd
      // 2ac: aload 0
      // 2ad: invokestatic q0r.fsj ()Z
      // 2b0: iload 2
      // 2b1: ifne 2c6
      // 2b4: goto 2bb
      // 2b7: invokestatic _hv.a (Loov;)Loov;
      // 2ba: athrow
      // 2bb: ifeq 2c9
      // 2be: goto 2c5
      // 2c1: invokestatic _hv.a (Loov;)Loov;
      // 2c4: athrow
      // 2c5: bipush 1
      // 2c6: goto 2ca
      // 2c9: bipush 0
      // 2ca: putfield _hv.iim I
      // 2cd: aload 0
      // 2ce: aload 0
      // 2cf: getfield _hv.j14 D
      // 2d2: aload 0
      // 2d3: getfield _hv.j14 D
      // 2d6: ldc2_w 159.0
      // 2d9: ddiv
      // 2da: dsub
      // 2db: putfield _hv.aeu D
      // 2de: aload 0
      // 2df: aload 0
      // 2e0: getfield _hv.aeu D
      // 2e3: invokestatic p_c.tz6 ()D
      // 2e6: invokestatic java/lang/Math.max (DD)D
      // 2e9: putfield _hv.aeu D
      // 2ec: aload 0
      // 2ed: iload 2
      // 2ee: ifne 33b
      // 2f1: getfield _hv.iim I
      // 2f4: goto 2fb
      // 2f7: invokestatic _hv.a (Loov;)Loov;
      // 2fa: athrow
      // 2fb: ifle 33a
      // 2fe: invokestatic q0r.fsj ()Z
      // 301: ifeq 33a
      // 304: goto 30b
      // 307: invokestatic _hv.a (Loov;)Loov;
      // 30a: athrow
      // 30b: fconst_1
      // 30c: aload 0
      // 30d: getfield _hv.wyl Lc05;
      // 310: getfield Minecraft.vg8 Ll86;
      // 313: getfield EntityPlayerSP.qqi I
      // 316: i2f
      // 317: ldc 200.0
      // 319: nop
      // 31a: fdiv
      // 31b: getstatic _hv._48 Lcrk;
      // 31e: invokevirtual NumberSetting.getValue ()Ljava/lang/Float;
      // 321: invokevirtual java/lang/Float.floatValue ()F
      // 324: fmul
      // 325: fadd
      // 326: f2d
      // 327: ldc2_w 1.08
      // 32a: invokestatic java/lang/Math.min (DD)D
      // 32d: dstore 4
      // 32f: aload 1
      // 330: aload 0
      // 331: getfield _hv.aeu D
      // 334: dload 4
      // 336: dmul
      // 337: invokestatic Speed.o0x (L_qa;D)V
      // 33a: aload 0
      // 33b: dup
      // 33c: getfield _hv.iim I
      // 33f: bipush 1
      // 340: iadd
      // 341: putfield _hv.iim I
      // 344: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-4046787718870205242L, 3797757992852797657L, MethodHandles.lookup().lookupClass()).a(256566967015082L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 27149550460792L;
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
      String var4 = "Oc8j\u0005çùÈ>7\u008f\u00832\u0086\u000eý ¿\u0014é³»DÇ\u009c!-iN¨~\u0016°\u0083ä\t{\u0012\u00036{Ë+ºóàÞ\u009d=\u0010Ó\u001cYÓfîu\n\u009bk\u0003g\u008a^Ä¯ =èh\u0093`\u0013æ2ê\u001fÞ\u001d\u0093ê7RJm7\fT\bï\u0086\tMæüÈï\u0006\u009e";
      int var6 = "Oc8j\u0005çùÈ>7\u008f\u00832\u0086\u000eý ¿\u0014é³»DÇ\u009c!-iN¨~\u0016°\u0083ä\t{\u0012\u00036{Ë+ºóàÞ\u009d=\u0010Ó\u001cYÓfîu\n\u009bk\u0003g\u008a^Ä¯ =èh\u0093`\u0013æ2ê\u001fÞ\u001d\u0093ê7RJm7\fT\bï\u0086\tMæüÈï\u0006\u009e"
         .length();
      char var3 = 16;
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
                     d = var7;
                     e = new String[6];
                     _48 = new NumberSetting(a<"j">(9007, 3130499421770983978L ^ var9), a<"j">(20661, 7464335965261519283L ^ var9), 0.45F, 0.0F, 1.0F, 0.001F);
                     z8j = new BooleanSetting(a<"j">(9007, 3130499421770983978L ^ var9), a<"j">(18013, 2175521142720286553L ^ var9), true);
                     cdj = new BooleanSetting(a<"j">(9007, 3130499421770983978L ^ var9), a<"j">(1580, 5703985017046503213L ^ var9), true);
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

                  var4 = "ó\u001e°Ô÷o\u008d\u0087²Øt\u0099è|\u000e!\u001cÀÔÒº\u001c\u0083&ðú\u0000÷\u000f\u009avK\u0010±åyfû8£ì8 \u001aj\u0000\u0002£Ñ";
                  var6 = "ó\u001e°Ô÷o\u008d\u0087²Øt\u0099è|\u000e!\u001cÀÔÒº\u001c\u0083&ðú\u0000÷\u000f\u009avK\u0010±åyfû8£ì8 \u001aj\u0000\u0002£Ñ"
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11367;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("_hv", var10);
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
         throw new RuntimeException("_hv" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
