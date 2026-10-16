import net.minecraft.tileentity.TileEntityDropper;

public class swe extends okn {
   @Override
   public m1p a6_(erg var1) {
      return this.ctf;
   }

   @Override
   public pyk ie9(t9d var1, int var2) {
      return new TileEntityDropper();
   }

   @Override
   public void p87(t9d param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: new dul
      // 003: dup
      // 004: aload 1
      // 005: aload 2
      // 006: invokespecial dul.<init> (Lt9d;Lmew;)V
      // 009: astore 4
      // 00b: invokestatic t9d.c ()I
      // 00e: aload 4
      // 010: invokevirtual dul.ztz ()Lpyk;
      // 013: checkcast net/minecraft/tileentity/TileEntityDispenser
      // 016: astore 5
      // 018: istore 3
      // 019: aload 5
      // 01b: iload 3
      // 01c: ifne 02b
      // 01f: ifnull 12a
      // 022: goto 029
      // 025: invokestatic swe.b (Loov;)Loov;
      // 028: athrow
      // 029: aload 5
      // 02b: invokevirtual net/minecraft/tileentity/TileEntityDispenser._ob ()I
      // 02e: istore 6
      // 030: iload 3
      // 031: ifne 050
      // 034: iload 6
      // 036: ifge 054
      // 039: goto 040
      // 03c: invokestatic swe.b (Loov;)Loov;
      // 03f: athrow
      // 040: aload 1
      // 041: sipush 1001
      // 044: aload 2
      // 045: bipush 0
      // 046: invokevirtual t9d.qca (ILmew;I)V
      // 049: goto 050
      // 04c: invokestatic swe.b (Loov;)Loov;
      // 04f: athrow
      // 050: iload 3
      // 051: ifeq 12a
      // 054: aload 5
      // 056: iload 6
      // 058: invokevirtual net/minecraft/tileentity/TileEntityDispenser.ibn (I)Lerg;
      // 05b: astore 7
      // 05d: aload 7
      // 05f: ifnull 12a
      // 062: aload 1
      // 063: aload 2
      // 064: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 067: getstatic swe.mfy Lqx_;
      // 06a: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 06f: checkcast vt2
      // 072: astore 8
      // 074: aload 2
      // 075: aload 8
      // 077: invokevirtual mew.offset (Lvt2;)Lmew;
      // 07a: astore 9
      // 07c: aload 1
      // 07d: aload 9
      // 07f: invokevirtual mew.getX ()I
      // 082: i2d
      // 083: aload 9
      // 085: invokevirtual mew.getY ()I
      // 088: i2d
      // 089: aload 9
      // 08b: invokevirtual mew.getZ ()I
      // 08e: i2d
      // 08f: invokestatic net/minecraft/tileentity/TileEntityHopper.ows (Lt9d;DDD)Lrsi;
      // 092: astore 10
      // 094: aload 10
      // 096: iload 3
      // 097: ifne 0db
      // 09a: ifnonnull 0d2
      // 09d: goto 0a4
      // 0a0: invokestatic swe.b (Loov;)Loov;
      // 0a3: athrow
      // 0a4: aload 0
      // 0a5: getfield swe.ctf Lm1p;
      // 0a8: aload 4
      // 0aa: aload 7
      // 0ac: invokeinterface m1p.r0k (Lsdf;Lerg;)Lerg; 3
      // 0b1: astore 11
      // 0b3: aload 11
      // 0b5: iload 3
      // 0b6: ifne 0c5
      // 0b9: ifnull 121
      // 0bc: goto 0c3
      // 0bf: invokestatic swe.b (Loov;)Loov;
      // 0c2: athrow
      // 0c3: aload 11
      // 0c5: getfield erg.qd2 I
      // 0c8: ifgt 121
      // 0cb: aconst_null
      // 0cc: astore 11
      // 0ce: iload 3
      // 0cf: ifeq 121
      // 0d2: aload 10
      // 0d4: goto 0db
      // 0d7: invokestatic swe.b (Loov;)Loov;
      // 0da: athrow
      // 0db: aload 7
      // 0dd: invokevirtual erg.yaq ()Lerg;
      // 0e0: bipush 1
      // 0e1: invokevirtual erg.amj (I)Lerg;
      // 0e4: aload 8
      // 0e6: invokevirtual vt2.b4b ()Lvt2;
      // 0e9: invokestatic net/minecraft/tileentity/TileEntityHopper.sop (Lrsi;Lerg;Lvt2;)Lerg;
      // 0ec: astore 11
      // 0ee: aload 11
      // 0f0: iload 3
      // 0f1: ifne 11f
      // 0f4: ifnonnull 11a
      // 0f7: goto 0fe
      // 0fa: invokestatic swe.b (Loov;)Loov;
      // 0fd: athrow
      // 0fe: aload 7
      // 100: invokevirtual erg.yaq ()Lerg;
      // 103: astore 11
      // 105: aload 11
      // 107: dup
      // 108: getfield erg.qd2 I
      // 10b: bipush 1
      // 10c: isub
      // 10d: dup_x1
      // 10e: putfield erg.qd2 I
      // 111: ifgt 121
      // 114: aconst_null
      // 115: astore 11
      // 117: goto 121
      // 11a: aload 7
      // 11c: invokevirtual erg.yaq ()Lerg;
      // 11f: astore 11
      // 121: aload 5
      // 123: iload 6
      // 125: aload 11
      // 127: invokevirtual net/minecraft/tileentity/TileEntityDispenser.cxl (ILerg;)V
      // 12a: return
   }

   private static oov b(oov var0) {
      return var0;
   }
}
