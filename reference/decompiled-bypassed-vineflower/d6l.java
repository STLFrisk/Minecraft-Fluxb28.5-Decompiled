import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandles;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class d6l {
   public yqv z3k;
   public List d2y = Lists.newArrayList();
   public List y0w = Lists.newArrayList();
   private static final long a;
   private static final String b;

   public d6l(yqv var1) {
      this.z3k = var1;
   }

   public void ukb() {
      this.d2y.clear();
      this.y0w.clear();
   }

   public boolean ik5(i2h param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic d6l.a J
      // 03: ldc2_w 94289000207617
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.b ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: getfield d6l.d2y Ljava/util/List;
      // 11: aload 1
      // 12: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 17: iload 4
      // 19: ifeq 36
      // 1c: ifeq 2c
      // 1f: goto 26
      // 22: invokestatic d6l.a (Loov;)Loov;
      // 25: athrow
      // 26: bipush 1
      // 27: ireturn
      // 28: invokestatic d6l.a (Loov;)Loov;
      // 2b: athrow
      // 2c: aload 0
      // 2d: getfield d6l.y0w Ljava/util/List;
      // 30: aload 1
      // 31: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 36: iload 4
      // 38: ifeq 64
      // 3b: ifeq 4b
      // 3e: goto 45
      // 41: invokestatic d6l.a (Loov;)Loov;
      // 44: athrow
      // 45: bipush 0
      // 46: ireturn
      // 47: invokestatic d6l.a (Loov;)Loov;
      // 4a: athrow
      // 4b: aload 0
      // 4c: getfield d6l.z3k Lyqv;
      // 4f: getfield yqv.oay Lt9d;
      // 52: getfield t9d.e8t Luan;
      // 55: getstatic d6l.b Ljava/lang/String;
      // 58: nop
      // 59: invokevirtual uan.qek (Ljava/lang/String;)V
      // 5c: aload 0
      // 5d: getfield d6l.z3k Lyqv;
      // 60: aload 1
      // 61: invokevirtual yqv.gq6 (Li2h;)Z
      // 64: istore 5
      // 66: aload 0
      // 67: getfield d6l.z3k Lyqv;
      // 6a: getfield yqv.oay Lt9d;
      // 6d: getfield t9d.e8t Luan;
      // 70: invokevirtual uan.uio ()V
      // 73: iload 5
      // 75: iload 4
      // 77: ifeq ac
      // 7a: ifeq 9b
      // 7d: goto 84
      // 80: invokestatic d6l.a (Loov;)Loov;
      // 83: athrow
      // 84: aload 0
      // 85: getfield d6l.d2y Ljava/util/List;
      // 88: aload 1
      // 89: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 8e: pop
      // 8f: iload 4
      // 91: ifne ad
      // 94: goto 9b
      // 97: invokestatic d6l.a (Loov;)Loov;
      // 9a: athrow
      // 9b: aload 0
      // 9c: getfield d6l.y0w Ljava/util/List;
      // 9f: aload 1
      // a0: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // a5: goto ac
      // a8: invokestatic d6l.a (Loov;)Loov;
      // ab: athrow
      // ac: pop
      // ad: iload 5
      // af: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1104064444238109760L, 3476167205202179150L, MethodHandles.lookup().lookupClass()).a(134375304982891L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 44747859491451L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("¾nVgL\u0005¶P".getBytes("ISO-8859-1"));
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
