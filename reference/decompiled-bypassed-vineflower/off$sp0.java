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

public class off$sp0 implements dxd$v9l {
   private final m7l j9j;
   private final String ekg;
   private final gt4 g4n;
   private final gt4 qa8;
   public final off i87;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   private off$sp0(off var1, m7l var2) {
      long var3 = a ^ 84675774268986L;
      this.i87 = var1;
      super();
      this.j9j = var2;
      this.ekg = fc1.gx1(var2.j16(), new Object[0]);
      this.g4n = new gt4(0, 0, 0, 75, 20, fc1.gx1(var2.j16(), new Object[0]));
      this.qa8 = new gt4(0, 0, 0, 50, 20, fc1.gx1(a<"o">(14404, 7610726299232201249L ^ var3), new Object[0]));
   }

   @Override
   public void is9(int param1, int param2, int param3, int param4, int param5, int param6, int param7, boolean param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic off$sp0.a J
      // 003: ldc2_w 38607363800234
      // 006: lxor
      // 007: lstore 9
      // 009: invokestatic t9d.c ()I
      // 00c: istore 11
      // 00e: aload 0
      // 00f: getfield off$sp0.i87 Loff;
      // 012: invokestatic off.dj4 (Loff;)Lrqh;
      // 015: getfield rqh.s7s Lm7l;
      // 018: aload 0
      // 019: getfield off$sp0.j9j Lm7l;
      // 01c: if_acmpne 027
      // 01f: bipush 1
      // 020: goto 028
      // 023: invokestatic off$sp0.a (Loov;)Loov;
      // 026: athrow
      // 027: bipush 0
      // 028: istore 12
      // 02a: aload 0
      // 02b: getfield off$sp0.i87 Loff;
      // 02e: invokestatic off.tx_ (Loff;)Lc05;
      // 031: getfield c05.tx1 Lowt;
      // 034: aload 0
      // 035: getfield off$sp0.ekg Ljava/lang/String;
      // 038: iload 2
      // 039: bipush 90
      // 03b: iadd
      // 03c: aload 0
      // 03d: getfield off$sp0.i87 Loff;
      // 040: invokestatic off.a26 (Loff;)I
      // 043: isub
      // 044: i2f
      // 045: iload 3
      // 046: iload 5
      // 048: bipush 2
      // 049: idiv
      // 04a: iadd
      // 04b: aload 0
      // 04c: getfield off$sp0.i87 Loff;
      // 04f: invokestatic off.tx_ (Loff;)Lc05;
      // 052: getfield c05.tx1 Lowt;
      // 055: getfield owt.rr7 I
      // 058: bipush 2
      // 059: idiv
      // 05a: isub
      // 05b: i2f
      // 05c: ldc 16777215
      // 05e: nop
      // 05f: invokevirtual owt.eh6 (Ljava/lang/String;FFI)I
      // 062: pop
      // 063: aload 0
      // 064: getfield off$sp0.qa8 Lgt4;
      // 067: iload 2
      // 068: sipush 190
      // 06b: iadd
      // 06c: putfield gt4.ibo I
      // 06f: aload 0
      // 070: getfield off$sp0.qa8 Lgt4;
      // 073: iload 3
      // 074: putfield gt4.mij I
      // 077: aload 0
      // 078: getfield off$sp0.qa8 Lgt4;
      // 07b: aload 0
      // 07c: getfield off$sp0.j9j Lm7l;
      // 07f: invokevirtual m7l.xbs ()I
      // 082: iload 11
      // 084: ifne 0a0
      // 087: aload 0
      // 088: getfield off$sp0.j9j Lm7l;
      // 08b: invokevirtual m7l.g2s ()I
      // 08e: if_icmpeq 0a3
      // 091: goto 098
      // 094: invokestatic off$sp0.a (Loov;)Loov;
      // 097: athrow
      // 098: bipush 1
      // 099: goto 0a0
      // 09c: invokestatic off$sp0.a (Loov;)Loov;
      // 09f: athrow
      // 0a0: goto 0a4
      // 0a3: bipush 0
      // 0a4: putfield gt4.c9a Z
      // 0a7: aload 0
      // 0a8: getfield off$sp0.qa8 Lgt4;
      // 0ab: aload 0
      // 0ac: getfield off$sp0.i87 Loff;
      // 0af: invokestatic off.tx_ (Loff;)Lc05;
      // 0b2: iload 6
      // 0b4: iload 7
      // 0b6: invokevirtual gt4.drawButton (Lc05;II)V
      // 0b9: aload 0
      // 0ba: getfield off$sp0.g4n Lgt4;
      // 0bd: iload 2
      // 0be: bipush 105
      // 0c0: iadd
      // 0c1: putfield gt4.ibo I
      // 0c4: aload 0
      // 0c5: getfield off$sp0.g4n Lgt4;
      // 0c8: iload 3
      // 0c9: putfield gt4.mij I
      // 0cc: aload 0
      // 0cd: getfield off$sp0.g4n Lgt4;
      // 0d0: aload 0
      // 0d1: getfield off$sp0.j9j Lm7l;
      // 0d4: invokevirtual m7l.xbs ()I
      // 0d7: invokestatic moh.wx5 (I)Ljava/lang/String;
      // 0da: putfield gt4.frg Ljava/lang/String;
      // 0dd: bipush 0
      // 0de: istore 13
      // 0e0: aload 0
      // 0e1: getfield off$sp0.j9j Lm7l;
      // 0e4: invokevirtual m7l.xbs ()I
      // 0e7: iload 11
      // 0e9: ifne 17e
      // 0ec: ifeq 17c
      // 0ef: goto 0f6
      // 0f2: invokestatic off$sp0.a (Loov;)Loov;
      // 0f5: athrow
      // 0f6: aload 0
      // 0f7: getfield off$sp0.i87 Loff;
      // 0fa: invokestatic off.tx_ (Loff;)Lc05;
      // 0fd: getfield c05.oxn Lmoh;
      // 100: getfield moh.wf7 [Lm7l;
      // 103: astore 14
      // 105: aload 14
      // 107: arraylength
      // 108: istore 15
      // 10a: bipush 0
      // 10b: istore 16
      // 10d: iload 16
      // 10f: iload 15
      // 111: if_icmpge 17c
      // 114: aload 14
      // 116: iload 16
      // 118: aaload
      // 119: astore 17
      // 11b: iload 11
      // 11d: ifne 1ea
      // 120: iload 11
      // 122: ifne 177
      // 125: goto 12c
      // 128: invokestatic off$sp0.a (Loov;)Loov;
      // 12b: athrow
      // 12c: aload 17
      // 12e: aload 0
      // 12f: getfield off$sp0.j9j Lm7l;
      // 132: if_acmpeq 16d
      // 135: goto 13c
      // 138: invokestatic off$sp0.a (Loov;)Loov;
      // 13b: athrow
      // 13c: aload 17
      // 13e: invokevirtual m7l.xbs ()I
      // 141: iload 11
      // 143: ifne 166
      // 146: goto 14d
      // 149: invokestatic off$sp0.a (Loov;)Loov;
      // 14c: athrow
      // 14d: aload 0
      // 14e: getfield off$sp0.j9j Lm7l;
      // 151: invokevirtual m7l.xbs ()I
      // 154: if_icmpne 16d
      // 157: goto 15e
      // 15a: invokestatic off$sp0.a (Loov;)Loov;
      // 15d: athrow
      // 15e: bipush 1
      // 15f: goto 166
      // 162: invokestatic off$sp0.a (Loov;)Loov;
      // 165: athrow
      // 166: istore 13
      // 168: iload 11
      // 16a: ifeq 17c
      // 16d: iinc 16 1
      // 170: goto 177
      // 173: invokestatic off$sp0.a (Loov;)Loov;
      // 176: athrow
      // 177: iload 11
      // 179: ifeq 10d
      // 17c: iload 12
      // 17e: iload 11
      // 180: ifne 1ec
      // 183: ifeq 1ea
      // 186: goto 18d
      // 189: invokestatic off$sp0.a (Loov;)Loov;
      // 18c: athrow
      // 18d: aload 0
      // 18e: getfield off$sp0.g4n Lgt4;
      // 191: new java/lang/StringBuilder
      // 194: dup
      // 195: invokespecial java/lang/StringBuilder.<init> ()V
      // 198: getstatic syo.rl1 Lsyo;
      // 19b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 19e: sipush 15540
      // 1a1: ldc2_w 5204587428846982210
      // 1a4: lload 9
      // 1a6: lxor
      // 1a7: invokedynamic o (IJ)Ljava/lang/String; bsm=off$sp0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ac: nop
      // 1ad: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1b0: getstatic syo.iyk Lsyo;
      // 1b3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1b6: aload 0
      // 1b7: getfield off$sp0.g4n Lgt4;
      // 1ba: getfield gt4.frg Ljava/lang/String;
      // 1bd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c0: getstatic syo.rl1 Lsyo;
      // 1c3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1c6: sipush 25815
      // 1c9: ldc2_w 6518312419890400288
      // 1cc: lload 9
      // 1ce: lxor
      // 1cf: invokedynamic o (IJ)Ljava/lang/String; bsm=off$sp0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d4: nop
      // 1d5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1d8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1db: putfield gt4.frg Ljava/lang/String;
      // 1de: iload 11
      // 1e0: ifeq 217
      // 1e3: goto 1ea
      // 1e6: invokestatic off$sp0.a (Loov;)Loov;
      // 1e9: athrow
      // 1ea: iload 13
      // 1ec: ifeq 217
      // 1ef: aload 0
      // 1f0: getfield off$sp0.g4n Lgt4;
      // 1f3: new java/lang/StringBuilder
      // 1f6: dup
      // 1f7: invokespecial java/lang/StringBuilder.<init> ()V
      // 1fa: getstatic syo.aez Lsyo;
      // 1fd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 200: aload 0
      // 201: getfield off$sp0.g4n Lgt4;
      // 204: getfield gt4.frg Ljava/lang/String;
      // 207: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 20a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 20d: putfield gt4.frg Ljava/lang/String;
      // 210: goto 217
      // 213: invokestatic off$sp0.a (Loov;)Loov;
      // 216: athrow
      // 217: aload 0
      // 218: getfield off$sp0.g4n Lgt4;
      // 21b: aload 0
      // 21c: getfield off$sp0.i87 Loff;
      // 21f: invokestatic off.tx_ (Loff;)Lc05;
      // 222: iload 6
      // 224: iload 7
      // 226: invokevirtual gt4.drawButton (Lc05;II)V
      // 229: return
   }

