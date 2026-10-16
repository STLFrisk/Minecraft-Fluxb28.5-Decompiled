import com.google.common.base.Predicate;
import java.util.List;
import java.util.Random;

public class tkg extends tts {
   public tkg(OpaquePredicate var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   @Override
   public boolean bkm(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: iload 1
      // 05: aload 0
      // 06: getfield tkg.nzx I
      // 09: iload 3
      // 0a: ifne 2e
      // 0d: if_icmpne 35
      // 10: goto 17
      // 13: invokestatic tkg.a (Loov;)Loov;
      // 16: athrow
      // 17: iload 2
      // 18: iload 3
      // 19: ifne 32
      // 1c: goto 23
      // 1f: invokestatic tkg.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 0
      // 24: getfield tkg.yxl I
      // 27: goto 2e
      // 2a: invokestatic tkg.a (Loov;)Loov;
      // 2d: athrow
      // 2e: if_icmpne 35
      // 31: bipush 1
      // 32: goto 36
      // 35: bipush 0
      // 36: ireturn
   }

   @Override
   public int d0r(int var1, int var2) {
      return 0;
   }

   @Override
   public void z0v() {
   }

   @Override
   public void vm4() {
   }

   @Override
   public e0x mgt(mew var1) {
      return ox_.ibw;
   }

   @Override
   public int pzx(mew var1) {
      return 255;
   }

   @Override
   public int rqu(mew var1) {
      return 0;
   }

   @Override
   public int uje(qe5 var1, mew var2) {
      return var1.de2;
   }

   @Override
   public void yo9(qe5 var1, mew var2, int var3) {
   }

   @Override
   public int w6m(mew var1, int var2) {
      return 0;
   }

   @Override
   public void _3_(EntityLivingBase var1) {
   }

   @Override
   public void v13(EntityLivingBase var1) {
   }

   @Override
   public void o0h(EntityLivingBase var1, int var2) {
   }

   @Override
   public boolean om1(mew var1) {
      return false;
   }

   @Override
   public pyk y58(mew var1, tts$cl0 var2) {
      return null;
   }

   @Override
   public void k7k(pyk var1) {
   }

   @Override
   public void pus(mew var1, pyk var2) {
   }

   @Override
   public void aoo(mew var1) {
   }

   @Override
   public void uvo() {
   }

   @Override
   public void lg_() {
   }

   @Override
   public void j0q() {
   }

   @Override
   public void ett(EntityLivingBase var1, nh4 var2, List var3, Predicate var4) {
   }

   @Override
   public void gtg(Class var1, nh4 var2, List var3, Predicate var4) {
   }

   @Override
   public boolean rmi(boolean var1) {
      return false;
   }

   @Override
   public Random r3x(long var1) {
      return new Random(
         this.v8m().x2p()
               + (long)(this.nzx * this.nzx * 4987142)
               + (long)(this.nzx * 5947611)
               + (long)(this.yxl * this.yxl) * 4392871L
               + (long)(this.yxl * 389711)
            ^ var1
      );
   }

   @Override
   public boolean col() {
      return true;
   }

   @Override
   public boolean sal(int var1, int var2) {
      return true;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
