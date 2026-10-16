import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.commons.lang3.StringUtils;

public class iun$gy4 extends ed7 {
   public final iun j64;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public iun$gy4(iun var1, Minecraft var2) {
      super(var2, var1.dt7, var1.o1e, 32, var1.o1e - 64, 36);
      this.j64 = var1;
   }

   @Override
   public int getSize() {
      return iun.nvq(this.j64).size();
   }

   @Override
   public void elementClicked(int param1, boolean param2, int param3, int param4) {
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
      // 06: getfield iun$gy4.j64 Liun;
      // 09: iload 1
      // 0a: invokestatic iun.uaa (Liun;I)I
      // 0d: pop
      // 0e: aload 0
      // 0f: getfield iun$gy4.j64 Liun;
      // 12: invokestatic iun.qeb (Liun;)I
      // 15: iload 5
      // 17: ifeq 32
      // 1a: iflt 50
      // 1d: goto 24
      // 20: invokestatic iun$gy4.a (Loov;)Loov;
      // 23: athrow
      // 24: aload 0
      // 25: getfield iun$gy4.j64 Liun;
      // 28: invokestatic iun.qeb (Liun;)I
      // 2b: goto 32
      // 2e: invokestatic iun$gy4.a (Loov;)Loov;
      // 31: athrow
      // 32: iload 5
      // 34: ifeq 4d
      // 37: aload 0
      // 38: invokevirtual iun$gy4.getSize ()I
      // 3b: if_icmpge 50
      // 3e: goto 45
      // 41: invokestatic iun$gy4.a (Loov;)Loov;
      // 44: athrow
      // 45: bipush 1
      // 46: goto 4d
      // 49: invokestatic iun$gy4.a (Loov;)Loov;
      // 4c: athrow
      // 4d: goto 51
      // 50: bipush 0
      // 51: istore 6
      // 53: aload 0
      // 54: getfield iun$gy4.j64 Liun;
      // 57: invokestatic iun.nrp (Liun;)Lgt4;
      // 5a: iload 6
      // 5c: putfield gt4.c9a Z
      // 5f: aload 0
      // 60: getfield iun$gy4.j64 Liun;
      // 63: invokestatic iun.tlo (Liun;)Lgt4;
      // 66: iload 6
      // 68: putfield gt4.c9a Z
      // 6b: aload 0
      // 6c: getfield iun$gy4.j64 Liun;
      // 6f: invokestatic iun.ooe (Liun;)Lgt4;
      // 72: iload 6
      // 74: putfield gt4.c9a Z
      // 77: aload 0
      // 78: getfield iun$gy4.j64 Liun;
      // 7b: invokestatic iun.hqz (Liun;)Lgt4;
      // 7e: iload 6
      // 80: putfield gt4.c9a Z
      // 83: iload 2
      // 84: iload 5
      // 86: ifeq 95
      // 89: ifeq a7
      // 8c: goto 93
      // 8f: invokestatic iun$gy4.a (Loov;)Loov;
      // 92: athrow
      // 93: iload 6
      // 95: ifeq a7
      // 98: aload 0
      // 99: getfield iun$gy4.j64 Liun;
      // 9c: iload 1
      // 9d: invokevirtual iun.xsd (I)V
      // a0: goto a7
      // a3: invokestatic iun$gy4.a (Loov;)Loov;
      // a6: athrow
      // a7: return
   }

   @Override
   public boolean isSelected(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: iload 1
      // 05: iload 2
      // 06: ifne 22
      // 09: aload 0
      // 0a: getfield iun$gy4.j64 Liun;
      // 0d: invokestatic iun.qeb (Liun;)I
      // 10: if_icmpne 25
      // 13: goto 1a
      // 16: invokestatic iun$gy4.a (Loov;)Loov;
      // 19: athrow
      // 1a: bipush 1
      // 1b: goto 22
      // 1e: invokestatic iun$gy4.a (Loov;)Loov;
      // 21: athrow
      // 22: goto 26
      // 25: bipush 0
      // 26: ireturn
   }

   @Override
   public int getContentHeight() {
      return iun.nvq(this.j64).size() * 36;
   }

