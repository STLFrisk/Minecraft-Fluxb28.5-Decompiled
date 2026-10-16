import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.handler.codec.DecoderException;
import io.netty.util.ByteProcessor;
import io.netty.util.ReferenceCounted;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class nfj extends ByteBuf {
   private final ByteBuf cfv;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public nfj(ByteBuf var1) {
      this.cfv = var1;
   }

   public static int wfy(int param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: bipush 1
      // 05: istore 2
      // 06: iload 2
      // 07: bipush 5
      // 08: if_icmpge 35
      // 0b: iload 0
      // 0c: bipush -1
      // 0d: iload 2
      // 0e: bipush 7
      // 10: imul
      // 11: ishl
      // 12: iand
      // 13: iload 1
      // 14: ifne 36
      // 17: iload 1
      // 18: ifne 2d
      // 1b: goto 22
      // 1e: invokestatic nfj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21: athrow
      // 22: ifne 2e
      // 25: goto 2c
      // 28: invokestatic nfj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b: athrow
      // 2c: iload 2
      // 2d: ireturn
      // 2e: iinc 2 1
      // 31: iload 1
      // 32: ifeq 06
      // 35: bipush 5
      // 36: ireturn
   }

   public nfj a4q(byte[] var1) {
      this.tao(var1.length);
      this.writeBytes(var1);
      return this;
   }

   public byte[] z7_() {
      return this.xsw(this.readableBytes());
   }

   public byte[] xsw(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic nfj.a J
      // 03: ldc2_w 62173934346639
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.b ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: invokevirtual nfj.gux ()I
      // 11: istore 5
      // 13: iload 5
      // 15: iload 4
      // 17: ifeq 68
      // 1a: iload 1
      // 1b: if_icmple 66
      // 1e: goto 25
      // 21: invokestatic nfj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: new io/netty/handler/codec/DecoderException
      // 28: dup
      // 29: new java/lang/StringBuilder
      // 2c: dup
      // 2d: invokespecial java/lang/StringBuilder.<init> ()V
      // 30: sipush 23689
      // 33: ldc2_w 4237383104957598559
      // 36: lload 2
      // 37: lxor
      // 38: invokedynamic i (IJ)Ljava/lang/String; bsm=nfj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d: nop
      // 3e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 41: iload 5
      // 43: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 46: sipush 13728
      // 49: ldc2_w 1547955791030657651
      // 4c: lload 2
      // 4d: lxor
      // 4e: invokedynamic i (IJ)Ljava/lang/String; bsm=nfj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: nop
      // 54: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 57: iload 1
      // 58: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 5b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 5e: invokespecial io/netty/handler/codec/DecoderException.<init> (Ljava/lang/String;)V
      // 61: athrow
      // 62: invokestatic nfj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 65: athrow
      // 66: iload 5
      // 68: newarray 8
      // 6a: astore 6
      // 6c: aload 0
      // 6d: aload 6
      // 6f: invokevirtual nfj.readBytes ([B)Lio/netty/buffer/ByteBuf;
      // 72: pop
      // 73: aload 6
      // 75: areturn
   }

   public nfj pah(int[] var1) {
      this.tao(var1.length);
      int[] var3 = var1;
      int var10000 = t9d.c();
      int var4 = var1.length;
      int var5 = 0;
      int var2 = var10000;

      while (true) {
         if (var5 < var4) {
            int var6 = var3[var5];

            try {
               var8 = this.tao(var6);
               if (var2 != 0) {
                  break;
               }

               var5++;
               if (var2 == 0) {
                  continue;
               }
            } catch (DecoderException var7) {
               throw a(var7);
            }
         }

         var8 = this;
         break;
      }

      return var8;
   }

   public int[] sd2() {
      return this.b6g(this.readableBytes());
   }

   public int[] b6g(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic nfj.a J
      // 03: ldc2_w 64489760494428
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.b ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: invokevirtual nfj.gux ()I
      // 11: istore 5
      // 13: iload 5
      // 15: iload 4
      // 17: ifeq 68
      // 1a: iload 1
      // 1b: if_icmple 66
      // 1e: goto 25
      // 21: invokestatic nfj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: new io/netty/handler/codec/DecoderException
      // 28: dup
      // 29: new java/lang/StringBuilder
      // 2c: dup
      // 2d: invokespecial java/lang/StringBuilder.<init> ()V
      // 30: sipush 25623
      // 33: ldc2_w 2331998404902945049
      // 36: lload 2
      // 37: lxor
      // 38: invokedynamic i (IJ)Ljava/lang/String; bsm=nfj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d: nop
      // 3e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 41: iload 5
      // 43: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 46: sipush 24859
      // 49: ldc2_w 6979121019999192080
      // 4c: lload 2
      // 4d: lxor
      // 4e: invokedynamic i (IJ)Ljava/lang/String; bsm=nfj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: nop
      // 54: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 57: iload 1
      // 58: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 5b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 5e: invokespecial io/netty/handler/codec/DecoderException.<init> (Ljava/lang/String;)V
      // 61: athrow
      // 62: invokestatic nfj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 65: athrow
      // 66: iload 5
      // 68: newarray 10
      // 6a: astore 6
      // 6c: bipush 0
      // 6d: istore 7
      // 6f: iload 7
      // 71: aload 6
      // 73: arraylength
      // 74: if_icmpge 94
      // 77: aload 6
      // 79: iload 4
      // 7b: ifeq 96
      // 7e: iload 7
      // 80: aload 0
      // 81: invokevirtual nfj.gux ()I
      // 84: iastore
      // 85: iinc 7 1
      // 88: iload 4
      // 8a: ifne 6f
      // 8d: goto 94
      // 90: invokestatic nfj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 93: athrow
      // 94: aload 6
      // 96: areturn
   }

   public nfj spp(long[] var1) {
      this.tao(var1.length);
      int var10000 = t9d.c();
      long[] var3 = var1;
      int var2 = var10000;
      int var4 = var1.length;
      int var5 = 0;

      while (true) {
         if (var5 < var4) {
            long var6 = var3[var5];

            try {
               var9 = this;
               if (var2 != 0) {
                  break;
               }

               this.writeLong(var6);
               var5++;
               if (var2 == 0) {
                  continue;
               }
            } catch (DecoderException var8) {
               throw a(var8);
            }
         }

         var9 = this;
         break;
      }

      return var9;
   }

   public long[] _va(long[] var1) {
      return this.eim(var1, this.readableBytes() / 8);
   }

   public long[] eim(long[] param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic nfj.a J
      // 03: ldc2_w 97089055160052
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic t9d.c ()I
      // 0b: istore 5
      // 0d: aload 0
      // 0e: invokevirtual nfj.gux ()I
      // 11: istore 6
      // 13: aload 1
      // 14: iload 5
      // 16: ifne 24
      // 19: ifnull 36
      // 1c: goto 23
      // 1f: invokestatic nfj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22: athrow
      // 23: aload 1
      // 24: arraylength
      // 25: iload 5
      // 27: ifne 96
      // 2a: iload 6
      // 2c: if_icmpeq 95
      // 2f: goto 36
      // 32: invokestatic nfj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35: athrow
      // 36: iload 6
      // 38: iload 5
      // 3a: ifne 92
      // 3d: goto 44
      // 40: invokestatic nfj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 43: athrow
      // 44: iload 2
      // 45: if_icmple 90
      // 48: goto 4f
      // 4b: invokestatic nfj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4e: athrow
      // 4f: new io/netty/handler/codec/DecoderException
      // 52: dup
      // 53: new java/lang/StringBuilder
      // 56: dup
      // 57: invokespecial java/lang/StringBuilder.<init> ()V
      // 5a: sipush 2113
      // 5d: ldc2_w 3133756199887866093
      // 60: lload 3
      // 61: lxor
      // 62: invokedynamic i (IJ)Ljava/lang/String; bsm=nfj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: nop
      // 68: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6b: iload 6
      // 6d: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 70: sipush 13728
      // 73: ldc2_w 1547849939164706056
      // 76: lload 3
      // 77: lxor
      // 78: invokedynamic i (IJ)Ljava/lang/String; bsm=nfj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7d: nop
      // 7e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 81: iload 2
      // 82: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 85: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 88: invokespecial io/netty/handler/codec/DecoderException.<init> (Ljava/lang/String;)V
      // 8b: athrow
      // 8c: invokestatic nfj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8f: athrow
      // 90: iload 6
      // 92: newarray 11
      // 94: astore 1
      // 95: bipush 0
      // 96: istore 7
      // 98: iload 7
      // 9a: aload 1
      // 9b: arraylength
      // 9c: if_icmpge bb
      // 9f: aload 1
      // a0: iload 5
      // a2: ifne bc
      // a5: iload 7
      // a7: aload 0
      // a8: invokevirtual nfj.readLong ()J
      // ab: lastore
      // ac: iinc 7 1
      // af: iload 5
      // b1: ifeq 98
      // b4: goto bb
      // b7: invokestatic nfj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ba: athrow
      // bb: aload 1
      // bc: areturn
   }

   public mew jh0() {
      return mew.s4d(this.readLong());
   }

   public nfj l3a(mew var1) {
      this.writeLong(var1._d2());
      return this;
   }

   public ekw wdz() {
      return ekw$szt.wnw(this.oa5(32767));
   }

   public void v7d(ekw var1) {
      this.p3z(ekw$szt.odg(var1));
   }

   public Enum e0h(Class var1) {
      return ((Enum[])var1.getEnumConstants())[this.gux()];
   }

   public nfj p9c(Enum var1) {
      return this.tao(var1.ordinal());
   }

   public int gux() {
      long var1 = a ^ 84038756332873L;
      int var4 = 0;
      int var10000 = t9d.c();
      int var5 = 0;
      int var3 = var10000;

      do {
         byte var6 = this.readByte();
         var4 |= (var6 & 127) << var5++ * 7;
         if (var5 > 5) {
            throw new RuntimeException(a<"i">(8866, 1884829095498097083L ^ var1));
         }

         try {
            if ((var6 & 128) != 128) {
               break;
            }
         } catch (DecoderException var7) {
            throw a(var7);
         }
      } while (var3 == 0);

      return var4;
   }

   public long yhj() {
      long var1 = a ^ 49980360650807L;
      long var4 = 0L;
      int var10000 = t9d.b();
      int var6 = 0;
      int var3 = var10000;

      do {
         byte var7 = this.readByte();
         var4 |= (long)(var7 & 127) << var6++ * 7;
         if (var6 > 10) {
            throw new RuntimeException(a<"i">(24164, 4081070614135429133L ^ var1));
         }

         try {
            if ((var7 & 128) != 128) {
               break;
            }
         } catch (DecoderException var8) {
            throw a(var8);
         }
      } while (var3 != 0);

      return var4;
   }

   public nfj n5q(UUID var1) {
      this.writeLong(var1.getMostSignificantBits());
      this.writeLong(var1.getLeastSignificantBits());
      return this;
   }

   public UUID ac2() {
      return new UUID(this.readLong(), this.readLong());
   }

   public nfj tao(int var1) {
      int var2 = t9d.c();

      while (true) {
         if ((var1 & -128) != 0) {
            this.writeByte(var1 & 127 | 128);
            var1 >>>= 7;

            try {
               if (var2 != 0) {
                  break;
               }

               if (var2 == 0) {
                  continue;
               }
            } catch (DecoderException var3) {
               throw a(var3);
            }
         }

         this.writeByte(var1);
         break;
      }

      return this;
   }

   public nfj snn(long var1) {
      int var3 = t9d.c();

      while (true) {
         if ((var1 & -128L) != 0L) {
            this.writeByte((int)(var1 & 127L) | 128);
            var1 >>>= 7;

            try {
               if (var3 != 0) {
                  break;
               }

               if (var3 == 0) {
                  continue;
               }
            } catch (DecoderException var4) {
               throw a(var4);
            }
         }

         this.writeByte((int)var1);
         break;
      }

      return this;
   }

   public nfj __w(bdo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifne 25
      // 09: ifnonnull 24
      // 0c: goto 13
      // 0f: invokestatic nfj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: aload 0
      // 14: bipush 0
      // 15: invokevirtual nfj.writeByte (I)Lio/netty/buffer/ByteBuf;
      // 18: pop
      // 19: iload 2
      // 1a: ifeq 3d
      // 1d: goto 24
      // 20: invokestatic nfj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: aload 1
      // 25: new io/netty/buffer/ByteBufOutputStream
      // 28: dup
      // 29: aload 0
      // 2a: invokespecial io/netty/buffer/ByteBufOutputStream.<init> (Lio/netty/buffer/ByteBuf;)V
      // 2d: invokestatic g62.ehq (Lbdo;Ljava/io/DataOutput;)V
      // 30: goto 3d
      // 33: astore 3
      // 34: new io/netty/handler/codec/EncoderException
      // 37: dup
      // 38: aload 3
      // 39: invokespecial io/netty/handler/codec/EncoderException.<init> (Ljava/lang/Throwable;)V
      // 3c: athrow
      // 3d: aload 0
      // 3e: areturn
   }

   public bdo e97() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: invokevirtual nfj.readerIndex ()I
      // 08: istore 2
      // 09: aload 0
      // 0a: invokevirtual nfj.readByte ()B
      // 0d: istore 3
      // 0e: iload 1
      // 0f: ifeq 29
      // 12: iload 3
      // 13: ifne 23
      // 16: goto 1d
      // 19: invokestatic nfj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c: athrow
      // 1d: aconst_null
      // 1e: areturn
      // 1f: invokestatic nfj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22: athrow
      // 23: aload 0
      // 24: iload 2
      // 25: invokevirtual nfj.readerIndex (I)Lio/netty/buffer/ByteBuf;
      // 28: pop
      // 29: new io/netty/buffer/ByteBufInputStream
      // 2c: dup
      // 2d: aload 0
      // 2e: invokespecial io/netty/buffer/ByteBufInputStream.<init> (Lio/netty/buffer/ByteBuf;)V
      // 31: new btc
      // 34: dup
      // 35: ldc2_w 2097152
      // 38: invokespecial btc.<init> (J)V
      // 3b: invokestatic g62.z3b (Ljava/io/DataInput;Lbtc;)Lbdo;
      // 3e: areturn
      // 3f: astore 4
      // 41: new io/netty/handler/codec/EncoderException
      // 44: dup
      // 45: aload 4
      // 47: invokespecial io/netty/handler/codec/EncoderException.<init> (Ljava/lang/Throwable;)V
      // 4a: athrow
   }

   public void a6a(erg param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: ifnonnull 19
      // 08: aload 0
      // 09: bipush -1
      // 0a: invokevirtual nfj.writeShort (I)Lio/netty/buffer/ByteBuf;
      // 0d: pop
      // 0e: iload 2
      // 0f: ifne 7c
      // 12: goto 19
      // 15: invokestatic nfj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18: athrow
      // 19: aload 0
      // 1a: aload 1
      // 1b: invokevirtual erg.gn1 ()Lu7m;
      // 1e: invokestatic u7m._lo (Lu7m;)I
      // 21: invokevirtual nfj.writeShort (I)Lio/netty/buffer/ByteBuf;
      // 24: pop
      // 25: aload 0
      // 26: aload 1
      // 27: getfield erg.qd2 I
      // 2a: invokevirtual nfj.writeByte (I)Lio/netty/buffer/ByteBuf;
      // 2d: pop
      // 2e: aload 0
      // 2f: aload 1
      // 30: invokevirtual erg.j6_ ()I
      // 33: invokevirtual nfj.writeShort (I)Lio/netty/buffer/ByteBuf;
      // 36: pop
      // 37: aconst_null
      // 38: astore 3
      // 39: aload 1
      // 3a: iload 2
      // 3b: ifeq 72
      // 3e: invokevirtual erg.gn1 ()Lu7m;
      // 41: invokevirtual u7m.k40 ()Z
      // 44: ifne 6a
      // 47: goto 4e
      // 4a: invokestatic nfj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d: athrow
      // 4e: aload 1
      // 4f: iload 2
      // 50: ifeq 72
      // 53: goto 5a
      // 56: invokestatic nfj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 59: athrow
      // 5a: invokevirtual erg.gn1 ()Lu7m;
      // 5d: invokevirtual u7m.k51 ()Z
      // 60: ifeq 76
      // 63: goto 6a
      // 66: invokestatic nfj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 69: athrow
      // 6a: aload 1
      // 6b: goto 72
      // 6e: invokestatic nfj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 71: athrow
      // 72: invokevirtual erg.zso ()Lbdo;
      // 75: astore 3
      // 76: aload 0
      // 77: aload 3
      // 78: invokevirtual nfj.__w (Lbdo;)Lnfj;
      // 7b: pop
      // 7c: return
   }

   public erg x4d() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aconst_null
      // 01: astore 2
      // 02: invokestatic t9d.b ()I
      // 05: aload 0
      // 06: invokevirtual nfj.readShort ()S
      // 09: istore 3
      // 0a: istore 1
      // 0b: iload 3
      // 0c: iload 1
      // 0d: ifeq 25
      // 10: iflt 45
      // 13: goto 1a
      // 16: invokestatic nfj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19: athrow
      // 1a: aload 0
      // 1b: invokevirtual nfj.readByte ()B
      // 1e: goto 25
      // 21: invokestatic nfj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: istore 4
      // 27: aload 0
      // 28: invokevirtual nfj.readShort ()S
      // 2b: istore 5
      // 2d: new erg
      // 30: dup
      // 31: iload 3
      // 32: invokestatic u7m.ltr (I)Lu7m;
      // 35: iload 4
      // 37: iload 5
      // 39: invokespecial erg.<init> (Lu7m;II)V
      // 3c: astore 2
      // 3d: aload 2
      // 3e: aload 0
      // 3f: invokevirtual nfj.e97 ()Lbdo;
      // 42: invokevirtual erg.b67 (Lbdo;)V
      // 45: aload 2
      // 46: areturn
   }

   public String oa5(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic nfj.a J
      // 003: ldc2_w 129045405307022
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic t9d.b ()I
      // 00b: istore 4
      // 00d: aload 0
      // 00e: invokevirtual nfj.gux ()I
      // 011: istore 5
      // 013: iload 5
      // 015: iload 4
      // 017: ifeq 072
      // 01a: iload 1
      // 01b: bipush 4
      // 01c: imul
      // 01d: if_icmple 070
      // 020: goto 027
      // 023: invokestatic nfj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 026: athrow
      // 027: new io/netty/handler/codec/DecoderException
      // 02a: dup
      // 02b: new java/lang/StringBuilder
      // 02e: dup
      // 02f: invokespecial java/lang/StringBuilder.<init> ()V
      // 032: sipush 5239
      // 035: ldc2_w 729154673140036268
      // 038: lload 2
      // 039: lxor
      // 03a: invokedynamic i (IJ)Ljava/lang/String; bsm=nfj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03f: nop
      // 040: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 043: iload 5
      // 045: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 048: sipush 16987
      // 04b: ldc2_w 6202525311411627139
      // 04e: lload 2
      // 04f: lxor
      // 050: invokedynamic i (IJ)Ljava/lang/String; bsm=nfj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 055: nop
      // 056: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 059: iload 1
      // 05a: bipush 4
      // 05b: imul
      // 05c: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 05f: ldc ")"
      // 061: nop
      // 062: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 065: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 068: invokespecial io/netty/handler/codec/DecoderException.<init> (Ljava/lang/String;)V
      // 06b: athrow
      // 06c: invokestatic nfj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06f: athrow
      // 070: iload 5
      // 072: ifge 08f
      // 075: new io/netty/handler/codec/DecoderException
      // 078: dup
      // 079: sipush 27026
      // 07c: ldc2_w 6108254413929484109
      // 07f: lload 2
      // 080: lxor
      // 081: invokedynamic i (IJ)Ljava/lang/String; bsm=nfj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 086: nop
      // 087: invokespecial io/netty/handler/codec/DecoderException.<init> (Ljava/lang/String;)V
      // 08a: athrow
      // 08b: invokestatic nfj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08e: athrow
      // 08f: aload 0
      // 090: aload 0
      // 091: invokevirtual nfj.readerIndex ()I
      // 094: iload 5
      // 096: getstatic java/nio/charset/StandardCharsets.UTF_8 Ljava/nio/charset/Charset;
      // 099: invokevirtual nfj.toString (IILjava/nio/charset/Charset;)Ljava/lang/String;
      // 09c: astore 6
      // 09e: aload 0
      // 09f: aload 0
      // 0a0: invokevirtual nfj.readerIndex ()I
      // 0a3: iload 5
      // 0a5: iadd
      // 0a6: invokevirtual nfj.readerIndex (I)Lio/netty/buffer/ByteBuf;
      // 0a9: pop
      // 0aa: aload 6
      // 0ac: iload 4
      // 0ae: ifeq 108
      // 0b1: invokevirtual java/lang/String.length ()I
      // 0b4: iload 1
      // 0b5: if_icmple 106
      // 0b8: goto 0bf
      // 0bb: invokestatic nfj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0be: athrow
      // 0bf: new io/netty/handler/codec/DecoderException
      // 0c2: dup
      // 0c3: new java/lang/StringBuilder
      // 0c6: dup
      // 0c7: invokespecial java/lang/StringBuilder.<init> ()V
      // 0ca: sipush 28500
      // 0cd: ldc2_w 3096140138902227333
      // 0d0: lload 2
      // 0d1: lxor
      // 0d2: invokedynamic i (IJ)Ljava/lang/String; bsm=nfj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d7: nop
      // 0d8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0db: iload 5
      // 0dd: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0e0: sipush 31973
      // 0e3: ldc2_w 2746714550758480447
      // 0e6: lload 2
      // 0e7: lxor
      // 0e8: invokedynamic i (IJ)Ljava/lang/String; bsm=nfj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: nop
      // 0ee: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f1: iload 1
      // 0f2: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0f5: ldc ")"
      // 0f7: nop
      // 0f8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0fb: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0fe: invokespecial io/netty/handler/codec/DecoderException.<init> (Ljava/lang/String;)V
      // 101: athrow
      // 102: invokestatic nfj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 105: athrow
      // 106: aload 6
      // 108: areturn
   }

   public nfj p3z(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic nfj.a J
      // 03: ldc2_w 14294098860556
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.b ()I
      // 0b: istore 4
      // 0d: aload 1
      // 0e: getstatic java/nio/charset/StandardCharsets.UTF_8 Ljava/nio/charset/Charset;
      // 11: invokevirtual java/lang/String.getBytes (Ljava/nio/charset/Charset;)[B
      // 14: astore 5
      // 16: iload 4
      // 18: ifeq 84
      // 1b: aload 5
      // 1d: arraylength
      // 1e: sipush 32767
      // 21: if_icmple 75
      // 24: goto 2b
      // 27: invokestatic nfj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a: athrow
      // 2b: new io/netty/handler/codec/EncoderException
      // 2e: dup
      // 2f: new java/lang/StringBuilder
      // 32: dup
      // 33: invokespecial java/lang/StringBuilder.<init> ()V
      // 36: sipush 295
      // 39: ldc2_w 8516992895483030902
      // 3c: lload 2
      // 3d: lxor
      // 3e: invokedynamic i (IJ)Ljava/lang/String; bsm=nfj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43: nop
      // 44: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 47: aload 5
      // 49: arraylength
      // 4a: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 4d: sipush 26633
      // 50: ldc2_w 5318968268869321814
      // 53: lload 2
      // 54: lxor
      // 55: invokedynamic i (IJ)Ljava/lang/String; bsm=nfj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a: nop
      // 5b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5e: sipush 32767
      // 61: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 64: ldc ")"
      // 66: nop
      // 67: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 6d: invokespecial io/netty/handler/codec/EncoderException.<init> (Ljava/lang/String;)V
      // 70: athrow
      // 71: invokestatic nfj.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 74: athrow
      // 75: aload 0
      // 76: aload 5
      // 78: arraylength
      // 79: invokevirtual nfj.tao (I)Lnfj;
      // 7c: pop
      // 7d: aload 0
      // 7e: aload 5
      // 80: invokevirtual nfj.writeBytes ([B)Lio/netty/buffer/ByteBuf;
      // 83: pop
      // 84: aload 0
      // 85: areturn
   }

   public gdz huo() {
      return new gdz(this.oa5(32767));
   }

   public nfj hdo(gdz var1) {
      this.p3z(var1.toString());
      return this;
   }

   public Date xab() {
      return new Date(this.readLong());
   }

   public nfj vyf(Date var1) {
      this.writeLong(var1.getTime());
      return this;
   }

   public int capacity() {
      return this.cfv.capacity();
   }

   public ByteBuf capacity(int var1) {
      return this.cfv.capacity(var1);
   }

   public int maxCapacity() {
      return this.cfv.maxCapacity();
   }

   public ByteBufAllocator alloc() {
      return this.cfv.alloc();
   }

   public ByteOrder order() {
      return this.cfv.order();
   }

   public ByteBuf order(ByteOrder var1) {
      return this.cfv.order(var1);
   }

   public ByteBuf unwrap() {
      return this.cfv.unwrap();
   }

   public boolean isDirect() {
      return this.cfv.isDirect();
   }

   public boolean q4w() {
      return this.cfv.isReadOnly();
   }

   public ByteBuf lgu() {
      return this.cfv.asReadOnly();
   }

   public int readerIndex() {
      return this.cfv.readerIndex();
   }

   public ByteBuf readerIndex(int var1) {
      return this.cfv.readerIndex(var1);
   }

   public int writerIndex() {
      return this.cfv.writerIndex();
   }

   public ByteBuf writerIndex(int var1) {
      return this.cfv.writerIndex(var1);
   }

   public ByteBuf setIndex(int var1, int var2) {
      return this.cfv.setIndex(var1, var2);
   }

   public int readableBytes() {
      return this.cfv.readableBytes();
   }

   public int writableBytes() {
      return this.cfv.writableBytes();
   }

   public int maxWritableBytes() {
      return this.cfv.maxWritableBytes();
   }

   public boolean isReadable() {
      return this.cfv.isReadable();
   }

   public boolean isReadable(int var1) {
      return this.cfv.isReadable(var1);
   }

   public boolean isWritable() {
      return this.cfv.isWritable();
   }

   public boolean isWritable(int var1) {
      return this.cfv.isWritable(var1);
   }

   public ByteBuf clear() {
      return this.cfv.clear();
   }

   public ByteBuf markReaderIndex() {
      return this.cfv.markReaderIndex();
   }

   public ByteBuf resetReaderIndex() {
      return this.cfv.resetReaderIndex();
   }

   public ByteBuf markWriterIndex() {
      return this.cfv.markWriterIndex();
   }

   public ByteBuf resetWriterIndex() {
      return this.cfv.resetWriterIndex();
   }

   public ByteBuf discardReadBytes() {
      return this.cfv.discardReadBytes();
   }

   public ByteBuf discardSomeReadBytes() {
      return this.cfv.discardSomeReadBytes();
   }

   public ByteBuf ensureWritable(int var1) {
      return this.cfv.ensureWritable(var1);
   }

   public int ensureWritable(int var1, boolean var2) {
      return this.cfv.ensureWritable(var1, var2);
   }

   public boolean getBoolean(int var1) {
      return this.cfv.getBoolean(var1);
   }

   public byte getByte(int var1) {
      return this.cfv.getByte(var1);
   }

   public short getUnsignedByte(int var1) {
      return this.cfv.getUnsignedByte(var1);
   }

   public short getShort(int var1) {
      return this.cfv.getShort(var1);
   }

   public short gir(int var1) {
      return this.cfv.getShortLE(var1);
   }

   public int getUnsignedShort(int var1) {
      return this.cfv.getUnsignedShort(var1);
   }

   public int ucy(int var1) {
      return this.cfv.getUnsignedShortLE(var1);
   }

   public int getMedium(int var1) {
      return this.cfv.getMedium(var1);
   }

   public int x1q(int var1) {
      return this.cfv.getMediumLE(var1);
   }

   public int getUnsignedMedium(int var1) {
      return this.cfv.getUnsignedMedium(var1);
   }

   public int tiz(int var1) {
      return this.cfv.getUnsignedMediumLE(var1);
   }

   public int getInt(int var1) {
      return this.cfv.getInt(var1);
   }

   public int j9_(int var1) {
      return this.cfv.getIntLE(var1);
   }

   public long getUnsignedInt(int var1) {
      return this.cfv.getUnsignedInt(var1);
   }

   public long _ae(int var1) {
      return this.cfv.getUnsignedIntLE(var1);
   }

   public long getLong(int var1) {
      return this.cfv.getLong(var1);
   }

   public long ohw(int var1) {
      return this.cfv.getLongLE(var1);
   }

   public char getChar(int var1) {
      return this.cfv.getChar(var1);
   }

   public float getFloat(int var1) {
      return this.cfv.getFloat(var1);
   }

   public double getDouble(int var1) {
      return this.cfv.getDouble(var1);
   }

   public ByteBuf getBytes(int var1, ByteBuf var2) {
      return this.cfv.getBytes(var1, var2);
   }

   public ByteBuf getBytes(int var1, ByteBuf var2, int var3) {
      return this.cfv.getBytes(var1, var2, var3);
   }

   public ByteBuf getBytes(int var1, ByteBuf var2, int var3, int var4) {
      return this.cfv.getBytes(var1, var2, var3, var4);
   }

   public ByteBuf getBytes(int var1, byte[] var2) {
      return this.cfv.getBytes(var1, var2);
   }

   public ByteBuf getBytes(int var1, byte[] var2, int var3, int var4) {
      return this.cfv.getBytes(var1, var2, var3, var4);
   }

   public ByteBuf getBytes(int var1, ByteBuffer var2) {
      return this.cfv.getBytes(var1, var2);
   }

   public ByteBuf getBytes(int var1, OutputStream var2, int var3) {
      return this.cfv.getBytes(var1, var2, var3);
   }

   public int getBytes(int var1, GatheringByteChannel var2, int var3) {
      return this.cfv.getBytes(var1, var2, var3);
   }

   public int qc0(int var1, FileChannel var2, long var3, int var5) {
      return this.cfv.getBytes(var1, var2, var3, var5);
   }

   public CharSequence mb1(int var1, int var2, Charset var3) {
      return this.cfv.getCharSequence(var1, var2, var3);
   }

   public ByteBuf setBoolean(int var1, boolean var2) {
      return this.cfv.setBoolean(var1, var2);
   }

   public ByteBuf setByte(int var1, int var2) {
      return this.cfv.setByte(var1, var2);
   }

   public ByteBuf setShort(int var1, int var2) {
      return this.cfv.setShort(var1, var2);
   }

   public ByteBuf qmb(int var1, int var2) {
      return this.cfv.setShortLE(var1, var2);
   }

   public ByteBuf setMedium(int var1, int var2) {
      return this.cfv.setMedium(var1, var2);
   }

   public ByteBuf b19(int var1, int var2) {
      return this.cfv.setMediumLE(var1, var2);
   }

   public ByteBuf setInt(int var1, int var2) {
      return this.cfv.setInt(var1, var2);
   }

   public ByteBuf s3t(int var1, int var2) {
      return this.cfv.setIntLE(var1, var2);
   }

   public ByteBuf setLong(int var1, long var2) {
      return this.cfv.setLong(var1, var2);
   }

   public ByteBuf clf(int var1, long var2) {
      return this.cfv.setLongLE(var1, var2);
   }

   public ByteBuf setChar(int var1, int var2) {
      return this.cfv.setChar(var1, var2);
   }

   public ByteBuf setFloat(int var1, float var2) {
      return this.cfv.setFloat(var1, var2);
   }

   public ByteBuf setDouble(int var1, double var2) {
      return this.cfv.setDouble(var1, var2);
   }

   public ByteBuf setBytes(int var1, ByteBuf var2) {
      return this.cfv.setBytes(var1, var2);
   }

   public ByteBuf setBytes(int var1, ByteBuf var2, int var3) {
      return this.cfv.setBytes(var1, var2, var3);
   }

   public ByteBuf setBytes(int var1, ByteBuf var2, int var3, int var4) {
      return this.cfv.setBytes(var1, var2, var3, var4);
   }

   public ByteBuf setBytes(int var1, byte[] var2) {
      return this.cfv.setBytes(var1, var2);
   }

   public ByteBuf setBytes(int var1, byte[] var2, int var3, int var4) {
      return this.cfv.setBytes(var1, var2, var3, var4);
   }

   public ByteBuf setBytes(int var1, ByteBuffer var2) {
      return this.cfv.setBytes(var1, var2);
   }

   public int setBytes(int var1, InputStream var2, int var3) {
      return this.cfv.setBytes(var1, var2, var3);
   }

   public int setBytes(int var1, ScatteringByteChannel var2, int var3) {
      return this.cfv.setBytes(var1, var2, var3);
   }

   public int iqo(int var1, FileChannel var2, long var3, int var5) {
      return this.cfv.setBytes(var1, var2, var3, var5);
   }

   public ByteBuf setZero(int var1, int var2) {
      return this.cfv.setZero(var1, var2);
   }

   public int ci7(int var1, CharSequence var2, Charset var3) {
      return this.cfv.setCharSequence(var1, var2, var3);
   }

   public boolean readBoolean() {
      return this.cfv.readBoolean();
   }

   public byte readByte() {
      return this.cfv.readByte();
   }

   public short readUnsignedByte() {
      return this.cfv.readUnsignedByte();
   }

   public short readShort() {
      return this.cfv.readShort();
   }

   public short a30() {
      return this.cfv.readShortLE();
   }

   public int readUnsignedShort() {
      return this.cfv.readUnsignedShort();
   }

   public int p8v() {
      return this.cfv.readUnsignedShortLE();
   }

   public int readMedium() {
      return this.cfv.readMedium();
   }

   public int n3v() {
      return this.cfv.readMediumLE();
   }

   public int readUnsignedMedium() {
      return this.cfv.readUnsignedMedium();
   }

   public int z1r() {
      return this.cfv.readUnsignedMediumLE();
   }

   public int readInt() {
      return this.cfv.readInt();
   }

   public int v8h() {
      return this.cfv.readIntLE();
   }

   public long readUnsignedInt() {
      return this.cfv.readUnsignedInt();
   }

   public long gw7() {
      return this.cfv.readUnsignedIntLE();
   }

   public long readLong() {
      return this.cfv.readLong();
   }

   public long gp5() {
      return this.cfv.readLongLE();
   }

   public char readChar() {
      return this.cfv.readChar();
   }

   public float readFloat() {
      return this.cfv.readFloat();
   }

   public double readDouble() {
      return this.cfv.readDouble();
   }

   public ByteBuf readBytes(int var1) {
      return this.cfv.readBytes(var1);
   }

   public ByteBuf readSlice(int var1) {
      return this.cfv.readSlice(var1);
   }

   public ByteBuf p96(int var1) {
      return this.cfv.readRetainedSlice(var1);
   }

   public ByteBuf readBytes(ByteBuf var1) {
      return this.cfv.readBytes(var1);
   }

   public ByteBuf readBytes(ByteBuf var1, int var2) {
      return this.cfv.readBytes(var1, var2);
   }

   public ByteBuf readBytes(ByteBuf var1, int var2, int var3) {
      return this.cfv.readBytes(var1, var2, var3);
   }

   public ByteBuf readBytes(byte[] var1) {
      return this.cfv.readBytes(var1);
   }

   public ByteBuf readBytes(byte[] var1, int var2, int var3) {
      return this.cfv.readBytes(var1, var2, var3);
   }

   public ByteBuf readBytes(ByteBuffer var1) {
      return this.cfv.readBytes(var1);
   }

   public ByteBuf readBytes(OutputStream var1, int var2) {
      return this.cfv.readBytes(var1, var2);
   }

   public int readBytes(GatheringByteChannel var1, int var2) {
      return this.cfv.readBytes(var1, var2);
   }

   public CharSequence jx8(int var1, Charset var2) {
      return this.cfv.readCharSequence(var1, var2);
   }

   public int k4o(FileChannel var1, long var2, int var4) {
      return this.cfv.readBytes(var1, var2, var4);
   }

   public ByteBuf skipBytes(int var1) {
      return this.cfv.skipBytes(var1);
   }

   public ByteBuf writeBoolean(boolean var1) {
      return this.cfv.writeBoolean(var1);
   }

   public ByteBuf writeByte(int var1) {
      return this.cfv.writeByte(var1);
   }

   public ByteBuf writeShort(int var1) {
      return this.cfv.writeShort(var1);
   }

   public ByteBuf h5u(int var1) {
      return this.cfv.writeShortLE(var1);
   }

   public ByteBuf writeMedium(int var1) {
      return this.cfv.writeMedium(var1);
   }

   public ByteBuf f0_(int var1) {
      return this.cfv.writeMediumLE(var1);
   }

   public ByteBuf writeInt(int var1) {
      return this.cfv.writeInt(var1);
   }

   public ByteBuf gsj(int var1) {
      return this.cfv.writeIntLE(var1);
   }

   public ByteBuf writeLong(long var1) {
      return this.cfv.writeLong(var1);
   }

   public ByteBuf _bo(long var1) {
      return this.cfv.writeLongLE(var1);
   }

   public ByteBuf writeChar(int var1) {
      return this.cfv.writeChar(var1);
   }

   public ByteBuf writeFloat(float var1) {
      return this.cfv.writeFloat(var1);
   }

   public ByteBuf writeDouble(double var1) {
      return this.cfv.writeDouble(var1);
   }

   public ByteBuf writeBytes(ByteBuf var1) {
      return this.cfv.writeBytes(var1);
   }

   public ByteBuf writeBytes(ByteBuf var1, int var2) {
      return this.cfv.writeBytes(var1, var2);
   }

   public ByteBuf writeBytes(ByteBuf var1, int var2, int var3) {
      return this.cfv.writeBytes(var1, var2, var3);
   }

   public ByteBuf writeBytes(byte[] var1) {
      return this.cfv.writeBytes(var1);
   }

   public ByteBuf writeBytes(byte[] var1, int var2, int var3) {
      return this.cfv.writeBytes(var1, var2, var3);
   }

   public ByteBuf writeBytes(ByteBuffer var1) {
      return this.cfv.writeBytes(var1);
   }

   public int writeBytes(InputStream var1, int var2) {
      return this.cfv.writeBytes(var1, var2);
   }

   public int writeBytes(ScatteringByteChannel var1, int var2) {
      return this.cfv.writeBytes(var1, var2);
   }

   public int jv4(FileChannel var1, long var2, int var4) {
      return this.cfv.writeBytes(var1, var2, var4);
   }

   public ByteBuf writeZero(int var1) {
      return this.cfv.writeZero(var1);
   }

   public int sxk(CharSequence var1, Charset var2) {
      return this.cfv.writeCharSequence(var1, var2);
   }

   public int indexOf(int var1, int var2, byte var3) {
      return this.cfv.indexOf(var1, var2, var3);
   }

   public int bytesBefore(byte var1) {
      return this.cfv.bytesBefore(var1);
   }

   public int bytesBefore(int var1, byte var2) {
      return this.cfv.bytesBefore(var1, var2);
   }

   public int bytesBefore(int var1, int var2, byte var3) {
      return this.cfv.bytesBefore(var1, var2, var3);
   }

   public int tak(ByteProcessor var1) {
      return this.cfv.forEachByte(var1);
   }

   public int ag8(int var1, int var2, ByteProcessor var3) {
      return this.cfv.forEachByte(var1, var2, var3);
   }

   public int gno(ByteProcessor var1) {
      return this.cfv.forEachByteDesc(var1);
   }

   public int jvv(int var1, int var2, ByteProcessor var3) {
      return this.cfv.forEachByteDesc(var1, var2, var3);
   }

   public ByteBuf copy() {
      return this.cfv.copy();
   }

   public ByteBuf copy(int var1, int var2) {
      return this.cfv.copy(var1, var2);
   }

   public ByteBuf slice() {
      return this.cfv.slice();
   }

   public ByteBuf s5q() {
      return this.cfv.retainedSlice();
   }

   public ByteBuf slice(int var1, int var2) {
      return this.cfv.slice(var1, var2);
   }

   public ByteBuf fg2(int var1, int var2) {
      return this.cfv.retainedSlice(var1, var2);
   }

   public ByteBuf duplicate() {
      return this.cfv.duplicate();
   }

   public ByteBuf rj6() {
      return this.cfv.retainedDuplicate();
   }

   public int nioBufferCount() {
      return this.cfv.nioBufferCount();
   }

   public ByteBuffer nioBuffer() {
      return this.cfv.nioBuffer();
   }

   public ByteBuffer nioBuffer(int var1, int var2) {
      return this.cfv.nioBuffer(var1, var2);
   }

   public ByteBuffer internalNioBuffer(int var1, int var2) {
      return this.cfv.internalNioBuffer(var1, var2);
   }

   public ByteBuffer[] nioBuffers() {
      return this.cfv.nioBuffers();
   }

   public ByteBuffer[] nioBuffers(int var1, int var2) {
      return this.cfv.nioBuffers(var1, var2);
   }

   public boolean hasArray() {
      return this.cfv.hasArray();
   }

   public byte[] array() {
      return this.cfv.array();
   }

   public int arrayOffset() {
      return this.cfv.arrayOffset();
   }

   public boolean hasMemoryAddress() {
      return this.cfv.hasMemoryAddress();
   }

   public long memoryAddress() {
      return this.cfv.memoryAddress();
   }

   public String toString(Charset var1) {
      return this.cfv.toString(var1);
   }

   public String toString(int var1, int var2, Charset var3) {
      return this.cfv.toString(var1, var2, var3);
   }

   public int hashCode() {
      return this.cfv.hashCode();
   }

   public boolean equals(Object var1) {
      return this.cfv.equals(var1);
   }

   public int compareTo(ByteBuf var1) {
      return this.cfv.compareTo(var1);
   }

   public String toString() {
      return this.cfv.toString();
   }

   public ByteBuf retain(int var1) {
      return this.cfv.retain(var1);
   }

   public ByteBuf retain() {
      return this.cfv.retain();
   }

   public ByteBuf put() {
      return this.cfv.touch();
   }

   public ByteBuf x29(Object var1) {
      return this.cfv.touch(var1);
   }

   public int refCnt() {
      return this.cfv.refCnt();
   }

   public boolean release() {
      return this.cfv.release();
   }

   public boolean release(int var1) {
      return this.cfv.release(var1);
   }

   public ReferenceCounted x29(Object var1) {
      return this.x29(var1);
   }

   public ReferenceCounted put() {
      return this.put();
   }

   public ReferenceCounted retain(int var1) {
      return this.retain(var1);
   }

   public ReferenceCounted retain() {
      return this.retain();
   }

   public int compareTo(Object var1) {
      return this.compareTo((ByteBuf)var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(3239705450604104683L, -1106697857581649379L, MethodHandles.lookup().lookupClass()).a(143143133150684L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 64766339987274L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[14];
      int var7 = 0;
      String var6 = "äÝ3®=gó0\u0086\u0010È\u008a2;\u008b\u009e\u0081w ]Åpã¡ÛFÔ\u001aÊü\u0000z7{\u0019P~ìG\u0014¬¸#ïÂ×\u0013\u008c9Æ¢¸FÄ\u0092 \u009e+±\u008ehåç7\u0015m\u001fâÙ®J \u0004¾è}A.\u000fUË,ë\u0093Uµ\u0093\u0005üî± \u008b\u008bþ¯eNbØÛª\u009a`\u009aëÀá\u0083)Y\u001f\u0001a`!ü\u008f\u0010\u0095\u0010Ó9×\u0007c]\u0093\"\\Í¥ò;Ö7\u008b8p.\u0081å\u00867úavH\u0006Ê>\u0081Ë\u008a^;¦\u0083 \u0014\\G\u001e\u0092UKçAT\u009d¤[FÆZ$ÊT\u0004\u0019\u0016c\bo¬,ÝÇ\u0096\u0007`²#T\u0010Z\u0092JZ\u0015\ræÆ\u00ad.PE\u0006_\u009dx\u0080$\f\t¨VVÆ\u0016æd{>\u00176Æ\u000e^L\u0096\u0004A§t\u0095§Ï\u0002×\u0002=~yO\u0015w\t\u0004E¾D°Ý¥weO%3+?\"ù! gÇ¿W2ýÎ\u0083ø v7¹áô¬\u008dÅßÒö2ºðÚ\u0085\u0006\u008f\u001b\u0016D\u0017î:ææ'\u0019ÅbpèÏ\u0012\\ä.\u0004,WÌ²ä\r^µû\u0007é<\b\\Ý\u0016\u0087AªIg*)ï-¯ í\u008aý\u0099a&\"L\r\u0081\u008d\u0018ü\râhcgn\u0017c\u0018øÓiCîDùjê!(Æ\u008a\u000f·\u0004-»§Îè\u0095øÉ\u0084,*\u0092af·¤¤»ö\u0088\r\u009a×zX\u00980\u001c\u009a\u001af\u008f\u0016PÎ(È÷ÔÛlÏ¯\u001cÚºBøxÑ=GÚ\u000eúÚ\u0083`G~©\u0006×\u001f\u0004\u0014¢Í}\u001b[¿\n²Ã3(ªÈã~\u0081\u008d\u0086ÅRVä\u008d\tÿ\u009fv\u0086\u0019+á\u000e&:Ã\tÙK\fó»\u0098þo;\u008b\u0089|k\u009fñ8\u008e\u0094KeJ\u001a\u000e\u0090\fÌ²ÿs\u001ee\u007ft\u001fÐÙº>Ó4Ù\u0013\u0002§\u0096\u001dô \u0084èN+\u0092NÚ\u0089c\f\u000e\u000b\u009cg!\u0089ÊðÑV\u0006\u0007\u0085Uhsæ\u0018i©\u0081ÐCg\u0087r¼\u0013\u0098\u0091\u0084Ø=þ:\u0082\u0084\u0000¿ò \u008567ú÷\u009b\\\u008a\\â\u0089¢\u000bíÇ\u0005üXX\u008eµ\u0088EÒòzxV±!ÇâJ«»K³§ãxÔÇet,è©\u001fqµË.\u0089%]DìPa¨\u0080L\u009bæâKÍ\u008fPIáx+]~×X~\u0018Ç*<÷wð,\u008fWÉCè\u0014\u0095*\u009a£\u0001HtëO\u0086\u001a";
      int var8 = "äÝ3®=gó0\u0086\u0010È\u008a2;\u008b\u009e\u0081w ]Åpã¡ÛFÔ\u001aÊü\u0000z7{\u0019P~ìG\u0014¬¸#ïÂ×\u0013\u008c9Æ¢¸FÄ\u0092 \u009e+±\u008ehåç7\u0015m\u001fâÙ®J \u0004¾è}A.\u000fUË,ë\u0093Uµ\u0093\u0005üî± \u008b\u008bþ¯eNbØÛª\u009a`\u009aëÀá\u0083)Y\u001f\u0001a`!ü\u008f\u0010\u0095\u0010Ó9×\u0007c]\u0093\"\\Í¥ò;Ö7\u008b8p.\u0081å\u00867úavH\u0006Ê>\u0081Ë\u008a^;¦\u0083 \u0014\\G\u001e\u0092UKçAT\u009d¤[FÆZ$ÊT\u0004\u0019\u0016c\bo¬,ÝÇ\u0096\u0007`²#T\u0010Z\u0092JZ\u0015\ræÆ\u00ad.PE\u0006_\u009dx\u0080$\f\t¨VVÆ\u0016æd{>\u00176Æ\u000e^L\u0096\u0004A§t\u0095§Ï\u0002×\u0002=~yO\u0015w\t\u0004E¾D°Ý¥weO%3+?\"ù! gÇ¿W2ýÎ\u0083ø v7¹áô¬\u008dÅßÒö2ºðÚ\u0085\u0006\u008f\u001b\u0016D\u0017î:ææ'\u0019ÅbpèÏ\u0012\\ä.\u0004,WÌ²ä\r^µû\u0007é<\b\\Ý\u0016\u0087AªIg*)ï-¯ í\u008aý\u0099a&\"L\r\u0081\u008d\u0018ü\râhcgn\u0017c\u0018øÓiCîDùjê!(Æ\u008a\u000f·\u0004-»§Îè\u0095øÉ\u0084,*\u0092af·¤¤»ö\u0088\r\u009a×zX\u00980\u001c\u009a\u001af\u008f\u0016PÎ(È÷ÔÛlÏ¯\u001cÚºBøxÑ=GÚ\u000eúÚ\u0083`G~©\u0006×\u001f\u0004\u0014¢Í}\u001b[¿\n²Ã3(ªÈã~\u0081\u008d\u0086ÅRVä\u008d\tÿ\u009fv\u0086\u0019+á\u000e&:Ã\tÙK\fó»\u0098þo;\u008b\u0089|k\u009fñ8\u008e\u0094KeJ\u001a\u000e\u0090\fÌ²ÿs\u001ee\u007ft\u001fÐÙº>Ó4Ù\u0013\u0002§\u0096\u001dô \u0084èN+\u0092NÚ\u0089c\f\u000e\u000b\u009cg!\u0089ÊðÑV\u0006\u0007\u0085Uhsæ\u0018i©\u0081ÐCg\u0087r¼\u0013\u0098\u0091\u0084Ø=þ:\u0082\u0084\u0000¿ò \u008567ú÷\u009b\\\u008a\\â\u0089¢\u000bíÇ\u0005üXX\u008eµ\u0088EÒòzxV±!ÇâJ«»K³§ãxÔÇet,è©\u001fqµË.\u0089%]DìPa¨\u0080L\u009bæâKÍ\u008fPIáx+]~×X~\u0018Ç*<÷wð,\u008fWÉCè\u0014\u0095*\u009a£\u0001HtëO\u0086\u001a"
         .length();
      char var5 = 'x';
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
                     c = new String[14];
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

                  var6 = "ÇÑ\u001b\\\u000fÝ\u001eu\u0098ìäWì\u0015\u007f\\e\fY]\u0014qNJQt7\u008c\n³Â\u0011DC\u001c\u0018@)²Û(z\u001e\u0095[AÑ®=l-×Q\u0010çnªM\u0085(d×³ùTªDU÷Öüx¦\u0095<ðlþ\u0004ú³";
                  var8 = "ÇÑ\u001b\\\u000fÝ\u001eu\u0098ìäWì\u0015\u007f\\e\fY]\u0014qNJQt7\u008c\n³Â\u0011DC\u001c\u0018@)²Û(z\u001e\u0095[AÑ®=l-×Q\u0010çnªM\u0085(d×³ùTªDU÷Öüx¦\u0095<ðlþ\u0004ú³"
                     .length();
                  var5 = '(';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static Exception a(Exception var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 17299;
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
            throw new RuntimeException("nfj", var10);
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
         throw new RuntimeException("nfj" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
