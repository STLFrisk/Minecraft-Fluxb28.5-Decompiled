import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class yem implements ekw {
   public List asp = Lists.newArrayList();
   private poy nwq;
   private static final long b;
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   @Override
   public ekw vha(ekw var1) {
      var1.f4q().dn3(this.f4q());
      this.asp.add(var1);
      return this;
   }

   @Override
   public List iwv() {
      return this.asp;
   }

   @Override
   public ekw lt8(String var1) {
      return this.vha(new tao(var1));
   }

   @Override
   public ekw di5(poy var1) {
      this.nwq = var1;
      int var10000 = t9d.c();
      Iterator var3 = this.asp.iterator();
      int var2 = var10000;

      while (var3.hasNext()) {
         ekw var4 = (ekw)var3.next();
         var4.f4q().dn3(this.f4q());
         if (var2 != 0) {
            break;
         }
      }

      return this;
   }

   @Override
   public poy f4q() {
      if (this.nwq == null) {
         this.nwq = new poy();

         for (ekw var2 : this.asp) {
            var2.f4q().dn3(this.nwq);
         }
      }

      return this.nwq;
   }

   @Override
   public Iterator iterator() {
      return Iterators.concat(Iterators.forArray(new yem[]{this}), eez(this.asp));
   }

   @Override
   public final String rnh() {
      StringBuilder var2 = new StringBuilder();
      int var10000 = t9d.c();
      Iterator var3 = this.iterator();
      int var1 = var10000;

      while (true) {
         if (var3.hasNext()) {
            ekw var4 = (ekw)var3.next();

            try {
               var6 = var2.append(var4.cpz());
               if (var1 != 0) {
                  break;
               }

               if (var1 == 0) {
                  continue;
               }
            } catch (oov var5) {
               throw b(var5);
            }
         }

         var6 = var2;
         break;
      }

      return var6.toString();
   }

   @Override
   public final String _2o() {
      StringBuilder var2 = new StringBuilder();
      int var10000 = t9d.b();
      Iterator var3 = this.iterator();
      int var1 = var10000;

      while (true) {
         if (var3.hasNext()) {
            ekw var4 = (ekw)var3.next();

            try {
               var2.append(var4.f4q().tmo());
               var2.append(var4.cpz());
               var6 = var2.append(syo.w29);
               if (var1 == 0) {
                  break;
               }

               if (var1 != 0) {
                  continue;
               }
            } catch (oov var5) {
               throw b(var5);
            }
         }

         var6 = var2;
         break;
      }

      return var6.toString();
   }

   public static Iterator eez(Iterable var0) {
      Iterator var1 = Iterators.concat(Iterators.transform(var0.iterator(), new yem$1()));
      return Iterators.transform(var1, new yem$2());
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
      // 06: ifne 1b
      // 09: aload 1
      // 0a: if_acmpne 1a
      // 0d: goto 14
      // 10: invokestatic yem.b (Loov;)Loov;
      // 13: athrow
      // 14: bipush 1
      // 15: ireturn
      // 16: invokestatic yem.b (Loov;)Loov;
      // 19: athrow
      // 1a: aload 1
      // 1b: iload 2
      // 1c: ifne 33
      // 1f: instanceof yem
      // 22: ifne 32
      // 25: goto 2c
      // 28: invokestatic yem.b (Loov;)Loov;
      // 2b: athrow
      // 2c: bipush 0
      // 2d: ireturn
      // 2e: invokestatic yem.b (Loov;)Loov;
      // 31: athrow
      // 32: aload 1
      // 33: checkcast yem
      // 36: astore 3
      // 37: aload 0
      // 38: getfield yem.asp Ljava/util/List;
      // 3b: aload 3
      // 3c: getfield yem.asp Ljava/util/List;
      // 3f: invokeinterface java/util/List.equals (Ljava/lang/Object;)Z 2
      // 44: iload 2
      // 45: ifne 64
      // 48: ifeq 76
      // 4b: goto 52
      // 4e: invokestatic yem.b (Loov;)Loov;
      // 51: athrow
      // 52: aload 0
      // 53: invokevirtual yem.f4q ()Lpoy;
      // 56: aload 3
      // 57: invokevirtual yem.f4q ()Lpoy;
      // 5a: invokevirtual poy.equals (Ljava/lang/Object;)Z
      // 5d: goto 64
      // 60: invokestatic yem.b (Loov;)Loov;
      // 63: athrow
      // 64: iload 2
      // 65: ifne 73
      // 68: ifeq 76
      // 6b: goto 72
      // 6e: invokestatic yem.b (Loov;)Loov;
      // 71: athrow
      // 72: bipush 1
      // 73: goto 77
      // 76: bipush 0
      // 77: ireturn
   }

   @Override
   public int hashCode() {
      return 31 * this.nwq.hashCode() + this.asp.hashCode();
   }

   @Override
   public String toString() {
      long var1 = b ^ 96569102161452L;
      return a<"e">(12374, 6764603499260108688L ^ var1) + this.nwq + a<"e">(8531, 6086259959512977044L ^ var1) + this.asp + '}';
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1507090955910443728L, 3319586635637934012L, MethodHandles.lookup().lookupClass()).a(252668358230787L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 45192955018706L;
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
      String var6 = "^b\"ùÁ1\t\u0014\u000b\u0097Ý¼(Yöëñ-\u001b!©×Û\\(Ó\bÐÏµm\u0091w\u0082\u001c\u001dã^§¾ì\fÏAMtEÚ\u009f½/xÜ;möåJß¦Õ`\u0093ðÖ";
      int var8 = "^b\"ùÁ1\t\u0014\u000b\u0097Ý¼(Yöëñ-\u001b!©×Û\\(Ó\bÐÏµm\u0091w\u0082\u001c\u001dã^§¾ì\fÏAMtEÚ\u009f½/xÜ;möåJß¦Õ`\u0093ðÖ".length();
      char var5 = 24;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            c = var9;
            d = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static oov b(oov var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 25405;
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
            throw new RuntimeException("yem", var10);
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
         throw new RuntimeException("yem" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
