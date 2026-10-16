import java.awt.Color;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;

public class mkt {
   public static void zxh(float var0, float var1, float var2, float var3) {
      int var4 = z49();
      GL11.glEnable(3089);
      GL11.glScissor((int)(var0 * (float)var4), (int)((float)Display.getHeight() - var1 * (float)var4), (int)(var2 * (float)var4), (int)(var3 * (float)var4));
   }

   public static void huv(float var0, float var1, float var2, float var3) {
      int var4 = z49();
      GL11.glEnable(3089);
      GL11.glScissor((int)(var0 * (float)var4), (int)((float)Display.getHeight() - var1 * (float)var4), (int)(var2 * (float)var4), (int)(var3 * (float)var4));
   }

   public static void dkk() {
      GL11.glDisable(3089);
   }

   public static void y93(double var0, double var2, double var4, double var6, double var8, double var10, int var12) {
      t97(var0, var2, var4, var6, var8, var10, var12, true);
   }

   public static void t97(double var0, double var2, double var4, double var6, double var8, double var10, int var12, boolean var13) {
      bta(var13);
      v_1(var12);
      GL11.glBegin(1);
      GL11.glVertex3d(var0, var2, var4);
      GL11.glVertex3d(var6, var8, var10);
      GL11.glEnd();
      fba(var13);
   }

   public static void dit(double var0, double var2, double var4, double var6, float var8, int var9) {
      n1k();
      v_1(var9);
      GL11.glLineWidth(var8);
      GL11.glBegin(1);
      GL11.glVertex2d(var0, var2);
      GL11.glVertex2d(var4, var6);
      GL11.glEnd();
      o9i();
   }

   public static void xm0(int var0, int var1, float var2, int var3) {
      n1k();
      v_1(var3);
      GL11.glPointSize(var2);
      GL11.glEnable(2832);
      GL11.glBegin(0);
      GL11.glVertex2d((double)var0, (double)var1);
      GL11.glEnd();
      GL11.glDisable(2832);
      o9i();
   }

   public static int z49() {
      eka var0 = new eka(Minecraft.vz1());
      return var0._0s();
   }

   public static void gy2(nh4 var0, int var1) {
      b9s(var0, var1, true);
   }

   public static void b9s(nh4 param0, int param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 3
      // 004: aload 0
      // 005: iload 3
      // 006: ifeq 134
      // 009: ifnull 149
      // 00c: goto 013
      // 00f: invokestatic mkt.a (Loov;)Loov;
      // 012: athrow
      // 013: iload 2
      // 014: invokestatic mkt.bta (Z)V
      // 017: iload 1
      // 018: invokestatic mkt.v_1 (I)V
      // 01b: bipush 3
      // 01c: invokestatic org/lwjgl/opengl/GL11.glBegin (I)V
      // 01f: aload 0
      // 020: getfield nh4.rlc D
      // 023: aload 0
      // 024: getfield nh4.bx_ D
      // 027: aload 0
      // 028: getfield nh4.t8n D
      // 02b: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 02e: aload 0
      // 02f: getfield nh4.t_2 D
      // 032: aload 0
      // 033: getfield nh4.bx_ D
      // 036: aload 0
      // 037: getfield nh4.t8n D
      // 03a: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 03d: aload 0
      // 03e: getfield nh4.t_2 D
      // 041: aload 0
      // 042: getfield nh4.bx_ D
      // 045: aload 0
      // 046: getfield nh4.oqj D
      // 049: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 04c: aload 0
      // 04d: getfield nh4.rlc D
      // 050: aload 0
      // 051: getfield nh4.bx_ D
      // 054: aload 0
      // 055: getfield nh4.oqj D
      // 058: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 05b: aload 0
      // 05c: getfield nh4.rlc D
      // 05f: aload 0
      // 060: getfield nh4.bx_ D
      // 063: aload 0
      // 064: getfield nh4.t8n D
      // 067: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 06a: invokestatic org/lwjgl/opengl/GL11.glEnd ()V
      // 06d: bipush 3
      // 06e: invokestatic org/lwjgl/opengl/GL11.glBegin (I)V
      // 071: aload 0
      // 072: getfield nh4.rlc D
      // 075: aload 0
      // 076: getfield nh4.i2c D
      // 079: aload 0
      // 07a: getfield nh4.t8n D
      // 07d: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 080: aload 0
      // 081: getfield nh4.t_2 D
      // 084: aload 0
      // 085: getfield nh4.i2c D
      // 088: aload 0
      // 089: getfield nh4.t8n D
      // 08c: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 08f: aload 0
      // 090: getfield nh4.t_2 D
      // 093: aload 0
      // 094: getfield nh4.i2c D
      // 097: aload 0
      // 098: getfield nh4.oqj D
      // 09b: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 09e: aload 0
      // 09f: getfield nh4.rlc D
      // 0a2: aload 0
      // 0a3: getfield nh4.i2c D
      // 0a6: aload 0
      // 0a7: getfield nh4.oqj D
      // 0aa: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 0ad: aload 0
      // 0ae: getfield nh4.rlc D
      // 0b1: aload 0
      // 0b2: getfield nh4.i2c D
      // 0b5: aload 0
      // 0b6: getfield nh4.t8n D
      // 0b9: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 0bc: invokestatic org/lwjgl/opengl/GL11.glEnd ()V
      // 0bf: bipush 1
      // 0c0: invokestatic org/lwjgl/opengl/GL11.glBegin (I)V
      // 0c3: aload 0
      // 0c4: getfield nh4.rlc D
      // 0c7: aload 0
      // 0c8: getfield nh4.bx_ D
      // 0cb: aload 0
      // 0cc: getfield nh4.t8n D
      // 0cf: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 0d2: aload 0
      // 0d3: getfield nh4.rlc D
      // 0d6: aload 0
      // 0d7: getfield nh4.i2c D
      // 0da: aload 0
      // 0db: getfield nh4.t8n D
      // 0de: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 0e1: aload 0
      // 0e2: getfield nh4.t_2 D
      // 0e5: aload 0
      // 0e6: getfield nh4.bx_ D
      // 0e9: aload 0
      // 0ea: getfield nh4.t8n D
      // 0ed: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 0f0: aload 0
      // 0f1: getfield nh4.t_2 D
      // 0f4: aload 0
      // 0f5: getfield nh4.i2c D
      // 0f8: aload 0
      // 0f9: getfield nh4.t8n D
      // 0fc: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 0ff: aload 0
      // 100: getfield nh4.t_2 D
      // 103: aload 0
      // 104: getfield nh4.bx_ D
      // 107: aload 0
      // 108: getfield nh4.oqj D
      // 10b: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 10e: aload 0
      // 10f: getfield nh4.t_2 D
      // 112: aload 0
      // 113: getfield nh4.i2c D
      // 116: aload 0
      // 117: getfield nh4.oqj D
      // 11a: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 11d: aload 0
      // 11e: getfield nh4.rlc D
      // 121: aload 0
      // 122: getfield nh4.bx_ D
      // 125: aload 0
      // 126: getfield nh4.oqj D
      // 129: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 12c: aload 0
      // 12d: goto 134
      // 130: invokestatic mkt.a (Loov;)Loov;
      // 133: athrow
      // 134: getfield nh4.rlc D
      // 137: aload 0
      // 138: getfield nh4.i2c D
      // 13b: aload 0
      // 13c: getfield nh4.oqj D
      // 13f: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 142: invokestatic org/lwjgl/opengl/GL11.glEnd ()V
      // 145: iload 2
      // 146: invokestatic mkt.fba (Z)V
      // 149: return
   }

