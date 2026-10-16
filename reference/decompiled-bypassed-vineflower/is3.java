import com.mojang.authlib.ProfileLookupCallback;
import java.io.File;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class is3 {
   private static final Logger zu_;
   public static final File r52;
   public static final File oyr;
   public static final File zhp;
   public static final File hc7;

   private static void acj(vr1 param0, Collection param1, ProfileLookupCallback param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: aload 1
      // 05: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 0a: new is3$1
      // 0d: dup
      // 0e: invokespecial is3$1.<init> ()V
      // 11: invokestatic com/google/common/collect/Iterators.filter (Ljava/util/Iterator;Lcom/google/common/base/Predicate;)Lcom/google/common/collect/UnmodifiableIterator;
      // 14: ldc java/lang/String
      // 16: nop
      // 17: invokestatic com/google/common/collect/Iterators.toArray (Ljava/util/Iterator;Ljava/lang/Class;)[Ljava/lang/Object;
      // 1a: checkcast [Ljava/lang/String;
      // 1d: checkcast [Ljava/lang/String;
      // 20: astore 4
      // 22: aload 0
      // 23: iload 3
      // 24: ifeq 3c
      // 27: invokevirtual vr1.mrm ()Z
      // 2a: ifeq 4e
      // 2d: goto 34
      // 30: invokestatic is3.a (Loov;)Loov;
      // 33: athrow
      // 34: aload 0
      // 35: goto 3c
      // 38: invokestatic is3.a (Loov;)Loov;
      // 3b: athrow
      // 3c: invokevirtual vr1.ulz ()Lcom/mojang/authlib/GameProfileRepository;
      // 3f: aload 4
      // 41: getstatic com/mojang/authlib/Agent.MINECRAFT Lcom/mojang/authlib/Agent;
      // 44: aload 2
      // 45: invokeinterface com/mojang/authlib/GameProfileRepository.findProfilesByNames ([Ljava/lang/String;Lcom/mojang/authlib/Agent;Lcom/mojang/authlib/ProfileLookupCallback;)V 4
      // 4a: iload 3
      // 4b: ifne 96
      // 4e: aload 4
      // 50: astore 5
      // 52: aload 5
      // 54: arraylength
      // 55: istore 6
      // 57: bipush 0
      // 58: istore 7
      // 5a: iload 7
      // 5c: iload 6
      // 5e: if_icmpge 96
      // 61: aload 5
      // 63: iload 7
      // 65: aaload
      // 66: astore 8
      // 68: new com/mojang/authlib/GameProfile
      // 6b: dup
      // 6c: aconst_null
      // 6d: checkcast java/util/UUID
      // 70: aload 8
      // 72: invokespecial com/mojang/authlib/GameProfile.<init> (Ljava/util/UUID;Ljava/lang/String;)V
      // 75: invokestatic ha9.z05 (Lcom/mojang/authlib/GameProfile;)Ljava/util/UUID;
      // 78: astore 9
      // 7a: new com/mojang/authlib/GameProfile
      // 7d: dup
      // 7e: aload 9
      // 80: aload 8
      // 82: invokespecial com/mojang/authlib/GameProfile.<init> (Ljava/util/UUID;Ljava/lang/String;)V
      // 85: astore 10
      // 87: aload 2
      // 88: aload 10
      // 8a: invokeinterface com/mojang/authlib/ProfileLookupCallback.onProfileLookupSucceeded (Lcom/mojang/authlib/GameProfile;)V 2
      // 8f: iinc 7 1
      // 92: iload 3
      // 93: ifne 5a
      // 96: return
   }

   public static String mb9(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 1
      // 004: aload 0
      // 005: iload 1
      // 006: ifne 11b
      // 009: invokestatic jfy.hez (Ljava/lang/String;)Z
      // 00c: ifne 11a
      // 00f: goto 016
      // 012: invokestatic is3.a (Loov;)Loov;
      // 015: athrow
      // 016: aload 0
      // 017: iload 1
      // 018: ifne 11b
      // 01b: goto 022
      // 01e: invokestatic is3.a (Loov;)Loov;
      // 021: athrow
      // 022: invokevirtual java/lang/String.length ()I
      // 025: bipush 16
      // 027: if_icmpgt 11a
      // 02a: goto 031
      // 02d: invokestatic is3.a (Loov;)Loov;
      // 030: athrow
      // 031: invokestatic vr1._0v ()Lvr1;
      // 034: astore 2
      // 035: aload 2
      // 036: invokevirtual vr1.y71 ()Lkr3;
      // 039: aload 0
      // 03a: invokevirtual kr3.wjp (Ljava/lang/String;)Lcom/mojang/authlib/GameProfile;
      // 03d: astore 3
      // 03e: aload 3
      // 03f: iload 1
      // 040: ifne 04e
      // 043: ifnull 06e
      // 046: goto 04d
      // 049: invokestatic is3.a (Loov;)Loov;
      // 04c: athrow
      // 04d: aload 3
      // 04e: invokevirtual com/mojang/authlib/GameProfile.getId ()Ljava/util/UUID;
      // 051: iload 1
      // 052: ifne 06a
      // 055: ifnull 06e
      // 058: goto 05f
      // 05b: invokestatic is3.a (Loov;)Loov;
      // 05e: athrow
      // 05f: aload 3
      // 060: invokevirtual com/mojang/authlib/GameProfile.getId ()Ljava/util/UUID;
      // 063: goto 06a
      // 066: invokestatic is3.a (Loov;)Loov;
      // 069: athrow
      // 06a: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
      // 06d: areturn
      // 06e: aload 2
      // 06f: invokevirtual vr1.a59 ()Z
      // 072: iload 1
      // 073: ifne 08b
      // 076: ifne 107
      // 079: goto 080
      // 07c: invokestatic is3.a (Loov;)Loov;
      // 07f: athrow
      // 080: aload 2
      // 081: invokevirtual vr1.mrm ()Z
      // 084: goto 08b
      // 087: invokestatic is3.a (Loov;)Loov;
      // 08a: athrow
      // 08b: ifeq 107
      // 08e: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 091: astore 4
      // 093: new is3$2
      // 096: dup
      // 097: aload 2
      // 098: aload 4
      // 09a: invokespecial is3$2.<init> (Lvr1;Ljava/util/List;)V
      // 09d: astore 5
      // 09f: aload 2
      // 0a0: bipush 1
      // 0a1: anewarray 1
      // 0a4: dup
      // 0a5: bipush 0
      // 0a6: aload 0
      // 0a7: aastore
      // 0a8: invokestatic com/google/common/collect/Lists.newArrayList ([Ljava/lang/Object;)Ljava/util/ArrayList;
      // 0ab: aload 5
      // 0ad: invokestatic is3.acj (Lvr1;Ljava/util/Collection;Lcom/mojang/authlib/ProfileLookupCallback;)V
      // 0b0: aload 4
      // 0b2: iload 1
      // 0b3: ifne 0d4
      // 0b6: invokeinterface java/util/List.size ()I 1
      // 0bb: ifle 103
      // 0be: goto 0c5
      // 0c1: invokestatic is3.a (Loov;)Loov;
      // 0c4: athrow
      // 0c5: aload 4
      // 0c7: bipush 0
      // 0c8: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0cd: goto 0d4
      // 0d0: invokestatic is3.a (Loov;)Loov;
      // 0d3: athrow
      // 0d4: checkcast com/mojang/authlib/GameProfile
      // 0d7: invokevirtual com/mojang/authlib/GameProfile.getId ()Ljava/util/UUID;
      // 0da: iload 1
      // 0db: ifne 0fd
      // 0de: ifnull 103
      // 0e1: goto 0e8
      // 0e4: invokestatic is3.a (Loov;)Loov;
      // 0e7: athrow
      // 0e8: aload 4
      // 0ea: bipush 0
      // 0eb: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0f0: checkcast com/mojang/authlib/GameProfile
      // 0f3: invokevirtual com/mojang/authlib/GameProfile.getId ()Ljava/util/UUID;
      // 0f6: goto 0fd
      // 0f9: invokestatic is3.a (Loov;)Loov;
      // 0fc: athrow
      // 0fd: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
      // 100: goto 106
      // 103: ldc ""
      // 105: nop
      // 106: areturn
      // 107: new com/mojang/authlib/GameProfile
      // 10a: dup
      // 10b: aconst_null
      // 10c: checkcast java/util/UUID
      // 10f: aload 0
      // 110: invokespecial com/mojang/authlib/GameProfile.<init> (Ljava/util/UUID;Ljava/lang/String;)V
      // 113: invokestatic ha9.z05 (Lcom/mojang/authlib/GameProfile;)Ljava/util/UUID;
      // 116: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
      // 119: areturn
      // 11a: aload 0
      // 11b: areturn
   }

   public static Logger qeq() {
      return zu_;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8309876956460849602L, -1370890102509088287L, MethodHandles.lookup().lookupClass()).a(235206274008613L);
      // $VF: monitorexit
      long var10 = var10000 ^ 615040795324L;
      Cipher var1;
      Cipher var14 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var14.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[4];
      int var6 = 0;
      String var5 = "Í\u0005æg_\u0090¾C\u0011\u0006ÚBöN\u0099¯\u0010\u0094\u0019óÇÙü\u009fn\u0094\u0089o\u008cn\u008cÖñ";
      int var7 = "Í\u0005æg_\u0090¾C\u0011\u0006ÚBöN\u0099¯\u0010\u0094\u0019óÇÙü\u009fn\u0094\u0089o\u008cn\u008cÖñ".length();
      char var4 = 16;
      int var13 = -1;

      label27:
      while (true) {
         String var15 = var5.substring(++var13, var13 + var4);
         byte var10001 = -1;

         while (true) {
            byte[] var9 = var1.doFinal(var15.getBytes("ISO-8859-1"));
            String var21 = a(var9).intern();
            switch (var10001) {
               case 0:
                  var8[var6++] = var21;
                  if ((var13 += var4) >= var7) {
                     zu_ = LogManager.getLogger();
                     r52 = new File(var8[0]);
                     oyr = new File(var8[3]);
                     zhp = new File(var8[2]);
                     hc7 = new File(var8[1]);
                     return;
                  }

                  var4 = var5.charAt(var13);
                  break;
               default:
                  var8[var6++] = var21;
                  if ((var13 += var4) < var7) {
                     var4 = var5.charAt(var13);
                     continue label27;
                  }

                  var5 = "p\t.FØô ¶\u0018\u008ehC\u007f\u007f\u007f\u0015k\u0081ñ\u001d\u0082M÷7\u0089\b%uGp\u0097\u0001V";
                  var7 = "p\t.FØô ¶\u0018\u008ehC\u007f\u007f\u007f\u0015k\u0081ñ\u001d\u0082M÷7\u0089\b%uGp\u0097\u0001V".length();
                  var4 = '\b';
                  var13 = -1;
            }

            var15 = var5.substring(++var13, var13 + var4);
            var10001 = 0;
         }
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
}
