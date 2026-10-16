import java.io.DataInput;
import java.io.DataOutput;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;

public class qhg extends gdw {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   @Override
   public void b_8(DataOutput param1) {
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
      // 05: iload 2
      // 06: ifne 42
      // 09: getfield qhg.a7z Ljava/util/List;
      // 0c: invokeinterface java/util/List.isEmpty ()Z 1
      // 11: ifne 3a
      // 14: goto 1b
      // 17: invokestatic qhg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1a: athrow
      // 1b: aload 0
      // 1c: aload 0
      // 1d: getfield qhg.a7z Ljava/util/List;
      // 20: bipush 0
      // 21: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 26: checkcast gdw
      // 29: invokevirtual gdw.ky0 ()B
      // 2c: putfield qhg.ado B
      // 2f: iload 2
      // 30: ifeq 46
      // 33: goto 3a
      // 36: invokestatic qhg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 39: athrow
      // 3a: aload 0
      // 3b: goto 42
      // 3e: invokestatic qhg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 41: athrow
      // 42: bipush 0
      // 43: putfield qhg.ado B
      // 46: aload 1
      // 47: aload 0
      // 48: getfield qhg.ado B
      // 4b: invokeinterface java/io/DataOutput.writeByte (I)V 2
      // 50: aload 1
      // 51: aload 0
      // 52: getfield qhg.a7z Ljava/util/List;
      // 55: invokeinterface java/util/List.size ()I 1
      // 5a: invokeinterface java/io/DataOutput.writeInt (I)V 2
      // 5f: bipush 0
      // 60: istore 3
      // 61: iload 3
      // 62: aload 0
      // 63: getfield qhg.a7z Ljava/util/List;
      // 66: invokeinterface java/util/List.size ()I 1
      // 6b: if_icmpge 86
      // 6e: aload 0
      // 6f: getfield qhg.a7z Ljava/util/List;
      // 72: iload 3
      // 73: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 78: checkcast gdw
      // 7b: aload 1
      // 7c: invokevirtual gdw.b_8 (Ljava/io/DataOutput;)V
      // 7f: iinc 3 1
      // 82: iload 2
      // 83: ifeq 61
      // 86: return
   }

   @Override
   public void zwk(DataInput param1, int param2, btc param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qhg.a J
      // 03: ldc2_w 128628508125561
      // 06: lxor
      // 07: lstore 4
      // 09: invokestatic t9d.c ()I
      // 0c: istore 6
      // 0e: aload 3
      // 0f: ldc2_w 296
      // 12: invokevirtual btc.es9 (J)V
      // 15: iload 2
      // 16: iload 6
      // 18: ifne 53
      // 1b: sipush 512
      // 1e: if_icmple 43
      // 21: goto 28
      // 24: invokestatic qhg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 27: athrow
      // 28: new java/lang/RuntimeException
      // 2b: dup
      // 2c: sipush 7974
      // 2f: ldc2_w 3598921560744138386
      // 32: lload 4
      // 34: lxor
      // 35: invokedynamic z (IJ)Ljava/lang/String; bsm=qhg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: nop
      // 3b: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/String;)V
      // 3e: athrow
      // 3f: invokestatic qhg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 42: athrow
      // 43: aload 0
      // 44: aload 1
      // 45: invokeinterface java/io/DataInput.readByte ()B 1
      // 4a: putfield qhg.ado B
      // 4d: aload 1
      // 4e: invokeinterface java/io/DataInput.readInt ()I 1
      // 53: istore 7
      // 55: aload 0
      // 56: getfield qhg.ado B
      // 59: iload 6
      // 5b: ifne b0
      // 5e: ifne 9b
      // 61: goto 68
      // 64: invokestatic qhg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 67: athrow
      // 68: iload 7
      // 6a: iload 6
      // 6c: ifne b0
      // 6f: goto 76
      // 72: invokestatic qhg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 75: athrow
      // 76: ifle 9b
      // 79: goto 80
      // 7c: invokestatic qhg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 7f: athrow
      // 80: new java/lang/RuntimeException
      // 83: dup
      // 84: sipush 10635
      // 87: ldc2_w 6472182614804701242
      // 8a: lload 4
      // 8c: lxor
      // 8d: invokedynamic z (IJ)Ljava/lang/String; bsm=qhg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 92: nop
      // 93: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/String;)V
      // 96: athrow
      // 97: invokestatic qhg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 9a: athrow
      // 9b: aload 3
      // 9c: ldc2_w 32
      // 9f: iload 7
      // a1: i2l
      // a2: lmul
      // a3: invokevirtual btc.es9 (J)V
      // a6: aload 0
      // a7: iload 7
      // a9: invokestatic com/google/common/collect/Lists.newArrayListWithCapacity (I)Ljava/util/ArrayList;
      // ac: putfield qhg.a7z Ljava/util/List;
      // af: bipush 0
      // b0: istore 8
      // b2: iload 8
      // b4: iload 7
      // b6: if_icmpge e0
      // b9: aload 0
      // ba: getfield qhg.ado B
      // bd: invokestatic gdw.nt6 (B)Lgdw;
      // c0: astore 9
      // c2: aload 9
      // c4: aload 1
      // c5: iload 2
      // c6: bipush 1
      // c7: iadd
      // c8: aload 3
      // c9: invokevirtual gdw.zwk (Ljava/io/DataInput;ILbtc;)V
      // cc: aload 0
      // cd: getfield qhg.a7z Ljava/util/List;
      // d0: aload 9
      // d2: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // d7: pop
      // d8: iinc 8 1
      // db: iload 6
      // dd: ifeq b2
      // e0: return
   }

