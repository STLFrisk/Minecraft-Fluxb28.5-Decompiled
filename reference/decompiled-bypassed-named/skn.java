import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class skn extends ArrayList {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public skn() {
   }

   public skn(bdo var1) {
      this.qkf(var1);
   }

   public xxb gvw(erg param1, erg param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 4
      // 005: iload 3
      // 006: iload 4
      // 008: ifeq 107
      // 00b: ifle 106
      // 00e: goto 015
      // 011: invokestatic skn.a (Loov;)Loov;
      // 014: athrow
      // 015: iload 3
      // 016: iload 4
      // 018: ifeq 107
      // 01b: goto 022
      // 01e: invokestatic skn.a (Loov;)Loov;
      // 021: athrow
      // 022: aload 0
      // 023: invokevirtual skn.size ()I
      // 026: if_icmpge 106
      // 029: goto 030
      // 02c: invokestatic skn.a (Loov;)Loov;
      // 02f: athrow
      // 030: aload 0
      // 031: iload 3
      // 032: invokevirtual skn.get (I)Ljava/lang/Object;
      // 035: checkcast xxb
      // 038: astore 5
      // 03a: aload 0
      // 03b: aload 1
      // 03c: aload 5
      // 03e: invokevirtual xxb.k2s ()Lerg;
      // 041: invokespecial skn.jzz (Lerg;Lerg;)Z
      // 044: ifeq 0fb
      // 047: aload 2
      // 048: ifnonnull 06d
      // 04b: goto 052
      // 04e: invokestatic skn.a (Loov;)Loov;
      // 051: athrow
      // 052: aload 5
      // 054: invokevirtual xxb.kqm ()Z
      // 057: iload 4
      // 059: ifeq 0b3
      // 05c: goto 063
      // 05f: invokestatic skn.a (Loov;)Loov;
      // 062: athrow
      // 063: ifeq 0a8
      // 066: goto 06d
      // 069: invokestatic skn.a (Loov;)Loov;
      // 06c: athrow
      // 06d: aload 5
      // 06f: invokevirtual xxb.kqm ()Z
      // 072: iload 4
      // 074: ifeq 099
      // 077: goto 07e
      // 07a: invokestatic skn.a (Loov;)Loov;
      // 07d: athrow
      // 07e: ifeq 0fb
      // 081: goto 088
      // 084: invokestatic skn.a (Loov;)Loov;
      // 087: athrow
      // 088: aload 0
      // 089: aload 2
      // 08a: aload 5
      // 08c: invokevirtual xxb.ha2 ()Lerg;
      // 08f: invokespecial skn.jzz (Lerg;Lerg;)Z
      // 092: goto 099
      // 095: invokestatic skn.a (Loov;)Loov;
      // 098: athrow
      // 099: iload 4
      // 09b: ifeq 0b3
      // 09e: ifeq 0fb
      // 0a1: goto 0a8
      // 0a4: invokestatic skn.a (Loov;)Loov;
      // 0a7: athrow
      // 0a8: aload 1
      // 0a9: getfield erg.qd2 I
      // 0ac: goto 0b3
      // 0af: invokestatic skn.a (Loov;)Loov;
      // 0b2: athrow
      // 0b3: iload 4
      // 0b5: ifeq 0d6
      // 0b8: aload 5
      // 0ba: invokevirtual xxb.k2s ()Lerg;
      // 0bd: getfield erg.qd2 I
      // 0c0: if_icmplt 0fb
      // 0c3: goto 0ca
      // 0c6: invokestatic skn.a (Loov;)Loov;
      // 0c9: athrow
      // 0ca: aload 5
      // 0cc: invokevirtual xxb.kqm ()Z
      // 0cf: goto 0d6
      // 0d2: invokestatic skn.a (Loov;)Loov;
      // 0d5: athrow
      // 0d6: iload 4
      // 0d8: ifeq 0f0
      // 0db: ifeq 103
      // 0de: goto 0e5
      // 0e1: invokestatic skn.a (Loov;)Loov;
      // 0e4: athrow
      // 0e5: aload 2
      // 0e6: getfield erg.qd2 I
      // 0e9: goto 0f0
      // 0ec: invokestatic skn.a (Loov;)Loov;
      // 0ef: athrow
      // 0f0: aload 5
      // 0f2: invokevirtual xxb.ha2 ()Lerg;
      // 0f5: getfield erg.qd2 I
      // 0f8: if_icmpge 103
      // 0fb: aconst_null
      // 0fc: goto 105
      // 0ff: invokestatic skn.a (Loov;)Loov;
      // 102: athrow
      // 103: aload 5
      // 105: areturn
      // 106: bipush 0
      // 107: istore 5
      // 109: iload 5
      // 10b: aload 0
      // 10c: invokevirtual skn.size ()I
      // 10f: if_icmpge 1de
      // 112: aload 0
      // 113: iload 5
      // 115: invokevirtual skn.get (I)Ljava/lang/Object;
      // 118: checkcast xxb
      // 11b: astore 6
      // 11d: iload 4
      // 11f: ifeq 1d9
      // 122: aload 0
      // 123: aload 1
      // 124: aload 6
      // 126: invokevirtual xxb.k2s ()Lerg;
      // 129: invokespecial skn.jzz (Lerg;Lerg;)Z
      // 12c: ifeq 1d6
      // 12f: goto 136
      // 132: invokestatic skn.a (Loov;)Loov;
      // 135: athrow
      // 136: aload 1
      // 137: getfield erg.qd2 I
      // 13a: iload 4
      // 13c: ifeq 164
      // 13f: goto 146
      // 142: invokestatic skn.a (Loov;)Loov;
      // 145: athrow
      // 146: aload 6
      // 148: invokevirtual xxb.k2s ()Lerg;
      // 14b: getfield erg.qd2 I
      // 14e: if_icmplt 1d6
      // 151: goto 158
      // 154: invokestatic skn.a (Loov;)Loov;
      // 157: athrow
      // 158: aload 6
      // 15a: invokevirtual xxb.kqm ()Z
      // 15d: goto 164
      // 160: invokestatic skn.a (Loov;)Loov;
      // 163: athrow
      // 164: iload 4
      // 166: ifeq 18a
      // 169: ifne 17e
      // 16c: goto 173
      // 16f: invokestatic skn.a (Loov;)Loov;
      // 172: athrow
      // 173: aload 2
      // 174: ifnull 1cf
      // 177: goto 17e
      // 17a: invokestatic skn.a (Loov;)Loov;
      // 17d: athrow
      // 17e: aload 6
      // 180: invokevirtual xxb.kqm ()Z
      // 183: goto 18a
      // 186: invokestatic skn.a (Loov;)Loov;
      // 189: athrow
      // 18a: iload 4
      // 18c: ifeq 1aa
      // 18f: ifeq 1d6
      // 192: goto 199
      // 195: invokestatic skn.a (Loov;)Loov;
      // 198: athrow
      // 199: aload 0
      // 19a: aload 2
      // 19b: aload 6
      // 19d: invokevirtual xxb.ha2 ()Lerg;
      // 1a0: invokespecial skn.jzz (Lerg;Lerg;)Z
      // 1a3: goto 1aa
      // 1a6: invokestatic skn.a (Loov;)Loov;
      // 1a9: athrow
      // 1aa: iload 4
      // 1ac: ifeq 1c4
      // 1af: ifeq 1d6
      // 1b2: goto 1b9
      // 1b5: invokestatic skn.a (Loov;)Loov;
      // 1b8: athrow
      // 1b9: aload 2
      // 1ba: getfield erg.qd2 I
      // 1bd: goto 1c4
      // 1c0: invokestatic skn.a (Loov;)Loov;
      // 1c3: athrow
      // 1c4: aload 6
      // 1c6: invokevirtual xxb.ha2 ()Lerg;
      // 1c9: getfield erg.qd2 I
      // 1cc: if_icmplt 1d6
      // 1cf: aload 6
      // 1d1: areturn
      // 1d2: invokestatic skn.a (Loov;)Loov;
      // 1d5: athrow
      // 1d6: iinc 5 1
      // 1d9: iload 4
      // 1db: ifne 109
      // 1de: aconst_null
      // 1df: areturn
   }

   private boolean jzz(erg param1, erg param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: aload 1
      // 05: aload 2
      // 06: invokestatic erg.fl9 (Lerg;Lerg;)Z
      // 09: iload 3
      // 0a: ifne 22
      // 0d: ifeq 6e
      // 10: goto 17
      // 13: invokestatic skn.a (Loov;)Loov;
      // 16: athrow
      // 17: aload 2
      // 18: invokevirtual erg.w8b ()Z
      // 1b: goto 22
      // 1e: invokestatic skn.a (Loov;)Loov;
      // 21: athrow
      // 22: iload 3
      // 23: ifne 6b
      // 26: ifeq 6a
      // 29: goto 30
      // 2c: invokestatic skn.a (Loov;)Loov;
      // 2f: athrow
      // 30: aload 1
      // 31: invokevirtual erg.w8b ()Z
      // 34: iload 3
      // 35: ifne 5c
      // 38: goto 3f
      // 3b: invokestatic skn.a (Loov;)Loov;
      // 3e: athrow
      // 3f: ifeq 6e
      // 42: goto 49
      // 45: invokestatic skn.a (Loov;)Loov;
      // 48: athrow
      // 49: aload 2
      // 4a: invokevirtual erg.zso ()Lbdo;
      // 4d: aload 1
      // 4e: invokevirtual erg.zso ()Lbdo;
      // 51: bipush 0
      // 52: invokestatic j44.z3c (Lgdw;Lgdw;Z)Z
      // 55: goto 5c
      // 58: invokestatic skn.a (Loov;)Loov;
      // 5b: athrow
      // 5c: iload 3
      // 5d: ifne 6b
      // 60: ifeq 6e
      // 63: goto 6a
      // 66: invokestatic skn.a (Loov;)Loov;
      // 69: athrow
      // 6a: bipush 1
      // 6b: goto 6f
      // 6e: bipush 0
      // 6f: ireturn
   }

   public void njj(nfj param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: aload 0
      // 02: invokevirtual skn.size ()I
      // 05: sipush 255
      // 08: iand
      // 09: i2b
      // 0a: invokevirtual nfj.writeByte (I)Lio/netty/buffer/ByteBuf;
      // 0d: pop
      // 0e: invokestatic OpaquePredicate.c ()I
      // 11: bipush 0
      // 12: istore 3
      // 13: istore 2
      // 14: iload 3
      // 15: aload 0
      // 16: invokevirtual skn.size ()I
      // 19: if_icmpge 94
      // 1c: aload 0
      // 1d: iload 3
      // 1e: invokevirtual skn.get (I)Ljava/lang/Object;
      // 21: checkcast xxb
      // 24: astore 4
      // 26: aload 1
      // 27: aload 4
      // 29: invokevirtual xxb.k2s ()Lerg;
      // 2c: invokevirtual nfj.a6a (Lerg;)V
      // 2f: aload 1
      // 30: aload 4
      // 32: invokevirtual xxb.fjy ()Lerg;
      // 35: invokevirtual nfj.a6a (Lerg;)V
      // 38: aload 4
      // 3a: invokevirtual xxb.ha2 ()Lerg;
      // 3d: astore 5
      // 3f: aload 1
      // 40: aload 5
      // 42: ifnull 4d
      // 45: bipush 1
      // 46: goto 4e
      // 49: invokestatic skn.a (Loov;)Loov;
      // 4c: athrow
      // 4d: bipush 0
      // 4e: invokevirtual nfj.writeBoolean (Z)Lio/netty/buffer/ByteBuf;
      // 51: pop
      // 52: iload 2
      // 53: ifne 90
      // 56: aload 5
      // 58: ifnull 6f
      // 5b: goto 62
      // 5e: invokestatic skn.a (Loov;)Loov;
      // 61: athrow
      // 62: aload 1
      // 63: aload 5
      // 65: invokevirtual nfj.a6a (Lerg;)V
      // 68: goto 6f
      // 6b: invokestatic skn.a (Loov;)Loov;
      // 6e: athrow
      // 6f: aload 1
      // 70: aload 4
      // 72: invokevirtual xxb.f_e ()Z
      // 75: invokevirtual nfj.writeBoolean (Z)Lio/netty/buffer/ByteBuf;
      // 78: pop
      // 79: aload 1
      // 7a: aload 4
      // 7c: invokevirtual xxb.iev ()I
      // 7f: invokevirtual nfj.writeInt (I)Lio/netty/buffer/ByteBuf;
      // 82: pop
      // 83: aload 1
      // 84: aload 4
      // 86: invokevirtual xxb.xll ()I
      // 89: invokevirtual nfj.writeInt (I)Lio/netty/buffer/ByteBuf;
      // 8c: pop
      // 8d: iinc 3 1
      // 90: iload 2
      // 91: ifeq 14
      // 94: return
   }

   public static skn nw5(nfj param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: new skn
      // 03: dup
      // 04: invokespecial skn.<init> ()V
      // 07: astore 2
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: aload 0
      // 0c: invokevirtual nfj.readByte ()B
      // 0f: sipush 255
      // 12: iand
      // 13: istore 3
      // 14: istore 1
      // 15: bipush 0
      // 16: istore 4
      // 18: iload 4
      // 1a: iload 3
      // 1b: if_icmpge 9b
      // 1e: aload 0
      // 1f: invokevirtual nfj.x4d ()Lerg;
      // 22: astore 5
      // 24: aload 0
      // 25: invokevirtual nfj.x4d ()Lerg;
      // 28: astore 6
      // 2a: aconst_null
      // 2b: astore 7
      // 2d: aload 0
      // 2e: iload 1
      // 2f: ifeq 47
      // 32: invokevirtual nfj.readBoolean ()Z
      // 35: ifeq 4c
      // 38: goto 3f
      // 3b: invokestatic skn.a (Loov;)Loov;
      // 3e: athrow
      // 3f: aload 0
      // 40: goto 47
      // 43: invokestatic skn.a (Loov;)Loov;
      // 46: athrow
      // 47: invokevirtual nfj.x4d ()Lerg;
      // 4a: astore 7
      // 4c: aload 0
      // 4d: invokevirtual nfj.readBoolean ()Z
      // 50: istore 8
      // 52: aload 0
      // 53: invokevirtual nfj.readInt ()I
      // 56: istore 9
      // 58: aload 0
      // 59: invokevirtual nfj.readInt ()I
      // 5c: istore 10
      // 5e: new xxb
      // 61: dup
      // 62: aload 5
      // 64: aload 7
      // 66: aload 6
      // 68: iload 9
      // 6a: iload 10
      // 6c: invokespecial xxb.<init> (Lerg;Lerg;Lerg;II)V
      // 6f: astore 11
      // 71: iload 8
      // 73: iload 1
      // 74: ifeq 93
      // 77: ifeq 8d
      // 7a: goto 81
      // 7d: invokestatic skn.a (Loov;)Loov;
      // 80: athrow
      // 81: aload 11
      // 83: invokevirtual xxb.gbc ()V
      // 86: goto 8d
      // 89: invokestatic skn.a (Loov;)Loov;
      // 8c: athrow
      // 8d: aload 2
      // 8e: aload 11
      // 90: invokevirtual skn.add (Ljava/lang/Object;)Z
      // 93: pop
      // 94: iinc 4 1
      // 97: iload 1
      // 98: ifne 18
      // 9b: aload 2
      // 9c: areturn
   }

   public void qkf(bdo var1) {
      long var2 = a ^ 132628569731758L;
      qhg var5 = var1.bzb(a<"m">(11079, 7508871580841586828L ^ var2), 10);
      int var10000 = OpaquePredicate.b();
      int var6 = 0;
      int var4 = var10000;

      while (var6 < var5.vek()) {
         bdo var7 = var5.kd6(var6);
         this.add(new xxb(var7));
         var6++;
         if (var4 == 0) {
            break;
         }
      }
   }

   public bdo dmw() {
      long var1 = a ^ 117692126365175L;
      bdo var4 = new bdo();
      int var10000 = OpaquePredicate.b();
      qhg var5 = new qhg();
      int var3 = var10000;
      int var6 = 0;

      while (true) {
         if (var6 < this.size()) {
            xxb var7 = (xxb)this.get(var6);

            try {
               var5.w2j(var7._gk());
               var6++;
               if (var3 == 0) {
                  break;
               }

               if (var3 != 0) {
                  continue;
               }
            } catch (oov var8) {
               throw a(var8);
            }
         }

         var4.rzm(a<"m">(17243, 6258393726699761608L ^ var1), var5);
         break;
      }

      return var4;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(8164038707675104279L, -4676629259585034135L, MethodHandles.lookup().lookupClass()).a(173267007981063L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 76908784344128L;
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
      String var6 = "ü¢÷/4«\u0097:È\u007f\u0082P©\u0019Mþ\u0010/Ø\u0092@.\u0014ì04\r7Ý\b\u0083®¡";
      int var8 = "ü¢÷/4«\u0097:È\u007f\u0082P©\u0019Mþ\u0010/Ø\u0092@.\u0014ì04\r7Ý\b\u0083®¡".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[2];
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 17066;
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
            throw new RuntimeException("skn", var10);
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
         throw new RuntimeException("skn" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
