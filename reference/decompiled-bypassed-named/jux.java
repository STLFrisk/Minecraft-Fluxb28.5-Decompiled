import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class jux {
   private static final gdz nb8;
   public OpaquePredicate hz3;
   private List[][] h_f;
   private List lcc;
   private lc5 fh8;
   private Random d7u;
   private Map nyy;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public jux(OpaquePredicate var1, lc5 var2) {
      int var10000 = OpaquePredicate.b();
      this.h_f = new List[4][];
      this.lcc = Lists.newArrayList();
      this.d7u = new Random();
      this.nyy = Maps.newHashMap();
      this.hz3 = var1;
      int var3 = var10000;
      this.fh8 = var2;
      int var4 = 0;

      while (true) {
         if (var4 < 4) {
            this.h_f[var4] = new List[2];
            if (var3 == 0) {
               break;
            }

            int var5 = 0;

            label32: {
               while (var5 < 2) {
                  try {
                     this.h_f[var4][var5] = Lists.newArrayList();
                     var5++;
                     if (var3 == 0) {
                        break label32;
                     }

                     if (var3 == 0) {
                        break;
                     }
                  } catch (oov var6) {
                     throw a(var6);
                  }
               }

               var4++;
            }

            if (var3 != 0) {
               continue;
            }
         }

         this.r7y();
         break;
      }
   }

   private void r7y() {
      this.agv(w_0.aiv.ewe(), new v27$zt0());
      this.agv(w_0.w_h.ewe(), new etr$mrr());
      this.agv(w_0.eiu.ewe(), new ylk$h7s());
      this.agv(w_0.pzr.ewe(), new r57$le8());
      this.agv(w_0.nfs.ewe(), new ia6$tzw());
      this.agv(w_0.ahz.ewe(), new r8z$hf_());
      this.agv(w_0.rwy.ewe(), new myl$v3y());
      this.agv(w_0.fzw.ewe(), new sxx$vyu());
      this.agv(w_0.k6p.ewe(), new sxx$kbr());
      this.agv(w_0.bac.ewe(), new w0u$p0a());
      this.agv(w_0.vby.ewe(), new xkr$u39());
      this.agv(w_0.ycr.ewe(), new ng2$rgz());
      this.agv(w_0.cle.ewe(), new ng2$n3x());
      this.agv(w_0.hg8.ewe(), new ng2$h2l());
      this.agv(w_0.s7d.ewe(), new ng2$xct());
      this.agv(w_0.c0z.ewe(), new ng2$__t());
      this.agv(w_0.cde.ewe(), new tmv$udq());
      this.agv(w_0.fpv.ewe(), new tmv$rdi());
      this.agv(w_0.cyy.ewe(), new cjz$s_e());
      this.agv(w_0.z1q.ewe(), new myl$lwi());
      this.agv(w_0.n2e.ewe(), new myl$v3y());
      this.agv(w_0.z58.ewe(), new kng$kee());
      this.agv(w_0.t9k.ewe(), new f64$nz8());
      this.agv(w_0.ygx.ewe(), new pm1$qz8());
      this.agv(w_0.jnp.ewe(), new jkl$bgl());
      this.agv(w_0.l3c.ewe(), new ml4$heo());
      this.agv(w_0.x_i.ewe(), new ks2$_fy());
      this.agv(w_0.lk7.ewe(), new w_u$ebn());
      this.agv(w_0.dyc.ewe(), new h_h$xib());
      this.agv(w_0.t6l.ewe(), new ki2$rji());
      this.agv(w_0.spy.ewe(), new pmg$ans());
      this.agv(w_0.wce.ewe(), new ki2$u_7());
      this.agv(w_0.mwm.ewe(), new cjz$ro0());
      this.agv(w_0.o7n.ewe(), new fvs$r_x());
      this.agv(w_0.ips.ewe(), new ki2$cqs());
      this.agv(w_0.uuz.ewe(), new ylu$r_s());
      this.agv(w_0.jxl.ewe(), new tvk$ewj());
      this.agv(w_0.ezk.ewe(), new qkb$hy1());
      this.agv(w_0.tmu.ewe(), new wxy$pyc());
      this.agv(w_0.dj0.ewe(), new c6y$z8d());
      this.agv(w_0.tum.ewe(), new q_s$nm_());
   }

   public void agv(int var1, a6_ var2) {
      this.nyy.put(var1, var2);
   }

   public void hro(EntityLivingBase var1, w_0 var2) {
      this.lcc.add(new epi(this.hz3, var1, var2));
   }

   public flo tve(int param1, double param2, double param4, double param6, double param8, double param10, double param12, int[] param14) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 15
      // 05: aload 0
      // 06: getfield jux.nyy Ljava/util/Map;
      // 09: iload 1
      // 0a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0d: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 12: checkcast a6_
      // 15: astore 16
      // 17: aload 16
      // 19: iload 15
      // 1b: ifeq 2a
      // 1e: ifnull 64
      // 21: goto 28
      // 24: invokestatic jux.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27: athrow
      // 28: aload 16
      // 2a: iload 1
      // 2b: aload 0
      // 2c: getfield jux.hz3 Lt9d;
      // 2f: dload 2
      // 30: dload 4
      // 32: dload 6
      // 34: dload 8
      // 36: dload 10
      // 38: dload 12
      // 3a: aload 14
      // 3c: invokeinterface a6_.r1r (ILt9d;DDDDDD[I)Lflo; 16
      // 41: astore 17
      // 43: aload 17
      // 45: iload 15
      // 47: ifeq 63
      // 4a: ifnull 64
      // 4d: goto 54
      // 50: invokestatic jux.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 53: athrow
      // 54: aload 0
      // 55: aload 17
      // 57: invokevirtual jux.o4t (Lflo;)V
      // 5a: aload 17
      // 5c: goto 63
      // 5f: invokestatic jux.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: areturn
      // 64: aconst_null
      // 65: areturn
   }

   public void o4t(flo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifne 14
      // 09: ifnull aa
      // 0c: goto 13
      // 0f: invokestatic jux.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aload 1
      // 14: instanceof c6y$v68
      // 17: iload 2
      // 18: ifne 48
      // 1b: ifeq 3d
      // 1e: goto 25
      // 21: invokestatic jux.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: invokestatic hxt.s5i ()Z
      // 28: iload 2
      // 29: ifne 48
      // 2c: goto 33
      // 2f: invokestatic jux.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32: athrow
      // 33: ifeq aa
      // 36: goto 3d
      // 39: invokestatic jux.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c: athrow
      // 3d: aload 1
      // 3e: invokevirtual flo.ikr ()I
      // 41: goto 48
      // 44: invokestatic jux.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 47: athrow
      // 48: istore 3
      // 49: aload 1
      // 4a: invokevirtual flo.h6c ()F
      // 4d: fconst_1
      // 4e: fcmpl
      // 4f: iload 2
      // 50: ifne 5e
      // 53: ifeq 61
      // 56: goto 5d
      // 59: invokestatic jux.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5c: athrow
      // 5d: bipush 0
      // 5e: goto 62
      // 61: bipush 1
      // 62: istore 4
      // 64: aload 0
      // 65: getfield jux.h_f [[Ljava/util/List;
      // 68: iload 3
      // 69: aaload
      // 6a: iload 4
      // 6c: aaload
      // 6d: invokeinterface java/util/List.size ()I 1
      // 72: iload 2
      // 73: ifne a9
      // 76: sipush 4000
      // 79: if_icmplt 9a
      // 7c: goto 83
      // 7f: invokestatic jux.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 82: athrow
      // 83: aload 0
      // 84: getfield jux.h_f [[Ljava/util/List;
      // 87: iload 3
      // 88: aaload
      // 89: iload 4
      // 8b: aaload
      // 8c: bipush 0
      // 8d: invokeinterface java/util/List.remove (I)Ljava/lang/Object; 2
      // 92: pop
      // 93: goto 9a
      // 96: invokestatic jux.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 99: athrow
      // 9a: aload 0
      // 9b: getfield jux.h_f [[Ljava/util/List;
      // 9e: iload 3
      // 9f: aaload
      // a0: iload 4
      // a2: aaload
      // a3: aload 1
      // a4: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // a9: pop
      // aa: return
   }

   public void u5v() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: bipush 0
      // 05: istore 2
      // 06: iload 2
      // 07: bipush 4
      // 08: if_icmpge 17
      // 0b: aload 0
      // 0c: iload 2
      // 0d: invokespecial jux.t0p (I)V
      // 10: iinc 2 1
      // 13: iload 1
      // 14: ifne 06
      // 17: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 1a: astore 2
      // 1b: aload 0
      // 1c: getfield jux.lcc Ljava/util/List;
      // 1f: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 24: astore 3
      // 25: aload 3
      // 26: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2b: ifeq 70
      // 2e: aload 3
      // 2f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 34: checkcast epi
      // 37: astore 4
      // 39: aload 4
      // 3b: invokevirtual epi.xx_ ()V
      // 3e: aload 4
      // 40: getfield epi.ma9 Z
      // 43: iload 1
      // 44: ifeq 7a
      // 47: iload 1
      // 48: ifeq 6b
      // 4b: goto 52
      // 4e: invokestatic jux.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 51: athrow
      // 52: ifeq 6c
      // 55: goto 5c
      // 58: invokestatic jux.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5b: athrow
      // 5c: aload 2
      // 5d: aload 4
      // 5f: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 64: goto 6b
      // 67: invokestatic jux.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6a: athrow
      // 6b: pop
      // 6c: iload 1
      // 6d: ifne 25
      // 70: aload 0
      // 71: getfield jux.lcc Ljava/util/List;
      // 74: aload 2
      // 75: invokeinterface java/util/List.removeAll (Ljava/util/Collection;)Z 2
      // 7a: pop
      // 7b: return
   }

   private void t0p(int var1) {
      int var2 = OpaquePredicate.b();
      int var3 = 0;

      while (var3 < 2) {
         this.plm(this.h_f[var1][var3]);
         var3++;
         if (var2 == 0) {
            break;
         }
      }
   }

   private void plm(List param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 03: astore 3
      // 04: invokestatic OpaquePredicate.b ()I
      // 07: bipush 0
      // 08: istore 4
      // 0a: istore 2
      // 0b: iload 4
      // 0d: aload 1
      // 0e: invokeinterface java/util/List.size ()I 1
      // 13: if_icmpge 5c
      // 16: aload 1
      // 17: iload 4
      // 19: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 1e: checkcast flo
      // 21: astore 5
      // 23: aload 0
      // 24: aload 5
      // 26: invokespecial jux.c05 (Lflo;)V
      // 29: iload 2
      // 2a: ifeq 58
      // 2d: aload 5
      // 2f: getfield flo.ma9 Z
      // 32: iload 2
      // 33: ifeq 63
      // 36: goto 3d
      // 39: invokestatic jux.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c: athrow
      // 3d: ifeq 55
      // 40: goto 47
      // 43: invokestatic jux.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 46: athrow
      // 47: aload 3
      // 48: aload 5
      // 4a: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 4d: pop
      // 4e: goto 55
      // 51: invokestatic jux.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 54: athrow
      // 55: iinc 4 1
      // 58: iload 2
      // 59: ifne 0b
      // 5c: aload 1
      // 5d: aload 3
      // 5e: invokeinterface java/util/List.removeAll (Ljava/util/Collection;)Z 2
      // 63: pop
      // 64: return
   }

   private void Minecraft(flo var1) {
      long var2 = a ^ 39841176815252L;

      try {
         var1.xx_();
      } catch (Throwable var8) {
         e1i var5 = e1i.cor(var8, a<"p">(31099, 3912184981051401273L ^ var2));
         wsc var6 = var5.i_r(a<"p">(14716, 7102193667456934973L ^ var2));
         int var7 = var1.ikr();
         var6.h1o(a<"p">(1188, 6534111600551041516L ^ var2), new jux$1(this, var1));
         var6.h1o(a<"p">(6008, 2806221571512568383L ^ var2), new jux$2(this, var7));
         throw new oov(var5);
      }
   }

   public void t45(EntityLivingBase param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic jux.a J
      // 003: ldc2_w 23821849042330
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic bm4.peb ()F
      // 00b: fstore 6
      // 00d: invokestatic bm4._t6 ()F
      // 010: fstore 7
      // 012: invokestatic OpaquePredicate.b ()I
      // 015: invokestatic bm4.jcu ()F
      // 018: fstore 8
      // 01a: istore 5
      // 01c: invokestatic bm4.oz4 ()F
      // 01f: fstore 9
      // 021: invokestatic bm4.g8n ()F
      // 024: fstore 10
      // 026: aload 1
      // 027: getfield EntityLivingBase.ivp D
      // 02a: aload 1
      // 02b: getfield EntityLivingBase.o2v D
      // 02e: aload 1
      // 02f: getfield EntityLivingBase.ivp D
      // 032: dsub
      // 033: fload 2
      // 034: f2d
      // 035: dmul
      // 036: dadd
      // 037: putstatic flo.mrd D
      // 03a: aload 1
      // 03b: getfield EntityLivingBase.c54 D
      // 03e: aload 1
      // 03f: getfield EntityLivingBase.kfp D
      // 042: aload 1
      // 043: getfield EntityLivingBase.c54 D
      // 046: dsub
      // 047: fload 2
      // 048: f2d
      // 049: dmul
      // 04a: dadd
      // 04b: putstatic flo.txo D
      // 04e: aload 1
      // 04f: getfield EntityLivingBase.e2b D
      // 052: aload 1
      // 053: getfield EntityLivingBase.vbd D
      // 056: aload 1
      // 057: getfield EntityLivingBase.e2b D
      // 05a: dsub
      // 05b: fload 2
      // 05c: f2d
      // 05d: dmul
      // 05e: dadd
      // 05f: putstatic flo.bta D
      // 062: invokestatic hzu.spd ()V
      // 065: sipush 770
      // 068: sipush 771
      // 06b: invokestatic hzu.ru7 (II)V
      // 06e: sipush 516
      // 071: ldc 0.003921569
      // 073: nop
      // 074: invokestatic hzu.fak (IF)V
      // 077: bipush 0
      // 078: istore 11
      // 07a: iload 11
      // 07c: bipush 3
      // 07d: if_icmpge 231
      // 080: bipush 0
      // 081: iload 5
      // 083: ifeq 23b
      // 086: istore 12
      // 088: iload 12
      // 08a: bipush 2
      // 08b: if_icmpge 229
      // 08e: iload 11
      // 090: istore 13
      // 092: iload 5
      // 094: ifeq 224
      // 097: aload 0
      // 098: getfield jux.h_f [[Ljava/util/List;
      // 09b: iload 11
      // 09d: aaload
      // 09e: iload 12
      // 0a0: aaload
      // 0a1: invokeinterface java/util/List.isEmpty ()Z 1
      // 0a6: iload 5
      // 0a8: ifeq 07c
      // 0ab: goto 0b2
      // 0ae: invokestatic jux.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b1: athrow
      // 0b2: ifne 221
      // 0b5: iload 12
      // 0b7: iload 5
      // 0b9: ifeq 0fd
      // 0bc: goto 0c3
      // 0bf: invokestatic jux.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c2: athrow
      // 0c3: lookupswitch 56 2 0 29 1 45
      // 0dc: invokestatic jux.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0df: athrow
      // 0e0: bipush 0
      // 0e1: invokestatic hzu.jun (Z)V
      // 0e4: iload 5
      // 0e6: ifne 0fb
      // 0e9: goto 0f0
      // 0ec: invokestatic jux.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ef: athrow
      // 0f0: bipush 1
      // 0f1: invokestatic hzu.jun (Z)V
      // 0f4: goto 0fb
      // 0f7: invokestatic jux.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fa: athrow
      // 0fb: iload 11
      // 0fd: lookupswitch 27 2 0 27 1 49
      // 118: aload 0
      // 119: getfield jux.fh8 Llc5;
      // 11c: getstatic jux.nb8 Lgdz;
      // 11f: invokevirtual lc5.anl (Lgdz;)V
      // 122: iload 5
      // 124: ifne 13f
      // 127: goto 12e
      // 12a: invokestatic jux.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12d: athrow
      // 12e: aload 0
      // 12f: getfield jux.fh8 Llc5;
      // 132: getstatic yu2.nu_ Lgdz;
      // 135: invokevirtual lc5.anl (Lgdz;)V
      // 138: goto 13f
      // 13b: invokestatic jux.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13e: athrow
      // 13f: fconst_1
      // 140: fconst_1
      // 141: fconst_1
      // 142: fconst_1
      // 143: invokestatic hzu.wn0 (FFFF)V
      // 146: invokestatic jom.yut ()Ljom;
      // 149: astore 14
      // 14b: aload 14
      // 14d: invokevirtual jom.zuq ()Lq3g;
      // 150: astore 15
      // 152: aload 15
      // 154: bipush 7
      // 156: getstatic gnl.aaz Lbe7;
      // 159: invokevirtual q3g.ezr (ILbe7;)V
      // 15c: bipush 0
      // 15d: istore 16
      // 15f: iload 16
      // 161: aload 0
      // 162: getfield jux.h_f [[Ljava/util/List;
      // 165: iload 11
      // 167: aaload
      // 168: iload 12
      // 16a: aaload
      // 16b: invokeinterface java/util/List.size ()I 1
      // 170: if_icmpge 21c
      // 173: aload 0
      // 174: getfield jux.h_f [[Ljava/util/List;
      // 177: iload 11
      // 179: aaload
      // 17a: iload 12
      // 17c: aaload
      // 17d: iload 16
      // 17f: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 184: checkcast flo
      // 187: astore 17
      // 189: aload 17
      // 18b: aload 15
      // 18d: aload 1
      // 18e: fload 2
      // 18f: fload 6
      // 191: fload 10
      // 193: fload 7
      // 195: fload 8
      // 197: fload 9
      // 199: invokevirtual flo.oss (Lq3g;Li2h;FFFFFF)V
      // 19c: iload 5
      // 19e: ifeq 224
      // 1a1: goto 214
      // 1a4: astore 18
      // 1a6: aload 18
      // 1a8: sipush 18500
      // 1ab: ldc2_w 9097451351770779145
      // 1ae: lload 3
      // 1af: lxor
      // 1b0: invokedynamic p (IJ)Ljava/lang/String; bsm=jux.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b5: nop
      // 1b6: invokestatic e1i.cor (Ljava/lang/Throwable;Ljava/lang/String;)Le1i;
      // 1b9: astore 19
      // 1bb: aload 19
      // 1bd: sipush 26934
      // 1c0: ldc2_w 872442360868597628
      // 1c3: lload 3
      // 1c4: lxor
      // 1c5: invokedynamic p (IJ)Ljava/lang/String; bsm=jux.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ca: nop
      // 1cb: invokevirtual e1i.i_r (Ljava/lang/String;)Lwsc;
      // 1ce: astore 20
      // 1d0: aload 20
      // 1d2: sipush 15449
      // 1d5: ldc2_w 7458242184312175122
      // 1d8: lload 3
      // 1d9: lxor
      // 1da: invokedynamic p (IJ)Ljava/lang/String; bsm=jux.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1df: nop
      // 1e0: new jux$3
      // 1e3: dup
      // 1e4: aload 0
      // 1e5: aload 17
      // 1e7: invokespecial jux$3.<init> (Ljux;Lflo;)V
      // 1ea: invokevirtual wsc.h1o (Ljava/lang/String;Ljava/util/concurrent/Callable;)V
      // 1ed: aload 20
      // 1ef: sipush 14037
      // 1f2: ldc2_w 5318690243605377181
      // 1f5: lload 3
      // 1f6: lxor
      // 1f7: invokedynamic p (IJ)Ljava/lang/String; bsm=jux.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fc: nop
      // 1fd: new jux$4
      // 200: dup
      // 201: aload 0
      // 202: iload 13
      // 204: invokespecial jux$4.<init> (Ljux;I)V
      // 207: invokevirtual wsc.h1o (Ljava/lang/String;Ljava/util/concurrent/Callable;)V
      // 20a: new oov
      // 20d: dup
      // 20e: aload 19
      // 210: invokespecial oov.<init> (Le1i;)V
      // 213: athrow
      // 214: iinc 16 1
      // 217: iload 5
      // 219: ifne 15f
      // 21c: aload 14
      // 21e: invokevirtual jom.q7g ()V
      // 221: iinc 12 1
      // 224: iload 5
      // 226: ifne 088
      // 229: iinc 11 1
      // 22c: iload 5
      // 22e: ifne 07a
      // 231: bipush 1
      // 232: invokestatic hzu.jun (Z)V
      // 235: invokestatic hzu.ux6 ()V
      // 238: sipush 516
      // 23b: ldc 0.1
      // 23d: nop
      // 23e: invokestatic hzu.fak (IF)V
      // 241: return
   }

   public void wx_(EntityLivingBase var1, float var2) {
      float var4 = (float) (Math.PI / 180.0);
      int var10000 = OpaquePredicate.c();
      float var5 = fe6.ssk(var1.x5k * (float) (Math.PI / 180.0));
      float var6 = fe6.rtn(var1.x5k * (float) (Math.PI / 180.0));
      float var7 = -var6 * fe6.rtn(var1.y2i * (float) (Math.PI / 180.0));
      float var8 = var5 * fe6.rtn(var1.y2i * (float) (Math.PI / 180.0));
      int var3 = var10000;
      float var9 = fe6.ssk(var1.y2i * (float) (Math.PI / 180.0));
      int var10 = 0;

      while (var10 < 2) {
         List var11 = this.h_f[3][var10];

         label45: {
            label53: {
               try {
                  if (var3 != 0) {
                     break label45;
                  }

                  if (var11.isEmpty()) {
                     break label53;
                  }
               } catch (oov var17) {
                  throw a(var17);
               }

               jom var12 = jom.yut();
               q3g var13 = var12.zuq();
               int var14 = 0;

               while (var14 < var11.size()) {
                  flo var15 = (flo)var11.get(var14);

                  try {
                     var15.oss(var13, var1, var2, var5, var9, var6, var7, var8);
                     var14++;
                     if (var3 != 0) {
                        break label45;
                     }

                     if (var3 != 0) {
                        break;
                     }
                  } catch (oov var16) {
                     throw a(var16);
                  }
               }
            }

            var10++;
         }

         if (var3 != 0) {
            break;
         }
      }
   }

   public void itb(OpaquePredicate var1) {
      this.hz3 = var1;
      int var10000 = OpaquePredicate.b();
      int var3 = 0;
      int var2 = var10000;

      while (var3 < 4) {
         int var4 = 0;

         while (true) {
            if (var4 < 2) {
               try {
                  this.h_f[var3][var4].clear();
                  var4++;
                  if (var2 == 0) {
                     break;
                  }

                  if (var2 != 0) {
                     continue;
                  }
               } catch (oov var5) {
                  throw a(var5);
               }
            }

            var3++;
            break;
         }

         if (var2 == 0) {
            break;
         }
      }

      this.lcc.clear();
   }

   public void vgi(mew param1, zfz param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 3
      // 004: getstatic net/optifine/reflect/Reflector.ForgeBlock_addDestroyEffects Lnet/optifine/reflect/ReflectorMethod;
      // 007: invokevirtual net/optifine/reflect/ReflectorMethod.exists ()Z
      // 00a: iload 3
      // 00b: ifeq 025
      // 00e: ifeq 090
      // 011: goto 018
      // 014: invokestatic jux.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 017: athrow
      // 018: getstatic net/optifine/reflect/Reflector.ForgeBlock_isAir Lnet/optifine/reflect/ReflectorMethod;
      // 01b: invokevirtual net/optifine/reflect/ReflectorMethod.exists ()Z
      // 01e: goto 025
      // 021: invokestatic jux.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 024: athrow
      // 025: ifeq 090
      // 028: aload 2
      // 029: invokeinterface zfz.r_y ()Le0x; 1
      // 02e: astore 5
      // 030: aload 5
      // 032: getstatic net/optifine/reflect/Reflector.ForgeBlock_isAir Lnet/optifine/reflect/ReflectorMethod;
      // 035: bipush 2
      // 036: anewarray 20
      // 039: dup
      // 03a: bipush 0
      // 03b: aload 0
      // 03c: getfield jux.hz3 Lt9d;
      // 03f: aastore
      // 040: dup
      // 041: bipush 1
      // 042: aload 1
      // 043: aastore
      // 044: invokestatic net/optifine/reflect/Reflector.callBoolean (Ljava/lang/Object;Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)Z
      // 047: iload 3
      // 048: ifeq 077
      // 04b: ifne 089
      // 04e: goto 055
      // 051: invokestatic jux.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 054: athrow
      // 055: aload 5
      // 057: getstatic net/optifine/reflect/Reflector.ForgeBlock_addDestroyEffects Lnet/optifine/reflect/ReflectorMethod;
      // 05a: bipush 3
      // 05b: anewarray 20
      // 05e: dup
      // 05f: bipush 0
      // 060: aload 0
      // 061: getfield jux.hz3 Lt9d;
      // 064: aastore
      // 065: dup
      // 066: bipush 1
      // 067: aload 1
      // 068: aastore
      // 069: dup
      // 06a: bipush 2
      // 06b: aload 0
      // 06c: aastore
      // 06d: invokestatic net/optifine/reflect/Reflector.callBoolean (Ljava/lang/Object;Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)Z
      // 070: goto 077
      // 073: invokestatic jux.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 076: athrow
      // 077: iload 3
      // 078: ifeq 086
      // 07b: ifne 089
      // 07e: goto 085
      // 081: invokestatic jux.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 084: athrow
      // 085: bipush 1
      // 086: goto 08a
      // 089: bipush 0
      // 08a: istore 4
      // 08c: iload 3
      // 08d: ifne 0b1
      // 090: aload 2
      // 091: invokeinterface zfz.r_y ()Le0x; 1
      // 096: invokevirtual e0x.p1r ()Lp3y;
      // 099: getstatic p3y.cei Lp3y;
      // 09c: if_acmpeq 0ae
      // 09f: goto 0a6
      // 0a2: invokestatic jux.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a5: athrow
      // 0a6: bipush 1
      // 0a7: goto 0af
      // 0aa: invokestatic jux.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ad: athrow
      // 0ae: bipush 0
      // 0af: istore 4
      // 0b1: iload 4
      // 0b3: iload 3
      // 0b4: ifeq 0d2
      // 0b7: ifeq 18d
      // 0ba: goto 0c1
      // 0bd: invokestatic jux.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c0: athrow
      // 0c1: aload 2
      // 0c2: invokeinterface zfz.r_y ()Le0x; 1
      // 0c7: aload 2
      // 0c8: aload 0
      // 0c9: getfield jux.hz3 Lt9d;
      // 0cc: aload 1
      // 0cd: invokevirtual e0x.w1b (Lzfz;Lm5n;Lmew;)Lzfz;
      // 0d0: astore 2
      // 0d1: bipush 4
      // 0d2: istore 5
      // 0d4: bipush 0
      // 0d5: istore 6
      // 0d7: iload 6
      // 0d9: iload 5
      // 0db: if_icmpge 18d
      // 0de: bipush 0
      // 0df: istore 7
      // 0e1: iload 7
      // 0e3: iload 5
      // 0e5: if_icmpge 186
      // 0e8: bipush 0
      // 0e9: iload 3
      // 0ea: ifeq 0d9
      // 0ed: istore 8
      // 0ef: iload 8
      // 0f1: iload 5
      // 0f3: if_icmpge 17f
      // 0f6: aload 1
      // 0f7: invokevirtual mew.getX ()I
      // 0fa: i2d
      // 0fb: iload 6
      // 0fd: i2d
      // 0fe: ldc2_w 0.5
      // 101: dadd
      // 102: iload 5
      // 104: i2d
      // 105: ddiv
      // 106: dadd
      // 107: dstore 9
      // 109: aload 1
      // 10a: invokevirtual mew.getY ()I
      // 10d: i2d
      // 10e: iload 7
      // 110: i2d
      // 111: ldc2_w 0.5
      // 114: dadd
      // 115: iload 5
      // 117: i2d
      // 118: ddiv
      // 119: dadd
      // 11a: dstore 11
      // 11c: aload 1
      // 11d: invokevirtual mew.getZ ()I
      // 120: i2d
      // 121: iload 8
      // 123: i2d
      // 124: ldc2_w 0.5
      // 127: dadd
      // 128: iload 5
      // 12a: i2d
      // 12b: ddiv
      // 12c: dadd
      // 12d: dstore 13
      // 12f: aload 0
      // 130: new ylu
      // 133: dup
      // 134: aload 0
      // 135: getfield jux.hz3 Lt9d;
      // 138: dload 9
      // 13a: dload 11
      // 13c: dload 13
      // 13e: dload 9
      // 140: aload 1
      // 141: invokevirtual mew.getX ()I
      // 144: i2d
      // 145: dsub
      // 146: ldc2_w 0.5
      // 149: dsub
      // 14a: dload 11
      // 14c: aload 1
      // 14d: invokevirtual mew.getY ()I
      // 150: i2d
      // 151: dsub
      // 152: ldc2_w 0.5
      // 155: dsub
      // 156: dload 13
      // 158: aload 1
      // 159: invokevirtual mew.getZ ()I
      // 15c: i2d
      // 15d: dsub
      // 15e: ldc2_w 0.5
      // 161: dsub
      // 162: aload 2
      // 163: invokespecial ylu.<init> (Lt9d;DDDDDDLzfz;)V
      // 166: aload 1
      // 167: invokevirtual ylu.yuv (Lmew;)Lylu;
      // 16a: invokevirtual jux.o4t (Lflo;)V
      // 16d: iinc 8 1
      // 170: iload 3
      // 171: ifeq 182
      // 174: iload 3
      // 175: ifne 0ef
      // 178: goto 17f
      // 17b: invokestatic jux.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17e: athrow
      // 17f: iinc 7 1
      // 182: iload 3
      // 183: ifne 0e1
      // 186: iinc 6 1
      // 189: iload 3
      // 18a: ifne 0d7
      // 18d: return
   }

   public void so_(mew param1, vt2 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield jux.hz3 Lt9d;
      // 004: aload 1
      // 005: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 008: astore 4
      // 00a: invokestatic OpaquePredicate.b ()I
      // 00d: aload 4
      // 00f: invokeinterface zfz.r_y ()Le0x; 1
      // 014: astore 5
      // 016: istore 3
      // 017: aload 5
      // 019: invokevirtual e0x.kfj ()I
      // 01c: iload 3
      // 01d: ifeq 036
      // 020: bipush -1
      // 021: if_icmpeq 1a9
      // 024: goto 02b
      // 027: invokestatic jux.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02a: athrow
      // 02b: aload 1
      // 02c: invokevirtual mew.getX ()I
      // 02f: goto 036
      // 032: invokestatic jux.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 035: athrow
      // 036: istore 6
      // 038: aload 1
      // 039: invokevirtual mew.getY ()I
      // 03c: istore 7
      // 03e: aload 1
      // 03f: invokevirtual mew.getZ ()I
      // 042: istore 8
      // 044: ldc 0.1
      // 046: nop
      // 047: fstore 9
      // 049: iload 6
      // 04b: i2d
      // 04c: aload 0
      // 04d: getfield jux.d7u Ljava/util/Random;
      // 050: invokevirtual java/util/Random.nextDouble ()D
      // 053: aload 5
      // 055: invokevirtual e0x.ohw ()D
      // 058: aload 5
      // 05a: invokevirtual e0x.v00 ()D
      // 05d: dsub
      // 05e: fload 9
      // 060: fconst_2
      // 061: fmul
      // 062: f2d
      // 063: dsub
      // 064: dmul
      // 065: dadd
      // 066: fload 9
      // 068: f2d
      // 069: dadd
      // 06a: aload 5
      // 06c: invokevirtual e0x.v00 ()D
      // 06f: dadd
      // 070: dstore 10
      // 072: iload 7
      // 074: i2d
      // 075: aload 0
      // 076: getfield jux.d7u Ljava/util/Random;
      // 079: invokevirtual java/util/Random.nextDouble ()D
      // 07c: aload 5
      // 07e: invokevirtual e0x.vn4 ()D
      // 081: aload 5
      // 083: invokevirtual e0x._y3 ()D
      // 086: dsub
      // 087: fload 9
      // 089: fconst_2
      // 08a: fmul
      // 08b: f2d
      // 08c: dsub
      // 08d: dmul
      // 08e: dadd
      // 08f: fload 9
      // 091: f2d
      // 092: dadd
      // 093: aload 5
      // 095: invokevirtual e0x._y3 ()D
      // 098: dadd
      // 099: dstore 12
      // 09b: iload 8
      // 09d: i2d
      // 09e: aload 0
      // 09f: getfield jux.d7u Ljava/util/Random;
      // 0a2: invokevirtual java/util/Random.nextDouble ()D
      // 0a5: aload 5
      // 0a7: invokevirtual e0x.ttv ()D
      // 0aa: aload 5
      // 0ac: invokevirtual e0x.z69 ()D
      // 0af: dsub
      // 0b0: fload 9
      // 0b2: fconst_2
      // 0b3: fmul
      // 0b4: f2d
      // 0b5: dsub
      // 0b6: dmul
      // 0b7: dadd
      // 0b8: fload 9
      // 0ba: f2d
      // 0bb: dadd
      // 0bc: aload 5
      // 0be: invokevirtual e0x.z69 ()D
      // 0c1: dadd
      // 0c2: dstore 14
      // 0c4: aload 2
      // 0c5: getstatic vt2.m3r Lvt2;
      // 0c8: iload 3
      // 0c9: ifeq 0e9
      // 0cc: if_acmpne 0e5
      // 0cf: goto 0d6
      // 0d2: invokestatic jux.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d5: athrow
      // 0d6: iload 7
      // 0d8: i2d
      // 0d9: aload 5
      // 0db: invokevirtual e0x._y3 ()D
      // 0de: dadd
      // 0df: fload 9
      // 0e1: f2d
      // 0e2: dsub
      // 0e3: dstore 12
      // 0e5: aload 2
      // 0e6: getstatic vt2.rf3 Lvt2;
      // 0e9: iload 3
      // 0ea: ifeq 10a
      // 0ed: if_acmpne 106
      // 0f0: goto 0f7
      // 0f3: invokestatic jux.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f6: athrow
      // 0f7: iload 7
      // 0f9: i2d
      // 0fa: aload 5
      // 0fc: invokevirtual e0x.vn4 ()D
      // 0ff: dadd
      // 100: fload 9
      // 102: f2d
      // 103: dadd
      // 104: dstore 12
      // 106: aload 2
      // 107: getstatic vt2.z9q Lvt2;
      // 10a: iload 3
      // 10b: ifeq 12b
      // 10e: if_acmpne 127
      // 111: goto 118
      // 114: invokestatic jux.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 117: athrow
      // 118: iload 8
      // 11a: i2d
      // 11b: aload 5
      // 11d: invokevirtual e0x.z69 ()D
      // 120: dadd
      // 121: fload 9
      // 123: f2d
      // 124: dsub
      // 125: dstore 14
      // 127: aload 2
      // 128: getstatic vt2.mxp Lvt2;
      // 12b: iload 3
      // 12c: ifeq 14c
      // 12f: if_acmpne 148
      // 132: goto 139
      // 135: invokestatic jux.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 138: athrow
      // 139: iload 8
      // 13b: i2d
      // 13c: aload 5
      // 13e: invokevirtual e0x.ttv ()D
      // 141: dadd
      // 142: fload 9
      // 144: f2d
      // 145: dadd
      // 146: dstore 14
      // 148: aload 2
      // 149: getstatic vt2.te4 Lvt2;
      // 14c: iload 3
      // 14d: ifeq 16d
      // 150: if_acmpne 169
      // 153: goto 15a
      // 156: invokestatic jux.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 159: athrow
      // 15a: iload 6
      // 15c: i2d
      // 15d: aload 5
      // 15f: invokevirtual e0x.v00 ()D
      // 162: dadd
      // 163: fload 9
      // 165: f2d
      // 166: dsub
      // 167: dstore 10
      // 169: aload 2
      // 16a: getstatic vt2.zk4 Lvt2;
      // 16d: if_acmpne 17f
      // 170: iload 6
      // 172: i2d
      // 173: aload 5
      // 175: invokevirtual e0x.ohw ()D
      // 178: dadd
      // 179: fload 9
      // 17b: f2d
      // 17c: dadd
      // 17d: dstore 10
      // 17f: aload 0
      // 180: new ylu
      // 183: dup
      // 184: aload 0
      // 185: getfield jux.hz3 Lt9d;
      // 188: dload 10
      // 18a: dload 12
      // 18c: dload 14
      // 18e: dconst_0
      // 18f: dconst_0
      // 190: dconst_0
      // 191: aload 4
      // 193: invokespecial ylu.<init> (Lt9d;DDDDDDLzfz;)V
      // 196: aload 1
      // 197: invokevirtual ylu.yuv (Lmew;)Lylu;
      // 19a: ldc 0.2
      // 19c: nop
      // 19d: invokevirtual ylu.o8j (F)Lflo;
      // 1a0: ldc 0.6
      // 1a2: nop
      // 1a3: invokevirtual flo.nd9 (F)Lflo;
      // 1a6: invokevirtual jux.o4t (Lflo;)V
      // 1a9: return
   }

   public void l7r(flo var1) {
      this._id(var1, 1, 0);
   }

   public void lt_(flo var1) {
      this._id(var1, 0, 1);
   }

   private void _id(flo param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 4
      // 05: bipush 0
      // 06: istore 5
      // 08: iload 5
      // 0a: bipush 4
      // 0b: if_icmpge 5b
      // 0e: aload 0
      // 0f: getfield jux.h_f [[Ljava/util/List;
      // 12: iload 5
      // 14: aaload
      // 15: iload 2
      // 16: aaload
      // 17: aload 1
      // 18: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 1d: iload 4
      // 1f: ifeq 52
      // 22: ifeq 53
      // 25: goto 2c
      // 28: invokestatic jux.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b: athrow
      // 2c: aload 0
      // 2d: getfield jux.h_f [[Ljava/util/List;
      // 30: iload 5
      // 32: aaload
      // 33: iload 2
      // 34: aaload
      // 35: aload 1
      // 36: invokeinterface java/util/List.remove (Ljava/lang/Object;)Z 2
      // 3b: pop
      // 3c: aload 0
      // 3d: getfield jux.h_f [[Ljava/util/List;
      // 40: iload 5
      // 42: aaload
      // 43: iload 3
      // 44: aaload
      // 45: aload 1
      // 46: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 4b: goto 52
      // 4e: invokestatic jux.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 51: athrow
      // 52: pop
      // 53: iinc 5 1
      // 56: iload 4
      // 58: ifne 08
      // 5b: return
   }

   public String es5() {
      int var2 = 0;
      int var10000 = OpaquePredicate.c();
      int var3 = 0;
      int var1 = var10000;

      while (var3 < 4) {
         int var4 = 0;

         while (true) {
            if (var4 < 2) {
               var2 += this.h_f[var3][var4].size();

               try {
                  var4++;
                  if (var1 != 0) {
                     break;
                  }

                  if (var1 == 0) {
                     continue;
                  }
               } catch (oov var5) {
                  throw a(var5);
               }
            }

            var3++;
            break;
         }

         if (var1 != 0) {
            break;
         }
      }

      return "" + var2;
   }

   public void xep(mew param1, akm param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: getfield jux.hz3 Lt9d;
      // 08: aload 1
      // 09: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 0c: astore 4
      // 0e: aload 4
      // 10: iload 3
      // 11: ifeq 20
      // 14: ifnull 61
      // 17: goto 1e
      // 1a: invokestatic jux.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: aload 4
      // 20: invokeinterface zfz.r_y ()Le0x; 1
      // 25: getstatic net/optifine/reflect/Reflector.ForgeBlock_addHitEffects Lnet/optifine/reflect/ReflectorMethod;
      // 28: bipush 3
      // 29: anewarray 20
      // 2c: dup
      // 2d: bipush 0
      // 2e: aload 0
      // 2f: getfield jux.hz3 Lt9d;
      // 32: aastore
      // 33: dup
      // 34: bipush 1
      // 35: aload 2
      // 36: aastore
      // 37: dup
      // 38: bipush 2
      // 39: aload 0
      // 3a: aastore
      // 3b: invokestatic net/optifine/reflect/Reflector.callBoolean (Ljava/lang/Object;Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)Z
      // 3e: istore 5
      // 40: aload 4
      // 42: ifnull 61
      // 45: iload 5
      // 47: ifne 61
      // 4a: goto 51
      // 4d: invokestatic jux.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 50: athrow
      // 51: aload 0
      // 52: aload 1
      // 53: aload 2
      // 54: getfield akm.m_f Lvt2;
      // 57: invokevirtual jux.so_ (Lmew;Lvt2;)V
      // 5a: goto 61
      // 5d: invokestatic jux.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 60: athrow
      // 61: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(9033616218039975808L, 4242732169573290430L, MethodHandles.lookup().lookupClass()).a(58660150113282L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 89928291952076L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[9];
      int var5 = 0;
      String var4 = "×7\u009ey£,`ª¯¬\u0014\u0097IVºÍ¿l\u008e\u0011ÜÆÚ¡\u001a\u001eÿá\fzÜÏ7\u0010I=|¶\u009dy\u009aFª£(×\u008fô(U²ö3Ø\u0017\u00adxÁ\f®};\u001bA0\u0016öëïÝp?\u0087BÓ\u009f\u000f;\u001e\u0010ì^\u0089¾%¼ª×5()\u0092\u0097\u008f~°#h\u001b\u0099\u0089Däj©}º\u0089gûAn&,°\u001a¯\u00838À`[Ni\u0092ÿyÝ:T(\u0004Â\u000eÒ\u00adé\bÈ\u0004§u\u0019¬¢PÇ\u008b>göØçÎtâ(m|\u0014XX²AÂí\u0087\u0087B\u001e~(^Ñ\u0088á \u0089\u0087qí\u00815»\u0010t\u007f\u0006ã\b\u0083¡í\u009e\u0019]¹\u0099\u009a#\u0012\u001b!Âu5ó\u0003AXC?\u0018\u0015°\u0019Ð\u0089í\u0006³LA¥p¹§ï\u008b\u0002³\f\u0012n}\u0085O\u0018\u009cÜ!l¾ÑLàKK\u0098\u009c¤O\u0091b/FÐ©a¿à#";
      int var6 = "×7\u009ey£,`ª¯¬\u0014\u0097IVºÍ¿l\u008e\u0011ÜÆÚ¡\u001a\u001eÿá\fzÜÏ7\u0010I=|¶\u009dy\u009aFª£(×\u008fô(U²ö3Ø\u0017\u00adxÁ\f®};\u001bA0\u0016öëïÝp?\u0087BÓ\u009f\u000f;\u001e\u0010ì^\u0089¾%¼ª×5()\u0092\u0097\u008f~°#h\u001b\u0099\u0089Däj©}º\u0089gûAn&,°\u001a¯\u00838À`[Ni\u0092ÿyÝ:T(\u0004Â\u000eÒ\u00adé\bÈ\u0004§u\u0019¬¢PÇ\u008b>göØçÎtâ(m|\u0014XX²AÂí\u0087\u0087B\u001e~(^Ñ\u0088á \u0089\u0087qí\u00815»\u0010t\u007f\u0006ã\b\u0083¡í\u009e\u0019]¹\u0099\u009a#\u0012\u001b!Âu5ó\u0003AXC?\u0018\u0015°\u0019Ð\u0089í\u0006³LA¥p¹§ï\u008b\u0002³\f\u0012n}\u0085O\u0018\u009cÜ!l¾ÑLàKK\u0098\u009c¤O\u0091b/FÐ©a¿à#"
         .length();
      char var3 = '0';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     b = var7;
                     c = new String[9];
                     nb8 = new gdz(a<"p">(16661, 988678216113389325L ^ var9));
                     return;
                  }

                  var3 = var4.charAt(var12);
                  break;
               default:
                  var7[var5++] = var20;
                  if ((var12 += var3) < var6) {
                     var3 = var4.charAt(var12);
                     continue label27;
                  }

                  var4 = "q\u0019R_0\u00123$8¤%a=Ç¬\u00855>\u0093ü¸z\n2\u0011T^xÓºÀR\u0018ZÁÇ°Õ\u007fÚH1r\u0001e?#@\u000b\u0011åe\u0013\u0096~v&";
                  var6 = "q\u0019R_0\u00123$8¤%a=Ç¬\u00855>\u0093ü¸z\n2\u0011T^xÓºÀR\u0018ZÁÇ°Õ\u007fÚH1r\u0001e?#@\u000b\u0011åe\u0013\u0096~v&".length();
                  var3 = ' ';
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
      }
   }

   private static Throwable a(Throwable var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 18599;
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
            throw new RuntimeException("jux", var10);
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
         throw new RuntimeException("jux" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
