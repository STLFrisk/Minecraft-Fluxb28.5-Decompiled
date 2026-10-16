/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class c_3
extends dzm {
    public lva vke = new lva(1.0f, 0.05f);
    private /* synthetic */ String[] mh8;

    public c_3(String string, String string2, String string3, String[] stringArray) {
        this.rn2 = string;
        this.h4c = string2;
        this.ktv = string3;
        ArrayList<String> arrayList = new ArrayList<String>();
        try {
            arrayList.addAll(Arrays.asList(stringArray));
            if (!arrayList.contains(string3)) {
                arrayList.add(string3);
            }
        }
        catch (oov oov2) {
            throw c_3.a(oov2);
        }
        this.mh8 = arrayList.toArray(new String[arrayList.size()]);
        _x3.wig.add(this);
    }

    @Override
    public String d7c() {
        return (String)this.ktv;
    }

    public void n1j(String string) {
        block8: {
            block7: {
                int n = t9d.c();
                try {
                    if (string == null) {
                        return;
                    }
                }
                catch (oov oov2) {
                    throw c_3.a(oov2);
                }
                try {
                    c_3 c_32;
                    try {
                        c_32 = this;
                        if (n != 0) break block7;
                        if (!Arrays.asList(c_32.mh8).contains(string)) break block8;
                    }
                    catch (oov oov3) {
                        throw c_3.a(oov3);
                    }
                    c_32 = this;
                }
                catch (oov oov4) {
                    throw c_3.a(oov4);
                }
            }
            c_32.ktv = string;
        }
    }

    public boolean wyk(String string) {
        boolean bl;
        block4: {
            block5: {
                int n = t9d.c();
                try {
                    try {
                        bl = this.d7c().equals(string);
                        if (n != 0) break block4;
                        if (!bl) break block5;
                    }
                    catch (oov oov2) {
                        throw c_3.a(oov2);
                    }
                    return true;
                }
                catch (oov oov3) {
                    throw c_3.a(oov3);
                }
            }
            bl = false;
        }
        return bl;
    }

    public lva rxi() {
        return this.vke;
    }

    public String[] dyh() {
        return this.mh8;
    }

    @Override
    public Object d7c() {
        return this.d7c();
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

