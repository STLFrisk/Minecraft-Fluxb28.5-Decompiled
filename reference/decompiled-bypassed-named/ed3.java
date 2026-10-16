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

public abstract class ed3 extends ShaderHelper {
   public ShaderHelper bnx;
   public oon ezi;
   public String cqv;
   private static final long b;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public ed3(ShaderHelper var1) {
      this.bnx = var1;
   }

   @Override
   public void updateScreen() {
      this.ezi.p8v();
   }

   public abstract String o9u();

   public abstract String _ey();

   @Override
   public void initGui() {
      long var1 = b ^ 87253371258965L;
      Keyboard.enableRepeatEvents(true);
      this.khf.clear();
      this.khf.add(new gt4(0, this.dt7 / 2 - 100, this.o1e / 4 + 72 + 12, this.o9u()));
      this.khf.add(new gt4(1, this.dt7 / 2 - 100, this.o1e / 4 + 110, b<"v">(5277, 3356850644634225867L ^ var1)));
      this.ezi = new oon(0, this.fex, this.dt7 / 2 - 100, 85, 200, 20);
      this.ezi.m4g(true);
      this.ezi.lg5(Integer.MAX_VALUE);
      this.ezi.ihf(this._ey());
   }

   @Override
   public void onGuiClosed() {
      Keyboard.enableRepeatEvents(false);
   }

   public abstract void dgw(gt4 var1);

   @Override
   public void actionPerformed(gt4 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: getfield gt4.c9a Z
      // 08: iload 2
      // 09: ifne 21
      // 0c: ifeq 60
      // 0f: goto 16
      // 12: invokestatic ed3.c (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: getfield gt4._me I
      // 1a: goto 21
      // 1d: invokestatic ed3.c (Loov;)Loov;
      // 20: athrow
      // 21: iload 2
      // 22: ifne 51
      // 25: bipush 1
      // 26: if_icmpne 46
      // 29: goto 30
      // 2c: invokestatic ed3.c (Loov;)Loov;
      // 2f: athrow
      // 30: aload 0
      // 31: getfield ed3.f41 Lc05;
      // 34: aload 0
      // 35: getfield ed3.bnx Lgbe;
      // 38: invokevirtual Minecraft.z2i (Lgbe;)V
      // 3b: iload 2
      // 3c: ifeq 60
      // 3f: goto 46
      // 42: invokestatic ed3.c (Loov;)Loov;
      // 45: athrow
      // 46: aload 1
      // 47: getfield gt4._me I
      // 4a: goto 51
      // 4d: invokestatic ed3.c (Loov;)Loov;
      // 50: athrow
      // 51: ifne 60
      // 54: aload 0
      // 55: aload 1
      // 56: invokevirtual ed3.dgw (Lgt4;)V
      // 59: goto 60
      // 5c: invokestatic ed3.c (Loov;)Loov;
      // 5f: athrow
      // 60: return
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
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: aload 0
      // 05: iload 3
      // 06: ifne 35
      // 09: getfield ed3.ezi Loon;
      // 0c: iload 1
      // 0d: iload 2
      // 0e: invokevirtual oon.ir1 (CI)Z
      // 11: pop
      // 12: iload 2
      // 13: bipush 28
      // 15: if_icmpeq 2d
      // 18: goto 1f
      // 1b: invokestatic ed3.c (Loov;)Loov;
      // 1e: athrow
      // 1f: iload 2
      // 20: sipush 156
      // 23: if_icmpne 45
      // 26: goto 2d
      // 29: invokestatic ed3.c (Loov;)Loov;
      // 2c: athrow
      // 2d: aload 0
      // 2e: goto 35
      // 31: invokestatic ed3.c (Loov;)Loov;
      // 34: athrow
      // 35: aload 0
      // 36: getfield ed3.khf Ljava/util/List;
      // 39: bipush 0
      // 3a: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 3f: checkcast gt4
      // 42: invokevirtual ed3.actionPerformed (Lgt4;)V
      // 45: return
   }

   @Override
   public void mouseClicked(int var1, int var2, int var3) {
      super.mouseClicked(var1, var2, var3);
      this.ezi.pzs(var1, var2, var3);
   }

   public abstract String a79();