   @Override
   public byte ky0() {
      return 9;
   }

   @Override
   public String toString() {
      StringBuilder var2 = new StringBuilder("[");
      int var10000 = t9d.b();
      int var3 = 0;
      int var1 = var10000;

      while (var3 < this.a7z.size()) {
         try {
            if (var3 != 0) {
               var2.append(',');
            }
         } catch (RuntimeException var4) {
            throw a(var4);
         }

         var2.append(var3).append(':').append(this.a7z.get(var3));
         var3++;
         if (var1 == 0) {
            break;
         }
      }

      return var2.append(']').toString();
   }

   public void w2j(gdw param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qhg.a J
      // 03: ldc2_w 119714802039114
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.b ()I
      // 0b: istore 4
      // 0d: aload 1
      // 0e: invokevirtual gdw.ky0 ()B
      // 11: iload 4
      // 13: ifeq 4d
      // 16: ifne 42
      // 19: goto 20
      // 1c: invokestatic qhg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1f: athrow
      // 20: getstatic qhg.rpc Lorg/apache/logging/log4j/Logger;
      // 23: sipush 19603
      // 26: ldc2_w 3157347235148977430
      // 29: lload 2
      // 2a: lxor
      // 2b: invokedynamic z (IJ)Ljava/lang/String; bsm=qhg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30: nop
      // 31: invokeinterface org/apache/logging/log4j/Logger.warn (Ljava/lang/String;)V 2
      // 36: iload 4
      // 38: ifne b4
      // 3b: goto 42
      // 3e: invokestatic qhg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 41: athrow
      // 42: aload 0
      // 43: getfield qhg.ado B
      // 46: goto 4d
      // 49: invokestatic qhg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 4c: athrow
      // 4d: iload 4
      // 4f: ifeq 7b
      // 52: ifne 70
      // 55: goto 5c
      // 58: invokestatic qhg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 5b: athrow
      // 5c: aload 0
      // 5d: aload 1
      // 5e: invokevirtual gdw.ky0 ()B
      // 61: putfield qhg.ado B
      // 64: iload 4
      // 66: ifne a9
      // 69: goto 70
      // 6c: invokestatic qhg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 6f: athrow
      // 70: aload 0
      // 71: getfield qhg.ado B
      // 74: goto 7b
      // 77: invokestatic qhg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 7a: athrow
      // 7b: iload 4
      // 7d: ifeq b3
      // 80: aload 1
      // 81: invokevirtual gdw.ky0 ()B
      // 84: if_icmpeq a9
      // 87: goto 8e
      // 8a: invokestatic qhg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 8d: athrow
      // 8e: getstatic qhg.rpc Lorg/apache/logging/log4j/Logger;
      // 91: sipush 8599
      // 94: ldc2_w 7643515724442941460
      // 97: lload 2
      // 98: lxor
      // 99: invokedynamic z (IJ)Ljava/lang/String; bsm=qhg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9e: nop
      // 9f: invokeinterface org/apache/logging/log4j/Logger.warn (Ljava/lang/String;)V 2
      // a4: return
      // a5: invokestatic qhg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // a8: athrow
      // a9: aload 0
      // aa: getfield qhg.a7z Ljava/util/List;
      // ad: aload 1
      // ae: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // b3: pop
      // b4: return
   }

