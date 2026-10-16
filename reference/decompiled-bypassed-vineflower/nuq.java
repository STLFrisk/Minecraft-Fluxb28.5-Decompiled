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

public class nuq extends xg0 {
   private static final long b;
   private static final String[] h;
   private static final String[] i;
   private static final Map m = new HashMap(13);

   public nuq(t9d var1) {
      super(var1);
   }

   public nuq(t9d var1, g_3 var2, int var3) {
      this(var1, var2, new erg(xbr.ik6, 1, var3));
   }

   public nuq(t9d var1, g_3 var2, erg var3) {
      super(var1, var2);
      this.cg0 = var3;
   }

   public nuq(t9d var1, double var2, double var4, double var6, int var8) {
      this(var1, var2, var4, var6, new erg(xbr.ik6, 1, var8));
   }

   public nuq(t9d var1, double var2, double var4, double var6, erg var8) {
      super(var1, var2, var4, var6);
      this.cg0 = var8;
   }

   @Override
   public float _qq() {
      return 0.05F;
   }

   @Override
   public float t9b() {
      return 0.5F;
   }

   @Override
   public float ch3() {
      return -20.0F;
   }

   public void z7c(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield nuq.cg0 Lerg;
      // 08: iload 2
      // 09: ifeq 31
      // 0c: ifnonnull 2d
      // 0f: goto 16
      // 12: invokestatic nuq.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: new erg
      // 1a: dup
      // 1b: getstatic xbr.ik6 Ldgn;
      // 1e: bipush 1
      // 1f: bipush 0
      // 20: invokespecial erg.<init> (Lu7m;II)V
      // 23: putfield nuq.cg0 Lerg;
      // 26: goto 2d
      // 29: invokestatic nuq.a (Loov;)Loov;
      // 2c: athrow
      // 2d: aload 0
      // 2e: getfield nuq.cg0 Lerg;
      // 31: iload 1
      // 32: invokevirtual erg.awe (I)V
      // 35: return
   }

