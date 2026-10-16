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

public class rnq$ffv implements Comparable {
   private final sla rfe;
   private final int dor;
   private final int t_w;
   private final int yjs;
   private boolean xhf;
   private float amq;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public rnq$ffv(sla param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokespecial java/lang/Object.<init> ()V
      // 04: aload 0
      // 05: fconst_1
      // 06: putfield rnq$ffv.amq F
      // 09: aload 0
      // 0a: aload 1
      // 0b: putfield rnq$ffv.rfe Lsla;
      // 0e: invokestatic OpaquePredicate.c ()I
      // 11: aload 0
      // 12: aload 1
      // 13: invokevirtual sla.jkj ()I
      // 16: putfield rnq$ffv.dor I
      // 19: istore 3
      // 1a: aload 0
      // 1b: aload 1
      // 1c: invokevirtual sla.yva ()I
      // 1f: putfield rnq$ffv.t_w I
      // 22: aload 0
      // 23: iload 2
      // 24: putfield rnq$ffv.yjs I
      // 27: aload 0
      // 28: aload 0
      // 29: getfield rnq$ffv.t_w I
      // 2c: iload 2
      // 2d: invokestatic rnq.py8 (II)I
      // 30: iload 3
      // 31: ifne 4e
      // 34: aload 0
      // 35: getfield rnq$ffv.dor I
      // 38: iload 2
      // 39: invokestatic rnq.py8 (II)I
      // 3c: if_icmple 51
      // 3f: goto 46
      // 42: invokestatic rnq$ffv.a (Loov;)Loov;
      // 45: athrow
      // 46: bipush 1
      // 47: goto 4e
      // 4a: invokestatic rnq$ffv.a (Loov;)Loov;
      // 4d: athrow
      // 4e: goto 52
      // 51: bipush 0
      // 52: putfield rnq$ffv.xhf Z
      // 55: return
   }

   public sla wyi() {
      return this.rfe;
   }

