import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class q1h$_7g extends cjm {
   private q1h z14;
   private int nid;
   private static final long a;
   private static final String b;

   public q1h$_7g(q1h var1) {
      this.z14 = var1;
   }

   public void uyh() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 1e
      // 09: getfield q1h$_7g.nid I
      // 0c: ifne 23
      // 0f: goto 16
      // 12: invokestatic q1h$_7g.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: goto 1e
      // 1a: invokestatic q1h$_7g.a (Loov;)Loov;
      // 1d: athrow
      // 1e: bipush 20
      // 20: putfield q1h$_7g.nid I
      // 23: return
   }

   @Override
   public boolean vle() {
      int var1 = t9d.b();

      try {
         if (var1 == 0) {
            return (boolean)this.nid;
         }

         if (this.nid > 0) {
            return (boolean)1;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return (boolean)0;
   }

   @Override
   public void iad() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic q1h$_7g.a J
      // 003: ldc2_w 81270897637676
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic t9d.c ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: dup
      // 00e: getfield q1h$_7g.nid I
      // 011: bipush 1
      // 012: isub
      // 013: putfield q1h$_7g.nid I
      // 016: aload 0
      // 017: iload 3
      // 018: ifne 030
      // 01b: getfield q1h$_7g.nid I
      // 01e: ifgt 1b9
      // 021: goto 028
      // 024: invokestatic q1h$_7g.a (Loov;)Loov;
      // 027: athrow
      // 028: aload 0
      // 029: goto 030
      // 02c: invokestatic q1h$_7g.a (Loov;)Loov;
      // 02f: athrow
      // 030: getfield q1h$_7g.z14 Lq1h;
      // 033: getfield q1h.oay Lt9d;
      // 036: astore 4
      // 038: aload 0
      // 039: getfield q1h$_7g.z14 Lq1h;
      // 03c: invokevirtual q1h.mbr ()Ljava/util/Random;
      // 03f: astore 5
      // 041: new mew
      // 044: dup
      // 045: aload 0
      // 046: getfield q1h$_7g.z14 Lq1h;
      // 049: invokespecial mew.<init> (Li2h;)V
      // 04c: astore 6
      // 04e: bipush 0
      // 04f: istore 7
      // 051: iload 7
      // 053: bipush 5
      // 054: if_icmpgt 1b9
      // 057: iload 7
      // 059: iload 3
      // 05a: ifne 071
      // 05d: bipush -5
      // 05f: if_icmplt 1b9
      // 062: goto 069
      // 065: invokestatic q1h$_7g.a (Loov;)Loov;
      // 068: athrow
      // 069: bipush 0
      // 06a: goto 071
      // 06d: invokestatic q1h$_7g.a (Loov;)Loov;
      // 070: athrow
      // 071: istore 8
      // 073: iload 8
      // 075: bipush 10
      // 077: if_icmpgt 194
      // 07a: iload 8
      // 07c: iload 3
      // 07d: ifne 196
      // 080: bipush -10
      // 082: iload 3
      // 083: ifne 1b2
      // 086: goto 08d
      // 089: invokestatic q1h$_7g.a (Loov;)Loov;
      // 08c: athrow
      // 08d: if_icmplt 194
      // 090: goto 097
      // 093: invokestatic q1h$_7g.a (Loov;)Loov;
      // 096: athrow
      // 097: bipush 0
      // 098: istore 9
      // 09a: iload 9
      // 09c: bipush 10
      // 09e: if_icmpgt 16f
      // 0a1: iload 9
      // 0a3: iload 3
      // 0a4: ifne 171
      // 0a7: bipush -10
      // 0a9: iload 3
      // 0aa: ifne 18d
      // 0ad: goto 0b4
      // 0b0: invokestatic q1h$_7g.a (Loov;)Loov;
      // 0b3: athrow
      // 0b4: if_icmplt 16f
      // 0b7: goto 0be
      // 0ba: invokestatic q1h$_7g.a (Loov;)Loov;
      // 0bd: athrow
      // 0be: aload 6
      // 0c0: iload 8
      // 0c2: iload 7
      // 0c4: iload 9
      // 0c6: invokevirtual mew.ec4 (III)Lmew;
      // 0c9: astore 10
      // 0cb: aload 4
      // 0cd: aload 10
      // 0cf: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 0d2: astore 11
      // 0d4: aload 11
      // 0d6: invokeinterface zfz.r_y ()Le0x; 1
      // 0db: getstatic ox_._q8 Le0x;
      // 0de: if_acmpne 14a
      // 0e1: aload 4
      // 0e3: invokevirtual t9d.eir ()Lef9;
      // 0e6: getstatic q1h$_7g.b Ljava/lang/String;
      // 0e9: nop
      // 0ea: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 0ed: iload 3
      // 0ee: ifne 135
      // 0f1: goto 0f8
      // 0f4: invokestatic q1h$_7g.a (Loov;)Loov;
      // 0f7: athrow
      // 0f8: ifeq 116
      // 0fb: goto 102
      // 0fe: invokestatic q1h$_7g.a (Loov;)Loov;
      // 101: athrow
      // 102: aload 4
      // 104: aload 10
      // 106: bipush 1
      // 107: invokevirtual t9d.yir (Lmew;Z)Z
      // 10a: pop
      // 10b: iload 3
      // 10c: ifeq 136
      // 10f: goto 116
      // 112: invokestatic q1h$_7g.a (Loov;)Loov;
      // 115: athrow
      // 116: aload 4
      // 118: aload 10
      // 11a: aload 11
      // 11c: getstatic x4j.lke Lzb_;
      // 11f: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 124: checkcast x4j$y3_
      // 127: invokevirtual x4j$y3_.k80 ()Lzfz;
      // 12a: bipush 3
      // 12b: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 12e: goto 135
      // 131: invokestatic q1h$_7g.a (Loov;)Loov;
      // 134: athrow
      // 135: pop
      // 136: aload 5
      // 138: invokevirtual java/util/Random.nextBoolean ()Z
      // 13b: iload 3
      // 13c: ifne 14c
      // 13f: ifeq 14a
      // 142: goto 149
      // 145: invokestatic q1h$_7g.a (Loov;)Loov;
      // 148: athrow
      // 149: return
      // 14a: iload 9
      // 14c: iload 3
      // 14d: ifne 166
      // 150: ifgt 165
      // 153: goto 15a
      // 156: invokestatic q1h$_7g.a (Loov;)Loov;
      // 159: athrow
      // 15a: bipush 1
      // 15b: iload 9
      // 15d: isub
      // 15e: goto 169
      // 161: invokestatic q1h$_7g.a (Loov;)Loov;
      // 164: athrow
      // 165: bipush 0
      // 166: iload 9
      // 168: isub
      // 169: istore 9
      // 16b: iload 3
      // 16c: ifeq 09a
      // 16f: iload 8
      // 171: iload 3
      // 172: ifne 18b
      // 175: ifgt 18a
      // 178: goto 17f
      // 17b: invokestatic q1h$_7g.a (Loov;)Loov;
      // 17e: athrow
      // 17f: bipush 1
      // 180: iload 8
      // 182: isub
      // 183: goto 18e
      // 186: invokestatic q1h$_7g.a (Loov;)Loov;
      // 189: athrow
      // 18a: bipush 0
      // 18b: iload 8
      // 18d: isub
      // 18e: istore 8
      // 190: iload 3
      // 191: ifeq 073
      // 194: iload 7
      // 196: iload 3
      // 197: ifne 1b0
      // 19a: ifgt 1af
      // 19d: goto 1a4
      // 1a0: invokestatic q1h$_7g.a (Loov;)Loov;
      // 1a3: athrow
      // 1a4: bipush 1
      // 1a5: iload 7
      // 1a7: isub
      // 1a8: goto 1b3
      // 1ab: invokestatic q1h$_7g.a (Loov;)Loov;
      // 1ae: athrow
      // 1af: bipush 0
      // 1b0: iload 7
      // 1b2: isub
      // 1b3: istore 7
      // 1b5: iload 3
      // 1b6: ifeq 051
      // 1b9: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(2091159807240455160L, 463169843446732657L, MethodHandles.lookup().lookupClass()).a(192342564138491L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 34120055317059L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("»\u0097G,K\u0091'#\u001aÙ\u0088L{æVß".getBytes("ISO-8859-1"));
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
