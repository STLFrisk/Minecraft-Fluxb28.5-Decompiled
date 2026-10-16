import java.io.InputStream;

public class ay1 implements yaa {
   public ay1(String var1, gdz var2, InputStream var3, InputStream var4, if1 var5) {
      this.ehy = var1;
      this.zkw = var2;
      this.k6k = var3;
      this.msq = var4;
      this.i7t = var5;
   }

   @Override
   public gdz yad() {
      return this.zkw;
   }

   @Override
   public InputStream f_4() {
      return this.k6k;
   }

   @Override
   public boolean z75() {
      try {
         if (this.msq != null) {
            return true;
         }
      } catch (oov var1) {
         throw a(var1);
      }

      return false;
   }

   @Override
   public z08 yrs(String param1) {
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
      // 05: iload 2
      // 06: ifeq 20
      // 09: invokevirtual ay1.z75 ()Z
      // 0c: ifne 1f
      // 0f: goto 16
      // 12: invokestatic ay1.a (Loov;)Loov;
      // 15: athrow
      // 16: aconst_null
      // 17: checkcast z08
      // 1a: areturn
      // 1b: invokestatic ay1.a (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 0
      // 20: getfield ay1.nxl Lcom/google/gson/JsonObject;
      // 23: iload 2
      // 24: ifeq 90
      // 27: ifnonnull 86
      // 2a: goto 31
      // 2d: invokestatic ay1.a (Loov;)Loov;
      // 30: athrow
      // 31: aload 0
      // 32: iload 2
      // 33: ifeq 90
      // 36: goto 3d
      // 39: invokestatic ay1.a (Loov;)Loov;
      // 3c: athrow
      // 3d: getfield ay1.g_r Z
      // 40: ifne 86
      // 43: goto 4a
      // 46: invokestatic ay1.a (Loov;)Loov;
      // 49: athrow
      // 4a: aload 0
      // 4b: bipush 1
      // 4c: putfield ay1.g_r Z
      // 4f: aconst_null
      // 50: astore 3
      // 51: new java/io/BufferedReader
      // 54: dup
      // 55: new java/io/InputStreamReader
      // 58: dup
      // 59: aload 0
      // 5a: getfield ay1.msq Ljava/io/InputStream;
      // 5d: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;)V
      // 60: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;)V
      // 63: astore 3
      // 64: aload 0
      // 65: new com/google/gson/JsonParser
      // 68: dup
      // 69: invokespecial com/google/gson/JsonParser.<init> ()V
      // 6c: aload 3
      // 6d: invokevirtual com/google/gson/JsonParser.parse (Ljava/io/Reader;)Lcom/google/gson/JsonElement;
      // 70: invokevirtual com/google/gson/JsonElement.getAsJsonObject ()Lcom/google/gson/JsonObject;
      // 73: putfield ay1.nxl Lcom/google/gson/JsonObject;
      // 76: aload 3
      // 77: invokestatic org/apache/commons/io/IOUtils.closeQuietly (Ljava/io/Reader;)V
      // 7a: goto 86
      // 7d: astore 4
      // 7f: aload 3
      // 80: invokestatic org/apache/commons/io/IOUtils.closeQuietly (Ljava/io/Reader;)V
      // 83: aload 4
      // 85: athrow
      // 86: aload 0
      // 87: getfield ay1.y9p Ljava/util/Map;
      // 8a: aload 1
      // 8b: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 90: checkcast z08
      // 93: astore 3
      // 94: aload 3
      // 95: iload 2
      // 96: ifeq b1
      // 99: ifnonnull b0
      // 9c: goto a3
      // 9f: invokestatic ay1.a (Loov;)Loov;
      // a2: athrow
      // a3: aload 0
      // a4: getfield ay1.i7t Lif1;
      // a7: aload 1
      // a8: aload 0
      // a9: getfield ay1.nxl Lcom/google/gson/JsonObject;
      // ac: invokevirtual if1.oom (Ljava/lang/String;Lcom/google/gson/JsonObject;)Lz08;
      // af: astore 3
      // b0: aload 3
      // b1: areturn
   }

   @Override
   public String rlm() {
      return this.ehy;
   }

