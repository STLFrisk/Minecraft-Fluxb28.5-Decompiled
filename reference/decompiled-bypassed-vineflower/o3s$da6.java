import com.google.gson.annotations.SerializedName;
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

public class o3s$da6 {
   @SerializedName("code")
   private String dul;
   @SerializedName("acgurl")
   private String y9d;
   @SerializedName("width")
   private String r_v;
   @SerializedName("height")
   private String tup;
   @SerializedName("size")
   private String u8d;
   public final o3s lkq;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public o3s$da6(o3s var1) {
      this.lkq = var1;
   }

   public String s93() {
      return this.dul;
   }

   public String jkl() {
      return this.y9d;
   }

   public String y9e() {
      return this.r_v;
   }

   public String bt5() {
      return this.tup;
   }

   public String f9x() {
      return this.u8d;
   }

   public void d4t(String var1) {
      this.dul = var1;
   }

   public void ljy(String var1) {
      this.y9d = var1;
   }

   public void kld(String var1) {
      this.r_v = var1;
   }

   public void xr2(String var1) {
      this.tup = var1;
   }

   public void itw(String var1) {
      this.u8d = var1;
   }

   @Override
   public boolean equals(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 2
      // 004: aload 1
      // 005: iload 2
      // 006: ifeq 01b
      // 009: aload 0
      // 00a: if_acmpne 01a
      // 00d: goto 014
      // 010: invokestatic o3s$da6.a (Loov;)Loov;
      // 013: athrow
      // 014: bipush 1
      // 015: ireturn
      // 016: invokestatic o3s$da6.a (Loov;)Loov;
      // 019: athrow
      // 01a: aload 1
      // 01b: iload 2
      // 01c: ifeq 033
      // 01f: instanceof o3s$da6
      // 022: ifne 032
      // 025: goto 02c
      // 028: invokestatic o3s$da6.a (Loov;)Loov;
      // 02b: athrow
      // 02c: bipush 0
      // 02d: ireturn
      // 02e: invokestatic o3s$da6.a (Loov;)Loov;
      // 031: athrow
      // 032: aload 1
      // 033: checkcast o3s$da6
      // 036: astore 3
      // 037: aload 3
      // 038: iload 2
      // 039: ifeq 051
      // 03c: aload 0
      // 03d: invokevirtual o3s$da6.wdh (Ljava/lang/Object;)Z
      // 040: ifne 050
      // 043: goto 04a
      // 046: invokestatic o3s$da6.a (Loov;)Loov;
      // 049: athrow
      // 04a: bipush 0
      // 04b: ireturn
      // 04c: invokestatic o3s$da6.a (Loov;)Loov;
      // 04f: athrow
      // 050: aload 0
      // 051: invokevirtual o3s$da6.s93 ()Ljava/lang/String;
      // 054: astore 4
      // 056: aload 3
      // 057: invokevirtual o3s$da6.s93 ()Ljava/lang/String;
      // 05a: astore 5
      // 05c: aload 4
      // 05e: iload 2
      // 05f: ifeq 088
      // 062: ifnonnull 086
      // 065: goto 06c
      // 068: invokestatic o3s$da6.a (Loov;)Loov;
      // 06b: athrow
      // 06c: aload 5
      // 06e: iload 2
      // 06f: ifeq 0a5
      // 072: goto 079
      // 075: invokestatic o3s$da6.a (Loov;)Loov;
      // 078: athrow
      // 079: ifnull 0a1
      // 07c: goto 083
      // 07f: invokestatic o3s$da6.a (Loov;)Loov;
      // 082: athrow
      // 083: goto 09b
      // 086: aload 4
      // 088: iload 2
      // 089: ifeq 0a5
      // 08c: aload 5
      // 08e: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 091: ifne 0a1
      // 094: goto 09b
      // 097: invokestatic o3s$da6.a (Loov;)Loov;
      // 09a: athrow
      // 09b: bipush 0
      // 09c: ireturn
      // 09d: invokestatic o3s$da6.a (Loov;)Loov;
      // 0a0: athrow
      // 0a1: aload 0
      // 0a2: invokevirtual o3s$da6.jkl ()Ljava/lang/String;
      // 0a5: astore 6
      // 0a7: aload 3
      // 0a8: invokevirtual o3s$da6.jkl ()Ljava/lang/String;
      // 0ab: astore 7
      // 0ad: aload 6
      // 0af: iload 2
      // 0b0: ifeq 0d9
      // 0b3: ifnonnull 0d7
      // 0b6: goto 0bd
      // 0b9: invokestatic o3s$da6.a (Loov;)Loov;
      // 0bc: athrow
      // 0bd: aload 7
      // 0bf: iload 2
      // 0c0: ifeq 0f6
      // 0c3: goto 0ca
      // 0c6: invokestatic o3s$da6.a (Loov;)Loov;
      // 0c9: athrow
      // 0ca: ifnull 0f2
      // 0cd: goto 0d4
      // 0d0: invokestatic o3s$da6.a (Loov;)Loov;
      // 0d3: athrow
      // 0d4: goto 0ec
      // 0d7: aload 6
      // 0d9: iload 2
      // 0da: ifeq 0f6
      // 0dd: aload 7
      // 0df: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 0e2: ifne 0f2
      // 0e5: goto 0ec
      // 0e8: invokestatic o3s$da6.a (Loov;)Loov;
      // 0eb: athrow
      // 0ec: bipush 0
      // 0ed: ireturn
      // 0ee: invokestatic o3s$da6.a (Loov;)Loov;
      // 0f1: athrow
      // 0f2: aload 0
      // 0f3: invokevirtual o3s$da6.y9e ()Ljava/lang/String;
      // 0f6: astore 8
      // 0f8: aload 3
      // 0f9: invokevirtual o3s$da6.y9e ()Ljava/lang/String;
      // 0fc: astore 9
      // 0fe: aload 8
      // 100: iload 2
      // 101: ifeq 12a
      // 104: ifnonnull 128
      // 107: goto 10e
      // 10a: invokestatic o3s$da6.a (Loov;)Loov;
      // 10d: athrow
      // 10e: aload 9
      // 110: iload 2
      // 111: ifeq 147
      // 114: goto 11b
      // 117: invokestatic o3s$da6.a (Loov;)Loov;
      // 11a: athrow
      // 11b: ifnull 143
      // 11e: goto 125
      // 121: invokestatic o3s$da6.a (Loov;)Loov;
      // 124: athrow
      // 125: goto 13d
      // 128: aload 8
      // 12a: iload 2
      // 12b: ifeq 147
      // 12e: aload 9
      // 130: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 133: ifne 143
      // 136: goto 13d
      // 139: invokestatic o3s$da6.a (Loov;)Loov;
      // 13c: athrow
      // 13d: bipush 0
      // 13e: ireturn
      // 13f: invokestatic o3s$da6.a (Loov;)Loov;
      // 142: athrow
      // 143: aload 0
      // 144: invokevirtual o3s$da6.bt5 ()Ljava/lang/String;
      // 147: astore 10
      // 149: aload 3
      // 14a: invokevirtual o3s$da6.bt5 ()Ljava/lang/String;
      // 14d: astore 11
      // 14f: aload 10
      // 151: iload 2
      // 152: ifeq 17b
      // 155: ifnonnull 179
      // 158: goto 15f
      // 15b: invokestatic o3s$da6.a (Loov;)Loov;
      // 15e: athrow
      // 15f: aload 11
      // 161: iload 2
      // 162: ifeq 198
      // 165: goto 16c
      // 168: invokestatic o3s$da6.a (Loov;)Loov;
      // 16b: athrow
      // 16c: ifnull 194
      // 16f: goto 176
      // 172: invokestatic o3s$da6.a (Loov;)Loov;
      // 175: athrow
      // 176: goto 18e
      // 179: aload 10
      // 17b: iload 2
      // 17c: ifeq 198
      // 17f: aload 11
      // 181: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 184: ifne 194
      // 187: goto 18e
      // 18a: invokestatic o3s$da6.a (Loov;)Loov;
      // 18d: athrow
      // 18e: bipush 0
      // 18f: ireturn
      // 190: invokestatic o3s$da6.a (Loov;)Loov;
      // 193: athrow
      // 194: aload 0
      // 195: invokevirtual o3s$da6.f9x ()Ljava/lang/String;
      // 198: astore 12
      // 19a: aload 3
      // 19b: invokevirtual o3s$da6.f9x ()Ljava/lang/String;
      // 19e: astore 13
      // 1a0: aload 12
      // 1a2: iload 2
      // 1a3: ifeq 1c5
      // 1a6: ifnonnull 1c3
      // 1a9: goto 1b0
      // 1ac: invokestatic o3s$da6.a (Loov;)Loov;
      // 1af: athrow
      // 1b0: aload 13
      // 1b2: ifnull 1de
      // 1b5: goto 1bc
      // 1b8: invokestatic o3s$da6.a (Loov;)Loov;
      // 1bb: athrow
      // 1bc: goto 1d8
      // 1bf: invokestatic o3s$da6.a (Loov;)Loov;
      // 1c2: athrow
      // 1c3: aload 12
      // 1c5: aload 13
      // 1c7: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 1ca: iload 2
      // 1cb: ifeq 1df
      // 1ce: ifne 1de
      // 1d1: goto 1d8
      // 1d4: invokestatic o3s$da6.a (Loov;)Loov;
      // 1d7: athrow
      // 1d8: bipush 0
      // 1d9: ireturn
      // 1da: invokestatic o3s$da6.a (Loov;)Loov;
      // 1dd: athrow
      // 1de: bipush 1
      // 1df: ireturn
   }

