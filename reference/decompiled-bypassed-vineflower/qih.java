import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.input.Keyboard;

public class qih extends gbe {
   public static String[] lyu;
   public omn rk7;
   public s51 dll;
   public eka y7q;
   public boolean eom;
   public float e9d;
   public float ul7;
   public float wgn;
   public URI zqq;
   public URI b1b;
   public br6 clv;
   public boolean p5q;
   public boolean k83;
   public float jg9;
   public float qha;
   public q6h j50;
   public static boolean rjb;
   public String g05;
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public qih() {
      long var1 = a ^ 20578316868871L;
      super();
      this.eom = false;
      this.e9d = 0.0F;
      this.ul7 = 0.0F;
      this.wgn = 0.0F;
      this.zqq = URI.create(b<"s">(9616, 198123397693039620L ^ var1));
      this.b1b = URI.create(b<"s">(17032, 2793314422961701657L ^ var1));
      this.clv = null;
      this.p5q = true;
      this.k83 = false;
      this.jg9 = 0.0F;
      this.qha = 1.0F;
      this.j50 = new q6h();
      this.g05 = "";
   }

   @Override
   public void initGui() {
      this.j50.u1k();
      this.y7q = new eka(this.f41);
      this.rk7 = new omn(0, zwr.tfb, 0, 0, 100, 20);
      this.dll = new s51(0, zwr.tfb, 0, 0, 100, 20);
      Keyboard.enableRepeatEvents(true);
      super.initGui();
   }

   @Override
   public void drawScreen(int var1, int var2, float var3) {
      c05.vz1().z2i(new q08());
   }

   @Override
   public void dig(char param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: iload 1
      // 05: bipush 9
      // 07: iload 3
      // 08: ifne a4
      // 0b: if_icmpne 96
      // 0e: goto 15
      // 11: invokestatic qih.a (Loov;)Loov;
      // 14: athrow
      // 15: aload 0
      // 16: getfield qih.rk7 Lomn;
      // 19: iload 3
      // 1a: ifne 6b
      // 1d: goto 24
      // 20: invokestatic qih.a (Loov;)Loov;
      // 23: athrow
      // 24: invokevirtual omn.y_5 ()Z
      // 27: ifne 60
      // 2a: goto 31
      // 2d: invokestatic qih.a (Loov;)Loov;
      // 30: athrow
      // 31: aload 0
      // 32: getfield qih.dll Ls51;
      // 35: iload 3
      // 36: ifne 79
      // 39: goto 40
      // 3c: invokestatic qih.a (Loov;)Loov;
      // 3f: athrow
      // 40: invokevirtual s51.a9i ()Z
      // 43: ifne 60
      // 46: goto 4d
      // 49: invokestatic qih.a (Loov;)Loov;
      // 4c: athrow
      // 4d: aload 0
      // 4e: getfield qih.rk7 Lomn;
      // 51: bipush 1
      // 52: invokevirtual omn.kd0 (Z)V
      // 55: iload 3
      // 56: ifeq 96
      // 59: goto 60
      // 5c: invokestatic qih.a (Loov;)Loov;
      // 5f: athrow
      // 60: aload 0
      // 61: getfield qih.rk7 Lomn;
      // 64: goto 6b
      // 67: invokestatic qih.a (Loov;)Loov;
      // 6a: athrow
      // 6b: aload 0
      // 6c: getfield qih.dll Ls51;
      // 6f: invokevirtual s51.a9i ()Z
      // 72: invokevirtual omn.kd0 (Z)V
      // 75: aload 0
      // 76: getfield qih.dll Ls51;
      // 79: aload 0
      // 7a: getfield qih.rk7 Lomn;
      // 7d: invokevirtual omn.y_5 ()Z
      // 80: iload 3
      // 81: ifne 8f
      // 84: ifne 92
      // 87: goto 8e
      // 8a: invokestatic qih.a (Loov;)Loov;
      // 8d: athrow
      // 8e: bipush 1
      // 8f: goto 93
      // 92: bipush 0
      // 93: invokevirtual s51._di (Z)V
      // 96: iload 1
      // 97: iload 3
      // 98: ifne de
      // 9b: bipush 13
      // 9d: goto a4
      // a0: invokestatic qih.a (Loov;)Loov;
      // a3: athrow
      // a4: if_icmpne cb
      // a7: aload 0
      // a8: getfield qih.eom Z
      // ab: iload 3
      // ac: ifne de
      // af: goto b6
      // b2: invokestatic qih.a (Loov;)Loov;
      // b5: athrow
      // b6: ifeq cb
      // b9: goto c0
      // bc: invokestatic qih.a (Loov;)Loov;
      // bf: athrow
      // c0: aload 0
      // c1: invokevirtual qih.mjy ()V
      // c4: goto cb
      // c7: invokestatic qih.a (Loov;)Loov;
      // ca: athrow
      // cb: aload 0
      // cc: getfield qih.rk7 Lomn;
      // cf: iload 1
      // d0: iload 2
      // d1: invokevirtual omn.sed (CI)Z
      // d4: pop
      // d5: aload 0
      // d6: getfield qih.dll Ls51;
      // d9: iload 1
      // da: iload 2
      // db: invokevirtual s51.iu9 (CI)Z
      // de: pop
      // df: aload 0
      // e0: iload 1
      // e1: iload 2
      // e2: invokespecial gbe.dig (CI)V
      // e5: return
   }

