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

public class frs extends ar7 {
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public frs() {
      long var1 = a ^ 102432357518179L;
      super(b<"p">(17709, 3093561577521626657L ^ var1), _aj.y49, false, new j1s[0]);
   }

   @jev
   public void ab2(ccn param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic frs.a J
      // 003: ldc2_w 101935026064213
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic t9d.b ()I
      // 00b: istore 4
      // 00d: getstatic frs.ek1 Lc05;
      // 010: getfield c05.tij Lkh3;
      // 013: getfield kh3.guf Ljava/util/List;
      // 016: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 01b: astore 5
      // 01d: aload 5
      // 01f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 024: ifeq 35b
      // 027: aload 5
      // 029: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 02e: checkcast i2h
      // 031: astore 6
      // 033: aload 6
      // 035: iload 4
      // 037: ifeq 050
      // 03a: instanceof ha9
      // 03d: ifeq 356
      // 040: goto 047
      // 043: invokestatic frs.a (Loov;)Loov;
      // 046: athrow
      // 047: aload 6
      // 049: goto 050
      // 04c: invokestatic frs.a (Loov;)Loov;
      // 04f: athrow
      // 050: iload 4
      // 052: ifeq 06e
      // 055: getstatic frs.ek1 Lc05;
      // 058: getfield c05.vg8 Ll86;
      // 05b: if_acmpne 06c
      // 05e: goto 065
      // 061: invokestatic frs.a (Loov;)Loov;
      // 064: athrow
      // 065: goto 01d
      // 068: invokestatic frs.a (Loov;)Loov;
      // 06b: athrow
      // 06c: aload 6
      // 06e: checkcast ha9
      // 071: astore 7
      // 073: aload 7
      // 075: ldc2_w 0.01
      // 078: invokestatic p_c.tuy (Li2h;D)Z
      // 07b: iload 4
      // 07d: ifeq 0aa
      // 080: ifne 0a9
      // 083: goto 08a
      // 086: invokestatic frs.a (Loov;)Loov;
      // 089: athrow
      // 08a: aload 7
      // 08c: invokevirtual ha9.gce ()D
      // 08f: ldc2_w 0.1
      // 092: dcmpg
      // 093: iload 4
      // 095: ifeq 0aa
      // 098: goto 09f
      // 09b: invokestatic frs.a (Loov;)Loov;
      // 09e: athrow
      // 09f: ifge 0ad
      // 0a2: goto 0a9
      // 0a5: invokestatic frs.a (Loov;)Loov;
      // 0a8: athrow
      // 0a9: bipush 1
      // 0aa: goto 0ae
      // 0ad: bipush 0
      // 0ae: istore 8
      // 0b0: aload 7
      // 0b2: getfield ha9.kfp D
      // 0b5: aload 7
      // 0b7: getfield ha9.kfp D
      // 0ba: d2i
      // 0bb: i2d
      // 0bc: dsub
      // 0bd: dstore 9
      // 0bf: dload 9
      // 0c1: ldc2_w 0.40625
      // 0c4: dsub
      // 0c5: invokestatic java/lang/Math.abs (D)D
      // 0c8: ldc2_w 5.0E-4
      // 0cb: dcmpg
      // 0cc: iload 4
      // 0ce: ifeq 145
      // 0d1: iflt 144
      // 0d4: goto 0db
      // 0d7: invokestatic frs.a (Loov;)Loov;
      // 0da: athrow
      // 0db: dload 9
      // 0dd: ldc2_w 0.75
      // 0e0: dsub
      // 0e1: invokestatic java/lang/Math.abs (D)D
      // 0e4: ldc2_w 5.0E-4
      // 0e7: dcmpg
      // 0e8: iload 4
      // 0ea: ifeq 145
      // 0ed: goto 0f4
      // 0f0: invokestatic frs.a (Loov;)Loov;
      // 0f3: athrow
      // 0f4: iflt 144
      // 0f7: goto 0fe
      // 0fa: invokestatic frs.a (Loov;)Loov;
      // 0fd: athrow
      // 0fe: dload 9
      // 100: ldc2_w 0.3125
      // 103: dsub
      // 104: invokestatic java/lang/Math.abs (D)D
      // 107: ldc2_w 5.0E-4
      // 10a: dcmpg
      // 10b: iload 4
      // 10d: ifeq 145
      // 110: goto 117
      // 113: invokestatic frs.a (Loov;)Loov;
      // 116: athrow
      // 117: iflt 144
      // 11a: goto 121
      // 11d: invokestatic frs.a (Loov;)Loov;
      // 120: athrow
      // 121: dload 9
      // 123: ldc2_w 0.65625
      // 126: dsub
      // 127: invokestatic java/lang/Math.abs (D)D
      // 12a: ldc2_w 5.0E-4
      // 12d: dcmpg
      // 12e: iload 4
      // 130: ifeq 145
      // 133: goto 13a
      // 136: invokestatic frs.a (Loov;)Loov;
      // 139: athrow
      // 13a: ifge 148
      // 13d: goto 144
      // 140: invokestatic frs.a (Loov;)Loov;
      // 143: athrow
      // 144: bipush 1
      // 145: goto 149
      // 148: bipush 0
      // 149: istore 11
      // 14b: iload 11
      // 14d: iload 4
      // 14f: ifeq 1e7
      // 152: ifeq 1df
      // 155: goto 15c
      // 158: invokestatic frs.a (Loov;)Loov;
      // 15b: athrow
      // 15c: iload 8
      // 15e: iload 4
      // 160: ifeq 1e7
      // 163: goto 16a
      // 166: invokestatic frs.a (Loov;)Loov;
      // 169: athrow
      // 16a: ifne 1df
      // 16d: goto 174
      // 170: invokestatic frs.a (Loov;)Loov;
      // 173: athrow
      // 174: aload 7
      // 176: invokevirtual ha9.gce ()D
      // 179: aload 7
      // 17b: invokevirtual ha9.tde ()D
      // 17e: ldc2_w 3.0
      // 181: dmul
      // 182: dcmpl
      // 183: iload 4
      // 185: ifeq 1e7
      // 188: goto 18f
      // 18b: invokestatic frs.a (Loov;)Loov;
      // 18e: athrow
      // 18f: ifle 1df
      // 192: goto 199
      // 195: invokestatic frs.a (Loov;)Loov;
      // 198: athrow
      // 199: aload 7
      // 19b: getfield ha9.zy5 Lftj;
      // 19e: dup
      // 19f: getfield ftj.r_e I
      // 1a2: bipush 1
      // 1a3: iadd
      // 1a4: putfield ftj.r_e I
      // 1a7: new java/lang/StringBuilder
      // 1aa: dup
      // 1ab: invokespecial java/lang/StringBuilder.<init> ()V
      // 1ae: aload 7
      // 1b0: invokevirtual ha9.noc ()Ljava/lang/String;
      // 1b3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1b6: sipush 18961
      // 1b9: ldc2_w 5795864097270067502
      // 1bc: lload 2
      // 1bd: lxor
      // 1be: invokedynamic p (IJ)Ljava/lang/String; bsm=frs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c3: nop
      // 1c4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c7: aload 7
      // 1c9: getfield ha9.zy5 Lftj;
      // 1cc: getfield ftj.r_e I
      // 1cf: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 1d2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1d5: invokestatic ncl.zpu (Ljava/lang/Object;)V
      // 1d8: goto 1df
      // 1db: invokestatic frs.a (Loov;)Loov;
      // 1de: athrow
      // 1df: aload 7
      // 1e1: getfield ha9.zy5 Lftj;
      // 1e4: getfield ftj.r_e I
      // 1e7: bipush 3
      // 1e8: iload 4
      // 1ea: ifeq 265
      // 1ed: if_icmplt 25c
      // 1f0: goto 1f7
      // 1f3: invokestatic frs.a (Loov;)Loov;
      // 1f6: athrow
      // 1f7: aload 7
      // 1f9: getfield ha9.zy5 Lftj;
      // 1fc: getfield ftj.r04 Z
      // 1ff: iload 4
      // 201: ifeq 264
      // 204: goto 20b
      // 207: invokestatic frs.a (Loov;)Loov;
      // 20a: athrow
      // 20b: ifne 25c
      // 20e: goto 215
      // 211: invokestatic frs.a (Loov;)Loov;
      // 214: athrow
      // 215: sipush 32294
      // 218: ldc2_w 6327210255885681946
      // 21b: lload 2
      // 21c: lxor
      // 21d: invokedynamic p (IJ)Ljava/lang/String; bsm=frs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 222: nop
      // 223: new java/lang/StringBuilder
      // 226: dup
      // 227: invokespecial java/lang/StringBuilder.<init> ()V
      // 22a: aload 7
      // 22c: invokevirtual ha9.noc ()Ljava/lang/String;
      // 22f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 232: sipush 17043
      // 235: ldc2_w 2818002749547248045
      // 238: lload 2
      // 239: lxor
      // 23a: invokedynamic p (IJ)Ljava/lang/String; bsm=frs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23f: nop
      // 240: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 243: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 246: getstatic jgv$vro.ak0 Ljgv$vro;
      // 249: invokestatic zet.gn0 (Ljava/lang/String;Ljava/lang/String;Ljgv$vro;)V
      // 24c: aload 7
      // 24e: getfield ha9.zy5 Lftj;
      // 251: bipush 1
      // 252: putfield ftj.r04 Z
      // 255: goto 25c
      // 258: invokestatic frs.a (Loov;)Loov;
      // 25b: athrow
      // 25c: aload 7
      // 25e: getfield ha9.zy5 Lftj;
      // 261: getfield ftj.ubl I
      // 264: bipush 5
      // 265: iload 4
      // 267: ifeq 2ee
      // 26a: if_icmplt 2d9
      // 26d: goto 274
      // 270: invokestatic frs.a (Loov;)Loov;
      // 273: athrow
      // 274: aload 7
      // 276: getfield ha9.zy5 Lftj;
      // 279: getfield ftj.ijd Z
      // 27c: iload 4
      // 27e: ifeq 2e1
      // 281: goto 288
      // 284: invokestatic frs.a (Loov;)Loov;
      // 287: athrow
      // 288: ifne 2d9
      // 28b: goto 292
      // 28e: invokestatic frs.a (Loov;)Loov;
      // 291: athrow
      // 292: sipush 7308
      // 295: ldc2_w 3279266998768019381
      // 298: lload 2
      // 299: lxor
      // 29a: invokedynamic p (IJ)Ljava/lang/String; bsm=frs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29f: nop
      // 2a0: new java/lang/StringBuilder
      // 2a3: dup
      // 2a4: invokespecial java/lang/StringBuilder.<init> ()V
      // 2a7: aload 7
      // 2a9: invokevirtual ha9.noc ()Ljava/lang/String;
      // 2ac: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2af: sipush 23341
      // 2b2: ldc2_w 2673250530773557270
      // 2b5: lload 2
      // 2b6: lxor
      // 2b7: invokedynamic p (IJ)Ljava/lang/String; bsm=frs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2bc: nop
      // 2bd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2c0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2c3: getstatic jgv$vro.ak0 Ljgv$vro;
      // 2c6: invokestatic zet.gn0 (Ljava/lang/String;Ljava/lang/String;Ljgv$vro;)V
      // 2c9: aload 7
      // 2cb: getfield ha9.zy5 Lftj;
      // 2ce: bipush 1
      // 2cf: putfield ftj.ijd Z
      // 2d2: goto 2d9
      // 2d5: invokestatic frs.a (Loov;)Loov;
      // 2d8: athrow
      // 2d9: aload 7
      // 2db: getfield ha9.zy5 Lftj;
      // 2de: getfield ftj.n4o I
      // 2e1: iload 4
      // 2e3: ifeq 30c
      // 2e6: bipush 5
      // 2e7: goto 2ee
      // 2ea: invokestatic frs.a (Loov;)Loov;
      // 2ed: athrow
      // 2ee: if_icmplt 356
      // 2f1: aload 7
      // 2f3: getfield ha9.zy5 Lftj;
      // 2f6: iload 4
      // 2f8: ifeq 352
      // 2fb: goto 302
      // 2fe: invokestatic frs.a (Loov;)Loov;
      // 301: athrow
      // 302: getfield ftj.lj8 Z
      // 305: goto 30c
      // 308: invokestatic frs.a (Loov;)Loov;
      // 30b: athrow
      // 30c: ifne 356
      // 30f: sipush 7308
      // 312: ldc2_w 3279266998768019381
      // 315: lload 2
      // 316: lxor
      // 317: invokedynamic p (IJ)Ljava/lang/String; bsm=frs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31c: nop
      // 31d: new java/lang/StringBuilder
      // 320: dup
      // 321: invokespecial java/lang/StringBuilder.<init> ()V
      // 324: aload 7
      // 326: invokevirtual ha9.noc ()Ljava/lang/String;
      // 329: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 32c: sipush 7568
      // 32f: ldc2_w 6524018747399612072
      // 332: lload 2
      // 333: lxor
      // 334: invokedynamic p (IJ)Ljava/lang/String; bsm=frs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 339: nop
      // 33a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 33d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 340: getstatic jgv$vro.ak0 Ljgv$vro;
      // 343: invokestatic zet.gn0 (Ljava/lang/String;Ljava/lang/String;Ljgv$vro;)V
      // 346: aload 7
      // 348: getfield ha9.zy5 Lftj;
      // 34b: goto 352
      // 34e: invokestatic frs.a (Loov;)Loov;
      // 351: athrow
      // 352: bipush 1
      // 353: putfield ftj.lj8 Z
      // 356: iload 4
      // 358: ifne 01d
      // 35b: return
   }

