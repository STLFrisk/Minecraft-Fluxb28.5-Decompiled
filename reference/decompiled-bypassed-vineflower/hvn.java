import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class hvn extends izd {
   public static final h76 ajj;
   public static final zb_ spa;

   public hvn() {
      int var1 = t9d.c();
      super(p3y.zs8);
      zfz var2 = this._8_.c32();

      label25: {
         label24: {
            label23: {
               try {
                  if (var1 != 0) {
                     break label23;
                  }

                  if (!this.t7p()) {
                     break label24;
                  }
               } catch (oov var3) {
                  throw a(var3);
               }

               var2 = var2.zvi(ajj, false);
            }

            if (var1 == 0) {
               break label25;
            }
         }

         var2 = var2.zvi(_9x, izd$jc0.ct4);
      }

      this.y8l(var2.zvi(spa, hvn$dyo.jf7));
      this.i3l(uja.mqu);
   }

   @Override
   public u7m j39(zfz var1, Random var2, int var3) {
      return u7m.gfm(ox_.bj8);
   }

   @Override
   public u7m su9(t9d var1, mew var2) {
      return u7m.gfm(ox_.bj8);
   }

   @Override
   public String uud(int var1) {
      return super.abc() + "." + hvn$dyo.gbq(var1).gsv();
   }

   @Override
   public xny ptp() {
      return spa;
   }

   @Override
   public Object ulk(erg var1) {
      return hvn$dyo.gbq(var1.j6_() & 7);
   }

   @Override
   public void m1q(u7m param1, uja param2, List param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 4
      // 05: aload 1
      // 06: getstatic ox_.yvz Lizd;
      // 09: invokestatic u7m.gfm (Le0x;)Lu7m;
      // 0c: if_acmpeq 62
      // 0f: invokestatic hvn$dyo.values ()[Lhvn$dyo;
      // 12: astore 5
      // 14: aload 5
      // 16: arraylength
      // 17: istore 6
      // 19: bipush 0
      // 1a: istore 7
      // 1c: iload 7
      // 1e: iload 6
      // 20: if_icmpge 62
      // 23: aload 5
      // 25: iload 7
      // 27: aaload
      // 28: astore 8
      // 2a: iload 4
      // 2c: ifeq 5d
      // 2f: aload 8
      // 31: getstatic hvn$dyo.dj5 Lhvn$dyo;
      // 34: if_acmpeq 5a
      // 37: goto 3e
      // 3a: invokestatic hvn.a (Loov;)Loov;
      // 3d: athrow
      // 3e: aload 3
      // 3f: new erg
      // 42: dup
      // 43: aload 1
      // 44: bipush 1
      // 45: aload 8
      // 47: invokevirtual hvn$dyo.run ()I
      // 4a: invokespecial erg.<init> (Lu7m;II)V
      // 4d: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 52: pop
      // 53: goto 5a
      // 56: invokestatic hvn.a (Loov;)Loov;
      // 59: athrow
      // 5a: iinc 7 1
      // 5d: iload 4
      // 5f: ifne 1c
      // 62: return
   }

   @Override
   public zfz kig(int param1) {
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
      // 05: invokevirtual hvn.l4i ()Lzfz;
      // 08: getstatic hvn.spa Lzb_;
      // 0b: iload 1
      // 0c: bipush 7
      // 0e: iand
      // 0f: invokestatic hvn$dyo.gbq (I)Lhvn$dyo;
      // 12: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 17: astore 3
      // 18: aload 0
      // 19: invokevirtual hvn.t7p ()Z
      // 1c: ifeq 4e
      // 1f: aload 3
      // 20: getstatic hvn.ajj Lh76;
      // 23: iload 1
      // 24: bipush 8
      // 26: iand
      // 27: iload 2
      // 28: ifeq 3d
      // 2b: goto 32
      // 2e: invokestatic hvn.a (Loov;)Loov;
      // 31: athrow
      // 32: ifeq 40
      // 35: goto 3c
      // 38: invokestatic hvn.a (Loov;)Loov;
      // 3b: athrow
      // 3c: bipush 1
      // 3d: goto 41
      // 40: bipush 0
      // 41: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 44: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 49: astore 3
      // 4a: iload 2
      // 4b: ifne 73
      // 4e: aload 3
      // 4f: getstatic hvn._9x Lzb_;
      // 52: iload 1
      // 53: bipush 8
      // 55: iand
      // 56: ifne 6a
      // 59: goto 60
      // 5c: invokestatic hvn.a (Loov;)Loov;
      // 5f: athrow
      // 60: getstatic izd$jc0.ct4 Lizd$jc0;
      // 63: goto 6d
      // 66: invokestatic hvn.a (Loov;)Loov;
      // 69: athrow
      // 6a: getstatic izd$jc0.l7i Lizd$jc0;
      // 6d: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 72: astore 3
      // 73: aload 3
      // 74: areturn
   }

   @Override
   public int hvp(zfz param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 0
      // 01: istore 3
      // 02: invokestatic t9d.b ()I
      // 05: iload 3
      // 06: aload 1
      // 07: getstatic hvn.spa Lzb_;
      // 0a: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0f: checkcast hvn$dyo
      // 12: invokevirtual hvn$dyo.run ()I
      // 15: ior
      // 16: istore 3
      // 17: istore 2
      // 18: aload 0
      // 19: invokevirtual hvn.t7p ()Z
      // 1c: iload 2
      // 1d: ifeq 40
      // 20: ifeq 57
      // 23: goto 2a
      // 26: invokestatic hvn.a (Loov;)Loov;
      // 29: athrow
      // 2a: aload 1
      // 2b: getstatic hvn.ajj Lh76;
      // 2e: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 33: checkcast java/lang/Boolean
      // 36: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 39: goto 40
      // 3c: invokestatic hvn.a (Loov;)Loov;
      // 3f: athrow
      // 40: iload 2
      // 41: ifeq 73
      // 44: ifeq 72
      // 47: goto 4e
      // 4a: invokestatic hvn.a (Loov;)Loov;
      // 4d: athrow
      // 4e: iload 3
      // 4f: bipush 8
      // 51: ior
      // 52: istore 3
      // 53: iload 2
      // 54: ifne 72
      // 57: aload 1
      // 58: getstatic hvn._9x Lzb_;
      // 5b: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 60: getstatic izd$jc0.l7i Lizd$jc0;
      // 63: if_acmpne 72
      // 66: goto 6d
      // 69: invokestatic hvn.a (Loov;)Loov;
      // 6c: athrow
      // 6d: iload 3
      // 6e: bipush 8
      // 70: ior
      // 71: istore 3
      // 72: iload 3
      // 73: ireturn
   }

   @Override
   public g92 oz5() {
      try {
         if (this.t7p()) {
            return new g92(this, new xny[]{ajj, spa});
         }
      } catch (oov var1) {
         throw a(var1);
      }

      return new g92(this, new xny[]{_9x, spa});
   }

   @Override
   public int crg(zfz var1) {
      return ((hvn$dyo)var1.dil(spa)).run();
   }

   @Override
   public _mi uoz(zfz var1) {
      return ((hvn$dyo)var1.dil(spa)).qjp();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8590852625300795614L, 8616837240351104989L, MethodHandles.lookup().lookupClass()).a(170521394599963L);
      // $VF: monitorexit
      long var10 = var10000 ^ 50352020581452L;
      Cipher var1;
      Cipher var13 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[2];
      int var6 = 0;
      String var5 = "¼9èÀÌ\u008cµ\u0006Ùô\u0084í*R\u001b\u001a\bÙ\u001fýèHUÉs";
      int var7 = "¼9èÀÌ\u008cµ\u0006Ùô\u0084í*R\u001b\u001a\bÙ\u001fýèHUÉs".length();
      char var4 = 16;
      int var3 = -1;

      while (true) {
         byte[] var9 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var15 = c(var9).intern();
         byte var10001 = -1;
         var8[var6++] = var15;
         if ((var3 += var4) >= var7) {
            ajj = h76.d_1(var8[0]);
            spa = zb_.pq4(var8[1], hvn$dyo.class);
            return;
         }

         var4 = var5.charAt(var3);
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
}
