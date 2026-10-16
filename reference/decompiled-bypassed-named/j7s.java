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

public class j7s extends Module {
   public static BooleanSetting Session;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public j7s() {
      long var1 = a ^ 7069108465583L;
      super(b<"d">(8247, 4511430547848134280L ^ var1), _aj._lm, false, new SubEngine[0]);
   }

   @EventHandler
   public void ao5(PlayerUpdateEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic j7s.a J
      // 003: ldc2_w 88414042400527
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 4
      // 00d: aload 0
      // 00e: pop
      // 00f: getstatic j7s.ek1 Lc05;
      // 012: getfield Minecraft.vg8 Ll86;
      // 015: getfield EntityPlayerSP.g9g Lboa;
      // 018: getfield boa._mw F
      // 01b: fconst_1
      // 01c: fcmpl
      // 01d: iload 4
      // 01f: ifne 052
      // 022: ifeq 04c
      // 025: goto 02c
      // 028: invokestatic j7s.a (Loov;)Loov;
      // 02b: athrow
      // 02c: getstatic j7s.prq Lcn7;
      // 02f: invokevirtual BooleanSetting.getValue ()Ljava/lang/Boolean;
      // 032: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 035: iload 4
      // 037: ifne 052
      // 03a: goto 041
      // 03d: invokestatic j7s.a (Loov;)Loov;
      // 040: athrow
      // 041: ifne 04c
      // 044: goto 04b
      // 047: invokestatic j7s.a (Loov;)Loov;
      // 04a: athrow
      // 04b: return
      // 04c: getstatic ModuleRegistry.thz L_lk;
      // 04f: invokevirtual Scaffold.isEnabled ()Z
      // 052: iload 4
      // 054: ifne 0a2
      // 057: ifeq 092
      // 05a: goto 061
      // 05d: invokestatic j7s.a (Loov;)Loov;
      // 060: athrow
      // 061: getstatic ModuleRegistry.thz L_lk;
      // 064: invokevirtual Scaffold.smu ()Lc_3;
      // 067: invokevirtual ModeSetting.getValue ()Ljava/lang/String;
      // 06a: sipush 13554
      // 06d: ldc2_w 4717734378895811310
      // 070: lload 2
      // 071: lxor
      // 072: invokedynamic d (IJ)Ljava/lang/String; bsm=j7s.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: nop
      // 078: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 07b: iload 4
      // 07d: ifne 0a2
      // 080: goto 087
      // 083: invokestatic j7s.a (Loov;)Loov;
      // 086: athrow
      // 087: ifeq 092
      // 08a: goto 091
      // 08d: invokestatic j7s.a (Loov;)Loov;
      // 090: athrow
      // 091: return
      // 092: aload 0
      // 093: pop
      // 094: getstatic j7s.ek1 Lc05;
      // 097: getfield Minecraft.vg8 Ll86;
      // 09a: getfield EntityPlayerSP.g9g Lboa;
      // 09d: getfield boa._mw F
      // 0a0: fconst_0
      // 0a1: fcmpl
      // 0a2: iload 4
      // 0a4: ifne 0ec
      // 0a7: ifne 0d7
      // 0aa: goto 0b1
      // 0ad: invokestatic j7s.a (Loov;)Loov;
      // 0b0: athrow
      // 0b1: aload 0
      // 0b2: pop
      // 0b3: getstatic j7s.ek1 Lc05;
      // 0b6: getfield Minecraft.vg8 Ll86;
      // 0b9: getfield EntityPlayerSP.g9g Lboa;
      // 0bc: getfield boa.lrp F
      // 0bf: fconst_0
      // 0c0: fcmpl
      // 0c1: iload 4
      // 0c3: ifne 0ec
      // 0c6: goto 0cd
      // 0c9: invokestatic j7s.a (Loov;)Loov;
      // 0cc: athrow
      // 0cd: ifeq 131
      // 0d0: goto 0d7
      // 0d3: invokestatic j7s.a (Loov;)Loov;
      // 0d6: athrow
      // 0d7: aload 0
      // 0d8: pop
      // 0d9: getstatic j7s.ek1 Lc05;
      // 0dc: getfield Minecraft.vg8 Ll86;
      // 0df: invokevirtual EntityPlayerSP.wvq ()Lwkk;
      // 0e2: invokevirtual wkk.f1i ()I
      // 0e5: goto 0ec
      // 0e8: invokestatic j7s.a (Loov;)Loov;
      // 0eb: athrow
      // 0ec: iload 4
      // 0ee: ifne 11b
      // 0f1: bipush 6
      // 0f3: if_icmple 131
      // 0f6: goto 0fd
      // 0f9: invokestatic j7s.a (Loov;)Loov;
      // 0fc: athrow
      // 0fd: aload 0
      // 0fe: pop
      // 0ff: getstatic j7s.ek1 Lc05;
      // 102: getfield Minecraft.vg8 Ll86;
      // 105: iload 4
      // 107: ifne 12d
      // 10a: goto 111
      // 10d: invokestatic j7s.a (Loov;)Loov;
      // 110: athrow
      // 111: invokevirtual EntityPlayerSP.hzv ()Z
      // 114: goto 11b
      // 117: invokestatic j7s.a (Loov;)Loov;
      // 11a: athrow
      // 11b: ifne 131
      // 11e: aload 0
      // 11f: pop
      // 120: getstatic j7s.ek1 Lc05;
      // 123: getfield Minecraft.vg8 Ll86;
      // 126: goto 12d
      // 129: invokestatic j7s.a (Loov;)Loov;
      // 12c: athrow
      // 12d: bipush 1
      // 12e: invokevirtual EntityPlayerSP.fqc (Z)V
      // 131: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(2627226421870611401L, -7542237607643838074L, MethodHandles.lookup().lookupClass()).a(244531559033631L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 75577390908537L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[4];
      int var5 = 0;
      String var4 = "Þä½k\u0085?\u0095°uñË\u009b(Ð*_\u0010©«.\u000b§sX\u0015Î5å\u008aF][ß";
      int var6 = "Þä½k\u0085?\u0095°uñË\u009b(Ð*_\u0010©«.\u000b§sX\u0015Î5å\u008aF][ß".length();
      char var3 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     f = var7;
                     g = new String[4];
                     Session = new BooleanSetting(b<"d">(15681, 6620599782042716201L ^ var9), b<"d">(22219, 4367150464756294560L ^ var9), true);
                     return;
                  }

                  var3 = var4.charAt(var12);
                  break;
               default:
                  var7[var5++] = var20;
                  if ((var12 += var3) < var6) {
                     var3 = var4.charAt(var12);
                     continue label27;
                  }

                  var4 = "·mê5dn³~Ó\u008d5\u0085G\u0001ö\u001biL\u00ad\u00893Ï\u0099ú¯\u0012 ;Ð\u0017[Ì\u00107\u00adRuJ»\u0016Eò\u009a\u009f\\Ë\u0013þL";
                  var6 = "·mê5dn³~Ó\u008d5\u0085G\u0001ö\u001biL\u00ad\u00893Ï\u0099ú¯\u0012 ;Ð\u0017[Ì\u00107\u00adRuJ»\u0016Eò\u009a\u009f\\Ë\u0013þL"
                     .length();
                  var3 = ' ';
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
      }
   }

   private static oov a(oov var0) {
      return var0;
   }

   private static String b(byte[] var0) {
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23160;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("j7s", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = f[var5].getBytes("ISO-8859-1");
         g[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("j7s" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
