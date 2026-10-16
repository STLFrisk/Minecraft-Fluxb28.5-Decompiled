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

public class uf2 extends j1s {
   private static final long a;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public uf2() {
      long var1 = a ^ 84901887201762L;
      super(a<"f">(2577, 84801081124648622L ^ var1), a<"f">(27749, 7132887389224866011L ^ var1));
   }

   @Override
   public void w4v() {
      this.p4m = q0r.ibc();
      this.cuk = 0;
      this.gtt = 0;
      super.w4v();
   }

   @jev
   public void d7y(fz2 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield uf2.wyl Lc05;
      // 08: getfield c05.vg8 Ll86;
      // 0b: getfield l86.fcv Z
      // 0e: iload 2
      // 0f: ifne 6b
      // 12: ifne 60
      // 15: goto 1c
      // 18: invokestatic uf2.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 0
      // 1d: getfield uf2.wyl Lc05;
      // 20: getfield c05.tij Lkh3;
      // 23: aload 0
      // 24: getfield uf2.wyl Lc05;
      // 27: getfield c05.vg8 Ll86;
      // 2a: aload 0
      // 2b: getfield uf2.wyl Lc05;
      // 2e: getfield c05.vg8 Ll86;
      // 31: getfield l86.l29 Lnh4;
      // 34: dconst_0
      // 35: aload 0
      // 36: getfield uf2.wyl Lc05;
      // 39: getfield c05.vg8 Ll86;
      // 3c: getfield l86.mop D
      // 3f: dconst_0
      // 40: invokevirtual nh4.sy_ (DDD)Lnh4;
      // 43: invokevirtual kh3.bb4 (Li2h;Lnh4;)Ljava/util/List;
      // 46: invokeinterface java/util/List.size ()I 1
      // 4b: iload 2
      // 4c: ifne 6b
      // 4f: goto 56
      // 52: invokestatic uf2.a (Loov;)Loov;
      // 55: athrow
      // 56: ifle bd
      // 59: goto 60
      // 5c: invokestatic uf2.a (Loov;)Loov;
      // 5f: athrow
      // 60: aload 0
      // 61: getfield uf2.cuk I
      // 64: goto 6b
      // 67: invokestatic uf2.a (Loov;)Loov;
      // 6a: athrow
      // 6b: iload 2
      // 6c: ifne ab
      // 6f: ifne a0
      // 72: goto 79
      // 75: invokestatic uf2.a (Loov;)Loov;
      // 78: athrow
      // 79: aload 1
      // 7a: aload 0
      // 7b: getfield uf2.wyl Lc05;
      // 7e: getfield c05.vg8 Ll86;
      // 81: getfield l86.kfp D
      // 84: ldc2_w 1.0E-10
      // 87: dadd
      // 88: invokevirtual fz2.o4n (D)V
      // 8b: aload 0
      // 8c: bipush 1
      // 8d: putfield uf2.cuk I
      // 90: aload 0
      // 91: bipush 0
      // 92: putfield uf2.gtt I
      // 95: iload 2
      // 96: ifeq bd
      // 99: goto a0
      // 9c: invokestatic uf2.a (Loov;)Loov;
      // 9f: athrow
      // a0: aload 0
      // a1: getfield uf2.cuk I
      // a4: goto ab
      // a7: invokestatic uf2.a (Loov;)Loov;
      // aa: athrow
      // ab: bipush 4
      // ac: if_icmpne bd
      // af: getstatic kgt.ce6 Liri;
      // b2: bipush 0
      // b3: invokevirtual iri.yse (Z)V
      // b6: goto bd
      // b9: invokestatic uf2.a (Loov;)Loov;
      // bc: athrow
      // bd: return
   }

   @jev
   public void z4o(q8e var1) {
      double var2 = this.wyl.vg8.o2v - this.wyl.vg8.bc1;
      double var4 = this.wyl.vg8.vbd - this.wyl.vg8.a4d;
      this.o61 = Math.sqrt(var2 * var2 + var4 * var4);
   }

