import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _u_ implements _4o {
   private static final long a;
   private static final String b;

   public _u_(osd var1, w9p var2) {
      int var10000 = t9d.b();
      this.yhy = true;
      this.czf = var1;
      int var3 = var10000;
      this.e9k = var2;
      this.hu1 = var2.o3r();
      int var4 = 0;

      while (var4 < 3) {
         this.ywi.put(var4, Sets.newHashSet());
         var4++;
         if (var3 == 0) {
            break;
         }
      }
   }

   @Override
   public w9p vyz() {
      return this.e9k;
   }

   @Override
   public double zdx() {
      return this.hu1;
   }

   @Override
   public void zf7(double var1) {
      try {
         if (var1 != this.zdx()) {
            this.hu1 = var1;
            this.t30();
         }
      } catch (IllegalArgumentException var3) {
         throw a(var3);
      }
   }

   @Override
   public Collection n2v(int var1) {
      return (Collection)this.ywi.get(var1);
   }

   @Override
   public Collection mid() {
      HashSet var2 = Sets.newHashSet();
      int var10000 = t9d.b();
      int var3 = 0;
      int var1 = var10000;

      while (true) {
         if (var3 < 3) {
            try {
               var5 = var2;
               if (var1 == 0) {
                  break;
               }

               var2.addAll(this.n2v(var3));
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

   @Override
   public xk5 aq3(UUID var1) {
      return (xk5)this.cv7.get(var1);
   }

   @Override
   public boolean zaq(xk5 var1) {
      try {
         if (this.cv7.get(var1.gac()) != null) {
            return true;
         }
      } catch (IllegalArgumentException var2) {
         throw a(var2);
      }

      return false;
   }

   @Override
   public void vcr(xk5 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic _u_.a J
      // 03: ldc2_w 94522611801178
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.c ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: aload 1
      // 0f: invokevirtual xk5.gac ()Ljava/util/UUID;
      // 12: invokevirtual _u_.aq3 (Ljava/util/UUID;)Lxk5;
      // 15: iload 4
      // 17: ifne 41
      // 1a: ifnull 34
      // 1d: goto 24
      // 20: invokestatic _u_.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 23: athrow
      // 24: new java/lang/IllegalArgumentException
      // 27: dup
      // 28: getstatic _u_.b Ljava/lang/String;
      // 2b: nop
      // 2c: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 2f: athrow
      // 30: invokestatic _u_.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 33: athrow
      // 34: aload 0
      // 35: getfield _u_._2g Ljava/util/Map;
      // 38: aload 1
      // 39: invokevirtual xk5.jhj ()Ljava/lang/String;
      // 3c: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 41: checkcast java/util/Set
      // 44: astore 5
      // 46: aload 5
      // 48: iload 4
      // 4a: ifne 9d
      // 4d: ifnonnull 6c
      // 50: goto 57
      // 53: invokestatic _u_.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 56: athrow
      // 57: invokestatic com/google/common/collect/Sets.newHashSet ()Ljava/util/HashSet;
      // 5a: astore 5
      // 5c: aload 0
      // 5d: getfield _u_._2g Ljava/util/Map;
      // 60: aload 1
      // 61: invokevirtual xk5.jhj ()Ljava/lang/String;
      // 64: aload 5
      // 66: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 6b: pop
      // 6c: aload 0
      // 6d: getfield _u_.ywi Ljava/util/Map;
      // 70: aload 1
      // 71: invokevirtual xk5.zdp ()I
      // 74: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 77: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 7c: checkcast java/util/Set
      // 7f: aload 1
      // 80: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 85: pop
      // 86: aload 5
      // 88: aload 1
      // 89: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 8e: pop
      // 8f: aload 0
      // 90: getfield _u_.cv7 Ljava/util/Map;
      // 93: aload 1
      // 94: invokevirtual xk5.gac ()Ljava/util/UUID;
      // 97: aload 1
      // 98: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 9d: pop
      // 9e: aload 0
      // 9f: invokevirtual _u_.t30 ()V
      // a2: return
   }

   public void t30() {
      this.yhy = true;
      this.czf.d8j(this);
   }

   @Override
   public void se8(xk5 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: bipush 0
      // 05: istore 3
      // 06: iload 3
      // 07: bipush 3
      // 08: if_icmpge 38
      // 0b: aload 0
      // 0c: getfield _u_.ywi Ljava/util/Map;
      // 0f: iload 3
      // 10: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 13: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 18: checkcast java/util/Set
      // 1b: astore 4
      // 1d: aload 4
      // 1f: iload 2
      // 20: ifne 48
      // 23: aload 1
      // 24: invokeinterface java/util/Set.remove (Ljava/lang/Object;)Z 2
      // 29: pop
      // 2a: iinc 3 1
      // 2d: iload 2
      // 2e: ifeq 06
      // 31: goto 38
      // 34: invokestatic _u_.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 37: athrow
      // 38: aload 0
      // 39: getfield _u_._2g Ljava/util/Map;
      // 3c: aload 1
      // 3d: invokevirtual xk5.jhj ()Ljava/lang/String;
      // 40: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 45: checkcast java/util/Set
      // 48: astore 3
      // 49: aload 3
      // 4a: iload 2
      // 4b: ifne 9d
      // 4e: ifnull 90
      // 51: goto 58
      // 54: invokestatic _u_.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 57: athrow
      // 58: aload 3
      // 59: aload 1
      // 5a: invokeinterface java/util/Set.remove (Ljava/lang/Object;)Z 2
      // 5f: pop
      // 60: aload 3
      // 61: iload 2
      // 62: ifne 9d
      // 65: goto 6c
      // 68: invokestatic _u_.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6b: athrow
      // 6c: invokeinterface java/util/Set.isEmpty ()Z 1
      // 71: ifeq 90
      // 74: goto 7b
      // 77: invokestatic _u_.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 7a: athrow
      // 7b: aload 0
      // 7c: getfield _u_._2g Ljava/util/Map;
      // 7f: aload 1
      // 80: invokevirtual xk5.jhj ()Ljava/lang/String;
      // 83: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 88: pop
      // 89: goto 90
      // 8c: invokestatic _u_.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 8f: athrow
      // 90: aload 0
      // 91: getfield _u_.cv7 Ljava/util/Map;
      // 94: aload 1
      // 95: invokevirtual xk5.gac ()Ljava/util/UUID;
      // 98: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 9d: pop
      // 9e: aload 0
      // 9f: invokevirtual _u_.t30 ()V
      // a2: return
   }

   @Override
   public void inp() {
      int var1 = t9d.c();
      Collection var2 = this.mid();

      Collection var10000;
      label28: {
         try {
            var10000 = var2;
            if (var1 != 0) {
               break label28;
            }

            if (var2 == null) {
               return;
            }
         } catch (IllegalArgumentException var5) {
            throw a(var5);
         }

         var10000 = var2;
      }

      for (xk5 var4 : Lists.newArrayList(var10000)) {
         this.se8(var4);
         if (var1 != 0) {
            break;
         }
      }
   }

   @Override
   public double nz5() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 2b
      // 09: getfield _u_.yhy Z
      // 0c: ifeq 2a
      // 0f: goto 16
      // 12: invokestatic _u_.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15: athrow
      // 16: aload 0
      // 17: aload 0
      // 18: invokespecial _u_.pdl ()D
      // 1b: putfield _u_.qpr D
      // 1e: aload 0
      // 1f: bipush 0
      // 20: putfield _u_.yhy Z
      // 23: goto 2a
      // 26: invokestatic _u_.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 29: athrow
      // 2a: aload 0
      // 2b: getfield _u_.qpr D
      // 2e: dreturn
   }

   private double pdl() {
      double var2 = this.zdx();
      int var10000 = t9d.c();
      Iterator var4 = this.z0t(0).iterator();
      int var1 = var10000;

      while (true) {
         if (var4.hasNext()) {
            xk5 var5 = (xk5)var4.next();
            var11 = var2 + var5._2u();
            if (var1 != 0) {
               break;
            }

            var2 = var11;
            if (var1 == 0) {
               continue;
            }
         }

         var11 = var2;
         break;
      }

      double var9 = var11;
      Iterator var6 = this.z0t(1).iterator();

      while (true) {
         if (var6.hasNext()) {
            xk5 var7 = (xk5)var6.next();
            var9 += var2 * var7._2u();

            try {
               if (var1 != 0) {
                  break;
               }

               if (var1 == 0) {
                  continue;
               }
            } catch (IllegalArgumentException var8) {
               throw a(var8);
            }
         }

         var6 = this.z0t(2).iterator();
         break;
      }

      while (true) {
         if (var6.hasNext()) {
            xk5 var10 = (xk5)var6.next();
            var12 = var9 * (1.0 + var10._2u());
            if (var1 != 0) {
               break;
            }

            var9 = var12;
            if (var1 == 0) {
               continue;
            }
         }

         var12 = this.e9k.qot(var9);
         break;
      }

      return var12;
   }

   private Collection z0t(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: iload 1
      // 02: invokevirtual _u_.n2v (I)Ljava/util/Collection;
      // 05: invokestatic com/google/common/collect/Sets.newHashSet (Ljava/lang/Iterable;)Ljava/util/HashSet;
      // 08: astore 3
      // 09: invokestatic t9d.c ()I
      // 0c: aload 0
      // 0d: getfield _u_.e9k Lw9p;
      // 10: invokeinterface w9p.z1n ()Lw9p; 1
      // 15: astore 4
      // 17: istore 2
      // 18: aload 4
      // 1a: ifnull 5b
      // 1d: aload 0
      // 1e: getfield _u_.czf Losd;
      // 21: aload 4
      // 23: invokevirtual osd.d3k (Lw9p;)L_4o;
      // 26: astore 5
      // 28: iload 2
      // 29: ifne 57
      // 2c: aload 5
      // 2e: ifnull 4e
      // 31: goto 38
      // 34: invokestatic _u_.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 37: athrow
      // 38: aload 3
      // 39: aload 5
      // 3b: iload 1
      // 3c: invokeinterface _4o.n2v (I)Ljava/util/Collection; 2
      // 41: invokeinterface java/util/Set.addAll (Ljava/util/Collection;)Z 2
      // 46: pop
      // 47: goto 4e
      // 4a: invokestatic _u_.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4d: athrow
      // 4e: aload 4
      // 50: invokeinterface w9p.z1n ()Lw9p; 1
      // 55: astore 4
      // 57: iload 2
      // 58: ifeq 18
      // 5b: aload 3
      // 5c: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(3278662069135692963L, 7266896529338512619L, MethodHandles.lookup().lookupClass()).a(64780591528803L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 58665504056428L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal(
         "vj-\u009bôÚºÐµÞ\f4`3i?Q\u0016Ts;ýjtÖù\u001e\u009d\u0004+P/\u00adè£qñú\u0001ó\b1Â«\u008a\u0095\u001a\u0090".getBytes("ISO-8859-1")
      );
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
