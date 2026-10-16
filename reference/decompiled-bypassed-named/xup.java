import com.google.common.base.Optional;
import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandles;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.optifine.reflect.Reflector;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector3f;

public enum xup implements vh8, yct {
   public static final xup qjk;
   public static final xup zmk;
   public static final xup p_q;
   public static final xup cst;
   public static final xup exc;
   public static final xup hj4;
   public static final xup xxy;
   public static final xup rs7;
   public static final xup oi1;
   public static final xup ej1;
   public static final xup ktg;
   public static final xup sef;
   public static final xup wrb;
   public static final xup j0s;
   public static final xup dkf;
   public static final xup f3j;
   private static final Map slr;
   private final int xo3;
   private final Matrix4f zsz;
   private final int izn;
   private final int icp;
   private static final xup[] FriendManager;

   private static int y9e(int var0, int var1) {
      return var0 * 360 + var1;
   }

   private xup(int var3, int var4) {
      this.xo3 = y9e(var3, var4);
      this.zsz = new Matrix4f();
      Matrix4f var5 = new Matrix4f();
      var5.setIdentity();
      Matrix4f.rotate((float)(-var3) * (float) (Math.PI / 180.0), new Vector3f(1.0F, 0.0F, 0.0F), var5, var5);
      this.izn = fe6.z1m(var3 / 90);
      Matrix4f var6 = new Matrix4f();
      var6.setIdentity();
      Matrix4f.rotate((float)(-var4) * (float) (Math.PI / 180.0), new Vector3f(0.0F, 1.0F, 0.0F), var6, var6);
      this.icp = fe6.z1m(var4 / 90);
      Matrix4f.mul(var6, var5, this.zsz);
   }

   public Matrix4f hz2() {
      return this.zsz;
   }

   public vt2 tzi(vt2 var1) {
      vt2 var3 = var1;
      int var10000 = OpaquePredicate.b();
      int var4 = 0;
      int var2 = var10000;

      while (true) {
         if (var4 < this.izn) {
            var3 = var3.mqm(vt2$y0s.wvd);

            try {
               var4++;
               if (var2 == 0) {
                  break;
               }

               if (var2 != 0) {
                  continue;
               }
            } catch (oov var6) {
               throw a(var6);
            }
         }

         try {
            if (var2 == 0) {
               return var3;
            }

            if (var3.e30() == vt2$y0s.abn) {
               break;
            }
         } catch (oov var5) {
            throw a(var5);
         }

         var4 = 0;

         while (var4 < this.icp) {
            vt2 var8 = var3.mqm(vt2$y0s.abn);
            if (var2 == 0) {
               return var8;
            }

            var3 = var8;
            var4++;
            if (var2 == 0) {
               return var3;
            }
         }

         return var3;
      }

      return var3;
   }

   public int d04(vt2 var1, int var2) {
      int var3 = OpaquePredicate.b();
      int var4 = var2;

      vt2 var10000;
      label43: {
         label42: {
            try {
               var10000 = var1;
               if (var3 == 0) {
                  break label43;
               }

               if (var1.e30() != vt2$y0s.wvd) {
                  break label42;
               }
            } catch (oov var8) {
               throw a(var8);
            }

            var4 = (var2 + this.izn) % 4;
         }

         var10000 = var1;
      }

      vt2 var5 = var10000;
      int var6 = 0;

      while (true) {
         if (var6 < this.izn) {
            var5 = var5.mqm(vt2$y0s.wvd);

            try {
               var6++;
               if (var3 == 0) {
                  break;
               }

               if (var3 != 0) {
                  continue;
               }
            } catch (oov var7) {
               throw a(var7);
            }
         }

         if (var5.e30() == vt2$y0s.abn) {
            var4 = (var4 + this.icp) % 4;
         }
         break;
      }

      return var4;
   }

   public static xup oqj(int var0, int var1) {
      return (xup)slr.get(y9e(fe6.ba6(var0, 360), fe6.ba6(var1, 360)));
   }

   @Override
   public Optional d8v(Optional var1) {
      return (Optional)Reflector.call(Reflector.ForgeHooksClient_applyTransform, new Object[]{this.e5c(), var1});
   }

