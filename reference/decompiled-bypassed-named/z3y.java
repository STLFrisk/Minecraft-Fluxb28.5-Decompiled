import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import net.minecraft.network.play.server.S3BPacketScoreboardObjective;
import net.minecraft.network.play.server.S3CPacketUpdateScore;
import net.minecraft.network.play.server.S3DPacketDisplayScoreboard;
import net.minecraft.network.play.server.S3EPacketTeams;

public class z3y extends uci {
   public z3y(vr1 var1) {
      this.ass = var1;
   }

   @Override
   public void anw(r11 param1) {
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
      // 06: invokespecial uci.anw (Lr11;)V
      // 09: aload 0
      // 0a: iload 2
      // 0b: ifeq 3e
      // 0e: getfield z3y.fq6 Ljava/util/Set;
      // 11: aload 1
      // 12: invokevirtual r11.i3t ()Lsa6;
      // 15: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 1a: ifeq 3d
      // 1d: goto 24
      // 20: invokestatic z3y.a (Loov;)Loov;
      // 23: athrow
      // 24: aload 0
      // 25: getfield z3y.ass Lvr1;
      // 28: invokevirtual vr1.wh3 ()Lwlx;
      // 2b: new net/minecraft/network/play/server/S3CPacketUpdateScore
      // 2e: dup
      // 2f: aload 1
      // 30: invokespecial net/minecraft/network/play/server/S3CPacketUpdateScore.<init> (Lr11;)V
      // 33: invokevirtual wlx.v3l (Lmz2;)V
      // 36: goto 3d
      // 39: invokestatic z3y.a (Loov;)Loov;
      // 3c: athrow
      // 3d: aload 0
      // 3e: invokevirtual z3y.ulg ()V
      // 41: return
   }

   @Override
   public void eqo(String var1) {
      super.eqo(var1);
      this.ass.wh3().v3l(new S3CPacketUpdateScore(var1));
      this.ulg();
   }

   @Override
   public void in2(String var1, sa6 var2) {
      super.in2(var1, var2);
      this.ass.wh3().v3l(new S3CPacketUpdateScore(var1, var2));
      this.ulg();
   }

   @Override
   public void zux(int param1, sa6 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: iload 1
      // 02: invokevirtual z3y.d_n (I)Lsa6;
      // 05: astore 4
      // 07: invokestatic OpaquePredicate.c ()I
      // 0a: aload 0
      // 0b: iload 1
      // 0c: aload 2
      // 0d: invokespecial uci.zux (ILsa6;)V
      // 10: istore 3
      // 11: aload 4
      // 13: iload 3
      // 14: ifne 80
      // 17: aload 2
      // 18: if_acmpeq 7f
      // 1b: goto 22
      // 1e: invokestatic z3y.a (Loov;)Loov;
      // 21: athrow
      // 22: aload 4
      // 24: iload 3
      // 25: ifne 80
      // 28: goto 2f
      // 2b: invokestatic z3y.a (Loov;)Loov;
      // 2e: athrow
      // 2f: ifnull 7f
      // 32: goto 39
      // 35: invokestatic z3y.a (Loov;)Loov;
      // 38: athrow
      // 39: aload 0
      // 3a: aload 4
      // 3c: iload 3
      // 3d: ifne 7c
      // 40: goto 47
      // 43: invokestatic z3y.a (Loov;)Loov;
      // 46: athrow
      // 47: invokevirtual z3y.tm2 (Lsa6;)I
      // 4a: ifle 72
      // 4d: goto 54
      // 50: invokestatic z3y.a (Loov;)Loov;
      // 53: athrow
      // 54: aload 0
      // 55: getfield z3y.ass Lvr1;
      // 58: invokevirtual vr1.wh3 ()Lwlx;
      // 5b: new net/minecraft/network/play/server/S3DPacketDisplayScoreboard
      // 5e: dup
      // 5f: iload 1
      // 60: aload 2
      // 61: invokespecial net/minecraft/network/play/server/S3DPacketDisplayScoreboard.<init> (ILsa6;)V
      // 64: invokevirtual wlx.v3l (Lmz2;)V
      // 67: iload 3
      // 68: ifeq 7f
      // 6b: goto 72
      // 6e: invokestatic z3y.a (Loov;)Loov;
      // 71: athrow
      // 72: aload 0
      // 73: aload 4
      // 75: goto 7c
      // 78: invokestatic z3y.a (Loov;)Loov;
      // 7b: athrow
      // 7c: invokevirtual z3y.f45 (Lsa6;)V
      // 7f: aload 2
      // 80: ifnull cc
      // 83: aload 0
      // 84: iload 3
      // 85: ifne c8
      // 88: goto 8f
      // 8b: invokestatic z3y.a (Loov;)Loov;
      // 8e: athrow
      // 8f: getfield z3y.fq6 Ljava/util/Set;
      // 92: aload 2
      // 93: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 98: ifeq c0
      // 9b: goto a2
      // 9e: invokestatic z3y.a (Loov;)Loov;
      // a1: athrow
      // a2: aload 0
      // a3: getfield z3y.ass Lvr1;
      // a6: invokevirtual vr1.wh3 ()Lwlx;
      // a9: new net/minecraft/network/play/server/S3DPacketDisplayScoreboard
      // ac: dup
      // ad: iload 1
      // ae: aload 2
      // af: invokespecial net/minecraft/network/play/server/S3DPacketDisplayScoreboard.<init> (ILsa6;)V
      // b2: invokevirtual wlx.v3l (Lmz2;)V
      // b5: iload 3
      // b6: ifeq cc
      // b9: goto c0
      // bc: invokestatic z3y.a (Loov;)Loov;
      // bf: athrow
      // c0: aload 0
      // c1: goto c8
      // c4: invokestatic z3y.a (Loov;)Loov;
      // c7: athrow
      // c8: aload 2
      // c9: invokevirtual z3y.rzp (Lsa6;)V
      // cc: aload 0
      // cd: invokevirtual z3y.ulg ()V
      // d0: return
   }