   @jev
   public void u4i(_qa param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 2
      // 004: aload 0
      // 005: getfield uf2.cuk I
      // 008: bipush 1
      // 009: iload 2
      // 00a: ifeq 05e
      // 00d: if_icmpne 052
      // 010: goto 017
      // 013: invokestatic uf2.a (Loov;)Loov;
      // 016: athrow
      // 017: invokestatic q0r.f2f ()Z
      // 01a: iload 2
      // 01b: ifeq 05d
      // 01e: goto 025
      // 021: invokestatic uf2.a (Loov;)Loov;
      // 024: athrow
      // 025: ifeq 052
      // 028: goto 02f
      // 02b: invokestatic uf2.a (Loov;)Loov;
      // 02e: athrow
      // 02f: aload 0
      // 030: bipush 2
      // 031: putfield uf2.cuk I
      // 034: aload 0
      // 035: ldc2_w 1.38
      // 038: invokestatic q0r.ibc ()D
      // 03b: dmul
      // 03c: ldc2_w 0.01
      // 03f: dsub
      // 040: ldc2_w 1.6
      // 043: ddiv
      // 044: putfield uf2.p4m D
      // 047: iload 2
      // 048: ifne 164
      // 04b: goto 052
      // 04e: invokestatic uf2.a (Loov;)Loov;
      // 051: athrow
      // 052: aload 0
      // 053: getfield uf2.cuk I
      // 056: goto 05d
      // 059: invokestatic uf2.a (Loov;)Loov;
      // 05c: athrow
      // 05d: bipush 2
      // 05e: iload 2
      // 05f: ifeq 0c4
      // 062: if_icmpne 0ad
      // 065: goto 06c
      // 068: invokestatic uf2.a (Loov;)Loov;
      // 06b: athrow
      // 06c: aload 0
      // 06d: bipush 3
      // 06e: putfield uf2.cuk I
      // 071: aload 1
      // 072: aload 1
      // 073: dconst_0
      // 074: dup2_x1
      // 075: putfield _qa.faq D
      // 078: putfield _qa.c6l D
      // 07b: aload 1
      // 07c: aload 0
      // 07d: getfield uf2.wyl Lc05;
      // 080: getfield c05.vg8 Ll86;
      // 083: ldc2_w 0.423
      // 086: invokestatic p_c.vmu ()I
      // 089: i2d
      // 08a: ldc2_w 0.09
      // 08d: dmul
      // 08e: dadd
      // 08f: dup2_x1
      // 090: putfield l86.mop D
      // 093: invokevirtual _qa.ziq (D)V
      // 096: aload 0
      // 097: dup
      // 098: getfield uf2.p4m D
      // 09b: ldc2_w 2.149
      // 09e: dmul
      // 09f: putfield uf2.p4m D
      // 0a2: iload 2
      // 0a3: ifne 164
      // 0a6: goto 0ad
      // 0a9: invokestatic uf2.a (Loov;)Loov;
      // 0ac: athrow
      // 0ad: aload 0
      // 0ae: getfield uf2.cuk I
      // 0b1: iload 2
      // 0b2: ifeq 109
      // 0b5: goto 0bc
      // 0b8: invokestatic uf2.a (Loov;)Loov;
      // 0bb: athrow
      // 0bc: bipush 3
      // 0bd: goto 0c4
      // 0c0: invokestatic uf2.a (Loov;)Loov;
      // 0c3: athrow
      // 0c4: if_icmpne 0eb
      // 0c7: aload 0
      // 0c8: bipush 4
      // 0c9: putfield uf2.cuk I
      // 0cc: ldc2_w 0.64
      // 0cf: aload 0
      // 0d0: getfield uf2.o61 D
      // 0d3: invokestatic q0r.ibc ()D
      // 0d6: dsub
      // 0d7: dmul
      // 0d8: dstore 3
      // 0d9: aload 0
      // 0da: aload 0
      // 0db: getfield uf2.o61 D
      // 0de: dload 3
      // 0df: dsub
      // 0e0: ldc2_w 1.92
      // 0e3: dmul
      // 0e4: putfield uf2.p4m D
      // 0e7: iload 2
      // 0e8: ifne 164
      // 0eb: aload 0
      // 0ec: iload 2
      // 0ed: ifeq 154
      // 0f0: goto 0f7
      // 0f3: invokestatic uf2.a (Loov;)Loov;
      // 0f6: athrow
      // 0f7: getfield uf2.wyl Lc05;
      // 0fa: getfield c05.vg8 Ll86;
      // 0fd: getfield l86.mop D
      // 100: dconst_0
      // 101: dcmpg
      // 102: goto 109
      // 105: invokestatic uf2.a (Loov;)Loov;
      // 108: athrow
      // 109: ifge 153
      // 10c: aload 0
      // 10d: iload 2
      // 10e: ifeq 154
      // 111: goto 118
      // 114: invokestatic uf2.a (Loov;)Loov;
      // 117: athrow
      // 118: getfield uf2.wyl Lc05;
      // 11b: getfield c05.vg8 Ll86;
      // 11e: getfield l86.o_8 F
      // 121: f2d
      // 122: ldc2_w 1.2
      // 125: dcmpg
      // 126: ifgt 153
      // 129: goto 130
      // 12c: invokestatic uf2.a (Loov;)Loov;
      // 12f: athrow
      // 130: aload 0
      // 131: getfield uf2.wyl Lc05;
      // 134: getfield c05.vg8 Ll86;
      // 137: aload 0
      // 138: aload 0
      // 139: getfield uf2.gtt I
      // 13c: invokevirtual uf2.gcb (I)D
      // 13f: putfield l86.mop D
      // 142: aload 0
      // 143: dup
      // 144: getfield uf2.gtt I
      // 147: bipush 1
      // 148: iadd
      // 149: putfield uf2.gtt I
      // 14c: goto 153
      // 14f: invokestatic uf2.a (Loov;)Loov;
      // 152: athrow
      // 153: aload 0
      // 154: aload 0
      // 155: getfield uf2.o61 D
      // 158: aload 0
      // 159: getfield uf2.o61 D
      // 15c: ldc2_w 159.0
      // 15f: ddiv
      // 160: dsub
      // 161: putfield uf2.p4m D
      // 164: aload 0
      // 165: aload 0
      // 166: getfield uf2.p4m D
      // 169: invokestatic q0r.ibc ()D
      // 16c: invokestatic java/lang/Math.max (DD)D
      // 16f: putfield uf2.p4m D
      // 172: iload 2
      // 173: ifeq 1a6
      // 176: aload 0
      // 177: getfield uf2.p4m D
      // 17a: ldc2_w 0.7
      // 17d: dcmpl
      // 17e: ifle 19e
      // 181: goto 188
      // 184: invokestatic uf2.a (Loov;)Loov;
      // 187: athrow
      // 188: aload 0
      // 189: ldc2_w 0.7
      // 18c: invokestatic java/lang/Math.random ()D
      // 18f: ldc2_w 50.0
      // 192: ddiv
      // 193: dsub
      // 194: putfield uf2.p4m D
      // 197: goto 19e
      // 19a: invokestatic uf2.a (Loov;)Loov;
      // 19d: athrow
      // 19e: aload 1
      // 19f: aload 0
      // 1a0: getfield uf2.p4m D
      // 1a3: invokestatic ohv.qjs (L_qa;D)V
      // 1a6: return
   }

