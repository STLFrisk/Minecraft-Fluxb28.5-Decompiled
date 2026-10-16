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

public class ib7 extends ShaderHelper {
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public ib7(ShaderHelper var1) {
      long var2 = a ^ 114900830485818L;
      super();
      this.x0p = b<"j">(97, 440381972817463165L ^ var2);
      this.d5e = var1;
   }

   @Override
   public void initGui() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic ib7.a J
      // 003: ldc2_w 5089742987026
      // 006: lxor
      // 007: lstore 1
      // 008: getstatic ClientState.qkk Lzwr;
      // 00b: invokevirtual ClientState.getConfigManager ()Lszk;
      // 00e: invokevirtual ConfigManager.cf9 ()Z
      // 011: pop
      // 012: invokestatic OpaquePredicate.b ()I
      // 015: aload 0
      // 016: getfield ib7.khf Ljava/util/List;
      // 019: invokeinterface java/util/List.clear ()V 1
      // 01e: istore 3
      // 01f: aload 0
      // 020: new jqk
      // 023: dup
      // 024: bipush 0
      // 025: invokestatic Minecraft.vz1 ()Lc05;
      // 028: getfield Minecraft.tx1 Lowt;
      // 02b: aload 0
      // 02c: getfield ib7.dt7 I
      // 02f: bipush 2
      // 030: idiv
      // 031: bipush 100
      // 033: isub
      // 034: aload 0
      // 035: getfield ib7.o1e I
      // 038: bipush 2
      // 039: idiv
      // 03a: sipush 200
      // 03d: bipush 20
      // 03f: invokespecial jqk.<init> (ILowt;IIII)V
      // 042: putfield ib7.og0 Ljqk;
      // 045: aload 0
      // 046: getfield ib7.og0 Ljqk;
      // 049: sipush 1000
      // 04c: invokevirtual jqk.z5t (I)V
      // 04f: aload 0
      // 050: getfield ib7.og0 Ljqk;
      // 053: getstatic hy1._hs Ljava/lang/String;
      // 056: iload 3
      // 057: ifeq 070
      // 05a: ifnull 06e
      // 05d: goto 064
      // 060: invokestatic ib7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 063: athrow
      // 064: getstatic hy1._hs Ljava/lang/String;
      // 067: goto 071
      // 06a: invokestatic ib7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06d: athrow
      // 06e: ldc ""
      // 070: nop
      // 071: invokevirtual jqk.nrl (Ljava/lang/String;)V
      // 074: aload 0
      // 075: getfield ib7.khf Ljava/util/List;
      // 078: new gt4
      // 07b: dup
      // 07c: bipush 1
      // 07d: aload 0
      // 07e: getfield ib7.dt7 I
      // 081: bipush 2
      // 082: idiv
      // 083: sipush 170
      // 086: isub
      // 087: aload 0
      // 088: getfield ib7.o1e I
      // 08b: bipush 4
      // 08c: idiv
      // 08d: sipush 200
      // 090: iadd
      // 091: bipush 100
      // 093: bipush 20
      // 095: sipush 8727
      // 098: ldc2_w 117263727646639906
      // 09b: lload 1
      // 09c: lxor
      // 09d: invokedynamic j (IJ)Ljava/lang/String; bsm=ib7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a2: nop
      // 0a3: invokespecial gt4.<init> (IIIIILjava/lang/String;)V
      // 0a6: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0ab: pop
      // 0ac: aload 0
      // 0ad: getfield ib7.khf Ljava/util/List;
      // 0b0: new gt4
      // 0b3: dup
      // 0b4: bipush 2
      // 0b5: aload 0
      // 0b6: getfield ib7.dt7 I
      // 0b9: bipush 2
      // 0ba: idiv
      // 0bb: bipush 50
      // 0bd: isub
      // 0be: aload 0
      // 0bf: getfield ib7.o1e I
      // 0c2: bipush 4
      // 0c3: idiv
      // 0c4: sipush 200
      // 0c7: iadd
      // 0c8: bipush 100
      // 0ca: bipush 20
      // 0cc: sipush 1655
      // 0cf: ldc2_w 4278250766700127040
      // 0d2: lload 1
      // 0d3: lxor
      // 0d4: invokedynamic j (IJ)Ljava/lang/String; bsm=ib7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: nop
      // 0da: invokespecial gt4.<init> (IIIIILjava/lang/String;)V
      // 0dd: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0e2: pop
      // 0e3: aload 0
      // 0e4: getfield ib7.khf Ljava/util/List;
      // 0e7: new gt4
      // 0ea: dup
      // 0eb: bipush 3
      // 0ec: aload 0
      // 0ed: getfield ib7.dt7 I
      // 0f0: bipush 2
      // 0f1: idiv
      // 0f2: bipush 70
      // 0f4: iadd
      // 0f5: aload 0
      // 0f6: getfield ib7.o1e I
      // 0f9: bipush 4
      // 0fa: idiv
      // 0fb: sipush 200
      // 0fe: iadd
      // 0ff: bipush 100
      // 101: bipush 20
      // 103: sipush 3261
      // 106: ldc2_w 1642690822965045644
      // 109: lload 1
      // 10a: lxor
      // 10b: invokedynamic j (IJ)Ljava/lang/String; bsm=ib7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: nop
      // 111: invokespecial gt4.<init> (IIIIILjava/lang/String;)V
      // 114: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 119: pop
      // 11a: aload 0
      // 11b: getfield ib7.khf Ljava/util/List;
      // 11e: new gt4
      // 121: dup
      // 122: bipush 4
      // 123: aload 0
      // 124: getfield ib7.dt7 I
      // 127: bipush 2
      // 128: idiv
      // 129: bipush 100
      // 12b: isub
      // 12c: aload 0
      // 12d: getfield ib7.o1e I
      // 130: bipush 4
      // 131: idiv
      // 132: sipush 150
      // 135: iadd
      // 136: sipush 17578
      // 139: ldc2_w 5124098988361736602
      // 13c: lload 1
      // 13d: lxor
      // 13e: invokedynamic j (IJ)Ljava/lang/String; bsm=ib7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 143: nop
      // 144: invokespecial gt4.<init> (IIILjava/lang/String;)V
      // 147: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 14c: pop
      // 14d: bipush 1
      // 14e: invokestatic org/lwjgl/input/Keyboard.enableRepeatEvents (Z)V
      // 151: return
   }

   @Override
   public void actionPerformed(gt4 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: getfield gt4._me I
      // 08: bipush 1
      // 09: iload 2
      // 0a: ifne 35
      // 0d: if_icmpne 29
      // 10: goto 17
      // 13: invokestatic ib7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16: athrow
      // 17: aload 0
      // 18: getstatic ps7.kt1 Lps7;
      // 1b: invokevirtual ib7.xo9 (Lps7;)V
      // 1e: iload 2
      // 1f: ifeq 88
      // 22: goto 29
      // 25: invokestatic ib7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28: athrow
      // 29: aload 1
      // 2a: getfield gt4._me I
      // 2d: bipush 2
      // 2e: goto 35
      // 31: invokestatic ib7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34: athrow
      // 35: iload 2
      // 36: ifne 61
      // 39: if_icmpne 55
      // 3c: goto 43
      // 3f: invokestatic ib7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 42: athrow
      // 43: aload 0
      // 44: getstatic ps7.jov Lps7;
      // 47: invokevirtual ib7.xo9 (Lps7;)V
      // 4a: iload 2
      // 4b: ifeq 88
      // 4e: goto 55
      // 51: invokestatic ib7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 54: athrow
      // 55: aload 1
      // 56: getfield gt4._me I
      // 59: bipush 3
      // 5a: goto 61
      // 5d: invokestatic ib7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 60: athrow
      // 61: if_icmpne 76
      // 64: aload 0
      // 65: getstatic ps7.mrf Lps7;
      // 68: invokevirtual ib7.xo9 (Lps7;)V
      // 6b: iload 2
      // 6c: ifeq 88
      // 6f: goto 76
      // 72: invokestatic ib7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 75: athrow
      // 76: aload 0
      // 77: getfield ib7.f41 Lc05;
      // 7a: aload 0
      // 7b: getfield ib7.d5e Lgbe;
      // 7e: invokevirtual Minecraft.z2i (Lgbe;)V
      // 81: goto 88
      // 84: invokestatic ib7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 87: athrow
      // 88: return
   }

   public void xo9(ps7 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: new hy1
      // 07: dup
      // 08: aload 0
      // 09: getfield ib7.og0 Ljqk;
      // 0c: invokevirtual jqk.xct ()Ljava/lang/String;
      // 0f: invokespecial hy1.<init> (Ljava/lang/String;)V
      // 12: aload 1
      // 13: invokevirtual hy1.rbv (Lps7;)Lx1l;
      // 16: astore 3
      // 17: aload 0
      // 18: aload 3
      // 19: getfield x1l.erm Ljava/lang/String;
      // 1c: putfield ib7.x0p Ljava/lang/String;
      // 1f: aload 3
      // 20: invokevirtual x1l.rii ()Ljava/lang/String;
      // 23: iload 2
      // 24: ifeq 3c
      // 27: ifnull 73
      // 2a: goto 31
      // 2d: invokestatic ib7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30: athrow
      // 31: aload 3
      // 32: invokevirtual x1l.y0c ()Ljava/lang/String;
      // 35: goto 3c
      // 38: invokestatic ib7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b: athrow
      // 3c: iload 2
      // 3d: ifeq 55
      // 40: ifnull 73
      // 43: goto 4a
      // 46: invokestatic ib7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 49: athrow
      // 4a: aload 3
      // 4b: invokevirtual x1l.g9o ()Ljava/lang/String;
      // 4e: goto 55
      // 51: invokestatic ib7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 54: athrow
      // 55: ifnull 73
      // 58: getstatic qd_.oyx Ljava/util/ArrayList;
      // 5b: bipush 0
      // 5c: aload 3
      // 5d: invokevirtual java/util/ArrayList.add (ILjava/lang/Object;)V
      // 60: invokestatic qd_.mpj ()V
      // 63: getstatic ClientState.qkk Lzwr;
      // 66: invokevirtual ClientState.getConfigManager ()Lszk;
      // 69: invokevirtual ConfigManager.p5g ()V
      // 6c: goto 73
      // 6f: invokestatic ib7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 72: athrow
      // 73: goto 7b
      // 76: astore 3
      // 77: aload 3
      // 78: invokevirtual java/lang/Exception.printStackTrace ()V
      // 7b: return
   }

   @Override
   public void dig(char param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: iload 3
      // 06: ifeq 26
      // 09: getfield ib7.og0 Ljqk;
      // 0c: iload 1
      // 0d: iload 2
      // 0e: invokevirtual jqk.pst (CI)Z
      // 11: pop
      // 12: iload 2
      // 13: bipush 1
      // 14: if_icmpne 30
      // 17: goto 1e
      // 1a: invokestatic ib7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d: athrow
      // 1e: aload 0
      // 1f: goto 26
      // 22: invokestatic ib7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25: athrow
      // 26: getfield ib7.f41 Lc05;
      // 29: aload 0
      // 2a: getfield ib7.d5e Lgbe;
      // 2d: invokevirtual Minecraft.z2i (Lgbe;)V
      // 30: return
   }

   @Override
   public void mouseClicked(int var1, int var2, int var3) {
      this.og0.elk(var1, var2, var3);
      super.mouseClicked(var1, var2, var3);
   }

   @Override
   public void updateScreen() {
      this.og0.zf9();
      super.updateScreen();
   }

   @Override
   public void drawScreen(int param1, int param2, float param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic ib7.a J
      // 03: ldc2_w 31865739035693
      // 06: lxor
      // 07: lstore 4
      // 09: aload 0
      // 0a: invokevirtual ib7.xmz ()V
      // 0d: aload 0
      // 0e: invokestatic Minecraft.vz1 ()Lc05;
      // 11: getfield Minecraft.tx1 Lowt;
      // 14: aload 0
      // 15: getfield ib7.x0p Ljava/lang/String;
      // 18: aload 0
      // 19: getfield ib7.dt7 I
      // 1c: bipush 2
      // 1d: idiv
      // 1e: aload 0
      // 1f: getfield ib7.o1e I
      // 22: bipush 2
      // 23: idiv
      // 24: bipush 40
      // 26: isub
      // 27: bipush -1
      // 28: invokevirtual ib7.poi (Lowt;Ljava/lang/String;III)V
      // 2b: aload 0
      // 2c: getfield ib7.og0 Ljqk;
      // 2f: invokevirtual jqk.dy2 ()V
      // 32: invokestatic OpaquePredicate.b ()I
      // 35: aload 0
      // 36: invokestatic Minecraft.vz1 ()Lc05;
      // 39: getfield Minecraft.tx1 Lowt;
      // 3c: sipush 10343
      // 3f: ldc2_w 4112400365734778478
      // 42: lload 4
      // 44: lxor
      // 45: invokedynamic j (IJ)Ljava/lang/String; bsm=ib7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a: nop
      // 4b: aload 0
      // 4c: getfield ib7.dt7 I
      // 4f: bipush 2
      // 50: idiv
      // 51: aload 0
      // 52: getfield ib7.o1e I
      // 55: bipush 2
      // 56: idiv
      // 57: bipush 20
      // 59: isub
      // 5a: bipush -1
      // 5b: invokevirtual ib7.poi (Lowt;Ljava/lang/String;III)V
      // 5e: istore 6
      // 60: aload 0
      // 61: iload 6
      // 63: ifeq 92
      // 66: getfield ib7.crh Ljava/lang/String;
      // 69: ifnull 91
      // 6c: goto 73
      // 6f: invokestatic ib7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 72: athrow
      // 73: aload 0
      // 74: invokestatic Minecraft.vz1 ()Lc05;
      // 77: getfield Minecraft.tx1 Lowt;
      // 7a: aload 0
      // 7b: getfield ib7.crh Ljava/lang/String;
      // 7e: aload 0
      // 7f: getfield ib7.dt7 I
      // 82: bipush 2
      // 83: idiv
      // 84: bipush 24
      // 86: bipush -1
      // 87: invokevirtual ib7.poi (Lowt;Ljava/lang/String;III)V
      // 8a: goto 91
      // 8d: invokestatic ib7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 90: athrow
      // 91: aload 0
      // 92: iload 1
      // 93: iload 2
      // 94: fload 3
      // 95: invokespecial ShaderHelper.drawScreen (IIF)V
      // 98: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(8764893282959965138L, 3685573562705544178L, MethodHandles.lookup().lookupClass()).a(77038137644559L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 78719210120561L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[6];
      int var7 = 0;
      String var6 = "±\u000fÒþ-\u000fæL4¶1\u009eè\u00111( U¨)@ö\u0086))$k\u001cÐt,U\u009cÀ\u001cÉ¶aá\\\u008eô\u0099X'D\u008eU\"8ª\u0082©ø7B\u0094\u001fd\u0018\u0095h\u009cv\u008c\u00ad\ns>C¬:ý±\u00142\u0005\u009d\u0093áÓì>ñêÎi?ì\u0014dHÜCê\u001f\u001b\fïì\u0002'Ë8<C\u0018Ê5\u0002\u000eìV\u009cC¡Å¦³·X!òU\u0016R|\u0087f\u000e\u009c";
      int var8 = "±\u000fÒþ-\u000fæL4¶1\u009eè\u00111( U¨)@ö\u0086))$k\u001cÐt,U\u009cÀ\u001cÉ¶aá\\\u008eô\u0099X'D\u008eU\"8ª\u0082©ø7B\u0094\u001fd\u0018\u0095h\u009cv\u008c\u00ad\ns>C¬:ý±\u00142\u0005\u009d\u0093áÓì>ñêÎi?ì\u0014dHÜCê\u001f\u001b\fïì\u0002'Ë8<C\u0018Ê5\u0002\u000eìV\u009cC¡Å¦³·X!òU\u0016R|\u0087f\u000e\u009c"
         .length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     b = var9;
                     g = new String[6];
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

                  var6 = "Í\u0003¤~ÄÑZÞ\u000f\u009e\u0014%,\b\u0003u Ô«6ÎÅ\\lqÉ«\u0002Wf^\u0005\u001còO5%f\u0004<+\u001d¯H¦%s¾î";
                  var8 = "Í\u0003¤~ÄÑZÞ\u000f\u009e\u0014%,\b\u0003u Ô«6ÎÅ\\lqÉ«\u0002Wf^\u0005\u001còO5%f\u0004<+\u001d¯H¦%s¾î".length();
                  var5 = 16;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static Exception a(Exception var0) {
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 24121;
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
            throw new RuntimeException("ib7", var10);
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
         g[var5] = a(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("ib7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
