import com.google.common.collect.Lists;
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
import net.minecraft.tileentity.TileEntityNote;

public class x76 extends rw8 {
   private static final long b;
   private static final String[] d;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public x76() {
      super(p3y.fdu);
      this.i3l(uja.yj_);
   }

   @Override
   public void z3l(t9d param1, mew param2, zfz param3, e0x param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: aload 2
      // 02: invokevirtual t9d.gxo (Lmew;)Z
      // 05: istore 6
      // 07: invokestatic t9d.c ()I
      // 0a: aload 1
      // 0b: aload 2
      // 0c: invokevirtual t9d.getTileEntity (Lmew;)Lpyk;
      // 0f: astore 7
      // 11: istore 5
      // 13: aload 7
      // 15: iload 5
      // 17: ifne 30
      // 1a: instanceof net/minecraft/tileentity/TileEntityNote
      // 1d: ifeq 6c
      // 20: goto 27
      // 23: invokestatic x76.a (Loov;)Loov;
      // 26: athrow
      // 27: aload 7
      // 29: goto 30
      // 2c: invokestatic x76.a (Loov;)Loov;
      // 2f: athrow
      // 30: checkcast net/minecraft/tileentity/TileEntityNote
      // 33: astore 8
      // 35: aload 8
      // 37: getfield net/minecraft/tileentity/TileEntityNote.evi Z
      // 3a: iload 5
      // 3c: ifne 54
      // 3f: iload 6
      // 41: if_icmpeq 6c
      // 44: goto 4b
      // 47: invokestatic x76.a (Loov;)Loov;
      // 4a: athrow
      // 4b: iload 6
      // 4d: goto 54
      // 50: invokestatic x76.a (Loov;)Loov;
      // 53: athrow
      // 54: ifeq 65
      // 57: aload 8
      // 59: aload 1
      // 5a: aload 2
      // 5b: invokevirtual net/minecraft/tileentity/TileEntityNote.gcb (Lt9d;Lmew;)V
      // 5e: goto 65
      // 61: invokestatic x76.a (Loov;)Loov;
      // 64: athrow
      // 65: aload 8
      // 67: iload 6
      // 69: putfield net/minecraft/tileentity/TileEntityNote.evi Z
      // 6c: return
   }

   @Override
   public boolean cl2(t9d param1, mew param2, zfz param3, ha9 param4, vt2 param5, float param6, float param7, float param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 9
      // 05: aload 1
      // 06: iload 9
      // 08: ifeq 1f
      // 0b: getfield t9d.v0f Z
      // 0e: ifeq 1e
      // 11: goto 18
      // 14: invokestatic x76.a (Loov;)Loov;
      // 17: athrow
      // 18: bipush 1
      // 19: ireturn
      // 1a: invokestatic x76.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 1
      // 1f: aload 2
      // 20: invokevirtual t9d.getTileEntity (Lmew;)Lpyk;
      // 23: astore 10
      // 25: aload 10
      // 27: instanceof net/minecraft/tileentity/TileEntityNote
      // 2a: iload 9
      // 2c: ifeq 55
      // 2f: ifeq 54
      // 32: goto 39
      // 35: invokestatic x76.a (Loov;)Loov;
      // 38: athrow
      // 39: aload 10
      // 3b: checkcast net/minecraft/tileentity/TileEntityNote
      // 3e: astore 11
      // 40: aload 11
      // 42: invokevirtual net/minecraft/tileentity/TileEntityNote.xzp ()V
      // 45: aload 11
      // 47: aload 1
      // 48: aload 2
      // 49: invokevirtual net/minecraft/tileentity/TileEntityNote.gcb (Lt9d;Lmew;)V
      // 4c: aload 4
      // 4e: getstatic l9p.sh9 L_ss;
      // 51: invokevirtual ha9.aex (L_ss;)V
      // 54: bipush 1
      // 55: ireturn
   }

   @Override
   public void uqb(t9d param1, mew param2, ha9 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 4
      // 05: aload 1
      // 06: iload 4
      // 08: ifne 20
      // 0b: getfield t9d.v0f Z
      // 0e: ifne 52
      // 11: goto 18
      // 14: invokestatic x76.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 1
      // 19: goto 20
      // 1c: invokestatic x76.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 2
      // 21: invokevirtual t9d.getTileEntity (Lmew;)Lpyk;
      // 24: astore 5
      // 26: aload 5
      // 28: iload 4
      // 2a: ifne 43
      // 2d: instanceof net/minecraft/tileentity/TileEntityNote
      // 30: ifeq 52
      // 33: goto 3a
      // 36: invokestatic x76.a (Loov;)Loov;
      // 39: athrow
      // 3a: aload 5
      // 3c: goto 43
      // 3f: invokestatic x76.a (Loov;)Loov;
      // 42: athrow
      // 43: checkcast net/minecraft/tileentity/TileEntityNote
      // 46: aload 1
      // 47: aload 2
      // 48: invokevirtual net/minecraft/tileentity/TileEntityNote.gcb (Lt9d;Lmew;)V
      // 4b: aload 3
      // 4c: getstatic l9p.xp8 L_ss;
      // 4f: invokevirtual ha9.aex (L_ss;)V
      // 52: return
   }

