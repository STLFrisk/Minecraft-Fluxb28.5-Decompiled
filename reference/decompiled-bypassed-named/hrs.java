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

public class hrs {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public hrs(String var1) {
      this.zbd = var1;
   }

   public String thb() {
      return this.zbd;
   }

   public List fcq() {
      return this.qdu;
   }

   public List v35() {
      return this.a8b;
   }

   public HashMap rww() {
      return this.wyc;
   }

   public List zgp() {
      return this.fs8;
   }

   public void as_(String var1) {
      this.zbd = var1;
   }

   public void m1p(List var1) {
      this.qdu = var1;
   }

   public void dbe(List var1) {
      this.a8b = var1;
   }

   public void _hf(HashMap var1) {
      this.wyc = var1;
   }

   public void t4t(List var1) {
      this.fs8 = var1;
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
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 2
      // 004: aload 1
      // 005: iload 2
      // 006: ifne 01b
      // 009: aload 0
      // 00a: if_acmpne 01a
      // 00d: goto 014
      // 010: invokestatic hrs.a (Loov;)Loov;
      // 013: athrow
      // 014: bipush 1
      // 015: ireturn
      // 016: invokestatic hrs.a (Loov;)Loov;
      // 019: athrow
      // 01a: aload 1
      // 01b: iload 2
      // 01c: ifne 033
      // 01f: instanceof hrs
      // 022: ifne 032
      // 025: goto 02c
      // 028: invokestatic hrs.a (Loov;)Loov;
      // 02b: athrow
      // 02c: bipush 0
      // 02d: ireturn
      // 02e: invokestatic hrs.a (Loov;)Loov;
      // 031: athrow
      // 032: aload 1
      // 033: checkcast hrs
      // 036: astore 3
      // 037: aload 3
      // 038: iload 2
      // 039: ifne 051
      // 03c: aload 0
      // 03d: invokevirtual hrs.p34 (Ljava/lang/Object;)Z
      // 040: ifne 050
      // 043: goto 04a
      // 046: invokestatic hrs.a (Loov;)Loov;
      // 049: athrow
      // 04a: bipush 0
      // 04b: ireturn
      // 04c: invokestatic hrs.a (Loov;)Loov;
      // 04f: athrow
      // 050: aload 0
      // 051: invokevirtual hrs.thb ()Ljava/lang/String;
      // 054: astore 4
      // 056: aload 3
      // 057: invokevirtual hrs.thb ()Ljava/lang/String;
      // 05a: astore 5
      // 05c: aload 4
      // 05e: iload 2
      // 05f: ifne 081
      // 062: ifnonnull 07f
      // 065: goto 06c
      // 068: invokestatic hrs.a (Loov;)Loov;
      // 06b: athrow
      // 06c: aload 5
      // 06e: ifnull 096
      // 071: goto 078
      // 074: invokestatic hrs.a (Loov;)Loov;
      // 077: athrow
      // 078: goto 094
      // 07b: invokestatic hrs.a (Loov;)Loov;
      // 07e: athrow
      // 07f: aload 4
      // 081: aload 5
      // 083: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 086: iload 2
      // 087: ifne 095
      // 08a: ifne 096
      // 08d: goto 094
      // 090: invokestatic hrs.a (Loov;)Loov;
      // 093: athrow
      // 094: bipush 0
      // 095: ireturn
      // 096: aload 0
      // 097: invokevirtual hrs.fcq ()Ljava/util/List;
      // 09a: astore 6
      // 09c: aload 3
      // 09d: invokevirtual hrs.fcq ()Ljava/util/List;
      // 0a0: astore 7
      // 0a2: aload 6
      // 0a4: iload 2
      // 0a5: ifne 0ce
      // 0a8: ifnonnull 0cc
      // 0ab: goto 0b2
      // 0ae: invokestatic hrs.a (Loov;)Loov;
      // 0b1: athrow
      // 0b2: aload 7
      // 0b4: iload 2
      // 0b5: ifne 0eb
      // 0b8: goto 0bf
      // 0bb: invokestatic hrs.a (Loov;)Loov;
      // 0be: athrow
      // 0bf: ifnull 0e7
      // 0c2: goto 0c9
      // 0c5: invokestatic hrs.a (Loov;)Loov;
      // 0c8: athrow
      // 0c9: goto 0e1
      // 0cc: aload 6
      // 0ce: iload 2
      // 0cf: ifne 0eb
      // 0d2: aload 7
      // 0d4: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 0d7: ifne 0e7
      // 0da: goto 0e1
      // 0dd: invokestatic hrs.a (Loov;)Loov;
      // 0e0: athrow
      // 0e1: bipush 0
      // 0e2: ireturn
      // 0e3: invokestatic hrs.a (Loov;)Loov;
      // 0e6: athrow
      // 0e7: aload 0
      // 0e8: invokevirtual hrs.v35 ()Ljava/util/List;
      // 0eb: astore 8
      // 0ed: aload 3
      // 0ee: invokevirtual hrs.v35 ()Ljava/util/List;
      // 0f1: astore 9
      // 0f3: aload 8
      // 0f5: iload 2
      // 0f6: ifne 118
      // 0f9: ifnonnull 116
      // 0fc: goto 103
      // 0ff: invokestatic hrs.a (Loov;)Loov;
      // 102: athrow
      // 103: aload 9
      // 105: ifnull 12d
      // 108: goto 10f
      // 10b: invokestatic hrs.a (Loov;)Loov;
      // 10e: athrow
      // 10f: goto 12b
      // 112: invokestatic hrs.a (Loov;)Loov;
      // 115: athrow
      // 116: aload 8
      // 118: aload 9
      // 11a: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 11d: iload 2
      // 11e: ifne 12c
      // 121: ifne 12d
      // 124: goto 12b
      // 127: invokestatic hrs.a (Loov;)Loov;
      // 12a: athrow
      // 12b: bipush 0
      // 12c: ireturn
      // 12d: aload 0
      // 12e: invokevirtual hrs.rww ()Ljava/util/HashMap;
      // 131: astore 10
      // 133: aload 3
      // 134: invokevirtual hrs.rww ()Ljava/util/HashMap;
      // 137: astore 11
      // 139: aload 10
      // 13b: iload 2
      // 13c: ifne 15e
      // 13f: ifnonnull 15c
      // 142: goto 149
      // 145: invokestatic hrs.a (Loov;)Loov;
      // 148: athrow
      // 149: aload 11
      // 14b: ifnull 173
      // 14e: goto 155
      // 151: invokestatic hrs.a (Loov;)Loov;
      // 154: athrow
      // 155: goto 171
      // 158: invokestatic hrs.a (Loov;)Loov;
      // 15b: athrow
      // 15c: aload 10
      // 15e: aload 11
      // 160: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 163: iload 2
      // 164: ifne 172
      // 167: ifne 173
      // 16a: goto 171
      // 16d: invokestatic hrs.a (Loov;)Loov;
      // 170: athrow
      // 171: bipush 0
      // 172: ireturn
      // 173: aload 0
      // 174: invokevirtual hrs.zgp ()Ljava/util/List;
      // 177: astore 12
      // 179: aload 3
      // 17a: invokevirtual hrs.zgp ()Ljava/util/List;
      // 17d: astore 13
      // 17f: aload 12
      // 181: iload 2
      // 182: ifne 1a4
      // 185: ifnonnull 1a2
      // 188: goto 18f
      // 18b: invokestatic hrs.a (Loov;)Loov;
      // 18e: athrow
      // 18f: aload 13
      // 191: ifnull 1bd
      // 194: goto 19b
      // 197: invokestatic hrs.a (Loov;)Loov;
      // 19a: athrow
      // 19b: goto 1b7
      // 19e: invokestatic hrs.a (Loov;)Loov;
      // 1a1: athrow
      // 1a2: aload 12
      // 1a4: aload 13
      // 1a6: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 1a9: iload 2
      // 1aa: ifne 1be
      // 1ad: ifne 1bd
      // 1b0: goto 1b7
      // 1b3: invokestatic hrs.a (Loov;)Loov;
      // 1b6: athrow
      // 1b7: bipush 0
      // 1b8: ireturn
      // 1b9: invokestatic hrs.a (Loov;)Loov;
      // 1bc: athrow
      // 1bd: bipush 1
      // 1be: ireturn
   }

