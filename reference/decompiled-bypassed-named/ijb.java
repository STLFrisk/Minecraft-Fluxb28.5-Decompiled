import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class ijb {
   public LinkedList attack = new LinkedList();
   public yve izc;
   private static final long a;
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public ijb() {
   }

   public ijb(int var1, int var2) {
      this.te7 = var1;
      this.vsd = var2;
   }

   public yve rbg() {
      return this.izc;
   }

   public LinkedList fd9() {
      return this.attack;
   }

   public void lbp(OpaquePredicate param1, Random param2, yve param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 4
      // 05: aload 0
      // 06: getfield ijb.attack Ljava/util/LinkedList;
      // 09: invokevirtual java/util/LinkedList.iterator ()Ljava/util/Iterator;
      // 0c: astore 5
      // 0e: aload 5
      // 10: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 15: ifeq 61
      // 18: aload 5
      // 1a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1f: checkcast xi1
      // 22: astore 6
      // 24: aload 6
      // 26: invokevirtual xi1.q1q ()Lyve;
      // 29: aload 3
      // 2a: invokevirtual yve.fsa (Lyve;)Z
      // 2d: iload 4
      // 2f: ifne 4b
      // 32: ifeq 5c
      // 35: goto 3c
      // 38: invokestatic ijb.a (Loov;)Loov;
      // 3b: athrow
      // 3c: aload 6
      // 3e: aload 1
      // 3f: aload 2
      // 40: aload 3
      // 41: invokevirtual xi1.d__ (Lt9d;Ljava/util/Random;Lyve;)Z
      // 44: goto 4b
      // 47: invokestatic ijb.a (Loov;)Loov;
      // 4a: athrow
      // 4b: ifne 5c
      // 4e: aload 5
      // 50: invokeinterface java/util/Iterator.remove ()V 1
      // 55: goto 5c
      // 58: invokestatic ijb.a (Loov;)Loov;
      // 5b: athrow
      // 5c: iload 4
      // 5e: ifeq 0e
      // 61: return
   }

   public void eok() {
      this.izc = yve.e31();
      int var10000 = OpaquePredicate.b();
      Iterator var2 = this.attack.iterator();
      int var1 = var10000;

      while (var2.hasNext()) {
         xi1 var3 = (xi1)var2.next();
         this.izc.d6z(var3.q1q());
         if (var1 == 0) {
            break;
         }
      }
   }

   public bdo _u5(int var1, int var2) {
      long var3 = a ^ 32269163574288L;
      bdo var6 = new bdo();
      int var10000 = OpaquePredicate.b();
      var6.rjq(a<"u">(4729, 4014458944899540654L ^ var3), v8a.im3(this));
      var6.iin(a<"u">(5692, 7008032826622829284L ^ var3), var1);
      int var5 = var10000;
      var6.iin(a<"u">(13517, 2492479968401702932L ^ var3), var2);
      var6.rzm(a<"u">(14095, 4324884871991215060L ^ var3), this.izc.ubs());
      qhg var7 = new qhg();
      Iterator var8 = this.attack.iterator();

      while (true) {
         if (var8.hasNext()) {
            xi1 var9 = (xi1)var8.next();

            try {
               var7.w2j(var9.ecx());
               if (var5 == 0) {
                  break;
               }

               if (var5 != 0) {
                  continue;
               }
            } catch (oov var10) {
               throw a(var10);
            }
         }

         var6.rzm(a<"u">(19194, 1207544186345700903L ^ var3), var7);
         this.qle(var6);
         break;
      }

      return var6;
   }

   public void qle(bdo var1) {
   }

   public void msj(OpaquePredicate param1, bdo param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic ijb.a J
      // 03: ldc2_w 50150182422936
      // 06: lxor
      // 07: lstore 3
      // 08: aload 0
      // 09: aload 2
      // 0a: sipush 1739
      // 0d: ldc2_w 2570671731457413017
      // 10: lload 3
      // 11: lxor
      // 12: invokedynamic u (IJ)Ljava/lang/String; bsm=ijb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17: nop
      // 18: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 1b: putfield ijb.te7 I
      // 1e: invokestatic OpaquePredicate.b ()I
      // 21: aload 0
      // 22: aload 2
      // 23: sipush 1569
      // 26: ldc2_w 3558312292200435575
      // 29: lload 3
      // 2a: lxor
      // 2b: invokedynamic u (IJ)Ljava/lang/String; bsm=ijb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30: nop
      // 31: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 34: putfield ijb.vsd I
      // 37: istore 5
      // 39: aload 2
      // 3a: sipush 23637
      // 3d: ldc2_w 1793558848821990657
      // 40: lload 3
      // 41: lxor
      // 42: invokedynamic u (IJ)Ljava/lang/String; bsm=ijb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: nop
      // 48: iload 5
      // 4a: ifeq 8d
      // 4d: invokevirtual bdo.dmw (Ljava/lang/String;)Z
      // 50: ifeq 7e
      // 53: goto 5a
      // 56: invokestatic ijb.a (Loov;)Loov;
      // 59: athrow
      // 5a: aload 0
      // 5b: new yve
      // 5e: dup
      // 5f: aload 2
      // 60: sipush 23637
      // 63: ldc2_w 1793558848821990657
      // 66: lload 3
      // 67: lxor
      // 68: invokedynamic u (IJ)Ljava/lang/String; bsm=ijb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d: nop
      // 6e: invokevirtual bdo.hkr (Ljava/lang/String;)[I
      // 71: invokespecial yve.<init> ([I)V
      // 74: putfield ijb.izc Lyve;
      // 77: goto 7e
      // 7a: invokestatic ijb.a (Loov;)Loov;
      // 7d: athrow
      // 7e: aload 2
      // 7f: sipush 22511
      // 82: ldc2_w 4416586069794463416
      // 85: lload 3
      // 86: lxor
      // 87: invokedynamic u (IJ)Ljava/lang/String; bsm=ijb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8c: nop
      // 8d: bipush 10
      // 8f: invokevirtual bdo.bzb (Ljava/lang/String;I)Lqhg;
      // 92: astore 6
      // 94: bipush 0
      // 95: istore 7
      // 97: iload 7
      // 99: aload 6
      // 9b: invokevirtual qhg.vek ()I
      // 9e: if_icmpge c8
      // a1: aload 0
      // a2: getfield ijb.attack Ljava/util/LinkedList;
      // a5: aload 6
      // a7: iload 7
      // a9: invokevirtual qhg.kd6 (I)Lbdo;
      // ac: aload 1
      // ad: invokestatic v8a.n2r (Lbdo;Lt9d;)Lxi1;
      // b0: invokevirtual java/util/LinkedList.add (Ljava/lang/Object;)Z
      // b3: pop
      // b4: iinc 7 1
      // b7: iload 5
      // b9: ifeq cd
      // bc: iload 5
      // be: ifne 97
      // c1: goto c8
      // c4: invokestatic ijb.a (Loov;)Loov;
      // c7: athrow
      // c8: aload 0
      // c9: aload 2
      // ca: invokevirtual ijb.fh4 (Lbdo;)V
      // cd: return
   }

   public void fh4(bdo var1) {
   }

   public void t53(OpaquePredicate var1, Random var2, int var3) {
      int var5 = var1._s3() - var3;
      int var10000 = OpaquePredicate.c();
      int var6 = this.izc.v8b() + 1;
      int var4 = var10000;

      int var10001;
      label31: {
         label30: {
            try {
               var10000 = var6;
               var10001 = var5;
               if (var4 != 0) {
                  break label31;
               }

               if (var6 >= var5) {
                  break label30;
               }
            } catch (oov var10) {
               throw a(var10);
            }

            var6 += var2.nextInt(var5 - var6);
         }

         var10000 = var6;
         var10001 = this.izc.ixv;
      }

      int var7 = var10000 - var10001;
      this.izc.gbw(0, var7, 0);

      for (xi1 var9 : this.attack) {
         var9.zqi(0, var7, 0);
         if (var4 != 0) {
            break;
         }
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void qi9(OpaquePredicate var1, Random var2, int var3, int var4) {
      int var6 = var4 - var3 + 1 - this.izc.v8b();
      int var10000 = OpaquePredicate.b();
      int var7 = 1;
      int var5 = var10000;

      label47: {
         label54: {
            label51: {
               try {
                  var10000 = var6;
                  if (var5 == 0) {
                     break label54;
                  }

                  if (var6 <= 1) {
                     break label51;
                  }
               } catch (oov var13) {
                  throw a(var13);
               }

               var7 = var3 + var2.nextInt(var6);

               try {
                  if (var5 != 0) {
                     break label47;
                  }
               } catch (oov var12) {
                  boolean var10001 = false;
                  throw a(var12);
               }
            }

            try {
               var10000 = var3;
            } catch (oov var11) {
               boolean var17 = false;
               throw a(var11);
            }
         }

         var7 = var10000;
      }

      int var8 = var7 - this.izc._3o;
      this.izc.gbw(0, var8, 0);

      for (xi1 var10 : this.attack) {
         var10.zqi(0, var8, 0);
         if (var5 == 0) {
            break;
         }
      }
   }

   public boolean z1p() {
      return true;
   }

   public boolean vud(h2f var1) {
      return true;
   }

   public void t4h(h2f var1) {
   }

   public int vdh() {
      return this.te7;
   }

   public int x65() {
      return this.vsd;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1215262653077435150L, 5206388394486563975L, MethodHandles.lookup().lookupClass()).a(40646973307036L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 57966480354850L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[9];
      int var7 = 0;
      String var6 = "\u00adZ\u009b\u008f\u0014d@ýPS\u0086©»\b\u0094`Ñ\u008e\u0019IcÄ*Ã\u0082vAJ]\u0004#[\u0010åÉøy\u0017&¸|\u00adÝ\u009cF÷Fñ8 ï\u008b%\u008fó¾}(Ô\u001dmº\u0081S£Rz\u0012\b2\u0089b\u0002!ò\u00903Y°F9\u0015\u0010÷|Ã~Vøís1×\u0003Mb÷\u009b·\u0010-\u0015Ô\u0089\u000f\u0007Øð*]H\u001a\n¥p\u009c\u0010½®ÁUÈ8M©ûÜWõ$ðrò\u0010\\\u008e\u0015Å\u0084`&\\ª\u0006\u0082êÚ\u0090,}";
      int var8 = "\u00adZ\u009b\u008f\u0014d@ýPS\u0086©»\b\u0094`Ñ\u008e\u0019IcÄ*Ã\u0082vAJ]\u0004#[\u0010åÉøy\u0017&¸|\u00adÝ\u009cF÷Fñ8 ï\u008b%\u008fó¾}(Ô\u001dmº\u0081S£Rz\u0012\b2\u0089b\u0002!ò\u00903Y°F9\u0015\u0010÷|Ã~Vøís1×\u0003Mb÷\u009b·\u0010-\u0015Ô\u0089\u000f\u0007Øð*]H\u001a\n¥p\u009c\u0010½®ÁUÈ8M©ûÜWõ$ðrò\u0010\\\u008e\u0015Å\u0084`&\\ª\u0006\u0082êÚ\u0090,}"
         .length();
      char var5 = ' ';
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
                     c = var9;
                     d = new String[9];
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

                  var6 = "¿èµ\u0097\u009ft\u0016'§\u0095µ_W\u0013UF\u0010\u0011\u0093Sò¦\u008bËN\u007fÌy=O÷\u0096\u0080";
                  var8 = "¿èµ\u0097\u009ft\u0016'§\u0095µ_W\u0013UF\u0010\u0011\u0093Sò¦\u008bËN\u007fÌy=O÷\u0096\u0080".length();
                  var5 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 10086;
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
            throw new RuntimeException("ijb", var10);
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
         throw new RuntimeException("ijb" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
