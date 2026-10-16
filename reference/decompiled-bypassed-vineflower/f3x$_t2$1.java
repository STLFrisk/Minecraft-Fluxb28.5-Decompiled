import java.util.Comparator;

public class f3x$_t2$1 implements Comparator {
   public final f3x m65;
   public final f3x$_t2 sja;

   public f3x$_t2$1(f3x$_t2 var1, f3x var2) {
      this.sja = var1;
      this.m65 = var2;
   }

   public int wh_(rlk param1, rlk param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: invokevirtual rlk.u3i ()Lu7m;
      // 004: invokestatic u7m._lo (Lu7m;)I
      // 007: istore 4
      // 009: invokestatic t9d.c ()I
      // 00c: aload 2
      // 00d: invokevirtual rlk.u3i ()Lu7m;
      // 010: invokestatic u7m._lo (Lu7m;)I
      // 013: istore 5
      // 015: aconst_null
      // 016: astore 6
      // 018: istore 3
      // 019: aconst_null
      // 01a: astore 7
      // 01c: aload 0
      // 01d: getfield f3x$_t2$1.sja Lf3x$_t2;
      // 020: getfield f3x$_t2.c9s I
      // 023: iload 3
      // 024: ifne 04b
      // 027: ifne 044
      // 02a: goto 031
      // 02d: invokestatic f3x$_t2$1.a (Loov;)Loov;
      // 030: athrow
      // 031: getstatic l9p.ysy [L_ss;
      // 034: iload 4
      // 036: aaload
      // 037: astore 6
      // 039: getstatic l9p.ysy [L_ss;
      // 03c: iload 5
      // 03e: aaload
      // 03f: astore 7
      // 041: goto 088
      // 044: aload 0
      // 045: getfield f3x$_t2$1.sja Lf3x$_t2;
      // 048: getfield f3x$_t2.c9s I
      // 04b: bipush 1
      // 04c: iload 3
      // 04d: ifne 075
      // 050: if_icmpne 06d
      // 053: goto 05a
      // 056: invokestatic f3x$_t2$1.a (Loov;)Loov;
      // 059: athrow
      // 05a: getstatic l9p._ee [L_ss;
      // 05d: iload 4
      // 05f: aaload
      // 060: astore 6
      // 062: getstatic l9p._ee [L_ss;
      // 065: iload 5
      // 067: aaload
      // 068: astore 7
      // 06a: goto 088
      // 06d: aload 0
      // 06e: getfield f3x$_t2$1.sja Lf3x$_t2;
      // 071: getfield f3x$_t2.c9s I
      // 074: bipush 2
      // 075: if_icmpne 088
      // 078: getstatic l9p.foo [L_ss;
      // 07b: iload 4
      // 07d: aaload
      // 07e: astore 6
      // 080: getstatic l9p.foo [L_ss;
      // 083: iload 5
      // 085: aaload
      // 086: astore 7
      // 088: aload 6
      // 08a: iload 3
      // 08b: ifne 0b1
      // 08e: ifnonnull 0af
      // 091: goto 098
      // 094: invokestatic f3x$_t2$1.a (Loov;)Loov;
      // 097: athrow
      // 098: aload 7
      // 09a: iload 3
      // 09b: ifne 0b1
      // 09e: goto 0a5
      // 0a1: invokestatic f3x$_t2$1.a (Loov;)Loov;
      // 0a4: athrow
      // 0a5: ifnull 116
      // 0a8: goto 0af
      // 0ab: invokestatic f3x$_t2$1.a (Loov;)Loov;
      // 0ae: athrow
      // 0af: aload 6
      // 0b1: iload 3
      // 0b2: ifne 0c7
      // 0b5: ifnonnull 0c5
      // 0b8: goto 0bf
      // 0bb: invokestatic f3x$_t2$1.a (Loov;)Loov;
      // 0be: athrow
      // 0bf: bipush 1
      // 0c0: ireturn
      // 0c1: invokestatic f3x$_t2$1.a (Loov;)Loov;
      // 0c4: athrow
      // 0c5: aload 7
      // 0c7: ifnonnull 0d0
      // 0ca: bipush -1
      // 0cb: ireturn
      // 0cc: invokestatic f3x$_t2$1.a (Loov;)Loov;
      // 0cf: athrow
      // 0d0: aload 0
      // 0d1: getfield f3x$_t2$1.sja Lf3x$_t2;
      // 0d4: getfield f3x$_t2.o75 Lf3x;
      // 0d7: invokestatic f3x.h5z (Lf3x;)Lik0;
      // 0da: aload 6
      // 0dc: invokevirtual ik0.zgq (L_ss;)I
      // 0df: istore 8
      // 0e1: aload 0
      // 0e2: getfield f3x$_t2$1.sja Lf3x$_t2;
      // 0e5: getfield f3x$_t2.o75 Lf3x;
      // 0e8: invokestatic f3x.h5z (Lf3x;)Lik0;
      // 0eb: aload 7
      // 0ed: invokevirtual ik0.zgq (L_ss;)I
      // 0f0: istore 9
      // 0f2: iload 8
      // 0f4: iload 9
      // 0f6: iload 3
      // 0f7: ifne 11a
      // 0fa: if_icmpeq 116
      // 0fd: goto 104
      // 100: invokestatic f3x$_t2$1.a (Loov;)Loov;
      // 103: athrow
      // 104: iload 8
      // 106: iload 9
      // 108: isub
      // 109: aload 0
      // 10a: getfield f3x$_t2$1.sja Lf3x$_t2;
      // 10d: getfield f3x$_t2.uh5 I
      // 110: imul
      // 111: ireturn
      // 112: invokestatic f3x$_t2$1.a (Loov;)Loov;
      // 115: athrow
      // 116: iload 4
      // 118: iload 5
      // 11a: isub
      // 11b: ireturn
   }

   @Override
   public int compare(Object var1, Object var2) {
      return this.wh_((rlk)var1, (rlk)var2);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
