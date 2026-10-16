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

public class qe8 extends bc_ {
   private static final long a;
   private static final String[] c;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public String xue() {
      long var1 = a ^ 116487362595863L;
      return b<"k">(18924, 6442306474155911496L ^ var1);
   }

   @Override
   public int bag() {
      return 2;
   }

   @Override
   public String fm7(e7r var1) {
      long var2 = a ^ 113316542877841L;
      return b<"k">(27329, 3007902045546796773L ^ var2);
   }

   @Override
   public void l3z(e7r param1, String[] param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qe8.a J
      // 003: ldc2_w 120887996561746
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic t9d.b ()I
      // 00b: istore 5
      // 00d: aload 2
      // 00e: arraylength
      // 00f: bipush 1
      // 010: iload 5
      // 012: ifeq 029
      // 015: if_icmplt 1d8
      // 018: goto 01f
      // 01b: invokestatic qe8.a (Loov;)Loov;
      // 01e: athrow
      // 01f: aload 2
      // 020: arraylength
      // 021: bipush 2
      // 022: goto 029
      // 025: invokestatic qe8.a (Loov;)Loov;
      // 028: athrow
      // 029: iload 5
      // 02b: ifeq 052
      // 02e: if_icmpgt 1d8
      // 031: goto 038
      // 034: invokestatic qe8.a (Loov;)Loov;
      // 037: athrow
      // 038: sipush 300
      // 03b: new java/util/Random
      // 03e: dup
      // 03f: invokespecial java/util/Random.<init> ()V
      // 042: sipush 600
      // 045: invokevirtual java/util/Random.nextInt (I)I
      // 048: iadd
      // 049: bipush 20
      // 04b: goto 052
      // 04e: invokestatic qe8.a (Loov;)Loov;
      // 051: athrow
      // 052: imul
      // 053: istore 6
      // 055: aload 2
      // 056: arraylength
      // 057: bipush 2
      // 058: iload 5
      // 05a: ifeq 07a
      // 05d: if_icmplt 07d
      // 060: goto 067
      // 063: invokestatic qe8.a (Loov;)Loov;
      // 066: athrow
      // 067: aload 2
      // 068: bipush 1
      // 069: aaload
      // 06a: bipush 1
      // 06b: ldc 1000000
      // 06d: nop
      // 06e: invokestatic qe8.fzm (Ljava/lang/String;II)I
      // 071: bipush 20
      // 073: goto 07a
      // 076: invokestatic qe8.a (Loov;)Loov;
      // 079: athrow
      // 07a: imul
      // 07b: istore 6
      // 07d: invokestatic vr1._0v ()Lvr1;
      // 080: getfield vr1.p_y [Ldug;
      // 083: bipush 0
      // 084: aaload
      // 085: astore 7
      // 087: aload 7
      // 089: invokevirtual t9d.r7d ()Lcog;
      // 08c: astore 8
      // 08e: sipush 17668
      // 091: ldc2_w 1911830910186901738
      // 094: lload 3
      // 095: lxor
      // 096: invokedynamic k (IJ)Ljava/lang/String; bsm=qe8.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09b: nop
      // 09c: aload 2
      // 09d: bipush 0
      // 09e: aaload
      // 09f: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 0a2: iload 5
      // 0a4: ifeq 10e
      // 0a7: ifeq 0f3
      // 0aa: goto 0b1
      // 0ad: invokestatic qe8.a (Loov;)Loov;
      // 0b0: athrow
      // 0b1: aload 8
      // 0b3: iload 6
      // 0b5: invokevirtual cog.rik (I)V
      // 0b8: aload 8
      // 0ba: bipush 0
      // 0bb: invokevirtual cog.o_f (I)V
      // 0be: aload 8
      // 0c0: bipush 0
      // 0c1: invokevirtual cog.zsa (I)V
      // 0c4: aload 8
      // 0c6: bipush 0
      // 0c7: invokevirtual cog.do3 (Z)V
      // 0ca: aload 8
      // 0cc: bipush 0
      // 0cd: invokevirtual cog.kcj (Z)V
      // 0d0: aload 1
      // 0d1: aload 0
      // 0d2: sipush 23091
      // 0d5: ldc2_w 794717506447134677
      // 0d8: lload 3
      // 0d9: lxor
      // 0da: invokedynamic k (IJ)Ljava/lang/String; bsm=qe8.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: nop
      // 0e0: bipush 0
      // 0e1: anewarray 80
      // 0e4: invokestatic qe8.wxl (Le7r;Lon1;Ljava/lang/String;[Ljava/lang/Object;)V
      // 0e7: iload 5
      // 0e9: ifne 1d3
      // 0ec: goto 0f3
      // 0ef: invokestatic qe8.a (Loov;)Loov;
      // 0f2: athrow
      // 0f3: sipush 19828
      // 0f6: ldc2_w 3726441123421870235
      // 0f9: lload 3
      // 0fa: lxor
      // 0fb: invokedynamic k (IJ)Ljava/lang/String; bsm=qe8.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 100: nop
      // 101: aload 2
      // 102: bipush 0
      // 103: aaload
      // 104: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 107: goto 10e
      // 10a: invokestatic qe8.a (Loov;)Loov;
      // 10d: athrow
      // 10e: iload 5
      // 110: ifeq 17b
      // 113: ifeq 160
      // 116: goto 11d
      // 119: invokestatic qe8.a (Loov;)Loov;
      // 11c: athrow
      // 11d: aload 8
      // 11f: bipush 0
      // 120: invokevirtual cog.rik (I)V
      // 123: aload 8
      // 125: iload 6
      // 127: invokevirtual cog.o_f (I)V
      // 12a: aload 8
      // 12c: iload 6
      // 12e: invokevirtual cog.zsa (I)V
      // 131: aload 8
      // 133: bipush 1
      // 134: invokevirtual cog.do3 (Z)V
      // 137: aload 8
      // 139: bipush 0
      // 13a: invokevirtual cog.kcj (Z)V
      // 13d: aload 1
      // 13e: aload 0
      // 13f: sipush 11047
      // 142: ldc2_w 6993920750152826565
      // 145: lload 3
      // 146: lxor
      // 147: invokedynamic k (IJ)Ljava/lang/String; bsm=qe8.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14c: nop
      // 14d: bipush 0
      // 14e: anewarray 80
      // 151: invokestatic qe8.wxl (Le7r;Lon1;Ljava/lang/String;[Ljava/lang/Object;)V
      // 154: iload 5
      // 156: ifne 1d3
      // 159: goto 160
      // 15c: invokestatic qe8.a (Loov;)Loov;
      // 15f: athrow
      // 160: sipush 11461
      // 163: ldc2_w 8050486586666793257
      // 166: lload 3
      // 167: lxor
      // 168: invokedynamic k (IJ)Ljava/lang/String; bsm=qe8.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16d: nop
      // 16e: aload 2
      // 16f: bipush 0
      // 170: aaload
      // 171: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 174: goto 17b
      // 177: invokestatic qe8.a (Loov;)Loov;
      // 17a: athrow
      // 17b: ifne 19c
      // 17e: new w57
      // 181: dup
      // 182: sipush 28717
      // 185: ldc2_w 6499436626516633038
      // 188: lload 3
      // 189: lxor
      // 18a: invokedynamic k (IJ)Ljava/lang/String; bsm=qe8.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18f: nop
      // 190: bipush 0
      // 191: anewarray 80
      // 194: invokespecial w57.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 197: athrow
      // 198: invokestatic qe8.a (Loov;)Loov;
      // 19b: athrow
      // 19c: aload 8
      // 19e: bipush 0
      // 19f: invokevirtual cog.rik (I)V
      // 1a2: aload 8
      // 1a4: iload 6
      // 1a6: invokevirtual cog.o_f (I)V
      // 1a9: aload 8
      // 1ab: iload 6
      // 1ad: invokevirtual cog.zsa (I)V
      // 1b0: aload 8
      // 1b2: bipush 1
      // 1b3: invokevirtual cog.do3 (Z)V
      // 1b6: aload 8
      // 1b8: bipush 1
      // 1b9: invokevirtual cog.kcj (Z)V
      // 1bc: aload 1
      // 1bd: aload 0
      // 1be: sipush 9002
      // 1c1: ldc2_w 6586546135138547407
      // 1c4: lload 3
      // 1c5: lxor
      // 1c6: invokedynamic k (IJ)Ljava/lang/String; bsm=qe8.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cb: nop
      // 1cc: bipush 0
      // 1cd: anewarray 80
      // 1d0: invokestatic qe8.wxl (Le7r;Lon1;Ljava/lang/String;[Ljava/lang/Object;)V
      // 1d3: iload 5
      // 1d5: ifne 1f6
      // 1d8: new w57
      // 1db: dup
      // 1dc: sipush 28717
      // 1df: ldc2_w 6499436626516633038
      // 1e2: lload 3
      // 1e3: lxor
      // 1e4: invokedynamic k (IJ)Ljava/lang/String; bsm=qe8.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e9: nop
      // 1ea: bipush 0
      // 1eb: anewarray 80
      // 1ee: invokespecial w57.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 1f1: athrow
      // 1f2: invokestatic qe8.a (Loov;)Loov;
      // 1f5: athrow
      // 1f6: return
   }

