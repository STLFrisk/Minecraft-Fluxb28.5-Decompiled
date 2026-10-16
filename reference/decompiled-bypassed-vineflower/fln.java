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

public abstract class fln extends uk2 {
   private _89 amx;
   public Map b8o = Maps.newHashMap();
   private static final long a;
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public abstract String tqd();

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   @Override
   public final void bjr(t9d var1, int var2, int var3, int var4, int var5, lno var6) {
      long var7 = a ^ 68006120964355L;
      int var9 = t9d.c();

      Throwable var19;
      label47: {
         int var21;
         int var10002;
         label46: {
            label52: {
               try {
                  this.it0(var1);
                  var10000 = this.b8o.containsKey(h2f.fcz(var2, var3));
                  if (var9 != 0) {
                     break label52;
                  }

                  if (var10000) {
                     return;
                  }
               } catch (Throwable var17) {
                  throw a(var17);
               }

               this.a0f.nextInt();

               try {
                  var20 = this;
                  var21 = var2;
                  var10002 = var3;
                  if (var9 != 0) {
                     break label46;
                  }

                  var10000 = this.ary(var2, var3);
               } catch (Throwable var16) {
                  var19 = var16;
                  boolean var10001 = false;
                  break label47;
               }
            }

            try {
               try {
                  if (!var10000) {
                     return;
                  }

                  var20 = this;
                  var21 = var2;
                  var10002 = var3;
               } catch (Throwable var13) {
                  throw a(var13);
               }
            } catch (Throwable var15) {
               var19 = var15;
               boolean var22 = false;
               break label47;
            }
         }

         try {
            ijb var18 = var20.sph(var21, var10002);
            this.b8o.put(h2f.fcz(var2, var3), var18);
            this.eha(var2, var3, var18);
            return;
         } catch (Throwable var14) {
            var19 = var14;
            boolean var23 = false;
         }
      }

      Throwable var10 = var19;
      e1i var11 = e1i.cor(var10, a<"u">(16122, 2753680489090308974L ^ var7));
      wsc var12 = var11.i_r(a<"u">(31104, 2862128655281429532L ^ var7));
      var12.h1o(a<"u">(30448, 5911712793526014829L ^ var7), new fln$1(this, var2, var3));
      var12._0p(a<"u">(9090, 9146224573480257044L ^ var7), String.format(a<"u">(23314, 1524772967751270029L ^ var7), var2, var3));
      var12.h1o(a<"u">(26562, 3836694291885228624L ^ var7), new fln$2(this, var2, var3));
      var12.h1o(a<"u">(16988, 6398478156092745675L ^ var7), new fln$3(this));
      throw new oov(var11);
   }

