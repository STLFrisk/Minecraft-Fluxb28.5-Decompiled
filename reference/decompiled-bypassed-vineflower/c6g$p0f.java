import paulscode.sound.SoundSystem;

public class c6g$p0f extends SoundSystem {
   public final c6g w3e;

   private c6g$p0f(c6g var1) {
      this.w3e = var1;
   }

   public boolean playing(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: getstatic paulscode/sound/SoundSystemConfig.THREAD_SYNC Ljava/lang/Object;
      // 07: dup
      // 08: astore 3
      // 09: monitorenter
      // 0a: aload 0
      // 0b: getfield c6g$p0f.soundLibrary Lpaulscode/sound/Library;
      // 0e: iload 2
      // 0f: ifeq 24
      // 12: ifnonnull 19
      // 15: bipush 0
      // 16: aload 3
      // 17: monitorexit
      // 18: ireturn
      // 19: aload 0
      // 1a: getfield c6g$p0f.soundLibrary Lpaulscode/sound/Library;
      // 1d: invokevirtual paulscode/sound/Library.getSources ()Ljava/util/HashMap;
      // 20: aload 1
      // 21: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 24: checkcast paulscode/sound/Source
      // 27: astore 4
      // 29: aload 4
      // 2b: iload 2
      // 2c: ifeq 43
      // 2f: ifnonnull 41
      // 32: goto 39
      // 35: invokestatic c6g$p0f.a (Loov;)Loov;
      // 38: athrow
      // 39: bipush 0
      // 3a: goto 8d
      // 3d: invokestatic c6g$p0f.a (Loov;)Loov;
      // 40: athrow
      // 41: aload 4
      // 43: invokevirtual paulscode/sound/Source.playing ()Z
      // 46: iload 2
      // 47: ifeq 89
      // 4a: ifne 88
      // 4d: goto 54
      // 50: invokestatic c6g$p0f.a (Loov;)Loov;
      // 53: athrow
      // 54: aload 4
      // 56: invokevirtual paulscode/sound/Source.paused ()Z
      // 59: iload 2
      // 5a: ifeq 89
      // 5d: goto 64
      // 60: invokestatic c6g$p0f.a (Loov;)Loov;
      // 63: athrow
      // 64: ifne 88
      // 67: goto 6e
      // 6a: invokestatic c6g$p0f.a (Loov;)Loov;
      // 6d: athrow
      // 6e: aload 4
      // 70: getfield paulscode/sound/Source.preLoad Z
      // 73: iload 2
      // 74: ifeq 89
      // 77: goto 7e
      // 7a: invokestatic c6g$p0f.a (Loov;)Loov;
      // 7d: athrow
      // 7e: ifeq 8c
      // 81: goto 88
      // 84: invokestatic c6g$p0f.a (Loov;)Loov;
      // 87: athrow
      // 88: bipush 1
      // 89: goto 8d
      // 8c: bipush 0
      // 8d: aload 3
      // 8e: monitorexit
      // 8f: ireturn
      // 90: astore 5
      // 92: aload 3
      // 93: monitorexit
      // 94: aload 5
      // 96: athrow
   }

   public c6g$p0f(c6g var1, c6g$1 var2) {
      this(var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
