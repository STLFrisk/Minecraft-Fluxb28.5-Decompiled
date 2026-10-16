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

public class r1l {
   public String bx0;
   public String s4c;
   public String y17;
   public String o_g;
   public long zab;
   public int e39;
   public String o5_;
   public boolean mu_;
   public String pmw;
   private r1l$pyk t91;
   private String rv9;
   private boolean idg;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public r1l(String var1, String var2, boolean var3) {
      long var4 = a ^ 2984589088756L;
      super();
      this.e39 = 47;
      this.o5_ = a<"l">(4238, 5344535148326651318L ^ var4);
      this.t91 = r1l$pyk.h8i;
      this.bx0 = var1;
      this.s4c = var2;
      this.idg = var3;
   }

   public bdo gsy() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic r1l.a J
      // 03: ldc2_w 106439476247244
      // 06: lxor
      // 07: lstore 1
      // 08: new bdo
      // 0b: dup
      // 0c: invokespecial bdo.<init> ()V
      // 0f: astore 4
      // 11: aload 4
      // 13: sipush 13916
      // 16: ldc2_w 1822427192268721758
      // 19: lload 1
      // 1a: lxor
      // 1b: invokedynamic l (IJ)Ljava/lang/String; bsm=r1l.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20: nop
      // 21: aload 0
      // 22: getfield r1l.bx0 Ljava/lang/String;
      // 25: invokevirtual bdo.rjq (Ljava/lang/String;Ljava/lang/String;)V
      // 28: invokestatic t9d.c ()I
      // 2b: aload 4
      // 2d: sipush 20238
      // 30: ldc2_w 3847451241247897353
      // 33: lload 1
      // 34: lxor
      // 35: invokedynamic l (IJ)Ljava/lang/String; bsm=r1l.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: nop
      // 3b: aload 0
      // 3c: getfield r1l.s4c Ljava/lang/String;
      // 3f: invokevirtual bdo.rjq (Ljava/lang/String;Ljava/lang/String;)V
      // 42: istore 3
      // 43: aload 0
      // 44: iload 3
      // 45: ifne 74
      // 48: getfield r1l.rv9 Ljava/lang/String;
      // 4b: ifnull 73
      // 4e: goto 55
      // 51: invokestatic r1l.a (Loov;)Loov;
      // 54: athrow
      // 55: aload 4
      // 57: sipush 24036
      // 5a: ldc2_w 1684342058565297634
      // 5d: lload 1
      // 5e: lxor
      // 5f: invokedynamic l (IJ)Ljava/lang/String; bsm=r1l.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64: nop
      // 65: aload 0
      // 66: getfield r1l.rv9 Ljava/lang/String;
      // 69: invokevirtual bdo.rjq (Ljava/lang/String;Ljava/lang/String;)V
      // 6c: goto 73
      // 6f: invokestatic r1l.a (Loov;)Loov;
      // 72: athrow
      // 73: aload 0
      // 74: getfield r1l.t91 Lr1l$pyk;
      // 77: getstatic r1l$pyk.mw_ Lr1l$pyk;
      // 7a: iload 3
      // 7b: ifne b5
      // 7e: if_acmpne a7
      // 81: goto 88
      // 84: invokestatic r1l.a (Loov;)Loov;
      // 87: athrow
      // 88: aload 4
      // 8a: sipush 24618
      // 8d: ldc2_w 617646823142021158
      // 90: lload 1
      // 91: lxor
      // 92: invokedynamic l (IJ)Ljava/lang/String; bsm=r1l.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97: nop
      // 98: bipush 1
      // 99: invokevirtual bdo.zyu (Ljava/lang/String;Z)V
      // 9c: iload 3
      // 9d: ifeq d3
      // a0: goto a7
      // a3: invokestatic r1l.a (Loov;)Loov;
      // a6: athrow
      // a7: aload 0
      // a8: getfield r1l.t91 Lr1l$pyk;
      // ab: getstatic r1l$pyk.yh3 Lr1l$pyk;
      // ae: goto b5
      // b1: invokestatic r1l.a (Loov;)Loov;
      // b4: athrow
      // b5: if_acmpne d3
      // b8: aload 4
      // ba: sipush 5660
      // bd: ldc2_w 6611390437145554461
      // c0: lload 1
      // c1: lxor
      // c2: invokedynamic l (IJ)Ljava/lang/String; bsm=r1l.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c7: nop
      // c8: bipush 0
      // c9: invokevirtual bdo.zyu (Ljava/lang/String;Z)V
      // cc: goto d3
      // cf: invokestatic r1l.a (Loov;)Loov;
      // d2: athrow
      // d3: aload 4
      // d5: areturn
   }

   public r1l$pyk u9n() {
      return this.t91;
   }

   public void l69(r1l$pyk var1) {
      this.t91 = var1;
   }

   public static r1l tx7(bdo param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic r1l.a J
      // 03: ldc2_w 105917449169191
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic t9d.b ()I
      // 0b: istore 3
      // 0c: new r1l
      // 0f: dup
      // 10: aload 0
      // 11: sipush 5443
      // 14: ldc2_w 2114402737112399531
      // 17: lload 1
      // 18: lxor
      // 19: invokedynamic l (IJ)Ljava/lang/String; bsm=r1l.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e: nop
      // 1f: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 22: aload 0
      // 23: sipush 6775
      // 26: ldc2_w 1613373970424738201
      // 29: lload 1
      // 2a: lxor
      // 2b: invokedynamic l (IJ)Ljava/lang/String; bsm=r1l.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30: nop
      // 31: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 34: bipush 0
      // 35: invokespecial r1l.<init> (Ljava/lang/String;Ljava/lang/String;Z)V
      // 38: astore 4
      // 3a: aload 0
      // 3b: sipush 2870
      // 3e: ldc2_w 1111364531973234905
      // 41: lload 1
      // 42: lxor
      // 43: invokedynamic l (IJ)Ljava/lang/String; bsm=r1l.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: nop
      // 49: bipush 8
      // 4b: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 4e: iload 3
      // 4f: ifeq 8d
      // 52: ifeq 7a
      // 55: goto 5c
      // 58: invokestatic r1l.a (Loov;)Loov;
      // 5b: athrow
      // 5c: aload 4
      // 5e: aload 0
      // 5f: sipush 2870
      // 62: ldc2_w 1111364531973234905
      // 65: lload 1
      // 66: lxor
      // 67: invokedynamic l (IJ)Ljava/lang/String; bsm=r1l.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c: nop
      // 6d: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 70: invokevirtual r1l.nla (Ljava/lang/String;)V
      // 73: goto 7a
      // 76: invokestatic r1l.a (Loov;)Loov;
      // 79: athrow
      // 7a: aload 0
      // 7b: sipush 5660
      // 7e: ldc2_w 6611389842095652342
      // 81: lload 1
      // 82: lxor
      // 83: invokedynamic l (IJ)Ljava/lang/String; bsm=r1l.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 88: nop
      // 89: bipush 1
      // 8a: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 8d: iload 3
      // 8e: ifeq b4
      // 91: ifeq dd
      // 94: goto 9b
      // 97: invokestatic r1l.a (Loov;)Loov;
      // 9a: athrow
      // 9b: aload 0
      // 9c: sipush 5660
      // 9f: ldc2_w 6611389842095652342
      // a2: lload 1
      // a3: lxor
      // a4: invokedynamic l (IJ)Ljava/lang/String; bsm=r1l.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a9: nop
      // aa: invokevirtual bdo.dvl (Ljava/lang/String;)Z
      // ad: goto b4
      // b0: invokestatic r1l.a (Loov;)Loov;
      // b3: athrow
      // b4: ifeq ca
      // b7: aload 4
      // b9: getstatic r1l$pyk.mw_ Lr1l$pyk;
      // bc: invokevirtual r1l.l69 (Lr1l$pyk;)V
      // bf: iload 3
      // c0: ifne ec
      // c3: goto ca
      // c6: invokestatic r1l.a (Loov;)Loov;
      // c9: athrow
      // ca: aload 4
      // cc: getstatic r1l$pyk.yh3 Lr1l$pyk;
      // cf: invokevirtual r1l.l69 (Lr1l$pyk;)V
      // d2: iload 3
      // d3: ifne ec
      // d6: goto dd
      // d9: invokestatic r1l.a (Loov;)Loov;
      // dc: athrow
      // dd: aload 4
      // df: getstatic r1l$pyk.h8i Lr1l$pyk;
      // e2: invokevirtual r1l.l69 (Lr1l$pyk;)V
      // e5: goto ec
      // e8: invokestatic r1l.a (Loov;)Loov;
      // eb: athrow
      // ec: aload 4
      // ee: areturn
   }

   public String lry() {
      return this.rv9;
   }

   public void nla(String var1) {
      this.rv9 = var1;
   }

   public boolean g8f() {
      return this.idg;
   }

   public void dic(r1l var1) {
      this.s4c = var1.s4c;
      this.bx0 = var1.bx0;
      this.l69(var1.u9n());
      this.rv9 = var1.rv9;
      this.idg = var1.idg;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(906686532000416327L, 8917648717835302621L, MethodHandles.lookup().lookupClass()).a(21125690927813L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 100275180370328L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[9];
      int var7 = 0;
      String var6 = "¶\u0017¥Ñ%wªz¶*Tð\u008cÜ å\u0010Cü\u001b ü\u008fÏË2Ï\u0085¹<Èrr\u0010Sf\t¸\n#\u001ec\u008cYÓ\ræ\u0005Bl\u0010Ó³ê÷\t\u0099×øð#½\u001dµå±û\u0018Ï-ç¸\u0089\u00120á¼{K_µ°å\nXÅç¡Çð\\[\u0018\u001a\n\u009e\rW\u008b;ªðõÐØ\u001e¥p\rã\u0011\u008dWø©óë\u0010QîÿVû\u0015ÿwà hýé<I½";
      int var8 = "¶\u0017¥Ñ%wªz¶*Tð\u008cÜ å\u0010Cü\u001b ü\u008fÏË2Ï\u0085¹<Èrr\u0010Sf\t¸\n#\u001ec\u008cYÓ\ræ\u0005Bl\u0010Ó³ê÷\t\u0099×øð#½\u001dµå±û\u0018Ï-ç¸\u0089\u00120á¼{K_µ°å\nXÅç¡Çð\\[\u0018\u001a\n\u009e\rW\u008b;ªðõÐØ\u001e¥p\rã\u0011\u008dWø©óë\u0010QîÿVû\u0015ÿwà hýé<I½"
         .length();
      char var5 = 16;
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
                     c = new String[9];
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

                  var6 = "\u0091\u0018¾à\u0000\u0010\u0080=°\u0090µ\u0003®\u0018Ö\u0011\u0018§OÜãA´\u0011¿\u0007\u0087\u0094\u001f\u009c\t¨\n\f\u000eWÓ!ÏR\u009c";
                  var8 = "\u0091\u0018¾à\u0000\u0010\u0080=°\u0090µ\u0003®\u0018Ö\u0011\u0018§OÜãA´\u0011¿\u0007\u0087\u0094\u001f\u009c\t¨\n\f\u000eWÓ!ÏR\u009c"
                     .length();
                  var5 = 16;
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 18347;
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
            throw new RuntimeException("r1l", var10);
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
         throw new RuntimeException("r1l" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
