import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;
import us.myles.ViaVersion.api.ViaAPI;
import us.myles.ViaVersion.api.ViaVersionConfig;
import us.myles.ViaVersion.api.command.ViaCommandSender;
import us.myles.ViaVersion.api.configuration.ConfigurationProvider;
import us.myles.ViaVersion.api.platform.TaskId;
import us.myles.ViaVersion.api.platform.ViaConnectionManager;
import us.myles.ViaVersion.api.platform.ViaPlatform;
import us.myles.viaversion.libs.bungeecordchat.api.chat.TextComponent;
import us.myles.viaversion.libs.bungeecordchat.chat.ComponentSerializer;
import us.myles.viaversion.libs.gson.JsonObject;

public class uqt implements ViaPlatform {
   private final Logger x6m;
   private final i2n ul7;
   private final File vpy;
   private final ViaConnectionManager b7q;
   private final ViaAPI ggl;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public uqt() {
      long var1 = a ^ 22673170195105L;
      super();
      this.x6m = new _h2(LogManager.getLogger(a<"r">(29467, 1230699818437439404L ^ var1)));
      Path var3 = Minecraft.vz1().glh.toPath().resolve(a<"r">(24027, 6379259445524480367L ^ var1));
      this.ul7 = new i2n(var3.resolve(a<"r">(14040, 4972202796911667822L ^ var1)).toFile());
      this.vpy = var3.toFile();
      this.b7q = new kle();
      this.ggl = new n06();
   }

   public static vr1 l1p() {
      try {
         if (!Minecraft.vz1().y8_()) {
            return null;
         }
      } catch (CancellationException var0) {
         throw a(var0);
      }

      return vr1._0v();
   }

   public Logger getLogger() {
      return this.x6m;
   }

   public String getPlatformName() {
      long var1 = a ^ 28255638385635L;
      return a<"r">(15282, 1721822622873728576L ^ var1);
   }

   public String getPlatformVersion() {
      return uy1.csg();
   }

   public String getPluginVersion() {
      long var1 = a ^ 106746931362064L;
      return a<"r">(11093, 4566621715476343889L ^ var1);
   }

   public TaskId runAsync(Runnable var1) {
      return new khh(CompletableFuture.runAsync(var1, uy1.om1).exceptionally(uqt::u7c));
   }

   public TaskId runSync(Runnable var1) {
      try {
         if (l1p() != null) {
            return this.xwj(var1);
         }
      } catch (CancellationException var2) {
         throw a(var2);
      }

      return this.zqm(var1);
   }

   private TaskId xwj(Runnable var1) {
      return new khh(CompletableFuture.runAsync(var1, uqt::ykv));
   }

   private TaskId zqm(Runnable var1) {
      return new khh(uy1.br4.submit(var1).addListener(this.q8q()));
   }

   public TaskId runSync(Runnable var1, Long var2) {
      return new khh(uy1.br4.schedule(this::o4b, var2 * 50L, TimeUnit.MILLISECONDS).addListener(this.q8q()));
   }

   public TaskId runRepeatingSync(Runnable var1, Long var2) {
      return new khh(uy1.br4.scheduleAtFixedRate(this::t4d, 0L, var2 * 50L, TimeUnit.MILLISECONDS).addListener(this.q8q()));
   }

   private GenericFutureListener q8q() {
      return uqt::n3j;
   }

   public void cancelTask(TaskId param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: instanceof khh
      // 08: iload 2
      // 09: ifne 2a
      // 0c: ifeq 2b
      // 0f: goto 16
      // 12: invokestatic uqt.a (Ljava/util/concurrent/CancellationException;)Ljava/util/concurrent/CancellationException;
      // 15: athrow
      // 16: aload 1
      // 17: checkcast khh
      // 1a: invokevirtual khh.getObject ()Ljava/util/concurrent/Future;
      // 1d: bipush 0
      // 1e: invokeinterface java/util/concurrent/Future.cancel (Z)Z 2
      // 23: goto 2a
      // 26: invokestatic uqt.a (Ljava/util/concurrent/CancellationException;)Ljava/util/concurrent/CancellationException;
      // 29: athrow
      // 2a: pop
      // 2b: return
   }

   public ViaCommandSender[] getOnlinePlayers() {
      return new ViaCommandSender[0];
   }

   public void sendMessage(UUID var1, String var2) {
   }

   public boolean kickPlayer(UUID var1, String var2) {
      return this.lqz(var1, var2);
   }

   private boolean lqz(UUID var1, String var2) {
      return false;
   }

   public boolean isPluginEnabled() {
      return true;
   }

   public ViaAPI getApi() {
      return this.ggl;
   }

   public ViaVersionConfig getConf() {
      return this.ul7;
   }

   public ConfigurationProvider getConfigurationProvider() {
      return this.ul7;
   }

