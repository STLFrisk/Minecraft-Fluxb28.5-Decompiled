import io.netty.channel.Channel;
import today.flux.irc.client.event.IRCListener;
import today.flux.irc.client.network.ClientNetwork;
import today.flux.irc.protocol.packet.LoggedPacket;

public class Session implements IRCListener {
   public static boolean wpz;
   public static final Long qgn = -1L;
   public static Session v16;
   public ClientNetwork yjm;
   public LoggedPacket dbd;
   public Channel cuv;
   public String _t9;
   public String lhk;
   public q6h jb3 = new q6h();

   public Session(String var1, String var2) {
      this._t9 = var1;
      this.lhk = var2;
      this.lz_();
   }

   public native void lz_();

   public native void onCommandEvent(String var1);

   public native void onLoggedEvent(LoggedPacket var1);

   public native void onReceivedMessage(String var1, String var2, String var3);

   public native void onSuccessfulSendMessageEvent();

   public native void d7q(String var1);

   public ClientNetwork qr2() {
      return this.yjm;
   }

   static {
      NativeLoader.verifyIntegrity(6);
   }
}
