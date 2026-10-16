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
import org.lwjgl.LWJGLException;
import org.lwjgl.input.Mouse;

public class skj extends zg9 {
   public String b7a;
   public boolean d3z;
   public boolean e89;
   public int jfb;
   public int i0k;
   public static q6h us5;
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public skj(rsi param1, rsi param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic skj.a J
      // 003: ldc2_w 120227163044326
      // 006: lxor
      // 007: lstore 3
      // 008: aload 0
      // 009: new j_9
      // 00c: dup
      // 00d: aload 1
      // 00e: aload 2
      // 00f: invokestatic c05.vz1 ()Lc05;
      // 012: getfield c05.vg8 Ll86;
      // 015: invokespecial j_9.<init> (Lrsi;Lrsi;Lha9;)V
      // 018: invokespecial zg9.<init> (L_jc;)V
      // 01b: aload 0
      // 01c: aload 1
      // 01d: putfield skj.j4r Lrsi;
      // 020: invokestatic t9d.c ()I
      // 023: aload 0
      // 024: aload 2
      // 025: putfield skj.ml8 Lrsi;
      // 028: aload 0
      // 029: bipush 0
      // 02a: putfield skj.w2p Z
      // 02d: istore 5
      // 02f: sipush 222
      // 032: istore 6
      // 034: iload 6
      // 036: bipush 108
      // 038: isub
      // 039: istore 7
      // 03b: aload 0
      // 03c: aload 2
      // 03d: invokeinterface rsi.opt ()I 1
      // 042: bipush 9
      // 044: idiv
      // 045: putfield skj.sat I
      // 048: aload 0
      // 049: iload 7
      // 04b: aload 0
      // 04c: getfield skj.sat I
      // 04f: bipush 18
      // 051: imul
      // 052: iadd
      // 053: putfield skj.g6l I
      // 056: aload 0
      // 057: aload 0
      // 058: getfield skj.ml8 Lrsi;
      // 05b: invokeinterface rsi.xyw ()Lekw; 1
      // 060: invokeinterface ekw.rnh ()Ljava/lang/String; 1
      // 065: putfield skj.b7a Ljava/lang/String;
      // 068: aload 0
      // 069: aload 0
      // 06a: getfield skj.b7a Ljava/lang/String;
      // 06d: sipush 23365
      // 070: ldc2_w 1751271940854399359
      // 073: lload 3
      // 074: lxor
      // 075: invokedynamic f (IJ)Ljava/lang/String; bsm=skj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07a: nop
      // 07b: invokestatic orr.zgh (Ljava/lang/String;)Ljava/lang/String;
      // 07e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 081: iload 5
      // 083: ifne 0bf
      // 086: ifne 0be
      // 089: goto 090
      // 08c: invokestatic skj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08f: athrow
      // 090: aload 0
      // 091: getfield skj.b7a Ljava/lang/String;
      // 094: sipush 8279
      // 097: ldc2_w 5329645356986251884
      // 09a: lload 3
      // 09b: lxor
      // 09c: invokedynamic f (IJ)Ljava/lang/String; bsm=skj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: nop
      // 0a2: invokestatic orr.zgh (Ljava/lang/String;)Ljava/lang/String;
      // 0a5: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0a8: iload 5
      // 0aa: ifne 0bf
      // 0ad: goto 0b4
      // 0b0: invokestatic skj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b3: athrow
      // 0b4: ifeq 0c2
      // 0b7: goto 0be
      // 0ba: invokestatic skj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bd: athrow
      // 0be: bipush 1
      // 0bf: goto 0c3
      // 0c2: bipush 0
      // 0c3: dup_x1
      // 0c4: putfield skj.d3z Z
      // 0c7: putstatic sm0.m9w Z
      // 0ca: aload 0
      // 0cb: getstatic kgt.l12 Lsm0;
      // 0ce: invokevirtual sm0.klu ()Z
      // 0d1: iload 5
      // 0d3: ifne 0ed
      // 0d6: ifeq 11a
      // 0d9: goto 0e0
      // 0dc: invokestatic skj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0df: athrow
      // 0e0: getstatic sm0.swk Lcn7;
      // 0e3: invokevirtual cn7.g7m ()Z
      // 0e6: goto 0ed
      // 0e9: invokestatic skj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ec: athrow
      // 0ed: iload 5
      // 0ef: ifne 107
      // 0f2: ifeq 11a
      // 0f5: goto 0fc
      // 0f8: invokestatic skj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fb: athrow
      // 0fc: aload 0
      // 0fd: getfield skj.d3z Z
      // 100: goto 107
      // 103: invokestatic skj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 106: athrow
      // 107: iload 5
      // 109: ifne 117
      // 10c: ifeq 11a
      // 10f: goto 116
      // 112: invokestatic skj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 115: athrow
      // 116: bipush 1
      // 117: goto 11b
      // 11a: bipush 0
      // 11b: putfield skj.e89 Z
      // 11e: aload 0
      // 11f: iload 5
      // 121: ifne 16a
      // 124: getfield skj.e89 Z
      // 127: ifeq 169
      // 12a: goto 131
      // 12d: invokestatic skj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 130: athrow
      // 131: invokestatic org/lwjgl/input/Cursor.getMinCursorSize ()I
      // 134: istore 8
      // 136: iload 8
      // 138: iload 8
      // 13a: imul
      // 13b: invokestatic org/lwjgl/BufferUtils.createIntBuffer (I)Ljava/nio/IntBuffer;
      // 13e: astore 9
      // 140: new org/lwjgl/input/Cursor
      // 143: dup
      // 144: iload 8
      // 146: iload 8
      // 148: iload 8
      // 14a: bipush 2
      // 14b: idiv
      // 14c: iload 8
      // 14e: bipush 2
      // 14f: idiv
      // 150: bipush 1
      // 151: aload 9
      // 153: aconst_null
      // 154: invokespecial org/lwjgl/input/Cursor.<init> (IIIIILjava/nio/IntBuffer;Ljava/nio/IntBuffer;)V
      // 157: astore 10
      // 159: aload 10
      // 15b: invokestatic org/lwjgl/input/Mouse.setNativeCursor (Lorg/lwjgl/input/Cursor;)Lorg/lwjgl/input/Cursor;
      // 15e: pop
      // 15f: goto 169
      // 162: astore 8
      // 164: aload 8
      // 166: invokevirtual java/lang/Exception.printStackTrace ()V
      // 169: aload 0
      // 16a: aload 0
      // 16b: bipush -1
      // 16c: dup_x1
      // 16d: putfield skj.i0k I
      // 170: putfield skj.jfb I
      // 173: getstatic skj.us5 Lq6h;
      // 176: invokevirtual q6h.u1k ()V
      // 179: return
   }

