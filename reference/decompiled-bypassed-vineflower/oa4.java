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
import net.optifine.model.QuadBounds;
import net.optifine.reflect.Reflector;

public class oa4 implements d53 {
   public int[] osu;
   public final int hvb;
   public vt2 iqa;
   public sla zme;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public oa4(int[] var1, int var2, vt2 var3, sla var4) {
      this.osu = var1;
      this.hvb = var2;
      this.iqa = var3;
      this.zme = var4;
      this.hmg();
   }

   public oa4(int[] var1, int var2, vt2 var3) {
      this.osu = var1;
      this.hvb = var2;
      this.iqa = var3;
      this.hmg();
   }

   public sla enl() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield oa4.zme Lsla;
      // 08: iload 1
      // 09: ifeq 2c
      // 0c: ifnonnull 28
      // 0f: goto 16
      // 12: invokestatic oa4.b (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: aload 0
      // 18: invokevirtual oa4.fnb ()[I
      // 1b: invokestatic oa4.a68 ([I)Lsla;
      // 1e: putfield oa4.zme Lsla;
      // 21: goto 28
      // 24: invokestatic oa4.b (Loov;)Loov;
      // 27: athrow
      // 28: aload 0
      // 29: getfield oa4.zme Lsla;
      // 2c: areturn
   }

   public int[] fnb() {
      this.hmg();
      return this.osu;
   }

   public boolean k3w() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield oa4.hvb I
      // 08: iload 1
      // 09: ifeq 1f
      // 0c: bipush -1
      // 0d: if_icmpeq 22
      // 10: goto 17
      // 13: invokestatic oa4.b (Loov;)Loov;
      // 16: athrow
      // 17: bipush 1
      // 18: goto 1f
      // 1b: invokestatic oa4.b (Loov;)Loov;
      // 1e: athrow
      // 1f: goto 23
      // 22: bipush 0
      // 23: ireturn
   }

   public int m4h() {
      return this.hvb;
   }

   public vt2 fih() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield oa4.iqa Lvt2;
      // 08: iload 1
      // 09: ifne 2c
      // 0c: ifnonnull 28
      // 0f: goto 16
      // 12: invokestatic oa4.b (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: aload 0
      // 18: invokevirtual oa4.fnb ()[I
      // 1b: invokestatic atg.g9d ([I)Lvt2;
      // 1e: putfield oa4.iqa Lvt2;
      // 21: goto 28
      // 24: invokestatic oa4.b (Loov;)Loov;
      // 27: athrow
      // 28: aload 0
      // 29: getfield oa4.iqa Lvt2;
      // 2c: areturn
   }

   public int[] akn() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield oa4.ycl [I
      // 08: iload 1
      // 09: ifne 30
      // 0c: ifnonnull 2c
      // 0f: goto 16
      // 12: invokestatic oa4.b (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: aload 0
      // 18: invokevirtual oa4.fnb ()[I
      // 1b: aload 0
      // 1c: invokevirtual oa4.enl ()Lsla;
      // 1f: invokestatic oa4.wjj ([ILsla;)[I
      // 22: putfield oa4.ycl [I
      // 25: goto 2c
      // 28: invokestatic oa4.b (Loov;)Loov;
      // 2b: athrow
      // 2c: aload 0
      // 2d: getfield oa4.ycl [I
      // 30: areturn
   }

   private static int[] wjj(int[] var0, sla var1) {
      int[] var3 = (int[])var0.clone();
      int var10000 = t9d.c();
      int var4 = var3.length / 4;
      int var2 = var10000;
      int var5 = 0;

      while (true) {
         if (var5 < 4) {
            int var6 = var5 * var4;
            float var7 = Float.intBitsToFloat(var3[var6 + 4]);
            float var8 = Float.intBitsToFloat(var3[var6 + 4 + 1]);
            float var9 = var1.hs3(var7);
            float var10 = var1.nkj(var8);

            try {
               var3[var6 + 4] = Float.floatToRawIntBits(var9);
               var12 = var3;
               if (var2 != 0) {
                  break;
               }

               var3[var6 + 4 + 1] = Float.floatToRawIntBits(var10);
               var5++;
               if (var2 == 0) {
                  continue;
               }
            } catch (oov var11) {
               throw b(var11);
            }
         }

         var12 = var3;
         break;
      }

      return var12;
   }

   @Override
   public void my6(_lm var1) {
      Reflector.callVoid(Reflector.LightUtil_putBakedQuad, new Object[]{var1, this});
   }

   private static sla a68(int[] var0) {
      float var2 = 1.0F;
      int var10000 = t9d.c();
      float var3 = 1.0F;
      int var1 = var10000;
      float var4 = 0.0F;
      float var5 = 0.0F;
      int var6 = var0.length / 4;
      int var7 = 0;

      while (true) {
         if (var7 < 4) {
            int var8 = var7 * var6;
            float var9 = Float.intBitsToFloat(var0[var8 + 4]);
            float var10 = Float.intBitsToFloat(var0[var8 + 4 + 1]);
            var2 = Math.min(var2, var9);
            var3 = Math.min(var3, var10);
            var4 = Math.max(var4, var9);
            var13 = Math.max(var5, var10);
            if (var1 != 0) {
               break;
            }

            var5 = var13;
            var7++;
            if (var1 == 0) {
               continue;
            }
         }

         var13 = (var2 + var4) / 2.0F;
         break;
      }

      float var11 = var13;
      float var12 = (var3 + var5) / 2.0F;
      return c05.vz1().dd_().zd9((double)var11, (double)var12);
   }

   public void hmg() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: invokestatic hxt.ly3 ()Z
      // 07: iload 1
      // 08: ifne 5e
      // 0b: ifeq 47
      // 0e: goto 15
      // 11: invokestatic oa4.b (Loov;)Loov;
      // 14: athrow
      // 15: aload 0
      // 16: iload 1
      // 17: ifne 39
      // 1a: goto 21
      // 1d: invokestatic oa4.b (Loov;)Loov;
      // 20: athrow
      // 21: getfield oa4.osu [I
      // 24: arraylength
      // 25: bipush 28
      // 27: if_icmpne 75
      // 2a: goto 31
      // 2d: invokestatic oa4.b (Loov;)Loov;
      // 30: athrow
      // 31: aload 0
      // 32: goto 39
      // 35: invokestatic oa4.b (Loov;)Loov;
      // 38: athrow
      // 39: aload 0
      // 3a: getfield oa4.osu [I
      // 3d: invokestatic oa4.ttf ([I)[I
      // 40: putfield oa4.osu [I
      // 43: iload 1
      // 44: ifeq 75
      // 47: aload 0
      // 48: iload 1
      // 49: ifne 6b
      // 4c: goto 53
      // 4f: invokestatic oa4.b (Loov;)Loov;
      // 52: athrow
      // 53: getfield oa4.osu [I
      // 56: arraylength
      // 57: goto 5e
      // 5a: invokestatic oa4.b (Loov;)Loov;
      // 5d: athrow
      // 5e: bipush 56
      // 60: if_icmpne 75
      // 63: aload 0
      // 64: goto 6b
      // 67: invokestatic oa4.b (Loov;)Loov;
      // 6a: athrow
      // 6b: aload 0
      // 6c: getfield oa4.osu [I
      // 6f: invokestatic oa4.d_x ([I)[I
      // 72: putfield oa4.osu [I
      // 75: return
   }

   private static int[] ttf(int[] var0) {
      int var2 = var0.length / 4;
      int var3 = var2 * 2;
      int[] var4 = new int[var3 * 4];
      int var10000 = t9d.b();
      int var5 = 0;
      int var1 = var10000;

      while (true) {
         if (var5 < 4) {
            try {
               var7 = var0;
               if (var1 == 0) {
                  break;
               }

               System.arraycopy(var0, var5 * var2, var4, var5 * var3, var2);
               var5++;
               if (var1 != 0) {
                  continue;
               }
            } catch (oov var6) {
               throw b(var6);
            }
         }

         var7 = var4;
         break;
      }

      return var7;
   }

   private static int[] d_x(int[] var0) {
      int var2 = var0.length / 4;
      int var3 = var2 / 2;
      int var10000 = t9d.b();
      int[] var4 = new int[var3 * 4];
      int var5 = 0;
      int var1 = var10000;

      while (true) {
         if (var5 < 4) {
            try {
               var7 = var0;
               if (var1 == 0) {
                  break;
               }

               System.arraycopy(var0, var5 * var2, var4, var5 * var3, var3);
               var5++;
               if (var1 != 0) {
                  continue;
               }
            } catch (oov var6) {
               throw b(var6);
            }
         }

         var7 = var4;
         break;
      }

      return var7;
   }

   public QuadBounds lhq() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield oa4.t9t Lnet/optifine/model/QuadBounds;
      // 08: iload 1
      // 09: ifne 30
      // 0c: ifnonnull 2c
      // 0f: goto 16
      // 12: invokestatic oa4.b (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: new net/optifine/model/QuadBounds
      // 1a: dup
      // 1b: aload 0
      // 1c: invokevirtual oa4.fnb ()[I
      // 1f: invokespecial net/optifine/model/QuadBounds.<init> ([I)V
      // 22: putfield oa4.t9t Lnet/optifine/model/QuadBounds;
      // 25: goto 2c
      // 28: invokestatic oa4.b (Loov;)Loov;
      // 2b: athrow
      // 2c: aload 0
      // 2d: getfield oa4.t9t Lnet/optifine/model/QuadBounds;
      // 30: areturn
   }

   public float z_r() {
      QuadBounds var1 = this.lhq();
      return (var1.getMaxX() + var1.getMinX()) / 2.0F;
   }

   public double _u4() {
      QuadBounds var1 = this.lhq();
      return (double)((var1.getMaxY() + var1.getMinY()) / 2.0F);
   }

   public double lup() {
      QuadBounds var1 = this.lhq();
      return (double)((var1.getMaxZ() + var1.getMinZ()) / 2.0F);
   }

   public boolean nia() {
      QuadBounds var1 = this.lhq();
      return var1.isFaceQuad(this.iqa);
   }

   public boolean lft() {
      QuadBounds var1 = this.lhq();
      return var1.isFullQuad(this.iqa);
   }

   public boolean sqd() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: invokevirtual oa4.lft ()Z
      // 08: iload 1
      // 09: ifeq 21
      // 0c: ifeq 33
      // 0f: goto 16
      // 12: invokestatic oa4.b (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: invokevirtual oa4.nia ()Z
      // 1a: goto 21
      // 1d: invokestatic oa4.b (Loov;)Loov;
      // 20: athrow
      // 21: iload 1
      // 22: ifeq 30
      // 25: ifeq 33
      // 28: goto 2f
      // 2b: invokestatic oa4.b (Loov;)Loov;
      // 2e: athrow
      // 2f: bipush 1
      // 30: goto 34
      // 33: bipush 0
      // 34: ireturn
   }

   public oa4 cnr() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 23
      // 09: getfield oa4.s99 Z
      // 0c: ifeq 1f
      // 0f: goto 16
      // 12: invokestatic oa4.b (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield oa4.pzs Loa4;
      // 1a: areturn
      // 1b: invokestatic oa4.b (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 0
      // 20: getfield oa4.pzs Loa4;
      // 23: iload 1
      // 24: ifne 89
      // 27: ifnonnull 80
      // 2a: goto 31
      // 2d: invokestatic oa4.b (Loov;)Loov;
      // 30: athrow
      // 31: aload 0
      // 32: iload 1
      // 33: ifne 89
      // 36: goto 3d
      // 39: invokestatic oa4.b (Loov;)Loov;
      // 3c: athrow
      // 3d: getfield oa4.zme Lsla;
      // 40: ifnull 80
      // 43: goto 4a
      // 46: invokestatic oa4.b (Loov;)Loov;
      // 49: athrow
      // 4a: aload 0
      // 4b: iload 1
      // 4c: ifne 89
      // 4f: goto 56
      // 52: invokestatic oa4.b (Loov;)Loov;
      // 55: athrow
      // 56: getfield oa4.zme Lsla;
      // 59: getfield sla.pdf Lsla;
      // 5c: ifnull 80
      // 5f: goto 66
      // 62: invokestatic oa4.b (Loov;)Loov;
      // 65: athrow
      // 66: aload 0
      // 67: new c8u
      // 6a: dup
      // 6b: aload 0
      // 6c: aload 0
      // 6d: getfield oa4.zme Lsla;
      // 70: getfield sla.pdf Lsla;
      // 73: invokespecial c8u.<init> (Loa4;Lsla;)V
      // 76: putfield oa4.pzs Loa4;
      // 79: goto 80
      // 7c: invokestatic oa4.b (Loov;)Loov;
      // 7f: athrow
      // 80: aload 0
      // 81: bipush 1
      // 82: putfield oa4.s99 Z
      // 85: aload 0
      // 86: getfield oa4.pzs Loa4;
      // 89: areturn
   }

   @Override
   public String toString() {
      long var1 = a ^ 103851785429932L;
      return a<"z">(1910, 1601665612917359273L ^ var1)
         + this.osu.length / 7
         + a<"z">(20374, 5724283177996945992L ^ var1)
         + this.hvb
         + a<"z">(4534, 1766053166499746923L ^ var1)
         + this.iqa
         + a<"z">(6270, 3391859743005072802L ^ var1)
         + this.zme;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-7555861770074154543L, 7734293431011339977L, MethodHandles.lookup().lookupClass()).a(114003268042549L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 133532906374939L;
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
      String var6 = "\u00ad2ª,%7ð\u0089Ï\u009fI\u0012\u0099\u001aø\u008f<\u008aMd\u0012;f\u008fÀ\u0084©ôWÊx» ì\u008cä¦R$w\u0007Üð\u0081Ñ³WÊ\u0091{/òº\u0080M\u008f¹BW\\Í®qTv";
      int var8 = "\u00ad2ª,%7ð\u0089Ï\u009fI\u0012\u0099\u001aø\u008f<\u008aMd\u0012;f\u008fÀ\u0084©ôWÊx» ì\u008cä¦R$w\u0007Üð\u0081Ñ³WÊ\u0091{/òº\u0080M\u008f¹BW\\Í®qTv"
         .length();
      char var5 = ' ';
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

                  var6 = "þ6&\fw\u0082óÑN-Å\u0007ì¹\u0014\u008f\u009d_ÖàlHA\u0080K\u0000í\u0081ð\u0003\u000fm\u0018ô¯¿Ð3/tÀJ«\u0004@ç¾\u0084@\t³SG¤G\u0019Ñ";
                  var8 = "þ6&\fw\u0082óÑN-Å\u0007ì¹\u0014\u008f\u009d_ÖàlHA\u0080K\u0000í\u0081ð\u0003\u000fm\u0018ô¯¿Ð3/tÀJ«\u0004@ç¾\u0084@\t³SG¤G\u0019Ñ"
                     .length();
                  var5 = ' ';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static oov b(oov var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26430;
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
            throw new RuntimeException("oa4", var10);
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
         throw new RuntimeException("oa4" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
