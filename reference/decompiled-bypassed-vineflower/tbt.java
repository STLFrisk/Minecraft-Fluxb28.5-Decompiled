import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

public class tbt {
   private static final Logger i78;
   private static final ThreadFactory c4z;
   private final List e0r;
   private final BlockingQueue o47;
   private final BlockingQueue l12;
   private final aev dtj;
   private final y8w kf6;
   private final Queue r09;
   private final r5w yaz;
   private final int uil;
   private List cvm;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public tbt() {
      this(-1);
   }

   public tbt(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokespecial java/lang/Object.<init> ()V
      // 004: invokestatic t9d.c ()I
      // 007: aload 0
      // 008: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 00b: putfield tbt.e0r Ljava/util/List;
      // 00e: aload 0
      // 00f: bipush 100
      // 011: invokestatic com/google/common/collect/Queues.newArrayBlockingQueue (I)Ljava/util/concurrent/ArrayBlockingQueue;
      // 014: putfield tbt.o47 Ljava/util/concurrent/BlockingQueue;
      // 017: istore 2
      // 018: aload 0
      // 019: new aev
      // 01c: dup
      // 01d: invokespecial aev.<init> ()V
      // 020: putfield tbt.dtj Laev;
      // 023: aload 0
      // 024: new y8w
      // 027: dup
      // 028: invokespecial y8w.<init> ()V
      // 02b: putfield tbt.kf6 Ly8w;
      // 02e: aload 0
      // 02f: invokestatic com/google/common/collect/Queues.newArrayDeque ()Ljava/util/ArrayDeque;
      // 032: putfield tbt.r09 Ljava/util/Queue;
      // 035: aload 0
      // 036: new java/util/ArrayList
      // 039: dup
      // 03a: invokespecial java/util/ArrayList.<init> ()V
      // 03d: putfield tbt.cvm Ljava/util/List;
      // 040: bipush 1
      // 041: invokestatic java/lang/Runtime.getRuntime ()Ljava/lang/Runtime;
      // 044: invokevirtual java/lang/Runtime.maxMemory ()J
      // 047: l2d
      // 048: ldc2_w 0.3
      // 04b: dmul
      // 04c: d2i
      // 04d: ldc 10485760
      // 04f: nop
      // 050: idiv
      // 051: invokestatic java/lang/Math.max (II)I
      // 054: istore 3
      // 055: bipush 1
      // 056: invokestatic java/lang/Runtime.getRuntime ()Ljava/lang/Runtime;
      // 059: invokevirtual java/lang/Runtime.availableProcessors ()I
      // 05c: bipush 2
      // 05d: isub
      // 05e: bipush 1
      // 05f: iload 3
      // 060: bipush 5
      // 061: idiv
      // 062: invokestatic fe6.faa (III)I
      // 065: invokestatic java/lang/Math.max (II)I
      // 068: istore 4
      // 06a: iload 2
      // 06b: ifne 08e
      // 06e: iload 1
      // 06f: ifge 092
      // 072: goto 079
      // 075: invokestatic tbt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 078: athrow
      // 079: aload 0
      // 07a: iload 4
      // 07c: bipush 8
      // 07e: imul
      // 07f: bipush 1
      // 080: iload 3
      // 081: invokestatic fe6.faa (III)I
      // 084: putfield tbt.uil I
      // 087: goto 08e
      // 08a: invokestatic tbt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08d: athrow
      // 08e: iload 2
      // 08f: ifeq 09e
      // 092: aload 0
      // 093: iload 1
      // 094: putfield tbt.uil I
      // 097: goto 09e
      // 09a: invokestatic tbt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09d: athrow
      // 09e: bipush 0
      // 09f: istore 5
      // 0a1: iload 5
      // 0a3: iload 4
      // 0a5: if_icmpge 0e1
      // 0a8: new r5w
      // 0ab: dup
      // 0ac: aload 0
      // 0ad: invokespecial r5w.<init> (Ltbt;)V
      // 0b0: astore 6
      // 0b2: getstatic tbt.c4z Ljava/util/concurrent/ThreadFactory;
      // 0b5: aload 6
      // 0b7: invokeinterface java/util/concurrent/ThreadFactory.newThread (Ljava/lang/Runnable;)Ljava/lang/Thread; 2
      // 0bc: astore 7
      // 0be: aload 7
      // 0c0: invokevirtual java/lang/Thread.start ()V
      // 0c3: aload 0
      // 0c4: getfield tbt.e0r Ljava/util/List;
      // 0c7: aload 6
      // 0c9: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0ce: pop
      // 0cf: iinc 5 1
      // 0d2: iload 2
      // 0d3: ifne 0ec
      // 0d6: iload 2
      // 0d7: ifeq 0a1
      // 0da: goto 0e1
      // 0dd: invokestatic tbt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e0: athrow
      // 0e1: aload 0
      // 0e2: aload 0
      // 0e3: getfield tbt.uil I
      // 0e6: invokestatic com/google/common/collect/Queues.newArrayBlockingQueue (I)Ljava/util/concurrent/ArrayBlockingQueue;
      // 0e9: putfield tbt.l12 Ljava/util/concurrent/BlockingQueue;
      // 0ec: bipush 0
      // 0ed: istore 5
      // 0ef: iload 5
      // 0f1: aload 0
      // 0f2: getfield tbt.uil I
      // 0f5: if_icmpge 11b
      // 0f8: aload 0
      // 0f9: getfield tbt.l12 Ljava/util/concurrent/BlockingQueue;
      // 0fc: new wi5
      // 0ff: dup
      // 100: invokespecial wi5.<init> ()V
      // 103: invokeinterface java/util/concurrent/BlockingQueue.add (Ljava/lang/Object;)Z 2
      // 108: pop
      // 109: iinc 5 1
      // 10c: iload 2
      // 10d: ifne 12e
      // 110: iload 2
      // 111: ifeq 0ef
      // 114: goto 11b
      // 117: invokestatic tbt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11a: athrow
      // 11b: aload 0
      // 11c: new r5w
      // 11f: dup
      // 120: aload 0
      // 121: new wi5
      // 124: dup
      // 125: invokespecial wi5.<init> ()V
      // 128: invokespecial r5w.<init> (Ltbt;Lwi5;)V
      // 12b: putfield tbt.yaz Lr5w;
      // 12e: return
   }

