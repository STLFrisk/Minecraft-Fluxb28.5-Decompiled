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

public class xs7$ke4 extends gt4 {
   private final xdt vf3;
   private final String ixx;
   public float j74;
   public boolean fo2;
   public final xs7 q2x;
   private static final long b;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public xs7$ke4(xs7 var1, int var2, int var3, int var4, xdt var5, boolean var6) {
      long var7 = b ^ 102948991275469L;
      this.q2x = var1;
      super(var2, var3, var4, var6 ? 310 : 150, 20, "");
      this.j74 = 1.0F;
      this.vf3 = var5;
      this.ixx = fc1.gx1(b<"k">(18797, 5050114044312448272L ^ var7) + var5.gv1(), new Object[0]);
      this.frg = this.ixx + b<"k">(16692, 5152434716486690120L ^ var7) + var1.qte(var5);
      this.j74 = xs7.pbt(var1).a8l(var5);
   }

   @Override
   public int getHoverState(boolean var1) {
      return 0;
   }

   @Override
   public void mouseDragged(c05 param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic xs7$ke4.b J
      // 03: ldc2_w 46844515006439
      // 06: lxor
      // 07: lstore 4
      // 09: invokestatic t9d.b ()I
      // 0c: istore 6
      // 0e: aload 0
      // 0f: getfield xs7$ke4.c1s Z
      // 12: iload 6
      // 14: ifeq 38
      // 17: ifeq fd
      // 1a: goto 21
      // 1d: invokestatic xs7$ke4.c (Loov;)Loov;
      // 20: athrow
      // 21: aload 0
      // 22: iload 6
      // 24: ifeq d9
      // 27: goto 2e
      // 2a: invokestatic xs7$ke4.c (Loov;)Loov;
      // 2d: athrow
      // 2e: getfield xs7$ke4.fo2 Z
      // 31: goto 38
      // 34: invokestatic xs7$ke4.c (Loov;)Loov;
      // 37: athrow
      // 38: ifeq b0
      // 3b: aload 0
      // 3c: iload 2
      // 3d: aload 0
      // 3e: getfield xs7$ke4.ibo I
      // 41: bipush 4
      // 42: iadd
      // 43: isub
      // 44: i2f
      // 45: aload 0
      // 46: getfield xs7$ke4.s22 I
      // 49: bipush 8
      // 4b: isub
      // 4c: i2f
      // 4d: fdiv
      // 4e: putfield xs7$ke4.j74 F
      // 51: aload 0
      // 52: aload 0
      // 53: getfield xs7$ke4.j74 F
      // 56: fconst_0
      // 57: fconst_1
      // 58: invokestatic fe6._f3 (FFF)F
      // 5b: putfield xs7$ke4.j74 F
      // 5e: aload 1
      // 5f: getfield c05.oxn Lmoh;
      // 62: aload 0
      // 63: getfield xs7$ke4.vf3 Lxdt;
      // 66: aload 0
      // 67: getfield xs7$ke4.j74 F
      // 6a: invokevirtual moh.sr7 (Lxdt;F)V
      // 6d: aload 1
      // 6e: getfield c05.oxn Lmoh;
      // 71: invokevirtual moh.cmo ()V
      // 74: aload 0
      // 75: new java/lang/StringBuilder
      // 78: dup
      // 79: invokespecial java/lang/StringBuilder.<init> ()V
      // 7c: aload 0
      // 7d: getfield xs7$ke4.ixx Ljava/lang/String;
      // 80: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 83: sipush 29777
      // 86: ldc2_w 7071190229898327557
      // 89: lload 4
      // 8b: lxor
      // 8c: invokedynamic k (IJ)Ljava/lang/String; bsm=xs7$ke4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 91: nop
      // 92: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 95: aload 0
      // 96: getfield xs7$ke4.q2x Lxs7;
      // 99: aload 0
      // 9a: getfield xs7$ke4.vf3 Lxdt;
      // 9d: invokevirtual xs7.qte (Lxdt;)Ljava/lang/String;
      // a0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // a6: putfield xs7$ke4.frg Ljava/lang/String;
      // a9: goto b0
      // ac: invokestatic xs7$ke4.c (Loov;)Loov;
      // af: athrow
      // b0: fconst_1
      // b1: fconst_1
      // b2: fconst_1
      // b3: fconst_1
      // b4: invokestatic hzu.wn0 (FFFF)V
      // b7: aload 0
      // b8: aload 0
      // b9: getfield xs7$ke4.ibo I
      // bc: aload 0
      // bd: getfield xs7$ke4.j74 F
      // c0: aload 0
      // c1: getfield xs7$ke4.s22 I
      // c4: bipush 8
      // c6: isub
      // c7: i2f
      // c8: fmul
      // c9: f2i
      // ca: iadd
      // cb: aload 0
      // cc: getfield xs7$ke4.mij I
      // cf: bipush 0
      // d0: bipush 66
      // d2: bipush 4
      // d3: bipush 20
      // d5: invokevirtual xs7$ke4.mt4 (IIIIII)V
      // d8: aload 0
      // d9: aload 0
      // da: getfield xs7$ke4.ibo I
      // dd: aload 0
      // de: getfield xs7$ke4.j74 F
      // e1: aload 0
      // e2: getfield xs7$ke4.s22 I
      // e5: bipush 8
      // e7: isub
      // e8: i2f
      // e9: fmul
      // ea: f2i
      // eb: iadd
      // ec: bipush 4
      // ed: iadd
      // ee: aload 0
      // ef: getfield xs7$ke4.mij I
      // f2: sipush 196
      // f5: bipush 66
      // f7: bipush 4
      // f8: bipush 20
      // fa: invokevirtual xs7$ke4.mt4 (IIIIII)V
      // fd: return
   }

