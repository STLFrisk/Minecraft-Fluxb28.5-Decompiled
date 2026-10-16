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

public class txf extends p7s {
   private static final long c;
   private static final String[] o;
   private static final String[] p;
   private static final Map q = new HashMap(13);

   public txf(t9d var1) {
      super(var1);
   }

   public txf(t9d var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   @Override
   public void szd(ofh param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic txf.c J
      // 03: ldc2_w 56412104101165
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.b ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: aload 1
      // 0f: invokespecial p7s.szd (Lofh;)V
      // 12: aload 0
      // 13: iload 4
      // 15: ifeq 41
      // 18: getfield txf.oay Lt9d;
      // 1b: invokevirtual t9d.eir ()Lef9;
      // 1e: sipush 2193
      // 21: ldc2_w 4731658288554572827
      // 24: lload 2
      // 25: lxor
      // 26: invokedynamic s (IJ)Ljava/lang/String; bsm=txf.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: nop
      // 2c: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 2f: ifeq 4d
      // 32: goto 39
      // 35: invokestatic txf.b (Loov;)Loov;
      // 38: athrow
      // 39: aload 0
      // 3a: goto 41
      // 3d: invokestatic txf.b (Loov;)Loov;
      // 40: athrow
      // 41: getstatic ox_.cug Lhrd;
      // 44: invokestatic u7m.gfm (Le0x;)Lu7m;
      // 47: bipush 1
      // 48: fconst_0
      // 49: invokevirtual txf.bhk (Lu7m;IF)Lnvf;
      // 4c: pop
      // 4d: return
   }

   @Override
   public int opt() {
      return 27;
   }

   @Override
   public _f3$c3d x38() {
      return _f3$c3d.bum;
   }

   @Override
   public zfz hcw() {
      return ox_.cug.l4i().zvi(hrd.gse, vt2.z9q);
   }

   @Override
   public int a45() {
      return 8;
   }

   @Override
   public String q4l() {
      long var1 = c ^ 24548510861101L;
      return d<"s">(19274, 1266926768489739713L ^ var1);
   }

   @Override
   public _jc b_f(jnq var1, ha9 var2) {
      return new j_9(var1, this, var2);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5233826661066054811L, -3951903981682085120L, MethodHandles.lookup().lookupClass()).a(87086397212056L);
      // $VF: monitorexit
      c = var10000;
      long var0 = c ^ 24569226736425L;
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
      String var6 = "\u0016\u0013\u0093o\u008eìf<RÄrS´\u0092¦\u001b\fµ¯¿>ò,ú§µTÆ\u0003à\u008dÞ ®¦\r?\u0080\u0088\u0098\u0086\u0006\u009b×îO\u009aÅµ\u009bn¬s\u0018)S\u001b[\u007fzü\u0099£u²";
      int var8 = "\u0016\u0013\u0093o\u008eìf<RÄrS´\u0092¦\u001b\fµ¯¿>ò,ú§µTÆ\u0003à\u008dÞ ®¦\r?\u0080\u0088\u0098\u0086\u0006\u009b×îO\u009aÅµ\u009bn¬s\u0018)S\u001b[\u007fzü\u0099£u²"
         .length();
      char var5 = ' ';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = d(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            o = var9;
            p = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static oov b(oov var0) {
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

   private static String d(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 10814;
      if (p[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])q.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               q.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("txf", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = o[var5].getBytes("ISO-8859-1");
         p[var5] = d(((Cipher)var4[0]).doFinal(var9));
      }

      return p[var5];
   }

   private static Object d(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = d(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite d(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("d".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("txf" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