   @Override
   public List ggu(e7r param1, String[] param2, mew param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qe8.a J
      // 03: ldc2_w 71489400530082
      // 06: lxor
      // 07: lstore 4
      // 09: invokestatic t9d.b ()I
      // 0c: istore 6
      // 0e: aload 2
      // 0f: iload 6
      // 11: ifeq 28
      // 14: arraylength
      // 15: bipush 1
      // 16: if_icmpne 68
      // 19: goto 20
      // 1c: invokestatic qe8.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 2
      // 21: goto 28
      // 24: invokestatic qe8.a (Loov;)Loov;
      // 27: athrow
      // 28: bipush 3
      // 29: anewarray 2
      // 2c: dup
      // 2d: bipush 0
      // 2e: sipush 22275
      // 31: ldc2_w 7687001462378995486
      // 34: lload 4
      // 36: lxor
      // 37: invokedynamic k (IJ)Ljava/lang/String; bsm=qe8.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c: nop
      // 3d: aastore
      // 3e: dup
      // 3f: bipush 1
      // 40: sipush 4251
      // 43: ldc2_w 176995089375975563
      // 46: lload 4
      // 48: lxor
      // 49: invokedynamic k (IJ)Ljava/lang/String; bsm=qe8.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: nop
      // 4f: aastore
      // 50: dup
      // 51: bipush 2
      // 52: sipush 5028
      // 55: ldc2_w 4693091106155223984
      // 58: lload 4
      // 5a: lxor
      // 5b: invokedynamic k (IJ)Ljava/lang/String; bsm=qe8.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60: nop
      // 61: aastore
      // 62: invokestatic qe8.cqo ([Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;
      // 65: goto 69
      // 68: aconst_null
      // 69: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5785236241172694728L, -646098130449878419L, MethodHandles.lookup().lookupClass()).a(181248497355864L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 20056610702463L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[12];
      int var7 = 0;
      String var6 = "`J\u0097AÇÁ\u0005nËd=ÿ·Ùq\r±(7Ot¾\u0093i\u0015\u009dÜ\u009eê\u0083Þ\u0085o\u008bæm\u0014\u000e\u0013¡0¬¦ÅLñ4íl\u009a\r\u001c\u0097\u008c\u008c¾.Oª§\u0083*Ë\u0016Æ¢\u00adÏ>4ë¥\u0004\u00164\u0084\u009aÍ>\u0017>\"Êõ\u0093I\u001d\u009f\u0013\u0010º¥¯r®^\u000bo\u0010ÛÊ_\u008c·\f\u009e8P½'«Ïg¸øÅGñÒ§\u001c±\u0004uN6Wá\u0092tÔ\r!z1jA²\u008c_,SMðD¤£µºîÄ[\u001b~ð\u0001ï-ÍÈ\u001cP\b(¿ÉÂ·\u000e5]ñ\u0016Gn\u0091TïÂæ¢#&\u001bØ¹l\u009e)¥¨îö\u009bôYþ1\u0093\u000eÿ\u00861((V£*Ê±íê\u001aÃ6<\t\tÑ\u0016Ã\u0095«á¶7¥ÞVlÅûMòõ§N5)#½\u0002*Sg\u0010ùfÔ¬î\u0091U¬0ÛÀ×¹Ët\u001f\u0010\r¦ _\u001a\u000eÍ¹ö\u0011\u008f\f\u0080GÒ_\u0010£Î,÷\u0085\u0094!\u001fnN\u00ad²^ñÙ¤\u0010½¢iÈ;=YqâD\bXCÖ\u0087\b";
      int var8 = "`J\u0097AÇÁ\u0005nËd=ÿ·Ùq\r±(7Ot¾\u0093i\u0015\u009dÜ\u009eê\u0083Þ\u0085o\u008bæm\u0014\u000e\u0013¡0¬¦ÅLñ4íl\u009a\r\u001c\u0097\u008c\u008c¾.Oª§\u0083*Ë\u0016Æ¢\u00adÏ>4ë¥\u0004\u00164\u0084\u009aÍ>\u0017>\"Êõ\u0093I\u001d\u009f\u0013\u0010º¥¯r®^\u000bo\u0010ÛÊ_\u008c·\f\u009e8P½'«Ïg¸øÅGñÒ§\u001c±\u0004uN6Wá\u0092tÔ\r!z1jA²\u008c_,SMðD¤£µºîÄ[\u001b~ð\u0001ï-ÍÈ\u001cP\b(¿ÉÂ·\u000e5]ñ\u0016Gn\u0091TïÂæ¢#&\u001bØ¹l\u009e)¥¨îö\u009bôYþ1\u0093\u000eÿ\u00861((V£*Ê±íê\u001aÃ6<\t\tÑ\u0016Ã\u0095«á¶7¥ÞVlÅûMòõ§N5)#½\u0002*Sg\u0010ùfÔ¬î\u0091U¬0ÛÀ×¹Ët\u001f\u0010\r¦ _\u001a\u000eÍ¹ö\u0011\u008f\f\u0080GÒ_\u0010£Î,÷\u0085\u0094!\u001fnN\u00ad²^ñÙ¤\u0010½¢iÈ;=YqâD\bXCÖ\u0087\b"
         .length();
      char var5 = '(';
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
                     c = var9;
                     g = new String[12];
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

                  var6 = "\u001aC\u0006ÿ\u001fi5R÷:ÅÃ¸>l\u001d\u0010\u0007}Ö<\u0097Þõ\u009dY·ÌV\u0092\u0091¸'";
                  var8 = "\u001aC\u0006ÿ\u001fi5R÷:ÅÃ¸>l\u001d\u0010\u0007}Ö<\u0097Þõ\u009dY·ÌV\u0092\u0091¸'".length();
                  var5 = 16;
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 14776;
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
            throw new RuntimeException("qe8", var10);
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
         throw new RuntimeException("qe8" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
