import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class qg0 extends ar7 {
   private static final long a;
   private static final String f;

   public qg0() {
      long var1 = a ^ 113493367057404L;
      super(f, _aj.sxc, false, new j1s[0]);
   }

   @jev
   public void jlx(b5k param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 2
      // 004: invokestatic uj3.xju ()Ljava/util/List;
      // 007: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 00c: astore 3
      // 00d: aload 3
      // 00e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 013: ifeq 17e
      // 016: aload 3
      // 017: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 01c: checkcast i2h
      // 01f: astore 4
      // 021: aload 4
      // 023: iload 2
      // 024: ifne 03d
      // 027: instanceof nvf
      // 02a: ifne 03b
      // 02d: goto 034
      // 030: invokestatic qg0.a (Loov;)Loov;
      // 033: athrow
      // 034: goto 00d
      // 037: invokestatic qg0.a (Loov;)Loov;
      // 03a: athrow
      // 03b: aload 4
      // 03d: getfield i2h.ivp D
      // 040: ldc2_w 0.2
      // 043: dsub
      // 044: aload 4
      // 046: getfield i2h.o2v D
      // 049: ldc2_w 0.2
      // 04c: dsub
      // 04d: aload 4
      // 04f: getfield i2h.ivp D
      // 052: ldc2_w 0.2
      // 055: dsub
      // 056: dsub
      // 057: aload 1
      // 058: invokevirtual b5k._x5 ()F
      // 05b: f2d
      // 05c: dmul
      // 05d: dadd
      // 05e: aload 0
      // 05f: pop
      // 060: getstatic qg0.ek1 Lc05;
      // 063: invokevirtual c05.ibs ()Lhr_;
      // 066: invokevirtual hr_.yky ()D
      // 069: dsub
      // 06a: dstore 5
      // 06c: aload 4
      // 06e: getfield i2h.c54 D
      // 071: aload 4
      // 073: getfield i2h.kfp D
      // 076: aload 4
      // 078: getfield i2h.c54 D
      // 07b: dsub
      // 07c: aload 1
      // 07d: invokevirtual b5k._x5 ()F
      // 080: f2d
      // 081: dmul
      // 082: dadd
      // 083: aload 0
      // 084: pop
      // 085: getstatic qg0.ek1 Lc05;
      // 088: invokevirtual c05.ibs ()Lhr_;
      // 08b: invokevirtual hr_.fxk ()D
      // 08e: dsub
      // 08f: dstore 7
      // 091: aload 4
      // 093: getfield i2h.e2b D
      // 096: ldc2_w 0.2
      // 099: dsub
      // 09a: aload 4
      // 09c: getfield i2h.vbd D
      // 09f: ldc2_w 0.2
      // 0a2: dsub
      // 0a3: aload 4
      // 0a5: getfield i2h.e2b D
      // 0a8: ldc2_w 0.2
      // 0ab: dsub
      // 0ac: dsub
      // 0ad: aload 1
      // 0ae: invokevirtual b5k._x5 ()F
      // 0b1: f2d
      // 0b2: dmul
      // 0b3: dadd
      // 0b4: aload 0
      // 0b5: pop
      // 0b6: getstatic qg0.ek1 Lc05;
      // 0b9: invokevirtual c05.ibs ()Lhr_;
      // 0bc: invokevirtual hr_.kux ()D
      // 0bf: dsub
      // 0c0: dstore 9
      // 0c2: invokestatic org/lwjgl/opengl/GL11.glPushMatrix ()V
      // 0c5: dconst_1
      // 0c6: dconst_1
      // 0c7: dconst_1
      // 0c8: dconst_0
      // 0c9: invokestatic org/lwjgl/opengl/GL11.glColor4d (DDDD)V
      // 0cc: new nh4
      // 0cf: dup
      // 0d0: dload 5
      // 0d2: dload 7
      // 0d4: dload 9
      // 0d6: dload 5
      // 0d8: ldc2_w 0.4
      // 0db: dadd
      // 0dc: dload 7
      // 0de: ldc2_w 0.4
      // 0e1: dadd
      // 0e2: dload 9
      // 0e4: ldc2_w 0.4
      // 0e7: dadd
      // 0e8: invokespecial nh4.<init> (DDDDDD)V
      // 0eb: invokestatic iyr.a1e (Lnh4;)V
      // 0ee: invokestatic iyr.itn ()V
      // 0f1: new nh4
      // 0f4: dup
      // 0f5: dload 5
      // 0f7: dload 7
      // 0f9: dload 9
      // 0fb: dload 5
      // 0fd: ldc2_w 0.4
      // 100: dadd
      // 101: dload 7
      // 103: ldc2_w 0.4
      // 106: dadd
      // 107: dload 9
      // 109: ldc2_w 0.4
      // 10c: dadd
      // 10d: invokespecial nh4.<init> (DDDDDD)V
      // 110: invokestatic iyr.a1e (Lnh4;)V
      // 113: invokestatic iyr.e3_ ()V
      // 116: new nh4
      // 119: dup
      // 11a: dload 5
      // 11c: dload 7
      // 11e: dload 9
      // 120: dload 5
      // 122: ldc2_w 0.4
      // 125: dadd
      // 126: dload 7
      // 128: ldc2_w 0.4
      // 12b: dadd
      // 12c: dload 9
      // 12e: ldc2_w 0.4
      // 131: dadd
      // 132: invokespecial nh4.<init> (DDDDDD)V
      // 135: invokestatic iyr.a1e (Lnh4;)V
      // 138: invokestatic iyr.xby ()V
      // 13b: new java/awt/Color
      // 13e: dup
      // 13f: ldc 11404799
      // 141: nop
      // 142: invokespecial java/awt/Color.<init> (I)V
      // 145: invokevirtual java/awt/Color.getRGB ()I
      // 148: invokestatic iyr.zt6 (I)V
      // 14b: new nh4
      // 14e: dup
      // 14f: dload 5
      // 151: dload 7
      // 153: dload 9
      // 155: dload 5
      // 157: ldc2_w 0.4
      // 15a: dadd
      // 15b: dload 7
      // 15d: ldc2_w 0.4
      // 160: dadd
      // 161: dload 9
      // 163: ldc2_w 0.4
      // 166: dadd
      // 167: invokespecial nh4.<init> (DDDDDD)V
      // 16a: invokestatic iyr.a1e (Lnh4;)V
      // 16d: invokestatic iyr._nz ()V
      // 170: dconst_1
      // 171: dconst_1
      // 172: dconst_1
      // 173: dconst_1
      // 174: invokestatic org/lwjgl/opengl/GL11.glColor4d (DDDD)V
      // 177: invokestatic org/lwjgl/opengl/GL11.glPopMatrix ()V
      // 17a: iload 2
      // 17b: ifeq 00d
      // 17e: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(5388368702880890232L, -206980427351995801L, MethodHandles.lookup().lookupClass()).a(67266810769380L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 54139769237066L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\"ÙÙÚë7:g".getBytes("ISO-8859-1"));
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