   public void z_z(int param1, gdw param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qhg.a J
      // 003: ldc2_w 88114422954572
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic t9d.b ()I
      // 00b: istore 5
      // 00d: aload 2
      // 00e: invokevirtual gdw.ky0 ()B
      // 011: iload 5
      // 013: ifeq 04a
      // 016: ifne 042
      // 019: goto 020
      // 01c: invokestatic qhg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 01f: athrow
      // 020: getstatic qhg.rpc Lorg/apache/logging/log4j/Logger;
      // 023: sipush 968
      // 026: ldc2_w 115394445919213898
      // 029: lload 3
      // 02a: lxor
      // 02b: invokedynamic z (IJ)Ljava/lang/String; bsm=qhg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 030: nop
      // 031: invokeinterface org/apache/logging/log4j/Logger.warn (Ljava/lang/String;)V 2
      // 036: iload 5
      // 038: ifne 107
      // 03b: goto 042
      // 03e: invokestatic qhg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 041: athrow
      // 042: iload 1
      // 043: goto 04a
      // 046: invokestatic qhg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 049: athrow
      // 04a: iload 5
      // 04c: ifeq 05a
      // 04f: iflt 0ea
      // 052: goto 059
      // 055: invokestatic qhg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 058: athrow
      // 059: iload 1
      // 05a: iload 5
      // 05c: ifeq 07d
      // 05f: aload 0
      // 060: getfield qhg.a7z Ljava/util/List;
      // 063: invokeinterface java/util/List.size ()I 1
      // 068: if_icmpge 0ea
      // 06b: goto 072
      // 06e: invokestatic qhg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 071: athrow
      // 072: aload 0
      // 073: getfield qhg.ado B
      // 076: goto 07d
      // 079: invokestatic qhg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 07c: athrow
      // 07d: iload 5
      // 07f: ifeq 0b7
      // 082: ifne 0a0
      // 085: goto 08c
      // 088: invokestatic qhg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 08b: athrow
      // 08c: aload 0
      // 08d: aload 2
      // 08e: invokevirtual gdw.ky0 ()B
      // 091: putfield qhg.ado B
      // 094: iload 5
      // 096: ifne 0d9
      // 099: goto 0a0
      // 09c: invokestatic qhg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 09f: athrow
      // 0a0: aload 0
      // 0a1: iload 5
      // 0a3: ifeq 0e4
      // 0a6: goto 0ad
      // 0a9: invokestatic qhg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0ac: athrow
      // 0ad: getfield qhg.ado B
      // 0b0: goto 0b7
      // 0b3: invokestatic qhg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0b6: athrow
      // 0b7: aload 2
      // 0b8: invokevirtual gdw.ky0 ()B
      // 0bb: if_icmpeq 0d9
      // 0be: getstatic qhg.rpc Lorg/apache/logging/log4j/Logger;
      // 0c1: sipush 28690
      // 0c4: ldc2_w 2194900353149282962
      // 0c7: lload 3
      // 0c8: lxor
      // 0c9: invokedynamic z (IJ)Ljava/lang/String; bsm=qhg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ce: nop
      // 0cf: invokeinterface org/apache/logging/log4j/Logger.warn (Ljava/lang/String;)V 2
      // 0d4: return
      // 0d5: invokestatic qhg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0d8: athrow
      // 0d9: aload 0
      // 0da: getfield qhg.a7z Ljava/util/List;
      // 0dd: iload 1
      // 0de: aload 2
      // 0df: invokeinterface java/util/List.set (ILjava/lang/Object;)Ljava/lang/Object; 3
      // 0e4: pop
      // 0e5: iload 5
      // 0e7: ifne 107
      // 0ea: getstatic qhg.rpc Lorg/apache/logging/log4j/Logger;
      // 0ed: sipush 17866
      // 0f0: ldc2_w 459914834326167372
      // 0f3: lload 3
      // 0f4: lxor
      // 0f5: invokedynamic z (IJ)Ljava/lang/String; bsm=qhg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa: nop
      // 0fb: invokeinterface org/apache/logging/log4j/Logger.warn (Ljava/lang/String;)V 2
      // 100: goto 107
      // 103: invokestatic qhg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 106: athrow
      // 107: return
   }

