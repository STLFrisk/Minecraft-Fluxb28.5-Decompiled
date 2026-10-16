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

public enum _0t$fty implements v4k {
   public static final _0t$fty usm;
   public static final _0t$fty ewf;
   public static final _0t$fty cqa;
   public static final _0t$fty p2o;
   public static final _0t$fty d5e;
   public static final _0t$fty hnr;
   public static final _0t$fty q5b;
   public static final _0t$fty zoq;
   private static final _0t$fty[] q_m;
   private final int g4_;
   private final String ty5;
   private final vt2 f7n;
   private static final _0t$fty[] zk8;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   private _0t$fty(int var3, String var4, vt2 var5) {
      this.g4_ = var3;
      this.ty5 = var4;
      this.f7n = var5;
   }

   public int yg6() {
      return this.g4_;
   }

   public vt2 pt5() {
      return this.f7n;
   }

   @Override
   public String toString() {
      return this.ty5;
   }

   public static _0t$fty v1t(int param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: iload 0
      // 05: iload 1
      // 06: ifeq 35
      // 09: iflt 2d
      // 0c: goto 13
      // 0f: invokestatic _0t$fty.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 12: athrow
      // 13: iload 0
      // 14: iload 1
      // 15: ifeq 35
      // 18: goto 1f
      // 1b: invokestatic _0t$fty.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1e: athrow
      // 1f: getstatic _0t$fty.q_m [L_0t$fty;
      // 22: arraylength
      // 23: if_icmplt 36
      // 26: goto 2d
      // 29: invokestatic _0t$fty.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2c: athrow
      // 2d: bipush 0
      // 2e: goto 35
      // 31: invokestatic _0t$fty.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 34: athrow
      // 35: istore 0
      // 36: getstatic _0t$fty.q_m [L_0t$fty;
      // 39: iload 0
      // 3a: aaload
      // 3b: areturn
   }

   public static _0t$fty _h_(vt2 param0, vt2 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic _0t$fty.a J
      // 003: ldc2_w 124681979338893
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic t9d.c ()I
      // 00b: istore 4
      // 00d: getstatic _0t$1.m52 [I
      // 010: aload 0
      // 011: invokevirtual vt2.ordinal ()I
      // 014: iaload
      // 015: iload 4
      // 017: ifne 056
      // 01a: tableswitch 282 1 6 42 158 266 270 274 278
      // 040: invokestatic _0t$fty.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 043: athrow
      // 044: getstatic _0t$1.rk3 [I
      // 047: aload 1
      // 048: invokevirtual vt2.e30 ()Lvt2$y0s;
      // 04b: invokevirtual vt2$y0s.ordinal ()I
      // 04e: iaload
      // 04f: goto 056
      // 052: invokestatic _0t$fty.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 055: athrow
      // 056: lookupswitch 38 2 1 26 2 34
      // 070: getstatic _0t$fty.usm L_0t$fty;
      // 073: areturn
      // 074: invokestatic _0t$fty.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 077: athrow
      // 078: getstatic _0t$fty.zoq L_0t$fty;
      // 07b: areturn
      // 07c: new java/lang/IllegalArgumentException
      // 07f: dup
      // 080: new java/lang/StringBuilder
      // 083: dup
      // 084: invokespecial java/lang/StringBuilder.<init> ()V
      // 087: sipush 6927
      // 08a: ldc2_w 2357529314335150003
      // 08d: lload 2
      // 08e: lxor
      // 08f: invokedynamic h (IJ)Ljava/lang/String; bsm=_0t$fty.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 094: nop
      // 095: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 098: aload 1
      // 099: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 09c: sipush 18836
      // 09f: ldc2_w 3912048614097788216
      // 0a2: lload 2
      // 0a3: lxor
      // 0a4: invokedynamic h (IJ)Ljava/lang/String; bsm=_0t$fty.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a9: nop
      // 0aa: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ad: aload 0
      // 0ae: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0b1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0b4: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 0b7: athrow
      // 0b8: getstatic _0t$1.rk3 [I
      // 0bb: aload 1
      // 0bc: invokevirtual vt2.e30 ()Lvt2$y0s;
      // 0bf: invokevirtual vt2$y0s.ordinal ()I
      // 0c2: iaload
      // 0c3: lookupswitch 37 2 1 25 2 33
      // 0dc: getstatic _0t$fty.q5b L_0t$fty;
      // 0df: areturn
      // 0e0: invokestatic _0t$fty.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0e3: athrow
      // 0e4: getstatic _0t$fty.hnr L_0t$fty;
      // 0e7: areturn
      // 0e8: new java/lang/IllegalArgumentException
      // 0eb: dup
      // 0ec: new java/lang/StringBuilder
      // 0ef: dup
      // 0f0: invokespecial java/lang/StringBuilder.<init> ()V
      // 0f3: sipush 9355
      // 0f6: ldc2_w 6951890809567408180
      // 0f9: lload 2
      // 0fa: lxor
      // 0fb: invokedynamic h (IJ)Ljava/lang/String; bsm=_0t$fty.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 100: nop
      // 101: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 104: aload 1
      // 105: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 108: sipush 9706
      // 10b: ldc2_w 6128321264645796191
      // 10e: lload 2
      // 10f: lxor
      // 110: invokedynamic h (IJ)Ljava/lang/String; bsm=_0t$fty.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 115: nop
      // 116: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 119: aload 0
      // 11a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 11d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 120: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 123: athrow
      // 124: getstatic _0t$fty.d5e L_0t$fty;
      // 127: areturn
      // 128: getstatic _0t$fty.p2o L_0t$fty;
      // 12b: areturn
      // 12c: getstatic _0t$fty.cqa L_0t$fty;
      // 12f: areturn
      // 130: getstatic _0t$fty.ewf L_0t$fty;
      // 133: areturn
      // 134: new java/lang/IllegalArgumentException
      // 137: dup
      // 138: new java/lang/StringBuilder
      // 13b: dup
      // 13c: invokespecial java/lang/StringBuilder.<init> ()V
      // 13f: sipush 24563
      // 142: ldc2_w 3932499276715821892
      // 145: lload 2
      // 146: lxor
      // 147: invokedynamic h (IJ)Ljava/lang/String; bsm=_0t$fty.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14c: nop
      // 14d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 150: aload 0
      // 151: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 154: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 157: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 15a: athrow
   }

