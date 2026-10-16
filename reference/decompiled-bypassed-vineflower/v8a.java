import com.google.common.collect.Maps;
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
import net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces;
import net.minecraft.world.gen.structure.MapGenNetherBridge$Start;
import net.minecraft.world.gen.structure.MapGenScatteredFeature$Start;
import net.minecraft.world.gen.structure.MapGenStronghold$Start;
import net.minecraft.world.gen.structure.MapGenVillage$Start;
import net.minecraft.world.gen.structure.StructureMineshaftPieces;
import net.minecraft.world.gen.structure.StructureMineshaftStart;
import net.minecraft.world.gen.structure.StructureNetherBridgePieces;
import net.minecraft.world.gen.structure.StructureOceanMonument$StartMonument;
import net.minecraft.world.gen.structure.StructureOceanMonumentPieces;
import net.minecraft.world.gen.structure.StructureStrongholdPieces;
import net.minecraft.world.gen.structure.StructureVillagePieces;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class v8a {
   private static final Logger rmc;
   private static Map jya;
   private static Map qj7;
   private static Map ye1;
   private static Map fa6;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   private static void jnl(Class var0, String var1) {
      jya.put(var1, var0);
      qj7.put(var0, var1);
   }

   public static void kem(Class var0, String var1) {
      ye1.put(var1, var0);
      fa6.put(var0, var1);
   }

   public static String im3(ijb var0) {
      return (String)qj7.get(var0.getClass());
   }

   public static String o8h(xi1 var0) {
      return (String)fa6.get(var0.getClass());
   }

   public static ijb wch(bdo param0, t9d param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic v8a.a J
      // 03: ldc2_w 3271371797825
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.c ()I
      // 0b: istore 4
      // 0d: aconst_null
      // 0e: astore 5
      // 10: getstatic v8a.jya Ljava/util/Map;
      // 13: aload 0
      // 14: sipush 17730
      // 17: ldc2_w 7531789970065890077
      // 1a: lload 2
      // 1b: lxor
      // 1c: invokedynamic v (IJ)Ljava/lang/String; bsm=v8a.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21: nop
      // 22: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 25: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 2a: checkcast java/lang/Class
      // 2d: astore 6
      // 2f: aload 6
      // 31: iload 4
      // 33: ifne 4c
      // 36: ifnull 51
      // 39: goto 40
      // 3c: invokestatic v8a.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f: athrow
      // 40: aload 6
      // 42: invokevirtual java/lang/Class.newInstance ()Ljava/lang/Object;
      // 45: goto 4c
      // 48: invokestatic v8a.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b: athrow
      // 4c: checkcast ijb
      // 4f: astore 5
      // 51: goto 93
      // 54: astore 6
      // 56: getstatic v8a.rmc Lorg/apache/logging/log4j/Logger;
      // 59: new java/lang/StringBuilder
      // 5c: dup
      // 5d: invokespecial java/lang/StringBuilder.<init> ()V
      // 60: sipush 15637
      // 63: ldc2_w 1487977558258639685
      // 66: lload 2
      // 67: lxor
      // 68: invokedynamic v (IJ)Ljava/lang/String; bsm=v8a.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d: nop
      // 6e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 71: aload 0
      // 72: sipush 5481
      // 75: ldc2_w 8180769984376261434
      // 78: lload 2
      // 79: lxor
      // 7a: invokedynamic v (IJ)Ljava/lang/String; bsm=v8a.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: nop
      // 80: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 83: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 86: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 89: invokeinterface org/apache/logging/log4j/Logger.warn (Ljava/lang/String;)V 2
      // 8e: aload 6
      // 90: invokevirtual java/lang/Exception.printStackTrace ()V
      // 93: aload 5
      // 95: iload 4
      // 97: ifne a6
      // 9a: ifnull b0
      // 9d: goto a4
      // a0: invokestatic v8a.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a3: athrow
      // a4: aload 5
      // a6: aload 1
      // a7: aload 0
      // a8: invokevirtual ijb.msj (Lt9d;Lbdo;)V
      // ab: iload 4
      // ad: ifeq ef
      // b0: getstatic v8a.rmc Lorg/apache/logging/log4j/Logger;
      // b3: new java/lang/StringBuilder
      // b6: dup
      // b7: invokespecial java/lang/StringBuilder.<init> ()V
      // ba: sipush 25700
      // bd: ldc2_w 4520066934438443568
      // c0: lload 2
      // c1: lxor
      // c2: invokedynamic v (IJ)Ljava/lang/String; bsm=v8a.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c7: nop
      // c8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // cb: aload 0
      // cc: sipush 5481
      // cf: ldc2_w 8180769984376261434
      // d2: lload 2
      // d3: lxor
      // d4: invokedynamic v (IJ)Ljava/lang/String; bsm=v8a.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d9: nop
      // da: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // dd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // e0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // e3: invokeinterface org/apache/logging/log4j/Logger.warn (Ljava/lang/String;)V 2
      // e8: goto ef
      // eb: invokestatic v8a.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ee: athrow
      // ef: aload 5
      // f1: areturn
   }

   public static xi1 n2r(bdo param0, t9d param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic v8a.a J
      // 03: ldc2_w 18119646285316
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.b ()I
      // 0b: istore 4
      // 0d: aconst_null
      // 0e: astore 5
      // 10: getstatic v8a.ye1 Ljava/util/Map;
      // 13: aload 0
      // 14: sipush 5481
      // 17: ldc2_w 8180784833623781503
      // 1a: lload 2
      // 1b: lxor
      // 1c: invokedynamic v (IJ)Ljava/lang/String; bsm=v8a.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21: nop
      // 22: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 25: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 2a: checkcast java/lang/Class
      // 2d: astore 6
      // 2f: aload 6
      // 31: iload 4
      // 33: ifeq 4c
      // 36: ifnull 51
      // 39: goto 40
      // 3c: invokestatic v8a.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f: athrow
      // 40: aload 6
      // 42: invokevirtual java/lang/Class.newInstance ()Ljava/lang/Object;
      // 45: goto 4c
      // 48: invokestatic v8a.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b: athrow
      // 4c: checkcast xi1
      // 4f: astore 5
      // 51: goto 93
      // 54: astore 6
      // 56: getstatic v8a.rmc Lorg/apache/logging/log4j/Logger;
      // 59: new java/lang/StringBuilder
      // 5c: dup
      // 5d: invokespecial java/lang/StringBuilder.<init> ()V
      // 60: sipush 28046
      // 63: ldc2_w 3662551037418145949
      // 66: lload 2
      // 67: lxor
      // 68: invokedynamic v (IJ)Ljava/lang/String; bsm=v8a.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d: nop
      // 6e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 71: aload 0
      // 72: sipush 5481
      // 75: ldc2_w 8180784833623781503
      // 78: lload 2
      // 79: lxor
      // 7a: invokedynamic v (IJ)Ljava/lang/String; bsm=v8a.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: nop
      // 80: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 83: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 86: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 89: invokeinterface org/apache/logging/log4j/Logger.warn (Ljava/lang/String;)V 2
      // 8e: aload 6
      // 90: invokevirtual java/lang/Exception.printStackTrace ()V
      // 93: aload 5
      // 95: iload 4
      // 97: ifeq a6
      // 9a: ifnull b0
      // 9d: goto a4
      // a0: invokestatic v8a.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a3: athrow
      // a4: aload 5
      // a6: aload 1
      // a7: aload 0
      // a8: invokevirtual xi1.qih (Lt9d;Lbdo;)V
      // ab: iload 4
      // ad: ifne ef
      // b0: getstatic v8a.rmc Lorg/apache/logging/log4j/Logger;
      // b3: new java/lang/StringBuilder
      // b6: dup
      // b7: invokespecial java/lang/StringBuilder.<init> ()V
      // ba: sipush 24985
      // bd: ldc2_w 8293955004780741771
      // c0: lload 2
      // c1: lxor
      // c2: invokedynamic v (IJ)Ljava/lang/String; bsm=v8a.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c7: nop
      // c8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // cb: aload 0
      // cc: sipush 5481
      // cf: ldc2_w 8180784833623781503
      // d2: lload 2
      // d3: lxor
      // d4: invokedynamic v (IJ)Ljava/lang/String; bsm=v8a.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d9: nop
      // da: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // dd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // e0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // e3: invokeinterface org/apache/logging/log4j/Logger.warn (Ljava/lang/String;)V 2
      // e8: goto ef
      // eb: invokestatic v8a.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ee: athrow
      // ef: aload 5
      // f1: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6059524685039536104L, -2331461745073679080L, MethodHandles.lookup().lookupClass()).a(258259000676904L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 27615294569187L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[12];
      int var5 = 0;
      String var4 = "\u0002v\u008d\u0098Â\u0082hË\u0097oÅj\f\u000b_\nðSBL\u0005 ÇE \u0006\u001a\u000fzÂ;\u0081Â\u000bÖþn6Ç,(:|uæ\u0010\u008b4M36!¥c\u008a-Ê3q\u0085 ¨°¾0Ü<èi\u0005Ú\u0087;8\u0093©v((\u009aÑ\u0010×ådõw±ýK\u000e\u001d\u008fþ\u0080@$@0r½\u0080]\u0084MQÍ\u001es\t£;níÞÉ1»Lë\u0016\u0010(W\u0093\u009f\u0099\u001bjÎ\u0080o&õ\u001ba0\u0007\u0098²,\u0007úl\u001b¿µ\u0010M\u0083ÞFCQ\u0017ã^+\u0013\u009cÉ\u001f>} \u008f\u009dóA\røòÑÐÔ´\u0083-ëü9Ôáë\r\u0098Z\u0011i¹Ï<Á\u0011\u008f7\u001a ÇNR_$¹f'\u0090'0\u0006\u001f\u0002Õ¤Tjaf\u007f\u0018üã\u0013tu\fiÌØ\u0089(=\u0090x\u0086$XhÙ2î®Î\"2¥\u00821â\u00ad\u008dÖ¥á\u0001\u0093z\u008bú\u0011?²\u0016\u0015\u00adj\u008cs±×i\u0010ÞRá\u001eÅÐö@ô¤d\u009dB\u0087\u0081\u0081\u0010ql(T\u000e\u000f\u0001\u0092¤\u0090\u0004(d4>Z";
      int var6 = "\u0002v\u008d\u0098Â\u0082hË\u0097oÅj\f\u000b_\nðSBL\u0005 ÇE \u0006\u001a\u000fzÂ;\u0081Â\u000bÖþn6Ç,(:|uæ\u0010\u008b4M36!¥c\u008a-Ê3q\u0085 ¨°¾0Ü<èi\u0005Ú\u0087;8\u0093©v((\u009aÑ\u0010×ådõw±ýK\u000e\u001d\u008fþ\u0080@$@0r½\u0080]\u0084MQÍ\u001es\t£;níÞÉ1»Lë\u0016\u0010(W\u0093\u009f\u0099\u001bjÎ\u0080o&õ\u001ba0\u0007\u0098²,\u0007úl\u001b¿µ\u0010M\u0083ÞFCQ\u0017ã^+\u0013\u009cÉ\u001f>} \u008f\u009dóA\røòÑÐÔ´\u0083-ëü9Ôáë\r\u0098Z\u0011i¹Ï<Á\u0011\u008f7\u001a ÇNR_$¹f'\u0090'0\u0006\u001f\u0002Õ¤Tjaf\u007f\u0018üã\u0013tu\fiÌØ\u0089(=\u0090x\u0086$XhÙ2î®Î\"2¥\u00821â\u00ad\u008dÖ¥á\u0001\u0093z\u008bú\u0011?²\u0016\u0015\u00adj\u008cs±×i\u0010ÞRá\u001eÅÐö@ô¤d\u009dB\u0087\u0081\u0081\u0010ql(T\u000e\u000f\u0001\u0092¤\u0090\u0004(d4>Z"
         .length();
      char var3 = '(';
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
                     c = new String[12];
                     rmc = LogManager.getLogger();
                     jya = Maps.newHashMap();
                     qj7 = Maps.newHashMap();
                     ye1 = Maps.newHashMap();
                     fa6 = Maps.newHashMap();
                     jnl(StructureMineshaftStart.class, a<"v">(29685, 9005484412514017798L ^ var9));
                     jnl(MapGenVillage$Start.class, a<"v">(31676, 5018100455010445899L ^ var9));
                     jnl(MapGenNetherBridge$Start.class, a<"v">(15603, 3527907149370584323L ^ var9));
                     jnl(MapGenStronghold$Start.class, a<"v">(20370, 1169659766246973036L ^ var9));
                     jnl(MapGenScatteredFeature$Start.class, a<"v">(28955, 5685287736583528679L ^ var9));
                     jnl(StructureOceanMonument$StartMonument.class, a<"v">(9563, 7757371833763263652L ^ var9));
                     StructureMineshaftPieces._pd();
                     StructureVillagePieces.amy();
                     StructureNetherBridgePieces.zit();
                     StructureStrongholdPieces.awe();
                     ComponentScatteredFeaturePieces.t05();
                     StructureOceanMonumentPieces.hi_();
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

                  var4 = "Bql\u000eÿÞI(ù'Í¨\u008d¸î?\u0081eô_\u009cZÓ` 20Jé?KX\u008d-Fp¡aï*\u0089MÅ\u00adqUx\u007f\u0081e$ÊI Ìá\u000e";
                  var6 = "Bql\u000eÿÞI(ù'Í¨\u008d¸î?\u0081eô_\u009cZÓ` 20Jé?KX\u008d-Fp¡aï*\u0089MÅ\u00adqUx\u007f\u0081e$ÊI Ìá\u000e".length();
                  var3 = 24;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 17753;
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
            throw new RuntimeException("v8a", var10);
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
         throw new RuntimeException("v8a" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
