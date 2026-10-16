import java.lang.invoke.MethodHandles;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class cuj extends gyu {
   private cdu ieo = new m1q(ox_._q8.l4i().zvi(x4j.lke, x4j$y3_.i43), 9);
   private lkp nej = new lkp(false);
   private int at4 = 0;
   private int q0s = 1;
   private int qfg = 2;
   private int m6l = this.at4;
   private static final long a;
   private static final String f;

   public cuj(int var1, boolean var2) {
      super(var1);
      if (var2) {
         this.dmv.c10 = 3;
         this.m6l = this.q0s;
      }
   }

   @Override
   public e9q jk9(Random var1) {
      try {
         if (var1.nextInt(3) > 0) {
            return this.nej;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return super.jk9(var1);
   }

   @Override
   public void u0r(OpaquePredicate param1, Random param2, mew param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: aload 2
      // 03: aload 3
      // 04: invokespecial gyu.u0r (Lt9d;Ljava/util/Random;Lmew;)V
      // 07: bipush 3
      // 08: aload 2
      // 09: bipush 6
      // 0b: invokevirtual java/util/Random.nextInt (I)I
      // 0e: iadd
      // 0f: istore 5
      // 11: invokestatic OpaquePredicate.b ()I
      // 14: bipush 0
      // 15: istore 6
      // 17: istore 4
      // 19: iload 6
      // 1b: iload 5
      // 1d: if_icmpge 8c
      // 20: aload 2
      // 21: bipush 16
      // 23: invokevirtual java/util/Random.nextInt (I)I
      // 26: istore 7
      // 28: aload 2
      // 29: bipush 28
      // 2b: invokevirtual java/util/Random.nextInt (I)I
      // 2e: bipush 4
      // 2f: iadd
      // 30: istore 8
      // 32: aload 2
      // 33: bipush 16
      // 35: invokevirtual java/util/Random.nextInt (I)I
      // 38: istore 9
      // 3a: aload 3
      // 3b: iload 7
      // 3d: iload 8
      // 3f: iload 9
      // 41: invokevirtual mew.ec4 (III)Lmew;
      // 44: astore 10
      // 46: iload 4
      // 48: ifeq 8f
      // 4b: iload 4
      // 4d: ifeq 87
      // 50: goto 57
      // 53: invokestatic cuj.a (Loov;)Loov;
      // 56: athrow
      // 57: aload 1
      // 58: aload 10
      // 5a: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 5d: invokeinterface zfz.r_y ()Le0x; 1
      // 62: getstatic ox_.pu8 Le0x;
      // 65: if_acmpne 84
      // 68: goto 6f
      // 6b: invokestatic cuj.a (Loov;)Loov;
      // 6e: athrow
      // 6f: aload 1
      // 70: aload 10
      // 72: getstatic ox_.aiy Le0x;
      // 75: invokevirtual e0x.l4i ()Lzfz;
      // 78: bipush 2
      // 79: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 7c: pop
      // 7d: goto 84
      // 80: invokestatic cuj.a (Loov;)Loov;
      // 83: athrow
      // 84: iinc 6 1
      // 87: iload 4
      // 89: ifne 19
      // 8c: bipush 0
      // 8d: istore 5
      // 8f: iload 5
      // 91: bipush 7
      // 93: if_icmpge ca
      // 96: aload 2
      // 97: bipush 16
      // 99: invokevirtual java/util/Random.nextInt (I)I
      // 9c: istore 6
      // 9e: aload 2
      // 9f: bipush 64
      // a1: invokevirtual java/util/Random.nextInt (I)I
      // a4: istore 7
      // a6: aload 2
      // a7: bipush 16
      // a9: invokevirtual java/util/Random.nextInt (I)I
      // ac: istore 8
      // ae: aload 0
      // af: getfield cuj.ieo Lcdu;
      // b2: aload 1
      // b3: aload 2
      // b4: aload 3
      // b5: iload 6
      // b7: iload 7
      // b9: iload 8
      // bb: invokevirtual mew.ec4 (III)Lmew;
      // be: invokevirtual cdu.v3g (Lt9d;Ljava/util/Random;Lmew;)Z
      // c1: pop
      // c2: iinc 5 1
      // c5: iload 4
      // c7: ifne 8f
      // ca: return
   }

   @Override
   public void rci(OpaquePredicate param1, Random param2, lno param3, int param4, int param5, double param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getstatic ox_.l11 Lx82;
      // 04: invokevirtual x82.l4i ()Lzfz;
      // 07: putfield cuj.ke4 Lzfz;
      // 0a: invokestatic OpaquePredicate.b ()I
      // 0d: aload 0
      // 0e: getstatic ox_.kqk Le0x;
      // 11: invokevirtual e0x.l4i ()Lzfz;
      // 14: putfield cuj.kro Lzfz;
      // 17: istore 8
      // 19: dload 6
      // 1b: ldc2_w -1.0
      // 1e: dcmpg
      // 1f: iload 8
      // 21: ifeq 55
      // 24: iflt 4a
      // 27: goto 2e
      // 2a: invokestatic cuj.a (Loov;)Loov;
      // 2d: athrow
      // 2e: dload 6
      // 30: ldc2_w 2.0
      // 33: dcmpl
      // 34: iload 8
      // 36: ifeq 93
      // 39: goto 40
      // 3c: invokestatic cuj.a (Loov;)Loov;
      // 3f: athrow
      // 40: ifle 88
      // 43: goto 4a
      // 46: invokestatic cuj.a (Loov;)Loov;
      // 49: athrow
      // 4a: aload 0
      // 4b: getfield cuj.m6l I
      // 4e: goto 55
      // 51: invokestatic cuj.a (Loov;)Loov;
      // 54: athrow
      // 55: iload 8
      // 57: ifeq 93
      // 5a: aload 0
      // 5b: getfield cuj.qfg I
      // 5e: if_icmpne 88
      // 61: goto 68
      // 64: invokestatic cuj.a (Loov;)Loov;
      // 67: athrow
      // 68: aload 0
      // 69: getstatic ox_.bqn Le0x;
      // 6c: invokevirtual e0x.l4i ()Lzfz;
      // 6f: putfield cuj.ke4 Lzfz;
      // 72: aload 0
      // 73: getstatic ox_.bqn Le0x;
      // 76: invokevirtual e0x.l4i ()Lzfz;
      // 79: putfield cuj.kro Lzfz;
      // 7c: iload 8
      // 7e: ifne db
      // 81: goto 88
      // 84: invokestatic cuj.a (Loov;)Loov;
      // 87: athrow
      // 88: dload 6
      // 8a: dconst_1
      // 8b: dcmpl
      // 8c: goto 93
      // 8f: invokestatic cuj.a (Loov;)Loov;
      // 92: athrow
      // 93: iload 8
      // 95: ifeq b9
      // 98: ifle db
      // 9b: goto a2
      // 9e: invokestatic cuj.a (Loov;)Loov;
      // a1: athrow
      // a2: aload 0
      // a3: iload 8
      // a5: ifeq dc
      // a8: goto af
      // ab: invokestatic cuj.a (Loov;)Loov;
      // ae: athrow
      // af: getfield cuj.m6l I
      // b2: goto b9
      // b5: invokestatic cuj.a (Loov;)Loov;
      // b8: athrow
      // b9: aload 0
      // ba: getfield cuj.q0s I
      // bd: if_icmpeq db
      // c0: aload 0
      // c1: getstatic ox_.pu8 Le0x;
      // c4: invokevirtual e0x.l4i ()Lzfz;
      // c7: putfield cuj.ke4 Lzfz;
      // ca: aload 0
      // cb: getstatic ox_.pu8 Le0x;
      // ce: invokevirtual e0x.l4i ()Lzfz;
      // d1: putfield cuj.kro Lzfz;
      // d4: goto db
      // d7: invokestatic cuj.a (Loov;)Loov;
      // da: athrow
      // db: aload 0
      // dc: aload 1
      // dd: aload 2
      // de: aload 3
      // df: iload 4
      // e1: iload 5
      // e3: dload 6
      // e5: invokevirtual cuj.mj9 (Lt9d;Ljava/util/Random;Llno;IID)V
      // e8: return
   }

   private cuj csi(gyu var1) {
      long var2 = a ^ 32909241424981L;
      this.m6l = this.qfg;
      this.cq8(var1.np2, true);
      this.cb4(var1.jcq + f);
      this.wzy(new gyu$ekk(var1.f6x, var1.yeh));
      this.j10(var1.rm7, var1.plx);
      return this;
   }

   @Override
   public gyu hiq(int var1) {
      return new cuj(var1, false).csi(this);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-4152919345722601430L, -2178286152605778131L, MethodHandles.lookup().lookupClass()).a(165170057543597L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 2357775720159L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("ØDFi»%¥ü".getBytes("ISO-8859-1"));
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
