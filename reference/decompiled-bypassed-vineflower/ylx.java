import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.RandomAccessFile;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.zip.DeflaterOutputStream;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ylx {
   private static final byte[] _v8;
   private final File j6z;
   private RandomAccessFile ua3;
   private final int[] t9u;
   private final int[] yq0;
   private List lt7;
   private int z91;
   private long c_u;
   private static final long a;
   private static final String b;

   public ylx(File param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic ylx.a J
      // 003: ldc2_w 117949316166772
      // 006: lxor
      // 007: lstore 2
      // 008: aload 0
      // 009: invokespecial java/lang/Object.<init> ()V
      // 00c: aload 0
      // 00d: sipush 1024
      // 010: newarray 10
      // 012: putfield ylx.t9u [I
      // 015: invokestatic t9d.c ()I
      // 018: aload 0
      // 019: sipush 1024
      // 01c: newarray 10
      // 01e: putfield ylx.yq0 [I
      // 021: aload 0
      // 022: aload 1
      // 023: putfield ylx.j6z Ljava/io/File;
      // 026: istore 4
      // 028: aload 0
      // 029: bipush 0
      // 02a: putfield ylx.z91 I
      // 02d: aload 1
      // 02e: invokevirtual java/io/File.exists ()Z
      // 031: iload 4
      // 033: ifne 063
      // 036: ifeq 048
      // 039: aload 0
      // 03a: aload 1
      // 03b: invokevirtual java/io/File.lastModified ()J
      // 03e: putfield ylx.c_u J
      // 041: goto 048
      // 044: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 047: athrow
      // 048: aload 0
      // 049: new java/io/RandomAccessFile
      // 04c: dup
      // 04d: aload 1
      // 04e: getstatic ylx.b Ljava/lang/String;
      // 051: nop
      // 052: invokespecial java/io/RandomAccessFile.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 055: putfield ylx.ua3 Ljava/io/RandomAccessFile;
      // 058: aload 0
      // 059: getfield ylx.ua3 Ljava/io/RandomAccessFile;
      // 05c: invokevirtual java/io/RandomAccessFile.length ()J
      // 05f: ldc2_w 4096
      // 062: lcmp
      // 063: iload 4
      // 065: ifne 0e0
      // 068: ifge 0d3
      // 06b: goto 072
      // 06e: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 071: athrow
      // 072: bipush 0
      // 073: istore 5
      // 075: iload 5
      // 077: sipush 1024
      // 07a: if_icmpge 099
      // 07d: aload 0
      // 07e: getfield ylx.ua3 Ljava/io/RandomAccessFile;
      // 081: bipush 0
      // 082: invokevirtual java/io/RandomAccessFile.writeInt (I)V
      // 085: iinc 5 1
      // 088: iload 4
      // 08a: ifne 09c
      // 08d: iload 4
      // 08f: ifeq 075
      // 092: goto 099
      // 095: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 098: athrow
      // 099: bipush 0
      // 09a: istore 5
      // 09c: iload 5
      // 09e: sipush 1024
      // 0a1: if_icmpge 0c7
      // 0a4: aload 0
      // 0a5: getfield ylx.ua3 Ljava/io/RandomAccessFile;
      // 0a8: bipush 0
      // 0a9: invokevirtual java/io/RandomAccessFile.writeInt (I)V
      // 0ac: iinc 5 1
      // 0af: iload 4
      // 0b1: ifne 0d3
      // 0b4: goto 0bb
      // 0b7: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ba: athrow
      // 0bb: iload 4
      // 0bd: ifeq 09c
      // 0c0: goto 0c7
      // 0c3: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c6: athrow
      // 0c7: aload 0
      // 0c8: dup
      // 0c9: getfield ylx.z91 I
      // 0cc: sipush 8192
      // 0cf: iadd
      // 0d0: putfield ylx.z91 I
      // 0d3: aload 0
      // 0d4: getfield ylx.ua3 Ljava/io/RandomAccessFile;
      // 0d7: invokevirtual java/io/RandomAccessFile.length ()J
      // 0da: ldc2_w 4095
      // 0dd: land
      // 0de: lconst_0
      // 0df: lcmp
      // 0e0: iload 4
      // 0e2: ifne 12c
      // 0e5: ifeq 120
      // 0e8: goto 0ef
      // 0eb: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ee: athrow
      // 0ef: bipush 0
      // 0f0: istore 5
      // 0f2: iload 5
      // 0f4: i2l
      // 0f5: aload 0
      // 0f6: getfield ylx.ua3 Ljava/io/RandomAccessFile;
      // 0f9: invokevirtual java/io/RandomAccessFile.length ()J
      // 0fc: ldc2_w 4095
      // 0ff: land
      // 100: lcmp
      // 101: ifge 120
      // 104: aload 0
      // 105: getfield ylx.ua3 Ljava/io/RandomAccessFile;
      // 108: bipush 0
      // 109: invokevirtual java/io/RandomAccessFile.write (I)V
      // 10c: iinc 5 1
      // 10f: iload 4
      // 111: ifne 137
      // 114: iload 4
      // 116: ifeq 0f2
      // 119: goto 120
      // 11c: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11f: athrow
      // 120: aload 0
      // 121: getfield ylx.ua3 Ljava/io/RandomAccessFile;
      // 124: invokevirtual java/io/RandomAccessFile.length ()J
      // 127: l2i
      // 128: sipush 4096
      // 12b: idiv
      // 12c: istore 5
      // 12e: aload 0
      // 12f: iload 5
      // 131: invokestatic com/google/common/collect/Lists.newArrayListWithCapacity (I)Ljava/util/ArrayList;
      // 134: putfield ylx.lt7 Ljava/util/List;
      // 137: bipush 0
      // 138: istore 6
      // 13a: iload 6
      // 13c: iload 5
      // 13e: if_icmpge 163
      // 141: aload 0
      // 142: getfield ylx.lt7 Ljava/util/List;
      // 145: bipush 1
      // 146: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 149: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 14e: pop
      // 14f: iinc 6 1
      // 152: iload 4
      // 154: ifne 189
      // 157: iload 4
      // 159: ifeq 13a
      // 15c: goto 163
      // 15f: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 162: athrow
      // 163: aload 0
      // 164: getfield ylx.lt7 Ljava/util/List;
      // 167: bipush 0
      // 168: bipush 0
      // 169: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 16c: invokeinterface java/util/List.set (ILjava/lang/Object;)Ljava/lang/Object; 3
      // 171: pop
      // 172: aload 0
      // 173: getfield ylx.lt7 Ljava/util/List;
      // 176: bipush 1
      // 177: bipush 0
      // 178: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 17b: invokeinterface java/util/List.set (ILjava/lang/Object;)Ljava/lang/Object; 3
      // 180: pop
      // 181: aload 0
      // 182: getfield ylx.ua3 Ljava/io/RandomAccessFile;
      // 185: lconst_0
      // 186: invokevirtual java/io/RandomAccessFile.seek (J)V
      // 189: bipush 0
      // 18a: istore 6
      // 18c: iload 6
      // 18e: sipush 1024
      // 191: if_icmpge 235
      // 194: aload 0
      // 195: getfield ylx.ua3 Ljava/io/RandomAccessFile;
      // 198: invokevirtual java/io/RandomAccessFile.readInt ()I
      // 19b: istore 7
      // 19d: aload 0
      // 19e: getfield ylx.t9u [I
      // 1a1: iload 6
      // 1a3: iload 7
      // 1a5: iastore
      // 1a6: iload 4
      // 1a8: ifne 230
      // 1ab: iload 7
      // 1ad: iload 4
      // 1af: ifne 236
      // 1b2: goto 1b9
      // 1b5: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b8: athrow
      // 1b9: ifeq 22d
      // 1bc: goto 1c3
      // 1bf: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c2: athrow
      // 1c3: iload 7
      // 1c5: bipush 8
      // 1c7: ishr
      // 1c8: iload 7
      // 1ca: sipush 255
      // 1cd: iand
      // 1ce: iadd
      // 1cf: iload 4
      // 1d1: ifne 1f6
      // 1d4: goto 1db
      // 1d7: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1da: athrow
      // 1db: aload 0
      // 1dc: getfield ylx.lt7 Ljava/util/List;
      // 1df: invokeinterface java/util/List.size ()I 1
      // 1e4: if_icmpgt 22d
      // 1e7: goto 1ee
      // 1ea: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ed: athrow
      // 1ee: bipush 0
      // 1ef: goto 1f6
      // 1f2: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f5: athrow
      // 1f6: istore 8
      // 1f8: iload 8
      // 1fa: iload 7
      // 1fc: sipush 255
      // 1ff: iand
      // 200: if_icmpge 22d
      // 203: aload 0
      // 204: getfield ylx.lt7 Ljava/util/List;
      // 207: iload 7
      // 209: bipush 8
      // 20b: ishr
      // 20c: iload 8
      // 20e: iadd
      // 20f: bipush 0
      // 210: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 213: invokeinterface java/util/List.set (ILjava/lang/Object;)Ljava/lang/Object; 3
      // 218: pop
      // 219: iinc 8 1
      // 21c: iload 4
      // 21e: ifne 230
      // 221: iload 4
      // 223: ifeq 1f8
      // 226: goto 22d
      // 229: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22c: athrow
      // 22d: iinc 6 1
      // 230: iload 4
      // 232: ifeq 18c
      // 235: bipush 0
      // 236: istore 6
      // 238: iload 6
      // 23a: sipush 1024
      // 23d: if_icmpge 266
      // 240: aload 0
      // 241: getfield ylx.ua3 Ljava/io/RandomAccessFile;
      // 244: invokevirtual java/io/RandomAccessFile.readInt ()I
      // 247: istore 7
      // 249: aload 0
      // 24a: getfield ylx.yq0 [I
      // 24d: iload 6
      // 24f: iload 7
      // 251: iastore
      // 252: iinc 6 1
      // 255: iload 4
      // 257: ifne 270
      // 25a: iload 4
      // 25c: ifeq 238
      // 25f: goto 266
      // 262: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 265: athrow
      // 266: goto 270
      // 269: astore 5
      // 26b: aload 5
      // 26d: invokevirtual java/io/IOException.printStackTrace ()V
      // 270: return
   }

   public synchronized DataInputStream ci2(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 3
      // 004: aload 0
      // 005: iload 1
      // 006: iload 2
      // 007: invokespecial ylx.gbi (II)Z
      // 00a: iload 3
      // 00b: ifne 024
      // 00e: ifeq 01e
      // 011: goto 018
      // 014: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 017: athrow
      // 018: aconst_null
      // 019: areturn
      // 01a: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01d: athrow
      // 01e: aload 0
      // 01f: iload 1
      // 020: iload 2
      // 021: invokespecial ylx.o_s (II)I
      // 024: istore 4
      // 026: iload 4
      // 028: iload 3
      // 029: ifne 03d
      // 02c: ifne 038
      // 02f: goto 036
      // 032: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 035: athrow
      // 036: aconst_null
      // 037: areturn
      // 038: iload 4
      // 03a: bipush 8
      // 03c: ishr
      // 03d: istore 5
      // 03f: iload 4
      // 041: sipush 255
      // 044: iand
      // 045: istore 6
      // 047: iload 5
      // 049: iload 6
      // 04b: iadd
      // 04c: iload 3
      // 04d: ifne 07a
      // 050: aload 0
      // 051: getfield ylx.lt7 Ljava/util/List;
      // 054: invokeinterface java/util/List.size ()I 1
      // 059: if_icmple 065
      // 05c: goto 063
      // 05f: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 062: athrow
      // 063: aconst_null
      // 064: areturn
      // 065: aload 0
      // 066: getfield ylx.ua3 Ljava/io/RandomAccessFile;
      // 069: iload 5
      // 06b: sipush 4096
      // 06e: imul
      // 06f: i2l
      // 070: invokevirtual java/io/RandomAccessFile.seek (J)V
      // 073: aload 0
      // 074: getfield ylx.ua3 Ljava/io/RandomAccessFile;
      // 077: invokevirtual java/io/RandomAccessFile.readInt ()I
      // 07a: istore 7
      // 07c: iload 7
      // 07e: iload 3
      // 07f: ifne 096
      // 082: sipush 4096
      // 085: iload 6
      // 087: imul
      // 088: if_icmple 094
      // 08b: goto 092
      // 08e: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 091: athrow
      // 092: aconst_null
      // 093: areturn
      // 094: iload 7
      // 096: iload 3
      // 097: ifne 0ad
      // 09a: ifgt 0a6
      // 09d: goto 0a4
      // 0a0: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a3: athrow
      // 0a4: aconst_null
      // 0a5: areturn
      // 0a6: aload 0
      // 0a7: getfield ylx.ua3 Ljava/io/RandomAccessFile;
      // 0aa: invokevirtual java/io/RandomAccessFile.readByte ()B
      // 0ad: istore 8
      // 0af: iload 8
      // 0b1: bipush 1
      // 0b2: iload 3
      // 0b3: ifne 0f4
      // 0b6: if_icmpne 0f1
      // 0b9: goto 0c0
      // 0bc: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bf: athrow
      // 0c0: iload 7
      // 0c2: bipush 1
      // 0c3: isub
      // 0c4: newarray 8
      // 0c6: astore 9
      // 0c8: aload 0
      // 0c9: getfield ylx.ua3 Ljava/io/RandomAccessFile;
      // 0cc: aload 9
      // 0ce: invokevirtual java/io/RandomAccessFile.read ([B)I
      // 0d1: pop
      // 0d2: new java/io/DataInputStream
      // 0d5: dup
      // 0d6: new java/io/BufferedInputStream
      // 0d9: dup
      // 0da: new java/util/zip/GZIPInputStream
      // 0dd: dup
      // 0de: new java/io/ByteArrayInputStream
      // 0e1: dup
      // 0e2: aload 9
      // 0e4: invokespecial java/io/ByteArrayInputStream.<init> ([B)V
      // 0e7: invokespecial java/util/zip/GZIPInputStream.<init> (Ljava/io/InputStream;)V
      // 0ea: invokespecial java/io/BufferedInputStream.<init> (Ljava/io/InputStream;)V
      // 0ed: invokespecial java/io/DataInputStream.<init> (Ljava/io/InputStream;)V
      // 0f0: areturn
      // 0f1: iload 8
      // 0f3: bipush 2
      // 0f4: iload 3
      // 0f5: ifne 10c
      // 0f8: if_icmpne 13a
      // 0fb: goto 102
      // 0fe: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 101: athrow
      // 102: iload 7
      // 104: bipush 1
      // 105: goto 10c
      // 108: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10b: athrow
      // 10c: isub
      // 10d: newarray 8
      // 10f: astore 9
      // 111: aload 0
      // 112: getfield ylx.ua3 Ljava/io/RandomAccessFile;
      // 115: aload 9
      // 117: invokevirtual java/io/RandomAccessFile.read ([B)I
      // 11a: pop
      // 11b: new java/io/DataInputStream
      // 11e: dup
      // 11f: new java/io/BufferedInputStream
      // 122: dup
      // 123: new java/util/zip/InflaterInputStream
      // 126: dup
      // 127: new java/io/ByteArrayInputStream
      // 12a: dup
      // 12b: aload 9
      // 12d: invokespecial java/io/ByteArrayInputStream.<init> ([B)V
      // 130: invokespecial java/util/zip/InflaterInputStream.<init> (Ljava/io/InputStream;)V
      // 133: invokespecial java/io/BufferedInputStream.<init> (Ljava/io/InputStream;)V
      // 136: invokespecial java/io/DataInputStream.<init> (Ljava/io/InputStream;)V
      // 139: areturn
      // 13a: aconst_null
      // 13b: areturn
      // 13c: astore 4
      // 13e: aconst_null
      // 13f: areturn
   }

   public DataOutputStream wfn(int var1, int var2) {
      try {
         if (this.gbi(var1, var2)) {
            return null;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return new DataOutputStream(new DeflaterOutputStream(new ylx$y96(this, var1, var2)));
   }

   public synchronized void i3q(int param1, int param2, byte[] param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 5
      // 005: aload 0
      // 006: iload 1
      // 007: iload 2
      // 008: invokespecial ylx.o_s (II)I
      // 00b: istore 6
      // 00d: iload 6
      // 00f: bipush 8
      // 011: ishr
      // 012: istore 7
      // 014: iload 6
      // 016: sipush 255
      // 019: iand
      // 01a: istore 8
      // 01c: iload 4
      // 01e: bipush 5
      // 01f: iadd
      // 020: sipush 4096
      // 023: idiv
      // 024: bipush 1
      // 025: iadd
      // 026: istore 9
      // 028: iload 9
      // 02a: iload 5
      // 02c: ifne 03f
      // 02f: sipush 256
      // 032: if_icmplt 03d
      // 035: goto 03c
      // 038: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03b: athrow
      // 03c: return
      // 03d: iload 7
      // 03f: iload 5
      // 041: ifne 085
      // 044: ifeq 07d
      // 047: goto 04e
      // 04a: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04d: athrow
      // 04e: iload 8
      // 050: iload 5
      // 052: ifne 085
      // 055: goto 05c
      // 058: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05b: athrow
      // 05c: iload 9
      // 05e: if_icmpne 07d
      // 061: goto 068
      // 064: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 067: athrow
      // 068: aload 0
      // 069: iload 7
      // 06b: aload 3
      // 06c: iload 4
      // 06e: invokespecial ylx.y3e (I[BI)V
      // 071: iload 5
      // 073: ifeq 26a
      // 076: goto 07d
      // 079: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07c: athrow
      // 07d: bipush 0
      // 07e: goto 085
      // 081: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 084: athrow
      // 085: istore 10
      // 087: iload 10
      // 089: iload 8
      // 08b: if_icmpge 0b5
      // 08e: aload 0
      // 08f: getfield ylx.lt7 Ljava/util/List;
      // 092: iload 7
      // 094: iload 10
      // 096: iadd
      // 097: bipush 1
      // 098: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 09b: invokeinterface java/util/List.set (ILjava/lang/Object;)Ljava/lang/Object; 3
      // 0a0: pop
      // 0a1: iinc 10 1
      // 0a4: iload 5
      // 0a6: ifne 0c4
      // 0a9: iload 5
      // 0ab: ifeq 087
      // 0ae: goto 0b5
      // 0b1: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b4: athrow
      // 0b5: aload 0
      // 0b6: getfield ylx.lt7 Ljava/util/List;
      // 0b9: bipush 1
      // 0ba: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0bd: invokeinterface java/util/List.indexOf (Ljava/lang/Object;)I 2
      // 0c2: istore 10
      // 0c4: bipush 0
      // 0c5: istore 11
      // 0c7: iload 10
      // 0c9: bipush -1
      // 0ca: iload 5
      // 0cc: ifne 1a1
      // 0cf: if_icmpeq 191
      // 0d2: goto 0d9
      // 0d5: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d8: athrow
      // 0d9: iload 10
      // 0db: istore 12
      // 0dd: iload 12
      // 0df: aload 0
      // 0e0: getfield ylx.lt7 Ljava/util/List;
      // 0e3: invokeinterface java/util/List.size ()I 1
      // 0e8: if_icmpge 191
      // 0eb: iload 11
      // 0ed: iload 5
      // 0ef: ifne 193
      // 0f2: iload 5
      // 0f4: ifne 165
      // 0f7: goto 0fe
      // 0fa: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fd: athrow
      // 0fe: ifeq 14d
      // 101: goto 108
      // 104: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 107: athrow
      // 108: aload 0
      // 109: getfield ylx.lt7 Ljava/util/List;
      // 10c: iload 12
      // 10e: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 113: checkcast java/lang/Boolean
      // 116: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 119: iload 5
      // 11b: ifne 146
      // 11e: goto 125
      // 121: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 124: athrow
      // 125: ifeq 13e
      // 128: goto 12f
      // 12b: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12e: athrow
      // 12f: iinc 11 1
      // 132: iload 5
      // 134: ifeq 17b
      // 137: goto 13e
      // 13a: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13d: athrow
      // 13e: bipush 0
      // 13f: goto 146
      // 142: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 145: athrow
      // 146: istore 11
      // 148: iload 5
      // 14a: ifeq 17b
      // 14d: aload 0
      // 14e: getfield ylx.lt7 Ljava/util/List;
      // 151: iload 12
      // 153: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 158: checkcast java/lang/Boolean
      // 15b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 15e: goto 165
      // 161: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 164: athrow
      // 165: iload 5
      // 167: ifne 17d
      // 16a: ifeq 17b
      // 16d: goto 174
      // 170: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 173: athrow
      // 174: iload 12
      // 176: istore 10
      // 178: bipush 1
      // 179: istore 11
      // 17b: iload 11
      // 17d: iload 9
      // 17f: if_icmplt 189
      // 182: goto 191
      // 185: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 188: athrow
      // 189: iinc 12 1
      // 18c: iload 5
      // 18e: ifeq 0dd
      // 191: iload 11
      // 193: iload 5
      // 195: ifne 20f
      // 198: iload 9
      // 19a: goto 1a1
      // 19d: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a0: athrow
      // 1a1: if_icmplt 1f5
      // 1a4: iload 10
      // 1a6: istore 7
      // 1a8: aload 0
      // 1a9: iload 1
      // 1aa: iload 2
      // 1ab: iload 10
      // 1ad: bipush 8
      // 1af: ishl
      // 1b0: iload 9
      // 1b2: ior
      // 1b3: invokespecial ylx.gfe (III)V
      // 1b6: bipush 0
      // 1b7: istore 12
      // 1b9: iload 12
      // 1bb: iload 9
      // 1bd: if_icmpge 1e7
      // 1c0: aload 0
      // 1c1: getfield ylx.lt7 Ljava/util/List;
      // 1c4: iload 7
      // 1c6: iload 12
      // 1c8: iadd
      // 1c9: bipush 0
      // 1ca: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1cd: invokeinterface java/util/List.set (ILjava/lang/Object;)Ljava/lang/Object; 3
      // 1d2: pop
      // 1d3: iinc 12 1
      // 1d6: iload 5
      // 1d8: ifne 1f0
      // 1db: iload 5
      // 1dd: ifeq 1b9
      // 1e0: goto 1e7
      // 1e3: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e6: athrow
      // 1e7: aload 0
      // 1e8: iload 7
      // 1ea: aload 3
      // 1eb: iload 4
      // 1ed: invokespecial ylx.y3e (I[BI)V
      // 1f0: iload 5
      // 1f2: ifeq 26a
      // 1f5: aload 0
      // 1f6: getfield ylx.ua3 Ljava/io/RandomAccessFile;
      // 1f9: aload 0
      // 1fa: getfield ylx.ua3 Ljava/io/RandomAccessFile;
      // 1fd: invokevirtual java/io/RandomAccessFile.length ()J
      // 200: invokevirtual java/io/RandomAccessFile.seek (J)V
      // 203: aload 0
      // 204: getfield ylx.lt7 Ljava/util/List;
      // 207: invokeinterface java/util/List.size ()I 1
      // 20c: istore 7
      // 20e: bipush 0
      // 20f: istore 12
      // 211: iload 12
      // 213: iload 9
      // 215: if_icmpge 244
      // 218: aload 0
      // 219: getfield ylx.ua3 Ljava/io/RandomAccessFile;
      // 21c: getstatic ylx._v8 [B
      // 21f: invokevirtual java/io/RandomAccessFile.write ([B)V
      // 222: aload 0
      // 223: getfield ylx.lt7 Ljava/util/List;
      // 226: bipush 0
      // 227: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 22a: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 22f: pop
      // 230: iinc 12 1
      // 233: iload 5
      // 235: ifne 25c
      // 238: iload 5
      // 23a: ifeq 211
      // 23d: goto 244
      // 240: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 243: athrow
      // 244: aload 0
      // 245: dup
      // 246: getfield ylx.z91 I
      // 249: sipush 4096
      // 24c: iload 9
      // 24e: imul
      // 24f: iadd
      // 250: putfield ylx.z91 I
      // 253: aload 0
      // 254: iload 7
      // 256: aload 3
      // 257: iload 4
      // 259: invokespecial ylx.y3e (I[BI)V
      // 25c: aload 0
      // 25d: iload 1
      // 25e: iload 2
      // 25f: iload 7
      // 261: bipush 8
      // 263: ishl
      // 264: iload 9
      // 266: ior
      // 267: invokespecial ylx.gfe (III)V
      // 26a: aload 0
      // 26b: iload 1
      // 26c: iload 2
      // 26d: invokestatic vr1.spw ()J
      // 270: ldc2_w 1000
      // 273: ldiv
      // 274: l2i
      // 275: invokespecial ylx.rl2 (III)V
      // 278: goto 282
      // 27b: astore 6
      // 27d: aload 6
      // 27f: invokevirtual java/io/IOException.printStackTrace ()V
      // 282: return
   }

   private void y3e(int var1, byte[] var2, int var3) {
      this.ua3.seek((long)(var1 * 4096));
      this.ua3.writeInt(var3 + 1);
      this.ua3.writeByte(2);
      this.ua3.write(var2, 0, var3);
   }

   private boolean gbi(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: iload 1
      // 05: iload 3
      // 06: ifeq 61
      // 09: iflt 59
      // 0c: goto 13
      // 0f: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: iload 1
      // 14: iload 3
      // 15: ifeq 61
      // 18: goto 1f
      // 1b: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e: athrow
      // 1f: bipush 32
      // 21: if_icmpge 59
      // 24: goto 2b
      // 27: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a: athrow
      // 2b: iload 2
      // 2c: iload 3
      // 2d: ifeq 61
      // 30: goto 37
      // 33: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36: athrow
      // 37: iflt 59
      // 3a: goto 41
      // 3d: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40: athrow
      // 41: iload 2
      // 42: iload 3
      // 43: ifeq 61
      // 46: goto 4d
      // 49: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4c: athrow
      // 4d: bipush 32
      // 4f: if_icmplt 64
      // 52: goto 59
      // 55: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 58: athrow
      // 59: bipush 1
      // 5a: goto 61
      // 5d: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 60: athrow
      // 61: goto 65
      // 64: bipush 0
      // 65: ireturn
   }

   private int o_s(int var1, int var2) {
      return this.t9u[var1 + var2 * 32];
   }

   public boolean yc7(int var1, int var2) {
      int var3 = t9d.b();

      try {
         int var10000 = this.o_s(var1, var2);
         if (var3 == 0) {
            return (boolean)var10000;
         }

         if (var10000 != 0) {
            return (boolean)1;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      return (boolean)0;
   }

   private void gfe(int var1, int var2, int var3) {
      this.t9u[var1 + var2 * 32] = var3;
      this.ua3.seek((long)((var1 + var2 * 32) * 4));
      this.ua3.writeInt(var3);
   }

   private void rl2(int var1, int var2, int var3) {
      this.yq0[var1 + var2 * 32] = var3;
      this.ua3.seek((long)(4096 + (var1 + var2 * 32) * 4));
      this.ua3.writeInt(var3);
   }

   public void ain() {
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
      // 05: getfield ylx.ua3 Ljava/io/RandomAccessFile;
      // 08: iload 1
      // 09: ifeq 21
      // 0c: ifnull 24
      // 0f: goto 16
      // 12: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield ylx.ua3 Ljava/io/RandomAccessFile;
      // 1a: goto 21
      // 1d: invokestatic ylx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: invokevirtual java/io/RandomAccessFile.close ()V
      // 24: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1555677232473747573L, 7719482764674031067L, MethodHandles.lookup().lookupClass()).a(204927874818258L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 110766883552074L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("øLø\u0089Û¥\u001b<".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
      _v8 = new byte[4096];
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
}
