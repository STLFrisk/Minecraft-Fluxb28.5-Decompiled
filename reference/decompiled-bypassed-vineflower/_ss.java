import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _ss {
   public final String yr5;
   private final ekw z83;
   public boolean qy7;
   private final bx6 _9v;
   private final z0w o3u;
   private Class il3;
   private static NumberFormat vyn;
   public static bx6 zrz;
   private static DecimalFormat ed5;
   public static bx6 ttm;
   public static bx6 d2j;
   public static bx6 eal;
   private static final long a;
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public _ss(String var1, ekw var2, bx6 var3) {
      this.yr5 = var1;
      this.z83 = var2;
      this._9v = var3;
      this.o3u = new e6p(this);
      z0w.wwc.put(this.o3u.ofv(), this.o3u);
   }

   public _ss(String var1, ekw var2) {
      this(var1, var2, zrz);
   }

   public _ss rem() {
      this.qy7 = true;
      return this;
   }

   public _ss ft0() {
      long var1 = a ^ 52395567898071L;

      try {
         if (l9p.zmx.containsKey(this.yr5)) {
            throw new RuntimeException(
               a<"v">(17379, 4168431639729233772L ^ var1)
                  + ((_ss)l9p.zmx.get(this.yr5)).z83
                  + a<"v">(13172, 8933410810674524156L ^ var1)
                  + this.z83
                  + a<"v">(26891, 709797184057144709L ^ var1)
                  + this.yr5
            );
         }
      } catch (RuntimeException var3) {
         throw a(var3);
      }

      l9p._cg.add(this);
      l9p.zmx.put(this.yr5, this);
      return this;
   }

   public boolean koi() {
      return false;
   }

   public String rbf(int var1) {
      return this._9v.dg6(var1);
   }

   public ekw xn7() {
      ekw var1 = this.z83.qy8();
      var1.f4q().vyb(syo.qiz);
      var1.f4q().zn_(new xq3(xq3$e6b.igw, new tao(this.yr5)));
      return var1;
   }

   public ekw zv4() {
      ekw var1 = this.xn7();
      ekw var2 = new tao("[").vha(var1).lt8("]");
      var2.di5(var1.f4q());
      return var2;
   }

   @Override
   public boolean equals(Object param1) {
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
      // 05: iload 2
      // 06: ifeq 1b
      // 09: aload 1
      // 0a: if_acmpne 1a
      // 0d: goto 14
      // 10: invokestatic _ss.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 13: athrow
      // 14: bipush 1
      // 15: ireturn
      // 16: invokestatic _ss.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 19: athrow
      // 1a: aload 1
      // 1b: ifnull 53
      // 1e: aload 0
      // 1f: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 22: iload 2
      // 23: ifeq 43
      // 26: goto 2d
      // 29: invokestatic _ss.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2c: athrow
      // 2d: aload 1
      // 2e: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 31: if_acmpne 53
      // 34: goto 3b
      // 37: invokestatic _ss.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3a: athrow
      // 3b: aload 1
      // 3c: goto 43
      // 3f: invokestatic _ss.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 42: athrow
      // 43: checkcast _ss
      // 46: astore 3
      // 47: aload 0
      // 48: getfield _ss.yr5 Ljava/lang/String;
      // 4b: aload 3
      // 4c: getfield _ss.yr5 Ljava/lang/String;
      // 4f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 52: ireturn
      // 53: bipush 0
      // 54: ireturn
   }

   @Override
   public int hashCode() {
      return this.yr5.hashCode();
   }

   @Override
   public String toString() {
      long var1 = a ^ 65383692837831L;
      return a<"v">(21282, 5019995409906676155L ^ var1)
         + this.yr5
         + a<"v">(4273, 3730142252699382315L ^ var1)
         + this.z83
         + a<"v">(21052, 4435290424898334894L ^ var1)
         + this.qy7
         + a<"v">(6898, 5002861398676895855L ^ var1)
         + this._9v
         + a<"v">(28339, 2487162158119357480L ^ var1)
         + this.o3u
         + '}';
   }

   public z0w ihd() {
      return this.o3u;
   }

   public Class yjl() {
      return this.il3;
   }

   public _ss en2(Class var1) {
      this.il3 = var1;
      return this;
   }

   public static NumberFormat q0x() {
      return vyn;
   }

   public static DecimalFormat esp() {
      return ed5;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1532220871050805750L, 4750396815362362539L, MethodHandles.lookup().lookupClass()).a(97005239504097L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 97637996146411L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[9];
      int var5 = 0;
      String var4 = "»{ïÚQÙZR\u0000C\u000274Òb\u0093\u000fÏ\b\u009fÕ`\u0010\u0099Éw=\u0007~°· (Uìz\u0098û\u0085ý\u0091yLe$¼_1ÇsµB>áõ\u0091;¦\u0088w\u008a·'m±\u009f{IYré4y\u0010;\u008fMO&}\u008c\u0005/Ø\u001bLPL²¶ °\u0093\u0099\u0090XK`\u0010\u001f\u0084A×\u009e&\u009b\u009doæ<h´ÄÜ\u0001\u009f¦\u009còÕ5\u0013Ë r\u001e\u009f]&,µ±Öì\u00ad4\u0000ð¥ã»(å8\n\u008c\u0014j©É~Ë\u008bùô\u0014 ÅvH&÷ Ó\u0002I\u0085\u00adéÕ\u0095ä\u008a9\u001e¢\u000f\u0085RÕ,§y²q\\u3¼\u0018C9?·|DË\u0015¥åu´sÞRèô\u0099\u0000¨)ò\u0006\u009c";
      int var6 = "»{ïÚQÙZR\u0000C\u000274Òb\u0093\u000fÏ\b\u009fÕ`\u0010\u0099Éw=\u0007~°· (Uìz\u0098û\u0085ý\u0091yLe$¼_1ÇsµB>áõ\u0091;¦\u0088w\u008a·'m±\u009f{IYré4y\u0010;\u008fMO&}\u008c\u0005/Ø\u001bLPL²¶ °\u0093\u0099\u0090XK`\u0010\u001f\u0084A×\u009e&\u009b\u009doæ<h´ÄÜ\u0001\u009f¦\u009còÕ5\u0013Ë r\u001e\u009f]&,µ±Öì\u00ad4\u0000ð¥ã»(å8\n\u008c\u0014j©É~Ë\u008bùô\u0014 ÅvH&÷ Ó\u0002I\u0085\u00adéÕ\u0095ä\u008a9\u001e¢\u000f\u0085RÕ,§y²q\\u3¼\u0018C9?·|DË\u0015¥åu´sÞRèô\u0099\u0000¨)ò\u0006\u009c"
         .length();
      char var3 = ' ';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     c = var7;
                     d = new String[9];
                     vyn = NumberFormat.getIntegerInstance(Locale.US);
                     zrz = new _ss$1();
                     ed5 = new DecimalFormat(a<"v">(10963, 5489143959223158115L ^ var9));
                     ttm = new _ss$2();
                     d2j = new _ss$3();
                     eal = new _ss$4();
                     return;
                  }

                  var3 = var4.charAt(var12);
                  break;
               default:
                  var7[var5++] = var20;
                  if ((var12 += var3) < var6) {
                     var3 = var4.charAt(var12);
                     continue label27;
                  }

                  var4 = "åß\u001f\u000bÝÕÄYÓ\u0084Ç\u001e\u00adhy^Z³\u0095Ó\u0080\u0001\u0088\u008c÷µ\u008dP\bS©\u000b(®\u0099yb\u0019G\u0017Ý )ÿ^9\u0087\u0000~A\r\u009a¤8c\u0081ÒS¥_\u0016\u008885\u0089?\u008d\u0017Æ\u0093%òÕ";
                  var6 = "åß\u001f\u000bÝÕÄYÓ\u0084Ç\u001e\u00adhy^Z³\u0095Ó\u0080\u0001\u0088\u008c÷µ\u008dP\bS©\u000b(®\u0099yb\u0019G\u0017Ý )ÿ^9\u0087\u0000~A\r\u009a¤8c\u0081ÒS¥_\u0016\u008885\u0089?\u008d\u0017Æ\u0093%òÕ"
                     .length();
                  var3 = ' ';
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
      }
   }

   private static RuntimeException a(RuntimeException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 29653;
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
            throw new RuntimeException("_ss", var10);
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
         throw new RuntimeException("_ss" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
