import java.lang.invoke.MethodHandles;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class qgq extends _h4 {
   public static final zb_ m_o;

   public qgq() {
      this.y8l(this._8_.c32().zvi(m_o, x54$lti.y2x).zvi(msa, _h4$i61.z89));
   }

   @Override
   public _mi uoz(zfz param1) {
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
      // 05: getstatic qgq.m_o Lzb_;
      // 08: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0d: checkcast x54$lti
      // 10: astore 3
      // 11: getstatic qgq$2.mik [I
      // 14: aload 1
      // 15: getstatic qgq.msa Lzb_;
      // 18: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 1d: checkcast _h4$i61
      // 20: invokevirtual _h4$i61.ordinal ()I
      // 23: iaload
      // 24: iload 2
      // 25: ifne 5b
      // 28: tableswitch 36 1 4 36 36 36 91
      // 48: invokestatic qgq.b (Loov;)Loov;
      // 4b: athrow
      // 4c: getstatic qgq$2.bu0 [I
      // 4f: aload 3
      // 50: invokevirtual x54$lti.ordinal ()I
      // 53: iaload
      // 54: goto 5b
      // 57: invokestatic qgq.b (Loov;)Loov;
      // 5a: athrow
      // 5b: lookupswitch 25 2 1 25 2 33
      // 74: getstatic _mi.eo9 L_mi;
      // 77: areturn
      // 78: invokestatic qgq.b (Loov;)Loov;
      // 7b: athrow
      // 7c: getstatic x54$lti.jtj Lx54$lti;
      // 7f: invokevirtual x54$lti._fn ()L_mi;
      // 82: areturn
      // 83: aload 3
      // 84: invokevirtual x54$lti._fn ()L_mi;
      // 87: areturn
   }

   @Override
   public void m1q(u7m var1, uja var2, List var3) {
      var3.add(new erg(var1, 1, x54$lti.y2x.h8z() - 4));
      var3.add(new erg(var1, 1, x54$lti.jtj.h8z() - 4));
   }

   @Override
   public zfz kig(int var1) {
      int var2 = t9d.b();
      zfz var3 = this.l4i().zvi(m_o, x54$lti.mhp((var1 & 3) + 4));

      label35: {
         label34: {
            label33: {
               try {
                  if (var2 == 0) {
                     break label33;
                  }

                  switch (var1 & 12) {
                     case 0:
                        break;
                     case 4:
                        break label34;
                     case 8:
                        break label35;
                     default:
                        return var3.zvi(msa, _h4$i61.ahr);
                  }
               } catch (oov var4) {
                  throw b(var4);
               }

               var3 = var3.zvi(msa, _h4$i61.z89);
            }

            if (var2 != 0) {
               return var3;
            }
         }

         var3 = var3.zvi(msa, _h4$i61.gs0);
         if (var2 != 0) {
            return var3;
         }
      }

      var3 = var3.zvi(msa, _h4$i61.e6j);
      return var2 != 0 ? var3 : var3.zvi(msa, _h4$i61.ahr);
   }

   @Override
   public int hvp(zfz var1) {
      int var3 = 0;
      int var10000 = t9d.c();
      var3 |= ((x54$lti)var1.dil(m_o)).h8z() - 4;
      int var2 = var10000;

      label31: {
         label30: {
            try {
               var10000 = qgq$2.mik[((_h4$i61)var1.dil(msa)).ordinal()];
               if (var2 != 0) {
                  return var10000;
               }

               switch (var10000) {
                  case 1:
                     break;
                  case 2:
                     break label30;
                  case 3:
                     break label31;
                  default:
                     return var3;
               }
            } catch (oov var4) {
               throw b(var4);
            }

            var3 |= 4;
            if (var2 == 0) {
               return var3;
            }
         }

         var3 |= 8;
         if (var2 == 0) {
            return var3;
         }
      }

      var3 |= 12;
      return var3;
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{m_o, msa});
   }

   @Override
   public erg b4a(zfz var1) {
      return new erg(u7m.gfm(this), 1, ((x54$lti)var1.dil(m_o)).h8z() - 4);
   }

   @Override
   public int crg(zfz var1) {
      return ((x54$lti)var1.dil(m_o)).h8z() - 4;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1245137918773756997L, 3698730516456172603L, MethodHandles.lookup().lookupClass()).a(240336135239415L);
      // $VF: monitorexit
      long var4 = var10000 ^ 79950147831142L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("\u001brF\u0086>2¡´".getBytes("ISO-8859-1"));
      String var7 = d(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      m_o = zb_._m6(var0, x54$lti.class, new qgq$1());
   }

   private static oov b(oov var0) {
      return var0;
   }

   private static String d(byte[] var0) {
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
