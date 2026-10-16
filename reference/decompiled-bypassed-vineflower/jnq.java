import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class jnq implements rsi {
   public erg[] c41 = new erg[36];
   public erg[] _dn = new erg[4];
   public int nb5;
   public ha9 jsr;
   private erg jw8;
   public boolean el2;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public jnq(ha9 var1) {
      this.jsr = var1;
   }

   public erg dxs() {
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
      // 05: getfield jnq.nb5 I
      // 08: iload 1
      // 09: ifne 2e
      // 0c: bipush 9
      // 0e: if_icmpge 3d
      // 11: goto 18
      // 14: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: aload 0
      // 19: iload 1
      // 1a: ifne 32
      // 1d: goto 24
      // 20: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23: athrow
      // 24: getfield jnq.nb5 I
      // 27: goto 2e
      // 2a: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d: athrow
      // 2e: iflt 3d
      // 31: aload 0
      // 32: getfield jnq.c41 [Lerg;
      // 35: aload 0
      // 36: getfield jnq.nb5 I
      // 39: aaload
      // 3a: goto 3e
      // 3d: aconst_null
      // 3e: areturn
   }

   public static int jxk() {
      return 9;
   }

   private int ge3(u7m param1) {
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
      // 07: aload 0
      // 08: getfield jnq.c41 [Lerg;
      // 0b: arraylength
      // 0c: if_icmpge 44
      // 0f: aload 0
      // 10: getfield jnq.c41 [Lerg;
      // 13: iload 3
      // 14: aaload
      // 15: iload 2
      // 16: ifne 30
      // 19: ifnull 3d
      // 1c: goto 23
      // 1f: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22: athrow
      // 23: aload 0
      // 24: getfield jnq.c41 [Lerg;
      // 27: iload 3
      // 28: aaload
      // 29: goto 30
      // 2c: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f: athrow
      // 30: invokevirtual erg.gn1 ()Lu7m;
      // 33: aload 1
      // 34: if_acmpne 3d
      // 37: iload 3
      // 38: ireturn
      // 39: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c: athrow
      // 3d: iinc 3 1
      // 40: iload 2
      // 41: ifeq 06
      // 44: bipush -1
      // 45: ireturn
   }

   private int m08(u7m param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: bipush 0
      // 05: istore 4
      // 07: iload 4
      // 09: aload 0
      // 0a: getfield jnq.c41 [Lerg;
      // 0d: arraylength
      // 0e: if_icmpge 77
      // 11: aload 0
      // 12: getfield jnq.c41 [Lerg;
      // 15: iload 4
      // 17: aaload
      // 18: iload 3
      // 19: ifne 34
      // 1c: ifnull 70
      // 1f: goto 26
      // 22: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25: athrow
      // 26: aload 0
      // 27: getfield jnq.c41 [Lerg;
      // 2a: iload 4
      // 2c: aaload
      // 2d: goto 34
      // 30: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 33: athrow
      // 34: iload 3
      // 35: ifne 54
      // 38: invokevirtual erg.gn1 ()Lu7m;
      // 3b: aload 1
      // 3c: if_acmpne 70
      // 3f: goto 46
      // 42: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 45: athrow
      // 46: aload 0
      // 47: getfield jnq.c41 [Lerg;
      // 4a: iload 4
      // 4c: aaload
      // 4d: goto 54
      // 50: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 53: athrow
      // 54: invokevirtual erg.j6_ ()I
      // 57: iload 3
      // 58: ifne 6f
      // 5b: iload 2
      // 5c: if_icmpne 70
      // 5f: goto 66
      // 62: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 65: athrow
      // 66: iload 4
      // 68: goto 6f
      // 6b: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6e: athrow
      // 6f: ireturn
      // 70: iinc 4 1
      // 73: iload 3
      // 74: ifeq 07
      // 77: bipush -1
      // 78: ireturn
   }

   private int wjh(erg param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 2
      // 004: bipush 0
      // 005: istore 3
      // 006: iload 3
      // 007: aload 0
      // 008: getfield jnq.c41 [Lerg;
      // 00b: arraylength
      // 00c: if_icmpge 114
      // 00f: aload 0
      // 010: getfield jnq.c41 [Lerg;
      // 013: iload 3
      // 014: aaload
      // 015: iload 2
      // 016: ifeq 030
      // 019: ifnull 10d
      // 01c: goto 023
      // 01f: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 022: athrow
      // 023: aload 0
      // 024: getfield jnq.c41 [Lerg;
      // 027: iload 3
      // 028: aaload
      // 029: goto 030
      // 02c: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02f: athrow
      // 030: iload 2
      // 031: ifeq 052
      // 034: invokevirtual erg.gn1 ()Lu7m;
      // 037: aload 1
      // 038: invokevirtual erg.gn1 ()Lu7m;
      // 03b: if_acmpne 10d
      // 03e: goto 045
      // 041: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 044: athrow
      // 045: aload 0
      // 046: getfield jnq.c41 [Lerg;
      // 049: iload 3
      // 04a: aaload
      // 04b: goto 052
      // 04e: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 051: athrow
      // 052: invokevirtual erg._n3 ()Z
      // 055: iload 2
      // 056: ifeq 073
      // 059: ifeq 10d
      // 05c: goto 063
      // 05f: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 062: athrow
      // 063: aload 0
      // 064: getfield jnq.c41 [Lerg;
      // 067: iload 3
      // 068: aaload
      // 069: getfield erg.qd2 I
      // 06c: goto 073
      // 06f: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 072: athrow
      // 073: aload 0
      // 074: getfield jnq.c41 [Lerg;
      // 077: iload 3
      // 078: aaload
      // 079: invokevirtual erg.h4s ()I
      // 07c: iload 2
      // 07d: ifeq 0a9
      // 080: if_icmpge 10d
      // 083: goto 08a
      // 086: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 089: athrow
      // 08a: aload 0
      // 08b: getfield jnq.c41 [Lerg;
      // 08e: iload 3
      // 08f: aaload
      // 090: getfield erg.qd2 I
      // 093: iload 2
      // 094: ifeq 0bc
      // 097: goto 09e
      // 09a: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09d: athrow
      // 09e: aload 0
      // 09f: invokevirtual jnq.v6l ()I
      // 0a2: goto 0a9
      // 0a5: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a8: athrow
      // 0a9: if_icmpge 10d
      // 0ac: aload 0
      // 0ad: getfield jnq.c41 [Lerg;
      // 0b0: iload 3
      // 0b1: aaload
      // 0b2: invokevirtual erg.i5y ()Z
      // 0b5: goto 0bc
      // 0b8: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bb: athrow
      // 0bc: iload 2
      // 0bd: ifeq 0fd
      // 0c0: ifeq 0ec
      // 0c3: goto 0ca
      // 0c6: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c9: athrow
      // 0ca: aload 0
      // 0cb: getfield jnq.c41 [Lerg;
      // 0ce: iload 3
      // 0cf: aaload
      // 0d0: invokevirtual erg.j6_ ()I
      // 0d3: iload 2
      // 0d4: ifeq 0fd
      // 0d7: goto 0de
      // 0da: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0dd: athrow
      // 0de: aload 1
      // 0df: invokevirtual erg.j6_ ()I
      // 0e2: if_icmpne 10d
      // 0e5: goto 0ec
      // 0e8: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0eb: athrow
      // 0ec: aload 0
      // 0ed: getfield jnq.c41 [Lerg;
      // 0f0: iload 3
      // 0f1: aaload
      // 0f2: aload 1
      // 0f3: invokestatic erg.gjp (Lerg;Lerg;)Z
      // 0f6: goto 0fd
      // 0f9: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fc: athrow
      // 0fd: iload 2
      // 0fe: ifeq 10c
      // 101: ifeq 10d
      // 104: goto 10b
      // 107: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10a: athrow
      // 10b: iload 3
      // 10c: ireturn
      // 10d: iinc 3 1
      // 110: iload 2
      // 111: ifne 006
      // 114: bipush -1
      // 115: ireturn
   }

   public int d9p() {
      int var1 = t9d.b();
      int var2 = 0;

      while (var2 < this.c41.length) {
         try {
            if (this.c41[var2] == null) {
               return var2;
            }
         } catch (oov var3) {
            throw a(var3);
         }

         var2++;
         if (var1 == 0) {
            break;
         }
      }

      return -1;
   }

   public void _5g(u7m param1, int param2, boolean param3, boolean param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 5
      // 005: aload 0
      // 006: invokevirtual jnq.dxs ()Lerg;
      // 009: astore 6
      // 00b: iload 3
      // 00c: iload 5
      // 00e: ifeq 028
      // 011: ifeq 02b
      // 014: goto 01b
      // 017: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01a: athrow
      // 01b: aload 0
      // 01c: aload 1
      // 01d: iload 2
      // 01e: invokespecial jnq.m08 (Lu7m;I)I
      // 021: goto 028
      // 024: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 027: athrow
      // 028: goto 030
      // 02b: aload 0
      // 02c: aload 1
      // 02d: invokespecial jnq.ge3 (Lu7m;)I
      // 030: istore 7
      // 032: iload 7
      // 034: iload 5
      // 036: ifeq 078
      // 039: iflt 06f
      // 03c: goto 043
      // 03f: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 042: athrow
      // 043: iload 7
      // 045: iload 5
      // 047: ifeq 078
      // 04a: goto 051
      // 04d: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 050: athrow
      // 051: bipush 9
      // 053: if_icmpge 06f
      // 056: goto 05d
      // 059: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05c: athrow
      // 05d: aload 0
      // 05e: iload 7
      // 060: putfield jnq.nb5 I
      // 063: iload 5
      // 065: ifne 15d
      // 068: goto 06f
      // 06b: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06e: athrow
      // 06f: iload 4
      // 071: goto 078
      // 074: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 077: athrow
      // 078: ifeq 15d
      // 07b: aload 1
      // 07c: ifnull 15d
      // 07f: goto 086
      // 082: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 085: athrow
      // 086: aload 0
      // 087: invokevirtual jnq.d9p ()I
      // 08a: istore 8
      // 08c: iload 8
      // 08e: iload 5
      // 090: ifeq 09f
      // 093: iflt 0b1
      // 096: goto 09d
      // 099: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09c: athrow
      // 09d: iload 8
      // 09f: bipush 9
      // 0a1: if_icmpge 0b1
      // 0a4: aload 0
      // 0a5: iload 8
      // 0a7: putfield jnq.nb5 I
      // 0aa: goto 0b1
      // 0ad: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b0: athrow
      // 0b1: aload 6
      // 0b3: iload 5
      // 0b5: ifeq 0c4
      // 0b8: ifnull 0fe
      // 0bb: goto 0c2
      // 0be: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c1: athrow
      // 0c2: aload 6
      // 0c4: invokevirtual erg.t25 ()Z
      // 0c7: iload 5
      // 0c9: ifeq 10b
      // 0cc: ifeq 0fe
      // 0cf: goto 0d6
      // 0d2: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d5: athrow
      // 0d6: aload 0
      // 0d7: aload 6
      // 0d9: invokevirtual erg.gn1 ()Lu7m;
      // 0dc: aload 6
      // 0de: invokevirtual erg.dzj ()I
      // 0e1: invokespecial jnq.m08 (Lu7m;I)I
      // 0e4: iload 5
      // 0e6: ifeq 10b
      // 0e9: goto 0f0
      // 0ec: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ef: athrow
      // 0f0: aload 0
      // 0f1: getfield jnq.nb5 I
      // 0f4: if_icmpeq 15d
      // 0f7: goto 0fe
      // 0fa: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fd: athrow
      // 0fe: aload 0
      // 0ff: aload 1
      // 100: iload 2
      // 101: invokespecial jnq.m08 (Lu7m;I)I
      // 104: goto 10b
      // 107: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10a: athrow
      // 10b: istore 9
      // 10d: iload 9
      // 10f: iload 5
      // 111: ifeq 147
      // 114: iflt 13f
      // 117: goto 11e
      // 11a: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11d: athrow
      // 11e: aload 0
      // 11f: getfield jnq.c41 [Lerg;
      // 122: iload 9
      // 124: aaload
      // 125: getfield erg.qd2 I
      // 128: istore 10
      // 12a: aload 0
      // 12b: getfield jnq.c41 [Lerg;
      // 12e: iload 9
      // 130: aload 0
      // 131: getfield jnq.c41 [Lerg;
      // 134: aload 0
      // 135: getfield jnq.nb5 I
      // 138: aaload
      // 139: aastore
      // 13a: iload 5
      // 13c: ifne 149
      // 13f: bipush 1
      // 140: goto 147
      // 143: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 146: athrow
      // 147: istore 10
      // 149: aload 0
      // 14a: getfield jnq.c41 [Lerg;
      // 14d: aload 0
      // 14e: getfield jnq.nb5 I
      // 151: new erg
      // 154: dup
      // 155: aload 1
      // 156: iload 10
      // 158: iload 2
      // 159: invokespecial erg.<init> (Lu7m;II)V
      // 15c: aastore
      // 15d: return
   }

   public void pq9(int var1) {
      int var2 = t9d.c();

      int var10000;
      label60: {
         label59: {
            try {
               var10000 = var1;
               if (var2 != 0) {
                  break label60;
               }

               if (var1 <= 0) {
                  break label59;
               }
            } catch (oov var5) {
               throw a(var5);
            }

            var1 = 1;
         }

         var10000 = var1;
      }

      label51: {
         label50: {
            try {
               if (var2 != 0) {
                  break label50;
               }

               if (var10000 >= 0) {
                  break label51;
               }
            } catch (oov var4) {
               throw a(var4);
            }

            var10000 = -1;
         }

         var1 = var10000;
      }

      this.nb5 -= var1;

      while (this.nb5 < 0) {
         try {
            this.nb5 += 9;
            if (var2 != 0) {
               return;
            }

            if (var2 != 0) {
               break;
            }
         } catch (oov var3) {
            throw a(var3);
         }
      }

      while (this.nb5 >= 9) {
         this.nb5 -= 9;
         if (var2 != 0) {
            return;
         }
      }
   }

   public int _pv(u7m param1, int param2, int param3, bdo param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: bipush 0
      // 001: istore 6
      // 003: invokestatic t9d.c ()I
      // 006: bipush 0
      // 007: istore 7
      // 009: istore 5
      // 00b: iload 7
      // 00d: aload 0
      // 00e: getfield jnq.c41 [Lerg;
      // 011: arraylength
      // 012: if_icmpge 171
      // 015: aload 0
      // 016: getfield jnq.c41 [Lerg;
      // 019: iload 7
      // 01b: aaload
      // 01c: astore 8
      // 01e: iload 5
      // 020: ifne 16c
      // 023: aload 8
      // 025: iload 5
      // 027: ifne 2de
      // 02a: goto 031
      // 02d: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 030: athrow
      // 031: ifnull 169
      // 034: goto 03b
      // 037: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03a: athrow
      // 03b: aload 1
      // 03c: iload 5
      // 03e: ifne 05e
      // 041: goto 048
      // 044: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 047: athrow
      // 048: ifnull 062
      // 04b: goto 052
      // 04e: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 051: athrow
      // 052: aload 8
      // 054: invokevirtual erg.gn1 ()Lu7m;
      // 057: goto 05e
      // 05a: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05d: athrow
      // 05e: aload 1
      // 05f: if_acmpne 169
      // 062: iload 2
      // 063: bipush -1
      // 064: iload 5
      // 066: ifne 087
      // 069: goto 070
      // 06c: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06f: athrow
      // 070: if_icmple 08a
      // 073: goto 07a
      // 076: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 079: athrow
      // 07a: aload 8
      // 07c: invokevirtual erg.j6_ ()I
      // 07f: iload 2
      // 080: goto 087
      // 083: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 086: athrow
      // 087: if_icmpne 169
      // 08a: aload 4
      // 08c: iload 5
      // 08e: ifne 0a4
      // 091: goto 098
      // 094: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 097: athrow
      // 098: ifnull 0bc
      // 09b: goto 0a2
      // 09e: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a1: athrow
      // 0a2: aload 4
      // 0a4: aload 8
      // 0a6: invokevirtual erg.zso ()Lbdo;
      // 0a9: bipush 1
      // 0aa: invokestatic j44.z3c (Lgdw;Lgdw;Z)Z
      // 0ad: iload 5
      // 0af: ifne 0bd
      // 0b2: ifeq 169
      // 0b5: goto 0bc
      // 0b8: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bb: athrow
      // 0bc: iload 3
      // 0bd: iload 5
      // 0bf: ifne 0dc
      // 0c2: ifgt 0d8
      // 0c5: goto 0cc
      // 0c8: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0cb: athrow
      // 0cc: aload 8
      // 0ce: getfield erg.qd2 I
      // 0d1: goto 0e4
      // 0d4: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d7: athrow
      // 0d8: iload 3
      // 0d9: iload 6
      // 0db: isub
      // 0dc: aload 8
      // 0de: getfield erg.qd2 I
      // 0e1: invokestatic java/lang/Math.min (II)I
      // 0e4: istore 9
      // 0e6: iload 6
      // 0e8: iload 9
      // 0ea: iadd
      // 0eb: istore 6
      // 0ed: iload 5
      // 0ef: ifne 16c
      // 0f2: iload 3
      // 0f3: ifeq 169
      // 0f6: goto 0fd
      // 0f9: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fc: athrow
      // 0fd: aload 0
      // 0fe: getfield jnq.c41 [Lerg;
      // 101: iload 7
      // 103: aaload
      // 104: dup
      // 105: getfield erg.qd2 I
      // 108: iload 9
      // 10a: isub
      // 10b: putfield erg.qd2 I
      // 10e: aload 0
      // 10f: getfield jnq.c41 [Lerg;
      // 112: iload 7
      // 114: aaload
      // 115: getfield erg.qd2 I
      // 118: iload 5
      // 11a: ifne 13e
      // 11d: goto 124
      // 120: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 123: athrow
      // 124: ifne 13d
      // 127: goto 12e
      // 12a: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12d: athrow
      // 12e: aload 0
      // 12f: getfield jnq.c41 [Lerg;
      // 132: iload 7
      // 134: aconst_null
      // 135: aastore
      // 136: goto 13d
      // 139: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13c: athrow
      // 13d: iload 3
      // 13e: iload 5
      // 140: ifne 14f
      // 143: ifle 169
      // 146: goto 14d
      // 149: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14c: athrow
      // 14d: iload 6
      // 14f: iload 5
      // 151: ifne 168
      // 154: iload 3
      // 155: if_icmplt 169
      // 158: goto 15f
      // 15b: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15e: athrow
      // 15f: iload 6
      // 161: goto 168
      // 164: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 167: athrow
      // 168: ireturn
      // 169: iinc 7 1
      // 16c: iload 5
      // 16e: ifeq 00b
      // 171: bipush 0
      // 172: istore 7
      // 174: iload 7
      // 176: aload 0
      // 177: getfield jnq._dn [Lerg;
      // 17a: arraylength
      // 17b: if_icmpge 2da
      // 17e: aload 0
      // 17f: getfield jnq._dn [Lerg;
      // 182: iload 7
      // 184: aaload
      // 185: astore 8
      // 187: iload 5
      // 189: ifne 2d5
      // 18c: aload 8
      // 18e: iload 5
      // 190: ifne 2de
      // 193: goto 19a
      // 196: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 199: athrow
      // 19a: ifnull 2d2
      // 19d: goto 1a4
      // 1a0: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a3: athrow
      // 1a4: aload 1
      // 1a5: iload 5
      // 1a7: ifne 1c7
      // 1aa: goto 1b1
      // 1ad: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b0: athrow
      // 1b1: ifnull 1cb
      // 1b4: goto 1bb
      // 1b7: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ba: athrow
      // 1bb: aload 8
      // 1bd: invokevirtual erg.gn1 ()Lu7m;
      // 1c0: goto 1c7
      // 1c3: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c6: athrow
      // 1c7: aload 1
      // 1c8: if_acmpne 2d2
      // 1cb: iload 2
      // 1cc: bipush -1
      // 1cd: iload 5
      // 1cf: ifne 1f0
      // 1d2: goto 1d9
      // 1d5: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d8: athrow
      // 1d9: if_icmple 1f3
      // 1dc: goto 1e3
      // 1df: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e2: athrow
      // 1e3: aload 8
      // 1e5: invokevirtual erg.j6_ ()I
      // 1e8: iload 2
      // 1e9: goto 1f0
      // 1ec: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ef: athrow
      // 1f0: if_icmpne 2d2
      // 1f3: aload 4
      // 1f5: iload 5
      // 1f7: ifne 20d
      // 1fa: goto 201
      // 1fd: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 200: athrow
      // 201: ifnull 225
      // 204: goto 20b
      // 207: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20a: athrow
      // 20b: aload 4
      // 20d: aload 8
      // 20f: invokevirtual erg.zso ()Lbdo;
      // 212: bipush 0
      // 213: invokestatic j44.z3c (Lgdw;Lgdw;Z)Z
      // 216: iload 5
      // 218: ifne 226
      // 21b: ifeq 2d2
      // 21e: goto 225
      // 221: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 224: athrow
      // 225: iload 3
      // 226: iload 5
      // 228: ifne 245
      // 22b: ifgt 241
      // 22e: goto 235
      // 231: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 234: athrow
      // 235: aload 8
      // 237: getfield erg.qd2 I
      // 23a: goto 24d
      // 23d: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 240: athrow
      // 241: iload 3
      // 242: iload 6
      // 244: isub
      // 245: aload 8
      // 247: getfield erg.qd2 I
      // 24a: invokestatic java/lang/Math.min (II)I
      // 24d: istore 9
      // 24f: iload 6
      // 251: iload 9
      // 253: iadd
      // 254: istore 6
      // 256: iload 5
      // 258: ifne 2d5
      // 25b: iload 3
      // 25c: ifeq 2d2
      // 25f: goto 266
      // 262: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 265: athrow
      // 266: aload 0
      // 267: getfield jnq._dn [Lerg;
      // 26a: iload 7
      // 26c: aaload
      // 26d: dup
      // 26e: getfield erg.qd2 I
      // 271: iload 9
      // 273: isub
      // 274: putfield erg.qd2 I
      // 277: aload 0
      // 278: getfield jnq._dn [Lerg;
      // 27b: iload 7
      // 27d: aaload
      // 27e: getfield erg.qd2 I
      // 281: iload 5
      // 283: ifne 2a7
      // 286: goto 28d
      // 289: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28c: athrow
      // 28d: ifne 2a6
      // 290: goto 297
      // 293: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 296: athrow
      // 297: aload 0
      // 298: getfield jnq._dn [Lerg;
      // 29b: iload 7
      // 29d: aconst_null
      // 29e: aastore
      // 29f: goto 2a6
      // 2a2: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a5: athrow
      // 2a6: iload 3
      // 2a7: iload 5
      // 2a9: ifne 2b8
      // 2ac: ifle 2d2
      // 2af: goto 2b6
      // 2b2: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b5: athrow
      // 2b6: iload 6
      // 2b8: iload 5
      // 2ba: ifne 2d1
      // 2bd: iload 3
      // 2be: if_icmplt 2d2
      // 2c1: goto 2c8
      // 2c4: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c7: athrow
      // 2c8: iload 6
      // 2ca: goto 2d1
      // 2cd: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d0: athrow
      // 2d1: ireturn
      // 2d2: iinc 7 1
      // 2d5: iload 5
      // 2d7: ifeq 174
      // 2da: aload 0
      // 2db: getfield jnq.jw8 Lerg;
      // 2de: ifnull 423
      // 2e1: aload 1
      // 2e2: iload 5
      // 2e4: ifne 306
      // 2e7: goto 2ee
      // 2ea: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2ed: athrow
      // 2ee: ifnull 311
      // 2f1: goto 2f8
      // 2f4: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f7: athrow
      // 2f8: aload 0
      // 2f9: getfield jnq.jw8 Lerg;
      // 2fc: invokevirtual erg.gn1 ()Lu7m;
      // 2ff: goto 306
      // 302: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 305: athrow
      // 306: aload 1
      // 307: if_acmpeq 311
      // 30a: iload 6
      // 30c: ireturn
      // 30d: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 310: athrow
      // 311: iload 2
      // 312: bipush -1
      // 313: iload 5
      // 315: ifne 33d
      // 318: if_icmple 343
      // 31b: goto 322
      // 31e: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 321: athrow
      // 322: aload 0
      // 323: getfield jnq.jw8 Lerg;
      // 326: invokevirtual erg.j6_ ()I
      // 329: iload 5
      // 32b: ifne 342
      // 32e: goto 335
      // 331: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 334: athrow
      // 335: iload 2
      // 336: goto 33d
      // 339: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 33c: athrow
      // 33d: if_icmpeq 343
      // 340: iload 6
      // 342: ireturn
      // 343: aload 4
      // 345: iload 5
      // 347: ifne 356
      // 34a: ifnull 377
      // 34d: goto 354
      // 350: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 353: athrow
      // 354: aload 4
      // 356: aload 0
      // 357: getfield jnq.jw8 Lerg;
      // 35a: invokevirtual erg.zso ()Lbdo;
      // 35d: bipush 0
      // 35e: invokestatic j44.z3c (Lgdw;Lgdw;Z)Z
      // 361: iload 5
      // 363: ifne 378
      // 366: ifne 377
      // 369: goto 370
      // 36c: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36f: athrow
      // 370: iload 6
      // 372: ireturn
      // 373: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 376: athrow
      // 377: iload 3
      // 378: iload 5
      // 37a: ifne 399
      // 37d: ifgt 395
      // 380: goto 387
      // 383: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 386: athrow
      // 387: aload 0
      // 388: getfield jnq.jw8 Lerg;
      // 38b: getfield erg.qd2 I
      // 38e: goto 3a3
      // 391: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 394: athrow
      // 395: iload 3
      // 396: iload 6
      // 398: isub
      // 399: aload 0
      // 39a: getfield jnq.jw8 Lerg;
      // 39d: getfield erg.qd2 I
      // 3a0: invokestatic java/lang/Math.min (II)I
      // 3a3: istore 7
      // 3a5: iload 6
      // 3a7: iload 7
      // 3a9: iadd
      // 3aa: istore 6
      // 3ac: iload 3
      // 3ad: iload 5
      // 3af: ifne 425
      // 3b2: ifeq 423
      // 3b5: goto 3bc
      // 3b8: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3bb: athrow
      // 3bc: aload 0
      // 3bd: getfield jnq.jw8 Lerg;
      // 3c0: dup
      // 3c1: getfield erg.qd2 I
      // 3c4: iload 7
      // 3c6: isub
      // 3c7: putfield erg.qd2 I
      // 3ca: aload 0
      // 3cb: getfield jnq.jw8 Lerg;
      // 3ce: getfield erg.qd2 I
      // 3d1: iload 5
      // 3d3: ifne 3f4
      // 3d6: goto 3dd
      // 3d9: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3dc: athrow
      // 3dd: ifne 3f3
      // 3e0: goto 3e7
      // 3e3: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3e6: athrow
      // 3e7: aload 0
      // 3e8: aconst_null
      // 3e9: putfield jnq.jw8 Lerg;
      // 3ec: goto 3f3
      // 3ef: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3f2: athrow
      // 3f3: iload 3
      // 3f4: iload 5
      // 3f6: ifne 425
      // 3f9: ifle 423
      // 3fc: goto 403
      // 3ff: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 402: athrow
      // 403: iload 6
      // 405: iload 5
      // 407: ifne 425
      // 40a: goto 411
      // 40d: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 410: athrow
      // 411: iload 3
      // 412: if_icmplt 423
      // 415: goto 41c
      // 418: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41b: athrow
      // 41c: iload 6
      // 41e: ireturn
      // 41f: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 422: athrow
      // 423: iload 6
      // 425: ireturn
   }

   private int ujp(erg param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: invokevirtual erg.gn1 ()Lu7m;
      // 004: astore 3
      // 005: invokestatic t9d.c ()I
      // 008: aload 1
      // 009: getfield erg.qd2 I
      // 00c: istore 4
      // 00e: istore 2
      // 00f: aload 0
      // 010: aload 1
      // 011: invokespecial jnq.wjh (Lerg;)I
      // 014: istore 5
      // 016: iload 5
      // 018: iload 2
      // 019: ifne 02e
      // 01c: ifge 02c
      // 01f: goto 026
      // 022: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 025: athrow
      // 026: aload 0
      // 027: invokevirtual jnq.d9p ()I
      // 02a: istore 5
      // 02c: iload 5
      // 02e: iload 2
      // 02f: ifne 03e
      // 032: ifge 03f
      // 035: goto 03c
      // 038: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03b: athrow
      // 03c: iload 4
      // 03e: ireturn
      // 03f: aload 0
      // 040: getfield jnq.c41 [Lerg;
      // 043: iload 5
      // 045: aaload
      // 046: iload 2
      // 047: ifne 070
      // 04a: ifnonnull 09c
      // 04d: goto 054
      // 050: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 053: athrow
      // 054: aload 0
      // 055: getfield jnq.c41 [Lerg;
      // 058: iload 5
      // 05a: new erg
      // 05d: dup
      // 05e: aload 3
      // 05f: bipush 0
      // 060: aload 1
      // 061: invokevirtual erg.j6_ ()I
      // 064: invokespecial erg.<init> (Lu7m;II)V
      // 067: aastore
      // 068: aload 1
      // 069: goto 070
      // 06c: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06f: athrow
      // 070: invokevirtual erg.w8b ()Z
      // 073: iload 2
      // 074: ifne 09e
      // 077: ifeq 09c
      // 07a: goto 081
      // 07d: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 080: athrow
      // 081: aload 0
      // 082: getfield jnq.c41 [Lerg;
      // 085: iload 5
      // 087: aaload
      // 088: aload 1
      // 089: invokevirtual erg.zso ()Lbdo;
      // 08c: invokevirtual bdo.h33 ()Lgdw;
      // 08f: checkcast bdo
      // 092: invokevirtual erg.b67 (Lbdo;)V
      // 095: goto 09c
      // 098: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09b: athrow
      // 09c: iload 4
      // 09e: istore 6
      // 0a0: iload 4
      // 0a2: aload 0
      // 0a3: getfield jnq.c41 [Lerg;
      // 0a6: iload 5
      // 0a8: aaload
      // 0a9: invokevirtual erg.h4s ()I
      // 0ac: aload 0
      // 0ad: getfield jnq.c41 [Lerg;
      // 0b0: iload 5
      // 0b2: aaload
      // 0b3: getfield erg.qd2 I
      // 0b6: isub
      // 0b7: iload 2
      // 0b8: ifne 0f8
      // 0bb: if_icmple 0dc
      // 0be: goto 0c5
      // 0c1: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c4: athrow
      // 0c5: aload 0
      // 0c6: getfield jnq.c41 [Lerg;
      // 0c9: iload 5
      // 0cb: aaload
      // 0cc: invokevirtual erg.h4s ()I
      // 0cf: aload 0
      // 0d0: getfield jnq.c41 [Lerg;
      // 0d3: iload 5
      // 0d5: aaload
      // 0d6: getfield erg.qd2 I
      // 0d9: isub
      // 0da: istore 6
      // 0dc: iload 6
      // 0de: iload 2
      // 0df: ifne 10e
      // 0e2: aload 0
      // 0e3: invokevirtual jnq.v6l ()I
      // 0e6: aload 0
      // 0e7: getfield jnq.c41 [Lerg;
      // 0ea: iload 5
      // 0ec: aaload
      // 0ed: getfield erg.qd2 I
      // 0f0: isub
      // 0f1: goto 0f8
      // 0f4: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f7: athrow
      // 0f8: if_icmple 10c
      // 0fb: aload 0
      // 0fc: invokevirtual jnq.v6l ()I
      // 0ff: aload 0
      // 100: getfield jnq.c41 [Lerg;
      // 103: iload 5
      // 105: aaload
      // 106: getfield erg.qd2 I
      // 109: isub
      // 10a: istore 6
      // 10c: iload 6
      // 10e: iload 2
      // 10f: ifne 148
      // 112: ifne 123
      // 115: goto 11c
      // 118: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11b: athrow
      // 11c: iload 4
      // 11e: ireturn
      // 11f: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 122: athrow
      // 123: iload 4
      // 125: iload 6
      // 127: isub
      // 128: istore 4
      // 12a: aload 0
      // 12b: getfield jnq.c41 [Lerg;
      // 12e: iload 5
      // 130: aaload
      // 131: dup
      // 132: getfield erg.qd2 I
      // 135: iload 6
      // 137: iadd
      // 138: putfield erg.qd2 I
      // 13b: aload 0
      // 13c: getfield jnq.c41 [Lerg;
      // 13f: iload 5
      // 141: aaload
      // 142: bipush 5
      // 143: putfield erg.i27 I
      // 146: iload 4
      // 148: ireturn
   }

   public void a9n() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: bipush 0
      // 05: istore 2
      // 06: iload 2
      // 07: aload 0
      // 08: getfield jnq.c41 [Lerg;
      // 0b: arraylength
      // 0c: if_icmpge 65
      // 0f: aload 0
      // 10: getfield jnq.c41 [Lerg;
      // 13: iload 2
      // 14: aaload
      // 15: iload 1
      // 16: ifeq 30
      // 19: ifnull 5e
      // 1c: goto 23
      // 1f: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22: athrow
      // 23: aload 0
      // 24: getfield jnq.c41 [Lerg;
      // 27: iload 2
      // 28: aaload
      // 29: goto 30
      // 2c: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f: athrow
      // 30: aload 0
      // 31: getfield jnq.jsr Lha9;
      // 34: getfield ha9.oay Lt9d;
      // 37: aload 0
      // 38: getfield jnq.jsr Lha9;
      // 3b: iload 2
      // 3c: aload 0
      // 3d: getfield jnq.nb5 I
      // 40: iload 1
      // 41: ifeq 57
      // 44: iload 2
      // 45: if_icmpne 5a
      // 48: goto 4f
      // 4b: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e: athrow
      // 4f: bipush 1
      // 50: goto 57
      // 53: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 56: athrow
      // 57: goto 5b
      // 5a: bipush 0
      // 5b: invokevirtual erg.ld0 (Lt9d;Li2h;IZ)V
      // 5e: iinc 2 1
      // 61: iload 1
      // 62: ifne 06
      // 65: return
   }

   public boolean fw5(u7m param1) {
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
      // 05: aload 1
      // 06: invokespecial jnq.ge3 (Lu7m;)I
      // 09: istore 3
      // 0a: iload 3
      // 0b: iload 2
      // 0c: ifne 2f
      // 0f: ifge 1f
      // 12: goto 19
      // 15: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: bipush 0
      // 1a: ireturn
      // 1b: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: aload 0
      // 20: getfield jnq.c41 [Lerg;
      // 23: iload 3
      // 24: aaload
      // 25: dup
      // 26: getfield erg.qd2 I
      // 29: bipush 1
      // 2a: isub
      // 2b: dup_x1
      // 2c: putfield erg.qd2 I
      // 2f: iload 2
      // 30: ifne 4c
      // 33: ifgt 4b
      // 36: goto 3d
      // 39: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c: athrow
      // 3d: aload 0
      // 3e: getfield jnq.c41 [Lerg;
      // 41: iload 3
      // 42: aconst_null
      // 43: aastore
      // 44: goto 4b
      // 47: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a: athrow
      // 4b: bipush 1
      // 4c: ireturn
   }

   public boolean wa3(u7m var1) {
      int var2 = t9d.b();
      int var3 = this.ge3(var1);

      try {
         if (var2 == 0) {
            return (boolean)var3;
         }

         if (var3 >= 0) {
            return (boolean)1;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      return (boolean)0;
   }

   public boolean phd(erg param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic jnq.a J
      // 003: ldc2_w 65571884377972
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic t9d.b ()I
      // 00b: istore 4
      // 00d: aload 1
      // 00e: iload 4
      // 010: ifeq 01e
      // 013: ifnull 1bc
      // 016: goto 01d
      // 019: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01c: athrow
      // 01d: aload 1
      // 01e: getfield erg.qd2 I
      // 021: iload 4
      // 023: ifeq 1bd
      // 026: ifeq 1bc
      // 029: goto 030
      // 02c: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02f: athrow
      // 030: aload 1
      // 031: iload 4
      // 033: ifeq 04b
      // 036: goto 03d
      // 039: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03c: athrow
      // 03d: invokevirtual erg.gn1 ()Lu7m;
      // 040: ifnull 1bc
      // 043: goto 04a
      // 046: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 049: athrow
      // 04a: aload 1
      // 04b: invokevirtual erg.kka ()Z
      // 04e: iload 4
      // 050: ifeq 0b7
      // 053: ifeq 0b3
      // 056: goto 05d
      // 059: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05c: athrow
      // 05d: aload 0
      // 05e: invokevirtual jnq.d9p ()I
      // 061: istore 5
      // 063: iload 5
      // 065: iload 4
      // 067: ifeq 09b
      // 06a: iflt 091
      // 06d: goto 074
      // 070: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 073: athrow
      // 074: aload 0
      // 075: getfield jnq.c41 [Lerg;
      // 078: iload 5
      // 07a: aload 1
      // 07b: invokestatic erg.tvo (Lerg;)Lerg;
      // 07e: aastore
      // 07f: aload 0
      // 080: getfield jnq.c41 [Lerg;
      // 083: iload 5
      // 085: aaload
      // 086: bipush 5
      // 087: putfield erg.i27 I
      // 08a: aload 1
      // 08b: bipush 0
      // 08c: putfield erg.qd2 I
      // 08f: bipush 1
      // 090: ireturn
      // 091: aload 0
      // 092: getfield jnq.jsr Lha9;
      // 095: getfield ha9.lls Lpj2;
      // 098: getfield pj2.g40 Z
      // 09b: iload 4
      // 09d: ifeq 0b2
      // 0a0: ifeq 0b1
      // 0a3: goto 0aa
      // 0a6: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a9: athrow
      // 0aa: aload 1
      // 0ab: bipush 0
      // 0ac: putfield erg.qd2 I
      // 0af: bipush 1
      // 0b0: ireturn
      // 0b1: bipush 0
      // 0b2: ireturn
      // 0b3: aload 1
      // 0b4: getfield erg.qd2 I
      // 0b7: istore 5
      // 0b9: aload 1
      // 0ba: aload 0
      // 0bb: aload 1
      // 0bc: invokespecial jnq.ujp (Lerg;)I
      // 0bf: putfield erg.qd2 I
      // 0c2: aload 1
      // 0c3: getfield erg.qd2 I
      // 0c6: ifle 0dc
      // 0c9: aload 1
      // 0ca: getfield erg.qd2 I
      // 0cd: iload 5
      // 0cf: if_icmplt 0b3
      // 0d2: goto 0d9
      // 0d5: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d8: athrow
      // 0d9: goto 0dc
      // 0dc: aload 1
      // 0dd: getfield erg.qd2 I
      // 0e0: iload 5
      // 0e2: iload 4
      // 0e4: ifeq 12a
      // 0e7: if_icmpne 118
      // 0ea: goto 0f1
      // 0ed: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f0: athrow
      // 0f1: aload 0
      // 0f2: getfield jnq.jsr Lha9;
      // 0f5: getfield ha9.lls Lpj2;
      // 0f8: getfield pj2.g40 Z
      // 0fb: iload 4
      // 0fd: ifeq 11c
      // 100: goto 107
      // 103: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 106: athrow
      // 107: ifeq 118
      // 10a: goto 111
      // 10d: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 110: athrow
      // 111: aload 1
      // 112: bipush 0
      // 113: putfield erg.qd2 I
      // 116: bipush 1
      // 117: ireturn
      // 118: aload 1
      // 119: getfield erg.qd2 I
      // 11c: iload 4
      // 11e: ifeq 12e
      // 121: iload 5
      // 123: goto 12a
      // 126: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 129: athrow
      // 12a: if_icmpge 131
      // 12d: bipush 1
      // 12e: goto 132
      // 131: bipush 0
      // 132: ireturn
      // 133: astore 5
      // 135: aload 5
      // 137: sipush 22193
      // 13a: ldc2_w 3523192527885754834
      // 13d: lload 2
      // 13e: lxor
      // 13f: invokedynamic b (IJ)Ljava/lang/String; bsm=jnq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 144: nop
      // 145: invokestatic e1i.cor (Ljava/lang/Throwable;Ljava/lang/String;)Le1i;
      // 148: astore 6
      // 14a: aload 6
      // 14c: sipush 6118
      // 14f: ldc2_w 8518927768621752450
      // 152: lload 2
      // 153: lxor
      // 154: invokedynamic b (IJ)Ljava/lang/String; bsm=jnq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 159: nop
      // 15a: invokevirtual e1i.i_r (Ljava/lang/String;)Lwsc;
      // 15d: astore 7
      // 15f: aload 7
      // 161: sipush 20271
      // 164: ldc2_w 4793409642029414474
      // 167: lload 2
      // 168: lxor
      // 169: invokedynamic b (IJ)Ljava/lang/String; bsm=jnq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16e: nop
      // 16f: aload 1
      // 170: invokevirtual erg.gn1 ()Lu7m;
      // 173: invokestatic u7m._lo (Lu7m;)I
      // 176: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 179: invokevirtual wsc._0p (Ljava/lang/String;Ljava/lang/Object;)V
      // 17c: aload 7
      // 17e: sipush 23148
      // 181: ldc2_w 1919360928760163595
      // 184: lload 2
      // 185: lxor
      // 186: invokedynamic b (IJ)Ljava/lang/String; bsm=jnq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18b: nop
      // 18c: aload 1
      // 18d: invokevirtual erg.j6_ ()I
      // 190: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 193: invokevirtual wsc._0p (Ljava/lang/String;Ljava/lang/Object;)V
      // 196: aload 7
      // 198: sipush 4159
      // 19b: ldc2_w 7161345763926812505
      // 19e: lload 2
      // 19f: lxor
      // 1a0: invokedynamic b (IJ)Ljava/lang/String; bsm=jnq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a5: nop
      // 1a6: new jnq$1
      // 1a9: dup
      // 1aa: aload 0
      // 1ab: aload 1
      // 1ac: invokespecial jnq$1.<init> (Ljnq;Lerg;)V
      // 1af: invokevirtual wsc.h1o (Ljava/lang/String;Ljava/util/concurrent/Callable;)V
      // 1b2: new oov
      // 1b5: dup
      // 1b6: aload 6
      // 1b8: invokespecial oov.<init> (Le1i;)V
      // 1bb: athrow
      // 1bc: bipush 0
      // 1bd: ireturn
   }

   @Override
   public erg afc(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: aload 0
      // 05: getfield jnq.c41 [Lerg;
      // 08: astore 4
      // 0a: iload 1
      // 0b: aload 0
      // 0c: getfield jnq.c41 [Lerg;
      // 0f: arraylength
      // 10: iload 3
      // 11: ifne 2a
      // 14: if_icmplt 2c
      // 17: goto 1e
      // 1a: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: aload 0
      // 1f: getfield jnq._dn [Lerg;
      // 22: astore 4
      // 24: iload 1
      // 25: aload 0
      // 26: getfield jnq.c41 [Lerg;
      // 29: arraylength
      // 2a: isub
      // 2b: istore 1
      // 2c: aload 4
      // 2e: iload 1
      // 2f: aaload
      // 30: iload 3
      // 31: ifne 49
      // 34: ifnull 97
      // 37: goto 3e
      // 3a: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3d: athrow
      // 3e: aload 4
      // 40: iload 1
      // 41: aaload
      // 42: goto 49
      // 45: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 48: athrow
      // 49: iload 3
      // 4a: ifne 71
      // 4d: getfield erg.qd2 I
      // 50: iload 2
      // 51: if_icmpgt 69
      // 54: goto 5b
      // 57: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5a: athrow
      // 5b: aload 4
      // 5d: iload 1
      // 5e: aaload
      // 5f: astore 5
      // 61: aload 4
      // 63: iload 1
      // 64: aconst_null
      // 65: aastore
      // 66: aload 5
      // 68: areturn
      // 69: aload 4
      // 6b: iload 1
      // 6c: aaload
      // 6d: iload 2
      // 6e: invokevirtual erg.amj (I)Lerg;
      // 71: astore 5
      // 73: aload 4
      // 75: iload 1
      // 76: aaload
      // 77: iload 3
      // 78: ifne 96
      // 7b: getfield erg.qd2 I
      // 7e: ifne 94
      // 81: goto 88
      // 84: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 87: athrow
      // 88: aload 4
      // 8a: iload 1
      // 8b: aconst_null
      // 8c: aastore
      // 8d: goto 94
      // 90: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 93: athrow
      // 94: aload 5
      // 96: areturn
      // 97: aconst_null
      // 98: areturn
   }

   @Override
   public erg yvk(int param1) {
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
      // 05: getfield jnq.c41 [Lerg;
      // 08: astore 3
      // 09: iload 1
      // 0a: aload 0
      // 0b: getfield jnq.c41 [Lerg;
      // 0e: arraylength
      // 0f: iload 2
      // 10: ifne 28
      // 13: if_icmplt 2a
      // 16: goto 1d
      // 19: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: aload 0
      // 1e: getfield jnq._dn [Lerg;
      // 21: astore 3
      // 22: iload 1
      // 23: aload 0
      // 24: getfield jnq.c41 [Lerg;
      // 27: arraylength
      // 28: isub
      // 29: istore 1
      // 2a: aload 3
      // 2b: iload 1
      // 2c: aaload
      // 2d: iload 2
      // 2e: ifne 45
      // 31: ifnull 4e
      // 34: goto 3b
      // 37: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a: athrow
      // 3b: aload 3
      // 3c: iload 1
      // 3d: aaload
      // 3e: goto 45
      // 41: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 44: athrow
      // 45: astore 4
      // 47: aload 3
      // 48: iload 1
      // 49: aconst_null
      // 4a: aastore
      // 4b: aload 4
      // 4d: areturn
      // 4e: aconst_null
      // 4f: areturn
   }

   @Override
   public void cxl(int var1, erg var2) {
      int var3 = t9d.b();
      erg[] var4 = this.c41;

      label20: {
         try {
            if (var3 == 0) {
               return;
            }

            if (var1 < var4.length) {
               break label20;
            }
         } catch (oov var5) {
            throw a(var5);
         }

         var1 -= var4.length;
         var4 = this._dn;
      }

      var4[var1] = var2;
   }

   public float vqp(e0x var1) {
      float var2 = 1.0F;
      if (this.c41[this.nb5] != null) {
         var2 *= this.c41[this.nb5].q6_(var1);
      }

      return var2;
   }

   public qhg gi5(qhg param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic jnq.a J
      // 03: ldc2_w 109181012095358
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.b ()I
      // 0b: istore 4
      // 0d: bipush 0
      // 0e: istore 5
      // 10: iload 5
      // 12: aload 0
      // 13: getfield jnq.c41 [Lerg;
      // 16: arraylength
      // 17: if_icmpge 6a
      // 1a: aload 0
      // 1b: getfield jnq.c41 [Lerg;
      // 1e: iload 5
      // 20: aaload
      // 21: iload 4
      // 23: ifeq 7e
      // 26: ifnull 62
      // 29: goto 30
      // 2c: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f: athrow
      // 30: new bdo
      // 33: dup
      // 34: invokespecial bdo.<init> ()V
      // 37: astore 6
      // 39: aload 6
      // 3b: sipush 24307
      // 3e: ldc2_w 2208936851528515483
      // 41: lload 2
      // 42: lxor
      // 43: invokedynamic b (IJ)Ljava/lang/String; bsm=jnq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: nop
      // 49: iload 5
      // 4b: i2b
      // 4c: invokevirtual bdo.atr (Ljava/lang/String;B)V
      // 4f: aload 0
      // 50: getfield jnq.c41 [Lerg;
      // 53: iload 5
      // 55: aaload
      // 56: aload 6
      // 58: invokevirtual erg.zy4 (Lbdo;)Lbdo;
      // 5b: pop
      // 5c: aload 1
      // 5d: aload 6
      // 5f: invokevirtual qhg.w2j (Lgdw;)V
      // 62: iinc 5 1
      // 65: iload 4
      // 67: ifne 10
      // 6a: bipush 0
      // 6b: istore 5
      // 6d: iload 5
      // 6f: aload 0
      // 70: getfield jnq._dn [Lerg;
      // 73: arraylength
      // 74: if_icmpge be
      // 77: aload 0
      // 78: getfield jnq._dn [Lerg;
      // 7b: iload 5
      // 7d: aaload
      // 7e: ifnull b6
      // 81: new bdo
      // 84: dup
      // 85: invokespecial bdo.<init> ()V
      // 88: astore 6
      // 8a: aload 6
      // 8c: sipush 24307
      // 8f: ldc2_w 2208936851528515483
      // 92: lload 2
      // 93: lxor
      // 94: invokedynamic b (IJ)Ljava/lang/String; bsm=jnq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 99: nop
      // 9a: iload 5
      // 9c: bipush 100
      // 9e: iadd
      // 9f: i2b
      // a0: invokevirtual bdo.atr (Ljava/lang/String;B)V
      // a3: aload 0
      // a4: getfield jnq._dn [Lerg;
      // a7: iload 5
      // a9: aaload
      // aa: aload 6
      // ac: invokevirtual erg.zy4 (Lbdo;)Lbdo;
      // af: pop
      // b0: aload 1
      // b1: aload 6
      // b3: invokevirtual qhg.w2j (Lgdw;)V
      // b6: iinc 5 1
      // b9: iload 4
      // bb: ifne 6d
      // be: aload 1
      // bf: areturn
   }

   public void ato(qhg param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic jnq.a J
      // 03: ldc2_w 12331529481649
      // 06: lxor
      // 07: lstore 2
      // 08: aload 0
      // 09: bipush 36
      // 0b: anewarray 37
      // 0e: putfield jnq.c41 [Lerg;
      // 11: aload 0
      // 12: bipush 4
      // 13: anewarray 37
      // 16: putfield jnq._dn [Lerg;
      // 19: invokestatic t9d.c ()I
      // 1c: bipush 0
      // 1d: istore 5
      // 1f: istore 4
      // 21: iload 5
      // 23: aload 1
      // 24: invokevirtual qhg.vek ()I
      // 27: if_icmpge ea
      // 2a: aload 1
      // 2b: iload 5
      // 2d: invokevirtual qhg.kd6 (I)Lbdo;
      // 30: astore 6
      // 32: aload 6
      // 34: sipush 2151
      // 37: ldc2_w 400477584483431874
      // 3a: lload 2
      // 3b: lxor
      // 3c: invokedynamic b (IJ)Ljava/lang/String; bsm=jnq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: nop
      // 42: invokevirtual bdo.r_t (Ljava/lang/String;)B
      // 45: sipush 255
      // 48: iand
      // 49: istore 7
      // 4b: aload 6
      // 4d: invokestatic erg.qog (Lbdo;)Lerg;
      // 50: astore 8
      // 52: iload 4
      // 54: ifne e5
      // 57: aload 8
      // 59: ifnull e2
      // 5c: goto 63
      // 5f: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: iload 7
      // 65: iload 4
      // 67: ifne aa
      // 6a: goto 71
      // 6d: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 70: athrow
      // 71: iflt a8
      // 74: goto 7b
      // 77: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7a: athrow
      // 7b: iload 7
      // 7d: aload 0
      // 7e: getfield jnq.c41 [Lerg;
      // 81: arraylength
      // 82: iload 4
      // 84: ifne ac
      // 87: goto 8e
      // 8a: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8d: athrow
      // 8e: if_icmpge a8
      // 91: goto 98
      // 94: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 97: athrow
      // 98: aload 0
      // 99: getfield jnq.c41 [Lerg;
      // 9c: iload 7
      // 9e: aload 8
      // a0: aastore
      // a1: goto a8
      // a4: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a7: athrow
      // a8: iload 7
      // aa: bipush 100
      // ac: iload 4
      // ae: ifne cc
      // b1: if_icmplt e2
      // b4: goto bb
      // b7: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ba: athrow
      // bb: iload 7
      // bd: aload 0
      // be: getfield jnq._dn [Lerg;
      // c1: arraylength
      // c2: bipush 100
      // c4: iadd
      // c5: goto cc
      // c8: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // cb: athrow
      // cc: if_icmpge e2
      // cf: aload 0
      // d0: getfield jnq._dn [Lerg;
      // d3: iload 7
      // d5: bipush 100
      // d7: isub
      // d8: aload 8
      // da: aastore
      // db: goto e2
      // de: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // e1: athrow
      // e2: iinc 5 1
      // e5: iload 4
      // e7: ifeq 21
      // ea: return
   }

   @Override
   public int opt() {
      return this.c41.length + 4;
   }

   @Override
   public erg ibn(int param1) {
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
      // 05: getfield jnq.c41 [Lerg;
      // 08: astore 3
      // 09: iload 1
      // 0a: aload 3
      // 0b: arraylength
      // 0c: iload 2
      // 0d: ifne 24
      // 10: if_icmplt 2b
      // 13: goto 1a
      // 16: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19: athrow
      // 1a: iload 1
      // 1b: aload 3
      // 1c: arraylength
      // 1d: goto 24
      // 20: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23: athrow
      // 24: isub
      // 25: istore 1
      // 26: aload 0
      // 27: getfield jnq._dn [Lerg;
      // 2a: astore 3
      // 2b: aload 3
      // 2c: iload 1
      // 2d: aaload
      // 2e: areturn
   }

   @Override
   public String noc() {
      long var1 = a ^ 18089466113173L;
      return a<"b">(32733, 213003452985295709L ^ var1);
   }

   @Override
   public boolean qrh() {
      return false;
   }

   @Override
   public ekw xyw() {
      try {
         if (this.qrh()) {
            return new tao(this.noc());
         }
      } catch (oov var1) {
         throw a(var1);
      }

      return new hsu(this.noc(), new Object[0]);
   }

   @Override
   public int v6l() {
      return 64;
   }

   public boolean zjf(e0x var1) {
      int var2 = t9d.b();

      label54: {
         try {
            boolean var10000 = var1.p1r().ksy();
            if (var2 == 0) {
               return var10000;
            }

            if (!var10000) {
               break label54;
            }
         } catch (oov var5) {
            throw a(var5);
         }

         return true;
      }

      erg var3 = this.ibn(this.nb5);

      try {
         if (var2 == 0) {
            return var3.tm0(var1);
         }

         if (var3 == null) {
            return false;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      return var3.tm0(var1);
   }

   public erg tjd(int var1) {
      return this._dn[var1];
   }

   public int tth() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 0
      // 01: istore 2
      // 02: invokestatic t9d.b ()I
      // 05: bipush 0
      // 06: istore 3
      // 07: istore 1
      // 08: iload 3
      // 09: aload 0
      // 0a: getfield jnq._dn [Lerg;
      // 0d: arraylength
      // 0e: if_icmpge 6a
      // 11: aload 0
      // 12: getfield jnq._dn [Lerg;
      // 15: iload 3
      // 16: aaload
      // 17: iload 1
      // 18: ifeq 32
      // 1b: ifnull 63
      // 1e: goto 25
      // 21: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: aload 0
      // 26: getfield jnq._dn [Lerg;
      // 29: iload 3
      // 2a: aaload
      // 2b: goto 32
      // 2e: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: invokevirtual erg.gn1 ()Lu7m;
      // 35: instanceof jpt
      // 38: iload 1
      // 39: ifeq 5c
      // 3c: ifeq 63
      // 3f: goto 46
      // 42: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 45: athrow
      // 46: aload 0
      // 47: getfield jnq._dn [Lerg;
      // 4a: iload 3
      // 4b: aaload
      // 4c: invokevirtual erg.gn1 ()Lu7m;
      // 4f: checkcast jpt
      // 52: getfield jpt._wl I
      // 55: goto 5c
      // 58: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5b: athrow
      // 5c: istore 4
      // 5e: iload 2
      // 5f: iload 4
      // 61: iadd
      // 62: istore 2
      // 63: iinc 3 1
      // 66: iload 1
      // 67: ifne 08
      // 6a: iload 2
      // 6b: ireturn
   }

   public void yjt(float param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: fload 1
      // 05: ldc 4.0
      // 07: nop
      // 08: fdiv
      // 09: fstore 1
      // 0a: fload 1
      // 0b: fconst_1
      // 0c: fcmpg
      // 0d: iload 2
      // 0e: ifne 1e
      // 11: ifge 1d
      // 14: goto 1b
      // 17: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a: athrow
      // 1b: fconst_1
      // 1c: fstore 1
      // 1d: bipush 0
      // 1e: istore 3
      // 1f: iload 3
      // 20: aload 0
      // 21: getfield jnq._dn [Lerg;
      // 24: arraylength
      // 25: if_icmpge 9f
      // 28: aload 0
      // 29: getfield jnq._dn [Lerg;
      // 2c: iload 3
      // 2d: aaload
      // 2e: iload 2
      // 2f: ifne 49
      // 32: ifnull 98
      // 35: goto 3c
      // 38: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b: athrow
      // 3c: aload 0
      // 3d: getfield jnq._dn [Lerg;
      // 40: iload 3
      // 41: aaload
      // 42: goto 49
      // 45: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 48: athrow
      // 49: invokevirtual erg.gn1 ()Lu7m;
      // 4c: instanceof jpt
      // 4f: iload 2
      // 50: ifne 87
      // 53: ifeq 98
      // 56: goto 5d
      // 59: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5c: athrow
      // 5d: aload 0
      // 5e: getfield jnq._dn [Lerg;
      // 61: iload 3
      // 62: aaload
      // 63: fload 1
      // 64: f2i
      // 65: aload 0
      // 66: getfield jnq.jsr Lha9;
      // 69: invokevirtual erg.ybw (ILg_3;)V
      // 6c: iload 2
      // 6d: ifne 9b
      // 70: goto 77
      // 73: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 76: athrow
      // 77: aload 0
      // 78: getfield jnq._dn [Lerg;
      // 7b: iload 3
      // 7c: aaload
      // 7d: getfield erg.qd2 I
      // 80: goto 87
      // 83: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 86: athrow
      // 87: ifne 98
      // 8a: aload 0
      // 8b: getfield jnq._dn [Lerg;
      // 8e: iload 3
      // 8f: aconst_null
      // 90: aastore
      // 91: goto 98
      // 94: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 97: athrow
      // 98: iinc 3 1
      // 9b: iload 2
      // 9c: ifeq 1f
      // 9f: return
   }

   public void _v_() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: bipush 0
      // 05: istore 2
      // 06: iload 2
      // 07: aload 0
      // 08: getfield jnq.c41 [Lerg;
      // 0b: arraylength
      // 0c: if_icmpge 53
      // 0f: aload 0
      // 10: getfield jnq.c41 [Lerg;
      // 13: iload 2
      // 14: iload 1
      // 15: ifeq 4a
      // 18: aaload
      // 19: iload 1
      // 1a: ifeq 6f
      // 1d: goto 24
      // 20: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23: athrow
      // 24: ifnull 4c
      // 27: goto 2e
      // 2a: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d: athrow
      // 2e: aload 0
      // 2f: getfield jnq.jsr Lha9;
      // 32: aload 0
      // 33: getfield jnq.c41 [Lerg;
      // 36: iload 2
      // 37: aaload
      // 38: bipush 1
      // 39: bipush 0
      // 3a: invokevirtual ha9.gj8 (Lerg;ZZ)Lnvf;
      // 3d: pop
      // 3e: aload 0
      // 3f: getfield jnq.c41 [Lerg;
      // 42: iload 2
      // 43: goto 4a
      // 46: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 49: athrow
      // 4a: aconst_null
      // 4b: aastore
      // 4c: iinc 2 1
      // 4f: iload 1
      // 50: ifne 06
      // 53: bipush 0
      // 54: istore 2
      // 55: iload 2
      // 56: aload 0
      // 57: getfield jnq._dn [Lerg;
      // 5a: arraylength
      // 5b: if_icmpge 97
      // 5e: aload 0
      // 5f: getfield jnq._dn [Lerg;
      // 62: iload 2
      // 63: iload 1
      // 64: ifeq 8e
      // 67: aaload
      // 68: goto 6f
      // 6b: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6e: athrow
      // 6f: ifnull 90
      // 72: aload 0
      // 73: getfield jnq.jsr Lha9;
      // 76: aload 0
      // 77: getfield jnq._dn [Lerg;
      // 7a: iload 2
      // 7b: aaload
      // 7c: bipush 1
      // 7d: bipush 0
      // 7e: invokevirtual ha9.gj8 (Lerg;ZZ)Lnvf;
      // 81: pop
      // 82: aload 0
      // 83: getfield jnq._dn [Lerg;
      // 86: iload 2
      // 87: goto 8e
      // 8a: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8d: athrow
      // 8e: aconst_null
      // 8f: aastore
      // 90: iinc 2 1
      // 93: iload 1
      // 94: ifne 55
      // 97: return
   }

   @Override
   public void r5t() {
      this.el2 = true;
   }

   public void uej(erg var1) {
      this.jw8 = var1;
   }

   public erg zet() {
      return this.jw8;
   }

   @Override
   public boolean dnv(ha9 param1) {
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
      // 05: getfield jnq.jsr Lha9;
      // 08: getfield ha9.ma9 Z
      // 0b: iload 2
      // 0c: ifeq 2d
      // 0f: ifeq 21
      // 12: goto 19
      // 15: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: bipush 0
      // 1a: goto 40
      // 1d: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: aload 1
      // 22: aload 0
      // 23: getfield jnq.jsr Lha9;
      // 26: invokevirtual ha9.wxg (Li2h;)D
      // 29: ldc2_w 64.0
      // 2c: dcmpg
      // 2d: iload 2
      // 2e: ifeq 3c
      // 31: ifgt 3f
      // 34: goto 3b
      // 37: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a: athrow
      // 3b: bipush 1
      // 3c: goto 40
      // 3f: bipush 0
      // 40: ireturn
   }

   public boolean kzl(erg param1) {
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
      // 07: aload 0
      // 08: getfield jnq._dn [Lerg;
      // 0b: arraylength
      // 0c: if_icmpge 56
      // 0f: aload 0
      // 10: getfield jnq._dn [Lerg;
      // 13: iload 3
      // 14: aaload
      // 15: iload 2
      // 16: ifne 67
      // 19: iload 2
      // 1a: ifne 3b
      // 1d: goto 24
      // 20: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23: athrow
      // 24: ifnull 4f
      // 27: goto 2e
      // 2a: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d: athrow
      // 2e: aload 0
      // 2f: getfield jnq._dn [Lerg;
      // 32: iload 3
      // 33: aaload
      // 34: goto 3b
      // 37: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a: athrow
      // 3b: aload 1
      // 3c: invokevirtual erg.efv (Lerg;)Z
      // 3f: iload 2
      // 40: ifne 4e
      // 43: ifeq 4f
      // 46: goto 4d
      // 49: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4c: athrow
      // 4d: bipush 1
      // 4e: ireturn
      // 4f: iinc 3 1
      // 52: iload 2
      // 53: ifeq 06
      // 56: bipush 0
      // 57: istore 3
      // 58: iload 3
      // 59: aload 0
      // 5a: getfield jnq.c41 [Lerg;
      // 5d: arraylength
      // 5e: if_icmpge 9d
      // 61: aload 0
      // 62: getfield jnq.c41 [Lerg;
      // 65: iload 3
      // 66: aaload
      // 67: iload 2
      // 68: ifne 82
      // 6b: ifnull 96
      // 6e: goto 75
      // 71: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 74: athrow
      // 75: aload 0
      // 76: getfield jnq.c41 [Lerg;
      // 79: iload 3
      // 7a: aaload
      // 7b: goto 82
      // 7e: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 81: athrow
      // 82: aload 1
      // 83: invokevirtual erg.efv (Lerg;)Z
      // 86: iload 2
      // 87: ifne 95
      // 8a: ifeq 96
      // 8d: goto 94
      // 90: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 93: athrow
      // 94: bipush 1
      // 95: ireturn
      // 96: iinc 3 1
      // 99: iload 2
      // 9a: ifeq 58
      // 9d: bipush 0
      // 9e: ireturn
   }

   @Override
   public void dk0(ha9 var1) {
   }

   @Override
   public void vhz(ha9 var1) {
   }

   @Override
   public boolean er2(int var1, erg var2) {
      return true;
   }

   public void dna(jnq param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: bipush 0
      // 05: istore 3
      // 06: iload 3
      // 07: aload 0
      // 08: getfield jnq.c41 [Lerg;
      // 0b: arraylength
      // 0c: if_icmpge 30
      // 0f: aload 0
      // 10: getfield jnq.c41 [Lerg;
      // 13: iload 3
      // 14: aload 1
      // 15: getfield jnq.c41 [Lerg;
      // 18: iload 3
      // 19: aaload
      // 1a: invokestatic erg.tvo (Lerg;)Lerg;
      // 1d: aastore
      // 1e: iinc 3 1
      // 21: iload 2
      // 22: ifeq 32
      // 25: iload 2
      // 26: ifne 06
      // 29: goto 30
      // 2c: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f: athrow
      // 30: bipush 0
      // 31: istore 3
      // 32: iload 3
      // 33: aload 0
      // 34: getfield jnq._dn [Lerg;
      // 37: arraylength
      // 38: if_icmpge 63
      // 3b: aload 0
      // 3c: getfield jnq._dn [Lerg;
      // 3f: iload 3
      // 40: aload 1
      // 41: getfield jnq._dn [Lerg;
      // 44: iload 3
      // 45: aaload
      // 46: invokestatic erg.tvo (Lerg;)Lerg;
      // 49: aastore
      // 4a: iinc 3 1
      // 4d: iload 2
      // 4e: ifeq 6b
      // 51: goto 58
      // 54: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 57: athrow
      // 58: iload 2
      // 59: ifne 32
      // 5c: goto 63
      // 5f: invokestatic jnq.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: aload 1
      // 65: getfield jnq.nb5 I
      // 68: putfield jnq.nb5 I
      // 6b: return
   }

   @Override
   public int czu(int var1) {
      return 0;
   }

   @Override
   public void r8i(int var1, int var2) {
   }

   @Override
   public int xa3() {
      return 0;
   }

   @Override
   public void nec() {
      int var1 = t9d.c();
      int var2 = 0;

      while (true) {
         if (var2 < this.c41.length) {
            try {
               this.c41[var2] = null;
               var2++;
               if (var1 != 0) {
                  break;
               }

               if (var1 == 0) {
                  continue;
               }
            } catch (oov var4) {
               throw a(var4);
            }
         }

         var2 = 0;
         break;
      }

      try {
         while (var2 < this._dn.length) {
            this._dn[var2] = null;
            var2++;
            if (var1 != 0) {
               break;
            }
         }
      } catch (oov var3) {
         throw a(var3);
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6168521161740983849L, 54504755420458605L, MethodHandles.lookup().lookupClass()).a(84935954878063L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 5757235886106L;
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
      String var6 = "A-Ö&6\u000bY³?r¢t\u009f\u0085·\u0082\u0002±h\u008e´ïí\u0085iHÈï\u009a\u007f\u008a2°\u008fð[f?Ù\b\u00102cC¾uüº\bg\u008cn\u0001\u0005iµÓ\u0018ô\u0013U,Æ{{ñl\u0005#Æj\u0087»_q#a\u009c(qä¦\u0018j7x¤\u00025±²M \u0090p\u0085V\u0092h^>XØÒ@*Á\u0010[\u0085xC\tc\u001coR\u0010 \u001a\u008dö(\u009f(}4íà\u0082Ï6\u009f\u0088âùyf\u000eñ@ËZ¡æú¬\u0092*ùê\"±TAC\u008eÿ÷({c©ôí";
      int var8 = "A-Ö&6\u000bY³?r¢t\u009f\u0085·\u0082\u0002±h\u008e´ïí\u0085iHÈï\u009a\u007f\u008a2°\u008fð[f?Ù\b\u00102cC¾uüº\bg\u008cn\u0001\u0005iµÓ\u0018ô\u0013U,Æ{{ñl\u0005#Æj\u0087»_q#a\u009c(qä¦\u0018j7x¤\u00025±²M \u0090p\u0085V\u0092h^>XØÒ@*Á\u0010[\u0085xC\tc\u001coR\u0010 \u001a\u008dö(\u009f(}4íà\u0082Ï6\u009f\u0088âùyf\u000eñ@ËZ¡æú¬\u0092*ùê\"±TAC\u008eÿ÷({c©ôí"
         .length();
      char var5 = '(';
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

                  var6 = "8\u0097\u0015OØÃFÍ\u0017ñHñÖ2\u009dí0N\u00017¦(4W\u0000q9},õ¬½\u0080\u0005Ì\u001fM³ËYT;ý \r\u0013>eZ\u009dá\u0001\b\f<0h\"D¿\u0096çï®º";
                  var8 = "8\u0097\u0015OØÃFÍ\u0017ñHñÖ2\u009dí0N\u00017¦(4W\u0000q9},õ¬½\u0080\u0005Ì\u001fM³ËYT;ý \r\u0013>eZ\u009dá\u0001\b\f<0h\"D¿\u0096çï®º"
                     .length();
                  var5 = 16;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static Throwable a(Throwable var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5110;
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
            throw new RuntimeException("jnq", var10);
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
         throw new RuntimeException("jnq" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
