public class yo9$vcp {
   public final long imq;
   public Object yid;
   public yo9$vcp a7r;
   public final int azk;

   public yo9$vcp(int var1, long var2, Object var4, yo9$vcp var5) {
      this.yid = var4;
      this.a7r = var5;
      this.imq = var2;
      this.azk = var1;
   }

   public final long yqv() {
      return this.imq;
   }

   public final Object nqy() {
      return this.yid;
   }

   @Override
   public final boolean equals(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifne 1d
      // 09: instanceof yo9$vcp
      // 0c: ifne 1c
      // 0f: goto 16
      // 12: invokestatic yo9$vcp.a (Loov;)Loov;
      // 15: athrow
      // 16: bipush 0
      // 17: ireturn
      // 18: invokestatic yo9$vcp.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 1
      // 1d: checkcast yo9$vcp
      // 20: astore 3
      // 21: aload 0
      // 22: invokevirtual yo9$vcp.yqv ()J
      // 25: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 28: astore 4
      // 2a: aload 3
      // 2b: invokevirtual yo9$vcp.yqv ()J
      // 2e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 31: astore 5
      // 33: aload 4
      // 35: iload 2
      // 36: ifne 7c
      // 39: aload 5
      // 3b: if_acmpeq 71
      // 3e: goto 45
      // 41: invokestatic yo9$vcp.a (Loov;)Loov;
      // 44: athrow
      // 45: aload 4
      // 47: iload 2
      // 48: ifne 5e
      // 4b: goto 52
      // 4e: invokestatic yo9$vcp.a (Loov;)Loov;
      // 51: athrow
      // 52: ifnull c8
      // 55: goto 5c
      // 58: invokestatic yo9$vcp.a (Loov;)Loov;
      // 5b: athrow
      // 5c: aload 4
      // 5e: aload 5
      // 60: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 63: iload 2
      // 64: ifne c9
      // 67: ifeq c8
      // 6a: goto 71
      // 6d: invokestatic yo9$vcp.a (Loov;)Loov;
      // 70: athrow
      // 71: aload 0
      // 72: invokevirtual yo9$vcp.nqy ()Ljava/lang/Object;
      // 75: goto 7c
      // 78: invokestatic yo9$vcp.a (Loov;)Loov;
      // 7b: athrow
      // 7c: astore 6
      // 7e: aload 3
      // 7f: invokevirtual yo9$vcp.nqy ()Ljava/lang/Object;
      // 82: astore 7
      // 84: aload 6
      // 86: iload 2
      // 87: ifne 9f
      // 8a: aload 7
      // 8c: if_acmpeq c2
      // 8f: goto 96
      // 92: invokestatic yo9$vcp.a (Loov;)Loov;
      // 95: athrow
      // 96: aload 6
      // 98: goto 9f
      // 9b: invokestatic yo9$vcp.a (Loov;)Loov;
      // 9e: athrow
      // 9f: iload 2
      // a0: ifne af
      // a3: ifnull c8
      // a6: goto ad
      // a9: invokestatic yo9$vcp.a (Loov;)Loov;
      // ac: athrow
      // ad: aload 6
      // af: aload 7
      // b1: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // b4: iload 2
      // b5: ifne c9
      // b8: ifeq c8
      // bb: goto c2
      // be: invokestatic yo9$vcp.a (Loov;)Loov;
      // c1: athrow
      // c2: bipush 1
      // c3: ireturn
      // c4: invokestatic yo9$vcp.a (Loov;)Loov;
      // c7: athrow
      // c8: bipush 0
      // c9: ireturn
   }

   @Override
   public final int hashCode() {
      return yo9.ryz(this.imq);
   }

   @Override
   public final String toString() {
      return this.yqv() + "=" + this.nqy();
   }

   private static oov a(oov var0) {
      return var0;
   }
}
