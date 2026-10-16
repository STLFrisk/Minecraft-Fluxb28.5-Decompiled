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

public class w6s extends ar7 {
   public crk e95;
   public crk nic;
   public c_3 we7;
   public int kux;
   public int a5s;
   public int bfi;
   public int ql3;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public w6s() {
      long var1 = a ^ 103398328815178L;
      super(b<"t">(22722, 3523142107341823929L ^ var1), _aj.p3z, false, new j1s[0]);
      this.e95 = new crk(b<"t">(22432, 4359948667830210783L ^ var1), b<"t">(17081, 173581571011413444L ^ var1), 6.0F, 1.0F, 9.0F, 1.0F);
      this.nic = new crk(b<"t">(22432, 4359948667830210783L ^ var1), b<"t">(27337, 6413581401717058999L ^ var1), 14.0F, 1.0F, 20.0F, 0.5F);
      this.we7 = new c_3(
         b<"t">(22432, 4359948667830210783L ^ var1),
         b<"t">(24766, 1054090930248918984L ^ var1),
         b<"t">(23061, 514626320271580514L ^ var1),
         new String[]{b<"t">(27563, 5119454213925874899L ^ var1), b<"t">(23061, 514626320271580514L ^ var1)}
      );
   }

   @jev
   public void rvf(fz2 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic w6s.a J
      // 003: ldc2_w 139236568805892
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic t9d.c ()I
      // 00b: istore 4
      // 00d: getstatic uy1.al8 I
      // 010: sipush 315
      // 013: iload 4
      // 015: ifne 043
      // 018: if_icmpge 03d
      // 01b: goto 022
      // 01e: invokestatic w6s.a (Loov;)Loov;
      // 021: athrow
      // 022: sipush 24485
      // 025: ldc2_w 5026122590914995346
      // 028: lload 2
      // 029: lxor
      // 02a: invokedynamic t (IJ)Ljava/lang/String; bsm=w6s.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02f: nop
      // 030: invokestatic q0r.tq3 (Ljava/lang/String;)V
      // 033: aload 0
      // 034: bipush 0
      // 035: invokevirtual w6s.yse (Z)V
      // 038: return
      // 039: invokestatic w6s.a (Loov;)Loov;
      // 03c: athrow
      // 03d: aload 0
      // 03e: getfield w6s.kux I
      // 041: bipush 20
      // 043: iload 4
      // 045: ifne 075
      // 048: if_icmpge 063
      // 04b: goto 052
      // 04e: invokestatic w6s.a (Loov;)Loov;
      // 051: athrow
      // 052: aload 0
      // 053: dup
      // 054: getfield w6s.kux I
      // 057: bipush 1
      // 058: iadd
      // 059: putfield w6s.kux I
      // 05c: goto 063
      // 05f: invokestatic w6s.a (Loov;)Loov;
      // 062: athrow
      // 063: aload 0
      // 064: getfield w6s.kux I
      // 067: iload 4
      // 069: ifne 17e
      // 06c: bipush 20
      // 06e: goto 075
      // 071: invokestatic w6s.a (Loov;)Loov;
      // 074: athrow
      // 075: if_icmplt 17a
      // 078: getstatic w6s.ek1 Lc05;
      // 07b: getfield c05.vg8 Ll86;
      // 07e: invokevirtual l86.i55 ()F
      // 081: aload 0
      // 082: getfield w6s.nic Lcrk;
      // 085: invokevirtual crk.d7c ()Ljava/lang/Float;
      // 088: invokevirtual java/lang/Float.floatValue ()F
      // 08b: fcmpg
      // 08c: iload 4
      // 08e: ifne 17e
      // 091: goto 098
      // 094: invokestatic w6s.a (Loov;)Loov;
      // 097: athrow
      // 098: ifge 17a
      // 09b: goto 0a2
      // 09e: invokestatic w6s.a (Loov;)Loov;
      // 0a1: athrow
      // 0a2: getstatic w6s.ek1 Lc05;
      // 0a5: getfield c05.vg8 Ll86;
      // 0a8: getstatic mcs.kkg Lmcs;
      // 0ab: invokevirtual l86.cab (Lmcs;)Z
      // 0ae: iload 4
      // 0b0: ifne 101
      // 0b3: goto 0ba
      // 0b6: invokestatic w6s.a (Loov;)Loov;
      // 0b9: athrow
      // 0ba: ifne 0ef
      // 0bd: goto 0c4
      // 0c0: invokestatic w6s.a (Loov;)Loov;
      // 0c3: athrow
      // 0c4: aload 0
      // 0c5: getfield w6s.we7 Lc_3;
      // 0c8: sipush 20920
      // 0cb: ldc2_w 3015561672112728716
      // 0ce: lload 2
      // 0cf: lxor
      // 0d0: invokedynamic t (IJ)Ljava/lang/String; bsm=w6s.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d5: nop
      // 0d6: invokevirtual c_3.wyk (Ljava/lang/String;)Z
      // 0d9: iload 4
      // 0db: ifne 14e
      // 0de: goto 0e5
      // 0e1: invokestatic w6s.a (Loov;)Loov;
      // 0e4: athrow
      // 0e5: ifne 13b
      // 0e8: goto 0ef
      // 0eb: invokestatic w6s.a (Loov;)Loov;
      // 0ee: athrow
      // 0ef: getstatic w6s.ek1 Lc05;
      // 0f2: getfield c05.vg8 Ll86;
      // 0f5: invokevirtual l86._xk ()F
      // 0f8: fconst_0
      // 0f9: fcmpl
      // 0fa: goto 101
      // 0fd: invokestatic w6s.a (Loov;)Loov;
      // 100: athrow
      // 101: iload 4
      // 103: ifne 17e
      // 106: ifne 17a
      // 109: goto 110
      // 10c: invokestatic w6s.a (Loov;)Loov;
      // 10f: athrow
      // 110: aload 0
      // 111: getfield w6s.we7 Lc_3;
      // 114: sipush 15198
      // 117: ldc2_w 2812943715948658796
      // 11a: lload 2
      // 11b: lxor
      // 11c: invokedynamic t (IJ)Ljava/lang/String; bsm=w6s.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 121: nop
      // 122: invokevirtual c_3.wyk (Ljava/lang/String;)Z
      // 125: iload 4
      // 127: ifne 17e
      // 12a: goto 131
      // 12d: invokestatic w6s.a (Loov;)Loov;
      // 130: athrow
      // 131: ifeq 17a
      // 134: goto 13b
      // 137: invokestatic w6s.a (Loov;)Loov;
      // 13a: athrow
      // 13b: aload 0
      // 13c: aload 0
      // 13d: invokespecial w6s.oyr ()I
      // 140: putfield w6s.bfi I
      // 143: aload 0
      // 144: getfield w6s.bfi I
      // 147: goto 14e
      // 14a: invokestatic w6s.a (Loov;)Loov;
      // 14d: athrow
      // 14e: iload 4
      // 150: ifne 17e
      // 153: bipush -1
      // 154: if_icmpeq 17a
      // 157: goto 15e
      // 15a: invokestatic w6s.a (Loov;)Loov;
      // 15d: athrow
      // 15e: aload 0
      // 15f: aload 0
      // 160: getfield w6s.bfi I
      // 163: bipush 36
      // 165: isub
      // 166: putfield w6s.bfi I
      // 169: aload 0
      // 16a: bipush 0
      // 16b: putfield w6s.a5s I
      // 16e: aload 0
      // 16f: bipush 0
      // 170: putfield w6s.kux I
      // 173: goto 17a
      // 176: invokestatic w6s.a (Loov;)Loov;
      // 179: athrow
      // 17a: aload 0
      // 17b: getfield w6s.a5s I
      // 17e: iload 4
      // 180: ifne 198
      // 183: iflt 285
      // 186: goto 18d
      // 189: invokestatic w6s.a (Loov;)Loov;
      // 18c: athrow
      // 18d: aload 0
      // 18e: getfield w6s.bfi I
      // 191: goto 198
      // 194: invokestatic w6s.a (Loov;)Loov;
      // 197: athrow
      // 198: iload 4
      // 19a: ifne 1bc
      // 19d: iflt 285
      // 1a0: goto 1a7
      // 1a3: invokestatic w6s.a (Loov;)Loov;
      // 1a6: athrow
      // 1a7: aload 0
      // 1a8: dup
      // 1a9: getfield w6s.a5s I
      // 1ac: bipush 1
      // 1ad: iadd
      // 1ae: putfield w6s.a5s I
      // 1b1: aload 0
      // 1b2: getfield w6s.a5s I
      // 1b5: goto 1bc
      // 1b8: invokestatic w6s.a (Loov;)Loov;
      // 1bb: athrow
      // 1bc: bipush 1
      // 1bd: iload 4
      // 1bf: ifne 204
      // 1c2: if_icmpne 1f8
      // 1c5: goto 1cc
      // 1c8: invokestatic w6s.a (Loov;)Loov;
      // 1cb: athrow
      // 1cc: aload 0
      // 1cd: getstatic w6s.ek1 Lc05;
      // 1d0: getfield c05.vg8 Ll86;
      // 1d3: getfield l86.up_ Ljnq;
      // 1d6: getfield jnq.nb5 I
      // 1d9: putfield w6s.ql3 I
      // 1dc: getstatic w6s.ek1 Lc05;
      // 1df: getfield c05.vg8 Ll86;
      // 1e2: getfield l86.up_ Ljnq;
      // 1e5: aload 0
      // 1e6: getfield w6s.bfi I
      // 1e9: putfield jnq.nb5 I
      // 1ec: iload 4
      // 1ee: ifeq 285
      // 1f1: goto 1f8
      // 1f4: invokestatic w6s.a (Loov;)Loov;
      // 1f7: athrow
      // 1f8: aload 0
      // 1f9: getfield w6s.a5s I
      // 1fc: bipush 2
      // 1fd: goto 204
      // 200: invokestatic w6s.a (Loov;)Loov;
      // 203: athrow
      // 204: if_icmplt 285
      // 207: getstatic w6s.ek1 Lc05;
      // 20a: getfield c05.vg8 Ll86;
      // 20d: getfield l86.lq7 Lp_k;
      // 210: new net/minecraft/network/play/client/C08PacketPlayerBlockPlacement
      // 213: dup
      // 214: getstatic w6s.ek1 Lc05;
      // 217: getfield c05.vg8 Ll86;
      // 21a: getfield l86.up_ Ljnq;
      // 21d: invokevirtual jnq.dxs ()Lerg;
      // 220: invokespecial net/minecraft/network/play/client/C08PacketPlayerBlockPlacement.<init> (Lerg;)V
      // 223: invokevirtual p_k.sxi (Lmz2;)V
      // 226: getstatic w6s.ek1 Lc05;
      // 229: getfield c05.vg8 Ll86;
      // 22c: getfield l86.lq7 Lp_k;
      // 22f: new net/minecraft/network/play/client/C09PacketHeldItemChange
      // 232: dup
      // 233: aload 0
      // 234: getfield w6s.bfi I
      // 237: bipush 1
      // 238: iadd
      // 239: bipush 9
      // 23b: if_icmplt 24d
      // 23e: goto 245
      // 241: invokestatic w6s.a (Loov;)Loov;
      // 244: athrow
      // 245: bipush 0
      // 246: goto 253
      // 249: invokestatic w6s.a (Loov;)Loov;
      // 24c: athrow
      // 24d: aload 0
      // 24e: getfield w6s.bfi I
      // 251: bipush 1
      // 252: iadd
      // 253: invokespecial net/minecraft/network/play/client/C09PacketHeldItemChange.<init> (I)V
      // 256: invokevirtual p_k.sxi (Lmz2;)V
      // 259: getstatic w6s.ek1 Lc05;
      // 25c: getfield c05.vg8 Ll86;
      // 25f: getfield l86.lq7 Lp_k;
      // 262: new net/minecraft/network/play/client/C09PacketHeldItemChange
      // 265: dup
      // 266: aload 0
      // 267: getfield w6s.bfi I
      // 26a: invokespecial net/minecraft/network/play/client/C09PacketHeldItemChange.<init> (I)V
      // 26d: invokevirtual p_k.sxi (Lmz2;)V
      // 270: getstatic w6s.ek1 Lc05;
      // 273: getfield c05.vg8 Ll86;
      // 276: getfield l86.up_ Ljnq;
      // 279: aload 0
      // 27a: getfield w6s.ql3 I
      // 27d: putfield jnq.nb5 I
      // 280: aload 0
      // 281: bipush -1
      // 282: putfield w6s.a5s I
      // 285: return
   }

