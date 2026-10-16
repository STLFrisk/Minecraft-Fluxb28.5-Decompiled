/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Color;
import java.io.Serializable;

public class evu
extends fy3
implements Serializable {
    public static final long serialVersionUID = 6632576088353444794L;

    public evu(byte by, byte by2, byte by3) {
        super(by, by2, by3);
    }

    public evu(byte[] byArray) {
        super(byArray);
    }

    public evu(evu evu2) {
        super(evu2);
    }

    public evu(fy3 fy32) {
        super(fy32);
    }

    public evu(Color color) {
        super((byte)color.getRed(), (byte)color.getGreen(), (byte)color.getBlue());
    }

    public evu() {
    }

    public final void w3r(Color color) {
        this.vxv = (byte)color.getRed();
        this.dia = (byte)color.getGreen();
        this.urv = (byte)color.getBlue();
    }

    public final Color xz9() {
        int n = this.vxv & 0xFF;
        int n2 = this.dia & 0xFF;
        int n3 = this.urv & 0xFF;
        return new Color(n, n2, n3);
    }
}

