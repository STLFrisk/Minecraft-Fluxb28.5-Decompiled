import com.google.common.collect.Lists;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class uga {
   private final kqk nn0;
   private final ReentrantLock jjh = new ReentrantLock();
   private final List i7m = Lists.newArrayList();
   private final uga$l1i yv7;
   private wi5 zk0;
   private cbc mhh;
   private uga$aen jtv = uga$aen.sib;
   private boolean ii_;

   public uga(kqk var1, uga$l1i var2) {
      this.nn0 = var1;
      this.yv7 = var2;
   }

   public uga$aen va9() {
      return this.jtv;
   }

   public kqk r2x() {
      return this.nn0;
   }

   public cbc hqk() {
      return this.mhh;
   }

   public void a6f(cbc var1) {
      this.mhh = var1;
   }

   public wi5 s23() {
      return this.zk0;
   }

   public void esp(wi5 var1) {
      this.zk0 = var1;
   }

   public void kv_(uga$aen var1) {
      this.jjh.lock();

      try {
         this.jtv = var1;
      } finally {
         this.jjh.unlock();
      }
   }

   public void _01() {
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
      // 05: getfield uga.jjh Ljava/util/concurrent/locks/ReentrantLock;
      // 08: invokevirtual java/util/concurrent/locks/ReentrantLock.lock ()V
      // 0b: aload 0
      // 0c: iload 1
      // 0d: ifeq 51
      // 10: getfield uga.yv7 Luga$l1i;
      // 13: getstatic uga$l1i.r7h Luga$l1i;
      // 16: if_acmpne 44
      // 19: aload 0
      // 1a: iload 1
      // 1b: ifeq 51
      // 1e: goto 25
      // 21: invokestatic uga.a (Loov;)Loov;
      // 24: athrow
      // 25: getfield uga.jtv Luga$aen;
      // 28: getstatic uga$aen.mle Luga$aen;
      // 2b: if_acmpeq 44
      // 2e: goto 35
      // 31: invokestatic uga.a (Loov;)Loov;
      // 34: athrow
      // 35: aload 0
      // 36: getfield uga.nn0 Lkqk;
      // 39: bipush 1
      // 3a: invokevirtual kqk.sf6 (Z)V
      // 3d: goto 44
      // 40: invokestatic uga.a (Loov;)Loov;
      // 43: athrow
      // 44: aload 0
      // 45: bipush 1
      // 46: putfield uga.ii_ Z
      // 49: aload 0
      // 4a: getstatic uga$aen.mle Luga$aen;
      // 4d: putfield uga.jtv Luga$aen;
      // 50: aload 0
      // 51: getfield uga.i7m Ljava/util/List;
      // 54: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 59: astore 2
      // 5a: aload 2
      // 5b: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 60: ifeq 82
      // 63: aload 2
      // 64: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 69: checkcast java/lang/Runnable
      // 6c: astore 3
      // 6d: aload 3
      // 6e: invokeinterface java/lang/Runnable.run ()V 1
      // 73: iload 1
      // 74: ifeq 89
      // 77: iload 1
      // 78: ifne 5a
      // 7b: goto 82
      // 7e: invokestatic uga.a (Loov;)Loov;
      // 81: athrow
      // 82: aload 0
      // 83: getfield uga.jjh Ljava/util/concurrent/locks/ReentrantLock;
      // 86: invokevirtual java/util/concurrent/locks/ReentrantLock.unlock ()V
      // 89: goto 98
      // 8c: astore 4
      // 8e: aload 0
      // 8f: getfield uga.jjh Ljava/util/concurrent/locks/ReentrantLock;
      // 92: invokevirtual java/util/concurrent/locks/ReentrantLock.unlock ()V
      // 95: aload 4
      // 97: athrow
      // 98: return
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void _9h(Runnable var1) {
      int var2 = t9d.b();
      this.jjh.lock();
      boolean var6 = false /* VF: Semaphore variable */;

      uga var10000;
      label39: {
         try {
            var6 = true;
            this.i7m.add(var1);
            var10000 = this;
            if (var2 == 0) {
               var6 = false;
               break label39;
            }

            try {
               if (var10000.ii_) {
                  var1.run();
                  var6 = false;
               } else {
                  var6 = false;
               }
            } catch (oov var7) {
               throw a(var7);
            }
         } finally {
            if (var6) {
               this.jjh.unlock();
            }
         }

         var10000 = this;
      }

      var10000.jjh.unlock();
   }

   public ReentrantLock _d6() {
      return this.jjh;
   }

   public uga$l1i _2l() {
      return this.yv7;
   }

   public boolean a8n() {
      return this.ii_;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
