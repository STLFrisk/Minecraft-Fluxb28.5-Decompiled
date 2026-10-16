/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.Validate
 */
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import org.apache.commons.lang3.Validate;

public class cfu {
    public static HttpURLConnection htx(URL uRL) {
        Validate.notNull((Object)uRL);
        HttpURLConnection httpURLConnection = (HttpURLConnection)uRL.openConnection();
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(15000);
        httpURLConnection.setUseCaches(false);
        return httpURLConnection;
    }

    public static String q4z(URL uRL) {
        return new cfu().p6w(uRL);
    }

    public native String p6w(URL var1);

    public static String bhl(String string, String string2) {
        String string3;
        block4: {
            String string4;
            String string5 = string;
            URL uRL = new URL(string5);
            URLConnection uRLConnection = uRL.openConnection();
            uRLConnection.setDoOutput(true);
            OutputStream outputStream = uRLConnection.getOutputStream();
            PrintStream printStream = new PrintStream(outputStream);
            printStream.print(string2);
            int n = t9d.c();
            printStream.close();
            InputStream inputStream = uRLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            int n2 = n;
            string3 = "";
            while ((string4 = bufferedReader.readLine()) != null) {
                string3 = string3 + string4;
                try {
                    if (n2 == 0) {
                        if (n2 == 0) continue;
                        break;
                    }
                    break block4;
                }
                catch (oov oov2) {
                    throw cfu.a(oov2);
                }
            }
            bufferedReader.close();
        }
        return string3;
    }

    static {
        v6ma.Ex(0);
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

