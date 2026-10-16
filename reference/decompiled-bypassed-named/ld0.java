import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ld0 extends sss {
   private static final long c;
   private static final String B;

   public ld0(OpaquePredicate var1) {
      super(var1);
      this.yxc(0.9F, 1.3F);
      this.n17 = ox_.pl8;
   }

   @Override
   public boolean hp6(ha9 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic ld0.c J
      // 003: ldc2_w 134842706396164
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 4
      // 00d: aload 1
      // 00e: getfield ha9.up_ Ljnq;
      // 011: invokevirtual jnq.dxs ()Lerg;
      // 014: astore 5
      // 016: aload 5
      // 018: iload 4
      // 01a: ifeq 0f1
      // 01d: ifnull 0ef
      // 020: goto 027
      // 023: invokestatic ld0.a (Loov;)Loov;
      // 026: athrow
      // 027: aload 5
      // 029: iload 4
      // 02b: ifeq 0f1
      // 02e: goto 035
      // 031: invokestatic ld0.a (Loov;)Loov;
      // 034: athrow
      // 035: invokevirtual erg.gn1 ()Lu7m;
      // 038: getstatic xbr.xz5 Lu7m;
      // 03b: if_acmpne 0ef
      // 03e: goto 045
      // 041: invokestatic ld0.a (Loov;)Loov;
      // 044: athrow
      // 045: aload 0
      // 046: invokevirtual ld0.ktm ()I
      // 049: iload 4
      // 04b: ifeq 06b
      // 04e: goto 055
      // 051: invokestatic ld0.a (Loov;)Loov;
      // 054: athrow
      // 055: iflt 0ef
      // 058: goto 05f
      // 05b: invokestatic ld0.a (Loov;)Loov;
      // 05e: athrow
      // 05f: aload 5
      // 061: getfield erg.qd2 I
      // 064: goto 06b
      // 067: invokestatic ld0.a (Loov;)Loov;
      // 06a: athrow
      // 06b: iload 4
      // 06d: ifeq 0aa
      // 070: bipush 1
      // 071: if_icmpne 099
      // 074: goto 07b
      // 077: invokestatic ld0.a (Loov;)Loov;
      // 07a: athrow
      // 07b: aload 1
      // 07c: getfield ha9.up_ Ljnq;
      // 07f: aload 1
      // 080: getfield ha9.up_ Ljnq;
      // 083: getfield jnq.nb5 I
      // 086: new erg
      // 089: dup
      // 08a: getstatic xbr.xvc Lu7m;
      // 08d: invokespecial erg.<init> (Lu7m;)V
      // 090: invokevirtual jnq.cxl (ILerg;)V
      // 093: bipush 1
      // 094: ireturn
      // 095: invokestatic ld0.a (Loov;)Loov;
      // 098: athrow
      // 099: aload 1
      // 09a: getfield ha9.up_ Ljnq;
      // 09d: new erg
      // 0a0: dup
      // 0a1: getstatic xbr.xvc Lu7m;
      // 0a4: invokespecial erg.<init> (Lu7m;)V
      // 0a7: invokevirtual jnq.phd (Lerg;)Z
      // 0aa: iload 4
      // 0ac: ifeq 0c7
      // 0af: ifeq 0ef
      // 0b2: goto 0b9
      // 0b5: invokestatic ld0.a (Loov;)Loov;
      // 0b8: athrow
      // 0b9: aload 1
      // 0ba: getfield ha9.lls Lpj2;
      // 0bd: getfield pj2.g40 Z
      // 0c0: goto 0c7
      // 0c3: invokestatic ld0.a (Loov;)Loov;
      // 0c6: athrow
      // 0c7: iload 4
      // 0c9: ifeq 0ee
      // 0cc: ifne 0ef
      // 0cf: goto 0d6
      // 0d2: invokestatic ld0.a (Loov;)Loov;
      // 0d5: athrow
      // 0d6: aload 1
      // 0d7: getfield ha9.up_ Ljnq;
      // 0da: aload 1
      // 0db: getfield ha9.up_ Ljnq;
      // 0de: getfield jnq.nb5 I
      // 0e1: bipush 1
      // 0e2: invokevirtual jnq.afc (II)Lerg;
      // 0e5: pop
      // 0e6: bipush 1
      // 0e7: goto 0ee
      // 0ea: invokestatic ld0.a (Loov;)Loov;
      // 0ed: athrow
      // 0ee: ireturn
      // 0ef: aload 5
      // 0f1: iload 4
      // 0f3: ifeq 102
      // 0f6: ifnull 22e
      // 0f9: goto 100
      // 0fc: invokestatic ld0.a (Loov;)Loov;
      // 0ff: athrow
      // 100: aload 5
      // 102: invokevirtual erg.gn1 ()Lu7m;
      // 105: getstatic xbr.qsl Lguw;
      // 108: if_acmpne 22e
      // 10b: aload 0
      // 10c: invokevirtual ld0.ktm ()I
      // 10f: iload 4
      // 111: ifeq 233
      // 114: goto 11b
      // 117: invokestatic ld0.a (Loov;)Loov;
      // 11a: athrow
      // 11b: iflt 22e
      // 11e: goto 125
      // 121: invokestatic ld0.a (Loov;)Loov;
      // 124: athrow
      // 125: aload 0
      // 126: invokevirtual ld0._kl ()V
      // 129: aload 0
      // 12a: getfield ld0.oay Lt9d;
      // 12d: getstatic w_0.tmu Lw_0;
      // 130: aload 0
      // 131: getfield ld0.o2v D
      // 134: aload 0
      // 135: getfield ld0.kfp D
      // 138: aload 0
      // 139: getfield ld0.ikl F
      // 13c: fconst_2
      // 13d: fdiv
      // 13e: f2d
      // 13f: dadd
      // 140: aload 0
      // 141: getfield ld0.vbd D
      // 144: dconst_0
      // 145: dconst_0
      // 146: dconst_0
      // 147: bipush 0
      // 148: newarray 10
      // 14a: invokevirtual OpaquePredicate.zvy (Lw_0;DDDDDD[I)V
      // 14d: aload 0
      // 14e: getfield ld0.oay Lt9d;
      // 151: getfield OpaquePredicate.v0f Z
      // 154: iload 4
      // 156: ifeq 22d
      // 159: goto 160
      // 15c: invokestatic ld0.a (Loov;)Loov;
      // 15f: athrow
      // 160: ifne 22c
      // 163: goto 16a
      // 166: invokestatic ld0.a (Loov;)Loov;
      // 169: athrow
      // 16a: new sss
      // 16d: dup
      // 16e: aload 0
      // 16f: getfield ld0.oay Lt9d;
      // 172: invokespecial sss.<init> (Lt9d;)V
      // 175: astore 6
      // 177: aload 6
      // 179: aload 0
      // 17a: getfield ld0.o2v D
      // 17d: aload 0
      // 17e: getfield ld0.kfp D
      // 181: aload 0
      // 182: getfield ld0.vbd D
      // 185: aload 0
      // 186: getfield ld0.x5k F
      // 189: aload 0
      // 18a: getfield ld0.y2i F
      // 18d: invokevirtual sss.x24 (DDDFF)V
      // 190: aload 6
      // 192: aload 0
      // 193: invokevirtual ld0.i55 ()F
      // 196: invokevirtual sss.uh3 (F)V
      // 199: aload 6
      // 19b: aload 0
      // 19c: getfield ld0.ksw F
      // 19f: putfield sss.ksw F
      // 1a2: aload 0
      // 1a3: invokevirtual ld0.qrh ()Z
      // 1a6: iload 4
      // 1a8: ifeq 1d0
      // 1ab: ifeq 1c5
      // 1ae: goto 1b5
      // 1b1: invokestatic ld0.a (Loov;)Loov;
      // 1b4: athrow
      // 1b5: aload 6
      // 1b7: aload 0
      // 1b8: invokevirtual ld0.hei ()Ljava/lang/String;
      // 1bb: invokevirtual sss.x84 (Ljava/lang/String;)V
      // 1be: goto 1c5
      // 1c1: invokestatic ld0.a (Loov;)Loov;
      // 1c4: athrow
      // 1c5: aload 0
      // 1c6: getfield ld0.oay Lt9d;
      // 1c9: aload 6
      // 1cb: invokevirtual OpaquePredicate.xzq (Li2h;)Z
      // 1ce: pop
      // 1cf: bipush 0
      // 1d0: istore 7
      // 1d2: iload 7
      // 1d4: bipush 5
      // 1d5: if_icmpge 21b
      // 1d8: aload 0
      // 1d9: getfield ld0.oay Lt9d;
      // 1dc: new nvf
      // 1df: dup
      // 1e0: aload 0
      // 1e1: getfield ld0.oay Lt9d;
      // 1e4: aload 0
      // 1e5: getfield ld0.o2v D
      // 1e8: aload 0
      // 1e9: getfield ld0.kfp D
      // 1ec: aload 0
      // 1ed: getfield ld0.ikl F
      // 1f0: f2d
      // 1f1: dadd
      // 1f2: aload 0
      // 1f3: getfield ld0.vbd D
      // 1f6: new erg
      // 1f9: dup
      // 1fa: getstatic ox_.ae9 Lrrw;
      // 1fd: invokespecial erg.<init> (Le0x;)V
      // 200: invokespecial nvf.<init> (Lt9d;DDDLerg;)V
      // 203: invokevirtual OpaquePredicate.xzq (Li2h;)Z
      // 206: pop
      // 207: iinc 7 1
      // 20a: iload 4
      // 20c: ifeq 222
      // 20f: iload 4
      // 211: ifne 1d2
      // 214: goto 21b
      // 217: invokestatic ld0.a (Loov;)Loov;
      // 21a: athrow
      // 21b: aload 5
      // 21d: bipush 1
      // 21e: aload 1
      // 21f: invokevirtual erg.ybw (ILg_3;)V
      // 222: aload 0
      // 223: getstatic ld0.B Ljava/lang/String;
      // 226: nop
      // 227: fconst_1
      // 228: fconst_1
      // 229: invokevirtual ld0.lhu (Ljava/lang/String;FF)V
      // 22c: bipush 1
      // 22d: ireturn
      // 22e: aload 0
      // 22f: aload 1
      // 230: invokespecial sss.hp6 (Lha9;)Z
      // 233: ireturn
   }

   public ld0 kv0(dms var1) {
      return new ld0(this.oay);
   }

   @Override
   public sss kv0(dms var1) {
      return this.kv0(var1);
   }

   @Override
   public dms kv0(dms var1) {
      return this.kv0(var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3155273203118013938L, 8049367792604806904L, MethodHandles.lookup().lookupClass()).a(145988306298524L);
      // $VF: monitorexit
      c = var10000;
      long var0 = c ^ 82887884366445L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("È\u008c0¹ÆR\u000eU\u0018¶\u0088y3\u001cc\u0089".getBytes("ISO-8859-1"));
      String var6 = h(var4).intern();
      byte var10001 = -1;
      B = var6;
   }

   private static oov a(oov var0) {
      return var0;
   }

   private static String h(byte[] var0) {
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
