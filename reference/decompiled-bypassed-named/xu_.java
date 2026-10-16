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

public class xu_ extends Module {
   public static BooleanSetting xcz;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public xu_() {
      long var1 = a ^ 50190197518551L;
      super(b<"k">(12567, 2537298558247424231L ^ var1), _aj.p3z, false, new SubEngine[0]);
      this._ic = new Timer();
   }

   @EventHandler
   public void pz6(TickEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: getstatic KillAura.kfa Lg_3;
      // 07: ifnonnull 2b
      // 0a: getstatic ModuleRegistry.nd5 Lfyk;
      // 0d: getfield KillAura.kl3 Lnhs;
      // 10: ldc2_w 200.0
      // 13: invokevirtual Timer.us_ (D)Z
      // 16: iload 2
      // 17: ifne 37
      // 1a: goto 21
      // 1d: invokestatic xu_.a (Loov;)Loov;
      // 20: athrow
      // 21: ifne 2c
      // 24: goto 2b
      // 27: invokestatic xu_.a (Loov;)Loov;
      // 2a: athrow
      // 2b: return
      // 2c: aload 0
      // 2d: pop
      // 2e: getstatic xu_.ek1 Lc05;
      // 31: getfield Minecraft.u0y Lgbe;
      // 34: instanceof zg9
      // 37: iload 2
      // 38: ifne 50
      // 3b: ifeq 46
      // 3e: goto 45
      // 41: invokestatic xu_.a (Loov;)Loov;
      // 44: athrow
      // 45: return
      // 46: aload 0
      // 47: getfield xu_._ic Lnhs;
      // 4a: ldc2_w 200.0
      // 4d: invokevirtual Timer.yrv (D)Z
      // 50: iload 2
      // 51: ifne 68
      // 54: ifne 5f
      // 57: goto 5e
      // 5a: invokestatic xu_.a (Loov;)Loov;
      // 5d: athrow
      // 5e: return
      // 5f: getstatic xu_.xcz Lcn7;
      // 62: invokevirtual BooleanSetting.getValue ()Ljava/lang/Boolean;
      // 65: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 68: iload 2
      // 69: ifne b2
      // 6c: ifeq a2
      // 6f: goto 76
      // 72: invokestatic xu_.a (Loov;)Loov;
      // 75: athrow
      // 76: aload 0
      // 77: aload 0
      // 78: bipush 0
      // 79: invokestatic amb.txc (I)Lerg;
      // 7c: invokevirtual xu_.i9z (Lerg;)D
      // 7f: invokevirtual xu_.m20 (D)I
      // 82: istore 3
      // 83: iload 2
      // 84: ifne 9e
      // 87: iload 3
      // 88: bipush -1
      // 89: if_icmpne 98
      // 8c: goto 93
      // 8f: invokestatic xu_.a (Loov;)Loov;
      // 92: athrow
      // 93: return
      // 94: invokestatic xu_.a (Loov;)Loov;
      // 97: athrow
      // 98: aload 0
      // 99: iload 3
      // 9a: bipush 0
      // 9b: invokevirtual xu_.dd8 (II)V
      // 9e: iload 2
      // 9f: ifeq ea
      // a2: invokestatic amb.p2w ()Lerg;
      // a5: invokevirtual erg.gn1 ()Lu7m;
      // a8: instanceof za6
      // ab: goto b2
      // ae: invokestatic xu_.a (Loov;)Loov;
      // b1: athrow
      // b2: iload 2
      // b3: ifne cc
      // b6: ifne c1
      // b9: goto c0
      // bc: invokestatic xu_.a (Loov;)Loov;
      // bf: athrow
      // c0: return
      // c1: aload 0
      // c2: aload 0
      // c3: invokestatic amb.p2w ()Lerg;
      // c6: invokevirtual xu_.i9z (Lerg;)D
      // c9: invokevirtual xu_.m20 (D)I
      // cc: istore 3
      // cd: iload 3
      // ce: bipush -1
      // cf: if_icmpne d7
      // d2: return
      // d3: invokestatic xu_.a (Loov;)Loov;
      // d6: athrow
      // d7: aload 0
      // d8: iload 3
      // d9: aload 0
      // da: pop
      // db: getstatic xu_.ek1 Lc05;
      // de: getfield Minecraft.vg8 Ll86;
      // e1: getfield EntityPlayerSP.up_ Ljnq;
      // e4: getfield jnq.nb5 I
      // e7: invokevirtual xu_.dd8 (II)V
      // ea: aload 0
      // eb: getfield xu_._ic Lnhs;
      // ee: invokevirtual Timer.zay ()V
      // f1: return
   }