   public gdw bf3(int var1) {
      return (gdw)this.a7z.remove(var1);
   }

   @Override
   public boolean dq5() {
      return this.a7z.isEmpty();
   }

   public bdo kd6(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: iload 1
      // 05: iload 2
      // 06: ifne 14
      // 09: iflt 58
      // 0c: goto 13
      // 0f: invokestatic qhg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 12: athrow
      // 13: iload 1
      // 14: aload 0
      // 15: getfield qhg.a7z Ljava/util/List;
      // 18: invokeinterface java/util/List.size ()I 1
      // 1d: if_icmpge 58
      // 20: aload 0
      // 21: getfield qhg.a7z Ljava/util/List;
      // 24: iload 1
      // 25: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 2a: checkcast gdw
      // 2d: astore 3
      // 2e: aload 3
      // 2f: iload 2
      // 30: ifne 4a
      // 33: invokevirtual gdw.ky0 ()B
      // 36: bipush 10
      // 38: if_icmpne 50
      // 3b: goto 42
      // 3e: invokestatic qhg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 41: athrow
      // 42: aload 3
      // 43: goto 4a
      // 46: invokestatic qhg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 49: athrow
      // 4a: checkcast bdo
      // 4d: goto 57
      // 50: new bdo
      // 53: dup
      // 54: invokespecial bdo.<init> ()V
      // 57: areturn
      // 58: new bdo
      // 5b: dup
      // 5c: invokespecial bdo.<init> ()V
      // 5f: areturn
   }

   public int[] y90(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: iload 1
      // 05: iload 2
      // 06: ifne 67
      // 09: iflt 66
      // 0c: goto 13
      // 0f: invokestatic qhg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 12: athrow
      // 13: iload 1
      // 14: iload 2
      // 15: ifne 67
      // 18: goto 1f
      // 1b: invokestatic qhg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1e: athrow
      // 1f: aload 0
      // 20: getfield qhg.a7z Ljava/util/List;
      // 23: invokeinterface java/util/List.size ()I 1
      // 28: if_icmpge 66
      // 2b: goto 32
      // 2e: invokestatic qhg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 31: athrow
      // 32: aload 0
      // 33: getfield qhg.a7z Ljava/util/List;
      // 36: iload 1
      // 37: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 3c: checkcast gdw
      // 3f: astore 3
      // 40: aload 3
      // 41: invokevirtual gdw.ky0 ()B
      // 44: iload 2
      // 45: ifne 63
      // 48: bipush 11
      // 4a: if_icmpne 62
      // 4d: goto 54
      // 50: invokestatic qhg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 53: athrow
      // 54: aload 3
      // 55: checkcast mvq
      // 58: invokevirtual mvq.n04 ()[I
      // 5b: goto 65
      // 5e: invokestatic qhg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 61: athrow
      // 62: bipush 0
      // 63: newarray 10
      // 65: areturn
      // 66: bipush 0
      // 67: newarray 10
      // 69: areturn
   }

