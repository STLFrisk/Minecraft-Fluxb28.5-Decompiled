import java.nio.Buffer;

public class g2u extends uka {
   public static uka n16() {
      vul.pte();
      return vul;
   }

   private void fnm(float[] var1) {
      float var2 = fe6.bug(var1[0] * var1[0] + var1[1] * var1[1] + var1[2] * var1[2]);
      var1[0] /= var2;
      var1[1] /= var2;
      var1[2] /= var2;
      var1[3] /= var2;
   }

   public void pte() {
      ((Buffer)this.q6q).clear();
      ((Buffer)this.ddd).clear();
      ((Buffer)this.hxb).clear();
      hzu.i56(2983, this.q6q);
      hzu.i56(2982, this.ddd);
      float[] var1 = this.e1v;
      float[] var2 = this.ovy;
      ((Buffer)this.q6q).flip().limit(16);
      this.q6q.get(var1);
      ((Buffer)this.ddd).flip().limit(16);
      this.ddd.get(var2);
      this.mze[0] = var2[0] * var1[0] + var2[1] * var1[4] + var2[2] * var1[8] + var2[3] * var1[12];
      this.mze[1] = var2[0] * var1[1] + var2[1] * var1[5] + var2[2] * var1[9] + var2[3] * var1[13];
      this.mze[2] = var2[0] * var1[2] + var2[1] * var1[6] + var2[2] * var1[10] + var2[3] * var1[14];
      this.mze[3] = var2[0] * var1[3] + var2[1] * var1[7] + var2[2] * var1[11] + var2[3] * var1[15];
      this.mze[4] = var2[4] * var1[0] + var2[5] * var1[4] + var2[6] * var1[8] + var2[7] * var1[12];
      this.mze[5] = var2[4] * var1[1] + var2[5] * var1[5] + var2[6] * var1[9] + var2[7] * var1[13];
      this.mze[6] = var2[4] * var1[2] + var2[5] * var1[6] + var2[6] * var1[10] + var2[7] * var1[14];
      this.mze[7] = var2[4] * var1[3] + var2[5] * var1[7] + var2[6] * var1[11] + var2[7] * var1[15];
      this.mze[8] = var2[8] * var1[0] + var2[9] * var1[4] + var2[10] * var1[8] + var2[11] * var1[12];
      this.mze[9] = var2[8] * var1[1] + var2[9] * var1[5] + var2[10] * var1[9] + var2[11] * var1[13];
      this.mze[10] = var2[8] * var1[2] + var2[9] * var1[6] + var2[10] * var1[10] + var2[11] * var1[14];
      this.mze[11] = var2[8] * var1[3] + var2[9] * var1[7] + var2[10] * var1[11] + var2[11] * var1[15];
      this.mze[12] = var2[12] * var1[0] + var2[13] * var1[4] + var2[14] * var1[8] + var2[15] * var1[12];
      this.mze[13] = var2[12] * var1[1] + var2[13] * var1[5] + var2[14] * var1[9] + var2[15] * var1[13];
      this.mze[14] = var2[12] * var1[2] + var2[13] * var1[6] + var2[14] * var1[10] + var2[15] * var1[14];
      this.mze[15] = var2[12] * var1[3] + var2[13] * var1[7] + var2[14] * var1[11] + var2[15] * var1[15];
      float[] var3 = this.k60[0];
      var3[0] = this.mze[3] - this.mze[0];
      var3[1] = this.mze[7] - this.mze[4];
      var3[2] = this.mze[11] - this.mze[8];
      var3[3] = this.mze[15] - this.mze[12];
      this.fnm(var3);
      float[] var4 = this.k60[1];
      var4[0] = this.mze[3] + this.mze[0];
      var4[1] = this.mze[7] + this.mze[4];
      var4[2] = this.mze[11] + this.mze[8];
      var4[3] = this.mze[15] + this.mze[12];
      this.fnm(var4);
      float[] var5 = this.k60[2];
      var5[0] = this.mze[3] + this.mze[1];
      var5[1] = this.mze[7] + this.mze[5];
      var5[2] = this.mze[11] + this.mze[9];
      var5[3] = this.mze[15] + this.mze[13];
      this.fnm(var5);
      float[] var6 = this.k60[3];
      var6[0] = this.mze[3] - this.mze[1];
      var6[1] = this.mze[7] - this.mze[5];
      var6[2] = this.mze[11] - this.mze[9];
      var6[3] = this.mze[15] - this.mze[13];
      this.fnm(var6);
      float[] var7 = this.k60[4];
      var7[0] = this.mze[3] - this.mze[2];
      var7[1] = this.mze[7] - this.mze[6];
      var7[2] = this.mze[11] - this.mze[10];
      var7[3] = this.mze[15] - this.mze[14];
      this.fnm(var7);
      float[] var8 = this.k60[5];
      var8[0] = this.mze[3] + this.mze[2];
      var8[1] = this.mze[7] + this.mze[6];
      var8[2] = this.mze[11] + this.mze[10];
      var8[3] = this.mze[15] + this.mze[14];
      this.fnm(var8);
   }
}
