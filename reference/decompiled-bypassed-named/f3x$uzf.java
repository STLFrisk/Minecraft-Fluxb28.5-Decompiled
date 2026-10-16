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

public class f3x$uzf extends f3x$ssc {
   public final f3x ahv;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public f3x$uzf(f3x param1, Minecraft param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: aload 1
      // 002: putfield f3x$uzf.ahv Lf3x;
      // 005: aload 0
      // 006: aload 1
      // 007: aload 2
      // 008: invokespecial f3x$ssc.<init> (Lf3x;Lc05;)V
      // 00b: invokestatic OpaquePredicate.c ()I
      // 00e: aload 0
      // 00f: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 012: putfield f3x$uzf._1h Ljava/util/List;
      // 015: getstatic l9p.trf Ljava/util/List;
      // 018: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 01d: astore 4
      // 01f: istore 3
      // 020: aload 4
      // 022: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 027: ifeq 10c
      // 02a: aload 4
      // 02c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 031: checkcast rlk
      // 034: astore 5
      // 036: bipush 0
      // 037: istore 6
      // 039: aload 5
      // 03b: invokevirtual rlk.u3i ()Lu7m;
      // 03e: invokestatic u7m._lo (Lu7m;)I
      // 041: istore 7
      // 043: iload 3
      // 044: ifne 119
      // 047: aload 1
      // 048: invokestatic f3x.h5z (Lf3x;)Lik0;
      // 04b: aload 5
      // 04d: invokevirtual ik0.zgq (L_ss;)I
      // 050: iload 3
      // 051: ifne 066
      // 054: goto 05b
      // 057: invokestatic f3x$uzf.a (Loov;)Loov;
      // 05a: athrow
      // 05b: ifle 06c
      // 05e: goto 065
      // 061: invokestatic f3x$uzf.a (Loov;)Loov;
      // 064: athrow
      // 065: bipush 1
      // 066: istore 6
      // 068: iload 3
      // 069: ifeq 0e5
      // 06c: getstatic l9p.foo [L_ss;
      // 06f: iload 7
      // 071: aaload
      // 072: iload 3
      // 073: ifne 0bd
      // 076: goto 07d
      // 079: invokestatic f3x$uzf.a (Loov;)Loov;
      // 07c: athrow
      // 07d: ifnull 0b0
      // 080: goto 087
      // 083: invokestatic f3x$uzf.a (Loov;)Loov;
      // 086: athrow
      // 087: aload 1
      // 088: invokestatic f3x.h5z (Lf3x;)Lik0;
      // 08b: getstatic l9p.foo [L_ss;
      // 08e: iload 7
      // 090: aaload
      // 091: invokevirtual ik0.zgq (L_ss;)I
      // 094: iload 3
      // 095: ifne 0aa
      // 098: goto 09f
      // 09b: invokestatic f3x$uzf.a (Loov;)Loov;
      // 09e: athrow
      // 09f: ifle 0b0
      // 0a2: goto 0a9
      // 0a5: invokestatic f3x$uzf.a (Loov;)Loov;
      // 0a8: athrow
      // 0a9: bipush 1
      // 0aa: istore 6
      // 0ac: iload 3
      // 0ad: ifeq 0e5
      // 0b0: getstatic l9p._ee [L_ss;
      // 0b3: iload 7
      // 0b5: aaload
      // 0b6: goto 0bd
      // 0b9: invokestatic f3x$uzf.a (Loov;)Loov;
      // 0bc: athrow
      // 0bd: ifnull 0e5
      // 0c0: aload 1
      // 0c1: invokestatic f3x.h5z (Lf3x;)Lik0;
      // 0c4: getstatic l9p._ee [L_ss;
      // 0c7: iload 7
      // 0c9: aaload
      // 0ca: invokevirtual ik0.zgq (L_ss;)I
      // 0cd: iload 3
      // 0ce: ifne 0e7
      // 0d1: goto 0d8
      // 0d4: invokestatic f3x$uzf.a (Loov;)Loov;
      // 0d7: athrow
      // 0d8: ifle 0e5
      // 0db: goto 0e2
      // 0de: invokestatic f3x$uzf.a (Loov;)Loov;
      // 0e1: athrow
      // 0e2: bipush 1
      // 0e3: istore 6
      // 0e5: iload 6
      // 0e7: iload 3
      // 0e8: ifne 107
      // 0eb: ifeq 108
      // 0ee: goto 0f5
      // 0f1: invokestatic f3x$uzf.a (Loov;)Loov;
      // 0f4: athrow
      // 0f5: aload 0
      // 0f6: getfield f3x$uzf._1h Ljava/util/List;
      // 0f9: aload 5
      // 0fb: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 100: goto 107
      // 103: invokestatic f3x$uzf.a (Loov;)Loov;
      // 106: athrow
      // 107: pop
      // 108: iload 3
      // 109: ifeq 020
      // 10c: aload 0
      // 10d: new f3x$uzf$1
      // 110: dup
      // 111: aload 0
      // 112: aload 1
      // 113: invokespecial f3x$uzf$1.<init> (Lf3x$uzf;Lf3x;)V
      // 116: putfield f3x$uzf.otn Ljava/util/Comparator;
      // 119: return
   }

