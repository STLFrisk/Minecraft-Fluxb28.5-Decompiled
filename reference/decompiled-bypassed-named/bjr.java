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

public class bjr extends Module {
   public static final float lxd = 0.75F;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public bjr() {
      long var1 = a ^ 68097936576633L;
      super(b<"m">(8935, 1131997136772499459L ^ var1), _aj.sxc, false, new SubEngine[0]);
      if (this.dj1 == null) {
         this.dj1 = ((orn)ek1.yrr).xlg();
      }

      try {
         if (!this.dj1.containsKey(b<"m">(12003, 4514690294463890437L ^ var1))) {
            this.dj1.put(b<"m">(5654, 8287012595459898609L ^ var1), new s2w());
         }
      } catch (oov var3) {
         throw a(var3);
      }
   }

   @Override
   public void onEnable() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic bjr.a J
      // 03: ldc2_w 126689551979986
      // 06: lxor
      // 07: lstore 1
      // 08: aload 0
      // 09: invokespecial Module.onEnable ()V
      // 0c: invokestatic OpaquePredicate.b ()I
      // 0f: aload 0
      // 10: pop
      // 11: istore 3
      // 12: getstatic bjr.ek1 Lc05;
      // 15: getfield Minecraft.x0p Lv3i;
      // 18: iload 3
      // 19: ifeq 46
      // 1c: invokevirtual v3i.oqr ()Lqn4;
      // 1f: ifnull 3e
      // 22: goto 29
      // 25: invokestatic bjr.a (Loov;)Loov;
      // 28: athrow
      // 29: aload 0
      // 2a: pop
      // 2b: getstatic bjr.ek1 Lc05;
      // 2e: getfield Minecraft.x0p Lv3i;
      // 31: invokevirtual v3i.oqr ()Lqn4;
      // 34: invokevirtual qn4.fzs ()V
      // 37: goto 3e
      // 3a: invokestatic bjr.a (Loov;)Loov;
      // 3d: athrow
      // 3e: aload 0
      // 3f: pop
      // 40: getstatic bjr.ek1 Lc05;
      // 43: getfield Minecraft.x0p Lv3i;
      // 46: new gdz
      // 49: dup
      // 4a: sipush 5654
      // 4d: ldc2_w 8286954108137306458
      // 50: lload 1
      // 51: lxor
      // 52: invokedynamic m (IJ)Ljava/lang/String; bsm=bjr.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: nop
      // 58: sipush 5654
      // 5b: ldc2_w 8286954108137306458
      // 5e: lload 1
      // 5f: lxor
      // 60: invokedynamic m (IJ)Ljava/lang/String; bsm=bjr.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 65: nop
      // 66: invokespecial gdz.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 69: invokevirtual v3i.uyd (Lgdz;)V
      // 6c: return
   }

   @Override
   public void onDisable() {
      super.onDisable();
   }

   @EventHandler
   public void dxf(TickEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic bjr.a J
      // 03: ldc2_w 17454782246078
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: pop
      // 0f: getstatic bjr.ek1 Lc05;
      // 12: iload 4
      // 14: ifeq 30
      // 17: getfield Minecraft.vg8 Ll86;
      // 1a: ifnull 42
      // 1d: goto 24
      // 20: invokestatic bjr.a (Loov;)Loov;
      // 23: athrow
      // 24: aload 0
      // 25: pop
      // 26: getstatic bjr.ek1 Lc05;
      // 29: goto 30
      // 2c: invokestatic bjr.a (Loov;)Loov;
      // 2f: athrow
      // 30: iload 4
      // 32: ifeq 4c
      // 35: getfield Minecraft.tij Lkh3;
      // 38: ifnonnull 47
      // 3b: goto 42
      // 3e: invokestatic bjr.a (Loov;)Loov;
      // 41: athrow
      // 42: return
      // 43: invokestatic bjr.a (Loov;)Loov;
      // 46: athrow
      // 47: aload 0
      // 48: pop
      // 49: getstatic bjr.ek1 Lc05;
      // 4c: getfield Minecraft.x0p Lv3i;
      // 4f: iload 4
      // 51: ifeq 70
      // 54: invokevirtual v3i.oqr ()Lqn4;
      // 57: ifnonnull 96
      // 5a: goto 61
      // 5d: invokestatic bjr.a (Loov;)Loov;
      // 60: athrow
      // 61: aload 0
      // 62: pop
      // 63: getstatic bjr.ek1 Lc05;
      // 66: getfield Minecraft.x0p Lv3i;
      // 69: goto 70
      // 6c: invokestatic bjr.a (Loov;)Loov;
      // 6f: athrow
      // 70: new gdz
      // 73: dup
      // 74: sipush 5654
      // 77: ldc2_w 8286992766825300022
      // 7a: lload 2
      // 7b: lxor
      // 7c: invokedynamic m (IJ)Ljava/lang/String; bsm=bjr.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 81: nop
      // 82: sipush 5654
      // 85: ldc2_w 8286992766825300022
      // 88: lload 2
      // 89: lxor
      // 8a: invokedynamic m (IJ)Ljava/lang/String; bsm=bjr.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8f: nop
      // 90: invokespecial gdz.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 93: invokevirtual v3i.uyd (Lgdz;)V
      // 96: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1391938691506185622L, -6225945705602076854L, MethodHandles.lookup().lookupClass()).a(37018935255201L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 53776585132875L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[3];
      int var7 = 0;
      String var6 = "uô8`F\u0019YÓúUN\u001c\u0087\u0007D\u008cxYÌ\u0000ú©kw ½\u000fßµïl\b\u0086ËvÈ¬\u0002Ã\u0085W\u0018\u0016º~§i\u0005H¼\u001fC&ÔQ<« ½å×tÔá:£3Ó3«\u0084þ\u0016\u0097j6\rÆ\u0085Åè\u0017¨zi\u000fSÂGÞ";
      int var8 = "uô8`F\u0019YÓúUN\u001c\u0087\u0007D\u008cxYÌ\u0000ú©kw ½\u000fßµïl\b\u0086ËvÈ¬\u0002Ã\u0085W\u0018\u0016º~§i\u0005H¼\u001fC&ÔQ<« ½å×tÔá:£3Ó3«\u0084þ\u0016\u0097j6\rÆ\u0085Åè\u0017¨zi\u000fSÂGÞ"
         .length();
      char var5 = 24;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = b(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            f = var9;
            g = new String[3];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static oov a(oov var0) {
      return var0;
   }

   private static String b(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5320;
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
            throw new RuntimeException("bjr", var10);
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
         g[var5] = b(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("bjr" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