   public int m20(double param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: bipush 0
      // 05: istore 4
      // 07: iload 4
      // 09: bipush 36
      // 0b: if_icmpge a0
      // 0e: aload 0
      // 0f: pop
      // 10: getstatic xu_.ek1 Lc05;
      // 13: getfield Minecraft.vg8 Ll86;
      // 16: getfield EntityPlayerSP.up_ Ljnq;
      // 19: iload 3
      // 1a: ifeq 49
      // 1d: getfield jnq.nb5 I
      // 20: iload 3
      // 21: ifeq a1
      // 24: goto 2b
      // 27: invokestatic xu_.a (Loov;)Loov;
      // 2a: athrow
      // 2b: iload 4
      // 2d: if_icmpne 3e
      // 30: goto 37
      // 33: invokestatic xu_.a (Loov;)Loov;
      // 36: athrow
      // 37: goto 99
      // 3a: invokestatic xu_.a (Loov;)Loov;
      // 3d: athrow
      // 3e: aload 0
      // 3f: pop
      // 40: getstatic xu_.ek1 Lc05;
      // 43: getfield Minecraft.vg8 Ll86;
      // 46: getfield EntityPlayerSP.up_ Ljnq;
      // 49: getfield jnq.c41 [Lerg;
      // 4c: iload 4
      // 4e: aaload
      // 4f: astore 5
      // 51: aload 5
      // 53: iload 3
      // 54: ifeq 66
      // 57: ifnonnull 64
      // 5a: goto 61
      // 5d: invokestatic xu_.a (Loov;)Loov;
      // 60: athrow
      // 61: goto 99
      // 64: aload 5
      // 66: invokevirtual erg.gn1 ()Lu7m;
      // 69: instanceof za6
      // 6c: iload 3
      // 6d: ifeq 85
      // 70: ifne 7d
      // 73: goto 7a
      // 76: invokestatic xu_.a (Loov;)Loov;
      // 79: athrow
      // 7a: goto 99
      // 7d: dload 1
      // 7e: aload 0
      // 7f: aload 5
      // 81: invokevirtual xu_.i9z (Lerg;)D
      // 84: dcmpl
      // 85: iload 3
      // 86: ifeq 98
      // 89: iflt 96
      // 8c: goto 93
      // 8f: invokestatic xu_.a (Loov;)Loov;
      // 92: athrow
      // 93: goto 99
      // 96: iload 4
      // 98: ireturn
      // 99: iinc 4 1
      // 9c: iload 3
      // 9d: ifne 07
      // a0: bipush -1
      // a1: ireturn
   }

