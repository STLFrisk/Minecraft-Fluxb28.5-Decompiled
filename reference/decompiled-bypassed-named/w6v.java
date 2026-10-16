public class w6v {
   public static z_9 f6g = new z_9();

   public w6v(mew var1, vt2 var2, fqr var3) {
      this.evm = var1;
      this.ffm = var2;
      this.wql = var3;
   }

   public mew mfs() {
      return this.evm;
   }

   public vt2 ecu() {
      return this.ffm;
   }

   public fqr q0z() {
      return this.wql;
   }

   public void npb(fqr var1) {
      this.wql = var1;
   }

   public w6v(mew var1, vt2 var2, fqr var3, int var4) {
      this(var1, var2, var3);
      if ((var4 & 4) != 0) {
         new fqr((double)var1.getX() + 0.5, (double)var1.getY() + 0.5, (double)var1.getZ() + 0.5);
      }
   }

   public static w6v cbj(mew var0) {
      return f6g.sqb(var0);
   }

   public static e0x fdw(mew var0) {
      int var1 = OpaquePredicate.b();
      WorldClient var3 = Minecraft.vz1().tij;

      WorldClient var10000;
      label35: {
         try {
            var10000 = var3;
            if (var1 == 0) {
               break label35;
            }

            if (var3 == null) {
               return null;
            }
         } catch (oov var5) {
            throw a(var5);
         }

         var10000 = var3;
      }

      zfz var2;
      zfz var6 = var2 = var10000.getBlockState(var0);

      try {
         if (var1 == 0) {
            return var6.r_y();
         }

         if (var6 == null) {
            return null;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      return var2.r_y();
   }

   public static zfz zf9(mew var0) {
      return Minecraft.vz1().tij.getBlockState(var0);
   }

   public static boolean wa8(mew param0) {
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
      // 05: invokestatic w6v.fdw (Lmew;)Le0x;
      // 08: astore 2
      // 09: aload 2
      // 0a: iload 1
      // 0b: ifne 19
      // 0e: ifnull 52
      // 11: goto 18
      // 14: invokestatic w6v.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 2
      // 19: aload 0
      // 1a: invokestatic w6v.zf9 (Lmew;)Lzfz;
      // 1d: bipush 0
      // 1e: invokevirtual e0x.qc_ (Lzfz;Z)Z
      // 21: iload 1
      // 22: ifne 53
      // 25: ifeq 52
      // 28: goto 2f
      // 2b: invokestatic w6v.a (Loov;)Loov;
      // 2e: athrow
      // 2f: invokestatic Minecraft.vz1 ()Lc05;
      // 32: getfield Minecraft.tij Lkh3;
      // 35: astore 3
      // 36: aload 3
      // 37: invokevirtual WorldClient.fve ()Lw5i;
      // 3a: aload 0
      // 3b: invokevirtual w5i.hka (Lmew;)Z
      // 3e: iload 1
      // 3f: ifne 53
      // 42: ifeq 52
      // 45: goto 4c
      // 48: invokestatic w6v.a (Loov;)Loov;
      // 4b: athrow
      // 4c: bipush 1
      // 4d: ireturn
      // 4e: invokestatic w6v.a (Loov;)Loov;
      // 51: athrow
      // 52: bipush 0
      // 53: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
