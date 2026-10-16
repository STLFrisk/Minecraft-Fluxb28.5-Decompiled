import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum u5m$cco implements v4k {
   public static final u5m$cco r1p;
   public static final u5m$cco gye;
   public static final u5m$cco i9o;
   public static final u5m$cco poz;
   public static final u5m$cco g5b;
   public static final u5m$cco k5h;
   public static final u5m$cco lam;
   public static final u5m$cco q_1;
   public static final u5m$cco ph9;
   public static final u5m$cco eet;
   private static final u5m$cco[][] t2u;
   private final u5m$bad prn;
   private final int _oe;
   private final String wcb;
   private final String y_p;
   private static final u5m$cco[] u0b;

   private u5m$cco(u5m$bad var3, int var4, String var5) {
      this(var3, var4, var5, var5);
   }

   private u5m$cco(u5m$bad var3, int var4, String var5, String var6) {
      this.prn = var3;
      this._oe = var4;
      this.wcb = var5;
      this.y_p = var6;
   }

   public u5m$bad ged() {
      return this.prn;
   }

   public int uzp() {
      return this._oe;
   }

   public static u5m$cco ndf(u5m$bad param0, int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: getstatic u5m$cco.t2u [[Lu5m$cco;
      // 07: aload 0
      // 08: invokevirtual u5m$bad.ordinal ()I
      // 0b: aaload
      // 0c: astore 3
      // 0d: iload 1
      // 0e: iload 2
      // 0f: ifeq 3c
      // 12: iflt 34
      // 15: goto 1c
      // 18: invokestatic u5m$cco.a (Loov;)Loov;
      // 1b: athrow
      // 1c: iload 1
      // 1d: iload 2
      // 1e: ifeq 3c
      // 21: goto 28
      // 24: invokestatic u5m$cco.a (Loov;)Loov;
      // 27: athrow
      // 28: aload 3
      // 29: arraylength
      // 2a: if_icmplt 3d
      // 2d: goto 34
      // 30: invokestatic u5m$cco.a (Loov;)Loov;
      // 33: athrow
      // 34: bipush 0
      // 35: goto 3c
      // 38: invokestatic u5m$cco.a (Loov;)Loov;
      // 3b: athrow
      // 3c: istore 1
      // 3d: aload 3
      // 3e: iload 1
      // 3f: aaload
      // 40: areturn
   }

   public static u5m$cco[] gp1(u5m$bad var0) {
      return t2u[var0.ordinal()];
   }

   @Override
   public String toString() {
      return this.wcb;
   }

   @Override
   public String mo3() {
      return this.wcb;
   }

   public String lvg() {
      return this.y_p;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-7311381746943500794L, 4751747230371832572L, MethodHandles.lookup().lookupClass()).a(229367334465947L);
      // $VF: monitorexit
      long var10 = var10000 ^ 11108289677842L;
      Cipher var1;
      Cipher var19 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var19.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[26];
      int var6 = 0;
      String var5 = "\u0095*S\f~/àË$\u0003ÞI\u001d»{å\u0010\u0093\u0006ñ\tJ1+ðâ¬ðý\"\u0011¦X\u0010»\u0088úPºtùP¥A\u009c\u0083\u001b\rl±\u0010\u0092L0²K6P\u0092û\u0092ÍY§$Ï.\u0010P\u0088Ãd\u007fÐh\u009fÈMÈ\u000bõÐ±\u0018\u0010®0l\t\u008fî4\u0093Y÷íVYlP¼\u0010+\u009a\u008få5~SZa·,\u008eíEØë\u0010\u0017FOéµ¥3ì/·Ïù\u0091²ë\u000b\b\u0013\rb¶\u0092E\u0091\u0092\u0010\u0084Èm{Ý`Mxx±\r\u0011Éx÷o\u0010æ\u0010ÏðqÞõ,\u0092³£¿|\u0093\u008av\u0010ÈNL\u0081¸2ãzÓ ýg\u009aH\u008c\u008f\u0010gjOV%¤Þ´n¹«00\u0084j÷\u0010\u008b$Iø\u001e\u0013¥h¶fm¿»yþ¸\b\u0012\u000eÝ)!\u001cþü\u0010ÚteÞÉ\u0012i\u0019Éy\u007f®iÇ0»\u0010;Ú\u000e¾K\u009e;\u008d\u008dêq!\u001c\u008ao+\u0010\u0084p\u0004\u0010g\u0092ÐuF*<D sá\u0019\u0010\u001fálÍyÛsìSm)H\u0016]\u00ad\u0093\u0010\u00011\u001a®£ùêåJO\u0002\u0011b£ó\u0091\bo\"(HÃ\u0091¾ê\u0010\u0017ïºÁJ73 o_ÓéÖ \u00811\u0010SÚªø_\u0013Ä°A¦íZ\u008eþh¡\u0010«\u001b\u00003ÆÄ¤Í'3S\u0088\u0097\u0095¨¡";
      int var7 = "\u0095*S\f~/àË$\u0003ÞI\u001d»{å\u0010\u0093\u0006ñ\tJ1+ðâ¬ðý\"\u0011¦X\u0010»\u0088úPºtùP¥A\u009c\u0083\u001b\rl±\u0010\u0092L0²K6P\u0092û\u0092ÍY§$Ï.\u0010P\u0088Ãd\u007fÐh\u009fÈMÈ\u000bõÐ±\u0018\u0010®0l\t\u008fî4\u0093Y÷íVYlP¼\u0010+\u009a\u008få5~SZa·,\u008eíEØë\u0010\u0017FOéµ¥3ì/·Ïù\u0091²ë\u000b\b\u0013\rb¶\u0092E\u0091\u0092\u0010\u0084Èm{Ý`Mxx±\r\u0011Éx÷o\u0010æ\u0010ÏðqÞõ,\u0092³£¿|\u0093\u008av\u0010ÈNL\u0081¸2ãzÓ ýg\u009aH\u008c\u008f\u0010gjOV%¤Þ´n¹«00\u0084j÷\u0010\u008b$Iø\u001e\u0013¥h¶fm¿»yþ¸\b\u0012\u000eÝ)!\u001cþü\u0010ÚteÞÉ\u0012i\u0019Éy\u007f®iÇ0»\u0010;Ú\u000e¾K\u009e;\u008d\u008dêq!\u001c\u008ao+\u0010\u0084p\u0004\u0010g\u0092ÐuF*<D sá\u0019\u0010\u001fálÍyÛsìSm)H\u0016]\u00ad\u0093\u0010\u00011\u001a®£ùêåJO\u0002\u0011b£ó\u0091\bo\"(HÃ\u0091¾ê\u0010\u0017ïºÁJ73 o_ÓéÖ \u00811\u0010SÚªø_\u0013Ä°A¦íZ\u008eþh¡\u0010«\u001b\u00003ÆÄ¤Í'3S\u0088\u0097\u0095¨¡"
         .length();
      char var4 = 16;
      int var18 = -1;

      label37:
      while (true) {
         String var20 = var5.substring(++var18, var18 + var4);
         byte var10001 = -1;

         while (true) {
            byte[] var9 = var1.doFinal(var20.getBytes("ISO-8859-1"));
            String var26 = a(var9).intern();
            switch (var10001) {
               case 0:
                  var8[var6++] = var26;
                  if ((var18 += var4) >= var7) {
                     r1p = new u5m$cco(u5m$bad.qtq, 0, var8[9]);
                     gye = new u5m$cco(u5m$bad.zvf, 0, var8[20]);
                     i9o = new u5m$cco(u5m$bad.zvf, 1, var8[22], var8[21]);
                     poz = new u5m$cco(u5m$bad.zvf, 2, var8[24]);
                     g5b = new u5m$cco(u5m$bad.zvf, 3, var8[13]);
                     k5h = new u5m$cco(u5m$bad.zvf, 4, var8[17], var8[3]);
                     lam = new u5m$cco(u5m$bad.zvf, 5, var8[1], var8[7]);
                     q_1 = new u5m$cco(u5m$bad.zvf, 6, var8[18], var8[23]);
                     ph9 = new u5m$cco(u5m$bad.zvf, 7, var8[16], var8[2]);
                     eet = new u5m$cco(u5m$bad.zvf, 8, var8[4], var8[6]);
                     u0b = new u5m$cco[]{r1p, gye, i9o, poz, g5b, k5h, lam, q_1, ph9, eet};
                     t2u = new u5m$cco[u5m$bad.values().length][];

                     for (u5m$bad var15 : u5m$bad.values()) {
                        Collection var16 = Collections2.filter(Lists.newArrayList(values()), new u5m$cco$1(var15));
                        t2u[var15.ordinal()] = var16.toArray(new u5m$cco[var16.size()]);
                     }

                     return;
                  }

                  var4 = var5.charAt(var18);
                  break;
               default:
                  var8[var6++] = var26;
                  if ((var18 += var4) < var7) {
                     var4 = var5.charAt(var18);
                     continue label37;
                  }

                  var5 = "\bþ\u0007Ú\t\u008eÿ%\u0010 i»ÞÛ6\u001c\u0007\u0007 4&Ý¬¤¤";
                  var7 = "\bþ\u0007Ú\t\u008eÿ%\u0010 i»ÞÛ6\u001c\u0007\u0007 4&Ý¬¤¤".length();
                  var4 = '\b';
                  var18 = -1;
            }

            var20 = var5.substring(++var18, var18 + var4);
            var10001 = 0;
         }
      }
   }

   private static oov a(oov var0) {
      return var0;
   }

   private static String a(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for (int var4 = 0; var4 < var2; var4++) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else if (var5 < 224) {
            char var6 = (char)((char)(var5 & 31) << 6);
            byte var8 = var0[++var4];
            var6 = (char)(var6 | (char)(var8 & 63));
            var3[var1++] = var6;
         } else if (var4 < var2 - 2) {
            char var12 = (char)((char)(var5 & 15) << '\f');
            byte var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63) << 6);
            var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63));
            var3[var1++] = var12;
         }
      }

      return new String(var3, 0, var1);
   }
}
