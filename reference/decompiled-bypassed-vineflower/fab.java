import java.nio.ByteBuffer;
import net.optifine.render.VboRange;
import net.optifine.render.VboRegion;

public class fab {
   public fab(be7 var1) {
      this.oi4 = var1;
      this.cnu = gis.q58();
   }

   public void qez() {
      gis.h99(gis.m0a, this.cnu);
   }

   public void err(ByteBuffer param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifne 47
      // 09: getfield fab.eht Lnet/optifine/render/VboRegion;
      // 0c: ifnull 2d
      // 0f: goto 16
      // 12: invokestatic fab.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield fab.eht Lnet/optifine/render/VboRegion;
      // 1a: aload 1
      // 1b: aload 0
      // 1c: getfield fab.za6 Lnet/optifine/render/VboRange;
      // 1f: invokevirtual net/optifine/render/VboRegion.bufferData (Ljava/nio/ByteBuffer;Lnet/optifine/render/VboRange;)V
      // 22: iload 2
      // 23: ifeq 56
      // 26: goto 2d
      // 29: invokestatic fab.a (Loov;)Loov;
      // 2c: athrow
      // 2d: aload 0
      // 2e: invokevirtual fab.qez ()V
      // 31: getstatic gis.m0a I
      // 34: aload 1
      // 35: ldc 35044
      // 37: nop
      // 38: invokestatic gis._3z (ILjava/nio/ByteBuffer;I)V
      // 3b: aload 0
      // 3c: invokevirtual fab.hk8 ()V
      // 3f: aload 0
      // 40: goto 47
      // 43: invokestatic fab.a (Loov;)Loov;
      // 46: athrow
      // 47: aload 1
      // 48: invokevirtual java/nio/ByteBuffer.limit ()I
      // 4b: aload 0
      // 4c: getfield fab.oi4 Lbe7;
      // 4f: invokevirtual be7.vy7 ()I
      // 52: idiv
      // 53: putfield fab.nx5 I
      // 56: return
   }

   public void stg(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifeq 1c
      // 09: getfield fab.dqh I
      // 0c: ifle 1b
      // 0f: goto 16
      // 12: invokestatic fab.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield fab.dqh I
      // 1a: istore 1
      // 1b: aload 0
      // 1c: getfield fab.eht Lnet/optifine/render/VboRegion;
      // 1f: iload 2
      // 20: ifeq 38
      // 23: ifnull 44
      // 26: goto 2d
      // 29: invokestatic fab.a (Loov;)Loov;
      // 2c: athrow
      // 2d: aload 0
      // 2e: getfield fab.eht Lnet/optifine/render/VboRegion;
      // 31: goto 38
      // 34: invokestatic fab.a (Loov;)Loov;
      // 37: athrow
      // 38: iload 1
      // 39: aload 0
      // 3a: getfield fab.za6 Lnet/optifine/render/VboRange;
      // 3d: invokevirtual net/optifine/render/VboRegion.drawArrays (ILnet/optifine/render/VboRange;)V
      // 40: iload 2
      // 41: ifne 54
      // 44: iload 1
      // 45: bipush 0
      // 46: aload 0
      // 47: getfield fab.nx5 I
      // 4a: invokestatic org/lwjgl/opengl/GL11.glDrawArrays (III)V
      // 4d: goto 54
      // 50: invokestatic fab.a (Loov;)Loov;
      // 53: athrow
      // 54: return
   }

   public void hk8() {
      gis.h99(gis.m0a, 0);
   }

   public void v24() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield fab.cnu I
      // 08: iload 1
      // 09: ifeq 21
      // 0c: iflt 29
      // 0f: goto 16
      // 12: invokestatic fab.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield fab.cnu I
      // 1a: goto 21
      // 1d: invokestatic fab.a (Loov;)Loov;
      // 20: athrow
      // 21: invokestatic gis.a0f (I)V
      // 24: aload 0
      // 25: bipush -1
      // 26: putfield fab.cnu I
      // 29: return
   }

   public void fb5(VboRegion var1) {
      try {
         if (var1 != null) {
            this.v24();
            this.eht = var1;
            this.za6 = new VboRange();
         }
      } catch (oov var2) {
         throw a(var2);
      }
   }

   public VboRegion qb8() {
      return this.eht;
   }

   public VboRange ox9() {
      return this.za6;
   }

   public int kw2() {
      return this.dqh;
   }

   public void b9v(int var1) {
      this.dqh = var1;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
