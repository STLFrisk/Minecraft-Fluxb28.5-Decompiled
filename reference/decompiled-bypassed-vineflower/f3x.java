import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.network.play.client.C16PacketClientStatus;
import net.minecraft.network.play.client.C16PacketClientStatus$v78;

public class f3x extends gbe implements yxa {
   public gbe gpj;
   public String g0x;
   private f3x$mti i9v;
   private f3x$_t2 _te;
   private f3x$uzf rg7;
   private f3x$i86 l7w;
   private ik0 xjz;
   private ed7 _3r;
   private boolean lfx;
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public f3x(gbe var1, ik0 var2) {
      long var3 = a ^ 43860371202135L;
      super();
      this.g0x = b<"v">(4871, 3154110303093163313L ^ var3);
      this.lfx = true;
      this.gpj = var1;
      this.xjz = var2;
   }

   @Override
   public void initGui() {
      long var1 = a ^ 114164759368618L;
      this.g0x = fc1.gx1(b<"v">(11242, 3864770374782504487L ^ var1), new Object[0]);
      this.lfx = true;
      this.f41.c02().sxi(new C16PacketClientStatus(C16PacketClientStatus$v78.gfl));
   }

   @Override
   public void handleMouseInput() {
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
      // 05: invokespecial gbe.handleMouseInput ()V
      // 08: aload 0
      // 09: getfield f3x._3r Led7;
      // 0c: iload 1
      // 0d: ifeq 25
      // 10: ifnull 28
      // 13: goto 1a
      // 16: invokestatic f3x.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 0
      // 1b: getfield f3x._3r Led7;
      // 1e: goto 25
      // 21: invokestatic f3x.a (Loov;)Loov;
      // 24: athrow
      // 25: invokevirtual ed7.gzb ()V
      // 28: return
   }

   public void ceu() {
      this.i9v = new f3x$mti(this, this.f41);
      this.i9v.x9x(1, 1);
      this._te = new f3x$_t2(this, this.f41);
      this._te.x9x(1, 1);
      this.rg7 = new f3x$uzf(this, this.f41);
      this.rg7.x9x(1, 1);
      this.l7w = new f3x$i86(this, this.f41);
      this.l7w.x9x(1, 1);
   }