   public String hjm() {
      long var1 = a ^ 92915083332716L;
      return String.format(a<"b">(27399, 1732022990947096058L ^ var1), this.o47.size(), this.r09.size(), this.l12.size());
   }

   public boolean n67(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: bipush 0
      // 05: istore 4
      // 07: bipush 0
      // 08: istore 5
      // 0a: aconst_null
      // 0b: astore 6
      // 0d: aload 0
      // 0e: getfield tbt.r09 Ljava/util/Queue;
      // 11: dup
      // 12: astore 7
      // 14: monitorenter
      // 15: aload 0
      // 16: getfield tbt.r09 Ljava/util/Queue;
      // 19: invokeinterface java/util/Queue.poll ()Ljava/lang/Object; 1
      // 1e: checkcast com/google/common/util/concurrent/ListenableFutureTask
      // 21: astore 6
      // 23: aload 7
      // 25: monitorexit
      // 26: goto 31
      // 29: astore 8
      // 2b: aload 7
      // 2d: monitorexit
      // 2e: aload 8
      // 30: athrow
      // 31: aload 6
      // 33: iload 3
      // 34: ifne 43
      // 37: ifnull 4c
      // 3a: goto 41
      // 3d: invokestatic tbt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40: athrow
      // 41: aload 6
      // 43: invokevirtual com/google/common/util/concurrent/ListenableFutureTask.run ()V
      // 46: bipush 1
      // 47: istore 5
      // 49: bipush 1
      // 4a: istore 4
      // 4c: lload 1
      // 4d: lconst_0
      // 4e: lcmp
      // 4f: iload 3
      // 50: ifne 8b
      // 53: ifeq 89
      // 56: goto 5d
      // 59: invokestatic tbt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5c: athrow
      // 5d: iload 5
      // 5f: ifne 70
      // 62: goto 69
      // 65: invokestatic tbt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 68: athrow
      // 69: goto 89
      // 6c: invokestatic tbt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6f: athrow
      // 70: lload 1
      // 71: invokestatic java/lang/System.nanoTime ()J
      // 74: lsub
      // 75: lstore 7
      // 77: lload 7
      // 79: lconst_0
      // 7a: lcmp
      // 7b: ifge 85
      // 7e: goto 89
      // 81: invokestatic tbt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 84: athrow
      // 85: iload 3
      // 86: ifeq 07
      // 89: iload 4
      // 8b: ireturn
   }