   public boolean p34(Object var1) {
      return var1 instanceof hrs;
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
      // 05: invokestatic OpaquePredicate.c ()I
      // 08: aload 0
      // 09: invokevirtual hrs.thb ()Ljava/lang/String;
      // 0c: astore 4
      // 0e: istore 1
      // 0f: iload 3
      // 10: bipush 59
      // 12: imul
      // 13: aload 4
      // 15: iload 1
      // 16: ifne 2e
      // 19: ifnonnull 2c
      // 1c: goto 23
      // 1f: invokestatic hrs.a (Loov;)Loov;
      // 22: athrow
      // 23: bipush 43
      // 25: goto 31
      // 28: invokestatic hrs.a (Loov;)Loov;
      // 2b: athrow
      // 2c: aload 4
      // 2e: invokevirtual java/lang/Object.hashCode ()I
      // 31: iadd
      // 32: istore 3
      // 33: aload 0
      // 34: invokevirtual hrs.fcq ()Ljava/util/List;
      // 37: astore 5
      // 39: iload 3
      // 3a: bipush 59
      // 3c: imul
      // 3d: aload 5
      // 3f: iload 1
      // 40: ifne 58
      // 43: ifnonnull 56
      // 46: goto 4d
      // 49: invokestatic hrs.a (Loov;)Loov;
      // 4c: athrow
      // 4d: bipush 43
      // 4f: goto 5b
      // 52: invokestatic hrs.a (Loov;)Loov;
      // 55: athrow
      // 56: aload 5
      // 58: invokevirtual java/lang/Object.hashCode ()I
      // 5b: iadd
      // 5c: istore 3
      // 5d: aload 0
      // 5e: invokevirtual hrs.v35 ()Ljava/util/List;
      // 61: astore 6
      // 63: iload 3
      // 64: bipush 59
      // 66: imul
      // 67: aload 6
      // 69: iload 1
      // 6a: ifne 82
      // 6d: ifnonnull 80
      // 70: goto 77
      // 73: invokestatic hrs.a (Loov;)Loov;
      // 76: athrow
      // 77: bipush 43
      // 79: goto 85
      // 7c: invokestatic hrs.a (Loov;)Loov;
      // 7f: athrow
      // 80: aload 6
      // 82: invokevirtual java/lang/Object.hashCode ()I
      // 85: iadd
      // 86: istore 3
      // 87: aload 0
      // 88: invokevirtual hrs.rww ()Ljava/util/HashMap;
      // 8b: astore 7
      // 8d: iload 3
      // 8e: bipush 59
      // 90: imul
      // 91: aload 7
      // 93: iload 1
      // 94: ifne ac
      // 97: ifnonnull aa
      // 9a: goto a1
      // 9d: invokestatic hrs.a (Loov;)Loov;
      // a0: athrow
      // a1: bipush 43
      // a3: goto af
      // a6: invokestatic hrs.a (Loov;)Loov;
      // a9: athrow
      // aa: aload 7
      // ac: invokevirtual java/lang/Object.hashCode ()I
      // af: iadd
      // b0: istore 3
      // b1: aload 0
      // b2: invokevirtual hrs.zgp ()Ljava/util/List;
      // b5: astore 8
      // b7: iload 3
      // b8: bipush 59
      // ba: imul
      // bb: aload 8
      // bd: iload 1
      // be: ifne d6
      // c1: ifnonnull d4
      // c4: goto cb
      // c7: invokestatic hrs.a (Loov;)Loov;
      // ca: athrow
      // cb: bipush 43
      // cd: goto d9
      // d0: invokestatic hrs.a (Loov;)Loov;
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
      long var1 = a ^ 94394434200735L;
      return a<"v">(26855, 1934262148133210308L ^ var1)
         + this.thb()
         + a<"v">(20114, 6285312003432476342L ^ var1)
         + this.fcq()
         + a<"v">(15406, 6608340712943524873L ^ var1)
         + this.v35()
         + a<"v">(26580, 830856727373203442L ^ var1)
         + this.rww()
         + a<"v">(17495, 5546189283013780594L ^ var1)
         + this.zgp()
         + ")";
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3540679943585590044L, -4109227731014515549L, MethodHandles.lookup().lookupClass()).a(220535079985834L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 88744634841780L;
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
      String var6 = ",TÏz\u0085=q>\u0082g\fY@4\u0081P~\u009bRä\u0086\u0088Ód\u0018½÷¤TÅ«`ÔË¿rÖáC+µ(\u009a6kè\u0005\u0006>\u0018A\u009e±\u0080\u0096%\u0097\u0002u\u009crÎõ\u0006A»ØP\u000bR\u0007¡Ñ7";
      int var8 = ",TÏz\u0085=q>\u0082g\fY@4\u0081P~\u009bRä\u0086\u0088Ód\u0018½÷¤TÅ«`ÔË¿rÖáC+µ(\u009a6kè\u0005\u0006>\u0018A\u009e±\u0080\u0096%\u0097\u0002u\u009crÎõ\u0006A»ØP\u000bR\u0007¡Ñ7"
         .length();
      char var5 = 24;
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

                  var6 = "s\u009f\u0088rÂà%j\u0093)\u008b\u0091^æß\u007f\u000f3\u0005dÓTGá\u0007$SM0¼D¯<ØS\u008cã2y\u0084Y]\u008dËÖ%÷* ¦¾Ô\u000b5\u0093\u0019î\u0087¼âf\u008e\u001aêç\u00179ÎìH\u0011eö\u0082\u001d³\u009cKy\u009e,";
                  var8 = "s\u009f\u0088rÂà%j\u0093)\u008b\u0091^æß\u007f\u000f3\u0005dÓTGá\u0007$SM0¼D¯<ØS\u008cã2y\u0084Y]\u008dËÖ%÷* ¦¾Ô\u000b5\u0093\u0019î\u0087¼âf\u008e\u001aêç\u00179ÎìH\u0011eö\u0082\u001d³\u009cKy\u009e,"
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9168;
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
            throw new RuntimeException("hrs", var10);
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
         throw new RuntimeException("hrs" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
