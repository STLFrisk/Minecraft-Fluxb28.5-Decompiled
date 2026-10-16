import java.io.InputStream;
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
import org.apache.commons.io.IOUtils;
import org.lwjgl.opengl.ARBShaderObjects;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;

public abstract class ni3 {
   public static final c05 wc2;
   private static final long b;
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public ni3(String var1) {
      long var2 = b ^ 85699269818804L;
      int var4 = t9d.b();
      super();

      int var5;
      int var6;
      try {
         InputStream var7 = this.getClass().getResourceAsStream(a<"y">(14107, 759139187616077321L ^ var2));
         var5 = this.ukh(IOUtils.toString(var7), 35633);
         IOUtils.closeQuietly(var7);
         InputStream var8 = this.getClass().getResourceAsStream(a<"y">(28554, 4635269887986470554L ^ var2) + var1);
         var6 = this.ukh(IOUtils.toString(var8), 35632);
         IOUtils.closeQuietly(var8);
      } catch (Exception var9) {
         var9.printStackTrace();
         return;
      }

      int var10000;
      label57: {
         try {
            var10000 = var5;
            if (var4 == 0) {
               break label57;
            }

            if (var5 == 0) {
               return;
            }
         } catch (Exception var12) {
            throw a(var12);
         }

         var10000 = var6;
      }

      label51: {
         try {
            if (var4 == 0) {
               break label51;
            }

            if (var10000 == 0) {
               return;
            }
         } catch (Exception var11) {
            throw a(var11);
         }

         this.t4u = ARBShaderObjects.glCreateProgramObjectARB();
         var10000 = this.t4u;
      }

      label41: {
         try {
            if (var4 == 0) {
               break label41;
            }

            if (var10000 == 0) {
               return;
            }
         } catch (Exception var10) {
            throw a(var10);
         }

         ARBShaderObjects.glAttachObjectARB(this.t4u, var5);
         ARBShaderObjects.glAttachObjectARB(this.t4u, var6);
         ARBShaderObjects.glLinkProgramARB(this.t4u);
         var10000 = this.t4u;
      }

      ARBShaderObjects.glValidateProgramARB(var10000);
   }

