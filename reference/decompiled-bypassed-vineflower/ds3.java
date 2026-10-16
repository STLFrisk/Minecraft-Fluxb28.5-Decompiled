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
import org.lwjgl.input.Keyboard;

public class ds3 extends gbe {
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public ds3(gbe var1, String var2) {
      this.o9h = var1;
      this.h28 = var2;
   }

   @Override
   public void updateScreen() {
      this.zsw.zf9();
   }

   @Override
   public void initGui() {
      long var1 = a ^ 51910404902938L;
      Keyboard.enableRepeatEvents(true);
      this.khf.clear();
      this.khf.add(new gt4(0, this.dt7 / 2 - 100, this.o1e / 4 + 96 + 12, fc1.gx1(b<"e">(6603, 4123234793649030237L ^ var1), new Object[0])));
      this.khf.add(new gt4(1, this.dt7 / 2 - 100, this.o1e / 4 + 120 + 12, fc1.gx1(b<"e">(11654, 191272092691165203L ^ var1), new Object[0])));
      l6n var3 = this.f41.pwt();
      cog var4 = var3.h1n(this.h28);
      String var5 = var4.fln();
      this.zsw = new jqk(2, this.fex, this.dt7 / 2 - 100, 60, 200, 20);
      this.zsw._c6(true);
      this.zsw.nrl(var5);
   }

   @Override
   public void onGuiClosed() {
      Keyboard.enableRepeatEvents(false);
   }

   @Override
   public void actionPerformed(gt4 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: getfield gt4.c9a Z
      // 08: iload 2
      // 09: ifne 21
      // 0c: ifeq 7b
      // 0f: goto 16
      // 12: invokestatic ds3.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: getfield gt4._me I
      // 1a: goto 21
      // 1d: invokestatic ds3.a (Loov;)Loov;
      // 20: athrow
      // 21: iload 2
      // 22: ifne 51
      // 25: bipush 1
      // 26: if_icmpne 46
      // 29: goto 30
      // 2c: invokestatic ds3.a (Loov;)Loov;
      // 2f: athrow
      // 30: aload 0
      // 31: getfield ds3.f41 Lc05;
      // 34: aload 0
      // 35: getfield ds3.o9h Lgbe;
      // 38: invokevirtual c05.z2i (Lgbe;)V
      // 3b: iload 2
      // 3c: ifeq 7b
      // 3f: goto 46
      // 42: invokestatic ds3.a (Loov;)Loov;
      // 45: athrow
      // 46: aload 1
      // 47: getfield gt4._me I
      // 4a: goto 51
      // 4d: invokestatic ds3.a (Loov;)Loov;
      // 50: athrow
      // 51: ifne 7b
      // 54: aload 0
      // 55: getfield ds3.f41 Lc05;
      // 58: invokevirtual c05.pwt ()Ll6n;
      // 5b: astore 3
      // 5c: aload 3
      // 5d: aload 0
      // 5e: getfield ds3.h28 Ljava/lang/String;
      // 61: aload 0
      // 62: getfield ds3.zsw Ljqk;
      // 65: invokevirtual jqk.xct ()Ljava/lang/String;
      // 68: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 6b: invokeinterface l6n.tdg (Ljava/lang/String;Ljava/lang/String;)V 3
      // 70: aload 0
      // 71: getfield ds3.f41 Lc05;
      // 74: aload 0
      // 75: getfield ds3.o9h Lgbe;
      // 78: invokevirtual c05.z2i (Lgbe;)V
      // 7b: return
   }

