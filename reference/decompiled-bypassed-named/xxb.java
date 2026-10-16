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

public class xxb {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public xxb(bdo var1) {
      this.j0m(var1);
   }

   public xxb(erg var1, erg var2, erg var3) {
      this(var1, var2, var3, 0, 7);
   }

   public xxb(erg var1, erg var2, erg var3, int var4, int var5) {
      this.vr2 = var1;
      this.l3e = var2;
      this.wdx = var3;
      this.hag = var4;
      this.k7u = var5;
      this._xv = true;
   }

   public xxb(erg var1, erg var2) {
      this(var1, (erg)null, var2);
   }

   public xxb(erg var1, u7m var2) {
      this(var1, new erg(var2));
   }

   public erg k2s() {
      return this.vr2;
   }

   public erg ha2() {
      return this.l3e;
   }

   public boolean kqm() {
      try {
         if (this.l3e != null) {
            return true;
         }
      } catch (oov var1) {
         throw a(var1);
      }

      return false;
   }

   public erg fjy() {
      return this.wdx;
   }

   public int iev() {
      return this.hag;
   }

   public int xll() {
      return this.k7u;
   }

   public void emv() {
      this.hag++;
   }

   public void a04(int var1) {
      this.k7u += var1;
   }

   public boolean f_e() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield xxb.hag I
      // 08: iload 1
      // 09: ifeq 22
      // 0c: aload 0
      // 0d: getfield xxb.k7u I
      // 10: if_icmplt 25
      // 13: goto 1a
      // 16: invokestatic xxb.a (Loov;)Loov;
      // 19: athrow
      // 1a: bipush 1
      // 1b: goto 22
      // 1e: invokestatic xxb.a (Loov;)Loov;
      // 21: athrow
      // 22: goto 26
      // 25: bipush 0
      // 26: ireturn
   }

   public void gbc() {
      this.hag = this.k7u;
   }

   public boolean z40() {
      return this._xv;
   }

   public void j0m(bdo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic xxb.a J
      // 003: ldc2_w 69299810447810
      // 006: lxor
      // 007: lstore 2
      // 008: aload 1
      // 009: sipush 969
      // 00c: ldc2_w 6278199075099927133
      // 00f: lload 2
      // 010: lxor
      // 011: invokedynamic i (IJ)Ljava/lang/String; bsm=xxb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 016: nop
      // 017: invokevirtual bdo.b__ (Ljava/lang/String;)Lbdo;
      // 01a: astore 5
      // 01c: invokestatic OpaquePredicate.b ()I
      // 01f: aload 0
      // 020: aload 5
      // 022: invokestatic erg.qog (Lbdo;)Lerg;
      // 025: putfield xxb.vr2 Lerg;
      // 028: aload 1
      // 029: sipush 29370
      // 02c: ldc2_w 6205189194626306861
      // 02f: lload 2
      // 030: lxor
      // 031: invokedynamic i (IJ)Ljava/lang/String; bsm=xxb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 036: nop
      // 037: invokevirtual bdo.b__ (Ljava/lang/String;)Lbdo;
      // 03a: astore 6
      // 03c: istore 4
      // 03e: aload 0
      // 03f: aload 6
      // 041: invokestatic erg.qog (Lbdo;)Lerg;
      // 044: putfield xxb.wdx Lerg;
      // 047: aload 1
      // 048: sipush 21056
      // 04b: ldc2_w 6267931368051946450
      // 04e: lload 2
      // 04f: lxor
      // 050: invokedynamic i (IJ)Ljava/lang/String; bsm=xxb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 055: nop
      // 056: bipush 10
      // 058: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 05b: iload 4
      // 05d: ifeq 09e
      // 060: ifeq 08a
      // 063: goto 06a
      // 066: invokestatic xxb.a (Loov;)Loov;
      // 069: athrow
      // 06a: aload 0
      // 06b: aload 1
      // 06c: sipush 21056
      // 06f: ldc2_w 6267931368051946450
      // 072: lload 2
      // 073: lxor
      // 074: invokedynamic i (IJ)Ljava/lang/String; bsm=xxb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 079: nop
      // 07a: invokevirtual bdo.b__ (Ljava/lang/String;)Lbdo;
      // 07d: invokestatic erg.qog (Lbdo;)Lerg;
      // 080: putfield xxb.l3e Lerg;
      // 083: goto 08a
      // 086: invokestatic xxb.a (Loov;)Loov;
      // 089: athrow
      // 08a: aload 1
      // 08b: sipush 23281
      // 08e: ldc2_w 990747184910908267
      // 091: lload 2
      // 092: lxor
      // 093: invokedynamic i (IJ)Ljava/lang/String; bsm=xxb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 098: nop
      // 099: bipush 99
      // 09b: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 09e: iload 4
      // 0a0: ifeq 0de
      // 0a3: ifeq 0ca
      // 0a6: goto 0ad
      // 0a9: invokestatic xxb.a (Loov;)Loov;
      // 0ac: athrow
      // 0ad: aload 0
      // 0ae: aload 1
      // 0af: sipush 23281
      // 0b2: ldc2_w 990747184910908267
      // 0b5: lload 2
      // 0b6: lxor
      // 0b7: invokedynamic i (IJ)Ljava/lang/String; bsm=xxb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bc: nop
      // 0bd: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 0c0: putfield xxb.hag I
      // 0c3: goto 0ca
      // 0c6: invokestatic xxb.a (Loov;)Loov;
      // 0c9: athrow
      // 0ca: aload 1
      // 0cb: sipush 32085
      // 0ce: ldc2_w 6727593806264474830
      // 0d1: lload 2
      // 0d2: lxor
      // 0d3: invokedynamic i (IJ)Ljava/lang/String; bsm=xxb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d8: nop
      // 0d9: bipush 99
      // 0db: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 0de: ifeq 103
      // 0e1: aload 0
      // 0e2: aload 1
      // 0e3: sipush 32085
      // 0e6: ldc2_w 6727593806264474830
      // 0e9: lload 2
      // 0ea: lxor
      // 0eb: invokedynamic i (IJ)Ljava/lang/String; bsm=xxb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f0: nop
      // 0f1: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 0f4: putfield xxb.k7u I
      // 0f7: iload 4
      // 0f9: ifne 110
      // 0fc: goto 103
      // 0ff: invokestatic xxb.a (Loov;)Loov;
      // 102: athrow
      // 103: aload 0
      // 104: bipush 7
      // 106: putfield xxb.k7u I
      // 109: goto 110
      // 10c: invokestatic xxb.a (Loov;)Loov;
      // 10f: athrow
      // 110: aload 1
      // 111: sipush 22968
      // 114: ldc2_w 1735733236854601771
      // 117: lload 2
      // 118: lxor
      // 119: invokedynamic i (IJ)Ljava/lang/String; bsm=xxb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11e: nop
      // 11f: bipush 1
      // 120: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 123: ifeq 148
      // 126: aload 0
      // 127: aload 1
      // 128: sipush 22968
      // 12b: ldc2_w 1735733236854601771
      // 12e: lload 2
      // 12f: lxor
      // 130: invokedynamic i (IJ)Ljava/lang/String; bsm=xxb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 135: nop
      // 136: invokevirtual bdo.dvl (Ljava/lang/String;)Z
      // 139: putfield xxb._xv Z
      // 13c: iload 4
      // 13e: ifne 154
      // 141: goto 148
      // 144: invokestatic xxb.a (Loov;)Loov;
      // 147: athrow
      // 148: aload 0
      // 149: bipush 1
      // 14a: putfield xxb._xv Z
      // 14d: goto 154
      // 150: invokestatic xxb.a (Loov;)Loov;
      // 153: athrow
      // 154: return
   }

   public bdo _gk() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic xxb.a J
      // 03: ldc2_w 53859913552809
      // 06: lxor
      // 07: lstore 1
      // 08: new bdo
      // 0b: dup
      // 0c: invokespecial bdo.<init> ()V
      // 0f: astore 4
      // 11: invokestatic OpaquePredicate.c ()I
      // 14: aload 4
      // 16: sipush 25819
      // 19: ldc2_w 8307708323940788005
      // 1c: lload 1
      // 1d: lxor
      // 1e: invokedynamic i (IJ)Ljava/lang/String; bsm=xxb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23: nop
      // 24: aload 0
      // 25: getfield xxb.vr2 Lerg;
      // 28: new bdo
      // 2b: dup
      // 2c: invokespecial bdo.<init> ()V
      // 2f: invokevirtual erg.zy4 (Lbdo;)Lbdo;
      // 32: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 35: istore 3
      // 36: aload 4
      // 38: sipush 13934
      // 3b: ldc2_w 2934474307072177565
      // 3e: lload 1
      // 3f: lxor
      // 40: invokedynamic i (IJ)Ljava/lang/String; bsm=xxb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: nop
      // 46: aload 0
      // 47: getfield xxb.wdx Lerg;
      // 4a: new bdo
      // 4d: dup
      // 4e: invokespecial bdo.<init> ()V
      // 51: invokevirtual erg.zy4 (Lbdo;)Lbdo;
      // 54: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 57: iload 3
      // 58: ifne d6
      // 5b: aload 0
      // 5c: getfield xxb.l3e Lerg;
      // 5f: ifnull 91
      // 62: goto 69
      // 65: invokestatic xxb.a (Loov;)Loov;
      // 68: athrow
      // 69: aload 4
      // 6b: sipush 21187
      // 6e: ldc2_w 7207004399695941944
      // 71: lload 1
      // 72: lxor
      // 73: invokedynamic i (IJ)Ljava/lang/String; bsm=xxb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 78: nop
      // 79: aload 0
      // 7a: getfield xxb.l3e Lerg;
      // 7d: new bdo
      // 80: dup
      // 81: invokespecial bdo.<init> ()V
      // 84: invokevirtual erg.zy4 (Lbdo;)Lbdo;
      // 87: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 8a: goto 91
      // 8d: invokestatic xxb.a (Loov;)Loov;
      // 90: athrow
      // 91: aload 4
      // 93: sipush 26534
      // 96: ldc2_w 3081988404053075035
      // 99: lload 1
      // 9a: lxor
      // 9b: invokedynamic i (IJ)Ljava/lang/String; bsm=xxb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a0: nop
      // a1: aload 0
      // a2: getfield xxb.hag I
      // a5: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // a8: aload 4
      // aa: sipush 17454
      // ad: ldc2_w 4444030733825263572
      // b0: lload 1
      // b1: lxor
      // b2: invokedynamic i (IJ)Ljava/lang/String; bsm=xxb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b7: nop
      // b8: aload 0
      // b9: getfield xxb.k7u I
      // bc: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // bf: aload 4
      // c1: sipush 2844
      // c4: ldc2_w 9145407517978888430
      // c7: lload 1
      // c8: lxor
      // c9: invokedynamic i (IJ)Ljava/lang/String; bsm=xxb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ce: nop
      // cf: aload 0
      // d0: getfield xxb._xv Z
      // d3: invokevirtual bdo.zyu (Ljava/lang/String;Z)V
      // d6: aload 4
      // d8: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-280987105857240581L, 7416315530808032905L, MethodHandles.lookup().lookupClass()).a(240357084661251L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 85732329651578L;
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
      String var6 = "\\¸1\\Tk\u0014çÐn\u00062;HÇI \u00adL{\u009c2KÒ\u000b8´=¶\u0087Erÿî÷ñÜ÷aÑt\fóBE|\r\u0013\u0098\u0010\u0014¥\u0003\u001fç\f*Â%\u001cX°aÒîÈ\u0010`\u0084A&ûjïn¬\r§Í\u001bb2Ä\u0010z\u008büû\u0090\u0002âÎ\u0000\u0007\u0097|võ\u0087D\u0010]R\u008cf6²\u0018½D\u007f\toü¶\u0092-\u0010[î§¶#\u0012hò\u0005\u009e\u0096\u0014¥`\\3\u0010ðq\bbÖl.\\H\tòOâ\u001cëÃ\u0010\u0082\u0015\u007f|Ït8çÒ°eç/åÔ\u0094\u0010Kø >\u0002ÄòqÛÛb\u0005 dé\u001e";
      int var8 = "\\¸1\\Tk\u0014çÐn\u00062;HÇI \u00adL{\u009c2KÒ\u000b8´=¶\u0087Erÿî÷ñÜ÷aÑt\fóBE|\r\u0013\u0098\u0010\u0014¥\u0003\u001fç\f*Â%\u001cX°aÒîÈ\u0010`\u0084A&ûjïn¬\r§Í\u001bb2Ä\u0010z\u008büû\u0090\u0002âÎ\u0000\u0007\u0097|võ\u0087D\u0010]R\u008cf6²\u0018½D\u007f\toü¶\u0092-\u0010[î§¶#\u0012hò\u0005\u009e\u0096\u0014¥`\\3\u0010ðq\bbÖl.\\H\tòOâ\u001cëÃ\u0010\u0082\u0015\u007f|Ït8çÒ°eç/åÔ\u0094\u0010Kø >\u0002ÄòqÛÛb\u0005 dé\u001e"
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
                     c = new String[12];
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

                  var6 = "óg\u000b\u000b´ ñQ\u0016iþ´ú[ÄL ?\u007fü_¤'#Í\u0082xXÃ^¯\u0001\u0097µÌ¿\u009e\u0098\u001cÃoÃw\u0011\u001a\u0091\u007f\u0005`";
                  var8 = "óg\u000b\u000b´ ñQ\u0016iþ´ú[ÄL ?\u007fü_¤'#Í\u0082xXÃ^¯\u0001\u0097µÌ¿\u009e\u0098\u001cÃoÃw\u0011\u001a\u0091\u007f\u0005`"
                     .length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 14427;
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
            throw new RuntimeException("xxb", var10);
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
         throw new RuntimeException("xxb" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
