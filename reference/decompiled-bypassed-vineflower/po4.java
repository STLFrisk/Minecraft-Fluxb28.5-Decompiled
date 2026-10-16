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

public class po4 extends itu {
   private final boolean ku0;
   private static final long b;
   private static final String[] h;
   private static final String[] i;
   private static final Map j = new HashMap(13);

   public po4(boolean var1) {
      super(0, 0.0F, false);
      this.ku0 = var1;
   }

   @Override
   public int ug7(erg param1) {
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
      // 05: invokestatic po4$i4c.qya (Lerg;)Lpo4$i4c;
      // 08: astore 3
      // 09: aload 0
      // 0a: getfield po4.ku0 Z
      // 0d: iload 2
      // 0e: ifne 31
      // 11: ifeq 3f
      // 14: goto 1b
      // 17: invokestatic po4.b (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 3
      // 1c: iload 2
      // 1d: ifne 40
      // 20: goto 27
      // 23: invokestatic po4.b (Loov;)Loov;
      // 26: athrow
      // 27: invokevirtual po4$i4c.xkf ()Z
      // 2a: goto 31
      // 2d: invokestatic po4.b (Loov;)Loov;
      // 30: athrow
      // 31: ifeq 3f
      // 34: aload 3
      // 35: invokevirtual po4$i4c.dxz ()I
      // 38: goto 43
      // 3b: invokestatic po4.b (Loov;)Loov;
      // 3e: athrow
      // 3f: aload 3
      // 40: invokevirtual po4$i4c.z0v ()I
      // 43: ireturn
   }

   @Override
   public float fko(erg param1) {
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
      // 05: invokestatic po4$i4c.qya (Lerg;)Lpo4$i4c;
      // 08: astore 3
      // 09: aload 0
      // 0a: getfield po4.ku0 Z
      // 0d: iload 2
      // 0e: ifne 31
      // 11: ifeq 3f
      // 14: goto 1b
      // 17: invokestatic po4.b (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 3
      // 1c: iload 2
      // 1d: ifne 40
      // 20: goto 27
      // 23: invokestatic po4.b (Loov;)Loov;
      // 26: athrow
      // 27: invokevirtual po4$i4c.xkf ()Z
      // 2a: goto 31
      // 2d: invokestatic po4.b (Loov;)Loov;
      // 30: athrow
      // 31: ifeq 3f
      // 34: aload 3
      // 35: invokevirtual po4$i4c.t05 ()F
      // 38: goto 43
      // 3b: invokestatic po4.b (Loov;)Loov;
      // 3e: athrow
      // 3f: aload 3
      // 40: invokevirtual po4$i4c.ri0 ()F
      // 43: freturn
   }

   @Override
   public String sdj(erg var1) {
      long var2 = b ^ 45320553735704L;

      try {
         if (po4$i4c.qya(var1) == po4$i4c.dv9) {
            return b<"k">(13955, 6548567645000348144L ^ var2);
         }
      } catch (oov var4) {
         throw b(var4);
      }

      return null;
   }

   @Override
   public void lb1(erg param1, t9d param2, ha9 param3) {
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
      // 06: invokestatic po4$i4c.qya (Lerg;)Lpo4$i4c;
      // 09: astore 5
      // 0b: iload 4
      // 0d: ifne 6c
      // 10: aload 5
      // 12: getstatic po4$i4c.dv9 Lpo4$i4c;
      // 15: if_acmpne 65
      // 18: goto 1f
      // 1b: invokestatic po4.b (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 3
      // 20: new sdj
      // 23: dup
      // 24: getstatic mcs.veq Lmcs;
      // 27: getfield mcs.zr9 I
      // 2a: sipush 1200
      // 2d: bipush 3
      // 2e: invokespecial sdj.<init> (III)V
      // 31: invokevirtual ha9.gmn (Lsdj;)V
      // 34: aload 3
      // 35: new sdj
      // 38: dup
      // 39: getstatic mcs.g98 Lmcs;
      // 3c: getfield mcs.zr9 I
      // 3f: sipush 300
      // 42: bipush 2
      // 43: invokespecial sdj.<init> (III)V
      // 46: invokevirtual ha9.gmn (Lsdj;)V
      // 49: aload 3
      // 4a: new sdj
      // 4d: dup
      // 4e: getstatic mcs.bla Lmcs;
      // 51: getfield mcs.zr9 I
      // 54: sipush 300
      // 57: bipush 1
      // 58: invokespecial sdj.<init> (III)V
      // 5b: invokevirtual ha9.gmn (Lsdj;)V
      // 5e: goto 65
      // 61: invokestatic po4.b (Loov;)Loov;
      // 64: athrow
      // 65: aload 0
      // 66: aload 1
      // 67: aload 2
      // 68: aload 3
      // 69: invokespecial itu.lb1 (Lerg;Lt9d;Lha9;)V
      // 6c: return
   }

