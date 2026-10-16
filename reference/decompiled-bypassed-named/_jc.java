import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class _jc {
   public List o5z = Lists.newArrayList();
   public List wjd = Lists.newArrayList();
   public int h7l;
   public List b57 = Lists.newArrayList();
   private static final long a;
   private static final String c;

   public vrx zmp(vrx var1) {
      var1.zfh = this.wjd.size();
      this.wjd.add(var1);
      this.o5z.add((erg)null);
      return var1;
   }

   public void c_j(flv param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic _jc.a J
      // 03: ldc2_w 63159682842378
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: getfield _jc.b57 Ljava/util/List;
      // 11: aload 1
      // 12: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 17: iload 4
      // 19: ifne 40
      // 1c: ifeq 36
      // 1f: goto 26
      // 22: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 25: athrow
      // 26: new java/lang/IllegalArgumentException
      // 29: dup
      // 2a: getstatic _jc.c Ljava/lang/String;
      // 2d: nop
      // 2e: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 31: athrow
      // 32: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 35: athrow
      // 36: aload 0
      // 37: getfield _jc.b57 Ljava/util/List;
      // 3a: aload 1
      // 3b: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 40: pop
      // 41: aload 1
      // 42: aload 0
      // 43: aload 0
      // 44: invokevirtual _jc.kpj ()Ljava/util/List;
      // 47: invokeinterface flv.ynq (L_jc;Ljava/util/List;)V 3
      // 4c: aload 0
      // 4d: invokevirtual _jc.n4z ()V
      // 50: return
   }

   public void xku(flv var1) {
      this.b57.remove(var1);
   }

   public List kpj() {
      ArrayList var2 = Lists.newArrayList();
      int var10000 = OpaquePredicate.b();
      int var3 = 0;
      int var1 = var10000;

      while (true) {
         if (var3 < this.wjd.size()) {
            try {
               var5 = var2;
               if (var1 == 0) {
                  break;
               }

               var2.add(((vrx)this.wjd.get(var3)).x4s());
               var3++;
               if (var1 != 0) {
                  continue;
               }
            } catch (IllegalArgumentException var4) {
               throw a(var4);
            }
         }

         var5 = var2;
         break;
      }

      return var5;
   }

   public void n4z() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: bipush 0
      // 05: istore 2
      // 06: iload 2
      // 07: aload 0
      // 08: getfield _jc.wjd Ljava/util/List;
      // 0b: invokeinterface java/util/List.size ()I 1
      // 10: if_icmpge b9
      // 13: aload 0
      // 14: getfield _jc.wjd Ljava/util/List;
      // 17: iload 2
      // 18: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 1d: checkcast vrx
      // 20: invokevirtual vrx.x4s ()Lerg;
      // 23: astore 3
      // 24: aload 0
      // 25: getfield _jc.o5z Ljava/util/List;
      // 28: iload 2
      // 29: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 2e: checkcast erg
      // 31: astore 4
      // 33: iload 1
      // 34: ifeq b5
      // 37: aload 4
      // 39: aload 3
      // 3a: invokestatic erg.c6l (Lerg;Lerg;)Z
      // 3d: ifne b2
      // 40: goto 47
      // 43: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 46: athrow
      // 47: aload 3
      // 48: iload 1
      // 49: ifeq 66
      // 4c: goto 53
      // 4f: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 52: athrow
      // 53: ifnonnull 65
      // 56: goto 5d
      // 59: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5c: athrow
      // 5d: aconst_null
      // 5e: goto 69
      // 61: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 64: athrow
      // 65: aload 3
      // 66: invokevirtual erg.yaq ()Lerg;
      // 69: astore 4
      // 6b: aload 0
      // 6c: getfield _jc.o5z Ljava/util/List;
      // 6f: iload 2
      // 70: aload 4
      // 72: invokeinterface java/util/List.set (ILjava/lang/Object;)Ljava/lang/Object; 3
      // 77: pop
      // 78: bipush 0
      // 79: istore 5
      // 7b: iload 5
      // 7d: aload 0
      // 7e: getfield _jc.b57 Ljava/util/List;
      // 81: invokeinterface java/util/List.size ()I 1
      // 86: if_icmpge b2
      // 89: aload 0
      // 8a: getfield _jc.b57 Ljava/util/List;
      // 8d: iload 5
      // 8f: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 94: checkcast flv
      // 97: aload 0
      // 98: iload 2
      // 99: aload 4
      // 9b: invokeinterface flv.r83 (L_jc;ILerg;)V 4
      // a0: iinc 5 1
      // a3: iload 1
      // a4: ifeq b5
      // a7: iload 1
      // a8: ifne 7b
      // ab: goto b2
      // ae: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // b1: athrow
      // b2: iinc 2 1
      // b5: iload 1
      // b6: ifne 06
      // b9: return
   }

   public boolean lza(ha9 var1, int var2) {
      return false;
   }

   public vrx s4t(rsi param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: bipush 0
      // 05: istore 4
      // 07: iload 4
      // 09: aload 0
      // 0a: getfield _jc.wjd Ljava/util/List;
      // 0d: invokeinterface java/util/List.size ()I 1
      // 12: if_icmpge 48
      // 15: aload 0
      // 16: getfield _jc.wjd Ljava/util/List;
      // 19: iload 4
      // 1b: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 20: checkcast vrx
      // 23: astore 5
      // 25: iload 3
      // 26: ifeq 44
      // 29: aload 5
      // 2b: aload 1
      // 2c: iload 2
      // 2d: invokevirtual vrx.a6m (Lrsi;I)Z
      // 30: ifeq 41
      // 33: goto 3a
      // 36: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 39: athrow
      // 3a: aload 5
      // 3c: areturn
      // 3d: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 40: athrow
      // 41: iinc 4 1
      // 44: iload 3
      // 45: ifne 07
      // 48: aconst_null
      // 49: areturn
   }

   public vrx ajr(int var1) {
      return (vrx)this.wjd.get(var1);
   }

   public erg za4(ha9 var1, int var2) {
      int var3 = OpaquePredicate.c();
      vrx var4 = (vrx)this.wjd.get(var2);

      try {
         if (var3 != 0) {
            return var4.x4s();
         }

         if (var4 == null) {
            return null;
         }
      } catch (IllegalArgumentException var5) {
         throw a(var5);
      }

      return var4.x4s();
   }

   public erg b7m(int param1, int param2, int param3, ha9 param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aconst_null
      // 001: astore 6
      // 003: invokestatic OpaquePredicate.c ()I
      // 006: aload 4
      // 008: getfield ha9.up_ Ljnq;
      // 00b: astore 7
      // 00d: istore 5
      // 00f: iload 3
      // 010: iload 5
      // 012: ifne 3bf
      // 015: bipush 5
      // 016: if_icmpne 3b4
      // 019: goto 020
      // 01c: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 01f: athrow
      // 020: aload 0
      // 021: getfield _jc.e_q I
      // 024: istore 8
      // 026: aload 0
      // 027: iload 2
      // 028: invokestatic _jc.abk (I)I
      // 02b: putfield _jc.e_q I
      // 02e: iload 8
      // 030: bipush 1
      // 031: iload 5
      // 033: ifne 068
      // 036: if_icmpne 05b
      // 039: goto 040
      // 03c: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 03f: athrow
      // 040: aload 0
      // 041: getfield _jc.e_q I
      // 044: bipush 2
      // 045: iload 5
      // 047: ifne 068
      // 04a: goto 051
      // 04d: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 050: athrow
      // 051: if_icmpeq 07b
      // 054: goto 05b
      // 057: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 05a: athrow
      // 05b: iload 8
      // 05d: aload 0
      // 05e: getfield _jc.e_q I
      // 061: goto 068
      // 064: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 067: athrow
      // 068: if_icmpeq 07b
      // 06b: aload 0
      // 06c: invokevirtual _jc.ii0 ()V
      // 06f: iload 5
      // 071: ifeq 3af
      // 074: goto 07b
      // 077: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 07a: athrow
      // 07b: aload 7
      // 07d: invokevirtual jnq.zet ()Lerg;
      // 080: ifnonnull 09a
      // 083: goto 08a
      // 086: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 089: athrow
      // 08a: aload 0
      // 08b: invokevirtual _jc.ii0 ()V
      // 08e: iload 5
      // 090: ifeq 3af
      // 093: goto 09a
      // 096: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 099: athrow
      // 09a: aload 0
      // 09b: getfield _jc.e_q I
      // 09e: iload 5
      // 0a0: ifne 110
      // 0a3: goto 0aa
      // 0a6: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a9: athrow
      // 0aa: ifne 105
      // 0ad: goto 0b4
      // 0b0: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0b3: athrow
      // 0b4: aload 0
      // 0b5: iload 2
      // 0b6: invokestatic _jc.i9k (I)I
      // 0b9: putfield _jc.xj1 I
      // 0bc: aload 0
      // 0bd: iload 5
      // 0bf: ifne 0fd
      // 0c2: goto 0c9
      // 0c5: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0c8: athrow
      // 0c9: getfield _jc.xj1 I
      // 0cc: aload 4
      // 0ce: invokestatic _jc.hne (ILha9;)Z
      // 0d1: ifeq 0f5
      // 0d4: goto 0db
      // 0d7: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0da: athrow
      // 0db: aload 0
      // 0dc: bipush 1
      // 0dd: putfield _jc.e_q I
      // 0e0: aload 0
      // 0e1: getfield _jc.q6o Ljava/util/Set;
      // 0e4: invokeinterface java/util/Set.clear ()V 1
      // 0e9: iload 5
      // 0eb: ifeq 3af
      // 0ee: goto 0f5
      // 0f1: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0f4: athrow
      // 0f5: aload 0
      // 0f6: goto 0fd
      // 0f9: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0fc: athrow
      // 0fd: invokevirtual _jc.ii0 ()V
      // 100: iload 5
      // 102: ifeq 3af
      // 105: aload 0
      // 106: getfield _jc.e_q I
      // 109: goto 110
      // 10c: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 10f: athrow
      // 110: bipush 1
      // 111: iload 5
      // 113: ifne 1ed
      // 116: if_icmpne 1d5
      // 119: goto 120
      // 11c: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 11f: athrow
      // 120: aload 0
      // 121: getfield _jc.wjd Ljava/util/List;
      // 124: iload 1
      // 125: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 12a: checkcast vrx
      // 12d: astore 9
      // 12f: aload 9
      // 131: iload 5
      // 133: ifne 142
      // 136: ifnull 1d0
      // 139: goto 140
      // 13c: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 13f: athrow
      // 140: aload 9
      // 142: aload 7
      // 144: invokevirtual jnq.zet ()Lerg;
      // 147: bipush 1
      // 148: invokestatic _jc.eo5 (Lvrx;Lerg;Z)Z
      // 14b: iload 5
      // 14d: ifne 16b
      // 150: ifeq 1d0
      // 153: goto 15a
      // 156: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 159: athrow
      // 15a: aload 9
      // 15c: aload 7
      // 15e: invokevirtual jnq.zet ()Lerg;
      // 161: invokevirtual vrx.xvl (Lerg;)Z
      // 164: goto 16b
      // 167: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 16a: athrow
      // 16b: iload 5
      // 16d: ifne 189
      // 170: ifeq 1d0
      // 173: goto 17a
      // 176: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 179: athrow
      // 17a: aload 7
      // 17c: invokevirtual jnq.zet ()Lerg;
      // 17f: getfield erg.qd2 I
      // 182: goto 189
      // 185: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 188: athrow
      // 189: iload 5
      // 18b: ifne 1ae
      // 18e: aload 0
      // 18f: getfield _jc.q6o Ljava/util/Set;
      // 192: invokeinterface java/util/Set.size ()I 1
      // 197: if_icmple 1d0
      // 19a: goto 1a1
      // 19d: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1a0: athrow
      // 1a1: aload 0
      // 1a2: aload 9
      // 1a4: invokevirtual _jc.q67 (Lvrx;)Z
      // 1a7: goto 1ae
      // 1aa: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1ad: athrow
      // 1ae: iload 5
      // 1b0: ifne 1cf
      // 1b3: ifeq 1d0
      // 1b6: goto 1bd
      // 1b9: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1bc: athrow
      // 1bd: aload 0
      // 1be: getfield _jc.q6o Ljava/util/Set;
      // 1c1: aload 9
      // 1c3: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 1c8: goto 1cf
      // 1cb: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1ce: athrow
      // 1cf: pop
      // 1d0: iload 5
      // 1d2: ifeq 3af
      // 1d5: aload 0
      // 1d6: iload 5
      // 1d8: ifne 3ac
      // 1db: goto 1e2
      // 1de: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1e1: athrow
      // 1e2: getfield _jc.e_q I
      // 1e5: bipush 2
      // 1e6: goto 1ed
      // 1e9: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1ec: athrow
      // 1ed: if_icmpne 3a4
      // 1f0: aload 0
      // 1f1: iload 5
      // 1f3: ifne 39c
      // 1f6: goto 1fd
      // 1f9: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1fc: athrow
      // 1fd: getfield _jc.q6o Ljava/util/Set;
      // 200: invokeinterface java/util/Set.isEmpty ()Z 1
      // 205: ifne 39b
      // 208: goto 20f
      // 20b: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 20e: athrow
      // 20f: aload 7
      // 211: invokevirtual jnq.zet ()Lerg;
      // 214: invokevirtual erg.yaq ()Lerg;
      // 217: astore 9
      // 219: aload 7
      // 21b: invokevirtual jnq.zet ()Lerg;
      // 21e: getfield erg.qd2 I
      // 221: istore 10
      // 223: aload 0
      // 224: getfield _jc.q6o Ljava/util/Set;
      // 227: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 22c: astore 11
      // 22e: aload 11
      // 230: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 235: ifeq 382
      // 238: aload 11
      // 23a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 23f: checkcast vrx
      // 242: astore 12
      // 244: iload 5
      // 246: ifne 389
      // 249: aload 12
      // 24b: iload 5
      // 24d: ifne 263
      // 250: goto 257
      // 253: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 256: athrow
      // 257: ifnull 37d
      // 25a: goto 261
      // 25d: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 260: athrow
      // 261: aload 12
      // 263: aload 7
      // 265: invokevirtual jnq.zet ()Lerg;
      // 268: bipush 1
      // 269: invokestatic _jc.eo5 (Lvrx;Lerg;Z)Z
      // 26c: iload 5
      // 26e: ifne 28c
      // 271: ifeq 37d
      // 274: goto 27b
      // 277: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 27a: athrow
      // 27b: aload 12
      // 27d: aload 7
      // 27f: invokevirtual jnq.zet ()Lerg;
      // 282: invokevirtual vrx.xvl (Lerg;)Z
      // 285: goto 28c
      // 288: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 28b: athrow
      // 28c: iload 5
      // 28e: ifne 2aa
      // 291: ifeq 37d
      // 294: goto 29b
      // 297: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 29a: athrow
      // 29b: aload 7
      // 29d: invokevirtual jnq.zet ()Lerg;
      // 2a0: getfield erg.qd2 I
      // 2a3: goto 2aa
      // 2a6: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2a9: athrow
      // 2aa: iload 5
      // 2ac: ifne 2cf
      // 2af: aload 0
      // 2b0: getfield _jc.q6o Ljava/util/Set;
      // 2b3: invokeinterface java/util/Set.size ()I 1
      // 2b8: if_icmplt 37d
      // 2bb: goto 2c2
      // 2be: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2c1: athrow
      // 2c2: aload 0
      // 2c3: aload 12
      // 2c5: invokevirtual _jc.q67 (Lvrx;)Z
      // 2c8: goto 2cf
      // 2cb: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2ce: athrow
      // 2cf: ifeq 37d
      // 2d2: aload 9
      // 2d4: invokevirtual erg.yaq ()Lerg;
      // 2d7: astore 13
      // 2d9: aload 12
      // 2db: invokevirtual vrx.hf8 ()Z
      // 2de: iload 5
      // 2e0: ifne 2fc
      // 2e3: ifeq 2ff
      // 2e6: goto 2ed
      // 2e9: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2ec: athrow
      // 2ed: aload 12
      // 2ef: invokevirtual vrx.x4s ()Lerg;
      // 2f2: getfield erg.qd2 I
      // 2f5: goto 2fc
      // 2f8: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2fb: athrow
      // 2fc: goto 300
      // 2ff: bipush 0
      // 300: istore 14
      // 302: aload 0
      // 303: getfield _jc.q6o Ljava/util/Set;
      // 306: aload 0
      // 307: getfield _jc.xj1 I
      // 30a: aload 13
      // 30c: iload 14
      // 30e: invokestatic _jc.etx (Ljava/util/Set;ILerg;I)V
      // 311: aload 13
      // 313: getfield erg.qd2 I
      // 316: aload 13
      // 318: invokevirtual erg.h4s ()I
      // 31b: iload 5
      // 31d: ifne 347
      // 320: if_icmple 33b
      // 323: goto 32a
      // 326: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 329: athrow
      // 32a: aload 13
      // 32c: aload 13
      // 32e: invokevirtual erg.h4s ()I
      // 331: putfield erg.qd2 I
      // 334: goto 33b
      // 337: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 33a: athrow
      // 33b: aload 13
      // 33d: getfield erg.qd2 I
      // 340: aload 12
      // 342: aload 13
      // 344: invokevirtual vrx.n29 (Lerg;)I
      // 347: iload 5
      // 349: ifne 373
      // 34c: if_icmple 369
      // 34f: goto 356
      // 352: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 355: athrow
      // 356: aload 13
      // 358: aload 12
      // 35a: aload 13
      // 35c: invokevirtual vrx.n29 (Lerg;)I
      // 35f: putfield erg.qd2 I
      // 362: goto 369
      // 365: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 368: athrow
      // 369: iload 10
      // 36b: aload 13
      // 36d: getfield erg.qd2 I
      // 370: iload 14
      // 372: isub
      // 373: isub
      // 374: istore 10
      // 376: aload 12
      // 378: aload 13
      // 37a: invokevirtual vrx.yn7 (Lerg;)V
      // 37d: iload 5
      // 37f: ifeq 22e
      // 382: aload 9
      // 384: iload 10
      // 386: putfield erg.qd2 I
      // 389: aload 9
      // 38b: getfield erg.qd2 I
      // 38e: ifgt 394
      // 391: aconst_null
      // 392: astore 9
      // 394: aload 7
      // 396: aload 9
      // 398: invokevirtual jnq.uej (Lerg;)V
      // 39b: aload 0
      // 39c: invokevirtual _jc.ii0 ()V
      // 39f: iload 5
      // 3a1: ifeq 3af
      // 3a4: aload 0
      // 3a5: goto 3ac
      // 3a8: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3ab: athrow
      // 3ac: invokevirtual _jc.ii0 ()V
      // 3af: iload 5
      // 3b1: ifeq fb2
      // 3b4: aload 0
      // 3b5: getfield _jc.e_q I
      // 3b8: goto 3bf
      // 3bb: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3be: athrow
      // 3bf: iload 5
      // 3c1: ifne 3e6
      // 3c4: ifeq 3de
      // 3c7: goto 3ce
      // 3ca: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3cd: athrow
      // 3ce: aload 0
      // 3cf: invokevirtual _jc.ii0 ()V
      // 3d2: iload 5
      // 3d4: ifeq fb2
      // 3d7: goto 3de
      // 3da: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3dd: athrow
      // 3de: iload 3
      // 3df: goto 3e6
      // 3e2: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3e5: athrow
      // 3e6: iload 5
      // 3e8: ifne 40e
      // 3eb: ifeq 40d
      // 3ee: goto 3f5
      // 3f1: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3f4: athrow
      // 3f5: iload 3
      // 3f6: bipush 1
      // 3f7: iload 5
      // 3f9: ifne 9c2
      // 3fc: goto 403
      // 3ff: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 402: athrow
      // 403: if_icmpne 9c0
      // 406: goto 40d
      // 409: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 40c: athrow
      // 40d: iload 2
      // 40e: iload 5
      // 410: ifne 436
      // 413: ifeq 435
      // 416: goto 41d
      // 419: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 41c: athrow
      // 41d: iload 2
      // 41e: bipush 1
      // 41f: iload 5
      // 421: ifne 9c2
      // 424: goto 42b
      // 427: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 42a: athrow
      // 42b: if_icmpne 9c0
      // 42e: goto 435
      // 431: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 434: athrow
      // 435: iload 1
      // 436: sipush -999
      // 439: iload 5
      // 43b: ifne 4ec
      // 43e: if_icmpne 4d7
      // 441: goto 448
      // 444: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 447: athrow
      // 448: aload 7
      // 44a: invokevirtual jnq.zet ()Lerg;
      // 44d: ifnull fb2
      // 450: goto 457
      // 453: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 456: athrow
      // 457: iload 2
      // 458: iload 5
      // 45a: ifne 48b
      // 45d: goto 464
      // 460: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 463: athrow
      // 464: ifne 48a
      // 467: goto 46e
      // 46a: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 46d: athrow
      // 46e: aload 4
      // 470: aload 7
      // 472: invokevirtual jnq.zet ()Lerg;
      // 475: bipush 1
      // 476: invokevirtual ha9.ejq (Lerg;Z)Lnvf;
      // 479: pop
      // 47a: aload 7
      // 47c: aconst_null
      // 47d: checkcast erg
      // 480: invokevirtual jnq.uej (Lerg;)V
      // 483: goto 48a
      // 486: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 489: athrow
      // 48a: iload 2
      // 48b: iload 5
      // 48d: ifne 4c6
      // 490: bipush 1
      // 491: if_icmpne fb2
      // 494: goto 49b
      // 497: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 49a: athrow
      // 49b: aload 4
      // 49d: aload 7
      // 49f: invokevirtual jnq.zet ()Lerg;
      // 4a2: bipush 1
      // 4a3: invokevirtual erg.amj (I)Lerg;
      // 4a6: bipush 1
      // 4a7: invokevirtual ha9.ejq (Lerg;Z)Lnvf;
      // 4aa: pop
      // 4ab: aload 7
      // 4ad: iload 5
      // 4af: ifne 4cb
      // 4b2: goto 4b9
      // 4b5: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4b8: athrow
      // 4b9: invokevirtual jnq.zet ()Lerg;
      // 4bc: getfield erg.qd2 I
      // 4bf: goto 4c6
      // 4c2: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4c5: athrow
      // 4c6: ifne fb2
      // 4c9: aload 7
      // 4cb: aconst_null
      // 4cc: checkcast erg
      // 4cf: invokevirtual jnq.uej (Lerg;)V
      // 4d2: iload 5
      // 4d4: ifeq fb2
      // 4d7: iload 3
      // 4d8: iload 5
      // 4da: ifne 58e
      // 4dd: goto 4e4
      // 4e0: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4e3: athrow
      // 4e4: bipush 1
      // 4e5: goto 4ec
      // 4e8: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4eb: athrow
      // 4ec: if_icmpne 58d
      // 4ef: iload 1
      // 4f0: ifge 500
      // 4f3: goto 4fa
      // 4f6: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4f9: athrow
      // 4fa: aconst_null
      // 4fb: areturn
      // 4fc: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4ff: athrow
      // 500: aload 0
      // 501: getfield _jc.wjd Ljava/util/List;
      // 504: iload 1
      // 505: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 50a: checkcast vrx
      // 50d: astore 8
      // 50f: aload 8
      // 511: iload 5
      // 513: ifne 522
      // 516: ifnull 58a
      // 519: goto 520
      // 51c: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 51f: athrow
      // 520: aload 8
      // 522: aload 4
      // 524: invokevirtual vrx.fg6 (Lha9;)Z
      // 527: ifeq 58a
      // 52a: aload 0
      // 52b: aload 4
      // 52d: iload 1
      // 52e: invokevirtual _jc.za4 (Lha9;I)Lerg;
      // 531: astore 9
      // 533: aload 9
      // 535: iload 5
      // 537: ifne 546
      // 53a: ifnull 58a
      // 53d: goto 544
      // 540: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 543: athrow
      // 544: aload 9
      // 546: invokevirtual erg.gn1 ()Lu7m;
      // 549: astore 10
      // 54b: aload 9
      // 54d: invokevirtual erg.yaq ()Lerg;
      // 550: astore 6
      // 552: aload 8
      // 554: invokevirtual vrx.x4s ()Lerg;
      // 557: iload 5
      // 559: ifne 572
      // 55c: ifnull 58a
      // 55f: goto 566
      // 562: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 565: athrow
      // 566: aload 8
      // 568: invokevirtual vrx.x4s ()Lerg;
      // 56b: goto 572
      // 56e: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 571: athrow
      // 572: invokevirtual erg.gn1 ()Lu7m;
      // 575: aload 10
      // 577: if_acmpne 58a
      // 57a: aload 0
      // 57b: iload 1
      // 57c: iload 2
      // 57d: bipush 1
      // 57e: aload 4
      // 580: invokevirtual _jc.yo3 (IIZLha9;)V
      // 583: goto 58a
      // 586: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 589: athrow
      // 58a: goto fb2
      // 58d: iload 1
      // 58e: ifge 597
      // 591: aconst_null
      // 592: areturn
      // 593: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 596: athrow
      // 597: aload 0
      // 598: getfield _jc.wjd Ljava/util/List;
      // 59b: iload 1
      // 59c: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 5a1: checkcast vrx
      // 5a4: astore 8
      // 5a6: aload 8
      // 5a8: iload 5
      // 5aa: ifne 5b9
      // 5ad: ifnull 9bd
      // 5b0: goto 5b7
      // 5b3: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5b6: athrow
      // 5b7: aload 8
      // 5b9: invokevirtual vrx.x4s ()Lerg;
      // 5bc: astore 9
      // 5be: aload 7
      // 5c0: invokevirtual jnq.zet ()Lerg;
      // 5c3: astore 10
      // 5c5: aload 9
      // 5c7: iload 5
      // 5c9: ifne 5e2
      // 5cc: ifnull 5e4
      // 5cf: goto 5d6
      // 5d2: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5d5: athrow
      // 5d6: aload 9
      // 5d8: invokevirtual erg.yaq ()Lerg;
      // 5db: goto 5e2
      // 5de: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5e1: athrow
      // 5e2: astore 6
      // 5e4: aload 9
      // 5e6: iload 5
      // 5e8: ifne 5f7
      // 5eb: ifnonnull 6a7
      // 5ee: goto 5f5
      // 5f1: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5f4: athrow
      // 5f5: aload 10
      // 5f7: ifnull 9b8
      // 5fa: aload 8
      // 5fc: iload 5
      // 5fe: ifne 9ba
      // 601: goto 608
      // 604: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 607: athrow
      // 608: aload 10
      // 60a: invokevirtual vrx.xvl (Lerg;)Z
      // 60d: ifeq 9b8
      // 610: goto 617
      // 613: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 616: athrow
      // 617: iload 2
      // 618: iload 5
      // 61a: ifne 63a
      // 61d: goto 624
      // 620: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 623: athrow
      // 624: ifne 63d
      // 627: goto 62e
      // 62a: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 62d: athrow
      // 62e: aload 10
      // 630: getfield erg.qd2 I
      // 633: goto 63a
      // 636: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 639: athrow
      // 63a: goto 63e
      // 63d: bipush 1
      // 63e: istore 11
      // 640: iload 11
      // 642: aload 8
      // 644: aload 10
      // 646: invokevirtual vrx.n29 (Lerg;)I
      // 649: iload 5
      // 64b: ifne 674
      // 64e: if_icmple 661
      // 651: goto 658
      // 654: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 657: athrow
      // 658: aload 8
      // 65a: aload 10
      // 65c: invokevirtual vrx.n29 (Lerg;)I
      // 65f: istore 11
      // 661: aload 10
      // 663: getfield erg.qd2 I
      // 666: iload 5
      // 668: ifne 68f
      // 66b: iload 11
      // 66d: goto 674
      // 670: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 673: athrow
      // 674: if_icmplt 68a
      // 677: aload 8
      // 679: aload 10
      // 67b: iload 11
      // 67d: invokevirtual erg.amj (I)Lerg;
      // 680: invokevirtual vrx.yn7 (Lerg;)V
      // 683: goto 68a
      // 686: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 689: athrow
      // 68a: aload 10
      // 68c: getfield erg.qd2 I
      // 68f: ifne 6a2
      // 692: aload 7
      // 694: aconst_null
      // 695: checkcast erg
      // 698: invokevirtual jnq.uej (Lerg;)V
      // 69b: goto 6a2
      // 69e: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6a1: athrow
      // 6a2: iload 5
      // 6a4: ifeq 9b8
      // 6a7: aload 8
      // 6a9: iload 5
      // 6ab: ifne 9ba
      // 6ae: goto 6b5
      // 6b1: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6b4: athrow
      // 6b5: aload 4
      // 6b7: invokevirtual vrx.fg6 (Lha9;)Z
      // 6ba: ifeq 9b8
      // 6bd: goto 6c4
      // 6c0: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6c3: athrow
      // 6c4: aload 10
      // 6c6: ifnonnull 743
      // 6c9: goto 6d0
      // 6cc: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6cf: athrow
      // 6d0: iload 2
      // 6d1: iload 5
      // 6d3: ifne 6fa
      // 6d6: goto 6dd
      // 6d9: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6dc: athrow
      // 6dd: ifne 6f3
      // 6e0: goto 6e7
      // 6e3: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6e6: athrow
      // 6e7: aload 9
      // 6e9: getfield erg.qd2 I
      // 6ec: goto 6fc
      // 6ef: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6f2: athrow
      // 6f3: aload 9
      // 6f5: getfield erg.qd2 I
      // 6f8: bipush 1
      // 6f9: iadd
      // 6fa: bipush 2
      // 6fb: idiv
      // 6fc: istore 11
      // 6fe: aload 8
      // 700: iload 11
      // 702: invokevirtual vrx.xtx (I)Lerg;
      // 705: astore 12
      // 707: aload 7
      // 709: aload 12
      // 70b: invokevirtual jnq.uej (Lerg;)V
      // 70e: iload 5
      // 710: ifne 73e
      // 713: aload 9
      // 715: getfield erg.qd2 I
      // 718: ifne 732
      // 71b: goto 722
      // 71e: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 721: athrow
      // 722: aload 8
      // 724: aconst_null
      // 725: checkcast erg
      // 728: invokevirtual vrx.yn7 (Lerg;)V
      // 72b: goto 732
      // 72e: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 731: athrow
      // 732: aload 8
      // 734: aload 4
      // 736: aload 7
      // 738: invokevirtual jnq.zet ()Lerg;
      // 73b: invokevirtual vrx.g1d (Lha9;Lerg;)V
      // 73e: iload 5
      // 740: ifeq 9b8
      // 743: aload 8
      // 745: aload 10
      // 747: invokevirtual vrx.xvl (Lerg;)Z
      // 74a: ifeq 89d
      // 74d: goto 754
      // 750: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 753: athrow
      // 754: aload 9
      // 756: iload 5
      // 758: ifne 876
      // 75b: goto 762
      // 75e: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 761: athrow
      // 762: invokevirtual erg.gn1 ()Lu7m;
      // 765: aload 10
      // 767: invokevirtual erg.gn1 ()Lu7m;
      // 76a: if_acmpne 86d
      // 76d: goto 774
      // 770: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 773: athrow
      // 774: aload 9
      // 776: invokevirtual erg.j6_ ()I
      // 779: aload 10
      // 77b: invokevirtual erg.j6_ ()I
      // 77e: iload 5
      // 780: ifne 880
      // 783: goto 78a
      // 786: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 789: athrow
      // 78a: if_icmpne 86d
      // 78d: goto 794
      // 790: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 793: athrow
      // 794: aload 9
      // 796: aload 10
      // 798: invokestatic erg.gjp (Lerg;Lerg;)Z
      // 79b: iload 5
      // 79d: ifne 879
      // 7a0: goto 7a7
      // 7a3: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 7a6: athrow
      // 7a7: ifeq 86d
      // 7aa: goto 7b1
      // 7ad: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 7b0: athrow
      // 7b1: iload 2
      // 7b2: iload 5
      // 7b4: ifne 7d4
      // 7b7: goto 7be
      // 7ba: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 7bd: athrow
      // 7be: ifne 7d7
      // 7c1: goto 7c8
      // 7c4: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 7c7: athrow
      // 7c8: aload 10
      // 7ca: getfield erg.qd2 I
      // 7cd: goto 7d4
      // 7d0: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 7d3: athrow
      // 7d4: goto 7d8
      // 7d7: bipush 1
      // 7d8: istore 11
      // 7da: iload 11
      // 7dc: aload 8
      // 7de: aload 10
      // 7e0: invokevirtual vrx.n29 (Lerg;)I
      // 7e3: aload 9
      // 7e5: getfield erg.qd2 I
      // 7e8: isub
      // 7e9: iload 5
      // 7eb: ifne 820
      // 7ee: if_icmple 807
      // 7f1: goto 7f8
      // 7f4: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 7f7: athrow
      // 7f8: aload 8
      // 7fa: aload 10
      // 7fc: invokevirtual vrx.n29 (Lerg;)I
      // 7ff: aload 9
      // 801: getfield erg.qd2 I
      // 804: isub
      // 805: istore 11
      // 807: iload 11
      // 809: iload 5
      // 80b: ifne 849
      // 80e: aload 10
      // 810: invokevirtual erg.h4s ()I
      // 813: aload 9
      // 815: getfield erg.qd2 I
      // 818: isub
      // 819: goto 820
      // 81c: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 81f: athrow
      // 820: if_icmple 830
      // 823: aload 10
      // 825: invokevirtual erg.h4s ()I
      // 828: aload 9
      // 82a: getfield erg.qd2 I
      // 82d: isub
      // 82e: istore 11
      // 830: aload 10
      // 832: iload 11
      // 834: invokevirtual erg.amj (I)Lerg;
      // 837: pop
      // 838: aload 10
      // 83a: iload 5
      // 83c: ifne 85e
      // 83f: getfield erg.qd2 I
      // 842: goto 849
      // 845: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 848: athrow
      // 849: ifne 85c
      // 84c: aload 7
      // 84e: aconst_null
      // 84f: checkcast erg
      // 852: invokevirtual jnq.uej (Lerg;)V
      // 855: goto 85c
      // 858: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 85b: athrow
      // 85c: aload 9
      // 85e: dup
      // 85f: getfield erg.qd2 I
      // 862: iload 11
      // 864: iadd
      // 865: putfield erg.qd2 I
      // 868: iload 5
      // 86a: ifeq 9b8
      // 86d: aload 10
      // 86f: goto 876
      // 872: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 875: athrow
      // 876: getfield erg.qd2 I
      // 879: aload 8
      // 87b: aload 10
      // 87d: invokevirtual vrx.n29 (Lerg;)I
      // 880: if_icmpgt 9b8
      // 883: aload 8
      // 885: aload 10
      // 887: invokevirtual vrx.yn7 (Lerg;)V
      // 88a: aload 7
      // 88c: aload 9
      // 88e: invokevirtual jnq.uej (Lerg;)V
      // 891: iload 5
      // 893: ifeq 9b8
      // 896: goto 89d
      // 899: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 89c: athrow
      // 89d: aload 9
      // 89f: iload 5
      // 8a1: ifne 8c6
      // 8a4: goto 8ab
      // 8a7: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 8aa: athrow
      // 8ab: invokevirtual erg.gn1 ()Lu7m;
      // 8ae: aload 10
      // 8b0: invokevirtual erg.gn1 ()Lu7m;
      // 8b3: if_acmpne 9b8
      // 8b6: goto 8bd
      // 8b9: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 8bc: athrow
      // 8bd: aload 10
      // 8bf: goto 8c6
      // 8c2: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 8c5: athrow
      // 8c6: invokevirtual erg.h4s ()I
      // 8c9: iload 5
      // 8cb: ifne 8e5
      // 8ce: bipush 1
      // 8cf: if_icmple 9b8
      // 8d2: goto 8d9
      // 8d5: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 8d8: athrow
      // 8d9: aload 9
      // 8db: invokevirtual erg.i5y ()Z
      // 8de: goto 8e5
      // 8e1: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 8e4: athrow
      // 8e5: iload 5
      // 8e7: ifne 922
      // 8ea: ifeq 914
      // 8ed: goto 8f4
      // 8f0: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 8f3: athrow
      // 8f4: aload 9
      // 8f6: invokevirtual erg.j6_ ()I
      // 8f9: iload 5
      // 8fb: ifne 922
      // 8fe: goto 905
      // 901: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 904: athrow
      // 905: aload 10
      // 907: invokevirtual erg.j6_ ()I
      // 90a: if_icmpne 9b8
      // 90d: goto 914
      // 910: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 913: athrow
      // 914: aload 9
      // 916: aload 10
      // 918: invokestatic erg.gjp (Lerg;Lerg;)Z
      // 91b: goto 922
      // 91e: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 921: athrow
      // 922: iload 5
      // 924: ifne 93d
      // 927: ifeq 9b8
      // 92a: goto 931
      // 92d: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 930: athrow
      // 931: aload 9
      // 933: getfield erg.qd2 I
      // 936: goto 93d
      // 939: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 93c: athrow
      // 93d: istore 11
      // 93f: iload 11
      // 941: iload 5
      // 943: ifne 95f
      // 946: ifle 9b8
      // 949: goto 950
      // 94c: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 94f: athrow
      // 950: iload 11
      // 952: aload 10
      // 954: getfield erg.qd2 I
      // 957: iadd
      // 958: goto 95f
      // 95b: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 95e: athrow
      // 95f: iload 5
      // 961: ifne 999
      // 964: aload 10
      // 966: invokevirtual erg.h4s ()I
      // 969: if_icmpgt 9b8
      // 96c: goto 973
      // 96f: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 972: athrow
      // 973: aload 10
      // 975: dup
      // 976: getfield erg.qd2 I
      // 979: iload 11
      // 97b: iadd
      // 97c: putfield erg.qd2 I
      // 97f: aload 8
      // 981: iload 5
      // 983: ifne 9ae
      // 986: goto 98d
      // 989: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 98c: athrow
      // 98d: iload 11
      // 98f: invokevirtual vrx.xtx (I)Lerg;
      // 992: astore 9
      // 994: aload 9
      // 996: getfield erg.qd2 I
      // 999: ifne 9ac
      // 99c: aload 8
      // 99e: aconst_null
      // 99f: checkcast erg
      // 9a2: invokevirtual vrx.yn7 (Lerg;)V
      // 9a5: goto 9ac
      // 9a8: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 9ab: athrow
      // 9ac: aload 8
      // 9ae: aload 4
      // 9b0: aload 7
      // 9b2: invokevirtual jnq.zet ()Lerg;
      // 9b5: invokevirtual vrx.g1d (Lha9;Lerg;)V
      // 9b8: aload 8
      // 9ba: invokevirtual vrx.vc1 ()V
      // 9bd: goto fb2
      // 9c0: iload 3
      // 9c1: bipush 2
      // 9c2: iload 5
      // 9c4: ifne bfe
      // 9c7: if_icmpne bf5
      // 9ca: goto 9d1
      // 9cd: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 9d0: athrow
      // 9d1: iload 2
      // 9d2: iload 5
      // 9d4: ifne bfd
      // 9d7: goto 9de
      // 9da: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 9dd: athrow
      // 9de: iflt bf5
      // 9e1: goto 9e8
      // 9e4: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 9e7: athrow
      // 9e8: iload 2
      // 9e9: bipush 9
      // 9eb: iload 5
      // 9ed: ifne bfe
      // 9f0: goto 9f7
      // 9f3: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 9f6: athrow
      // 9f7: if_icmpge bf5
      // 9fa: goto a01
      // 9fd: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // a00: athrow
      // a01: aload 0
      // a02: getfield _jc.wjd Ljava/util/List;
      // a05: iload 1
      // a06: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // a0b: checkcast vrx
      // a0e: astore 8
      // a10: aload 8
      // a12: aload 4
      // a14: invokevirtual vrx.fg6 (Lha9;)Z
      // a17: ifeq bf0
      // a1a: aload 7
      // a1c: iload 2
      // a1d: invokevirtual jnq.ibn (I)Lerg;
      // a20: astore 9
      // a22: aload 9
      // a24: ifnull a61
      // a27: aload 8
      // a29: iload 5
      // a2b: ifne a4d
      // a2e: goto a35
      // a31: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // a34: athrow
      // a35: getfield vrx.k0y Lrsi;
      // a38: aload 7
      // a3a: if_acmpne dispatchTo
      // a3d: goto a44
      // a40: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // a43: athrow
      // a44: aload 8
      // a46: goto a4d
      // a49: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // a4c: athrow
      // a4d: aload 9
      // a4f: invokevirtual vrx.xvl (Lerg;)Z
      // a52: iload 5
      // a54: ifne a62
      // a57: ifeq dispatchTo
      // a5a: goto a61
      // a5d: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // a60: athrow
      // a61: bipush 1
      // a62: goto a66
      // dispatchTo: bipush 0
      // a66: istore 10
      // a68: bipush -1
      // a69: istore 11
      // a6b: iload 10
      // a6d: iload 5
      // a6f: ifne aab
      // a72: ifne aa6
      // a75: goto a7c
      // a78: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // a7b: athrow
      // a7c: aload 7
      // a7e: invokevirtual jnq.d9p ()I
      // a81: istore 11
      // a83: iload 10
      // a85: iload 11
      // a87: iload 5
      // a89: ifne a9f
      // a8c: bipush -1
      // a8d: if_icmple aa2
      // a90: goto a97
      // a93: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // a96: athrow
      // a97: bipush 1
      // a98: goto a9f
      // a9b: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // a9e: athrow
      // a9f: goto aa3
      // aa2: bipush 0
      // aa3: ior
      // aa4: istore 10
      // aa6: aload 8
      // aa8: invokevirtual vrx.hf8 ()Z
      // aab: iload 5
      // aad: ifne bac
      // ab0: ifeq ba0
      // ab3: goto aba
      // ab6: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // ab9: athrow
      // aba: iload 10
      // abc: iload 5
      // abe: ifne bac
      // ac1: goto ac8
      // ac4: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // ac7: athrow
      // ac8: ifeq ba0
      // acb: goto ad2
      // ace: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // ad1: athrow
      // ad2: aload 8
      // ad4: invokevirtual vrx.x4s ()Lerg;
      // ad7: astore 12
      // ad9: aload 7
      // adb: iload 2
      // adc: aload 12
      // ade: invokevirtual erg.yaq ()Lerg;
      // ae1: invokevirtual jnq.cxl (ILerg;)V
      // ae4: aload 8
      // ae6: iload 5
      // ae8: ifne b03
      // aeb: getfield vrx.k0y Lrsi;
      // aee: aload 7
      // af0: if_acmpne b17
      // af3: goto afa
      // af6: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // af9: athrow
      // afa: aload 8
      // afc: goto b03
      // aff: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // b02: athrow
      // b03: aload 9
      // b05: iload 5
      // b07: ifne b8f
      // b0a: invokevirtual vrx.xvl (Lerg;)Z
      // b0d: ifne b79
      // b10: goto b17
      // b13: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // b16: athrow
      // b17: aload 9
      // b19: iload 5
      // b1b: ifne b8a
      // b1e: goto b25
      // b21: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // b24: athrow
      // b25: ifnull b79
      // b28: goto b2f
      // b2b: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // b2e: athrow
      // b2f: iload 11
      // b31: iload 5
      // b33: ifne b56
      // b36: goto b3d
      // b39: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // b3c: athrow
      // b3d: bipush -1
      // b3e: if_icmple b9b
      // b41: goto b48
      // b44: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // b47: athrow
      // b48: aload 7
      // b4a: aload 9
      // b4c: invokevirtual jnq.phd (Lerg;)Z
      // b4f: goto b56
      // b52: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // b55: athrow
      // b56: pop
      // b57: aload 8
      // b59: aload 12
      // b5b: getfield erg.qd2 I
      // b5e: invokevirtual vrx.xtx (I)Lerg;
      // b61: pop
      // b62: aload 8
      // b64: aconst_null
      // b65: checkcast erg
      // b68: invokevirtual vrx.yn7 (Lerg;)V
      // b6b: aload 8
      // b6d: aload 4
      // b6f: aload 12
      // b71: invokevirtual vrx.g1d (Lha9;Lerg;)V
      // b74: iload 5
      // b76: ifeq b9b
      // b79: aload 8
      // b7b: aload 12
      // b7d: getfield erg.qd2 I
      // b80: invokevirtual vrx.xtx (I)Lerg;
      // b83: goto b8a
      // b86: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // b89: athrow
      // b8a: pop
      // b8b: aload 8
      // b8d: aload 9
      // b8f: invokevirtual vrx.yn7 (Lerg;)V
      // b92: aload 8
      // b94: aload 4
      // b96: aload 12
      // b98: invokevirtual vrx.g1d (Lha9;Lerg;)V
      // b9b: iload 5
      // b9d: ifeq bf0
      // ba0: aload 8
      // ba2: invokevirtual vrx.hf8 ()Z
      // ba5: goto bac
      // ba8: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // bab: athrow
      // bac: ifne bf0
      // baf: aload 9
      // bb1: ifnull bf0
      // bb4: goto bbb
      // bb7: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // bba: athrow
      // bbb: aload 8
      // bbd: aload 9
      // bbf: iload 5
      // bc1: ifne bed
      // bc4: goto bcb
      // bc7: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // bca: athrow
      // bcb: invokevirtual vrx.xvl (Lerg;)Z
      // bce: ifeq bf0
      // bd1: goto bd8
      // bd4: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // bd7: athrow
      // bd8: aload 7
      // bda: iload 2
      // bdb: aconst_null
      // bdc: checkcast erg
      // bdf: invokevirtual jnq.cxl (ILerg;)V
      // be2: aload 8
      // be4: aload 9
      // be6: goto bed
      // be9: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // bec: athrow
      // bed: invokevirtual vrx.yn7 (Lerg;)V
      // bf0: iload 5
      // bf2: ifeq fb2
      // bf5: iload 3
      // bf6: goto bfd
      // bf9: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // bfc: athrow
      // bfd: bipush 3
      // bfe: iload 5
      // c00: ifne cb5
      // c03: if_icmpne cac
      // c06: goto c0d
      // c09: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // c0c: athrow
      // c0d: aload 4
      // c0f: getfield ha9.lls Lpj2;
      // c12: getfield pj2.g40 Z
      // c15: iload 5
      // c17: ifne cb4
      // c1a: goto c21
      // c1d: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // c20: athrow
      // c21: ifeq cac
      // c24: goto c2b
      // c27: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // c2a: athrow
      // c2b: aload 7
      // c2d: invokevirtual jnq.zet ()Lerg;
      // c30: ifnonnull cac
      // c33: goto c3a
      // c36: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // c39: athrow
      // c3a: iload 1
      // c3b: iload 5
      // c3d: ifne cb4
      // c40: goto c47
      // c43: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // c46: athrow
      // c47: iflt cac
      // c4a: goto c51
      // c4d: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // c50: athrow
      // c51: aload 0
      // c52: getfield _jc.wjd Ljava/util/List;
      // c55: iload 1
      // c56: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // c5b: checkcast vrx
      // c5e: astore 8
      // c60: aload 8
      // c62: iload 5
      // c64: ifne c73
      // c67: ifnull ca7
      // c6a: goto c71
      // c6d: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // c70: athrow
      // c71: aload 8
      // c73: iload 5
      // c75: ifne c8e
      // c78: invokevirtual vrx.hf8 ()Z
      // c7b: ifeq ca7
      // c7e: goto c85
      // c81: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // c84: athrow
      // c85: aload 8
      // c87: goto c8e
      // c8a: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // c8d: athrow
      // c8e: invokevirtual vrx.x4s ()Lerg;
      // c91: invokevirtual erg.yaq ()Lerg;
      // c94: astore 9
      // c96: aload 9
      // c98: aload 9
      // c9a: invokevirtual erg.h4s ()I
      // c9d: putfield erg.qd2 I
      // ca0: aload 7
      // ca2: aload 9
      // ca4: invokevirtual jnq.uej (Lerg;)V
      // ca7: iload 5
      // ca9: ifeq fb2
      // cac: iload 3
      // cad: goto cb4
      // cb0: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // cb3: athrow
      // cb4: bipush 4
      // cb5: iload 5
      // cb7: ifne d8b
      // cba: if_icmpne d75
      // cbd: goto cc4
      // cc0: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // cc3: athrow
      // cc4: aload 7
      // cc6: invokevirtual jnq.zet ()Lerg;
      // cc9: ifnonnull d75
      // ccc: goto cd3
      // ccf: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // cd2: athrow
      // cd3: iload 1
      // cd4: iload 5
      // cd6: ifne d7d
      // cd9: goto ce0
      // cdc: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // cdf: athrow
      // ce0: iflt d75
      // ce3: goto cea
      // ce6: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // ce9: athrow
      // cea: aload 0
      // ceb: getfield _jc.wjd Ljava/util/List;
      // cee: iload 1
      // cef: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // cf4: checkcast vrx
      // cf7: astore 8
      // cf9: aload 8
      // cfb: iload 5
      // cfd: ifne d0c
      // d00: ifnull d70
      // d03: goto d0a
      // d06: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // d09: athrow
      // d0a: aload 8
      // d0c: invokevirtual vrx.hf8 ()Z
      // d0f: iload 5
      // d11: ifne d38
      // d14: ifeq d70
      // d17: goto d1e
      // d1a: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // d1d: athrow
      // d1e: aload 8
      // d20: iload 5
      // d22: ifne d3d
      // d25: goto d2c
      // d28: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // d2b: athrow
      // d2c: aload 4
      // d2e: invokevirtual vrx.fg6 (Lha9;)Z
      // d31: goto d38
      // d34: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // d37: athrow
      // d38: ifeq d70
      // d3b: aload 8
      // d3d: iload 2
      // d3e: iload 5
      // d40: ifne d4e
      // d43: ifne d51
      // d46: goto d4d
      // d49: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // d4c: athrow
      // d4d: bipush 1
      // d4e: goto d59
      // d51: aload 8
      // d53: invokevirtual vrx.x4s ()Lerg;
      // d56: getfield erg.qd2 I
      // d59: invokevirtual vrx.xtx (I)Lerg;
      // d5c: astore 9
      // d5e: aload 8
      // d60: aload 4
      // d62: aload 9
      // d64: invokevirtual vrx.g1d (Lha9;Lerg;)V
      // d67: aload 4
      // d69: aload 9
      // d6b: bipush 1
      // d6c: invokevirtual ha9.ejq (Lerg;Z)Lnvf;
      // d6f: pop
      // d70: iload 5
      // d72: ifeq fb2
      // d75: iload 3
      // d76: goto d7d
      // d79: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // getValue: athrow
      // d7d: iload 5
      // d7f: ifne d8f
      // d82: bipush 6
      // d84: goto d8b
      // d87: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // d8a: athrow
      // d8b: if_icmpne fb2
      // d8e: iload 1
      // d8f: iflt fb2
      // d92: aload 0
      // d93: getfield _jc.wjd Ljava/util/List;
      // d96: iload 1
      // d97: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // d9c: checkcast vrx
      // d9f: astore 8
      // da1: aload 7
      // da3: invokevirtual jnq.zet ()Lerg;
      // da6: astore 9
      // da8: aload 9
      // daa: ifnull fae
      // dad: aload 8
      // daf: iload 5
      // db1: ifne dc7
      // db4: goto dbb
      // db7: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // dba: athrow
      // dbb: ifnull df6
      // dbe: goto dc5
      // dc1: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // dc4: athrow
      // dc5: aload 8
      // dc7: invokevirtual vrx.hf8 ()Z
      // dca: iload 5
      // dcc: ifne df7
      // dcf: ifeq df6
      // dd2: goto dd9
      // dd5: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // dd8: athrow
      // dd9: aload 8
      // ddb: aload 4
      // ddd: invokevirtual vrx.fg6 (Lha9;)Z
      // de0: iload 5
      // de2: ifne df7
      // de5: goto dec
      // de8: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // deb: athrow
      // dec: ifne fae
      // def: goto df6
      // df2: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // df5: athrow
      // df6: iload 2
      // df7: iload 5
      // df9: ifne e17
      // dfc: ifne e0e
      // dff: goto e06
      // e02: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // e05: athrow
      // e06: bipush 0
      // e07: goto e19
      // e0a: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // e0d: athrow
      // e0e: aload 0
      // e0f: getfield _jc.wjd Ljava/util/List;
      // e12: invokeinterface java/util/List.size ()I 1
      // e17: bipush 1
      // e18: isub
      // e19: istore 10
      // e1b: iload 2
      // e1c: iload 5
      // e1e: ifne e2c
      // e21: ifne e2f
      // e24: goto e2b
      // e27: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // e2a: athrow
      // e2b: bipush 1
      // e2c: goto e30
      // e2f: bipush -1
      // e30: istore 11
      // e32: bipush 0
      // e33: istore 12
      // e35: iload 12
      // e37: bipush 2
      // e38: if_icmpge fae
      // e3b: iload 10
      // e3d: istore 13
      // e3f: iload 13
      // e41: iflt fa6
      // e44: iload 13
      // e46: aload 0
      // e47: getfield _jc.wjd Ljava/util/List;
      // e4a: invokeinterface java/util/List.size ()I 1
      // e4f: iload 5
      // e51: ifne e38
      // e54: iload 5
      // e56: ifne e80
      // e59: if_icmpge fa6
      // e5c: goto e63
      // e5f: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // e62: athrow
      // e63: aload 9
      // e65: iload 5
      // e67: ifne e95
      // e6a: goto e71
      // e6d: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // e70: athrow
      // e71: getfield erg.qd2 I
      // e74: aload 9
      // e76: invokevirtual erg.h4s ()I
      // e79: goto e80
      // e7c: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // e7f: athrow
      // e80: if_icmpge fa6
      // e83: aload 0
      // e84: getfield _jc.wjd Ljava/util/List;
      // e87: iload 13
      // e89: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // e8e: goto e95
      // e91: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // e94: athrow
      // e95: checkcast vrx
      // e98: astore 14
      // e9a: aload 14
      // e9c: invokevirtual vrx.hf8 ()Z
      // e9f: iload 5
      // ea1: ifne f9f
      // ea4: ifeq f9a
      // ea7: goto eae
      // eaa: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // ead: athrow
      // eae: aload 14
      // eb0: aload 9
      // eb2: bipush 1
      // eb3: invokestatic _jc.eo5 (Lvrx;Lerg;Z)Z
      // eb6: iload 5
      // eb8: ifne f9f
      // ebb: goto ec2
      // ebe: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // ec1: athrow
      // ec2: ifeq f9a
      // ec5: goto ecc
      // ec8: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // ecb: athrow
      // ecc: aload 14
      // ece: aload 4
      // ed0: invokevirtual vrx.fg6 (Lha9;)Z
      // ed3: iload 5
      // ed5: ifne f9f
      // ed8: goto edf
      // edb: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // ede: athrow
      // edf: ifeq f9a
      // ee2: goto ee9
      // ee5: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // ee8: athrow
      // ee9: aload 0
      // eea: aload 9
      // eec: aload 14
      // eee: invokevirtual _jc.c6n (Lerg;Lvrx;)Z
      // ef1: iload 5
      // ef3: ifne f9f
      // ef6: goto efd
      // ef9: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // efc: athrow
      // efd: ifeq f9a
      // f00: goto f07
      // f03: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // f06: athrow
      // f07: iload 12
      // f09: iload 5
      // f0b: ifne f62
      // f0e: goto f15
      // f11: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // f14: athrow
      // f15: ifne f45
      // f18: goto f1f
      // f1b: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // f1e: athrow
      // f1f: aload 14
      // f21: invokevirtual vrx.x4s ()Lerg;
      // f24: getfield erg.qd2 I
      // f27: aload 14
      // f29: invokevirtual vrx.x4s ()Lerg;
      // f2c: invokevirtual erg.h4s ()I
      // f2f: iload 5
      // f31: ifne f9e
      // f34: goto f3b
      // f37: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // f3a: athrow
      // f3b: if_icmpeq f9a
      // f3e: goto f45
      // f41: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // f44: athrow
      // f45: aload 9
      // f47: invokevirtual erg.h4s ()I
      // f4a: aload 9
      // f4c: getfield erg.qd2 I
      // f4f: isub
      // f50: aload 14
      // f52: invokevirtual vrx.x4s ()Lerg;
      // f55: getfield erg.qd2 I
      // f58: invokestatic java/lang/Math.min (II)I
      // f5b: goto f62
      // f5e: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // f61: athrow
      // f62: istore 15
      // f64: aload 14
      // f66: iload 15
      // f68: invokevirtual vrx.xtx (I)Lerg;
      // f6b: astore 16
      // f6d: aload 9
      // f6f: dup
      // f70: getfield erg.qd2 I
      // f73: iload 15
      // f75: iadd
      // f76: putfield erg.qd2 I
      // f79: aload 16
      // f7b: getfield erg.qd2 I
      // f7e: ifgt f91
      // f81: aload 14
      // f83: aconst_null
      // f84: checkcast erg
      // f87: invokevirtual vrx.yn7 (Lerg;)V
      // f8a: goto f91
      // f8d: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // f90: athrow
      // f91: aload 14
      // f93: aload 4
      // f95: aload 16
      // f97: invokevirtual vrx.g1d (Lha9;Lerg;)V
      // f9a: iload 13
      // f9c: iload 11
      // f9e: iadd
      // f9f: istore 13
      // fa1: iload 5
      // fa3: ifeq e3f
      // fa6: iinc 12 1
      // fa9: iload 5
      // fab: ifeq e35
      // fae: aload 0
      // faf: invokevirtual _jc.n4z ()V
      // fb2: aload 6
      // fb4: areturn
   }

   public boolean c6n(erg var1, vrx var2) {
      return true;
   }

   public void yo3(int var1, int var2, boolean var3, ha9 var4) {
      this.b7m(var1, var2, 1, var4);
   }

   public void qi6(ha9 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: getfield ha9.up_ Ljnq;
      // 08: astore 3
      // 09: aload 3
      // 0a: iload 2
      // 0b: ifne 2d
      // 0e: invokevirtual jnq.zet ()Lerg;
      // 11: ifnull 34
      // 14: goto 1b
      // 17: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1a: athrow
      // 1b: aload 1
      // 1c: aload 3
      // 1d: invokevirtual jnq.zet ()Lerg;
      // 20: bipush 0
      // 21: invokevirtual ha9.ejq (Lerg;Z)Lnvf;
      // 24: pop
      // 25: aload 3
      // 26: goto 2d
      // 29: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2c: athrow
      // 2d: aconst_null
      // 2e: checkcast erg
      // 31: invokevirtual jnq.uej (Lerg;)V
      // 34: return
   }

   public void ih9(rsi var1) {
      this.n4z();
   }

   public void tm6(int var1, erg var2) {
      this.ajr(var1).yn7(var2);
   }

   public void eeg(erg[] var1) {
      int var2 = OpaquePredicate.b();
      int var3 = 0;

      while (var3 < var1.length) {
         this.ajr(var3).yn7(var1[var3]);
         var3++;
         if (var2 == 0) {
            break;
         }
      }
   }

   public void l0n(int var1, int var2) {
   }

   public short x7q(jnq var1) {
      this.cxa++;
      return this.cxa;
   }

   public boolean yyp(ha9 var1) {
      int var2 = OpaquePredicate.b();

      try {
         boolean var10000 = this.j9k.contains(var1);
         if (var2 == 0) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (IllegalArgumentException var3) {
         throw a(var3);
      }

      return false;
   }

   public void _fi(ha9 param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: iload 2
      // 05: iload 3
      // 06: ifne 3a
      // 09: ifeq 29
      // 0c: goto 13
      // 0f: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 12: athrow
      // 13: aload 0
      // 14: getfield _jc.j9k Ljava/util/Set;
      // 17: aload 1
      // 18: invokeinterface java/util/Set.remove (Ljava/lang/Object;)Z 2
      // 1d: pop
      // 1e: iload 3
      // 1f: ifeq 3b
      // 22: goto 29
      // 25: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 28: athrow
      // 29: aload 0
      // 2a: getfield _jc.j9k Ljava/util/Set;
      // 2d: aload 1
      // 2e: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 33: goto 3a
      // 36: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 39: athrow
      // 3a: pop
      // 3b: return
   }

   public abstract boolean spj(ha9 var1);

   public boolean ghh(erg param1, int param2, int param3, boolean param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: bipush 0
      // 001: istore 6
      // 003: invokestatic OpaquePredicate.b ()I
      // 006: iload 2
      // 007: istore 7
      // 009: istore 5
      // 00b: iload 4
      // 00d: iload 5
      // 00f: ifeq 025
      // 012: ifeq 021
      // 015: goto 01c
      // 018: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 01b: athrow
      // 01c: iload 3
      // 01d: bipush 1
      // 01e: isub
      // 01f: istore 7
      // 021: aload 1
      // 022: invokevirtual erg._n3 ()Z
      // 025: iload 5
      // 027: ifeq 1e2
      // 02a: ifeq 1de
      // 02d: goto 034
      // 030: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 033: athrow
      // 034: aload 1
      // 035: getfield erg.qd2 I
      // 038: ifle 1de
      // 03b: goto 042
      // 03e: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 041: athrow
      // 042: iload 4
      // 044: iload 5
      // 046: ifeq 1e2
      // 049: iload 5
      // 04b: ifeq 081
      // 04e: goto 055
      // 051: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 054: athrow
      // 055: ifne 078
      // 058: goto 05f
      // 05b: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 05e: athrow
      // 05f: iload 7
      // 061: iload 5
      // 063: ifeq 081
      // 066: goto 06d
      // 069: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 06c: athrow
      // 06d: iload 3
      // 06e: if_icmplt 0a9
      // 071: goto 078
      // 074: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 077: athrow
      // 078: iload 4
      // 07a: goto 081
      // 07d: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 080: athrow
      // 081: iload 5
      // 083: ifeq 1e2
      // 086: ifeq 1de
      // 089: goto 090
      // 08c: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 08f: athrow
      // 090: iload 7
      // 092: iload 5
      // 094: ifeq 1e2
      // 097: goto 09e
      // 09a: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 09d: athrow
      // 09e: iload 2
      // 09f: if_icmplt 1de
      // 0a2: goto 0a9
      // 0a5: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a8: athrow
      // 0a9: aload 0
      // 0aa: getfield _jc.wjd Ljava/util/List;
      // 0ad: iload 7
      // 0af: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0b4: checkcast vrx
      // 0b7: astore 8
      // 0b9: aload 8
      // 0bb: invokevirtual vrx.x4s ()Lerg;
      // 0be: astore 9
      // 0c0: aload 9
      // 0c2: iload 5
      // 0c4: ifeq 0d3
      // 0c7: ifnull 1bb
      // 0ca: goto 0d1
      // 0cd: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0d0: athrow
      // 0d1: aload 9
      // 0d3: iload 5
      // 0d5: ifeq 0f1
      // 0d8: invokevirtual erg.gn1 ()Lu7m;
      // 0db: aload 1
      // 0dc: invokevirtual erg.gn1 ()Lu7m;
      // 0df: if_acmpne 1bb
      // 0e2: goto 0e9
      // 0e5: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0e8: athrow
      // 0e9: aload 1
      // 0ea: goto 0f1
      // 0ed: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0f0: athrow
      // 0f1: invokevirtual erg.i5y ()Z
      // 0f4: iload 5
      // 0f6: ifeq 12f
      // 0f9: ifeq 122
      // 0fc: goto 103
      // 0ff: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 102: athrow
      // 103: aload 1
      // 104: invokevirtual erg.j6_ ()I
      // 107: iload 5
      // 109: ifeq 1bd
      // 10c: goto 113
      // 10f: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 112: athrow
      // 113: aload 9
      // 115: invokevirtual erg.j6_ ()I
      // 118: if_icmpne 1bb
      // 11b: goto 122
      // 11e: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 121: athrow
      // 122: aload 1
      // 123: aload 9
      // 125: invokestatic erg.gjp (Lerg;Lerg;)Z
      // 128: goto 12f
      // 12b: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 12e: athrow
      // 12f: iload 5
      // 131: ifeq 1bd
      // 134: ifeq 1bb
      // 137: goto 13e
      // 13a: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 13d: athrow
      // 13e: aload 9
      // 140: getfield erg.qd2 I
      // 143: aload 1
      // 144: getfield erg.qd2 I
      // 147: iadd
      // 148: istore 10
      // 14a: iload 10
      // 14c: aload 1
      // 14d: invokevirtual erg.h4s ()I
      // 150: iload 5
      // 152: ifeq 194
      // 155: if_icmpgt 178
      // 158: goto 15f
      // 15b: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15e: athrow
      // 15f: aload 1
      // 160: bipush 0
      // 161: putfield erg.qd2 I
      // 164: aload 9
      // 166: iload 10
      // 168: putfield erg.qd2 I
      // 16b: aload 8
      // 16d: invokevirtual vrx.vc1 ()V
      // 170: bipush 1
      // 171: istore 6
      // 173: iload 5
      // 175: ifne 1bb
      // 178: aload 9
      // 17a: getfield erg.qd2 I
      // 17d: iload 5
      // 17f: ifeq 1bd
      // 182: goto 189
      // 185: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 188: athrow
      // 189: aload 1
      // 18a: invokevirtual erg.h4s ()I
      // 18d: goto 194
      // 190: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 193: athrow
      // 194: if_icmpge 1bb
      // 197: aload 1
      // 198: dup
      // 199: getfield erg.qd2 I
      // 19c: aload 1
      // 19d: invokevirtual erg.h4s ()I
      // 1a0: aload 9
      // 1a2: getfield erg.qd2 I
      // 1a5: isub
      // 1a6: isub
      // 1a7: putfield erg.qd2 I
      // 1aa: aload 9
      // 1ac: aload 1
      // 1ad: invokevirtual erg.h4s ()I
      // 1b0: putfield erg.qd2 I
      // 1b3: aload 8
      // 1b5: invokevirtual vrx.vc1 ()V
      // 1b8: bipush 1
      // 1b9: istore 6
      // 1bb: iload 4
      // 1bd: ifeq 1cf
      // 1c0: iinc 7 -1
      // 1c3: iload 5
      // 1c5: ifne 1d9
      // 1c8: goto 1cf
      // 1cb: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1ce: athrow
      // 1cf: iinc 7 1
      // 1d2: goto 1d9
      // 1d5: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1d8: athrow
      // 1d9: iload 5
      // 1db: ifne 034
      // 1de: aload 1
      // 1df: getfield erg.qd2 I
      // 1e2: iload 5
      // 1e4: ifeq 2e0
      // 1e7: ifle 2de
      // 1ea: goto 1f1
      // 1ed: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1f0: athrow
      // 1f1: iload 4
      // 1f3: iload 5
      // 1f5: ifeq 21b
      // 1f8: goto 1ff
      // 1fb: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1fe: athrow
      // 1ff: ifeq 213
      // 202: goto 209
      // 205: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 208: athrow
      // 209: iload 3
      // 20a: bipush 1
      // 20b: isub
      // 20c: istore 7
      // 20e: iload 5
      // 210: ifne 21d
      // 213: iload 2
      // 214: goto 21b
      // 217: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 21a: athrow
      // 21b: istore 7
      // 21d: iload 4
      // 21f: ifne 240
      // 222: iload 7
      // 224: iload 5
      // 226: ifeq 242
      // 229: iload 3
      // 22a: iload 5
      // 22c: ifeq 267
      // 22f: goto 236
      // 232: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 235: athrow
      // 236: if_icmplt 26a
      // 239: goto 240
      // 23c: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 23f: athrow
      // 240: iload 4
      // 242: iload 5
      // 244: ifeq 2e0
      // 247: ifeq 2de
      // 24a: goto 251
      // 24d: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 250: athrow
      // 251: iload 7
      // 253: iload 5
      // 255: ifeq 2e0
      // 258: goto 25f
      // 25b: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 25e: athrow
      // 25f: iload 2
      // 260: goto 267
      // 263: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 266: athrow
      // 267: if_icmplt 2de
      // 26a: aload 0
      // 26b: getfield _jc.wjd Ljava/util/List;
      // 26e: iload 7
      // 270: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 275: checkcast vrx
      // 278: astore 8
      // 27a: aload 8
      // 27c: invokevirtual vrx.x4s ()Lerg;
      // 27f: astore 9
      // 281: aload 9
      // 283: iload 5
      // 285: ifeq 2a8
      // 288: ifnonnull 2b4
      // 28b: goto 292
      // 28e: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 291: athrow
      // 292: aload 8
      // 294: aload 1
      // 295: invokevirtual erg.yaq ()Lerg;
      // 298: invokevirtual vrx.yn7 (Lerg;)V
      // 29b: aload 8
      // 29d: invokevirtual vrx.vc1 ()V
      // 2a0: aload 1
      // 2a1: goto 2a8
      // 2a4: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2a7: athrow
      // 2a8: bipush 0
      // 2a9: putfield erg.qd2 I
      // 2ac: bipush 1
      // 2ad: istore 6
      // 2af: iload 5
      // 2b1: ifne 2de
      // 2b4: iload 4
      // 2b6: ifeq 2cf
      // 2b9: goto 2c0
      // 2bc: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2bf: athrow
      // 2c0: iinc 7 -1
      // 2c3: iload 5
      // 2c5: ifne 2d9
      // 2c8: goto 2cf
      // 2cb: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2ce: athrow
      // 2cf: iinc 7 1
      // 2d2: goto 2d9
      // 2d5: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2d8: athrow
      // 2d9: iload 5
      // 2db: ifne 21d
      // 2de: iload 6
      // 2e0: ireturn
   }

   public static int i9k(int var0) {
      return var0 >> 2 & 3;
   }

   public static int abk(int var0) {
      return var0 & 3;
   }

   public static int eb8(int var0, int var1) {
      return var0 & 3 | (var1 & 3) << 2;
   }

   public static boolean hne(int param0, ha9 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: iload 0
      // 05: iload 2
      // 06: ifeq 1c
      // 09: ifne 1b
      // 0c: goto 13
      // 0f: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 12: athrow
      // 13: bipush 1
      // 14: goto 64
      // 17: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1a: athrow
      // 1b: iload 0
      // 1c: bipush 1
      // 1d: iload 2
      // 1e: ifeq 40
      // 21: if_icmpne 33
      // 24: goto 2b
      // 27: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2a: athrow
      // 2b: bipush 1
      // 2c: goto 64
      // 2f: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 32: athrow
      // 33: iload 0
      // 34: iload 2
      // 35: ifeq 51
      // 38: bipush 2
      // 39: goto 40
      // 3c: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3f: athrow
      // 40: if_icmpne 63
      // 43: aload 1
      // 44: getfield ha9.lls Lpj2;
      // 47: getfield pj2.g40 Z
      // 4a: goto 51
      // 4d: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 50: athrow
      // 51: iload 2
      // 52: ifeq 60
      // 55: ifeq 63
      // 58: goto 5f
      // 5b: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5e: athrow
      // 5f: bipush 1
      // 60: goto 64
      // 63: bipush 0
      // 64: ireturn
   }

   public void ii0() {
      this.e_q = 0;
      this.q6o.clear();
   }

   public static boolean eo5(vrx param0, erg param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: aload 0
      // 05: iload 3
      // 06: ifne 14
      // 09: ifnull 25
      // 0c: goto 13
      // 0f: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 12: athrow
      // 13: aload 0
      // 14: invokevirtual vrx.hf8 ()Z
      // 17: iload 3
      // 18: ifne 26
      // 1b: ifne 29
      // 1e: goto 25
      // 21: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 24: athrow
      // 25: bipush 1
      // 26: goto 2a
      // 29: bipush 0
      // 2a: istore 4
      // 2c: aload 0
      // 2d: iload 3
      // 2e: ifne 3c
      // 31: ifnull df
      // 34: goto 3b
      // 37: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3a: athrow
      // 3b: aload 0
      // 3c: invokevirtual vrx.hf8 ()Z
      // 3f: iload 3
      // 40: ifne e1
      // 43: ifeq df
      // 46: goto 4d
      // 49: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4c: athrow
      // 4d: aload 1
      // 4e: iload 3
      // 4f: ifne 64
      // 52: goto 59
      // 55: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 58: athrow
      // 59: ifnull df
      // 5c: goto 63
      // 5f: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 62: athrow
      // 63: aload 1
      // 64: aload 0
      // 65: invokevirtual vrx.x4s ()Lerg;
      // 68: invokevirtual erg.efv (Lerg;)Z
      // 6b: iload 3
      // 6c: ifne e1
      // 6f: ifeq df
      // 72: goto 79
      // 75: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 78: athrow
      // 79: aload 0
      // 7a: invokevirtual vrx.x4s ()Lerg;
      // 7d: aload 1
      // 7e: invokestatic erg.gjp (Lerg;Lerg;)Z
      // 81: iload 3
      // 82: ifne e1
      // 85: goto 8c
      // 88: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 8b: athrow
      // 8c: ifeq df
      // 8f: goto 96
      // 92: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 95: athrow
      // 96: iload 4
      // 98: aload 0
      // 99: invokevirtual vrx.x4s ()Lerg;
      // 9c: getfield erg.qd2 I
      // 9f: iload 2
      // a0: iload 3
      // a1: ifne b6
      // a4: goto ab
      // a7: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // aa: athrow
      // ab: ifeq b9
      // ae: goto b5
      // b1: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // b4: athrow
      // b5: bipush 0
      // b6: goto bd
      // b9: aload 1
      // ba: getfield erg.qd2 I
      // bd: iadd
      // be: iload 3
      // bf: ifne d8
      // c2: aload 1
      // c3: invokevirtual erg.h4s ()I
      // c6: if_icmpgt db
      // c9: goto d0
      // cc: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // cf: athrow
      // d0: bipush 1
      // d1: goto d8
      // d4: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // d7: athrow
      // d8: goto dc
      // db: bipush 0
      // dc: ior
      // dd: istore 4
      // df: iload 4
      // e1: ireturn
   }

   public static void etx(Set param0, int param1, erg param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 4
      // 05: iload 1
      // 06: tableswitch 93 0 2 26 58 75
      // 20: aload 2
      // 21: aload 2
      // 22: getfield erg.qd2 I
      // 25: i2f
      // 26: aload 0
      // 27: invokeinterface java/util/Set.size ()I 1
      // 2c: i2f
      // 2d: fdiv
      // 2e: invokestatic fe6.tpk (F)I
      // 31: putfield erg.qd2 I
      // 34: iload 4
      // 36: ifeq 63
      // 39: goto 40
      // 3c: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3f: athrow
      // 40: aload 2
      // 41: bipush 1
      // 42: putfield erg.qd2 I
      // 45: iload 4
      // 47: ifeq 63
      // 4a: goto 51
      // 4d: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 50: athrow
      // 51: aload 2
      // 52: aload 2
      // 53: invokevirtual erg.gn1 ()Lu7m;
      // 56: invokevirtual u7m.pnh ()I
      // 59: putfield erg.qd2 I
      // 5c: goto 63
      // 5f: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 62: athrow
      // 63: aload 2
      // 64: dup
      // 65: getfield erg.qd2 I
      // 68: iload 3
      // 69: iadd
      // 6a: putfield erg.qd2 I
      // 6d: return
   }

   public boolean q67(vrx var1) {
      return true;
   }

   public static int nuj(pyk param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: instanceof rsi
      // 08: iload 1
      // 09: ifne 24
      // 0c: ifeq 27
      // 0f: goto 16
      // 12: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15: athrow
      // 16: aload 0
      // 17: checkcast rsi
      // 1a: invokestatic _jc.ngl (Lrsi;)I
      // 1d: goto 24
      // 20: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 23: athrow
      // 24: goto 28
      // 27: bipush 0
      // 28: ireturn
   }

   public static int ngl(rsi param0) {
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
      // 05: ifnonnull 0e
      // 08: bipush 0
      // 09: ireturn
      // 0a: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0d: athrow
      // 0e: bipush 0
      // 0f: istore 2
      // 10: fconst_0
      // 11: fstore 3
      // 12: bipush 0
      // 13: istore 4
      // 15: iload 4
      // 17: aload 0
      // 18: invokeinterface rsi.opt ()I 1
      // 1d: if_icmpge 68
      // 20: aload 0
      // 21: iload 4
      // 23: invokeinterface rsi.ibn (I)Lerg; 2
      // 28: astore 5
      // 2a: iload 1
      // 2b: ifeq 72
      // 2e: iload 1
      // 2f: ifeq 64
      // 32: goto 39
      // 35: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 38: athrow
      // 39: aload 5
      // 3b: ifnull 61
      // 3e: goto 45
      // 41: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 44: athrow
      // 45: fload 3
      // 46: aload 5
      // 48: getfield erg.qd2 I
      // 4b: i2f
      // 4c: aload 0
      // 4d: invokeinterface rsi.v6l ()I 1
      // 52: aload 5
      // 54: invokevirtual erg.h4s ()I
      // 57: invokestatic java/lang/Math.min (II)I
      // 5a: i2f
      // 5b: fdiv
      // 5c: fadd
      // 5d: fstore 3
      // 5e: iinc 2 1
      // 61: iinc 4 1
      // 64: iload 1
      // 65: ifne 15
      // 68: fload 3
      // 69: aload 0
      // 6a: invokeinterface rsi.opt ()I 1
      // 6f: i2f
      // 70: fdiv
      // 71: fstore 3
      // 72: fload 3
      // 73: ldc 14.0
      // 75: nop
      // 76: fmul
      // 77: invokestatic fe6.tpk (F)I
      // 7a: iload 2
      // 7b: iload 1
      // 7c: ifeq 8a
      // 7f: ifle 8d
      // 82: goto 89
      // 85: invokestatic _jc.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 88: athrow
      // 89: bipush 1
      // 8a: goto 8e
      // 8d: bipush 0
      // 8e: iadd
      // 8f: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(5685862961271194119L, 1863517446042269042L, MethodHandles.lookup().lookupClass()).a(162975498172746L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 49384115769215L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal(">pM\u0096NUÖ\u0092#\u008b©\u00adÜ!\u008aSk\u0099H\u0088ÕQ\u007f_,èL»ð4Í¡".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      c = var6;
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
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
