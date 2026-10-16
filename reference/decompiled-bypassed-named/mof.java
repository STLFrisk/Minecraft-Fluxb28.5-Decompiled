import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.opengl.GL11;

public class mof extends Module {
   public BooleanSetting miw;
   public BooleanSetting jct;
   public BooleanSetting qov;
   public BooleanSetting ybo;
   public BooleanSetting xo7;
   public BooleanSetting te6;
   public BooleanSetting _mb;
   public BooleanSetting zoz;
   public NumberSetting ffi;
   public NumberSetting nzc;
   public fx6 rl0;
   public fx6 uhg;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public mof() {
      long var1 = a ^ 138121799628522L;
      super(b<"m">(7973, 2738055528071313224L ^ var1), _aj.sxc, false, new SubEngine[0]);
      this.miw = new BooleanSetting(b<"m">(31667, 4838966271723918292L ^ var1), b<"m">(6138, 3969794513185456020L ^ var1), true);
      this.jct = new BooleanSetting(b<"m">(31667, 4838966271723918292L ^ var1), b<"m">(12679, 5781278274910788078L ^ var1), true);
      this.qov = new BooleanSetting(b<"m">(31667, 4838966271723918292L ^ var1), b<"m">(17286, 3965619153695632354L ^ var1), true);
      this.ybo = new BooleanSetting(b<"m">(31667, 4838966271723918292L ^ var1), b<"m">(30972, 4104518694214389910L ^ var1), true);
      this.xo7 = new BooleanSetting(b<"m">(31667, 4838966271723918292L ^ var1), b<"m">(8903, 4876198581512899240L ^ var1), true);
      this.te6 = new BooleanSetting(b<"m">(31667, 4838966271723918292L ^ var1), b<"m">(14263, 2816486474026786769L ^ var1), true);
      this._mb = new BooleanSetting(b<"m">(31667, 4838966271723918292L ^ var1), b<"m">(15061, 2978434188233380541L ^ var1), true);
      this.zoz = new BooleanSetting(b<"m">(31667, 4838966271723918292L ^ var1), b<"m">(3350, 1766657270498469235L ^ var1), true);
      this.ffi = new NumberSetting(b<"m">(31667, 4838966271723918292L ^ var1), b<"m">(15869, 9090647521497617814L ^ var1), 2.0F, 1.0F, 5.0F, 1.0F);
      this.nzc = new NumberSetting(b<"m">(31667, 4838966271723918292L ^ var1), b<"m">(27827, 8088051628940772575L ^ var1), 32.0F, 20.0F, 100.0F, 1.0F);
   }

   @Override
   public void onEnable() {
      this.rl0 = new fx6(20, this.ffi);
      this.uhg = new fx6(this.nzc, this.ffi);
      super.onEnable();
   }

   @Override
   public void onDisable() {
      super.onDisable();
   }

