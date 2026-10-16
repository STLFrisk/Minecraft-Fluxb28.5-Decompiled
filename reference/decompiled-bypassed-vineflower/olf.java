import com.google.gson.annotations.SerializedName;
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

public class olf {
   @SerializedName("success")
   public boolean w8o;
   @SerializedName("watchdog_lastMinute")
   public int y84;
   @SerializedName("staff_rollingDaily")
   public int ix5;
   @SerializedName("watchdog_total")
   public int c29;
   @SerializedName("watchdog_rollingDaily")
   public int afo;
   @SerializedName("staff_total")
   public int ipa;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public boolean lmy() {
      return this.w8o;
   }

   public int fom() {
      return this.y84;
   }

   public int i1g() {
      return this.ix5;
   }

   public int pvx() {
      return this.c29;
   }

   public int prn() {
      return this.afo;
   }

   public int imu() {
      return this.ipa;
   }

   public void djo(boolean var1) {
      this.w8o = var1;
   }

   public void gml(int var1) {
      this.y84 = var1;
   }

   public void wd3(int var1) {
      this.ix5 = var1;
   }

   public void h3l(int var1) {
      this.c29 = var1;
   }

   public void q53(int var1) {
      this.afo = var1;
   }

   public void a32(int var1) {
      this.ipa = var1;
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
      // 04: aload 1
      // 05: iload 2
      // 06: ifeq 1b
      // 09: aload 0
      // 0a: if_acmpne 1a
      // 0d: goto 14
      // 10: invokestatic olf.a (Loov;)Loov;
      // 13: athrow
      // 14: bipush 1
      // 15: ireturn
      // 16: invokestatic olf.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 1
      // 1b: iload 2
      // 1c: ifeq 33
      // 1f: instanceof olf
      // 22: ifne 32
      // 25: goto 2c
      // 28: invokestatic olf.a (Loov;)Loov;
      // 2b: athrow
      // 2c: bipush 0
      // 2d: ireturn
      // 2e: invokestatic olf.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 1
      // 33: checkcast olf
      // 36: astore 3
      // 37: aload 3
      // 38: aload 0
      // 39: invokevirtual olf.pi_ (Ljava/lang/Object;)Z
      // 3c: iload 2
      // 3d: ifeq 54
      // 40: ifne 50
      // 43: goto 4a
      // 46: invokestatic olf.a (Loov;)Loov;
      // 49: athrow
      // 4a: bipush 0
      // 4b: ireturn
      // 4c: invokestatic olf.a (Loov;)Loov;
      // 4f: athrow
      // 50: aload 0
      // 51: invokevirtual olf.lmy ()Z
      // 54: aload 3
      // 55: invokevirtual olf.lmy ()Z
      // 58: iload 2
      // 59: ifeq 74
      // 5c: if_icmpeq 6c
      // 5f: goto 66
      // 62: invokestatic olf.a (Loov;)Loov;
      // 65: athrow
      // 66: bipush 0
      // 67: ireturn
      // 68: invokestatic olf.a (Loov;)Loov;
      // 6b: athrow
      // 6c: aload 0
      // 6d: invokevirtual olf.fom ()I
      // 70: aload 3
      // 71: invokevirtual olf.fom ()I
      // 74: iload 2
      // 75: ifeq 90
      // 78: if_icmpeq 88
      // 7b: goto 82
      // 7e: invokestatic olf.a (Loov;)Loov;
      // 81: athrow
      // 82: bipush 0
      // 83: ireturn
      // 84: invokestatic olf.a (Loov;)Loov;
      // 87: athrow
      // 88: aload 0
      // 89: invokevirtual olf.i1g ()I
      // 8c: aload 3
      // 8d: invokevirtual olf.i1g ()I
      // 90: iload 2
      // 91: ifeq ac
      // 94: if_icmpeq a4
      // 97: goto 9e
      // 9a: invokestatic olf.a (Loov;)Loov;
      // 9d: athrow
      // 9e: bipush 0
      // 9f: ireturn
      // a0: invokestatic olf.a (Loov;)Loov;
      // a3: athrow
      // a4: aload 0
      // a5: invokevirtual olf.pvx ()I
      // a8: aload 3
      // a9: invokevirtual olf.pvx ()I
      // ac: iload 2
      // ad: ifeq c8
      // b0: if_icmpeq c0
      // b3: goto ba
      // b6: invokestatic olf.a (Loov;)Loov;
      // b9: athrow
      // ba: bipush 0
      // bb: ireturn
      // bc: invokestatic olf.a (Loov;)Loov;
      // bf: athrow
      // c0: aload 0
      // c1: invokevirtual olf.prn ()I
      // c4: aload 3
      // c5: invokevirtual olf.prn ()I
      // c8: iload 2
      // c9: ifeq ef
      // cc: if_icmpeq dc
      // cf: goto d6
      // d2: invokestatic olf.a (Loov;)Loov;
      // d5: athrow
      // d6: bipush 0
      // d7: ireturn
      // d8: invokestatic olf.a (Loov;)Loov;
      // db: athrow
      // dc: aload 0
      // dd: invokevirtual olf.imu ()I
      // e0: iload 2
      // e1: ifeq f9
      // e4: aload 3
      // e5: invokevirtual olf.imu ()I
      // e8: goto ef
      // eb: invokestatic olf.a (Loov;)Loov;
      // ee: athrow
      // ef: if_icmpeq f8
      // f2: bipush 0
      // f3: ireturn
      // f4: invokestatic olf.a (Loov;)Loov;
      // f7: athrow
      // f8: bipush 1
      // f9: ireturn
   }

