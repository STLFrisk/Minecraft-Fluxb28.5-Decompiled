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

public class alb extends ed3 {
   private static final long a;
   private static final String[] j;
   private static final String[] k;
   private static final Map l = new HashMap(13);

   public alb(gbe var1, x1l var2) {
      super(var1);
      this.qr2 = var2;
   }

   @Override
   public String o9u() {
      long var1 = a ^ 103071741846461L;
      return c<"l">(21807, 8055027040586525753L ^ var1);
   }

   @Override
   public String _ey() {
      return this.qr2.rii() + ":" + this.qr2.g9o();
   }

   @Override
   public void dgw(gt4 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 2
      // 004: aload 0
      // 005: getfield alb.ezi Loon;
      // 008: invokevirtual oon.eec ()Ljava/lang/String;
      // 00b: ldc ":"
      // 00d: nop
      // 00e: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
      // 011: iload 2
      // 012: ifne 06d
      // 015: arraylength
      // 016: bipush 1
      // 017: if_icmpgt 059
      // 01a: goto 021
      // 01d: invokestatic alb.a (Loov;)Loov;
      // 020: athrow
      // 021: getstatic qd_.oyx Ljava/util/ArrayList;
      // 024: getstatic qd_.oyx Ljava/util/ArrayList;
      // 027: aload 0
      // 028: getfield alb.qr2 Lx1l;
      // 02b: invokevirtual java/util/ArrayList.indexOf (Ljava/lang/Object;)I
      // 02e: new x1l
      // 031: dup
      // 032: aload 0
      // 033: getfield alb.ezi Loon;
      // 036: invokevirtual oon.eec ()Ljava/lang/String;
      // 039: aconst_null
      // 03a: aconst_null
      // 03b: aload 0
      // 03c: getfield alb.qr2 Lx1l;
      // 03f: invokevirtual x1l.wvc ()Z
      // 042: invokespecial x1l.<init> (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
      // 045: invokevirtual java/util/ArrayList.set (ILjava/lang/Object;)Ljava/lang/Object;
      // 048: pop
      // 049: aload 0
      // 04a: aconst_null
      // 04b: putfield alb.cqv Ljava/lang/String;
      // 04e: iload 2
      // 04f: ifeq 0d0
      // 052: goto 059
      // 055: invokestatic alb.a (Loov;)Loov;
      // 058: athrow
      // 059: aload 0
      // 05a: getfield alb.ezi Loon;
      // 05d: invokevirtual oon.eec ()Ljava/lang/String;
      // 060: ldc ":"
      // 062: nop
      // 063: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
      // 066: goto 06d
      // 069: invokestatic alb.a (Loov;)Loov;
      // 06c: athrow
      // 06d: bipush 0
      // 06e: aaload
      // 06f: astore 3
      // 070: aload 0
      // 071: getfield alb.ezi Loon;
      // 074: invokevirtual oon.eec ()Ljava/lang/String;
      // 077: ldc ":"
      // 079: nop
      // 07a: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
      // 07d: bipush 1
      // 07e: aaload
      // 07f: astore 4
      // 081: aload 0
      // 082: aload 3
      // 083: aload 4
      // 085: invokestatic zfs.eoj (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 088: putfield alb.cqv Ljava/lang/String;
      // 08b: aload 0
      // 08c: getfield alb.cqv Ljava/lang/String;
      // 08f: iload 2
      // 090: ifne 0df
      // 093: ifnonnull 0d0
      // 096: goto 09d
      // 099: invokestatic alb.a (Loov;)Loov;
      // 09c: athrow
      // 09d: getstatic qd_.oyx Ljava/util/ArrayList;
      // 0a0: getstatic qd_.oyx Ljava/util/ArrayList;
      // 0a3: aload 0
      // 0a4: getfield alb.qr2 Lx1l;
      // 0a7: invokevirtual java/util/ArrayList.indexOf (Ljava/lang/Object;)I
      // 0aa: new x1l
      // 0ad: dup
      // 0ae: aload 3
      // 0af: aload 4
      // 0b1: aload 0
      // 0b2: getfield alb.f41 Lc05;
      // 0b5: invokevirtual c05.ee0 ()Lrh0;
      // 0b8: invokevirtual rh0.z2u ()Ljava/lang/String;
      // 0bb: aload 0
      // 0bc: getfield alb.qr2 Lx1l;
      // 0bf: invokevirtual x1l.wvc ()Z
      // 0c2: invokespecial x1l.<init> (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
      // 0c5: invokevirtual java/util/ArrayList.set (ILjava/lang/Object;)Ljava/lang/Object;
      // 0c8: pop
      // 0c9: goto 0d0
      // 0cc: invokestatic alb.a (Loov;)Loov;
      // 0cf: athrow
      // 0d0: aload 0
      // 0d1: iload 2
      // 0d2: ifne 0f6
      // 0d5: getfield alb.cqv Ljava/lang/String;
      // 0d8: goto 0df
      // 0db: invokestatic alb.a (Loov;)Loov;
      // 0de: athrow
      // 0df: ifnonnull 100
      // 0e2: invokestatic qd_.mpj ()V
      // 0e5: getstatic zwr.qkk Lzwr;
      // 0e8: invokevirtual zwr.up0 ()Lszk;
      // 0eb: invokevirtual szk.p5g ()V
      // 0ee: aload 0
      // 0ef: goto 0f6
      // 0f2: invokestatic alb.a (Loov;)Loov;
      // 0f5: athrow
      // 0f6: getfield alb.f41 Lc05;
      // 0f9: aload 0
      // 0fa: getfield alb.bnx Lgbe;
      // 0fd: invokevirtual c05.z2i (Lgbe;)V
      // 100: return
   }

   @Override
   public String a79() {
      long var1 = a ^ 48493967235699L;
      return c<"l">(14364, 4501490665397221573L ^ var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7100035553159145508L, -2031063539210517399L, MethodHandles.lookup().lookupClass()).a(188808976663987L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 51213141558476L;
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
      String var6 = "ã\u0088\u0001×=ÜMHY\u0000q\u0003Qí\u0081\u00058¦ù®x/¨Ý\u0010¤¯\u00938º\u0010ÔkC «?\u001bâî#";
      int var8 = "ã\u0088\u0001×=ÜMHY\u0000q\u0003Qí\u0081\u00058¦ù®x/¨Ý\u0010¤¯\u00938º\u0010ÔkC «?\u001bâî#".length();
      char var5 = 24;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = d(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            j = var9;
            k = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static oov a(oov var0) {
      return var0;
   }

   private static String d(byte[] var0) {
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

   private static String c(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 14058;
      if (k[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])l.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               l.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("alb", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = j[var5].getBytes("ISO-8859-1");
         k[var5] = d(((Cipher)var4[0]).doFinal(var9));
      }

      return k[var5];
   }

   private static Object c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = c(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("alb" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
