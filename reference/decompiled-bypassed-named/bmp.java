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

public class bmp extends u7m {
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public bmp() {
      this.oml(true);
      this.qfy(uja.kdm);
   }

   @Override
   public String ily(erg var1) {
      long var2 = a ^ 45654069905340L;
      String var5 = ("" + orr.zgh(this.ayn() + b<"f">(2889, 1928412860645236088L ^ var2))).trim();
      int var10000 = OpaquePredicate.b();
      String var6 = y65.jue(var1.j6_());
      int var4 = var10000;

      try {
         if (var4 == 0) {
            return var6;
         }

         if (var6 == null) {
            return var5;
         }
      } catch (oov var7) {
         throw a(var7);
      }

      return var5 + " " + orr.zgh(b<"f">(6872, 888488026040945896L ^ var2) + var6 + b<"f">(15052, 8376672870258896126L ^ var2));
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
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: getstatic y65._n6 Ljava/util/Map;
      // 07: aload 1
      // 08: invokevirtual erg.j6_ ()I
      // 0b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0e: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 13: checkcast y65$p2a
      // 16: astore 4
      // 18: aload 4
      // 1a: ifnull 47
      // 1d: iload 2
      // 1e: iload 3
      // 1f: ifne 44
      // 22: goto 29
      // 25: invokestatic bmp.a (Loov;)Loov;
      // 28: athrow
      // 29: ifne 3f
      // 2c: goto 33
      // 2f: invokestatic bmp.a (Loov;)Loov;
      // 32: athrow
      // 33: aload 4
      // 35: getfield y65$p2a.ty_ I
      // 38: goto 4a
      // 3b: invokestatic bmp.a (Loov;)Loov;
      // 3e: athrow
      // 3f: aload 4
      // 41: getfield y65$p2a.a35 I
      // 44: goto 4a
      // 47: ldc 16777215
      // 49: nop
      // 4a: ireturn
   }

