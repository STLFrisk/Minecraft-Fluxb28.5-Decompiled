import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class vqu extends gbe {
   private static final AtomicInteger ela;
   private static final Logger xli;
   private hv0 f4v;
   private boolean z1w;
   private final gbe s9x;
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public vqu(gbe var1, c05 var2, r1l var3) {
      this.f41 = var2;
      this.s9x = var1;
      wat var4 = wat.vqi(var3.s4c);
      var2.jk1((kh3)null);
      var2.t5e(var3);
      this.a2e(var4.hul(), var4.biq());
      zwr.qkk.elh = var3;
      j83.ef8._8o();
   }

   public vqu(gbe var1, c05 var2, String var3, int var4) {
      this.f41 = var2;
      this.s9x = var1;
      var2.jk1((kh3)null);
      this.a2e(var3, var4);
   }

   private void a2e(String var1, int var2) {
      long var3 = a ^ 58839580902105L;
      xli.info(b<"x">(17828, 2562126094522337896L ^ var3) + var1 + b<"x">(5925, 3197072561827158250L ^ var3) + var2);
      new vqu$1(this, b<"x">(21701, 8333593672597887756L ^ var3) + ela.incrementAndGet(), var1, var2).start();
   }

   @Override
   public void updateScreen() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield vqu.f4v Lhv0;
      // 08: iload 1
      // 09: ifeq 21
      // 0c: ifnull 52
      // 0f: goto 16
      // 12: invokestatic vqu.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield vqu.f4v Lhv0;
      // 1a: goto 21
      // 1d: invokestatic vqu.a (Loov;)Loov;
      // 20: athrow
      // 21: iload 1
      // 22: ifeq 4f
      // 25: invokevirtual hv0.jy3 ()Z
      // 28: ifeq 44
      // 2b: goto 32
      // 2e: invokestatic vqu.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 0
      // 33: getfield vqu.f4v Lhv0;
      // 36: invokevirtual hv0.v2s ()V
      // 39: iload 1
      // 3a: ifne 52
      // 3d: goto 44
      // 40: invokestatic vqu.a (Loov;)Loov;
      // 43: athrow
      // 44: aload 0
      // 45: getfield vqu.f4v Lhv0;
      // 48: goto 4f
      // 4b: invokestatic vqu.a (Loov;)Loov;
      // 4e: athrow
      // 4f: invokevirtual hv0.kh8 ()V
      // 52: return
   }

   @Override
   public void dig(char var1, int var2) {
   }

   @Override
   public void initGui() {
      long var1 = a ^ 13713856269442L;
      this.khf.clear();
      this.khf.add(new gt4(0, this.dt7 / 2 - 100, this.o1e / 4 + 120 + 12, fc1.gx1(b<"x">(1628, 1209973943951296461L ^ var1), new Object[0])));
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
      // 00: getstatic vqu.a J
      // 03: ldc2_w 121850252236057
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.c ()I
      // 0b: istore 4
      // 0d: aload 1
      // 0e: getfield gt4._me I
      // 11: ifne 61
      // 14: aload 0
      // 15: bipush 1
      // 16: putfield vqu.z1w Z
      // 19: aload 0
      // 1a: iload 4
      // 1c: ifne 57
      // 1f: goto 26
      // 22: invokestatic vqu.a (Loov;)Loov;
      // 25: athrow
      // 26: getfield vqu.f4v Lhv0;
      // 29: ifnull 56
      // 2c: goto 33
      // 2f: invokestatic vqu.a (Loov;)Loov;
      // 32: athrow
      // 33: aload 0
      // 34: getfield vqu.f4v Lhv0;
      // 37: new tao
      // 3a: dup
      // 3b: sipush 17117
      // 3e: ldc2_w 8595570023332960979
      // 41: lload 2
      // 42: lxor
      // 43: invokedynamic x (IJ)Ljava/lang/String; bsm=vqu.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: nop
      // 49: invokespecial tao.<init> (Ljava/lang/String;)V
      // 4c: invokevirtual hv0.g8c (Lekw;)V
      // 4f: goto 56
      // 52: invokestatic vqu.a (Loov;)Loov;
      // 55: athrow
      // 56: aload 0
      // 57: getfield vqu.f41 Lc05;
      // 5a: aload 0
      // 5b: getfield vqu.s9x Lgbe;
      // 5e: invokevirtual c05.z2i (Lgbe;)V
      // 61: return
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
      // 00: getstatic vqu.a J
      // 03: ldc2_w 22142164195261
      // 06: lxor
      // 07: lstore 4
      // 09: invokestatic t9d.c ()I
      // 0c: istore 6
      // 0e: aload 0
      // 0f: invokevirtual vqu.xmz ()V
      // 12: aload 0
      // 13: iload 6
      // 15: ifne 69
      // 18: getfield vqu.f4v Lhv0;
      // 1b: ifnonnull 61
      // 1e: goto 25
      // 21: invokestatic vqu.a (Loov;)Loov;
      // 24: athrow
      // 25: aload 0
      // 26: aload 0
      // 27: getfield vqu.fex Lowt;
      // 2a: sipush 23633
      // 2d: ldc2_w 123118732158273277
      // 30: lload 4
      // 32: lxor
      // 33: invokedynamic x (IJ)Ljava/lang/String; bsm=vqu.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38: nop
      // 39: bipush 0
      // 3a: anewarray 166
      // 3d: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 40: aload 0
      // 41: getfield vqu.dt7 I
      // 44: bipush 2
      // 45: idiv
      // 46: aload 0
      // 47: getfield vqu.o1e I
      // 4a: bipush 2
      // 4b: idiv
      // 4c: bipush 50
      // 4e: isub
      // 4f: ldc 16777215
      // 51: nop
      // 52: invokevirtual vqu.poi (Lowt;Ljava/lang/String;III)V
      // 55: iload 6
      // 57: ifeq 98
      // 5a: goto 61
      // 5d: invokestatic vqu.a (Loov;)Loov;
      // 60: athrow
      // 61: aload 0
      // 62: goto 69
      // 65: invokestatic vqu.a (Loov;)Loov;
      // 68: athrow
      // 69: aload 0
      // 6a: getfield vqu.fex Lowt;
      // 6d: sipush 27050
      // 70: ldc2_w 6393208790690902789
      // 73: lload 4
      // 75: lxor
      // 76: invokedynamic x (IJ)Ljava/lang/String; bsm=vqu.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b: nop
      // 7c: bipush 0
      // 7d: anewarray 166
      // 80: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 83: aload 0
      // 84: getfield vqu.dt7 I
      // 87: bipush 2
      // 88: idiv
      // 89: aload 0
      // 8a: getfield vqu.o1e I
      // 8d: bipush 2
      // 8e: idiv
      // 8f: bipush 50
      // 91: isub
      // 92: ldc 16777215
      // 94: nop
      // 95: invokevirtual vqu.poi (Lowt;Ljava/lang/String;III)V
      // 98: aload 0
      // 99: iload 1
      // 9a: iload 2
      // 9b: fload 3
      // 9c: invokespecial gbe.drawScreen (IIF)V
      // 9f: return
   }

   public static boolean x9p(vqu var0) {
      return var0.z1w;
   }

   public static hv0 xyu(vqu var0, hv0 var1) {
      return var0.f4v = var1;
   }

   public static c05 wr7(vqu var0) {
      return var0.f41;
   }

   public static hv0 _9j(vqu var0) {
      return var0.f4v;
   }

   public static c05 ecu(vqu var0) {
      return var0.f41;
   }

   public static gbe f6t(vqu var0) {
      return var0.s9x;
   }

   public static c05 cb9(vqu var0) {
      return var0.f41;
   }

   public static Logger ctl() {
      return xli;
   }

   public static c05 zio(vqu var0) {
      return var0.f41;
   }

   public static c05 gd6(vqu var0) {
      return var0.f41;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5699689344412251572L, -2480926153523862337L, MethodHandles.lookup().lookupClass()).a(267414409894053L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 104407246758674L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[7];
      int var7 = 0;
      String var6 = "=\u00952ÚÔKEj\u0010îKâ\u008c°I\u0087ù\u0088\u0002\u0007Í\u0006\u0019A\u0086\u008d/\u0099fU\u000b× \u00971æd\u0097*e\u001cH,\u009d¢½«\u008c\u0017¦\u0091×\u0098\u0099< Ôõ\u008aÎ\u0088¦ªùÑ(«HåÇv\u0018ª«×\u0085$ó# \u001d\u008f\u0097´\u0084³\u0091TFM,Ö\u001aqCÎó\u008cÆF©\u001a®m#È(½U\u009a» PeÏëI_\u0099\u0098e¥*?åëÀ½%ÐâÝ\u0016~·¬I\u008b\u0089\u008clº\u0097y¦_|\u0010*\fI\u0013²ä·t#Ó\u008eÈBE Ý";
      int var8 = "=\u00952ÚÔKEj\u0010îKâ\u008c°I\u0087ù\u0088\u0002\u0007Í\u0006\u0019A\u0086\u008d/\u0099fU\u000b× \u00971æd\u0097*e\u001cH,\u009d¢½«\u008c\u0017¦\u0091×\u0098\u0099< Ôõ\u008aÎ\u0088¦ªùÑ(«HåÇv\u0018ª«×\u0085$ó# \u001d\u008f\u0097´\u0084³\u0091TFM,Ö\u001aqCÎó\u008cÆF©\u001a®m#È(½U\u009a» PeÏëI_\u0099\u0098e¥*?åëÀ½%ÐâÝ\u0016~·¬I\u008b\u0089\u008clº\u0097y¦_|\u0010*\fI\u0013²ä·t#Ó\u008eÈBE Ý"
         .length();
      char var5 = ' ';
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
                     g = new String[7];
                     ela = new AtomicInteger(0);
                     xli = LogManager.getLogger();
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

                  var6 = "\u0000WheãØ7\u0096\u00adú²Ø\u0003\u0013±Ï\u0018ËÌÀp®¡\f\u008aa\u001e=S\b\u001dÖ\u008bß£¼ÇÔw\u001a\u008c";
                  var8 = "\u0000WheãØ7\u0096\u00adú²Ø\u0003\u0013±Ï\u0018ËÌÀp®¡\f\u008aa\u001e=S\b\u001dÖ\u008bß£¼ÇÔw\u001a\u008c".length();
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31388;
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
            throw new RuntimeException("vqu", var10);
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
         throw new RuntimeException("vqu" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
