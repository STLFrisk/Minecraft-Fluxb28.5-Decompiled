import java.util.ArrayDeque;
import java.util.Arrays;

public class nem extends tp4 {
   private static final zfz gyl = ox_.ibw.l4i();
   private final mew urk;
   private int[] gvo;
   private zfz[] rhq;
   private static ArrayDeque kd2 = new ArrayDeque();
   private static ArrayDeque vwi = new ArrayDeque();
   private static int byw = hxt.rut(Runtime.getRuntime().availableProcessors(), 1, 32);

   public nem(OpaquePredicate var1, mew var2, mew var3, int var4) {
      super(var1, var2, var3, var4);
      this.urk = var2.dg4(new wgo(var4, var4, var4));
      short var5 = 8000;
      this.gvo = b7i(8000);
      Arrays.fill(this.gvo, -1);
      this.rhq = f7j(8000);
   }

   @Override
   public pyk getTileEntity(mew var1) {
      int var2 = (var1.getX() >> 4) - this.mhd;
      int var3 = (var1.getZ() >> 4) - this._75;
      return this.rxz[var2][var3].y58(var1, tts$cl0.h9e);
   }

   @Override
   public int getCombinedLight(mew param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: invokespecial nem.wxb (Lmew;)I
      // 05: istore 4
      // 07: invokestatic OpaquePredicate.b ()I
      // 0a: aload 0
      // 0b: getfield nem.gvo [I
      // 0e: iload 4
      // 10: iaload
      // 11: istore 5
      // 13: istore 3
      // 14: iload 5
      // 16: iload 3
      // 17: ifeq 73
      // 1a: bipush -1
      // 1b: if_icmpne 71
      // 1e: goto 25
      // 21: invokestatic nem.a (Loov;)Loov;
      // 24: athrow
      // 25: aload 0
      // 26: iload 3
      // 27: ifeq 69
      // 2a: goto 31
      // 2d: invokestatic nem.a (Loov;)Loov;
      // 30: athrow
      // 31: aload 1
      // 32: iload 2
      // 33: invokespecial tp4.getCombinedLight (Lmew;I)I
      // 36: istore 5
      // 38: invokestatic hxt.csr ()Z
      // 3b: ifeq 68
      // 3e: aload 0
      // 3f: iload 3
      // 40: ifeq 69
      // 43: goto 4a
      // 46: invokestatic nem.a (Loov;)Loov;
      // 49: athrow
      // 4a: aload 1
      // 4b: invokevirtual nem.getBlockState (Lmew;)Lzfz;
      // 4e: invokeinterface zfz.r_y ()Le0x; 1
      // 53: invokevirtual e0x.ko5 ()Z
      // 56: ifne 68
      // 59: goto 60
      // 5c: invokestatic nem.a (Loov;)Loov;
      // 5f: athrow
      // 60: aload 1
      // 61: iload 5
      // 63: invokestatic net/optifine/DynamicLights.getCombinedLight (Lmew;I)I
      // 66: istore 5
      // 68: aload 0
      // 69: getfield nem.gvo [I
      // 6c: iload 4
      // 6e: iload 5
      // 70: iastore
      // 71: iload 5
      // 73: ireturn
   }

   @Override
   public zfz getBlockState(mew var1) {
      int var3 = this.wxb(var1);
      int var10000 = OpaquePredicate.c();
      zfz var4 = this.rhq[var3];
      int var2 = var10000;

      try {
         if (var2 != 0) {
            return var4;
         }

         if (var4 != null) {
            return var4;
         }
      } catch (oov var5) {
         throw a(var5);
      }

      var4 = this.z0p(var1);
      this.rhq[var3] = var4;
      return var4;
   }

   private zfz z0p(mew var1) {
      return super.getBlockState(var1);
   }

   private int wxb(mew var1) {
      int var2 = var1.getX() - this.urk.getX();
      int var3 = var1.getY() - this.urk.getY();
      int var4 = var1.getZ() - this.urk.getZ();
      return var2 * 400 + var4 * 20 + var3;
   }

   public void sc3() {
      op0(this.gvo);
      gsd(this.rhq);
   }

