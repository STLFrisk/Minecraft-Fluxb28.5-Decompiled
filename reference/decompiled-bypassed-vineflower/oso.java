import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class oso extends ak9 {
   public String tto;
   public c_3 zfz;
   public int ptm;
   public ar7 iq2;
   public int wbc;
   private static final long a;
   private static final String c;

   public oso(c_3 var1, nm6 var2, int var3, int var4, ar7 var5) {
      long var6 = a ^ 92702324109052L;
      super(var2, var3, var4, "");
      this.vms = jvy.ypj;
      this.zfz = var1;
      this.c1c = 11 * var1.dyh().length;
      this.bqh = c;
      this.iq2 = var5;
   }

   public oso(c_3 var1, nm6 var2, int var3, int var4, int var5) {
      this(var1, var2, var3, var4, null);
      this.wbc = var5;
   }

   public oso(c_3 var1, nm6 var2, int var3, int var4) {
      this(var1, var2, var3, var4, null);
   }

   public oso(ar7 var1, nm6 var2, int var3, int var4) {
      this(var1.smu(), var2, var3, var4, var1);
   }

   @Override
   public void c2n(int var1, int var2) {
      super.c2n(var1, var1);
   }

   @Override
   public void g1p(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 3
      // 004: bipush 0
      // 005: istore 4
      // 007: iload 4
      // 009: aload 0
      // 00a: getfield oso.zfz Lc_3;
      // 00d: invokevirtual c_3.dyh ()[Ljava/lang/String;
      // 010: arraylength
      // 011: if_icmpge 192
      // 014: aload 0
      // 015: getfield oso.mff I
      // 018: aload 0
      // 019: getfield oso.wbc I
      // 01c: iadd
      // 01d: bipush 11
      // 01f: iload 4
      // 021: imul
      // 022: iadd
      // 023: i2f
      // 024: fstore 5
      // 026: aload 0
      // 027: getfield oso.ptm I
      // 02a: iload 3
      // 02b: ifeq 07a
      // 02e: iload 4
      // 030: if_icmpne 077
      // 033: goto 03a
      // 036: invokestatic oso.a (Loov;)Loov;
      // 039: athrow
      // 03a: getstatic jvy.ck5 Z
      // 03d: iload 3
      // 03e: ifeq 074
      // 041: goto 048
      // 044: invokestatic oso.a (Loov;)Loov;
      // 047: athrow
      // 048: ifeq 06c
      // 04b: goto 052
      // 04e: invokestatic oso.a (Loov;)Loov;
      // 051: athrow
      // 052: new java/awt/Color
      // 055: dup
      // 056: ldc -1710875
      // 058: nop
      // 059: invokespecial java/awt/Color.<init> (I)V
      // 05c: invokevirtual java/awt/Color.darker ()Ljava/awt/Color;
      // 05f: invokevirtual java/awt/Color.darker ()Ljava/awt/Color;
      // 062: invokevirtual java/awt/Color.getRGB ()I
      // 065: goto 0a5
      // 068: invokestatic oso.a (Loov;)Loov;
      // 06b: athrow
      // 06c: getstatic jvy.cnm I
      // 06f: bipush -30
      // 071: invokestatic mkt.kgs (II)I
      // 074: goto 0a5
      // 077: getstatic jvy.ck5 Z
      // 07a: iload 3
      // 07b: ifeq 09f
      // 07e: ifeq 0a2
      // 081: goto 088
      // 084: invokestatic oso.a (Loov;)Loov;
      // 087: athrow
      // 088: new java/awt/Color
      // 08b: dup
      // 08c: ldc -1710875
      // 08e: nop
      // 08f: invokespecial java/awt/Color.<init> (I)V
      // 092: invokevirtual java/awt/Color.darker ()Ljava/awt/Color;
      // 095: invokevirtual java/awt/Color.getRGB ()I
      // 098: goto 09f
      // 09b: invokestatic oso.a (Loov;)Loov;
      // 09e: athrow
      // 09f: goto 0a5
      // 0a2: getstatic jvy.cnm I
      // 0a5: istore 6
      // 0a7: getstatic jsr.erx Lcyb;
      // 0aa: aload 0
      // 0ab: getfield oso.zfz Lc_3;
      // 0ae: invokevirtual c_3.dyh ()[Ljava/lang/String;
      // 0b1: iload 4
      // 0b3: aaload
      // 0b4: aload 0
      // 0b5: getfield oso.koa I
      // 0b8: bipush 17
      // 0ba: iadd
      // 0bb: bipush 2
      // 0bc: iadd
      // 0bd: i2f
      // 0be: fload 5
      // 0c0: ldc 4.5
      // 0c2: nop
      // 0c3: fadd
      // 0c4: getstatic jvy.ck5 Z
      // 0c7: iload 3
      // 0c8: ifeq 0e4
      // 0cb: ifeq 0e2
      // 0ce: goto 0d5
      // 0d1: invokestatic oso.a (Loov;)Loov;
      // 0d4: athrow
      // 0d5: getstatic z7e.kks Lz7e;
      // 0d8: getfield z7e.k0y I
      // 0db: goto 0e5
      // 0de: invokestatic oso.a (Loov;)Loov;
      // 0e1: athrow
      // 0e2: ldc 16777215
      // 0e4: nop
      // 0e5: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // 0e8: pop
      // 0e9: aload 0
      // 0ea: getfield oso.koa I
      // 0ed: bipush 10
      // 0ef: iadd
      // 0f0: i2f
      // 0f1: fload 5
      // 0f3: ldc 5.0
      // 0f5: nop
      // 0f6: fadd
      // 0f7: ldc 6.5
      // 0f9: nop
      // 0fa: ldc 6.5
      // 0fc: nop
      // 0fd: ldc 5.0
      // 0ff: nop
      // 100: iload 6
      // 102: fconst_1
      // 103: iload 6
      // 105: invokestatic mkt.o8m (FFFFFIFI)V
      // 108: iload 3
      // 109: ifeq 18e
      // 10c: aload 0
      // 10d: getfield oso.zfz Lc_3;
      // 110: invokevirtual c_3.d7c ()Ljava/lang/String;
      // 113: aload 0
      // 114: getfield oso.zfz Lc_3;
      // 117: invokevirtual c_3.dyh ()[Ljava/lang/String;
      // 11a: iload 4
      // 11c: aaload
      // 11d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 120: ifeq 18b
      // 123: goto 12a
      // 126: invokestatic oso.a (Loov;)Loov;
      // 129: athrow
      // 12a: aload 0
      // 12b: getfield oso.koa I
      // 12e: i2f
      // 12f: ldc 11.0
      // 131: nop
      // 132: fadd
      // 133: fload 5
      // 135: ldc 6.0
      // 137: nop
      // 138: fadd
      // 139: ldc 4.5
      // 13b: nop
      // 13c: ldc 4.5
      // 13e: nop
      // 13f: ldc 5.0
      // 141: nop
      // 142: getstatic jvy.ck5 Z
      // 145: iload 3
      // 146: ifeq 166
      // 149: goto 150
      // 14c: invokestatic oso.a (Loov;)Loov;
      // 14f: athrow
      // 150: ifeq 164
      // 153: goto 15a
      // 156: invokestatic oso.a (Loov;)Loov;
      // 159: athrow
      // 15a: getstatic jvy.ts6 I
      // 15d: goto 167
      // 160: invokestatic oso.a (Loov;)Loov;
      // 163: athrow
      // 164: ldc 16777215
      // 166: nop
      // 167: ldc 0.1
      // 169: nop
      // 16a: getstatic jvy.ck5 Z
      // 16d: iload 3
      // 16e: ifeq 187
      // 171: ifeq 185
      // 174: goto 17b
      // 177: invokestatic oso.a (Loov;)Loov;
      // 17a: athrow
      // 17b: getstatic jvy.ts6 I
      // 17e: goto 188
      // 181: invokestatic oso.a (Loov;)Loov;
      // 184: athrow
      // 185: ldc 16777215
      // 187: nop
      // 188: invokestatic mkt.o8m (FFFFFIFI)V
      // 18b: iinc 4 1
      // 18e: iload 3
      // 18f: ifne 007
      // 192: return
   }

   @Override
   public void x6o(int param1, int param2, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 4
      // 005: aload 0
      // 006: aload 0
      // 007: iload 1
      // 008: iload 2
      // 009: invokevirtual oso.nxv (II)Z
      // 00c: iload 4
      // 00e: ifne 02b
      // 011: ifeq 03e
      // 014: goto 01b
      // 017: invokestatic oso.a (Loov;)Loov;
      // 01a: athrow
      // 01b: aload 0
      // 01c: getfield oso.loa Lnm6;
      // 01f: iload 1
      // 020: iload 2
      // 021: invokevirtual nm6.au1 (II)Z
      // 024: goto 02b
      // 027: invokestatic oso.a (Loov;)Loov;
      // 02a: athrow
      // 02b: iload 4
      // 02d: ifne 03b
      // 030: ifeq 03e
      // 033: goto 03a
      // 036: invokestatic oso.a (Loov;)Loov;
      // 039: athrow
      // 03a: bipush 1
      // 03b: goto 03f
      // 03e: bipush 0
      // 03f: putfield oso.yu6 Z
      // 042: aload 0
      // 043: getfield oso.yu6 Z
      // 046: iload 4
      // 048: ifne 076
      // 04b: ifne 05f
      // 04e: goto 055
      // 051: invokestatic oso.a (Loov;)Loov;
      // 054: athrow
      // 055: aload 0
      // 056: bipush -1
      // 057: putfield oso.ptm I
      // 05a: return
      // 05b: invokestatic oso.a (Loov;)Loov;
      // 05e: athrow
      // 05f: aload 0
      // 060: aload 0
      // 061: iload 1
      // 062: iload 2
      // 063: invokespecial oso.hm1 (II)I
      // 066: putfield oso.ptm I
      // 069: iload 4
      // 06b: ifne 12e
      // 06e: iload 3
      // 06f: goto 076
      // 072: invokestatic oso.a (Loov;)Loov;
      // 075: athrow
      // 076: ifeq 129
      // 079: aload 0
      // 07a: iload 4
      // 07c: ifne 12a
      // 07f: goto 086
      // 082: invokestatic oso.a (Loov;)Loov;
      // 085: athrow
      // 086: getfield oso.u_u Z
      // 089: ifne 129
      // 08c: goto 093
      // 08f: invokestatic oso.a (Loov;)Loov;
      // 092: athrow
      // 093: aload 0
      // 094: iload 4
      // 096: ifne 12a
      // 099: goto 0a0
      // 09c: invokestatic oso.a (Loov;)Loov;
      // 09f: athrow
      // 0a0: getfield oso.yu6 Z
      // 0a3: ifeq 129
      // 0a6: goto 0ad
      // 0a9: invokestatic oso.a (Loov;)Loov;
      // 0ac: athrow
      // 0ad: aload 0
      // 0ae: iload 4
      // 0b0: ifne 12a
      // 0b3: goto 0ba
      // 0b6: invokestatic oso.a (Loov;)Loov;
      // 0b9: athrow
      // 0ba: getfield oso.ptm I
      // 0bd: bipush -1
      // 0be: if_icmpeq 129
      // 0c1: goto 0c8
      // 0c4: invokestatic oso.a (Loov;)Loov;
      // 0c7: athrow
      // 0c8: aload 0
      // 0c9: getfield oso.zfz Lc_3;
      // 0cc: aload 0
      // 0cd: getfield oso.zfz Lc_3;
      // 0d0: invokevirtual c_3.dyh ()[Ljava/lang/String;
      // 0d3: aload 0
      // 0d4: getfield oso.ptm I
      // 0d7: aaload
      // 0d8: invokevirtual c_3.n1j (Ljava/lang/String;)V
      // 0db: aload 0
      // 0dc: iload 4
      // 0de: ifne 12a
      // 0e1: goto 0e8
      // 0e4: invokestatic oso.a (Loov;)Loov;
      // 0e7: athrow
      // 0e8: getfield oso.iq2 Lar7;
      // 0eb: ifnull 129
      // 0ee: goto 0f5
      // 0f1: invokestatic oso.a (Loov;)Loov;
      // 0f4: athrow
      // 0f5: aload 0
      // 0f6: iload 4
      // 0f8: ifne 12a
      // 0fb: goto 102
      // 0fe: invokestatic oso.a (Loov;)Loov;
      // 101: athrow
      // 102: getfield oso.iq2 Lar7;
      // 105: invokevirtual ar7.klu ()Z
      // 108: ifeq 129
      // 10b: goto 112
      // 10e: invokestatic oso.a (Loov;)Loov;
      // 111: athrow
      // 112: aload 0
      // 113: getfield oso.iq2 Lar7;
      // 116: bipush 0
      // 117: invokevirtual ar7.dv9 (Z)V
      // 11a: aload 0
      // 11b: getfield oso.iq2 Lar7;
      // 11e: bipush 1
      // 11f: invokevirtual ar7.dv9 (Z)V
      // 122: goto 129
      // 125: invokestatic oso.a (Loov;)Loov;
      // 128: athrow
      // 129: aload 0
      // 12a: iload 3
      // 12b: putfield oso.u_u Z
      // 12e: return
   }

   private int hm1(int var1, int var2) {
      int var4 = var2 - this.mff;
      int var10000 = t9d.b();
      int var5 = 0;
      int var3 = var10000;
      int var6 = var4;

      while (var6 > 11) {
         var5++;
         var6 -= 11;
         if (var3 == 0) {
            break;
         }
      }

      return var5;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(239838165036068367L, -8017124762873792482L, MethodHandles.lookup().lookupClass()).a(18587505365789L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 31113156861588L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("ùÏ¶fæ¡(\u001a\u0080\u0080È±\u0007¾®1".getBytes("ISO-8859-1"));
      String var6 = b(var4).intern();
      byte var10001 = -1;
      c = var6;
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
