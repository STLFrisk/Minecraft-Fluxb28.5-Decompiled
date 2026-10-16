import com.google.gson.JsonSyntaxException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.optifine.render.CloudRenderer;
import net.optifine.render.RenderEnv;
import net.optifine.shaders.ShadersRender;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.util.vector.Vector3f;
import org.lwjgl.util.vector.Vector4f;

public class crp implements u60, lv1 {
   private static final Logger h7c;
   private static final gdz zbm;
   private static final gdz jnk;
   private static final gdz fda;
   private static final gdz kr7;
   private static final gdz s2a;
   public final c05 j0u;
   private final lc5 nr3;
   private final hr_ h3f;
   private kh3 t6z;
   private Set l0i;
   private List eq2;
   private final Set h7f;
   private c1s o6x;
   private int jsw;
   private int ul_;
   private int cj4;
   private be7 u2p;
   private fab uu2;
   private fab o50;
   private fab i65;
   private int s0f;
   public final Map sz2;
   private final Map kgn;
   private final sla[] _qh;
   private oru h5t;
   private qn4 vrx;
   private double gxe;
   private double ex0;
   private double rv_;
   private int ivg;
   private int bg4;
   private int o3i;
   private double o6f;
   private double okd;
   private double tq1;
   private double p5b;
   private double udn;
   private final tbt isn;
   private ofj f9a;
   private int bsi;
   private int me1;
   private int z1b;
   private int yoz;
   private int ofr;
   private boolean i1y;
   private uka hyu;
   private final Vector4f[] s1u;
   private final zxu c2_;
   private boolean emi;
   public eg6 a3o;
   private double qe9;
   private double tag;
   private double hr6;
   public boolean jli;
   private CloudRenderer sae;
   public i2h qgm;
   public Set atw;
   public Set th7;
   private Deque a46;
   private List fo5;
   private List ea4;
   private List ds4;
   private List i5v;
   private List m2h;
   private List qow;
   private List dp7;
   private List f6f;
   private int ez1;
   private int qn7;
   private static final Set mgk;
   private int obc;
   private g6k ips;
   private yo9 jgu;
   private int _t5;
   private RenderEnv pop;
   public boolean sy_;
   public boolean oun;
   private boolean f4x;
   private static int pp5;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public crp(c05 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokespecial java/lang/Object.<init> ()V
      // 004: invokestatic t9d.b ()I
      // 007: aload 0
      // 008: invokestatic com/google/common/collect/Sets.newLinkedHashSet ()Ljava/util/LinkedHashSet;
      // 00b: putfield crp.l0i Ljava/util/Set;
      // 00e: aload 0
      // 00f: ldc 69696
      // 011: nop
      // 012: invokestatic com/google/common/collect/Lists.newArrayListWithCapacity (I)Ljava/util/ArrayList;
      // 015: putfield crp.eq2 Ljava/util/List;
      // 018: aload 0
      // 019: invokestatic com/google/common/collect/Sets.newHashSet ()Ljava/util/HashSet;
      // 01c: putfield crp.h7f Ljava/util/Set;
      // 01f: aload 0
      // 020: bipush -1
      // 021: putfield crp.jsw I
      // 024: istore 2
      // 025: aload 0
      // 026: bipush -1
      // 027: putfield crp.ul_ I
      // 02a: aload 0
      // 02b: bipush -1
      // 02c: putfield crp.cj4 I
      // 02f: aload 0
      // 030: invokestatic com/google/common/collect/Maps.newHashMap ()Ljava/util/HashMap;
      // 033: putfield crp.sz2 Ljava/util/Map;
      // 036: aload 0
      // 037: invokestatic com/google/common/collect/Maps.newHashMap ()Ljava/util/HashMap;
      // 03a: putfield crp.kgn Ljava/util/Map;
      // 03d: aload 0
      // 03e: bipush 10
      // 040: anewarray 260
      // 043: putfield crp._qh [Lsla;
      // 046: aload 0
      // 047: ldc2_w 4.9E-324
      // 04a: putfield crp.gxe D
      // 04d: aload 0
      // 04e: ldc2_w 4.9E-324
      // 051: putfield crp.ex0 D
      // 054: aload 0
      // 055: ldc2_w 4.9E-324
      // 058: putfield crp.rv_ D
      // 05b: aload 0
      // 05c: ldc -2147483648
      // 05e: nop
      // 05f: putfield crp.ivg I
      // 062: aload 0
      // 063: ldc -2147483648
      // 065: nop
      // 066: putfield crp.bg4 I
      // 069: aload 0
      // 06a: ldc -2147483648
      // 06c: nop
      // 06d: putfield crp.o3i I
      // 070: aload 0
      // 071: ldc2_w 4.9E-324
      // 074: putfield crp.o6f D
      // 077: aload 0
      // 078: ldc2_w 4.9E-324
      // 07b: putfield crp.okd D
      // 07e: aload 0
      // 07f: ldc2_w 4.9E-324
      // 082: putfield crp.tq1 D
      // 085: aload 0
      // 086: ldc2_w 4.9E-324
      // 089: putfield crp.p5b D
      // 08c: aload 0
      // 08d: ldc2_w 4.9E-324
      // 090: putfield crp.udn D
      // 093: aload 0
      // 094: new tbt
      // 097: dup
      // 098: invokespecial tbt.<init> ()V
      // 09b: putfield crp.isn Ltbt;
      // 09e: aload 0
      // 09f: bipush -1
      // 0a0: putfield crp.bsi I
      // 0a3: aload 0
      // 0a4: bipush 2
      // 0a5: putfield crp.me1 I
      // 0a8: aload 0
      // 0a9: bipush 0
      // 0aa: putfield crp.i1y Z
      // 0ad: aload 0
      // 0ae: bipush 8
      // 0b0: anewarray 299
      // 0b3: putfield crp.s1u [Lorg/lwjgl/util/vector/Vector4f;
      // 0b6: aload 0
      // 0b7: new zxu
      // 0ba: dup
      // 0bb: invokespecial zxu.<init> ()V
      // 0be: putfield crp.c2_ Lzxu;
      // 0c1: aload 0
      // 0c2: bipush 0
      // 0c3: putfield crp.emi Z
      // 0c6: aload 0
      // 0c7: bipush 1
      // 0c8: putfield crp.jli Z
      // 0cb: aload 0
      // 0cc: new java/util/LinkedHashSet
      // 0cf: dup
      // 0d0: invokespecial java/util/LinkedHashSet.<init> ()V
      // 0d3: putfield crp.atw Ljava/util/Set;
      // 0d6: aload 0
      // 0d7: new java/util/LinkedHashSet
      // 0da: dup
      // 0db: invokespecial java/util/LinkedHashSet.<init> ()V
      // 0de: putfield crp.th7 Ljava/util/Set;
      // 0e1: aload 0
      // 0e2: new java/util/ArrayDeque
      // 0e5: dup
      // 0e6: invokespecial java/util/ArrayDeque.<init> ()V
      // 0e9: putfield crp.a46 Ljava/util/Deque;
      // 0ec: aload 0
      // 0ed: new java/util/ArrayList
      // 0f0: dup
      // 0f1: sipush 1024
      // 0f4: invokespecial java/util/ArrayList.<init> (I)V
      // 0f7: putfield crp.fo5 Ljava/util/List;
      // 0fa: aload 0
      // 0fb: new java/util/ArrayList
      // 0fe: dup
      // 0ff: sipush 1024
      // 102: invokespecial java/util/ArrayList.<init> (I)V
      // 105: putfield crp.ea4 Ljava/util/List;
      // 108: aload 0
      // 109: new java/util/ArrayList
      // 10c: dup
      // 10d: sipush 1024
      // 110: invokespecial java/util/ArrayList.<init> (I)V
      // 113: putfield crp.ds4 Ljava/util/List;
      // 116: aload 0
      // 117: new java/util/ArrayList
      // 11a: dup
      // 11b: sipush 1024
      // 11e: invokespecial java/util/ArrayList.<init> (I)V
      // 121: putfield crp.i5v Ljava/util/List;
      // 124: aload 0
      // 125: new java/util/ArrayList
      // 128: dup
      // 129: sipush 1024
      // 12c: invokespecial java/util/ArrayList.<init> (I)V
      // 12f: putfield crp.m2h Ljava/util/List;
      // 132: aload 0
      // 133: new java/util/ArrayList
      // 136: dup
      // 137: sipush 1024
      // 13a: invokespecial java/util/ArrayList.<init> (I)V
      // 13d: putfield crp.qow Ljava/util/List;
      // 140: aload 0
      // 141: new java/util/ArrayList
      // 144: dup
      // 145: sipush 1024
      // 148: invokespecial java/util/ArrayList.<init> (I)V
      // 14b: putfield crp.dp7 Ljava/util/List;
      // 14e: aload 0
      // 14f: new java/util/ArrayList
      // 152: dup
      // 153: sipush 1024
      // 156: invokespecial java/util/ArrayList.<init> (I)V
      // 159: putfield crp.f6f Ljava/util/List;
      // 15c: aload 0
      // 15d: bipush 0
      // 15e: putfield crp.ez1 I
      // 161: aload 0
      // 162: bipush 0
      // 163: putfield crp.qn7 I
      // 166: aload 0
      // 167: aconst_null
      // 168: putfield crp.ips Lg6k;
      // 16b: aload 0
      // 16c: aconst_null
      // 16d: putfield crp.jgu Lyo9;
      // 170: aload 0
      // 171: bipush 0
      // 172: putfield crp._t5 I
      // 175: aload 0
      // 176: new net/optifine/render/RenderEnv
      // 179: dup
      // 17a: getstatic ox_.ibw Le0x;
      // 17d: invokevirtual e0x.l4i ()Lzfz;
      // 180: new mew
      // 183: dup
      // 184: bipush 0
      // 185: bipush 0
      // 186: bipush 0
      // 187: invokespecial mew.<init> (III)V
      // 18a: invokespecial net/optifine/render/RenderEnv.<init> (Lzfz;Lmew;)V
      // 18d: putfield crp.pop Lnet/optifine/render/RenderEnv;
      // 190: aload 0
      // 191: bipush 0
      // 192: putfield crp.sy_ Z
      // 195: aload 0
      // 196: bipush 0
      // 197: putfield crp.oun Z
      // 19a: aload 0
      // 19b: bipush 0
      // 19c: putfield crp.f4x Z
      // 19f: aload 0
      // 1a0: new net/optifine/render/CloudRenderer
      // 1a3: dup
      // 1a4: aload 1
      // 1a5: invokespecial net/optifine/render/CloudRenderer.<init> (Lc05;)V
      // 1a8: putfield crp.sae Lnet/optifine/render/CloudRenderer;
      // 1ab: aload 0
      // 1ac: aload 1
      // 1ad: putfield crp.j0u Lc05;
      // 1b0: aload 0
      // 1b1: aload 1
      // 1b2: invokevirtual c05.ibs ()Lhr_;
      // 1b5: putfield crp.h3f Lhr_;
      // 1b8: aload 0
      // 1b9: aload 1
      // 1ba: invokevirtual c05.l22 ()Llc5;
      // 1bd: putfield crp.nr3 Llc5;
      // 1c0: aload 0
      // 1c1: getfield crp.nr3 Llc5;
      // 1c4: getstatic crp.s2a Lgdz;
      // 1c7: invokevirtual lc5.anl (Lgdz;)V
      // 1ca: sipush 3553
      // 1cd: sipush 10242
      // 1d0: sipush 10497
      // 1d3: invokestatic org/lwjgl/opengl/GL11.glTexParameteri (III)V
      // 1d6: sipush 3553
      // 1d9: sipush 10243
      // 1dc: sipush 10497
      // 1df: invokestatic org/lwjgl/opengl/GL11.glTexParameteri (III)V
      // 1e2: bipush 0
      // 1e3: invokestatic hzu.t30 (I)V
      // 1e6: aload 0
      // 1e7: invokespecial crp.f12 ()V
      // 1ea: aload 0
      // 1eb: invokestatic gis.eyg ()Z
      // 1ee: putfield crp.emi Z
      // 1f1: aload 0
      // 1f2: iload 2
      // 1f3: ifeq 237
      // 1f6: getfield crp.emi Z
      // 1f9: ifeq 224
      // 1fc: goto 203
      // 1ff: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 202: athrow
      // 203: aload 0
      // 204: new m21
      // 207: dup
      // 208: invokespecial m21.<init> ()V
      // 20b: putfield crp.f9a Lofj;
      // 20e: aload 0
      // 20f: new cum
      // 212: dup
      // 213: invokespecial cum.<init> ()V
      // 216: putfield crp.a3o Leg6;
      // 219: iload 2
      // 21a: ifne 241
      // 21d: goto 224
      // 220: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 223: athrow
      // 224: aload 0
      // 225: new ko7
      // 228: dup
      // 229: invokespecial ko7.<init> ()V
      // 22c: putfield crp.f9a Lofj;
      // 22f: aload 0
      // 230: goto 237
      // 233: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 236: athrow
      // 237: new b00
      // 23a: dup
      // 23b: invokespecial b00.<init> ()V
      // 23e: putfield crp.a3o Leg6;
      // 241: aload 0
      // 242: new be7
      // 245: dup
      // 246: invokespecial be7.<init> ()V
      // 249: putfield crp.u2p Lbe7;
      // 24c: aload 0
      // 24d: getfield crp.u2p Lbe7;
      // 250: new n0i
      // 253: dup
      // 254: bipush 0
      // 255: getstatic n0i$p_w.hz0 Ln0i$p_w;
      // 258: getstatic n0i$pto.rrf Ln0i$pto;
      // 25b: bipush 3
      // 25c: invokespecial n0i.<init> (ILn0i$p_w;Ln0i$pto;I)V
      // 25f: invokevirtual be7.cmt (Ln0i;)Lbe7;
      // 262: pop
      // 263: aload 0
      // 264: invokespecial crp.nlt ()V
      // 267: aload 0
      // 268: invokespecial crp.vho ()V
      // 26b: aload 0
      // 26c: invokespecial crp.xkn ()V
      // 26f: return
   }

   @Override
   public void onResourceManagerReload(y99 var1) {
      this.f12();
   }

   private void f12() {
      long var1 = a ^ 10225137791941L;
      yu2 var4 = this.j0u.dd_();
      int var10000 = t9d.b();
      int var5 = 0;
      int var3 = var10000;

      while (var5 < this._qh.length) {
         this._qh[var5] = var4.brw(a<"j">(16016, 2604812158499446668L ^ var1) + var5);
         var5++;
         if (var3 == 0) {
            break;
         }
      }
   }

   public void otl() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic crp.a J
      // 003: ldc2_w 92137355758479
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic t9d.c ()I
      // 00b: istore 3
      // 00c: getstatic gis.jap Z
      // 00f: ifeq 106
      // 012: invokestatic q38.x7d ()Lq38;
      // 015: ifnonnull 029
      // 018: goto 01f
      // 01b: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01e: athrow
      // 01f: invokestatic q38.xhu ()V
      // 022: goto 029
      // 025: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 028: athrow
      // 029: new gdz
      // 02c: dup
      // 02d: sipush 29417
      // 030: ldc2_w 7518617282936040338
      // 033: lload 1
      // 034: lxor
      // 035: invokedynamic j (IJ)Ljava/lang/String; bsm=crp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03a: nop
      // 03b: invokespecial gdz.<init> (Ljava/lang/String;)V
      // 03e: astore 4
      // 040: aload 0
      // 041: new qn4
      // 044: dup
      // 045: aload 0
      // 046: getfield crp.j0u Lc05;
      // 049: invokevirtual c05.l22 ()Llc5;
      // 04c: aload 0
      // 04d: getfield crp.j0u Lc05;
      // 050: invokevirtual c05.mpf ()Ly99;
      // 053: aload 0
      // 054: getfield crp.j0u Lc05;
      // 057: invokevirtual c05._d2 ()Loru;
      // 05a: aload 4
      // 05c: invokespecial qn4.<init> (Llc5;Ly99;Loru;Lgdz;)V
      // 05f: putfield crp.vrx Lqn4;
      // 062: aload 0
      // 063: getfield crp.vrx Lqn4;
      // 066: aload 0
      // 067: getfield crp.j0u Lc05;
      // 06a: getfield c05.pfr I
      // 06d: aload 0
      // 06e: getfield crp.j0u Lc05;
      // 071: getfield c05.ry7 I
      // 074: invokevirtual qn4.s_6 (II)V
      // 077: aload 0
      // 078: aload 0
      // 079: getfield crp.vrx Lqn4;
      // 07c: sipush 32239
      // 07f: ldc2_w 2363611462415377547
      // 082: lload 1
      // 083: lxor
      // 084: invokedynamic j (IJ)Ljava/lang/String; bsm=crp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 089: nop
      // 08a: invokevirtual qn4.hvg (Ljava/lang/String;)Loru;
      // 08d: putfield crp.h5t Loru;
      // 090: goto 102
      // 093: astore 5
      // 095: getstatic crp.h7c Lorg/apache/logging/log4j/Logger;
      // 098: new java/lang/StringBuilder
      // 09b: dup
      // 09c: invokespecial java/lang/StringBuilder.<init> ()V
      // 09f: sipush 1536
      // 0a2: ldc2_w 7531965147388518262
      // 0a5: lload 1
      // 0a6: lxor
      // 0a7: invokedynamic j (IJ)Ljava/lang/String; bsm=crp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ac: nop
      // 0ad: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b0: aload 4
      // 0b2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0b5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0b8: aload 5
      // 0ba: invokeinterface org/apache/logging/log4j/Logger.warn (Ljava/lang/String;Ljava/lang/Throwable;)V 3
      // 0bf: aload 0
      // 0c0: aconst_null
      // 0c1: putfield crp.vrx Lqn4;
      // 0c4: aload 0
      // 0c5: aconst_null
      // 0c6: putfield crp.h5t Loru;
      // 0c9: goto 102
      // 0cc: astore 5
      // 0ce: getstatic crp.h7c Lorg/apache/logging/log4j/Logger;
      // 0d1: new java/lang/StringBuilder
      // 0d4: dup
      // 0d5: invokespecial java/lang/StringBuilder.<init> ()V
      // 0d8: sipush 24858
      // 0db: ldc2_w 263720250254653524
      // 0de: lload 1
      // 0df: lxor
      // 0e0: invokedynamic j (IJ)Ljava/lang/String; bsm=crp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e5: nop
      // 0e6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e9: aload 4
      // 0eb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0ee: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0f1: aload 5
      // 0f3: invokeinterface org/apache/logging/log4j/Logger.warn (Ljava/lang/String;Ljava/lang/Throwable;)V 3
      // 0f8: aload 0
      // 0f9: aconst_null
      // 0fa: putfield crp.vrx Lqn4;
      // 0fd: aload 0
      // 0fe: aconst_null
      // 0ff: putfield crp.h5t Loru;
      // 102: iload 3
      // 103: ifeq 117
      // 106: aload 0
      // 107: aconst_null
      // 108: putfield crp.vrx Lqn4;
      // 10b: aload 0
      // 10c: aconst_null
      // 10d: putfield crp.h5t Loru;
      // 110: goto 117
      // 113: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 116: athrow
      // 117: return
   }

   public void vnv() {
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
      // 05: invokevirtual crp._53 ()Z
      // 08: iload 1
      // 09: ifne 23
      // 0c: ifeq 44
      // 0f: goto 16
      // 12: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: invokestatic hzu.spd ()V
      // 19: sipush 770
      // 1c: goto 23
      // 1f: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22: athrow
      // 23: sipush 771
      // 26: bipush 0
      // 27: bipush 1
      // 28: invokestatic hzu.u39 (IIII)V
      // 2b: aload 0
      // 2c: getfield crp.h5t Loru;
      // 2f: aload 0
      // 30: getfield crp.j0u Lc05;
      // 33: getfield c05.pfr I
      // 36: aload 0
      // 37: getfield crp.j0u Lc05;
      // 3a: getfield c05.ry7 I
      // 3d: bipush 0
      // 3e: invokevirtual oru.mk8 (IIZ)V
      // 41: invokestatic hzu.ux6 ()V
      // 44: return
   }

   public boolean _53() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: invokestatic hxt.veb ()Z
      // 07: iload 1
      // 08: ifeq 18
      // 0b: ifne c7
      // 0e: goto 15
      // 11: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: invokestatic hxt.ly3 ()Z
      // 18: iload 1
      // 19: ifeq 29
      // 1c: ifne c7
      // 1f: goto 26
      // 22: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25: athrow
      // 26: invokestatic hxt.b4a ()Z
      // 29: ifne c7
      // 2c: aload 0
      // 2d: iload 1
      // 2e: ifeq 4d
      // 31: goto 38
      // 34: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37: athrow
      // 38: getfield crp.h5t Loru;
      // 3b: ifnull c3
      // 3e: goto 45
      // 41: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 44: athrow
      // 45: aload 0
      // 46: goto 4d
      // 49: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4c: athrow
      // 4d: iload 1
      // 4e: ifeq 66
      // 51: getfield crp.vrx Lqn4;
      // 54: ifnull c3
      // 57: goto 5e
      // 5a: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5d: athrow
      // 5e: aload 0
      // 5f: goto 66
      // 62: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 65: athrow
      // 66: getfield crp.j0u Lc05;
      // 69: getfield c05.vg8 Ll86;
      // 6c: iload 1
      // 6d: ifeq 88
      // 70: ifnull c3
      // 73: goto 7a
      // 76: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 79: athrow
      // 7a: aload 0
      // 7b: getfield crp.j0u Lc05;
      // 7e: getfield c05.vg8 Ll86;
      // 81: goto 88
      // 84: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 87: athrow
      // 88: invokevirtual l86.myu ()Z
      // 8b: iload 1
      // 8c: ifeq c4
      // 8f: ifeq c3
      // 92: goto 99
      // 95: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 98: athrow
      // 99: aload 0
      // 9a: getfield crp.j0u Lc05;
      // 9d: getfield c05.oxn Lmoh;
      // a0: getfield moh.nw4 Lm7l;
      // a3: invokevirtual m7l.t9w ()Z
      // a6: iload 1
      // a7: ifeq c4
      // aa: goto b1
      // ad: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b0: athrow
      // b1: ifeq c3
      // b4: goto bb
      // b7: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ba: athrow
      // bb: bipush 1
      // bc: goto c8
      // bf: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c2: athrow
      // c3: bipush 0
      // c4: goto c8
      // c7: bipush 0
      // c8: ireturn
   }

   private void xkn() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic jom.yut ()Ljom;
      // 03: astore 2
      // 04: invokestatic t9d.c ()I
      // 07: aload 2
      // 08: invokevirtual jom.zuq ()Lq3g;
      // 0b: astore 3
      // 0c: istore 1
      // 0d: aload 0
      // 0e: iload 1
      // 0f: ifne 2e
      // 12: getfield crp.i65 Lfab;
      // 15: ifnull 2d
      // 18: goto 1f
      // 1b: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: aload 0
      // 20: getfield crp.i65 Lfab;
      // 23: invokevirtual fab.v24 ()V
      // 26: goto 2d
      // 29: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c: athrow
      // 2d: aload 0
      // 2e: getfield crp.cj4 I
      // 31: iload 1
      // 32: ifne 56
      // 35: iflt 52
      // 38: goto 3f
      // 3b: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3e: athrow
      // 3f: aload 0
      // 40: getfield crp.cj4 I
      // 43: invokestatic nkx.vqm (I)V
      // 46: aload 0
      // 47: bipush -1
      // 48: putfield crp.cj4 I
      // 4b: goto 52
      // 4e: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 51: athrow
      // 52: aload 0
      // 53: getfield crp.emi Z
      // 56: iload 1
      // 57: ifne ad
      // 5a: ifeq 9a
      // 5d: goto 64
      // 60: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 63: athrow
      // 64: aload 0
      // 65: new fab
      // 68: dup
      // 69: aload 0
      // 6a: getfield crp.u2p Lbe7;
      // 6d: invokespecial fab.<init> (Lbe7;)V
      // 70: putfield crp.i65 Lfab;
      // 73: aload 0
      // 74: aload 3
      // 75: ldc -16.0
      // 77: nop
      // 78: bipush 1
      // 79: invokespecial crp.pyn (Lq3g;FZ)V
      // 7c: aload 3
      // 7d: invokevirtual q3g.xku ()V
      // 80: aload 3
      // 81: invokevirtual q3g.wcp ()V
      // 84: aload 0
      // 85: getfield crp.i65 Lfab;
      // 88: aload 3
      // 89: invokevirtual q3g.m24 ()Ljava/nio/ByteBuffer;
      // 8c: invokevirtual fab.err (Ljava/nio/ByteBuffer;)V
      // 8f: iload 1
      // 90: ifeq c3
      // 93: goto 9a
      // 96: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 99: athrow
      // 9a: aload 0
      // 9b: bipush 1
      // 9c: invokestatic nkx.ux1 (I)I
      // 9f: putfield crp.cj4 I
      // a2: aload 0
      // a3: getfield crp.cj4 I
      // a6: goto ad
      // a9: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ac: athrow
      // ad: sipush 4864
      // b0: invokestatic org/lwjgl/opengl/GL11.glNewList (II)V
      // b3: aload 0
      // b4: aload 3
      // b5: ldc -16.0
      // b7: nop
      // b8: bipush 1
      // b9: invokespecial crp.pyn (Lq3g;FZ)V
      // bc: aload 2
      // bd: invokevirtual jom.q7g ()V
      // c0: invokestatic org/lwjgl/opengl/GL11.glEndList ()V
      // c3: return
   }

   private void vho() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic jom.yut ()Ljom;
      // 03: astore 2
      // 04: invokestatic t9d.c ()I
      // 07: aload 2
      // 08: invokevirtual jom.zuq ()Lq3g;
      // 0b: astore 3
      // 0c: istore 1
      // 0d: aload 0
      // 0e: iload 1
      // 0f: ifne 2e
      // 12: getfield crp.o50 Lfab;
      // 15: ifnull 2d
      // 18: goto 1f
      // 1b: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: aload 0
      // 20: getfield crp.o50 Lfab;
      // 23: invokevirtual fab.v24 ()V
      // 26: goto 2d
      // 29: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c: athrow
      // 2d: aload 0
      // 2e: getfield crp.ul_ I
      // 31: iload 1
      // 32: ifne 56
      // 35: iflt 52
      // 38: goto 3f
      // 3b: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3e: athrow
      // 3f: aload 0
      // 40: getfield crp.ul_ I
      // 43: invokestatic nkx.vqm (I)V
      // 46: aload 0
      // 47: bipush -1
      // 48: putfield crp.ul_ I
      // 4b: goto 52
      // 4e: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 51: athrow
      // 52: aload 0
      // 53: getfield crp.emi Z
      // 56: iload 1
      // 57: ifne ad
      // 5a: ifeq 9a
      // 5d: goto 64
      // 60: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 63: athrow
      // 64: aload 0
      // 65: new fab
      // 68: dup
      // 69: aload 0
      // 6a: getfield crp.u2p Lbe7;
      // 6d: invokespecial fab.<init> (Lbe7;)V
      // 70: putfield crp.o50 Lfab;
      // 73: aload 0
      // 74: aload 3
      // 75: ldc 16.0
      // 77: nop
      // 78: bipush 0
      // 79: invokespecial crp.pyn (Lq3g;FZ)V
      // 7c: aload 3
      // 7d: invokevirtual q3g.xku ()V
      // 80: aload 3
      // 81: invokevirtual q3g.wcp ()V
      // 84: aload 0
      // 85: getfield crp.o50 Lfab;
      // 88: aload 3
      // 89: invokevirtual q3g.m24 ()Ljava/nio/ByteBuffer;
      // 8c: invokevirtual fab.err (Ljava/nio/ByteBuffer;)V
      // 8f: iload 1
      // 90: ifeq c3
      // 93: goto 9a
      // 96: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 99: athrow
      // 9a: aload 0
      // 9b: bipush 1
      // 9c: invokestatic nkx.ux1 (I)I
      // 9f: putfield crp.ul_ I
      // a2: aload 0
      // a3: getfield crp.ul_ I
      // a6: goto ad
      // a9: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ac: athrow
      // ad: sipush 4864
      // b0: invokestatic org/lwjgl/opengl/GL11.glNewList (II)V
      // b3: aload 0
      // b4: aload 3
      // b5: ldc 16.0
      // b7: nop
      // b8: bipush 0
      // b9: invokespecial crp.pyn (Lq3g;FZ)V
      // bc: aload 2
      // bd: invokevirtual jom.q7g ()V
      // c0: invokestatic org/lwjgl/opengl/GL11.glEndList ()V
      // c3: return
   }

   private void pyn(q3g var1, float var2, boolean var3) {
      byte var5 = 64;
      int var10000 = t9d.b();
      byte var6 = 6;
      var1.ezr(7, gnl.gx3);
      int var7 = (this.ez1 / 64 + 1) * 64 + 64;
      int var8 = -var7;
      int var4 = var10000;

      label46:
      while (true) {
         var10000 = var8;

         label44:
         while (var10000 <= var7) {
            int var9 = -var7;

            while (var9 <= var7) {
               float var10 = (float)var8;
               float var11 = (float)(var8 + 64);

               label52: {
                  try {
                     if (var4 == 0) {
                        break label52;
                     }

                     var10000 = var3;
                     if (var4 == 0) {
                        continue label44;
                     }
                  } catch (JsonSyntaxException var12) {
                     throw a(var12);
                  }

                  if (var10000 != 0) {
                     var11 = (float)var8;
                     var10 = (float)(var8 + 64);
                  }

                  var1.g5o((double)var10, (double)var2, (double)var9).pzw();
                  var1.g5o((double)var11, (double)var2, (double)var9).pzw();
                  var1.g5o((double)var11, (double)var2, (double)(var9 + 64)).pzw();
                  var1.g5o((double)var10, (double)var2, (double)(var9 + 64)).pzw();
                  var9 += 64;
               }

               if (var4 == 0) {
                  break;
               }
            }

            var8 += 64;
            if (var4 == 0) {
               return;
            }
            continue label46;
         }

         return;
      }
   }

   private void nlt() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic jom.yut ()Ljom;
      // 03: astore 2
      // 04: invokestatic t9d.c ()I
      // 07: aload 2
      // 08: invokevirtual jom.zuq ()Lq3g;
      // 0b: astore 3
      // 0c: istore 1
      // 0d: aload 0
      // 0e: iload 1
      // 0f: ifne 2e
      // 12: getfield crp.uu2 Lfab;
      // 15: ifnull 2d
      // 18: goto 1f
      // 1b: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: aload 0
      // 20: getfield crp.uu2 Lfab;
      // 23: invokevirtual fab.v24 ()V
      // 26: goto 2d
      // 29: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c: athrow
      // 2d: aload 0
      // 2e: getfield crp.jsw I
      // 31: iload 1
      // 32: ifne 56
      // 35: iflt 52
      // 38: goto 3f
      // 3b: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3e: athrow
      // 3f: aload 0
      // 40: getfield crp.jsw I
      // 43: invokestatic nkx.vqm (I)V
      // 46: aload 0
      // 47: bipush -1
      // 48: putfield crp.jsw I
      // 4b: goto 52
      // 4e: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 51: athrow
      // 52: aload 0
      // 53: getfield crp.emi Z
      // 56: iload 1
      // 57: ifne ac
      // 5a: ifeq 96
      // 5d: goto 64
      // 60: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 63: athrow
      // 64: aload 0
      // 65: new fab
      // 68: dup
      // 69: aload 0
      // 6a: getfield crp.u2p Lbe7;
      // 6d: invokespecial fab.<init> (Lbe7;)V
      // 70: putfield crp.uu2 Lfab;
      // 73: aload 0
      // 74: aload 3
      // 75: invokespecial crp.h4n (Lq3g;)V
      // 78: aload 3
      // 79: invokevirtual q3g.xku ()V
      // 7c: aload 3
      // 7d: invokevirtual q3g.wcp ()V
      // 80: aload 0
      // 81: getfield crp.uu2 Lfab;
      // 84: aload 3
      // 85: invokevirtual q3g.m24 ()Ljava/nio/ByteBuffer;
      // 88: invokevirtual fab.err (Ljava/nio/ByteBuffer;)V
      // 8b: iload 1
      // 8c: ifeq c1
      // 8f: goto 96
      // 92: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 95: athrow
      // 96: aload 0
      // 97: bipush 1
      // 98: invokestatic nkx.ux1 (I)I
      // 9b: putfield crp.jsw I
      // 9e: invokestatic hzu.dp2 ()V
      // a1: aload 0
      // a2: getfield crp.jsw I
      // a5: goto ac
      // a8: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ab: athrow
      // ac: sipush 4864
      // af: invokestatic org/lwjgl/opengl/GL11.glNewList (II)V
      // b2: aload 0
      // b3: aload 3
      // b4: invokespecial crp.h4n (Lq3g;)V
      // b7: aload 2
      // b8: invokevirtual jom.q7g ()V
      // bb: invokestatic org/lwjgl/opengl/GL11.glEndList ()V
      // be: invokestatic hzu.x3w ()V
      // c1: return
   }

   private void h4n(q3g param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: new java/util/Random
      // 003: dup
      // 004: ldc2_w 10842
      // 007: invokespecial java/util/Random.<init> (J)V
      // 00a: astore 3
      // 00b: aload 1
      // 00c: bipush 7
      // 00e: getstatic gnl.gx3 Lbe7;
      // 011: invokevirtual q3g.ezr (ILbe7;)V
      // 014: invokestatic t9d.c ()I
      // 017: bipush 0
      // 018: istore 4
      // 01a: istore 2
      // 01b: iload 4
      // 01d: sipush 1500
      // 020: if_icmpge 1c3
      // 023: aload 3
      // 024: invokevirtual java/util/Random.nextFloat ()F
      // 027: fconst_2
      // 028: fmul
      // 029: fconst_1
      // 02a: fsub
      // 02b: f2d
      // 02c: dstore 5
      // 02e: aload 3
      // 02f: invokevirtual java/util/Random.nextFloat ()F
      // 032: fconst_2
      // 033: fmul
      // 034: fconst_1
      // 035: fsub
      // 036: f2d
      // 037: dstore 7
      // 039: aload 3
      // 03a: invokevirtual java/util/Random.nextFloat ()F
      // 03d: fconst_2
      // 03e: fmul
      // 03f: fconst_1
      // 040: fsub
      // 041: f2d
      // 042: dstore 9
      // 044: ldc 0.15
      // 046: nop
      // 047: aload 3
      // 048: invokevirtual java/util/Random.nextFloat ()F
      // 04b: ldc 0.1
      // 04d: nop
      // 04e: fmul
      // 04f: fadd
      // 050: f2d
      // 051: dstore 11
      // 053: dload 5
      // 055: dload 5
      // 057: dmul
      // 058: dload 7
      // 05a: dload 7
      // 05c: dmul
      // 05d: dadd
      // 05e: dload 9
      // 060: dload 9
      // 062: dmul
      // 063: dadd
      // 064: dstore 13
      // 066: iload 2
      // 067: ifne 1bf
      // 06a: dload 13
      // 06c: dconst_1
      // 06d: dcmpg
      // 06e: ifge 1bc
      // 071: goto 078
      // 074: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 077: athrow
      // 078: dload 13
      // 07a: ldc2_w 0.01
      // 07d: iload 2
      // 07e: ifne 0b6
      // 081: goto 088
      // 084: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 087: athrow
      // 088: dcmpl
      // 089: ifle 1bc
      // 08c: goto 093
      // 08f: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 092: athrow
      // 093: dconst_1
      // 094: dload 13
      // 096: invokestatic java/lang/Math.sqrt (D)D
      // 099: ddiv
      // 09a: dstore 13
      // 09c: dload 5
      // 09e: dload 13
      // 0a0: dmul
      // 0a1: dstore 5
      // 0a3: dload 7
      // 0a5: dload 13
      // 0a7: dmul
      // 0a8: dstore 7
      // 0aa: dload 9
      // 0ac: dload 13
      // 0ae: dmul
      // 0af: dstore 9
      // 0b1: dload 5
      // 0b3: ldc2_w 100.0
      // 0b6: dmul
      // 0b7: dstore 15
      // 0b9: dload 7
      // 0bb: ldc2_w 100.0
      // 0be: dmul
      // 0bf: dstore 17
      // 0c1: dload 9
      // 0c3: ldc2_w 100.0
      // 0c6: dmul
      // 0c7: dstore 19
      // 0c9: dload 5
      // 0cb: dload 9
      // 0cd: invokestatic java/lang/Math.atan2 (DD)D
      // 0d0: dstore 21
      // 0d2: dload 21
      // 0d4: invokestatic java/lang/Math.sin (D)D
      // 0d7: dstore 23
      // 0d9: dload 21
      // 0db: invokestatic java/lang/Math.cos (D)D
      // 0de: dstore 25
      // 0e0: dload 5
      // 0e2: dload 5
      // 0e4: dmul
      // 0e5: dload 9
      // 0e7: dload 9
      // 0e9: dmul
      // 0ea: dadd
      // 0eb: invokestatic java/lang/Math.sqrt (D)D
      // 0ee: dload 7
      // 0f0: invokestatic java/lang/Math.atan2 (DD)D
      // 0f3: dstore 27
      // 0f5: dload 27
      // 0f7: invokestatic java/lang/Math.sin (D)D
      // 0fa: dstore 29
      // 0fc: dload 27
      // 0fe: invokestatic java/lang/Math.cos (D)D
      // 101: dstore 31
      // 103: aload 3
      // 104: invokevirtual java/util/Random.nextDouble ()D
      // 107: ldc2_w 3.141592653589793
      // 10a: dmul
      // 10b: ldc2_w 2.0
      // 10e: dmul
      // 10f: dstore 33
      // 111: dload 33
      // 113: invokestatic java/lang/Math.sin (D)D
      // 116: dstore 35
      // 118: dload 33
      // 11a: invokestatic java/lang/Math.cos (D)D
      // 11d: dstore 37
      // 11f: bipush 0
      // 120: istore 39
      // 122: iload 39
      // 124: bipush 4
      // 125: if_icmpge 1bc
      // 128: dconst_0
      // 129: dstore 40
      // 12b: iload 39
      // 12d: bipush 2
      // 12e: iand
      // 12f: bipush 1
      // 130: isub
      // 131: i2d
      // 132: dload 11
      // 134: dmul
      // 135: dstore 42
      // 137: iload 39
      // 139: bipush 1
      // 13a: iadd
      // 13b: bipush 2
      // 13c: iand
      // 13d: bipush 1
      // 13e: isub
      // 13f: i2d
      // 140: dload 11
      // 142: dmul
      // 143: dstore 44
      // 145: dconst_0
      // 146: dstore 46
      // 148: dload 42
      // 14a: dload 37
      // 14c: dmul
      // 14d: dload 44
      // 14f: dload 35
      // 151: dmul
      // 152: dsub
      // 153: dstore 48
      // 155: dload 44
      // 157: dload 37
      // 159: dmul
      // 15a: dload 42
      // 15c: dload 35
      // 15e: dmul
      // 15f: dadd
      // 160: dstore 50
      // 162: dload 48
      // 164: dload 29
      // 166: dmul
      // 167: dconst_0
      // 168: dload 31
      // 16a: dmul
      // 16b: dadd
      // 16c: dstore 52
      // 16e: dconst_0
      // 16f: dload 29
      // 171: dmul
      // 172: dload 48
      // 174: dload 31
      // 176: dmul
      // 177: dsub
      // 178: dstore 54
      // 17a: dload 54
      // 17c: dload 23
      // 17e: dmul
      // 17f: dload 50
      // 181: dload 25
      // 183: dmul
      // 184: dsub
      // 185: dstore 56
      // 187: dload 50
      // 189: dload 23
      // 18b: dmul
      // 18c: dload 54
      // 18e: dload 25
      // 190: dmul
      // 191: dadd
      // 192: dstore 58
      // 194: aload 1
      // 195: dload 15
      // 197: dload 56
      // 199: dadd
      // 19a: dload 17
      // 19c: dload 52
      // 19e: dadd
      // 19f: dload 19
      // 1a1: dload 58
      // 1a3: dadd
      // 1a4: invokevirtual q3g.g5o (DDD)Lq3g;
      // 1a7: invokevirtual q3g.pzw ()V
      // 1aa: iinc 39 1
      // 1ad: iload 2
      // 1ae: ifne 1bf
      // 1b1: iload 2
      // 1b2: ifeq 122
      // 1b5: goto 1bc
      // 1b8: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1bb: athrow
      // 1bc: iinc 4 1
      // 1bf: iload 2
      // 1c0: ifeq 01b
      // 1c3: return
   }

   public void t_5(kh3 param1) {
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
      // 05: iload 2
      // 06: ifne 58
      // 09: getfield crp.t6z Lkh3;
      // 0c: ifnull 25
      // 0f: goto 16
      // 12: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: getfield crp.t6z Lkh3;
      // 1a: aload 0
      // 1b: invokevirtual kh3.ysd (Lu60;)V
      // 1e: goto 25
      // 21: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: aload 0
      // 26: ldc2_w 4.9E-324
      // 29: putfield crp.gxe D
      // 2c: aload 0
      // 2d: ldc2_w 4.9E-324
      // 30: putfield crp.ex0 D
      // 33: aload 0
      // 34: ldc2_w 4.9E-324
      // 37: putfield crp.rv_ D
      // 3a: aload 0
      // 3b: ldc -2147483648
      // 3d: nop
      // 3e: putfield crp.ivg I
      // 41: aload 0
      // 42: ldc -2147483648
      // 44: nop
      // 45: putfield crp.bg4 I
      // 48: aload 0
      // 49: ldc -2147483648
      // 4b: nop
      // 4c: putfield crp.o3i I
      // 4f: aload 0
      // 50: getfield crp.h3f Lhr_;
      // 53: aload 1
      // 54: invokevirtual hr_.coo (Lt9d;)V
      // 57: aload 0
      // 58: aload 1
      // 59: putfield crp.t6z Lkh3;
      // 5c: iload 2
      // 5d: ifne 9a
      // 60: invokestatic hxt.csr ()Z
      // 63: ifeq 77
      // 66: goto 6d
      // 69: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6c: athrow
      // 6d: invokestatic net/optifine/DynamicLights.clear ()V
      // 70: goto 77
      // 73: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 76: athrow
      // 77: invokestatic net/optifine/render/ChunkVisibility.reset ()V
      // 7a: aload 0
      // 7b: aconst_null
      // 7c: putfield crp.ips Lg6k;
      // 7f: aload 0
      // 80: aconst_null
      // 81: putfield crp.jgu Lyo9;
      // 84: aload 0
      // 85: getfield crp.pop Lnet/optifine/render/RenderEnv;
      // 88: aconst_null
      // 89: checkcast zfz
      // 8c: aconst_null
      // 8d: checkcast mew
      // 90: invokevirtual net/optifine/render/RenderEnv.reset (Lzfz;Lmew;)V
      // 93: aload 0
      // 94: getfield crp.t6z Lkh3;
      // 97: invokestatic net/optifine/shaders/Shaders.checkWorldChanged (Lt9d;)V
      // 9a: iload 2
      // 9b: ifne d1
      // 9e: aload 1
      // 9f: ifnull bd
      // a2: goto a9
      // a5: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a8: athrow
      // a9: aload 1
      // aa: aload 0
      // ab: invokevirtual kh3.wox (Lu60;)V
      // ae: aload 0
      // af: invokevirtual crp.f9n ()V
      // b2: iload 2
      // b3: ifeq f6
      // b6: goto bd
      // b9: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // bc: athrow
      // bd: aload 0
      // be: getfield crp.l0i Ljava/util/Set;
      // c1: invokeinterface java/util/Set.clear ()V 1
      // c6: aload 0
      // c7: invokespecial crp.ixl ()V
      // ca: goto d1
      // cd: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // d0: athrow
      // d1: aload 0
      // d2: iload 2
      // d3: ifne f2
      // d6: getfield crp.o6x Lc1s;
      // d9: ifnull f1
      // dc: goto e3
      // df: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // e2: athrow
      // e3: aload 0
      // e4: getfield crp.o6x Lc1s;
      // e7: invokevirtual c1s.dfb ()V
      // ea: goto f1
      // ed: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // f0: athrow
      // f1: aload 0
      // f2: aconst_null
      // f3: putfield crp.o6x Lc1s;
      // f6: return
   }

   public void f9n() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 1
      // 004: aload 0
      // 005: iload 1
      // 006: ifeq 1c4
      // 009: getfield crp.t6z Lkh3;
      // 00c: ifnull 1c3
      // 00f: goto 016
      // 012: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 015: athrow
      // 016: aload 0
      // 017: bipush 1
      // 018: putfield crp.jli Z
      // 01b: getstatic ox_.rwl L_cv;
      // 01e: invokestatic hxt.hmy ()Z
      // 021: invokevirtual _cv.gku (Z)V
      // 024: getstatic ox_.x_c L_cv;
      // 027: invokestatic hxt.hmy ()Z
      // 02a: invokevirtual _cv.gku (Z)V
      // 02d: invokestatic g_x.o20 ()V
      // 030: invokestatic hxt.csr ()Z
      // 033: iload 1
      // 034: ifeq 078
      // 037: goto 03e
      // 03a: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03d: athrow
      // 03e: ifeq 04b
      // 041: goto 048
      // 044: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 047: athrow
      // 048: invokestatic net/optifine/DynamicLights.clear ()V
      // 04b: invokestatic net/optifine/SmartAnimations.update ()V
      // 04e: aload 0
      // 04f: aload 0
      // 050: getfield crp.j0u Lc05;
      // 053: getfield c05.oxn Lmoh;
      // 056: getfield moh.gcj I
      // 059: putfield crp.bsi I
      // 05c: aload 0
      // 05d: aload 0
      // 05e: getfield crp.bsi I
      // 061: bipush 16
      // 063: imul
      // 064: putfield crp.ez1 I
      // 067: aload 0
      // 068: aload 0
      // 069: getfield crp.ez1 I
      // 06c: aload 0
      // 06d: getfield crp.ez1 I
      // 070: imul
      // 071: putfield crp.qn7 I
      // 074: aload 0
      // 075: getfield crp.emi Z
      // 078: istore 2
      // 079: aload 0
      // 07a: invokestatic gis.eyg ()Z
      // 07d: putfield crp.emi Z
      // 080: iload 2
      // 081: iload 1
      // 082: ifeq 0d1
      // 085: ifeq 0c9
      // 088: goto 08f
      // 08b: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08e: athrow
      // 08f: aload 0
      // 090: getfield crp.emi Z
      // 093: iload 1
      // 094: ifeq 0d1
      // 097: goto 09e
      // 09a: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09d: athrow
      // 09e: ifne 0c9
      // 0a1: goto 0a8
      // 0a4: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a7: athrow
      // 0a8: aload 0
      // 0a9: new ko7
      // 0ac: dup
      // 0ad: invokespecial ko7.<init> ()V
      // 0b0: putfield crp.f9a Lofj;
      // 0b3: aload 0
      // 0b4: new b00
      // 0b7: dup
      // 0b8: invokespecial b00.<init> ()V
      // 0bb: putfield crp.a3o Leg6;
      // 0be: iload 1
      // 0bf: ifne 115
      // 0c2: goto 0c9
      // 0c5: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c8: athrow
      // 0c9: iload 2
      // 0ca: goto 0d1
      // 0cd: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d0: athrow
      // 0d1: iload 1
      // 0d2: ifeq 0f5
      // 0d5: ifne 115
      // 0d8: goto 0df
      // 0db: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0de: athrow
      // 0df: aload 0
      // 0e0: iload 1
      // 0e1: ifeq 122
      // 0e4: goto 0eb
      // 0e7: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ea: athrow
      // 0eb: getfield crp.emi Z
      // 0ee: goto 0f5
      // 0f1: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f4: athrow
      // 0f5: ifeq 115
      // 0f8: aload 0
      // 0f9: new m21
      // 0fc: dup
      // 0fd: invokespecial m21.<init> ()V
      // 100: putfield crp.f9a Lofj;
      // 103: aload 0
      // 104: new cum
      // 107: dup
      // 108: invokespecial cum.<init> ()V
      // 10b: putfield crp.a3o Leg6;
      // 10e: goto 115
      // 111: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 114: athrow
      // 115: aload 0
      // 116: invokespecial crp.nlt ()V
      // 119: aload 0
      // 11a: invokespecial crp.vho ()V
      // 11d: aload 0
      // 11e: invokespecial crp.xkn ()V
      // 121: aload 0
      // 122: iload 1
      // 123: ifeq 146
      // 126: getfield crp.o6x Lc1s;
      // 129: ifnull 141
      // 12c: goto 133
      // 12f: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 132: athrow
      // 133: aload 0
      // 134: getfield crp.o6x Lc1s;
      // 137: invokevirtual c1s.dfb ()V
      // 13a: goto 141
      // 13d: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 140: athrow
      // 141: aload 0
      // 142: invokevirtual crp.cm5 ()V
      // 145: aload 0
      // 146: getfield crp.h7f Ljava/util/Set;
      // 149: dup
      // 14a: astore 3
      // 14b: monitorenter
      // 14c: aload 0
      // 14d: getfield crp.h7f Ljava/util/Set;
      // 150: invokeinterface java/util/Set.clear ()V 1
      // 155: aload 3
      // 156: monitorexit
      // 157: goto 161
      // 15a: astore 4
      // 15c: aload 3
      // 15d: monitorexit
      // 15e: aload 4
      // 160: athrow
      // 161: aload 0
      // 162: new c1s
      // 165: dup
      // 166: aload 0
      // 167: getfield crp.t6z Lkh3;
      // 16a: aload 0
      // 16b: getfield crp.j0u Lc05;
      // 16e: getfield c05.oxn Lmoh;
      // 171: getfield moh.gcj I
      // 174: aload 0
      // 175: aload 0
      // 176: getfield crp.a3o Leg6;
      // 179: invokespecial c1s.<init> (Lt9d;ILcrp;Leg6;)V
      // 17c: putfield crp.o6x Lc1s;
      // 17f: aload 0
      // 180: iload 1
      // 181: ifeq 1bf
      // 184: getfield crp.t6z Lkh3;
      // 187: ifnull 1be
      // 18a: goto 191
      // 18d: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 190: athrow
      // 191: aload 0
      // 192: iload 1
      // 193: ifeq 1bf
      // 196: goto 19d
      // 199: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19c: athrow
      // 19d: getfield crp.j0u Lc05;
      // 1a0: invokevirtual c05.nsd ()Li2h;
      // 1a3: astore 3
      // 1a4: aload 3
      // 1a5: ifnull 1be
      // 1a8: aload 0
      // 1a9: getfield crp.o6x Lc1s;
      // 1ac: aload 3
      // 1ad: getfield i2h.o2v D
      // 1b0: aload 3
      // 1b1: getfield i2h.vbd D
      // 1b4: invokevirtual c1s.b4a (DD)V
      // 1b7: goto 1be
      // 1ba: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1bd: athrow
      // 1be: aload 0
      // 1bf: bipush 2
      // 1c0: putfield crp.me1 I
      // 1c3: aload 0
      // 1c4: iload 1
      // 1c5: ifeq 1e0
      // 1c8: getfield crp.j0u Lc05;
      // 1cb: getfield c05.vg8 Ll86;
      // 1ce: ifnonnull 1e4
      // 1d1: goto 1d8
      // 1d4: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d7: athrow
      // 1d8: aload 0
      // 1d9: goto 1e0
      // 1dc: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1df: athrow
      // 1e0: bipush 1
      // 1e1: putfield crp.f4x Z
      // 1e4: return
   }

   public void cm5() {
      this.l0i.clear();
      this.isn.nq2();
   }

   public void w4e(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: getstatic gis.jap Z
      // 07: ifeq 33
      // 0a: aload 0
      // 0b: getfield crp.vrx Lqn4;
      // 0e: iload 3
      // 0f: ifne 2e
      // 12: goto 19
      // 15: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: ifnull 33
      // 1c: goto 23
      // 1f: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22: athrow
      // 23: aload 0
      // 24: getfield crp.vrx Lqn4;
      // 27: goto 2e
      // 2a: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d: athrow
      // 2e: iload 1
      // 2f: iload 2
      // 30: invokevirtual qn4.s_6 (II)V
      // 33: return
   }

   public void _q6(i2h param1, _aq param2, float param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic crp.a J
      // 003: ldc2_w 109297251977793
      // 006: lxor
      // 007: lstore 4
      // 009: invokestatic t9d.b ()I
      // 00c: istore 6
      // 00e: bipush 0
      // 00f: istore 7
      // 011: getstatic net/optifine/reflect/Reflector.MinecraftForgeClient_getRenderPass Lnet/optifine/reflect/ReflectorMethod;
      // 014: invokevirtual net/optifine/reflect/ReflectorMethod.exists ()Z
      // 017: iload 6
      // 019: ifeq 036
      // 01c: ifeq 032
      // 01f: goto 026
      // 022: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 025: athrow
      // 026: getstatic net/optifine/reflect/Reflector.MinecraftForgeClient_getRenderPass Lnet/optifine/reflect/ReflectorMethod;
      // 029: bipush 0
      // 02a: anewarray 70
      // 02d: invokestatic net/optifine/reflect/Reflector.callInt (Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)I
      // 030: istore 7
      // 032: aload 0
      // 033: getfield crp.me1 I
      // 036: iload 6
      // 038: ifeq 047
      // 03b: ifle 05a
      // 03e: goto 045
      // 041: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 044: athrow
      // 045: iload 7
      // 047: ifle 04b
      // 04a: return
      // 04b: aload 0
      // 04c: dup
      // 04d: getfield crp.me1 I
      // 050: bipush 1
      // 051: isub
      // 052: putfield crp.me1 I
      // 055: iload 6
      // 057: ifne c9f
      // 05a: aload 1
      // 05b: getfield i2h.bc1 D
      // 05e: aload 1
      // 05f: getfield i2h.o2v D
      // 062: aload 1
      // 063: getfield i2h.bc1 D
      // 066: dsub
      // 067: fload 3
      // 068: f2d
      // 069: dmul
      // 06a: dadd
      // 06b: dstore 8
      // 06d: aload 1
      // 06e: getfield i2h.o_z D
      // 071: aload 1
      // 072: getfield i2h.kfp D
      // 075: aload 1
      // 076: getfield i2h.o_z D
      // 079: dsub
      // 07a: fload 3
      // 07b: f2d
      // 07c: dmul
      // 07d: dadd
      // 07e: dstore 10
      // 080: aload 1
      // 081: getfield i2h.a4d D
      // 084: aload 1
      // 085: getfield i2h.vbd D
      // 088: aload 1
      // 089: getfield i2h.a4d D
      // 08c: dsub
      // 08d: fload 3
      // 08e: f2d
      // 08f: dmul
      // 090: dadd
      // 091: dstore 12
      // 093: aload 0
      // 094: getfield crp.t6z Lkh3;
      // 097: getfield kh3.e8t Luan;
      // 09a: sipush 30800
      // 09d: ldc2_w 2529473194406224083
      // 0a0: lload 4
      // 0a2: lxor
      // 0a3: invokedynamic j (IJ)Ljava/lang/String; bsm=crp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a8: nop
      // 0a9: invokevirtual uan.qek (Ljava/lang/String;)V
      // 0ac: getstatic xv4.b2r Lxv4;
      // 0af: aload 0
      // 0b0: getfield crp.t6z Lkh3;
      // 0b3: aload 0
      // 0b4: getfield crp.j0u Lc05;
      // 0b7: invokevirtual c05.l22 ()Llc5;
      // 0ba: aload 0
      // 0bb: getfield crp.j0u Lc05;
      // 0be: getfield c05.tx1 Lowt;
      // 0c1: aload 0
      // 0c2: getfield crp.j0u Lc05;
      // 0c5: invokevirtual c05.nsd ()Li2h;
      // 0c8: fload 3
      // 0c9: invokevirtual xv4.udj (Lt9d;Llc5;Lowt;Li2h;F)V
      // 0cc: aload 0
      // 0cd: iload 6
      // 0cf: ifeq 129
      // 0d2: getfield crp.h3f Lhr_;
      // 0d5: aload 0
      // 0d6: getfield crp.t6z Lkh3;
      // 0d9: aload 0
      // 0da: getfield crp.j0u Lc05;
      // 0dd: getfield c05.tx1 Lowt;
      // 0e0: aload 0
      // 0e1: getfield crp.j0u Lc05;
      // 0e4: invokevirtual c05.nsd ()Li2h;
      // 0e7: aload 0
      // 0e8: getfield crp.j0u Lc05;
      // 0eb: getfield c05.p3_ Li2h;
      // 0ee: aload 0
      // 0ef: getfield crp.j0u Lc05;
      // 0f2: getfield c05.oxn Lmoh;
      // 0f5: fload 3
      // 0f6: invokevirtual hr_.gvh (Lt9d;Lowt;Li2h;Li2h;Lmoh;F)V
      // 0f9: getstatic crp.pp5 I
      // 0fc: bipush 1
      // 0fd: iadd
      // 0fe: putstatic crp.pp5 I
      // 101: iload 7
      // 103: ifne 128
      // 106: goto 10d
      // 109: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10c: athrow
      // 10d: aload 0
      // 10e: bipush 0
      // 10f: putfield crp.z1b I
      // 112: aload 0
      // 113: bipush 0
      // 114: putfield crp.yoz I
      // 117: aload 0
      // 118: bipush 0
      // 119: putfield crp.ofr I
      // 11c: aload 0
      // 11d: bipush 0
      // 11e: putfield crp.obc I
      // 121: goto 128
      // 124: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 127: athrow
      // 128: aload 0
      // 129: getfield crp.j0u Lc05;
      // 12c: invokevirtual c05.nsd ()Li2h;
      // 12f: astore 14
      // 131: aload 14
      // 133: getfield i2h.ivp D
      // 136: aload 14
      // 138: getfield i2h.o2v D
      // 13b: aload 14
      // 13d: getfield i2h.ivp D
      // 140: dsub
      // 141: fload 3
      // 142: f2d
      // 143: dmul
      // 144: dadd
      // 145: dstore 15
      // 147: aload 14
      // 149: getfield i2h.c54 D
      // 14c: aload 14
      // 14e: getfield i2h.kfp D
      // 151: aload 14
      // 153: getfield i2h.c54 D
      // 156: dsub
      // 157: fload 3
      // 158: f2d
      // 159: dmul
      // 15a: dadd
      // 15b: dstore 17
      // 15d: aload 14
      // 15f: getfield i2h.e2b D
      // 162: aload 14
      // 164: getfield i2h.vbd D
      // 167: aload 14
      // 169: getfield i2h.e2b D
      // 16c: dsub
      // 16d: fload 3
      // 16e: f2d
      // 16f: dmul
      // 170: dadd
      // 171: dstore 19
      // 173: dload 15
      // 175: putstatic xv4.pia D
      // 178: dload 17
      // 17a: putstatic xv4.i9n D
      // 17d: dload 19
      // 17f: putstatic xv4.ltj D
      // 182: aload 0
      // 183: getfield crp.h3f Lhr_;
      // 186: dload 15
      // 188: dload 17
      // 18a: dload 19
      // 18c: invokevirtual hr_.ojk (DDD)V
      // 18f: aload 0
      // 190: getfield crp.j0u Lc05;
      // 193: getfield c05.x0p Lv3i;
      // 196: invokevirtual v3i.u_c ()V
      // 199: aload 0
      // 19a: getfield crp.t6z Lkh3;
      // 19d: getfield kh3.e8t Luan;
      // 1a0: sipush 5280
      // 1a3: ldc2_w 6656305559610805276
      // 1a6: lload 4
      // 1a8: lxor
      // 1a9: invokedynamic j (IJ)Ljava/lang/String; bsm=crp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ae: nop
      // 1af: invokevirtual uan.v2l (Ljava/lang/String;)V
      // 1b2: aload 0
      // 1b3: getfield crp.t6z Lkh3;
      // 1b6: invokevirtual kh3.xa0 ()Ljava/util/List;
      // 1b9: astore 21
      // 1bb: iload 7
      // 1bd: iload 6
      // 1bf: ifeq 1e1
      // 1c2: ifne 1de
      // 1c5: goto 1cc
      // 1c8: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1cb: athrow
      // 1cc: aload 0
      // 1cd: aload 21
      // 1cf: invokeinterface java/util/List.size ()I 1
      // 1d4: putfield crp.z1b I
      // 1d7: goto 1de
      // 1da: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1dd: athrow
      // 1de: invokestatic hxt.o2a ()Z
      // 1e1: iload 6
      // 1e3: ifeq 219
      // 1e6: ifeq 213
      // 1e9: goto 1f0
      // 1ec: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ef: athrow
      // 1f0: aload 0
      // 1f1: getfield crp.j0u Lc05;
      // 1f4: getfield c05.x0p Lv3i;
      // 1f7: getfield v3i.ndn Z
      // 1fa: iload 6
      // 1fc: ifeq 219
      // 1ff: goto 206
      // 202: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 205: athrow
      // 206: ifeq 213
      // 209: goto 210
      // 20c: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20f: athrow
      // 210: invokestatic hzu.gcp ()V
      // 213: getstatic net/optifine/reflect/Reflector.ForgeEntity_shouldRenderInPass Lnet/optifine/reflect/ReflectorMethod;
      // 216: invokevirtual net/optifine/reflect/ReflectorMethod.exists ()Z
      // 219: istore 22
      // 21b: getstatic net/optifine/reflect/Reflector.ForgeTileEntity_shouldRenderInPass Lnet/optifine/reflect/ReflectorMethod;
      // 21e: invokevirtual net/optifine/reflect/ReflectorMethod.exists ()Z
      // 221: istore 23
      // 223: bipush 0
      // 224: istore 24
      // 226: iload 24
      // 228: aload 0
      // 229: getfield crp.t6z Lkh3;
      // 22c: getfield kh3.u80 Ljava/util/List;
      // 22f: invokeinterface java/util/List.size ()I 1
      // 234: if_icmpge 2d6
      // 237: aload 0
      // 238: getfield crp.t6z Lkh3;
      // 23b: getfield kh3.u80 Ljava/util/List;
      // 23e: iload 24
      // 240: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 245: checkcast i2h
      // 248: astore 25
      // 24a: iload 22
      // 24c: iload 6
      // 24e: ifeq 2da
      // 251: iload 6
      // 253: ifeq 2b9
      // 256: goto 25d
      // 259: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25c: athrow
      // 25d: ifeq 291
      // 260: goto 267
      // 263: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 266: athrow
      // 267: aload 25
      // 269: getstatic net/optifine/reflect/Reflector.ForgeEntity_shouldRenderInPass Lnet/optifine/reflect/ReflectorMethod;
      // 26c: bipush 1
      // 26d: anewarray 70
      // 270: dup
      // 271: bipush 0
      // 272: iload 7
      // 274: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 277: aastore
      // 278: invokestatic net/optifine/reflect/Reflector.callBoolean (Ljava/lang/Object;Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)Z
      // 27b: iload 6
      // 27d: ifeq 2b9
      // 280: goto 287
      // 283: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 286: athrow
      // 287: ifeq 2ce
      // 28a: goto 291
      // 28d: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 290: athrow
      // 291: aload 0
      // 292: dup
      // 293: getfield crp.yoz I
      // 296: bipush 1
      // 297: iadd
      // 298: putfield crp.yoz I
      // 29b: iload 6
      // 29d: ifeq 2d1
      // 2a0: goto 2a7
      // 2a3: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a6: athrow
      // 2a7: aload 25
      // 2a9: dload 8
      // 2ab: dload 10
      // 2ad: dload 12
      // 2af: invokevirtual i2h.e4f (DDD)Z
      // 2b2: goto 2b9
      // 2b5: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b8: athrow
      // 2b9: ifeq 2ce
      // 2bc: aload 0
      // 2bd: getfield crp.h3f Lhr_;
      // 2c0: aload 25
      // 2c2: fload 3
      // 2c3: invokevirtual hr_.dxc (Li2h;F)Z
      // 2c6: pop
      // 2c7: goto 2ce
      // 2ca: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2cd: athrow
      // 2ce: iinc 24 1
      // 2d1: iload 6
      // 2d3: ifne 226
      // 2d6: aload 0
      // 2d7: invokevirtual crp._53 ()Z
      // 2da: iload 6
      // 2dc: ifeq 4f8
      // 2df: ifeq 4d8
      // 2e2: goto 2e9
      // 2e5: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e8: athrow
      // 2e9: sipush 519
      // 2ec: invokestatic hzu.d14 (I)V
      // 2ef: invokestatic hzu.gcp ()V
      // 2f2: aload 0
      // 2f3: getfield crp.h5t Loru;
      // 2f6: invokevirtual oru.xix ()V
      // 2f9: aload 0
      // 2fa: getfield crp.h5t Loru;
      // 2fd: bipush 0
      // 2fe: invokevirtual oru.mou (Z)V
      // 301: aload 0
      // 302: getfield crp.t6z Lkh3;
      // 305: getfield kh3.e8t Luan;
      // 308: sipush 4763
      // 30b: ldc2_w 4395903895571581480
      // 30e: lload 4
      // 310: lxor
      // 311: invokedynamic j (IJ)Ljava/lang/String; bsm=crp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 316: nop
      // 317: invokevirtual uan.v2l (Ljava/lang/String;)V
      // 31a: invokestatic qpm.cng ()V
      // 31d: aload 0
      // 31e: getfield crp.h3f Lhr_;
      // 321: bipush 1
      // 322: invokevirtual hr_.n8u (Z)V
      // 325: bipush 0
      // 326: istore 24
      // 328: iload 24
      // 32a: aload 21
      // 32c: invokeinterface java/util/List.size ()I 1
      // 331: if_icmpge 49a
      // 334: aload 21
      // 336: iload 24
      // 338: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 33d: checkcast i2h
      // 340: astore 25
      // 342: aload 0
      // 343: getfield crp.j0u Lc05;
      // 346: invokevirtual c05.nsd ()Li2h;
      // 349: instanceof g_3
      // 34c: iload 6
      // 34e: ifeq 4cf
      // 351: iload 6
      // 353: ifeq 37b
      // 356: goto 35d
      // 359: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 35c: athrow
      // 35d: ifeq 38e
      // 360: goto 367
      // 363: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 366: athrow
      // 367: aload 0
      // 368: getfield crp.j0u Lc05;
      // 36b: invokevirtual c05.nsd ()Li2h;
      // 36e: checkcast g_3
      // 371: invokevirtual g_3.ofg ()Z
      // 374: goto 37b
      // 377: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37a: athrow
      // 37b: iload 6
      // 37d: ifeq 38b
      // 380: ifeq 38e
      // 383: goto 38a
      // 386: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 389: athrow
      // 38a: bipush 1
      // 38b: goto 38f
      // 38e: bipush 0
      // 38f: istore 26
      // 391: aload 25
      // 393: dload 8
      // 395: dload 10
      // 397: dload 12
      // 399: invokevirtual i2h.e4f (DDD)Z
      // 39c: iload 6
      // 39e: ifeq 3b7
      // 3a1: ifeq 428
      // 3a4: goto 3ab
      // 3a7: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3aa: athrow
      // 3ab: aload 25
      // 3ad: getfield i2h.k50 Z
      // 3b0: goto 3b7
      // 3b3: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b6: athrow
      // 3b7: iload 6
      // 3b9: ifeq 415
      // 3bc: ifne 409
      // 3bf: goto 3c6
      // 3c2: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c5: athrow
      // 3c6: aload 2
      // 3c7: aload 25
      // 3c9: invokevirtual i2h.aaw ()Lnh4;
      // 3cc: invokeinterface _aq.n2v (Lnh4;)Z 2
      // 3d1: iload 6
      // 3d3: ifeq 415
      // 3d6: goto 3dd
      // 3d9: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3dc: athrow
      // 3dd: ifne 409
      // 3e0: goto 3e7
      // 3e3: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3e6: athrow
      // 3e7: aload 25
      // 3e9: getfield i2h.wgv Li2h;
      // 3ec: iload 6
      // 3ee: ifeq 412
      // 3f1: goto 3f8
      // 3f4: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3f7: athrow
      // 3f8: aload 0
      // 3f9: getfield crp.j0u Lc05;
      // 3fc: getfield c05.vg8 Ll86;
      // 3ff: if_acmpne 428
      // 402: goto 409
      // 405: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 408: athrow
      // 409: aload 25
      // 40b: goto 412
      // 40e: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 411: athrow
      // 412: instanceof ha9
      // 415: iload 6
      // 417: ifeq 425
      // 41a: ifeq 428
      // 41d: goto 424
      // 420: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 423: athrow
      // 424: bipush 1
      // 425: goto 429
      // 428: bipush 0
      // 429: istore 27
      // 42b: aload 25
      // 42d: aload 0
      // 42e: getfield crp.j0u Lc05;
      // 431: invokevirtual c05.nsd ()Li2h;
      // 434: if_acmpne 46f
      // 437: aload 0
      // 438: getfield crp.j0u Lc05;
      // 43b: getfield c05.oxn Lmoh;
      // 43e: getfield moh.i_y I
      // 441: iload 6
      // 443: ifeq 471
      // 446: goto 44d
      // 449: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 44c: athrow
      // 44d: ifne 46f
      // 450: goto 457
      // 453: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 456: athrow
      // 457: iload 26
      // 459: iload 6
      // 45b: ifeq 471
      // 45e: goto 465
      // 461: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 464: athrow
      // 465: ifeq 492
      // 468: goto 46f
      // 46b: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 46e: athrow
      // 46f: iload 27
      // 471: iload 6
      // 473: ifeq 491
      // 476: ifeq 492
      // 479: goto 480
      // 47c: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 47f: athrow
      // 480: aload 0
      // 481: getfield crp.h3f Lhr_;
      // 484: aload 25
      // 486: fload 3
      // 487: invokevirtual hr_.dxc (Li2h;F)Z
      // 48a: goto 491
      // 48d: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 490: athrow
      // 491: pop
      // 492: iinc 24 1
      // 495: iload 6
      // 497: ifne 328
      // 49a: aload 0
      // 49b: getfield crp.h3f Lhr_;
      // 49e: bipush 0
      // 49f: invokevirtual hr_.n8u (Z)V
      // 4a2: invokestatic qpm.ne_ ()V
      // 4a5: bipush 0
      // 4a6: invokestatic hzu.jun (Z)V
      // 4a9: aload 0
      // 4aa: getfield crp.vrx Lqn4;
      // 4ad: fload 3
      // 4ae: invokevirtual qn4.hii (F)V
      // 4b1: invokestatic hzu.s7q ()V
      // 4b4: bipush 1
      // 4b5: invokestatic hzu.jun (Z)V
      // 4b8: aload 0
      // 4b9: getfield crp.j0u Lc05;
      // 4bc: invokevirtual c05._d2 ()Loru;
      // 4bf: bipush 0
      // 4c0: invokevirtual oru.mou (Z)V
      // 4c3: invokestatic hzu.xmh ()V
      // 4c6: invokestatic hzu.spd ()V
      // 4c9: invokestatic hzu.avm ()V
      // 4cc: sipush 515
      // 4cf: invokestatic hzu.d14 (I)V
      // 4d2: invokestatic hzu.m45 ()V
      // 4d5: invokestatic hzu.if9 ()V
      // 4d8: aload 0
      // 4d9: getfield crp.t6z Lkh3;
      // 4dc: getfield kh3.e8t Luan;
      // 4df: sipush 26728
      // 4e2: ldc2_w 6163349108156805356
      // 4e5: lload 4
      // 4e7: lxor
      // 4e8: invokedynamic j (IJ)Ljava/lang/String; bsm=crp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ed: nop
      // 4ee: invokevirtual uan.v2l (Ljava/lang/String;)V
      // 4f1: invokestatic hxt.ly3 ()Z
      // 4f4: istore 24
      // 4f6: iload 24
      // 4f8: iload 6
      // 4fa: ifeq 517
      // 4fd: ifeq 50a
      // 500: goto 507
      // 503: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 506: athrow
      // 507: invokestatic net/optifine/shaders/Shaders.beginEntities ()V
      // 50a: invokestatic wo8.adh ()V
      // 50d: aload 0
      // 50e: getfield crp.j0u Lc05;
      // 511: getfield c05.oxn Lmoh;
      // 514: getfield moh.i37 Z
      // 517: istore 25
      // 519: aload 0
      // 51a: getfield crp.j0u Lc05;
      // 51d: getfield c05.oxn Lmoh;
      // 520: invokestatic hxt.d34 ()Z
      // 523: putfield moh.i37 Z
      // 526: aload 0
      // 527: getfield crp.fo5 Ljava/util/List;
      // 52a: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 52f: astore 26
      // 531: aload 26
      // 533: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 538: ifeq 81c
      // 53b: aload 26
      // 53d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 542: astore 27
      // 544: aload 27
      // 546: checkcast crp$j3h
      // 549: getfield crp$j3h.xvr Lkqk;
      // 54c: invokevirtual kqk.v5v ()Ltts;
      // 54f: astore 28
      // 551: aload 28
      // 553: invokevirtual tts.qfq ()[Leqg;
      // 556: aload 27
      // 558: checkcast crp$j3h
      // 55b: getfield crp$j3h.xvr Lkqk;
      // 55e: invokevirtual kqk.a7g ()Lmew;
      // 561: invokevirtual mew.getY ()I
      // 564: bipush 16
      // 566: idiv
      // 567: aaload
      // 568: astore 29
      // 56a: aload 29
      // 56c: iload 6
      // 56e: ifeq 58c
      // 571: invokevirtual eqg.isEmpty ()Z
      // 574: iload 6
      // 576: ifeq 82a
      // 579: goto 580
      // 57c: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 57f: athrow
      // 580: ifne 817
      // 583: goto 58a
      // 586: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 589: athrow
      // 58a: aload 29
      // 58c: invokevirtual eqg.iterator ()Ljava/util/Iterator;
      // 58f: astore 30
      // 591: aload 30
      // 593: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 598: ifne 59e
      // 59b: goto 531
      // 59e: aload 30
      // 5a0: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 5a5: checkcast i2h
      // 5a8: astore 31
      // 5aa: iload 22
      // 5ac: iload 6
      // 5ae: ifeq 5f5
      // 5b1: ifeq 5e5
      // 5b4: goto 5bb
      // 5b7: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5ba: athrow
      // 5bb: aload 31
      // 5bd: getstatic net/optifine/reflect/Reflector.ForgeEntity_shouldRenderInPass Lnet/optifine/reflect/ReflectorMethod;
      // 5c0: bipush 1
      // 5c1: anewarray 70
      // 5c4: dup
      // 5c5: bipush 0
      // 5c6: iload 7
      // 5c8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 5cb: aastore
      // 5cc: invokestatic net/optifine/reflect/Reflector.callBoolean (Ljava/lang/Object;Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)Z
      // 5cf: iload 6
      // 5d1: ifeq 5f5
      // 5d4: goto 5db
      // 5d7: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5da: athrow
      // 5db: ifeq 591
      // 5de: goto 5e5
      // 5e1: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5e4: athrow
      // 5e5: aload 0
      // 5e6: getfield crp.h3f Lhr_;
      // 5e9: aload 31
      // 5eb: aload 2
      // 5ec: dload 8
      // 5ee: dload 10
      // 5f0: dload 12
      // 5f2: invokevirtual hr_.pgp (Li2h;L_aq;DDD)Z
      // 5f5: iload 6
      // 5f7: ifeq 622
      // 5fa: ifne 61a
      // 5fd: goto 604
      // 600: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 603: athrow
      // 604: aload 31
      // 606: getfield i2h.wgv Li2h;
      // 609: aload 0
      // 60a: getfield crp.j0u Lc05;
      // 60d: getfield c05.vg8 Ll86;
      // 610: if_acmpne 625
      // 613: goto 61a
      // 616: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 619: athrow
      // 61a: bipush 1
      // 61b: goto 622
      // 61e: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 621: athrow
      // 622: goto 626
      // 625: bipush 0
      // 626: istore 32
      // 628: iload 32
      // 62a: iload 6
      // 62c: ifeq 646
      // 62f: ifne 63c
      // 632: goto 639
      // 635: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 638: athrow
      // 639: goto 76f
      // 63c: aload 0
      // 63d: getfield crp.j0u Lc05;
      // 640: invokevirtual c05.nsd ()Li2h;
      // 643: instanceof g_3
      // 646: iload 6
      // 648: ifeq 669
      // 64b: ifeq 66c
      // 64e: goto 655
      // 651: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 654: athrow
      // 655: aload 0
      // 656: getfield crp.j0u Lc05;
      // 659: invokevirtual c05.nsd ()Li2h;
      // 65c: checkcast g_3
      // 65f: invokevirtual g_3.ofg ()Z
      // 662: goto 669
      // 665: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 668: athrow
      // 669: goto 66d
      // 66c: bipush 0
      // 66d: istore 33
      // 66f: aload 31
      // 671: iload 6
      // 673: ifeq 6c1
      // 676: aload 0
      // 677: getfield crp.j0u Lc05;
      // 67a: invokevirtual c05.nsd ()Li2h;
      // 67d: if_acmpne 6bf
      // 680: goto 687
      // 683: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 686: athrow
      // 687: aload 0
      // 688: getfield crp.j0u Lc05;
      // 68b: getfield c05.oxn Lmoh;
      // 68e: getfield moh.i_y I
      // 691: iload 6
      // 693: ifeq 6c6
      // 696: goto 69d
      // 699: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 69c: athrow
      // 69d: ifne 6bf
      // 6a0: goto 6a7
      // 6a3: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6a6: athrow
      // 6a7: iload 33
      // 6a9: iload 6
      // 6ab: ifeq 6c6
      // 6ae: goto 6b5
      // 6b1: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6b4: athrow
      // 6b5: ifeq 763
      // 6b8: goto 6bf
      // 6bb: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6be: athrow
      // 6bf: aload 31
      // 6c1: getfield i2h.kfp D
      // 6c4: dconst_0
      // 6c5: dcmpg
      // 6c6: iload 6
      // 6c8: ifeq 733
      // 6cb: iflt 71a
      // 6ce: goto 6d5
      // 6d1: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6d4: athrow
      // 6d5: aload 31
      // 6d7: getfield i2h.kfp D
      // 6da: ldc2_w 256.0
      // 6dd: dcmpl
      // 6de: iload 6
      // 6e0: ifeq 733
      // 6e3: goto 6ea
      // 6e6: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6e9: athrow
      // 6ea: ifge 71a
      // 6ed: goto 6f4
      // 6f0: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6f3: athrow
      // 6f4: aload 0
      // 6f5: getfield crp.t6z Lkh3;
      // 6f8: new mew
      // 6fb: dup
      // 6fc: aload 31
      // 6fe: invokespecial mew.<init> (Li2h;)V
      // 701: invokevirtual kh3.xjm (Lmew;)Z
      // 704: iload 6
      // 706: ifeq 733
      // 709: goto 710
      // 70c: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 70f: athrow
      // 710: ifeq 763
      // 713: goto 71a
      // 716: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 719: athrow
      // 71a: aload 0
      // 71b: dup
      // 71c: getfield crp.yoz I
      // 71f: bipush 1
      // 720: iadd
      // 721: putfield crp.yoz I
      // 724: aload 0
      // 725: aload 31
      // 727: putfield crp.qgm Li2h;
      // 72a: iload 24
      // 72c: goto 733
      // 72f: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 732: athrow
      // 733: iload 6
      // 735: ifeq 758
      // 738: ifeq 74e
      // 73b: goto 742
      // 73e: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 741: athrow
      // 742: aload 31
      // 744: invokestatic net/optifine/shaders/Shaders.nextEntity (Li2h;)V
      // 747: goto 74e
      // 74a: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 74d: athrow
      // 74e: aload 0
      // 74f: getfield crp.h3f Lhr_;
      // 752: aload 31
      // 754: fload 3
      // 755: invokevirtual hr_.dxc (Li2h;F)Z
      // 758: pop
      // 759: aload 0
      // 75a: aconst_null
      // 75b: putfield crp.qgm Li2h;
      // 75e: iload 6
      // 760: ifne 76f
      // 763: iload 6
      // 765: ifne 591
      // 768: goto 76f
      // 76b: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 76e: athrow
      // 76f: iload 32
      // 771: iload 6
      // 773: ifeq 78c
      // 776: ifne 812
      // 779: goto 780
      // 77c: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 77f: athrow
      // 780: aload 31
      // 782: instanceof k7p
      // 785: goto 78c
      // 788: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 78b: athrow
      // 78c: iload 6
      // 78e: ifeq 79d
      // 791: ifeq 812
      // 794: goto 79b
      // 797: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 79a: athrow
      // 79b: iload 22
      // 79d: iload 6
      // 79f: ifeq 7f1
      // 7a2: ifeq 7d6
      // 7a5: goto 7ac
      // 7a8: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7ab: athrow
      // 7ac: aload 31
      // 7ae: getstatic net/optifine/reflect/Reflector.ForgeEntity_shouldRenderInPass Lnet/optifine/reflect/ReflectorMethod;
      // 7b1: bipush 1
      // 7b2: anewarray 70
      // 7b5: dup
      // 7b6: bipush 0
      // 7b7: iload 7
      // 7b9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 7bc: aastore
      // 7bd: invokestatic net/optifine/reflect/Reflector.callBoolean (Ljava/lang/Object;Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)Z
      // 7c0: iload 6
      // 7c2: ifeq 7f1
      // 7c5: goto 7cc
      // 7c8: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7cb: athrow
      // 7cc: ifeq 812
      // 7cf: goto 7d6
      // 7d2: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7d5: athrow
      // 7d6: aload 0
      // 7d7: aload 31
      // 7d9: putfield crp.qgm Li2h;
      // 7dc: iload 6
      // 7de: ifeq 80d
      // 7e1: goto 7e8
      // 7e4: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7e7: athrow
      // 7e8: iload 24
      // 7ea: goto 7f1
      // 7ed: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7f0: athrow
      // 7f1: ifeq 800
      // 7f4: aload 31
      // 7f6: invokestatic net/optifine/shaders/Shaders.nextEntity (Li2h;)V
      // 7f9: goto 800
      // 7fc: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7ff: athrow
      // 800: aload 0
      // 801: getfield crp.j0u Lc05;
      // 804: invokevirtual c05.ibs ()Lhr_;
      // 807: aload 31
      // 809: fload 3
      // 80a: invokevirtual hr_.xm5 (Li2h;F)V
      // 80d: aload 0
      // 80e: aconst_null
      // 80f: putfield crp.qgm Li2h;
      // 812: iload 6
      // 814: ifne 591
      // 817: iload 6
      // 819: ifne 531
      // 81c: aload 0
      // 81d: getfield crp.j0u Lc05;
      // 820: getfield c05.oxn Lmoh;
      // 823: iload 25
      // 825: putfield moh.i37 Z
      // 828: iload 24
      // 82a: iload 6
      // 82c: ifeq 874
      // 82f: ifeq 846
      // 832: goto 839
      // 835: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 838: athrow
      // 839: invokestatic net/optifine/shaders/Shaders.endEntities ()V
      // 83c: invokestatic net/optifine/shaders/Shaders.beginBlockEntities ()V
      // 83f: goto 846
      // 842: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 845: athrow
      // 846: aload 0
      // 847: getfield crp.t6z Lkh3;
      // 84a: getfield kh3.e8t Luan;
      // 84d: sipush 16438
      // 850: ldc2_w 2418106374102456505
      // 853: lload 4
      // 855: lxor
      // 856: invokedynamic j (IJ)Ljava/lang/String; bsm=crp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 85b: nop
      // 85c: invokevirtual uan.v2l (Ljava/lang/String;)V
      // 85f: invokestatic qpm.ne_ ()V
      // 862: iload 6
      // 864: ifeq 887
      // 867: getstatic net/optifine/reflect/Reflector.ForgeTileEntity_hasFastRenderer Lnet/optifine/reflect/ReflectorMethod;
      // 86a: invokevirtual net/optifine/reflect/ReflectorMethod.exists ()Z
      // 86d: goto 874
      // 870: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 873: athrow
      // 874: ifeq 884
      // 877: getstatic xv4.b2r Lxv4;
      // 87a: invokevirtual xv4.nfb ()V
      // 87d: goto 884
      // 880: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 883: athrow
      // 884: invokestatic ca8._2n ()V
      // 887: aload 0
      // 888: getfield crp.ea4 Ljava/util/List;
      // 88b: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 890: astore 26
      // 892: aload 26
      // 894: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 899: ifeq 997
      // 89c: aload 26
      // 89e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 8a3: astore 27
      // 8a5: aload 27
      // 8a7: checkcast crp$j3h
      // 8aa: astore 28
      // 8ac: aload 28
      // 8ae: getfield crp$j3h.xvr Lkqk;
      // 8b1: invokevirtual kqk.fw8 ()Lcbc;
      // 8b4: invokevirtual cbc.pf7 ()Ljava/util/List;
      // 8b7: astore 29
      // 8b9: aload 29
      // 8bb: iload 6
      // 8bd: ifeq 8dd
      // 8c0: invokeinterface java/util/List.isEmpty ()Z 1
      // 8c5: iload 6
      // 8c7: ifeq a6d
      // 8ca: goto 8d1
      // 8cd: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8d0: athrow
      // 8d1: ifne 992
      // 8d4: goto 8db
      // 8d7: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8da: athrow
      // 8db: aload 29
      // 8dd: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 8e2: astore 30
      // 8e4: aload 30
      // 8e6: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 8eb: ifne 8f1
      // 8ee: goto 892
      // 8f1: aload 30
      // 8f3: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 8f8: checkcast pyk
      // 8fb: astore 31
      // 8fd: iload 23
      // 8ff: iload 6
      // 901: ifeq 931
      // 904: ifne 911
      // 907: goto 90e
      // 90a: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 90d: athrow
      // 90e: goto 968
      // 911: aload 31
      // 913: getstatic net/optifine/reflect/Reflector.ForgeTileEntity_shouldRenderInPass Lnet/optifine/reflect/ReflectorMethod;
      // 916: bipush 1
      // 917: anewarray 70
      // 91a: dup
      // 91b: bipush 0
      // 91c: iload 7
      // 91e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 921: aastore
      // 922: iload 6
      // 924: ifeq 93d
      // 927: invokestatic net/optifine/reflect/Reflector.callBoolean (Ljava/lang/Object;Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)Z
      // 92a: goto 931
      // 92d: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 930: athrow
      // 931: ifeq 8e4
      // 934: aload 31
      // 936: getstatic net/optifine/reflect/Reflector.ForgeTileEntity_getRenderBoundingBox Lnet/optifine/reflect/ReflectorMethod;
      // 939: bipush 0
      // 93a: anewarray 70
      // 93d: invokestatic net/optifine/reflect/Reflector.call (Ljava/lang/Object;Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)Ljava/lang/Object;
      // 940: checkcast nh4
      // 943: astore 32
      // 945: aload 32
      // 947: ifnull 968
      // 94a: aload 2
      // 94b: aload 32
      // 94d: invokeinterface _aq.n2v (Lnh4;)Z 2
      // 952: ifeq 963
      // 955: goto 95c
      // 958: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 95b: athrow
      // 95c: goto 968
      // 95f: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 962: athrow
      // 963: iload 6
      // 965: ifne 8e4
      // 968: iload 24
      // 96a: ifeq 979
      // 96d: aload 31
      // 96f: invokestatic net/optifine/shaders/Shaders.nextBlockEntity (Lpyk;)V
      // 972: goto 979
      // 975: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 978: athrow
      // 979: getstatic xv4.b2r Lxv4;
      // 97c: aload 31
      // 97e: fload 3
      // 97f: bipush -1
      // 980: invokevirtual xv4.c4z (Lpyk;FI)V
      // 983: aload 0
      // 984: dup
      // 985: getfield crp.obc I
      // 988: bipush 1
      // 989: iadd
      // 98a: putfield crp.obc I
      // 98d: iload 6
      // 98f: ifne 8e4
      // 992: iload 6
      // 994: ifne 892
      // 997: aload 0
      // 998: getfield crp.h7f Ljava/util/Set;
      // 99b: dup
      // 99c: astore 26
      // 99e: monitorenter
      // 99f: aload 0
      // 9a0: getfield crp.h7f Ljava/util/Set;
      // 9a3: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 9a8: astore 27
      // 9aa: aload 27
      // 9ac: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 9b1: ifeq a27
      // 9b4: aload 27
      // 9b6: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 9bb: checkcast pyk
      // 9be: astore 28
      // 9c0: iload 23
      // 9c2: iload 6
      // 9c4: ifeq a3b
      // 9c7: iload 6
      // 9c9: ifeq a09
      // 9cc: goto 9d3
      // 9cf: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9d2: athrow
      // 9d3: ifeq a07
      // 9d6: goto 9dd
      // 9d9: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9dc: athrow
      // 9dd: aload 28
      // 9df: getstatic net/optifine/reflect/Reflector.ForgeTileEntity_shouldRenderInPass Lnet/optifine/reflect/ReflectorMethod;
      // 9e2: bipush 1
      // 9e3: anewarray 70
      // 9e6: dup
      // 9e7: bipush 0
      // 9e8: iload 7
      // 9ea: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 9ed: aastore
      // 9ee: invokestatic net/optifine/reflect/Reflector.callBoolean (Ljava/lang/Object;Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)Z
      // 9f1: iload 6
      // 9f3: ifeq a09
      // 9f6: goto 9fd
      // 9f9: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9fc: athrow
      // 9fd: ifeq a22
      // a00: goto a07
      // a03: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a06: athrow
      // a07: iload 24
      // a09: ifeq a18
      // a0c: aload 28
      // a0e: invokestatic net/optifine/shaders/Shaders.nextBlockEntity (Lpyk;)V
      // a11: goto a18
      // a14: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a17: athrow
      // a18: getstatic xv4.b2r Lxv4;
      // a1b: aload 28
      // a1d: fload 3
      // a1e: bipush -1
      // a1f: invokevirtual xv4.c4z (Lpyk;FI)V
      // a22: iload 6
      // a24: ifne 9aa
      // a27: aload 26
      // a29: monitorexit
      // a2a: goto a35
      // a2d: astore 34
      // a2f: aload 26
      // a31: monitorexit
      // a32: aload 34
      // a34: athrow
      // a35: getstatic net/optifine/reflect/Reflector.ForgeTileEntity_hasFastRenderer Lnet/optifine/reflect/ReflectorMethod;
      // a38: invokevirtual net/optifine/reflect/ReflectorMethod.exists ()Z
      // a3b: ifeq a4d
      // a3e: getstatic xv4.b2r Lxv4;
      // a41: iload 7
      // a43: invokevirtual xv4._im (I)V
      // a46: goto a4d
      // a49: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a4c: athrow
      // a4d: aload 0
      // a4e: bipush 1
      // a4f: putfield crp.sy_ Z
      // a52: aload 0
      // a53: invokespecial crp.g2q ()V
      // a56: aload 0
      // a57: getfield crp.sz2 Ljava/util/Map;
      // a5a: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // a5f: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // a64: astore 26
      // a66: aload 26
      // a68: invokeinterface java/util/Iterator.hasNext ()Z 1
      // a6d: ifeq c66
      // a70: aload 26
      // a72: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // a77: checkcast ax_
      // a7a: astore 27
      // a7c: aload 27
      // a7e: invokevirtual ax_.q6p ()Lmew;
      // a81: astore 28
      // a83: aload 0
      // a84: getfield crp.t6z Lkh3;
      // a87: aload 28
      // a89: invokevirtual kh3.getTileEntity (Lmew;)Lpyk;
      // a8c: astore 29
      // a8e: aload 29
      // a90: iload 6
      // a92: ifeq ab0
      // a95: instanceof net/minecraft/tileentity/TileEntityChest
      // a98: iload 6
      // a9a: ifeq c71
      // a9d: goto aa4
      // aa0: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // aa3: athrow
      // aa4: ifeq b13
      // aa7: goto aae
      // aaa: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // aad: athrow
      // aae: aload 29
      // ab0: checkcast net/minecraft/tileentity/TileEntityChest
      // ab3: astore 30
      // ab5: aload 30
      // ab7: getfield net/minecraft/tileentity/TileEntityChest.af8 Lnet/minecraft/tileentity/TileEntityChest;
      // aba: iload 6
      // abc: ifeq aef
      // abf: ifnull ae3
      // ac2: goto ac9
      // ac5: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ac8: athrow
      // ac9: aload 28
      // acb: getstatic vt2.te4 Lvt2;
      // ace: invokevirtual mew.offset (Lvt2;)Lmew;
      // ad1: astore 28
      // ad3: aload 0
      // ad4: getfield crp.t6z Lkh3;
      // ad7: aload 28
      // ad9: invokevirtual kh3.getTileEntity (Lmew;)Lpyk;
      // adc: astore 29
      // ade: iload 6
      // ae0: ifne b13
      // ae3: aload 30
      // ae5: getfield net/minecraft/tileentity/TileEntityChest.sgw Lnet/minecraft/tileentity/TileEntityChest;
      // ae8: goto aef
      // aeb: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // aee: athrow
      // aef: iload 6
      // af1: ifeq b11
      // af4: ifnull b13
      // af7: goto afe
      // afa: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // afd: athrow
      // afe: aload 28
      // b00: getstatic vt2.z9q Lvt2;
      // b03: invokevirtual mew.offset (Lvt2;)Lmew;
      // b06: astore 28
      // b08: aload 0
      // b09: getfield crp.t6z Lkh3;
      // b0c: aload 28
      // b0e: invokevirtual kh3.getTileEntity (Lmew;)Lpyk;
      // b11: astore 29
      // b13: aload 0
      // b14: getfield crp.t6z Lkh3;
      // b17: aload 28
      // b19: invokevirtual kh3.getBlockState (Lmew;)Lzfz;
      // b1c: invokeinterface zfz.r_y ()Le0x; 1
      // b21: astore 30
      // b23: iload 23
      // b25: iload 6
      // b27: ifeq b35
      // b2a: ifeq bb2
      // b2d: goto b34
      // b30: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b33: athrow
      // b34: bipush 0
      // b35: istore 31
      // b37: aload 29
      // b39: iload 6
      // b3b: ifeq b4a
      // b3e: ifnull c31
      // b41: goto b48
      // b44: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b47: athrow
      // b48: aload 29
      // b4a: getstatic net/optifine/reflect/Reflector.ForgeTileEntity_shouldRenderInPass Lnet/optifine/reflect/ReflectorMethod;
      // b4d: bipush 1
      // b4e: anewarray 70
      // b51: dup
      // b52: bipush 0
      // b53: iload 7
      // b55: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // b58: aastore
      // b59: invokestatic net/optifine/reflect/Reflector.callBoolean (Ljava/lang/Object;Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)Z
      // b5c: iload 6
      // b5e: ifeq c33
      // b61: ifeq c31
      // b64: goto b6b
      // b67: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b6a: athrow
      // b6b: aload 29
      // b6d: getstatic net/optifine/reflect/Reflector.ForgeTileEntity_canRenderBreaking Lnet/optifine/reflect/ReflectorMethod;
      // b70: bipush 0
      // b71: anewarray 70
      // b74: invokestatic net/optifine/reflect/Reflector.callBoolean (Ljava/lang/Object;Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)Z
      // b77: iload 6
      // b79: ifeq c33
      // b7c: goto b83
      // b7f: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b82: athrow
      // b83: ifeq c31
      // b86: goto b8d
      // b89: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b8c: athrow
      // b8d: aload 29
      // b8f: getstatic net/optifine/reflect/Reflector.ForgeTileEntity_getRenderBoundingBox Lnet/optifine/reflect/ReflectorMethod;
      // b92: bipush 0
      // b93: anewarray 70
      // b96: invokestatic net/optifine/reflect/Reflector.call (Ljava/lang/Object;Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)Ljava/lang/Object;
      // b99: checkcast nh4
      // b9c: astore 32
      // b9e: aload 32
      // ba0: ifnull bad
      // ba3: aload 2
      // ba4: aload 32
      // ba6: invokeinterface _aq.n2v (Lnh4;)Z 2
      // bab: istore 31
      // bad: iload 6
      // baf: ifne c31
      // bb2: aload 29
      // bb4: ifnull c2e
      // bb7: goto bbe
      // bba: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // bbd: athrow
      // bbe: aload 30
      // bc0: instanceof hrd
      // bc3: iload 6
      // bc5: ifeq c2b
      // bc8: goto bcf
      // bcb: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // bce: athrow
      // bcf: ifne c2a
      // bd2: goto bd9
      // bd5: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // bd8: athrow
      // bd9: aload 30
      // bdb: instanceof u5i
      // bde: iload 6
      // be0: ifeq c2b
      // be3: goto bea
      // be6: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // be9: athrow
      // bea: ifne c2a
      // bed: goto bf4
      // bf0: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // bf3: athrow
      // bf4: aload 30
      // bf6: instanceof m54
      // bf9: iload 6
      // bfb: ifeq c2b
      // bfe: goto c05
      // c01: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c04: athrow
      // c05: ifne c2a
      // c08: goto c0f
      // c0b: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c0e: athrow
      // c0f: aload 30
      // c11: instanceof pld
      // c14: iload 6
      // c16: ifeq c2b
      // c19: goto c20
      // c1c: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c1f: athrow
      // c20: ifeq c2e
      // c23: goto c2a
      // c26: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c29: athrow
      // c2a: bipush 1
      // c2b: goto c2f
      // c2e: bipush 0
      // c2f: istore 31
      // c31: iload 31
      // c33: iload 6
      // c35: ifeq c44
      // c38: ifeq c61
      // c3b: goto c42
      // c3e: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c41: athrow
      // c42: iload 24
      // c44: ifeq c53
      // c47: aload 29
      // c49: invokestatic net/optifine/shaders/Shaders.nextBlockEntity (Lpyk;)V
      // c4c: goto c53
      // c4f: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c52: athrow
      // c53: getstatic xv4.b2r Lxv4;
      // c56: aload 29
      // c58: fload 3
      // c59: aload 27
      // c5b: invokevirtual ax_.fll ()I
      // c5e: invokevirtual xv4.c4z (Lpyk;FI)V
      // c61: iload 6
      // c63: ifne a66
      // c66: aload 0
      // c67: invokespecial crp.zwv ()V
      // c6a: aload 0
      // c6b: bipush 0
      // c6c: putfield crp.sy_ Z
      // c6f: iload 24
      // c71: iload 6
      // c73: ifeq c88
      // c76: ifeq c83
      // c79: goto c80
      // c7c: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c7f: athrow
      // c80: invokestatic net/optifine/shaders/Shaders.endBlockEntities ()V
      // c83: getstatic crp.pp5 I
      // c86: bipush 1
      // c87: isub
      // c88: putstatic crp.pp5 I
      // c8b: aload 0
      // c8c: getfield crp.j0u Lc05;
      // c8f: getfield c05.x0p Lv3i;
      // c92: invokevirtual v3i.yvz ()V
      // c95: aload 0
      // c96: getfield crp.j0u Lc05;
      // c99: getfield c05.ba0 Luan;
      // c9c: invokevirtual uan.uio ()V
      // c9f: return
   }

   public String kb1() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic crp.a J
      // 03: ldc2_w 93445869850987
      // 06: lxor
      // 07: lstore 1
      // 08: aload 0
      // 09: getfield crp.o6x Lc1s;
      // 0c: getfield c1s.mzt [Lkqk;
      // 0f: arraylength
      // 10: istore 4
      // 12: invokestatic t9d.c ()I
      // 15: bipush 0
      // 16: istore 5
      // 18: istore 3
      // 19: aload 0
      // 1a: getfield crp.eq2 Ljava/util/List;
      // 1d: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 22: astore 6
      // 24: aload 6
      // 26: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2b: ifeq 74
      // 2e: aload 6
      // 30: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 35: checkcast crp$j3h
      // 38: astore 7
      // 3a: aload 7
      // 3c: getfield crp$j3h.xvr Lkqk;
      // 3f: getfield kqk.ltn Lcbc;
      // 42: astore 8
      // 44: aload 8
      // 46: iload 3
      // 47: ifne 60
      // 4a: getstatic cbc.ays Lcbc;
      // 4d: if_acmpeq 70
      // 50: goto 57
      // 53: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 56: athrow
      // 57: aload 8
      // 59: goto 60
      // 5c: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5f: athrow
      // 60: invokevirtual cbc.ra6 ()Z
      // 63: ifne 70
      // 66: iinc 5 1
      // 69: goto 70
      // 6c: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6f: athrow
      // 70: iload 3
      // 71: ifeq 24
      // 74: sipush 17160
      // 77: ldc2_w 1202062064311484563
      // 7a: lload 1
      // 7b: lxor
      // 7c: invokedynamic j (IJ)Ljava/lang/String; bsm=crp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 81: nop
      // 82: bipush 5
      // 83: anewarray 70
      // 86: dup
      // 87: bipush 0
      // 88: iload 5
      // 8a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 8d: aastore
      // 8e: dup
      // 8f: bipush 1
      // 90: iload 4
      // 92: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 95: aastore
      // 96: dup
      // 97: bipush 2
      // 98: aload 0
      // 99: getfield crp.j0u Lc05;
      // 9c: getfield c05.qul Z
      // 9f: ifeq b7
      // a2: sipush 7025
      // a5: ldc2_w 521478221859723462
      // a8: lload 1
      // a9: lxor
      // aa: invokedynamic j (IJ)Ljava/lang/String; bsm=crp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // af: nop
      // b0: goto ba
      // b3: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b6: athrow
      // b7: ldc ""
      // b9: nop
      // ba: aastore
      // bb: dup
      // bc: bipush 3
      // bd: aload 0
      // be: getfield crp.bsi I
      // c1: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // c4: aastore
      // c5: dup
      // c6: bipush 4
      // c7: aload 0
      // c8: getfield crp.isn Ltbt;
      // cb: invokevirtual tbt.hjm ()Ljava/lang/String;
      // ce: aastore
      // cf: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // d2: areturn
   }

   public String jda() {
      long var1 = a ^ 86648590063314L;
      return a<"j">(9296, 2108170963696885843L ^ var1)
         + this.yoz
         + "/"
         + this.z1b
         + a<"j">(24315, 81910220943153882L ^ var1)
         + this.ofr
         + a<"j">(9363, 1964414101232656517L ^ var1)
         + (this.z1b - this.ofr - this.yoz)
         + a<"j">(2988, 6685403118248562579L ^ var1)
         + hxt._cs();
   }

   public void dvx(i2h param1, double param2, _aq param4, int param5, boolean param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic crp.a J
      // 003: ldc2_w 87339110215501
      // 006: lxor
      // 007: lstore 7
      // 009: invokestatic t9d.c ()I
      // 00c: istore 9
      // 00e: aload 0
      // 00f: iload 9
      // 011: ifne 037
      // 014: getfield crp.j0u Lc05;
      // 017: getfield c05.oxn Lmoh;
      // 01a: getfield moh.gcj I
      // 01d: aload 0
      // 01e: getfield crp.bsi I
      // 021: if_icmpeq 036
      // 024: goto 02b
      // 027: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02a: athrow
      // 02b: aload 0
      // 02c: invokevirtual crp.f9n ()V
      // 02f: goto 036
      // 032: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 035: athrow
      // 036: aload 0
      // 037: getfield crp.t6z Lkh3;
      // 03a: getfield kh3.e8t Luan;
      // 03d: sipush 21436
      // 040: ldc2_w 6626665874687962685
      // 043: lload 7
      // 045: lxor
      // 046: invokedynamic j (IJ)Ljava/lang/String; bsm=crp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04b: nop
      // 04c: invokevirtual uan.qek (Ljava/lang/String;)V
      // 04f: aload 1
      // 050: getfield i2h.o2v D
      // 053: aload 0
      // 054: getfield crp.gxe D
      // 057: dsub
      // 058: dstore 10
      // 05a: aload 1
      // 05b: getfield i2h.kfp D
      // 05e: aload 0
      // 05f: getfield crp.ex0 D
      // 062: dsub
      // 063: dstore 12
      // 065: aload 1
      // 066: getfield i2h.vbd D
      // 069: aload 0
      // 06a: getfield crp.rv_ D
      // 06d: dsub
      // 06e: dstore 14
      // 070: aload 0
      // 071: iload 9
      // 073: ifne 126
      // 076: getfield crp.ivg I
      // 079: aload 1
      // 07a: getfield i2h.jw4 I
      // 07d: if_icmpne 0ee
      // 080: goto 087
      // 083: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 086: athrow
      // 087: aload 0
      // 088: iload 9
      // 08a: ifne 126
      // 08d: goto 094
      // 090: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 093: athrow
      // 094: getfield crp.bg4 I
      // 097: aload 1
      // 098: getfield i2h.cub I
      // 09b: if_icmpne 0ee
      // 09e: goto 0a5
      // 0a1: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a4: athrow
      // 0a5: aload 0
      // 0a6: iload 9
      // 0a8: ifne 126
      // 0ab: goto 0b2
      // 0ae: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b1: athrow
      // 0b2: getfield crp.o3i I
      // 0b5: aload 1
      // 0b6: getfield i2h.e6l I
      // 0b9: if_icmpne 0ee
      // 0bc: goto 0c3
      // 0bf: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c2: athrow
      // 0c3: dload 10
      // 0c5: dload 10
      // 0c7: dmul
      // 0c8: dload 12
      // 0ca: dload 12
      // 0cc: dmul
      // 0cd: dadd
      // 0ce: dload 14
      // 0d0: dload 14
      // 0d2: dmul
      // 0d3: dadd
      // 0d4: ldc2_w 16.0
      // 0d7: dcmpl
      // 0d8: iload 9
      // 0da: ifne 137
      // 0dd: goto 0e4
      // 0e0: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e3: athrow
      // 0e4: ifle 134
      // 0e7: goto 0ee
      // 0ea: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ed: athrow
      // 0ee: aload 0
      // 0ef: aload 1
      // 0f0: getfield i2h.o2v D
      // 0f3: putfield crp.gxe D
      // 0f6: aload 0
      // 0f7: aload 1
      // 0f8: getfield i2h.kfp D
      // 0fb: putfield crp.ex0 D
      // 0fe: aload 0
      // 0ff: aload 1
      // 100: getfield i2h.vbd D
      // 103: putfield crp.rv_ D
      // 106: aload 0
      // 107: aload 1
      // 108: getfield i2h.jw4 I
      // 10b: putfield crp.ivg I
      // 10e: aload 0
      // 10f: aload 1
      // 110: getfield i2h.cub I
      // 113: putfield crp.bg4 I
      // 116: aload 0
      // 117: aload 1
      // 118: getfield i2h.e6l I
      // 11b: putfield crp.o3i I
      // 11e: aload 0
      // 11f: goto 126
      // 122: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 125: athrow
      // 126: getfield crp.o6x Lc1s;
      // 129: aload 1
      // 12a: getfield i2h.o2v D
      // 12d: aload 1
      // 12e: getfield i2h.vbd D
      // 131: invokevirtual c1s.b4a (DD)V
      // 134: invokestatic hxt.csr ()Z
      // 137: ifeq 145
      // 13a: aload 0
      // 13b: invokestatic net/optifine/DynamicLights.update (Lcrp;)V
      // 13e: goto 145
      // 141: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 144: athrow
      // 145: aload 0
      // 146: getfield crp.t6z Lkh3;
      // 149: getfield kh3.e8t Luan;
      // 14c: sipush 8998
      // 14f: ldc2_w 453593892025720453
      // 152: lload 7
      // 154: lxor
      // 155: invokedynamic j (IJ)Ljava/lang/String; bsm=crp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15a: nop
      // 15b: invokevirtual uan.v2l (Ljava/lang/String;)V
      // 15e: aload 1
      // 15f: getfield i2h.ivp D
      // 162: aload 1
      // 163: getfield i2h.o2v D
      // 166: aload 1
      // 167: getfield i2h.ivp D
      // 16a: dsub
      // 16b: dload 2
      // 16c: dmul
      // 16d: dadd
      // 16e: dstore 16
      // 170: aload 1
      // 171: getfield i2h.c54 D
      // 174: aload 1
      // 175: getfield i2h.kfp D
      // 178: aload 1
      // 179: getfield i2h.c54 D
      // 17c: dsub
      // 17d: dload 2
      // 17e: dmul
      // 17f: dadd
      // 180: dstore 18
      // 182: aload 1
      // 183: getfield i2h.e2b D
      // 186: aload 1
      // 187: getfield i2h.vbd D
      // 18a: aload 1
      // 18b: getfield i2h.e2b D
      // 18e: dsub
      // 18f: dload 2
      // 190: dmul
      // 191: dadd
      // 192: dstore 20
      // 194: aload 0
      // 195: getfield crp.f9a Lofj;
      // 198: dload 16
      // 19a: dload 18
      // 19c: dload 20
      // 19e: invokevirtual ofj.wyf (DDD)V
      // 1a1: aload 0
      // 1a2: getfield crp.t6z Lkh3;
      // 1a5: getfield kh3.e8t Luan;
      // 1a8: sipush 9607
      // 1ab: ldc2_w 4417217594645895186
      // 1ae: lload 7
      // 1b0: lxor
      // 1b1: invokedynamic j (IJ)Ljava/lang/String; bsm=crp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b6: nop
      // 1b7: invokevirtual uan.v2l (Ljava/lang/String;)V
      // 1ba: aload 0
      // 1bb: iload 9
      // 1bd: ifne 1f9
      // 1c0: getfield crp.hyu Luka;
      // 1c3: ifnull 1f8
      // 1c6: goto 1cd
      // 1c9: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1cc: athrow
      // 1cd: new grx
      // 1d0: dup
      // 1d1: aload 0
      // 1d2: getfield crp.hyu Luka;
      // 1d5: invokespecial grx.<init> (Luka;)V
      // 1d8: astore 22
      // 1da: aload 22
      // 1dc: aload 0
      // 1dd: getfield crp.c2_ Lzxu;
      // 1e0: getfield zxu.kvw D
      // 1e3: aload 0
      // 1e4: getfield crp.c2_ Lzxu;
      // 1e7: getfield zxu.cdu D
      // 1ea: aload 0
      // 1eb: getfield crp.c2_ Lzxu;
      // 1ee: getfield zxu.lji D
      // 1f1: invokevirtual grx._wl (DDD)V
      // 1f4: aload 22
      // 1f6: astore 4
      // 1f8: aload 0
      // 1f9: getfield crp.j0u Lc05;
      // 1fc: getfield c05.ba0 Luan;
      // 1ff: sipush 3785
      // 202: ldc2_w 2236362100678652739
      // 205: lload 7
      // 207: lxor
      // 208: invokedynamic j (IJ)Ljava/lang/String; bsm=crp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20d: nop
      // 20e: invokevirtual uan.v2l (Ljava/lang/String;)V
      // 211: new mew
      // 214: dup
      // 215: dload 16
      // 217: dload 18
      // 219: aload 1
      // 21a: invokevirtual i2h.c5y ()F
      // 21d: f2d
      // 21e: dadd
      // 21f: dload 20
      // 221: invokespecial mew.<init> (DDD)V
      // 224: astore 22
      // 226: aload 0
      // 227: getfield crp.o6x Lc1s;
      // 22a: aload 22
      // 22c: invokevirtual c1s.bes (Lmew;)Lkqk;
      // 22f: astore 23
      // 231: new mew
      // 234: dup
      // 235: dload 16
      // 237: ldc2_w 16.0
      // 23a: ddiv
      // 23b: invokestatic fe6.jqf (D)I
      // 23e: bipush 16
      // 240: imul
      // 241: dload 18
      // 243: ldc2_w 16.0
      // 246: ddiv
      // 247: invokestatic fe6.jqf (D)I
      // 24a: bipush 16
      // 24c: imul
      // 24d: dload 20
      // 24f: ldc2_w 16.0
      // 252: ddiv
      // 253: invokestatic fe6.jqf (D)I
      // 256: bipush 16
      // 258: imul
      // 259: invokespecial mew.<init> (III)V
      // 25c: pop
      // 25d: aload 0
      // 25e: aload 0
      // 25f: getfield crp.jli Z
      // 262: iload 9
      // 264: ifne 327
      // 267: ifne 326
      // 26a: aload 0
      // 26b: getfield crp.l0i Ljava/util/Set;
      // 26e: invokeinterface java/util/Set.isEmpty ()Z 1
      // 273: iload 9
      // 275: ifne 327
      // 278: goto 27f
      // 27b: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27e: athrow
      // 27f: ifeq 326
      // 282: goto 289
      // 285: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 288: athrow
      // 289: aload 1
      // 28a: getfield i2h.o2v D
      // 28d: aload 0
      // 28e: getfield crp.o6f D
      // 291: dcmpl
      // 292: iload 9
      // 294: ifne 327
      // 297: goto 29e
      // 29a: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29d: athrow
      // 29e: ifne 326
      // 2a1: goto 2a8
      // 2a4: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a7: athrow
      // 2a8: aload 1
      // 2a9: getfield i2h.kfp D
      // 2ac: aload 0
      // 2ad: getfield crp.okd D
      // 2b0: dcmpl
      // 2b1: iload 9
      // 2b3: ifne 327
      // 2b6: goto 2bd
      // 2b9: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2bc: athrow
      // 2bd: ifne 326
      // 2c0: goto 2c7
      // 2c3: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c6: athrow
      // 2c7: aload 1
      // 2c8: getfield i2h.vbd D
      // 2cb: aload 0
      // 2cc: getfield crp.tq1 D
      // 2cf: dcmpl
      // 2d0: iload 9
      // 2d2: ifne 327
      // 2d5: goto 2dc
      // 2d8: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2db: athrow
      // 2dc: ifne 326
      // 2df: goto 2e6
      // 2e2: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e5: athrow
      // 2e6: aload 1
      // 2e7: getfield i2h.y2i F
      // 2ea: f2d
      // 2eb: aload 0
      // 2ec: getfield crp.p5b D
      // 2ef: dcmpl
      // 2f0: iload 9
      // 2f2: ifne 327
      // 2f5: goto 2fc
      // 2f8: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2fb: athrow
      // 2fc: ifne 326
      // 2ff: goto 306
      // 302: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 305: athrow
      // 306: aload 1
      // 307: getfield i2h.x5k F
      // 30a: f2d
      // 30b: aload 0
      // 30c: getfield crp.udn D
      // 30f: dcmpl
      // 310: iload 9
      // 312: ifne 327
      // 315: goto 31c
      // 318: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31b: athrow
      // 31c: ifeq 32a
      // 31f: goto 326
      // 322: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 325: athrow
      // 326: bipush 1
      // 327: goto 32b
      // 32a: bipush 0
      // 32b: putfield crp.jli Z
      // 32e: aload 0
      // 32f: aload 1
      // 330: getfield i2h.o2v D
      // 333: putfield crp.o6f D
      // 336: aload 0
      // 337: aload 1
      // 338: getfield i2h.kfp D
      // 33b: putfield crp.okd D
      // 33e: aload 0
      // 33f: aload 1
      // 340: getfield i2h.vbd D
      // 343: putfield crp.tq1 D
      // 346: aload 0
      // 347: aload 1
      // 348: getfield i2h.y2i F
      // 34b: f2d
      // 34c: putfield crp.p5b D
      // 34f: aload 0
      // 350: aload 1
      // 351: getfield i2h.x5k F
      // 354: f2d
      // 355: putfield crp.udn D
      // 358: aload 0
      // 359: getfield crp.hyu Luka;
      // 35c: ifnull 367
      // 35f: bipush 1
      // 360: goto 368
      // 363: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 366: athrow
      // 367: bipush 0
      // 368: istore 24
      // 36a: aload 0
      // 36b: getfield crp.j0u Lc05;
      // 36e: getfield c05.ba0 Luan;
      // 371: sipush 22512
      // 374: ldc2_w 5953766524039703166
      // 377: lload 7
      // 379: lxor
      // 37a: invokedynamic j (IJ)Ljava/lang/String; bsm=crp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37f: nop
      // 380: invokevirtual uan.v2l (Ljava/lang/String;)V
      // 383: getstatic net/optifine/Lagometer.timerVisibility Lnet/optifine/Lagometer$TimerNano;
      // 386: invokevirtual net/optifine/Lagometer$TimerNano.start ()V
      // 389: aload 0
      // 38a: invokevirtual crp.wpv ()I
      // 38d: istore 25
      // 38f: iload 25
      // 391: iload 9
      // 393: ifne 3b9
      // 396: aload 0
      // 397: getfield crp._t5 I
      // 39a: if_icmpeq 3b6
      // 39d: goto 3a4
      // 3a0: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a3: athrow
      // 3a4: aload 0
      // 3a5: iload 25
      // 3a7: putfield crp._t5 I
      // 3aa: aload 0
      // 3ab: bipush 1
      // 3ac: putfield crp.jli Z
      // 3af: goto 3b6
      // 3b2: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b5: athrow
      // 3b6: sipush 256
      // 3b9: istore 26
      // 3bb: invokestatic net/optifine/render/ChunkVisibility.isFinished ()Z
      // 3be: iload 9
      // 3c0: ifne 3db
      // 3c3: ifne 3d9
      // 3c6: goto 3cd
      // 3c9: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3cc: athrow
      // 3cd: aload 0
      // 3ce: bipush 1
      // 3cf: putfield crp.jli Z
      // 3d2: goto 3d9
      // 3d5: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3d8: athrow
      // 3d9: iload 24
      // 3db: iload 9
      // 3dd: ifne 401
      // 3e0: ifne 432
      // 3e3: goto 3ea
      // 3e6: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3e9: athrow
      // 3ea: aload 0
      // 3eb: iload 9
      // 3ed: ifne 433
      // 3f0: goto 3f7
      // 3f3: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3f6: athrow
      // 3f7: getfield crp.jli Z
      // 3fa: goto 401
      // 3fd: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 400: athrow
      // 401: ifeq 432
      // 404: invokestatic hxt.uv_ ()Z
      // 407: iload 9
      // 409: ifne 430
      // 40c: goto 413
      // 40f: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 412: athrow
      // 413: ifeq 432
      // 416: goto 41d
      // 419: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41c: athrow
      // 41d: aload 0
      // 41e: getfield crp.t6z Lkh3;
      // 421: aload 1
      // 422: aload 0
      // 423: getfield crp.bsi I
      // 426: invokestatic net/optifine/render/ChunkVisibility.getMaxChunkY (Lt9d;Li2h;I)I
      // 429: goto 430
      // 42c: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 42f: athrow
      // 430: istore 26
      // 432: aload 0
      // 433: getfield crp.o6x Lc1s;
      // 436: new mew
      // 439: dup
      // 43a: aload 1
      // 43b: getfield i2h.o2v D
      // 43e: aload 1
      // 43f: getfield i2h.kfp D
      // 442: aload 1
      // 443: getfield i2h.vbd D
      // 446: invokespecial mew.<init> (DDD)V
      // 449: invokevirtual c1s.bes (Lmew;)Lkqk;
      // 44c: astore 27
      // 44e: iload 9
      // 450: ifne 628
      // 453: getstatic net/optifine/shaders/Shaders.isShadowPass Z
      // 456: ifeq 611
      // 459: goto 460
      // 45c: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 45f: athrow
      // 460: aload 0
      // 461: aload 0
      // 462: getfield crp.qow Ljava/util/List;
      // 465: putfield crp.eq2 Ljava/util/List;
      // 468: aload 0
      // 469: aload 0
      // 46a: getfield crp.dp7 Ljava/util/List;
      // 46d: putfield crp.fo5 Ljava/util/List;
      // 470: aload 0
      // 471: aload 0
      // 472: getfield crp.f6f Ljava/util/List;
      // 475: putfield crp.ea4 Ljava/util/List;
      // 478: iload 24
      // 47a: iload 9
      // 47c: ifne 632
      // 47f: goto 486
      // 482: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 485: athrow
      // 486: ifne 630
      // 489: goto 490
      // 48c: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 48f: athrow
      // 490: aload 0
      // 491: getfield crp.jli Z
      // 494: iload 9
      // 496: ifne 632
      // 499: goto 4a0
      // 49c: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 49f: athrow
      // 4a0: ifeq 630
      // 4a3: goto 4aa
      // 4a6: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a9: athrow
      // 4aa: aload 0
      // 4ab: iload 9
      // 4ad: ifne 4fd
      // 4b0: goto 4b7
      // 4b3: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4b6: athrow
      // 4b7: invokespecial crp.ixl ()V
      // 4ba: aload 27
      // 4bc: ifnull 4fc
      // 4bf: goto 4c6
      // 4c2: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4c5: athrow
      // 4c6: aload 27
      // 4c8: invokevirtual kqk.a7g ()Lmew;
      // 4cb: invokevirtual mew.getY ()I
      // 4ce: iload 9
      // 4d0: ifne 4fb
      // 4d3: goto 4da
      // 4d6: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4d9: athrow
      // 4da: iload 26
      // 4dc: if_icmple 4fc
      // 4df: goto 4e6
      // 4e2: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e5: athrow
      // 4e6: aload 0
      // 4e7: getfield crp.fo5 Ljava/util/List;
      // 4ea: aload 27
      // 4ec: invokevirtual kqk.fcl ()Lcrp$j3h;
      // 4ef: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 4f4: goto 4fb
      // 4f7: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4fa: athrow
      // 4fb: pop
      // 4fc: aload 0
      // 4fd: getfield crp.t6z Lkh3;
      // 500: dload 2
      // 501: aload 1
      // 502: aload 0
      // 503: getfield crp.bsi I
      // 506: aload 0
      // 507: getfield crp.o6x Lc1s;
      // 50a: invokestatic net/optifine/shaders/ShadowUtils.makeShadowChunkIterator (Lkh3;DLi2h;ILc1s;)Ljava/util/Iterator;
      // 50d: astore 28
      // 50f: aload 28
      // 511: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 516: ifeq 60c
      // 519: aload 28
      // 51b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 520: checkcast kqk
      // 523: astore 29
      // 525: iload 9
      // 527: ifne 630
      // 52a: aload 29
      // 52c: iload 9
      // 52e: ifne 544
      // 531: goto 538
      // 534: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 537: athrow
      // 538: ifnull 607
      // 53b: goto 542
      // 53e: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 541: athrow
      // 542: aload 29
      // 544: iload 9
      // 546: ifne 564
      // 549: invokevirtual kqk.a7g ()Lmew;
      // 54c: invokevirtual mew.getY ()I
      // 54f: iload 26
      // 551: if_icmpgt 607
      // 554: goto 55b
      // 557: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 55a: athrow
      // 55b: aload 29
      // 55d: goto 564
      // 560: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 563: athrow
      // 564: invokevirtual kqk.fcl ()Lcrp$j3h;
      // 567: astore 30
      // 569: aload 29
      // 56b: getfield kqk.ltn Lcbc;
      // 56e: invokevirtual cbc.ra6 ()Z
      // 571: iload 9
      // 573: ifne 5ad
      // 576: ifeq 59b
      // 579: goto 580
      // 57c: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 57f: athrow
      // 580: aload 29
      // 582: invokevirtual kqk.tbo ()Z
      // 585: iload 9
      // 587: ifne 5b6
      // 58a: goto 591
      // 58d: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 590: athrow
      // 591: ifeq 5ae
      // 594: goto 59b
      // 597: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 59a: athrow
      // 59b: aload 0
      // 59c: getfield crp.eq2 Ljava/util/List;
      // 59f: aload 30
      // 5a1: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 5a6: goto 5ad
      // 5a9: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5ac: athrow
      // 5ad: pop
      // 5ae: aload 29
      // 5b0: invokevirtual kqk.v5v ()Ltts;
      // 5b3: invokestatic net/optifine/util/ChunkUtils.hasEntities (Ltts;)Z
      // 5b6: iload 9
      // 5b8: ifne 5e5
      // 5bb: ifeq 5d8
      // 5be: goto 5c5
      // 5c1: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5c4: athrow
      // 5c5: aload 0
      // 5c6: getfield crp.fo5 Ljava/util/List;
      // 5c9: aload 30
      // 5cb: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 5d0: pop
      // 5d1: goto 5d8
      // 5d4: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5d7: athrow
      // 5d8: aload 29
      // 5da: invokevirtual kqk.fw8 ()Lcbc;
      // 5dd: invokevirtual cbc.pf7 ()Ljava/util/List;
      // 5e0: invokeinterface java/util/List.size ()I 1
      // 5e5: iload 9
      // 5e7: ifne 606
      // 5ea: ifle 607
      // 5ed: goto 5f4
      // 5f0: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5f3: athrow
      // 5f4: aload 0
      // 5f5: getfield crp.ea4 Ljava/util/List;
      // 5f8: aload 30
      // 5fa: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 5ff: goto 606
      // 602: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 605: athrow
      // 606: pop
      // 607: iload 9
      // 609: ifeq 50f
      // 60c: iload 9
      // 60e: ifeq 630
      // 611: aload 0
      // 612: aload 0
      // 613: getfield crp.ds4 Ljava/util/List;
      // 616: putfield crp.eq2 Ljava/util/List;
      // 619: aload 0
      // 61a: aload 0
      // 61b: getfield crp.i5v Ljava/util/List;
      // 61e: putfield crp.fo5 Ljava/util/List;
      // 621: goto 628
      // 624: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 627: athrow
      // 628: aload 0
      // 629: aload 0
      // 62a: getfield crp.m2h Ljava/util/List;
      // 62d: putfield crp.ea4 Ljava/util/List;
      // 630: iload 24
      // 632: iload 9
      // 634: ifne ae9
      // 637: ifne acc
      // 63a: goto 641
      // 63d: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 640: athrow
      // 641: aload 0
      // 642: getfield crp.jli Z
      // 645: iload 9
      // 647: ifne ae9
      // 64a: goto 651
      // 64d: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 650: athrow
      // 651: ifeq acc
      // 654: goto 65b
      // 657: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 65a: athrow
      // 65b: getstatic net/optifine/shaders/Shaders.isShadowPass Z
      // 65e: iload 9
      // 660: ifne ae9
      // 663: goto 66a
      // 666: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 669: athrow
      // 66a: ifne acc
      // 66d: goto 674
      // 670: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 673: athrow
      // 674: aload 0
      // 675: bipush 0
      // 676: putfield crp.jli Z
      // 679: aload 0
      // 67a: invokespecial crp.ixl ()V
      // 67d: aload 0
      // 67e: getfield crp.a46 Ljava/util/Deque;
      // 681: invokeinterface java/util/Deque.clear ()V 1
      // 686: aload 0
      // 687: getfield crp.a46 Ljava/util/Deque;
      // 68a: astore 28
      // 68c: aload 0
      // 68d: getfield crp.j0u Lc05;
      // 690: getfield c05.qul Z
      // 693: istore 29
      // 695: aload 23
      // 697: iload 9
      // 699: ifne 6a8
      // 69c: ifnull 7ca
      // 69f: goto 6a6
      // 6a2: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6a5: athrow
      // 6a6: aload 23
      // 6a8: invokevirtual kqk.a7g ()Lmew;
      // 6ab: invokevirtual mew.getY ()I
      // 6ae: iload 9
      // 6b0: ifne 7d6
      // 6b3: iload 26
      // 6b5: if_icmpgt 7ca
      // 6b8: goto 6bf
      // 6bb: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6be: athrow
      // 6bf: bipush 0
      // 6c0: istore 30
      // 6c2: new crp$j3h
      // 6c5: dup
      // 6c6: aload 23
      // 6c8: aconst_null
      // 6c9: checkcast vt2
      // 6cc: bipush 0
      // 6cd: invokespecial crp$j3h.<init> (Lkqk;Lvt2;I)V
      // 6d0: astore 31
      // 6d2: getstatic crp.mgk Ljava/util/Set;
      // 6d5: astore 32
      // 6d7: aload 32
      // 6d9: invokeinterface java/util/Set.size ()I 1
      // 6de: iload 9
      // 6e0: ifne 71e
      // 6e3: bipush 1
      // 6e4: if_icmpne 717
      // 6e7: goto 6ee
      // 6ea: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6ed: athrow
      // 6ee: aload 0
      // 6ef: aload 1
      // 6f0: dload 2
      // 6f1: invokevirtual crp.di3 (Li2h;D)Lorg/lwjgl/util/vector/Vector3f;
      // 6f4: astore 33
      // 6f6: aload 33
      // 6f8: getfield org/lwjgl/util/vector/Vector3f.x F
      // 6fb: aload 33
      // 6fd: getfield org/lwjgl/util/vector/Vector3f.y F
      // 700: aload 33
      // 702: getfield org/lwjgl/util/vector/Vector3f.z F
      // 705: invokestatic vt2.lib (FFF)Lvt2;
      // 708: invokevirtual vt2.b4b ()Lvt2;
      // 70b: astore 34
      // 70d: aload 32
      // 70f: aload 34
      // 711: invokeinterface java/util/Set.remove (Ljava/lang/Object;)Z 2
      // 716: pop
      // 717: aload 32
      // 719: invokeinterface java/util/Set.isEmpty ()Z 1
      // 71e: iload 9
      // 720: ifne 732
      // 723: ifeq 730
      // 726: goto 72d
      // 729: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 72c: athrow
      // 72d: bipush 1
      // 72e: istore 30
      // 730: iload 30
      // 732: iload 9
      // 734: ifne 77a
      // 737: ifeq 771
      // 73a: goto 741
      // 73d: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 740: athrow
      // 741: iload 6
      // 743: iload 9
      // 745: ifne 77a
      // 748: goto 74f
      // 74b: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 74e: athrow
      // 74f: ifne 771
      // 752: goto 759
      // 755: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 758: athrow
      // 759: aload 0
      // 75a: getfield crp.eq2 Ljava/util/List;
      // 75d: aload 31
      // 75f: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 764: pop
      // 765: iload 9
      // 767: ifeq 7c5
      // 76a: goto 771
      // 76d: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 770: athrow
      // 771: iload 6
      // 773: goto 77a
      // 776: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 779: athrow
      // 77a: iload 9
      // 77c: ifne 7c4
      // 77f: ifeq 7b3
      // 782: goto 789
      // 785: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 788: athrow
      // 789: aload 0
      // 78a: getfield crp.t6z Lkh3;
      // 78d: aload 22
      // 78f: invokevirtual kh3.getBlockState (Lmew;)Lzfz;
      // 792: invokeinterface zfz.r_y ()Le0x; 1
      // 797: invokevirtual e0x.ko5 ()Z
      // 79a: iload 9
      // 79c: ifne 7c4
      // 79f: goto 7a6
      // 7a2: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7a5: athrow
      // 7a6: ifeq 7b3
      // 7a9: goto 7b0
      // 7ac: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7af: athrow
      // 7b0: bipush 0
      // 7b1: istore 29
      // 7b3: aload 23
      // 7b5: iload 5
      // 7b7: invokevirtual kqk.yhg (I)Z
      // 7ba: pop
      // 7bb: aload 28
      // 7bd: aload 31
      // 7bf: invokeinterface java/util/Deque.add (Ljava/lang/Object;)Z 2
      // 7c4: pop
      // 7c5: iload 9
      // 7c7: ifeq 8d1
      // 7ca: aload 22
      // 7cc: invokevirtual mew.getY ()I
      // 7cf: goto 7d6
      // 7d2: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7d5: athrow
      // 7d6: iload 9
      // 7d8: ifne 7f4
      // 7db: ifle 7f7
      // 7de: goto 7e5
      // 7e1: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7e4: athrow
      // 7e5: iload 26
      // 7e7: sipush 248
      // 7ea: invokestatic java/lang/Math.min (II)I
      // 7ed: goto 7f4
      // 7f0: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7f3: athrow
      // 7f4: goto 7f9
      // 7f7: bipush 8
      // 7f9: istore 30
      // 7fb: aload 27
      // 7fd: ifnull 816
      // 800: aload 0
      // 801: getfield crp.fo5 Ljava/util/List;
      // 804: aload 27
      // 806: invokevirtual kqk.fcl ()Lcrp$j3h;
      // 809: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 80e: pop
      // 80f: goto 816
      // 812: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 815: athrow
      // 816: aload 0
      // 817: getfield crp.bsi I
      // 81a: ineg
      // 81b: istore 31
      // 81d: iload 31
      // 81f: aload 0
      // 820: getfield crp.bsi I
      // 823: if_icmpgt 8d1
      // 826: aload 0
      // 827: getfield crp.bsi I
      // 82a: ineg
      // 82b: iload 9
      // 82d: ifne 8ed
      // 830: istore 32
      // 832: iload 32
      // 834: aload 0
      // 835: getfield crp.bsi I
      // 838: if_icmpgt 8c9
      // 83b: aload 0
      // 83c: getfield crp.o6x Lc1s;
      // 83f: new mew
      // 842: dup
      // 843: iload 31
      // 845: bipush 4
      // 846: ishl
      // 847: bipush 8
      // 849: iadd
      // 84a: iload 30
      // 84c: iload 32
      // 84e: bipush 4
      // 84f: ishl
      // 850: bipush 8
      // 852: iadd
      // 853: invokespecial mew.<init> (III)V
      // 856: invokevirtual c1s.bes (Lmew;)Lkqk;
      // 859: astore 33
      // 85b: iload 9
      // 85d: ifne 8c4
      // 860: aload 33
      // 862: iload 9
      // 864: ifne 900
      // 867: goto 86e
      // 86a: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 86d: athrow
      // 86e: ifnull 8c1
      // 871: goto 878
      // 874: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 877: athrow
      // 878: aload 33
      // 87a: aload 4
      // 87c: iload 5
      // 87e: invokevirtual kqk.k4g (L_aq;I)Z
      // 881: iload 9
      // 883: ifne 8a5
      // 886: goto 88d
      // 889: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 88c: athrow
      // 88d: ifeq 8c1
      // 890: goto 897
      // 893: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 896: athrow
      // 897: aload 33
      // 899: iload 5
      // 89b: invokevirtual kqk.yhg (I)Z
      // 89e: goto 8a5
      // 8a1: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8a4: athrow
      // 8a5: pop
      // 8a6: aload 33
      // 8a8: invokevirtual kqk.fcl ()Lcrp$j3h;
      // 8ab: astore 34
      // 8ad: aload 34
      // 8af: aconst_null
      // 8b0: checkcast vt2
      // 8b3: bipush 0
      // 8b4: invokestatic crp$j3h.u1n (Lcrp$j3h;Lvt2;I)V
      // 8b7: aload 28
      // 8b9: aload 34
      // 8bb: invokeinterface java/util/Deque.add (Ljava/lang/Object;)Z 2
      // 8c0: pop
      // 8c1: iinc 32 1
      // 8c4: iload 9
      // 8c6: ifeq 832
      // 8c9: iinc 31 1
      // 8cc: iload 9
      // 8ce: ifeq 81d
      // 8d1: aload 0
      // 8d2: getfield crp.j0u Lc05;
      // 8d5: getfield c05.ba0 Luan;
      // 8d8: sipush 4967
      // 8db: ldc2_w 635084125698944753
      // 8de: lload 7
      // 8e0: lxor
      // 8e1: invokedynamic j (IJ)Ljava/lang/String; bsm=crp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8e6: nop
      // 8e7: invokevirtual uan.qek (Ljava/lang/String;)V
      // 8ea: invokestatic hxt.l76 ()Z
      // 8ed: istore 30
      // 8ef: aload 28
      // 8f1: invokeinterface java/util/Deque.isEmpty ()Z 1
      // 8f6: ifne ac2
      // 8f9: aload 28
      // 8fb: invokeinterface java/util/Deque.poll ()Ljava/lang/Object; 1
      // 900: checkcast crp$j3h
      // 903: astore 31
      // 905: aload 31
      // 907: getfield crp$j3h.xvr Lkqk;
      // 90a: astore 32
      // 90c: aload 31
      // 90e: getfield crp$j3h.rkx Lvt2;
      // 911: astore 33
      // 913: aload 32
      // 915: getfield kqk.ltn Lcbc;
      // 918: astore 34
      // 91a: aload 34
      // 91c: invokevirtual cbc.ra6 ()Z
      // 91f: iload 9
      // 921: ifne ae9
      // 924: iload 9
      // 926: ifne 967
      // 929: goto 930
      // 92c: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 92f: athrow
      // 930: ifeq 955
      // 933: goto 93a
      // 936: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 939: athrow
      // 93a: aload 32
      // 93c: invokevirtual kqk.tbo ()Z
      // 93f: iload 9
      // 941: ifne 970
      // 944: goto 94b
      // 947: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 94a: athrow
      // 94b: ifeq 968
      // 94e: goto 955
      // 951: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 954: athrow
      // 955: aload 0
      // 956: getfield crp.eq2 Ljava/util/List;
      // 959: aload 31
      // 95b: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 960: goto 967
      // 963: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 966: athrow
      // 967: pop
      // 968: aload 32
      // 96a: invokevirtual kqk.v5v ()Ltts;
      // 96d: invokestatic net/optifine/util/ChunkUtils.hasEntities (Ltts;)Z
      // 970: iload 9
      // 972: ifne 99c
      // 975: ifeq 992
      // 978: goto 97f
      // 97b: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 97e: athrow
      // 97f: aload 0
      // 980: getfield crp.fo5 Ljava/util/List;
      // 983: aload 31
      // 985: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 98a: pop
      // 98b: goto 992
      // 98e: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 991: athrow
      // 992: aload 34
      // 994: invokevirtual cbc.pf7 ()Ljava/util/List;
      // 997: invokeinterface java/util/List.size ()I 1
      // 99c: iload 9
      // 99e: ifne 9c0
      // 9a1: ifle 9be
      // 9a4: goto 9ab
      // 9a7: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9aa: athrow
      // 9ab: aload 0
      // 9ac: getfield crp.ea4 Ljava/util/List;
      // 9af: aload 31
      // 9b1: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 9b6: pop
      // 9b7: goto 9be
      // 9ba: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9bd: athrow
      // 9be: iload 29
      // 9c0: iload 9
      // 9c2: ifne 9db
      // 9c5: ifeq 9e1
      // 9c8: goto 9cf
      // 9cb: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9ce: athrow
      // 9cf: aload 31
      // 9d1: getfield crp$j3h.b3g I
      // 9d4: goto 9db
      // 9d7: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9da: athrow
      // 9db: invokestatic net/optifine/render/ChunkVisibility.getFacingsNotOpposite (I)[Lvt2;
      // 9de: goto 9e4
      // 9e1: getstatic vt2.vbu [Lvt2;
      // 9e4: astore 35
      // 9e6: aload 35
      // 9e8: arraylength
      // 9e9: istore 36
      // 9eb: bipush 0
      // 9ec: istore 37
      // 9ee: iload 37
      // 9f0: iload 36
      // 9f2: if_icmpge abd
      // 9f5: aload 35
      // 9f7: iload 37
      // 9f9: aaload
      // 9fa: astore 38
      // 9fc: iload 29
      // 9fe: iload 9
      // a00: ifne 8f6
      // a03: ifeq a28
      // a06: aload 33
      // a08: ifnull a28
      // a0b: goto a12
      // a0e: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a11: athrow
      // a12: aload 34
      // a14: aload 33
      // a16: invokevirtual vt2.b4b ()Lvt2;
      // a19: aload 38
      // a1b: invokevirtual cbc.spn (Lvt2;Lvt2;)Z
      // a1e: ifeq ab5
      // a21: goto a28
      // a24: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a27: athrow
      // a28: aload 0
      // a29: aload 22
      // a2b: aload 32
      // a2d: aload 38
      // a2f: iload 30
      // a31: iload 26
      // a33: invokespecial crp.z9d (Lmew;Lkqk;Lvt2;ZI)Lkqk;
      // a36: astore 39
      // a38: iload 9
      // a3a: ifne ab8
      // a3d: aload 39
      // a3f: ifnull ab5
      // a42: goto a49
      // a45: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a48: athrow
      // a49: aload 39
      // a4b: iload 5
      // a4d: invokevirtual kqk.yhg (I)Z
      // a50: iload 9
      // a52: ifne a76
      // a55: goto a5c
      // a58: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a5b: athrow
      // a5c: ifeq ab5
      // a5f: goto a66
      // a62: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a65: athrow
      // a66: aload 39
      // a68: aload 4
      // a6a: iload 5
      // a6c: invokevirtual kqk.k4g (L_aq;I)Z
      // a6f: goto a76
      // a72: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a75: athrow
      // a76: iload 9
      // a78: ifne a99
      // a7b: ifeq ab5
      // a7e: goto a85
      // a81: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a84: athrow
      // a85: aload 31
      // a87: getfield crp$j3h.b3g I
      // a8a: bipush 1
      // a8b: aload 38
      // a8d: invokevirtual vt2.ordinal ()I
      // a90: ishl
      // a91: ior
      // a92: goto a99
      // a95: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a98: athrow
      // a99: istore 40
      // a9b: aload 39
      // a9d: invokevirtual kqk.fcl ()Lcrp$j3h;
      // aa0: astore 41
      // aa2: aload 41
      // aa4: aload 38
      // aa6: iload 40
      // aa8: invokestatic crp$j3h.u1n (Lcrp$j3h;Lvt2;I)V
      // aab: aload 28
      // aad: aload 41
      // aaf: invokeinterface java/util/Deque.add (Ljava/lang/Object;)Z 2
      // ab4: pop
      // ab5: iinc 37 1
      // ab8: iload 9
      // aba: ifeq 9ee
      // abd: iload 9
      // abf: ifeq 8ef
      // ac2: aload 0
      // ac3: getfield crp.j0u Lc05;
      // ac6: getfield c05.ba0 Luan;
      // ac9: invokevirtual uan.uio ()V
      // acc: aload 0
      // acd: getfield crp.j0u Lc05;
      // ad0: getfield c05.ba0 Luan;
      // ad3: sipush 13009
      // ad6: ldc2_w 5214816704257314625
      // ad9: lload 7
      // adb: lxor
      // adc: invokedynamic j (IJ)Ljava/lang/String; bsm=crp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ae1: nop
      // ae2: invokevirtual uan.v2l (Ljava/lang/String;)V
      // ae5: aload 0
      // ae6: getfield crp.i1y Z
      // ae9: iload 9
      // aeb: ifne b23
      // aee: ifeq b0e
      // af1: goto af8
      // af4: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // af7: athrow
      // af8: aload 0
      // af9: dload 16
      // afb: dload 18
      // afd: dload 20
      // aff: invokespecial crp.n3h (DDD)V
      // b02: aload 0
      // b03: bipush 0
      // b04: putfield crp.i1y Z
      // b07: goto b0e
      // b0a: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b0d: athrow
      // b0e: getstatic net/optifine/Lagometer.timerVisibility Lnet/optifine/Lagometer$TimerNano;
      // b11: invokevirtual net/optifine/Lagometer$TimerNano.end ()V
      // b14: iload 9
      // b16: ifne b5c
      // b19: getstatic net/optifine/shaders/Shaders.isShadowPass Z
      // b1c: goto b23
      // b1f: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b22: athrow
      // b23: ifeq b35
      // b26: invokestatic net/optifine/shaders/Shaders.mcProfilerEndSection ()V
      // b29: iload 9
      // b2b: ifeq cce
      // b2e: goto b35
      // b31: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b34: athrow
      // b35: aload 0
      // b36: getfield crp.j0u Lc05;
      // b39: getfield c05.ba0 Luan;
      // b3c: sipush 5824
      // b3f: ldc2_w 1127151057967180649
      // b42: lload 7
      // b44: lxor
      // b45: invokedynamic j (IJ)Ljava/lang/String; bsm=crp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b4a: nop
      // b4b: invokevirtual uan.v2l (Ljava/lang/String;)V
      // b4e: aload 0
      // b4f: getfield crp.isn Ltbt;
      // b52: invokevirtual tbt.oqw ()V
      // b55: goto b5c
      // b58: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b5b: athrow
      // b5c: aload 0
      // b5d: getfield crp.l0i Ljava/util/Set;
      // b60: astore 28
      // b62: aload 0
      // b63: invokestatic com/google/common/collect/Sets.newLinkedHashSet ()Ljava/util/LinkedHashSet;
      // b66: putfield crp.l0i Ljava/util/Set;
      // b69: getstatic net/optifine/Lagometer.timerChunkUpdate Lnet/optifine/Lagometer$TimerNano;
      // b6c: invokevirtual net/optifine/Lagometer$TimerNano.start ()V
      // b6f: aload 0
      // b70: getfield crp.eq2 Ljava/util/List;
      // b73: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // b78: astore 29
      // b7a: aload 29
      // b7c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // b81: ifeq cb2
      // b84: aload 29
      // b86: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // b8b: checkcast crp$j3h
      // b8e: astore 30
      // b90: aload 30
      // b92: getfield crp$j3h.xvr Lkqk;
      // b95: astore 31
      // b97: aload 31
      // b99: iload 9
      // b9b: ifne bd8
      // b9e: invokevirtual kqk.tbo ()Z
      // ba1: iload 9
      // ba3: ifne cc3
      // ba6: goto bad
      // ba9: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // bac: athrow
      // bad: ifne bca
      // bb0: goto bb7
      // bb3: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // bb6: athrow
      // bb7: aload 28
      // bb9: aload 31
      // bbb: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // bc0: ifeq cad
      // bc3: goto bca
      // bc6: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // bc9: athrow
      // bca: aload 0
      // bcb: bipush 1
      // bcc: putfield crp.jli Z
      // bcf: aload 31
      // bd1: goto bd8
      // bd4: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // bd7: athrow
      // bd8: invokevirtual kqk.a7g ()Lmew;
      // bdb: astore 32
      // bdd: aload 22
      // bdf: aload 32
      // be1: invokevirtual mew.getX ()I
      // be4: bipush 8
      // be6: iadd
      // be7: i2d
      // be8: aload 32
      // bea: invokevirtual mew.getY ()I
      // bed: bipush 8
      // bef: iadd
      // bf0: i2d
      // bf1: aload 32
      // bf3: invokevirtual mew.getZ ()I
      // bf6: bipush 8
      // bf8: iadd
      // bf9: i2d
      // bfa: invokevirtual mew.p4e (DDD)D
      // bfd: ldc2_w 768.0
      // c00: dcmpg
      // c01: iload 9
      // c03: ifne c11
      // c06: ifge c14
      // c09: goto c10
      // c0c: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c0f: athrow
      // c10: bipush 1
      // c11: goto c15
      // c14: bipush 0
      // c15: istore 33
      // c17: iload 33
      // c19: iload 9
      // c1b: ifne c4c
      // c1e: ifne c40
      // c21: goto c28
      // c24: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c27: athrow
      // c28: aload 0
      // c29: getfield crp.l0i Ljava/util/Set;
      // c2c: aload 31
      // c2e: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // c33: pop
      // c34: iload 9
      // c36: ifeq cad
      // c39: goto c40
      // c3c: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c3f: athrow
      // c40: aload 31
      // c42: invokevirtual kqk.f76 ()Z
      // c45: goto c4c
      // c48: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c4b: athrow
      // c4c: iload 9
      // c4e: ifne c9c
      // c51: ifne c73
      // c54: goto c5b
      // c57: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c5a: athrow
      // c5b: aload 0
      // c5c: getfield crp.th7 Ljava/util/Set;
      // c5f: aload 31
      // c61: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // c66: pop
      // c67: iload 9
      // c69: ifeq cad
      // c6c: goto c73
      // c6f: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c72: athrow
      // c73: aload 0
      // c74: getfield crp.j0u Lc05;
      // c77: getfield c05.ba0 Luan;
      // c7a: sipush 12150
      // c7d: ldc2_w 5880661198564545221
      // c80: lload 7
      // c82: lxor
      // c83: invokedynamic j (IJ)Ljava/lang/String; bsm=crp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c88: nop
      // c89: invokevirtual uan.qek (Ljava/lang/String;)V
      // c8c: aload 0
      // c8d: getfield crp.isn Ltbt;
      // c90: aload 31
      // c92: invokevirtual tbt.fzf (Lkqk;)Z
      // c95: goto c9c
      // c98: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c9b: athrow
      // c9c: pop
      // c9d: aload 31
      // c9f: bipush 0
      // ca0: invokevirtual kqk.sf6 (Z)V
      // ca3: aload 0
      // ca4: getfield crp.j0u Lc05;
      // ca7: getfield c05.ba0 Luan;
      // caa: invokevirtual uan.uio ()V
      // cad: iload 9
      // caf: ifeq b7a
      // cb2: getstatic net/optifine/Lagometer.timerChunkUpdate Lnet/optifine/Lagometer$TimerNano;
      // cb5: invokevirtual net/optifine/Lagometer$TimerNano.end ()V
      // cb8: aload 0
      // cb9: getfield crp.l0i Ljava/util/Set;
      // cbc: aload 28
      // cbe: invokeinterface java/util/Set.addAll (Ljava/util/Collection;)Z 2
      // cc3: pop
      // cc4: aload 0
      // cc5: getfield crp.j0u Lc05;
      // cc8: getfield c05.ba0 Luan;
      // ccb: invokevirtual uan.uio ()V
      // cce: return
   }

   private boolean tm7(mew param1, kqk param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: aload 2
      // 05: invokevirtual kqk.a7g ()Lmew;
      // 08: astore 4
      // 0a: aload 1
      // 0b: invokevirtual mew.getX ()I
      // 0e: aload 4
      // 10: invokevirtual mew.getX ()I
      // 13: isub
      // 14: invokestatic fe6.z1m (I)I
      // 17: bipush 16
      // 19: iload 3
      // 1a: ifeq 3e
      // 1d: if_icmple 2f
      // 20: goto 27
      // 23: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26: athrow
      // 27: bipush 0
      // 28: goto 76
      // 2b: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e: athrow
      // 2f: aload 1
      // 30: invokevirtual mew.getY ()I
      // 33: aload 4
      // 35: invokevirtual mew.getY ()I
      // 38: isub
      // 39: invokestatic fe6.z1m (I)I
      // 3c: bipush 16
      // 3e: iload 3
      // 3f: ifeq 6e
      // 42: if_icmple 54
      // 45: goto 4c
      // 48: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4b: athrow
      // 4c: bipush 0
      // 4d: goto 76
      // 50: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 53: athrow
      // 54: aload 1
      // 55: invokevirtual mew.getZ ()I
      // 58: aload 4
      // 5a: invokevirtual mew.getZ ()I
      // 5d: isub
      // 5e: invokestatic fe6.z1m (I)I
      // 61: iload 3
      // 62: ifeq 72
      // 65: bipush 16
      // 67: goto 6e
      // 6a: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6d: athrow
      // 6e: if_icmpgt 75
      // 71: bipush 1
      // 72: goto 76
      // 75: bipush 0
      // 76: ireturn
   }

   private Set rld(mew var1) {
      zy2 var3 = new zy2();
      int var10000 = t9d.b();
      mew var4 = new mew(var1.getX() >> 4 << 4, var1.getY() >> 4 << 4, var1.getZ() >> 4 << 4);
      int var2 = var10000;
      tts var5 = this.t6z.pxs(var4);

      for (mew$mix var7 : mew.getAllInBoxMutable(var4, var4.ec4(15, 15, 15))) {
         try {
            if (var5.mgt(var7).ko5()) {
               var3.fzu(var7);
            }
         } catch (JsonSyntaxException var8) {
            throw a(var8);
         }

         if (var2 == 0) {
            break;
         }
      }

      return var3.ehq(var1);
   }

   private kqk z9d(mew param1, kqk param2, vt2 param3, boolean param4, int param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 6
      // 05: aload 2
      // 06: aload 3
      // 07: invokevirtual kqk.ckf (Lvt2;)Lkqk;
      // 0a: astore 7
      // 0c: aload 7
      // 0e: iload 6
      // 10: ifeq 25
      // 13: ifnonnull 23
      // 16: goto 1d
      // 19: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: aconst_null
      // 1e: areturn
      // 1f: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22: athrow
      // 23: aload 7
      // 25: invokevirtual kqk.a7g ()Lmew;
      // 28: invokevirtual mew.getY ()I
      // 2b: iload 6
      // 2d: ifeq 44
      // 30: iload 5
      // 32: if_icmple 42
      // 35: goto 3c
      // 38: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b: athrow
      // 3c: aconst_null
      // 3d: areturn
      // 3e: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41: athrow
      // 42: iload 4
      // 44: ifeq 8e
      // 47: aload 7
      // 49: iload 6
      // 4b: ifeq 90
      // 4e: goto 55
      // 51: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 54: athrow
      // 55: invokevirtual kqk.a7g ()Lmew;
      // 58: astore 8
      // 5a: aload 1
      // 5b: invokevirtual mew.getX ()I
      // 5e: aload 8
      // 60: invokevirtual mew.getX ()I
      // 63: isub
      // 64: istore 9
      // 66: aload 1
      // 67: invokevirtual mew.getZ ()I
      // 6a: aload 8
      // 6c: invokevirtual mew.getZ ()I
      // 6f: isub
      // 70: istore 10
      // 72: iload 9
      // 74: iload 9
      // 76: imul
      // 77: iload 10
      // 79: iload 10
      // 7b: imul
      // 7c: iadd
      // 7d: istore 11
      // 7f: iload 11
      // 81: aload 0
      // 82: getfield crp.qn7 I
      // 85: if_icmple 8e
      // 88: aconst_null
      // 89: areturn
      // 8a: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8d: athrow
      // 8e: aload 7
      // 90: areturn
   }

   private void n3h(double var1, double var3, double var5) {
      this.hyu = new g2u();
      ((g2u)this.hyu).pte();
      y6e var8 = new y6e(this.hyu.ovy);
      var8.transpose();
      y6e var9 = new y6e(this.hyu.e1v);
      var9.transpose();
      y6e var10 = new y6e();
      y6e.mul(var9, var8, var10);
      int var10000 = t9d.c();
      var10.invert();
      this.c2_.kvw = var1;
      this.c2_.cdu = var3;
      int var7 = var10000;
      this.c2_.lji = var5;
      this.s1u[0] = new Vector4f(-1.0F, -1.0F, -1.0F, 1.0F);
      this.s1u[1] = new Vector4f(1.0F, -1.0F, -1.0F, 1.0F);
      this.s1u[2] = new Vector4f(1.0F, 1.0F, -1.0F, 1.0F);
      this.s1u[3] = new Vector4f(-1.0F, 1.0F, -1.0F, 1.0F);
      this.s1u[4] = new Vector4f(-1.0F, -1.0F, 1.0F, 1.0F);
      this.s1u[5] = new Vector4f(1.0F, -1.0F, 1.0F, 1.0F);
      this.s1u[6] = new Vector4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.s1u[7] = new Vector4f(-1.0F, 1.0F, 1.0F, 1.0F);
      int var11 = 0;

      while (var11 < 8) {
         y6e.transform(var10, this.s1u[var11], this.s1u[var11]);
         this.s1u[var11].x = this.s1u[var11].x / this.s1u[var11].w;
         this.s1u[var11].y = this.s1u[var11].y / this.s1u[var11].w;
         this.s1u[var11].z = this.s1u[var11].z / this.s1u[var11].w;
         this.s1u[var11].w = 1.0F;
         var11++;
         if (var7 != 0) {
            break;
         }
      }
   }

   public Vector3f di3(i2h var1, double var2) {
      float var4 = (float)((double)var1.j25 + (double)(var1.y2i - var1.j25) * var2);
      float var5 = (float)((double)var1.p3h + (double)(var1.x5k - var1.p3h) * var2);
      if (c05.vz1().oxn.i_y == 2) {
         var4 += 180.0F;
      }

      float var6 = fe6.ssk(-var5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var7 = fe6.rtn(-var5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var8 = -fe6.ssk(-var4 * (float) (Math.PI / 180.0));
      float var9 = fe6.rtn(-var4 * (float) (Math.PI / 180.0));
      return new Vector3f(var7 * var8, var9, var6 * var8);
   }

   public int g_w(w51 param1, double param2, int param4, i2h param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic crp.a J
      // 003: ldc2_w 34892794920128
      // 006: lxor
      // 007: lstore 6
      // 009: invokestatic t9d.b ()I
      // 00c: istore 8
      // 00e: invokestatic qpm.cng ()V
      // 011: iload 8
      // 013: ifeq 16d
      // 016: aload 1
      // 017: getstatic w51.mem Lw51;
      // 01a: if_acmpne 154
      // 01d: goto 024
      // 020: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 023: athrow
      // 024: getstatic net/optifine/shaders/Shaders.isShadowPass Z
      // 027: iload 8
      // 029: ifeq 16e
      // 02c: goto 033
      // 02f: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 032: athrow
      // 033: ifne 154
      // 036: goto 03d
      // 039: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03c: athrow
      // 03d: aload 0
      // 03e: getfield crp.j0u Lc05;
      // 041: getfield c05.ba0 Luan;
      // 044: sipush 14781
      // 047: ldc2_w 6711521059325056902
      // 04a: lload 6
      // 04c: lxor
      // 04d: invokedynamic j (IJ)Ljava/lang/String; bsm=crp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 052: nop
      // 053: invokevirtual uan.qek (Ljava/lang/String;)V
      // 056: aload 5
      // 058: getfield i2h.o2v D
      // 05b: aload 0
      // 05c: getfield crp.qe9 D
      // 05f: dsub
      // 060: dstore 9
      // 062: aload 5
      // 064: getfield i2h.kfp D
      // 067: aload 0
      // 068: getfield crp.tag D
      // 06b: dsub
      // 06c: dstore 11
      // 06e: aload 5
      // 070: getfield i2h.vbd D
      // 073: aload 0
      // 074: getfield crp.hr6 D
      // 077: dsub
      // 078: dstore 13
      // 07a: dload 9
      // 07c: dload 9
      // 07e: dmul
      // 07f: dload 11
      // 081: dload 11
      // 083: dmul
      // 084: dadd
      // 085: dload 13
      // 087: dload 13
      // 089: dmul
      // 08a: dadd
      // 08b: dconst_1
      // 08c: dcmpl
      // 08d: iload 8
      // 08f: ifeq 0bf
      // 092: ifle 14a
      // 095: goto 09c
      // 098: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09b: athrow
      // 09c: aload 0
      // 09d: aload 5
      // 09f: getfield i2h.o2v D
      // 0a2: putfield crp.qe9 D
      // 0a5: aload 0
      // 0a6: aload 5
      // 0a8: getfield i2h.kfp D
      // 0ab: putfield crp.tag D
      // 0ae: aload 0
      // 0af: aload 5
      // 0b1: getfield i2h.vbd D
      // 0b4: putfield crp.hr6 D
      // 0b7: bipush 0
      // 0b8: goto 0bf
      // 0bb: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0be: athrow
      // 0bf: istore 15
      // 0c1: aload 0
      // 0c2: getfield crp.atw Ljava/util/Set;
      // 0c5: invokeinterface java/util/Set.clear ()V 1
      // 0ca: aload 0
      // 0cb: getfield crp.eq2 Ljava/util/List;
      // 0ce: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0d3: astore 16
      // 0d5: aload 16
      // 0d7: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0dc: ifeq 14a
      // 0df: aload 16
      // 0e1: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0e6: checkcast crp$j3h
      // 0e9: astore 17
      // 0eb: aload 17
      // 0ed: getfield crp$j3h.xvr Lkqk;
      // 0f0: getfield kqk.ltn Lcbc;
      // 0f3: aload 1
      // 0f4: invokevirtual cbc.g4s (Lw51;)Z
      // 0f7: iload 8
      // 0f9: ifeq 16e
      // 0fc: iload 8
      // 0fe: ifeq 11e
      // 101: goto 108
      // 104: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 107: athrow
      // 108: ifeq 145
      // 10b: goto 112
      // 10e: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 111: athrow
      // 112: iload 15
      // 114: iinc 15 1
      // 117: goto 11e
      // 11a: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11d: athrow
      // 11e: iload 8
      // 120: ifeq 144
      // 123: bipush 15
      // 125: if_icmpge 145
      // 128: goto 12f
      // 12b: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12e: athrow
      // 12f: aload 0
      // 130: getfield crp.atw Ljava/util/Set;
      // 133: aload 17
      // 135: getfield crp$j3h.xvr Lkqk;
      // 138: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 13d: goto 144
      // 140: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 143: athrow
      // 144: pop
      // 145: iload 8
      // 147: ifne 0d5
      // 14a: aload 0
      // 14b: getfield crp.j0u Lc05;
      // 14e: getfield c05.ba0 Luan;
      // 151: invokevirtual uan.uio ()V
      // 154: aload 0
      // 155: getfield crp.j0u Lc05;
      // 158: getfield c05.ba0 Luan;
      // 15b: sipush 20481
      // 15e: ldc2_w 1920293109864332809
      // 161: lload 6
      // 163: lxor
      // 164: invokedynamic j (IJ)Ljava/lang/String; bsm=crp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 169: nop
      // 16a: invokevirtual uan.qek (Ljava/lang/String;)V
      // 16d: bipush 0
      // 16e: istore 9
      // 170: aload 1
      // 171: getstatic w51.mem Lw51;
      // 174: if_acmpne 17f
      // 177: bipush 1
      // 178: goto 180
      // 17b: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17e: athrow
      // 17f: bipush 0
      // 180: istore 10
      // 182: iload 10
      // 184: iload 8
      // 186: ifeq 1a5
      // 189: ifeq 1a8
      // 18c: goto 193
      // 18f: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 192: athrow
      // 193: aload 0
      // 194: getfield crp.eq2 Ljava/util/List;
      // 197: invokeinterface java/util/List.size ()I 1
      // 19c: bipush 1
      // 19d: isub
      // 19e: goto 1a5
      // 1a1: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a4: athrow
      // 1a5: goto 1a9
      // 1a8: bipush 0
      // 1a9: istore 11
      // 1ab: iload 10
      // 1ad: iload 8
      // 1af: ifeq 1bd
      // 1b2: ifeq 1c0
      // 1b5: goto 1bc
      // 1b8: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1bb: athrow
      // 1bc: bipush -1
      // 1bd: goto 1c9
      // 1c0: aload 0
      // 1c1: getfield crp.eq2 Ljava/util/List;
      // 1c4: invokeinterface java/util/List.size ()I 1
      // 1c9: istore 12
      // 1cb: iload 10
      // 1cd: iload 8
      // 1cf: ifeq 1dd
      // 1d2: ifeq 1e0
      // 1d5: goto 1dc
      // 1d8: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1db: athrow
      // 1dc: bipush -1
      // 1dd: goto 1e1
      // 1e0: bipush 1
      // 1e1: istore 13
      // 1e3: iload 11
      // 1e5: istore 14
      // 1e7: iload 14
      // 1e9: iload 12
      // 1eb: if_icmpeq 245
      // 1ee: aload 0
      // 1ef: getfield crp.eq2 Ljava/util/List;
      // 1f2: iload 14
      // 1f4: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 1f9: checkcast crp$j3h
      // 1fc: getfield crp$j3h.xvr Lkqk;
      // 1ff: astore 15
      // 201: aload 15
      // 203: invokevirtual kqk.fw8 ()Lcbc;
      // 206: aload 1
      // 207: invokevirtual cbc.jo2 (Lw51;)Z
      // 20a: iload 8
      // 20c: ifeq 247
      // 20f: iload 8
      // 211: ifeq 23e
      // 214: goto 21b
      // 217: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21a: athrow
      // 21b: ifne 239
      // 21e: goto 225
      // 221: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 224: athrow
      // 225: iinc 9 1
      // 228: aload 0
      // 229: getfield crp.f9a Lofj;
      // 22c: aload 15
      // 22e: aload 1
      // 22f: invokevirtual ofj.j6c (Lkqk;Lw51;)V
      // 232: goto 239
      // 235: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 238: athrow
      // 239: iload 14
      // 23b: iload 13
      // 23d: iadd
      // 23e: istore 14
      // 240: iload 8
      // 242: ifne 1e7
      // 245: iload 9
      // 247: iload 8
      // 249: ifeq 26a
      // 24c: ifne 267
      // 24f: goto 256
      // 252: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 255: athrow
      // 256: aload 0
      // 257: getfield crp.j0u Lc05;
      // 25a: getfield c05.ba0 Luan;
      // 25d: invokevirtual uan.uio ()V
      // 260: iload 9
      // 262: ireturn
      // 263: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 266: athrow
      // 267: invokestatic hxt.o2a ()Z
      // 26a: iload 8
      // 26c: ifeq 2d7
      // 26f: ifeq 29c
      // 272: goto 279
      // 275: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 278: athrow
      // 279: aload 0
      // 27a: getfield crp.j0u Lc05;
      // 27d: getfield c05.x0p Lv3i;
      // 280: getfield v3i.ndn Z
      // 283: iload 8
      // 285: ifeq 2d7
      // 288: goto 28f
      // 28b: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28e: athrow
      // 28f: ifeq 29c
      // 292: goto 299
      // 295: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 298: athrow
      // 299: invokestatic hzu.gcp ()V
      // 29c: aload 0
      // 29d: getfield crp.j0u Lc05;
      // 2a0: getfield c05.ba0 Luan;
      // 2a3: new java/lang/StringBuilder
      // 2a6: dup
      // 2a7: invokespecial java/lang/StringBuilder.<init> ()V
      // 2aa: sipush 20809
      // 2ad: ldc2_w 540344797521477503
      // 2b0: lload 6
      // 2b2: lxor
      // 2b3: invokedynamic j (IJ)Ljava/lang/String; bsm=crp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b8: nop
      // 2b9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2bc: aload 1
      // 2bd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 2c0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2c3: invokevirtual uan.v2l (Ljava/lang/String;)V
      // 2c6: aload 0
      // 2c7: aload 1
      // 2c8: invokespecial crp.m47 (Lw51;)V
      // 2cb: aload 0
      // 2cc: getfield crp.j0u Lc05;
      // 2cf: getfield c05.ba0 Luan;
      // 2d2: invokevirtual uan.uio ()V
      // 2d5: iload 9
      // 2d7: ireturn
   }

   private void m47(w51 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 2
      // 004: aload 0
      // 005: getfield crp.j0u Lc05;
      // 008: getfield c05.x0p Lv3i;
      // 00b: invokevirtual v3i.u_c ()V
      // 00e: invokestatic gis.eyg ()Z
      // 011: iload 2
      // 012: ifeq 053
      // 015: ifeq 050
      // 018: goto 01f
      // 01b: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01e: athrow
      // 01f: ldc 32884
      // 021: nop
      // 022: invokestatic org/lwjgl/opengl/GL11.glEnableClientState (I)V
      // 025: getstatic gis.z1w I
      // 028: invokestatic gis.vt4 (I)V
      // 02b: ldc 32888
      // 02d: nop
      // 02e: invokestatic org/lwjgl/opengl/GL11.glEnableClientState (I)V
      // 031: getstatic gis.exn I
      // 034: invokestatic gis.vt4 (I)V
      // 037: ldc 32888
      // 039: nop
      // 03a: invokestatic org/lwjgl/opengl/GL11.glEnableClientState (I)V
      // 03d: getstatic gis.z1w I
      // 040: invokestatic gis.vt4 (I)V
      // 043: ldc 32886
      // 045: nop
      // 046: invokestatic org/lwjgl/opengl/GL11.glEnableClientState (I)V
      // 049: goto 050
      // 04c: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04f: athrow
      // 050: invokestatic hxt.ly3 ()Z
      // 053: iload 2
      // 054: ifeq 077
      // 057: ifeq 06c
      // 05a: goto 061
      // 05d: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 060: athrow
      // 061: aload 1
      // 062: invokestatic net/optifine/shaders/ShadersRender.preRenderChunkLayer (Lw51;)V
      // 065: goto 06c
      // 068: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06b: athrow
      // 06c: aload 0
      // 06d: getfield crp.f9a Lofj;
      // 070: aload 1
      // 071: invokevirtual ofj.ebu (Lw51;)V
      // 074: invokestatic hxt.ly3 ()Z
      // 077: iload 2
      // 078: ifeq 093
      // 07b: ifeq 090
      // 07e: goto 085
      // 081: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 084: athrow
      // 085: aload 1
      // 086: invokestatic net/optifine/shaders/ShadersRender.postRenderChunkLayer (Lw51;)V
      // 089: goto 090
      // 08c: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08f: athrow
      // 090: invokestatic gis.eyg ()Z
      // 093: ifeq 141
      // 096: getstatic gnl.n6w Lbe7;
      // 099: invokevirtual be7.utn ()Ljava/util/List;
      // 09c: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0a1: astore 3
      // 0a2: aload 3
      // 0a3: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0a8: ifeq 141
      // 0ab: aload 3
      // 0ac: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0b1: checkcast n0i
      // 0b4: astore 4
      // 0b6: aload 4
      // 0b8: invokevirtual n0i.rk2 ()Ln0i$pto;
      // 0bb: astore 5
      // 0bd: aload 4
      // 0bf: invokevirtual n0i.uik ()I
      // 0c2: istore 6
      // 0c4: iload 2
      // 0c5: ifeq 14b
      // 0c8: getstatic crp$2.__g [I
      // 0cb: aload 5
      // 0cd: invokevirtual n0i$pto.ordinal ()I
      // 0d0: iaload
      // 0d1: iload 2
      // 0d2: ifeq 106
      // 0d5: goto 0dc
      // 0d8: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0db: athrow
      // 0dc: tableswitch 97 1 3 32 49 81
      // 0f8: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fb: athrow
      // 0fc: ldc 32884
      // 0fe: nop
      // 0ff: goto 106
      // 102: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 105: athrow
      // 106: invokestatic org/lwjgl/opengl/GL11.glDisableClientState (I)V
      // 109: iload 2
      // 10a: ifne 13d
      // 10d: getstatic gis.z1w I
      // 110: iload 6
      // 112: iadd
      // 113: invokestatic gis.vt4 (I)V
      // 116: ldc 32888
      // 118: nop
      // 119: invokestatic org/lwjgl/opengl/GL11.glDisableClientState (I)V
      // 11c: getstatic gis.z1w I
      // 11f: invokestatic gis.vt4 (I)V
      // 122: iload 2
      // 123: ifne 13d
      // 126: goto 12d
      // 129: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12c: athrow
      // 12d: ldc 32886
      // 12f: nop
      // 130: invokestatic org/lwjgl/opengl/GL11.glDisableClientState (I)V
      // 133: invokestatic hzu.u49 ()V
      // 136: goto 13d
      // 139: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13c: athrow
      // 13d: iload 2
      // 13e: ifne 0a2
      // 141: aload 0
      // 142: getfield crp.j0u Lc05;
      // 145: getfield c05.x0p Lv3i;
      // 148: invokevirtual v3i.yvz ()V
      // 14b: return
   }

   private void ttj(Iterator var1) {
      int var2 = t9d.c();

      while (var1.hasNext()) {
         ax_ var3 = (ax_)var1.next();
         int var4 = var3.y69();

         try {
            if (this.s0f - var4 > 400) {
               var1.remove();
            }
         } catch (JsonSyntaxException var5) {
            throw a(var5);
         }

         if (var2 != 0) {
            break;
         }
      }
   }

   public void dhi() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: invokestatic hxt.ly3 ()Z
      // 07: iload 1
      // 08: ifeq 72
      // 0b: ifeq 56
      // 0e: goto 15
      // 11: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: bipush 61
      // 17: invokestatic org/lwjgl/input/Keyboard.isKeyDown (I)Z
      // 1a: iload 1
      // 1b: ifeq 72
      // 1e: goto 25
      // 21: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: ifeq 56
      // 28: goto 2f
      // 2b: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e: athrow
      // 2f: bipush 19
      // 31: invokestatic org/lwjgl/input/Keyboard.isKeyDown (I)Z
      // 34: iload 1
      // 35: ifeq 72
      // 38: goto 3f
      // 3b: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3e: athrow
      // 3f: ifeq 56
      // 42: goto 49
      // 45: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 48: athrow
      // 49: invokestatic net/optifine/shaders/Shaders.uninit ()V
      // 4c: invokestatic net/optifine/shaders/Shaders.loadShaderPack ()V
      // 4f: goto 56
      // 52: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 55: athrow
      // 56: aload 0
      // 57: dup
      // 58: getfield crp.s0f I
      // 5b: bipush 1
      // 5c: iadd
      // 5d: putfield crp.s0f I
      // 60: aload 0
      // 61: iload 1
      // 62: ifeq 76
      // 65: getfield crp.s0f I
      // 68: bipush 20
      // 6a: irem
      // 6b: goto 72
      // 6e: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 71: athrow
      // 72: ifne 87
      // 75: aload 0
      // 76: aload 0
      // 77: getfield crp.sz2 Ljava/util/Map;
      // 7a: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // 7f: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 84: invokespecial crp.ttj (Ljava/util/Iterator;)V
      // 87: return
   }

   private void _c8() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 1
      // 004: invokestatic hxt.imn ()Z
      // 007: iload 1
      // 008: ifne 034
      // 00b: ifeq 229
      // 00e: goto 015
      // 011: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 014: athrow
      // 015: invokestatic hzu.gcp ()V
      // 018: invokestatic hzu.vtj ()V
      // 01b: invokestatic hzu.spd ()V
      // 01e: sipush 770
      // 021: sipush 771
      // 024: bipush 1
      // 025: bipush 0
      // 026: invokestatic hzu.u39 (IIII)V
      // 029: invokestatic qpm.cng ()V
      // 02c: bipush 0
      // 02d: goto 034
      // 030: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 033: athrow
      // 034: invokestatic hzu.jun (Z)V
      // 037: aload 0
      // 038: getfield crp.nr3 Llc5;
      // 03b: getstatic crp.kr7 Lgdz;
      // 03e: invokevirtual lc5.anl (Lgdz;)V
      // 041: invokestatic jom.yut ()Ljom;
      // 044: astore 2
      // 045: aload 2
      // 046: invokevirtual jom.zuq ()Lq3g;
      // 049: astore 3
      // 04a: bipush 0
      // 04b: istore 4
      // 04d: iload 4
      // 04f: bipush 6
      // 051: if_icmpge 21c
      // 054: invokestatic hzu.dp2 ()V
      // 057: iload 4
      // 059: iload 1
      // 05a: ifne 21d
      // 05d: bipush 1
      // 05e: iload 1
      // 05f: ifne 086
      // 062: goto 069
      // 065: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 068: athrow
      // 069: if_icmpne 083
      // 06c: goto 073
      // 06f: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 072: athrow
      // 073: ldc 90.0
      // 075: nop
      // 076: fconst_1
      // 077: fconst_0
      // 078: fconst_0
      // 079: invokestatic hzu.a2h (FFFF)V
      // 07c: goto 083
      // 07f: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 082: athrow
      // 083: iload 4
      // 085: bipush 2
      // 086: iload 1
      // 087: ifne 0a7
      // 08a: if_icmpne 0a4
      // 08d: goto 094
      // 090: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 093: athrow
      // 094: ldc -90.0
      // 096: nop
      // 097: fconst_1
      // 098: fconst_0
      // 099: fconst_0
      // 09a: invokestatic hzu.a2h (FFFF)V
      // 09d: goto 0a4
      // 0a0: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a3: athrow
      // 0a4: iload 4
      // 0a6: bipush 3
      // 0a7: iload 1
      // 0a8: ifne 0c8
      // 0ab: if_icmpne 0c5
      // 0ae: goto 0b5
      // 0b1: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b4: athrow
      // 0b5: ldc 180.0
      // 0b7: nop
      // 0b8: fconst_1
      // 0b9: fconst_0
      // 0ba: fconst_0
      // 0bb: invokestatic hzu.a2h (FFFF)V
      // 0be: goto 0c5
      // 0c1: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c4: athrow
      // 0c5: iload 4
      // 0c7: bipush 4
      // 0c8: iload 1
      // 0c9: ifne 0f4
      // 0cc: if_icmpne 0e6
      // 0cf: goto 0d6
      // 0d2: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d5: athrow
      // 0d6: ldc 90.0
      // 0d8: nop
      // 0d9: fconst_0
      // 0da: fconst_0
      // 0db: fconst_1
      // 0dc: invokestatic hzu.a2h (FFFF)V
      // 0df: goto 0e6
      // 0e2: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e5: athrow
      // 0e6: iload 4
      // 0e8: iload 1
      // 0e9: ifne 112
      // 0ec: bipush 5
      // 0ed: goto 0f4
      // 0f0: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f3: athrow
      // 0f4: if_icmpne 107
      // 0f7: ldc -90.0
      // 0f9: nop
      // 0fa: fconst_0
      // 0fb: fconst_0
      // 0fc: fconst_1
      // 0fd: invokestatic hzu.a2h (FFFF)V
      // 100: goto 107
      // 103: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 106: athrow
      // 107: aload 3
      // 108: bipush 7
      // 10a: getstatic gnl.rad Lbe7;
      // 10d: invokevirtual q3g.ezr (ILbe7;)V
      // 110: bipush 40
      // 112: istore 5
      // 114: bipush 40
      // 116: istore 6
      // 118: bipush 40
      // 11a: istore 7
      // 11c: iload 1
      // 11d: ifne 218
      // 120: invokestatic hxt.xe2 ()Z
      // 123: ifeq 182
      // 126: goto 12d
      // 129: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12c: athrow
      // 12d: new fqr
      // 130: dup
      // 131: iload 5
      // 133: i2d
      // 134: ldc2_w 255.0
      // 137: ddiv
      // 138: iload 6
      // 13a: i2d
      // 13b: ldc2_w 255.0
      // 13e: ddiv
      // 13f: iload 7
      // 141: i2d
      // 142: ldc2_w 255.0
      // 145: ddiv
      // 146: invokespecial fqr.<init> (DDD)V
      // 149: astore 8
      // 14b: aload 8
      // 14d: aload 0
      // 14e: getfield crp.t6z Lkh3;
      // 151: aload 0
      // 152: getfield crp.j0u Lc05;
      // 155: invokevirtual c05.nsd ()Li2h;
      // 158: fconst_0
      // 159: invokestatic net/optifine/CustomColors.getWorldSkyColor (Lfqr;Lt9d;Li2h;F)Lfqr;
      // 15c: astore 8
      // 15e: aload 8
      // 160: getfield fqr.lvi D
      // 163: ldc2_w 255.0
      // 166: dmul
      // 167: d2i
      // 168: istore 5
      // 16a: aload 8
      // 16c: getfield fqr.gn5 D
      // 16f: ldc2_w 255.0
      // 172: dmul
      // 173: d2i
      // 174: istore 6
      // 176: aload 8
      // 178: getfield fqr.bn2 D
      // 17b: ldc2_w 255.0
      // 17e: dmul
      // 17f: d2i
      // 180: istore 7
      // 182: aload 3
      // 183: ldc2_w -100.0
      // 186: ldc2_w -100.0
      // 189: ldc2_w -100.0
      // 18c: invokevirtual q3g.g5o (DDD)Lq3g;
      // 18f: dconst_0
      // 190: dconst_0
      // 191: invokevirtual q3g.h0a (DD)Lq3g;
      // 194: iload 5
      // 196: iload 6
      // 198: iload 7
      // 19a: sipush 255
      // 19d: invokevirtual q3g.fje (IIII)Lq3g;
      // 1a0: invokevirtual q3g.pzw ()V
      // 1a3: aload 3
      // 1a4: ldc2_w -100.0
      // 1a7: ldc2_w -100.0
      // 1aa: ldc2_w 100.0
      // 1ad: invokevirtual q3g.g5o (DDD)Lq3g;
      // 1b0: dconst_0
      // 1b1: ldc2_w 16.0
      // 1b4: invokevirtual q3g.h0a (DD)Lq3g;
      // 1b7: iload 5
      // 1b9: iload 6
      // 1bb: iload 7
      // 1bd: sipush 255
      // 1c0: invokevirtual q3g.fje (IIII)Lq3g;
      // 1c3: invokevirtual q3g.pzw ()V
      // 1c6: aload 3
      // 1c7: ldc2_w 100.0
      // 1ca: ldc2_w -100.0
      // 1cd: ldc2_w 100.0
      // 1d0: invokevirtual q3g.g5o (DDD)Lq3g;
      // 1d3: ldc2_w 16.0
      // 1d6: ldc2_w 16.0
      // 1d9: invokevirtual q3g.h0a (DD)Lq3g;
      // 1dc: iload 5
      // 1de: iload 6
      // 1e0: iload 7
      // 1e2: sipush 255
      // 1e5: invokevirtual q3g.fje (IIII)Lq3g;
      // 1e8: invokevirtual q3g.pzw ()V
      // 1eb: aload 3
      // 1ec: ldc2_w 100.0
      // 1ef: ldc2_w -100.0
      // 1f2: ldc2_w -100.0
      // 1f5: invokevirtual q3g.g5o (DDD)Lq3g;
      // 1f8: ldc2_w 16.0
      // 1fb: dconst_0
      // 1fc: invokevirtual q3g.h0a (DD)Lq3g;
      // 1ff: iload 5
      // 201: iload 6
      // 203: iload 7
      // 205: sipush 255
      // 208: invokevirtual q3g.fje (IIII)Lq3g;
      // 20b: invokevirtual q3g.pzw ()V
      // 20e: aload 2
      // 20f: invokevirtual jom.q7g ()V
      // 212: invokestatic hzu.x3w ()V
      // 215: iinc 4 1
      // 218: iload 1
      // 219: ifeq 04d
      // 21c: bipush 1
      // 21d: invokestatic hzu.jun (Z)V
      // 220: invokestatic hzu.rqj ()V
      // 223: invokestatic hzu.if9 ()V
      // 226: invokestatic hzu.ux6 ()V
      // 229: return
   }

   public void j2_(float param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 3
      // 004: getstatic net/optifine/reflect/Reflector.ForgeWorldProvider_getSkyRenderer Lnet/optifine/reflect/ReflectorMethod;
      // 007: invokevirtual net/optifine/reflect/ReflectorMethod.exists ()Z
      // 00a: iload 3
      // 00b: ifeq 06e
      // 00e: ifeq 061
      // 011: goto 018
      // 014: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 017: athrow
      // 018: aload 0
      // 019: getfield crp.j0u Lc05;
      // 01c: getfield c05.tij Lkh3;
      // 01f: getfield kh3.vzz Lupn;
      // 022: astore 4
      // 024: aload 4
      // 026: iload 3
      // 027: ifeq 06b
      // 02a: getstatic net/optifine/reflect/Reflector.ForgeWorldProvider_getSkyRenderer Lnet/optifine/reflect/ReflectorMethod;
      // 02d: bipush 0
      // 02e: anewarray 70
      // 031: invokestatic net/optifine/reflect/Reflector.call (Ljava/lang/Object;Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)Ljava/lang/Object;
      // 034: astore 5
      // 036: aload 5
      // 038: ifnull 061
      // 03b: aload 5
      // 03d: getstatic net/optifine/reflect/Reflector.IRenderHandler_render Lnet/optifine/reflect/ReflectorMethod;
      // 040: bipush 3
      // 041: anewarray 70
      // 044: dup
      // 045: bipush 0
      // 046: fload 1
      // 047: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 04a: aastore
      // 04b: dup
      // 04c: bipush 1
      // 04d: aload 0
      // 04e: getfield crp.t6z Lkh3;
      // 051: aastore
      // 052: dup
      // 053: bipush 2
      // 054: aload 0
      // 055: getfield crp.j0u Lc05;
      // 058: aastore
      // 059: invokestatic net/optifine/reflect/Reflector.callVoid (Ljava/lang/Object;Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)V
      // 05c: return
      // 05d: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 060: athrow
      // 061: aload 0
      // 062: getfield crp.j0u Lc05;
      // 065: getfield c05.tij Lkh3;
      // 068: getfield kh3.vzz Lupn;
      // 06b: invokevirtual upn.gs_ ()I
      // 06e: iload 3
      // 06f: ifeq 0a0
      // 072: bipush 1
      // 073: if_icmpne 08c
      // 076: goto 07d
      // 079: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07c: athrow
      // 07d: aload 0
      // 07e: invokespecial crp._c8 ()V
      // 081: iload 3
      // 082: ifne ae5
      // 085: goto 08c
      // 088: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08b: athrow
      // 08c: aload 0
      // 08d: getfield crp.j0u Lc05;
      // 090: getfield c05.tij Lkh3;
      // 093: getfield kh3.vzz Lupn;
      // 096: invokevirtual upn.cws ()Z
      // 099: goto 0a0
      // 09c: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09f: athrow
      // 0a0: iload 3
      // 0a1: ifeq 0bb
      // 0a4: ifeq ae5
      // 0a7: goto 0ae
      // 0aa: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ad: athrow
      // 0ae: invokestatic hzu.m_1 ()V
      // 0b1: invokestatic hxt.ly3 ()Z
      // 0b4: goto 0bb
      // 0b7: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ba: athrow
      // 0bb: istore 4
      // 0bd: iload 4
      // 0bf: ifeq 0cc
      // 0c2: invokestatic net/optifine/shaders/Shaders.disableTexture2D ()V
      // 0c5: goto 0cc
      // 0c8: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0cb: athrow
      // 0cc: aload 0
      // 0cd: getfield crp.t6z Lkh3;
      // 0d0: aload 0
      // 0d1: getfield crp.j0u Lc05;
      // 0d4: invokevirtual c05.nsd ()Li2h;
      // 0d7: fload 1
      // 0d8: invokevirtual kh3.ez1 (Li2h;F)Lfqr;
      // 0db: astore 5
      // 0dd: aload 5
      // 0df: aload 0
      // 0e0: getfield crp.j0u Lc05;
      // 0e3: getfield c05.tij Lkh3;
      // 0e6: aload 0
      // 0e7: getfield crp.j0u Lc05;
      // 0ea: invokevirtual c05.nsd ()Li2h;
      // 0ed: getfield i2h.o2v D
      // 0f0: aload 0
      // 0f1: getfield crp.j0u Lc05;
      // 0f4: invokevirtual c05.nsd ()Li2h;
      // 0f7: getfield i2h.kfp D
      // 0fa: dconst_1
      // 0fb: dadd
      // 0fc: aload 0
      // 0fd: getfield crp.j0u Lc05;
      // 100: invokevirtual c05.nsd ()Li2h;
      // 103: getfield i2h.vbd D
      // 106: invokestatic net/optifine/CustomColors.getSkyColor (Lfqr;Lm5n;DDD)Lfqr;
      // 109: iload 3
      // 10a: ifeq 122
      // 10d: astore 5
      // 10f: iload 4
      // 111: ifeq 120
      // 114: aload 5
      // 116: invokestatic net/optifine/shaders/Shaders.setSkyColor (Lfqr;)V
      // 119: goto 120
      // 11c: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11f: athrow
      // 120: aload 5
      // 122: getfield fqr.lvi D
      // 125: d2f
      // 126: fstore 6
      // 128: aload 5
      // 12a: getfield fqr.gn5 D
      // 12d: d2f
      // 12e: fstore 7
      // 130: aload 5
      // 132: getfield fqr.bn2 D
      // 135: d2f
      // 136: fstore 8
      // 138: iload 3
      // 139: ifeq 19d
      // 13c: iload 2
      // 13d: bipush 2
      // 13e: if_icmpeq 194
      // 141: goto 148
      // 144: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 147: athrow
      // 148: fload 6
      // 14a: ldc 30.0
      // 14c: nop
      // 14d: fmul
      // 14e: fload 7
      // 150: ldc 59.0
      // 152: nop
      // 153: fmul
      // 154: fadd
      // 155: fload 8
      // 157: ldc 11.0
      // 159: nop
      // 15a: fmul
      // 15b: fadd
      // 15c: ldc 100.0
      // 15e: nop
      // 15f: fdiv
      // 160: fstore 9
      // 162: fload 6
      // 164: ldc 30.0
      // 166: nop
      // 167: fmul
      // 168: fload 7
      // 16a: ldc 70.0
      // 16c: nop
      // 16d: fmul
      // 16e: fadd
      // 16f: ldc 100.0
      // 171: nop
      // 172: fdiv
      // 173: fstore 10
      // 175: fload 6
      // 177: ldc 30.0
      // 179: nop
      // 17a: fmul
      // 17b: fload 8
      // 17d: ldc 70.0
      // 17f: nop
      // 180: fmul
      // 181: fadd
      // 182: ldc 100.0
      // 184: nop
      // 185: fdiv
      // 186: fstore 11
      // 188: fload 9
      // 18a: fstore 6
      // 18c: fload 10
      // 18e: fstore 7
      // 190: fload 11
      // 192: fstore 8
      // 194: fload 6
      // 196: fload 7
      // 198: fload 8
      // 19a: invokestatic hzu.oxa (FFF)V
      // 19d: invokestatic jom.yut ()Ljom;
      // 1a0: astore 9
      // 1a2: aload 9
      // 1a4: invokevirtual jom.zuq ()Lq3g;
      // 1a7: astore 10
      // 1a9: bipush 0
      // 1aa: invokestatic hzu.jun (Z)V
      // 1ad: invokestatic hzu.xmh ()V
      // 1b0: iload 4
      // 1b2: iload 3
      // 1b3: ifeq 1ce
      // 1b6: ifeq 1c3
      // 1b9: goto 1c0
      // 1bc: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1bf: athrow
      // 1c0: invokestatic net/optifine/shaders/Shaders.enableFog ()V
      // 1c3: fload 6
      // 1c5: fload 7
      // 1c7: fload 8
      // 1c9: invokestatic hzu.oxa (FFF)V
      // 1cc: iload 4
      // 1ce: iload 3
      // 1cf: ifeq 1e2
      // 1d2: ifeq 1df
      // 1d5: goto 1dc
      // 1d8: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1db: athrow
      // 1dc: invokestatic net/optifine/shaders/Shaders.preSkyList ()V
      // 1df: invokestatic hxt.imn ()Z
      // 1e2: iload 3
      // 1e3: ifeq 254
      // 1e6: ifeq 24f
      // 1e9: goto 1f0
      // 1ec: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ef: athrow
      // 1f0: aload 0
      // 1f1: getfield crp.emi Z
      // 1f4: iload 3
      // 1f5: ifeq 24c
      // 1f8: goto 1ff
      // 1fb: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1fe: athrow
      // 1ff: ifeq 241
      // 202: goto 209
      // 205: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 208: athrow
      // 209: aload 0
      // 20a: getfield crp.o50 Lfab;
      // 20d: invokevirtual fab.qez ()V
      // 210: ldc 32884
      // 212: nop
      // 213: invokestatic org/lwjgl/opengl/GL11.glEnableClientState (I)V
      // 216: bipush 3
      // 217: sipush 5126
      // 21a: bipush 12
      // 21c: lconst_0
      // 21d: invokestatic org/lwjgl/opengl/GL11.glVertexPointer (IIIJ)V
      // 220: aload 0
      // 221: getfield crp.o50 Lfab;
      // 224: bipush 7
      // 226: invokevirtual fab.stg (I)V
      // 229: aload 0
      // 22a: getfield crp.o50 Lfab;
      // 22d: invokevirtual fab.hk8 ()V
      // 230: ldc 32884
      // 232: nop
      // 233: invokestatic org/lwjgl/opengl/GL11.glDisableClientState (I)V
      // 236: iload 3
      // 237: ifne 24f
      // 23a: goto 241
      // 23d: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 240: athrow
      // 241: aload 0
      // 242: getfield crp.ul_ I
      // 245: goto 24c
      // 248: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24b: athrow
      // 24c: invokestatic hzu.bcf (I)V
      // 24f: invokestatic hzu.gcp ()V
      // 252: iload 4
      // 254: iload 3
      // 255: ifeq 26e
      // 258: ifeq 265
      // 25b: goto 262
      // 25e: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 261: athrow
      // 262: invokestatic net/optifine/shaders/Shaders.disableFog ()V
      // 265: invokestatic hzu.vtj ()V
      // 268: invokestatic hzu.spd ()V
      // 26b: sipush 770
      // 26e: sipush 771
      // 271: bipush 1
      // 272: bipush 0
      // 273: invokestatic hzu.u39 (IIII)V
      // 276: invokestatic qpm.cng ()V
      // 279: aload 0
      // 27a: getfield crp.t6z Lkh3;
      // 27d: getfield kh3.vzz Lupn;
      // 280: aload 0
      // 281: getfield crp.t6z Lkh3;
      // 284: fload 1
      // 285: invokevirtual kh3.icw (F)F
      // 288: fload 1
      // 289: invokevirtual upn.sjt (FF)[F
      // 28c: astore 11
      // 28e: iload 3
      // 28f: ifeq 430
      // 292: aload 11
      // 294: ifnull 42d
      // 297: goto 29e
      // 29a: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29d: athrow
      // 29e: invokestatic hxt.kbg ()Z
      // 2a1: iload 3
      // 2a2: ifeq 432
      // 2a5: goto 2ac
      // 2a8: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2ab: athrow
      // 2ac: ifeq 42d
      // 2af: goto 2b6
      // 2b2: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b5: athrow
      // 2b6: invokestatic hzu.m_1 ()V
      // 2b9: iload 4
      // 2bb: iload 3
      // 2bc: ifeq 2fd
      // 2bf: goto 2c6
      // 2c2: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c5: athrow
      // 2c6: ifeq 2d3
      // 2c9: goto 2d0
      // 2cc: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2cf: athrow
      // 2d0: invokestatic net/optifine/shaders/Shaders.disableTexture2D ()V
      // 2d3: sipush 7425
      // 2d6: invokestatic hzu.nn9 (I)V
      // 2d9: invokestatic hzu.dp2 ()V
      // 2dc: ldc 90.0
      // 2de: nop
      // 2df: fconst_1
      // 2e0: fconst_0
      // 2e1: fconst_0
      // 2e2: invokestatic hzu.a2h (FFFF)V
      // 2e5: aload 0
      // 2e6: getfield crp.t6z Lkh3;
      // 2e9: fload 1
      // 2ea: invokevirtual kh3.v6p (F)F
      // 2ed: invokestatic fe6.rtn (F)F
      // 2f0: iload 3
      // 2f1: ifeq 30a
      // 2f4: fconst_0
      // 2f5: fcmpg
      // 2f6: goto 2fd
      // 2f9: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2fc: athrow
      // 2fd: ifge 30d
      // 300: ldc 180.0
      // 302: nop
      // 303: goto 30a
      // 306: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 309: athrow
      // 30a: goto 30e
      // 30d: fconst_0
      // 30e: fconst_0
      // 30f: fconst_0
      // 310: fconst_1
      // 311: invokestatic hzu.a2h (FFFF)V
      // 314: ldc 90.0
      // 316: nop
      // 317: fconst_0
      // 318: fconst_0
      // 319: fconst_1
      // 31a: invokestatic hzu.a2h (FFFF)V
      // 31d: aload 11
      // 31f: bipush 0
      // 320: faload
      // 321: fstore 12
      // 323: aload 11
      // 325: bipush 1
      // 326: faload
      // 327: fstore 13
      // 329: aload 11
      // 32b: bipush 2
      // 32c: faload
      // 32d: fstore 14
      // 32f: iload 2
      // 330: iload 3
      // 331: ifeq 3b1
      // 334: bipush 2
      // 335: if_icmpeq 38b
      // 338: goto 33f
      // 33b: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 33e: athrow
      // 33f: fload 12
      // 341: ldc 30.0
      // 343: nop
      // 344: fmul
      // 345: fload 13
      // 347: ldc 59.0
      // 349: nop
      // 34a: fmul
      // 34b: fadd
      // 34c: fload 14
      // 34e: ldc 11.0
      // 350: nop
      // 351: fmul
      // 352: fadd
      // 353: ldc 100.0
      // 355: nop
      // 356: fdiv
      // 357: fstore 15
      // 359: fload 12
      // 35b: ldc 30.0
      // 35d: nop
      // 35e: fmul
      // 35f: fload 13
      // 361: ldc 70.0
      // 363: nop
      // 364: fmul
      // 365: fadd
      // 366: ldc 100.0
      // 368: nop
      // 369: fdiv
      // 36a: fstore 16
      // 36c: fload 12
      // 36e: ldc 30.0
      // 370: nop
      // 371: fmul
      // 372: fload 14
      // 374: ldc 70.0
      // 376: nop
      // 377: fmul
      // 378: fadd
      // 379: ldc 100.0
      // 37b: nop
      // 37c: fdiv
      // 37d: fstore 17
      // 37f: fload 15
      // 381: fstore 12
      // 383: fload 16
      // 385: fstore 13
      // 387: fload 17
      // 389: fstore 14
      // 38b: aload 10
      // 38d: bipush 6
      // 38f: getstatic gnl.gec Lbe7;
      // 392: invokevirtual q3g.ezr (ILbe7;)V
      // 395: aload 10
      // 397: dconst_0
      // 398: ldc2_w 100.0
      // 39b: dconst_0
      // 39c: invokevirtual q3g.g5o (DDD)Lq3g;
      // 39f: fload 12
      // 3a1: fload 13
      // 3a3: fload 14
      // 3a5: aload 11
      // 3a7: bipush 3
      // 3a8: faload
      // 3a9: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 3ac: invokevirtual q3g.pzw ()V
      // 3af: bipush 16
      // 3b1: istore 15
      // 3b3: bipush 0
      // 3b4: istore 16
      // 3b6: iload 16
      // 3b8: bipush 16
      // 3ba: if_icmpgt 41f
      // 3bd: iload 16
      // 3bf: i2f
      // 3c0: ldc 3.1415927
      // 3c2: nop
      // 3c3: fmul
      // 3c4: fconst_2
      // 3c5: fmul
      // 3c6: ldc 16.0
      // 3c8: nop
      // 3c9: fdiv
      // 3ca: fstore 17
      // 3cc: fload 17
      // 3ce: invokestatic fe6.rtn (F)F
      // 3d1: fstore 18
      // 3d3: fload 17
      // 3d5: invokestatic fe6.ssk (F)F
      // 3d8: fstore 19
      // 3da: aload 10
      // 3dc: fload 18
      // 3de: ldc 120.0
      // 3e0: nop
      // 3e1: fmul
      // 3e2: f2d
      // 3e3: fload 19
      // 3e5: ldc 120.0
      // 3e7: nop
      // 3e8: fmul
      // 3e9: f2d
      // 3ea: fload 19
      // 3ec: fneg
      // 3ed: ldc 40.0
      // 3ef: nop
      // 3f0: fmul
      // 3f1: aload 11
      // 3f3: bipush 3
      // 3f4: faload
      // 3f5: fmul
      // 3f6: f2d
      // 3f7: invokevirtual q3g.g5o (DDD)Lq3g;
      // 3fa: aload 11
      // 3fc: bipush 0
      // 3fd: faload
      // 3fe: aload 11
      // 400: bipush 1
      // 401: faload
      // 402: aload 11
      // 404: bipush 2
      // 405: faload
      // 406: fconst_0
      // 407: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 40a: invokevirtual q3g.pzw ()V
      // 40d: iinc 16 1
      // 410: iload 3
      // 411: ifeq 427
      // 414: iload 3
      // 415: ifne 3b6
      // 418: goto 41f
      // 41b: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41e: athrow
      // 41f: aload 9
      // 421: invokevirtual jom.q7g ()V
      // 424: invokestatic hzu.x3w ()V
      // 427: sipush 7424
      // 42a: invokestatic hzu.nn9 (I)V
      // 42d: invokestatic hzu.rqj ()V
      // 430: iload 4
      // 432: iload 3
      // 433: ifeq 446
      // 436: ifeq 443
      // 439: goto 440
      // 43c: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 43f: athrow
      // 440: invokestatic net/optifine/shaders/Shaders.enableTexture2D ()V
      // 443: sipush 770
      // 446: bipush 1
      // 447: bipush 1
      // 448: bipush 0
      // 449: invokestatic hzu.u39 (IIII)V
      // 44c: invokestatic hzu.dp2 ()V
      // 44f: fconst_1
      // 450: aload 0
      // 451: getfield crp.t6z Lkh3;
      // 454: fload 1
      // 455: invokevirtual kh3.bne (F)F
      // 458: fsub
      // 459: fstore 12
      // 45b: fconst_1
      // 45c: fconst_1
      // 45d: fconst_1
      // 45e: fload 12
      // 460: invokestatic hzu.wn0 (FFFF)V
      // 463: ldc -90.0
      // 465: nop
      // 466: fconst_0
      // 467: fconst_1
      // 468: fconst_0
      // 469: invokestatic hzu.a2h (FFFF)V
      // 46c: aload 0
      // 46d: getfield crp.t6z Lkh3;
      // 470: aload 0
      // 471: getfield crp.nr3 Llc5;
      // 474: fload 1
      // 475: invokestatic net/optifine/CustomSky.renderSky (Lt9d;Llc5;F)V
      // 478: iload 4
      // 47a: iload 3
      // 47b: ifeq 4aa
      // 47e: ifeq 48b
      // 481: goto 488
      // 484: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 487: athrow
      // 488: invokestatic net/optifine/shaders/Shaders.preCelestialRotate ()V
      // 48b: aload 0
      // 48c: getfield crp.t6z Lkh3;
      // 48f: fload 1
      // 490: invokevirtual kh3.icw (F)F
      // 493: ldc 360.0
      // 495: nop
      // 496: fmul
      // 497: iload 3
      // 498: ifeq 4b3
      // 49b: fconst_1
      // 49c: fconst_0
      // 49d: fconst_0
      // 49e: invokestatic hzu.a2h (FFFF)V
      // 4a1: iload 4
      // 4a3: goto 4aa
      // 4a6: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a9: athrow
      // 4aa: ifeq 4b0
      // 4ad: invokestatic net/optifine/shaders/Shaders.postCelestialRotate ()V
      // 4b0: ldc 30.0
      // 4b2: nop
      // 4b3: fstore 13
      // 4b5: invokestatic hxt.p9a ()Z
      // 4b8: iload 3
      // 4b9: ifeq 54a
      // 4bc: ifeq 542
      // 4bf: goto 4c6
      // 4c2: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4c5: athrow
      // 4c6: aload 0
      // 4c7: getfield crp.nr3 Llc5;
      // 4ca: getstatic crp.jnk Lgdz;
      // 4cd: invokevirtual lc5.anl (Lgdz;)V
      // 4d0: aload 10
      // 4d2: bipush 7
      // 4d4: getstatic gnl._r5 Lbe7;
      // 4d7: invokevirtual q3g.ezr (ILbe7;)V
      // 4da: aload 10
      // 4dc: fload 13
      // 4de: fneg
      // 4df: f2d
      // 4e0: ldc2_w 100.0
      // 4e3: fload 13
      // 4e5: fneg
      // 4e6: f2d
      // 4e7: invokevirtual q3g.g5o (DDD)Lq3g;
      // 4ea: dconst_0
      // 4eb: dconst_0
      // 4ec: invokevirtual q3g.h0a (DD)Lq3g;
      // 4ef: invokevirtual q3g.pzw ()V
      // 4f2: aload 10
      // 4f4: fload 13
      // 4f6: f2d
      // 4f7: ldc2_w 100.0
      // 4fa: fload 13
      // 4fc: fneg
      // 4fd: f2d
      // 4fe: invokevirtual q3g.g5o (DDD)Lq3g;
      // 501: dconst_1
      // 502: dconst_0
      // 503: invokevirtual q3g.h0a (DD)Lq3g;
      // 506: invokevirtual q3g.pzw ()V
      // 509: aload 10
      // 50b: fload 13
      // 50d: f2d
      // 50e: ldc2_w 100.0
      // 511: fload 13
      // 513: f2d
      // 514: invokevirtual q3g.g5o (DDD)Lq3g;
      // 517: dconst_1
      // 518: dconst_1
      // 519: invokevirtual q3g.h0a (DD)Lq3g;
      // 51c: invokevirtual q3g.pzw ()V
      // 51f: aload 10
      // 521: fload 13
      // 523: fneg
      // 524: f2d
      // 525: ldc2_w 100.0
      // 528: fload 13
      // 52a: f2d
      // 52b: invokevirtual q3g.g5o (DDD)Lq3g;
      // 52e: dconst_0
      // 52f: dconst_1
      // 530: invokevirtual q3g.h0a (DD)Lq3g;
      // 533: invokevirtual q3g.pzw ()V
      // 536: aload 9
      // 538: invokevirtual jom.q7g ()V
      // 53b: goto 542
      // 53e: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 541: athrow
      // 542: ldc 20.0
      // 544: nop
      // 545: fstore 13
      // 547: invokestatic hxt.jt1 ()Z
      // 54a: iload 3
      // 54b: ifeq 621
      // 54e: ifeq 61c
      // 551: goto 558
      // 554: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 557: athrow
      // 558: aload 0
      // 559: getfield crp.nr3 Llc5;
      // 55c: getstatic crp.zbm Lgdz;
      // 55f: invokevirtual lc5.anl (Lgdz;)V
      // 562: aload 0
      // 563: getfield crp.t6z Lkh3;
      // 566: invokevirtual kh3._mu ()I
      // 569: istore 14
      // 56b: iload 14
      // 56d: bipush 4
      // 56e: irem
      // 56f: istore 15
      // 571: iload 14
      // 573: bipush 4
      // 574: idiv
      // 575: bipush 2
      // 576: irem
      // 577: istore 16
      // 579: iload 15
      // 57b: bipush 0
      // 57c: iadd
      // 57d: i2f
      // 57e: ldc 4.0
      // 580: nop
      // 581: fdiv
      // 582: fstore 17
      // 584: iload 16
      // 586: bipush 0
      // 587: iadd
      // 588: i2f
      // 589: fconst_2
      // 58a: fdiv
      // 58b: fstore 18
      // 58d: iload 15
      // 58f: bipush 1
      // 590: iadd
      // 591: i2f
      // 592: ldc 4.0
      // 594: nop
      // 595: fdiv
      // 596: fstore 19
      // 598: iload 16
      // 59a: bipush 1
      // 59b: iadd
      // 59c: i2f
      // 59d: fconst_2
      // 59e: fdiv
      // 59f: fstore 20
      // 5a1: aload 10
      // 5a3: bipush 7
      // 5a5: getstatic gnl._r5 Lbe7;
      // 5a8: invokevirtual q3g.ezr (ILbe7;)V
      // 5ab: aload 10
      // 5ad: fload 13
      // 5af: fneg
      // 5b0: f2d
      // 5b1: ldc2_w -100.0
      // 5b4: fload 13
      // 5b6: f2d
      // 5b7: invokevirtual q3g.g5o (DDD)Lq3g;
      // 5ba: fload 19
      // 5bc: f2d
      // 5bd: fload 20
      // 5bf: f2d
      // 5c0: invokevirtual q3g.h0a (DD)Lq3g;
      // 5c3: invokevirtual q3g.pzw ()V
      // 5c6: aload 10
      // 5c8: fload 13
      // 5ca: f2d
      // 5cb: ldc2_w -100.0
      // 5ce: fload 13
      // 5d0: f2d
      // 5d1: invokevirtual q3g.g5o (DDD)Lq3g;
      // 5d4: fload 17
      // 5d6: f2d
      // 5d7: fload 20
      // 5d9: f2d
      // 5da: invokevirtual q3g.h0a (DD)Lq3g;
      // 5dd: invokevirtual q3g.pzw ()V
      // 5e0: aload 10
      // 5e2: fload 13
      // 5e4: f2d
      // 5e5: ldc2_w -100.0
      // 5e8: fload 13
      // 5ea: fneg
      // 5eb: f2d
      // 5ec: invokevirtual q3g.g5o (DDD)Lq3g;
      // 5ef: fload 17
      // 5f1: f2d
      // 5f2: fload 18
      // 5f4: f2d
      // 5f5: invokevirtual q3g.h0a (DD)Lq3g;
      // 5f8: invokevirtual q3g.pzw ()V
      // 5fb: aload 10
      // 5fd: fload 13
      // 5ff: fneg
      // 600: f2d
      // 601: ldc2_w -100.0
      // 604: fload 13
      // 606: fneg
      // 607: f2d
      // 608: invokevirtual q3g.g5o (DDD)Lq3g;
      // 60b: fload 19
      // 60d: f2d
      // 60e: fload 18
      // 610: f2d
      // 611: invokevirtual q3g.h0a (DD)Lq3g;
      // 614: invokevirtual q3g.pzw ()V
      // 617: aload 9
      // 619: invokevirtual jom.q7g ()V
      // 61c: invokestatic hzu.m_1 ()V
      // 61f: iload 4
      // 621: ifeq 627
      // 624: invokestatic net/optifine/shaders/Shaders.disableTexture2D ()V
      // 627: aload 0
      // 628: getfield crp.t6z Lkh3;
      // 62b: fload 1
      // 62c: invokevirtual kh3.qp_ (F)F
      // 62f: fload 12
      // 631: fmul
      // 632: fstore 14
      // 634: fload 14
      // 636: fconst_0
      // 637: fcmpl
      // 638: iload 3
      // 639: ifeq 6f6
      // 63c: ifle 6e4
      // 63f: goto 646
      // 642: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 645: athrow
      // 646: invokestatic hxt.ose ()Z
      // 649: iload 3
      // 64a: ifeq 6f6
      // 64d: goto 654
      // 650: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 653: athrow
      // 654: ifeq 6e4
      // 657: goto 65e
      // 65a: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 65d: athrow
      // 65e: aload 0
      // 65f: getfield crp.t6z Lkh3;
      // 662: invokestatic net/optifine/CustomSky.hasSkyLayers (Lt9d;)Z
      // 665: iload 3
      // 666: ifeq 6f6
      // 669: goto 670
      // 66c: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 66f: athrow
      // 670: ifne 6e4
      // 673: goto 67a
      // 676: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 679: athrow
      // 67a: fload 14
      // 67c: fload 14
      // 67e: fload 14
      // 680: fload 14
      // 682: invokestatic hzu.wn0 (FFFF)V
      // 685: aload 0
      // 686: getfield crp.emi Z
      // 689: iload 3
      // 68a: ifeq 6e1
      // 68d: goto 694
      // 690: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 693: athrow
      // 694: ifeq 6d6
      // 697: goto 69e
      // 69a: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 69d: athrow
      // 69e: aload 0
      // 69f: getfield crp.uu2 Lfab;
      // 6a2: invokevirtual fab.qez ()V
      // 6a5: ldc 32884
      // 6a7: nop
      // 6a8: invokestatic org/lwjgl/opengl/GL11.glEnableClientState (I)V
      // 6ab: bipush 3
      // 6ac: sipush 5126
      // 6af: bipush 12
      // 6b1: lconst_0
      // 6b2: invokestatic org/lwjgl/opengl/GL11.glVertexPointer (IIIJ)V
      // 6b5: aload 0
      // 6b6: getfield crp.uu2 Lfab;
      // 6b9: bipush 7
      // 6bb: invokevirtual fab.stg (I)V
      // 6be: aload 0
      // 6bf: getfield crp.uu2 Lfab;
      // 6c2: invokevirtual fab.hk8 ()V
      // 6c5: ldc 32884
      // 6c7: nop
      // 6c8: invokestatic org/lwjgl/opengl/GL11.glDisableClientState (I)V
      // 6cb: iload 3
      // 6cc: ifne 6e4
      // 6cf: goto 6d6
      // 6d2: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6d5: athrow
      // 6d6: aload 0
      // 6d7: getfield crp.jsw I
      // 6da: goto 6e1
      // 6dd: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6e0: athrow
      // 6e1: invokestatic hzu.bcf (I)V
      // 6e4: fconst_1
      // 6e5: fconst_1
      // 6e6: fconst_1
      // 6e7: fconst_1
      // 6e8: invokestatic hzu.wn0 (FFFF)V
      // 6eb: invokestatic hzu.ux6 ()V
      // 6ee: invokestatic hzu.if9 ()V
      // 6f1: invokestatic hzu.xmh ()V
      // 6f4: iload 4
      // 6f6: iload 3
      // 6f7: ifeq 71a
      // 6fa: ifeq 707
      // 6fd: goto 704
      // 700: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 703: athrow
      // 704: invokestatic net/optifine/shaders/Shaders.enableFog ()V
      // 707: invokestatic hzu.x3w ()V
      // 70a: invokestatic hzu.m_1 ()V
      // 70d: iload 3
      // 70e: ifeq 726
      // 711: iload 4
      // 713: goto 71a
      // 716: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 719: athrow
      // 71a: ifeq 720
      // 71d: invokestatic net/optifine/shaders/Shaders.disableTexture2D ()V
      // 720: fconst_0
      // 721: fconst_0
      // 722: fconst_0
      // 723: invokestatic hzu.oxa (FFF)V
      // 726: aload 0
      // 727: getfield crp.j0u Lc05;
      // 72a: getfield c05.vg8 Ll86;
      // 72d: fload 1
      // 72e: invokevirtual l86.tib (F)Lfqr;
      // 731: getfield fqr.gn5 D
      // 734: aload 0
      // 735: getfield crp.t6z Lkh3;
      // 738: invokevirtual kh3.ss4 ()D
      // 73b: dsub
      // 73c: dstore 15
      // 73e: dload 15
      // 740: dconst_0
      // 741: dcmpg
      // 742: iload 3
      // 743: ifeq 9c8
      // 746: ifge 9be
      // 749: goto 750
      // 74c: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 74f: athrow
      // 750: invokestatic hzu.dp2 ()V
      // 753: fconst_0
      // 754: ldc 12.0
      // 756: nop
      // 757: fconst_0
      // 758: invokestatic hzu.a4k (FFF)V
      // 75b: aload 0
      // 75c: getfield crp.emi Z
      // 75f: iload 3
      // 760: ifeq 7b7
      // 763: goto 76a
      // 766: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 769: athrow
      // 76a: ifeq 7ac
      // 76d: goto 774
      // 770: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 773: athrow
      // 774: aload 0
      // 775: getfield crp.i65 Lfab;
      // 778: invokevirtual fab.qez ()V
      // 77b: ldc 32884
      // 77d: nop
      // 77e: invokestatic org/lwjgl/opengl/GL11.glEnableClientState (I)V
      // 781: bipush 3
      // 782: sipush 5126
      // 785: bipush 12
      // 787: lconst_0
      // 788: invokestatic org/lwjgl/opengl/GL11.glVertexPointer (IIIJ)V
      // 78b: aload 0
      // 78c: getfield crp.i65 Lfab;
      // 78f: bipush 7
      // 791: invokevirtual fab.stg (I)V
      // 794: aload 0
      // 795: getfield crp.i65 Lfab;
      // 798: invokevirtual fab.hk8 ()V
      // 79b: ldc 32884
      // 79d: nop
      // 79e: invokestatic org/lwjgl/opengl/GL11.glDisableClientState (I)V
      // 7a1: iload 3
      // 7a2: ifne 7ba
      // 7a5: goto 7ac
      // 7a8: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7ab: athrow
      // 7ac: aload 0
      // 7ad: getfield crp.cj4 I
      // 7b0: goto 7b7
      // 7b3: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7b6: athrow
      // 7b7: invokestatic hzu.bcf (I)V
      // 7ba: invokestatic hzu.x3w ()V
      // 7bd: fconst_1
      // 7be: fstore 17
      // 7c0: dload 15
      // 7c2: ldc2_w 65.0
      // 7c5: dadd
      // 7c6: d2f
      // 7c7: fneg
      // 7c8: fstore 18
      // 7ca: ldc -1.0
      // 7cc: nop
      // 7cd: fstore 19
      // 7cf: aload 10
      // 7d1: bipush 7
      // 7d3: getstatic gnl.gec Lbe7;
      // 7d6: invokevirtual q3g.ezr (ILbe7;)V
      // 7d9: aload 10
      // 7db: ldc2_w -1.0
      // 7de: fload 18
      // 7e0: f2d
      // 7e1: dconst_1
      // 7e2: invokevirtual q3g.g5o (DDD)Lq3g;
      // 7e5: bipush 0
      // 7e6: bipush 0
      // 7e7: bipush 0
      // 7e8: sipush 255
      // 7eb: invokevirtual q3g.fje (IIII)Lq3g;
      // 7ee: invokevirtual q3g.pzw ()V
      // 7f1: aload 10
      // 7f3: dconst_1
      // 7f4: fload 18
      // 7f6: f2d
      // 7f7: dconst_1
      // 7f8: invokevirtual q3g.g5o (DDD)Lq3g;
      // 7fb: bipush 0
      // 7fc: bipush 0
      // 7fd: bipush 0
      // 7fe: sipush 255
      // 801: invokevirtual q3g.fje (IIII)Lq3g;
      // 804: invokevirtual q3g.pzw ()V
      // 807: aload 10
      // 809: dconst_1
      // 80a: ldc2_w -1.0
      // 80d: dconst_1
      // 80e: invokevirtual q3g.g5o (DDD)Lq3g;
      // 811: bipush 0
      // 812: bipush 0
      // 813: bipush 0
      // 814: sipush 255
      // 817: invokevirtual q3g.fje (IIII)Lq3g;
      // 81a: invokevirtual q3g.pzw ()V
      // 81d: aload 10
      // 81f: ldc2_w -1.0
      // 822: ldc2_w -1.0
      // 825: dconst_1
      // 826: invokevirtual q3g.g5o (DDD)Lq3g;
      // 829: bipush 0
      // 82a: bipush 0
      // 82b: bipush 0
      // 82c: sipush 255
      // 82f: invokevirtual q3g.fje (IIII)Lq3g;
      // 832: invokevirtual q3g.pzw ()V
      // 835: aload 10
      // 837: ldc2_w -1.0
      // 83a: ldc2_w -1.0
      // 83d: ldc2_w -1.0
      // 840: invokevirtual q3g.g5o (DDD)Lq3g;
      // 843: bipush 0
      // 844: bipush 0
      // 845: bipush 0
      // 846: sipush 255
      // 849: invokevirtual q3g.fje (IIII)Lq3g;
      // 84c: invokevirtual q3g.pzw ()V
      // 84f: aload 10
      // 851: dconst_1
      // 852: ldc2_w -1.0
      // 855: ldc2_w -1.0
      // 858: invokevirtual q3g.g5o (DDD)Lq3g;
      // 85b: bipush 0
      // 85c: bipush 0
      // 85d: bipush 0
      // 85e: sipush 255
      // 861: invokevirtual q3g.fje (IIII)Lq3g;
      // 864: invokevirtual q3g.pzw ()V
      // 867: aload 10
      // 869: dconst_1
      // 86a: fload 18
      // 86c: f2d
      // 86d: ldc2_w -1.0
      // 870: invokevirtual q3g.g5o (DDD)Lq3g;
      // 873: bipush 0
      // 874: bipush 0
      // 875: bipush 0
      // 876: sipush 255
      // 879: invokevirtual q3g.fje (IIII)Lq3g;
      // 87c: invokevirtual q3g.pzw ()V
      // 87f: aload 10
      // 881: ldc2_w -1.0
      // 884: fload 18
      // 886: f2d
      // 887: ldc2_w -1.0
      // 88a: invokevirtual q3g.g5o (DDD)Lq3g;
      // 88d: bipush 0
      // 88e: bipush 0
      // 88f: bipush 0
      // 890: sipush 255
      // 893: invokevirtual q3g.fje (IIII)Lq3g;
      // 896: invokevirtual q3g.pzw ()V
      // 899: aload 10
      // 89b: dconst_1
      // 89c: ldc2_w -1.0
      // 89f: ldc2_w -1.0
      // 8a2: invokevirtual q3g.g5o (DDD)Lq3g;
      // 8a5: bipush 0
      // 8a6: bipush 0
      // 8a7: bipush 0
      // 8a8: sipush 255
      // 8ab: invokevirtual q3g.fje (IIII)Lq3g;
      // 8ae: invokevirtual q3g.pzw ()V
      // 8b1: aload 10
      // 8b3: dconst_1
      // 8b4: ldc2_w -1.0
      // 8b7: dconst_1
      // 8b8: invokevirtual q3g.g5o (DDD)Lq3g;
      // 8bb: bipush 0
      // 8bc: bipush 0
      // 8bd: bipush 0
      // 8be: sipush 255
      // 8c1: invokevirtual q3g.fje (IIII)Lq3g;
      // 8c4: invokevirtual q3g.pzw ()V
      // 8c7: aload 10
      // 8c9: dconst_1
      // 8ca: fload 18
      // 8cc: f2d
      // 8cd: dconst_1
      // 8ce: invokevirtual q3g.g5o (DDD)Lq3g;
      // 8d1: bipush 0
      // 8d2: bipush 0
      // 8d3: bipush 0
      // 8d4: sipush 255
      // 8d7: invokevirtual q3g.fje (IIII)Lq3g;
      // 8da: invokevirtual q3g.pzw ()V
      // 8dd: aload 10
      // 8df: dconst_1
      // 8e0: fload 18
      // 8e2: f2d
      // 8e3: ldc2_w -1.0
      // 8e6: invokevirtual q3g.g5o (DDD)Lq3g;
      // 8e9: bipush 0
      // 8ea: bipush 0
      // 8eb: bipush 0
      // 8ec: sipush 255
      // 8ef: invokevirtual q3g.fje (IIII)Lq3g;
      // 8f2: invokevirtual q3g.pzw ()V
      // 8f5: aload 10
      // 8f7: ldc2_w -1.0
      // 8fa: fload 18
      // 8fc: f2d
      // 8fd: ldc2_w -1.0
      // 900: invokevirtual q3g.g5o (DDD)Lq3g;
      // 903: bipush 0
      // 904: bipush 0
      // 905: bipush 0
      // 906: sipush 255
      // 909: invokevirtual q3g.fje (IIII)Lq3g;
      // 90c: invokevirtual q3g.pzw ()V
      // 90f: aload 10
      // 911: ldc2_w -1.0
      // 914: fload 18
      // 916: f2d
      // 917: dconst_1
      // 918: invokevirtual q3g.g5o (DDD)Lq3g;
      // 91b: bipush 0
      // 91c: bipush 0
      // 91d: bipush 0
      // 91e: sipush 255
      // 921: invokevirtual q3g.fje (IIII)Lq3g;
      // 924: invokevirtual q3g.pzw ()V
      // 927: aload 10
      // 929: ldc2_w -1.0
      // 92c: ldc2_w -1.0
      // 92f: dconst_1
      // 930: invokevirtual q3g.g5o (DDD)Lq3g;
      // 933: bipush 0
      // 934: bipush 0
      // 935: bipush 0
      // 936: sipush 255
      // 939: invokevirtual q3g.fje (IIII)Lq3g;
      // 93c: invokevirtual q3g.pzw ()V
      // 93f: aload 10
      // 941: ldc2_w -1.0
      // 944: ldc2_w -1.0
      // 947: ldc2_w -1.0
      // 94a: invokevirtual q3g.g5o (DDD)Lq3g;
      // 94d: bipush 0
      // 94e: bipush 0
      // 94f: bipush 0
      // 950: sipush 255
      // 953: invokevirtual q3g.fje (IIII)Lq3g;
      // 956: invokevirtual q3g.pzw ()V
      // 959: aload 10
      // 95b: ldc2_w -1.0
      // 95e: ldc2_w -1.0
      // 961: ldc2_w -1.0
      // 964: invokevirtual q3g.g5o (DDD)Lq3g;
      // 967: bipush 0
      // 968: bipush 0
      // 969: bipush 0
      // 96a: sipush 255
      // 96d: invokevirtual q3g.fje (IIII)Lq3g;
      // 970: invokevirtual q3g.pzw ()V
      // 973: aload 10
      // 975: ldc2_w -1.0
      // 978: ldc2_w -1.0
      // 97b: dconst_1
      // 97c: invokevirtual q3g.g5o (DDD)Lq3g;
      // 97f: bipush 0
      // 980: bipush 0
      // 981: bipush 0
      // 982: sipush 255
      // 985: invokevirtual q3g.fje (IIII)Lq3g;
      // 988: invokevirtual q3g.pzw ()V
      // 98b: aload 10
      // 98d: dconst_1
      // 98e: ldc2_w -1.0
      // 991: dconst_1
      // 992: invokevirtual q3g.g5o (DDD)Lq3g;
      // 995: bipush 0
      // 996: bipush 0
      // 997: bipush 0
      // 998: sipush 255
      // 99b: invokevirtual q3g.fje (IIII)Lq3g;
      // 99e: invokevirtual q3g.pzw ()V
      // 9a1: aload 10
      // 9a3: dconst_1
      // 9a4: ldc2_w -1.0
      // 9a7: ldc2_w -1.0
      // 9aa: invokevirtual q3g.g5o (DDD)Lq3g;
      // 9ad: bipush 0
      // 9ae: bipush 0
      // 9af: bipush 0
      // 9b0: sipush 255
      // 9b3: invokevirtual q3g.fje (IIII)Lq3g;
      // 9b6: invokevirtual q3g.pzw ()V
      // 9b9: aload 9
      // 9bb: invokevirtual jom.q7g ()V
      // 9be: aload 0
      // 9bf: getfield crp.t6z Lkh3;
      // 9c2: getfield kh3.vzz Lupn;
      // 9c5: invokevirtual upn.t8l ()Z
      // 9c8: ifeq 9f7
      // 9cb: fload 6
      // 9cd: ldc 0.2
      // 9cf: nop
      // 9d0: fmul
      // 9d1: ldc 0.04
      // 9d3: nop
      // 9d4: fadd
      // 9d5: fload 7
      // 9d7: ldc 0.2
      // 9d9: nop
      // 9da: fmul
      // 9db: ldc 0.04
      // 9dd: nop
      // 9de: fadd
      // 9df: fload 8
      // 9e1: ldc 0.6
      // 9e3: nop
      // 9e4: fmul
      // 9e5: ldc 0.1
      // 9e7: nop
      // 9e8: fadd
      // 9e9: invokestatic hzu.oxa (FFF)V
      // 9ec: iload 3
      // 9ed: ifne a07
      // 9f0: goto 9f7
      // 9f3: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9f6: athrow
      // 9f7: fload 6
      // 9f9: fload 7
      // 9fb: fload 8
      // 9fd: invokestatic hzu.oxa (FFF)V
      // a00: goto a07
      // a03: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a06: athrow
      // a07: aload 0
      // a08: getfield crp.j0u Lc05;
      // a0b: getfield c05.oxn Lmoh;
      // a0e: getfield moh.gcj I
      // a11: iload 3
      // a12: ifeq a5b
      // a15: bipush 4
      // a16: if_icmpgt a48
      // a19: goto a20
      // a1c: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a1f: athrow
      // a20: aload 0
      // a21: getfield crp.j0u Lc05;
      // a24: getfield c05.x0p Lv3i;
      // a27: getfield v3i.h0i F
      // a2a: aload 0
      // a2b: getfield crp.j0u Lc05;
      // a2e: getfield c05.x0p Lv3i;
      // a31: getfield v3i.qy4 F
      // a34: aload 0
      // a35: getfield crp.j0u Lc05;
      // a38: getfield c05.x0p Lv3i;
      // a3b: getfield v3i.ai5 F
      // a3e: invokestatic hzu.oxa (FFF)V
      // a41: goto a48
      // a44: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a47: athrow
      // a48: invokestatic hzu.dp2 ()V
      // a4b: fconst_0
      // a4c: dload 15
      // a4e: ldc2_w 16.0
      // a51: dsub
      // a52: d2f
      // a53: fneg
      // a54: fconst_0
      // a55: invokestatic hzu.a4k (FFF)V
      // a58: invokestatic hxt.imn ()Z
      // a5b: iload 3
      // a5c: ifeq ad0
      // a5f: ifeq ac8
      // a62: goto a69
      // a65: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a68: athrow
      // a69: aload 0
      // a6a: getfield crp.emi Z
      // a6d: iload 3
      // a6e: ifeq ac5
      // a71: goto a78
      // a74: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a77: athrow
      // a78: ifeq aba
      // a7b: goto a82
      // a7e: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a81: athrow
      // a82: aload 0
      // a83: getfield crp.i65 Lfab;
      // a86: invokevirtual fab.qez ()V
      // a89: ldc 32884
      // a8b: nop
      // a8c: invokestatic hzu.k4h (I)V
      // a8f: bipush 3
      // a90: sipush 5126
      // a93: bipush 12
      // a95: bipush 0
      // a96: invokestatic hzu.x4r (IIII)V
      // a99: aload 0
      // a9a: getfield crp.i65 Lfab;
      // a9d: bipush 7
      // a9f: invokevirtual fab.stg (I)V
      // aa2: aload 0
      // aa3: getfield crp.i65 Lfab;
      // aa6: invokevirtual fab.hk8 ()V
      // aa9: ldc 32884
      // aab: nop
      // aac: invokestatic hzu.cwt (I)V
      // aaf: iload 3
      // ab0: ifne ac8
      // ab3: goto aba
      // ab6: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ab9: athrow
      // aba: aload 0
      // abb: getfield crp.cj4 I
      // abe: goto ac5
      // ac1: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ac4: athrow
      // ac5: invokestatic hzu.bcf (I)V
      // ac8: invokestatic hzu.x3w ()V
      // acb: invokestatic hzu.rqj ()V
      // ace: iload 4
      // ad0: iload 3
      // ad1: ifeq ae2
      // ad4: ifeq ae1
      // ad7: goto ade
      // ada: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // add: athrow
      // ade: invokestatic net/optifine/shaders/Shaders.enableTexture2D ()V
      // ae1: bipush 1
      // ae2: invokestatic hzu.jun (Z)V
      // ae5: return
   }

   public void pui(float param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 3
      // 004: invokestatic hxt.mdq ()Z
      // 007: iload 3
      // 008: ifeq 022
      // 00b: ifne 3ef
      // 00e: goto 015
      // 011: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 014: athrow
      // 015: getstatic net/optifine/reflect/Reflector.ForgeWorldProvider_getCloudRenderer Lnet/optifine/reflect/ReflectorMethod;
      // 018: invokevirtual net/optifine/reflect/ReflectorMethod.exists ()Z
      // 01b: goto 022
      // 01e: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 021: athrow
      // 022: iload 3
      // 023: ifeq 086
      // 026: ifeq 079
      // 029: goto 030
      // 02c: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02f: athrow
      // 030: aload 0
      // 031: getfield crp.j0u Lc05;
      // 034: getfield c05.tij Lkh3;
      // 037: getfield kh3.vzz Lupn;
      // 03a: astore 4
      // 03c: aload 4
      // 03e: iload 3
      // 03f: ifeq 083
      // 042: getstatic net/optifine/reflect/Reflector.ForgeWorldProvider_getCloudRenderer Lnet/optifine/reflect/ReflectorMethod;
      // 045: bipush 0
      // 046: anewarray 70
      // 049: invokestatic net/optifine/reflect/Reflector.call (Ljava/lang/Object;Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)Ljava/lang/Object;
      // 04c: astore 5
      // 04e: aload 5
      // 050: ifnull 079
      // 053: aload 5
      // 055: getstatic net/optifine/reflect/Reflector.IRenderHandler_render Lnet/optifine/reflect/ReflectorMethod;
      // 058: bipush 3
      // 059: anewarray 70
      // 05c: dup
      // 05d: bipush 0
      // 05e: fload 1
      // 05f: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 062: aastore
      // 063: dup
      // 064: bipush 1
      // 065: aload 0
      // 066: getfield crp.t6z Lkh3;
      // 069: aastore
      // 06a: dup
      // 06b: bipush 2
      // 06c: aload 0
      // 06d: getfield crp.j0u Lc05;
      // 070: aastore
      // 071: invokestatic net/optifine/reflect/Reflector.callVoid (Ljava/lang/Object;Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)V
      // 074: return
      // 075: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 078: athrow
      // 079: aload 0
      // 07a: getfield crp.j0u Lc05;
      // 07d: getfield c05.tij Lkh3;
      // 080: getfield kh3.vzz Lupn;
      // 083: invokevirtual upn.cws ()Z
      // 086: iload 3
      // 087: ifeq 097
      // 08a: ifeq 3ef
      // 08d: goto 094
      // 090: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 093: athrow
      // 094: invokestatic hxt.ly3 ()Z
      // 097: iload 3
      // 098: ifeq 0ab
      // 09b: ifeq 0a8
      // 09e: goto 0a5
      // 0a1: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a4: athrow
      // 0a5: invokestatic net/optifine/shaders/Shaders.beginClouds ()V
      // 0a8: invokestatic hxt.heh ()Z
      // 0ab: ifeq 0bf
      // 0ae: aload 0
      // 0af: fload 1
      // 0b0: iload 2
      // 0b1: invokespecial crp.wj5 (FI)V
      // 0b4: iload 3
      // 0b5: ifne 3e6
      // 0b8: goto 0bf
      // 0bb: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0be: athrow
      // 0bf: fload 1
      // 0c0: fstore 4
      // 0c2: fconst_0
      // 0c3: fstore 1
      // 0c4: invokestatic hzu.o1b ()V
      // 0c7: aload 0
      // 0c8: getfield crp.j0u Lc05;
      // 0cb: invokevirtual c05.nsd ()Li2h;
      // 0ce: getfield i2h.c54 D
      // 0d1: aload 0
      // 0d2: getfield crp.j0u Lc05;
      // 0d5: invokevirtual c05.nsd ()Li2h;
      // 0d8: getfield i2h.kfp D
      // 0db: aload 0
      // 0dc: getfield crp.j0u Lc05;
      // 0df: invokevirtual c05.nsd ()Li2h;
      // 0e2: getfield i2h.c54 D
      // 0e5: dsub
      // 0e6: fload 1
      // 0e7: f2d
      // 0e8: dmul
      // 0e9: dadd
      // 0ea: d2f
      // 0eb: fstore 5
      // 0ed: bipush 32
      // 0ef: istore 6
      // 0f1: bipush 8
      // 0f3: istore 7
      // 0f5: invokestatic jom.yut ()Ljom;
      // 0f8: astore 8
      // 0fa: aload 8
      // 0fc: invokevirtual jom.zuq ()Lq3g;
      // 0ff: astore 9
      // 101: aload 0
      // 102: getfield crp.nr3 Llc5;
      // 105: getstatic crp.fda Lgdz;
      // 108: invokevirtual lc5.anl (Lgdz;)V
      // 10b: invokestatic hzu.spd ()V
      // 10e: sipush 770
      // 111: sipush 771
      // 114: bipush 1
      // 115: bipush 0
      // 116: invokestatic hzu.u39 (IIII)V
      // 119: aload 0
      // 11a: getfield crp.t6z Lkh3;
      // 11d: fload 1
      // 11e: invokevirtual kh3.l86 (F)Lfqr;
      // 121: astore 10
      // 123: aload 10
      // 125: getfield fqr.lvi D
      // 128: d2f
      // 129: fstore 11
      // 12b: aload 10
      // 12d: getfield fqr.gn5 D
      // 130: d2f
      // 131: fstore 12
      // 133: aload 10
      // 135: getfield fqr.bn2 D
      // 138: d2f
      // 139: fstore 13
      // 13b: aload 0
      // 13c: getfield crp.sae Lnet/optifine/render/CloudRenderer;
      // 13f: bipush 0
      // 140: aload 0
      // 141: getfield crp.s0f I
      // 144: fload 4
      // 146: aload 10
      // 148: invokevirtual net/optifine/render/CloudRenderer.prepareToRender (ZIFLfqr;)V
      // 14b: aload 0
      // 14c: getfield crp.sae Lnet/optifine/render/CloudRenderer;
      // 14f: iload 3
      // 150: ifeq 3d6
      // 153: invokevirtual net/optifine/render/CloudRenderer.shouldUpdateGlList ()Z
      // 156: ifeq 3d2
      // 159: goto 160
      // 15c: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15f: athrow
      // 160: aload 0
      // 161: getfield crp.sae Lnet/optifine/render/CloudRenderer;
      // 164: invokevirtual net/optifine/render/CloudRenderer.startUpdateGlList ()V
      // 167: iload 2
      // 168: bipush 2
      // 169: if_icmpeq 1bf
      // 16c: goto 173
      // 16f: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 172: athrow
      // 173: fload 11
      // 175: ldc 30.0
      // 177: nop
      // 178: fmul
      // 179: fload 12
      // 17b: ldc 59.0
      // 17d: nop
      // 17e: fmul
      // 17f: fadd
      // 180: fload 13
      // 182: ldc 11.0
      // 184: nop
      // 185: fmul
      // 186: fadd
      // 187: ldc 100.0
      // 189: nop
      // 18a: fdiv
      // 18b: fstore 14
      // 18d: fload 11
      // 18f: ldc 30.0
      // 191: nop
      // 192: fmul
      // 193: fload 12
      // 195: ldc 70.0
      // 197: nop
      // 198: fmul
      // 199: fadd
      // 19a: ldc 100.0
      // 19c: nop
      // 19d: fdiv
      // 19e: fstore 15
      // 1a0: fload 11
      // 1a2: ldc 30.0
      // 1a4: nop
      // 1a5: fmul
      // 1a6: fload 13
      // 1a8: ldc 70.0
      // 1aa: nop
      // 1ab: fmul
      // 1ac: fadd
      // 1ad: ldc 100.0
      // 1af: nop
      // 1b0: fdiv
      // 1b1: fstore 16
      // 1b3: fload 14
      // 1b5: fstore 11
      // 1b7: fload 15
      // 1b9: fstore 12
      // 1bb: fload 16
      // 1bd: fstore 13
      // 1bf: ldc 4.8828125E-4
      // 1c1: nop
      // 1c2: fstore 14
      // 1c4: aload 0
      // 1c5: getfield crp.s0f I
      // 1c8: i2f
      // 1c9: fload 1
      // 1ca: fadd
      // 1cb: f2d
      // 1cc: dstore 15
      // 1ce: aload 0
      // 1cf: getfield crp.j0u Lc05;
      // 1d2: invokevirtual c05.nsd ()Li2h;
      // 1d5: getfield i2h.bc1 D
      // 1d8: aload 0
      // 1d9: getfield crp.j0u Lc05;
      // 1dc: invokevirtual c05.nsd ()Li2h;
      // 1df: getfield i2h.o2v D
      // 1e2: aload 0
      // 1e3: getfield crp.j0u Lc05;
      // 1e6: invokevirtual c05.nsd ()Li2h;
      // 1e9: getfield i2h.bc1 D
      // 1ec: dsub
      // 1ed: fload 1
      // 1ee: f2d
      // 1ef: dmul
      // 1f0: dadd
      // 1f1: dload 15
      // 1f3: ldc2_w 0.029999999329447746
      // 1f6: dmul
      // 1f7: dadd
      // 1f8: dstore 17
      // 1fa: aload 0
      // 1fb: getfield crp.j0u Lc05;
      // 1fe: invokevirtual c05.nsd ()Li2h;
      // 201: getfield i2h.a4d D
      // 204: aload 0
      // 205: getfield crp.j0u Lc05;
      // 208: invokevirtual c05.nsd ()Li2h;
      // 20b: getfield i2h.vbd D
      // 20e: aload 0
      // 20f: getfield crp.j0u Lc05;
      // 212: invokevirtual c05.nsd ()Li2h;
      // 215: getfield i2h.a4d D
      // 218: dsub
      // 219: fload 1
      // 21a: f2d
      // 21b: dmul
      // 21c: dadd
      // 21d: dstore 19
      // 21f: dload 17
      // 221: ldc2_w 2048.0
      // 224: ddiv
      // 225: invokestatic fe6.jqf (D)I
      // 228: istore 21
      // 22a: dload 19
      // 22c: ldc2_w 2048.0
      // 22f: ddiv
      // 230: invokestatic fe6.jqf (D)I
      // 233: istore 22
      // 235: dload 17
      // 237: iload 21
      // 239: sipush 2048
      // 23c: imul
      // 23d: i2d
      // 23e: dsub
      // 23f: dstore 17
      // 241: dload 19
      // 243: iload 22
      // 245: sipush 2048
      // 248: imul
      // 249: i2d
      // 24a: dsub
      // 24b: dstore 19
      // 24d: aload 0
      // 24e: getfield crp.t6z Lkh3;
      // 251: getfield kh3.vzz Lupn;
      // 254: invokevirtual upn.x66 ()F
      // 257: fload 5
      // 259: fsub
      // 25a: ldc 0.33
      // 25c: nop
      // 25d: fadd
      // 25e: fstore 23
      // 260: fload 23
      // 262: aload 0
      // 263: getfield crp.j0u Lc05;
      // 266: getfield c05.oxn Lmoh;
      // 269: getfield moh.dg1 F
      // 26c: ldc 128.0
      // 26e: nop
      // 26f: fmul
      // 270: fadd
      // 271: fstore 23
      // 273: dload 17
      // 275: ldc2_w 4.8828125E-4
      // 278: dmul
      // 279: d2f
      // 27a: fstore 24
      // 27c: dload 19
      // 27e: ldc2_w 4.8828125E-4
      // 281: dmul
      // 282: d2f
      // 283: fstore 25
      // 285: aload 9
      // 287: bipush 7
      // 289: getstatic gnl.rad Lbe7;
      // 28c: invokevirtual q3g.ezr (ILbe7;)V
      // 28f: sipush -256
      // 292: istore 26
      // 294: iload 26
      // 296: sipush 256
      // 299: if_icmpge 3c6
      // 29c: sipush -256
      // 29f: iload 3
      // 2a0: ifeq 3e9
      // 2a3: istore 27
      // 2a5: iload 27
      // 2a7: sipush 256
      // 2aa: if_icmpge 3bf
      // 2ad: aload 9
      // 2af: iload 26
      // 2b1: bipush 0
      // 2b2: iadd
      // 2b3: i2d
      // 2b4: fload 23
      // 2b6: f2d
      // 2b7: iload 27
      // 2b9: bipush 32
      // 2bb: iadd
      // 2bc: i2d
      // 2bd: invokevirtual q3g.g5o (DDD)Lq3g;
      // 2c0: iload 26
      // 2c2: bipush 0
      // 2c3: iadd
      // 2c4: i2f
      // 2c5: ldc 4.8828125E-4
      // 2c7: nop
      // 2c8: fmul
      // 2c9: fload 24
      // 2cb: fadd
      // 2cc: f2d
      // 2cd: iload 27
      // 2cf: bipush 32
      // 2d1: iadd
      // 2d2: i2f
      // 2d3: ldc 4.8828125E-4
      // 2d5: nop
      // 2d6: fmul
      // 2d7: fload 25
      // 2d9: fadd
      // 2da: f2d
      // 2db: invokevirtual q3g.h0a (DD)Lq3g;
      // 2de: fload 11
      // 2e0: fload 12
      // 2e2: fload 13
      // 2e4: ldc 0.8
      // 2e6: nop
      // 2e7: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 2ea: invokevirtual q3g.pzw ()V
      // 2ed: aload 9
      // 2ef: iload 26
      // 2f1: bipush 32
      // 2f3: iadd
      // 2f4: i2d
      // 2f5: fload 23
      // 2f7: f2d
      // 2f8: iload 27
      // 2fa: bipush 32
      // 2fc: iadd
      // 2fd: i2d
      // 2fe: invokevirtual q3g.g5o (DDD)Lq3g;
      // 301: iload 26
      // 303: bipush 32
      // 305: iadd
      // 306: i2f
      // 307: ldc 4.8828125E-4
      // 309: nop
      // 30a: fmul
      // 30b: fload 24
      // 30d: fadd
      // 30e: f2d
      // 30f: iload 27
      // 311: bipush 32
      // 313: iadd
      // 314: i2f
      // 315: ldc 4.8828125E-4
      // 317: nop
      // 318: fmul
      // 319: fload 25
      // 31b: fadd
      // 31c: f2d
      // 31d: invokevirtual q3g.h0a (DD)Lq3g;
      // 320: fload 11
      // 322: fload 12
      // 324: fload 13
      // 326: ldc 0.8
      // 328: nop
      // 329: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 32c: invokevirtual q3g.pzw ()V
      // 32f: aload 9
      // 331: iload 26
      // 333: bipush 32
      // 335: iadd
      // 336: i2d
      // 337: fload 23
      // 339: f2d
      // 33a: iload 27
      // 33c: bipush 0
      // 33d: iadd
      // 33e: i2d
      // 33f: invokevirtual q3g.g5o (DDD)Lq3g;
      // 342: iload 26
      // 344: bipush 32
      // 346: iadd
      // 347: i2f
      // 348: ldc 4.8828125E-4
      // 34a: nop
      // 34b: fmul
      // 34c: fload 24
      // 34e: fadd
      // 34f: f2d
      // 350: iload 27
      // 352: bipush 0
      // 353: iadd
      // 354: i2f
      // 355: ldc 4.8828125E-4
      // 357: nop
      // 358: fmul
      // 359: fload 25
      // 35b: fadd
      // 35c: f2d
      // 35d: invokevirtual q3g.h0a (DD)Lq3g;
      // 360: fload 11
      // 362: fload 12
      // 364: fload 13
      // 366: ldc 0.8
      // 368: nop
      // 369: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 36c: invokevirtual q3g.pzw ()V
      // 36f: aload 9
      // 371: iload 26
      // 373: bipush 0
      // 374: iadd
      // 375: i2d
      // 376: fload 23
      // 378: f2d
      // 379: iload 27
      // 37b: bipush 0
      // 37c: iadd
      // 37d: i2d
      // 37e: invokevirtual q3g.g5o (DDD)Lq3g;
      // 381: iload 26
      // 383: bipush 0
      // 384: iadd
      // 385: i2f
      // 386: ldc 4.8828125E-4
      // 388: nop
      // 389: fmul
      // 38a: fload 24
      // 38c: fadd
      // 38d: f2d
      // 38e: iload 27
      // 390: bipush 0
      // 391: iadd
      // 392: i2f
      // 393: ldc 4.8828125E-4
      // 395: nop
      // 396: fmul
      // 397: fload 25
      // 399: fadd
      // 39a: f2d
      // 39b: invokevirtual q3g.h0a (DD)Lq3g;
      // 39e: fload 11
      // 3a0: fload 12
      // 3a2: fload 13
      // 3a4: ldc 0.8
      // 3a6: nop
      // 3a7: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 3aa: invokevirtual q3g.pzw ()V
      // 3ad: iinc 27 32
      // 3b0: iload 3
      // 3b1: ifeq 3c2
      // 3b4: iload 3
      // 3b5: ifne 2a5
      // 3b8: goto 3bf
      // 3bb: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3be: athrow
      // 3bf: iinc 26 32
      // 3c2: iload 3
      // 3c3: ifne 294
      // 3c6: aload 8
      // 3c8: invokevirtual jom.q7g ()V
      // 3cb: aload 0
      // 3cc: getfield crp.sae Lnet/optifine/render/CloudRenderer;
      // 3cf: invokevirtual net/optifine/render/CloudRenderer.endUpdateGlList ()V
      // 3d2: aload 0
      // 3d3: getfield crp.sae Lnet/optifine/render/CloudRenderer;
      // 3d6: invokevirtual net/optifine/render/CloudRenderer.renderGlList ()V
      // 3d9: fconst_1
      // 3da: fconst_1
      // 3db: fconst_1
      // 3dc: fconst_1
      // 3dd: invokestatic hzu.wn0 (FFFF)V
      // 3e0: invokestatic hzu.ux6 ()V
      // 3e3: invokestatic hzu.gp4 ()V
      // 3e6: invokestatic hxt.ly3 ()Z
      // 3e9: ifeq 3ef
      // 3ec: invokestatic net/optifine/shaders/Shaders.endClouds ()V
      // 3ef: return
   }

   public boolean wdv(double var1, double var3, double var5, float var7) {
      return false;
   }

   private void wj5(float param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: fconst_0
      // 001: fstore 1
      // 002: invokestatic hzu.o1b ()V
      // 005: aload 0
      // 006: getfield crp.j0u Lc05;
      // 009: invokevirtual c05.nsd ()Li2h;
      // 00c: getfield i2h.c54 D
      // 00f: aload 0
      // 010: getfield crp.j0u Lc05;
      // 013: invokevirtual c05.nsd ()Li2h;
      // 016: getfield i2h.kfp D
      // 019: aload 0
      // 01a: getfield crp.j0u Lc05;
      // 01d: invokevirtual c05.nsd ()Li2h;
      // 020: getfield i2h.c54 D
      // 023: dsub
      // 024: fload 1
      // 025: f2d
      // 026: dmul
      // 027: dadd
      // 028: d2f
      // 029: fstore 4
      // 02b: invokestatic jom.yut ()Ljom;
      // 02e: astore 5
      // 030: aload 5
      // 032: invokevirtual jom.zuq ()Lq3g;
      // 035: astore 6
      // 037: ldc 12.0
      // 039: nop
      // 03a: fstore 7
      // 03c: ldc 4.0
      // 03e: nop
      // 03f: fstore 8
      // 041: aload 0
      // 042: getfield crp.s0f I
      // 045: i2f
      // 046: fload 1
      // 047: fadd
      // 048: f2d
      // 049: dstore 9
      // 04b: aload 0
      // 04c: getfield crp.j0u Lc05;
      // 04f: invokevirtual c05.nsd ()Li2h;
      // 052: getfield i2h.bc1 D
      // 055: aload 0
      // 056: getfield crp.j0u Lc05;
      // 059: invokevirtual c05.nsd ()Li2h;
      // 05c: getfield i2h.o2v D
      // 05f: aload 0
      // 060: getfield crp.j0u Lc05;
      // 063: invokevirtual c05.nsd ()Li2h;
      // 066: getfield i2h.bc1 D
      // 069: dsub
      // 06a: fload 1
      // 06b: f2d
      // 06c: dmul
      // 06d: dadd
      // 06e: dload 9
      // 070: ldc2_w 0.029999999329447746
      // 073: dmul
      // 074: dadd
      // 075: ldc2_w 12.0
      // 078: ddiv
      // 079: dstore 11
      // 07b: aload 0
      // 07c: getfield crp.j0u Lc05;
      // 07f: invokevirtual c05.nsd ()Li2h;
      // 082: getfield i2h.a4d D
      // 085: aload 0
      // 086: getfield crp.j0u Lc05;
      // 089: invokevirtual c05.nsd ()Li2h;
      // 08c: getfield i2h.vbd D
      // 08f: aload 0
      // 090: getfield crp.j0u Lc05;
      // 093: invokevirtual c05.nsd ()Li2h;
      // 096: getfield i2h.a4d D
      // 099: dsub
      // 09a: fload 1
      // 09b: f2d
      // 09c: dmul
      // 09d: dadd
      // 09e: ldc2_w 12.0
      // 0a1: ddiv
      // 0a2: ldc2_w 0.33000001311302185
      // 0a5: dadd
      // 0a6: dstore 13
      // 0a8: aload 0
      // 0a9: getfield crp.t6z Lkh3;
      // 0ac: getfield kh3.vzz Lupn;
      // 0af: invokevirtual upn.x66 ()F
      // 0b2: fload 4
      // 0b4: fsub
      // 0b5: ldc 0.33
      // 0b7: nop
      // 0b8: fadd
      // 0b9: fstore 15
      // 0bb: invokestatic t9d.c ()I
      // 0be: fload 15
      // 0c0: aload 0
      // 0c1: getfield crp.j0u Lc05;
      // 0c4: getfield c05.oxn Lmoh;
      // 0c7: getfield moh.dg1 F
      // 0ca: ldc 128.0
      // 0cc: nop
      // 0cd: fmul
      // 0ce: fadd
      // 0cf: fstore 15
      // 0d1: dload 11
      // 0d3: ldc2_w 2048.0
      // 0d6: ddiv
      // 0d7: invokestatic fe6.jqf (D)I
      // 0da: istore 16
      // 0dc: istore 3
      // 0dd: dload 13
      // 0df: ldc2_w 2048.0
      // 0e2: ddiv
      // 0e3: invokestatic fe6.jqf (D)I
      // 0e6: istore 17
      // 0e8: dload 11
      // 0ea: iload 16
      // 0ec: sipush 2048
      // 0ef: imul
      // 0f0: i2d
      // 0f1: dsub
      // 0f2: dstore 11
      // 0f4: dload 13
      // 0f6: iload 17
      // 0f8: sipush 2048
      // 0fb: imul
      // 0fc: i2d
      // 0fd: dsub
      // 0fe: dstore 13
      // 100: aload 0
      // 101: getfield crp.nr3 Llc5;
      // 104: getstatic crp.fda Lgdz;
      // 107: invokevirtual lc5.anl (Lgdz;)V
      // 10a: invokestatic hzu.spd ()V
      // 10d: sipush 770
      // 110: sipush 771
      // 113: bipush 1
      // 114: bipush 0
      // 115: invokestatic hzu.u39 (IIII)V
      // 118: aload 0
      // 119: getfield crp.t6z Lkh3;
      // 11c: fload 1
      // 11d: invokevirtual kh3.l86 (F)Lfqr;
      // 120: astore 18
      // 122: aload 18
      // 124: getfield fqr.lvi D
      // 127: d2f
      // 128: fstore 19
      // 12a: aload 18
      // 12c: getfield fqr.gn5 D
      // 12f: d2f
      // 130: fstore 20
      // 132: aload 18
      // 134: getfield fqr.bn2 D
      // 137: d2f
      // 138: fstore 21
      // 13a: aload 0
      // 13b: getfield crp.sae Lnet/optifine/render/CloudRenderer;
      // 13e: bipush 1
      // 13f: aload 0
      // 140: getfield crp.s0f I
      // 143: fload 1
      // 144: aload 18
      // 146: invokevirtual net/optifine/render/CloudRenderer.prepareToRender (ZIFLfqr;)V
      // 149: iload 2
      // 14a: bipush 2
      // 14b: if_icmpeq 19a
      // 14e: fload 19
      // 150: ldc 30.0
      // 152: nop
      // 153: fmul
      // 154: fload 20
      // 156: ldc 59.0
      // 158: nop
      // 159: fmul
      // 15a: fadd
      // 15b: fload 21
      // 15d: ldc 11.0
      // 15f: nop
      // 160: fmul
      // 161: fadd
      // 162: ldc 100.0
      // 164: nop
      // 165: fdiv
      // 166: fstore 22
      // 168: fload 19
      // 16a: ldc 30.0
      // 16c: nop
      // 16d: fmul
      // 16e: fload 20
      // 170: ldc 70.0
      // 172: nop
      // 173: fmul
      // 174: fadd
      // 175: ldc 100.0
      // 177: nop
      // 178: fdiv
      // 179: fstore 23
      // 17b: fload 19
      // 17d: ldc 30.0
      // 17f: nop
      // 180: fmul
      // 181: fload 21
      // 183: ldc 70.0
      // 185: nop
      // 186: fmul
      // 187: fadd
      // 188: ldc 100.0
      // 18a: nop
      // 18b: fdiv
      // 18c: fstore 24
      // 18e: fload 22
      // 190: fstore 19
      // 192: fload 23
      // 194: fstore 20
      // 196: fload 24
      // 198: fstore 21
      // 19a: fload 19
      // 19c: ldc 0.9
      // 19e: nop
      // 19f: fmul
      // 1a0: fstore 22
      // 1a2: fload 20
      // 1a4: ldc 0.9
      // 1a6: nop
      // 1a7: fmul
      // 1a8: fstore 23
      // 1aa: fload 21
      // 1ac: ldc 0.9
      // 1ae: nop
      // 1af: fmul
      // 1b0: fstore 24
      // 1b2: fload 19
      // 1b4: ldc 0.7
      // 1b6: nop
      // 1b7: fmul
      // 1b8: fstore 25
      // 1ba: fload 20
      // 1bc: ldc 0.7
      // 1be: nop
      // 1bf: fmul
      // 1c0: fstore 26
      // 1c2: fload 21
      // 1c4: ldc 0.7
      // 1c6: nop
      // 1c7: fmul
      // 1c8: fstore 27
      // 1ca: fload 19
      // 1cc: ldc 0.8
      // 1ce: nop
      // 1cf: fmul
      // 1d0: fstore 28
      // 1d2: fload 20
      // 1d4: ldc 0.8
      // 1d6: nop
      // 1d7: fmul
      // 1d8: fstore 29
      // 1da: fload 21
      // 1dc: ldc 0.8
      // 1de: nop
      // 1df: fmul
      // 1e0: fstore 30
      // 1e2: ldc 0.00390625
      // 1e4: nop
      // 1e5: fstore 31
      // 1e7: dload 11
      // 1e9: invokestatic fe6.jqf (D)I
      // 1ec: i2f
      // 1ed: ldc 0.00390625
      // 1ef: nop
      // 1f0: fmul
      // 1f1: fstore 32
      // 1f3: dload 13
      // 1f5: invokestatic fe6.jqf (D)I
      // 1f8: i2f
      // 1f9: ldc 0.00390625
      // 1fb: nop
      // 1fc: fmul
      // 1fd: fstore 33
      // 1ff: dload 11
      // 201: dload 11
      // 203: invokestatic fe6.jqf (D)I
      // 206: i2d
      // 207: dsub
      // 208: d2f
      // 209: fstore 34
      // 20b: dload 13
      // 20d: dload 13
      // 20f: invokestatic fe6.jqf (D)I
      // 212: i2d
      // 213: dsub
      // 214: d2f
      // 215: fstore 35
      // 217: bipush 8
      // 219: istore 36
      // 21b: bipush 4
      // 21c: istore 37
      // 21e: ldc 9.765625E-4
      // 220: nop
      // 221: fstore 38
      // 223: ldc 12.0
      // 225: nop
      // 226: fconst_1
      // 227: ldc 12.0
      // 229: nop
      // 22a: invokestatic hzu.syc (FFF)V
      // 22d: bipush 0
      // 22e: istore 39
      // 230: iload 39
      // 232: bipush 2
      // 233: if_icmpge 2c5
      // 236: iload 39
      // 238: iload 3
      // 239: ifne 2cc
      // 23c: iload 3
      // 23d: ifne 26b
      // 240: goto 247
      // 243: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 246: athrow
      // 247: ifne 263
      // 24a: goto 251
      // 24d: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 250: athrow
      // 251: bipush 0
      // 252: bipush 0
      // 253: bipush 0
      // 254: bipush 0
      // 255: invokestatic hzu.y4q (ZZZZ)V
      // 258: iload 3
      // 259: ifeq 2b7
      // 25c: goto 263
      // 25f: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 262: athrow
      // 263: iload 2
      // 264: goto 26b
      // 267: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26a: athrow
      // 26b: iload 3
      // 26c: ifne 28d
      // 26f: tableswitch 72 0 2 29 40 58
      // 288: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28b: athrow
      // 28c: bipush 0
      // 28d: bipush 1
      // 28e: bipush 1
      // 28f: bipush 1
      // 290: invokestatic hzu.y4q (ZZZZ)V
      // 293: iload 3
      // 294: ifeq 2b7
      // 297: bipush 1
      // 298: bipush 0
      // 299: bipush 0
      // 29a: bipush 1
      // 29b: invokestatic hzu.y4q (ZZZZ)V
      // 29e: iload 3
      // 29f: ifeq 2b7
      // 2a2: goto 2a9
      // 2a5: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a8: athrow
      // 2a9: bipush 1
      // 2aa: bipush 1
      // 2ab: bipush 1
      // 2ac: bipush 1
      // 2ad: invokestatic hzu.y4q (ZZZZ)V
      // 2b0: goto 2b7
      // 2b3: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b6: athrow
      // 2b7: aload 0
      // 2b8: getfield crp.sae Lnet/optifine/render/CloudRenderer;
      // 2bb: invokevirtual net/optifine/render/CloudRenderer.renderGlList ()V
      // 2be: iinc 39 1
      // 2c1: iload 3
      // 2c2: ifeq 230
      // 2c5: aload 0
      // 2c6: getfield crp.sae Lnet/optifine/render/CloudRenderer;
      // 2c9: invokevirtual net/optifine/render/CloudRenderer.shouldUpdateGlList ()Z
      // 2cc: iload 3
      // 2cd: ifne 2ea
      // 2d0: ifeq bcc
      // 2d3: goto 2da
      // 2d6: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d9: athrow
      // 2da: aload 0
      // 2db: getfield crp.sae Lnet/optifine/render/CloudRenderer;
      // 2de: invokevirtual net/optifine/render/CloudRenderer.startUpdateGlList ()V
      // 2e1: bipush -3
      // 2e3: goto 2ea
      // 2e6: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e9: athrow
      // 2ea: istore 39
      // 2ec: iload 39
      // 2ee: bipush 4
      // 2ef: if_icmpgt bc5
      // 2f2: bipush -3
      // 2f4: istore 40
      // 2f6: iload 40
      // 2f8: bipush 4
      // 2f9: if_icmpgt bbe
      // 2fc: aload 6
      // 2fe: bipush 7
      // 300: getstatic gnl.vql Lbe7;
      // 303: invokevirtual q3g.ezr (ILbe7;)V
      // 306: iload 39
      // 308: bipush 8
      // 30a: imul
      // 30b: i2f
      // 30c: fstore 41
      // 30e: iload 40
      // 310: bipush 8
      // 312: imul
      // 313: i2f
      // 314: fstore 42
      // 316: fload 41
      // 318: fload 34
      // 31a: fsub
      // 31b: fstore 43
      // 31d: fload 42
      // 31f: fload 35
      // 321: fsub
      // 322: fstore 44
      // 324: fload 15
      // 326: ldc -5.0
      // 328: nop
      // 329: fcmpl
      // 32a: iload 3
      // 32b: ifne 2ee
      // 32e: iload 3
      // 32f: ifne 471
      // 332: ifle 46b
      // 335: goto 33c
      // 338: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 33b: athrow
      // 33c: aload 6
      // 33e: fload 43
      // 340: fconst_0
      // 341: fadd
      // 342: f2d
      // 343: fload 15
      // 345: fconst_0
      // 346: fadd
      // 347: f2d
      // 348: fload 44
      // 34a: ldc 8.0
      // 34c: nop
      // 34d: fadd
      // 34e: f2d
      // 34f: invokevirtual q3g.g5o (DDD)Lq3g;
      // 352: fload 41
      // 354: fconst_0
      // 355: fadd
      // 356: ldc 0.00390625
      // 358: nop
      // 359: fmul
      // 35a: fload 32
      // 35c: fadd
      // 35d: f2d
      // 35e: fload 42
      // 360: ldc 8.0
      // 362: nop
      // 363: fadd
      // 364: ldc 0.00390625
      // 366: nop
      // 367: fmul
      // 368: fload 33
      // 36a: fadd
      // 36b: f2d
      // 36c: invokevirtual q3g.h0a (DD)Lq3g;
      // 36f: fload 25
      // 371: fload 26
      // 373: fload 27
      // 375: ldc 0.8
      // 377: nop
      // 378: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 37b: fconst_0
      // 37c: ldc -1.0
      // 37e: nop
      // 37f: fconst_0
      // 380: invokevirtual q3g.h3y (FFF)Lq3g;
      // 383: invokevirtual q3g.pzw ()V
      // 386: aload 6
      // 388: fload 43
      // 38a: ldc 8.0
      // 38c: nop
      // 38d: fadd
      // 38e: f2d
      // 38f: fload 15
      // 391: fconst_0
      // 392: fadd
      // 393: f2d
      // 394: fload 44
      // 396: ldc 8.0
      // 398: nop
      // 399: fadd
      // 39a: f2d
      // 39b: invokevirtual q3g.g5o (DDD)Lq3g;
      // 39e: fload 41
      // 3a0: ldc 8.0
      // 3a2: nop
      // 3a3: fadd
      // 3a4: ldc 0.00390625
      // 3a6: nop
      // 3a7: fmul
      // 3a8: fload 32
      // 3aa: fadd
      // 3ab: f2d
      // 3ac: fload 42
      // 3ae: ldc 8.0
      // 3b0: nop
      // 3b1: fadd
      // 3b2: ldc 0.00390625
      // 3b4: nop
      // 3b5: fmul
      // 3b6: fload 33
      // 3b8: fadd
      // 3b9: f2d
      // 3ba: invokevirtual q3g.h0a (DD)Lq3g;
      // 3bd: fload 25
      // 3bf: fload 26
      // 3c1: fload 27
      // 3c3: ldc 0.8
      // 3c5: nop
      // 3c6: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 3c9: fconst_0
      // 3ca: ldc -1.0
      // 3cc: nop
      // 3cd: fconst_0
      // 3ce: invokevirtual q3g.h3y (FFF)Lq3g;
      // 3d1: invokevirtual q3g.pzw ()V
      // 3d4: aload 6
      // 3d6: fload 43
      // 3d8: ldc 8.0
      // 3da: nop
      // 3db: fadd
      // 3dc: f2d
      // 3dd: fload 15
      // 3df: fconst_0
      // 3e0: fadd
      // 3e1: f2d
      // 3e2: fload 44
      // 3e4: fconst_0
      // 3e5: fadd
      // 3e6: f2d
      // 3e7: invokevirtual q3g.g5o (DDD)Lq3g;
      // 3ea: fload 41
      // 3ec: ldc 8.0
      // 3ee: nop
      // 3ef: fadd
      // 3f0: ldc 0.00390625
      // 3f2: nop
      // 3f3: fmul
      // 3f4: fload 32
      // 3f6: fadd
      // 3f7: f2d
      // 3f8: fload 42
      // 3fa: fconst_0
      // 3fb: fadd
      // 3fc: ldc 0.00390625
      // 3fe: nop
      // 3ff: fmul
      // 400: fload 33
      // 402: fadd
      // 403: f2d
      // 404: invokevirtual q3g.h0a (DD)Lq3g;
      // 407: fload 25
      // 409: fload 26
      // 40b: fload 27
      // 40d: ldc 0.8
      // 40f: nop
      // 410: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 413: fconst_0
      // 414: ldc -1.0
      // 416: nop
      // 417: fconst_0
      // 418: invokevirtual q3g.h3y (FFF)Lq3g;
      // 41b: invokevirtual q3g.pzw ()V
      // 41e: aload 6
      // 420: fload 43
      // 422: fconst_0
      // 423: fadd
      // 424: f2d
      // 425: fload 15
      // 427: fconst_0
      // 428: fadd
      // 429: f2d
      // 42a: fload 44
      // 42c: fconst_0
      // 42d: fadd
      // 42e: f2d
      // 42f: invokevirtual q3g.g5o (DDD)Lq3g;
      // 432: fload 41
      // 434: fconst_0
      // 435: fadd
      // 436: ldc 0.00390625
      // 438: nop
      // 439: fmul
      // 43a: fload 32
      // 43c: fadd
      // 43d: f2d
      // 43e: fload 42
      // 440: fconst_0
      // 441: fadd
      // 442: ldc 0.00390625
      // 444: nop
      // 445: fmul
      // 446: fload 33
      // 448: fadd
      // 449: f2d
      // 44a: invokevirtual q3g.h0a (DD)Lq3g;
      // 44d: fload 25
      // 44f: fload 26
      // 451: fload 27
      // 453: ldc 0.8
      // 455: nop
      // 456: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 459: fconst_0
      // 45a: ldc -1.0
      // 45c: nop
      // 45d: fconst_0
      // 45e: invokevirtual q3g.h3y (FFF)Lq3g;
      // 461: invokevirtual q3g.pzw ()V
      // 464: goto 46b
      // 467: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 46a: athrow
      // 46b: fload 15
      // 46d: ldc 5.0
      // 46f: nop
      // 470: fcmpg
      // 471: iload 3
      // 472: ifne 5c0
      // 475: ifgt 5be
      // 478: goto 47f
      // 47b: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 47e: athrow
      // 47f: aload 6
      // 481: fload 43
      // 483: fconst_0
      // 484: fadd
      // 485: f2d
      // 486: fload 15
      // 488: ldc 4.0
      // 48a: nop
      // 48b: fadd
      // 48c: ldc 9.765625E-4
      // 48e: nop
      // 48f: fsub
      // 490: f2d
      // 491: fload 44
      // 493: ldc 8.0
      // 495: nop
      // 496: fadd
      // 497: f2d
      // 498: invokevirtual q3g.g5o (DDD)Lq3g;
      // 49b: fload 41
      // 49d: fconst_0
      // 49e: fadd
      // 49f: ldc 0.00390625
      // 4a1: nop
      // 4a2: fmul
      // 4a3: fload 32
      // 4a5: fadd
      // 4a6: f2d
      // 4a7: fload 42
      // 4a9: ldc 8.0
      // 4ab: nop
      // 4ac: fadd
      // 4ad: ldc 0.00390625
      // 4af: nop
      // 4b0: fmul
      // 4b1: fload 33
      // 4b3: fadd
      // 4b4: f2d
      // 4b5: invokevirtual q3g.h0a (DD)Lq3g;
      // 4b8: fload 19
      // 4ba: fload 20
      // 4bc: fload 21
      // 4be: ldc 0.8
      // 4c0: nop
      // 4c1: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 4c4: fconst_0
      // 4c5: fconst_1
      // 4c6: fconst_0
      // 4c7: invokevirtual q3g.h3y (FFF)Lq3g;
      // 4ca: invokevirtual q3g.pzw ()V
      // 4cd: aload 6
      // 4cf: fload 43
      // 4d1: ldc 8.0
      // 4d3: nop
      // 4d4: fadd
      // 4d5: f2d
      // 4d6: fload 15
      // 4d8: ldc 4.0
      // 4da: nop
      // 4db: fadd
      // 4dc: ldc 9.765625E-4
      // 4de: nop
      // 4df: fsub
      // 4e0: f2d
      // 4e1: fload 44
      // 4e3: ldc 8.0
      // 4e5: nop
      // 4e6: fadd
      // 4e7: f2d
      // 4e8: invokevirtual q3g.g5o (DDD)Lq3g;
      // 4eb: fload 41
      // 4ed: ldc 8.0
      // 4ef: nop
      // 4f0: fadd
      // 4f1: ldc 0.00390625
      // 4f3: nop
      // 4f4: fmul
      // 4f5: fload 32
      // 4f7: fadd
      // 4f8: f2d
      // 4f9: fload 42
      // 4fb: ldc 8.0
      // 4fd: nop
      // 4fe: fadd
      // 4ff: ldc 0.00390625
      // 501: nop
      // 502: fmul
      // 503: fload 33
      // 505: fadd
      // 506: f2d
      // 507: invokevirtual q3g.h0a (DD)Lq3g;
      // 50a: fload 19
      // 50c: fload 20
      // 50e: fload 21
      // 510: ldc 0.8
      // 512: nop
      // 513: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 516: fconst_0
      // 517: fconst_1
      // 518: fconst_0
      // 519: invokevirtual q3g.h3y (FFF)Lq3g;
      // 51c: invokevirtual q3g.pzw ()V
      // 51f: aload 6
      // 521: fload 43
      // 523: ldc 8.0
      // 525: nop
      // 526: fadd
      // 527: f2d
      // 528: fload 15
      // 52a: ldc 4.0
      // 52c: nop
      // 52d: fadd
      // 52e: ldc 9.765625E-4
      // 530: nop
      // 531: fsub
      // 532: f2d
      // 533: fload 44
      // 535: fconst_0
      // 536: fadd
      // 537: f2d
      // 538: invokevirtual q3g.g5o (DDD)Lq3g;
      // 53b: fload 41
      // 53d: ldc 8.0
      // 53f: nop
      // 540: fadd
      // 541: ldc 0.00390625
      // 543: nop
      // 544: fmul
      // 545: fload 32
      // 547: fadd
      // 548: f2d
      // 549: fload 42
      // 54b: fconst_0
      // 54c: fadd
      // 54d: ldc 0.00390625
      // 54f: nop
      // 550: fmul
      // 551: fload 33
      // 553: fadd
      // 554: f2d
      // 555: invokevirtual q3g.h0a (DD)Lq3g;
      // 558: fload 19
      // 55a: fload 20
      // 55c: fload 21
      // 55e: ldc 0.8
      // 560: nop
      // 561: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 564: fconst_0
      // 565: fconst_1
      // 566: fconst_0
      // 567: invokevirtual q3g.h3y (FFF)Lq3g;
      // 56a: invokevirtual q3g.pzw ()V
      // 56d: aload 6
      // 56f: fload 43
      // 571: fconst_0
      // 572: fadd
      // 573: f2d
      // 574: fload 15
      // 576: ldc 4.0
      // 578: nop
      // 579: fadd
      // 57a: ldc 9.765625E-4
      // 57c: nop
      // 57d: fsub
      // 57e: f2d
      // 57f: fload 44
      // 581: fconst_0
      // 582: fadd
      // 583: f2d
      // 584: invokevirtual q3g.g5o (DDD)Lq3g;
      // 587: fload 41
      // 589: fconst_0
      // 58a: fadd
      // 58b: ldc 0.00390625
      // 58d: nop
      // 58e: fmul
      // 58f: fload 32
      // 591: fadd
      // 592: f2d
      // 593: fload 42
      // 595: fconst_0
      // 596: fadd
      // 597: ldc 0.00390625
      // 599: nop
      // 59a: fmul
      // 59b: fload 33
      // 59d: fadd
      // 59e: f2d
      // 59f: invokevirtual q3g.h0a (DD)Lq3g;
      // 5a2: fload 19
      // 5a4: fload 20
      // 5a6: fload 21
      // 5a8: ldc 0.8
      // 5aa: nop
      // 5ab: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 5ae: fconst_0
      // 5af: fconst_1
      // 5b0: fconst_0
      // 5b1: invokevirtual q3g.h3y (FFF)Lq3g;
      // 5b4: invokevirtual q3g.pzw ()V
      // 5b7: goto 5be
      // 5ba: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5bd: athrow
      // 5be: iload 39
      // 5c0: bipush -1
      // 5c1: iload 3
      // 5c2: ifne 73a
      // 5c5: if_icmple 737
      // 5c8: goto 5cf
      // 5cb: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5ce: athrow
      // 5cf: bipush 0
      // 5d0: istore 45
      // 5d2: iload 45
      // 5d4: bipush 8
      // 5d6: if_icmpge 737
      // 5d9: aload 6
      // 5db: fload 43
      // 5dd: iload 45
      // 5df: i2f
      // 5e0: fadd
      // 5e1: fconst_0
      // 5e2: fadd
      // 5e3: f2d
      // 5e4: fload 15
      // 5e6: fconst_0
      // 5e7: fadd
      // 5e8: f2d
      // 5e9: fload 44
      // 5eb: ldc 8.0
      // 5ed: nop
      // 5ee: fadd
      // 5ef: f2d
      // 5f0: invokevirtual q3g.g5o (DDD)Lq3g;
      // 5f3: fload 41
      // 5f5: iload 45
      // 5f7: i2f
      // 5f8: fadd
      // 5f9: ldc 0.5
      // 5fb: nop
      // 5fc: fadd
      // 5fd: ldc 0.00390625
      // 5ff: nop
      // 600: fmul
      // 601: fload 32
      // 603: fadd
      // 604: f2d
      // 605: fload 42
      // 607: ldc 8.0
      // 609: nop
      // 60a: fadd
      // 60b: ldc 0.00390625
      // 60d: nop
      // 60e: fmul
      // 60f: fload 33
      // 611: fadd
      // 612: f2d
      // 613: invokevirtual q3g.h0a (DD)Lq3g;
      // 616: fload 22
      // 618: fload 23
      // 61a: fload 24
      // 61c: ldc 0.8
      // 61e: nop
      // 61f: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 622: ldc -1.0
      // 624: nop
      // 625: fconst_0
      // 626: fconst_0
      // 627: invokevirtual q3g.h3y (FFF)Lq3g;
      // 62a: invokevirtual q3g.pzw ()V
      // 62d: aload 6
      // 62f: fload 43
      // 631: iload 45
      // 633: i2f
      // 634: fadd
      // 635: fconst_0
      // 636: fadd
      // 637: f2d
      // 638: fload 15
      // 63a: ldc 4.0
      // 63c: nop
      // 63d: fadd
      // 63e: f2d
      // 63f: fload 44
      // 641: ldc 8.0
      // 643: nop
      // 644: fadd
      // 645: f2d
      // 646: invokevirtual q3g.g5o (DDD)Lq3g;
      // 649: fload 41
      // 64b: iload 45
      // 64d: i2f
      // 64e: fadd
      // 64f: ldc 0.5
      // 651: nop
      // 652: fadd
      // 653: ldc 0.00390625
      // 655: nop
      // 656: fmul
      // 657: fload 32
      // 659: fadd
      // 65a: f2d
      // 65b: fload 42
      // 65d: ldc 8.0
      // 65f: nop
      // 660: fadd
      // 661: ldc 0.00390625
      // 663: nop
      // 664: fmul
      // 665: fload 33
      // 667: fadd
      // 668: f2d
      // 669: invokevirtual q3g.h0a (DD)Lq3g;
      // 66c: fload 22
      // 66e: fload 23
      // 670: fload 24
      // 672: ldc 0.8
      // 674: nop
      // 675: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 678: ldc -1.0
      // 67a: nop
      // 67b: fconst_0
      // 67c: fconst_0
      // 67d: invokevirtual q3g.h3y (FFF)Lq3g;
      // 680: invokevirtual q3g.pzw ()V
      // 683: aload 6
      // 685: fload 43
      // 687: iload 45
      // 689: i2f
      // 68a: fadd
      // 68b: fconst_0
      // 68c: fadd
      // 68d: f2d
      // 68e: fload 15
      // 690: ldc 4.0
      // 692: nop
      // 693: fadd
      // 694: f2d
      // 695: fload 44
      // 697: fconst_0
      // 698: fadd
      // 699: f2d
      // 69a: invokevirtual q3g.g5o (DDD)Lq3g;
      // 69d: fload 41
      // 69f: iload 45
      // 6a1: i2f
      // 6a2: fadd
      // 6a3: ldc 0.5
      // 6a5: nop
      // 6a6: fadd
      // 6a7: ldc 0.00390625
      // 6a9: nop
      // 6aa: fmul
      // 6ab: fload 32
      // 6ad: fadd
      // 6ae: f2d
      // 6af: fload 42
      // 6b1: fconst_0
      // 6b2: fadd
      // 6b3: ldc 0.00390625
      // 6b5: nop
      // 6b6: fmul
      // 6b7: fload 33
      // 6b9: fadd
      // 6ba: f2d
      // 6bb: invokevirtual q3g.h0a (DD)Lq3g;
      // 6be: fload 22
      // 6c0: fload 23
      // 6c2: fload 24
      // 6c4: ldc 0.8
      // 6c6: nop
      // 6c7: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 6ca: ldc -1.0
      // 6cc: nop
      // 6cd: fconst_0
      // 6ce: fconst_0
      // 6cf: invokevirtual q3g.h3y (FFF)Lq3g;
      // 6d2: invokevirtual q3g.pzw ()V
      // 6d5: aload 6
      // 6d7: fload 43
      // 6d9: iload 45
      // 6db: i2f
      // 6dc: fadd
      // 6dd: fconst_0
      // 6de: fadd
      // 6df: f2d
      // 6e0: fload 15
      // 6e2: fconst_0
      // 6e3: fadd
      // 6e4: f2d
      // 6e5: fload 44
      // 6e7: fconst_0
      // 6e8: fadd
      // 6e9: f2d
      // 6ea: invokevirtual q3g.g5o (DDD)Lq3g;
      // 6ed: fload 41
      // 6ef: iload 45
      // 6f1: i2f
      // 6f2: fadd
      // 6f3: ldc 0.5
      // 6f5: nop
      // 6f6: fadd
      // 6f7: ldc 0.00390625
      // 6f9: nop
      // 6fa: fmul
      // 6fb: fload 32
      // 6fd: fadd
      // 6fe: f2d
      // 6ff: fload 42
      // 701: fconst_0
      // 702: fadd
      // 703: ldc 0.00390625
      // 705: nop
      // 706: fmul
      // 707: fload 33
      // 709: fadd
      // 70a: f2d
      // 70b: invokevirtual q3g.h0a (DD)Lq3g;
      // 70e: fload 22
      // 710: fload 23
      // 712: fload 24
      // 714: ldc 0.8
      // 716: nop
      // 717: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 71a: ldc -1.0
      // 71c: nop
      // 71d: fconst_0
      // 71e: fconst_0
      // 71f: invokevirtual q3g.h3y (FFF)Lq3g;
      // 722: invokevirtual q3g.pzw ()V
      // 725: iinc 45 1
      // 728: iload 3
      // 729: ifne 8b8
      // 72c: iload 3
      // 72d: ifeq 5d2
      // 730: goto 737
      // 733: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 736: athrow
      // 737: iload 39
      // 739: bipush 1
      // 73a: iload 3
      // 73b: ifne 8bb
      // 73e: if_icmpgt 8b8
      // 741: goto 748
      // 744: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 747: athrow
      // 748: bipush 0
      // 749: istore 45
      // 74b: iload 45
      // 74d: bipush 8
      // 74f: if_icmpge 8b8
      // 752: aload 6
      // 754: fload 43
      // 756: iload 45
      // 758: i2f
      // 759: fadd
      // 75a: fconst_1
      // 75b: fadd
      // 75c: ldc 9.765625E-4
      // 75e: nop
      // 75f: fsub
      // 760: f2d
      // 761: fload 15
      // 763: fconst_0
      // 764: fadd
      // 765: f2d
      // 766: fload 44
      // 768: ldc 8.0
      // 76a: nop
      // 76b: fadd
      // 76c: f2d
      // 76d: invokevirtual q3g.g5o (DDD)Lq3g;
      // 770: fload 41
      // 772: iload 45
      // 774: i2f
      // 775: fadd
      // 776: ldc 0.5
      // 778: nop
      // 779: fadd
      // 77a: ldc 0.00390625
      // 77c: nop
      // 77d: fmul
      // 77e: fload 32
      // 780: fadd
      // 781: f2d
      // 782: fload 42
      // 784: ldc 8.0
      // 786: nop
      // 787: fadd
      // 788: ldc 0.00390625
      // 78a: nop
      // 78b: fmul
      // 78c: fload 33
      // 78e: fadd
      // 78f: f2d
      // 790: invokevirtual q3g.h0a (DD)Lq3g;
      // 793: fload 22
      // 795: fload 23
      // 797: fload 24
      // 799: ldc 0.8
      // 79b: nop
      // 79c: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 79f: fconst_1
      // 7a0: fconst_0
      // 7a1: fconst_0
      // 7a2: invokevirtual q3g.h3y (FFF)Lq3g;
      // 7a5: invokevirtual q3g.pzw ()V
      // 7a8: aload 6
      // 7aa: fload 43
      // 7ac: iload 45
      // 7ae: i2f
      // 7af: fadd
      // 7b0: fconst_1
      // 7b1: fadd
      // 7b2: ldc 9.765625E-4
      // 7b4: nop
      // 7b5: fsub
      // 7b6: f2d
      // 7b7: fload 15
      // 7b9: ldc 4.0
      // 7bb: nop
      // 7bc: fadd
      // 7bd: f2d
      // 7be: fload 44
      // 7c0: ldc 8.0
      // 7c2: nop
      // 7c3: fadd
      // 7c4: f2d
      // 7c5: invokevirtual q3g.g5o (DDD)Lq3g;
      // 7c8: fload 41
      // 7ca: iload 45
      // 7cc: i2f
      // 7cd: fadd
      // 7ce: ldc 0.5
      // 7d0: nop
      // 7d1: fadd
      // 7d2: ldc 0.00390625
      // 7d4: nop
      // 7d5: fmul
      // 7d6: fload 32
      // 7d8: fadd
      // 7d9: f2d
      // 7da: fload 42
      // 7dc: ldc 8.0
      // 7de: nop
      // 7df: fadd
      // 7e0: ldc 0.00390625
      // 7e2: nop
      // 7e3: fmul
      // 7e4: fload 33
      // 7e6: fadd
      // 7e7: f2d
      // 7e8: invokevirtual q3g.h0a (DD)Lq3g;
      // 7eb: fload 22
      // 7ed: fload 23
      // 7ef: fload 24
      // 7f1: ldc 0.8
      // 7f3: nop
      // 7f4: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 7f7: fconst_1
      // 7f8: fconst_0
      // 7f9: fconst_0
      // 7fa: invokevirtual q3g.h3y (FFF)Lq3g;
      // 7fd: invokevirtual q3g.pzw ()V
      // 800: aload 6
      // 802: fload 43
      // 804: iload 45
      // 806: i2f
      // 807: fadd
      // 808: fconst_1
      // 809: fadd
      // 80a: ldc 9.765625E-4
      // 80c: nop
      // 80d: fsub
      // 80e: f2d
      // 80f: fload 15
      // 811: ldc 4.0
      // 813: nop
      // 814: fadd
      // 815: f2d
      // 816: fload 44
      // 818: fconst_0
      // 819: fadd
      // 81a: f2d
      // 81b: invokevirtual q3g.g5o (DDD)Lq3g;
      // 81e: fload 41
      // 820: iload 45
      // 822: i2f
      // 823: fadd
      // 824: ldc 0.5
      // 826: nop
      // 827: fadd
      // 828: ldc 0.00390625
      // 82a: nop
      // 82b: fmul
      // 82c: fload 32
      // 82e: fadd
      // 82f: f2d
      // 830: fload 42
      // 832: fconst_0
      // 833: fadd
      // 834: ldc 0.00390625
      // 836: nop
      // 837: fmul
      // 838: fload 33
      // 83a: fadd
      // 83b: f2d
      // 83c: invokevirtual q3g.h0a (DD)Lq3g;
      // 83f: fload 22
      // 841: fload 23
      // 843: fload 24
      // 845: ldc 0.8
      // 847: nop
      // 848: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 84b: fconst_1
      // 84c: fconst_0
      // 84d: fconst_0
      // 84e: invokevirtual q3g.h3y (FFF)Lq3g;
      // 851: invokevirtual q3g.pzw ()V
      // 854: aload 6
      // 856: fload 43
      // 858: iload 45
      // 85a: i2f
      // 85b: fadd
      // 85c: fconst_1
      // 85d: fadd
      // 85e: ldc 9.765625E-4
      // 860: nop
      // 861: fsub
      // 862: f2d
      // 863: fload 15
      // 865: fconst_0
      // 866: fadd
      // 867: f2d
      // 868: fload 44
      // 86a: fconst_0
      // 86b: fadd
      // 86c: f2d
      // 86d: invokevirtual q3g.g5o (DDD)Lq3g;
      // 870: fload 41
      // 872: iload 45
      // 874: i2f
      // 875: fadd
      // 876: ldc 0.5
      // 878: nop
      // 879: fadd
      // 87a: ldc 0.00390625
      // 87c: nop
      // 87d: fmul
      // 87e: fload 32
      // 880: fadd
      // 881: f2d
      // 882: fload 42
      // 884: fconst_0
      // 885: fadd
      // 886: ldc 0.00390625
      // 888: nop
      // 889: fmul
      // 88a: fload 33
      // 88c: fadd
      // 88d: f2d
      // 88e: invokevirtual q3g.h0a (DD)Lq3g;
      // 891: fload 22
      // 893: fload 23
      // 895: fload 24
      // 897: ldc 0.8
      // 899: nop
      // 89a: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 89d: fconst_1
      // 89e: fconst_0
      // 89f: fconst_0
      // 8a0: invokevirtual q3g.h3y (FFF)Lq3g;
      // 8a3: invokevirtual q3g.pzw ()V
      // 8a6: iinc 45 1
      // 8a9: iload 3
      // 8aa: ifne a31
      // 8ad: iload 3
      // 8ae: ifeq 74b
      // 8b1: goto 8b8
      // 8b4: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8b7: athrow
      // 8b8: iload 40
      // 8ba: bipush -1
      // 8bb: iload 3
      // 8bc: ifne a3f
      // 8bf: if_icmple a31
      // 8c2: goto 8c9
      // 8c5: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8c8: athrow
      // 8c9: bipush 0
      // 8ca: istore 45
      // 8cc: iload 45
      // 8ce: bipush 8
      // 8d0: if_icmpge a31
      // 8d3: aload 6
      // 8d5: fload 43
      // 8d7: fconst_0
      // 8d8: fadd
      // 8d9: f2d
      // 8da: fload 15
      // 8dc: ldc 4.0
      // 8de: nop
      // 8df: fadd
      // 8e0: f2d
      // 8e1: fload 44
      // 8e3: iload 45
      // 8e5: i2f
      // 8e6: fadd
      // 8e7: fconst_0
      // 8e8: fadd
      // 8e9: f2d
      // 8ea: invokevirtual q3g.g5o (DDD)Lq3g;
      // 8ed: fload 41
      // 8ef: fconst_0
      // 8f0: fadd
      // 8f1: ldc 0.00390625
      // 8f3: nop
      // 8f4: fmul
      // 8f5: fload 32
      // 8f7: fadd
      // 8f8: f2d
      // 8f9: fload 42
      // 8fb: iload 45
      // 8fd: i2f
      // 8fe: fadd
      // 8ff: ldc 0.5
      // 901: nop
      // 902: fadd
      // 903: ldc 0.00390625
      // 905: nop
      // 906: fmul
      // 907: fload 33
      // 909: fadd
      // 90a: f2d
      // 90b: invokevirtual q3g.h0a (DD)Lq3g;
      // 90e: fload 28
      // 910: fload 29
      // 912: fload 30
      // 914: ldc 0.8
      // 916: nop
      // 917: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 91a: fconst_0
      // 91b: fconst_0
      // 91c: ldc -1.0
      // 91e: nop
      // 91f: invokevirtual q3g.h3y (FFF)Lq3g;
      // 922: invokevirtual q3g.pzw ()V
      // 925: aload 6
      // 927: fload 43
      // 929: ldc 8.0
      // 92b: nop
      // 92c: fadd
      // 92d: f2d
      // 92e: fload 15
      // 930: ldc 4.0
      // 932: nop
      // 933: fadd
      // 934: f2d
      // 935: fload 44
      // 937: iload 45
      // 939: i2f
      // 93a: fadd
      // 93b: fconst_0
      // 93c: fadd
      // 93d: f2d
      // 93e: invokevirtual q3g.g5o (DDD)Lq3g;
      // 941: fload 41
      // 943: ldc 8.0
      // 945: nop
      // 946: fadd
      // 947: ldc 0.00390625
      // 949: nop
      // 94a: fmul
      // 94b: fload 32
      // 94d: fadd
      // 94e: f2d
      // 94f: fload 42
      // 951: iload 45
      // 953: i2f
      // 954: fadd
      // 955: ldc 0.5
      // 957: nop
      // 958: fadd
      // 959: ldc 0.00390625
      // 95b: nop
      // 95c: fmul
      // 95d: fload 33
      // 95f: fadd
      // 960: f2d
      // 961: invokevirtual q3g.h0a (DD)Lq3g;
      // 964: fload 28
      // 966: fload 29
      // 968: fload 30
      // 96a: ldc 0.8
      // 96c: nop
      // 96d: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 970: fconst_0
      // 971: fconst_0
      // 972: ldc -1.0
      // 974: nop
      // 975: invokevirtual q3g.h3y (FFF)Lq3g;
      // 978: invokevirtual q3g.pzw ()V
      // 97b: aload 6
      // 97d: fload 43
      // 97f: ldc 8.0
      // 981: nop
      // 982: fadd
      // 983: f2d
      // 984: fload 15
      // 986: fconst_0
      // 987: fadd
      // 988: f2d
      // 989: fload 44
      // 98b: iload 45
      // 98d: i2f
      // 98e: fadd
      // 98f: fconst_0
      // 990: fadd
      // 991: f2d
      // 992: invokevirtual q3g.g5o (DDD)Lq3g;
      // 995: fload 41
      // 997: ldc 8.0
      // 999: nop
      // 99a: fadd
      // 99b: ldc 0.00390625
      // 99d: nop
      // 99e: fmul
      // 99f: fload 32
      // 9a1: fadd
      // 9a2: f2d
      // 9a3: fload 42
      // 9a5: iload 45
      // 9a7: i2f
      // 9a8: fadd
      // 9a9: ldc 0.5
      // 9ab: nop
      // 9ac: fadd
      // 9ad: ldc 0.00390625
      // 9af: nop
      // 9b0: fmul
      // 9b1: fload 33
      // 9b3: fadd
      // 9b4: f2d
      // 9b5: invokevirtual q3g.h0a (DD)Lq3g;
      // 9b8: fload 28
      // 9ba: fload 29
      // 9bc: fload 30
      // 9be: ldc 0.8
      // 9c0: nop
      // 9c1: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 9c4: fconst_0
      // 9c5: fconst_0
      // 9c6: ldc -1.0
      // 9c8: nop
      // 9c9: invokevirtual q3g.h3y (FFF)Lq3g;
      // 9cc: invokevirtual q3g.pzw ()V
      // 9cf: aload 6
      // 9d1: fload 43
      // 9d3: fconst_0
      // 9d4: fadd
      // 9d5: f2d
      // 9d6: fload 15
      // 9d8: fconst_0
      // 9d9: fadd
      // 9da: f2d
      // 9db: fload 44
      // 9dd: iload 45
      // 9df: i2f
      // 9e0: fadd
      // 9e1: fconst_0
      // 9e2: fadd
      // 9e3: f2d
      // 9e4: invokevirtual q3g.g5o (DDD)Lq3g;
      // 9e7: fload 41
      // 9e9: fconst_0
      // 9ea: fadd
      // 9eb: ldc 0.00390625
      // 9ed: nop
      // 9ee: fmul
      // 9ef: fload 32
      // 9f1: fadd
      // 9f2: f2d
      // 9f3: fload 42
      // 9f5: iload 45
      // 9f7: i2f
      // 9f8: fadd
      // 9f9: ldc 0.5
      // 9fb: nop
      // 9fc: fadd
      // 9fd: ldc 0.00390625
      // 9ff: nop
      // a00: fmul
      // a01: fload 33
      // a03: fadd
      // a04: f2d
      // a05: invokevirtual q3g.h0a (DD)Lq3g;
      // a08: fload 28
      // a0a: fload 29
      // a0c: fload 30
      // a0e: ldc 0.8
      // a10: nop
      // a11: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // a14: fconst_0
      // a15: fconst_0
      // a16: ldc -1.0
      // a18: nop
      // a19: invokevirtual q3g.h3y (FFF)Lq3g;
      // a1c: invokevirtual q3g.pzw ()V
      // a1f: iinc 45 1
      // a22: iload 3
      // a23: ifne bba
      // a26: iload 3
      // a27: ifeq 8cc
      // a2a: goto a31
      // a2d: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a30: athrow
      // a31: iload 40
      // a33: iload 3
      // a34: ifne a43
      // a37: bipush 1
      // a38: goto a3f
      // a3b: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a3e: athrow
      // a3f: if_icmpgt bb2
      // a42: bipush 0
      // a43: istore 45
      // a45: iload 45
      // a47: bipush 8
      // a49: if_icmpge bb2
      // a4c: aload 6
      // a4e: fload 43
      // a50: fconst_0
      // a51: fadd
      // a52: f2d
      // a53: fload 15
      // a55: ldc 4.0
      // a57: nop
      // a58: fadd
      // a59: f2d
      // a5a: fload 44
      // a5c: iload 45
      // a5e: i2f
      // a5f: fadd
      // a60: fconst_1
      // a61: fadd
      // a62: ldc 9.765625E-4
      // a64: nop
      // a65: fsub
      // a66: f2d
      // a67: invokevirtual q3g.g5o (DDD)Lq3g;
      // a6a: fload 41
      // a6c: fconst_0
      // a6d: fadd
      // a6e: ldc 0.00390625
      // a70: nop
      // a71: fmul
      // a72: fload 32
      // a74: fadd
      // a75: f2d
      // a76: fload 42
      // a78: iload 45
      // a7a: i2f
      // a7b: fadd
      // a7c: ldc 0.5
      // a7e: nop
      // a7f: fadd
      // a80: ldc 0.00390625
      // a82: nop
      // a83: fmul
      // a84: fload 33
      // a86: fadd
      // a87: f2d
      // a88: invokevirtual q3g.h0a (DD)Lq3g;
      // a8b: fload 28
      // a8d: fload 29
      // a8f: fload 30
      // a91: ldc 0.8
      // a93: nop
      // a94: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // a97: fconst_0
      // a98: fconst_0
      // a99: fconst_1
      // a9a: invokevirtual q3g.h3y (FFF)Lq3g;
      // a9d: invokevirtual q3g.pzw ()V
      // aa0: aload 6
      // aa2: fload 43
      // aa4: ldc 8.0
      // aa6: nop
      // aa7: fadd
      // aa8: f2d
      // aa9: fload 15
      // aab: ldc 4.0
      // aad: nop
      // aae: fadd
      // aaf: f2d
      // ab0: fload 44
      // ab2: iload 45
      // ab4: i2f
      // ab5: fadd
      // ab6: fconst_1
      // ab7: fadd
      // ab8: ldc 9.765625E-4
      // aba: nop
      // abb: fsub
      // abc: f2d
      // abd: invokevirtual q3g.g5o (DDD)Lq3g;
      // ac0: fload 41
      // ac2: ldc 8.0
      // ac4: nop
      // ac5: fadd
      // ac6: ldc 0.00390625
      // ac8: nop
      // ac9: fmul
      // aca: fload 32
      // acc: fadd
      // acd: f2d
      // ace: fload 42
      // ad0: iload 45
      // ad2: i2f
      // ad3: fadd
      // ad4: ldc 0.5
      // ad6: nop
      // ad7: fadd
      // ad8: ldc 0.00390625
      // ada: nop
      // adb: fmul
      // adc: fload 33
      // ade: fadd
      // adf: f2d
      // ae0: invokevirtual q3g.h0a (DD)Lq3g;
      // ae3: fload 28
      // ae5: fload 29
      // ae7: fload 30
      // ae9: ldc 0.8
      // aeb: nop
      // aec: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // aef: fconst_0
      // af0: fconst_0
      // af1: fconst_1
      // af2: invokevirtual q3g.h3y (FFF)Lq3g;
      // af5: invokevirtual q3g.pzw ()V
      // af8: aload 6
      // afa: fload 43
      // afc: ldc 8.0
      // afe: nop
      // aff: fadd
      // b00: f2d
      // b01: fload 15
      // b03: fconst_0
      // b04: fadd
      // b05: f2d
      // b06: fload 44
      // b08: iload 45
      // b0a: i2f
      // b0b: fadd
      // b0c: fconst_1
      // b0d: fadd
      // b0e: ldc 9.765625E-4
      // b10: nop
      // b11: fsub
      // b12: f2d
      // b13: invokevirtual q3g.g5o (DDD)Lq3g;
      // b16: fload 41
      // b18: ldc 8.0
      // b1a: nop
      // b1b: fadd
      // b1c: ldc 0.00390625
      // b1e: nop
      // b1f: fmul
      // b20: fload 32
      // b22: fadd
      // b23: f2d
      // b24: fload 42
      // b26: iload 45
      // b28: i2f
      // b29: fadd
      // b2a: ldc 0.5
      // b2c: nop
      // b2d: fadd
      // b2e: ldc 0.00390625
      // b30: nop
      // b31: fmul
      // b32: fload 33
      // b34: fadd
      // b35: f2d
      // b36: invokevirtual q3g.h0a (DD)Lq3g;
      // b39: fload 28
      // b3b: fload 29
      // b3d: fload 30
      // b3f: ldc 0.8
      // b41: nop
      // b42: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // b45: fconst_0
      // b46: fconst_0
      // b47: fconst_1
      // b48: invokevirtual q3g.h3y (FFF)Lq3g;
      // b4b: invokevirtual q3g.pzw ()V
      // b4e: aload 6
      // b50: fload 43
      // b52: fconst_0
      // b53: fadd
      // b54: f2d
      // b55: fload 15
      // b57: fconst_0
      // b58: fadd
      // b59: f2d
      // b5a: fload 44
      // b5c: iload 45
      // b5e: i2f
      // b5f: fadd
      // b60: fconst_1
      // b61: fadd
      // b62: ldc 9.765625E-4
      // b64: nop
      // b65: fsub
      // b66: f2d
      // b67: invokevirtual q3g.g5o (DDD)Lq3g;
      // b6a: fload 41
      // b6c: fconst_0
      // b6d: fadd
      // b6e: ldc 0.00390625
      // b70: nop
      // b71: fmul
      // b72: fload 32
      // b74: fadd
      // b75: f2d
      // b76: fload 42
      // b78: iload 45
      // b7a: i2f
      // b7b: fadd
      // b7c: ldc 0.5
      // b7e: nop
      // b7f: fadd
      // b80: ldc 0.00390625
      // b82: nop
      // b83: fmul
      // b84: fload 33
      // b86: fadd
      // b87: f2d
      // b88: invokevirtual q3g.h0a (DD)Lq3g;
      // b8b: fload 28
      // b8d: fload 29
      // b8f: fload 30
      // b91: ldc 0.8
      // b93: nop
      // b94: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // b97: fconst_0
      // b98: fconst_0
      // b99: fconst_1
      // b9a: invokevirtual q3g.h3y (FFF)Lq3g;
      // b9d: invokevirtual q3g.pzw ()V
      // ba0: iinc 45 1
      // ba3: iload 3
      // ba4: ifne bba
      // ba7: iload 3
      // ba8: ifeq a45
      // bab: goto bb2
      // bae: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // bb1: athrow
      // bb2: aload 5
      // bb4: invokevirtual jom.q7g ()V
      // bb7: iinc 40 1
      // bba: iload 3
      // bbb: ifeq 2f6
      // bbe: iinc 39 1
      // bc1: iload 3
      // bc2: ifeq 2ec
      // bc5: aload 0
      // bc6: getfield crp.sae Lnet/optifine/render/CloudRenderer;
      // bc9: invokevirtual net/optifine/render/CloudRenderer.endUpdateGlList ()V
      // bcc: fconst_1
      // bcd: fconst_1
      // bce: fconst_1
      // bcf: fconst_1
      // bd0: invokestatic hzu.wn0 (FFFF)V
      // bd3: invokestatic hzu.ux6 ()V
      // bd6: invokestatic hzu.gp4 ()V
      // bd9: return
   }

   public void rrc(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: lload 1
      // 001: l2d
      // 002: ldc2_w 1.0E8
      // 005: dadd
      // 006: d2l
      // 007: lstore 1
      // 008: invokestatic t9d.c ()I
      // 00b: aload 0
      // 00c: dup
      // 00d: getfield crp.jli Z
      // 010: aload 0
      // 011: getfield crp.isn Ltbt;
      // 014: lload 1
      // 015: invokevirtual tbt.n67 (J)Z
      // 018: ior
      // 019: putfield crp.jli Z
      // 01c: istore 3
      // 01d: aload 0
      // 01e: getfield crp.th7 Ljava/util/Set;
      // 021: invokeinterface java/util/Set.size ()I 1
      // 026: iload 3
      // 027: ifne 0b7
      // 02a: ifle 0a3
      // 02d: goto 034
      // 030: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 033: athrow
      // 034: aload 0
      // 035: getfield crp.th7 Ljava/util/Set;
      // 038: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 03d: astore 4
      // 03f: aload 4
      // 041: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 046: ifeq 0a3
      // 049: aload 4
      // 04b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 050: checkcast kqk
      // 053: astore 5
      // 055: aload 0
      // 056: getfield crp.isn Ltbt;
      // 059: aload 5
      // 05b: invokevirtual tbt.m52 (Lkqk;)Z
      // 05e: iload 3
      // 05f: ifne 0b7
      // 062: iload 3
      // 063: ifne 09e
      // 066: goto 06d
      // 069: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06c: athrow
      // 06d: ifne 07a
      // 070: goto 077
      // 073: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 076: athrow
      // 077: goto 0a3
      // 07a: aload 5
      // 07c: bipush 0
      // 07d: invokevirtual kqk.sf6 (Z)V
      // 080: aload 4
      // 082: invokeinterface java/util/Iterator.remove ()V 1
      // 087: aload 0
      // 088: getfield crp.l0i Ljava/util/Set;
      // 08b: aload 5
      // 08d: invokeinterface java/util/Set.remove (Ljava/lang/Object;)Z 2
      // 092: pop
      // 093: aload 0
      // 094: getfield crp.atw Ljava/util/Set;
      // 097: aload 5
      // 099: invokeinterface java/util/Set.remove (Ljava/lang/Object;)Z 2
      // 09e: pop
      // 09f: iload 3
      // 0a0: ifeq 03f
      // 0a3: aload 0
      // 0a4: getfield crp.atw Ljava/util/Set;
      // 0a7: iload 3
      // 0a8: ifne 0c5
      // 0ab: invokeinterface java/util/Set.size ()I 1
      // 0b0: goto 0b7
      // 0b3: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b6: athrow
      // 0b7: ifle 10e
      // 0ba: aload 0
      // 0bb: getfield crp.atw Ljava/util/Set;
      // 0be: goto 0c5
      // 0c1: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c4: athrow
      // 0c5: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 0ca: astore 4
      // 0cc: aload 4
      // 0ce: iload 3
      // 0cf: ifne 0ef
      // 0d2: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0d7: ifeq 10e
      // 0da: goto 0e1
      // 0dd: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e0: athrow
      // 0e1: aload 4
      // 0e3: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0e8: goto 0ef
      // 0eb: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ee: athrow
      // 0ef: checkcast kqk
      // 0f2: astore 5
      // 0f4: aload 0
      // 0f5: getfield crp.isn Ltbt;
      // 0f8: aload 5
      // 0fa: invokevirtual tbt.wkc (Lkqk;)Z
      // 0fd: ifeq 10e
      // 100: aload 4
      // 102: invokeinterface java/util/Iterator.remove ()V 1
      // 107: goto 10e
      // 10a: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10d: athrow
      // 10e: dconst_0
      // 10f: dstore 4
      // 111: invokestatic hxt.k45 ()I
      // 114: istore 6
      // 116: aload 0
      // 117: getfield crp.l0i Ljava/util/Set;
      // 11a: iload 3
      // 11b: ifne 138
      // 11e: invokeinterface java/util/Set.isEmpty ()Z 1
      // 123: ifne 1d8
      // 126: goto 12d
      // 129: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12c: athrow
      // 12d: aload 0
      // 12e: getfield crp.l0i Ljava/util/Set;
      // 131: goto 138
      // 134: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 137: athrow
      // 138: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 13d: astore 7
      // 13f: aload 7
      // 141: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 146: ifeq 1d8
      // 149: aload 7
      // 14b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 150: checkcast kqk
      // 153: astore 8
      // 155: aload 8
      // 157: invokevirtual kqk._sw ()Z
      // 15a: istore 9
      // 15c: iload 9
      // 15e: iload 3
      // 15f: ifne 18b
      // 162: ifeq 17b
      // 165: goto 16c
      // 168: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16b: athrow
      // 16c: aload 0
      // 16d: getfield crp.isn Ltbt;
      // 170: aload 8
      // 172: invokevirtual tbt.fzf (Lkqk;)Z
      // 175: istore 10
      // 177: iload 3
      // 178: ifeq 18d
      // 17b: aload 0
      // 17c: getfield crp.isn Ltbt;
      // 17f: aload 8
      // 181: invokevirtual tbt.m52 (Lkqk;)Z
      // 184: goto 18b
      // 187: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18a: athrow
      // 18b: istore 10
      // 18d: iload 10
      // 18f: iload 3
      // 190: ifne 1af
      // 193: ifne 1a0
      // 196: goto 19d
      // 199: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19c: athrow
      // 19d: goto 1d8
      // 1a0: aload 8
      // 1a2: bipush 0
      // 1a3: invokevirtual kqk.sf6 (Z)V
      // 1a6: aload 7
      // 1a8: invokeinterface java/util/Iterator.remove ()V 1
      // 1ad: iload 9
      // 1af: ifne 1d4
      // 1b2: ldc2_w 2.0
      // 1b5: aload 8
      // 1b7: invokestatic net/optifine/util/RenderChunkUtils.getRelativeBufferSize (Lkqk;)D
      // 1ba: dmul
      // 1bb: dstore 11
      // 1bd: dload 4
      // 1bf: dload 11
      // 1c1: dadd
      // 1c2: dstore 4
      // 1c4: dload 4
      // 1c6: iload 6
      // 1c8: i2d
      // 1c9: dcmpl
      // 1ca: ifle 1d4
      // 1cd: goto 1d8
      // 1d0: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d3: athrow
      // 1d4: iload 3
      // 1d5: ifeq 13f
      // 1d8: return
   }

   public void byj(i2h param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic jom.yut ()Ljom;
      // 003: astore 4
      // 005: aload 4
      // 007: invokevirtual jom.zuq ()Lq3g;
      // 00a: astore 5
      // 00c: invokestatic t9d.c ()I
      // 00f: aload 0
      // 010: getfield crp.t6z Lkh3;
      // 013: invokevirtual kh3.fve ()Lw5i;
      // 016: astore 6
      // 018: aload 0
      // 019: getfield crp.j0u Lc05;
      // 01c: getfield c05.oxn Lmoh;
      // 01f: getfield moh.gcj I
      // 022: bipush 16
      // 024: imul
      // 025: i2d
      // 026: dstore 7
      // 028: istore 3
      // 029: aload 1
      // 02a: getfield i2h.o2v D
      // 02d: aload 6
      // 02f: invokevirtual w5i.mb9 ()D
      // 032: dload 7
      // 034: dsub
      // 035: iload 3
      // 036: ifne 0bb
      // 039: dcmpl
      // 03a: ifge 0aa
      // 03d: goto 044
      // 040: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 043: athrow
      // 044: aload 1
      // 045: getfield i2h.o2v D
      // 048: aload 6
      // 04a: invokevirtual w5i.rt1 ()D
      // 04d: dload 7
      // 04f: dadd
      // 050: iload 3
      // 051: ifne 0bb
      // 054: goto 05b
      // 057: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05a: athrow
      // 05b: dcmpg
      // 05c: ifle 0aa
      // 05f: goto 066
      // 062: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 065: athrow
      // 066: aload 1
      // 067: getfield i2h.vbd D
      // 06a: aload 6
      // 06c: invokevirtual w5i.ah4 ()D
      // 06f: dload 7
      // 071: dsub
      // 072: iload 3
      // 073: ifne 0bb
      // 076: goto 07d
      // 079: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07c: athrow
      // 07d: dcmpl
      // 07e: ifge 0aa
      // 081: goto 088
      // 084: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 087: athrow
      // 088: aload 1
      // 089: getfield i2h.vbd D
      // 08c: aload 6
      // 08e: invokevirtual w5i.jbu ()D
      // 091: dload 7
      // 093: dadd
      // 094: iload 3
      // 095: ifne 0bb
      // 098: goto 09f
      // 09b: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09e: athrow
      // 09f: dcmpg
      // 0a0: ifgt 5c0
      // 0a3: goto 0aa
      // 0a6: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a9: athrow
      // 0aa: dconst_1
      // 0ab: aload 6
      // 0ad: aload 1
      // 0ae: invokevirtual w5i.uhq (Li2h;)D
      // 0b1: dload 7
      // 0b3: ddiv
      // 0b4: goto 0bb
      // 0b7: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ba: athrow
      // 0bb: dsub
      // 0bc: dstore 9
      // 0be: dload 9
      // 0c0: ldc2_w 4.0
      // 0c3: invokestatic java/lang/Math.pow (DD)D
      // 0c6: dstore 9
      // 0c8: aload 1
      // 0c9: getfield i2h.ivp D
      // 0cc: aload 1
      // 0cd: getfield i2h.o2v D
      // 0d0: aload 1
      // 0d1: getfield i2h.ivp D
      // 0d4: dsub
      // 0d5: fload 2
      // 0d6: f2d
      // 0d7: dmul
      // 0d8: dadd
      // 0d9: dstore 11
      // 0db: aload 1
      // 0dc: getfield i2h.c54 D
      // 0df: aload 1
      // 0e0: getfield i2h.kfp D
      // 0e3: aload 1
      // 0e4: getfield i2h.c54 D
      // 0e7: dsub
      // 0e8: fload 2
      // 0e9: f2d
      // 0ea: dmul
      // 0eb: dadd
      // 0ec: dstore 13
      // 0ee: aload 1
      // 0ef: getfield i2h.e2b D
      // 0f2: aload 1
      // 0f3: getfield i2h.vbd D
      // 0f6: aload 1
      // 0f7: getfield i2h.e2b D
      // 0fa: dsub
      // 0fb: fload 2
      // 0fc: f2d
      // 0fd: dmul
      // 0fe: dadd
      // 0ff: dstore 15
      // 101: invokestatic hzu.spd ()V
      // 104: sipush 770
      // 107: bipush 1
      // 108: bipush 1
      // 109: bipush 0
      // 10a: invokestatic hzu.u39 (IIII)V
      // 10d: aload 0
      // 10e: getfield crp.nr3 Llc5;
      // 111: getstatic crp.s2a Lgdz;
      // 114: invokevirtual lc5.anl (Lgdz;)V
      // 117: bipush 0
      // 118: invokestatic hzu.jun (Z)V
      // 11b: invokestatic hzu.dp2 ()V
      // 11e: aload 6
      // 120: invokevirtual w5i.wmn ()Ll3c;
      // 123: invokevirtual l3c.nqg ()I
      // 126: istore 17
      // 128: iload 17
      // 12a: bipush 16
      // 12c: ishr
      // 12d: sipush 255
      // 130: iand
      // 131: i2f
      // 132: ldc 255.0
      // 134: nop
      // 135: fdiv
      // 136: fstore 18
      // 138: iload 17
      // 13a: bipush 8
      // 13c: ishr
      // 13d: sipush 255
      // 140: iand
      // 141: i2f
      // 142: ldc 255.0
      // 144: nop
      // 145: fdiv
      // 146: fstore 19
      // 148: iload 17
      // 14a: sipush 255
      // 14d: iand
      // 14e: i2f
      // 14f: ldc 255.0
      // 151: nop
      // 152: fdiv
      // 153: fstore 20
      // 155: fload 18
      // 157: fload 19
      // 159: fload 20
      // 15b: dload 9
      // 15d: d2f
      // 15e: invokestatic hzu.wn0 (FFFF)V
      // 161: ldc -3.0
      // 163: nop
      // 164: ldc -3.0
      // 166: nop
      // 167: invokestatic hzu.fex (FF)V
      // 16a: invokestatic hzu.ktr ()V
      // 16d: sipush 516
      // 170: ldc 0.1
      // 172: nop
      // 173: invokestatic hzu.fak (IF)V
      // 176: invokestatic hzu.if9 ()V
      // 179: invokestatic hzu.o1b ()V
      // 17c: invokestatic c05.qgs ()J
      // 17f: ldc2_w 3000
      // 182: lrem
      // 183: l2f
      // 184: ldc 3000.0
      // 186: nop
      // 187: fdiv
      // 188: fstore 21
      // 18a: fconst_0
      // 18b: fstore 22
      // 18d: fconst_0
      // 18e: fstore 23
      // 190: ldc 128.0
      // 192: nop
      // 193: fstore 24
      // 195: aload 5
      // 197: bipush 7
      // 199: getstatic gnl._r5 Lbe7;
      // 19c: invokevirtual q3g.ezr (ILbe7;)V
      // 19f: aload 5
      // 1a1: dload 11
      // 1a3: dneg
      // 1a4: dload 13
      // 1a6: dneg
      // 1a7: dload 15
      // 1a9: dneg
      // 1aa: invokevirtual q3g.nbz (DDD)V
      // 1ad: dload 15
      // 1af: dload 7
      // 1b1: dsub
      // 1b2: invokestatic fe6.jqf (D)I
      // 1b5: i2d
      // 1b6: aload 6
      // 1b8: invokevirtual w5i.jbu ()D
      // 1bb: invokestatic java/lang/Math.max (DD)D
      // 1be: dstore 25
      // 1c0: dload 15
      // 1c2: dload 7
      // 1c4: dadd
      // 1c5: invokestatic fe6.hxe (D)I
      // 1c8: i2d
      // 1c9: aload 6
      // 1cb: invokevirtual w5i.ah4 ()D
      // 1ce: invokestatic java/lang/Math.min (DD)D
      // 1d1: dstore 27
      // 1d3: dload 11
      // 1d5: aload 6
      // 1d7: invokevirtual w5i.mb9 ()D
      // 1da: dload 7
      // 1dc: dsub
      // 1dd: dcmpl
      // 1de: iload 3
      // 1df: ifne 2c3
      // 1e2: ifle 2b8
      // 1e5: goto 1ec
      // 1e8: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1eb: athrow
      // 1ec: fconst_0
      // 1ed: fstore 29
      // 1ef: dload 25
      // 1f1: dstore 30
      // 1f3: dload 30
      // 1f5: dload 27
      // 1f7: dcmpg
      // 1f8: ifge 2b8
      // 1fb: dconst_1
      // 1fc: dload 27
      // 1fe: dload 30
      // 200: dsub
      // 201: invokestatic java/lang/Math.min (DD)D
      // 204: dstore 32
      // 206: dload 32
      // 208: d2f
      // 209: ldc 0.5
      // 20b: nop
      // 20c: fmul
      // 20d: fstore 34
      // 20f: aload 5
      // 211: aload 6
      // 213: invokevirtual w5i.mb9 ()D
      // 216: ldc2_w 256.0
      // 219: dload 30
      // 21b: invokevirtual q3g.g5o (DDD)Lq3g;
      // 21e: fload 21
      // 220: fload 29
      // 222: fadd
      // 223: f2d
      // 224: fload 21
      // 226: fconst_0
      // 227: fadd
      // 228: f2d
      // 229: invokevirtual q3g.h0a (DD)Lq3g;
      // 22c: invokevirtual q3g.pzw ()V
      // 22f: aload 5
      // 231: aload 6
      // 233: invokevirtual w5i.mb9 ()D
      // 236: ldc2_w 256.0
      // 239: dload 30
      // 23b: dload 32
      // 23d: dadd
      // 23e: invokevirtual q3g.g5o (DDD)Lq3g;
      // 241: fload 21
      // 243: fload 34
      // 245: fadd
      // 246: fload 29
      // 248: fadd
      // 249: f2d
      // 24a: fload 21
      // 24c: fconst_0
      // 24d: fadd
      // 24e: f2d
      // 24f: invokevirtual q3g.h0a (DD)Lq3g;
      // 252: invokevirtual q3g.pzw ()V
      // 255: aload 5
      // 257: aload 6
      // 259: invokevirtual w5i.mb9 ()D
      // 25c: dconst_0
      // 25d: dload 30
      // 25f: dload 32
      // 261: dadd
      // 262: invokevirtual q3g.g5o (DDD)Lq3g;
      // 265: fload 21
      // 267: fload 34
      // 269: fadd
      // 26a: fload 29
      // 26c: fadd
      // 26d: f2d
      // 26e: fload 21
      // 270: ldc 128.0
      // 272: nop
      // 273: fadd
      // 274: f2d
      // 275: invokevirtual q3g.h0a (DD)Lq3g;
      // 278: invokevirtual q3g.pzw ()V
      // 27b: aload 5
      // 27d: aload 6
      // 27f: invokevirtual w5i.mb9 ()D
      // 282: dconst_0
      // 283: dload 30
      // 285: invokevirtual q3g.g5o (DDD)Lq3g;
      // 288: fload 21
      // 28a: fload 29
      // 28c: fadd
      // 28d: f2d
      // 28e: fload 21
      // 290: ldc 128.0
      // 292: nop
      // 293: fadd
      // 294: f2d
      // 295: invokevirtual q3g.h0a (DD)Lq3g;
      // 298: invokevirtual q3g.pzw ()V
      // 29b: dload 30
      // 29d: dconst_1
      // 29e: dadd
      // 29f: dstore 30
      // 2a1: fload 29
      // 2a3: ldc 0.5
      // 2a5: nop
      // 2a6: fadd
      // 2a7: fstore 29
      // 2a9: iload 3
      // 2aa: ifne 3c3
      // 2ad: iload 3
      // 2ae: ifeq 1f3
      // 2b1: goto 2b8
      // 2b4: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b7: athrow
      // 2b8: dload 11
      // 2ba: aload 6
      // 2bc: invokevirtual w5i.rt1 ()D
      // 2bf: dload 7
      // 2c1: dadd
      // 2c2: dcmpg
      // 2c3: iload 3
      // 2c4: ifne 3ce
      // 2c7: ifge 39d
      // 2ca: goto 2d1
      // 2cd: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d0: athrow
      // 2d1: fconst_0
      // 2d2: fstore 29
      // 2d4: dload 25
      // 2d6: dstore 30
      // 2d8: dload 30
      // 2da: dload 27
      // 2dc: dcmpg
      // 2dd: ifge 39d
      // 2e0: dconst_1
      // 2e1: dload 27
      // 2e3: dload 30
      // 2e5: dsub
      // 2e6: invokestatic java/lang/Math.min (DD)D
      // 2e9: dstore 32
      // 2eb: dload 32
      // 2ed: d2f
      // 2ee: ldc 0.5
      // 2f0: nop
      // 2f1: fmul
      // 2f2: fstore 34
      // 2f4: aload 5
      // 2f6: aload 6
      // 2f8: invokevirtual w5i.rt1 ()D
      // 2fb: ldc2_w 256.0
      // 2fe: dload 30
      // 300: invokevirtual q3g.g5o (DDD)Lq3g;
      // 303: fload 21
      // 305: fload 29
      // 307: fadd
      // 308: f2d
      // 309: fload 21
      // 30b: fconst_0
      // 30c: fadd
      // 30d: f2d
      // 30e: invokevirtual q3g.h0a (DD)Lq3g;
      // 311: invokevirtual q3g.pzw ()V
      // 314: aload 5
      // 316: aload 6
      // 318: invokevirtual w5i.rt1 ()D
      // 31b: ldc2_w 256.0
      // 31e: dload 30
      // 320: dload 32
      // 322: dadd
      // 323: invokevirtual q3g.g5o (DDD)Lq3g;
      // 326: fload 21
      // 328: fload 34
      // 32a: fadd
      // 32b: fload 29
      // 32d: fadd
      // 32e: f2d
      // 32f: fload 21
      // 331: fconst_0
      // 332: fadd
      // 333: f2d
      // 334: invokevirtual q3g.h0a (DD)Lq3g;
      // 337: invokevirtual q3g.pzw ()V
      // 33a: aload 5
      // 33c: aload 6
      // 33e: invokevirtual w5i.rt1 ()D
      // 341: dconst_0
      // 342: dload 30
      // 344: dload 32
      // 346: dadd
      // 347: invokevirtual q3g.g5o (DDD)Lq3g;
      // 34a: fload 21
      // 34c: fload 34
      // 34e: fadd
      // 34f: fload 29
      // 351: fadd
      // 352: f2d
      // 353: fload 21
      // 355: ldc 128.0
      // 357: nop
      // 358: fadd
      // 359: f2d
      // 35a: invokevirtual q3g.h0a (DD)Lq3g;
      // 35d: invokevirtual q3g.pzw ()V
      // 360: aload 5
      // 362: aload 6
      // 364: invokevirtual w5i.rt1 ()D
      // 367: dconst_0
      // 368: dload 30
      // 36a: invokevirtual q3g.g5o (DDD)Lq3g;
      // 36d: fload 21
      // 36f: fload 29
      // 371: fadd
      // 372: f2d
      // 373: fload 21
      // 375: ldc 128.0
      // 377: nop
      // 378: fadd
      // 379: f2d
      // 37a: invokevirtual q3g.h0a (DD)Lq3g;
      // 37d: invokevirtual q3g.pzw ()V
      // 380: dload 30
      // 382: dconst_1
      // 383: dadd
      // 384: dstore 30
      // 386: fload 29
      // 388: ldc 0.5
      // 38a: nop
      // 38b: fadd
      // 38c: fstore 29
      // 38e: iload 3
      // 38f: ifne 3c3
      // 392: iload 3
      // 393: ifeq 2d8
      // 396: goto 39d
      // 399: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39c: athrow
      // 39d: dload 11
      // 39f: dload 7
      // 3a1: dsub
      // 3a2: invokestatic fe6.jqf (D)I
      // 3a5: i2d
      // 3a6: aload 6
      // 3a8: invokevirtual w5i.rt1 ()D
      // 3ab: invokestatic java/lang/Math.max (DD)D
      // 3ae: dstore 25
      // 3b0: dload 11
      // 3b2: dload 7
      // 3b4: dadd
      // 3b5: invokestatic fe6.hxe (D)I
      // 3b8: i2d
      // 3b9: aload 6
      // 3bb: invokevirtual w5i.mb9 ()D
      // 3be: invokestatic java/lang/Math.min (DD)D
      // 3c1: dstore 27
      // 3c3: dload 15
      // 3c5: aload 6
      // 3c7: invokevirtual w5i.ah4 ()D
      // 3ca: dload 7
      // 3cc: dsub
      // 3cd: dcmpl
      // 3ce: iload 3
      // 3cf: ifne 4b3
      // 3d2: ifle 4a8
      // 3d5: goto 3dc
      // 3d8: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3db: athrow
      // 3dc: fconst_0
      // 3dd: fstore 29
      // 3df: dload 25
      // 3e1: dstore 30
      // 3e3: dload 30
      // 3e5: dload 27
      // 3e7: dcmpg
      // 3e8: ifge 4a8
      // 3eb: dconst_1
      // 3ec: dload 27
      // 3ee: dload 30
      // 3f0: dsub
      // 3f1: invokestatic java/lang/Math.min (DD)D
      // 3f4: dstore 32
      // 3f6: dload 32
      // 3f8: d2f
      // 3f9: ldc 0.5
      // 3fb: nop
      // 3fc: fmul
      // 3fd: fstore 34
      // 3ff: aload 5
      // 401: dload 30
      // 403: ldc2_w 256.0
      // 406: aload 6
      // 408: invokevirtual w5i.ah4 ()D
      // 40b: invokevirtual q3g.g5o (DDD)Lq3g;
      // 40e: fload 21
      // 410: fload 29
      // 412: fadd
      // 413: f2d
      // 414: fload 21
      // 416: fconst_0
      // 417: fadd
      // 418: f2d
      // 419: invokevirtual q3g.h0a (DD)Lq3g;
      // 41c: invokevirtual q3g.pzw ()V
      // 41f: aload 5
      // 421: dload 30
      // 423: dload 32
      // 425: dadd
      // 426: ldc2_w 256.0
      // 429: aload 6
      // 42b: invokevirtual w5i.ah4 ()D
      // 42e: invokevirtual q3g.g5o (DDD)Lq3g;
      // 431: fload 21
      // 433: fload 34
      // 435: fadd
      // 436: fload 29
      // 438: fadd
      // 439: f2d
      // 43a: fload 21
      // 43c: fconst_0
      // 43d: fadd
      // 43e: f2d
      // 43f: invokevirtual q3g.h0a (DD)Lq3g;
      // 442: invokevirtual q3g.pzw ()V
      // 445: aload 5
      // 447: dload 30
      // 449: dload 32
      // 44b: dadd
      // 44c: dconst_0
      // 44d: aload 6
      // 44f: invokevirtual w5i.ah4 ()D
      // 452: invokevirtual q3g.g5o (DDD)Lq3g;
      // 455: fload 21
      // 457: fload 34
      // 459: fadd
      // 45a: fload 29
      // 45c: fadd
      // 45d: f2d
      // 45e: fload 21
      // 460: ldc 128.0
      // 462: nop
      // 463: fadd
      // 464: f2d
      // 465: invokevirtual q3g.h0a (DD)Lq3g;
      // 468: invokevirtual q3g.pzw ()V
      // 46b: aload 5
      // 46d: dload 30
      // 46f: dconst_0
      // 470: aload 6
      // 472: invokevirtual w5i.ah4 ()D
      // 475: invokevirtual q3g.g5o (DDD)Lq3g;
      // 478: fload 21
      // 47a: fload 29
      // 47c: fadd
      // 47d: f2d
      // 47e: fload 21
      // 480: ldc 128.0
      // 482: nop
      // 483: fadd
      // 484: f2d
      // 485: invokevirtual q3g.h0a (DD)Lq3g;
      // 488: invokevirtual q3g.pzw ()V
      // 48b: dload 30
      // 48d: dconst_1
      // 48e: dadd
      // 48f: dstore 30
      // 491: fload 29
      // 493: ldc 0.5
      // 495: nop
      // 496: fadd
      // 497: fstore 29
      // 499: iload 3
      // 49a: ifne 5bc
      // 49d: iload 3
      // 49e: ifeq 3e3
      // 4a1: goto 4a8
      // 4a4: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a7: athrow
      // 4a8: dload 15
      // 4aa: aload 6
      // 4ac: invokevirtual w5i.jbu ()D
      // 4af: dload 7
      // 4b1: dadd
      // 4b2: dcmpg
      // 4b3: iload 3
      // 4b4: ifne 5bd
      // 4b7: ifge 58d
      // 4ba: goto 4c1
      // 4bd: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4c0: athrow
      // 4c1: fconst_0
      // 4c2: fstore 29
      // 4c4: dload 25
      // 4c6: dstore 30
      // 4c8: dload 30
      // 4ca: dload 27
      // 4cc: dcmpg
      // 4cd: ifge 58d
      // 4d0: dconst_1
      // 4d1: dload 27
      // 4d3: dload 30
      // 4d5: dsub
      // 4d6: invokestatic java/lang/Math.min (DD)D
      // 4d9: dstore 32
      // 4db: dload 32
      // 4dd: d2f
      // 4de: ldc 0.5
      // 4e0: nop
      // 4e1: fmul
      // 4e2: fstore 34
      // 4e4: aload 5
      // 4e6: dload 30
      // 4e8: ldc2_w 256.0
      // 4eb: aload 6
      // 4ed: invokevirtual w5i.jbu ()D
      // 4f0: invokevirtual q3g.g5o (DDD)Lq3g;
      // 4f3: fload 21
      // 4f5: fload 29
      // 4f7: fadd
      // 4f8: f2d
      // 4f9: fload 21
      // 4fb: fconst_0
      // 4fc: fadd
      // 4fd: f2d
      // 4fe: invokevirtual q3g.h0a (DD)Lq3g;
      // 501: invokevirtual q3g.pzw ()V
      // 504: aload 5
      // 506: dload 30
      // 508: dload 32
      // 50a: dadd
      // 50b: ldc2_w 256.0
      // 50e: aload 6
      // 510: invokevirtual w5i.jbu ()D
      // 513: invokevirtual q3g.g5o (DDD)Lq3g;
      // 516: fload 21
      // 518: fload 34
      // 51a: fadd
      // 51b: fload 29
      // 51d: fadd
      // 51e: f2d
      // 51f: fload 21
      // 521: fconst_0
      // 522: fadd
      // 523: f2d
      // 524: invokevirtual q3g.h0a (DD)Lq3g;
      // 527: invokevirtual q3g.pzw ()V
      // 52a: aload 5
      // 52c: dload 30
      // 52e: dload 32
      // 530: dadd
      // 531: dconst_0
      // 532: aload 6
      // 534: invokevirtual w5i.jbu ()D
      // 537: invokevirtual q3g.g5o (DDD)Lq3g;
      // 53a: fload 21
      // 53c: fload 34
      // 53e: fadd
      // 53f: fload 29
      // 541: fadd
      // 542: f2d
      // 543: fload 21
      // 545: ldc 128.0
      // 547: nop
      // 548: fadd
      // 549: f2d
      // 54a: invokevirtual q3g.h0a (DD)Lq3g;
      // 54d: invokevirtual q3g.pzw ()V
      // 550: aload 5
      // 552: dload 30
      // 554: dconst_0
      // 555: aload 6
      // 557: invokevirtual w5i.jbu ()D
      // 55a: invokevirtual q3g.g5o (DDD)Lq3g;
      // 55d: fload 21
      // 55f: fload 29
      // 561: fadd
      // 562: f2d
      // 563: fload 21
      // 565: ldc 128.0
      // 567: nop
      // 568: fadd
      // 569: f2d
      // 56a: invokevirtual q3g.h0a (DD)Lq3g;
      // 56d: invokevirtual q3g.pzw ()V
      // 570: dload 30
      // 572: dconst_1
      // 573: dadd
      // 574: dstore 30
      // 576: fload 29
      // 578: ldc 0.5
      // 57a: nop
      // 57b: fadd
      // 57c: fstore 29
      // 57e: iload 3
      // 57f: ifne 5bc
      // 582: iload 3
      // 583: ifeq 4c8
      // 586: goto 58d
      // 589: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 58c: athrow
      // 58d: aload 4
      // 58f: invokevirtual jom.q7g ()V
      // 592: aload 5
      // 594: dconst_0
      // 595: dconst_0
      // 596: dconst_0
      // 597: invokevirtual q3g.nbz (DDD)V
      // 59a: invokestatic hzu.gp4 ()V
      // 59d: invokestatic hzu.vtj ()V
      // 5a0: fconst_0
      // 5a1: fconst_0
      // 5a2: invokestatic hzu.fex (FF)V
      // 5a5: invokestatic hzu.q6d ()V
      // 5a8: invokestatic hzu.if9 ()V
      // 5ab: sipush 770
      // 5ae: sipush 771
      // 5b1: bipush 1
      // 5b2: bipush 0
      // 5b3: invokestatic hzu.u39 (IIII)V
      // 5b6: invokestatic hzu.ux6 ()V
      // 5b9: invokestatic hzu.x3w ()V
      // 5bc: bipush 1
      // 5bd: invokestatic hzu.jun (Z)V
      // 5c0: return
   }

   private void g2q() {
      try {
         hzu.u39(774, 768, 1, 0);
         hzu.spd();
         hzu.wn0(1.0F, 1.0F, 1.0F, 0.5F);
         hzu.fex(-1.0F, -10.0F);
         hzu.ktr();
         hzu.fak(516, 0.1F);
         hzu.if9();
         hzu.dp2();
         if (hxt.ly3()) {
            ShadersRender.beginBlockDamage();
         }
      } catch (JsonSyntaxException var1) {
         throw a(var1);
      }
   }

   private void zwv() {
      try {
         hzu.vtj();
         hzu.fex(0.0F, 0.0F);
         hzu.q6d();
         hzu.if9();
         hzu.jun(true);
         hzu.x3w();
         if (hxt.ly3()) {
            ShadersRender.endBlockDamage();
         }
      } catch (JsonSyntaxException var1) {
         throw a(var1);
      }
   }

   public void aai(jom param1, q3g param2, i2h param3, float param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 3
      // 001: getfield i2h.ivp D
      // 004: aload 3
      // 005: getfield i2h.o2v D
      // 008: aload 3
      // 009: getfield i2h.ivp D
      // 00c: dsub
      // 00d: fload 4
      // 00f: f2d
      // 010: dmul
      // 011: dadd
      // 012: dstore 6
      // 014: aload 3
      // 015: getfield i2h.c54 D
      // 018: aload 3
      // 019: getfield i2h.kfp D
      // 01c: aload 3
      // 01d: getfield i2h.c54 D
      // 020: dsub
      // 021: fload 4
      // 023: f2d
      // 024: dmul
      // 025: dadd
      // 026: dstore 8
      // 028: invokestatic t9d.c ()I
      // 02b: aload 3
      // 02c: getfield i2h.e2b D
      // 02f: aload 3
      // 030: getfield i2h.vbd D
      // 033: aload 3
      // 034: getfield i2h.e2b D
      // 037: dsub
      // 038: fload 4
      // 03a: f2d
      // 03b: dmul
      // 03c: dadd
      // 03d: dstore 10
      // 03f: istore 5
      // 041: aload 0
      // 042: getfield crp.sz2 Ljava/util/Map;
      // 045: iload 5
      // 047: ifne 08c
      // 04a: invokeinterface java/util/Map.isEmpty ()Z 1
      // 04f: ifne 2df
      // 052: goto 059
      // 055: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 058: athrow
      // 059: aload 0
      // 05a: getfield crp.nr3 Llc5;
      // 05d: getstatic yu2.nu_ Lgdz;
      // 060: invokevirtual lc5.anl (Lgdz;)V
      // 063: aload 0
      // 064: invokespecial crp.g2q ()V
      // 067: aload 2
      // 068: bipush 7
      // 06a: getstatic gnl.n6w Lbe7;
      // 06d: invokevirtual q3g.ezr (ILbe7;)V
      // 070: aload 2
      // 071: dload 6
      // 073: dneg
      // 074: dload 8
      // 076: dneg
      // 077: dload 10
      // 079: dneg
      // 07a: invokevirtual q3g.nbz (DDD)V
      // 07d: aload 2
      // 07e: invokevirtual q3g.ndp ()V
      // 081: aload 0
      // 082: getfield crp.sz2 Ljava/util/Map;
      // 085: goto 08c
      // 088: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08b: athrow
      // 08c: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // 091: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 096: astore 12
      // 098: aload 12
      // 09a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 09f: ifeq 2d0
      // 0a2: aload 12
      // 0a4: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0a9: checkcast ax_
      // 0ac: astore 13
      // 0ae: aload 13
      // 0b0: invokevirtual ax_.q6p ()Lmew;
      // 0b3: astore 14
      // 0b5: aload 14
      // 0b7: invokevirtual mew.getX ()I
      // 0ba: i2d
      // 0bb: dload 6
      // 0bd: dsub
      // 0be: dstore 15
      // 0c0: aload 14
      // 0c2: invokevirtual mew.getY ()I
      // 0c5: i2d
      // 0c6: dload 8
      // 0c8: dsub
      // 0c9: dstore 17
      // 0cb: aload 14
      // 0cd: invokevirtual mew.getZ ()I
      // 0d0: i2d
      // 0d1: dload 10
      // 0d3: dsub
      // 0d4: dstore 19
      // 0d6: aload 0
      // 0d7: getfield crp.t6z Lkh3;
      // 0da: aload 14
      // 0dc: invokevirtual kh3.getBlockState (Lmew;)Lzfz;
      // 0df: invokeinterface zfz.r_y ()Le0x; 1
      // 0e4: astore 21
      // 0e6: iload 5
      // 0e8: ifne 2db
      // 0eb: getstatic net/optifine/reflect/Reflector.ForgeTileEntity_canRenderBreaking Lnet/optifine/reflect/ReflectorMethod;
      // 0ee: invokevirtual net/optifine/reflect/ReflectorMethod.exists ()Z
      // 0f1: iload 5
      // 0f3: ifne 1de
      // 0f6: goto 0fd
      // 0f9: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fc: athrow
      // 0fd: ifeq 1d2
      // 100: goto 107
      // 103: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 106: athrow
      // 107: aload 21
      // 109: instanceof hrd
      // 10c: iload 5
      // 10e: ifne 174
      // 111: goto 118
      // 114: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 117: athrow
      // 118: ifne 173
      // 11b: goto 122
      // 11e: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 121: athrow
      // 122: aload 21
      // 124: instanceof u5i
      // 127: iload 5
      // 129: ifne 174
      // 12c: goto 133
      // 12f: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 132: athrow
      // 133: ifne 173
      // 136: goto 13d
      // 139: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13c: athrow
      // 13d: aload 21
      // 13f: instanceof m54
      // 142: iload 5
      // 144: ifne 174
      // 147: goto 14e
      // 14a: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14d: athrow
      // 14e: ifne 173
      // 151: goto 158
      // 154: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 157: athrow
      // 158: aload 21
      // 15a: instanceof pld
      // 15d: iload 5
      // 15f: ifne 174
      // 162: goto 169
      // 165: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 168: athrow
      // 169: ifeq 177
      // 16c: goto 173
      // 16f: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 172: athrow
      // 173: bipush 1
      // 174: goto 178
      // 177: bipush 0
      // 178: istore 23
      // 17a: iload 23
      // 17c: iload 5
      // 17e: ifne 1b7
      // 181: ifne 1b5
      // 184: goto 18b
      // 187: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18a: athrow
      // 18b: aload 0
      // 18c: getfield crp.t6z Lkh3;
      // 18f: aload 14
      // 191: invokevirtual kh3.getTileEntity (Lmew;)Lpyk;
      // 194: astore 24
      // 196: aload 24
      // 198: iload 5
      // 19a: ifne 1a9
      // 19d: ifnull 1b5
      // 1a0: goto 1a7
      // 1a3: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a6: athrow
      // 1a7: aload 24
      // 1a9: getstatic net/optifine/reflect/Reflector.ForgeTileEntity_canRenderBreaking Lnet/optifine/reflect/ReflectorMethod;
      // 1ac: bipush 0
      // 1ad: anewarray 70
      // 1b0: invokestatic net/optifine/reflect/Reflector.callBoolean (Ljava/lang/Object;Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)Z
      // 1b3: istore 23
      // 1b5: iload 23
      // 1b7: iload 5
      // 1b9: ifne 1c7
      // 1bc: ifne 1ca
      // 1bf: goto 1c6
      // 1c2: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c5: athrow
      // 1c6: bipush 1
      // 1c7: goto 1cb
      // 1ca: bipush 0
      // 1cb: istore 22
      // 1cd: iload 5
      // 1cf: ifeq 245
      // 1d2: aload 21
      // 1d4: instanceof hrd
      // 1d7: goto 1de
      // 1da: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1dd: athrow
      // 1de: iload 5
      // 1e0: ifne 1f9
      // 1e3: ifne 242
      // 1e6: goto 1ed
      // 1e9: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ec: athrow
      // 1ed: aload 21
      // 1ef: instanceof u5i
      // 1f2: goto 1f9
      // 1f5: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f8: athrow
      // 1f9: iload 5
      // 1fb: ifne 214
      // 1fe: ifne 242
      // 201: goto 208
      // 204: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 207: athrow
      // 208: aload 21
      // 20a: instanceof m54
      // 20d: goto 214
      // 210: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 213: athrow
      // 214: iload 5
      // 216: ifne 22f
      // 219: ifne 242
      // 21c: goto 223
      // 21f: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 222: athrow
      // 223: aload 21
      // 225: instanceof pld
      // 228: goto 22f
      // 22b: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22e: athrow
      // 22f: iload 5
      // 231: ifne 23f
      // 234: ifne 242
      // 237: goto 23e
      // 23a: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23d: athrow
      // 23e: bipush 1
      // 23f: goto 243
      // 242: bipush 0
      // 243: istore 22
      // 245: iload 22
      // 247: iload 5
      // 249: ifne 272
      // 24c: ifeq 2cb
      // 24f: goto 256
      // 252: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 255: athrow
      // 256: dload 15
      // 258: dload 15
      // 25a: dmul
      // 25b: dload 17
      // 25d: dload 17
      // 25f: dmul
      // 260: dadd
      // 261: dload 19
      // 263: dload 19
      // 265: dmul
      // 266: dadd
      // 267: ldc2_w 1024.0
      // 26a: dcmpl
      // 26b: goto 272
      // 26e: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 271: athrow
      // 272: ifle 288
      // 275: aload 12
      // 277: invokeinterface java/util/Iterator.remove ()V 1
      // 27c: iload 5
      // 27e: ifeq 2cb
      // 281: goto 288
      // 284: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 287: athrow
      // 288: aload 0
      // 289: getfield crp.t6z Lkh3;
      // 28c: aload 14
      // 28e: invokevirtual kh3.getBlockState (Lmew;)Lzfz;
      // 291: astore 23
      // 293: aload 23
      // 295: invokeinterface zfz.r_y ()Le0x; 1
      // 29a: invokevirtual e0x.p1r ()Lp3y;
      // 29d: getstatic p3y.cei Lp3y;
      // 2a0: if_acmpeq 2cb
      // 2a3: aload 13
      // 2a5: invokevirtual ax_.fll ()I
      // 2a8: istore 24
      // 2aa: aload 0
      // 2ab: getfield crp._qh [Lsla;
      // 2ae: iload 24
      // 2b0: aaload
      // 2b1: astore 25
      // 2b3: aload 0
      // 2b4: getfield crp.j0u Lc05;
      // 2b7: invokevirtual c05.dwz ()Lqfn;
      // 2ba: astore 26
      // 2bc: aload 26
      // 2be: aload 23
      // 2c0: aload 14
      // 2c2: aload 25
      // 2c4: aload 0
      // 2c5: getfield crp.t6z Lkh3;
      // 2c8: invokevirtual qfn.bgf (Lzfz;Lmew;Lsla;Lm5n;)V
      // 2cb: iload 5
      // 2cd: ifeq 098
      // 2d0: aload 1
      // 2d1: invokevirtual jom.q7g ()V
      // 2d4: aload 2
      // 2d5: dconst_0
      // 2d6: dconst_0
      // 2d7: dconst_0
      // 2d8: invokevirtual q3g.nbz (DDD)V
      // 2db: aload 0
      // 2dc: invokespecial crp.zwv ()V
      // 2df: return
   }

   public void rq6(ha9 param1, akm param2, int param3, float param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 5
      // 005: iload 3
      // 006: ifne 14a
      // 009: aload 2
      // 00a: getfield akm.oyz Lakm$qs6;
      // 00d: getstatic akm$qs6.i4l Lakm$qs6;
      // 010: if_acmpne 14a
      // 013: goto 01a
      // 016: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 019: athrow
      // 01a: invokestatic hzu.spd ()V
      // 01d: sipush 770
      // 020: sipush 771
      // 023: bipush 1
      // 024: bipush 0
      // 025: invokestatic hzu.u39 (IIII)V
      // 028: fconst_0
      // 029: fconst_0
      // 02a: fconst_0
      // 02b: ldc 0.4
      // 02d: nop
      // 02e: invokestatic hzu.wn0 (FFFF)V
      // 031: fconst_2
      // 032: invokestatic org/lwjgl/opengl/GL11.glLineWidth (F)V
      // 035: invokestatic hzu.m_1 ()V
      // 038: invokestatic hxt.ly3 ()Z
      // 03b: iload 5
      // 03d: ifne 055
      // 040: goto 047
      // 043: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 046: athrow
      // 047: ifeq 054
      // 04a: goto 051
      // 04d: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 050: athrow
      // 051: invokestatic net/optifine/shaders/Shaders.disableTexture2D ()V
      // 054: bipush 0
      // 055: invokestatic hzu.jun (Z)V
      // 058: ldc 0.002
      // 05a: nop
      // 05b: fstore 6
      // 05d: aload 2
      // 05e: invokevirtual akm._uf ()Lmew;
      // 061: astore 7
      // 063: aload 0
      // 064: getfield crp.t6z Lkh3;
      // 067: aload 7
      // 069: invokevirtual kh3.getBlockState (Lmew;)Lzfz;
      // 06c: invokeinterface zfz.r_y ()Le0x; 1
      // 071: astore 8
      // 073: iload 5
      // 075: ifne 13e
      // 078: aload 8
      // 07a: invokevirtual e0x.p1r ()Lp3y;
      // 07d: getstatic p3y.cei Lp3y;
      // 080: if_acmpeq 137
      // 083: goto 08a
      // 086: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 089: athrow
      // 08a: aload 0
      // 08b: getfield crp.t6z Lkh3;
      // 08e: invokevirtual kh3.fve ()Lw5i;
      // 091: aload 7
      // 093: invokevirtual w5i.hka (Lmew;)Z
      // 096: iload 5
      // 098: ifne 141
      // 09b: goto 0a2
      // 09e: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a1: athrow
      // 0a2: ifeq 137
      // 0a5: goto 0ac
      // 0a8: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ab: athrow
      // 0ac: aload 8
      // 0ae: aload 0
      // 0af: getfield crp.t6z Lkh3;
      // 0b2: aload 7
      // 0b4: invokevirtual e0x.c7i (Lm5n;Lmew;)V
      // 0b7: aload 1
      // 0b8: getfield ha9.ivp D
      // 0bb: aload 1
      // 0bc: getfield ha9.o2v D
      // 0bf: aload 1
      // 0c0: getfield ha9.ivp D
      // 0c3: dsub
      // 0c4: fload 4
      // 0c6: f2d
      // 0c7: dmul
      // 0c8: dadd
      // 0c9: dstore 9
      // 0cb: aload 1
      // 0cc: getfield ha9.c54 D
      // 0cf: aload 1
      // 0d0: getfield ha9.kfp D
      // 0d3: aload 1
      // 0d4: getfield ha9.c54 D
      // 0d7: dsub
      // 0d8: fload 4
      // 0da: f2d
      // 0db: dmul
      // 0dc: dadd
      // 0dd: dstore 11
      // 0df: aload 1
      // 0e0: getfield ha9.e2b D
      // 0e3: aload 1
      // 0e4: getfield ha9.vbd D
      // 0e7: aload 1
      // 0e8: getfield ha9.e2b D
      // 0eb: dsub
      // 0ec: fload 4
      // 0ee: f2d
      // 0ef: dmul
      // 0f0: dadd
      // 0f1: dstore 13
      // 0f3: aload 8
      // 0f5: aload 0
      // 0f6: getfield crp.t6z Lkh3;
      // 0f9: aload 7
      // 0fb: invokevirtual e0x.j54 (Lt9d;Lmew;)Lnh4;
      // 0fe: astore 15
      // 100: aload 8
      // 102: invokevirtual e0x.jkr ()Le0x$hep;
      // 105: astore 16
      // 107: aload 16
      // 109: getstatic e0x$hep.j0y Le0x$hep;
      // 10c: if_acmpeq 11a
      // 10f: aload 15
      // 111: aload 16
      // 113: aload 7
      // 115: invokestatic net/optifine/model/BlockModelUtils.getOffsetBoundingBox (Lnh4;Le0x$hep;Lmew;)Lnh4;
      // 118: astore 15
      // 11a: aload 15
      // 11c: ldc2_w 0.0020000000949949026
      // 11f: ldc2_w 0.0020000000949949026
      // 122: ldc2_w 0.0020000000949949026
      // 125: invokevirtual nh4.c2h (DDD)Lnh4;
      // 128: dload 9
      // 12a: dneg
      // 12b: dload 11
      // 12d: dneg
      // 12e: dload 13
      // 130: dneg
      // 131: invokevirtual nh4.sy_ (DDD)Lnh4;
      // 134: invokestatic crp.uja (Lnh4;)V
      // 137: bipush 1
      // 138: invokestatic hzu.jun (Z)V
      // 13b: invokestatic hzu.rqj ()V
      // 13e: invokestatic hxt.ly3 ()Z
      // 141: ifeq 147
      // 144: invokestatic net/optifine/shaders/Shaders.enableTexture2D ()V
      // 147: invokestatic hzu.ux6 ()V
      // 14a: return
   }

   public static void uja(nh4 var0) {
      jom var1 = jom.yut();
      q3g var2 = var1.zuq();
      var2.ezr(3, gnl.gx3);
      var2.g5o(var0.rlc, var0.bx_, var0.t8n).pzw();
      var2.g5o(var0.t_2, var0.bx_, var0.t8n).pzw();
      var2.g5o(var0.t_2, var0.bx_, var0.oqj).pzw();
      var2.g5o(var0.rlc, var0.bx_, var0.oqj).pzw();
      var2.g5o(var0.rlc, var0.bx_, var0.t8n).pzw();
      var1.q7g();
      var2.ezr(3, gnl.gx3);
      var2.g5o(var0.rlc, var0.i2c, var0.t8n).pzw();
      var2.g5o(var0.t_2, var0.i2c, var0.t8n).pzw();
      var2.g5o(var0.t_2, var0.i2c, var0.oqj).pzw();
      var2.g5o(var0.rlc, var0.i2c, var0.oqj).pzw();
      var2.g5o(var0.rlc, var0.i2c, var0.t8n).pzw();
      var1.q7g();
      var2.ezr(1, gnl.gx3);
      var2.g5o(var0.rlc, var0.bx_, var0.t8n).pzw();
      var2.g5o(var0.rlc, var0.i2c, var0.t8n).pzw();
      var2.g5o(var0.t_2, var0.bx_, var0.t8n).pzw();
      var2.g5o(var0.t_2, var0.i2c, var0.t8n).pzw();
      var2.g5o(var0.t_2, var0.bx_, var0.oqj).pzw();
      var2.g5o(var0.t_2, var0.i2c, var0.oqj).pzw();
      var2.g5o(var0.rlc, var0.bx_, var0.oqj).pzw();
      var2.g5o(var0.rlc, var0.i2c, var0.oqj).pzw();
      var1.q7g();
   }

   public static void h_0(nh4 var0, int var1, int var2, int var3, int var4) {
      jom var5 = jom.yut();
      q3g var6 = var5.zuq();
      var6.ezr(3, gnl.gec);
      var6.g5o(var0.rlc, var0.bx_, var0.t8n).fje(var1, var2, var3, var4).pzw();
      var6.g5o(var0.t_2, var0.bx_, var0.t8n).fje(var1, var2, var3, var4).pzw();
      var6.g5o(var0.t_2, var0.bx_, var0.oqj).fje(var1, var2, var3, var4).pzw();
      var6.g5o(var0.rlc, var0.bx_, var0.oqj).fje(var1, var2, var3, var4).pzw();
      var6.g5o(var0.rlc, var0.bx_, var0.t8n).fje(var1, var2, var3, var4).pzw();
      var5.q7g();
      var6.ezr(3, gnl.gec);
      var6.g5o(var0.rlc, var0.i2c, var0.t8n).fje(var1, var2, var3, var4).pzw();
      var6.g5o(var0.t_2, var0.i2c, var0.t8n).fje(var1, var2, var3, var4).pzw();
      var6.g5o(var0.t_2, var0.i2c, var0.oqj).fje(var1, var2, var3, var4).pzw();
      var6.g5o(var0.rlc, var0.i2c, var0.oqj).fje(var1, var2, var3, var4).pzw();
      var6.g5o(var0.rlc, var0.i2c, var0.t8n).fje(var1, var2, var3, var4).pzw();
      var5.q7g();
      var6.ezr(1, gnl.gec);
      var6.g5o(var0.rlc, var0.bx_, var0.t8n).fje(var1, var2, var3, var4).pzw();
      var6.g5o(var0.rlc, var0.i2c, var0.t8n).fje(var1, var2, var3, var4).pzw();
      var6.g5o(var0.t_2, var0.bx_, var0.t8n).fje(var1, var2, var3, var4).pzw();
      var6.g5o(var0.t_2, var0.i2c, var0.t8n).fje(var1, var2, var3, var4).pzw();
      var6.g5o(var0.t_2, var0.bx_, var0.oqj).fje(var1, var2, var3, var4).pzw();
      var6.g5o(var0.t_2, var0.i2c, var0.oqj).fje(var1, var2, var3, var4).pzw();
      var6.g5o(var0.rlc, var0.bx_, var0.oqj).fje(var1, var2, var3, var4).pzw();
      var6.g5o(var0.rlc, var0.i2c, var0.oqj).fje(var1, var2, var3, var4).pzw();
      var5.q7g();
   }

   private void y4r(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.o6x.rid(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void vsk(mew var1) {
      int var2 = var1.getX();
      int var3 = var1.getY();
      int var4 = var1.getZ();
      this.y4r(var2 - 1, var3 - 1, var4 - 1, var2 + 1, var3 + 1, var4 + 1);
   }

   @Override
   public void xyy(mew var1) {
      int var2 = var1.getX();
      int var3 = var1.getY();
      int var4 = var1.getZ();
      this.y4r(var2 - 1, var3 - 1, var4 - 1, var2 + 1, var3 + 1, var4 + 1);
   }

   @Override
   public void cy9(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.y4r(var1 - 1, var2 - 1, var3 - 1, var4 + 1, var5 + 1, var6 + 1);
   }

   @Override
   public void bs4(String param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: getfield crp.kgn Ljava/util/Map;
      // 08: aload 2
      // 09: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0e: checkcast jp4
      // 11: astore 4
      // 13: aload 4
      // 15: iload 3
      // 16: ifeq 40
      // 19: ifnull 41
      // 1c: goto 23
      // 1f: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22: athrow
      // 23: aload 0
      // 24: getfield crp.j0u Lc05;
      // 27: invokevirtual c05.yp9 ()Ldbu;
      // 2a: aload 4
      // 2c: invokevirtual dbu.o81 (Ljp4;)V
      // 2f: aload 0
      // 30: getfield crp.kgn Ljava/util/Map;
      // 33: aload 2
      // 34: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 39: goto 40
      // 3c: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3f: athrow
      // 40: pop
      // 41: aload 1
      // 42: iload 3
      // 43: ifeq 51
      // 46: ifnull a6
      // 49: goto 50
      // 4c: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4f: athrow
      // 50: aload 1
      // 51: invokestatic jrs.bjz (Ljava/lang/String;)Ljrs;
      // 54: astore 5
      // 56: aload 5
      // 58: ifnull 71
      // 5b: aload 0
      // 5c: getfield crp.j0u Lc05;
      // 5f: getfield c05.t43 Ld1f;
      // 62: aload 5
      // 64: invokevirtual jrs.dr5 ()Ljava/lang/String;
      // 67: invokevirtual d1f.lx1 (Ljava/lang/String;)V
      // 6a: goto 71
      // 6d: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 70: athrow
      // 71: new gdz
      // 74: dup
      // 75: aload 1
      // 76: invokespecial gdz.<init> (Ljava/lang/String;)V
      // 79: aload 2
      // 7a: invokevirtual mew.getX ()I
      // 7d: i2f
      // 7e: aload 2
      // 7f: invokevirtual mew.getY ()I
      // 82: i2f
      // 83: aload 2
      // 84: invokevirtual mew.getZ ()I
      // 87: i2f
      // 88: invokestatic vs1.sag (Lgdz;FFF)Lvs1;
      // 8b: astore 6
      // 8d: aload 0
      // 8e: getfield crp.kgn Ljava/util/Map;
      // 91: aload 2
      // 92: aload 6
      // 94: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 99: pop
      // 9a: aload 0
      // 9b: getfield crp.j0u Lc05;
      // 9e: invokevirtual c05.yp9 ()Ldbu;
      // a1: aload 6
      // a3: invokevirtual dbu.mak (Ljp4;)V
      // a6: return
   }

   @Override
   public void z24(String var1, double var2, double var4, double var6, float var8, float var9) {
   }

   @Override
   public void jdq(ha9 var1, String var2, double var3, double var5, double var7, float var9, float var10) {
   }

   @Override
   public void t0e(int param1, boolean param2, double param3, double param5, double param7, double param9, double param11, double param13, int[] param15) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic crp.a J
      // 03: ldc2_w 82487267684207
      // 06: lxor
      // 07: lstore 16
      // 09: invokestatic t9d.c ()I
      // 0c: istore 18
      // 0e: aload 0
      // 0f: iload 1
      // 10: iload 2
      // 11: dload 3
      // 12: dload 5
      // 14: dload 7
      // 16: dload 9
      // 18: dload 11
      // 1a: dload 13
      // 1c: aload 15
      // 1e: invokespecial crp.n_v (IZDDDDDD[I)Lflo;
      // 21: pop
      // 22: goto c4
      // 25: astore 19
      // 27: aload 19
      // 29: sipush 25207
      // 2c: ldc2_w 6644477427258056659
      // 2f: lload 16
      // 31: lxor
      // 32: invokedynamic j (IJ)Ljava/lang/String; bsm=crp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: nop
      // 38: invokestatic e1i.cor (Ljava/lang/Throwable;Ljava/lang/String;)Le1i;
      // 3b: astore 20
      // 3d: aload 20
      // 3f: sipush 13309
      // 42: ldc2_w 8467282591966924360
      // 45: lload 16
      // 47: lxor
      // 48: invokedynamic j (IJ)Ljava/lang/String; bsm=crp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d: nop
      // 4e: invokevirtual e1i.i_r (Ljava/lang/String;)Lwsc;
      // 51: astore 21
      // 53: aload 21
      // 55: sipush 27432
      // 58: ldc2_w 307910843238274751
      // 5b: lload 16
      // 5d: lxor
      // 5e: invokedynamic j (IJ)Ljava/lang/String; bsm=crp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: nop
      // 64: iload 1
      // 65: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 68: invokevirtual wsc._0p (Ljava/lang/String;Ljava/lang/Object;)V
      // 6b: iload 18
      // 6d: ifne ba
      // 70: aload 15
      // 72: ifnull 99
      // 75: goto 7c
      // 78: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7b: athrow
      // 7c: aload 21
      // 7e: sipush 21029
      // 81: ldc2_w 4941920526538436492
      // 84: lload 16
      // 86: lxor
      // 87: invokedynamic j (IJ)Ljava/lang/String; bsm=crp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8c: nop
      // 8d: aload 15
      // 8f: invokevirtual wsc._0p (Ljava/lang/String;Ljava/lang/Object;)V
      // 92: goto 99
      // 95: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 98: athrow
      // 99: aload 21
      // 9b: sipush 20807
      // 9e: ldc2_w 6662483116943174907
      // a1: lload 16
      // a3: lxor
      // a4: invokedynamic j (IJ)Ljava/lang/String; bsm=crp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a9: nop
      // aa: new crp$1
      // ad: dup
      // ae: aload 0
      // af: dload 3
      // b0: dload 5
      // b2: dload 7
      // b4: invokespecial crp$1.<init> (Lcrp;DDD)V
      // b7: invokevirtual wsc.h1o (Ljava/lang/String;Ljava/util/concurrent/Callable;)V
      // ba: new oov
      // bd: dup
      // be: aload 20
      // c0: invokespecial oov.<init> (Le1i;)V
      // c3: athrow
      // c4: return
   }

   private void agu(w_0 var1, double var2, double var4, double var6, double var8, double var10, double var12, int[] var14) {
      this.t0e(var1.ewe(), var1._gn(), var2, var4, var6, var8, var10, var12, var14);
   }

   private flo n_v(int param1, boolean param2, double param3, double param5, double param7, double param9, double param11, double param13, int[] param15) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 16
      // 005: aload 0
      // 006: getfield crp.j0u Lc05;
      // 009: iload 16
      // 00b: ifeq 023
      // 00e: ifnull 5e7
      // 011: goto 018
      // 014: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 017: athrow
      // 018: aload 0
      // 019: getfield crp.j0u Lc05;
      // 01c: goto 023
      // 01f: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 022: athrow
      // 023: iload 16
      // 025: ifeq 040
      // 028: invokevirtual c05.nsd ()Li2h;
      // 02b: ifnull 5e7
      // 02e: goto 035
      // 031: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 034: athrow
      // 035: aload 0
      // 036: getfield crp.j0u Lc05;
      // 039: goto 040
      // 03c: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03f: athrow
      // 040: iload 16
      // 042: ifeq 05d
      // 045: getfield c05.i4p Ljux;
      // 048: ifnull 5e7
      // 04b: goto 052
      // 04e: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 051: athrow
      // 052: aload 0
      // 053: getfield crp.j0u Lc05;
      // 056: goto 05d
      // 059: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05c: athrow
      // 05d: getfield c05.oxn Lmoh;
      // 060: getfield moh.ysd I
      // 063: istore 17
      // 065: iload 17
      // 067: iload 16
      // 069: ifeq 095
      // 06c: bipush 1
      // 06d: if_icmpne 09b
      // 070: goto 077
      // 073: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 076: athrow
      // 077: aload 0
      // 078: iload 16
      // 07a: ifeq 09c
      // 07d: goto 084
      // 080: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 083: athrow
      // 084: getfield crp.t6z Lkh3;
      // 087: getfield kh3.fsy Ljava/util/Random;
      // 08a: bipush 3
      // 08b: invokevirtual java/util/Random.nextInt (I)I
      // 08e: goto 095
      // 091: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 094: athrow
      // 095: ifne 09b
      // 098: bipush 2
      // 099: istore 17
      // 09b: aload 0
      // 09c: getfield crp.j0u Lc05;
      // 09f: invokevirtual c05.nsd ()Li2h;
      // 0a2: getfield i2h.o2v D
      // 0a5: dload 3
      // 0a6: dsub
      // 0a7: dstore 18
      // 0a9: aload 0
      // 0aa: getfield crp.j0u Lc05;
      // 0ad: invokevirtual c05.nsd ()Li2h;
      // 0b0: getfield i2h.kfp D
      // 0b3: dload 5
      // 0b5: dsub
      // 0b6: dstore 20
      // 0b8: aload 0
      // 0b9: getfield crp.j0u Lc05;
      // 0bc: invokevirtual c05.nsd ()Li2h;
      // 0bf: getfield i2h.vbd D
      // 0c2: dload 7
      // 0c4: dsub
      // 0c5: dstore 22
      // 0c7: iload 1
      // 0c8: getstatic w_0.ezk Lw_0;
      // 0cb: invokevirtual w_0.ewe ()I
      // 0ce: iload 16
      // 0d0: ifeq 103
      // 0d3: if_icmpne 0fc
      // 0d6: goto 0dd
      // 0d9: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0dc: athrow
      // 0dd: invokestatic hxt.ch8 ()Z
      // 0e0: iload 16
      // 0e2: ifeq 0fd
      // 0e5: goto 0ec
      // 0e8: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0eb: athrow
      // 0ec: ifne 0fc
      // 0ef: goto 0f6
      // 0f2: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f5: athrow
      // 0f6: aconst_null
      // 0f7: areturn
      // 0f8: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fb: athrow
      // 0fc: iload 1
      // 0fd: getstatic w_0.tmu Lw_0;
      // 100: invokevirtual w_0.ewe ()I
      // 103: iload 16
      // 105: ifeq 138
      // 108: if_icmpne 131
      // 10b: goto 112
      // 10e: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 111: athrow
      // 112: invokestatic hxt.ch8 ()Z
      // 115: iload 16
      // 117: ifeq 132
      // 11a: goto 121
      // 11d: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 120: athrow
      // 121: ifne 131
      // 124: goto 12b
      // 127: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12a: athrow
      // 12b: aconst_null
      // 12c: areturn
      // 12d: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 130: athrow
      // 131: iload 1
      // 132: getstatic w_0.aiv Lw_0;
      // 135: invokevirtual w_0.ewe ()I
      // 138: iload 16
      // 13a: ifeq 16d
      // 13d: if_icmpne 166
      // 140: goto 147
      // 143: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 146: athrow
      // 147: invokestatic hxt.ch8 ()Z
      // 14a: iload 16
      // 14c: ifeq 167
      // 14f: goto 156
      // 152: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 155: athrow
      // 156: ifne 166
      // 159: goto 160
      // 15c: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15f: athrow
      // 160: aconst_null
      // 161: areturn
      // 162: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 165: athrow
      // 166: iload 1
      // 167: getstatic w_0.ahz Lw_0;
      // 16a: invokevirtual w_0.ewe ()I
      // 16d: iload 16
      // 16f: ifeq 1a2
      // 172: if_icmpne 19b
      // 175: goto 17c
      // 178: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17b: athrow
      // 17c: invokestatic hxt.ss5 ()Z
      // 17f: iload 16
      // 181: ifeq 19c
      // 184: goto 18b
      // 187: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18a: athrow
      // 18b: ifne 19b
      // 18e: goto 195
      // 191: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 194: athrow
      // 195: aconst_null
      // 196: areturn
      // 197: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19a: athrow
      // 19b: iload 1
      // 19c: getstatic w_0.rwy Lw_0;
      // 19f: invokevirtual w_0.ewe ()I
      // 1a2: iload 16
      // 1a4: ifeq 1d7
      // 1a7: if_icmpne 1d0
      // 1aa: goto 1b1
      // 1ad: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b0: athrow
      // 1b1: invokestatic hxt.jon ()Z
      // 1b4: iload 16
      // 1b6: ifeq 1d1
      // 1b9: goto 1c0
      // 1bc: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1bf: athrow
      // 1c0: ifne 1d0
      // 1c3: goto 1ca
      // 1c6: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c9: athrow
      // 1ca: aconst_null
      // 1cb: areturn
      // 1cc: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1cf: athrow
      // 1d0: iload 1
      // 1d1: getstatic w_0.bac Lw_0;
      // 1d4: invokevirtual w_0.ewe ()I
      // 1d7: iload 16
      // 1d9: ifeq 20c
      // 1dc: if_icmpne 205
      // 1df: goto 1e6
      // 1e2: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e5: athrow
      // 1e6: invokestatic hxt.zio ()Z
      // 1e9: iload 16
      // 1eb: ifeq 206
      // 1ee: goto 1f5
      // 1f1: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f4: athrow
      // 1f5: ifne 205
      // 1f8: goto 1ff
      // 1fb: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1fe: athrow
      // 1ff: aconst_null
      // 200: areturn
      // 201: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 204: athrow
      // 205: iload 1
      // 206: getstatic w_0.vby Lw_0;
      // 209: invokevirtual w_0.ewe ()I
      // 20c: iload 16
      // 20e: ifeq 241
      // 211: if_icmpne 23a
      // 214: goto 21b
      // 217: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21a: athrow
      // 21b: invokestatic hxt.zio ()Z
      // 21e: iload 16
      // 220: ifeq 23b
      // 223: goto 22a
      // 226: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 229: athrow
      // 22a: ifne 23a
      // 22d: goto 234
      // 230: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 233: athrow
      // 234: aconst_null
      // 235: areturn
      // 236: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 239: athrow
      // 23a: iload 1
      // 23b: getstatic w_0.hg8 Lw_0;
      // 23e: invokevirtual w_0.ewe ()I
      // 241: iload 16
      // 243: ifeq 276
      // 246: if_icmpne 26f
      // 249: goto 250
      // 24c: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24f: athrow
      // 250: invokestatic hxt.aok ()Z
      // 253: iload 16
      // 255: ifeq 270
      // 258: goto 25f
      // 25b: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25e: athrow
      // 25f: ifne 26f
      // 262: goto 269
      // 265: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 268: athrow
      // 269: aconst_null
      // 26a: areturn
      // 26b: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26e: athrow
      // 26f: iload 1
      // 270: getstatic w_0.s7d Lw_0;
      // 273: invokevirtual w_0.ewe ()I
      // 276: iload 16
      // 278: ifeq 2ab
      // 27b: if_icmpne 2a4
      // 27e: goto 285
      // 281: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 284: athrow
      // 285: invokestatic hxt.aok ()Z
      // 288: iload 16
      // 28a: ifeq 2a5
      // 28d: goto 294
      // 290: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 293: athrow
      // 294: ifne 2a4
      // 297: goto 29e
      // 29a: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29d: athrow
      // 29e: aconst_null
      // 29f: areturn
      // 2a0: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a3: athrow
      // 2a4: iload 1
      // 2a5: getstatic w_0.ycr Lw_0;
      // 2a8: invokevirtual w_0.ewe ()I
      // 2ab: iload 16
      // 2ad: ifeq 2e0
      // 2b0: if_icmpne 2d9
      // 2b3: goto 2ba
      // 2b6: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b9: athrow
      // 2ba: invokestatic hxt.aok ()Z
      // 2bd: iload 16
      // 2bf: ifeq 2da
      // 2c2: goto 2c9
      // 2c5: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c8: athrow
      // 2c9: ifne 2d9
      // 2cc: goto 2d3
      // 2cf: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d2: athrow
      // 2d3: aconst_null
      // 2d4: areturn
      // 2d5: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d8: athrow
      // 2d9: iload 1
      // 2da: getstatic w_0.cle Lw_0;
      // 2dd: invokevirtual w_0.ewe ()I
      // 2e0: iload 16
      // 2e2: ifeq 315
      // 2e5: if_icmpne 30e
      // 2e8: goto 2ef
      // 2eb: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2ee: athrow
      // 2ef: invokestatic hxt.aok ()Z
      // 2f2: iload 16
      // 2f4: ifeq 30f
      // 2f7: goto 2fe
      // 2fa: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2fd: athrow
      // 2fe: ifne 30e
      // 301: goto 308
      // 304: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 307: athrow
      // 308: aconst_null
      // 309: areturn
      // 30a: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 30d: athrow
      // 30e: iload 1
      // 30f: getstatic w_0.c0z Lw_0;
      // 312: invokevirtual w_0.ewe ()I
      // 315: iload 16
      // 317: ifeq 34a
      // 31a: if_icmpne 343
      // 31d: goto 324
      // 320: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 323: athrow
      // 324: invokestatic hxt.aok ()Z
      // 327: iload 16
      // 329: ifeq 344
      // 32c: goto 333
      // 32f: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 332: athrow
      // 333: ifne 343
      // 336: goto 33d
      // 339: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 33c: athrow
      // 33d: aconst_null
      // 33e: areturn
      // 33f: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 342: athrow
      // 343: iload 1
      // 344: getstatic w_0.t9k Lw_0;
      // 347: invokevirtual w_0.ewe ()I
      // 34a: iload 16
      // 34c: ifeq 37f
      // 34f: if_icmpne 378
      // 352: goto 359
      // 355: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 358: athrow
      // 359: invokestatic hxt._9o ()Z
      // 35c: iload 16
      // 35e: ifeq 379
      // 361: goto 368
      // 364: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 367: athrow
      // 368: ifne 378
      // 36b: goto 372
      // 36e: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 371: athrow
      // 372: aconst_null
      // 373: areturn
      // 374: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 377: athrow
      // 378: iload 1
      // 379: getstatic w_0.jnp Lw_0;
      // 37c: invokevirtual w_0.ewe ()I
      // 37f: iload 16
      // 381: ifeq 3b4
      // 384: if_icmpne 3ad
      // 387: goto 38e
      // 38a: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 38d: athrow
      // 38e: invokestatic hxt.sos ()Z
      // 391: iload 16
      // 393: ifeq 3ae
      // 396: goto 39d
      // 399: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39c: athrow
      // 39d: ifne 3ad
      // 3a0: goto 3a7
      // 3a3: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a6: athrow
      // 3a7: aconst_null
      // 3a8: areturn
      // 3a9: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3ac: athrow
      // 3ad: iload 1
      // 3ae: getstatic w_0.dyc Lw_0;
      // 3b1: invokevirtual w_0.ewe ()I
      // 3b4: iload 16
      // 3b6: ifeq 3e9
      // 3b9: if_icmpne 3e2
      // 3bc: goto 3c3
      // 3bf: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c2: athrow
      // 3c3: invokestatic hxt.g17 ()Z
      // 3c6: iload 16
      // 3c8: ifeq 3e3
      // 3cb: goto 3d2
      // 3ce: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3d1: athrow
      // 3d2: ifne 3e2
      // 3d5: goto 3dc
      // 3d8: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3db: athrow
      // 3dc: aconst_null
      // 3dd: areturn
      // 3de: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3e1: athrow
      // 3e2: iload 1
      // 3e3: getstatic w_0.cde Lw_0;
      // 3e6: invokevirtual w_0.ewe ()I
      // 3e9: iload 16
      // 3eb: ifeq 41e
      // 3ee: if_icmpne 417
      // 3f1: goto 3f8
      // 3f4: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3f7: athrow
      // 3f8: invokestatic hxt.dhi ()Z
      // 3fb: iload 16
      // 3fd: ifeq 418
      // 400: goto 407
      // 403: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 406: athrow
      // 407: ifne 417
      // 40a: goto 411
      // 40d: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 410: athrow
      // 411: aconst_null
      // 412: areturn
      // 413: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 416: athrow
      // 417: iload 1
      // 418: getstatic w_0.fpv Lw_0;
      // 41b: invokevirtual w_0.ewe ()I
      // 41e: iload 16
      // 420: ifeq 45f
      // 423: if_icmpne 44c
      // 426: goto 42d
      // 429: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 42c: athrow
      // 42d: invokestatic hxt.dhi ()Z
      // 430: iload 16
      // 432: ifeq 44d
      // 435: goto 43c
      // 438: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 43b: athrow
      // 43c: ifne 44c
      // 43f: goto 446
      // 442: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 445: athrow
      // 446: aconst_null
      // 447: areturn
      // 448: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 44b: athrow
      // 44c: iload 1
      // 44d: iload 16
      // 44f: ifeq 482
      // 452: getstatic w_0.dj0 Lw_0;
      // 455: invokevirtual w_0.ewe ()I
      // 458: goto 45f
      // 45b: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 45e: athrow
      // 45f: if_icmpne 481
      // 462: invokestatic hxt.s5i ()Z
      // 465: iload 16
      // 467: ifeq 482
      // 46a: goto 471
      // 46d: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 470: athrow
      // 471: ifne 481
      // 474: goto 47b
      // 477: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 47a: athrow
      // 47b: aconst_null
      // 47c: areturn
      // 47d: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 480: athrow
      // 481: iload 2
      // 482: ifne 4da
      // 485: ldc2_w 1024.0
      // 488: dstore 24
      // 48a: iload 1
      // 48b: iload 16
      // 48d: ifeq 4b9
      // 490: getstatic w_0.fzw Lw_0;
      // 493: invokevirtual w_0.ewe ()I
      // 496: if_icmpne 4a5
      // 499: goto 4a0
      // 49c: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 49f: athrow
      // 4a0: ldc2_w 38416.0
      // 4a3: dstore 24
      // 4a5: dload 18
      // 4a7: dload 18
      // 4a9: dmul
      // 4aa: dload 20
      // 4ac: dload 20
      // 4ae: dmul
      // 4af: dadd
      // 4b0: dload 22
      // 4b2: dload 22
      // 4b4: dmul
      // 4b5: dadd
      // 4b6: dload 24
      // 4b8: dcmpl
      // 4b9: iload 16
      // 4bb: ifeq 4d0
      // 4be: ifle 4ce
      // 4c1: goto 4c8
      // 4c4: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4c7: athrow
      // 4c8: aconst_null
      // 4c9: areturn
      // 4ca: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4cd: athrow
      // 4ce: iload 17
      // 4d0: bipush 1
      // 4d1: if_icmple 4da
      // 4d4: aconst_null
      // 4d5: areturn
      // 4d6: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4d9: athrow
      // 4da: aload 0
      // 4db: getfield crp.j0u Lc05;
      // 4de: getfield c05.i4p Ljux;
      // 4e1: iload 1
      // 4e2: dload 3
      // 4e3: dload 5
      // 4e5: dload 7
      // 4e7: dload 9
      // 4e9: dload 11
      // 4eb: dload 13
      // 4ed: aload 15
      // 4ef: invokevirtual jux.tve (IDDDDDD[I)Lflo;
      // 4f2: astore 24
      // 4f4: iload 1
      // 4f5: getstatic w_0.w_h Lw_0;
      // 4f8: invokevirtual w_0.ewe ()I
      // 4fb: iload 16
      // 4fd: ifeq 52a
      // 500: if_icmpne 523
      // 503: goto 50a
      // 506: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 509: athrow
      // 50a: aload 24
      // 50c: aload 0
      // 50d: getfield crp.t6z Lkh3;
      // 510: dload 3
      // 511: dload 5
      // 513: dload 7
      // 515: aload 0
      // 516: getfield crp.pop Lnet/optifine/render/RenderEnv;
      // 519: invokestatic net/optifine/CustomColors.updateWaterFX (Lflo;Lm5n;DDDLnet/optifine/render/RenderEnv;)V
      // 51c: goto 523
      // 51f: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 522: athrow
      // 523: iload 1
      // 524: getstatic w_0.eiu Lw_0;
      // 527: invokevirtual w_0.ewe ()I
      // 52a: iload 16
      // 52c: ifeq 559
      // 52f: if_icmpne 552
      // 532: goto 539
      // 535: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 538: athrow
      // 539: aload 24
      // 53b: aload 0
      // 53c: getfield crp.t6z Lkh3;
      // 53f: dload 3
      // 540: dload 5
      // 542: dload 7
      // 544: aload 0
      // 545: getfield crp.pop Lnet/optifine/render/RenderEnv;
      // 548: invokestatic net/optifine/CustomColors.updateWaterFX (Lflo;Lm5n;DDDLnet/optifine/render/RenderEnv;)V
      // 54b: goto 552
      // 54e: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 551: athrow
      // 552: iload 1
      // 553: getstatic w_0.nfs Lw_0;
      // 556: invokevirtual w_0.ewe ()I
      // 559: iload 16
      // 55b: ifeq 588
      // 55e: if_icmpne 581
      // 561: goto 568
      // 564: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 567: athrow
      // 568: aload 24
      // 56a: aload 0
      // 56b: getfield crp.t6z Lkh3;
      // 56e: dload 3
      // 56f: dload 5
      // 571: dload 7
      // 573: aload 0
      // 574: getfield crp.pop Lnet/optifine/render/RenderEnv;
      // 577: invokestatic net/optifine/CustomColors.updateWaterFX (Lflo;Lm5n;DDDLnet/optifine/render/RenderEnv;)V
      // 57a: goto 581
      // 57d: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 580: athrow
      // 581: iload 1
      // 582: getstatic w_0.n2e Lw_0;
      // 585: invokevirtual w_0.ewe ()I
      // 588: iload 16
      // 58a: ifeq 5aa
      // 58d: if_icmpne 5a3
      // 590: goto 597
      // 593: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 596: athrow
      // 597: aload 24
      // 599: invokestatic net/optifine/CustomColors.updateMyceliumFX (Lflo;)V
      // 59c: goto 5a3
      // 59f: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5a2: athrow
      // 5a3: iload 1
      // 5a4: getstatic w_0.t9k Lw_0;
      // 5a7: invokevirtual w_0.ewe ()I
      // 5aa: iload 16
      // 5ac: ifeq 5cc
      // 5af: if_icmpne 5c5
      // 5b2: goto 5b9
      // 5b5: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5b8: athrow
      // 5b9: aload 24
      // 5bb: invokestatic net/optifine/CustomColors.updatePortalFX (Lflo;)V
      // 5be: goto 5c5
      // 5c1: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5c4: athrow
      // 5c5: iload 1
      // 5c6: getstatic w_0.dyc Lw_0;
      // 5c9: invokevirtual w_0.ewe ()I
      // 5cc: if_icmpne 5e4
      // 5cf: aload 24
      // 5d1: aload 0
      // 5d2: getfield crp.t6z Lkh3;
      // 5d5: dload 3
      // 5d6: dload 5
      // 5d8: dload 7
      // 5da: invokestatic net/optifine/CustomColors.updateReddustFX (Lflo;Lm5n;DDD)V
      // 5dd: goto 5e4
      // 5e0: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5e3: athrow
      // 5e4: aload 24
      // 5e6: areturn
      // 5e7: aconst_null
      // 5e8: areturn
   }

   @Override
   public void m4f(i2h param1) {
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
      // 05: aload 0
      // 06: iload 2
      // 07: ifne 26
      // 0a: getfield crp.t6z Lkh3;
      // 0d: invokestatic net/optifine/RandomEntities.entityLoaded (Li2h;Lt9d;)V
      // 10: invokestatic hxt.csr ()Z
      // 13: ifeq 29
      // 16: goto 1d
      // 19: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: aload 1
      // 1e: aload 0
      // 1f: goto 26
      // 22: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25: athrow
      // 26: invokestatic net/optifine/DynamicLights.entityAdded (Li2h;Lcrp;)V
      // 29: return
   }

   @Override
   public void fbz(i2h param1) {
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
      // 05: aload 0
      // 06: iload 2
      // 07: ifeq 26
      // 0a: getfield crp.t6z Lkh3;
      // 0d: invokestatic net/optifine/RandomEntities.entityUnloaded (Li2h;Lt9d;)V
      // 10: invokestatic hxt.csr ()Z
      // 13: ifeq 29
      // 16: goto 1d
      // 19: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: aload 1
      // 1e: aload 0
      // 1f: goto 26
      // 22: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25: athrow
      // 26: invokestatic net/optifine/DynamicLights.entityRemoved (Li2h;Lcrp;)V
      // 29: return
   }

   public void xxm() {
   }

   @Override
   public void a60(int param1, mew param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic crp.a J
      // 003: ldc2_w 57295357420310
      // 006: lxor
      // 007: lstore 4
      // 009: invokestatic t9d.b ()I
      // 00c: istore 6
      // 00e: iload 1
      // 00f: lookupswitch 305 2 1013 25 1018 25
      // 028: aload 0
      // 029: getfield crp.j0u Lc05;
      // 02c: invokevirtual c05.nsd ()Li2h;
      // 02f: ifnull 140
      // 032: goto 039
      // 035: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 038: athrow
      // 039: aload 2
      // 03a: invokevirtual mew.getX ()I
      // 03d: i2d
      // 03e: aload 0
      // 03f: getfield crp.j0u Lc05;
      // 042: invokevirtual c05.nsd ()Li2h;
      // 045: getfield i2h.o2v D
      // 048: dsub
      // 049: dstore 7
      // 04b: aload 2
      // 04c: invokevirtual mew.getY ()I
      // 04f: i2d
      // 050: aload 0
      // 051: getfield crp.j0u Lc05;
      // 054: invokevirtual c05.nsd ()Li2h;
      // 057: getfield i2h.kfp D
      // 05a: dsub
      // 05b: dstore 9
      // 05d: aload 2
      // 05e: invokevirtual mew.getZ ()I
      // 061: i2d
      // 062: aload 0
      // 063: getfield crp.j0u Lc05;
      // 066: invokevirtual c05.nsd ()Li2h;
      // 069: getfield i2h.vbd D
      // 06c: dsub
      // 06d: dstore 11
      // 06f: dload 7
      // 071: dload 7
      // 073: dmul
      // 074: dload 9
      // 076: dload 9
      // 078: dmul
      // 079: dadd
      // 07a: dload 11
      // 07c: dload 11
      // 07e: dmul
      // 07f: dadd
      // 080: invokestatic java/lang/Math.sqrt (D)D
      // 083: dstore 13
      // 085: aload 0
      // 086: getfield crp.j0u Lc05;
      // 089: invokevirtual c05.nsd ()Li2h;
      // 08c: getfield i2h.o2v D
      // 08f: dstore 15
      // 091: aload 0
      // 092: getfield crp.j0u Lc05;
      // 095: invokevirtual c05.nsd ()Li2h;
      // 098: getfield i2h.kfp D
      // 09b: dstore 17
      // 09d: aload 0
      // 09e: getfield crp.j0u Lc05;
      // 0a1: invokevirtual c05.nsd ()Li2h;
      // 0a4: getfield i2h.vbd D
      // 0a7: dstore 19
      // 0a9: dload 13
      // 0ab: dconst_0
      // 0ac: dcmpl
      // 0ad: iload 6
      // 0af: ifeq 0e7
      // 0b2: ifle 0e6
      // 0b5: goto 0bc
      // 0b8: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bb: athrow
      // 0bc: dload 15
      // 0be: dload 7
      // 0c0: dload 13
      // 0c2: ddiv
      // 0c3: ldc2_w 2.0
      // 0c6: dmul
      // 0c7: dadd
      // 0c8: dstore 15
      // 0ca: dload 17
      // 0cc: dload 9
      // 0ce: dload 13
      // 0d0: ddiv
      // 0d1: ldc2_w 2.0
      // 0d4: dmul
      // 0d5: dadd
      // 0d6: dstore 17
      // 0d8: dload 19
      // 0da: dload 11
      // 0dc: dload 13
      // 0de: ddiv
      // 0df: ldc2_w 2.0
      // 0e2: dmul
      // 0e3: dadd
      // 0e4: dstore 19
      // 0e6: iload 1
      // 0e7: sipush 1013
      // 0ea: if_icmpne 118
      // 0ed: aload 0
      // 0ee: getfield crp.t6z Lkh3;
      // 0f1: dload 15
      // 0f3: dload 17
      // 0f5: dload 19
      // 0f7: sipush 2601
      // 0fa: ldc2_w 4237145979734948840
      // 0fd: lload 4
      // 0ff: lxor
      // 100: invokedynamic j (IJ)Ljava/lang/String; bsm=crp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: nop
      // 106: fconst_1
      // 107: fconst_1
      // 108: bipush 0
      // 109: invokevirtual kh3.wd_ (DDDLjava/lang/String;FFZ)V
      // 10c: iload 6
      // 10e: ifne 140
      // 111: goto 118
      // 114: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 117: athrow
      // 118: aload 0
      // 119: getfield crp.t6z Lkh3;
      // 11c: dload 15
      // 11e: dload 17
      // 120: dload 19
      // 122: sipush 4425
      // 125: ldc2_w 468992971460501669
      // 128: lload 4
      // 12a: lxor
      // 12b: invokedynamic j (IJ)Ljava/lang/String; bsm=crp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 130: nop
      // 131: ldc 5.0
      // 133: nop
      // 134: fconst_1
      // 135: bipush 0
      // 136: invokevirtual kh3.wd_ (DDDLjava/lang/String;FFZ)V
      // 139: goto 140
      // 13c: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13f: athrow
      // 140: return
   }

   @Override
   public void ifl(ha9 param1, int param2, mew param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic crp.a J
      // 003: ldc2_w 54766180485709
      // 006: lxor
      // 007: lstore 5
      // 009: invokestatic t9d.b ()I
      // 00c: istore 7
      // 00e: aload 0
      // 00f: getfield crp.t6z Lkh3;
      // 012: getfield kh3.fsy Ljava/util/Random;
      // 015: astore 8
      // 017: iload 7
      // 019: ifeq 11d
      // 01c: iload 2
      // 01d: lookupswitch 2588 26 1000 223 1001 261 1002 301 1003 341 1004 396 1005 454 1006 558 1007 613 1008 669 1009 725 1010 779 1011 833 1012 887 1014 941 1015 995 1016 1051 1017 1105 1020 1159 1021 1214 1022 1269 2000 1326 2001 1578 2002 1732 2003 2179 2004 2422 2005 2578
      // 0f8: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fb: athrow
      // 0fc: aload 0
      // 0fd: getfield crp.t6z Lkh3;
      // 100: aload 3
      // 101: sipush 20438
      // 104: ldc2_w 4196813772907665271
      // 107: lload 5
      // 109: lxor
      // 10a: invokedynamic j (IJ)Ljava/lang/String; bsm=crp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10f: nop
      // 110: fconst_1
      // 111: fconst_1
      // 112: bipush 0
      // 113: invokevirtual kh3.c9p (Lmew;Ljava/lang/String;FFZ)V
      // 116: goto 11d
      // 119: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11c: athrow
      // 11d: iload 7
      // 11f: ifne a39
      // 122: aload 0
      // 123: getfield crp.t6z Lkh3;
      // 126: aload 3
      // 127: sipush 6961
      // 12a: ldc2_w 9106621329343021974
      // 12d: lload 5
      // 12f: lxor
      // 130: invokedynamic j (IJ)Ljava/lang/String; bsm=crp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 135: nop
      // 136: fconst_1
      // 137: ldc 1.2
      // 139: nop
      // 13a: bipush 0
      // 13b: invokevirtual kh3.c9p (Lmew;Ljava/lang/String;FFZ)V
      // 13e: iload 7
      // 140: ifne a39
      // 143: goto 14a
      // 146: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 149: athrow
      // 14a: aload 0
      // 14b: getfield crp.t6z Lkh3;
      // 14e: aload 3
      // 14f: sipush 20530
      // 152: ldc2_w 624751093265680526
      // 155: lload 5
      // 157: lxor
      // 158: invokedynamic j (IJ)Ljava/lang/String; bsm=crp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15d: nop
      // 15e: fconst_1
      // 15f: ldc 1.2
      // 161: nop
      // 162: bipush 0
      // 163: invokevirtual kh3.c9p (Lmew;Ljava/lang/String;FFZ)V
      // 166: iload 7
      // 168: ifne a39
      // 16b: goto 172
      // 16e: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 171: athrow
      // 172: aload 0
      // 173: getfield crp.t6z Lkh3;
      // 176: aload 3
      // 177: sipush 26924
      // 17a: ldc2_w 8400267283894333873
      // 17d: lload 5
      // 17f: lxor
      // 180: invokedynamic j (IJ)Ljava/lang/String; bsm=crp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 185: nop
      // 186: fconst_1
      // 187: aload 0
      // 188: getfield crp.t6z Lkh3;
      // 18b: getfield kh3.fsy Ljava/util/Random;
      // 18e: invokevirtual java/util/Random.nextFloat ()F
      // 191: ldc 0.1
      // 193: nop
      // 194: fmul
      // 195: ldc 0.9
      // 197: nop
      // 198: fadd
      // 199: bipush 0
      // 19a: invokevirtual kh3.c9p (Lmew;Ljava/lang/String;FFZ)V
      // 19d: iload 7
      // 19f: ifne a39
      // 1a2: goto 1a9
      // 1a5: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a8: athrow
      // 1a9: aload 0
      // 1aa: getfield crp.t6z Lkh3;
      // 1ad: aload 3
      // 1ae: sipush 3993
      // 1b1: ldc2_w 8653299724594714408
      // 1b4: lload 5
      // 1b6: lxor
      // 1b7: invokedynamic j (IJ)Ljava/lang/String; bsm=crp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bc: nop
      // 1bd: ldc 0.5
      // 1bf: nop
      // 1c0: ldc 2.6
      // 1c2: nop
      // 1c3: aload 8
      // 1c5: invokevirtual java/util/Random.nextFloat ()F
      // 1c8: aload 8
      // 1ca: invokevirtual java/util/Random.nextFloat ()F
      // 1cd: fsub
      // 1ce: ldc 0.8
      // 1d0: nop
      // 1d1: fmul
      // 1d2: fadd
      // 1d3: bipush 0
      // 1d4: invokevirtual kh3.c9p (Lmew;Ljava/lang/String;FFZ)V
      // 1d7: iload 7
      // 1d9: ifne a39
      // 1dc: goto 1e3
      // 1df: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e2: athrow
      // 1e3: iload 4
      // 1e5: invokestatic u7m.ltr (I)Lu7m;
      // 1e8: instanceof jrs
      // 1eb: ifeq 233
      // 1ee: goto 1f5
      // 1f1: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f4: athrow
      // 1f5: aload 0
      // 1f6: getfield crp.t6z Lkh3;
      // 1f9: aload 3
      // 1fa: new java/lang/StringBuilder
      // 1fd: dup
      // 1fe: invokespecial java/lang/StringBuilder.<init> ()V
      // 201: sipush 4595
      // 204: ldc2_w 5449464581968103806
      // 207: lload 5
      // 209: lxor
      // 20a: invokedynamic j (IJ)Ljava/lang/String; bsm=crp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20f: nop
      // 210: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 213: iload 4
      // 215: invokestatic u7m.ltr (I)Lu7m;
      // 218: checkcast jrs
      // 21b: getfield jrs.q7e Ljava/lang/String;
      // 21e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 221: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 224: invokevirtual kh3.moa (Lmew;Ljava/lang/String;)V
      // 227: iload 7
      // 229: ifne a39
      // 22c: goto 233
      // 22f: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 232: athrow
      // 233: aload 0
      // 234: getfield crp.t6z Lkh3;
      // 237: aload 3
      // 238: aconst_null
      // 239: checkcast java/lang/String
      // 23c: invokevirtual kh3.moa (Lmew;Ljava/lang/String;)V
      // 23f: iload 7
      // 241: ifne a39
      // 244: goto 24b
      // 247: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24a: athrow
      // 24b: aload 0
      // 24c: getfield crp.t6z Lkh3;
      // 24f: aload 3
      // 250: sipush 3741
      // 253: ldc2_w 2404033664881628687
      // 256: lload 5
      // 258: lxor
      // 259: invokedynamic j (IJ)Ljava/lang/String; bsm=crp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25e: nop
      // 25f: fconst_1
      // 260: aload 0
      // 261: getfield crp.t6z Lkh3;
      // 264: getfield kh3.fsy Ljava/util/Random;
      // 267: invokevirtual java/util/Random.nextFloat ()F
      // 26a: ldc 0.1
      // 26c: nop
      // 26d: fmul
      // 26e: ldc 0.9
      // 270: nop
      // 271: fadd
      // 272: bipush 0
      // 273: invokevirtual kh3.c9p (Lmew;Ljava/lang/String;FFZ)V
      // 276: iload 7
      // 278: ifne a39
      // 27b: goto 282
      // 27e: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 281: athrow
      // 282: aload 0
      // 283: getfield crp.t6z Lkh3;
      // 286: aload 3
      // 287: sipush 17933
      // 28a: ldc2_w 3068644343871069837
      // 28d: lload 5
      // 28f: lxor
      // 290: invokedynamic j (IJ)Ljava/lang/String; bsm=crp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 295: nop
      // 296: ldc 10.0
      // 298: nop
      // 299: aload 8
      // 29b: invokevirtual java/util/Random.nextFloat ()F
      // 29e: aload 8
      // 2a0: invokevirtual java/util/Random.nextFloat ()F
      // 2a3: fsub
      // 2a4: ldc 0.2
      // 2a6: nop
      // 2a7: fmul
      // 2a8: fconst_1
      // 2a9: fadd
      // 2aa: bipush 0
      // 2ab: invokevirtual kh3.c9p (Lmew;Ljava/lang/String;FFZ)V
      // 2ae: iload 7
      // 2b0: ifne a39
      // 2b3: goto 2ba
      // 2b6: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b9: athrow
      // 2ba: aload 0
      // 2bb: getfield crp.t6z Lkh3;
      // 2be: aload 3
      // 2bf: sipush 11058
      // 2c2: ldc2_w 7497224985772307358
      // 2c5: lload 5
      // 2c7: lxor
      // 2c8: invokedynamic j (IJ)Ljava/lang/String; bsm=crp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2cd: nop
      // 2ce: ldc 10.0
      // 2d0: nop
      // 2d1: aload 8
      // 2d3: invokevirtual java/util/Random.nextFloat ()F
      // 2d6: aload 8
      // 2d8: invokevirtual java/util/Random.nextFloat ()F
      // 2db: fsub
      // 2dc: ldc 0.2
      // 2de: nop
      // 2df: fmul
      // 2e0: fconst_1
      // 2e1: fadd
      // 2e2: bipush 0
      // 2e3: invokevirtual kh3.c9p (Lmew;Ljava/lang/String;FFZ)V
      // 2e6: iload 7
      // 2e8: ifne a39
      // 2eb: goto 2f2
      // 2ee: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f1: athrow
      // 2f2: aload 0
      // 2f3: getfield crp.t6z Lkh3;
      // 2f6: aload 3
      // 2f7: sipush 24855
      // 2fa: ldc2_w 8328579337395927477
      // 2fd: lload 5
      // 2ff: lxor
      // 300: invokedynamic j (IJ)Ljava/lang/String; bsm=crp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 305: nop
      // 306: fconst_2
      // 307: aload 8
      // 309: invokevirtual java/util/Random.nextFloat ()F
      // 30c: aload 8
      // 30e: invokevirtual java/util/Random.nextFloat ()F
      // 311: fsub
      // 312: ldc 0.2
      // 314: nop
      // 315: fmul
      // 316: fconst_1
      // 317: fadd
      // 318: bipush 0
      // 319: invokevirtual kh3.c9p (Lmew;Ljava/lang/String;FFZ)V
      // 31c: iload 7
      // 31e: ifne a39
      // 321: goto 328
      // 324: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 327: athrow
      // 328: aload 0
      // 329: getfield crp.t6z Lkh3;
      // 32c: aload 3
      // 32d: sipush 7496
      // 330: ldc2_w 3604431228983608785
      // 333: lload 5
      // 335: lxor
      // 336: invokedynamic j (IJ)Ljava/lang/String; bsm=crp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33b: nop
      // 33c: fconst_2
      // 33d: aload 8
      // 33f: invokevirtual java/util/Random.nextFloat ()F
      // 342: aload 8
      // 344: invokevirtual java/util/Random.nextFloat ()F
      // 347: fsub
      // 348: ldc 0.2
      // 34a: nop
      // 34b: fmul
      // 34c: fconst_1
      // 34d: fadd
      // 34e: bipush 0
      // 34f: invokevirtual kh3.c9p (Lmew;Ljava/lang/String;FFZ)V
      // 352: iload 7
      // 354: ifne a39
      // 357: goto 35e
      // 35a: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 35d: athrow
      // 35e: aload 0
      // 35f: getfield crp.t6z Lkh3;
      // 362: aload 3
      // 363: sipush 25518
      // 366: ldc2_w 5113090666648435510
      // 369: lload 5
      // 36b: lxor
      // 36c: invokedynamic j (IJ)Ljava/lang/String; bsm=crp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 371: nop
      // 372: fconst_2
      // 373: aload 8
      // 375: invokevirtual java/util/Random.nextFloat ()F
      // 378: aload 8
      // 37a: invokevirtual java/util/Random.nextFloat ()F
      // 37d: fsub
      // 37e: ldc 0.2
      // 380: nop
      // 381: fmul
      // 382: fconst_1
      // 383: fadd
      // 384: bipush 0
      // 385: invokevirtual kh3.c9p (Lmew;Ljava/lang/String;FFZ)V
      // 388: iload 7
      // 38a: ifne a39
      // 38d: goto 394
      // 390: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 393: athrow
      // 394: aload 0
      // 395: getfield crp.t6z Lkh3;
      // 398: aload 3
      // 399: sipush 21371
      // 39c: ldc2_w 2875529612559567868
      // 39f: lload 5
      // 3a1: lxor
      // 3a2: invokedynamic j (IJ)Ljava/lang/String; bsm=crp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a7: nop
      // 3a8: fconst_2
      // 3a9: aload 8
      // 3ab: invokevirtual java/util/Random.nextFloat ()F
      // 3ae: aload 8
      // 3b0: invokevirtual java/util/Random.nextFloat ()F
      // 3b3: fsub
      // 3b4: ldc 0.2
      // 3b6: nop
      // 3b7: fmul
      // 3b8: fconst_1
      // 3b9: fadd
      // 3ba: bipush 0
      // 3bb: invokevirtual kh3.c9p (Lmew;Ljava/lang/String;FFZ)V
      // 3be: iload 7
      // 3c0: ifne a39
      // 3c3: goto 3ca
      // 3c6: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c9: athrow
      // 3ca: aload 0
      // 3cb: getfield crp.t6z Lkh3;
      // 3ce: aload 3
      // 3cf: sipush 3720
      // 3d2: ldc2_w 4592402778752783922
      // 3d5: lload 5
      // 3d7: lxor
      // 3d8: invokedynamic j (IJ)Ljava/lang/String; bsm=crp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3dd: nop
      // 3de: fconst_2
      // 3df: aload 8
      // 3e1: invokevirtual java/util/Random.nextFloat ()F
      // 3e4: aload 8
      // 3e6: invokevirtual java/util/Random.nextFloat ()F
      // 3e9: fsub
      // 3ea: ldc 0.2
      // 3ec: nop
      // 3ed: fmul
      // 3ee: fconst_1
      // 3ef: fadd
      // 3f0: bipush 0
      // 3f1: invokevirtual kh3.c9p (Lmew;Ljava/lang/String;FFZ)V
      // 3f4: iload 7
      // 3f6: ifne a39
      // 3f9: goto 400
      // 3fc: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3ff: athrow
      // 400: aload 0
      // 401: getfield crp.t6z Lkh3;
      // 404: aload 3
      // 405: sipush 20951
      // 408: ldc2_w 5495209165262899528
      // 40b: lload 5
      // 40d: lxor
      // 40e: invokedynamic j (IJ)Ljava/lang/String; bsm=crp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 413: nop
      // 414: ldc 0.05
      // 416: nop
      // 417: aload 8
      // 419: invokevirtual java/util/Random.nextFloat ()F
      // 41c: aload 8
      // 41e: invokevirtual java/util/Random.nextFloat ()F
      // 421: fsub
      // 422: ldc 0.2
      // 424: nop
      // 425: fmul
      // 426: fconst_1
      // 427: fadd
      // 428: bipush 0
      // 429: invokevirtual kh3.c9p (Lmew;Ljava/lang/String;FFZ)V
      // 42c: iload 7
      // 42e: ifne a39
      // 431: goto 438
      // 434: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 437: athrow
      // 438: aload 0
      // 439: getfield crp.t6z Lkh3;
      // 43c: aload 3
      // 43d: sipush 9780
      // 440: ldc2_w 5399752959119474310
      // 443: lload 5
      // 445: lxor
      // 446: invokedynamic j (IJ)Ljava/lang/String; bsm=crp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44b: nop
      // 44c: fconst_2
      // 44d: aload 8
      // 44f: invokevirtual java/util/Random.nextFloat ()F
      // 452: aload 8
      // 454: invokevirtual java/util/Random.nextFloat ()F
      // 457: fsub
      // 458: ldc 0.2
      // 45a: nop
      // 45b: fmul
      // 45c: fconst_1
      // 45d: fadd
      // 45e: bipush 0
      // 45f: invokevirtual kh3.c9p (Lmew;Ljava/lang/String;FFZ)V
      // 462: iload 7
      // 464: ifne a39
      // 467: goto 46e
      // 46a: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 46d: athrow
      // 46e: aload 0
      // 46f: getfield crp.t6z Lkh3;
      // 472: aload 3
      // 473: sipush 14289
      // 476: ldc2_w 1512771037157240700
      // 479: lload 5
      // 47b: lxor
      // 47c: invokedynamic j (IJ)Ljava/lang/String; bsm=crp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 481: nop
      // 482: fconst_2
      // 483: aload 8
      // 485: invokevirtual java/util/Random.nextFloat ()F
      // 488: aload 8
      // 48a: invokevirtual java/util/Random.nextFloat ()F
      // 48d: fsub
      // 48e: ldc 0.2
      // 490: nop
      // 491: fmul
      // 492: fconst_1
      // 493: fadd
      // 494: bipush 0
      // 495: invokevirtual kh3.c9p (Lmew;Ljava/lang/String;FFZ)V
      // 498: iload 7
      // 49a: ifne a39
      // 49d: goto 4a4
      // 4a0: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a3: athrow
      // 4a4: aload 0
      // 4a5: getfield crp.t6z Lkh3;
      // 4a8: aload 3
      // 4a9: sipush 23531
      // 4ac: ldc2_w 63729100517819248
      // 4af: lload 5
      // 4b1: lxor
      // 4b2: invokedynamic j (IJ)Ljava/lang/String; bsm=crp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b7: nop
      // 4b8: fconst_1
      // 4b9: aload 0
      // 4ba: getfield crp.t6z Lkh3;
      // 4bd: getfield kh3.fsy Ljava/util/Random;
      // 4c0: invokevirtual java/util/Random.nextFloat ()F
      // 4c3: ldc 0.1
      // 4c5: nop
      // 4c6: fmul
      // 4c7: ldc 0.9
      // 4c9: nop
      // 4ca: fadd
      // 4cb: bipush 0
      // 4cc: invokevirtual kh3.c9p (Lmew;Ljava/lang/String;FFZ)V
      // 4cf: iload 7
      // 4d1: ifne a39
      // 4d4: goto 4db
      // 4d7: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4da: athrow
      // 4db: aload 0
      // 4dc: getfield crp.t6z Lkh3;
      // 4df: aload 3
      // 4e0: sipush 20321
      // 4e3: ldc2_w 2051722908210976739
      // 4e6: lload 5
      // 4e8: lxor
      // 4e9: invokedynamic j (IJ)Ljava/lang/String; bsm=crp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ee: nop
      // 4ef: fconst_1
      // 4f0: aload 0
      // 4f1: getfield crp.t6z Lkh3;
      // 4f4: getfield kh3.fsy Ljava/util/Random;
      // 4f7: invokevirtual java/util/Random.nextFloat ()F
      // 4fa: ldc 0.1
      // 4fc: nop
      // 4fd: fmul
      // 4fe: ldc 0.9
      // 500: nop
      // 501: fadd
      // 502: bipush 0
      // 503: invokevirtual kh3.c9p (Lmew;Ljava/lang/String;FFZ)V
      // 506: iload 7
      // 508: ifne a39
      // 50b: goto 512
      // 50e: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 511: athrow
      // 512: aload 0
      // 513: getfield crp.t6z Lkh3;
      // 516: aload 3
      // 517: sipush 31459
      // 51a: ldc2_w 8536363541424956016
      // 51d: lload 5
      // 51f: lxor
      // 520: invokedynamic j (IJ)Ljava/lang/String; bsm=crp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 525: nop
      // 526: ldc 0.3
      // 528: nop
      // 529: aload 0
      // 52a: getfield crp.t6z Lkh3;
      // 52d: getfield kh3.fsy Ljava/util/Random;
      // 530: invokevirtual java/util/Random.nextFloat ()F
      // 533: ldc 0.1
      // 535: nop
      // 536: fmul
      // 537: ldc 0.9
      // 539: nop
      // 53a: fadd
      // 53b: bipush 0
      // 53c: invokevirtual kh3.c9p (Lmew;Ljava/lang/String;FFZ)V
      // 53f: iload 7
      // 541: ifne a39
      // 544: goto 54b
      // 547: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 54a: athrow
      // 54b: iload 4
      // 54d: bipush 3
      // 54e: irem
      // 54f: bipush 1
      // 550: isub
      // 551: istore 9
      // 553: iload 4
      // 555: bipush 3
      // 556: idiv
      // 557: bipush 3
      // 558: irem
      // 559: bipush 1
      // 55a: isub
      // 55b: istore 10
      // 55d: aload 3
      // 55e: invokevirtual mew.getX ()I
      // 561: i2d
      // 562: iload 9
      // 564: i2d
      // 565: ldc2_w 0.6
      // 568: dmul
      // 569: dadd
      // 56a: ldc2_w 0.5
      // 56d: dadd
      // 56e: dstore 11
      // 570: aload 3
      // 571: invokevirtual mew.getY ()I
      // 574: i2d
      // 575: ldc2_w 0.5
      // 578: dadd
      // 579: dstore 13
      // 57b: aload 3
      // 57c: invokevirtual mew.getZ ()I
      // 57f: i2d
      // 580: iload 10
      // 582: i2d
      // 583: ldc2_w 0.6
      // 586: dmul
      // 587: dadd
      // 588: ldc2_w 0.5
      // 58b: dadd
      // 58c: dstore 15
      // 58e: bipush 0
      // 58f: istore 17
      // 591: iload 17
      // 593: bipush 10
      // 595: if_icmpge 646
      // 598: aload 8
      // 59a: invokevirtual java/util/Random.nextDouble ()D
      // 59d: ldc2_w 0.2
      // 5a0: dmul
      // 5a1: ldc2_w 0.01
      // 5a4: dadd
      // 5a5: dstore 18
      // 5a7: dload 11
      // 5a9: iload 9
      // 5ab: i2d
      // 5ac: ldc2_w 0.01
      // 5af: dmul
      // 5b0: dadd
      // 5b1: aload 8
      // 5b3: invokevirtual java/util/Random.nextDouble ()D
      // 5b6: ldc2_w 0.5
      // 5b9: dsub
      // 5ba: iload 10
      // 5bc: i2d
      // 5bd: dmul
      // 5be: ldc2_w 0.5
      // 5c1: dmul
      // 5c2: dadd
      // 5c3: dstore 20
      // 5c5: dload 13
      // 5c7: aload 8
      // 5c9: invokevirtual java/util/Random.nextDouble ()D
      // 5cc: ldc2_w 0.5
      // 5cf: dsub
      // 5d0: ldc2_w 0.5
      // 5d3: dmul
      // 5d4: dadd
      // 5d5: dstore 22
      // 5d7: dload 15
      // 5d9: iload 10
      // 5db: i2d
      // 5dc: ldc2_w 0.01
      // 5df: dmul
      // 5e0: dadd
      // 5e1: aload 8
      // 5e3: invokevirtual java/util/Random.nextDouble ()D
      // 5e6: ldc2_w 0.5
      // 5e9: dsub
      // 5ea: iload 9
      // 5ec: i2d
      // 5ed: dmul
      // 5ee: ldc2_w 0.5
      // 5f1: dmul
      // 5f2: dadd
      // 5f3: dstore 24
      // 5f5: iload 9
      // 5f7: i2d
      // 5f8: dload 18
      // 5fa: dmul
      // 5fb: aload 8
      // 5fd: invokevirtual java/util/Random.nextGaussian ()D
      // 600: ldc2_w 0.01
      // 603: dmul
      // 604: dadd
      // 605: dstore 26
      // 607: ldc2_w -0.03
      // 60a: aload 8
      // 60c: invokevirtual java/util/Random.nextGaussian ()D
      // 60f: ldc2_w 0.01
      // 612: dmul
      // 613: dadd
      // 614: dstore 28
      // 616: iload 10
      // 618: i2d
      // 619: dload 18
      // 61b: dmul
      // 61c: aload 8
      // 61e: invokevirtual java/util/Random.nextGaussian ()D
      // 621: ldc2_w 0.01
      // 624: dmul
      // 625: dadd
      // 626: dstore 30
      // 628: aload 0
      // 629: getstatic w_0.bac Lw_0;
      // 62c: dload 20
      // 62e: dload 22
      // 630: dload 24
      // 632: dload 26
      // 634: dload 28
      // 636: dload 30
      // 638: bipush 0
      // 639: newarray 10
      // 63b: invokespecial crp.agu (Lw_0;DDDDDD[I)V
      // 63e: iinc 17 1
      // 641: iload 7
      // 643: ifne 591
      // 646: return
      // 647: iload 4
      // 649: sipush 4095
      // 64c: iand
      // 64d: invokestatic e0x.csc (I)Le0x;
      // 650: astore 17
      // 652: iload 7
      // 654: ifeq 6dc
      // 657: aload 17
      // 659: invokevirtual e0x.p1r ()Lp3y;
      // 65c: getstatic p3y.cei Lp3y;
      // 65f: if_acmpeq 6c3
      // 662: goto 669
      // 665: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 668: athrow
      // 669: aload 0
      // 66a: getfield crp.j0u Lc05;
      // 66d: invokevirtual c05.yp9 ()Ldbu;
      // 670: new vs1
      // 673: dup
      // 674: new gdz
      // 677: dup
      // 678: aload 17
      // 67a: getfield e0x.zu6 Le0x$zvv;
      // 67d: invokevirtual e0x$zvv.l1o ()Ljava/lang/String;
      // 680: invokespecial gdz.<init> (Ljava/lang/String;)V
      // 683: aload 17
      // 685: getfield e0x.zu6 Le0x$zvv;
      // 688: invokevirtual e0x$zvv.dnt ()F
      // 68b: fconst_1
      // 68c: fadd
      // 68d: fconst_2
      // 68e: fdiv
      // 68f: aload 17
      // 691: getfield e0x.zu6 Le0x$zvv;
      // 694: invokevirtual e0x$zvv.kjj ()F
      // 697: ldc 0.8
      // 699: nop
      // 69a: fmul
      // 69b: aload 3
      // 69c: invokevirtual mew.getX ()I
      // 69f: i2f
      // 6a0: ldc 0.5
      // 6a2: nop
      // 6a3: fadd
      // 6a4: aload 3
      // 6a5: invokevirtual mew.getY ()I
      // 6a8: i2f
      // 6a9: ldc 0.5
      // 6ab: nop
      // 6ac: fadd
      // 6ad: aload 3
      // 6ae: invokevirtual mew.getZ ()I
      // 6b1: i2f
      // 6b2: ldc 0.5
      // 6b4: nop
      // 6b5: fadd
      // 6b6: invokespecial vs1.<init> (Lgdz;FFFFF)V
      // 6b9: invokevirtual dbu.mak (Ljp4;)V
      // 6bc: goto 6c3
      // 6bf: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6c2: athrow
      // 6c3: aload 0
      // 6c4: getfield crp.j0u Lc05;
      // 6c7: getfield c05.i4p Ljux;
      // 6ca: aload 3
      // 6cb: aload 17
      // 6cd: iload 4
      // 6cf: bipush 12
      // 6d1: ishr
      // 6d2: sipush 255
      // 6d5: iand
      // 6d6: invokevirtual e0x.kig (I)Lzfz;
      // 6d9: invokevirtual jux.vgi (Lmew;Lzfz;)V
      // 6dc: iload 7
      // 6de: ifne a39
      // 6e1: aload 3
      // 6e2: invokevirtual mew.getX ()I
      // 6e5: i2d
      // 6e6: dstore 18
      // 6e8: aload 3
      // 6e9: invokevirtual mew.getY ()I
      // 6ec: i2d
      // 6ed: dstore 20
      // 6ef: aload 3
      // 6f0: invokevirtual mew.getZ ()I
      // 6f3: i2d
      // 6f4: dstore 22
      // 6f6: bipush 0
      // 6f7: istore 24
      // 6f9: iload 24
      // 6fb: bipush 8
      // 6fd: if_icmpge 74d
      // 700: aload 0
      // 701: getstatic w_0.ips Lw_0;
      // 704: dload 18
      // 706: dload 20
      // 708: dload 22
      // 70a: aload 8
      // 70c: invokevirtual java/util/Random.nextGaussian ()D
      // 70f: ldc2_w 0.15
      // 712: dmul
      // 713: aload 8
      // 715: invokevirtual java/util/Random.nextDouble ()D
      // 718: ldc2_w 0.2
      // 71b: dmul
      // 71c: aload 8
      // 71e: invokevirtual java/util/Random.nextGaussian ()D
      // 721: ldc2_w 0.15
      // 724: dmul
      // 725: bipush 2
      // 726: newarray 10
      // 728: dup
      // 729: bipush 0
      // 72a: getstatic xbr.ik6 Ldgn;
      // 72d: invokestatic u7m._lo (Lu7m;)I
      // 730: iastore
      // 731: dup
      // 732: bipush 1
      // 733: iload 4
      // 735: iastore
      // 736: invokespecial crp.agu (Lw_0;DDDDDD[I)V
      // 739: iinc 24 1
      // 73c: iload 7
      // 73e: ifeq 757
      // 741: iload 7
      // 743: ifne 6f9
      // 746: goto 74d
      // 749: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 74c: athrow
      // 74d: getstatic xbr.ik6 Ldgn;
      // 750: iload 4
      // 752: invokevirtual dgn.ex2 (I)I
      // 755: istore 24
      // 757: iload 24
      // 759: bipush 16
      // 75b: ishr
      // 75c: sipush 255
      // 75f: iand
      // 760: i2f
      // 761: ldc 255.0
      // 763: nop
      // 764: fdiv
      // 765: fstore 25
      // 767: iload 24
      // 769: bipush 8
      // 76b: ishr
      // 76c: sipush 255
      // 76f: iand
      // 770: i2f
      // 771: ldc 255.0
      // 773: nop
      // 774: fdiv
      // 775: fstore 26
      // 777: iload 24
      // 779: bipush 0
      // 77a: ishr
      // 77b: sipush 255
      // 77e: iand
      // 77f: i2f
      // 780: ldc 255.0
      // 782: nop
      // 783: fdiv
      // 784: fstore 27
      // 786: getstatic w_0.ycr Lw_0;
      // 789: astore 28
      // 78b: getstatic xbr.ik6 Ldgn;
      // 78e: iload 4
      // 790: invokevirtual dgn.ou3 (I)Z
      // 793: iload 7
      // 795: ifeq 7a8
      // 798: ifeq 7a7
      // 79b: goto 7a2
      // 79e: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7a1: athrow
      // 7a2: getstatic w_0.cle Lw_0;
      // 7a5: astore 28
      // 7a7: bipush 0
      // 7a8: istore 29
      // 7aa: iload 29
      // 7ac: bipush 100
      // 7ae: if_icmpge 870
      // 7b1: aload 8
      // 7b3: invokevirtual java/util/Random.nextDouble ()D
      // 7b6: ldc2_w 4.0
      // 7b9: dmul
      // 7ba: dstore 30
      // 7bc: aload 8
      // 7be: invokevirtual java/util/Random.nextDouble ()D
      // 7c1: ldc2_w 3.141592653589793
      // 7c4: dmul
      // 7c5: ldc2_w 2.0
      // 7c8: dmul
      // 7c9: dstore 32
      // 7cb: dload 32
      // 7cd: invokestatic java/lang/Math.cos (D)D
      // 7d0: dload 30
      // 7d2: dmul
      // 7d3: dstore 34
      // 7d5: ldc2_w 0.01
      // 7d8: aload 8
      // 7da: invokevirtual java/util/Random.nextDouble ()D
      // 7dd: ldc2_w 0.5
      // 7e0: dmul
      // 7e1: dadd
      // 7e2: dstore 36
      // 7e4: dload 32
      // 7e6: invokestatic java/lang/Math.sin (D)D
      // 7e9: dload 30
      // 7eb: dmul
      // 7ec: dstore 38
      // 7ee: aload 0
      // 7ef: aload 28
      // 7f1: invokevirtual w_0.ewe ()I
      // 7f4: aload 28
      // 7f6: invokevirtual w_0._gn ()Z
      // 7f9: dload 18
      // 7fb: dload 34
      // 7fd: ldc2_w 0.1
      // 800: dmul
      // 801: dadd
      // 802: dload 20
      // 804: ldc2_w 0.3
      // 807: dadd
      // 808: dload 22
      // 80a: dload 38
      // 80c: ldc2_w 0.1
      // 80f: dmul
      // 810: dadd
      // 811: dload 34
      // 813: dload 36
      // 815: dload 38
      // 817: bipush 0
      // 818: newarray 10
      // 81a: invokespecial crp.n_v (IZDDDDDD[I)Lflo;
      // 81d: astore 40
      // 81f: iload 7
      // 821: ifeq 89b
      // 824: iload 7
      // 826: ifeq 86b
      // 829: goto 830
      // 82c: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 82f: athrow
      // 830: aload 40
      // 832: ifnull 868
      // 835: goto 83c
      // 838: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 83b: athrow
      // 83c: ldc 0.75
      // 83e: nop
      // 83f: aload 8
      // 841: invokevirtual java/util/Random.nextFloat ()F
      // 844: ldc 0.25
      // 846: nop
      // 847: fmul
      // 848: fadd
      // 849: fstore 41
      // 84b: aload 40
      // 84d: fload 25
      // 84f: fload 41
      // 851: fmul
      // 852: fload 26
      // 854: fload 41
      // 856: fmul
      // 857: fload 27
      // 859: fload 41
      // 85b: fmul
      // 85c: invokevirtual flo.mcd (FFF)V
      // 85f: aload 40
      // 861: dload 30
      // 863: d2f
      // 864: invokevirtual flo.o8j (F)Lflo;
      // 867: pop
      // 868: iinc 29 1
      // 86b: iload 7
      // 86d: ifne 7aa
      // 870: aload 0
      // 871: getfield crp.t6z Lkh3;
      // 874: aload 3
      // 875: sipush 21536
      // 878: ldc2_w 8768493047716727941
      // 87b: lload 5
      // 87d: lxor
      // 87e: invokedynamic j (IJ)Ljava/lang/String; bsm=crp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 883: nop
      // 884: fconst_1
      // 885: aload 0
      // 886: getfield crp.t6z Lkh3;
      // 889: getfield kh3.fsy Ljava/util/Random;
      // 88c: invokevirtual java/util/Random.nextFloat ()F
      // 88f: ldc 0.1
      // 891: nop
      // 892: fmul
      // 893: ldc 0.9
      // 895: nop
      // 896: fadd
      // 897: bipush 0
      // 898: invokevirtual kh3.c9p (Lmew;Ljava/lang/String;FFZ)V
      // 89b: iload 7
      // 89d: ifne a39
      // 8a0: aload 3
      // 8a1: invokevirtual mew.getX ()I
      // 8a4: i2d
      // 8a5: ldc2_w 0.5
      // 8a8: dadd
      // 8a9: dstore 29
      // 8ab: aload 3
      // 8ac: invokevirtual mew.getY ()I
      // 8af: i2d
      // 8b0: dstore 31
      // 8b2: aload 3
      // 8b3: invokevirtual mew.getZ ()I
      // 8b6: i2d
      // 8b7: ldc2_w 0.5
      // 8ba: dadd
      // 8bb: dstore 33
      // 8bd: bipush 0
      // 8be: istore 35
      // 8c0: iload 35
      // 8c2: bipush 8
      // 8c4: if_icmpge 903
      // 8c7: aload 0
      // 8c8: getstatic w_0.ips Lw_0;
      // 8cb: dload 29
      // 8cd: dload 31
      // 8cf: dload 33
      // 8d1: aload 8
      // 8d3: invokevirtual java/util/Random.nextGaussian ()D
      // 8d6: ldc2_w 0.15
      // 8d9: dmul
      // 8da: aload 8
      // 8dc: invokevirtual java/util/Random.nextDouble ()D
      // 8df: ldc2_w 0.2
      // 8e2: dmul
      // 8e3: aload 8
      // 8e5: invokevirtual java/util/Random.nextGaussian ()D
      // 8e8: ldc2_w 0.15
      // 8eb: dmul
      // 8ec: bipush 1
      // 8ed: newarray 10
      // 8ef: dup
      // 8f0: bipush 0
      // 8f1: getstatic xbr.rr5 Lu7m;
      // 8f4: invokestatic u7m._lo (Lu7m;)I
      // 8f7: iastore
      // 8f8: invokespecial crp.agu (Lw_0;DDDDDD[I)V
      // 8fb: iinc 35 1
      // 8fe: iload 7
      // 900: ifne 8c0
      // 903: dconst_0
      // 904: dstore 35
      // 906: dload 35
      // 908: ldc2_w 6.283185307179586
      // 90b: dcmpg
      // 90c: ifge 992
      // 90f: aload 0
      // 910: getstatic w_0.t9k Lw_0;
      // 913: dload 29
      // 915: dload 35
      // 917: invokestatic java/lang/Math.cos (D)D
      // 91a: ldc2_w 5.0
      // 91d: dmul
      // 91e: dadd
      // 91f: dload 31
      // 921: ldc2_w 0.4
      // 924: dsub
      // 925: dload 33
      // 927: dload 35
      // 929: invokestatic java/lang/Math.sin (D)D
      // 92c: ldc2_w 5.0
      // 92f: dmul
      // 930: dadd
      // 931: dload 35
      // 933: invokestatic java/lang/Math.cos (D)D
      // 936: ldc2_w -5.0
      // 939: dmul
      // 93a: dconst_0
      // 93b: dload 35
      // 93d: invokestatic java/lang/Math.sin (D)D
      // 940: ldc2_w -5.0
      // 943: dmul
      // 944: bipush 0
      // 945: newarray 10
      // 947: invokespecial crp.agu (Lw_0;DDDDDD[I)V
      // 94a: aload 0
      // 94b: getstatic w_0.t9k Lw_0;
      // 94e: dload 29
      // 950: dload 35
      // 952: invokestatic java/lang/Math.cos (D)D
      // 955: ldc2_w 5.0
      // 958: dmul
      // 959: dadd
      // 95a: dload 31
      // 95c: ldc2_w 0.4
      // 95f: dsub
      // 960: dload 33
      // 962: dload 35
      // 964: invokestatic java/lang/Math.sin (D)D
      // 967: ldc2_w 5.0
      // 96a: dmul
      // 96b: dadd
      // 96c: dload 35
      // 96e: invokestatic java/lang/Math.cos (D)D
      // 971: ldc2_w -7.0
      // 974: dmul
      // 975: dconst_0
      // 976: dload 35
      // 978: invokestatic java/lang/Math.sin (D)D
      // 97b: ldc2_w -7.0
      // 97e: dmul
      // 97f: bipush 0
      // 980: newarray 10
      // 982: invokespecial crp.agu (Lw_0;DDDDDD[I)V
      // 985: dload 35
      // 987: ldc2_w 0.15707963267948966
      // 98a: dadd
      // 98b: dstore 35
      // 98d: iload 7
      // 98f: ifne 906
      // 992: return
      // 993: bipush 0
      // 994: istore 35
      // 996: iload 35
      // 998: bipush 20
      // 99a: if_icmpge a2e
      // 99d: aload 3
      // 99e: invokevirtual mew.getX ()I
      // 9a1: i2d
      // 9a2: ldc2_w 0.5
      // 9a5: dadd
      // 9a6: aload 0
      // 9a7: getfield crp.t6z Lkh3;
      // 9aa: getfield kh3.fsy Ljava/util/Random;
      // 9ad: invokevirtual java/util/Random.nextFloat ()F
      // 9b0: f2d
      // 9b1: ldc2_w 0.5
      // 9b4: dsub
      // 9b5: ldc2_w 2.0
      // 9b8: dmul
      // 9b9: dadd
      // 9ba: dstore 36
      // 9bc: aload 3
      // 9bd: invokevirtual mew.getY ()I
      // 9c0: i2d
      // 9c1: ldc2_w 0.5
      // 9c4: dadd
      // 9c5: aload 0
      // 9c6: getfield crp.t6z Lkh3;
      // 9c9: getfield kh3.fsy Ljava/util/Random;
      // 9cc: invokevirtual java/util/Random.nextFloat ()F
      // 9cf: f2d
      // 9d0: ldc2_w 0.5
      // 9d3: dsub
      // 9d4: ldc2_w 2.0
      // 9d7: dmul
      // 9d8: dadd
      // 9d9: dstore 38
      // 9db: aload 3
      // 9dc: invokevirtual mew.getZ ()I
      // 9df: i2d
      // 9e0: ldc2_w 0.5
      // 9e3: dadd
      // 9e4: aload 0
      // 9e5: getfield crp.t6z Lkh3;
      // 9e8: getfield kh3.fsy Ljava/util/Random;
      // 9eb: invokevirtual java/util/Random.nextFloat ()F
      // 9ee: f2d
      // 9ef: ldc2_w 0.5
      // 9f2: dsub
      // 9f3: ldc2_w 2.0
      // 9f6: dmul
      // 9f7: dadd
      // 9f8: dstore 40
      // 9fa: aload 0
      // 9fb: getfield crp.t6z Lkh3;
      // 9fe: getstatic w_0.bac Lw_0;
      // a01: dload 36
      // a03: dload 38
      // a05: dload 40
      // a07: dconst_0
      // a08: dconst_0
      // a09: dconst_0
      // a0a: bipush 0
      // a0b: newarray 10
      // a0d: invokevirtual kh3.zvy (Lw_0;DDDDDD[I)V
      // a10: aload 0
      // a11: getfield crp.t6z Lkh3;
      // a14: getstatic w_0.jnp Lw_0;
      // a17: dload 36
      // a19: dload 38
      // a1b: dload 40
      // a1d: dconst_0
      // a1e: dconst_0
      // a1f: dconst_0
      // a20: bipush 0
      // a21: newarray 10
      // a23: invokevirtual kh3.zvy (Lw_0;DDDDDD[I)V
      // a26: iinc 35 1
      // a29: iload 7
      // a2b: ifne 996
      // a2e: return
      // a2f: aload 0
      // a30: getfield crp.t6z Lkh3;
      // a33: aload 3
      // a34: iload 4
      // a36: invokestatic pis.gig (Lt9d;Lmew;I)V
      // a39: return
   }

   @Override
   public void tag(int param1, mew param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 4
      // 05: iload 3
      // 06: iload 4
      // 08: ifne 16
      // 0b: iflt d3
      // 0e: goto 15
      // 11: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: iload 3
      // 16: bipush 10
      // 18: if_icmpge d3
      // 1b: aload 0
      // 1c: getfield crp.sz2 Ljava/util/Map;
      // 1f: iload 1
      // 20: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 23: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 28: checkcast ax_
      // 2b: astore 5
      // 2d: aload 5
      // 2f: iload 4
      // 31: ifne be
      // 34: ifnull a4
      // 37: goto 3e
      // 3a: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3d: athrow
      // 3e: aload 5
      // 40: invokevirtual ax_.q6p ()Lmew;
      // 43: iload 4
      // 45: ifne be
      // 48: goto 4f
      // 4b: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e: athrow
      // 4f: invokevirtual mew.getX ()I
      // 52: aload 2
      // 53: invokevirtual mew.getX ()I
      // 56: if_icmpne a4
      // 59: goto 60
      // 5c: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5f: athrow
      // 60: aload 5
      // 62: invokevirtual ax_.q6p ()Lmew;
      // 65: iload 4
      // 67: ifne be
      // 6a: goto 71
      // 6d: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 70: athrow
      // 71: invokevirtual mew.getY ()I
      // 74: aload 2
      // 75: invokevirtual mew.getY ()I
      // 78: if_icmpne a4
      // 7b: goto 82
      // 7e: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 81: athrow
      // 82: aload 5
      // 84: iload 4
      // 86: ifne c7
      // 89: goto 90
      // 8c: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8f: athrow
      // 90: invokevirtual ax_.q6p ()Lmew;
      // 93: invokevirtual mew.getZ ()I
      // 96: aload 2
      // 97: invokevirtual mew.getZ ()I
      // 9a: if_icmpeq bf
      // 9d: goto a4
      // a0: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a3: athrow
      // a4: new ax_
      // a7: dup
      // a8: iload 1
      // a9: aload 2
      // aa: invokespecial ax_.<init> (ILmew;)V
      // ad: astore 5
      // af: aload 0
      // b0: getfield crp.sz2 Ljava/util/Map;
      // b3: iload 1
      // b4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // b7: aload 5
      // b9: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // be: pop
      // bf: aload 5
      // c1: iload 3
      // c2: invokevirtual ax_.fhs (I)V
      // c5: aload 5
      // c7: aload 0
      // c8: getfield crp.s0f I
      // cb: invokevirtual ax_.p8t (I)V
      // ce: iload 4
      // d0: ifeq e8
      // d3: aload 0
      // d4: getfield crp.sz2 Ljava/util/Map;
      // d7: iload 1
      // d8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // db: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // e0: pop
      // e1: goto e8
      // e4: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // e7: athrow
      // e8: return
   }

   public void rdb() {
      this.jli = true;
   }

   public boolean w3m() {
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
      // 05: getfield crp.l0i Ljava/util/Set;
      // 08: invokeinterface java/util/Set.isEmpty ()Z 1
      // 0d: iload 1
      // 0e: ifne 29
      // 11: ifeq 3b
      // 14: goto 1b
      // 17: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a: athrow
      // 1b: aload 0
      // 1c: getfield crp.isn Ltbt;
      // 1f: invokevirtual tbt.vle ()Z
      // 22: goto 29
      // 25: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28: athrow
      // 29: iload 1
      // 2a: ifne 38
      // 2d: ifeq 3b
      // 30: goto 37
      // 33: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36: athrow
      // 37: bipush 1
      // 38: goto 3c
      // 3b: bipush 0
      // 3c: ireturn
   }

   public void u5e() {
      this.sae.reset();
   }

   public int ccu() {
      return this.o6x.mzt.length;
   }

   public int zpi() {
      return this.eq2.size();
   }

   public int q22() {
      return this.yoz;
   }

   public int tc4() {
      return this.obc;
   }

   public int wpv() {
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
      // 05: getfield crp.t6z Lkh3;
      // 08: iload 1
      // 09: ifeq 20
      // 0c: ifnonnull 1c
      // 0f: goto 16
      // 12: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: bipush 0
      // 17: ireturn
      // 18: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b: athrow
      // 1c: aload 0
      // 1d: getfield crp.t6z Lkh3;
      // 20: invokevirtual kh3.sj7 ()Lg6k;
      // 23: astore 2
      // 24: aload 2
      // 25: iload 1
      // 26: ifeq 3a
      // 29: ifnonnull 39
      // 2c: goto 33
      // 2f: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32: athrow
      // 33: bipush 0
      // 34: ireturn
      // 35: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 38: athrow
      // 39: aload 2
      // 3a: aload 0
      // 3b: getfield crp.ips Lg6k;
      // 3e: if_acmpeq 5b
      // 41: aload 0
      // 42: aload 2
      // 43: putfield crp.ips Lg6k;
      // 46: aload 0
      // 47: aload 2
      // 48: getstatic net/optifine/reflect/Reflector.ChunkProviderClient_chunkMapping Lnet/optifine/reflect/ReflectorField;
      // 4b: invokestatic net/optifine/reflect/Reflector.getFieldValue (Ljava/lang/Object;Lnet/optifine/reflect/ReflectorField;)Ljava/lang/Object;
      // 4e: checkcast yo9
      // 51: putfield crp.jgu Lyo9;
      // 54: goto 5b
      // 57: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5a: athrow
      // 5b: aload 0
      // 5c: getfield crp.jgu Lyo9;
      // 5f: iload 1
      // 60: ifeq 79
      // 63: ifnonnull 75
      // 66: goto 6d
      // 69: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6c: athrow
      // 6d: bipush 0
      // 6e: goto 7c
      // 71: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 74: athrow
      // 75: aload 0
      // 76: getfield crp.jgu Lyo9;
      // 79: invokevirtual yo9.iz6 ()I
      // 7c: ireturn
   }

   public int oy0() {
      return this.l0i.size();
   }

   public kqk x93(mew var1) {
      return this.o6x.bes(var1);
   }

   public kh3 t6q() {
      return this.t6z;
   }

   private void ixl() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: getstatic crp.pp5 I
      // 07: ifle 5a
      // 0a: aload 0
      // 0b: new java/util/ArrayList
      // 0e: dup
      // 0f: aload 0
      // 10: getfield crp.eq2 Ljava/util/List;
      // 13: invokeinterface java/util/List.size ()I 1
      // 18: bipush 16
      // 1a: iadd
      // 1b: invokespecial java/util/ArrayList.<init> (I)V
      // 1e: putfield crp.eq2 Ljava/util/List;
      // 21: aload 0
      // 22: new java/util/ArrayList
      // 25: dup
      // 26: aload 0
      // 27: getfield crp.fo5 Ljava/util/List;
      // 2a: invokeinterface java/util/List.size ()I 1
      // 2f: bipush 16
      // 31: iadd
      // 32: invokespecial java/util/ArrayList.<init> (I)V
      // 35: putfield crp.fo5 Ljava/util/List;
      // 38: aload 0
      // 39: new java/util/ArrayList
      // 3c: dup
      // 3d: aload 0
      // 3e: getfield crp.ea4 Ljava/util/List;
      // 41: invokeinterface java/util/List.size ()I 1
      // 46: bipush 16
      // 48: iadd
      // 49: invokespecial java/util/ArrayList.<init> (I)V
      // 4c: putfield crp.ea4 Ljava/util/List;
      // 4f: iload 1
      // 50: ifeq 7c
      // 53: goto 5a
      // 56: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 59: athrow
      // 5a: aload 0
      // 5b: getfield crp.eq2 Ljava/util/List;
      // 5e: invokeinterface java/util/List.clear ()V 1
      // 63: aload 0
      // 64: getfield crp.fo5 Ljava/util/List;
      // 67: invokeinterface java/util/List.clear ()V 1
      // 6c: aload 0
      // 6d: getfield crp.ea4 Ljava/util/List;
      // 70: invokeinterface java/util/List.clear ()V 1
      // 75: goto 7c
      // 78: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7b: athrow
      // 7c: return
   }

   public void guk() {
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
      // 05: iload 1
      // 06: ifeq 22
      // 09: getfield crp.f4x Z
      // 0c: ifeq 26
      // 0f: goto 16
      // 12: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: invokevirtual crp.f9n ()V
      // 1a: aload 0
      // 1b: goto 22
      // 1e: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: bipush 0
      // 23: putfield crp.f4x Z
      // 26: return
   }

   public void zgs() {
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
      // 05: getfield crp.isn Ltbt;
      // 08: iload 1
      // 09: ifeq 21
      // 0c: ifnull 24
      // 0f: goto 16
      // 12: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: getfield crp.isn Ltbt;
      // 1a: goto 21
      // 1d: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: invokevirtual tbt.o2c ()V
      // 24: return
   }

   public void eue() {
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
      // 05: getfield crp.isn Ltbt;
      // 08: iload 1
      // 09: ifeq 21
      // 0c: ifnull 24
      // 0f: goto 16
      // 12: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: getfield crp.isn Ltbt;
      // 1a: goto 21
      // 1d: invokestatic crp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: invokevirtual tbt._ot ()V
      // 24: return
   }

   public void ri6(Collection var1, Collection var2) {
      synchronized (this.h7f) {
         this.h7f.removeAll(var1);
         this.h7f.addAll(var2);
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(4009785463163921068L, 2721813367243870744L, MethodHandles.lookup().lookupClass()).a(97375504260410L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 22657549043108L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[61];
      int var5 = 0;
      String var4 = "\u0092\u0003Èl§j{\u0014B\u000fAË\u009ft{<0\\Ì\u0085æköÂ\u0000Bâ2d^\u0093ûY2=\u0087k_\u0089ëÑD¡RrDU,G\u0012ïI'=G\u0094d1\n\u007f\u007f\u009côº\u009a(àõ\u0083\u0095s\u008eõG\u0013Ãß\u000b8É\u009dª-`¾4Z5\u0004-N·\u0084q8)\u000b\u001c\u001fÓ ÿ\u0085\u001f\u0097\u008b\u00188êð!;\u008emcw\u0081zu×\u0092\u0096úÎÍ1åÌbê\u001a\u0010%ötfØµÎ×IòÍ\u0095\u0010\u009fñí\u0018\u0011\u0083\u0097l25lc\u0090Zo\u008e\u0097\u007fìÁÁO\tz\u0086RE?(¬Tä ?}ùÉ=1¢Æ\"\f\u008e\u0001\u0006ç£!\u0013Êf}²\u001e/\u0006ÕAVª×ÑÏ\u0094\u001b\u0080Y\u0080(ë\u009b¹!0¼ù\f\u007f¦\u009aó\u0081{ÕÑëÎ=\\D^C\u001f}\u001b~_P `è\u0006{YLú\u008ag\u0080(\u0016È¶0\u0090]W°®\u00996ÈÐ\u0099\u00188*\n\u0014\u0090ª*¯\t0\u007f#\u0098\u0015\u0089?Ö³ÈA \u009cC\u0019B\u0010u\u0085÷;\u0016»§òau\f\f÷\u0001mÔ\u0018\u009c»®\u0007ÜÔ\u00ad(Ï\"3\u008c4E\u0082r\u001e]Ät\u009cD¶}\u0018L\u00ad°\u0004\u00ad\u000f\u0094Ð\u008fùÊ\u0097B¥\u0090òµ^\u0094yh²¸¬\u0018ã\u0098m»R\u0088\u0000M\u0094¹®p\u0087¯ÏP©BBEPË¦A(Jwbì\u0011aøö@T÷²):\u0092|µÓ3\u0005\u0095\"òP>ÿÊ~ô\u001d\u0097:M±èRõL¦Ý(\u0092Ne:1¬©ÆuÐ\n(\u0014°þ\u000e\u0083\u000fÍùà\u000fýxoHz¥ÑëoK±Ó\u0018)`M±³(=×Á\u0001Õ[÷Tð\u001ai\u009f;{ÈÑH·\u0084\u009b\u0006@H²Ð§\u0091\u0096Ørã\u0095N\u00adxã)\u009c`\u001f\u0018\r,±\u008cÍ\u0080C*=ùØaM\u008f\u009bwX\\Ï)@-ì\u009a0h\\\u0011ÕfUð\u0096ÍUV\u0016{ñ\u0081F´^«Ò3ªGa¥\u0085\u0016gó\u008c«\u0084´E\u0014b\u0017ÂÚe5\u0012µ´C$o;(}H\u009e®\u008a,ZÎ\u0003\n\u0013Qu¿Áý\u008d½òo%Ì'Ig\u00ad\u008dØñã\u001aÚjiN§«\u000fG\u00950Æ\u0088$\u008e\u000bÐ\u008b\u0015j\u008c\u0096`\u009cå*(±2\u0097øyóaóÖ\r^R\u0019a\u008ct°åAÿá=¨¼\u0004äÙxu&A>\u0010*gåÊaK½[\u0098E·\u0010æôÔ\u0000(«M,\u008eE%%ú\u001e²Ð¿Éß.PÁHhg\u001eôç\u001dº±\u008a¢\u0010hH>\u0016!ç'4\u0082\u009b\u0090 \u0094%\u0003¿\b\u0084ûï ÊK«)¢\u0005\u0092Vê\u0093³\u001a X\u0017\fý\u0013\u009a¾\u0016PÐ({ö¸_dæ]\u001ao\u0085³\u001f TÏªY\u0094uñðvë`¥òïÂ\u0084Ë{2Z6fq\u0005.\u008dX ÐxVGë\u001f`\u000e³\u0098µ\u0013LßÎ\u008b2æÝBßdyo\u0084åÎ^\u009eW.é(í-`Ppøÿò(Ê\u0014$\u009a\u001d\"\u0015ú9\u007f )\u008bçn\u008e;yT©\u0018©NÁæU\u000f\u0099Û\u0086E\u0010V\u0098#\u000fòKD\u009f<½ g÷ \u0001Z\u0010m\u0084S_°øF¬O\u0081=)ø\u0098öÒ\u0010qAîñ\u009dë6\u009bÛÞ\u0012ûû]#\u0092 \u0096\u001f}ø'ì²co\u0092>þ¨öâ®\u0001\u0097®g¤«Â\u0010Äí)>ç\u0017\u008fV ¸´§ßô\u0091\u0019õ*\u009f½\u008b|Çµ°Qê\u000b\u001cÎ¼åw\u001at¯±´,²a\u0010[±à\u009f\u0004ª\u0019p\u009dvq#¾=sÈ\u0010NW\u0002èX¼\u008aÒê\u008a0Ì<«\u0090|(sw²\u009aA\u0094K±Ôsõâc\u0086ÑX\u0013à>\u0080p\u0083°\u0086\u0002\u0001gÅM¯¬]\u0014Ó·u¸\u00958Q(\u0016Icw\u0090ëF×°mH_S°ø-ÅË=z!\u0012Ì\u0097¦\u0080biÀr.-h\u0097@\u008c\u0086ò}R(^oÑ¹*/£¼\u0004#ß\\b²Øè¾m¶Ä%uÊ\u001e3{`%ð\u0081\u009bãÜäï\u001c\u009e°ï@ ²ìUeÕJC\u0097ÊÁxY\u0003\u0083j\u001bé\u0012³ Ë\u0095Îpkµï\u001eÃ¹JN\u0010g%+S\u0015\u001cuW>\u0012\u0086e¥?2ø\u0018Ú7T\u0090\u0003à\nùgóL;¼\\v\u0012\u009b2L¬§pØþ(»\t9à\"\"Z!\u0001ý°\u0004¨Ü£\u0097mpÔ8çõ%Ú\u007f¸\u008dµ<¸IT¯è>¾-\\Ñ\u0003(ÿ«f/3*\u001ap\u0005©Ó\u001c\u0010z\u0094óvý\u001bN¶ë:öá¸\\PºU©UzöX\u001d7E ½ \u0081L\u0082·\u008eewÒ,kðL¼\u009e\"C_íð\u0007\u0017U\ry\u0007\u009eÃã\u001cÉÉ\u0088 hí\u0091Ê¶Ã\u0017J` \u0088y\u0097Â1\u009eÊ\b\u001cÏ\u0094;&Èj\u007fàkE¶À±\u0010¥0\t\u007f\u0010ÆB\u0000¢-ô»üÌ<ª8\u0082x\\ïzû5\u0096äcó\b¯uk\u0085a4×UXjñ,Â\u0018\u0019ûå\u0003ä\u0085ÏÝÀÓ\nTgZ¨ÌI\u001c|\u008b×>ä¡^>\u001ac¿Ã8ª\u0007(\u00ad\u0006ª£ON\u0014\u0081lsV\u009a\u0096¿¯Âü\u000fÖ\u008e\u0091@y\u0014Öf[¼\u0080=ZÌ±ú\u0000lêÚw\u009bÐl]'ë)}ÄDÅã³ù\u0010Õ\u0084V!°-j:ç}Û5¯ÉêÒ(çíÝI\r\\?\u0014Ù;EÈ\u00adß\u000f?\u0018u2Gzÿ°\u001e\\\u008a\u009cáT°áZõ§\u0013(\u009a\u0017&\u009a(Û)Ê\u0084\u009b^\u008bå\u000e0\u0016â,X|\u009f\u0087õú ¥r: \u008e\u0096u¬©\u0011ÓW}$7m%\u001aßã8Õ\u0007üãÁ%Á\u0081ì?Øûá\u009fq\u008aãP#Þ\nü\u0089\u0088G\u0084Ãj\u0000É\u0001JlC®\u00134äEÏ:?D\u0006[\u001fË\u0013&O\u0085üX`ªß \u0088'õqñ!<WdtÖ(\u0013K\u009bAÂ7\u008fÃ\u001eb\\K\u0094\u001aò\u008añd¯\u001c\u0010Òès\u0097N éo'¯>òÑB¿3 Ý«iUÜU'\u009f\u0085~2\u0098ß'\u0001J|\u000bóÑ\u0007\u001cÈ<\u0011\u0096¡\"»êrÐ\u0010Â\\îf\n\u0093{üå@\u0005T·Q`\u000e0_c\u008fú±ê'\u0080Ù\u0092\u0081}Ç\u0004ãÃh\"\u009aZy)Ëêm\u0085÷Á\\Æ\n!C\u0081`&\u0014K\u000e:âG\u0087M\tÕÕ\u0002(±\rÿ.rö»ú\u0005éY dgü¼+\u0010þAÚqµû\u008a\u0005\"`\u0088xyPC\u009eÈ>%A,Þ(:=r«7Bþ´ ;4¬ÚÊÌp\u009bùw\u0083ÐøG'$ûr\u009aB\f\u0083p<À$vBÁL?0åúj\u0098\u009dÉ¼¡a\u00930\u0007Ñ¿)»@YbE!EÈÎ±\u0096r\u000fà\u001c=î\u0083ìOá|àËÆHì3©\u0003\u0085]\u0089@\u0093¥K\\I<\u0007\u0089²Õ>gEÄlµc\u001e\t\u009aì9a?å+¦j\u0081C\nn\u000eÏ÷\u007fô~\u009eê¹\u0095ôæ\u0013yÞÂ4l\u008b-£À\u0006-ï>&°\u0007WË\u0089";
      int var6 = "\u0092\u0003Èl§j{\u0014B\u000fAË\u009ft{<0\\Ì\u0085æköÂ\u0000Bâ2d^\u0093ûY2=\u0087k_\u0089ëÑD¡RrDU,G\u0012ïI'=G\u0094d1\n\u007f\u007f\u009côº\u009a(àõ\u0083\u0095s\u008eõG\u0013Ãß\u000b8É\u009dª-`¾4Z5\u0004-N·\u0084q8)\u000b\u001c\u001fÓ ÿ\u0085\u001f\u0097\u008b\u00188êð!;\u008emcw\u0081zu×\u0092\u0096úÎÍ1åÌbê\u001a\u0010%ötfØµÎ×IòÍ\u0095\u0010\u009fñí\u0018\u0011\u0083\u0097l25lc\u0090Zo\u008e\u0097\u007fìÁÁO\tz\u0086RE?(¬Tä ?}ùÉ=1¢Æ\"\f\u008e\u0001\u0006ç£!\u0013Êf}²\u001e/\u0006ÕAVª×ÑÏ\u0094\u001b\u0080Y\u0080(ë\u009b¹!0¼ù\f\u007f¦\u009aó\u0081{ÕÑëÎ=\\D^C\u001f}\u001b~_P `è\u0006{YLú\u008ag\u0080(\u0016È¶0\u0090]W°®\u00996ÈÐ\u0099\u00188*\n\u0014\u0090ª*¯\t0\u007f#\u0098\u0015\u0089?Ö³ÈA \u009cC\u0019B\u0010u\u0085÷;\u0016»§òau\f\f÷\u0001mÔ\u0018\u009c»®\u0007ÜÔ\u00ad(Ï\"3\u008c4E\u0082r\u001e]Ät\u009cD¶}\u0018L\u00ad°\u0004\u00ad\u000f\u0094Ð\u008fùÊ\u0097B¥\u0090òµ^\u0094yh²¸¬\u0018ã\u0098m»R\u0088\u0000M\u0094¹®p\u0087¯ÏP©BBEPË¦A(Jwbì\u0011aøö@T÷²):\u0092|µÓ3\u0005\u0095\"òP>ÿÊ~ô\u001d\u0097:M±èRõL¦Ý(\u0092Ne:1¬©ÆuÐ\n(\u0014°þ\u000e\u0083\u000fÍùà\u000fýxoHz¥ÑëoK±Ó\u0018)`M±³(=×Á\u0001Õ[÷Tð\u001ai\u009f;{ÈÑH·\u0084\u009b\u0006@H²Ð§\u0091\u0096Ørã\u0095N\u00adxã)\u009c`\u001f\u0018\r,±\u008cÍ\u0080C*=ùØaM\u008f\u009bwX\\Ï)@-ì\u009a0h\\\u0011ÕfUð\u0096ÍUV\u0016{ñ\u0081F´^«Ò3ªGa¥\u0085\u0016gó\u008c«\u0084´E\u0014b\u0017ÂÚe5\u0012µ´C$o;(}H\u009e®\u008a,ZÎ\u0003\n\u0013Qu¿Áý\u008d½òo%Ì'Ig\u00ad\u008dØñã\u001aÚjiN§«\u000fG\u00950Æ\u0088$\u008e\u000bÐ\u008b\u0015j\u008c\u0096`\u009cå*(±2\u0097øyóaóÖ\r^R\u0019a\u008ct°åAÿá=¨¼\u0004äÙxu&A>\u0010*gåÊaK½[\u0098E·\u0010æôÔ\u0000(«M,\u008eE%%ú\u001e²Ð¿Éß.PÁHhg\u001eôç\u001dº±\u008a¢\u0010hH>\u0016!ç'4\u0082\u009b\u0090 \u0094%\u0003¿\b\u0084ûï ÊK«)¢\u0005\u0092Vê\u0093³\u001a X\u0017\fý\u0013\u009a¾\u0016PÐ({ö¸_dæ]\u001ao\u0085³\u001f TÏªY\u0094uñðvë`¥òïÂ\u0084Ë{2Z6fq\u0005.\u008dX ÐxVGë\u001f`\u000e³\u0098µ\u0013LßÎ\u008b2æÝBßdyo\u0084åÎ^\u009eW.é(í-`Ppøÿò(Ê\u0014$\u009a\u001d\"\u0015ú9\u007f )\u008bçn\u008e;yT©\u0018©NÁæU\u000f\u0099Û\u0086E\u0010V\u0098#\u000fòKD\u009f<½ g÷ \u0001Z\u0010m\u0084S_°øF¬O\u0081=)ø\u0098öÒ\u0010qAîñ\u009dë6\u009bÛÞ\u0012ûû]#\u0092 \u0096\u001f}ø'ì²co\u0092>þ¨öâ®\u0001\u0097®g¤«Â\u0010Äí)>ç\u0017\u008fV ¸´§ßô\u0091\u0019õ*\u009f½\u008b|Çµ°Qê\u000b\u001cÎ¼åw\u001at¯±´,²a\u0010[±à\u009f\u0004ª\u0019p\u009dvq#¾=sÈ\u0010NW\u0002èX¼\u008aÒê\u008a0Ì<«\u0090|(sw²\u009aA\u0094K±Ôsõâc\u0086ÑX\u0013à>\u0080p\u0083°\u0086\u0002\u0001gÅM¯¬]\u0014Ó·u¸\u00958Q(\u0016Icw\u0090ëF×°mH_S°ø-ÅË=z!\u0012Ì\u0097¦\u0080biÀr.-h\u0097@\u008c\u0086ò}R(^oÑ¹*/£¼\u0004#ß\\b²Øè¾m¶Ä%uÊ\u001e3{`%ð\u0081\u009bãÜäï\u001c\u009e°ï@ ²ìUeÕJC\u0097ÊÁxY\u0003\u0083j\u001bé\u0012³ Ë\u0095Îpkµï\u001eÃ¹JN\u0010g%+S\u0015\u001cuW>\u0012\u0086e¥?2ø\u0018Ú7T\u0090\u0003à\nùgóL;¼\\v\u0012\u009b2L¬§pØþ(»\t9à\"\"Z!\u0001ý°\u0004¨Ü£\u0097mpÔ8çõ%Ú\u007f¸\u008dµ<¸IT¯è>¾-\\Ñ\u0003(ÿ«f/3*\u001ap\u0005©Ó\u001c\u0010z\u0094óvý\u001bN¶ë:öá¸\\PºU©UzöX\u001d7E ½ \u0081L\u0082·\u008eewÒ,kðL¼\u009e\"C_íð\u0007\u0017U\ry\u0007\u009eÃã\u001cÉÉ\u0088 hí\u0091Ê¶Ã\u0017J` \u0088y\u0097Â1\u009eÊ\b\u001cÏ\u0094;&Èj\u007fàkE¶À±\u0010¥0\t\u007f\u0010ÆB\u0000¢-ô»üÌ<ª8\u0082x\\ïzû5\u0096äcó\b¯uk\u0085a4×UXjñ,Â\u0018\u0019ûå\u0003ä\u0085ÏÝÀÓ\nTgZ¨ÌI\u001c|\u008b×>ä¡^>\u001ac¿Ã8ª\u0007(\u00ad\u0006ª£ON\u0014\u0081lsV\u009a\u0096¿¯Âü\u000fÖ\u008e\u0091@y\u0014Öf[¼\u0080=ZÌ±ú\u0000lêÚw\u009bÐl]'ë)}ÄDÅã³ù\u0010Õ\u0084V!°-j:ç}Û5¯ÉêÒ(çíÝI\r\\?\u0014Ù;EÈ\u00adß\u000f?\u0018u2Gzÿ°\u001e\\\u008a\u009cáT°áZõ§\u0013(\u009a\u0017&\u009a(Û)Ê\u0084\u009b^\u008bå\u000e0\u0016â,X|\u009f\u0087õú ¥r: \u008e\u0096u¬©\u0011ÓW}$7m%\u001aßã8Õ\u0007üãÁ%Á\u0081ì?Øûá\u009fq\u008aãP#Þ\nü\u0089\u0088G\u0084Ãj\u0000É\u0001JlC®\u00134äEÏ:?D\u0006[\u001fË\u0013&O\u0085üX`ªß \u0088'õqñ!<WdtÖ(\u0013K\u009bAÂ7\u008fÃ\u001eb\\K\u0094\u001aò\u008añd¯\u001c\u0010Òès\u0097N éo'¯>òÑB¿3 Ý«iUÜU'\u009f\u0085~2\u0098ß'\u0001J|\u000bóÑ\u0007\u001cÈ<\u0011\u0096¡\"»êrÐ\u0010Â\\îf\n\u0093{üå@\u0005T·Q`\u000e0_c\u008fú±ê'\u0080Ù\u0092\u0081}Ç\u0004ãÃh\"\u009aZy)Ëêm\u0085÷Á\\Æ\n!C\u0081`&\u0014K\u000e:âG\u0087M\tÕÕ\u0002(±\rÿ.rö»ú\u0005éY dgü¼+\u0010þAÚqµû\u008a\u0005\"`\u0088xyPC\u009eÈ>%A,Þ(:=r«7Bþ´ ;4¬ÚÊÌp\u009bùw\u0083ÐøG'$ûr\u009aB\f\u0083p<À$vBÁL?0åúj\u0098\u009dÉ¼¡a\u00930\u0007Ñ¿)»@YbE!EÈÎ±\u0096r\u000fà\u001c=î\u0083ìOá|àËÆHì3©\u0003\u0085]\u0089@\u0093¥K\\I<\u0007\u0089²Õ>gEÄlµc\u001e\t\u009aì9a?å+¦j\u0081C\nn\u000eÏ÷\u007fô~\u009eê¹\u0095ôæ\u0013yÞÂ4l\u008b-£À\u0006-ï>&°\u0007WË\u0089"
         .length();
      char var3 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     b = var7;
                     c = new String[61];
                     h7c = LogManager.getLogger();
                     zbm = new gdz(a<"j">(23366, 6156436209004907521L ^ var9));
                     jnk = new gdz(a<"j">(13232, 2749163778414535933L ^ var9));
                     fda = new gdz(a<"j">(24805, 8430560245304833928L ^ var9));
                     kr7 = new gdz(a<"j">(24445, 3441770236636432443L ^ var9));
                     s2a = new gdz(a<"j">(22349, 2856051921312317468L ^ var9));
                     mgk = Collections.unmodifiableSet(new HashSet<>(Arrays.asList(vt2.vbu)));
                     pp5 = 0;
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

                  var4 = "»\u0086´\u0005Â§KÎ¸¨\u009bq9\u0082\u0013f./Á°\u008cA¼Î fß\u0018jLÙ¶-@B\u00ad\u0089\u0019\u00887\f·¤H6\u000b+îªÙ\nñú \u0097àv\u000e\u0087ß|ü\u0089µ \u0081\u0082H\u0006\u0085\u0086\u0018K\u001d§=ÙÑÅÈ5\tg\u0000\u0014º\u0083ôX¼ûbmôÇ\u0014%";
                  var6 = "»\u0086´\u0005Â§KÎ¸¨\u009bq9\u0082\u0013f./Á°\u008cA¼Î fß\u0018jLÙ¶-@B\u00ad\u0089\u0019\u00887\f·¤H6\u000b+îªÙ\nñú \u0097àv\u000e\u0087ß|ü\u0089µ \u0081\u0082H\u0006\u0085\u0086\u0018K\u001d§=ÙÑÅÈ5\tg\u0000\u0014º\u0083ôX¼ûbmôÇ\u0014%"
                     .length();
                  var3 = '@';
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 12580;
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
            throw new RuntimeException("crp", var10);
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
         throw new RuntimeException("crp" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