   public static void d3i(nh4 var0, int var1) {
      s19(var0, var1, true);
   }

   public static void s19(nh4 param0, int param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 3
      // 004: aload 0
      // 005: iload 3
      // 006: ifne 341
      // 009: ifnull 356
      // 00c: goto 013
      // 00f: invokestatic mkt.a (Loov;)Loov;
      // 012: athrow
      // 013: iload 2
      // 014: invokestatic mkt.bta (Z)V
      // 017: iload 1
      // 018: invokestatic mkt.v_1 (I)V
      // 01b: bipush 7
      // 01d: invokestatic org/lwjgl/opengl/GL11.glBegin (I)V
      // 020: aload 0
      // 021: getfield nh4.rlc D
      // 024: aload 0
      // 025: getfield nh4.bx_ D
      // 028: aload 0
      // 029: getfield nh4.oqj D
      // 02c: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 02f: aload 0
      // 030: getfield nh4.t_2 D
      // 033: aload 0
      // 034: getfield nh4.bx_ D
      // 037: aload 0
      // 038: getfield nh4.oqj D
      // 03b: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 03e: aload 0
      // 03f: getfield nh4.t_2 D
      // 042: aload 0
      // 043: getfield nh4.i2c D
      // 046: aload 0
      // 047: getfield nh4.oqj D
      // 04a: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 04d: aload 0
      // 04e: getfield nh4.rlc D
      // 051: aload 0
      // 052: getfield nh4.i2c D
      // 055: aload 0
      // 056: getfield nh4.oqj D
      // 059: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 05c: invokestatic org/lwjgl/opengl/GL11.glEnd ()V
      // 05f: bipush 7
      // 061: invokestatic org/lwjgl/opengl/GL11.glBegin (I)V
      // 064: aload 0
      // 065: getfield nh4.t_2 D
      // 068: aload 0
      // 069: getfield nh4.bx_ D
      // 06c: aload 0
      // 06d: getfield nh4.oqj D
      // 070: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 073: aload 0
      // 074: getfield nh4.rlc D
      // 077: aload 0
      // 078: getfield nh4.bx_ D
      // 07b: aload 0
      // 07c: getfield nh4.oqj D
      // 07f: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 082: aload 0
      // 083: getfield nh4.rlc D
      // 086: aload 0
      // 087: getfield nh4.i2c D
      // 08a: aload 0
      // 08b: getfield nh4.oqj D
      // 08e: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 091: aload 0
      // 092: getfield nh4.t_2 D
      // 095: aload 0
      // 096: getfield nh4.i2c D
      // 099: aload 0
      // 09a: getfield nh4.oqj D
      // 09d: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 0a0: invokestatic org/lwjgl/opengl/GL11.glEnd ()V
      // 0a3: bipush 7
      // 0a5: invokestatic org/lwjgl/opengl/GL11.glBegin (I)V
      // 0a8: aload 0
      // 0a9: getfield nh4.rlc D
      // 0ac: aload 0
      // 0ad: getfield nh4.bx_ D
      // 0b0: aload 0
      // 0b1: getfield nh4.t8n D
      // 0b4: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 0b7: aload 0
      // 0b8: getfield nh4.rlc D
      // 0bb: aload 0
      // 0bc: getfield nh4.bx_ D
      // 0bf: aload 0
      // 0c0: getfield nh4.oqj D
      // 0c3: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 0c6: aload 0
      // 0c7: getfield nh4.rlc D
      // 0ca: aload 0
      // 0cb: getfield nh4.i2c D
      // 0ce: aload 0
      // 0cf: getfield nh4.oqj D
      // 0d2: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 0d5: aload 0
      // 0d6: getfield nh4.rlc D
      // 0d9: aload 0
      // 0da: getfield nh4.i2c D
      // 0dd: aload 0
      // 0de: getfield nh4.t8n D
      // 0e1: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 0e4: invokestatic org/lwjgl/opengl/GL11.glEnd ()V
      // 0e7: bipush 7
      // 0e9: invokestatic org/lwjgl/opengl/GL11.glBegin (I)V
      // 0ec: aload 0
      // 0ed: getfield nh4.rlc D
      // 0f0: aload 0
      // 0f1: getfield nh4.bx_ D
      // 0f4: aload 0
      // 0f5: getfield nh4.oqj D
      // 0f8: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 0fb: aload 0
      // 0fc: getfield nh4.rlc D
      // 0ff: aload 0
      // 100: getfield nh4.bx_ D
      // 103: aload 0
      // 104: getfield nh4.t8n D
      // 107: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 10a: aload 0
      // 10b: getfield nh4.rlc D
      // 10e: aload 0
      // 10f: getfield nh4.i2c D
      // 112: aload 0
      // 113: getfield nh4.t8n D
      // 116: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 119: aload 0
      // 11a: getfield nh4.rlc D
      // 11d: aload 0
      // 11e: getfield nh4.i2c D
      // 121: aload 0
      // 122: getfield nh4.oqj D
      // 125: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 128: invokestatic org/lwjgl/opengl/GL11.glEnd ()V
      // 12b: bipush 7
      // 12d: invokestatic org/lwjgl/opengl/GL11.glBegin (I)V
      // 130: aload 0
      // 131: getfield nh4.t_2 D
      // 134: aload 0
      // 135: getfield nh4.bx_ D
      // 138: aload 0
      // 139: getfield nh4.oqj D
      // 13c: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 13f: aload 0
      // 140: getfield nh4.t_2 D
      // 143: aload 0
      // 144: getfield nh4.bx_ D
      // 147: aload 0
      // 148: getfield nh4.t8n D
      // 14b: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 14e: aload 0
      // 14f: getfield nh4.t_2 D
      // 152: aload 0
      // 153: getfield nh4.i2c D
      // 156: aload 0
      // 157: getfield nh4.t8n D
      // 15a: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 15d: aload 0
      // 15e: getfield nh4.t_2 D
      // 161: aload 0
      // 162: getfield nh4.i2c D
      // 165: aload 0
      // 166: getfield nh4.oqj D
      // 169: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 16c: invokestatic org/lwjgl/opengl/GL11.glEnd ()V
      // 16f: bipush 7
      // 171: invokestatic org/lwjgl/opengl/GL11.glBegin (I)V
      // 174: aload 0
      // 175: getfield nh4.t_2 D
      // 178: aload 0
      // 179: getfield nh4.bx_ D
      // 17c: aload 0
      // 17d: getfield nh4.t8n D
      // 180: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 183: aload 0
      // 184: getfield nh4.t_2 D
      // 187: aload 0
      // 188: getfield nh4.bx_ D
      // 18b: aload 0
      // 18c: getfield nh4.oqj D
      // 18f: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 192: aload 0
      // 193: getfield nh4.t_2 D
      // 196: aload 0
      // 197: getfield nh4.i2c D
      // 19a: aload 0
      // 19b: getfield nh4.oqj D
      // 19e: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 1a1: aload 0
      // 1a2: getfield nh4.t_2 D
      // 1a5: aload 0
      // 1a6: getfield nh4.i2c D
      // 1a9: aload 0
      // 1aa: getfield nh4.t8n D
      // 1ad: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 1b0: invokestatic org/lwjgl/opengl/GL11.glEnd ()V
      // 1b3: bipush 7
      // 1b5: invokestatic org/lwjgl/opengl/GL11.glBegin (I)V
      // 1b8: aload 0
      // 1b9: getfield nh4.rlc D
      // 1bc: aload 0
      // 1bd: getfield nh4.bx_ D
      // 1c0: aload 0
      // 1c1: getfield nh4.t8n D
      // 1c4: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 1c7: aload 0
      // 1c8: getfield nh4.t_2 D
      // 1cb: aload 0
      // 1cc: getfield nh4.bx_ D
      // 1cf: aload 0
      // 1d0: getfield nh4.t8n D
      // 1d3: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 1d6: aload 0
      // 1d7: getfield nh4.t_2 D
      // 1da: aload 0
      // 1db: getfield nh4.i2c D
      // 1de: aload 0
      // 1df: getfield nh4.t8n D
      // 1e2: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 1e5: aload 0
      // 1e6: getfield nh4.rlc D
      // 1e9: aload 0
      // 1ea: getfield nh4.i2c D
      // 1ed: aload 0
      // 1ee: getfield nh4.t8n D
      // 1f1: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 1f4: invokestatic org/lwjgl/opengl/GL11.glEnd ()V
      // 1f7: bipush 7
      // 1f9: invokestatic org/lwjgl/opengl/GL11.glBegin (I)V
      // 1fc: aload 0
      // 1fd: getfield nh4.t_2 D
      // 200: aload 0
      // 201: getfield nh4.bx_ D
      // 204: aload 0
      // 205: getfield nh4.t8n D
      // 208: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 20b: aload 0
      // 20c: getfield nh4.rlc D
      // 20f: aload 0
      // 210: getfield nh4.bx_ D
      // 213: aload 0
      // 214: getfield nh4.t8n D
      // 217: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 21a: aload 0
      // 21b: getfield nh4.rlc D
      // 21e: aload 0
      // 21f: getfield nh4.i2c D
      // 222: aload 0
      // 223: getfield nh4.t8n D
      // 226: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 229: aload 0
      // 22a: getfield nh4.t_2 D
      // 22d: aload 0
      // 22e: getfield nh4.i2c D
      // 231: aload 0
      // 232: getfield nh4.t8n D
      // 235: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 238: invokestatic org/lwjgl/opengl/GL11.glEnd ()V
      // 23b: bipush 7
      // 23d: invokestatic org/lwjgl/opengl/GL11.glBegin (I)V
      // 240: aload 0
      // 241: getfield nh4.rlc D
      // 244: aload 0
      // 245: getfield nh4.i2c D
      // 248: aload 0
      // 249: getfield nh4.t8n D
      // 24c: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 24f: aload 0
      // 250: getfield nh4.t_2 D
      // 253: aload 0
      // 254: getfield nh4.i2c D
      // 257: aload 0
      // 258: getfield nh4.t8n D
      // 25b: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 25e: aload 0
      // 25f: getfield nh4.t_2 D
      // 262: aload 0
      // 263: getfield nh4.i2c D
      // 266: aload 0
      // 267: getfield nh4.oqj D
      // 26a: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 26d: aload 0
      // 26e: getfield nh4.rlc D
      // 271: aload 0
      // 272: getfield nh4.i2c D
      // 275: aload 0
      // 276: getfield nh4.oqj D
      // 279: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 27c: invokestatic org/lwjgl/opengl/GL11.glEnd ()V
      // 27f: bipush 7
      // 281: invokestatic org/lwjgl/opengl/GL11.glBegin (I)V
      // 284: aload 0
      // 285: getfield nh4.t_2 D
      // 288: aload 0
      // 289: getfield nh4.i2c D
      // 28c: aload 0
      // 28d: getfield nh4.t8n D
      // 290: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 293: aload 0
      // 294: getfield nh4.rlc D
      // 297: aload 0
      // 298: getfield nh4.i2c D
      // 29b: aload 0
      // 29c: getfield nh4.t8n D
      // 29f: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 2a2: aload 0
      // 2a3: getfield nh4.rlc D
      // 2a6: aload 0
      // 2a7: getfield nh4.i2c D
      // 2aa: aload 0
      // 2ab: getfield nh4.oqj D
      // 2ae: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 2b1: aload 0
      // 2b2: getfield nh4.t_2 D
      // 2b5: aload 0
      // 2b6: getfield nh4.i2c D
      // 2b9: aload 0
      // 2ba: getfield nh4.oqj D
      // 2bd: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 2c0: invokestatic org/lwjgl/opengl/GL11.glEnd ()V
      // 2c3: bipush 7
      // 2c5: invokestatic org/lwjgl/opengl/GL11.glBegin (I)V
      // 2c8: aload 0
      // 2c9: getfield nh4.rlc D
      // 2cc: aload 0
      // 2cd: getfield nh4.bx_ D
      // 2d0: aload 0
      // 2d1: getfield nh4.t8n D
      // 2d4: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 2d7: aload 0
      // 2d8: getfield nh4.t_2 D
      // 2db: aload 0
      // 2dc: getfield nh4.bx_ D
      // 2df: aload 0
      // 2e0: getfield nh4.t8n D
      // 2e3: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 2e6: aload 0
      // 2e7: getfield nh4.t_2 D
      // 2ea: aload 0
      // 2eb: getfield nh4.bx_ D
      // 2ee: aload 0
      // 2ef: getfield nh4.oqj D
      // 2f2: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 2f5: aload 0
      // 2f6: getfield nh4.rlc D
      // 2f9: aload 0
      // 2fa: getfield nh4.bx_ D
      // 2fd: aload 0
      // 2fe: getfield nh4.oqj D
      // 301: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 304: invokestatic org/lwjgl/opengl/GL11.glEnd ()V
      // 307: bipush 7
      // 309: invokestatic org/lwjgl/opengl/GL11.glBegin (I)V
      // 30c: aload 0
      // 30d: getfield nh4.t_2 D
      // 310: aload 0
      // 311: getfield nh4.bx_ D
      // 314: aload 0
      // 315: getfield nh4.t8n D
      // 318: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 31b: aload 0
      // 31c: getfield nh4.rlc D
      // 31f: aload 0
      // 320: getfield nh4.bx_ D
      // 323: aload 0
      // 324: getfield nh4.t8n D
      // 327: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 32a: aload 0
      // 32b: getfield nh4.rlc D
      // 32e: aload 0
      // 32f: getfield nh4.bx_ D
      // 332: aload 0
      // 333: getfield nh4.oqj D
      // 336: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 339: aload 0
      // 33a: goto 341
      // 33d: invokestatic mkt.a (Loov;)Loov;
      // 340: athrow
      // 341: getfield nh4.t_2 D
      // 344: aload 0
      // 345: getfield nh4.bx_ D
      // 348: aload 0
      // 349: getfield nh4.oqj D
      // 34c: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 34f: invokestatic org/lwjgl/opengl/GL11.glEnd ()V
      // 352: iload 2
      // 353: invokestatic mkt.fba (Z)V
      // 356: return
   }

