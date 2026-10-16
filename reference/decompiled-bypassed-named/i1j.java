import com.google.common.collect.Lists;
import java.util.List;

public class i1j extends dxd {
   private final List yxd = Lists.newArrayList();

   public i1j(Minecraft var1, int var2, int var3, int var4, int var5, int var6, moh$_ru[] var7) {
      super(var1, var2, var3, var4, var5, var6);
      this.n05 = false;
      int var10000 = OpaquePredicate.b();
      byte var9 = 0;
      int var8 = var10000;

      while (var9 < var7.length) {
         moh$_ru var10 = var7[var9];

         label24: {
            try {
               if (var9 < var7.length - 1) {
                  var15 = var7[var9 + 1];
                  break label24;
               }
            } catch (oov var14) {
               throw c(var14);
            }

            var15 = null;
         }

         moh$_ru var11 = var15;
         gt4 var12 = this.zs5(var1, var2 / 2 - 155, 0, var10);
         gt4 var13 = this.zs5(var1, var2 / 2 - 155 + 160, 0, var11);
         this.yxd.add(new i1j$t8b(var12, var13));
         var9 += 2;
         if (var8 == 0) {
            break;
         }
      }
   }

   private gt4 zs5(Minecraft param1, int param2, int param3, moh$_ru param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 5
      // 05: aload 4
      // 07: iload 5
      // 09: ifeq 1e
      // 0c: ifnonnull 1c
      // 0f: goto 16
      // 12: invokestatic i1j.c (Loov;)Loov;
      // 15: athrow
      // 16: aconst_null
      // 17: areturn
      // 18: invokestatic i1j.c (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 4
      // 1e: invokevirtual moh$_ru.ehz ()I
      // 21: istore 6
      // 23: aload 4
      // 25: invokevirtual moh$_ru.on0 ()Z
      // 28: ifeq 3f
      // 2b: new kkh
      // 2e: dup
      // 2f: iload 6
      // 31: iload 2
      // 32: iload 3
      // 33: aload 4
      // 35: invokespecial kkh.<init> (IIILmoh$_ru;)V
      // 38: goto 55
      // 3b: invokestatic i1j.c (Loov;)Loov;
      // 3e: athrow
      // 3f: new cm_
      // 42: dup
      // 43: iload 6
      // 45: iload 2
      // 46: iload 3
      // 47: aload 4
      // 49: aload 1
      // 4a: getfield Minecraft.oxn Lmoh;
      // 4d: aload 4
      // 4f: invokevirtual moh.ycx (Lmoh$_ru;)Ljava/lang/String;
      // 52: invokespecial cm_.<init> (IIILmoh$_ru;Ljava/lang/String;)V
      // 55: areturn
   }

   public i1j$t8b jb4(int var1) {
      return (i1j$t8b)this.yxd.get(var1);
   }

   @Override
   public int getSize() {
      return this.yxd.size();
   }

   @Override
   public int getListWidth() {
      return 400;
   }

   @Override
   public int getScrollBarX() {
      return super.getScrollBarX() + 32;
   }

   @Override
   public dxd$v9l jb4(int var1) {
      return this.jb4(var1);
   }

   private static oov c(oov var0) {
      return var0;
   }
}
