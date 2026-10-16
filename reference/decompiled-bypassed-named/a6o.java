import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class a6o {
   private final Map mot = Maps.newHashMap();
   private final Map yqk = Maps.newHashMap();
   private final Map sf2 = Maps.newHashMap();
   private final v58 npb;

   public a6o(v58 var1) {
      this.npb = var1;
   }

   public sla a28(u7m var1) {
      return this.eyp(var1, 0);
   }

   public sla eyp(u7m var1, int var2) {
      return this._1p(new erg(var1, 1, var2)).yea();
   }

   public dbw _1p(erg param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: invokevirtual erg.gn1 ()Lu7m;
      // 04: astore 3
      // 05: invokestatic OpaquePredicate.b ()I
      // 08: aload 0
      // 09: aload 3
      // 0a: aload 0
      // 0b: aload 1
      // 0c: invokevirtual a6o.j6y (Lerg;)I
      // 0f: invokevirtual a6o.unc (Lu7m;I)Ldbw;
      // 12: astore 4
      // 14: istore 2
      // 15: aload 4
      // 17: iload 2
      // 18: ifeq 36
      // 1b: ifnonnull 51
      // 1e: goto 25
      // 21: invokestatic a6o.a (Loov;)Loov;
      // 24: athrow
      // 25: aload 0
      // 26: getfield a6o.sf2 Ljava/util/Map;
      // 29: aload 3
      // 2a: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 2f: goto 36
      // 32: invokestatic a6o.a (Loov;)Loov;
      // 35: athrow
      // 36: checkcast idp
      // 39: astore 5
      // 3b: aload 5
      // 3d: ifnull 51
      // 40: aload 0
      // 41: getfield a6o.npb Lv58;
      // 44: aload 5
      // 46: aload 1
      // 47: invokeinterface idp.zz2 (Lerg;)Lzlz; 2
      // 4c: invokevirtual v58.a92 (Lzlz;)Ldbw;
      // 4f: astore 4
      // 51: getstatic net/optifine/reflect/Reflector.ForgeHooksClient Lnet/optifine/reflect/ReflectorClass;
      // 54: invokevirtual net/optifine/reflect/ReflectorClass.exists ()Z
      // 57: iload 2
      // 58: ifeq 7c
      // 5b: ifeq 8c
      // 5e: goto 65
      // 61: invokestatic a6o.a (Loov;)Loov;
      // 64: athrow
      // 65: aload 4
      // 67: iload 2
      // 68: ifeq 8e
      // 6b: goto 72
      // 6e: invokestatic a6o.a (Loov;)Loov;
      // 71: athrow
      // 72: instanceof ycv
      // 75: goto 7c
      // 78: invokestatic a6o.a (Loov;)Loov;
      // 7b: athrow
      // 7c: ifeq 8c
      // 7f: aload 4
      // 81: checkcast ycv
      // 84: aload 1
      // 85: invokeinterface ycv.gak (Lerg;)Ldbw; 2
      // 8a: astore 4
      // 8c: aload 4
      // 8e: iload 2
      // 8f: ifeq aa
      // 92: ifnonnull ac
      // 95: goto 9c
      // 98: invokestatic a6o.a (Loov;)Loov;
      // 9b: athrow
      // 9c: aload 0
      // 9d: getfield a6o.npb Lv58;
      // a0: invokevirtual v58.ohw ()Ldbw;
      // a3: goto aa
      // a6: invokestatic a6o.a (Loov;)Loov;
      // a9: athrow
      // aa: astore 4
      // ac: invokestatic hxt.bdl ()Z
      // af: ifeq bf
      // b2: aload 1
      // b3: aload 4
      // b5: aconst_null
      // b6: checkcast gdz
      // b9: bipush 1
      // ba: invokestatic net/optifine/CustomItems.getCustomItemModel (Lerg;Ldbw;Lgdz;Z)Ldbw;
      // bd: astore 4
      // bf: aload 4
      // c1: areturn
   }

   public int j6y(erg param1) {
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
      // 05: iload 2
      // 06: ifne 1f
      // 09: invokevirtual erg.dw2 ()Z
      // 0c: ifeq 1e
      // 0f: goto 16
      // 12: invokestatic a6o.a (Loov;)Loov;
      // 15: athrow
      // 16: bipush 0
      // 17: goto 22
      // 1a: invokestatic a6o.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 1
      // 1f: invokevirtual erg.j6_ ()I
      // 22: ireturn
   }

   public dbw unc(u7m var1, int var2) {
      return (dbw)this.yqk.get(this.s4j(var1, var2));
   }

   private int s4j(u7m var1, int var2) {
      return u7m._lo(var1) << 16 | var2;
   }

   public void zuv(u7m var1, int var2, zlz var3) {
      this.mot.put(this.s4j(var1, var2), var3);
      this.yqk.put(this.s4j(var1, var2), this.npb.a92(var3));
   }

   public void ta1(u7m var1, idp var2) {
      this.sf2.put(var1, var2);
   }

   public v58 mkp() {
      return this.npb;
   }

   public void r57() {
      this.yqk.clear();
      int var10000 = OpaquePredicate.b();
      Iterator var2 = this.mot.entrySet().iterator();
      int var1 = var10000;

      while (var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         this.yqk.put(var3.getKey(), this.npb.a92((zlz)var3.getValue()));
         if (var1 == 0) {
            break;
         }
      }
   }

   private static oov a(oov var0) {
      return var0;
   }
}