   @Override
   public boolean r6b(int param1, int param2, int param3, int param4, int param5, int param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 7
      // 05: aload 0
      // 06: getfield off$sp0.g4n Lgt4;
      // 09: aload 0
      // 0a: getfield off$sp0.i87 Loff;
      // 0d: invokestatic off.tx_ (Loff;)Lc05;
      // 10: iload 2
      // 11: iload 3
      // 12: invokevirtual gt4.mousePressed (Lc05;II)Z
      // 15: iload 7
      // 17: ifeq 48
      // 1a: ifeq 38
      // 1d: goto 24
      // 20: invokestatic off$sp0.a (Loov;)Loov;
      // 23: athrow
      // 24: aload 0
      // 25: getfield off$sp0.i87 Loff;
      // 28: invokestatic off.dj4 (Loff;)Lrqh;
      // 2b: aload 0
      // 2c: getfield off$sp0.j9j Lm7l;
      // 2f: putfield rqh.s7s Lm7l;
      // 32: bipush 1
      // 33: ireturn
      // 34: invokestatic off$sp0.a (Loov;)Loov;
      // 37: athrow
      // 38: aload 0
      // 39: getfield off$sp0.qa8 Lgt4;
      // 3c: aload 0
      // 3d: getfield off$sp0.i87 Loff;
      // 40: invokestatic off.tx_ (Loff;)Lc05;
      // 43: iload 2
      // 44: iload 3
      // 45: invokevirtual gt4.mousePressed (Lc05;II)Z
      // 48: iload 7
      // 4a: ifeq 79
      // 4d: ifeq 78
      // 50: goto 57
      // 53: invokestatic off$sp0.a (Loov;)Loov;
      // 56: athrow
      // 57: aload 0
      // 58: getfield off$sp0.i87 Loff;
      // 5b: invokestatic off.tx_ (Loff;)Lc05;
      // 5e: getfield c05.oxn Lmoh;
      // 61: aload 0
      // 62: getfield off$sp0.j9j Lm7l;
      // 65: aload 0
      // 66: getfield off$sp0.j9j Lm7l;
      // 69: invokevirtual m7l.g2s ()I
      // 6c: invokevirtual moh.e4u (Lm7l;I)V
      // 6f: invokestatic m7l.r3g ()V
      // 72: bipush 1
      // 73: ireturn
      // 74: invokestatic off$sp0.a (Loov;)Loov;
      // 77: athrow
      // 78: bipush 0
      // 79: ireturn
   }

