import java.io.DataInput;
import java.io.DataOutput;
import java.util.Arrays;

public class mvq extends gdw {
   public mvq() {
   }

   public mvq(int[] var1) {
      this.ov8 = var1;
   }

   @Override
   public void b_8(DataOutput var1) {
      var1.writeInt(this.ov8.length);
      int var10000 = t9d.b();
      int var3 = 0;
      int var2 = var10000;

      while (var3 < this.ov8.length) {
         var1.writeInt(this.ov8[var3]);
         var3++;
         if (var2 == 0) {
            break;
         }
      }
   }

   @Override
   public void zwk(DataInput var1, int var2, btc var3) {
      var3.es9(192L);
      int var5 = var1.readInt();
      var3.es9((long)(32 * var5));
      this.ov8 = new int[var5];
      int var10000 = t9d.c();
      int var6 = 0;
      int var4 = var10000;

      while (var6 < var5) {
         this.ov8[var6] = var1.readInt();
         var6++;
         if (var4 != 0) {
            break;
         }
      }
   }

   @Override
   public byte ky0() {
      return 11;
   }

   @Override
   public String toString() {
      String var2 = "[";
      int[] var3 = this.ov8;
      int var4 = var3.length;
      int var10000 = t9d.c();
      int var5 = 0;
      int var1 = var10000;

      while (true) {
         if (var5 < var4) {
            int var6 = var3[var5];
            var7 = var2 + var6 + ",";
            if (var1 != 0) {
               break;
            }

            var2 = var7;
            var5++;
            if (var1 == 0) {
               continue;
            }
         }

         var7 = var2 + "]";
         break;
      }

      return var7;
   }

   @Override
   public gdw h33() {
      int[] var1 = new int[this.ov8.length];
      System.arraycopy(this.ov8, 0, var1, 0, this.ov8.length);
      return new mvq(var1);
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
      // 06: invokespecial gdw.equals (Ljava/lang/Object;)Z
      // 09: iload 2
      // 0a: ifeq 2c
      // 0d: ifeq 2f
      // 10: goto 17
      // 13: invokestatic mvq.a (Loov;)Loov;
      // 16: athrow
      // 17: aload 0
      // 18: getfield mvq.ov8 [I
      // 1b: aload 1
      // 1c: checkcast mvq
      // 1f: getfield mvq.ov8 [I
      // 22: invokestatic java/util/Arrays.equals ([I[I)Z
      // 25: goto 2c
      // 28: invokestatic mvq.a (Loov;)Loov;
      // 2b: athrow
      // 2c: goto 30
      // 2f: bipush 0
      // 30: ireturn
   }

   @Override
   public int hashCode() {
      return super.hashCode() ^ Arrays.hashCode(this.ov8);
   }

   public int[] n04() {
      return this.ov8;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