   @Override
   public pyk ie9(t9d var1, int var2) {
      return new TileEntityNote();
   }

   private String rpa(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: iload 1
      // 05: iload 2
      // 06: ifne 39
      // 09: iflt 31
      // 0c: goto 13
      // 0f: invokestatic x76.a (Loov;)Loov;
      // 12: athrow
      // 13: iload 1
      // 14: iload 2
      // 15: ifne 39
      // 18: goto 1f
      // 1b: invokestatic x76.a (Loov;)Loov;
      // 1e: athrow
      // 1f: getstatic x76.lua Ljava/util/List;
      // 22: invokeinterface java/util/List.size ()I 1
      // 27: if_icmplt 3a
      // 2a: goto 31
      // 2d: invokestatic x76.a (Loov;)Loov;
      // 30: athrow
      // 31: bipush 0
      // 32: goto 39
      // 35: invokestatic x76.a (Loov;)Loov;
      // 38: athrow
      // 39: istore 1
      // 3a: getstatic x76.lua Ljava/util/List;
      // 3d: iload 1
      // 3e: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 43: checkcast java/lang/String
      // 46: areturn
   }

   @Override
   public boolean ng5(t9d var1, mew var2, zfz var3, int var4, int var5) {
      long var6 = b ^ 116083954461101L;
      float var8 = (float)Math.pow(2.0, (double)(var5 - 12) / 12.0);
      var1.amg(
         (double)var2.getX() + 0.5,
         (double)var2.getY() + 0.5,
         (double)var2.getZ() + 0.5,
         b<"d">(1327, 7258930924638975584L ^ var6) + this.rpa(var4),
         3.0F,
         var8
      );
      var1.zvy(w_0.z58, (double)var2.getX() + 0.5, (double)var2.getY() + 1.2, (double)var2.getZ() + 0.5, (double)var5 / 24.0, 0.0, 0.0, new int[0]);
      return true;
   }

   @Override
   public int kfj() {
      return 3;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(8337838388026513712L, 2781314719621194796L, MethodHandles.lookup().lookupClass()).a(195250039765247L);
      // $VF: monitorexit
      b = var10000;
      long var9 = b ^ 25565945042353L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[6];
      int var5 = 0;
      String var4 = "±o\u0092+¦ ÇÒè\u00adÁ1f\u009b 6¥eT¬ç\u0089¡t\u0010%È^ijÑ`\u0005;²n\u0092\u008e×\u0092É\u0010Lá¼\u008c\u00053ý\n\u0000@\u001c\u008d¨-É×\u0010Wo}Ûs<¹´ÿ6î²w\u0003Ì\u0086";
      int var6 = "±o\u0092+¦ ÇÒè\u00adÁ1f\u009b 6¥eT¬ç\u0089¡t\u0010%È^ijÑ`\u0005;²n\u0092\u008e×\u0092É\u0010Lá¼\u008c\u00053ý\n\u0000@\u001c\u008d¨-É×\u0010Wo}Ûs<¹´ÿ6î²w\u0003Ì\u0086"
         .length();
      char var3 = 24;
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
                     d = var7;
                     h = new String[6];
                     lua = Lists.newArrayList(
                        new String[]{
                           b<"d">(5867, 5247840138156087737L ^ var9),
                           b<"d">(3467, 1552018162985272030L ^ var9),
                           b<"d">(27663, 6521639223504167771L ^ var9),
                           b<"d">(1519, 9088424585400421054L ^ var9),
                           b<"d">(6356, 6515672976581302148L ^ var9)
                        }
                     );
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

                  var4 = "âºZ\u008bh{|¶ôá)\u0005\u0090\u008aqÁ\u00109éã¹\u0095?¾É\u001cÅÿ\u0011ãï&Ý";
                  var6 = "âºZ\u008bh{|¶ôá)\u0005\u0090\u008aqÁ\u00109éã¹\u0095?¾É\u001cÅÿ\u0011ãï&Ý".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 13425;
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
            throw new RuntimeException("x76", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
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
         throw new RuntimeException("x76" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