   @Override
   public boolean ghw(erg param1, ha9 param2, OpaquePredicate param3, mew param4, vt2 param5, float param6, float param7, float param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 9
      // 005: aload 3
      // 006: getfield OpaquePredicate.v0f Z
      // 009: iload 9
      // 00b: ifne 02c
      // 00e: ifeq 01e
      // 011: goto 018
      // 014: invokestatic bmp.a (Loov;)Loov;
      // 017: athrow
      // 018: bipush 1
      // 019: ireturn
      // 01a: invokestatic bmp.a (Loov;)Loov;
      // 01d: athrow
      // 01e: aload 2
      // 01f: aload 4
      // 021: aload 5
      // 023: invokevirtual mew.offset (Lvt2;)Lmew;
      // 026: aload 5
      // 028: aload 1
      // 029: invokevirtual ha9.dzh (Lmew;Lvt2;Lerg;)Z
      // 02c: iload 9
      // 02e: ifne 03c
      // 031: ifne 03d
      // 034: goto 03b
      // 037: invokestatic bmp.a (Loov;)Loov;
      // 03a: athrow
      // 03b: bipush 0
      // 03c: ireturn
      // 03d: aload 3
      // 03e: aload 4
      // 040: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 043: astore 10
      // 045: iload 9
      // 047: ifne 0cd
      // 04a: aload 10
      // 04c: invokeinterface zfz.r_y ()Le0x; 1
      // 051: getstatic ox_.jvm Le0x;
      // 054: if_acmpne 0c4
      // 057: goto 05e
      // 05a: invokestatic bmp.a (Loov;)Loov;
      // 05d: athrow
      // 05e: aload 3
      // 05f: aload 4
      // 061: invokevirtual OpaquePredicate.getTileEntity (Lmew;)Lpyk;
      // 064: astore 11
      // 066: iload 9
      // 068: ifne 0cd
      // 06b: aload 11
      // 06d: instanceof net/minecraft/tileentity/TileEntityMobSpawner
      // 070: ifeq 0c4
      // 073: goto 07a
      // 076: invokestatic bmp.a (Loov;)Loov;
      // 079: athrow
      // 07a: aload 11
      // 07c: checkcast net/minecraft/tileentity/TileEntityMobSpawner
      // 07f: invokevirtual net/minecraft/tileentity/TileEntityMobSpawner.ebe ()Laih;
      // 082: astore 12
      // 084: aload 12
      // 086: aload 1
      // 087: invokevirtual erg.j6_ ()I
      // 08a: invokestatic y65.jue (I)Ljava/lang/String;
      // 08d: invokevirtual aih.ugq (Ljava/lang/String;)V
      // 090: aload 11
      // 092: invokevirtual pyk.r5t ()V
      // 095: aload 3
      // 096: aload 4
      // 098: invokevirtual OpaquePredicate.nfo (Lmew;)V
      // 09b: aload 2
      // 09c: getfield ha9.lls Lpj2;
      // 09f: getfield pj2.g40 Z
      // 0a2: iload 9
      // 0a4: ifne 0c3
      // 0a7: ifne 0c2
      // 0aa: goto 0b1
      // 0ad: invokestatic bmp.a (Loov;)Loov;
      // 0b0: athrow
      // 0b1: aload 1
      // 0b2: dup
      // 0b3: getfield erg.qd2 I
      // 0b6: bipush 1
      // 0b7: isub
      // 0b8: putfield erg.qd2 I
      // 0bb: goto 0c2
      // 0be: invokestatic bmp.a (Loov;)Loov;
      // 0c1: athrow
      // 0c2: bipush 1
      // 0c3: ireturn
      // 0c4: aload 4
      // 0c6: aload 5
      // 0c8: invokevirtual mew.offset (Lvt2;)Lmew;
      // 0cb: astore 4
      // 0cd: dconst_0
      // 0ce: dstore 11
      // 0d0: aload 5
      // 0d2: getstatic vt2.rf3 Lvt2;
      // 0d5: if_acmpne 0ec
      // 0d8: aload 10
      // 0da: instanceof dqt
      // 0dd: ifeq 0ec
      // 0e0: goto 0e7
      // 0e3: invokestatic bmp.a (Loov;)Loov;
      // 0e6: athrow
      // 0e7: ldc2_w 0.5
      // 0ea: dstore 11
      // 0ec: aload 3
      // 0ed: aload 1
      // 0ee: invokevirtual erg.j6_ ()I
      // 0f1: aload 4
      // 0f3: invokevirtual mew.getX ()I
      // 0f6: i2d
      // 0f7: ldc2_w 0.5
      // 0fa: dadd
      // 0fb: aload 4
      // 0fd: invokevirtual mew.getY ()I
      // 100: i2d
      // 101: dload 11
      // 103: dadd
      // 104: aload 4
      // 106: invokevirtual mew.getZ ()I
      // 109: i2d
      // 10a: ldc2_w 0.5
      // 10d: dadd
      // 10e: invokestatic bmp.ga6 (Lt9d;IDDD)Li2h;
      // 111: astore 13
      // 113: aload 13
      // 115: iload 9
      // 117: ifne 126
      // 11a: ifnull 189
      // 11d: goto 124
      // 120: invokestatic bmp.a (Loov;)Loov;
      // 123: athrow
      // 124: aload 13
      // 126: instanceof Entity
      // 129: iload 9
      // 12b: ifne 169
      // 12e: ifeq 162
      // 131: goto 138
      // 134: invokestatic bmp.a (Loov;)Loov;
      // 137: athrow
      // 138: aload 1
      // 139: invokevirtual erg.x4w ()Z
      // 13c: iload 9
      // 13e: ifne 169
      // 141: goto 148
      // 144: invokestatic bmp.a (Loov;)Loov;
      // 147: athrow
      // 148: ifeq 162
      // 14b: goto 152
      // 14e: invokestatic bmp.a (Loov;)Loov;
      // 151: athrow
      // 152: aload 13
      // 154: aload 1
      // 155: invokevirtual erg.zow ()Ljava/lang/String;
      // 158: invokevirtual EntityLivingBase.x84 (Ljava/lang/String;)V
      // 15b: goto 162
      // 15e: invokestatic bmp.a (Loov;)Loov;
      // 161: athrow
      // 162: aload 2
      // 163: getfield ha9.lls Lpj2;
      // 166: getfield pj2.g40 Z
      // 169: iload 9
      // 16b: ifne 18a
      // 16e: ifne 189
      // 171: goto 178
      // 174: invokestatic bmp.a (Loov;)Loov;
      // 177: athrow
      // 178: aload 1
      // 179: dup
      // 17a: getfield erg.qd2 I
      // 17d: bipush 1
      // 17e: isub
      // 17f: putfield erg.qd2 I
      // 182: goto 189
      // 185: invokestatic bmp.a (Loov;)Loov;
      // 188: athrow
      // 189: bipush 1
      // 18a: ireturn
   }

