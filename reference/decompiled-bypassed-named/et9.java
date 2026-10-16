public class et9 {
   public static int fpm = Integer.MIN_VALUE;

   public static void hqd(mz2 param0, yw3 param1, lg9 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 2
      // 05: iload 3
      // 06: ifeq 20
      // 09: invokeinterface lg9.xii ()Z 1
      // 0e: ifne 33
      // 11: goto 18
      // 14: invokestatic et9.a (Lv1f;)Lv1f;
      // 17: athrow
      // 18: aload 2
      // 19: goto 20
      // 1c: invokestatic et9.a (Lv1f;)Lv1f;
      // 1f: athrow
      // 20: new et9$1
      // 23: dup
      // 24: aload 0
      // 25: aload 1
      // 26: invokespecial et9$1.<init> (Lmz2;Lyw3;)V
      // 29: invokeinterface lg9.acd (Ljava/lang/Runnable;)Lcom/google/common/util/concurrent/ListenableFuture; 2
      // 2e: pop
      // 2f: getstatic v1f.ln6 Lv1f;
      // 32: athrow
      // 33: aload 0
      // 34: invokestatic et9.adc (Lmz2;)V
      // 37: return
   }

   public static void adc(mz2 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: instanceof net/minecraft/network/play/server/S08PacketPlayerPosLook
      // 08: iload 1
      // 09: ifeq 27
      // 0c: ifeq 23
      // 0f: goto 16
      // 12: invokestatic et9.a (Lv1f;)Lv1f;
      // 15: athrow
      // 16: invokestatic hxt.hm6 ()Lcrp;
      // 19: invokevirtual crp.guk ()V
      // 1c: goto 23
      // 1f: invokestatic et9.a (Lv1f;)Lv1f;
      // 22: athrow
      // 23: aload 0
      // 24: instanceof net/minecraft/network/play/server/S07PacketRespawn
      // 27: iload 1
      // 28: ifeq 50
      // 2b: ifeq 45
      // 2e: goto 35
      // 31: invokestatic et9.a (Lv1f;)Lv1f;
      // 34: athrow
      // 35: aload 0
      // 36: checkcast net/minecraft/network/play/server/S07PacketRespawn
      // 39: astore 2
      // 3a: aload 2
      // 3b: invokevirtual net/minecraft/network/play/server/S07PacketRespawn.qti ()I
      // 3e: putstatic et9.fpm I
      // 41: iload 1
      // 42: ifne 7b
      // 45: aload 0
      // 46: instanceof net/minecraft/network/play/server/S01PacketJoinGame
      // 49: goto 50
      // 4c: invokestatic et9.a (Lv1f;)Lv1f;
      // 4f: athrow
      // 50: iload 1
      // 51: ifeq 78
      // 54: ifeq 6e
      // 57: goto 5e
      // 5a: invokestatic et9.a (Lv1f;)Lv1f;
      // 5d: athrow
      // 5e: aload 0
      // 5f: checkcast net/minecraft/network/play/server/S01PacketJoinGame
      // 62: astore 2
      // 63: aload 2
      // 64: invokevirtual net/minecraft/network/play/server/S01PacketJoinGame.z6k ()I
      // 67: putstatic et9.fpm I
      // 6a: iload 1
      // 6b: ifne 7b
      // 6e: ldc -2147483648
      // 70: nop
      // 71: goto 78
      // 74: invokestatic et9.a (Lv1f;)Lv1f;
      // 77: athrow
      // 78: putstatic et9.fpm I
      // 7b: return
   }

   private static v1f a(v1f var0) {
      return var0;
   }
}
