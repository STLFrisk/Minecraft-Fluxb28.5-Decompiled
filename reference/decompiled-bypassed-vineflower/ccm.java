import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

public class ccm extends cjm {
   private final Predicate cyn = new ccm$1(this);
   public laq m8z;
   private double b37;
   private double _mp;
   public i2h xds;
   private float wx8;
   private t_2 o6c;
   private p8a h6d;
   private Class agm;
   private Predicate f48;

   public ccm(laq var1, Class var2, float var3, double var4, double var6) {
      this(var1, var2, Predicates.alwaysTrue(), var3, var4, var6);
   }

   public ccm(laq var1, Class var2, Predicate var3, float var4, double var5, double var7) {
      this.m8z = var1;
      this.agm = var2;
      this.f48 = var3;
      this.wx8 = var4;
      this.b37 = var5;
      this._mp = var7;
      this.h6d = var1.zq2();
      this.k23(1);
   }

   @Override
   public boolean vle() {
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
      // 005: getfield ccm.m8z Llaq;
      // 008: getfield laq.oay Lt9d;
      // 00b: aload 0
      // 00c: getfield ccm.agm Ljava/lang/Class;
      // 00f: aload 0
      // 010: getfield ccm.m8z Llaq;
      // 013: invokevirtual laq.aaw ()Lnh4;
      // 016: aload 0
      // 017: getfield ccm.wx8 F
      // 01a: f2d
      // 01b: ldc2_w 3.0
      // 01e: aload 0
      // 01f: getfield ccm.wx8 F
      // 022: f2d
      // 023: invokevirtual nh4.c2h (DDD)Lnh4;
      // 026: bipush 3
      // 027: anewarray 88
      // 02a: dup
      // 02b: bipush 0
      // 02c: getstatic k0_.t1f Lcom/google/common/base/Predicate;
      // 02f: aastore
      // 030: dup
      // 031: bipush 1
      // 032: aload 0
      // 033: getfield ccm.cyn Lcom/google/common/base/Predicate;
      // 036: aastore
      // 037: dup
      // 038: bipush 2
      // 039: aload 0
      // 03a: getfield ccm.f48 Lcom/google/common/base/Predicate;
      // 03d: aastore
      // 03e: invokestatic com/google/common/base/Predicates.and ([Lcom/google/common/base/Predicate;)Lcom/google/common/base/Predicate;
      // 041: invokevirtual t9d.vie (Ljava/lang/Class;Lnh4;Lcom/google/common/base/Predicate;)Ljava/util/List;
      // 044: astore 2
      // 045: iload 1
      // 046: ifne 06d
      // 049: aload 2
      // 04a: invokeinterface java/util/List.isEmpty ()Z 1
      // 04f: ifeq 05f
      // 052: goto 059
      // 055: invokestatic ccm.a (Loov;)Loov;
      // 058: athrow
      // 059: bipush 0
      // 05a: ireturn
      // 05b: invokestatic ccm.a (Loov;)Loov;
      // 05e: athrow
      // 05f: aload 0
      // 060: aload 2
      // 061: bipush 0
      // 062: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 067: checkcast i2h
      // 06a: putfield ccm.xds Li2h;
      // 06d: aload 0
      // 06e: getfield ccm.m8z Llaq;
      // 071: bipush 16
      // 073: bipush 7
      // 075: new fqr
      // 078: dup
      // 079: aload 0
      // 07a: getfield ccm.xds Li2h;
      // 07d: getfield i2h.o2v D
      // 080: aload 0
      // 081: getfield ccm.xds Li2h;
      // 084: getfield i2h.kfp D
      // 087: aload 0
      // 088: getfield ccm.xds Li2h;
      // 08b: getfield i2h.vbd D
      // 08e: invokespecial fqr.<init> (DDD)V
      // 091: invokestatic zim.sxc (Llaq;IILfqr;)Lfqr;
      // 094: astore 3
      // 095: aload 3
      // 096: ifnonnull 09f
      // 099: bipush 0
      // 09a: ireturn
      // 09b: invokestatic ccm.a (Loov;)Loov;
      // 09e: athrow
      // 09f: aload 0
      // 0a0: iload 1
      // 0a1: ifne 0ea
      // 0a4: getfield ccm.xds Li2h;
      // 0a7: aload 3
      // 0a8: getfield fqr.lvi D
      // 0ab: aload 3
      // 0ac: getfield fqr.gn5 D
      // 0af: aload 3
      // 0b0: getfield fqr.bn2 D
      // 0b3: invokevirtual i2h.p53 (DDD)D
      // 0b6: aload 0
      // 0b7: getfield ccm.xds Li2h;
      // 0ba: aload 0
      // 0bb: getfield ccm.m8z Llaq;
      // 0be: invokevirtual i2h.wxg (Li2h;)D
      // 0c1: dcmpg
      // 0c2: ifge 0d2
      // 0c5: goto 0cc
      // 0c8: invokestatic ccm.a (Loov;)Loov;
      // 0cb: athrow
      // 0cc: bipush 0
      // 0cd: ireturn
      // 0ce: invokestatic ccm.a (Loov;)Loov;
      // 0d1: athrow
      // 0d2: aload 0
      // 0d3: aload 0
      // 0d4: getfield ccm.h6d Lp8a;
      // 0d7: aload 3
      // 0d8: getfield fqr.lvi D
      // 0db: aload 3
      // 0dc: getfield fqr.gn5 D
      // 0df: aload 3
      // 0e0: getfield fqr.bn2 D
      // 0e3: invokevirtual p8a.yex (DDD)Lt_2;
      // 0e6: putfield ccm.o6c Lt_2;
      // 0e9: aload 0
      // 0ea: getfield ccm.o6c Lt_2;
      // 0ed: iload 1
      // 0ee: ifne 107
      // 0f1: ifnonnull 103
      // 0f4: goto 0fb
      // 0f7: invokestatic ccm.a (Loov;)Loov;
      // 0fa: athrow
      // 0fb: bipush 0
      // 0fc: goto 10b
      // 0ff: invokestatic ccm.a (Loov;)Loov;
      // 102: athrow
      // 103: aload 0
      // 104: getfield ccm.o6c Lt_2;
      // 107: aload 3
      // 108: invokevirtual t_2.gt8 (Lfqr;)Z
      // 10b: ireturn
   }