   @Override
   public void dig(char param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: aload 0
      // 05: getfield ds3.zsw Ljqk;
      // 08: iload 1
      // 09: iload 2
      // 0a: invokevirtual jqk.pst (CI)Z
      // 0d: pop
      // 0e: aload 0
      // 0f: getfield ds3.khf Ljava/util/List;
      // 12: bipush 0
      // 13: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 18: checkcast gt4
      // 1b: aload 0
      // 1c: getfield ds3.zsw Ljqk;
      // 1f: invokevirtual jqk.xct ()Ljava/lang/String;
      // 22: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 25: invokevirtual java/lang/String.length ()I
      // 28: iload 3
      // 29: ifne 37
      // 2c: ifle 3a
      // 2f: goto 36
      // 32: invokestatic ds3.a (Loov;)Loov;
      // 35: athrow
      // 36: bipush 1
      // 37: goto 3b
      // 3a: bipush 0
      // 3b: putfield gt4.c9a Z
      // 3e: iload 2
      // 3f: bipush 28
      // 41: iload 3
      // 42: ifne 5a
      // 45: if_icmpeq 5d
      // 48: goto 4f
      // 4b: invokestatic ds3.a (Loov;)Loov;
      // 4e: athrow
      // 4f: iload 2
      // 50: sipush 156
      // 53: goto 5a
      // 56: invokestatic ds3.a (Loov;)Loov;
      // 59: athrow
      // 5a: if_icmpne 75
      // 5d: aload 0
      // 5e: aload 0
      // 5f: getfield ds3.khf Ljava/util/List;
      // 62: bipush 0
      // 63: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 68: checkcast gt4
      // 6b: invokevirtual ds3.actionPerformed (Lgt4;)V
      // 6e: goto 75
      // 71: invokestatic ds3.a (Loov;)Loov;
      // 74: athrow
      // 75: return
   }

   @Override
   public void mouseClicked(int var1, int var2, int var3) {
      super.mouseClicked(var1, var2, var3);
      this.zsw.elk(var1, var2, var3);
   }

   @Override
   public void drawScreen(int var1, int var2, float var3) {
      long var4 = a ^ 60937186986789L;
      this.xmz();
      this.poi(this.fex, fc1.gx1(b<"e">(12896, 4915120932724815048L ^ var4), new Object[0]), this.dt7 / 2, 20, 16777215);
      this.c_t(this.fex, fc1.gx1(b<"e">(21281, 2053160690523690378L ^ var4), new Object[0]), this.dt7 / 2 - 100, 47, 10526880);
      this.zsw.dy2();
      super.drawScreen(var1, var2, var3);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-627136021494096765L, -356417863062711977L, MethodHandles.lookup().lookupClass()).a(189828956021053L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 136576124493667L;
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
      String var6 = "°ä¸«×=.êÏ¨&\u0087\u0002\u0083\u001dTÏW\u0092Uê2¨U\u0003´8¨O\u0090\u0007ÍS?Þg\u000f²x\u0014uç>z;®Ýð0(oÎlVýË`w o'6Jì\u0083©+@\u0087\u0081ë[\u0001Ç\u0097¶\u0094\u009ff¢±O\u0090\u0002ÝH`d$\\\u00adQ<\u0011\u0014¢Â";
      int var8 = "°ä¸«×=.êÏ¨&\u0087\u0002\u0083\u001dTÏW\u0092Uê2¨U\u0003´8¨O\u0090\u0007ÍS?Þg\u000f²x\u0014uç>z;®Ýð0(oÎlVýË`w o'6Jì\u0083©+@\u0087\u0081ë[\u0001Ç\u0097¶\u0094\u009ff¢±O\u0090\u0002ÝH`d$\\\u00adQ<\u0011\u0014¢Â"
         .length();
      char var5 = '0';
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
                     g = new String[4];
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

                  var6 = "»\u0003f\u008b\u0096NÎ¸\u008ej\u0091?e\u007fbÉÍ\u0004\u00adL¯¦\u008b\u0087t«P\u0003³\u0090Ü\u0012(mH\rq\u0017¾n7ë¹çI¿¤¤!\u0094\u0082\nuÊlæ÷\u0091àd9\u0097È¤\fyzÆíx®\u0085T";
                  var8 = "»\u0003f\u008b\u0096NÎ¸\u008ej\u0091?e\u007fbÉÍ\u0004\u00adL¯¦\u008b\u0087t«P\u0003³\u0090Ü\u0012(mH\rq\u0017¾n7ë¹çI¿¤¤!\u0094\u0082\nuÊlæ÷\u0091àd9\u0097È¤\fyzÆíx®\u0085T"
                     .length();
                  var5 = ' ';
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9882;
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
            throw new RuntimeException("ds3", var10);
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
         g[var5] = a(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("ds3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