   public File getDataFolder() {
      return this.vpy;
   }

   public void onReload() {
   }

   public JsonObject getDump() {
      return new JsonObject();
   }

   public boolean isOldClientsAllowed() {
      return true;
   }

   public ViaConnectionManager getConnectionManager() {
      return this.b7q;
   }

   private String gb5(String var1) {
      return ComponentSerializer.toString(TextComponent.fromLegacyText(var1));
   }

   private static void n3j(Future param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 20
      // 09: invokeinterface io/netty/util/concurrent/Future.isCancelled ()Z 1
      // 0e: ifne 43
      // 11: goto 18
      // 14: invokestatic uqt.a (Ljava/util/concurrent/CancellationException;)Ljava/util/concurrent/CancellationException;
      // 17: athrow
      // 18: aload 0
      // 19: goto 20
      // 1c: invokestatic uqt.a (Ljava/util/concurrent/CancellationException;)Ljava/util/concurrent/CancellationException;
      // 1f: athrow
      // 20: invokeinterface io/netty/util/concurrent/Future.cause ()Ljava/lang/Throwable; 1
      // 25: iload 1
      // 26: ifne 40
      // 29: ifnull 43
      // 2c: goto 33
      // 2f: invokestatic uqt.a (Ljava/util/concurrent/CancellationException;)Ljava/util/concurrent/CancellationException;
      // 32: athrow
      // 33: aload 0
      // 34: invokeinterface io/netty/util/concurrent/Future.cause ()Ljava/lang/Throwable; 1
      // 39: goto 40
      // 3c: invokestatic uqt.a (Ljava/util/concurrent/CancellationException;)Ljava/util/concurrent/CancellationException;
      // 3f: athrow
      // 40: invokevirtual java/lang/Throwable.printStackTrace ()V
      // 43: return
   }

   private void t4d(Runnable var1) {
      this.runSync(var1);
   }

   private TaskId o4b(Runnable var1) {
      return this.runSync(var1);
   }

   private static void ykv(Runnable var0) {
      l1p().mak(uqt::hef);
   }

   private static Void hef(Runnable var0) {
      var0.run();
      return null;
   }

   private static Void u7c(Throwable param0) {
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
      // 05: iload 1
      // 06: ifeq 1e
      // 09: instanceof java/util/concurrent/CancellationException
      // 0c: ifne 21
      // 0f: goto 16
      // 12: invokestatic uqt.a (Ljava/util/concurrent/CancellationException;)Ljava/util/concurrent/CancellationException;
      // 15: athrow
      // 16: aload 0
      // 17: goto 1e
      // 1a: invokestatic uqt.a (Ljava/util/concurrent/CancellationException;)Ljava/util/concurrent/CancellationException;
      // 1d: athrow
      // 1e: invokevirtual java/lang/Throwable.printStackTrace ()V
      // 21: aconst_null
      // 22: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(5122101349481533332L, 7765438161123041539L, MethodHandles.lookup().lookupClass()).a(39534598323854L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 53044071973280L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[5];
      int var7 = 0;
      String var6 = "P\u009d\u0018Öf\u000f\u0005(Ô¢UWá\u0096âM\u0086¨\u0005Ø<¸ó.\u0010'\u0014ÏÌ\u00ad\u001f\u0016\u0084:[%©b1U\u0010\u0018Øú!Ä\u0013:ª]b\u0017Ã03\\\u008e\u0092_Ð\u0083ü\\ó\u0014h";
      int var8 = "P\u009d\u0018Öf\u000f\u0005(Ô¢UWá\u0096âM\u0086¨\u0005Ø<¸ó.\u0010'\u0014ÏÌ\u00ad\u001f\u0016\u0084:[%©b1U\u0010\u0018Øú!Ä\u0013:ª]b\u0017Ã03\\\u008e\u0092_Ð\u0083ü\\ó\u0014h"
         .length();
      char var5 = 24;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     b = var9;
                     c = new String[5];
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var20;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "ùµ\u0085\u0083Øö4ã,I\u000e\u009b\u0006\u0018Éý\u0086VýÙ\bÄOl \u0017@vË0\u008d\u0001-2\u0014\u0087\u0085VBrR¹o»\u0005¾Ô\u0000_\u008fHV¥\u0081\r\u0017\u0085";
                  var8 = "ùµ\u0085\u0083Øö4ã,I\u000e\u009b\u0006\u0018Éý\u0086VýÙ\bÄOl \u0017@vË0\u008d\u0001-2\u0014\u0087\u0085VBrR¹o»\u0005¾Ô\u0000_\u008fHV¥\u0081\r\u0017\u0085"
                     .length();
                  var5 = 24;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static CancellationException a(CancellationException var0) {
      return var0;
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 79;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("uqt", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("uqt" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
