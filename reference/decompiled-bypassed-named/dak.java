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

public class dak {
   private static final Logger vlr;
   private List bhz = Lists.newArrayList();
   private List dan = Lists.newArrayList();
   private final uan jhw;
   private int adc;
   private int rii = 3;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public dak(uan var1) {
      this.jhw = var1;
   }

   public void tn8(int var1, cjm var2) {
      this.bhz.add(new dak$a7s(this, var1, var2));
   }

   public void hmq(cjm param1) {
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
      // 05: getfield dak.bhz Ljava/util/List;
      // 08: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0d: astore 3
      // 0e: aload 3
      // 0f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 14: ifeq 71
      // 17: aload 3
      // 18: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1d: checkcast dak$a7s
      // 20: astore 4
      // 22: aload 4
      // 24: getfield dak$a7s.rhd Lcjm;
      // 27: astore 5
      // 29: aload 5
      // 2b: aload 1
      // 2c: if_acmpne 6d
      // 2f: aload 0
      // 30: getfield dak.dan Ljava/util/List;
      // 33: aload 4
      // 35: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 3a: iload 2
      // 3b: ifne 66
      // 3e: goto 45
      // 41: invokestatic dak.a (Loov;)Loov;
      // 44: athrow
      // 45: ifeq 67
      // 48: goto 4f
      // 4b: invokestatic dak.a (Loov;)Loov;
      // 4e: athrow
      // 4f: aload 5
      // 51: invokevirtual cjm.zly ()V
      // 54: aload 0
      // 55: getfield dak.dan Ljava/util/List;
      // 58: aload 4
      // 5a: invokeinterface java/util/List.remove (Ljava/lang/Object;)Z 2
      // 5f: goto 66
      // 62: invokestatic dak.a (Loov;)Loov;
      // 65: athrow
      // 66: pop
      // 67: aload 3
      // 68: invokeinterface java/util/Iterator.remove ()V 1
      // 6d: iload 2
      // 6e: ifeq 0e
      // 71: return
   }

