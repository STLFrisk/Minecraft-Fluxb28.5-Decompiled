/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  tv.twitch.AuthToken
 *  tv.twitch.Core
 *  tv.twitch.CoreAPI
 *  tv.twitch.ErrorCode
 *  tv.twitch.StandardCoreAPI
 *  tv.twitch.chat.Chat
 *  tv.twitch.chat.ChatAPI
 *  tv.twitch.chat.ChatEmoticonData
 *  tv.twitch.chat.IChatAPIListener
 *  tv.twitch.chat.StandardChatAPI
 */
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import tv.twitch.AuthToken;
import tv.twitch.Core;
import tv.twitch.CoreAPI;
import tv.twitch.ErrorCode;
import tv.twitch.StandardCoreAPI;
import tv.twitch.chat.Chat;
import tv.twitch.chat.ChatAPI;
import tv.twitch.chat.ChatEmoticonData;
import tv.twitch.chat.IChatAPIListener;
import tv.twitch.chat.StandardChatAPI;

public class _r7 {
    private static final Logger d90;
    public _r7$ja4 n0t;
    public String gjw;
    public String sst;
    public String ml_;
    public Core rco;
    public Chat j35;
    public _r7$lw7 pq_;
    public AuthToken bzw;
    public HashMap zp8;
    public int j97;
    public _r7$wl_ dgq;
    public _r7$wl_ azf;
    public ChatEmoticonData dvi;
    public int m1i;
    public int _na;
    public IChatAPIListener rr1;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public void zcl(_r7$ja4 _r7$ja4) {
        this.n0t = _r7$ja4;
    }

    public void eld(AuthToken authToken) {
        this.bzw = authToken;
    }

    public void k45(String string) {
        this.sst = string;
    }

    public void aqm(String string) {
        this.gjw = string;
    }

    public _r7$lw7 tuw() {
        return this.pq_;
    }

    public boolean cm_(String string) {
        boolean bl;
        String string2;
        HashMap hashMap;
        block6: {
            block7: {
                int n = t9d.b();
                try {
                    try {
                        hashMap = this.zp8;
                        string2 = string;
                        if (n == 0) break block6;
                        if (hashMap.containsKey(string2)) break block7;
                    }
                    catch (oov oov2) {
                        throw _r7.a(oov2);
                    }
                    return false;
                }
                catch (oov oov3) {
                    throw _r7.a(oov3);
                }
            }
            hashMap = this.zp8;
            string2 = string;
        }
        _r7$pg7 _r7$pg7 = (_r7$pg7)hashMap.get(string2);
        try {
            bl = _r7$pg7.ymk() == _r7$rb4.k3_;
        }
        catch (oov oov4) {
            throw _r7.a(oov4);
        }
        return bl;
    }

    public _r7$rb4 u7c(String string) {
        String string2;
        HashMap hashMap;
        block4: {
            block5: {
                int n = t9d.c();
                try {
                    try {
                        hashMap = this.zp8;
                        string2 = string;
                        if (n != 0) break block4;
                        if (hashMap.containsKey(string2)) break block5;
                    }
                    catch (oov oov2) {
                        throw _r7.a(oov2);
                    }
                    return _r7$rb4.p3k;
                }
                catch (oov oov3) {
                    throw _r7.a(oov3);
                }
            }
            hashMap = this.zp8;
            string2 = string;
        }
        _r7$pg7 _r7$pg7 = (_r7$pg7)hashMap.get(string2);
        return _r7$pg7.ymk();
    }

