import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.io.File;
import java.util.Iterator;

public class kgd extends vd3 {
   public kgd(File var1) {
      super(var1);
   }

   @Override
   public syv fna(JsonObject var1) {
      return new r1u(var1);
   }

   @Override
   public String[] zim() {
      String[] var2 = new String[this.tko().size()];
      int var10000 = t9d.c();
      int var3 = 0;
      Iterator var4 = this.tko().values().iterator();
      int var1 = var10000;

      while (true) {
         if (var4.hasNext()) {
            r1u var5 = (r1u)var4.next();

            try {
               var7 = var2;
               if (var1 != 0) {
                  break;
               }

               var2[var3++] = ((GameProfile)var5.gma()).getName();
               if (var1 == 0) {
                  continue;
               }
            } catch (oov var6) {
               throw a(var6);
            }
         }

         var7 = var2;
         break;
      }

      return var7;
   }

   public String sx6(GameProfile var1) {
      return var1.getId().toString();
   }

   public GameProfile sxs(String param1) {
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
      // 05: invokevirtual kgd.tko ()Ljava/util/Map;
      // 08: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // 0d: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 12: astore 3
      // 13: aload 3
      // 14: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 19: ifeq 58
      // 1c: aload 3
      // 1d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 22: checkcast r1u
      // 25: astore 4
      // 27: aload 1
      // 28: iload 2
      // 29: ifne 50
      // 2c: aload 4
      // 2e: invokevirtual r1u.gma ()Ljava/lang/Object;
      // 31: checkcast com/mojang/authlib/GameProfile
      // 34: invokevirtual com/mojang/authlib/GameProfile.getName ()Ljava/lang/String;
      // 37: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 3a: ifeq 54
      // 3d: goto 44
      // 40: invokestatic kgd.a (Loov;)Loov;
      // 43: athrow
      // 44: aload 4
      // 46: invokevirtual r1u.gma ()Ljava/lang/Object;
      // 49: goto 50
      // 4c: invokestatic kgd.a (Loov;)Loov;
      // 4f: athrow
      // 50: checkcast com/mojang/authlib/GameProfile
      // 53: areturn
      // 54: iload 2
      // 55: ifeq 13
      // 58: aconst_null
      // 59: areturn
   }

   @Override
   public String j6t(Object var1) {
      return this.sx6((GameProfile)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
