import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;

public final class kr3$2 implements ProfileLookupCallback {
   public final GameProfile[] ja6;

   public kr3$2(GameProfile[] var1) {
      this.ja6 = var1;
   }

   public void onProfileLookupSucceeded(GameProfile var1) {
      this.ja6[0] = var1;
   }

   public void onProfileLookupFailed(GameProfile var1, Exception var2) {
      this.ja6[0] = null;
   }
}
