import java.lang.invoke.MethodHandles;

public class jwq extends vef {
   public jwq(int var1, gdz var2, int var3, bn1 var4) {
      super(var1, var2, var3, var4);
      if (var4 == bn1.q92) {
         this.wr5("lootBonusDigger");
      } else {
         try {
            if (var4 == bn1.eed) {
               this.wr5("lootBonusFishing");
               return;
            }
         } catch (oov var5) {
            throw a(var5);
         }

         this.wr5("lootBonus");
      }
   }

   @Override
   public int qwk(int var1) {
      return 15 + (var1 - 1) * 9;
   }

   @Override
   public int fnu(int var1) {
      return super.qwk(var1) + 50;
   }

   @Override
   public int ehp() {
      return 3;
   }

   @Override
   public boolean yhx(vef param1) {
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
      // 05: aload 1
      // 06: invokespecial vef.yhx (Lvef;)Z
      // 09: iload 2
      // 0a: ifne 22
      // 0d: ifeq 41
      // 10: goto 17
      // 13: invokestatic jwq.a (Loov;)Loov;
      // 16: athrow
      // 17: aload 1
      // 18: getfield vef.bbf I
      // 1b: goto 22
      // 1e: invokestatic jwq.a (Loov;)Loov;
      // 21: athrow
      // 22: iload 2
      // 23: ifne 3e
      // 26: getstatic jwq.w9s Lvef;
      // 29: getfield vef.bbf I
      // 2c: if_icmpeq 41
      // 2f: goto 36
      // 32: invokestatic jwq.a (Loov;)Loov;
      // 35: athrow
      // 36: bipush 1
      // 37: goto 3e
      // 3a: invokestatic jwq.a (Loov;)Loov;
      // 3d: athrow
      // 3e: goto 42
      // 41: bipush 0
      // 42: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      c.a(-7334851166581855705L, 4027797731877195493L, MethodHandles.lookup().lookupClass()).a(100284232224642L);
      // $VF: monitorexit
   }

   private static oov a(oov var0) {
      return var0;
   }
}
