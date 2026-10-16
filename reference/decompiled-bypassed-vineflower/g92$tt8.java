import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Maps;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class g92$tt8 extends j0s {
   private final e0x k_n;
   private final ImmutableMap h_x;
   private ImmutableTable dyi;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   private g92$tt8(e0x var1, ImmutableMap var2) {
      this.k_n = var1;
      this.h_x = var2;
   }

   @Override
   public Collection ku2() {
      return Collections.unmodifiableCollection(this.h_x.keySet());
   }

   @Override
   public Comparable dil(xny param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic g92$tt8.a J
      // 03: ldc2_w 48289181900338
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.c ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: getfield g92$tt8.h_x Lcom/google/common/collect/ImmutableMap;
      // 11: iload 4
      // 13: ifne 7b
      // 16: aload 1
      // 17: invokevirtual com/google/common/collect/ImmutableMap.containsKey (Ljava/lang/Object;)Z
      // 1a: ifne 6a
      // 1d: goto 24
      // 20: invokestatic g92$tt8.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 23: athrow
      // 24: new java/lang/IllegalArgumentException
      // 27: dup
      // 28: new java/lang/StringBuilder
      // 2b: dup
      // 2c: invokespecial java/lang/StringBuilder.<init> ()V
      // 2f: sipush 29695
      // 32: ldc2_w 1010177167221686598
      // 35: lload 2
      // 36: lxor
      // 37: invokedynamic s (IJ)Ljava/lang/String; bsm=g92$tt8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c: nop
      // 3d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 40: aload 1
      // 41: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 44: sipush 332
      // 47: ldc2_w 4066764681651385331
      // 4a: lload 2
      // 4b: lxor
      // 4c: invokedynamic s (IJ)Ljava/lang/String; bsm=g92$tt8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51: nop
      // 52: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 55: aload 0
      // 56: getfield g92$tt8.k_n Le0x;
      // 59: invokevirtual e0x.w_4 ()Lg92;
      // 5c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 5f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 62: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 65: athrow
      // 66: invokestatic g92$tt8.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 69: athrow
      // 6a: aload 1
      // 6b: invokeinterface xny.pn7 ()Ljava/lang/Class; 1
      // 70: aload 0
      // 71: getfield g92$tt8.h_x Lcom/google/common/collect/ImmutableMap;
      // 74: aload 1
      // 75: invokevirtual com/google/common/collect/ImmutableMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 78: invokevirtual java/lang/Class.cast (Ljava/lang/Object;)Ljava/lang/Object;
      // 7b: checkcast java/lang/Comparable
      // 7e: areturn
   }

   @Override
   public zfz zvi(xny param1, Comparable param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic g92$tt8.a J
      // 003: ldc2_w 54617367114033
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic t9d.c ()I
      // 00b: istore 5
      // 00d: aload 0
      // 00e: getfield g92$tt8.h_x Lcom/google/common/collect/ImmutableMap;
      // 011: aload 1
      // 012: invokevirtual com/google/common/collect/ImmutableMap.containsKey (Ljava/lang/Object;)Z
      // 015: iload 5
      // 017: ifne 082
      // 01a: ifne 06a
      // 01d: goto 024
      // 020: invokestatic g92$tt8.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 023: athrow
      // 024: new java/lang/IllegalArgumentException
      // 027: dup
      // 028: new java/lang/StringBuilder
      // 02b: dup
      // 02c: invokespecial java/lang/StringBuilder.<init> ()V
      // 02f: sipush 9356
      // 032: ldc2_w 6768519894158129459
      // 035: lload 3
      // 036: lxor
      // 037: invokedynamic s (IJ)Ljava/lang/String; bsm=g92$tt8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03c: nop
      // 03d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 040: aload 1
      // 041: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 044: sipush 22596
      // 047: ldc2_w 8170583670206973439
      // 04a: lload 3
      // 04b: lxor
      // 04c: invokedynamic s (IJ)Ljava/lang/String; bsm=g92$tt8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 051: nop
      // 052: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 055: aload 0
      // 056: getfield g92$tt8.k_n Le0x;
      // 059: invokevirtual e0x.w_4 ()Lg92;
      // 05c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 05f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 062: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 065: athrow
      // 066: invokestatic g92$tt8.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 069: athrow
      // 06a: aload 1
      // 06b: invokeinterface xny.isr ()Ljava/util/Collection; 1
      // 070: aload 2
      // 071: iload 5
      // 073: ifne 109
      // 076: invokeinterface java/util/Collection.contains (Ljava/lang/Object;)Z 2
      // 07b: goto 082
      // 07e: invokestatic g92$tt8.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 081: athrow
      // 082: ifne 0f4
      // 085: new java/lang/IllegalArgumentException
      // 088: dup
      // 089: new java/lang/StringBuilder
      // 08c: dup
      // 08d: invokespecial java/lang/StringBuilder.<init> ()V
      // 090: sipush 28378
      // 093: ldc2_w 4539493620790522722
      // 096: lload 3
      // 097: lxor
      // 098: invokedynamic s (IJ)Ljava/lang/String; bsm=g92$tt8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09d: nop
      // 09e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a1: aload 1
      // 0a2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0a5: sipush 25129
      // 0a8: ldc2_w 5390300089749962647
      // 0ab: lload 3
      // 0ac: lxor
      // 0ad: invokedynamic s (IJ)Ljava/lang/String; bsm=g92$tt8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b2: nop
      // 0b3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b6: aload 2
      // 0b7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0ba: sipush 26115
      // 0bd: ldc2_w 4611158973688216506
      // 0c0: lload 3
      // 0c1: lxor
      // 0c2: invokedynamic s (IJ)Ljava/lang/String; bsm=g92$tt8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c7: nop
      // 0c8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0cb: getstatic e0x.db8 Ljnv;
      // 0ce: aload 0
      // 0cf: getfield g92$tt8.k_n Le0x;
      // 0d2: invokevirtual jnv.csx (Ljava/lang/Object;)Ljava/lang/Object;
      // 0d5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0d8: sipush 18395
      // 0db: ldc2_w 3401285920921573990
      // 0de: lload 3
      // 0df: lxor
      // 0e0: invokedynamic s (IJ)Ljava/lang/String; bsm=g92$tt8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e5: nop
      // 0e6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0ec: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 0ef: athrow
      // 0f0: invokestatic g92$tt8.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0f3: athrow
      // 0f4: aload 0
      // 0f5: getfield g92$tt8.h_x Lcom/google/common/collect/ImmutableMap;
      // 0f8: aload 1
      // 0f9: invokevirtual com/google/common/collect/ImmutableMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0fc: iload 5
      // 0fe: ifne 11d
      // 101: aload 2
      // 102: goto 109
      // 105: invokestatic g92$tt8.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 108: athrow
      // 109: if_acmpne 114
      // 10c: aload 0
      // 10d: goto 120
      // 110: invokestatic g92$tt8.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 113: athrow
      // 114: aload 0
      // 115: getfield g92$tt8.dyi Lcom/google/common/collect/ImmutableTable;
      // 118: aload 1
      // 119: aload 2
      // 11a: invokevirtual com/google/common/collect/ImmutableTable.get (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 11d: checkcast zfz
      // 120: areturn
   }

   @Override
   public ImmutableMap q2y() {
      return this.h_x;
   }

   @Override
   public e0x r_y() {
      return this.k_n;
   }

   @Override
   public boolean equals(Object var1) {
      try {
         if (this == var1) {
            return true;
         }
      } catch (IllegalArgumentException var2) {
         throw a(var2);
      }

      return false;
   }

   @Override
   public int hashCode() {
      return this.h_x.hashCode();
   }

   public void ugw(Map param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield g92$tt8.dyi Lcom/google/common/collect/ImmutableTable;
      // 08: ifnull 17
      // 0b: new java/lang/IllegalStateException
      // 0e: dup
      // 0f: invokespecial java/lang/IllegalStateException.<init> ()V
      // 12: athrow
      // 13: invokestatic g92$tt8.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 16: athrow
      // 17: invokestatic com/google/common/collect/HashBasedTable.create ()Lcom/google/common/collect/HashBasedTable;
      // 1a: astore 3
      // 1b: aload 0
      // 1c: getfield g92$tt8.h_x Lcom/google/common/collect/ImmutableMap;
      // 1f: invokevirtual com/google/common/collect/ImmutableMap.keySet ()Lcom/google/common/collect/ImmutableSet;
      // 22: invokevirtual com/google/common/collect/ImmutableSet.iterator ()Lcom/google/common/collect/UnmodifiableIterator;
      // 25: astore 4
      // 27: aload 4
      // 29: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2e: ifeq aa
      // 31: aload 4
      // 33: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 38: checkcast xny
      // 3b: astore 5
      // 3d: iload 2
      // 3e: ifne b2
      // 41: aload 5
      // 43: invokeinterface xny.isr ()Ljava/util/Collection; 1
      // 48: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 4d: astore 6
      // 4f: aload 6
      // 51: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 56: ifeq a6
      // 59: aload 6
      // 5b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 60: checkcast java/lang/Comparable
      // 63: astore 7
      // 65: aload 7
      // 67: iload 2
      // 68: ifne 38
      // 6b: iload 2
      // 6c: ifne a1
      // 6f: aload 0
      // 70: getfield g92$tt8.h_x Lcom/google/common/collect/ImmutableMap;
      // 73: aload 5
      // 75: invokevirtual com/google/common/collect/ImmutableMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 78: if_acmpeq a2
      // 7b: goto 82
      // 7e: invokestatic g92$tt8.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 81: athrow
      // 82: aload 3
      // 83: aload 5
      // 85: aload 7
      // 87: aload 1
      // 88: aload 0
      // 89: aload 5
      // 8b: aload 7
      // 8d: invokespecial g92$tt8.l9k (Lxny;Ljava/lang/Comparable;)Ljava/util/Map;
      // 90: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 95: invokeinterface com/google/common/collect/Table.put (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 4
      // 9a: goto a1
      // 9d: invokestatic g92$tt8.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // a0: athrow
      // a1: pop
      // a2: iload 2
      // a3: ifeq 4f
      // a6: iload 2
      // a7: ifeq 27
      // aa: aload 0
      // ab: aload 3
      // ac: invokestatic com/google/common/collect/ImmutableTable.copyOf (Lcom/google/common/collect/Table;)Lcom/google/common/collect/ImmutableTable;
      // af: putfield g92$tt8.dyi Lcom/google/common/collect/ImmutableTable;
      // b2: return
   }

   private Map l9k(xny var1, Comparable var2) {
      HashMap var3 = Maps.newHashMap(this.h_x);
      var3.put(var1, var2);
      return var3;
   }

   public g92$tt8(e0x var1, ImmutableMap var2, g92$1 var3) {
      this(var1, var2);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1366878326504131623L, -8816546604470379817L, MethodHandles.lookup().lookupClass()).a(164841399566332L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 46545909576470L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[8];
      int var7 = 0;
      String var6 = "sÍMuã\u0004×Ë\u0088<\u001fC\u0010y©:ÅbBÿ\u008aóÝ¦\u0011\u0004\u0090b\u009d:w°M\u0088Ìÿz`\u001f®+ðG\u007fnÓ\u000fÖ(\u000bí\u009fÖ´Ç\u00967D®\u0018'\u0006\u009b\u0005.<g\u0082mCËòB\u0082K\u00ad\u000e\u000e»3\u0098\u0088\u0099wÏLÒº\u0013 ÖcU\u0081Ék®\u0080?\u0082a\u00161Ms\u0089§i£!ÛÀÙ\u0086]Ô\u00945î®]Ø(C\u008f\u0018\u0098\u0086\u0081ÂÁ\r\u0004\täé\u009d\u001e\u0087¿\u000e\u0006Ã&\u0088>é\u00adPªµMµ)ÔRDûè\n\u009a·Ñ(R\u001d\u008eqçs\u0013¿³ô×\u007f\u001b¹¯è\u009c^¢\u0003EÝ;\u001eÃj\u0011e~\u0085\ra\u009f^¼ª\u009eQä\u001f\u0010W\u001b/ÄãÂ d\u0082L4Ýw\u0085Wk";
      int var8 = "sÍMuã\u0004×Ë\u0088<\u001fC\u0010y©:ÅbBÿ\u008aóÝ¦\u0011\u0004\u0090b\u009d:w°M\u0088Ìÿz`\u001f®+ðG\u007fnÓ\u000fÖ(\u000bí\u009fÖ´Ç\u00967D®\u0018'\u0006\u009b\u0005.<g\u0082mCËòB\u0082K\u00ad\u000e\u000e»3\u0098\u0088\u0099wÏLÒº\u0013 ÖcU\u0081Ék®\u0080?\u0082a\u00161Ms\u0089§i£!ÛÀÙ\u0086]Ô\u00945î®]Ø(C\u008f\u0018\u0098\u0086\u0081ÂÁ\r\u0004\täé\u009d\u001e\u0087¿\u000e\u0006Ã&\u0088>é\u00adPªµMµ)ÔRDûè\n\u009a·Ñ(R\u001d\u008eqçs\u0013¿³ô×\u007f\u001b¹¯è\u009c^¢\u0003EÝ;\u001eÃj\u0011e~\u0085\ra\u009f^¼ª\u009eQä\u001f\u0010W\u001b/ÄãÂ d\u0082L4Ýw\u0085Wk"
         .length();
      char var5 = '0';
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
                     c = new String[8];
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

                  var6 = "8rÓ/ÀA*YÉá{\u001flÄ`¦S\u0010º\u0081\u0015é°ë¡BY\u0097a\u0085\u0017|}c«I\u0004Ìu\u001aÆøð\u0010á÷ô¶Yµ\u009eù\u000b\u0001WN0?îË\u0013\u0013\u001d\u007fºÞ2½¼e1\u009ej4SYXAÿ\u0013Ó\u0099ÎB2\u0093»\u0088ìÙè\rì;{\u0083ê\u0097Ë\u0002ø\u0015d`¦";
                  var8 = "8rÓ/ÀA*YÉá{\u001flÄ`¦S\u0010º\u0081\u0015é°ë¡BY\u0097a\u0085\u0017|}c«I\u0004Ìu\u001aÆøð\u0010á÷ô¶Yµ\u009eù\u000b\u0001WN0?îË\u0013\u0013\u001d\u007fºÞ2½¼e1\u009ej4SYXAÿ\u0013Ó\u0099ÎB2\u0093»\u0088ìÙè\rì;{\u0083ê\u0097Ë\u0002ø\u0015d`¦"
                     .length();
                  var5 = '8';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 17624;
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
            throw new RuntimeException("g92$tt8", var10);
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
         throw new RuntimeException("g92$tt8" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
