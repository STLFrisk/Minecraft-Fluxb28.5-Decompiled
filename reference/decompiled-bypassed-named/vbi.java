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

public class vbi extends SubEngine {
   private static final long a;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public vbi() {
      long var1 = a ^ 45436006811585L;
      super(a<"x">(10073, 6340035784176724034L ^ var1), a<"x">(27566, 7423434355654763700L ^ var1));
   }

   @Override
   public void onRender() {
      super.onRender();
      this.wyl.z8v().qeu = 1.0F;
   }

   @EventHandler
   public void pa9(PlayerUpdateEvent param1) {
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
      // 05: getfield vbi.wyl Lc05;
      // 08: iload 2
      // 09: ifne 49
      // 0c: getfield Minecraft.oxn Lmoh;
      // 0f: getfield moh.mn1 Lm7l;
      // 12: getfield m7l.m7n Z
      // 15: ifeq 3e
      // 18: goto 1f
      // 1b: invokestatic vbi.a (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 0
      // 20: getfield vbi.wyl Lc05;
      // 23: getfield Minecraft.vg8 Ll86;
      // 26: invokevirtual EntityPlayerSP.mwv ()Z
      // 29: iload 2
      // 2a: ifne 5b
      // 2d: goto 34
      // 30: invokestatic vbi.a (Loov;)Loov;
      // 33: athrow
      // 34: ifeq 51
      // 37: goto 3e
      // 3a: invokestatic vbi.a (Loov;)Loov;
      // 3d: athrow
      // 3e: aload 0
      // 3f: getfield vbi.wyl Lc05;
      // 42: goto 49
      // 45: invokestatic vbi.a (Loov;)Loov;
      // 48: athrow
      // 49: invokevirtual Minecraft.z8v ()Laba;
      // 4c: fconst_1
      // 4d: putfield aba.qeu F
      // 50: return
      // 51: aload 0
      // 52: getfield vbi.wyl Lc05;
      // 55: getfield Minecraft.vg8 Ll86;
      // 58: getfield EntityPlayerSP.lfk Z
      // 5b: iload 2
      // 5c: ifne d2
      // 5f: ifeq b4
      // 62: goto 69
      // 65: invokestatic vbi.a (Loov;)Loov;
      // 68: athrow
      // 69: aload 0
      // 6a: getfield vbi.wyl Lc05;
      // 6d: getfield Minecraft.vg8 Ll86;
      // 70: iload 2
      // 71: ifne 96
      // 74: goto 7b
      // 77: invokestatic vbi.a (Loov;)Loov;
      // 7a: athrow
      // 7b: invokevirtual EntityPlayerSP.hzv ()Z
      // 7e: ifne f6
      // 81: goto 88
      // 84: invokestatic vbi.a (Loov;)Loov;
      // 87: athrow
      // 88: aload 0
      // 89: getfield vbi.wyl Lc05;
      // 8c: getfield Minecraft.vg8 Ll86;
      // 8f: goto 96
      // 92: invokestatic vbi.a (Loov;)Loov;
      // 95: athrow
      // 96: ldc2_w 0.3880000114440918
      // 99: putfield EntityPlayerSP.mop D
      // 9c: aload 0
      // 9d: ldc 0.204
      // 9f: nop
      // a0: invokespecial vbi.y8s (F)V
      // a3: aload 0
      // a4: getfield vbi.wyl Lc05;
      // a7: invokevirtual Minecraft.z8v ()Laba;
      // aa: ldc 1.35
      // ac: nop
      // ad: putfield aba.qeu F
      // b0: iload 2
      // b1: ifeq f6
      // b4: aload 0
      // b5: getfield vbi.wyl Lc05;
      // b8: iload 2
      // b9: ifne ed
      // bc: goto c3
      // bf: invokestatic vbi.a (Loov;)Loov;
      // c2: athrow
      // c3: getfield Minecraft.vg8 Ll86;
      // c6: getfield EntityPlayerSP.mop D
      // c9: dconst_0
      // ca: dcmpl
      // cb: goto d2
      // ce: invokestatic vbi.a (Loov;)Loov;
      // d1: athrow
      // d2: ifle e9
      // d5: aload 0
      // d6: getfield vbi.wyl Lc05;
      // d9: getfield Minecraft.vg8 Ll86;
      // dc: ldc2_w -0.2
      // df: putfield EntityPlayerSP.mop D
      // e2: goto e9
      // e5: invokestatic vbi.a (Loov;)Loov;
      // e8: athrow
      // e9: aload 0
      // ea: getfield vbi.wyl Lc05;
      // ed: invokevirtual Minecraft.z8v ()Laba;
      // f0: ldc 0.89
      // f2: nop
      // f3: putfield aba.qeu F
      // f6: return
   }

   private void y8s(float var1) {
      float var2 = this.wyl.vg8.x5k * (float) (Math.PI / 180.0);
      this.wyl.vg8.icv = this.wyl.vg8.icv - (double)(fe6.rtn(var2) * var1);
      this.wyl.vg8.bw4 = this.wyl.vg8.bw4 + (double)(fe6.ssk(var2) * var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(790890064632580945L, 8801239915496749685L, MethodHandles.lookup().lookupClass()).a(74580557009820L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 103778049941577L;
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
      String var6 = "oXî ~ÂÏd&\u0001hC\u0090«\u0087k 5\u0004\u009aóMøâ\u0085ìÌdò\u0088\tZé]\u008býØñëÍ8h·\u0097\u001awß(\u009b";
      int var8 = "oXî ~ÂÏd&\u0001hC\u0090«\u0087k 5\u0004\u009aóMøâ\u0085ìÌdò\u0088\tZé]\u008býØñëÍ8h·\u0097\u001awß(\u009b".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = b(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            d = var9;
            e = new String[2];
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 32756;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("vbi", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         e[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("vbi" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