   @Override
   public void jlj(u7m param1, uja param2, List param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic po4$i4c.values ()[Lpo4$i4c;
      // 03: astore 5
      // 05: invokestatic t9d.c ()I
      // 08: aload 5
      // 0a: arraylength
      // 0b: istore 6
      // 0d: istore 4
      // 0f: bipush 0
      // 10: istore 7
      // 12: iload 7
      // 14: iload 6
      // 16: if_icmpge 72
      // 19: aload 5
      // 1b: iload 7
      // 1d: aaload
      // 1e: astore 8
      // 20: aload 0
      // 21: getfield po4.ku0 Z
      // 24: iload 4
      // 26: ifne 69
      // 29: ifeq 4e
      // 2c: goto 33
      // 2f: invokestatic po4.b (Loov;)Loov;
      // 32: athrow
      // 33: aload 8
      // 35: invokevirtual po4$i4c.xkf ()Z
      // 38: iload 4
      // 3a: ifne 69
      // 3d: goto 44
      // 40: invokestatic po4.b (Loov;)Loov;
      // 43: athrow
      // 44: ifeq 6a
      // 47: goto 4e
      // 4a: invokestatic po4.b (Loov;)Loov;
      // 4d: athrow
      // 4e: aload 3
      // 4f: new erg
      // 52: dup
      // 53: aload 0
      // 54: bipush 1
      // 55: aload 8
      // 57: invokevirtual po4$i4c.iho ()I
      // 5a: invokespecial erg.<init> (Lu7m;II)V
      // 5d: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 62: goto 69
      // 65: invokestatic po4.b (Loov;)Loov;
      // 68: athrow
      // 69: pop
      // 6a: iinc 7 1
      // 6d: iload 4
      // 6f: ifeq 12
      // 72: return
   }

   @Override
   public String g56(erg param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic po4.b J
      // 03: ldc2_w 66569794121904
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.c ()I
      // 0b: istore 4
      // 0d: aload 1
      // 0e: invokestatic po4$i4c.qya (Lerg;)Lpo4$i4c;
      // 11: astore 5
      // 13: new java/lang/StringBuilder
      // 16: dup
      // 17: invokespecial java/lang/StringBuilder.<init> ()V
      // 1a: aload 0
      // 1b: invokevirtual po4.ayn ()Ljava/lang/String;
      // 1e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 21: ldc "."
      // 23: nop
      // 24: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 27: aload 5
      // 29: invokevirtual po4$i4c.u58 ()Ljava/lang/String;
      // 2c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2f: ldc "."
      // 31: nop
      // 32: iload 4
      // 34: ifne 72
      // 37: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3a: aload 0
      // 3b: getfield po4.ku0 Z
      // 3e: ifeq 65
      // 41: aload 5
      // 43: invokevirtual po4$i4c.xkf ()Z
      // 46: ifeq 65
      // 49: goto 50
      // 4c: invokestatic po4.b (Loov;)Loov;
      // 4f: athrow
      // 50: sipush 3452
      // 53: ldc2_w 2307504488468962468
      // 56: lload 2
      // 57: lxor
      // 58: invokedynamic k (IJ)Ljava/lang/String; bsm=po4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d: nop
      // 5e: goto 73
      // 61: invokestatic po4.b (Loov;)Loov;
      // 64: athrow
      // 65: sipush 8509
      // 68: ldc2_w 4771575588638028007
      // 6b: lload 2
      // 6c: lxor
      // 6d: invokedynamic k (IJ)Ljava/lang/String; bsm=po4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 72: nop
      // 73: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 76: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 79: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5289359067270182325L, -329863421930819593L, MethodHandles.lookup().lookupClass()).a(45198956949394L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 1586841788827L;
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
      String var6 = "\nTù\"èÛ\u0085Wi¡h! ì\u0005ý øÀ2\u0016gT\fô,\u0004À\u008b\u001b?\u0004\u0002Ö$Lbw2\u0094\u0099\u0088\u009bW÷\u0089\u0003çÛ\u0010Að0ûI±\u0089M¹BhÄiF|ç";
      int var8 = "\nTù\"èÛ\u0085Wi¡h! ì\u0005ý øÀ2\u0016gT\fô,\u0004À\u008b\u001b?\u0004\u0002Ö$Lbw2\u0094\u0099\u0088\u009bW÷\u0089\u0003çÛ\u0010Að0ûI±\u0089M¹BhÄiF|ç"
         .length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = c(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            h = var9;
            i = new String[3];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static oov b(oov var0) {
      return var0;
   }

   private static String c(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16406;
      if (i[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])j.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               j.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("po4", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = h[var5].getBytes("ISO-8859-1");
         i[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return i[var5];
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
         throw new RuntimeException("po4" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
