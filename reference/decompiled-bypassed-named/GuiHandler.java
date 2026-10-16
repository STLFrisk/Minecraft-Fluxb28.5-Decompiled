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

public class GuiHandler extends Module {
   public static NumberSetting fvr;
   public static NumberSetting t3o;
   public static NumberSetting jv9;
   public static BooleanSetting vll;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public GuiHandler() {
      long var1 = a ^ 9928284620231L;
      super(b<"k">(12226, 3844893508048099789L ^ var1), _aj.sxc, false, new SubEngine[0]);
      this.setKey(54);
      this.vj0 = true;
   }

   @Override
   public void onEnable() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic GuiHandler.a J
      // 03: ldc2_w 39396719063314
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 3
      // 0c: getstatic GuiHandler.ek1 Lc05;
      // 0f: getfield Minecraft.u0y Lgbe;
      // 12: instanceof ClickGui
      // 15: iload 3
      // 16: ifeq 4f
      // 19: ifeq 2c
      // 1c: goto 23
      // 1f: invokestatic GuiHandler.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 0
      // 24: invokevirtual GuiHandler.disable ()V
      // 27: return
      // 28: invokestatic GuiHandler.a (Loov;)Loov;
      // 2b: athrow
      // 2c: getstatic ClientState.qkk Lzwr;
      // 2f: iload 3
      // 30: ifeq 9b
      // 33: pop
      // 34: getstatic ClientState.syg Lc_3;
      // 37: sipush 12771
      // 3a: ldc2_w 6614410553381794618
      // 3d: lload 1
      // 3e: lxor
      // 3f: invokedynamic k (IJ)Ljava/lang/String; bsm=GuiHandler.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: nop
      // 45: invokevirtual ModeSetting.isAllowedValue (Ljava/lang/String;)Z
      // 48: goto 4f
      // 4b: invokestatic GuiHandler.a (Loov;)Loov;
      // 4e: athrow
      // 4f: ifeq 91
      // 52: getstatic ClientState.qkk Lzwr;
      // 55: iload 3
      // 56: ifeq 77
      // 59: goto 60
      // 5c: invokestatic GuiHandler.a (Loov;)Loov;
      // 5f: athrow
      // 60: invokevirtual ClientState.ch4 ()Lfkf;
      // 63: ifnonnull 81
      // 66: goto 6d
      // 69: invokestatic GuiHandler.a (Loov;)Loov;
      // 6c: athrow
      // 6d: getstatic ClientState.qkk Lzwr;
      // 70: goto 77
      // 73: invokestatic GuiHandler.a (Loov;)Loov;
      // 76: athrow
      // 77: new ClickGui
      // 7a: dup
      // 7b: invokespecial ClickGui.<init> ()V
      // 7e: invokevirtual ClientState.r_n (Lfkf;)V
      // 81: getstatic GuiHandler.ek1 Lc05;
      // 84: getstatic ClientState.qkk Lzwr;
      // 87: invokevirtual ClientState.ch4 ()Lfkf;
      // 8a: invokevirtual Minecraft.z2i (Lgbe;)V
      // 8d: iload 3
      // 8e: ifne cc
      // 91: getstatic ClientState.qkk Lzwr;
      // 94: goto 9b
      // 97: invokestatic GuiHandler.a (Loov;)Loov;
      // 9a: athrow
      // 9b: iload 3
      // 9c: ifeq b6
      // 9f: invokevirtual ClientState.e6d ()Ljvy;
      // a2: ifnonnull c0
      // a5: goto ac
      // a8: invokestatic GuiHandler.a (Loov;)Loov;
      // ab: athrow
      // ac: getstatic ClientState.qkk Lzwr;
      // af: goto b6
      // b2: invokestatic GuiHandler.a (Loov;)Loov;
      // b5: athrow
      // b6: new jvy
      // b9: dup
      // ba: invokespecial jvy.<init> ()V
      // bd: invokevirtual ClientState.dj6 (Ljvy;)V
      // c0: getstatic GuiHandler.ek1 Lc05;
      // c3: getstatic ClientState.qkk Lzwr;
      // c6: invokevirtual ClientState.e6d ()Ljvy;
      // c9: invokevirtual Minecraft.z2i (Lgbe;)V
      // cc: aload 0
      // cd: invokevirtual GuiHandler.disable ()V
      // d0: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-4716181300244564432L, 8122432497171960557L, MethodHandles.lookup().lookupClass()).a(198767813576165L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 39114015071847L;
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
      String var4 = "núU&ó\u0083\nþ\t¯\u0012{¢y\u0099¨£©|\bTÆÑÆá6ðÛO2¥\u0005\u0010\r\u000f²1ÐOÛ§fÏ|\u0004Ç«\u0096É \u008a2º¿\u008e\u00845\rñøS\u009c(b}B@u\u0089¢-®\u0004\u008d9wÈÕ\u0012^÷Ü\u0010¦í\u0010£_4ûX\u009cgÜÏ ^a:\u0010íÐr\u0089Þ»d\u0013ÉNXUü\u008aoL\u0010\u0019zÉÈ\n\u008d¦~´~}M\u0010c\u007f`";
      int var6 = "núU&ó\u0083\nþ\t¯\u0012{¢y\u0099¨£©|\bTÆÑÆá6ðÛO2¥\u0005\u0010\r\u000f²1ÐOÛ§fÏ|\u0004Ç«\u0096É \u008a2º¿\u008e\u00845\rñøS\u009c(b}B@u\u0089¢-®\u0004\u008d9wÈÕ\u0012^÷Ü\u0010¦í\u0010£_4ûX\u009cgÜÏ ^a:\u0010íÐr\u0089Þ»d\u0013ÉNXUü\u008aoL\u0010\u0019zÉÈ\n\u008d¦~´~}M\u0010c\u007f`"
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
                     fvr = new NumberSetting(b<"k">(12385, 894755359100247496L ^ var9), b<"k">(3922, 7757262674364605177L ^ var9), 255.0F, 0.0F, 255.0F, 1.0F);
                     t3o = new NumberSetting(b<"k">(12385, 894755359100247496L ^ var9), b<"k">(24010, 2748442511385653346L ^ var9), 255.0F, 0.0F, 255.0F, 1.0F);
                     jv9 = new NumberSetting(b<"k">(12385, 894755359100247496L ^ var9), b<"k">(11965, 6019160155690992407L ^ var9), 255.0F, 0.0F, 255.0F, 1.0F);
                     vll = new BooleanSetting(b<"k">(10440, 245602223364048229L ^ var9), b<"k">(4115, 4510774027128913341L ^ var9), false);
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

                  var4 = "\u009bä\u001d\u0086¶êð¿¡\u0017|\u0082 w\u0080vÜñ\u009fPí¶¼å\u0010_ÿ%ó\u0084!K~òÄéÝµý\u0011[";
                  var6 = "\u009bä\u001d\u0086¶êð¿¡\u0017|\u0082 w\u0080vÜñ\u009fPí¶¼å\u0010_ÿ%ó\u0084!K~òÄéÝµý\u0011[".length();
                  var3 = 24;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31071;
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
            throw new RuntimeException("GuiHandler", var10);
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
         throw new RuntimeException("GuiHandler" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
