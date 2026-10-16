import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ef9 {
   private TreeMap rx_;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public ef9() {
      long var1 = a ^ 16965717075118L;
      super();
      this.rx_ = new TreeMap();
      this.omr(a<"j">(2834, 3334761803886028770L ^ var1), a<"j">(3038, 5556025200408192808L ^ var1), ef9$nbw.blk);
      this.omr(a<"j">(24556, 6938518931327431441L ^ var1), a<"j">(32308, 6172483650742817487L ^ var1), ef9$nbw.blk);
      this.omr(a<"j">(28642, 1570974238925882138L ^ var1), a<"j">(13268, 7653664725136138017L ^ var1), ef9$nbw.blk);
      this.omr(a<"j">(9527, 1670342581265353166L ^ var1), a<"j">(32308, 6172483650742817487L ^ var1), ef9$nbw.blk);
      this.omr(a<"j">(30143, 8630209617746434373L ^ var1), a<"j">(32308, 6172483650742817487L ^ var1), ef9$nbw.blk);
      this.omr(a<"j">(25331, 1433521746327670290L ^ var1), a<"j">(32308, 6172483650742817487L ^ var1), ef9$nbw.blk);
      this.omr(a<"j">(14530, 6696568865680118835L ^ var1), a<"j">(32308, 6172483650742817487L ^ var1), ef9$nbw.blk);
      this.omr(a<"j">(11540, 4893179693881541098L ^ var1), a<"j">(32308, 6172483650742817487L ^ var1), ef9$nbw.blk);
      this.omr(a<"j">(4095, 7137519661356671773L ^ var1), a<"j">(32308, 6172483650742817487L ^ var1), ef9$nbw.blk);
      this.omr(a<"j">(23287, 1230730471064286724L ^ var1), a<"j">(32308, 6172483650742817487L ^ var1), ef9$nbw.blk);
      this.omr(a<"j">(5817, 6038523111812004430L ^ var1), a<"j">(32308, 6172483650742817487L ^ var1), ef9$nbw.blk);
      this.omr(a<"j">(2683, 6732230113415784079L ^ var1), a<"j">(32308, 6172483650742817487L ^ var1), ef9$nbw.blk);
      this.omr(a<"j">(26239, 4257075389620259487L ^ var1), "3", ef9$nbw.rt_);
      this.omr(a<"j">(16024, 6559600758569620068L ^ var1), a<"j">(32308, 6172483650742817487L ^ var1), ef9$nbw.blk);
      this.omr(a<"j">(31945, 4146481836539842619L ^ var1), a<"j">(12257, 5271525237108130590L ^ var1), ef9$nbw.blk);
   }

   public void omr(String var1, String var2, ef9$nbw var3) {
      this.rx_.put(var1, new ef9$e53(var2, var3));
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void iqg(String var1, String var2) {
      int var3 = OpaquePredicate.b();
      ef9$e53 var4 = (ef9$e53)this.rx_.get(var1);

      label37: {
         label36: {
            ef9$e53 var10000;
            label35: {
               try {
                  var10000 = var4;
                  if (var3 == 0) {
                     break label35;
                  }

                  if (var4 == null) {
                     break label36;
                  }
               } catch (oov var8) {
                  throw a(var8);
               }

               var10000 = var4;
            }

            try {
               var10000.ck4(var2);
               if (var3 != 0) {
                  break label37;
               }
            } catch (oov var7) {
               boolean var10001 = false;
               throw a(var7);
            }
         }

         try {
            this.omr(var1, var2, ef9$nbw.u8y);
         } catch (oov var6) {
            boolean var10 = false;
            throw a(var6);
         }
      }

      try {
         ;
      } catch (oov var5) {
         boolean var11 = false;
         throw a(var5);
      }
   }

   public String x3n(String var1) {
      int var2 = OpaquePredicate.c();
      ef9$e53 var3 = (ef9$e53)this.rx_.get(var1);

      try {
         if (var2 != 0) {
            return var3.fzk();
         }

         if (var3 == null) {
            return "";
         }
      } catch (oov var4) {
         throw a(var4);
      }

      return var3.fzk();
   }

   public boolean _s0(String var1) {
      int var2 = OpaquePredicate.b();
      ef9$e53 var3 = (ef9$e53)this.rx_.get(var1);

      try {
         if (var2 == 0) {
            return var3.c8x();
         }

         if (var3 == null) {
            return false;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      return var3.c8x();
   }

   public int sh0(String var1) {
      int var2 = OpaquePredicate.c();
      ef9$e53 var3 = (ef9$e53)this.rx_.get(var1);

      try {
         if (var2 != 0) {
            return var3.k9u();
         }

         if (var3 == null) {
            return 0;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      return var3.k9u();
   }

   public bdo dve() {
      bdo var2 = new bdo();
      int var10000 = OpaquePredicate.c();
      Iterator var3 = this.rx_.keySet().iterator();
      int var1 = var10000;

      while (true) {
         if (var3.hasNext()) {
            String var4 = (String)var3.next();
            ef9$e53 var5 = (ef9$e53)this.rx_.get(var4);

            try {
               var7 = var2;
               if (var1 != 0) {
                  break;
               }

               var2.rjq(var4, var5.fzk());
               if (var1 == 0) {
                  continue;
               }
            } catch (oov var6) {
               throw a(var6);
            }
         }

         var7 = var2;
         break;
      }

      return var7;
   }

   public void xki(bdo var1) {
      int var2 = OpaquePredicate.c();

      for (String var4 : var1.bo9()) {
         String var5 = var1.u14(var4);
         this.iqg(var4, var5);
         if (var2 != 0) {
            break;
         }
      }
   }

   public String[] pmi() {
      Set var1 = this.rx_.keySet();
      return var1.toArray(new String[var1.size()]);
   }

   public boolean xit(String var1) {
      return this.rx_.containsKey(var1);
   }

   public boolean t_x(String param1, ef9$nbw param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: getfield ef9.rx_ Ljava/util/TreeMap;
      // 08: aload 1
      // 09: invokevirtual java/util/TreeMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0c: checkcast ef9$e53
      // 0f: astore 4
      // 11: aload 4
      // 13: iload 3
      // 14: ifeq 23
      // 17: ifnull 4b
      // 1a: goto 21
      // 1d: invokestatic ef9.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 4
      // 23: invokevirtual ef9$e53.yxm ()Lef9$nbw;
      // 26: aload 2
      // 27: iload 3
      // 28: ifeq 40
      // 2b: if_acmpeq 43
      // 2e: goto 35
      // 31: invokestatic ef9.a (Loov;)Loov;
      // 34: athrow
      // 35: aload 2
      // 36: getstatic ef9$nbw.u8y Lef9$nbw;
      // 39: goto 40
      // 3c: invokestatic ef9.a (Loov;)Loov;
      // 3f: athrow
      // 40: if_acmpne 4b
      // 43: bipush 1
      // 44: goto 4c
      // 47: invokestatic ef9.a (Loov;)Loov;
      // 4a: athrow
      // 4b: bipush 0
      // 4c: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6250593613867074025L, -6462150747052923009L, MethodHandles.lookup().lookupClass()).a(59807083160296L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 33359279157370L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[19];
      int var7 = 0;
      String var6 = "¢Ub\u0000Ú¿é}÷\u0019¹·\u008a\nq[Cã\u008a\u000e\b\u008dRs\u0018`,ß>¼BÜâ|\u008e\nÇ\u0084\u001c\u0011QÎ¤ÏCfYµ\u00ad0_|ã\u0080²Î\u008aõP:\u00172\u0097\u001fw\u009aN|\u0017\u008fyy.ì\u009a\u0093~\u0080\u008aèj<X\u0080\u0015*RÛ\u0015ä²\t~8@9\u000e± \u009d7oØWgT,\u008e\u000eà\u008aR\u009dá\u0000¤ÒÚ\u0095çôærRoÞe\u0004` n(ðÔ\u008a8^²\u001ceóë®ºî<\u00956Yn\u008a·Í6¤ý\u001aùv\u007fÁM0\u000bÃ5¨é\u001eò3Ò\u0010ÞrNTwÝ²Âý°s±\f\u0097|\u0097\u0010\u009fÁ\u0014(3~¿ù\u0007kÏÕ\u001d{×8(}\u0087¿\u0099í\u0091^F%N\u009bÚN\u009f¦\u0004\u0013ÛDä}>\u0094\u0088FòäH\u001d\u0095»\u0090\u008dÄ\u0013ÿÊ`\u0081\u0004\u0018\u0004§{â\u008c«HG`\u009f/«ç\u0015ª`\u008cWL\u0094\u0085\u0013Ø\t\u0018QÖó\u008dY~ä³\tÚ«|\u0088\u008a|\u008d\u009e5\\¥±\u0080l\r\u0018\u009bê{)Î±C¿°\u001ea\u00adJ\u0096ÀÇ.è7>\u000bE9\u0087\u0010ÁË$Ób¹Üä\u001e¬®ÅÐ°îJ(Í\u0096ô\u001dû«kwwÚ$A¦\u0083\u001fMa\u001dì¨\n4ÙB[í!ÝÃ\u008d(\u0093Ò¼F®Ó¢Aa \u0015\u0081»y\u0097Iª\u00992þ¸ù¼\u0007pezù\u008c\u0002<N\u001dÐ{e?\u0086\u0089&ôC(\t(;\u0091¼å8\u001dÞéQ6JµQLXNíe\u0091nñù5l\u0087A;8|¼k\u009a\u008c\n¸Þ\u009d\u0085\u0010\u0013+àé\u0004;=ºüñÈÓ\u0082$ÐQ\u0018\u0089xBâ\u0085ìï&\u0096\u008e÷oóZÁ.0oxK\u00adH5\u008d";
      int var8 = "¢Ub\u0000Ú¿é}÷\u0019¹·\u008a\nq[Cã\u008a\u000e\b\u008dRs\u0018`,ß>¼BÜâ|\u008e\nÇ\u0084\u001c\u0011QÎ¤ÏCfYµ\u00ad0_|ã\u0080²Î\u008aõP:\u00172\u0097\u001fw\u009aN|\u0017\u008fyy.ì\u009a\u0093~\u0080\u008aèj<X\u0080\u0015*RÛ\u0015ä²\t~8@9\u000e± \u009d7oØWgT,\u008e\u000eà\u008aR\u009dá\u0000¤ÒÚ\u0095çôærRoÞe\u0004` n(ðÔ\u008a8^²\u001ceóë®ºî<\u00956Yn\u008a·Í6¤ý\u001aùv\u007fÁM0\u000bÃ5¨é\u001eò3Ò\u0010ÞrNTwÝ²Âý°s±\f\u0097|\u0097\u0010\u009fÁ\u0014(3~¿ù\u0007kÏÕ\u001d{×8(}\u0087¿\u0099í\u0091^F%N\u009bÚN\u009f¦\u0004\u0013ÛDä}>\u0094\u0088FòäH\u001d\u0095»\u0090\u008dÄ\u0013ÿÊ`\u0081\u0004\u0018\u0004§{â\u008c«HG`\u009f/«ç\u0015ª`\u008cWL\u0094\u0085\u0013Ø\t\u0018QÖó\u008dY~ä³\tÚ«|\u0088\u008a|\u008d\u009e5\\¥±\u0080l\r\u0018\u009bê{)Î±C¿°\u001ea\u00adJ\u0096ÀÇ.è7>\u000bE9\u0087\u0010ÁË$Ób¹Üä\u001e¬®ÅÐ°îJ(Í\u0096ô\u001dû«kwwÚ$A¦\u0083\u001fMa\u001dì¨\n4ÙB[í!ÝÃ\u008d(\u0093Ò¼F®Ó¢Aa \u0015\u0081»y\u0097Iª\u00992þ¸ù¼\u0007pezù\u008c\u0002<N\u001dÐ{e?\u0086\u0089&ôC(\t(;\u0091¼å8\u001dÞéQ6JµQLXNíe\u0091nñù5l\u0087A;8|¼k\u009a\u008c\n¸Þ\u009d\u0085\u0010\u0013+àé\u0004;=ºüñÈÓ\u0082$ÐQ\u0018\u0089xBâ\u0085ìï&\u0096\u008e÷oóZÁ.0oxK\u00adH5\u008d"
         .length();
      char var5 = 24;
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
                     b = var9;
                     c = new String[19];
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

                  var6 = "ÜØ\u001f²\u001aÑê½\u0001ü\n\u00011\u0007ñ}·²\u001d\u0080zw/¡å\u0098`ÀNÈÑ®(á\u001d×í½FëX\b`Le×\u0088\u0087£i{\u00922O*j¾õMrn=¿>nT\u001eËï\u0002öP ";
                  var8 = "ÜØ\u001f²\u001aÑê½\u0001ü\n\u00011\u0007ñ}·²\u001d\u0080zw/¡å\u0098`ÀNÈÑ®(á\u001d×í½FëX\b`Le×\u0088\u0087£i{\u00922O*j¾õMrn=¿>nT\u001eËï\u0002öP "
                     .length();
                  var5 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11325;
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
            throw new RuntimeException("ef9", var10);
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
         throw new RuntimeException("ef9" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
