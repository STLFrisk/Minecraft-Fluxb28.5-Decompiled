import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandles;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class wem implements g6k {
   private static final List k37;
   private static final int se6;
   private static final int dbf;
   private final OpaquePredicate jkz;
   private static final long a;
   private static final String b;

   public wem(OpaquePredicate var1) {
      this.jkz = var1;
   }

   @Override
   public tts et2(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: new lno
      // 03: dup
      // 04: invokespecial lno.<init> ()V
      // 07: astore 4
      // 09: invokestatic OpaquePredicate.b ()I
      // 0c: bipush 0
      // 0d: istore 5
      // 0f: istore 3
      // 10: iload 5
      // 12: bipush 16
      // 14: if_icmpge 8a
      // 17: bipush 0
      // 18: istore 6
      // 1a: iload 6
      // 1c: bipush 16
      // 1e: if_icmpge 83
      // 21: iload 1
      // 22: bipush 16
      // 24: imul
      // 25: iload 5
      // 27: iadd
      // 28: istore 7
      // 2a: iload 2
      // 2b: bipush 16
      // 2d: imul
      // 2e: iload 6
      // 30: iadd
      // 31: istore 8
      // 33: aload 4
      // 35: iload 5
      // 37: bipush 60
      // 39: iload 6
      // 3b: getstatic ox_.c28 Le0x;
      // 3e: invokevirtual e0x.l4i ()Lzfz;
      // 41: invokevirtual lno.x6f (IIILzfz;)V
      // 44: iload 7
      // 46: iload 8
      // 48: invokestatic wem.h7o (II)Lzfz;
      // 4b: astore 9
      // 4d: iload 3
      // 4e: ifeq 86
      // 51: iload 3
      // 52: ifeq 7f
      // 55: goto 5c
      // 58: invokestatic wem.a (Loov;)Loov;
      // 5b: athrow
      // 5c: aload 9
      // 5e: ifnull 7c
      // 61: goto 68
      // 64: invokestatic wem.a (Loov;)Loov;
      // 67: athrow
      // 68: aload 4
      // 6a: iload 5
      // 6c: bipush 70
      // 6e: iload 6
      // 70: aload 9
      // 72: invokevirtual lno.x6f (IIILzfz;)V
      // 75: goto 7c
      // 78: invokestatic wem.a (Loov;)Loov;
      // 7b: athrow
      // 7c: iinc 6 1
      // 7f: iload 3
      // 80: ifne 1a
      // 83: iinc 5 1
      // 86: iload 3
      // 87: ifne 10
      // 8a: new tts
      // 8d: dup
      // 8e: aload 0
      // 8f: getfield wem.jkz Lt9d;
      // 92: aload 4
      // 94: iload 1
      // 95: iload 2
      // 96: invokespecial tts.<init> (Lt9d;Llno;II)V
      // 99: astore 5
      // 9b: aload 5
      // 9d: invokevirtual tts.vm4 ()V
      // a0: aload 0
      // a1: getfield wem.jkz Lt9d;
      // a4: invokevirtual OpaquePredicate.ql0 ()Lcdp;
      // a7: aconst_null
      // a8: checkcast [Lgyu;
      // ab: iload 1
      // ac: bipush 16
      // ae: imul
      // af: iload 2
      // b0: bipush 16
      // b2: imul
      // b3: bipush 16
      // b5: bipush 16
      // b7: invokevirtual cdp.twf ([Lgyu;IIII)[Lgyu;
      // ba: astore 6
      // bc: aload 5
      // be: invokevirtual tts.xtk ()[B
      // c1: astore 7
      // c3: bipush 0
      // c4: istore 8
      // c6: iload 8
      // c8: aload 7
      // ca: arraylength
      // cb: if_icmpge ee
      // ce: aload 7
      // d0: iload 8
      // d2: aload 6
      // d4: iload 8
      // d6: aaload
      // d7: getfield gyu.mu9 I
      // da: i2b
      // db: bastore
      // dc: iinc 8 1
      // df: iload 3
      // e0: ifeq f3
      // e3: iload 3
      // e4: ifne c6
      // e7: goto ee
      // ea: invokestatic wem.a (Loov;)Loov;
      // ed: athrow
      // ee: aload 5
      // f0: invokevirtual tts.vm4 ()V
      // f3: aload 5
      // f5: areturn
   }

   public static zfz h7o(int param0, int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aconst_null
      // 05: astore 3
      // 06: iload 0
      // 07: iload 2
      // 08: ifeq 16
      // 0b: ifle b5
      // 0e: goto 15
      // 11: invokestatic wem.a (Loov;)Loov;
      // 14: athrow
      // 15: iload 1
      // 16: iload 2
      // 17: ifeq 2e
      // 1a: ifle b5
      // 1d: goto 24
      // 20: invokestatic wem.a (Loov;)Loov;
      // 23: athrow
      // 24: iload 0
      // 25: bipush 2
      // 26: irem
      // 27: goto 2e
      // 2a: invokestatic wem.a (Loov;)Loov;
      // 2d: athrow
      // 2e: iload 2
      // 2f: ifeq 46
      // 32: ifeq b5
      // 35: goto 3c
      // 38: invokestatic wem.a (Loov;)Loov;
      // 3b: athrow
      // 3c: iload 1
      // 3d: bipush 2
      // 3e: irem
      // 3f: goto 46
      // 42: invokestatic wem.a (Loov;)Loov;
      // 45: athrow
      // 46: iload 2
      // 47: ifeq 5d
      // 4a: ifeq b5
      // 4d: goto 54
      // 50: invokestatic wem.a (Loov;)Loov;
      // 53: athrow
      // 54: iload 0
      // 55: bipush 2
      // 56: idiv
      // 57: istore 0
      // 58: iload 1
      // 59: bipush 2
      // 5a: idiv
      // 5b: istore 1
      // 5c: iload 0
      // 5d: getstatic wem.se6 I
      // 60: iload 2
      // 61: ifeq 79
      // 64: if_icmpgt b5
      // 67: goto 6e
      // 6a: invokestatic wem.a (Loov;)Loov;
      // 6d: athrow
      // 6e: iload 1
      // 6f: getstatic wem.dbf I
      // 72: goto 79
      // 75: invokestatic wem.a (Loov;)Loov;
      // 78: athrow
      // 79: iload 2
      // 7a: ifeq 94
      // 7d: if_icmpgt b5
      // 80: goto 87
      // 83: invokestatic wem.a (Loov;)Loov;
      // 86: athrow
      // 87: iload 0
      // 88: getstatic wem.se6 I
      // 8b: imul
      // 8c: iload 1
      // 8d: goto 94
      // 90: invokestatic wem.a (Loov;)Loov;
      // 93: athrow
      // 94: iadd
      // 95: invokestatic fe6.z1m (I)I
      // 98: istore 4
      // 9a: iload 4
      // 9c: getstatic wem.k37 Ljava/util/List;
      // 9f: invokeinterface java/util/List.size ()I 1
      // a4: if_icmpge b5
      // a7: getstatic wem.k37 Ljava/util/List;
      // aa: iload 4
      // ac: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // b1: checkcast zfz
      // b4: astore 3
      // b5: aload 3
      // b6: areturn
   }

   @Override
   public boolean pnt(int var1, int var2) {
      return true;
   }

   @Override
   public void fbq(g6k var1, int var2, int var3) {
   }

   @Override
   public boolean zzc(g6k var1, tts var2, int var3, int var4) {
      return false;
   }

   @Override
   public boolean va4(boolean var1, sw6 var2) {
      return true;
   }

   @Override
   public void hua() {
   }

   @Override
   public boolean p68() {
      return false;
   }

   @Override
   public boolean pj4() {
      return true;
   }

   @Override
   public String y2l() {
      long var1 = a ^ 45762315016830L;
      return b;
   }

   @Override
   public List sbk(ek6 var1, mew var2) {
      gyu var3 = this.jkz.getBiomeGenForCoords(var2);
      return var3.gzj(var1);
   }

   @Override
   public mew epl(OpaquePredicate var1, String var2, mew var3) {
      return null;
   }

   @Override
   public int gkt() {
      return 0;
   }

   @Override
   public void nw5(tts var1, int var2, int var3) {
   }

   @Override
   public tts iqa(mew var1) {
      return this.et2(var1.getX() >> 4, var1.getZ() >> 4);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(5405520585035446173L, -1478910233415613630L, MethodHandles.lookup().lookupClass()).a(176389515559591L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 46463473790258L;
      Cipher var2;
      Cipher var7 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var7.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("(\u001dWý°\u0097µ\u0011©¦}Í\u0084\u0088\"b\u0085\u0097ç(íÄj\u0006".getBytes("ISO-8859-1"));
      String var8 = a(var4).intern();
      byte var10001 = -1;
      b = var8;
      k37 = Lists.newArrayList();

      for (e0x var6 : e0x.db8) {
         k37.addAll(var6.w_4().k64());
      }

      se6 = fe6.v1i(fe6.bug((float)k37.size()));
      dbf = fe6.v1i((float)k37.size() / (float)se6);
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