   @Override
   public erg r__(erg param1, OpaquePredicate param2, ha9 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 4
      // 005: aload 2
      // 006: getfield OpaquePredicate.v0f Z
      // 009: ifeq 012
      // 00c: aload 1
      // 00d: areturn
      // 00e: invokestatic bmp.a (Loov;)Loov;
      // 011: athrow
      // 012: aload 0
      // 013: aload 2
      // 014: aload 3
      // 015: bipush 1
      // 016: invokevirtual bmp.tbt (Lt9d;Lha9;Z)Lakm;
      // 019: astore 5
      // 01b: aload 5
      // 01d: iload 4
      // 01f: ifne 034
      // 022: ifnonnull 032
      // 025: goto 02c
      // 028: invokestatic bmp.a (Loov;)Loov;
      // 02b: athrow
      // 02c: aload 1
      // 02d: areturn
      // 02e: invokestatic bmp.a (Loov;)Loov;
      // 031: athrow
      // 032: aload 5
      // 034: iload 4
      // 036: ifne 052
      // 039: getfield akm.oyz Lakm$qs6;
      // 03c: getstatic akm$qs6.i4l Lakm$qs6;
      // 03f: if_acmpne 15e
      // 042: goto 049
      // 045: invokestatic bmp.a (Loov;)Loov;
      // 048: athrow
      // 049: aload 5
      // 04b: goto 052
      // 04e: invokestatic bmp.a (Loov;)Loov;
      // 051: athrow
      // 052: invokevirtual akm._uf ()Lmew;
      // 055: astore 6
      // 057: aload 2
      // 058: aload 3
      // 059: aload 6
      // 05b: invokevirtual OpaquePredicate.q2p (Lha9;Lmew;)Z
      // 05e: iload 4
      // 060: ifne 07f
      // 063: ifne 073
      // 066: goto 06d
      // 069: invokestatic bmp.a (Loov;)Loov;
      // 06c: athrow
      // 06d: aload 1
      // 06e: areturn
      // 06f: invokestatic bmp.a (Loov;)Loov;
      // 072: athrow
      // 073: aload 3
      // 074: aload 6
      // 076: aload 5
      // 078: getfield akm.m_f Lvt2;
      // 07b: aload 1
      // 07c: invokevirtual ha9.dzh (Lmew;Lvt2;Lerg;)Z
      // 07f: iload 4
      // 081: ifne 0ae
      // 084: ifne 094
      // 087: goto 08e
      // 08a: invokestatic bmp.a (Loov;)Loov;
      // 08d: athrow
      // 08e: aload 1
      // 08f: areturn
      // 090: invokestatic bmp.a (Loov;)Loov;
      // 093: athrow
      // 094: aload 2
      // 095: iload 4
      // 097: ifne 0b2
      // 09a: aload 6
      // 09c: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 09f: invokeinterface zfz.r_y ()Le0x; 1
      // 0a4: instanceof hmv
      // 0a7: goto 0ae
      // 0aa: invokestatic bmp.a (Loov;)Loov;
      // 0ad: athrow
      // 0ae: ifeq 15e
      // 0b1: aload 2
      // 0b2: aload 1
      // 0b3: invokevirtual erg.j6_ ()I
      // 0b6: aload 6
      // 0b8: invokevirtual mew.getX ()I
      // 0bb: i2d
      // 0bc: ldc2_w 0.5
      // 0bf: dadd
      // 0c0: aload 6
      // 0c2: invokevirtual mew.getY ()I
      // 0c5: i2d
      // 0c6: ldc2_w 0.5
      // 0c9: dadd
      // 0ca: aload 6
      // 0cc: invokevirtual mew.getZ ()I
      // 0cf: i2d
      // 0d0: ldc2_w 0.5
      // 0d3: dadd
      // 0d4: invokestatic bmp.ga6 (Lt9d;IDDD)Li2h;
      // 0d7: astore 7
      // 0d9: aload 7
      // 0db: iload 4
      // 0dd: ifne 0ec
      // 0e0: ifnull 15e
      // 0e3: goto 0ea
      // 0e6: invokestatic bmp.a (Loov;)Loov;
      // 0e9: athrow
      // 0ea: aload 7
      // 0ec: instanceof Entity
      // 0ef: iload 4
      // 0f1: ifne 13e
      // 0f4: ifeq 12b
      // 0f7: goto 0fe
      // 0fa: invokestatic bmp.a (Loov;)Loov;
      // 0fd: athrow
      // 0fe: aload 1
      // 0ff: invokevirtual erg.x4w ()Z
      // 102: iload 4
      // 104: ifne 13e
      // 107: goto 10e
      // 10a: invokestatic bmp.a (Loov;)Loov;
      // 10d: athrow
      // 10e: ifeq 12b
      // 111: goto 118
      // 114: invokestatic bmp.a (Loov;)Loov;
      // 117: athrow
      // 118: aload 7
      // 11a: checkcast yqv
      // 11d: aload 1
      // 11e: invokevirtual erg.zow ()Ljava/lang/String;
      // 121: invokevirtual yqv.x84 (Ljava/lang/String;)V
      // 124: goto 12b
      // 127: invokestatic bmp.a (Loov;)Loov;
      // 12a: athrow
      // 12b: aload 3
      // 12c: iload 4
      // 12e: ifne 153
      // 131: getfield ha9.lls Lpj2;
      // 134: getfield pj2.g40 Z
      // 137: goto 13e
      // 13a: invokestatic bmp.a (Loov;)Loov;
      // 13d: athrow
      // 13e: ifne 152
      // 141: aload 1
      // 142: dup
      // 143: getfield erg.qd2 I
      // 146: bipush 1
      // 147: isub
      // 148: putfield erg.qd2 I
      // 14b: goto 152
      // 14e: invokestatic bmp.a (Loov;)Loov;
      // 151: athrow
      // 152: aload 3
      // 153: getstatic l9p.foo [L_ss;
      // 156: aload 0
      // 157: invokestatic u7m._lo (Lu7m;)I
      // 15a: aaload
      // 15b: invokevirtual ha9.aex (L_ss;)V
      // 15e: aload 1
      // 15f: areturn
   }

