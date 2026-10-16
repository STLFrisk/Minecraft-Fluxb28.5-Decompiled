/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
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

public abstract class e3q
implements Serializable,
Cloneable {
    public static final long serialVersionUID = -732740491767276200L;
    public int uwr;
    public int pgo;
    public int g9w;
    private static final long a = c.a(8036932830520563410L, 7575343973273993139L, MethodHandles.lookup().lookupClass()).a(237581528155485L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public e3q(int n, int n2, int n3) {
        this.uwr = n;
        this.pgo = n2;
        this.g9w = n3;
    }

    public e3q(int[] nArray) {
        this.uwr = nArray[0];
        this.pgo = nArray[1];
        this.g9w = nArray[2];
    }

    public e3q(e3q e3q2) {
        this.uwr = e3q2.uwr;
        this.pgo = e3q2.pgo;
        this.g9w = e3q2.g9w;
    }

    public e3q() {
        this.uwr = 0;
        this.pgo = 0;
        this.g9w = 0;
    }

    public final void wty(int n, int n2, int n3) {
        this.uwr = n;
        this.pgo = n2;
        this.g9w = n3;
    }

    public final void n3y(int[] nArray) {
        this.uwr = nArray[0];
        this.pgo = nArray[1];
        this.g9w = nArray[2];
    }

    public final void yfa(e3q e3q2) {
        this.uwr = e3q2.uwr;
        this.pgo = e3q2.pgo;
        this.g9w = e3q2.g9w;
    }

    public final void xu3(int[] nArray) {
        nArray[0] = this.uwr;
        nArray[1] = this.pgo;
        nArray[2] = this.g9w;
    }

    public final void h8y(e3q e3q2) {
        e3q2.uwr = this.uwr;
        e3q2.pgo = this.pgo;
        e3q2.g9w = this.g9w;
    }

    public final void p89(e3q e3q2, e3q e3q3) {
        this.uwr = e3q2.uwr + e3q3.uwr;
        this.pgo = e3q2.pgo + e3q3.pgo;
        this.g9w = e3q2.g9w + e3q3.g9w;
    }

    public final void em2(e3q e3q2) {
        this.uwr += e3q2.uwr;
        this.pgo += e3q2.pgo;
        this.g9w += e3q2.g9w;
    }

    public final void z04(e3q e3q2, e3q e3q3) {
        this.uwr = e3q2.uwr - e3q3.uwr;
        this.pgo = e3q2.pgo - e3q3.pgo;
        this.g9w = e3q2.g9w - e3q3.g9w;
    }

    public final void jfx(e3q e3q2) {
        this.uwr -= e3q2.uwr;
        this.pgo -= e3q2.pgo;
        this.g9w -= e3q2.g9w;
    }

    public final void p8q(e3q e3q2) {
        this.uwr = -e3q2.uwr;
        this.pgo = -e3q2.pgo;
        this.g9w = -e3q2.g9w;
    }

    public final void kfy() {
        this.uwr = -this.uwr;
        this.pgo = -this.pgo;
        this.g9w = -this.g9w;
    }

    public final void gmk(int n, e3q e3q2) {
        this.uwr = n * e3q2.uwr;
        this.pgo = n * e3q2.pgo;
        this.g9w = n * e3q2.g9w;
    }

    public final void nma(int n) {
        this.uwr *= n;
        this.pgo *= n;
        this.g9w *= n;
    }

    public final void jck(int n, e3q e3q2, e3q e3q3) {
        this.uwr = n * e3q2.uwr + e3q3.uwr;
        this.pgo = n * e3q2.pgo + e3q3.pgo;
        this.g9w = n * e3q2.g9w + e3q3.g9w;
    }

    public final void hd3(int n, e3q e3q2) {
        this.uwr = n * this.uwr + e3q2.uwr;
        this.pgo = n * this.pgo + e3q2.pgo;
        this.g9w = n * this.g9w + e3q2.g9w;
    }

    public String toString() {
        long l = a ^ 0x6265D02327DBL;
        return "(" + this.uwr + (String)((Object)e3q.a("u", (int)21653, (long)(0x2F7D2EA53F217EC4L ^ l))) + this.pgo + (String)((Object)e3q.a("u", (int)19922, (long)(0x17664F7C184FE782L ^ l))) + this.g9w + ")";
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        int n = t9d.c();
        try {
            int n2;
            int n3;
            block14: {
                e3q e3q2;
                block16: {
                    block13: {
                        e3q2 = (e3q)object;
                        n3 = this.uwr;
                        n2 = e3q2.uwr;
                        if (n != 0) break block13;
                        try {
                            block15: {
                                break block15;
                                catch (NullPointerException nullPointerException) {
                                    throw e3q.a(nullPointerException);
                                }
                            }
                            if (n3 != n2) return 0 != 0;
                            n3 = this.pgo;
                            n2 = e3q2.pgo;
                        }
                        catch (NullPointerException nullPointerException) {
                            throw e3q.a(nullPointerException);
                        }
                    }
                    if (n != 0) break block14;
                    break block16;
                    catch (NullPointerException nullPointerException) {
                        throw e3q.a(nullPointerException);
                    }
                }
                if (n3 != n2) return 0 != 0;
                try {
                    block17: {
                        break block17;
                        catch (NullPointerException nullPointerException) {
                            throw e3q.a(nullPointerException);
                        }
                    }
                    n3 = this.g9w;
                    if (n != 0) return n3 != 0;
                    n2 = e3q2.g9w;
                }
                catch (NullPointerException nullPointerException) {
                    throw e3q.a(nullPointerException);
                }
            }
            if (n3 != n2) return 0 != 0;
            return 1 != 0;
        }
        catch (NullPointerException nullPointerException) {
            return false;
        }
        catch (ClassCastException classCastException) {
            return false;
        }
    }

    public int hashCode() {
        long l = 1L;
        l = 31L * l + (long)this.uwr;
        l = 31L * l + (long)this.pgo;
        l = 31L * l + (long)this.g9w;
        return (int)(l ^ l >> 32);
    }

    public final void uj7(int n, int n2, e3q e3q2) {
        block48: {
            block49: {
                e3q e3q3;
                int n3;
                int n4;
                int n5;
                block46: {
                    block43: {
                        block44: {
                            e3q e3q4;
                            int n6;
                            int n7;
                            block41: {
                                block38: {
                                    block39: {
                                        e3q e3q5;
                                        int n8;
                                        int n9;
                                        block36: {
                                            n5 = t9d.b();
                                            try {
                                                try {
                                                    block37: {
                                                        try {
                                                            try {
                                                                n9 = e3q2.uwr;
                                                                n8 = n2;
                                                                if (n5 == 0) break block36;
                                                                if (n9 <= n8) break block37;
                                                            }
                                                            catch (NullPointerException nullPointerException) {
                                                                throw e3q.a(nullPointerException);
                                                            }
                                                            this.uwr = n2;
                                                            if (n5 != 0) break block38;
                                                        }
                                                        catch (NullPointerException nullPointerException) {
                                                            throw e3q.a(nullPointerException);
                                                        }
                                                    }
                                                    e3q5 = e3q2;
                                                    if (n5 == 0) break block39;
                                                }
                                                catch (NullPointerException nullPointerException) {
                                                    throw e3q.a(nullPointerException);
                                                }
                                                n9 = e3q5.uwr;
                                                n8 = n;
                                            }
                                            catch (NullPointerException nullPointerException) {
                                                throw e3q.a(nullPointerException);
                                            }
                                        }
                                        try {
                                            block40: {
                                                try {
                                                    if (n9 >= n8) break block40;
                                                    this.uwr = n;
                                                    if (n5 != 0) break block38;
                                                }
                                                catch (NullPointerException nullPointerException) {
                                                    throw e3q.a(nullPointerException);
                                                }
                                            }
                                            e3q5 = this;
                                        }
                                        catch (NullPointerException nullPointerException) {
                                            throw e3q.a(nullPointerException);
                                        }
                                    }
                                    e3q5.uwr = e3q2.uwr;
                                }
                                try {
                                    try {
                                        block42: {
                                            try {
                                                try {
                                                    n7 = e3q2.pgo;
                                                    n6 = n2;
                                                    if (n5 == 0) break block41;
                                                    if (n7 <= n6) break block42;
                                                }
                                                catch (NullPointerException nullPointerException) {
                                                    throw e3q.a(nullPointerException);
                                                }
                                                this.pgo = n2;
                                                if (n5 != 0) break block43;
                                            }
                                            catch (NullPointerException nullPointerException) {
                                                throw e3q.a(nullPointerException);
                                            }
                                        }
                                        e3q4 = e3q2;
                                        if (n5 == 0) break block44;
                                    }
                                    catch (NullPointerException nullPointerException) {
                                        throw e3q.a(nullPointerException);
                                    }
                                    n7 = e3q4.pgo;
                                    n6 = n;
                                }
                                catch (NullPointerException nullPointerException) {
                                    throw e3q.a(nullPointerException);
                                }
                            }
                            try {
                                block45: {
                                    try {
                                        if (n7 >= n6) break block45;
                                        this.pgo = n;
                                        if (n5 != 0) break block43;
                                    }
                                    catch (NullPointerException nullPointerException) {
                                        throw e3q.a(nullPointerException);
                                    }
                                }
                                e3q4 = this;
                            }
                            catch (NullPointerException nullPointerException) {
                                throw e3q.a(nullPointerException);
                            }
                        }
                        e3q4.pgo = e3q2.pgo;
                    }
                    try {
                        try {
                            block47: {
                                try {
                                    try {
                                        n4 = e3q2.g9w;
                                        n3 = n2;
                                        if (n5 == 0) break block46;
                                        if (n4 <= n3) break block47;
                                    }
                                    catch (NullPointerException nullPointerException) {
                                        throw e3q.a(nullPointerException);
                                    }
                                    this.g9w = n2;
                                    if (n5 != 0) break block48;
                                }
                                catch (NullPointerException nullPointerException) {
                                    throw e3q.a(nullPointerException);
                                }
                            }
                            e3q3 = e3q2;
                            if (n5 == 0) break block49;
                        }
                        catch (NullPointerException nullPointerException) {
                            throw e3q.a(nullPointerException);
                        }
                        n4 = e3q3.g9w;
                        n3 = n;
                    }
                    catch (NullPointerException nullPointerException) {
                        throw e3q.a(nullPointerException);
                    }
                }
                try {
                    block50: {
                        try {
                            if (n4 >= n3) break block50;
                            this.g9w = n;
                            if (n5 != 0) break block48;
                        }
                        catch (NullPointerException nullPointerException) {
                            throw e3q.a(nullPointerException);
                        }
                    }
                    e3q3 = this;
                }
                catch (NullPointerException nullPointerException) {
                    throw e3q.a(nullPointerException);
                }
            }
            e3q3.g9w = e3q2.g9w;
        }
    }

    public final void ie6(int n, e3q e3q2) {
        block26: {
            block24: {
                int n2;
                block23: {
                    block21: {
                        block20: {
                            block18: {
                                n2 = t9d.c();
                                try {
                                    e3q e3q3;
                                    block19: {
                                        try {
                                            try {
                                                e3q3 = e3q2;
                                                if (n2 != 0) break block18;
                                                if (e3q3.uwr >= n) break block19;
                                            }
                                            catch (NullPointerException nullPointerException) {
                                                throw e3q.a(nullPointerException);
                                            }
                                            this.uwr = n;
                                            if (n2 == 0) break block20;
                                        }
                                        catch (NullPointerException nullPointerException) {
                                            throw e3q.a(nullPointerException);
                                        }
                                    }
                                    e3q3 = this;
                                }
                                catch (NullPointerException nullPointerException) {
                                    throw e3q.a(nullPointerException);
                                }
                            }
                            e3q3.uwr = e3q2.uwr;
                        }
                        try {
                            e3q e3q4;
                            block22: {
                                try {
                                    try {
                                        e3q4 = e3q2;
                                        if (n2 != 0) break block21;
                                        if (e3q4.pgo >= n) break block22;
                                    }
                                    catch (NullPointerException nullPointerException) {
                                        throw e3q.a(nullPointerException);
                                    }
                                    this.pgo = n;
                                    if (n2 == 0) break block23;
                                }
                                catch (NullPointerException nullPointerException) {
                                    throw e3q.a(nullPointerException);
                                }
                            }
                            e3q4 = this;
                        }
                        catch (NullPointerException nullPointerException) {
                            throw e3q.a(nullPointerException);
                        }
                    }
                    e3q4.pgo = e3q2.pgo;
                }
                try {
                    e3q e3q5;
                    block25: {
                        try {
                            try {
                                e3q5 = e3q2;
                                if (n2 != 0) break block24;
                                if (e3q5.g9w >= n) break block25;
                            }
                            catch (NullPointerException nullPointerException) {
                                throw e3q.a(nullPointerException);
                            }
                            this.g9w = n;
                            if (n2 == 0) break block26;
                        }
                        catch (NullPointerException nullPointerException) {
                            throw e3q.a(nullPointerException);
                        }
                    }
                    e3q5 = this;
                }
                catch (NullPointerException nullPointerException) {
                    throw e3q.a(nullPointerException);
                }
            }
            e3q5.g9w = e3q2.g9w;
        }
    }

    public final void hic(int n, e3q e3q2) {
        block26: {
            block24: {
                int n2;
                block23: {
                    block21: {
                        block20: {
                            block18: {
                                n2 = t9d.c();
                                try {
                                    e3q e3q3;
                                    block19: {
                                        try {
                                            try {
                                                e3q3 = e3q2;
                                                if (n2 != 0) break block18;
                                                if (e3q3.uwr <= n) break block19;
                                            }
                                            catch (NullPointerException nullPointerException) {
                                                throw e3q.a(nullPointerException);
                                            }
                                            this.uwr = n;
                                            if (n2 == 0) break block20;
                                        }
                                        catch (NullPointerException nullPointerException) {
                                            throw e3q.a(nullPointerException);
                                        }
                                    }
                                    e3q3 = this;
                                }
                                catch (NullPointerException nullPointerException) {
                                    throw e3q.a(nullPointerException);
                                }
                            }
                            e3q3.uwr = e3q2.uwr;
                        }
                        try {
                            e3q e3q4;
                            block22: {
                                try {
                                    try {
                                        e3q4 = e3q2;
                                        if (n2 != 0) break block21;
                                        if (e3q4.pgo <= n) break block22;
                                    }
                                    catch (NullPointerException nullPointerException) {
                                        throw e3q.a(nullPointerException);
                                    }
                                    this.pgo = n;
                                    if (n2 == 0) break block23;
                                }
                                catch (NullPointerException nullPointerException) {
                                    throw e3q.a(nullPointerException);
                                }
                            }
                            e3q4 = this;
                        }
                        catch (NullPointerException nullPointerException) {
                            throw e3q.a(nullPointerException);
                        }
                    }
                    e3q4.pgo = e3q2.pgo;
                }
                try {
                    e3q e3q5;
                    block25: {
                        try {
                            try {
                                e3q5 = e3q2;
                                if (n2 != 0) break block24;
                                if (e3q5.g9w <= n) break block25;
                            }
                            catch (NullPointerException nullPointerException) {
                                throw e3q.a(nullPointerException);
                            }
                            this.g9w = n;
                            if (n2 == 0) break block26;
                        }
                        catch (NullPointerException nullPointerException) {
                            throw e3q.a(nullPointerException);
                        }
                    }
                    e3q5 = this;
                }
                catch (NullPointerException nullPointerException) {
                    throw e3q.a(nullPointerException);
                }
            }
            e3q5.g9w = e3q2.g9w;
        }
    }

    public final void ldt(e3q e3q2) {
        this.uwr = Math.abs(e3q2.uwr);
        this.pgo = Math.abs(e3q2.pgo);
        this.g9w = Math.abs(e3q2.g9w);
    }

    public final void mjw(int n, int n2) {
        block40: {
            block41: {
                e3q e3q2;
                int n3;
                int n4;
                block38: {
                    int n5;
                    block37: {
                        block36: {
                            block34: {
                                block33: {
                                    block32: {
                                        block30: {
                                            n5 = t9d.b();
                                            try {
                                                block31: {
                                                    try {
                                                        try {
                                                            n4 = this.uwr;
                                                            n3 = n2;
                                                            if (n5 == 0) break block30;
                                                            if (n4 <= n3) break block31;
                                                        }
                                                        catch (NullPointerException nullPointerException) {
                                                            throw e3q.a(nullPointerException);
                                                        }
                                                        this.uwr = n2;
                                                        if (n5 != 0) break block32;
                                                    }
                                                    catch (NullPointerException nullPointerException) {
                                                        throw e3q.a(nullPointerException);
                                                    }
                                                }
                                                n4 = this.uwr;
                                                n3 = n;
                                            }
                                            catch (NullPointerException nullPointerException) {
                                                throw e3q.a(nullPointerException);
                                            }
                                        }
                                        try {
                                            try {
                                                if (n5 == 0) break block33;
                                                if (n4 >= n3) break block32;
                                            }
                                            catch (NullPointerException nullPointerException) {
                                                throw e3q.a(nullPointerException);
                                            }
                                            this.uwr = n;
                                        }
                                        catch (NullPointerException nullPointerException) {
                                            throw e3q.a(nullPointerException);
                                        }
                                    }
                                    n4 = this.pgo;
                                    n3 = n2;
                                }
                                try {
                                    block35: {
                                        try {
                                            try {
                                                if (n5 == 0) break block34;
                                                if (n4 <= n3) break block35;
                                            }
                                            catch (NullPointerException nullPointerException) {
                                                throw e3q.a(nullPointerException);
                                            }
                                            this.pgo = n2;
                                            if (n5 != 0) break block36;
                                        }
                                        catch (NullPointerException nullPointerException) {
                                            throw e3q.a(nullPointerException);
                                        }
                                    }
                                    n4 = this.pgo;
                                    n3 = n;
                                }
                                catch (NullPointerException nullPointerException) {
                                    throw e3q.a(nullPointerException);
                                }
                            }
                            try {
                                try {
                                    if (n5 == 0) break block37;
                                    if (n4 >= n3) break block36;
                                }
                                catch (NullPointerException nullPointerException) {
                                    throw e3q.a(nullPointerException);
                                }
                                this.pgo = n;
                            }
                            catch (NullPointerException nullPointerException) {
                                throw e3q.a(nullPointerException);
                            }
                        }
                        n4 = this.g9w;
                        n3 = n2;
                    }
                    try {
                        try {
                            block39: {
                                try {
                                    try {
                                        if (n5 == 0) break block38;
                                        if (n4 <= n3) break block39;
                                    }
                                    catch (NullPointerException nullPointerException) {
                                        throw e3q.a(nullPointerException);
                                    }
                                    this.g9w = n2;
                                    if (n5 != 0) break block40;
                                }
                                catch (NullPointerException nullPointerException) {
                                    throw e3q.a(nullPointerException);
                                }
                            }
                            e3q2 = this;
                            if (n5 == 0) break block41;
                        }
                        catch (NullPointerException nullPointerException) {
                            throw e3q.a(nullPointerException);
                        }
                        n4 = e3q2.g9w;
                        n3 = n;
                    }
                    catch (NullPointerException nullPointerException) {
                        throw e3q.a(nullPointerException);
                    }
                }
                if (n4 >= n3) break block40;
                e3q2 = this;
            }
            e3q2.g9w = n;
        }
    }

    public final void _xp(int n) {
        block17: {
            block16: {
                e3q e3q2;
                int n2;
                int n3;
                block14: {
                    int n4;
                    block15: {
                        block12: {
                            block13: {
                                n4 = t9d.c();
                                try {
                                    try {
                                        n3 = this.uwr;
                                        n2 = n;
                                        if (n4 != 0) break block12;
                                        if (n3 >= n2) break block13;
                                    }
                                    catch (NullPointerException nullPointerException) {
                                        throw e3q.a(nullPointerException);
                                    }
                                    this.uwr = n;
                                }
                                catch (NullPointerException nullPointerException) {
                                    throw e3q.a(nullPointerException);
                                }
                            }
                            n3 = this.pgo;
                            n2 = n;
                        }
                        try {
                            try {
                                if (n4 != 0) break block14;
                                if (n3 >= n2) break block15;
                            }
                            catch (NullPointerException nullPointerException) {
                                throw e3q.a(nullPointerException);
                            }
                            this.pgo = n;
                        }
                        catch (NullPointerException nullPointerException) {
                            throw e3q.a(nullPointerException);
                        }
                    }
                    try {
                        e3q2 = this;
                        if (n4 != 0) break block16;
                        n3 = e3q2.g9w;
                        n2 = n;
                    }
                    catch (NullPointerException nullPointerException) {
                        throw e3q.a(nullPointerException);
                    }
                }
                if (n3 >= n2) break block17;
                e3q2 = this;
            }
            e3q2.g9w = n;
        }
    }

    public final void s6f(int n) {
        block17: {
            block16: {
                e3q e3q2;
                int n2;
                int n3;
                block14: {
                    int n4;
                    block15: {
                        block12: {
                            block13: {
                                n4 = t9d.c();
                                try {
                                    try {
                                        n3 = this.uwr;
                                        n2 = n;
                                        if (n4 != 0) break block12;
                                        if (n3 <= n2) break block13;
                                    }
                                    catch (NullPointerException nullPointerException) {
                                        throw e3q.a(nullPointerException);
                                    }
                                    this.uwr = n;
                                }
                                catch (NullPointerException nullPointerException) {
                                    throw e3q.a(nullPointerException);
                                }
                            }
                            n3 = this.pgo;
                            n2 = n;
                        }
                        try {
                            try {
                                if (n4 != 0) break block14;
                                if (n3 <= n2) break block15;
                            }
                            catch (NullPointerException nullPointerException) {
                                throw e3q.a(nullPointerException);
                            }
                            this.pgo = n;
                        }
                        catch (NullPointerException nullPointerException) {
                            throw e3q.a(nullPointerException);
                        }
                    }
                    try {
                        e3q2 = this;
                        if (n4 != 0) break block16;
                        n3 = e3q2.g9w;
                        n2 = n;
                    }
                    catch (NullPointerException nullPointerException) {
                        throw e3q.a(nullPointerException);
                    }
                }
                if (n3 <= n2) break block17;
                e3q2 = this;
            }
            e3q2.g9w = n;
        }
    }

    public final void m82() {
        this.uwr = Math.abs(this.uwr);
        this.pgo = Math.abs(this.pgo);
        this.g9w = Math.abs(this.g9w);
    }

    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new InternalError();
        }
    }

    public final int ati() {
        return this.uwr;
    }

    public final void w3w(int n) {
        this.uwr = n;
    }

    public final int hg_() {
        return this.pgo;
    }

    public final void n_0(int n) {
        this.pgo = n;
    }

    public final int pu4() {
        return this.g9w;
    }

    public final void bjx(int n) {
        this.g9w = n;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        d = new HashMap(13);
        long l = a ^ 0x7D20D42E80CCL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        String[] stringArray = new String[2];
        int n = 0;
        String string = "-0(#\u000b\u00a5\u00f4&\u00fe\u00e0\u0006\u00d8\u008d@\u0014\u00e2\u0010\"\u001a\u00f2\u00f9\u000f\u0012\u0002\u008f\u00d29\u00d8\u00e1\u0016\u00bb\u008f:";
        int n2 = "-0(#\u000b\u00a5\u00f4&\u00fe\u00e0\u0006\u00d8\u008d@\u0014\u00e2\u0010\"\u001a\u00f2\u00f9\u000f\u0012\u0002\u008f\u00d29\u00d8\u00e1\u0016\u00bb\u008f:".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = e3q.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                c = new String[2];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static NullPointerException a(NullPointerException nullPointerException) {
        return nullPointerException;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x31A2;
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
                throw new RuntimeException("e3q", exception);
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
            e3q.c[n2] = e3q.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = e3q.a(n, l);
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
            throw new RuntimeException("e3q" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(e3q.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