   @Override
   public boolean mousePressed(c05 param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic xs7$ke4.b J
      // 03: ldc2_w 63470125542119
      // 06: lxor
      // 07: lstore 4
      // 09: invokestatic t9d.b ()I
      // 0c: istore 6
      // 0e: aload 0
      // 0f: aload 1
      // 10: iload 2
      // 11: iload 3
      // 12: invokespecial gt4.mousePressed (Lc05;II)Z
      // 15: iload 6
      // 17: ifeq 9e
      // 1a: ifeq 9d
      // 1d: goto 24
      // 20: invokestatic xs7$ke4.c (Loov;)Loov;
      // 23: athrow
      // 24: aload 0
      // 25: iload 2
      // 26: aload 0
      // 27: getfield xs7$ke4.ibo I
      // 2a: bipush 4
      // 2b: iadd
      // 2c: isub
      // 2d: i2f
      // 2e: aload 0
      // 2f: getfield xs7$ke4.s22 I
      // 32: bipush 8
      // 34: isub
      // 35: i2f
      // 36: fdiv
      // 37: putfield xs7$ke4.j74 F
      // 3a: aload 0
      // 3b: aload 0
      // 3c: getfield xs7$ke4.j74 F
      // 3f: fconst_0
      // 40: fconst_1
      // 41: invokestatic fe6._f3 (FFF)F
      // 44: putfield xs7$ke4.j74 F
      // 47: aload 1
      // 48: getfield c05.oxn Lmoh;
      // 4b: aload 0
      // 4c: getfield xs7$ke4.vf3 Lxdt;
      // 4f: aload 0
      // 50: getfield xs7$ke4.j74 F
      // 53: invokevirtual moh.sr7 (Lxdt;F)V
      // 56: aload 1
      // 57: getfield c05.oxn Lmoh;
      // 5a: invokevirtual moh.cmo ()V
      // 5d: aload 0
      // 5e: new java/lang/StringBuilder
      // 61: dup
      // 62: invokespecial java/lang/StringBuilder.<init> ()V
      // 65: aload 0
      // 66: getfield xs7$ke4.ixx Ljava/lang/String;
      // 69: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6c: sipush 16692
      // 6f: ldc2_w 5152474262871940706
      // 72: lload 4
      // 74: lxor
      // 75: invokedynamic k (IJ)Ljava/lang/String; bsm=xs7$ke4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7a: nop
      // 7b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7e: aload 0
      // 7f: getfield xs7$ke4.q2x Lxs7;
      // 82: aload 0
      // 83: getfield xs7$ke4.vf3 Lxdt;
      // 86: invokevirtual xs7.qte (Lxdt;)Ljava/lang/String;
      // 89: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 8f: putfield xs7$ke4.frg Ljava/lang/String;
      // 92: aload 0
      // 93: bipush 1
      // 94: putfield xs7$ke4.fo2 Z
      // 97: bipush 1
      // 98: ireturn
      // 99: invokestatic xs7$ke4.c (Loov;)Loov;
      // 9c: athrow
      // 9d: bipush 0
      // 9e: ireturn
   }

