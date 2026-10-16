import java.awt.Color;
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

public class iah implements zn8 {
   public Minecraft j81 = Minecraft.vz1();
   public static NumberSetting h7w;
   public int p0y = 0;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   @Override
   public String kv_() {
      long var1 = a ^ 108625726623666L;
      return a<"e">(18394, 8762049698596518619L ^ var1);
   }

   @Override
   public void lml() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic hzu.dp2 ()V
      // 003: invokestatic OpaquePredicate.c ()I
      // 006: fconst_2
      // 007: getstatic HudRenderer.r0a F
      // 00a: fadd
      // 00b: fstore 2
      // 00c: istore 1
      // 00d: new eka
      // 010: dup
      // 011: aload 0
      // 012: getfield iah.j81 Lc05;
      // 015: invokespecial eka.<init> (Lc05;)V
      // 018: astore 3
      // 019: aload 0
      // 01a: bipush 0
      // 01b: putfield iah.p0y I
      // 01e: getstatic ClientState.qkk Lzwr;
      // 021: invokevirtual ClientState.getModuleRegistry ()Lkgt;
      // 024: getstatic jsr.ykr Lcyb;
      // 027: invokevirtual ModuleRegistry.cwd (Ljava/lang/Object;)Ljava/util/List;
      // 02a: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 02f: astore 4
      // 031: aload 4
      // 033: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 038: ifeq 1b3
      // 03b: aload 4
      // 03d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 042: checkcast Module
      // 045: astore 5
      // 047: iload 1
      // 048: ifne 1b6
      // 04b: invokestatic HudRenderer.tty ()Ljava/util/List;
      // 04e: aload 5
      // 050: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 053: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 058: ifeq 069
      // 05b: goto 062
      // 05e: invokestatic iah.a (Loov;)Loov;
      // 061: athrow
      // 062: goto 031
      // 065: invokestatic iah.a (Loov;)Loov;
      // 068: athrow
      // 069: getstatic jsr.ykr Lcyb;
      // 06c: astore 6
      // 06e: aload 3
      // 06f: invokevirtual eka.x05 ()I
      // 072: i2f
      // 073: getstatic jsr.ykr Lcyb;
      // 076: aload 5
      // 078: invokevirtual Module.zg2 ()Ljava/lang/String;
      // 07b: invokevirtual cyb.ax2 (Ljava/lang/String;)F
      // 07e: fsub
      // 07f: ldc 6.0
      // 081: nop
      // 082: fsub
      // 083: fstore 7
      // 085: aload 5
      // 087: iload 1
      // 088: ifne 0cb
      // 08b: invokevirtual Module.klu ()Z
      // 08e: ifeq 0c2
      // 091: goto 098
      // 094: invokestatic iah.a (Loov;)Loov;
      // 097: athrow
      // 098: aload 5
      // 09a: aload 5
      // 09c: getfield Module.hta F
      // 09f: aload 6
      // 0a1: getfield cyb.jek F
      // 0a4: fconst_2
      // 0a5: fsub
      // 0a6: aload 6
      // 0a8: getfield cyb.jek F
      // 0ab: fconst_2
      // 0ac: fsub
      // 0ad: ldc 10.0
      // 0af: nop
      // 0b0: fmul
      // 0b1: invokestatic InputState.lvf (FFF)F
      // 0b4: putfield Module.hta F
      // 0b7: iload 1
      // 0b8: ifeq 0e2
      // 0bb: goto 0c2
      // 0be: invokestatic iah.a (Loov;)Loov;
      // 0c1: athrow
      // 0c2: aload 5
      // 0c4: goto 0cb
      // 0c7: invokestatic iah.a (Loov;)Loov;
      // 0ca: athrow
      // 0cb: aload 5
      // 0cd: getfield Module.hta F
      // 0d0: fconst_0
      // 0d1: aload 6
      // 0d3: getfield cyb.jek F
      // 0d6: fconst_2
      // 0d7: fsub
      // 0d8: ldc 10.0
      // 0da: nop
      // 0db: fmul
      // 0dc: invokestatic InputState.lvf (FFF)F
      // 0df: putfield Module.hta F
      // 0e2: aload 5
      // 0e4: invokevirtual Module.klu ()Z
      // 0e7: iload 1
      // 0e8: ifne 11a
      // 0eb: ifne 114
      // 0ee: goto 0f5
      // 0f1: invokestatic iah.a (Loov;)Loov;
      // 0f4: athrow
      // 0f5: aload 5
      // 0f7: getfield Module.hta F
      // 0fa: fconst_0
      // 0fb: fcmpl
      // 0fc: iload 1
      // 0fd: ifne 11a
      // 100: goto 107
      // 103: invokestatic iah.a (Loov;)Loov;
      // 106: athrow
      // 107: ifne 114
      // 10a: goto 111
      // 10d: invokestatic iah.a (Loov;)Loov;
      // 110: athrow
      // 111: goto 031
      // 114: getstatic ipp._ft Lcn7;
      // 117: invokevirtual BooleanSetting.g7m ()Z
      // 11a: iload 1
      // 11b: ifne 1a1
      // 11e: ifne 141
      // 121: goto 128
      // 124: invokestatic iah.a (Loov;)Loov;
      // 127: athrow
      // 128: aload 5
      // 12a: invokevirtual Module.oxx ()L_aj;
      // 12d: getstatic _aj.sxc L_aj;
      // 130: if_acmpne 141
      // 133: goto 13a
      // 136: invokestatic iah.a (Loov;)Loov;
      // 139: athrow
      // 13a: goto 031
      // 13d: invokestatic iah.a (Loov;)Loov;
      // 140: athrow
      // 141: invokestatic org/lwjgl/opengl/GL11.glPushMatrix ()V
      // 144: sipush 3089
      // 147: invokestatic org/lwjgl/opengl/GL11.glEnable (I)V
      // 14a: aload 3
      // 14b: invokevirtual eka.x05 ()I
      // 14e: i2f
      // 14f: fload 7
      // 151: fsub
      // 152: fload 2
      // 153: fconst_1
      // 154: fsub
      // 155: aload 3
      // 156: invokevirtual eka.x05 ()I
      // 159: i2f
      // 15a: aload 5
      // 15c: getfield Module.hta F
      // 15f: fconst_2
      // 160: fadd
      // 161: invokestatic hhf.xbo (FFFF)V
      // 164: getstatic jsr.ykr Lcyb;
      // 167: aload 5
      // 169: invokevirtual Module.zg2 ()Ljava/lang/String;
      // 16c: fload 7
      // 16e: fconst_2
      // 16f: fadd
      // 170: fload 2
      // 171: new java/awt/Color
      // 174: dup
      // 175: bipush -100
      // 177: aload 0
      // 178: dup
      // 179: getfield iah.p0y I
      // 17c: bipush 1
      // 17d: iadd
      // 17e: dup_x1
      // 17f: putfield iah.p0y I
      // 182: bipush -50
      // 184: imul
      // 185: i2f
      // 186: getstatic iah.h7w Lcrk;
      // 189: invokevirtual NumberSetting.getValue ()Ljava/lang/Float;
      // 18c: invokevirtual java/lang/Float.floatValue ()F
      // 18f: fmul
      // 190: f2l
      // 191: invokestatic iah.bwv (IJ)I
      // 194: invokespecial java/awt/Color.<init> (I)V
      // 197: invokevirtual java/awt/Color.getRGB ()I
      // 19a: invokevirtual cyb.e18 (Ljava/lang/String;FFI)I
      // 19d: pop
      // 19e: sipush 3089
      // 1a1: invokestatic org/lwjgl/opengl/GL11.glDisable (I)V
      // 1a4: invokestatic org/lwjgl/opengl/GL11.glPopMatrix ()V
      // 1a7: fload 2
      // 1a8: aload 5
      // 1aa: getfield Module.hta F
      // 1ad: fadd
      // 1ae: fstore 2
      // 1af: iload 1
      // 1b0: ifeq 031
      // 1b3: invokestatic hzu.x3w ()V
      // 1b6: return
   }

   @Override
   public void fd7() {
      long var1 = a ^ 31428930132993L;
      jsr.ln8.ayi(a<"e">(20147, 6019417425648508928L ^ var1), 3.0F, 2.0F, Color.getHSBColor(ipp.dra.getValue(), ipp.t_q.getValue(), ipp.iwr.getValue()).getRGB());
   }

   public static int bwv(int var0, long var1) {
      double var3 = Math.ceil((double)((System.currentTimeMillis() + var1) / 8L) + (double)var0 / 20.0);
      var3 %= 360.0;
      return Color.getHSBColor((float)(var3 / 360.0), ipp.t_q.getValue(), ipp.iwr.getValue()).getRGB();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(3087226736650895039L, 7421178811992837140L, MethodHandles.lookup().lookupClass()).a(258408589305013L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 116497148123534L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[4];
      int var5 = 0;
      String var4 = "\u0011\\*\\\u0088R\u0012l\u0013\u0091M\rü¸uí\u0010\u0090~¹\u001b\u009d\u000b\u0017-Ý\u0015(h\u0084¤Ða";
      int var6 = "\u0011\\*\\\u0088R\u0012l\u0013\u0091M\rü¸uí\u0010\u0090~¹\u001b\u009d\u000b\u0017-Ý\u0015(h\u0084¤Ða".length();
      char var3 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     b = var7;
                     c = new String[4];
                     h7w = new NumberSetting(a<"e">(2339, 242916429211460124L ^ var9), a<"e">(14270, 4589513783907703936L ^ var9), 2.0F, -10.0F, 10.0F, 0.1F);
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

                  var4 = "T?Úþ)ÏÆKû åÁ\u008f\u0086qJ\u0018³IÆ\u0097Ð]¶ø\u008fùjªÝó¶6!\u0091§\u0017äcîx";
                  var6 = "T?Úþ)ÏÆKû åÁ\u008f\u0086qJ\u0018³IÆ\u0097Ð]¶ø\u008fùjªÝó¶6!\u0091§\u0017äcîx".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 17238;
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
            throw new RuntimeException("iah", var10);
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
         throw new RuntimeException("iah" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
