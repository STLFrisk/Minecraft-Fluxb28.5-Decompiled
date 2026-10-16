public class ckj {
   public jt3[] nr9;
   public int fyl;

   public ckj(jt3[] var1) {
      this.nr9 = var1;
      this.fyl = var1.length;
   }

   public ckj(jt3[] var1, int var2, int var3, int var4, int var5, float var6, float var7) {
      this(var1);
      float var8 = 0.0F / var6;
      float var9 = 0.0F / var7;
      var1[0] = var1[0].rmw((float)var4 / var6 - var8, (float)var3 / var7 + var9);
      var1[1] = var1[1].rmw((float)var2 / var6 + var8, (float)var3 / var7 + var9);
      var1[2] = var1[2].rmw((float)var2 / var6 + var8, (float)var5 / var7 - var9);
      var1[3] = var1[3].rmw((float)var4 / var6 - var8, (float)var5 / var7 - var9);
   }

   public void uq0() {
      jt3[] var1 = new jt3[this.nr9.length];
      int var2 = 0;

      try {
         while (var2 < this.nr9.length) {
            var1[var2] = this.nr9[this.nr9.length - var2 - 1];
            var2++;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      this.nr9 = var1;
   }

   public void kq3(q3g param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield ckj.nr9 [Ljt3;
      // 004: bipush 1
      // 005: aaload
      // 006: getfield jt3.ugv Lfqr;
      // 009: aload 0
      // 00a: getfield ckj.nr9 [Ljt3;
      // 00d: bipush 0
      // 00e: aaload
      // 00f: getfield jt3.ugv Lfqr;
      // 012: invokevirtual fqr.vei (Lfqr;)Lfqr;
      // 015: astore 4
      // 017: aload 0
      // 018: getfield ckj.nr9 [Ljt3;
      // 01b: bipush 1
      // 01c: aaload
      // 01d: getfield jt3.ugv Lfqr;
      // 020: aload 0
      // 021: getfield ckj.nr9 [Ljt3;
      // 024: bipush 2
      // 025: aaload
      // 026: getfield jt3.ugv Lfqr;
      // 029: invokevirtual fqr.vei (Lfqr;)Lfqr;
      // 02c: astore 5
      // 02e: aload 5
      // 030: aload 4
      // 032: invokevirtual fqr.ajp (Lfqr;)Lfqr;
      // 035: invokevirtual fqr.kec ()Lfqr;
      // 038: astore 6
      // 03a: invokestatic t9d.c ()I
      // 03d: aload 6
      // 03f: getfield fqr.lvi D
      // 042: d2f
      // 043: fstore 7
      // 045: aload 6
      // 047: getfield fqr.gn5 D
      // 04a: d2f
      // 04b: fstore 8
      // 04d: aload 6
      // 04f: getfield fqr.bn2 D
      // 052: d2f
      // 053: fstore 9
      // 055: istore 3
      // 056: aload 0
      // 057: getfield ckj.g5v Z
      // 05a: iload 3
      // 05b: ifne 07a
      // 05e: ifeq 077
      // 061: goto 068
      // 064: invokestatic ckj.a (Loov;)Loov;
      // 067: athrow
      // 068: fload 7
      // 06a: fneg
      // 06b: fstore 7
      // 06d: fload 8
      // 06f: fneg
      // 070: fstore 8
      // 072: fload 9
      // 074: fneg
      // 075: fstore 9
      // 077: invokestatic hxt.ly3 ()Z
      // 07a: ifeq 091
      // 07d: aload 1
      // 07e: bipush 7
      // 080: getstatic net/optifine/shaders/SVertexFormat.defVertexFormatTextured Lbe7;
      // 083: invokevirtual q3g.ezr (ILbe7;)V
      // 086: iload 3
      // 087: ifeq 0a1
      // 08a: goto 091
      // 08d: invokestatic ckj.a (Loov;)Loov;
      // 090: athrow
      // 091: aload 1
      // 092: bipush 7
      // 094: getstatic gnl.q0i Lbe7;
      // 097: invokevirtual q3g.ezr (ILbe7;)V
      // 09a: goto 0a1
      // 09d: invokestatic ckj.a (Loov;)Loov;
      // 0a0: athrow
      // 0a1: bipush 0
      // 0a2: istore 10
      // 0a4: iload 10
      // 0a6: bipush 4
      // 0a7: if_icmpge 105
      // 0aa: aload 0
      // 0ab: getfield ckj.nr9 [Ljt3;
      // 0ae: iload 10
      // 0b0: aaload
      // 0b1: astore 11
      // 0b3: aload 1
      // 0b4: aload 11
      // 0b6: getfield jt3.ugv Lfqr;
      // 0b9: getfield fqr.lvi D
      // 0bc: fload 2
      // 0bd: f2d
      // 0be: dmul
      // 0bf: aload 11
      // 0c1: getfield jt3.ugv Lfqr;
      // 0c4: getfield fqr.gn5 D
      // 0c7: fload 2
      // 0c8: f2d
      // 0c9: dmul
      // 0ca: aload 11
      // 0cc: getfield jt3.ugv Lfqr;
      // 0cf: getfield fqr.bn2 D
      // 0d2: fload 2
      // 0d3: f2d
      // 0d4: dmul
      // 0d5: invokevirtual q3g.g5o (DDD)Lq3g;
      // 0d8: aload 11
      // 0da: getfield jt3.td0 F
      // 0dd: f2d
      // 0de: aload 11
      // 0e0: getfield jt3.gpa F
      // 0e3: f2d
      // 0e4: invokevirtual q3g.h0a (DD)Lq3g;
      // 0e7: fload 7
      // 0e9: fload 8
      // 0eb: fload 9
      // 0ed: invokevirtual q3g.h3y (FFF)Lq3g;
      // 0f0: invokevirtual q3g.pzw ()V
      // 0f3: iinc 10 1
      // 0f6: iload 3
      // 0f7: ifne 10b
      // 0fa: iload 3
      // 0fb: ifeq 0a4
      // 0fe: goto 105
      // 101: invokestatic ckj.a (Loov;)Loov;
      // 104: athrow
      // 105: invokestatic jom.yut ()Ljom;
      // 108: invokevirtual jom.q7g ()V
      // 10b: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