   @Override
   public void xwh(int param1, int param2, jom param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 4
      // 005: aload 0
      // 006: iload 1
      // 007: iload 2
      // 008: aload 3
      // 009: invokespecial f3x$ssc.xwh (IILjom;)V
      // 00c: aload 0
      // 00d: iload 4
      // 00f: ifne 04c
      // 012: getfield f3x$uzf.d4i I
      // 015: ifne 044
      // 018: goto 01f
      // 01b: invokestatic f3x$uzf.a (Loov;)Loov;
      // 01e: athrow
      // 01f: aload 0
      // 020: getfield f3x$uzf.ahv Lf3x;
      // 023: iload 1
      // 024: bipush 115
      // 026: iadd
      // 027: bipush 18
      // 029: isub
      // 02a: bipush 1
      // 02b: iadd
      // 02c: iload 2
      // 02d: bipush 1
      // 02e: iadd
      // 02f: bipush 1
      // 030: iadd
      // 031: bipush 18
      // 033: bipush 18
      // 035: invokestatic f3x._e5 (Lf3x;IIII)V
      // 038: iload 4
      // 03a: ifeq 060
      // 03d: goto 044
      // 040: invokestatic f3x$uzf.a (Loov;)Loov;
      // 043: athrow
      // 044: aload 0
      // 045: goto 04c
      // 048: invokestatic f3x$uzf.a (Loov;)Loov;
      // 04b: athrow
      // 04c: getfield f3x$uzf.ahv Lf3x;
      // 04f: iload 1
      // 050: bipush 115
      // 052: iadd
      // 053: bipush 18
      // 055: isub
      // 056: iload 2
      // 057: bipush 1
      // 058: iadd
      // 059: bipush 18
      // 05b: bipush 18
      // 05d: invokestatic f3x._e5 (Lf3x;IIII)V
      // 060: aload 0
      // 061: iload 4
      // 063: ifne 0a2
      // 066: getfield f3x$uzf.d4i I
      // 069: bipush 1
      // 06a: if_icmpne 09a
      // 06d: goto 074
      // 070: invokestatic f3x$uzf.a (Loov;)Loov;
      // 073: athrow
      // 074: aload 0
      // 075: getfield f3x$uzf.ahv Lf3x;
      // 078: iload 1
      // 079: sipush 165
      // 07c: iadd
      // 07d: bipush 18
      // 07f: isub
      // 080: bipush 1
      // 081: iadd
      // 082: iload 2
      // 083: bipush 1
      // 084: iadd
      // 085: bipush 1
      // 086: iadd
      // 087: bipush 36
      // 089: bipush 18
      // 08b: invokestatic f3x._e5 (Lf3x;IIII)V
      // 08e: iload 4
      // 090: ifeq 0b7
      // 093: goto 09a
      // 096: invokestatic f3x$uzf.a (Loov;)Loov;
      // 099: athrow
      // 09a: aload 0
      // 09b: goto 0a2
      // 09e: invokestatic f3x$uzf.a (Loov;)Loov;
      // 0a1: athrow
      // 0a2: getfield f3x$uzf.ahv Lf3x;
      // 0a5: iload 1
      // 0a6: sipush 165
      // 0a9: iadd
      // 0aa: bipush 18
      // 0ac: isub
      // 0ad: iload 2
      // 0ae: bipush 1
      // 0af: iadd
      // 0b0: bipush 36
      // 0b2: bipush 18
      // 0b4: invokestatic f3x._e5 (Lf3x;IIII)V
      // 0b7: aload 0
      // 0b8: iload 4
      // 0ba: ifne 0f9
      // 0bd: getfield f3x$uzf.d4i I
      // 0c0: bipush 2
      // 0c1: if_icmpne 0f1
      // 0c4: goto 0cb
      // 0c7: invokestatic f3x$uzf.a (Loov;)Loov;
      // 0ca: athrow
      // 0cb: aload 0
      // 0cc: getfield f3x$uzf.ahv Lf3x;
      // 0cf: iload 1
      // 0d0: sipush 215
      // 0d3: iadd
      // 0d4: bipush 18
      // 0d6: isub
      // 0d7: bipush 1
      // 0d8: iadd
      // 0d9: iload 2
      // 0da: bipush 1
      // 0db: iadd
      // 0dc: bipush 1
      // 0dd: iadd
      // 0de: bipush 54
      // 0e0: bipush 18
      // 0e2: invokestatic f3x._e5 (Lf3x;IIII)V
      // 0e5: iload 4
      // 0e7: ifeq 10e
      // 0ea: goto 0f1
      // 0ed: invokestatic f3x$uzf.a (Loov;)Loov;
      // 0f0: athrow
      // 0f1: aload 0
      // 0f2: goto 0f9
      // 0f5: invokestatic f3x$uzf.a (Loov;)Loov;
      // 0f8: athrow
      // 0f9: getfield f3x$uzf.ahv Lf3x;
      // 0fc: iload 1
      // 0fd: sipush 215
      // 100: iadd
      // 101: bipush 18
      // 103: isub
      // 104: iload 2
      // 105: bipush 1
      // 106: iadd
      // 107: bipush 54
      // 109: bipush 18
      // 10b: invokestatic f3x._e5 (Lf3x;IIII)V
      // 10e: return
   }