   @Override
   public native void mouseClicked(int var1, int var2, int var3);

   public native void mjy();

   public void uz3(float var1, float var2, float var3, float var4, int var5, int var6) {
      float var7 = (float)(var5 >> 24 & 0xFF) / 255.0F;
      float var8 = (float)(var5 >> 16 & 0xFF) / 255.0F;
      float var9 = (float)(var5 >> 8 & 0xFF) / 255.0F;
      float var10 = (float)(var5 & 0xFF) / 255.0F;
      float var11 = (float)(var6 >> 24 & 0xFF) / 255.0F;
      float var12 = (float)(var6 >> 16 & 0xFF) / 255.0F;
      float var13 = (float)(var6 >> 8 & 0xFF) / 255.0F;
      float var14 = (float)(var6 & 0xFF) / 255.0F;
      hzu.m_1();
      hzu.spd();
      hzu.vtj();
      hzu.u39(770, 771, 1, 0);
      hzu.nn9(7425);
      jom var15 = jom.yut();
      q3g var16 = var15.zuq();
      var16.ezr(7, gnl.gec);
      var16.g5o((double)var3, (double)var2, (double)this.o3s).gs4(var12, var13, var14, var11).pzw();
      var16.g5o((double)var1, (double)var2, (double)this.o3s).gs4(var8, var9, var10, var7).pzw();
      var16.g5o((double)var1, (double)var4, (double)this.o3s).gs4(var8, var9, var10, var7).pzw();
      var16.g5o((double)var3, (double)var4, (double)this.o3s).gs4(var12, var13, var14, var11).pzw();
      var15.q7g();
      hzu.nn9(7424);
      hzu.ux6();
      hzu.if9();
      hzu.rqj();
   }

   @Override
   public void w1m(int var1, int var2, int var3) {
      super.w1m(var1, var2, var3);
   }

   @Override
   public void onGuiClosed() {
      Keyboard.enableRepeatEvents(false);
   }