   @Override
   public boolean g_l(String var1, String var2) {
      int var3 = OpaquePredicate.c();

      label27: {
         try {
            boolean var10000 = super.g_l(var1, var2);
            if (var3 != 0) {
               return var10000;
            }

            if (var10000) {
               break label27;
            }
         } catch (oov var5) {
            throw a(var5);
         }

         return false;
      }

      q2m var4 = this.l2u(var2);
      this.ass.wh3().v3l(new S3EPacketTeams(var4, Arrays.asList(var1), 3));
      this.ulg();
      return true;
   }

   @Override
   public void srl(String var1, q2m var2) {
      super.srl(var1, var2);
      this.ass.wh3().v3l(new S3EPacketTeams(var2, Arrays.asList(var1), 4));
      this.ulg();
   }

   @Override
   public void d_2(sa6 var1) {
      super.d_2(var1);
      this.ulg();
   }

   @Override
   public void u75(sa6 param1) {
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
      // 06: invokespecial uci.u75 (Lsa6;)V
      // 09: aload 0
      // 0a: iload 2
      // 0b: ifeq 3c
      // 0e: getfield z3y.fq6 Ljava/util/Set;
      // 11: aload 1
      // 12: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 17: ifeq 3b
      // 1a: goto 21
      // 1d: invokestatic z3y.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 0
      // 22: getfield z3y.ass Lvr1;
      // 25: invokevirtual vr1.wh3 ()Lwlx;
      // 28: new net/minecraft/network/play/server/S3BPacketScoreboardObjective
      // 2b: dup
      // 2c: aload 1
      // 2d: bipush 2
      // 2e: invokespecial net/minecraft/network/play/server/S3BPacketScoreboardObjective.<init> (Lsa6;I)V
      // 31: invokevirtual wlx.v3l (Lmz2;)V
      // 34: goto 3b
      // 37: invokestatic z3y.a (Loov;)Loov;
      // 3a: athrow
      // 3b: aload 0
      // 3c: invokevirtual z3y.ulg ()V
      // 3f: return
   }

   @Override
   public void guh(sa6 param1) {
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
      // 05: aload 1
      // 06: invokespecial uci.guh (Lsa6;)V
      // 09: aload 0
      // 0a: iload 2
      // 0b: ifne 2e
      // 0e: getfield z3y.fq6 Ljava/util/Set;
      // 11: aload 1
      // 12: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 17: ifeq 2d
      // 1a: goto 21
      // 1d: invokestatic z3y.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 0
      // 22: aload 1
      // 23: invokevirtual z3y.f45 (Lsa6;)V
      // 26: goto 2d
      // 29: invokestatic z3y.a (Loov;)Loov;
      // 2c: athrow
      // 2d: aload 0
      // 2e: invokevirtual z3y.ulg ()V
      // 31: return
   }

   @Override
   public void plf(q2m var1) {
      super.plf(var1);
      this.ass.wh3().v3l(new S3EPacketTeams(var1, 0));
      this.ulg();
   }

   @Override
   public void b_v(q2m var1) {
      super.b_v(var1);
      this.ass.wh3().v3l(new S3EPacketTeams(var1, 2));
      this.ulg();
   }

   @Override
   public void ga8(q2m var1) {
      super.ga8(var1);
      this.ass.wh3().v3l(new S3EPacketTeams(var1, 1));
      this.ulg();
   }

   public void wh5(a16 var1) {
      this.ep7 = var1;
   }

