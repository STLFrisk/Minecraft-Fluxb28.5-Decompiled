import com.google.common.collect.Maps;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class bdo extends gdw {
   private Map rm0 = Maps.newHashMap();
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   @Override
   public void b_8(DataOutput var1) {
      int var2 = OpaquePredicate.b();
      Iterator var3 = this.rm0.keySet().iterator();

      while (true) {
         if (var3.hasNext()) {
            String var4 = (String)var3.next();
            gdw var5 = (gdw)this.rm0.get(var4);

            try {
               rdu(var4, var5, var1);
               if (var2 == 0) {
                  break;
               }

               if (var2 != 0) {
                  continue;
               }
            } catch (RuntimeException var6) {
               throw a(var6);
            }
         }

         var1.writeByte(0);
         break;
      }
   }

   @Override
   public void zwk(DataInput var1, int var2, btc var3) {
      long var4 = a ^ 93631455249469L;
      int var6 = OpaquePredicate.c();

      try {
         var3.es9(384L);
         if (var2 > 512) {
            throw new RuntimeException(a<"m">(26579, 6307328294804017153L ^ var4));
         }
      } catch (RuntimeException var11) {
         throw a(var11);
      }

      this.rm0.clear();

      byte var7;
      while ((var7 = jyk(var1, var3)) != 0) {
         String var8 = _z8(var1, var3);
         var3.es9((long)(224 + 16 * var8.length()));
         gdw var9 = _0t(var7, var8, var1, var2 + 1, var3);

         try {
            if (this.rm0.put(var8, var9) != null) {
               var3.es9(288L);
            }
         } catch (RuntimeException var10) {
            throw a(var10);
         }

         if (var6 != 0) {
            break;
         }
      }
   }

   public Set bo9() {
      return this.rm0.keySet();
   }

   @Override
   public byte ky0() {
      return 10;
   }

   public void rzm(String var1, gdw var2) {
      this.rm0.put(var1, var2);
   }

   public void atr(String var1, byte var2) {
      this.rm0.put(var1, new yyt(var2));
   }

   public void ge7(String var1, short var2) {
      this.rm0.put(var1, new wmr(var2));
   }

   public void iin(String var1, int var2) {
      this.rm0.put(var1, new t5o(var2));
   }

   public void xw9(String var1, long var2) {
      this.rm0.put(var1, new tju(var2));
   }

   public void _i9(String var1, float var2) {
      this.rm0.put(var1, new n8i(var2));
   }

   public void von(String var1, double var2) {
      this.rm0.put(var1, new ok6(var2));
   }

   public void rjq(String var1, String var2) {
      this.rm0.put(var1, new bgg(var2));
   }

   public void gd7(String var1, byte[] var2) {
      this.rm0.put(var1, new cny(var2));
   }

   public void _el(String var1, int[] var2) {
      this.rm0.put(var1, new mvq(var2));
   }

   public void zyu(String var1, boolean var2) {
      int var3 = OpaquePredicate.b();

      bdo var10000;
      String var10001;
      byte var10002;
      label22: {
         label21: {
            try {
               var10000 = this;
               var10001 = var1;
               var10002 = var2;
               if (var3 == 0) {
                  break label22;
               }

               if (var2 != 0) {
                  break label21;
               }
            } catch (RuntimeException var4) {
               throw a(var4);
            }

            var10002 = 0;
            break label22;
         }

         var10002 = 1;
      }

      var10000.atr(var10001, (byte)var10002);
   }

   public gdw e2o(String var1) {
      return (gdw)this.rm0.get(var1);
   }

   public byte iif(String var1) {
      int var2 = OpaquePredicate.b();
      gdw var3 = (gdw)this.rm0.get(var1);

      try {
         if (var2 == 0) {
            return var3.ky0();
         }

         if (var3 == null) {
            return 0;
         }
      } catch (RuntimeException var4) {
         throw a(var4);
      }

      return var3.ky0();
   }

   public boolean dmw(String var1) {
      return this.rm0.containsKey(var1);
   }

   public boolean inh(String param1, int param2) {
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
      // 05: aload 1
      // 06: invokevirtual bdo.iif (Ljava/lang/String;)B
      // 09: istore 4
      // 0b: iload 4
      // 0d: iload 2
      // 0e: iload 3
      // 0f: ifeq 25
      // 12: if_icmpne 22
      // 15: goto 1c
      // 18: invokestatic bdo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1b: athrow
      // 1c: bipush 1
      // 1d: ireturn
      // 1e: invokestatic bdo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 21: athrow
      // 22: iload 2
      // 23: bipush 99
      // 25: iload 3
      // 26: ifeq 4f
      // 29: if_icmpeq 41
      // 2c: goto 33
      // 2f: invokestatic bdo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 32: athrow
      // 33: iload 4
      // 35: ifle 3f
      // 38: goto 3f
      // 3b: invokestatic bdo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3e: athrow
      // 3f: bipush 0
      // 40: ireturn
      // 41: iload 4
      // 43: iload 3
      // 44: ifeq d3
      // 47: bipush 1
      // 48: goto 4f
      // 4b: invokestatic bdo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 4e: athrow
      // 4f: if_icmpeq cb
      // 52: iload 4
      // 54: iload 3
      // 55: ifeq d3
      // 58: goto 5f
      // 5b: invokestatic bdo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 5e: athrow
      // 5f: bipush 2
      // 60: if_icmpeq cb
      // 63: goto 6a
      // 66: invokestatic bdo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 69: athrow
      // 6a: iload 4
      // 6c: iload 3
      // 6d: ifeq d3
      // 70: goto 77
      // 73: invokestatic bdo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 76: athrow
      // 77: bipush 3
      // 78: if_icmpeq cb
      // 7b: goto 82
      // 7e: invokestatic bdo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 81: athrow
      // 82: iload 4
      // 84: iload 3
      // 85: ifeq d3
      // 88: goto 8f
      // 8b: invokestatic bdo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 8e: athrow
      // 8f: bipush 4
      // 90: if_icmpeq cb
      // 93: goto 9a
      // 96: invokestatic bdo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 99: athrow
      // 9a: iload 4
      // 9c: iload 3
      // 9d: ifeq d3
      // a0: goto a7
      // a3: invokestatic bdo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // a6: athrow
      // a7: bipush 5
      // a8: if_icmpeq cb
      // ab: goto b2
      // ae: invokestatic bdo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // b1: athrow
      // b2: iload 4
      // b4: iload 3
      // b5: ifeq d3
      // b8: goto bf
      // bb: invokestatic bdo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // be: athrow
      // bf: bipush 6
      // c1: if_icmpne d6
      // c4: goto cb
      // c7: invokestatic bdo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // ca: athrow
      // cb: bipush 1
      // cc: goto d3
      // cf: invokestatic bdo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // d2: athrow
      // d3: goto d7
      // d6: bipush 0
      // d7: ireturn
   }

   public byte r_t(String param1) {
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
      // 06: ifne 2b
      // 09: aload 1
      // 0a: bipush 99
      // 0c: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 0f: ifne 21
      // 12: goto 19
      // 15: invokestatic bdo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 18: athrow
      // 19: bipush 0
      // 1a: goto 31
      // 1d: invokestatic bdo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 20: athrow
      // 21: aload 0
      // 22: getfield bdo.rm0 Ljava/util/Map;
      // 25: aload 1
      // 26: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 2b: checkcast gdw$q1_
      // 2e: invokevirtual gdw$q1_.t7_ ()B
      // 31: ireturn
      // 32: astore 3
      // 33: bipush 0
      // 34: ireturn
   }

   public short hp9(String param1) {
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
      // 05: iload 2
      // 06: ifeq 2b
      // 09: aload 1
      // 0a: bipush 99
      // 0c: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 0f: ifne 21
      // 12: goto 19
      // 15: invokestatic bdo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 18: athrow
      // 19: bipush 0
      // 1a: goto 31
      // 1d: invokestatic bdo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 20: athrow
      // 21: aload 0
      // 22: getfield bdo.rm0 Ljava/util/Map;
      // 25: aload 1
      // 26: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 2b: checkcast gdw$q1_
      // 2e: invokevirtual gdw$q1_.sgm ()S
      // 31: ireturn
      // 32: astore 3
      // 33: bipush 0
      // 34: ireturn
   }

   public int uz7(String param1) {
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
      // 05: iload 2
      // 06: ifeq 2b
      // 09: aload 1
      // 0a: bipush 99
      // 0c: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 0f: ifne 21
      // 12: goto 19
      // 15: invokestatic bdo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 18: athrow
      // 19: bipush 0
      // 1a: goto 31
      // 1d: invokestatic bdo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 20: athrow
      // 21: aload 0
      // 22: getfield bdo.rm0 Ljava/util/Map;
      // 25: aload 1
      // 26: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 2b: checkcast gdw$q1_
      // 2e: invokevirtual gdw$q1_.r9u ()I
      // 31: ireturn
      // 32: astore 3
      // 33: bipush 0
      // 34: ireturn
   }

   public long yn0(String param1) {
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
      // 06: ifne 2b
      // 09: aload 1
      // 0a: bipush 99
      // 0c: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 0f: ifne 21
      // 12: goto 19
      // 15: invokestatic bdo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 18: athrow
      // 19: lconst_0
      // 1a: goto 31
      // 1d: invokestatic bdo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 20: athrow
      // 21: aload 0
      // 22: getfield bdo.rm0 Ljava/util/Map;
      // 25: aload 1
      // 26: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 2b: checkcast gdw$q1_
      // 2e: invokevirtual gdw$q1_.taw ()J
      // 31: lreturn
      // 32: astore 3
      // 33: lconst_0
      // 34: lreturn
   }

   public float blg(String param1) {
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
      // 05: iload 2
      // 06: ifeq 2b
      // 09: aload 1
      // 0a: bipush 99
      // 0c: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 0f: ifne 21
      // 12: goto 19
      // 15: invokestatic bdo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 18: athrow
      // 19: fconst_0
      // 1a: goto 31
      // 1d: invokestatic bdo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 20: athrow
      // 21: aload 0
      // 22: getfield bdo.rm0 Ljava/util/Map;
      // 25: aload 1
      // 26: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 2b: checkcast gdw$q1_
      // 2e: invokevirtual gdw$q1_.qaj ()F
      // 31: freturn
      // 32: astore 3
      // 33: fconst_0
      // 34: freturn
   }

   public double m9p(String param1) {
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
      // 06: ifne 2b
      // 09: aload 1
      // 0a: bipush 99
      // 0c: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 0f: ifne 21
      // 12: goto 19
      // 15: invokestatic bdo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 18: athrow
      // 19: dconst_0
      // 1a: goto 31
      // 1d: invokestatic bdo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 20: athrow
      // 21: aload 0
      // 22: getfield bdo.rm0 Ljava/util/Map;
      // 25: aload 1
      // 26: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 2b: checkcast gdw$q1_
      // 2e: invokevirtual gdw$q1_.td3 ()D
      // 31: dreturn
      // 32: astore 3
      // 33: dconst_0
      // 34: dreturn
   }

   public String u14(String param1) {
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
      // 05: iload 2
      // 06: ifeq 30
      // 09: aload 1
      // 0a: bipush 8
      // 0c: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 0f: ifne 23
      // 12: goto 19
      // 15: invokestatic bdo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 18: athrow
      // 19: ldc ""
      // 1b: nop
      // 1c: goto 33
      // 1f: invokestatic bdo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 22: athrow
      // 23: aload 0
      // 24: getfield bdo.rm0 Ljava/util/Map;
      // 27: aload 1
      // 28: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 2d: checkcast gdw
      // 30: invokevirtual gdw.ocr ()Ljava/lang/String;
      // 33: areturn
      // 34: astore 3
      // 35: ldc ""
      // 37: nop
      // 38: areturn
   }

   public byte[] waz(String param1) {
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
      // 05: iload 2
      // 06: ifeq 2d
      // 09: aload 1
      // 0a: bipush 7
      // 0c: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 0f: ifne 23
      // 12: goto 19
      // 15: invokestatic bdo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 18: athrow
      // 19: bipush 0
      // 1a: newarray 8
      // 1c: goto 33
      // 1f: invokestatic bdo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 22: athrow
      // 23: aload 0
      // 24: getfield bdo.rm0 Ljava/util/Map;
      // 27: aload 1
      // 28: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 2d: checkcast cny
      // 30: invokevirtual cny.uov ()[B
      // 33: areturn
      // 34: astore 3
      // 35: new oov
      // 38: dup
      // 39: aload 0
      // 3a: aload 1
      // 3b: bipush 7
      // 3d: aload 3
      // 3e: invokespecial bdo.rz0 (Ljava/lang/String;ILjava/lang/ClassCastException;)Le1i;
      // 41: invokespecial oov.<init> (Le1i;)V
      // 44: athrow
   }

   public int[] hkr(String param1) {
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
      // 05: iload 2
      // 06: ifeq 2d
      // 09: aload 1
      // 0a: bipush 11
      // 0c: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 0f: ifne 23
      // 12: goto 19
      // 15: invokestatic bdo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 18: athrow
      // 19: bipush 0
      // 1a: newarray 10
      // 1c: goto 33
      // 1f: invokestatic bdo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 22: athrow
      // 23: aload 0
      // 24: getfield bdo.rm0 Ljava/util/Map;
      // 27: aload 1
      // 28: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 2d: checkcast mvq
      // 30: invokevirtual mvq.n04 ()[I
      // 33: areturn
      // 34: astore 3
      // 35: new oov
      // 38: dup
      // 39: aload 0
      // 3a: aload 1
      // 3b: bipush 11
      // 3d: aload 3
      // 3e: invokespecial bdo.rz0 (Ljava/lang/String;ILjava/lang/ClassCastException;)Le1i;
      // 41: invokespecial oov.<init> (Le1i;)V
      // 44: athrow
   }

   public bdo b__(String param1) {
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
      // 05: iload 2
      // 06: ifeq 31
      // 09: aload 1
      // 0a: bipush 10
      // 0c: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 0f: ifne 27
      // 12: goto 19
      // 15: invokestatic bdo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 18: athrow
      // 19: new bdo
      // 1c: dup
      // 1d: invokespecial bdo.<init> ()V
      // 20: goto 34
      // 23: invokestatic bdo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 26: athrow
      // 27: aload 0
      // 28: getfield bdo.rm0 Ljava/util/Map;
      // 2b: aload 1
      // 2c: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 31: checkcast bdo
      // 34: areturn
      // 35: astore 3
      // 36: new oov
      // 39: dup
      // 3a: aload 0
      // 3b: aload 1
      // 3c: bipush 10
      // 3e: aload 3
      // 3f: invokespecial bdo.rz0 (Ljava/lang/String;ILjava/lang/ClassCastException;)Le1i;
      // 42: invokespecial oov.<init> (Le1i;)V
      // 45: athrow
   }

   public qhg bzb(String param1, int param2) {
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
      // 05: iload 3
      // 06: ifeq 2b
      // 09: aload 1
      // 0a: invokevirtual bdo.iif (Ljava/lang/String;)B
      // 0d: bipush 9
      // 0f: if_icmpeq 21
      // 12: goto 19
      // 15: invokestatic bdo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 18: athrow
      // 19: new qhg
      // 1c: dup
      // 1d: invokespecial qhg.<init> ()V
      // 20: areturn
      // 21: aload 0
      // 22: getfield bdo.rm0 Ljava/util/Map;
      // 25: aload 1
      // 26: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 2b: checkcast qhg
      // 2e: astore 4
      // 30: aload 4
      // 32: invokevirtual qhg.vek ()I
      // 35: iload 3
      // 36: ifeq 5a
      // 39: ifle 6f
      // 3c: goto 43
      // 3f: invokestatic bdo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 42: athrow
      // 43: aload 4
      // 45: iload 3
      // 46: ifeq 6c
      // 49: goto 50
      // 4c: invokestatic bdo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 4f: athrow
      // 50: invokevirtual qhg.uoe ()I
      // 53: goto 5a
      // 56: invokestatic bdo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 59: athrow
      // 5a: iload 2
      // 5b: if_icmpeq 6f
      // 5e: new qhg
      // 61: dup
      // 62: invokespecial qhg.<init> ()V
      // 65: goto 6c
      // 68: invokestatic bdo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 6b: athrow
      // 6c: goto 71
      // 6f: aload 4
      // 71: areturn
      // 72: astore 4
      // 74: new oov
      // 77: dup
      // 78: aload 0
      // 79: aload 1
      // 7a: bipush 9
      // 7c: aload 4
      // 7e: invokespecial bdo.rz0 (Ljava/lang/String;ILjava/lang/ClassCastException;)Le1i;
      // 81: invokespecial oov.<init> (Le1i;)V
      // 84: athrow
   }

   public boolean dvl(String var1) {
      int var2 = OpaquePredicate.b();

      try {
         byte var10000 = this.r_t(var1);
         if (var2 == 0) {
            return (boolean)var10000;
         }

         if (var10000 != 0) {
            return (boolean)1;
         }
      } catch (RuntimeException var3) {
         throw a(var3);
      }

      return (boolean)0;
   }

   public void bkn(String var1) {
      this.rm0.remove(var1);
   }

   @Override
   public String toString() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: new java/lang/StringBuilder
      // 03: dup
      // 04: ldc "{"
      // 06: nop
      // 07: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 0a: astore 2
      // 0b: invokestatic OpaquePredicate.b ()I
      // 0e: aload 0
      // 0f: getfield bdo.rm0 Ljava/util/Map;
      // 12: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 17: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 1c: astore 3
      // 1d: istore 1
      // 1e: aload 3
      // 1f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 24: ifeq 80
      // 27: aload 3
      // 28: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2d: checkcast java/util/Map$Entry
      // 30: astore 4
      // 32: aload 2
      // 33: iload 1
      // 34: ifeq 86
      // 37: iload 1
      // 38: ifeq 7b
      // 3b: goto 42
      // 3e: invokestatic bdo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 41: athrow
      // 42: invokevirtual java/lang/StringBuilder.length ()I
      // 45: bipush 1
      // 46: if_icmpeq 5e
      // 49: goto 50
      // 4c: invokestatic bdo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 4f: athrow
      // 50: aload 2
      // 51: bipush 44
      // 53: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 56: pop
      // 57: goto 5e
      // 5a: invokestatic bdo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 5d: athrow
      // 5e: aload 2
      // 5f: aload 4
      // 61: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 66: checkcast java/lang/String
      // 69: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6c: bipush 58
      // 6e: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 71: aload 4
      // 73: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 78: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 7b: pop
      // 7c: iload 1
      // 7d: ifne 1e
      // 80: aload 2
      // 81: bipush 125
      // 83: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 86: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 89: areturn
   }

   @Override
   public boolean dq5() {
      return this.rm0.isEmpty();
   }

   private e1i rz0(String var1, int var2, ClassCastException var3) {
      long var4 = a ^ 125643098928221L;
      e1i var6 = e1i.cor(var3, a<"m">(10008, 7816374280376279202L ^ var4));
      wsc var7 = var6.fiy(a<"m">(24102, 3300628551388207507L ^ var4), 1);
      var7.h1o(a<"m">(4009, 1958940475708983326L ^ var4), new bdo$1(this, var1));
      var7.h1o(a<"m">(1071, 4190026656955188124L ^ var4), new bdo$2(this, var2));
      var7._0p(a<"m">(10217, 1036674897991360600L ^ var4), var1);
      return var6;
   }

   @Override
   public gdw h33() {
      bdo var1 = new bdo();

      for (String var3 : this.rm0.keySet()) {
         var1.rzm(var3, ((gdw)this.rm0.get(var3)).h33());
      }

      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      int var2 = OpaquePredicate.b();

      label27: {
         try {
            boolean var10000 = super.equals(var1);
            if (var2 == 0) {
               return var10000;
            }

            if (var10000) {
               break label27;
            }
         } catch (RuntimeException var4) {
            throw a(var4);
         }

         return false;
      }

      bdo var3 = (bdo)var1;
      return this.rm0.entrySet().equals(var3.rm0.entrySet());
   }

   @Override
   public int hashCode() {
      return super.hashCode() ^ this.rm0.hashCode();
   }

   private static void rdu(String param0, gdw param1, DataOutput param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 2
      // 05: aload 1
      // 06: invokevirtual gdw.ky0 ()B
      // 09: invokeinterface java/io/DataOutput.writeByte (I)V 2
      // 0e: aload 1
      // 0f: iload 3
      // 10: ifeq 2f
      // 13: invokevirtual gdw.ky0 ()B
      // 16: ifeq 33
      // 19: goto 20
      // 1c: invokestatic bdo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1f: athrow
      // 20: aload 2
      // 21: aload 0
      // 22: invokeinterface java/io/DataOutput.writeUTF (Ljava/lang/String;)V 2
      // 27: aload 1
      // 28: goto 2f
      // 2b: invokestatic bdo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2e: athrow
      // 2f: aload 2
      // 30: invokevirtual gdw.b_8 (Ljava/io/DataOutput;)V
      // 33: return
   }

   private static byte jyk(DataInput var0, btc var1) {
      return var0.readByte();
   }

   private static String _z8(DataInput var0, btc var1) {
      return var0.readUTF();
   }

   public static gdw _0t(byte var0, String var1, DataInput var2, int var3, btc var4) {
      long var5 = a ^ 34788836304943L;
      gdw var7 = gdw.nt6(var0);

      try {
         var7.zwk(var2, var3, var4);
         return var7;
      } catch (IOException var11) {
         e1i var9 = e1i.cor(var11, a<"m">(1142, 8922296004514815922L ^ var5));
         wsc var10 = var9.i_r(a<"m">(31551, 9134631053716939005L ^ var5));
         var10._0p(a<"m">(15526, 2348022657790027631L ^ var5), var1);
         var10._0p(a<"m">(29389, 6208462759702194443L ^ var5), var0);
         throw new oov(var9);
      }
   }

   public void uhv(bdo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: getfield bdo.rm0 Ljava/util/Map;
      // 08: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 0d: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 12: astore 3
      // 13: aload 3
      // 14: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 19: ifeq ab
      // 1c: aload 3
      // 1d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 22: checkcast java/lang/String
      // 25: astore 4
      // 27: aload 1
      // 28: getfield bdo.rm0 Ljava/util/Map;
      // 2b: aload 4
      // 2d: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 32: checkcast gdw
      // 35: astore 5
      // 37: aload 5
      // 39: invokevirtual gdw.ky0 ()B
      // 3c: iload 2
      // 3d: ifeq 66
      // 40: bipush 10
      // 42: if_icmpne 95
      // 45: goto 4c
      // 48: invokestatic bdo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 4b: athrow
      // 4c: aload 0
      // 4d: aload 4
      // 4f: iload 2
      // 50: ifeq 89
      // 53: goto 5a
      // 56: invokestatic bdo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 59: athrow
      // 5a: bipush 10
      // 5c: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 5f: goto 66
      // 62: invokestatic bdo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 65: athrow
      // 66: ifeq 7f
      // 69: aload 0
      // 6a: aload 4
      // 6c: invokevirtual bdo.b__ (Ljava/lang/String;)Lbdo;
      // 6f: astore 6
      // 71: aload 6
      // 73: aload 5
      // 75: checkcast bdo
      // 78: invokevirtual bdo.uhv (Lbdo;)V
      // 7b: iload 2
      // 7c: ifne a7
      // 7f: aload 0
      // 80: aload 4
      // 82: goto 89
      // 85: invokestatic bdo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 88: athrow
      // 89: aload 5
      // 8b: invokevirtual gdw.h33 ()Lgdw;
      // 8e: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 91: iload 2
      // 92: ifne a7
      // 95: aload 0
      // 96: aload 4
      // 98: aload 5
      // 9a: invokevirtual gdw.h33 ()Lgdw;
      // 9d: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // a0: goto a7
      // a3: invokestatic bdo.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // a6: athrow
      // a7: iload 2
      // a8: ifne 13
      // ab: return
   }

   public static Map _m3(bdo var0) {
      return var0.rm0;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8331797455084822420L, 557337888581334428L, MethodHandles.lookup().lookupClass()).a(19029704178437L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 78468907525339L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[10];
      int var7 = 0;
      String var6 = "½hÉ\u001d\u008dÝÅA,Gò0¯w\u0010\u0095\u008a\u0099H²¼(\\\u0089ÎÁ@Iu6Â½àÂ²\"£P\u0007þh\u0005Í\u008c©íL?\u0014°2S«\\r¡\u008f±Mn\u0099*¤Q\u0087RÌ\\\u0082'(·}MB§Ö¡\u008aÖ\u000fä\u0081Ä¦\u009eþ>Ún«º\u00adl]lÒ.+Ü\u000f\u0004\u0019`Æ»ó:I0Õ\u0094Åµ½\u0001Îj\u0090à,J\u0094ÁÍ§oub?8þ¡bNOòÓpÂ\u0095,\u0083\u007f\u008e ß\u001fÛØW\u009c=Çy\u0019\u0095Óá\u0006ß5=m\u001a¦ÿ¥L5i\u0090n\u009d\u00057¸\u0095\u0010ÀÑD]|\u000bÂô ó\u0016\u001eÕX ß \u0016ú¸Í\u00061b!>Å{N¢Èè[y$$\u0090\u0099Â7\u000bÐÝ\u0015\u0006Ï½°7(ùvN\u0094m\u00030\u008f\u0011SnÕ\u008cÝ\u0097vc* ØÙÓ¶¥A¦\u0084ÁZfÍ\u0085#§ÐV\u000e!7\u0087 )ÐMC\u009aèÇtÑf\u00ad#*\fÿ\u001c·\u00131^\u008dæ0\u007fóm¥CÖÈv\u0007 C-\u0097\u0007¨Î¾\u0094\u0099°mX;àñ\u0003MñßáTÕpS\u0097)\u001a8y·n6";
      int var8 = "½hÉ\u001d\u008dÝÅA,Gò0¯w\u0010\u0095\u008a\u0099H²¼(\\\u0089ÎÁ@Iu6Â½àÂ²\"£P\u0007þh\u0005Í\u008c©íL?\u0014°2S«\\r¡\u008f±Mn\u0099*¤Q\u0087RÌ\\\u0082'(·}MB§Ö¡\u008aÖ\u000fä\u0081Ä¦\u009eþ>Ún«º\u00adl]lÒ.+Ü\u000f\u0004\u0019`Æ»ó:I0Õ\u0094Åµ½\u0001Îj\u0090à,J\u0094ÁÍ§oub?8þ¡bNOòÓpÂ\u0095,\u0083\u007f\u008e ß\u001fÛØW\u009c=Çy\u0019\u0095Óá\u0006ß5=m\u001a¦ÿ¥L5i\u0090n\u009d\u00057¸\u0095\u0010ÀÑD]|\u000bÂô ó\u0016\u001eÕX ß \u0016ú¸Í\u00061b!>Å{N¢Èè[y$$\u0090\u0099Â7\u000bÐÝ\u0015\u0006Ï½°7(ùvN\u0094m\u00030\u008f\u0011SnÕ\u008cÝ\u0097vc* ØÙÓ¶¥A¦\u0084ÁZfÍ\u0085#§ÐV\u000e!7\u0087 )ÐMC\u009aèÇtÑf\u00ad#*\fÿ\u001c·\u00131^\u008dæ0\u007fóm¥CÖÈv\u0007 C-\u0097\u0007¨Î¾\u0094\u0099°mX;àñ\u0003MñßáTÕpS\u0097)\u001a8y·n6"
         .length();
      char var5 = '(';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     b = var9;
                     c = new String[10];
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

                  var6 = "ð\u0005P:Õù\u000esþ\r\"6Géw':xNl4ð8Q\u001c\u0080\u001e\u0094Û\u008dô\u0092(\u0098\u0012RKV®:\u001bñ\u0003\u0011}Ã\u0014G\u00ad\u0099\u009fúTw\u000bZVW8kýíBm³ú\tT£¸zY\u009a";
                  var8 = "ð\u0005P:Õù\u000esþ\r\"6Géw':xNl4ð8Q\u001c\u0080\u001e\u0094Û\u008dô\u0092(\u0098\u0012RKV®:\u001bñ\u0003\u0011}Ã\u0014G\u00ad\u0099\u009fúTw\u000bZVW8kýíBm³ú\tT£¸zY\u009a"
                     .length();
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

   private static String b(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31159;
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
            throw new RuntimeException("bdo", var10);
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
         c[var5] = b(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("bdo" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
