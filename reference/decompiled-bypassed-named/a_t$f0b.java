import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class a_t$f0b extends s24 {
   private ha9 _76;
   private int pw6;
   private int z_f;
   private a_t zuw;
   private static final long a;
   private static final String b;

   public a_t$f0b(a_t var1) {
      super(var1, ha9.class, true);
      this.zuw = var1;
   }

   @Override
   public boolean vle() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual a_t$f0b.uyl ()D
      // 04: dstore 2
      // 05: invokestatic OpaquePredicate.c ()I
      // 08: aload 0
      // 09: getfield a_t$f0b.pf7 Llaq;
      // 0c: getfield EntityPlayer.oay Lt9d;
      // 0f: ldc ha9
      // 11: nop
      // 12: aload 0
      // 13: getfield a_t$f0b.pf7 Llaq;
      // 16: invokevirtual EntityPlayer.aaw ()Lnh4;
      // 19: dload 2
      // 1a: ldc2_w 4.0
      // 1d: dload 2
      // 1e: invokevirtual nh4.c2h (DDD)Lnh4;
      // 21: aload 0
      // 22: getfield a_t$f0b.p6x Lcom/google/common/base/Predicate;
      // 25: invokevirtual OpaquePredicate.vie (Ljava/lang/Class;Lnh4;Lcom/google/common/base/Predicate;)Ljava/util/List;
      // 28: astore 4
      // 2a: istore 1
      // 2b: aload 4
      // 2d: aload 0
      // 2e: getfield a_t$f0b.q3q Ls24$tx3;
      // 31: invokestatic java/util/Collections.sort (Ljava/util/List;Ljava/util/Comparator;)V
      // 34: aload 4
      // 36: invokeinterface java/util/List.isEmpty ()Z 1
      // 3b: iload 1
      // 3c: ifne 5f
      // 3f: ifeq 4f
      // 42: goto 49
      // 45: invokestatic a_t$f0b.a (Loov;)Loov;
      // 48: athrow
      // 49: bipush 0
      // 4a: ireturn
      // 4b: invokestatic a_t$f0b.a (Loov;)Loov;
      // 4e: athrow
      // 4f: aload 0
      // 50: aload 4
      // 52: bipush 0
      // 53: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 58: checkcast ha9
      // 5b: putfield a_t$f0b._76 Lha9;
      // 5e: bipush 1
      // 5f: ireturn
   }

   @Override
   public void mnp() {
      this.pw6 = 5;
      this.z_f = 0;
   }

   @Override
   public void zly() {
      this._76 = null;
      this.zuw.tjx(false);
      _4o var1 = this.zuw.dgt(m6d.w7i);
      var1.se8(a_t.s6z());
      super.zly();
   }

   @Override
   public boolean wh3() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 59
      // 09: getfield a_t$f0b._76 Lha9;
      // 0c: ifnull 58
      // 0f: goto 16
      // 12: invokestatic a_t$f0b.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield a_t$f0b.zuw La_t;
      // 1a: aload 0
      // 1b: getfield a_t$f0b._76 Lha9;
      // 1e: invokestatic a_t.hm1 (La_t;Lha9;)Z
      // 21: iload 1
      // 22: ifeq 57
      // 25: goto 2c
      // 28: invokestatic a_t$f0b.a (Loov;)Loov;
      // 2b: athrow
      // 2c: ifne 3c
      // 2f: goto 36
      // 32: invokestatic a_t$f0b.a (Loov;)Loov;
      // 35: athrow
      // 36: bipush 0
      // 37: ireturn
      // 38: invokestatic a_t$f0b.a (Loov;)Loov;
      // 3b: athrow
      // 3c: aload 0
      // 3d: getfield a_t$f0b.zuw La_t;
      // 40: bipush 1
      // 41: invokestatic a_t.vwt (La_t;Z)Z
      // 44: pop
      // 45: aload 0
      // 46: getfield a_t$f0b.zuw La_t;
      // 49: aload 0
      // 4a: getfield a_t$f0b._76 Lha9;
      // 4d: ldc 10.0
      // 4f: nop
      // 50: ldc 10.0
      // 52: nop
      // 53: invokevirtual a_t.fm3 (Li2h;FF)V
      // 56: bipush 1
      // 57: ireturn
      // 58: aload 0
      // 59: invokespecial s24.wh3 ()Z
      // 5c: ireturn
   }

   @Override
   public void iad() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic a_t$f0b.a J
      // 003: ldc2_w 103369543258250
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: getfield a_t$f0b._76 Lha9;
      // 010: iload 3
      // 011: ifeq 09b
      // 014: ifnull 085
      // 017: goto 01e
      // 01a: invokestatic a_t$f0b.a (Loov;)Loov;
      // 01d: athrow
      // 01e: aload 0
      // 01f: dup
      // 020: iload 3
      // 021: ifeq 047
      // 024: goto 02b
      // 027: invokestatic a_t$f0b.a (Loov;)Loov;
      // 02a: athrow
      // 02b: getfield a_t$f0b.pw6 I
      // 02e: bipush 1
      // 02f: isub
      // 030: dup_x1
      // 031: putfield a_t$f0b.pw6 I
      // 034: ifgt 18f
      // 037: goto 03e
      // 03a: invokestatic a_t$f0b.a (Loov;)Loov;
      // 03d: athrow
      // 03e: aload 0
      // 03f: aload 0
      // 040: goto 047
      // 043: invokestatic a_t$f0b.a (Loov;)Loov;
      // 046: athrow
      // 047: getfield a_t$f0b._76 Lha9;
      // 04a: putfield a_t$f0b.h94 Lg_3;
      // 04d: aload 0
      // 04e: aconst_null
      // 04f: putfield a_t$f0b._76 Lha9;
      // 052: aload 0
      // 053: invokespecial s24.mnp ()V
      // 056: aload 0
      // 057: getfield a_t$f0b.zuw La_t;
      // 05a: getstatic a_t$f0b.b Ljava/lang/String;
      // 05d: nop
      // 05e: fconst_1
      // 05f: fconst_1
      // 060: invokevirtual a_t.lhu (Ljava/lang/String;FF)V
      // 063: aload 0
      // 064: getfield a_t$f0b.zuw La_t;
      // 067: bipush 1
      // 068: invokevirtual a_t.tjx (Z)V
      // 06b: aload 0
      // 06c: getfield a_t$f0b.zuw La_t;
      // 06f: getstatic m6d.w7i Lw9p;
      // 072: invokevirtual a_t.dgt (Lw9p;)L_4o;
      // 075: astore 4
      // 077: aload 4
      // 079: invokestatic a_t.s6z ()Lxk5;
      // 07c: invokeinterface _4o.vcr (Lxk5;)V 2
      // 081: iload 3
      // 082: ifne 18f
      // 085: aload 0
      // 086: iload 3
      // 087: ifeq 18c
      // 08a: goto 091
      // 08d: invokestatic a_t$f0b.a (Loov;)Loov;
      // 090: athrow
      // 091: getfield a_t$f0b.h94 Lg_3;
      // 094: goto 09b
      // 097: invokestatic a_t$f0b.a (Loov;)Loov;
      // 09a: athrow
      // 09b: ifnull 18b
      // 09e: aload 0
      // 09f: getfield a_t$f0b.h94 Lg_3;
      // 0a2: instanceof ha9
      // 0a5: iload 3
      // 0a6: ifeq 13a
      // 0a9: goto 0b0
      // 0ac: invokestatic a_t$f0b.a (Loov;)Loov;
      // 0af: athrow
      // 0b0: ifeq 119
      // 0b3: goto 0ba
      // 0b6: invokestatic a_t$f0b.a (Loov;)Loov;
      // 0b9: athrow
      // 0ba: aload 0
      // 0bb: getfield a_t$f0b.zuw La_t;
      // 0be: aload 0
      // 0bf: getfield a_t$f0b.h94 Lg_3;
      // 0c2: checkcast ha9
      // 0c5: invokestatic a_t.hm1 (La_t;Lha9;)Z
      // 0c8: iload 3
      // 0c9: ifeq 13a
      // 0cc: goto 0d3
      // 0cf: invokestatic a_t$f0b.a (Loov;)Loov;
      // 0d2: athrow
      // 0d3: ifeq 119
      // 0d6: goto 0dd
      // 0d9: invokestatic a_t$f0b.a (Loov;)Loov;
      // 0dc: athrow
      // 0dd: aload 0
      // 0de: iload 3
      // 0df: ifeq 111
      // 0e2: goto 0e9
      // 0e5: invokestatic a_t$f0b.a (Loov;)Loov;
      // 0e8: athrow
      // 0e9: getfield a_t$f0b.h94 Lg_3;
      // 0ec: aload 0
      // 0ed: getfield a_t$f0b.zuw La_t;
      // 0f0: invokevirtual Entity.wxg (Li2h;)D
      // 0f3: ldc2_w 16.0
      // 0f6: dcmpg
      // 0f7: ifge 110
      // 0fa: goto 101
      // 0fd: invokestatic a_t$f0b.a (Loov;)Loov;
      // 100: athrow
      // 101: aload 0
      // 102: getfield a_t$f0b.zuw La_t;
      // 105: invokevirtual a_t.plc ()Z
      // 108: pop
      // 109: goto 110
      // 10c: invokestatic a_t$f0b.a (Loov;)Loov;
      // 10f: athrow
      // 110: aload 0
      // 111: bipush 0
      // 112: putfield a_t$f0b.z_f I
      // 115: iload 3
      // 116: ifne 18b
      // 119: aload 0
      // 11a: iload 3
      // 11b: ifeq 18c
      // 11e: goto 125
      // 121: invokestatic a_t$f0b.a (Loov;)Loov;
      // 124: athrow
      // 125: getfield a_t$f0b.h94 Lg_3;
      // 128: aload 0
      // 129: getfield a_t$f0b.zuw La_t;
      // 12c: invokevirtual Entity.wxg (Li2h;)D
      // 12f: ldc2_w 256.0
      // 132: dcmpl
      // 133: goto 13a
      // 136: invokestatic a_t$f0b.a (Loov;)Loov;
      // 139: athrow
      // 13a: ifle 18b
      // 13d: aload 0
      // 13e: iload 3
      // 13f: ifeq 18c
      // 142: goto 149
      // 145: invokestatic a_t$f0b.a (Loov;)Loov;
      // 148: athrow
      // 149: dup
      // 14a: getfield a_t$f0b.z_f I
      // 14d: dup_x1
      // 14e: bipush 1
      // 14f: iadd
      // 150: putfield a_t$f0b.z_f I
      // 153: bipush 30
      // 155: if_icmplt 18b
      // 158: goto 15f
      // 15b: invokestatic a_t$f0b.a (Loov;)Loov;
      // 15e: athrow
      // 15f: aload 0
      // 160: iload 3
      // 161: ifeq 18c
      // 164: goto 16b
      // 167: invokestatic a_t$f0b.a (Loov;)Loov;
      // 16a: athrow
      // 16b: getfield a_t$f0b.zuw La_t;
      // 16e: aload 0
      // 16f: getfield a_t$f0b.h94 Lg_3;
      // 172: invokevirtual a_t.i2r (Li2h;)Z
      // 175: ifeq 18b
      // 178: goto 17f
      // 17b: invokestatic a_t$f0b.a (Loov;)Loov;
      // 17e: athrow
      // 17f: aload 0
      // 180: bipush 0
      // 181: putfield a_t$f0b.z_f I
      // 184: goto 18b
      // 187: invokestatic a_t$f0b.a (Loov;)Loov;
      // 18a: athrow
      // 18b: aload 0
      // 18c: invokespecial s24.iad ()V
      // 18f: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(8494190583850477662L, 555381450258209908L, MethodHandles.lookup().lookupClass()).a(228498355153274L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 1036891702822L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("/úv¢N*s8T\t¬FÂ\u0085Ï²Ä\u0000RÃ\u009dy$Ü".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
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