    public _r7() {
        block4: {
            _r7 _r72;
            block5: {
                this.n0t = null;
                this.gjw = "";
                this.sst = "";
                this.ml_ = "";
                int n = t9d.b();
                try {
                    try {
                        this.rco = null;
                        this.j35 = null;
                        this.pq_ = _r7$lw7.hec;
                        this.bzw = new AuthToken();
                        this.zp8 = new HashMap();
                        this.j97 = 128;
                        this.dgq = _r7$wl_.ora;
                        this.azf = _r7$wl_.ora;
                        this.dvi = null;
                        this.m1i = 500;
                        this._na = 2000;
                        this.rr1 = new _r7$1(this);
                        this.rco = Core.getInstance();
                        _r72 = this;
                        if (n == 0) break block4;
                        if (_r72.rco != null) break block5;
                    }
                    catch (oov oov2) {
                        throw _r7.a(oov2);
                    }
                    this.rco = new Core((CoreAPI)new StandardCoreAPI());
                }
                catch (oov oov3) {
                    throw _r7.a(oov3);
                }
            }
            _r72 = this;
        }
        _r72.j35 = new Chat((ChatAPI)new StandardChatAPI());
    }

    /*
     * Exception decompiling
     */
    public boolean w33() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public boolean jip(String string) {
        return this.pj0(string, false);
    }

    public boolean pj0(String string, boolean bl) {
        boolean bl2;
        block23: {
            block22: {
                boolean bl3;
                block24: {
                    boolean bl4;
                    block25: {
                        String string2;
                        int n;
                        block21: {
                            block20: {
                                boolean bl5;
                                block19: {
                                    _r7 _r72;
                                    long l;
                                    block17: {
                                        block18: {
                                            l = a ^ 0x4AA34A892176L;
                                            n = t9d.b();
                                            try {
                                                try {
                                                    _r72 = this;
                                                    if (n == 0) break block17;
                                                    if (_r72.pq_ == _r7$lw7.g2t) break block18;
                                                }
                                                catch (oov oov2) {
                                                    throw _r7.a(oov2);
                                                }
                                                return false;
                                            }
                                            catch (oov oov3) {
                                                throw _r7.a(oov3);
                                            }
                                        }
                                        _r72 = this;
                                    }
                                    try {
                                        try {
                                            bl5 = _r72.zp8.containsKey(string);
                                            if (n == 0) break block19;
                                            if (bl5) {
                                            }
                                            break block20;
                                        }
                                        catch (oov oov4) {
                                            throw _r7.a(oov4);
                                        }
                                        this.djt((String)((Object)_r7.a("x", (int)27052, (long)(0x1BE0BF94E0B071E7L ^ l))) + string);
                                        bl5 = false;
                                    }
                                    catch (oov oov5) {
                                        throw _r7.a(oov5);
                                    }
                                }
                                return bl5;
                            }
                            try {
                                string2 = string;
                                if (n == 0) break block21;
                                if (string2 == null) break block22;
                            }
                            catch (oov oov6) {
                                throw _r7.a(oov6);
                            }
                            string2 = string;
                        }
                        try {
                            bl2 = string2.equals("");
                            if (n == 0) break block23;
                            if (bl2) break block22;
                        }
                        catch (oov oov7) {
                            throw _r7.a(oov7);
                        }
                        _r7$pg7 _r7$pg7 = new _r7$pg7(this, string);
                        this.zp8.put(string, _r7$pg7);
                        bl4 = _r7$pg7.qd5(bl);
                        try {
                            try {
                                bl3 = bl4;
                                if (n == 0) break block24;
                                if (bl3) break block25;
                            }
                            catch (oov oov8) {
                                throw _r7.a(oov8);
                            }
                            this.zp8.remove(string);
                        }
                        catch (oov oov9) {
                            throw _r7.a(oov9);
                        }
                    }
                    bl3 = bl4;
                }
                return bl3;
            }
            bl2 = false;
        }
        return bl2;
    }

