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

public class wui extends bc_ {
   private static final long a;
   private static final String[] c;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public String xue() {
      long var1 = a ^ 132616985281628L;
      return b<"d">(17374, 139611488417410964L ^ var1);
   }

   @Override
   public int bag() {
      return 2;
   }

   @Override
   public String fm7(e7r var1) {
      long var2 = a ^ 130167839906010L;
      return b<"d">(12860, 7120152951383245562L ^ var2);
   }

   @Override
   public void l3z(e7r param1, String[] param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic wui.a J
      // 003: ldc2_w 137022098731289
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic t9d.b ()I
      // 00b: istore 5
      // 00d: aload 2
      // 00e: arraylength
      // 00f: bipush 2
      // 010: if_icmpge 031
      // 013: new w57
      // 016: dup
      // 017: sipush 26210
      // 01a: ldc2_w 6375554984759017316
      // 01d: lload 3
      // 01e: lxor
      // 01f: invokedynamic d (IJ)Ljava/lang/String; bsm=wui.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 024: nop
      // 025: bipush 0
      // 026: anewarray 35
      // 029: invokespecial w57.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 02c: athrow
      // 02d: invokestatic wui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 030: athrow
      // 031: aload 1
      // 032: aload 2
      // 033: bipush 0
      // 034: aaload
      // 035: invokestatic wui.h32 (Le7r;Ljava/lang/String;)Lz96;
      // 038: astore 6
      // 03a: aload 1
      // 03b: getstatic n_k$pbp.nw4 Ln_k$pbp;
      // 03e: bipush 0
      // 03f: invokeinterface e7r.io9 (Ln_k$pbp;I)V 3
      // 044: aload 2
      // 045: bipush 1
      // 046: aaload
      // 047: bipush 0
      // 048: invokestatic wui.o_t (Ljava/lang/String;I)I
      // 04b: istore 7
      // 04d: goto 079
      // 050: astore 8
      // 052: aload 2
      // 053: bipush 1
      // 054: aaload
      // 055: invokestatic vef.w19 (Ljava/lang/String;)Lvef;
      // 058: astore 9
      // 05a: aload 9
      // 05c: iload 5
      // 05e: ifeq 074
      // 061: ifnonnull 072
      // 064: goto 06b
      // 067: invokestatic wui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06a: athrow
      // 06b: aload 8
      // 06d: athrow
      // 06e: invokestatic wui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 071: athrow
      // 072: aload 9
      // 074: getfield vef.bbf I
      // 077: istore 7
      // 079: bipush 1
      // 07a: istore 8
      // 07c: aload 6
      // 07e: invokevirtual ha9.b5z ()Lerg;
      // 081: astore 9
      // 083: aload 9
      // 085: ifnonnull 0a6
      // 088: new uvb
      // 08b: dup
      // 08c: sipush 16850
      // 08f: ldc2_w 7976385322031552725
      // 092: lload 3
      // 093: lxor
      // 094: invokedynamic d (IJ)Ljava/lang/String; bsm=wui.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 099: nop
      // 09a: bipush 0
      // 09b: anewarray 35
      // 09e: invokespecial uvb.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 0a1: athrow
      // 0a2: invokestatic wui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a5: athrow
      // 0a6: iload 7
      // 0a8: invokestatic vef.k6j (I)Lvef;
      // 0ab: astore 10
      // 0ad: aload 10
      // 0af: iload 5
      // 0b1: ifeq 0e6
      // 0b4: ifnonnull 0e4
      // 0b7: goto 0be
      // 0ba: invokestatic wui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bd: athrow
      // 0be: new cco
      // 0c1: dup
      // 0c2: sipush 18776
      // 0c5: ldc2_w 7408691846976999510
      // 0c8: lload 3
      // 0c9: lxor
      // 0ca: invokedynamic d (IJ)Ljava/lang/String; bsm=wui.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cf: nop
      // 0d0: bipush 1
      // 0d1: anewarray 35
      // 0d4: dup
      // 0d5: bipush 0
      // 0d6: iload 7
      // 0d8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0db: aastore
      // 0dc: invokespecial cco.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 0df: athrow
      // 0e0: invokestatic wui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e3: athrow
      // 0e4: aload 10
      // 0e6: aload 9
      // 0e8: invokevirtual vef.ovd (Lerg;)Z
      // 0eb: iload 5
      // 0ed: ifeq 11a
      // 0f0: ifne 118
      // 0f3: goto 0fa
      // 0f6: invokestatic wui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f9: athrow
      // 0fa: new uvb
      // 0fd: dup
      // 0fe: sipush 23403
      // 101: ldc2_w 428590258039751279
      // 104: lload 3
      // 105: lxor
      // 106: invokedynamic d (IJ)Ljava/lang/String; bsm=wui.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10b: nop
      // 10c: bipush 0
      // 10d: anewarray 35
      // 110: invokespecial uvb.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 113: athrow
      // 114: invokestatic wui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 117: athrow
      // 118: aload 2
      // 119: arraylength
      // 11a: iload 5
      // 11c: ifeq 14d
      // 11f: bipush 3
      // 120: if_icmplt 13c
      // 123: goto 12a
      // 126: invokestatic wui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 129: athrow
      // 12a: aload 2
      // 12b: bipush 2
      // 12c: aaload
      // 12d: aload 10
      // 12f: invokevirtual vef.s20 ()I
      // 132: aload 10
      // 134: invokevirtual vef.ehp ()I
      // 137: invokestatic wui.fzm (Ljava/lang/String;II)I
      // 13a: istore 8
      // 13c: aload 9
      // 13e: iload 5
      // 140: ifeq 21e
      // 143: invokevirtual erg.w8b ()Z
      // 146: goto 14d
      // 149: invokestatic wui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14c: athrow
      // 14d: ifeq 21c
      // 150: aload 9
      // 152: invokevirtual erg.pqd ()Lqhg;
      // 155: astore 11
      // 157: iload 5
      // 159: ifeq 246
      // 15c: aload 11
      // 15e: ifnull 21c
      // 161: goto 168
      // 164: invokestatic wui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 167: athrow
      // 168: bipush 0
      // 169: istore 12
      // 16b: iload 12
      // 16d: aload 11
      // 16f: invokevirtual qhg.vek ()I
      // 172: if_icmpge 21c
      // 175: aload 11
      // 177: iload 12
      // 179: invokevirtual qhg.kd6 (I)Lbdo;
      // 17c: sipush 15493
      // 17f: ldc2_w 5107898700017034630
      // 182: lload 3
      // 183: lxor
      // 184: invokedynamic d (IJ)Ljava/lang/String; bsm=wui.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 189: nop
      // 18a: invokevirtual bdo.hp9 (Ljava/lang/String;)S
      // 18d: istore 13
      // 18f: iload 5
      // 191: ifeq 246
      // 194: iload 5
      // 196: ifeq 217
      // 199: goto 1a0
      // 19c: invokestatic wui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19f: athrow
      // 1a0: iload 13
      // 1a2: invokestatic vef.k6j (I)Lvef;
      // 1a5: ifnull 214
      // 1a8: goto 1af
      // 1ab: invokestatic wui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ae: athrow
      // 1af: iload 13
      // 1b1: invokestatic vef.k6j (I)Lvef;
      // 1b4: astore 14
      // 1b6: iload 5
      // 1b8: ifeq 217
      // 1bb: aload 14
      // 1bd: aload 10
      // 1bf: invokevirtual vef.yhx (Lvef;)Z
      // 1c2: ifne 214
      // 1c5: goto 1cc
      // 1c8: invokestatic wui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1cb: athrow
      // 1cc: new uvb
      // 1cf: dup
      // 1d0: sipush 11843
      // 1d3: ldc2_w 2684972387890362177
      // 1d6: lload 3
      // 1d7: lxor
      // 1d8: invokedynamic d (IJ)Ljava/lang/String; bsm=wui.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dd: nop
      // 1de: bipush 2
      // 1df: anewarray 35
      // 1e2: dup
      // 1e3: bipush 0
      // 1e4: aload 10
      // 1e6: iload 8
      // 1e8: invokevirtual vef.pjv (I)Ljava/lang/String;
      // 1eb: aastore
      // 1ec: dup
      // 1ed: bipush 1
      // 1ee: aload 14
      // 1f0: aload 11
      // 1f2: iload 12
      // 1f4: invokevirtual qhg.kd6 (I)Lbdo;
      // 1f7: sipush 27250
      // 1fa: ldc2_w 6704204224230929266
      // 1fd: lload 3
      // 1fe: lxor
      // 1ff: invokedynamic d (IJ)Ljava/lang/String; bsm=wui.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 204: nop
      // 205: invokevirtual bdo.hp9 (Ljava/lang/String;)S
      // 208: invokevirtual vef.pjv (I)Ljava/lang/String;
      // 20b: aastore
      // 20c: invokespecial uvb.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 20f: athrow
      // 210: invokestatic wui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 213: athrow
      // 214: iinc 12 1
      // 217: iload 5
      // 219: ifne 16b
      // 21c: aload 9
      // 21e: aload 10
      // 220: iload 8
      // 222: invokevirtual erg.g7b (Lvef;I)V
      // 225: aload 1
      // 226: aload 0
      // 227: sipush 29510
      // 22a: ldc2_w 3473193030232549959
      // 22d: lload 3
      // 22e: lxor
      // 22f: invokedynamic d (IJ)Ljava/lang/String; bsm=wui.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 234: nop
      // 235: bipush 0
      // 236: anewarray 35
      // 239: invokestatic wui.wxl (Le7r;Lon1;Ljava/lang/String;[Ljava/lang/Object;)V
      // 23c: aload 1
      // 23d: getstatic n_k$pbp.nw4 Ln_k$pbp;
      // 240: bipush 1
      // 241: invokeinterface e7r.io9 (Ln_k$pbp;I)V 3
      // 246: return
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
      // 00: invokestatic t9d.b ()I
      // 03: istore 4
      // 05: aload 2
      // 06: arraylength
      // 07: bipush 1
      // 08: iload 4
      // 0a: ifeq 35
      // 0d: if_icmpne 26
      // 10: goto 17
      // 13: invokestatic wui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16: athrow
      // 17: aload 2
      // 18: aload 0
      // 19: invokevirtual wui.k9w ()[Ljava/lang/String;
      // 1c: invokestatic wui.cqo ([Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;
      // 1f: goto 43
      // 22: invokestatic wui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25: athrow
      // 26: aload 2
      // 27: iload 4
      // 29: ifeq 39
      // 2c: arraylength
      // 2d: bipush 2
      // 2e: goto 35
      // 31: invokestatic wui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34: athrow
      // 35: if_icmpne 42
      // 38: aload 2
      // 39: invokestatic vef.wid ()Ljava/util/Set;
      // 3c: invokestatic wui.d79 ([Ljava/lang/String;Ljava/util/Collection;)Ljava/util/List;
      // 3f: goto 43
      // 42: aconst_null
      // 43: areturn
   }

