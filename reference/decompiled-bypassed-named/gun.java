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

public class gun extends u7m {
   public final e0x ekx;
   private static final long a;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public gun(e0x var1) {
      this.ekx = var1;
   }

   public gun q_5(String var1) {
      super.q_5(var1);
      return this;
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
      // 000: aload 3
      // 001: aload 4
      // 003: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 006: astore 10
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: aload 10
      // 00d: invokeinterface zfz.r_y ()Le0x; 1
      // 012: astore 11
      // 014: istore 9
      // 016: aload 11
      // 018: aload 3
      // 019: aload 4
      // 01b: invokevirtual e0x.ujd (Lt9d;Lmew;)Z
      // 01e: iload 9
      // 020: ifeq 03a
      // 023: ifne 036
      // 026: goto 02d
      // 029: invokestatic gun.b (Loov;)Loov;
      // 02c: athrow
      // 02d: aload 4
      // 02f: aload 5
      // 031: invokevirtual mew.offset (Lvt2;)Lmew;
      // 034: astore 4
      // 036: aload 1
      // 037: getfield erg.qd2 I
      // 03a: iload 9
      // 03c: ifeq 058
      // 03f: ifne 04f
      // 042: goto 049
      // 045: invokestatic gun.b (Loov;)Loov;
      // 048: athrow
      // 049: bipush 0
      // 04a: ireturn
      // 04b: invokestatic gun.b (Loov;)Loov;
      // 04e: athrow
      // 04f: aload 2
      // 050: aload 4
      // 052: aload 5
      // 054: aload 1
      // 055: invokevirtual ha9.dzh (Lmew;Lvt2;Lerg;)Z
      // 058: iload 9
      // 05a: ifeq 07f
      // 05d: ifne 06d
      // 060: goto 067
      // 063: invokestatic gun.b (Loov;)Loov;
      // 066: athrow
      // 067: bipush 0
      // 068: ireturn
      // 069: invokestatic gun.b (Loov;)Loov;
      // 06c: athrow
      // 06d: aload 3
      // 06e: aload 0
      // 06f: getfield gun.ekx Le0x;
      // 072: aload 4
      // 074: bipush 0
      // 075: aload 5
      // 077: aconst_null
      // 078: checkcast EntityLivingBase
      // 07b: aload 1
      // 07c: invokevirtual OpaquePredicate.ask (Le0x;Lmew;ZLvt2;Li2h;Lerg;)Z
      // 07f: iload 9
      // 081: ifeq 15f
      // 084: ifeq 15e
      // 087: goto 08e
      // 08a: invokestatic gun.b (Loov;)Loov;
      // 08d: athrow
      // 08e: aload 0
      // 08f: aload 1
      // 090: invokevirtual erg.j6_ ()I
      // 093: invokevirtual gun.v05 (I)I
      // 096: istore 12
      // 098: aload 0
      // 099: getfield gun.ekx Le0x;
      // 09c: aload 3
      // 09d: aload 4
      // 09f: aload 5
      // 0a1: fload 6
      // 0a3: fload 7
      // 0a5: fload 8
      // 0a7: iload 12
      // 0a9: aload 2
      // 0aa: invokevirtual e0x.qk_ (Lt9d;Lmew;Lvt2;FFFILg_3;)Lzfz;
      // 0ad: astore 13
      // 0af: aload 3
      // 0b0: aload 4
      // 0b2: aload 13
      // 0b4: bipush 3
      // 0b5: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 0b8: iload 9
      // 0ba: ifeq 15d
      // 0bd: ifeq 15c
      // 0c0: goto 0c7
      // 0c3: invokestatic gun.b (Loov;)Loov;
      // 0c6: athrow
      // 0c7: aload 3
      // 0c8: aload 4
      // 0ca: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 0cd: astore 13
      // 0cf: iload 9
      // 0d1: ifeq 152
      // 0d4: aload 13
      // 0d6: invokeinterface zfz.r_y ()Le0x; 1
      // 0db: aload 0
      // 0dc: getfield gun.ekx Le0x;
      // 0df: if_acmpne 107
      // 0e2: goto 0e9
      // 0e5: invokestatic gun.b (Loov;)Loov;
      // 0e8: athrow
      // 0e9: aload 3
      // 0ea: aload 2
      // 0eb: aload 4
      // 0ed: aload 1
      // 0ee: invokestatic gun.v79 (Lt9d;Lha9;Lmew;Lerg;)Z
      // 0f1: pop
      // 0f2: aload 0
      // 0f3: getfield gun.ekx Le0x;
      // 0f6: aload 3
      // 0f7: aload 4
      // 0f9: aload 13
      // 0fb: aload 2
      // 0fc: aload 1
      // 0fd: invokevirtual e0x.qh0 (Lt9d;Lmew;Lzfz;Lg_3;Lerg;)V
      // 100: goto 107
      // 103: invokestatic gun.b (Loov;)Loov;
      // 106: athrow
      // 107: aload 3
      // 108: aload 4
      // 10a: invokevirtual mew.getX ()I
      // 10d: i2f
      // 10e: ldc 0.5
      // 110: nop
      // 111: fadd
      // 112: f2d
      // 113: aload 4
      // 115: invokevirtual mew.getY ()I
      // 118: i2f
      // 119: ldc 0.5
      // 11b: nop
      // 11c: fadd
      // 11d: f2d
      // 11e: aload 4
      // 120: invokevirtual mew.getZ ()I
      // 123: i2f
      // 124: ldc 0.5
      // 126: nop
      // 127: fadd
      // 128: f2d
      // 129: aload 0
      // 12a: getfield gun.ekx Le0x;
      // 12d: getfield e0x.zu6 Le0x$zvv;
      // 130: invokevirtual e0x$zvv.jfo ()Ljava/lang/String;
      // 133: aload 0
      // 134: getfield gun.ekx Le0x;
      // 137: getfield e0x.zu6 Le0x$zvv;
      // 13a: invokevirtual e0x$zvv.dnt ()F
      // 13d: fconst_1
      // 13e: fadd
      // 13f: fconst_2
      // 140: fdiv
      // 141: aload 0
      // 142: getfield gun.ekx Le0x;
      // 145: getfield e0x.zu6 Le0x$zvv;
      // 148: invokevirtual e0x$zvv.kjj ()F
      // 14b: ldc 0.8
      // 14d: nop
      // 14e: fmul
      // 14f: invokevirtual OpaquePredicate.amg (DDDLjava/lang/String;FF)V
      // 152: aload 1
      // 153: dup
      // 154: getfield erg.qd2 I
      // 157: bipush 1
      // 158: isub
      // 159: putfield erg.qd2 I
      // 15c: bipush 1
      // 15d: ireturn
      // 15e: bipush 0
      // 15f: ireturn
   }