   public void eo0() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic dak.a J
      // 003: ldc2_w 132967517096390
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: getfield dak.jhw Luan;
      // 010: sipush 23119
      // 013: ldc2_w 71038453072931311
      // 016: lload 1
      // 017: lxor
      // 018: invokedynamic b (IJ)Ljava/lang/String; bsm=dak.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01d: nop
      // 01e: invokevirtual uan.qek (Ljava/lang/String;)V
      // 021: aload 0
      // 022: iload 3
      // 023: ifeq 138
      // 026: dup
      // 027: getfield dak.adc I
      // 02a: dup_x1
      // 02b: bipush 1
      // 02c: iadd
      // 02d: putfield dak.adc I
      // 030: aload 0
      // 031: getfield dak.rii I
      // 034: irem
      // 035: ifne 130
      // 038: goto 03f
      // 03b: invokestatic dak.a (Loov;)Loov;
      // 03e: athrow
      // 03f: aload 0
      // 040: getfield dak.bhz Ljava/util/List;
      // 043: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 048: astore 4
      // 04a: aload 4
      // 04c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 051: ifne 057
      // 054: goto 12c
      // 057: aload 4
      // 059: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 05e: checkcast dak$a7s
      // 061: astore 5
      // 063: aload 0
      // 064: getfield dak.dan Ljava/util/List;
      // 067: aload 5
      // 069: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 06e: istore 6
      // 070: iload 6
      // 072: iload 3
      // 073: ifeq 089
      // 076: ifne 083
      // 079: goto 080
      // 07c: invokestatic dak.a (Loov;)Loov;
      // 07f: athrow
      // 080: goto 0dc
      // 083: aload 0
      // 084: aload 5
      // 086: invokespecial dak.zpt (Ldak$a7s;)Z
      // 089: iload 3
      // 08a: ifeq 0cc
      // 08d: ifeq 0b2
      // 090: goto 097
      // 093: invokestatic dak.a (Loov;)Loov;
      // 096: athrow
      // 097: aload 0
      // 098: aload 5
      // 09a: invokespecial dak.tq7 (Ldak$a7s;)Z
      // 09d: iload 3
      // 09e: ifeq 0cc
      // 0a1: goto 0a8
      // 0a4: invokestatic dak.a (Loov;)Loov;
      // 0a7: athrow
      // 0a8: ifne 0d1
      // 0ab: goto 0b2
      // 0ae: invokestatic dak.a (Loov;)Loov;
      // 0b1: athrow
      // 0b2: aload 5
      // 0b4: getfield dak$a7s.rhd Lcjm;
      // 0b7: invokevirtual cjm.zly ()V
      // 0ba: aload 0
      // 0bb: getfield dak.dan Ljava/util/List;
      // 0be: aload 5
      // 0c0: invokeinterface java/util/List.remove (Ljava/lang/Object;)Z 2
      // 0c5: goto 0cc
      // 0c8: invokestatic dak.a (Loov;)Loov;
      // 0cb: athrow
      // 0cc: pop
      // 0cd: iload 3
      // 0ce: ifne 0dc
      // 0d1: iload 3
      // 0d2: ifne 04a
      // 0d5: goto 0dc
      // 0d8: invokestatic dak.a (Loov;)Loov;
      // 0db: athrow
      // 0dc: aload 0
      // 0dd: aload 5
      // 0df: invokespecial dak.zpt (Ldak$a7s;)Z
      // 0e2: iload 3
      // 0e3: ifeq 0ff
      // 0e6: ifeq 128
      // 0e9: goto 0f0
      // 0ec: invokestatic dak.a (Loov;)Loov;
      // 0ef: athrow
      // 0f0: aload 5
      // 0f2: getfield dak$a7s.rhd Lcjm;
      // 0f5: invokevirtual cjm.vle ()Z
      // 0f8: goto 0ff
      // 0fb: invokestatic dak.a (Loov;)Loov;
      // 0fe: athrow
      // 0ff: iload 3
      // 100: ifeq 127
      // 103: ifeq 128
      // 106: goto 10d
      // 109: invokestatic dak.a (Loov;)Loov;
      // 10c: athrow
      // 10d: aload 5
      // 10f: getfield dak$a7s.rhd Lcjm;
      // 112: invokevirtual cjm.mnp ()V
      // 115: aload 0
      // 116: getfield dak.dan Ljava/util/List;
      // 119: aload 5
      // 11b: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 120: goto 127
      // 123: invokestatic dak.a (Loov;)Loov;
      // 126: athrow
      // 127: pop
      // 128: iload 3
      // 129: ifne 04a
      // 12c: iload 3
      // 12d: ifne 191
      // 130: aload 0
      // 131: goto 138
      // 134: invokestatic dak.a (Loov;)Loov;
      // 137: athrow
      // 138: getfield dak.dan Ljava/util/List;
      // 13b: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 140: astore 4
      // 142: aload 4
      // 144: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 149: ifeq 191
      // 14c: aload 4
      // 14e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 153: checkcast dak$a7s
      // 156: astore 5
      // 158: iload 3
      // 159: ifeq 186
      // 15c: aload 0
      // 15d: aload 5
      // 15f: invokespecial dak.tq7 (Ldak$a7s;)Z
      // 162: iload 3
      // 163: ifeq 1bf
      // 166: goto 16d
      // 169: invokestatic dak.a (Loov;)Loov;
      // 16c: athrow
      // 16d: ifne 18d
      // 170: goto 177
      // 173: invokestatic dak.a (Loov;)Loov;
      // 176: athrow
      // 177: aload 5
      // 179: getfield dak$a7s.rhd Lcjm;
      // 17c: invokevirtual cjm.zly ()V
      // 17f: goto 186
      // 182: invokestatic dak.a (Loov;)Loov;
      // 185: athrow
      // 186: aload 4
      // 188: invokeinterface java/util/Iterator.remove ()V 1
      // 18d: iload 3
      // 18e: ifne 142
      // 191: aload 0
      // 192: getfield dak.jhw Luan;
      // 195: invokevirtual uan.uio ()V
      // 198: aload 0
      // 199: getfield dak.jhw Luan;
      // 19c: sipush 8652
      // 19f: ldc2_w 9119574529034932845
      // 1a2: lload 1
      // 1a3: lxor
      // 1a4: invokedynamic b (IJ)Ljava/lang/String; bsm=dak.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a9: nop
      // 1aa: invokevirtual uan.qek (Ljava/lang/String;)V
      // 1ad: aload 0
      // 1ae: getfield dak.dan Ljava/util/List;
      // 1b1: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 1b6: astore 4
      // 1b8: aload 4
      // 1ba: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1bf: ifeq 1e5
      // 1c2: aload 4
      // 1c4: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1c9: checkcast dak$a7s
      // 1cc: astore 5
      // 1ce: aload 5
      // 1d0: getfield dak$a7s.rhd Lcjm;
      // 1d3: invokevirtual cjm.iad ()V
      // 1d6: iload 3
      // 1d7: ifeq 1ec
      // 1da: iload 3
      // 1db: ifne 1b8
      // 1de: goto 1e5
      // 1e1: invokestatic dak.a (Loov;)Loov;
      // 1e4: athrow
      // 1e5: aload 0
      // 1e6: getfield dak.jhw Luan;
      // 1e9: invokevirtual uan.uio ()V
      // 1ec: return
   }

   private boolean tq7(dak$a7s var1) {
      return var1.rhd.wh3();
   }

   private boolean zpt(dak$a7s param1) {
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
      // 05: getfield dak.bhz Ljava/util/List;
      // 08: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0d: astore 3
      // 0e: aload 3
      // 0f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 14: ifeq cb
      // 17: aload 3
      // 18: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1d: checkcast dak$a7s
      // 20: astore 4
      // 22: aload 4
      // 24: iload 2
      // 25: ifne 3b
      // 28: aload 1
      // 29: if_acmpeq c7
      // 2c: goto 33
      // 2f: invokestatic dak.a (Loov;)Loov;
      // 32: athrow
      // 33: aload 1
      // 34: goto 3b
      // 37: invokestatic dak.a (Loov;)Loov;
      // 3a: athrow
      // 3b: getfield dak$a7s.pjj I
      // 3e: iload 2
      // 3f: ifne 97
      // 42: aload 4
      // 44: getfield dak$a7s.pjj I
      // 47: if_icmplt 8f
      // 4a: goto 51
      // 4d: invokestatic dak.a (Loov;)Loov;
      // 50: athrow
      // 51: aload 0
      // 52: aload 1
      // 53: aload 4
      // 55: invokespecial dak.b1n (Ldak$a7s;Ldak$a7s;)Z
      // 58: iload 2
      // 59: ifne 7f
      // 5c: goto 63
      // 5f: invokestatic dak.a (Loov;)Loov;
      // 62: athrow
      // 63: ifne c7
      // 66: goto 6d
      // 69: invokestatic dak.a (Loov;)Loov;
      // 6c: athrow
      // 6d: aload 0
      // 6e: getfield dak.dan Ljava/util/List;
      // 71: aload 4
      // 73: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 78: goto 7f
      // 7b: invokestatic dak.a (Loov;)Loov;
      // 7e: athrow
      // 7f: iload 2
      // 80: ifne 8e
      // 83: ifeq c7
      // 86: goto 8d
      // 89: invokestatic dak.a (Loov;)Loov;
      // 8c: athrow
      // 8d: bipush 0
      // 8e: ireturn
      // 8f: aload 4
      // 91: getfield dak$a7s.rhd Lcjm;
      // 94: invokevirtual cjm.d75 ()Z
      // 97: iload 2
      // 98: ifne b7
      // 9b: ifne c7
      // 9e: goto a5
      // a1: invokestatic dak.a (Loov;)Loov;
      // a4: athrow
      // a5: aload 0
      // a6: getfield dak.dan Ljava/util/List;
      // a9: aload 4
      // ab: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // b0: goto b7
      // b3: invokestatic dak.a (Loov;)Loov;
      // b6: athrow
      // b7: iload 2
      // b8: ifne c6
      // bb: ifeq c7
      // be: goto c5
      // c1: invokestatic dak.a (Loov;)Loov;
      // c4: athrow
      // c5: bipush 0
      // c6: ireturn
      // c7: iload 2
      // c8: ifeq 0e
      // cb: bipush 1
      // cc: ireturn
   }

   private boolean b1n(dak$a7s var1, dak$a7s var2) {
      int var3 = OpaquePredicate.b();

      try {
         int var10000 = var1.rhd.db5() & var2.rhd.db5();
         if (var3 == 0) {
            return (boolean)var10000;
         }

         if (var10000 == 0) {
            return (boolean)1;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      return (boolean)0;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7495326246608713748L, 5060965043441356833L, MethodHandles.lookup().lookupClass()).a(162411561693431L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 62287096012047L;
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
      String var6 = "\u001c\u009d\u0011PK\u000f\u008f\u007f\u000eæÆ\u0098%\u009dwi2\u0004M3\u0003(ÄØÝG\\\u0002å\u00ad`R\u0018²kÿø4oäù\t\u0081>Ný&\u001fÉEBsDj¡\u008bÂ";
      int var8 = "\u001c\u009d\u0011PK\u000f\u008f\u007f\u000eæÆ\u0098%\u009dwi2\u0004M3\u0003(ÄØÝG\\\u0002å\u00ad`R\u0018²kÿø4oäù\t\u0081>Ný&\u001fÉEBsDj¡\u008bÂ"
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
            vlr = LogManager.getLogger();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 17793;
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
            throw new RuntimeException("dak", var10);
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
         throw new RuntimeException("dak" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
