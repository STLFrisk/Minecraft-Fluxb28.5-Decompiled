/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  paulscode.sound.SoundSystem
 *  paulscode.sound.SoundSystemConfig
 *  paulscode.sound.Source
 */
import paulscode.sound.SoundSystem;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.Source;

public class c6g$p0f
extends SoundSystem {
    public final c6g w3e;

    private c6g$p0f(c6g c6g2) {
        this.w3e = c6g2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    public boolean playing(String string) {
        int n = t9d.b();
        Object object = SoundSystemConfig.THREAD_SYNC;
        synchronized (object) {
            boolean bl;
            block21: {
                block23: {
                    block22: {
                        Source source;
                        block27: {
                            block26: {
                                block25: {
                                    Source source2;
                                    block19: {
                                        block20: {
                                            Object object2 = this.soundLibrary;
                                            if (n != 0) {
                                                if (object2 == null) {
                                                    return false;
                                                }
                                                object2 = this.soundLibrary.getSources().get(string);
                                            }
                                            source = (Source)object2;
                                            source2 = source;
                                            if (n == 0) break block19;
                                            try {
                                                block24: {
                                                    if (source2 != null) break block20;
                                                    break block24;
                                                    catch (oov oov2) {
                                                        throw c6g$p0f.a(oov2);
                                                    }
                                                }
                                                bl = false;
                                                break block21;
                                            }
                                            catch (oov oov3) {
                                                throw c6g$p0f.a(oov3);
                                            }
                                        }
                                        source2 = source;
                                    }
                                    bl = source2.playing();
                                    if (n == 0) break block21;
                                    if (bl) break block22;
                                    break block25;
                                    catch (oov oov4) {
                                        throw c6g$p0f.a(oov4);
                                    }
                                }
                                bl = source.paused();
                                if (n == 0) break block21;
                                break block26;
                                catch (oov oov5) {
                                    throw c6g$p0f.a(oov5);
                                }
                            }
                            if (bl) break block22;
                            break block27;
                            catch (oov oov6) {
                                throw c6g$p0f.a(oov6);
                            }
                        }
                        try {
                            block28: {
                                bl = source.preLoad;
                                if (n == 0) break block21;
                                break block28;
                                catch (oov oov7) {
                                    throw c6g$p0f.a(oov7);
                                }
                            }
                            if (!bl) break block23;
                        }
                        catch (oov oov8) {
                            throw c6g$p0f.a(oov8);
                        }
                    }
                    bl = true;
                    break block21;
                }
                bl = false;
            }
            return bl;
        }
    }

    public c6g$p0f(c6g c6g2, c6g$1 c6g$1) {
        this(c6g2);
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

