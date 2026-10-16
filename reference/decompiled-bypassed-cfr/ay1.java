/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  org.apache.commons.io.IOUtils
 */
import com.google.common.collect.Maps;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Map;
import org.apache.commons.io.IOUtils;

public class ay1
implements yaa {
    private final /* synthetic */ Map y9p;
    private final /* synthetic */ String ehy;
    private final /* synthetic */ gdz zkw;
    private final /* synthetic */ InputStream k6k;
    private final /* synthetic */ InputStream msq;
    private final /* synthetic */ if1 i7t;
    private /* synthetic */ boolean g_r;
    private /* synthetic */ JsonObject nxl;

    public ay1(String string, gdz gdz2, InputStream inputStream, InputStream inputStream2, if1 if12) {
        this.y9p = Maps.newHashMap();
        this.ehy = string;
        this.zkw = gdz2;
        this.k6k = inputStream;
        this.msq = inputStream2;
        this.i7t = if12;
    }

    @Override
    public gdz yad() {
        return this.zkw;
    }

    @Override
    public InputStream f_4() {
        return this.k6k;
    }

    @Override
    public boolean z75() {
        boolean bl;
        try {
            bl = this.msq != null;
        }
        catch (oov oov2) {
            throw ay1.a(oov2);
        }
        return bl;
    }

    /*
     * Loose catch block
     */
    @Override
    public z08 yrs(String string) {
        z08 z082;
        block19: {
            Object object;
            block20: {
                Object object2;
                int n;
                block17: {
                    block18: {
                        block22: {
                            ay1 ay12;
                            block15: {
                                block16: {
                                    n = t9d.b();
                                    ay12 = this;
                                    if (n == 0) break block15;
                                    try {
                                        block21: {
                                            if (ay12.z75()) break block16;
                                            break block21;
                                            catch (oov oov2) {
                                                throw ay1.a(oov2);
                                            }
                                        }
                                        return null;
                                    }
                                    catch (oov oov3) {
                                        throw ay1.a(oov3);
                                    }
                                }
                                ay12 = this;
                            }
                            object2 = ay12.nxl;
                            if (n == 0) break block17;
                            if (object2 != null) break block18;
                            break block22;
                            catch (oov oov4) {
                                throw ay1.a(oov4);
                            }
                        }
                        try {
                            block23: {
                                object2 = this;
                                if (n == 0) break block17;
                                break block23;
                                catch (oov oov5) {
                                    throw ay1.a(oov5);
                                }
                            }
                            if (object2.g_r) break block18;
                        }
                        catch (oov oov6) {
                            throw ay1.a(oov6);
                        }
                        this.g_r = true;
                        object = null;
                        try {
                            object = new BufferedReader(new InputStreamReader(this.msq));
                            this.nxl = new JsonParser().parse((Reader)object).getAsJsonObject();
                        }
                        finally {
                            IOUtils.closeQuietly((Reader)object);
                        }
                    }
                    object2 = this.y9p.get(string);
                }
                object = (z08)object2;
                try {
                    z082 = object;
                    if (n == 0) break block19;
                    if (z082 != null) break block20;
                }
                catch (oov oov7) {
                    throw ay1.a(oov7);
                }
                object = this.i7t.oom(string, this.nxl);
            }
            z082 = object;
        }
        return z082;
    }

    @Override
    public String rlm() {
        return this.ehy;
    }

    public boolean equals(Object object) {
        boolean bl;
        block42: {
            block43: {
                String string;
                block40: {
                    ay1 ay12;
                    block41: {
                        ay1 ay13;
                        int n;
                        block38: {
                            block39: {
                                gdz gdz2;
                                block36: {
                                    block37: {
                                        Object object2;
                                        block34: {
                                            block35: {
                                                block32: {
                                                    block33: {
                                                        n = t9d.c();
                                                        try {
                                                            try {
                                                                object2 = this;
                                                                if (n != 0) break block32;
                                                                if (object2 != object) break block33;
                                                            }
                                                            catch (oov oov2) {
                                                                throw ay1.a(oov2);
                                                            }
                                                            return true;
                                                        }
                                                        catch (oov oov3) {
                                                            throw ay1.a(oov3);
                                                        }
                                                    }
                                                    object2 = object;
                                                }
                                                try {
                                                    try {
                                                        if (n != 0) break block34;
                                                        if (object2 instanceof ay1) break block35;
                                                    }
                                                    catch (oov oov4) {
                                                        throw ay1.a(oov4);
                                                    }
                                                    return false;
                                                }
                                                catch (oov oov5) {
                                                    throw ay1.a(oov5);
                                                }
                                            }
                                            object2 = object;
                                        }
                                        ay12 = (ay1)object2;
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        gdz2 = this.zkw;
                                                        if (n != 0) break block36;
                                                        if (gdz2 == null) break block37;
                                                    }
                                                    catch (oov oov6) {
                                                        throw ay1.a(oov6);
                                                    }
                                                    ay13 = this;
                                                    if (n != 0) break block38;
                                                }
                                                catch (oov oov7) {
                                                    throw ay1.a(oov7);
                                                }
                                                if (ay13.zkw.equals(ay12.zkw)) break block39;
                                            }
                                            catch (oov oov8) {
                                                throw ay1.a(oov8);
                                            }
                                            return false;
                                        }
                                        catch (oov oov9) {
                                            throw ay1.a(oov9);
                                        }
                                    }
                                    try {
                                        ay13 = ay12;
                                        if (n != 0) break block38;
                                        gdz2 = ay13.zkw;
                                    }
                                    catch (oov oov10) {
                                        throw ay1.a(oov10);
                                    }
                                }
                                try {
                                    if (gdz2 != null) {
                                        return false;
                                    }
                                }
                                catch (oov oov11) {
                                    throw ay1.a(oov11);
                                }
                            }
                            ay13 = this;
                        }
                        try {
                            try {
                                try {
                                    try {
                                        string = ay13.ehy;
                                        if (n != 0) break block40;
                                        if (string == null) break block41;
                                    }
                                    catch (oov oov12) {
                                        throw ay1.a(oov12);
                                    }
                                    bl = this.ehy.equals(ay12.ehy);
                                    if (n != 0) break block42;
                                }
                                catch (oov oov13) {
                                    throw ay1.a(oov13);
                                }
                                if (bl) break block43;
                            }
                            catch (oov oov14) {
                                throw ay1.a(oov14);
                            }
                            return false;
                        }
                        catch (oov oov15) {
                            throw ay1.a(oov15);
                        }
                    }
                    string = ay12.ehy;
                }
                try {
                    if (string != null) {
                        return false;
                    }
                }
                catch (oov oov16) {
                    throw ay1.a(oov16);
                }
            }
            bl = true;
        }
        return bl;
    }

    public int hashCode() {
        int n;
        int n2;
        int n3;
        block13: {
            block11: {
                gdz gdz2;
                block10: {
                    int n4;
                    int n5;
                    block12: {
                        block9: {
                            String string;
                            block8: {
                                n5 = t9d.c();
                                try {
                                    try {
                                        string = this.ehy;
                                        if (n5 != 0) break block8;
                                        if (string == null) break block9;
                                    }
                                    catch (oov oov2) {
                                        throw ay1.a(oov2);
                                    }
                                    string = this.ehy;
                                }
                                catch (oov oov3) {
                                    throw ay1.a(oov3);
                                }
                            }
                            n4 = string.hashCode();
                            break block12;
                        }
                        n4 = 0;
                    }
                    n3 = n4;
                    try {
                        try {
                            n2 = 31 * n3;
                            gdz2 = this.zkw;
                            if (n5 != 0) break block10;
                            if (gdz2 == null) break block11;
                        }
                        catch (oov oov4) {
                            throw ay1.a(oov4);
                        }
                        gdz2 = this.zkw;
                    }
                    catch (oov oov5) {
                        throw ay1.a(oov5);
                    }
                }
                n = gdz2.hashCode();
                break block13;
            }
            n = 0;
        }
        n3 = n2 + n;
        return n3;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