   public void ulg() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield z3y.ep7 La16;
      // 08: iload 1
      // 09: ifeq 21
      // 0c: ifnull 24
      // 0f: goto 16
      // 12: invokestatic z3y.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield z3y.ep7 La16;
      // 1a: goto 21
      // 1d: invokestatic z3y.a (Loov;)Loov;
      // 20: athrow
      // 21: invokevirtual a16.hcs ()V
      // 24: return
   }

   public List nsa(sa6 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 03: astore 3
      // 04: invokestatic OpaquePredicate.c ()I
      // 07: aload 3
      // 08: new net/minecraft/network/play/server/S3BPacketScoreboardObjective
      // 0b: dup
      // 0c: aload 1
      // 0d: bipush 0
      // 0e: invokespecial net/minecraft/network/play/server/S3BPacketScoreboardObjective.<init> (Lsa6;I)V
      // 11: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 16: pop
      // 17: istore 2
      // 18: bipush 0
      // 19: istore 4
      // 1b: iload 4
      // 1d: bipush 19
      // 1f: if_icmpge 56
      // 22: aload 0
      // 23: iload 2
      // 24: ifne 57
      // 27: iload 4
      // 29: invokevirtual z3y.d_n (I)Lsa6;
      // 2c: aload 1
      // 2d: if_acmpne 4f
      // 30: goto 37
      // 33: invokestatic z3y.a (Loov;)Loov;
      // 36: athrow
      // 37: aload 3
      // 38: new net/minecraft/network/play/server/S3DPacketDisplayScoreboard
      // 3b: dup
      // 3c: iload 4
      // 3e: aload 1
      // 3f: invokespecial net/minecraft/network/play/server/S3DPacketDisplayScoreboard.<init> (ILsa6;)V
      // 42: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 47: pop
      // 48: goto 4f
      // 4b: invokestatic z3y.a (Loov;)Loov;
      // 4e: athrow
      // 4f: iinc 4 1
      // 52: iload 2
      // 53: ifeq 1b
      // 56: aload 0
      // 57: aload 1
      // 58: invokevirtual z3y.oga (Lsa6;)Ljava/util/Collection;
      // 5b: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 60: astore 4
      // 62: aload 4
      // 64: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 69: ifeq 97
      // 6c: aload 4
      // 6e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 73: checkcast r11
      // 76: astore 5
      // 78: aload 3
      // 79: iload 2
      // 7a: ifne 98
      // 7d: new net/minecraft/network/play/server/S3CPacketUpdateScore
      // 80: dup
      // 81: aload 5
      // 83: invokespecial net/minecraft/network/play/server/S3CPacketUpdateScore.<init> (Lr11;)V
      // 86: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 8b: pop
      // 8c: iload 2
      // 8d: ifeq 62
      // 90: goto 97
      // 93: invokestatic z3y.a (Loov;)Loov;
      // 96: athrow
      // 97: aload 3
      // 98: areturn
   }

   public void rzp(sa6 var1) {
      List var3 = this.nsa(var1);
      int var10000 = OpaquePredicate.c();
      Iterator var4 = this.ass.wh3().tjx().iterator();
      int var2 = var10000;

      label29:
      while (true) {
         if (var4.hasNext()) {
            z96 var5 = (z96)var4.next();
            if (var2 != 0) {
               break;
            }

            for (mz2 var7 : var3) {
               var5.rhh.vnf(var7);
               if (var2 != 0) {
                  continue label29;
               }

               if (var2 != 0) {
                  break;
               }
            }

            if (var2 == 0) {
               continue;
            }
         }

         this.fq6.add(var1);
         break;
      }
   }

   public List dpy(sa6 var1) {
      ArrayList var3 = Lists.newArrayList();
      int var10000 = OpaquePredicate.b();
      var3.add(new S3BPacketScoreboardObjective(var1, 1));
      int var4 = 0;
      int var2 = var10000;

      while (var4 < 19) {
         try {
            if (this.d_n(var4) == var1) {
               var3.add(new S3DPacketDisplayScoreboard(var4, var1));
            }
         } catch (oov var5) {
            throw a(var5);
         }

         var4++;
         if (var2 == 0) {
            break;
         }
      }

      return var3;
   }

   public void f45(sa6 var1) {
      List var3 = this.dpy(var1);
      int var10000 = OpaquePredicate.c();
      Iterator var4 = this.ass.wh3().tjx().iterator();
      int var2 = var10000;

      label29:
      while (true) {
         if (var4.hasNext()) {
            z96 var5 = (z96)var4.next();
            if (var2 != 0) {
               break;
            }

            for (mz2 var7 : var3) {
               var5.rhh.vnf(var7);
               if (var2 != 0) {
                  continue label29;
               }

               if (var2 != 0) {
                  break;
               }
            }

            if (var2 == 0) {
               continue;
            }
         }

         this.fq6.remove(var1);
         break;
      }
   }

   public int tm2(sa6 var1) {
      int var3 = 0;
      int var10000 = OpaquePredicate.b();
      int var4 = 0;
      int var2 = var10000;

      while (var4 < 19) {
         try {
            if (this.d_n(var4) == var1) {
               var3++;
            }
         } catch (oov var5) {
            throw a(var5);
         }

         var4++;
         if (var2 == 0) {
            break;
         }
      }

      return var3;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
