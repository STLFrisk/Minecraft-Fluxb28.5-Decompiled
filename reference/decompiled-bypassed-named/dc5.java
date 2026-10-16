import com.google.common.collect.Sets;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class dc5 extends ik0 {
   private static final Logger pmy;
   private final vr1 aux;
   private final File oum;
   private final Set ufg = Sets.newHashSet();
   private int u4x = -300;
   private boolean l26 = false;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public dc5(vr1 var1, File var2) {
      this.aux = var1;
      this.oum = var2;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void r_t() {
      long var1 = a ^ 69734416327505L;
      int var3 = OpaquePredicate.c();

      IOException var12;
      label47: {
         label35: {
            label34: {
               try {
                  var10000 = this;
                  if (var3 != 0) {
                     break label34;
                  }

                  if (!this.oum.isFile()) {
                     return;
                  }
               } catch (IOException var9) {
                  throw a(var9);
               }

               try {
                  this.q48.clear();
                  var10000 = this;
               } catch (IOException var7) {
                  var12 = var7;
                  boolean var13 = false;
                  break label47;
               } catch (JsonParseException var8) {
                  var11 = var8;
                  boolean var10001 = false;
                  break label35;
               }
            }

            try {
               var10000.q48.putAll(this.uek(FileUtils.readFileToString(this.oum)));
               return;
            } catch (IOException var5) {
               var12 = var5;
               boolean var15 = false;
               break label47;
            } catch (JsonParseException var6) {
               var11 = var6;
               boolean var14 = false;
            }
         }

         JsonParseException var4 = var11;
         pmy.error(a<"m">(32294, 3689145795137856346L ^ var1) + this.oum, var4);
         return;
      }

      IOException var10 = var12;
      pmy.error(a<"m">(30370, 7644111683560270810L ^ var1) + this.oum, var10);
   }

   public void oce() {
      long var1 = a ^ 125407450142215L;

      try {
         FileUtils.writeStringToFile(this.oum, ip9(this.q48));
      } catch (IOException var4) {
         pmy.error(a<"m">(8031, 4218262644479145854L ^ var1), var4);
      }
   }

   @Override
   public void xzh(ha9 param1, _ss param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic dc5.a J
      // 003: ldc2_w 17487283923750
      // 006: lxor
      // 007: lstore 4
      // 009: invokestatic OpaquePredicate.c ()I
      // 00c: istore 6
      // 00e: aload 2
      // 00f: invokevirtual _ss.koi ()Z
      // 012: iload 6
      // 014: ifne 02d
      // 017: ifeq 030
      // 01a: goto 021
      // 01d: invokestatic dc5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 020: athrow
      // 021: aload 0
      // 022: aload 2
      // 023: invokevirtual dc5.zgq (L_ss;)I
      // 026: goto 02d
      // 029: invokestatic dc5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02c: athrow
      // 02d: goto 031
      // 030: bipush 0
      // 031: istore 7
      // 033: aload 0
      // 034: aload 1
      // 035: aload 2
      // 036: iload 3
      // 037: invokespecial ik0.xzh (Lha9;L_ss;I)V
      // 03a: aload 0
      // 03b: getfield dc5.ufg Ljava/util/Set;
      // 03e: aload 2
      // 03f: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 044: pop
      // 045: aload 2
      // 046: invokevirtual _ss.koi ()Z
      // 049: iload 6
      // 04b: ifne 0e6
      // 04e: ifeq 0e2
      // 051: goto 058
      // 054: invokestatic dc5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 057: athrow
      // 058: iload 7
      // 05a: iload 6
      // 05c: ifne 0e6
      // 05f: goto 066
      // 062: invokestatic dc5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 065: athrow
      // 066: ifne 0e2
      // 069: goto 070
      // 06c: invokestatic dc5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06f: athrow
      // 070: iload 3
      // 071: iload 6
      // 073: ifne 0e6
      // 076: goto 07d
      // 079: invokestatic dc5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07c: athrow
      // 07d: ifle 0e2
      // 080: goto 087
      // 083: invokestatic dc5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 086: athrow
      // 087: aload 0
      // 088: bipush 1
      // 089: putfield dc5.l26 Z
      // 08c: aload 0
      // 08d: getfield dc5.aux Lvr1;
      // 090: invokevirtual vr1.akt ()Z
      // 093: iload 6
      // 095: ifne 0e6
      // 098: goto 09f
      // 09b: invokestatic dc5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09e: athrow
      // 09f: ifeq 0e2
      // 0a2: goto 0a9
      // 0a5: invokestatic dc5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a8: athrow
      // 0a9: aload 0
      // 0aa: getfield dc5.aux Lvr1;
      // 0ad: invokevirtual vr1.wh3 ()Lwlx;
      // 0b0: new hsu
      // 0b3: dup
      // 0b4: sipush 29656
      // 0b7: ldc2_w 2575612454136211162
      // 0ba: lload 4
      // 0bc: lxor
      // 0bd: invokedynamic m (IJ)Ljava/lang/String; bsm=dc5.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c2: nop
      // 0c3: bipush 2
      // 0c4: anewarray 147
      // 0c7: dup
      // 0c8: bipush 0
      // 0c9: aload 1
      // 0ca: invokevirtual ha9.xyw ()Lekw;
      // 0cd: aastore
      // 0ce: dup
      // 0cf: bipush 1
      // 0d0: aload 2
      // 0d1: invokevirtual _ss.zv4 ()Lekw;
      // 0d4: aastore
      // 0d5: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 0d8: invokevirtual wlx.d3z (Lekw;)V
      // 0db: goto 0e2
      // 0de: invokestatic dc5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e1: athrow
      // 0e2: aload 2
      // 0e3: invokevirtual _ss.koi ()Z
      // 0e6: iload 6
      // 0e8: ifne 0f7
      // 0eb: ifeq 171
      // 0ee: goto 0f5
      // 0f1: invokestatic dc5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f4: athrow
      // 0f5: iload 7
      // 0f7: iload 6
      // 0f9: ifne 107
      // 0fc: ifle 171
      // 0ff: goto 106
      // 102: invokestatic dc5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 105: athrow
      // 106: iload 3
      // 107: iload 6
      // 109: ifne 135
      // 10c: ifne 171
      // 10f: goto 116
      // 112: invokestatic dc5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 115: athrow
      // 116: aload 0
      // 117: bipush 1
      // 118: putfield dc5.l26 Z
      // 11b: aload 0
      // 11c: getfield dc5.aux Lvr1;
      // 11f: iload 6
      // 121: ifne 143
      // 124: goto 12b
      // 127: invokestatic dc5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12a: athrow
      // 12b: invokevirtual vr1.akt ()Z
      // 12e: goto 135
      // 131: invokestatic dc5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 134: athrow
      // 135: ifeq 171
      // 138: aload 0
      // 139: getfield dc5.aux Lvr1;
      // 13c: goto 143
      // 13f: invokestatic dc5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 142: athrow
      // 143: invokevirtual vr1.wh3 ()Lwlx;
      // 146: new hsu
      // 149: dup
      // 14a: sipush 32413
      // 14d: ldc2_w 1065212633640528793
      // 150: lload 4
      // 152: lxor
      // 153: invokedynamic m (IJ)Ljava/lang/String; bsm=dc5.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 158: nop
      // 159: bipush 2
      // 15a: anewarray 147
      // 15d: dup
      // 15e: bipush 0
      // 15f: aload 1
      // 160: invokevirtual ha9.xyw ()Lekw;
      // 163: aastore
      // 164: dup
      // 165: bipush 1
      // 166: aload 2
      // 167: invokevirtual _ss.zv4 ()Lekw;
      // 16a: aastore
      // 16b: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 16e: invokevirtual wlx.d3z (Lekw;)V
      // 171: return
   }

   public Set twl() {
      HashSet var1 = Sets.newHashSet(this.ufg);
      this.ufg.clear();
      this.l26 = false;
      return var1;
   }

   public Map uek(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic dc5.a J
      // 003: ldc2_w 42499207847020
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 4
      // 00d: new com/google/gson/JsonParser
      // 010: dup
      // 011: invokespecial com/google/gson/JsonParser.<init> ()V
      // 014: aload 1
      // 015: invokevirtual com/google/gson/JsonParser.parse (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 018: astore 5
      // 01a: aload 5
      // 01c: iload 4
      // 01e: ifne 038
      // 021: invokevirtual com/google/gson/JsonElement.isJsonObject ()Z
      // 024: ifne 036
      // 027: goto 02e
      // 02a: invokestatic dc5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02d: athrow
      // 02e: invokestatic com/google/common/collect/Maps.newHashMap ()Ljava/util/HashMap;
      // 031: areturn
      // 032: invokestatic dc5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 035: athrow
      // 036: aload 5
      // 038: invokevirtual com/google/gson/JsonElement.getAsJsonObject ()Lcom/google/gson/JsonObject;
      // 03b: astore 6
      // 03d: invokestatic com/google/common/collect/Maps.newHashMap ()Ljava/util/HashMap;
      // 040: astore 7
      // 042: aload 6
      // 044: invokevirtual com/google/gson/JsonObject.entrySet ()Ljava/util/Set;
      // 047: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 04c: astore 8
      // 04e: aload 8
      // 050: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 055: ifeq 2d3
      // 058: aload 8
      // 05a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 05f: checkcast java/util/Map$Entry
      // 062: astore 9
      // 064: aload 9
      // 066: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 06b: checkcast java/lang/String
      // 06e: invokestatic l9p._02 (Ljava/lang/String;)L_ss;
      // 071: astore 10
      // 073: aload 10
      // 075: ifnull 26e
      // 078: new blu
      // 07b: dup
      // 07c: invokespecial blu.<init> ()V
      // 07f: astore 11
      // 081: aload 9
      // 083: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 088: checkcast com/google/gson/JsonElement
      // 08b: invokevirtual com/google/gson/JsonElement.isJsonPrimitive ()Z
      // 08e: iload 4
      // 090: ifne 101
      // 093: ifeq 0e1
      // 096: goto 09d
      // 099: invokestatic dc5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09c: athrow
      // 09d: aload 9
      // 09f: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 0a4: checkcast com/google/gson/JsonElement
      // 0a7: invokevirtual com/google/gson/JsonElement.getAsJsonPrimitive ()Lcom/google/gson/JsonPrimitive;
      // 0aa: invokevirtual com/google/gson/JsonPrimitive.isNumber ()Z
      // 0ad: iload 4
      // 0af: ifne 101
      // 0b2: goto 0b9
      // 0b5: invokestatic dc5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b8: athrow
      // 0b9: ifeq 0e1
      // 0bc: goto 0c3
      // 0bf: invokestatic dc5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c2: athrow
      // 0c3: aload 11
      // 0c5: aload 9
      // 0c7: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 0cc: checkcast com/google/gson/JsonElement
      // 0cf: invokevirtual com/google/gson/JsonElement.getAsInt ()I
      // 0d2: invokevirtual blu.uvg (I)V
      // 0d5: iload 4
      // 0d7: ifeq 25d
      // 0da: goto 0e1
      // 0dd: invokestatic dc5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e0: athrow
      // 0e1: aload 9
      // 0e3: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 0e8: checkcast com/google/gson/JsonElement
      // 0eb: iload 4
      // 0ed: ifne 268
      // 0f0: goto 0f7
      // 0f3: invokestatic dc5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f6: athrow
      // 0f7: invokevirtual com/google/gson/JsonElement.isJsonObject ()Z
      // 0fa: goto 101
      // 0fd: invokestatic dc5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 100: athrow
      // 101: ifeq 25d
      // 104: aload 9
      // 106: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 10b: checkcast com/google/gson/JsonElement
      // 10e: invokevirtual com/google/gson/JsonElement.getAsJsonObject ()Lcom/google/gson/JsonObject;
      // 111: astore 12
      // 113: aload 12
      // 115: sipush 16916
      // 118: ldc2_w 7560033411538231385
      // 11b: lload 2
      // 11c: lxor
      // 11d: invokedynamic m (IJ)Ljava/lang/String; bsm=dc5.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 122: nop
      // 123: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 126: iload 4
      // 128: ifne 1d1
      // 12b: ifeq 1b2
      // 12e: goto 135
      // 131: invokestatic dc5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 134: athrow
      // 135: aload 12
      // 137: sipush 30254
      // 13a: ldc2_w 3288374870509261932
      // 13d: lload 2
      // 13e: lxor
      // 13f: invokedynamic m (IJ)Ljava/lang/String; bsm=dc5.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 144: nop
      // 145: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 148: invokevirtual com/google/gson/JsonElement.isJsonPrimitive ()Z
      // 14b: iload 4
      // 14d: ifne 1d1
      // 150: goto 157
      // 153: invokestatic dc5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 156: athrow
      // 157: ifeq 1b2
      // 15a: goto 161
      // 15d: invokestatic dc5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 160: athrow
      // 161: aload 12
      // 163: sipush 30254
      // 166: ldc2_w 3288374870509261932
      // 169: lload 2
      // 16a: lxor
      // 16b: invokedynamic m (IJ)Ljava/lang/String; bsm=dc5.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 170: nop
      // 171: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 174: invokevirtual com/google/gson/JsonElement.getAsJsonPrimitive ()Lcom/google/gson/JsonPrimitive;
      // 177: invokevirtual com/google/gson/JsonPrimitive.isNumber ()Z
      // 17a: iload 4
      // 17c: ifne 1d1
      // 17f: goto 186
      // 182: invokestatic dc5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 185: athrow
      // 186: ifeq 1b2
      // 189: goto 190
      // 18c: invokestatic dc5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18f: athrow
      // 190: aload 11
      // 192: aload 12
      // 194: sipush 30254
      // 197: ldc2_w 3288374870509261932
      // 19a: lload 2
      // 19b: lxor
      // 19c: invokedynamic m (IJ)Ljava/lang/String; bsm=dc5.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a1: nop
      // 1a2: invokevirtual com/google/gson/JsonObject.getAsJsonPrimitive (Ljava/lang/String;)Lcom/google/gson/JsonPrimitive;
      // 1a5: invokevirtual com/google/gson/JsonPrimitive.getAsInt ()I
      // 1a8: invokevirtual blu.uvg (I)V
      // 1ab: goto 1b2
      // 1ae: invokestatic dc5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b1: athrow
      // 1b2: aload 12
      // 1b4: iload 4
      // 1b6: ifne 268
      // 1b9: sipush 21329
      // 1bc: ldc2_w 1845961663782531357
      // 1bf: lload 2
      // 1c0: lxor
      // 1c1: invokedynamic m (IJ)Ljava/lang/String; bsm=dc5.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c6: nop
      // 1c7: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 1ca: goto 1d1
      // 1cd: invokestatic dc5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d0: athrow
      // 1d1: ifeq 25d
      // 1d4: aload 10
      // 1d6: invokevirtual _ss.yjl ()Ljava/lang/Class;
      // 1d9: iload 4
      // 1db: ifne 268
      // 1de: goto 1e5
      // 1e1: invokestatic dc5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e4: athrow
      // 1e5: ifnull 25d
      // 1e8: goto 1ef
      // 1eb: invokestatic dc5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ee: athrow
      // 1ef: aload 10
      // 1f1: invokevirtual _ss.yjl ()Ljava/lang/Class;
      // 1f4: bipush 0
      // 1f5: anewarray 268
      // 1f8: invokevirtual java/lang/Class.getConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 1fb: astore 13
      // 1fd: aload 13
      // 1ff: bipush 0
      // 200: anewarray 147
      // 203: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // 206: checkcast lhm
      // 209: astore 14
      // 20b: aload 14
      // 20d: aload 12
      // 20f: sipush 25635
      // 212: ldc2_w 4697459335307462252
      // 215: lload 2
      // 216: lxor
      // 217: invokedynamic m (IJ)Ljava/lang/String; bsm=dc5.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21c: nop
      // 21d: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 220: invokeinterface lhm.wqy (Lcom/google/gson/JsonElement;)V 2
      // 225: aload 11
      // 227: aload 14
      // 229: invokevirtual blu.jkb (Llhm;)V
      // 22c: goto 25d
      // 22f: astore 13
      // 231: getstatic dc5.pmy Lorg/apache/logging/log4j/Logger;
      // 234: new java/lang/StringBuilder
      // 237: dup
      // 238: invokespecial java/lang/StringBuilder.<init> ()V
      // 23b: sipush 1379
      // 23e: ldc2_w 4567888741352400682
      // 241: lload 2
      // 242: lxor
      // 243: invokedynamic m (IJ)Ljava/lang/String; bsm=dc5.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 248: nop
      // 249: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 24c: aload 0
      // 24d: getfield dc5.oum Ljava/io/File;
      // 250: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 253: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 256: aload 13
      // 258: invokeinterface org/apache/logging/log4j/Logger.warn (Ljava/lang/String;Ljava/lang/Throwable;)V 3
      // 25d: aload 7
      // 25f: aload 10
      // 261: aload 11
      // 263: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 268: pop
      // 269: iload 4
      // 26b: ifeq 2ce
      // 26e: getstatic dc5.pmy Lorg/apache/logging/log4j/Logger;
      // 271: new java/lang/StringBuilder
      // 274: dup
      // 275: invokespecial java/lang/StringBuilder.<init> ()V
      // 278: sipush 4472
      // 27b: ldc2_w 2488986186738692915
      // 27e: lload 2
      // 27f: lxor
      // 280: invokedynamic m (IJ)Ljava/lang/String; bsm=dc5.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 285: nop
      // 286: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 289: aload 0
      // 28a: getfield dc5.oum Ljava/io/File;
      // 28d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 290: sipush 25313
      // 293: ldc2_w 8449826195303661734
      // 296: lload 2
      // 297: lxor
      // 298: invokedynamic m (IJ)Ljava/lang/String; bsm=dc5.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29d: nop
      // 29e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a1: aload 9
      // 2a3: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 2a8: checkcast java/lang/String
      // 2ab: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2ae: sipush 10134
      // 2b1: ldc2_w 1377960515530704341
      // 2b4: lload 2
      // 2b5: lxor
      // 2b6: invokedynamic m (IJ)Ljava/lang/String; bsm=dc5.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2bb: nop
      // 2bc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2bf: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2c2: invokeinterface org/apache/logging/log4j/Logger.warn (Ljava/lang/String;)V 2
      // 2c7: goto 2ce
      // 2ca: invokestatic dc5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2cd: athrow
      // 2ce: iload 4
      // 2d0: ifeq 04e
      // 2d3: aload 7
      // 2d5: areturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public static String ip9(Map var0) {
      long var1 = a ^ 135605010988707L;
      JsonObject var4 = new JsonObject();
      int var10000 = OpaquePredicate.b();
      Iterator var5 = var0.entrySet().iterator();
      int var3 = var10000;

      while (var5.hasNext()) {
         label48: {
            Entry var6 = (Entry)var5.next();
            if (((blu)var6.getValue()).q12() != null) {
               JsonObject var7 = new JsonObject();
               var7.addProperty(a<"m">(30254, 3288466069956277923L ^ var1), ((blu)var6.getValue()).tsb());

               try {
                  var7.add(a<"m">(25635, 4697509027971966115L ^ var1), ((blu)var6.getValue()).q12().ni6());
               } catch (Throwable var9) {
                  pmy.warn(a<"m">(23241, 1377695893009046080L ^ var1) + ((_ss)var6.getKey()).xn7() + a<"m">(25887, 7193664818643641744L ^ var1), var9);
               }

               try {
                  var4.add(((_ss)var6.getKey()).yr5, var7);
                  if (var3 != 0) {
                     break label48;
                  }
               } catch (Throwable var11) {
                  boolean var10001 = false;
                  throw a(var11);
               }
            }

            try {
               var4.addProperty(((_ss)var6.getKey()).yr5, ((blu)var6.getValue()).tsb());
            } catch (Throwable var10) {
               boolean var13 = false;
               throw a(var10);
            }
         }

         if (var3 == 0) {
            break;
         }
      }

      return var4.toString();
   }

   public void w92() {
      int var1 = OpaquePredicate.c();

      for (_ss var3 : this.q48.keySet()) {
         this.ufg.add(var3);
         if (var1 != 0) {
            break;
         }
      }
   }

   public void gts(z96 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield dc5.aux Lvr1;
      // 04: invokevirtual vr1.g5u ()I
      // 07: istore 3
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: invokestatic com/google/common/collect/Maps.newHashMap ()Ljava/util/HashMap;
      // 0e: astore 4
      // 10: istore 2
      // 11: aload 0
      // 12: iload 2
      // 13: ifne 43
      // 16: getfield dc5.l26 Z
      // 19: ifne 36
      // 1c: goto 23
      // 1f: invokestatic dc5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22: athrow
      // 23: iload 3
      // 24: aload 0
      // 25: getfield dc5.u4x I
      // 28: isub
      // 29: sipush 300
      // 2c: if_icmple 85
      // 2f: goto 36
      // 32: invokestatic dc5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 35: athrow
      // 36: aload 0
      // 37: iload 3
      // 38: putfield dc5.u4x I
      // 3b: aload 0
      // 3c: goto 43
      // 3f: invokestatic dc5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 42: athrow
      // 43: invokevirtual dc5.twl ()Ljava/util/Set;
      // 46: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 4b: astore 5
      // 4d: aload 5
      // 4f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 54: ifeq 85
      // 57: aload 5
      // 59: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 5e: checkcast _ss
      // 61: astore 6
      // 63: aload 4
      // 65: aload 6
      // 67: aload 0
      // 68: aload 6
      // 6a: invokevirtual dc5.zgq (L_ss;)I
      // 6d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 70: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 75: pop
      // 76: iload 2
      // 77: ifne 95
      // 7a: iload 2
      // 7b: ifeq 4d
      // 7e: goto 85
      // 81: invokestatic dc5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 84: athrow
      // 85: aload 1
      // 86: getfield z96.rhh Lmlk;
      // 89: new net/minecraft/network/play/server/S37PacketStatistics
      // 8c: dup
      // 8d: aload 4
      // 8f: invokespecial net/minecraft/network/play/server/S37PacketStatistics.<init> (Ljava/util/Map;)V
      // 92: invokevirtual mlk.vnf (Lmz2;)V
      // 95: return
   }

   public void vd_(z96 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/google/common/collect/Maps.newHashMap ()Ljava/util/HashMap;
      // 03: astore 3
      // 04: invokestatic OpaquePredicate.c ()I
      // 07: getstatic y8d.i0s Ljava/util/List;
      // 0a: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0f: astore 4
      // 11: istore 2
      // 12: aload 4
      // 14: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 19: ifeq 70
      // 1c: aload 4
      // 1e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 23: checkcast l7l
      // 26: astore 5
      // 28: iload 2
      // 29: ifne 7f
      // 2c: aload 0
      // 2d: aload 5
      // 2f: invokevirtual dc5.ktg (Ll7l;)Z
      // 32: iload 2
      // 33: ifne 6b
      // 36: goto 3d
      // 39: invokestatic dc5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c: athrow
      // 3d: ifeq 6c
      // 40: goto 47
      // 43: invokestatic dc5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 46: athrow
      // 47: aload 3
      // 48: aload 5
      // 4a: aload 0
      // 4b: aload 5
      // 4d: invokevirtual dc5.zgq (L_ss;)I
      // 50: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 53: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 58: pop
      // 59: aload 0
      // 5a: getfield dc5.ufg Ljava/util/Set;
      // 5d: aload 5
      // 5f: invokeinterface java/util/Set.remove (Ljava/lang/Object;)Z 2
      // 64: goto 6b
      // 67: invokestatic dc5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6a: athrow
      // 6b: pop
      // 6c: iload 2
      // 6d: ifeq 12
      // 70: aload 1
      // 71: getfield z96.rhh Lmlk;
      // 74: new net/minecraft/network/play/server/S37PacketStatistics
      // 77: dup
      // 78: aload 3
      // 79: invokespecial net/minecraft/network/play/server/S37PacketStatistics.<init> (Ljava/util/Map;)V
      // 7c: invokevirtual mlk.vnf (Lmz2;)V
      // 7f: return
   }

   public boolean bzz() {
      return this.l26;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7639695008995016675L, -7707791591917471960L, MethodHandles.lookup().lookupClass()).a(185613694142130L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 121952428674873L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[15];
      int var7 = 0;
      String var6 = "Þè4\u00001þ¨Ïõ!hÃþ\u0094ËNÂ'È Lyuú²\u0092+éi*¸\u009dÅÏÓ^¸¥sä(\u0084ÔËãD\u008c\u0086Eñûþ©'\u0002éÐé¹Öó 6=v»Õr}¼Ýñ5\u00adäË\u001bª°\u000eS8\u000fà#l¥\u0084\u0092Â\u008d\tçM\u0004)Tçû\u009e.>Òÿ\u001dê\u007fTõÐ40;\u0099¬¬W\u0006C#'\u001d$w\u0081Á\u009bn\u008a\u0094äV«Ãµ\u008a\u000e¶(\u0011\u0091T¿Y©|\u0098»)~±\u0087È<ÄôEä\u0016¼º\u0006@À\u0084°E\r[égV\u0082\u0084g@¶ûQ\u0018æÃßÑ\fu)t\u0082Ð{Ï\u001cP\u00935Ü£jn½\fc¬0\bQÛ\u0080mGá\u0084éXl£¶\u0092A;a\u0018-§¤\u000b®ô\u0083Ä\u009eÖ\\\u0011¬\u0003r(Ã÷'\u0004Y»Î\u00830\u0019àSïç\u0010ø»`°*rrEØäe³OqÝ\u009c\u0018\u0015J[Ô#Ü\u001eµü\u0006\u0082Þé\u0006f(¹}ª\u0005\u0094ë\u0095½\u0010\u0092\u0095ÜD\b\u001eDÏ»`\rp3úU®\u0010\u0019a\u009d\u0097\u0013-M\bÀ\u008f/äÌA\u001bï0A\"Ó0JÔÏÎøu\u0087xãþØû\u009c`''8_¬]hD\u0007~a©©\u0094Yóä×Ù\u0002Âô²¼ö·\u0097@Õ÷8ÄØê\u008fÕ\u0092êk\u0001Pø<þTÑ\\°+é\u009cH\u0092\u00ad·ÁY9\u0011¹£³\u001f\u0081\"í\u009cÚH¢\u001eEä\u0087\u009e\u008fäÛsÀd£\u008c\u0017k;ç(\u0002{\u0093\u008eÝlÒÝÃ\u0012U'\u0010\u0007àJ\u0097\u009d\u0098ùa¬Á'\u000f\u0096k\u008au>ÎÕbRíÝ\u0010æU½";
      int var8 = "Þè4\u00001þ¨Ïõ!hÃþ\u0094ËNÂ'È Lyuú²\u0092+éi*¸\u009dÅÏÓ^¸¥sä(\u0084ÔËãD\u008c\u0086Eñûþ©'\u0002éÐé¹Öó 6=v»Õr}¼Ýñ5\u00adäË\u001bª°\u000eS8\u000fà#l¥\u0084\u0092Â\u008d\tçM\u0004)Tçû\u009e.>Òÿ\u001dê\u007fTõÐ40;\u0099¬¬W\u0006C#'\u001d$w\u0081Á\u009bn\u008a\u0094äV«Ãµ\u008a\u000e¶(\u0011\u0091T¿Y©|\u0098»)~±\u0087È<ÄôEä\u0016¼º\u0006@À\u0084°E\r[égV\u0082\u0084g@¶ûQ\u0018æÃßÑ\fu)t\u0082Ð{Ï\u001cP\u00935Ü£jn½\fc¬0\bQÛ\u0080mGá\u0084éXl£¶\u0092A;a\u0018-§¤\u000b®ô\u0083Ä\u009eÖ\\\u0011¬\u0003r(Ã÷'\u0004Y»Î\u00830\u0019àSïç\u0010ø»`°*rrEØäe³OqÝ\u009c\u0018\u0015J[Ô#Ü\u001eµü\u0006\u0082Þé\u0006f(¹}ª\u0005\u0094ë\u0095½\u0010\u0092\u0095ÜD\b\u001eDÏ»`\rp3úU®\u0010\u0019a\u009d\u0097\u0013-M\bÀ\u008f/äÌA\u001bï0A\"Ó0JÔÏÎøu\u0087xãþØû\u009c`''8_¬]hD\u0007~a©©\u0094Yóä×Ù\u0002Âô²¼ö·\u0097@Õ÷8ÄØê\u008fÕ\u0092êk\u0001Pø<þTÑ\\°+é\u009cH\u0092\u00ad·ÁY9\u0011¹£³\u001f\u0081\"í\u009cÚH¢\u001eEä\u0087\u009e\u008fäÛsÀd£\u008c\u0017k;ç(\u0002{\u0093\u008eÝlÒÝÃ\u0012U'\u0010\u0007àJ\u0097\u009d\u0098ùa¬Á'\u000f\u0096k\u008au>ÎÕbRíÝ\u0010æU½"
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
                     c = new String[15];
                     pmy = LogManager.getLogger();
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

                  var6 = "Ú.[R\u0092\u0004Ìâ8üOd3\u008a\u009d^í/(\u0089µ%©{:\u0092\fo\u0097\u001bír®\bù\u0012\u001b\u0016l³ê\u007f;Ú¥ÂOÝ\u0086ÕÙ\u0086¦\u0087»ø0²ÀÉO\u00034É\u0016Ü\"\u0004\u0094\u0083\u001aB\u009d\u0018,5ÀÒå\u0083P\u0096\u008fv\u009dö ]\u007f4}\u001bÇ\u0093\u0006\u001e«Ó) \n|\u008dú3";
                  var8 = "Ú.[R\u0092\u0004Ìâ8üOd3\u008a\u009d^í/(\u0089µ%©{:\u0092\fo\u0097\u001bír®\bù\u0012\u001b\u0016l³ê\u007f;Ú¥ÂOÝ\u0086ÕÙ\u0086¦\u0087»ø0²ÀÉO\u00034É\u0016Ü\"\u0004\u0094\u0083\u001aB\u009d\u0018,5ÀÒå\u0083P\u0096\u008fv\u009dö ]\u007f4}\u001bÇ\u0093\u0006\u001e«Ó) \n|\u008dú3"
                     .length();
                  var5 = '8';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11182;
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
            throw new RuntimeException("dc5", var10);
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
         throw new RuntimeException("dc5" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
