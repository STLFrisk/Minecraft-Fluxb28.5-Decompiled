import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class fx6 extends Thread {
   public Minecraft but = Minecraft.vz1();
   public ArrayList wts = new ArrayList();
   public static mof t06;
   public List qwp;
   public NumberSetting tjr;
   public NumberSetting jb2;
   public int r9z = -1;
   public boolean zpp = false;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public fx6(NumberSetting var1, NumberSetting var2) {
      this.tjr = var1;
      this.jb2 = var2;
   }

   public fx6(int var1, NumberSetting var2) {
      this.r9z = var1;
      this.jb2 = var2;
   }

   @Override
   public void run() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic fx6.a J
      // 003: ldc2_w 120659575521811
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 3
      // 00c: getstatic ModuleRegistry.caa Lmof;
      // 00f: invokevirtual mof.klu ()Z
      // 012: ifeq 20c
      // 015: aload 0
      // 016: iload 3
      // 017: ifne 20d
      // 01a: iload 3
      // 01b: ifne 20d
      // 01e: goto 025
      // 021: invokestatic fx6.a (Loov;)Loov;
      // 024: athrow
      // 025: getfield fx6.but Lc05;
      // 028: getfield Minecraft.tij Lkh3;
      // 02b: ifnull 20c
      // 02e: goto 035
      // 031: invokestatic fx6.a (Loov;)Loov;
      // 034: athrow
      // 035: aload 0
      // 036: bipush 1
      // 037: putfield fx6.zpp Z
      // 03a: invokestatic java/lang/System.currentTimeMillis ()J
      // 03d: lstore 4
      // 03f: aload 0
      // 040: iload 3
      // 041: ifne 05e
      // 044: getfield fx6.r9z I
      // 047: bipush -1
      // 048: if_icmpeq 05d
      // 04b: goto 052
      // 04e: invokestatic fx6.a (Loov;)Loov;
      // 051: athrow
      // 052: aload 0
      // 053: getfield fx6.r9z I
      // 056: goto 067
      // 059: invokestatic fx6.a (Loov;)Loov;
      // 05c: athrow
      // 05d: aload 0
      // 05e: getfield fx6.tjr Lcrk;
      // 061: invokevirtual NumberSetting.getValue ()Ljava/lang/Float;
      // 064: invokevirtual java/lang/Float.intValue ()I
      // 067: istore 6
      // 069: new java/util/ArrayList
      // 06c: dup
      // 06d: invokespecial java/util/ArrayList.<init> ()V
      // 070: astore 7
      // 072: iload 6
      // 074: ineg
      // 075: istore 8
      // 077: iload 8
      // 079: iload 6
      // 07b: if_icmpgt 1db
      // 07e: bipush 1
      // 07f: iload 3
      // 080: ifne 012
      // 083: istore 9
      // 085: iload 9
      // 087: sipush 128
      // 08a: if_icmpgt 1d4
      // 08d: iload 6
      // 08f: ineg
      // 090: iload 3
      // 091: ifne 079
      // 094: istore 10
      // 096: iload 10
      // 098: iload 6
      // 09a: if_icmpgt 1cd
      // 09d: new mew
      // 0a0: dup
      // 0a1: aload 0
      // 0a2: getfield fx6.but Lc05;
      // 0a5: getfield Minecraft.vg8 Ll86;
      // 0a8: getfield EntityPlayerSP.o2v D
      // 0ab: iload 8
      // 0ad: i2d
      // 0ae: dadd
      // 0af: iload 9
      // 0b1: i2d
      // 0b2: aload 0
      // 0b3: getfield fx6.but Lc05;
      // 0b6: getfield Minecraft.vg8 Ll86;
      // 0b9: getfield EntityPlayerSP.vbd D
      // 0bc: iload 10
      // 0be: i2d
      // 0bf: dadd
      // 0c0: invokespecial mew.<init> (DDD)V
      // 0c3: astore 11
      // 0c5: iload 3
      // 0c6: ifne 1c9
      // 0c9: getstatic fx6.t06 Lmof;
      // 0cc: aload 11
      // 0ce: invokevirtual mof.af9 (Lmew;)Z
      // 0d1: iload 3
      // 0d2: ifne 087
      // 0d5: goto 0dc
      // 0d8: invokestatic fx6.a (Loov;)Loov;
      // 0db: athrow
      // 0dc: ifeq 1c6
      // 0df: getstatic fx6.t06 Lmof;
      // 0e2: aload 11
      // 0e4: aload 0
      // 0e5: getfield fx6.jb2 Lcrk;
      // 0e8: invokevirtual NumberSetting.getValue ()Ljava/lang/Float;
      // 0eb: invokevirtual java/lang/Float.intValue ()I
      // 0ee: i2d
      // 0ef: invokevirtual mof.yub (Lmew;D)Ljava/lang/Boolean;
      // 0f2: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0f5: iload 3
      // 0f6: ifne 11a
      // 0f9: goto 100
      // 0fc: invokestatic fx6.a (Loov;)Loov;
      // 0ff: athrow
      // 100: ifeq 1c6
      // 103: goto 10a
      // 106: invokestatic fx6.a (Loov;)Loov;
      // 109: athrow
      // 10a: aload 7
      // 10c: aload 11
      // 10e: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 113: goto 11a
      // 116: invokestatic fx6.a (Loov;)Loov;
      // 119: athrow
      // 11a: pop
      // 11b: iload 3
      // 11c: ifne 1c9
      // 11f: aload 0
      // 120: getfield fx6.but Lc05;
      // 123: getfield Minecraft.tij Lkh3;
      // 126: aload 11
      // 128: invokevirtual WorldClient.getBlockState (Lmew;)Lzfz;
      // 12b: invokeinterface zfz.r_y ()Le0x; 1
      // 130: getstatic ox_._dt Le0x;
      // 133: if_acmpne 1c6
      // 136: goto 13d
      // 139: invokestatic fx6.a (Loov;)Loov;
      // 13c: athrow
      // 13d: aload 0
      // 13e: getfield fx6.wts Ljava/util/ArrayList;
      // 141: aload 11
      // 143: invokevirtual java/util/ArrayList.contains (Ljava/lang/Object;)Z
      // 146: iload 3
      // 147: ifne 183
      // 14a: goto 151
      // 14d: invokestatic fx6.a (Loov;)Loov;
      // 150: athrow
      // 151: ifne 1c6
      // 154: goto 15b
      // 157: invokestatic fx6.a (Loov;)Loov;
      // 15a: athrow
      // 15b: aload 0
      // 15c: getfield fx6.wts Ljava/util/ArrayList;
      // 15f: aload 11
      // 161: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 164: pop
      // 165: iload 3
      // 166: ifne 1c9
      // 169: goto 170
      // 16c: invokestatic fx6.a (Loov;)Loov;
      // 16f: athrow
      // 170: getstatic ModuleRegistry.caa Lmof;
      // 173: getfield mof.zoz Lcn7;
      // 176: invokevirtual BooleanSetting.getValue ()Ljava/lang/Boolean;
      // 179: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 17c: goto 183
      // 17f: invokestatic fx6.a (Loov;)Loov;
      // 182: athrow
      // 183: ifeq 1c6
      // 186: sipush 29234
      // 189: ldc2_w 8122247058177677079
      // 18c: lload 1
      // 18d: lxor
      // 18e: invokedynamic l (IJ)Ljava/lang/String; bsm=fx6.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 193: nop
      // 194: bipush 3
      // 195: anewarray 162
      // 198: dup
      // 199: bipush 0
      // 19a: aload 11
      // 19c: invokevirtual mew.getX ()I
      // 19f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1a2: aastore
      // 1a3: dup
      // 1a4: bipush 1
      // 1a5: aload 11
      // 1a7: invokevirtual mew.getY ()I
      // 1aa: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1ad: aastore
      // 1ae: dup
      // 1af: bipush 2
      // 1b0: aload 11
      // 1b2: invokevirtual mew.getZ ()I
      // 1b5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1b8: aastore
      // 1b9: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 1bc: invokestatic q0r.tq3 (Ljava/lang/String;)V
      // 1bf: goto 1c6
      // 1c2: invokestatic fx6.a (Loov;)Loov;
      // 1c5: athrow
      // 1c6: iinc 10 1
      // 1c9: iload 3
      // 1ca: ifeq 096
      // 1cd: iinc 9 1
      // 1d0: iload 3
      // 1d1: ifeq 085
      // 1d4: iinc 8 1
      // 1d7: iload 3
      // 1d8: ifeq 077
      // 1db: aload 0
      // 1dc: aload 7
      // 1de: putfield fx6.qwp Ljava/util/List;
      // 1e1: new java/lang/StringBuilder
      // 1e4: dup
      // 1e5: invokespecial java/lang/StringBuilder.<init> ()V
      // 1e8: sipush 25906
      // 1eb: ldc2_w 6444287421301735446
      // 1ee: lload 1
      // 1ef: lxor
      // 1f0: invokedynamic l (IJ)Ljava/lang/String; bsm=fx6.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f5: nop
      // 1f6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f9: invokestatic java/lang/System.currentTimeMillis ()J
      // 1fc: lload 4
      // 1fe: lsub
      // 1ff: invokevirtual java/lang/StringBuilder.append (J)Ljava/lang/StringBuilder;
      // 202: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 205: invokestatic ncl.zpu (Ljava/lang/Object;)V
      // 208: iload 3
      // 209: ifeq 00c
      // 20c: aload 0
      // 20d: bipush 0
      // 20e: putfield fx6.zpp Z
      // 211: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8151400551458574527L, 8016922614208975471L, MethodHandles.lookup().lookupClass()).a(247039015869533L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 8161657758403L;
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
      String var6 = "\u0089Ä\u0016¾\u0005\u0004@\u008egsü\u0090Ä\u0095Â$Á\nAA~mi¿\u0010/£®\u0006 ¥.8ÆîøÎ \bi©\u007fsÚl\bs\u000eÈhkBò «&]{\u0082\u0085¢Ñ\u000e=ñ\u000bxÓggQ\u008eù\u0012\u0004¥³±\u000bJÜ\u000ejúØëQ\\\u0013";
      int var8 = "\u0089Ä\u0016¾\u0005\u0004@\u008egsü\u0090Ä\u0095Â$Á\nAA~mi¿\u0010/£®\u0006 ¥.8ÆîøÎ \bi©\u007fsÚl\bs\u000eÈhkBò «&]{\u0082\u0085¢Ñ\u000e=ñ\u000bxÓggQ\u008eù\u0012\u0004¥³±\u000bJÜ\u000ejúØëQ\\\u0013"
         .length();
      char var5 = ' ';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[2];
            t06 = ModuleRegistry.caa;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30899;
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
            throw new RuntimeException("fx6", var10);
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
         throw new RuntimeException("fx6" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
