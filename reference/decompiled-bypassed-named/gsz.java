import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class gsz extends y0y {
   public static final zb_ blj;
   public static final h76 t0z;

   public gsz() {
      super(true);
      this.y8l(this._8_.c32().zvi(blj, y0y$_zr.ipg).zvi(t0z, false));
   }

   public boolean bxm(OpaquePredicate param1, mew param2, zfz param3, boolean param4, int param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 6
      // 005: iload 5
      // 007: iload 6
      // 009: ifeq 022
      // 00c: bipush 8
      // 00e: if_icmplt 01e
      // 011: goto 018
      // 014: invokestatic gsz.a (Loov;)Loov;
      // 017: athrow
      // 018: bipush 0
      // 019: ireturn
      // 01a: invokestatic gsz.a (Loov;)Loov;
      // 01d: athrow
      // 01e: aload 2
      // 01f: invokevirtual mew.getX ()I
      // 022: istore 7
      // 024: aload 2
      // 025: invokevirtual mew.getY ()I
      // 028: istore 8
      // 02a: aload 2
      // 02b: invokevirtual mew.getZ ()I
      // 02e: istore 9
      // 030: bipush 1
      // 031: istore 10
      // 033: aload 3
      // 034: getstatic gsz.blj Lzb_;
      // 037: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 03c: checkcast y0y$_zr
      // 03f: astore 11
      // 041: getstatic gsz$2.aou [I
      // 044: aload 11
      // 046: invokevirtual y0y$_zr.ordinal ()I
      // 049: iaload
      // 04a: iload 6
      // 04c: ifeq 1e3
      // 04f: tableswitch 380 1 6 41 83 125 190 255 320
      // 074: invokestatic gsz.a (Loov;)Loov;
      // 077: athrow
      // 078: iload 4
      // 07a: ifeq 093
      // 07d: goto 084
      // 080: invokestatic gsz.a (Loov;)Loov;
      // 083: athrow
      // 084: iinc 9 1
      // 087: iload 6
      // 089: ifne 1cb
      // 08c: goto 093
      // 08f: invokestatic gsz.a (Loov;)Loov;
      // 092: athrow
      // 093: iinc 9 -1
      // 096: iload 6
      // 098: ifne 1cb
      // 09b: goto 0a2
      // 09e: invokestatic gsz.a (Loov;)Loov;
      // 0a1: athrow
      // 0a2: iload 4
      // 0a4: ifeq 0bd
      // 0a7: goto 0ae
      // 0aa: invokestatic gsz.a (Loov;)Loov;
      // 0ad: athrow
      // 0ae: iinc 7 -1
      // 0b1: iload 6
      // 0b3: ifne 1cb
      // 0b6: goto 0bd
      // 0b9: invokestatic gsz.a (Loov;)Loov;
      // 0bc: athrow
      // 0bd: iinc 7 1
      // 0c0: iload 6
      // 0c2: ifne 1cb
      // 0c5: goto 0cc
      // 0c8: invokestatic gsz.a (Loov;)Loov;
      // 0cb: athrow
      // 0cc: iload 4
      // 0ce: iload 6
      // 0d0: ifeq 101
      // 0d3: goto 0da
      // 0d6: invokestatic gsz.a (Loov;)Loov;
      // 0d9: athrow
      // 0da: ifeq 0f3
      // 0dd: goto 0e4
      // 0e0: invokestatic gsz.a (Loov;)Loov;
      // 0e3: athrow
      // 0e4: iinc 7 -1
      // 0e7: iload 6
      // 0e9: ifne 103
      // 0ec: goto 0f3
      // 0ef: invokestatic gsz.a (Loov;)Loov;
      // 0f2: athrow
      // 0f3: iinc 7 1
      // 0f6: iinc 8 1
      // 0f9: bipush 0
      // 0fa: goto 101
      // 0fd: invokestatic gsz.a (Loov;)Loov;
      // 100: athrow
      // 101: istore 10
      // 103: getstatic y0y$_zr.jgb Ly0y$_zr;
      // 106: astore 11
      // 108: iload 6
      // 10a: ifne 1cb
      // 10d: iload 4
      // 10f: iload 6
      // 111: ifeq 133
      // 114: goto 11b
      // 117: invokestatic gsz.a (Loov;)Loov;
      // 11a: athrow
      // 11b: ifeq 13a
      // 11e: goto 125
      // 121: invokestatic gsz.a (Loov;)Loov;
      // 124: athrow
      // 125: iinc 7 -1
      // 128: iinc 8 1
      // 12b: bipush 0
      // 12c: goto 133
      // 12f: invokestatic gsz.a (Loov;)Loov;
      // 132: athrow
      // 133: istore 10
      // 135: iload 6
      // 137: ifne 144
      // 13a: iinc 7 1
      // 13d: goto 144
      // 140: invokestatic gsz.a (Loov;)Loov;
      // 143: athrow
      // 144: getstatic y0y$_zr.jgb Ly0y$_zr;
      // 147: astore 11
      // 149: iload 6
      // 14b: ifne 1cb
      // 14e: iload 4
      // 150: iload 6
      // 152: ifeq 183
      // 155: goto 15c
      // 158: invokestatic gsz.a (Loov;)Loov;
      // 15b: athrow
      // 15c: ifeq 175
      // 15f: goto 166
      // 162: invokestatic gsz.a (Loov;)Loov;
      // 165: athrow
      // 166: iinc 9 1
      // 169: iload 6
      // 16b: ifne 185
      // 16e: goto 175
      // 171: invokestatic gsz.a (Loov;)Loov;
      // 174: athrow
      // 175: iinc 9 -1
      // 178: iinc 8 1
      // 17b: bipush 0
      // 17c: goto 183
      // 17f: invokestatic gsz.a (Loov;)Loov;
      // 182: athrow
      // 183: istore 10
      // 185: getstatic y0y$_zr.ipg Ly0y$_zr;
      // 188: astore 11
      // 18a: iload 6
      // 18c: ifne 1cb
      // 18f: iload 4
      // 191: iload 6
      // 193: ifeq 1b5
      // 196: goto 19d
      // 199: invokestatic gsz.a (Loov;)Loov;
      // 19c: athrow
      // 19d: ifeq 1bc
      // 1a0: goto 1a7
      // 1a3: invokestatic gsz.a (Loov;)Loov;
      // 1a6: athrow
      // 1a7: iinc 9 1
      // 1aa: iinc 8 1
      // 1ad: bipush 0
      // 1ae: goto 1b5
      // 1b1: invokestatic gsz.a (Loov;)Loov;
      // 1b4: athrow
      // 1b5: istore 10
      // 1b7: iload 6
      // 1b9: ifne 1c6
      // 1bc: iinc 9 -1
      // 1bf: goto 1c6
      // 1c2: invokestatic gsz.a (Loov;)Loov;
      // 1c5: athrow
      // 1c6: getstatic y0y$_zr.ipg Ly0y$_zr;
      // 1c9: astore 11
      // 1cb: aload 0
      // 1cc: aload 1
      // 1cd: new mew
      // 1d0: dup
      // 1d1: iload 7
      // 1d3: iload 8
      // 1d5: iload 9
      // 1d7: invokespecial mew.<init> (III)V
      // 1da: iload 4
      // 1dc: iload 5
      // 1de: aload 11
      // 1e0: invokevirtual gsz.iek (Lt9d;Lmew;ZILy0y$_zr;)Z
      // 1e3: iload 6
      // 1e5: ifeq 1fc
      // 1e8: ifeq 1fa
      // 1eb: goto 1f2
      // 1ee: invokestatic gsz.a (Loov;)Loov;
      // 1f1: athrow
      // 1f2: bipush 1
      // 1f3: goto 240
      // 1f6: invokestatic gsz.a (Loov;)Loov;
      // 1f9: athrow
      // 1fa: iload 10
      // 1fc: iload 6
      // 1fe: ifeq 22c
      // 201: ifeq 23f
      // 204: goto 20b
      // 207: invokestatic gsz.a (Loov;)Loov;
      // 20a: athrow
      // 20b: aload 0
      // 20c: aload 1
      // 20d: new mew
      // 210: dup
      // 211: iload 7
      // 213: iload 8
      // 215: bipush 1
      // 216: isub
      // 217: iload 9
      // 219: invokespecial mew.<init> (III)V
      // 21c: iload 4
      // 21e: iload 5
      // 220: aload 11
      // 222: invokevirtual gsz.iek (Lt9d;Lmew;ZILy0y$_zr;)Z
      // 225: goto 22c
      // 228: invokestatic gsz.a (Loov;)Loov;
      // 22b: athrow
      // 22c: iload 6
      // 22e: ifeq 23c
      // 231: ifeq 23f
      // 234: goto 23b
      // 237: invokestatic gsz.a (Loov;)Loov;
      // 23a: athrow
      // 23b: bipush 1
      // 23c: goto 240
      // 23f: bipush 0
      // 240: ireturn
   }

   public boolean iek(OpaquePredicate param1, mew param2, boolean param3, int param4, y0y$_zr param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 6
      // 005: aload 1
      // 006: aload 2
      // 007: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 00a: astore 7
      // 00c: aload 7
      // 00e: iload 6
      // 010: ifne 02b
      // 013: invokeinterface zfz.r_y ()Le0x; 1
      // 018: aload 0
      // 019: if_acmpeq 029
      // 01c: goto 023
      // 01f: invokestatic gsz.a (Loov;)Loov;
      // 022: athrow
      // 023: bipush 0
      // 024: ireturn
      // 025: invokestatic gsz.a (Loov;)Loov;
      // 028: athrow
      // 029: aload 7
      // 02b: getstatic gsz.blj Lzb_;
      // 02e: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 033: checkcast y0y$_zr
      // 036: astore 8
      // 038: aload 5
      // 03a: getstatic y0y$_zr.jgb Ly0y$_zr;
      // 03d: iload 6
      // 03f: ifne 0b5
      // 042: if_acmpne 09d
      // 045: goto 04c
      // 048: invokestatic gsz.a (Loov;)Loov;
      // 04b: athrow
      // 04c: aload 8
      // 04e: getstatic y0y$_zr.ipg Ly0y$_zr;
      // 051: iload 6
      // 053: ifne 073
      // 056: goto 05d
      // 059: invokestatic gsz.a (Loov;)Loov;
      // 05c: athrow
      // 05d: if_acmpeq 16a
      // 060: goto 067
      // 063: invokestatic gsz.a (Loov;)Loov;
      // 066: athrow
      // 067: aload 8
      // 069: getstatic y0y$_zr.f3v Ly0y$_zr;
      // 06c: goto 073
      // 06f: invokestatic gsz.a (Loov;)Loov;
      // 072: athrow
      // 073: iload 6
      // 075: ifne 08e
      // 078: if_acmpeq 16a
      // 07b: goto 082
      // 07e: invokestatic gsz.a (Loov;)Loov;
      // 081: athrow
      // 082: aload 8
      // 084: getstatic y0y$_zr.gh0 Ly0y$_zr;
      // 087: goto 08e
      // 08a: invokestatic gsz.a (Loov;)Loov;
      // 08d: athrow
      // 08e: iload 6
      // 090: ifne 0b5
      // 093: if_acmpeq 16a
      // 096: goto 09d
      // 099: invokestatic gsz.a (Loov;)Loov;
      // 09c: athrow
      // 09d: aload 5
      // 09f: iload 6
      // 0a1: ifne 11a
      // 0a4: goto 0ab
      // 0a7: invokestatic gsz.a (Loov;)Loov;
      // 0aa: athrow
      // 0ab: getstatic y0y$_zr.ipg Ly0y$_zr;
      // 0ae: goto 0b5
      // 0b1: invokestatic gsz.a (Loov;)Loov;
      // 0b4: athrow
      // 0b5: if_acmpne 109
      // 0b8: aload 8
      // 0ba: getstatic y0y$_zr.jgb Ly0y$_zr;
      // 0bd: iload 6
      // 0bf: ifne 0df
      // 0c2: goto 0c9
      // 0c5: invokestatic gsz.a (Loov;)Loov;
      // 0c8: athrow
      // 0c9: if_acmpeq 166
      // 0cc: goto 0d3
      // 0cf: invokestatic gsz.a (Loov;)Loov;
      // 0d2: athrow
      // 0d3: aload 8
      // 0d5: getstatic y0y$_zr.gt1 Ly0y$_zr;
      // 0d8: goto 0df
      // 0db: invokestatic gsz.a (Loov;)Loov;
      // 0de: athrow
      // 0df: iload 6
      // 0e1: ifne 106
      // 0e4: if_acmpeq 166
      // 0e7: goto 0ee
      // 0ea: invokestatic gsz.a (Loov;)Loov;
      // 0ed: athrow
      // 0ee: aload 8
      // 0f0: iload 6
      // 0f2: ifne 11a
      // 0f5: goto 0fc
      // 0f8: invokestatic gsz.a (Loov;)Loov;
      // 0fb: athrow
      // 0fc: getstatic y0y$_zr.xew Ly0y$_zr;
      // 0ff: goto 106
      // 102: invokestatic gsz.a (Loov;)Loov;
      // 105: athrow
      // 106: if_acmpeq 166
      // 109: aload 7
      // 10b: getstatic gsz.t0z Lh76;
      // 10e: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 113: goto 11a
      // 116: invokestatic gsz.a (Loov;)Loov;
      // 119: athrow
      // 11a: checkcast java/lang/Boolean
      // 11d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 120: iload 6
      // 122: ifne 163
      // 125: ifeq 162
      // 128: goto 12f
      // 12b: invokestatic gsz.a (Loov;)Loov;
      // 12e: athrow
      // 12f: aload 1
      // 130: aload 2
      // 131: invokevirtual OpaquePredicate.gxo (Lmew;)Z
      // 134: iload 6
      // 136: ifne 15f
      // 139: goto 140
      // 13c: invokestatic gsz.a (Loov;)Loov;
      // 13f: athrow
      // 140: ifeq 152
      // 143: goto 14a
      // 146: invokestatic gsz.a (Loov;)Loov;
      // 149: athrow
      // 14a: bipush 1
      // 14b: goto 16b
      // 14e: invokestatic gsz.a (Loov;)Loov;
      // 151: athrow
      // 152: aload 0
      // 153: aload 1
      // 154: aload 2
      // 155: aload 7
      // 157: iload 3
      // 158: iload 4
      // 15a: bipush 1
      // 15b: iadd
      // 15c: invokevirtual gsz.bxm (Lt9d;Lmew;Lzfz;ZI)Z
      // 15f: goto 16b
      // 162: bipush 0
      // 163: goto 16b
      // 166: bipush 0
      // 167: goto 16b
      // 16a: bipush 0
      // 16b: ireturn
   }

   @Override
   public void bkl(OpaquePredicate param1, mew param2, zfz param3, e0x param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 5
      // 05: aload 3
      // 06: getstatic gsz.t0z Lh76;
      // 09: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0e: checkcast java/lang/Boolean
      // 11: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 14: istore 6
      // 16: aload 1
      // 17: aload 2
      // 18: invokevirtual OpaquePredicate.gxo (Lmew;)Z
      // 1b: iload 5
      // 1d: ifeq 69
      // 20: ifne 68
      // 23: goto 2a
      // 26: invokestatic gsz.a (Loov;)Loov;
      // 29: athrow
      // 2a: aload 0
      // 2b: aload 1
      // 2c: aload 2
      // 2d: aload 3
      // 2e: bipush 1
      // 2f: bipush 0
      // 30: invokevirtual gsz.bxm (Lt9d;Lmew;Lzfz;ZI)Z
      // 33: iload 5
      // 35: ifeq 69
      // 38: goto 3f
      // 3b: invokestatic gsz.a (Loov;)Loov;
      // 3e: athrow
      // 3f: ifne 68
      // 42: goto 49
      // 45: invokestatic gsz.a (Loov;)Loov;
      // 48: athrow
      // 49: aload 0
      // 4a: aload 1
      // 4b: aload 2
      // 4c: aload 3
      // 4d: bipush 0
      // 4e: bipush 0
      // 4f: invokevirtual gsz.bxm (Lt9d;Lmew;Lzfz;ZI)Z
      // 52: iload 5
      // 54: ifeq 69
      // 57: goto 5e
      // 5a: invokestatic gsz.a (Loov;)Loov;
      // 5d: athrow
      // 5e: ifeq 6c
      // 61: goto 68
      // 64: invokestatic gsz.a (Loov;)Loov;
      // 67: athrow
      // 68: bipush 1
      // 69: goto 6d
      // 6c: bipush 0
      // 6d: istore 7
      // 6f: iload 7
      // 71: iload 5
      // 73: ifeq c2
      // 76: iload 6
      // 78: if_icmpeq d5
      // 7b: goto 82
      // 7e: invokestatic gsz.a (Loov;)Loov;
      // 81: athrow
      // 82: aload 1
      // 83: aload 2
      // 84: aload 3
      // 85: getstatic gsz.t0z Lh76;
      // 88: iload 7
      // 8a: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 8d: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 92: bipush 3
      // 93: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 96: pop
      // 97: aload 1
      // 98: aload 2
      // 99: invokevirtual mew.eve ()Lmew;
      // 9c: aload 0
      // 9d: iload 5
      // 9f: ifeq d2
      // a2: goto a9
      // a5: invokestatic gsz.a (Loov;)Loov;
      // a8: athrow
      // a9: invokevirtual OpaquePredicate._0o (Lmew;Le0x;)V
      // ac: aload 3
      // ad: getstatic gsz.blj Lzb_;
      // b0: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // b5: checkcast y0y$_zr
      // b8: invokevirtual y0y$_zr.t1s ()Z
      // bb: goto c2
      // be: invokestatic gsz.a (Loov;)Loov;
      // c1: athrow
      // c2: ifeq d5
      // c5: aload 1
      // c6: aload 2
      // c7: invokevirtual mew.nuv ()Lmew;
      // ca: aload 0
      // cb: goto d2
      // ce: invokestatic gsz.a (Loov;)Loov;
      // d1: athrow
      // d2: invokevirtual OpaquePredicate._0o (Lmew;Le0x;)V
      // d5: return
   }

   @Override
   public xny fvr() {
      return blj;
   }

   @Override
   public zfz kig(int var1) {
      int var2 = OpaquePredicate.c();

      zfz var10000;
      h76 var10001;
      try {
         var10000 = this.l4i().zvi(blj, y0y$_zr.ai5(var1 & 7));
         var10001 = t0z;
         int var10002 = var1 & 8;
         if (var2 != 0) {
            return var10000.zvi(t0z, Boolean.valueOf((boolean)var10002));
         }

         if (var10002 > 0) {
            return var10000.zvi(t0z, true);
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return var10000.zvi(var10001, false);
   }

   @Override
   public int hvp(zfz var1) {
      int var3 = 0;
      int var10000 = OpaquePredicate.b();
      var3 |= ((y0y$_zr)var1.dil(blj)).g_6();
      int var2 = var10000;

      try {
         byte var6 = (Boolean)var1.dil(t0z);
         if (var2 == 0) {
            return var6;
         }

         if (var6 == 0) {
            return var3;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      var3 |= 8;
      return var3;
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{blj, t0z});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1164077818553750957L, 7202666475375836410L, MethodHandles.lookup().lookupClass()).a(76266521169948L);
      // $VF: monitorexit
      long var10 = var10000 ^ 43448744513183L;
      Cipher var1;
      Cipher var13 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[2];
      int var6 = 0;
      String var5 = "'2ôã\u001eê\u008aw\b}\u0018:nÅÙ½`";
      int var7 = "'2ôã\u001eê\u008aw\b}\u0018:nÅÙ½`".length();
      char var4 = '\b';
      int var3 = -1;

      while (true) {
         byte[] var9 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var15 = b(var9).intern();
         byte var10001 = -1;
         var8[var6++] = var15;
         if ((var3 += var4) >= var7) {
            blj = zb_._m6(var8[1], y0y$_zr.class, new gsz$1());
            t0z = h76.d_1(var8[0]);
            return;
         }

         var4 = var5.charAt(var3);
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
}
