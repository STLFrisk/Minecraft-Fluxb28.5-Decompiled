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

public class par extends bc_ {
   private static final long a;
   private static final String[] c;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public String xue() {
      long var1 = a ^ 9665595417259L;
      return b<"k">(13662, 4556191268425839917L ^ var1);
   }

   @Override
   public String fm7(e7r var1) {
      long var2 = a ^ 6821246336557L;
      return b<"k">(1243, 2284391753068533800L ^ var2);
   }

   @Override
   public int bag() {
      return 2;
   }

   @Override
   public void l3z(e7r param1, String[] param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic par.a J
      // 003: ldc2_w 14060911876078
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic t9d.b ()I
      // 00b: istore 5
      // 00d: aload 2
      // 00e: arraylength
      // 00f: ifne 01d
      // 012: aload 1
      // 013: invokestatic par.cfc (Le7r;)Lz96;
      // 016: goto 024
      // 019: invokestatic par.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01c: athrow
      // 01d: aload 1
      // 01e: aload 2
      // 01f: bipush 0
      // 020: aaload
      // 021: invokestatic par.h32 (Le7r;Ljava/lang/String;)Lz96;
      // 024: astore 6
      // 026: aload 2
      // 027: arraylength
      // 028: bipush 2
      // 029: if_icmplt 03a
      // 02c: aload 1
      // 02d: aload 2
      // 02e: bipush 1
      // 02f: aaload
      // 030: invokestatic par.ue7 (Le7r;Ljava/lang/String;)Lu7m;
      // 033: goto 03b
      // 036: invokestatic par.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 039: athrow
      // 03a: aconst_null
      // 03b: astore 7
      // 03d: aload 2
      // 03e: arraylength
      // 03f: iload 5
      // 041: ifeq 05d
      // 044: bipush 3
      // 045: if_icmplt 060
      // 048: goto 04f
      // 04b: invokestatic par.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04e: athrow
      // 04f: aload 2
      // 050: bipush 2
      // 051: aaload
      // 052: bipush -1
      // 053: invokestatic par.o_t (Ljava/lang/String;I)I
      // 056: goto 05d
      // 059: invokestatic par.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05c: athrow
      // 05d: goto 061
      // 060: bipush -1
      // 061: istore 8
      // 063: aload 2
      // 064: arraylength
      // 065: iload 5
      // 067: ifeq 083
      // 06a: bipush 4
      // 06b: if_icmplt 086
      // 06e: goto 075
      // 071: invokestatic par.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 074: athrow
      // 075: aload 2
      // 076: bipush 3
      // 077: aaload
      // 078: bipush -1
      // 079: invokestatic par.o_t (Ljava/lang/String;I)I
      // 07c: goto 083
      // 07f: invokestatic par.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 082: athrow
      // 083: goto 087
      // 086: bipush -1
      // 087: istore 9
      // 089: aconst_null
      // 08a: astore 10
      // 08c: aload 2
      // 08d: iload 5
      // 08f: ifeq 09f
      // 092: arraylength
      // 093: bipush 5
      // 094: if_icmplt 0cf
      // 097: goto 09e
      // 09a: invokestatic par.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09d: athrow
      // 09e: aload 2
      // 09f: bipush 4
      // 0a0: invokestatic par.cai ([Ljava/lang/String;I)Ljava/lang/String;
      // 0a3: invokestatic sza.mft (Ljava/lang/String;)Lbdo;
      // 0a6: astore 10
      // 0a8: goto 0cf
      // 0ab: astore 11
      // 0ad: new uvb
      // 0b0: dup
      // 0b1: sipush 17788
      // 0b4: ldc2_w 3101357787190505551
      // 0b7: lload 3
      // 0b8: lxor
      // 0b9: invokedynamic k (IJ)Ljava/lang/String; bsm=par.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0be: nop
      // 0bf: bipush 1
      // 0c0: anewarray 71
      // 0c3: dup
      // 0c4: bipush 0
      // 0c5: aload 11
      // 0c7: invokevirtual npr.getMessage ()Ljava/lang/String;
      // 0ca: aastore
      // 0cb: invokespecial uvb.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 0ce: athrow
      // 0cf: aload 2
      // 0d0: arraylength
      // 0d1: iload 5
      // 0d3: ifeq 123
      // 0d6: bipush 2
      // 0d7: if_icmplt 113
      // 0da: goto 0e1
      // 0dd: invokestatic par.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e0: athrow
      // 0e1: aload 7
      // 0e3: ifnonnull 113
      // 0e6: goto 0ed
      // 0e9: invokestatic par.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ec: athrow
      // 0ed: new uvb
      // 0f0: dup
      // 0f1: sipush 18264
      // 0f4: ldc2_w 4024563325106991721
      // 0f7: lload 3
      // 0f8: lxor
      // 0f9: invokedynamic k (IJ)Ljava/lang/String; bsm=par.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fe: nop
      // 0ff: bipush 1
      // 100: anewarray 71
      // 103: dup
      // 104: bipush 0
      // 105: aload 6
      // 107: invokevirtual z96.noc ()Ljava/lang/String;
      // 10a: aastore
      // 10b: invokespecial uvb.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 10e: athrow
      // 10f: invokestatic par.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 112: athrow
      // 113: aload 6
      // 115: getfield z96.up_ Ljnq;
      // 118: aload 7
      // 11a: iload 8
      // 11c: iload 9
      // 11e: aload 10
      // 120: invokevirtual jnq._pv (Lu7m;IILbdo;)I
      // 123: istore 11
      // 125: aload 6
      // 127: getfield z96.fv9 L_jc;
      // 12a: invokevirtual _jc.n4z ()V
      // 12d: aload 6
      // 12f: getfield z96.lls Lpj2;
      // 132: getfield pj2.g40 Z
      // 135: iload 5
      // 137: ifeq 15d
      // 13a: ifne 150
      // 13d: goto 144
      // 140: invokestatic par.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 143: athrow
      // 144: aload 6
      // 146: invokevirtual z96.kbu ()V
      // 149: goto 150
      // 14c: invokestatic par.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14f: athrow
      // 150: aload 1
      // 151: getstatic n_k$pbp.nw4 Ln_k$pbp;
      // 154: iload 11
      // 156: invokeinterface e7r.io9 (Ln_k$pbp;I)V 3
      // 15b: iload 11
      // 15d: iload 5
      // 15f: ifeq 194
      // 162: ifne 192
      // 165: goto 16c
      // 168: invokestatic par.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16b: athrow
      // 16c: new uvb
      // 16f: dup
      // 170: sipush 2378
      // 173: ldc2_w 7121927179282316414
      // 176: lload 3
      // 177: lxor
      // 178: invokedynamic k (IJ)Ljava/lang/String; bsm=par.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17d: nop
      // 17e: bipush 1
      // 17f: anewarray 71
      // 182: dup
      // 183: bipush 0
      // 184: aload 6
      // 186: invokevirtual z96.noc ()Ljava/lang/String;
      // 189: aastore
      // 18a: invokespecial uvb.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 18d: athrow
      // 18e: invokestatic par.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 191: athrow
      // 192: iload 9
      // 194: ifne 1d2
      // 197: aload 1
      // 198: new hsu
      // 19b: dup
      // 19c: sipush 10820
      // 19f: ldc2_w 3526898890699267953
      // 1a2: lload 3
      // 1a3: lxor
      // 1a4: invokedynamic k (IJ)Ljava/lang/String; bsm=par.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a9: nop
      // 1aa: bipush 2
      // 1ab: anewarray 71
      // 1ae: dup
      // 1af: bipush 0
      // 1b0: aload 6
      // 1b2: invokevirtual z96.noc ()Ljava/lang/String;
      // 1b5: aastore
      // 1b6: dup
      // 1b7: bipush 1
      // 1b8: iload 11
      // 1ba: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1bd: aastore
      // 1be: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 1c1: invokeinterface e7r.a0d (Lekw;)V 2
      // 1c6: iload 5
      // 1c8: ifne 200
      // 1cb: goto 1d2
      // 1ce: invokestatic par.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d1: athrow
      // 1d2: aload 1
      // 1d3: aload 0
      // 1d4: sipush 15019
      // 1d7: ldc2_w 4196361229613420444
      // 1da: lload 3
      // 1db: lxor
      // 1dc: invokedynamic k (IJ)Ljava/lang/String; bsm=par.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e1: nop
      // 1e2: bipush 2
      // 1e3: anewarray 71
      // 1e6: dup
      // 1e7: bipush 0
      // 1e8: aload 6
      // 1ea: invokevirtual z96.noc ()Ljava/lang/String;
      // 1ed: aastore
      // 1ee: dup
      // 1ef: bipush 1
      // 1f0: iload 11
      // 1f2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1f5: aastore
      // 1f6: invokestatic par.wxl (Le7r;Lon1;Ljava/lang/String;[Ljava/lang/Object;)V
      // 1f9: goto 200
      // 1fc: invokestatic par.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ff: athrow
      // 200: return
   }

