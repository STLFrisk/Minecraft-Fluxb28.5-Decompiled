package net.minecraft.world.gen.structure;

import com.google.common.collect.Sets;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class StructureOceanMonument$StartMonument extends ijb {
   private Set r6x = Sets.newHashSet();
   private boolean qr6;
   private static final long b;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public StructureOceanMonument$StartMonument() {
   }

   public StructureOceanMonument$StartMonument(t9d var1, Random var2, int var3, int var4) {
      super(var3, var4);
      this.drg(var1, var2, var3, var4);
   }

   private void drg(t9d var1, Random var2, int var3, int var4) {
      var2.setSeed(var1.x2p());
      long var5 = var2.nextLong();
      long var7 = var2.nextLong();
      long var9 = (long)var3 * var5;
      long var11 = (long)var4 * var7;
      var2.setSeed(var9 ^ var11 ^ var1.x2p());
      int var13 = var3 * 16 + 8 - 29;
      int var14 = var4 * 16 + 8 - 29;
      vt2 var15 = vt2$unz.fzl.cvs(var2);
      this.x9y.add(new StructureOceanMonumentPieces$MonumentBuilding(var2, var13, var14, var15));
      this.eok();
      this.qr6 = true;
   }

   @Override
   public void lbp(t9d param1, Random param2, yve param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 03: astore 4
      // 05: aload 0
      // 06: aload 4
      // 08: ifnull 35
      // 0b: getfield net/minecraft/world/gen/structure/StructureOceanMonument$StartMonument.qr6 Z
      // 0e: ifne 34
      // 11: goto 18
      // 14: invokestatic net/minecraft/world/gen/structure/StructureOceanMonument$StartMonument.b (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: getfield net/minecraft/world/gen/structure/StructureOceanMonument$StartMonument.x9y Ljava/util/LinkedList;
      // 1c: invokevirtual java/util/LinkedList.clear ()V
      // 1f: aload 0
      // 20: aload 1
      // 21: aload 2
      // 22: aload 0
      // 23: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonument$StartMonument.vdh ()I
      // 26: aload 0
      // 27: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonument$StartMonument.x65 ()I
      // 2a: invokespecial net/minecraft/world/gen/structure/StructureOceanMonument$StartMonument.drg (Lt9d;Ljava/util/Random;II)V
      // 2d: goto 34
      // 30: invokestatic net/minecraft/world/gen/structure/StructureOceanMonument$StartMonument.b (Loov;)Loov;
      // 33: athrow
      // 34: aload 0
      // 35: aload 1
      // 36: aload 2
      // 37: aload 3
      // 38: invokespecial ijb.lbp (Lt9d;Ljava/util/Random;Lyve;)V
      // 3b: return
   }

   @Override
   public boolean vud(h2f param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 03: astore 2
      // 04: aload 0
      // 05: aload 2
      // 06: ifnull 25
      // 09: getfield net/minecraft/world/gen/structure/StructureOceanMonument$StartMonument.r6x Ljava/util/Set;
      // 0c: aload 1
      // 0d: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 12: ifeq 24
      // 15: goto 1c
      // 18: invokestatic net/minecraft/world/gen/structure/StructureOceanMonument$StartMonument.b (Loov;)Loov;
      // 1b: athrow
      // 1c: bipush 0
      // 1d: goto 29
      // 20: invokestatic net/minecraft/world/gen/structure/StructureOceanMonument$StartMonument.b (Loov;)Loov;
      // 23: athrow
      // 24: aload 0
      // 25: aload 1
      // 26: invokespecial ijb.vud (Lh2f;)Z
      // 29: ireturn
   }

   @Override
   public void t4h(h2f var1) {
      super.t4h(var1);
      this.r6x.add(var1);
   }

   @Override
   public void qle(bdo var1) {
      long var2 = b ^ 40589950125671L;
      super.qle(var1);
      i2h[] var10000 = StructureStrongholdPieces$Stronghold.b();
      qhg var5 = new qhg();
      i2h[] var4 = var10000;
      Iterator var6 = this.r6x.iterator();

      while (true) {
         if (var6.hasNext()) {
            h2f var7 = (h2f)var6.next();
            bdo var8 = new bdo();

            try {
               var8.iin("X", var7.jnd);
               var8.iin("Z", var7.km5);
               var5.w2j(var8);
               if (var4 == null) {
                  break;
               }

               if (var4 != null) {
                  continue;
               }
            } catch (oov var9) {
               throw b(var9);
            }
         }

         var1.rzm(b<"q">(1946, 6544261205017818302L ^ var2), var5);
         break;
      }
   }

   @Override
   public void fh4(bdo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic net/minecraft/world/gen/structure/StructureOceanMonument$StartMonument.b J
      // 03: ldc2_w 10695046908030
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 0b: astore 4
      // 0d: aload 0
      // 0e: aload 1
      // 0f: invokespecial ijb.fh4 (Lbdo;)V
      // 12: aload 1
      // 13: sipush 14404
      // 16: ldc2_w 3988819670481012088
      // 19: lload 2
      // 1a: lxor
      // 1b: invokedynamic q (IJ)Ljava/lang/String; bsm=net/minecraft/world/gen/structure/StructureOceanMonument$StartMonument.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20: nop
      // 21: bipush 9
      // 23: aload 4
      // 25: ifnull 4d
      // 28: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 2b: ifeq 91
      // 2e: goto 35
      // 31: invokestatic net/minecraft/world/gen/structure/StructureOceanMonument$StartMonument.b (Loov;)Loov;
      // 34: athrow
      // 35: aload 1
      // 36: sipush 1946
      // 39: ldc2_w 6544240106310679207
      // 3c: lload 2
      // 3d: lxor
      // 3e: invokedynamic q (IJ)Ljava/lang/String; bsm=net/minecraft/world/gen/structure/StructureOceanMonument$StartMonument.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43: nop
      // 44: bipush 10
      // 46: goto 4d
      // 49: invokestatic net/minecraft/world/gen/structure/StructureOceanMonument$StartMonument.b (Loov;)Loov;
      // 4c: athrow
      // 4d: invokevirtual bdo.bzb (Ljava/lang/String;I)Lqhg;
      // 50: astore 5
      // 52: bipush 0
      // 53: istore 6
      // 55: iload 6
      // 57: aload 5
      // 59: invokevirtual qhg.vek ()I
      // 5c: if_icmpge 91
      // 5f: aload 5
      // 61: iload 6
      // 63: invokevirtual qhg.kd6 (I)Lbdo;
      // 66: astore 7
      // 68: aload 0
      // 69: getfield net/minecraft/world/gen/structure/StructureOceanMonument$StartMonument.r6x Ljava/util/Set;
      // 6c: new h2f
      // 6f: dup
      // 70: aload 7
      // 72: ldc "X"
      // 74: nop
      // 75: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 78: aload 7
      // 7a: ldc "Z"
      // 7c: nop
      // 7d: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 80: invokespecial h2f.<init> (II)V
      // 83: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 88: pop
      // 89: iinc 6 1
      // 8c: aload 4
      // 8e: ifnonnull 55
      // 91: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(6771756728366233131L, -7082702654108829182L, MethodHandles.lookup().lookupClass()).a(16315698677014L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 76023859956327L;
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
      String var6 = "Ðþ±e\u009b²@\u001eVçj\u001aO\u0086©ÆHp\u008fÚ\u0097\u001cÁ'á\u008côOè¬¨í\u0018Á÷*òo\u0017Á\u009f\tÖO÷\u0007\u00adKQ\u0015àa¶H8]à";
      int var8 = "Ðþ±e\u009b²@\u001eVçj\u001aO\u0086©ÆHp\u008fÚ\u0097\u001cÁ'á\u008côOè¬¨í\u0018Á÷*òo\u0017Á\u009f\tÖO÷\u0007\u00adKQ\u0015àa¶H8]à".length();
      char var5 = ' ';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = b(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            f = var9;
            g = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static oov b(oov var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 12498;
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
            throw new RuntimeException("net/minecraft/world/gen/structure/StructureOceanMonument$StartMonument", var10);
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
         throw new RuntimeException("net/minecraft/world/gen/structure/StructureOceanMonument$StartMonument" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
