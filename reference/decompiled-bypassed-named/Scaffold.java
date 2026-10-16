import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class Scaffold extends Module {
   public static BooleanSetting yqi;
   public static BooleanSetting aax;
   public static BooleanSetting xor;
   public static BooleanSetting _ez;
   public static float lay;
   public static List gxj;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public Scaffold() {
      long var1 = a ^ 21120072105313L;
      super(b<"j">(12508, 2427255213808415036L ^ var1), _aj.y49, true, new SubEngine[]{new a9u(), new jc0(), new zv4(), new a59(), new rft()});
      gxj = Arrays.asList(ox_.ibw, ox_.gdz, ox_.whp, ox_.ska, ox_.dr2);
   }

   @EventHandler
   public void prn(Event var1) {
      lay = var1.uto;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   @EventHandler
   public void cbe(b5k var1) {
      int var2 = OpaquePredicate.c();
      if (aax.g7m()) {
         mew var3 = new mew(ek1.vg8).eve();

         label175: {
            vt2 var10000;
            vt2 var10001;
            label193: {
               label176: {
                  try {
                     var10000 = ek1.vg8.u0f();
                     var10001 = vt2.z9q;
                     if (var2 != 0) {
                        break label193;
                     }

                     if (var10000 != vt2.z9q) {
                        break label176;
                     }
                  } catch (oov var25) {
                     throw a(var25);
                  }

                  var3 = var3.idu();

                  try {
                     if (var2 == 0) {
                        break label175;
                     }
                  } catch (oov var24) {
                     boolean var31 = false;
                     throw a(var24);
                  }
               }

               try {
                  var10000 = ek1.vg8.u0f();
                  var10001 = vt2.mxp;
               } catch (oov var23) {
                  boolean var32 = false;
                  throw a(var23);
               }
            }

            label194: {
               label177: {
                  try {
                     if (var2 != 0) {
                        break label194;
                     }

                     if (var10000 != var10001) {
                        break label177;
                     }
                  } catch (oov var22) {
                     throw a(var22);
                  }

                  var3 = var3.z6x();

                  try {
                     if (var2 == 0) {
                        break label175;
                     }
                  } catch (oov var21) {
                     boolean var33 = false;
                     throw a(var21);
                  }
               }

               try {
                  var10000 = ek1.vg8.u0f();
                  var10001 = vt2.te4;
               } catch (oov var20) {
                  boolean var34 = false;
                  throw a(var20);
               }
            }

            label195: {
               label178: {
                  try {
                     if (var2 != 0) {
                        break label195;
                     }

                     if (var10000 != var10001) {
                        break label178;
                     }
                  } catch (oov var19) {
                     throw a(var19);
                  }

                  var3 = var3.y8e();

                  try {
                     if (var2 == 0) {
                        break label175;
                     }
                  } catch (oov var18) {
                     boolean var35 = false;
                     throw a(var18);
                  }
               }

               try {
                  var10000 = ek1.vg8.u0f();
                  var10001 = vt2.zk4;
               } catch (oov var17) {
                  boolean var36 = false;
                  throw a(var17);
               }
            }

            label196: {
               label179: {
                  try {
                     if (var2 != 0) {
                        break label196;
                     }

                     if (var10000 != var10001) {
                        break label179;
                     }
                  } catch (oov var16) {
                     throw a(var16);
                  }

                  var3 = var3.o_8();

                  try {
                     if (var2 == 0) {
                        break label175;
                     }
                  } catch (oov var15) {
                     boolean var37 = false;
                     throw a(var15);
                  }
               }

               try {
                  var10000 = ek1.vg8.u0f();
                  var10001 = vt2.rf3;
               } catch (oov var14) {
                  boolean var38 = false;
                  throw a(var14);
               }
            }

            label197: {
               label180: {
                  try {
                     if (var2 != 0) {
                        break label197;
                     }

                     if (var10000 != var10001) {
                        break label180;
                     }
                  } catch (oov var13) {
                     throw a(var13);
                  }

                  var3 = var3.nuv();

                  try {
                     if (var2 == 0) {
                        break label175;
                     }
                  } catch (oov var12) {
                     boolean var39 = false;
                     throw a(var12);
                  }
               }

               try {
                  var10000 = ek1.vg8.u0f();
                  var10001 = vt2.m3r;
               } catch (oov var11) {
                  boolean var40 = false;
                  throw a(var11);
               }
            }

            if (var10000 == var10001) {
               var3 = var3.eve();
            }
         }

         double var4 = (double)var3.getX() - ek1.ibs().uok;
         double var6 = (double)var3.getY() - ek1.ibs().zmw;
         double var8 = (double)var3.getZ() - ek1.ibs().klp;

         try {
            if (ek1.tij.getBlockState(var3).r_y().ujd(ek1.tij, var3)) {
               hhf.m4t(var4, var6, var8, var4 + 1.0, var6 + 1.0, var8 + 1.0, 1.0F, 1.0F, 1.0F, 0.2F);
            }
         } catch (oov var10) {
            throw a(var10);
         }
      }
   }

   @EventHandler
   public void kes(Event var1) {
      long var2 = a ^ 114187354418572L;

      try {
         if (_ez.g7m()) {
            this.disable();
            zet.gn0(b<"j">(5740, 14515055722678115L ^ var2), this.m2d() + b<"j">(12835, 7922472223996601135L ^ var2), jgv$vro.h_d);
         }
      } catch (oov var4) {
         throw a(var4);
      }
   }

   public static boolean unh(erg param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 1a
      // 09: ifnonnull 19
      // 0c: goto 13
      // 0f: invokestatic Scaffold.a (Loov;)Loov;
      // 12: athrow
      // 13: bipush 0
      // 14: ireturn
      // 15: invokestatic Scaffold.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield erg.qd2 I
      // 1d: iload 1
      // 1e: ifeq 43
      // 21: ifgt 31
      // 24: goto 2b
      // 27: invokestatic Scaffold.a (Loov;)Loov;
      // 2a: athrow
      // 2b: bipush 0
      // 2c: ireturn
      // 2d: invokestatic Scaffold.a (Loov;)Loov;
      // 30: athrow
      // 31: aload 0
      // 32: invokevirtual erg.gn1 ()Lu7m;
      // 35: iload 1
      // 36: ifeq 50
      // 39: instanceof gun
      // 3c: goto 43
      // 3f: invokestatic Scaffold.a (Loov;)Loov;
      // 42: athrow
      // 43: ifne 4c
      // 46: bipush 0
      // 47: ireturn
      // 48: invokestatic Scaffold.a (Loov;)Loov;
      // 4b: athrow
      // 4c: aload 0
      // 4d: invokevirtual erg.gn1 ()Lu7m;
      // 50: checkcast gun
      // 53: astore 2
      // 54: aload 2
      // 55: invokevirtual gun.kpo ()Le0x;
      // 58: getstatic ox_.fzi Le0x;
      // 5b: if_acmpne 64
      // 5e: bipush 1
      // 5f: ireturn
      // 60: invokestatic Scaffold.a (Loov;)Loov;
      // 63: athrow
      // 64: getstatic rft.ly3 Ljava/util/List;
      // 67: aload 0
      // 68: invokevirtual erg.gn1 ()Lu7m;
      // 6b: invokestatic e0x.p69 (Lu7m;)Le0x;
      // 6e: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 73: iload 1
      // 74: ifeq 8e
      // 77: ifeq 87
      // 7a: goto 81
      // 7d: invokestatic Scaffold.a (Loov;)Loov;
      // 80: athrow
      // 81: bipush 0
      // 82: ireturn
      // 83: invokestatic Scaffold.a (Loov;)Loov;
      // 86: athrow
      // 87: aload 2
      // 88: invokevirtual gun.kpo ()Le0x;
      // 8b: invokevirtual e0x.z4c ()Z
      // 8e: iload 1
      // 8f: ifeq a3
      // 92: ifne a2
      // 95: goto 9c
      // 98: invokestatic Scaffold.a (Loov;)Loov;
      // 9b: athrow
      // 9c: bipush 0
      // 9d: ireturn
      // 9e: invokestatic Scaffold.a (Loov;)Loov;
      // a1: athrow
      // a2: bipush 1
      // a3: ireturn
   }

   public int tk9() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 0
      // 01: istore 2
      // 02: invokestatic OpaquePredicate.c ()I
      // 05: bipush 9
      // 07: istore 3
      // 08: istore 1
      // 09: iload 3
      // 0a: bipush 45
      // 0c: if_icmpge 50
      // 0f: aload 0
      // 10: pop
      // 11: getstatic Scaffold.ek1 Lc05;
      // 14: getfield Minecraft.vg8 Ll86;
      // 17: getfield EntityPlayerSP.fv9 L_jc;
      // 1a: iload 3
      // 1b: invokevirtual _jc.ajr (I)Lvrx;
      // 1e: invokevirtual vrx.x4s ()Lerg;
      // 21: astore 4
      // 23: iload 1
      // 24: ifne 4c
      // 27: aload 4
      // 29: invokestatic Scaffold.unh (Lerg;)Z
      // 2c: iload 1
      // 2d: ifne 51
      // 30: goto 37
      // 33: invokestatic Scaffold.a (Loov;)Loov;
      // 36: athrow
      // 37: ifeq 49
      // 3a: goto 41
      // 3d: invokestatic Scaffold.a (Loov;)Loov;
      // 40: athrow
      // 41: iload 2
      // 42: aload 4
      // 44: getfield erg.qd2 I
      // 47: iadd
      // 48: istore 2
      // 49: iinc 3 1
      // 4c: iload 1
      // 4d: ifeq 09
      // 50: iload 2
      // 51: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-9086064273023017508L, -1264201280350084467L, MethodHandles.lookup().lookupClass()).a(56674476290979L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 5406416832136L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[8];
      int var5 = 0;
      String var4 = "\u00150àt@¦É}*\u007fñ\u001bø¼q~w\u0097'\u0014\u0092\u0093\u0019û(|ÂK2\u001f\u0094\u0007\u0010ÖS~âLh\u00adþÔÔ}/\u008dÀ\u0085T ¡È\u001c\u0003\u009c<¼ÓX\u0095Éß\u000e³²\u0010µO¼\u001e\"\u0097J\u0012`Í\u0006¼\u00169Ãÿ\u0010\"<`q¯sE°èôA\u0005íË\u008fD µ½\u001féà=UfgØý)V¨@b\u0084\u0014éôìú\u009ad0AQN\u0090È\u0090ð(â\u0016Ñ\u0005\u001dÀc\u0097¬4<WNp~î\u000b\b1·\u00187NË\f\u008e,\u0015wRÍ\u008b®ÃÇÅ\u0012·Îã";
      int var6 = "\u00150àt@¦É}*\u007fñ\u001bø¼q~w\u0097'\u0014\u0092\u0093\u0019û(|ÂK2\u001f\u0094\u0007\u0010ÖS~âLh\u00adþÔÔ}/\u008dÀ\u0085T ¡È\u001c\u0003\u009c<¼ÓX\u0095Éß\u000e³²\u0010µO¼\u001e\"\u0097J\u0012`Í\u0006¼\u00169Ãÿ\u0010\"<`q¯sE°èôA\u0005íË\u008fD µ½\u001féà=UfgØý)V¨@b\u0084\u0014éôìú\u009ad0AQN\u0090È\u0090ð(â\u0016Ñ\u0005\u001dÀc\u0097¬4<WNp~î\u000b\b1·\u00187NË\f\u008e,\u0015wRÍ\u008b®ÃÇÅ\u0012·Îã"
         .length();
      char var3 = ' ';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     f = var7;
                     g = new String[8];
                     yqi = new BooleanSetting(b<"j">(24692, 6947905278456273531L ^ var9), b<"j">(11722, 9222894660551235520L ^ var9), true);
                     aax = new BooleanSetting(b<"j">(24692, 6947905278456273531L ^ var9), b<"j">(22358, 5280028495631494488L ^ var9), false);
                     xor = new BooleanSetting(b<"j">(24692, 6947905278456273531L ^ var9), b<"j">(12018, 2886373460875072766L ^ var9), true);
                     _ez = new BooleanSetting(b<"j">(24692, 6947905278456273531L ^ var9), b<"j">(18623, 5778715730196574898L ^ var9), true);
                     lay = 0.0F;
                     return;
                  }

                  var3 = var4.charAt(var12);
                  break;
               default:
                  var7[var5++] = var20;
                  if ((var12 += var3) < var6) {
                     var3 = var4.charAt(var12);
                     continue label27;
                  }

                  var4 = "'LÚÚð²}\u0092d`Æï\u009eùeÐ ê$\u0096WýÀ\u0087X²\u0007C\n²â)ú\u0014\u0088Jð\u0092Î¿Û\u0085#\u0093\u0004\u0015\u0089èX";
                  var6 = "'LÚÚð²}\u0092d`Æï\u009eùeÐ ê$\u0096WýÀ\u0087X²\u0007C\n²â)ú\u0014\u0088Jð\u0092Î¿Û\u0085#\u0093\u0004\u0015\u0089èX".length();
                  var3 = 16;
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31079;
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
            throw new RuntimeException("Scaffold", var10);
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
         throw new RuntimeException("Scaffold" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
