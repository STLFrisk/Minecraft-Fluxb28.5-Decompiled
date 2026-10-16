import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
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

public class hv2$1 implements yoe$cdm {
   public final hv2 y_t;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public hv2$1(hv2 var1) {
      this.y_t = var1;
   }

   @Override
   public void hax(Type param1, gdz param2, MinecraftProfileTexture param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic hv2$1.a J
      // 03: ldc2_w 6544921741523
      // 06: lxor
      // 07: lstore 4
      // 09: invokestatic OpaquePredicate.c ()I
      // 0c: istore 6
      // 0e: getstatic hv2$2.pq7 [I
      // 11: aload 1
      // 12: invokevirtual com/mojang/authlib/minecraft/MinecraftProfileTexture$Type.ordinal ()I
      // 15: iaload
      // 16: lookupswitch 141 2 1 26 2 125
      // 30: aload 0
      // 31: getfield hv2$1.y_t Lhv2;
      // 34: aload 2
      // 35: putfield hv2.lko Lgdz;
      // 38: aload 0
      // 39: getfield hv2$1.y_t Lhv2;
      // 3c: aload 3
      // 3d: sipush 14509
      // 40: ldc2_w 5983968399371507135
      // 43: lload 4
      // 45: lxor
      // 46: invokedynamic z (IJ)Ljava/lang/String; bsm=hv2$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b: nop
      // 4c: invokevirtual com/mojang/authlib/minecraft/MinecraftProfileTexture.getMetadata (Ljava/lang/String;)Ljava/lang/String;
      // 4f: invokestatic hv2.uh4 (Lhv2;Ljava/lang/String;)Ljava/lang/String;
      // 52: pop
      // 53: aload 0
      // 54: getfield hv2$1.y_t Lhv2;
      // 57: invokestatic hv2.and (Lhv2;)Ljava/lang/String;
      // 5a: iload 6
      // 5c: ifne 8d
      // 5f: goto 66
      // 62: invokestatic hv2$1.a (Loov;)Loov;
      // 65: athrow
      // 66: ifnonnull a3
      // 69: goto 70
      // 6c: invokestatic hv2$1.a (Loov;)Loov;
      // 6f: athrow
      // 70: aload 0
      // 71: getfield hv2$1.y_t Lhv2;
      // 74: sipush 10791
      // 77: ldc2_w 4793849073861855028
      // 7a: lload 4
      // 7c: lxor
      // 7d: invokedynamic z (IJ)Ljava/lang/String; bsm=hv2$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 82: nop
      // 83: invokestatic hv2.uh4 (Lhv2;Ljava/lang/String;)Ljava/lang/String;
      // 86: goto 8d
      // 89: invokestatic hv2$1.a (Loov;)Loov;
      // 8c: athrow
      // 8d: pop
      // 8e: iload 6
      // 90: ifeq a3
      // 93: aload 0
      // 94: getfield hv2$1.y_t Lhv2;
      // 97: aload 2
      // 98: invokestatic hv2.nqd (Lhv2;Lgdz;)Lgdz;
      // 9b: pop
      // 9c: goto a3
      // 9f: invokestatic hv2$1.a (Loov;)Loov;
      // a2: athrow
      // a3: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(4297977811409897986L, -8573218230012003806L, MethodHandles.lookup().lookupClass()).a(73405552928L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 112566814023167L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[2];
      int var7 = 0;
      String var6 = "QqÓ\u0007x¿Õé¤M\t\r\u0089\u0090Ñü\u0010!\u0002\u001d\u0099+C&CCÍÕ#Wj,C";
      int var8 = "QqÓ\u0007x¿Õé¤M\t\r\u0089\u0090Ñü\u0010!\u0002\u001d\u0099+C&CCÍÕ#Wj,C".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[2];
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 2060;
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
            throw new RuntimeException("hv2$1", var10);
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
         throw new RuntimeException("hv2$1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