   public double gcb(int var1) {
      double[] var2 = new double[]{
         -0.012255154820464102,
         -0.029804124002464114,
         -0.04384329955726414,
         -0.05507464016846417,
         -0.0640597127913122,
         -0.07124777099670104,
         -0.07699821764670045,
         -0.08159857503525064,
         -0.08527886100093134,
         -0.08822308981734832,
         -0.09057847290557984,
         -0.09246277940424341,
         -0.09397022462563696,
         -0.09517618082072195,
         -0.09614094579116605,
         -0.09691275777902224,
         -0.0975302073785079,
         -0.098024167065457
      };

      try {
         if (var1 <= var2.length) {
            return var2[var1];
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return this.wyl.vg8.mop;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8805991398246295022L, 4886727925989493112L, MethodHandles.lookup().lookupClass()).a(107838399670167L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 98877114146846L;
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
      String var6 = "e2`ýúÿªÁ\u0011®\u0097ómF£\u0015[¯k§J\u0016&M¯±\u0003%w¨ÔP\u0010êj\u0087hÍ3eî\t\r\u0013ûan^¼";
      int var8 = "e2`ýúÿªÁ\u0011®\u0097ómF£\u0015[¯k§J\u0016&M¯±\u0003%w¨ÔP\u0010êj\u0087hÍ3eî\t\r\u0013ûan^¼".length();
      char var5 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 15458;
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
            throw new RuntimeException("uf2", var10);
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
         throw new RuntimeException("uf2" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