   @Override
   public void updateScreen() {
      this.y7q = new eka(this.f41);
      this.rk7.xxu();
      this.dll.t6g();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3152370189870065894L, -2729818275787456666L, MethodHandles.lookup().lookupClass()).a(15688571336539L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 107553108565984L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[19];
      int var7 = 0;
      String var6 = "Ë\u00920ÆkÁÏC\u000fúÏ^\u008c\u0017K\u0013sG\u009aµ[ùoC\u0080¤·\u009e\u0001Ü%!\u00007fÞ\u009e\u000f\u0083²RÓ¡NzêÄ\u0001¥B\u0084x\u0000\u0001\u0082\u009eÜ½è\u00017B\u000b\u0085\u0010\u0089\"FGÇr×:sâ´pÍÎ:Á8OÏ,Üd\u001d¨\u0011\u009aÛF\u008e\u0091\u001dö\u0016Sx\u0096VQ«¾L\u0082;I¾\u0014r\u008bõ}LH\u0098\u001e*¸iQ®\u009dèïoÒ\u0089W:\u0000Uj/ì1\u0010e,a\u0093\u00ady\u00194\u001eOÛFÀ\u0004\u0084¶(\u0088nÖÓ´:\u0010\u000f£wXÌ\u0012¡Çê!\u0086Qdìµ\u0016Z´|vt\u0004\u00061\u008cí\u009f\u0099Áb=\u000f¿@\u0017R÷\u0087\u0018ì\u008aíÍ\u00ad/~yeZ\u0098í\u0087mÁ\u0086Ç\r\u009e\u007fiß°Éÿ/o_\u0092¥½\u001f±\u001b'$@\u0007ä%W\u001a%µ\u0000\u0013\u0085G\u0094àÞ\u0012²\u00adÎ`\u0099\u0095\" #\u0092Öp)J9Ú\tÆ¢$°H¦,;D\u009cä³\u0017«Ä#\u0093Âw\u009aÔý´\u0010=ñ\u000e\u0097â\u0097\u0013\u007fÿ8÷\u000f£\u0010ü\u00988RUJ§»\u008aþÒ!+\u008cò´\u007fUn8¿Þ\u001f\u0092ß\u009d\u0090f@NV\u0006'\u0003:\u008am\u0001\u0093ZQÞð¬Ð.^\u008d\u0086×'u¢*\u007fïäCn\u0018\u0001û²ð H\\ÜÛ?\tññàêiÇ\u009e½-N\u0085\u0012ä +ýÙNxMZi\u0019Ñv`\u0096\u0004ÙíîðK3\u0007«kÛòiðËÈ:\u009c8\u00186Å\u00153Ó\u0015ø}:ÊëÜ\u0005ô\u008fA\u0014m_í\u0083µ\u0006\u001a }Å}Æ\u0016\u009a¿±zÆÆM¦\n(\u0084\u0085ÂË\u008aBÙ1@îø\u009d\u001c\b35_\u0018\u0096\u0080\u0097z\t)í¯édÀAô\u0097÷óÅví8!\u0012Èï(\u0012£ÅÀôãi!Î\u009f¨\u0019Ðî\u0086÷ÔäÍ²6²\u0098¹§\"FúÇ\u0087¸m£^°,¼à\u0003\u009a(6¼»:÷3ó¨Vâái³æ²>PÇÚ\u008a\u001bJ\nq)\u0092x²n2\u0014Ö!£jA¿@\u0098ë ×(\u0097«\u0015\u008cZ§|wJß\":Ë\u0096Ö\u0089ãÀ\u0097ÑsÈ+\u009b\nq\u009d¿\u00020";
      int var8 = "Ë\u00920ÆkÁÏC\u000fúÏ^\u008c\u0017K\u0013sG\u009aµ[ùoC\u0080¤·\u009e\u0001Ü%!\u00007fÞ\u009e\u000f\u0083²RÓ¡NzêÄ\u0001¥B\u0084x\u0000\u0001\u0082\u009eÜ½è\u00017B\u000b\u0085\u0010\u0089\"FGÇr×:sâ´pÍÎ:Á8OÏ,Üd\u001d¨\u0011\u009aÛF\u008e\u0091\u001dö\u0016Sx\u0096VQ«¾L\u0082;I¾\u0014r\u008bõ}LH\u0098\u001e*¸iQ®\u009dèïoÒ\u0089W:\u0000Uj/ì1\u0010e,a\u0093\u00ady\u00194\u001eOÛFÀ\u0004\u0084¶(\u0088nÖÓ´:\u0010\u000f£wXÌ\u0012¡Çê!\u0086Qdìµ\u0016Z´|vt\u0004\u00061\u008cí\u009f\u0099Áb=\u000f¿@\u0017R÷\u0087\u0018ì\u008aíÍ\u00ad/~yeZ\u0098í\u0087mÁ\u0086Ç\r\u009e\u007fiß°Éÿ/o_\u0092¥½\u001f±\u001b'$@\u0007ä%W\u001a%µ\u0000\u0013\u0085G\u0094àÞ\u0012²\u00adÎ`\u0099\u0095\" #\u0092Öp)J9Ú\tÆ¢$°H¦,;D\u009cä³\u0017«Ä#\u0093Âw\u009aÔý´\u0010=ñ\u000e\u0097â\u0097\u0013\u007fÿ8÷\u000f£\u0010ü\u00988RUJ§»\u008aþÒ!+\u008cò´\u007fUn8¿Þ\u001f\u0092ß\u009d\u0090f@NV\u0006'\u0003:\u008am\u0001\u0093ZQÞð¬Ð.^\u008d\u0086×'u¢*\u007fïäCn\u0018\u0001û²ð H\\ÜÛ?\tññàêiÇ\u009e½-N\u0085\u0012ä +ýÙNxMZi\u0019Ñv`\u0096\u0004ÙíîðK3\u0007«kÛòiðËÈ:\u009c8\u00186Å\u00153Ó\u0015ø}:ÊëÜ\u0005ô\u008fA\u0014m_í\u0083µ\u0006\u001a }Å}Æ\u0016\u009a¿±zÆÆM¦\n(\u0084\u0085ÂË\u008aBÙ1@îø\u009d\u001c\b35_\u0018\u0096\u0080\u0097z\t)í¯édÀAô\u0097÷óÅví8!\u0012Èï(\u0012£ÅÀôãi!Î\u009f¨\u0019Ðî\u0086÷ÔäÍ²6²\u0098¹§\"FúÇ\u0087¸m£^°,¼à\u0003\u009a(6¼»:÷3ó¨Vâái³æ²>PÇÚ\u008a\u001bJ\nq)\u0092x²n2\u0014Ö!£jA¿@\u0098ë ×(\u0097«\u0015\u008cZ§|wJß\":Ë\u0096Ö\u0089ãÀ\u0097ÑsÈ+\u009b\nq\u009d¿\u00020"
         .length();
      char var5 = '@';
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
                     g = new String[19];
                     v6ma.Ex(9);
                     lyu = null;
                     rjb = false;
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

                  var6 = "`ÏG¢ÛRS\u008aom±¶\u0090\u0014{\u0090TNr\"$¨\u0088A\u0018\u0007£Û¬\fÀ®.ZÉïð \u00ad\u001a|±\u0092?\u009d\u0097ýZ\u009e";
                  var8 = "`ÏG¢ÛRS\u008aom±¶\u0090\u0014{\u0090TNr\"$¨\u0088A\u0018\u0007£Û¬\fÀ®.ZÉïð \u00ad\u001a|±\u0092?\u009d\u0097ýZ\u009e".length();
                  var5 = 24;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9154;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("qih", var10);
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
         g[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("qih" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
