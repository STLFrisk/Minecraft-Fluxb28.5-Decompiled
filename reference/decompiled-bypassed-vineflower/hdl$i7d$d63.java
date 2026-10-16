import com.google.common.collect.UnmodifiableIterator;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class hdl$i7d$d63 extends UnmodifiableIterator {
   private int xca = -2;
   private final Iterable[] i1q;
   private final Iterator[] roj;
   private final Object[] djg;

   private hdl$i7d$d63(Class var1, Iterable[] var2) {
      int var10000 = t9d.c();
      this.i1q = var2;
      this.roj = (Iterator[])hdl.w5z(Iterator.class, this.i1q.length);
      int var3 = var10000;
      int var4 = 0;

      while (true) {
         if (var4 < this.i1q.length) {
            try {
               this.roj[var4] = var2[var4].iterator();
               var4++;
               if (var3 != 0) {
                  break;
               }

               if (var3 == 0) {
                  continue;
               }
            } catch (NoSuchElementException var5) {
               throw a(var5);
            }
         }

         this.djg = hdl.w5z(var1, this.roj.length);
         break;
      }
   }

   private void beg() {
      this.xca = -1;
      Arrays.fill(this.roj, null);
      Arrays.fill(this.djg, null);
   }

   public boolean hasNext() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 1
      // 004: aload 0
      // 005: getfield hdl$i7d$d63.xca I
      // 008: bipush -2
      // 00a: iload 1
      // 00b: ifne 087
      // 00e: if_icmpne 073
      // 011: goto 018
      // 014: invokestatic hdl$i7d$d63.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 017: athrow
      // 018: aload 0
      // 019: bipush 0
      // 01a: putfield hdl$i7d$d63.xca I
      // 01d: aload 0
      // 01e: getfield hdl$i7d$d63.roj [Ljava/util/Iterator;
      // 021: astore 2
      // 022: aload 2
      // 023: arraylength
      // 024: istore 3
      // 025: bipush 0
      // 026: istore 4
      // 028: iload 4
      // 02a: iload 3
      // 02b: if_icmpge 071
      // 02e: aload 2
      // 02f: iload 4
      // 031: aaload
      // 032: astore 5
      // 034: iload 1
      // 035: ifne 06d
      // 038: aload 5
      // 03a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 03f: iload 1
      // 040: ifne 072
      // 043: goto 04a
      // 046: invokestatic hdl$i7d$d63.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 049: athrow
      // 04a: ifne 063
      // 04d: goto 054
      // 050: invokestatic hdl$i7d$d63.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 053: athrow
      // 054: aload 0
      // 055: invokespecial hdl$i7d$d63.beg ()V
      // 058: iload 1
      // 059: ifeq 071
      // 05c: goto 063
      // 05f: invokestatic hdl$i7d$d63.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 062: athrow
      // 063: iinc 4 1
      // 066: goto 06d
      // 069: invokestatic hdl$i7d$d63.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 06c: athrow
      // 06d: iload 1
      // 06e: ifeq 028
      // 071: bipush 1
      // 072: ireturn
      // 073: aload 0
      // 074: getfield hdl$i7d$d63.xca I
      // 077: iload 1
      // 078: ifne 145
      // 07b: aload 0
      // 07c: getfield hdl$i7d$d63.roj [Ljava/util/Iterator;
      // 07f: arraylength
      // 080: goto 087
      // 083: invokestatic hdl$i7d$d63.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 086: athrow
      // 087: if_icmplt 141
      // 08a: aload 0
      // 08b: aload 0
      // 08c: getfield hdl$i7d$d63.roj [Ljava/util/Iterator;
      // 08f: arraylength
      // 090: bipush 1
      // 091: isub
      // 092: putfield hdl$i7d$d63.xca I
      // 095: goto 09c
      // 098: invokestatic hdl$i7d$d63.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 09b: athrow
      // 09c: aload 0
      // 09d: getfield hdl$i7d$d63.xca I
      // 0a0: iflt 141
      // 0a3: aload 0
      // 0a4: getfield hdl$i7d$d63.roj [Ljava/util/Iterator;
      // 0a7: aload 0
      // 0a8: getfield hdl$i7d$d63.xca I
      // 0ab: aaload
      // 0ac: astore 2
      // 0ad: aload 2
      // 0ae: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0b3: iload 1
      // 0b4: ifne 145
      // 0b7: iload 1
      // 0b8: ifne 0d3
      // 0bb: goto 0c2
      // 0be: invokestatic hdl$i7d$d63.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0c1: athrow
      // 0c2: ifeq 0cf
      // 0c5: goto 0cc
      // 0c8: invokestatic hdl$i7d$d63.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0cb: athrow
      // 0cc: goto 141
      // 0cf: aload 0
      // 0d0: getfield hdl$i7d$d63.xca I
      // 0d3: iload 1
      // 0d4: ifne 11a
      // 0d7: ifne 0f0
      // 0da: goto 0e1
      // 0dd: invokestatic hdl$i7d$d63.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0e0: athrow
      // 0e1: aload 0
      // 0e2: invokespecial hdl$i7d$d63.beg ()V
      // 0e5: iload 1
      // 0e6: ifeq 141
      // 0e9: goto 0f0
      // 0ec: invokestatic hdl$i7d$d63.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 0ef: athrow
      // 0f0: aload 0
      // 0f1: getfield hdl$i7d$d63.i1q [Ljava/lang/Iterable;
      // 0f4: aload 0
      // 0f5: getfield hdl$i7d$d63.xca I
      // 0f8: aaload
      // 0f9: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 0fe: astore 2
      // 0ff: aload 0
      // 100: getfield hdl$i7d$d63.roj [Ljava/util/Iterator;
      // 103: aload 0
      // 104: getfield hdl$i7d$d63.xca I
      // 107: aload 2
      // 108: aastore
      // 109: iload 1
      // 10a: ifne 13d
      // 10d: aload 2
      // 10e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 113: goto 11a
      // 116: invokestatic hdl$i7d$d63.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 119: athrow
      // 11a: ifne 12c
      // 11d: aload 0
      // 11e: invokespecial hdl$i7d$d63.beg ()V
      // 121: iload 1
      // 122: ifeq 141
      // 125: goto 12c
      // 128: invokestatic hdl$i7d$d63.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 12b: athrow
      // 12c: aload 0
      // 12d: dup
      // 12e: getfield hdl$i7d$d63.xca I
      // 131: bipush 1
      // 132: isub
      // 133: putfield hdl$i7d$d63.xca I
      // 136: goto 13d
      // 139: invokestatic hdl$i7d$d63.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 13c: athrow
      // 13d: iload 1
      // 13e: ifeq 09c
      // 141: aload 0
      // 142: getfield hdl$i7d$d63.xca I
      // 145: iload 1
      // 146: ifne 154
      // 149: iflt 157
      // 14c: goto 153
      // 14f: invokestatic hdl$i7d$d63.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 152: athrow
      // 153: bipush 1
      // 154: goto 158
      // 157: bipush 0
      // 158: ireturn
   }

   public Object[] next() {
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
      // 05: invokevirtual hdl$i7d$d63.hasNext ()Z
      // 08: iload 1
      // 09: ifeq 26
      // 0c: ifne 22
      // 0f: goto 16
      // 12: invokestatic hdl$i7d$d63.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 15: athrow
      // 16: new java/util/NoSuchElementException
      // 19: dup
      // 1a: invokespecial java/util/NoSuchElementException.<init> ()V
      // 1d: athrow
      // 1e: invokestatic hdl$i7d$d63.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 21: athrow
      // 22: aload 0
      // 23: getfield hdl$i7d$d63.xca I
      // 26: aload 0
      // 27: getfield hdl$i7d$d63.roj [Ljava/util/Iterator;
      // 2a: arraylength
      // 2b: if_icmpge 65
      // 2e: aload 0
      // 2f: getfield hdl$i7d$d63.djg [Ljava/lang/Object;
      // 32: aload 0
      // 33: getfield hdl$i7d$d63.xca I
      // 36: aload 0
      // 37: getfield hdl$i7d$d63.roj [Ljava/util/Iterator;
      // 3a: aload 0
      // 3b: getfield hdl$i7d$d63.xca I
      // 3e: aaload
      // 3f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 44: aastore
      // 45: aload 0
      // 46: iload 1
      // 47: ifeq 6c
      // 4a: goto 51
      // 4d: invokestatic hdl$i7d$d63.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 50: athrow
      // 51: dup
      // 52: getfield hdl$i7d$d63.xca I
      // 55: bipush 1
      // 56: iadd
      // 57: putfield hdl$i7d$d63.xca I
      // 5a: iload 1
      // 5b: ifne 22
      // 5e: goto 65
      // 61: invokestatic hdl$i7d$d63.a (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
      // 64: athrow
      // 65: aload 0
      // 66: getfield hdl$i7d$d63.djg [Ljava/lang/Object;
      // 69: invokevirtual [Ljava/lang/Object;.clone ()Ljava/lang/Object;
      // 6c: checkcast [Ljava/lang/Object;
      // 6f: checkcast [Ljava/lang/Object;
      // 72: checkcast [Ljava/lang/Object;
      // 75: areturn
   }

   public Object next() {
      return this.next();
   }

   public hdl$i7d$d63(Class var1, Iterable[] var2, hdl$1 var3) {
      this(var1, var2);
   }

   private static NoSuchElementException a(NoSuchElementException var0) {
      return var0;
   }
}
