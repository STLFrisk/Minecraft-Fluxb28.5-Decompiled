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

public class oyp extends bc_ {
   private static final long a;
   private static final String[] c;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public String xue() {
      long var1 = a ^ 87657981425653L;
      return b<"p">(6269, 5571179235899431418L ^ var1);
   }

   @Override
   public int bag() {
      return 2;
   }

   @Override
   public String fm7(e7r var1) {
      long var2 = a ^ 71774092880755L;
      return b<"p">(16234, 76859102995260015L ^ var2);
   }

   @Override
   public void l3z(e7r var1, String[] var2) {
      long var3 = a ^ 83265642939056L;

      try {
         if (var2.length <= 0) {
            throw new w57(b<"p">(2670, 7012877138755370667L ^ var3), new Object[0]);
         }
      } catch (oov var6) {
         throw a(var6);
      }

      v66 var5 = this.jk2(var2[0]);
      vr1._0v().ki2(var5);
      wxl(var1, this, b<"p">(13214, 9072898780411856734L ^ var3), new Object[]{new hsu(var5.ltp(), new Object[0])});
   }

   public v66 jk2(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic oyp.a J
      // 003: ldc2_w 86891460473192
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic t9d.c ()I
      // 00b: istore 4
      // 00d: aload 1
      // 00e: sipush 31423
      // 011: ldc2_w 4697053220130504096
      // 014: lload 2
      // 015: lxor
      // 016: invokedynamic p (IJ)Ljava/lang/String; bsm=oyp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01b: nop
      // 01c: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 01f: iload 4
      // 021: ifne 03c
      // 024: ifne 13f
      // 027: goto 02e
      // 02a: invokestatic oyp.a (Loov;)Loov;
      // 02d: athrow
      // 02e: aload 1
      // 02f: ldc "p"
      // 031: nop
      // 032: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 035: goto 03c
      // 038: invokestatic oyp.a (Loov;)Loov;
      // 03b: athrow
      // 03c: iload 4
      // 03e: ifne 064
      // 041: ifne 13f
      // 044: goto 04b
      // 047: invokestatic oyp.a (Loov;)Loov;
      // 04a: athrow
      // 04b: aload 1
      // 04c: sipush 26026
      // 04f: ldc2_w 6484597025041031862
      // 052: lload 2
      // 053: lxor
      // 054: invokedynamic p (IJ)Ljava/lang/String; bsm=oyp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 059: nop
      // 05a: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 05d: goto 064
      // 060: invokestatic oyp.a (Loov;)Loov;
      // 063: athrow
      // 064: iload 4
      // 066: ifne 081
      // 069: ifne 139
      // 06c: goto 073
      // 06f: invokestatic oyp.a (Loov;)Loov;
      // 072: athrow
      // 073: aload 1
      // 074: ldc "e"
      // 076: nop
      // 077: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 07a: goto 081
      // 07d: invokestatic oyp.a (Loov;)Loov;
      // 080: athrow
      // 081: iload 4
      // 083: ifne 0a9
      // 086: ifne 139
      // 089: goto 090
      // 08c: invokestatic oyp.a (Loov;)Loov;
      // 08f: athrow
      // 090: aload 1
      // 091: sipush 31730
      // 094: ldc2_w 5393098705293589733
      // 097: lload 2
      // 098: lxor
      // 099: invokedynamic p (IJ)Ljava/lang/String; bsm=oyp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09e: nop
      // 09f: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 0a2: goto 0a9
      // 0a5: invokestatic oyp.a (Loov;)Loov;
      // 0a8: athrow
      // 0a9: iload 4
      // 0ab: ifne 0c6
      // 0ae: ifne 133
      // 0b1: goto 0b8
      // 0b4: invokestatic oyp.a (Loov;)Loov;
      // 0b7: athrow
      // 0b8: aload 1
      // 0b9: ldc "n"
      // 0bb: nop
      // 0bc: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 0bf: goto 0c6
      // 0c2: invokestatic oyp.a (Loov;)Loov;
      // 0c5: athrow
      // 0c6: iload 4
      // 0c8: ifne 0ee
      // 0cb: ifne 133
      // 0ce: goto 0d5
      // 0d1: invokestatic oyp.a (Loov;)Loov;
      // 0d4: athrow
      // 0d5: aload 1
      // 0d6: sipush 8372
      // 0d9: ldc2_w 6153027016142022573
      // 0dc: lload 2
      // 0dd: lxor
      // 0de: invokedynamic p (IJ)Ljava/lang/String; bsm=oyp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e3: nop
      // 0e4: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 0e7: goto 0ee
      // 0ea: invokestatic oyp.a (Loov;)Loov;
      // 0ed: athrow
      // 0ee: iload 4
      // 0f0: ifne 10b
      // 0f3: ifne 12d
      // 0f6: goto 0fd
      // 0f9: invokestatic oyp.a (Loov;)Loov;
      // 0fc: athrow
      // 0fd: aload 1
      // 0fe: ldc "h"
      // 100: nop
      // 101: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 104: goto 10b
      // 107: invokestatic oyp.a (Loov;)Loov;
      // 10a: athrow
      // 10b: iload 4
      // 10d: ifne 127
      // 110: ifne 12d
      // 113: goto 11a
      // 116: invokestatic oyp.a (Loov;)Loov;
      // 119: athrow
      // 11a: aload 1
      // 11b: bipush 0
      // 11c: bipush 3
      // 11d: invokestatic oyp.fzm (Ljava/lang/String;II)I
      // 120: goto 127
      // 123: invokestatic oyp.a (Loov;)Loov;
      // 126: athrow
      // 127: invokestatic v66.n4n (I)Lv66;
      // 12a: goto 142
      // 12d: getstatic v66.csg Lv66;
      // 130: goto 142
      // 133: getstatic v66.b_4 Lv66;
      // 136: goto 142
      // 139: getstatic v66.g4t Lv66;
      // 13c: goto 142
      // 13f: getstatic v66.na2 Lv66;
      // 142: areturn
   }

