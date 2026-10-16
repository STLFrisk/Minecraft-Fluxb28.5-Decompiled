import java.lang.invoke.MethodHandles;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class wgm extends w56 {
   private static final gdz noc;
   private static final gdz xm2;
   private final z14 raw;
   private final tpd tha;
   private final List icc;
   private final List l46;

   public wgm(hr_ param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: new eur
      // 05: dup
      // 06: invokespecial eur.<init> ()V
      // 09: ldc 0.5
      // 0b: nop
      // 0c: fconst_1
      // 0d: invokespecial w56.<init> (Lhr_;Lz14;FF)V
      // 10: aload 0
      // 11: getfield wgm.vcp Ljava/util/List;
      // 14: bipush 0
      // 15: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 1a: checkcast gnj
      // 1d: astore 3
      // 1e: aload 0
      // 1f: aload 0
      // 20: getfield wgm.alu Lz14;
      // 23: putfield wgm.raw Lz14;
      // 26: aload 0
      // 27: new tpd
      // 2a: dup
      // 2b: invokespecial tpd.<init> ()V
      // 2e: putfield wgm.tha Ltpd;
      // 31: aload 0
      // 32: new rr8
      // 35: dup
      // 36: aload 0
      // 37: invokespecial rr8.<init> (Lgmu;)V
      // 3a: invokevirtual wgm.d4f (Lgnj;)Z
      // 3d: pop
      // 3e: new wgm$1
      // 41: dup
      // 42: aload 0
      // 43: aload 0
      // 44: invokespecial wgm$1.<init> (Lwgm;Lgmu;)V
      // 47: astore 4
      // 49: invokestatic t9d.c ()I
      // 4c: aload 0
      // 4d: aload 4
      // 4f: invokevirtual wgm.d4f (Lgnj;)Z
      // 52: pop
      // 53: istore 2
      // 54: aload 0
      // 55: aload 0
      // 56: getfield wgm.vcp Ljava/util/List;
      // 59: invokestatic com/google/common/collect/Lists.newArrayList (Ljava/lang/Iterable;)Ljava/util/ArrayList;
      // 5c: putfield wgm.l46 Ljava/util/List;
      // 5f: aload 3
      // 60: instanceof mlv
      // 63: iload 2
      // 64: ifne a4
      // 67: ifeq 91
      // 6a: goto 71
      // 6d: invokestatic wgm.a (Loov;)Loov;
      // 70: athrow
      // 71: aload 0
      // 72: aload 3
      // 73: invokevirtual wgm.t72 (Lgnj;)Z
      // 76: pop
      // 77: aload 0
      // 78: new mlv
      // 7b: dup
      // 7c: aload 0
      // 7d: getfield wgm.tha Ltpd;
      // 80: getfield tpd.wtl Ltf8;
      // 83: invokespecial mlv.<init> (Ltf8;)V
      // 86: invokevirtual wgm.d4f (Lgnj;)Z
      // 89: pop
      // 8a: goto 91
      // 8d: invokestatic wgm.a (Loov;)Loov;
      // 90: athrow
      // 91: aload 0
      // 92: aload 4
      // 94: invokevirtual wgm.t72 (Lgnj;)Z
      // 97: pop
      // 98: aload 0
      // 99: new itf
      // 9c: dup
      // 9d: aload 0
      // 9e: invokespecial itf.<init> (Lgmu;)V
      // a1: invokevirtual wgm.d4f (Lgnj;)Z
      // a4: pop
      // a5: aload 0
      // a6: aload 0
      // a7: getfield wgm.vcp Ljava/util/List;
      // aa: invokestatic com/google/common/collect/Lists.newArrayList (Ljava/lang/Iterable;)Ljava/util/ArrayList;
      // ad: putfield wgm.icc Ljava/util/List;
      // b0: return
   }

   public void xnw(we7 var1, double var2, double var4, double var6, float var8, float var9) {
      this.rdh(var1);
      super.w_x(var1, var2, var4, var6, var8, var9);
   }

   public gdz hdz(we7 var1) {
      try {
         if (var1.okv()) {
            return xm2;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return noc;
   }

   private void rdh(we7 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: invokevirtual we7.okv ()Z
      // 08: ifeq 26
      // 0b: aload 0
      // 0c: aload 0
      // 0d: getfield wgm.tha Ltpd;
      // 10: putfield wgm.m5v Lg6r;
      // 13: aload 0
      // 14: aload 0
      // 15: getfield wgm.icc Ljava/util/List;
      // 18: putfield wgm.vcp Ljava/util/List;
      // 1b: iload 2
      // 1c: ifeq 3d
      // 1f: goto 26
      // 22: invokestatic wgm.a (Loov;)Loov;
      // 25: athrow
      // 26: aload 0
      // 27: aload 0
      // 28: getfield wgm.raw Lz14;
      // 2b: putfield wgm.m5v Lg6r;
      // 2e: aload 0
      // 2f: aload 0
      // 30: getfield wgm.l46 Ljava/util/List;
      // 33: putfield wgm.vcp Ljava/util/List;
      // 36: goto 3d
      // 39: invokestatic wgm.a (Loov;)Loov;
      // 3c: athrow
      // 3d: aload 0
      // 3e: aload 0
      // 3f: getfield wgm.m5v Lg6r;
      // 42: checkcast z14
      // 45: putfield wgm.alu Lz14;
      // 48: return
   }

   public void c23(we7 var1, float var2, float var3, float var4) {
      if (var1.th2()) {
         var3 += (float)(Math.cos((double)var1.g25 * 3.25) * Math.PI * 0.25);
      }

      super.ur9(var1, var2, var3, var4);
   }

   @Override
   public gdz zkj(yqv var1) {
      return this.hdz((we7)var1);
   }

   @Override
   public void w_x(yqv var1, double var2, double var4, double var6, float var8, float var9) {
      this.xnw((we7)var1, var2, var4, var6, var8, var9);
   }

   @Override
   public void ur9(g_3 var1, float var2, float var3, float var4) {
      this.c23((we7)var1, var2, var3, var4);
   }

   @Override
   public void l1o(g_3 var1, double var2, double var4, double var6, float var8, float var9) {
      this.xnw((we7)var1, var2, var4, var6, var8, var9);
   }

   @Override
   public gdz dzd(i2h var1) {
      return this.hdz((we7)var1);
   }

   @Override
   public void apl(i2h var1, double var2, double var4, double var6, float var8, float var9) {
      this.xnw((we7)var1, var2, var4, var6, var8, var9);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1634709415793916666L, 4365297211683432836L, MethodHandles.lookup().lookupClass()).a(61732168756024L);
      // $VF: monitorexit
      long var10 = var10000 ^ 3945399084129L;
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
      String var5 = "\u009a\u00adGÑ¢5Ez`\u0016R\u0080¸\u0080¥RZ\u008cý^U0\u00868ùg\u00972Â\u0015Å}±c(\u001a¸\u00026VÆåCd\"\u001b·ì(\u009a\u00adGÑ¢5Ez`\u0016R\u0080¸\u0080¥RZ\u008cý^U0\u00868g\u0087D%§$:\"fíRÙQ«ùE";
      int var7 = "\u009a\u00adGÑ¢5Ez`\u0016R\u0080¸\u0080¥RZ\u008cý^U0\u00868ùg\u00972Â\u0015Å}±c(\u001a¸\u00026VÆåCd\"\u001b·ì(\u009a\u00adGÑ¢5Ez`\u0016R\u0080¸\u0080¥RZ\u008cý^U0\u00868g\u0087D%§$:\"fíRÙQ«ùE"
         .length();
      char var4 = '0';
      int var3 = -1;

      while (true) {
         byte[] var9 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var15 = d(var9).intern();
         byte var10001 = -1;
         var8[var6++] = var15;
         if ((var3 += var4) >= var7) {
            noc = new gdz(var8[1]);
            xm2 = new gdz(var8[0]);
            return;
         }

         var4 = var5.charAt(var3);
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
}