   @Override
   public void l_a(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.g4n.mouseReleased(var2, var3);
      this.qa8.mouseReleased(var2, var3);
   }

   @Override
   public void _at(int var1, int var2, int var3) {
   }

   public off$sp0(off var1, m7l var2, off$1 var3) {
      this(var1, var2);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(8799272815135665280L, 9013143308513614912L, MethodHandles.lookup().lookupClass()).a(3153537678326L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 105154682669011L;
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
      String var6 = "ø1£Þ\u0013¶,\u00ad\u0012kÄ\u0003\u0005û³\\\u0010\u0018Ë!Ô¡\f´\u009f\fg\u0089õH9}A ]Ù¢\u008c73\u0016\u0098 ·\u0096Ty\u000eo\u0002`dMû\\ì4\u0093ù\r\u008cgãØß\u0088";
      int var8 = "ø1£Þ\u0013¶,\u00ad\u0012kÄ\u0003\u0005û³\\\u0010\u0018Ë!Ô¡\f´\u009f\fg\u0089õH9}A ]Ù¢\u008c73\u0016\u0098 ·\u0096Ty\u000eo\u0002`dMû\\ì4\u0093ù\r\u008cgãØß\u0088"
         .length();
      char var5 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 15025;
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
            throw new RuntimeException("off$sp0", var10);
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
         throw new RuntimeException("off$sp0" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
