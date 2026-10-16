import java.lang.invoke.MethodHandles;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class o9v extends gyu {
   public boolean ea2;
   private static final long a;
   private static final String f;

   public o9v(int var1) {
      super(var1);
      this.j10(0.8F, 0.4F);
      this.wzy(hmf);
      this.c1d.add(new gyu$dwn(zfo.class, 5, 2, 6));
      this.dmv.c10 = -999;
      this.dmv.k9k = 4;
      this.dmv.qy9 = 10;
   }

   @Override
   public u5m$cco op2(Random param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: getstatic o9v.sx9 Luwf;
      // 07: aload 2
      // 08: invokevirtual mew.getX ()I
      // 0b: i2d
      // 0c: ldc2_w 200.0
      // 0f: ddiv
      // 10: aload 2
      // 11: invokevirtual mew.getZ ()I
      // 14: i2d
      // 15: ldc2_w 200.0
      // 18: ddiv
      // 19: invokevirtual uwf.oj4 (DD)D
      // 1c: dstore 4
      // 1e: dload 4
      // 20: ldc2_w -0.8
      // 23: dcmpg
      // 24: iload 3
      // 25: ifne 71
      // 28: ifge 6c
      // 2b: goto 32
      // 2e: invokestatic o9v.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 1
      // 33: bipush 4
      // 34: invokevirtual java/util/Random.nextInt (I)I
      // 37: istore 6
      // 39: iload 6
      // 3b: tableswitch 45 0 3 29 37 41 45
      // 58: getstatic u5m$cco.lam Lu5m$cco;
      // 5b: areturn
      // 5c: invokestatic o9v.a (Loov;)Loov;
      // 5f: athrow
      // 60: getstatic u5m$cco.k5h Lu5m$cco;
      // 63: areturn
      // 64: getstatic u5m$cco.ph9 Lu5m$cco;
      // 67: areturn
      // 68: getstatic u5m$cco.q_1 Lu5m$cco;
      // 6b: areturn
      // 6c: aload 1
      // 6d: bipush 3
      // 6e: invokevirtual java/util/Random.nextInt (I)I
      // 71: iload 3
      // 72: ifne 8b
      // 75: ifle bb
      // 78: goto 7f
      // 7b: invokestatic o9v.a (Loov;)Loov;
      // 7e: athrow
      // 7f: aload 1
      // 80: bipush 3
      // 81: invokevirtual java/util/Random.nextInt (I)I
      // 84: goto 8b
      // 87: invokestatic o9v.a (Loov;)Loov;
      // 8a: athrow
      // 8b: istore 6
      // 8d: iload 6
      // 8f: iload 3
      // 90: ifne a9
      // 93: ifne a7
      // 96: goto 9d
      // 99: invokestatic o9v.a (Loov;)Loov;
      // 9c: athrow
      // 9d: getstatic u5m$cco.gye Lu5m$cco;
      // a0: goto ba
      // a3: invokestatic o9v.a (Loov;)Loov;
      // a6: athrow
      // a7: iload 6
      // a9: bipush 1
      // aa: if_icmpne b7
      // ad: getstatic u5m$cco.g5b Lu5m$cco;
      // b0: goto ba
      // b3: invokestatic o9v.a (Loov;)Loov;
      // b6: athrow
      // b7: getstatic u5m$cco.eet Lu5m$cco;
      // ba: areturn
      // bb: getstatic u5m$cco.r1p Lu5m$cco;
      // be: areturn
   }

   @Override
   public void u0r(t9d param1, Random param2, mew param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 4
      // 005: getstatic o9v.sx9 Luwf;
      // 008: aload 3
      // 009: invokevirtual mew.getX ()I
      // 00c: bipush 8
      // 00e: iadd
      // 00f: i2d
      // 010: ldc2_w 200.0
      // 013: ddiv
      // 014: aload 3
      // 015: invokevirtual mew.getZ ()I
      // 018: bipush 8
      // 01a: iadd
      // 01b: i2d
      // 01c: ldc2_w 200.0
      // 01f: ddiv
      // 020: invokevirtual uwf.oj4 (DD)D
      // 023: dstore 5
      // 025: dload 5
      // 027: ldc2_w -0.8
      // 02a: dcmpg
      // 02b: iload 4
      // 02d: ifne 079
      // 030: ifge 057
      // 033: goto 03a
      // 036: invokestatic o9v.a (Loov;)Loov;
      // 039: athrow
      // 03a: aload 0
      // 03b: getfield o9v.dmv Lj0j;
      // 03e: bipush 15
      // 040: putfield j0j.k9k I
      // 043: aload 0
      // 044: getfield o9v.dmv Lj0j;
      // 047: bipush 5
      // 048: putfield j0j.qy9 I
      // 04b: iload 4
      // 04d: ifeq 0d8
      // 050: goto 057
      // 053: invokestatic o9v.a (Loov;)Loov;
      // 056: athrow
      // 057: aload 0
      // 058: getfield o9v.dmv Lj0j;
      // 05b: bipush 4
      // 05c: putfield j0j.k9k I
      // 05f: aload 0
      // 060: getfield o9v.dmv Lj0j;
      // 063: bipush 10
      // 065: putfield j0j.qy9 I
      // 068: getstatic o9v.e_t Luio;
      // 06b: getstatic ldj$vn8.h4k Lldj$vn8;
      // 06e: invokevirtual uio.r91 (Lldj$vn8;)V
      // 071: bipush 0
      // 072: goto 079
      // 075: invokestatic o9v.a (Loov;)Loov;
      // 078: athrow
      // 079: istore 7
      // 07b: iload 7
      // 07d: bipush 7
      // 07f: if_icmpge 0d8
      // 082: aload 2
      // 083: bipush 16
      // 085: invokevirtual java/util/Random.nextInt (I)I
      // 088: bipush 8
      // 08a: iadd
      // 08b: istore 8
      // 08d: aload 2
      // 08e: bipush 16
      // 090: invokevirtual java/util/Random.nextInt (I)I
      // 093: bipush 8
      // 095: iadd
      // 096: istore 9
      // 098: aload 2
      // 099: aload 1
      // 09a: aload 3
      // 09b: iload 8
      // 09d: bipush 0
      // 09e: iload 9
      // 0a0: invokevirtual mew.ec4 (III)Lmew;
      // 0a3: invokevirtual t9d.p9y (Lmew;)Lmew;
      // 0a6: invokevirtual mew.getY ()I
      // 0a9: bipush 32
      // 0ab: iadd
      // 0ac: invokevirtual java/util/Random.nextInt (I)I
      // 0af: istore 10
      // 0b1: getstatic o9v.e_t Luio;
      // 0b4: aload 1
      // 0b5: aload 2
      // 0b6: aload 3
      // 0b7: iload 8
      // 0b9: iload 10
      // 0bb: iload 9
      // 0bd: invokevirtual mew.ec4 (III)Lmew;
      // 0c0: invokevirtual uio.v3g (Lt9d;Ljava/util/Random;Lmew;)Z
      // 0c3: pop
      // 0c4: iinc 7 1
      // 0c7: iload 4
      // 0c9: ifne 15b
      // 0cc: iload 4
      // 0ce: ifeq 07b
      // 0d1: goto 0d8
      // 0d4: invokestatic o9v.a (Loov;)Loov;
      // 0d7: athrow
      // 0d8: aload 0
      // 0d9: iload 4
      // 0db: ifne 155
      // 0de: getfield o9v.ea2 Z
      // 0e1: ifeq 154
      // 0e4: goto 0eb
      // 0e7: invokestatic o9v.a (Loov;)Loov;
      // 0ea: athrow
      // 0eb: getstatic o9v.e_t Luio;
      // 0ee: getstatic ldj$vn8.abu Lldj$vn8;
      // 0f1: invokevirtual uio.r91 (Lldj$vn8;)V
      // 0f4: bipush 0
      // 0f5: istore 7
      // 0f7: iload 7
      // 0f9: bipush 10
      // 0fb: if_icmpge 154
      // 0fe: aload 2
      // 0ff: bipush 16
      // 101: invokevirtual java/util/Random.nextInt (I)I
      // 104: bipush 8
      // 106: iadd
      // 107: istore 8
      // 109: aload 2
      // 10a: bipush 16
      // 10c: invokevirtual java/util/Random.nextInt (I)I
      // 10f: bipush 8
      // 111: iadd
      // 112: istore 9
      // 114: aload 2
      // 115: aload 1
      // 116: aload 3
      // 117: iload 8
      // 119: bipush 0
      // 11a: iload 9
      // 11c: invokevirtual mew.ec4 (III)Lmew;
      // 11f: invokevirtual t9d.p9y (Lmew;)Lmew;
      // 122: invokevirtual mew.getY ()I
      // 125: bipush 32
      // 127: iadd
      // 128: invokevirtual java/util/Random.nextInt (I)I
      // 12b: istore 10
      // 12d: getstatic o9v.e_t Luio;
      // 130: aload 1
      // 131: aload 2
      // 132: aload 3
      // 133: iload 8
      // 135: iload 10
      // 137: iload 9
      // 139: invokevirtual mew.ec4 (III)Lmew;
      // 13c: invokevirtual uio.v3g (Lt9d;Ljava/util/Random;Lmew;)Z
      // 13f: pop
      // 140: iinc 7 1
      // 143: iload 4
      // 145: ifne 15b
      // 148: iload 4
      // 14a: ifeq 0f7
      // 14d: goto 154
      // 150: invokestatic o9v.a (Loov;)Loov;
      // 153: athrow
      // 154: aload 0
      // 155: aload 1
      // 156: aload 2
      // 157: aload 3
      // 158: invokespecial gyu.u0r (Lt9d;Ljava/util/Random;Lmew;)V
      // 15b: return
   }

   @Override
   public gyu hiq(int var1) {
      long var2 = a ^ 111844990630936L;
      o9v var4 = new o9v(var1);
      var4.cb4(f);
      var4.ea2 = true;
      var4.hf1(9286496);
      var4.ril = 14273354;
      return var4;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-4413090536372018186L, -1840716184876407721L, MethodHandles.lookup().lookupClass()).a(252113570838627L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 99454672034012L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("Â<%\u008eà)ä\u0082u8õ\u0099«Èð*0|^\u0002æ\u008d('".getBytes("ISO-8859-1"));
      String var6 = b(var4).intern();
      byte var10001 = -1;
      f = var6;
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
}
