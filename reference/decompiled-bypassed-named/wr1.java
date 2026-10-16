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

@dr9$x0j(
   t2u = "preset",
   io4 = {"list", "load <name>", "add <name> [mods(true/false)] [settings(true/false)] [binds(true/false)]", "delete <name>"},
   hjc = "Manage presets"
)
public class wr1 extends HwidProvider {
   private static final long a;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   @Override
   public void xjl(String[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic wr1.a J
      // 003: ldc2_w 91097346315492
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 4
      // 00d: aload 1
      // 00e: arraylength
      // 00f: iload 4
      // 011: ifne 03c
      // 014: bipush 1
      // 015: if_icmpge 028
      // 018: goto 01f
      // 01b: invokestatic wr1.a (Loov;)Loov;
      // 01e: athrow
      // 01f: aload 0
      // 020: invokevirtual wr1.dhs ()V
      // 023: return
      // 024: invokestatic wr1.a (Loov;)Loov;
      // 027: athrow
      // 028: aload 1
      // 029: bipush 0
      // 02a: aaload
      // 02b: sipush 31291
      // 02e: ldc2_w 6675323214644118789
      // 031: lload 2
      // 032: lxor
      // 033: invokedynamic b (IJ)Ljava/lang/String; bsm=wr1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 038: nop
      // 039: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 03c: iload 4
      // 03e: ifne 068
      // 041: ifeq 054
      // 044: goto 04b
      // 047: invokestatic wr1.a (Loov;)Loov;
      // 04a: athrow
      // 04b: aload 0
      // 04c: invokespecial wr1.kpw ()V
      // 04f: return
      // 050: invokestatic wr1.a (Loov;)Loov;
      // 053: athrow
      // 054: aload 1
      // 055: bipush 0
      // 056: aaload
      // 057: sipush 2005
      // 05a: ldc2_w 3382832537075218657
      // 05d: lload 2
      // 05e: lxor
      // 05f: invokedynamic b (IJ)Ljava/lang/String; bsm=wr1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 064: nop
      // 065: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 068: iload 4
      // 06a: ifne 12a
      // 06d: ifeq 116
      // 070: goto 077
      // 073: invokestatic wr1.a (Loov;)Loov;
      // 076: athrow
      // 077: aload 1
      // 078: iload 4
      // 07a: ifne 09a
      // 07d: goto 084
      // 080: invokestatic wr1.a (Loov;)Loov;
      // 083: athrow
      // 084: arraylength
      // 085: bipush 2
      // 086: if_icmpge 099
      // 089: goto 090
      // 08c: invokestatic wr1.a (Loov;)Loov;
      // 08f: athrow
      // 090: aload 0
      // 091: invokevirtual wr1.dhs ()V
      // 094: return
      // 095: invokestatic wr1.a (Loov;)Loov;
      // 098: athrow
      // 099: aload 1
      // 09a: bipush 1
      // 09b: aaload
      // 09c: astore 5
      // 09e: aload 5
      // 0a0: iload 4
      // 0a2: ifne 112
      // 0a5: invokestatic b4o.c1p (Ljava/lang/String;)Z
      // 0a8: ifne 0e6
      // 0ab: goto 0b2
      // 0ae: invokestatic wr1.a (Loov;)Loov;
      // 0b1: athrow
      // 0b2: new java/lang/StringBuilder
      // 0b5: dup
      // 0b6: invokespecial java/lang/StringBuilder.<init> ()V
      // 0b9: getstatic syo.aez Lsyo;
      // 0bc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0bf: sipush 10658
      // 0c2: ldc2_w 7197442361780065940
      // 0c5: lload 2
      // 0c6: lxor
      // 0c7: invokedynamic b (IJ)Ljava/lang/String; bsm=wr1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: nop
      // 0cd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0d3: invokestatic ncl.dob (Ljava/lang/String;)V
      // 0d6: aload 0
      // 0d7: invokespecial wr1.kpw ()V
      // 0da: iload 4
      // 0dc: ifeq 115
      // 0df: goto 0e6
      // 0e2: invokestatic wr1.a (Loov;)Loov;
      // 0e5: athrow
      // 0e6: new java/lang/StringBuilder
      // 0e9: dup
      // 0ea: invokespecial java/lang/StringBuilder.<init> ()V
      // 0ed: sipush 4928
      // 0f0: ldc2_w 473864565924031608
      // 0f3: lload 2
      // 0f4: lxor
      // 0f5: invokedynamic b (IJ)Ljava/lang/String; bsm=wr1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa: nop
      // 0fb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0fe: getstatic syo.iyk Lsyo;
      // 101: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 104: aload 5
      // 106: invokestatic b4o.d2s (Ljava/lang/String;)Lhrs;
      // 109: invokevirtual hrs.thb ()Ljava/lang/String;
      // 10c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 112: invokestatic ncl.dob (Ljava/lang/String;)V
      // 115: return
      // 116: aload 1
      // 117: bipush 0
      // 118: aaload
      // 119: sipush 12887
      // 11c: ldc2_w 61908093805415782
      // 11f: lload 2
      // 120: lxor
      // 121: invokedynamic b (IJ)Ljava/lang/String; bsm=wr1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 126: nop
      // 127: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 12a: iload 4
      // 12c: ifne 2c5
      // 12f: ifeq 2b1
      // 132: goto 139
      // 135: invokestatic wr1.a (Loov;)Loov;
      // 138: athrow
      // 139: aload 1
      // 13a: iload 4
      // 13c: ifne 15c
      // 13f: goto 146
      // 142: invokestatic wr1.a (Loov;)Loov;
      // 145: athrow
      // 146: arraylength
      // 147: bipush 2
      // 148: if_icmpge 15b
      // 14b: goto 152
      // 14e: invokestatic wr1.a (Loov;)Loov;
      // 151: athrow
      // 152: aload 0
      // 153: invokevirtual wr1.dhs ()V
      // 156: return
      // 157: invokestatic wr1.a (Loov;)Loov;
      // 15a: athrow
      // 15b: aload 1
      // 15c: bipush 1
      // 15d: aaload
      // 15e: astore 5
      // 160: aload 1
      // 161: arraylength
      // 162: iload 4
      // 164: ifne 18d
      // 167: bipush 2
      // 168: if_icmple 1a0
      // 16b: goto 172
      // 16e: invokestatic wr1.a (Loov;)Loov;
      // 171: athrow
      // 172: aload 1
      // 173: bipush 2
      // 174: aaload
      // 175: sipush 25867
      // 178: ldc2_w 2748214995695508016
      // 17b: lload 2
      // 17c: lxor
      // 17d: invokedynamic b (IJ)Ljava/lang/String; bsm=wr1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 182: nop
      // 183: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 186: goto 18d
      // 189: invokestatic wr1.a (Loov;)Loov;
      // 18c: athrow
      // 18d: iload 4
      // 18f: ifne 19d
      // 192: ifeq 1a0
      // 195: goto 19c
      // 198: invokestatic wr1.a (Loov;)Loov;
      // 19b: athrow
      // 19c: bipush 1
      // 19d: goto 1a1
      // 1a0: bipush 0
      // 1a1: istore 6
      // 1a3: aload 1
      // 1a4: arraylength
      // 1a5: iload 4
      // 1a7: ifne 1d0
      // 1aa: bipush 3
      // 1ab: if_icmple 1e3
      // 1ae: goto 1b5
      // 1b1: invokestatic wr1.a (Loov;)Loov;
      // 1b4: athrow
      // 1b5: aload 1
      // 1b6: bipush 3
      // 1b7: aaload
      // 1b8: sipush 6842
      // 1bb: ldc2_w 2284983324248663429
      // 1be: lload 2
      // 1bf: lxor
      // 1c0: invokedynamic b (IJ)Ljava/lang/String; bsm=wr1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c5: nop
      // 1c6: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 1c9: goto 1d0
      // 1cc: invokestatic wr1.a (Loov;)Loov;
      // 1cf: athrow
      // 1d0: iload 4
      // 1d2: ifne 1e0
      // 1d5: ifeq 1e3
      // 1d8: goto 1df
      // 1db: invokestatic wr1.a (Loov;)Loov;
      // 1de: athrow
      // 1df: bipush 1
      // 1e0: goto 1e4
      // 1e3: bipush 0
      // 1e4: istore 7
      // 1e6: aload 1
      // 1e7: arraylength
      // 1e8: iload 4
      // 1ea: ifne 213
      // 1ed: bipush 4
      // 1ee: if_icmple 226
      // 1f1: goto 1f8
      // 1f4: invokestatic wr1.a (Loov;)Loov;
      // 1f7: athrow
      // 1f8: aload 1
      // 1f9: bipush 4
      // 1fa: aaload
      // 1fb: sipush 6842
      // 1fe: ldc2_w 2284983324248663429
      // 201: lload 2
      // 202: lxor
      // 203: invokedynamic b (IJ)Ljava/lang/String; bsm=wr1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 208: nop
      // 209: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 20c: goto 213
      // 20f: invokestatic wr1.a (Loov;)Loov;
      // 212: athrow
      // 213: iload 4
      // 215: ifne 223
      // 218: ifeq 226
      // 21b: goto 222
      // 21e: invokestatic wr1.a (Loov;)Loov;
      // 221: athrow
      // 222: bipush 1
      // 223: goto 227
      // 226: bipush 0
      // 227: istore 8
      // 229: aload 5
      // 22b: iload 4
      // 22d: ifne 2ad
      // 230: invokestatic b4o.d2s (Ljava/lang/String;)Lhrs;
      // 233: ifnull 26d
      // 236: goto 23d
      // 239: invokestatic wr1.a (Loov;)Loov;
      // 23c: athrow
      // 23d: new java/lang/StringBuilder
      // 240: dup
      // 241: invokespecial java/lang/StringBuilder.<init> ()V
      // 244: getstatic syo.aez Lsyo;
      // 247: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 24a: sipush 7433
      // 24d: ldc2_w 4743106278639493683
      // 250: lload 2
      // 251: lxor
      // 252: invokedynamic b (IJ)Ljava/lang/String; bsm=wr1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 257: nop
      // 258: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 25b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 25e: invokestatic ncl.dob (Ljava/lang/String;)V
      // 261: iload 4
      // 263: ifeq 2b0
      // 266: goto 26d
      // 269: invokestatic wr1.a (Loov;)Loov;
      // 26c: athrow
      // 26d: aload 5
      // 26f: iload 6
      // 271: iload 8
      // 273: iload 7
      // 275: invokestatic b4o.xcu (Ljava/lang/String;ZZZ)V
      // 278: getstatic ClientState.qkk Lzwr;
      // 27b: invokevirtual ClientState.getConfigManager ()Lszk;
      // 27e: invokevirtual ConfigManager.loadPreset ()V
      // 281: new java/lang/StringBuilder
      // 284: dup
      // 285: invokespecial java/lang/StringBuilder.<init> ()V
      // 288: getstatic syo.qjc Lsyo;
      // 28b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 28e: sipush 14349
      // 291: ldc2_w 7681693823491622708
      // 294: lload 2
      // 295: lxor
      // 296: invokedynamic b (IJ)Ljava/lang/String; bsm=wr1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29b: nop
      // 29c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 29f: getstatic syo.iyk Lsyo;
      // 2a2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 2a5: aload 5
      // 2a7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2aa: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2ad: invokestatic ncl.dob (Ljava/lang/String;)V
      // 2b0: return
      // 2b1: aload 1
      // 2b2: bipush 0
      // 2b3: aaload
      // 2b4: sipush 20763
      // 2b7: ldc2_w 5849412081038896679
      // 2ba: lload 2
      // 2bb: lxor
      // 2bc: invokedynamic b (IJ)Ljava/lang/String; bsm=wr1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c1: nop
      // 2c2: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 2c5: iload 4
      // 2c7: ifne 2e9
      // 2ca: ifeq 35c
      // 2cd: goto 2d4
      // 2d0: invokestatic wr1.a (Loov;)Loov;
      // 2d3: athrow
      // 2d4: aload 1
      // 2d5: iload 4
      // 2d7: ifne 2f7
      // 2da: goto 2e1
      // 2dd: invokestatic wr1.a (Loov;)Loov;
      // 2e0: athrow
      // 2e1: arraylength
      // 2e2: goto 2e9
      // 2e5: invokestatic wr1.a (Loov;)Loov;
      // 2e8: athrow
      // 2e9: bipush 2
      // 2ea: if_icmpge 2f6
      // 2ed: aload 0
      // 2ee: invokevirtual wr1.dhs ()V
      // 2f1: return
      // 2f2: invokestatic wr1.a (Loov;)Loov;
      // 2f5: athrow
      // 2f6: aload 1
      // 2f7: bipush 1
      // 2f8: aaload
      // 2f9: astore 5
      // 2fb: aload 5
      // 2fd: iload 4
      // 2ff: ifne 354
      // 302: invokestatic b4o.xim (Ljava/lang/String;)Z
      // 305: ifeq 32c
      // 308: goto 30f
      // 30b: invokestatic wr1.a (Loov;)Loov;
      // 30e: athrow
      // 30f: sipush 18557
      // 312: ldc2_w 1095298542228158272
      // 315: lload 2
      // 316: lxor
      // 317: invokedynamic b (IJ)Ljava/lang/String; bsm=wr1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31c: nop
      // 31d: invokestatic ncl.dob (Ljava/lang/String;)V
      // 320: iload 4
      // 322: ifeq 35b
      // 325: goto 32c
      // 328: invokestatic wr1.a (Loov;)Loov;
      // 32b: athrow
      // 32c: new java/lang/StringBuilder
      // 32f: dup
      // 330: invokespecial java/lang/StringBuilder.<init> ()V
      // 333: getstatic syo.aez Lsyo;
      // 336: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 339: sipush 31462
      // 33c: ldc2_w 5305455283335923153
      // 33f: lload 2
      // 340: lxor
      // 341: invokedynamic b (IJ)Ljava/lang/String; bsm=wr1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 346: nop
      // 347: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 34a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 34d: goto 354
      // 350: invokestatic wr1.a (Loov;)Loov;
      // 353: athrow
      // 354: invokestatic ncl.dob (Ljava/lang/String;)V
      // 357: aload 0
      // 358: invokespecial wr1.kpw ()V
      // 35b: return
      // 35c: aload 0
      // 35d: invokevirtual wr1.dhs ()V
      // 360: return
   }

   private void kpw() {
      long var1 = a ^ 58784352896934L;
      StringBuilder var3 = new StringBuilder();
      b4o.zq1().forEach(wr1::v0c);
      var3.delete(var3.length() - 4, var3.length());
      ncl.dob(syo.u4m + a<"b">(31590, 4683548087091435284L ^ var1) + var3.toString());
   }

   private static void v0c(StringBuilder var0, hrs var1) {
      long var2 = a ^ 39550132520854L;
      var0.append(var1.thb() + syo.pgp + a<"b">(15948, 1878754837594624523L ^ var2) + syo.rl1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1937917099997909520L, -9220583344071358394L, MethodHandles.lookup().lookupClass()).a(237526367746322L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 107436519517858L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[14];
      int var7 = 0;
      String var6 = "Cf^yKéRÈºQ\u0087I´Qæ¹ \u0019\u008e\r*\u0095MIÅ¯êc´n@îõ5¿\u001fÎõëìrÜòc:Ä9\u0088A\u0010MØÌ\nÅåìyôK$¶õ`\u008aw\u0010¶\u009b\u009b\u001d~\u0002Oê\fb?Ð\u009a\u0003çY\u0018\u0007¿\n©w\"\u0013\u000btÈÐ\u0091\u008bÅáEg\u0098'ä\rÒ7\u0087 \u0080*3Ç\ru\u008fNµ©\tY\u009e\u0087+\u0007ûs¤z\u009a\u0089\u00815\u009b\u0013\u0003\u0096\u0014\u0001oo0vEy\u0006[^{\u0098ñ*Jn\u009a\u0097-cí7@C}LÖU\u001c\u0082`$bãy÷¯}{û©Á=é\u0086Å£\u009a\u001a»ZÅ\u0010ïÛFz@<Ñ*xÆ\u009cc\b\u0096b³\u0010¯ÈZEÊ\u0010\u0096û?ças\u000fù7é\u00103«¬ÉK\u0099P\u0096\u0093\u007f\u008f\u001a6¿Æ68Í) ë~1cÑ§kg]¤g\rf|¶\u0091b/Oÿ\bÆÏ¢\u009aÅ\u0001¿×\u001d{ÝMÿá¬'ù\u0081`ÆÛ\u0012©þQá?¿\u0080ó\u0007ï8\u0087|\u008f±'\u008d\u0002\u008fV\u0018ÑÄ7Ë\u0011ê$vPí\u000e®Ö çÇ×ê¬Ü¤6¤\u0004¦n¯ý¥*õ\u0010ë©\u009e¨µ\b¦x\u007fp\u0000Øn\u0004";
      int var8 = "Cf^yKéRÈºQ\u0087I´Qæ¹ \u0019\u008e\r*\u0095MIÅ¯êc´n@îõ5¿\u001fÎõëìrÜòc:Ä9\u0088A\u0010MØÌ\nÅåìyôK$¶õ`\u008aw\u0010¶\u009b\u009b\u001d~\u0002Oê\fb?Ð\u009a\u0003çY\u0018\u0007¿\n©w\"\u0013\u000btÈÐ\u0091\u008bÅáEg\u0098'ä\rÒ7\u0087 \u0080*3Ç\ru\u008fNµ©\tY\u009e\u0087+\u0007ûs¤z\u009a\u0089\u00815\u009b\u0013\u0003\u0096\u0014\u0001oo0vEy\u0006[^{\u0098ñ*Jn\u009a\u0097-cí7@C}LÖU\u001c\u0082`$bãy÷¯}{û©Á=é\u0086Å£\u009a\u001a»ZÅ\u0010ïÛFz@<Ñ*xÆ\u009cc\b\u0096b³\u0010¯ÈZEÊ\u0010\u0096û?ças\u000fù7é\u00103«¬ÉK\u0099P\u0096\u0093\u007f\u008f\u001a6¿Æ68Í) ë~1cÑ§kg]¤g\rf|¶\u0091b/Oÿ\bÆÏ¢\u009aÅ\u0001¿×\u001d{ÝMÿá¬'ù\u0081`ÆÛ\u0012©þQá?¿\u0080ó\u0007ï8\u0087|\u008f±'\u008d\u0002\u008fV\u0018ÑÄ7Ë\u0011ê$vPí\u000e®Ö çÇ×ê¬Ü¤6¤\u0004¦n¯ý¥*õ\u0010ë©\u009e¨µ\b¦x\u007fp\u0000Øn\u0004"
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
                     d = var9;
                     e = new String[14];
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

                  var6 = "`YZ\u008c{\u00adsÍ\u000eT¿xhþ¿ôã1\u0095\u0007<º·}Fë²tíÝqvX\u0001è \u0007ééÓ\u0010jM§â¬\u0005\u009e\u0003C\u009dÒÓxGw@";
                  var8 = "`YZ\u008c{\u00adsÍ\u000eT¿xhþ¿ôã1\u0095\u0007<º·}Fë²tíÝqvX\u0001è \u0007ééÓ\u0010jM§â¬\u0005\u009e\u0003C\u009dÒÓxGw@".length();
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 18494;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("wr1", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         e[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("wr1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
