import com.google.common.base.Predicate;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class hey extends y0y {
   public static final zb_ v1p;
   public static final h76 qos;

   public hey() {
      super(true);
      this.y8l(this._8_.c32().zvi(qos, false).zvi(v1p, y0y$_zr.ipg));
      this._p_(true);
   }

   @Override
   public int odp(t9d var1) {
      return 20;
   }

   @Override
   public boolean scl() {
      return true;
   }

   @Override
   public void n9e(t9d param1, mew param2, zfz param3, i2h param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 5
      // 05: aload 1
      // 06: getfield t9d.v0f Z
      // 09: iload 5
      // 0b: ifne 2e
      // 0e: ifne 3f
      // 11: goto 18
      // 14: invokestatic hey.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 3
      // 19: getstatic hey.qos Lh76;
      // 1c: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 21: checkcast java/lang/Boolean
      // 24: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 27: goto 2e
      // 2a: invokestatic hey.a (Loov;)Loov;
      // 2d: athrow
      // 2e: ifne 3f
      // 31: aload 0
      // 32: aload 1
      // 33: aload 2
      // 34: aload 3
      // 35: invokespecial hey.yqv (Lt9d;Lmew;Lzfz;)V
      // 38: goto 3f
      // 3b: invokestatic hey.a (Loov;)Loov;
      // 3e: athrow
      // 3f: return
   }

   @Override
   public void ff3(t9d var1, mew var2, zfz var3, Random var4) {
   }

   @Override
   public void zvy(t9d param1, mew param2, zfz param3, Random param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 5
      // 05: aload 1
      // 06: getfield t9d.v0f Z
      // 09: iload 5
      // 0b: ifne 2e
      // 0e: ifne 3f
      // 11: goto 18
      // 14: invokestatic hey.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 3
      // 19: getstatic hey.qos Lh76;
      // 1c: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 21: checkcast java/lang/Boolean
      // 24: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 27: goto 2e
      // 2a: invokestatic hey.a (Loov;)Loov;
      // 2d: athrow
      // 2e: ifeq 3f
      // 31: aload 0
      // 32: aload 1
      // 33: aload 2
      // 34: aload 3
      // 35: invokespecial hey.yqv (Lt9d;Lmew;Lzfz;)V
      // 38: goto 3f
      // 3b: invokestatic hey.a (Loov;)Loov;
      // 3e: athrow
      // 3f: return
   }

   @Override
   public int gpi(m5n var1, mew var2, zfz var3, vt2 var4) {
      int var5 = t9d.b();

      try {
         byte var10000 = (Boolean)var3.dil(qos);
         if (var5 == 0) {
            return var10000;
         }

         if (var10000 != 0) {
            return 15;
         }
      } catch (oov var6) {
         throw a(var6);
      }

      return 0;
   }

   @Override
   public int sqt(m5n var1, mew var2, zfz var3, vt2 var4) {
      int var5 = t9d.b();

      try {
         byte var10000 = (Boolean)var3.dil(qos);
         if (var5 == 0) {
            return var10000;
         }

         if (var10000 == 0) {
            return 0;
         }
      } catch (oov var7) {
         throw a(var7);
      }

      try {
         if (var4 == vt2.rf3) {
            return 15;
         }
      } catch (oov var6) {
         throw a(var6);
      }

      return 0;
   }

   private void yqv(t9d param1, mew param2, zfz param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 3
      // 001: getstatic hey.qos Lh76;
      // 004: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 009: checkcast java/lang/Boolean
      // 00c: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 00f: istore 5
      // 011: invokestatic t9d.b ()I
      // 014: bipush 0
      // 015: istore 6
      // 017: aload 0
      // 018: aload 1
      // 019: aload 2
      // 01a: ldc _f3
      // 01c: nop
      // 01d: bipush 0
      // 01e: anewarray 101
      // 021: invokevirtual hey.jet (Lt9d;Lmew;Ljava/lang/Class;[Lcom/google/common/base/Predicate;)Ljava/util/List;
      // 024: astore 7
      // 026: istore 4
      // 028: aload 7
      // 02a: invokeinterface java/util/List.isEmpty ()Z 1
      // 02f: iload 4
      // 031: ifeq 043
      // 034: ifne 041
      // 037: goto 03e
      // 03a: invokestatic hey.a (Loov;)Loov;
      // 03d: athrow
      // 03e: bipush 1
      // 03f: istore 6
      // 041: iload 6
      // 043: iload 4
      // 045: ifeq 09c
      // 048: ifeq 09a
      // 04b: goto 052
      // 04e: invokestatic hey.a (Loov;)Loov;
      // 051: athrow
      // 052: iload 5
      // 054: iload 4
      // 056: ifeq 09c
      // 059: goto 060
      // 05c: invokestatic hey.a (Loov;)Loov;
      // 05f: athrow
      // 060: ifne 09a
      // 063: goto 06a
      // 066: invokestatic hey.a (Loov;)Loov;
      // 069: athrow
      // 06a: aload 1
      // 06b: aload 2
      // 06c: aload 3
      // 06d: getstatic hey.qos Lh76;
      // 070: bipush 1
      // 071: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 074: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 079: bipush 3
      // 07a: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 07d: pop
      // 07e: aload 1
      // 07f: aload 2
      // 080: aload 0
      // 081: invokevirtual t9d._0o (Lmew;Le0x;)V
      // 084: aload 1
      // 085: aload 2
      // 086: invokevirtual mew.eve ()Lmew;
      // 089: aload 0
      // 08a: invokevirtual t9d._0o (Lmew;Le0x;)V
      // 08d: aload 1
      // 08e: aload 2
      // 08f: aload 2
      // 090: invokevirtual t9d.bi9 (Lmew;Lmew;)V
      // 093: goto 09a
      // 096: invokestatic hey.a (Loov;)Loov;
      // 099: athrow
      // 09a: iload 6
      // 09c: iload 4
      // 09e: ifeq 0f5
      // 0a1: ifne 0f3
      // 0a4: goto 0ab
      // 0a7: invokestatic hey.a (Loov;)Loov;
      // 0aa: athrow
      // 0ab: iload 5
      // 0ad: iload 4
      // 0af: ifeq 0f5
      // 0b2: goto 0b9
      // 0b5: invokestatic hey.a (Loov;)Loov;
      // 0b8: athrow
      // 0b9: ifeq 0f3
      // 0bc: goto 0c3
      // 0bf: invokestatic hey.a (Loov;)Loov;
      // 0c2: athrow
      // 0c3: aload 1
      // 0c4: aload 2
      // 0c5: aload 3
      // 0c6: getstatic hey.qos Lh76;
      // 0c9: bipush 0
      // 0ca: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0cd: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 0d2: bipush 3
      // 0d3: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 0d6: pop
      // 0d7: aload 1
      // 0d8: aload 2
      // 0d9: aload 0
      // 0da: invokevirtual t9d._0o (Lmew;Le0x;)V
      // 0dd: aload 1
      // 0de: aload 2
      // 0df: invokevirtual mew.eve ()Lmew;
      // 0e2: aload 0
      // 0e3: invokevirtual t9d._0o (Lmew;Le0x;)V
      // 0e6: aload 1
      // 0e7: aload 2
      // 0e8: aload 2
      // 0e9: invokevirtual t9d.bi9 (Lmew;Lmew;)V
      // 0ec: goto 0f3
      // 0ef: invokestatic hey.a (Loov;)Loov;
      // 0f2: athrow
      // 0f3: iload 6
      // 0f5: ifeq 10a
      // 0f8: aload 1
      // 0f9: aload 2
      // 0fa: aload 0
      // 0fb: aload 0
      // 0fc: aload 1
      // 0fd: invokevirtual hey.odp (Lt9d;)I
      // 100: invokevirtual t9d.cjk (Lmew;Le0x;I)V
      // 103: goto 10a
      // 106: invokestatic hey.a (Loov;)Loov;
      // 109: athrow
      // 10a: aload 1
      // 10b: aload 2
      // 10c: aload 0
      // 10d: invokevirtual t9d.lw8 (Lmew;Le0x;)V
      // 110: return
   }

   @Override
   public void tfc(t9d var1, mew var2, zfz var3) {
      super.tfc(var1, var2, var3);
      this.yqv(var1, var2, var3);
   }

   @Override
   public xny fvr() {
      return v1p;
   }

   @Override
   public boolean ge5() {
      return true;
   }

   @Override
   public int mya(t9d param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: aload 1
      // 05: aload 2
      // 06: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 09: getstatic hey.qos Lh76;
      // 0c: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 11: checkcast java/lang/Boolean
      // 14: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 17: iload 3
      // 18: ifeq 9d
      // 1b: ifeq 9c
      // 1e: goto 25
      // 21: invokestatic hey.a (Loov;)Loov;
      // 24: athrow
      // 25: aload 0
      // 26: aload 1
      // 27: aload 2
      // 28: ldc q2b
      // 2a: nop
      // 2b: bipush 0
      // 2c: anewarray 101
      // 2f: invokevirtual hey.jet (Lt9d;Lmew;Ljava/lang/Class;[Lcom/google/common/base/Predicate;)Ljava/util/List;
      // 32: astore 4
      // 34: aload 4
      // 36: iload 3
      // 37: ifeq 72
      // 3a: invokeinterface java/util/List.isEmpty ()Z 1
      // 3f: ifne 5f
      // 42: goto 49
      // 45: invokestatic hey.a (Loov;)Loov;
      // 48: athrow
      // 49: aload 4
      // 4b: bipush 0
      // 4c: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 51: checkcast q2b
      // 54: invokevirtual q2b.rxe ()Lk6s;
      // 57: invokevirtual k6s.v8x ()I
      // 5a: ireturn
      // 5b: invokestatic hey.a (Loov;)Loov;
      // 5e: athrow
      // 5f: aload 0
      // 60: aload 1
      // 61: aload 2
      // 62: ldc _f3
      // 64: nop
      // 65: bipush 1
      // 66: anewarray 101
      // 69: dup
      // 6a: bipush 0
      // 6b: getstatic k0_.vs7 Lcom/google/common/base/Predicate;
      // 6e: aastore
      // 6f: invokevirtual hey.jet (Lt9d;Lmew;Ljava/lang/Class;[Lcom/google/common/base/Predicate;)Ljava/util/List;
      // 72: astore 5
      // 74: aload 5
      // 76: invokeinterface java/util/List.isEmpty ()Z 1
      // 7b: iload 3
      // 7c: ifeq 9d
      // 7f: ifne 9c
      // 82: goto 89
      // 85: invokestatic hey.a (Loov;)Loov;
      // 88: athrow
      // 89: aload 5
      // 8b: bipush 0
      // 8c: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 91: checkcast rsi
      // 94: invokestatic _jc.ngl (Lrsi;)I
      // 97: ireturn
      // 98: invokestatic hey.a (Loov;)Loov;
      // 9b: athrow
      // 9c: bipush 0
      // 9d: ireturn
   }

   public List jet(t9d var1, mew var2, Class var3, Predicate[] var4) {
      nh4 var5 = this.ra8(var2);

      try {
         if (var4.length != 1) {
            return var1.m_z(var3, var5);
         }
      } catch (oov var6) {
         throw a(var6);
      }

      return var1.vie(var3, var5, var4[0]);
   }

   private nh4 ra8(mew var1) {
      float var2 = 0.2F;
      return new nh4(
         (double)((float)var1.getX() + 0.2F),
         (double)var1.getY(),
         (double)((float)var1.getZ() + 0.2F),
         (double)((float)(var1.getX() + 1) - 0.2F),
         (double)((float)(var1.getY() + 1) - 0.2F),
         (double)((float)(var1.getZ() + 1) - 0.2F)
      );
   }

   @Override
   public zfz kig(int var1) {
      int var2 = t9d.b();

      zfz var10000;
      h76 var10001;
      try {
         var10000 = this.l4i().zvi(v1p, y0y$_zr.ai5(var1 & 7));
         var10001 = qos;
         int var10002 = var1 & 8;
         if (var2 == 0) {
            return var10000.zvi(qos, Boolean.valueOf((boolean)var10002));
         }

         if (var10002 > 0) {
            return var10000.zvi(qos, true);
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return var10000.zvi(var10001, false);
   }

   @Override
   public int hvp(zfz var1) {
      int var3 = 0;
      int var10000 = t9d.c();
      var3 |= ((y0y$_zr)var1.dil(v1p)).g_6();
      int var2 = var10000;

      try {
         byte var6 = (Boolean)var1.dil(qos);
         if (var2 != 0) {
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
      return new g92(this, new xny[]{v1p, qos});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(6382849346159052746L, -2939272901310079486L, MethodHandles.lookup().lookupClass()).a(191853163120256L);
      // $VF: monitorexit
      long var10 = var10000 ^ 4652793914896L;
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
      String var5 = "ÜO\u0092O#\"Òü\b?À¬{F\u0081Ý<";
      int var7 = "ÜO\u0092O#\"Òü\b?À¬{F\u0081Ý<".length();
      char var4 = '\b';
      int var3 = -1;

      while (true) {
         byte[] var9 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var15 = b(var9).intern();
         byte var10001 = -1;
         var8[var6++] = var15;
         if ((var3 += var4) >= var7) {
            v1p = zb_._m6(var8[0], y0y$_zr.class, new hey$1());
            qos = h76.d_1(var8[1]);
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