   @Override
   public void drawScreen(int param1, int param2, float param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic skj.a J
      // 03: ldc2_w 72151214123188
      // 06: lxor
      // 07: lstore 4
      // 09: invokestatic t9d.c ()I
      // 0c: istore 6
      // 0e: aload 0
      // 0f: iload 6
      // 11: ifne f2
      // 14: getfield skj.e89 Z
      // 17: ifeq ea
      // 1a: goto 21
      // 1d: invokestatic skj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: getstatic jsr.yk7 Lcyb;
      // 24: sipush 14145
      // 27: ldc2_w 8103273724488858667
      // 2a: lload 4
      // 2c: lxor
      // 2d: invokedynamic f (IJ)Ljava/lang/String; bsm=skj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32: nop
      // 33: aload 0
      // 34: getfield skj.dt7 I
      // 37: bipush 2
      // 38: idiv
      // 39: i2f
      // 3a: aload 0
      // 3b: getfield skj.o1e I
      // 3e: bipush 2
      // 3f: idiv
      // 40: bipush 20
      // 42: isub
      // 43: i2f
      // 44: ldc 16777215
      // 46: nop
      // 47: invokevirtual cyb.os_ (Ljava/lang/String;FFI)V
      // 4a: aload 0
      // 4b: getfield skj.jfb I
      // 4e: bipush -1
      // 4f: iload 6
      // 51: ifne 96
      // 54: goto 5b
      // 57: invokestatic skj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5a: athrow
      // 5b: if_icmpne 91
      // 5e: goto 65
      // 61: invokestatic skj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 64: athrow
      // 65: aload 0
      // 66: getfield skj.i0k I
      // 69: bipush -1
      // 6a: iload 6
      // 6c: ifne 96
      // 6f: goto 76
      // 72: invokestatic skj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 75: athrow
      // 76: if_icmpne 91
      // 79: goto 80
      // 7c: invokestatic skj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7f: athrow
      // 80: aload 0
      // 81: iload 1
      // 82: putfield skj.jfb I
      // 85: aload 0
      // 86: iload 2
      // 87: putfield skj.i0k I
      // 8a: goto 91
      // 8d: invokestatic skj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 90: athrow
      // 91: iload 1
      // 92: aload 0
      // 93: getfield skj.jfb I
      // 96: isub
      // 97: istore 7
      // 99: iload 2
      // 9a: aload 0
      // 9b: getfield skj.i0k I
      // 9e: isub
      // 9f: istore 8
      // a1: aload 0
      // a2: getfield skj.f41 Lc05;
      // a5: getfield c05.vg8 Ll86;
      // a8: dup
      // a9: getfield l86.x5k F
      // ac: iload 7
      // ae: i2f
      // af: aload 0
      // b0: getfield skj.f41 Lc05;
      // b3: getfield c05.oxn Lmoh;
      // b6: getfield moh.igw F
      // b9: fmul
      // ba: fadd
      // bb: putfield l86.x5k F
      // be: aload 0
      // bf: getfield skj.f41 Lc05;
      // c2: getfield c05.vg8 Ll86;
      // c5: dup
      // c6: getfield l86.y2i F
      // c9: iload 8
      // cb: i2f
      // cc: aload 0
      // cd: getfield skj.f41 Lc05;
      // d0: getfield c05.oxn Lmoh;
      // d3: getfield moh.igw F
      // d6: fmul
      // d7: fadd
      // d8: putfield l86.y2i F
      // db: aload 0
      // dc: iload 1
      // dd: putfield skj.jfb I
      // e0: aload 0
      // e1: iload 2
      // e2: putfield skj.i0k I
      // e5: iload 6
      // e7: ifeq f8
      // ea: aload 0
      // eb: goto f2
      // ee: invokestatic skj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // f1: athrow
      // f2: iload 1
      // f3: iload 2
      // f4: fload 3
      // f5: invokespecial zg9.drawScreen (IIF)V
      // f8: return
   }