   @Override
   public void drawScreen(int param1, int param2, float param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic ed3.b J
      // 03: ldc2_w 95662283674474
      // 06: lxor
      // 07: lstore 4
      // 09: aload 0
      // 0a: invokevirtual ed3.xmz ()V
      // 0d: invokestatic OpaquePredicate.c ()I
      // 10: aload 0
      // 11: aload 0
      // 12: getfield ed3.fex Lowt;
      // 15: aload 0
      // 16: invokevirtual ed3.a79 ()Ljava/lang/String;
      // 19: aload 0
      // 1a: getfield ed3.dt7 I
      // 1d: bipush 2
      // 1e: idiv
      // 1f: bipush 20
      // 21: ldc 16777215
      // 23: nop
      // 24: invokevirtual ed3.poi (Lowt;Ljava/lang/String;III)V
      // 27: istore 6
      // 29: aload 0
      // 2a: iload 6
      // 2c: ifne a6
      // 2f: getfield ed3.cqv Ljava/lang/String;
      // 32: ifnull 79
      // 35: goto 3c
      // 38: invokestatic ed3.c (Loov;)Loov;
      // 3b: athrow
      // 3c: aload 0
      // 3d: aload 0
      // 3e: getfield ed3.fex Lowt;
      // 41: new java/lang/StringBuilder
      // 44: dup
      // 45: invokespecial java/lang/StringBuilder.<init> ()V
      // 48: sipush 13610
      // 4b: ldc2_w 2914860850737788481
      // 4e: lload 4
      // 50: lxor
      // 51: invokedynamic v (IJ)Ljava/lang/String; bsm=ed3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: nop
      // 57: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5a: aload 0
      // 5b: getfield ed3.cqv Ljava/lang/String;
      // 5e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 61: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 64: aload 0
      // 65: getfield ed3.dt7 I
      // 68: bipush 2
      // 69: idiv
      // 6a: bipush 45
      // 6c: ldc 16777215
      // 6e: nop
      // 6f: invokevirtual ed3.poi (Lowt;Ljava/lang/String;III)V
      // 72: goto 79
      // 75: invokestatic ed3.c (Loov;)Loov;
      // 78: athrow
      // 79: aload 0
      // 7a: aload 0
      // 7b: getfield ed3.fex Lowt;
      // 7e: sipush 2976
      // 81: ldc2_w 3634725071649376456
      // 84: lload 4
      // 86: lxor
      // 87: invokedynamic v (IJ)Ljava/lang/String; bsm=ed3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8c: nop
      // 8d: aload 0
      // 8e: getfield ed3.dt7 I
      // 91: bipush 2
      // 92: idiv
      // 93: bipush 100
      // 95: isub
      // 96: bipush 70
      // 98: ldc 10526880
      // 9a: nop
      // 9b: invokevirtual ed3.c_t (Lowt;Ljava/lang/String;III)V
      // 9e: aload 0
      // 9f: getfield ed3.ezi Loon;
      // a2: invokevirtual oon.j_6 ()V
      // a5: aload 0
      // a6: iload 1
      // a7: iload 2
      // a8: fload 3
      // a9: invokespecial ShaderHelper.drawScreen (IIF)V
      // ac: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-4688917894616909574L, 2278972805991764920L, MethodHandles.lookup().lookupClass()).a(249760148025470L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 31361464372249L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[3];
      int var7 = 0;
      String var6 = "k±j5\u008a5\u0095Gûðâsã]ÚÏ(Æ\u0083Ì¥\u0013ö×Kó!¾¼ÍHÞI^\u009c\u009få\u0090 .ãm\u0086Dç\u001aªþRFÎM¾ca2°\u0010¿~\u0006\u000e\u001b\u0081\u001bûZ%(\u0099PQO\u0011";
      int var8 = "k±j5\u008a5\u0095Gûðâsã]ÚÏ(Æ\u0083Ì¥\u0013ö×Kó!¾¼ÍHÞI^\u009c\u009få\u0090 .ãm\u0086Dç\u001aªþRFÎM¾ca2°\u0010¿~\u0006\u000e\u001b\u0081\u001bûZ%(\u0099PQO\u0011"
         .length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            g = var9;
            h = new String[3];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static oov c(oov var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9051;
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
            throw new RuntimeException("ed3", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = g[var5].getBytes("ISO-8859-1");
         h[var5] = a(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("ed3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