   public boolean pi_(Object var1) {
      return var1 instanceof olf;
   }

   @Override
   public int hashCode() {
      byte var2 = 59;
      int var10000 = t9d.c();
      int var3 = 1;
      int var1 = var10000;

      byte var10001;
      label22: {
         label21: {
            try {
               var10000 = var3 * 59;
               var10001 = this.lmy();
               if (var1 != 0) {
                  break label22;
               }

               if (var10001 != 0) {
                  break label21;
               }
            } catch (oov var4) {
               throw a(var4);
            }

            var10001 = 97;
            break label22;
         }

         var10001 = 79;
      }

      var3 = var10000 + var10001;
      var3 = var3 * 59 + this.fom();
      var3 = var3 * 59 + this.i1g();
      var3 = var3 * 59 + this.pvx();
      var3 = var3 * 59 + this.prn();
      return var3 * 59 + this.imu();
   }

   @Override
   public String toString() {
      long var1 = a ^ 120048930664117L;
      return a<"e">(3316, 838242487121219279L ^ var1)
         + this.lmy()
         + a<"e">(7094, 1642712298572618124L ^ var1)
         + this.fom()
         + a<"e">(28031, 642794924861058883L ^ var1)
         + this.i1g()
         + a<"e">(23864, 9147242861690380039L ^ var1)
         + this.pvx()
         + a<"e">(29324, 7430678830810067121L ^ var1)
         + this.prn()
         + a<"e">(25930, 3986720916599105396L ^ var1)
         + this.imu()
         + ")";
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5162138311748849167L, 7424467231970244212L, MethodHandles.lookup().lookupClass()).a(166002168772072L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 21480478419094L;
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
      String var6 = "U¥µù\u001fÞ(ò;÷\u009a.\u001emÏ¦\u0010\u0012VÕ±D{\u009e\u00adS\u0012\u000fVj\u001eu\u008cÏ7vü4gQ\u0018¹\\7Â5Õ{\u0099Ò\u0081m7¹÷u\u0087E£çqY¸F£(§a÷[q4Mú\u0011'#s½?\u0012%ê\u009d\u0013\u0099¤%\u0093É9µö½YoÂ\u0092a\u0098\u0001EÝ\u0080Ò\u0090(+XÕ\u0005ó\u001b\u0094ê\u0088ç\u0014J\u001d\u008c¢T\"Å)ñä`\fe\t÷Íþ\u0091\u001e\u001a\u000f%ó[ÚÏÀ\u0010L";
      int var8 = "U¥µù\u001fÞ(ò;÷\u009a.\u001emÏ¦\u0010\u0012VÕ±D{\u009e\u00adS\u0012\u000fVj\u001eu\u008cÏ7vü4gQ\u0018¹\\7Â5Õ{\u0099Ò\u0081m7¹÷u\u0087E£çqY¸F£(§a÷[q4Mú\u0011'#s½?\u0012%ê\u009d\u0013\u0099¤%\u0093É9µö½YoÂ\u0092a\u0098\u0001EÝ\u0080Ò\u0090(+XÕ\u0005ó\u001b\u0094ê\u0088ç\u0014J\u001d\u008c¢T\"Å)ñä`\fe\t÷Íþ\u0091\u001e\u001a\u000f%ó[ÚÏÀ\u0010L"
         .length();
      char var5 = '(';
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

                  var6 = "ñ\u0089~NÇÌ7¦¥É\u008cv\u001fç¤ãÉå\u0019Í×\u008b\u0007Ãëvì\u000e!ºZß³MÂddI\u0088~M\"ïPV\u0088¾~ï\u0013æ)ÜæD\u00160`Ê0ÅäC\u0010Gñ§\u0015yÇ~~&Á\u0088g¶h*v¯D$\u0013\tÃªæ\u0090Ü¨\n@0G)\u0012\u0099ª\nä)\u001b\u009cÉ";
                  var8 = "ñ\u0089~NÇÌ7¦¥É\u008cv\u001fç¤ãÉå\u0019Í×\u008b\u0007Ãëvì\u000e!ºZß³MÂddI\u0088~M\"ïPV\u0088¾~ï\u0013æ)ÜæD\u00160`Ê0ÅäC\u0010Gñ§\u0015yÇ~~&Á\u0088g¶h*v¯D$\u0013\tÃªæ\u0090Ü¨\n@0G)\u0012\u0099ª\nä)\u001b\u009cÉ"
                     .length();
                  var5 = '8';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 14636;
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
            throw new RuntimeException("olf", var10);
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
         throw new RuntimeException("olf" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