   public static float[] tsp(mew param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 1
      // 004: getstatic mof.ek1 Lc05;
      // 007: getfield Minecraft.tij Lkh3;
      // 00a: aload 0
      // 00b: invokevirtual WorldClient.getBlockState (Lmew;)Lzfz;
      // 00e: invokeinterface zfz.r_y ()Le0x; 1
      // 013: astore 2
      // 014: getstatic ox_._dt Le0x;
      // 017: aload 2
      // 018: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 01b: iload 1
      // 01c: ifne 044
      // 01f: ifeq 03d
      // 022: goto 029
      // 025: invokestatic mof.a (Loov;)Loov;
      // 028: athrow
      // 029: bipush 3
      // 02a: newarray 6
      // 02c: dup
      // 02d: bipush 0
      // 02e: fconst_0
      // 02f: fastore
      // 030: dup
      // 031: bipush 1
      // 032: fconst_1
      // 033: fastore
      // 034: dup
      // 035: bipush 2
      // 036: fconst_1
      // 037: fastore
      // 038: areturn
      // 039: invokestatic mof.a (Loov;)Loov;
      // 03c: athrow
      // 03d: getstatic ox_.po5 Le0x;
      // 040: aload 2
      // 041: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 044: iload 1
      // 045: ifne 06d
      // 048: ifeq 066
      // 04b: goto 052
      // 04e: invokestatic mof.a (Loov;)Loov;
      // 051: athrow
      // 052: bipush 3
      // 053: newarray 6
      // 055: dup
      // 056: bipush 0
      // 057: fconst_0
      // 058: fastore
      // 059: dup
      // 05a: bipush 1
      // 05b: fconst_0
      // 05c: fastore
      // 05d: dup
      // 05e: bipush 2
      // 05f: fconst_1
      // 060: fastore
      // 061: areturn
      // 062: invokestatic mof.a (Loov;)Loov;
      // 065: athrow
      // 066: getstatic ox_.k03 Le0x;
      // 069: aload 2
      // 06a: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 06d: iload 1
      // 06e: ifne 096
      // 071: ifeq 08f
      // 074: goto 07b
      // 077: invokestatic mof.a (Loov;)Loov;
      // 07a: athrow
      // 07b: bipush 3
      // 07c: newarray 6
      // 07e: dup
      // 07f: bipush 0
      // 080: fconst_1
      // 081: fastore
      // 082: dup
      // 083: bipush 1
      // 084: fconst_1
      // 085: fastore
      // 086: dup
      // 087: bipush 2
      // 088: fconst_1
      // 089: fastore
      // 08a: areturn
      // 08b: invokestatic mof.a (Loov;)Loov;
      // 08e: athrow
      // 08f: getstatic ox_.__k Le0x;
      // 092: aload 2
      // 093: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 096: iload 1
      // 097: ifne 0bf
      // 09a: ifeq 0b8
      // 09d: goto 0a4
      // 0a0: invokestatic mof.a (Loov;)Loov;
      // 0a3: athrow
      // 0a4: bipush 3
      // 0a5: newarray 6
      // 0a7: dup
      // 0a8: bipush 0
      // 0a9: fconst_1
      // 0aa: fastore
      // 0ab: dup
      // 0ac: bipush 1
      // 0ad: fconst_1
      // 0ae: fastore
      // 0af: dup
      // 0b0: bipush 2
      // 0b1: fconst_0
      // 0b2: fastore
      // 0b3: areturn
      // 0b4: invokestatic mof.a (Loov;)Loov;
      // 0b7: athrow
      // 0b8: getstatic ox_.sm_ Le0x;
      // 0bb: aload 2
      // 0bc: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 0bf: iload 1
      // 0c0: ifne 0e8
      // 0c3: ifeq 0e1
      // 0c6: goto 0cd
      // 0c9: invokestatic mof.a (Loov;)Loov;
      // 0cc: athrow
      // 0cd: bipush 3
      // 0ce: newarray 6
      // 0d0: dup
      // 0d1: bipush 0
      // 0d2: fconst_0
      // 0d3: fastore
      // 0d4: dup
      // 0d5: bipush 1
      // 0d6: fconst_0
      // 0d7: fastore
      // 0d8: dup
      // 0d9: bipush 2
      // 0da: fconst_0
      // 0db: fastore
      // 0dc: areturn
      // 0dd: invokestatic mof.a (Loov;)Loov;
      // 0e0: athrow
      // 0e1: getstatic ox_.aiy Le0x;
      // 0e4: aload 2
      // 0e5: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 0e8: iload 1
      // 0e9: ifne 111
      // 0ec: ifeq 10a
      // 0ef: goto 0f6
      // 0f2: invokestatic mof.a (Loov;)Loov;
      // 0f5: athrow
      // 0f6: bipush 3
      // 0f7: newarray 6
      // 0f9: dup
      // 0fa: bipush 0
      // 0fb: fconst_0
      // 0fc: fastore
      // 0fd: dup
      // 0fe: bipush 1
      // 0ff: fconst_1
      // 100: fastore
      // 101: dup
      // 102: bipush 2
      // 103: fconst_0
      // 104: fastore
      // 105: areturn
      // 106: invokestatic mof.a (Loov;)Loov;
      // 109: athrow
      // 10a: getstatic ox_.axm Le0x;
      // 10d: aload 2
      // 10e: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 111: iload 1
      // 112: ifne 13c
      // 115: ifne 13b
      // 118: goto 11f
      // 11b: invokestatic mof.a (Loov;)Loov;
      // 11e: athrow
      // 11f: getstatic ox_.ru1 Le0x;
      // 122: aload 2
      // 123: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 126: iload 1
      // 127: ifne 14c
      // 12a: goto 131
      // 12d: invokestatic mof.a (Loov;)Loov;
      // 130: athrow
      // 131: ifeq 14b
      // 134: goto 13b
      // 137: invokestatic mof.a (Loov;)Loov;
      // 13a: athrow
      // 13b: bipush 3
      // 13c: newarray 6
      // 13e: dup
      // 13f: bipush 0
      // 140: fconst_1
      // 141: fastore
      // 142: dup
      // 143: bipush 1
      // 144: fconst_0
      // 145: fastore
      // 146: dup
      // 147: bipush 2
      // 148: fconst_0
      // 149: fastore
      // 14a: areturn
      // 14b: bipush 3
      // 14c: newarray 6
      // 14e: dup
      // 14f: bipush 0
      // 150: fconst_0
      // 151: fastore
      // 152: dup
      // 153: bipush 1
      // 154: fconst_0
      // 155: fastore
      // 156: dup
      // 157: bipush 2
      // 158: fconst_0
      // 159: fastore
      // 15a: areturn
   }

