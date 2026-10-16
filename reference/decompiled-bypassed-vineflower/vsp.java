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

public class vsp extends bc_ {
   private static final long a;
   private static final String[] c;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public String xue() {
      long var1 = a ^ 36777140778304L;
      return b<"v">(30318, 5363366257994218176L ^ var1);
   }

   @Override
   public int bag() {
      return 2;
   }

   @Override
   public String fm7(e7r var1) {
      long var2 = a ^ 52280959052230L;
      return b<"v">(1202, 2296727549383742622L ^ var2);
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
      // 000: getstatic vsp.a J
      // 003: ldc2_w 41168966549509
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic t9d.b ()I
      // 00b: istore 5
      // 00d: aload 2
      // 00e: arraylength
      // 00f: iload 5
      // 011: ifeq 03f
      // 014: bipush 8
      // 016: if_icmpge 03e
      // 019: goto 020
      // 01c: invokestatic vsp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 01f: athrow
      // 020: new w57
      // 023: dup
      // 024: sipush 20189
      // 027: ldc2_w 1142256964295292723
      // 02a: lload 3
      // 02b: lxor
      // 02c: invokedynamic v (IJ)Ljava/lang/String; bsm=vsp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 031: nop
      // 032: bipush 0
      // 033: anewarray 33
      // 036: invokespecial w57.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 039: athrow
      // 03a: invokestatic vsp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 03d: athrow
      // 03e: bipush 0
      // 03f: istore 6
      // 041: aconst_null
      // 042: astore 7
      // 044: invokestatic w_0.values ()[Lw_0;
      // 047: astore 8
      // 049: aload 8
      // 04b: arraylength
      // 04c: istore 9
      // 04e: bipush 0
      // 04f: istore 10
      // 051: iload 10
      // 053: iload 9
      // 055: if_icmpge 0c8
      // 058: aload 8
      // 05a: iload 10
      // 05c: aaload
      // 05d: astore 11
      // 05f: aload 11
      // 061: invokevirtual w_0.f8t ()Z
      // 064: iload 5
      // 066: ifeq 0a9
      // 069: ifeq 09e
      // 06c: goto 073
      // 06f: invokestatic vsp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 072: athrow
      // 073: aload 2
      // 074: bipush 0
      // 075: aaload
      // 076: aload 11
      // 078: invokevirtual w_0.ia9 ()Ljava/lang/String;
      // 07b: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 07e: iload 5
      // 080: ifeq 095
      // 083: goto 08a
      // 086: invokestatic vsp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 089: athrow
      // 08a: ifeq 0c2
      // 08d: goto 094
      // 090: invokestatic vsp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 093: athrow
      // 094: bipush 1
      // 095: istore 6
      // 097: aload 11
      // 099: astore 7
      // 09b: goto 0c8
      // 09e: aload 2
      // 09f: bipush 0
      // 0a0: aaload
      // 0a1: aload 11
      // 0a3: invokevirtual w_0.ia9 ()Ljava/lang/String;
      // 0a6: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0a9: iload 5
      // 0ab: ifeq 0b9
      // 0ae: ifeq 0c2
      // 0b1: goto 0b8
      // 0b4: invokestatic vsp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0b7: athrow
      // 0b8: bipush 1
      // 0b9: istore 6
      // 0bb: aload 11
      // 0bd: astore 7
      // 0bf: goto 0c8
      // 0c2: iinc 10 1
      // 0c5: goto 051
      // 0c8: iload 6
      // 0ca: ifne 0f1
      // 0cd: new uvb
      // 0d0: dup
      // 0d1: sipush 11124
      // 0d4: ldc2_w 6725736777697890972
      // 0d7: lload 3
      // 0d8: lxor
      // 0d9: invokedynamic v (IJ)Ljava/lang/String; bsm=vsp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0de: nop
      // 0df: bipush 1
      // 0e0: anewarray 33
      // 0e3: dup
      // 0e4: bipush 0
      // 0e5: aload 2
      // 0e6: bipush 0
      // 0e7: aaload
      // 0e8: aastore
      // 0e9: invokespecial uvb.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 0ec: athrow
      // 0ed: invokestatic vsp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0f0: athrow
      // 0f1: aload 2
      // 0f2: bipush 0
      // 0f3: aaload
      // 0f4: astore 8
      // 0f6: aload 1
      // 0f7: invokeinterface e7r.i15 ()Lfqr; 1
      // 0fc: astore 9
      // 0fe: aload 9
      // 100: getfield fqr.lvi D
      // 103: aload 2
      // 104: bipush 1
      // 105: aaload
      // 106: bipush 1
      // 107: invokestatic vsp.d80 (DLjava/lang/String;Z)D
      // 10a: d2f
      // 10b: f2d
      // 10c: dstore 10
      // 10e: aload 9
      // 110: getfield fqr.gn5 D
      // 113: aload 2
      // 114: bipush 2
      // 115: aaload
      // 116: bipush 1
      // 117: invokestatic vsp.d80 (DLjava/lang/String;Z)D
      // 11a: d2f
      // 11b: f2d
      // 11c: dstore 12
      // 11e: aload 9
      // 120: getfield fqr.bn2 D
      // 123: aload 2
      // 124: bipush 3
      // 125: aaload
      // 126: bipush 1
      // 127: invokestatic vsp.d80 (DLjava/lang/String;Z)D
      // 12a: d2f
      // 12b: f2d
      // 12c: dstore 14
      // 12e: aload 2
      // 12f: bipush 4
      // 130: aaload
      // 131: invokestatic vsp.gdo (Ljava/lang/String;)D
      // 134: d2f
      // 135: f2d
      // 136: dstore 16
      // 138: aload 2
      // 139: bipush 5
      // 13a: aaload
      // 13b: invokestatic vsp.gdo (Ljava/lang/String;)D
      // 13e: d2f
      // 13f: f2d
      // 140: dstore 18
      // 142: aload 2
      // 143: bipush 6
      // 145: aaload
      // 146: invokestatic vsp.gdo (Ljava/lang/String;)D
      // 149: d2f
      // 14a: f2d
      // 14b: dstore 20
      // 14d: aload 2
      // 14e: bipush 7
      // 150: aaload
      // 151: invokestatic vsp.gdo (Ljava/lang/String;)D
      // 154: d2f
      // 155: f2d
      // 156: dstore 22
      // 158: bipush 0
      // 159: istore 24
      // 15b: aload 2
      // 15c: arraylength
      // 15d: iload 5
      // 15f: ifeq 179
      // 162: bipush 8
      // 164: if_icmple 178
      // 167: goto 16e
      // 16a: invokestatic vsp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 16d: athrow
      // 16e: aload 2
      // 16f: bipush 8
      // 171: aaload
      // 172: bipush 0
      // 173: invokestatic vsp.o_t (Ljava/lang/String;I)I
      // 176: istore 24
      // 178: bipush 0
      // 179: istore 25
      // 17b: aload 2
      // 17c: arraylength
      // 17d: iload 5
      // 17f: ifeq 1aa
      // 182: bipush 9
      // 184: if_icmple 1bc
      // 187: goto 18e
      // 18a: invokestatic vsp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 18d: athrow
      // 18e: sipush 14692
      // 191: ldc2_w 2055693489974771854
      // 194: lload 3
      // 195: lxor
      // 196: invokedynamic v (IJ)Ljava/lang/String; bsm=vsp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19b: nop
      // 19c: aload 2
      // 19d: bipush 9
      // 19f: aaload
      // 1a0: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1a3: goto 1aa
      // 1a6: invokestatic vsp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1a9: athrow
      // 1aa: iload 5
      // 1ac: ifeq 1ba
      // 1af: ifeq 1bc
      // 1b2: goto 1b9
      // 1b5: invokestatic vsp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1b8: athrow
      // 1b9: bipush 1
      // 1ba: istore 25
      // 1bc: aload 1
      // 1bd: invokeinterface e7r.qha ()Lt9d; 1
      // 1c2: astore 26
      // 1c4: aload 26
      // 1c6: iload 5
      // 1c8: ifeq 1e1
      // 1cb: instanceof dug
      // 1ce: ifeq 2a2
      // 1d1: goto 1d8
      // 1d4: invokestatic vsp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1d7: athrow
      // 1d8: aload 26
      // 1da: goto 1e1
      // 1dd: invokestatic vsp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1e0: athrow
      // 1e1: checkcast dug
      // 1e4: astore 27
      // 1e6: aload 7
      // 1e8: invokevirtual w_0.f5r ()I
      // 1eb: newarray 10
      // 1ed: astore 28
      // 1ef: iload 5
      // 1f1: ifeq 27a
      // 1f4: aload 7
      // 1f6: invokevirtual w_0.f8t ()Z
      // 1f9: ifeq 25f
      // 1fc: goto 203
      // 1ff: invokestatic vsp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 202: athrow
      // 203: aload 2
      // 204: bipush 0
      // 205: aaload
      // 206: ldc "_"
      // 208: nop
      // 209: bipush 3
      // 20a: invokevirtual java/lang/String.split (Ljava/lang/String;I)[Ljava/lang/String;
      // 20d: astore 29
      // 20f: bipush 1
      // 210: istore 30
      // 212: iload 30
      // 214: aload 29
      // 216: arraylength
      // 217: if_icmpge 25f
      // 21a: aload 28
      // 21c: iload 30
      // 21e: bipush 1
      // 21f: isub
      // 220: aload 29
      // 222: iload 30
      // 224: aaload
      // 225: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 228: iastore
      // 229: iload 5
      // 22b: ifeq 27a
      // 22e: goto 257
      // 231: invokestatic vsp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 234: athrow
      // 235: astore 31
      // 237: new uvb
      // 23a: dup
      // 23b: sipush 31091
      // 23e: ldc2_w 5912952654259732634
      // 241: lload 3
      // 242: lxor
      // 243: invokedynamic v (IJ)Ljava/lang/String; bsm=vsp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 248: nop
      // 249: bipush 1
      // 24a: anewarray 33
      // 24d: dup
      // 24e: bipush 0
      // 24f: aload 2
      // 250: bipush 0
      // 251: aaload
      // 252: aastore
      // 253: invokespecial uvb.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 256: athrow
      // 257: iinc 30 1
      // 25a: iload 5
      // 25c: ifne 212
      // 25f: aload 27
      // 261: aload 7
      // 263: iload 25
      // 265: dload 10
      // 267: dload 12
      // 269: dload 14
      // 26b: iload 24
      // 26d: dload 16
      // 26f: dload 18
      // 271: dload 20
      // 273: dload 22
      // 275: aload 28
      // 277: invokevirtual dug.zza (Lw_0;ZDDDIDDDD[I)V
      // 27a: aload 1
      // 27b: aload 0
      // 27c: sipush 32304
      // 27f: ldc2_w 4917180041628567517
      // 282: lload 3
      // 283: lxor
      // 284: invokedynamic v (IJ)Ljava/lang/String; bsm=vsp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 289: nop
      // 28a: bipush 2
      // 28b: anewarray 33
      // 28e: dup
      // 28f: bipush 0
      // 290: aload 8
      // 292: aastore
      // 293: dup
      // 294: bipush 1
      // 295: iload 24
      // 297: bipush 1
      // 298: invokestatic java/lang/Math.max (II)I
      // 29b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 29e: aastore
      // 29f: invokestatic vsp.wxl (Le7r;Lon1;Ljava/lang/String;[Ljava/lang/Object;)V
      // 2a2: return
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
      // 00: getstatic vsp.a J
      // 03: ldc2_w 10479315836405
      // 06: lxor
      // 07: lstore 4
      // 09: invokestatic t9d.c ()I
      // 0c: istore 6
      // 0e: aload 2
      // 0f: arraylength
      // 10: bipush 1
      // 11: iload 6
      // 13: ifne 31
      // 16: if_icmpne 2e
      // 19: goto 20
      // 1c: invokestatic vsp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1f: athrow
      // 20: aload 2
      // 21: invokestatic w_0.scu ()[Ljava/lang/String;
      // 24: invokestatic vsp.cqo ([Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;
      // 27: goto a9
      // 2a: invokestatic vsp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2d: athrow
      // 2e: aload 2
      // 2f: arraylength
      // 30: bipush 1
      // 31: iload 6
      // 33: ifne 76
      // 36: if_icmple 66
      // 39: goto 40
      // 3c: invokestatic vsp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3f: athrow
      // 40: aload 2
      // 41: arraylength
      // 42: bipush 4
      // 43: iload 6
      // 45: ifne 76
      // 48: goto 4f
      // 4b: invokestatic vsp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 4e: athrow
      // 4f: if_icmpgt 66
      // 52: goto 59
      // 55: invokestatic vsp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 58: athrow
      // 59: aload 2
      // 5a: bipush 1
      // 5b: aload 3
      // 5c: invokestatic vsp.aqt ([Ljava/lang/String;ILmew;)Ljava/util/List;
      // 5f: goto a9
      // 62: invokestatic vsp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 65: athrow
      // 66: aload 2
      // 67: iload 6
      // 69: ifne 7a
      // 6c: arraylength
      // 6d: bipush 10
      // 6f: goto 76
      // 72: invokestatic vsp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 75: athrow
      // 76: if_icmpne a8
      // 79: aload 2
      // 7a: bipush 2
      // 7b: anewarray 1
      // 7e: dup
      // 7f: bipush 0
      // 80: sipush 31754
      // 83: ldc2_w 792337917973927958
      // 86: lload 4
      // 88: lxor
      // 89: invokedynamic v (IJ)Ljava/lang/String; bsm=vsp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8e: nop
      // 8f: aastore
      // 90: dup
      // 91: bipush 1
      // 92: sipush 24022
      // 95: ldc2_w 8992626283038718402
      // 98: lload 4
      // 9a: lxor
      // 9b: invokedynamic v (IJ)Ljava/lang/String; bsm=vsp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a0: nop
      // a1: aastore
      // a2: invokestatic vsp.cqo ([Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;
      // a5: goto a9
      // a8: aconst_null
      // a9: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-9159451995780032608L, -5988305586995020231L, MethodHandles.lookup().lookupClass()).a(235637023750267L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 31616002781222L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[9];
      int var7 = 0;
      String var6 = "ÿ,\u008bb½\u0080H\u008b\u0006\\Æ8~Û£î8\u001d¹èÊð@ÍëÒÛu¥-·Y\u0090d[\u009eg\u0012Nä\u0010k±Ä²Ý\u0010Äã <`®46È$D\u0014\u0080F\u0082\u0097Îõqxâa\u0096qÕÔ(0$(ÓìwÚ¬¸<uR\u000f£Ã\u0002\u0098¯á\u0085u}7i_%\u0010Ã)\u000föÌ¸C\u0083,¯\u0081\u009d¯(¾\u0094\u0090ß4À@CÚ\u0007Ò«h\r83\u000eYUáÉ\u0088Â¥%o°)äuO\u0005\u0098\n¥\u0015=èOÈ8#\u0099ú/5ý¿·òÉ]\u0019\u0007ÀvsÉJHoÙ»Ö\"d¶N¬®Êó/gR\u0017%o\nÂpÜãæÆÿÚ\u0091nï!ªÀ\f®¾ì8@&ùrÓÂ\u0005¿\u008bÑNª\u0000#Õl\u0096óøý\f¤ún\u0098\u0096\\~\u001aIitTO\u0005s$Ê\u0016)\t,q®æ|:*H\u0006Ñ¡VÇ\u0099\f\u0010¾6\f\u0016¢dÛñ°Æ\u008bf¬ç\u001b\u0015";
      int var8 = "ÿ,\u008bb½\u0080H\u008b\u0006\\Æ8~Û£î8\u001d¹èÊð@ÍëÒÛu¥-·Y\u0090d[\u009eg\u0012Nä\u0010k±Ä²Ý\u0010Äã <`®46È$D\u0014\u0080F\u0082\u0097Îõqxâa\u0096qÕÔ(0$(ÓìwÚ¬¸<uR\u000f£Ã\u0002\u0098¯á\u0085u}7i_%\u0010Ã)\u000föÌ¸C\u0083,¯\u0081\u009d¯(¾\u0094\u0090ß4À@CÚ\u0007Ò«h\r83\u000eYUáÉ\u0088Â¥%o°)äuO\u0005\u0098\n¥\u0015=èOÈ8#\u0099ú/5ý¿·òÉ]\u0019\u0007ÀvsÉJHoÙ»Ö\"d¶N¬®Êó/gR\u0017%o\nÂpÜãæÆÿÚ\u0091nï!ªÀ\f®¾ì8@&ùrÓÂ\u0005¿\u008bÑNª\u0000#Õl\u0096óøý\f¤ún\u0098\u0096\\~\u001aIitTO\u0005s$Ê\u0016)\t,q®æ|:*H\u0006Ñ¡VÇ\u0099\f\u0010¾6\f\u0016¢dÛñ°Æ\u008bf¬ç\u001b\u0015"
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
                     c = var9;
                     g = new String[9];
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

                  var6 = "ø\u0005\f\u000b/(Vah*Ï´Ë\u0090\u0086?7û$ê7Ï\u0098\u0019\u0010h\u000fýBÈæÃâKë~|\u0091\u0084>½";
                  var8 = "ø\u0005\f\u000b/(Vah*Ï´Ë\u0090\u0086?7û$ê7Ï\u0098\u0019\u0010h\u000fýBÈæÃâKë~|\u0091\u0084>½".length();
                  var5 = 24;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static RuntimeException a(RuntimeException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5554;
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
            throw new RuntimeException("vsp", var10);
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
         throw new RuntimeException("vsp" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
