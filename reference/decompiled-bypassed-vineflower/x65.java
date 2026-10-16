import com.google.common.collect.Maps;
import java.util.Map;

public class x65 {
   private static final x65 d84 = new x65();
   private Map xyg = Maps.newHashMap();
   private Map _1v = Maps.newHashMap();

   public static x65 eor() {
      return d84;
   }

   private x65() {
      this.z50(ox_.k03, new erg(xbr.icz), 0.7F);
      this.z50(ox_.__k, new erg(xbr.jtr), 1.0F);
      this.z50(ox_._dt, new erg(xbr.exg), 1.0F);
      this.z50(ox_.vd0, new erg(ox_.fzi), 0.1F);
      this.gg_(xbr.tf4, new erg(xbr.li3), 0.35F);
      this.gg_(xbr.v8v, new erg(xbr.lzo), 0.35F);
      this.gg_(xbr.o7i, new erg(xbr.sg4), 0.35F);
      this.gg_(xbr.yt3, new erg(xbr.sng), 0.35F);
      this.gg_(xbr.xnv, new erg(xbr.zkf), 0.35F);
      this.z50(ox_.a3_, new erg(ox_.pu8), 0.1F);
      this.wzr(new erg(ox_.ow_, 1, kuo.hu2), new erg(ox_.ow_, 1, kuo.kdv), 0.1F);
      this.gg_(xbr.dwk, new erg(xbr.ear), 0.3F);
      this.z50(ox_.rs4, new erg(ox_.o45), 0.35F);
      this.z50(ox_.hio, new erg(xbr.nnn, 1, qvg.u1l.b9d()), 0.2F);
      this.z50(ox_.uom, new erg(xbr.thr, 1, 1), 0.15F);
      this.z50(ox_.a4y, new erg(xbr.thr, 1, 1), 0.15F);
      this.z50(ox_.aiy, new erg(xbr.cu7), 1.0F);
      this.gg_(xbr.dzx, new erg(xbr.s8j), 0.35F);
      this.z50(ox_.pzt, new erg(xbr.n9n), 0.1F);
      this.wzr(new erg(ox_.u7i, 1, 1), new erg(ox_.u7i, 1, 0), 0.15F);

      for (po4$i4c var4 : po4$i4c.values()) {
         try {
            if (var4.xkf()) {
               this.wzr(new erg(xbr.h_h, 1, var4.iho()), new erg(xbr.lh3, 1, var4.iho()), 0.35F);
            }
         } catch (oov var5) {
            throw a(var5);
         }
      }

      this.z50(ox_.sm_, new erg(xbr.thr), 0.1F);
      this.z50(ox_.axm, new erg(xbr.deg), 0.7F);
      this.z50(ox_.po5, new erg(xbr.nnn, 1, qvg.o71.b9d()), 0.2F);
      this.z50(ox_.gjf, new erg(xbr.n2h), 0.2F);
   }

   public void z50(e0x var1, erg var2, float var3) {
      this.gg_(u7m.gfm(var1), var2, var3);
   }

   public void gg_(u7m var1, erg var2, float var3) {
      this.wzr(new erg(var1, 1, 32767), var2, var3);
   }

   public void wzr(erg var1, erg var2, float var3) {
      this.xyg.put(var1, var2);
      this._1v.put(var2, var3);
   }

   public erg jsl(erg param1) {
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
      // 05: getfield x65.xyg Ljava/util/Map;
      // 08: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 0d: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 12: astore 3
      // 13: aload 3
      // 14: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 19: ifeq 5a
      // 1c: aload 3
      // 1d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 22: checkcast java/util/Map$Entry
      // 25: astore 4
      // 27: aload 0
      // 28: iload 2
      // 29: ifeq 52
      // 2c: aload 1
      // 2d: aload 4
      // 2f: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 34: checkcast erg
      // 37: invokespecial x65.a1u (Lerg;Lerg;)Z
      // 3a: ifeq 56
      // 3d: goto 44
      // 40: invokestatic x65.a (Loov;)Loov;
      // 43: athrow
      // 44: aload 4
      // 46: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 4b: goto 52
      // 4e: invokestatic x65.a (Loov;)Loov;
      // 51: athrow
      // 52: checkcast erg
      // 55: areturn
      // 56: iload 2
      // 57: ifne 13
      // 5a: aconst_null
      // 5b: areturn
   }

   private boolean a1u(erg param1, erg param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: aload 2
      // 05: iload 3
      // 06: ifeq 22
      // 09: invokevirtual erg.gn1 ()Lu7m;
      // 0c: aload 1
      // 0d: invokevirtual erg.gn1 ()Lu7m;
      // 10: if_acmpne 5e
      // 13: goto 1a
      // 16: invokestatic x65.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 2
      // 1b: goto 22
      // 1e: invokestatic x65.a (Loov;)Loov;
      // 21: athrow
      // 22: invokevirtual erg.j6_ ()I
      // 25: iload 3
      // 26: ifeq 5b
      // 29: sipush 32767
      // 2c: if_icmpeq 53
      // 2f: goto 36
      // 32: invokestatic x65.a (Loov;)Loov;
      // 35: athrow
      // 36: aload 2
      // 37: invokevirtual erg.j6_ ()I
      // 3a: iload 3
      // 3b: ifeq 5b
      // 3e: goto 45
      // 41: invokestatic x65.a (Loov;)Loov;
      // 44: athrow
      // 45: aload 1
      // 46: invokevirtual erg.j6_ ()I
      // 49: if_icmpne 5e
      // 4c: goto 53
      // 4f: invokestatic x65.a (Loov;)Loov;
      // 52: athrow
      // 53: bipush 1
      // 54: goto 5b
      // 57: invokestatic x65.a (Loov;)Loov;
      // 5a: athrow
      // 5b: goto 5f
      // 5e: bipush 0
      // 5f: ireturn
   }

   public Map kgd() {
      return this.xyg;
   }

   public float vlt(erg param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield x65._1v Ljava/util/Map;
      // 08: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 0d: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 12: astore 3
      // 13: aload 3
      // 14: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 19: ifeq 5d
      // 1c: aload 3
      // 1d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 22: checkcast java/util/Map$Entry
      // 25: astore 4
      // 27: aload 0
      // 28: iload 2
      // 29: ifne 52
      // 2c: aload 1
      // 2d: aload 4
      // 2f: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 34: checkcast erg
      // 37: invokespecial x65.a1u (Lerg;Lerg;)Z
      // 3a: ifeq 59
      // 3d: goto 44
      // 40: invokestatic x65.a (Loov;)Loov;
      // 43: athrow
      // 44: aload 4
      // 46: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 4b: goto 52
      // 4e: invokestatic x65.a (Loov;)Loov;
      // 51: athrow
      // 52: checkcast java/lang/Float
      // 55: invokevirtual java/lang/Float.floatValue ()F
      // 58: freturn
      // 59: iload 2
      // 5a: ifeq 13
      // 5d: fconst_0
      // 5e: freturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
