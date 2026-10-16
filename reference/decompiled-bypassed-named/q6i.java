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

public class q6i extends SubEngine {
   private Timer iji;
   private static final long a;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public q6i() {
      long var1 = a ^ 69163280449344L;
      super(a<"s">(20131, 8237709988268163446L ^ var1), a<"s">(19373, 1135016294092555385L ^ var1));
      this.iji = new Timer();
   }

   @Override
   public void onUpdate() {
      super.onUpdate();
      this.iji.zay();
   }

   @EventHandler
   public void di_(w1x param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: invokestatic bk4.da2 ()Z
      // 07: ifeq 59
      // 0a: aload 1
      // 0b: invokevirtual w1x.jqi ()Lnh4;
      // 0e: iload 2
      // 0f: ifne 39
      // 12: goto 19
      // 15: invokestatic q6i.a (Loov;)Loov;
      // 18: athrow
      // 19: ifnull 59
      // 1c: goto 23
      // 1f: invokestatic q6i.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 1
      // 24: iload 2
      // 25: ifne 55
      // 28: goto 2f
      // 2b: invokestatic q6i.a (Loov;)Loov;
      // 2e: athrow
      // 2f: invokevirtual w1x.jqi ()Lnh4;
      // 32: goto 39
      // 35: invokestatic q6i.a (Loov;)Loov;
      // 38: athrow
      // 39: getfield nh4.i2c D
      // 3c: aload 0
      // 3d: getfield q6i.wyl Lc05;
      // 40: getfield Minecraft.vg8 Ll86;
      // 43: invokevirtual EntityPlayerSP.aaw ()Lnh4;
      // 46: getfield nh4.bx_ D
      // 49: dcmpl
      // 4a: ifle 59
      // 4d: aload 1
      // 4e: goto 55
      // 51: invokestatic q6i.a (Loov;)Loov;
      // 54: athrow
      // 55: aconst_null
      // 56: invokevirtual w1x.wfu (Lnh4;)V
      // 59: return
   }