   public double i9z(erg param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: invokevirtual erg.gn1 ()Lu7m;
      // 08: iload 2
      // 09: ifeq 23
      // 0c: instanceof za6
      // 0f: ifne 1f
      // 12: goto 19
      // 15: invokestatic xu_.a (Loov;)Loov;
      // 18: athrow
      // 19: dconst_0
      // 1a: dreturn
      // 1b: invokestatic xu_.a (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 1
      // 20: invokevirtual erg.gn1 ()Lu7m;
      // 23: checkcast za6
      // 26: astore 3
      // 27: dconst_1
      // 28: dstore 4
      // 2a: dload 4
      // 2c: aload 3
      // 2d: invokevirtual za6.ngv ()F
      // 30: f2d
      // 31: dadd
      // 32: dstore 4
      // 34: dload 4
      // 36: ldc2_w 1.25
      // 39: getstatic vef.m3n Lvef;
      // 3c: getfield vef.bbf I
      // 3f: aload 1
      // 40: invokestatic hc0.qa_ (ILerg;)I
      // 43: i2d
      // 44: dmul
      // 45: dadd
      // 46: dstore 4
      // 48: dload 4
      // 4a: ldc2_w 0.5
      // 4d: getstatic vef.zbl Lvef;
      // 50: getfield vef.bbf I
      // 53: aload 1
      // 54: invokestatic hc0.qa_ (ILerg;)I
      // 57: i2d
      // 58: dmul
      // 59: dadd
      // 5a: dstore 4
      // 5c: dload 4
      // 5e: dreturn
   }

   public void dd8(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: iload 1
      // 05: bipush 8
      // 07: iload 3
      // 08: ifeq 1f
      // 0b: if_icmpgt 21
      // 0e: goto 15
      // 11: invokestatic xu_.a (Loov;)Loov;
      // 14: athrow
      // 15: bipush 36
      // 17: iload 1
      // 18: goto 1f
      // 1b: invokestatic xu_.a (Loov;)Loov;
      // 1e: athrow
      // 1f: iadd
      // 20: istore 1
      // 21: aload 0
      // 22: pop
      // 23: getstatic xu_.ek1 Lc05;
      // 26: getfield Minecraft.l7q Lhh6;
      // 29: aload 0
      // 2a: pop
      // 2b: getstatic xu_.ek1 Lc05;
      // 2e: getfield Minecraft.vg8 Ll86;
      // 31: getfield EntityPlayerSP.fv9 L_jc;
      // 34: getfield _jc.h7l I
      // 37: iload 1
      // 38: iload 2
      // 39: bipush 2
      // 3a: aload 0
      // 3b: pop
      // 3c: getstatic xu_.ek1 Lc05;
      // 3f: getfield Minecraft.vg8 Ll86;
      // 42: invokevirtual hh6.efg (IIIILha9;)Lerg;
      // 45: pop
      // 46: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1835142404266858548L, -5176837374148270904L, MethodHandles.lookup().lookupClass()).a(76266273654155L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 123148378289090L;
      Cipher var0;
      Cipher var12 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[3];
      int var5 = 0;
      String var4 = "\u0017jJÃpÑéÑíO\u001f9}\u0014©Y¹æuÏ_\u001cÖè\u009a\u0010W´c\u0084\u00053 ø;\u0095Þ\u008d\u009d\"mÔ©âfR\u0019*ÅS\u0096¢ \u0092÷Â\rÐª\u008dÄÓö\u001b\u0012 LßlÌ\u0099µ7¼7\u0007\u0000´\u0006gthWÑ\u001f+ð\u0095\r\u0007%°¿Íª tö";
      int var6 = "\u0017jJÃpÑéÑíO\u001f9}\u0014©Y¹æuÏ_\u001cÖè\u009a\u0010W´c\u0084\u00053 ø;\u0095Þ\u008d\u009d\"mÔ©âfR\u0019*ÅS\u0096¢ \u0092÷Â\rÐª\u008dÄÓö\u001b\u0012 LßlÌ\u0099µ7¼7\u0007\u0000´\u0006gthWÑ\u001f+ð\u0095\r\u0007%°¿Íª tö"
         .length();
      char var3 = ' ';
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var14 = b(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var14;
         if ((var2 += var3) >= var6) {
            f = var7;
            g = new String[3];
            xcz = new BooleanSetting(b<"k">(18528, 2776001624262240902L ^ var9), b<"k">(30892, 2556686012666174027L ^ var9), false);
            return;
         }

         var3 = var4.charAt(var2);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11221;
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
            throw new RuntimeException("xu_", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = f[var5].getBytes("ISO-8859-1");
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
         throw new RuntimeException("xu_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
