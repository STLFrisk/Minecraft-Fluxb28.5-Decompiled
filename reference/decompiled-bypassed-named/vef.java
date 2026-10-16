import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class vef {
   public static final vef[] ql6;
   public static final vef o55;
   public static final vef qt1;
   public static final vef tkb;
   public static final vef dru;
   public static final vef brx;
   public static final vef e8b;
   public static final vef bhq;
   public static final vef pm0;
   public static final vef fem;
   public static final vef m3n;
   public static final vef gzo;
   public static final vef nnm;
   public static final vef uqc;
   public static final vef zbl;
   public static final vef qvk;
   public static final vef y_g;
   public static final vef w9s;
   public static final vef _jm;
   public static final vef xl7;
   public static final vef s61;
   public static final vef t24;
   public static final vef pxu;
   public static final vef _8i;
   public static final vef hmg;
   public static final vef d00;
   public final int bbf;
   public bn1 n1z;
   public String evn;
   private static final long b;
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public static vef k6j(int var0) {
      int var1 = OpaquePredicate.c();

      int var10000;
      label27: {
         try {
            var10000 = var0;
            if (var1 != 0) {
               break label27;
            }

            if (var0 < 0) {
               return null;
            }
         } catch (IllegalArgumentException var3) {
            throw a(var3);
         }

         var10000 = var0;
      }

      try {
         if (var10000 < z46.length) {
            return z46[var0];
         }
      } catch (IllegalArgumentException var2) {
         throw a(var2);
      }

      return null;
   }

   public vef(int var1, gdz var2, int var3, bn1 var4) {
      long var5 = b ^ 14412295550696L;
      super();
      this.bbf = var1;
      this.d_3 = var3;
      this.n1z = var4;
      if (z46[var1] != null) {
         throw new IllegalArgumentException(a<"w">(21817, 4624235639744476482L ^ var5));
      } else {
         z46[var1] = this;
         ua_.put(var2, this);
      }
   }

   public static vef w19(String var0) {
      return (vef)ua_.get(new gdz(var0));
   }

   public static Set wid() {
      return ua_.keySet();
   }

   public int xiu() {
      return this.d_3;
   }

   public int s20() {
      return 1;
   }

   public int ehp() {
      return 1;
   }

   public int qwk(int var1) {
      return 1 + var1 * 10;
   }

   public int fnu(int var1) {
      return this.qwk(var1) + 5;
   }

   public int f_3(int var1, ofh var2) {
      return 0;
   }

   public float bxa(int var1, n1e var2) {
      return 0.0F;
   }

   public boolean yhx(vef var1) {
      try {
         if (this != var1) {
            return true;
         }
      } catch (IllegalArgumentException var2) {
         throw a(var2);
      }

      return false;
   }

   public vef wr5(String var1) {
      this.evn = var1;
      return this;
   }

   public String d8j() {
      long var1 = b ^ 40638429963182L;
      return a<"w">(21139, 3031948591746820002L ^ var1) + this.evn;
   }

   public String pjv(int var1) {
      long var2 = b ^ 21070183878606L;
      String var4 = orr.zgh(this.d8j());
      return var4 + " " + orr.zgh(a<"w">(18786, 8405422888228802606L ^ var2) + var1);
   }

   public boolean ovd(erg var1) {
      return this.n1z.ou1(var1.gn1());
   }

   public void cdh(Entity var1, EntityLivingBase var2, int var3) {
   }

   public void k9o(Entity var1, EntityLivingBase var2, int var3) {
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-412764514785226541L, 7678897571362221804L, MethodHandles.lookup().lookupClass()).a(42109046184734L);
      // $VF: monitorexit
      b = var10000;
      long var9 = b ^ 68277222229697L;
      Cipher var0;
      Cipher var19 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var19.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[28];
      int var5 = 0;
      String var4 = "\u0013í[~i¨\u0007ÿ÷LH\u0005P\u0004T\u0097(Ë\u0015²Ýª\u0002De´ó_\u0014\u0092yßÏùTâ\u0007-2ß)\"âUojF\nnï\n\\.)Ul[\u0018\u00018Khê#¯\u0095.çëªLÒ\u008aYðó1Y4MM\u001b öXm\u0090é\u0014ç¸\u008b_qI\u0005Q0¥+\u0018\u0003\u000f\u0083×\u0006\u009b\u00160\"£ä\u0007\u0010|\u0018å\u0099(Å¤\u000b\u000eä»H/µ¾¿ôkX<\u0080\u0014ýÃ\u007f¯\u0018¯\u0010ïR²Ïg\u008d¨\rvÜ\u0014D\u0006J\u0089\u009f;^]1\u0098¹\u0018\u0017j:¯V\u0011¸öëßË\u0012ÜÍ\u0084©1\u001dâ\u007fâ\u009a{-\u0010ø¿$\u0087Ú\u0093\u000bþÞ\u0087`\u0092Ï<ke8äµ²rZ?\n:Ó\u0083;\u009a}Ý\u008aôÇr\u0084\u009bþ²þän¼¨PÛWe\u0001kVe-6\u0083©gÀh!×w5\u001c\u009d©(µ\u0007ÝÂâÖ\u0010Ê=\u0090\u00adÌB¼é¤\u000b\u0013LûÜí \u0010ÒU=qx`\u009eÙ.¸\u0095Âà~Öþ =\u009c\u0019\u001fñ~¤U\u0085GYU¹Uv9Ñ\u001f\u0011]dÂ\u0004\b±zÄ$ÅA¼z\u0010\u0013 \u0010\u009ao-4Õúðó\r\u0084\u0000Ôø\u0018Ã\u0095Åð$ò£,Ëû;ßn4ð\u00ad¢eÀæ¯÷Q[ \u001f\u0005\u0094G\u0091Çø°(wõ%é\u009bù\u008aClÂ¾Â\u0092\u009a\u008bväøéü?\u0089F\u0010!øZz\u0086\u008fÃbéya´/jîÚ\u0018²i àt=¤ 'L\u000f>\u001e\u0084Uã;J!\u000eÀR·¾\u0018fÐº\u0011\u0088\u0099+=\u0011\u0019§\u0014<Àø\u0015%¾mQ\u0011ZÎé(\"+tC9ØLÂ\u0096HõÜ¹Yv{ÜKz¼\u0013\u0011ã\u0093\f\u0000LÈq1~¨\u001eÅ³«Ð#2\u0019\u0010\u0092Ð=i\u0084v\u0087\u009b\u0082ìCYÓËg=\u0010\fMwCÜv4Ìk*^X\u0018Ð<\n ¨}Û`³\u0087S\u008dZ\u0098\u0000§\u0099\u0082\u0012&Ô\u0099\u0011ll\u000f\u001a]Ï¯êTew\u007f©\u0018\u0089§Ê)Þ\u0017J\u001al\u001a®\u008b\u001d\u00939y\u0091óÛ\u0085È\u001b?\u0019(\u009f\u009b\u008f\u008bT³\u0000.âÅ¹EÝ¼\u009d]2J¯ôëÇB°Û_\u001aQÃóHÂ\u0013\u0090EP\u009d8V= ÍXúQ½\u0094ÿJÉwíH|×zfV\u0014u\u0093\u008a8+ì\u0093Åð¾õ´g\b(G[ïUÓ\u001a¥W3\u0007\u0081\u0012Æ{\u0086ªv«\u008d×\u001ei}Az\n\u0080úÝ\u001d¥\u0006Ã\u007fñQÒ;Ã¶";
      int var6 = "\u0013í[~i¨\u0007ÿ÷LH\u0005P\u0004T\u0097(Ë\u0015²Ýª\u0002De´ó_\u0014\u0092yßÏùTâ\u0007-2ß)\"âUojF\nnï\n\\.)Ul[\u0018\u00018Khê#¯\u0095.çëªLÒ\u008aYðó1Y4MM\u001b öXm\u0090é\u0014ç¸\u008b_qI\u0005Q0¥+\u0018\u0003\u000f\u0083×\u0006\u009b\u00160\"£ä\u0007\u0010|\u0018å\u0099(Å¤\u000b\u000eä»H/µ¾¿ôkX<\u0080\u0014ýÃ\u007f¯\u0018¯\u0010ïR²Ïg\u008d¨\rvÜ\u0014D\u0006J\u0089\u009f;^]1\u0098¹\u0018\u0017j:¯V\u0011¸öëßË\u0012ÜÍ\u0084©1\u001dâ\u007fâ\u009a{-\u0010ø¿$\u0087Ú\u0093\u000bþÞ\u0087`\u0092Ï<ke8äµ²rZ?\n:Ó\u0083;\u009a}Ý\u008aôÇr\u0084\u009bþ²þän¼¨PÛWe\u0001kVe-6\u0083©gÀh!×w5\u001c\u009d©(µ\u0007ÝÂâÖ\u0010Ê=\u0090\u00adÌB¼é¤\u000b\u0013LûÜí \u0010ÒU=qx`\u009eÙ.¸\u0095Âà~Öþ =\u009c\u0019\u001fñ~¤U\u0085GYU¹Uv9Ñ\u001f\u0011]dÂ\u0004\b±zÄ$ÅA¼z\u0010\u0013 \u0010\u009ao-4Õúðó\r\u0084\u0000Ôø\u0018Ã\u0095Åð$ò£,Ëû;ßn4ð\u00ad¢eÀæ¯÷Q[ \u001f\u0005\u0094G\u0091Çø°(wõ%é\u009bù\u008aClÂ¾Â\u0092\u009a\u008bväøéü?\u0089F\u0010!øZz\u0086\u008fÃbéya´/jîÚ\u0018²i àt=¤ 'L\u000f>\u001e\u0084Uã;J!\u000eÀR·¾\u0018fÐº\u0011\u0088\u0099+=\u0011\u0019§\u0014<Àø\u0015%¾mQ\u0011ZÎé(\"+tC9ØLÂ\u0096HõÜ¹Yv{ÜKz¼\u0013\u0011ã\u0093\f\u0000LÈq1~¨\u001eÅ³«Ð#2\u0019\u0010\u0092Ð=i\u0084v\u0087\u009b\u0082ìCYÓËg=\u0010\fMwCÜv4Ìk*^X\u0018Ð<\n ¨}Û`³\u0087S\u008dZ\u0098\u0000§\u0099\u0082\u0012&Ô\u0099\u0011ll\u000f\u001a]Ï¯êTew\u007f©\u0018\u0089§Ê)Þ\u0017J\u001al\u001a®\u008b\u001d\u00939y\u0091óÛ\u0085È\u001b?\u0019(\u009f\u009b\u008f\u008bT³\u0000.âÅ¹EÝ¼\u009d]2J¯ôëÇB°Û_\u001aQÃóHÂ\u0013\u0090EP\u009d8V= ÍXúQ½\u0094ÿJÉwíH|×zfV\u0014u\u0093\u008a8+ì\u0093Åð¾õ´g\b(G[ïUÓ\u001a¥W3\u0007\u0081\u0012Æ{\u0086ªv«\u008d×\u001ei}Az\n\u0080úÝ\u001d¥\u0006Ã\u007fñQÒ;Ã¶"
         .length();
      char var3 = 16;
      int var18 = -1;

      label50:
      while (true) {
         String var20 = var4.substring(++var18, var18 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var20.getBytes("ISO-8859-1"));
            String var26 = a(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var26;
                  if ((var18 += var3) >= var6) {
                     c = var7;
                     d = new String[28];
                     z46 = new vef[256];
                     ua_ = Maps.newHashMap();
                     o55 = new a1s(0, new gdz(a<"w">(21530, 3961366163128435779L ^ var9)), 10, 0);
                     qt1 = new a1s(1, new gdz(a<"w">(19968, 5058481400983805504L ^ var9)), 5, 1);
                     tkb = new a1s(2, new gdz(a<"w">(26947, 544175621621446930L ^ var9)), 5, 2);
                     dru = new a1s(3, new gdz(a<"w">(1834, 5015606334521972578L ^ var9)), 2, 3);
                     brx = new a1s(4, new gdz(a<"w">(26882, 3410244135802567001L ^ var9)), 5, 4);
                     e8b = new nrt(5, new gdz(a<"w">(10589, 7363936443725560074L ^ var9)), 2);
                     bhq = new nh0(6, new gdz(a<"w">(10821, 1367526258782124559L ^ var9)), 2);
                     pm0 = new svi(7, new gdz(a<"w">(13513, 4952974657541219487L ^ var9)), 1);
                     fem = new vnt(8, new gdz(a<"w">(889, 4351889721963418422L ^ var9)), 2);
                     m3n = new htp(16, new gdz(a<"w">(26881, 1283093700744477002L ^ var9)), 10, 0);
                     gzo = new htp(17, new gdz(a<"w">(8166, 6553670337497206710L ^ var9)), 5, 1);
                     nnm = new htp(18, new gdz(a<"w">(1989, 4186886828023486344L ^ var9)), 5, 2);
                     uqc = new u71(19, new gdz(a<"w">(11324, 3856511091822738557L ^ var9)), 5);
                     zbl = new m8m(20, new gdz(a<"w">(23943, 6021482919845514707L ^ var9)), 2);
                     qvk = new jwq(21, new gdz(a<"w">(18721, 74040630227392891L ^ var9)), 2, bn1.phf);
                     y_g = new zvo(32, new gdz(a<"w">(21312, 2882258076951790364L ^ var9)), 10);
                     w9s = new n4e(33, new gdz(a<"w">(7431, 3195967414329412933L ^ var9)), 1);
                     _jm = new ofe(34, new gdz(a<"w">(22142, 4261189894581339698L ^ var9)), 5);
                     xl7 = new jwq(35, new gdz(a<"w">(1275, 5189084921914135726L ^ var9)), 2, bn1.q92);
                     s61 = new c5k(48, new gdz(a<"w">(1431, 2587137326400116190L ^ var9)), 10);
                     t24 = new cmg(49, new gdz(a<"w">(28211, 7939282817192623726L ^ var9)), 2);
                     pxu = new jcy(50, new gdz(a<"w">(29602, 4125505696911975409L ^ var9)), 2);
                     _8i = new tgt(51, new gdz(a<"w">(4131, 5125554434958033020L ^ var9)), 1);
                     hmg = new jwq(61, new gdz(a<"w">(25053, 4067112895934165381L ^ var9)), 2, bn1.eed);
                     d00 = new od1(62, new gdz(a<"w">(12485, 2109510259135062155L ^ var9)), 2, bn1.eed);
                     ArrayList var11 = Lists.newArrayList();

                     for (vef var15 : z46) {
                        try {
                           if (var15 != null) {
                              var11.add(var15);
                           }
                        } catch (IllegalArgumentException var16) {
                           throw a(var16);
                        }
                     }

                     ql6 = var11.toArray(new vef[var11.size()]);
                     return;
                  }

                  var3 = var4.charAt(var18);
                  break;
               default:
                  var7[var5++] = var26;
                  if ((var18 += var3) < var6) {
                     var3 = var4.charAt(var18);
                     continue label50;
                  }

                  var4 = "ìt¤a·íb8ò:¾jÔ\u0080âF¬ÀQejQ*\u000e\u0018öÒ()\u001eí_\u000flç$tEkÜä\u008a<=É~C\u0018\u0097";
                  var6 = "ìt¤a·íb8ò:¾jÔ\u0080âF¬ÀQejQ*\u000e\u0018öÒ()\u001eí_\u000flç$tEkÜä\u008a<=É~C\u0018\u0097".length();
                  var3 = 24;
                  var18 = -1;
            }

            var20 = var4.substring(++var18, var18 + var3);
            var10001 = 0;
         }
      }
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 21953;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("vef", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
         d[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("vef" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