   public boolean m52(kqk param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: invokevirtual kqk.adi ()Ljava/util/concurrent/locks/ReentrantLock;
      // 08: invokevirtual java/util/concurrent/locks/ReentrantLock.lock ()V
      // 0b: aload 1
      // 0c: invokevirtual kqk.vun ()Luga;
      // 0f: astore 4
      // 11: aload 4
      // 13: new tbt$1
      // 16: dup
      // 17: aload 0
      // 18: aload 4
      // 1a: invokespecial tbt$1.<init> (Ltbt;Luga;)V
      // 1d: invokevirtual uga._9h (Ljava/lang/Runnable;)V
      // 20: aload 0
      // 21: getfield tbt.o47 Ljava/util/concurrent/BlockingQueue;
      // 24: aload 4
      // 26: invokeinterface java/util/concurrent/BlockingQueue.offer (Ljava/lang/Object;)Z 2
      // 2b: istore 5
      // 2d: iload 5
      // 2f: iload 2
      // 30: ifeq 4b
      // 33: ifne 49
      // 36: goto 3d
      // 39: invokestatic tbt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c: athrow
      // 3d: aload 4
      // 3f: invokevirtual uga._01 ()V
      // 42: goto 49
      // 45: invokestatic tbt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 48: athrow
      // 49: iload 5
      // 4b: istore 3
      // 4c: aload 1
      // 4d: invokevirtual kqk.adi ()Ljava/util/concurrent/locks/ReentrantLock;
      // 50: invokevirtual java/util/concurrent/locks/ReentrantLock.unlock ()V
      // 53: goto 62
      // 56: astore 6
      // 58: aload 1
      // 59: invokevirtual kqk.adi ()Ljava/util/concurrent/locks/ReentrantLock;
      // 5c: invokevirtual java/util/concurrent/locks/ReentrantLock.unlock ()V
      // 5f: aload 6
      // 61: athrow
      // 62: iload 3
      // 63: ireturn
   }

   public boolean fzf(kqk var1) {
      var1.adi().lock();

      boolean var2;
      try {
         uga var3 = var1.vun();

         try {
            this.yaz.jkw(var3);
         } catch (InterruptedException var8) {
         }

         var2 = true;
      } finally {
         var1.adi().unlock();
      }

      return var2;
   }

   public void nq2() {
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
      // 05: invokevirtual tbt.oqw ()V
      // 08: aload 0
      // 09: lconst_0
      // 0a: invokevirtual tbt.n67 (J)Z
      // 0d: ifeq 17
      // 10: goto 08
      // 13: invokestatic tbt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16: athrow
      // 17: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 1a: astore 2
      // 1b: aload 2
      // 1c: invokeinterface java/util/List.size ()I 1
      // 21: aload 0
      // 22: getfield tbt.uil I
      // 25: if_icmpeq 4a
      // 28: aload 2
      // 29: aload 0
      // 2a: invokevirtual tbt.asc ()Lwi5;
      // 2d: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 32: pop
      // 33: iload 1
      // 34: ifne 55
      // 37: goto 3e
      // 3a: invokestatic tbt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d: athrow
      // 3e: goto 1b
      // 41: invokestatic tbt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 44: athrow
      // 45: astore 3
      // 46: iload 1
      // 47: ifeq 1b
      // 4a: aload 0
      // 4b: getfield tbt.l12 Ljava/util/concurrent/BlockingQueue;
      // 4e: aload 2
      // 4f: invokeinterface java/util/concurrent/BlockingQueue.addAll (Ljava/util/Collection;)Z 2
      // 54: pop
      // 55: return
   }

