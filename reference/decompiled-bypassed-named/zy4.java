import com.google.common.base.Predicate;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class zy4 extends cjm {
   private static final Logger ano;
   private yqv wj6;
   private final Predicate q4z;
   private final s24$tx3 _8_;
   private Entity vd9;
   private static final long a;
   private static final String b;

   public zy4(yqv var1) {
      long var2 = a ^ 51833525119306L;
      int var4 = OpaquePredicate.b();
      super();
      this.wj6 = var1;
      if (var4 != 0) {
         try {
            if (var1 instanceof EntityPlayer) {
               ano.warn(b);
            }
         } catch (oov var5) {
            throw a(var5);
         }

         this.q4z = new zy4$1(this);
         this._8_ = new s24$tx3(var1);
      }
   }

   @Override
   public boolean vle() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual zy4.nzg ()D
      // 04: dstore 2
      // 05: invokestatic OpaquePredicate.b ()I
      // 08: aload 0
      // 09: getfield zy4.wj6 Lyqv;
      // 0c: getfield yqv.oay Lt9d;
      // 0f: ldc ha9
      // 11: nop
      // 12: aload 0
      // 13: getfield zy4.wj6 Lyqv;
      // 16: invokevirtual yqv.aaw ()Lnh4;
      // 19: dload 2
      // 1a: ldc2_w 4.0
      // 1d: dload 2
      // 1e: invokevirtual nh4.c2h (DDD)Lnh4;
      // 21: aload 0
      // 22: getfield zy4.q4z Lcom/google/common/base/Predicate;
      // 25: invokevirtual OpaquePredicate.vie (Ljava/lang/Class;Lnh4;Lcom/google/common/base/Predicate;)Ljava/util/List;
      // 28: astore 4
      // 2a: aload 4
      // 2c: aload 0
      // 2d: getfield zy4._8_ Ls24$tx3;
      // 30: invokestatic java/util/Collections.sort (Ljava/util/List;Ljava/util/Comparator;)V
      // 33: istore 1
      // 34: aload 4
      // 36: invokeinterface java/util/List.isEmpty ()Z 1
      // 3b: iload 1
      // 3c: ifeq 5f
      // 3f: ifeq 4f
      // 42: goto 49
      // 45: invokestatic zy4.a (Loov;)Loov;
      // 48: athrow
      // 49: bipush 0
      // 4a: ireturn
      // 4b: invokestatic zy4.a (Loov;)Loov;
      // 4e: athrow
      // 4f: aload 0
      // 50: aload 4
      // 52: bipush 0
      // 53: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 58: checkcast Entity
      // 5b: putfield zy4.vd9 Lg_3;
      // 5e: bipush 1
      // 5f: ireturn
   }

   @Override
   public boolean wh3() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield zy4.wj6 Lyqv;
      // 08: invokevirtual yqv.q4v ()Lg_3;
      // 0b: astore 2
      // 0c: aload 2
      // 0d: iload 1
      // 0e: ifeq 22
      // 11: ifnonnull 21
      // 14: goto 1b
      // 17: invokestatic zy4.a (Loov;)Loov;
      // 1a: athrow
      // 1b: bipush 0
      // 1c: ireturn
      // 1d: invokestatic zy4.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 2
      // 22: invokevirtual Entity.gzr ()Z
      // 25: iload 1
      // 26: ifeq 3d
      // 29: ifne 39
      // 2c: goto 33
      // 2f: invokestatic zy4.a (Loov;)Loov;
      // 32: athrow
      // 33: bipush 0
      // 34: ireturn
      // 35: invokestatic zy4.a (Loov;)Loov;
      // 38: athrow
      // 39: aload 2
      // 3a: instanceof ha9
      // 3d: iload 1
      // 3e: ifeq 5c
      // 41: ifeq 6c
      // 44: goto 4b
      // 47: invokestatic zy4.a (Loov;)Loov;
      // 4a: athrow
      // 4b: aload 2
      // 4c: checkcast ha9
      // 4f: getfield ha9.lls Lpj2;
      // 52: getfield pj2.lez Z
      // 55: goto 5c
      // 58: invokestatic zy4.a (Loov;)Loov;
      // 5b: athrow
      // 5c: iload 1
      // 5d: ifeq 6b
      // 60: ifeq 6c
      // 63: goto 6a
      // 66: invokestatic zy4.a (Loov;)Loov;
      // 69: athrow
      // 6a: bipush 0
      // 6b: ireturn
      // 6c: aload 0
      // 6d: getfield zy4.wj6 Lyqv;
      // 70: invokevirtual yqv.ued ()Ln_0;
      // 73: astore 3
      // 74: aload 2
      // 75: invokevirtual Entity.ued ()Ln_0;
      // 78: astore 4
      // 7a: aload 3
      // 7b: iload 1
      // 7c: ifeq 8b
      // 7f: ifnull 95
      // 82: goto 89
      // 85: invokestatic zy4.a (Loov;)Loov;
      // 88: athrow
      // 89: aload 4
      // 8b: aload 3
      // 8c: if_acmpne 95
      // 8f: bipush 0
      // 90: ireturn
      // 91: invokestatic zy4.a (Loov;)Loov;
      // 94: athrow
      // 95: aload 0
      // 96: invokevirtual zy4.nzg ()D
      // 99: dstore 5
      // 9b: aload 0
      // 9c: getfield zy4.wj6 Lyqv;
      // 9f: aload 2
      // a0: invokevirtual yqv.wxg (Li2h;)D
      // a3: dload 5
      // a5: dload 5
      // a7: dmul
      // a8: dcmpl
      // a9: iload 1
      // aa: ifeq c3
      // ad: ifle bf
      // b0: goto b7
      // b3: invokestatic zy4.a (Loov;)Loov;
      // b6: athrow
      // b7: bipush 0
      // b8: goto f5
      // bb: invokestatic zy4.a (Loov;)Loov;
      // be: athrow
      // bf: aload 2
      // c0: instanceof z96
      // c3: iload 1
      // c4: ifeq f1
      // c7: ifeq f0
      // ca: goto d1
      // cd: invokestatic zy4.a (Loov;)Loov;
      // d0: athrow
      // d1: aload 2
      // d2: checkcast z96
      // d5: getfield z96._am Lrsh;
      // d8: invokevirtual rsh.u7c ()Z
      // db: iload 1
      // dc: ifeq f1
      // df: goto e6
      // e2: invokestatic zy4.a (Loov;)Loov;
      // e5: athrow
      // e6: ifne f4
      // e9: goto f0
      // ec: invokestatic zy4.a (Loov;)Loov;
      // ef: athrow
      // f0: bipush 1
      // f1: goto f5
      // f4: bipush 0
      // f5: ireturn
   }

   @Override
   public void mnp() {
      this.wj6.ux8(this.vd9);
      super.mnp();
   }

   @Override
   public void zly() {
      this.wj6.ux8((Entity)null);
      super.mnp();
   }

   public double nzg() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield zy4.wj6 Lyqv;
      // 08: getstatic m6d.wg4 Lw9p;
      // 0b: invokevirtual yqv.dgt (Lw9p;)L_4o;
      // 0e: astore 2
      // 0f: aload 2
      // 10: iload 1
      // 11: ifne 29
      // 14: ifnonnull 28
      // 17: goto 1e
      // 1a: invokestatic zy4.a (Loov;)Loov;
      // 1d: athrow
      // 1e: ldc2_w 16.0
      // 21: goto 2e
      // 24: invokestatic zy4.a (Loov;)Loov;
      // 27: athrow
      // 28: aload 2
      // 29: invokeinterface _4o.nz5 ()D 1
      // 2e: dreturn
   }

   public static yqv sd_(zy4 var0) {
      return var0.wj6;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6059559014185014214L, -710074046433948314L, MethodHandles.lookup().lookupClass()).a(64411086938142L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 131694731478028L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal(
         "\fEúôÓp\u0006\u0013ù\u0092¦&\u0018\u0015\u009fX\u008b¤?~\në\u0089ØY\u008aÂÜ}5KZ±Ùm³4ç-C\u0090\u0085ê¨gâgä\u0010¦\u009d.3RO<É\u0096çÇBÚüE"
            .getBytes("ISO-8859-1")
      );
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
      ano = LogManager.getLogger();
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
}
