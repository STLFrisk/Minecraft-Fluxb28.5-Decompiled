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

public class pqs extends Module {
   private boolean u1z;
   private float lup;
   public mew l96;
   public vt2 vcr;
   public static NumberSetting her;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public pqs() {
      long var1 = a ^ 19716406470889L;
      super(b<"f">(16293, 2247397948266553532L ^ var1), _aj.y49, false, new SubEngine[0]);
      this.u1z = false;
      this.lup = 0.0F;
   }

   @EventHandler
   public void wdv(ihr param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: getfield ihr.noy Lmz2;
      // 08: instanceof net/minecraft/network/play/client/C07PacketPlayerDigging
      // 0b: iload 2
      // 0c: ifeq 34
      // 0f: ifeq cc
      // 12: goto 19
      // 15: invokestatic pqs.a (Loov;)Loov;
      // 18: athrow
      // 19: getstatic pqs.ek1 Lc05;
      // 1c: getfield Minecraft.l7q Lhh6;
      // 1f: iload 2
      // 20: ifeq 44
      // 23: goto 2a
      // 26: invokestatic pqs.a (Loov;)Loov;
      // 29: athrow
      // 2a: invokevirtual hh6.p65 ()Z
      // 2d: goto 34
      // 30: invokestatic pqs.a (Loov;)Loov;
      // 33: athrow
      // 34: ifne cc
      // 37: getstatic pqs.ek1 Lc05;
      // 3a: getfield Minecraft.l7q Lhh6;
      // 3d: goto 44
      // 40: invokestatic pqs.a (Loov;)Loov;
      // 43: athrow
      // 44: ifnull cc
      // 47: aload 1
      // 48: getfield ihr.noy Lmz2;
      // 4b: checkcast net/minecraft/network/play/client/C07PacketPlayerDigging
      // 4e: astore 3
      // 4f: aload 3
      // 50: invokevirtual net/minecraft/network/play/client/C07PacketPlayerDigging.sju ()Lnet/minecraft/network/play/client/C07PacketPlayerDigging$pl2;
      // 53: getstatic net/minecraft/network/play/client/C07PacketPlayerDigging$pl2.gi_ Lnet/minecraft/network/play/client/C07PacketPlayerDigging$pl2;
      // 56: iload 2
      // 57: ifeq 97
      // 5a: if_acmpne 89
      // 5d: goto 64
      // 60: invokestatic pqs.a (Loov;)Loov;
      // 63: athrow
      // 64: aload 0
      // 65: bipush 1
      // 66: putfield pqs.u1z Z
      // 69: aload 0
      // 6a: aload 3
      // 6b: invokevirtual net/minecraft/network/play/client/C07PacketPlayerDigging.h6h ()Lmew;
      // 6e: putfield pqs.l96 Lmew;
      // 71: aload 0
      // 72: aload 3
      // 73: invokevirtual net/minecraft/network/play/client/C07PacketPlayerDigging.up9 ()Lvt2;
      // 76: putfield pqs.vcr Lvt2;
      // 79: aload 0
      // 7a: fconst_0
      // 7b: putfield pqs.lup F
      // 7e: iload 2
      // 7f: ifne cc
      // 82: goto 89
      // 85: invokestatic pqs.a (Loov;)Loov;
      // 88: athrow
      // 89: aload 3
      // 8a: invokevirtual net/minecraft/network/play/client/C07PacketPlayerDigging.sju ()Lnet/minecraft/network/play/client/C07PacketPlayerDigging$pl2;
      // 8d: getstatic net/minecraft/network/play/client/C07PacketPlayerDigging$pl2.t2e Lnet/minecraft/network/play/client/C07PacketPlayerDigging$pl2;
      // 90: goto 97
      // 93: invokestatic pqs.a (Loov;)Loov;
      // 96: athrow
      // 97: iload 2
      // 98: ifeq b3
      // 9b: if_acmpeq b6
      // 9e: goto a5
      // a1: invokestatic pqs.a (Loov;)Loov;
      // a4: athrow
      // a5: aload 3
      // a6: invokevirtual net/minecraft/network/play/client/C07PacketPlayerDigging.sju ()Lnet/minecraft/network/play/client/C07PacketPlayerDigging$pl2;
      // a9: getstatic net/minecraft/network/play/client/C07PacketPlayerDigging$pl2.x56 Lnet/minecraft/network/play/client/C07PacketPlayerDigging$pl2;
      // ac: goto b3
      // af: invokestatic pqs.a (Loov;)Loov;
      // b2: athrow
      // b3: if_acmpne cc
      // b6: aload 0
      // b7: bipush 0
      // b8: putfield pqs.u1z Z
      // bb: aload 0
      // bc: aconst_null
      // bd: putfield pqs.l96 Lmew;
      // c0: aload 0
      // c1: aconst_null
      // c2: putfield pqs.vcr Lvt2;
      // c5: goto cc
      // c8: invokestatic pqs.a (Loov;)Loov;
      // cb: athrow
      // cc: return
   }