   public void uwl(wi5 var1) {
      this.l12.add(var1);
   }

   public wi5 asc() {
      return (wi5)this.l12.take();
   }

   public uga chw() {
      return (uga)this.o47.take();
   }

   public boolean wkc(kqk var1) {
      int var2 = t9d.c();
      var1.adi().lock();

      boolean var6;
      try {
         uga var4 = var1.f_d();

         uga var10000;
         label52: {
            label64: {
               try {
                  var10000 = var4;
                  if (var2 != 0) {
                     break label52;
                  }

                  if (var4 != null) {
                     break label64;
                  }
               } catch (oov var10) {
                  throw a(var10);
               }

               return true;
            }

            var10000 = var4;
         }

         var10000._9h(new tbt$2(this, var4));
         boolean var12 = this.o47.offer(var4);
         var6 = var12;
      } finally {
         var1.adi().unlock();
      }

      return var6;
   }

   public ListenableFuture v26(w51 param1, q3g param2, kqk param3, cbc param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 5
      // 05: invokestatic c05.vz1 ()Lc05;
      // 08: invokevirtual c05.xii ()Z
      // 0b: iload 5
      // 0d: ifne 1d
      // 10: ifeq 5c
      // 13: goto 1a
      // 16: invokestatic tbt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19: athrow
      // 1a: invokestatic gis.eyg ()Z
      // 1d: ifeq 39
      // 20: aload 0
      // 21: aload 2
      // 22: aload 3
      // 23: aload 1
      // 24: invokevirtual w51.ordinal ()I
      // 27: invokevirtual kqk.lry (I)Lfab;
      // 2a: invokespecial tbt.o7i (Lq3g;Lfab;)V
      // 2d: iload 5
      // 2f: ifeq 50
      // 32: goto 39
      // 35: invokestatic tbt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 38: athrow
      // 39: aload 0
      // 3a: aload 2
      // 3b: aload 3
      // 3c: checkcast cbo
      // 3f: aload 1
      // 40: aload 4
      // 42: invokevirtual cbo._yp (Lw51;Lcbc;)I
      // 45: aload 3
      // 46: invokespecial tbt.u9w (Lq3g;ILkqk;)V
      // 49: goto 50
      // 4c: invokestatic tbt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4f: athrow
      // 50: aload 2
      // 51: dconst_0
      // 52: dconst_0
      // 53: dconst_0
      // 54: invokevirtual q3g.nbz (DDD)V
      // 57: aconst_null
      // 58: invokestatic com/google/common/util/concurrent/Futures.immediateFuture (Ljava/lang/Object;)Lcom/google/common/util/concurrent/ListenableFuture;
      // 5b: areturn
      // 5c: new tbt$3
      // 5f: dup
      // 60: aload 0
      // 61: aload 1
      // 62: aload 2
      // 63: aload 3
      // 64: aload 4
      // 66: invokespecial tbt$3.<init> (Ltbt;Lw51;Lq3g;Lkqk;Lcbc;)V
      // 69: aconst_null
      // 6a: invokestatic com/google/common/util/concurrent/ListenableFutureTask.create (Ljava/lang/Runnable;Ljava/lang/Object;)Lcom/google/common/util/concurrent/ListenableFutureTask;
      // 6d: astore 6
      // 6f: aload 0
      // 70: getfield tbt.r09 Ljava/util/Queue;
      // 73: dup
      // 74: astore 7
      // 76: monitorenter
      // 77: aload 0
      // 78: getfield tbt.r09 Ljava/util/Queue;
      // 7b: aload 6
      // 7d: invokeinterface java/util/Queue.add (Ljava/lang/Object;)Z 2
      // 82: pop
      // 83: aload 6
      // 85: aload 7
      // 87: monitorexit
      // 88: areturn
      // 89: astore 8
      // 8b: aload 7
      // 8d: monitorexit
      // 8e: aload 8
      // 90: athrow
   }

