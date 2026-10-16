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

public abstract class uja {
   public static final uja[] tqn;
   public static final uja mqu;
   public static final uja qqf;
   public static final uja yj_;
   public static final uja qes;
   public static final uja kdm;
   public static final uja vc2;
   public static final uja jjv;
   public static final uja zip;
   public static final uja hrg;
   public static final uja wog;
   public static final uja zlu;
   public static final uja xp0;
   private final int _6f;
   private final String ut1;
   private String n0f;
   private boolean hsv;
   private boolean hmn;
   private bn1[] p01;
   private erg kyv;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public uja(int var1, String var2) {
      long var3 = a ^ 57405886923739L;
      super();
      this.n0f = a<"y">(12028, 3054519314163270913L ^ var3);
      this.hsv = true;
      this.hmn = true;
      this._6f = var1;
      this.ut1 = var2;
      tqn[var1] = this;
   }

   public int wvr() {
      return this._6f;
   }

   public String h4d() {
      return this.ut1;
   }

   public String qu_() {
      long var1 = a ^ 11657301158771L;
      return a<"y">(14244, 1779995971190682871L ^ var1) + this.h4d();
   }

   public erg y95() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield uja.kyv Lerg;
      // 08: iload 1
      // 09: ifne 35
      // 0c: ifnonnull 31
      // 0f: goto 16
      // 12: invokestatic uja.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: new erg
      // 1a: dup
      // 1b: aload 0
      // 1c: invokevirtual uja.j6_ ()Lu7m;
      // 1f: bipush 1
      // 20: aload 0
      // 21: invokevirtual uja.xz9 ()I
      // 24: invokespecial erg.<init> (Lu7m;II)V
      // 27: putfield uja.kyv Lerg;
      // 2a: goto 31
      // 2d: invokestatic uja.a (Loov;)Loov;
      // 30: athrow
      // 31: aload 0
      // 32: getfield uja.kyv Lerg;
      // 35: areturn
   }

   public abstract u7m j6_();

   public int xz9() {
      return 0;
   }

   public String c3s() {
      return this.n0f;
   }

   public uja aj_(String var1) {
      this.n0f = var1;
      return this;
   }

   public boolean mje() {
      return this.hmn;
   }

   public uja zno() {
      this.hmn = false;
      return this;
   }

   public boolean l54() {
      return this.hsv;
   }

   public uja m0m() {
      this.hsv = false;
      return this;
   }

   public int c7s() {
      return this._6f % 6;
   }

   public boolean l3m() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield uja._6f I
      // 08: iload 1
      // 09: ifne 20
      // 0c: bipush 6
      // 0e: if_icmpge 23
      // 11: goto 18
      // 14: invokestatic uja.a (Loov;)Loov;
      // 17: athrow
      // 18: bipush 1
      // 19: goto 20
      // 1c: invokestatic uja.a (Loov;)Loov;
      // 1f: athrow
      // 20: goto 24
      // 23: bipush 0
      // 24: ireturn
   }

   public bn1[] s4f() {
      return this.p01;
   }

   public uja hbr(bn1[] var1) {
      this.p01 = var1;
      return this;
   }

   public boolean za5(bn1 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield uja.p01 [Lbn1;
      // 08: iload 2
      // 09: ifne 20
      // 0c: ifnonnull 1c
      // 0f: goto 16
      // 12: invokestatic uja.a (Loov;)Loov;
      // 15: athrow
      // 16: bipush 0
      // 17: ireturn
      // 18: invokestatic uja.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 0
      // 1d: getfield uja.p01 [Lbn1;
      // 20: astore 3
      // 21: aload 3
      // 22: arraylength
      // 23: istore 4
      // 25: bipush 0
      // 26: istore 5
      // 28: iload 5
      // 2a: iload 4
      // 2c: if_icmpge 53
      // 2f: aload 3
      // 30: iload 5
      // 32: aaload
      // 33: astore 6
      // 35: iload 2
      // 36: ifne 4f
      // 39: aload 6
      // 3b: aload 1
      // 3c: if_acmpne 4c
      // 3f: goto 46
      // 42: invokestatic uja.a (Loov;)Loov;
      // 45: athrow
      // 46: bipush 1
      // 47: ireturn
      // 48: invokestatic uja.a (Loov;)Loov;
      // 4b: athrow
      // 4c: iinc 5 1
      // 4f: iload 2
      // 50: ifeq 28
      // 53: bipush 0
      // 54: ireturn
   }

   public void d1b(List param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: getstatic u7m.p5w Lnga;
      // 07: invokevirtual nga.iterator ()Ljava/util/Iterator;
      // 0a: astore 3
      // 0b: aload 3
      // 0c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 11: ifeq 62
      // 14: aload 3
      // 15: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1a: checkcast u7m
      // 1d: astore 4
      // 1f: iload 2
      // 20: ifeq 84
      // 23: aload 4
      // 25: iload 2
      // 26: ifeq 3c
      // 29: goto 30
      // 2c: invokestatic uja.a (Loov;)Loov;
      // 2f: athrow
      // 30: ifnull 5e
      // 33: goto 3a
      // 36: invokestatic uja.a (Loov;)Loov;
      // 39: athrow
      // 3a: aload 4
      // 3c: iload 2
      // 3d: ifeq 57
      // 40: invokevirtual u7m.f4r ()Luja;
      // 43: aload 0
      // 44: if_acmpne 5e
      // 47: goto 4e
      // 4a: invokestatic uja.a (Loov;)Loov;
      // 4d: athrow
      // 4e: aload 4
      // 50: goto 57
      // 53: invokestatic uja.a (Loov;)Loov;
      // 56: athrow
      // 57: aload 4
      // 59: aload 0
      // 5a: aload 1
      // 5b: invokevirtual u7m.jlj (Lu7m;Luja;Ljava/util/List;)V
      // 5e: iload 2
      // 5f: ifne 0b
      // 62: aload 0
      // 63: iload 2
      // 64: ifeq 7c
      // 67: invokevirtual uja.s4f ()[Lbn1;
      // 6a: ifnull 84
      // 6d: goto 74
      // 70: invokestatic uja.a (Loov;)Loov;
      // 73: athrow
      // 74: aload 0
      // 75: goto 7c
      // 78: invokestatic uja.a (Loov;)Loov;
      // 7b: athrow
      // 7c: aload 1
      // 7d: aload 0
      // 7e: invokevirtual uja.s4f ()[Lbn1;
      // 81: invokevirtual uja.sau (Ljava/util/List;[Lbn1;)V
      // 84: return
   }

   public void sau(List param1, bn1[] param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic vef.ql6 [Lvef;
      // 03: astore 4
      // 05: invokestatic OpaquePredicate.b ()I
      // 08: aload 4
      // 0a: arraylength
      // 0b: istore 5
      // 0d: istore 3
      // 0e: bipush 0
      // 0f: istore 6
      // 11: iload 6
      // 13: iload 5
      // 15: if_icmpge bc
      // 18: aload 4
      // 1a: iload 6
      // 1c: aaload
      // 1d: astore 7
      // 1f: iload 3
      // 20: ifeq b8
      // 23: aload 7
      // 25: ifnull b5
      // 28: goto 2f
      // 2b: invokestatic uja.a (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 7
      // 31: getfield vef.n1z Lbn1;
      // 34: ifnull b5
      // 37: goto 3e
      // 3a: invokestatic uja.a (Loov;)Loov;
      // 3d: athrow
      // 3e: bipush 0
      // 3f: istore 8
      // 41: bipush 0
      // 42: istore 9
      // 44: iload 9
      // 46: aload 2
      // 47: arraylength
      // 48: if_icmpge 83
      // 4b: iload 8
      // 4d: iload 3
      // 4e: ifeq 85
      // 51: iload 3
      // 52: ifeq 85
      // 55: goto 5c
      // 58: invokestatic uja.a (Loov;)Loov;
      // 5b: athrow
      // 5c: ifne 83
      // 5f: goto 66
      // 62: invokestatic uja.a (Loov;)Loov;
      // 65: athrow
      // 66: aload 7
      // 68: getfield vef.n1z Lbn1;
      // 6b: aload 2
      // 6c: iload 9
      // 6e: aaload
      // 6f: if_acmpne 7c
      // 72: goto 79
      // 75: invokestatic uja.a (Loov;)Loov;
      // 78: athrow
      // 79: bipush 1
      // 7a: istore 8
      // 7c: iinc 9 1
      // 7f: iload 3
      // 80: ifne 44
      // 83: iload 8
      // 85: iload 3
      // 86: ifeq b4
      // 89: ifeq b5
      // 8c: goto 93
      // 8f: invokestatic uja.a (Loov;)Loov;
      // 92: athrow
      // 93: aload 1
      // 94: getstatic xbr.frz Lnmo;
      // 97: new npq
      // 9a: dup
      // 9b: aload 7
      // 9d: aload 7
      // 9f: invokevirtual vef.ehp ()I
      // a2: invokespecial npq.<init> (Lvef;I)V
      // a5: invokevirtual nmo.upu (Lnpq;)Lerg;
      // a8: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // ad: goto b4
      // b0: invokestatic uja.a (Loov;)Loov;
      // b3: athrow
      // b4: pop
      // b5: iinc 6 1
      // b8: iload 3
      // b9: ifne 11
      // bc: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3538627389680916742L, -1076316718851119543L, MethodHandles.lookup().lookupClass()).a(246502583406094L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 6397194727357L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[16];
      int var5 = 0;
      String var4 = "Ú»6^\u0007»~Cê\u0093Ú#\u0096\u009a²\\\u0018aK\u008a\u008bÛG86z\u0003¤¨©·\b¸\u0094Z_D?\u0013Õ\u001d\u0018¶ÝÑ\u0080\f\u007f>Ð\u009f_\u0089¯Ôý,>$¸ç·²ÉU\u0081\u0010ß©`âNnGDaâ\u0007\rh\u007fæò\u0010Þâ\u0086Ïì$-\u0014lÌfÉîFLT ÝÊ\tl£\u0082§â\u0097\u0082 -!\u000e\u0090!÷\u000e\u0015\u0007\u008a×µµñrüZ\u0016±\u008d9\u0018Ðy>åá\u009eÝ\u0006º5ÃG·õ¾[Zyq\u0092»dñÅ \u009cÒb¬ëZ©\u008faA§¢\u0092¿\u0018g¹\rsÎ\u009b¦\u0010ºÁó5þ'\u0001\u0094^ m\u0093¡J±\u0091µ'\u0016\u000e.ÛªGä\u001c!\u0098Û \u007fãj\u0017Þ\tÜ8Öí\n¶\u0010@Îìxî§\u0095\u0097¢®A\u0000åæâ\u0098 2÷\u0014\u0018!f¯µÖ½¡äBó`\u00adºêñ\u001fÅüÔª]p4\u0002f¤\u0013Á\u0010SÖc¯Zï\u001e\u001ft÷s$\u0097\u001dM*\u0010´k¹\u0085Ìs>\u0002¶[³¶\u0007Å\u0084( VlzSCî\u007f£ðäÊ,«K\u009c4o¡\t\u001bHlä\"\u000e*çã\u0094 É\u009d";
      int var6 = "Ú»6^\u0007»~Cê\u0093Ú#\u0096\u009a²\\\u0018aK\u008a\u008bÛG86z\u0003¤¨©·\b¸\u0094Z_D?\u0013Õ\u001d\u0018¶ÝÑ\u0080\f\u007f>Ð\u009f_\u0089¯Ôý,>$¸ç·²ÉU\u0081\u0010ß©`âNnGDaâ\u0007\rh\u007fæò\u0010Þâ\u0086Ïì$-\u0014lÌfÉîFLT ÝÊ\tl£\u0082§â\u0097\u0082 -!\u000e\u0090!÷\u000e\u0015\u0007\u008a×µµñrüZ\u0016±\u008d9\u0018Ðy>åá\u009eÝ\u0006º5ÃG·õ¾[Zyq\u0092»dñÅ \u009cÒb¬ëZ©\u008faA§¢\u0092¿\u0018g¹\rsÎ\u009b¦\u0010ºÁó5þ'\u0001\u0094^ m\u0093¡J±\u0091µ'\u0016\u000e.ÛªGä\u001c!\u0098Û \u007fãj\u0017Þ\tÜ8Öí\n¶\u0010@Îìxî§\u0095\u0097¢®A\u0000åæâ\u0098 2÷\u0014\u0018!f¯µÖ½¡äBó`\u00adºêñ\u001fÅüÔª]p4\u0002f¤\u0013Á\u0010SÖc¯Zï\u001e\u001ft÷s$\u0097\u001dM*\u0010´k¹\u0085Ìs>\u0002¶[³¶\u0007Å\u0084( VlzSCî\u007f£ðäÊ,«K\u009c4o¡\t\u001bHlä\"\u000e*çã\u0094 É\u009d"
         .length();
      char var3 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     b = var7;
                     c = new String[16];
                     tqn = new uja[12];
                     mqu = new uja$1(0, a<"y">(21907, 6868560721047589381L ^ var9));
                     qqf = new uja$2(1, a<"y">(25685, 5108434359907263439L ^ var9));
                     yj_ = new uja$3(2, a<"y">(4072, 37932961574439035L ^ var9));
                     qes = new uja$4(3, a<"y">(14831, 1978512457983098491L ^ var9));
                     kdm = new uja$5(4, a<"y">(22209, 4577658336469815638L ^ var9)).hbr(new bn1[]{bn1.njw});
                     vc2 = new uja$6(5, a<"y">(17529, 2079093585168630764L ^ var9)).aj_(a<"y">(4038, 3975708440524212312L ^ var9));
                     jjv = new uja$7(6, a<"y">(24067, 3111157119425419667L ^ var9));
                     zip = new uja$8(7, a<"y">(6544, 3552173125887090184L ^ var9)).hbr(new bn1[]{bn1.q92, bn1.eed, bn1.egy});
                     hrg = new uja$9(8, a<"y">(25278, 2616724725166941473L ^ var9))
                        .hbr(new bn1[]{bn1.jfw, bn1.t6y, bn1.u0b, bn1.yv5, bn1.am1, bn1.j3b, bn1.phf});
                     wog = new uja$10(9, a<"y">(29510, 452841431526126810L ^ var9));
                     zlu = new uja$11(10, a<"y">(7065, 6739522122944666624L ^ var9));
                     xp0 = new uja$12(11, a<"y">(21757, 4794723205976593260L ^ var9)).aj_(a<"y">(32016, 8111885349047057026L ^ var9)).m0m().zno();
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

                  var4 = "³\u0011\u0016\u000ec\u0010;\r;¯·L\u0088\u008cR\u0006s@«gkò~A\u0083\u0012\u000e]û:¿Í\u0018kMÓÏ\u008e\u0083\u001ex·\u0018EPÖ\u0092\u0017`\u0096Ì\u0010ò\tyÏ¾";
                  var6 = "³\u0011\u0016\u000ec\u0010;\r;¯·L\u0088\u008cR\u0006s@«gkò~A\u0083\u0012\u000e]û:¿Í\u0018kMÓÏ\u008e\u0083\u001ex·\u0018EPÖ\u0092\u0017`\u0096Ì\u0010ò\tyÏ¾"
                     .length();
                  var3 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30024;
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
            throw new RuntimeException("uja", var10);
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
         throw new RuntimeException("uja" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