    public boolean kta(String string) {
        String string2;
        HashMap hashMap;
        block11: {
            block12: {
                _r7 _r72;
                int n;
                long l;
                block9: {
                    block10: {
                        l = a ^ 0x2FD10A4A6C52L;
                        n = t9d.c();
                        try {
                            try {
                                _r72 = this;
                                if (n != 0) break block9;
                                if (_r72.pq_ == _r7$lw7.g2t) break block10;
                            }
                            catch (oov oov2) {
                                throw _r7.a(oov2);
                            }
                            return false;
                        }
                        catch (oov oov3) {
                            throw _r7.a(oov3);
                        }
                    }
                    _r72 = this;
                }
                try {
                    try {
                        hashMap = _r72.zp8;
                        string2 = string;
                        if (n != 0) break block11;
                        if (!hashMap.containsKey(string2)) {
                        }
                        break block12;
                    }
                    catch (oov oov4) {
                        throw _r7.a(oov4);
                    }
                    this.djt((String)((Object)_r7.a("x", (int)27956, (long)(0x768FF5F1E160385AL ^ l))) + string);
                    return false;
                }
                catch (oov oov5) {
                    throw _r7.a(oov5);
                }
            }
            hashMap = this.zp8;
            string2 = string;
        }
        _r7$pg7 _r7$pg7 = (_r7$pg7)hashMap.get(string2);
        return _r7$pg7.xdw();
    }