   @Override
   public void drawSlot(int var1, int var2, int var3, int var4, int var5, int var6) {
      rlk var8 = this.ak8(var1);
      int var10000 = OpaquePredicate.b();
      u7m var9 = var8.u3i();
      f3x.y8f(this.ahv, var2 + 40, var3, var9);
      int var10 = u7m._lo(var9);
      int var7 = var10000;

      _ss var10001;
      int var10002;
      int var10003;
      int var10004;
      label56: {
         label55: {
            try {
               var14 = this;
               var10001 = l9p._ee[var10];
               var10002 = var2 + 115;
               var10003 = var3;
               var10004 = var1 % 2;
               if (var7 == 0) {
                  break label56;
               }

               if (var10004 == 0) {
                  break label55;
               }
            } catch (oov var13) {
               throw a(var13);
            }

            var10004 = 0;
            break label56;
         }

         var10004 = 1;
      }

      label47: {
         label46: {
            try {
               var14.v4c(var10001, var10002, var10003, (boolean)var10004);
               var15 = this;
               var10001 = l9p.foo[var10];
               var10002 = var2 + 165;
               var10003 = var3;
               var10004 = var1 % 2;
               if (var7 == 0) {
                  break label47;
               }

               if (var10004 == 0) {
                  break label46;
               }
            } catch (oov var12) {
               throw a(var12);
            }

            var10004 = 0;
            break label47;
         }

         var10004 = 1;
      }

      label38: {
         label37: {
            try {
               var15.v4c(var10001, var10002, var10003, (boolean)var10004);
               var16 = this;
               var10001 = var8;
               var10002 = var2 + 215;
               var10003 = var3;
               var10004 = var1 % 2;
               if (var7 == 0) {
                  break label38;
               }

               if (var10004 == 0) {
                  break label37;
               }
            } catch (oov var11) {
               throw a(var11);
            }

            var10004 = 0;
            break label38;
         }

         var10004 = 1;
      }

      var16.v4c(var10001, var10002, var10003, (boolean)var10004);
   }

   @Override
   public String g30(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic f3x$uzf.a J
      // 03: ldc2_w 124251528315765
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 4
      // 0d: iload 1
      // 0e: iload 4
      // 10: ifne 33
      // 13: ifne 32
      // 16: goto 1d
      // 19: invokestatic f3x$uzf.a (Loov;)Loov;
      // 1c: athrow
      // 1d: sipush 21585
      // 20: ldc2_w 1416962044664066052
      // 23: lload 2
      // 24: lxor
      // 25: invokedynamic y (IJ)Ljava/lang/String; bsm=f3x$uzf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a: nop
      // 2b: goto 5a
      // 2e: invokestatic f3x$uzf.a (Loov;)Loov;
      // 31: athrow
      // 32: iload 1
      // 33: bipush 1
      // 34: if_icmpne 4c
      // 37: sipush 24873
      // 3a: ldc2_w 3119029587632260478
      // 3d: lload 2
      // 3e: lxor
      // 3f: invokedynamic y (IJ)Ljava/lang/String; bsm=f3x$uzf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: nop
      // 45: goto 5a
      // 48: invokestatic f3x$uzf.a (Loov;)Loov;
      // 4b: athrow
      // 4c: sipush 6689
      // 4f: ldc2_w 3546412657487314551
      // 52: lload 2
      // 53: lxor
      // 54: invokedynamic y (IJ)Ljava/lang/String; bsm=f3x$uzf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59: nop
      // 5a: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(5838684037980906379L, 4573734638745998633L, MethodHandles.lookup().lookupClass()).a(281210226617730L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 40856776450619L;
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
      String var6 = "\u0004åÑ$ÙmWÏçs\u0018\u0002m\u007f+ù.2\u0015ç#ø¸- R\u009f\rÓ\u008a\rMÎö\u0006.vÎ°$-UÔ;/Ú\u0090)@Íq=9ãHi&\u0018(1ý.\u001fM¹\u0004¸\u009e4\u008f¨¾þ\u009aÎÊ$þ®2\u009b¯";
      int var8 = "\u0004åÑ$ÙmWÏçs\u0018\u0002m\u007f+ù.2\u0015ç#ø¸- R\u009f\rÓ\u008a\rMÎö\u0006.vÎ°$-UÔ;/Ú\u0090)@Íq=9ãHi&\u0018(1ý.\u001fM¹\u0004¸\u009e4\u008f¨¾þ\u009aÎÊ$þ®2\u009b¯"
         .length();
      char var5 = 24;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = b(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            f = var9;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5557;
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
            throw new RuntimeException("f3x$uzf", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = f[var5].getBytes("ISO-8859-1");
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
         throw new RuntimeException("f3x$uzf" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
