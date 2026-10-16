/*
 * Decompiled with CFR 0.152.
 */
@dr9$x0j(t2u="addalt", io4={""}, hjc="Add alt currently logged into Alt Manager")
public class cbs
extends dr9 {
    @Override
    public void xjl(String[] stringArray) {
        try {
            if (zwr.ede != null) {
                qd_.oyx.add(0, new x1l(zwr.ede[0], zwr.ede[1], this.rpq.ee0().z2u()));
            }
        }
        catch (oov oov2) {
            throw cbs.a(oov2);
        }
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

