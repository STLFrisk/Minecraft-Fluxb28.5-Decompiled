import com.google.common.base.Charsets;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.mojang.authlib.GameProfile;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.ParameterizedType;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.commons.io.IOUtils;

public class kr3 {
   public static final SimpleDateFormat f5l;
   private final Map lg8 = Maps.newHashMap();
   private final Map _gw = Maps.newHashMap();
   private final LinkedList ovl = Lists.newLinkedList();
   private final vr1 rji;
   public final Gson hdy;
   private final File by1;
   private static final ParameterizedType b6t;

   public kr3(vr1 var1, File var2) {
      this.rji = var1;
      this.by1 = var2;
      GsonBuilder var3 = new GsonBuilder();
      var3.registerTypeHierarchyAdapter(kr3$ccc.class, new kr3$_bf(this, null));
      this.hdy = var3.create();
      this.emn();
   }

   private static GameProfile e5l(vr1 param0, String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 1
      // 01: anewarray 82
      // 04: astore 3
      // 05: invokestatic OpaquePredicate.c ()I
      // 08: new kr3$2
      // 0b: dup
      // 0c: aload 3
      // 0d: invokespecial kr3$2.<init> ([Lcom/mojang/authlib/GameProfile;)V
      // 10: astore 4
      // 12: aload 0
      // 13: invokevirtual vr1.ulz ()Lcom/mojang/authlib/GameProfileRepository;
      // 16: bipush 1
      // 17: anewarray 93
      // 1a: dup
      // 1b: bipush 0
      // 1c: aload 1
      // 1d: aastore
      // 1e: getstatic com/mojang/authlib/Agent.MINECRAFT Lcom/mojang/authlib/Agent;
      // 21: aload 4
      // 23: invokeinterface com/mojang/authlib/GameProfileRepository.findProfilesByNames ([Ljava/lang/String;Lcom/mojang/authlib/Agent;Lcom/mojang/authlib/ProfileLookupCallback;)V 4
      // 28: istore 2
      // 29: aload 0
      // 2a: invokevirtual vr1.targetsSorted ()Z
      // 2d: ifne 6e
      // 30: aload 3
      // 31: bipush 0
      // 32: aaload
      // 33: iload 2
      // 34: ifne 71
      // 37: goto 3e
      // 3a: invokestatic kr3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d: athrow
      // 3e: ifnonnull 6e
      // 41: goto 48
      // 44: invokestatic kr3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 47: athrow
      // 48: new com/mojang/authlib/GameProfile
      // 4b: dup
      // 4c: aconst_null
      // 4d: checkcast java/util/UUID
      // 50: aload 1
      // 51: invokespecial com/mojang/authlib/GameProfile.<init> (Ljava/util/UUID;Ljava/lang/String;)V
      // 54: invokestatic ha9.z05 (Lcom/mojang/authlib/GameProfile;)Ljava/util/UUID;
      // 57: astore 5
      // 59: new com/mojang/authlib/GameProfile
      // 5c: dup
      // 5d: aload 5
      // 5f: aload 1
      // 60: invokespecial com/mojang/authlib/GameProfile.<init> (Ljava/util/UUID;Ljava/lang/String;)V
      // 63: astore 6
      // 65: aload 4
      // 67: aload 6
      // 69: invokeinterface com/mojang/authlib/ProfileLookupCallback.onProfileLookupSucceeded (Lcom/mojang/authlib/GameProfile;)V 2
      // 6e: aload 3
      // 6f: bipush 0
      // 70: aaload
      // 71: areturn
   }

   public void h5y(GameProfile var1) {
      this.h88(var1, (Date)null);
   }