   public boolean vd1(t9d param1, Random param2, h2f param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: invokespecial fln.it0 (Lt9d;)V
      // 05: invokestatic t9d.c ()I
      // 08: aload 3
      // 09: getfield h2f.jnd I
      // 0c: bipush 4
      // 0d: ishl
      // 0e: bipush 8
      // 10: iadd
      // 11: istore 5
      // 13: aload 3
      // 14: getfield h2f.km5 I
      // 17: bipush 4
      // 18: ishl
      // 19: bipush 8
      // 1b: iadd
      // 1c: istore 6
      // 1e: bipush 0
      // 1f: istore 7
      // 21: aload 0
      // 22: getfield fln.b8o Ljava/util/Map;
      // 25: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // 2a: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 2f: astore 8
      // 31: istore 4
      // 33: aload 8
      // 35: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3a: ifeq f2
      // 3d: aload 8
      // 3f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 44: checkcast ijb
      // 47: astore 9
      // 49: aload 9
      // 4b: invokevirtual ijb.z1p ()Z
      // 4e: iload 4
      // 50: ifne f4
      // 53: iload 4
      // 55: ifne 76
      // 58: goto 5f
      // 5b: invokestatic fln.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5e: athrow
      // 5f: ifeq ed
      // 62: goto 69
      // 65: invokestatic fln.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 68: athrow
      // 69: aload 9
      // 6b: aload 3
      // 6c: invokevirtual ijb.vud (Lh2f;)Z
      // 6f: goto 76
      // 72: invokestatic fln.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 75: athrow
      // 76: iload 4
      // 78: ifne a2
      // 7b: ifeq ed
      // 7e: goto 85
      // 81: invokestatic fln.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 84: athrow
      // 85: aload 9
      // 87: invokevirtual ijb.rbg ()Lyve;
      // 8a: iload 5
      // 8c: iload 6
      // 8e: iload 5
      // 90: bipush 15
      // 92: iadd
      // 93: iload 6
      // 95: bipush 15
      // 97: iadd
      // 98: invokevirtual yve._dk (IIII)Z
      // 9b: goto a2
      // 9e: invokestatic fln.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a1: athrow
      // a2: iload 4
      // a4: ifne db
      // a7: ifeq ed
      // aa: goto b1
      // ad: invokestatic fln.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b0: athrow
      // b1: aload 9
      // b3: aload 1
      // b4: aload 2
      // b5: new yve
      // b8: dup
      // b9: iload 5
      // bb: iload 6
      // bd: iload 5
      // bf: bipush 15
      // c1: iadd
      // c2: iload 6
      // c4: bipush 15
      // c6: iadd
      // c7: invokespecial yve.<init> (IIII)V
      // ca: invokevirtual ijb.lbp (Lt9d;Ljava/util/Random;Lyve;)V
      // cd: aload 9
      // cf: aload 3
      // d0: invokevirtual ijb.t4h (Lh2f;)V
      // d3: bipush 1
      // d4: goto db
      // d7: invokestatic fln.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // da: athrow
      // db: istore 7
      // dd: aload 0
      // de: aload 9
      // e0: invokevirtual ijb.vdh ()I
      // e3: aload 9
      // e5: invokevirtual ijb.x65 ()I
      // e8: aload 9
      // ea: invokespecial fln.eha (IILijb;)V
      // ed: iload 4
      // ef: ifeq 33
      // f2: iload 7
      // f4: ireturn
   }