   public static boolean b0y(ha9 param0) {
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
      // 05: getfield ha9.zy5 Lftj;
      // 08: getfield ftj.r04 Z
      // 0b: iload 1
      // 0c: ifne 52
      // 0f: ifne 51
      // 12: goto 19
      // 15: invokestatic frs.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield ha9.zy5 Lftj;
      // 1d: getfield ftj.ijd Z
      // 20: iload 1
      // 21: ifne 52
      // 24: goto 2b
      // 27: invokestatic frs.a (Loov;)Loov;
      // 2a: athrow
      // 2b: ifne 51
      // 2e: goto 35
      // 31: invokestatic frs.a (Loov;)Loov;
      // 34: athrow
      // 35: aload 0
      // 36: getfield ha9.zy5 Lftj;
      // 39: getfield ftj.lj8 Z
      // 3c: iload 1
      // 3d: ifne 52
      // 40: goto 47
      // 43: invokestatic frs.a (Loov;)Loov;
      // 46: athrow
      // 47: ifeq 55
      // 4a: goto 51
      // 4d: invokestatic frs.a (Loov;)Loov;
      // 50: athrow
      // 51: bipush 1
      // 52: goto 56
      // 55: bipush 0
      // 56: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7424600996706199349L, -7640329512968549128L, MethodHandles.lookup().lookupClass()).a(112803737339769L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 61273869857265L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[7];
      int var7 = 0;
      String var6 = "A\u0086\u009d+×=¸K\u0005) Ú\u0013å\u0013\u0087D³ÀRÜ\u0004·N9`Ã5ç7\u0001s\u0018æÞV\u0080º$]&Ñ\u0099\u0095± 6OF`ì#jcRÔ\u0085 ?¶\u0003?%\u0002é\u0099½ªæÒ}Iay/ªÃí\u0087h¶i\u001a³¯_\u0000ÐJ>\u0018Ï\":3°\u0083v\u0004Jí\u0000\u0006\u0095\u0086-!\u001dHø\u008e³¡¡º\u0010n\u0092~\u0094¢±\u0002Îãz\u0003¥L\bw\u0097";
      int var8 = "A\u0086\u009d+×=¸K\u0005) Ú\u0013å\u0013\u0087D³ÀRÜ\u0004·N9`Ã5ç7\u0001s\u0018æÞV\u0080º$]&Ñ\u0099\u0095± 6OF`ì#jcRÔ\u0085 ?¶\u0003?%\u0002é\u0099½ªæÒ}Iay/ªÃí\u0087h¶i\u001a³¯_\u0000ÐJ>\u0018Ï\":3°\u0083v\u0004Jí\u0000\u0006\u0095\u0086-!\u001dHø\u008e³¡¡º\u0010n\u0092~\u0094¢±\u0002Îãz\u0003¥L\bw\u0097"
         .length();
      char var5 = ' ';
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
                     f = var9;
                     g = new String[7];
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

                  var6 = "c9äÊ\"Ý2:\u0082f¾2âh¦\u0000p°|G\u0002³ku\u0080ü=\u008bscì\n 'mY\fIÄ¯Ø\u0098à¥\u0018¦L3T\u007fX0b¦¦+B<\u0017\u0085(s\u0016¹÷";
                  var8 = "c9äÊ\"Ý2:\u0082f¾2âh¦\u0000p°|G\u0002³ku\u0080ü=\u008bscì\n 'mY\fIÄ¯Ø\u0098à¥\u0018¦L3T\u007fX0b¦¦+B<\u0017\u0085(s\u0016¹÷".length();
                  var5 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 3788;
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
            throw new RuntimeException("frs", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = f[var5].getBytes("ISO-8859-1");
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
         throw new RuntimeException("frs" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
