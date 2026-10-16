import java.io.DataInput;
import java.io.DataOutput;
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

public class bgg extends gdw {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public bgg() {
   }

   public bgg(String var1) {
      long var2 = a ^ 81691112856147L;
      super();
      this.wlg = var1;
      if (var1 == null) {
         throw new IllegalArgumentException(a<"n">(21011, 901230103935063977L ^ var2));
      }
   }

   @Override
   public void b_8(DataOutput var1) {
      var1.writeUTF(this.wlg);
   }

   @Override
   public void zwk(DataInput var1, int var2, btc var3) {
      var3.es9(288L);
      this.wlg = var1.readUTF();
      var3.es9((long)(16 * this.wlg.length()));
   }

   @Override
   public byte ky0() {
      return 8;
   }

   @Override
   public String toString() {
      long var1 = a ^ 90832875715895L;
      return "\"" + this.wlg.replace("\"", a<"n">(32536, 3958660634606280135L ^ var1)) + "\"";
   }

   @Override
   public gdw h33() {
      return new bgg(this.wlg);
   }

   @Override
   public boolean dq5() {
      return this.wlg.isEmpty();
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
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifne 21
      // 09: aload 1
      // 0a: invokespecial gdw.equals (Ljava/lang/Object;)Z
      // 0d: ifne 1d
      // 10: goto 17
      // 13: invokestatic bgg.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 16: athrow
      // 17: bipush 0
      // 18: ireturn
      // 19: invokestatic bgg.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1c: athrow
      // 1d: aload 1
      // 1e: checkcast bgg
      // 21: astore 3
      // 22: aload 0
      // 23: getfield bgg.wlg Ljava/lang/String;
      // 26: iload 2
      // 27: ifne 58
      // 2a: ifnonnull 4d
      // 2d: goto 34
      // 30: invokestatic bgg.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 33: athrow
      // 34: aload 3
      // 35: getfield bgg.wlg Ljava/lang/String;
      // 38: iload 2
      // 39: ifne 58
      // 3c: goto 43
      // 3f: invokestatic bgg.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 42: athrow
      // 43: ifnull 86
      // 46: goto 4d
      // 49: invokestatic bgg.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4c: athrow
      // 4d: aload 0
      // 4e: getfield bgg.wlg Ljava/lang/String;
      // 51: goto 58
      // 54: invokestatic bgg.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 57: athrow
      // 58: iload 2
      // 59: ifne 71
      // 5c: ifnull 8a
      // 5f: goto 66
      // 62: invokestatic bgg.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 65: athrow
      // 66: aload 0
      // 67: getfield bgg.wlg Ljava/lang/String;
      // 6a: goto 71
      // 6d: invokestatic bgg.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 70: athrow
      // 71: aload 3
      // 72: getfield bgg.wlg Ljava/lang/String;
      // 75: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 78: iload 2
      // 79: ifne 87
      // 7c: ifeq 8a
      // 7f: goto 86
      // 82: invokestatic bgg.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 85: athrow
      // 86: bipush 1
      // 87: goto 8b
      // 8a: bipush 0
      // 8b: ireturn
   }

   @Override
   public int hashCode() {
      return super.hashCode() ^ this.wlg.hashCode();
   }

   @Override
   public String ocr() {
      return this.wlg;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(6990135299912396954L, 3668405584495331342L, MethodHandles.lookup().lookupClass()).a(207724855509429L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 40396132743320L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[2];
      int var7 = 0;
      String var6 = "Ã7ë\u0086Ûc\u008e\u0094ÏÊ\u001d\u001bÇ\u0010ð\f8\u001e&\u0084W3\u0016ÃT«q:V[5Ü\bWÞ\n§_4çK\u0010âÅô \u0012\u009aÚCæºî\u001d\u009dÉ!µã#q/×üäÀ\u001fsÐFUT÷";
      int var8 = "Ã7ë\u0086Ûc\u008e\u0094ÏÊ\u001d\u001bÇ\u0010ð\f8\u001e&\u0084W3\u0016ÃT«q:V[5Ü\bWÞ\n§_4çK\u0010âÅô \u0012\u009aÚCæºî\u001d\u009dÉ!µã#q/×üäÀ\u001fsÐFUT÷"
         .length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = b(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }

   private static String b(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 20278;
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
            throw new RuntimeException("bgg", var10);
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
         c[var5] = b(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("bgg" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