   private void u9w(q3g var1, int var2, kqk var3) {
      GL11.glNewList(var2, 4864);
      hzu.dp2();
      var3.ft_();
      this.dtj.n7l(var1);
      hzu.x3w();
      GL11.glEndList();
   }

   private void o7i(q3g var1, fab var2) {
      this.kf6.eds(var2);
      this.kf6.n7l(var1);
   }

   public void oqw() {
      int var1 = t9d.b();

      while (!this.o47.isEmpty()) {
         uga var2 = (uga)this.o47.poll();

         label28: {
            uga var10000;
            label27: {
               try {
                  var10000 = var2;
                  if (var1 == 0) {
                     break label27;
                  }

                  if (var2 == null) {
                     break label28;
                  }
               } catch (oov var3) {
                  throw a(var3);
               }

               var10000 = var2;
            }

            var10000._01();
         }

         if (var1 == 0) {
            break;
         }
      }
   }

   public boolean vle() {
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
      // 05: getfield tbt.o47 Ljava/util/concurrent/BlockingQueue;
      // 08: invokeinterface java/util/concurrent/BlockingQueue.isEmpty ()Z 1
      // 0d: iload 1
      // 0e: ifne 2b
      // 11: ifeq 3d
      // 14: goto 1b
      // 17: invokestatic tbt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a: athrow
      // 1b: aload 0
      // 1c: getfield tbt.r09 Ljava/util/Queue;
      // 1f: invokeinterface java/util/Queue.isEmpty ()Z 1
      // 24: goto 2b
      // 27: invokestatic tbt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a: athrow
      // 2b: iload 1
      // 2c: ifne 3a
      // 2f: ifeq 3d
      // 32: goto 39
      // 35: invokestatic tbt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 38: athrow
      // 39: bipush 1
      // 3a: goto 3e
      // 3d: bipush 0
      // 3e: ireturn
   }

   public void o2c() {
      int var1 = t9d.b();

      while (this.cvm.size() != this.uil) {
         try {
            this.n67(Long.MAX_VALUE);
            wi5 var2 = (wi5)this.l12.poll(100L, TimeUnit.MILLISECONDS);

            try {
               if (var2 != null) {
                  this.cvm.add(var2);
               }
            } catch (InterruptedException var3) {
               throw a(var3);
            }
         } catch (InterruptedException var4) {
            if (var1 == 0) {
               break;
            }
         }
      }
   }

   public void _ot() {
      this.l12.addAll(this.cvm);
      this.cvm.clear();
   }

   public static BlockingQueue p91(tbt var0) {
      return var0.o47;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1958911685398602285L, 2084407041722359759L, MethodHandles.lookup().lookupClass()).a(223889542263974L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 64476784369452L;
      Cipher var0;
      Cipher var12 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[2];
      int var5 = 0;
      String var4 = "§ýaTç×l>U@\u0083¦å\nqêùÓ.Ãy¹¿\u0000g\u0083HÇº\u0013KÿÕ\\~\u0086¬r+þÀ«#Ðd20u(Öª'\u0011D½±-\u000f\u007f°¶\u0006Z\rwµÓsVòN© \u0089òPîCG\u0010\r\u0094D Ì¼$\u0000h";
      int var6 = "§ýaTç×l>U@\u0083¦å\nqêùÓ.Ãy¹¿\u0000g\u0083HÇº\u0013KÿÕ\\~\u0086¬r+þÀ«#Ðd20u(Öª'\u0011D½±-\u000f\u007f°¶\u0006Z\rwµÓsVòN© \u0089òPîCG\u0010\r\u0094D Ì¼$\u0000h"
         .length();
      char var3 = '0';
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var14 = a(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var14;
         if ((var2 += var3) >= var6) {
            b = var7;
            c = new String[2];
            i78 = LogManager.getLogger();
            c4z = new ThreadFactoryBuilder().setNameFormat(a<"b">(20918, 3751607528307031050L ^ var9)).setDaemon(true).build();
            return;
         }

         var3 = var4.charAt(var2);
      }
   }

   private static Exception a(Exception var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5780;
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
            throw new RuntimeException("tbt", var10);
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
         throw new RuntimeException("tbt" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
