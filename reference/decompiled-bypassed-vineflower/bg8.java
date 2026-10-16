import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class bg8 extends wob {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public bg8(String var1) {
      super(var1);
   }

   public bg8(t9d var1) {
      super(m28(var1.vzz));
      this.jnv = var1;
      this.hcs();
   }

   public void kyu(t9d var1) {
      this.jnv = var1;
      int var10000 = t9d.b();
      Iterator var3 = this.m10.iterator();
      int var2 = var10000;

      while (var3.hasNext()) {
         j7z var4 = (j7z)var3.next();
         var4.d3e(var1);
         if (var2 == 0) {
            break;
         }
      }
   }

   public void bgl(mew param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield bg8.b_5 Ljava/util/List;
      // 08: invokeinterface java/util/List.size ()I 1
      // 0d: iload 2
      // 0e: ifne 29
      // 11: bipush 64
      // 13: if_icmpgt 49
      // 16: goto 1d
      // 19: invokestatic bg8.a (Loov;)Loov;
      // 1c: athrow
      // 1d: aload 0
      // 1e: aload 1
      // 1f: invokespecial bg8.iow (Lmew;)Z
      // 22: goto 29
      // 25: invokestatic bg8.a (Loov;)Loov;
      // 28: athrow
      // 29: iload 2
      // 2a: ifne 48
      // 2d: ifne 49
      // 30: goto 37
      // 33: invokestatic bg8.a (Loov;)Loov;
      // 36: athrow
      // 37: aload 0
      // 38: getfield bg8.b_5 Ljava/util/List;
      // 3b: aload 1
      // 3c: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 41: goto 48
      // 44: invokestatic bg8.a (Loov;)Loov;
      // 47: athrow
      // 48: pop
      // 49: return
   }

   public void o09() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: getfield bg8.n2a I
      // 05: bipush 1
      // 06: iadd
      // 07: putfield bg8.n2a I
      // 0a: invokestatic t9d.b ()I
      // 0d: aload 0
      // 0e: getfield bg8.m10 Ljava/util/List;
      // 11: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 16: astore 2
      // 17: istore 1
      // 18: aload 2
      // 19: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1e: ifeq 42
      // 21: aload 2
      // 22: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 27: checkcast j7z
      // 2a: astore 3
      // 2b: aload 3
      // 2c: aload 0
      // 2d: getfield bg8.n2a I
      // 30: invokevirtual j7z.yeq (I)V
      // 33: iload 1
      // 34: ifeq 4e
      // 37: iload 1
      // 38: ifne 18
      // 3b: goto 42
      // 3e: invokestatic bg8.a (Loov;)Loov;
      // 41: athrow
      // 42: aload 0
      // 43: invokespecial bg8.u3w ()V
      // 46: aload 0
      // 47: invokespecial bg8.orf ()V
      // 4a: aload 0
      // 4b: invokespecial bg8.khj ()V
      // 4e: aload 0
      // 4f: iload 1
      // 50: ifeq 6c
      // 53: getfield bg8.n2a I
      // 56: sipush 400
      // 59: irem
      // 5a: ifne 6f
      // 5d: goto 64
      // 60: invokestatic bg8.a (Loov;)Loov;
      // 63: athrow
      // 64: aload 0
      // 65: goto 6c
      // 68: invokestatic bg8.a (Loov;)Loov;
      // 6b: athrow
      // 6c: invokevirtual bg8.hcs ()V
      // 6f: return
   }

   private void u3w() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield bg8.m10 Ljava/util/List;
      // 08: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0d: astore 2
      // 0e: aload 2
      // 0f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 14: ifeq 48
      // 17: aload 2
      // 18: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1d: checkcast j7z
      // 20: astore 3
      // 21: iload 1
      // 22: ifeq 40
      // 25: aload 3
      // 26: invokevirtual j7z.fr6 ()Z
      // 29: ifeq 44
      // 2c: goto 33
      // 2f: invokestatic bg8.a (Loov;)Loov;
      // 32: athrow
      // 33: aload 2
      // 34: invokeinterface java/util/Iterator.remove ()V 1
      // 39: goto 40
      // 3c: invokestatic bg8.a (Loov;)Loov;
      // 3f: athrow
      // 40: aload 0
      // 41: invokevirtual bg8.hcs ()V
      // 44: iload 1
      // 45: ifne 0e
      // 48: return
   }

   public List wjb() {
      return this.m10;
   }

   public j7z pom(mew param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aconst_null
      // 01: astore 4
      // 03: ldc2_w 3.4028234663852886E38
      // 06: dstore 5
      // 08: invokestatic t9d.c ()I
      // 0b: aload 0
      // 0c: getfield bg8.m10 Ljava/util/List;
      // 0f: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 14: astore 7
      // 16: istore 3
      // 17: aload 7
      // 19: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1e: ifeq 83
      // 21: aload 7
      // 23: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 28: checkcast j7z
      // 2b: astore 8
      // 2d: aload 8
      // 2f: iload 3
      // 30: ifne 85
      // 33: invokevirtual j7z.n0h ()Lmew;
      // 36: aload 1
      // 37: invokevirtual mew.t0u (Lwgo;)D
      // 3a: dstore 9
      // 3c: dload 9
      // 3e: dload 5
      // 40: dcmpg
      // 41: iload 3
      // 42: ifne 5d
      // 45: ifge 7f
      // 48: goto 4f
      // 4b: invokestatic bg8.a (Loov;)Loov;
      // 4e: athrow
      // 4f: iload 2
      // 50: aload 8
      // 52: invokevirtual j7z.hk4 ()I
      // 55: iadd
      // 56: goto 5d
      // 59: invokestatic bg8.a (Loov;)Loov;
      // 5c: athrow
      // 5d: i2f
      // 5e: fstore 11
      // 60: dload 9
      // 62: iload 3
      // 63: ifne 7d
      // 66: fload 11
      // 68: fload 11
      // 6a: fmul
      // 6b: f2d
      // 6c: dcmpg
      // 6d: ifgt 7f
      // 70: goto 77
      // 73: invokestatic bg8.a (Loov;)Loov;
      // 76: athrow
      // 77: aload 8
      // 79: astore 4
      // 7b: dload 9
      // 7d: dstore 5
      // 7f: iload 3
      // 80: ifeq 17
      // 83: aload 4
      // 85: areturn
   }

   private void orf() {
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
      // 05: iload 1
      // 06: ifne 23
      // 09: getfield bg8.b_5 Ljava/util/List;
      // 0c: invokeinterface java/util/List.isEmpty ()Z 1
      // 11: ifne 33
      // 14: goto 1b
      // 17: invokestatic bg8.a (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 0
      // 1c: goto 23
      // 1f: invokestatic bg8.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 0
      // 24: getfield bg8.b_5 Ljava/util/List;
      // 27: bipush 0
      // 28: invokeinterface java/util/List.remove (I)Ljava/lang/Object; 2
      // 2d: checkcast mew
      // 30: invokespecial bg8.z76 (Lmew;)V
      // 33: return
   }

   private void khj() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: bipush 0
      // 05: istore 2
      // 06: iload 2
      // 07: aload 0
      // 08: getfield bg8.jhc Ljava/util/List;
      // 0b: invokeinterface java/util/List.size ()I 1
      // 10: if_icmpge 72
      // 13: aload 0
      // 14: getfield bg8.jhc Ljava/util/List;
      // 17: iload 2
      // 18: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 1d: checkcast wdx
      // 20: astore 3
      // 21: aload 0
      // 22: aload 3
      // 23: invokevirtual wdx._d5 ()Lmew;
      // 26: bipush 32
      // 28: invokevirtual bg8.pom (Lmew;I)Lj7z;
      // 2b: astore 4
      // 2d: iload 1
      // 2e: ifne 7b
      // 31: aload 4
      // 33: iload 1
      // 34: ifne 67
      // 37: goto 3e
      // 3a: invokestatic bg8.a (Loov;)Loov;
      // 3d: athrow
      // 3e: ifnonnull 65
      // 41: goto 48
      // 44: invokestatic bg8.a (Loov;)Loov;
      // 47: athrow
      // 48: new j7z
      // 4b: dup
      // 4c: aload 0
      // 4d: getfield bg8.jnv Lt9d;
      // 50: invokespecial j7z.<init> (Lt9d;)V
      // 53: astore 4
      // 55: aload 0
      // 56: getfield bg8.m10 Ljava/util/List;
      // 59: aload 4
      // 5b: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 60: pop
      // 61: aload 0
      // 62: invokevirtual bg8.hcs ()V
      // 65: aload 4
      // 67: aload 3
      // 68: invokevirtual j7z.hv3 (Lwdx;)V
      // 6b: iinc 2 1
      // 6e: iload 1
      // 6f: ifeq 06
      // 72: aload 0
      // 73: getfield bg8.jhc Ljava/util/List;
      // 76: invokeinterface java/util/List.clear ()V 1
      // 7b: return
   }

   private void z76(mew param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 16
      // 02: istore 3
      // 03: invokestatic t9d.b ()I
      // 06: bipush 4
      // 07: istore 4
      // 09: bipush 16
      // 0b: istore 5
      // 0d: istore 2
      // 0e: iload 3
      // 0f: ineg
      // 10: istore 6
      // 12: iload 6
      // 14: iload 3
      // 15: if_icmpge a6
      // 18: iload 4
      // 1a: ineg
      // 1b: istore 7
      // 1d: iload 7
      // 1f: iload 4
      // 21: if_icmpge 9f
      // 24: iload 5
      // 26: ineg
      // 27: iload 2
      // 28: ifeq 14
      // 2b: istore 8
      // 2d: iload 8
      // 2f: iload 5
      // 31: if_icmpge 98
      // 34: aload 1
      // 35: iload 6
      // 37: iload 7
      // 39: iload 8
      // 3b: invokevirtual mew.ec4 (III)Lmew;
      // 3e: astore 9
      // 40: iload 2
      // 41: ifeq 94
      // 44: aload 0
      // 45: aload 9
      // 47: invokespecial bg8.m1u (Lmew;)Z
      // 4a: iload 2
      // 4b: ifeq 1f
      // 4e: goto 55
      // 51: invokestatic bg8.a (Loov;)Loov;
      // 54: athrow
      // 55: ifeq 91
      // 58: aload 0
      // 59: aload 9
      // 5b: invokespecial bg8.p7z (Lmew;)Lwdx;
      // 5e: astore 10
      // 60: aload 10
      // 62: iload 2
      // 63: ifeq 8a
      // 66: ifnonnull 81
      // 69: goto 70
      // 6c: invokestatic bg8.a (Loov;)Loov;
      // 6f: athrow
      // 70: aload 0
      // 71: aload 9
      // 73: invokespecial bg8.o4p (Lmew;)V
      // 76: iload 2
      // 77: ifne 91
      // 7a: goto 81
      // 7d: invokestatic bg8.a (Loov;)Loov;
      // 80: athrow
      // 81: aload 10
      // 83: goto 8a
      // 86: invokestatic bg8.a (Loov;)Loov;
      // 89: athrow
      // 8a: aload 0
      // 8b: getfield bg8.n2a I
      // 8e: invokevirtual wdx.zt0 (I)V
      // 91: iinc 8 1
      // 94: iload 2
      // 95: ifne 2d
      // 98: iinc 7 1
      // 9b: iload 2
      // 9c: ifne 1d
      // 9f: iinc 6 1
      // a2: iload 2
      // a3: ifne 12
      // a6: return
   }

   private wdx p7z(mew param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield bg8.jhc Ljava/util/List;
      // 08: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0d: astore 3
      // 0e: aload 3
      // 0f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 14: ifeq 95
      // 17: aload 3
      // 18: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1d: checkcast wdx
      // 20: astore 4
      // 22: aload 4
      // 24: invokevirtual wdx._d5 ()Lmew;
      // 27: invokevirtual mew.getX ()I
      // 2a: iload 2
      // 2b: ifne a5
      // 2e: aload 1
      // 2f: invokevirtual mew.getX ()I
      // 32: iload 2
      // 33: ifne 5a
      // 36: goto 3d
      // 39: invokestatic bg8.a (Loov;)Loov;
      // 3c: athrow
      // 3d: if_icmpne 91
      // 40: goto 47
      // 43: invokestatic bg8.a (Loov;)Loov;
      // 46: athrow
      // 47: aload 4
      // 49: invokevirtual wdx._d5 ()Lmew;
      // 4c: invokevirtual mew.getZ ()I
      // 4f: aload 1
      // 50: invokevirtual mew.getZ ()I
      // 53: goto 5a
      // 56: invokestatic bg8.a (Loov;)Loov;
      // 59: athrow
      // 5a: iload 2
      // 5b: ifne 8b
      // 5e: if_icmpne 91
      // 61: goto 68
      // 64: invokestatic bg8.a (Loov;)Loov;
      // 67: athrow
      // 68: aload 4
      // 6a: iload 2
      // 6b: ifne 90
      // 6e: goto 75
      // 71: invokestatic bg8.a (Loov;)Loov;
      // 74: athrow
      // 75: invokevirtual wdx._d5 ()Lmew;
      // 78: invokevirtual mew.getY ()I
      // 7b: aload 1
      // 7c: invokevirtual mew.getY ()I
      // 7f: isub
      // 80: invokestatic java/lang/Math.abs (I)I
      // 83: bipush 1
      // 84: goto 8b
      // 87: invokestatic bg8.a (Loov;)Loov;
      // 8a: athrow
      // 8b: if_icmpgt 91
      // 8e: aload 4
      // 90: areturn
      // 91: iload 2
      // 92: ifeq 0e
      // 95: aload 0
      // 96: getfield bg8.m10 Ljava/util/List;
      // 99: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 9e: astore 3
      // 9f: aload 3
      // a0: invokeinterface java/util/Iterator.hasNext ()Z 1
      // a5: ifeq d2
      // a8: aload 3
      // a9: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // ae: checkcast j7z
      // b1: astore 4
      // b3: aload 4
      // b5: aload 1
      // b6: invokevirtual j7z._wo (Lmew;)Lwdx;
      // b9: astore 5
      // bb: aload 5
      // bd: iload 2
      // be: ifne cd
      // c1: ifnull ce
      // c4: goto cb
      // c7: invokestatic bg8.a (Loov;)Loov;
      // ca: athrow
      // cb: aload 5
      // cd: areturn
      // ce: iload 2
      // cf: ifeq 9f
      // d2: aconst_null
      // d3: areturn
   }

   private void o4p(mew param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield bg8.jnv Lt9d;
      // 04: aload 1
      // 05: invokestatic w4e.c5q (Lm5n;Lmew;)Lvt2;
      // 08: astore 2
      // 09: aload 2
      // 0a: invokevirtual vt2.b4b ()Lvt2;
      // 0d: astore 3
      // 0e: aload 0
      // 0f: aload 1
      // 10: aload 2
      // 11: bipush 5
      // 12: invokespecial bg8.r6_ (Lmew;Lvt2;I)I
      // 15: istore 4
      // 17: aload 0
      // 18: aload 1
      // 19: aload 3
      // 1a: iload 4
      // 1c: bipush 1
      // 1d: iadd
      // 1e: invokespecial bg8.r6_ (Lmew;Lvt2;I)I
      // 21: istore 5
      // 23: iload 4
      // 25: iload 5
      // 27: if_icmpeq 57
      // 2a: aload 0
      // 2b: getfield bg8.jhc Ljava/util/List;
      // 2e: new wdx
      // 31: dup
      // 32: aload 1
      // 33: iload 4
      // 35: iload 5
      // 37: if_icmpge 49
      // 3a: goto 41
      // 3d: invokestatic bg8.a (Loov;)Loov;
      // 40: athrow
      // 41: aload 2
      // 42: goto 4a
      // 45: invokestatic bg8.a (Loov;)Loov;
      // 48: athrow
      // 49: aload 3
      // 4a: aload 0
      // 4b: getfield bg8.n2a I
      // 4e: invokespecial wdx.<init> (Lmew;Lvt2;I)V
      // 51: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 56: pop
      // 57: return
   }

   private int r6_(mew param1, vt2 param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 0
      // 01: istore 5
      // 03: invokestatic t9d.b ()I
      // 06: bipush 1
      // 07: istore 6
      // 09: istore 4
      // 0b: iload 6
      // 0d: bipush 5
      // 0e: if_icmpgt 65
      // 11: aload 0
      // 12: getfield bg8.jnv Lt9d;
      // 15: aload 1
      // 16: aload 2
      // 17: iload 6
      // 19: invokevirtual mew.offset (Lvt2;I)Lmew;
      // 1c: invokevirtual t9d.cfv (Lmew;)Z
      // 1f: iload 4
      // 21: ifeq 67
      // 24: iload 4
      // 26: ifeq 52
      // 29: goto 30
      // 2c: invokestatic bg8.a (Loov;)Loov;
      // 2f: athrow
      // 30: ifeq 5d
      // 33: goto 3a
      // 36: invokestatic bg8.a (Loov;)Loov;
      // 39: athrow
      // 3a: iinc 5 1
      // 3d: iload 4
      // 3f: ifeq 60
      // 42: goto 49
      // 45: invokestatic bg8.a (Loov;)Loov;
      // 48: athrow
      // 49: iload 5
      // 4b: goto 52
      // 4e: invokestatic bg8.a (Loov;)Loov;
      // 51: athrow
      // 52: iload 3
      // 53: if_icmplt 5d
      // 56: iload 5
      // 58: ireturn
      // 59: invokestatic bg8.a (Loov;)Loov;
      // 5c: athrow
      // 5d: iinc 6 1
      // 60: iload 4
      // 62: ifne 0b
      // 65: iload 5
      // 67: ireturn
   }

   private boolean iow(mew param1) {
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
      // 05: getfield bg8.b_5 Ljava/util/List;
      // 08: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0d: astore 3
      // 0e: aload 3
      // 0f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 14: ifeq 47
      // 17: aload 3
      // 18: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1d: checkcast mew
      // 20: astore 4
      // 22: aload 4
      // 24: aload 1
      // 25: invokevirtual mew.equals (Ljava/lang/Object;)Z
      // 28: iload 2
      // 29: ifeq 48
      // 2c: iload 2
      // 2d: ifeq 42
      // 30: goto 37
      // 33: invokestatic bg8.a (Loov;)Loov;
      // 36: athrow
      // 37: ifeq 43
      // 3a: goto 41
      // 3d: invokestatic bg8.a (Loov;)Loov;
      // 40: athrow
      // 41: bipush 1
      // 42: ireturn
      // 43: iload 2
      // 44: ifne 0e
      // 47: bipush 0
      // 48: ireturn
   }

   private boolean m1u(mew param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield bg8.jnv Lt9d;
      // 08: aload 1
      // 09: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 0c: invokeinterface zfz.r_y ()Le0x; 1
      // 11: astore 3
      // 12: aload 3
      // 13: iload 2
      // 14: ifne 2c
      // 17: instanceof w4e
      // 1a: ifeq 41
      // 1d: goto 24
      // 20: invokestatic bg8.a (Loov;)Loov;
      // 23: athrow
      // 24: aload 3
      // 25: goto 2c
      // 28: invokestatic bg8.a (Loov;)Loov;
      // 2b: athrow
      // 2c: invokevirtual e0x.p1r ()Lp3y;
      // 2f: getstatic p3y.fdu Lp3y;
      // 32: if_acmpne 3d
      // 35: bipush 1
      // 36: goto 42
      // 39: invokestatic bg8.a (Loov;)Loov;
      // 3c: athrow
      // 3d: bipush 0
      // 3e: goto 42
      // 41: bipush 0
      // 42: ireturn
   }

   @Override
   public void oo1(bdo var1) {
      long var2 = a ^ 21121027401316L;
      this.n2a = var1.uz7(a<"v">(22856, 561458922922859479L ^ var2));
      qhg var5 = var1.bzb(a<"v">(27953, 2709745732619530159L ^ var2), 10);
      int var10000 = t9d.b();
      int var6 = 0;
      int var4 = var10000;

      while (var6 < var5.vek()) {
         bdo var7 = var5.kd6(var6);
         j7z var8 = new j7z();
         var8.x0m(var7);
         this.m10.add(var8);
         var6++;
         if (var4 == 0) {
            break;
         }
      }
   }

   @Override
   public void _j9(bdo var1) {
      long var2 = a ^ 82564201337333L;
      var1.iin(a<"v">(4859, 6794603414977357815L ^ var2), this.n2a);
      int var10000 = t9d.b();
      qhg var5 = new qhg();
      int var4 = var10000;
      Iterator var6 = this.m10.iterator();

      while (true) {
         if (var6.hasNext()) {
            j7z var7 = (j7z)var6.next();
            bdo var8 = new bdo();

            try {
               var7.z7g(var8);
               var5.w2j(var8);
               if (var4 == 0) {
                  break;
               }

               if (var4 != 0) {
                  continue;
               }
            } catch (oov var9) {
               throw a(var9);
            }
         }

         var1.rzm(a<"v">(21883, 7726437538767921266L ^ var2), var5);
         break;
      }
   }

   public static String m28(upn var0) {
      long var1 = a ^ 102025725807478L;
      return a<"v">(17127, 7967184940573109609L ^ var1) + var0.org();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7320632205699879480L, -8274236079370958572L, MethodHandles.lookup().lookupClass()).a(78404137355135L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 4416219380679L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[5];
      int var7 = 0;
      String var6 = "\u0096\u0019¬\u0010ªµ#\u008e÷ûb\u0080,\rGÐ\u009bÞQÚùzAD\u0010\u009f²\r\u008eXÿ\u0091îÔÖ\u0080\u0095@ vú .Y\u0090Î \u0087EIýéa\u0001êwùÖ\u0096ø'½Öxª;\u00876~\u0097^çPÈ";
      int var8 = "\u0096\u0019¬\u0010ªµ#\u008e÷ûb\u0080,\rGÐ\u009bÞQÚùzAD\u0010\u009f²\r\u008eXÿ\u0091îÔÖ\u0080\u0095@ vú .Y\u0090Î \u0087EIýéa\u0001êwùÖ\u0096ø'½Öxª;\u00876~\u0097^çPÈ"
         .length();
      char var5 = 24;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     b = var9;
                     c = new String[5];
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var20;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "\u008f;\u001e\u0080k\u0001\u0019ªÁ\u0088.M:\u0095\n8\u0018»£,\u00939@\u0019©$\u0089\u0090\u007fúÅÀø~ÈùOû\u001dS\u0017";
                  var8 = "\u008f;\u001e\u0080k\u0001\u0019ªÁ\u0088.M:\u0095\n8\u0018»£,\u00939@\u0019©$\u0089\u0090\u007fúÅÀø~ÈùOû\u001dS\u0017".length();
                  var5 = 16;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static oov a(oov var0) {
      return var0;
   }

   private static String a(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for (int var4 = 0; var4 < var2; var4++) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else if (var5 < 224) {
            char var6 = (char)((char)(var5 & 31) << 6);
            byte var8 = var0[++var4];
            var6 = (char)(var6 | (char)(var8 & 63));
            var3[var1++] = var6;
         } else if (var4 < var2 - 2) {
            char var12 = (char)((char)(var5 & 15) << '\f');
            byte var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63) << 6);
            var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63));
            var3[var1++] = var12;
         }
      }

      return new String(var3, 0, var1);
   }

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16106;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("bg8", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("bg8" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
