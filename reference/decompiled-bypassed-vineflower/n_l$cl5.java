import us.myles.ViaVersion.api.protocol.ProtocolVersion;

public class n_l$cl5 extends ed7 {
   public final n_l asg;

   public n_l$cl5(n_l var1, c05 var2, int var3, int var4, int var5, int var6, int var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.asg = var1;
   }

   @Override
   public int getSize() {
      return sot.pem().size();
   }

   @Override
   public void elementClicked(int var1, boolean var2, int var3, int var4) {
      n_l.wvk(var1, true);
   }

   @Override
   public boolean isSelected(int var1) {
      return false;
   }

   @Override
   public void drawBackground() {
      this.asg.xmz();
   }

   @Override
   public void drawSlot(int var1, int var2, int var3, int var4, int var5, int var6) {
      cyb var10000;
      StringBuilder var10001;
      String var10002;
      label16: {
         try {
            var10000 = jsr.yk7;
            var10001 = new StringBuilder();
            if (uy1.al8 == ((ProtocolVersion)sot.pem().get(var1)).getVersion()) {
               var10002 = syo.qjc.toString();
               break label16;
            }
         } catch (oov var7) {
            throw a(var7);
         }

         var10002 = syo.id3.toString();
      }

      var10000.lt2(
         var10001.append(var10002).append(a2d.sb9(((ProtocolVersion)sot.pem().get(var1)).getVersion())).toString(),
         (float)(this.wde / 2),
         (float)(var3 + 2),
         -1
      );
   }

   private static oov a(oov var0) {
      return var0;
   }
}
