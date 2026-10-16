import com.google.common.collect.Maps;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class jrs extends u7m {
   public final String q7e;
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public jrs(String var1) {
      long var2 = a ^ 62987132691026L;
      super();
      this.q7e = var1;
      this.vgp = 1;
      this.qfy(uja.kdm);
      n7w.put(b<"j">(5637, 5524555252709674144L ^ var2) + var1, this);
   }

   @Override
   public boolean ghw(erg param1, ha9 param2, OpaquePredicate param3, mew param4, vt2 param5, float param6, float param7, float param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 9
      // 05: aload 3
      // 06: aload 4
      // 08: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 0b: astore 10
      // 0d: aload 10
      // 0f: iload 9
      // 11: ifeq 2f
      // 14: invokeinterface zfz.r_y ()Le0x; 1
      // 19: getstatic ox_.c16 Le0x;
      // 1c: if_acmpne 9f
      // 1f: goto 26
      // 22: invokestatic jrs.a (Loov;)Loov;
      // 25: athrow
      // 26: aload 10
      // 28: goto 2f
      // 2b: invokestatic jrs.a (Loov;)Loov;
      // 2e: athrow
      // 2f: getstatic net/minecraft/block/BlockJukebox.zgd Lh76;
      // 32: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 37: checkcast java/lang/Boolean
      // 3a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3d: iload 9
      // 3f: ifeq a0
      // 42: ifne 9f
      // 45: goto 4c
      // 48: invokestatic jrs.a (Loov;)Loov;
      // 4b: athrow
      // 4c: aload 3
      // 4d: getfield OpaquePredicate.v0f Z
      // 50: iload 9
      // 52: ifeq 9e
      // 55: goto 5c
      // 58: invokestatic jrs.a (Loov;)Loov;
      // 5b: athrow
      // 5c: ifeq 6c
      // 5f: goto 66
      // 62: invokestatic jrs.a (Loov;)Loov;
      // 65: athrow
      // 66: bipush 1
      // 67: ireturn
      // 68: invokestatic jrs.a (Loov;)Loov;
      // 6b: athrow
      // 6c: getstatic ox_.c16 Le0x;
      // 6f: checkcast net/minecraft/block/BlockJukebox
      // 72: aload 3
      // 73: aload 4
      // 75: aload 10
      // 77: aload 1
      // 78: invokevirtual net/minecraft/block/BlockJukebox.m9i (Lt9d;Lmew;Lzfz;Lerg;)V
      // 7b: aload 3
      // 7c: aconst_null
      // 7d: checkcast ha9
      // 80: sipush 1005
      // 83: aload 4
      // 85: aload 0
      // 86: invokestatic u7m._lo (Lu7m;)I
      // 89: invokevirtual OpaquePredicate.pbs (Lha9;ILmew;I)V
      // 8c: aload 1
      // 8d: dup
      // 8e: getfield erg.qd2 I
      // 91: bipush 1
      // 92: isub
      // 93: putfield erg.qd2 I
      // 96: aload 2
      // 97: getstatic l9p.hqh L_ss;
      // 9a: invokevirtual ha9.aex (L_ss;)V
      // 9d: bipush 1
      // 9e: ireturn
      // 9f: bipush 0
      // a0: ireturn
   }

   @Override
   public void wra(erg var1, ha9 var2, List var3, boolean var4) {
      var3.add(this.dr5());
   }

   public String dr5() {
      long var1 = a ^ 59691852946866L;
      return orr.zgh(b<"j">(30780, 4015807360324279675L ^ var1) + this.q7e + b<"j">(11274, 6468495198580590924L ^ var1));
   }

   @Override
   public b64 c1w(erg var1) {
      return b64.t6i;
   }

   public static jrs bjz(String var0) {
      return (jrs)n7w.get(var0);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1913454688469963714L, -5000966772928195302L, MethodHandles.lookup().lookupClass()).a(206755191437865L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 138454337413207L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[3];
      int var7 = 0;
      String var6 = "\\«Ù\u0093V\u0017;\u0097Ua@\u0087\u001fä\u0097¼ßV\u0004'\u0014©wL\u0010!'\u0014´ÙðÀ]\u008eV\u0004ªx8p/ ±£*ò°\b»Ú\u0018\u0013C±±íÕ\u008d\u0005IÍKq\u001fÕ\u008d\u001c'òfógåà";
      int var8 = "\\«Ù\u0093V\u0017;\u0097Ua@\u0087\u001fä\u0097¼ßV\u0004'\u0014©wL\u0010!'\u0014´ÙðÀ]\u008eV\u0004ªx8p/ ±£*ò°\b»Ú\u0018\u0013C±±íÕ\u008d\u0005IÍKq\u001fÕ\u008d\u001c'òfógåà"
         .length();
      char var5 = 24;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = b(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            g = new String[3];
            n7w = Maps.newHashMap();
            return;
         }

         var5 = var6.charAt(var4);
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16788;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("jrs", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         g[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("jrs" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
