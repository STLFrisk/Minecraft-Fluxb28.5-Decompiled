public class drz {
   public static final String h2z;
   public static final String bkr;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var6 = new String[2];
      int var4 = 0;
      String var3 = ":q@mf$\u0001#|D2\u000b:q@mg/\u0001#|D2";
      int var5 = ":q@mf$\u0001#|D2\u000b:q@mg/\u0001#|D2".length();
      char var2 = 11;
      int var1 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var7 = 0;
            byte var14 = 14;
            var10002 = var10003;
            int var9 = var10004;
            byte var17;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var17 = 14;
               var10006 = var7;
            } else {
               var14 = 14;
               var9 = var10004;
               if (var10004 <= var7) {
                  break label38;
               }

               var10005 = var10003;
               var17 = 14;
               var10006 = var7;
            }

            while (true) {
               char var29 = var10005[var10006];
               byte var30;
               switch (var7 % 7) {
                  case 0:
                     var30 = 66;
                     break;
                  case 1:
                     var30 = 22;
                     break;
                  case 2:
                     var30 = 47;
                     break;
                  case 3:
                     var30 = 78;
                     break;
                  case 4:
                     var30 = 12;
                     break;
                  case 5:
                     var30 = 79;
                     break;
                  default:
                     var30 = 108;
               }

               var10005[var10006] = (char)(var29 ^ var17 ^ var30);
               var7++;
               if (var14 == 0) {
                  var10006 = var14;
                  var10005 = var10002;
                  var17 = var14;
               } else {
                  if (var9 <= var7) {
                     break;
                  }

                  var10005 = var10002;
                  var17 = var14;
                  var10006 = var7;
               }
            }
         }

         String var16 = new String(var10002).intern();
         byte var11 = -1;
         var6[var4++] = var16;
         if ((var1 += var2) >= var5) {
            bkr = var6[1];
            h2z = var6[0];
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}
