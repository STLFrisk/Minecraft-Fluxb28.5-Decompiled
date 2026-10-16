import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class tne extends ak9 {
   private List bpg;
   private int ib2;
   private boolean s95;
   private sbi en3;
   private boolean jw9;
   private static final long a;
   private static final String c;

   public tne(nm6 var1, int var2, int var3, String var4) {
      long var5 = a ^ 113204017679891L;
      super(var1, var2, var3, var4);
      this.bpg = new ArrayList();
      this.en3 = new sbi(15);
      this.vms = jvy.ypj;
      this.c1c = 0;
      this.bqh = c;
   }

   public void csc(ak9 var1) {
      this.q_0();
      var1.git = this;
      var1.koa = this.koa + 10;
      this.bpg.add(var1);
   }

   @Override
   public void g1p(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 3
      // 004: aload 0
      // 005: getfield tne.s95 Z
      // 008: iload 3
      // 009: ifne 03b
      // 00c: ifne 035
      // 00f: goto 016
      // 012: invokestatic tne.a (Loov;)Loov;
      // 015: athrow
      // 016: aload 0
      // 017: getfield tne.en3 Lsbi;
      // 01a: invokevirtual sbi.ds7 ()D
      // 01d: dconst_0
      // 01e: dcmpl
      // 01f: iload 3
      // 020: ifne 03b
      // 023: goto 02a
      // 026: invokestatic tne.a (Loov;)Loov;
      // 029: athrow
      // 02a: ifne 035
      // 02d: goto 034
      // 030: invokestatic tne.a (Loov;)Loov;
      // 033: athrow
      // 034: return
      // 035: aload 0
      // 036: getfield tne.koa I
      // 039: bipush 5
      // 03a: iadd
      // 03b: i2f
      // 03c: fstore 4
      // 03e: aload 0
      // 03f: getfield tne.loa Lnm6;
      // 042: getfield nm6.po6 I
      // 045: i2f
      // 046: aload 0
      // 047: getfield tne.loa Lnm6;
      // 04a: getfield nm6.ybp I
      // 04d: getstatic jvy.nwy I
      // 050: isub
      // 051: i2d
      // 052: d2f
      // 053: fadd
      // 054: getstatic jvy.nwy I
      // 057: i2f
      // 058: fadd
      // 059: aload 0
      // 05a: getfield tne.c1c I
      // 05d: aload 0
      // 05e: getfield tne.mff I
      // 061: iadd
      // 062: i2f
      // 063: invokestatic java/lang/Math.min (FF)F
      // 066: fstore 5
      // 068: aload 0
      // 069: getfield tne.vms I
      // 06c: bipush 10
      // 06e: isub
      // 06f: i2f
      // 070: fstore 6
      // 072: aload 0
      // 073: getfield tne.mff I
      // 076: aload 0
      // 077: getfield tne.c1c I
      // 07a: iadd
      // 07b: aload 0
      // 07c: getfield tne.loa Lnm6;
      // 07f: getfield nm6.po6 I
      // 082: bipush 12
      // 084: iadd
      // 085: isub
      // 086: aload 0
      // 087: getfield tne.c1c I
      // 08a: invokestatic java/lang/Math.min (II)I
      // 08d: i2f
      // 08e: fstore 7
      // 090: fload 7
      // 092: fconst_0
      // 093: fcmpg
      // 094: iload 3
      // 095: ifne 0ad
      // 098: ifle 0cf
      // 09b: goto 0a2
      // 09e: invokestatic tne.a (Loov;)Loov;
      // 0a1: athrow
      // 0a2: aload 0
      // 0a3: getfield tne.c1c I
      // 0a6: goto 0ad
      // 0a9: invokestatic tne.a (Loov;)Loov;
      // 0ac: athrow
      // 0ad: i2f
      // 0ae: aload 0
      // 0af: getfield tne.jw9 Z
      // 0b2: ifeq 0bf
      // 0b5: ldc 4.5
      // 0b7: nop
      // 0b8: goto 0c0
      // 0bb: invokestatic tne.a (Loov;)Loov;
      // 0be: athrow
      // 0bf: fconst_1
      // 0c0: fcmpg
      // 0c1: iload 3
      // 0c2: ifne 0d6
      // 0c5: ifgt 0d0
      // 0c8: goto 0cf
      // 0cb: invokestatic tne.a (Loov;)Loov;
      // 0ce: athrow
      // 0cf: return
      // 0d0: aload 0
      // 0d1: getfield tne.koa I
      // 0d4: bipush 5
      // 0d5: iadd
      // 0d6: i2f
      // 0d7: aload 0
      // 0d8: getfield tne.mff I
      // 0db: i2f
      // 0dc: aload 0
      // 0dd: getfield tne.vms I
      // 0e0: bipush 10
      // 0e2: isub
      // 0e3: i2f
      // 0e4: aload 0
      // 0e5: getfield tne.c1c I
      // 0e8: i2f
      // 0e9: aload 0
      // 0ea: getfield tne.jw9 Z
      // 0ed: ifeq 0fa
      // 0f0: ldc 4.5
      // 0f2: nop
      // 0f3: goto 0fb
      // 0f6: invokestatic tne.a (Loov;)Loov;
      // 0f9: athrow
      // 0fa: fconst_0
      // 0fb: fsub
      // 0fc: ldc 0.5
      // 0fe: nop
      // 0ff: new java/awt/Color
      // 102: dup
      // 103: bipush 0
      // 104: bipush 0
      // 105: bipush 0
      // 106: bipush 1
      // 107: invokespecial java/awt/Color.<init> (IIII)V
      // 10a: invokevirtual java/awt/Color.getRGB ()I
      // 10d: new java/awt/Color
      // 110: dup
      // 111: sipush 175
      // 114: sipush 175
      // 117: sipush 175
      // 11a: sipush 220
      // 11d: invokespecial java/awt/Color.<init> (IIII)V
      // 120: invokevirtual java/awt/Color.getRGB ()I
      // 123: invokestatic mkt.cju (FFFFFII)V
      // 126: invokestatic mkt.dkk ()V
      // 129: fload 4
      // 12b: fload 5
      // 12d: fload 6
      // 12f: fload 7
      // 131: invokestatic mkt.zxh (FFFF)V
      // 134: aload 0
      // 135: getfield tne.bpg Ljava/util/List;
      // 138: iload 1
      // 139: iload 2
      // 13a: invokedynamic accept (II)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, tne.y7h (IILak9;)V, (Lak9;)V ]
      // 13f: invokeinterface java/util/List.forEach (Ljava/util/function/Consumer;)V 2
      // 144: invokestatic mkt.dkk ()V
      // 147: aload 0
      // 148: getfield tne.loa Lnm6;
      // 14b: getfield nm6.vs1 F
      // 14e: aload 0
      // 14f: getfield tne.loa Lnm6;
      // 152: getfield nm6.y93 F
      // 155: aload 0
      // 156: getfield tne.loa Lnm6;
      // 159: getfield nm6.z11 F
      // 15c: aload 0
      // 15d: getfield tne.loa Lnm6;
      // 160: getfield nm6._m2 F
      // 163: invokestatic mkt.zxh (FFFF)V
      // 166: return
   }

   @Override
   public void x6o(int param1, int param2, boolean param3) {
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
      // 06: iload 4
      // 08: ifne 3d
      // 0b: getfield tne.s95 Z
      // 0e: ifne 3c
      // 11: goto 18
      // 14: invokestatic tne.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: iload 4
      // 1b: ifne 3d
      // 1e: goto 25
      // 21: invokestatic tne.a (Loov;)Loov;
      // 24: athrow
      // 25: getfield tne.en3 Lsbi;
      // 28: invokevirtual sbi.ds7 ()D
      // 2b: dconst_0
      // 2c: dcmpl
      // 2d: ifne 3c
      // 30: goto 37
      // 33: invokestatic tne.a (Loov;)Loov;
      // 36: athrow
      // 37: return
      // 38: invokestatic tne.a (Loov;)Loov;
      // 3b: athrow
      // 3c: aload 0
      // 3d: getfield tne.bpg Ljava/util/List;
      // 40: iload 1
      // 41: iload 2
      // 42: iload 3
      // 43: invokedynamic accept (IIZ)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, tne.ewd (IIZLak9;)V, (Lak9;)V ]
      // 48: invokeinterface java/util/List.forEach (Ljava/util/function/Consumer;)V 2
      // 4d: return
   }

   @Override
   public void c2n(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: iload 1
      // 02: iload 2
      // 03: invokespecial ak9.c2n (II)V
      // 06: invokestatic t9d.c ()I
      // 09: aload 0
      // 0a: getfield tne.bpg Ljava/util/List;
      // 0d: iload 1
      // 0e: iload 2
      // 0f: invokedynamic accept (II)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, tne.nxi (IILak9;)V, (Lak9;)V ]
      // 14: invokeinterface java/util/List.forEach (Ljava/util/function/Consumer;)V 2
      // 19: istore 3
      // 1a: aload 0
      // 1b: getfield tne.mff I
      // 1e: istore 4
      // 20: aload 0
      // 21: getfield tne.koa I
      // 24: istore 5
      // 26: aload 0
      // 27: getfield tne.bpg Ljava/util/List;
      // 2a: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 2f: astore 6
      // 31: aload 6
      // 33: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 38: ifeq 6e
      // 3b: aload 6
      // 3d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 42: checkcast ak9
      // 45: astore 7
      // 47: aload 7
      // 49: iload 4
      // 4b: putfield ak9.mff I
      // 4e: aload 7
      // 50: iload 5
      // 52: putfield ak9.koa I
      // 55: iload 4
      // 57: aload 7
      // 59: getfield ak9.c1c I
      // 5c: iadd
      // 5d: istore 4
      // 5f: iload 3
      // 60: ifne 79
      // 63: iload 3
      // 64: ifeq 31
      // 67: goto 6e
      // 6a: invokestatic tne.a (Loov;)Loov;
      // 6d: athrow
      // 6e: aload 0
      // 6f: getfield tne.en3 Lsbi;
      // 72: aload 0
      // 73: getfield tne.s95 Z
      // 76: invokevirtual sbi.qtk (Z)V
      // 79: aload 0
      // 7a: iload 3
      // 7b: ifne a8
      // 7e: getfield tne.en3 Lsbi;
      // 81: invokevirtual sbi.ds7 ()D
      // 84: dconst_1
      // 85: dcmpl
      // 86: ifne 95
      // 89: goto 90
      // 8c: invokestatic tne.a (Loov;)Loov;
      // 8f: athrow
      // 90: return
      // 91: invokestatic tne.a (Loov;)Loov;
      // 94: athrow
      // 95: aload 0
      // 96: aload 0
      // 97: getfield tne.en3 Lsbi;
      // 9a: invokevirtual sbi.ds7 ()D
      // 9d: aload 0
      // 9e: getfield tne.ib2 I
      // a1: i2d
      // a2: dmul
      // a3: d2i
      // a4: putfield tne.c1c I
      // a7: aload 0
      // a8: getfield tne.loa Lnm6;
      // ab: invokevirtual nm6.met ()V
      // ae: return
   }

   public void kzo() {
      int var1 = t9d.b();

      tne var10000;
      int var10001;
      byte var10002;
      label22: {
         label21: {
            try {
               var10000 = this;
               var10001 = this.bpg.stream().mapToInt(tne::y5k).sum();
               var10002 = this.jw9;
               if (var1 == 0) {
                  break label22;
               }

               if (this.jw9) {
                  break label21;
               }
            } catch (oov var2) {
               throw a(var2);
            }

            var10002 = 5;
            break label22;
         }

         var10002 = 10;
      }

      var10000.ib2 = var10001 + var10002;
   }

   public void g2y(boolean var1) {
      this.s95 = var1;
   }

   public boolean z2s() {
      return this.s95;
   }

   public boolean fzf() {
      return this.jw9;
   }

   public void _0w(boolean var1) {
      this.jw9 = var1;
   }

   private static int y5k(ak9 var0) {
      return var0.c1c;
   }

   private static void nxi(int var0, int var1, ak9 var2) {
      var2.c2n(var0, var1);
   }

   private static void ewd(int var0, int var1, boolean var2, ak9 var3) {
      var3.x6o(var0, var1, var2);
   }

   private static void y7h(int var0, int var1, ak9 var2) {
      var2.g1p(var0, var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(8859364632471308226L, 4720221255525004523L, MethodHandles.lookup().lookupClass()).a(45456120483134L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 30321758174522L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal(" C¯TgÜ.Q".getBytes("ISO-8859-1"));
      String var6 = b(var4).intern();
      byte var10001 = -1;
      c = var6;
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
