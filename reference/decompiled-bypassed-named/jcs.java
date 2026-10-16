import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class jcs {
   private static final long a;
   private static final String b;

   public void k_i(Set var1) {
      int var2 = OpaquePredicate.b();

      for (vt2 var4 : var1) {
         Iterator var5 = var1.iterator();

         while (true) {
            if (var5.hasNext()) {
               vt2 var6 = (vt2)var5.next();
               this.xbn(var4, var6, true);
               if (var2 == 0) {
                  break;
               }

               if (var2 != 0) {
                  continue;
               }
            }

            if (var2 == 0) {
               return;
            }
            break;
         }
      }
   }

   public void xbn(vt2 var1, vt2 var2, boolean var3) {
      this.yva(var1.ordinal() + var2.ordinal() * c2c, var3);
      this.yva(var2.ordinal() + var1.ordinal() * c2c, var3);
   }

   public void f2e(boolean param1) {
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
      // 05: ifeq 1a
      // 08: aload 0
      // 09: ldc2_w -1
      // 0c: putfield jcs.szv J
      // 0f: iload 2
      // 10: ifeq 26
      // 13: goto 1a
      // 16: invokestatic jcs.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 0
      // 1b: lconst_0
      // 1c: putfield jcs.szv J
      // 1f: goto 26
      // 22: invokestatic jcs.a (Loov;)Loov;
      // 25: athrow
      // 26: return
   }

   public boolean mex(vt2 var1, vt2 var2) {
      return this.bv7(var1.ordinal() + var2.ordinal() * c2c);
   }

   @Override
   public String toString() {
      long var1 = a ^ 56572626751334L;
      StringBuilder var4 = new StringBuilder();
      int var10000 = OpaquePredicate.c();
      var4.append(' ');
      int var3 = var10000;
      vt2[] var5 = vt2.values();
      int var6 = var5.length;
      int var7 = 0;

      while (true) {
         if (var7 < var6) {
            vt2 var8 = var5[var7];

            try {
               var4.append(' ').append(var8.toString().toUpperCase().charAt(0));
               var7++;
               if (var3 != 0) {
                  break;
               }

               if (var3 == 0) {
                  continue;
               }
            } catch (oov var17) {
               throw a(var17);
            }
         }

         var4.append('\n');
         var5 = vt2.values();
         var6 = var5.length;
         break;
      }

      for (int var18 = 0; var18 < var6; var18++) {
         vt2 var20 = var5[var18];

         label84:
         while (true) {
            vt2 var19 = var20;
            StringBuilder var21 = var4.append(var19.toString().toUpperCase().charAt(0));
            if (var3 != 0) {
               return var21.toString();
            }

            vt2[] var9 = vt2.values();
            int var10 = var9.length;
            int var11 = 0;

            while (true) {
               if (var11 >= var10) {
                  break label84;
               }

               vt2 var12 = var9[var11];

               label107: {
                  label78: {
                     label77: {
                        try {
                           if (var3 != 0) {
                              break label77;
                           }

                           var20 = var19;
                           if (var3 != 0) {
                              break;
                           }
                        } catch (oov var16) {
                           throw a(var16);
                        }

                        try {
                           if (var20 != var12) {
                              break label78;
                           }

                           var4.append(b);
                        } catch (oov var15) {
                           throw a(var15);
                        }
                     }

                     if (var3 == 0) {
                        break label107;
                     }
                  }

                  byte var13 = this.mex(var19, var12);

                  char var10001;
                  label64: {
                     label63: {
                        try {
                           var22 = var4.append(' ');
                           var10001 = (char)var13;
                           if (var3 != 0) {
                              break label64;
                           }

                           if (var13 != 0) {
                              break label63;
                           }
                        } catch (oov var14) {
                           throw a(var14);
                        }

                        var10001 = 'n';
                        break label64;
                     }

                     var10001 = 'Y';
                  }

                  var22.append(var10001);
               }

               var11++;
               if (var3 != 0) {
                  break label84;
               }
            }
         }

         var4.append('\n');
         if (var3 != 0) {
            break;
         }
      }

      return var4.toString();
   }

   private boolean bv7(int var1) {
      int var2 = OpaquePredicate.c();

      try {
         long var4;
         int var10000 = (var4 = (this.szv & (long)(1 << var1)) - 0L) == 0L ? 0 : (var4 < 0L ? -1 : 1);
         if (var2 != 0) {
            return (boolean)var10000;
         }

         if (var10000) {
            return (boolean)1;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return (boolean)0;
   }

   private void yva(int param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: iload 2
      // 05: ifeq 18
      // 08: aload 0
      // 09: iload 1
      // 0a: invokespecial jcs.tgk (I)V
      // 0d: iload 3
      // 0e: ifne 24
      // 11: goto 18
      // 14: invokestatic jcs.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: iload 1
      // 1a: invokespecial jcs.k8f (I)V
      // 1d: goto 24
      // 20: invokestatic jcs.a (Loov;)Loov;
      // 23: athrow
      // 24: return
   }

   private void tgk(int var1) {
      this.szv |= (long)(1 << var1);
   }

   private void k8f(int var1) {
      this.szv &= (long)(~(1 << var1));
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8799475722848346937L, 6823242942610702781L, MethodHandles.lookup().lookupClass()).a(26729259870347L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 34589199580270L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("ää5\r!lâ,".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
      c2c = vt2.values().length;
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