   public boolean af9(mew param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 2
      // 004: getstatic mof.ek1 Lc05;
      // 007: getfield Minecraft.tij Lkh3;
      // 00a: aload 1
      // 00b: invokevirtual WorldClient.getBlockState (Lmew;)Lzfz;
      // 00e: invokeinterface zfz.r_y ()Le0x; 1
      // 013: astore 3
      // 014: getstatic ox_._dt Le0x;
      // 017: aload 3
      // 018: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 01b: iload 2
      // 01c: ifeq 03c
      // 01f: ifeq 035
      // 022: goto 029
      // 025: invokestatic mof.a (Loov;)Loov;
      // 028: athrow
      // 029: aload 0
      // 02a: getfield mof.miw Lcn7;
      // 02d: invokevirtual BooleanSetting.g7m ()Z
      // 030: ireturn
      // 031: invokestatic mof.a (Loov;)Loov;
      // 034: athrow
      // 035: getstatic ox_.po5 Le0x;
      // 038: aload 3
      // 039: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 03c: iload 2
      // 03d: ifeq 05d
      // 040: ifeq 056
      // 043: goto 04a
      // 046: invokestatic mof.a (Loov;)Loov;
      // 049: athrow
      // 04a: aload 0
      // 04b: getfield mof.qov Lcn7;
      // 04e: invokevirtual BooleanSetting.g7m ()Z
      // 051: ireturn
      // 052: invokestatic mof.a (Loov;)Loov;
      // 055: athrow
      // 056: getstatic ox_.k03 Le0x;
      // 059: aload 3
      // 05a: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 05d: iload 2
      // 05e: ifeq 07e
      // 061: ifeq 077
      // 064: goto 06b
      // 067: invokestatic mof.a (Loov;)Loov;
      // 06a: athrow
      // 06b: aload 0
      // 06c: getfield mof.jct Lcn7;
      // 06f: invokevirtual BooleanSetting.g7m ()Z
      // 072: ireturn
      // 073: invokestatic mof.a (Loov;)Loov;
      // 076: athrow
      // 077: getstatic ox_.__k Le0x;
      // 07a: aload 3
      // 07b: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 07e: iload 2
      // 07f: ifeq 09f
      // 082: ifeq 098
      // 085: goto 08c
      // 088: invokestatic mof.a (Loov;)Loov;
      // 08b: athrow
      // 08c: aload 0
      // 08d: getfield mof.xo7 Lcn7;
      // 090: invokevirtual BooleanSetting.g7m ()Z
      // 093: ireturn
      // 094: invokestatic mof.a (Loov;)Loov;
      // 097: athrow
      // 098: getstatic ox_.sm_ Le0x;
      // 09b: aload 3
      // 09c: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 09f: iload 2
      // 0a0: ifeq 0c0
      // 0a3: ifeq 0b9
      // 0a6: goto 0ad
      // 0a9: invokestatic mof.a (Loov;)Loov;
      // 0ac: athrow
      // 0ad: aload 0
      // 0ae: getfield mof.te6 Lcn7;
      // 0b1: invokevirtual BooleanSetting.g7m ()Z
      // 0b4: ireturn
      // 0b5: invokestatic mof.a (Loov;)Loov;
      // 0b8: athrow
      // 0b9: getstatic ox_.aiy Le0x;
      // 0bc: aload 3
      // 0bd: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 0c0: iload 2
      // 0c1: ifeq 0e1
      // 0c4: ifeq 0da
      // 0c7: goto 0ce
      // 0ca: invokestatic mof.a (Loov;)Loov;
      // 0cd: athrow
      // 0ce: aload 0
      // 0cf: getfield mof.ybo Lcn7;
      // 0d2: invokevirtual BooleanSetting.g7m ()Z
      // 0d5: ireturn
      // 0d6: invokestatic mof.a (Loov;)Loov;
      // 0d9: athrow
      // 0da: getstatic ox_.axm Le0x;
      // 0dd: aload 3
      // 0de: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 0e1: iload 2
      // 0e2: ifeq 119
      // 0e5: ifne 10b
      // 0e8: goto 0ef
      // 0eb: invokestatic mof.a (Loov;)Loov;
      // 0ee: athrow
      // 0ef: getstatic ox_.ru1 Le0x;
      // 0f2: aload 3
      // 0f3: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 0f6: iload 2
      // 0f7: ifeq 11b
      // 0fa: goto 101
      // 0fd: invokestatic mof.a (Loov;)Loov;
      // 100: athrow
      // 101: ifeq 11a
      // 104: goto 10b
      // 107: invokestatic mof.a (Loov;)Loov;
      // 10a: athrow
      // 10b: aload 0
      // 10c: getfield mof._mb Lcn7;
      // 10f: invokevirtual BooleanSetting.g7m ()Z
      // 112: goto 119
      // 115: invokestatic mof.a (Loov;)Loov;
      // 118: athrow
      // 119: ireturn
      // 11a: bipush 0
      // 11b: ireturn
   }

