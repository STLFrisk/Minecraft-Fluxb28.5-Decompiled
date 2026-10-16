import com.google.common.collect.Lists;
import java.util.List;

public class qpp$cv2 extends _jc {
   public List pdy;

   public qpp$cv2(ha9 var1) {
      int var10000 = t9d.c();
      this.pdy = Lists.newArrayList();
      int var2 = var10000;
      jnq var3 = var1.up_;
      int var4 = 0;

      while (true) {
         if (var4 < 5) {
            var9 = 0;
            if (var2 != 0) {
               break;
            }

            int var5 = 0;

            label50: {
               while (var5 < 9) {
                  try {
                     this.zmp(new vrx(qpp.w_1(), var4 * 9 + var5, 9 + var5 * 18, 18 + var4 * 18));
                     var5++;
                     if (var2 != 0) {
                        break label50;
                     }

                     if (var2 != 0) {
                        break;
                     }
                  } catch (oov var7) {
                     throw a(var7);
                  }
               }

               var4++;
            }

            if (var2 == 0) {
               continue;
            }
         }

         var9 = 0;
         break;
      }

      var4 = var9;

      while (true) {
         if (var4 < 9) {
            try {
               this.zmp(new vrx(var3, var4, 9 + var4 * 18, 112));
               var4++;
               if (var2 != 0) {
                  break;
               }

               if (var2 == 0) {
                  continue;
               }
            } catch (oov var6) {
               throw a(var6);
            }
         }

         this._y2(0.0F);
         break;
      }
   }

   @Override
   public boolean spj(ha9 var1) {
      return true;
   }

   public void _y2(float param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield qpp$cv2.pdy Ljava/util/List;
      // 04: invokeinterface java/util/List.size ()I 1
      // 09: bipush 9
      // 0b: iadd
      // 0c: bipush 1
      // 0d: isub
      // 0e: bipush 9
      // 10: idiv
      // 11: bipush 5
      // 12: isub
      // 13: istore 3
      // 14: invokestatic t9d.b ()I
      // 17: fload 1
      // 18: iload 3
      // 19: i2f
      // 1a: fmul
      // 1b: f2d
      // 1c: ldc2_w 0.5
      // 1f: dadd
      // 20: d2i
      // 21: istore 4
      // 23: istore 2
      // 24: iload 4
      // 26: iload 2
      // 27: ifeq 38
      // 2a: ifge 37
      // 2d: goto 34
      // 30: invokestatic qpp$cv2.a (Loov;)Loov;
      // 33: athrow
      // 34: bipush 0
      // 35: istore 4
      // 37: bipush 0
      // 38: istore 5
      // 3a: iload 5
      // 3c: bipush 5
      // 3d: if_icmpge c7
      // 40: bipush 0
      // 41: istore 6
      // 43: iload 6
      // 45: bipush 9
      // 47: if_icmpge c0
      // 4a: iload 6
      // 4c: iload 5
      // 4e: iload 4
      // 50: iadd
      // 51: bipush 9
      // 53: imul
      // 54: iadd
      // 55: istore 7
      // 57: iload 7
      // 59: iload 2
      // 5a: ifeq 3c
      // 5d: iload 2
      // 5e: ifeq 6d
      // 61: iflt a0
      // 64: goto 6b
      // 67: invokestatic qpp$cv2.a (Loov;)Loov;
      // 6a: athrow
      // 6b: iload 7
      // 6d: aload 0
      // 6e: getfield qpp$cv2.pdy Ljava/util/List;
      // 71: invokeinterface java/util/List.size ()I 1
      // 76: if_icmpge a0
      // 79: invokestatic qpp.w_1 ()Lgoq;
      // 7c: iload 6
      // 7e: iload 5
      // 80: bipush 9
      // 82: imul
      // 83: iadd
      // 84: aload 0
      // 85: getfield qpp$cv2.pdy Ljava/util/List;
      // 88: iload 7
      // 8a: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 8f: checkcast erg
      // 92: invokevirtual goq.cxl (ILerg;)V
      // 95: iload 2
      // 96: ifne b9
      // 99: goto a0
      // 9c: invokestatic qpp$cv2.a (Loov;)Loov;
      // 9f: athrow
      // a0: invokestatic qpp.w_1 ()Lgoq;
      // a3: iload 6
      // a5: iload 5
      // a7: bipush 9
      // a9: imul
      // aa: iadd
      // ab: aconst_null
      // ac: checkcast erg
      // af: invokevirtual goq.cxl (ILerg;)V
      // b2: goto b9
      // b5: invokestatic qpp$cv2.a (Loov;)Loov;
      // b8: athrow
      // b9: iinc 6 1
      // bc: iload 2
      // bd: ifne 43
      // c0: iinc 5 1
      // c3: iload 2
      // c4: ifne 3a
      // c7: return
   }

