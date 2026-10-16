import java.lang.invoke.MethodHandles;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class es2 extends hmv {
   private static final long b;
   private static final String k;

   public es2(p3y var1) {
      int var2 = OpaquePredicate.b();
      super(var1);
      this._p_(false);
      if (var2 != 0) {
         try {
            if (var1 == p3y.e1s) {
               this._p_(true);
            }
         } catch (oov var3) {
            throw a(var3);
         }
      }
   }

   @Override
   public void z3l(OpaquePredicate param1, mew param2, zfz param3, e0x param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 5
      // 05: aload 0
      // 06: aload 1
      // 07: aload 2
      // 08: aload 3
      // 09: iload 5
      // 0b: ifeq 26
      // 0e: invokevirtual es2.umq (Lt9d;Lmew;Lzfz;)Z
      // 11: ifne 29
      // 14: goto 1b
      // 17: invokestatic es2.a (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 0
      // 1c: aload 1
      // 1d: aload 2
      // 1e: aload 3
      // 1f: goto 26
      // 22: invokestatic es2.a (Loov;)Loov;
      // 25: athrow
      // 26: invokespecial es2.n37 (Lt9d;Lmew;Lzfz;)V
      // 29: return
   }

   private void n37(OpaquePredicate var1, mew var2, zfz var3) {
      _13 var4 = cvb(this.kgd);
      var1.vct(var2, var4.l4i().zvi(nfg, var3.dil(nfg)), 2);
      var1.cjk(var2, var4, this.odp(var1));
   }

   @Override
   public void zvy(OpaquePredicate param1, mew param2, zfz param3, Random param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic es2.b J
      // 003: ldc2_w 120393158652375
      // 006: lxor
      // 007: lstore 5
      // 009: invokestatic OpaquePredicate.b ()I
      // 00c: istore 7
      // 00e: aload 0
      // 00f: getfield es2.kgd Lp3y;
      // 012: getstatic p3y.e1s Lp3y;
      // 015: if_acmpne 178
      // 018: aload 1
      // 019: invokevirtual OpaquePredicate.eir ()Lef9;
      // 01c: getstatic es2.k Ljava/lang/String;
      // 01f: nop
      // 020: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 023: iload 7
      // 025: ifeq 046
      // 028: goto 02f
      // 02b: invokestatic es2.a (Loov;)Loov;
      // 02e: athrow
      // 02f: ifeq 178
      // 032: goto 039
      // 035: invokestatic es2.a (Loov;)Loov;
      // 038: athrow
      // 039: aload 4
      // 03b: bipush 3
      // 03c: invokevirtual java/util/Random.nextInt (I)I
      // 03f: goto 046
      // 042: invokestatic es2.a (Loov;)Loov;
      // 045: athrow
      // 046: istore 8
      // 048: iload 8
      // 04a: iload 7
      // 04c: ifeq 105
      // 04f: ifle 0fd
      // 052: goto 059
      // 055: invokestatic es2.a (Loov;)Loov;
      // 058: athrow
      // 059: aload 2
      // 05a: astore 9
      // 05c: bipush 0
      // 05d: istore 10
      // 05f: iload 10
      // 061: iload 8
      // 063: if_icmpge 0f8
      // 066: aload 9
      // 068: aload 4
      // 06a: bipush 3
      // 06b: invokevirtual java/util/Random.nextInt (I)I
      // 06e: bipush 1
      // 06f: isub
      // 070: bipush 1
      // 071: aload 4
      // 073: bipush 3
      // 074: invokevirtual java/util/Random.nextInt (I)I
      // 077: bipush 1
      // 078: isub
      // 079: invokevirtual mew.ec4 (III)Lmew;
      // 07c: astore 9
      // 07e: aload 1
      // 07f: aload 9
      // 081: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 084: invokeinterface zfz.r_y ()Le0x; 1
      // 089: astore 11
      // 08b: iload 7
      // 08d: ifeq 178
      // 090: aload 11
      // 092: getfield e0x.kgd Lp3y;
      // 095: iload 7
      // 097: ifeq 0e5
      // 09a: goto 0a1
      // 09d: invokestatic es2.a (Loov;)Loov;
      // 0a0: athrow
      // 0a1: getstatic p3y.cei Lp3y;
      // 0a4: if_acmpne 0e0
      // 0a7: goto 0ae
      // 0aa: invokestatic es2.a (Loov;)Loov;
      // 0ad: athrow
      // 0ae: aload 0
      // 0af: aload 1
      // 0b0: aload 9
      // 0b2: invokevirtual es2.deq (Lt9d;Lmew;)Z
      // 0b5: iload 7
      // 0b7: ifeq 0de
      // 0ba: goto 0c1
      // 0bd: invokestatic es2.a (Loov;)Loov;
      // 0c0: athrow
      // 0c1: ifeq 0f0
      // 0c4: goto 0cb
      // 0c7: invokestatic es2.a (Loov;)Loov;
      // 0ca: athrow
      // 0cb: aload 1
      // 0cc: aload 9
      // 0ce: getstatic ox_._0u Lwuo;
      // 0d1: invokevirtual wuo.l4i ()Lzfz;
      // 0d4: invokevirtual OpaquePredicate.gfy (Lmew;Lzfz;)Z
      // 0d7: goto 0de
      // 0da: invokestatic es2.a (Loov;)Loov;
      // 0dd: athrow
      // 0de: pop
      // 0df: return
      // 0e0: aload 11
      // 0e2: getfield e0x.kgd Lp3y;
      // 0e5: invokevirtual p3y.c3t ()Z
      // 0e8: ifeq 0f0
      // 0eb: return
      // 0ec: invokestatic es2.a (Loov;)Loov;
      // 0ef: athrow
      // 0f0: iinc 10 1
      // 0f3: iload 7
      // 0f5: ifne 05f
      // 0f8: iload 7
      // 0fa: ifne 178
      // 0fd: bipush 0
      // 0fe: goto 105
      // 101: invokestatic es2.a (Loov;)Loov;
      // 104: athrow
      // 105: istore 9
      // 107: iload 9
      // 109: bipush 3
      // 10a: if_icmpge 178
      // 10d: aload 2
      // 10e: aload 4
      // 110: bipush 3
      // 111: invokevirtual java/util/Random.nextInt (I)I
      // 114: bipush 1
      // 115: isub
      // 116: bipush 0
      // 117: aload 4
      // 119: bipush 3
      // 11a: invokevirtual java/util/Random.nextInt (I)I
      // 11d: bipush 1
      // 11e: isub
      // 11f: invokevirtual mew.ec4 (III)Lmew;
      // 122: astore 10
      // 124: iload 7
      // 126: ifeq 173
      // 129: aload 1
      // 12a: aload 10
      // 12c: invokevirtual mew.nuv ()Lmew;
      // 12f: invokevirtual OpaquePredicate.isAirBlock (Lmew;)Z
      // 132: ifeq 170
      // 135: goto 13c
      // 138: invokestatic es2.a (Loov;)Loov;
      // 13b: athrow
      // 13c: aload 0
      // 13d: aload 1
      // 13e: aload 10
      // 140: invokespecial es2.wea (Lt9d;Lmew;)Z
      // 143: iload 7
      // 145: ifeq 16f
      // 148: goto 14f
      // 14b: invokestatic es2.a (Loov;)Loov;
      // 14e: athrow
      // 14f: ifeq 170
      // 152: goto 159
      // 155: invokestatic es2.a (Loov;)Loov;
      // 158: athrow
      // 159: aload 1
      // 15a: aload 10
      // 15c: invokevirtual mew.nuv ()Lmew;
      // 15f: getstatic ox_._0u Lwuo;
      // 162: invokevirtual wuo.l4i ()Lzfz;
      // 165: invokevirtual OpaquePredicate.gfy (Lmew;Lzfz;)Z
      // 168: goto 16f
      // 16b: invokestatic es2.a (Loov;)Loov;
      // 16e: athrow
      // 16f: pop
      // 170: iinc 9 1
      // 173: iload 7
      // 175: ifne 107
      // 178: return
   }

   public boolean deq(OpaquePredicate param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic vt2.values ()[Lvt2;
      // 03: astore 4
      // 05: aload 4
      // 07: arraylength
      // 08: istore 5
      // 0a: invokestatic OpaquePredicate.c ()I
      // 0d: bipush 0
      // 0e: istore 6
      // 10: istore 3
      // 11: iload 6
      // 13: iload 5
      // 15: if_icmpge 50
      // 18: aload 4
      // 1a: iload 6
      // 1c: aaload
      // 1d: astore 7
      // 1f: iload 3
      // 20: ifne 4c
      // 23: aload 0
      // 24: aload 1
      // 25: aload 2
      // 26: aload 7
      // 28: invokevirtual mew.offset (Lvt2;)Lmew;
      // 2b: invokespecial es2.wea (Lt9d;Lmew;)Z
      // 2e: iload 3
      // 2f: ifne 51
      // 32: goto 39
      // 35: invokestatic es2.a (Loov;)Loov;
      // 38: athrow
      // 39: ifeq 49
      // 3c: goto 43
      // 3f: invokestatic es2.a (Loov;)Loov;
      // 42: athrow
      // 43: bipush 1
      // 44: ireturn
      // 45: invokestatic es2.a (Loov;)Loov;
      // 48: athrow
      // 49: iinc 6 1
      // 4c: iload 3
      // 4d: ifeq 11
      // 50: bipush 0
      // 51: ireturn
   }

   private boolean wea(OpaquePredicate var1, mew var2) {
      return var1.getBlockState(var2).r_y().p1r().z6u();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8867299812893571598L, 430305561248944863L, MethodHandles.lookup().lookupClass()).a(137662354223248L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 138689877831708L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("EÅüé(æ\u00adl\u008c¤/þ\u0006µ\u001f\u000b".getBytes("ISO-8859-1"));
      String var6 = c(var4).intern();
      byte var10001 = -1;
      k = var6;
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
}
