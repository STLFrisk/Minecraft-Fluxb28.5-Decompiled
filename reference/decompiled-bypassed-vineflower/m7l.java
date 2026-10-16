import java.util.Iterator;
import java.util.Set;

public class m7l implements Comparable {
   public boolean m7n;

   public static void v04(int var0) {
      int var1 = t9d.b();
      if (var0 != 0) {
         m7l var2 = (m7l)cmn.ij8(var0);

         m7l var10000;
         label21: {
            try {
               var10000 = var2;
               if (var1 == 0) {
                  break label21;
               }

               if (var2 == null) {
                  return;
               }
            } catch (oov var3) {
               throw a(var3);
            }

            var10000 = var2;
         }

         var10000.svk++;
      }
   }

   public static void qkn(int var0, boolean var1) {
      int var2 = t9d.c();
      if (var0 != 0) {
         m7l var3 = (m7l)cmn.ij8(var0);

         m7l var10000;
         label21: {
            try {
               var10000 = var3;
               if (var2 != 0) {
                  break label21;
               }

               if (var3 == null) {
                  return;
               }
            } catch (oov var4) {
               throw a(var4);
            }

            var10000 = var3;
         }

         var10000.m7n = var1;
      }
   }

   public static void wcu() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 0
      // 04: getstatic m7l.jkw Ljava/util/List;
      // 07: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0c: astore 1
      // 0d: aload 1
      // 0e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 13: ifeq c2
      // 16: aload 1
      // 17: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1c: checkcast m7l
      // 1f: astore 2
      // 20: iload 0
      // 21: ifne be
      // 24: getstatic kgt.zg5 Lqkq;
      // 27: invokevirtual qkq.klu ()Z
      // 2a: ifeq ba
      // 2d: goto 34
      // 30: invokestatic m7l.a (Loov;)Loov;
      // 33: athrow
      // 34: invokestatic c05.vz1 ()Lc05;
      // 37: iload 0
      // 38: ifne 5c
      // 3b: goto 42
      // 3e: invokestatic m7l.a (Loov;)Loov;
      // 41: athrow
      // 42: getfield c05.u0y Lgbe;
      // 45: instanceof w4v
      // 48: ifeq ba
      // 4b: goto 52
      // 4e: invokestatic m7l.a (Loov;)Loov;
      // 51: athrow
      // 52: invokestatic c05.vz1 ()Lc05;
      // 55: goto 5c
      // 58: invokestatic m7l.a (Loov;)Loov;
      // 5b: athrow
      // 5c: getfield c05.oxn Lmoh;
      // 5f: astore 3
      // 60: aload 2
      // 61: invokevirtual m7l.xbs ()I
      // 64: istore 4
      // 66: iload 4
      // 68: aload 3
      // 69: getfield moh.mn1 Lm7l;
      // 6c: getfield m7l.or0 I
      // 6f: iload 0
      // 70: ifne 86
      // 73: if_icmpeq 0d
      // 76: goto 7d
      // 79: invokestatic m7l.a (Loov;)Loov;
      // 7c: athrow
      // 7d: iload 4
      // 7f: aload 3
      // 80: getfield moh.asx Lm7l;
      // 83: getfield m7l.or0 I
      // 86: iload 0
      // 87: ifne 9d
      // 8a: if_icmpeq 0d
      // 8d: goto 94
      // 90: invokestatic m7l.a (Loov;)Loov;
      // 93: athrow
      // 94: iload 4
      // 96: aload 3
      // 97: getfield moh._70 Lm7l;
      // 9a: getfield m7l.or0 I
      // 9d: iload 0
      // 9e: ifne b4
      // a1: if_icmpeq 0d
      // a4: goto ab
      // a7: invokestatic m7l.a (Loov;)Loov;
      // aa: athrow
      // ab: iload 4
      // ad: aload 3
      // ae: getfield moh.tup Lm7l;
      // b1: getfield m7l.or0 I
      // b4: if_icmpne ba
      // b7: goto 0d
      // ba: aload 2
      // bb: invokespecial m7l.g8z ()V
      // be: iload 0
      // bf: ifeq 0d
      // c2: return
   }

   public static void r3g() {
      cmn.op7();
      int var10000 = t9d.c();
      Iterator var1 = jkw.iterator();
      int var0 = var10000;

      while (var1.hasNext()) {
         m7l var2 = (m7l)var1.next();
         cmn.yfe(var2.or0, var2);
         if (var0 != 0) {
            break;
         }
      }
   }

   public static Set s9n() {
      return ibo;
   }

   public m7l(String var1, int var2, String var3) {
      this.w67 = var1;
      this.or0 = var2;
      this.hc5 = var2;
      this.pbq = var3;
      jkw.add(this);
      cmn.yfe(var2, this);
      ibo.add(var3);
   }

   public boolean t9w() {
      return this.m7n;
   }

   public String sai() {
      return this.pbq;
   }

   public boolean o5k() {
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
      // 05: getfield m7l.svk I
      // 08: iload 1
      // 09: ifne 27
      // 0c: ifne 1c
      // 0f: goto 16
      // 12: invokestatic m7l.a (Loov;)Loov;
      // 15: athrow
      // 16: bipush 0
      // 17: ireturn
      // 18: invokestatic m7l.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 0
      // 1d: dup
      // 1e: getfield m7l.svk I
      // 21: bipush 1
      // 22: isub
      // 23: putfield m7l.svk I
      // 26: bipush 1
      // 27: ireturn
   }

   private void g8z() {
      this.svk = 0;
      this.m7n = false;
   }

   public String j16() {
      return this.w67;
   }

   public int g2s() {
      return this.hc5;
   }

   public int xbs() {
      return this.or0;
   }

   public void m15(int var1) {
      this.or0 = var1;
   }

   public int bkh(m7l var1) {
      int var2 = t9d.b();
      int var3 = fc1.gx1(this.pbq, new Object[0]).compareTo(fc1.gx1(var1.pbq, new Object[0]));

      try {
         if (var2 == 0) {
            return var3;
         }

         if (var3 != 0) {
            return var3;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      return fc1.gx1(this.w67, new Object[0]).compareTo(fc1.gx1(var1.w67, new Object[0]));
   }

   public void xdn(boolean var1) {
      this.m7n = var1;
   }

   @Override
   public int compareTo(Object var1) {
      return this.bkh((m7l)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
