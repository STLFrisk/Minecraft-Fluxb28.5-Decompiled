import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class yoe {
   private static final ExecutorService hd2;
   private final lc5 c4s;
   private final File wtw;
   private final MinecraftSessionService j79;
   private final LoadingCache hla;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public yoe(lc5 var1, File var2, MinecraftSessionService var3) {
      this.c4s = var1;
      this.wtw = var2;
      this.j79 = var3;
      this.hla = CacheBuilder.newBuilder().expireAfterAccess(15L, TimeUnit.SECONDS).build(new yoe$1(this));
   }

   public gdz a1t(MinecraftProfileTexture var1, Type var2) {
      return this.guc(var1, var2, (yoe$cdm)null);
   }

   public gdz guc(MinecraftProfileTexture param1, Type param2, yoe$cdm param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic yoe.a J
      // 003: ldc2_w 50514736906275
      // 006: lxor
      // 007: lstore 4
      // 009: new gdz
      // 00c: dup
      // 00d: new java/lang/StringBuilder
      // 010: dup
      // 011: invokespecial java/lang/StringBuilder.<init> ()V
      // 014: sipush 28912
      // 017: ldc2_w 286584264896676302
      // 01a: lload 4
      // 01c: lxor
      // 01d: invokedynamic f (IJ)Ljava/lang/String; bsm=yoe.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 022: nop
      // 023: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 026: aload 1
      // 027: invokevirtual com/mojang/authlib/minecraft/MinecraftProfileTexture.getHash ()Ljava/lang/String;
      // 02a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 02d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 030: invokespecial gdz.<init> (Ljava/lang/String;)V
      // 033: astore 7
      // 035: invokestatic OpaquePredicate.c ()I
      // 038: aload 0
      // 039: getfield yoe.c4s Llc5;
      // 03c: aload 7
      // 03e: invokevirtual lc5.dry (Lgdz;)Lsm5;
      // 041: astore 8
      // 043: istore 6
      // 045: aload 8
      // 047: ifnull 070
      // 04a: aload 3
      // 04b: iload 6
      // 04d: ifne 062
      // 050: goto 057
      // 053: invokestatic yoe.a (Loov;)Loov;
      // 056: athrow
      // 057: ifnull 102
      // 05a: goto 061
      // 05d: invokestatic yoe.a (Loov;)Loov;
      // 060: athrow
      // 061: aload 3
      // 062: aload 2
      // 063: aload 7
      // 065: aload 1
      // 066: invokeinterface yoe$cdm.hax (Lcom/mojang/authlib/minecraft/MinecraftProfileTexture$Type;Lgdz;Lcom/mojang/authlib/minecraft/MinecraftProfileTexture;)V 4
      // 06b: iload 6
      // 06d: ifeq 102
      // 070: new java/io/File
      // 073: dup
      // 074: aload 0
      // 075: getfield yoe.wtw Ljava/io/File;
      // 078: aload 1
      // 079: invokevirtual com/mojang/authlib/minecraft/MinecraftProfileTexture.getHash ()Ljava/lang/String;
      // 07c: invokevirtual java/lang/String.length ()I
      // 07f: bipush 2
      // 080: if_icmple 09a
      // 083: goto 08a
      // 086: invokestatic yoe.a (Loov;)Loov;
      // 089: athrow
      // 08a: aload 1
      // 08b: invokevirtual com/mojang/authlib/minecraft/MinecraftProfileTexture.getHash ()Ljava/lang/String;
      // 08e: bipush 0
      // 08f: bipush 2
      // 090: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 093: goto 0a9
      // 096: invokestatic yoe.a (Loov;)Loov;
      // 099: athrow
      // 09a: sipush 14756
      // 09d: ldc2_w 3094337602444511387
      // 0a0: lload 4
      // 0a2: lxor
      // 0a3: invokedynamic f (IJ)Ljava/lang/String; bsm=yoe.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a8: nop
      // 0a9: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 0ac: astore 9
      // 0ae: new java/io/File
      // 0b1: dup
      // 0b2: aload 9
      // 0b4: aload 1
      // 0b5: invokevirtual com/mojang/authlib/minecraft/MinecraftProfileTexture.getHash ()Ljava/lang/String;
      // 0b8: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 0bb: astore 10
      // 0bd: aload 2
      // 0be: getstatic com/mojang/authlib/minecraft/MinecraftProfileTexture$Type.SKIN Lcom/mojang/authlib/minecraft/MinecraftProfileTexture$Type;
      // 0c1: if_acmpne 0d2
      // 0c4: new bzt
      // 0c7: dup
      // 0c8: invokespecial bzt.<init> ()V
      // 0cb: goto 0d3
      // 0ce: invokestatic yoe.a (Loov;)Loov;
      // 0d1: athrow
      // 0d2: aconst_null
      // 0d3: astore 11
      // 0d5: new bhs
      // 0d8: dup
      // 0d9: aload 10
      // 0db: aload 1
      // 0dc: invokevirtual com/mojang/authlib/minecraft/MinecraftProfileTexture.getUrl ()Ljava/lang/String;
      // 0df: invokestatic wip.s_2 ()Lgdz;
      // 0e2: new yoe$2
      // 0e5: dup
      // 0e6: aload 0
      // 0e7: aload 11
      // 0e9: aload 3
      // 0ea: aload 2
      // 0eb: aload 7
      // 0ed: aload 1
      // 0ee: invokespecial yoe$2.<init> (Lyoe;Lji7;Lyoe$cdm;Lcom/mojang/authlib/minecraft/MinecraftProfileTexture$Type;Lgdz;Lcom/mojang/authlib/minecraft/MinecraftProfileTexture;)V
      // 0f1: invokespecial bhs.<init> (Ljava/io/File;Ljava/lang/String;Lgdz;Lji7;)V
      // 0f4: astore 12
      // 0f6: aload 0
      // 0f7: getfield yoe.c4s Llc5;
      // 0fa: aload 7
      // 0fc: aload 12
      // 0fe: invokevirtual lc5.pc2 (Lgdz;Lsm5;)Z
      // 101: pop
      // 102: aload 7
      // 104: areturn
   }

   public void u0b(GameProfile var1, yoe$cdm var2, boolean var3) {
      hd2.submit(new yoe$3(this, var1, var3, var2));
   }

   public Map evg(GameProfile var1) {
      return (Map)this.hla.getUnchecked(var1);
   }

   public static MinecraftSessionService pc0(yoe var0) {
      return var0.j79;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-9056330135978183605L, 2345370202622498933L, MethodHandles.lookup().lookupClass()).a(156584790255782L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 94116664788339L;
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
      String var6 = "wX\bd\u0099c\u001e\u008e\u0091\u00007\u001f%\u0011ò±\u0010¹,\u0087Ë\u0099X±\u009a\u0080\u001c\u0012Dã, Ä";
      int var8 = "wX\bd\u0099c\u001e\u008e\u0091\u00007\u001f%\u0011ò±\u0010¹,\u0087Ë\u0099X±\u009a\u0080\u001c\u0012Dã, Ä".length();
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
            hd2 = new ThreadPoolExecutor(0, 2, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue<>());
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 27008;
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
            throw new RuntimeException("yoe", var10);
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
         throw new RuntimeException("yoe" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
