package net.minecraft.tileentity;

public class TileEntitySign$2 implements e7r {
   public final ha9 vc6;
   public final TileEntitySign pm7;

   public TileEntitySign$2(TileEntitySign var1, ha9 var2) {
      this.pm7 = var1;
      this.vc6 = var2;
   }

   @Override
   public String noc() {
      return this.vc6.noc();
   }

   @Override
   public ekw xyw() {
      return this.vc6.xyw();
   }

   @Override
   public void a0d(ekw var1) {
   }

   @Override
   public boolean ge4(int param1, String param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 03: astore 3
      // 04: iload 1
      // 05: aload 3
      // 06: ifnonnull 1c
      // 09: bipush 2
      // 0a: if_icmpgt 1f
      // 0d: goto 14
      // 10: invokestatic net/minecraft/tileentity/TileEntitySign$2.a (Loov;)Loov;
      // 13: athrow
      // 14: bipush 1
      // 15: goto 1c
      // 18: invokestatic net/minecraft/tileentity/TileEntitySign$2.a (Loov;)Loov;
      // 1b: athrow
      // 1c: goto 20
      // 1f: bipush 0
      // 20: ireturn
   }

   @Override
   public mew d3d() {
      return this.pm7.al2;
   }

   @Override
   public fqr i15() {
      return new fqr((double)this.pm7.al2.getX() + 0.5, (double)this.pm7.al2.getY() + 0.5, (double)this.pm7.al2.getZ() + 0.5);
   }

   @Override
   public t9d qha() {
      return this.vc6.qha();
   }

   @Override
   public i2h zyd() {
      return this.vc6;
   }

   @Override
   public boolean ofq() {
      return false;
   }

   @Override
   public void io9(n_k$pbp var1, int var2) {
      TileEntitySign.hq1(this.pm7).ix7(this, var1, var2);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
