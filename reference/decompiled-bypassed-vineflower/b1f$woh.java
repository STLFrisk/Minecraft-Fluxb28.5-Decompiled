import com.google.common.collect.Lists;
import java.net.InetAddress;
import java.util.Collections;
import java.util.List;

public class b1f$woh {
   private List w0z = Lists.newArrayList();
   public boolean uiv;

   public synchronized boolean _t3() {
      return this.uiv;
   }

   public synchronized void acf() {
      this.uiv = false;
   }

   public synchronized List kka() {
      return Collections.unmodifiableList(this.w0z);
   }

   public synchronized void kig(String param1, InetAddress param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: invokestatic o80.zmu (Ljava/lang/String;)Ljava/lang/String;
      // 04: astore 4
      // 06: invokestatic t9d.b ()I
      // 09: aload 1
      // 0a: invokestatic o80.ja3 (Ljava/lang/String;)Ljava/lang/String;
      // 0d: astore 5
      // 0f: istore 3
      // 10: aload 5
      // 12: iload 3
      // 13: ifeq 43
      // 16: ifnull db
      // 19: goto 20
      // 1c: invokestatic b1f$woh.a (Loov;)Loov;
      // 1f: athrow
      // 20: new java/lang/StringBuilder
      // 23: dup
      // 24: invokespecial java/lang/StringBuilder.<init> ()V
      // 27: aload 2
      // 28: invokevirtual java/net/InetAddress.getHostAddress ()Ljava/lang/String;
      // 2b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2e: ldc ":"
      // 30: nop
      // 31: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 34: aload 5
      // 36: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 39: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3c: goto 43
      // 3f: invokestatic b1f$woh.a (Loov;)Loov;
      // 42: athrow
      // 43: astore 5
      // 45: bipush 0
      // 46: istore 6
      // 48: aload 0
      // 49: getfield b1f$woh.w0z Ljava/util/List;
      // 4c: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 51: astore 7
      // 53: aload 7
      // 55: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 5a: ifeq aa
      // 5d: aload 7
      // 5f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 64: checkcast b1f$pll
      // 67: astore 8
      // 69: aload 8
      // 6b: invokevirtual b1f$pll.tqj ()Ljava/lang/String;
      // 6e: aload 5
      // 70: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 73: iload 3
      // 74: ifeq ac
      // 77: iload 3
      // 78: ifeq 99
      // 7b: goto 82
      // 7e: invokestatic b1f$woh.a (Loov;)Loov;
      // 81: athrow
      // 82: ifeq 9f
      // 85: goto 8c
      // 88: invokestatic b1f$woh.a (Loov;)Loov;
      // 8b: athrow
      // 8c: aload 8
      // 8e: invokevirtual b1f$pll.l0x ()V
      // 91: bipush 1
      // 92: goto 99
      // 95: invokestatic b1f$woh.a (Loov;)Loov;
      // 98: athrow
      // 99: istore 6
      // 9b: iload 3
      // 9c: ifne aa
      // 9f: iload 3
      // a0: ifne 53
      // a3: goto aa
      // a6: invokestatic b1f$woh.a (Loov;)Loov;
      // a9: athrow
      // aa: iload 6
      // ac: iload 3
      // ad: ifeq d5
      // b0: ifne db
      // b3: goto ba
      // b6: invokestatic b1f$woh.a (Loov;)Loov;
      // b9: athrow
      // ba: aload 0
      // bb: getfield b1f$woh.w0z Ljava/util/List;
      // be: new b1f$pll
      // c1: dup
      // c2: aload 4
      // c4: aload 5
      // c6: invokespecial b1f$pll.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // c9: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // ce: goto d5
      // d1: invokestatic b1f$woh.a (Loov;)Loov;
      // d4: athrow
      // d5: pop
      // d6: aload 0
      // d7: bipush 1
      // d8: putfield b1f$woh.uiv Z
      // db: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
