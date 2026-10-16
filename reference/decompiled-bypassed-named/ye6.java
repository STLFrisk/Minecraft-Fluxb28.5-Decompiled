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

public class ye6 extends Module {
   public static BooleanSetting tu9;
   public boolean c_x;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public ye6() {
      long var1 = a ^ 16292097572104L;
      super(b<"c">(7686, 4073159507594251500L ^ var1), _aj._lm, false, new SubEngine[0]);
   }

   @EventHandler
   public void yc4(PlayerUpdateEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 2
      // 004: aload 0
      // 005: bipush 0
      // 006: bipush 0
      // 007: invokevirtual ye6.uvd (II)Z
      // 00a: iload 2
      // 00b: ifne 0be
      // 00e: ifne 0ba
      // 011: goto 018
      // 014: invokestatic ye6.a (Loov;)Loov;
      // 017: athrow
      // 018: getstatic ModuleRegistry._zh Lgnq;
      // 01b: invokevirtual gnq.isEnabled ()Z
      // 01e: iload 2
      // 01f: ifne 068
      // 022: goto 029
      // 025: invokestatic ye6.a (Loov;)Loov;
      // 028: athrow
      // 029: ifeq 054
      // 02c: goto 033
      // 02f: invokestatic ye6.a (Loov;)Loov;
      // 032: athrow
      // 033: getstatic ye6.ek1 Lc05;
      // 036: getfield Minecraft.oxn Lmoh;
      // 039: getfield moh.nfb Lm7l;
      // 03c: getfield m7l.m7n Z
      // 03f: iload 2
      // 040: ifne 0be
      // 043: goto 04a
      // 046: invokestatic ye6.a (Loov;)Loov;
      // 049: athrow
      // 04a: ifeq 0ba
      // 04d: goto 054
      // 050: invokestatic ye6.a (Loov;)Loov;
      // 053: athrow
      // 054: getstatic ye6.ek1 Lc05;
      // 057: getfield Minecraft.vg8 Ll86;
      // 05a: getfield EntityPlayerSP.o_8 F
      // 05d: ldc 10.0
      // 05f: nop
      // 060: fcmpl
      // 061: goto 068
      // 064: invokestatic ye6.a (Loov;)Loov;
      // 067: athrow
      // 068: iload 2
      // 069: ifne 0be
      // 06c: ifle 0ba
      // 06f: goto 076
      // 072: invokestatic ye6.a (Loov;)Loov;
      // 075: athrow
      // 076: getstatic ye6.ek1 Lc05;
      // 079: getfield Minecraft.vg8 Ll86;
      // 07c: ldc -18.0
      // 07e: nop
      // 07f: putfield EntityPlayerSP.o_8 F
      // 082: getstatic ye6.ek1 Lc05;
      // 085: getfield Minecraft.vg8 Ll86;
      // 088: ldc2_w 2.5
      // 08b: putfield EntityPlayerSP.mop D
      // 08e: getstatic ye6.ek1 Lc05;
      // 091: getfield Minecraft.gze Laba;
      // 094: getstatic ye6.tu9 Lcn7;
      // 097: invokevirtual BooleanSetting.getValue ()Ljava/lang/Boolean;
      // 09a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 09d: ifeq 0b1
      // 0a0: goto 0a7
      // 0a3: invokestatic ye6.a (Loov;)Loov;
      // 0a6: athrow
      // 0a7: ldc 3.0
      // 0a9: nop
      // 0aa: goto 0b2
      // 0ad: invokestatic ye6.a (Loov;)Loov;
      // 0b0: athrow
      // 0b1: fconst_1
      // 0b2: putfield aba.qeu F
      // 0b5: aload 0
      // 0b6: bipush 1
      // 0b7: putfield ye6.c_x Z
      // 0ba: aload 0
      // 0bb: getfield ye6.c_x Z
      // 0be: iload 2
      // 0bf: ifne 0eb
      // 0c2: ifeq 104
      // 0c5: goto 0cc
      // 0c8: invokestatic ye6.a (Loov;)Loov;
      // 0cb: athrow
      // 0cc: getstatic ye6.ek1 Lc05;
      // 0cf: iload 2
      // 0d0: ifne 0fd
      // 0d3: goto 0da
      // 0d6: invokestatic ye6.a (Loov;)Loov;
      // 0d9: athrow
      // 0da: getfield Minecraft.vg8 Ll86;
      // 0dd: getfield EntityPlayerSP.mop D
      // 0e0: ldc2_w 1.5
      // 0e3: dcmpg
      // 0e4: goto 0eb
      // 0e7: invokestatic ye6.a (Loov;)Loov;
      // 0ea: athrow
      // 0eb: ifge 104
      // 0ee: aload 0
      // 0ef: bipush 0
      // 0f0: putfield ye6.c_x Z
      // 0f3: getstatic ye6.ek1 Lc05;
      // 0f6: goto 0fd
      // 0f9: invokestatic ye6.a (Loov;)Loov;
      // 0fc: athrow
      // 0fd: getfield Minecraft.gze Laba;
      // 100: fconst_1
      // 101: putfield aba.qeu F
      // 104: return
   }