   public static EntityLivingBase ga6(OpaquePredicate param0, int param1, double param2, double param4, double param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 8
      // 05: getstatic y65._n6 Ljava/util/Map;
      // 08: iload 1
      // 09: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0c: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 11: ifne 1a
      // 14: aconst_null
      // 15: areturn
      // 16: invokestatic bmp.a (Loov;)Loov;
      // 19: athrow
      // 1a: aconst_null
      // 1b: astore 9
      // 1d: bipush 0
      // 1e: istore 10
      // 20: iload 10
      // 22: bipush 1
      // 23: if_icmpge ac
      // 26: iload 1
      // 27: aload 0
      // 28: invokestatic y65.sh5 (ILt9d;)Li2h;
      // 2b: astore 9
      // 2d: iload 8
      // 2f: ifeq a7
      // 32: aload 9
      // 34: iload 8
      // 36: ifeq ae
      // 39: goto 40
      // 3c: invokestatic bmp.a (Loov;)Loov;
      // 3f: athrow
      // 40: instanceof Entity
      // 43: ifeq a4
      // 46: goto 4d
      // 49: invokestatic bmp.a (Loov;)Loov;
      // 4c: athrow
      // 4d: aload 9
      // 4f: checkcast yqv
      // 52: astore 11
      // 54: aload 9
      // 56: dload 2
      // 57: dload 4
      // 59: dload 6
      // 5b: aload 0
      // 5c: getfield OpaquePredicate.fsy Ljava/util/Random;
      // 5f: invokevirtual java/util/Random.nextFloat ()F
      // 62: ldc 360.0
      // 64: nop
      // 65: fmul
      // 66: invokestatic fe6.qsy (F)F
      // 69: fconst_0
      // 6a: invokevirtual EntityLivingBase.x24 (DDDFF)V
      // 6d: aload 11
      // 6f: aload 11
      // 71: getfield yqv.x5k F
      // 74: putfield yqv.q6c F
      // 77: aload 11
      // 79: aload 11
      // 7b: getfield yqv.x5k F
      // 7e: putfield yqv.ksw F
      // 81: aload 11
      // 83: aload 0
      // 84: new mew
      // 87: dup
      // 88: aload 11
      // 8a: invokespecial mew.<init> (Li2h;)V
      // 8d: invokevirtual OpaquePredicate.sms (Lmew;)Lcss;
      // 90: aconst_null
      // 91: checkcast ps6
      // 94: invokevirtual yqv.hx8 (Lcss;Lps6;)Lps6;
      // 97: pop
      // 98: aload 0
      // 99: aload 9
      // 9b: invokevirtual OpaquePredicate.xzq (Li2h;)Z
      // 9e: pop
      // 9f: aload 11
      // a1: invokevirtual yqv.zi7 ()V
      // a4: iinc 10 1
      // a7: iload 8
      // a9: ifne 20
      // ac: aload 9
      // ae: areturn
   }

   @Override
   public void jlj(u7m var1, uja var2, List var3) {
      int var4 = OpaquePredicate.b();

      for (y65$p2a var6 : y65._n6.values()) {
         var3.add(new erg(var1, 1, var6.hgl));
         if (var4 == 0) {
            break;
         }
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6070412072211667771L, 8377901222597408177L, MethodHandles.lookup().lookupClass()).a(110992568435660L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 9190787165993L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[3];
      int var7 = 0;
      String var6 = "\u0013âdÚÁ8A\u0011À\u009a¨3WÑñv\u0010gu×«C>\u0099-üd\u0097\u000e`±»\u0093\u0010\u0095N\u0091ñF\u0004X\u0080\u008e\u001dN!ZK>ý";
      int var8 = "\u0013âdÚÁ8A\u0011À\u009a¨3WÑñv\u0010gu×«C>\u0099-üd\u0097\u000e`±»\u0093\u0010\u0095N\u0091ñF\u0004X\u0080\u008e\u001dN!ZK>ý".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = b(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            g = new String[3];
            return;
         }

         var5 = var6.charAt(var4);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 19377;
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
            throw new RuntimeException("bmp", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
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
         throw new RuntimeException("bmp" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
