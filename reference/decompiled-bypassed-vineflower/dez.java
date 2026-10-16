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

public class dez extends ar7 {
   public static crk r2q;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public dez() {
      long var1 = a ^ 83909347558941L;
      super(b<"g">(28877, 673016723414851941L ^ var1), _aj.sxc, false, new j1s[0]);
   }

   @Override
   public void ron() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 1
      // 004: aload 0
      // 005: pop
      // 006: getstatic dez.ek1 Lc05;
      // 009: getfield c05.tij Lkh3;
      // 00c: iload 1
      // 00d: ifeq 10c
      // 010: ifnonnull 024
      // 013: goto 01a
      // 016: invokestatic dez.a (Loov;)Loov;
      // 019: athrow
      // 01a: aload 0
      // 01b: bipush 0
      // 01c: invokevirtual dez.yse (Z)V
      // 01f: return
      // 020: invokestatic dez.a (Loov;)Loov;
      // 023: athrow
      // 024: aload 0
      // 025: pop
      // 026: getstatic dez.ek1 Lc05;
      // 029: getfield c05.vg8 Ll86;
      // 02c: bipush 1
      // 02d: putfield l86.kvx Z
      // 030: aload 0
      // 031: aload 0
      // 032: pop
      // 033: getstatic dez.ek1 Lc05;
      // 036: getfield c05.vg8 Ll86;
      // 039: getfield l86.o2v D
      // 03c: putfield dez.z5e D
      // 03f: aload 0
      // 040: aload 0
      // 041: pop
      // 042: getstatic dez.ek1 Lc05;
      // 045: getfield c05.vg8 Ll86;
      // 048: getfield l86.kfp D
      // 04b: putfield dez.jsb D
      // 04e: aload 0
      // 04f: aload 0
      // 050: pop
      // 051: getstatic dez.ek1 Lc05;
      // 054: getfield c05.vg8 Ll86;
      // 057: getfield l86.vbd D
      // 05a: putfield dez.xru D
      // 05d: aload 0
      // 05e: aload 0
      // 05f: pop
      // 060: getstatic dez.ek1 Lc05;
      // 063: getfield c05.vg8 Ll86;
      // 066: getfield l86.x5k F
      // 069: putfield dez.ozy F
      // 06c: aload 0
      // 06d: aload 0
      // 06e: pop
      // 06f: getstatic dez.ek1 Lc05;
      // 072: getfield c05.vg8 Ll86;
      // 075: getfield l86.y2i F
      // 078: putfield dez.awe F
      // 07b: aload 0
      // 07c: new hpk
      // 07f: dup
      // 080: aload 0
      // 081: pop
      // 082: getstatic dez.ek1 Lc05;
      // 085: getfield c05.tij Lkh3;
      // 088: aload 0
      // 089: pop
      // 08a: getstatic dez.ek1 Lc05;
      // 08d: getfield c05.vg8 Ll86;
      // 090: invokevirtual l86.x6l ()Lcom/mojang/authlib/GameProfile;
      // 093: invokespecial hpk.<init> (Lt9d;Lcom/mojang/authlib/GameProfile;)V
      // 096: dup_x1
      // 097: putfield dez.k1k Lhpk;
      // 09a: aload 0
      // 09b: pop
      // 09c: getstatic dez.ek1 Lc05;
      // 09f: getfield c05.vg8 Ll86;
      // 0a2: bipush 1
      // 0a3: invokevirtual hpk.moc (Lha9;Z)V
      // 0a6: aload 0
      // 0a7: getfield dez.k1k Lhpk;
      // 0aa: aload 0
      // 0ab: pop
      // 0ac: getstatic dez.ek1 Lc05;
      // 0af: getfield c05.vg8 Ll86;
      // 0b2: getfield l86.o2v D
      // 0b5: aload 0
      // 0b6: pop
      // 0b7: getstatic dez.ek1 Lc05;
      // 0ba: getfield c05.vg8 Ll86;
      // 0bd: getfield l86.kfp D
      // 0c0: aload 0
      // 0c1: pop
      // 0c2: getstatic dez.ek1 Lc05;
      // 0c5: getfield c05.vg8 Ll86;
      // 0c8: getfield l86.vbd D
      // 0cb: invokevirtual hpk.m6_ (DDD)V
      // 0ce: aload 0
      // 0cf: getfield dez.k1k Lhpk;
      // 0d2: aload 0
      // 0d3: pop
      // 0d4: getstatic dez.ek1 Lc05;
      // 0d7: getfield c05.vg8 Ll86;
      // 0da: getfield l86.x5k F
      // 0dd: putfield hpk.q6c F
      // 0e0: aload 0
      // 0e1: getfield dez.k1k Lhpk;
      // 0e4: aload 0
      // 0e5: pop
      // 0e6: getstatic dez.ek1 Lc05;
      // 0e9: getfield c05.vg8 Ll86;
      // 0ec: getfield l86.y2i F
      // 0ef: putfield hpk.y2i F
      // 0f2: aload 0
      // 0f3: getfield dez.k1k Lhpk;
      // 0f6: aload 0
      // 0f7: pop
      // 0f8: getstatic dez.ek1 Lc05;
      // 0fb: getfield c05.vg8 Ll86;
      // 0fe: invokevirtual l86.hzv ()Z
      // 101: invokevirtual hpk.rh_ (Z)V
      // 104: aload 0
      // 105: pop
      // 106: getstatic dez.ek1 Lc05;
      // 109: getfield c05.tij Lkh3;
      // 10c: sipush -1337
      // 10f: aload 0
      // 110: getfield dez.k1k Lhpk;
      // 113: invokevirtual kh3.fih (ILi2h;)V
      // 116: getstatic zwr.qkk Lzwr;
      // 119: invokevirtual zwr.w34 ()Lf62;
      // 11c: aload 0
      // 11d: getfield dez.k1k Lhpk;
      // 120: invokevirtual hpk.noc ()Ljava/lang/String;
      // 123: invokevirtual f62.fu7 (Ljava/lang/String;)V
      // 126: aload 0
      // 127: invokespecial ar7.ron ()V
      // 12a: return
   }

   @Override
   public void ne2() {
      ek1.vg8.kvx = false;
      ek1.vg8.lls.wzx = false;
      ek1.vg8.xe8(this.z5e, this.jsb, this.xru, this.ozy, this.awe);
      ek1.tij.rqa(this.k1k);
      zwr.qkk.w34().vca(this.k1k.noc());
      super.ne2();
   }

   @jev
   public void dun(w1x var1) {
      var1.o04 = null;
   }

   @jev
   public void k1k(ihr param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifeq ad
      // 09: invokevirtual ihr.bbi ()Lmz2;
      // 0c: instanceof net/minecraft/network/play/client/C03PacketPlayer
      // 0f: ifne a5
      // 12: goto 19
      // 15: invokestatic dez.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 1
      // 1a: iload 2
      // 1b: ifeq ad
      // 1e: goto 25
      // 21: invokestatic dez.a (Loov;)Loov;
      // 24: athrow
      // 25: invokevirtual ihr.bbi ()Lmz2;
      // 28: instanceof net/minecraft/network/play/client/C0BPacketEntityAction
      // 2b: ifne a5
      // 2e: goto 35
      // 31: invokestatic dez.a (Loov;)Loov;
      // 34: athrow
      // 35: aload 1
      // 36: iload 2
      // 37: ifeq ad
      // 3a: goto 41
      // 3d: invokestatic dez.a (Loov;)Loov;
      // 40: athrow
      // 41: invokevirtual ihr.bbi ()Lmz2;
      // 44: instanceof net/minecraft/network/play/client/C0APacketAnimation
      // 47: ifne a5
      // 4a: goto 51
      // 4d: invokestatic dez.a (Loov;)Loov;
      // 50: athrow
      // 51: aload 1
      // 52: iload 2
      // 53: ifeq ad
      // 56: goto 5d
      // 59: invokestatic dez.a (Loov;)Loov;
      // 5c: athrow
      // 5d: invokevirtual ihr.bbi ()Lmz2;
      // 60: instanceof net/minecraft/network/play/client/C02PacketUseEntity
      // 63: ifne a5
      // 66: goto 6d
      // 69: invokestatic dez.a (Loov;)Loov;
      // 6c: athrow
      // 6d: aload 1
      // 6e: iload 2
      // 6f: ifeq ad
      // 72: goto 79
      // 75: invokestatic dez.a (Loov;)Loov;
      // 78: athrow
      // 79: invokevirtual ihr.bbi ()Lmz2;
      // 7c: instanceof net/minecraft/network/play/client/C09PacketHeldItemChange
      // 7f: ifne a5
      // 82: goto 89
      // 85: invokestatic dez.a (Loov;)Loov;
      // 88: athrow
      // 89: aload 1
      // 8a: iload 2
      // 8b: ifeq ad
      // 8e: goto 95
      // 91: invokestatic dez.a (Loov;)Loov;
      // 94: athrow
      // 95: invokevirtual ihr.bbi ()Lmz2;
      // 98: instanceof net/minecraft/network/play/client/C07PacketPlayerDigging
      // 9b: ifeq b1
      // 9e: goto a5
      // a1: invokestatic dez.a (Loov;)Loov;
      // a4: athrow
      // a5: aload 1
      // a6: goto ad
      // a9: invokestatic dez.a (Loov;)Loov;
      // ac: athrow
      // ad: bipush 1
      // ae: invokevirtual ihr.wxi (Z)V
      // b1: return
   }

   @jev
   public void jh_(_qa param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: pop
      // 02: invokestatic t9d.b ()I
      // 05: getstatic dez.ek1 Lc05;
      // 08: getfield c05.vg8 Ll86;
      // 0b: bipush 1
      // 0c: putfield l86.kvx Z
      // 0f: aload 1
      // 10: dconst_0
      // 11: putfield _qa.c6l D
      // 14: aload 1
      // 15: dconst_0
      // 16: putfield _qa.wam D
      // 19: aload 1
      // 1a: dconst_0
      // 1b: putfield _qa.faq D
      // 1e: istore 2
      // 1f: aload 0
      // 20: pop
      // 21: getstatic dez.ek1 Lc05;
      // 24: getfield c05.oxn Lmoh;
      // 27: getfield moh.e5o Lm7l;
      // 2a: getfield m7l.m7n Z
      // 2d: iload 2
      // 2e: ifeq 6d
      // 31: ifeq 4d
      // 34: goto 3b
      // 37: invokestatic dez.a (Loov;)Loov;
      // 3a: athrow
      // 3b: aload 1
      // 3c: ldc2_w -1.0
      // 3f: putfield _qa.wam D
      // 42: iload 2
      // 43: ifne 7c
      // 46: goto 4d
      // 49: invokestatic dez.a (Loov;)Loov;
      // 4c: athrow
      // 4d: aload 0
      // 4e: pop
      // 4f: iload 2
      // 50: ifeq 8a
      // 53: goto 5a
      // 56: invokestatic dez.a (Loov;)Loov;
      // 59: athrow
      // 5a: getstatic dez.ek1 Lc05;
      // 5d: getfield c05.oxn Lmoh;
      // 60: getfield moh.nfb Lm7l;
      // 63: getfield m7l.m7n Z
      // 66: goto 6d
      // 69: invokestatic dez.a (Loov;)Loov;
      // 6c: athrow
      // 6d: ifeq 7c
      // 70: aload 1
      // 71: dconst_1
      // 72: putfield _qa.wam D
      // 75: goto 7c
      // 78: invokestatic dez.a (Loov;)Loov;
      // 7b: athrow
      // 7c: aload 1
      // 7d: getstatic dez.r2q Lcrk;
      // 80: invokevirtual crk.d7c ()Ljava/lang/Float;
      // 83: invokevirtual java/lang/Float.floatValue ()F
      // 86: f2d
      // 87: invokestatic ohv.qjs (L_qa;D)V
      // 8a: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(2678898250686397800L, -3663238311266618104L, MethodHandles.lookup().lookupClass()).a(139499468536551L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 69344185109365L;
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
      String var4 = "ÿk$¾¸h\u0006\u0013:\u007f\u0007ð9}7\u0085\u0010r(8\n>\u0081Ø\u0001~ìÖ ÷mIÁ\u0010\u0013\u000b^^·¶X×\u009d1>\u0004\u00050§\u0016";
      int var6 = "ÿk$¾¸h\u0006\u0013:\u007f\u0007ð9}7\u0085\u0010r(8\n>\u0081Ø\u0001~ìÖ ÷mIÁ\u0010\u0013\u000b^^·¶X×\u009d1>\u0004\u00050§\u0016".length();
      char var3 = 16;
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var14 = b(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var14;
         if ((var2 += var3) >= var6) {
            f = var7;
            g = new String[3];
            r2q = new crk(b<"g">(13112, 3703895424140406777L ^ var9), b<"g">(13924, 8173220241253853863L ^ var9), 1.0F, 0.1F, 3.0F, 0.1F);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 29426;
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
            throw new RuntimeException("dez", var10);
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
         throw new RuntimeException("dez" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