   public Boolean yub(mew param1, double param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: new java/util/ArrayList
      // 003: dup
      // 004: invokespecial java/util/ArrayList.<init> ()V
      // 007: astore 5
      // 009: new java/util/ArrayList
      // 00c: dup
      // 00d: aload 1
      // 00e: invokestatic java/util/Collections.singletonList (Ljava/lang/Object;)Ljava/util/List;
      // 011: invokespecial java/util/ArrayList.<init> (Ljava/util/Collection;)V
      // 014: astore 6
      // 016: invokestatic OpaquePredicate.c ()I
      // 019: new java/util/ArrayList
      // 01c: dup
      // 01d: invokespecial java/util/ArrayList.<init> ()V
      // 020: astore 7
      // 022: bipush 0
      // 023: istore 8
      // 025: istore 4
      // 027: iload 8
      // 029: i2d
      // 02a: dload 2
      // 02b: dcmpg
      // 02c: ifge 12a
      // 02f: aload 6
      // 031: iload 4
      // 033: ifne 14f
      // 036: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 03b: astore 9
      // 03d: aload 9
      // 03f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 044: ifeq 0b2
      // 047: aload 9
      // 049: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 04e: checkcast mew
      // 051: astore 10
      // 053: aload 5
      // 055: aload 10
      // 057: invokevirtual mew.nuv ()Lmew;
      // 05a: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 05f: pop
      // 060: aload 5
      // 062: aload 10
      // 064: invokevirtual mew.eve ()Lmew;
      // 067: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 06c: pop
      // 06d: aload 5
      // 06f: aload 10
      // 071: invokevirtual mew.idu ()Lmew;
      // 074: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 079: pop
      // 07a: aload 5
      // 07c: aload 10
      // 07e: invokevirtual mew.z6x ()Lmew;
      // 081: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 086: pop
      // 087: aload 5
      // 089: aload 10
      // 08b: invokevirtual mew.y8e ()Lmew;
      // 08e: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 093: pop
      // 094: aload 5
      // 096: aload 10
      // 098: invokevirtual mew.o_8 ()Lmew;
      // 09b: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 0a0: pop
      // 0a1: iload 4
      // 0a3: ifne 0bb
      // 0a6: iload 4
      // 0a8: ifeq 03d
      // 0ab: goto 0b2
      // 0ae: invokestatic mof.a (Loov;)Loov;
      // 0b1: athrow
      // 0b2: aload 5
      // 0b4: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 0b9: astore 9
      // 0bb: aload 9
      // 0bd: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0c2: ifeq 10b
      // 0c5: aload 9
      // 0c7: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0cc: checkcast mew
      // 0cf: astore 10
      // 0d1: aload 6
      // 0d3: aload 10
      // 0d5: invokeinterface java/util/Collection.contains (Ljava/lang/Object;)Z 2
      // 0da: iload 4
      // 0dc: ifne 118
      // 0df: iload 4
      // 0e1: ifne 105
      // 0e4: goto 0eb
      // 0e7: invokestatic mof.a (Loov;)Loov;
      // 0ea: athrow
      // 0eb: ifeq 106
      // 0ee: goto 0f5
      // 0f1: invokestatic mof.a (Loov;)Loov;
      // 0f4: athrow
      // 0f5: aload 5
      // 0f7: aload 10
      // 0f9: invokeinterface java/util/Collection.remove (Ljava/lang/Object;)Z 2
      // 0fe: goto 105
      // 101: invokestatic mof.a (Loov;)Loov;
      // 104: athrow
      // 105: pop
      // 106: iload 4
      // 108: ifeq 0bb
      // 10b: aload 5
      // 10d: astore 6
      // 10f: aload 7
      // 111: aload 5
      // 113: invokeinterface java/util/Collection.addAll (Ljava/util/Collection;)Z 2
      // 118: pop
      // 119: new java/util/ArrayList
      // 11c: dup
      // 11d: invokespecial java/util/ArrayList.<init> ()V
      // 120: astore 5
      // 122: iinc 8 1
      // 125: iload 4
      // 127: ifeq 027
      // 12a: bipush 5
      // 12b: anewarray 145
      // 12e: dup
      // 12f: bipush 0
      // 130: getstatic ox_.gdz Les2;
      // 133: aastore
      // 134: dup
      // 135: bipush 1
      // 136: getstatic ox_.ska Les2;
      // 139: aastore
      // 13a: dup
      // 13b: bipush 2
      // 13c: getstatic ox_.dr2 L_13;
      // 13f: aastore
      // 140: dup
      // 141: bipush 3
      // 142: getstatic ox_.ibw Le0x;
      // 145: aastore
      // 146: dup
      // 147: bipush 4
      // 148: getstatic ox_.whp L_13;
      // 14b: aastore
      // 14c: invokestatic java/util/Arrays.asList ([Ljava/lang/Object;)Ljava/util/List;
      // 14f: astore 8
      // 151: aload 7
      // 153: invokeinterface java/util/Collection.stream ()Ljava/util/stream/Stream; 1
      // 158: aload 8
      // 15a: invokedynamic test (Ljava/util/List;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, mof.tu9 (Ljava/util/List;Lmew;)Z, (Lmew;)Z ]
      // 15f: invokeinterface java/util/stream/Stream.anyMatch (Ljava/util/function/Predicate;)Z 2
      // 164: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 167: areturn
   }