   private void h88(GameProfile var1, Date var2) {
      int var3 = OpaquePredicate.c();
      UUID var4 = var1.getId();
      if (var2 == null) {
         Calendar var5 = Calendar.getInstance();
         var5.setTime(new Date());
         var5.add(2, 1);
         var2 = var5.getTime();
      }

      String var9 = var1.getName().toLowerCase(Locale.ROOT);
      kr3$ccc var6 = new kr3$ccc(this, var1, var2, null);

      Map var10000;
      UUID var10001;
      label23: {
         label22: {
            try {
               var10000 = this._gw;
               var10001 = var4;
               if (var3 != 0) {
                  break label23;
               }

               if (!this._gw.containsKey(var4)) {
                  break label22;
               }
            } catch (JsonParseException var8) {
               throw a(var8);
            }

            kr3$ccc var7 = (kr3$ccc)this._gw.get(var4);
            this.lg8.remove(var7.mhm().getName().toLowerCase(Locale.ROOT));
            this.ovl.remove(var1);
         }

         this.lg8.put(var1.getName().toLowerCase(Locale.ROOT), var6);
         var10000 = this._gw;
         var10001 = var4;
      }

      var10000.put(var10001, var6);
      this.ovl.addFirst(var1);
      this.k_x();
   }

   public GameProfile wjp(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 004: invokevirtual java/lang/String.toLowerCase (Ljava/util/Locale;)Ljava/lang/String;
      // 007: astore 3
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: aload 0
      // 00c: getfield kr3.lg8 Ljava/util/Map;
      // 00f: aload 3
      // 010: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 015: checkcast kr3$ccc
      // 018: astore 4
      // 01a: istore 2
      // 01b: aload 4
      // 01d: iload 2
      // 01e: ifeq 08f
      // 021: ifnull 08d
      // 024: goto 02b
      // 027: invokestatic kr3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02a: athrow
      // 02b: new java/util/Date
      // 02e: dup
      // 02f: invokespecial java/util/Date.<init> ()V
      // 032: invokevirtual java/util/Date.getTime ()J
      // 035: aload 4
      // 037: invokestatic kr3$ccc.gqe (Lkr3$ccc;)Ljava/util/Date;
      // 03a: invokevirtual java/util/Date.getTime ()J
      // 03d: lcmp
      // 03e: iload 2
      // 03f: ifeq 089
      // 042: goto 049
      // 045: invokestatic kr3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 048: athrow
      // 049: iflt 08d
      // 04c: aload 0
      // 04d: getfield kr3._gw Ljava/util/Map;
      // 050: aload 4
      // 052: invokevirtual kr3$ccc.mhm ()Lcom/mojang/authlib/GameProfile;
      // 055: invokevirtual com/mojang/authlib/GameProfile.getId ()Ljava/util/UUID;
      // 058: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 05d: pop
      // 05e: aload 0
      // 05f: getfield kr3.lg8 Ljava/util/Map;
      // 062: aload 4
      // 064: invokevirtual kr3$ccc.mhm ()Lcom/mojang/authlib/GameProfile;
      // 067: invokevirtual com/mojang/authlib/GameProfile.getName ()Ljava/lang/String;
      // 06a: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 06d: invokevirtual java/lang/String.toLowerCase (Ljava/util/Locale;)Ljava/lang/String;
      // 070: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 075: pop
      // 076: aload 0
      // 077: getfield kr3.ovl Ljava/util/LinkedList;
      // 07a: aload 4
      // 07c: invokevirtual kr3$ccc.mhm ()Lcom/mojang/authlib/GameProfile;
      // 07f: invokevirtual java/util/LinkedList.remove (Ljava/lang/Object;)Z
      // 082: goto 089
      // 085: invokestatic kr3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 088: athrow
      // 089: pop
      // 08a: aconst_null
      // 08b: astore 4
      // 08d: aload 4
      // 08f: iload 2
      // 090: ifeq 09f
      // 093: ifnull 0bb
      // 096: goto 09d
      // 099: invokestatic kr3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09c: athrow
      // 09d: aload 4
      // 09f: invokevirtual kr3$ccc.mhm ()Lcom/mojang/authlib/GameProfile;
      // 0a2: astore 5
      // 0a4: aload 0
      // 0a5: getfield kr3.ovl Ljava/util/LinkedList;
      // 0a8: aload 5
      // 0aa: invokevirtual java/util/LinkedList.remove (Ljava/lang/Object;)Z
      // 0ad: pop
      // 0ae: aload 0
      // 0af: getfield kr3.ovl Ljava/util/LinkedList;
      // 0b2: aload 5
      // 0b4: invokevirtual java/util/LinkedList.addFirst (Ljava/lang/Object;)V
      // 0b7: iload 2
      // 0b8: ifne 0ea
      // 0bb: aload 0
      // 0bc: getfield kr3.rji Lvr1;
      // 0bf: aload 3
      // 0c0: invokestatic kr3.e5l (Lvr1;Ljava/lang/String;)Lcom/mojang/authlib/GameProfile;
      // 0c3: astore 5
      // 0c5: iload 2
      // 0c6: ifeq 0ee
      // 0c9: aload 5
      // 0cb: ifnull 0ea
      // 0ce: goto 0d5
      // 0d1: invokestatic kr3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d4: athrow
      // 0d5: aload 0
      // 0d6: aload 5
      // 0d8: invokevirtual kr3.h5y (Lcom/mojang/authlib/GameProfile;)V
      // 0db: aload 0
      // 0dc: getfield kr3.lg8 Ljava/util/Map;
      // 0df: aload 3
      // 0e0: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0e5: checkcast kr3$ccc
      // 0e8: astore 4
      // 0ea: aload 0
      // 0eb: invokevirtual kr3.k_x ()V
      // 0ee: aload 4
      // 0f0: iload 2
      // 0f1: ifeq 108
      // 0f4: ifnonnull 106
      // 0f7: goto 0fe
      // 0fa: invokestatic kr3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fd: athrow
      // 0fe: aconst_null
      // 0ff: goto 10b
      // 102: invokestatic kr3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 105: athrow
      // 106: aload 4
      // 108: invokevirtual kr3$ccc.mhm ()Lcom/mojang/authlib/GameProfile;
      // 10b: areturn
   }