   @Override
   public void onGuiClosed() {
      try {
         Mouse.setNativeCursor(null);
      } catch (LWJGLException var2) {
         var2.printStackTrace();
      }

      super.onGuiClosed();
   }

   @Override
   public void qw3(int var1, int var2) {
      this.f41.tx1.eh6(this.ml8.xyw().rnh(), 8.0F, 6.0F, 4210752);
      this.f41.tx1.eh6(this.j4r.xyw().rnh(), 8.0F, (float)(this.g6l - 96 + 2), 4210752);
   }

   @Override
   public void actionPerformed(gt4 var1) {
   }

   @Override
   public void cft(float var1, int var2, int var3) {
      hzu.wn0(1.0F, 1.0F, 1.0F, 1.0F);
      this.f41.l22().anl(u3q);
      int var4 = (this.dt7 - this.poy) / 2;
      int var5 = (this.o1e - this.g6l) / 2;
      this.mt4(var4, var5, 0, 0, this.poy, this.sat * 18 + 17);
      this.mt4(var4, var5 + this.sat * 18 + 17, 0, 126, this.poy, 96);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-7098372049041816536L, -3369266254711165500L, MethodHandles.lookup().lookupClass()).a(135114682197452L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 98941390546105L;
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
      String var4 = " \u001b¦\u009c\u008d{Â¡n9.\u0099úãð¨»¤'T²\u009b\u00818(ú\u0092ªë#=zGÀÉ\u00870IW²\u009dêí.Ú½çOwe2òÙF_d¢÷¬,á\u008f`P\u000b";
      int var6 = " \u001b¦\u009c\u008d{Â¡n9.\u0099úãð¨»¤'T²\u009b\u00818(ú\u0092ªë#=zGÀÉ\u00870IW²\u009dêí.Ú½çOwe2òÙF_d¢÷¬,á\u008f`P\u000b".length();
      char var3 = 24;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = d(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     b = var7;
                     g = new String[4];
                     u3q = new gdz(b<"f">(20386, 907866884165224644L ^ var9));
                     us5 = new q6h();
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

                  var4 = "Ý\u001e)-å\u0095¨ùx\n<7&Põ¢Õ«|\u008c0¡»Ü\u001aÇ`\u0095Î¬YÂ@L\f#\u0099¼~;\\»\u001eÔ\f\\\u008c±ã9ô]-sP9¹ª{-\u000f\u008afI \u0084ÞØmSÓKØô6\u008c;\u0091\u0011n-=oëÌC=6\u008fÿ,XG\u009b¡a7";
                  var6 = "Ý\u001e)-å\u0095¨ùx\n<7&Põ¢Õ«|\u008c0¡»Ü\u001aÇ`\u0095Î¬YÂ@L\f#\u0099¼~;\\»\u001eÔ\f\\\u008c±ã9ô]-sP9¹ª{-\u000f\u008afI \u0084ÞØmSÓKØô6\u008c;\u0091\u0011n-=oëÌC=6\u008fÿ,XG\u009b¡a7"
                     .length();
                  var3 = ' ';
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
      }
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   private static String d(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11098;
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
            throw new RuntimeException("skj", var10);
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
         g[var5] = d(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("skj" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