   public static void bta(boolean param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: iload 0
      // 05: iload 1
      // 06: ifne 48
      // 09: ifeq 24
      // 0c: goto 13
      // 0f: invokestatic mkt.a (Loov;)Loov;
      // 12: athrow
      // 13: bipush 0
      // 14: invokestatic org/lwjgl/opengl/GL11.glDepthMask (Z)V
      // 17: sipush 2929
      // 1a: invokestatic org/lwjgl/opengl/GL11.glDisable (I)V
      // 1d: goto 24
      // 20: invokestatic mkt.a (Loov;)Loov;
      // 23: athrow
      // 24: sipush 3008
      // 27: invokestatic org/lwjgl/opengl/GL11.glDisable (I)V
      // 2a: sipush 3042
      // 2d: invokestatic org/lwjgl/opengl/GL11.glEnable (I)V
      // 30: sipush 3553
      // 33: invokestatic org/lwjgl/opengl/GL11.glDisable (I)V
      // 36: sipush 770
      // 39: sipush 771
      // 3c: invokestatic org/lwjgl/opengl/GL11.glBlendFunc (II)V
      // 3f: sipush 2848
      // 42: invokestatic org/lwjgl/opengl/GL11.glEnable (I)V
      // 45: sipush 3154
      // 48: sipush 4354
      // 4b: invokestatic org/lwjgl/opengl/GL11.glHint (II)V
      // 4e: fconst_1
      // 4f: invokestatic org/lwjgl/opengl/GL11.glLineWidth (F)V
      // 52: return
   }

