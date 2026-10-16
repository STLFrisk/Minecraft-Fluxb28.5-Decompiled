import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import java.lang.invoke.MethodHandles;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class m75 implements k_d {
   public Map aby = Maps.newLinkedHashMap();
   private static final long a;
   private static final String c;

   public String iir(Map param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic m75.a J
      // 03: ldc2_w 37591425643567
      // 06: lxor
      // 07: lstore 2
      // 08: new java/lang/StringBuilder
      // 0b: dup
      // 0c: invokespecial java/lang/StringBuilder.<init> ()V
      // 0f: astore 5
      // 11: invokestatic OpaquePredicate.c ()I
      // 14: aload 1
      // 15: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 1a: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 1f: astore 6
      // 21: istore 4
      // 23: aload 6
      // 25: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2a: ifeq ab
      // 2d: aload 6
      // 2f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 34: checkcast java/util/Map$Entry
      // 37: astore 7
      // 39: aload 5
      // 3b: iload 4
      // 3d: ifne 70
      // 40: invokevirtual java/lang/StringBuilder.length ()I
      // 43: iload 4
      // 45: ifne bc
      // 48: goto 4f
      // 4b: invokestatic m75.b (Loov;)Loov;
      // 4e: athrow
      // 4f: ifeq 69
      // 52: goto 59
      // 55: invokestatic m75.b (Loov;)Loov;
      // 58: athrow
      // 59: aload 5
      // 5b: ldc ","
      // 5d: nop
      // 5e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 61: pop
      // 62: goto 69
      // 65: invokestatic m75.b (Loov;)Loov;
      // 68: athrow
      // 69: aload 7
      // 6b: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 70: checkcast xny
      // 73: astore 8
      // 75: aload 7
      // 77: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 7c: checkcast java/lang/Comparable
      // 7f: astore 9
      // 81: aload 5
      // 83: aload 8
      // 85: invokeinterface xny.w6i ()Ljava/lang/String; 1
      // 8a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8d: pop
      // 8e: aload 5
      // 90: ldc "="
      // 92: nop
      // 93: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 96: pop
      // 97: aload 5
      // 99: aload 8
      // 9b: aload 9
      // 9d: invokeinterface xny._lf (Ljava/lang/Comparable;)Ljava/lang/String; 2
      // a2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a5: pop
      // a6: iload 4
      // a8: ifeq 23
      // ab: aload 5
      // ad: iload 4
      // af: ifne d2
      // b2: invokevirtual java/lang/StringBuilder.length ()I
      // b5: goto bc
      // b8: invokestatic m75.b (Loov;)Loov;
      // bb: athrow
      // bc: ifne d0
      // bf: aload 5
      // c1: getstatic m75.c Ljava/lang/String;
      // c4: nop
      // c5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c8: pop
      // c9: goto d0
      // cc: invokestatic m75.b (Loov;)Loov;
      // cf: athrow
      // d0: aload 5
      // d2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // d5: areturn
   }

   @Override
   public Map q2s(e0x var1) {
      int var2 = OpaquePredicate.b();
      UnmodifiableIterator var3 = var1.w_4().k64().iterator();

      Map var10000;
      while (true) {
         if (var3.hasNext()) {
            zfz var4 = (zfz)var3.next();

            try {
               var10000 = this.aby;
               if (var2 == 0) {
                  break;
               }

               this.aby.put(var4, this.htt(var4));
               if (var2 != 0) {
                  continue;
               }
            } catch (oov var5) {
               throw b(var5);
            }
         }

         var10000 = this.aby;
         break;
      }

      return var10000;
   }

   public abstract zlz htt(zfz var1);

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-4212950820956033674L, -7840402529469897208L, MethodHandles.lookup().lookupClass()).a(95114525901486L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 119804160794872L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("ÿçÍ\u0086d\u0092\fÀ".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      c = var6;
   }

   private static oov b(oov var0) {
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
