/*
 * Decompiled with CFR 0.152.
 */
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

public final class c6g$2
extends URLStreamHandler {
    public final gdz t67;

    public c6g$2(gdz gdz2) {
        this.t67 = gdz2;
    }

    @Override
    public URLConnection openConnection(URL uRL) {
        return new c6g$2$1(this, uRL);
    }
}

