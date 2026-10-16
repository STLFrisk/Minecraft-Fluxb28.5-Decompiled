public class usw {
   public usw(w66 var1) {
      this.t4i = var1;
   }

   public t_2 vk0(m5n var1, i2h var2, i2h var3, float var4) {
      return this.ixw(var1, var2, var3.o2v, var3.aaw().bx_, var3.vbd, var4);
   }

   public t_2 si4(m5n var1, i2h var2, mew var3, float var4) {
      return this.ixw(var1, var2, (double)((float)var3.getX() + 0.5F), (double)((float)var3.getY() + 0.5F), (double)((float)var3.getZ() + 0.5F), var4);
   }

   private t_2 ixw(m5n var1, i2h var2, double var3, double var5, double var7, float var9) {
      this.dt4.md6();
      this.t4i.zrj(var1, var2);
      mux var10 = this.t4i.wvu(var2);
      mux var11 = this.t4i.r7o(var2, var3, var5, var7);
      t_2 var12 = this.z0c(var2, var10, var11, var9);
      this.t4i.ai9();
      return var12;
   }

   private t_2 z0c(i2h param1, mux param2, mux param3, float param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 2
      // 001: fconst_0
      // 002: putfield mux.iwz F
      // 005: invokestatic t9d.c ()I
      // 008: aload 2
      // 009: aload 2
      // 00a: aload 3
      // 00b: invokevirtual mux.w52 (Lmux;)F
      // 00e: putfield mux.iqb F
      // 011: aload 2
      // 012: aload 2
      // 013: getfield mux.iqb F
      // 016: putfield mux.ujv F
      // 019: istore 5
      // 01b: aload 0
      // 01c: getfield usw.dt4 Lcqp;
      // 01f: invokevirtual cqp.md6 ()V
      // 022: aload 0
      // 023: getfield usw.dt4 Lcqp;
      // 026: aload 2
      // 027: invokevirtual cqp.h4k (Lmux;)Lmux;
      // 02a: pop
      // 02b: aload 2
      // 02c: astore 6
      // 02e: aload 0
      // 02f: getfield usw.dt4 Lcqp;
      // 032: invokevirtual cqp.a1s ()Z
      // 035: ifne 19e
      // 038: aload 0
      // 039: getfield usw.dt4 Lcqp;
      // 03c: invokevirtual cqp.qgk ()Lmux;
      // 03f: astore 7
      // 041: aload 7
      // 043: aload 3
      // 044: iload 5
      // 046: ifne 1a1
      // 049: invokevirtual mux.equals (Ljava/lang/Object;)Z
      // 04c: iload 5
      // 04e: ifne 07a
      // 051: goto 058
      // 054: invokestatic usw.a (Loov;)Loov;
      // 057: athrow
      // 058: ifeq 06d
      // 05b: goto 062
      // 05e: invokestatic usw.a (Loov;)Loov;
      // 061: athrow
      // 062: aload 0
      // 063: aload 2
      // 064: aload 3
      // 065: invokespecial usw.t1e (Lmux;Lmux;)Lt_2;
      // 068: areturn
      // 069: invokestatic usw.a (Loov;)Loov;
      // 06c: athrow
      // 06d: aload 7
      // 06f: aload 3
      // 070: invokevirtual mux.w52 (Lmux;)F
      // 073: aload 6
      // 075: aload 3
      // 076: invokevirtual mux.w52 (Lmux;)F
      // 079: fcmpg
      // 07a: iload 5
      // 07c: ifne 0a4
      // 07f: ifge 08d
      // 082: goto 089
      // 085: invokestatic usw.a (Loov;)Loov;
      // 088: athrow
      // 089: aload 7
      // 08b: astore 6
      // 08d: aload 7
      // 08f: bipush 1
      // 090: putfield mux.n77 Z
      // 093: aload 0
      // 094: getfield usw.t4i Lw66;
      // 097: aload 0
      // 098: getfield usw.g6j [Lmux;
      // 09b: aload 1
      // 09c: aload 7
      // 09e: aload 3
      // 09f: fload 4
      // 0a1: invokevirtual w66.t2_ ([Lmux;Li2h;Lmux;Lmux;F)I
      // 0a4: istore 8
      // 0a6: bipush 0
      // 0a7: istore 9
      // 0a9: iload 9
      // 0ab: iload 8
      // 0ad: if_icmpge 199
      // 0b0: aload 0
      // 0b1: getfield usw.g6j [Lmux;
      // 0b4: iload 9
      // 0b6: aaload
      // 0b7: astore 10
      // 0b9: aload 7
      // 0bb: getfield mux.iwz F
      // 0be: aload 7
      // 0c0: aload 10
      // 0c2: invokevirtual mux.w52 (Lmux;)F
      // 0c5: fadd
      // 0c6: fstore 11
      // 0c8: iload 5
      // 0ca: ifne 194
      // 0cd: fload 11
      // 0cf: fload 4
      // 0d1: fconst_2
      // 0d2: fmul
      // 0d3: fcmpg
      // 0d4: iload 5
      // 0d6: ifne 035
      // 0d9: goto 0e0
      // 0dc: invokestatic usw.a (Loov;)Loov;
      // 0df: athrow
      // 0e0: ifge 191
      // 0e3: aload 10
      // 0e5: invokevirtual mux.avs ()Z
      // 0e8: iload 5
      // 0ea: ifne 14d
      // 0ed: goto 0f4
      // 0f0: invokestatic usw.a (Loov;)Loov;
      // 0f3: athrow
      // 0f4: ifeq 11c
      // 0f7: goto 0fe
      // 0fa: invokestatic usw.a (Loov;)Loov;
      // 0fd: athrow
      // 0fe: fload 11
      // 100: aload 10
      // 102: getfield mux.iwz F
      // 105: fcmpg
      // 106: iload 5
      // 108: ifne 14d
      // 10b: goto 112
      // 10e: invokestatic usw.a (Loov;)Loov;
      // 111: athrow
      // 112: ifge 191
      // 115: goto 11c
      // 118: invokestatic usw.a (Loov;)Loov;
      // 11b: athrow
      // 11c: aload 10
      // 11e: aload 7
      // 120: putfield mux.mbm Lmux;
      // 123: aload 10
      // 125: fload 11
      // 127: putfield mux.iwz F
      // 12a: aload 10
      // 12c: aload 10
      // 12e: aload 3
      // 12f: invokevirtual mux.w52 (Lmux;)F
      // 132: putfield mux.iqb F
      // 135: aload 10
      // 137: iload 5
      // 139: ifne 190
      // 13c: goto 143
      // 13f: invokestatic usw.a (Loov;)Loov;
      // 142: athrow
      // 143: invokevirtual mux.avs ()Z
      // 146: goto 14d
      // 149: invokestatic usw.a (Loov;)Loov;
      // 14c: athrow
      // 14d: ifeq 170
      // 150: aload 0
      // 151: getfield usw.dt4 Lcqp;
      // 154: aload 10
      // 156: aload 10
      // 158: getfield mux.iwz F
      // 15b: aload 10
      // 15d: getfield mux.iqb F
      // 160: fadd
      // 161: invokevirtual cqp.ukf (Lmux;F)V
      // 164: iload 5
      // 166: ifeq 191
      // 169: goto 170
      // 16c: invokestatic usw.a (Loov;)Loov;
      // 16f: athrow
      // 170: aload 10
      // 172: aload 10
      // 174: getfield mux.iwz F
      // 177: aload 10
      // 179: getfield mux.iqb F
      // 17c: fadd
      // 17d: putfield mux.ujv F
      // 180: aload 0
      // 181: getfield usw.dt4 Lcqp;
      // 184: aload 10
      // 186: invokevirtual cqp.h4k (Lmux;)Lmux;
      // 189: goto 190
      // 18c: invokestatic usw.a (Loov;)Loov;
      // 18f: athrow
      // 190: pop
      // 191: iinc 9 1
      // 194: iload 5
      // 196: ifeq 0a9
      // 199: iload 5
      // 19b: ifeq 02e
      // 19e: aload 6
      // 1a0: aload 2
      // 1a1: if_acmpne 1aa
      // 1a4: aconst_null
      // 1a5: areturn
      // 1a6: invokestatic usw.a (Loov;)Loov;
      // 1a9: athrow
      // 1aa: aload 0
      // 1ab: aload 2
      // 1ac: aload 6
      // 1ae: invokespecial usw.t1e (Lmux;Lmux;)Lt_2;
      // 1b1: areturn
   }

   private t_2 t1e(mux var1, mux var2) {
      int var4 = 1;
      int var10000 = t9d.c();
      mux var5 = var2;
      int var3 = var10000;

      while (var5.mbm != null) {
         var4++;
         var5 = var5.mbm;
         if (var3 != 0) {
            break;
         }
      }

      mux[] var8 = new mux[var4];
      mux var6 = var2;
      var4--;
      var8[var4] = var2;

      while (var6.mbm != null) {
         var6 = var6.mbm;
         var4--;
         var8[var4] = var6;
         if (var3 != 0) {
            break;
         }
      }

      return new t_2(var8);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
