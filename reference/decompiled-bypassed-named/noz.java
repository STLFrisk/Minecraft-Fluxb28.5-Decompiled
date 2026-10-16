import com.google.common.base.Objects;
import com.google.gson.Gson;
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

public class noz {
   private static final Gson kpi;
   private final String _z1;
   private String ahi;
   private Map n_0;
   private static final long b;
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public noz(String var1, String var2) {
      this._z1 = var1;
      this.ahi = var2;
   }

   public noz(String var1) {
      this(var1, (String)null);
   }

   public void p7i(String var1) {
      this.ahi = var1;
   }

   public String w57() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 22
      // 09: getfield noz.ahi Ljava/lang/String;
      // 0c: ifnonnull 21
      // 0f: goto 16
      // 12: invokestatic noz.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15: athrow
      // 16: aload 0
      // 17: getfield noz._z1 Ljava/lang/String;
      // 1a: goto 25
      // 1d: invokestatic noz.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 20: athrow
      // 21: aload 0
      // 22: getfield noz.ahi Ljava/lang/String;
      // 25: areturn
   }

   public void h8r(String param1, String param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic noz.b J
      // 003: ldc2_w 82377051435528
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 5
      // 00d: aload 0
      // 00e: getfield noz.n_0 Ljava/util/Map;
      // 011: iload 5
      // 013: ifeq 032
      // 016: ifnonnull 02e
      // 019: goto 020
      // 01c: invokestatic noz.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 01f: athrow
      // 020: aload 0
      // 021: invokestatic com/google/common/collect/Maps.newHashMap ()Ljava/util/HashMap;
      // 024: putfield noz.n_0 Ljava/util/Map;
      // 027: goto 02e
      // 02a: invokestatic noz.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 02d: athrow
      // 02e: aload 0
      // 02f: getfield noz.n_0 Ljava/util/Map;
      // 032: invokeinterface java/util/Map.size ()I 1
      // 037: bipush 50
      // 039: if_icmple 056
      // 03c: new java/lang/IllegalArgumentException
      // 03f: dup
      // 040: sipush 28462
      // 043: ldc2_w 8819059348651779578
      // 046: lload 3
      // 047: lxor
      // 048: invokedynamic l (IJ)Ljava/lang/String; bsm=noz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04d: nop
      // 04e: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 051: athrow
      // 052: invokestatic noz.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 055: athrow
      // 056: aload 1
      // 057: iload 5
      // 059: ifeq 081
      // 05c: ifnonnull 080
      // 05f: goto 066
      // 062: invokestatic noz.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 065: athrow
      // 066: new java/lang/IllegalArgumentException
      // 069: dup
      // 06a: sipush 158
      // 06d: ldc2_w 3392245271785425485
      // 070: lload 3
      // 071: lxor
      // 072: invokedynamic l (IJ)Ljava/lang/String; bsm=noz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: nop
      // 078: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 07b: athrow
      // 07c: invokestatic noz.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 07f: athrow
      // 080: aload 1
      // 081: iload 5
      // 083: ifeq 0b1
      // 086: invokevirtual java/lang/String.length ()I
      // 089: sipush 255
      // 08c: if_icmple 0b0
      // 08f: goto 096
      // 092: invokestatic noz.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 095: athrow
      // 096: new java/lang/IllegalArgumentException
      // 099: dup
      // 09a: sipush 1401
      // 09d: ldc2_w 9050104454388207528
      // 0a0: lload 3
      // 0a1: lxor
      // 0a2: invokedynamic l (IJ)Ljava/lang/String; bsm=noz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a7: nop
      // 0a8: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 0ab: athrow
      // 0ac: invokestatic noz.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0af: athrow
      // 0b0: aload 2
      // 0b1: iload 5
      // 0b3: ifeq 0db
      // 0b6: ifnonnull 0da
      // 0b9: goto 0c0
      // 0bc: invokestatic noz.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0bf: athrow
      // 0c0: new java/lang/IllegalArgumentException
      // 0c3: dup
      // 0c4: sipush 16575
      // 0c7: ldc2_w 4157249967701920361
      // 0ca: lload 3
      // 0cb: lxor
      // 0cc: invokedynamic l (IJ)Ljava/lang/String; bsm=noz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: nop
      // 0d2: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 0d5: athrow
      // 0d6: invokestatic noz.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0d9: athrow
      // 0da: aload 2
      // 0db: iload 5
      // 0dd: ifeq 115
      // 0e0: invokevirtual java/lang/String.length ()I
      // 0e3: sipush 255
      // 0e6: if_icmple 10a
      // 0e9: goto 0f0
      // 0ec: invokestatic noz.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ef: athrow
      // 0f0: new java/lang/IllegalArgumentException
      // 0f3: dup
      // 0f4: sipush 21485
      // 0f7: ldc2_w 8461506889715554623
      // 0fa: lload 3
      // 0fb: lxor
      // 0fc: invokedynamic l (IJ)Ljava/lang/String; bsm=noz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 101: nop
      // 102: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 105: athrow
      // 106: invokestatic noz.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 109: athrow
      // 10a: aload 0
      // 10b: getfield noz.n_0 Ljava/util/Map;
      // 10e: aload 1
      // 10f: aload 2
      // 110: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 115: pop
      // 116: return
   }

   public String mud() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield noz.n_0 Ljava/util/Map;
      // 08: iload 1
      // 09: ifeq 21
      // 0c: ifnull 3a
      // 0f: goto 16
      // 12: invokestatic noz.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15: athrow
      // 16: aload 0
      // 17: getfield noz.n_0 Ljava/util/Map;
      // 1a: goto 21
      // 1d: invokestatic noz.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 20: athrow
      // 21: invokeinterface java/util/Map.isEmpty ()Z 1
      // 26: ifne 3a
      // 29: getstatic noz.kpi Lcom/google/gson/Gson;
      // 2c: aload 0
      // 2d: getfield noz.n_0 Ljava/util/Map;
      // 30: invokevirtual com/google/gson/Gson.toJson (Ljava/lang/Object;)Ljava/lang/String;
      // 33: goto 3b
      // 36: invokestatic noz.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 39: athrow
      // 3a: aconst_null
      // 3b: areturn
   }

   public String dxx() {
      return this._z1;
   }

   @Override
   public String toString() {
      long var1 = b ^ 86075883533411L;
      return Objects.toStringHelper(this)
         .add(a<"l">(17256, 7811784953072209876L ^ var1), this._z1)
         .add(a<"l">(25623, 538039088310444L ^ var1), this.ahi)
         .add(a<"l">(10448, 7119176544578905198L ^ var1), this.mud())
         .toString();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-291406478484388121L, -2024346543913752661L, MethodHandles.lookup().lookupClass()).a(65156042199270L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 102238021314109L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[8];
      int var7 = 0;
      String var6 = "\u0090]pl\u001e»\u009eèº¯\u0098\u0002ë\u008cyë§¶ôváG>\u0090\u008fD y\u0081y#X]ëWo\u000bÏb&%ó\u008eÞÌ$f\u0015{ñ\u0084\u0096\u0083ãNØþÁ\f\u00ad©BÔ0-ú\"õqîpzv¥pÚ©ûÀ¸\u0010\r@ Úæ\bü\u001aÓ\u0089E\u001am3âú@\u0092¤³0ß´8È\u0081àþ\u009a\u0019Pé\u0093£¡ø³\u0093À\u0016«\u0088»m\u001e3\u0082KQË3ä\u009eL\u0091¬i\u0017÷\u008cô·\u0010íº\u001b\u009dßK\u009d<1é\u0086³\u0012Æ¬ézÔ\u0010\u0017_Ã\u0088ÆøqÎ\u009aU5\u0084\u0086°£6\u0018\u0097å[7\u0006ÈDË\u0006ß÷I²¸I8IM\t\u001eZÁ\"F@N\u0095(äLsí@\u008dÚF\u0019]ð>\u0090rL>\u008b\u0003¨¬±\u0093ñb\u008a\u000b /!¯wZ_èH\u0082À\u0080K88\u0083æ\u00192gTÌªPç\u0013ì×\rQZAG\u009a\u001a";
      int var8 = "\u0090]pl\u001e»\u009eèº¯\u0098\u0002ë\u008cyë§¶ôváG>\u0090\u008fD y\u0081y#X]ëWo\u000bÏb&%ó\u008eÞÌ$f\u0015{ñ\u0084\u0096\u0083ãNØþÁ\f\u00ad©BÔ0-ú\"õqîpzv¥pÚ©ûÀ¸\u0010\r@ Úæ\bü\u001aÓ\u0089E\u001am3âú@\u0092¤³0ß´8È\u0081àþ\u009a\u0019Pé\u0093£¡ø³\u0093À\u0016«\u0088»m\u001e3\u0082KQË3ä\u009eL\u0091¬i\u0017÷\u008cô·\u0010íº\u001b\u009dßK\u009d<1é\u0086³\u0012Æ¬ézÔ\u0010\u0017_Ã\u0088ÆøqÎ\u009aU5\u0084\u0086°£6\u0018\u0097å[7\u0006ÈDË\u0006ß÷I²¸I8IM\t\u001eZÁ\"F@N\u0095(äLsí@\u008dÚF\u0019]ð>\u0090rL>\u008b\u0003¨¬±\u0093ñb\u008a\u000b /!¯wZ_èH\u0082À\u0080K88\u0083æ\u00192gTÌªPç\u0013ì×\rQZAG\u009a\u001a"
         .length();
      char var5 = 'P';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     c = var9;
                     d = new String[8];
                     kpi = new Gson();
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

                  var6 = "FìYPÓ#¶[\u009d;\u0018°hJð%3¯\u0004\u0087\u0012¥0\u0091ì þ\u0091\u009cïµ\u008d\"TÔ[XëâpeO2%ÿÃçXm\\\u000f'sF\u0018\u0001ÃIî\u00024!&\u009f@\u001f\u008e°NßU\u000b÷¾7vXÃ±iPÊ\u001e\u009a\u009d\\=(\u001bQß\u0091§ÀÎ\u0080\u0085µGhð`£\u0015õ_VvFÍ\u0012¢0¤Li\u009f\u0001m\u0006\u0019!`\u0081þA\u000b5V";
                  var8 = "FìYPÓ#¶[\u009d;\u0018°hJð%3¯\u0004\u0087\u0012¥0\u0091ì þ\u0091\u009cïµ\u008d\"TÔ[XëâpeO2%ÿÃçXm\\\u000f'sF\u0018\u0001ÃIî\u00024!&\u009f@\u001f\u008e°NßU\u000b÷¾7vXÃ±iPÊ\u001e\u009a\u009d\\=(\u001bQß\u0091§ÀÎ\u0080\u0085µGhð`£\u0015õ_VvFÍ\u0012¢0¤Li\u009f\u0001m\u0006\u0019!`\u0081þA\u000b5V"
                     .length();
                  var5 = '@';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 21910;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("noz", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
         d[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("noz" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
