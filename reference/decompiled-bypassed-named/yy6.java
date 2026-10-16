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

public class yy6 extends ak9 {
   public boolean k66;
   public BooleanSetting o2i;
   private static final long a;
   private static final String[] c;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public yy6(BooleanSetting var1, nm6 var2, int var3, int var4) {
      long var5 = a ^ 131473958231477L;
      super(var2, var3, var4, var1.l08());
      this.vms = jvy.ypj;
      this.c1c = 11;
      this.o2i = var1;
      this.bqh = b<"n">(30552, 4871602366177926099L ^ var5);
   }

   public yy6(BooleanSetting var1, nm6 var2, int var3, int var4, int var5) {
      this(var1, var2, var3, var4);
      this.asa = var5;
   }

   @Override
   public void c2n(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: aload 0
      // 05: iload 1
      // 06: iload 2
      // 07: invokespecial ak9.c2n (II)V
      // 0a: aload 0
      // 0b: aload 0
      // 0c: getfield yy6.o2i Lcn7;
      // 0f: iload 3
      // 10: ifne 28
      // 13: ifnull 40
      // 16: goto 1d
      // 19: invokestatic yy6.a (Loov;)Loov;
      // 1c: athrow
      // 1d: aload 0
      // 1e: getfield yy6.o2i Lcn7;
      // 21: goto 28
      // 24: invokestatic yy6.a (Loov;)Loov;
      // 27: athrow
      // 28: invokevirtual BooleanSetting.getValue ()Ljava/lang/Boolean;
      // 2b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2e: iload 3
      // 2f: ifne 3d
      // 32: ifeq 40
      // 35: goto 3c
      // 38: invokestatic yy6.a (Loov;)Loov;
      // 3b: athrow
      // 3c: bipush 1
      // 3d: goto 41
      // 40: bipush 0
      // 41: putfield yy6.k66 Z
      // 44: return
   }

