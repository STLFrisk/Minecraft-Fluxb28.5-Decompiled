import java.io.File;
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
import org.apache.logging.log4j.LogManager;

public class fh6 {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public fh6(Minecraft var1) {
      this.so8 = var1;
      this.rrd();
   }

   public void rrd() {
      long var1 = a ^ 90023757974581L;
      int var3 = OpaquePredicate.b();

      try {
         this.qk2.clear();
         bdo var4 = g62.zgm(new File(this.so8.glh, a<"x">(23786, 1944992601395962784L ^ var1)));

         bdo var10000;
         label45: {
            try {
               var10000 = var4;
               if (var3 == 0) {
                  break label45;
               }

               if (var4 == null) {
                  return;
               }
            } catch (Exception var8) {
               throw a(var8);
            }

            var10000 = var4;
         }

         qhg var5 = var10000.bzb(a<"x">(16630, 6929962922862395325L ^ var1), 10);
         int var6 = 0;

         while (var6 < var5.vek()) {
            try {
               this.qk2.add(r1l.tx7(var5.kd6(var6)));
               var6++;
               if (var3 == 0 || var3 == 0) {
                  break;
               }
            } catch (Exception var7) {
               throw a(var7);
            }
         }
      } catch (Exception var9) {
         a7t.error(a<"x">(16635, 220298047765659574L ^ var1), var9);
      }
   }

   public void _ju() {
      long var1 = a ^ 4638623396430L;
      int var3 = OpaquePredicate.c();

      try {
         qhg var4 = new qhg();

         for (r1l var6 : this.qk2) {
            try {
               var4.w2j(var6.gsy());
               if (var3 != 0) {
                  return;
               }

               if (var3 != 0) {
                  break;
               }
            } catch (Exception var7) {
               throw a(var7);
            }
         }

         bdo var9 = new bdo();
         var9.rzm(a<"x">(16799, 253759056973316267L ^ var1), var4);
         g62.uhp(var9, new File(this.so8.glh, a<"x">(29798, 89243761007555923L ^ var1)));
      } catch (Exception var8) {
         a7t.error(a<"x">(10661, 5742442590976125074L ^ var1), var8);
      }
   }

   public r1l da_(int var1) {
      return (r1l)this.qk2.get(var1);
   }

   public void d8v(int var1) {
      this.qk2.remove(var1);
   }

   public void jlh(r1l var1) {
      this.qk2.add(var1);
   }

   public int aik() {
      return this.qk2.size();
   }

   public void j7y(int var1, int var2) {
      r1l var3 = this.da_(var1);
      this.qk2.set(var1, this.da_(var2));
      this.qk2.set(var2, var3);
      this._ju();
   }

   public void asw(int var1, r1l var2) {
      this.qk2.set(var1, var2);
   }

   public static void tav(r1l param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: new fh6
      // 03: dup
      // 04: invokestatic Minecraft.vz1 ()Lc05;
      // 07: invokespecial fh6.<init> (Lc05;)V
      // 0a: astore 2
      // 0b: invokestatic OpaquePredicate.c ()I
      // 0e: aload 2
      // 0f: invokevirtual fh6.rrd ()V
      // 12: istore 1
      // 13: bipush 0
      // 14: istore 3
      // 15: iload 3
      // 16: aload 2
      // 17: invokevirtual fh6.aik ()I
      // 1a: if_icmpge 7e
      // 1d: aload 2
      // 1e: iload 3
      // 1f: invokevirtual fh6.da_ (I)Lr1l;
      // 22: astore 4
      // 24: iload 1
      // 25: ifne 82
      // 28: iload 1
      // 29: ifne 7a
      // 2c: goto 33
      // 2f: invokestatic fh6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 32: athrow
      // 33: aload 4
      // 35: getfield r1l.bx0 Ljava/lang/String;
      // 38: aload 0
      // 39: getfield r1l.bx0 Ljava/lang/String;
      // 3c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 3f: ifeq 70
      // 42: goto 49
      // 45: invokestatic fh6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 48: athrow
      // 49: aload 4
      // 4b: getfield r1l.s4c Ljava/lang/String;
      // 4e: aload 0
      // 4f: getfield r1l.s4c Ljava/lang/String;
      // 52: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 55: ifeq 70
      // 58: goto 5f
      // 5b: invokestatic fh6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5e: athrow
      // 5f: aload 2
      // 60: iload 3
      // 61: aload 0
      // 62: invokevirtual fh6.asw (ILr1l;)V
      // 65: iload 1
      // 66: ifeq 7e
      // 69: goto 70
      // 6c: invokestatic fh6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6f: athrow
      // 70: iinc 3 1
      // 73: goto 7a
      // 76: invokestatic fh6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 79: athrow
      // 7a: iload 1
      // 7b: ifeq 15
      // 7e: aload 2
      // 7f: invokevirtual fh6._ju ()V
      // 82: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1275480752683047103L, -5665442010638316192L, MethodHandles.lookup().lookupClass()).a(14254949606307L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 29204761537635L;
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
      String var6 = ",\u008f\u008e\u0085\u001aòGa°Ï!½\u0012\u008eì\\\u0018½Û\u0093Ü\u009c«Ïå5\n\fîmÃv´^ñ\u0080\r6\u0002ýÊ8\u0099g\u009aÞa\u0090\u008e\u0095#ñÊ\u0086\u001ar\u0090Ô*2\u0096L\u0002äN\u0086ÚÊüÃ\u001d0=§A\nÀ\u0001f\u009e`Ð\u000b$\u008eÑ\b¡\u0010!»/'P½\u0094øì0\u0019Ö\u008a\u0006E$0N\u008f\u0092«Nc¨õ¡\u0005?Ï·sÎQ#pQ(!\u0015~¤öã2\u008eTÓ|\u0000\u0099å!\u007f7s-\u0081+";
      int var8 = ",\u008f\u008e\u0085\u001aòGa°Ï!½\u0012\u008eì\\\u0018½Û\u0093Ü\u009c«Ïå5\n\fîmÃv´^ñ\u0080\r6\u0002ýÊ8\u0099g\u009aÞa\u0090\u008e\u0095#ñÊ\u0086\u001ar\u0090Ô*2\u0096L\u0002äN\u0086ÚÊüÃ\u001d0=§A\nÀ\u0001f\u009e`Ð\u000b$\u008eÑ\b¡\u0010!»/'P½\u0094øì0\u0019Ö\u008a\u0006E$0N\u008f\u0092«Nc¨õ¡\u0005?Ï·sÎQ#pQ(!\u0015~¤öã2\u008eTÓ|\u0000\u0099å!\u007f7s-\u0081+"
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
                     a7t = LogManager.getLogger();
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

                  var6 = "º÷:\b\u0016\u008b\u008a\u0005\u008dë&\u008cvwØ\u0085 Àùd*IYÙm:¡\u0016\u0092=D&Îù¡°\\3r?²Mû\u0091\u0085^O\u0011è";
                  var8 = "º÷:\b\u0016\u008b\u008a\u0005\u008dë&\u008cvwØ\u0085 Àùd*IYÙm:¡\u0016\u0092=D&Îù¡°\\3r?²Mû\u0091\u0085^O\u0011è".length();
                  var5 = 16;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static Exception a(Exception var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16295;
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
            throw new RuntimeException("fh6", var10);
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
         throw new RuntimeException("fh6" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
