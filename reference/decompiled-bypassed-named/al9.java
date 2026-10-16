import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

public class al9 {
   private static final sjk oha = new al9$oge(null);
   private static final sjk qbz = new al9$tup(-1, true);
   private static final sjk xnl = new al9$tup(1, true);
   private static final sjk ss1 = new al9$tup(1, false);
   public static final sjk _du = new al9$1();
   private final eqe odk;
   private final List b4i = Lists.newArrayList();
   private wra m71 = new y_0();
   private int wnu = -1;
   private int _oh;

   public al9(eqe var1) {
      this.odk = var1;
   }

   public sjk i37(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: iload 1
      // 05: aload 0
      // 06: getfield al9._oh I
      // 09: bipush 6
      // 0b: imul
      // 0c: iadd
      // 0d: istore 3
      // 0e: aload 0
      // 0f: getfield al9._oh I
      // 12: iload 2
      // 13: ifne 41
      // 16: ifle 40
      // 19: goto 20
      // 1c: invokestatic al9.a (Loov;)Loov;
      // 1f: athrow
      // 20: iload 1
      // 21: iload 2
      // 22: ifne 41
      // 25: goto 2c
      // 28: invokestatic al9.a (Loov;)Loov;
      // 2b: athrow
      // 2c: ifne 40
      // 2f: goto 36
      // 32: invokestatic al9.a (Loov;)Loov;
      // 35: athrow
      // 36: getstatic al9.qbz Lsjk;
      // 39: goto d8
      // 3c: invokestatic al9.a (Loov;)Loov;
      // 3f: athrow
      // 40: iload 1
      // 41: bipush 7
      // 43: iload 2
      // 44: ifne 88
      // 47: if_icmpne 7a
      // 4a: goto 51
      // 4d: invokestatic al9.a (Loov;)Loov;
      // 50: athrow
      // 51: iload 3
      // 52: aload 0
      // 53: getfield al9.m71 Lwra;
      // 56: invokeinterface wra._ec ()Ljava/util/List; 1
      // 5b: invokeinterface java/util/List.size ()I 1
      // 60: if_icmpge 74
      // 63: goto 6a
      // 66: invokestatic al9.a (Loov;)Loov;
      // 69: athrow
      // 6a: getstatic al9.xnl Lsjk;
      // 6d: goto d8
      // 70: invokestatic al9.a (Loov;)Loov;
      // 73: athrow
      // 74: getstatic al9.ss1 Lsjk;
      // 77: goto d8
      // 7a: iload 1
      // 7b: iload 2
      // 7c: ifne 96
      // 7f: bipush 8
      // 81: goto 88
      // 84: invokestatic al9.a (Loov;)Loov;
      // 87: athrow
      // 88: if_icmpne 95
      // 8b: getstatic al9.oha Lsjk;
      // 8e: goto d8
      // 91: invokestatic al9.a (Loov;)Loov;
      // 94: athrow
      // 95: iload 3
      // 96: iload 2
      // 97: ifne a5
      // 9a: iflt d5
      // 9d: goto a4
      // a0: invokestatic al9.a (Loov;)Loov;
      // a3: athrow
      // a4: iload 3
      // a5: aload 0
      // a6: getfield al9.m71 Lwra;
      // a9: invokeinterface wra._ec ()Ljava/util/List; 1
      // ae: invokeinterface java/util/List.size ()I 1
      // b3: if_icmpge d5
      // b6: aload 0
      // b7: getfield al9.m71 Lwra;
      // ba: invokeinterface wra._ec ()Ljava/util/List; 1
      // bf: iload 3
      // c0: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // c5: getstatic al9._du Lsjk;
      // c8: invokestatic com/google/common/base/Objects.firstNonNull (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // cb: checkcast sjk
      // ce: goto d8
      // d1: invokestatic al9.a (Loov;)Loov;
      // d4: athrow
      // d5: getstatic al9._du Lsjk;
      // d8: areturn
   }

   public List xal() {
      ArrayList var2 = Lists.newArrayList();
      int var10000 = OpaquePredicate.b();
      int var3 = 0;
      int var1 = var10000;

      while (true) {
         if (var3 <= 8) {
            try {
               var5 = var2;
               if (var1 == 0) {
                  break;
               }

               var2.add(this.i37(var3));
               var3++;
               if (var1 != 0) {
                  continue;
               }
            } catch (oov var4) {
               throw a(var4);
            }
         }

         var5 = var2;
         break;
      }

      return var5;
   }

   public sjk by8() {
      return this.i37(this.wnu);
   }

   public wra sr4() {
      return this.m71;
   }

   public void o4o(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 1
      // 06: invokevirtual al9.i37 (I)Lsjk;
      // 09: astore 3
      // 0a: aload 3
      // 0b: getstatic al9._du Lsjk;
      // 0e: if_acmpeq 64
      // 11: aload 0
      // 12: iload 2
      // 13: ifeq 60
      // 16: goto 1d
      // 19: invokestatic al9.a (Loov;)Loov;
      // 1c: athrow
      // 1d: getfield al9.wnu I
      // 20: iload 1
      // 21: if_icmpne 58
      // 24: goto 2b
      // 27: invokestatic al9.a (Loov;)Loov;
      // 2a: athrow
      // 2b: aload 3
      // 2c: iload 2
      // 2d: ifeq 4e
      // 30: goto 37
      // 33: invokestatic al9.a (Loov;)Loov;
      // 36: athrow
      // 37: invokeinterface sjk.v4p ()Z 1
      // 3c: ifeq 58
      // 3f: goto 46
      // 42: invokestatic al9.a (Loov;)Loov;
      // 45: athrow
      // 46: aload 3
      // 47: goto 4e
      // 4a: invokestatic al9.a (Loov;)Loov;
      // 4d: athrow
      // 4e: aload 0
      // 4f: invokeinterface sjk.z9x (Lal9;)V 2
      // 54: iload 2
      // 55: ifne 64
      // 58: aload 0
      // 59: goto 60
      // 5c: invokestatic al9.a (Loov;)Loov;
      // 5f: athrow
      // 60: iload 1
      // 61: putfield al9.wnu I
      // 64: return
   }

   public void kh4() {
      this.odk.b67(this);
   }

   public int q_4() {
      return this.wnu;
   }

   public void rg3(wra var1) {
      this.b4i.add(this.zrh());
      this.m71 = var1;
      this.wnu = -1;
      this._oh = 0;
   }

   public h61 zrh() {
      return new h61(this.m71, this.xal(), this.wnu);
   }

   public static int f23(al9 var0, int var1) {
      return var0._oh = var1;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
