import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class dy5 {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public void y72(opt var1) {
      long var2 = a ^ 8491422451922L;
      var1.q01(
         new erg(ox_.cug),
         new Object[]{
            a<"l">(19134, 3920171363202739426L ^ var2), a<"l">(13489, 7181763469874418408L ^ var2), a<"l">(22325, 5512116429509996923L ^ var2), '#', ox_.wb7
         }
      );
      var1.q01(new erg(ox_.wpv), new Object[]{a<"l">(30403, 4573899020441981084L ^ var2), '#', ox_.cug, '-', ox_.r11});
      var1.q01(
         new erg(ox_.xoy),
         new Object[]{
            a<"l">(22325, 5512116429509996923L ^ var2),
            a<"l">(24427, 6356014030060960057L ^ var2),
            a<"l">(22325, 5512116429509996923L ^ var2),
            '#',
            ox_.j4y,
            'E',
            xbr.rr5
         }
      );
      var1.q01(
         new erg(ox_.o16),
         new Object[]{
            a<"l">(22325, 5512116429509996923L ^ var2), a<"l">(1493, 4745075010768790430L ^ var2), a<"l">(22325, 5512116429509996923L ^ var2), '#', ox_.a3_
         }
      );
      var1.q01(new erg(ox_.nxz), new Object[]{a<"l">(2171, 2092704830498500156L ^ var2), a<"l">(21437, 1292548699367749115L ^ var2), '#', ox_.wb7});
      var1.q01(
         new erg(ox_.umb),
         new Object[]{a<"l">(21437, 1292548699367749115L ^ var2), a<"l">(21437, 1292548699367749115L ^ var2), '#', new erg(ox_.vd0, 1, pmc$s6y.r2y.shc())}
      );
      var1.q01(
         new erg(ox_.t2v),
         new Object[]{a<"l">(21437, 1292548699367749115L ^ var2), a<"l">(21437, 1292548699367749115L ^ var2), '#', new erg(ox_.vd0, 1, pmc$s6y.tms.shc())}
      );
      var1.q01(
         new erg(ox_.umb, 4, cp8$vxz.i7j.a1g()),
         new Object[]{a<"l">(21437, 1292548699367749115L ^ var2), a<"l">(21437, 1292548699367749115L ^ var2), '#', new erg(ox_.umb, 1, cp8$vxz.bpt.a1g())}
      );
      var1.q01(
         new erg(ox_.t2v, 4, f35$vyc.lwa.zks()),
         new Object[]{a<"l">(21437, 1292548699367749115L ^ var2), a<"l">(21437, 1292548699367749115L ^ var2), '#', new erg(ox_.t2v, 1, f35$vyc.q6a.zks())}
      );
      var1.q01(new erg(ox_.umb, 1, cp8$vxz.jxy.a1g()), new Object[]{"#", "#", '#', new erg(ox_.bj8, 1, hvn$dyo.oy2.run())});
      var1.q01(new erg(ox_.t2v, 1, f35$vyc.flm.zks()), new Object[]{"#", "#", '#', new erg(ox_.ip2, 1, b7b$op3.sm3.tn1())});
      var1.q01(new erg(ox_.l7f, 1, ywl$iai.r24.ofo()), new Object[]{"#", "#", '#', new erg(ox_.bj8, 1, hvn$dyo.u0j.run())});
      var1.q01(new erg(ox_.l7f, 2, ywl$iai.vo4.ofo()), new Object[]{"#", "#", '#', new erg(ox_.l7f, 1, ywl$iai.o86.ofo())});
      var1.q01(
         new erg(ox_.ow_, 4),
         new Object[]{a<"l">(21437, 1292548699367749115L ^ var2), a<"l">(21437, 1292548699367749115L ^ var2), '#', new erg(ox_.pu8, 1, jcc$whg.aow.rim())}
      );
      var1.q01(new erg(ox_.ow_, 1, kuo.s3w), new Object[]{"#", "#", '#', new erg(ox_.bj8, 1, hvn$dyo.ooj.run())});
      var1.liy(new erg(ox_.ow_, 1, kuo.mp9), new Object[]{ox_.ow_, ox_.s25});
      var1.liy(new erg(ox_.jwk, 1), new Object[]{ox_.a3_, ox_.s25});
      var1.q01(new erg(ox_.ytr, 16), new Object[]{a<"l">(22325, 5512116429509996923L ^ var2), a<"l">(22325, 5512116429509996923L ^ var2), '#', xbr.icz});
      var1.q01(new erg(ox_.g6c, 16), new Object[]{a<"l">(22325, 5512116429509996923L ^ var2), a<"l">(22325, 5512116429509996923L ^ var2), '#', ox_.fzi});
      var1.q01(
         new erg(ox_.il5, 1),
         new Object[]{
            a<"l">(12494, 7700496722201073311L ^ var2),
            a<"l">(32150, 1906790225111456726L ^ var2),
            a<"l">(2668, 6667124390751169588L ^ var2),
            'R',
            xbr.deg,
            'G',
            ox_.t7q
         }
      );
      var1.q01(
         new erg(ox_.ayi, 1),
         new Object[]{
            a<"l">(29990, 6525716170809512821L ^ var2),
            a<"l">(19633, 3023793513889016573L ^ var2),
            a<"l">(17818, 2678172538359292895L ^ var2),
            'G',
            ox_.fzi,
            'S',
            xbr.ctl,
            'O',
            ox_.j4y
         }
      );
      var1.q01(new erg(ox_.cbk, 1), new Object[]{a<"l">(21671, 6191864969950999267L ^ var2), a<"l">(29018, 8678323206493345554L ^ var2), 'N', xbr.n9n});
      var1.q01(
         new erg(ox_.pu8, 2, jcc$whg.hwh.rim()),
         new Object[]{a<"l">(13867, 606543552889933936L ^ var2), a<"l">(2759, 2756736613955890330L ^ var2), 'C', ox_.a3_, 'Q', xbr.n2h}
      );
      var1.liy(new erg(ox_.pu8, 1, jcc$whg.zlt.rim()), new Object[]{new erg(ox_.pu8, 1, jcc$whg.hwh.rim()), xbr.n2h});
      var1.liy(new erg(ox_.pu8, 2, jcc$whg._ft.rim()), new Object[]{new erg(ox_.pu8, 1, jcc$whg.hwh.rim()), ox_.a3_});
      var1.q01(
         new erg(ox_.kqk, 4, bx0$b_z.ryg.d74()),
         new Object[]{
            a<"l">(14438, 8209332100239580716L ^ var2), a<"l">(5042, 2002783901065049585L ^ var2), 'D', new erg(ox_.kqk, 1, bx0$b_z.rg3.d74()), 'G', ox_.bqn
         }
      );
      var1.q01(
         new erg(ox_.pu8, 4, jcc$whg.gch.rim()),
         new Object[]{a<"l">(30505, 2284394342462198131L ^ var2), a<"l">(11160, 5104255521880362455L ^ var2), 'S', new erg(ox_.pu8, 1, jcc$whg.hwh.rim())}
      );
      var1.q01(
         new erg(ox_.pu8, 4, jcc$whg.i59.rim()),
         new Object[]{a<"l">(11160, 5104255521880362455L ^ var2), a<"l">(11160, 5104255521880362455L ^ var2), 'S', new erg(ox_.pu8, 1, jcc$whg.zlt.rim())}
      );
      var1.q01(
         new erg(ox_.pu8, 4, jcc$whg.y7n.rim()),
         new Object[]{a<"l">(11160, 5104255521880362455L ^ var2), a<"l">(11160, 5104255521880362455L ^ var2), 'S', new erg(ox_.pu8, 1, jcc$whg._ft.rim())}
      );
      var1.q01(new erg(ox_.ye1, 1, hgu.fy6), new Object[]{a<"l">(11160, 5104255521880362455L ^ var2), a<"l">(11160, 5104255521880362455L ^ var2), 'S', xbr.n46});
      var1.q01(
         new erg(ox_.ye1, 1, hgu.mc0),
         new Object[]{
            a<"l">(23363, 7248339164913286410L ^ var2), a<"l">(27419, 4691796851469585753L ^ var2), a<"l">(27419, 4691796851469585753L ^ var2), 'S', xbr.n46
         }
      );
      var1.q01(
         new erg(ox_.ye1, 1, hgu.rpc),
         new Object[]{
            a<"l">(27419, 4691796851469585753L ^ var2),
            a<"l">(30549, 6722896787441750292L ^ var2),
            a<"l">(27419, 4691796851469585753L ^ var2),
            'S',
            xbr.n46,
            'I',
            new erg(xbr.nnn, 1, qvg.qn4.b9d())
         }
      );
      var1.q01(
         new erg(ox_.zq7, 1, 0),
         new Object[]{
            a<"l">(22261, 761898971676192933L ^ var2),
            a<"l">(30706, 7613804217067475391L ^ var2),
            a<"l">(17720, 2414350173789397862L ^ var2),
            'S',
            xbr.n46,
            'C',
            xbr.fi0
         }
      );
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2327856896411122078L, -9077786379713766982L, MethodHandles.lookup().lookupClass()).a(202718018005776L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 21044251477291L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[28];
      int var7 = 0;
      String var6 = "ÚÇ¡qkî\u00adÙ¿ÛÎØ\bòêÐ\u0010AK[Ûâg}qIZ\u009bosý\u009cú\u0010\u001eý\u008eî\u0085Ù]ì®Ï\u0018#\u0088=Åò\u0010þ*O\u0084«íµÛçãuK\u001a¤s\u001b\u0010X\u0013Çü<º\u009c|,\u0004Y\u00adF\u001a`\u0097\u0010\u009a>_Ö\u009aóØ\u009bR\u009eÕTÙÍÁ\u0094\u0010vü\u009f\u0084\"á?PR\u008dò.£à\u009c\u0098\u0010Ù¡\u0003jÒOöèÌÓ¿\u008fçê:\u0005\u0010¨(\u0096íf\u0092ëàg¦Q&âO\u0003F\u0010^\u0000±£)M(ØSl\u008eA3a\u0088\u009e\u0010y×Õ$¥Âd{W1Ð\u0014\u0099Ro\u0005\u0010´\bõ\u0014â\u009e=^qâåäLL\u0007¡\u0010\u0006ÝD²ó¡ºÃdý7¹E\u0017Ha\u0018{0ðiúÖÄ9%E©½Ìì]MsP½¦\u0019³¶ø\u0010\u001a\u0084Ã$ë\u0007ÙäñMjÕBÈÌ}\u0010£\u0007mÂE\u001f©±òD<È~\u009a(\u0006\u0010\u0014s.¸\u001e\u0003\u0091zÜBÒ®öl©\u0006\u0010/oJùf:7\u0090¯o\u0006\u0098\u0007\u0018Ìõ\u0010ÍÈ\u007f¾\u009d\u0097e\f©!¼9¹s\u0098'\u0010H\u0013Þ\u0092q\u0019Øm°gcüÐ+[\"\u0010\u0091á¥ê\u0000\u0004¿è\u0093\u0098\u009b(¸B\u009cL\u0010\u0006öö\u008f\u00831²5\u000ea\u0086\u007f\u0094\u0000_Ñ\u0010\u0010a\u0014Ï ±ßRÕ-\u0001¦\u0004\u0001\u007f-\u0010U¹eý-ó\\U\u009d:ù\u0090\u00008&K\u0010së\u0012;äAØÛ\u00931oQö\búi\u0010xÄú¶m\u0006¦½ïê$\u0084áâÞT";
      int var8 = "ÚÇ¡qkî\u00adÙ¿ÛÎØ\bòêÐ\u0010AK[Ûâg}qIZ\u009bosý\u009cú\u0010\u001eý\u008eî\u0085Ù]ì®Ï\u0018#\u0088=Åò\u0010þ*O\u0084«íµÛçãuK\u001a¤s\u001b\u0010X\u0013Çü<º\u009c|,\u0004Y\u00adF\u001a`\u0097\u0010\u009a>_Ö\u009aóØ\u009bR\u009eÕTÙÍÁ\u0094\u0010vü\u009f\u0084\"á?PR\u008dò.£à\u009c\u0098\u0010Ù¡\u0003jÒOöèÌÓ¿\u008fçê:\u0005\u0010¨(\u0096íf\u0092ëàg¦Q&âO\u0003F\u0010^\u0000±£)M(ØSl\u008eA3a\u0088\u009e\u0010y×Õ$¥Âd{W1Ð\u0014\u0099Ro\u0005\u0010´\bõ\u0014â\u009e=^qâåäLL\u0007¡\u0010\u0006ÝD²ó¡ºÃdý7¹E\u0017Ha\u0018{0ðiúÖÄ9%E©½Ìì]MsP½¦\u0019³¶ø\u0010\u001a\u0084Ã$ë\u0007ÙäñMjÕBÈÌ}\u0010£\u0007mÂE\u001f©±òD<È~\u009a(\u0006\u0010\u0014s.¸\u001e\u0003\u0091zÜBÒ®öl©\u0006\u0010/oJùf:7\u0090¯o\u0006\u0098\u0007\u0018Ìõ\u0010ÍÈ\u007f¾\u009d\u0097e\f©!¼9¹s\u0098'\u0010H\u0013Þ\u0092q\u0019Øm°gcüÐ+[\"\u0010\u0091á¥ê\u0000\u0004¿è\u0093\u0098\u009b(¸B\u009cL\u0010\u0006öö\u008f\u00831²5\u000ea\u0086\u007f\u0094\u0000_Ñ\u0010\u0010a\u0014Ï ±ßRÕ-\u0001¦\u0004\u0001\u007f-\u0010U¹eý-ó\\U\u009d:ù\u0090\u00008&K\u0010së\u0012;äAØÛ\u00931oQö\búi\u0010xÄú¶m\u0006¦½ïê$\u0084áâÞT"
         .length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     b = var9;
                     c = new String[28];
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var20;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "¦ïW\u007fFJ¥áÝ\u00948ÊvÒÜñ\u0010\u0004\u0003\u0088\u000eÆrÑ°ßf\u0004q\u0095 o\u009e";
                  var8 = "¦ïW\u007fFJ¥áÝ\u00948ÊvÒÜñ\u0010\u0004\u0003\u0088\u000eÆrÑ°ßf\u0004q\u0095 o\u009e".length();
                  var5 = 16;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6507;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("dy5", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
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
         throw new RuntimeException("dy5" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
