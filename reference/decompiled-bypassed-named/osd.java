import com.google.common.collect.HashMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class osd {
   public final Map zrx = Maps.newHashMap();
   public final Map xrb = new eln();
   public final Multimap w_w = HashMultimap.create();
   private static final long a;
   private static final String b;

   public _4o d3k(w9p var1) {
      return (_4o)this.zrx.get(var1);
   }

   public _4o srq(String var1) {
      return (_4o)this.xrb.get(var1);
   }

   public _4o ylc(w9p param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic osd.a J
      // 03: ldc2_w 125269905850725
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: iload 4
      // 10: ifeq 3c
      // 13: getfield osd.xrb Ljava/util/Map;
      // 16: aload 1
      // 17: invokeinterface w9p.ugh ()Ljava/lang/String; 1
      // 1c: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 21: ifeq 3b
      // 24: goto 2b
      // 27: invokestatic osd.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2a: athrow
      // 2b: new java/lang/IllegalArgumentException
      // 2e: dup
      // 2f: getstatic osd.b Ljava/lang/String;
      // 32: nop
      // 33: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 36: athrow
      // 37: invokestatic osd.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3a: athrow
      // 3b: aload 0
      // 3c: aload 1
      // 3d: invokevirtual osd.ly0 (Lw9p;)L_4o;
      // 40: astore 5
      // 42: aload 0
      // 43: getfield osd.xrb Ljava/util/Map;
      // 46: aload 1
      // 47: invokeinterface w9p.ugh ()Ljava/lang/String; 1
      // 4c: aload 5
      // 4e: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 53: pop
      // 54: aload 0
      // 55: getfield osd.zrx Ljava/util/Map;
      // 58: aload 1
      // 59: aload 5
      // 5b: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 60: pop
      // 61: aload 1
      // 62: invokeinterface w9p.z1n ()Lw9p; 1
      // 67: astore 6
      // 69: aload 6
      // 6b: ifnull 89
      // 6e: aload 0
      // 6f: getfield osd.w_w Lcom/google/common/collect/Multimap;
      // 72: aload 6
      // 74: aload 1
      // 75: invokeinterface com/google/common/collect/Multimap.put (Ljava/lang/Object;Ljava/lang/Object;)Z 3
      // 7a: pop
      // 7b: aload 6
      // 7d: invokeinterface w9p.z1n ()Lw9p; 1
      // 82: astore 6
      // 84: iload 4
      // 86: ifne 69
      // 89: aload 5
      // 8b: areturn
   }

   public abstract _4o ly0(w9p var1);

   public Collection vz0() {
      return this.xrb.values();
   }

   public void d8j(_4o var1) {
   }

   public void l05(Multimap var1) {
      int var2 = OpaquePredicate.b();

      for (Entry var4 : var1.entries()) {
         _4o var5 = this.srq((String)var4.getKey());

         label28: {
            _4o var10000;
            label27: {
               try {
                  var10000 = var5;
                  if (var2 == 0) {
                     break label27;
                  }

                  if (var5 == null) {
                     break label28;
                  }
               } catch (IllegalArgumentException var6) {
                  throw a(var6);
               }

               var10000 = var5;
            }

            var10000.se8((xk5)var4.getValue());
         }

         if (var2 == 0) {
            break;
         }
      }
   }

   public void fdu(Multimap param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: invokeinterface com/google/common/collect/Multimap.entries ()Ljava/util/Collection; 1
      // 0a: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 0f: astore 3
      // 10: aload 3
      // 11: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 16: ifeq 71
      // 19: aload 3
      // 1a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1f: checkcast java/util/Map$Entry
      // 22: astore 4
      // 24: aload 0
      // 25: aload 4
      // 27: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 2c: checkcast java/lang/String
      // 2f: invokevirtual osd.srq (Ljava/lang/String;)L_4o;
      // 32: astore 5
      // 34: aload 5
      // 36: iload 2
      // 37: ifeq 5e
      // 3a: ifnull 6d
      // 3d: goto 44
      // 40: invokestatic osd.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 43: athrow
      // 44: aload 5
      // 46: aload 4
      // 48: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 4d: checkcast xk5
      // 50: invokeinterface _4o.se8 (Lxk5;)V 2
      // 55: aload 5
      // 57: goto 5e
      // 5a: invokestatic osd.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5d: athrow
      // 5e: aload 4
      // 60: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 65: checkcast xk5
      // 68: invokeinterface _4o.vcr (Lxk5;)V 2
      // 6d: iload 2
      // 6e: ifne 10
      // 71: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2001836041328788377L, 3974513796147626322L, MethodHandles.lookup().lookupClass()).a(258098065235417L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 74769939936824L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u0016\u0006¦\u0019\u0098püÎW\u0015¥+1Ù÷!Wª#Çl\u001dp©¹\u0013+T\u0002Y¬pÛñ¨¡ê\"ã}".getBytes("ISO-8859-1"));
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
