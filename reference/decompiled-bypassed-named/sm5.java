import net.optifine.shaders.MultiTexID;

public interface sm5 {
   void setBlurMipmap(boolean var1, boolean var2);

   void restoreLastBlurMipmap();

   void loadTexture(y99 var1);

   int getGlTextureId();

   MultiTexID getMultiTexID();
}