   @Override
   public void drawBackground() {
      this.j64.xmz();
   }

   @Override
   public void drawSlot(int var1, int var2, int var3, int var4, int var5, int var6) {
      long var7 = a ^ 83365570105187L;
      id4 var10 = (id4)iun.nvq(this.j64).get(var1);
      int var10000 = OpaquePredicate.c();
      String var11 = var10.ic0();
      int var9 = var10000;

      label61: {
         label60: {
            try {
               var19 = var11;
               if (var9 != 0) {
                  break label61;
               }

               if (!StringUtils.isEmpty(var11)) {
                  break label60;
               }
            } catch (oov var16) {
               throw a(var16);
            }

            var11 = iun.bpq(this.j64) + " " + (var1 + 1);
         }

         var19 = var10.e88();
      }

      String var12 = var19;
      var12 = var12 + a<"m">(25246, 4560761408388958534L ^ var7) + iun.z00(this.j64).format(new Date(var10.a7u()));
      var12 = var12 + ")";
      String var13 = "";

      label65: {
         label50: {
            label49: {
               try {
                  var20 = var10.fvv();
                  if (var9 != 0) {
                     break label50;
                  }

                  if (!var20) {
                     break label49;
                  }
               } catch (oov var15) {
                  throw a(var15);
               }

               var13 = iun.emz(this.j64) + " " + var13;
               if (var9 == 0) {
                  break label65;
               }
            }

            var13 = iun.yt2(this.j64)[var10.fgi().xzh()];
            var20 = var10._go();
         }

         label39: {
            label38: {
               try {
                  if (var9 != 0) {
                     break label39;
                  }

                  if (!var20) {
                     break label38;
                  }
               } catch (oov var14) {
                  throw a(var14);
               }

               var13 = syo.id3 + fc1.gx1(a<"m">(14422, 376043916470801292L ^ var7), new Object[0]) + syo.w29;
            }

            var20 = var10.jff();
         }

         if (var20) {
            var13 = var13 + a<"m">(5495, 6663966052801576622L ^ var7) + fc1.gx1(a<"m">(24701, 6679230396220607398L ^ var7), new Object[0]);
         }
      }

      this.j64.c_t(this.j64.fex, var11, var2 + 2, var3 + 1, 16777215);
      this.j64.c_t(this.j64.fex, var12, var2 + 2, var3 + 12, 8421504);
      this.j64.c_t(this.j64.fex, var13, var2 + 2, var3 + 12 + 10, 8421504);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6570700843876583747L, -1324898399052549215L, MethodHandles.lookup().lookupClass()).a(28200451292494L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 81021300630461L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[4];
      int var7 = 0;
      String var6 = "&B\u009bí¹\u0013\u009cL.Â\u009d óÔ\n\u001eÍc¨P8]\u0018\f\u0013l«\u0084[yù¢V¬\u0089\u008aÈÍ\u0085N(\u009cþ%é\u009e%ÜA\u008aÔú¹úÍ\u0092ñuXiÕ¨è£Ëºsã\u0088è0\u0098#\u0016ÇÉ±ÈÙºÛ";
      int var8 = "&B\u009bí¹\u0013\u009cL.Â\u009d óÔ\n\u001eÍc¨P8]\u0018\f\u0013l«\u0084[yù¢V¬\u0089\u008aÈÍ\u0085N(\u009cþ%é\u009e%ÜA\u008aÔú¹úÍ\u0092ñuXiÕ¨è£Ëºsã\u0088è0\u0098#\u0016ÇÉ±ÈÙºÛ"
         .length();
      char var5 = '(';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     b = var9;
                     c = new String[4];
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

                  var6 = "å6`\u0000\u0086¾Ï\u0015Êh\u0007ý¦ÈÃS\u0010¸7§\u0080\u009f\u000fç[\u001f\u0090\u0012\u0012]\u0082¬ä";
                  var8 = "å6`\u0000\u0086¾Ï\u0015Êh\u0007ý¦ÈÃS\u0010¸7§\u0080\u009f\u000fç[\u001f\u0090\u0012\u0012]\u0082¬ä".length();
                  var5 = 16;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23307;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("iun$gy4", var10);
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
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("iun$gy4" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