   public double ho9(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: iload 1
      // 05: iload 2
      // 06: ifne 14
      // 09: iflt 55
      // 0c: goto 13
      // 0f: invokestatic qhg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 12: athrow
      // 13: iload 1
      // 14: aload 0
      // 15: getfield qhg.a7z Ljava/util/List;
      // 18: invokeinterface java/util/List.size ()I 1
      // 1d: if_icmpge 55
      // 20: aload 0
      // 21: getfield qhg.a7z Ljava/util/List;
      // 24: iload 1
      // 25: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 2a: checkcast gdw
      // 2d: astore 3
      // 2e: aload 3
      // 2f: iload 2
      // 30: ifne 4a
      // 33: invokevirtual gdw.ky0 ()B
      // 36: bipush 6
      // 38: if_icmpne 53
      // 3b: goto 42
      // 3e: invokestatic qhg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 41: athrow
      // 42: aload 3
      // 43: goto 4a
      // 46: invokestatic qhg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 49: athrow
      // 4a: checkcast ok6
      // 4d: invokevirtual ok6.td3 ()D
      // 50: goto 54
      // 53: dconst_0
      // 54: dreturn
      // 55: dconst_0
      // 56: dreturn
   }

   public float ofd(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: iload 1
      // 05: iload 2
      // 06: ifeq 14
      // 09: iflt 54
      // 0c: goto 13
      // 0f: invokestatic qhg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 12: athrow
      // 13: iload 1
      // 14: aload 0
      // 15: getfield qhg.a7z Ljava/util/List;
      // 18: invokeinterface java/util/List.size ()I 1
      // 1d: if_icmpge 54
      // 20: aload 0
      // 21: getfield qhg.a7z Ljava/util/List;
      // 24: iload 1
      // 25: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 2a: checkcast gdw
      // 2d: astore 3
      // 2e: aload 3
      // 2f: iload 2
      // 30: ifeq 49
      // 33: invokevirtual gdw.ky0 ()B
      // 36: bipush 5
      // 37: if_icmpne 52
      // 3a: goto 41
      // 3d: invokestatic qhg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 40: athrow
      // 41: aload 3
      // 42: goto 49
      // 45: invokestatic qhg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 48: athrow
      // 49: checkcast n8i
      // 4c: invokevirtual n8i.qaj ()F
      // 4f: goto 53
      // 52: fconst_0
      // 53: freturn
      // 54: fconst_0
      // 55: freturn
   }

   public String mqs(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: iload 1
      // 05: iload 2
      // 06: ifeq 14
      // 09: iflt 52
      // 0c: goto 13
      // 0f: invokestatic qhg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 12: athrow
      // 13: iload 1
      // 14: aload 0
      // 15: getfield qhg.a7z Ljava/util/List;
      // 18: invokeinterface java/util/List.size ()I 1
      // 1d: if_icmpge 52
      // 20: aload 0
      // 21: getfield qhg.a7z Ljava/util/List;
      // 24: iload 1
      // 25: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 2a: checkcast gdw
      // 2d: astore 3
      // 2e: aload 3
      // 2f: iload 2
      // 30: ifeq 4e
      // 33: invokevirtual gdw.ky0 ()B
      // 36: bipush 8
      // 38: if_icmpne 4d
      // 3b: goto 42
      // 3e: invokestatic qhg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 41: athrow
      // 42: aload 3
      // 43: invokevirtual gdw.ocr ()Ljava/lang/String;
      // 46: goto 51
      // 49: invokestatic qhg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 4c: athrow
      // 4d: aload 3
      // 4e: invokevirtual gdw.toString ()Ljava/lang/String;
      // 51: areturn
      // 52: ldc ""
      // 54: nop
      // 55: areturn
   }