   @Override
   public void g1p(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 3
      // 004: getstatic jsr.erx Lcyb;
      // 007: aload 0
      // 008: getfield yy6.o2i Lcn7;
      // 00b: invokevirtual BooleanSetting.o7h ()Ljava/lang/String;
      // 00e: aload 0
      // 00f: getfield yy6.koa I
      // 012: bipush 17
      // 014: iadd
      // 015: bipush 2
      // 016: iadd
      // 017: i2f
      // 018: aload 0
      // 019: getfield yy6.mff I
      // 01c: aload 0
      // 01d: getfield yy6.asa I
      // 020: iadd
      // 021: i2f
      // 022: ldc 4.5
      // 024: nop
      // 025: fadd
      // 026: getstatic jvy.ck5 Z
      // 029: iload 3
      // 02a: ifeq 046
      // 02d: ifeq 044
      // 030: goto 037
      // 033: invokestatic yy6.a (Loov;)Loov;
      // 036: athrow
      // 037: getstatic z7e.kks Lz7e;
      // 03a: getfield z7e.k0y I
      // 03d: goto 047
      // 040: invokestatic yy6.a (Loov;)Loov;
      // 043: athrow
      // 044: ldc 16777215
      // 046: nop
      // 047: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // 04a: pop
      // 04b: aload 0
      // 04c: getfield yy6.koa I
      // 04f: bipush 10
      // 051: iadd
      // 052: i2f
      // 053: aload 0
      // 054: getfield yy6.mff I
      // 057: aload 0
      // 058: getfield yy6.asa I
      // 05b: iadd
      // 05c: bipush 5
      // 05d: iadd
      // 05e: i2f
      // 05f: ldc 6.5
      // 061: nop
      // 062: ldc 6.5
      // 064: nop
      // 065: getstatic jvy.ck5 Z
      // 068: iload 3
      // 069: ifeq 090
      // 06c: ifeq 093
      // 06f: goto 076
      // 072: invokestatic yy6.a (Loov;)Loov;
      // 075: athrow
      // 076: new java/awt/Color
      // 079: dup
      // 07a: getstatic z7e.kks Lz7e;
      // 07d: getfield z7e.k0y I
      // 080: invokespecial java/awt/Color.<init> (I)V
      // 083: invokevirtual java/awt/Color.brighter ()Ljava/awt/Color;
      // 086: invokevirtual java/awt/Color.getRGB ()I
      // 089: goto 090
      // 08c: invokestatic yy6.a (Loov;)Loov;
      // 08f: athrow
      // 090: goto 099
      // 093: getstatic z7e.kks Lz7e;
      // 096: getfield z7e.k0y I
      // 099: invokestatic mkt.uk7 (FFFFI)V
      // 09c: aload 0
      // 09d: getfield yy6.k66 Z
      // 0a0: iload 3
      // 0a1: ifeq 0f3
      // 0a4: ifeq 0ef
      // 0a7: goto 0ae
      // 0aa: invokestatic yy6.a (Loov;)Loov;
      // 0ad: athrow
      // 0ae: aload 0
      // 0af: getfield yy6.koa I
      // 0b2: i2f
      // 0b3: ldc 11.0
      // 0b5: nop
      // 0b6: fadd
      // 0b7: aload 0
      // 0b8: getfield yy6.mff I
      // 0bb: aload 0
      // 0bc: getfield yy6.asa I
      // 0bf: iadd
      // 0c0: i2f
      // 0c1: ldc 6.0
      // 0c3: nop
      // 0c4: fadd
      // 0c5: ldc 4.5
      // 0c7: nop
      // 0c8: ldc 4.5
      // 0ca: nop
      // 0cb: getstatic jvy.ck5 Z
      // 0ce: iload 3
      // 0cf: ifeq 0e6
      // 0d2: goto 0d9
      // 0d5: invokestatic yy6.a (Loov;)Loov;
      // 0d8: athrow
      // 0d9: ifeq 0e9
      // 0dc: goto 0e3
      // 0df: invokestatic yy6.a (Loov;)Loov;
      // 0e2: athrow
      // 0e3: getstatic jvy.ts6 I
      // 0e6: goto 0ec
      // 0e9: getstatic jvy.cnm I
      // 0ec: invokestatic mkt.uk7 (FFFFI)V
      // 0ef: aload 0
      // 0f0: getfield yy6.yu6 Z
      // 0f3: iload 3
      // 0f4: ifeq 10f
      // 0f7: ifeq 131
      // 0fa: goto 101
      // 0fd: invokestatic yy6.a (Loov;)Loov;
      // 100: athrow
      // 101: aload 0
      // 102: getfield yy6.koa I
      // 105: bipush 10
      // 107: iadd
      // 108: goto 10f
      // 10b: invokestatic yy6.a (Loov;)Loov;
      // 10e: athrow
      // 10f: i2f
      // 110: aload 0
      // 111: getfield yy6.mff I
      // 114: aload 0
      // 115: getfield yy6.asa I
      // 118: iadd
      // 119: bipush 5
      // 11a: iadd
      // 11b: i2f
      // 11c: ldc 6.5
      // 11e: nop
      // 11f: ldc 6.5
      // 121: nop
      // 122: getstatic z7e.ret Lz7e;
      // 125: getfield z7e.k0y I
      // 128: ldc 0.25
      // 12a: nop
      // 12b: invokestatic hhf.kjo (IF)I
      // 12e: invokestatic mkt.uk7 (FFFFI)V
      // 131: return
   }

