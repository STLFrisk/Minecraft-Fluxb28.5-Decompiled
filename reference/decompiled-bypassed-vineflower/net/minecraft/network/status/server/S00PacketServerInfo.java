package net.minecraft.network.status.server;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class S00PacketServerInfo implements mz2 {
   private static final Gson dq_ = new GsonBuilder()
      .registerTypeAdapter(zuz$hr7.class, new zuz$hr7$o3u())
      .registerTypeAdapter(zuz$fkd.class, new zuz$fkd$rz1())
      .registerTypeAdapter(zuz.class, new zuz$sy1())
      .registerTypeHierarchyAdapter(ekw.class, new ekw$szt())
      .registerTypeHierarchyAdapter(poy.class, new poy$vcg())
      .registerTypeAdapterFactory(new lhs())
      .create();
   private zuz _zg;

   public S00PacketServerInfo() {
   }

   public S00PacketServerInfo(zuz var1) {
      this._zg = var1;
   }

   @Override
   public void ajj(nfj var1) {
      String var2 = S01PacketPong.b();

      try {
         this._zg = (zuz)dq_.fromJson(var1.oa5(32767), zuz.class);
         if (var2 == null) {
            i2h.b(new i2h[4]);
         }
      } catch (oov var3) {
         throw a(var3);
      }
   }

   @Override
   public void ddd(nfj var1) {
      var1.p3z(dq_.toJson(this._zg));
   }

   public void hir(pmi var1) {
      var1.e8v(this);
   }

   public zuz vni() {
      return this._zg;
   }

   @Override
   public void ito(yw3 var1) {
      this.hir((pmi)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
