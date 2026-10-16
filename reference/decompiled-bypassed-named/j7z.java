import com.google.common.collect.Lists;
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
import java.util.TreeMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class j7z {
   private OpaquePredicate uu1;
   private final List kwn = Lists.newArrayList();
   private mew wkf = mew._9b;
   private mew neb = mew._9b;
   private int rns;
   private int ge7;
   private int xkp;
   private int p7a;
   private int xmq;
   private TreeMap upp = new TreeMap();
   private List fqy = Lists.newArrayList();
   private int _70;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public j7z() {
   }

   public j7z(OpaquePredicate var1) {
      this.uu1 = var1;
   }

   public void d3e(OpaquePredicate var1) {
      this.uu1 = var1;
   }

   public void yeq(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: iload 1
      // 02: putfield j7z.xkp I
      // 05: aload 0
      // 06: invokespecial j7z.bix ()V
      // 09: invokestatic OpaquePredicate.b ()I
      // 0c: aload 0
      // 0d: invokespecial j7z.nmm ()V
      // 10: istore 2
      // 11: iload 1
      // 12: bipush 20
      // 14: irem
      // 15: iload 2
      // 16: ifeq 32
      // 19: ifne 2e
      // 1c: goto 23
      // 1f: invokestatic j7z.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 0
      // 24: invokespecial j7z.b0f ()V
      // 27: goto 2e
      // 2a: invokestatic j7z.a (Loov;)Loov;
      // 2d: athrow
      // 2e: iload 1
      // 2f: bipush 30
      // 31: irem
      // 32: iload 2
      // 33: ifeq 52
      // 36: ifne 4b
      // 39: goto 40
      // 3c: invokestatic j7z.a (Loov;)Loov;
      // 3f: athrow
      // 40: aload 0
      // 41: invokespecial j7z.vmd ()V
      // 44: goto 4b
      // 47: invokestatic j7z.a (Loov;)Loov;
      // 4a: athrow
      // 4b: aload 0
      // 4c: getfield j7z.p7a I
      // 4f: bipush 10
      // 51: idiv
      // 52: istore 3
      // 53: aload 0
      // 54: getfield j7z._70 I
      // 57: iload 3
      // 58: iload 2
      // 59: ifeq 83
      // 5c: if_icmpge ef
      // 5f: goto 66
      // 62: invokestatic j7z.a (Loov;)Loov;
      // 65: athrow
      // 66: aload 0
      // 67: getfield j7z.kwn Ljava/util/List;
      // 6a: invokeinterface java/util/List.size ()I 1
      // 6f: iload 2
      // 70: ifeq a5
      // 73: goto 7a
      // 76: invokestatic j7z.a (Loov;)Loov;
      // 79: athrow
      // 7a: bipush 20
      // 7c: goto 83
      // 7f: invokestatic j7z.a (Loov;)Loov;
      // 82: athrow
      // 83: if_icmple ef
      // 86: aload 0
      // 87: iload 2
      // 88: ifeq a9
      // 8b: goto 92
      // 8e: invokestatic j7z.a (Loov;)Loov;
      // 91: athrow
      // 92: getfield j7z.uu1 Lt9d;
      // 95: getfield OpaquePredicate.fsy Ljava/util/Random;
      // 98: sipush 7000
      // 9b: invokevirtual java/util/Random.nextInt (I)I
      // 9e: goto a5
      // a1: invokestatic j7z.a (Loov;)Loov;
      // a4: athrow
      // a5: ifne ef
      // a8: aload 0
      // a9: aload 0
      // aa: getfield j7z.neb Lmew;
      // ad: bipush 2
      // ae: bipush 4
      // af: bipush 2
      // b0: invokespecial j7z.d9e (Lmew;III)Lfqr;
      // b3: astore 4
      // b5: aload 4
      // b7: ifnull ef
      // ba: new EntityIronGolem
      // bd: dup
      // be: aload 0
      // bf: getfield j7z.uu1 Lt9d;
      // c2: invokespecial EntityIronGolem.<init> (Lt9d;)V
      // c5: astore 5
      // c7: aload 5
      // c9: aload 4
      // cb: getfield fqr.lvi D
      // ce: aload 4
      // d0: getfield fqr.gn5 D
      // d3: aload 4
      // d5: getfield fqr.bn2 D
      // d8: invokevirtual EntityIronGolem.m6_ (DDD)V
      // db: aload 0
      // dc: getfield j7z.uu1 Lt9d;
      // df: aload 5
      // e1: invokevirtual OpaquePredicate.xzq (Li2h;)Z
      // e4: pop
      // e5: aload 0
      // e6: dup
      // e7: getfield j7z._70 I
      // ea: bipush 1
      // eb: iadd
      // ec: putfield j7z._70 I
      // ef: return
   }

   private fqr d9e(mew param1, int param2, int param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 5
      // 05: bipush 0
      // 06: istore 6
      // 08: iload 6
      // 0a: bipush 10
      // 0c: if_icmpge 97
      // 0f: aload 1
      // 10: aload 0
      // 11: getfield j7z.uu1 Lt9d;
      // 14: getfield OpaquePredicate.fsy Ljava/util/Random;
      // 17: bipush 16
      // 19: invokevirtual java/util/Random.nextInt (I)I
      // 1c: bipush 8
      // 1e: isub
      // 1f: aload 0
      // 20: getfield j7z.uu1 Lt9d;
      // 23: getfield OpaquePredicate.fsy Ljava/util/Random;
      // 26: bipush 6
      // 28: invokevirtual java/util/Random.nextInt (I)I
      // 2b: bipush 3
      // 2c: isub
      // 2d: aload 0
      // 2e: getfield j7z.uu1 Lt9d;
      // 31: getfield OpaquePredicate.fsy Ljava/util/Random;
      // 34: bipush 16
      // 36: invokevirtual java/util/Random.nextInt (I)I
      // 39: bipush 8
      // 3b: isub
      // 3c: invokevirtual mew.ec4 (III)Lmew;
      // 3f: astore 7
      // 41: iload 5
      // 43: ifne 92
      // 46: aload 0
      // 47: aload 7
      // 49: invokevirtual j7z.saveBinds (Lmew;)Z
      // 4c: ifeq 8f
      // 4f: goto 56
      // 52: invokestatic j7z.a (Loov;)Loov;
      // 55: athrow
      // 56: aload 0
      // 57: new mew
      // 5a: dup
      // 5b: iload 2
      // 5c: iload 3
      // 5d: iload 4
      // 5f: invokespecial mew.<init> (III)V
      // 62: aload 7
      // 64: invokespecial j7z.npv (Lmew;Lmew;)Z
      // 67: ifeq 8f
      // 6a: goto 71
      // 6d: invokestatic j7z.a (Loov;)Loov;
      // 70: athrow
      // 71: new fqr
      // 74: dup
      // 75: aload 7
      // 77: invokevirtual mew.getX ()I
      // 7a: i2d
      // 7b: aload 7
      // 7d: invokevirtual mew.getY ()I
      // 80: i2d
      // 81: aload 7
      // 83: invokevirtual mew.getZ ()I
      // 86: i2d
      // 87: invokespecial fqr.<init> (DDD)V
      // 8a: areturn
      // 8b: invokestatic j7z.a (Loov;)Loov;
      // 8e: athrow
      // 8f: iinc 6 1
      // 92: iload 5
      // 94: ifeq 08
      // 97: aconst_null
      // 98: areturn
   }

   private boolean npv(mew param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: aload 0
      // 05: getfield j7z.uu1 Lt9d;
      // 08: aload 2
      // 09: invokevirtual mew.eve ()Lmew;
      // 0c: invokestatic OpaquePredicate.r3_ (Lm5n;Lmew;)Z
      // 0f: iload 3
      // 10: ifne 2e
      // 13: ifne 23
      // 16: goto 1d
      // 19: invokestatic j7z.a (Loov;)Loov;
      // 1c: athrow
      // 1d: bipush 0
      // 1e: ireturn
      // 1f: invokestatic j7z.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 2
      // 24: invokevirtual mew.getX ()I
      // 27: aload 1
      // 28: invokevirtual mew.getX ()I
      // 2b: bipush 2
      // 2c: idiv
      // 2d: isub
      // 2e: istore 4
      // 30: aload 2
      // 31: invokevirtual mew.getZ ()I
      // 34: aload 1
      // 35: invokevirtual mew.getZ ()I
      // 38: bipush 2
      // 39: idiv
      // 3a: isub
      // 3b: istore 5
      // 3d: iload 4
      // 3f: istore 6
      // 41: iload 6
      // 43: iload 4
      // 45: aload 1
      // 46: invokevirtual mew.getX ()I
      // 49: iadd
      // 4a: if_icmpge be
      // 4d: aload 2
      // 4e: invokevirtual mew.getY ()I
      // 51: iload 3
      // 52: ifne bf
      // 55: istore 7
      // 57: iload 7
      // 59: aload 2
      // 5a: invokevirtual mew.getY ()I
      // 5d: aload 1
      // 5e: invokevirtual mew.getY ()I
      // 61: iadd
      // 62: if_icmpge b7
      // 65: iload 5
      // 67: iload 3
      // 68: ifne 43
      // 6b: istore 8
      // 6d: iload 8
      // 6f: iload 5
      // 71: aload 1
      // 72: invokevirtual mew.getZ ()I
      // 75: iadd
      // 76: if_icmpge b0
      // 79: aload 0
      // 7a: getfield j7z.uu1 Lt9d;
      // 7d: new mew
      // 80: dup
      // 81: iload 6
      // 83: iload 7
      // 85: iload 8
      // 87: invokespecial mew.<init> (III)V
      // 8a: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 8d: invokeinterface zfz.r_y ()Le0x; 1
      // 92: invokevirtual e0x.y0n ()Z
      // 95: iload 3
      // 96: ifne 59
      // 99: iload 3
      // 9a: ifne a8
      // 9d: ifeq a9
      // a0: goto a7
      // a3: invokestatic j7z.a (Loov;)Loov;
      // a6: athrow
      // a7: bipush 0
      // a8: ireturn
      // a9: iinc 8 1
      // ac: iload 3
      // ad: ifeq 6d
      // b0: iinc 7 1
      // b3: iload 3
      // b4: ifeq 57
      // b7: iinc 6 1
      // ba: iload 3
      // bb: ifeq 41
      // be: bipush 1
      // bf: ireturn
   }

   private void vmd() {
      List var1 = this.uu1
         .m_z(
            EntityIronGolem.class,
            new nh4(
               (double)(this.neb.getX() - this.rns),
               (double)(this.neb.getY() - 4),
               (double)(this.neb.getZ() - this.rns),
               (double)(this.neb.getX() + this.rns),
               (double)(this.neb.getY() + 4),
               (double)(this.neb.getZ() + this.rns)
            )
         );
      this._70 = var1.size();
   }

   private void b0f() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield j7z.uu1 Lt9d;
      // 04: ldc ysf
      // 06: nop
      // 07: new nh4
      // 0a: dup
      // 0b: aload 0
      // 0c: getfield j7z.neb Lmew;
      // 0f: invokevirtual mew.getX ()I
      // 12: aload 0
      // 13: getfield j7z.rns I
      // 16: isub
      // 17: i2d
      // 18: aload 0
      // 19: getfield j7z.neb Lmew;
      // 1c: invokevirtual mew.getY ()I
      // 1f: bipush 4
      // 20: isub
      // 21: i2d
      // 22: aload 0
      // 23: getfield j7z.neb Lmew;
      // 26: invokevirtual mew.getZ ()I
      // 29: aload 0
      // 2a: getfield j7z.rns I
      // 2d: isub
      // 2e: i2d
      // 2f: aload 0
      // 30: getfield j7z.neb Lmew;
      // 33: invokevirtual mew.getX ()I
      // 36: aload 0
      // 37: getfield j7z.rns I
      // 3a: iadd
      // 3b: i2d
      // 3c: aload 0
      // 3d: getfield j7z.neb Lmew;
      // 40: invokevirtual mew.getY ()I
      // 43: bipush 4
      // 44: iadd
      // 45: i2d
      // 46: aload 0
      // 47: getfield j7z.neb Lmew;
      // 4a: invokevirtual mew.getZ ()I
      // 4d: aload 0
      // 4e: getfield j7z.rns I
      // 51: iadd
      // 52: i2d
      // 53: invokespecial nh4.<init> (DDDDDD)V
      // 56: invokevirtual OpaquePredicate.m_z (Ljava/lang/Class;Lnh4;)Ljava/util/List;
      // 59: astore 2
      // 5a: invokestatic OpaquePredicate.c ()I
      // 5d: aload 0
      // 5e: aload 2
      // 5f: invokeinterface java/util/List.size ()I 1
      // 64: putfield j7z.p7a I
      // 67: istore 1
      // 68: aload 0
      // 69: iload 1
      // 6a: ifne 82
      // 6d: getfield j7z.p7a I
      // 70: ifne 88
      // 73: goto 7a
      // 76: invokestatic j7z.a (Loov;)Loov;
      // 79: athrow
      // 7a: aload 0
      // 7b: goto 82
      // 7e: invokestatic j7z.a (Loov;)Loov;
      // 81: athrow
      // 82: getfield j7z.upp Ljava/util/TreeMap;
      // 85: invokevirtual java/util/TreeMap.clear ()V
      // 88: return
   }

   public mew n0h() {
      return this.neb;
   }

   public int hk4() {
      return this.rns;
   }

   public int v0k() {
      return this.kwn.size();
   }

   public int vyp() {
      return this.xkp - this.ge7;
   }

   public int ucg() {
      return this.p7a;
   }

   public boolean saveBinds(mew var1) {
      int var2 = OpaquePredicate.b();

      try {
         double var4;
         int var10000 = (var4 = this.neb.t0u(var1) - (double)(this.rns * this.rns)) == 0.0 ? 0 : (var4 < 0.0 ? -1 : 1);
         if (var2 == 0) {
            return (boolean)var10000;
         }

         if (var10000 < 0) {
            return (boolean)1;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return (boolean)0;
   }

   public List z3b() {
      return this.kwn;
   }

   public wdx cab(mew var1) {
      wdx var3 = null;
      int var10000 = OpaquePredicate.c();
      int var4 = Integer.MAX_VALUE;
      int var2 = var10000;
      Iterator var5 = this.kwn.iterator();

      while (true) {
         if (var5.hasNext()) {
            wdx var6 = (wdx)var5.next();
            var9 = var6;
            if (var2 != 0) {
               break;
            }

            int var7 = var6.kjj(var1);

            label30: {
               label29: {
                  try {
                     var10000 = var7;
                     if (var2 != 0) {
                        break label29;
                     }

                     if (var7 >= var4) {
                        break label30;
                     }
                  } catch (oov var8) {
                     throw a(var8);
                  }

                  var3 = var6;
                  var10000 = var7;
               }

               var4 = var10000;
            }

            if (var2 == 0) {
               continue;
            }
         }

         var9 = var3;
         break;
      }

      return var9;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public wdx drq(mew var1) {
      wdx var3 = null;
      int var10000 = OpaquePredicate.b();
      int var4 = Integer.MAX_VALUE;
      int var2 = var10000;

      for (wdx var6 : this.kwn) {
         if (var2 == 0) {
            return var6;
         }

         int var7 = var6.kjj(var1);

         label64: {
            label63: {
               label74: {
                  try {
                     var10000 = var7;
                     if (var2 == 0) {
                        break label63;
                     }

                     if (var7 <= 256) {
                        break label74;
                     }
                  } catch (oov var11) {
                     throw a(var11);
                  }

                  var7 *= 1000;

                  try {
                     if (var2 != 0) {
                        break label64;
                     }
                  } catch (oov var10) {
                     boolean var10001 = false;
                     throw a(var10);
                  }
               }

               try {
                  var10000 = var6.coz();
               } catch (oov var9) {
                  boolean var17 = false;
                  throw a(var9);
               }
            }

            var7 = var10000;
         }

         label44: {
            label43: {
               try {
                  var10000 = var7;
                  if (var2 == 0) {
                     break label43;
                  }

                  if (var7 >= var4) {
                     break label44;
                  }
               } catch (oov var8) {
                  throw a(var8);
               }

               var3 = var6;
               var10000 = var7;
            }

            var4 = var10000;
         }

         if (var2 == 0) {
            break;
         }
      }

      return var3;
   }

   public wdx _wo(mew param1) {
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
      // 06: ifne 2c
      // 09: getfield j7z.neb Lmew;
      // 0c: aload 1
      // 0d: invokevirtual mew.t0u (Lwgo;)D
      // 10: aload 0
      // 11: getfield j7z.rns I
      // 14: aload 0
      // 15: getfield j7z.rns I
      // 18: imul
      // 19: i2d
      // 1a: dcmpl
      // 1b: ifle 2b
      // 1e: goto 25
      // 21: invokestatic j7z.a (Loov;)Loov;
      // 24: athrow
      // 25: aconst_null
      // 26: areturn
      // 27: invokestatic j7z.a (Loov;)Loov;
      // 2a: athrow
      // 2b: aload 0
      // 2c: getfield j7z.kwn Ljava/util/List;
      // 2f: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 34: astore 3
      // 35: aload 3
      // 36: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3b: ifeq b1
      // 3e: aload 3
      // 3f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 44: checkcast wdx
      // 47: astore 4
      // 49: aload 4
      // 4b: invokevirtual wdx._d5 ()Lmew;
      // 4e: invokevirtual mew.getX ()I
      // 51: aload 1
      // 52: invokevirtual mew.getX ()I
      // 55: iload 2
      // 56: ifne 76
      // 59: if_icmpne ad
      // 5c: goto 63
      // 5f: invokestatic j7z.a (Loov;)Loov;
      // 62: athrow
      // 63: aload 4
      // 65: invokevirtual wdx._d5 ()Lmew;
      // 68: invokevirtual mew.getZ ()I
      // 6b: aload 1
      // 6c: invokevirtual mew.getZ ()I
      // 6f: goto 76
      // 72: invokestatic j7z.a (Loov;)Loov;
      // 75: athrow
      // 76: iload 2
      // 77: ifne a7
      // 7a: if_icmpne ad
      // 7d: goto 84
      // 80: invokestatic j7z.a (Loov;)Loov;
      // 83: athrow
      // 84: aload 4
      // 86: iload 2
      // 87: ifne ac
      // 8a: goto 91
      // 8d: invokestatic j7z.a (Loov;)Loov;
      // 90: athrow
      // 91: invokevirtual wdx._d5 ()Lmew;
      // 94: invokevirtual mew.getY ()I
      // 97: aload 1
      // 98: invokevirtual mew.getY ()I
      // 9b: isub
      // 9c: invokestatic java/lang/Math.abs (I)I
      // 9f: bipush 1
      // a0: goto a7
      // a3: invokestatic j7z.a (Loov;)Loov;
      // a6: athrow
      // a7: if_icmpgt ad
      // aa: aload 4
      // ac: areturn
      // ad: iload 2
      // ae: ifeq 35
      // b1: aconst_null
      // b2: areturn
   }

   public void hv3(wdx var1) {
      this.kwn.add(var1);
      this.wkf = this.wkf.m2c(var1._d5());
      this._kj();
      this.ge7 = var1.ebj();
   }

   public boolean fr6() {
      return this.kwn.isEmpty();
   }

   public void yvo(Entity param1) {
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
      // 05: getfield j7z.fqy Ljava/util/List;
      // 08: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0d: astore 3
      // 0e: aload 3
      // 0f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 14: ifeq 56
      // 17: aload 3
      // 18: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1d: checkcast j7z$fxo
      // 20: astore 4
      // 22: iload 2
      // 23: ifeq 6d
      // 26: aload 4
      // 28: iload 2
      // 29: ifeq 4a
      // 2c: goto 33
      // 2f: invokestatic j7z.a (Loov;)Loov;
      // 32: athrow
      // 33: getfield j7z$fxo.myx Lg_3;
      // 36: aload 1
      // 37: if_acmpne 52
      // 3a: goto 41
      // 3d: invokestatic j7z.a (Loov;)Loov;
      // 40: athrow
      // 41: aload 4
      // 43: goto 4a
      // 46: invokestatic j7z.a (Loov;)Loov;
      // 49: athrow
      // 4a: aload 0
      // 4b: getfield j7z.xkp I
      // 4e: putfield j7z$fxo.lls I
      // 51: return
      // 52: iload 2
      // 53: ifne 0e
      // 56: aload 0
      // 57: getfield j7z.fqy Ljava/util/List;
      // 5a: new j7z$fxo
      // 5d: dup
      // 5e: aload 0
      // 5f: aload 1
      // 60: aload 0
      // 61: getfield j7z.xkp I
      // 64: invokespecial j7z$fxo.<init> (Lj7z;Lg_3;I)V
      // 67: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 6c: pop
      // 6d: return
   }

   public Entity gfg(Entity param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc2_w 1.7976931348623157E308
      // 03: dstore 3
      // 04: invokestatic OpaquePredicate.b ()I
      // 07: aconst_null
      // 08: astore 5
      // 0a: istore 2
      // 0b: bipush 0
      // 0c: istore 6
      // 0e: iload 6
      // 10: aload 0
      // 11: getfield j7z.fqy Ljava/util/List;
      // 14: invokeinterface java/util/List.size ()I 1
      // 19: if_icmpge 62
      // 1c: aload 0
      // 1d: getfield j7z.fqy Ljava/util/List;
      // 20: iload 6
      // 22: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 27: checkcast j7z$fxo
      // 2a: astore 7
      // 2c: aload 7
      // 2e: getfield j7z$fxo.myx Lg_3;
      // 31: aload 1
      // 32: invokevirtual Entity.wxg (Li2h;)D
      // 35: dstore 8
      // 37: iload 2
      // 38: ifeq 7a
      // 3b: iload 2
      // 3c: ifeq 5e
      // 3f: goto 46
      // 42: invokestatic j7z.a (Loov;)Loov;
      // 45: athrow
      // 46: dload 8
      // 48: dload 3
      // 49: dcmpg
      // 4a: ifgt 5b
      // 4d: goto 54
      // 50: invokestatic j7z.a (Loov;)Loov;
      // 53: athrow
      // 54: aload 7
      // 56: astore 5
      // 58: dload 8
      // 5a: dstore 3
      // 5b: iinc 6 1
      // 5e: iload 2
      // 5f: ifne 0e
      // 62: aload 5
      // 64: iload 2
      // 65: ifeq 74
      // 68: ifnull 7a
      // 6b: goto 72
      // 6e: invokestatic j7z.a (Loov;)Loov;
      // 71: athrow
      // 72: aload 5
      // 74: getfield j7z$fxo.myx Lg_3;
      // 77: goto 7b
      // 7a: aconst_null
      // 7b: areturn
   }

   public ha9 b5t(Entity param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc2_w 1.7976931348623157E308
      // 03: dstore 3
      // 04: invokestatic OpaquePredicate.c ()I
      // 07: aconst_null
      // 08: astore 5
      // 0a: aload 0
      // 0b: getfield j7z.upp Ljava/util/TreeMap;
      // 0e: invokevirtual java/util/TreeMap.keySet ()Ljava/util/Set;
      // 11: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 16: astore 6
      // 18: istore 2
      // 19: aload 6
      // 1b: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 20: ifeq 8a
      // 23: aload 6
      // 25: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2a: checkcast java/lang/String
      // 2d: astore 7
      // 2f: aload 0
      // 30: iload 2
      // 31: ifne 4b
      // 34: aload 7
      // 36: invokevirtual j7z.ipc (Ljava/lang/String;)Z
      // 39: ifeq 86
      // 3c: goto 43
      // 3f: invokestatic j7z.a (Loov;)Loov;
      // 42: athrow
      // 43: aload 0
      // 44: goto 4b
      // 47: invokestatic j7z.a (Loov;)Loov;
      // 4a: athrow
      // 4b: getfield j7z.uu1 Lt9d;
      // 4e: aload 7
      // 50: invokevirtual OpaquePredicate.aev (Ljava/lang/String;)Lha9;
      // 53: astore 8
      // 55: aload 8
      // 57: iload 2
      // 58: ifne 67
      // 5b: ifnull 86
      // 5e: goto 65
      // 61: invokestatic j7z.a (Loov;)Loov;
      // 64: athrow
      // 65: aload 8
      // 67: aload 1
      // 68: invokevirtual ha9.wxg (Li2h;)D
      // 6b: dstore 9
      // 6d: dload 9
      // 6f: iload 2
      // 70: ifne 85
      // 73: dload 3
      // 74: dcmpg
      // 75: ifgt 86
      // 78: goto 7f
      // 7b: invokestatic j7z.a (Loov;)Loov;
      // 7e: athrow
      // 7f: aload 8
      // 81: astore 5
      // 83: dload 9
      // 85: dstore 3
      // 86: iload 2
      // 87: ifeq 19
      // 8a: aload 5
      // 8c: areturn
   }

   private void nmm() {
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
      // 05: getfield j7z.fqy Ljava/util/List;
      // 08: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0d: astore 2
      // 0e: aload 2
      // 0f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 14: ifeq 60
      // 17: aload 2
      // 18: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1d: checkcast j7z$fxo
      // 20: astore 3
      // 21: aload 3
      // 22: getfield j7z$fxo.myx Lg_3;
      // 25: invokevirtual Entity.gzr ()Z
      // 28: iload 1
      // 29: ifne 49
      // 2c: ifeq 4f
      // 2f: goto 36
      // 32: invokestatic j7z.a (Loov;)Loov;
      // 35: athrow
      // 36: aload 0
      // 37: getfield j7z.xkp I
      // 3a: aload 3
      // 3b: getfield j7z$fxo.lls I
      // 3e: isub
      // 3f: invokestatic java/lang/Math.abs (I)I
      // 42: goto 49
      // 45: invokestatic j7z.a (Loov;)Loov;
      // 48: athrow
      // 49: sipush 300
      // 4c: if_icmple 5c
      // 4f: aload 2
      // 50: invokeinterface java/util/Iterator.remove ()V 1
      // 55: goto 5c
      // 58: invokestatic j7z.a (Loov;)Loov;
      // 5b: athrow
      // 5c: iload 1
      // 5d: ifeq 0e
      // 60: return
   }

   private void bix() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: bipush 0
      // 05: istore 2
      // 06: aload 0
      // 07: getfield j7z.uu1 Lt9d;
      // 0a: getfield OpaquePredicate.fsy Ljava/util/Random;
      // 0d: bipush 50
      // 0f: invokevirtual java/util/Random.nextInt (I)I
      // 12: iload 1
      // 13: ifne 21
      // 16: ifne 24
      // 19: goto 20
      // 1c: invokestatic j7z.a (Loov;)Loov;
      // 1f: athrow
      // 20: bipush 1
      // 21: goto 25
      // 24: bipush 0
      // 25: istore 3
      // 26: aload 0
      // 27: getfield j7z.kwn Ljava/util/List;
      // 2a: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 2f: astore 4
      // 31: aload 4
      // 33: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 38: ifeq d3
      // 3b: aload 4
      // 3d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 42: checkcast wdx
      // 45: astore 5
      // 47: iload 3
      // 48: iload 1
      // 49: ifne d4
      // 4c: iload 1
      // 4d: ifne 76
      // 50: goto 57
      // 53: invokestatic j7z.a (Loov;)Loov;
      // 56: athrow
      // 57: ifeq 6d
      // 5a: goto 61
      // 5d: invokestatic j7z.a (Loov;)Loov;
      // 60: athrow
      // 61: aload 5
      // 63: invokevirtual wdx.hek ()V
      // 66: goto 6d
      // 69: invokestatic j7z.a (Loov;)Loov;
      // 6c: athrow
      // 6d: aload 0
      // 6e: aload 5
      // 70: invokevirtual wdx._d5 ()Lmew;
      // 73: invokespecial j7z.jtr (Lmew;)Z
      // 76: iload 1
      // 77: ifne c1
      // 7a: ifeq a9
      // 7d: goto 84
      // 80: invokestatic j7z.a (Loov;)Loov;
      // 83: athrow
      // 84: aload 0
      // 85: getfield j7z.xkp I
      // 88: aload 5
      // 8a: invokevirtual wdx.ebj ()I
      // 8d: isub
      // 8e: invokestatic java/lang/Math.abs (I)I
      // 91: iload 1
      // 92: ifne c1
      // 95: goto 9c
      // 98: invokestatic j7z.a (Loov;)Loov;
      // 9b: athrow
      // 9c: sipush 1200
      // 9f: if_icmple cf
      // a2: goto a9
      // a5: invokestatic j7z.a (Loov;)Loov;
      // a8: athrow
      // a9: aload 0
      // aa: aload 0
      // ab: getfield j7z.wkf Lmew;
      // ae: aload 5
      // b0: invokevirtual wdx._d5 ()Lmew;
      // b3: invokevirtual mew.dg4 (Lwgo;)Lmew;
      // b6: putfield j7z.wkf Lmew;
      // b9: bipush 1
      // ba: goto c1
      // bd: invokestatic j7z.a (Loov;)Loov;
      // c0: athrow
      // c1: istore 2
      // c2: aload 5
      // c4: bipush 1
      // c5: invokevirtual wdx.ycl (Z)V
      // c8: aload 4
      // ca: invokeinterface java/util/Iterator.remove ()V 1
      // cf: iload 1
      // d0: ifeq 31
      // d3: iload 2
      // d4: ifeq e2
      // d7: aload 0
      // d8: invokespecial j7z._kj ()V
      // db: goto e2
      // de: invokestatic j7z.a (Loov;)Loov;
      // e1: athrow
      // e2: return
   }

   private boolean jtr(mew param1) {
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
      // 05: getfield j7z.uu1 Lt9d;
      // 08: aload 1
      // 09: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 0c: invokeinterface zfz.r_y ()Le0x; 1
      // 11: astore 3
      // 12: aload 3
      // 13: iload 2
      // 14: ifeq 2c
      // 17: instanceof w4e
      // 1a: ifeq 41
      // 1d: goto 24
      // 20: invokestatic j7z.a (Loov;)Loov;
      // 23: athrow
      // 24: aload 3
      // 25: goto 2c
      // 28: invokestatic j7z.a (Loov;)Loov;
      // 2b: athrow
      // 2c: invokevirtual e0x.p1r ()Lp3y;
      // 2f: getstatic p3y.fdu Lp3y;
      // 32: if_acmpne 3d
      // 35: bipush 1
      // 36: goto 42
      // 39: invokestatic j7z.a (Loov;)Loov;
      // 3c: athrow
      // 3d: bipush 0
      // 3e: goto 42
      // 41: bipush 0
      // 42: ireturn
   }

   private void _kj() {
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
      // 05: getfield j7z.kwn Ljava/util/List;
      // 08: invokeinterface java/util/List.size ()I 1
      // 0d: istore 2
      // 0e: iload 2
      // 0f: iload 1
      // 10: ifne 69
      // 13: ifne 3b
      // 16: goto 1d
      // 19: invokestatic j7z.a (Loov;)Loov;
      // 1c: athrow
      // 1d: aload 0
      // 1e: new mew
      // 21: dup
      // 22: bipush 0
      // 23: bipush 0
      // 24: bipush 0
      // 25: invokespecial mew.<init> (III)V
      // 28: putfield j7z.neb Lmew;
      // 2b: aload 0
      // 2c: bipush 0
      // 2d: putfield j7z.rns I
      // 30: iload 1
      // 31: ifeq b9
      // 34: goto 3b
      // 37: invokestatic j7z.a (Loov;)Loov;
      // 3a: athrow
      // 3b: aload 0
      // 3c: new mew
      // 3f: dup
      // 40: aload 0
      // 41: getfield j7z.wkf Lmew;
      // 44: invokevirtual mew.getX ()I
      // 47: iload 2
      // 48: idiv
      // 49: aload 0
      // 4a: getfield j7z.wkf Lmew;
      // 4d: invokevirtual mew.getY ()I
      // 50: iload 2
      // 51: idiv
      // 52: aload 0
      // 53: getfield j7z.wkf Lmew;
      // 56: invokevirtual mew.getZ ()I
      // 59: iload 2
      // 5a: idiv
      // 5b: invokespecial mew.<init> (III)V
      // 5e: putfield j7z.neb Lmew;
      // 61: bipush 0
      // 62: goto 69
      // 65: invokestatic j7z.a (Loov;)Loov;
      // 68: athrow
      // 69: istore 3
      // 6a: aload 0
      // 6b: getfield j7z.kwn Ljava/util/List;
      // 6e: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 73: astore 4
      // 75: aload 4
      // 77: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 7c: ifeq a8
      // 7f: aload 4
      // 81: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 86: checkcast wdx
      // 89: astore 5
      // 8b: aload 5
      // 8d: aload 0
      // 8e: getfield j7z.neb Lmew;
      // 91: invokevirtual wdx.kjj (Lmew;)I
      // 94: iload 3
      // 95: invokestatic java/lang/Math.max (II)I
      // 98: istore 3
      // 99: iload 1
      // 9a: ifne b9
      // 9d: iload 1
      // 9e: ifeq 75
      // a1: goto a8
      // a4: invokestatic j7z.a (Loov;)Loov;
      // a7: athrow
      // a8: aload 0
      // a9: bipush 32
      // ab: iload 3
      // ac: i2d
      // ad: invokestatic java/lang/Math.sqrt (D)D
      // b0: d2i
      // b1: bipush 1
      // b2: iadd
      // b3: invokestatic java/lang/Math.max (II)I
      // b6: putfield j7z.rns I
      // b9: return
   }

   public int vkb(String var1) {
      int var2 = OpaquePredicate.b();
      Integer var3 = (Integer)this.upp.get(var1);

      try {
         if (var2 == 0) {
            return var3;
         }

         if (var3 == null) {
            return 0;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      return var3;
   }

   public int ec4(String var1, int var2) {
      int var3 = this.vkb(var1);
      int var4 = fe6.faa(var3 + var2, -30, 10);
      this.upp.put(var1, var4);
      return var4;
   }

   public boolean ipc(String param1) {
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
      // 05: aload 1
      // 06: invokevirtual j7z.vkb (Ljava/lang/String;)I
      // 09: iload 2
      // 0a: ifeq 21
      // 0d: bipush -15
      // 0f: if_icmpgt 24
      // 12: goto 19
      // 15: invokestatic j7z.a (Loov;)Loov;
      // 18: athrow
      // 19: bipush 1
      // 1a: goto 21
      // 1d: invokestatic j7z.a (Loov;)Loov;
      // 20: athrow
      // 21: goto 25
      // 24: bipush 0
      // 25: ireturn
   }

   public void x0m(bdo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic j7z.a J
      // 003: ldc2_w 75988685224539
      // 006: lxor
      // 007: lstore 2
      // 008: aload 0
      // 009: aload 1
      // 00a: sipush 2217
      // 00d: ldc2_w 2377896949116944035
      // 010: lload 2
      // 011: lxor
      // 012: invokedynamic y (IJ)Ljava/lang/String; bsm=j7z.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 017: nop
      // 018: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 01b: putfield j7z.p7a I
      // 01e: aload 0
      // 01f: aload 1
      // 020: sipush 10450
      // 023: ldc2_w 4123862223382028021
      // 026: lload 2
      // 027: lxor
      // 028: invokedynamic y (IJ)Ljava/lang/String; bsm=j7z.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02d: nop
      // 02e: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 031: putfield j7z.rns I
      // 034: aload 0
      // 035: aload 1
      // 036: sipush 5788
      // 039: ldc2_w 4440856154242097309
      // 03c: lload 2
      // 03d: lxor
      // 03e: invokedynamic y (IJ)Ljava/lang/String; bsm=j7z.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 043: nop
      // 044: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 047: putfield j7z._70 I
      // 04a: aload 0
      // 04b: aload 1
      // 04c: sipush 26215
      // 04f: ldc2_w 1531797899682435185
      // 052: lload 2
      // 053: lxor
      // 054: invokedynamic y (IJ)Ljava/lang/String; bsm=j7z.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 059: nop
      // 05a: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 05d: putfield j7z.ge7 I
      // 060: aload 0
      // 061: aload 1
      // 062: sipush 13437
      // 065: ldc2_w 922990972095431264
      // 068: lload 2
      // 069: lxor
      // 06a: invokedynamic y (IJ)Ljava/lang/String; bsm=j7z.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06f: nop
      // 070: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 073: putfield j7z.xkp I
      // 076: invokestatic OpaquePredicate.b ()I
      // 079: aload 0
      // 07a: aload 1
      // 07b: sipush 24788
      // 07e: ldc2_w 2631586696283674327
      // 081: lload 2
      // 082: lxor
      // 083: invokedynamic y (IJ)Ljava/lang/String; bsm=j7z.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: nop
      // 089: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 08c: putfield j7z.xmq I
      // 08f: aload 0
      // 090: new mew
      // 093: dup
      // 094: aload 1
      // 095: sipush 6842
      // 098: ldc2_w 7623626621777882277
      // 09b: lload 2
      // 09c: lxor
      // 09d: invokedynamic y (IJ)Ljava/lang/String; bsm=j7z.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a2: nop
      // 0a3: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 0a6: aload 1
      // 0a7: sipush 29035
      // 0aa: ldc2_w 2406227262133552969
      // 0ad: lload 2
      // 0ae: lxor
      // 0af: invokedynamic y (IJ)Ljava/lang/String; bsm=j7z.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b4: nop
      // 0b5: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 0b8: aload 1
      // 0b9: sipush 21445
      // 0bc: ldc2_w 2115637486187013605
      // 0bf: lload 2
      // 0c0: lxor
      // 0c1: invokedynamic y (IJ)Ljava/lang/String; bsm=j7z.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c6: nop
      // 0c7: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 0ca: invokespecial mew.<init> (III)V
      // 0cd: putfield j7z.neb Lmew;
      // 0d0: aload 0
      // 0d1: new mew
      // 0d4: dup
      // 0d5: aload 1
      // 0d6: sipush 5662
      // 0d9: ldc2_w 8645211137181491213
      // 0dc: lload 2
      // 0dd: lxor
      // 0de: invokedynamic y (IJ)Ljava/lang/String; bsm=j7z.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e3: nop
      // 0e4: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 0e7: aload 1
      // 0e8: sipush 23602
      // 0eb: ldc2_w 7016069452412381756
      // 0ee: lload 2
      // 0ef: lxor
      // 0f0: invokedynamic y (IJ)Ljava/lang/String; bsm=j7z.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: nop
      // 0f6: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 0f9: aload 1
      // 0fa: sipush 4236
      // 0fd: ldc2_w 3401161336672167555
      // 100: lload 2
      // 101: lxor
      // 102: invokedynamic y (IJ)Ljava/lang/String; bsm=j7z.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 107: nop
      // 108: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 10b: invokespecial mew.<init> (III)V
      // 10e: putfield j7z.wkf Lmew;
      // 111: istore 4
      // 113: aload 1
      // 114: sipush 13943
      // 117: ldc2_w 6655374320433528949
      // 11a: lload 2
      // 11b: lxor
      // 11c: invokedynamic y (IJ)Ljava/lang/String; bsm=j7z.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 121: nop
      // 122: bipush 10
      // 124: invokevirtual bdo.bzb (Ljava/lang/String;I)Lqhg;
      // 127: astore 5
      // 129: bipush 0
      // 12a: istore 6
      // 12c: iload 6
      // 12e: aload 5
      // 130: invokevirtual qhg.vek ()I
      // 133: if_icmpge 1b9
      // 136: aload 5
      // 138: iload 6
      // 13a: invokevirtual qhg.kd6 (I)Lbdo;
      // 13d: iload 4
      // 13f: ifeq 1ba
      // 142: astore 7
      // 144: new wdx
      // 147: dup
      // 148: new mew
      // 14b: dup
      // 14c: aload 7
      // 14e: ldc "X"
      // 150: nop
      // 151: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 154: aload 7
      // 156: ldc "Y"
      // 158: nop
      // 159: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 15c: aload 7
      // 15e: ldc "Z"
      // 160: nop
      // 161: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 164: invokespecial mew.<init> (III)V
      // 167: aload 7
      // 169: sipush 22218
      // 16c: ldc2_w 3531594522511532254
      // 16f: lload 2
      // 170: lxor
      // 171: invokedynamic y (IJ)Ljava/lang/String; bsm=j7z.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 176: nop
      // 177: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 17a: aload 7
      // 17c: sipush 14242
      // 17f: ldc2_w 1345434644871184769
      // 182: lload 2
      // 183: lxor
      // 184: invokedynamic y (IJ)Ljava/lang/String; bsm=j7z.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 189: nop
      // 18a: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 18d: aload 7
      // 18f: sipush 17955
      // 192: ldc2_w 2434780736405041204
      // 195: lload 2
      // 196: lxor
      // 197: invokedynamic y (IJ)Ljava/lang/String; bsm=j7z.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19c: nop
      // 19d: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 1a0: invokespecial wdx.<init> (Lmew;III)V
      // 1a3: astore 8
      // 1a5: aload 0
      // 1a6: getfield j7z.kwn Ljava/util/List;
      // 1a9: aload 8
      // 1ab: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1b0: pop
      // 1b1: iinc 6 1
      // 1b4: iload 4
      // 1b6: ifne 12c
      // 1b9: aload 1
      // 1ba: sipush 20795
      // 1bd: ldc2_w 3810751226185901861
      // 1c0: lload 2
      // 1c1: lxor
      // 1c2: invokedynamic y (IJ)Ljava/lang/String; bsm=j7z.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c7: nop
      // 1c8: bipush 10
      // 1ca: invokevirtual bdo.bzb (Ljava/lang/String;I)Lqhg;
      // 1cd: astore 6
      // 1cf: bipush 0
      // 1d0: istore 7
      // 1d2: iload 7
      // 1d4: aload 6
      // 1d6: invokevirtual qhg.vek ()I
      // 1d9: if_icmpge 296
      // 1dc: aload 6
      // 1de: iload 7
      // 1e0: invokevirtual qhg.kd6 (I)Lbdo;
      // 1e3: astore 8
      // 1e5: aload 8
      // 1e7: iload 4
      // 1e9: ifeq 28d
      // 1ec: sipush 5240
      // 1ef: ldc2_w 1631351623620010600
      // 1f2: lload 2
      // 1f3: lxor
      // 1f4: invokedynamic y (IJ)Ljava/lang/String; bsm=j7z.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f9: nop
      // 1fa: invokevirtual bdo.dmw (Ljava/lang/String;)Z
      // 1fd: ifeq 261
      // 200: goto 207
      // 203: invokestatic j7z.a (Loov;)Loov;
      // 206: athrow
      // 207: invokestatic vr1._0v ()Lvr1;
      // 20a: invokevirtual vr1.y71 ()Lkr3;
      // 20d: astore 9
      // 20f: aload 9
      // 211: aload 8
      // 213: sipush 12715
      // 216: ldc2_w 2230176393417033658
      // 219: lload 2
      // 21a: lxor
      // 21b: invokedynamic y (IJ)Ljava/lang/String; bsm=j7z.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 220: nop
      // 221: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 224: invokestatic java/util/UUID.fromString (Ljava/lang/String;)Ljava/util/UUID;
      // 227: invokevirtual kr3.n9g (Ljava/util/UUID;)Lcom/mojang/authlib/GameProfile;
      // 22a: astore 10
      // 22c: aload 10
      // 22e: iload 4
      // 230: ifeq 25b
      // 233: ifnull 25c
      // 236: goto 23d
      // 239: invokestatic j7z.a (Loov;)Loov;
      // 23c: athrow
      // 23d: aload 0
      // 23e: getfield j7z.upp Ljava/util/TreeMap;
      // 241: aload 10
      // 243: invokevirtual com/mojang/authlib/GameProfile.getName ()Ljava/lang/String;
      // 246: aload 8
      // 248: ldc "S"
      // 24a: nop
      // 24b: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 24e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 251: invokevirtual java/util/TreeMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 254: goto 25b
      // 257: invokestatic j7z.a (Loov;)Loov;
      // 25a: athrow
      // 25b: pop
      // 25c: iload 4
      // 25e: ifne 28e
      // 261: aload 0
      // 262: getfield j7z.upp Ljava/util/TreeMap;
      // 265: aload 8
      // 267: sipush 22412
      // 26a: ldc2_w 6239246123451769238
      // 26d: lload 2
      // 26e: lxor
      // 26f: invokedynamic y (IJ)Ljava/lang/String; bsm=j7z.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 274: nop
      // 275: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 278: aload 8
      // 27a: ldc "S"
      // 27c: nop
      // 27d: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 280: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 283: invokevirtual java/util/TreeMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 286: goto 28d
      // 289: invokestatic j7z.a (Loov;)Loov;
      // 28c: athrow
      // 28d: pop
      // 28e: iinc 7 1
      // 291: iload 4
      // 293: ifne 1d2
      // 296: return
   }

   public void z7g(bdo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic j7z.a J
      // 003: ldc2_w 44582572574899
      // 006: lxor
      // 007: lstore 2
      // 008: aload 1
      // 009: sipush 21613
      // 00c: ldc2_w 1523205492202098839
      // 00f: lload 2
      // 010: lxor
      // 011: invokedynamic y (IJ)Ljava/lang/String; bsm=j7z.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 016: nop
      // 017: aload 0
      // 018: getfield j7z.p7a I
      // 01b: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 01e: aload 1
      // 01f: sipush 5395
      // 022: ldc2_w 2179616651050652144
      // 025: lload 2
      // 026: lxor
      // 027: invokedynamic y (IJ)Ljava/lang/String; bsm=j7z.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02c: nop
      // 02d: aload 0
      // 02e: getfield j7z.rns I
      // 031: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 034: aload 1
      // 035: sipush 24088
      // 038: ldc2_w 2298844371468999404
      // 03b: lload 2
      // 03c: lxor
      // 03d: invokedynamic y (IJ)Ljava/lang/String; bsm=j7z.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 042: nop
      // 043: aload 0
      // 044: getfield j7z._70 I
      // 047: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 04a: aload 1
      // 04b: sipush 12071
      // 04e: ldc2_w 8059224254302301126
      // 051: lload 2
      // 052: lxor
      // 053: invokedynamic y (IJ)Ljava/lang/String; bsm=j7z.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 058: nop
      // 059: aload 0
      // 05a: getfield j7z.ge7 I
      // 05d: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 060: aload 1
      // 061: sipush 16481
      // 064: ldc2_w 1893890593191609488
      // 067: lload 2
      // 068: lxor
      // 069: invokedynamic y (IJ)Ljava/lang/String; bsm=j7z.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06e: nop
      // 06f: aload 0
      // 070: getfield j7z.xkp I
      // 073: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 076: aload 1
      // 077: sipush 11449
      // 07a: ldc2_w 5452646024798054486
      // 07d: lload 2
      // 07e: lxor
      // 07f: invokedynamic y (IJ)Ljava/lang/String; bsm=j7z.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 084: nop
      // 085: aload 0
      // 086: getfield j7z.xmq I
      // 089: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 08c: aload 1
      // 08d: sipush 4690
      // 090: ldc2_w 6443918711534917298
      // 093: lload 2
      // 094: lxor
      // 095: invokedynamic y (IJ)Ljava/lang/String; bsm=j7z.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09a: nop
      // 09b: aload 0
      // 09c: getfield j7z.neb Lmew;
      // 09f: invokevirtual mew.getX ()I
      // 0a2: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 0a5: invokestatic OpaquePredicate.c ()I
      // 0a8: aload 1
      // 0a9: sipush 8196
      // 0ac: ldc2_w 2357290116249658617
      // 0af: lload 2
      // 0b0: lxor
      // 0b1: invokedynamic y (IJ)Ljava/lang/String; bsm=j7z.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b6: nop
      // 0b7: aload 0
      // 0b8: getfield j7z.neb Lmew;
      // 0bb: invokevirtual mew.getY ()I
      // 0be: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 0c1: aload 1
      // 0c2: sipush 3752
      // 0c5: ldc2_w 844449067537664576
      // 0c8: lload 2
      // 0c9: lxor
      // 0ca: invokedynamic y (IJ)Ljava/lang/String; bsm=j7z.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cf: nop
      // 0d0: aload 0
      // 0d1: getfield j7z.neb Lmew;
      // 0d4: invokevirtual mew.getZ ()I
      // 0d7: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 0da: aload 1
      // 0db: sipush 13134
      // 0de: ldc2_w 7108596793853818759
      // 0e1: lload 2
      // 0e2: lxor
      // 0e3: invokedynamic y (IJ)Ljava/lang/String; bsm=j7z.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e8: nop
      // 0e9: aload 0
      // 0ea: getfield j7z.wkf Lmew;
      // 0ed: invokevirtual mew.getX ()I
      // 0f0: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 0f3: aload 1
      // 0f4: sipush 577
      // 0f7: ldc2_w 7565989057136789157
      // 0fa: lload 2
      // 0fb: lxor
      // 0fc: invokedynamic y (IJ)Ljava/lang/String; bsm=j7z.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 101: nop
      // 102: aload 0
      // 103: getfield j7z.wkf Lmew;
      // 106: invokevirtual mew.getY ()I
      // 109: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 10c: aload 1
      // 10d: sipush 17094
      // 110: ldc2_w 9032938756181542443
      // 113: lload 2
      // 114: lxor
      // 115: invokedynamic y (IJ)Ljava/lang/String; bsm=j7z.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: nop
      // 11b: aload 0
      // 11c: getfield j7z.wkf Lmew;
      // 11f: invokevirtual mew.getZ ()I
      // 122: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 125: new qhg
      // 128: dup
      // 129: invokespecial qhg.<init> ()V
      // 12c: astore 5
      // 12e: istore 4
      // 130: aload 0
      // 131: getfield j7z.kwn Ljava/util/List;
      // 134: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 139: astore 6
      // 13b: aload 6
      // 13d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 142: ifeq 1ea
      // 145: aload 6
      // 147: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 14c: checkcast wdx
      // 14f: astore 7
      // 151: new bdo
      // 154: dup
      // 155: invokespecial bdo.<init> ()V
      // 158: astore 8
      // 15a: aload 8
      // 15c: ldc "X"
      // 15e: nop
      // 15f: aload 7
      // 161: invokevirtual wdx._d5 ()Lmew;
      // 164: invokevirtual mew.getX ()I
      // 167: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 16a: aload 8
      // 16c: ldc "Y"
      // 16e: nop
      // 16f: aload 7
      // 171: invokevirtual wdx._d5 ()Lmew;
      // 174: invokevirtual mew.getY ()I
      // 177: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 17a: aload 8
      // 17c: ldc "Z"
      // 17e: nop
      // 17f: aload 7
      // 181: invokevirtual wdx._d5 ()Lmew;
      // 184: invokevirtual mew.getZ ()I
      // 187: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 18a: aload 8
      // 18c: sipush 29186
      // 18f: ldc2_w 4134689161772791538
      // 192: lload 2
      // 193: lxor
      // 194: invokedynamic y (IJ)Ljava/lang/String; bsm=j7z.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 199: nop
      // 19a: aload 7
      // 19c: invokevirtual wdx.xd8 ()I
      // 19f: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 1a2: aload 8
      // 1a4: sipush 14493
      // 1a7: ldc2_w 7401990059284970611
      // 1aa: lload 2
      // 1ab: lxor
      // 1ac: invokedynamic y (IJ)Ljava/lang/String; bsm=j7z.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b1: nop
      // 1b2: aload 7
      // 1b4: invokevirtual wdx.xu8 ()I
      // 1b7: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 1ba: aload 8
      // 1bc: sipush 1862
      // 1bf: ldc2_w 3775808998508528565
      // 1c2: lload 2
      // 1c3: lxor
      // 1c4: invokedynamic y (IJ)Ljava/lang/String; bsm=j7z.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c9: nop
      // 1ca: aload 7
      // 1cc: invokevirtual wdx.ebj ()I
      // 1cf: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 1d2: aload 5
      // 1d4: aload 8
      // 1d6: invokevirtual qhg.w2j (Lgdw;)V
      // 1d9: iload 4
      // 1db: ifne 1fe
      // 1de: iload 4
      // 1e0: ifeq 13b
      // 1e3: goto 1ea
      // 1e6: invokestatic j7z.a (Loov;)Loov;
      // 1e9: athrow
      // 1ea: aload 1
      // 1eb: sipush 338
      // 1ee: ldc2_w 2107250623849792958
      // 1f1: lload 2
      // 1f2: lxor
      // 1f3: invokedynamic y (IJ)Ljava/lang/String; bsm=j7z.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f8: nop
      // 1f9: aload 5
      // 1fb: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 1fe: new qhg
      // 201: dup
      // 202: invokespecial qhg.<init> ()V
      // 205: astore 6
      // 207: aload 0
      // 208: getfield j7z.upp Ljava/util/TreeMap;
      // 20b: invokevirtual java/util/TreeMap.keySet ()Ljava/util/Set;
      // 20e: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 213: astore 7
      // 215: aload 7
      // 217: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 21c: ifeq 2a7
      // 21f: aload 7
      // 221: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 226: checkcast java/lang/String
      // 229: astore 8
      // 22b: new bdo
      // 22e: dup
      // 22f: invokespecial bdo.<init> ()V
      // 232: astore 9
      // 234: invokestatic vr1._0v ()Lvr1;
      // 237: invokevirtual vr1.y71 ()Lkr3;
      // 23a: astore 10
      // 23c: aload 10
      // 23e: aload 8
      // 240: invokevirtual kr3.wjp (Ljava/lang/String;)Lcom/mojang/authlib/GameProfile;
      // 243: astore 11
      // 245: iload 4
      // 247: ifne 2bb
      // 24a: iload 4
      // 24c: ifne 29b
      // 24f: goto 256
      // 252: invokestatic j7z.a (Loov;)Loov;
      // 255: athrow
      // 256: aload 11
      // 258: ifnull 2a2
      // 25b: goto 262
      // 25e: invokestatic j7z.a (Loov;)Loov;
      // 261: athrow
      // 262: aload 9
      // 264: sipush 12715
      // 267: ldc2_w 2230196666850719058
      // 26a: lload 2
      // 26b: lxor
      // 26c: invokedynamic y (IJ)Ljava/lang/String; bsm=j7z.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 271: nop
      // 272: aload 11
      // 274: invokevirtual com/mojang/authlib/GameProfile.getId ()Ljava/util/UUID;
      // 277: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
      // 27a: invokevirtual bdo.rjq (Ljava/lang/String;Ljava/lang/String;)V
      // 27d: aload 9
      // 27f: ldc "S"
      // 281: nop
      // 282: aload 0
      // 283: getfield j7z.upp Ljava/util/TreeMap;
      // 286: aload 8
      // 288: invokevirtual java/util/TreeMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 28b: checkcast java/lang/Integer
      // 28e: invokevirtual java/lang/Integer.intValue ()I
      // 291: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 294: goto 29b
      // 297: invokestatic j7z.a (Loov;)Loov;
      // 29a: athrow
      // 29b: aload 6
      // 29d: aload 9
      // 29f: invokevirtual qhg.w2j (Lgdw;)V
      // 2a2: iload 4
      // 2a4: ifeq 215
      // 2a7: aload 1
      // 2a8: sipush 20501
      // 2ab: ldc2_w 8543000749102320
      // 2ae: lload 2
      // 2af: lxor
      // 2b0: invokedynamic y (IJ)Ljava/lang/String; bsm=j7z.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b5: nop
      // 2b6: aload 6
      // 2b8: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 2bb: return
   }

   public void of2() {
      this.xmq = this.xkp;
   }

   public boolean eiw() {
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
      // 05: getfield j7z.xmq I
      // 08: iload 1
      // 09: ifne 3f
      // 0c: ifeq 37
      // 0f: goto 16
      // 12: invokestatic j7z.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield j7z.xkp I
      // 1a: aload 0
      // 1b: getfield j7z.xmq I
      // 1e: isub
      // 1f: iload 1
      // 20: ifne 3f
      // 23: goto 2a
      // 26: invokestatic j7z.a (Loov;)Loov;
      // 29: athrow
      // 2a: sipush 3600
      // 2d: if_icmplt 42
      // 30: goto 37
      // 33: invokestatic j7z.a (Loov;)Loov;
      // 36: athrow
      // 37: bipush 1
      // 38: goto 3f
      // 3b: invokestatic j7z.a (Loov;)Loov;
      // 3e: athrow
      // 3f: goto 43
      // 42: bipush 0
      // 43: ireturn
   }

   public void mjt(int var1) {
      int var2 = OpaquePredicate.c();

      for (String var4 : this.upp.keySet()) {
         this.ec4(var4, var1);
         if (var2 != 0) {
            break;
         }
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5288349148582556580L, -937366490263625714L, MethodHandles.lookup().lookupClass()).a(241373135483521L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 131967083292997L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[37];
      int var7 = 0;
      String var6 = "ôÂ®\u008c\u009eV\u00119îh8Æ©\u0001Tä\u0010güÆ²¯YÂ\u009bP3ç\u0015ÙT\u008aµ\u0010V¡í#mXXÓëÝ\u001dÆÞ3åÖ\u0010àO¹/Þ?\u0085*\u0015\u0005\u0099@ë+\u009bJ\u0010Hvì\u0005\u0094\u00adkó.M\u0016\u009bp÷@\u0093\u0010Hîl}\u008at\u0099,\u009fÄ7Hl¸\u0086\u008c\u0010%·±¿ëa\r¾Ïc\u001a\u0083\u0092T\u0095»\u00109ú\u0003ÂuwêÍ\u0010LNÙ\tcL\t\u0010ê<®%®%\u0093ØôåuI®\u007f\u0087\t\u0010£º\u0095l3ã(Â0\fÌáª\u009fÄ¾\u0010pDC4\u0015xÕF\u008bÜ_ñT|ã\u008e\u0010|½£\u0083g\u0011ý;Ì\"YùåÓY<\u0010!:\u001e>\u007f^vä\u0001\r»q\u009bv»\u0088\u0010(¹ËÃÔ8\u0012)7Ñ'y£ù\u0013B\u0010\u008cò\u008f|þ\u009fe+ª\r¤Î.¹$\u0004\u0010\u0081õèI\u0011Ï Ð\u00153&ã\u0012Oï\r\u0010\u0084ÇP?\u000e\u0086C=É|ü<ÅÁvd\u0010ÄN4«ÍÝ\u008aÕSù_¤$¬Ik\u0010\u009cíÕ·k\u0090ÀÙVK\u0004k\u001d¡Ám\u0010è7\\\u009d\tË\u0089&2X\u000f`\u009aµï¾\u0010@B¸?!µÁã¬c\tù©\u001a}\u0089\u0010\u0088¿\u0017^(M\u009b\u0014¥L¯\b=^ÞN\u0010\u0011ÈO¨¿à\u0011·§En5\u0090ÃCÔ\u0010Ê@\u0094z\u0016\u007fº.Â\u001fÞÝeðBc\u0010É:Wê.º\u0017ÓRÝ\u0014úè$\u0086\u0019\u0010¯\u007f¤@X\u009bñC\u008fQmVÑ¯\u008ae\u0010\u0088\u0095\u0014î\u0011ºó\u009f´æ\u0095FtI\u0003n\u0010\u0098o\u00832\\Áº\u0010v\u0081{+À¿{\u0089\u0010\u0011§57ÁX¦aO\u0018âWaBZÿ\u0010Ný²ë \u0083f\"B.Jß\u0019\u0001ê\u0089\u0010o# þ]¥\u008bªÃ\u0084ÎøüÒ#÷\u0010\u0082ý\u0086}E\u001f\u001f\u009eð\u000eÃÊ©h`\"\u0010äªO`o;\u0093\u000fÎ\u0088|\u009bÓ8\u0019ç\u0010_Ãçn=\fö2 »I\u0087¤kVÝ\u0010!n\u000fh±\u0097ÝxÑ''Ç\fì\u001aÕ";
      int var8 = "ôÂ®\u008c\u009eV\u00119îh8Æ©\u0001Tä\u0010güÆ²¯YÂ\u009bP3ç\u0015ÙT\u008aµ\u0010V¡í#mXXÓëÝ\u001dÆÞ3åÖ\u0010àO¹/Þ?\u0085*\u0015\u0005\u0099@ë+\u009bJ\u0010Hvì\u0005\u0094\u00adkó.M\u0016\u009bp÷@\u0093\u0010Hîl}\u008at\u0099,\u009fÄ7Hl¸\u0086\u008c\u0010%·±¿ëa\r¾Ïc\u001a\u0083\u0092T\u0095»\u00109ú\u0003ÂuwêÍ\u0010LNÙ\tcL\t\u0010ê<®%®%\u0093ØôåuI®\u007f\u0087\t\u0010£º\u0095l3ã(Â0\fÌáª\u009fÄ¾\u0010pDC4\u0015xÕF\u008bÜ_ñT|ã\u008e\u0010|½£\u0083g\u0011ý;Ì\"YùåÓY<\u0010!:\u001e>\u007f^vä\u0001\r»q\u009bv»\u0088\u0010(¹ËÃÔ8\u0012)7Ñ'y£ù\u0013B\u0010\u008cò\u008f|þ\u009fe+ª\r¤Î.¹$\u0004\u0010\u0081õèI\u0011Ï Ð\u00153&ã\u0012Oï\r\u0010\u0084ÇP?\u000e\u0086C=É|ü<ÅÁvd\u0010ÄN4«ÍÝ\u008aÕSù_¤$¬Ik\u0010\u009cíÕ·k\u0090ÀÙVK\u0004k\u001d¡Ám\u0010è7\\\u009d\tË\u0089&2X\u000f`\u009aµï¾\u0010@B¸?!µÁã¬c\tù©\u001a}\u0089\u0010\u0088¿\u0017^(M\u009b\u0014¥L¯\b=^ÞN\u0010\u0011ÈO¨¿à\u0011·§En5\u0090ÃCÔ\u0010Ê@\u0094z\u0016\u007fº.Â\u001fÞÝeðBc\u0010É:Wê.º\u0017ÓRÝ\u0014úè$\u0086\u0019\u0010¯\u007f¤@X\u009bñC\u008fQmVÑ¯\u008ae\u0010\u0088\u0095\u0014î\u0011ºó\u009f´æ\u0095FtI\u0003n\u0010\u0098o\u00832\\Áº\u0010v\u0081{+À¿{\u0089\u0010\u0011§57ÁX¦aO\u0018âWaBZÿ\u0010Ný²ë \u0083f\"B.Jß\u0019\u0001ê\u0089\u0010o# þ]¥\u008bªÃ\u0084ÎøüÒ#÷\u0010\u0082ý\u0086}E\u001f\u001f\u009eð\u000eÃÊ©h`\"\u0010äªO`o;\u0093\u000fÎ\u0088|\u009bÓ8\u0019ç\u0010_Ãçn=\fö2 »I\u0087¤kVÝ\u0010!n\u000fh±\u0097ÝxÑ''Ç\fì\u001aÕ"
         .length();
      char var5 = 16;
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
                     c = new String[37];
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

                  var6 = "verifyIntegrity#2ãh#\u000b\u007fÓ\u0091s>\u008b\u0082\u000f\u0010Ì\u0084¹\u000fñÈ[YÁ&Üe\u0089·z}";
                  var8 = "verifyIntegrity#2ãh#\u000b\u007fÓ\u0091s>\u008b\u0082\u000f\u0010Ì\u0084¹\u000fñÈ[YÁ&Üe\u0089·z}".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 17307;
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
            throw new RuntimeException("j7z", var10);
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
         throw new RuntimeException("j7z" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