   public int fsh() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield rnq$ffv.xhf Z
      // 08: iload 1
      // 09: ifeq 3a
      // 0c: ifeq 2f
      // 0f: goto 16
      // 12: invokestatic rnq$ffv.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield rnq$ffv.t_w I
      // 1a: i2f
      // 1b: aload 0
      // 1c: getfield rnq$ffv.amq F
      // 1f: fmul
      // 20: f2i
      // 21: aload 0
      // 22: getfield rnq$ffv.yjs I
      // 25: invokestatic rnq.py8 (II)I
      // 28: goto 41
      // 2b: invokestatic rnq$ffv.a (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 0
      // 30: getfield rnq$ffv.dor I
      // 33: i2f
      // 34: aload 0
      // 35: getfield rnq$ffv.amq F
      // 38: fmul
      // 39: f2i
      // 3a: aload 0
      // 3b: getfield rnq$ffv.yjs I
      // 3e: invokestatic rnq.py8 (II)I
      // 41: ireturn
   }

   public int smw() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield rnq$ffv.xhf Z
      // 08: iload 1
      // 09: ifeq 3a
      // 0c: ifeq 2f
      // 0f: goto 16
      // 12: invokestatic rnq$ffv.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield rnq$ffv.dor I
      // 1a: i2f
      // 1b: aload 0
      // 1c: getfield rnq$ffv.amq F
      // 1f: fmul
      // 20: f2i
      // 21: aload 0
      // 22: getfield rnq$ffv.yjs I
      // 25: invokestatic rnq.py8 (II)I
      // 28: goto 41
      // 2b: invokestatic rnq$ffv.a (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 0
      // 30: getfield rnq$ffv.t_w I
      // 33: i2f
      // 34: aload 0
      // 35: getfield rnq$ffv.amq F
      // 38: fmul
      // 39: f2i
      // 3a: aload 0
      // 3b: getfield rnq$ffv.yjs I
      // 3e: invokestatic rnq.py8 (II)I
      // 41: ireturn
   }

   public void gfm() {
      int var1 = OpaquePredicate.b();

      rnq$ffv var10000;
      boolean var10001;
      label22: {
         label21: {
            try {
               var10000 = this;
               var10001 = this.xhf;
               if (var1 == 0) {
                  break label22;
               }

               if (!this.xhf) {
                  break label21;
               }
            } catch (oov var2) {
               throw a(var2);
            }

            var10001 = false;
            break label22;
         }

         var10001 = true;
      }

      var10000.xhf = var10001;
   }

   public boolean kd5() {
      return this.xhf;
   }

   public void l66(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield rnq$ffv.dor I
      // 08: iload 1
      // 09: iload 2
      // 0a: ifeq 2e
      // 0d: if_icmple 44
      // 10: goto 17
      // 13: invokestatic rnq$ffv.a (Loov;)Loov;
      // 16: athrow
      // 17: aload 0
      // 18: iload 2
      // 19: ifeq 32
      // 1c: goto 23
      // 1f: invokestatic rnq$ffv.a (Loov;)Loov;
      // 22: athrow
      // 23: getfield rnq$ffv.t_w I
      // 26: iload 1
      // 27: goto 2e
      // 2a: invokestatic rnq$ffv.a (Loov;)Loov;
      // 2d: athrow
      // 2e: if_icmple 44
      // 31: aload 0
      // 32: iload 1
      // 33: i2f
      // 34: aload 0
      // 35: getfield rnq$ffv.dor I
      // 38: aload 0
      // 39: getfield rnq$ffv.t_w I
      // 3c: invokestatic java/lang/Math.min (II)I
      // 3f: i2f
      // 40: fdiv
      // 41: putfield rnq$ffv.amq F
      // 44: return
   }

   @Override
   public String toString() {
      long var1 = a ^ 28200326930809L;
      return a<"o">(28429, 3576811527798182926L ^ var1) + this.dor + a<"o">(25382, 6458569202023946276L ^ var1) + this.t_w + '}';
   }

   public int cd9(rnq$ffv param1) {
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
      // 05: invokevirtual rnq$ffv.smw ()I
      // 08: aload 1
      // 09: invokevirtual rnq$ffv.smw ()I
      // 0c: iload 2
      // 0d: ifne ba
      // 10: if_icmpne a0
      // 13: goto 1a
      // 16: invokestatic rnq$ffv.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 0
      // 1b: invokevirtual rnq$ffv.fsh ()I
      // 1e: aload 1
      // 1f: invokevirtual rnq$ffv.fsh ()I
      // 22: iload 2
      // 23: ifne 93
      // 26: goto 2d
      // 29: invokestatic rnq$ffv.a (Loov;)Loov;
      // 2c: athrow
      // 2d: if_icmpne 80
      // 30: goto 37
      // 33: invokestatic rnq$ffv.a (Loov;)Loov;
      // 36: athrow
      // 37: aload 0
      // 38: getfield rnq$ffv.rfe Lsla;
      // 3b: invokevirtual sla.nfl ()Ljava/lang/String;
      // 3e: iload 2
      // 3f: ifne 75
      // 42: goto 49
      // 45: invokestatic rnq$ffv.a (Loov;)Loov;
      // 48: athrow
      // 49: ifnonnull 6e
      // 4c: goto 53
      // 4f: invokestatic rnq$ffv.a (Loov;)Loov;
      // 52: athrow
      // 53: aload 1
      // 54: getfield rnq$ffv.rfe Lsla;
      // 57: invokevirtual sla.nfl ()Ljava/lang/String;
      // 5a: ifnonnull 6c
      // 5d: goto 64
      // 60: invokestatic rnq$ffv.a (Loov;)Loov;
      // 63: athrow
      // 64: bipush 0
      // 65: goto 6d
      // 68: invokestatic rnq$ffv.a (Loov;)Loov;
      // 6b: athrow
      // 6c: bipush -1
      // 6d: ireturn
      // 6e: aload 0
      // 6f: getfield rnq$ffv.rfe Lsla;
      // 72: invokevirtual sla.nfl ()Ljava/lang/String;
      // 75: aload 1
      // 76: getfield rnq$ffv.rfe Lsla;
      // 79: invokevirtual sla.nfl ()Ljava/lang/String;
      // 7c: invokevirtual java/lang/String.compareTo (Ljava/lang/String;)I
      // 7f: ireturn
      // 80: aload 0
      // 81: invokevirtual rnq$ffv.fsh ()I
      // 84: iload 2
      // 85: ifne 97
      // 88: aload 1
      // 89: invokevirtual rnq$ffv.fsh ()I
      // 8c: goto 93
      // 8f: invokestatic rnq$ffv.a (Loov;)Loov;
      // 92: athrow
      // 93: if_icmpge 9a
      // 96: bipush 1
      // 97: goto 9b
      // 9a: bipush -1
      // 9b: istore 3
      // 9c: iload 2
      // 9d: ifeq c3
      // a0: aload 0
      // a1: invokevirtual rnq$ffv.smw ()I
      // a4: iload 2
      // a5: ifne be
      // a8: goto af
      // ab: invokestatic rnq$ffv.a (Loov;)Loov;
      // ae: athrow
      // af: aload 1
      // b0: invokevirtual rnq$ffv.smw ()I
      // b3: goto ba
      // b6: invokestatic rnq$ffv.a (Loov;)Loov;
      // b9: athrow
      // ba: if_icmpge c1
      // bd: bipush 1
      // be: goto c2
      // c1: bipush -1
      // c2: istore 3
      // c3: iload 3
      // c4: ireturn
   }

   @Override
   public int compareTo(Object var1) {
      return this.cd9((rnq$ffv)var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(5963946919029584045L, 8398534331172526338L, MethodHandles.lookup().lookupClass()).a(85619533788712L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 138845372408842L;
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
      String var6 = "u°·ÁÌã@¤K\u0092ëµ°{f4\u001d\u0010\u0092\u008dQ\u0083!¾ô\u0097Ã¶T§O# j\u0002\u0002+È$G«8 Ù\u001dµa8ÜÌhø\u007f/)K¾cò\u0018Ý\u000e\u001c\u0086Â";
      int var8 = "u°·ÁÌã@¤K\u0092ëµ°{f4\u001d\u0010\u0092\u008dQ\u0083!¾ô\u0097Ã¶T§O# j\u0002\u0002+È$G«8 Ù\u001dµa8ÜÌhø\u007f/)K¾cò\u0018Ý\u000e\u001c\u0086Â"
         .length();
      char var5 = ' ';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5027;
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
            throw new RuntimeException("rnq$ffv", var10);
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
         throw new RuntimeException("rnq$ffv" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