   public void xox() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic f3x.a J
      // 003: ldc2_w 13093450957748
      // 006: lxor
      // 007: lstore 1
      // 008: aload 0
      // 009: getfield f3x.khf Ljava/util/List;
      // 00c: new gt4
      // 00f: dup
      // 010: bipush 0
      // 011: aload 0
      // 012: getfield f3x.dt7 I
      // 015: bipush 2
      // 016: idiv
      // 017: bipush 4
      // 018: iadd
      // 019: aload 0
      // 01a: getfield f3x.o1e I
      // 01d: bipush 28
      // 01f: isub
      // 020: sipush 150
      // 023: bipush 20
      // 025: sipush 30283
      // 028: ldc2_w 4589862518536618911
      // 02b: lload 1
      // 02c: lxor
      // 02d: invokedynamic v (IJ)Ljava/lang/String; bsm=f3x.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 032: nop
      // 033: bipush 0
      // 034: anewarray 65
      // 037: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 03a: invokespecial gt4.<init> (IIIIILjava/lang/String;)V
      // 03d: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 042: pop
      // 043: aload 0
      // 044: getfield f3x.khf Ljava/util/List;
      // 047: new gt4
      // 04a: dup
      // 04b: bipush 1
      // 04c: aload 0
      // 04d: getfield f3x.dt7 I
      // 050: bipush 2
      // 051: idiv
      // 052: sipush 160
      // 055: isub
      // 056: aload 0
      // 057: getfield f3x.o1e I
      // 05a: bipush 52
      // 05c: isub
      // 05d: bipush 80
      // 05f: bipush 20
      // 061: sipush 25918
      // 064: ldc2_w 2260925142009860329
      // 067: lload 1
      // 068: lxor
      // 069: invokedynamic v (IJ)Ljava/lang/String; bsm=f3x.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06e: nop
      // 06f: bipush 0
      // 070: anewarray 65
      // 073: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 076: invokespecial gt4.<init> (IIIIILjava/lang/String;)V
      // 079: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 07e: pop
      // 07f: aload 0
      // 080: getfield f3x.khf Ljava/util/List;
      // 083: new gt4
      // 086: dup
      // 087: bipush 2
      // 088: aload 0
      // 089: getfield f3x.dt7 I
      // 08c: bipush 2
      // 08d: idiv
      // 08e: bipush 80
      // 090: isub
      // 091: aload 0
      // 092: getfield f3x.o1e I
      // 095: bipush 52
      // 097: isub
      // 098: bipush 80
      // 09a: bipush 20
      // 09c: sipush 10798
      // 09f: ldc2_w 4300705474215518207
      // 0a2: lload 1
      // 0a3: lxor
      // 0a4: invokedynamic v (IJ)Ljava/lang/String; bsm=f3x.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a9: nop
      // 0aa: bipush 0
      // 0ab: anewarray 65
      // 0ae: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 0b1: invokespecial gt4.<init> (IIIIILjava/lang/String;)V
      // 0b4: dup
      // 0b5: astore 4
      // 0b7: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0bc: pop
      // 0bd: aload 0
      // 0be: getfield f3x.khf Ljava/util/List;
      // 0c1: new gt4
      // 0c4: dup
      // 0c5: bipush 3
      // 0c6: aload 0
      // 0c7: getfield f3x.dt7 I
      // 0ca: bipush 2
      // 0cb: idiv
      // 0cc: aload 0
      // 0cd: getfield f3x.o1e I
      // 0d0: bipush 52
      // 0d2: isub
      // 0d3: bipush 80
      // 0d5: bipush 20
      // 0d7: sipush 11403
      // 0da: ldc2_w 3453242887536220509
      // 0dd: lload 1
      // 0de: lxor
      // 0df: invokedynamic v (IJ)Ljava/lang/String; bsm=f3x.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4: nop
      // 0e5: bipush 0
      // 0e6: anewarray 65
      // 0e9: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 0ec: invokespecial gt4.<init> (IIIIILjava/lang/String;)V
      // 0ef: dup
      // 0f0: astore 5
      // 0f2: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0f7: pop
      // 0f8: invokestatic t9d.c ()I
      // 0fb: aload 0
      // 0fc: getfield f3x.khf Ljava/util/List;
      // 0ff: new gt4
      // 102: dup
      // 103: bipush 4
      // 104: aload 0
      // 105: getfield f3x.dt7 I
      // 108: bipush 2
      // 109: idiv
      // 10a: bipush 80
      // 10c: iadd
      // 10d: aload 0
      // 10e: getfield f3x.o1e I
      // 111: bipush 52
      // 113: isub
      // 114: bipush 80
      // 116: bipush 20
      // 118: sipush 6735
      // 11b: ldc2_w 2563198646744461215
      // 11e: lload 1
      // 11f: lxor
      // 120: invokedynamic v (IJ)Ljava/lang/String; bsm=f3x.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 125: nop
      // 126: bipush 0
      // 127: anewarray 65
      // 12a: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 12d: invokespecial gt4.<init> (IIIIILjava/lang/String;)V
      // 130: dup
      // 131: astore 6
      // 133: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 138: pop
      // 139: istore 3
      // 13a: aload 0
      // 13b: getfield f3x.rg7 Lf3x$uzf;
      // 13e: invokevirtual f3x$uzf.getSize ()I
      // 141: iload 3
      // 142: ifne 163
      // 145: ifne 15c
      // 148: goto 14f
      // 14b: invokestatic f3x.a (Loov;)Loov;
      // 14e: athrow
      // 14f: aload 4
      // 151: bipush 0
      // 152: putfield gt4.c9a Z
      // 155: goto 15c
      // 158: invokestatic f3x.a (Loov;)Loov;
      // 15b: athrow
      // 15c: aload 0
      // 15d: getfield f3x._te Lf3x$_t2;
      // 160: invokevirtual f3x$_t2.getSize ()I
      // 163: iload 3
      // 164: ifne 185
      // 167: ifne 17e
      // 16a: goto 171
      // 16d: invokestatic f3x.a (Loov;)Loov;
      // 170: athrow
      // 171: aload 5
      // 173: bipush 0
      // 174: putfield gt4.c9a Z
      // 177: goto 17e
      // 17a: invokestatic f3x.a (Loov;)Loov;
      // 17d: athrow
      // 17e: aload 0
      // 17f: getfield f3x.l7w Lf3x$i86;
      // 182: invokevirtual f3x$i86.getSize ()I
      // 185: ifne 195
      // 188: aload 6
      // 18a: bipush 0
      // 18b: putfield gt4.c9a Z
      // 18e: goto 195
      // 191: invokestatic f3x.a (Loov;)Loov;
      // 194: athrow
      // 195: return
   }

   @Override
   public void actionPerformed(gt4 param1) {
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
      // 05: getfield gt4.c9a Z
      // 08: iload 2
      // 09: ifeq 21
      // 0c: ifeq fd
      // 0f: goto 16
      // 12: invokestatic f3x.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: getfield gt4._me I
      // 1a: goto 21
      // 1d: invokestatic f3x.a (Loov;)Loov;
      // 20: athrow
      // 21: iload 2
      // 22: ifeq 50
      // 25: ifne 45
      // 28: goto 2f
      // 2b: invokestatic f3x.a (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 0
      // 30: getfield f3x.f41 Lc05;
      // 33: aload 0
      // 34: getfield f3x.gpj Lgbe;
      // 37: invokevirtual c05.z2i (Lgbe;)V
      // 3a: iload 2
      // 3b: ifne fd
      // 3e: goto 45
      // 41: invokestatic f3x.a (Loov;)Loov;
      // 44: athrow
      // 45: aload 1
      // 46: getfield gt4._me I
      // 49: goto 50
      // 4c: invokestatic f3x.a (Loov;)Loov;
      // 4f: athrow
      // 50: bipush 1
      // 51: iload 2
      // 52: ifeq 7e
      // 55: if_icmpne 72
      // 58: goto 5f
      // 5b: invokestatic f3x.a (Loov;)Loov;
      // 5e: athrow
      // 5f: aload 0
      // 60: aload 0
      // 61: getfield f3x.i9v Lf3x$mti;
      // 64: putfield f3x._3r Led7;
      // 67: iload 2
      // 68: ifne fd
      // 6b: goto 72
      // 6e: invokestatic f3x.a (Loov;)Loov;
      // 71: athrow
      // 72: aload 1
      // 73: getfield gt4._me I
      // 76: bipush 3
      // 77: goto 7e
      // 7a: invokestatic f3x.a (Loov;)Loov;
      // 7d: athrow
      // 7e: iload 2
      // 7f: ifeq ab
      // 82: if_icmpne 9f
      // 85: goto 8c
      // 88: invokestatic f3x.a (Loov;)Loov;
      // 8b: athrow
      // 8c: aload 0
      // 8d: aload 0
      // 8e: getfield f3x._te Lf3x$_t2;
      // 91: putfield f3x._3r Led7;
      // 94: iload 2
      // 95: ifne fd
      // 98: goto 9f
      // 9b: invokestatic f3x.a (Loov;)Loov;
      // 9e: athrow
      // 9f: aload 1
      // a0: getfield gt4._me I
      // a3: bipush 2
      // a4: goto ab
      // a7: invokestatic f3x.a (Loov;)Loov;
      // aa: athrow
      // ab: iload 2
      // ac: ifeq d8
      // af: if_icmpne cc
      // b2: goto b9
      // b5: invokestatic f3x.a (Loov;)Loov;
      // b8: athrow
      // b9: aload 0
      // ba: aload 0
      // bb: getfield f3x.rg7 Lf3x$uzf;
      // be: putfield f3x._3r Led7;
      // c1: iload 2
      // c2: ifne fd
      // c5: goto cc
      // c8: invokestatic f3x.a (Loov;)Loov;
      // cb: athrow
      // cc: aload 1
      // cd: getfield gt4._me I
      // d0: bipush 4
      // d1: goto d8
      // d4: invokestatic f3x.a (Loov;)Loov;
      // d7: athrow
      // d8: if_icmpne ee
      // db: aload 0
      // dc: aload 0
      // dd: getfield f3x.l7w Lf3x$i86;
      // e0: putfield f3x._3r Led7;
      // e3: iload 2
      // e4: ifne fd
      // e7: goto ee
      // ea: invokestatic f3x.a (Loov;)Loov;
      // ed: athrow
      // ee: aload 0
      // ef: getfield f3x._3r Led7;
      // f2: aload 1
      // f3: invokevirtual ed7.ncl (Lgt4;)V
      // f6: goto fd
      // f9: invokestatic f3x.a (Loov;)Loov;
      // fc: athrow
      // fd: return
   }

   @Override
   public void drawScreen(int param1, int param2, float param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic f3x.a J
      // 03: ldc2_w 140253561178261
      // 06: lxor
      // 07: lstore 4
      // 09: invokestatic t9d.b ()I
      // 0c: istore 6
      // 0e: aload 0
      // 0f: iload 6
      // 11: ifeq ba
      // 14: getfield f3x.lfx Z
      // 17: ifeq 91
      // 1a: goto 21
      // 1d: invokestatic f3x.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 0
      // 22: invokevirtual f3x.xmz ()V
      // 25: aload 0
      // 26: aload 0
      // 27: getfield f3x.fex Lowt;
      // 2a: sipush 16640
      // 2d: ldc2_w 1058850200187207667
      // 30: lload 4
      // 32: lxor
      // 33: invokedynamic v (IJ)Ljava/lang/String; bsm=f3x.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38: nop
      // 39: bipush 0
      // 3a: anewarray 65
      // 3d: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 40: aload 0
      // 41: getfield f3x.dt7 I
      // 44: bipush 2
      // 45: idiv
      // 46: aload 0
      // 47: getfield f3x.o1e I
      // 4a: bipush 2
      // 4b: idiv
      // 4c: ldc 16777215
      // 4e: nop
      // 4f: invokevirtual f3x.poi (Lowt;Ljava/lang/String;III)V
      // 52: aload 0
      // 53: aload 0
      // 54: getfield f3x.fex Lowt;
      // 57: getstatic f3x.x8o [Ljava/lang/String;
      // 5a: invokestatic c05.qgs ()J
      // 5d: ldc2_w 150
      // 60: ldiv
      // 61: getstatic f3x.x8o [Ljava/lang/String;
      // 64: arraylength
      // 65: i2l
      // 66: lrem
      // 67: l2i
      // 68: aaload
      // 69: aload 0
      // 6a: getfield f3x.dt7 I
      // 6d: bipush 2
      // 6e: idiv
      // 6f: aload 0
      // 70: getfield f3x.o1e I
      // 73: bipush 2
      // 74: idiv
      // 75: aload 0
      // 76: getfield f3x.fex Lowt;
      // 79: getfield owt.rr7 I
      // 7c: bipush 2
      // 7d: imul
      // 7e: iadd
      // 7f: ldc 16777215
      // 81: nop
      // 82: invokevirtual f3x.poi (Lowt;Ljava/lang/String;III)V
      // 85: iload 6
      // 87: ifne c0
      // 8a: goto 91
      // 8d: invokestatic f3x.a (Loov;)Loov;
      // 90: athrow
      // 91: aload 0
      // 92: getfield f3x._3r Led7;
      // 95: iload 1
      // 96: iload 2
      // 97: fload 3
      // 98: invokevirtual ed7.j46 (IIF)V
      // 9b: aload 0
      // 9c: aload 0
      // 9d: getfield f3x.fex Lowt;
      // a0: aload 0
      // a1: getfield f3x.g0x Ljava/lang/String;
      // a4: aload 0
      // a5: getfield f3x.dt7 I
      // a8: bipush 2
      // a9: idiv
      // aa: bipush 20
      // ac: ldc 16777215
      // ae: nop
      // af: invokevirtual f3x.poi (Lowt;Ljava/lang/String;III)V
      // b2: aload 0
      // b3: goto ba
      // b6: invokestatic f3x.a (Loov;)Loov;
      // b9: athrow
      // ba: iload 1
      // bb: iload 2
      // bc: fload 3
      // bd: invokespecial gbe.drawScreen (IIF)V
      // c0: return
   }

   @Override
   public void fyj() {
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
      // 05: iload 1
      // 06: ifne 2e
      // 09: getfield f3x.lfx Z
      // 0c: ifeq 32
      // 0f: goto 16
      // 12: invokestatic f3x.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: invokevirtual f3x.ceu ()V
      // 1a: aload 0
      // 1b: invokevirtual f3x.xox ()V
      // 1e: aload 0
      // 1f: aload 0
      // 20: getfield f3x.i9v Lf3x$mti;
      // 23: putfield f3x._3r Led7;
      // 26: aload 0
      // 27: goto 2e
      // 2a: invokestatic f3x.a (Loov;)Loov;
      // 2d: athrow
      // 2e: bipush 0
      // 2f: putfield f3x.lfx Z
      // 32: return
   }

   @Override
   public boolean a99() {
      int var1 = t9d.b();

      try {
         if (var1 == 0) {
            return this.lfx;
         }

         if (!this.lfx) {
            return true;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return false;
   }

   private void g38(int var1, int var2, u7m var3) {
      this.dlt(var1 + 1, var2 + 1);
      hzu.ixc();
      qpm.gdb();
      this.vs5.s3g(new erg(var3, 1, 0), (float)(var1 + 2), (float)(var2 + 2));
      qpm.cng();
      hzu.eiq();
   }

   private void dlt(int var1, int var2) {
      this.afb(var1, var2, 0, 0);
   }

   private void afb(int var1, int var2, int var3, int var4) {
      hzu.wn0(1.0F, 1.0F, 1.0F, 1.0F);
      this.f41.l22().anl(p24);
      float var5 = 0.0078125F;
      float var6 = 0.0078125F;
      byte var7 = 18;
      byte var8 = 18;
      jom var9 = jom.yut();
      q3g var10 = var9.zuq();
      var10.ezr(7, gnl._r5);
      var10.g5o((double)(var1 + 0), (double)(var2 + 18), (double)this.o3s)
         .h0a((double)((float)(var3 + 0) * 0.0078125F), (double)((float)(var4 + 18) * 0.0078125F))
         .pzw();
      var10.g5o((double)(var1 + 18), (double)(var2 + 18), (double)this.o3s)
         .h0a((double)((float)(var3 + 18) * 0.0078125F), (double)((float)(var4 + 18) * 0.0078125F))
         .pzw();
      var10.g5o((double)(var1 + 18), (double)(var2 + 0), (double)this.o3s)
         .h0a((double)((float)(var3 + 18) * 0.0078125F), (double)((float)(var4 + 0) * 0.0078125F))
         .pzw();
      var10.g5o((double)(var1 + 0), (double)(var2 + 0), (double)this.o3s)
         .h0a((double)((float)(var3 + 0) * 0.0078125F), (double)((float)(var4 + 0) * 0.0078125F))
         .pzw();
      var9.q7g();
   }

   public static void _e5(f3x var0, int var1, int var2, int var3, int var4) {
      var0.afb(var1, var2, var3, var4);
   }

   public static ik0 h5z(f3x var0) {
      return var0.xjz;
   }

   public static owt xj2(f3x var0) {
      return var0.fex;
   }

   public static owt qpj(f3x var0) {
      return var0.fex;
   }

   public static owt k8c(f3x var0) {
      return var0.fex;
   }

   public static owt _bu(f3x var0) {
      return var0.fex;
   }

   public static owt p8s(f3x var0) {
      return var0.fex;
   }

   public static owt z4q(f3x var0) {
      return var0.fex;
   }

   public static owt pl3(f3x var0) {
      return var0.fex;
   }

   public static owt esu(f3x var0) {
      return var0.fex;
   }

   public static void y8f(f3x var0, int var1, int var2, u7m var3) {
      var0.g38(var1, var2, var3);
   }

   public static owt _vs(f3x var0) {
      return var0.fex;
   }

   public static owt lp6(f3x var0) {
      return var0.fex;
   }

   public static owt xsr(f3x var0) {
      return var0.fex;
   }

   public static owt uw2(f3x var0) {
      return var0.fex;
   }

   public static owt bu9(f3x var0) {
      return var0.fex;
   }

   public static owt z2i(f3x var0) {
      return var0.fex;
   }

   public static owt nqw(f3x var0) {
      return var0.fex;
   }

   public static owt cq3(f3x var0) {
      return var0.fex;
   }

   public static owt gou(f3x var0) {
      return var0.fex;
   }

   public static owt z6d(f3x var0) {
      return var0.fex;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(980225801699037113L, -1078548721628626908L, MethodHandles.lookup().lookupClass()).a(19141886136625L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 49375487522650L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[8];
      int var7 = 0;
      String var6 = "µ\u009c^¨\u001e\u000eÎÀådîðÿû\u0080Ôð¬-¨\u001a-èZ\u0087ÑTb\u0096â\u009cÐÕLZð\u0010w¡F éìÚ+\u001bJ\u0000¼\u0088ôs$d\u0094ÉOÙ«·;pËß`énÂvB|<í >+¿\u009b#XG.\u008c\n¨\u0016{Ày\u0095Þå\u0093S\u0018\u009d\u001b\u0089\u0014\u0090¨iú\bøô8N\u001cÃuý¤\u0002ÉE·\bªïRKÂT\u000e¿]\u001eý¶®ë\u0016\u001b=\u0004*\u0084¼®\u0013à\u0092©\u000fK%¹e\u0083\u0005¢\u009a\u009cg\u0093ß\u0015ÈvGm\u00ad Í\u0096IÒè\u0006/£H\u0012K+\u0087æ\u00ad\u00adE÷úTøynHD»%\\l}¤H\u0018\u00970Èd\u0098+«M±\u0087\u001a\u0017Z\u0016\u0089IÓoþÔÑ_+\u0090";
      int var8 = "µ\u009c^¨\u001e\u000eÎÀådîðÿû\u0080Ôð¬-¨\u001a-èZ\u0087ÑTb\u0096â\u009cÐÕLZð\u0010w¡F éìÚ+\u001bJ\u0000¼\u0088ôs$d\u0094ÉOÙ«·;pËß`énÂvB|<í >+¿\u009b#XG.\u008c\n¨\u0016{Ày\u0095Þå\u0093S\u0018\u009d\u001b\u0089\u0014\u0090¨iú\bøô8N\u001cÃuý¤\u0002ÉE·\bªïRKÂT\u000e¿]\u001eý¶®ë\u0016\u001b=\u0004*\u0084¼®\u0013à\u0092©\u000fK%¹e\u0083\u0005¢\u009a\u009cg\u0093ß\u0015ÈvGm\u00ad Í\u0096IÒè\u0006/£H\u0012K+\u0087æ\u00ad\u00adE÷úTøynHD»%\\l}¤H\u0018\u00970Èd\u0098+«M±\u0087\u001a\u0017Z\u0016\u0089IÓoþÔÑ_+\u0090"
         .length();
      char var5 = '(';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = d(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     b = var9;
                     g = new String[8];
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

                  var6 = "\u00adL\u008cEhù\u008c}7B³îÆÌ¬æ_¢¶[rãÖQáÃ\u0084PÙámzê\u0082\u0087{¢é7w(\u008f%ÙÌ«a6\u009d{¶ª^\u0016¶h\u00917\u009c\u0081OâÊ\u007fwb\u001aÕ\u0010ìè´íGp\u0002Fç\rO\u009e";
                  var8 = "\u00adL\u008cEhù\u008c}7B³îÆÌ¬æ_¢¶[rãÖQáÃ\u0084PÙámzê\u0082\u0087{¢é7w(\u008f%ÙÌ«a6\u009d{¶ª^\u0016¶h\u00917\u009c\u0081OâÊ\u007fwb\u001aÕ\u0010ìè´íGp\u0002Fç\rO\u009e"
                     .length();
                  var5 = '(';
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

   private static String d(byte[] var0) {
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 7874;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("f3x", var10);
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
         g[var5] = d(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("f3x" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