   public boolean uvd(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: getstatic ye6.ek1 Lc05;
      // 07: getfield Minecraft.vg8 Ll86;
      // 0a: getfield EntityPlayerSP.kfp D
      // 0d: dconst_1
      // 0e: dsub
      // 0f: d2i
      // 10: istore 4
      // 12: iload 4
      // 14: ifle 73
      // 17: new mew
      // 1a: dup
      // 1b: getstatic ye6.ek1 Lc05;
      // 1e: getfield Minecraft.vg8 Ll86;
      // 21: getfield EntityPlayerSP.o2v D
      // 24: iload 1
      // 25: i2d
      // 26: dadd
      // 27: iload 4
      // 29: i2d
      // 2a: getstatic ye6.ek1 Lc05;
      // 2d: getfield Minecraft.vg8 Ll86;
      // 30: getfield EntityPlayerSP.vbd D
      // 33: iload 2
      // 34: i2d
      // 35: dadd
      // 36: invokespecial mew.<init> (DDD)V
      // 39: astore 5
      // 3b: getstatic ye6.ek1 Lc05;
      // 3e: getfield Minecraft.tij Lkh3;
      // 41: aload 5
      // 43: invokevirtual WorldClient.getBlockState (Lmew;)Lzfz;
      // 46: invokeinterface zfz.r_y ()Le0x; 1
      // 4b: instanceof n47
      // 4e: iload 3
      // 4f: ifeq 74
      // 52: iload 3
      // 53: ifeq 6b
      // 56: goto 5d
      // 59: invokestatic ye6.a (Loov;)Loov;
      // 5c: athrow
      // 5d: ifeq 6a
      // 60: goto 67
      // 63: invokestatic ye6.a (Loov;)Loov;
      // 66: athrow
      // 67: goto 6c
      // 6a: bipush 1
      // 6b: ireturn
      // 6c: iinc 4 -1
      // 6f: iload 3
      // 70: ifne 12
      // 73: bipush 0
      // 74: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(5770363923345751301L, -5812681217859013774L, MethodHandles.lookup().lookupClass()).a(248327994747332L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 109459962234171L;
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
      String var4 = "\u0080\u001bKí×¥seO\bÍv´T\b\u0095¿\u009d\u001b¾£\u0098Ñ\u008fµ\u009ex\u0019\u0090±Î8 ¹\u008f\u007fKµEyGL\u0097B;ë9õ\u0096Ç*0\u0017-FöÉÏÔ¶\u0015ê%SÇ\u0010\u0096öe\u0085\u00163÷?\u009c\u0011\u000e\b2\u007f¹ð";
      int var6 = "\u0080\u001bKí×¥seO\bÍv´T\b\u0095¿\u009d\u001b¾£\u0098Ñ\u008fµ\u009ex\u0019\u0090±Î8 ¹\u008f\u007fKµEyGL\u0097B;ë9õ\u0096Ç*0\u0017-FöÉÏÔ¶\u0015ê%SÇ\u0010\u0096öe\u0085\u00163÷?\u009c\u0011\u000e\b2\u007f¹ð"
         .length();
      char var3 = ' ';
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var14 = b(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var14;
         if ((var2 += var3) >= var6) {
            f = var7;
            g = new String[3];
            tu9 = new BooleanSetting(b<"c">(11395, 3613272086743352923L ^ var9), b<"c">(24172, 4001849321790010551L ^ var9), true);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5484;
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
            throw new RuntimeException("ye6", var10);
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
         throw new RuntimeException("ye6" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
