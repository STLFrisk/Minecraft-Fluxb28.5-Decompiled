package net.arikia.dev.drpc;

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

public class DiscordRichPresence$Builder {
   private DiscordRichPresence p = new DiscordRichPresence();
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public DiscordRichPresence$Builder(String var1) {
      this.p.state = var1;
   }

   public DiscordRichPresence$Builder setDetails(String var1) {
      this.p.details = var1;
      return this;
   }

   public DiscordRichPresence$Builder setStartTimestamps(long var1) {
      this.p.startTimestamp = var1;
      return this;
   }

   public DiscordRichPresence$Builder setEndTimestamp(long var1) {
      this.p.endTimestamp = var1;
      return this;
   }

   public DiscordRichPresence$Builder setBigImage(String param1, String param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic net/arikia/dev/drpc/DiscordRichPresence$Builder.a J
      // 03: ldc2_w 60503674566964
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic net/arikia/dev/drpc/DiscordRPC.b ()[Ljava/lang/String;
      // 0b: astore 5
      // 0d: aload 2
      // 0e: aload 5
      // 10: ifnull 1e
      // 13: ifnull 58
      // 16: goto 1d
      // 19: invokestatic net/arikia/dev/drpc/DiscordRichPresence$Builder.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1c: athrow
      // 1d: aload 2
      // 1e: aload 5
      // 20: ifnull 3b
      // 23: ldc ""
      // 25: nop
      // 26: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 29: ifne 58
      // 2c: goto 33
      // 2f: invokestatic net/arikia/dev/drpc/DiscordRichPresence$Builder.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 32: athrow
      // 33: aload 1
      // 34: goto 3b
      // 37: invokestatic net/arikia/dev/drpc/DiscordRichPresence$Builder.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3a: athrow
      // 3b: ifnonnull 58
      // 3e: new java/lang/IllegalArgumentException
      // 41: dup
      // 42: sipush 23660
      // 45: ldc2_w 2474676577521182624
      // 48: lload 3
      // 49: lxor
      // 4a: invokedynamic r (IJ)Ljava/lang/String; bsm=net/arikia/dev/drpc/DiscordRichPresence$Builder.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: nop
      // 50: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 53: athrow
      // 54: invokestatic net/arikia/dev/drpc/DiscordRichPresence$Builder.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 57: athrow
      // 58: aload 0
      // 59: getfield net/arikia/dev/drpc/DiscordRichPresence$Builder.p Lnet/arikia/dev/drpc/DiscordRichPresence;
      // 5c: aload 1
      // 5d: putfield net/arikia/dev/drpc/DiscordRichPresence.largeImageKey Ljava/lang/String;
      // 60: aload 0
      // 61: getfield net/arikia/dev/drpc/DiscordRichPresence$Builder.p Lnet/arikia/dev/drpc/DiscordRichPresence;
      // 64: aload 2
      // 65: putfield net/arikia/dev/drpc/DiscordRichPresence.largeImageText Ljava/lang/String;
      // 68: aload 0
      // 69: areturn
   }

   public DiscordRichPresence$Builder setSmallImage(String param1, String param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic net/arikia/dev/drpc/DiscordRichPresence$Builder.a J
      // 03: ldc2_w 22924662604657
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic net/arikia/dev/drpc/DiscordRPC.b ()[Ljava/lang/String;
      // 0b: astore 5
      // 0d: aload 2
      // 0e: aload 5
      // 10: ifnull 1e
      // 13: ifnull 58
      // 16: goto 1d
      // 19: invokestatic net/arikia/dev/drpc/DiscordRichPresence$Builder.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1c: athrow
      // 1d: aload 2
      // 1e: aload 5
      // 20: ifnull 3b
      // 23: ldc ""
      // 25: nop
      // 26: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 29: ifne 58
      // 2c: goto 33
      // 2f: invokestatic net/arikia/dev/drpc/DiscordRichPresence$Builder.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 32: athrow
      // 33: aload 1
      // 34: goto 3b
      // 37: invokestatic net/arikia/dev/drpc/DiscordRichPresence$Builder.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3a: athrow
      // 3b: ifnonnull 58
      // 3e: new java/lang/IllegalArgumentException
      // 41: dup
      // 42: sipush 31253
      // 45: ldc2_w 6534269832233696157
      // 48: lload 3
      // 49: lxor
      // 4a: invokedynamic r (IJ)Ljava/lang/String; bsm=net/arikia/dev/drpc/DiscordRichPresence$Builder.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: nop
      // 50: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 53: athrow
      // 54: invokestatic net/arikia/dev/drpc/DiscordRichPresence$Builder.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 57: athrow
      // 58: aload 0
      // 59: getfield net/arikia/dev/drpc/DiscordRichPresence$Builder.p Lnet/arikia/dev/drpc/DiscordRichPresence;
      // 5c: aload 1
      // 5d: putfield net/arikia/dev/drpc/DiscordRichPresence.smallImageKey Ljava/lang/String;
      // 60: aload 0
      // 61: getfield net/arikia/dev/drpc/DiscordRichPresence$Builder.p Lnet/arikia/dev/drpc/DiscordRichPresence;
      // 64: aload 2
      // 65: putfield net/arikia/dev/drpc/DiscordRichPresence.smallImageText Ljava/lang/String;
      // 68: aload 0
      // 69: areturn
   }

   public DiscordRichPresence$Builder setParty(String var1, int var2, int var3) {
      this.p.partyId = var1;
      this.p.partySize = var2;
      this.p.partyMax = var3;
      return this;
   }

   @Deprecated
   public DiscordRichPresence$Builder setSecrets(String var1, String var2, String var3) {
      this.p.matchSecret = var1;
      this.p.joinSecret = var2;
      this.p.spectateSecret = var3;
      return this;
   }

   public DiscordRichPresence$Builder setSecrets(String var1, String var2) {
      this.p.joinSecret = var1;
      this.p.spectateSecret = var2;
      return this;
   }

   @Deprecated
   public DiscordRichPresence$Builder setInstance(boolean var1) {
      String[] var2 = DiscordRPC.b();

      DiscordRichPresence var10000;
      byte var10001;
      label22: {
         label21: {
            try {
               var10000 = this.p;
               var10001 = var1;
               if (var2 == null) {
                  break label22;
               }

               if (var1 != 0) {
                  break label21;
               }
            } catch (IllegalArgumentException var3) {
               throw a(var3);
            }

            var10001 = 0;
            break label22;
         }

         var10001 = 1;
      }

      var10000.instance = var10001;
      return this;
   }

   public DiscordRichPresence build() {
      return this.p;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(822329438670789168L, -8274807946568773972L, MethodHandles.lookup().lookupClass()).a(110850935578812L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 34525849764452L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[2];
      int var7 = 0;
      String var6 = "Zá\u001dÅ©\u0003BÑ\u000btµÏ0ÑyY\bÐBP É4©\u0097$\nE¼]B,\u0001\u00ad\u0016\u0083¶N\rK\u0083$HÏÌ\u0080ÇüUõ\u0005FÏ÷HçUßÚØ\u008fÛX½ÈZ¤\\³`\u0019ä\u0010èô\u0010kV\u007f\u009fX±Mð.ÔþìÏ\u0084Y¼\u000bmÈ·T\u0010w\u008d}Ö\u009c?ï+Û¡õ{ïå!)0sÊ\b\u0006õà\u008eúÈ\u001c\u0090ÙaºGì¡\u0002!\u001f\u0004b\u0082wDM\u0096\u009e2ì\u0003²\u0018Kñéø gÖÅ\u0090ÃÛ3@-ü@\u0004çþ\n\b";
      int var8 = "Zá\u001dÅ©\u0003BÑ\u000btµÏ0ÑyY\bÐBP É4©\u0097$\nE¼]B,\u0001\u00ad\u0016\u0083¶N\rK\u0083$HÏÌ\u0080ÇüUõ\u0005FÏ÷HçUßÚØ\u008fÛX½ÈZ¤\\³`\u0019ä\u0010èô\u0010kV\u007f\u009fX±Mð.ÔþìÏ\u0084Y¼\u000bmÈ·T\u0010w\u008d}Ö\u009c?ï+Û¡õ{ïå!)0sÊ\b\u0006õà\u008eúÈ\u001c\u0090ÙaºGì¡\u0002!\u001f\u0004b\u0082wDM\u0096\u009e2ì\u0003²\u0018Kñéø gÖÅ\u0090ÃÛ3@-ü@\u0004çþ\n\b"
         .length();
      char var5 = 'P';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11754;
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
            throw new RuntimeException("net/arikia/dev/drpc/DiscordRichPresence$Builder", var10);
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
         throw new RuntimeException("net/arikia/dev/drpc/DiscordRichPresence$Builder" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