   private int oyr() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: bipush 36
      // 06: istore 2
      // 07: iload 2
      // 08: bipush 45
      // 0a: if_icmpge 5b
      // 0d: getstatic w6s.ek1 Lc05;
      // 10: getfield c05.vg8 Ll86;
      // 13: getfield l86.fv9 L_jc;
      // 16: iload 2
      // 17: invokevirtual _jc.ajr (I)Lvrx;
      // 1a: invokevirtual vrx.x4s ()Lerg;
      // 1d: astore 3
      // 1e: aload 3
      // 1f: invokevirtual erg.gn1 ()Lu7m;
      // 22: iload 1
      // 23: ifeq 45
      // 26: invokestatic amb.gjz (Lu7m;)Z
      // 29: iload 1
      // 2a: ifeq 5d
      // 2d: goto 34
      // 30: invokestatic w6s.a (Loov;)Loov;
      // 33: athrow
      // 34: ifeq 41
      // 37: goto 3e
      // 3a: invokestatic w6s.a (Loov;)Loov;
      // 3d: athrow
      // 3e: goto 54
      // 41: aload 3
      // 42: invokevirtual erg.gn1 ()Lu7m;
      // 45: getstatic xbr.yyh Lu7m;
      // 48: if_acmpeq 52
      // 4b: goto 54
      // 4e: invokestatic w6s.a (Loov;)Loov;
      // 51: athrow
      // 52: iload 2
      // 53: ireturn
      // 54: iinc 2 1
      // 57: iload 1
      // 58: ifne 07
      // 5b: bipush 9
      // 5d: istore 2
      // 5e: iload 2
      // 5f: bipush 36
      // 61: if_icmpge e3
      // 64: getstatic w6s.ek1 Lc05;
      // 67: getfield c05.vg8 Ll86;
      // 6a: getfield l86.fv9 L_jc;
      // 6d: iload 2
      // 6e: invokevirtual _jc.ajr (I)Lvrx;
      // 71: invokevirtual vrx.x4s ()Lerg;
      // 74: astore 3
      // 75: aload 3
      // 76: invokevirtual erg.gn1 ()Lu7m;
      // 79: iload 1
      // 7a: ifeq a7
      // 7d: invokestatic amb.gjz (Lu7m;)Z
      // 80: iload 1
      // 81: ifeq e4
      // 84: goto 8b
      // 87: invokestatic w6s.a (Loov;)Loov;
      // 8a: athrow
      // 8b: ifeq 98
      // 8e: goto 95
      // 91: invokestatic w6s.a (Loov;)Loov;
      // 94: athrow
      // 95: goto dc
      // 98: aload 3
      // 99: iload 1
      // 9a: ifeq db
      // 9d: invokevirtual erg.gn1 ()Lu7m;
      // a0: goto a7
      // a3: invokestatic w6s.a (Loov;)Loov;
      // a6: athrow
      // a7: getstatic xbr.yyh Lu7m;
      // aa: if_acmpeq b4
      // ad: goto dc
      // b0: invokestatic w6s.a (Loov;)Loov;
      // b3: athrow
      // b4: getstatic w6s.ek1 Lc05;
      // b7: getfield c05.l7q Lhh6;
      // ba: getstatic w6s.ek1 Lc05;
      // bd: getfield c05.vg8 Ll86;
      // c0: getfield l86.daw L_jc;
      // c3: getfield _jc.h7l I
      // c6: iload 2
      // c7: aload 0
      // c8: getfield w6s.e95 Lcrk;
      // cb: invokevirtual crk.d7c ()Ljava/lang/Float;
      // ce: invokevirtual java/lang/Float.intValue ()I
      // d1: bipush 2
      // d2: getstatic w6s.ek1 Lc05;
      // d5: getfield c05.vg8 Ll86;
      // d8: invokevirtual hh6.efg (IIIILha9;)Lerg;
      // db: pop
      // dc: iinc 2 1
      // df: iload 1
      // e0: ifne 5e
      // e3: bipush -1
      // e4: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(3496894710500498330L, -5140557809043095884L, MethodHandles.lookup().lookupClass()).a(259509457028560L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 15241409512671L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[10];
      int var7 = 0;
      String var6 = ";\u00138pº.TºÌ\u0087dÖ7s\u0018-\u0018!9R®\u0019æô!£\u009aÂ3hÐ\u008a2ñEàD \u0084Ì9 ¨\u0088£O\u0091û°0qEHê \u0097ø\u0082Í\u0012\u009a\u000eN\u009aà^æÁ°\u0014\u00040\u0081\u0090\u0010\u0003\u007fÖ\u009cY\u0000,\u001a%Ï\u0085\u0082Z·m1\u0010åÉ\u0095±äàèy\u0004\u0095\u0010\u0014§ÄRm Rl\u008f\nï\r¡\u001aGLzÕá\u008aá\u001bBÊò[s~?iO'\u0090ÇÏûÌ\u001a\u0010F¿ÙCÛ\u009dï;\u00161\u0083\u0015y\u0095s\u0012XÄû¾iýQiðM\u0086\u0087ÏÄ\n\u0084Ar*Æ\u009c\u0002B9¹¢\u00047±ºíasXbòrlÓ\n\u008e\u0005sYXì'w\u0005´U,À\r[CÄ[L\u0087\u0003\u001c}Öbv\tû\u0013\u0000$¥b\u0083×Ï5\u008enÈBF\u0017êß@°Jì";
      int var8 = ";\u00138pº.TºÌ\u0087dÖ7s\u0018-\u0018!9R®\u0019æô!£\u009aÂ3hÐ\u008a2ñEàD \u0084Ì9 ¨\u0088£O\u0091û°0qEHê \u0097ø\u0082Í\u0012\u009a\u000eN\u009aà^æÁ°\u0014\u00040\u0081\u0090\u0010\u0003\u007fÖ\u009cY\u0000,\u001a%Ï\u0085\u0082Z·m1\u0010åÉ\u0095±äàèy\u0004\u0095\u0010\u0014§ÄRm Rl\u008f\nï\r¡\u001aGLzÕá\u008aá\u001bBÊò[s~?iO'\u0090ÇÏûÌ\u001a\u0010F¿ÙCÛ\u009dï;\u00161\u0083\u0015y\u0095s\u0012XÄû¾iýQiðM\u0086\u0087ÏÄ\n\u0084Ar*Æ\u009c\u0002B9¹¢\u00047±ºíasXbòrlÓ\n\u008e\u0005sYXì'w\u0005´U,À\r[CÄ[L\u0087\u0003\u001c}Öbv\tû\u0013\u0000$¥b\u0083×Ï5\u008enÈBF\u0017êß@°Jì"
         .length();
      char var5 = 16;
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
                     f = var9;
                     g = new String[10];
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

                  var6 = "\u00868~0GÐ_²\u009bxßZ¤mwï\u000eý#»^ÙEÛ ½\u0099\u009dC`s_\u0014\u008f\u008c¡âûñðÐå÷_\u0013dú\u009a,[íaàû'ìc";
                  var8 = "\u00868~0GÐ_²\u009bxßZ¤mwï\u000eý#»^ÙEÛ ½\u0099\u009dC`s_\u0014\u008f\u008c¡âûñðÐå÷_\u0013dú\u009a,[íaàû'ìc".length();
                  var5 = 24;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static oov a(oov var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31103;
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
            throw new RuntimeException("w6s", var10);
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
         throw new RuntimeException("w6s" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