   public boolean _ns() {
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
      // 05: getfield qpp$cv2.pdy Ljava/util/List;
      // 08: invokeinterface java/util/List.size ()I 1
      // 0d: iload 1
      // 0e: ifne 25
      // 11: bipush 45
      // 13: if_icmple 28
      // 16: goto 1d
      // 19: invokestatic qpp$cv2.a (Loov;)Loov;
      // 1c: athrow
      // 1d: bipush 1
      // 1e: goto 25
      // 21: invokestatic qpp$cv2.a (Loov;)Loov;
      // 24: athrow
      // 25: goto 29
      // 28: bipush 0
      // 29: ireturn
   }

   @Override
   public void yo3(int var1, int var2, boolean var3, ha9 var4) {
   }

   @Override
   public erg za4(ha9 param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: iload 2
      // 05: aload 0
      // 06: getfield qpp$cv2.wjd Ljava/util/List;
      // 09: invokeinterface java/util/List.size ()I 1
      // 0e: bipush 9
      // 10: isub
      // 11: iload 3
      // 12: ifne 30
      // 15: if_icmplt 75
      // 18: goto 1f
      // 1b: invokestatic qpp$cv2.a (Loov;)Loov;
      // 1e: athrow
      // 1f: iload 2
      // 20: aload 0
      // 21: getfield qpp$cv2.wjd Ljava/util/List;
      // 24: invokeinterface java/util/List.size ()I 1
      // 29: goto 30
      // 2c: invokestatic qpp$cv2.a (Loov;)Loov;
      // 2f: athrow
      // 30: if_icmpge 75
      // 33: aload 0
      // 34: getfield qpp$cv2.wjd Ljava/util/List;
      // 37: iload 2
      // 38: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 3d: checkcast vrx
      // 40: astore 4
      // 42: aload 4
      // 44: iload 3
      // 45: ifne 54
      // 48: ifnull 75
      // 4b: goto 52
      // 4e: invokestatic qpp$cv2.a (Loov;)Loov;
      // 51: athrow
      // 52: aload 4
      // 54: iload 3
      // 55: ifne 6e
      // 58: invokevirtual vrx.hf8 ()Z
      // 5b: ifeq 75
      // 5e: goto 65
      // 61: invokestatic qpp$cv2.a (Loov;)Loov;
      // 64: athrow
      // 65: aload 4
      // 67: goto 6e
      // 6a: invokestatic qpp$cv2.a (Loov;)Loov;
      // 6d: athrow
      // 6e: aconst_null
      // 6f: checkcast erg
      // 72: invokevirtual vrx.yn7 (Lerg;)V
      // 75: aconst_null
      // 76: areturn
   }

   @Override
   public boolean c6n(erg param1, vrx param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: aload 2
      // 05: getfield vrx.b0m I
      // 08: iload 3
      // 09: ifne 20
      // 0c: bipush 90
      // 0e: if_icmple 23
      // 11: goto 18
      // 14: invokestatic qpp$cv2.a (Loov;)Loov;
      // 17: athrow
      // 18: bipush 1
      // 19: goto 20
      // 1c: invokestatic qpp$cv2.a (Loov;)Loov;
      // 1f: athrow
      // 20: goto 24
      // 23: bipush 0
      // 24: ireturn
   }

   @Override
   public boolean q67(vrx param1) {
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
      // 05: getfield vrx.k0y Lrsi;
      // 08: instanceof jnq
      // 0b: iload 2
      // 0c: ifeq 51
      // 0f: ifne 50
      // 12: goto 19
      // 15: invokestatic qpp$cv2.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 1
      // 1a: getfield vrx.b0m I
      // 1d: bipush 90
      // 1f: iload 2
      // 20: ifeq 4d
      // 23: goto 2a
      // 26: invokestatic qpp$cv2.a (Loov;)Loov;
      // 29: athrow
      // 2a: if_icmple 54
      // 2d: goto 34
      // 30: invokestatic qpp$cv2.a (Loov;)Loov;
      // 33: athrow
      // 34: aload 1
      // 35: getfield vrx.nuz I
      // 38: iload 2
      // 39: ifeq 51
      // 3c: goto 43
      // 3f: invokestatic qpp$cv2.a (Loov;)Loov;
      // 42: athrow
      // 43: sipush 162
      // 46: goto 4d
      // 49: invokestatic qpp$cv2.a (Loov;)Loov;
      // 4c: athrow
      // 4d: if_icmpgt 54
      // 50: bipush 1
      // 51: goto 55
      // 54: bipush 0
      // 55: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