   public int i3f() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield nuq.cg0 Lerg;
      // 08: iload 1
      // 09: ifne 31
      // 0c: ifnonnull 2d
      // 0f: goto 16
      // 12: invokestatic nuq.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: new erg
      // 1a: dup
      // 1b: getstatic xbr.ik6 Ldgn;
      // 1e: bipush 1
      // 1f: bipush 0
      // 20: invokespecial erg.<init> (Lu7m;II)V
      // 23: putfield nuq.cg0 Lerg;
      // 26: goto 2d
      // 29: invokestatic nuq.a (Loov;)Loov;
      // 2c: athrow
      // 2d: aload 0
      // 2e: getfield nuq.cg0 Lerg;
      // 31: invokevirtual erg.j6_ ()I
      // 34: ireturn
   }

   @Override
   public void _7u(akm param1) {
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
      // 005: getfield nuq.oay Lt9d;
      // 008: getfield t9d.v0f Z
      // 00b: ifne 191
      // 00e: getstatic xbr.ik6 Ldgn;
      // 011: aload 0
      // 012: getfield nuq.cg0 Lerg;
      // 015: invokevirtual dgn.cf0 (Lerg;)Ljava/util/List;
      // 018: astore 3
      // 019: iload 2
      // 01a: ifne 18d
      // 01d: aload 3
      // 01e: ifnull 177
      // 021: goto 028
      // 024: invokestatic nuq.a (Loov;)Loov;
      // 027: athrow
      // 028: aload 3
      // 029: invokeinterface java/util/List.isEmpty ()Z 1
      // 02e: ifne 177
      // 031: goto 038
      // 034: invokestatic nuq.a (Loov;)Loov;
      // 037: athrow
      // 038: aload 0
      // 039: invokevirtual nuq.aaw ()Lnh4;
      // 03c: ldc2_w 4.0
      // 03f: ldc2_w 2.0
      // 042: ldc2_w 4.0
      // 045: invokevirtual nh4.c2h (DDD)Lnh4;
      // 048: astore 4
      // 04a: aload 0
      // 04b: getfield nuq.oay Lt9d;
      // 04e: ldc g_3
      // 050: nop
      // 051: aload 4
      // 053: invokevirtual t9d.m_z (Ljava/lang/Class;Lnh4;)Ljava/util/List;
      // 056: astore 5
      // 058: iload 2
      // 059: ifne 18d
      // 05c: aload 5
      // 05e: invokeinterface java/util/List.isEmpty ()Z 1
      // 063: ifne 177
      // 066: goto 06d
      // 069: invokestatic nuq.a (Loov;)Loov;
      // 06c: athrow
      // 06d: aload 5
      // 06f: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 074: astore 6
      // 076: aload 6
      // 078: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 07d: ifeq 177
      // 080: aload 6
      // 082: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 087: checkcast g_3
      // 08a: astore 7
      // 08c: aload 0
      // 08d: aload 7
      // 08f: invokevirtual nuq.wxg (Li2h;)D
      // 092: dstore 8
      // 094: iload 2
      // 095: ifne 18d
      // 098: dload 8
      // 09a: ldc2_w 16.0
      // 09d: iload 2
      // 09e: ifne 0c4
      // 0a1: goto 0a8
      // 0a4: invokestatic nuq.a (Loov;)Loov;
      // 0a7: athrow
      // 0a8: dcmpg
      // 0a9: ifge 173
      // 0ac: goto 0b3
      // 0af: invokestatic nuq.a (Loov;)Loov;
      // 0b2: athrow
      // 0b3: dconst_1
      // 0b4: dload 8
      // 0b6: invokestatic java/lang/Math.sqrt (D)D
      // 0b9: ldc2_w 4.0
      // 0bc: ddiv
      // 0bd: goto 0c4
      // 0c0: invokestatic nuq.a (Loov;)Loov;
      // 0c3: athrow
      // 0c4: dsub
      // 0c5: dstore 10
      // 0c7: aload 7
      // 0c9: aload 1
      // 0ca: getfield akm.sc8 Li2h;
      // 0cd: if_acmpne 0d3
      // 0d0: dconst_1
      // 0d1: dstore 10
      // 0d3: aload 3
      // 0d4: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0d9: astore 12
      // 0db: aload 12
      // 0dd: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0e2: ifeq 173
      // 0e5: aload 12
      // 0e7: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0ec: checkcast sdj
      // 0ef: astore 13
      // 0f1: aload 13
      // 0f3: invokevirtual sdj._na ()I
      // 0f6: istore 14
      // 0f8: getstatic mcs.ip9 [Lmcs;
      // 0fb: iload 14
      // 0fd: aaload
      // 0fe: invokevirtual mcs.jee ()Z
      // 101: iload 2
      // 102: ifne 07d
      // 105: iload 2
      // 106: ifne 14a
      // 109: ifeq 135
      // 10c: goto 113
      // 10f: invokestatic nuq.a (Loov;)Loov;
      // 112: athrow
      // 113: getstatic mcs.ip9 [Lmcs;
      // 116: iload 14
      // 118: aaload
      // 119: aload 0
      // 11a: aload 0
      // 11b: invokevirtual nuq.lmd ()Lg_3;
      // 11e: aload 7
      // 120: aload 13
      // 122: invokevirtual sdj.tus ()I
      // 125: dload 10
      // 127: invokevirtual mcs.let (Li2h;Li2h;Lg_3;ID)V
      // 12a: iload 2
      // 12b: ifeq 16f
      // 12e: goto 135
      // 131: invokestatic nuq.a (Loov;)Loov;
      // 134: athrow
      // 135: dload 10
      // 137: aload 13
      // 139: invokevirtual sdj.ltp ()I
      // 13c: i2d
      // 13d: dmul
      // 13e: ldc2_w 0.5
      // 141: dadd
      // 142: d2i
      // 143: goto 14a
      // 146: invokestatic nuq.a (Loov;)Loov;
      // 149: athrow
      // 14a: istore 15
      // 14c: iload 15
      // 14e: bipush 20
      // 150: if_icmple 16f
      // 153: aload 7
      // 155: new sdj
      // 158: dup
      // 159: iload 14
      // 15b: iload 15
      // 15d: aload 13
      // 15f: invokevirtual sdj.tus ()I
      // 162: invokespecial sdj.<init> (III)V
      // 165: invokevirtual g_3.gmn (Lsdj;)V
      // 168: goto 16f
      // 16b: invokestatic nuq.a (Loov;)Loov;
      // 16e: athrow
      // 16f: iload 2
      // 170: ifeq 0db
      // 173: iload 2
      // 174: ifeq 076
      // 177: aload 0
      // 178: getfield nuq.oay Lt9d;
      // 17b: sipush 2002
      // 17e: new mew
      // 181: dup
      // 182: aload 0
      // 183: invokespecial mew.<init> (Li2h;)V
      // 186: aload 0
      // 187: invokevirtual nuq.i3f ()I
      // 18a: invokevirtual t9d.qca (ILmew;I)V
      // 18d: aload 0
      // 18e: invokevirtual nuq._kl ()V
      // 191: return
   }

   @Override
   public void cjb(bdo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic nuq.b J
      // 03: ldc2_w 120424399509191
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.b ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: aload 1
      // 0f: iload 4
      // 11: ifeq 63
      // 14: invokespecial xg0.cjb (Lbdo;)V
      // 17: aload 1
      // 18: sipush 32084
      // 1b: ldc2_w 5702460695466019188
      // 1e: lload 2
      // 1f: lxor
      // 20: invokedynamic o (IJ)Ljava/lang/String; bsm=nuq.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: nop
      // 26: bipush 10
      // 28: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 2b: ifeq 5a
      // 2e: goto 35
      // 31: invokestatic nuq.a (Loov;)Loov;
      // 34: athrow
      // 35: aload 0
      // 36: aload 1
      // 37: sipush 6411
      // 3a: ldc2_w 2395345557923818794
      // 3d: lload 2
      // 3e: lxor
      // 3f: invokedynamic o (IJ)Ljava/lang/String; bsm=nuq.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: nop
      // 45: invokevirtual bdo.b__ (Ljava/lang/String;)Lbdo;
      // 48: invokestatic erg.qog (Lbdo;)Lerg;
      // 4b: putfield nuq.cg0 Lerg;
      // 4e: iload 4
      // 50: ifne 77
      // 53: goto 5a
      // 56: invokestatic nuq.a (Loov;)Loov;
      // 59: athrow
      // 5a: aload 0
      // 5b: aload 1
      // 5c: goto 63
      // 5f: invokestatic nuq.a (Loov;)Loov;
      // 62: athrow
      // 63: sipush 11252
      // 66: ldc2_w 4225971999853076438
      // 69: lload 2
      // 6a: lxor
      // 6b: invokedynamic o (IJ)Ljava/lang/String; bsm=nuq.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 70: nop
      // 71: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 74: invokevirtual nuq.z7c (I)V
      // 77: aload 0
      // 78: iload 4
      // 7a: ifeq 92
      // 7d: getfield nuq.cg0 Lerg;
      // 80: ifnonnull 95
      // 83: goto 8a
      // 86: invokestatic nuq.a (Loov;)Loov;
      // 89: athrow
      // 8a: aload 0
      // 8b: goto 92
      // 8e: invokestatic nuq.a (Loov;)Loov;
      // 91: athrow
      // 92: invokevirtual nuq._kl ()V
      // 95: return
   }

   @Override
   public void srs(bdo var1) {
      long var2 = b ^ 29859565894252L;

      try {
         super.srs(var1);
         if (this.cg0 != null) {
            var1.rzm(c<"o">(6411, 2395225291267277185L ^ var2), this.cg0.zy4(new bdo()));
         }
      } catch (oov var4) {
         throw a(var4);
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(5225287504207971154L, -7444319012311419474L, MethodHandles.lookup().lookupClass()).a(189845835642454L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 59396930867709L;
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
      String var6 = "9D&SL\u000fÔ$Ë!\u0088\u0013\u0092F~X\u0010IÁ¸'Î\u009d?¥ õ£Sã\u0011 c\u0018n2å\u0081Vv*vAÑ-\u0089ûm²b§ó\u0003G\u0014\u0015KE";
      int var8 = "9D&SL\u000fÔ$Ë!\u0088\u0013\u0092F~X\u0010IÁ¸'Î\u009d?¥ õ£Sã\u0011 c\u0018n2å\u0081Vv*vAÑ-\u0089ûm²b§ó\u0003G\u0014\u0015KE".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = c(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            h = var9;
            i = new String[3];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static oov a(oov var0) {
      return var0;
   }

   private static String c(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9447;
      if (i[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])m.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               m.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("nuq", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = h[var5].getBytes("ISO-8859-1");
         i[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return i[var5];
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
         throw new RuntimeException("nuq" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
