import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class r2c$kgm extends ed7 {
   private final List obh;
   private final Map zhi;
   public final r2c iqq;
   private static final long a;
   private static final String b;

   public r2c$kgm(r2c var1, Minecraft var2) {
      this.iqq = var1;
      int var10000 = OpaquePredicate.b();
      super(var2, var1.dt7, var1.o1e, 32, var1.o1e - 65 + 4, 18);
      int var3 = var10000;
      this.obh = Lists.newArrayList();
      this.zhi = Maps.newHashMap();

      for (jlc var5 : r2c.gm9(var1).no8()) {
         this.zhi.put(var5.emt(), var5);
         this.obh.add(var5.emt());
         if (var3 == 0) {
            break;
         }
      }
   }

   @Override
   public int getSize() {
      return this.obh.size();
   }

   @Override
   public void elementClicked(int param1, boolean param2, int param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic r2c$kgm.a J
      // 03: ldc2_w 86782730358519
      // 06: lxor
      // 07: lstore 5
      // 09: aload 0
      // 0a: getfield r2c$kgm.zhi Ljava/util/Map;
      // 0d: aload 0
      // 0e: getfield r2c$kgm.obh Ljava/util/List;
      // 11: iload 1
      // 12: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 17: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 1c: checkcast jlc
      // 1f: astore 8
      // 21: invokestatic OpaquePredicate.c ()I
      // 24: aload 0
      // 25: getfield r2c$kgm.iqq Lr2c;
      // 28: invokestatic r2c.gm9 (Lr2c;)Lj09;
      // 2b: aload 8
      // 2d: invokevirtual j09.no3 (Ljlc;)V
      // 30: istore 7
      // 32: aload 0
      // 33: getfield r2c$kgm.iqq Lr2c;
      // 36: invokestatic r2c.i2o (Lr2c;)Lmoh;
      // 39: aload 8
      // 3b: invokevirtual jlc.emt ()Ljava/lang/String;
      // 3e: putfield moh.yco Ljava/lang/String;
      // 41: aload 0
      // 42: getfield r2c$kgm.gk_ Lc05;
      // 45: invokevirtual Minecraft.hi1 ()V
      // 48: aload 0
      // 49: getfield r2c$kgm.iqq Lr2c;
      // 4c: getfield r2c.fex Lowt;
      // 4f: aload 0
      // 50: getfield r2c$kgm.iqq Lr2c;
      // 53: invokestatic r2c.gm9 (Lr2c;)Lj09;
      // 56: invokevirtual j09.s86 ()Z
      // 59: iload 7
      // 5b: ifne 89
      // 5e: ifne 88
      // 61: goto 68
      // 64: invokestatic r2c$kgm.a (Loov;)Loov;
      // 67: athrow
      // 68: aload 0
      // 69: getfield r2c$kgm.iqq Lr2c;
      // 6c: invokestatic r2c.i2o (Lr2c;)Lmoh;
      // 6f: getfield moh.sfv Z
      // 72: iload 7
      // 74: ifne 89
      // 77: goto 7e
      // 7a: invokestatic r2c$kgm.a (Loov;)Loov;
      // 7d: athrow
      // 7e: ifeq 8c
      // 81: goto 88
      // 84: invokestatic r2c$kgm.a (Loov;)Loov;
      // 87: athrow
      // 88: bipush 1
      // 89: goto 8d
      // 8c: bipush 0
      // 8d: invokevirtual owt.so4 (Z)V
      // 90: aload 0
      // 91: getfield r2c$kgm.iqq Lr2c;
      // 94: getfield r2c.fex Lowt;
      // 97: aload 0
      // 98: getfield r2c$kgm.iqq Lr2c;
      // 9b: invokestatic r2c.gm9 (Lr2c;)Lj09;
      // 9e: invokevirtual j09.j77 ()Z
      // a1: invokevirtual owt.vyy (Z)V
      // a4: aload 0
      // a5: getfield r2c$kgm.iqq Lr2c;
      // a8: invokestatic r2c.at6 (Lr2c;)Lcm_;
      // ab: getstatic r2c$kgm.b Ljava/lang/String;
      // ae: nop
      // af: bipush 0
      // b0: anewarray 162
      // b3: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // b6: putfield cm_.frg Ljava/lang/String;
      // b9: aload 0
      // ba: getfield r2c$kgm.iqq Lr2c;
      // bd: invokestatic r2c.rvj (Lr2c;)Lcm_;
      // c0: aload 0
      // c1: getfield r2c$kgm.iqq Lr2c;
      // c4: invokestatic r2c.i2o (Lr2c;)Lmoh;
      // c7: getstatic moh$_ru.ety Lmoh$_ru;
      // ca: invokevirtual moh.ycx (Lmoh$_ru;)Ljava/lang/String;
      // cd: putfield cm_.frg Ljava/lang/String;
      // d0: aload 0
      // d1: getfield r2c$kgm.iqq Lr2c;
      // d4: invokestatic r2c.i2o (Lr2c;)Lmoh;
      // d7: invokevirtual moh.cmo ()V
      // da: return
   }

   @Override
   public boolean isSelected(int var1) {
      return ((String)this.obh.get(var1)).equals(r2c.gm9(this.iqq).o0m().emt());
   }

   @Override
   public int getContentHeight() {
      return this.getSize() * 18;
   }

   @Override
   public void drawBackground() {
      this.iqq.xmz();
   }

   @Override
   public void drawSlot(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.iqq.fex.vyy(true);
      this.iqq.poi(this.iqq.fex, ((jlc)this.zhi.get(this.obh.get(var1))).toString(), this.wde / 2, var3 + 1, 16777215);
      this.iqq.fex.vyy(r2c.gm9(this.iqq).o0m().qga());
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2937430849114970264L, 8900642960744713354L, MethodHandles.lookup().lookupClass()).a(158239608154159L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 90385812367131L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u000f¡JÝ,2dQ\u000b\u008bXÚ\u001b\u009eu\u009c".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
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
}