   @Override
   public List ggu(e7r param1, String[] param2, mew param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic oyp.a J
      // 03: ldc2_w 113577345457984
      // 06: lxor
      // 07: lstore 4
      // 09: invokestatic t9d.c ()I
      // 0c: istore 6
      // 0e: aload 2
      // 0f: iload 6
      // 11: ifne 28
      // 14: arraylength
      // 15: bipush 1
      // 16: if_icmpne 7a
      // 19: goto 20
      // 1c: invokestatic oyp.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 2
      // 21: goto 28
      // 24: invokestatic oyp.a (Loov;)Loov;
      // 27: athrow
      // 28: bipush 4
      // 29: anewarray 1
      // 2c: dup
      // 2d: bipush 0
      // 2e: sipush 9373
      // 31: ldc2_w 952782953562099107
      // 34: lload 4
      // 36: lxor
      // 37: invokedynamic p (IJ)Ljava/lang/String; bsm=oyp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c: nop
      // 3d: aastore
      // 3e: dup
      // 3f: bipush 1
      // 40: sipush 32726
      // 43: ldc2_w 6429514959049561829
      // 46: lload 4
      // 48: lxor
      // 49: invokedynamic p (IJ)Ljava/lang/String; bsm=oyp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: nop
      // 4f: aastore
      // 50: dup
      // 51: bipush 2
      // 52: sipush 697
      // 55: ldc2_w 3889860517527022469
      // 58: lload 4
      // 5a: lxor
      // 5b: invokedynamic p (IJ)Ljava/lang/String; bsm=oyp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60: nop
      // 61: aastore
      // 62: dup
      // 63: bipush 3
      // 64: sipush 9213
      // 67: ldc2_w 5403594124452842176
      // 6a: lload 4
      // 6c: lxor
      // 6d: invokedynamic p (IJ)Ljava/lang/String; bsm=oyp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 72: nop
      // 73: aastore
      // 74: invokestatic oyp.cqo ([Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;
      // 77: goto 7b
      // 7a: aconst_null
      // 7b: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(8538688483114286328L, 1083228457121193604L, MethodHandles.lookup().lookupClass()).a(128793720738059L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 135230583552529L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[12];
      int var7 = 0;
      String var6 = "\u0091\\{õÌ\u008b¡±\t\u001cò\u009eäÒd\tMmjý\u001d/L\u00120.w k.\u001fæ];<ÓP*\u0098yëo¶] ¥>Ë\u0013\u009c>YÉ\u0089\u0098ââ\u008eu\u0092[ØÛaíH\u00045bñ\u001fjÙ8:\u008an^Z³{ø¨\u0015r\u000fC\u0095ÆIYVÝó\u009b-\u009fÜ\u0005\u0081cö\u0018\u0092Àðæ¡a\u000fû¦$ÛQ®(\u0092È\u008c·. o*cÿúK\u000b\u0010ß³«IN§\u0095Ü¤\u009a\u0003Æ\u001bÎ\u008dõ\u00104\tÌøÃp-ÿ¶$\u0099ía£Ù\u0016\u0018ö?õûSíQ×5\u009dÛ\u008aûªAjwº:´\u008c£:\u008c\u0010?\u00adP\u0097U¤5ÏÏ°\u0006\u0081Ã\u0006\u001aj8h»xZV\u009b\u009dª¹ÝÔi\u001fÝ-\u0019 ·ï\u0088\u0081¾\u00194\u009eË?¾4¹¹\u0087pí\u0015tí½·+Ê\u0099Q§V\u0019[\u000b\u0085Å³KÌä\u0007õ\u0010\u0012hØrù\n8\u0001Qê\u008bì\u0007.Ö½ J®z\u0019ºxWÆ\u0093ZKé['\u0012L\u0095*\u0016QîØ\u0014\u0089\u009bPB\u0003@Å`c";
      int var8 = "\u0091\\{õÌ\u008b¡±\t\u001cò\u009eäÒd\tMmjý\u001d/L\u00120.w k.\u001fæ];<ÓP*\u0098yëo¶] ¥>Ë\u0013\u009c>YÉ\u0089\u0098ââ\u008eu\u0092[ØÛaíH\u00045bñ\u001fjÙ8:\u008an^Z³{ø¨\u0015r\u000fC\u0095ÆIYVÝó\u009b-\u009fÜ\u0005\u0081cö\u0018\u0092Àðæ¡a\u000fû¦$ÛQ®(\u0092È\u008c·. o*cÿúK\u000b\u0010ß³«IN§\u0095Ü¤\u009a\u0003Æ\u001bÎ\u008dõ\u00104\tÌøÃp-ÿ¶$\u0099ía£Ù\u0016\u0018ö?õûSíQ×5\u009dÛ\u008aûªAjwº:´\u008c£:\u008c\u0010?\u00adP\u0097U¤5ÏÏ°\u0006\u0081Ã\u0006\u001aj8h»xZV\u009b\u009dª¹ÝÔi\u001fÝ-\u0019 ·ï\u0088\u0081¾\u00194\u009eË?¾4¹¹\u0087pí\u0015tí½·+Ê\u0099Q§V\u0019[\u000b\u0085Å³KÌä\u0007õ\u0010\u0012hØrù\n8\u0001Qê\u008bì\u0007.Ö½ J®z\u0019ºxWÆ\u0093ZKé['\u0012L\u0095*\u0016QîØ\u0014\u0089\u009bPB\u0003@Å`c"
         .length();
      char var5 = 24;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     c = var9;
                     g = new String[12];
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

                  var6 = "ÎWGö¶péäì¢W\u0015äiLG\u0010\u0006â+\u0081\u009e!®\u008aä(\u001d\u0014x Úö";
                  var8 = "ÎWGö¶péäì¢W\u0015äiLG\u0010\u0006â+\u0081\u009e!®\u008aä(\u001d\u0014x Úö".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6297;
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
            throw new RuntimeException("oyp", var10);
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
         throw new RuntimeException("oyp" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