   @EventHandler
   public void pku(edg param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: getstatic pqs.ek1 Lc05;
      // 07: getfield Minecraft.l7q Lhh6;
      // 0a: invokevirtual hh6.p65 ()Z
      // 0d: iload 2
      // 0e: ifne 3b
      // 11: ifeq 30
      // 14: goto 1b
      // 17: invokestatic pqs.a (Loov;)Loov;
      // 1a: athrow
      // 1b: getstatic pqs.ek1 Lc05;
      // 1e: getfield Minecraft.l7q Lhh6;
      // 21: bipush 0
      // 22: putfield hh6.hsn I
      // 25: iload 2
      // 26: ifeq d3
      // 29: goto 30
      // 2c: invokestatic pqs.a (Loov;)Loov;
      // 2f: athrow
      // 30: aload 0
      // 31: getfield pqs.u1z Z
      // 34: goto 3b
      // 37: invokestatic pqs.a (Loov;)Loov;
      // 3a: athrow
      // 3b: ifeq d3
      // 3e: getstatic pqs.ek1 Lc05;
      // 41: getfield Minecraft.tij Lkh3;
      // 44: aload 0
      // 45: getfield pqs.l96 Lmew;
      // 48: invokevirtual WorldClient.getBlockState (Lmew;)Lzfz;
      // 4b: invokeinterface zfz.r_y ()Le0x; 1
      // 50: astore 3
      // 51: aload 0
      // 52: aload 0
      // 53: getfield pqs.lup F
      // 56: aload 3
      // 57: getstatic pqs.ek1 Lc05;
      // 5a: getfield Minecraft.vg8 Ll86;
      // 5d: getstatic pqs.ek1 Lc05;
      // 60: getfield Minecraft.tij Lkh3;
      // 63: aload 0
      // 64: getfield pqs.l96 Lmew;
      // 67: invokevirtual e0x.lf9 (Lha9;Lt9d;Lmew;)F
      // 6a: f2d
      // 6b: getstatic pqs.her Lcrk;
      // 6e: invokevirtual NumberSetting.u7t ()D
      // 71: dmul
      // 72: d2f
      // 73: fadd
      // 74: putfield pqs.lup F
      // 77: aload 0
      // 78: getfield pqs.lup F
      // 7b: fconst_1
      // 7c: fcmpl
      // 7d: iload 2
      // 7e: ifne a7
      // 81: iflt d3
      // 84: goto 8b
      // 87: invokestatic pqs.a (Loov;)Loov;
      // 8a: athrow
      // 8b: getstatic pqs.ek1 Lc05;
      // 8e: getfield Minecraft.tij Lkh3;
      // 91: aload 0
      // 92: getfield pqs.l96 Lmew;
      // 95: getstatic ox_.ibw Le0x;
      // 98: invokevirtual e0x.l4i ()Lzfz;
      // 9b: bipush 11
      // 9d: invokevirtual WorldClient.vct (Lmew;Lzfz;I)Z
      // a0: goto a7
      // a3: invokestatic pqs.a (Loov;)Loov;
      // a6: athrow
      // a7: pop
      // a8: getstatic pqs.ek1 Lc05;
      // ab: getfield Minecraft.vg8 Ll86;
      // ae: getfield EntityPlayerSP.lq7 Lp_k;
      // b1: invokevirtual p_k._m3 ()Lhv0;
      // b4: new net/minecraft/network/play/client/C07PacketPlayerDigging
      // b7: dup
      // b8: getstatic net/minecraft/network/play/client/C07PacketPlayerDigging$pl2.x56 Lnet/minecraft/network/play/client/C07PacketPlayerDigging$pl2;
      // bb: aload 0
      // bc: getfield pqs.l96 Lmew;
      // bf: aload 0
      // c0: getfield pqs.vcr Lvt2;
      // c3: invokespecial net/minecraft/network/play/client/C07PacketPlayerDigging.<init> (Lnet/minecraft/network/play/client/C07PacketPlayerDigging$pl2;Lmew;Lvt2;)V
      // c6: invokevirtual hv0.r92 (Lmz2;)V
      // c9: aload 0
      // ca: fconst_0
      // cb: putfield pqs.lup F
      // ce: aload 0
      // cf: bipush 0
      // d0: putfield pqs.u1z Z
      // d3: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(2209359046853894525L, 1161000288720779881L, MethodHandles.lookup().lookupClass()).a(158175561885998L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 139574847112716L;
      Cipher var0;
      Cipher var12 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[3];
      int var5 = 0;
      String var4 = "E\u009dèRõ¯\u008elðõI(ðì\u0084¤0NýR}\u008b+8\u0010ÂTì\u001e3='µ7°Á·\u0015R~ø ò\u009dðª×qC\u0082{\u001f\u009bÆ\u008f\u009cÎq\u0011/§¢ZË\u009fð\u0005[ó4\"òþµ";
      int var6 = "E\u009dèRõ¯\u008elðõI(ðì\u0084¤0NýR}\u008b+8\u0010ÂTì\u001e3='µ7°Á·\u0015R~ø ò\u009dðª×qC\u0082{\u001f\u009bÆ\u008f\u009cÎq\u0011/§¢ZË\u009fð\u0005[ó4\"òþµ"
         .length();
      char var3 = 24;
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var14 = b(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var14;
         if ((var2 += var3) >= var6) {
            f = var7;
            g = new String[3];
            her = new NumberSetting(b<"f">(14284, 5925484935176111666L ^ var9), b<"f">(20871, 4226690034834514042L ^ var9), 1.4F, 1.0F, 2.0F, 0.1F);
            return;
         }

         var3 = var4.charAt(var2);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 18209;
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
            throw new RuntimeException("pqs", var10);
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
         throw new RuntimeException("pqs" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