   private static int[] b7i(int param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: getstatic nem.kd2 Ljava/util/ArrayDeque;
      // 07: dup
      // 08: astore 2
      // 09: monitorenter
      // 0a: getstatic nem.kd2 Ljava/util/ArrayDeque;
      // 0d: invokevirtual java/util/ArrayDeque.pollLast ()Ljava/lang/Object;
      // 10: checkcast [I
      // 13: checkcast [I
      // 16: astore 3
      // 17: aload 3
      // 18: iload 1
      // 19: ifeq 48
      // 1c: ifnull 3e
      // 1f: goto 26
      // 22: invokestatic nem.a (Loov;)Loov;
      // 25: athrow
      // 26: aload 3
      // 27: iload 1
      // 28: ifeq 4c
      // 2b: goto 32
      // 2e: invokestatic nem.a (Loov;)Loov;
      // 31: athrow
      // 32: arraylength
      // 33: iload 0
      // 34: if_icmpge 49
      // 37: goto 3e
      // 3a: invokestatic nem.a (Loov;)Loov;
      // 3d: athrow
      // 3e: iload 0
      // 3f: newarray 10
      // 41: goto 48
      // 44: invokestatic nem.a (Loov;)Loov;
      // 47: athrow
      // 48: astore 3
      // 49: aload 3
      // 4a: aload 2
      // 4b: monitorexit
      // 4c: areturn
      // 4d: astore 4
      // 4f: aload 2
      // 50: monitorexit
      // 51: aload 4
      // 53: athrow
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void op0(int[] var0) {
      int var1 = OpaquePredicate.b();
      ArrayDeque var2 = kd2;
      synchronized (kd2) {
         ArrayDeque var10000 = kd2;
         if (var1 != 0) {
            try {
               if (var10000.size() < byw) {
                  kd2.add(var0);
               }
            } catch (oov var4) {
               throw a(var4);
            }

            var10000 = var2;
         }

         // $VF: monitorexit
      }
   }

   private static zfz[] f7j(int param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: getstatic nem.vwi Ljava/util/ArrayDeque;
      // 07: dup
      // 08: astore 2
      // 09: monitorenter
      // 0a: getstatic nem.vwi Ljava/util/ArrayDeque;
      // 0d: invokevirtual java/util/ArrayDeque.pollLast ()Ljava/lang/Object;
      // 10: checkcast [Lzfz;
      // 13: checkcast [Lzfz;
      // 16: astore 3
      // 17: aload 3
      // 18: iload 1
      // 19: ifne 59
      // 1c: ifnull 4e
      // 1f: goto 26
      // 22: invokestatic nem.a (Loov;)Loov;
      // 25: athrow
      // 26: aload 3
      // 27: arraylength
      // 28: iload 1
      // 29: ifne 56
      // 2c: goto 33
      // 2f: invokestatic nem.a (Loov;)Loov;
      // 32: athrow
      // 33: iload 0
      // 34: if_icmplt 4e
      // 37: goto 3e
      // 3a: invokestatic nem.a (Loov;)Loov;
      // 3d: athrow
      // 3e: aload 3
      // 3f: aconst_null
      // 40: invokestatic java/util/Arrays.fill ([Ljava/lang/Object;Ljava/lang/Object;)V
      // 43: iload 1
      // 44: ifeq 5a
      // 47: goto 4e
      // 4a: invokestatic nem.a (Loov;)Loov;
      // 4d: athrow
      // 4e: iload 0
      // 4f: goto 56
      // 52: invokestatic nem.a (Loov;)Loov;
      // 55: athrow
      // 56: anewarray 105
      // 59: astore 3
      // 5a: aload 3
      // 5b: aload 2
      // 5c: monitorexit
      // 5d: areturn
      // 5e: astore 4
      // 60: aload 2
      // 61: monitorexit
      // 62: aload 4
      // 64: athrow
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void gsd(zfz[] var0) {
      int var1 = OpaquePredicate.c();
      ArrayDeque var2 = vwi;
      synchronized (vwi) {
         ArrayDeque var10000 = vwi;
         if (var1 == 0) {
            try {
               if (var10000.size() < byw) {
                  vwi.add(var0);
               }
            } catch (oov var4) {
               throw a(var4);
            }

            var10000 = var2;
         }

         // $VF: monitorexit
      }
   }

   private static oov a(oov var0) {
      return var0;
   }
}
