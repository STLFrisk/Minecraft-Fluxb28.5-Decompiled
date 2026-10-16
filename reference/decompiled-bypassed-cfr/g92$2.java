/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

public class g92$2
implements Comparator {
    public final g92 ip8;

    public g92$2(g92 g922) {
        this.ip8 = g922;
    }

    public int xc_(xny xny2, xny xny3) {
        return xny2.w6i().compareTo(xny3.w6i());
    }

    public int compare(Object object, Object object2) {
        return this.xc_((xny)object, (xny)object2);
    }
}

