import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class mjv extends e0x {
   public static final h76 ojg;
   private static final long b;
   private static final String[] d;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public mjv() {
      super(p3y.dbk);
      this.y8l(this._8_.c32().zvi(ojg, false));
      this.i3l(uja.mqu);
   }

   @Override
   public String ieu() {
      long var1 = b ^ 14430004504683L;
      return orr.zgh(this.abc() + b<"h">(28862, 5734928980978085498L ^ var1));
   }

   @Override
   public int crg(zfz var1) {
      int var2 = OpaquePredicate.c();

      try {
         byte var10000 = (Boolean)var1.dil(ojg);
         if (var2 != 0) {
            return var10000;
         }

         if (var10000 != 0) {
            return 1;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return 0;
   }

   @Override
   public void tfc(OpaquePredicate var1, mew var2, zfz var3) {
      this.u7p(var1, var2, var3);
   }

   @Override
   public void z3l(OpaquePredicate var1, mew var2, zfz var3, e0x var4) {
      this.u7p(var1, var2, var3);
      super.z3l(var1, var2, var3, var4);
   }

   public void u7p(OpaquePredicate param1, mew param2, zfz param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 4
      // 05: aload 3
      // 06: getstatic mjv.ojg Lh76;
      // 09: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0e: checkcast java/lang/Boolean
      // 11: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 14: iload 4
      // 16: ifeq 30
      // 19: ifne 68
      // 1c: goto 23
      // 1f: invokestatic mjv.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 0
      // 24: aload 1
      // 25: aload 2
      // 26: invokespecial mjv.y4v (Lt9d;Lmew;)Z
      // 29: goto 30
      // 2c: invokestatic mjv.a (Loov;)Loov;
      // 2f: athrow
      // 30: iload 4
      // 32: ifeq 59
      // 35: ifeq 68
      // 38: goto 3f
      // 3b: invokestatic mjv.a (Loov;)Loov;
      // 3e: athrow
      // 3f: aload 1
      // 40: aload 2
      // 41: aload 3
      // 42: getstatic mjv.ojg Lh76;
      // 45: bipush 1
      // 46: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 49: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 4e: bipush 2
      // 4f: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 52: goto 59
      // 55: invokestatic mjv.a (Loov;)Loov;
      // 58: athrow
      // 59: pop
      // 5a: aload 1
      // 5b: sipush 2001
      // 5e: aload 2
      // 5f: getstatic ox_.gdz Les2;
      // 62: invokestatic e0x.mxb (Le0x;)I
      // 65: invokevirtual OpaquePredicate.qca (ILmew;I)V
      // 68: return
   }

   private boolean y4v(OpaquePredicate param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/google/common/collect/Lists.newLinkedList ()Ljava/util/LinkedList;
      // 003: astore 4
      // 005: invokestatic OpaquePredicate.b ()I
      // 008: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 00b: astore 5
      // 00d: aload 4
      // 00f: new sj1
      // 012: dup
      // 013: aload 2
      // 014: bipush 0
      // 015: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 018: invokespecial sj1.<init> (Ljava/lang/Object;Ljava/lang/Object;)V
      // 01b: invokeinterface java/util/Queue.add (Ljava/lang/Object;)Z 2
      // 020: pop
      // 021: istore 3
      // 022: bipush 0
      // 023: istore 6
      // 025: aload 4
      // 027: invokeinterface java/util/Queue.isEmpty ()Z 1
      // 02c: ifne 103
      // 02f: aload 4
      // 031: invokeinterface java/util/Queue.poll ()Ljava/lang/Object; 1
      // 036: checkcast sj1
      // 039: astore 7
      // 03b: aload 7
      // 03d: invokevirtual sj1.bel ()Ljava/lang/Object;
      // 040: checkcast mew
      // 043: astore 8
      // 045: aload 7
      // 047: invokevirtual sj1.g3d ()Ljava/lang/Object;
      // 04a: checkcast java/lang/Integer
      // 04d: invokevirtual java/lang/Integer.intValue ()I
      // 050: istore 9
      // 052: invokestatic vt2.values ()[Lvt2;
      // 055: astore 10
      // 057: aload 10
      // 059: arraylength
      // 05a: istore 11
      // 05c: bipush 0
      // 05d: istore 12
      // 05f: iload 12
      // 061: iload 11
      // 063: if_icmpge 0f1
      // 066: aload 10
      // 068: iload 12
      // 06a: aaload
      // 06b: astore 13
      // 06d: aload 8
      // 06f: aload 13
      // 071: invokevirtual mew.offset (Lvt2;)Lmew;
      // 074: astore 14
      // 076: iload 3
      // 077: ifeq 0ed
      // 07a: aload 1
      // 07b: aload 14
      // 07d: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 080: invokeinterface zfz.r_y ()Le0x; 1
      // 085: invokevirtual e0x.p1r ()Lp3y;
      // 088: iload 3
      // 089: ifeq 04a
      // 08c: goto 093
      // 08f: invokestatic mjv.a (Loov;)Loov;
      // 092: athrow
      // 093: getstatic p3y.six Lp3y;
      // 096: if_acmpne 0ea
      // 099: aload 1
      // 09a: aload 14
      // 09c: getstatic ox_.ibw Le0x;
      // 09f: invokevirtual e0x.l4i ()Lzfz;
      // 0a2: bipush 2
      // 0a3: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 0a6: pop
      // 0a7: aload 5
      // 0a9: aload 14
      // 0ab: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 0ae: pop
      // 0af: iinc 6 1
      // 0b2: iload 3
      // 0b3: ifeq 0ed
      // 0b6: goto 0bd
      // 0b9: invokestatic mjv.a (Loov;)Loov;
      // 0bc: athrow
      // 0bd: iload 9
      // 0bf: bipush 6
      // 0c1: if_icmpge 0ea
      // 0c4: goto 0cb
      // 0c7: invokestatic mjv.a (Loov;)Loov;
      // 0ca: athrow
      // 0cb: aload 4
      // 0cd: new sj1
      // 0d0: dup
      // 0d1: aload 14
      // 0d3: iload 9
      // 0d5: bipush 1
      // 0d6: iadd
      // 0d7: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0da: invokespecial sj1.<init> (Ljava/lang/Object;Ljava/lang/Object;)V
      // 0dd: invokeinterface java/util/Queue.add (Ljava/lang/Object;)Z 2
      // 0e2: pop
      // 0e3: goto 0ea
      // 0e6: invokestatic mjv.a (Loov;)Loov;
      // 0e9: athrow
      // 0ea: iinc 12 1
      // 0ed: iload 3
      // 0ee: ifne 05f
      // 0f1: iload 6
      // 0f3: bipush 64
      // 0f5: if_icmple 0ff
      // 0f8: goto 103
      // 0fb: invokestatic mjv.a (Loov;)Loov;
      // 0fe: athrow
      // 0ff: iload 3
      // 100: ifne 025
      // 103: aload 5
      // 105: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 108: astore 7
      // 10a: aload 7
      // 10c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 111: ifeq 138
      // 114: aload 7
      // 116: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 11b: checkcast mew
      // 11e: astore 8
      // 120: aload 1
      // 121: aload 8
      // 123: getstatic ox_.ibw Le0x;
      // 126: invokevirtual OpaquePredicate._0o (Lmew;Le0x;)V
      // 129: iload 3
      // 12a: ifeq 14c
      // 12d: iload 3
      // 12e: ifne 10a
      // 131: goto 138
      // 134: invokestatic mjv.a (Loov;)Loov;
      // 137: athrow
      // 138: iload 6
      // 13a: iload 3
      // 13b: ifeq 149
      // 13e: ifle 14c
      // 141: goto 148
      // 144: invokestatic mjv.a (Loov;)Loov;
      // 147: athrow
      // 148: bipush 1
      // 149: goto 14d
      // 14c: bipush 0
      // 14d: ireturn
   }

   @Override
   public void m1q(u7m var1, uja var2, List var3) {
      var3.add(new erg(var1, 1, 0));
      var3.add(new erg(var1, 1, 1));
   }

   @Override
   public zfz kig(int param1) {
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
      // 05: invokevirtual mjv.l4i ()Lzfz;
      // 08: getstatic mjv.ojg Lh76;
      // 0b: iload 1
      // 0c: bipush 1
      // 0d: iand
      // 0e: iload 2
      // 0f: ifne 25
      // 12: bipush 1
      // 13: if_icmpne 28
      // 16: goto 1d
      // 19: invokestatic mjv.a (Loov;)Loov;
      // 1c: athrow
      // 1d: bipush 1
      // 1e: goto 25
      // 21: invokestatic mjv.a (Loov;)Loov;
      // 24: athrow
      // 25: goto 29
      // 28: bipush 0
      // 29: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2c: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 31: areturn
   }

   @Override
   public int hvp(zfz var1) {
      int var2 = OpaquePredicate.c();

      try {
         byte var10000 = (Boolean)var1.dil(ojg);
         if (var2 != 0) {
            return var10000;
         }

         if (var10000 != 0) {
            return 1;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return 0;
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{ojg});
   }

   @Override
   public void kyo(OpaquePredicate param1, mew param2, zfz param3, Random param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 5
      // 005: aload 3
      // 006: getstatic mjv.ojg Lh76;
      // 009: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 00e: checkcast java/lang/Boolean
      // 011: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 014: ifeq 13d
      // 017: aload 4
      // 019: invokestatic vt2.aa3 (Ljava/util/Random;)Lvt2;
      // 01c: astore 6
      // 01e: aload 6
      // 020: getstatic vt2.rf3 Lvt2;
      // 023: if_acmpeq 13d
      // 026: aload 1
      // 027: aload 2
      // 028: aload 6
      // 02a: invokevirtual mew.offset (Lvt2;)Lmew;
      // 02d: invokestatic OpaquePredicate.r3_ (Lm5n;Lmew;)Z
      // 030: iload 5
      // 032: ifne 051
      // 035: goto 03c
      // 038: invokestatic mjv.a (Loov;)Loov;
      // 03b: athrow
      // 03c: ifne 13d
      // 03f: goto 046
      // 042: invokestatic mjv.a (Loov;)Loov;
      // 045: athrow
      // 046: aload 2
      // 047: invokevirtual mew.getX ()I
      // 04a: goto 051
      // 04d: invokestatic mjv.a (Loov;)Loov;
      // 050: athrow
      // 051: i2d
      // 052: dstore 7
      // 054: aload 2
      // 055: invokevirtual mew.getY ()I
      // 058: i2d
      // 059: dstore 9
      // 05b: aload 2
      // 05c: invokevirtual mew.getZ ()I
      // 05f: i2d
      // 060: dstore 11
      // 062: aload 6
      // 064: iload 5
      // 066: ifne 0a7
      // 069: getstatic vt2.m3r Lvt2;
      // 06c: if_acmpne 097
      // 06f: goto 076
      // 072: invokestatic mjv.a (Loov;)Loov;
      // 075: athrow
      // 076: dload 9
      // 078: ldc2_w 0.05
      // 07b: dsub
      // 07c: dstore 9
      // 07e: dload 7
      // 080: aload 4
      // 082: invokevirtual java/util/Random.nextDouble ()D
      // 085: dadd
      // 086: dstore 7
      // 088: dload 11
      // 08a: aload 4
      // 08c: invokevirtual java/util/Random.nextDouble ()D
      // 08f: dadd
      // 090: dstore 11
      // 092: iload 5
      // 094: ifeq 12a
      // 097: dload 9
      // 099: aload 4
      // 09b: invokevirtual java/util/Random.nextDouble ()D
      // 09e: ldc2_w 0.8
      // 0a1: dmul
      // 0a2: dadd
      // 0a3: dstore 9
      // 0a5: aload 6
      // 0a7: iload 5
      // 0a9: ifne 10a
      // 0ac: invokevirtual vt2.e30 ()Lvt2$y0s;
      // 0af: getstatic vt2$y0s.wvd Lvt2$y0s;
      // 0b2: if_acmpne 0f2
      // 0b5: goto 0bc
      // 0b8: invokestatic mjv.a (Loov;)Loov;
      // 0bb: athrow
      // 0bc: dload 11
      // 0be: aload 4
      // 0c0: invokevirtual java/util/Random.nextDouble ()D
      // 0c3: dadd
      // 0c4: dstore 11
      // 0c6: iload 5
      // 0c8: ifne 0ed
      // 0cb: aload 6
      // 0cd: getstatic vt2.zk4 Lvt2;
      // 0d0: if_acmpne 0e5
      // 0d3: goto 0da
      // 0d6: invokestatic mjv.a (Loov;)Loov;
      // 0d9: athrow
      // 0da: dload 7
      // 0dc: dconst_1
      // 0dd: dadd
      // 0de: dstore 7
      // 0e0: iload 5
      // 0e2: ifeq 12a
      // 0e5: dload 7
      // 0e7: ldc2_w 0.05
      // 0ea: dadd
      // 0eb: dstore 7
      // 0ed: iload 5
      // 0ef: ifeq 12a
      // 0f2: dload 7
      // 0f4: aload 4
      // 0f6: invokevirtual java/util/Random.nextDouble ()D
      // 0f9: dadd
      // 0fa: iload 5
      // 0fc: ifne 128
      // 0ff: goto 106
      // 102: invokestatic mjv.a (Loov;)Loov;
      // 105: athrow
      // 106: dstore 7
      // 108: aload 6
      // 10a: getstatic vt2.mxp Lvt2;
      // 10d: if_acmpne 11b
      // 110: dload 11
      // 112: dconst_1
      // 113: dadd
      // 114: dstore 11
      // 116: iload 5
      // 118: ifeq 12a
      // 11b: dload 11
      // 11d: ldc2_w 0.05
      // 120: dadd
      // 121: goto 128
      // 124: invokestatic mjv.a (Loov;)Loov;
      // 127: athrow
      // 128: dstore 11
      // 12a: aload 1
      // 12b: getstatic w_0.cde Lw_0;
      // 12e: dload 7
      // 130: dload 9
      // 132: dload 11
      // 134: dconst_0
      // 135: dconst_0
      // 136: dconst_0
      // 137: bipush 0
      // 138: newarray 10
      // 13a: invokevirtual OpaquePredicate.zvy (Lw_0;DDDDDD[I)V
      // 13d: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2931603592358442077L, 8362574515374325389L, MethodHandles.lookup().lookupClass()).a(115868036490667L);
      // $VF: monitorexit
      b = var10000;
      long var9 = b ^ 56963754698407L;
      Cipher var0;
      Cipher var12 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[2];
      int var5 = 0;
      String var4 = "¥b\u0007C¿×\u008fK»\u008f\u0086ê@\u009b8¾æ\u0004X¡\u001fî±9\u0010\u009f\u0090Y\u000bäA1»*C\u0015Ö\u0097Èëp";
      int var6 = "¥b\u0007C¿×\u008fK»\u008f\u0086ê@\u009b8¾æ\u0004X¡\u001fî±9\u0010\u009f\u0090Y\u000bäA1»*C\u0015Ö\u0097Èëp".length();
      char var3 = 24;
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var14 = b(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var14;
         if ((var2 += var3) >= var6) {
            d = var7;
            h = new String[2];
            ojg = h76.d_1(b<"h">(11879, 4433359699106840174L ^ var9));
            return;
         }

         var3 = var4.charAt(var2);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26019;
      if (h[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("mjv", var10);
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
         h[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return h[var5];
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
         throw new RuntimeException("mjv" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
