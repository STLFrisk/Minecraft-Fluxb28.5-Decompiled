/*
 * Decompiled with CFR 0.152.
 */
public class c05$2
extends Thread {
    public final c05 l2s;

    public c05$2(c05 c052, String string) {
        this.l2s = c052;
        super(string);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        int n = t9d.b();
        try {
            while (this.l2s.yq1) {
                try {
                    Thread.sleep(Integer.MAX_VALUE);
                }
                catch (InterruptedException interruptedException) {
                    if (n != 0) continue;
                    return;
                }
            }
            return;
        }
        catch (oov oov2) {
            throw c05$2.a(oov2);
        }
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

