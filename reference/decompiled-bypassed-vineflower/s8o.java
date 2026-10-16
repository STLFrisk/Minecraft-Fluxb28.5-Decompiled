import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class s8o extends q4x {
   private final ha9 kod;
   private final _f3 rgt;
   private static final long a;
   private static final String b;

   public s8o(ha9 var1, _f3 var2) {
      long var3 = a ^ 126531633313878L;
      super(new gdz(b));
      this.kod = var1;
      this.rgt = var2;
      this.gcf = jp4$y3u.d5l;
      this.v4c = true;
      this.bye = 0;
   }

   @Override
   public void _21() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne bf
      // 09: getfield s8o.rgt L_f3;
      // 0c: getfield _f3.ma9 Z
      // 0f: ifne b7
      // 12: goto 19
      // 15: invokestatic s8o.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: iload 1
      // 1b: ifne bf
      // 1e: goto 25
      // 21: invokestatic s8o.a (Loov;)Loov;
      // 24: athrow
      // 25: getfield s8o.kod Lha9;
      // 28: invokevirtual ha9.i0e ()Z
      // 2b: ifeq b7
      // 2e: goto 35
      // 31: invokestatic s8o.a (Loov;)Loov;
      // 34: athrow
      // 35: aload 0
      // 36: iload 1
      // 37: ifne bf
      // 3a: goto 41
      // 3d: invokestatic s8o.a (Loov;)Loov;
      // 40: athrow
      // 41: getfield s8o.kod Lha9;
      // 44: getfield ha9.hzp Li2h;
      // 47: aload 0
      // 48: getfield s8o.rgt L_f3;
      // 4b: if_acmpne b7
      // 4e: goto 55
      // 51: invokestatic s8o.a (Loov;)Loov;
      // 54: athrow
      // 55: aload 0
      // 56: getfield s8o.rgt L_f3;
      // 59: getfield _f3.icv D
      // 5c: aload 0
      // 5d: getfield s8o.rgt L_f3;
      // 60: getfield _f3.icv D
      // 63: dmul
      // 64: aload 0
      // 65: getfield s8o.rgt L_f3;
      // 68: getfield _f3.bw4 D
      // 6b: aload 0
      // 6c: getfield s8o.rgt L_f3;
      // 6f: getfield _f3.bw4 D
      // 72: dmul
      // 73: dadd
      // 74: invokestatic fe6.dii (D)F
      // 77: fstore 2
      // 78: iload 1
      // 79: ifne a3
      // 7c: fload 2
      // 7d: f2d
      // 7e: ldc2_w 0.01
      // 81: dcmpl
      // 82: iflt a7
      // 85: goto 8c
      // 88: invokestatic s8o.a (Loov;)Loov;
      // 8b: athrow
      // 8c: aload 0
      // 8d: fconst_0
      // 8e: fload 2
      // 8f: fconst_0
      // 90: fconst_1
      // 91: invokestatic fe6._f3 (FFF)F
      // 94: ldc 0.75
      // 96: nop
      // 97: fmul
      // 98: fadd
      // 99: putfield s8o.n1s F
      // 9c: goto a3
      // 9f: invokestatic s8o.a (Loov;)Loov;
      // a2: athrow
      // a3: iload 1
      // a4: ifeq b3
      // a7: aload 0
      // a8: fconst_0
      // a9: putfield s8o.n1s F
      // ac: goto b3
      // af: invokestatic s8o.a (Loov;)Loov;
      // b2: athrow
      // b3: iload 1
      // b4: ifeq c3
      // b7: aload 0
      // b8: goto bf
      // bb: invokestatic s8o.a (Loov;)Loov;
      // be: athrow
      // bf: bipush 1
      // c0: putfield s8o.h5_ Z
      // c3: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5953395048135255015L, 4291286006674553518L, MethodHandles.lookup().lookupClass()).a(175961937440457L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 53998458987797L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("³ÎÚæÅlÆ9WÊÆ¥¶xu<\u007fà;tÐQû5ÙÉpð\u008f(ÌÍ".getBytes("ISO-8859-1"));
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