   public boolean vy1(mew var1) {
      try {
         this.it0(this.pr9);
         if (this.aki(var1) != null) {
            return true;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return false;
   }

   public ijb aki(mew param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield fln.b8o Ljava/util/Map;
      // 08: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // 0d: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 12: astore 3
      // 13: aload 3
      // 14: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 19: ifeq 99
      // 1c: aload 3
      // 1d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 22: checkcast ijb
      // 25: astore 4
      // 27: aload 4
      // 29: invokevirtual ijb.z1p ()Z
      // 2c: iload 2
      // 2d: ifeq 55
      // 30: ifeq 95
      // 33: goto 3a
      // 36: invokestatic fln.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39: athrow
      // 3a: aload 4
      // 3c: iload 2
      // 3d: ifeq 5a
      // 40: goto 47
      // 43: invokestatic fln.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 46: athrow
      // 47: invokevirtual ijb.rbg ()Lyve;
      // 4a: aload 1
      // 4b: invokevirtual yve.vwy (Lwgo;)Z
      // 4e: goto 55
      // 51: invokestatic fln.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 54: athrow
      // 55: ifeq 95
      // 58: aload 4
      // 5a: invokevirtual ijb.fd9 ()Ljava/util/LinkedList;
      // 5d: invokevirtual java/util/LinkedList.iterator ()Ljava/util/Iterator;
      // 60: astore 5
      // 62: aload 5
      // 64: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 69: ifne 6f
      // 6c: goto 13
      // 6f: aload 5
      // 71: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 76: checkcast xi1
      // 79: astore 6
      // 7b: aload 6
      // 7d: invokevirtual xi1.q1q ()Lyve;
      // 80: aload 1
      // 81: invokevirtual yve.vwy (Lwgo;)Z
      // 84: ifeq 8e
      // 87: goto 92
      // 8a: invokestatic fln.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8d: athrow
      // 8e: iload 2
      // 8f: ifne 62
      // 92: aload 4
      // 94: areturn
      // 95: iload 2
      // 96: ifne 13
      // 99: aconst_null
      // 9a: areturn
   }

   public boolean g3m(t9d param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: invokespecial fln.it0 (Lt9d;)V
      // 05: invokestatic t9d.c ()I
      // 08: aload 0
      // 09: getfield fln.b8o Ljava/util/Map;
      // 0c: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // 11: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 16: astore 4
      // 18: istore 3
      // 19: aload 4
      // 1b: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 20: ifeq 71
      // 23: aload 4
      // 25: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2a: checkcast ijb
      // 2d: astore 5
      // 2f: aload 5
      // 31: invokevirtual ijb.z1p ()Z
      // 34: iload 3
      // 35: ifne 72
      // 38: iload 3
      // 39: ifne 5d
      // 3c: goto 43
      // 3f: invokestatic fln.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 42: athrow
      // 43: ifeq 6d
      // 46: goto 4d
      // 49: invokestatic fln.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4c: athrow
      // 4d: aload 5
      // 4f: invokevirtual ijb.rbg ()Lyve;
      // 52: aload 2
      // 53: invokevirtual yve.vwy (Lwgo;)Z
      // 56: goto 5d
      // 59: invokestatic fln.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5c: athrow
      // 5d: iload 3
      // 5e: ifne 6c
      // 61: ifeq 6d
      // 64: goto 6b
      // 67: invokestatic fln.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6a: athrow
      // 6b: bipush 1
      // 6c: ireturn
      // 6d: iload 3
      // 6e: ifeq 19
      // 71: bipush 0
      // 72: ireturn
   }

   public mew p3b(t9d param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: aload 1
      // 002: putfield fln.pr9 Lt9d;
      // 005: invokestatic t9d.b ()I
      // 008: aload 0
      // 009: aload 1
      // 00a: invokespecial fln.it0 (Lt9d;)V
      // 00d: aload 0
      // 00e: getfield fln.a0f Ljava/util/Random;
      // 011: aload 1
      // 012: invokevirtual t9d.x2p ()J
      // 015: invokevirtual java/util/Random.setSeed (J)V
      // 018: aload 0
      // 019: getfield fln.a0f Ljava/util/Random;
      // 01c: invokevirtual java/util/Random.nextLong ()J
      // 01f: lstore 4
      // 021: aload 0
      // 022: getfield fln.a0f Ljava/util/Random;
      // 025: invokevirtual java/util/Random.nextLong ()J
      // 028: lstore 6
      // 02a: aload 2
      // 02b: invokevirtual mew.getX ()I
      // 02e: bipush 4
      // 02f: ishr
      // 030: i2l
      // 031: lload 4
      // 033: lmul
      // 034: lstore 8
      // 036: istore 3
      // 037: aload 2
      // 038: invokevirtual mew.getZ ()I
      // 03b: bipush 4
      // 03c: ishr
      // 03d: i2l
      // 03e: lload 6
      // 040: lmul
      // 041: lstore 10
      // 043: aload 0
      // 044: getfield fln.a0f Ljava/util/Random;
      // 047: lload 8
      // 049: lload 10
      // 04b: lxor
      // 04c: aload 1
      // 04d: invokevirtual t9d.x2p ()J
      // 050: lxor
      // 051: invokevirtual java/util/Random.setSeed (J)V
      // 054: aload 0
      // 055: aload 1
      // 056: aload 2
      // 057: invokevirtual mew.getX ()I
      // 05a: bipush 4
      // 05b: ishr
      // 05c: aload 2
      // 05d: invokevirtual mew.getZ ()I
      // 060: bipush 4
      // 061: ishr
      // 062: bipush 0
      // 063: bipush 0
      // 064: aconst_null
      // 065: checkcast lno
      // 068: invokevirtual fln.bjr (Lt9d;IIIILlno;)V
      // 06b: ldc2_w 1.7976931348623157E308
      // 06e: dstore 12
      // 070: aconst_null
      // 071: astore 14
      // 073: aload 0
      // 074: getfield fln.b8o Ljava/util/Map;
      // 077: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // 07c: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 081: astore 15
      // 083: aload 15
      // 085: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 08a: ifeq 101
      // 08d: aload 15
      // 08f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 094: checkcast ijb
      // 097: astore 16
      // 099: iload 3
      // 09a: ifeq 114
      // 09d: aload 16
      // 09f: iload 3
      // 0a0: ifeq 0c7
      // 0a3: goto 0aa
      // 0a6: invokestatic fln.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a9: athrow
      // 0aa: invokevirtual ijb.z1p ()Z
      // 0ad: ifeq 0fd
      // 0b0: goto 0b7
      // 0b3: invokestatic fln.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b6: athrow
      // 0b7: aload 16
      // 0b9: invokevirtual ijb.fd9 ()Ljava/util/LinkedList;
      // 0bc: bipush 0
      // 0bd: invokevirtual java/util/LinkedList.get (I)Ljava/lang/Object;
      // 0c0: goto 0c7
      // 0c3: invokestatic fln.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c6: athrow
      // 0c7: checkcast xi1
      // 0ca: astore 17
      // 0cc: aload 17
      // 0ce: invokevirtual xi1.xqt ()Lmew;
      // 0d1: astore 18
      // 0d3: aload 18
      // 0d5: aload 2
      // 0d6: invokevirtual mew.t0u (Lwgo;)D
      // 0d9: dstore 19
      // 0db: dload 19
      // 0dd: iload 3
      // 0de: ifeq 0f7
      // 0e1: dload 12
      // 0e3: dcmpg
      // 0e4: ifge 0fd
      // 0e7: goto 0ee
      // 0ea: invokestatic fln.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ed: athrow
      // 0ee: dload 19
      // 0f0: goto 0f7
      // 0f3: invokestatic fln.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f6: athrow
      // 0f7: dstore 12
      // 0f9: aload 18
      // 0fb: astore 14
      // 0fd: iload 3
      // 0fe: ifne 083
      // 101: aload 14
      // 103: iload 3
      // 104: ifeq 113
      // 107: ifnull 114
      // 10a: goto 111
      // 10d: invokestatic fln.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 110: athrow
      // 111: aload 14
      // 113: areturn
      // 114: aload 0
      // 115: invokevirtual fln.f_m ()Ljava/util/List;
      // 118: astore 15
      // 11a: aload 15
      // 11c: ifnull 176
      // 11f: aconst_null
      // 120: astore 16
      // 122: aload 15
      // 124: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 129: astore 17
      // 12b: aload 17
      // 12d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 132: ifeq 173
      // 135: aload 17
      // 137: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 13c: checkcast mew
      // 13f: astore 18
      // 141: aload 18
      // 143: iload 3
      // 144: ifeq 175
      // 147: aload 2
      // 148: invokevirtual mew.t0u (Lwgo;)D
      // 14b: dstore 19
      // 14d: dload 19
      // 14f: iload 3
      // 150: ifeq 169
      // 153: dload 12
      // 155: dcmpg
      // 156: ifge 16f
      // 159: goto 160
      // 15c: invokestatic fln.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15f: athrow
      // 160: dload 19
      // 162: goto 169
      // 165: invokestatic fln.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 168: athrow
      // 169: dstore 12
      // 16b: aload 18
      // 16d: astore 16
      // 16f: iload 3
      // 170: ifne 12b
      // 173: aload 16
      // 175: areturn
      // 176: aconst_null
      // 177: areturn
   }

   public List f_m() {
      return null;
   }

   private void it0(t9d param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic fln.a J
      // 003: ldc2_w 25380518031588
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic t9d.b ()I
      // 00b: istore 4
      // 00d: aload 0
      // 00e: getfield fln.amx L_89;
      // 011: iload 4
      // 013: ifeq 03d
      // 016: ifnonnull 189
      // 019: goto 020
      // 01c: invokestatic fln.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01f: athrow
      // 020: aload 0
      // 021: aload 1
      // 022: ldc _89
      // 024: nop
      // 025: aload 0
      // 026: invokevirtual fln.tqd ()Ljava/lang/String;
      // 029: invokevirtual t9d.hyf (Ljava/lang/Class;Ljava/lang/String;)Lwob;
      // 02c: checkcast _89
      // 02f: putfield fln.amx L_89;
      // 032: aload 0
      // 033: getfield fln.amx L_89;
      // 036: goto 03d
      // 039: invokestatic fln.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03c: athrow
      // 03d: iload 4
      // 03f: ifeq 07e
      // 042: ifnonnull 073
      // 045: goto 04c
      // 048: invokestatic fln.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04b: athrow
      // 04c: aload 0
      // 04d: new _89
      // 050: dup
      // 051: aload 0
      // 052: invokevirtual fln.tqd ()Ljava/lang/String;
      // 055: invokespecial _89.<init> (Ljava/lang/String;)V
      // 058: putfield fln.amx L_89;
      // 05b: aload 1
      // 05c: aload 0
      // 05d: invokevirtual fln.tqd ()Ljava/lang/String;
      // 060: aload 0
      // 061: getfield fln.amx L_89;
      // 064: invokevirtual t9d.m5k (Ljava/lang/String;Lwob;)V
      // 067: iload 4
      // 069: ifne 189
      // 06c: goto 073
      // 06f: invokestatic fln.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 072: athrow
      // 073: aload 0
      // 074: getfield fln.amx L_89;
      // 077: goto 07e
      // 07a: invokestatic fln.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07d: athrow
      // 07e: invokevirtual _89.whi ()Lbdo;
      // 081: astore 5
      // 083: aload 5
      // 085: invokevirtual bdo.bo9 ()Ljava/util/Set;
      // 088: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 08d: astore 6
      // 08f: aload 6
      // 091: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 096: ifeq 189
      // 099: aload 6
      // 09b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0a0: checkcast java/lang/String
      // 0a3: astore 7
      // 0a5: aload 5
      // 0a7: aload 7
      // 0a9: invokevirtual bdo.e2o (Ljava/lang/String;)Lgdw;
      // 0ac: astore 8
      // 0ae: aload 8
      // 0b0: iload 4
      // 0b2: ifeq 0cd
      // 0b5: invokevirtual gdw.ky0 ()B
      // 0b8: bipush 10
      // 0ba: if_icmpne 184
      // 0bd: goto 0c4
      // 0c0: invokestatic fln.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c3: athrow
      // 0c4: aload 8
      // 0c6: goto 0cd
      // 0c9: invokestatic fln.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0cc: athrow
      // 0cd: checkcast bdo
      // 0d0: astore 9
      // 0d2: aload 9
      // 0d4: sipush 23523
      // 0d7: ldc2_w 1175467474537549713
      // 0da: lload 2
      // 0db: lxor
      // 0dc: invokedynamic u (IJ)Ljava/lang/String; bsm=fln.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e1: nop
      // 0e2: invokevirtual bdo.dmw (Ljava/lang/String;)Z
      // 0e5: iload 4
      // 0e7: ifeq 10e
      // 0ea: ifeq 184
      // 0ed: goto 0f4
      // 0f0: invokestatic fln.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f3: athrow
      // 0f4: aload 9
      // 0f6: sipush 1444
      // 0f9: ldc2_w 2364009117313749458
      // 0fc: lload 2
      // 0fd: lxor
      // 0fe: invokedynamic u (IJ)Ljava/lang/String; bsm=fln.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: nop
      // 104: invokevirtual bdo.dmw (Ljava/lang/String;)Z
      // 107: goto 10e
      // 10a: invokestatic fln.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10d: athrow
      // 10e: iload 4
      // 110: ifeq 137
      // 113: ifeq 184
      // 116: goto 11d
      // 119: invokestatic fln.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11c: athrow
      // 11d: aload 9
      // 11f: sipush 24212
      // 122: ldc2_w 6078327490611284704
      // 125: lload 2
      // 126: lxor
      // 127: invokedynamic u (IJ)Ljava/lang/String; bsm=fln.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12c: nop
      // 12d: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 130: goto 137
      // 133: invokestatic fln.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 136: athrow
      // 137: istore 10
      // 139: aload 9
      // 13b: sipush 8397
      // 13e: ldc2_w 6666791779783603386
      // 141: lload 2
      // 142: lxor
      // 143: invokedynamic u (IJ)Ljava/lang/String; bsm=fln.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 148: nop
      // 149: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 14c: istore 11
      // 14e: aload 9
      // 150: aload 1
      // 151: invokestatic v8a.wch (Lbdo;Lt9d;)Lijb;
      // 154: astore 12
      // 156: aload 12
      // 158: iload 4
      // 15a: ifeq 183
      // 15d: ifnull 184
      // 160: goto 167
      // 163: invokestatic fln.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 166: athrow
      // 167: aload 0
      // 168: getfield fln.b8o Ljava/util/Map;
      // 16b: iload 10
      // 16d: iload 11
      // 16f: invokestatic h2f.fcz (II)J
      // 172: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 175: aload 12
      // 177: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 17c: goto 183
      // 17f: invokestatic fln.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 182: athrow
      // 183: pop
      // 184: iload 4
      // 186: ifne 08f
      // 189: return
   }

   private void eha(int var1, int var2, ijb var3) {
      this.amx.j2m(var3._u5(var1, var2), var1, var2);
      this.amx.hcs();
   }

   public abstract boolean ary(int var1, int var2);

   public abstract ijb sph(int var1, int var2);

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6936595122909085822L, -2091649650270019652L, MethodHandles.lookup().lookupClass()).a(162637019357951L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 71753133987617L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[11];
      int var7 = 0;
      String var6 = "?#no+Åf\u0088¹L&\u0007 VjÀ@?\u000fÂ9Æ8ÈÜ\u009c)mt\u0002²\u0097¨\u0083\u0000¥¼1´\u008a2L\u007f\u0011&³ØGÈ¹\u0092Ð\u0003º¯CùÆ>¾|+S\u000bö]øjâr\u0013\u0090³ªP½®\u0090¿I0 2\u001a,è\u001bSåY)ûôB×î§?£\u0014So°¿@eY°A\u001fGlYV\u0018=Á?\u001dÆÞ\u008bèB4\\\u0016k%mfhÌÎn\u007f3ÍH\u0010Û\"^ÍW\rqeC\u0090\u0004þþDRå\u0010\u0090ü\u0017a\u001fö\u000bA.oKqL}&Y\u0010³ò\u0005\u009e\u0092mÕËGE\u009d\u001f{¼É  \u008e\u0081F\u00129\u000b*m¾ÃCú«\u0015\u0012\u0095ö\u0019\n¦\\û¯\u0003\u000f\u001dïÕ¶ý-Ï(æ\u008fÍ\u0088\u007fÎ²±Éx\u0010·ç²\u0002\u0084\u0004u±ýN¥R\\2ÓMn\u0006\"ï\u0012¶\u0004_Z»ÜÓ¸";
      int var8 = "?#no+Åf\u0088¹L&\u0007 VjÀ@?\u000fÂ9Æ8ÈÜ\u009c)mt\u0002²\u0097¨\u0083\u0000¥¼1´\u008a2L\u007f\u0011&³ØGÈ¹\u0092Ð\u0003º¯CùÆ>¾|+S\u000bö]øjâr\u0013\u0090³ªP½®\u0090¿I0 2\u001a,è\u001bSåY)ûôB×î§?£\u0014So°¿@eY°A\u001fGlYV\u0018=Á?\u001dÆÞ\u008bèB4\\\u0016k%mfhÌÎn\u007f3ÍH\u0010Û\"^ÍW\rqeC\u0090\u0004þþDRå\u0010\u0090ü\u0017a\u001fö\u000bA.oKqL}&Y\u0010³ò\u0005\u009e\u0092mÕËGE\u009d\u001f{¼É  \u008e\u0081F\u00129\u000b*m¾ÃCú«\u0015\u0012\u0095ö\u0019\n¦\\û¯\u0003\u000f\u001dïÕ¶ý-Ï(æ\u008fÍ\u0088\u007fÎ²±Éx\u0010·ç²\u0002\u0084\u0004u±ýN¥R\\2ÓMn\u0006\"ï\u0012¶\u0004_Z»ÜÓ¸"
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
                     c = var9;
                     d = new String[11];
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

                  var6 = "5\u0001\u0015\u0090d°0Û~\u0005\u00178\u0091Èõ«Ü\u009cÖ»i\u0095ÉÜÝ\u0082ª\u008b«\u008c¹¾\u001còêéõ¹öí\u0010ÜæXcî\t©Ó8bµî\u0000JJ>";
                  var8 = "5\u0001\u0015\u0090d°0Û~\u0005\u00178\u0091Èõ«Ü\u009cÖ»i\u0095ÉÜÝ\u0082ª\u008b«\u008c¹¾\u001còêéõ¹öí\u0010ÜæXcî\t©Ó8bµî\u0000JJ>"
                     .length();
                  var5 = '(';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 10179;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("fln", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
         d[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("fln" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
