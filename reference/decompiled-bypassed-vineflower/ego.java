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

public class ego extends rsh {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public ego(t9d var1) {
      super(var1);
   }

   @Override
   public void gwt() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic ego.a J
      // 003: ldc2_w 5669039876261
      // 006: lxor
      // 007: lstore 1
      // 008: aload 0
      // 009: invokespecial rsh.gwt ()V
      // 00c: invokestatic t9d.c ()I
      // 00f: aload 0
      // 010: dup
      // 011: getfield ego.b0d I
      // 014: bipush 1
      // 015: iadd
      // 016: putfield ego.b0d I
      // 019: istore 3
      // 01a: aload 0
      // 01b: getfield ego.bk1 Lt9d;
      // 01e: invokevirtual t9d.p2b ()J
      // 021: lstore 4
      // 023: lload 4
      // 025: ldc2_w 24000
      // 028: ldiv
      // 029: lconst_1
      // 02a: ladd
      // 02b: lstore 6
      // 02d: aload 0
      // 02e: iload 3
      // 02f: ifne 07a
      // 032: getfield ego.fdl Z
      // 035: ifne 079
      // 038: goto 03f
      // 03b: invokestatic ego.a (Loov;)Loov;
      // 03e: athrow
      // 03f: aload 0
      // 040: iload 3
      // 041: ifne 07a
      // 044: goto 04b
      // 047: invokestatic ego.a (Loov;)Loov;
      // 04a: athrow
      // 04b: getfield ego.b0d I
      // 04e: bipush 20
      // 050: if_icmple 079
      // 053: goto 05a
      // 056: invokestatic ego.a (Loov;)Loov;
      // 059: athrow
      // 05a: aload 0
      // 05b: bipush 1
      // 05c: putfield ego.fdl Z
      // 05f: aload 0
      // 060: getfield ego.rpl Lz96;
      // 063: getfield z96.rhh Lmlk;
      // 066: new net/minecraft/network/play/server/S2BPacketChangeGameState
      // 069: dup
      // 06a: bipush 5
      // 06b: fconst_0
      // 06c: invokespecial net/minecraft/network/play/server/S2BPacketChangeGameState.<init> (IF)V
      // 06f: invokevirtual mlk.vnf (Lmz2;)V
      // 072: goto 079
      // 075: invokestatic ego.a (Loov;)Loov;
      // 078: athrow
      // 079: aload 0
      // 07a: lload 4
      // 07c: ldc2_w 120500
      // 07f: lcmp
      // 080: iload 3
      // 081: ifne 08f
      // 084: ifle 092
      // 087: goto 08e
      // 08a: invokestatic ego.a (Loov;)Loov;
      // 08d: athrow
      // 08e: bipush 1
      // 08f: goto 093
      // 092: bipush 0
      // 093: putfield ego.yub Z
      // 096: aload 0
      // 097: getfield ego.yub Z
      // 09a: iload 3
      // 09b: ifne 0c3
      // 09e: ifeq 0b9
      // 0a1: goto 0a8
      // 0a4: invokestatic ego.a (Loov;)Loov;
      // 0a7: athrow
      // 0a8: aload 0
      // 0a9: dup
      // 0aa: getfield ego.nbm I
      // 0ad: bipush 1
      // 0ae: iadd
      // 0af: putfield ego.nbm I
      // 0b2: goto 0b9
      // 0b5: invokestatic ego.a (Loov;)Loov;
      // 0b8: athrow
      // 0b9: lload 4
      // 0bb: ldc2_w 24000
      // 0be: lrem
      // 0bf: ldc2_w 500
      // 0c2: lcmp
      // 0c3: iload 3
      // 0c4: ifne 129
      // 0c7: ifne 11e
      // 0ca: goto 0d1
      // 0cd: invokestatic ego.a (Loov;)Loov;
      // 0d0: athrow
      // 0d1: lload 6
      // 0d3: ldc2_w 6
      // 0d6: lcmp
      // 0d7: ifgt 233
      // 0da: goto 0e1
      // 0dd: invokestatic ego.a (Loov;)Loov;
      // 0e0: athrow
      // 0e1: aload 0
      // 0e2: getfield ego.rpl Lz96;
      // 0e5: new hsu
      // 0e8: dup
      // 0e9: new java/lang/StringBuilder
      // 0ec: dup
      // 0ed: invokespecial java/lang/StringBuilder.<init> ()V
      // 0f0: sipush 3474
      // 0f3: ldc2_w 6709841402517011638
      // 0f6: lload 1
      // 0f7: lxor
      // 0f8: invokedynamic w (IJ)Ljava/lang/String; bsm=ego.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fd: nop
      // 0fe: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 101: lload 6
      // 103: invokevirtual java/lang/StringBuilder.append (J)Ljava/lang/StringBuilder;
      // 106: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 109: bipush 0
      // 10a: anewarray 96
      // 10d: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 110: invokevirtual z96.a0d (Lekw;)V
      // 113: iload 3
      // 114: ifeq 233
      // 117: goto 11e
      // 11a: invokestatic ego.a (Loov;)Loov;
      // 11d: athrow
      // 11e: lload 6
      // 120: lconst_1
      // 121: lcmp
      // 122: goto 129
      // 125: invokestatic ego.a (Loov;)Loov;
      // 128: athrow
      // 129: iload 3
      // 12a: ifne 1ea
      // 12d: ifne 1dd
      // 130: goto 137
      // 133: invokestatic ego.a (Loov;)Loov;
      // 136: athrow
      // 137: lload 4
      // 139: ldc2_w 100
      // 13c: lcmp
      // 13d: iload 3
      // 13e: ifne 17f
      // 141: goto 148
      // 144: invokestatic ego.a (Loov;)Loov;
      // 147: athrow
      // 148: ifne 172
      // 14b: goto 152
      // 14e: invokestatic ego.a (Loov;)Loov;
      // 151: athrow
      // 152: aload 0
      // 153: getfield ego.rpl Lz96;
      // 156: getfield z96.rhh Lmlk;
      // 159: new net/minecraft/network/play/server/S2BPacketChangeGameState
      // 15c: dup
      // 15d: bipush 5
      // 15e: ldc 101.0
      // 160: nop
      // 161: invokespecial net/minecraft/network/play/server/S2BPacketChangeGameState.<init> (IF)V
      // 164: invokevirtual mlk.vnf (Lmz2;)V
      // 167: iload 3
      // 168: ifeq 233
      // 16b: goto 172
      // 16e: invokestatic ego.a (Loov;)Loov;
      // 171: athrow
      // 172: lload 4
      // 174: ldc2_w 175
      // 177: lcmp
      // 178: goto 17f
      // 17b: invokestatic ego.a (Loov;)Loov;
      // 17e: athrow
      // 17f: iload 3
      // 180: ifne 1ba
      // 183: ifne 1ad
      // 186: goto 18d
      // 189: invokestatic ego.a (Loov;)Loov;
      // 18c: athrow
      // 18d: aload 0
      // 18e: getfield ego.rpl Lz96;
      // 191: getfield z96.rhh Lmlk;
      // 194: new net/minecraft/network/play/server/S2BPacketChangeGameState
      // 197: dup
      // 198: bipush 5
      // 199: ldc 102.0
      // 19b: nop
      // 19c: invokespecial net/minecraft/network/play/server/S2BPacketChangeGameState.<init> (IF)V
      // 19f: invokevirtual mlk.vnf (Lmz2;)V
      // 1a2: iload 3
      // 1a3: ifeq 233
      // 1a6: goto 1ad
      // 1a9: invokestatic ego.a (Loov;)Loov;
      // 1ac: athrow
      // 1ad: lload 4
      // 1af: ldc2_w 250
      // 1b2: lcmp
      // 1b3: goto 1ba
      // 1b6: invokestatic ego.a (Loov;)Loov;
      // 1b9: athrow
      // 1ba: ifne 233
      // 1bd: aload 0
      // 1be: getfield ego.rpl Lz96;
      // 1c1: getfield z96.rhh Lmlk;
      // 1c4: new net/minecraft/network/play/server/S2BPacketChangeGameState
      // 1c7: dup
      // 1c8: bipush 5
      // 1c9: ldc 103.0
      // 1cb: nop
      // 1cc: invokespecial net/minecraft/network/play/server/S2BPacketChangeGameState.<init> (IF)V
      // 1cf: invokevirtual mlk.vnf (Lmz2;)V
      // 1d2: iload 3
      // 1d3: ifeq 233
      // 1d6: goto 1dd
      // 1d9: invokestatic ego.a (Loov;)Loov;
      // 1dc: athrow
      // 1dd: lload 6
      // 1df: ldc2_w 5
      // 1e2: lcmp
      // 1e3: goto 1ea
      // 1e6: invokestatic ego.a (Loov;)Loov;
      // 1e9: athrow
      // 1ea: iload 3
      // 1eb: ifne 209
      // 1ee: ifne 233
      // 1f1: goto 1f8
      // 1f4: invokestatic ego.a (Loov;)Loov;
      // 1f7: athrow
      // 1f8: lload 4
      // 1fa: ldc2_w 24000
      // 1fd: lrem
      // 1fe: ldc2_w 22000
      // 201: lcmp
      // 202: goto 209
      // 205: invokestatic ego.a (Loov;)Loov;
      // 208: athrow
      // 209: ifne 233
      // 20c: aload 0
      // 20d: getfield ego.rpl Lz96;
      // 210: new hsu
      // 213: dup
      // 214: sipush 18923
      // 217: ldc2_w 2929586226487589070
      // 21a: lload 1
      // 21b: lxor
      // 21c: invokedynamic w (IJ)Ljava/lang/String; bsm=ego.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 221: nop
      // 222: bipush 0
      // 223: anewarray 96
      // 226: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 229: invokevirtual z96.a0d (Lekw;)V
      // 22c: goto 233
      // 22f: invokestatic ego.a (Loov;)Loov;
      // 232: athrow
      // 233: return
   }

   private void f95() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic ego.a J
      // 03: ldc2_w 74401330463108
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic t9d.b ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: iload 3
      // 0e: ifeq 48
      // 11: getfield ego.nbm I
      // 14: bipush 100
      // 16: if_icmple 4c
      // 19: goto 20
      // 1c: invokestatic ego.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 0
      // 21: getfield ego.rpl Lz96;
      // 24: new hsu
      // 27: dup
      // 28: sipush 23366
      // 2b: ldc2_w 6723031923907019584
      // 2e: lload 1
      // 2f: lxor
      // 30: invokedynamic w (IJ)Ljava/lang/String; bsm=ego.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: nop
      // 36: bipush 0
      // 37: anewarray 96
      // 3a: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 3d: invokevirtual z96.a0d (Lekw;)V
      // 40: aload 0
      // 41: goto 48
      // 44: invokestatic ego.a (Loov;)Loov;
      // 47: athrow
      // 48: bipush 0
      // 49: putfield ego.nbm I
      // 4c: return
   }

   @Override
   public void o29(mew param1, vt2 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: aload 0
      // 05: iload 3
      // 06: ifne 2d
      // 09: getfield ego.yub Z
      // 0c: ifeq 25
      // 0f: goto 16
      // 12: invokestatic ego.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: invokespecial ego.f95 ()V
      // 1a: iload 3
      // 1b: ifeq 32
      // 1e: goto 25
      // 21: invokestatic ego.a (Loov;)Loov;
      // 24: athrow
      // 25: aload 0
      // 26: goto 2d
      // 29: invokestatic ego.a (Loov;)Loov;
      // 2c: athrow
      // 2d: aload 1
      // 2e: aload 2
      // 2f: invokespecial rsh.o29 (Lmew;Lvt2;)V
      // 32: return
   }

   @Override
   public void z8m(mew param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifeq 1e
      // 09: getfield ego.yub Z
      // 0c: ifne 22
      // 0f: goto 16
      // 12: invokestatic ego.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: goto 1e
      // 1a: invokestatic ego.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 1
      // 1f: invokespecial rsh.z8m (Lmew;)V
      // 22: return
   }

   @Override
   public boolean s4o(mew param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifne 1f
      // 09: getfield ego.yub Z
      // 0c: ifeq 1e
      // 0f: goto 16
      // 12: invokestatic ego.a (Loov;)Loov;
      // 15: athrow
      // 16: bipush 0
      // 17: goto 23
      // 1a: invokestatic ego.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: aload 1
      // 20: invokespecial rsh.s4o (Lmew;)Z
      // 23: ireturn
   }

   @Override
   public boolean mn_(ha9 param1, t9d param2, erg param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 4
      // 05: aload 0
      // 06: getfield ego.yub Z
      // 09: iload 4
      // 0b: ifeq 29
      // 0e: ifeq 22
      // 11: goto 18
      // 14: invokestatic ego.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: invokespecial ego.f95 ()V
      // 1c: bipush 0
      // 1d: ireturn
      // 1e: invokestatic ego.a (Loov;)Loov;
      // 21: athrow
      // 22: aload 0
      // 23: aload 1
      // 24: aload 2
      // 25: aload 3
      // 26: invokespecial rsh.mn_ (Lha9;Lt9d;Lerg;)Z
      // 29: ireturn
   }

   @Override
   public boolean nh0(ha9 param1, t9d param2, erg param3, mew param4, vt2 param5, float param6, float param7, float param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 9
      // 05: aload 0
      // 06: getfield ego.yub Z
      // 09: iload 9
      // 0b: ifeq 33
      // 0e: ifeq 22
      // 11: goto 18
      // 14: invokestatic ego.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: invokespecial ego.f95 ()V
      // 1c: bipush 0
      // 1d: ireturn
      // 1e: invokestatic ego.a (Loov;)Loov;
      // 21: athrow
      // 22: aload 0
      // 23: aload 1
      // 24: aload 2
      // 25: aload 3
      // 26: aload 4
      // 28: aload 5
      // 2a: fload 6
      // 2c: fload 7
      // 2e: fload 8
      // 30: invokespecial rsh.nh0 (Lha9;Lt9d;Lerg;Lmew;Lvt2;FFF)Z
      // 33: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(4930345785388305091L, 3109082369812088316L, MethodHandles.lookup().lookupClass()).a(36169801848384L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 64269139005544L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[3];
      int var7 = 0;
      String var6 = "j7Ú\u001a\u0010¼%ªý·æè\u0014Ò1\u0007\"\u0001è*ô\n9\u0006ùPµò\u0099®\u001dL\tÙ\u00881\u0081.\"o TÖÀôâ\u009f\u0099\u008d2ÝÒ\u001f`\u0004D¥0_\u008c¸\u009b\u008d\u000e\u009f2ÿ\u0089g}ü{Ã ÃI\u0011V\r§ÿ]\u0004Ï\u0004®¿\u008aì^=\u009a\u0002H³\u009bÀ(\u000efé\u0089 þÈT";
      int var8 = "j7Ú\u001a\u0010¼%ªý·æè\u0014Ò1\u0007\"\u0001è*ô\n9\u0006ùPµò\u0099®\u001dL\tÙ\u00881\u0081.\"o TÖÀôâ\u009f\u0099\u008d2ÝÒ\u001f`\u0004D¥0_\u008c¸\u009b\u008d\u000e\u009f2ÿ\u0089g}ü{Ã ÃI\u0011V\r§ÿ]\u0004Ï\u0004®¿\u008aì^=\u009a\u0002H³\u009bÀ(\u000efé\u0089 þÈT"
         .length();
      char var5 = '(';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[3];
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 10256;
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
            throw new RuntimeException("ego", var10);
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
         throw new RuntimeException("ego" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