   @Override
   public String mo3() {
      return this.ty5;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-7322326776306692959L, -2253783713769446894L, MethodHandles.lookup().lookupClass()).a(64564581784500L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 128822936336515L;
      Cipher var0;
      Cipher var17 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var17.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[21];
      int var5 = 0;
      String var4 = "Ôª<XâÅÐ:\b\u001eg\u001ai\u00852f(»\u0085\u0089P\u0001*Uò&\u009bC\u0080E×ñ\u0010jGy¿ì\u0014\u008cLÉ\u000fbw*a0}\u0091ö>dC\u0017ß\u001a(X\u0090\u0084ÌÉ\u0093ÇæX+øûG}3<oÛÖÉ=¢W¡\u009dhøZÚlD\u0013;ªÎ¼¹Ì>F\u0010*à÷y®Da\u0095çÖ=íî¾Id\u0010\u008f\u000b\u009c\u00adHÚ\u009bÍB\u0011hhÑô\u0003r\u0010ôE½JÂw=l(\u008b¸¥\t$^ä\u0010)ÀÏ\u0095[m\u009a\u007f\u0005\u007f°p´Sí¸\u0010¬\u008cÅQ\u008f\"\t>C\f½\u008bþ\u0081t\u001b\u0010\u0099'\rÕ}\f\u0097\u00900\u0091\u000f5X\u0084¨|(ÿ¬\u0084\u0091¬Ùÿ^E;®×\u008e~ó¦+oö{ÓF¤õ÷\u008fÈOgfÑº\u0006¸Àpfm.k\u0010\u000b\u0001\u0097ÝÐòs\u0012\t\u0016@$\u001aò\b×\u0018~\u008a\u0082cùu\u0017Rx[©·\u0018Î{\nó\u009f²Fc£\u0089¹\u0010Åw±\u0083\u0004pJ6]×¦¼£\u0003`ç\u0010ÌÙ~Lº\u0082Ý\u0015V4I9Màô¸\u0010\u0086\u0005j&\u0010r\u0007¾~á\u0097´XÖê\u0017\u0010]®tF\b\u0081HôÀhÓDªtÌì\u0010ÑNyl\u0083Ñ{A¨\u0001M\u008f\u000b<«#\u0010\u009b{¦àÇÎ\u008a\u0005\u00027.³\re'V\u0018µø:QÓR·Ë *Ã\u008cU /h\u0082/ä\fÝ.L3";
      int var6 = "Ôª<XâÅÐ:\b\u001eg\u001ai\u00852f(»\u0085\u0089P\u0001*Uò&\u009bC\u0080E×ñ\u0010jGy¿ì\u0014\u008cLÉ\u000fbw*a0}\u0091ö>dC\u0017ß\u001a(X\u0090\u0084ÌÉ\u0093ÇæX+øûG}3<oÛÖÉ=¢W¡\u009dhøZÚlD\u0013;ªÎ¼¹Ì>F\u0010*à÷y®Da\u0095çÖ=íî¾Id\u0010\u008f\u000b\u009c\u00adHÚ\u009bÍB\u0011hhÑô\u0003r\u0010ôE½JÂw=l(\u008b¸¥\t$^ä\u0010)ÀÏ\u0095[m\u009a\u007f\u0005\u007f°p´Sí¸\u0010¬\u008cÅQ\u008f\"\t>C\f½\u008bþ\u0081t\u001b\u0010\u0099'\rÕ}\f\u0097\u00900\u0091\u000f5X\u0084¨|(ÿ¬\u0084\u0091¬Ùÿ^E;®×\u008e~ó¦+oö{ÓF¤õ÷\u008fÈOgfÑº\u0006¸Àpfm.k\u0010\u000b\u0001\u0097ÝÐòs\u0012\t\u0016@$\u001aò\b×\u0018~\u008a\u0082cùu\u0017Rx[©·\u0018Î{\nó\u009f²Fc£\u0089¹\u0010Åw±\u0083\u0004pJ6]×¦¼£\u0003`ç\u0010ÌÙ~Lº\u0082Ý\u0015V4I9Màô¸\u0010\u0086\u0005j&\u0010r\u0007¾~á\u0097´XÖê\u0017\u0010]®tF\b\u0081HôÀhÓDªtÌì\u0010ÑNyl\u0083Ñ{A¨\u0001M\u008f\u000b<«#\u0010\u009b{¦àÇÎ\u008a\u0005\u00027.³\re'V\u0018µø:QÓR·Ë *Ã\u008cU /h\u0082/ä\fÝ.L3"
         .length();
      char var3 = 16;
      int var16 = -1;

      label37:
      while (true) {
         String var18 = var4.substring(++var16, var16 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var18.getBytes("ISO-8859-1"));
            String var24 = a(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var24;
                  if ((var16 += var3) >= var6) {
                     b = var7;
                     c = new String[21];
                     usm = new _0t$fty(0, a<"h">(30266, 740489272187386521L ^ var9), vt2.m3r);
                     ewf = new _0t$fty(1, a<"h">(15337, 7364576702058968904L ^ var9), vt2.zk4);
                     cqa = new _0t$fty(2, a<"h">(22113, 8210588815901121238L ^ var9), vt2.te4);
                     p2o = new _0t$fty(3, a<"h">(14986, 4405724488079291959L ^ var9), vt2.mxp);
                     d5e = new _0t$fty(4, a<"h">(15992, 5073694584466715334L ^ var9), vt2.z9q);
                     hnr = new _0t$fty(5, a<"h">(31662, 5986524781818279707L ^ var9), vt2.rf3);
                     q5b = new _0t$fty(6, a<"h">(933, 6029235231537893139L ^ var9), vt2.rf3);
                     zoq = new _0t$fty(7, a<"h">(3652, 9051017857084228343L ^ var9), vt2.m3r);
                     zk8 = new _0t$fty[]{usm, ewf, cqa, p2o, d5e, hnr, q5b, zoq};
                     q_m = new _0t$fty[values().length];

                     for (_0t$fty var14 : values()) {
                        q_m[var14.yg6()] = var14;
                     }

                     return;
                  }

                  var3 = var4.charAt(var16);
                  break;
               default:
                  var7[var5++] = var24;
                  if ((var16 += var3) < var6) {
                     var3 = var4.charAt(var16);
                     continue label37;
                  }

                  var4 = "§I\u0091µL±u\u008d\u0094ô\u0019\u008dà>o`\u0010\u001d°\n\u0090V\u007f\u001cFÃ\u008cD\u0019Â&]\u0097";
                  var6 = "§I\u0091µL±u\u008d\u0094ô\u0019\u008dà>o`\u0010\u001d°\n\u0090V\u007f\u001cFÃ\u008cD\u0019Â&]\u0097".length();
                  var3 = 16;
                  var16 = -1;
            }

            var18 = var4.substring(++var16, var16 + var3);
            var10001 = 0;
         }
      }
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 3066;
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
            throw new RuntimeException("_0t$fty", var10);
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
         throw new RuntimeException("_0t$fty" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