    public boolean jsz() {
        boolean bl;
        block8: {
            block9: {
                _r7 _r72;
                int n;
                long l;
                block6: {
                    block7: {
                        l = a ^ 0x73E7B0CFC9F0L;
                        n = t9d.c();
                        try {
                            try {
                                _r72 = this;
                                if (n != 0) break block6;
                                if (_r72.pq_ == _r7$lw7.g2t) break block7;
                            }
                            catch (oov oov2) {
                                throw _r7.a(oov2);
                            }
                            return false;
                        }
                        catch (oov oov3) {
                            throw _r7.a(oov3);
                        }
                    }
                    _r72 = this;
                }
                ErrorCode errorCode = _r72.j35.shutdown();
                try {
                    bl = ErrorCode.failed((ErrorCode)errorCode);
                    if (n != 0) break block8;
                    if (!bl) break block9;
                }
                catch (oov oov4) {
                    throw _r7.a(oov4);
                }
                String string = ErrorCode.getString((ErrorCode)errorCode);
                this.djt(String.format((String)((Object)_r7.a("x", (int)14015, (long)(0x25DEF8D16292C67AL ^ l))), string));
                return false;
            }
            this.ibg();
            this.feh(_r7$lw7.w4b);
            bl = true;
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    public void d9z() {
        block14: {
            block15: {
                block13: {
                    var1_1 = t9d.c();
                    v0 = this.tuw();
                    v1 = _r7$lw7.hec;
                    if (var1_1 != 0) break block13;
                    try {
                        block16: {
                            if (v0 == v1) break block14;
                            break block16;
                            catch (InterruptedException v2) {
                                throw _r7.a(v2);
                            }
                        }
                        this.jsz();
                        v0 = this.tuw();
                        v1 = _r7$lw7.w4b;
                    }
                    catch (InterruptedException v3) {
                        throw _r7.a(v3);
                    }
                }
                if (var1_1 != 0) break block15;
                try {
                    block17: {
                        if (v0 != v1) break block14;
                        break block17;
                        catch (InterruptedException v4) {
                            throw _r7.a(v4);
                        }
                    }
lbl28:
                    // 3 sources

                    while (true) {
                        v0 = this.tuw();
                        v1 = _r7$lw7.hec;
                        break;
                    }
                }
                catch (InterruptedException v5) {
                    throw _r7.a(v5);
                }
            }
            try {
                if (v0 == v1) break block14;
                Thread.sleep(200L);
                this.kqa();
                ** GOTO lbl28
            }
            catch (oov v6) {
                throw _r7.a(v6);
            }
            {
                catch (InterruptedException var2_2) {
                    if (var1_1 != 0) ** break;
                    ** continue;
                }
            }
        }
    }

    public void kqa() {
        block9: {
            ErrorCode errorCode;
            long l;
            block10: {
                _r7 _r72;
                int n;
                block8: {
                    l = a ^ 0x3832ED2194A6L;
                    n = t9d.b();
                    try {
                        try {
                            _r72 = this;
                            if (n == 0) break block8;
                            if (_r72.pq_ == _r7$lw7.hec) break block9;
                        }
                        catch (oov oov2) {
                            throw _r7.a(oov2);
                        }
                        _r72 = this;
                    }
                    catch (oov oov3) {
                        throw _r7.a(oov3);
                    }
                }
                ErrorCode errorCode2 = _r72.j35.flushEvents();
                try {
                    try {
                        errorCode = errorCode2;
                        if (n == 0) break block10;
                        if (!ErrorCode.failed((ErrorCode)errorCode)) break block9;
                    }
                    catch (oov oov4) {
                        throw _r7.a(oov4);
                    }
                    errorCode = errorCode2;
                }
                catch (oov oov5) {
                    throw _r7.a(oov5);
                }
            }
            String string = ErrorCode.getString((ErrorCode)errorCode);
            this.djt(String.format((String)((Object)_r7.a("x", (int)10086, (long)(0x435961BBF2570AF4L ^ l))), string));
        }
    }

    public boolean uyk(String string, String string2) {
        String string3;
        HashMap hashMap;
        block11: {
            block12: {
                _r7 _r72;
                int n;
                long l;
                block9: {
                    block10: {
                        l = a ^ 0x6D0A405EF66L;
                        n = t9d.b();
                        try {
                            try {
                                _r72 = this;
                                if (n == 0) break block9;
                                if (_r72.pq_ == _r7$lw7.g2t) break block10;
                            }
                            catch (oov oov2) {
                                throw _r7.a(oov2);
                            }
                            return false;
                        }
                        catch (oov oov3) {
                            throw _r7.a(oov3);
                        }
                    }
                    _r72 = this;
                }
                try {
                    try {
                        hashMap = _r72.zp8;
                        string3 = string;
                        if (n == 0) break block11;
                        if (!hashMap.containsKey(string3)) {
                        }
                        break block12;
                    }
                    catch (oov oov4) {
                        throw _r7.a(oov4);
                    }
                    this.djt((String)((Object)_r7.a("x", (int)8102, (long)(0x3F5B5E7C873D49F6L ^ l))) + string);
                    return false;
                }
                catch (oov oov5) {
                    throw _r7.a(oov5);
                }
            }
            hashMap = this.zp8;
            string3 = string;
        }
        _r7$pg7 _r7$pg7 = (_r7$pg7)hashMap.get(string3);
        return _r7$pg7.fxn(string2);
    }

    public void feh(_r7$lw7 _r7$lw7) {
        block6: {
            int n = t9d.c();
            if (_r7$lw7 != this.pq_) {
                this.pq_ = _r7$lw7;
                try {
                    _r7$ja4 _r7$ja4 = this.n0t;
                    if (n == 0) {
                        try {
                            if (_r7$ja4 == null) break block6;
                            _r7$ja4 = this.n0t;
                        }
                        catch (Exception exception) {
                            throw _r7.a(exception);
                        }
                    }
                    _r7$ja4.yyl(_r7$lw7);
                }
                catch (Exception exception) {
                    this.djt(exception.toString());
                }
            }
        }
    }

    public void _ct() {
        block13: {
            ErrorCode errorCode;
            long l;
            block15: {
                _r7 _r72;
                int n;
                block14: {
                    block12: {
                        l = a ^ 0x5EC403389B7BL;
                        n = t9d.c();
                        try {
                            try {
                                _r72 = this;
                                if (n != 0) break block12;
                                if (_r72.azf == _r7$wl_.ora) break block13;
                            }
                            catch (oov oov2) {
                                throw _r7.a(oov2);
                            }
                            _r72 = this;
                        }
                        catch (oov oov3) {
                            throw _r7.a(oov3);
                        }
                    }
                    try {
                        try {
                            if (n != 0) break block14;
                            if (_r72.dvi != null) break block13;
                        }
                        catch (oov oov4) {
                            throw _r7.a(oov4);
                        }
                        _r72 = this;
                    }
                    catch (oov oov5) {
                        throw _r7.a(oov5);
                    }
                }
                ErrorCode errorCode2 = _r72.j35.downloadEmoticonData();
                try {
                    try {
                        errorCode = errorCode2;
                        if (n != 0) break block15;
                        if (!ErrorCode.failed((ErrorCode)errorCode)) break block13;
                    }
                    catch (oov oov6) {
                        throw _r7.a(oov6);
                    }
                    errorCode = errorCode2;
                }
                catch (oov oov7) {
                    throw _r7.a(oov7);
                }
            }
            String string = ErrorCode.getString((ErrorCode)errorCode);
            this.djt(String.format((String)((Object)_r7.a("x", (int)2886, (long)(0x74FA4178F72FA90CL ^ l))), string));
        }
    }

    /*
     * Unable to fully structure code
     */
    public void kng() {
        block14: {
            block13: {
                var1_1 = _r7.a ^ 7295132313528L;
                var3_2 = t9d.c();
                v0 = this;
                if (var3_2 != 0) break block13;
                try {
                    block15: {
                        if (v0.dvi != null) break block14;
                        break block15;
                        catch (Exception v1) {
                            throw _r7.a(v1);
                        }
                    }
                    this.dvi = new ChatEmoticonData();
                    v0 = this;
                }
                catch (Exception v2) {
                    throw _r7.a(v2);
                }
            }
            if (!ErrorCode.succeeded((ErrorCode)(var4_3 = v0.j35.getEmoticonData(this.dvi)))) ** GOTO lbl41
            try {
                block16: {
                    v3 = this.n0t;
                    if (var3_2 != 0) break block16;
                    try {
                        block17: {
                            if (v3 == null) break block14;
                            break block17;
                            catch (Exception v4) {
                                throw _r7.a(v4);
                            }
                        }
                        v3 = this.n0t;
                    }
                    catch (Exception v5) {
                        throw _r7.a(v5);
                    }
                }
                v3.zo_();
            }
            catch (Exception var5_4) {
                try {
                    this.djt(var5_4.toString());
                    if (var3_2 == 0) break block14;
lbl41:
                    // 2 sources

                    this.djt((String)_r7.a("x", (int)6073, (long)(1814654290098063667L ^ var1_1)) + ErrorCode.getString((ErrorCode)var4_3));
                }
                catch (Exception v6) {
                    throw _r7.a(v6);
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public void ibg() {
        block18: {
            block19: {
                block17: {
                    var1_1 = _r7.a ^ 82964257357822L;
                    var3_2 = t9d.b();
                    v0 = this;
                    if (var3_2 == 0) break block17;
                    try {
                        block20: {
                            if (v0.dvi == null) break block18;
                            break block20;
                            catch (Exception v1) {
                                throw _r7.a(v1);
                            }
                        }
                        v0 = this;
                    }
                    catch (Exception v2) {
                        throw _r7.a(v2);
                    }
                }
                var4_3 = v0.j35.clearEmoticonData();
                if (var3_2 == 0) break block19;
                try {
                    block21: {
                        if (!ErrorCode.succeeded((ErrorCode)var4_3)) ** GOTO lbl53
                        break block21;
                        catch (Exception v3) {
                            throw _r7.a(v3);
                        }
                    }
                    this.dvi = null;
                }
                catch (Exception v4) {
                    throw _r7.a(v4);
                }
            }
            try {
                block22: {
                    v5 = this.n0t;
                    if (var3_2 == 0) break block22;
                    try {
                        block23: {
                            if (v5 == null) break block18;
                            break block23;
                            catch (Exception v6) {
                                throw _r7.a(v6);
                            }
                        }
                        v5 = this.n0t;
                    }
                    catch (Exception v7) {
                        throw _r7.a(v7);
                    }
                }
                v5.xkh();
            }
            catch (Exception var5_4) {
                try {
                    this.djt(var5_4.toString());
                    if (var3_2 != 0) break block18;
lbl53:
                    // 2 sources

                    this.djt((String)_r7.a("x", (int)25447, (long)(2940875244399486378L ^ var1_1)) + ErrorCode.getString((ErrorCode)var4_3));
                }
                catch (Exception v8) {
                    throw _r7.a(v8);
                }
            }
        }
    }

    public void djt(String string) {
        long l = a ^ 0x33E6D6C576A2L;
        d90.error(gwo.fd3, (String)((Object)_r7.a("x", (int)5247, (long)(0x91BA8B32BBC5BEAL ^ l))), new Object[]{string});
    }

    /*
     * Unable to fully structure code
     */
    static {
        block12: {
            block11: {
                ** synchronized (c.g())
lbl2:
                // 1 sources

                _r7.a = c.a(-1122244088455526165L, -146352126526911454L, MethodHandles.lookup().lookupClass()).a(129616215006460L);
                _r7.d = new HashMap<K, V>(13);
                var0 = _r7.a ^ 123028614751088L;
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[11];
                var7_4 = 0;
                var6_5 = "\u0099\u009f\u001c\u00ea@\u00fc\r[.9)\u00d7\u00e1g\u001a$\u00d8\u008e\u009d\u00e3j\u00ef\u00b7\u00c8\u0089\u008cOz5\u001d(\u00bdi\u0017h\u00b8\u00f9?oqkV\u00ba(\u00f4\u00c9u\u00e40\u00fc\u00da1+\u00039\u00bb\u00fbo\u00a9C\n^\u00fb\u00ef\u00b0\u0004\u0096\u00a4l\u00a2v*\u0099I\u00fb>4\u0018,\u0093\u00de\u007f3,\u00e3RVV\u00f6\u0014\u009f\\\u00b5A\u0083\u00ec\u0016(\u008b\u009e\u00f1m$\u0016\u00e2\u00aa\u00c5\u0001\u007f}4\u0090\u009b`\u00e4\u0007I\u00c7\u0014rs\u00cc\t\u00ce\u00d6\n&\u00bd\u008f3\u0092\u00ea\u0005y\u00e1\u009b\u0088O(V\u00f5\u00cc*%\u00ff}\u00c7\u00a1\u00bb\u00a8\u00d6J:\u008e\u00ab\u00c9u\u0005\n\u0093r\u001b\u001c[\u00f2\n\u00be\u00aa\u0093\u00da\u00a2\u008b\tw\u00c3X\u0095\u0007T@\u000f\u0006g?\u0092\u0092^\u00cd\u00c1\u00b3k\u00e1h9$\u009aV e \u00e8\u00ed\u008d\fZ\u0092]P\u00a9!\u00ea\u0082\u000e6\u00f8\u00a6H0\u00c3\u00dc1\u00cb\n\u00bd\u00fc}}\u0007\\\u00f6B\u00b2\u001c\u00e0\u008c\u0081\u00ab\u00c8\u00fcC\u0091c\u00ae(P\u00a4B\u00d2\u00d9\u001b`\u008b\u00dc\u00d1\u00b0j\u0000\u0012\u008d\u00b9Tz\u00ed\u0019\u00a9\u001f\u00a0\u00d4\u008cH\u008a\u00a6\u00ac!\u00c7\u00e0\u00a2\u000e\u00f0R8\u008d\u0080\n\u00e3A\u0004\u00c4-B\u00a2\nxS0\u001cP\u0081b\u0096\u00d9\u0091\u00f8\u00fe\u00ef#\u0014\u008f((_\u0018!\u001d'\u0007D\u00f8\u0004I\u00e3\u00b5\u00a0\t\u00cf8\u00a6\u007f\u009e\\j\u00a0\u00f76\u0087\u009ff\u00b2\u00e5\b$\u0014}\u009a\f,\u008aw\u0092\u00eb3\u00beS\u00e4\u00d6\u00e9r\u0017\u00b5\u00f5j\r\u00a3 \u00d8\u00ca\u00ef\u00b1\u0097\u0011\u001e\u00a8\u00ccY\u0091\u00c0CO\u001b\u009c\"K8\u00c2'\u009f5C\u00fd\u00b3=i\u00d4<\u00c7s\u0012\u00c4#\u001fT\u00c4R\u00a4\u00e1\u001a\b\u00af\u00e9'8\u008e\u00bc!<qX\u00ed{\u00e8\u00d2\u00fb6a%\u0013\u0001\u00a0\u0005|\u00b7\u009c\u00972\u00c8\u008e\u009e\u0006\u00a3( :\u00db\u0092o\u00b9\u001aLR#-\u00dc\u009e=(\u00c5\u00eb\u00c4x\u00c6\u00925\u00d4\u00c5\u00fc\u001d\u00c3K\u00e3\u00a4\u00da\u0014{mP\u009a\u00b4\u00dcC9";
                var8_6 = "\u0099\u009f\u001c\u00ea@\u00fc\r[.9)\u00d7\u00e1g\u001a$\u00d8\u008e\u009d\u00e3j\u00ef\u00b7\u00c8\u0089\u008cOz5\u001d(\u00bdi\u0017h\u00b8\u00f9?oqkV\u00ba(\u00f4\u00c9u\u00e40\u00fc\u00da1+\u00039\u00bb\u00fbo\u00a9C\n^\u00fb\u00ef\u00b0\u0004\u0096\u00a4l\u00a2v*\u0099I\u00fb>4\u0018,\u0093\u00de\u007f3,\u00e3RVV\u00f6\u0014\u009f\\\u00b5A\u0083\u00ec\u0016(\u008b\u009e\u00f1m$\u0016\u00e2\u00aa\u00c5\u0001\u007f}4\u0090\u009b`\u00e4\u0007I\u00c7\u0014rs\u00cc\t\u00ce\u00d6\n&\u00bd\u008f3\u0092\u00ea\u0005y\u00e1\u009b\u0088O(V\u00f5\u00cc*%\u00ff}\u00c7\u00a1\u00bb\u00a8\u00d6J:\u008e\u00ab\u00c9u\u0005\n\u0093r\u001b\u001c[\u00f2\n\u00be\u00aa\u0093\u00da\u00a2\u008b\tw\u00c3X\u0095\u0007T@\u000f\u0006g?\u0092\u0092^\u00cd\u00c1\u00b3k\u00e1h9$\u009aV e \u00e8\u00ed\u008d\fZ\u0092]P\u00a9!\u00ea\u0082\u000e6\u00f8\u00a6H0\u00c3\u00dc1\u00cb\n\u00bd\u00fc}}\u0007\\\u00f6B\u00b2\u001c\u00e0\u008c\u0081\u00ab\u00c8\u00fcC\u0091c\u00ae(P\u00a4B\u00d2\u00d9\u001b`\u008b\u00dc\u00d1\u00b0j\u0000\u0012\u008d\u00b9Tz\u00ed\u0019\u00a9\u001f\u00a0\u00d4\u008cH\u008a\u00a6\u00ac!\u00c7\u00e0\u00a2\u000e\u00f0R8\u008d\u0080\n\u00e3A\u0004\u00c4-B\u00a2\nxS0\u001cP\u0081b\u0096\u00d9\u0091\u00f8\u00fe\u00ef#\u0014\u008f((_\u0018!\u001d'\u0007D\u00f8\u0004I\u00e3\u00b5\u00a0\t\u00cf8\u00a6\u007f\u009e\\j\u00a0\u00f76\u0087\u009ff\u00b2\u00e5\b$\u0014}\u009a\f,\u008aw\u0092\u00eb3\u00beS\u00e4\u00d6\u00e9r\u0017\u00b5\u00f5j\r\u00a3 \u00d8\u00ca\u00ef\u00b1\u0097\u0011\u001e\u00a8\u00ccY\u0091\u00c0CO\u001b\u009c\"K8\u00c2'\u009f5C\u00fd\u00b3=i\u00d4<\u00c7s\u0012\u00c4#\u001fT\u00c4R\u00a4\u00e1\u001a\b\u00af\u00e9'8\u008e\u00bc!<qX\u00ed{\u00e8\u00d2\u00fb6a%\u0013\u0001\u00a0\u0005|\u00b7\u009c\u00972\u00c8\u008e\u009e\u0006\u00a3( :\u00db\u0092o\u00b9\u001aLR#-\u00dc\u009e=(\u00c5\u00eb\u00c4x\u00c6\u00925\u00d4\u00c5\u00fc\u001d\u00c3K\u00e3\u00a4\u00da\u0014{mP\u009a\u00b4\u00dcC9".length();
                var5_7 = 48;
                var4_8 = -1;
lbl21:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block11;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = _r7.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00ac\u00c7m\u00b08U{\u00d6-I'{\u00bb\u0004\u00e0%\u009b\u0083\u0010\u00a4\u00a7\u0095\u00f6A6\u0003\u00ac-P)k\u0098\u00d8w\u00c8\u00a6c\"t$@#\u0084{\u00dcP\u00b0[\u00c7as\n\u00b7\u0087\u00ff\u0094\u00ab\u00e1\u00c3\u009a\u00d1>'q\u00ab\u00d8\u0086x\u00a9\u00b9\u001e\u0087z\u00f1\u0002\u008d\u00b5\u00e0\u00b7]\u00da\u00f83\u0003\u00cb\u00001Ee\u0093K\f$\u0094\u00c4N\u00fa\u00a4EW\u0018\u00927?\u00d8";
                    var8_6 = "\u00ac\u00c7m\u00b08U{\u00d6-I'{\u00bb\u0004\u00e0%\u009b\u0083\u0010\u00a4\u00a7\u0095\u00f6A6\u0003\u00ac-P)k\u0098\u00d8w\u00c8\u00a6c\"t$@#\u0084{\u00dcP\u00b0[\u00c7as\n\u00b7\u0087\u00ff\u0094\u00ab\u00e1\u00c3\u009a\u00d1>'q\u00ab\u00d8\u0086x\u00a9\u00b9\u001e\u0087z\u00f1\u0002\u008d\u00b5\u00e0\u00b7]\u00da\u00f83\u0003\u00cb\u00001Ee\u0093K\f$\u0094\u00c4N\u00fa\u00a4EW\u0018\u00927?\u00d8".length();
                    var5_7 = 40;
                    var4_8 = -1;
lbl35:
                    // 2 sources

                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block11;
                        break;
                    }
                    break;
                }
lbl40:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = _r7.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    break block12;
                    break;
                }
            }
            var10_9 = var2_1.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl52:
                // 1 sources

                ** continue;
            }
        }
        _r7.b = var9_3;
        _r7.c = new String[11];
        _r7.d90 = LogManager.getLogger();
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String a(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c2;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c2 = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c2 = (char)(c2 | (char)(n3 & 0x3F));
                cArray[n++] = c2;
                continue;
            }
            if (i >= n2 - 2) continue;
            c2 = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c2 = (char)(c2 | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c2 = (char)(c2 | (char)(n3 & 0x3F));
            cArray[n++] = c2;
        }
        return new String(cArray, 0, n);
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7B5B;
        if (c[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("_r7", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n2].getBytes("ISO-8859-1");
            _r7.c[n2] = _r7.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = _r7.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("_r7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_r7.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