   public static boolean v79(OpaquePredicate param0, ha9 param1, mew param2, erg param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic gun.a J
      // 003: ldc2_w 90158806221983
      // 006: lxor
      // 007: lstore 4
      // 009: invokestatic OpaquePredicate.c ()I
      // 00c: istore 6
      // 00e: invokestatic vr1._0v ()Lvr1;
      // 011: astore 7
      // 013: aload 7
      // 015: ifnonnull 01e
      // 018: bipush 0
      // 019: ireturn
      // 01a: invokestatic gun.b (Loov;)Loov;
      // 01d: athrow
      // 01e: aload 3
      // 01f: invokevirtual erg.w8b ()Z
      // 022: iload 6
      // 024: ifne 14d
      // 027: ifeq 14c
      // 02a: goto 031
      // 02d: invokestatic gun.b (Loov;)Loov;
      // 030: athrow
      // 031: aload 3
      // 032: invokevirtual erg.zso ()Lbdo;
      // 035: sipush 30176
      // 038: ldc2_w 7232377639428434741
      // 03b: lload 4
      // 03d: lxor
      // 03e: invokedynamic l (IJ)Ljava/lang/String; bsm=gun.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 043: nop
      // 044: bipush 10
      // 046: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 049: iload 6
      // 04b: ifne 14d
      // 04e: goto 055
      // 051: invokestatic gun.b (Loov;)Loov;
      // 054: athrow
      // 055: ifeq 14c
      // 058: goto 05f
      // 05b: invokestatic gun.b (Loov;)Loov;
      // 05e: athrow
      // 05f: aload 0
      // 060: aload 2
      // 061: invokevirtual OpaquePredicate.getTileEntity (Lmew;)Lpyk;
      // 064: astore 8
      // 066: aload 8
      // 068: ifnull 14c
      // 06b: aload 0
      // 06c: getfield OpaquePredicate.v0f Z
      // 06f: iload 6
      // 071: ifne 091
      // 074: goto 07b
      // 077: invokestatic gun.b (Loov;)Loov;
      // 07a: athrow
      // 07b: ifne 0c4
      // 07e: goto 085
      // 081: invokestatic gun.b (Loov;)Loov;
      // 084: athrow
      // 085: aload 8
      // 087: invokevirtual pyk.v3u ()Z
      // 08a: goto 091
      // 08d: invokestatic gun.b (Loov;)Loov;
      // 090: athrow
      // 091: iload 6
      // 093: ifne 0b3
      // 096: ifeq 0c4
      // 099: goto 0a0
      // 09c: invokestatic gun.b (Loov;)Loov;
      // 09f: athrow
      // 0a0: aload 7
      // 0a2: invokevirtual vr1.wh3 ()Lwlx;
      // 0a5: aload 1
      // 0a6: invokevirtual ha9.x6l ()Lcom/mojang/authlib/GameProfile;
      // 0a9: invokevirtual wlx.sbc (Lcom/mojang/authlib/GameProfile;)Z
      // 0ac: goto 0b3
      // 0af: invokestatic gun.b (Loov;)Loov;
      // 0b2: athrow
      // 0b3: iload 6
      // 0b5: ifne 0c3
      // 0b8: ifne 0c4
      // 0bb: goto 0c2
      // 0be: invokestatic gun.b (Loov;)Loov;
      // 0c1: athrow
      // 0c2: bipush 0
      // 0c3: ireturn
      // 0c4: new bdo
      // 0c7: dup
      // 0c8: invokespecial bdo.<init> ()V
      // 0cb: astore 9
      // 0cd: aload 9
      // 0cf: invokevirtual bdo.h33 ()Lgdw;
      // 0d2: checkcast bdo
      // 0d5: astore 10
      // 0d7: aload 8
      // 0d9: aload 9
      // 0db: invokevirtual pyk.m2a (Lbdo;)V
      // 0de: aload 3
      // 0df: invokevirtual erg.zso ()Lbdo;
      // 0e2: sipush 25735
      // 0e5: ldc2_w 8590373455318596179
      // 0e8: lload 4
      // 0ea: lxor
      // 0eb: invokedynamic l (IJ)Ljava/lang/String; bsm=gun.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f0: nop
      // 0f1: invokevirtual bdo.e2o (Ljava/lang/String;)Lgdw;
      // 0f4: checkcast bdo
      // 0f7: astore 11
      // 0f9: aload 9
      // 0fb: aload 11
      // 0fd: invokevirtual bdo.uhv (Lbdo;)V
      // 100: aload 9
      // 102: ldc "x"
      // 104: nop
      // 105: aload 2
      // 106: invokevirtual mew.getX ()I
      // 109: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 10c: aload 9
      // 10e: ldc "y"
      // 110: nop
      // 111: aload 2
      // 112: invokevirtual mew.getY ()I
      // 115: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 118: aload 9
      // 11a: ldc "z"
      // 11c: nop
      // 11d: aload 2
      // 11e: invokevirtual mew.getZ ()I
      // 121: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 124: aload 9
      // 126: aload 10
      // 128: invokevirtual bdo.equals (Ljava/lang/Object;)Z
      // 12b: iload 6
      // 12d: ifne 14d
      // 130: ifne 14c
      // 133: goto 13a
      // 136: invokestatic gun.b (Loov;)Loov;
      // 139: athrow
      // 13a: aload 8
      // 13c: aload 9
      // 13e: invokevirtual pyk.agl (Lbdo;)V
      // 141: aload 8
      // 143: invokevirtual pyk.r5t ()V
      // 146: bipush 1
      // 147: ireturn
      // 148: invokestatic gun.b (Loov;)Loov;
      // 14b: athrow
      // 14c: bipush 0
      // 14d: ireturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public boolean hty(OpaquePredicate var1, mew var2, vt2 var3, ha9 var4, erg var5) {
      int var6 = OpaquePredicate.c();
      e0x var7 = var1.getBlockState(var2).r_y();

      e0x var10000;
      label47: {
         label55: {
            try {
               var10000 = var7;
               if (var6 != 0) {
                  break label47;
               }

               if (var7 != ox_.dxo) {
                  break label55;
               }
            } catch (oov var11) {
               throw b(var11);
            }

            var3 = vt2.rf3;

            try {
               if (var6 == 0) {
                  return var1.ask(this.ekx, var2, false, var3, (EntityLivingBase)null, var5);
               }
            } catch (oov var10) {
               boolean var10001 = false;
               throw b(var10);
            }
         }

         try {
            var10000 = var7;
         } catch (oov var9) {
            boolean var14 = false;
            throw b(var9);
         }
      }

      try {
         boolean var13 = var10000.ujd(var1, var2);
         if (var6 != 0) {
            return var13;
         }

         if (var13) {
            return var1.ask(this.ekx, var2, false, var3, (EntityLivingBase)null, var5);
         }
      } catch (oov var8) {
         throw b(var8);
      }

      var2 = var2.offset(var3);
      return var1.ask(this.ekx, var2, false, var3, (EntityLivingBase)null, var5);
   }

