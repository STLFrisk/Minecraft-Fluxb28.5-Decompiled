import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class p7f extends u7m {
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public boolean ghw(erg param1, ha9 param2, t9d param3, mew param4, vt2 param5, float param6, float param7, float param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 9
      // 05: aload 3
      // 06: getfield t9d.v0f Z
      // 09: iload 9
      // 0b: ifne 72
      // 0e: ifne 71
      // 11: goto 18
      // 14: invokestatic p7f.a (Loov;)Loov;
      // 17: athrow
      // 18: new nl9
      // 1b: dup
      // 1c: aload 3
      // 1d: aload 4
      // 1f: invokevirtual mew.getX ()I
      // 22: i2f
      // 23: fload 6
      // 25: fadd
      // 26: f2d
      // 27: aload 4
      // 29: invokevirtual mew.getY ()I
      // 2c: i2f
      // 2d: fload 7
      // 2f: fadd
      // 30: f2d
      // 31: aload 4
      // 33: invokevirtual mew.getZ ()I
      // 36: i2f
      // 37: fload 8
      // 39: fadd
      // 3a: f2d
      // 3b: aload 1
      // 3c: invokespecial nl9.<init> (Lt9d;DDDLerg;)V
      // 3f: astore 10
      // 41: aload 3
      // 42: aload 10
      // 44: invokevirtual t9d.xzq (Li2h;)Z
      // 47: pop
      // 48: aload 2
      // 49: getfield ha9.lls Lpj2;
      // 4c: getfield pj2.g40 Z
      // 4f: iload 9
      // 51: ifne 70
      // 54: ifne 6f
      // 57: goto 5e
      // 5a: invokestatic p7f.a (Loov;)Loov;
      // 5d: athrow
      // 5e: aload 1
      // 5f: dup
      // 60: getfield erg.qd2 I
      // 63: bipush 1
      // 64: isub
      // 65: putfield erg.qd2 I
      // 68: goto 6f
      // 6b: invokestatic p7f.a (Loov;)Loov;
      // 6e: athrow
      // 6f: bipush 1
      // 70: ireturn
      // 71: bipush 0
      // 72: ireturn
   }

   @Override
   public void wra(erg param1, ha9 param2, List param3, boolean param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic p7f.a J
      // 003: ldc2_w 80423018447336
      // 006: lxor
      // 007: lstore 5
      // 009: invokestatic t9d.c ()I
      // 00c: istore 7
      // 00e: aload 1
      // 00f: iload 7
      // 011: ifne 029
      // 014: invokevirtual erg.w8b ()Z
      // 017: ifeq 19e
      // 01a: goto 021
      // 01d: invokestatic p7f.a (Loov;)Loov;
      // 020: athrow
      // 021: aload 1
      // 022: goto 029
      // 025: invokestatic p7f.a (Loov;)Loov;
      // 028: athrow
      // 029: invokevirtual erg.zso ()Lbdo;
      // 02c: sipush 16001
      // 02f: ldc2_w 6555098345137348163
      // 032: lload 5
      // 034: lxor
      // 035: invokedynamic h (IJ)Ljava/lang/String; bsm=p7f.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03a: nop
      // 03b: invokevirtual bdo.b__ (Ljava/lang/String;)Lbdo;
      // 03e: astore 8
      // 040: aload 8
      // 042: iload 7
      // 044: ifne 053
      // 047: ifnull 19e
      // 04a: goto 051
      // 04d: invokestatic p7f.a (Loov;)Loov;
      // 050: athrow
      // 051: aload 8
      // 053: sipush 13073
      // 056: ldc2_w 2410996205367333847
      // 059: lload 5
      // 05b: lxor
      // 05c: invokedynamic h (IJ)Ljava/lang/String; bsm=p7f.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 061: nop
      // 062: bipush 99
      // 064: iload 7
      // 066: ifne 0d3
      // 069: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 06c: ifeq 0c0
      // 06f: goto 076
      // 072: invokestatic p7f.a (Loov;)Loov;
      // 075: athrow
      // 076: aload 3
      // 077: new java/lang/StringBuilder
      // 07a: dup
      // 07b: invokespecial java/lang/StringBuilder.<init> ()V
      // 07e: sipush 27596
      // 081: ldc2_w 6627748474898500367
      // 084: lload 5
      // 086: lxor
      // 087: invokedynamic h (IJ)Ljava/lang/String; bsm=p7f.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08c: nop
      // 08d: invokestatic orr.zgh (Ljava/lang/String;)Ljava/lang/String;
      // 090: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 093: ldc " "
      // 095: nop
      // 096: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 099: aload 8
      // 09b: sipush 3129
      // 09e: ldc2_w 850468321461513470
      // 0a1: lload 5
      // 0a3: lxor
      // 0a4: invokedynamic h (IJ)Ljava/lang/String; bsm=p7f.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a9: nop
      // 0aa: invokevirtual bdo.r_t (Ljava/lang/String;)B
      // 0ad: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0b0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0b3: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0b8: pop
      // 0b9: goto 0c0
      // 0bc: invokestatic p7f.a (Loov;)Loov;
      // 0bf: athrow
      // 0c0: aload 8
      // 0c2: sipush 10638
      // 0c5: ldc2_w 2413554825525397838
      // 0c8: lload 5
      // 0ca: lxor
      // 0cb: invokedynamic h (IJ)Ljava/lang/String; bsm=p7f.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d0: nop
      // 0d1: bipush 10
      // 0d3: invokevirtual bdo.bzb (Ljava/lang/String;I)Lqhg;
      // 0d6: astore 9
      // 0d8: aload 9
      // 0da: iload 7
      // 0dc: ifne 0eb
      // 0df: ifnull 19e
      // 0e2: goto 0e9
      // 0e5: invokestatic p7f.a (Loov;)Loov;
      // 0e8: athrow
      // 0e9: aload 9
      // 0eb: invokevirtual qhg.vek ()I
      // 0ee: iload 7
      // 0f0: ifne 0fe
      // 0f3: ifle 19e
      // 0f6: goto 0fd
      // 0f9: invokestatic p7f.a (Loov;)Loov;
      // 0fc: athrow
      // 0fd: bipush 0
      // 0fe: istore 10
      // 100: iload 10
      // 102: aload 9
      // 104: invokevirtual qhg.vek ()I
      // 107: if_icmpge 19e
      // 10a: aload 9
      // 10c: iload 10
      // 10e: invokevirtual qhg.kd6 (I)Lbdo;
      // 111: astore 11
      // 113: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 116: astore 12
      // 118: aload 11
      // 11a: aload 12
      // 11c: invokestatic vpw.vy5 (Lbdo;Ljava/util/List;)V
      // 11f: iload 7
      // 121: ifne 199
      // 124: aload 12
      // 126: invokeinterface java/util/List.size ()I 1
      // 12b: ifle 196
      // 12e: goto 135
      // 131: invokestatic p7f.a (Loov;)Loov;
      // 134: athrow
      // 135: bipush 1
      // 136: istore 13
      // 138: iload 13
      // 13a: aload 12
      // 13c: invokeinterface java/util/List.size ()I 1
      // 141: if_icmpge 18d
      // 144: aload 12
      // 146: iload 13
      // 148: new java/lang/StringBuilder
      // 14b: dup
      // 14c: invokespecial java/lang/StringBuilder.<init> ()V
      // 14f: sipush 31065
      // 152: ldc2_w 5701408079931070872
      // 155: lload 5
      // 157: lxor
      // 158: invokedynamic h (IJ)Ljava/lang/String; bsm=p7f.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15d: nop
      // 15e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 161: aload 12
      // 163: iload 13
      // 165: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 16a: checkcast java/lang/String
      // 16d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 170: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 173: invokeinterface java/util/List.set (ILjava/lang/Object;)Ljava/lang/Object; 3
      // 178: pop
      // 179: iinc 13 1
      // 17c: iload 7
      // 17e: ifne 199
      // 181: iload 7
      // 183: ifeq 138
      // 186: goto 18d
      // 189: invokestatic p7f.a (Loov;)Loov;
      // 18c: athrow
      // 18d: aload 3
      // 18e: aload 12
      // 190: invokeinterface java/util/List.addAll (Ljava/util/Collection;)Z 2
      // 195: pop
      // 196: iinc 10 1
      // 199: iload 7
      // 19b: ifeq 100
      // 19e: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6827647526626795430L, -8773710781755988243L, MethodHandles.lookup().lookupClass()).a(139819787181800L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 98040745321648L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[6];
      int var7 = 0;
      String var6 = ",_\u0085õà\u0014Ñû%8ÔìùÓØf 9±EÌ\u0080\u009aÛì\u0084ÔèãK\"\u0085\u0090(!\u0088¦qzæ\u0018¶Óß^\u001f\nD¯í\u0011\u0016'fö\u0001q×Ðÿ\u0017&\u0092\u001a\u009c\u0010¡§4Pf»[ûÕ\u001c\u009c\rS\u0099Lí ¾\fÌ\u0004\u0013j;Â×\nné3\u0019¿bÈ¨×\u0085µF?\u001d]Õ\u0096§ÚÅÛ7";
      int var8 = ",_\u0085õà\u0014Ñû%8ÔìùÓØf 9±EÌ\u0080\u009aÛì\u0084ÔèãK\"\u0085\u0090(!\u0088¦qzæ\u0018¶Óß^\u001f\nD¯í\u0011\u0016'fö\u0001q×Ðÿ\u0017&\u0092\u001a\u009c\u0010¡§4Pf»[ûÕ\u001c\u009c\rS\u0099Lí ¾\fÌ\u0004\u0013j;Â×\nné3\u0019¿bÈ¨×\u0085µF?\u001d]Õ\u0096§ÚÅÛ7"
         .length();
      char var5 = '(';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     b = var9;
                     g = new String[6];
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var20;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "AI\u008aï8É Ð\u001d\u0081\u0011mÈ²¯&\u0010\u000eØ!E7\u001a1\u0096z.j\u008cªT#\u0098";
                  var8 = "AI\u008aï8É Ð\u001d\u0081\u0011mÈ²¯&\u0010\u000eØ!E7\u001a1\u0096z.j\u008cªT#\u0098".length();
                  var5 = 16;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 17409;
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
            throw new RuntimeException("p7f", var10);
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
         throw new RuntimeException("p7f" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
