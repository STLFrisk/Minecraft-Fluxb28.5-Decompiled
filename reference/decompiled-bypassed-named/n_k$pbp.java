import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum n_k$pbp {
   public static final n_k$pbp c_c;
   public static final n_k$pbp f1s;
   public static final n_k$pbp byu;
   public static final n_k$pbp nw4;
   public static final n_k$pbp t39;
   public final int zz2;
   public final String npc;
   private static final n_k$pbp[] xug;

   private n_k$pbp(int var3, String var4) {
      this.zz2 = var3;
      this.npc = var4;
   }

   public int yo4() {
      return this.zz2;
   }

   public String b89() {
      return this.npc;
   }

   public static String[] yqz() {
      String[] var1 = new String[values().length];
      int var10000 = OpaquePredicate.c();
      int var2 = 0;
      int var0 = var10000;
      n_k$pbp[] var3 = values();
      int var4 = var3.length;
      int var5 = 0;

      while (true) {
         if (var5 < var4) {
            n_k$pbp var6 = var3[var5];

            try {
               var8 = var1;
               if (var0 != 0) {
                  break;
               }

               var1[var2++] = var6.b89();
               var5++;
               if (var0 == 0) {
                  continue;
               }
            } catch (oov var7) {
               throw a(var7);
            }
         }

         var8 = var1;
         break;
      }

      return var8;
   }

   public static n_k$pbp b_7(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic n_k$pbp.values ()[Ln_k$pbp;
      // 03: astore 2
      // 04: invokestatic OpaquePredicate.b ()I
      // 07: aload 2
      // 08: arraylength
      // 09: istore 3
      // 0a: istore 1
      // 0b: bipush 0
      // 0c: istore 4
      // 0e: iload 4
      // 10: iload 3
      // 11: if_icmpge 3f
      // 14: aload 2
      // 15: iload 4
      // 17: aaload
      // 18: astore 5
      // 1a: iload 1
      // 1b: ifeq 3b
      // 1e: aload 5
      // 20: invokevirtual n_k$pbp.b89 ()Ljava/lang/String;
      // 23: aload 0
      // 24: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 27: ifeq 38
      // 2a: goto 31
      // 2d: invokestatic n_k$pbp.a (Loov;)Loov;
      // 30: athrow
      // 31: aload 5
      // 33: areturn
      // 34: invokestatic n_k$pbp.a (Loov;)Loov;
      // 37: athrow
      // 38: iinc 4 1
      // 3b: iload 1
      // 3c: ifne 0e
      // 3f: aconst_null
      // 40: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(8574047004363255554L, -4897149154797844477L, MethodHandles.lookup().lookupClass()).a(4446834335595L);
      // $VF: monitorexit
      long var10 = var10000 ^ 128857589996265L;
      Cipher var1;
      Cipher var14 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var14.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[10];
      int var6 = 0;
      String var5 = "iº\u0000*WÂ\u00ad;àÐWµNe¢¸\u0010\u0013å¬¦8\u0000Çì++võ\u008cÕ¢\u007f\u0010.\u0086\u00818o\u008c\bµfIs\u008aS*Àâ\u0010h\u000f\u008fyÌ\u0091Tæ\u0092xº-\u0081-\u0092Á\u0018\u0013å¬¦8\u0000ÇìNÔá^n\u001cg%µ\u0098\u008d³_\u007f*\u0086\u0010ü«\u0018\u0095°/b¤²\u008b\u0099Ä\u00932ïæ\u0018h\u000f\u008fyÌ\u0091Tæ\u0004èDã\u0015\t:\u0094|Îò\u0081Ë\u0095dý\u0010\u0013å¬¦8\u0000Çìµ\u000f\u0011\u0096\u001a'þ\u0094";
      int var7 = "iº\u0000*WÂ\u00ad;àÐWµNe¢¸\u0010\u0013å¬¦8\u0000Çì++võ\u008cÕ¢\u007f\u0010.\u0086\u00818o\u008c\bµfIs\u008aS*Àâ\u0010h\u000f\u008fyÌ\u0091Tæ\u0092xº-\u0081-\u0092Á\u0018\u0013å¬¦8\u0000ÇìNÔá^n\u001cg%µ\u0098\u008d³_\u007f*\u0086\u0010ü«\u0018\u0095°/b¤²\u008b\u0099Ä\u00932ïæ\u0018h\u000f\u008fyÌ\u0091Tæ\u0004èDã\u0015\t:\u0094|Îò\u0081Ë\u0095dý\u0010\u0013å¬¦8\u0000Çìµ\u000f\u0011\u0096\u001a'þ\u0094"
         .length();
      char var4 = 16;
      int var13 = -1;

      label27:
      while (true) {
         String var15 = var5.substring(++var13, var13 + var4);
         byte var10001 = -1;

         while (true) {
            byte[] var9 = var1.doFinal(var15.getBytes("ISO-8859-1"));
            String var21 = a(var9).intern();
            switch (var10001) {
               case 0:
                  var8[var6++] = var21;
                  if ((var13 += var4) >= var7) {
                     c_c = new n_k$pbp(0, var8[2]);
                     f1s = new n_k$pbp(1, var8[9]);
                     byu = new n_k$pbp(2, var8[6]);
                     nw4 = new n_k$pbp(3, var8[3]);
                     t39 = new n_k$pbp(4, var8[5]);
                     xug = new n_k$pbp[]{c_c, f1s, byu, nw4, t39};
                     return;
                  }

                  var4 = var5.charAt(var13);
                  break;
               default:
                  var8[var6++] = var21;
                  if ((var13 += var4) < var7) {
                     var4 = var5.charAt(var13);
                     continue label27;
                  }

                  var5 = "Û\u0010\u0016\u0089?\u008e\u0015§È\u0015XöVûÏ\u000b\u0010h\u000f\u008fyÌ\u0091Tæ2c\u009e/QÄn&";
                  var7 = "Û\u0010\u0016\u0089?\u008e\u0015§È\u0015XöVûÏ\u000b\u0010h\u000f\u008fyÌ\u0091Tæ2c\u009e/QÄn&".length();
                  var4 = 16;
                  var13 = -1;
            }

            var15 = var5.substring(++var13, var13 + var4);
            var10001 = 0;
         }
      }
   }

   private static oov a(oov var0) {
      return var0;
   }

   private static String a(byte[] var0) {
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
