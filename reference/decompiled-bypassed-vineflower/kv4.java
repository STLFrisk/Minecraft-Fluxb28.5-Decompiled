import com.google.common.base.Joiner;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class kv4 {
   private static final Joiner u81;
   private final List t3q = Lists.newArrayList();
   private final Map w4h = Maps.newHashMap();
   private int hiy;
   private int b5m;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   private kv4() {
      this.w4h.put(' ', Predicates.alwaysTrue());
   }

   public kv4 _gi(String[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic kv4.a J
      // 003: ldc2_w 82505041099693
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic t9d.b ()I
      // 00b: istore 4
      // 00d: aload 1
      // 00e: checkcast [Ljava/lang/Object;
      // 011: invokestatic org/apache/commons/lang3/ArrayUtils.isEmpty ([Ljava/lang/Object;)Z
      // 014: iload 4
      // 016: ifeq 030
      // 019: ifne 1d4
      // 01c: goto 023
      // 01f: invokestatic kv4.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 022: athrow
      // 023: aload 1
      // 024: bipush 0
      // 025: aaload
      // 026: invokestatic org/apache/commons/lang3/StringUtils.isEmpty (Ljava/lang/CharSequence;)Z
      // 029: goto 030
      // 02c: invokestatic kv4.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 02f: athrow
      // 030: iload 4
      // 032: ifeq 04f
      // 035: ifne 1d4
      // 038: goto 03f
      // 03b: invokestatic kv4.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 03e: athrow
      // 03f: aload 0
      // 040: getfield kv4.t3q Ljava/util/List;
      // 043: invokeinterface java/util/List.isEmpty ()Z 1
      // 048: goto 04f
      // 04b: invokestatic kv4.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 04e: athrow
      // 04f: iload 4
      // 051: ifeq 083
      // 054: ifeq 075
      // 057: goto 05e
      // 05a: invokestatic kv4.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 05d: athrow
      // 05e: aload 0
      // 05f: aload 1
      // 060: arraylength
      // 061: putfield kv4.hiy I
      // 064: aload 0
      // 065: aload 1
      // 066: bipush 0
      // 067: aaload
      // 068: invokevirtual java/lang/String.length ()I
      // 06b: putfield kv4.b5m I
      // 06e: goto 075
      // 071: invokestatic kv4.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 074: athrow
      // 075: aload 1
      // 076: iload 4
      // 078: ifeq 0d5
      // 07b: arraylength
      // 07c: goto 083
      // 07f: invokestatic kv4.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 082: athrow
      // 083: aload 0
      // 084: getfield kv4.hiy I
      // 087: if_icmpeq 0d4
      // 08a: new java/lang/IllegalArgumentException
      // 08d: dup
      // 08e: new java/lang/StringBuilder
      // 091: dup
      // 092: invokespecial java/lang/StringBuilder.<init> ()V
      // 095: sipush 13368
      // 098: ldc2_w 4558545164874924097
      // 09b: lload 2
      // 09c: lxor
      // 09d: invokedynamic a (IJ)Ljava/lang/String; bsm=kv4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a2: nop
      // 0a3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a6: aload 0
      // 0a7: getfield kv4.hiy I
      // 0aa: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0ad: sipush 12335
      // 0b0: ldc2_w 7750893521689822291
      // 0b3: lload 2
      // 0b4: lxor
      // 0b5: invokedynamic a (IJ)Ljava/lang/String; bsm=kv4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ba: nop
      // 0bb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0be: aload 1
      // 0bf: arraylength
      // 0c0: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0c3: ldc ")"
      // 0c5: nop
      // 0c6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0cc: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 0cf: athrow
      // 0d0: invokestatic kv4.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0d3: athrow
      // 0d4: aload 1
      // 0d5: astore 5
      // 0d7: aload 5
      // 0d9: arraylength
      // 0da: istore 6
      // 0dc: bipush 0
      // 0dd: istore 7
      // 0df: iload 7
      // 0e1: iload 6
      // 0e3: if_icmpge 1c7
      // 0e6: aload 5
      // 0e8: iload 7
      // 0ea: aaload
      // 0eb: astore 8
      // 0ed: aload 8
      // 0ef: iload 4
      // 0f1: ifeq 160
      // 0f4: invokevirtual java/lang/String.length ()I
      // 0f7: iload 4
      // 0f9: ifeq 1d1
      // 0fc: goto 103
      // 0ff: invokestatic kv4.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 102: athrow
      // 103: aload 0
      // 104: getfield kv4.b5m I
      // 107: if_icmpeq 15e
      // 10a: goto 111
      // 10d: invokestatic kv4.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 110: athrow
      // 111: new java/lang/IllegalArgumentException
      // 114: dup
      // 115: new java/lang/StringBuilder
      // 118: dup
      // 119: invokespecial java/lang/StringBuilder.<init> ()V
      // 11c: sipush 19748
      // 11f: ldc2_w 2941650820320409946
      // 122: lload 2
      // 123: lxor
      // 124: invokedynamic a (IJ)Ljava/lang/String; bsm=kv4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 129: nop
      // 12a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 12d: aload 0
      // 12e: getfield kv4.b5m I
      // 131: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 134: sipush 14388
      // 137: ldc2_w 585220969935522894
      // 13a: lload 2
      // 13b: lxor
      // 13c: invokedynamic a (IJ)Ljava/lang/String; bsm=kv4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 141: nop
      // 142: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 145: aload 8
      // 147: invokevirtual java/lang/String.length ()I
      // 14a: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 14d: ldc ")"
      // 14f: nop
      // 150: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 153: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 156: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 159: athrow
      // 15a: invokestatic kv4.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15d: athrow
      // 15e: aload 8
      // 160: invokevirtual java/lang/String.toCharArray ()[C
      // 163: astore 9
      // 165: aload 9
      // 167: arraylength
      // 168: istore 10
      // 16a: bipush 0
      // 16b: istore 11
      // 16d: iload 11
      // 16f: iload 10
      // 171: if_icmpge 1bf
      // 174: aload 9
      // 176: iload 11
      // 178: caload
      // 179: istore 12
      // 17b: iload 4
      // 17d: ifeq 1ba
      // 180: aload 0
      // 181: getfield kv4.w4h Ljava/util/Map;
      // 184: iload 12
      // 186: invokestatic java/lang/Character.valueOf (C)Ljava/lang/Character;
      // 189: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 18e: iload 4
      // 190: ifeq 0e1
      // 193: goto 19a
      // 196: invokestatic kv4.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 199: athrow
      // 19a: ifne 1b7
      // 19d: aload 0
      // 19e: getfield kv4.w4h Ljava/util/Map;
      // 1a1: iload 12
      // 1a3: invokestatic java/lang/Character.valueOf (C)Ljava/lang/Character;
      // 1a6: aconst_null
      // 1a7: checkcast com/google/common/base/Predicate
      // 1aa: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 1af: pop
      // 1b0: goto 1b7
      // 1b3: invokestatic kv4.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1b6: athrow
      // 1b7: iinc 11 1
      // 1ba: iload 4
      // 1bc: ifne 16d
      // 1bf: iinc 7 1
      // 1c2: iload 4
      // 1c4: ifne 0df
      // 1c7: aload 0
      // 1c8: getfield kv4.t3q Ljava/util/List;
      // 1cb: aload 1
      // 1cc: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1d1: pop
      // 1d2: aload 0
      // 1d3: areturn
      // 1d4: new java/lang/IllegalArgumentException
      // 1d7: dup
      // 1d8: sipush 22367
      // 1db: ldc2_w 5193185570064474912
      // 1de: lload 2
      // 1df: lxor
      // 1e0: invokedynamic a (IJ)Ljava/lang/String; bsm=kv4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e5: nop
      // 1e6: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 1e9: athrow
   }

   public static kv4 _54() {
      return new kv4();
   }

   public kv4 l90(char var1, Predicate var2) {
      this.w4h.put(var1, var2);
      return this;
   }

   public r72 m7f() {
      return new r72(this.isp());
   }

   private Predicate[][][] isp() {
      this.fj0();
      int var10000 = t9d.c();
      Predicate[][][] var2 = (Predicate[][][])Array.newInstance(Predicate.class, this.t3q.size(), this.hiy, this.b5m);
      int var3 = 0;
      int var1 = var10000;

      label49:
      while (true) {
         var10000 = var3;

         label47:
         while (var10000 < this.t3q.size()) {
            int var4 = 0;

            while (var4 < this.hiy) {
               var10000 = 0;
               if (var1 != 0) {
                  continue label47;
               }

               int var5 = 0;

               while (true) {
                  if (var5 < this.b5m) {
                     try {
                        var2[var3][var4][var5] = (Predicate)this.w4h.get(((String[])this.t3q.get(var3))[var4].charAt(var5));
                        var5++;
                        if (var1 != 0) {
                           break;
                        }

                        if (var1 == 0) {
                           continue;
                        }
                     } catch (IllegalArgumentException var6) {
                        throw a(var6);
                     }
                  }

                  var4++;
                  break;
               }

               if (var1 != 0) {
                  break;
               }
            }

            var3++;
            if (var1 != 0) {
               return var2;
            }
            continue label49;
         }

         return var2;
      }
   }

   private void fj0() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic kv4.a J
      // 03: ldc2_w 109952459416227
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 0b: astore 4
      // 0d: invokestatic t9d.b ()I
      // 10: aload 0
      // 11: getfield kv4.w4h Ljava/util/Map;
      // 14: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 19: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 1e: astore 5
      // 20: istore 3
      // 21: aload 5
      // 23: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 28: ifeq 66
      // 2b: aload 5
      // 2d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 32: checkcast java/util/Map$Entry
      // 35: astore 6
      // 37: iload 3
      // 38: ifeq b3
      // 3b: aload 6
      // 3d: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 42: ifnonnull 62
      // 45: goto 4c
      // 48: invokestatic kv4.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4b: athrow
      // 4c: aload 4
      // 4e: aload 6
      // 50: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 55: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 5a: pop
      // 5b: goto 62
      // 5e: invokestatic kv4.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 61: athrow
      // 62: iload 3
      // 63: ifne 21
      // 66: aload 4
      // 68: invokeinterface java/util/List.isEmpty ()Z 1
      // 6d: ifne b3
      // 70: new java/lang/IllegalStateException
      // 73: dup
      // 74: new java/lang/StringBuilder
      // 77: dup
      // 78: invokespecial java/lang/StringBuilder.<init> ()V
      // 7b: sipush 5099
      // 7e: ldc2_w 8844808174709636760
      // 81: lload 1
      // 82: lxor
      // 83: invokedynamic a (IJ)Ljava/lang/String; bsm=kv4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 88: nop
      // 89: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8c: getstatic kv4.u81 Lcom/google/common/base/Joiner;
      // 8f: aload 4
      // 91: invokevirtual com/google/common/base/Joiner.join (Ljava/lang/Iterable;)Ljava/lang/String;
      // 94: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 97: sipush 17094
      // 9a: ldc2_w 3056963426706141104
      // 9d: lload 1
      // 9e: lxor
      // 9f: invokedynamic a (IJ)Ljava/lang/String; bsm=kv4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a4: nop
      // a5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // ab: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // ae: athrow
      // af: invokestatic kv4.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // b2: athrow
      // b3: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-7267280863954297720L, -4829603862962908080L, MethodHandles.lookup().lookupClass()).a(234169108995662L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 93189124431033L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[7];
      int var7 = 0;
      String var6 = "\u0083Wø¾l4døU\u001f\u0004\u0098EY\t'6{-ÕÔ?ïnÙùC°°i«508Ã\u0007o@>îY[4\u001fÀEË ºÑ\u0099\u007f$GÝ\u000e²\u0087\u009ej°dç\u00048\u009e|@X´íëù\u001cº\u0002·Ð\rX±b3!W\u00ad\u0083\\*\u0081u?\u000bÈgà\u0000ÌÚ\u009bT\u009e³B\u00ad\u007f{©\u0092ôVÍ·<ÍL\u0017\u001e0+Rp\u007fÁ\r\u0016Å\u007f\u008c¢{\"\u0085þ´ãJ\rN5¸äª¿GAf\u009e¤\u008c»|\u0086\"©Ùý\u0093\u008a@þ²Éhü\u0086pùFL{wÑ£vì\u008d\f¼\u0089ëD]»ñ\u0092ûÚé\u001d>nA«9ô¢Iç·\u008d,{\u0084 å\u0099Úä=\u0019\u008eåÏ\fMß\u000fnu\u0015N\u009dkÕ?ib âÂ.2\u0018(Ìt\u0006\u001d\u001cÌ\u0013¸¶x£Gy\u008c\\n\u009c\u008f¦ì\u0015|:\u00144U»ûÎ¡àöÐáú@\u00adÃ±  D [þ&¨B\u009fÝÎ\u001câÇ\u008fÿê\b\u009còMú êÝã>º|\u0005Ewõ";
      int var8 = "\u0083Wø¾l4døU\u001f\u0004\u0098EY\t'6{-ÕÔ?ïnÙùC°°i«508Ã\u0007o@>îY[4\u001fÀEË ºÑ\u0099\u007f$GÝ\u000e²\u0087\u009ej°dç\u00048\u009e|@X´íëù\u001cº\u0002·Ð\rX±b3!W\u00ad\u0083\\*\u0081u?\u000bÈgà\u0000ÌÚ\u009bT\u009e³B\u00ad\u007f{©\u0092ôVÍ·<ÍL\u0017\u001e0+Rp\u007fÁ\r\u0016Å\u007f\u008c¢{\"\u0085þ´ãJ\rN5¸äª¿GAf\u009e¤\u008c»|\u0086\"©Ùý\u0093\u008a@þ²Éhü\u0086pùFL{wÑ£vì\u008d\f¼\u0089ëD]»ñ\u0092ûÚé\u001d>nA«9ô¢Iç·\u008d,{\u0084 å\u0099Úä=\u0019\u008eåÏ\fMß\u000fnu\u0015N\u009dkÕ?ib âÂ.2\u0018(Ìt\u0006\u001d\u001cÌ\u0013¸¶x£Gy\u008c\\n\u009c\u008f¦ì\u0015|:\u00144U»ûÎ¡àöÐáú@\u00adÃ±  D [þ&¨B\u009fÝÎ\u001câÇ\u008fÿê\b\u009còMú êÝã>º|\u0005Ewõ"
         .length();
      char var5 = '@';
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
                     c = new String[7];
                     u81 = Joiner.on(",");
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

                  var6 = "b}º°\u001e\u0083Z\u000e\u0010¡e?#úGÜ¯\u0094þE÷B\u0006\u001bãÔÊ(ðs\u0085ZÑL\u009fü\u001e>\u0097]\u008ceï\u0005ÎªÞ?ÔKæz\u0099$J\u009a(Øj<\u0098\u008a\u008bÉ.Ø@¾átø\u008dÀ^e\u007f©=r.\u000e\u0003\u0012®\u0095s~Ó\u0086ñAp\u0094Ï§ñÖ";
                  var8 = "b}º°\u001e\u0083Z\u000e\u0010¡e?#úGÜ¯\u0094þE÷B\u0006\u001bãÔÊ(ðs\u0085ZÑL\u009fü\u001e>\u0097]\u008ceï\u0005ÎªÞ?ÔKæz\u0099$J\u009a(Øj<\u0098\u008a\u008bÉ.Ø@¾átø\u008dÀ^e\u007f©=r.\u000e\u0003\u0012®\u0095s~Ó\u0086ñAp\u0094Ï§ñÖ"
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 25732;
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
            throw new RuntimeException("kv4", var10);
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
         throw new RuntimeException("kv4" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
