import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class bmb extends bc_ {
   private static final long a;
   private static final String[] c;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public String xue() {
      long var1 = a ^ 29600733610450L;
      return b<"p">(15279, 568707811873750197L ^ var1);
   }

   @Override
   public int bag() {
      return 2;
   }

   @Override
   public String fm7(e7r var1) {
      long var2 = a ^ 22083490880852L;
      return b<"p">(31904, 4632840246944294713L ^ var2);
   }

   @Override
   public void l3z(e7r param1, String[] param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic bmb.a J
      // 003: ldc2_w 33983005963415
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic t9d.c ()I
      // 00b: istore 5
      // 00d: aload 2
      // 00e: arraylength
      // 00f: bipush 5
      // 010: if_icmpge 031
      // 013: new w57
      // 016: dup
      // 017: sipush 12232
      // 01a: ldc2_w 3001612930110463377
      // 01d: lload 3
      // 01e: lxor
      // 01f: invokedynamic p (IJ)Ljava/lang/String; bsm=bmb.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 024: nop
      // 025: bipush 0
      // 026: anewarray 35
      // 029: invokespecial w57.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 02c: athrow
      // 02d: invokestatic bmb.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 030: athrow
      // 031: aload 1
      // 032: aload 2
      // 033: bipush 0
      // 034: aaload
      // 035: ldc i2h
      // 037: nop
      // 038: invokestatic bmb.arm (Le7r;Ljava/lang/String;Ljava/lang/Class;)Li2h;
      // 03b: astore 6
      // 03d: aload 6
      // 03f: getfield i2h.o2v D
      // 042: aload 2
      // 043: bipush 1
      // 044: aaload
      // 045: bipush 0
      // 046: invokestatic bmb.d80 (DLjava/lang/String;Z)D
      // 049: dstore 7
      // 04b: aload 6
      // 04d: getfield i2h.kfp D
      // 050: aload 2
      // 051: bipush 2
      // 052: aaload
      // 053: bipush 0
      // 054: invokestatic bmb.d80 (DLjava/lang/String;Z)D
      // 057: dstore 9
      // 059: aload 6
      // 05b: getfield i2h.vbd D
      // 05e: aload 2
      // 05f: bipush 3
      // 060: aaload
      // 061: bipush 0
      // 062: invokestatic bmb.d80 (DLjava/lang/String;Z)D
      // 065: dstore 11
      // 067: new mew
      // 06a: dup
      // 06b: dload 7
      // 06d: dload 9
      // 06f: dload 11
      // 071: invokespecial mew.<init> (DDD)V
      // 074: astore 13
      // 076: bipush 4
      // 077: istore 14
      // 079: sipush 25690
      // 07c: ldc2_w 2196976388649604609
      // 07f: lload 3
      // 080: lxor
      // 081: invokedynamic p (IJ)Ljava/lang/String; bsm=bmb.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 086: nop
      // 087: iload 5
      // 089: ifne 197
      // 08c: aload 2
      // 08d: bipush 4
      // 08e: aaload
      // 08f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 092: ifeq 191
      // 095: goto 09c
      // 098: invokestatic bmb.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09b: athrow
      // 09c: aload 2
      // 09d: iload 5
      // 09f: ifne 192
      // 0a2: goto 0a9
      // 0a5: invokestatic bmb.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a8: athrow
      // 0a9: arraylength
      // 0aa: bipush 10
      // 0ac: if_icmple 191
      // 0af: goto 0b6
      // 0b2: invokestatic bmb.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b5: athrow
      // 0b6: aload 6
      // 0b8: invokevirtual i2h.qha ()Lt9d;
      // 0bb: astore 15
      // 0bd: dload 7
      // 0bf: aload 2
      // 0c0: bipush 5
      // 0c1: aaload
      // 0c2: bipush 0
      // 0c3: invokestatic bmb.d80 (DLjava/lang/String;Z)D
      // 0c6: dstore 16
      // 0c8: dload 9
      // 0ca: aload 2
      // 0cb: bipush 6
      // 0cd: aaload
      // 0ce: bipush 0
      // 0cf: invokestatic bmb.d80 (DLjava/lang/String;Z)D
      // 0d2: dstore 18
      // 0d4: dload 11
      // 0d6: aload 2
      // 0d7: bipush 7
      // 0d9: aaload
      // 0da: bipush 0
      // 0db: invokestatic bmb.d80 (DLjava/lang/String;Z)D
      // 0de: dstore 20
      // 0e0: aload 1
      // 0e1: aload 2
      // 0e2: bipush 8
      // 0e4: aaload
      // 0e5: invokestatic bmb.dde (Le7r;Ljava/lang/String;)Le0x;
      // 0e8: astore 22
      // 0ea: aload 2
      // 0eb: bipush 9
      // 0ed: aaload
      // 0ee: bipush -1
      // 0ef: bipush 15
      // 0f1: invokestatic bmb.fzm (Ljava/lang/String;II)I
      // 0f4: istore 23
      // 0f6: new mew
      // 0f9: dup
      // 0fa: dload 16
      // 0fc: dload 18
      // 0fe: dload 20
      // 100: invokespecial mew.<init> (DDD)V
      // 103: astore 24
      // 105: aload 15
      // 107: aload 24
      // 109: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 10c: astore 25
      // 10e: aload 25
      // 110: invokeinterface zfz.r_y ()Le0x; 1
      // 115: aload 22
      // 117: if_acmpne 156
      // 11a: iload 23
      // 11c: iload 5
      // 11e: ifne 18f
      // 121: goto 128
      // 124: invokestatic bmb.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 127: athrow
      // 128: iflt 18d
      // 12b: goto 132
      // 12e: invokestatic bmb.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 131: athrow
      // 132: aload 25
      // 134: invokeinterface zfz.r_y ()Le0x; 1
      // 139: aload 25
      // 13b: invokevirtual e0x.hvp (Lzfz;)I
      // 13e: iload 5
      // 140: ifne 18f
      // 143: goto 14a
      // 146: invokestatic bmb.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 149: athrow
      // 14a: iload 23
      // 14c: if_icmpeq 18d
      // 14f: goto 156
      // 152: invokestatic bmb.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 155: athrow
      // 156: new uvb
      // 159: dup
      // 15a: sipush 6595
      // 15d: ldc2_w 2490771739522182047
      // 160: lload 3
      // 161: lxor
      // 162: invokedynamic p (IJ)Ljava/lang/String; bsm=bmb.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 167: nop
      // 168: bipush 2
      // 169: anewarray 35
      // 16c: dup
      // 16d: bipush 0
      // 16e: sipush 22395
      // 171: ldc2_w 5542148555515421989
      // 174: lload 3
      // 175: lxor
      // 176: invokedynamic p (IJ)Ljava/lang/String; bsm=bmb.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17b: nop
      // 17c: aastore
      // 17d: dup
      // 17e: bipush 1
      // 17f: aload 6
      // 181: invokevirtual i2h.noc ()Ljava/lang/String;
      // 184: aastore
      // 185: invokespecial uvb.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 188: athrow
      // 189: invokestatic bmb.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18c: athrow
      // 18d: bipush 10
      // 18f: istore 14
      // 191: aload 2
      // 192: iload 14
      // 194: invokestatic bmb.cai ([Ljava/lang/String;I)Ljava/lang/String;
      // 197: astore 15
      // 199: new bmb$1
      // 19c: dup
      // 19d: aload 0
      // 19e: aload 6
      // 1a0: aload 1
      // 1a1: aload 13
      // 1a3: dload 7
      // 1a5: dload 9
      // 1a7: dload 11
      // 1a9: invokespecial bmb$1.<init> (Lbmb;Li2h;Le7r;Lmew;DDD)V
      // 1ac: astore 16
      // 1ae: invokestatic vr1._0v ()Lvr1;
      // 1b1: invokevirtual vr1.rns ()Lb9a;
      // 1b4: astore 17
      // 1b6: aload 17
      // 1b8: aload 16
      // 1ba: aload 15
      // 1bc: invokeinterface b9a.q2n (Le7r;Ljava/lang/String;)I 3
      // 1c1: istore 18
      // 1c3: iload 18
      // 1c5: bipush 1
      // 1c6: if_icmpge 1ec
      // 1c9: new uvb
      // 1cc: dup
      // 1cd: sipush 28882
      // 1d0: ldc2_w 6829256161735066255
      // 1d3: lload 3
      // 1d4: lxor
      // 1d5: invokedynamic p (IJ)Ljava/lang/String; bsm=bmb.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1da: nop
      // 1db: bipush 1
      // 1dc: anewarray 35
      // 1df: dup
      // 1e0: bipush 0
      // 1e1: aload 15
      // 1e3: aastore
      // 1e4: invokespecial uvb.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 1e7: athrow
      // 1e8: invokestatic bmb.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1eb: athrow
      // 1ec: goto 218
      // 1ef: astore 18
      // 1f1: new uvb
      // 1f4: dup
      // 1f5: sipush 16717
      // 1f8: ldc2_w 5937927908684493589
      // 1fb: lload 3
      // 1fc: lxor
      // 1fd: invokedynamic p (IJ)Ljava/lang/String; bsm=bmb.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 202: nop
      // 203: bipush 2
      // 204: anewarray 35
      // 207: dup
      // 208: bipush 0
      // 209: aload 15
      // 20b: aastore
      // 20c: dup
      // 20d: bipush 1
      // 20e: aload 6
      // 210: invokevirtual i2h.noc ()Ljava/lang/String;
      // 213: aastore
      // 214: invokespecial uvb.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 217: athrow
      // 218: return
   }

   @Override
   public List ggu(e7r param1, String[] param2, mew param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic bmb.a J
      // 003: ldc2_w 55107831654759
      // 006: lxor
      // 007: lstore 4
      // 009: invokestatic t9d.c ()I
      // 00c: istore 6
      // 00e: aload 2
      // 00f: arraylength
      // 010: bipush 1
      // 011: iload 6
      // 013: ifne 034
      // 016: if_icmpne 031
      // 019: goto 020
      // 01c: invokestatic bmb.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01f: athrow
      // 020: aload 2
      // 021: invokestatic vr1._0v ()Lvr1;
      // 024: invokevirtual vr1.p14 ()[Ljava/lang/String;
      // 027: invokestatic bmb.cqo ([Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;
      // 02a: goto 111
      // 02d: invokestatic bmb.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 030: athrow
      // 031: aload 2
      // 032: arraylength
      // 033: bipush 1
      // 034: iload 6
      // 036: ifne 06c
      // 039: if_icmple 069
      // 03c: goto 043
      // 03f: invokestatic bmb.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 042: athrow
      // 043: aload 2
      // 044: arraylength
      // 045: bipush 4
      // 046: iload 6
      // 048: ifne 06c
      // 04b: goto 052
      // 04e: invokestatic bmb.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 051: athrow
      // 052: if_icmpgt 069
      // 055: goto 05c
      // 058: invokestatic bmb.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05b: athrow
      // 05c: aload 2
      // 05d: bipush 1
      // 05e: aload 3
      // 05f: invokestatic bmb.aqt ([Ljava/lang/String;ILmew;)Ljava/util/List;
      // 062: goto 111
      // 065: invokestatic bmb.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 068: athrow
      // 069: aload 2
      // 06a: arraylength
      // 06b: bipush 5
      // 06c: iload 6
      // 06e: ifne 0dd
      // 071: if_icmple 0cd
      // 074: goto 07b
      // 077: invokestatic bmb.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07a: athrow
      // 07b: aload 2
      // 07c: arraylength
      // 07d: bipush 8
      // 07f: iload 6
      // 081: ifne 0dd
      // 084: goto 08b
      // 087: invokestatic bmb.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08a: athrow
      // 08b: if_icmpgt 0cd
      // 08e: goto 095
      // 091: invokestatic bmb.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 094: athrow
      // 095: sipush 22395
      // 098: ldc2_w 5542108468400732373
      // 09b: lload 4
      // 09d: lxor
      // 09e: invokedynamic p (IJ)Ljava/lang/String; bsm=bmb.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: nop
      // 0a4: aload 2
      // 0a5: bipush 4
      // 0a6: aaload
      // 0a7: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0aa: iload 6
      // 0ac: ifne 0cf
      // 0af: goto 0b6
      // 0b2: invokestatic bmb.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b5: athrow
      // 0b6: ifeq 0cd
      // 0b9: goto 0c0
      // 0bc: invokestatic bmb.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bf: athrow
      // 0c0: aload 2
      // 0c1: bipush 5
      // 0c2: aload 3
      // 0c3: invokestatic bmb.aqt ([Ljava/lang/String;ILmew;)Ljava/util/List;
      // 0c6: goto 111
      // 0c9: invokestatic bmb.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0cc: athrow
      // 0cd: aload 2
      // 0ce: arraylength
      // 0cf: iload 6
      // 0d1: ifne 0fc
      // 0d4: bipush 9
      // 0d6: goto 0dd
      // 0d9: invokestatic bmb.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0dc: athrow
      // 0dd: if_icmpne 110
      // 0e0: sipush 22395
      // 0e3: ldc2_w 5542108468400732373
      // 0e6: lload 4
      // 0e8: lxor
      // 0e9: invokedynamic p (IJ)Ljava/lang/String; bsm=bmb.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ee: nop
      // 0ef: aload 2
      // 0f0: bipush 4
      // 0f1: aaload
      // 0f2: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0f5: goto 0fc
      // 0f8: invokestatic bmb.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fb: athrow
      // 0fc: ifeq 110
      // 0ff: aload 2
      // 100: getstatic e0x.db8 Ljnv;
      // 103: invokevirtual jnv.kqi ()Ljava/util/Set;
      // 106: invokestatic bmb.d79 ([Ljava/lang/String;Ljava/util/Collection;)Ljava/util/List;
      // 109: goto 111
      // 10c: invokestatic bmb.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10f: athrow
      // 110: aconst_null
      // 111: areturn
   }

   @Override
   public boolean mp9(String[] var1, int var2) {
      int var3 = t9d.c();

      try {
         if (var3 != 0) {
            return (boolean)var2;
         }

         if (var2 == 0) {
            return (boolean)1;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      return (boolean)0;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1830093489020941341L, 4594820823671511922L, MethodHandles.lookup().lookupClass()).a(139468473775732L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 124935382712744L;
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
      String var6 = "àìt\u0085vLRä\u0087\u0080«\u0090D\u009an¦ð\u0011\u0011ÕÃÝâ\u0097@Ê\u008aih*Ðë,®/ï\u009b\u0005ðù\u009fY4wcáN\u0001³\u0092B½¤\u0087pÝKg¿¦çñîË(òq4a²\u0085CY2\u0082»\"E}î\u009f]}ßäóa\u0006ç!0U÷~\u009a_\u008cì\u009aS0\u0010ðc\u0012\u0010Ü\u0002\tD1\u007f\u008f\u0000\u0002X\u0000Y\u0089vl\u000b\u0010üÅ\u0084\u009c(\u009aÃeìê\u001c÷\u007ffFs(ßÃ7 Êû\u0097ÜpBã1Ô¹÷».?ÖØ\u0006:{\u008e\u009a¨%[\u0088\u00adýE`\u009d²\u0098Q9\u0015}(Â8\u0006;!«²c;\u0088æÜChA·\u0085\u0018ïf´\u0001³¿ùÔLì7\\\u0013æG%çAÄfÛñ";
      int var8 = "àìt\u0085vLRä\u0087\u0080«\u0090D\u009an¦ð\u0011\u0011ÕÃÝâ\u0097@Ê\u008aih*Ðë,®/ï\u009b\u0005ðù\u009fY4wcáN\u0001³\u0092B½¤\u0087pÝKg¿¦çñîË(òq4a²\u0085CY2\u0082»\"E}î\u009f]}ßäóa\u0006ç!0U÷~\u009a_\u008cì\u009aS0\u0010ðc\u0012\u0010Ü\u0002\tD1\u007f\u008f\u0000\u0002X\u0000Y\u0089vl\u000b\u0010üÅ\u0084\u009c(\u009aÃeìê\u001c÷\u007ffFs(ßÃ7 Êû\u0097ÜpBã1Ô¹÷».?ÖØ\u0006:{\u008e\u009a¨%[\u0088\u00adýE`\u009d²\u0098Q9\u0015}(Â8\u0006;!«²c;\u0088æÜChA·\u0085\u0018ïf´\u0001³¿ùÔLì7\\\u0013æG%çAÄfÛñ"
         .length();
      char var5 = '@';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     c = var9;
                     g = new String[8];
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

                  var6 = "ëëá\u0002ð\u001e×í\u0016ÒÑDu0¸\u0000(\u0016-?\u009d\u0084vw\u0010ß,º?`ð»íÄúÓÒ~ÔE\u001aI?I´%5Þ\u00012\u0015ûÑJ\u0081£v";
                  var8 = "ëëá\u0002ð\u001e×í\u0016ÒÑDu0¸\u0000(\u0016-?\u009d\u0084vw\u0010ß,º?`ð»íÄúÓÒ~ÔE\u001aI?I´%5Þ\u00012\u0015ûÑJ\u0081£v".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 7683;
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
            throw new RuntimeException("bmb", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
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
         throw new RuntimeException("bmb" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
