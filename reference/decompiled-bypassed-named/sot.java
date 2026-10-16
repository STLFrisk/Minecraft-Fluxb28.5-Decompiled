import java.util.LinkedList;

public class sot {
   public static LinkedList pem() {
      return n26;
   }

   static {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic c.g ()Ljava/lang/Object;
      // 003: monitorenter
      // 004: ldc2_w 8899517776132650420
      // 007: ldc2_w 3855421137197268360
      // 00a: invokestatic java/lang/invoke/MethodHandles.lookup ()Ljava/lang/invoke/MethodHandles$Lookup;
      // 00d: invokevirtual java/lang/invoke/MethodHandles$Lookup.lookupClass ()Ljava/lang/Class;
      // 010: invokestatic c.a (JJLjava/lang/Object;)La;
      // 013: ldc2_w 103742069580847
      // 016: invokeinterface a.a (J)J 3
      // 01b: invokestatic c.g ()Ljava/lang/Object;
      // 01e: monitorexit
      // 01f: ldc2_w 47639636713977
      // 022: lxor
      // 023: lstore 4
      // 025: ldc "DES/CBC/PKCS5Padding"
      // 027: invokestatic javax/crypto/Cipher.getInstance (Ljava/lang/String;)Ljavax/crypto/Cipher;
      // 02a: dup
      // 02b: astore 1
      // 02c: bipush 2
      // 02d: ldc "DES"
      // 02f: invokestatic javax/crypto/SecretKeyFactory.getInstance (Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;
      // 032: bipush 8
      // 034: newarray 8
      // 036: dup
      // 037: bipush 0
      // 038: lload 4
      // 03a: bipush 56
      // 03c: lushr
      // 03d: l2i
      // 03e: i2b
      // 03f: bastore
      // 040: bipush 1
      // 041: istore 2
      // 042: iload 2
      // 043: bipush 8
      // 045: if_icmpge 05d
      // 048: dup
      // 049: iload 2
      // 04a: lload 4
      // 04c: iload 2
      // 04d: bipush 8
      // 04f: imul
      // 050: lshl
      // 051: bipush 56
      // 053: lushr
      // 054: l2i
      // 055: i2b
      // 056: bastore
      // 057: iinc 2 1
      // 05a: goto 042
      // 05d: new javax/crypto/spec/DESKeySpec
      // 060: dup_x1
      // 061: swap
      // 062: invokespecial javax/crypto/spec/DESKeySpec.<init> ([B)V
      // 065: invokevirtual javax/crypto/SecretKeyFactory.generateSecret (Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
      // 068: new javax/crypto/spec/IvParameterSpec
      // 06b: dup
      // 06c: bipush 8
      // 06e: newarray 8
      // 070: invokespecial javax/crypto/spec/IvParameterSpec.<init> ([B)V
      // 073: invokevirtual javax/crypto/Cipher.init (ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
      // 076: ldc "\u0095D±I/ëT\u0090"
      // 078: bipush -1
      // 079: goto 080
      // 07c: astore 0
      // 07d: goto 098
      // 080: swap
      // 081: ldc "ISO-8859-1"
      // 083: invokevirtual java/lang/String.getBytes (Ljava/lang/String;)[B
      // 086: aload 1
      // 087: swap
      // 088: invokevirtual javax/crypto/Cipher.doFinal ([B)[B
      // 08b: astore 3
      // 08c: aload 3
      // 08d: invokestatic sot.a ([B)Ljava/lang/String;
      // 090: invokevirtual java/lang/String.intern ()Ljava/lang/String;
      // 093: swap
      // 094: pop
      // 095: goto 07c
      // 098: new java/util/LinkedList
      // 09b: dup
      // 09c: invokespecial java/util/LinkedList.<init> ()V
      // 09f: putstatic sot.n26 Ljava/util/LinkedList;
      // 0a2: bipush 0
      // 0a3: putstatic sot.j4s I
      // 0a6: ldc us/myles/ViaVersion/api/protocol/ProtocolVersion
      // 0a8: nop
      // 0a9: invokevirtual java/lang/Class.getDeclaredFields ()[Ljava/lang/reflect/Field;
      // 0ac: astore 6
      // 0ae: aload 6
      // 0b0: arraylength
      // 0b1: istore 7
      // 0b3: bipush 0
      // 0b4: istore 8
      // 0b6: iload 8
      // 0b8: iload 7
      // 0ba: if_icmpge 121
      // 0bd: aload 6
      // 0bf: iload 8
      // 0c1: aaload
      // 0c2: astore 9
      // 0c4: aload 9
      // 0c6: invokevirtual java/lang/reflect/Field.getType ()Ljava/lang/Class;
      // 0c9: ldc us/myles/ViaVersion/api/protocol/ProtocolVersion
      // 0cb: nop
      // 0cc: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 0cf: ifeq 11b
      // 0d2: getstatic sot.j4s I
      // 0d5: bipush 1
      // 0d6: iadd
      // 0d7: putstatic sot.j4s I
      // 0da: aload 9
      // 0dc: aconst_null
      // 0dd: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0e0: checkcast us/myles/ViaVersion/api/protocol/ProtocolVersion
      // 0e3: astore 10
      // 0e5: getstatic sot.j4s I
      // 0e8: bipush 8
      // 0ea: if_icmplt 111
      // 0ed: aload 10
      // 0ef: invokevirtual us/myles/ViaVersion/api/protocol/ProtocolVersion.getName ()Ljava/lang/String;
      // 0f2: aload 0
      // 0f3: nop
      // 0f4: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0f7: ifne 111
      // 0fa: goto 101
      // 0fd: invokestatic sot.a (Ljava/lang/IllegalAccessException;)Ljava/lang/IllegalAccessException;
      // 100: athrow
      // 101: invokestatic sot.pem ()Ljava/util/LinkedList;
      // 104: aload 10
      // 106: invokevirtual java/util/LinkedList.add (Ljava/lang/Object;)Z
      // 109: pop
      // 10a: goto 111
      // 10d: invokestatic sot.a (Ljava/lang/IllegalAccessException;)Ljava/lang/IllegalAccessException;
      // 110: athrow
      // 111: goto 11b
      // 114: astore 10
      // 116: aload 10
      // 118: invokevirtual java/lang/IllegalAccessException.printStackTrace ()V
      // 11b: iinc 8 1
      // 11e: goto 0b6
      // 121: invokestatic sot.pem ()Ljava/util/LinkedList;
      // 124: invokestatic java/util/Collections.reverse (Ljava/util/List;)V
      // 127: return
   }

   private static IllegalAccessException a(IllegalAccessException var0) {
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