   @Override
   public void f06(dbu var1) {
   }

   @Override
   public void mouseReleased(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic xs7$ke4.b J
      // 03: ldc2_w 49421978454565
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic t9d.c ()I
      // 0b: istore 5
      // 0d: aload 0
      // 0e: iload 5
      // 10: ifne 82
      // 13: getfield xs7$ke4.fo2 Z
      // 16: ifeq 81
      // 19: goto 20
      // 1c: invokestatic xs7$ke4.c (Loov;)Loov;
      // 1f: athrow
      // 20: aload 0
      // 21: iload 5
      // 23: ifne 4d
      // 26: goto 2d
      // 29: invokestatic xs7$ke4.c (Loov;)Loov;
      // 2c: athrow
      // 2d: getfield xs7$ke4.vf3 Lxdt;
      // 30: getstatic xdt.adu Lxdt;
      // 33: if_acmpne 45
      // 36: goto 3d
      // 39: invokestatic xs7$ke4.c (Loov;)Loov;
      // 3c: athrow
      // 3d: fconst_1
      // 3e: fstore 6
      // 40: iload 5
      // 42: ifeq 5b
      // 45: aload 0
      // 46: goto 4d
      // 49: invokestatic xs7$ke4.c (Loov;)Loov;
      // 4c: athrow
      // 4d: getfield xs7$ke4.q2x Lxs7;
      // 50: invokestatic xs7.pbt (Lxs7;)Lmoh;
      // 53: aload 0
      // 54: getfield xs7$ke4.vf3 Lxdt;
      // 57: invokevirtual moh.a8l (Lxdt;)F
      // 5a: pop
      // 5b: aload 0
      // 5c: getfield xs7$ke4.q2x Lxs7;
      // 5f: getfield xs7.f41 Lc05;
      // 62: invokevirtual c05.yp9 ()Ldbu;
      // 65: new gdz
      // 68: dup
      // 69: sipush 25408
      // 6c: ldc2_w 2761731787537390807
      // 6f: lload 3
      // 70: lxor
      // 71: invokedynamic k (IJ)Ljava/lang/String; bsm=xs7$ke4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 76: nop
      // 77: invokespecial gdz.<init> (Ljava/lang/String;)V
      // 7a: fconst_1
      // 7b: invokestatic vs1._e_ (Lgdz;F)Lvs1;
      // 7e: invokevirtual dbu.mak (Ljp4;)V
      // 81: aload 0
      // 82: bipush 0
      // 83: putfield xs7$ke4.fo2 Z
      // 86: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3021306768548506895L, 1263644931966594638L, MethodHandles.lookup().lookupClass()).a(35201617039936L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 26330362985377L;
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
      String var6 = "¬É\u000b|Þ1\u0083\u0006A\u0088\"-¿\u009e\t\u009e\u009b\u0083h\u0098¶5\u0082D+\\\u0019Y¹\f.Ðt÷\u0087'\u00adh]\u0091\u0010\u008aV\u0016ÐÜâÎ%J\u000e\u0089<Ípsý";
      int var8 = "¬É\u000b|Þ1\u0083\u0006A\u0088\"-¿\u009e\t\u009e\u009b\u0083h\u0098¶5\u0082D+\\\u0019Y¹\f.Ðt÷\u0087'\u00adh]\u0091\u0010\u008aV\u0016ÐÜâÎ%J\u000e\u0089<Ípsý"
         .length();
      char var5 = '(';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = c(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     f = var9;
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

                  var6 = "¦kÿÑ\u009fTj\u0007\u0090ÊaÏç°ZÀ¤ëU\u001e\u0084¼B(\u0010g$¿õ\u000eØÖ\u0011üO\u0015[\u0099Â\u0002Ñ";
                  var8 = "¦kÿÑ\u009fTj\u0007\u0090ÊaÏç°ZÀ¤ëU\u001e\u0084¼B(\u0010g$¿õ\u000eØÖ\u0011üO\u0015[\u0099Â\u0002Ñ".length();
                  var5 = 24;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static oov c(oov var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 897;
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
            throw new RuntimeException("xs7$ke4", var10);
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
         g[var5] = c(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("xs7$ke4" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
