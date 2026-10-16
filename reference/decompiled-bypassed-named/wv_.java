import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class wv_ extends Module {
   private HashMap zo_;
   private List fuh;
   private static final long a;
   private static final String f;

   public wv_() {
      long var1 = a ^ 36057084797970L;
      super(f, _aj.sxc, false, new SubEngine[0]);
      this.zo_ = new HashMap();
      this.fuh = new ArrayList();
   }

   @EventHandler
   public void xqp(Event var1) {
      this.fuh.clear();
      this.zo_.clear();
   }

   @EventHandler
   public void c2z(TickEvent var1) {
      this.fuh.forEach(this::ff1);
   }

   @EventHandler
   public void wfw(z6x param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 2
      // 004: aload 1
      // 005: invokevirtual z6x.pdf ()Lg_3;
      // 008: astore 3
      // 009: aload 3
      // 00a: aload 0
      // 00b: pop
      // 00c: getstatic wv_.ek1 Lc05;
      // 00f: getfield Minecraft.vg8 Ll86;
      // 012: if_acmpne 01a
      // 015: return
      // 016: invokestatic wv_.a (Loov;)Loov;
      // 019: athrow
      // 01a: aload 0
      // 01b: getfield wv_.zo_ Ljava/util/HashMap;
      // 01e: aload 3
      // 01f: iload 2
      // 020: ifne 04c
      // 023: invokevirtual java/util/HashMap.containsKey (Ljava/lang/Object;)Z
      // 026: ifne 047
      // 029: goto 030
      // 02c: invokestatic wv_.a (Loov;)Loov;
      // 02f: athrow
      // 030: aload 0
      // 031: getfield wv_.zo_ Ljava/util/HashMap;
      // 034: aload 3
      // 035: aload 3
      // 036: invokevirtual Entity.i55 ()F
      // 039: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 03c: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 03f: pop
      // 040: goto 047
      // 043: invokestatic wv_.a (Loov;)Loov;
      // 046: athrow
      // 047: aload 0
      // 048: getfield wv_.zo_ Ljava/util/HashMap;
      // 04b: aload 3
      // 04c: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 04f: checkcast java/lang/Float
      // 052: invokevirtual java/lang/Float.floatValue ()F
      // 055: fstore 4
      // 057: aload 3
      // 058: invokevirtual Entity.i55 ()F
      // 05b: fstore 5
      // 05d: fload 4
      // 05f: fload 5
      // 061: fcmpl
      // 062: iload 2
      // 063: ifne 07e
      // 066: ifeq 174
      // 069: goto 070
      // 06c: invokestatic wv_.a (Loov;)Loov;
      // 06f: athrow
      // 070: fload 4
      // 072: fload 5
      // 074: fsub
      // 075: fconst_0
      // 076: fcmpg
      // 077: goto 07e
      // 07a: invokestatic wv_.a (Loov;)Loov;
      // 07d: athrow
      // 07e: ifge 0ae
      // 081: new java/lang/StringBuilder
      // 084: dup
      // 085: invokespecial java/lang/StringBuilder.<init> ()V
      // 088: getstatic syo.qjc Lsyo;
      // 08b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 08e: ldc ""
      // 090: nop
      // 091: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 094: fload 4
      // 096: fload 5
      // 098: fsub
      // 099: ldc -1.0
      // 09b: nop
      // 09c: fmul
      // 09d: f2d
      // 09e: bipush 1
      // 09f: invokestatic rak.meb (DI)D
      // 0a2: invokevirtual java/lang/StringBuilder.append (D)Ljava/lang/StringBuilder;
      // 0a5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0a8: astore 6
      // 0aa: iload 2
      // 0ab: ifeq 0d3
      // 0ae: new java/lang/StringBuilder
      // 0b1: dup
      // 0b2: invokespecial java/lang/StringBuilder.<init> ()V
      // 0b5: getstatic syo.iyk Lsyo;
      // 0b8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0bb: ldc ""
      // 0bd: nop
      // 0be: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c1: fload 4
      // 0c3: fload 5
      // 0c5: fsub
      // 0c6: f2d
      // 0c7: bipush 1
      // 0c8: invokestatic rak.meb (DI)D
      // 0cb: invokevirtual java/lang/StringBuilder.append (D)Ljava/lang/StringBuilder;
      // 0ce: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0d1: astore 6
      // 0d3: new m2j
      // 0d6: dup
      // 0d7: aload 3
      // 0d8: invokespecial m2j.<init> (Lg_3;)V
      // 0db: astore 7
      // 0dd: aload 7
      // 0df: aload 3
      // 0e0: invokevirtual Entity.aaw ()Lnh4;
      // 0e3: getfield nh4.bx_ D
      // 0e6: aload 3
      // 0e7: invokevirtual Entity.aaw ()Lnh4;
      // 0ea: getfield nh4.i2c D
      // 0ed: aload 3
      // 0ee: invokevirtual Entity.aaw ()Lnh4;
      // 0f1: getfield nh4.bx_ D
      // 0f4: dsub
      // 0f5: ldc2_w 2.0
      // 0f8: ddiv
      // 0f9: dadd
      // 0fa: invokevirtual m2j.k5c (D)Lm2j;
      // 0fd: pop
      // 0fe: aload 7
      // 100: aload 7
      // 102: invokevirtual m2j.yeo ()D
      // 105: ldc2_w 0.5
      // 108: dsub
      // 109: new java/util/Random
      // 10c: dup
      // 10d: invokestatic java/lang/System.currentTimeMillis ()J
      // 110: invokespecial java/util/Random.<init> (J)V
      // 113: bipush 5
      // 114: invokevirtual java/util/Random.nextInt (I)I
      // 117: i2d
      // 118: ldc2_w 0.1
      // 11b: dmul
      // 11c: dadd
      // 11d: invokevirtual m2j.jj5 (D)Lm2j;
      // 120: pop
      // 121: aload 7
      // 123: aload 7
      // 125: invokevirtual m2j.bnl ()D
      // 128: ldc2_w 0.5
      // 12b: dsub
      // 12c: new java/util/Random
      // 12f: dup
      // 130: invokestatic java/lang/System.currentTimeMillis ()J
      // 133: lconst_1
      // 134: ladd
      // 135: invokespecial java/util/Random.<init> (J)V
      // 138: bipush 5
      // 139: invokevirtual java/util/Random.nextInt (I)I
      // 13c: i2d
      // 13d: ldc2_w 0.1
      // 140: dmul
      // 141: dadd
      // 142: invokevirtual m2j.gq1 (D)Lm2j;
      // 145: pop
      // 146: aload 0
      // 147: getfield wv_.fuh Ljava/util/List;
      // 14a: new sae
      // 14d: dup
      // 14e: aload 7
      // 150: aload 6
      // 152: invokespecial sae.<init> (Lm2j;Ljava/lang/String;)V
      // 155: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 15a: pop
      // 15b: aload 0
      // 15c: getfield wv_.zo_ Ljava/util/HashMap;
      // 15f: aload 3
      // 160: invokevirtual java/util/HashMap.remove (Ljava/lang/Object;)Ljava/lang/Object;
      // 163: pop
      // 164: aload 0
      // 165: getfield wv_.zo_ Ljava/util/HashMap;
      // 168: aload 3
      // 169: aload 3
      // 16a: invokevirtual Entity.i55 ()F
      // 16d: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 170: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 173: pop
      // 174: return
   }

   @EventHandler
   public void i1u(b5k param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 2
      // 004: aload 0
      // 005: getfield wv_.fuh Ljava/util/List;
      // 008: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 00d: astore 3
      // 00e: aload 3
      // 00f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 014: ifeq 131
      // 017: aload 3
      // 018: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 01d: checkcast sae
      // 020: astore 4
      // 022: aload 4
      // 024: getfield sae.utd Lm2j;
      // 027: invokevirtual m2j.yeo ()D
      // 02a: aload 0
      // 02b: pop
      // 02c: getstatic wv_.ek1 Lc05;
      // 02f: invokevirtual Minecraft.ibs ()Lhr_;
      // 032: invokevirtual hr_.yky ()D
      // 035: dsub
      // 036: dstore 5
      // 038: aload 4
      // 03a: getfield sae.utd Lm2j;
      // 03d: invokevirtual m2j.o41 ()D
      // 040: aload 0
      // 041: pop
      // 042: getstatic wv_.ek1 Lc05;
      // 045: invokevirtual Minecraft.ibs ()Lhr_;
      // 048: invokevirtual hr_.fxk ()D
      // 04b: dsub
      // 04c: dstore 7
      // 04e: aload 4
      // 050: getfield sae.utd Lm2j;
      // 053: invokevirtual m2j.bnl ()D
      // 056: aload 0
      // 057: pop
      // 058: getstatic wv_.ek1 Lc05;
      // 05b: invokevirtual Minecraft.ibs ()Lhr_;
      // 05e: invokevirtual hr_.kux ()D
      // 061: dsub
      // 062: dstore 9
      // 064: invokestatic hzu.dp2 ()V
      // 067: invokestatic hzu.ktr ()V
      // 06a: fconst_1
      // 06b: ldc -1500000.0
      // 06d: nop
      // 06e: invokestatic hzu.fex (FF)V
      // 071: dload 5
      // 073: d2f
      // 074: dload 7
      // 076: d2f
      // 077: dload 9
      // 079: d2f
      // 07a: invokestatic hzu.a4k (FFF)V
      // 07d: aload 0
      // 07e: pop
      // 07f: getstatic wv_.ek1 Lc05;
      // 082: invokevirtual Minecraft.ibs ()Lhr_;
      // 085: getfield hr_.s7e F
      // 088: fneg
      // 089: iload 2
      // 08a: ifne 0b3
      // 08d: fconst_0
      // 08e: fconst_1
      // 08f: fconst_0
      // 090: invokestatic hzu.a2h (FFFF)V
      // 093: aload 0
      // 094: pop
      // 095: getstatic wv_.ek1 Lc05;
      // 098: getfield Minecraft.oxn Lmoh;
      // 09b: getfield moh.i_y I
      // 09e: bipush 2
      // 09f: if_icmpne 0b6
      // 0a2: goto 0a9
      // 0a5: invokestatic wv_.a (Loov;)Loov;
      // 0a8: athrow
      // 0a9: ldc -1.0
      // 0ab: nop
      // 0ac: goto 0b3
      // 0af: invokestatic wv_.a (Loov;)Loov;
      // 0b2: athrow
      // 0b3: goto 0b7
      // 0b6: fconst_1
      // 0b7: fstore 11
      // 0b9: aload 0
      // 0ba: pop
      // 0bb: getstatic wv_.ek1 Lc05;
      // 0be: invokevirtual Minecraft.ibs ()Lhr_;
      // 0c1: getfield hr_.fw9 F
      // 0c4: fload 11
      // 0c6: fconst_0
      // 0c7: fconst_0
      // 0c8: invokestatic hzu.a2h (FFFF)V
      // 0cb: ldc2_w 0.03
      // 0ce: dstore 12
      // 0d0: dload 12
      // 0d2: dneg
      // 0d3: dload 12
      // 0d5: dneg
      // 0d6: dload 12
      // 0d8: invokestatic hzu.bvy (DDD)V
      // 0db: invokestatic iyr.uyb ()V
      // 0de: invokestatic iyr.let ()V
      // 0e1: bipush 0
      // 0e2: invokestatic org/lwjgl/opengl/GL11.glDepthMask (Z)V
      // 0e5: getstatic ClientState.tfb Lowt;
      // 0e8: aload 4
      // 0ea: getfield sae.lvd Ljava/lang/String;
      // 0ed: aload 0
      // 0ee: pop
      // 0ef: getstatic wv_.ek1 Lc05;
      // 0f2: getfield Minecraft.tx1 Lowt;
      // 0f5: aload 4
      // 0f7: getfield sae.lvd Ljava/lang/String;
      // 0fa: invokevirtual owt.ezt (Ljava/lang/String;)I
      // 0fd: bipush 2
      // 0fe: idiv
      // 0ff: ineg
      // 100: i2f
      // 101: aload 0
      // 102: pop
      // 103: getstatic wv_.ek1 Lc05;
      // 106: getfield Minecraft.tx1 Lowt;
      // 109: getfield owt.rr7 I
      // 10c: bipush 1
      // 10d: isub
      // 10e: ineg
      // 10f: i2f
      // 110: bipush 0
      // 111: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 114: pop
      // 115: fconst_1
      // 116: fconst_1
      // 117: fconst_1
      // 118: fconst_1
      // 119: invokestatic org/lwjgl/opengl/GL11.glColor4f (FFFF)V
      // 11c: bipush 1
      // 11d: invokestatic org/lwjgl/opengl/GL11.glDepthMask (Z)V
      // 120: fconst_1
      // 121: ldc 1500000.0
      // 123: nop
      // 124: invokestatic hzu.fex (FF)V
      // 127: invokestatic hzu.q6d ()V
      // 12a: invokestatic hzu.x3w ()V
      // 12d: iload 2
      // 12e: ifeq 00e
      // 131: return
   }

   private void ff1(sae param1) {
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
      // 05: dup
      // 06: getfield sae.c_q I
      // 09: bipush 1
      // 0a: iadd
      // 0b: putfield sae.c_q I
      // 0e: aload 1
      // 0f: getfield sae.c_q I
      // 12: bipush 10
      // 14: iload 2
      // 15: ifne 53
      // 18: if_icmpgt 42
      // 1b: goto 22
      // 1e: invokestatic wv_.a (Loov;)Loov;
      // 21: athrow
      // 22: aload 1
      // 23: getfield sae.utd Lm2j;
      // 26: aload 1
      // 27: getfield sae.utd Lm2j;
      // 2a: invokevirtual m2j.o41 ()D
      // 2d: aload 1
      // 2e: getfield sae.c_q I
      // 31: i2d
      // 32: ldc2_w 0.005
      // 35: dmul
      // 36: dadd
      // 37: invokevirtual m2j.k5c (D)Lm2j;
      // 3a: pop
      // 3b: goto 42
      // 3e: invokestatic wv_.a (Loov;)Loov;
      // 41: athrow
      // 42: aload 1
      // 43: getfield sae.c_q I
      // 46: iload 2
      // 47: ifne 67
      // 4a: bipush 20
      // 4c: goto 53
      // 4f: invokestatic wv_.a (Loov;)Loov;
      // 52: athrow
      // 53: if_icmple 68
      // 56: aload 0
      // 57: getfield wv_.fuh Ljava/util/List;
      // 5a: aload 1
      // 5b: invokeinterface java/util/List.remove (Ljava/lang/Object;)Z 2
      // 60: goto 67
      // 63: invokestatic wv_.a (Loov;)Loov;
      // 66: athrow
      // 67: pop
      // 68: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(837012022690053038L, -1490336092101661520L, MethodHandles.lookup().lookupClass()).a(14106971300611L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 18882374622571L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("G\u0089\u008cOc}÷îÜ;D\u0090Æ\u0093`\u0019".getBytes("ISO-8859-1"));
      String var6 = b(var4).intern();
      byte var10001 = -1;
      f = var6;
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