   @EventHandler
   public void nb5(b5k param1) {
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
      // 05: getfield mof.rl0 Lfx6;
      // 08: getfield fx6.zpp Z
      // 0b: iload 2
      // 0c: ifne 39
      // 0f: ifne 27
      // 12: goto 19
      // 15: invokestatic mof.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield mof.rl0 Lfx6;
      // 1d: invokevirtual fx6.start ()V
      // 20: goto 27
      // 23: invokestatic mof.a (Loov;)Loov;
      // 26: athrow
      // 27: aload 0
      // 28: getfield mof.uhg Lfx6;
      // 2b: iload 2
      // 2c: ifne 4e
      // 2f: getfield fx6.zpp Z
      // 32: goto 39
      // 35: invokestatic mof.a (Loov;)Loov;
      // 38: athrow
      // 39: ifne 4a
      // 3c: aload 0
      // 3d: getfield mof.uhg Lfx6;
      // 40: invokevirtual fx6.start ()V
      // 43: goto 4a
      // 46: invokestatic mof.a (Loov;)Loov;
      // 49: athrow
      // 4a: aload 0
      // 4b: getfield mof.rl0 Lfx6;
      // 4e: getfield fx6.qwp Ljava/util/List;
      // 51: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 56: astore 3
      // 57: aload 3
      // 58: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 5d: ifeq 80
      // 60: aload 3
      // 61: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 66: checkcast mew
      // 69: astore 4
      // 6b: aload 0
      // 6c: aload 4
      // 6e: invokespecial mof.vh7 (Lmew;)V
      // 71: iload 2
      // 72: ifne 8d
      // 75: iload 2
      // 76: ifeq 57
      // 79: goto 80
      // 7c: invokestatic mof.a (Loov;)Loov;
      // 7f: athrow
      // 80: aload 0
      // 81: getfield mof.uhg Lfx6;
      // 84: getfield fx6.qwp Ljava/util/List;
      // 87: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 8c: astore 3
      // 8d: aload 3
      // 8e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 93: ifeq ab
      // 96: aload 3
      // 97: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 9c: checkcast mew
      // 9f: astore 4
      // a1: aload 0
      // a2: aload 4
      // a4: invokespecial mof.vh7 (Lmew;)V
      // a7: iload 2
      // a8: ifeq 8d
      // ab: return
   }

