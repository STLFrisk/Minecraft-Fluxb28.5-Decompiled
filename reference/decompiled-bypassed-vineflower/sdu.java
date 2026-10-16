import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class sdu extends ak9 {
   public boolean umr;
   private static final long c;
   private static final String g;

   public sdu(nm6 var1, int var2, int var3, String var4) {
      long var5 = c ^ 71427479090303L;
      super(var1, var2, var3, var4);
      this.vms = jvy.s15;
      this.c1c = jvy.cec;
      this.bqh = g;
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
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: aload 0
      // 05: getfield sdu.yu6 Z
      // 08: iload 3
      // 09: ifne 61
      // 0c: ifeq 56
      // 0f: goto 16
      // 12: invokestatic sdu.c (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield sdu.koa I
      // 1a: i2f
      // 1b: aload 0
      // 1c: getfield sdu.mff I
      // 1f: i2f
      // 20: aload 0
      // 21: getfield sdu.vms I
      // 24: aload 0
      // 25: getfield sdu.loa Lnm6;
      // 28: getfield nm6.yg5 Z
      // 2b: iload 3
      // 2c: ifne 43
      // 2f: goto 36
      // 32: invokestatic sdu.c (Loov;)Loov;
      // 35: athrow
      // 36: ifeq 46
      // 39: goto 40
      // 3c: invokestatic sdu.c (Loov;)Loov;
      // 3f: athrow
      // 40: getstatic jvy.ynu I
      // 43: goto 47
      // 46: bipush 0
      // 47: isub
      // 48: i2f
      // 49: aload 0
      // 4a: getfield sdu.c1c I
      // 4d: i2f
      // 4e: bipush 0
      // 4f: invokestatic mkt.uk7 (FFFFI)V
      // 52: iload 3
      // 53: ifeq 94
      // 56: aload 0
      // 57: getfield sdu.koa I
      // 5a: goto 61
      // 5d: invokestatic sdu.c (Loov;)Loov;
      // 60: athrow
      // 61: i2f
      // 62: aload 0
      // 63: getfield sdu.mff I
      // 66: i2f
      // 67: aload 0
      // 68: getfield sdu.vms I
      // 6b: aload 0
      // 6c: getfield sdu.loa Lnm6;
      // 6f: getfield nm6.yg5 Z
      // 72: iload 3
      // 73: ifne 83
      // 76: ifeq 86
      // 79: goto 80
      // 7c: invokestatic sdu.c (Loov;)Loov;
      // 7f: athrow
      // 80: getstatic jvy.ynu I
      // 83: goto 87
      // 86: bipush 0
      // 87: isub
      // 88: i2f
      // 89: aload 0
      // 8a: getfield sdu.c1c I
      // 8d: i2f
      // 8e: getstatic jvy.ogc I
      // 91: invokestatic mkt.uk7 (FFFFI)V
      // 94: getstatic jsr.eum Lcyb;
      // 97: aload 0
      // 98: getfield sdu.vy4 Ljava/lang/String;
      // 9b: aload 0
      // 9c: getfield sdu.koa I
      // 9f: bipush 2
      // a0: iadd
      // a1: i2f
      // a2: aload 0
      // a3: getfield sdu.mff I
      // a6: aload 0
      // a7: getfield sdu.c1c I
      // aa: bipush 2
      // ab: idiv
      // ac: iadd
      // ad: i2f
      // ae: getstatic jsr.eum Lcyb;
      // b1: aload 0
      // b2: getfield sdu.vy4 Ljava/lang/String;
      // b5: invokevirtual cyb.wni (Ljava/lang/String;)F
      // b8: fconst_2
      // b9: fdiv
      // ba: fsub
      // bb: aload 0
      // bc: getfield sdu.umr Z
      // bf: iload 3
      // c0: ifne d9
      // c3: ifeq d7
      // c6: goto cd
      // c9: invokestatic sdu.c (Loov;)Loov;
      // cc: athrow
      // cd: getstatic jvy.cnm I
      // d0: goto da
      // d3: invokestatic sdu.c (Loov;)Loov;
      // d6: athrow
      // d7: ldc 16777215
      // d9: nop
      // da: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // dd: pop
      // de: return
   }

   @Override
   public void c2n(int var1, int var2) {
      super.c2n(var1, var2);
   }

   public abstract void p4o();

   @Override
   public void x6o(int param1, int param2, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 4
      // 05: aload 0
      // 06: aload 0
      // 07: iload 1
      // 08: iload 2
      // 09: invokevirtual sdu.nxv (II)Z
      // 0c: iload 4
      // 0e: ifeq 2b
      // 11: ifeq 3e
      // 14: goto 1b
      // 17: invokestatic sdu.c (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 0
      // 1c: getfield sdu.loa Lnm6;
      // 1f: iload 1
      // 20: iload 2
      // 21: invokevirtual nm6.au1 (II)Z
      // 24: goto 2b
      // 27: invokestatic sdu.c (Loov;)Loov;
      // 2a: athrow
      // 2b: iload 4
      // 2d: ifeq 3b
      // 30: ifeq 3e
      // 33: goto 3a
      // 36: invokestatic sdu.c (Loov;)Loov;
      // 39: athrow
      // 3a: bipush 1
      // 3b: goto 3f
      // 3e: bipush 0
      // 3f: putfield sdu.yu6 Z
      // 42: iload 4
      // 44: ifeq 96
      // 47: iload 3
      // 48: ifeq 91
      // 4b: goto 52
      // 4e: invokestatic sdu.c (Loov;)Loov;
      // 51: athrow
      // 52: aload 0
      // 53: iload 4
      // 55: ifeq 92
      // 58: goto 5f
      // 5b: invokestatic sdu.c (Loov;)Loov;
      // 5e: athrow
      // 5f: getfield sdu.u_u Z
      // 62: ifne 91
      // 65: goto 6c
      // 68: invokestatic sdu.c (Loov;)Loov;
      // 6b: athrow
      // 6c: aload 0
      // 6d: iload 4
      // 6f: ifeq 92
      // 72: goto 79
      // 75: invokestatic sdu.c (Loov;)Loov;
      // 78: athrow
      // 79: getfield sdu.yu6 Z
      // 7c: ifeq 91
      // 7f: goto 86
      // 82: invokestatic sdu.c (Loov;)Loov;
      // 85: athrow
      // 86: aload 0
      // 87: invokevirtual sdu.p4o ()V
      // 8a: goto 91
      // 8d: invokestatic sdu.c (Loov;)Loov;
      // 90: athrow
      // 91: aload 0
      // 92: iload 3
      // 93: putfield sdu.u_u Z
      // 96: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(4552201147602527158L, -1580421896650061810L, MethodHandles.lookup().lookupClass()).a(142123281579897L);
      // $VF: monitorexit
      c = var10000;
      long var0 = c ^ 44933718055752L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("=ÕÏ\u000bÍ\u009f£1".getBytes("ISO-8859-1"));
      String var6 = b(var4).intern();
      byte var10001 = -1;
      g = var6;
   }

   private static oov c(oov var0) {
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
