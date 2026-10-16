import com.google.common.base.Objects;
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

public class yve {
   public int gdj;
   public int _3o;
   public int ob0;
   public int kwp;
   public int ixv;
   public int nwc;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public yve() {
   }

   public yve(int[] var1) {
      int var2 = OpaquePredicate.c();
      super();
      if (var2 == 0) {
         try {
            if (var1.length != 6) {
               return;
            }

            this.gdj = var1[0];
            this._3o = var1[1];
            this.ob0 = var1[2];
            this.kwp = var1[3];
            this.ixv = var1[4];
         } catch (oov var3) {
            throw a(var3);
         }
      }

      this.nwc = var1[5];
   }

   public static yve e31() {
      return new yve(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
   }

   public static yve sgq(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, vt2 var9) {
      try {
         switch (yve$1._d8[var9.ordinal()]) {
            case 1:
               return new yve(var0 + var3, var1 + var4, var2 - var8 + 1 + var5, var0 + var6 - 1 + var3, var1 + var7 - 1 + var4, var2 + var5);
            case 2:
               return new yve(var0 + var3, var1 + var4, var2 + var5, var0 + var6 - 1 + var3, var1 + var7 - 1 + var4, var2 + var8 - 1 + var5);
            case 3:
               return new yve(var0 - var8 + 1 + var5, var1 + var4, var2 + var3, var0 + var5, var1 + var7 - 1 + var4, var2 + var6 - 1 + var3);
            case 4:
               return new yve(var0 + var5, var1 + var4, var2 + var3, var0 + var8 - 1 + var5, var1 + var7 - 1 + var4, var2 + var6 - 1 + var3);
         }
      } catch (oov var10) {
         throw a(var10);
      }

      return new yve(var0 + var3, var1 + var4, var2 + var5, var0 + var6 - 1 + var3, var1 + var7 - 1 + var4, var2 + var8 - 1 + var5);
   }

   public static yve t9e(int var0, int var1, int var2, int var3, int var4, int var5) {
      return new yve(Math.min(var0, var3), Math.min(var1, var4), Math.min(var2, var5), Math.max(var0, var3), Math.max(var1, var4), Math.max(var2, var5));
   }

   public yve(yve var1) {
      this.gdj = var1.gdj;
      this._3o = var1._3o;
      this.ob0 = var1.ob0;
      this.kwp = var1.kwp;
      this.ixv = var1.ixv;
      this.nwc = var1.nwc;
   }

   public yve(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.gdj = var1;
      this._3o = var2;
      this.ob0 = var3;
      this.kwp = var4;
      this.ixv = var5;
      this.nwc = var6;
   }

   public yve(wgo var1, wgo var2) {
      this.gdj = Math.min(var1.getX(), var2.getX());
      this._3o = Math.min(var1.getY(), var2.getY());
      this.ob0 = Math.min(var1.getZ(), var2.getZ());
      this.kwp = Math.max(var1.getX(), var2.getX());
      this.ixv = Math.max(var1.getY(), var2.getY());
      this.nwc = Math.max(var1.getZ(), var2.getZ());
   }

   public yve(int var1, int var2, int var3, int var4) {
      this.gdj = var1;
      this.ob0 = var2;
      this.kwp = var3;
      this.nwc = var4;
      this._3o = 1;
      this.ixv = 512;
   }

   public boolean fsa(yve param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield yve.kwp I
      // 08: aload 1
      // 09: getfield yve.gdj I
      // 0c: iload 2
      // 0d: ifne 29
      // 10: if_icmplt af
      // 13: goto 1a
      // 16: invokestatic yve.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 0
      // 1b: getfield yve.gdj I
      // 1e: aload 1
      // 1f: getfield yve.kwp I
      // 22: goto 29
      // 25: invokestatic yve.a (Loov;)Loov;
      // 28: athrow
      // 29: iload 2
      // 2a: ifne 46
      // 2d: if_icmpgt af
      // 30: goto 37
      // 33: invokestatic yve.a (Loov;)Loov;
      // 36: athrow
      // 37: aload 0
      // 38: getfield yve.nwc I
      // 3b: aload 1
      // 3c: getfield yve.ob0 I
      // 3f: goto 46
      // 42: invokestatic yve.a (Loov;)Loov;
      // 45: athrow
      // 46: iload 2
      // 47: ifne 63
      // 4a: if_icmplt af
      // 4d: goto 54
      // 50: invokestatic yve.a (Loov;)Loov;
      // 53: athrow
      // 54: aload 0
      // 55: getfield yve.ob0 I
      // 58: aload 1
      // 59: getfield yve.nwc I
      // 5c: goto 63
      // 5f: invokestatic yve.a (Loov;)Loov;
      // 62: athrow
      // 63: iload 2
      // 64: ifne 80
      // 67: if_icmpgt af
      // 6a: goto 71
      // 6d: invokestatic yve.a (Loov;)Loov;
      // 70: athrow
      // 71: aload 0
      // 72: getfield yve.ixv I
      // 75: aload 1
      // 76: getfield yve._3o I
      // 79: goto 80
      // 7c: invokestatic yve.a (Loov;)Loov;
      // 7f: athrow
      // 80: iload 2
      // 81: ifne a8
      // 84: if_icmplt af
      // 87: goto 8e
      // 8a: invokestatic yve.a (Loov;)Loov;
      // 8d: athrow
      // 8e: aload 0
      // 8f: getfield yve._3o I
      // 92: iload 2
      // 93: ifne ac
      // 96: goto 9d
      // 99: invokestatic yve.a (Loov;)Loov;
      // 9c: athrow
      // 9d: aload 1
      // 9e: getfield yve.ixv I
      // a1: goto a8
      // a4: invokestatic yve.a (Loov;)Loov;
      // a7: athrow
      // a8: if_icmpgt af
      // ab: bipush 1
      // ac: goto b0
      // af: bipush 0
      // b0: ireturn
   }

   public boolean _dk(int param1, int param2, int param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 5
      // 05: aload 0
      // 06: getfield yve.kwp I
      // 09: iload 1
      // 0a: iload 5
      // 0c: ifeq 25
      // 0f: if_icmplt 6f
      // 12: goto 19
      // 15: invokestatic yve.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield yve.gdj I
      // 1d: iload 3
      // 1e: goto 25
      // 21: invokestatic yve.a (Loov;)Loov;
      // 24: athrow
      // 25: iload 5
      // 27: ifeq 40
      // 2a: if_icmpgt 6f
      // 2d: goto 34
      // 30: invokestatic yve.a (Loov;)Loov;
      // 33: athrow
      // 34: aload 0
      // 35: getfield yve.nwc I
      // 38: iload 2
      // 39: goto 40
      // 3c: invokestatic yve.a (Loov;)Loov;
      // 3f: athrow
      // 40: iload 5
      // 42: ifeq 68
      // 45: if_icmplt 6f
      // 48: goto 4f
      // 4b: invokestatic yve.a (Loov;)Loov;
      // 4e: athrow
      // 4f: aload 0
      // 50: getfield yve.ob0 I
      // 53: iload 5
      // 55: ifeq 6c
      // 58: goto 5f
      // 5b: invokestatic yve.a (Loov;)Loov;
      // 5e: athrow
      // 5f: iload 4
      // 61: goto 68
      // 64: invokestatic yve.a (Loov;)Loov;
      // 67: athrow
      // 68: if_icmpgt 6f
      // 6b: bipush 1
      // 6c: goto 70
      // 6f: bipush 0
      // 70: ireturn
   }

   public void d6z(yve var1) {
      this.gdj = Math.min(this.gdj, var1.gdj);
      this._3o = Math.min(this._3o, var1._3o);
      this.ob0 = Math.min(this.ob0, var1.ob0);
      this.kwp = Math.max(this.kwp, var1.kwp);
      this.ixv = Math.max(this.ixv, var1.ixv);
      this.nwc = Math.max(this.nwc, var1.nwc);
   }

   public void gbw(int var1, int var2, int var3) {
      this.gdj += var1;
      this._3o += var2;
      this.ob0 += var3;
      this.kwp += var1;
      this.ixv += var2;
      this.nwc += var3;
   }

   public boolean vwy(wgo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: invokevirtual wgo.getX ()I
      // 08: aload 0
      // 09: getfield yve.gdj I
      // 0c: iload 2
      // 0d: ifeq 29
      // 10: if_icmplt af
      // 13: goto 1a
      // 16: invokestatic yve.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 1
      // 1b: invokevirtual wgo.getX ()I
      // 1e: aload 0
      // 1f: getfield yve.kwp I
      // 22: goto 29
      // 25: invokestatic yve.a (Loov;)Loov;
      // 28: athrow
      // 29: iload 2
      // 2a: ifeq 46
      // 2d: if_icmpgt af
      // 30: goto 37
      // 33: invokestatic yve.a (Loov;)Loov;
      // 36: athrow
      // 37: aload 1
      // 38: invokevirtual wgo.getZ ()I
      // 3b: aload 0
      // 3c: getfield yve.ob0 I
      // 3f: goto 46
      // 42: invokestatic yve.a (Loov;)Loov;
      // 45: athrow
      // 46: iload 2
      // 47: ifeq 63
      // 4a: if_icmplt af
      // 4d: goto 54
      // 50: invokestatic yve.a (Loov;)Loov;
      // 53: athrow
      // 54: aload 1
      // 55: invokevirtual wgo.getZ ()I
      // 58: aload 0
      // 59: getfield yve.nwc I
      // 5c: goto 63
      // 5f: invokestatic yve.a (Loov;)Loov;
      // 62: athrow
      // 63: iload 2
      // 64: ifeq 80
      // 67: if_icmpgt af
      // 6a: goto 71
      // 6d: invokestatic yve.a (Loov;)Loov;
      // 70: athrow
      // 71: aload 1
      // 72: invokevirtual wgo.getY ()I
      // 75: aload 0
      // 76: getfield yve._3o I
      // 79: goto 80
      // 7c: invokestatic yve.a (Loov;)Loov;
      // 7f: athrow
      // 80: iload 2
      // 81: ifeq a8
      // 84: if_icmplt af
      // 87: goto 8e
      // 8a: invokestatic yve.a (Loov;)Loov;
      // 8d: athrow
      // 8e: aload 1
      // 8f: invokevirtual wgo.getY ()I
      // 92: iload 2
      // 93: ifeq ac
      // 96: goto 9d
      // 99: invokestatic yve.a (Loov;)Loov;
      // 9c: athrow
      // 9d: aload 0
      // 9e: getfield yve.ixv I
      // a1: goto a8
      // a4: invokestatic yve.a (Loov;)Loov;
      // a7: athrow
      // a8: if_icmpgt af
      // ab: bipush 1
      // ac: goto b0
      // af: bipush 0
      // b0: ireturn
   }

   public wgo mtu() {
      return new wgo(this.kwp - this.gdj, this.ixv - this._3o, this.nwc - this.ob0);
   }

   public int num() {
      return this.kwp - this.gdj + 1;
   }

   public int v8b() {
      return this.ixv - this._3o + 1;
   }

   public int ut6() {
      return this.nwc - this.ob0 + 1;
   }

   public wgo d6k() {
      return new mew(this.gdj + (this.kwp - this.gdj + 1) / 2, this._3o + (this.ixv - this._3o + 1) / 2, this.ob0 + (this.nwc - this.ob0 + 1) / 2);
   }

   @Override
   public String toString() {
      long var1 = a ^ 86261840550460L;
      return Objects.toStringHelper(this)
         .add(a<"p">(1489, 5215920692629550021L ^ var1), this.gdj)
         .add(a<"p">(14470, 5188418787704311441L ^ var1), this._3o)
         .add(a<"p">(8595, 3192339992719529856L ^ var1), this.ob0)
         .add(a<"p">(29398, 8080563293807920323L ^ var1), this.kwp)
         .add(a<"p">(2831, 1528375926344072473L ^ var1), this.ixv)
         .add(a<"p">(5792, 6647676958637793458L ^ var1), this.nwc)
         .toString();
   }

   public mvq ubs() {
      return new mvq(new int[]{this.gdj, this._3o, this.ob0, this.kwp, this.ixv, this.nwc});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-374806018392721688L, -6621133606095467032L, MethodHandles.lookup().lookupClass()).a(101757824204281L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 104640158004208L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[6];
      int var7 = 0;
      String var6 = "¤;\u009d\u000b\u0095\u0006³Â\u009b\u000e[È\u0011øÁ~\u0010E-é1±9\u0010yæbÎH°\u0085,ê\u0010 ë?¥ó+\u0098\u0012½fY¯>Ýr½\u0010Bî+½à×\u0080÷2>\u007fy\u0090¯\u0088\u009a";
      int var8 = "¤;\u009d\u000b\u0095\u0006³Â\u009b\u000e[È\u0011øÁ~\u0010E-é1±9\u0010yæbÎH°\u0085,ê\u0010 ë?¥ó+\u0098\u0012½fY¯>Ýr½\u0010Bî+½à×\u0080÷2>\u007fy\u0090¯\u0088\u009a"
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
                     c = new String[6];
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

                  var6 = "ÿN\u00adQî«\f\u0086\r\\\u008c;\b×o\u008d\u0010ú¸Ãx*\u0006P§©\u0098\u008c\u0010\u008am\u000e\u001c";
                  var8 = "ÿN\u00adQî«\f\u0086\r\\\u008c;\b×o\u008d\u0010ú¸Ãx*\u0006P§©\u0098\u008c\u0010\u008am\u000e\u001c".length();
                  var5 = 16;
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 3567;
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
            throw new RuntimeException("yve", var10);
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
         throw new RuntimeException("yve" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
