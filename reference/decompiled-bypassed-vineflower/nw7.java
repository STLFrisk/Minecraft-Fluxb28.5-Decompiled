import com.google.common.collect.Lists;
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

public class nw7 extends gbe {
   private final gbe sof;
   private final moh nvh;
   private final List a85 = Lists.newArrayList();
   private final List q5o = Lists.newArrayList();
   private String b2k;
   private String[] fw4;
   private nw7$ag0 yho;
   private gt4 d16;
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public nw7(gbe var1, moh var2) {
      this.sof = var1;
      this.nvh = var2;
   }

   @Override
   public void initGui() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic nw7.a J
      // 003: ldc2_w 72003900809997
      // 006: lxor
      // 007: lstore 1
      // 008: aload 0
      // 009: sipush 5547
      // 00c: ldc2_w 4132913568688353419
      // 00f: lload 1
      // 010: lxor
      // 011: invokedynamic j (IJ)Ljava/lang/String; bsm=nw7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 016: nop
      // 017: bipush 0
      // 018: anewarray 65
      // 01b: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 01e: putfield nw7.b2k Ljava/lang/String;
      // 021: invokestatic t9d.c ()I
      // 024: sipush 5051
      // 027: ldc2_w 2014751227498215069
      // 02a: lload 1
      // 02b: lxor
      // 02c: invokedynamic j (IJ)Ljava/lang/String; bsm=nw7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 031: nop
      // 032: bipush 0
      // 033: anewarray 65
      // 036: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 039: astore 4
      // 03b: istore 3
      // 03c: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 03f: astore 5
      // 041: aload 0
      // 042: getfield nw7.fex Lowt;
      // 045: aload 4
      // 047: aload 0
      // 048: getfield nw7.dt7 I
      // 04b: bipush 30
      // 04d: isub
      // 04e: invokevirtual owt.g8u (Ljava/lang/String;I)Ljava/util/List;
      // 051: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 056: astore 6
      // 058: aload 6
      // 05a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 05f: ifeq 087
      // 062: aload 6
      // 064: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 069: checkcast java/lang/String
      // 06c: astore 7
      // 06e: aload 5
      // 070: aload 7
      // 072: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 077: pop
      // 078: iload 3
      // 079: ifne 126
      // 07c: iload 3
      // 07d: ifeq 058
      // 080: goto 087
      // 083: invokestatic nw7.a (Loov;)Loov;
      // 086: athrow
      // 087: aload 0
      // 088: aload 5
      // 08a: aload 5
      // 08c: invokeinterface java/util/List.size ()I 1
      // 091: anewarray 1
      // 094: invokeinterface java/util/List.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 099: checkcast [Ljava/lang/String;
      // 09c: checkcast [Ljava/lang/String;
      // 09f: putfield nw7.fw4 [Ljava/lang/String;
      // 0a2: aload 0
      // 0a3: getfield nw7.a85 Ljava/util/List;
      // 0a6: invokeinterface java/util/List.clear ()V 1
      // 0ab: aload 0
      // 0ac: getfield nw7.q5o Ljava/util/List;
      // 0af: invokeinterface java/util/List.clear ()V 1
      // 0b4: aload 0
      // 0b5: getfield nw7.khf Ljava/util/List;
      // 0b8: aload 0
      // 0b9: new gt4
      // 0bc: dup
      // 0bd: bipush 1
      // 0be: aload 0
      // 0bf: getfield nw7.dt7 I
      // 0c2: bipush 2
      // 0c3: idiv
      // 0c4: sipush 152
      // 0c7: isub
      // 0c8: aload 0
      // 0c9: getfield nw7.o1e I
      // 0cc: bipush 30
      // 0ce: isub
      // 0cf: sipush 150
      // 0d2: bipush 20
      // 0d4: aload 0
      // 0d5: getfield nw7.nvh Lmoh;
      // 0d8: getstatic moh$_ru.g8q Lmoh$_ru;
      // 0db: invokevirtual moh.ycx (Lmoh$_ru;)Ljava/lang/String;
      // 0de: invokespecial gt4.<init> (IIIIILjava/lang/String;)V
      // 0e1: dup_x1
      // 0e2: putfield nw7.d16 Lgt4;
      // 0e5: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0ea: pop
      // 0eb: aload 0
      // 0ec: getfield nw7.khf Ljava/util/List;
      // 0ef: new gt4
      // 0f2: dup
      // 0f3: bipush 2
      // 0f4: aload 0
      // 0f5: getfield nw7.dt7 I
      // 0f8: bipush 2
      // 0f9: idiv
      // 0fa: bipush 2
      // 0fb: iadd
      // 0fc: aload 0
      // 0fd: getfield nw7.o1e I
      // 100: bipush 30
      // 102: isub
      // 103: sipush 150
      // 106: bipush 20
      // 108: sipush 24464
      // 10b: ldc2_w 777606151933786805
      // 10e: lload 1
      // 10f: lxor
      // 110: invokedynamic j (IJ)Ljava/lang/String; bsm=nw7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 115: nop
      // 116: bipush 0
      // 117: anewarray 65
      // 11a: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 11d: invokespecial gt4.<init> (IIIIILjava/lang/String;)V
      // 120: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 125: pop
      // 126: aload 0
      // 127: getfield nw7.f41 Lc05;
      // 12a: invokevirtual c05.et4 ()Liq7;
      // 12d: iload 3
      // 12e: ifne 149
      // 131: ifnull 157
      // 134: goto 13b
      // 137: invokestatic nw7.a (Loov;)Loov;
      // 13a: athrow
      // 13b: aload 0
      // 13c: getfield nw7.f41 Lc05;
      // 13f: invokevirtual c05.et4 ()Liq7;
      // 142: goto 149
      // 145: invokestatic nw7.a (Loov;)Loov;
      // 148: athrow
      // 149: invokevirtual iq7.jmi ()Lekz;
      // 14c: ifnull 157
      // 14f: bipush 1
      // 150: goto 158
      // 153: invokestatic nw7.a (Loov;)Loov;
      // 156: athrow
      // 157: bipush 0
      // 158: istore 6
      // 15a: new java/util/TreeMap
      // 15d: dup
      // 15e: aload 0
      // 15f: getfield nw7.f41 Lc05;
      // 162: invokevirtual c05.e2z ()Lekz;
      // 165: invokevirtual ekz.cph ()Ljava/util/Map;
      // 168: invokespecial java/util/TreeMap.<init> (Ljava/util/Map;)V
      // 16b: invokevirtual java/util/TreeMap.entrySet ()Ljava/util/Set;
      // 16e: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 173: astore 7
      // 175: aload 7
      // 177: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 17c: ifeq 1fe
      // 17f: aload 7
      // 181: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 186: checkcast java/util/Map$Entry
      // 189: astore 8
      // 18b: aload 0
      // 18c: getfield nw7.a85 Ljava/util/List;
      // 18f: new java/lang/StringBuilder
      // 192: dup
      // 193: invokespecial java/lang/StringBuilder.<init> ()V
      // 196: iload 3
      // 197: ifne 260
      // 19a: iload 6
      // 19c: ifeq 1bb
      // 19f: goto 1a6
      // 1a2: invokestatic nw7.a (Loov;)Loov;
      // 1a5: athrow
      // 1a6: sipush 10502
      // 1a9: ldc2_w 6994407227445283874
      // 1ac: lload 1
      // 1ad: lxor
      // 1ae: invokedynamic j (IJ)Ljava/lang/String; bsm=nw7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b3: nop
      // 1b4: goto 1be
      // 1b7: invokestatic nw7.a (Loov;)Loov;
      // 1ba: athrow
      // 1bb: ldc ""
      // 1bd: nop
      // 1be: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c1: aload 8
      // 1c3: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 1c8: checkcast java/lang/String
      // 1cb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ce: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1d1: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1d6: pop
      // 1d7: aload 0
      // 1d8: getfield nw7.q5o Ljava/util/List;
      // 1db: aload 0
      // 1dc: getfield nw7.fex Lowt;
      // 1df: aload 8
      // 1e1: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 1e6: checkcast java/lang/String
      // 1e9: aload 0
      // 1ea: getfield nw7.dt7 I
      // 1ed: sipush 220
      // 1f0: isub
      // 1f1: invokevirtual owt.fl6 (Ljava/lang/String;I)Ljava/lang/String;
      // 1f4: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1f9: pop
      // 1fa: iload 3
      // 1fb: ifeq 175
      // 1fe: iload 6
      // 200: ifeq 29b
      // 203: new java/util/TreeMap
      // 206: dup
      // 207: aload 0
      // 208: getfield nw7.f41 Lc05;
      // 20b: invokevirtual c05.et4 ()Liq7;
      // 20e: invokevirtual iq7.jmi ()Lekz;
      // 211: invokevirtual ekz.cph ()Ljava/util/Map;
      // 214: invokespecial java/util/TreeMap.<init> (Ljava/util/Map;)V
      // 217: invokevirtual java/util/TreeMap.entrySet ()Ljava/util/Set;
      // 21a: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 21f: astore 7
      // 221: aload 7
      // 223: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 228: ifeq 29b
      // 22b: aload 7
      // 22d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 232: checkcast java/util/Map$Entry
      // 235: astore 8
      // 237: aload 0
      // 238: getfield nw7.a85 Ljava/util/List;
      // 23b: new java/lang/StringBuilder
      // 23e: dup
      // 23f: invokespecial java/lang/StringBuilder.<init> ()V
      // 242: sipush 11311
      // 245: ldc2_w 8067615624456931592
      // 248: lload 1
      // 249: lxor
      // 24a: invokedynamic j (IJ)Ljava/lang/String; bsm=nw7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24f: nop
      // 250: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 253: aload 8
      // 255: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 25a: checkcast java/lang/String
      // 25d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 260: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 263: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 268: pop
      // 269: aload 0
      // 26a: getfield nw7.q5o Ljava/util/List;
      // 26d: aload 0
      // 26e: getfield nw7.fex Lowt;
      // 271: aload 8
      // 273: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 278: checkcast java/lang/String
      // 27b: aload 0
      // 27c: getfield nw7.dt7 I
      // 27f: sipush 220
      // 282: isub
      // 283: invokevirtual owt.fl6 (Ljava/lang/String;I)Ljava/lang/String;
      // 286: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 28b: pop
      // 28c: iload 3
      // 28d: ifne 2a7
      // 290: iload 3
      // 291: ifeq 221
      // 294: goto 29b
      // 297: invokestatic nw7.a (Loov;)Loov;
      // 29a: athrow
      // 29b: aload 0
      // 29c: new nw7$ag0
      // 29f: dup
      // 2a0: aload 0
      // 2a1: invokespecial nw7$ag0.<init> (Lnw7;)V
      // 2a4: putfield nw7.yho Lnw7$ag0;
      // 2a7: return
   }

   @Override
   public void handleMouseInput() {
      super.handleMouseInput();
      this.yho.gzb();
   }

   @Override
   public void actionPerformed(gt4 param1) {
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
      // 05: getfield gt4.c9a Z
      // 08: iload 2
      // 09: ifeq 21
      // 0c: ifeq 86
      // 0f: goto 16
      // 12: invokestatic nw7.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: getfield gt4._me I
      // 1a: goto 21
      // 1d: invokestatic nw7.a (Loov;)Loov;
      // 20: athrow
      // 21: bipush 2
      // 22: iload 2
      // 23: ifeq 60
      // 26: if_icmpne 50
      // 29: goto 30
      // 2c: invokestatic nw7.a (Loov;)Loov;
      // 2f: athrow
      // 30: aload 0
      // 31: getfield nw7.nvh Lmoh;
      // 34: invokevirtual moh.cmo ()V
      // 37: aload 0
      // 38: getfield nw7.nvh Lmoh;
      // 3b: invokevirtual moh.cmo ()V
      // 3e: aload 0
      // 3f: getfield nw7.f41 Lc05;
      // 42: aload 0
      // 43: getfield nw7.sof Lgbe;
      // 46: invokevirtual c05.z2i (Lgbe;)V
      // 49: goto 50
      // 4c: invokestatic nw7.a (Loov;)Loov;
      // 4f: athrow
      // 50: aload 1
      // 51: iload 2
      // 52: ifeq 79
      // 55: getfield gt4._me I
      // 58: bipush 1
      // 59: goto 60
      // 5c: invokestatic nw7.a (Loov;)Loov;
      // 5f: athrow
      // 60: if_icmpne 86
      // 63: aload 0
      // 64: getfield nw7.nvh Lmoh;
      // 67: getstatic moh$_ru.g8q Lmoh$_ru;
      // 6a: bipush 1
      // 6b: invokevirtual moh.d13 (Lmoh$_ru;I)V
      // 6e: aload 0
      // 6f: getfield nw7.d16 Lgt4;
      // 72: goto 79
      // 75: invokestatic nw7.a (Loov;)Loov;
      // 78: athrow
      // 79: aload 0
      // 7a: getfield nw7.nvh Lmoh;
      // 7d: getstatic moh$_ru.g8q Lmoh$_ru;
      // 80: invokevirtual moh.ycx (Lmoh$_ru;)Ljava/lang/String;
      // 83: putfield gt4.frg Ljava/lang/String;
      // 86: return
   }

   @Override
   public void drawScreen(int var1, int var2, float var3) {
      this.xmz();
      this.yho.j46(var1, var2, var3);
      this.poi(this.fex, this.b2k, this.dt7 / 2, 8, 16777215);
      int var10000 = t9d.b();
      int var5 = 22;
      String[] var6 = this.fw4;
      int var7 = var6.length;
      int var8 = 0;
      int var4 = var10000;

      while (true) {
         if (var8 < var7) {
            String var9 = var6[var8];
            this.poi(this.fex, var9, this.dt7 / 2, var5, 8421504);
            var5 += this.fex.rr7;

            try {
               var8++;
               if (var4 == 0) {
                  break;
               }

               if (var4 != 0) {
                  continue;
               }
            } catch (oov var10) {
               throw a(var10);
            }
         }

         super.drawScreen(var1, var2, var3);
         break;
      }
   }

   public static List tcq(nw7 var0) {
      return var0.a85;
   }

   public static List cyb(nw7 var0) {
      return var0.q5o;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(6830839141391123936L, -6797031297581112764L, MethodHandles.lookup().lookupClass()).a(179765693227666L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 4254595354742L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[5];
      int var7 = 0;
      String var6 = "\u0013)%Æ»X\u008bOßc ¸ö\u009c75\u0018\u000e@\u0002q×\u0093\u0090<d\u008f\u0093æ6|£D¯\u008f\u0097s`,-I(k#\u0090\u0097Ü\u0007üªá\u000eeÃî\u001fxÑ¦\u0016 ¿\u0015G\u008bÜ\u001fV;¡ãó$\u0097\u0005ïÍúÛV\nl";
      int var8 = "\u0013)%Æ»X\u008bOßc ¸ö\u009c75\u0018\u000e@\u0002q×\u0093\u0090<d\u008f\u0093æ6|£D¯\u008f\u0097s`,-I(k#\u0090\u0097Ü\u0007üªá\u000eeÃî\u001fxÑ¦\u0016 ¿\u0015G\u008bÜ\u001fV;¡ãó$\u0097\u0005ïÍúÛV\nl"
         .length();
      char var5 = 16;
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
                     g = new String[5];
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

                  var6 = "-&7ËÌÓá0ìP{\u00ade³\u0002¯(¤Å¦\u009d\u008ayU{ã\u0018\u008e®\u001c\u001eþ|ÞN\u0099¥èäÇ®2BÊ@\u0096ÏêÉ\u0015Æ\u0089<ÎºÍÏ";
                  var8 = "-&7ËÌÓá0ìP{\u00ade³\u0002¯(¤Å¦\u009d\u008ayU{ã\u0018\u008e®\u001c\u001eþ|ÞN\u0099¥èäÇ®2BÊ@\u0096ÏêÉ\u0015Æ\u0089<ÎºÍÏ".length();
                  var5 = 16;
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 24105;
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
            throw new RuntimeException("nw7", var10);
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
         g[var5] = a(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("nw7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
