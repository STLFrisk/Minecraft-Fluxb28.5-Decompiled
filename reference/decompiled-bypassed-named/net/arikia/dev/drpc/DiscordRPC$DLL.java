package net.arikia.dev.drpc;

import com.sun.jna.Library;
import com.sun.jna.Native;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public interface DiscordRPC$DLL extends Library {
   DiscordRPC$DLL INSTANCE;

   void Discord_Initialize(String var1, DiscordEventHandlers var2, int var3, String var4);

   void Discord_Register(String var1, String var2);

   void Discord_RegisterSteamGame(String var1, String var2);

   void Discord_UpdateHandlers(DiscordEventHandlers var1);

   void Discord_Shutdown();

   void Discord_RunCallbacks();

   void Discord_UpdatePresence(DiscordRichPresence var1);

   void Discord_ClearPresence();

   void Discord_Respond(String var1, int var2);

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8569068111890305246L, 2158723596669263922L, MethodHandles.lookup().lookupClass()).a(6997624572876L);
      // $VF: monitorexit
      long var4 = var10000 ^ 16458624543820L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("\u009f;B¼\u0093\u00adY¢cÍT\u0080]\u0083vD".getBytes("ISO-8859-1"));
      String var7 = a(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      INSTANCE = (DiscordRPC$DLL)Native.loadLibrary(var0, DiscordRPC$DLL.class);
   }

   private static String a(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for (int var4 = 0; var4 < var2; var4++) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else if (var5 < 224) {
            char var6 = (char)((char)(var5 & 31) << 6);
            byte var8 = var0[++var4];
            var6 = (char)(var6 | (char)(var8 & 63));
            var3[var1++] = var6;
         } else if (var4 < var2 - 2) {
            char var12 = (char)((char)(var5 & 15) << '\f');
            byte var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63) << 6);
            var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63));
            var3[var1++] = var12;
         }
      }

      return new String(var3, 0, var1);
   }
}
