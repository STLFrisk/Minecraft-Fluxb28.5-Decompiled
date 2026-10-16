import java.util.List;
import java.util.Random;
import net.minecraft.tileentity.TileEntityEndPortal;

public class iw0 extends rw8 {
   public iw0(p3y var1) {
      super(var1);
      this.lnc(1.0F);
   }

   @Override
   public pyk ie9(OpaquePredicate var1, int var2) {
      return new TileEntityEndPortal();
   }

   @Override
   public void c7i(m5n var1, mew var2) {
      float var3 = 0.0625F;
      this.xl4(0.0F, 0.0F, 0.0F, 1.0F, var3, 1.0F);
   }

   @Override
   public boolean ron(m5n var1, mew var2, vt2 var3) {
      try {
         if (var3 == vt2.m3r) {
            return super.ron(var1, var2, var3);
         }
      } catch (oov var4) {
         throw a(var4);
      }

      return false;
   }

   @Override
   public void c76(OpaquePredicate var1, mew var2, zfz var3, nh4 var4, List var5, EntityLivingBase var6) {
   }

   @Override
   public boolean ko5() {
      return false;
   }

   @Override
   public boolean gck() {
      return false;
   }

   @Override
   public int bzr(Random var1) {
      return 0;
   }

   @Override
   public void n9e(OpaquePredicate param1, mew param2, zfz param3, EntityLivingBase param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 5
      // 05: aload 4
      // 07: getfield EntityLivingBase.hzp Li2h;
      // 0a: iload 5
      // 0c: ifeq 25
      // 0f: ifnonnull 43
      // 12: goto 19
      // 15: invokestatic iw0.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 4
      // 1b: getfield EntityLivingBase.wgv Li2h;
      // 1e: goto 25
      // 21: invokestatic iw0.a (Loov;)Loov;
      // 24: athrow
      // 25: ifnonnull 43
      // 28: aload 1
      // 29: getfield OpaquePredicate.v0f Z
      // 2c: ifne 43
      // 2f: goto 36
      // 32: invokestatic iw0.a (Loov;)Loov;
      // 35: athrow
      // 36: aload 4
      // 38: bipush 1
      // 39: invokevirtual EntityLivingBase.zye (I)V
      // 3c: goto 43
      // 3f: invokestatic iw0.a (Loov;)Loov;
      // 42: athrow
      // 43: return
   }

   @Override
   public void kyo(OpaquePredicate var1, mew var2, zfz var3, Random var4) {
      double var5 = (double)((float)var2.getX() + var4.nextFloat());
      double var7 = (double)((float)var2.getY() + 0.8F);
      double var9 = (double)((float)var2.getZ() + var4.nextFloat());
      double var11 = 0.0;
      double var13 = 0.0;
      double var15 = 0.0;
      var1.zvy(w_0.bac, var5, var7, var9, var11, var13, var15, new int[0]);
   }

   @Override
   public u7m su9(OpaquePredicate var1, mew var2) {
      return null;
   }

   @Override
   public _mi uoz(zfz var1) {
      return _mi.xas;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
