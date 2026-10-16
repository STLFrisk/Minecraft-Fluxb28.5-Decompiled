import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.network.play.server.S3FPacketCustomPayload;

public class j83 {
   public static j83 ef8;
   public boolean oqk = false;
   public boolean i7i = false;
   public boolean cyq = false;
   public Minecraft fs8 = Minecraft.vz1();
   public q6h xzx = new q6h();
   public static j83$ip8 gux;
   private static final long a;
   private static final String b;

   public j83() {
      ef8 = this;
   }

   public native void _8o();

   @EventHandler
   public void k21(wbh var1) {
      mz2 var2 = var1.nlg();

      try {
         if (var2 instanceof S3FPacketCustomPayload) {
            this.vgh((S3FPacketCustomPayload)var2);
         }
      } catch (oov var3) {
         throw a(var3);
      }
   }

   public native void vgh(S3FPacketCustomPayload var1);

   public native boolean gln();

   @EventHandler
   public void kix(TickEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield j83.xzx Lq6h;
      // 08: ldc2_w 1000.0
      // 0b: invokevirtual q6h.hqu (D)Z
      // 0e: iload 2
      // 0f: ifne 36
      // 12: ifeq 55
      // 15: goto 1c
      // 18: invokestatic j83.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 0
      // 1d: invokevirtual j83.uwp ()V
      // 20: aload 0
      // 21: iload 2
      // 22: ifne 3a
      // 25: goto 2c
      // 28: invokestatic j83.a (Loov;)Loov;
      // 2b: athrow
      // 2c: invokevirtual j83.gln ()Z
      // 2f: goto 36
      // 32: invokestatic j83.a (Loov;)Loov;
      // 35: athrow
      // 36: ifne 41
      // 39: aload 0
      // 3a: invokevirtual j83.cgq ()V
      // 3d: iload 2
      // 3e: ifeq 4e
      // 41: getstatic j83$ip8.z2b Lj83$ip8;
      // 44: putstatic j83.gux Lj83$ip8;
      // 47: goto 4e
      // 4a: invokestatic j83.a (Loov;)Loov;
      // 4d: athrow
      // 4e: aload 0
      // 4f: getfield j83.xzx Lq6h;
      // 52: invokevirtual q6h.u1k ()V
      // 55: return
   }

   public void uwp() {
      uci var2 = this.fs8.tij.fgp();
      sa6 var3 = null;
      int var10000 = OpaquePredicate.b();
      q2m var4 = var2.zov(this.fs8.vg8.noc());
      int var1 = var10000;

      label50: {
         label49: {
            try {
               var10 = var4;
               if (var1 == 0) {
                  break label49;
               }

               if (var4 == null) {
                  break label50;
               }
            } catch (oov var8) {
               throw a(var8);
            }

            var10 = var4;
         }

         int var5 = var10.z84().h6w();
         if (var5 >= 0) {
            var3 = var2.d_n(3 + var5);
         }
      }

      label41: {
         label40: {
            try {
               var11 = var3;
               if (var1 == 0) {
                  break label41;
               }

               if (var3 != null) {
                  break label40;
               }
            } catch (oov var7) {
               throw a(var7);
            }

            var11 = var2.d_n(1);
            break label41;
         }

         var11 = var3;
      }

      sa6 var9 = var11;

      try {
         if (var9 != null) {
            this.y2g(var9);
         }
      } catch (oov var6) {
         throw a(var6);
      }
   }

