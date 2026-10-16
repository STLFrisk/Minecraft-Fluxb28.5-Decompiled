/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.network.play.client.C01PacketChatMessage;

@dr9.x0j(t2u="say", io4={"<message>"}, hjc="Say the specified message.")
public class _1z
extends dr9 {
    /*
     * Unable to fully structure code
     */
    @Override
    public void xjl(String[] var1_1) {
        block8: {
            block7: {
                var2_2 = t9d.b();
                if (var1_1.length < 1) ** GOTO lbl19
                var3_3 = "";
                for (String var7_7 : var1_1) {
                    var3_3 = var3_3 + var7_7 + " ";
                    try {
                        if (var2_2 != 0) {
                            if (var2_2 != 0) continue;
                            break;
                        }
                        break block7;
                    }
                    catch (oov v0) {
                        throw _1z.a(v0);
                    }
                }
                this.rpq.vg8.lq7.sxi(new C01PacketChatMessage(var3_3));
            }
            try {
                if (var2_2 != 0) break block8;
lbl19:
                // 2 sources

                this.dhs();
            }
            catch (oov v1) {
                throw _1z.a(v1);
            }
        }
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