   public String[] k9w() {
      return vr1._0v().p14();
   }

   @Override
   public boolean mp9(String[] var1, int var2) {
      int var3 = t9d.b();

      try {
         if (var3 == 0) {
            return (boolean)var2;
         }

         if (var2 == 0) {
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
      long var10000 = c.a(7851100432267374849L, 4539670670611653446L, MethodHandles.lookup().lookupClass()).a(277132931832367L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 135678453352424L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[10];
      int var7 = 0;
      String var6 = "\u007f)Fä´£óauTù¯ÿõ°\u008e\u009c,\u0088\u001cî.f\u0010\u001d%éÅ\u00033Í6\u007fÉFèÂ\u00948Y(\"$\u0014¢¹\u0084@u\u0094õj2 \u0095\u00915q\u001a\u008d\u0018l\u0007å\u0086n\u001c<ÝÛéÀJ\u009cr\u0082Déû\u0089\u00878\u001b\u008dv¡V\u00032\u009b=#0\u00ad·ú*cºÎ¶\u0018ö\u007f½¨*0\u0099Õ\u0081Tt\u00830ýì\u008d\u0095uÓÝé\u0018Ö®\u0096\u000bú(ç\u009f3wÃ¢^ð(@â\u009båFç\u0003ßIô\u0002dÛ\u008c\u0015ì\u0018SÞ¯}\u0005²\u0081f\u009f\u009f\u0000çGFÎK£fÒo\u0085\u0088Â0¡£ü\u0014Ù\u0006\u0098ïÕv\u008e\u0017\u0088ºc\u0093c\u001bñ¹\u0000u\u0002··¿\u00839\u001fç\u00902OGè]\u000bIo\u0084\u0007ú):é¹¨\u0017\u0010ÆR\u009fõ£¹Ò,®¾\u0004nò\u009b-\u000e\u0010\u009a\u0006b\u008b¨îÌ*ÃgÞ@ê´H78\u0088Y\u0082a\u001bWz¯-_÷ä-}\u0017lÜöÝ(÷\u008fO¬{ ²U«zp<D\u001ae\u0090)QÕ/3\u009e\u0099sâ\t÷i\u0084\u008eD\u000f®W¯\u009d";
      int var8 = "\u007f)Fä´£óauTù¯ÿõ°\u008e\u009c,\u0088\u001cî.f\u0010\u001d%éÅ\u00033Í6\u007fÉFèÂ\u00948Y(\"$\u0014¢¹\u0084@u\u0094õj2 \u0095\u00915q\u001a\u008d\u0018l\u0007å\u0086n\u001c<ÝÛéÀJ\u009cr\u0082Déû\u0089\u00878\u001b\u008dv¡V\u00032\u009b=#0\u00ad·ú*cºÎ¶\u0018ö\u007f½¨*0\u0099Õ\u0081Tt\u00830ýì\u008d\u0095uÓÝé\u0018Ö®\u0096\u000bú(ç\u009f3wÃ¢^ð(@â\u009båFç\u0003ßIô\u0002dÛ\u008c\u0015ì\u0018SÞ¯}\u0005²\u0081f\u009f\u009f\u0000çGFÎK£fÒo\u0085\u0088Â0¡£ü\u0014Ù\u0006\u0098ïÕv\u008e\u0017\u0088ºc\u0093c\u001bñ¹\u0000u\u0002··¿\u00839\u001fç\u00902OGè]\u000bIo\u0084\u0007ú):é¹¨\u0017\u0010ÆR\u009fõ£¹Ò,®¾\u0004nò\u009b-\u000e\u0010\u009a\u0006b\u008b¨îÌ*ÃgÞ@ê´H78\u0088Y\u0082a\u001bWz¯-_÷ä-}\u0017lÜöÝ(÷\u008fO¬{ ²U«zp<D\u001ae\u0090)QÕ/3\u009e\u0099sâ\t÷i\u0084\u008eD\u000f®W¯\u009d"
         .length();
      char var5 = '(';
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
                     g = new String[10];
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

                  var6 = "0\r_üá\u009b®u~\u0085'\t\u0093h*5à£ãà\nq.7ÑE\u0081^Ô\u0017¨*ÂO:ý¿\u0096\u0006H·åïò%qÉ|#\u0098´ÊxCx½\u0010C\u0086t\u0011ÒS²×b\u0088è«\u0005ô\u0005ñ";
                  var8 = "0\r_üá\u009b®u~\u0085'\t\u0093h*5à£ãà\nq.7ÑE\u0081^Ô\u0017¨*ÂO:ý¿\u0096\u0006H·åïò%qÉ|#\u0098´ÊxCx½\u0010C\u0086t\u0011ÒS²×b\u0088è«\u0005ô\u0005ñ"
                     .length();
                  var5 = '8';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static Exception a(Exception var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30040;
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
            throw new RuntimeException("wui", var10);
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
         throw new RuntimeException("wui" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