   @Override
   public boolean wh3() {
      int var1 = t9d.b();

      try {
         boolean var10000 = this.h6d.j07();
         if (var1 == 0) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return false;
   }

   @Override
   public void mnp() {
      this.h6d.sh7(this.o6c, this.b37);
   }

   @Override
   public void zly() {
      this.xds = null;
   }

   @Override
   public void iad() {
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
      // 05: getfield ccm.m8z Llaq;
      // 08: iload 1
      // 09: ifeq 45
      // 0c: aload 0
      // 0d: getfield ccm.xds Li2h;
      // 10: invokevirtual laq.wxg (Li2h;)D
      // 13: ldc2_w 49.0
      // 16: dcmpg
      // 17: ifge 3a
      // 1a: goto 21
      // 1d: invokestatic ccm.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 0
      // 22: getfield ccm.m8z Llaq;
      // 25: invokevirtual laq.zq2 ()Lp8a;
      // 28: aload 0
      // 29: getfield ccm._mp D
      // 2c: invokevirtual p8a.rbp (D)V
      // 2f: iload 1
      // 30: ifne 4f
      // 33: goto 3a
      // 36: invokestatic ccm.a (Loov;)Loov;
      // 39: athrow
      // 3a: aload 0
      // 3b: getfield ccm.m8z Llaq;
      // 3e: goto 45
      // 41: invokestatic ccm.a (Loov;)Loov;
      // 44: athrow
      // 45: invokevirtual laq.zq2 ()Lp8a;
      // 48: aload 0
      // 49: getfield ccm.b37 D
      // 4c: invokevirtual p8a.rbp (D)V
      // 4f: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