   public static void fba(boolean param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: iload 0
      // 05: iload 1
      // 06: ifeq 39
      // 09: ifeq 24
      // 0c: goto 13
      // 0f: invokestatic mkt.a (Loov;)Loov;
      // 12: athrow
      // 13: bipush 1
      // 14: invokestatic org/lwjgl/opengl/GL11.glDepthMask (Z)V
      // 17: sipush 2929
      // 1a: invokestatic org/lwjgl/opengl/GL11.glEnable (I)V
      // 1d: goto 24
      // 20: invokestatic mkt.a (Loov;)Loov;
      // 23: athrow
      // 24: sipush 3553
      // 27: invokestatic org/lwjgl/opengl/GL11.glEnable (I)V
      // 2a: sipush 3042
      // 2d: invokestatic org/lwjgl/opengl/GL11.glDisable (I)V
      // 30: sipush 3008
      // 33: invokestatic org/lwjgl/opengl/GL11.glEnable (I)V
      // 36: sipush 2848
      // 39: invokestatic org/lwjgl/opengl/GL11.glDisable (I)V
      // 3c: fconst_1
      // 3d: fconst_1
      // 3e: fconst_1
      // 3f: fconst_1
      // 40: invokestatic org/lwjgl/opengl/GL11.glColor4f (FFFF)V
      // 43: return
   }

