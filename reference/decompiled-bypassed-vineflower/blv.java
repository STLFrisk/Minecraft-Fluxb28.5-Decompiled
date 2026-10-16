import java.io.BufferedInputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.lwjgl.BufferUtils;

public class blv {
   private final blv$mau zc3;
   private final String a4g;
   private int dec;
   private int j9k = 0;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   private blv(blv$mau var1, int var2, String var3) {
      this.zc3 = var1;
      this.dec = var2;
      this.a4g = var3;
   }

   public void n8m(jn3 var1) {
      this.j9k++;
      gis.kmn(var1.x_a(), this.dec);
   }

   public void btz(jn3 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: dup
      // 06: getfield blv.j9k I
      // 09: bipush 1
      // 0a: isub
      // 0b: putfield blv.j9k I
      // 0e: aload 0
      // 0f: getfield blv.j9k I
      // 12: iload 2
      // 13: ifeq 2b
      // 16: ifgt 3f
      // 19: goto 20
      // 1c: invokestatic blv.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 0
      // 21: getfield blv.dec I
      // 24: goto 2b
      // 27: invokestatic blv.a (Loov;)Loov;
      // 2a: athrow
      // 2b: invokestatic gis.rzx (I)V
      // 2e: aload 0
      // 2f: getfield blv.zc3 Lblv$mau;
      // 32: invokevirtual blv$mau.hup ()Ljava/util/Map;
      // 35: aload 0
      // 36: getfield blv.a4g Ljava/lang/String;
      // 39: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 3e: pop
      // 3f: return
   }

   public String ik9() {
      return this.a4g;
   }

   public static blv zmy(y99 var0, blv$mau var1, String var2) {
      long var3 = a ^ 11307595736319L;
      int var5 = t9d.b();
      blv var6 = (blv)var1.hup().get(var2);

      gdz var7;
      int var11;
      label48: {
         try {
            if (var5 == 0) {
               return var6;
            }

            if (var6 != null) {
               return var6;
            }
         } catch (oov var15) {
            throw a(var15);
         }

         var7 = new gdz(a<"x">(6551, 8168853455693978005L ^ var3) + var2 + var1.f8h());
         BufferedInputStream var8 = new BufferedInputStream(var0.td5(var7).f_4());
         byte[] var9 = opl(var8);
         ByteBuffer var10 = BufferUtils.createByteBuffer(var9.length);
         var10.put(var9);
         ((Buffer)var10).position(0);
         var11 = gis.qor(var1.bl8());

         label31: {
            try {
               gis.yg7(var11, var10);
               gis.u58(var11);
               if (var5 == 0) {
                  break label31;
               }

               if (gis.dc1(var11, gis.y93) == 0) {
                  break label48;
               }
            } catch (oov var14) {
               throw a(var14);
            }

            var6 = new blv(var1, var11, var2);
         }

         var1.hup().put(var2, var6);
         return var6;
      }

      String var12 = StringUtils.trim(gis.h0d(var11, 32768));
      kcc var13 = new kcc(a<"x">(12235, 8448876901444333514L ^ var3) + var1.zvr() + a<"x">(15551, 5661220390752500924L ^ var3) + var12);
      var13.oic(var7.xyp());
      throw var13;
   }

   public static byte[] opl(BufferedInputStream var0) {
      byte[] var1;
      try {
         var1 = IOUtils.toByteArray(var0);
      } finally {
         var0.close();
      }

      return var1;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(3444589458882945349L, 7521198647535844710L, MethodHandles.lookup().lookupClass()).a(145489593967403L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 51241748997512L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[3];
      int var7 = 0;
      String var6 = "®è¼òèÃh\u009cºø'=ýÐ\r\u001f·äG\rE\u0016\u0016ø(>\u0007\u0083É\u0091g(Ýç7Ó\u0094ï°¡\u0002*Q\u0012ªýOEºg\u0018ù\u0014L]RLÈM½\u0011E¢\u0095\b(\u0007o¸\u0091Åu8\u0080\u0002\u008ap\u0002ã]B-\u0095Æy\u0007öX\u0004TÆ%b´\u009fðZa¨\u0098µ+Ú\u001a}\u000e";
      int var8 = "®è¼òèÃh\u009cºø'=ýÐ\r\u001f·äG\rE\u0016\u0016ø(>\u0007\u0083É\u0091g(Ýç7Ó\u0094ï°¡\u0002*Q\u0012ªýOEºg\u0018ù\u0014L]RLÈM½\u0011E¢\u0095\b(\u0007o¸\u0091Åu8\u0080\u0002\u008ap\u0002ã]B-\u0095Æy\u0007öX\u0004TÆ%b´\u009fðZa¨\u0098µ+Ú\u001a}\u000e"
         .length();
      char var5 = 24;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[3];
            return;
         }

         var5 = var6.charAt(var4);
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 14982;
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
            throw new RuntimeException("blv", var10);
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
         throw new RuntimeException("blv" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
