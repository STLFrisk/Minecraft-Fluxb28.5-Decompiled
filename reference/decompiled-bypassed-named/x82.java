import java.lang.invoke.MethodHandles;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class x82 extends e0x implements jrp {
   public static final h76 os1;

   public x82() {
      super(p3y.ftb);
      this.y8l(this._8_.c32().zvi(os1, false));
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
      // 17: getstatic x82.os1 Lh76;
      // 1a: aload 5
      // 1c: getstatic ox_._mc Le0x;
      // 1f: iload 4
      // 21: ifeq 3a
      // 24: if_acmpeq 3d
      // 27: goto 2e
      // 2a: invokestatic x82.a (Loov;)Loov;
      // 2d: athrow
      // 2e: aload 5
      // 30: getstatic ox_.dxo Le0x;
      // 33: goto 3a
      // 36: invokestatic x82.a (Loov;)Loov;
      // 39: athrow
      // 3a: if_acmpne 45
      // 3d: bipush 1
      // 3e: goto 46
      // 41: invokestatic x82.a (Loov;)Loov;
      // 44: athrow
      // 45: bipush 0
      // 46: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 49: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 4e: areturn
   }

   @Override
   public int ldy() {
      return vfg.vkm(0.5, 1.0);
   }

   @Override
   public int ieb(zfz var1) {
      return this.ldy();
   }

   @Override
   public int j24(m5n var1, mew var2, int var3) {
      return s4i.mq6(var1, var2);
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
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 5
      // 005: aload 1
      // 006: getfield OpaquePredicate.v0f Z
      // 009: iload 5
      // 00b: ifeq 027
      // 00e: ifne 15d
      // 011: goto 018
      // 014: invokestatic x82.a (Loov;)Loov;
      // 017: athrow
      // 018: aload 1
      // 019: aload 2
      // 01a: invokevirtual mew.nuv ()Lmew;
      // 01d: invokevirtual OpaquePredicate.rts (Lmew;)I
      // 020: goto 027
      // 023: invokestatic x82.a (Loov;)Loov;
      // 026: athrow
      // 027: bipush 4
      // 028: iload 5
      // 02a: ifeq 093
      // 02d: if_icmpge 076
      // 030: goto 037
      // 033: invokestatic x82.a (Loov;)Loov;
      // 036: athrow
      // 037: aload 1
      // 038: aload 2
      // 039: invokevirtual mew.nuv ()Lmew;
      // 03c: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 03f: invokeinterface zfz.r_y ()Le0x; 1
      // 044: invokevirtual e0x.uhw ()I
      // 047: bipush 2
      // 048: iload 5
      // 04a: ifeq 093
      // 04d: goto 054
      // 050: invokestatic x82.a (Loov;)Loov;
      // 053: athrow
      // 054: if_icmple 076
      // 057: goto 05e
      // 05a: invokestatic x82.a (Loov;)Loov;
      // 05d: athrow
      // 05e: aload 1
      // 05f: aload 2
      // 060: getstatic ox_.kqk Le0x;
      // 063: invokevirtual e0x.l4i ()Lzfz;
      // 066: invokevirtual OpaquePredicate.gfy (Lmew;Lzfz;)Z
      // 069: pop
      // 06a: iload 5
      // 06c: ifne 15d
      // 06f: goto 076
      // 072: invokestatic x82.a (Loov;)Loov;
      // 075: athrow
      // 076: aload 1
      // 077: aload 2
      // 078: invokevirtual mew.nuv ()Lmew;
      // 07b: invokevirtual OpaquePredicate.rts (Lmew;)I
      // 07e: iload 5
      // 080: ifeq 097
      // 083: goto 08a
      // 086: invokestatic x82.a (Loov;)Loov;
      // 089: athrow
      // 08a: bipush 9
      // 08c: goto 093
      // 08f: invokestatic x82.a (Loov;)Loov;
      // 092: athrow
      // 093: if_icmplt 15d
      // 096: bipush 0
      // 097: istore 6
      // 099: iload 6
      // 09b: bipush 4
      // 09c: if_icmpge 15d
      // 09f: aload 2
      // 0a0: aload 4
      // 0a2: bipush 3
      // 0a3: invokevirtual java/util/Random.nextInt (I)I
      // 0a6: bipush 1
      // 0a7: isub
      // 0a8: aload 4
      // 0aa: bipush 5
      // 0ab: invokevirtual java/util/Random.nextInt (I)I
      // 0ae: bipush 3
      // 0af: isub
      // 0b0: aload 4
      // 0b2: bipush 3
      // 0b3: invokevirtual java/util/Random.nextInt (I)I
      // 0b6: bipush 1
      // 0b7: isub
      // 0b8: invokevirtual mew.ec4 (III)Lmew;
      // 0bb: astore 7
      // 0bd: aload 1
      // 0be: aload 7
      // 0c0: invokevirtual mew.nuv ()Lmew;
      // 0c3: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 0c6: invokeinterface zfz.r_y ()Le0x; 1
      // 0cb: astore 8
      // 0cd: aload 1
      // 0ce: aload 7
      // 0d0: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 0d3: astore 9
      // 0d5: iload 5
      // 0d7: ifeq 158
      // 0da: aload 9
      // 0dc: invokeinterface zfz.r_y ()Le0x; 1
      // 0e1: getstatic ox_.kqk Le0x;
      // 0e4: if_acmpne 155
      // 0e7: goto 0ee
      // 0ea: invokestatic x82.a (Loov;)Loov;
      // 0ed: athrow
      // 0ee: aload 9
      // 0f0: getstatic bx0.nln Lzb_;
      // 0f3: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0f8: getstatic bx0$b_z.rg3 Lbx0$b_z;
      // 0fb: if_acmpne 155
      // 0fe: goto 105
      // 101: invokestatic x82.a (Loov;)Loov;
      // 104: athrow
      // 105: aload 1
      // 106: aload 7
      // 108: invokevirtual mew.nuv ()Lmew;
      // 10b: invokevirtual OpaquePredicate.rts (Lmew;)I
      // 10e: bipush 4
      // 10f: iload 5
      // 111: ifeq 13e
      // 114: goto 11b
      // 117: invokestatic x82.a (Loov;)Loov;
      // 11a: athrow
      // 11b: if_icmplt 155
      // 11e: goto 125
      // 121: invokestatic x82.a (Loov;)Loov;
      // 124: athrow
      // 125: aload 8
      // 127: invokevirtual e0x.uhw ()I
      // 12a: iload 5
      // 12c: ifeq 154
      // 12f: goto 136
      // 132: invokestatic x82.a (Loov;)Loov;
      // 135: athrow
      // 136: bipush 2
      // 137: goto 13e
      // 13a: invokestatic x82.a (Loov;)Loov;
      // 13d: athrow
      // 13e: if_icmpgt 155
      // 141: aload 1
      // 142: aload 7
      // 144: getstatic ox_.l11 Lx82;
      // 147: invokevirtual x82.l4i ()Lzfz;
      // 14a: invokevirtual OpaquePredicate.gfy (Lmew;Lzfz;)Z
      // 14d: goto 154
      // 150: invokestatic x82.a (Loov;)Loov;
      // 153: athrow
      // 154: pop
      // 155: iinc 6 1
      // 158: iload 5
      // 15a: ifne 099
      // 15d: return
   }

   @Override
   public u7m j39(zfz var1, Random var2, int var3) {
      return ox_.kqk.j39(ox_.kqk.l4i().zvi(bx0.nln, bx0$b_z.rg3), var2, var3);
   }

   @Override
   public boolean z3t(OpaquePredicate var1, mew var2, zfz var3, boolean var4) {
      return true;
   }

   @Override
   public boolean y4n(OpaquePredicate var1, Random var2, mew var3, zfz var4) {
      return true;
   }

   @Override
   public void tu1(OpaquePredicate param1, Random param2, mew param3, zfz param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 3
      // 001: invokevirtual mew.nuv ()Lmew;
      // 004: astore 6
      // 006: invokestatic OpaquePredicate.c ()I
      // 009: bipush 0
      // 00a: istore 7
      // 00c: istore 5
      // 00e: iload 7
      // 010: sipush 128
      // 013: if_icmpge 167
      // 016: aload 6
      // 018: astore 8
      // 01a: bipush 0
      // 01b: istore 9
      // 01d: iload 9
      // 01f: iload 7
      // 021: bipush 16
      // 023: idiv
      // 024: if_icmplt 0f4
      // 027: aload 1
      // 028: aload 8
      // 02a: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 02d: invokeinterface zfz.r_y ()Le0x; 1
      // 032: iload 5
      // 034: ifne 132
      // 037: getfield e0x.kgd Lp3y;
      // 03a: getstatic p3y.cei Lp3y;
      // 03d: if_acmpne 15f
      // 040: goto 047
      // 043: invokestatic x82.a (Loov;)Loov;
      // 046: athrow
      // 047: aload 2
      // 048: bipush 8
      // 04a: invokevirtual java/util/Random.nextInt (I)I
      // 04d: ifne 0b1
      // 050: goto 057
      // 053: invokestatic x82.a (Loov;)Loov;
      // 056: athrow
      // 057: aload 1
      // 058: aload 8
      // 05a: invokevirtual OpaquePredicate.getBiomeGenForCoords (Lmew;)Lgyu;
      // 05d: aload 2
      // 05e: aload 8
      // 060: invokevirtual gyu.op2 (Ljava/util/Random;Lmew;)Lu5m$cco;
      // 063: astore 10
      // 065: aload 10
      // 067: invokevirtual u5m$cco.ged ()Lu5m$bad;
      // 06a: invokevirtual u5m$bad.thw ()Lu5m;
      // 06d: astore 11
      // 06f: aload 11
      // 071: invokevirtual u5m.l4i ()Lzfz;
      // 074: aload 11
      // 076: invokevirtual u5m.h9e ()Lxny;
      // 079: aload 10
      // 07b: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 080: astore 12
      // 082: aload 11
      // 084: aload 1
      // 085: aload 8
      // 087: aload 12
      // 089: invokevirtual u5m._h0 (Lt9d;Lmew;Lzfz;)Z
      // 08c: iload 5
      // 08e: ifne 0ab
      // 091: ifeq 0ac
      // 094: goto 09b
      // 097: invokestatic x82.a (Loov;)Loov;
      // 09a: athrow
      // 09b: aload 1
      // 09c: aload 8
      // 09e: aload 12
      // 0a0: bipush 3
      // 0a1: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 0a4: goto 0ab
      // 0a7: invokestatic x82.a (Loov;)Loov;
      // 0aa: athrow
      // 0ab: pop
      // 0ac: iload 5
      // 0ae: ifeq 15f
      // 0b1: getstatic ox_._w6 Lrh2;
      // 0b4: invokevirtual rh2.l4i ()Lzfz;
      // 0b7: getstatic rh2.twm Lzb_;
      // 0ba: getstatic rh2$j7i.jd3 Lrh2$j7i;
      // 0bd: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 0c2: astore 10
      // 0c4: getstatic ox_._w6 Lrh2;
      // 0c7: aload 1
      // 0c8: aload 8
      // 0ca: aload 10
      // 0cc: invokevirtual rh2._h0 (Lt9d;Lmew;Lzfz;)Z
      // 0cf: iload 5
      // 0d1: ifne 0ee
      // 0d4: ifeq 0ef
      // 0d7: goto 0de
      // 0da: invokestatic x82.a (Loov;)Loov;
      // 0dd: athrow
      // 0de: aload 1
      // 0df: aload 8
      // 0e1: aload 10
      // 0e3: bipush 3
      // 0e4: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 0e7: goto 0ee
      // 0ea: invokestatic x82.a (Loov;)Loov;
      // 0ed: athrow
      // 0ee: pop
      // 0ef: iload 5
      // 0f1: ifeq 15f
      // 0f4: aload 8
      // 0f6: aload 2
      // 0f7: bipush 3
      // 0f8: invokevirtual java/util/Random.nextInt (I)I
      // 0fb: bipush 1
      // 0fc: isub
      // 0fd: aload 2
      // 0fe: bipush 3
      // 0ff: invokevirtual java/util/Random.nextInt (I)I
      // 102: bipush 1
      // 103: isub
      // 104: aload 2
      // 105: bipush 3
      // 106: invokevirtual java/util/Random.nextInt (I)I
      // 109: imul
      // 10a: bipush 2
      // 10b: idiv
      // 10c: aload 2
      // 10d: bipush 3
      // 10e: invokevirtual java/util/Random.nextInt (I)I
      // 111: bipush 1
      // 112: isub
      // 113: invokevirtual mew.ec4 (III)Lmew;
      // 116: astore 8
      // 118: iload 5
      // 11a: ifne 162
      // 11d: aload 1
      // 11e: aload 8
      // 120: invokevirtual mew.eve ()Lmew;
      // 123: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 126: invokeinterface zfz.r_y ()Le0x; 1
      // 12b: goto 132
      // 12e: invokestatic x82.a (Loov;)Loov;
      // 131: athrow
      // 132: getstatic ox_.l11 Lx82;
      // 135: if_acmpne 15f
      // 138: aload 1
      // 139: aload 8
      // 13b: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 13e: invokeinterface zfz.r_y ()Le0x; 1
      // 143: invokevirtual e0x.y0n ()Z
      // 146: ifeq 157
      // 149: goto 150
      // 14c: invokestatic x82.a (Loov;)Loov;
      // 14f: athrow
      // 150: goto 15f
      // 153: invokestatic x82.a (Loov;)Loov;
      // 156: athrow
      // 157: iinc 9 1
      // 15a: iload 5
      // 15c: ifeq 01d
      // 15f: iinc 7 1
      // 162: iload 5
      // 164: ifeq 00e
      // 167: return
   }

   @Override
   public w51 w3x() {
      try {
         if (ModuleRegistry.ksa.klu()) {
            return super.w3x();
         }
      } catch (oov var1) {
         throw a(var1);
      }

      return w51.oja;
   }

   @Override
   public int hvp(zfz var1) {
      return 0;
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{os1});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8155103984732668979L, 2996239491597217299L, MethodHandles.lookup().lookupClass()).a(259159125320870L);
      // $VF: monitorexit
      long var4 = var10000 ^ 75742082974311L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("\u0093mî>¤aHX".getBytes("ISO-8859-1"));
      String var7 = b(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      os1 = h76.d_1(var0);
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
