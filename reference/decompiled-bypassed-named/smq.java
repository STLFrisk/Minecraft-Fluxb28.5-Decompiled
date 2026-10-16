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

public class smq extends Module {
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public smq() {
      long var1 = a ^ 103333878499076L;
      super(b<"j">(28026, 2481100454485061679L ^ var1), _aj.i9j, false, new SubEngine[0]);
   }

   @EventHandler
   public void w0y(TickEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic smq.a J
      // 003: ldc2_w 11419421230417
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 4
      // 00d: invokestatic j83.v1z ()Lj83$ip8;
      // 010: getstatic j83$ip8.z2b Lj83$ip8;
      // 013: if_acmpne 45c
      // 016: aload 0
      // 017: new java/lang/StringBuilder
      // 01a: dup
      // 01b: invokespecial java/lang/StringBuilder.<init> ()V
      // 01e: aload 0
      // 01f: invokevirtual smq.m2d ()Ljava/lang/String;
      // 022: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 025: sipush 7380
      // 028: ldc2_w 1296387614063215568
      // 02b: lload 2
      // 02c: lxor
      // 02d: invokedynamic j (IJ)Ljava/lang/String; bsm=smq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 032: nop
      // 033: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 036: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 039: invokevirtual smq.n5o (Ljava/lang/String;)V
      // 03c: getstatic ModuleRegistry.vuo Ljava/util/ArrayList;
      // 03f: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 042: astore 5
      // 044: aload 5
      // 046: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 04b: ifeq 45c
      // 04e: aload 5
      // 050: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 055: checkcast Module
      // 058: astore 6
      // 05a: aload 6
      // 05c: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 05f: astore 7
      // 061: aload 7
      // 063: ldc AntiBots
      // 065: nop
      // 066: iload 4
      // 068: ifeq 0a2
      // 06b: if_acmpne 09d
      // 06e: goto 075
      // 071: invokestatic smq.a (Loov;)Loov;
      // 074: athrow
      // 075: aload 6
      // 077: iload 4
      // 079: ifeq 099
      // 07c: goto 083
      // 07f: invokestatic smq.a (Loov;)Loov;
      // 082: athrow
      // 083: invokevirtual Module.isEnabled ()Z
      // 086: ifne 09d
      // 089: goto 090
      // 08c: invokestatic smq.a (Loov;)Loov;
      // 08f: athrow
      // 090: aload 6
      // 092: goto 099
      // 095: invokestatic smq.a (Loov;)Loov;
      // 098: athrow
      // 099: bipush 1
      // 09a: invokevirtual Module.onEnabledChanged (Z)V
      // 09d: aload 7
      // 09f: ldc v3p
      // 0a1: nop
      // 0a2: iload 4
      // 0a4: ifeq 0bd
      // 0a7: if_acmpeq 16e
      // 0aa: goto 0b1
      // 0ad: invokestatic smq.a (Loov;)Loov;
      // 0b0: athrow
      // 0b1: aload 7
      // 0b3: ldc Speed
      // 0b5: nop
      // 0b6: goto 0bd
      // 0b9: invokestatic smq.a (Loov;)Loov;
      // 0bc: athrow
      // 0bd: iload 4
      // 0bf: ifeq 0d8
      // 0c2: if_acmpeq 16e
      // 0c5: goto 0cc
      // 0c8: invokestatic smq.a (Loov;)Loov;
      // 0cb: athrow
      // 0cc: aload 7
      // 0ce: ldc Fly
      // 0d0: nop
      // 0d1: goto 0d8
      // 0d4: invokestatic smq.a (Loov;)Loov;
      // 0d7: athrow
      // 0d8: iload 4
      // 0da: ifeq 0f3
      // 0dd: if_acmpeq 16e
      // 0e0: goto 0e7
      // 0e3: invokestatic smq.a (Loov;)Loov;
      // 0e6: athrow
      // 0e7: aload 7
      // 0e9: ldc q98
      // 0eb: nop
      // 0ec: goto 0f3
      // 0ef: invokestatic smq.a (Loov;)Loov;
      // 0f2: athrow
      // 0f3: iload 4
      // 0f5: ifeq 10e
      // 0f8: if_acmpeq 16e
      // 0fb: goto 102
      // 0fe: invokestatic smq.a (Loov;)Loov;
      // 101: athrow
      // 102: aload 7
      // 104: ldc iri
      // 106: nop
      // 107: goto 10e
      // 10a: invokestatic smq.a (Loov;)Loov;
      // 10d: athrow
      // 10e: iload 4
      // 110: ifeq 129
      // 113: if_acmpeq 16e
      // 116: goto 11d
      // 119: invokestatic smq.a (Loov;)Loov;
      // 11c: athrow
      // 11d: aload 7
      // 11f: ldc jqz
      // 121: nop
      // 122: goto 129
      // 125: invokestatic smq.a (Loov;)Loov;
      // 128: athrow
      // 129: iload 4
      // 12b: ifeq 144
      // 12e: if_acmpeq 16e
      // 131: goto 138
      // 134: invokestatic smq.a (Loov;)Loov;
      // 137: athrow
      // 138: aload 7
      // 13a: ldc Scaffold
      // 13c: nop
      // 13d: goto 144
      // 140: invokestatic smq.a (Loov;)Loov;
      // 143: athrow
      // 144: iload 4
      // 146: ifeq 15f
      // 149: if_acmpeq 16e
      // 14c: goto 153
      // 14f: invokestatic smq.a (Loov;)Loov;
      // 152: athrow
      // 153: aload 7
      // 155: ldc AntiBots
      // 157: nop
      // 158: goto 15f
      // 15b: invokestatic smq.a (Loov;)Loov;
      // 15e: athrow
      // 15f: iload 4
      // 161: ifeq 21a
      // 164: if_acmpne 20e
      // 167: goto 16e
      // 16a: invokestatic smq.a (Loov;)Loov;
      // 16d: athrow
      // 16e: aload 6
      // 170: invokevirtual Module.isEnabled ()Z
      // 173: iload 4
      // 175: ifeq 1b2
      // 178: goto 17f
      // 17b: invokestatic smq.a (Loov;)Loov;
      // 17e: athrow
      // 17f: ifeq 45c
      // 182: goto 189
      // 185: invokestatic smq.a (Loov;)Loov;
      // 188: athrow
      // 189: aload 6
      // 18b: invokevirtual Module.smu ()Lc_3;
      // 18e: sipush 6285
      // 191: ldc2_w 5752187703740385164
      // 194: lload 2
      // 195: lxor
      // 196: invokedynamic j (IJ)Ljava/lang/String; bsm=smq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19b: nop
      // 19c: iload 4
      // 19e: ifeq 1cf
      // 1a1: goto 1a8
      // 1a4: invokestatic smq.a (Loov;)Loov;
      // 1a7: athrow
      // 1a8: invokevirtual ModeSetting.isAllowedValue (Ljava/lang/String;)Z
      // 1ab: goto 1b2
      // 1ae: invokestatic smq.a (Loov;)Loov;
      // 1b1: athrow
      // 1b2: ifne 45c
      // 1b5: aload 6
      // 1b7: invokevirtual Module.smu ()Lc_3;
      // 1ba: sipush 3156
      // 1bd: ldc2_w 1105499035030934353
      // 1c0: lload 2
      // 1c1: lxor
      // 1c2: invokedynamic j (IJ)Ljava/lang/String; bsm=smq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c7: nop
      // 1c8: goto 1cf
      // 1cb: invokestatic smq.a (Loov;)Loov;
      // 1ce: athrow
      // 1cf: invokevirtual ModeSetting.setValue (Ljava/lang/String;)V
      // 1d2: new java/lang/StringBuilder
      // 1d5: dup
      // 1d6: invokespecial java/lang/StringBuilder.<init> ()V
      // 1d9: sipush 19652
      // 1dc: ldc2_w 7759433138339615682
      // 1df: lload 2
      // 1e0: lxor
      // 1e1: invokedynamic j (IJ)Ljava/lang/String; bsm=smq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e6: nop
      // 1e7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ea: aload 6
      // 1ec: invokevirtual Module.m2d ()Ljava/lang/String;
      // 1ef: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f2: sipush 31979
      // 1f5: ldc2_w 8925076418879005672
      // 1f8: lload 2
      // 1f9: lxor
      // 1fa: invokedynamic j (IJ)Ljava/lang/String; bsm=smq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ff: nop
      // 200: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 203: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 206: invokestatic q0r.tq3 (Ljava/lang/String;)V
      // 209: iload 4
      // 20b: ifne 45c
      // 20e: aload 7
      // 210: ldc qzx
      // 212: nop
      // 213: goto 21a
      // 216: invokestatic smq.a (Loov;)Loov;
      // 219: athrow
      // 21a: iload 4
      // 21c: ifeq 22e
      // 21f: if_acmpeq 044
      // 222: goto 229
      // 225: invokestatic smq.a (Loov;)Loov;
      // 228: athrow
      // 229: aload 7
      // 22b: ldc xu_
      // 22d: nop
      // 22e: iload 4
      // 230: ifeq 242
      // 233: if_acmpeq 044
      // 236: goto 23d
      // 239: invokestatic smq.a (Loov;)Loov;
      // 23c: athrow
      // 23d: aload 7
      // 23f: ldc ryb
      // 241: nop
      // 242: iload 4
      // 244: ifeq 256
      // 247: if_acmpeq 044
      // 24a: goto 251
      // 24d: invokestatic smq.a (Loov;)Loov;
      // 250: athrow
      // 251: aload 7
      // 253: ldc m57
      // 255: nop
      // 256: iload 4
      // 258: ifeq 26a
      // 25b: if_acmpeq 044
      // 25e: goto 265
      // 261: invokestatic smq.a (Loov;)Loov;
      // 264: athrow
      // 265: aload 7
      // 267: ldc KillAura
      // 269: nop
      // 26a: iload 4
      // 26c: ifeq 27e
      // 26f: if_acmpeq 044
      // 272: goto 279
      // 275: invokestatic smq.a (Loov;)Loov;
      // 278: athrow
      // 279: aload 7
      // 27b: ldc ee_
      // 27d: nop
      // 27e: iload 4
      // 280: ifeq 292
      // 283: if_acmpeq 044
      // 286: goto 28d
      // 289: invokestatic smq.a (Loov;)Loov;
      // 28c: athrow
      // 28d: aload 7
      // 28f: ldc vxv
      // 291: nop
      // 292: iload 4
      // 294: ifeq 2a6
      // 297: if_acmpeq 044
      // 29a: goto 2a1
      // 29d: invokestatic smq.a (Loov;)Loov;
      // 2a0: athrow
      // 2a1: aload 7
      // 2a3: ldc Velocity
      // 2a5: nop
      // 2a6: iload 4
      // 2a8: ifeq 2ba
      // 2ab: if_acmpeq 044
      // 2ae: goto 2b5
      // 2b1: invokestatic smq.a (Loov;)Loov;
      // 2b4: athrow
      // 2b5: aload 7
      // 2b7: ldc gnq
      // 2b9: nop
      // 2ba: iload 4
      // 2bc: ifeq 2ce
      // 2bf: if_acmpeq 044
      // 2c2: goto 2c9
      // 2c5: invokestatic smq.a (Loov;)Loov;
      // 2c8: athrow
      // 2c9: aload 7
      // 2cb: ldc qkq
      // 2cd: nop
      // 2ce: iload 4
      // 2d0: ifeq 2e2
      // 2d3: if_acmpeq 044
      // 2d6: goto 2dd
      // 2d9: invokestatic smq.a (Loov;)Loov;
      // 2dc: athrow
      // 2dd: aload 7
      // 2df: ldc x48
      // 2e1: nop
      // 2e2: iload 4
      // 2e4: ifeq 2f6
      // 2e7: if_acmpeq 044
      // 2ea: goto 2f1
      // 2ed: invokestatic smq.a (Loov;)Loov;
      // 2f0: athrow
      // 2f1: aload 7
      // 2f3: ldc j7s
      // 2f5: nop
      // 2f6: iload 4
      // 2f8: ifeq 30a
      // 2fb: if_acmpeq 044
      // 2fe: goto 305
      // 301: invokestatic smq.a (Loov;)Loov;
      // 304: athrow
      // 305: aload 7
      // 307: ldc kqz
      // 309: nop
      // 30a: iload 4
      // 30c: ifeq 31e
      // 30f: if_acmpeq 044
      // 312: goto 319
      // 315: invokestatic smq.a (Loov;)Loov;
      // 318: athrow
      // 319: aload 7
      // 31b: ldc ixd
      // 31d: nop
      // 31e: iload 4
      // 320: ifeq 332
      // 323: if_acmpeq 044
      // 326: goto 32d
      // 329: invokestatic smq.a (Loov;)Loov;
      // 32c: athrow
      // 32d: aload 7
      // 32f: ldc p2c
      // 331: nop
      // 332: iload 4
      // 334: ifeq 346
      // 337: if_acmpeq 044
      // 33a: goto 341
      // 33d: invokestatic smq.a (Loov;)Loov;
      // 340: athrow
      // 341: aload 7
      // 343: ldc cf5
      // 345: nop
      // 346: iload 4
      // 348: ifeq 35a
      // 34b: if_acmpeq 044
      // 34e: goto 355
      // 351: invokestatic smq.a (Loov;)Loov;
      // 354: athrow
      // 355: aload 7
      // 357: ldc _ur
      // 359: nop
      // 35a: iload 4
      // 35c: ifeq 36e
      // 35f: if_acmpeq 044
      // 362: goto 369
      // 365: invokestatic smq.a (Loov;)Loov;
      // 368: athrow
      // 369: aload 7
      // 36b: ldc lz3
      // 36d: nop
      // 36e: iload 4
      // 370: ifeq 382
      // 373: if_acmpeq 044
      // 376: goto 37d
      // 379: invokestatic smq.a (Loov;)Loov;
      // 37c: athrow
      // 37d: aload 7
      // 37f: ldc py5
      // 381: nop
      // 382: iload 4
      // 384: ifeq 396
      // 387: if_acmpeq 044
      // 38a: goto 391
      // 38d: invokestatic smq.a (Loov;)Loov;
      // 390: athrow
      // 391: aload 7
      // 393: ldc x3i
      // 395: nop
      // 396: iload 4
      // 398: ifeq 3aa
      // 39b: if_acmpeq 044
      // 39e: goto 3a5
      // 3a1: invokestatic smq.a (Loov;)Loov;
      // 3a4: athrow
      // 3a5: aload 7
      // 3a7: ldc rr2
      // 3a9: nop
      // 3aa: iload 4
      // 3ac: ifeq 3be
      // 3af: if_acmpeq 044
      // 3b2: goto 3b9
      // 3b5: invokestatic smq.a (Loov;)Loov;
      // 3b8: athrow
      // 3b9: aload 7
      // 3bb: ldc pjd
      // 3bd: nop
      // 3be: iload 4
      // 3c0: ifeq 3d2
      // 3c3: if_acmpeq 044
      // 3c6: goto 3cd
      // 3c9: invokestatic smq.a (Loov;)Loov;
      // 3cc: athrow
      // 3cd: aload 7
      // 3cf: ldc sm0
      // 3d1: nop
      // 3d2: iload 4
      // 3d4: ifeq 3e6
      // 3d7: if_acmpeq 044
      // 3da: goto 3e1
      // 3dd: invokestatic smq.a (Loov;)Loov;
      // 3e0: athrow
      // 3e1: aload 7
      // 3e3: ldc pqs
      // 3e5: nop
      // 3e6: if_acmpeq 044
      // 3e9: aload 6
      // 3eb: invokevirtual Module.oxx ()L_aj;
      // 3ee: getstatic _aj.z3a L_aj;
      // 3f1: iload 4
      // 3f3: ifeq 414
      // 3f6: if_acmpeq 044
      // 3f9: goto 400
      // 3fc: invokestatic smq.a (Loov;)Loov;
      // 3ff: athrow
      // 400: aload 6
      // 402: iload 4
      // 404: ifeq 41c
      // 407: invokevirtual Module.oxx ()L_aj;
      // 40a: getstatic _aj.twm L_aj;
      // 40d: goto 414
      // 410: invokestatic smq.a (Loov;)Loov;
      // 413: athrow
      // 414: if_acmpne 41a
      // 417: goto 044
      // 41a: aload 6
      // 41c: bipush 0
      // 41d: invokevirtual Module.onEnabledChanged (Z)V
      // 420: new java/lang/StringBuilder
      // 423: dup
      // 424: invokespecial java/lang/StringBuilder.<init> ()V
      // 427: sipush 6389
      // 42a: ldc2_w 3932471674651723767
      // 42d: lload 2
      // 42e: lxor
      // 42f: invokedynamic j (IJ)Ljava/lang/String; bsm=smq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 434: nop
      // 435: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 438: aload 6
      // 43a: invokevirtual Module.m2d ()Ljava/lang/String;
      // 43d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 440: sipush 21186
      // 443: ldc2_w 3333439883461856709
      // 446: lload 2
      // 447: lxor
      // 448: invokedynamic j (IJ)Ljava/lang/String; bsm=smq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44d: nop
      // 44e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 451: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 454: invokestatic q0r.tq3 (Ljava/lang/String;)V
      // 457: iload 4
      // 459: ifne 044
      // 45c: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7909316678965477165L, 4225593635324070095L, MethodHandles.lookup().lookupClass()).a(128568119394598L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 64039890429432L;
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
      String var6 = "ë¹ù\u001c\rF\u009cnö\u0018\u0019\u001c|ÎÀ\u008amÄ\u0019¶¦±\u0018¿÷VÝ]Ýýõ@\u0010Åz2\u001e.j»vã»\u0004w\u001aaô!(\nì\u0006ÂjÊmO>ÿHaÑ\u0094N\u0011î\u0096xJ¥&\u008d3 × 5ÇÉ]á2ÄI\u0081ì ¿Ô(û,\u0095=T\u00168\u0004\nB\u0080;Bxp.Ï\u0003§}\u0012q\f\u0012\u001f.X\u0088b\u00185ýNä&ë¥%îH ê¼#\u009eJ)Ëe%h[%wÃð¸/`\u0018M\u009c\u0006\u0004®zqHf_\u009es\u0005\u0010m]BÂWâ¹\u0017\u0087ª\u001aeìù\u001cÔ";
      int var8 = "ë¹ù\u001c\rF\u009cnö\u0018\u0019\u001c|ÎÀ\u008amÄ\u0019¶¦±\u0018¿÷VÝ]Ýýõ@\u0010Åz2\u001e.j»vã»\u0004w\u001aaô!(\nì\u0006ÂjÊmO>ÿHaÑ\u0094N\u0011î\u0096xJ¥&\u008d3 × 5ÇÉ]á2ÄI\u0081ì ¿Ô(û,\u0095=T\u00168\u0004\nB\u0080;Bxp.Ï\u0003§}\u0012q\f\u0012\u001f.X\u0088b\u00185ýNä&ë¥%îH ê¼#\u009eJ)Ëe%h[%wÃð¸/`\u0018M\u009c\u0006\u0004®zqHf_\u009es\u0005\u0010m]BÂWâ¹\u0017\u0087ª\u001aeìù\u001cÔ"
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
                     g = new String[8];
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

                  var6 = "\u007f6É®G`QàXê}\u009eô\u00149\u008fä|y®c?\u007f]ÏiIp=\u0091sf/&4Ü\u0010u\u0007\u008b z\fÓÂ¤\u0090Æ\u0005\t&\u0019³?(_\u0006\u009fõoïYô\u0099ÁÌÃhµZf\u00907";
                  var8 = "\u007f6É®G`QàXê}\u009eô\u00149\u008fä|y®c?\u007f]ÏiIp=\u0091sf/&4Ü\u0010u\u0007\u008b z\fÓÂ¤\u0090Æ\u0005\t&\u0019³?(_\u0006\u009fõoïYô\u0099ÁÌÃhµZf\u00907"
                     .length();
                  var5 = '(';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 27941;
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
            throw new RuntimeException("smq", var10);
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
         throw new RuntimeException("smq" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
