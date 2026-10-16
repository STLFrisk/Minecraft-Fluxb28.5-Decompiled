public class ele {
   public ele(Entity var1) {
      this.gcm = var1;
   }

   public void sui() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 1
      // 004: aload 0
      // 005: getfield ele.gcm Lg_3;
      // 008: getfield Entity.o2v D
      // 00b: aload 0
      // 00c: getfield ele.gcm Lg_3;
      // 00f: getfield Entity.bc1 D
      // 012: dsub
      // 013: dstore 2
      // 014: aload 0
      // 015: getfield ele.gcm Lg_3;
      // 018: getfield Entity.vbd D
      // 01b: aload 0
      // 01c: getfield ele.gcm Lg_3;
      // 01f: getfield Entity.a4d D
      // 022: dsub
      // 023: dstore 4
      // 025: iload 1
      // 026: ifeq 081
      // 029: dload 2
      // 02a: dload 2
      // 02b: dmul
      // 02c: dload 4
      // 02e: dload 4
      // 030: dmul
      // 031: dadd
      // 032: ldc2_w 2.500000277905201E-7
      // 035: dcmpl
      // 036: ifle 085
      // 039: goto 040
      // 03c: invokestatic ele.a (Loov;)Loov;
      // 03f: athrow
      // 040: aload 0
      // 041: getfield ele.gcm Lg_3;
      // 044: aload 0
      // 045: getfield ele.gcm Lg_3;
      // 048: getfield Entity.x5k F
      // 04b: putfield Entity.ksw F
      // 04e: aload 0
      // 04f: getfield ele.gcm Lg_3;
      // 052: aload 0
      // 053: aload 0
      // 054: getfield ele.gcm Lg_3;
      // 057: getfield Entity.ksw F
      // 05a: aload 0
      // 05b: getfield ele.gcm Lg_3;
      // 05e: getfield Entity.q6c F
      // 061: ldc 75.0
      // 063: nop
      // 064: invokespecial ele.i1m (FFF)F
      // 067: putfield Entity.q6c F
      // 06a: aload 0
      // 06b: aload 0
      // 06c: getfield ele.gcm Lg_3;
      // 06f: getfield Entity.q6c F
      // 072: putfield ele.mla F
      // 075: aload 0
      // 076: bipush 0
      // 077: putfield ele.ryt I
      // 07a: goto 081
      // 07d: invokestatic ele.a (Loov;)Loov;
      // 080: athrow
      // 081: iload 1
      // 082: ifne 122
      // 085: ldc 75.0
      // 087: nop
      // 088: fstore 6
      // 08a: aload 0
      // 08b: getfield ele.gcm Lg_3;
      // 08e: getfield Entity.q6c F
      // 091: aload 0
      // 092: getfield ele.mla F
      // 095: fsub
      // 096: invokestatic java/lang/Math.abs (F)F
      // 099: ldc 15.0
      // 09b: nop
      // 09c: fcmpl
      // 09d: iload 1
      // 09e: ifeq 0d9
      // 0a1: ifle 0c6
      // 0a4: goto 0ab
      // 0a7: invokestatic ele.a (Loov;)Loov;
      // 0aa: athrow
      // 0ab: aload 0
      // 0ac: bipush 0
      // 0ad: putfield ele.ryt I
      // 0b0: aload 0
      // 0b1: aload 0
      // 0b2: getfield ele.gcm Lg_3;
      // 0b5: getfield Entity.q6c F
      // 0b8: putfield ele.mla F
      // 0bb: iload 1
      // 0bc: ifne 107
      // 0bf: goto 0c6
      // 0c2: invokestatic ele.a (Loov;)Loov;
      // 0c5: athrow
      // 0c6: aload 0
      // 0c7: dup
      // 0c8: getfield ele.ryt I
      // 0cb: bipush 1
      // 0cc: iadd
      // 0cd: putfield ele.ryt I
      // 0d0: bipush 10
      // 0d2: goto 0d9
      // 0d5: invokestatic ele.a (Loov;)Loov;
      // 0d8: athrow
      // 0d9: istore 7
      // 0db: aload 0
      // 0dc: iload 1
      // 0dd: ifeq 108
      // 0e0: getfield ele.ryt I
      // 0e3: bipush 10
      // 0e5: if_icmple 107
      // 0e8: goto 0ef
      // 0eb: invokestatic ele.a (Loov;)Loov;
      // 0ee: athrow
      // 0ef: fconst_1
      // 0f0: aload 0
      // 0f1: getfield ele.ryt I
      // 0f4: bipush 10
      // 0f6: isub
      // 0f7: i2f
      // 0f8: ldc 10.0
      // 0fa: nop
      // 0fb: fdiv
      // 0fc: fsub
      // 0fd: fconst_0
      // 0fe: invokestatic java/lang/Math.max (FF)F
      // 101: ldc 75.0
      // 103: nop
      // 104: fmul
      // 105: fstore 6
      // 107: aload 0
      // 108: getfield ele.gcm Lg_3;
      // 10b: aload 0
      // 10c: aload 0
      // 10d: getfield ele.gcm Lg_3;
      // 110: getfield Entity.q6c F
      // 113: aload 0
      // 114: getfield ele.gcm Lg_3;
      // 117: getfield Entity.ksw F
      // 11a: fload 6
      // 11c: invokespecial ele.i1m (FFF)F
      // 11f: putfield Entity.ksw F
      // 122: return
   }

   private float i1m(float var1, float var2, float var3) {
      int var4 = OpaquePredicate.c();
      float var5 = fe6.qsy(var1 - var2);

      int var10000;
      label34: {
         label33: {
            try {
               float var9;
               var10000 = (var9 = var5 - -var3) == 0.0F ? 0 : (var9 < 0.0F ? -1 : 1);
               if (var4 != 0) {
                  break label34;
               }

               if (var10000 >= 0) {
                  break label33;
               }
            } catch (oov var7) {
               throw a(var7);
            }

            var5 = -var3;
         }

         try {
            if (var4 != 0) {
               return var5 - var3;
            }

            float var10;
            var10000 = (var10 = var5 - var3) == 0.0F ? 0 : (var10 < 0.0F ? -1 : 1);
         } catch (oov var6) {
            throw a(var6);
         }
      }

      if (var10000 >= 0) {
         var5 = var3;
      }

      return var1 - var5;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
