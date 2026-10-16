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

public class ova extends SubEngine {
   public double rdo;
   public double eoz;
   public int fzz;
   public q6h s9t;
   private static final long a;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public ova() {
      long var1 = a ^ 956589121297L;
      super(a<"t">(6386, 8573985320948242972L ^ var1), a<"t">(10662, 8314653686615092041L ^ var1));
      this.s9t = new q6h();
   }

   @Override
   public void onUpdate() {
      super.onUpdate();
      this.fzz = 0;
      this.s9t.u1k();
      this.wyl.vg8.nr7 = 0.0F;
      this.wyl.gze.qeu = 1.0F;
      this.rdo = 0.0;
   }

   @Override
   public void onRender() {
      super.onRender();
      this.wyl.gze.qeu = 1.0F;
      this.rdo = Speed.reg();
      this.wyl.vg8.nr7 = 0.6F;
   }

   @EventHandler
   public void axa(_qa param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 2
      // 004: aload 0
      // 005: getfield ova.wyl Lc05;
      // 008: getfield Minecraft.vg8 Ll86;
      // 00b: getfield EntityPlayerSP.g9g Lboa;
      // 00e: getfield boa.lrp F
      // 011: fconst_0
      // 012: fcmpl
      // 013: iload 2
      // 014: ifeq 061
      // 017: ifne 046
      // 01a: goto 021
      // 01d: invokestatic ova.a (Loov;)Loov;
      // 020: athrow
      // 021: aload 0
      // 022: getfield ova.wyl Lc05;
      // 025: getfield Minecraft.vg8 Ll86;
      // 028: getfield EntityPlayerSP.g9g Lboa;
      // 02b: getfield boa._mw F
      // 02e: fconst_0
      // 02f: fcmpl
      // 030: iload 2
      // 031: ifeq 061
      // 034: goto 03b
      // 037: invokestatic ova.a (Loov;)Loov;
      // 03a: athrow
      // 03b: ifne 046
      // 03e: goto 045
      // 041: invokestatic ova.a (Loov;)Loov;
      // 044: athrow
      // 045: return
      // 046: aload 0
      // 047: ldc2_w 0.4
      // 04a: ldc2_w 0.001
      // 04d: ldc2_w 0.019
      // 050: invokestatic KillAura.mmr (DD)D
      // 053: dadd
      // 054: putfield ova.eoz D
      // 057: aload 0
      // 058: getfield ova.wyl Lc05;
      // 05b: getfield Minecraft.vg8 Ll86;
      // 05e: getfield EntityPlayerSP.lfk Z
      // 061: iload 2
      // 062: ifeq 11a
      // 065: ifeq 0e9
      // 068: goto 06f
      // 06b: invokestatic ova.a (Loov;)Loov;
      // 06e: athrow
      // 06f: aload 0
      // 070: getfield ova.wyl Lc05;
      // 073: getfield Minecraft.vg8 Ll86;
      // 076: getfield EntityPlayerSP.fcv Z
      // 079: iload 2
      // 07a: ifeq 11a
      // 07d: goto 084
      // 080: invokestatic ova.a (Loov;)Loov;
      // 083: athrow
      // 084: ifeq 0e9
      // 087: goto 08e
      // 08a: invokestatic ova.a (Loov;)Loov;
      // 08d: athrow
      // 08e: aload 0
      // 08f: iload 2
      // 090: ifeq 0d9
      // 093: goto 09a
      // 096: invokestatic ova.a (Loov;)Loov;
      // 099: athrow
      // 09a: getfield ova.s9t Lq6h;
      // 09d: ldc2_w 100.0
      // 0a0: invokevirtual q6h.hqu (D)Z
      // 0a3: ifeq 0c5
      // 0a6: goto 0ad
      // 0a9: invokestatic ova.a (Loov;)Loov;
      // 0ac: athrow
      // 0ad: aload 0
      // 0ae: getfield ova.s9t Lq6h;
      // 0b1: invokevirtual q6h.u1k ()V
      // 0b4: aload 0
      // 0b5: dup
      // 0b6: getfield ova.fzz I
      // 0b9: bipush 1
      // 0ba: iadd
      // 0bb: putfield ova.fzz I
      // 0be: goto 0c5
      // 0c1: invokestatic ova.a (Loov;)Loov;
      // 0c4: athrow
      // 0c5: aload 1
      // 0c6: aload 0
      // 0c7: getfield ova.wyl Lc05;
      // 0ca: getfield Minecraft.vg8 Ll86;
      // 0cd: aload 0
      // 0ce: getfield ova.eoz D
      // 0d1: dup2_x1
      // 0d2: putfield EntityPlayerSP.mop D
      // 0d5: invokevirtual _qa.ziq (D)V
      // 0d8: aload 0
      // 0d9: invokestatic Speed.reg ()D
      // 0dc: ldc2_w 2.05
      // 0df: ldc2_w 2.1
      // 0e2: invokestatic KillAura.mmr (DD)D
      // 0e5: dmul
      // 0e6: putfield ova.rdo D
      // 0e9: aload 0
      // 0ea: dup
      // 0eb: getfield ova.rdo D
      // 0ee: ldc2_w 0.02
      // 0f1: ldc2_w 0.03
      // 0f4: invokestatic KillAura.mmr (DD)D
      // 0f7: dsub
      // 0f8: putfield ova.rdo D
      // 0fb: aload 0
      // 0fc: aload 0
      // 0fd: getfield ova.rdo D
      // 100: invokestatic Speed.reg ()D
      // 103: invokestatic java/lang/Math.max (DD)D
      // 106: putfield ova.rdo D
      // 109: iload 2
      // 10a: ifeq 138
      // 10d: aload 0
      // 10e: getfield ova.fzz I
      // 111: bipush 3
      // 112: irem
      // 113: goto 11a
      // 116: invokestatic ova.a (Loov;)Loov;
      // 119: athrow
      // 11a: bipush 2
      // 11b: if_icmpne 130
      // 11e: aload 0
      // 11f: invokestatic Speed.reg ()D
      // 122: ldc2_w 0.1
      // 125: dmul
      // 126: putfield ova.rdo D
      // 129: goto 130
      // 12c: invokestatic ova.a (Loov;)Loov;
      // 12f: athrow
      // 130: aload 1
      // 131: aload 0
      // 132: getfield ova.rdo D
      // 135: invokestatic Speed.qjs (L_qa;D)V
      // 138: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-4849955009675982461L, -5986985705799437391L, MethodHandles.lookup().lookupClass()).a(66745661675493L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 31496921210440L;
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
      String var6 = "\u001fEu=av\u0011<+\"\u009b¾Oæxð ÖQe½\u009d\u001d¹²\u0016úÃ\u0088\u0088VåGyuÝc!O\u0010Müÿ&\u0018\u000ejÝ½";
      int var8 = "\u001fEu=av\u0011<+\"\u009b¾Oæxð ÖQe½\u009d\u001d¹²\u0016úÃ\u0088\u0088VåGyuÝc!O\u0010Müÿ&\u0018\u000ejÝ½".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31743;
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
            throw new RuntimeException("ova", var10);
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
         throw new RuntimeException("ova" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
