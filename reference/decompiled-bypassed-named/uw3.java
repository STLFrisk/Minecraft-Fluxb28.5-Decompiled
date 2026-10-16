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

public class uw3 extends SubEngine {
   private static final long a;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public uw3() {
      long var1 = a ^ 5926301240170L;
      super(a<"d">(32701, 6413974489282978998L ^ var1), a<"d">(16112, 5930687946381551098L ^ var1));
   }

   @Override
   public void onUpdate() {
      super.onUpdate();
      this.i_0 = new Timer();
      this.e2j = true;
      this.av2 = false;
   }

   @Override
   public void onRender() {
      super.onRender();
   }

   @EventHandler
   public void hp8(Event param1) {
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
      // 005: getfield uw3.wyl Lc05;
      // 008: getfield Minecraft.vg8 Ll86;
      // 00b: getfield EntityPlayerSP.lfk Z
      // 00e: iload 2
      // 00f: ifne 0c4
      // 012: ifne 0b1
      // 015: goto 01c
      // 018: invokestatic uw3.a (Loov;)Loov;
      // 01b: athrow
      // 01c: aload 0
      // 01d: getfield uw3.av2 Z
      // 020: iload 2
      // 021: ifne 04b
      // 024: goto 02b
      // 027: invokestatic uw3.a (Loov;)Loov;
      // 02a: athrow
      // 02b: ifeq 128
      // 02e: goto 035
      // 031: invokestatic uw3.a (Loov;)Loov;
      // 034: athrow
      // 035: aload 0
      // 036: iload 2
      // 037: ifne 0a9
      // 03a: goto 041
      // 03d: invokestatic uw3.a (Loov;)Loov;
      // 040: athrow
      // 041: getfield uw3.e2j Z
      // 044: goto 04b
      // 047: invokestatic uw3.a (Loov;)Loov;
      // 04a: athrow
      // 04b: ifne 086
      // 04e: aload 0
      // 04f: getfield uw3.wyl Lc05;
      // 052: getfield Minecraft.vg8 Ll86;
      // 055: astore 3
      // 056: aload 3
      // 057: dup
      // 058: getfield EntityPlayerSP.icv D
      // 05b: ldc2_w 4.6805
      // 05e: dmul
      // 05f: putfield EntityPlayerSP.icv D
      // 062: aload 0
      // 063: getfield uw3.wyl Lc05;
      // 066: getfield Minecraft.vg8 Ll86;
      // 069: astore 4
      // 06b: aload 4
      // 06d: dup
      // 06e: getfield EntityPlayerSP.bw4 D
      // 071: ldc2_w 4.6805
      // 074: dmul
      // 075: putfield EntityPlayerSP.bw4 D
      // 078: aload 0
      // 079: bipush 1
      // 07a: putfield uw3.e2j Z
      // 07d: aload 0
      // 07e: bipush 0
      // 07f: putfield uw3.av2 Z
      // 082: iload 2
      // 083: ifeq 128
      // 086: aload 0
      // 087: getfield uw3.wyl Lc05;
      // 08a: getfield Minecraft.vg8 Ll86;
      // 08d: dconst_0
      // 08e: putfield EntityPlayerSP.icv D
      // 091: aload 0
      // 092: getfield uw3.wyl Lc05;
      // 095: getfield Minecraft.vg8 Ll86;
      // 098: dconst_0
      // 099: putfield EntityPlayerSP.bw4 D
      // 09c: aload 0
      // 09d: bipush 0
      // 09e: putfield uw3.e2j Z
      // 0a1: aload 0
      // 0a2: goto 0a9
      // 0a5: invokestatic uw3.a (Loov;)Loov;
      // 0a8: athrow
      // 0a9: bipush 0
      // 0aa: putfield uw3.av2 Z
      // 0ad: iload 2
      // 0ae: ifeq 128
      // 0b1: aload 0
      // 0b2: getfield uw3.wyl Lc05;
      // 0b5: getfield Minecraft.vg8 Ll86;
      // 0b8: getfield EntityPlayerSP.ooc F
      // 0bb: fconst_0
      // 0bc: fcmpl
      // 0bd: goto 0c4
      // 0c0: invokestatic uw3.a (Loov;)Loov;
      // 0c3: athrow
      // 0c4: iload 2
      // 0c5: ifne 10f
      // 0c8: ifne 0f3
      // 0cb: goto 0d2
      // 0ce: invokestatic uw3.a (Loov;)Loov;
      // 0d1: athrow
      // 0d2: aload 0
      // 0d3: getfield uw3.wyl Lc05;
      // 0d6: getfield Minecraft.vg8 Ll86;
      // 0d9: getfield EntityPlayerSP.z66 F
      // 0dc: fconst_0
      // 0dd: fcmpl
      // 0de: iload 2
      // 0df: ifne 10f
      // 0e2: goto 0e9
      // 0e5: invokestatic uw3.a (Loov;)Loov;
      // 0e8: athrow
      // 0e9: ifeq 128
      // 0ec: goto 0f3
      // 0ef: invokestatic uw3.a (Loov;)Loov;
      // 0f2: athrow
      // 0f3: aload 0
      // 0f4: getfield uw3.wyl Lc05;
      // 0f7: getfield Minecraft.vg8 Ll86;
      // 0fa: iload 2
      // 0fb: ifne 120
      // 0fe: goto 105
      // 101: invokestatic uw3.a (Loov;)Loov;
      // 104: athrow
      // 105: getfield EntityPlayerSP.cbi Z
      // 108: goto 10f
      // 10b: invokestatic uw3.a (Loov;)Loov;
      // 10e: athrow
      // 10f: ifne 128
      // 112: aload 0
      // 113: getfield uw3.wyl Lc05;
      // 116: getfield Minecraft.vg8 Ll86;
      // 119: goto 120
      // 11c: invokestatic uw3.a (Loov;)Loov;
      // 11f: athrow
      // 120: invokevirtual EntityPlayerSP.xv1 ()V
      // 123: aload 0
      // 124: bipush 1
      // 125: putfield uw3.av2 Z
      // 128: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6502543297076441449L, 1628118181012996533L, MethodHandles.lookup().lookupClass()).a(255069672567937L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 17198268957277L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[2];
      int var7 = 0;
      String var6 = "°ØºØ\u009fÈò>j\u0098\u009a\u0087²õEê\u0010\u0014eë\u0091òØt\u0094Ô\u0093\u0015\u0092k(Êñ";
      int var8 = "°ØºØ\u009fÈò>j\u0098\u009a\u0087²õEê\u0010\u0014eë\u0091òØt\u0094Ô\u0093\u0015\u0092k(Êñ".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = b(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            d = var9;
            e = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 28170;
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
            throw new RuntimeException("uw3", var10);
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
         throw new RuntimeException("uw3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