   public String[] j3h() {
      ArrayList var1 = Lists.newArrayList(this.lg8.keySet());
      return var1.toArray(new String[var1.size()]);
   }

   public GameProfile n9g(UUID param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield kr3._gw Ljava/util/Map;
      // 08: aload 1
      // 09: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0e: checkcast kr3$ccc
      // 11: astore 3
      // 12: aload 3
      // 13: iload 2
      // 14: ifne 2a
      // 17: ifnonnull 29
      // 1a: goto 21
      // 1d: invokestatic kr3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: aconst_null
      // 22: goto 2d
      // 25: invokestatic kr3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28: athrow
      // 29: aload 3
      // 2a: invokevirtual kr3$ccc.mhm ()Lcom/mojang/authlib/GameProfile;
      // 2d: areturn
   }

   private kr3$ccc h34(UUID var1) {
      int var2 = OpaquePredicate.b();
      kr3$ccc var3 = (kr3$ccc)this._gw.get(var1);

      try {
         if (var2 == 0) {
            return var3;
         }

         if (var3 == null) {
            return var3;
         }
      } catch (JsonParseException var5) {
         throw a(var5);
      }

      GameProfile var4 = var3.mhm();
      this.ovl.remove(var4);
      this.ovl.addFirst(var4);
      return var3;
   }

