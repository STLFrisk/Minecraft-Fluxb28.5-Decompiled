import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Reader;
import java.io.StringReader;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rqp {
   private static final Logger omg;
   public static final Gson alp;
   private final List b2e;
   private final boolean cna;
   private final boolean ena;
   private flk vxm;
   public String pt8 = "";
   public final Map mi2;
   public rqp x3c;
   public gdz y5t;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public static rqp zkz(Reader var0) {
      return (rqp)alp.fromJson(var0, rqp.class);
   }

   public static rqp we4(String var0) {
      return zkz(new StringReader(var0));
   }

   public rqp(List var1, Map var2, boolean var3, boolean var4, flk var5) {
      this((gdz)null, var1, var2, var3, var4, var5);
   }

   public rqp(gdz var1, Map var2, boolean var3, boolean var4, flk var5) {
      this(var1, Collections.emptyList(), var2, var3, var4, var5);
   }

   private rqp(gdz var1, List var2, Map var3, boolean var4, boolean var5, flk var6) {
      this.b2e = var2;
      this.ena = var4;
      this.cna = var5;
      this.mi2 = var3;
      this.y5t = var1;
      this.vxm = var6;
   }

   public List m3y() {
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
      // 05: iload 1
      // 06: ifne 25
      // 09: invokespecial rqp.y50 ()Z
      // 0c: ifeq 24
      // 0f: goto 16
      // 12: invokestatic rqp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 15: athrow
      // 16: aload 0
      // 17: getfield rqp.x3c Lrqp;
      // 1a: invokevirtual rqp.m3y ()Ljava/util/List;
      // 1d: goto 28
      // 20: invokestatic rqp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 23: athrow
      // 24: aload 0
      // 25: getfield rqp.b2e Ljava/util/List;
      // 28: areturn
   }

   private boolean y50() {
      try {
         if (this.x3c != null) {
            return true;
         }
      } catch (rqp$czc var1) {
         throw a(var1);
      }

      return false;
   }

   public boolean yto() {
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
      // 05: iload 1
      // 06: ifeq 25
      // 09: invokespecial rqp.y50 ()Z
      // 0c: ifeq 24
      // 0f: goto 16
      // 12: invokestatic rqp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 15: athrow
      // 16: aload 0
      // 17: getfield rqp.x3c Lrqp;
      // 1a: invokevirtual rqp.yto ()Z
      // 1d: goto 28
      // 20: invokestatic rqp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 23: athrow
      // 24: aload 0
      // 25: getfield rqp.ena Z
      // 28: ireturn
   }

   public boolean r4o() {
      return this.cna;
   }

   public boolean i0z() {
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
      // 05: iload 1
      // 06: ifeq 21
      // 09: getfield rqp.y5t Lgdz;
      // 0c: ifnull 4b
      // 0f: goto 16
      // 12: invokestatic rqp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 15: athrow
      // 16: aload 0
      // 17: getfield rqp.x3c Lrqp;
      // 1a: goto 21
      // 1d: invokestatic rqp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 20: athrow
      // 21: iload 1
      // 22: ifeq 3a
      // 25: ifnull 4f
      // 28: goto 2f
      // 2b: invokestatic rqp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2e: athrow
      // 2f: aload 0
      // 30: getfield rqp.x3c Lrqp;
      // 33: goto 3a
      // 36: invokestatic rqp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 39: athrow
      // 3a: invokevirtual rqp.i0z ()Z
      // 3d: iload 1
      // 3e: ifeq 4c
      // 41: ifeq 4f
      // 44: goto 4b
      // 47: invokestatic rqp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 4a: athrow
      // 4b: bipush 1
      // 4c: goto 50
      // 4f: bipush 0
      // 50: ireturn
   }

   public void hyf(Map param1) {
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
      // 06: ifne 1e
      // 09: getfield rqp.y5t Lgdz;
      // 0c: ifnull 2e
      // 0f: goto 16
      // 12: invokestatic rqp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 15: athrow
      // 16: aload 0
      // 17: goto 1e
      // 1a: invokestatic rqp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1d: athrow
      // 1e: aload 1
      // 1f: aload 0
      // 20: getfield rqp.y5t Lgdz;
      // 23: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 28: checkcast rqp
      // 2b: putfield rqp.x3c Lrqp;
      // 2e: return
   }

   public boolean s_k(String var1) {
      long var2 = a ^ 9934389944896L;
      int var4 = OpaquePredicate.c();

      try {
         boolean var10000 = a<"v">(30441, 7855002431828721349L ^ var2).equals(this.gxt(var1));
         if (var4 != 0) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (rqp$czc var5) {
         throw a(var5);
      }

      return false;
   }

   public String gxt(String var1) {
      int var2 = OpaquePredicate.b();

      try {
         if (var2 == 0) {
            return this.p6l(var1, new rqp$d3e(this, null));
         }

         if (this.poa(var1)) {
            return this.p6l(var1, new rqp$d3e(this, null));
         }
      } catch (rqp$czc var3) {
         throw a(var3);
      }

      var1 = '#' + var1;
      return this.p6l(var1, new rqp$d3e(this, null));
   }

   private String p6l(String param1, rqp$d3e param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic rqp.a J
      // 003: ldc2_w 112834559407563
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 5
      // 00d: aload 0
      // 00e: iload 5
      // 010: ifeq 029
      // 013: aload 1
      // 014: invokespecial rqp.poa (Ljava/lang/String;)Z
      // 017: ifeq 15c
      // 01a: goto 021
      // 01d: invokestatic rqp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 020: athrow
      // 021: aload 0
      // 022: goto 029
      // 025: invokestatic rqp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 028: athrow
      // 029: iload 5
      // 02b: ifeq 09c
      // 02e: aload 2
      // 02f: getfield rqp$d3e.iyz Lrqp;
      // 032: if_acmpne 08e
      // 035: goto 03c
      // 038: invokestatic rqp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 03b: athrow
      // 03c: getstatic rqp.omg Lorg/apache/logging/log4j/Logger;
      // 03f: new java/lang/StringBuilder
      // 042: dup
      // 043: invokespecial java/lang/StringBuilder.<init> ()V
      // 046: sipush 18016
      // 049: ldc2_w 1598179460019165638
      // 04c: lload 3
      // 04d: lxor
      // 04e: invokedynamic v (IJ)Ljava/lang/String; bsm=rqp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 053: nop
      // 054: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 057: aload 1
      // 058: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 05b: sipush 12279
      // 05e: ldc2_w 1696096394124357715
      // 061: lload 3
      // 062: lxor
      // 063: invokedynamic v (IJ)Ljava/lang/String; bsm=rqp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 068: nop
      // 069: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 06c: aload 0
      // 06d: getfield rqp.pt8 Ljava/lang/String;
      // 070: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 073: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 076: invokeinterface org/apache/logging/log4j/Logger.warn (Ljava/lang/String;)V 2
      // 07b: sipush 9451
      // 07e: ldc2_w 2450323335107377998
      // 081: lload 3
      // 082: lxor
      // 083: invokedynamic v (IJ)Ljava/lang/String; bsm=rqp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: nop
      // 089: areturn
      // 08a: invokestatic rqp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 08d: athrow
      // 08e: aload 0
      // 08f: getfield rqp.mi2 Ljava/util/Map;
      // 092: aload 1
      // 093: bipush 1
      // 094: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 097: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 09c: checkcast java/lang/String
      // 09f: astore 6
      // 0a1: aload 6
      // 0a3: iload 5
      // 0a5: ifeq 0e5
      // 0a8: ifnonnull 0de
      // 0ab: goto 0b2
      // 0ae: invokestatic rqp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0b1: athrow
      // 0b2: aload 0
      // 0b3: iload 5
      // 0b5: ifeq 0d7
      // 0b8: goto 0bf
      // 0bb: invokestatic rqp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0be: athrow
      // 0bf: invokespecial rqp.y50 ()Z
      // 0c2: ifeq 0de
      // 0c5: goto 0cc
      // 0c8: invokestatic rqp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0cb: athrow
      // 0cc: aload 0
      // 0cd: getfield rqp.x3c Lrqp;
      // 0d0: goto 0d7
      // 0d3: invokestatic rqp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0d6: athrow
      // 0d7: aload 1
      // 0d8: aload 2
      // 0d9: invokespecial rqp.p6l (Ljava/lang/String;Lrqp$d3e;)Ljava/lang/String;
      // 0dc: astore 6
      // 0de: aload 2
      // 0df: aload 0
      // 0e0: putfield rqp$d3e.iyz Lrqp;
      // 0e3: aload 6
      // 0e5: iload 5
      // 0e7: ifeq 125
      // 0ea: ifnull 123
      // 0ed: goto 0f4
      // 0f0: invokestatic rqp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0f3: athrow
      // 0f4: aload 0
      // 0f5: aload 6
      // 0f7: iload 5
      // 0f9: ifeq 11d
      // 0fc: goto 103
      // 0ff: invokestatic rqp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 102: athrow
      // 103: invokespecial rqp.poa (Ljava/lang/String;)Z
      // 106: ifeq 123
      // 109: goto 110
      // 10c: invokestatic rqp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 10f: athrow
      // 110: aload 2
      // 111: getfield rqp$d3e.yre Lrqp;
      // 114: aload 6
      // 116: goto 11d
      // 119: invokestatic rqp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 11c: athrow
      // 11d: aload 2
      // 11e: invokespecial rqp.p6l (Ljava/lang/String;Lrqp$d3e;)Ljava/lang/String;
      // 121: astore 6
      // 123: aload 6
      // 125: iload 5
      // 127: ifeq 15a
      // 12a: ifnull 14d
      // 12d: goto 134
      // 130: invokestatic rqp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 133: athrow
      // 134: aload 0
      // 135: aload 6
      // 137: invokespecial rqp.poa (Ljava/lang/String;)Z
      // 13a: ifne 14d
      // 13d: goto 144
      // 140: invokestatic rqp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 143: athrow
      // 144: aload 6
      // 146: goto 15b
      // 149: invokestatic rqp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 14c: athrow
      // 14d: sipush 30441
      // 150: ldc2_w 7855118388159752526
      // 153: lload 3
      // 154: lxor
      // 155: invokedynamic v (IJ)Ljava/lang/String; bsm=rqp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15a: nop
      // 15b: areturn
      // 15c: aload 1
      // 15d: areturn
   }

   private boolean poa(String param1) {
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
      // 05: bipush 0
      // 06: invokevirtual java/lang/String.charAt (I)C
      // 09: iload 2
      // 0a: ifne 21
      // 0d: bipush 35
      // 0f: if_icmpne 24
      // 12: goto 19
      // 15: invokestatic rqp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 18: athrow
      // 19: bipush 1
      // 1a: goto 21
      // 1d: invokestatic rqp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 20: athrow
      // 21: goto 25
      // 24: bipush 0
      // 25: ireturn
   }

   public gdz mrg() {
      return this.y5t;
   }

   public rqp ko5() {
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
      // 05: iload 1
      // 06: ifeq 24
      // 09: invokespecial rqp.y50 ()Z
      // 0c: ifeq 27
      // 0f: goto 16
      // 12: invokestatic rqp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 15: athrow
      // 16: aload 0
      // 17: getfield rqp.x3c Lrqp;
      // 1a: invokevirtual rqp.ko5 ()Lrqp;
      // 1d: goto 24
      // 20: invokestatic rqp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 23: athrow
      // 24: goto 28
      // 27: aload 0
      // 28: areturn
   }

   public flk qw6() {
      hej var1 = this.wgd(flk$gbm.grk);
      hej var2 = this.wgd(flk$gbm.t9v);
      hej var3 = this.wgd(flk$gbm.h9h);
      hej var4 = this.wgd(flk$gbm.g03);
      hej var5 = this.wgd(flk$gbm.fru);
      hej var6 = this.wgd(flk$gbm.e3w);
      return new flk(var1, var2, var3, var4, var5, var6);
   }

   private hej wgd(flk$gbm param1) {
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
      // 05: getfield rqp.x3c Lrqp;
      // 08: iload 2
      // 09: ifne 43
      // 0c: ifnull 42
      // 0f: goto 16
      // 12: invokestatic rqp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 15: athrow
      // 16: aload 0
      // 17: getfield rqp.vxm Lflk;
      // 1a: aload 1
      // 1b: iload 2
      // 1c: ifne 47
      // 1f: goto 26
      // 22: invokestatic rqp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 25: athrow
      // 26: invokevirtual flk.qgt (Lflk$gbm;)Z
      // 29: ifne 42
      // 2c: goto 33
      // 2f: invokestatic rqp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 32: athrow
      // 33: aload 0
      // 34: getfield rqp.x3c Lrqp;
      // 37: aload 1
      // 38: invokespecial rqp.wgd (Lflk$gbm;)Lhej;
      // 3b: goto 4a
      // 3e: invokestatic rqp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 41: athrow
      // 42: aload 0
      // 43: getfield rqp.vxm Lflk;
      // 46: aload 1
      // 47: invokevirtual flk.zem (Lflk$gbm;)Lhej;
      // 4a: areturn
   }

   public static void j8g(Map param0) {
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
      // 05: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // 0a: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 0f: astore 2
      // 10: aload 2
      // 11: iload 1
      // 12: ifne 31
      // 15: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1a: ifeq 6c
      // 1d: goto 24
      // 20: invokestatic rqp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 23: athrow
      // 24: aload 2
      // 25: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2a: goto 31
      // 2d: invokestatic rqp.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 30: athrow
      // 31: checkcast rqp
      // 34: astore 3
      // 35: aload 3
      // 36: getfield rqp.x3c Lrqp;
      // 39: astore 4
      // 3b: aload 4
      // 3d: getfield rqp.x3c Lrqp;
      // 40: astore 5
      // 42: aload 4
      // 44: aload 5
      // 46: if_acmpeq 5e
      // 49: aload 4
      // 4b: getfield rqp.x3c Lrqp;
      // 4e: astore 4
      // 50: aload 5
      // 52: getfield rqp.x3c Lrqp;
      // 55: getfield rqp.x3c Lrqp;
      // 58: astore 5
      // 5a: iload 1
      // 5b: ifeq 42
      // 5e: new rqp$czc
      // 61: dup
      // 62: invokespecial rqp$czc.<init> ()V
      // 65: athrow
      // 66: astore 4
      // 68: iload 1
      // 69: ifeq 10
      // 6c: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2740368396450988741L, -980397331001575147L, MethodHandles.lookup().lookupClass()).a(14979136299829L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 45961655723469L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[4];
      int var7 = 0;
      String var6 = ":u\u0088ÃOéÖ5ë!\nùl\u0098àdCqX\u0080f·b¸(\u008aÌõ¿ö\fâX~v¥Xo=G\u007f\u0007\u009e° \u0016wÉ\u0005\u0082ÄácÄ\u0019\u009cLq~<¿_Lx\u0001ö\u0087ñOûO´ô\u0099¥B\u000bGæh\u0016¼à`G³½cã\u0006þ^¥;=,$\u008eÅô»\u009fì×~\u0098W<¦n] »ã|\u0006Gu³\u0091¹";
      int var8 = ":u\u0088ÃOéÖ5ë!\nùl\u0098àdCqX\u0080f·b¸(\u008aÌõ¿ö\fâX~v¥Xo=G\u007f\u0007\u009e° \u0016wÉ\u0005\u0082ÄácÄ\u0019\u009cLq~<¿_Lx\u0001ö\u0087ñOûO´ô\u0099¥B\u000bGæh\u0016¼à`G³½cã\u0006þ^¥;=,$\u008eÅô»\u009fì×~\u0098W<¦n] »ã|\u0006Gu³\u0091¹"
         .length();
      char var5 = ' ';
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
                     c = new String[4];
                     omg = LogManager.getLogger();
                     alp = new GsonBuilder()
                        .registerTypeAdapter(rqp.class, new rqp$zuq())
                        .registerTypeAdapter(lcz.class, new lcz$ish())
                        .registerTypeAdapter(e97.class, new e97$wov())
                        .registerTypeAdapter(y3k.class, new y3k$mdf())
                        .registerTypeAdapter(hej.class, new hej$azq())
                        .registerTypeAdapter(flk.class, new flk$tbc())
                        .create();
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

                  var6 = "\u0005\u0088¢wÈ¯WJ\u0085\u0097U \u009aâG\u001aò\u000eçO\u0011[\u009c\"Ó&\f:\u00078\u008dn\u0010[¡ÒýúgGPMB«\u008eR°rØ";
                  var8 = "\u0005\u0088¢wÈ¯WJ\u0085\u0097U \u009aâG\u001aò\u000eçO\u0011[\u009c\"Ó&\f:\u00078\u008dn\u0010[¡ÒýúgGPMB«\u008eR°rØ".length();
                  var5 = ' ';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static RuntimeException a(RuntimeException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 21364;
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
            throw new RuntimeException("rqp", var10);
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
         throw new RuntimeException("rqp" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
