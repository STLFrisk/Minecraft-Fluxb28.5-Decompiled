/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  tv.twitch.ErrorCode
 *  tv.twitch.chat.ChatBadgeData
 *  tv.twitch.chat.ChatChannelInfo
 *  tv.twitch.chat.ChatEvent
 *  tv.twitch.chat.ChatRawMessage
 *  tv.twitch.chat.ChatTokenizedMessage
 *  tv.twitch.chat.ChatUserInfo
 *  tv.twitch.chat.IChatChannelListener
 */
import com.google.common.collect.Lists;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import tv.twitch.ErrorCode;
import tv.twitch.chat.ChatBadgeData;
import tv.twitch.chat.ChatChannelInfo;
import tv.twitch.chat.ChatEvent;
import tv.twitch.chat.ChatRawMessage;
import tv.twitch.chat.ChatTokenizedMessage;
import tv.twitch.chat.ChatUserInfo;
import tv.twitch.chat.IChatChannelListener;

public class _r7$pg7
implements IChatChannelListener {
    public String gso;
    public boolean pvr;
    public _r7$rb4 afh;
    public List jbr;
    public LinkedList r04;
    public LinkedList epx;
    public ChatBadgeData s06;
    public final _r7 nvz;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public _r7$pg7(_r7 _r72, String string) {
        this.nvz = _r72;
        this.gso = null;
        this.pvr = false;
        this.afh = _r7$rb4.e2e;
        this.jbr = Lists.newArrayList();
        this.r04 = new LinkedList();
        this.epx = new LinkedList();
        this.s06 = null;
        this.gso = string;
    }

    public _r7$rb4 ymk() {
        return this.afh;
    }

    public boolean qd5(boolean bl) {
        boolean bl2;
        block8: {
            block9: {
                ErrorCode errorCode;
                int n;
                long l;
                block10: {
                    block7: {
                        block6: {
                            l = a ^ 0x87DF4FC3D76L;
                            n = t9d.b();
                            this.pvr = bl;
                            errorCode = ErrorCode.TTV_EC_SUCCESS;
                            try {
                                if (n == 0) break block6;
                                if (!bl) break block7;
                            }
                            catch (oov oov2) {
                                throw _r7$pg7.a(oov2);
                            }
                            errorCode = this.nvz.j35.connectAnonymous(this.gso, (IChatChannelListener)this);
                        }
                        if (n != 0) break block10;
                    }
                    errorCode = this.nvz.j35.connect(this.gso, this.nvz.gjw, this.nvz.bzw.data, (IChatChannelListener)this);
                }
                try {
                    bl2 = ErrorCode.failed((ErrorCode)errorCode);
                    if (n == 0) break block8;
                    if (!bl2) break block9;
                }
                catch (oov oov3) {
                    throw _r7$pg7.a(oov3);
                }
                String string = ErrorCode.getString((ErrorCode)errorCode);
                this.nvz.djt(String.format((String)((Object)_r7$pg7.a("l", (int)31950, (long)(0x792D469962DAB694L ^ l))), string));
                this.rdf(this.gso);
                return false;
            }
            this.j15(_r7$rb4.vyb);
            this.d7o();
            bl2 = true;
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     */
    public boolean xdw() {
        block8: {
            var1_1 = _r7$pg7.a ^ 37895936885072L;
            var3_2 = t9d.c();
            try {
                v0 = _r7$2.eq_[this.afh.ordinal()];
                if (var3_2 != 0) break block8;
            }
            catch (oov v1) {
                throw _r7$pg7.a(v1);
            }
            {
                ** switch (v0)
            }
lbl-1000:
            // 1 sources

            {
                case 1: 
                case 2: {
                    var4_3 = this.nvz.j35.disconnect(this.gso);
                    try {
                        v2 = ErrorCode.failed((ErrorCode)var4_3);
                        if (var3_2 != 0) ** GOTO lbl26
                        if (v2) {
                        }
                        ** GOTO lbl24
                    }
                    catch (oov v3) {
                        throw _r7$pg7.a(v3);
                    }
                    var5_4 = ErrorCode.getString((ErrorCode)var4_3);
                    this.nvz.djt(String.format((String)_r7$pg7.a("l", (int)19902, (long)(6000661430211279808L ^ var1_1)), new Object[]{var5_4}));
                    return false;
lbl24:
                    // 1 sources

                    this.j15(_r7$rb4.ii5);
                    v2 = true;
lbl26:
                    // 2 sources

                    return v2;
                }
            }
lbl27:
            // 1 sources

            v0 = false;
        }
        return v0;
    }

    public void j15(_r7$rb4 _r7$rb4) {
        try {
            if (_r7$rb4 != this.afh) {
                this.afh = _r7$rb4;
            }
        }
        catch (oov oov2) {
            throw _r7$pg7.a(oov2);
        }
    }

    /*
     * Unable to fully structure code
     */
    public void law(String var1_1) {
        block32: {
            block28: {
                block29: {
                    block30: {
                        block27: {
                            block34: {
                                var2_2 = t9d.c();
                                v0 = this;
                                if (var2_2 != 0) break block27;
                                if (v0.nvz.azf != _r7$wl_.ora) ** GOTO lbl18
                                break block34;
                                catch (Exception v1) {
                                    throw _r7$pg7.a(v1);
                                }
                            }
                            try {
                                block35: {
                                    this.r04.clear();
                                    this.epx.clear();
                                    if (var2_2 == 0) break block28;
                                    break block35;
                                    catch (Exception v2) {
                                        throw _r7$pg7.a(v2);
                                    }
                                }
                                v0 = this;
                            }
                            catch (Exception v3) {
                                throw _r7$pg7.a(v3);
                            }
                        }
                        try {
                            v4 = v0.r04.size();
                            if (var2_2 != 0) break block29;
                            if (v4 <= 0) break block30;
                        }
                        catch (Exception v5) {
                            throw _r7$pg7.a(v5);
                        }
                        var3_3 = this.r04.listIterator();
                        while (var3_3.hasNext()) {
                            block31: {
                                var4_5 = (ChatRawMessage)var3_3.next();
                                v4 = (int)var4_5.userName.equals(var1_1);
                                if (var2_2 != 0) break block29;
                                try {
                                    block36: {
                                        if (v4 == 0) break block31;
                                        break block36;
                                        catch (Exception v6) {
                                            throw _r7$pg7.a(v6);
                                        }
                                    }
                                    var3_3.remove();
                                }
                                catch (Exception v7) {
                                    throw _r7$pg7.a(v7);
                                }
                            }
                            if (var2_2 == 0) continue;
                        }
                    }
                    try {
                        v8 = this;
                        if (var2_2 == 0) {
                            v4 = v8.epx.size();
                        }
                        ** GOTO lbl81
                    }
                    catch (Exception v9) {
                        throw _r7$pg7.a(v9);
                    }
                }
                if (v4 <= 0) break block28;
                var3_3 = this.epx.listIterator();
                while (var3_3.hasNext()) {
                    block33: {
                        var4_5 = (ChatTokenizedMessage)var3_3.next();
                        if (var2_2 != 0) break block32;
                        try {
                            block37: {
                                if (!var4_5.displayName.equals(var1_1)) break block33;
                                break block37;
                                catch (Exception v10) {
                                    throw _r7$pg7.a(v10);
                                }
                            }
                            var3_3.remove();
                        }
                        catch (Exception v11) {
                            throw _r7$pg7.a(v11);
                        }
                    }
                    if (var2_2 == 0) continue;
                }
            }
            try {
                block38: {
                    v8 = this;
lbl81:
                    // 3 sources

                    v12 = v8.nvz.n0t;
                    if (var2_2 != 0) break block38;
                    try {
                        block39: {
                            if (v12 == null) break block32;
                            break block39;
                            catch (Exception v13) {
                                throw _r7$pg7.a(v13);
                            }
                        }
                        v12 = this.nvz.n0t;
                    }
                    catch (Exception v14) {
                        throw _r7$pg7.a(v14);
                    }
                }
                v12.h4v(this.gso, var1_1);
            }
            catch (Exception var3_4) {
                this.nvz.djt(var3_4.toString());
            }
        }
    }

    public boolean fxn(String string) {
        boolean bl;
        block8: {
            block9: {
                _r7$pg7 _r7$pg7;
                int n;
                long l;
                block6: {
                    block7: {
                        l = a ^ 0x18F74F2BE2A7L;
                        n = t9d.c();
                        try {
                            try {
                                _r7$pg7 = this;
                                if (n != 0) break block6;
                                if (_r7$pg7.afh == _r7$rb4.k3_) break block7;
                            }
                            catch (oov oov2) {
                                throw _r7$pg7.a(oov2);
                            }
                            return false;
                        }
                        catch (oov oov3) {
                            throw _r7$pg7.a(oov3);
                        }
                    }
                    _r7$pg7 = this;
                }
                ErrorCode errorCode = _r7$pg7.nvz.j35.sendMessage(this.gso, string);
                try {
                    bl = ErrorCode.failed((ErrorCode)errorCode);
                    if (n != 0) break block8;
                    if (!bl) break block9;
                }
                catch (oov oov4) {
                    throw _r7$pg7.a(oov4);
                }
                String string2 = ErrorCode.getString((ErrorCode)errorCode);
                this.nvz.djt(String.format((String)((Object)_r7$pg7.a("l", (int)15129, (long)(0x717A2C257E68AE91L ^ l))), string2));
                return false;
            }
            bl = true;
        }
        return bl;
    }

    public void d7o() {
        block13: {
            ErrorCode errorCode;
            long l;
            block15: {
                _r7$pg7 _r7$pg7;
                int n;
                block14: {
                    block12: {
                        l = a ^ 0x486E65BA9C70L;
                        n = t9d.b();
                        try {
                            try {
                                _r7$pg7 = this;
                                if (n == 0) break block12;
                                if (_r7$pg7.nvz.azf == _r7$wl_.ora) break block13;
                            }
                            catch (oov oov2) {
                                throw _r7$pg7.a(oov2);
                            }
                            _r7$pg7 = this;
                        }
                        catch (oov oov3) {
                            throw _r7$pg7.a(oov3);
                        }
                    }
                    try {
                        try {
                            if (n == 0) break block14;
                            if (_r7$pg7.s06 != null) break block13;
                        }
                        catch (oov oov4) {
                            throw _r7$pg7.a(oov4);
                        }
                        _r7$pg7 = this;
                    }
                    catch (oov oov5) {
                        throw _r7$pg7.a(oov5);
                    }
                }
                ErrorCode errorCode2 = _r7$pg7.nvz.j35.downloadBadgeData(this.gso);
                try {
                    try {
                        errorCode = errorCode2;
                        if (n == 0) break block15;
                        if (!ErrorCode.failed((ErrorCode)errorCode)) break block13;
                    }
                    catch (oov oov6) {
                        throw _r7$pg7.a(oov6);
                    }
                    errorCode = errorCode2;
                }
                catch (oov oov7) {
                    throw _r7$pg7.a(oov7);
                }
            }
            String string = ErrorCode.getString((ErrorCode)errorCode);
            this.nvz.djt(String.format((String)((Object)_r7$pg7.a("l", (int)21872, (long)(0x15DD40FDE7083E28L ^ l))), string));
        }
    }

    /*
     * Unable to fully structure code
     */
    public void jsi() {
        block14: {
            block13: {
                var1_1 = _r7$pg7.a ^ 42397074920083L;
                var3_2 = t9d.c();
                v0 = this;
                if (var3_2 != 0) break block13;
                try {
                    block15: {
                        if (v0.s06 != null) break block14;
                        break block15;
                        catch (Exception v1) {
                            throw _r7$pg7.a(v1);
                        }
                    }
                    this.s06 = new ChatBadgeData();
                    v0 = this;
                }
                catch (Exception v2) {
                    throw _r7$pg7.a(v2);
                }
            }
            if (!ErrorCode.succeeded((ErrorCode)(var4_3 = v0.nvz.j35.getBadgeData(this.gso, this.s06)))) ** GOTO lbl41
            try {
                block16: {
                    v3 = this.nvz.n0t;
                    if (var3_2 != 0) break block16;
                    try {
                        block17: {
                            if (v3 == null) break block14;
                            break block17;
                            catch (Exception v4) {
                                throw _r7$pg7.a(v4);
                            }
                        }
                        v3 = this.nvz.n0t;
                    }
                    catch (Exception v5) {
                        throw _r7$pg7.a(v5);
                    }
                }
                v3.qyx(this.gso);
            }
            catch (Exception var5_4) {
                try {
                    this.nvz.djt(var5_4.toString());
                    if (var3_2 == 0) break block14;
lbl41:
                    // 2 sources

                    this.nvz.djt((String)_r7$pg7.a("l", (int)18014, (long)(4549647657223332836L ^ var1_1)) + ErrorCode.getString((ErrorCode)var4_3));
                }
                catch (Exception v6) {
                    throw _r7$pg7.a(v6);
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public void rsp() {
        block18: {
            block19: {
                block17: {
                    var1_1 = _r7$pg7.a ^ 26849670035323L;
                    var3_2 = t9d.c();
                    v0 = this;
                    if (var3_2 != 0) break block17;
                    try {
                        block20: {
                            if (v0.s06 == null) break block18;
                            break block20;
                            catch (Exception v1) {
                                throw _r7$pg7.a(v1);
                            }
                        }
                        v0 = this;
                    }
                    catch (Exception v2) {
                        throw _r7$pg7.a(v2);
                    }
                }
                var4_3 = v0.nvz.j35.clearBadgeData(this.gso);
                if (var3_2 != 0) break block19;
                try {
                    block21: {
                        if (!ErrorCode.succeeded((ErrorCode)var4_3)) ** GOTO lbl53
                        break block21;
                        catch (Exception v3) {
                            throw _r7$pg7.a(v3);
                        }
                    }
                    this.s06 = null;
                }
                catch (Exception v4) {
                    throw _r7$pg7.a(v4);
                }
            }
            try {
                block22: {
                    v5 = this.nvz.n0t;
                    if (var3_2 != 0) break block22;
                    try {
                        block23: {
                            if (v5 == null) break block18;
                            break block23;
                            catch (Exception v6) {
                                throw _r7$pg7.a(v6);
                            }
                        }
                        v5 = this.nvz.n0t;
                    }
                    catch (Exception v7) {
                        throw _r7$pg7.a(v7);
                    }
                }
                v5.vd8(this.gso);
            }
            catch (Exception var5_4) {
                try {
                    this.nvz.djt(var5_4.toString());
                    if (var3_2 == 0) break block18;
lbl53:
                    // 2 sources

                    this.nvz.djt((String)_r7$pg7.a("l", (int)860, (long)(7126094311857816330L ^ var1_1)) + ErrorCode.getString((ErrorCode)var4_3));
                }
                catch (Exception v8) {
                    throw _r7$pg7.a(v8);
                }
            }
        }
    }

    /*
     * Loose catch block
     */
    public void lo7(String string) {
        block6: {
            int n = t9d.b();
            try {
                _r7$ja4 _r7$ja4;
                block7: {
                    _r7$ja4 = this.nvz.n0t;
                    if (n == 0) break block7;
                    try {
                        block8: {
                            if (_r7$ja4 == null) break block6;
                            break block8;
                            catch (Exception exception) {
                                throw _r7$pg7.a(exception);
                            }
                        }
                        _r7$ja4 = this.nvz.n0t;
                    }
                    catch (Exception exception) {
                        throw _r7$pg7.a(exception);
                    }
                }
                _r7$ja4.u8d(string);
            }
            catch (Exception exception) {
                this.nvz.djt(exception.toString());
            }
        }
    }

    /*
     * Loose catch block
     */
    public void rdf(String string) {
        block6: {
            int n = t9d.c();
            try {
                _r7$ja4 _r7$ja4;
                block7: {
                    _r7$ja4 = this.nvz.n0t;
                    if (n != 0) break block7;
                    try {
                        block8: {
                            if (_r7$ja4 == null) break block6;
                            break block8;
                            catch (Exception exception) {
                                throw _r7$pg7.a(exception);
                            }
                        }
                        _r7$ja4 = this.nvz.n0t;
                    }
                    catch (Exception exception) {
                        throw _r7$pg7.a(exception);
                    }
                }
                _r7$ja4.pvc(string);
            }
            catch (Exception exception) {
                this.nvz.djt(exception.toString());
            }
        }
    }

    private void o63() {
        block5: {
            _r7$pg7 _r7$pg7;
            block4: {
                int n = t9d.b();
                try {
                    try {
                        _r7$pg7 = this;
                        if (n == 0) break block4;
                        if (_r7$pg7.afh == _r7$rb4.p3k) break block5;
                    }
                    catch (oov oov2) {
                        throw _r7$pg7.a(oov2);
                    }
                    this.j15(_r7$rb4.p3k);
                    this.rdf(this.gso);
                    _r7$pg7 = this;
                }
                catch (oov oov3) {
                    throw _r7$pg7.a(oov3);
                }
            }
            _r7$pg7.rsp();
        }
    }

    public void chatStatusCallback(String string, ErrorCode errorCode) {
        block5: {
            block4: {
                int n = t9d.c();
                try {
                    Object object;
                    try {
                        object = errorCode;
                        if (n != 0) break block4;
                        if (ErrorCode.succeeded((ErrorCode)object)) break block5;
                    }
                    catch (oov oov2) {
                        throw _r7$pg7.a(oov2);
                    }
                    object = this.nvz.zp8.remove(string);
                }
                catch (oov oov3) {
                    throw _r7$pg7.a(oov3);
                }
            }
            this.o63();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void chatChannelMembershipCallback(String string, ChatEvent chatEvent, ChatChannelInfo chatChannelInfo) {
        int n = t9d.b();
        try {
            try {
                switch (chatEvent) {
                    case TTV_CHAT_JOINED_CHANNEL: {
                        this.j15(_r7$rb4.k3_);
                        this.lo7(string);
                        if (n != 0) return;
                    }
                    case TTV_CHAT_LEFT_CHANNEL: {
                        this.o63();
                        return;
                    }
                }
                return;
            }
            catch (oov oov2) {
                throw _r7$pg7.a(oov2);
            }
        }
        catch (oov oov3) {
            throw _r7$pg7.a(oov3);
        }
    }

    /*
     * Loose catch block
     */
    public void chatChannelUserChangeCallback(String string, ChatUserInfo[] chatUserInfoArray, ChatUserInfo[] chatUserInfoArray2, ChatUserInfo[] chatUserInfoArray3) {
        block29: {
            int n;
            int n2;
            block26: {
                int n3;
                int n4;
                block24: {
                    int n5;
                    n2 = t9d.b();
                    n = 0;
                    while (n < chatUserInfoArray2.length) {
                        block30: {
                            block25: {
                                block31: {
                                    n4 = this.jbr.indexOf(chatUserInfoArray2[n]);
                                    if (n2 == 0) break block30;
                                    n5 = n4;
                                    if (n2 == 0) break block24;
                                    break block31;
                                    catch (Exception exception) {
                                        throw _r7$pg7.a(exception);
                                    }
                                }
                                try {
                                    block32: {
                                        if (n5 < 0) break block25;
                                        break block32;
                                        catch (Exception exception) {
                                            throw _r7$pg7.a(exception);
                                        }
                                    }
                                    this.jbr.remove(n4);
                                }
                                catch (Exception exception) {
                                    throw _r7$pg7.a(exception);
                                }
                            }
                            ++n;
                        }
                        if (n2 != 0) continue;
                    }
                    n5 = n = 0;
                }
                while (n < chatUserInfoArray3.length) {
                    block27: {
                        block28: {
                            block33: {
                                n4 = this.jbr.indexOf(chatUserInfoArray3[n]);
                                n3 = n4;
                                if (n2 == 0) break block26;
                                if (n2 == 0) break block27;
                                break block33;
                                catch (Exception exception) {
                                    throw _r7$pg7.a(exception);
                                }
                            }
                            try {
                                block34: {
                                    if (n3 < 0) break block28;
                                    break block34;
                                    catch (Exception exception) {
                                        throw _r7$pg7.a(exception);
                                    }
                                }
                                this.jbr.remove(n4);
                            }
                            catch (Exception exception) {
                                throw _r7$pg7.a(exception);
                            }
                        }
                        this.jbr.add(chatUserInfoArray3[n]);
                    }
                    ++n;
                    if (n2 != 0) continue;
                }
                n3 = n = 0;
            }
            while (n < chatUserInfoArray.length) {
                try {
                    this.jbr.add(chatUserInfoArray[n]);
                    ++n;
                    if (n2 != 0) {
                        if (n2 != 0) continue;
                        break;
                    }
                    break block29;
                }
                catch (Exception exception) {
                    throw _r7$pg7.a(exception);
                }
            }
            try {
                _r7$ja4 _r7$ja4;
                block35: {
                    _r7$ja4 = this.nvz.n0t;
                    if (n2 == 0) break block35;
                    try {
                        block36: {
                            if (_r7$ja4 == null) break block29;
                            break block36;
                            catch (Exception exception) {
                                throw _r7$pg7.a(exception);
                            }
                        }
                        _r7$ja4 = this.nvz.n0t;
                    }
                    catch (Exception exception) {
                        throw _r7$pg7.a(exception);
                    }
                }
                _r7$ja4.hv_(this.gso, chatUserInfoArray, chatUserInfoArray2, chatUserInfoArray3);
            }
            catch (Exception exception) {
                this.nvz.djt(exception.toString());
            }
        }
    }

    /*
     * Loose catch block
     */
    public void chatChannelRawMessageCallback(String string, ChatRawMessage[] chatRawMessageArray) {
        int n;
        block11: {
            n = t9d.c();
            for (int i = 0; i < chatRawMessageArray.length; ++i) {
                try {
                    this.r04.addLast(chatRawMessageArray[i]);
                    if (n == 0) {
                        if (n == 0) continue;
                        break;
                    }
                    break block11;
                }
                catch (Exception exception) {
                    throw _r7$pg7.a(exception);
                }
            }
            try {
                _r7$ja4 _r7$ja4;
                block12: {
                    _r7$ja4 = this.nvz.n0t;
                    if (n != 0) break block12;
                    try {
                        block13: {
                            if (_r7$ja4 == null) break block11;
                            break block13;
                            catch (Exception exception) {
                                throw _r7$pg7.a(exception);
                            }
                        }
                        _r7$ja4 = this.nvz.n0t;
                    }
                    catch (Exception exception) {
                        throw _r7$pg7.a(exception);
                    }
                }
                _r7$ja4.v_8(this.gso, chatRawMessageArray);
            }
            catch (Exception exception) {
                this.nvz.djt(exception.toString());
            }
        }
        while (this.r04.size() > this.nvz.j97) {
            this.r04.removeFirst();
            if (n == 0) continue;
        }
    }

    /*
     * Loose catch block
     */
    public void chatChannelTokenizedMessageCallback(String string, ChatTokenizedMessage[] chatTokenizedMessageArray) {
        int n;
        block11: {
            n = t9d.b();
            for (int i = 0; i < chatTokenizedMessageArray.length; ++i) {
                try {
                    this.epx.addLast(chatTokenizedMessageArray[i]);
                    if (n != 0) {
                        if (n != 0) continue;
                        break;
                    }
                    break block11;
                }
                catch (Exception exception) {
                    throw _r7$pg7.a(exception);
                }
            }
            try {
                _r7$ja4 _r7$ja4;
                block12: {
                    _r7$ja4 = this.nvz.n0t;
                    if (n == 0) break block12;
                    try {
                        block13: {
                            if (_r7$ja4 == null) break block11;
                            break block13;
                            catch (Exception exception) {
                                throw _r7$pg7.a(exception);
                            }
                        }
                        _r7$ja4 = this.nvz.n0t;
                    }
                    catch (Exception exception) {
                        throw _r7$pg7.a(exception);
                    }
                }
                _r7$ja4.e5d(this.gso, chatTokenizedMessageArray);
            }
            catch (Exception exception) {
                this.nvz.djt(exception.toString());
            }
        }
        while (this.epx.size() > this.nvz.j97) {
            this.epx.removeFirst();
            if (n != 0) continue;
        }
    }

    public void chatClearCallback(String string, String string2) {
        this.law(string2);
    }

    public void chatBadgeDataDownloadCallback(String string, ErrorCode errorCode) {
        try {
            if (ErrorCode.succeeded((ErrorCode)errorCode)) {
                this.jsi();
            }
        }
        catch (oov oov2) {
            throw _r7$pg7.a(oov2);
        }
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

                _r7$pg7.a = c.a(-7625580580616518718L, -5695414132264609520L, MethodHandles.lookup().lookupClass()).a(222111141517405L);
                _r7$pg7.d = new HashMap<K, V>(13);
                var0 = _r7$pg7.a ^ 80769974103517L;
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
                var9_3 = new String[6];
                var7_4 = 0;
                var6_5 = "YG\u00ff\u00dbSX\u00c0\u001d 4\u00c6o\u0085\n\u00a7\u0017\\I\u00d1Z\u0086\u007fU\u00fe\u00be1\u00fa'\u00d4\u0089U{\u00cb{\u00ad\u008d\bW\u000e[0\u0086\u00b1\r\ba\u00fb5q?\u001e\u00d2\u00f3\u00b9\u00a5A\u00e6X\u00fd\u00a4\u00e7C!\u00eaa\u00f3\u00f3\u00ef\u00f6\u00e9b3\u00ce\u001d\u00f0\u00e8\u0015a\u0086\u000fR\u00cc!\u0091#\u009eX\u00b9?(ez\u00c79y\u00few\u0081\u00d9\u00c2\u00f8\u00a7P\u00de\u00d3\u0099\u00ec\u00c3\u008e\u00f9\u00dd\u00e6b\u0004\u00d5P\u00da3]\u000b\u00d3\u00ad8\u008bO\u00d63u\u0092\u00db8\u0012\u00bfV\u00e7\u00fa\u0093A\u0082\u0000;\u00f1=\u00af\u0005\u0010\u00b1\u00b2\u00f10\u008d\u00f4*J\u0001\u00d0L#Z\u00f7\u00d3\u00a6]SI\u00ee\u00c3\u00c6\u0003ZlS\\\u00c7\u000e\u0099\u001f\u00a9\u00e7\u00ed\u00e8\u0090l\u00b9U\u00cd\u00e8";
                var8_6 = "YG\u00ff\u00dbSX\u00c0\u001d 4\u00c6o\u0085\n\u00a7\u0017\\I\u00d1Z\u0086\u007fU\u00fe\u00be1\u00fa'\u00d4\u0089U{\u00cb{\u00ad\u008d\bW\u000e[0\u0086\u00b1\r\ba\u00fb5q?\u001e\u00d2\u00f3\u00b9\u00a5A\u00e6X\u00fd\u00a4\u00e7C!\u00eaa\u00f3\u00f3\u00ef\u00f6\u00e9b3\u00ce\u001d\u00f0\u00e8\u0015a\u0086\u000fR\u00cc!\u0091#\u009eX\u00b9?(ez\u00c79y\u00few\u0081\u00d9\u00c2\u00f8\u00a7P\u00de\u00d3\u0099\u00ec\u00c3\u008e\u00f9\u00dd\u00e6b\u0004\u00d5P\u00da3]\u000b\u00d3\u00ad8\u008bO\u00d63u\u0092\u00db8\u0012\u00bfV\u00e7\u00fa\u0093A\u0082\u0000;\u00f1=\u00af\u0005\u0010\u00b1\u00b2\u00f10\u008d\u00f4*J\u0001\u00d0L#Z\u00f7\u00d3\u00a6]SI\u00ee\u00c3\u00c6\u0003ZlS\\\u00c7\u000e\u0099\u001f\u00a9\u00e7\u00ed\u00e8\u0090l\u00b9U\u00cd\u00e8".length();
                var5_7 = 40;
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
                    var9_3[var7_4++] = _r7$pg7.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "c\u0012`\u0015\u00cb\u00a3\u00a4fw\u0080\u0017\u00c9\u00a9\u00c5\u00d2|n\u00f4\u00f8\u0012(\u0012\u008b\u0093\u0003\u00c0\njK^8D\u00b8\u0000\u00bcA\u00d6!Z\u00ce\u00d5\u0006:\u00f6B\u0087\u00e8\u00b7\u000b{\u008f\u00f1\u00a2~r\u00a8\u00a2\u00cf\u00d8\u00b9bI\u00d6`8\bZEX v\u008b7'\u00d5\u0018H\u00cd\u0095\u0005\u00a0\u0087\u001e^\u00c4.\u0000giV\u0086\u00ab\u00d7\u0091\u00ea\u00a0\u009c\u00c2\u00a8\u00aa\u00d3+\u008b\u00d3!\u00af\u001e\u00f4\u0086\u00d7\u009c\u0002\u0006W\u00c23Z\u00b2Kwm";
                    var8_6 = "c\u0012`\u0015\u00cb\u00a3\u00a4fw\u0080\u0017\u00c9\u00a9\u00c5\u00d2|n\u00f4\u00f8\u0012(\u0012\u008b\u0093\u0003\u00c0\njK^8D\u00b8\u0000\u00bcA\u00d6!Z\u00ce\u00d5\u0006:\u00f6B\u0087\u00e8\u00b7\u000b{\u008f\u00f1\u00a2~r\u00a8\u00a2\u00cf\u00d8\u00b9bI\u00d6`8\bZEX v\u008b7'\u00d5\u0018H\u00cd\u0095\u0005\u00a0\u0087\u001e^\u00c4.\u0000giV\u0086\u00ab\u00d7\u0091\u00ea\u00a0\u009c\u00c2\u00a8\u00aa\u00d3+\u008b\u00d3!\u00af\u001e\u00f4\u0086\u00d7\u009c\u0002\u0006W\u00c23Z\u00b2Kwm".length();
                    var5_7 = 64;
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
                    var9_3[var7_4++] = _r7$pg7.a(var10_9).intern();
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
        _r7$pg7.b = var9_3;
        _r7$pg7.c = new String[6];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5150;
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
                throw new RuntimeException("_r7$pg7", exception);
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
            _r7$pg7.c[n2] = _r7$pg7.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = _r7$pg7.a(n, l);
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
            throw new RuntimeException("_r7$pg7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_r7$pg7.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