   public static void n1k() {
      GL11.glEnable(3042);
      GL11.glDisable(2884);
      GL11.glDisable(3553);
      GL11.glEnable(2848);
      GL11.glBlendFunc(770, 771);
      GL11.glLineWidth(1.0F);
   }

   public static void o9i() {
      GL11.glDisable(3042);
      GL11.glEnable(2884);
      GL11.glEnable(3553);
      GL11.glDisable(2848);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      hzu.nn9(7424);
      hzu.ux6();
      hzu.rqj();
   }

   public static void v_1(int var0) {
      float var1 = (float)(var0 >> 24 & 0xFF) / 255.0F;
      float var2 = (float)(var0 >> 16 & 0xFF) / 255.0F;
      float var3 = (float)(var0 >> 8 & 0xFF) / 255.0F;
      float var4 = (float)(var0 & 0xFF) / 255.0F;
      GL11.glColor4f(var2, var3, var4, var1);
   }

   public static void c7g(float var0, float var1, float var2, float var3, float var4, Color var5, Color var6) {
      cju(var0, var1, var2, var3, var4, var5.getRGB(), var6.getRGB());
   }

   public static void cju(float var0, float var1, float var2, float var3, float var4, int var5, int var6) {
      uk7(var0 + var4, var1 + var4, var2 - var4 * 2.0F, var3 - var4 * 2.0F, var5);
      uk7(var0, var1, var2, var4, var6);
      uk7(var0, var1 + var4, var4, var3 - var4, var6);
      uk7(var0 + var2 - var4, var1 + var4, var4, var3 - var4, var6);
      uk7(var0 + var4, var1 + var3 - var4, var2 - var4 * 2.0F, var4, var6);
   }

