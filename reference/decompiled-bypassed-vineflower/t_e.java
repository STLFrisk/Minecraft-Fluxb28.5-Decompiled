import java.util.ArrayList;
import net.minecraft.network.login.server.S00PacketDisconnect;

public class t_e {
   public c05 y4a = c05.vz1();
   public ArrayList vd_ = new ArrayList();
   public q6h p12 = new q6h();
   public long gbq = 1500L;

   @jev
   public void bnm(fz2 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield t_e.y4a Lc05;
      // 08: getfield c05.vg8 Ll86;
      // 0b: getfield l86.g25 I
      // 0e: bipush 20
      // 10: irem
      // 11: iload 2
      // 12: ifeq 36
      // 15: ifne 2a
      // 18: goto 1f
      // 1b: invokestatic t_e.a (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 0
      // 20: invokevirtual t_e.wul ()V
      // 23: goto 2a
      // 26: invokestatic t_e.a (Loov;)Loov;
      // 29: athrow
      // 2a: aload 0
      // 2b: getfield t_e.p12 Lq6h;
      // 2e: aload 0
      // 2f: getfield t_e.gbq J
      // 32: l2d
      // 33: invokevirtual q6h.hqu (D)Z
      // 36: iload 2
      // 37: ifeq 7d
      // 3a: ifne 64
      // 3d: goto 44
      // 40: invokestatic t_e.a (Loov;)Loov;
      // 43: athrow
      // 44: aload 0
      // 45: getfield t_e.y4a Lc05;
      // 48: getfield c05.vg8 Ll86;
      // 4b: getfield l86.g25 I
      // 4e: iload 2
      // 4f: ifeq 7d
      // 52: goto 59
      // 55: invokestatic t_e.a (Loov;)Loov;
      // 58: athrow
      // 59: bipush 5
      // 5a: if_icmpge 84
      // 5d: goto 64
      // 60: invokestatic t_e.a (Loov;)Loov;
      // 63: athrow
      // 64: aload 0
      // 65: iload 2
      // 66: ifeq 81
      // 69: goto 70
      // 6c: invokestatic t_e.a (Loov;)Loov;
      // 6f: athrow
      // 70: getfield t_e.vd_ Ljava/util/ArrayList;
      // 73: invokevirtual java/util/ArrayList.size ()I
      // 76: goto 7d
      // 79: invokestatic t_e.a (Loov;)Loov;
      // 7c: athrow
      // 7d: ifle 84
      // 80: aload 0
      // 81: invokevirtual t_e.buy ()V
      // 84: return
   }

   public native void wul();

   public native void buy();

   @jev
   public void udi(ihr param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: invokevirtual ihr.bbi ()Lmz2;
      // 08: instanceof net/minecraft/network/play/client/C0FPacketConfirmTransaction
      // 0b: iload 2
      // 0c: ifeq 36
      // 0f: ifeq 2f
      // 12: goto 19
      // 15: invokestatic t_e.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 1
      // 1a: invokevirtual ihr.bbi ()Lmz2;
      // 1d: checkcast net/minecraft/network/play/client/C0FPacketConfirmTransaction
      // 20: astore 3
      // 21: aload 0
      // 22: getfield t_e.vd_ Ljava/util/ArrayList;
      // 25: aload 3
      // 26: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 29: pop
      // 2a: aload 1
      // 2b: bipush 1
      // 2c: invokevirtual ihr.wxi (Z)V
      // 2f: aload 1
      // 30: invokevirtual ihr.bbi ()Lmz2;
      // 33: instanceof net/minecraft/network/play/client/C00PacketKeepAlive
      // 36: iload 2
      // 37: ifeq 56
      // 3a: ifeq 5c
      // 3d: goto 44
      // 40: invokestatic t_e.a (Loov;)Loov;
      // 43: athrow
      // 44: aload 0
      // 45: getfield t_e.vd_ Ljava/util/ArrayList;
      // 48: aload 1
      // 49: invokevirtual ihr.bbi ()Lmz2;
      // 4c: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 4f: goto 56
      // 52: invokestatic t_e.a (Loov;)Loov;
      // 55: athrow
      // 56: pop
      // 57: aload 1
      // 58: bipush 1
      // 59: invokevirtual ihr.wxi (Z)V
      // 5c: return
   }

   @jev
   public void fya(wbh var1) {
      try {
         if (var1.nlg() instanceof S00PacketDisconnect) {
            this.vd_.clear();
         }
      } catch (oov var2) {
         throw a(var2);
      }
   }

   static {
      v6ma.Ex(15);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
