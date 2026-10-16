import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import net.minecraft.tileentity.TileEntityDispenser;

public class ypi extends zfj$yuc {
   private erg ep7;
   private int r37;
   private int p80;

   public ypi(u7m var1, int var2, int var3, int var4, int var5) {
      super(var5);
      this.ep7 = new erg(var1, 1, var2);
      this.r37 = var3;
      this.p80 = var4;
   }

   public ypi(erg var1, int var2, int var3, int var4) {
      super(var4);
      this.ep7 = var1;
      this.r37 = var2;
      this.p80 = var3;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public static void hut(Random var0, List var1, rsi var2, int var3) {
      int var4 = OpaquePredicate.b();
      int var5 = 0;

      while (var5 < var3) {
         ypi var6 = (ypi)zfj.h82(var0, var1);
         int var7 = var6.r37 + var0.nextInt(var6.p80 - var6.r37 + 1);

         label63: {
            label72: {
               int var10000;
               label61: {
                  label73: {
                     try {
                        var10000 = var6.ep7.h4s();
                        if (var4 == 0) {
                           break label61;
                        }

                        if (var10000 < var7) {
                           break label73;
                        }
                     } catch (oov var13) {
                        throw a(var13);
                     }

                     erg var8 = var6.ep7.yaq();

                     try {
                        var8.qd2 = var7;
                        var2.cxl(var0.nextInt(var2.opt()), var8);
                        if (var4 != 0) {
                           break label72;
                        }
                     } catch (oov var12) {
                        boolean var10001 = false;
                        throw a(var12);
                     }
                  }

                  try {
                     var10000 = 0;
                  } catch (oov var10) {
                     boolean var16 = false;
                     throw a(var10);
                  }
               }

               int var14 = var10000;

               while (var14 < var7) {
                  erg var9 = var6.ep7.yaq();

                  try {
                     var9.qd2 = 1;
                     var2.cxl(var0.nextInt(var2.opt()), var9);
                     var14++;
                     if (var4 == 0) {
                        break label63;
                     }

                     if (var4 == 0) {
                        break;
                     }
                  } catch (oov var11) {
                     throw a(var11);
                  }
               }
            }

            var5++;
         }

         if (var4 == 0) {
            break;
         }
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public static void ow2(Random var0, List var1, TileEntityDispenser var2, int var3) {
      int var4 = OpaquePredicate.c();
      int var5 = 0;

      while (var5 < var3) {
         ypi var6 = (ypi)zfj.h82(var0, var1);
         int var7 = var6.r37 + var0.nextInt(var6.p80 - var6.r37 + 1);

         label63: {
            label72: {
               int var10000;
               label61: {
                  label73: {
                     try {
                        var10000 = var6.ep7.h4s();
                        if (var4 != 0) {
                           break label61;
                        }

                        if (var10000 < var7) {
                           break label73;
                        }
                     } catch (oov var13) {
                        throw a(var13);
                     }

                     erg var8 = var6.ep7.yaq();

                     try {
                        var8.qd2 = var7;
                        var2.cxl(var0.nextInt(var2.opt()), var8);
                        if (var4 == 0) {
                           break label72;
                        }
                     } catch (oov var12) {
                        boolean var10001 = false;
                        throw a(var12);
                     }
                  }

                  try {
                     var10000 = 0;
                  } catch (oov var10) {
                     boolean var16 = false;
                     throw a(var10);
                  }
               }

               int var14 = var10000;

               while (var14 < var7) {
                  erg var9 = var6.ep7.yaq();

                  try {
                     var9.qd2 = 1;
                     var2.cxl(var0.nextInt(var2.opt()), var9);
                     var14++;
                     if (var4 != 0) {
                        break label63;
                     }

                     if (var4 != 0) {
                        break;
                     }
                  } catch (oov var11) {
                     throw a(var11);
                  }
               }
            }

            var5++;
         }

         if (var4 != 0) {
            break;
         }
      }
   }

   public static List voc(List var0, ypi[] var1) {
      ArrayList var2 = Lists.newArrayList(var0);
      Collections.addAll(var2, var1);
      return var2;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
