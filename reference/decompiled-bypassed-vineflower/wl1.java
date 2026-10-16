import com.google.common.collect.Maps;
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
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class wl1 {
   private final i2h h_w;
   private boolean h8_ = true;
   private static final Map agj;
   private final Map gp5 = Maps.newHashMap();
   private boolean pmf;
   private ReadWriteLock yw2 = new ReentrantReadWriteLock();
   public gyu u7z = gyu.wqh;
   public mew coa = mew._9b;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public wl1(i2h var1) {
      this.h_w = var1;
   }

   public void kp2(int param1, Object param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic wl1.a J
      // 003: ldc2_w 106079830163352
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic t9d.b ()I
      // 00b: istore 5
      // 00d: getstatic wl1.agj Ljava/util/Map;
      // 010: aload 2
      // 011: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 014: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 019: checkcast java/lang/Integer
      // 01c: astore 6
      // 01e: aload 6
      // 020: ifnonnull 051
      // 023: new java/lang/IllegalArgumentException
      // 026: dup
      // 027: new java/lang/StringBuilder
      // 02a: dup
      // 02b: invokespecial java/lang/StringBuilder.<init> ()V
      // 02e: sipush 2346
      // 031: ldc2_w 530872676641450046
      // 034: lload 3
      // 035: lxor
      // 036: invokedynamic i (IJ)Ljava/lang/String; bsm=wl1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03b: nop
      // 03c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 03f: aload 2
      // 040: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 043: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 046: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 049: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 04c: athrow
      // 04d: invokestatic wl1.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 050: athrow
      // 051: iload 1
      // 052: iload 5
      // 054: ifeq 0b7
      // 057: bipush 31
      // 059: if_icmple 0aa
      // 05c: goto 063
      // 05f: invokestatic wl1.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 062: athrow
      // 063: new java/lang/IllegalArgumentException
      // 066: dup
      // 067: new java/lang/StringBuilder
      // 06a: dup
      // 06b: invokespecial java/lang/StringBuilder.<init> ()V
      // 06e: sipush 17118
      // 071: ldc2_w 7245643206176891855
      // 074: lload 3
      // 075: lxor
      // 076: invokedynamic i (IJ)Ljava/lang/String; bsm=wl1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07b: nop
      // 07c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 07f: iload 1
      // 080: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 083: sipush 29119
      // 086: ldc2_w 6940224017765388456
      // 089: lload 3
      // 08a: lxor
      // 08b: invokedynamic i (IJ)Ljava/lang/String; bsm=wl1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 090: nop
      // 091: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 094: bipush 31
      // 096: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 099: ldc ")"
      // 09b: nop
      // 09c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0a2: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 0a5: athrow
      // 0a6: invokestatic wl1.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a9: athrow
      // 0aa: aload 0
      // 0ab: getfield wl1.gp5 Ljava/util/Map;
      // 0ae: iload 1
      // 0af: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0b2: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 0b7: ifeq 0eb
      // 0ba: new java/lang/IllegalArgumentException
      // 0bd: dup
      // 0be: new java/lang/StringBuilder
      // 0c1: dup
      // 0c2: invokespecial java/lang/StringBuilder.<init> ()V
      // 0c5: sipush 15167
      // 0c8: ldc2_w 308475854391777833
      // 0cb: lload 3
      // 0cc: lxor
      // 0cd: invokedynamic i (IJ)Ljava/lang/String; bsm=wl1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d2: nop
      // 0d3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d6: iload 1
      // 0d7: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0da: ldc "!"
      // 0dc: nop
      // 0dd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0e3: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 0e6: athrow
      // 0e7: invokestatic wl1.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ea: athrow
      // 0eb: new wl1$qyc
      // 0ee: dup
      // 0ef: aload 6
      // 0f1: invokevirtual java/lang/Integer.intValue ()I
      // 0f4: iload 1
      // 0f5: aload 2
      // 0f6: invokespecial wl1$qyc.<init> (IILjava/lang/Object;)V
      // 0f9: astore 7
      // 0fb: aload 0
      // 0fc: getfield wl1.yw2 Ljava/util/concurrent/locks/ReadWriteLock;
      // 0ff: invokeinterface java/util/concurrent/locks/ReadWriteLock.writeLock ()Ljava/util/concurrent/locks/Lock; 1
      // 104: invokeinterface java/util/concurrent/locks/Lock.lock ()V 1
      // 109: aload 0
      // 10a: getfield wl1.gp5 Ljava/util/Map;
      // 10d: iload 1
      // 10e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 111: aload 7
      // 113: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 118: pop
      // 119: aload 0
      // 11a: getfield wl1.yw2 Ljava/util/concurrent/locks/ReadWriteLock;
      // 11d: invokeinterface java/util/concurrent/locks/ReadWriteLock.writeLock ()Ljava/util/concurrent/locks/Lock; 1
      // 122: invokeinterface java/util/concurrent/locks/Lock.unlock ()V 1
      // 127: aload 0
      // 128: bipush 0
      // 129: putfield wl1.h8_ Z
      // 12c: return
   }

   public void _i_(int var1, int var2) {
      wl1$qyc var3 = new wl1$qyc(var2, var1, null);
      this.yw2.writeLock().lock();
      this.gp5.put(var1, var3);
      this.yw2.writeLock().unlock();
      this.h8_ = false;
   }

   public byte miz(int var1) {
      return (Byte)this.fb4(var1).x7y();
   }

   public short vxp(int var1) {
      return (Short)this.fb4(var1).x7y();
   }

   public int zwc(int var1) {
      return (Integer)this.fb4(var1).x7y();
   }

   public float ig2(int var1) {
      return (Float)this.fb4(var1).x7y();
   }

   public String bsd(int var1) {
      return (String)this.fb4(var1).x7y();
   }

   public erg qh4(int var1) {
      return (erg)this.fb4(var1).x7y();
   }

   private wl1$qyc fb4(int var1) {
      long var2 = a ^ 69169514857076L;
      this.yw2.readLock().lock();

      wl1$qyc var4;
      try {
         var4 = (wl1$qyc)this.gp5.get(var1);
      } catch (Throwable var8) {
         e1i var6 = e1i.cor(var8, a<"i">(32610, 3034423989375345563L ^ var2));
         wsc var7 = var6.i_r(a<"i">(16953, 8184859037855588038L ^ var2));
         var7._0p(a<"i">(19501, 4933470497300975825L ^ var2), var1);
         throw new oov(var6);
      }

      this.yw2.readLock().unlock();
      return var4;
   }

   public wis n68(int var1) {
      return (wis)this.fb4(var1).x7y();
   }

   public void c66(int param1, Object param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: aload 0
      // 05: iload 1
      // 06: invokespecial wl1.fb4 (I)Lwl1$qyc;
      // 09: astore 4
      // 0b: iload 3
      // 0c: ifne 3d
      // 0f: aload 2
      // 10: aload 4
      // 12: invokevirtual wl1$qyc.x7y ()Ljava/lang/Object;
      // 15: invokestatic org/apache/commons/lang3/ObjectUtils.notEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 18: ifeq 42
      // 1b: goto 22
      // 1e: invokestatic wl1.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 21: athrow
      // 22: aload 4
      // 24: aload 2
      // 25: invokevirtual wl1$qyc.l_0 (Ljava/lang/Object;)V
      // 28: aload 0
      // 29: getfield wl1.h_w Li2h;
      // 2c: iload 1
      // 2d: invokevirtual i2h.jcg (I)V
      // 30: aload 4
      // 32: bipush 1
      // 33: invokevirtual wl1$qyc.xzt (Z)V
      // 36: goto 3d
      // 39: invokestatic wl1.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3c: athrow
      // 3d: aload 0
      // 3e: bipush 1
      // 3f: putfield wl1.pmf Z
      // 42: return
   }

   public void pqa(int var1) {
      wl1$qyc.h1k(this.fb4(var1), true);
      this.pmf = true;
   }

   public boolean jmu() {
      return this.pmf;
   }

   public static void q_y(List var0, nfj var1) {
      int var2 = t9d.b();

      label45: {
         List var10000;
         label39: {
            try {
               var10000 = var0;
               if (var2 == 0) {
                  break label39;
               }

               if (var0 == null) {
                  break label45;
               }
            } catch (IllegalArgumentException var6) {
               throw a(var6);
            }

            var10000 = var0;
         }

         for (wl1$qyc var4 : var10000) {
            try {
               flw(var1, var4);
               if (var2 == 0) {
                  return;
               }

               if (var2 == 0) {
                  break;
               }
            } catch (IllegalArgumentException var5) {
               throw a(var5);
            }
         }
      }

      var1.writeByte(127);
   }

   public List cs_() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: aconst_null
      // 05: astore 2
      // 06: aload 0
      // 07: iload 1
      // 08: ifeq 2e
      // 0b: getfield wl1.pmf Z
      // 0e: ifeq a9
      // 11: goto 18
      // 14: invokestatic wl1.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 17: athrow
      // 18: aload 0
      // 19: getfield wl1.yw2 Ljava/util/concurrent/locks/ReadWriteLock;
      // 1c: invokeinterface java/util/concurrent/locks/ReadWriteLock.readLock ()Ljava/util/concurrent/locks/Lock; 1
      // 21: invokeinterface java/util/concurrent/locks/Lock.lock ()V 1
      // 26: aload 0
      // 27: goto 2e
      // 2a: invokestatic wl1.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2d: athrow
      // 2e: getfield wl1.gp5 Ljava/util/Map;
      // 31: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // 36: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 3b: astore 3
      // 3c: aload 3
      // 3d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 42: ifeq 9b
      // 45: aload 3
      // 46: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 4b: checkcast wl1$qyc
      // 4e: astore 4
      // 50: iload 1
      // 51: ifeq ae
      // 54: aload 4
      // 56: iload 1
      // 57: ifeq 77
      // 5a: goto 61
      // 5d: invokestatic wl1.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 60: athrow
      // 61: invokevirtual wl1$qyc.co1 ()Z
      // 64: ifeq 97
      // 67: goto 6e
      // 6a: invokestatic wl1.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6d: athrow
      // 6e: aload 4
      // 70: goto 77
      // 73: invokestatic wl1.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 76: athrow
      // 77: bipush 0
      // 78: invokevirtual wl1$qyc.xzt (Z)V
      // 7b: aload 2
      // 7c: iload 1
      // 7d: ifeq 8f
      // 80: ifnonnull 8e
      // 83: goto 8a
      // 86: invokestatic wl1.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 89: athrow
      // 8a: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 8d: astore 2
      // 8e: aload 2
      // 8f: aload 4
      // 91: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 96: pop
      // 97: iload 1
      // 98: ifne 3c
      // 9b: aload 0
      // 9c: getfield wl1.yw2 Ljava/util/concurrent/locks/ReadWriteLock;
      // 9f: invokeinterface java/util/concurrent/locks/ReadWriteLock.readLock ()Ljava/util/concurrent/locks/Lock; 1
      // a4: invokeinterface java/util/concurrent/locks/Lock.unlock ()V 1
      // a9: aload 0
      // aa: bipush 0
      // ab: putfield wl1.pmf Z
      // ae: aload 2
      // af: areturn
   }

   public void i3t(nfj var1) {
      this.yw2.readLock().lock();
      int var10000 = t9d.c();
      Iterator var3 = this.gp5.values().iterator();
      int var2 = var10000;

      while (true) {
         if (var3.hasNext()) {
            wl1$qyc var4 = (wl1$qyc)var3.next();

            try {
               flw(var1, var4);
               if (var2 != 0) {
                  break;
               }

               if (var2 == 0) {
                  continue;
               }
            } catch (IllegalArgumentException var5) {
               throw a(var5);
            }
         }

         this.yw2.readLock().unlock();
         var1.writeByte(127);
         break;
      }
   }

   public List bc2() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aconst_null
      // 01: astore 2
      // 02: invokestatic t9d.b ()I
      // 05: aload 0
      // 06: getfield wl1.yw2 Ljava/util/concurrent/locks/ReadWriteLock;
      // 09: invokeinterface java/util/concurrent/locks/ReadWriteLock.readLock ()Ljava/util/concurrent/locks/Lock; 1
      // 0e: invokeinterface java/util/concurrent/locks/Lock.lock ()V 1
      // 13: istore 1
      // 14: aload 0
      // 15: getfield wl1.gp5 Ljava/util/Map;
      // 18: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // 1d: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 22: astore 3
      // 23: aload 3
      // 24: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 29: ifeq 62
      // 2c: aload 3
      // 2d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 32: checkcast wl1$qyc
      // 35: astore 4
      // 37: aload 2
      // 38: iload 1
      // 39: ifeq 71
      // 3c: iload 1
      // 3d: ifeq 56
      // 40: goto 47
      // 43: invokestatic wl1.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 46: athrow
      // 47: ifnonnull 55
      // 4a: goto 51
      // 4d: invokestatic wl1.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 50: athrow
      // 51: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 54: astore 2
      // 55: aload 2
      // 56: aload 4
      // 58: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 5d: pop
      // 5e: iload 1
      // 5f: ifne 23
      // 62: aload 0
      // 63: getfield wl1.yw2 Ljava/util/concurrent/locks/ReadWriteLock;
      // 66: invokeinterface java/util/concurrent/locks/ReadWriteLock.readLock ()Ljava/util/concurrent/locks/Lock; 1
      // 6b: invokeinterface java/util/concurrent/locks/Lock.unlock ()V 1
      // 70: aload 2
      // 71: areturn
   }

   private static void flw(nfj param0, wl1$qyc param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 2
      // 004: aload 1
      // 005: invokevirtual wl1$qyc.f28 ()I
      // 008: bipush 5
      // 009: ishl
      // 00a: aload 1
      // 00b: invokevirtual wl1$qyc.a4k ()I
      // 00e: bipush 31
      // 010: iand
      // 011: ior
      // 012: sipush 255
      // 015: iand
      // 016: istore 3
      // 017: aload 0
      // 018: iload 3
      // 019: invokevirtual nfj.writeByte (I)Lio/netty/buffer/ByteBuf;
      // 01c: pop
      // 01d: iload 2
      // 01e: ifne 06e
      // 021: aload 1
      // 022: invokevirtual wl1$qyc.f28 ()I
      // 025: tableswitch 279 0 7 51 77 103 129 155 178 197 240
      // 054: invokestatic wl1.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 057: athrow
      // 058: aload 0
      // 059: aload 1
      // 05a: invokevirtual wl1$qyc.x7y ()Ljava/lang/Object;
      // 05d: checkcast java/lang/Byte
      // 060: invokevirtual java/lang/Byte.byteValue ()B
      // 063: invokevirtual nfj.writeByte (I)Lio/netty/buffer/ByteBuf;
      // 066: pop
      // 067: goto 06e
      // 06a: invokestatic wl1.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 06d: athrow
      // 06e: iload 2
      // 06f: ifeq 13c
      // 072: aload 0
      // 073: aload 1
      // 074: invokevirtual wl1$qyc.x7y ()Ljava/lang/Object;
      // 077: checkcast java/lang/Short
      // 07a: invokevirtual java/lang/Short.shortValue ()S
      // 07d: invokevirtual nfj.writeShort (I)Lio/netty/buffer/ByteBuf;
      // 080: pop
      // 081: iload 2
      // 082: ifeq 13c
      // 085: goto 08c
      // 088: invokestatic wl1.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 08b: athrow
      // 08c: aload 0
      // 08d: aload 1
      // 08e: invokevirtual wl1$qyc.x7y ()Ljava/lang/Object;
      // 091: checkcast java/lang/Integer
      // 094: invokevirtual java/lang/Integer.intValue ()I
      // 097: invokevirtual nfj.writeInt (I)Lio/netty/buffer/ByteBuf;
      // 09a: pop
      // 09b: iload 2
      // 09c: ifeq 13c
      // 09f: goto 0a6
      // 0a2: invokestatic wl1.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a5: athrow
      // 0a6: aload 0
      // 0a7: aload 1
      // 0a8: invokevirtual wl1$qyc.x7y ()Ljava/lang/Object;
      // 0ab: checkcast java/lang/Float
      // 0ae: invokevirtual java/lang/Float.floatValue ()F
      // 0b1: invokevirtual nfj.writeFloat (F)Lio/netty/buffer/ByteBuf;
      // 0b4: pop
      // 0b5: iload 2
      // 0b6: ifeq 13c
      // 0b9: goto 0c0
      // 0bc: invokestatic wl1.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0bf: athrow
      // 0c0: aload 0
      // 0c1: aload 1
      // 0c2: invokevirtual wl1$qyc.x7y ()Ljava/lang/Object;
      // 0c5: checkcast java/lang/String
      // 0c8: invokevirtual nfj.p3z (Ljava/lang/String;)Lnfj;
      // 0cb: pop
      // 0cc: iload 2
      // 0cd: ifeq 13c
      // 0d0: goto 0d7
      // 0d3: invokestatic wl1.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0d6: athrow
      // 0d7: aload 1
      // 0d8: invokevirtual wl1$qyc.x7y ()Ljava/lang/Object;
      // 0db: checkcast erg
      // 0de: astore 4
      // 0e0: aload 0
      // 0e1: aload 4
      // 0e3: invokevirtual nfj.a6a (Lerg;)V
      // 0e6: iload 2
      // 0e7: ifeq 13c
      // 0ea: aload 1
      // 0eb: invokevirtual wl1$qyc.x7y ()Ljava/lang/Object;
      // 0ee: checkcast mew
      // 0f1: astore 5
      // 0f3: aload 0
      // 0f4: aload 5
      // 0f6: invokevirtual mew.getX ()I
      // 0f9: invokevirtual nfj.writeInt (I)Lio/netty/buffer/ByteBuf;
      // 0fc: pop
      // 0fd: aload 0
      // 0fe: aload 5
      // 100: invokevirtual mew.getY ()I
      // 103: invokevirtual nfj.writeInt (I)Lio/netty/buffer/ByteBuf;
      // 106: pop
      // 107: aload 0
      // 108: aload 5
      // 10a: invokevirtual mew.getZ ()I
      // 10d: invokevirtual nfj.writeInt (I)Lio/netty/buffer/ByteBuf;
      // 110: pop
      // 111: iload 2
      // 112: ifeq 13c
      // 115: aload 1
      // 116: invokevirtual wl1$qyc.x7y ()Ljava/lang/Object;
      // 119: checkcast wis
      // 11c: astore 6
      // 11e: aload 0
      // 11f: aload 6
      // 121: invokevirtual wis.ins ()F
      // 124: invokevirtual nfj.writeFloat (F)Lio/netty/buffer/ByteBuf;
      // 127: pop
      // 128: aload 0
      // 129: aload 6
      // 12b: invokevirtual wis.t9l ()F
      // 12e: invokevirtual nfj.writeFloat (F)Lio/netty/buffer/ByteBuf;
      // 131: pop
      // 132: aload 0
      // 133: aload 6
      // 135: invokevirtual wis.pic ()F
      // 138: invokevirtual nfj.writeFloat (F)Lio/netty/buffer/ByteBuf;
      // 13b: pop
      // 13c: return
   }

   public static List glq(nfj param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aconst_null
      // 001: astore 2
      // 002: invokestatic t9d.c ()I
      // 005: aload 0
      // 006: invokevirtual nfj.readByte ()B
      // 009: istore 3
      // 00a: istore 1
      // 00b: iload 3
      // 00c: bipush 127
      // 00e: if_icmpeq 164
      // 011: aload 2
      // 012: iload 1
      // 013: ifne 165
      // 016: iload 1
      // 017: ifne 02e
      // 01a: goto 021
      // 01d: invokestatic wl1.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 020: athrow
      // 021: ifnonnull 02f
      // 024: goto 02b
      // 027: invokestatic wl1.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 02a: athrow
      // 02b: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 02e: astore 2
      // 02f: iload 3
      // 030: sipush 224
      // 033: iand
      // 034: bipush 5
      // 035: ishr
      // 036: istore 4
      // 038: iload 3
      // 039: bipush 31
      // 03b: iand
      // 03c: istore 5
      // 03e: aconst_null
      // 03f: astore 6
      // 041: iload 4
      // 043: tableswitch 271 0 7 45 68 91 114 137 160 180 227
      // 070: new wl1$qyc
      // 073: dup
      // 074: iload 4
      // 076: iload 5
      // 078: aload 0
      // 079: invokevirtual nfj.readByte ()B
      // 07c: invokestatic java/lang/Byte.valueOf (B)Ljava/lang/Byte;
      // 07f: invokespecial wl1$qyc.<init> (IILjava/lang/Object;)V
      // 082: astore 6
      // 084: goto 152
      // 087: new wl1$qyc
      // 08a: dup
      // 08b: iload 4
      // 08d: iload 5
      // 08f: aload 0
      // 090: invokevirtual nfj.readShort ()S
      // 093: invokestatic java/lang/Short.valueOf (S)Ljava/lang/Short;
      // 096: invokespecial wl1$qyc.<init> (IILjava/lang/Object;)V
      // 099: astore 6
      // 09b: goto 152
      // 09e: new wl1$qyc
      // 0a1: dup
      // 0a2: iload 4
      // 0a4: iload 5
      // 0a6: aload 0
      // 0a7: invokevirtual nfj.readInt ()I
      // 0aa: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0ad: invokespecial wl1$qyc.<init> (IILjava/lang/Object;)V
      // 0b0: astore 6
      // 0b2: goto 152
      // 0b5: new wl1$qyc
      // 0b8: dup
      // 0b9: iload 4
      // 0bb: iload 5
      // 0bd: aload 0
      // 0be: invokevirtual nfj.readFloat ()F
      // 0c1: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 0c4: invokespecial wl1$qyc.<init> (IILjava/lang/Object;)V
      // 0c7: astore 6
      // 0c9: goto 152
      // 0cc: new wl1$qyc
      // 0cf: dup
      // 0d0: iload 4
      // 0d2: iload 5
      // 0d4: aload 0
      // 0d5: sipush 32767
      // 0d8: invokevirtual nfj.oa5 (I)Ljava/lang/String;
      // 0db: invokespecial wl1$qyc.<init> (IILjava/lang/Object;)V
      // 0de: astore 6
      // 0e0: goto 152
      // 0e3: new wl1$qyc
      // 0e6: dup
      // 0e7: iload 4
      // 0e9: iload 5
      // 0eb: aload 0
      // 0ec: invokevirtual nfj.x4d ()Lerg;
      // 0ef: invokespecial wl1$qyc.<init> (IILjava/lang/Object;)V
      // 0f2: astore 6
      // 0f4: goto 152
      // 0f7: aload 0
      // 0f8: invokevirtual nfj.readInt ()I
      // 0fb: istore 7
      // 0fd: aload 0
      // 0fe: invokevirtual nfj.readInt ()I
      // 101: istore 8
      // 103: aload 0
      // 104: invokevirtual nfj.readInt ()I
      // 107: istore 9
      // 109: new wl1$qyc
      // 10c: dup
      // 10d: iload 4
      // 10f: iload 5
      // 111: new mew
      // 114: dup
      // 115: iload 7
      // 117: iload 8
      // 119: iload 9
      // 11b: invokespecial mew.<init> (III)V
      // 11e: invokespecial wl1$qyc.<init> (IILjava/lang/Object;)V
      // 121: astore 6
      // 123: goto 152
      // 126: aload 0
      // 127: invokevirtual nfj.readFloat ()F
      // 12a: fstore 10
      // 12c: aload 0
      // 12d: invokevirtual nfj.readFloat ()F
      // 130: fstore 11
      // 132: aload 0
      // 133: invokevirtual nfj.readFloat ()F
      // 136: fstore 12
      // 138: new wl1$qyc
      // 13b: dup
      // 13c: iload 4
      // 13e: iload 5
      // 140: new wis
      // 143: dup
      // 144: fload 10
      // 146: fload 11
      // 148: fload 12
      // 14a: invokespecial wis.<init> (FFF)V
      // 14d: invokespecial wl1$qyc.<init> (IILjava/lang/Object;)V
      // 150: astore 6
      // 152: aload 2
      // 153: aload 6
      // 155: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 15a: pop
      // 15b: aload 0
      // 15c: invokevirtual nfj.readByte ()B
      // 15f: istore 3
      // 160: iload 1
      // 161: ifeq 00b
      // 164: aload 2
      // 165: areturn
   }

   public void z3t(List param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield wl1.yw2 Ljava/util/concurrent/locks/ReadWriteLock;
      // 04: invokeinterface java/util/concurrent/locks/ReadWriteLock.writeLock ()Ljava/util/concurrent/locks/Lock; 1
      // 09: invokeinterface java/util/concurrent/locks/Lock.lock ()V 1
      // 0e: invokestatic t9d.b ()I
      // 11: aload 1
      // 12: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 17: astore 3
      // 18: istore 2
      // 19: aload 3
      // 1a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1f: ifeq 78
      // 22: aload 3
      // 23: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 28: checkcast wl1$qyc
      // 2b: astore 4
      // 2d: aload 0
      // 2e: getfield wl1.gp5 Ljava/util/Map;
      // 31: aload 4
      // 33: invokevirtual wl1$qyc.a4k ()I
      // 36: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 39: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 3e: checkcast wl1$qyc
      // 41: astore 5
      // 43: iload 2
      // 44: ifeq 8b
      // 47: aload 5
      // 49: iload 2
      // 4a: ifeq 60
      // 4d: goto 54
      // 50: invokestatic wl1.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 53: athrow
      // 54: ifnull 74
      // 57: goto 5e
      // 5a: invokestatic wl1.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5d: athrow
      // 5e: aload 5
      // 60: aload 4
      // 62: invokevirtual wl1$qyc.x7y ()Ljava/lang/Object;
      // 65: invokevirtual wl1$qyc.l_0 (Ljava/lang/Object;)V
      // 68: aload 0
      // 69: getfield wl1.h_w Li2h;
      // 6c: aload 4
      // 6e: invokevirtual wl1$qyc.a4k ()I
      // 71: invokevirtual i2h.jcg (I)V
      // 74: iload 2
      // 75: ifne 19
      // 78: aload 0
      // 79: getfield wl1.yw2 Ljava/util/concurrent/locks/ReadWriteLock;
      // 7c: invokeinterface java/util/concurrent/locks/ReadWriteLock.writeLock ()Ljava/util/concurrent/locks/Lock; 1
      // 81: invokeinterface java/util/concurrent/locks/Lock.unlock ()V 1
      // 86: aload 0
      // 87: bipush 1
      // 88: putfield wl1.pmf Z
      // 8b: return
   }

   public boolean d95() {
      return this.h8_;
   }

   public void l0n() {
      this.pmf = false;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(3563939534188195246L, -4407718935269657587L, MethodHandles.lookup().lookupClass()).a(69853871524706L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 8656409740336L;
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
      String var6 = "´\u0013ç~¯\u009d¹à\u008eïràÂ\u009ciivÚ÷\u0080%o\u000fü)%¼%\u00023ò\u0082\u0096\u00860,Fù`\u0098@@[K\u001fi¿\u0019#Ô\rT;ºJþ0vH&ÏwÅÊäÔ\u000e÷Z¿í\u001c\u0002;ô\u0097Ó¼\u0095Ají/M\u0094j\u0013Ùÿìÿd\u00959æ\u0006Á\u0006E\u008d¾B²\u0010\u0019 Û>\u0090\u0013\u0084\u0017ØLû\u0019v\u0091Ò{ãkr\u009a¹»¿19\u00ad\u0011RMÓ+í\u0013Ú(ÝÕYv_Z\u0014cKÍa\u0093¸\rc.RS\\\\ó4¥\u0092¾Áï<®Ú\u0010\u0086¥·(÷\u0084©ýÃ8Á\u008a\u0086\u008c\u0094U¡ç«\u0082\u001e3\n\u0091÷7Û\u008b5ò°\u0015¼Jê\u0088Ñ\" Ë\u000b\u007fhÊ@T\u0019Õ(\u001av.ÞLæÂ© ;Z\u009d\u000eÌ\u0013pÂ";
      int var8 = "´\u0013ç~¯\u009d¹à\u008eïràÂ\u009ciivÚ÷\u0080%o\u000fü)%¼%\u00023ò\u0082\u0096\u00860,Fù`\u0098@@[K\u001fi¿\u0019#Ô\rT;ºJþ0vH&ÏwÅÊäÔ\u000e÷Z¿í\u001c\u0002;ô\u0097Ó¼\u0095Ají/M\u0094j\u0013Ùÿìÿd\u00959æ\u0006Á\u0006E\u008d¾B²\u0010\u0019 Û>\u0090\u0013\u0084\u0017ØLû\u0019v\u0091Ò{ãkr\u009a¹»¿19\u00ad\u0011RMÓ+í\u0013Ú(ÝÕYv_Z\u0014cKÍa\u0093¸\rc.RS\\\\ó4¥\u0092¾Áï<®Ú\u0010\u0086¥·(÷\u0084©ýÃ8Á\u008a\u0086\u008c\u0094U¡ç«\u0082\u001e3\n\u0091÷7Û\u008b5ò°\u0015¼Jê\u0088Ñ\" Ë\u000b\u007fhÊ@T\u0019Õ(\u001av.ÞLæÂ© ;Z\u009d\u000eÌ\u0013pÂ"
         .length();
      char var5 = '8';
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
                     c = new String[7];
                     agj = Maps.newHashMap();
                     agj.put(Byte.class, 0);
                     agj.put(Short.class, 1);
                     agj.put(Integer.class, 2);
                     agj.put(Float.class, 3);
                     agj.put(String.class, 4);
                     agj.put(erg.class, 5);
                     agj.put(mew.class, 6);
                     agj.put(wis.class, 7);
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

                  var6 = " Î\u009f4\u0011UþpµÛÔÿa%+\u0015(Ë\u0004TR;£\u007f\u009f\"sù\u001b4\u00934wÐ\u0096ôÇ÷íçtöå\u0000\u0015~=qÐÖm\u0095ì#\u0018«\u0017";
                  var8 = " Î\u009f4\u0011UþpµÛÔÿa%+\u0015(Ë\u0004TR;£\u007f\u009f\"sù\u001b4\u00934wÐ\u0096ôÇ÷íçtöå\u0000\u0015~=qÐÖm\u0095ì#\u0018«\u0017"
                     .length();
                  var5 = 16;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 13731;
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
            throw new RuntimeException("wl1", var10);
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
         throw new RuntimeException("wl1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
