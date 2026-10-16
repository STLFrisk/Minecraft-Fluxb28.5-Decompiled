/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.network.play.client.C14PacketTabComplete;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public class _ov
extends gbe {
    private static final Logger wgw;
    private String qxv = "";
    private int mu5 = -1;
    private boolean q20;
    private boolean o1f;
    private int qp0;
    private List w2d = Lists.newArrayList();
    public jqk i7w;
    private boolean rvb;
    private int cn7;
    private int cgb;
    private String jgp = "";
    private static final long a;
    private static final String g;

    public _ov() {
    }

    public _ov(String string) {
        this.jgp = string;
    }

    @Override
    public void initGui() {
        Keyboard.enableRepeatEvents((boolean)true);
        this.mu5 = this.f41.t43.lcg().nt9().size();
        this.i7w = new jqk(0, this.fex, 4, this.o1e - 12, this.dt7 - 4, 12);
        this.i7w.z5t(100);
        this.i7w.tge(false);
        this.i7w._c6(true);
        this.i7w.nrl(this.jgp);
        this.i7w.rca(false);
    }

    @Override
    public void onGuiClosed() {
        Keyboard.enableRepeatEvents((boolean)false);
        this.f41.t43.lcg().f7w();
    }

    @Override
    public void updateScreen() {
        this.i7w.zf9();
    }

    @Override
    public void dig(char c2, int n) {
        block53: {
            block55: {
                int n2;
                block63: {
                    int n3;
                    int n4;
                    block61: {
                        block59: {
                            block57: {
                                block56: {
                                    block54: {
                                        block51: {
                                            block50: {
                                                boolean bl;
                                                block48: {
                                                    n2 = t9d.c();
                                                    try {
                                                        _ov _ov2;
                                                        block49: {
                                                            try {
                                                                try {
                                                                    _ov2 = this;
                                                                    bl = false;
                                                                    if (n2 != 0) break block48;
                                                                    _ov2.o1f = bl;
                                                                    if (n != 15) break block49;
                                                                }
                                                                catch (oov oov2) {
                                                                    throw _ov.a(oov2);
                                                                }
                                                                this.mje();
                                                                if (n2 == 0) break block50;
                                                            }
                                                            catch (oov oov3) {
                                                                throw _ov.a(oov3);
                                                            }
                                                        }
                                                        _ov2 = this;
                                                        bl = false;
                                                    }
                                                    catch (oov oov4) {
                                                        throw _ov.a(oov4);
                                                    }
                                                }
                                                _ov2.q20 = bl;
                                            }
                                            try {
                                                block52: {
                                                    try {
                                                        try {
                                                            n4 = n;
                                                            n3 = 1;
                                                            if (n2 != 0) break block51;
                                                            if (n4 != n3) break block52;
                                                        }
                                                        catch (oov oov5) {
                                                            throw _ov.a(oov5);
                                                        }
                                                        this.f41.z2i(null);
                                                        if (n2 == 0) break block53;
                                                    }
                                                    catch (oov oov6) {
                                                        throw _ov.a(oov6);
                                                    }
                                                }
                                                n4 = n;
                                                n3 = 28;
                                            }
                                            catch (oov oov7) {
                                                throw _ov.a(oov7);
                                            }
                                        }
                                        try {
                                            try {
                                                if (n2 != 0) break block54;
                                                if (n4 == n3) break block55;
                                            }
                                            catch (oov oov8) {
                                                throw _ov.a(oov8);
                                            }
                                            n4 = n;
                                            n3 = 156;
                                        }
                                        catch (oov oov9) {
                                            throw _ov.a(oov9);
                                        }
                                    }
                                    try {
                                        try {
                                            if (n2 != 0) break block56;
                                            if (n4 == n3) break block55;
                                        }
                                        catch (oov oov10) {
                                            throw _ov.a(oov10);
                                        }
                                        n4 = n;
                                        n3 = 200;
                                    }
                                    catch (oov oov11) {
                                        throw _ov.a(oov11);
                                    }
                                }
                                try {
                                    block58: {
                                        try {
                                            try {
                                                if (n2 != 0) break block57;
                                                if (n4 != n3) break block58;
                                            }
                                            catch (oov oov12) {
                                                throw _ov.a(oov12);
                                            }
                                            this.bbq(-1);
                                            if (n2 == 0) break block53;
                                        }
                                        catch (oov oov13) {
                                            throw _ov.a(oov13);
                                        }
                                    }
                                    n4 = n;
                                    n3 = 208;
                                }
                                catch (oov oov14) {
                                    throw _ov.a(oov14);
                                }
                            }
                            try {
                                block60: {
                                    try {
                                        try {
                                            if (n2 != 0) break block59;
                                            if (n4 != n3) break block60;
                                        }
                                        catch (oov oov15) {
                                            throw _ov.a(oov15);
                                        }
                                        this.bbq(1);
                                        if (n2 == 0) break block53;
                                    }
                                    catch (oov oov16) {
                                        throw _ov.a(oov16);
                                    }
                                }
                                n4 = n;
                                n3 = 201;
                            }
                            catch (oov oov17) {
                                throw _ov.a(oov17);
                            }
                        }
                        try {
                            try {
                                block62: {
                                    try {
                                        try {
                                            if (n2 != 0) break block61;
                                            if (n4 != n3) break block62;
                                        }
                                        catch (oov oov18) {
                                            throw _ov.a(oov18);
                                        }
                                        this.f41.t43.lcg().bmo(this.f41.t43.lcg().gij() - 1);
                                        if (n2 == 0) break block53;
                                    }
                                    catch (oov oov19) {
                                        throw _ov.a(oov19);
                                    }
                                }
                                n4 = n;
                                if (n2 != 0) break block63;
                            }
                            catch (oov oov20) {
                                throw _ov.a(oov20);
                            }
                            n3 = 209;
                        }
                        catch (oov oov21) {
                            throw _ov.a(oov21);
                        }
                    }
                    try {
                        block64: {
                            try {
                                if (n4 != n3) break block64;
                                this.f41.t43.lcg().bmo(-this.f41.t43.lcg().gij() + 1);
                                if (n2 == 0) break block53;
                            }
                            catch (oov oov22) {
                                throw _ov.a(oov22);
                            }
                        }
                        n4 = this.i7w.pst(c2, n) ? 1 : 0;
                    }
                    catch (oov oov23) {
                        throw _ov.a(oov23);
                    }
                }
                if (n2 == 0) break block53;
            }
            String string = this.i7w.xct().trim();
            try {
                if (string.length() > 0) {
                    this.sendChatMessage(string);
                }
            }
            catch (oov oov24) {
                throw _ov.a(oov24);
            }
            this.f41.z2i(null);
        }
    }

    @Override
    public void handleMouseInput() {
        block12: {
            int n;
            block17: {
                int n2;
                block16: {
                    int n3;
                    block15: {
                        int n4;
                        block13: {
                            block14: {
                                block11: {
                                    super.handleMouseInput();
                                    n = Mouse.getEventDWheel();
                                    n3 = t9d.c();
                                    try {
                                        n2 = n;
                                        if (n3 != 0) break block11;
                                        if (n2 == 0) break block12;
                                    }
                                    catch (oov oov2) {
                                        throw _ov.a(oov2);
                                    }
                                    n2 = n;
                                }
                                try {
                                    n4 = 1;
                                    if (n3 != 0) break block13;
                                    if (n2 <= n4) break block14;
                                }
                                catch (oov oov3) {
                                    throw _ov.a(oov3);
                                }
                                n = 1;
                            }
                            try {
                                n2 = n;
                                if (n3 != 0) break block15;
                                n4 = -1;
                            }
                            catch (oov oov4) {
                                throw _ov.a(oov4);
                            }
                        }
                        if (n2 < n4) {
                            n = -1;
                        }
                        n2 = _ov.dmk() ? 1 : 0;
                    }
                    try {
                        try {
                            if (n3 != 0) break block16;
                            if (n2 != 0) break block17;
                        }
                        catch (oov oov5) {
                            throw _ov.a(oov5);
                        }
                        n2 = n * 7;
                    }
                    catch (oov oov6) {
                        throw _ov.a(oov6);
                    }
                }
                n = n2;
            }
            this.f41.t43.lcg().bmo(n);
        }
    }

    @Override
    public void mouseClicked(int n, int n2, int n3) {
        _ov _ov2;
        block5: {
            block6: {
                int n4 = t9d.c();
                if (n3 == 0) {
                    ekw ekw2 = this.f41.t43.lcg().r7v(Mouse.getX(), Mouse.getY());
                    try {
                        try {
                            _ov2 = this;
                            if (n4 != 0) break block5;
                            if (!_ov2.owq(ekw2)) break block6;
                        }
                        catch (oov oov2) {
                            throw _ov.a(oov2);
                        }
                        return;
                    }
                    catch (oov oov3) {
                        throw _ov.a(oov3);
                    }
                }
            }
            this.i7w.elk(n, n2, n3);
            _ov2 = this;
        }
        super.mouseClicked(n, n2, n3);
    }

    @Override
    public void rzw(String string, boolean bl) {
        block5: {
            int n = t9d.b();
            try {
                block4: {
                    try {
                        if (!bl) break block4;
                        this.i7w.nrl(string);
                        if (n != 0) break block5;
                    }
                    catch (oov oov2) {
                        throw _ov.a(oov2);
                    }
                }
                this.i7w.efs(string);
            }
            catch (oov oov3) {
                throw _ov.a(oov3);
            }
        }
    }

    public void mje() {
        block31: {
            _ov _ov2;
            block30: {
                int n;
                int n2;
                int n3;
                block26: {
                    block27: {
                        _ov _ov3;
                        int n4;
                        block28: {
                            block29: {
                                int n5;
                                block24: {
                                    long l = a ^ 0x28D14B1611ABL;
                                    n3 = t9d.c();
                                    try {
                                        block25: {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            n5 = this.q20;
                                                            if (n3 != 0) break block24;
                                                            if (n5 == 0) break block25;
                                                        }
                                                        catch (oov oov2) {
                                                            throw _ov.a(oov2);
                                                        }
                                                        this.i7w.kzc(this.i7w.q6z(-1, this.i7w.jyp(), false) - this.i7w.jyp());
                                                        n2 = this.qp0;
                                                        n = this.w2d.size();
                                                        if (n3 != 0) break block26;
                                                    }
                                                    catch (oov oov3) {
                                                        throw _ov.a(oov3);
                                                    }
                                                    if (n2 < n) break block27;
                                                }
                                                catch (oov oov4) {
                                                    throw _ov.a(oov4);
                                                }
                                                this.qp0 = 0;
                                                if (n3 == 0) break block27;
                                            }
                                            catch (oov oov5) {
                                                throw _ov.a(oov5);
                                            }
                                        }
                                        n5 = this.i7w.q6z(-1, this.i7w.jyp(), false);
                                    }
                                    catch (oov oov6) {
                                        throw _ov.a(oov6);
                                    }
                                }
                                n4 = n5;
                                this.w2d.clear();
                                this.qp0 = 0;
                                String string = this.i7w.xct().substring(n4).toLowerCase();
                                String string2 = this.i7w.xct().substring(0, this.i7w.jyp());
                                try {
                                    try {
                                        this.xyh(string2, string);
                                        _ov3 = this;
                                        if (n3 != 0) break block28;
                                        if (!_ov3.w2d.isEmpty()) break block29;
                                    }
                                    catch (oov oov7) {
                                        throw _ov.a(oov7);
                                    }
                                    return;
                                }
                                catch (oov oov8) {
                                    throw _ov.a(oov8);
                                }
                            }
                            this.q20 = true;
                            _ov3 = this;
                        }
                        _ov3.i7w.kzc(n4 - this.i7w.jyp());
                    }
                    try {
                        _ov2 = this;
                        if (n3 != 0) break block30;
                        n2 = _ov2.w2d.size();
                        n = 1;
                    }
                    catch (oov oov9) {
                        throw _ov.a(oov9);
                    }
                }
                if (n2 > n) {
                    StringBuilder stringBuilder = new StringBuilder();
                    for (String string2 : this.w2d) {
                        block32: {
                            StringBuilder stringBuilder2;
                            block33: {
                                try {
                                    try {
                                        try {
                                            if (n3 != 0) break block31;
                                            stringBuilder2 = stringBuilder;
                                            if (n3 != 0) break block32;
                                        }
                                        catch (oov oov10) {
                                            throw _ov.a(oov10);
                                        }
                                        if (stringBuilder2.length() <= 0) break block33;
                                    }
                                    catch (oov oov11) {
                                        throw _ov.a(oov11);
                                    }
                                    stringBuilder.append(g);
                                }
                                catch (oov oov12) {
                                    throw _ov.a(oov12);
                                }
                            }
                            stringBuilder2 = stringBuilder.append(string2);
                        }
                        if (n3 == 0) continue;
                    }
                    this.f41.t43.lcg().xkx(new tao(stringBuilder.toString()), 1);
                }
                _ov2 = this;
            }
            _ov2.i7w.efs((String)this.w2d.get(this.qp0++));
        }
    }

    private void xyh(String string, String string2) {
        int n = t9d.c();
        if (string.length() >= 1) {
            mew mew2;
            block10: {
                akm akm2;
                block11: {
                    block9: {
                        mew2 = null;
                        try {
                            try {
                                akm2 = this.f41.dzk;
                                if (n != 0) break block9;
                                if (akm2 == null) break block10;
                            }
                            catch (oov oov2) {
                                throw _ov.a(oov2);
                            }
                            akm2 = this.f41.dzk;
                        }
                        catch (oov oov3) {
                            throw _ov.a(oov3);
                        }
                    }
                    try {
                        try {
                            if (n != 0) break block11;
                            if (akm2.oyz != akm$qs6.i4l) break block10;
                        }
                        catch (oov oov4) {
                            throw _ov.a(oov4);
                        }
                        akm2 = this.f41.dzk;
                    }
                    catch (oov oov5) {
                        throw _ov.a(oov5);
                    }
                }
                mew2 = akm2._uf();
            }
            this.f41.vg8.lq7.sxi(new C14PacketTabComplete(string, mew2));
            this.o1f = true;
        }
    }

    public void bbq(int n) {
        block16: {
            int n2;
            block19: {
                _ov _ov2;
                int n3;
                int n4;
                block17: {
                    int n5;
                    int n6;
                    block15: {
                        n2 = this.mu5 + n;
                        n6 = this.f41.t43.lcg().nt9().size();
                        n2 = fe6.faa(n2, 0, n6);
                        n5 = t9d.b();
                        try {
                            try {
                                n4 = n2;
                                n3 = this.mu5;
                                if (n5 == 0) break block15;
                                if (n4 == n3) break block16;
                            }
                            catch (oov oov2) {
                                throw _ov.a(oov2);
                            }
                            n4 = n2;
                            n3 = n6;
                        }
                        catch (oov oov3) {
                            throw _ov.a(oov3);
                        }
                    }
                    try {
                        try {
                            block18: {
                                try {
                                    try {
                                        if (n5 == 0) break block17;
                                        if (n4 != n3) break block18;
                                    }
                                    catch (oov oov4) {
                                        throw _ov.a(oov4);
                                    }
                                    this.mu5 = n6;
                                    this.i7w.nrl(this.qxv);
                                    if (n5 != 0) break block16;
                                }
                                catch (oov oov5) {
                                    throw _ov.a(oov5);
                                }
                            }
                            _ov2 = this;
                            if (n5 == 0) break block19;
                        }
                        catch (oov oov6) {
                            throw _ov.a(oov6);
                        }
                        n4 = _ov2.mu5;
                        n3 = n6;
                    }
                    catch (oov oov7) {
                        throw _ov.a(oov7);
                    }
                }
                try {
                    if (n4 == n3) {
                        this.qxv = this.i7w.xct();
                    }
                }
                catch (oov oov8) {
                    throw _ov.a(oov8);
                }
                this.i7w.nrl((String)this.f41.t43.lcg().nt9().get(n2));
                _ov2 = this;
            }
            _ov2.mu5 = n2;
        }
    }

    @Override
    public void drawScreen(int n, int n2, float f) {
        block6: {
            block7: {
                _ov.df9(2.0f, this.o1e - 14, this.dt7 - 2, this.o1e - 2, Integer.MIN_VALUE);
                int n3 = t9d.c();
                this.i7w.dy2();
                int n4 = n3;
                ekw ekw2 = this.f41.t43.lcg().r7v(Mouse.getX(), Mouse.getY());
                try {
                    try {
                        try {
                            if (n4 != 0) break block6;
                            if (ekw2 == null) break block7;
                        }
                        catch (oov oov2) {
                            throw _ov.a(oov2);
                        }
                        if (ekw2.f4q().rmx() == null) break block7;
                    }
                    catch (oov oov3) {
                        throw _ov.a(oov3);
                    }
                    this.p0k(ekw2, n, n2);
                }
                catch (oov oov4) {
                    throw _ov.a(oov4);
                }
            }
            super.drawScreen(n, n2, f);
        }
    }

    public void cpv(String[] stringArray) {
        block26: {
            _ov _ov2;
            block32: {
                int n;
                block30: {
                    String string;
                    Object object;
                    int n2;
                    block28: {
                        _ov _ov3;
                        block25: {
                            n2 = t9d.c();
                            try {
                                try {
                                    _ov3 = this;
                                    if (n2 != 0) break block25;
                                    if (!_ov3.o1f) break block26;
                                }
                                catch (oov oov2) {
                                    throw _ov.a(oov2);
                                }
                                this.q20 = false;
                                _ov3 = this;
                            }
                            catch (oov oov3) {
                                throw _ov.a(oov3);
                            }
                        }
                        _ov3.w2d.clear();
                        object = stringArray;
                        int n3 = ((String[])object).length;
                        int n4 = 0;
                        while (n4 < n3) {
                            block27: {
                                block29: {
                                    String string2 = object[n4];
                                    try {
                                        try {
                                            try {
                                                if (n2 != 0) break block27;
                                                string = string2;
                                                if (n2 != 0) break block28;
                                            }
                                            catch (oov oov4) {
                                                throw _ov.a(oov4);
                                            }
                                            if (string.length() <= 0) break block29;
                                        }
                                        catch (oov oov5) {
                                            throw _ov.a(oov5);
                                        }
                                        this.w2d.add(string2);
                                    }
                                    catch (oov oov6) {
                                        throw _ov.a(oov6);
                                    }
                                }
                                ++n4;
                            }
                            if (n2 == 0) continue;
                        }
                        string = this.i7w.xct().substring(this.i7w.q6z(-1, this.i7w.jyp(), false));
                    }
                    object = string;
                    String string3 = StringUtils.getCommonPrefix((String[])stringArray);
                    try {
                        try {
                            block31: {
                                try {
                                    try {
                                        try {
                                            try {
                                                n = string3.length();
                                                if (n2 != 0) break block30;
                                                if (n <= 0) break block31;
                                            }
                                            catch (oov oov7) {
                                                throw _ov.a(oov7);
                                            }
                                            n = ((String)object).equalsIgnoreCase(string3) ? 1 : 0;
                                            if (n2 != 0) break block30;
                                        }
                                        catch (oov oov8) {
                                            throw _ov.a(oov8);
                                        }
                                        if (n != 0) break block31;
                                    }
                                    catch (oov oov9) {
                                        throw _ov.a(oov9);
                                    }
                                    this.i7w.kzc(this.i7w.q6z(-1, this.i7w.jyp(), false) - this.i7w.jyp());
                                    this.i7w.efs(string3);
                                    if (n2 == 0) break block26;
                                }
                                catch (oov oov10) {
                                    throw _ov.a(oov10);
                                }
                            }
                            _ov2 = this;
                            if (n2 != 0) break block32;
                        }
                        catch (oov oov11) {
                            throw _ov.a(oov11);
                        }
                        n = _ov2.w2d.size();
                    }
                    catch (oov oov12) {
                        throw _ov.a(oov12);
                    }
                }
                try {
                    if (n <= 0) break block26;
                    this.q20 = true;
                    _ov2 = this;
                }
                catch (oov oov13) {
                    throw _ov.a(oov13);
                }
            }
            _ov2.mje();
        }
    }

    @Override
    public boolean a99() {
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        a = c.a(8663459784255446520L, 1643190109845404872L, MethodHandles.lookup().lookupClass()).a(194783405400858L);
        long l = a ^ 0x53C9BB9963D2L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u000fo\u000b\u00e2\u00d6L\u00af\u00bc".getBytes("ISO-8859-1"));
                g = _ov.a(byArray3).intern();
                wgw = LogManager.getLogger();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static oov a(oov oov2) {
        return oov2;
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
}

