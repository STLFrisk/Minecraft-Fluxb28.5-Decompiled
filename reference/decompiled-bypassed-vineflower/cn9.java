import com.google.common.collect.Lists;
import java.io.InputStream;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class cn9 implements y99 {
   private static final Logger b23;
   public final List i2c = Lists.newArrayList();
   private final if1 ilc;
   private static final long a;
   private static final String b;

   public cn9(if1 var1) {
      this.ilc = var1;
   }

   public void vu1(g68 var1) {
      this.i2c.add(var1);
   }

   @Override
   public Set ugj() {
      return null;
   }

   @Override
   public yaa td5(gdz param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aconst_null
      // 01: astore 3
      // 02: aload 1
      // 03: invokestatic cn9.uoi (Lgdz;)Lgdz;
      // 06: astore 4
      // 08: invokestatic t9d.b ()I
      // 0b: aload 0
      // 0c: getfield cn9.i2c Ljava/util/List;
      // 0f: invokeinterface java/util/List.size ()I 1
      // 14: bipush 1
      // 15: isub
      // 16: istore 5
      // 18: istore 2
      // 19: iload 5
      // 1b: iflt 9d
      // 1e: aload 0
      // 1f: getfield cn9.i2c Ljava/util/List;
      // 22: iload 5
      // 24: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 29: checkcast g68
      // 2c: astore 6
      // 2e: aload 3
      // 2f: iload 2
      // 30: ifeq 60
      // 33: ifnonnull 5e
      // 36: goto 3d
      // 39: invokestatic cn9.a (Loov;)Loov;
      // 3c: athrow
      // 3d: aload 6
      // 3f: aload 4
      // 41: invokeinterface g68.g1w (Lgdz;)Z 2
      // 46: iload 2
      // 47: ifeq 66
      // 4a: goto 51
      // 4d: invokestatic cn9.a (Loov;)Loov;
      // 50: athrow
      // 51: ifeq 5e
      // 54: goto 5b
      // 57: invokestatic cn9.a (Loov;)Loov;
      // 5a: athrow
      // 5b: aload 6
      // 5d: astore 3
      // 5e: aload 6
      // 60: aload 1
      // 61: invokeinterface g68.g1w (Lgdz;)Z 2
      // 66: ifeq 96
      // 69: aconst_null
      // 6a: astore 7
      // 6c: aload 3
      // 6d: ifnull 79
      // 70: aload 0
      // 71: aload 4
      // 73: aload 3
      // 74: invokevirtual cn9.xpr (Lgdz;Lg68;)Ljava/io/InputStream;
      // 77: astore 7
      // 79: new ay1
      // 7c: dup
      // 7d: aload 6
      // 7f: invokeinterface g68.qw5 ()Ljava/lang/String; 1
      // 84: aload 1
      // 85: aload 0
      // 86: aload 1
      // 87: aload 6
      // 89: invokevirtual cn9.xpr (Lgdz;Lg68;)Ljava/io/InputStream;
      // 8c: aload 7
      // 8e: aload 0
      // 8f: getfield cn9.ilc Lif1;
      // 92: invokespecial ay1.<init> (Ljava/lang/String;Lgdz;Ljava/io/InputStream;Ljava/io/InputStream;Lif1;)V
      // 95: areturn
      // 96: iinc 5 -1
      // 99: iload 2
      // 9a: ifne 19
      // 9d: new java/io/FileNotFoundException
      // a0: dup
      // a1: aload 1
      // a2: invokevirtual gdz.toString ()Ljava/lang/String;
      // a5: invokespecial java/io/FileNotFoundException.<init> (Ljava/lang/String;)V
      // a8: athrow
   }

   public InputStream xpr(gdz var1, g68 var2) {
      InputStream var3 = var2.e77(var1);

      try {
         if (b23.isDebugEnabled()) {
            return new cn9$zw7(var3, var1, var2.qw5());
         }
      } catch (oov var4) {
         throw a(var4);
      }

      return var3;
   }

   @Override
   public List gc4(gdz param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 03: astore 3
      // 04: invokestatic t9d.b ()I
      // 07: aload 1
      // 08: invokestatic cn9.uoi (Lgdz;)Lgdz;
      // 0b: astore 4
      // 0d: istore 2
      // 0e: aload 0
      // 0f: getfield cn9.i2c Ljava/util/List;
      // 12: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 17: astore 5
      // 19: aload 5
      // 1b: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 20: ifeq 9c
      // 23: aload 5
      // 25: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2a: checkcast g68
      // 2d: astore 6
      // 2f: aload 6
      // 31: aload 1
      // 32: invokeinterface g68.g1w (Lgdz;)Z 2
      // 37: iload 2
      // 38: ifeq ad
      // 3b: iload 2
      // 3c: ifeq 60
      // 3f: goto 46
      // 42: invokestatic cn9.a (Loov;)Loov;
      // 45: athrow
      // 46: ifeq 98
      // 49: goto 50
      // 4c: invokestatic cn9.a (Loov;)Loov;
      // 4f: athrow
      // 50: aload 6
      // 52: aload 4
      // 54: invokeinterface g68.g1w (Lgdz;)Z 2
      // 59: goto 60
      // 5c: invokestatic cn9.a (Loov;)Loov;
      // 5f: athrow
      // 60: ifeq 72
      // 63: aload 0
      // 64: aload 4
      // 66: aload 6
      // 68: invokevirtual cn9.xpr (Lgdz;Lg68;)Ljava/io/InputStream;
      // 6b: goto 73
      // 6e: invokestatic cn9.a (Loov;)Loov;
      // 71: athrow
      // 72: aconst_null
      // 73: astore 7
      // 75: aload 3
      // 76: new ay1
      // 79: dup
      // 7a: aload 6
      // 7c: invokeinterface g68.qw5 ()Ljava/lang/String; 1
      // 81: aload 1
      // 82: aload 0
      // 83: aload 1
      // 84: aload 6
      // 86: invokevirtual cn9.xpr (Lgdz;Lg68;)Ljava/io/InputStream;
      // 89: aload 7
      // 8b: aload 0
      // 8c: getfield cn9.ilc Lif1;
      // 8f: invokespecial ay1.<init> (Ljava/lang/String;Lgdz;Ljava/io/InputStream;Ljava/io/InputStream;Lif1;)V
      // 92: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 97: pop
      // 98: iload 2
      // 99: ifne 19
      // 9c: aload 3
      // 9d: iload 2
      // 9e: ifeq c1
      // a1: invokeinterface java/util/List.isEmpty ()Z 1
      // a6: goto ad
      // a9: invokestatic cn9.a (Loov;)Loov;
      // ac: athrow
      // ad: ifeq c0
      // b0: new java/io/FileNotFoundException
      // b3: dup
      // b4: aload 1
      // b5: invokevirtual gdz.toString ()Ljava/lang/String;
      // b8: invokespecial java/io/FileNotFoundException.<init> (Ljava/lang/String;)V
      // bb: athrow
      // bc: invokestatic cn9.a (Loov;)Loov;
      // bf: athrow
      // c0: aload 3
      // c1: areturn
   }

   public static gdz uoi(gdz var0) {
      long var1 = a ^ 68289856211838L;
      return new gdz(var0._a7(), var0.xyp() + b);
   }

   public static Logger nyj() {
      return b23;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1464116052314292361L, 7880215991569639171L, MethodHandles.lookup().lookupClass()).a(266651469506152L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 100288661705814L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u0019\u001c5õ1âÂü".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
      b23 = LogManager.getLogger();
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
}