   public static void kb1(float var0, float var1, float var2, float var3, float var4, int var5) {
      uk7(var0 + var4, var1 + var4, var2 - var4 * 2.0F, var4, var5);
      uk7(var0, var1 + var4, var4, var3 - var4, var5);
      uk7(var0 + var2 - var4, var1 + var4, var4, var3 - var4, var5);
      uk7(var0 + var4, var1 + var3 - var4, var2 - var4 * 2.0F, var4, var5);
   }

   public static void rn3(float var0, float var1, float var2, float var3, Color var4) {
      uk7(var0, var1, var2, var3, var4.getRGB());
   }

   public static void uk7(float var0, float var1, float var2, float var3, int var4) {
      n1k();
      v_1(var4);
      GL11.glBegin(7);
      GL11.glVertex2d((double)var0, (double)var1);
      GL11.glVertex2d((double)(var0 + var2), (double)var1);
      GL11.glVertex2d((double)(var0 + var2), (double)(var1 + var3));
      GL11.glVertex2d((double)var0, (double)(var1 + var3));
      GL11.glEnd();
      o9i();
   }

   public static void o8m(float var0, float var1, float var2, float var3, float var4, int var5, float var6, int var7) {
      int var8 = OpaquePredicate.b();

      int var10000;
      label247: {
         int var10001;
         label242: {
            label241: {
               try {
                  var10000 = var5;
                  var10001 = 16777215;
                  if (var8 == 0) {
                     break label242;
                  }

                  if (var5 != 16777215) {
                     break label241;
                  }
               } catch (oov var27) {
                  throw a(var27);
               }

               var5 = z7e.a2_.k0y;
            }

            try {
               var10000 = var7;
               if (var8 == 0) {
                  break label247;
               }

               var10001 = 16777215;
            } catch (oov var26) {
               throw a(var26);
            }
         }

         if (var10000 == var10001) {
            var7 = z7e.a2_.k0y;
         }

         float var42;
         var10000 = (var42 = var4 - 0.0F) == 0.0F ? 0 : (var42 < 0.0F ? -1 : 1);
      }

      label229: {
         label228: {
            try {
               if (var8 == 0) {
                  break label229;
               }

               if (var10000 >= 0) {
                  break label228;
               }
            } catch (oov var25) {
               throw a(var25);
            }

            var4 = 0.0F;
         }

         float var43;
         var10000 = (var43 = var4 - var2 / 2.0F) == 0.0F ? 0 : (var43 < 0.0F ? -1 : 1);
      }

      label220: {
         label219: {
            try {
               if (var8 == 0) {
                  break label220;
               }

               if (var10000 <= 0) {
                  break label219;
               }
            } catch (oov var24) {
               throw a(var24);
            }

            var4 = var2 / 2.0F;
         }

         float var44;
         var10000 = (var44 = var4 - var3 / 2.0F) == 0.0F ? 0 : (var44 < 0.0F ? -1 : 1);
      }

      label211: {
         label210: {
            try {
               if (var8 == 0) {
                  break label211;
               }

               if (var10000 <= 0) {
                  break label210;
               }
            } catch (oov var23) {
               throw a(var23);
            }

            var4 = var3 / 2.0F;
         }

         uk7(var0 + var4, var1 + var4, var2 - var4 * 2.0F, var3 - var4 * 2.0F, var5);
         uk7(var0 + var4, var1, var2 - var4 * 2.0F, var4, var5);
         uk7(var0 + var4, var1 + var3 - var4, var2 - var4 * 2.0F, var4, var5);
         uk7(var0, var1 + var4, var4, var3 - var4 * 2.0F, var5);
         uk7(var0 + var2 - var4, var1 + var4, var4, var3 - var4 * 2.0F, var5);
         n1k();
         hhf.rs_(var5);
         var10000 = 6;
      }

      GL11.glBegin(var10000);
      float var9 = var0 + var4;
      float var10 = var1 + var4;
      GL11.glVertex2d((double)var9, (double)var10);
      int var11 = (int)Math.min(Math.max(var4, 10.0F), 90.0F);
      int var12 = 0;

      while (true) {
         if (var12 < var11 + 1) {
            double var13 = (Math.PI * 2) * (double)(var12 + 180) / (double)(var11 * 4);

            try {
               GL11.glVertex2d((double)var9 + Math.sin(var13) * (double)var4, (double)var10 + Math.cos(var13) * (double)var4);
               var12++;
               if (var8 == 0) {
                  break;
               }

               if (var8 != 0) {
                  continue;
               }
            } catch (oov var22) {
               throw a(var22);
            }
         }

         GL11.glEnd();
         GL11.glBegin(6);
         var9 = var0 + var2 - var4;
         var10 = var1 + var4;
         GL11.glVertex2d((double)var9, (double)var10);
         var11 = (int)Math.min(Math.max(var4, 10.0F), 90.0F);
         break;
      }

      var12 = 0;

      while (true) {
         if (var12 < var11 + 1) {
            double var35 = (Math.PI * 2) * (double)(var12 + 90) / (double)(var11 * 4);

            try {
               GL11.glVertex2d((double)var9 + Math.sin(var35) * (double)var4, (double)var10 + Math.cos(var35) * (double)var4);
               var12++;
               if (var8 == 0) {
                  break;
               }

               if (var8 != 0) {
                  continue;
               }
            } catch (oov var21) {
               throw a(var21);
            }
         }

         GL11.glEnd();
         GL11.glBegin(6);
         var9 = var0 + var4;
         var10 = var1 + var3 - var4;
         GL11.glVertex2d((double)var9, (double)var10);
         var11 = (int)Math.min(Math.max(var4, 10.0F), 90.0F);
         break;
      }

      var12 = 0;

      while (true) {
         if (var12 < var11 + 1) {
            double var36 = (Math.PI * 2) * (double)(var12 + 270) / (double)(var11 * 4);

            try {
               GL11.glVertex2d((double)var9 + Math.sin(var36) * (double)var4, (double)var10 + Math.cos(var36) * (double)var4);
               var12++;
               if (var8 == 0) {
                  break;
               }

               if (var8 != 0) {
                  continue;
               }
            } catch (oov var20) {
               throw a(var20);
            }
         }

         GL11.glEnd();
         GL11.glBegin(6);
         var9 = var0 + var2 - var4;
         var10 = var1 + var3 - var4;
         GL11.glVertex2d((double)var9, (double)var10);
         var11 = (int)Math.min(Math.max(var4, 10.0F), 90.0F);
         break;
      }

      var12 = 0;

      while (true) {
         if (var12 < var11 + 1) {
            double var37 = (Math.PI * 2) * (double)var12 / (double)(var11 * 4);

            try {
               GL11.glVertex2d((double)var9 + Math.sin(var37) * (double)var4, (double)var10 + Math.cos(var37) * (double)var4);
               var12++;
               if (var8 == 0) {
                  break;
               }

               if (var8 != 0) {
                  continue;
               }
            } catch (oov var19) {
               throw a(var19);
            }
         }

         GL11.glEnd();
         hhf.rs_(var7);
         GL11.glLineWidth(var6);
         GL11.glBegin(3);
         var9 = var0 + var4;
         var10 = var1 + var4;
         var11 = (int)Math.min(Math.max(var4, 10.0F), 90.0F);
         break;
      }

      var12 = var11;

      while (true) {
         if (var12 >= 0) {
            double var38 = (Math.PI * 2) * (double)(var12 + 180) / (double)(var11 * 4);

            try {
               GL11.glVertex2d((double)var9 + Math.sin(var38) * (double)var4, (double)var10 + Math.cos(var38) * (double)var4);
               var12--;
               if (var8 == 0) {
                  break;
               }

               if (var8 != 0) {
                  continue;
               }
            } catch (oov var18) {
               throw a(var18);
            }
         }

         GL11.glVertex2d((double)(var0 + var4), (double)var1);
         GL11.glVertex2d((double)(var0 + var2 - var4), (double)var1);
         var9 = var0 + var2 - var4;
         var10 = var1 + var4;
         break;
      }

      var12 = var11;

      while (true) {
         if (var12 >= 0) {
            double var39 = (Math.PI * 2) * (double)(var12 + 90) / (double)(var11 * 4);

            try {
               GL11.glVertex2d((double)var9 + Math.sin(var39) * (double)var4, (double)var10 + Math.cos(var39) * (double)var4);
               var12--;
               if (var8 == 0) {
                  break;
               }

               if (var8 != 0) {
                  continue;
               }
            } catch (oov var17) {
               throw a(var17);
            }
         }

         GL11.glVertex2d((double)(var0 + var2), (double)(var1 + var4));
         GL11.glVertex2d((double)(var0 + var2), (double)(var1 + var3 - var4));
         var9 = var0 + var2 - var4;
         var10 = var1 + var3 - var4;
         break;
      }

      var12 = var11;

      while (true) {
         if (var12 >= 0) {
            double var40 = (Math.PI * 2) * (double)var12 / (double)(var11 * 4);

            try {
               GL11.glVertex2d((double)var9 + Math.sin(var40) * (double)var4, (double)var10 + Math.cos(var40) * (double)var4);
               var12--;
               if (var8 == 0) {
                  break;
               }

               if (var8 != 0) {
                  continue;
               }
            } catch (oov var16) {
               throw a(var16);
            }
         }

         GL11.glVertex2d((double)(var0 + var2 - var4), (double)(var1 + var3));
         GL11.glVertex2d((double)(var0 + var4), (double)(var1 + var3));
         var9 = var0 + var4;
         var10 = var1 + var3 - var4;
         break;
      }

      var12 = var11;

      while (true) {
         if (var12 >= 0) {
            double var41 = (Math.PI * 2) * (double)(var12 + 270) / (double)(var11 * 4);

            try {
               GL11.glVertex2d((double)var9 + Math.sin(var41) * (double)var4, (double)var10 + Math.cos(var41) * (double)var4);
               var12--;
               if (var8 == 0) {
                  break;
               }

               if (var8 != 0) {
                  continue;
               }
            } catch (oov var15) {
               throw a(var15);
            }
         }

         GL11.glVertex2d((double)var0, (double)(var1 + var3 - var4));
         GL11.glVertex2d((double)var0, (double)(var1 + var4));
         GL11.glEnd();
         o9i();
         break;
      }
   }