   public void emn() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aconst_null
      // 05: astore 2
      // 06: aload 0
      // 07: getfield kr3.by1 Ljava/io/File;
      // 0a: getstatic com/google/common/base/Charsets.UTF_8 Ljava/nio/charset/Charset;
      // 0d: invokestatic com/google/common/io/Files.newReader (Ljava/io/File;Ljava/nio/charset/Charset;)Ljava/io/BufferedReader;
      // 10: astore 2
      // 11: aload 0
      // 12: getfield kr3.hdy Lcom/google/gson/Gson;
      // 15: aload 2
      // 16: getstatic kr3.b6t Ljava/lang/reflect/ParameterizedType;
      // 19: invokevirtual com/google/gson/Gson.fromJson (Ljava/io/Reader;Ljava/lang/reflect/Type;)Ljava/lang/Object;
      // 1c: checkcast java/util/List
      // 1f: astore 3
      // 20: aload 0
      // 21: getfield kr3.lg8 Ljava/util/Map;
      // 24: invokeinterface java/util/Map.clear ()V 1
      // 29: aload 0
      // 2a: getfield kr3._gw Ljava/util/Map;
      // 2d: invokeinterface java/util/Map.clear ()V 1
      // 32: aload 0
      // 33: getfield kr3.ovl Ljava/util/LinkedList;
      // 36: invokevirtual java/util/LinkedList.clear ()V
      // 39: aload 3
      // 3a: invokestatic com/google/common/collect/Lists.reverse (Ljava/util/List;)Ljava/util/List;
      // 3d: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 42: astore 4
      // 44: aload 4
      // 46: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 4b: ifeq 83
      // 4e: aload 4
      // 50: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 55: checkcast kr3$ccc
      // 58: astore 5
      // 5a: iload 1
      // 5b: ifeq 87
      // 5e: aload 5
      // 60: ifnull 7f
      // 63: goto 6a
      // 66: invokestatic kr3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 69: athrow
      // 6a: aload 0
      // 6b: aload 5
      // 6d: invokevirtual kr3$ccc.mhm ()Lcom/mojang/authlib/GameProfile;
      // 70: aload 5
      // 72: invokevirtual kr3$ccc.ojz ()Ljava/util/Date;
      // 75: invokespecial kr3.h88 (Lcom/mojang/authlib/GameProfile;Ljava/util/Date;)V
      // 78: goto 7f
      // 7b: invokestatic kr3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7e: athrow
      // 7f: iload 1
      // 80: ifne 44
      // 83: aload 2
      // 84: invokestatic org/apache/commons/io/IOUtils.closeQuietly (Ljava/io/Reader;)V
      // 87: goto 9a
      // 8a: astore 3
      // 8b: aload 2
      // 8c: invokestatic org/apache/commons/io/IOUtils.closeQuietly (Ljava/io/Reader;)V
      // 8f: goto 9a
      // 92: astore 3
      // 93: aload 2
      // 94: invokestatic org/apache/commons/io/IOUtils.closeQuietly (Ljava/io/Reader;)V
      // 97: goto 9a
      // 9a: return
   }

   public void k_x() {
      String var1 = this.hdy.toJson(this.wu6(1000));
      BufferedWriter var2 = null;

      try {
         var2 = Files.newWriter(this.by1, Charsets.UTF_8);
         var2.write(var1);
         return;
      } catch (FileNotFoundException var8) {
         return;
      } catch (IOException var9) {
      } finally {
         IOUtils.closeQuietly(var2);
      }
   }

   private List wu6(int var1) {
      ArrayList var3 = Lists.newArrayList();
      int var10000 = OpaquePredicate.c();
      Iterator var4 = Lists.newArrayList(Iterators.limit(this.ovl.iterator(), var1)).iterator();
      int var2 = var10000;

      while (var4.hasNext()) {
         GameProfile var5 = (GameProfile)var4.next();
         kr3$ccc var6 = this.h34(var5.getId());

         try {
            if (var6 != null) {
               var3.add(var6);
            }
         } catch (JsonParseException var7) {
            throw a(var7);
         }

         if (var2 != 0) {
            break;
         }
      }

      return var3;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(3044699408278956072L, 6681137489183555949L, MethodHandles.lookup().lookupClass()).a(280452018618000L);
      // $VF: monitorexit
      long var4 = var10000 ^ 106924189608037L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("\u0094ß\u0004\u009b\u001a°Ï®¹Çåí£Ýû\u000b[Ï \u000b\u007fô·¯".getBytes("ISO-8859-1"));
      String var7 = a(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      f5l = new SimpleDateFormat(var0);
      b6t = new kr3$1();
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