   public gdw b7q(int var1) {
      int var2 = t9d.b();

      int var10000;
      label27: {
         try {
            var10000 = var1;
            if (var2 == 0) {
               break label27;
            }

            if (var1 < 0) {
               return new zv6();
            }
         } catch (RuntimeException var4) {
            throw a(var4);
         }

         var10000 = var1;
      }

      try {
         if (var10000 < this.a7z.size()) {
            return (gdw)this.a7z.get(var1);
         }
      } catch (RuntimeException var3) {
         throw a(var3);
      }

      return new zv6();
   }

   public int vek() {
      return this.a7z.size();
   }

   @Override
   public gdw h33() {
      qhg var2 = new qhg();
      int var10000 = t9d.c();
      var2.ado = this.ado;
      int var1 = var10000;
      Iterator var3 = this.a7z.iterator();

      while (true) {
         if (var3.hasNext()) {
            gdw var4 = (gdw)var3.next();
            gdw var5 = var4.h33();

            try {
               var7 = var2;
               if (var1 != 0) {
                  break;
               }

               var2.a7z.add(var5);
               if (var1 == 0) {
                  continue;
               }
            } catch (RuntimeException var6) {
               throw a(var6);
            }
         }

         var7 = var2;
         break;
      }

      return var7;
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
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: aload 1
      // 06: invokespecial gdw.equals (Ljava/lang/Object;)Z
      // 09: iload 2
      // 0a: ifeq 45
      // 0d: ifeq 44
      // 10: goto 17
      // 13: invokestatic qhg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 16: athrow
      // 17: aload 1
      // 18: checkcast qhg
      // 1b: astore 3
      // 1c: aload 0
      // 1d: getfield qhg.ado B
      // 20: iload 2
      // 21: ifeq 45
      // 24: aload 3
      // 25: getfield qhg.ado B
      // 28: if_icmpne 44
      // 2b: goto 32
      // 2e: invokestatic qhg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 31: athrow
      // 32: aload 0
      // 33: getfield qhg.a7z Ljava/util/List;
      // 36: aload 3
      // 37: getfield qhg.a7z Ljava/util/List;
      // 3a: invokeinterface java/util/List.equals (Ljava/lang/Object;)Z 2
      // 3f: ireturn
      // 40: invokestatic qhg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 43: athrow
      // 44: bipush 0
      // 45: ireturn
   }

   @Override
   public int hashCode() {
      return super.hashCode() ^ this.a7z.hashCode();
   }