   public static int b_f() {
      eka var0 = new eka(Minecraft.vz1());
      return var0.x05();
   }

   public static int e_m() {
      eka var0 = new eka(Minecraft.vz1());
      return var0.lrx();
   }

   public static void ryp(float var0, float var1, float var2, float var3, int var4) {
      n1k();
      int var10000 = OpaquePredicate.c();
      v_1(var4);
      GL11.glLineWidth(var3);
      int var5 = var10000;
      int var6 = (int)Math.min(Math.max(var2, 45.0F), 360.0F);
      GL11.glBegin(2);
      int var7 = 0;

      while (true) {
         if (var7 < var6) {
            double var8 = (Math.PI * 2) * (double)var7 / (double)var6;

            try {
               GL11.glVertex2d((double)var0 + Math.sin(var8) * (double)var2, (double)var1 + Math.cos(var8) * (double)var2);
               var7++;
               if (var5 != 0) {
                  break;
               }

               if (var5 == 0) {
                  continue;
               }
            } catch (oov var10) {
               throw a(var10);
            }
         }

         GL11.glEnd();
         o9i();
         break;
      }
   }

   public static void l6_(float var0, float var1, float var2, int var3) {
      n1k();
      int var10000 = OpaquePredicate.b();
      v_1(var3);
      int var5 = (int)Math.min(Math.max(var2, 45.0F), 360.0F);
      int var4 = var10000;
      GL11.glBegin(9);
      int var6 = 0;

      while (true) {
         if (var6 < var5) {
            double var7 = (Math.PI * 2) * (double)var6 / (double)var5;

            try {
               GL11.glVertex2d((double)var0 + Math.sin(var7) * (double)var2, (double)var1 + Math.cos(var7) * (double)var2);
               var6++;
               if (var4 == 0) {
                  break;
               }

               if (var4 != 0) {
                  continue;
               }
            } catch (oov var9) {
               throw a(var9);
            }
         }

         GL11.glEnd();
         o9i();
         ryp(var0, var1, var2, 1.5F, 16777215);
         break;
      }
   }

