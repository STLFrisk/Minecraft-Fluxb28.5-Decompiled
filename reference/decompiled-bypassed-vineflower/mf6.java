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

public abstract class mf6 extends zg9 {
   private static final long a;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public mf6(_jc var1) {
      super(var1);
   }

   @Override
   public void initGui() {
      super.initGui();
      this.tut();
   }

   public void tut() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 5f
      // 09: getfield mf6.f41 Lc05;
      // 0c: getfield c05.vg8 Ll86;
      // 0f: invokevirtual l86.g5i ()Ljava/util/Collection;
      // 12: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 17: ifne 48
      // 1a: goto 21
      // 1d: invokestatic mf6.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 0
      // 22: sipush 160
      // 25: aload 0
      // 26: getfield mf6.dt7 I
      // 29: aload 0
      // 2a: getfield mf6.poy I
      // 2d: isub
      // 2e: sipush 200
      // 31: isub
      // 32: bipush 2
      // 33: idiv
      // 34: iadd
      // 35: putfield mf6.tjm I
      // 38: aload 0
      // 39: bipush 1
      // 3a: putfield mf6.hb8 Z
      // 3d: iload 1
      // 3e: ifne 63
      // 41: goto 48
      // 44: invokestatic mf6.a (Loov;)Loov;
      // 47: athrow
      // 48: aload 0
      // 49: aload 0
      // 4a: getfield mf6.dt7 I
      // 4d: aload 0
      // 4e: getfield mf6.poy I
      // 51: isub
      // 52: bipush 2
      // 53: idiv
      // 54: putfield mf6.tjm I
      // 57: aload 0
      // 58: goto 5f
      // 5b: invokestatic mf6.a (Loov;)Loov;
      // 5e: athrow
      // 5f: bipush 0
      // 60: putfield mf6.hb8 Z
      // 63: return
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
      // 00: invokestatic t9d.c ()I
      // 03: istore 4
      // 05: aload 0
      // 06: iload 1
      // 07: iload 2
      // 08: fload 3
      // 09: invokespecial zg9.drawScreen (IIF)V
      // 0c: aload 0
      // 0d: iload 4
      // 0f: ifne 27
      // 12: getfield mf6.hb8 Z
      // 15: ifeq 2a
      // 18: goto 1f
      // 1b: invokestatic mf6.a (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 0
      // 20: goto 27
      // 23: invokestatic mf6.a (Loov;)Loov;
      // 26: athrow
      // 27: invokespecial mf6.zlf ()V
      // 2a: return
   }

   private void zlf() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic mf6.a J
      // 003: ldc2_w 101532525933987
      // 006: lxor
      // 007: lstore 1
      // 008: aload 0
      // 009: getfield mf6.tjm I
      // 00c: bipush 124
      // 00e: isub
      // 00f: istore 4
      // 011: aload 0
      // 012: getfield mf6.___ I
      // 015: istore 5
      // 017: invokestatic t9d.c ()I
      // 01a: sipush 166
      // 01d: istore 6
      // 01f: istore 3
      // 020: aload 0
      // 021: getfield mf6.f41 Lc05;
      // 024: getfield c05.vg8 Ll86;
      // 027: invokevirtual l86.g5i ()Ljava/util/Collection;
      // 02a: astore 7
      // 02c: aload 7
      // 02e: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 033: iload 3
      // 034: ifne 054
      // 037: ifne 254
      // 03a: goto 041
      // 03d: invokestatic mf6.a (Loov;)Loov;
      // 040: athrow
      // 041: fconst_1
      // 042: fconst_1
      // 043: fconst_1
      // 044: fconst_1
      // 045: invokestatic hzu.wn0 (FFFF)V
      // 048: invokestatic hzu.fpt ()V
      // 04b: bipush 33
      // 04d: goto 054
      // 050: invokestatic mf6.a (Loov;)Loov;
      // 053: athrow
      // 054: istore 8
      // 056: aload 7
      // 058: iload 3
      // 059: ifne 085
      // 05c: invokeinterface java/util/Collection.size ()I 1
      // 061: bipush 5
      // 062: if_icmple 07b
      // 065: goto 06c
      // 068: invokestatic mf6.a (Loov;)Loov;
      // 06b: athrow
      // 06c: sipush 132
      // 06f: aload 7
      // 071: invokeinterface java/util/Collection.size ()I 1
      // 076: bipush 1
      // 077: isub
      // 078: idiv
      // 079: istore 8
      // 07b: aload 0
      // 07c: getfield mf6.f41 Lc05;
      // 07f: getfield c05.vg8 Ll86;
      // 082: invokevirtual l86.g5i ()Ljava/util/Collection;
      // 085: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 08a: astore 9
      // 08c: aload 9
      // 08e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 093: ifeq 254
      // 096: aload 9
      // 098: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 09d: checkcast sdj
      // 0a0: astore 10
      // 0a2: getstatic mcs.ip9 [Lmcs;
      // 0a5: aload 10
      // 0a7: invokevirtual sdj._na ()I
      // 0aa: aaload
      // 0ab: astore 11
      // 0ad: fconst_1
      // 0ae: fconst_1
      // 0af: fconst_1
      // 0b0: fconst_1
      // 0b1: invokestatic hzu.wn0 (FFFF)V
      // 0b4: aload 0
      // 0b5: getfield mf6.f41 Lc05;
      // 0b8: invokevirtual c05.l22 ()Llc5;
      // 0bb: getstatic mf6.w8u Lgdz;
      // 0be: invokevirtual lc5.anl (Lgdz;)V
      // 0c1: aload 0
      // 0c2: iload 4
      // 0c4: iload 5
      // 0c6: bipush 0
      // 0c7: sipush 166
      // 0ca: sipush 140
      // 0cd: bipush 32
      // 0cf: invokevirtual mf6.mt4 (IIIIII)V
      // 0d2: aload 11
      // 0d4: iload 3
      // 0d5: ifne 116
      // 0d8: invokevirtual mcs.rtl ()Z
      // 0db: ifeq 114
      // 0de: goto 0e5
      // 0e1: invokestatic mf6.a (Loov;)Loov;
      // 0e4: athrow
      // 0e5: aload 11
      // 0e7: invokevirtual mcs.lgw ()I
      // 0ea: istore 12
      // 0ec: aload 0
      // 0ed: iload 4
      // 0ef: bipush 6
      // 0f1: iadd
      // 0f2: iload 5
      // 0f4: bipush 7
      // 0f6: iadd
      // 0f7: bipush 0
      // 0f8: iload 12
      // 0fa: bipush 8
      // 0fc: irem
      // 0fd: bipush 18
      // 0ff: imul
      // 100: iadd
      // 101: sipush 198
      // 104: iload 12
      // 106: bipush 8
      // 108: idiv
      // 109: bipush 18
      // 10b: imul
      // 10c: iadd
      // 10d: bipush 18
      // 10f: bipush 18
      // 111: invokevirtual mf6.mt4 (IIIIII)V
      // 114: aload 11
      // 116: invokevirtual mcs.zs1 ()Ljava/lang/String;
      // 119: bipush 0
      // 11a: anewarray 140
      // 11d: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 120: astore 12
      // 122: aload 10
      // 124: invokevirtual sdj.tus ()I
      // 127: bipush 1
      // 128: iload 3
      // 129: ifne 176
      // 12c: if_icmpne 169
      // 12f: goto 136
      // 132: invokestatic mf6.a (Loov;)Loov;
      // 135: athrow
      // 136: new java/lang/StringBuilder
      // 139: dup
      // 13a: invokespecial java/lang/StringBuilder.<init> ()V
      // 13d: aload 12
      // 13f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 142: ldc " "
      // 144: nop
      // 145: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 148: sipush 30168
      // 14b: ldc2_w 5026937073058188002
      // 14e: lload 1
      // 14f: lxor
      // 150: invokedynamic b (IJ)Ljava/lang/String; bsm=mf6.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 155: nop
      // 156: bipush 0
      // 157: anewarray 140
      // 15a: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 15d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 160: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 163: astore 12
      // 165: iload 3
      // 166: ifeq 201
      // 169: aload 10
      // 16b: invokevirtual sdj.tus ()I
      // 16e: bipush 2
      // 16f: goto 176
      // 172: invokestatic mf6.a (Loov;)Loov;
      // 175: athrow
      // 176: iload 3
      // 177: ifne 1cf
      // 17a: if_icmpne 1b7
      // 17d: goto 184
      // 180: invokestatic mf6.a (Loov;)Loov;
      // 183: athrow
      // 184: new java/lang/StringBuilder
      // 187: dup
      // 188: invokespecial java/lang/StringBuilder.<init> ()V
      // 18b: aload 12
      // 18d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 190: ldc " "
      // 192: nop
      // 193: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 196: sipush 20971
      // 199: ldc2_w 8526145682585431760
      // 19c: lload 1
      // 19d: lxor
      // 19e: invokedynamic b (IJ)Ljava/lang/String; bsm=mf6.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a3: nop
      // 1a4: bipush 0
      // 1a5: anewarray 140
      // 1a8: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 1ab: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ae: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1b1: astore 12
      // 1b3: iload 3
      // 1b4: ifeq 201
      // 1b7: aload 10
      // 1b9: invokevirtual sdj.tus ()I
      // 1bc: iload 3
      // 1bd: ifne 21f
      // 1c0: goto 1c7
      // 1c3: invokestatic mf6.a (Loov;)Loov;
      // 1c6: athrow
      // 1c7: bipush 3
      // 1c8: goto 1cf
      // 1cb: invokestatic mf6.a (Loov;)Loov;
      // 1ce: athrow
      // 1cf: if_icmpne 201
      // 1d2: new java/lang/StringBuilder
      // 1d5: dup
      // 1d6: invokespecial java/lang/StringBuilder.<init> ()V
      // 1d9: aload 12
      // 1db: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1de: ldc " "
      // 1e0: nop
      // 1e1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e4: sipush 21512
      // 1e7: ldc2_w 8184832438415764272
      // 1ea: lload 1
      // 1eb: lxor
      // 1ec: invokedynamic b (IJ)Ljava/lang/String; bsm=mf6.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f1: nop
      // 1f2: bipush 0
      // 1f3: anewarray 140
      // 1f6: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 1f9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1fc: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1ff: astore 12
      // 201: aload 0
      // 202: getfield mf6.f41 Lc05;
      // 205: getfield c05.tx1 Lowt;
      // 208: aload 12
      // 20a: iload 4
      // 20c: bipush 10
      // 20e: iadd
      // 20f: bipush 18
      // 211: iadd
      // 212: i2f
      // 213: iload 5
      // 215: bipush 6
      // 217: iadd
      // 218: i2f
      // 219: ldc 16777215
      // 21b: nop
      // 21c: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 21f: pop
      // 220: aload 10
      // 222: invokestatic mcs.pvn (Lsdj;)Ljava/lang/String;
      // 225: astore 13
      // 227: aload 0
      // 228: getfield mf6.f41 Lc05;
      // 22b: getfield c05.tx1 Lowt;
      // 22e: aload 13
      // 230: iload 4
      // 232: bipush 10
      // 234: iadd
      // 235: bipush 18
      // 237: iadd
      // 238: i2f
      // 239: iload 5
      // 23b: bipush 6
      // 23d: iadd
      // 23e: bipush 10
      // 240: iadd
      // 241: i2f
      // 242: ldc 8355711
      // 244: nop
      // 245: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 248: pop
      // 249: iload 5
      // 24b: iload 8
      // 24d: iadd
      // 24e: istore 5
      // 250: iload 3
      // 251: ifeq 08c
      // 254: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(4284702234714403884L, 7662233835287437760L, MethodHandles.lookup().lookupClass()).a(154455412239997L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 13074968316725L;
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
      String var6 = "à]NW\u0011Æ²ð_GD¶¦ëoBý*\u0018ûl\u0012\u0088õ:\u000e\u0013V\u0081¦\u0010\u008b>ä²i\t\u0011ÔÏ({\u0097\u000e]\u0002Á<è®ç*|\u0089yDræß\u0097üÅ_m0t. ü\u0092\u0090*\u0083\u0083»-\u0085R\u0081tÁ(ÿïÄÜ\u0080®á\u009cî]_)\u0096ìG¿æ:xjK\u0092.MnµL\u009cÔ7\u0080à£Ý\"¥MÝïÁ";
      int var8 = "à]NW\u0011Æ²ð_GD¶¦ëoBý*\u0018ûl\u0012\u0088õ:\u000e\u0013V\u0081¦\u0010\u008b>ä²i\t\u0011ÔÏ({\u0097\u000e]\u0002Á<è®ç*|\u0089yDræß\u0097üÅ_m0t. ü\u0092\u0090*\u0083\u0083»-\u0085R\u0081tÁ(ÿïÄÜ\u0080®á\u009cî]_)\u0096ìG¿æ:xjK\u0092.MnµL\u009cÔ7\u0080à£Ý\"¥MÝïÁ"
         .length();
      char var5 = '(';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = d(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            g = var9;
            h = new String[3];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static oov a(oov var0) {
      return var0;
   }

   private static String d(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 21545;
      if (h[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("mf6", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = g[var5].getBytes("ISO-8859-1");
         h[var5] = d(((Cipher)var4[0]).doFinal(var9));
      }

      return h[var5];
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
         throw new RuntimeException("mf6" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
