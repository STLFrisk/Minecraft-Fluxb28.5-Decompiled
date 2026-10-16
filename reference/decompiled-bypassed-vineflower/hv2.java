import com.mojang.authlib.GameProfile;
import net.minecraft.network.play.server.S38PacketPlayerListItem$b1f;

public class hv2 {
   private GameProfile rzc;
   private h50$f05 cmk;
   private int w8b;
   public boolean gcf = false;
   public gdz lko;
   private gdz inc;
   private String id8;
   private ekw cob;
   private int vou = 0;
   private int vvs = 0;
   private long l9_ = 0L;
   private long vjl = 0L;
   private long sbk = 0L;

   public hv2(GameProfile var1) {
      this.rzc = var1;
   }

   public hv2(S38PacketPlayerListItem$b1f var1) {
      this.rzc = var1.duk();
      this.cmk = var1.izc();
      this.w8b = var1.pst();
      this.cob = var1.bek();
   }

   public GameProfile pbs() {
      return this.rzc;
   }

   public void xdk(GameProfile var1) {
      this.rzc = var1;
   }

   public h50$f05 j3n() {
      return this.cmk;
   }

   public int n6d() {
      return this.w8b;
   }

   public void ivv(h50$f05 var1) {
      this.cmk = var1;
   }

   public void n_6(int var1) {
      this.w8b = var1;
   }

   public boolean h8i() {
      try {
         if (this.lko != null) {
            return true;
         }
      } catch (oov var1) {
         throw a(var1);
      }

      return false;
   }

   public String nxr() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 28
      // 09: getfield hv2.id8 Ljava/lang/String;
      // 0c: ifnonnull 27
      // 0f: goto 16
      // 12: invokestatic hv2.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield hv2.rzc Lcom/mojang/authlib/GameProfile;
      // 1a: invokevirtual com/mojang/authlib/GameProfile.getId ()Ljava/util/UUID;
      // 1d: invokestatic wip.nq_ (Ljava/util/UUID;)Ljava/lang/String;
      // 20: goto 2b
      // 23: invokestatic hv2.a (Loov;)Loov;
      // 26: athrow
      // 27: aload 0
      // 28: getfield hv2.id8 Ljava/lang/String;
      // 2b: areturn
   }

   public gdz dq7() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield hv2.lko Lgdz;
      // 08: iload 1
      // 09: ifne 35
      // 0c: ifnonnull 21
      // 0f: goto 16
      // 12: invokestatic hv2.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: invokevirtual hv2.n3d ()V
      // 1a: goto 21
      // 1d: invokestatic hv2.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 0
      // 22: getfield hv2.lko Lgdz;
      // 25: aload 0
      // 26: getfield hv2.rzc Lcom/mojang/authlib/GameProfile;
      // 29: invokevirtual com/mojang/authlib/GameProfile.getId ()Ljava/util/UUID;
      // 2c: invokestatic wip.lnt (Ljava/util/UUID;)Lgdz;
      // 2f: invokestatic com/google/common/base/Objects.firstNonNull (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 32: checkcast gdz
      // 35: areturn
   }

   public gdz eu7() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield hv2.inc Lgdz;
      // 08: iload 1
      // 09: ifne 25
      // 0c: ifnonnull 21
      // 0f: goto 16
      // 12: invokestatic hv2.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: invokevirtual hv2.n3d ()V
      // 1a: goto 21
      // 1d: invokestatic hv2.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 0
      // 22: getfield hv2.inc Lgdz;
      // 25: areturn
   }

   public q2m yym() {
      return c05.vz1().tij.fgp().zov(this.pbs().getName());
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void n3d() {
      int var1 = t9d.b();
      hv2 var2 = this;
      synchronized (this) {
         hv2 var10000 = this;
         if (var1 != 0) {
            try {
               if (!var10000.gcf) {
                  this.gcf = true;
                  c05.vz1().jsi().u0b(this.rzc, new hv2$1(this), true);
               }
            } catch (oov var4) {
               throw a(var4);
            }

            var10000 = var2;
         }

         // $VF: monitorexit
      }
   }

   public void d5f(ekw var1) {
      this.cob = var1;
   }

   public ekw zyf() {
      return this.cob;
   }

   public int pju() {
      return this.vou;
   }

   public void hpr(int var1) {
      this.vou = var1;
   }

   public int u5n() {
      return this.vvs;
   }

   public void h6e(int var1) {
      this.vvs = var1;
   }

   public long b4s() {
      return this.l9_;
   }

   public void j8d(long var1) {
      this.l9_ = var1;
   }

   public long k1_() {
      return this.vjl;
   }

   public void tpv(long var1) {
      this.vjl = var1;
   }

   public long ukp() {
      return this.sbk;
   }

   public void f9w(long var1) {
      this.sbk = var1;
   }

   public static String uh4(hv2 var0, String var1) {
      return var0.id8 = var1;
   }

   public static String and(hv2 var0) {
      return var0.id8;
   }

   public static gdz nqd(hv2 var0, gdz var1) {
      return var0.inc = var1;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