   private void vh7(mew var1) {
      try {
         if (ek1.tij.getBlockState(var1).r_y().p1r() == p3y.cei) {
            return;
         }
      } catch (oov var9) {
         throw a(var9);
      }

      double var2 = (double)var1.getX() - ek1.ibs().yky();
      double var4 = (double)var1.getY() - ek1.ibs().fxk();
      double var6 = (double)var1.getZ() - ek1.ibs().kux();
      float[] var8 = tsp(var1);
      awr(var2, var4, var6, var8[0], var8[1], var8[2], 0.5F, 3.0F);
   }

   public static void awr(double var0, double var2, double var4, float var6, float var7, float var8, float var9, float var10) {
      GL11.glPushMatrix();
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glDisable(3553);
      GL11.glEnable(2848);
      GL11.glDisable(2929);
      GL11.glDepthMask(false);
      GL11.glLineWidth(var10);
      GL11.glColor4f(var6, var7, var8, var9);
      q0u(new nh4(var0, var2, var4, var0 + 1.0, var2 + 1.0, var4 + 1.0));
      GL11.glDisable(2848);
      GL11.glEnable(3553);
      GL11.glEnable(2929);
      GL11.glDepthMask(true);
      GL11.glDisable(3042);
      GL11.glPopMatrix();
   }

   public static void q0u(nh4 var0) {
      jom var1 = jom.yut();
      q3g var2 = var1.zuq();
      var2.ezr(3, gnl.gx3);
      var2.g5o(var0.rlc, var0.bx_, var0.t8n).pzw();
      var2.g5o(var0.t_2, var0.bx_, var0.t8n).pzw();
      var2.g5o(var0.t_2, var0.bx_, var0.oqj).pzw();
      var2.g5o(var0.rlc, var0.bx_, var0.oqj).pzw();
      var2.g5o(var0.rlc, var0.bx_, var0.t8n).pzw();
      var1.q7g();
      var2.ezr(3, gnl.gx3);
      var2.g5o(var0.rlc, var0.i2c, var0.t8n).pzw();
      var2.g5o(var0.t_2, var0.i2c, var0.t8n).pzw();
      var2.g5o(var0.t_2, var0.i2c, var0.oqj).pzw();
      var2.g5o(var0.rlc, var0.i2c, var0.oqj).pzw();
      var2.g5o(var0.rlc, var0.i2c, var0.t8n).pzw();
      var1.q7g();
      var2.ezr(1, gnl.gx3);
      var2.g5o(var0.rlc, var0.bx_, var0.t8n).pzw();
      var2.g5o(var0.rlc, var0.i2c, var0.t8n).pzw();
      var2.g5o(var0.t_2, var0.bx_, var0.t8n).pzw();
      var2.g5o(var0.t_2, var0.i2c, var0.t8n).pzw();
      var2.g5o(var0.t_2, var0.bx_, var0.oqj).pzw();
      var2.g5o(var0.t_2, var0.i2c, var0.oqj).pzw();
      var2.g5o(var0.rlc, var0.bx_, var0.oqj).pzw();
      var2.g5o(var0.rlc, var0.i2c, var0.oqj).pzw();
      var1.q7g();
   }