   private void y2g(sa6 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic j83.a J
      // 003: ldc2_w 58005884206491
      // 006: lxor
      // 007: lstore 2
      // 008: aload 1
      // 009: invokevirtual sa6.doy ()Luci;
      // 00c: astore 5
      // 00e: aload 5
      // 010: aload 1
      // 011: invokevirtual uci.oga (Lsa6;)Ljava/util/Collection;
      // 014: astore 6
      // 016: invokestatic OpaquePredicate.c ()I
      // 019: aload 6
      // 01b: new j83$1
      // 01e: dup
      // 01f: aload 0
      // 020: invokespecial j83$1.<init> (Lj83;)V
      // 023: invokestatic com/google/common/collect/Iterables.filter (Ljava/lang/Iterable;Lcom/google/common/base/Predicate;)Ljava/lang/Iterable;
      // 026: invokestatic com/google/common/collect/Lists.newArrayList (Ljava/lang/Iterable;)Ljava/util/ArrayList;
      // 029: astore 7
      // 02b: istore 4
      // 02d: aload 7
      // 02f: iload 4
      // 031: ifne 065
      // 034: invokevirtual java/util/ArrayList.size ()I
      // 037: bipush 15
      // 039: if_icmple 05c
      // 03c: goto 043
      // 03f: invokestatic j83.a (Loov;)Loov;
      // 042: athrow
      // 043: aload 7
      // 045: aload 6
      // 047: invokeinterface java/util/Collection.size ()I 1
      // 04c: bipush 15
      // 04e: isub
      // 04f: invokestatic com/google/common/collect/Iterables.skip (Ljava/lang/Iterable;I)Ljava/lang/Iterable;
      // 052: invokestatic com/google/common/collect/Lists.newArrayList (Ljava/lang/Iterable;)Ljava/util/ArrayList;
      // 055: astore 8
      // 057: iload 4
      // 059: ifeq 067
      // 05c: aload 7
      // 05e: goto 065
      // 061: invokestatic j83.a (Loov;)Loov;
      // 064: athrow
      // 065: astore 8
      // 067: aload 8
      // 069: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 06c: astore 9
      // 06e: aload 9
      // 070: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 075: ifeq 13c
      // 078: aload 9
      // 07a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 07f: astore 10
      // 081: aload 10
      // 083: checkcast r11
      // 086: astore 11
      // 088: aload 5
      // 08a: aload 11
      // 08c: invokevirtual r11.tg2 ()Ljava/lang/String;
      // 08f: invokevirtual uci.zov (Ljava/lang/String;)Lq2m;
      // 092: astore 12
      // 094: aload 12
      // 096: aload 11
      // 098: invokevirtual r11.tg2 ()Ljava/lang/String;
      // 09b: invokestatic q2m.x0i (Ln_0;Ljava/lang/String;)Ljava/lang/String;
      // 09e: astore 13
      // 0a0: bipush 0
      // 0a1: istore 14
      // 0a3: getstatic j83.b Ljava/lang/String;
      // 0a6: nop
      // 0a7: astore 15
      // 0a9: aload 15
      // 0ab: invokevirtual java/lang/String.toCharArray ()[C
      // 0ae: astore 16
      // 0b0: aload 16
      // 0b2: arraylength
      // 0b3: istore 17
      // 0b5: bipush 0
      // 0b6: istore 18
      // 0b8: iload 18
      // 0ba: iload 17
      // 0bc: if_icmpge 0f6
      // 0bf: aload 16
      // 0c1: iload 18
      // 0c3: caload
      // 0c4: istore 19
      // 0c6: iload 4
      // 0c8: ifne 0f1
      // 0cb: aload 13
      // 0cd: iload 19
      // 0cf: invokestatic java/lang/String.valueOf (C)Ljava/lang/String;
      // 0d2: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 0d5: iload 4
      // 0d7: ifne 0f8
      // 0da: goto 0e1
      // 0dd: invokestatic j83.a (Loov;)Loov;
      // 0e0: athrow
      // 0e1: ifeq 0ee
      // 0e4: goto 0eb
      // 0e7: invokestatic j83.a (Loov;)Loov;
      // 0ea: athrow
      // 0eb: iinc 14 1
      // 0ee: iinc 18 1
      // 0f1: iload 4
      // 0f3: ifeq 0b8
      // 0f6: iload 14
      // 0f8: aload 15
      // 0fa: invokevirtual java/lang/String.length ()I
      // 0fd: if_icmpne 137
      // 100: getstatic j83.gux Lj83$ip8;
      // 103: iload 4
      // 105: ifne 12d
      // 108: goto 10f
      // 10b: invokestatic j83.a (Loov;)Loov;
      // 10e: athrow
      // 10f: getstatic j83$ip8.z2b Lj83$ip8;
      // 112: if_acmpeq 137
      // 115: goto 11c
      // 118: invokestatic j83.a (Loov;)Loov;
      // 11b: athrow
      // 11c: getstatic ClientState.qkk Lzwr;
      // 11f: bipush 1
      // 120: putfield ClientState.uzb Z
      // 123: getstatic j83$ip8.z2b Lj83$ip8;
      // 126: goto 12d
      // 129: invokestatic j83.a (Loov;)Loov;
      // 12c: athrow
      // 12d: putstatic j83.gux Lj83$ip8;
      // 130: getstatic j83.ef8 Lj83;
      // 133: bipush 1
      // 134: putfield j83.oqk Z
      // 137: iload 4
      // 139: ifeq 06e
      // 13c: return
   }

   public native void cgq();

   public static j83$ip8 v1z() {
      return gux;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-678625125669414634L, -5086799254619218364L, MethodHandles.lookup().lookupClass()).a(80859976250383L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 109138023505325L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u008afH\u0086\u0002ü\u008bÌ@0ï²q¤\u0082æ".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
      NativeLoader.verifyIntegrity(8);
      gux = j83$ip8.rk0;
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
}
