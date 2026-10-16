import com.google.common.base.Predicate;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class r72 {
   private final Predicate[][][] lx8;
   private final int mvz;
   private final int fhx;
   private final int twa;
   private static final long a;
   private static final String b;

   public r72(Predicate[][][] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokespecial java/lang/Object.<init> ()V
      // 04: invokestatic OpaquePredicate.b ()I
      // 07: aload 0
      // 08: aload 1
      // 09: putfield r72.lx8 [[[Lcom/google/common/base/Predicate;
      // 0c: istore 2
      // 0d: aload 0
      // 0e: aload 1
      // 0f: arraylength
      // 10: putfield r72.mvz I
      // 13: aload 0
      // 14: iload 2
      // 15: ifeq 78
      // 18: getfield r72.mvz I
      // 1b: ifle 6b
      // 1e: goto 25
      // 21: invokestatic r72.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 24: athrow
      // 25: aload 0
      // 26: aload 1
      // 27: bipush 0
      // 28: aaload
      // 29: arraylength
      // 2a: putfield r72.fhx I
      // 2d: aload 0
      // 2e: iload 2
      // 2f: ifeq 63
      // 32: goto 39
      // 35: invokestatic r72.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 38: athrow
      // 39: getfield r72.fhx I
      // 3c: ifle 5b
      // 3f: goto 46
      // 42: invokestatic r72.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 45: athrow
      // 46: aload 0
      // 47: aload 1
      // 48: bipush 0
      // 49: aaload
      // 4a: bipush 0
      // 4b: aaload
      // 4c: arraylength
      // 4d: putfield r72.twa I
      // 50: iload 2
      // 51: ifne 7c
      // 54: goto 5b
      // 57: invokestatic r72.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5a: athrow
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic r72.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 62: athrow
      // 63: bipush 0
      // 64: putfield r72.twa I
      // 67: iload 2
      // 68: ifne 7c
      // 6b: aload 0
      // 6c: bipush 0
      // 6d: putfield r72.fhx I
      // 70: aload 0
      // 71: goto 78
      // 74: invokestatic r72.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 77: athrow
      // 78: bipush 0
      // 79: putfield r72.twa I
      // 7c: return
   }

   public int sy_() {
      return this.fhx;
   }

   public int k3i() {
      return this.twa;
   }

   private r72$kqk gqo(mew var1, vt2 var2, vt2 var3, LoadingCache var4) {
      int var5 = OpaquePredicate.c();
      int var6 = 0;

      label54:
      while (true) {
         int var10000 = var6;

         label52:
         while (var10000 < this.twa) {
            int var7 = 0;

            label49:
            while (true) {
               var10000 = var7;

               label47:
               while (true) {
                  if (var10000 >= this.fhx) {
                     break label49;
                  }

                  var10000 = 0;
                  if (var5 != 0) {
                     continue label52;
                  }

                  int var8 = 0;

                  while (var8 < this.mvz) {
                     var10000 = this.lx8[var8][var7][var6].apply(var4.getUnchecked(d_2(var1, var2, var3, var6, var7, var8)));
                     if (var5 != 0) {
                        continue label47;
                     }

                     try {
                        if (var10000 == 0) {
                           return null;
                        }
                     } catch (IllegalArgumentException var9) {
                        throw a(var9);
                     }

                     var8++;
                     if (var5 != 0) {
                        break;
                     }
                  }

                  var7++;
                  if (var5 != 0) {
                     break label49;
                  }
                  break;
               }
            }

            var6++;
            if (var5 != 0) {
               return new r72$kqk(var1, var2, var3, var4, this.twa, this.fhx, this.mvz);
            }
            continue label54;
         }

         return new r72$kqk(var1, var2, var3, var4, this.twa, this.fhx, this.mvz);
      }
   }

   public r72$kqk clx(OpaquePredicate param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: bipush 0
      // 02: invokestatic r72.z4i (Lt9d;Z)Lcom/google/common/cache/LoadingCache;
      // 05: astore 4
      // 07: aload 0
      // 08: getfield r72.twa I
      // 0b: aload 0
      // 0c: getfield r72.fhx I
      // 0f: invokestatic java/lang/Math.max (II)I
      // 12: aload 0
      // 13: getfield r72.mvz I
      // 16: invokestatic java/lang/Math.max (II)I
      // 19: istore 5
      // 1b: invokestatic OpaquePredicate.c ()I
      // 1e: aload 2
      // 1f: aload 2
      // 20: iload 5
      // 22: bipush 1
      // 23: isub
      // 24: iload 5
      // 26: bipush 1
      // 27: isub
      // 28: iload 5
      // 2a: bipush 1
      // 2b: isub
      // 2c: invokevirtual mew.ec4 (III)Lmew;
      // 2f: invokestatic mew.kil (Lmew;Lmew;)Ljava/lang/Iterable;
      // 32: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 37: astore 6
      // 39: istore 3
      // 3a: aload 6
      // 3c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 41: ifeq e8
      // 44: aload 6
      // 46: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 4b: checkcast mew
      // 4e: astore 7
      // 50: invokestatic vt2.values ()[Lvt2;
      // 53: astore 8
      // 55: aload 8
      // 57: arraylength
      // 58: istore 9
      // 5a: bipush 0
      // 5b: istore 10
      // 5d: iload 10
      // 5f: iload 9
      // 61: if_icmpge e4
      // 64: aload 8
      // 66: iload 10
      // 68: aaload
      // 69: astore 11
      // 6b: invokestatic vt2.values ()[Lvt2;
      // 6e: astore 12
      // 70: aload 12
      // 72: arraylength
      // 73: istore 13
      // 75: bipush 0
      // 76: iload 3
      // 77: ifne 41
      // 7a: istore 14
      // 7c: iload 14
      // 7e: iload 13
      // 80: if_icmpge dd
      // 83: aload 12
      // 85: iload 14
      // 87: aaload
      // 88: astore 15
      // 8a: iload 3
      // 8b: ifne d9
      // 8e: aload 15
      // 90: iload 3
      // 91: ifne 4b
      // 94: goto 9b
      // 97: invokestatic r72.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 9a: athrow
      // 9b: aload 11
      // 9d: if_acmpeq d6
      // a0: aload 15
      // a2: aload 11
      // a4: invokevirtual vt2.b4b ()Lvt2;
      // a7: if_acmpeq d6
      // aa: goto b1
      // ad: invokestatic r72.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // b0: athrow
      // b1: aload 0
      // b2: aload 7
      // b4: aload 11
      // b6: aload 15
      // b8: aload 4
      // ba: invokespecial r72.gqo (Lmew;Lvt2;Lvt2;Lcom/google/common/cache/LoadingCache;)Lr72$kqk;
      // bd: astore 16
      // bf: iload 3
      // c0: ifne d9
      // c3: aload 16
      // c5: ifnull d6
      // c8: goto cf
      // cb: invokestatic r72.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // ce: athrow
      // cf: aload 16
      // d1: areturn
      // d2: invokestatic r72.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // d5: athrow
      // d6: iinc 14 1
      // d9: iload 3
      // da: ifeq 7c
      // dd: iinc 10 1
      // e0: iload 3
      // e1: ifeq 5d
      // e4: iload 3
      // e5: ifeq 3a
      // e8: aconst_null
      // e9: areturn
   }

   public static LoadingCache z4i(OpaquePredicate var0, boolean var1) {
      return CacheBuilder.newBuilder().build(new r72$ct2(var0, var1));
   }

   public static mew d_2(mew param0, vt2 param1, vt2 param2, int param3, int param4, int param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic r72.a J
      // 03: ldc2_w 131038858821574
      // 06: lxor
      // 07: lstore 6
      // 09: invokestatic OpaquePredicate.c ()I
      // 0c: istore 8
      // 0e: aload 1
      // 0f: aload 2
      // 10: iload 8
      // 12: ifne 2b
      // 15: if_acmpeq b4
      // 18: goto 1f
      // 1b: invokestatic r72.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1e: athrow
      // 1f: aload 1
      // 20: aload 2
      // 21: invokevirtual vt2.b4b ()Lvt2;
      // 24: goto 2b
      // 27: invokestatic r72.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2a: athrow
      // 2b: if_acmpeq b4
      // 2e: new wgo
      // 31: dup
      // 32: aload 1
      // 33: invokevirtual vt2.n67 ()I
      // 36: aload 1
      // 37: invokevirtual vt2.g5t ()I
      // 3a: aload 1
      // 3b: invokevirtual vt2.ozy ()I
      // 3e: invokespecial wgo.<init> (III)V
      // 41: astore 9
      // 43: new wgo
      // 46: dup
      // 47: aload 2
      // 48: invokevirtual vt2.n67 ()I
      // 4b: aload 2
      // 4c: invokevirtual vt2.g5t ()I
      // 4f: aload 2
      // 50: invokevirtual vt2.ozy ()I
      // 53: invokespecial wgo.<init> (III)V
      // 56: astore 10
      // 58: aload 9
      // 5a: aload 10
      // 5c: invokevirtual wgo.ufc (Lwgo;)Lwgo;
      // 5f: astore 11
      // 61: aload 0
      // 62: aload 10
      // 64: invokevirtual wgo.getX ()I
      // 67: iload 4
      // 69: ineg
      // 6a: imul
      // 6b: aload 11
      // 6d: invokevirtual wgo.getX ()I
      // 70: iload 3
      // 71: imul
      // 72: iadd
      // 73: aload 9
      // 75: invokevirtual wgo.getX ()I
      // 78: iload 5
      // 7a: imul
      // 7b: iadd
      // 7c: aload 10
      // 7e: invokevirtual wgo.getY ()I
      // 81: iload 4
      // 83: ineg
      // 84: imul
      // 85: aload 11
      // 87: invokevirtual wgo.getY ()I
      // 8a: iload 3
      // 8b: imul
      // 8c: iadd
      // 8d: aload 9
      // 8f: invokevirtual wgo.getY ()I
      // 92: iload 5
      // 94: imul
      // 95: iadd
      // 96: aload 10
      // 98: invokevirtual wgo.getZ ()I
      // 9b: iload 4
      // 9d: ineg
      // 9e: imul
      // 9f: aload 11
      // a1: invokevirtual wgo.getZ ()I
      // a4: iload 3
      // a5: imul
      // a6: iadd
      // a7: aload 9
      // a9: invokevirtual wgo.getZ ()I
      // ac: iload 5
      // ae: imul
      // af: iadd
      // b0: invokevirtual mew.ec4 (III)Lmew;
      // b3: areturn
      // b4: new java/lang/IllegalArgumentException
      // b7: dup
      // b8: getstatic r72.b Ljava/lang/String;
      // bb: nop
      // bc: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // bf: athrow
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(8452495993923207006L, 4617756570096166448L, MethodHandles.lookup().lookupClass()).a(164173093833471L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 92586692641031L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("*´ \r7±jó\u0087\u0010åÒ\u001eÅæ\"\b\u00891gç\u0087m\fx³Ï\u0098M\u0084QH=\u009d\u00adAÊ}=l".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
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
