import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ryw extends Module {
   private static final long a;
   private static final String f;

   public ryw() {
      long var1 = a ^ 130100269114796L;
      super(f, _aj.sxc, false, new SubEngine[0]);
   }

   private double qng(double var1, double var3, float var5, double var6) {
      return var1 + (var3 - var1) * (double)var5 - var6;
   }

   @EventHandler(
      jn1 = 3
   )
   public void mlp(b5k param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 2
      // 004: invokestatic uj3.o1c ()Ljava/util/List;
      // 007: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 00c: astore 3
      // 00d: aload 3
      // 00e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 013: ifeq 1a1
      // 016: aload 3
      // 017: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 01c: checkcast Entity
      // 01f: astore 4
      // 021: aload 4
      // 023: invokestatic y3e.ml_ (Lg_3;)Z
      // 026: ifne 030
      // 029: goto 00d
      // 02c: invokestatic ryw.a (Loov;)Loov;
      // 02f: athrow
      // 030: aload 0
      // 031: aload 4
      // 033: getfield Entity.ivp D
      // 036: aload 4
      // 038: getfield Entity.o2v D
      // 03b: aload 1
      // 03c: invokevirtual b5k._x5 ()F
      // 03f: aload 0
      // 040: pop
      // 041: getstatic ryw.ek1 Lc05;
      // 044: invokevirtual Minecraft.ibs ()Lhr_;
      // 047: invokevirtual hr_.yky ()D
      // 04a: invokespecial ryw.qng (DDFD)D
      // 04d: dstore 5
      // 04f: aload 0
      // 050: aload 4
      // 052: getfield Entity.c54 D
      // 055: aload 4
      // 057: getfield Entity.kfp D
      // 05a: aload 1
      // 05b: invokevirtual b5k._x5 ()F
      // 05e: aload 0
      // 05f: pop
      // 060: getstatic ryw.ek1 Lc05;
      // 063: invokevirtual Minecraft.ibs ()Lhr_;
      // 066: invokevirtual hr_.fxk ()D
      // 069: invokespecial ryw.qng (DDFD)D
      // 06c: dstore 7
      // 06e: aload 0
      // 06f: aload 4
      // 071: getfield Entity.e2b D
      // 074: aload 4
      // 076: getfield Entity.vbd D
      // 079: aload 1
      // 07a: invokevirtual b5k._x5 ()F
      // 07d: aload 0
      // 07e: pop
      // 07f: getstatic ryw.ek1 Lc05;
      // 082: invokevirtual Minecraft.ibs ()Lhr_;
      // 085: invokevirtual hr_.kux ()D
      // 088: invokespecial ryw.qng (DDFD)D
      // 08b: dstore 9
      // 08d: invokestatic org/lwjgl/opengl/GL11.glLoadIdentity ()V
      // 090: aload 0
      // 091: pop
      // 092: getstatic ryw.ek1 Lc05;
      // 095: getfield Minecraft.x0p Lv3i;
      // 098: aload 1
      // 099: invokevirtual b5k._x5 ()F
      // 09c: invokevirtual v3i.pmp (F)V
      // 09f: fconst_2
      // 0a0: invokestatic iyr.kfe (F)V
      // 0a3: fconst_1
      // 0a4: fconst_1
      // 0a5: fconst_1
      // 0a6: fconst_1
      // 0a7: invokestatic hzu.wn0 (FFFF)V
      // 0aa: aload 0
      // 0ab: pop
      // 0ac: getstatic ryw.ek1 Lc05;
      // 0af: getfield Minecraft.vg8 Ll86;
      // 0b2: aload 4
      // 0b4: invokevirtual EntityPlayerSP.tm6 (Li2h;)F
      // 0b7: fstore 11
      // 0b9: getstatic ClientState.qkk Lzwr;
      // 0bc: invokevirtual ClientState.w34 ()Lf62;
      // 0bf: aload 4
      // 0c1: invokevirtual Entity.noc ()Ljava/lang/String;
      // 0c4: invokevirtual f62.jzk (Ljava/lang/String;)Z
      // 0c7: iload 2
      // 0c8: ifne 0fa
      // 0cb: ifeq 0ed
      // 0ce: goto 0d5
      // 0d1: invokestatic ryw.a (Loov;)Loov;
      // 0d4: athrow
      // 0d5: ldc 0.3
      // 0d7: nop
      // 0d8: ldc 0.3
      // 0da: nop
      // 0db: fconst_1
      // 0dc: ldc 0.7
      // 0de: nop
      // 0df: invokestatic hzu.wn0 (FFFF)V
      // 0e2: iload 2
      // 0e3: ifeq 172
      // 0e6: goto 0ed
      // 0e9: invokestatic ryw.a (Loov;)Loov;
      // 0ec: athrow
      // 0ed: getstatic ModuleRegistry.nd5 Lfyk;
      // 0f0: invokevirtual KillAura.isEnabled ()Z
      // 0f3: goto 0fa
      // 0f6: invokestatic ryw.a (Loov;)Loov;
      // 0f9: athrow
      // 0fa: iload 2
      // 0fb: ifne 141
      // 0fe: ifeq 129
      // 101: goto 108
      // 104: invokestatic ryw.a (Loov;)Loov;
      // 107: athrow
      // 108: getstatic KillAura.kfa Lg_3;
      // 10b: aload 4
      // 10d: if_acmpne 129
      // 110: goto 117
      // 113: invokestatic ryw.a (Loov;)Loov;
      // 116: athrow
      // 117: fconst_1
      // 118: fconst_1
      // 119: fconst_0
      // 11a: fconst_1
      // 11b: invokestatic hzu.wn0 (FFFF)V
      // 11e: iload 2
      // 11f: ifeq 172
      // 122: goto 129
      // 125: invokestatic ryw.a (Loov;)Loov;
      // 128: athrow
      // 129: fload 11
      // 12b: ldc 32.0
      // 12d: nop
      // 12e: iload 2
      // 12f: ifne 16b
      // 132: goto 139
      // 135: invokestatic ryw.a (Loov;)Loov;
      // 138: athrow
      // 139: fcmpg
      // 13a: goto 141
      // 13d: invokestatic ryw.a (Loov;)Loov;
      // 140: athrow
      // 141: ifgt 162
      // 144: fconst_1
      // 145: fload 11
      // 147: ldc 32.0
      // 149: nop
      // 14a: fdiv
      // 14b: fload 11
      // 14d: ldc 32.0
      // 14f: nop
      // 150: fdiv
      // 151: ldc 0.7
      // 153: nop
      // 154: invokestatic hzu.wn0 (FFFF)V
      // 157: iload 2
      // 158: ifeq 172
      // 15b: goto 162
      // 15e: invokestatic ryw.a (Loov;)Loov;
      // 161: athrow
      // 162: fconst_1
      // 163: fconst_1
      // 164: goto 16b
      // 167: invokestatic ryw.a (Loov;)Loov;
      // 16a: athrow
      // 16b: fconst_1
      // 16c: ldc 0.7
      // 16e: nop
      // 16f: invokestatic hzu.wn0 (FFFF)V
      // 172: bipush 1
      // 173: invokestatic org/lwjgl/opengl/GL11.glBegin (I)V
      // 176: dconst_0
      // 177: getstatic ryw.ek1 Lc05;
      // 17a: getfield Minecraft.vg8 Ll86;
      // 17d: invokevirtual EntityPlayerSP.c5y ()F
      // 180: f2d
      // 181: dconst_0
      // 182: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 185: dload 5
      // 187: dload 7
      // 189: dconst_1
      // 18a: dadd
      // 18b: dload 9
      // 18d: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 190: invokestatic org/lwjgl/opengl/GL11.glEnd ()V
      // 193: invokestatic iyr.x6v ()V
      // 196: fconst_1
      // 197: fconst_1
      // 198: fconst_1
      // 199: fconst_1
      // 19a: invokestatic hzu.wn0 (FFFF)V
      // 19d: iload 2
      // 19e: ifeq 00d
      // 1a1: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-7882567312207021745L, -7055781496004493868L, MethodHandles.lookup().lookupClass()).a(167572094059045L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 1753144921851L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("¤ù\u00ad?\u0018p;\u0096".getBytes("ISO-8859-1"));
      String var6 = b(var4).intern();
      byte var10001 = -1;
      f = var6;
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
}
