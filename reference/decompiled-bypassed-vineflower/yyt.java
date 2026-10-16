import java.io.DataInput;
import java.io.DataOutput;

public class yyt extends gdw$q1_ {
   private byte dd7;

   public yyt() {
   }

   public yyt(byte var1) {
      this.dd7 = var1;
   }

   @Override
   public void b_8(DataOutput var1) {
      var1.writeByte(this.dd7);
   }

   @Override
   public void zwk(DataInput var1, int var2, btc var3) {
      var3.es9(72L);
      this.dd7 = var1.readByte();
   }

   @Override
   public byte ky0() {
      return 1;
   }

   @Override
   public String toString() {
      return "" + this.dd7 + "b";
   }

   @Override
   public gdw h33() {
      return new yyt(this.dd7);
   }

   @Override
   public boolean equals(Object param1) {
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
      // 06: invokespecial gdw$q1_.equals (Ljava/lang/Object;)Z
      // 09: iload 2
      // 0a: ifeq 40
      // 0d: ifeq 3f
      // 10: goto 17
      // 13: invokestatic yyt.a (Loov;)Loov;
      // 16: athrow
      // 17: aload 1
      // 18: checkcast yyt
      // 1b: astore 3
      // 1c: aload 0
      // 1d: getfield yyt.dd7 B
      // 20: iload 2
      // 21: ifeq 3a
      // 24: aload 3
      // 25: getfield yyt.dd7 B
      // 28: if_icmpne 3d
      // 2b: goto 32
      // 2e: invokestatic yyt.a (Loov;)Loov;
      // 31: athrow
      // 32: bipush 1
      // 33: goto 3a
      // 36: invokestatic yyt.a (Loov;)Loov;
      // 39: athrow
      // 3a: goto 3e
      // 3d: bipush 0
      // 3e: ireturn
      // 3f: bipush 0
      // 40: ireturn
   }

   @Override
   public int hashCode() {
      return super.hashCode() ^ this.dd7;
   }

   @Override
   public long taw() {
      return (long)this.dd7;
   }

   @Override
   public int r9u() {
      return this.dd7;
   }

   @Override
   public short sgm() {
      return (short)this.dd7;
   }

   @Override
   public byte t7_() {
      return this.dd7;
   }

   @Override
   public double td3() {
      return (double)this.dd7;
   }

   @Override
   public float qaj() {
      return (float)this.dd7;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