   @Override
   public void x6o(int param1, int param2, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic yy6.a J
      // 003: ldc2_w 8905153398405
      // 006: lxor
      // 007: lstore 4
      // 009: invokestatic OpaquePredicate.b ()I
      // 00c: istore 6
      // 00e: aload 0
      // 00f: aload 0
      // 010: iload 1
      // 011: iload 2
      // 012: invokevirtual yy6.nxv (II)Z
      // 015: iload 6
      // 017: ifeq 034
      // 01a: ifeq 047
      // 01d: goto 024
      // 020: invokestatic yy6.a (Loov;)Loov;
      // 023: athrow
      // 024: aload 0
      // 025: getfield yy6.loa Lnm6;
      // 028: iload 1
      // 029: iload 2
      // 02a: invokevirtual nm6.au1 (II)Z
      // 02d: goto 034
      // 030: invokestatic yy6.a (Loov;)Loov;
      // 033: athrow
      // 034: iload 6
      // 036: ifeq 044
      // 039: ifeq 047
      // 03c: goto 043
      // 03f: invokestatic yy6.a (Loov;)Loov;
      // 042: athrow
      // 043: bipush 1
      // 044: goto 048
      // 047: bipush 0
      // 048: putfield yy6.yu6 Z
      // 04b: iload 6
      // 04d: ifeq 117
      // 050: iload 3
      // 051: ifeq 112
      // 054: goto 05b
      // 057: invokestatic yy6.a (Loov;)Loov;
      // 05a: athrow
      // 05b: aload 0
      // 05c: iload 6
      // 05e: ifeq 113
      // 061: goto 068
      // 064: invokestatic yy6.a (Loov;)Loov;
      // 067: athrow
      // 068: getfield yy6.u_u Z
      // 06b: ifne 112
      // 06e: goto 075
      // 071: invokestatic yy6.a (Loov;)Loov;
      // 074: athrow
      // 075: aload 0
      // 076: iload 6
      // 078: ifeq 113
      // 07b: goto 082
      // 07e: invokestatic yy6.a (Loov;)Loov;
      // 081: athrow
      // 082: getfield yy6.yu6 Z
      // 085: ifeq 112
      // 088: goto 08f
      // 08b: invokestatic yy6.a (Loov;)Loov;
      // 08e: athrow
      // 08f: aload 0
      // 090: iload 6
      // 092: ifeq 113
      // 095: goto 09c
      // 098: invokestatic yy6.a (Loov;)Loov;
      // 09b: athrow
      // 09c: getfield yy6.o2i Lcn7;
      // 09f: ifnull 112
      // 0a2: goto 0a9
      // 0a5: invokestatic yy6.a (Loov;)Loov;
      // 0a8: athrow
      // 0a9: aload 0
      // 0aa: aload 0
      // 0ab: getfield yy6.k66 Z
      // 0ae: iload 6
      // 0b0: ifeq 0c5
      // 0b3: goto 0ba
      // 0b6: invokestatic yy6.a (Loov;)Loov;
      // 0b9: athrow
      // 0ba: ifne 0c8
      // 0bd: goto 0c4
      // 0c0: invokestatic yy6.a (Loov;)Loov;
      // 0c3: athrow
      // 0c4: bipush 1
      // 0c5: goto 0c9
      // 0c8: bipush 0
      // 0c9: putfield yy6.k66 Z
      // 0cc: aload 0
      // 0cd: getfield yy6.o2i Lcn7;
      // 0d0: aload 0
      // 0d1: getfield yy6.k66 Z
      // 0d4: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0d7: invokevirtual BooleanSetting.setValueRaw (Ljava/lang/Object;)V
      // 0da: aload 0
      // 0db: iload 6
      // 0dd: ifeq 113
      // 0e0: getfield yy6.o2i Lcn7;
      // 0e3: invokevirtual BooleanSetting.l08 ()Ljava/lang/String;
      // 0e6: sipush 14622
      // 0e9: ldc2_w 5011079397318135460
      // 0ec: lload 4
      // 0ee: lxor
      // 0ef: invokedynamic n (IJ)Ljava/lang/String; bsm=yy6.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f4: nop
      // 0f5: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0f8: ifeq 112
      // 0fb: goto 102
      // 0fe: invokestatic yy6.a (Loov;)Loov;
      // 101: athrow
      // 102: invokestatic Minecraft.vz1 ()Lc05;
      // 105: getfield Minecraft.vsl Lcrp;
      // 108: invokevirtual crp.f9n ()V
      // 10b: goto 112
      // 10e: invokestatic yy6.a (Loov;)Loov;
      // 111: athrow
      // 112: aload 0
      // 113: iload 3
      // 114: putfield yy6.u_u Z
      // 117: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(570671601590958906L, -2026558181193304564L, MethodHandles.lookup().lookupClass()).a(164526431499236L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 51740102181955L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[2];
      int var7 = 0;
      String var6 = "\u001fÑ\u0093\u0089Q'\u00954ok&»n\u008a\u001d^\u0018N\u008a<Ô,/¹¸ô\u0095¶¹±Ç\u0081Y\u000fÞ:£'ÿ9\"";
      int var8 = "\u001fÑ\u0093\u0089Q'\u00954ok&»n\u008a\u001d^\u0018N\u008a<Ô,/¹¸ô\u0095¶¹±Ç\u0081Y\u000fÞ:£'ÿ9\"".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = b(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            c = var9;
            g = new String[2];
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 1481;
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
            throw new RuntimeException("yy6", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
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
         throw new RuntimeException("yy6" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
