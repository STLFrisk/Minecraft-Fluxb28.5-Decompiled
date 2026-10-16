import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class hgm implements ui9 {
   private static final long a;
   private static final String b;

   @Override
   public boolean mve(z0_ param1, OpaquePredicate param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 0
      // 01: istore 4
      // 03: invokestatic OpaquePredicate.b ()I
      // 06: aconst_null
      // 07: astore 5
      // 09: istore 3
      // 0a: bipush 0
      // 0b: istore 6
      // 0d: iload 6
      // 0f: aload 1
      // 10: invokevirtual z0_.opt ()I
      // 13: if_icmpge 9d
      // 16: aload 1
      // 17: iload 6
      // 19: invokevirtual z0_.ibn (I)Lerg;
      // 1c: astore 7
      // 1e: iload 3
      // 1f: ifeq 99
      // 22: aload 7
      // 24: iload 3
      // 25: ifeq 9f
      // 28: goto 2f
      // 2b: invokestatic hgm.a (Loov;)Loov;
      // 2e: athrow
      // 2f: ifnull 96
      // 32: goto 39
      // 35: invokestatic hgm.a (Loov;)Loov;
      // 38: athrow
      // 39: aload 7
      // 3b: invokevirtual erg.gn1 ()Lu7m;
      // 3e: getstatic xbr._h5 Lu7m;
      // 41: iload 3
      // 42: ifeq 8a
      // 45: goto 4c
      // 48: invokestatic hgm.a (Loov;)Loov;
      // 4b: athrow
      // 4c: if_acmpne 7b
      // 4f: goto 56
      // 52: invokestatic hgm.a (Loov;)Loov;
      // 55: athrow
      // 56: aload 5
      // 58: iload 3
      // 59: ifeq 75
      // 5c: goto 63
      // 5f: invokestatic hgm.a (Loov;)Loov;
      // 62: athrow
      // 63: ifnull 73
      // 66: goto 6d
      // 69: invokestatic hgm.a (Loov;)Loov;
      // 6c: athrow
      // 6d: bipush 0
      // 6e: ireturn
      // 6f: invokestatic hgm.a (Loov;)Loov;
      // 72: athrow
      // 73: aload 7
      // 75: astore 5
      // 77: iload 3
      // 78: ifne 96
      // 7b: aload 7
      // 7d: invokevirtual erg.gn1 ()Lu7m;
      // 80: getstatic xbr.u0_ Lu7m;
      // 83: goto 8a
      // 86: invokestatic hgm.a (Loov;)Loov;
      // 89: athrow
      // 8a: if_acmpeq 93
      // 8d: bipush 0
      // 8e: ireturn
      // 8f: invokestatic hgm.a (Loov;)Loov;
      // 92: athrow
      // 93: iinc 4 1
      // 96: iinc 6 1
      // 99: iload 3
      // 9a: ifne 0d
      // 9d: aload 5
      // 9f: ifnull bd
      // a2: iload 4
      // a4: iload 3
      // a5: ifeq ba
      // a8: goto af
      // ab: invokestatic hgm.a (Loov;)Loov;
      // ae: athrow
      // af: ifle bd
      // b2: goto b9
      // b5: invokestatic hgm.a (Loov;)Loov;
      // b8: athrow
      // b9: bipush 1
      // ba: goto be
      // bd: bipush 0
      // be: ireturn
   }

   @Override
   public erg hd0(z0_ param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic hgm.a J
      // 003: ldc2_w 41664308380248
      // 006: lxor
      // 007: lstore 2
      // 008: bipush 0
      // 009: istore 5
      // 00b: invokestatic OpaquePredicate.b ()I
      // 00e: aconst_null
      // 00f: astore 6
      // 011: istore 4
      // 013: bipush 0
      // 014: istore 7
      // 016: iload 7
      // 018: aload 1
      // 019: invokevirtual z0_.opt ()I
      // 01c: if_icmpge 0ac
      // 01f: aload 1
      // 020: iload 7
      // 022: invokevirtual z0_.ibn (I)Lerg;
      // 025: astore 8
      // 027: iload 4
      // 029: ifeq 0a7
      // 02c: aload 8
      // 02e: iload 4
      // 030: ifeq 0ae
      // 033: goto 03a
      // 036: invokestatic hgm.a (Loov;)Loov;
      // 039: athrow
      // 03a: ifnull 0a4
      // 03d: goto 044
      // 040: invokestatic hgm.a (Loov;)Loov;
      // 043: athrow
      // 044: aload 8
      // 046: invokevirtual erg.gn1 ()Lu7m;
      // 049: getstatic xbr._h5 Lu7m;
      // 04c: iload 4
      // 04e: ifeq 098
      // 051: goto 058
      // 054: invokestatic hgm.a (Loov;)Loov;
      // 057: athrow
      // 058: if_acmpne 089
      // 05b: goto 062
      // 05e: invokestatic hgm.a (Loov;)Loov;
      // 061: athrow
      // 062: aload 6
      // 064: iload 4
      // 066: ifeq 082
      // 069: goto 070
      // 06c: invokestatic hgm.a (Loov;)Loov;
      // 06f: athrow
      // 070: ifnull 080
      // 073: goto 07a
      // 076: invokestatic hgm.a (Loov;)Loov;
      // 079: athrow
      // 07a: aconst_null
      // 07b: areturn
      // 07c: invokestatic hgm.a (Loov;)Loov;
      // 07f: athrow
      // 080: aload 8
      // 082: astore 6
      // 084: iload 4
      // 086: ifne 0a4
      // 089: aload 8
      // 08b: invokevirtual erg.gn1 ()Lu7m;
      // 08e: getstatic xbr.u0_ Lu7m;
      // 091: goto 098
      // 094: invokestatic hgm.a (Loov;)Loov;
      // 097: athrow
      // 098: if_acmpeq 0a1
      // 09b: aconst_null
      // 09c: areturn
      // 09d: invokestatic hgm.a (Loov;)Loov;
      // 0a0: athrow
      // 0a1: iinc 5 1
      // 0a4: iinc 7 1
      // 0a7: iload 4
      // 0a9: ifne 016
      // 0ac: aload 6
      // 0ae: ifnull 147
      // 0b1: iload 5
      // 0b3: bipush 1
      // 0b4: iload 4
      // 0b6: ifeq 0e3
      // 0b9: goto 0c0
      // 0bc: invokestatic hgm.a (Loov;)Loov;
      // 0bf: athrow
      // 0c0: if_icmplt 147
      // 0c3: goto 0ca
      // 0c6: invokestatic hgm.a (Loov;)Loov;
      // 0c9: athrow
      // 0ca: aload 6
      // 0cc: iload 4
      // 0ce: ifeq 0f9
      // 0d1: goto 0d8
      // 0d4: invokestatic hgm.a (Loov;)Loov;
      // 0d7: athrow
      // 0d8: invokestatic gy5.fdj (Lerg;)I
      // 0db: bipush 2
      // 0dc: goto 0e3
      // 0df: invokestatic hgm.a (Loov;)Loov;
      // 0e2: athrow
      // 0e3: if_icmpge 147
      // 0e6: new erg
      // 0e9: dup
      // 0ea: getstatic xbr._h5 Lu7m;
      // 0ed: iload 5
      // 0ef: invokespecial erg.<init> (Lu7m;I)V
      // 0f2: goto 0f9
      // 0f5: invokestatic hgm.a (Loov;)Loov;
      // 0f8: athrow
      // 0f9: astore 7
      // 0fb: aload 7
      // 0fd: aload 6
      // 0ff: invokevirtual erg.zso ()Lbdo;
      // 102: invokevirtual bdo.h33 ()Lgdw;
      // 105: checkcast bdo
      // 108: invokevirtual erg.b67 (Lbdo;)V
      // 10b: aload 7
      // 10d: invokevirtual erg.zso ()Lbdo;
      // 110: getstatic hgm.b Ljava/lang/String;
      // 113: nop
      // 114: aload 6
      // 116: invokestatic gy5.fdj (Lerg;)I
      // 119: bipush 1
      // 11a: iadd
      // 11b: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 11e: aload 6
      // 120: iload 4
      // 122: ifeq 146
      // 125: invokevirtual erg.x4w ()Z
      // 128: ifeq 144
      // 12b: goto 132
      // 12e: invokestatic hgm.a (Loov;)Loov;
      // 131: athrow
      // 132: aload 7
      // 134: aload 6
      // 136: invokevirtual erg.zow ()Ljava/lang/String;
      // 139: invokevirtual erg.dou (Ljava/lang/String;)Lerg;
      // 13c: pop
      // 13d: goto 144
      // 140: invokestatic hgm.a (Loov;)Loov;
      // 143: athrow
      // 144: aload 7
      // 146: areturn
      // 147: aconst_null
      // 148: areturn
   }

   @Override
   public int hmy() {
      return 9;
   }

   @Override
   public erg oot() {
      return null;
   }

   @Override
   public erg[] qq2(z0_ param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: invokevirtual z0_.opt ()I
      // 04: anewarray 18
      // 07: astore 3
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: bipush 0
      // 0c: istore 4
      // 0e: istore 2
      // 0f: iload 4
      // 11: aload 3
      // 12: arraylength
      // 13: if_icmpge 5f
      // 16: aload 1
      // 17: iload 4
      // 19: invokevirtual z0_.ibn (I)Lerg;
      // 1c: astore 5
      // 1e: iload 2
      // 1f: ifne 5b
      // 22: aload 5
      // 24: ifnull 51
      // 27: goto 2e
      // 2a: invokestatic hgm.a (Loov;)Loov;
      // 2d: athrow
      // 2e: aload 5
      // 30: invokevirtual erg.gn1 ()Lu7m;
      // 33: instanceof gy5
      // 36: ifeq 51
      // 39: goto 40
      // 3c: invokestatic hgm.a (Loov;)Loov;
      // 3f: athrow
      // 40: aload 3
      // 41: iload 4
      // 43: aload 5
      // 45: aastore
      // 46: iload 2
      // 47: ifeq 5f
      // 4a: goto 51
      // 4d: invokestatic hgm.a (Loov;)Loov;
      // 50: athrow
      // 51: iinc 4 1
      // 54: goto 5b
      // 57: invokestatic hgm.a (Loov;)Loov;
      // 5a: athrow
      // 5b: iload 2
      // 5c: ifeq 0f
      // 5f: aload 3
      // 60: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3167836379046054022L, -439074642831072150L, MethodHandles.lookup().lookupClass()).a(66528461270190L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 82147608211119L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u00031æç×ïÍõË,\u008aÄB\u0080&Ä".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
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
