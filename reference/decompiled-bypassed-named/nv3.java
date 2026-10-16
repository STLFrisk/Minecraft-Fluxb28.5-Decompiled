import com.google.common.collect.Lists;
import java.util.List;

public class nv3 {
   private final cdp b90;
   private long pqg;
   private yo9 syj = new yo9();
   private List hpx = Lists.newArrayList();

   public nv3(cdp var1) {
      this.b90 = var1;
   }

   public nv3$wa2 ivu(int var1, int var2) {
      var1 >>= 4;
      var2 >>= 4;
      int var10000 = OpaquePredicate.c();
      long var4 = (long)var1 & 4294967295L | ((long)var2 & 4294967295L) << 32;
      int var3 = var10000;
      nv3$wa2 var6 = (nv3$wa2)this.syj.hhm(var4);

      label20: {
         try {
            if (var3 != 0) {
               return var6;
            }

            if (var6 != null) {
               break label20;
            }
         } catch (oov var7) {
            throw a(var7);
         }

         var6 = new nv3$wa2(this, var1, var2);
         this.syj.pab(var4, var6);
         this.hpx.add(var6);
      }

      var6.ias = vr1.spw();
      return var6;
   }

   public gyu f1i(int var1, int var2, gyu var3) {
      int var4 = OpaquePredicate.b();
      gyu var5 = this.ivu(var1, var2).iyr(var1, var2);

      try {
         if (var4 == 0) {
            return var5;
         }

         if (var5 == null) {
            return var3;
         }
      } catch (oov var6) {
         throw a(var6);
      }

      return var5;
   }

   public void q35() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic vr1.spw ()J
      // 03: lstore 2
      // 04: invokestatic OpaquePredicate.b ()I
      // 07: lload 2
      // 08: aload 0
      // 09: getfield nv3.pqg J
      // 0c: lsub
      // 0d: lstore 4
      // 0f: istore 1
      // 10: lload 4
      // 12: ldc2_w 7500
      // 15: lcmp
      // 16: iload 1
      // 17: ifeq 4a
      // 1a: ifgt 3d
      // 1d: goto 24
      // 20: invokestatic nv3.a (Loov;)Loov;
      // 23: athrow
      // 24: lload 4
      // 26: lconst_0
      // 27: lcmp
      // 28: iload 1
      // 29: ifeq 4a
      // 2c: goto 33
      // 2f: invokestatic nv3.a (Loov;)Loov;
      // 32: athrow
      // 33: ifge e1
      // 36: goto 3d
      // 39: invokestatic nv3.a (Loov;)Loov;
      // 3c: athrow
      // 3d: aload 0
      // 3e: lload 2
      // 3f: putfield nv3.pqg J
      // 42: bipush 0
      // 43: goto 4a
      // 46: invokestatic nv3.a (Loov;)Loov;
      // 49: athrow
      // 4a: istore 6
      // 4c: iload 6
      // 4e: aload 0
      // 4f: getfield nv3.hpx Ljava/util/List;
      // 52: invokeinterface java/util/List.size ()I 1
      // 57: if_icmpge e1
      // 5a: aload 0
      // 5b: getfield nv3.hpx Ljava/util/List;
      // 5e: iload 6
      // 60: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 65: checkcast nv3$wa2
      // 68: astore 7
      // 6a: lload 2
      // 6b: aload 7
      // 6d: getfield nv3$wa2.ias J
      // 70: lsub
      // 71: lstore 8
      // 73: lload 8
      // 75: ldc2_w 30000
      // 78: lcmp
      // 79: iload 1
      // 7a: ifeq bb
      // 7d: ifgt a0
      // 80: goto 87
      // 83: invokestatic nv3.a (Loov;)Loov;
      // 86: athrow
      // 87: lload 8
      // 89: lconst_0
      // 8a: lcmp
      // 8b: iload 1
      // 8c: ifeq bb
      // 8f: goto 96
      // 92: invokestatic nv3.a (Loov;)Loov;
      // 95: athrow
      // 96: ifge da
      // 99: goto a0
      // 9c: invokestatic nv3.a (Loov;)Loov;
      // 9f: athrow
      // a0: aload 0
      // a1: getfield nv3.hpx Ljava/util/List;
      // a4: iload 6
      // a6: iinc 6 -1
      // a9: invokeinterface java/util/List.remove (I)Ljava/lang/Object; 2
      // ae: pop
      // af: aload 7
      // b1: getfield nv3$wa2.vwf I
      // b4: goto bb
      // b7: invokestatic nv3.a (Loov;)Loov;
      // ba: athrow
      // bb: i2l
      // bc: ldc2_w 4294967295
      // bf: land
      // c0: aload 7
      // c2: getfield nv3$wa2.i7l I
      // c5: i2l
      // c6: ldc2_w 4294967295
      // c9: land
      // ca: bipush 32
      // cc: lshl
      // cd: lor
      // ce: lstore 10
      // d0: aload 0
      // d1: getfield nv3.syj Lyo9;
      // d4: lload 10
      // d6: invokevirtual yo9.wsz (J)Ljava/lang/Object;
      // d9: pop
      // da: iinc 6 1
      // dd: iload 1
      // de: ifne 4c
      // e1: return
   }

   public gyu[] nr7(int var1, int var2) {
      return this.ivu(var1, var2).l6c;
   }

   public static cdp fp5(nv3 var0) {
      return var0.b90;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