   public static void sut(float var0, float var1, float var2, int var3) {
      n1k();
      int var10000 = OpaquePredicate.c();
      v_1(var3);
      int var4 = var10000;
      int var5 = (int)Math.min(Math.max(var2, 45.0F), 360.0F);
      GL11.glBegin(9);
      int var6 = 0;

      while (true) {
         if (var6 < var5) {
            double var7 = (Math.PI * 2) * (double)var6 / (double)var5;

            try {
               GL11.glVertex2d((double)var0 + Math.sin(var7) * (double)var2, (double)var1 + Math.cos(var7) * (double)var2);
               var6++;
               if (var4 != 0) {
                  break;
               }

               if (var4 == 0) {
                  continue;
               }
            } catch (oov var9) {
               throw a(var9);
            }
         }

         GL11.glEnd();
         o9i();
         break;
      }
   }

   public static int kgs(int var0, int var1) {
      float var2 = (float)(var0 >> 24 & 0xFF);
      float var3 = Math.max((float)(var0 >> 16 & 0xFF) - (float)(var0 >> 16 & 0xFF) / (100.0F / (float)var1), 0.0F);
      float var4 = Math.max((float)(var0 >> 8 & 0xFF) - (float)(var0 >> 8 & 0xFF) / (100.0F / (float)var1), 0.0F);
      float var5 = Math.max((float)(var0 & 0xFF) - (float)(var0 & 0xFF) / (100.0F / (float)var1), 0.0F);
      return (int)((float)(((int)var2 << 24) + ((int)var3 << 16) + ((int)var4 << 8)) + var5);
   }

   public static int qt9(int var0, int var1) {
      float var2 = Math.max((float)(var0 >> 24 & 0xFF) - (float)(var0 >> 24 & 0xFF) / (100.0F / (float)var1), 0.0F);
      float var3 = (float)(var0 >> 16 & 0xFF);
      float var4 = (float)(var0 >> 8 & 0xFF);
      float var5 = (float)(var0 & 0xFF);
      return (int)((float)(((int)var2 << 24) + ((int)var3 << 16) + ((int)var4 << 8)) + var5);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
