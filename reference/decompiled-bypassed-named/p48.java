import java.lang.invoke.MethodHandles;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class p48 extends e0x {
   public static final h76 o3j;

   public p48() {
      super(p3y.ftb, _mi.bzo);
      this.y8l(this._8_.c32().zvi(o3j, false));
      this._p_(true);
      this.i3l(uja.mqu);
   }

   @Override
   public zfz w1b(zfz param1, m5n param2, mew param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 4
      // 05: aload 2
      // 06: aload 3
      // 07: invokevirtual mew.nuv ()Lmew;
      // 0a: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 0f: invokeinterface zfz.r_y ()Le0x; 1
      // 14: astore 5
      // 16: aload 1
      // 17: getstatic p48.o3j Lh76;
      // 1a: aload 5
      // 1c: getstatic ox_._mc Le0x;
      // 1f: iload 4
      // 21: ifeq 3a
      // 24: if_acmpeq 3d
      // 27: goto 2e
      // 2a: invokestatic p48.a (Loov;)Loov;
      // 2d: athrow
      // 2e: aload 5
      // 30: getstatic ox_.dxo Le0x;
      // 33: goto 3a
      // 36: invokestatic p48.a (Loov;)Loov;
      // 39: athrow
      // 3a: if_acmpne 45
      // 3d: bipush 1
      // 3e: goto 46
      // 41: invokestatic p48.a (Loov;)Loov;
      // 44: athrow
      // 45: bipush 0
      // 46: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 49: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 4e: areturn
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
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 5
      // 005: aload 1
      // 006: getfield OpaquePredicate.v0f Z
      // 009: iload 5
      // 00b: ifne 027
      // 00e: ifne 166
      // 011: goto 018
      // 014: invokestatic p48.a (Loov;)Loov;
      // 017: athrow
      // 018: aload 1
      // 019: aload 2
      // 01a: invokevirtual mew.nuv ()Lmew;
      // 01d: invokevirtual OpaquePredicate.rts (Lmew;)I
      // 020: goto 027
      // 023: invokestatic p48.a (Loov;)Loov;
      // 026: athrow
      // 027: bipush 4
      // 028: iload 5
      // 02a: ifne 09e
      // 02d: if_icmpge 081
      // 030: goto 037
      // 033: invokestatic p48.a (Loov;)Loov;
      // 036: athrow
      // 037: aload 1
      // 038: aload 2
      // 039: invokevirtual mew.nuv ()Lmew;
      // 03c: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 03f: invokeinterface zfz.r_y ()Le0x; 1
      // 044: invokevirtual e0x.uhw ()I
      // 047: bipush 2
      // 048: iload 5
      // 04a: ifne 09e
      // 04d: goto 054
      // 050: invokestatic p48.a (Loov;)Loov;
      // 053: athrow
      // 054: if_icmple 081
      // 057: goto 05e
      // 05a: invokestatic p48.a (Loov;)Loov;
      // 05d: athrow
      // 05e: aload 1
      // 05f: aload 2
      // 060: getstatic ox_.kqk Le0x;
      // 063: invokevirtual e0x.l4i ()Lzfz;
      // 066: getstatic bx0.nln Lzb_;
      // 069: getstatic bx0$b_z.rg3 Lbx0$b_z;
      // 06c: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 071: invokevirtual OpaquePredicate.gfy (Lmew;Lzfz;)Z
      // 074: pop
      // 075: iload 5
      // 077: ifeq 166
      // 07a: goto 081
      // 07d: invokestatic p48.a (Loov;)Loov;
      // 080: athrow
      // 081: aload 1
      // 082: aload 2
      // 083: invokevirtual mew.nuv ()Lmew;
      // 086: invokevirtual OpaquePredicate.rts (Lmew;)I
      // 089: iload 5
      // 08b: ifne 0a2
      // 08e: goto 095
      // 091: invokestatic p48.a (Loov;)Loov;
      // 094: athrow
      // 095: bipush 9
      // 097: goto 09e
      // 09a: invokestatic p48.a (Loov;)Loov;
      // 09d: athrow
      // 09e: if_icmplt 166
      // 0a1: bipush 0
      // 0a2: istore 6
      // 0a4: iload 6
      // 0a6: bipush 4
      // 0a7: if_icmpge 166
      // 0aa: aload 2
      // 0ab: aload 4
      // 0ad: bipush 3
      // 0ae: invokevirtual java/util/Random.nextInt (I)I
      // 0b1: bipush 1
      // 0b2: isub
      // 0b3: aload 4
      // 0b5: bipush 5
      // 0b6: invokevirtual java/util/Random.nextInt (I)I
      // 0b9: bipush 3
      // 0ba: isub
      // 0bb: aload 4
      // 0bd: bipush 3
      // 0be: invokevirtual java/util/Random.nextInt (I)I
      // 0c1: bipush 1
      // 0c2: isub
      // 0c3: invokevirtual mew.ec4 (III)Lmew;
      // 0c6: astore 7
      // 0c8: aload 1
      // 0c9: aload 7
      // 0cb: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 0ce: astore 8
      // 0d0: aload 1
      // 0d1: aload 7
      // 0d3: invokevirtual mew.nuv ()Lmew;
      // 0d6: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 0d9: invokeinterface zfz.r_y ()Le0x; 1
      // 0de: astore 9
      // 0e0: iload 5
      // 0e2: ifne 161
      // 0e5: aload 8
      // 0e7: invokeinterface zfz.r_y ()Le0x; 1
      // 0ec: getstatic ox_.kqk Le0x;
      // 0ef: if_acmpne 15e
      // 0f2: goto 0f9
      // 0f5: invokestatic p48.a (Loov;)Loov;
      // 0f8: athrow
      // 0f9: aload 8
      // 0fb: getstatic bx0.nln Lzb_;
      // 0fe: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 103: getstatic bx0$b_z.rg3 Lbx0$b_z;
      // 106: if_acmpne 15e
      // 109: goto 110
      // 10c: invokestatic p48.a (Loov;)Loov;
      // 10f: athrow
      // 110: aload 1
      // 111: aload 7
      // 113: invokevirtual mew.nuv ()Lmew;
      // 116: invokevirtual OpaquePredicate.rts (Lmew;)I
      // 119: bipush 4
      // 11a: iload 5
      // 11c: ifne 149
      // 11f: goto 126
      // 122: invokestatic p48.a (Loov;)Loov;
      // 125: athrow
      // 126: if_icmplt 15e
      // 129: goto 130
      // 12c: invokestatic p48.a (Loov;)Loov;
      // 12f: athrow
      // 130: aload 9
      // 132: invokevirtual e0x.uhw ()I
      // 135: iload 5
      // 137: ifne 15d
      // 13a: goto 141
      // 13d: invokestatic p48.a (Loov;)Loov;
      // 140: athrow
      // 141: bipush 2
      // 142: goto 149
      // 145: invokestatic p48.a (Loov;)Loov;
      // 148: athrow
      // 149: if_icmpgt 15e
      // 14c: aload 1
      // 14d: aload 7
      // 14f: aload 0
      // 150: invokevirtual p48.l4i ()Lzfz;
      // 153: invokevirtual OpaquePredicate.gfy (Lmew;Lzfz;)Z
      // 156: goto 15d
      // 159: invokestatic p48.a (Loov;)Loov;
      // 15c: athrow
      // 15d: pop
      // 15e: iinc 6 1
      // 161: iload 5
      // 163: ifeq 0a4
      // 166: return
   }

   @Override
   public void kyo(OpaquePredicate var1, mew var2, zfz var3, Random var4) {
      try {
         super.kyo(var1, var2, var3, var4);
         if (var4.nextInt(10) == 0) {
            var1.zvy(
               w_0.n2e,
               (double)((float)var2.getX() + var4.nextFloat()),
               (double)((float)var2.getY() + 1.1F),
               (double)((float)var2.getZ() + var4.nextFloat()),
               0.0,
               0.0,
               0.0,
               new int[0]
            );
         }
      } catch (oov var5) {
         throw a(var5);
      }
   }

   @Override
   public u7m j39(zfz var1, Random var2, int var3) {
      return ox_.kqk.j39(ox_.kqk.l4i().zvi(bx0.nln, bx0$b_z.rg3), var2, var3);
   }

   @Override
   public int hvp(zfz var1) {
      return 0;
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{o3j});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-645146438410114106L, -5659543279574261259L, MethodHandles.lookup().lookupClass()).a(118208692410776L);
      // $VF: monitorexit
      long var4 = var10000 ^ 109317290556634L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("\u0014OzJë¢3\u0016".getBytes("ISO-8859-1"));
      String var7 = b(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      o3j = h76.d_1(var0);
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
