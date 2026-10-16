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
import net.minecraft.tileentity.TileEntityEnderChest;

public class ctr extends goq {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public ctr() {
      long var1 = a ^ 36763142745619L;
      super(a<"z">(19797, 361693203665466044L ^ var1), false, 27);
   }

   public void rzk(TileEntityEnderChest var1) {
      this.qi4 = var1;
   }

   public void cj6(qhg param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic ctr.a J
      // 03: ldc2_w 83717699047210
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.c ()I
      // 0b: istore 4
      // 0d: bipush 0
      // 0e: istore 5
      // 10: iload 5
      // 12: aload 0
      // 13: invokevirtual ctr.opt ()I
      // 16: if_icmpge 37
      // 19: aload 0
      // 1a: iload 5
      // 1c: aconst_null
      // 1d: checkcast erg
      // 20: invokevirtual ctr.cxl (ILerg;)V
      // 23: iinc 5 1
      // 26: iload 4
      // 28: ifne 3a
      // 2b: iload 4
      // 2d: ifeq 10
      // 30: goto 37
      // 33: invokestatic ctr.a (Loov;)Loov;
      // 36: athrow
      // 37: bipush 0
      // 38: istore 5
      // 3a: iload 5
      // 3c: aload 1
      // 3d: invokevirtual qhg.vek ()I
      // 40: if_icmpge 9f
      // 43: aload 1
      // 44: iload 5
      // 46: invokevirtual qhg.kd6 (I)Lbdo;
      // 49: astore 6
      // 4b: aload 6
      // 4d: sipush 19776
      // 50: ldc2_w 3415474225414329235
      // 53: lload 2
      // 54: lxor
      // 55: invokedynamic z (IJ)Ljava/lang/String; bsm=ctr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a: nop
      // 5b: invokevirtual bdo.r_t (Ljava/lang/String;)B
      // 5e: sipush 255
      // 61: iand
      // 62: istore 7
      // 64: iload 4
      // 66: ifne 9a
      // 69: iload 7
      // 6b: iflt 97
      // 6e: goto 75
      // 71: invokestatic ctr.a (Loov;)Loov;
      // 74: athrow
      // 75: iload 7
      // 77: aload 0
      // 78: invokevirtual ctr.opt ()I
      // 7b: if_icmpge 97
      // 7e: goto 85
      // 81: invokestatic ctr.a (Loov;)Loov;
      // 84: athrow
      // 85: aload 0
      // 86: iload 7
      // 88: aload 6
      // 8a: invokestatic erg.qog (Lbdo;)Lerg;
      // 8d: invokevirtual ctr.cxl (ILerg;)V
      // 90: goto 97
      // 93: invokestatic ctr.a (Loov;)Loov;
      // 96: athrow
      // 97: iinc 5 1
      // 9a: iload 4
      // 9c: ifeq 3a
      // 9f: return
   }

   public qhg _1u() {
      long var1 = a ^ 114860724074499L;
      qhg var4 = new qhg();
      int var10000 = t9d.c();
      int var5 = 0;
      int var3 = var10000;

      while (var5 < this.opt()) {
         erg var6 = this.ibn(var5);

         label28: {
            label27: {
               try {
                  if (var3 != 0) {
                     break label28;
                  }

                  if (var6 == null) {
                     break label27;
                  }
               } catch (oov var8) {
                  throw a(var8);
               }

               bdo var7 = new bdo();
               var7.atr(a<"z">(21586, 2803902133757672874L ^ var1), (byte)var5);
               var6.zy4(var7);
               var4.w2j(var7);
            }

            var5++;
         }

         if (var3 != 0) {
            break;
         }
      }

      return var4;
   }

   @Override
   public boolean dnv(ha9 param1) {
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
      // 05: iload 2
      // 06: ifeq 3c
      // 09: getfield ctr.qi4 Lnet/minecraft/tileentity/TileEntityEnderChest;
      // 0c: ifnull 3b
      // 0f: goto 16
      // 12: invokestatic ctr.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: iload 2
      // 18: ifeq 3c
      // 1b: goto 22
      // 1e: invokestatic ctr.a (Loov;)Loov;
      // 21: athrow
      // 22: getfield ctr.qi4 Lnet/minecraft/tileentity/TileEntityEnderChest;
      // 25: aload 1
      // 26: invokevirtual net/minecraft/tileentity/TileEntityEnderChest.cue (Lha9;)Z
      // 29: ifne 3b
      // 2c: goto 33
      // 2f: invokestatic ctr.a (Loov;)Loov;
      // 32: athrow
      // 33: bipush 0
      // 34: goto 40
      // 37: invokestatic ctr.a (Loov;)Loov;
      // 3a: athrow
      // 3b: aload 0
      // 3c: aload 1
      // 3d: invokespecial goq.dnv (Lha9;)Z
      // 40: ireturn
   }

   @Override
   public void dk0(ha9 param1) {
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
      // 06: ifne 25
      // 09: getfield ctr.qi4 Lnet/minecraft/tileentity/TileEntityEnderChest;
      // 0c: ifnull 24
      // 0f: goto 16
      // 12: invokestatic ctr.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield ctr.qi4 Lnet/minecraft/tileentity/TileEntityEnderChest;
      // 1a: invokevirtual net/minecraft/tileentity/TileEntityEnderChest.o7o ()V
      // 1d: goto 24
      // 20: invokestatic ctr.a (Loov;)Loov;
      // 23: athrow
      // 24: aload 0
      // 25: aload 1
      // 26: invokespecial goq.dk0 (Lha9;)V
      // 29: return
   }

   @Override
   public void vhz(ha9 param1) {
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
      // 05: iload 2
      // 06: ifeq 2a
      // 09: getfield ctr.qi4 Lnet/minecraft/tileentity/TileEntityEnderChest;
      // 0c: ifnull 24
      // 0f: goto 16
      // 12: invokestatic ctr.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield ctr.qi4 Lnet/minecraft/tileentity/TileEntityEnderChest;
      // 1a: invokevirtual net/minecraft/tileentity/TileEntityEnderChest.cb_ ()V
      // 1d: goto 24
      // 20: invokestatic ctr.a (Loov;)Loov;
      // 23: athrow
      // 24: aload 0
      // 25: aload 1
      // 26: invokespecial goq.vhz (Lha9;)V
      // 29: aload 0
      // 2a: aconst_null
      // 2b: putfield ctr.qi4 Lnet/minecraft/tileentity/TileEntityEnderChest;
      // 2e: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(3152990950573582589L, -6136988611277512803L, MethodHandles.lookup().lookupClass()).a(113385553199964L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 71627422162197L;
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
      String var6 = "cÕÔ\u008fd¬-]*×³Z\u0090\u001f?â([îõ4û\u000bA\u0095§>\u009f\u0085µ\u0012Ì*§¨!\ra\u008få1-ý\u0093,+\u001f\u009f\u008abUÏ\\\u0094ñ\u0080Á\u0010R\r×P®\u000bt·ÄW»Mä\n\u0081\u0088";
      int var8 = "cÕÔ\u008fd¬-]*×³Z\u0090\u001f?â([îõ4û\u000bA\u0095§>\u009f\u0085µ\u0012Ì*§¨!\ra\u008få1-ý\u0093,+\u001f\u009f\u008abUÏ\\\u0094ñ\u0080Á\u0010R\r×P®\u000bt·ÄW»Mä\n\u0081\u0088"
         .length();
      char var5 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30118;
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
            throw new RuntimeException("ctr", var10);
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
         throw new RuntimeException("ctr" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
