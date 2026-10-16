import com.google.common.collect.Lists;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class v8s implements g6k {
   private static final Logger ah6;
   private tts gaa;
   private yo9 s0m = new yo9();
   private List t2j = Lists.newArrayList();
   private t9d _55;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public v8s(t9d var1) {
      this.gaa = new tkg(var1, 0, 0);
      this._55 = var1;
   }

   @Override
   public boolean pnt(int var1, int var2) {
      return true;
   }

   public void e11(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: aload 0
      // 05: iload 1
      // 06: iload 2
      // 07: invokevirtual v8s.et2 (II)Ltts;
      // 0a: astore 4
      // 0c: aload 4
      // 0e: invokevirtual tts.col ()Z
      // 11: iload 3
      // 12: ifne 43
      // 15: ifne 2b
      // 18: goto 1f
      // 1b: invokestatic v8s.a (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 4
      // 21: invokevirtual tts.lg_ ()V
      // 24: goto 2b
      // 27: invokestatic v8s.a (Loov;)Loov;
      // 2a: athrow
      // 2b: aload 0
      // 2c: getfield v8s.s0m Lyo9;
      // 2f: iload 1
      // 30: iload 2
      // 31: invokestatic h2f.fcz (II)J
      // 34: invokevirtual yo9.wsz (J)Ljava/lang/Object;
      // 37: pop
      // 38: aload 0
      // 39: getfield v8s.t2j Ljava/util/List;
      // 3c: aload 4
      // 3e: invokeinterface java/util/List.remove (Ljava/lang/Object;)Z 2
      // 43: pop
      // 44: return
   }

   public tts w1o(int var1, int var2) {
      tts var3 = new tts(this._55, var1, var2);
      this.s0m.pab(h2f.fcz(var1, var2), var3);
      this.t2j.add(var3);
      var3.o8h(true);
      return var3;
   }

   @Override
   public tts et2(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: aload 0
      // 05: getfield v8s.s0m Lyo9;
      // 08: iload 1
      // 09: iload 2
      // 0a: invokestatic h2f.fcz (II)J
      // 0d: invokevirtual yo9.hhm (J)Ljava/lang/Object;
      // 10: checkcast tts
      // 13: astore 4
      // 15: aload 4
      // 17: iload 3
      // 18: ifne 30
      // 1b: ifnonnull 33
      // 1e: goto 25
      // 21: invokestatic v8s.a (Loov;)Loov;
      // 24: athrow
      // 25: aload 0
      // 26: getfield v8s.gaa Ltts;
      // 29: goto 30
      // 2c: invokestatic v8s.a (Loov;)Loov;
      // 2f: athrow
      // 30: goto 35
      // 33: aload 4
      // 35: areturn
   }

   @Override
   public boolean va4(boolean var1, sw6 var2) {
      return true;
   }

   @Override
   public void hua() {
   }

   @Override
   public boolean p68() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic v8s.a J
      // 03: ldc2_w 10952827991286
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic java/lang/System.currentTimeMillis ()J
      // 0b: lstore 4
      // 0d: invokestatic t9d.b ()I
      // 10: aload 0
      // 11: getfield v8s.t2j Ljava/util/List;
      // 14: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 19: astore 6
      // 1b: istore 3
      // 1c: aload 6
      // 1e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 23: ifeq 63
      // 26: aload 6
      // 28: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2d: checkcast tts
      // 30: astore 7
      // 32: iload 3
      // 33: ifeq a8
      // 36: aload 7
      // 38: invokestatic java/lang/System.currentTimeMillis ()J
      // 3b: lload 4
      // 3d: lsub
      // 3e: ldc2_w 5
      // 41: lcmp
      // 42: iload 3
      // 43: ifeq 58
      // 46: goto 4d
      // 49: invokestatic v8s.a (Loov;)Loov;
      // 4c: athrow
      // 4d: ifle 5b
      // 50: goto 57
      // 53: invokestatic v8s.a (Loov;)Loov;
      // 56: athrow
      // 57: bipush 1
      // 58: goto 5c
      // 5b: bipush 0
      // 5c: invokevirtual tts.o7u (Z)V
      // 5f: iload 3
      // 60: ifne 1c
      // 63: invokestatic java/lang/System.currentTimeMillis ()J
      // 66: lload 4
      // 68: lsub
      // 69: ldc2_w 100
      // 6c: lcmp
      // 6d: iload 3
      // 6e: ifeq a9
      // 71: ifle a8
      // 74: goto 7b
      // 77: invokestatic v8s.a (Loov;)Loov;
      // 7a: athrow
      // 7b: getstatic v8s.ah6 Lorg/apache/logging/log4j/Logger;
      // 7e: sipush 3435
      // 81: ldc2_w 5925239661546900579
      // 84: lload 1
      // 85: lxor
      // 86: invokedynamic h (IJ)Ljava/lang/String; bsm=v8s.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8b: nop
      // 8c: bipush 1
      // 8d: anewarray 13
      // 90: dup
      // 91: bipush 0
      // 92: invokestatic java/lang/System.currentTimeMillis ()J
      // 95: lload 4
      // 97: lsub
      // 98: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 9b: aastore
      // 9c: invokeinterface org/apache/logging/log4j/Logger.info (Ljava/lang/String;[Ljava/lang/Object;)V 3
      // a1: goto a8
      // a4: invokestatic v8s.a (Loov;)Loov;
      // a7: athrow
      // a8: bipush 0
      // a9: ireturn
   }

   @Override
   public boolean pj4() {
      return false;
   }

   @Override
   public void fbq(g6k var1, int var2, int var3) {
   }

   @Override
   public boolean zzc(g6k var1, tts var2, int var3, int var4) {
      return false;
   }

   @Override
   public String y2l() {
      long var1 = a ^ 122022906805716L;
      return a<"h">(3817, 5477420503268148930L ^ var1) + this.s0m.iz6() + a<"h">(8493, 3338520374026823940L ^ var1) + this.t2j.size();
   }

   @Override
   public List sbk(ek6 var1, mew var2) {
      return null;
   }

   @Override
   public mew epl(t9d var1, String var2, mew var3) {
      return null;
   }

   @Override
   public int gkt() {
      return this.t2j.size();
   }

   @Override
   public void nw5(tts var1, int var2, int var3) {
   }

   @Override
   public tts iqa(mew var1) {
      return this.et2(var1.getX() >> 4, var1.getZ() >> 4);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1804953108912581345L, 3176542134386679921L, MethodHandles.lookup().lookupClass()).a(117798682459245L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 111546089649948L;
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
      String var6 = "1>\u001cå,\tYkØa\u008b¿²Õ\u0080å¡Ù\u000bßÓ#Á&b32\u008f\rkÒö!\u009c\u0084mð\u009dÂ{r\u0014\u0006±]@\u00106H~é\nD\u001b\u0092¶låäé\u0018´@Æ_\u0087j¨Æg\u0085/\u00955Ò·1]=Ñ\u0010Ö\u0006\u000eæ=\u0090\u0005WM{ÌiÐºa\u0090el²X¤ï\u001dh\u0019.µzaj\u0081ø#\n\u0095¥¼²\u0000Ï\u0010P\u0001~0]Á\u0092ªÉ}°¹\u009cË\u001a\u0083";
      int var8 = "1>\u001cå,\tYkØa\u008b¿²Õ\u0080å¡Ù\u000bßÓ#Á&b32\u008f\rkÒö!\u009c\u0084mð\u009dÂ{r\u0014\u0006±]@\u00106H~é\nD\u001b\u0092¶låäé\u0018´@Æ_\u0087j¨Æg\u0085/\u00955Ò·1]=Ñ\u0010Ö\u0006\u000eæ=\u0090\u0005WM{ÌiÐºa\u0090el²X¤ï\u001dh\u0019.µzaj\u0081ø#\n\u0095¥¼²\u0000Ï\u0010P\u0001~0]Á\u0092ªÉ}°¹\u009cË\u001a\u0083"
         .length();
      char var5 = '0';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[3];
            ah6 = LogManager.getLogger();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 7170;
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
            throw new RuntimeException("v8s", var10);
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
         throw new RuntimeException("v8s" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
