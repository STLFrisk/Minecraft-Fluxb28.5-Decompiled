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

public class lx1$1 extends Thread {
   public final lx1 xpn;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public lx1$1(lx1 var1) {
      this.xpn = var1;
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
      // 000: getstatic lx1$1.a J
      // 003: ldc2_w 14887680193525
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic t9d.b ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: getfield lx1$1.xpn Llx1;
      // 010: getfield lx1.ezi Loon;
      // 013: invokevirtual oon.eec ()Ljava/lang/String;
      // 016: sipush 19255
      // 019: ldc2_w 6086530144876663343
      // 01c: lload 1
      // 01d: lxor
      // 01e: invokedynamic m (IJ)Ljava/lang/String; bsm=lx1$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 023: nop
      // 024: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 027: iload 3
      // 028: ifeq 12c
      // 02b: ifeq 110
      // 02e: goto 035
      // 031: invokestatic lx1$1.a (Loov;)Loov;
      // 034: athrow
      // 035: invokestatic yxu.vtm ()Lyxu;
      // 038: getstatic iw2.ltn Liw2;
      // 03b: invokevirtual yxu.wzp (Liw2;)V
      // 03e: aload 0
      // 03f: getfield lx1$1.xpn Llx1;
      // 042: aload 0
      // 043: getfield lx1$1.xpn Llx1;
      // 046: getfield lx1.ezi Loon;
      // 049: invokevirtual oon.eec ()Ljava/lang/String;
      // 04c: ldc ":"
      // 04e: nop
      // 04f: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
      // 052: bipush 0
      // 053: aaload
      // 054: ldc "L"
      // 056: nop
      // 057: invokestatic zfs.eoj (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 05a: putfield lx1.cqv Ljava/lang/String;
      // 05d: aload 0
      // 05e: getfield lx1$1.xpn Llx1;
      // 061: iload 3
      // 062: ifeq 0e7
      // 065: goto 06c
      // 068: invokestatic lx1$1.a (Loov;)Loov;
      // 06b: athrow
      // 06c: getfield lx1.cqv Ljava/lang/String;
      // 06f: ifnonnull 0dc
      // 072: goto 079
      // 075: invokestatic lx1$1.a (Loov;)Loov;
      // 078: athrow
      // 079: getstatic qd_.oyx Ljava/util/ArrayList;
      // 07c: bipush 0
      // 07d: new x1l
      // 080: dup
      // 081: aload 0
      // 082: getfield lx1$1.xpn Llx1;
      // 085: getfield lx1.ezi Loon;
      // 088: invokevirtual oon.eec ()Ljava/lang/String;
      // 08b: ldc ":"
      // 08d: nop
      // 08e: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
      // 091: bipush 0
      // 092: aaload
      // 093: sipush 14757
      // 096: ldc2_w 5649554833186480316
      // 099: lload 1
      // 09a: lxor
      // 09b: invokedynamic m (IJ)Ljava/lang/String; bsm=lx1$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a0: nop
      // 0a1: aload 0
      // 0a2: getfield lx1$1.xpn Llx1;
      // 0a5: invokestatic lx1.j48 (Llx1;)Lc05;
      // 0a8: invokevirtual c05.ee0 ()Lrh0;
      // 0ab: invokevirtual rh0.z2u ()Ljava/lang/String;
      // 0ae: invokespecial x1l.<init> (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
      // 0b1: invokevirtual java/util/ArrayList.add (ILjava/lang/Object;)V
      // 0b4: invokestatic qd_.mpj ()V
      // 0b7: getstatic zwr.qkk Lzwr;
      // 0ba: invokevirtual zwr.up0 ()Lszk;
      // 0bd: invokevirtual szk.p5g ()V
      // 0c0: aload 0
      // 0c1: getfield lx1$1.xpn Llx1;
      // 0c4: invokestatic lx1.cr5 (Llx1;)Lc05;
      // 0c7: aload 0
      // 0c8: getfield lx1$1.xpn Llx1;
      // 0cb: getfield lx1.bnx Lgbe;
      // 0ce: invokevirtual c05.z2i (Lgbe;)V
      // 0d1: iload 3
      // 0d2: ifne 10f
      // 0d5: goto 0dc
      // 0d8: invokestatic lx1$1.a (Loov;)Loov;
      // 0db: athrow
      // 0dc: aload 0
      // 0dd: getfield lx1$1.xpn Llx1;
      // 0e0: goto 0e7
      // 0e3: invokestatic lx1$1.a (Loov;)Loov;
      // 0e6: athrow
      // 0e7: new java/lang/StringBuilder
      // 0ea: dup
      // 0eb: invokespecial java/lang/StringBuilder.<init> ()V
      // 0ee: aload 0
      // 0ef: getfield lx1$1.xpn Llx1;
      // 0f2: getfield lx1.cqv Ljava/lang/String;
      // 0f5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f8: sipush 12976
      // 0fb: ldc2_w 6533802168167197610
      // 0fe: lload 1
      // 0ff: lxor
      // 100: invokedynamic m (IJ)Ljava/lang/String; bsm=lx1$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: nop
      // 106: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 109: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 10c: putfield lx1.cqv Ljava/lang/String;
      // 10f: return
      // 110: aload 0
      // 111: getfield lx1$1.xpn Llx1;
      // 114: getfield lx1.ezi Loon;
      // 117: invokevirtual oon.eec ()Ljava/lang/String;
      // 11a: ldc ":"
      // 11c: nop
      // 11d: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
      // 120: iload 3
      // 121: ifeq 17d
      // 124: arraylength
      // 125: goto 12c
      // 128: invokestatic lx1$1.a (Loov;)Loov;
      // 12b: athrow
      // 12c: bipush 1
      // 12d: if_icmpgt 15d
      // 130: getstatic qd_.oyx Ljava/util/ArrayList;
      // 133: bipush 0
      // 134: new x1l
      // 137: dup
      // 138: aload 0
      // 139: getfield lx1$1.xpn Llx1;
      // 13c: getfield lx1.ezi Loon;
      // 13f: invokevirtual oon.eec ()Ljava/lang/String;
      // 142: aconst_null
      // 143: aconst_null
      // 144: invokespecial x1l.<init> (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
      // 147: invokevirtual java/util/ArrayList.add (ILjava/lang/Object;)V
      // 14a: aload 0
      // 14b: getfield lx1$1.xpn Llx1;
      // 14e: aconst_null
      // 14f: putfield lx1.cqv Ljava/lang/String;
      // 152: iload 3
      // 153: ifne 1de
      // 156: goto 15d
      // 159: invokestatic lx1$1.a (Loov;)Loov;
      // 15c: athrow
      // 15d: invokestatic yxu.vtm ()Lyxu;
      // 160: getstatic iw2.ot_ Liw2;
      // 163: invokevirtual yxu.wzp (Liw2;)V
      // 166: aload 0
      // 167: getfield lx1$1.xpn Llx1;
      // 16a: getfield lx1.ezi Loon;
      // 16d: invokevirtual oon.eec ()Ljava/lang/String;
      // 170: ldc ":"
      // 172: nop
      // 173: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
      // 176: goto 17d
      // 179: invokestatic lx1$1.a (Loov;)Loov;
      // 17c: athrow
      // 17d: bipush 0
      // 17e: aaload
      // 17f: astore 4
      // 181: aload 0
      // 182: getfield lx1$1.xpn Llx1;
      // 185: getfield lx1.ezi Loon;
      // 188: invokevirtual oon.eec ()Ljava/lang/String;
      // 18b: ldc ":"
      // 18d: nop
      // 18e: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
      // 191: bipush 1
      // 192: aaload
      // 193: astore 5
      // 195: aload 0
      // 196: getfield lx1$1.xpn Llx1;
      // 199: aload 4
      // 19b: aload 5
      // 19d: invokestatic zfs.eoj (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 1a0: putfield lx1.cqv Ljava/lang/String;
      // 1a3: aload 0
      // 1a4: getfield lx1$1.xpn Llx1;
      // 1a7: getfield lx1.cqv Ljava/lang/String;
      // 1aa: iload 3
      // 1ab: ifeq 1f0
      // 1ae: ifnonnull 1de
      // 1b1: goto 1b8
      // 1b4: invokestatic lx1$1.a (Loov;)Loov;
      // 1b7: athrow
      // 1b8: getstatic qd_.oyx Ljava/util/ArrayList;
      // 1bb: bipush 0
      // 1bc: new x1l
      // 1bf: dup
      // 1c0: aload 4
      // 1c2: aload 5
      // 1c4: aload 0
      // 1c5: getfield lx1$1.xpn Llx1;
      // 1c8: invokestatic lx1.sgy (Llx1;)Lc05;
      // 1cb: invokevirtual c05.ee0 ()Lrh0;
      // 1ce: invokevirtual rh0.z2u ()Ljava/lang/String;
      // 1d1: invokespecial x1l.<init> (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
      // 1d4: invokevirtual java/util/ArrayList.add (ILjava/lang/Object;)V
      // 1d7: goto 1de
      // 1da: invokestatic lx1$1.a (Loov;)Loov;
      // 1dd: athrow
      // 1de: aload 0
      // 1df: getfield lx1$1.xpn Llx1;
      // 1e2: iload 3
      // 1e3: ifeq 20a
      // 1e6: getfield lx1.cqv Ljava/lang/String;
      // 1e9: goto 1f0
      // 1ec: invokestatic lx1$1.a (Loov;)Loov;
      // 1ef: athrow
      // 1f0: ifnonnull 217
      // 1f3: invokestatic qd_.mpj ()V
      // 1f6: getstatic zwr.qkk Lzwr;
      // 1f9: invokevirtual zwr.up0 ()Lszk;
      // 1fc: invokevirtual szk.p5g ()V
      // 1ff: aload 0
      // 200: getfield lx1$1.xpn Llx1;
      // 203: goto 20a
      // 206: invokestatic lx1$1.a (Loov;)Loov;
      // 209: athrow
      // 20a: invokestatic lx1.i5i (Llx1;)Lc05;
      // 20d: aload 0
      // 20e: getfield lx1$1.xpn Llx1;
      // 211: getfield lx1.bnx Lgbe;
      // 214: invokevirtual c05.z2i (Lgbe;)V
      // 217: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1020489559434210847L, 837813474722253811L, MethodHandles.lookup().lookupClass()).a(44897385249737L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 114317687272394L;
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
      String var6 = "£g*\t(Ð\u0002· \u008c\u00ad\u0015';\u0012A%@¤a\u009ah\u0005\u00913\u0004Íåx+ö¼ 4J÷0R®MH`\u0004\tú\u0083\u0015¢£Æ9\u0003ÐýñYlÊB\u0007\u0086JjÝ\u001c0\"\u0093\u0012¶+\u0000,í\u001c\u009aÂ\u0016\u009fA\u0012\u0016 \u0086ÛI'¨\u009b×\u0017ÛAóJ\u0083\u0087\u0011\u0019\u0080\u0082ìØ)£eý³¤Ï\u008b¤5\u001c";
      int var8 = "£g*\t(Ð\u0002· \u008c\u00ad\u0015';\u0012A%@¤a\u009ah\u0005\u00913\u0004Íåx+ö¼ 4J÷0R®MH`\u0004\tú\u0083\u0015¢£Æ9\u0003ÐýñYlÊB\u0007\u0086JjÝ\u001c0\"\u0093\u0012¶+\u0000,í\u001c\u009aÂ\u0016\u009fA\u0012\u0016 \u0086ÛI'¨\u009b×\u0017ÛAóJ\u0083\u0087\u0011\u0019\u0080\u0082ìØ)£eý³¤Ï\u008b¤5\u001c"
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 624;
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
            throw new RuntimeException("lx1$1", var10);
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
         throw new RuntimeException("lx1$1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