   public int uoe() {
      return this.ado;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6333954951600138209L, 6358015231250268667L, MethodHandles.lookup().lookupClass()).a(164036504328726L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 81306066356226L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[7];
      int var7 = 0;
      String var6 = "ÑZ\u00ad ©\u0091¿ýÔÕÿ=Cvò¿\u0087\u008a\u000eÞèeåO\u0097\u0086*GË\u001f\u0015Ñºûs\u0081Q\u0012r»ß\u0000¤u\r\u0011þ¨\u0007Òöå\u009cÚ\u000fB§*ÊYî¥íÜ\u0083èÔÄ\u0083qÄw3D\u009deÀ\u009d\u000b¬h\u0007¹¸&tøç@â\u009dï\u008a?\u000e\u0014å\u0001ÛL;õ3\u007f¨ \u0016slÙ·ÌnÜ\u0016ÝHÊ2yFKK?1nG\u001a\u008aÔ\u009d°HÀô\r\u0094\u009b\u008a§\u0010\u00819\u0096û\u0018oÞÅ\u0018\u0094þ±>muÓiÔÞ\u008cR?Xí½=?ÓÃOUyÐf \u009a\u009dâ>ó4Q\u009a¶0rYD\u0097kºz\u0082\u001a6mM\u000ei\u0094\u00918\u008a/\n\u001by\u0007i\n/½\u0083\t¾n\u0086\u0090ÀF\u009cÓ£\u008bâ¿\u009d[×¶&t\u007f0\u001f½kßíÜ\u0011\u008abW}\u008b\u0087L\u0012\u0097\u00895¦\u0016\u001eè\níIö\u0003æòq\u001b\u008fû\u0004<\\y\u0019é··¦\u0086÷õ%ÞÉ(¾%·U\u009c¸\u0088\u0084@\u0082¿µóKw\u008eßþÉ\u0081\u0098É0[ÙÈmX\u0091éþ:[Xs\u0088¹ãl¤";
      int var8 = "ÑZ\u00ad ©\u0091¿ýÔÕÿ=Cvò¿\u0087\u008a\u000eÞèeåO\u0097\u0086*GË\u001f\u0015Ñºûs\u0081Q\u0012r»ß\u0000¤u\r\u0011þ¨\u0007Òöå\u009cÚ\u000fB§*ÊYî¥íÜ\u0083èÔÄ\u0083qÄw3D\u009deÀ\u009d\u000b¬h\u0007¹¸&tøç@â\u009dï\u008a?\u000e\u0014å\u0001ÛL;õ3\u007f¨ \u0016slÙ·ÌnÜ\u0016ÝHÊ2yFKK?1nG\u001a\u008aÔ\u009d°HÀô\r\u0094\u009b\u008a§\u0010\u00819\u0096û\u0018oÞÅ\u0018\u0094þ±>muÓiÔÞ\u008cR?Xí½=?ÓÃOUyÐf \u009a\u009dâ>ó4Q\u009a¶0rYD\u0097kºz\u0082\u001a6mM\u000ei\u0094\u00918\u008a/\n\u001by\u0007i\n/½\u0083\t¾n\u0086\u0090ÀF\u009cÓ£\u008bâ¿\u009d[×¶&t\u007f0\u001f½kßíÜ\u0011\u008abW}\u008b\u0087L\u0012\u0097\u00895¦\u0016\u001eè\níIö\u0003æòq\u001b\u008fû\u0004<\\y\u0019é··¦\u0086÷õ%ÞÉ(¾%·U\u009c¸\u0088\u0084@\u0082¿µóKw\u008eßþÉ\u0081\u0098É0[ÙÈmX\u0091éþ:[Xs\u0088¹ãl¤"
         .length();
      char var5 = 'P';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     b = var9;
                     c = new String[7];
                     rpc = LogManager.getLogger();
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

                  var6 = "È[lB¿\u0016átÛã\u007fHE»þ\u0082oµË'\u0089Åz?3b(t\u0001 \u0096Ü\"\u00140mö\u0004\u007f8\u0017Ç\u0016Q~~Ve\u008aÊÁ\"\u001fB \f×`²âç<~\u0085cíáó\u0086\u00adÓßn\rÈ7ÔGAKP\u001b:\u0000ï\u0002\u0001÷\u0016p\u0091èHÜª\u0090-\u0088Û$`2vNjt,|ÇNÄ¯Uï\u00118Kf\u0015\u0015ùb\u009fµc\u0010\u0017å8\u00848Ù¿xºÝð®\u0092Ðg\u007fÄ\u0088®\u00ad\u009b²Ö>C/\u0092³\u0014?Q\u0083\r¡D";
                  var8 = "È[lB¿\u0016átÛã\u007fHE»þ\u0082oµË'\u0089Åz?3b(t\u0001 \u0096Ü\"\u00140mö\u0004\u007f8\u0017Ç\u0016Q~~Ve\u008aÊÁ\"\u001fB \f×`²âç<~\u0085cíáó\u0086\u00adÓßn\rÈ7ÔGAKP\u001b:\u0000ï\u0002\u0001÷\u0016p\u0091èHÜª\u0090-\u0088Û$`2vNjt,|ÇNÄ¯Uï\u00118Kf\u0015\u0015ùb\u009fµc\u0010\u0017å8\u00848Ù¿xºÝð®\u0092Ðg\u007fÄ\u0088®\u00ad\u009b²Ö>C/\u0092³\u0014?Q\u0083\r¡D"
                     .length();
                  var5 = 'P';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }

   private static String b(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 18385;
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
            throw new RuntimeException("qhg", var10);
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
         c[var5] = b(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("qhg" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
