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
import net.minecraft.network.play.client.C03PacketPlayer$C04PacketPlayerPosition;

public class v3p extends Module {
   public static q6h sub;
   public static ModeSetting tsd;
   public static NumberSetting h9b;
   public static NumberSetting te1;
   public static q6h ubl;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public v3p() {
      long var1 = a ^ 44022057484887L;
      super(b<"x">(15270, 2605779912019865630L ^ var1), _aj.p3z, tsd);
   }

   @EventHandler
   public void f1g(ihr param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic v3p.a J
      // 03: ldc2_w 127313888418590
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 4
      // 0d: aload 1
      // 0e: invokevirtual ihr.bbi ()Lmz2;
      // 11: instanceof net/minecraft/network/play/client/C02PacketUseEntity
      // 14: iload 4
      // 16: ifne 27
      // 19: ifne 24
      // 1c: goto 23
      // 1f: invokestatic v3p.a (Loov;)Loov;
      // 22: athrow
      // 23: return
      // 24: invokestatic v3p.eit ()Z
      // 27: iload 4
      // 29: ifne 43
      // 2c: ifne 62
      // 2f: goto 36
      // 32: invokestatic v3p.a (Loov;)Loov;
      // 35: athrow
      // 36: getstatic ModuleRegistry.ce6 Liri;
      // 39: invokevirtual iri.isEnabled ()Z
      // 3c: goto 43
      // 3f: invokestatic v3p.a (Loov;)Loov;
      // 42: athrow
      // 43: iload 4
      // 45: ifne 5f
      // 48: ifne 62
      // 4b: goto 52
      // 4e: invokestatic v3p.a (Loov;)Loov;
      // 51: athrow
      // 52: getstatic ModuleRegistry.kd6 Lohv;
      // 55: invokevirtual Speed.isEnabled ()Z
      // 58: goto 5f
      // 5b: invokestatic v3p.a (Loov;)Loov;
      // 5e: athrow
      // 5f: ifeq 63
      // 62: return
      // 63: aload 1
      // 64: invokevirtual ihr.bbi ()Lmz2;
      // 67: checkcast net/minecraft/network/play/client/C02PacketUseEntity
      // 6a: astore 5
      // 6c: aload 5
      // 6e: invokevirtual net/minecraft/network/play/client/C02PacketUseEntity.nf7 ()Lnet/minecraft/network/play/client/C02PacketUseEntity$_y6;
      // 71: getstatic net/minecraft/network/play/client/C02PacketUseEntity$_y6.cb5 Lnet/minecraft/network/play/client/C02PacketUseEntity$_y6;
      // 74: if_acmpne e1
      // 77: getstatic v3p.ek1 Lc05;
      // 7a: getfield Minecraft.vg8 Ll86;
      // 7d: getfield EntityPlayerSP.fcv Z
      // 80: iload 4
      // 82: ifne ae
      // 85: goto 8c
      // 88: invokestatic v3p.a (Loov;)Loov;
      // 8b: athrow
      // 8c: ifeq e1
      // 8f: goto 96
      // 92: invokestatic v3p.a (Loov;)Loov;
      // 95: athrow
      // 96: aload 0
      // 97: aload 5
      // 99: aload 0
      // 9a: pop
      // 9b: getstatic v3p.ek1 Lc05;
      // 9e: getfield Minecraft.tij Lkh3;
      // a1: invokevirtual net/minecraft/network/play/client/C02PacketUseEntity._nk (Lt9d;)Li2h;
      // a4: invokespecial v3p.x43 (Li2h;)Z
      // a7: goto ae
      // aa: invokestatic v3p.a (Loov;)Loov;
      // ad: athrow
      // ae: iload 4
      // b0: ifne db
      // b3: ifeq e1
      // b6: goto bd
      // b9: invokestatic v3p.a (Loov;)Loov;
      // bc: athrow
      // bd: getstatic v3p.tsd Lc_3;
      // c0: invokevirtual ModeSetting.getValue ()Ljava/lang/String;
      // c3: sipush 30052
      // c6: ldc2_w 2429448621153413011
      // c9: lload 2
      // ca: lxor
      // cb: invokedynamic x (IJ)Ljava/lang/String; bsm=v3p.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d0: nop
      // d1: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // d4: goto db
      // d7: invokestatic v3p.a (Loov;)Loov;
      // da: athrow
      // db: ifeq e1
      // de: invokestatic v3p.fla ()V
      // e1: return
   }

   private boolean x43(EntityLivingBase param1) {
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
      // 05: iload 2
      // 06: ifeq 14
      // 09: ifnull 32
      // 0c: goto 13
      // 0f: invokestatic v3p.a (Loov;)Loov;
      // 12: athrow
      // 13: aload 1
      // 14: getfield EntityLivingBase.qqi I
      // 17: iload 2
      // 18: ifeq 2f
      // 1b: bipush 15
      // 1d: if_icmpgt 32
      // 20: goto 27
      // 23: invokestatic v3p.a (Loov;)Loov;
      // 26: athrow
      // 27: bipush 1
      // 28: goto 2f
      // 2b: invokestatic v3p.a (Loov;)Loov;
      // 2e: athrow
      // 2f: goto 33
      // 32: bipush 0
      // 33: ireturn
   }

   public static void fla() {
      double[] var1 = new double[]{0.06, 0.0, 0.03, 0.0};
      int var10000 = OpaquePredicate.c();
      int var2 = 0;
      int var0 = var10000;

      while (var2 < var1.length) {
         ek1.vg8.lq7.sxi(new C03PacketPlayer$C04PacketPlayerPosition(ek1.vg8.o2v, ek1.vg8.kfp + var1[var2], ek1.vg8.vbd, false));
         var2++;
         if (var0 != 0) {
            break;
         }
      }
   }