   @Override
   public boolean equals(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifne 1b
      // 09: aload 1
      // 0a: if_acmpne 1a
      // 0d: goto 14
      // 10: invokestatic ay1.a (Loov;)Loov;
      // 13: athrow
      // 14: bipush 1
      // 15: ireturn
      // 16: invokestatic ay1.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 1
      // 1b: iload 2
      // 1c: ifne 33
      // 1f: instanceof ay1
      // 22: ifne 32
      // 25: goto 2c
      // 28: invokestatic ay1.a (Loov;)Loov;
      // 2b: athrow
      // 2c: bipush 0
      // 2d: ireturn
      // 2e: invokestatic ay1.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 1
      // 33: checkcast ay1
      // 36: astore 3
      // 37: aload 0
      // 38: getfield ay1.zkw Lgdz;
      // 3b: iload 2
      // 3c: ifne 7e
      // 3f: ifnull 6f
      // 42: goto 49
      // 45: invokestatic ay1.a (Loov;)Loov;
      // 48: athrow
      // 49: aload 0
      // 4a: iload 2
      // 4b: ifne 88
      // 4e: goto 55
      // 51: invokestatic ay1.a (Loov;)Loov;
      // 54: athrow
      // 55: getfield ay1.zkw Lgdz;
      // 58: aload 3
      // 59: getfield ay1.zkw Lgdz;
      // 5c: invokevirtual gdz.equals (Ljava/lang/Object;)Z
      // 5f: ifne 87
      // 62: goto 69
      // 65: invokestatic ay1.a (Loov;)Loov;
      // 68: athrow
      // 69: bipush 0
      // 6a: ireturn
      // 6b: invokestatic ay1.a (Loov;)Loov;
      // 6e: athrow
      // 6f: aload 3
      // 70: iload 2
      // 71: ifne 88
      // 74: getfield ay1.zkw Lgdz;
      // 77: goto 7e
      // 7a: invokestatic ay1.a (Loov;)Loov;
      // 7d: athrow
      // 7e: ifnull 87
      // 81: bipush 0
      // 82: ireturn
      // 83: invokestatic ay1.a (Loov;)Loov;
      // 86: athrow
      // 87: aload 0
      // 88: getfield ay1.ehy Ljava/lang/String;
      // 8b: iload 2
      // 8c: ifne c3
      // 8f: ifnull bf
      // 92: goto 99
      // 95: invokestatic ay1.a (Loov;)Loov;
      // 98: athrow
      // 99: aload 0
      // 9a: getfield ay1.ehy Ljava/lang/String;
      // 9d: aload 3
      // 9e: getfield ay1.ehy Ljava/lang/String;
      // a1: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // a4: iload 2
      // a5: ifne cd
      // a8: goto af
      // ab: invokestatic ay1.a (Loov;)Loov;
      // ae: athrow
      // af: ifne cc
      // b2: goto b9
      // b5: invokestatic ay1.a (Loov;)Loov;
      // b8: athrow
      // b9: bipush 0
      // ba: ireturn
      // bb: invokestatic ay1.a (Loov;)Loov;
      // be: athrow
      // bf: aload 3
      // c0: getfield ay1.ehy Ljava/lang/String;
      // c3: ifnull cc
      // c6: bipush 0
      // c7: ireturn
      // c8: invokestatic ay1.a (Loov;)Loov;
      // cb: athrow
      // cc: bipush 1
      // cd: ireturn
   }

   @Override
   public int hashCode() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield ay1.ehy Ljava/lang/String;
      // 08: iload 1
      // 09: ifne 21
      // 0c: ifnull 27
      // 0f: goto 16
      // 12: invokestatic ay1.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield ay1.ehy Ljava/lang/String;
      // 1a: goto 21
      // 1d: invokestatic ay1.a (Loov;)Loov;
      // 20: athrow
      // 21: invokevirtual java/lang/String.hashCode ()I
      // 24: goto 28
      // 27: bipush 0
      // 28: istore 2
      // 29: bipush 31
      // 2b: iload 2
      // 2c: imul
      // 2d: aload 0
      // 2e: getfield ay1.zkw Lgdz;
      // 31: iload 1
      // 32: ifne 4a
      // 35: ifnull 50
      // 38: goto 3f
      // 3b: invokestatic ay1.a (Loov;)Loov;
      // 3e: athrow
      // 3f: aload 0
      // 40: getfield ay1.zkw Lgdz;
      // 43: goto 4a
      // 46: invokestatic ay1.a (Loov;)Loov;
      // 49: athrow
      // 4a: invokevirtual gdz.hashCode ()I
      // 4d: goto 51
      // 50: bipush 0
      // 51: iadd
      // 52: istore 2
      // 53: iload 2
      // 54: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
