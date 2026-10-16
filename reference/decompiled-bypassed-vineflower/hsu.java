import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class hsu extends yem {
   public List c8v = Lists.newArrayList();
   public static final Pattern mus;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public hsu(String var1, Object[] var2) {
      this.qqh = var1;
      this.yxs = var2;

      for (Object var6 : var2) {
         try {
            if (var6 instanceof ekw) {
               ((ekw)var6).f4q().dn3(this.f4q());
            }
         } catch (epk var7) {
            throw a(var7);
         }
      }
   }

   public synchronized void omu() {
      int var1 = t9d.b();
      synchronized (this._ry) {
         label50: {
            long var3 = orr.bh8();

            try {
               if (var1 == 0) {
                  break label50;
               }

               if (var3 == this.eii) {
                  return;
               }
            } catch (epk var8) {
               throw a(var8);
            }

            this.eii = var3;
            this.c8v.clear();
         }
      }

      try {
         this.ft5(orr.zgh(this.qqh));
      } catch (epk var7) {
         this.c8v.clear();

         try {
            this.ft5(orr.f4s(this.qqh));
         } catch (epk var6) {
            throw var7;
         }
      }
   }

   public void ft5(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic hsu.a J
      // 003: ldc2_w 67528406881753
      // 006: lxor
      // 007: lstore 2
      // 008: bipush 0
      // 009: istore 5
      // 00b: getstatic hsu.mus Ljava/util/regex/Pattern;
      // 00e: aload 1
      // 00f: invokevirtual java/util/regex/Pattern.matcher (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
      // 012: astore 6
      // 014: invokestatic t9d.b ()I
      // 017: bipush 0
      // 018: istore 7
      // 01a: bipush 0
      // 01b: istore 8
      // 01d: istore 4
      // 01f: aload 6
      // 021: iload 8
      // 023: invokevirtual java/util/regex/Matcher.find (I)Z
      // 026: ifeq 1a8
      // 029: aload 6
      // 02b: invokevirtual java/util/regex/Matcher.start ()I
      // 02e: istore 10
      // 030: aload 6
      // 032: invokevirtual java/util/regex/Matcher.end ()I
      // 035: istore 9
      // 037: iload 10
      // 039: iload 8
      // 03b: iload 4
      // 03d: ifeq 1ae
      // 040: if_icmple 07b
      // 043: goto 04a
      // 046: invokestatic hsu.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 049: athrow
      // 04a: new tao
      // 04d: dup
      // 04e: aload 1
      // 04f: iload 8
      // 051: iload 10
      // 053: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 056: bipush 0
      // 057: anewarray 37
      // 05a: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 05d: invokespecial tao.<init> (Ljava/lang/String;)V
      // 060: astore 11
      // 062: aload 11
      // 064: invokevirtual tao.f4q ()Lpoy;
      // 067: aload 0
      // 068: invokevirtual hsu.f4q ()Lpoy;
      // 06b: invokevirtual poy.dn3 (Lpoy;)Lpoy;
      // 06e: pop
      // 06f: aload 0
      // 070: getfield hsu.c8v Ljava/util/List;
      // 073: aload 11
      // 075: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 07a: pop
      // 07b: aload 6
      // 07d: bipush 2
      // 07e: invokevirtual java/util/regex/Matcher.group (I)Ljava/lang/String;
      // 081: astore 11
      // 083: aload 1
      // 084: iload 10
      // 086: iload 9
      // 088: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 08b: astore 12
      // 08d: ldc "%"
      // 08f: nop
      // 090: aload 11
      // 092: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 095: iload 4
      // 097: ifeq 112
      // 09a: ifeq 0f7
      // 09d: goto 0a4
      // 0a0: invokestatic hsu.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a3: athrow
      // 0a4: sipush 25496
      // 0a7: ldc2_w 4205589336741005304
      // 0aa: lload 2
      // 0ab: lxor
      // 0ac: invokedynamic e (IJ)Ljava/lang/String; bsm=hsu.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b1: nop
      // 0b2: aload 12
      // 0b4: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0b7: iload 4
      // 0b9: ifeq 112
      // 0bc: goto 0c3
      // 0bf: invokestatic hsu.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0c2: athrow
      // 0c3: ifeq 0f7
      // 0c6: goto 0cd
      // 0c9: invokestatic hsu.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0cc: athrow
      // 0cd: new tao
      // 0d0: dup
      // 0d1: ldc "%"
      // 0d3: nop
      // 0d4: invokespecial tao.<init> (Ljava/lang/String;)V
      // 0d7: astore 13
      // 0d9: aload 13
      // 0db: invokevirtual tao.f4q ()Lpoy;
      // 0de: aload 0
      // 0df: invokevirtual hsu.f4q ()Lpoy;
      // 0e2: invokevirtual poy.dn3 (Lpoy;)Lpoy;
      // 0e5: pop
      // 0e6: aload 0
      // 0e7: getfield hsu.c8v Ljava/util/List;
      // 0ea: aload 13
      // 0ec: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0f1: pop
      // 0f2: iload 4
      // 0f4: ifne 19f
      // 0f7: ldc "s"
      // 0f9: nop
      // 0fa: iload 4
      // 0fc: ifeq 14e
      // 0ff: goto 106
      // 102: invokestatic hsu.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 105: athrow
      // 106: aload 11
      // 108: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 10b: goto 112
      // 10e: invokestatic hsu.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 111: athrow
      // 112: ifne 148
      // 115: new epk
      // 118: dup
      // 119: aload 0
      // 11a: new java/lang/StringBuilder
      // 11d: dup
      // 11e: invokespecial java/lang/StringBuilder.<init> ()V
      // 121: sipush 9882
      // 124: ldc2_w 5594672428888490744
      // 127: lload 2
      // 128: lxor
      // 129: invokedynamic e (IJ)Ljava/lang/String; bsm=hsu.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12e: nop
      // 12f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 132: aload 12
      // 134: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 137: ldc "'"
      // 139: nop
      // 13a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 140: invokespecial epk.<init> (Lhsu;Ljava/lang/String;)V
      // 143: athrow
      // 144: invokestatic hsu.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 147: athrow
      // 148: aload 6
      // 14a: bipush 1
      // 14b: invokevirtual java/util/regex/Matcher.group (I)Ljava/lang/String;
      // 14e: astore 13
      // 150: aload 13
      // 152: iload 4
      // 154: ifeq 163
      // 157: ifnull 16b
      // 15a: goto 161
      // 15d: invokestatic hsu.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 160: athrow
      // 161: aload 13
      // 163: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 166: bipush 1
      // 167: isub
      // 168: goto 170
      // 16b: iload 7
      // 16d: iinc 7 1
      // 170: istore 14
      // 172: iload 14
      // 174: iload 4
      // 176: ifeq 1a1
      // 179: aload 0
      // 17a: getfield hsu.yxs [Ljava/lang/Object;
      // 17d: arraylength
      // 17e: if_icmpge 19f
      // 181: goto 188
      // 184: invokestatic hsu.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 187: athrow
      // 188: aload 0
      // 189: getfield hsu.c8v Ljava/util/List;
      // 18c: aload 0
      // 18d: iload 14
      // 18f: invokespecial hsu._a6 (I)Lekw;
      // 192: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 197: pop
      // 198: goto 19f
      // 19b: invokestatic hsu.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 19e: athrow
      // 19f: iload 9
      // 1a1: istore 8
      // 1a3: iload 4
      // 1a5: ifne 01f
      // 1a8: iload 8
      // 1aa: aload 1
      // 1ab: invokevirtual java/lang/String.length ()I
      // 1ae: if_icmpge 1e0
      // 1b1: new tao
      // 1b4: dup
      // 1b5: aload 1
      // 1b6: iload 8
      // 1b8: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 1bb: bipush 0
      // 1bc: anewarray 37
      // 1bf: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 1c2: invokespecial tao.<init> (Ljava/lang/String;)V
      // 1c5: astore 10
      // 1c7: aload 10
      // 1c9: invokevirtual tao.f4q ()Lpoy;
      // 1cc: aload 0
      // 1cd: invokevirtual hsu.f4q ()Lpoy;
      // 1d0: invokevirtual poy.dn3 (Lpoy;)Lpoy;
      // 1d3: pop
      // 1d4: aload 0
      // 1d5: getfield hsu.c8v Ljava/util/List;
      // 1d8: aload 10
      // 1da: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1df: pop
      // 1e0: goto 1f0
      // 1e3: astore 9
      // 1e5: new epk
      // 1e8: dup
      // 1e9: aload 0
      // 1ea: aload 9
      // 1ec: invokespecial epk.<init> (Lhsu;Ljava/lang/Throwable;)V
      // 1ef: athrow
      // 1f0: return
   }

   private ekw _a6(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic hsu.a J
      // 03: ldc2_w 9772361005085
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.b ()I
      // 0b: istore 4
      // 0d: iload 1
      // 0e: aload 0
      // 0f: getfield hsu.yxs [Ljava/lang/Object;
      // 12: arraylength
      // 13: if_icmplt 24
      // 16: new epk
      // 19: dup
      // 1a: aload 0
      // 1b: iload 1
      // 1c: invokespecial epk.<init> (Lhsu;I)V
      // 1f: athrow
      // 20: invokestatic hsu.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 23: athrow
      // 24: aload 0
      // 25: getfield hsu.yxs [Ljava/lang/Object;
      // 28: iload 1
      // 29: aaload
      // 2a: astore 5
      // 2c: aload 5
      // 2e: iload 4
      // 30: ifeq 49
      // 33: instanceof ekw
      // 36: ifeq 53
      // 39: goto 40
      // 3c: invokestatic hsu.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3f: athrow
      // 40: aload 5
      // 42: goto 49
      // 45: invokestatic hsu.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 48: athrow
      // 49: checkcast ekw
      // 4c: astore 6
      // 4e: iload 4
      // 50: ifne 91
      // 53: new tao
      // 56: dup
      // 57: aload 5
      // 59: ifnonnull 78
      // 5c: goto 63
      // 5f: invokestatic hsu.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 62: athrow
      // 63: sipush 10070
      // 66: ldc2_w 6884202969957756661
      // 69: lload 2
      // 6a: lxor
      // 6b: invokedynamic e (IJ)Ljava/lang/String; bsm=hsu.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 70: nop
      // 71: goto 7d
      // 74: invokestatic hsu.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 77: athrow
      // 78: aload 5
      // 7a: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 7d: invokespecial tao.<init> (Ljava/lang/String;)V
      // 80: astore 6
      // 82: aload 6
      // 84: invokeinterface ekw.f4q ()Lpoy; 1
      // 89: aload 0
      // 8a: invokevirtual hsu.f4q ()Lpoy;
      // 8d: invokevirtual poy.dn3 (Lpoy;)Lpoy;
      // 90: pop
      // 91: aload 6
      // 93: areturn
   }

   @Override
   public ekw di5(poy param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: invokespecial yem.di5 (Lpoy;)Lekw;
      // 05: pop
      // 06: invokestatic t9d.b ()I
      // 09: aload 0
      // 0a: getfield hsu.yxs [Ljava/lang/Object;
      // 0d: astore 3
      // 0e: aload 3
      // 0f: arraylength
      // 10: istore 4
      // 12: istore 2
      // 13: bipush 0
      // 14: istore 5
      // 16: iload 5
      // 18: iload 4
      // 1a: if_icmpge 61
      // 1d: aload 3
      // 1e: iload 5
      // 20: aaload
      // 21: astore 6
      // 23: iload 2
      // 24: ifeq 5d
      // 27: aload 6
      // 29: instanceof ekw
      // 2c: iload 2
      // 2d: ifeq 74
      // 30: goto 37
      // 33: invokestatic hsu.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 36: athrow
      // 37: ifeq 5a
      // 3a: goto 41
      // 3d: invokestatic hsu.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 40: athrow
      // 41: aload 6
      // 43: checkcast ekw
      // 46: invokeinterface ekw.f4q ()Lpoy; 1
      // 4b: aload 0
      // 4c: invokevirtual hsu.f4q ()Lpoy;
      // 4f: invokevirtual poy.dn3 (Lpoy;)Lpoy;
      // 52: pop
      // 53: goto 5a
      // 56: invokestatic hsu.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 59: athrow
      // 5a: iinc 5 1
      // 5d: iload 2
      // 5e: ifne 16
      // 61: aload 0
      // 62: iload 2
      // 63: ifeq a6
      // 66: getfield hsu.eii J
      // 69: ldc2_w -1
      // 6c: lcmp
      // 6d: goto 74
      // 70: invokestatic hsu.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 73: athrow
      // 74: ifle a5
      // 77: aload 0
      // 78: getfield hsu.c8v Ljava/util/List;
      // 7b: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 80: astore 3
      // 81: aload 3
      // 82: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 87: ifeq a5
      // 8a: aload 3
      // 8b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 90: checkcast ekw
      // 93: astore 4
      // 95: aload 4
      // 97: invokeinterface ekw.f4q ()Lpoy; 1
      // 9c: aload 1
      // 9d: invokevirtual poy.dn3 (Lpoy;)Lpoy;
      // a0: pop
      // a1: iload 2
      // a2: ifne 81
      // a5: aload 0
      // a6: areturn
   }

   @Override
   public Iterator iterator() {
      this.omu();
      return Iterators.concat(eez(this.c8v), eez(this.asp));
   }

   @Override
   public String cpz() {
      this.omu();
      int var10000 = t9d.c();
      StringBuilder var2 = new StringBuilder();
      int var1 = var10000;
      Iterator var3 = this.c8v.iterator();

      while (true) {
         if (var3.hasNext()) {
            ekw var4 = (ekw)var3.next();

            try {
               var6 = var2.append(var4.cpz());
               if (var1 != 0) {
                  break;
               }

               if (var1 == 0) {
                  continue;
               }
            } catch (epk var5) {
               throw a(var5);
            }
         }

         var6 = var2;
         break;
      }

      return var6.toString();
   }

   public hsu qy8() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield hsu.yxs [Ljava/lang/Object;
      // 04: arraylength
      // 05: anewarray 37
      // 08: astore 2
      // 09: invokestatic t9d.b ()I
      // 0c: bipush 0
      // 0d: istore 3
      // 0e: istore 1
      // 0f: iload 3
      // 10: aload 0
      // 11: getfield hsu.yxs [Ljava/lang/Object;
      // 14: arraylength
      // 15: if_icmpge 6d
      // 18: aload 0
      // 19: iload 1
      // 1a: ifeq 79
      // 1d: getfield hsu.yxs [Ljava/lang/Object;
      // 20: iload 3
      // 21: iload 1
      // 22: ifeq 5f
      // 25: goto 2c
      // 28: invokestatic hsu.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2b: athrow
      // 2c: aaload
      // 2d: instanceof ekw
      // 30: ifeq 56
      // 33: goto 3a
      // 36: invokestatic hsu.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 39: athrow
      // 3a: aload 2
      // 3b: iload 3
      // 3c: aload 0
      // 3d: getfield hsu.yxs [Ljava/lang/Object;
      // 40: iload 3
      // 41: aaload
      // 42: checkcast ekw
      // 45: invokeinterface ekw.qy8 ()Lekw; 1
      // 4a: aastore
      // 4b: iload 1
      // 4c: ifne 66
      // 4f: goto 56
      // 52: invokestatic hsu.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 55: athrow
      // 56: aload 2
      // 57: iload 3
      // 58: goto 5f
      // 5b: invokestatic hsu.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5e: athrow
      // 5f: aload 0
      // 60: getfield hsu.yxs [Ljava/lang/Object;
      // 63: iload 3
      // 64: aaload
      // 65: aastore
      // 66: iinc 3 1
      // 69: iload 1
      // 6a: ifne 0f
      // 6d: new hsu
      // 70: dup
      // 71: aload 0
      // 72: getfield hsu.qqh Ljava/lang/String;
      // 75: aload 2
      // 76: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 79: astore 3
      // 7a: aload 3
      // 7b: aload 0
      // 7c: invokevirtual hsu.f4q ()Lpoy;
      // 7f: invokevirtual poy.esg ()Lpoy;
      // 82: invokevirtual hsu.di5 (Lpoy;)Lekw;
      // 85: pop
      // 86: aload 0
      // 87: invokevirtual hsu.iwv ()Ljava/util/List;
      // 8a: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 8f: astore 4
      // 91: aload 4
      // 93: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 98: ifeq c2
      // 9b: aload 4
      // 9d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // a2: checkcast ekw
      // a5: astore 5
      // a7: aload 3
      // a8: iload 1
      // a9: ifeq c3
      // ac: aload 5
      // ae: invokeinterface ekw.qy8 ()Lekw; 1
      // b3: invokevirtual hsu.vha (Lekw;)Lekw;
      // b6: pop
      // b7: iload 1
      // b8: ifne 91
      // bb: goto c2
      // be: invokestatic hsu.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // c1: athrow
      // c2: aload 3
      // c3: areturn
   }

   @Override
   public boolean equals(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifeq 1b
      // 09: aload 1
      // 0a: if_acmpne 1a
      // 0d: goto 14
      // 10: invokestatic hsu.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 13: athrow
      // 14: bipush 1
      // 15: ireturn
      // 16: invokestatic hsu.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 19: athrow
      // 1a: aload 1
      // 1b: iload 2
      // 1c: ifeq 33
      // 1f: instanceof hsu
      // 22: ifne 32
      // 25: goto 2c
      // 28: invokestatic hsu.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2b: athrow
      // 2c: bipush 0
      // 2d: ireturn
      // 2e: invokestatic hsu.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 31: athrow
      // 32: aload 1
      // 33: checkcast hsu
      // 36: astore 3
      // 37: aload 0
      // 38: getfield hsu.yxs [Ljava/lang/Object;
      // 3b: aload 3
      // 3c: getfield hsu.yxs [Ljava/lang/Object;
      // 3f: invokestatic java/util/Arrays.equals ([Ljava/lang/Object;[Ljava/lang/Object;)Z
      // 42: iload 2
      // 43: ifeq 62
      // 46: ifeq 8e
      // 49: goto 50
      // 4c: invokestatic hsu.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4f: athrow
      // 50: aload 0
      // 51: getfield hsu.qqh Ljava/lang/String;
      // 54: aload 3
      // 55: getfield hsu.qqh Ljava/lang/String;
      // 58: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 5b: goto 62
      // 5e: invokestatic hsu.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 61: athrow
      // 62: iload 2
      // 63: ifeq 7c
      // 66: ifeq 8e
      // 69: goto 70
      // 6c: invokestatic hsu.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6f: athrow
      // 70: aload 0
      // 71: aload 1
      // 72: invokespecial yem.equals (Ljava/lang/Object;)Z
      // 75: goto 7c
      // 78: invokestatic hsu.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 7b: athrow
      // 7c: iload 2
      // 7d: ifeq 8b
      // 80: ifeq 8e
      // 83: goto 8a
      // 86: invokestatic hsu.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 89: athrow
      // 8a: bipush 1
      // 8b: goto 8f
      // 8e: bipush 0
      // 8f: ireturn
   }

   @Override
   public int hashCode() {
      int var1 = super.hashCode();
      var1 = 31 * var1 + this.qqh.hashCode();
      return 31 * var1 + Arrays.hashCode(this.yxs);
   }

   @Override
   public String toString() {
      long var1 = a ^ 111528978328207L;
      return b<"e">(24871, 661437995663571472L ^ var1)
         + this.qqh
         + '\''
         + b<"e">(30270, 7463604693695147276L ^ var1)
         + Arrays.toString(this.yxs)
         + b<"e">(24744, 3526568427215240093L ^ var1)
         + this.asp
         + b<"e">(30564, 3210985119251049556L ^ var1)
         + this.f4q()
         + '}';
   }

   public String z24() {
      return this.qqh;
   }

   public Object[] a69() {
      return this.yxs;
   }

   @Override
   public ekw qy8() {
      return this.qy8();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3125897355610946223L, 130764602547185038L, MethodHandles.lookup().lookupClass()).a(247587160137800L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 94874640347501L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[8];
      int var5 = 0;
      String var4 = "tFÒö\u0085ÍM\u008büËÉ/¼KF©´ nX§\u009e`NHlFý{Fl\u0014\u0010/)\u000b\u0012\u00ad@¼\u0084\u00ade×ì1\u009c\u0018\r\u0010\u0088ÎÓ\u009fË#ÀÁÁÝ¡tç\u0015Ú:0á½ýØ\u008c\f\u0007\u007f\u008d\u008a\u009b\u0007^Ú\u000f¢îYÇg\u0019\u0098Ø\u0089\b;þ\u009c\u0089\u0095\u001f Ù]~<\u0001RÂû\u0096Ï[¿ùYj|(¤\u0085ü=\u001fB~ÊÚßê#®3(Ð¼\u0098\u0016Y\u0017\u008d\u008còqÝÀ\u0004dÊ-\u0005^r9&;TNÛ 4èp²ÿ\u000f;ÀB\u009f\u001f/Î1Ì\u008d\u0012óëBýûë.N\u009dû\t¾\u008c\"u";
      int var6 = "tFÒö\u0085ÍM\u008büËÉ/¼KF©´ nX§\u009e`NHlFý{Fl\u0014\u0010/)\u000b\u0012\u00ad@¼\u0084\u00ade×ì1\u009c\u0018\r\u0010\u0088ÎÓ\u009fË#ÀÁÁÝ¡tç\u0015Ú:0á½ýØ\u008c\f\u0007\u007f\u008d\u008a\u009b\u0007^Ú\u000f¢îYÇg\u0019\u0098Ø\u0089\b;þ\u009c\u0089\u0095\u001f Ù]~<\u0001RÂû\u0096Ï[¿ùYj|(¤\u0085ü=\u001fB~ÊÚßê#®3(Ð¼\u0098\u0016Y\u0017\u008d\u008còqÝÀ\u0004dÊ-\u0005^r9&;TNÛ 4èp²ÿ\u000f;ÀB\u009f\u001f/Î1Ì\u008d\u0012óëBýûë.N\u009dû\t¾\u008c\"u"
         .length();
      char var3 = ' ';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     f = var7;
                     g = new String[8];
                     mus = Pattern.compile(b<"e">(6205, 1714950380951836908L ^ var9));
                     return;
                  }

                  var3 = var4.charAt(var12);
                  break;
               default:
                  var7[var5++] = var20;
                  if ((var12 += var3) < var6) {
                     var3 = var4.charAt(var12);
                     continue label27;
                  }

                  var4 = "°lBÔÖ´F¨èQJ\u0007\u001f\u0080)ø0}Ë\u009c\u0084\u000e\u0016ÞÂíâ\u0001ºå\u0003{q§\u000fmiêòîÕ\u0094Çb¶è b\u0002&\u0097\u0007\u0087õ[<:\u0094Ñ-\u0096Ûo¹'";
                  var6 = "°lBÔÖ´F¨èQJ\u0007\u001f\u0080)ø0}Ë\u009c\u0084\u000e\u0016ÞÂíâ\u0001ºå\u0003{q§\u000fmiêòîÕ\u0094Çb¶è b\u0002&\u0097\u0007\u0087õ[<:\u0094Ñ-\u0096Ûo¹'"
                     .length();
                  var3 = 16;
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
      }
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 21584;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("hsu", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = f[var5].getBytes("ISO-8859-1");
         g[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("hsu" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