   public boolean wdh(Object var1) {
      return var1 instanceof o3s$da6;
   }

   @Override
   public int hashCode() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 59
      // 02: istore 2
      // 03: bipush 1
      // 04: istore 3
      // 05: invokestatic t9d.b ()I
      // 08: aload 0
      // 09: invokevirtual o3s$da6.s93 ()Ljava/lang/String;
      // 0c: astore 4
      // 0e: istore 1
      // 0f: iload 3
      // 10: bipush 59
      // 12: imul
      // 13: aload 4
      // 15: iload 1
      // 16: ifeq 2e
      // 19: ifnonnull 2c
      // 1c: goto 23
      // 1f: invokestatic o3s$da6.a (Loov;)Loov;
      // 22: athrow
      // 23: bipush 43
      // 25: goto 31
      // 28: invokestatic o3s$da6.a (Loov;)Loov;
      // 2b: athrow
      // 2c: aload 4
      // 2e: invokevirtual java/lang/Object.hashCode ()I
      // 31: iadd
      // 32: istore 3
      // 33: aload 0
      // 34: invokevirtual o3s$da6.jkl ()Ljava/lang/String;
      // 37: astore 5
      // 39: iload 3
      // 3a: bipush 59
      // 3c: imul
      // 3d: aload 5
      // 3f: iload 1
      // 40: ifeq 58
      // 43: ifnonnull 56
      // 46: goto 4d
      // 49: invokestatic o3s$da6.a (Loov;)Loov;
      // 4c: athrow
      // 4d: bipush 43
      // 4f: goto 5b
      // 52: invokestatic o3s$da6.a (Loov;)Loov;
      // 55: athrow
      // 56: aload 5
      // 58: invokevirtual java/lang/Object.hashCode ()I
      // 5b: iadd
      // 5c: istore 3
      // 5d: aload 0
      // 5e: invokevirtual o3s$da6.y9e ()Ljava/lang/String;
      // 61: astore 6
      // 63: iload 3
      // 64: bipush 59
      // 66: imul
      // 67: aload 6
      // 69: iload 1
      // 6a: ifeq 82
      // 6d: ifnonnull 80
      // 70: goto 77
      // 73: invokestatic o3s$da6.a (Loov;)Loov;
      // 76: athrow
      // 77: bipush 43
      // 79: goto 85
      // 7c: invokestatic o3s$da6.a (Loov;)Loov;
      // 7f: athrow
      // 80: aload 6
      // 82: invokevirtual java/lang/Object.hashCode ()I
      // 85: iadd
      // 86: istore 3
      // 87: aload 0
      // 88: invokevirtual o3s$da6.bt5 ()Ljava/lang/String;
      // 8b: astore 7
      // 8d: iload 3
      // 8e: bipush 59
      // 90: imul
      // 91: aload 7
      // 93: iload 1
      // 94: ifeq ac
      // 97: ifnonnull aa
      // 9a: goto a1
      // 9d: invokestatic o3s$da6.a (Loov;)Loov;
      // a0: athrow
      // a1: bipush 43
      // a3: goto af
      // a6: invokestatic o3s$da6.a (Loov;)Loov;
      // a9: athrow
      // aa: aload 7
      // ac: invokevirtual java/lang/Object.hashCode ()I
      // af: iadd
      // b0: istore 3
      // b1: aload 0
      // b2: invokevirtual o3s$da6.f9x ()Ljava/lang/String;
      // b5: astore 8
      // b7: iload 3
      // b8: bipush 59
      // ba: imul
      // bb: aload 8
      // bd: iload 1
      // be: ifeq d6
      // c1: ifnonnull d4
      // c4: goto cb
      // c7: invokestatic o3s$da6.a (Loov;)Loov;
      // ca: athrow
      // cb: bipush 43
      // cd: goto d9
      // d0: invokestatic o3s$da6.a (Loov;)Loov;
      // d3: athrow
      // d4: aload 8
      // d6: invokevirtual java/lang/Object.hashCode ()I
      // d9: iadd
      // da: istore 3
      // db: iload 3
      // dc: ireturn
   }

   @Override
   public String toString() {
      long var1 = a ^ 91252969646225L;
      return a<"z">(15364, 8436016765156333822L ^ var1)
         + this.s93()
         + a<"z">(25476, 9057023012985096059L ^ var1)
         + this.jkl()
         + a<"z">(17903, 5901699454687633681L ^ var1)
         + this.y9e()
         + a<"z">(6626, 907708620357909791L ^ var1)
         + this.bt5()
         + a<"z">(31943, 7604320985182459963L ^ var1)
         + this.f9x()
         + ")";
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6994898573132606394L, 9200157798327368985L, MethodHandles.lookup().lookupClass()).a(28633381963910L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 68323429348388L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[5];
      int var7 = 0;
      String var6 = "Toÿ±üÔ\u0080%=nã¦Ï~\u007fÙ\rÙþª¿/øo\u0089úDÐô¤TÝ\u0018\u0093ï_²\u0099¬l\u0099e«\u009f\u001bÙ\u0001Ó¤mX¯\u0010«ê\u0017²\u0010³|Eµa]Ð#sä_ºé\u0094\u001bº";
      int var8 = "Toÿ±üÔ\u0080%=nã¦Ï~\u007fÙ\rÙþª¿/øo\u0089úDÐô¤TÝ\u0018\u0093ï_²\u0099¬l\u0099e«\u009f\u001bÙ\u0001Ó¤mX¯\u0010«ê\u0017²\u0010³|Eµa]Ð#sä_ºé\u0094\u001bº"
         .length();
      char var5 = ' ';
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
                     b = var9;
                     c = new String[5];
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

                  var6 = "Å\u001b\bùÀ\u0018n\u007fj½\u0010\u0099ã²\u008bEÑKÏÐÀ\u0093&78ãl°úÇ\u0096`Èwq¤$pþÄ5øÉOp2h\u00163¦\u001fóy7ª\u0010 \u001e¬\u0091¶^i+5f\u0089\u000f>Ä¥ó¨|\tøâÑ\u001bÊ%";
                  var8 = "Å\u001b\bùÀ\u0018n\u007fj½\u0010\u0099ã²\u008bEÑKÏÐÀ\u0093&78ãl°úÇ\u0096`Èwq¤$pþÄ5øÉOp2h\u00163¦\u001fóy7ª\u0010 \u001e¬\u0091¶^i+5f\u0089\u000f>Ä¥ó¨|\tøâÑ\u001bÊ%"
                     .length();
                  var5 = 24;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5849;
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
            throw new RuntimeException("o3s$da6", var10);
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
         throw new RuntimeException("o3s$da6" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