   @EventHandler
   public void qdk(Event param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 2
      // 004: aload 0
      // 005: getfield q6i.wyl Lc05;
      // 008: getfield Minecraft.vg8 Ll86;
      // 00b: getfield EntityPlayerSP.cbi Z
      // 00e: iload 2
      // 00f: ifeq 02d
      // 012: ifeq 16b
      // 015: goto 01c
      // 018: invokestatic q6i.a (Loov;)Loov;
      // 01b: athrow
      // 01c: aload 0
      // 01d: getfield q6i.wyl Lc05;
      // 020: getfield Minecraft.vg8 Ll86;
      // 023: invokevirtual EntityPlayerSP.z2m ()Z
      // 026: goto 02d
      // 029: invokestatic q6i.a (Loov;)Loov;
      // 02c: athrow
      // 02d: ifne 16b
      // 030: ldc2_w 0.3
      // 033: dstore 3
      // 034: aload 0
      // 035: getfield q6i.wyl Lc05;
      // 038: getfield Minecraft.vg8 Ll86;
      // 03b: getfield EntityPlayerSP.x5k F
      // 03e: ldc 90.0
      // 040: nop
      // 041: fadd
      // 042: f2d
      // 043: invokestatic java/lang/Math.toRadians (D)D
      // 046: invokestatic java/lang/Math.cos (D)D
      // 049: dstore 5
      // 04b: aload 0
      // 04c: getfield q6i.wyl Lc05;
      // 04f: getfield Minecraft.vg8 Ll86;
      // 052: getfield EntityPlayerSP.x5k F
      // 055: ldc 90.0
      // 057: nop
      // 058: fadd
      // 059: f2d
      // 05a: invokestatic java/lang/Math.toRadians (D)D
      // 05d: invokestatic java/lang/Math.sin (D)D
      // 060: dstore 7
      // 062: aload 0
      // 063: getfield q6i.wyl Lc05;
      // 066: getfield Minecraft.vg8 Ll86;
      // 069: getfield EntityPlayerSP.g9g Lboa;
      // 06c: getfield boa._mw F
      // 06f: f2d
      // 070: ldc2_w 0.3
      // 073: dmul
      // 074: dload 5
      // 076: dmul
      // 077: aload 0
      // 078: getfield q6i.wyl Lc05;
      // 07b: getfield Minecraft.vg8 Ll86;
      // 07e: getfield EntityPlayerSP.g9g Lboa;
      // 081: getfield boa.lrp F
      // 084: f2d
      // 085: ldc2_w 0.3
      // 088: dmul
      // 089: dload 7
      // 08b: dmul
      // 08c: dadd
      // 08d: dstore 9
      // 08f: aload 0
      // 090: getfield q6i.wyl Lc05;
      // 093: getfield Minecraft.vg8 Ll86;
      // 096: getfield EntityPlayerSP.g9g Lboa;
      // 099: getfield boa._mw F
      // 09c: f2d
      // 09d: ldc2_w 0.3
      // 0a0: dmul
      // 0a1: dload 7
      // 0a3: dmul
      // 0a4: aload 0
      // 0a5: getfield q6i.wyl Lc05;
      // 0a8: getfield Minecraft.vg8 Ll86;
      // 0ab: getfield EntityPlayerSP.g9g Lboa;
      // 0ae: getfield boa.lrp F
      // 0b1: f2d
      // 0b2: ldc2_w 0.3
      // 0b5: dmul
      // 0b6: dload 5
      // 0b8: dmul
      // 0b9: dsub
      // 0ba: dstore 11
      // 0bc: aload 0
      // 0bd: getfield q6i.wyl Lc05;
      // 0c0: getfield Minecraft.vg8 Ll86;
      // 0c3: getfield EntityPlayerSP.lq7 Lp_k;
      // 0c6: new net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition
      // 0c9: dup
      // 0ca: aload 0
      // 0cb: getfield q6i.wyl Lc05;
      // 0ce: getfield Minecraft.vg8 Ll86;
      // 0d1: getfield EntityPlayerSP.o2v D
      // 0d4: dload 9
      // 0d6: dadd
      // 0d7: aload 0
      // 0d8: getfield q6i.wyl Lc05;
      // 0db: getfield Minecraft.vg8 Ll86;
      // 0de: getfield EntityPlayerSP.kfp D
      // 0e1: aload 0
      // 0e2: getfield q6i.wyl Lc05;
      // 0e5: getfield Minecraft.vg8 Ll86;
      // 0e8: getfield EntityPlayerSP.vbd D
      // 0eb: dload 11
      // 0ed: dadd
      // 0ee: bipush 0
      // 0ef: invokespecial net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition.<init> (DDDZ)V
      // 0f2: invokevirtual p_k.sxi (Lmz2;)V
      // 0f5: bipush 1
      // 0f6: istore 13
      // 0f8: iload 13
      // 0fa: bipush 10
      // 0fc: if_icmpge 13d
      // 0ff: aload 0
      // 100: getfield q6i.wyl Lc05;
      // 103: getfield Minecraft.vg8 Ll86;
      // 106: getfield EntityPlayerSP.lq7 Lp_k;
      // 109: new net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition
      // 10c: dup
      // 10d: aload 0
      // 10e: getfield q6i.wyl Lc05;
      // 111: getfield Minecraft.vg8 Ll86;
      // 114: getfield EntityPlayerSP.o2v D
      // 117: ldc2_w 8.988465674311579E307
      // 11a: aload 0
      // 11b: getfield q6i.wyl Lc05;
      // 11e: getfield Minecraft.vg8 Ll86;
      // 121: getfield EntityPlayerSP.vbd D
      // 124: bipush 0
      // 125: invokespecial net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition.<init> (DDDZ)V
      // 128: invokevirtual p_k.sxi (Lmz2;)V
      // 12b: iinc 13 1
      // 12e: iload 2
      // 12f: ifeq 16b
      // 132: iload 2
      // 133: ifne 0f8
      // 136: goto 13d
      // 139: invokestatic q6i.a (Loov;)Loov;
      // 13c: athrow
      // 13d: aload 0
      // 13e: getfield q6i.wyl Lc05;
      // 141: getfield Minecraft.vg8 Ll86;
      // 144: aload 0
      // 145: getfield q6i.wyl Lc05;
      // 148: getfield Minecraft.vg8 Ll86;
      // 14b: getfield EntityPlayerSP.o2v D
      // 14e: dload 9
      // 150: dadd
      // 151: aload 0
      // 152: getfield q6i.wyl Lc05;
      // 155: getfield Minecraft.vg8 Ll86;
      // 158: getfield EntityPlayerSP.kfp D
      // 15b: aload 0
      // 15c: getfield q6i.wyl Lc05;
      // 15f: getfield Minecraft.vg8 Ll86;
      // 162: getfield EntityPlayerSP.vbd D
      // 165: dload 11
      // 167: dadd
      // 168: invokevirtual EntityPlayerSP.m6_ (DDD)V
      // 16b: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(8758965100914571129L, -5893587846276785828L, MethodHandles.lookup().lookupClass()).a(234876730607677L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 51176005970800L;
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
      String var6 = "ÓaîÜ¼\u0099\tÔ\u008aü\u009dS¬¨\u001d¬\u0010\u001a+å|ÐJ\u0004\u0086ïqÛ$\u0090\u001aS7";
      int var8 = "ÓaîÜ¼\u0099\tÔ\u008aü\u009dS¬¨\u001d¬\u0010\u001a+å|ÐJ\u0004\u0086ïqÛ$\u0090\u001aS7".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 21892;
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
            throw new RuntimeException("q6i", var10);
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
         throw new RuntimeException("q6i" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
