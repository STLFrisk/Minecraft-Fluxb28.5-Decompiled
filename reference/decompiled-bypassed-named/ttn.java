import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ttn extends cjm {
   private static final long a;
   private static final String b;

   public ttn(EntityPlayer var1, double var2, u7m var4, boolean var5) {
      long var6 = a ^ 34202052820189L;
      super();
      this.syk = var1;
      this._k6 = var2;
      this.t4x = var4;
      this.s95 = var5;
      this.k23(3);
      if (!(var1.zq2() instanceof zvv)) {
         throw new IllegalArgumentException(b);
      }
   }

   @Override
   public boolean vle() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 3c
      // 09: getfield ttn.fcs I
      // 0c: ifle 26
      // 0f: goto 16
      // 12: invokestatic ttn.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15: athrow
      // 16: aload 0
      // 17: dup
      // 18: getfield ttn.fcs I
      // 1b: bipush 1
      // 1c: isub
      // 1d: putfield ttn.fcs I
      // 20: bipush 0
      // 21: ireturn
      // 22: invokestatic ttn.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 25: athrow
      // 26: aload 0
      // 27: aload 0
      // 28: getfield ttn.syk Llaq;
      // 2b: getfield EntityPlayer.oay Lt9d;
      // 2e: aload 0
      // 2f: getfield ttn.syk Llaq;
      // 32: ldc2_w 10.0
      // 35: invokevirtual OpaquePredicate.a_q (Li2h;D)Lha9;
      // 38: putfield ttn.hyj Lha9;
      // 3b: aload 0
      // 3c: getfield ttn.hyj Lha9;
      // 3f: iload 1
      // 40: ifeq 57
      // 43: ifnonnull 53
      // 46: goto 4d
      // 49: invokestatic ttn.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4c: athrow
      // 4d: bipush 0
      // 4e: ireturn
      // 4f: invokestatic ttn.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 52: athrow
      // 53: aload 0
      // 54: getfield ttn.hyj Lha9;
      // 57: invokevirtual ha9.b5z ()Lerg;
      // 5a: astore 2
      // 5b: aload 2
      // 5c: iload 1
      // 5d: ifeq 73
      // 60: ifnonnull 72
      // 63: goto 6a
      // 66: invokestatic ttn.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 69: athrow
      // 6a: bipush 0
      // 6b: goto 86
      // 6e: invokestatic ttn.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 71: athrow
      // 72: aload 2
      // 73: invokevirtual erg.gn1 ()Lu7m;
      // 76: aload 0
      // 77: getfield ttn.t4x Lu7m;
      // 7a: if_acmpne 85
      // 7d: bipush 1
      // 7e: goto 86
      // 81: invokestatic ttn.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 84: athrow
      // 85: bipush 0
      // 86: ireturn
   }

   @Override
   public boolean wh3() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield ttn.s95 Z
      // 08: iload 1
      // 09: ifeq fd
      // 0c: ifeq f9
      // 0f: goto 16
      // 12: invokestatic ttn.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15: athrow
      // 16: aload 0
      // 17: iload 1
      // 18: ifeq d7
      // 1b: goto 22
      // 1e: invokestatic ttn.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 21: athrow
      // 22: getfield ttn.syk Llaq;
      // 25: aload 0
      // 26: getfield ttn.hyj Lha9;
      // 29: invokevirtual EntityPlayer.wxg (Li2h;)D
      // 2c: ldc2_w 36.0
      // 2f: dcmpg
      // 30: ifge c0
      // 33: goto 3a
      // 36: invokestatic ttn.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 39: athrow
      // 3a: aload 0
      // 3b: getfield ttn.hyj Lha9;
      // 3e: aload 0
      // 3f: getfield ttn.hak D
      // 42: aload 0
      // 43: getfield ttn.eqk D
      // 46: aload 0
      // 47: getfield ttn.rnz D
      // 4a: invokevirtual ha9.p53 (DDD)D
      // 4d: ldc2_w 0.010000000000000002
      // 50: dcmpl
      // 51: iload 1
      // 52: ifeq 80
      // 55: goto 5c
      // 58: invokestatic ttn.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5b: athrow
      // 5c: ifle 6c
      // 5f: goto 66
      // 62: invokestatic ttn.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 65: athrow
      // 66: bipush 0
      // 67: ireturn
      // 68: invokestatic ttn.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6b: athrow
      // 6c: aload 0
      // 6d: getfield ttn.hyj Lha9;
      // 70: getfield ha9.y2i F
      // 73: f2d
      // 74: aload 0
      // 75: getfield ttn.jq6 D
      // 78: dsub
      // 79: invokestatic java/lang/Math.abs (D)D
      // 7c: ldc2_w 5.0
      // 7f: dcmpl
      // 80: iload 1
      // 81: ifeq bf
      // 84: ifgt b7
      // 87: goto 8e
      // 8a: invokestatic ttn.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 8d: athrow
      // 8e: aload 0
      // 8f: iload 1
      // 90: ifeq ee
      // 93: goto 9a
      // 96: invokestatic ttn.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 99: athrow
      // 9a: getfield ttn.hyj Lha9;
      // 9d: getfield ha9.x5k F
      // a0: f2d
      // a1: aload 0
      // a2: getfield ttn.fsy D
      // a5: dsub
      // a6: invokestatic java/lang/Math.abs (D)D
      // a9: ldc2_w 5.0
      // ac: dcmpl
      // ad: ifle e1
      // b0: goto b7
      // b3: invokestatic ttn.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // b6: athrow
      // b7: bipush 0
      // b8: goto bf
      // bb: invokestatic ttn.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // be: athrow
      // bf: ireturn
      // c0: aload 0
      // c1: aload 0
      // c2: getfield ttn.hyj Lha9;
      // c5: getfield ha9.o2v D
      // c8: putfield ttn.hak D
      // cb: aload 0
      // cc: aload 0
      // cd: getfield ttn.hyj Lha9;
      // d0: getfield ha9.kfp D
      // d3: putfield ttn.eqk D
      // d6: aload 0
      // d7: aload 0
      // d8: getfield ttn.hyj Lha9;
      // db: getfield ha9.vbd D
      // de: putfield ttn.rnz D
      // e1: aload 0
      // e2: aload 0
      // e3: getfield ttn.hyj Lha9;
      // e6: getfield ha9.y2i F
      // e9: f2d
      // ea: putfield ttn.jq6 D
      // ed: aload 0
      // ee: aload 0
      // ef: getfield ttn.hyj Lha9;
      // f2: getfield ha9.x5k F
      // f5: f2d
      // f6: putfield ttn.fsy D
      // f9: aload 0
      // fa: invokevirtual ttn.vle ()Z
      // fd: ireturn
   }

   @Override
   public void mnp() {
      this.hak = this.hyj.o2v;
      this.eqk = this.hyj.kfp;
      this.rnz = this.hyj.vbd;
      this.xu5 = true;
      this.axr = ((zvv)this.syk.zq2()).cb4();
      ((zvv)this.syk.zq2()).uuq(false);
   }

   @Override
   public void zly() {
      this.hyj = null;
      this.syk.zq2().pj2();
      this.fcs = 100;
      this.xu5 = false;
      ((zvv)this.syk.zq2()).uuq(this.axr);
   }

   @Override
   public void iad() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield ttn.syk Llaq;
      // 08: invokevirtual EntityPlayer.ph8 ()Lknw;
      // 0b: aload 0
      // 0c: getfield ttn.hyj Lha9;
      // 0f: ldc 30.0
      // 11: nop
      // 12: aload 0
      // 13: getfield ttn.syk Llaq;
      // 16: invokevirtual EntityPlayer.d1r ()I
      // 19: i2f
      // 1a: invokevirtual knw.rz3 (Li2h;FF)V
      // 1d: aload 0
      // 1e: getfield ttn.syk Llaq;
      // 21: aload 0
      // 22: getfield ttn.hyj Lha9;
      // 25: invokevirtual EntityPlayer.wxg (Li2h;)D
      // 28: ldc2_w 6.25
      // 2b: dcmpg
      // 2c: iload 1
      // 2d: ifne 68
      // 30: ifge 4f
      // 33: goto 3a
      // 36: invokestatic ttn.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 39: athrow
      // 3a: aload 0
      // 3b: getfield ttn.syk Llaq;
      // 3e: invokevirtual EntityPlayer.zq2 ()Lp8a;
      // 41: invokevirtual p8a.pj2 ()V
      // 44: iload 1
      // 45: ifeq 69
      // 48: goto 4f
      // 4b: invokestatic ttn.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4e: athrow
      // 4f: aload 0
      // 50: getfield ttn.syk Llaq;
      // 53: invokevirtual EntityPlayer.zq2 ()Lp8a;
      // 56: aload 0
      // 57: getfield ttn.hyj Lha9;
      // 5a: aload 0
      // 5b: getfield ttn._k6 D
      // 5e: invokevirtual p8a.p6m (Li2h;D)Z
      // 61: goto 68
      // 64: invokestatic ttn.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 67: athrow
      // 68: pop
      // 69: return
   }

   public boolean pp1() {
      return this.xu5;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(8820566569600400051L, 2790522154366664591L, MethodHandles.lookup().lookupClass()).a(269126073589445L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 67753044789219L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal(
         "\u001a~\u00074\u0090Ô\u0004ûMùj9}»\u001d\u009a\u0015äX\u0092ú¹JÈ \u0017\u0016ðêÑ\\\u0005ôv\u001d\u0080xï0x".getBytes("ISO-8859-1")
      );
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
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