   @Override
   public List ggu(e7r param1, String[] param2, mew param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 4
      // 05: aload 2
      // 06: arraylength
      // 07: bipush 1
      // 08: iload 4
      // 0a: ifeq 35
      // 0d: if_icmpne 26
      // 10: goto 17
      // 13: invokestatic par.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16: athrow
      // 17: aload 2
      // 18: aload 0
      // 19: invokevirtual par.dmf ()[Ljava/lang/String;
      // 1c: invokestatic par.cqo ([Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;
      // 1f: goto 46
      // 22: invokestatic par.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25: athrow
      // 26: aload 2
      // 27: iload 4
      // 29: ifeq 39
      // 2c: arraylength
      // 2d: bipush 2
      // 2e: goto 35
      // 31: invokestatic par.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34: athrow
      // 35: if_icmpne 45
      // 38: aload 2
      // 39: getstatic u7m.p5w Lnga;
      // 3c: invokevirtual nga.kqi ()Ljava/util/Set;
      // 3f: invokestatic par.d79 ([Ljava/lang/String;Ljava/util/Collection;)Ljava/util/List;
      // 42: goto 46
      // 45: aconst_null
      // 46: areturn
   }

   public String[] dmf() {
      return vr1._0v().p14();
   }

   @Override
   public boolean mp9(String[] var1, int var2) {
      int var3 = t9d.c();

      try {
         if (var3 != 0) {
            return (boolean)var2;
         }

         if (var2 == 0) {
            return (boolean)1;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      return (boolean)0;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2441328381344879208L, 4797975834160825725L, MethodHandles.lookup().lookupClass()).a(255643714448501L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 92628500152145L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[7];
      int var7 = 0;
      String var6 = "0q:»j>mûÊÊiàö£\u008cËÏ\u0001D\u0087Ï!u\u000b6\u001e\u009aèêÌÕ\u007f\u0093*M\u0095`\u009a-1(\u009b\"u\u0013\u008dî\u0091N=^\u0081÷hï/¨Óã*#\u0010O\u0099ë\u0011ùy\u0089m\u001bz\u008eôæ»ö\u001aÚ·l(î+\u0085-\u001bÙs÷ CÖ¨\u000b´¾\u0091Y/µL3õ½BæZs\u0003.ö\u008d¦@V¶<Ä)w:\u0010î®\u000bíNn÷\u0001¸¿\u001a\u00185Þ\u0083ü(eÎ\\DÀID\u0098%ú-³ýº\u0019\u0095)õ£¿\u000e³º\u0013ÓÏ\u0080òë.éñhB|Þ;r\u0091Ý";
      int var8 = "0q:»j>mûÊÊiàö£\u008cËÏ\u0001D\u0087Ï!u\u000b6\u001e\u009aèêÌÕ\u007f\u0093*M\u0095`\u009a-1(\u009b\"u\u0013\u008dî\u0091N=^\u0081÷hï/¨Óã*#\u0010O\u0099ë\u0011ùy\u0089m\u001bz\u008eôæ»ö\u001aÚ·l(î+\u0085-\u001bÙs÷ CÖ¨\u000b´¾\u0091Y/µL3õ½BæZs\u0003.ö\u008d¦@V¶<Ä)w:\u0010î®\u000bíNn÷\u0001¸¿\u001a\u00185Þ\u0083ü(eÎ\\DÀID\u0098%ú-³ýº\u0019\u0095)õ£¿\u000e³º\u0013ÓÏ\u0080òë.éñhB|Þ;r\u0091Ý"
         .length();
      char var5 = '(';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     c = var9;
                     g = new String[7];
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var20;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "3\u0014Jôî<Ó$¯Ä«ðV\u0094i)¦\u008d\u00adû\u0082n\t´'@jA\u0091À\u00138&tt!á\u008fª%0õ2Ðm[i%%ÊUõ\nj6\u0097\u0002x\u0081¥Zª\u0011Jy\u008ax\u00ad\u0016¬7bºT\u0015\u0018úi ä\u0010£/Ì\u0019²\u001a¸b";
                  var8 = "3\u0014Jôî<Ó$¯Ä«ðV\u0094i)¦\u008d\u00adû\u0082n\t´'@jA\u0091À\u00138&tt!á\u008fª%0õ2Ðm[i%%ÊUõ\nj6\u0097\u0002x\u0081¥Zª\u0011Jy\u008ax\u00ad\u0016¬7bºT\u0015\u0018úi ä\u0010£/Ì\u0019²\u001a¸b"
                     .length();
                  var5 = '(';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static Exception a(Exception var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22891;
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
            throw new RuntimeException("par", var10);
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
         throw new RuntimeException("par" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
