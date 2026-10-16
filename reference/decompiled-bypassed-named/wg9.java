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

@dr9$x0j(
   t2u = "bind",
   io4 = {"<module> <key> | clear"},
   hjc = "Bind a module to a key"
)
public class wg9 extends HwidProvider {
   private static final long a;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   @Override
   public void xjl(String[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic wg9.a J
      // 003: ldc2_w 29289219845225
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 4
      // 00d: aload 1
      // 00e: arraylength
      // 00f: iload 4
      // 011: ifeq 03c
      // 014: bipush 1
      // 015: if_icmpge 028
      // 018: goto 01f
      // 01b: invokestatic wg9.a (Loov;)Loov;
      // 01e: athrow
      // 01f: aload 0
      // 020: invokevirtual wg9.dhs ()V
      // 023: return
      // 024: invokestatic wg9.a (Loov;)Loov;
      // 027: athrow
      // 028: aload 1
      // 029: bipush 0
      // 02a: aaload
      // 02b: sipush 10276
      // 02e: ldc2_w 2262787444168069466
      // 031: lload 2
      // 032: lxor
      // 033: invokedynamic n (IJ)Ljava/lang/String; bsm=wg9.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 038: nop
      // 039: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 03c: iload 4
      // 03e: ifeq 0a3
      // 041: ifeq 0a1
      // 044: goto 04b
      // 047: invokestatic wg9.a (Loov;)Loov;
      // 04a: athrow
      // 04b: getstatic ClientState.qkk Lzwr;
      // 04e: invokevirtual ClientState.getModuleRegistry ()Lkgt;
      // 051: invokevirtual ModuleRegistry.wau ()Ljava/util/ArrayList;
      // 054: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 057: astore 5
      // 059: aload 5
      // 05b: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 060: ifeq 086
      // 063: aload 5
      // 065: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 06a: checkcast Module
      // 06d: astore 6
      // 06f: aload 6
      // 071: bipush 0
      // 072: invokevirtual Module.nm8 (I)V
      // 075: iload 4
      // 077: ifeq 0a0
      // 07a: iload 4
      // 07c: ifne 059
      // 07f: goto 086
      // 082: invokestatic wg9.a (Loov;)Loov;
      // 085: athrow
      // 086: getstatic ClientState.qkk Lzwr;
      // 089: invokevirtual ClientState.getConfigManager ()Lszk;
      // 08c: invokevirtual ConfigManager.saveBinds ()V
      // 08f: sipush 12683
      // 092: ldc2_w 6935649380354296049
      // 095: lload 2
      // 096: lxor
      // 097: invokedynamic n (IJ)Ljava/lang/String; bsm=wg9.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09c: nop
      // 09d: invokestatic ncl.dob (Ljava/lang/String;)V
      // 0a0: return
      // 0a1: aload 1
      // 0a2: arraylength
      // 0a3: bipush 2
      // 0a4: if_icmpge 0b0
      // 0a7: aload 0
      // 0a8: invokevirtual wg9.dhs ()V
      // 0ab: return
      // 0ac: invokestatic wg9.a (Loov;)Loov;
      // 0af: athrow
      // 0b0: getstatic ClientState.qkk Lzwr;
      // 0b3: invokevirtual ClientState.getModuleRegistry ()Lkgt;
      // 0b6: aload 1
      // 0b7: bipush 0
      // 0b8: aaload
      // 0b9: invokevirtual ModuleRegistry.wv4 (Ljava/lang/String;)Lar7;
      // 0bc: astore 5
      // 0be: aload 5
      // 0c0: ifnull 18c
      // 0c3: aload 1
      // 0c4: bipush 1
      // 0c5: aaload
      // 0c6: invokevirtual java/lang/String.toUpperCase ()Ljava/lang/String;
      // 0c9: invokestatic org/lwjgl/input/Keyboard.getKeyIndex (Ljava/lang/String;)I
      // 0cc: istore 6
      // 0ce: iload 4
      // 0d0: ifeq 151
      // 0d3: iload 6
      // 0d5: bipush -1
      // 0d6: if_icmpeq 156
      // 0d9: goto 0e0
      // 0dc: invokestatic wg9.a (Loov;)Loov;
      // 0df: athrow
      // 0e0: aload 5
      // 0e2: iload 6
      // 0e4: invokevirtual Module.nm8 (I)V
      // 0e7: getstatic ClientState.qkk Lzwr;
      // 0ea: invokevirtual ClientState.getConfigManager ()Lszk;
      // 0ed: invokevirtual ConfigManager.saveBinds ()V
      // 0f0: new java/lang/StringBuilder
      // 0f3: dup
      // 0f4: invokespecial java/lang/StringBuilder.<init> ()V
      // 0f7: getstatic syo.u4m Lsyo;
      // 0fa: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0fd: aload 5
      // 0ff: invokevirtual Module.m2d ()Ljava/lang/String;
      // 102: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 105: getstatic syo.w29 Lsyo;
      // 108: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 10b: sipush 15704
      // 10e: ldc2_w 5491314073243911200
      // 111: lload 2
      // 112: lxor
      // 113: invokedynamic n (IJ)Ljava/lang/String; bsm=wg9.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 118: nop
      // 119: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11c: getstatic syo.u4m Lsyo;
      // 11f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 122: aload 5
      // 124: invokevirtual Module.x_i ()I
      // 127: invokestatic org/lwjgl/input/Keyboard.getKeyName (I)Ljava/lang/String;
      // 12a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 12d: getstatic syo.w29 Lsyo;
      // 130: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 133: sipush 993
      // 136: ldc2_w 4549657979626240666
      // 139: lload 2
      // 13a: lxor
      // 13b: invokedynamic n (IJ)Ljava/lang/String; bsm=wg9.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 140: nop
      // 141: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 144: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 147: invokestatic ncl.dob (Ljava/lang/String;)V
      // 14a: goto 151
      // 14d: invokestatic wg9.a (Loov;)Loov;
      // 150: athrow
      // 151: iload 4
      // 153: ifne 187
      // 156: new java/lang/StringBuilder
      // 159: dup
      // 15a: invokespecial java/lang/StringBuilder.<init> ()V
      // 15d: sipush 19078
      // 160: ldc2_w 8672984133800653817
      // 163: lload 2
      // 164: lxor
      // 165: invokedynamic n (IJ)Ljava/lang/String; bsm=wg9.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16a: nop
      // 16b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 16e: aload 1
      // 16f: bipush 1
      // 170: aaload
      // 171: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 174: ldc ")"
      // 176: nop
      // 177: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 17a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 17d: invokestatic ncl.dob (Ljava/lang/String;)V
      // 180: goto 187
      // 183: invokestatic wg9.a (Loov;)Loov;
      // 186: athrow
      // 187: iload 4
      // 189: ifne 1bd
      // 18c: new java/lang/StringBuilder
      // 18f: dup
      // 190: invokespecial java/lang/StringBuilder.<init> ()V
      // 193: sipush 6163
      // 196: ldc2_w 867355003534385514
      // 199: lload 2
      // 19a: lxor
      // 19b: invokedynamic n (IJ)Ljava/lang/String; bsm=wg9.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a0: nop
      // 1a1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a4: aload 1
      // 1a5: bipush 0
      // 1a6: aaload
      // 1a7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1aa: ldc ")"
      // 1ac: nop
      // 1ad: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1b0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1b3: invokestatic ncl.dob (Ljava/lang/String;)V
      // 1b6: goto 1bd
      // 1b9: invokestatic wg9.a (Loov;)Loov;
      // 1bc: athrow
      // 1bd: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7406243987116191996L, 6003534918846296671L, MethodHandles.lookup().lookupClass()).a(236017591838814L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 127906302481277L;
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
      String var6 = "\u00003I¯\u0080\u0010>%fMX½\nî\f{(ë\"v\u00ad¥q\u009e\u0083iødw\u001d\u00029·ë\u0004ÏÎä4,Ù_\u009e\u008aílÑ&*%gþ¤nBÃí(\u0096ã;½\u0087X\u0080âÆ_jé\u001c\u0096êè/U\u008fû\u0012+ÿ»\"ïa\u000fW\u0016\u0006\u008f¹©\u0093É\u009b4;2\u0018\u0012 B)\u0017Iù¸\u0005ó]5¸¯\u0095\u0090h\u008cýNKò(¨";
      int var8 = "\u00003I¯\u0080\u0010>%fMX½\nî\f{(ë\"v\u00ad¥q\u009e\u0083iødw\u001d\u00029·ë\u0004ÏÎä4,Ù_\u009e\u008aílÑ&*%gþ¤nBÃí(\u0096ã;½\u0087X\u0080âÆ_jé\u001c\u0096êè/U\u008fû\u0012+ÿ»\"ïa\u000fW\u0016\u0006\u008f¹©\u0093É\u009b4;2\u0018\u0012 B)\u0017Iù¸\u0005ó]5¸¯\u0095\u0090h\u008cýNKò(¨"
         .length();
      char var5 = 16;
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
                     d = var9;
                     e = new String[6];
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

                  var6 = "\u0013§\u0012sÁñºÆ\u0089\u00059\u0098Q{((¹nð\u009dÇÊ<±\u0089ûÔÄ\u001bP\u009fÅW\"\u009eSwjÒ\u009e\u00038û¢ë«!\u0016\u0010Í\u008c}¤¶X_\u0094û\u008c\u008aá?\u0011ê¥";
                  var8 = "\u0013§\u0012sÁñºÆ\u0089\u00059\u0098Q{((¹nð\u009dÇÊ<±\u0089ûÔÄ\u001bP\u009fÅW\"\u009eSwjÒ\u009e\u00038û¢ë«!\u0016\u0010Í\u008c}¤¶X_\u0094û\u008c\u008aá?\u0011ê¥"
                     .length();
                  var5 = '0';
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 3705;
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
            throw new RuntimeException("wg9", var10);
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
         throw new RuntimeException("wg9" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
