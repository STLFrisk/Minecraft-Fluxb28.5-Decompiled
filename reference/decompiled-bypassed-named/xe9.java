import net.optifine.shaders.MultiTexID;
import net.optifine.shaders.ShadersTex;

public abstract class xe9 implements sm5 {
   public int _6o = -1;
   public boolean dms;
   public boolean s4p;
   public boolean y2n;
   public boolean ywm;
   public MultiTexID xni;

   public void l16(boolean param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: iload 1
      // 02: putfield xe9.dms Z
      // 05: aload 0
      // 06: iload 2
      // 07: putfield xe9.s4p Z
      // 0a: bipush -1
      // 0b: istore 4
      // 0d: invokestatic OpaquePredicate.c ()I
      // 10: bipush -1
      // 11: istore 5
      // 13: istore 3
      // 14: iload 1
      // 15: iload 3
      // 16: ifne 55
      // 19: ifeq 4d
      // 1c: goto 23
      // 1f: invokestatic xe9.a (Loov;)Loov;
      // 22: athrow
      // 23: iload 2
      // 24: iload 3
      // 25: ifne 3c
      // 28: goto 2f
      // 2b: invokestatic xe9.a (Loov;)Loov;
      // 2e: athrow
      // 2f: ifeq 3f
      // 32: goto 39
      // 35: invokestatic xe9.a (Loov;)Loov;
      // 38: athrow
      // 39: sipush 9987
      // 3c: goto 42
      // 3f: sipush 9729
      // 42: istore 4
      // 44: sipush 9729
      // 47: istore 5
      // 49: iload 3
      // 4a: ifeq 73
      // 4d: iload 2
      // 4e: goto 55
      // 51: invokestatic xe9.a (Loov;)Loov;
      // 54: athrow
      // 55: iload 3
      // 56: ifne 66
      // 59: ifeq 69
      // 5c: goto 63
      // 5f: invokestatic xe9.a (Loov;)Loov;
      // 62: athrow
      // 63: sipush 9986
      // 66: goto 6c
      // 69: sipush 9728
      // 6c: istore 4
      // 6e: sipush 9728
      // 71: istore 5
      // 73: aload 0
      // 74: invokevirtual xe9.getGlTextureId ()I
      // 77: invokestatic hzu.t30 (I)V
      // 7a: sipush 3553
      // 7d: sipush 10241
      // 80: iload 4
      // 82: invokestatic org/lwjgl/opengl/GL11.glTexParameteri (III)V
      // 85: sipush 3553
      // 88: sipush 10240
      // 8b: iload 5
      // 8d: invokestatic org/lwjgl/opengl/GL11.glTexParameteri (III)V
      // 90: return
   }

   @Override
   public void setBlurMipmap(boolean var1, boolean var2) {
      this.y2n = this.dms;
      this.ywm = this.s4p;
      this.l16(var1, var2);
   }

   @Override
   public void restoreLastBlurMipmap() {
      this.l16(this.y2n, this.ywm);
   }

   @Override
   public int getGlTextureId() {
      try {
         if (this._6o == -1) {
            this._6o = p9t.gi2();
         }
      } catch (oov var1) {
         throw a(var1);
      }

      return this._6o;
   }

   public void wo5() {
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
      // 05: aload 0
      // 06: getfield xe9._6o I
      // 09: invokestatic net/optifine/shaders/ShadersTex.deleteTextures (Lxe9;I)V
      // 0c: aload 0
      // 0d: getfield xe9._6o I
      // 10: iload 1
      // 11: ifeq 2a
      // 14: bipush -1
      // 15: if_icmpeq 32
      // 18: goto 1f
      // 1b: invokestatic xe9.a (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 0
      // 20: getfield xe9._6o I
      // 23: goto 2a
      // 26: invokestatic xe9.a (Loov;)Loov;
      // 29: athrow
      // 2a: invokestatic p9t.d23 (I)V
      // 2d: aload 0
      // 2e: bipush -1
      // 2f: putfield xe9._6o I
      // 32: return
   }

   @Override
   public MultiTexID getMultiTexID() {
      return ShadersTex.getMultiTexID(this);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
