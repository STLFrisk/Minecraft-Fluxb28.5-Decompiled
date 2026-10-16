/*
 * Decompiled with CFR 0.152.
 */
import java.nio.FloatBuffer;

public class g2u
extends uka {
    private static /* synthetic */ g2u vul;
    private /* synthetic */ FloatBuffer q6q;
    private /* synthetic */ FloatBuffer ddd;
    private /* synthetic */ FloatBuffer hxb;

    public g2u() {
        this.q6q = nkx.dyc(16);
        this.ddd = nkx.dyc(16);
        this.hxb = nkx.dyc(16);
    }

    public static uka n16() {
        vul.pte();
        return vul;
    }

    private void fnm(float[] fArray) {
        float f = fe6.bug(fArray[0] * fArray[0] + fArray[1] * fArray[1] + fArray[2] * fArray[2]);
        fArray[0] = fArray[0] / f;
        fArray[1] = fArray[1] / f;
        fArray[2] = fArray[2] / f;
        fArray[3] = fArray[3] / f;
    }

    public void pte() {
        this.q6q.clear();
        this.ddd.clear();
        this.hxb.clear();
        hzu.i56(2983, this.q6q);
        hzu.i56(2982, this.ddd);
        float[] fArray = this.e1v;
        float[] fArray2 = this.ovy;
        this.q6q.flip().limit(16);
        this.q6q.get(fArray);
        this.ddd.flip().limit(16);
        this.ddd.get(fArray2);
        this.mze[0] = fArray2[0] * fArray[0] + fArray2[1] * fArray[4] + fArray2[2] * fArray[8] + fArray2[3] * fArray[12];
        this.mze[1] = fArray2[0] * fArray[1] + fArray2[1] * fArray[5] + fArray2[2] * fArray[9] + fArray2[3] * fArray[13];
        this.mze[2] = fArray2[0] * fArray[2] + fArray2[1] * fArray[6] + fArray2[2] * fArray[10] + fArray2[3] * fArray[14];
        this.mze[3] = fArray2[0] * fArray[3] + fArray2[1] * fArray[7] + fArray2[2] * fArray[11] + fArray2[3] * fArray[15];
        this.mze[4] = fArray2[4] * fArray[0] + fArray2[5] * fArray[4] + fArray2[6] * fArray[8] + fArray2[7] * fArray[12];
        this.mze[5] = fArray2[4] * fArray[1] + fArray2[5] * fArray[5] + fArray2[6] * fArray[9] + fArray2[7] * fArray[13];
        this.mze[6] = fArray2[4] * fArray[2] + fArray2[5] * fArray[6] + fArray2[6] * fArray[10] + fArray2[7] * fArray[14];
        this.mze[7] = fArray2[4] * fArray[3] + fArray2[5] * fArray[7] + fArray2[6] * fArray[11] + fArray2[7] * fArray[15];
        this.mze[8] = fArray2[8] * fArray[0] + fArray2[9] * fArray[4] + fArray2[10] * fArray[8] + fArray2[11] * fArray[12];
        this.mze[9] = fArray2[8] * fArray[1] + fArray2[9] * fArray[5] + fArray2[10] * fArray[9] + fArray2[11] * fArray[13];
        this.mze[10] = fArray2[8] * fArray[2] + fArray2[9] * fArray[6] + fArray2[10] * fArray[10] + fArray2[11] * fArray[14];
        this.mze[11] = fArray2[8] * fArray[3] + fArray2[9] * fArray[7] + fArray2[10] * fArray[11] + fArray2[11] * fArray[15];
        this.mze[12] = fArray2[12] * fArray[0] + fArray2[13] * fArray[4] + fArray2[14] * fArray[8] + fArray2[15] * fArray[12];
        this.mze[13] = fArray2[12] * fArray[1] + fArray2[13] * fArray[5] + fArray2[14] * fArray[9] + fArray2[15] * fArray[13];
        this.mze[14] = fArray2[12] * fArray[2] + fArray2[13] * fArray[6] + fArray2[14] * fArray[10] + fArray2[15] * fArray[14];
        this.mze[15] = fArray2[12] * fArray[3] + fArray2[13] * fArray[7] + fArray2[14] * fArray[11] + fArray2[15] * fArray[15];
        float[] fArray3 = this.k60[0];
        fArray3[0] = this.mze[3] - this.mze[0];
        fArray3[1] = this.mze[7] - this.mze[4];
        fArray3[2] = this.mze[11] - this.mze[8];
        fArray3[3] = this.mze[15] - this.mze[12];
        this.fnm(fArray3);
        float[] fArray4 = this.k60[1];
        fArray4[0] = this.mze[3] + this.mze[0];
        fArray4[1] = this.mze[7] + this.mze[4];
        fArray4[2] = this.mze[11] + this.mze[8];
        fArray4[3] = this.mze[15] + this.mze[12];
        this.fnm(fArray4);
        float[] fArray5 = this.k60[2];
        fArray5[0] = this.mze[3] + this.mze[1];
        fArray5[1] = this.mze[7] + this.mze[5];
        fArray5[2] = this.mze[11] + this.mze[9];
        fArray5[3] = this.mze[15] + this.mze[13];
        this.fnm(fArray5);
        float[] fArray6 = this.k60[3];
        fArray6[0] = this.mze[3] - this.mze[1];
        fArray6[1] = this.mze[7] - this.mze[5];
        fArray6[2] = this.mze[11] - this.mze[9];
        fArray6[3] = this.mze[15] - this.mze[13];
        this.fnm(fArray6);
        float[] fArray7 = this.k60[4];
        fArray7[0] = this.mze[3] - this.mze[2];
        fArray7[1] = this.mze[7] - this.mze[6];
        fArray7[2] = this.mze[11] - this.mze[10];
        fArray7[3] = this.mze[15] - this.mze[14];
        this.fnm(fArray7);
        float[] fArray8 = this.k60[5];
        fArray8[0] = this.mze[3] + this.mze[2];
        fArray8[1] = this.mze[7] + this.mze[6];
        fArray8[2] = this.mze[11] + this.mze[10];
        fArray8[3] = this.mze[15] + this.mze[14];
        this.fnm(fArray8);
    }

    static {
        vul = new g2u();
    }
}

