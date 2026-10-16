import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class uya extends osd {
   public final Map zla = new eln();

   public _u_ d3k(w9p var1) {
      return (_u_)super.d3k(var1);
   }

   public _u_ srq(String var1) {
      int var2 = t9d.c();
      _4o var3 = super.srq(var1);

      try {
         if (var2 != 0) {
            return (_u_)var3;
         }

         if (var3 != null) {
            return (_u_)var3;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      var3 = (_4o)this.zla.get(var1);
      return (_u_)var3;
   }

   @Override
   public _4o ylc(w9p param1) {
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
      // 05: aload 1
      // 06: invokespecial osd.ylc (Lw9p;)L_4o;
      // 09: astore 3
      // 0a: aload 1
      // 0b: iload 2
      // 0c: ifeq 24
      // 0f: instanceof oik
      // 12: ifeq 51
      // 15: goto 1c
      // 18: invokestatic uya.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 1
      // 1d: goto 24
      // 20: invokestatic uya.a (Loov;)Loov;
      // 23: athrow
      // 24: checkcast oik
      // 27: invokevirtual oik.u_r ()Ljava/lang/String;
      // 2a: iload 2
      // 2b: ifeq 50
      // 2e: ifnull 51
      // 31: goto 38
      // 34: invokestatic uya.a (Loov;)Loov;
      // 37: athrow
      // 38: aload 0
      // 39: getfield uya.zla Ljava/util/Map;
      // 3c: aload 1
      // 3d: checkcast oik
      // 40: invokevirtual oik.u_r ()Ljava/lang/String;
      // 43: aload 3
      // 44: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 49: goto 50
      // 4c: invokestatic uya.a (Loov;)Loov;
      // 4f: athrow
      // 50: pop
      // 51: aload 3
      // 52: areturn
   }

   @Override
   public _4o ly0(w9p var1) {
      return new _u_(this, var1);
   }

   @Override
   public void d8j(_4o param1) {
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
      // 05: invokeinterface _4o.vyz ()Lw9p; 1
      // 0a: invokeinterface w9p.db8 ()Z 1
      // 0f: iload 2
      // 10: ifeq 2e
      // 13: ifeq 2f
      // 16: goto 1d
      // 19: invokestatic uya.a (Loov;)Loov;
      // 1c: athrow
      // 1d: aload 0
      // 1e: getfield uya.bzw Ljava/util/Set;
      // 21: aload 1
      // 22: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 27: goto 2e
      // 2a: invokestatic uya.a (Loov;)Loov;
      // 2d: athrow
      // 2e: pop
      // 2f: aload 0
      // 30: getfield uya.w_w Lcom/google/common/collect/Multimap;
      // 33: aload 1
      // 34: invokeinterface _4o.vyz ()Lw9p; 1
      // 39: invokeinterface com/google/common/collect/Multimap.get (Ljava/lang/Object;)Ljava/util/Collection; 2
      // 3e: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 43: astore 3
      // 44: aload 3
      // 45: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 4a: ifeq 79
      // 4d: aload 3
      // 4e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 53: checkcast w9p
      // 56: astore 4
      // 58: aload 0
      // 59: aload 4
      // 5b: invokevirtual uya.d3k (Lw9p;)L_u_;
      // 5e: astore 5
      // 60: aload 5
      // 62: iload 2
      // 63: ifeq 72
      // 66: ifnull 75
      // 69: goto 70
      // 6c: invokestatic uya.a (Loov;)Loov;
      // 6f: athrow
      // 70: aload 5
      // 72: invokevirtual _u_.t30 ()V
      // 75: iload 2
      // 76: ifne 44
      // 79: return
   }

   public Set s89() {
      return this.bzw;
   }

   public Collection kz8() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/google/common/collect/Sets.newHashSet ()Ljava/util/HashSet;
      // 03: astore 2
      // 04: invokestatic t9d.b ()I
      // 07: aload 0
      // 08: invokevirtual uya.vz0 ()Ljava/util/Collection;
      // 0b: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 10: astore 3
      // 11: istore 1
      // 12: aload 3
      // 13: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 18: ifeq 54
      // 1b: aload 3
      // 1c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 21: checkcast _4o
      // 24: astore 4
      // 26: aload 4
      // 28: invokeinterface _4o.vyz ()Lw9p; 1
      // 2d: invokeinterface w9p.db8 ()Z 1
      // 32: iload 1
      // 33: ifeq 4f
      // 36: ifeq 50
      // 39: goto 40
      // 3c: invokestatic uya.a (Loov;)Loov;
      // 3f: athrow
      // 40: aload 2
      // 41: aload 4
      // 43: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 48: goto 4f
      // 4b: invokestatic uya.a (Loov;)Loov;
      // 4e: athrow
      // 4f: pop
      // 50: iload 1
      // 51: ifne 12
      // 54: aload 2
      // 55: areturn
   }

   @Override
   public _4o srq(String var1) {
      return this.srq(var1);
   }

   @Override
   public _4o d3k(w9p var1) {
      return this.d3k(var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
