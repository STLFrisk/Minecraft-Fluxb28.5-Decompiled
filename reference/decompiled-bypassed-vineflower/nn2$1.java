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

public class nn2$1 extends Thread {
   public final nn2 zkf;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public nn2$1(nn2 var1) {
      this.zkf = var1;
   }

   @Override
   public void run() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic nn2$1.a J
      // 003: ldc2_w 46720830101266
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic t9d.b ()I
      // 00b: istore 3
      // 00c: getstatic qd_.oyx Ljava/util/ArrayList;
      // 00f: getstatic nn2.q92 Lqd_;
      // 012: invokevirtual qd_.mww ()I
      // 015: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 018: checkcast x1l
      // 01b: astore 4
      // 01d: aload 4
      // 01f: invokevirtual x1l.rii ()Ljava/lang/String;
      // 022: sipush 7024
      // 025: ldc2_w 4180332602717524423
      // 028: lload 1
      // 029: lxor
      // 02a: invokedynamic x (IJ)Ljava/lang/String; bsm=nn2$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02f: nop
      // 030: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 033: iload 3
      // 034: ifeq 0b0
      // 037: ifeq 0a0
      // 03a: goto 041
      // 03d: invokestatic nn2$1.a (Loov;)Loov;
      // 040: athrow
      // 041: invokestatic yxu.vtm ()Lyxu;
      // 044: getstatic iw2.ltn Liw2;
      // 047: invokevirtual yxu.wzp (Liw2;)V
      // 04a: aload 4
      // 04c: iload 3
      // 04d: ifeq 07e
      // 050: goto 057
      // 053: invokestatic nn2$1.a (Loov;)Loov;
      // 056: athrow
      // 057: invokevirtual x1l.rii ()Ljava/lang/String;
      // 05a: sipush 920
      // 05d: ldc2_w 4909178052713466156
      // 060: lload 1
      // 061: lxor
      // 062: invokedynamic x (IJ)Ljava/lang/String; bsm=nn2$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 067: nop
      // 068: invokestatic zfs.eoj (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 06b: ifnonnull 09f
      // 06e: goto 075
      // 071: invokestatic nn2$1.a (Loov;)Loov;
      // 074: athrow
      // 075: aload 4
      // 077: goto 07e
      // 07a: invokestatic nn2$1.a (Loov;)Loov;
      // 07d: athrow
      // 07e: aload 0
      // 07f: getfield nn2$1.zkf Lnn2;
      // 082: invokestatic nn2.ssg (Lnn2;)Lc05;
      // 085: invokevirtual c05.ee0 ()Lrh0;
      // 088: invokevirtual rh0.z2u ()Ljava/lang/String;
      // 08b: invokevirtual x1l.jcg (Ljava/lang/String;)V
      // 08e: aload 0
      // 08f: getfield nn2$1.zkf Lnn2;
      // 092: invokestatic nn2.d9q (Lnn2;)Lc05;
      // 095: aload 0
      // 096: getfield nn2$1.zkf Lnn2;
      // 099: invokestatic nn2.tt6 (Lnn2;)Lgbe;
      // 09c: invokevirtual c05.z2i (Lgbe;)V
      // 09f: return
      // 0a0: aload 4
      // 0a2: iload 3
      // 0a3: ifeq 0e7
      // 0a6: invokevirtual x1l.s2l ()Z
      // 0a9: goto 0b0
      // 0ac: invokestatic nn2$1.a (Loov;)Loov;
      // 0af: athrow
      // 0b0: ifeq 0de
      // 0b3: aload 4
      // 0b5: invokevirtual x1l.rii ()Ljava/lang/String;
      // 0b8: invokestatic zfs.cg7 (Ljava/lang/String;)V
      // 0bb: aload 0
      // 0bc: getfield nn2$1.zkf Lnn2;
      // 0bf: invokestatic nn2.a5a (Lnn2;)Lc05;
      // 0c2: new s9r
      // 0c5: dup
      // 0c6: aload 0
      // 0c7: getfield nn2$1.zkf Lnn2;
      // 0ca: invokestatic nn2.tt6 (Lnn2;)Lgbe;
      // 0cd: invokespecial s9r.<init> (Lgbe;)V
      // 0d0: invokevirtual c05.z2i (Lgbe;)V
      // 0d3: iload 3
      // 0d4: ifne 15d
      // 0d7: goto 0de
      // 0da: invokestatic nn2$1.a (Loov;)Loov;
      // 0dd: athrow
      // 0de: aload 4
      // 0e0: goto 0e7
      // 0e3: invokestatic nn2$1.a (Loov;)Loov;
      // 0e6: athrow
      // 0e7: invokevirtual x1l.rii ()Ljava/lang/String;
      // 0ea: aload 4
      // 0ec: invokevirtual x1l.g9o ()Ljava/lang/String;
      // 0ef: invokestatic zfs.eoj (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 0f2: astore 5
      // 0f4: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 0f7: new java/lang/StringBuilder
      // 0fa: dup
      // 0fb: invokespecial java/lang/StringBuilder.<init> ()V
      // 0fe: sipush 32113
      // 101: ldc2_w 5641030878115018692
      // 104: lload 1
      // 105: lxor
      // 106: invokedynamic x (IJ)Ljava/lang/String; bsm=nn2$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10b: nop
      // 10c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10f: aload 5
      // 111: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 114: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 117: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 11a: iload 3
      // 11b: ifeq 154
      // 11e: aload 5
      // 120: ifnonnull 15d
      // 123: goto 12a
      // 126: invokestatic nn2$1.a (Loov;)Loov;
      // 129: athrow
      // 12a: aload 0
      // 12b: getfield nn2$1.zkf Lnn2;
      // 12e: invokestatic nn2.q5t (Lnn2;)Lc05;
      // 131: aload 0
      // 132: getfield nn2$1.zkf Lnn2;
      // 135: invokestatic nn2.tt6 (Lnn2;)Lgbe;
      // 138: invokevirtual c05.z2i (Lgbe;)V
      // 13b: aload 4
      // 13d: aload 0
      // 13e: getfield nn2$1.zkf Lnn2;
      // 141: invokestatic nn2.nvi (Lnn2;)Lc05;
      // 144: invokevirtual c05.ee0 ()Lrh0;
      // 147: invokevirtual rh0.z2u ()Ljava/lang/String;
      // 14a: invokevirtual x1l.jcg (Ljava/lang/String;)V
      // 14d: goto 154
      // 150: invokestatic nn2$1.a (Loov;)Loov;
      // 153: athrow
      // 154: getstatic zwr.qkk Lzwr;
      // 157: invokevirtual zwr.up0 ()Lszk;
      // 15a: invokevirtual szk.p5g ()V
      // 15d: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(4488973858555003901L, 3349710976973291607L, MethodHandles.lookup().lookupClass()).a(152106253986952L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 2561249586328L;
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
      String var6 = "ÍU\u0010Ù©Wú;\u0080\u0015\u0018\u0018\u001b\u0092â²\u009aº|\u0001Ñ¦¿¦\u0017\n4#A\u0099\u008eØ µ\u008c%.\u0007\u001cB¡êU÷°Ô=\u0003ôÖ,\u008f-Næ=$\u00ad5\fáZ`Åá \u0095BÀj\u000b\u009e6\u0002\u009bâ(\u0086î\u0099s\u0080J>6¶ä\u0012\u0081?\u0001¹è\u0011ñ{\u000fü";
      int var8 = "ÍU\u0010Ù©Wú;\u0080\u0015\u0018\u0018\u001b\u0092â²\u009aº|\u0001Ñ¦¿¦\u0017\n4#A\u0099\u008eØ µ\u008c%.\u0007\u001cB¡êU÷°Ô=\u0003ôÖ,\u008f-Næ=$\u00ad5\fáZ`Åá \u0095BÀj\u000b\u009e6\u0002\u009bâ(\u0086î\u0099s\u0080J>6¶ä\u0012\u0081?\u0001¹è\u0011ñ{\u000fü"
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
            c = new String[3];
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31103;
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
            throw new RuntimeException("nn2$1", var10);
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
         throw new RuntimeException("nn2$1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