   @EventHandler
   public void yu2(TickEvent var1) {
      long var2 = a ^ 85844094951724L;
      this.n5o(this.m2d() + b<"x">(1592, 1531484313666432764L ^ var2) + tsd.getValue());
   }

   public static boolean eit() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 0
      // 04: getstatic v3p.ek1 Lc05;
      // 07: getfield Minecraft.vg8 Ll86;
      // 0a: iload 0
      // 0b: ifne 28
      // 0e: invokevirtual EntityPlayerSP.kqa ()Z
      // 11: ifeq 48
      // 14: goto 1b
      // 17: invokestatic v3p.a (Loov;)Loov;
      // 1a: athrow
      // 1b: getstatic v3p.ek1 Lc05;
      // 1e: getfield Minecraft.vg8 Ll86;
      // 21: goto 28
      // 24: invokestatic v3p.a (Loov;)Loov;
      // 27: athrow
      // 28: invokevirtual EntityPlayerSP.t_o ()Lerg;
      // 2b: invokevirtual erg.gn1 ()Lu7m;
      // 2e: getstatic v3p.ek1 Lc05;
      // 31: getfield Minecraft.vg8 Ll86;
      // 34: invokevirtual EntityPlayerSP.t_o ()Lerg;
      // 37: invokevirtual u7m.uf6 (Lerg;)Lce2;
      // 3a: getstatic ce2.b46 Lce2;
      // 3d: if_acmpne 48
      // 40: bipush 1
      // 41: goto 49
      // 44: invokestatic v3p.a (Loov;)Loov;
      // 47: athrow
      // 48: bipush 0
      // 49: ireturn
   }

   public native void hgk();

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-4401645169307119738L, 3203646416557657291L, MethodHandles.lookup().lookupClass()).a(115485285647286L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 41522780309839L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[10];
      int var5 = 0;
      String var4 = "Ùb=\u0014FÖV\u008b\u009aj@Uýîü\u001esÔ7Ø©\u0089[· Ç\u0000÷D#eo¼#rWÍYepÛ\u0013U\u0090t1\u0017/rT·0Oµj\u001e<\u0010ç#ó3\u008dùà7u¬Ã\u0094\\Å\u008e\u0092\u0018å}\u0014\u009at\u0081äd\u0099\u0091\u000b\u008aª¡¿Í\u000eû\u0082\fèÔÿh\u0018ke?5âÿ'NÔ\bBß\u0088ôbv»lC\u0002\u0085\u009bÙ\u0087\u0010CÈ!ºYÊ\u001cæ:ÄF½röÓ\u0082\u0010nS5\u001aéD\u001d\u0097f£%_ïÎk\u0019\u0010\u001a\b=\"\u0083\u0085DìÔÕ¹&®¥hÆ";
      int var6 = "Ùb=\u0014FÖV\u008b\u009aj@Uýîü\u001esÔ7Ø©\u0089[· Ç\u0000÷D#eo¼#rWÍYepÛ\u0013U\u0090t1\u0017/rT·0Oµj\u001e<\u0010ç#ó3\u008dùà7u¬Ã\u0094\\Å\u008e\u0092\u0018å}\u0014\u009at\u0081äd\u0099\u0091\u000b\u008aª¡¿Í\u000eû\u0082\fèÔÿh\u0018ke?5âÿ'NÔ\bBß\u0088ôbv»lC\u0002\u0085\u009bÙ\u0087\u0010CÈ!ºYÊ\u001cæ:ÄF½röÓ\u0082\u0010nS5\u001aéD\u001d\u0097f£%_ïÎk\u0019\u0010\u001a\b=\"\u0083\u0085DìÔÕ¹&®¥hÆ"
         .length();
      char var3 = 24;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     f = var7;
                     g = new String[10];
                     NativeLoader.verifyIntegrity(1);
                     sub = new q6h();
                     tsd = new ModeSetting(
                        b<"x">(10454, 8252201250295359607L ^ var9),
                        b<"x">(4812, 4467468061121286760L ^ var9),
                        b<"x">(2455, 2049652217217583422L ^ var9),
                        new String[]{
                           b<"x">(30052, 2429538821011109314L ^ var9), b<"x">(4965, 7238177277384364992L ^ var9), b<"x">(21317, 7806533676886873062L ^ var9)
                        }
                     );
                     h9b = new NumberSetting(b<"x">(10454, 8252201250295359607L ^ var9), b<"x">(4, 5263220110640775334L ^ var9), 15.0F, 10.0F, 20.0F, 1.0F);
                     te1 = new NumberSetting(b<"x">(10454, 8252201250295359607L ^ var9), b<"x">(24179, 3844725330997763803L ^ var9), 300.0F, 0.0F, 5000.0F, 100.0F);
                     ubl = new q6h();
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

                  var4 = "¹ï\f¶È\u0084$\u009e\u001cå\u008cànbtÑ\u0010,ø¹²\u0003\u0080n»\u0089¨_)\u001d\u001fÐ?";
                  var6 = "¹ï\f¶È\u0084$\u009e\u001cå\u008cànbtÑ\u0010,ø¹²\u0003\u0080n»\u0089¨_)\u001d\u001fÐ?".length();
                  var3 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 4307;
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
            throw new RuntimeException("v3p", var10);
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
         throw new RuntimeException("v3p" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