   public void fog() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic org/lwjgl/opengl/GL11.glPushMatrix ()V
      // 03: invokestatic t9d.b ()I
      // 06: aload 0
      // 07: getfield ni3.t4u I
      // 0a: invokestatic org/lwjgl/opengl/GL20.glUseProgram (I)V
      // 0d: istore 1
      // 0e: aload 0
      // 0f: iload 1
      // 10: ifeq 37
      // 13: getfield ni3.pwo Ljava/util/Map;
      // 16: ifnonnull 36
      // 19: goto 20
      // 1c: invokestatic ni3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f: athrow
      // 20: aload 0
      // 21: new java/util/HashMap
      // 24: dup
      // 25: invokespecial java/util/HashMap.<init> ()V
      // 28: putfield ni3.pwo Ljava/util/Map;
      // 2b: aload 0
      // 2c: invokevirtual ni3.la_ ()V
      // 2f: goto 36
      // 32: invokestatic ni3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35: athrow
      // 36: aload 0
      // 37: invokevirtual ni3.jhy ()V
      // 3a: return
   }

   public void iyv(int var1, int var2) {
      try {
         this.fog();
         GL11.glScalef(1.0F, 1.0F, 1.0F);
         jom var3 = jom.yut();
         q3g var4 = var3.zuq();
         var4.ezr(7, gnl.gx3);
         var4.g5o(0.0, (double)var2, 0.0).pzw();
         var4.g5o((double)var1, (double)var2, 0.0).pzw();
         var4.g5o((double)var1, 0.0, 0.0).pzw();
         var4.g5o(0.0, 0.0, 0.0).pzw();
         var3.q7g();
         this.e_0();
      } catch (Exception var5) {
         var5.printStackTrace();
      }
   }

   public void e_0() {
      GL20.glUseProgram(0);
      GL11.glPopMatrix();
   }

   public abstract void la_();

   public abstract void jhy();

   private int ukh(String param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic ni3.b J
      // 03: ldc2_w 119905151849957
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic t9d.b ()I
      // 0b: istore 5
      // 0d: bipush 0
      // 0e: istore 6
      // 10: iload 2
      // 11: invokestatic org/lwjgl/opengl/ARBShaderObjects.glCreateShaderObjectARB (I)I
      // 14: istore 6
      // 16: iload 6
      // 18: iload 5
      // 1a: ifeq 3c
      // 1d: ifne 29
      // 20: goto 27
      // 23: invokestatic ni3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26: athrow
      // 27: bipush 0
      // 28: ireturn
      // 29: iload 6
      // 2b: aload 1
      // 2c: invokestatic org/lwjgl/opengl/ARBShaderObjects.glShaderSourceARB (ILjava/lang/CharSequence;)V
      // 2f: iload 6
      // 31: invokestatic org/lwjgl/opengl/ARBShaderObjects.glCompileShaderARB (I)V
      // 34: iload 6
      // 36: ldc 35713
      // 38: nop
      // 39: invokestatic org/lwjgl/opengl/ARBShaderObjects.glGetObjectParameteriARB (II)I
      // 3c: iload 5
      // 3e: ifeq 7d
      // 41: ifne 7b
      // 44: goto 4b
      // 47: invokestatic ni3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4a: athrow
      // 4b: new java/lang/RuntimeException
      // 4e: dup
      // 4f: new java/lang/StringBuilder
      // 52: dup
      // 53: invokespecial java/lang/StringBuilder.<init> ()V
      // 56: sipush 20720
      // 59: ldc2_w 8256854343597579696
      // 5c: lload 3
      // 5d: lxor
      // 5e: invokedynamic y (IJ)Ljava/lang/String; bsm=ni3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: nop
      // 64: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 67: aload 0
      // 68: iload 6
      // 6a: invokespecial ni3.xcq (I)Ljava/lang/String;
      // 6d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 70: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 73: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/String;)V
      // 76: athrow
      // 77: invokestatic ni3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7a: athrow
      // 7b: iload 6
      // 7d: ireturn
      // 7e: astore 7
      // 80: iload 6
      // 82: invokestatic org/lwjgl/opengl/ARBShaderObjects.glDeleteObjectARB (I)V
      // 85: aload 7
      // 87: athrow
   }

   private String xcq(int var1) {
      return ARBShaderObjects.glGetInfoLogARB(var1, ARBShaderObjects.glGetObjectParameteriARB(var1, 35716));
   }

   public void u0e(String var1, int var2) {
      this.pwo.put(var1, var2);
   }

   public void j_r(String var1) {
      this.u0e(var1, GL20.glGetUniformLocation(this.t4u, var1));
   }

   public int jda(String var1) {
      return (Integer)this.pwo.get(var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5996309718758012144L, -5379211907414413629L, MethodHandles.lookup().lookupClass()).a(212168908583236L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 137428845731695L;
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
      String var6 = "Õ\u0092ÿ\u001dÑ\u0001\u0082k.ÇÖ\u0005T\u0085Zå\u0019\u008c=»éç1á´;¡\u0098\u0012Å\u009ayåË\u0013\u0082\u0085Û«\bgÖSE\u0098\u0090äç(\u0090âÏ¶h\u0093²B&û£9õÔô\u0005ÅVMUôïE\u0087\u009egI|%Ëíc^°¸(¦`\u0000E@`ý;Øå[\u0001Ç+Ö,\u0004'E\u0010Wî(\u0083ã¬¡\u009c\u00adÙ·]áÁ°\\á\u0090óÊ\u008cS\t\u0084D>O\u000bÖê\u0018÷É\u0019\u0094\u008e\\0Õ¤\u0006K\u0084ÔIóTþs";
      int var8 = "Õ\u0092ÿ\u001dÑ\u0001\u0082k.ÇÖ\u0005T\u0085Zå\u0019\u008c=»éç1á´;¡\u0098\u0012Å\u009ayåË\u0013\u0082\u0085Û«\bgÖSE\u0098\u0090äç(\u0090âÏ¶h\u0093²B&û£9õÔô\u0005ÅVMUôïE\u0087\u009egI|%Ëíc^°¸(¦`\u0000E@`ý;Øå[\u0001Ç+Ö,\u0004'E\u0010Wî(\u0083ã¬¡\u009c\u00adÙ·]áÁ°\\á\u0090óÊ\u008cS\t\u0084D>O\u000bÖê\u0018÷É\u0019\u0094\u008e\\0Õ¤\u0006K\u0084ÔIóTþs"
         .length();
      char var5 = '0';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            c = var9;
            d = new String[3];
            wc2 = c05.vz1();
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static Exception a(Exception var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 1919;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("ni3", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
         d[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("ni3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