   @Override
   public krg e5c() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: getstatic net/optifine/reflect/Reflector.ForgeHooksClient_getMatrix Lnet/optifine/reflect/ReflectorMethod;
      // 07: iload 1
      // 08: ifne 2d
      // 0b: invokevirtual net/optifine/reflect/ReflectorMethod.exists ()Z
      // 0e: ifeq 33
      // 11: goto 18
      // 14: invokestatic xup.a (Loov;)Loov;
      // 17: athrow
      // 18: getstatic net/optifine/reflect/Reflector.ForgeHooksClient_getMatrix Lnet/optifine/reflect/ReflectorMethod;
      // 1b: bipush 1
      // 1c: anewarray 52
      // 1f: dup
      // 20: bipush 0
      // 21: aload 0
      // 22: aastore
      // 23: invokestatic net/optifine/reflect/Reflector.call (Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)Ljava/lang/Object;
      // 26: goto 2d
      // 29: invokestatic xup.a (Loov;)Loov;
      // 2c: athrow
      // 2d: checkcast krg
      // 30: goto 3a
      // 33: new krg
      // 36: dup
      // 37: invokespecial krg.<init> ()V
      // 3a: areturn
   }

   @Override
   public vt2 g7r(vt2 var1) {
      return this.tzi(var1);
   }

   @Override
   public int b8i(vt2 var1, int var2) {
      return this.d04(var1, var2);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3740196982256696507L, 4670498425395576841L, MethodHandles.lookup().lookupClass()).a(179099526390557L);
      // $VF: monitorexit
      long var10 = var10000 ^ 73778326579142L;
      Cipher var1;
      Cipher var18 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var18.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[16];
      int var6 = 0;
      String var5 = "z \u009e\u001e\u0002\u0089\u0001~\b!Yç\u008fWf\u0004l\u0010O\u0099ÙmKù\u000e\u0014\u009cíïþÄs\u0002\u009f\u0010BH\u001eÖY)õ\u008fÖûÛ\u009dÌ\u000b!!\b \u0011\u009c¹ÚöÞ!\bZ\nt¼4\u0082¼\u009b\bÁ\u008c§\u007f\u001a\u0019yü\u0010¼6ûËG\u0094\u0090T\u0012C\u0017×ý?\u0018;\u0010ÖÉ{¦\u0085¼kóZv¶£\u0085dvç\b\"ä\u001dÌ\u0097\u0092&«\u0010oàÄ\u0000\u009anîm!\u0095&H´>×D\u0010)\u008e1®\u0005\u0085-\u000fÜ\n2nC¶\u0006\u008e\b\u0096\u0013-`)ß\u0081Â\bÄm\u00ad\"\u0085\u008ddÁ";
      int var7 = "z \u009e\u001e\u0002\u0089\u0001~\b!Yç\u008fWf\u0004l\u0010O\u0099ÙmKù\u000e\u0014\u009cíïþÄs\u0002\u009f\u0010BH\u001eÖY)õ\u008fÖûÛ\u009dÌ\u000b!!\b \u0011\u009c¹ÚöÞ!\bZ\nt¼4\u0082¼\u009b\bÁ\u008c§\u007f\u001a\u0019yü\u0010¼6ûËG\u0094\u0090T\u0012C\u0017×ý?\u0018;\u0010ÖÉ{¦\u0085¼kóZv¶£\u0085dvç\b\"ä\u001dÌ\u0097\u0092&«\u0010oàÄ\u0000\u009anîm!\u0095&H´>×D\u0010)\u008e1®\u0005\u0085-\u000fÜ\n2nC¶\u0006\u008e\b\u0096\u0013-`)ß\u0081Â\bÄm\u00ad\"\u0085\u008ddÁ"
         .length();
      char var4 = '\b';
      int var17 = -1;

      label37:
      while (true) {
         String var19 = var5.substring(++var17, var17 + var4);
         byte var10001 = -1;

         while (true) {
            byte[] var9 = var1.doFinal(var19.getBytes("ISO-8859-1"));
            String var25 = a(var9).intern();
            switch (var10001) {
               case 0:
                  var8[var6++] = var25;
                  if ((var17 += var4) >= var7) {
                     qjk = new xup(0, 0);
                     zmk = new xup(0, 90);
                     p_q = new xup(0, 180);
                     cst = new xup(0, 270);
                     exc = new xup(90, 0);
                     hj4 = new xup(90, 90);
                     xxy = new xup(90, 180);
                     rs7 = new xup(90, 270);
                     oi1 = new xup(180, 0);
                     ej1 = new xup(180, 90);
                     ktg = new xup(180, 180);
                     sef = new xup(180, 270);
                     wrb = new xup(270, 0);
                     j0s = new xup(270, 90);
                     dkf = new xup(270, 180);
                     f3j = new xup(270, 270);
                     FriendManager = new xup[]{qjk, zmk, p_q, cst, exc, hj4, xxy, rs7, oi1, ej1, ktg, sef, wrb, j0s, dkf, f3j};
                     slr = Maps.newHashMap();

                     for (xup var15 : values()) {
                        slr.put(var15.xo3, var15);
                     }

                     return;
                  }

                  var4 = var5.charAt(var17);
                  break;
               default:
                  var8[var6++] = var25;
                  if ((var17 += var4) < var7) {
                     var4 = var5.charAt(var17);
                     continue label37;
                  }

                  var5 = "\u0007\u0095E>¯\u0086¥gÀÖSªÛ\u0084sz\u0010æ\u0004ÀÈXÚÍ\u0093¡¦¬\u0004u¶ÑM";
                  var7 = "\u0007\u0095E>¯\u0086¥gÀÖSªÛ\u0084sz\u0010æ\u0004ÀÈXÚÍ\u0093¡¦¬\u0004u¶ÑM".length();
                  var4 = 16;
                  var17 = -1;
            }

            var19 = var5.substring(++var17, var17 + var4);
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
