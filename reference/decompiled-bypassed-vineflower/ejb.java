import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ejb extends ar7 {
   public static String vt5;
   public static Map j0b;
   public static cn7 ben;
   public static cn7 _fy;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public ejb() {
      long var1 = a ^ 126833610256483L;
      super(b<"t">(15062, 4331361139296589483L ^ var1), _aj.sxc, false, new j1s[0]);
   }

   @jev
   public void ywd(s60 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 2
      // 004: aload 0
      // 005: pop
      // 006: getstatic ejb.ek1 Lc05;
      // 009: iload 2
      // 00a: ifeq 026
      // 00d: getfield c05.vg8 Ll86;
      // 010: ifnull 02c
      // 013: goto 01a
      // 016: invokestatic ejb.a (Loov;)Loov;
      // 019: athrow
      // 01a: aload 0
      // 01b: pop
      // 01c: getstatic ejb.ek1 Lc05;
      // 01f: goto 026
      // 022: invokestatic ejb.a (Loov;)Loov;
      // 025: athrow
      // 026: getfield c05.tij Lkh3;
      // 029: ifnonnull 031
      // 02c: return
      // 02d: invokestatic ejb.a (Loov;)Loov;
      // 030: athrow
      // 031: aload 1
      // 032: getfield s60.jcg Ljava/lang/String;
      // 035: iload 2
      // 036: ifeq 048
      // 039: ifnonnull 044
      // 03c: goto 043
      // 03f: invokestatic ejb.a (Loov;)Loov;
      // 042: athrow
      // 043: return
      // 044: aload 1
      // 045: getfield s60.jcg Ljava/lang/String;
      // 048: astore 3
      // 049: aload 3
      // 04a: aload 0
      // 04b: pop
      // 04c: getstatic ejb.ek1 Lc05;
      // 04f: getfield c05.vg8 Ll86;
      // 052: invokevirtual l86.noc ()Ljava/lang/String;
      // 055: getstatic ejb.vt5 Ljava/lang/String;
      // 058: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 05b: aload 0
      // 05c: pop
      // 05d: getstatic ejb.ek1 Lc05;
      // 060: getfield c05.vg8 Ll86;
      // 063: invokevirtual l86.noc ()Ljava/lang/String;
      // 066: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 069: getstatic ejb.vt5 Ljava/lang/String;
      // 06c: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 06f: aload 0
      // 070: pop
      // 071: getstatic ejb.ek1 Lc05;
      // 074: getfield c05.vg8 Ll86;
      // 077: invokevirtual l86.noc ()Ljava/lang/String;
      // 07a: invokevirtual java/lang/String.toUpperCase ()Ljava/lang/String;
      // 07d: getstatic ejb.vt5 Ljava/lang/String;
      // 080: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 083: astore 3
      // 084: getstatic ejb.j0b Ljava/util/Map;
      // 087: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 08c: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 091: astore 4
      // 093: aload 4
      // 095: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 09a: ifeq 0cc
      // 09d: aload 4
      // 09f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0a4: checkcast java/lang/String
      // 0a7: astore 5
      // 0a9: aload 3
      // 0aa: aload 5
      // 0ac: getstatic ejb.j0b Ljava/util/Map;
      // 0af: aload 5
      // 0b1: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0b6: checkcast java/lang/CharSequence
      // 0b9: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 0bc: astore 3
      // 0bd: iload 2
      // 0be: ifeq 1ce
      // 0c1: iload 2
      // 0c2: ifne 093
      // 0c5: goto 0cc
      // 0c8: invokestatic ejb.a (Loov;)Loov;
      // 0cb: athrow
      // 0cc: getstatic ejb._fy Lcn7;
      // 0cf: invokevirtual cn7.d7c ()Ljava/lang/Boolean;
      // 0d2: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0d5: ifeq 1c9
      // 0d8: getstatic ejb.ek1 Lc05;
      // 0db: invokevirtual c05.c02 ()Lp_k;
      // 0de: invokevirtual p_k.l0e ()Ljava/util/Collection;
      // 0e1: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 0e6: astore 4
      // 0e8: aload 4
      // 0ea: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0ef: ifeq 166
      // 0f2: aload 4
      // 0f4: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0f9: checkcast hv2
      // 0fc: astore 5
      // 0fe: aload 5
      // 100: iload 2
      // 101: ifeq 181
      // 104: iload 2
      // 105: ifeq 11b
      // 108: goto 10f
      // 10b: invokestatic ejb.a (Loov;)Loov;
      // 10e: athrow
      // 10f: ifnull 0e8
      // 112: goto 119
      // 115: invokestatic ejb.a (Loov;)Loov;
      // 118: athrow
      // 119: aload 5
      // 11b: invokevirtual hv2.pbs ()Lcom/mojang/authlib/GameProfile;
      // 11e: ifnonnull 128
      // 121: goto 0e8
      // 124: invokestatic ejb.a (Loov;)Loov;
      // 127: athrow
      // 128: aload 3
      // 129: aload 5
      // 12b: invokevirtual hv2.pbs ()Lcom/mojang/authlib/GameProfile;
      // 12e: invokevirtual com/mojang/authlib/GameProfile.getName ()Ljava/lang/String;
      // 131: new java/lang/StringBuilder
      // 134: dup
      // 135: invokespecial java/lang/StringBuilder.<init> ()V
      // 138: getstatic syo.w29 Lsyo;
      // 13b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 13e: ldc ""
      // 140: nop
      // 141: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 144: getstatic syo.sxj Lsyo;
      // 147: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 14a: aload 5
      // 14c: invokevirtual hv2.pbs ()Lcom/mojang/authlib/GameProfile;
      // 14f: invokevirtual com/mojang/authlib/GameProfile.getName ()Ljava/lang/String;
      // 152: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 155: getstatic syo.w29 Lsyo;
      // 158: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 15b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 15e: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 161: astore 3
      // 162: iload 2
      // 163: ifne 0e8
      // 166: invokestatic uj3.o1c ()Ljava/util/List;
      // 169: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 16e: astore 4
      // 170: aload 4
      // 172: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 177: ifeq 1c9
      // 17a: aload 4
      // 17c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 181: checkcast ha9
      // 184: astore 5
      // 186: aload 3
      // 187: aload 5
      // 189: invokevirtual ha9.noc ()Ljava/lang/String;
      // 18c: new java/lang/StringBuilder
      // 18f: dup
      // 190: invokespecial java/lang/StringBuilder.<init> ()V
      // 193: getstatic syo.rl1 Lsyo;
      // 196: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 199: ldc ""
      // 19b: nop
      // 19c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 19f: getstatic syo.sxj Lsyo;
      // 1a2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1a5: aload 5
      // 1a7: invokevirtual ha9.noc ()Ljava/lang/String;
      // 1aa: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ad: getstatic syo.rl1 Lsyo;
      // 1b0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1b3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1b6: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 1b9: astore 3
      // 1ba: iload 2
      // 1bb: ifeq 1ce
      // 1be: iload 2
      // 1bf: ifne 170
      // 1c2: goto 1c9
      // 1c5: invokestatic ejb.a (Loov;)Loov;
      // 1c8: athrow
      // 1c9: aload 1
      // 1ca: aload 3
      // 1cb: putfield s60.jcg Ljava/lang/String;
      // 1ce: return
   }

   public int bpy() {
      int var2 = 0;
      int var10000 = t9d.b();
      Iterator var3 = j0b.keySet().iterator();
      int var1 = var10000;

      while (true) {
         if (var3.hasNext()) {
            String var4 = (String)var3.next();
            var10000 = Math.max(var2, ek1.tx1.ezt((String)j0b.get(var4)));
            if (var1 == 0) {
               break;
            }

            var2 = var10000;
            if (var1 != 0) {
               continue;
            }
         }

         var10000 = var2;
         break;
      }

      return var10000;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-7447667554198154625L, -5718327509996572403L, MethodHandles.lookup().lookupClass()).a(213804035526787L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 77859884859997L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[5];
      int var5 = 0;
      String var4 = "*ðCÄNÊJ\u0011¥l\u0095¶Lh\u009cÎ\u0018\u0091\u0017_è\u0002\u000e\u0098\u008aÄÙñQ2Î\u009a¢[\u000eZÖ\u0099\u001cqU\u00108\u0086ì\\¨\u001eF\u009b\u0088ÔB×¾·Êÿ";
      int var6 = "*ðCÄNÊJ\u0011¥l\u0095¶Lh\u009cÎ\u0018\u0091\u0017_è\u0002\u000e\u0098\u008aÄÙñQ2Î\u009a¢[\u000eZÖ\u0099\u001cqU\u00108\u0086ì\\¨\u001eF\u009b\u0088ÔB×¾·Êÿ"
         .length();
      char var3 = 16;
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
                     g = new String[5];
                     vt5 = b<"t">(1530, 3257171286713441211L ^ var9);
                     j0b = new HashMap();
                     ben = new cn7(b<"t">(28905, 6068777332580511405L ^ var9), b<"t">(25175, 3134919839055084565L ^ var9), false);
                     _fy = new cn7(b<"t">(28905, 6068777332580511405L ^ var9), b<"t">(18814, 3896969652768069438L ^ var9), false);
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

                  var4 = "1}qqÙ4<ÊíV0Aº\"yÌýBSÖû¦qL«Àvb¼¹\u0012¹ b\u009c¨9`¤Y¸£/µx\u0094Rñ\u0004`¸lVsKéæVîê4\u0015Âi3";
                  var6 = "1}qqÙ4<ÊíV0Aº\"yÌýBSÖû¦qL«Àvb¼¹\u0012¹ b\u009c¨9`¤Y¸£/µx\u0094Rñ\u0004`¸lVsKéæVîê4\u0015Âi3".length();
                  var3 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 24225;
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
            throw new RuntimeException("ejb", var10);
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
         throw new RuntimeException("ejb" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
