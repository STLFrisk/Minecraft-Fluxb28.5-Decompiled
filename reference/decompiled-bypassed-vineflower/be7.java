import com.google.common.collect.Lists;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class be7 {
   private static final Logger tu0;
   private final List dkr = Lists.newArrayList();
   private final List jdj = Lists.newArrayList();
   private int sij = 0;
   private int b3v = -1;
   private List sqx = Lists.newArrayList();
   private int c6r = -1;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public be7(be7 var1) {
      this();
      int var10000 = t9d.c();
      int var3 = 0;
      int var2 = var10000;

      while (true) {
         if (var3 < var1.pua()) {
            try {
               this.cmt(var1.c8h(var3));
               var3++;
               if (var2 != 0) {
                  break;
               }

               if (var2 == 0) {
                  continue;
               }
            } catch (oov var4) {
               throw a(var4);
            }
         }

         this.sij = var1.vy7();
         break;
      }
   }

   public be7() {
   }

   public void y1h() {
      this.dkr.clear();
      this.jdj.clear();
      this.b3v = -1;
      this.sqx.clear();
      this.c6r = -1;
      this.sij = 0;
   }

   public be7 cmt(n0i param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic be7.a J
      // 03: ldc2_w 100721982369293
      // 06: lxor
      // 07: lstore 2
      // 08: aload 1
      // 09: invokevirtual n0i.gqv ()Z
      // 0c: ifeq 39
      // 0f: aload 0
      // 10: invokespecial be7.i44 ()Z
      // 13: ifeq 39
      // 16: goto 1d
      // 19: invokestatic be7.a (Loov;)Loov;
      // 1c: athrow
      // 1d: getstatic be7.tu0 Lorg/apache/logging/log4j/Logger;
      // 20: sipush 32505
      // 23: ldc2_w 5728555363239614392
      // 26: lload 2
      // 27: lxor
      // 28: invokedynamic a (IJ)Ljava/lang/String; bsm=be7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d: nop
      // 2e: invokeinterface org/apache/logging/log4j/Logger.warn (Ljava/lang/String;)V 2
      // 33: aload 0
      // 34: areturn
      // 35: invokestatic be7.a (Loov;)Loov;
      // 38: athrow
      // 39: aload 0
      // 3a: getfield be7.dkr Ljava/util/List;
      // 3d: aload 1
      // 3e: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 43: pop
      // 44: aload 0
      // 45: getfield be7.jdj Ljava/util/List;
      // 48: aload 0
      // 49: getfield be7.sij I
      // 4c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 4f: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 54: pop
      // 55: getstatic be7$1.ba1 [I
      // 58: aload 1
      // 59: invokevirtual n0i.rk2 ()Ln0i$pto;
      // 5c: invokevirtual n0i$pto.ordinal ()I
      // 5f: iaload
      // 60: tableswitch 74 1 3 28 43 54
      // 7c: aload 0
      // 7d: aload 0
      // 7e: getfield be7.sij I
      // 81: putfield be7.c6r I
      // 84: goto aa
      // 87: invokestatic be7.a (Loov;)Loov;
      // 8a: athrow
      // 8b: aload 0
      // 8c: aload 0
      // 8d: getfield be7.sij I
      // 90: putfield be7.b3v I
      // 93: goto aa
      // 96: aload 0
      // 97: getfield be7.sqx Ljava/util/List;
      // 9a: aload 1
      // 9b: invokevirtual n0i.uik ()I
      // 9e: aload 0
      // 9f: getfield be7.sij I
      // a2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // a5: invokeinterface java/util/List.add (ILjava/lang/Object;)V 3
      // aa: aload 0
      // ab: dup
      // ac: getfield be7.sij I
      // af: aload 1
      // b0: invokevirtual n0i.j6_ ()I
      // b3: iadd
      // b4: putfield be7.sij I
      // b7: aload 0
      // b8: areturn
   }

   public boolean lhz() {
      int var1 = t9d.b();

      try {
         if (var1 == 0) {
            return (boolean)this.c6r;
         }

         if (this.c6r >= 0) {
            return (boolean)1;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return (boolean)0;
   }

   public int tab() {
      return this.c6r;
   }

   public boolean giz() {
      int var1 = t9d.b();

      try {
         if (var1 == 0) {
            return (boolean)this.b3v;
         }

         if (this.b3v >= 0) {
            return (boolean)1;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return (boolean)0;
   }

   public int t3m() {
      return this.b3v;
   }

   public boolean p74(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield be7.sqx Ljava/util/List;
      // 08: invokeinterface java/util/List.size ()I 1
      // 0d: bipush 1
      // 0e: isub
      // 0f: iload 2
      // 10: ifne 26
      // 13: iload 1
      // 14: if_icmplt 29
      // 17: goto 1e
      // 1a: invokestatic be7.a (Loov;)Loov;
      // 1d: athrow
      // 1e: bipush 1
      // 1f: goto 26
      // 22: invokestatic be7.a (Loov;)Loov;
      // 25: athrow
      // 26: goto 2a
      // 29: bipush 0
      // 2a: ireturn
   }

   public int _b0(int var1) {
      return (Integer)this.sqx.get(var1);
   }

   @Override
   public String toString() {
      long var1 = a ^ 12702252613831L;
      String var4 = a<"a">(31784, 3625348563040140193L ^ var1) + this.dkr.size() + a<"a">(18097, 7756537618901352763L ^ var1);
      int var10000 = t9d.b();
      int var5 = 0;
      int var3 = var10000;

      while (true) {
         if (var5 < this.dkr.size()) {
            var7 = var4 + ((n0i)this.dkr.get(var5)).toString();
            if (var3 == 0) {
               break;
            }

            var4 = var7;

            label30: {
               label29: {
                  try {
                     if (var3 == 0) {
                        break label30;
                     }

                     if (var5 == this.dkr.size() - 1) {
                        break label29;
                     }
                  } catch (oov var6) {
                     throw a(var6);
                  }

                  var4 = var4 + " ";
               }

               var5++;
            }

            if (var3 != 0) {
               continue;
            }
         }

         var7 = var4;
         break;
      }

      return var7;
   }

   private boolean i44() {
      int var1 = 0;

      for (int var2 = this.dkr.size(); var1 < var2; var1++) {
         n0i var3 = (n0i)this.dkr.get(var1);

         try {
            if (var3.gqv()) {
               return true;
            }
         } catch (oov var4) {
            throw a(var4);
         }
      }

      return false;
   }

   public int olc() {
      return this.vy7() / 4;
   }

   public int vy7() {
      return this.sij;
   }

   public List utn() {
      return this.dkr;
   }

   public int pua() {
      return this.dkr.size();
   }

   public n0i c8h(int var1) {
      return (n0i)this.dkr.get(var1);
   }

   public int ydd(int var1) {
      return (Integer)this.jdj.get(var1);
   }

   @Override
   public boolean equals(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifne 1b
      // 09: aload 1
      // 0a: if_acmpne 1a
      // 0d: goto 14
      // 10: invokestatic be7.a (Loov;)Loov;
      // 13: athrow
      // 14: bipush 1
      // 15: ireturn
      // 16: invokestatic be7.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 1
      // 1b: ifnull 96
      // 1e: aload 0
      // 1f: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 22: iload 2
      // 23: ifne 43
      // 26: goto 2d
      // 29: invokestatic be7.a (Loov;)Loov;
      // 2c: athrow
      // 2d: aload 1
      // 2e: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 31: if_acmpne 96
      // 34: goto 3b
      // 37: invokestatic be7.a (Loov;)Loov;
      // 3a: athrow
      // 3b: aload 1
      // 3c: goto 43
      // 3f: invokestatic be7.a (Loov;)Loov;
      // 42: athrow
      // 43: checkcast be7
      // 46: astore 3
      // 47: aload 0
      // 48: getfield be7.sij I
      // 4b: iload 2
      // 4c: ifne 7d
      // 4f: aload 3
      // 50: getfield be7.sij I
      // 53: if_icmpeq 65
      // 56: goto 5d
      // 59: invokestatic be7.a (Loov;)Loov;
      // 5c: athrow
      // 5d: bipush 0
      // 5e: goto 95
      // 61: invokestatic be7.a (Loov;)Loov;
      // 64: athrow
      // 65: aload 0
      // 66: getfield be7.dkr Ljava/util/List;
      // 69: aload 3
      // 6a: getfield be7.dkr Ljava/util/List;
      // 6d: iload 2
      // 6e: ifne 90
      // 71: invokeinterface java/util/List.equals (Ljava/lang/Object;)Z 2
      // 76: goto 7d
      // 79: invokestatic be7.a (Loov;)Loov;
      // 7c: athrow
      // 7d: ifne 88
      // 80: bipush 0
      // 81: goto 95
      // 84: invokestatic be7.a (Loov;)Loov;
      // 87: athrow
      // 88: aload 0
      // 89: getfield be7.jdj Ljava/util/List;
      // 8c: aload 3
      // 8d: getfield be7.jdj Ljava/util/List;
      // 90: invokeinterface java/util/List.equals (Ljava/lang/Object;)Z 2
      // 95: ireturn
      // 96: bipush 0
      // 97: ireturn
   }

   @Override
   public int hashCode() {
      int var1 = this.dkr.hashCode();
      var1 = 31 * var1 + this.jdj.hashCode();
      return 31 * var1 + this.sij;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1391509991934737836L, -7698810726023514896L, MethodHandles.lookup().lookupClass()).a(228751707763806L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 29643679476194L;
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
      String var6 = "~°Q,\nïM\u0017J{/ÑßßüÍ\u0095X\u0006\"\u0086<H(\u00adüÄ\u0096:\u001b×\u0001§A\u00ad1¶æß©\u008f\u0095Ê\u0097\u009a\b]Ï\u0084àét\u009f\u008dyÁËJì²\u001f )Þ´^\u0091óÉÿeP\u0080²¸ïÎÎNìûLkºêîÇ\u0082«½.\u0083\u008fá\u009dÚn\u0081ïþ\u0096üZ\u001eÙ[Þ²Á6Çµr\u0093\u0086\u000eqdÍÿT\u0089âKØ\u0010Ç\u009aÀz?Ý\u00189~\u0080\u0095?¤\f\u0096\u000b¬¢[#\u001a\u0006ðmT&èM¢·¢\u0000\u009c\u001a\u0018ìT\u008a\u0010sA]k\u008fnÔîîV=mxý$Ì\tì¢¯ âj[?Û`\bõü¡\u0095_?À\u0098(\u0092\u001e^ùË\u0088\u001c¸ï\u009b±\u009få»0<";
      int var8 = "~°Q,\nïM\u0017J{/ÑßßüÍ\u0095X\u0006\"\u0086<H(\u00adüÄ\u0096:\u001b×\u0001§A\u00ad1¶æß©\u008f\u0095Ê\u0097\u009a\b]Ï\u0084àét\u009f\u008dyÁËJì²\u001f )Þ´^\u0091óÉÿeP\u0080²¸ïÎÎNìûLkºêîÇ\u0082«½.\u0083\u008fá\u009dÚn\u0081ïþ\u0096üZ\u001eÙ[Þ²Á6Çµr\u0093\u0086\u000eqdÍÿT\u0089âKØ\u0010Ç\u009aÀz?Ý\u00189~\u0080\u0095?¤\f\u0096\u000b¬¢[#\u001a\u0006ðmT&èM¢·¢\u0000\u009c\u001a\u0018ìT\u008a\u0010sA]k\u008fnÔîîV=mxý$Ì\tì¢¯ âj[?Û`\bõü¡\u0095_?À\u0098(\u0092\u001e^ùË\u0088\u001c¸ï\u009b±\u009få»0<"
         .length();
      char var5 = 160;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[3];
            tu0 = LogManager.getLogger();
            return;
         }

         var5 = var6.charAt(var4);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16898;
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
            throw new RuntimeException("be7", var10);
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
         throw new RuntimeException("be7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