   private static boolean tu9(List var0, mew var1) {
      return var0.contains(ek1.tij.getBlockState(var1).r_y());
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(5976717351845791612L, -519775870970458088L, MethodHandles.lookup().lookupClass()).a(118493061040587L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 92773907395854L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[12];
      int var7 = 0;
      String var6 = "¾\u0097«³ÏÙÊ\u001a\u0093wÏ|\u001e\u000fJô\u0018·\u0001´9*vÇTRí¤YÌBÁ[ ;\u0005»\u0089öÕ»\u0010\u008aÒ\u008e\n_£ä_\u0087M£mªF\u0007W\u0010µ÷OI:\u0090g\u009e-4¬äRd\u0094Ï dLjm(ò_ä0V})\u00adÅl\u0085Ùo\u0082úñ·\u0081ñ\u0010\u0006¡¼HPRó\u0010\u0089.}ÍgyNÒgÂ,Ël«ðÌ\u0010o\u009850Å7\u0089ß\u0082F\u0080\u008cT\u0005¸B ¨~t\u009aå=ÕP\u0090\u0016ä\u0090³¤P{«ýZ\u0083\u009b\u0092(ýIÐßã¶\"gì\u0010\u0084ù\u0015£\u0082ÚÝÝ*/zÌì\u0087\u0096.\u0010'\u00adÃ*«ÿÄÎÍ\bþ\u00adª¿ÿw";
      int var8 = "¾\u0097«³ÏÙÊ\u001a\u0093wÏ|\u001e\u000fJô\u0018·\u0001´9*vÇTRí¤YÌBÁ[ ;\u0005»\u0089öÕ»\u0010\u008aÒ\u008e\n_£ä_\u0087M£mªF\u0007W\u0010µ÷OI:\u0090g\u009e-4¬äRd\u0094Ï dLjm(ò_ä0V})\u00adÅl\u0085Ùo\u0082úñ·\u0081ñ\u0010\u0006¡¼HPRó\u0010\u0089.}ÍgyNÒgÂ,Ël«ðÌ\u0010o\u009850Å7\u0089ß\u0082F\u0080\u008cT\u0005¸B ¨~t\u009aå=ÕP\u0090\u0016ä\u0090³¤P{«ýZ\u0083\u009b\u0092(ýIÐßã¶\"gì\u0010\u0084ù\u0015£\u0082ÚÝÝ*/zÌì\u0087\u0096.\u0010'\u00adÃ*«ÿÄÎÍ\bþ\u00adª¿ÿw"
         .length();
      char var5 = 16;
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
                     f = var9;
                     g = new String[12];
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

                  var6 = ")ì\u0002?Èë´¿\u001a5;ÄZQÄ\u0003 \u0011C£¾;gªju»\u0006\u008bñÞpñÏ\u0013\f¡K¸\u009bù7å+\u0081ÖlU\u0095";
                  var8 = ")ì\u0002?Èë´¿\u001a5;ÄZQÄ\u0003 \u0011C£¾;gªju»\u0006\u008bñÞpñÏ\u0013\f¡K¸\u009bù7å+\u0081ÖlU\u0095".length();
                  var5 = 16;
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26801;
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
            throw new RuntimeException("mof", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = f[var5].getBytes("ISO-8859-1");
         g[var5] = b(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("mof" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
