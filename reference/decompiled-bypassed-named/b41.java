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

public class b41 extends EntityVillager {
   private static final long c;
   private static final String[] t;
   private static final String[] u;
   private static final Map v = new HashMap(13);

   public b41(OpaquePredicate var1) {
      super(var1);
      this.cuj = true;
   }

   @Override
   public void nyy() {
      super.nyy();
      this.dgt(m6d.w7i).zf7(0.2F);
   }

   @Override
   public boolean iaw() {
      try {
         if (this.oay.rbk() != v66.na2) {
            return true;
         }
      } catch (oov var1) {
         throw a(var1);
      }

      return false;
   }

   @Override
   public boolean m63() {
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
      // 05: getfield b41.oay Lt9d;
      // 08: aload 0
      // 09: invokevirtual b41.aaw ()Lnh4;
      // 0c: aload 0
      // 0d: invokevirtual OpaquePredicate.g17 (Lnh4;Li2h;)Z
      // 10: iload 1
      // 11: ifeq 36
      // 14: ifeq 68
      // 17: goto 1e
      // 1a: invokestatic b41.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: getfield b41.oay Lt9d;
      // 22: aload 0
      // 23: aload 0
      // 24: invokevirtual b41.aaw ()Lnh4;
      // 27: invokevirtual OpaquePredicate.bb4 (Li2h;Lnh4;)Ljava/util/List;
      // 2a: invokeinterface java/util/List.isEmpty ()Z 1
      // 2f: goto 36
      // 32: invokestatic b41.a (Loov;)Loov;
      // 35: athrow
      // 36: iload 1
      // 37: ifeq 56
      // 3a: ifeq 68
      // 3d: goto 44
      // 40: invokestatic b41.a (Loov;)Loov;
      // 43: athrow
      // 44: aload 0
      // 45: getfield b41.oay Lt9d;
      // 48: aload 0
      // 49: invokevirtual b41.aaw ()Lnh4;
      // 4c: invokevirtual OpaquePredicate.hhd (Lnh4;)Z
      // 4f: goto 56
      // 52: invokestatic b41.a (Loov;)Loov;
      // 55: athrow
      // 56: iload 1
      // 57: ifeq 65
      // 5a: ifne 68
      // 5d: goto 64
      // 60: invokestatic b41.a (Loov;)Loov;
      // 63: athrow
      // 64: bipush 1
      // 65: goto 69
      // 68: bipush 0
      // 69: ireturn
   }

   @Override
   public int y5z() {
      return this.qi8() * 3;
   }

   @Override
   public int azk(float var1) {
      return 15728880;
   }

   @Override
   public float xeu(float var1) {
      return 1.0F;
   }

   @Override
   public w_0 mj4() {
      return w_0.jnp;
   }

   @Override
   public EntityVillager yx5() {
      return new b41(this.oay);
   }

   @Override
   public u7m q4n() {
      return xbr.tle;
   }

   @Override
   public void ir3(boolean param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: invokevirtual b41.q4n ()Lu7m;
      // 08: astore 4
      // 0a: aload 4
      // 0c: ifnull 73
      // 0f: aload 0
      // 10: invokevirtual b41.qi8 ()I
      // 13: bipush 1
      // 14: iload 3
      // 15: ifeq 39
      // 18: goto 1f
      // 1b: invokestatic b41.a (Loov;)Loov;
      // 1e: athrow
      // 1f: if_icmple 73
      // 22: goto 29
      // 25: invokestatic b41.a (Loov;)Loov;
      // 28: athrow
      // 29: aload 0
      // 2a: getfield b41.z2d Ljava/util/Random;
      // 2d: bipush 4
      // 2e: invokevirtual java/util/Random.nextInt (I)I
      // 31: bipush 2
      // 32: goto 39
      // 35: invokestatic b41.a (Loov;)Loov;
      // 38: athrow
      // 39: isub
      // 3a: istore 5
      // 3c: iload 2
      // 3d: iload 3
      // 3e: ifeq 5b
      // 41: ifle 5a
      // 44: goto 4b
      // 47: invokestatic b41.a (Loov;)Loov;
      // 4a: athrow
      // 4b: iload 5
      // 4d: aload 0
      // 4e: getfield b41.z2d Ljava/util/Random;
      // 51: iload 2
      // 52: bipush 1
      // 53: iadd
      // 54: invokevirtual java/util/Random.nextInt (I)I
      // 57: iadd
      // 58: istore 5
      // 5a: bipush 0
      // 5b: istore 6
      // 5d: iload 6
      // 5f: iload 5
      // 61: if_icmpge 73
      // 64: aload 0
      // 65: aload 4
      // 67: bipush 1
      // 68: invokevirtual b41.e70 (Lu7m;I)Lnvf;
      // 6b: pop
      // 6c: iinc 6 1
      // 6f: iload 3
      // 70: ifne 5d
      // 73: return
   }

   @Override
   public boolean agj() {
      return false;
   }

   @Override
   public int usz() {
      return super.usz() * 4;
   }

   @Override
   public void mni() {
      this.yzk *= 0.9F;
   }

   @Override
   public void xv1() {
      this.mop = (double)(0.42F + (float)this.qi8() * 0.1F);
      this.u19 = true;
   }

   @Override
   public void q6x() {
      this.mop = (double)(0.22F + (float)this.qi8() * 0.05F);
      this.u19 = true;
   }

   @Override
   public void ibc(float var1, float var2) {
   }

   @Override
   public boolean cry() {
      return true;
   }

   @Override
   public int t2j() {
      return super.t2j() + 2;
   }

   @Override
   public String u5x() {
      long var1 = c ^ 124814572664550L;

      try {
         if (this.qi8() > 1) {
            return e<"f">(13634, 7395878397512221690L ^ var1);
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return e<"f">(31965, 2194416744475708004L ^ var1);
   }

   @Override
   public boolean xak() {
      return true;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(2005020348962509345L, 8586306691971541725L, MethodHandles.lookup().lookupClass()).a(42079867080114L);
      // $VF: monitorexit
      c = var10000;
      long var0 = c ^ 34000947953294L;
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
      String var6 = "èö9rÜÎE÷N(×Ø*\t]6\u001b\u0006¡ !÷TâT\\\u000bÔ.ë\u0098\u0005Í\u0093\u009fv\u0014\u009a·\u001c(\u0012\n\u007f\u0089!º||\u001e²Ñlõí\u0087\u001c»ìûÇöhèÚe\u009cºÛÙà¡\u0019RH.\u0089£¨\u0013É";
      int var8 = "èö9rÜÎE÷N(×Ø*\t]6\u001b\u0006¡ !÷TâT\\\u000bÔ.ë\u0098\u0005Í\u0093\u009fv\u0014\u009a·\u001c(\u0012\n\u007f\u0089!º||\u001e²Ñlõí\u0087\u001c»ìûÇöhèÚe\u009cºÛÙà¡\u0019RH.\u0089£¨\u0013É"
         .length();
      char var5 = '(';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = e(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            t = var9;
            u = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static oov a(oov var0) {
      return var0;
   }

   private static String e(byte[] var0) {
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

   private static String e(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 20445;
      if (u[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])v.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               v.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("b41", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = t[var5].getBytes("ISO-8859-1");
         u[var5] = e(((Cipher)var4[0]).doFinal(var9));
      }

      return u[var5];
   }

   private static Object e(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = e(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite e(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("e".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("b41" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
