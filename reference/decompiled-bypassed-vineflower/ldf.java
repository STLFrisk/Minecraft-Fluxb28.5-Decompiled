import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ldf extends lhq {
   private static final long a;
   private static final String b;

   public ldf(ysf var1, double var2) {
      super(var1, var2, 16);
      this.xuz = var1;
   }

   @Override
   public boolean vle() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic ldf.a J
      // 03: ldc2_w 70925431896136
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic t9d.c ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: getfield ldf.i1n I
      // 10: iload 3
      // 11: ifne 69
      // 14: ifgt 65
      // 17: goto 1e
      // 1a: invokestatic ldf.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: iload 3
      // 20: ifne 5b
      // 23: goto 2a
      // 26: invokestatic ldf.a (Loov;)Loov;
      // 29: athrow
      // 2a: getfield ldf.xuz Lysf;
      // 2d: getfield ysf.oay Lt9d;
      // 30: invokevirtual t9d.eir ()Lef9;
      // 33: getstatic ldf.b Ljava/lang/String;
      // 36: nop
      // 37: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 3a: ifne 4a
      // 3d: goto 44
      // 40: invokestatic ldf.a (Loov;)Loov;
      // 43: athrow
      // 44: bipush 0
      // 45: ireturn
      // 46: invokestatic ldf.a (Loov;)Loov;
      // 49: athrow
      // 4a: aload 0
      // 4b: bipush -1
      // 4c: putfield ldf.cqa I
      // 4f: aload 0
      // 50: aload 0
      // 51: getfield ldf.xuz Lysf;
      // 54: invokevirtual ysf.bq7 ()Z
      // 57: putfield ldf.oby Z
      // 5a: aload 0
      // 5b: aload 0
      // 5c: getfield ldf.xuz Lysf;
      // 5f: invokevirtual ysf.sus ()Z
      // 62: putfield ldf.zh7 Z
      // 65: aload 0
      // 66: invokespecial lhq.vle ()Z
      // 69: ireturn
   }

   @Override
   public boolean wh3() {
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
      // 05: getfield ldf.cqa I
      // 08: iload 1
      // 09: ifne 21
      // 0c: iflt 33
      // 0f: goto 16
      // 12: invokestatic ldf.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: invokespecial lhq.wh3 ()Z
      // 1a: goto 21
      // 1d: invokestatic ldf.a (Loov;)Loov;
      // 20: athrow
      // 21: iload 1
      // 22: ifne 30
      // 25: ifeq 33
      // 28: goto 2f
      // 2b: invokestatic ldf.a (Loov;)Loov;
      // 2e: athrow
      // 2f: bipush 1
      // 30: goto 34
      // 33: bipush 0
      // 34: ireturn
   }

   @Override
   public void mnp() {
      super.mnp();
   }

   @Override
   public void zly() {
      super.zly();
   }

   @Override
   public void iad() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokespecial lhq.iad ()V
      // 004: invokestatic t9d.b ()I
      // 007: aload 0
      // 008: getfield ldf.xuz Lysf;
      // 00b: invokevirtual ysf.ph8 ()Lknw;
      // 00e: aload 0
      // 00f: getfield ldf.yiq Lmew;
      // 012: invokevirtual mew.getX ()I
      // 015: i2d
      // 016: ldc2_w 0.5
      // 019: dadd
      // 01a: aload 0
      // 01b: getfield ldf.yiq Lmew;
      // 01e: invokevirtual mew.getY ()I
      // 021: bipush 1
      // 022: iadd
      // 023: i2d
      // 024: aload 0
      // 025: getfield ldf.yiq Lmew;
      // 028: invokevirtual mew.getZ ()I
      // 02b: i2d
      // 02c: ldc2_w 0.5
      // 02f: dadd
      // 030: ldc 10.0
      // 032: nop
      // 033: aload 0
      // 034: getfield ldf.xuz Lysf;
      // 037: invokevirtual ysf.d1r ()I
      // 03a: i2f
      // 03b: invokevirtual knw.c2i (DDDFF)V
      // 03e: istore 1
      // 03f: aload 0
      // 040: iload 1
      // 041: ifeq 059
      // 044: invokevirtual ldf.p38 ()Z
      // 047: ifeq 224
      // 04a: goto 051
      // 04d: invokestatic ldf.a (Loov;)Loov;
      // 050: athrow
      // 051: aload 0
      // 052: goto 059
      // 055: invokestatic ldf.a (Loov;)Loov;
      // 058: athrow
      // 059: getfield ldf.xuz Lysf;
      // 05c: getfield ysf.oay Lt9d;
      // 05f: astore 2
      // 060: aload 0
      // 061: getfield ldf.yiq Lmew;
      // 064: invokevirtual mew.nuv ()Lmew;
      // 067: astore 3
      // 068: aload 2
      // 069: aload 3
      // 06a: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 06d: astore 4
      // 06f: aload 4
      // 071: invokeinterface zfz.r_y ()Le0x; 1
      // 076: astore 5
      // 078: aload 0
      // 079: getfield ldf.cqa I
      // 07c: iload 1
      // 07d: ifeq 0f3
      // 080: ifne 0dd
      // 083: goto 08a
      // 086: invokestatic ldf.a (Loov;)Loov;
      // 089: athrow
      // 08a: aload 5
      // 08c: instanceof ql4
      // 08f: iload 1
      // 090: ifeq 0f3
      // 093: goto 09a
      // 096: invokestatic ldf.a (Loov;)Loov;
      // 099: athrow
      // 09a: ifeq 0dd
      // 09d: goto 0a4
      // 0a0: invokestatic ldf.a (Loov;)Loov;
      // 0a3: athrow
      // 0a4: aload 4
      // 0a6: getstatic ql4.ul6 L_ku;
      // 0a9: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0ae: checkcast java/lang/Integer
      // 0b1: invokevirtual java/lang/Integer.intValue ()I
      // 0b4: bipush 7
      // 0b6: iload 1
      // 0b7: ifeq 0f4
      // 0ba: goto 0c1
      // 0bd: invokestatic ldf.a (Loov;)Loov;
      // 0c0: athrow
      // 0c1: if_icmpne 0dd
      // 0c4: goto 0cb
      // 0c7: invokestatic ldf.a (Loov;)Loov;
      // 0ca: athrow
      // 0cb: aload 2
      // 0cc: aload 3
      // 0cd: bipush 1
      // 0ce: invokevirtual t9d.yir (Lmew;Z)Z
      // 0d1: pop
      // 0d2: iload 1
      // 0d3: ifne 219
      // 0d6: goto 0dd
      // 0d9: invokestatic ldf.a (Loov;)Loov;
      // 0dc: athrow
      // 0dd: aload 0
      // 0de: iload 1
      // 0df: ifeq 21f
      // 0e2: goto 0e9
      // 0e5: invokestatic ldf.a (Loov;)Loov;
      // 0e8: athrow
      // 0e9: getfield ldf.cqa I
      // 0ec: goto 0f3
      // 0ef: invokestatic ldf.a (Loov;)Loov;
      // 0f2: athrow
      // 0f3: bipush 1
      // 0f4: if_icmpne 219
      // 0f7: aload 5
      // 0f9: getstatic ox_.ibw Le0x;
      // 0fc: if_acmpne 219
      // 0ff: goto 106
      // 102: invokestatic ldf.a (Loov;)Loov;
      // 105: athrow
      // 106: aload 0
      // 107: getfield ldf.xuz Lysf;
      // 10a: invokevirtual ysf.m2s ()Lgoq;
      // 10d: astore 6
      // 10f: bipush 0
      // 110: istore 7
      // 112: iload 7
      // 114: aload 6
      // 116: invokevirtual goq.opt ()I
      // 119: if_icmpge 219
      // 11c: aload 6
      // 11e: iload 7
      // 120: invokevirtual goq.ibn (I)Lerg;
      // 123: astore 8
      // 125: bipush 0
      // 126: istore 9
      // 128: iload 1
      // 129: ifeq 21e
      // 12c: aload 8
      // 12e: iload 1
      // 12f: ifeq 145
      // 132: goto 139
      // 135: invokestatic ldf.a (Loov;)Loov;
      // 138: athrow
      // 139: ifnull 1c0
      // 13c: goto 143
      // 13f: invokestatic ldf.a (Loov;)Loov;
      // 142: athrow
      // 143: aload 8
      // 145: invokevirtual erg.gn1 ()Lu7m;
      // 148: getstatic xbr.gj8 Lu7m;
      // 14b: iload 1
      // 14c: ifeq 17c
      // 14f: if_acmpne 16d
      // 152: goto 159
      // 155: invokestatic ldf.a (Loov;)Loov;
      // 158: athrow
      // 159: aload 2
      // 15a: aload 3
      // 15b: getstatic ox_.gi5 Le0x;
      // 15e: invokevirtual e0x.l4i ()Lzfz;
      // 161: bipush 3
      // 162: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 165: pop
      // 166: bipush 1
      // 167: istore 9
      // 169: iload 1
      // 16a: ifne 1c0
      // 16d: aload 8
      // 16f: invokevirtual erg.gn1 ()Lu7m;
      // 172: getstatic xbr.dzx Lu7m;
      // 175: goto 17c
      // 178: invokestatic ldf.a (Loov;)Loov;
      // 17b: athrow
      // 17c: iload 1
      // 17d: ifeq 1ad
      // 180: if_acmpne 19e
      // 183: goto 18a
      // 186: invokestatic ldf.a (Loov;)Loov;
      // 189: athrow
      // 18a: aload 2
      // 18b: aload 3
      // 18c: getstatic ox_.wl2 Le0x;
      // 18f: invokevirtual e0x.l4i ()Lzfz;
      // 192: bipush 3
      // 193: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 196: pop
      // 197: bipush 1
      // 198: istore 9
      // 19a: iload 1
      // 19b: ifne 1c0
      // 19e: aload 8
      // 1a0: invokevirtual erg.gn1 ()Lu7m;
      // 1a3: getstatic xbr.aar Lu7m;
      // 1a6: goto 1ad
      // 1a9: invokestatic ldf.a (Loov;)Loov;
      // 1ac: athrow
      // 1ad: if_acmpne 1c0
      // 1b0: aload 2
      // 1b1: aload 3
      // 1b2: getstatic ox_.r9b Le0x;
      // 1b5: invokevirtual e0x.l4i ()Lzfz;
      // 1b8: bipush 3
      // 1b9: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 1bc: pop
      // 1bd: bipush 1
      // 1be: istore 9
      // 1c0: iload 9
      // 1c2: iload 1
      // 1c3: ifeq 1f2
      // 1c6: ifeq 20b
      // 1c9: goto 1d0
      // 1cc: invokestatic ldf.a (Loov;)Loov;
      // 1cf: athrow
      // 1d0: aload 8
      // 1d2: dup
      // 1d3: getfield erg.qd2 I
      // 1d6: bipush 1
      // 1d7: isub
      // 1d8: putfield erg.qd2 I
      // 1db: iload 1
      // 1dc: ifeq 21e
      // 1df: goto 1e6
      // 1e2: invokestatic ldf.a (Loov;)Loov;
      // 1e5: athrow
      // 1e6: aload 8
      // 1e8: getfield erg.qd2 I
      // 1eb: goto 1f2
      // 1ee: invokestatic ldf.a (Loov;)Loov;
      // 1f1: athrow
      // 1f2: ifgt 219
      // 1f5: aload 6
      // 1f7: iload 7
      // 1f9: aconst_null
      // 1fa: checkcast erg
      // 1fd: invokevirtual goq.cxl (ILerg;)V
      // 200: iload 1
      // 201: ifne 219
      // 204: goto 20b
      // 207: invokestatic ldf.a (Loov;)Loov;
      // 20a: athrow
      // 20b: iinc 7 1
      // 20e: iload 1
      // 20f: ifne 112
      // 212: goto 219
      // 215: invokestatic ldf.a (Loov;)Loov;
      // 218: athrow
      // 219: aload 0
      // 21a: bipush -1
      // 21b: putfield ldf.cqa I
      // 21e: aload 0
      // 21f: bipush 10
      // 221: putfield ldf.i1n I
      // 224: return
   }

   @Override
   public boolean c0f(t9d param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 3
      // 004: aload 1
      // 005: aload 2
      // 006: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 009: invokeinterface zfz.r_y ()Le0x; 1
      // 00e: astore 4
      // 010: iload 3
      // 011: ifeq 028
      // 014: aload 4
      // 016: getstatic ox_._5i Le0x;
      // 019: if_acmpne 12d
      // 01c: goto 023
      // 01f: invokestatic ldf.a (Loov;)Loov;
      // 022: athrow
      // 023: aload 2
      // 024: invokevirtual mew.nuv ()Lmew;
      // 027: astore 2
      // 028: aload 1
      // 029: aload 2
      // 02a: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 02d: astore 5
      // 02f: aload 5
      // 031: invokeinterface zfz.r_y ()Le0x; 1
      // 036: astore 4
      // 038: aload 4
      // 03a: iload 3
      // 03b: ifeq 0cd
      // 03e: instanceof ql4
      // 041: ifeq 0cb
      // 044: goto 04b
      // 047: invokestatic ldf.a (Loov;)Loov;
      // 04a: athrow
      // 04b: aload 5
      // 04d: getstatic ql4.ul6 L_ku;
      // 050: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 055: checkcast java/lang/Integer
      // 058: invokevirtual java/lang/Integer.intValue ()I
      // 05b: iload 3
      // 05c: ifeq 07d
      // 05f: goto 066
      // 062: invokestatic ldf.a (Loov;)Loov;
      // 065: athrow
      // 066: bipush 7
      // 068: if_icmpne 0cb
      // 06b: goto 072
      // 06e: invokestatic ldf.a (Loov;)Loov;
      // 071: athrow
      // 072: aload 0
      // 073: getfield ldf.zh7 Z
      // 076: goto 07d
      // 079: invokestatic ldf.a (Loov;)Loov;
      // 07c: athrow
      // 07d: iload 3
      // 07e: ifeq 096
      // 081: ifeq 0cb
      // 084: goto 08b
      // 087: invokestatic ldf.a (Loov;)Loov;
      // 08a: athrow
      // 08b: aload 0
      // 08c: getfield ldf.cqa I
      // 08f: goto 096
      // 092: invokestatic ldf.a (Loov;)Loov;
      // 095: athrow
      // 096: iload 3
      // 097: ifeq 0ca
      // 09a: ifeq 0bd
      // 09d: goto 0a4
      // 0a0: invokestatic ldf.a (Loov;)Loov;
      // 0a3: athrow
      // 0a4: aload 0
      // 0a5: getfield ldf.cqa I
      // 0a8: iload 3
      // 0a9: ifeq 0ca
      // 0ac: goto 0b3
      // 0af: invokestatic ldf.a (Loov;)Loov;
      // 0b2: athrow
      // 0b3: ifge 0cb
      // 0b6: goto 0bd
      // 0b9: invokestatic ldf.a (Loov;)Loov;
      // 0bc: athrow
      // 0bd: aload 0
      // 0be: bipush 0
      // 0bf: putfield ldf.cqa I
      // 0c2: bipush 1
      // 0c3: goto 0ca
      // 0c6: invokestatic ldf.a (Loov;)Loov;
      // 0c9: athrow
      // 0ca: ireturn
      // 0cb: aload 4
      // 0cd: getstatic ox_.ibw Le0x;
      // 0d0: if_acmpne 12d
      // 0d3: aload 0
      // 0d4: getfield ldf.oby Z
      // 0d7: iload 3
      // 0d8: ifeq 12e
      // 0db: goto 0e2
      // 0de: invokestatic ldf.a (Loov;)Loov;
      // 0e1: athrow
      // 0e2: ifeq 12d
      // 0e5: goto 0ec
      // 0e8: invokestatic ldf.a (Loov;)Loov;
      // 0eb: athrow
      // 0ec: aload 0
      // 0ed: getfield ldf.cqa I
      // 0f0: iload 3
      // 0f1: ifeq 12c
      // 0f4: goto 0fb
      // 0f7: invokestatic ldf.a (Loov;)Loov;
      // 0fa: athrow
      // 0fb: bipush 1
      // 0fc: if_icmpeq 11f
      // 0ff: goto 106
      // 102: invokestatic ldf.a (Loov;)Loov;
      // 105: athrow
      // 106: aload 0
      // 107: getfield ldf.cqa I
      // 10a: iload 3
      // 10b: ifeq 12e
      // 10e: goto 115
      // 111: invokestatic ldf.a (Loov;)Loov;
      // 114: athrow
      // 115: ifge 12d
      // 118: goto 11f
      // 11b: invokestatic ldf.a (Loov;)Loov;
      // 11e: athrow
      // 11f: aload 0
      // 120: bipush 1
      // 121: putfield ldf.cqa I
      // 124: bipush 1
      // 125: goto 12c
      // 128: invokestatic ldf.a (Loov;)Loov;
      // 12b: athrow
      // 12c: ireturn
      // 12d: bipush 0
      // 12e: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1267360819291914473L, 7861278862302099437L, MethodHandles.lookup().lookupClass()).a(74157146179873L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 50381380438299L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("¢ìÆ°@Ì.B\u0099.vwZoñ\u0012".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
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
}