   @Override
   public String g56(erg var1) {
      return this.ekx.abc();
   }

   @Override
   public String ayn() {
      return this.ekx.abc();
   }

   @Override
   public uja f4r() {
      return this.ekx.wux();
   }

   @Override
   public void jlj(u7m var1, uja var2, List var3) {
      this.ekx.m1q(var1, var2, var3);
   }

   public e0x kpo() {
      return this.ekx;
   }

   @Override
   public u7m q_5(String var1) {
      return this.q_5(var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5802066303356706556L, -4578735917515623992L, MethodHandles.lookup().lookupClass()).a(221354151209805L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 109918736902132L;
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
      String var6 = "üï¶\b·]÷)\u0094\u0089ånöI\u0007\u0088Sõ\u008aEæºo=B\u000b\u001d\u0015\u008a_>\u009c \u0092ê\"(\u0090ú~Ô\\rÉ\u009aluî)}²4\u00824ÔªçG\u001b\u0004éMiSí";
      int var8 = "üï¶\b·]÷)\u0094\u0089ånöI\u0007\u0088Sõ\u008aEæºo=B\u000b\u001d\u0015\u008a_>\u009c \u0092ê\"(\u0090ú~Ô\\rÉ\u009aluî)}²4\u00824ÔªçG\u001b\u0004éMiSí"
         .length();
      char var5 = ' ';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = b(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            g = var9;
            h = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static oov b(oov var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5480;
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
            throw new RuntimeException("gun", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = g[var5].getBytes("ISO-8859-1");
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
         throw new RuntimeException("gun" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
