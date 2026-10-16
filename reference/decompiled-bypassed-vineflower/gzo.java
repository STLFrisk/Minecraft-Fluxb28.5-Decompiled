import java.lang.invoke.MethodHandles;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class gzo extends gyu {
   private static final jun uv0;
   private static final lkp ell;
   private static final _q4 icp;
   private static final _q4 vc8;
   private static final m03 bql;
   private int fob;
   private static final long a;
   private static final String f;

   public gzo(int var1, int var2) {
      super(var1);
      this.fob = var2;
      this.c1d.add(new gyu$dwn(gse.class, 8, 4, 4));
      this.dmv.c10 = 10;
      if (var2 != 1) {
         try {
            if (var2 != 2) {
               this.dmv.qy9 = 1;
               this.dmv.th5 = 1;
               return;
            }
         } catch (oov var3) {
            throw a(var3);
         }
      }

      this.dmv.qy9 = 7;
      this.dmv.pcg = 1;
      this.dmv.th5 = 3;
   }

   @Override
   public e9q jk9(Random param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield gzo.fob I
      // 08: iload 2
      // 09: ifne 3d
      // 0c: bipush 1
      // 0d: if_icmpeq 31
      // 10: goto 17
      // 13: invokestatic gzo.a (Loov;)Loov;
      // 16: athrow
      // 17: aload 0
      // 18: getfield gzo.fob I
      // 1b: iload 2
      // 1c: ifne 8a
      // 1f: goto 26
      // 22: invokestatic gzo.a (Loov;)Loov;
      // 25: athrow
      // 26: bipush 2
      // 27: if_icmpne 85
      // 2a: goto 31
      // 2d: invokestatic gzo.a (Loov;)Loov;
      // 30: athrow
      // 31: aload 1
      // 32: bipush 3
      // 33: invokevirtual java/util/Random.nextInt (I)I
      // 36: goto 3d
      // 39: invokestatic gzo.a (Loov;)Loov;
      // 3c: athrow
      // 3d: iload 2
      // 3e: ifne 8a
      // 41: ifne 85
      // 44: goto 4b
      // 47: invokestatic gzo.a (Loov;)Loov;
      // 4a: athrow
      // 4b: aload 0
      // 4c: getfield gzo.fob I
      // 4f: iload 2
      // 50: ifne 72
      // 53: goto 5a
      // 56: invokestatic gzo.a (Loov;)Loov;
      // 59: athrow
      // 5a: bipush 2
      // 5b: if_icmpeq 7f
      // 5e: goto 65
      // 61: invokestatic gzo.a (Loov;)Loov;
      // 64: athrow
      // 65: aload 1
      // 66: bipush 13
      // 68: invokevirtual java/util/Random.nextInt (I)I
      // 6b: goto 72
      // 6e: invokestatic gzo.a (Loov;)Loov;
      // 71: athrow
      // 72: ifeq 7f
      // 75: getstatic gzo.icp L_q4;
      // 78: goto 9a
      // 7b: invokestatic gzo.a (Loov;)Loov;
      // 7e: athrow
      // 7f: getstatic gzo.vc8 L_q4;
      // 82: goto 9a
      // 85: aload 1
      // 86: bipush 3
      // 87: invokevirtual java/util/Random.nextInt (I)I
      // 8a: ifne 97
      // 8d: getstatic gzo.uv0 Ljun;
      // 90: goto 9a
      // 93: invokestatic gzo.a (Loov;)Loov;
      // 96: athrow
      // 97: getstatic gzo.ell Llkp;
      // 9a: areturn
   }

   @Override
   public cdu ncq(Random var1) {
      try {
         if (var1.nextInt(5) > 0) {
            return new ffi(rh2$j7i.hqk);
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return new ffi(rh2$j7i.jd3);
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
      // 005: aload 0
      // 006: getfield gzo.fob I
      // 009: iload 4
      // 00b: ifne 040
      // 00e: bipush 1
      // 00f: if_icmpeq 034
      // 012: goto 019
      // 015: invokestatic gzo.a (Loov;)Loov;
      // 018: athrow
      // 019: aload 0
      // 01a: getfield gzo.fob I
      // 01d: iload 4
      // 01f: ifne 09a
      // 022: goto 029
      // 025: invokestatic gzo.a (Loov;)Loov;
      // 028: athrow
      // 029: bipush 2
      // 02a: if_icmpne 090
      // 02d: goto 034
      // 030: invokestatic gzo.a (Loov;)Loov;
      // 033: athrow
      // 034: aload 2
      // 035: bipush 3
      // 036: invokevirtual java/util/Random.nextInt (I)I
      // 039: goto 040
      // 03c: invokestatic gzo.a (Loov;)Loov;
      // 03f: athrow
      // 040: istore 5
      // 042: bipush 0
      // 043: istore 6
      // 045: iload 6
      // 047: iload 5
      // 049: if_icmpge 090
      // 04c: aload 2
      // 04d: bipush 16
      // 04f: invokevirtual java/util/Random.nextInt (I)I
      // 052: bipush 8
      // 054: iadd
      // 055: istore 7
      // 057: aload 2
      // 058: bipush 16
      // 05a: invokevirtual java/util/Random.nextInt (I)I
      // 05d: bipush 8
      // 05f: iadd
      // 060: istore 8
      // 062: aload 1
      // 063: aload 3
      // 064: iload 7
      // 066: bipush 0
      // 067: iload 8
      // 069: invokevirtual mew.ec4 (III)Lmew;
      // 06c: invokevirtual t9d.p9y (Lmew;)Lmew;
      // 06f: astore 9
      // 071: getstatic gzo.bql Lm03;
      // 074: aload 1
      // 075: aload 2
      // 076: aload 9
      // 078: invokevirtual m03.v3g (Lt9d;Ljava/util/Random;Lmew;)Z
      // 07b: pop
      // 07c: iinc 6 1
      // 07f: iload 4
      // 081: ifne 099
      // 084: iload 4
      // 086: ifeq 045
      // 089: goto 090
      // 08c: invokestatic gzo.a (Loov;)Loov;
      // 08f: athrow
      // 090: getstatic gzo.e_t Luio;
      // 093: getstatic ldj$vn8.t7o Lldj$vn8;
      // 096: invokevirtual uio.r91 (Lldj$vn8;)V
      // 099: bipush 0
      // 09a: istore 5
      // 09c: iload 5
      // 09e: bipush 7
      // 0a0: if_icmpge 0f9
      // 0a3: aload 2
      // 0a4: bipush 16
      // 0a6: invokevirtual java/util/Random.nextInt (I)I
      // 0a9: bipush 8
      // 0ab: iadd
      // 0ac: istore 6
      // 0ae: aload 2
      // 0af: bipush 16
      // 0b1: invokevirtual java/util/Random.nextInt (I)I
      // 0b4: bipush 8
      // 0b6: iadd
      // 0b7: istore 7
      // 0b9: aload 2
      // 0ba: aload 1
      // 0bb: aload 3
      // 0bc: iload 6
      // 0be: bipush 0
      // 0bf: iload 7
      // 0c1: invokevirtual mew.ec4 (III)Lmew;
      // 0c4: invokevirtual t9d.p9y (Lmew;)Lmew;
      // 0c7: invokevirtual mew.getY ()I
      // 0ca: bipush 32
      // 0cc: iadd
      // 0cd: invokevirtual java/util/Random.nextInt (I)I
      // 0d0: istore 8
      // 0d2: getstatic gzo.e_t Luio;
      // 0d5: aload 1
      // 0d6: aload 2
      // 0d7: aload 3
      // 0d8: iload 6
      // 0da: iload 8
      // 0dc: iload 7
      // 0de: invokevirtual mew.ec4 (III)Lmew;
      // 0e1: invokevirtual uio.v3g (Lt9d;Ljava/util/Random;Lmew;)Z
      // 0e4: pop
      // 0e5: iinc 5 1
      // 0e8: iload 4
      // 0ea: ifne 100
      // 0ed: iload 4
      // 0ef: ifeq 09c
      // 0f2: goto 0f9
      // 0f5: invokestatic gzo.a (Loov;)Loov;
      // 0f8: athrow
      // 0f9: aload 0
      // 0fa: aload 1
      // 0fb: aload 2
      // 0fc: aload 3
      // 0fd: invokespecial gyu.u0r (Lt9d;Ljava/util/Random;Lmew;)V
      // 100: return
   }

   @Override
   public void rci(t9d param1, Random param2, lno param3, int param4, int param5, double param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 8
      // 05: aload 0
      // 06: getfield gzo.fob I
      // 09: iload 8
      // 0b: ifeq 55
      // 0e: bipush 1
      // 0f: if_icmpeq 34
      // 12: goto 19
      // 15: invokestatic gzo.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: iload 8
      // 1c: ifeq b2
      // 1f: goto 26
      // 22: invokestatic gzo.a (Loov;)Loov;
      // 25: athrow
      // 26: getfield gzo.fob I
      // 29: bipush 2
      // 2a: if_icmpne b1
      // 2d: goto 34
      // 30: invokestatic gzo.a (Loov;)Loov;
      // 33: athrow
      // 34: aload 0
      // 35: getstatic ox_.l11 Lx82;
      // 38: invokevirtual x82.l4i ()Lzfz;
      // 3b: putfield gzo.ke4 Lzfz;
      // 3e: aload 0
      // 3f: getstatic ox_.kqk Le0x;
      // 42: invokevirtual e0x.l4i ()Lzfz;
      // 45: putfield gzo.kro Lzfz;
      // 48: dload 6
      // 4a: ldc2_w 1.75
      // 4d: dcmpl
      // 4e: goto 55
      // 51: invokestatic gzo.a (Loov;)Loov;
      // 54: athrow
      // 55: iload 8
      // 57: ifeq 92
      // 5a: ifle 85
      // 5d: goto 64
      // 60: invokestatic gzo.a (Loov;)Loov;
      // 63: athrow
      // 64: aload 0
      // 65: getstatic ox_.kqk Le0x;
      // 68: invokevirtual e0x.l4i ()Lzfz;
      // 6b: getstatic bx0.nln Lzb_;
      // 6e: getstatic bx0$b_z.ryg Lbx0$b_z;
      // 71: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 76: putfield gzo.ke4 Lzfz;
      // 79: iload 8
      // 7b: ifne b1
      // 7e: goto 85
      // 81: invokestatic gzo.a (Loov;)Loov;
      // 84: athrow
      // 85: dload 6
      // 87: ldc2_w -0.95
      // 8a: dcmpl
      // 8b: goto 92
      // 8e: invokestatic gzo.a (Loov;)Loov;
      // 91: athrow
      // 92: ifle b1
      // 95: aload 0
      // 96: getstatic ox_.kqk Le0x;
      // 99: invokevirtual e0x.l4i ()Lzfz;
      // 9c: getstatic bx0.nln Lzb_;
      // 9f: getstatic bx0$b_z.sos Lbx0$b_z;
      // a2: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // a7: putfield gzo.ke4 Lzfz;
      // aa: goto b1
      // ad: invokestatic gzo.a (Loov;)Loov;
      // b0: athrow
      // b1: aload 0
      // b2: aload 1
      // b3: aload 2
      // b4: aload 3
      // b5: iload 4
      // b7: iload 5
      // b9: dload 6
      // bb: invokevirtual gzo.mj9 (Lt9d;Ljava/util/Random;Llno;IID)V
      // be: return
   }

   @Override
   public gyu hiq(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic gzo.a J
      // 03: ldc2_w 132071353169639
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.b ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: iload 4
      // 10: ifeq 66
      // 13: getfield gzo.mu9 I
      // 16: getstatic gyu.rdu Lgyu;
      // 19: getfield gyu.mu9 I
      // 1c: if_icmpne 65
      // 1f: goto 26
      // 22: invokestatic gzo.a (Loov;)Loov;
      // 25: athrow
      // 26: new gzo
      // 29: dup
      // 2a: iload 1
      // 2b: bipush 2
      // 2c: invokespecial gzo.<init> (II)V
      // 2f: ldc 5858897
      // 31: nop
      // 32: bipush 1
      // 33: invokevirtual gzo.cq8 (IZ)Lgyu;
      // 36: getstatic gzo.f Ljava/lang/String;
      // 39: nop
      // 3a: invokevirtual gyu.cb4 (Ljava/lang/String;)Lgyu;
      // 3d: ldc 5159473
      // 3f: nop
      // 40: invokevirtual gyu.v_x (I)Lgyu;
      // 43: ldc 0.25
      // 45: nop
      // 46: ldc 0.8
      // 48: nop
      // 49: invokevirtual gyu.j10 (FF)Lgyu;
      // 4c: new gyu$ekk
      // 4f: dup
      // 50: aload 0
      // 51: getfield gzo.f6x F
      // 54: aload 0
      // 55: getfield gzo.yeh F
      // 58: invokespecial gyu$ekk.<init> (FF)V
      // 5b: invokevirtual gyu.wzy (Lgyu$ekk;)Lgyu;
      // 5e: goto 6a
      // 61: invokestatic gzo.a (Loov;)Loov;
      // 64: athrow
      // 65: aload 0
      // 66: iload 1
      // 67: invokespecial gyu.hiq (I)Lgyu;
      // 6a: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(2957807575487693708L, 4348493595839259345L, MethodHandles.lookup().lookupClass()).a(248838213040371L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 9879596491214L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("B\u0089ç`\u0012\u008eêµâ\rìó\r\u0001¢ÿ\u0000\u0082Gp*ì#&".getBytes("ISO-8859-1"));
      String var6 = b(var4).intern();
      byte var10001 = -1;
      f = var6;
      uv0 = new jun();
      ell = new lkp(false);
      icp = new _q4(false, false);
      vc8 = new _q4(false, true);
      bql = new m03(ox_.jwk, 0);
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
