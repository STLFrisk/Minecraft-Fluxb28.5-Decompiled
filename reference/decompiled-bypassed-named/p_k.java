import com.google.common.collect.Maps;
import com.mojang.authlib.GameProfile;
import io.netty.buffer.Unpooled;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.network.play.client.C00PacketKeepAlive;
import net.minecraft.network.play.client.C03PacketPlayer$C06PacketPlayerPosLook;
import net.minecraft.network.play.client.C17PacketCustomPayload;
import net.minecraft.network.play.server.S00PacketKeepAlive;
import net.minecraft.network.play.server.S01PacketJoinGame;
import net.minecraft.network.play.server.S02PacketChat;
import net.minecraft.network.play.server.S03PacketTimeUpdate;
import net.minecraft.network.play.server.S04PacketEntityEquipment;
import net.minecraft.network.play.server.S05PacketSpawnPosition;
import net.minecraft.network.play.server.S06PacketUpdateHealth;
import net.minecraft.network.play.server.S07PacketRespawn;
import net.minecraft.network.play.server.S08PacketPlayerPosLook;
import net.minecraft.network.play.server.S08PacketPlayerPosLook$bdv;
import net.minecraft.network.play.server.S09PacketHeldItemChange;
import net.minecraft.network.play.server.S0APacketUseBed;
import net.minecraft.network.play.server.S0BPacketAnimation;
import net.minecraft.network.play.server.S0CPacketSpawnPlayer;
import net.minecraft.network.play.server.S0DPacketCollectItem;
import net.minecraft.network.play.server.S0EPacketSpawnObject;
import net.minecraft.network.play.server.S0FPacketSpawnMob;
import net.minecraft.network.play.server.S10PacketSpawnPainting;
import net.minecraft.network.play.server.S11PacketSpawnExperienceOrb;
import net.minecraft.network.play.server.S12PacketEntityVelocity;
import net.minecraft.network.play.server.S13PacketDestroyEntities;
import net.minecraft.network.play.server.S14PacketEntity;
import net.minecraft.network.play.server.S18PacketEntityTeleport;
import net.minecraft.network.play.server.S19PacketEntityHeadLook;
import net.minecraft.network.play.server.S19PacketEntityStatus;
import net.minecraft.network.play.server.S1BPacketEntityAttach;
import net.minecraft.network.play.server.S1CPacketEntityMetadata;
import net.minecraft.network.play.server.S1DPacketEntityEffect;
import net.minecraft.network.play.server.S1EPacketRemoveEntityEffect;
import net.minecraft.network.play.server.S1FPacketSetExperience;
import net.minecraft.network.play.server.S20PacketEntityProperties;
import net.minecraft.network.play.server.S21PacketChunkData;
import net.minecraft.network.play.server.S22PacketMultiBlockChange;
import net.minecraft.network.play.server.S22PacketMultiBlockChange$_to;
import net.minecraft.network.play.server.S23PacketBlockChange;
import net.minecraft.network.play.server.S24PacketBlockAction;
import net.minecraft.network.play.server.S25PacketBlockBreakAnim;
import net.minecraft.network.play.server.S26PacketMapChunkBulk;
import net.minecraft.network.play.server.S27PacketExplosion;
import net.minecraft.network.play.server.S28PacketEffect;
import net.minecraft.network.play.server.S29PacketSoundEffect;
import net.minecraft.network.play.server.S2APacketParticles;
import net.minecraft.network.play.server.S2BPacketChangeGameState;
import net.minecraft.network.play.server.S2CPacketSpawnGlobalEntity;
import net.minecraft.network.play.server.S2DPacketOpenWindow;
import net.minecraft.network.play.server.S2EPacketCloseWindow;
import net.minecraft.network.play.server.S2FPacketSetSlot;
import net.minecraft.network.play.server.S30PacketWindowItems;
import net.minecraft.network.play.server.S31PacketWindowProperty;
import net.minecraft.network.play.server.S32PacketConfirmTransaction;
import net.minecraft.network.play.server.S33PacketUpdateSign;
import net.minecraft.network.play.server.S34PacketMaps;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.network.play.server.S36PacketSignEditorOpen;
import net.minecraft.network.play.server.S37PacketStatistics;
import net.minecraft.network.play.server.S38PacketPlayerListItem;
import net.minecraft.network.play.server.S39PacketPlayerAbilities;
import net.minecraft.network.play.server.S3APacketTabComplete;
import net.minecraft.network.play.server.S3BPacketScoreboardObjective;
import net.minecraft.network.play.server.S3CPacketUpdateScore;
import net.minecraft.network.play.server.S3DPacketDisplayScoreboard;
import net.minecraft.network.play.server.S3EPacketTeams;
import net.minecraft.network.play.server.S3FPacketCustomPayload;
import net.minecraft.network.play.server.S40PacketDisconnect;
import net.minecraft.network.play.server.S41PacketServerDifficulty;
import net.minecraft.network.play.server.S42PacketCombatEvent;
import net.minecraft.network.play.server.S43PacketCamera;
import net.minecraft.network.play.server.S44PacketWorldBorder;
import net.minecraft.network.play.server.S45PacketTitle;
import net.minecraft.network.play.server.S46PacketSetCompressionLevel;
import net.minecraft.network.play.server.S47PacketPlayerListHeaderFooter;
import net.minecraft.network.play.server.S48PacketResourcePackSend;
import net.minecraft.network.play.server.S49PacketUpdateEntityNBT;
import net.minecraft.tileentity.TileEntitySign;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class p_k implements jsv {
   private static final Logger xfk;
   private final hv0 _us;
   private final GameProfile usb;
   private final ShaderHelper zap;
   private Minecraft bol;
   private WorldClient y40;
   private boolean t2e;
   private final Map z5d = Maps.newHashMap();
   public int nyf = 20;
   private boolean jqy = false;
   private final Random g1h = new Random();
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public p_k(Minecraft var1, ShaderHelper var2, hv0 var3, GameProfile var4) {
      this.bol = var1;
      this.zap = var2;
      this._us = var3;
      this.usb = var4;
   }

   public void qi4() {
      this.y40 = null;
   }

   @Override
   public void yuf(S01PacketJoinGame var1) {
      long var2 = a ^ 88760609256653L;

      lxl var10000;
      lxl var10001;
      String var10002;
      label17: {
         try {
            et9.hqd(var1, this, this.bol);
            this.bol.l7q = new hh6(this.bol, this);
            this.y40 = new WorldClient(this, new h50(0L, var1.xoj(), false, var1.alc(), var1.v8i()), var1.z6k(), var1.dn2(), this.bol.ba0);
            this.bol.oxn.t6c = var1.dn2();
            this.bol.jk1(this.y40);
            this.bol.vg8.ohd = var1.z6k();
            this.bol.z2i(new ph6(this));
            this.bol.vg8.i6d(var1.ey8());
            this.nyf = var1.zb2();
            this.bol.vg8.zw1(var1.zbl());
            this.bol.l7q.qm5(var1.xoj());
            this.bol.oxn.xoa();
            this._us.k7f(new C17PacketCustomPayload(a<"h">(15606, 2117950744907191800L ^ var2), new nfj(Unpooled.buffer()).p3z(g4v.a68())));
            ClientState.eo5 = false;
            EventBus.esg(new Event());
            var10000 = new lxl;
            var10001 = var10000;
            if (ClientState.qkk.elh != null) {
               var10002 = ClientState.qkk.elh.s4c;
               break label17;
            }
         } catch (IllegalStateException var4) {
            throw a(var4);
         }

         var10002 = null;
      }

      var10001./* $VF: Unable to resugar constructor */<init>(var10002);
      EventBus.esg(var10000);
   }

   @Override
   public void tif(S0EPacketSpawnObject param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: aload 0
      // 002: aload 0
      // 003: getfield p_k.bol Lc05;
      // 006: invokestatic et9.hqd (Lmz2;Lyw3;Llg9;)V
      // 009: aload 1
      // 00a: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.n2n ()I
      // 00d: i2d
      // 00e: ldc2_w 32.0
      // 011: ddiv
      // 012: dstore 3
      // 013: aload 1
      // 014: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.gqw ()I
      // 017: i2d
      // 018: ldc2_w 32.0
      // 01b: ddiv
      // 01c: dstore 5
      // 01e: aload 1
      // 01f: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.z7b ()I
      // 022: i2d
      // 023: ldc2_w 32.0
      // 026: ddiv
      // 027: dstore 7
      // 029: invokestatic OpaquePredicate.c ()I
      // 02c: aconst_null
      // 02d: astore 9
      // 02f: istore 2
      // 030: aload 1
      // 031: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.tg4 ()I
      // 034: bipush 10
      // 036: iload 2
      // 037: ifne 062
      // 03a: if_icmpne 05c
      // 03d: goto 044
      // 040: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 043: athrow
      // 044: aload 0
      // 045: getfield p_k.y40 Lkh3;
      // 048: dload 3
      // 049: dload 5
      // 04b: dload 7
      // 04d: aload 1
      // 04e: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.ugk ()I
      // 051: invokestatic _f3$c3d.ja1 (I)L_f3$c3d;
      // 054: invokestatic _f3._cl (Lt9d;DDDL_f3$c3d;)L_f3;
      // 057: astore 9
      // 059: goto 456
      // 05c: aload 1
      // 05d: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.tg4 ()I
      // 060: bipush 90
      // 062: iload 2
      // 063: ifne 0aa
      // 066: if_icmpne 0a4
      // 069: goto 070
      // 06c: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06f: athrow
      // 070: aload 0
      // 071: getfield p_k.y40 Lkh3;
      // 074: aload 1
      // 075: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.ugk ()I
      // 078: invokevirtual WorldClient.oks (I)Li2h;
      // 07b: astore 10
      // 07d: aload 10
      // 07f: instanceof ha9
      // 082: ifeq 09c
      // 085: new sj_
      // 088: dup
      // 089: aload 0
      // 08a: getfield p_k.y40 Lkh3;
      // 08d: dload 3
      // 08e: dload 5
      // 090: dload 7
      // 092: aload 10
      // 094: checkcast ha9
      // 097: invokespecial sj_.<init> (Lt9d;DDDLha9;)V
      // 09a: astore 9
      // 09c: aload 1
      // 09d: bipush 0
      // 09e: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.a4t (I)V
      // 0a1: goto 456
      // 0a4: aload 1
      // 0a5: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.tg4 ()I
      // 0a8: bipush 60
      // 0aa: iload 2
      // 0ab: ifne 0d3
      // 0ae: if_icmpne 0cd
      // 0b1: goto 0b8
      // 0b4: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b7: athrow
      // 0b8: new hy9
      // 0bb: dup
      // 0bc: aload 0
      // 0bd: getfield p_k.y40 Lkh3;
      // 0c0: dload 3
      // 0c1: dload 5
      // 0c3: dload 7
      // 0c5: invokespecial hy9.<init> (Lt9d;DDD)V
      // 0c8: astore 9
      // 0ca: goto 456
      // 0cd: aload 1
      // 0ce: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.tg4 ()I
      // 0d1: bipush 61
      // 0d3: iload 2
      // 0d4: ifne 0fc
      // 0d7: if_icmpne 0f6
      // 0da: goto 0e1
      // 0dd: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e0: athrow
      // 0e1: new txr
      // 0e4: dup
      // 0e5: aload 0
      // 0e6: getfield p_k.y40 Lkh3;
      // 0e9: dload 3
      // 0ea: dload 5
      // 0ec: dload 7
      // 0ee: invokespecial txr.<init> (Lt9d;DDD)V
      // 0f1: astore 9
      // 0f3: goto 456
      // 0f6: aload 1
      // 0f7: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.tg4 ()I
      // 0fa: bipush 71
      // 0fc: iload 2
      // 0fd: ifne 141
      // 100: if_icmpne 13b
      // 103: goto 10a
      // 106: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 109: athrow
      // 10a: new co7
      // 10d: dup
      // 10e: aload 0
      // 10f: getfield p_k.y40 Lkh3;
      // 112: new mew
      // 115: dup
      // 116: dload 3
      // 117: invokestatic fe6.jqf (D)I
      // 11a: dload 5
      // 11c: invokestatic fe6.jqf (D)I
      // 11f: dload 7
      // 121: invokestatic fe6.jqf (D)I
      // 124: invokespecial mew.<init> (III)V
      // 127: aload 1
      // 128: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.ugk ()I
      // 12b: invokestatic vt2.bm6 (I)Lvt2;
      // 12e: invokespecial co7.<init> (Lt9d;Lmew;Lvt2;)V
      // 131: astore 9
      // 133: aload 1
      // 134: bipush 0
      // 135: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.a4t (I)V
      // 138: goto 456
      // 13b: aload 1
      // 13c: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.tg4 ()I
      // 13f: bipush 77
      // 141: iload 2
      // 142: ifne 17f
      // 145: if_icmpne 179
      // 148: goto 14f
      // 14b: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14e: athrow
      // 14f: new ugc
      // 152: dup
      // 153: aload 0
      // 154: getfield p_k.y40 Lkh3;
      // 157: new mew
      // 15a: dup
      // 15b: dload 3
      // 15c: invokestatic fe6.jqf (D)I
      // 15f: dload 5
      // 161: invokestatic fe6.jqf (D)I
      // 164: dload 7
      // 166: invokestatic fe6.jqf (D)I
      // 169: invokespecial mew.<init> (III)V
      // 16c: invokespecial ugc.<init> (Lt9d;Lmew;)V
      // 16f: astore 9
      // 171: aload 1
      // 172: bipush 0
      // 173: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.a4t (I)V
      // 176: goto 456
      // 179: aload 1
      // 17a: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.tg4 ()I
      // 17d: bipush 65
      // 17f: iload 2
      // 180: ifne 1a8
      // 183: if_icmpne 1a2
      // 186: goto 18d
      // 189: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18c: athrow
      // 18d: new jv0
      // 190: dup
      // 191: aload 0
      // 192: getfield p_k.y40 Lkh3;
      // 195: dload 3
      // 196: dload 5
      // 198: dload 7
      // 19a: invokespecial jv0.<init> (Lt9d;DDD)V
      // 19d: astore 9
      // 19f: goto 456
      // 1a2: aload 1
      // 1a3: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.tg4 ()I
      // 1a6: bipush 72
      // 1a8: iload 2
      // 1a9: ifne 1d1
      // 1ac: if_icmpne 1cb
      // 1af: goto 1b6
      // 1b2: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b5: athrow
      // 1b6: new db9
      // 1b9: dup
      // 1ba: aload 0
      // 1bb: getfield p_k.y40 Lkh3;
      // 1be: dload 3
      // 1bf: dload 5
      // 1c1: dload 7
      // 1c3: invokespecial db9.<init> (Lt9d;DDD)V
      // 1c6: astore 9
      // 1c8: goto 456
      // 1cb: aload 1
      // 1cc: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.tg4 ()I
      // 1cf: bipush 76
      // 1d1: iload 2
      // 1d2: ifne 1fe
      // 1d5: if_icmpne 1f8
      // 1d8: goto 1df
      // 1db: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1de: athrow
      // 1df: new nl9
      // 1e2: dup
      // 1e3: aload 0
      // 1e4: getfield p_k.y40 Lkh3;
      // 1e7: dload 3
      // 1e8: dload 5
      // 1ea: dload 7
      // 1ec: aconst_null
      // 1ed: checkcast erg
      // 1f0: invokespecial nl9.<init> (Lt9d;DDDLerg;)V
      // 1f3: astore 9
      // 1f5: goto 456
      // 1f8: aload 1
      // 1f9: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.tg4 ()I
      // 1fc: bipush 63
      // 1fe: iload 2
      // 1ff: ifne 247
      // 202: if_icmpne 241
      // 205: goto 20c
      // 208: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20b: athrow
      // 20c: new wqh
      // 20f: dup
      // 210: aload 0
      // 211: getfield p_k.y40 Lkh3;
      // 214: dload 3
      // 215: dload 5
      // 217: dload 7
      // 219: aload 1
      // 21a: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.k8l ()I
      // 21d: i2d
      // 21e: ldc2_w 8000.0
      // 221: ddiv
      // 222: aload 1
      // 223: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.s13 ()I
      // 226: i2d
      // 227: ldc2_w 8000.0
      // 22a: ddiv
      // 22b: aload 1
      // 22c: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.k4u ()I
      // 22f: i2d
      // 230: ldc2_w 8000.0
      // 233: ddiv
      // 234: invokespecial wqh.<init> (Lt9d;DDDDDD)V
      // 237: astore 9
      // 239: aload 1
      // 23a: bipush 0
      // 23b: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.a4t (I)V
      // 23e: goto 456
      // 241: aload 1
      // 242: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.tg4 ()I
      // 245: bipush 64
      // 247: iload 2
      // 248: ifne 290
      // 24b: if_icmpne 28a
      // 24e: goto 255
      // 251: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 254: athrow
      // 255: new ka8
      // 258: dup
      // 259: aload 0
      // 25a: getfield p_k.y40 Lkh3;
      // 25d: dload 3
      // 25e: dload 5
      // 260: dload 7
      // 262: aload 1
      // 263: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.k8l ()I
      // 266: i2d
      // 267: ldc2_w 8000.0
      // 26a: ddiv
      // 26b: aload 1
      // 26c: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.s13 ()I
      // 26f: i2d
      // 270: ldc2_w 8000.0
      // 273: ddiv
      // 274: aload 1
      // 275: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.k4u ()I
      // 278: i2d
      // 279: ldc2_w 8000.0
      // 27c: ddiv
      // 27d: invokespecial ka8.<init> (Lt9d;DDDDDD)V
      // 280: astore 9
      // 282: aload 1
      // 283: bipush 0
      // 284: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.a4t (I)V
      // 287: goto 456
      // 28a: aload 1
      // 28b: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.tg4 ()I
      // 28e: bipush 66
      // 290: iload 2
      // 291: ifne 2d9
      // 294: if_icmpne 2d3
      // 297: goto 29e
      // 29a: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29d: athrow
      // 29e: new k7p
      // 2a1: dup
      // 2a2: aload 0
      // 2a3: getfield p_k.y40 Lkh3;
      // 2a6: dload 3
      // 2a7: dload 5
      // 2a9: dload 7
      // 2ab: aload 1
      // 2ac: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.k8l ()I
      // 2af: i2d
      // 2b0: ldc2_w 8000.0
      // 2b3: ddiv
      // 2b4: aload 1
      // 2b5: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.s13 ()I
      // 2b8: i2d
      // 2b9: ldc2_w 8000.0
      // 2bc: ddiv
      // 2bd: aload 1
      // 2be: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.k4u ()I
      // 2c1: i2d
      // 2c2: ldc2_w 8000.0
      // 2c5: ddiv
      // 2c6: invokespecial k7p.<init> (Lt9d;DDDDDD)V
      // 2c9: astore 9
      // 2cb: aload 1
      // 2cc: bipush 0
      // 2cd: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.a4t (I)V
      // 2d0: goto 456
      // 2d3: aload 1
      // 2d4: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.tg4 ()I
      // 2d7: bipush 62
      // 2d9: iload 2
      // 2da: ifne 302
      // 2dd: if_icmpne 2fc
      // 2e0: goto 2e7
      // 2e3: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e6: athrow
      // 2e7: new dur
      // 2ea: dup
      // 2eb: aload 0
      // 2ec: getfield p_k.y40 Lkh3;
      // 2ef: dload 3
      // 2f0: dload 5
      // 2f2: dload 7
      // 2f4: invokespecial dur.<init> (Lt9d;DDD)V
      // 2f7: astore 9
      // 2f9: goto 456
      // 2fc: aload 1
      // 2fd: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.tg4 ()I
      // 300: bipush 73
      // 302: iload 2
      // 303: ifne 334
      // 306: if_icmpne 32e
      // 309: goto 310
      // 30c: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 30f: athrow
      // 310: new nuq
      // 313: dup
      // 314: aload 0
      // 315: getfield p_k.y40 Lkh3;
      // 318: dload 3
      // 319: dload 5
      // 31b: dload 7
      // 31d: aload 1
      // 31e: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.ugk ()I
      // 321: invokespecial nuq.<init> (Lt9d;DDDI)V
      // 324: astore 9
      // 326: aload 1
      // 327: bipush 0
      // 328: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.a4t (I)V
      // 32b: goto 456
      // 32e: aload 1
      // 32f: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.tg4 ()I
      // 332: bipush 75
      // 334: iload 2
      // 335: ifne 361
      // 338: if_icmpne 35c
      // 33b: goto 342
      // 33e: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 341: athrow
      // 342: new vdu
      // 345: dup
      // 346: aload 0
      // 347: getfield p_k.y40 Lkh3;
      // 34a: dload 3
      // 34b: dload 5
      // 34d: dload 7
      // 34f: invokespecial vdu.<init> (Lt9d;DDD)V
      // 352: astore 9
      // 354: aload 1
      // 355: bipush 0
      // 356: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.a4t (I)V
      // 359: goto 456
      // 35c: aload 1
      // 35d: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.tg4 ()I
      // 360: bipush 1
      // 361: iload 2
      // 362: ifne 38a
      // 365: if_icmpne 384
      // 368: goto 36f
      // 36b: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36e: athrow
      // 36f: new w54
      // 372: dup
      // 373: aload 0
      // 374: getfield p_k.y40 Lkh3;
      // 377: dload 3
      // 378: dload 5
      // 37a: dload 7
      // 37c: invokespecial w54.<init> (Lt9d;DDD)V
      // 37f: astore 9
      // 381: goto 456
      // 384: aload 1
      // 385: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.tg4 ()I
      // 388: bipush 50
      // 38a: iload 2
      // 38b: ifne 3b7
      // 38e: if_icmpne 3b1
      // 391: goto 398
      // 394: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 397: athrow
      // 398: new pix
      // 39b: dup
      // 39c: aload 0
      // 39d: getfield p_k.y40 Lkh3;
      // 3a0: dload 3
      // 3a1: dload 5
      // 3a3: dload 7
      // 3a5: aconst_null
      // 3a6: checkcast Entity
      // 3a9: invokespecial pix.<init> (Lt9d;DDDLg_3;)V
      // 3ac: astore 9
      // 3ae: goto 456
      // 3b1: aload 1
      // 3b2: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.tg4 ()I
      // 3b5: bipush 78
      // 3b7: iload 2
      // 3b8: ifne 3e0
      // 3bb: if_icmpne 3da
      // 3be: goto 3c5
      // 3c1: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c4: athrow
      // 3c5: new h67
      // 3c8: dup
      // 3c9: aload 0
      // 3ca: getfield p_k.y40 Lkh3;
      // 3cd: dload 3
      // 3ce: dload 5
      // 3d0: dload 7
      // 3d2: invokespecial h67.<init> (Lt9d;DDD)V
      // 3d5: astore 9
      // 3d7: goto 456
      // 3da: aload 1
      // 3db: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.tg4 ()I
      // 3de: bipush 51
      // 3e0: iload 2
      // 3e1: ifne 408
      // 3e4: if_icmpne 403
      // 3e7: goto 3ee
      // 3ea: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3ed: athrow
      // 3ee: new edl
      // 3f1: dup
      // 3f2: aload 0
      // 3f3: getfield p_k.y40 Lkh3;
      // 3f6: dload 3
      // 3f7: dload 5
      // 3f9: dload 7
      // 3fb: invokespecial edl.<init> (Lt9d;DDD)V
      // 3fe: astore 9
      // 400: goto 456
      // 403: aload 1
      // 404: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.tg4 ()I
      // 407: bipush 2
      // 408: iload 2
      // 409: ifne 431
      // 40c: if_icmpne 42b
      // 40f: goto 416
      // 412: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 415: athrow
      // 416: new nvf
      // 419: dup
      // 41a: aload 0
      // 41b: getfield p_k.y40 Lkh3;
      // 41e: dload 3
      // 41f: dload 5
      // 421: dload 7
      // 423: invokespecial nvf.<init> (Lt9d;DDD)V
      // 426: astore 9
      // 428: goto 456
      // 42b: aload 1
      // 42c: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.tg4 ()I
      // 42f: bipush 70
      // 431: if_icmpne 456
      // 434: new vjf
      // 437: dup
      // 438: aload 0
      // 439: getfield p_k.y40 Lkh3;
      // 43c: dload 3
      // 43d: dload 5
      // 43f: dload 7
      // 441: aload 1
      // 442: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.ugk ()I
      // 445: ldc 65535
      // 447: nop
      // 448: iand
      // 449: invokestatic e0x.v1b (I)Lzfz;
      // 44c: invokespecial vjf.<init> (Lt9d;DDDLzfz;)V
      // 44f: astore 9
      // 451: aload 1
      // 452: bipush 0
      // 453: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.a4t (I)V
      // 456: aload 9
      // 458: iload 2
      // 459: ifne 4ae
      // 45c: ifnull 5a2
      // 45f: goto 466
      // 462: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 465: athrow
      // 466: aload 9
      // 468: aload 1
      // 469: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.n2n ()I
      // 46c: putfield EntityLivingBase.w12 I
      // 46f: aload 9
      // 471: aload 1
      // 472: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.gqw ()I
      // 475: putfield EntityLivingBase.hsa I
      // 478: aload 9
      // 47a: aload 1
      // 47b: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.z7b ()I
      // 47e: putfield EntityLivingBase.mvw I
      // 481: aload 9
      // 483: aload 1
      // 484: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.m3g ()I
      // 487: sipush 360
      // 48a: imul
      // 48b: i2f
      // 48c: ldc 256.0
      // 48e: nop
      // 48f: fdiv
      // 490: putfield EntityLivingBase.y2i F
      // 493: aload 9
      // 495: aload 1
      // 496: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.ft_ ()I
      // 499: sipush 360
      // 49c: imul
      // 49d: i2f
      // 49e: ldc 256.0
      // 4a0: nop
      // 4a1: fdiv
      // 4a2: putfield EntityLivingBase.x5k F
      // 4a5: aload 9
      // 4a7: goto 4ae
      // 4aa: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4ad: athrow
      // 4ae: invokevirtual EntityLivingBase.u_g ()[Li2h;
      // 4b1: astore 10
      // 4b3: iload 2
      // 4b4: ifne 515
      // 4b7: aload 10
      // 4b9: ifnull 4ff
      // 4bc: goto 4c3
      // 4bf: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4c2: athrow
      // 4c3: aload 1
      // 4c4: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.a1o ()I
      // 4c7: aload 9
      // 4c9: invokevirtual EntityLivingBase.jwu ()I
      // 4cc: isub
      // 4cd: istore 11
      // 4cf: bipush 0
      // 4d0: istore 12
      // 4d2: iload 12
      // 4d4: aload 10
      // 4d6: arraylength
      // 4d7: if_icmpge 4ff
      // 4da: aload 10
      // 4dc: iload 12
      // 4de: aaload
      // 4df: aload 10
      // 4e1: iload 12
      // 4e3: aaload
      // 4e4: invokevirtual EntityLivingBase.jwu ()I
      // 4e7: iload 11
      // 4e9: iadd
      // 4ea: invokevirtual EntityLivingBase.i6d (I)V
      // 4ed: iinc 12 1
      // 4f0: iload 2
      // 4f1: ifne 515
      // 4f4: iload 2
      // 4f5: ifeq 4d2
      // 4f8: goto 4ff
      // 4fb: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4fe: athrow
      // 4ff: aload 9
      // 501: aload 1
      // 502: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.a1o ()I
      // 505: invokevirtual EntityLivingBase.i6d (I)V
      // 508: aload 0
      // 509: getfield p_k.y40 Lkh3;
      // 50c: aload 1
      // 50d: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.a1o ()I
      // 510: aload 9
      // 512: invokevirtual WorldClient.fih (ILi2h;)V
      // 515: aload 1
      // 516: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.ugk ()I
      // 519: iload 2
      // 51a: ifne 532
      // 51d: ifle 5a2
      // 520: goto 527
      // 523: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 526: athrow
      // 527: aload 1
      // 528: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.tg4 ()I
      // 52b: goto 532
      // 52e: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 531: athrow
      // 532: bipush 60
      // 534: if_icmpne 582
      // 537: aload 0
      // 538: getfield p_k.y40 Lkh3;
      // 53b: aload 1
      // 53c: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.ugk ()I
      // 53f: invokevirtual WorldClient.oks (I)Li2h;
      // 542: astore 11
      // 544: aload 11
      // 546: iload 2
      // 547: ifne 584
      // 54a: instanceof Entity
      // 54d: ifeq 582
      // 550: goto 557
      // 553: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 556: athrow
      // 557: aload 9
      // 559: iload 2
      // 55a: ifne 584
      // 55d: goto 564
      // 560: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 563: athrow
      // 564: instanceof hy9
      // 567: ifeq 582
      // 56a: goto 571
      // 56d: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 570: athrow
      // 571: aload 9
      // 573: checkcast hy9
      // 576: aload 11
      // 578: putfield hy9.k_d Li2h;
      // 57b: goto 582
      // 57e: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 581: athrow
      // 582: aload 9
      // 584: aload 1
      // 585: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.k8l ()I
      // 588: i2d
      // 589: ldc2_w 8000.0
      // 58c: ddiv
      // 58d: aload 1
      // 58e: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.s13 ()I
      // 591: i2d
      // 592: ldc2_w 8000.0
      // 595: ddiv
      // 596: aload 1
      // 597: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.k4u ()I
      // 59a: i2d
      // 59b: ldc2_w 8000.0
      // 59e: ddiv
      // 59f: invokevirtual EntityLivingBase.lmm (DDD)V
      // 5a2: return
   }

   @Override
   public void xwb(S11PacketSpawnExperienceOrb var1) {
      et9.hqd(var1, this, this.bol);
      uno var2 = new uno(this.y40, (double)var1.orx() / 32.0, (double)var1.rp4() / 32.0, (double)var1.x0_() / 32.0, var1.na2());
      var2.w12 = var1.orx();
      var2.hsa = var1.rp4();
      var2.mvw = var1.x0_();
      var2.x5k = 0.0F;
      var2.y2i = 0.0F;
      var2.i6d(var1.nes());
      this.y40.fih(var1.nes(), var2);
   }

   @Override
   public void hq1(S2CPacketSpawnGlobalEntity param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: aload 0
      // 02: aload 0
      // 03: getfield p_k.bol Lc05;
      // 06: invokestatic et9.hqd (Lmz2;Lyw3;Llg9;)V
      // 09: invokestatic OpaquePredicate.b ()I
      // 0c: aload 1
      // 0d: invokevirtual net/minecraft/network/play/server/S2CPacketSpawnGlobalEntity.d8n ()I
      // 10: i2d
      // 11: ldc2_w 32.0
      // 14: ddiv
      // 15: dstore 3
      // 16: aload 1
      // 17: invokevirtual net/minecraft/network/play/server/S2CPacketSpawnGlobalEntity.mim ()I
      // 1a: i2d
      // 1b: ldc2_w 32.0
      // 1e: ddiv
      // 1f: dstore 5
      // 21: aload 1
      // 22: invokevirtual net/minecraft/network/play/server/S2CPacketSpawnGlobalEntity.w73 ()I
      // 25: i2d
      // 26: ldc2_w 32.0
      // 29: ddiv
      // 2a: dstore 7
      // 2c: istore 2
      // 2d: aconst_null
      // 2e: astore 9
      // 30: aload 1
      // 31: invokevirtual net/minecraft/network/play/server/S2CPacketSpawnGlobalEntity.is0 ()I
      // 34: bipush 1
      // 35: if_icmpne 4a
      // 38: new _6b
      // 3b: dup
      // 3c: aload 0
      // 3d: getfield p_k.y40 Lkh3;
      // 40: dload 3
      // 41: dload 5
      // 43: dload 7
      // 45: invokespecial _6b.<init> (Lt9d;DDD)V
      // 48: astore 9
      // 4a: aload 9
      // 4c: iload 2
      // 4d: ifeq 8a
      // 50: ifnull 9b
      // 53: goto 5a
      // 56: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 59: athrow
      // 5a: aload 9
      // 5c: aload 1
      // 5d: invokevirtual net/minecraft/network/play/server/S2CPacketSpawnGlobalEntity.d8n ()I
      // 60: putfield EntityLivingBase.w12 I
      // 63: aload 9
      // 65: aload 1
      // 66: invokevirtual net/minecraft/network/play/server/S2CPacketSpawnGlobalEntity.mim ()I
      // 69: putfield EntityLivingBase.hsa I
      // 6c: aload 9
      // 6e: aload 1
      // 6f: invokevirtual net/minecraft/network/play/server/S2CPacketSpawnGlobalEntity.w73 ()I
      // 72: putfield EntityLivingBase.mvw I
      // 75: aload 9
      // 77: fconst_0
      // 78: putfield EntityLivingBase.x5k F
      // 7b: aload 9
      // 7d: fconst_0
      // 7e: putfield EntityLivingBase.y2i F
      // 81: aload 9
      // 83: goto 8a
      // 86: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 89: athrow
      // 8a: aload 1
      // 8b: invokevirtual net/minecraft/network/play/server/S2CPacketSpawnGlobalEntity.hrc ()I
      // 8e: invokevirtual EntityLivingBase.i6d (I)V
      // 91: aload 0
      // 92: getfield p_k.y40 Lkh3;
      // 95: aload 9
      // 97: invokevirtual WorldClient._b8 (Li2h;)Z
      // 9a: pop
      // 9b: return
   }

   @Override
   public void qsp(S10PacketSpawnPainting var1) {
      et9.hqd(var1, this, this.bol);
      n0_ var2 = new n0_(this.y40, var1.htd(), var1.saz(), var1.q0d());
      this.y40.fih(var1.hkk(), var2);
   }

   @Override
   public void uia(S12PacketEntityVelocity var1) {
      et9.hqd(var1, this, this.bol);
      int var10000 = OpaquePredicate.c();
      EntityLivingBase var3 = this.y40.oks(var1.ybp());
      int var2 = var10000;

      label20: {
         try {
            var5 = var3;
            if (var2 != 0) {
               break label20;
            }

            if (var3 == null) {
               return;
            }
         } catch (IllegalStateException var4) {
            throw a(var4);
         }

         var5 = var3;
      }

      var5.lmm((double)var1.ywv() / 8000.0, (double)var1.hi3() / 8000.0, (double)var1.al8() / 8000.0);
   }

   @Override
   public void dgq(S1CPacketEntityMetadata param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: aload 0
      // 02: aload 0
      // 03: getfield p_k.bol Lc05;
      // 06: invokestatic et9.hqd (Lmz2;Lyw3;Llg9;)V
      // 09: aload 0
      // 0a: getfield p_k.y40 Lkh3;
      // 0d: aload 1
      // 0e: invokevirtual net/minecraft/network/play/server/S1CPacketEntityMetadata.n38 ()I
      // 11: invokevirtual WorldClient.oks (I)Li2h;
      // 14: astore 2
      // 15: aload 2
      // 16: ifnull 39
      // 19: aload 1
      // 1a: invokevirtual net/minecraft/network/play/server/S1CPacketEntityMetadata.cnt ()Ljava/util/List;
      // 1d: ifnull 39
      // 20: goto 27
      // 23: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26: athrow
      // 27: aload 2
      // 28: invokevirtual EntityLivingBase.a0c ()Lwl1;
      // 2b: aload 1
      // 2c: invokevirtual net/minecraft/network/play/server/S1CPacketEntityMetadata.cnt ()Ljava/util/List;
      // 2f: invokevirtual wl1.z3t (Ljava/util/List;)V
      // 32: goto 39
      // 35: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 38: athrow
      // 39: return
   }

   @Override
   public void rio(S0CPacketSpawnPlayer param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: aload 0
      // 002: aload 0
      // 003: getfield p_k.bol Lc05;
      // 006: invokestatic et9.hqd (Lmz2;Lyw3;Llg9;)V
      // 009: aload 1
      // 00a: invokevirtual net/minecraft/network/play/server/S0CPacketSpawnPlayer.dzt ()I
      // 00d: i2d
      // 00e: ldc2_w 32.0
      // 011: ddiv
      // 012: dstore 3
      // 013: invokestatic OpaquePredicate.c ()I
      // 016: aload 1
      // 017: invokevirtual net/minecraft/network/play/server/S0CPacketSpawnPlayer.pxw ()I
      // 01a: i2d
      // 01b: ldc2_w 32.0
      // 01e: ddiv
      // 01f: dstore 5
      // 021: aload 1
      // 022: invokevirtual net/minecraft/network/play/server/S0CPacketSpawnPlayer._bf ()I
      // 025: i2d
      // 026: ldc2_w 32.0
      // 029: ddiv
      // 02a: dstore 7
      // 02c: aload 1
      // 02d: invokevirtual net/minecraft/network/play/server/S0CPacketSpawnPlayer.gx_ ()B
      // 030: sipush 360
      // 033: imul
      // 034: i2f
      // 035: ldc 256.0
      // 037: nop
      // 038: fdiv
      // 039: fstore 9
      // 03b: aload 1
      // 03c: invokevirtual net/minecraft/network/play/server/S0CPacketSpawnPlayer.p1r ()B
      // 03f: sipush 360
      // 042: imul
      // 043: i2f
      // 044: ldc 256.0
      // 046: nop
      // 047: fdiv
      // 048: fstore 10
      // 04a: aconst_null
      // 04b: astore 11
      // 04d: new hpk
      // 050: dup
      // 051: aload 0
      // 052: getfield p_k.bol Lc05;
      // 055: getfield Minecraft.tij Lkh3;
      // 058: aload 0
      // 059: aload 1
      // 05a: invokevirtual net/minecraft/network/play/server/S0CPacketSpawnPlayer.j_x ()Ljava/util/UUID;
      // 05d: invokevirtual p_k.txu (Ljava/util/UUID;)Lhv2;
      // 060: invokevirtual hv2.pbs ()Lcom/mojang/authlib/GameProfile;
      // 063: invokespecial hpk.<init> (Lt9d;Lcom/mojang/authlib/GameProfile;)V
      // 066: astore 11
      // 068: aload 11
      // 06a: aload 11
      // 06c: aload 11
      // 06e: aload 1
      // 06f: invokevirtual net/minecraft/network/play/server/S0CPacketSpawnPlayer.dzt ()I
      // 072: dup_x1
      // 073: putfield hpk.w12 I
      // 076: i2d
      // 077: dup2_x1
      // 078: putfield hpk.ivp D
      // 07b: putfield hpk.bc1 D
      // 07e: aload 11
      // 080: aload 11
      // 082: aload 11
      // 084: aload 1
      // 085: invokevirtual net/minecraft/network/play/server/S0CPacketSpawnPlayer.pxw ()I
      // 088: dup_x1
      // 089: putfield hpk.hsa I
      // 08c: i2d
      // 08d: dup2_x1
      // 08e: putfield hpk.c54 D
      // 091: putfield hpk.o_z D
      // 094: aload 11
      // 096: aload 11
      // 098: aload 11
      // 09a: aload 1
      // 09b: invokevirtual net/minecraft/network/play/server/S0CPacketSpawnPlayer._bf ()I
      // 09e: dup_x1
      // 09f: putfield hpk.mvw I
      // 0a2: i2d
      // 0a3: dup2_x1
      // 0a4: putfield hpk.e2b D
      // 0a7: putfield hpk.a4d D
      // 0aa: istore 2
      // 0ab: aload 1
      // 0ac: invokevirtual net/minecraft/network/play/server/S0CPacketSpawnPlayer.collectTargets ()I
      // 0af: istore 12
      // 0b1: iload 2
      // 0b2: ifne 0da
      // 0b5: iload 12
      // 0b7: ifne 0de
      // 0ba: goto 0c1
      // 0bd: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c0: athrow
      // 0c1: aload 11
      // 0c3: getfield hpk.up_ Ljnq;
      // 0c6: getfield jnq.c41 [Lerg;
      // 0c9: aload 11
      // 0cb: getfield hpk.up_ Ljnq;
      // 0ce: getfield jnq.nb5 I
      // 0d1: aconst_null
      // 0d2: aastore
      // 0d3: goto 0da
      // 0d6: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d9: athrow
      // 0da: iload 2
      // 0db: ifeq 104
      // 0de: aload 11
      // 0e0: getfield hpk.up_ Ljnq;
      // 0e3: getfield jnq.c41 [Lerg;
      // 0e6: aload 11
      // 0e8: getfield hpk.up_ Ljnq;
      // 0eb: getfield jnq.nb5 I
      // 0ee: new erg
      // 0f1: dup
      // 0f2: iload 12
      // 0f4: invokestatic u7m.ltr (I)Lu7m;
      // 0f7: bipush 1
      // 0f8: bipush 0
      // 0f9: invokespecial erg.<init> (Lu7m;II)V
      // 0fc: aastore
      // 0fd: goto 104
      // 100: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 103: athrow
      // 104: aload 11
      // 106: dload 3
      // 107: dload 5
      // 109: dload 7
      // 10b: fload 9
      // 10d: fload 10
      // 10f: invokevirtual hpk.xe8 (DDDFF)V
      // 112: aload 0
      // 113: getfield p_k.y40 Lkh3;
      // 116: aload 1
      // 117: invokevirtual net/minecraft/network/play/server/S0CPacketSpawnPlayer.bog ()I
      // 11a: aload 11
      // 11c: invokevirtual WorldClient.fih (ILi2h;)V
      // 11f: aload 1
      // 120: invokevirtual net/minecraft/network/play/server/S0CPacketSpawnPlayer.io7 ()Ljava/util/List;
      // 123: astore 13
      // 125: aload 13
      // 127: ifnull 13b
      // 12a: aload 11
      // 12c: invokevirtual hpk.a0c ()Lwl1;
      // 12f: aload 13
      // 131: invokevirtual wl1.z3t (Ljava/util/List;)V
      // 134: goto 13b
      // 137: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13a: athrow
      // 13b: return
   }

   @Override
   public void fch(S18PacketEntityTeleport param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: aload 0
      // 002: aload 0
      // 003: getfield p_k.bol Lc05;
      // 006: invokestatic et9.hqd (Lmz2;Lyw3;Llg9;)V
      // 009: invokestatic OpaquePredicate.b ()I
      // 00c: aload 0
      // 00d: getfield p_k.y40 Lkh3;
      // 010: aload 1
      // 011: invokevirtual net/minecraft/network/play/server/S18PacketEntityTeleport.imn ()I
      // 014: invokevirtual WorldClient.oks (I)Li2h;
      // 017: astore 3
      // 018: istore 2
      // 019: aload 3
      // 01a: iload 2
      // 01b: ifeq 048
      // 01e: ifnull 128
      // 021: goto 028
      // 024: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 027: athrow
      // 028: aload 3
      // 029: aload 1
      // 02a: invokevirtual net/minecraft/network/play/server/S18PacketEntityTeleport.xgn ()I
      // 02d: putfield EntityLivingBase.w12 I
      // 030: aload 3
      // 031: aload 1
      // 032: invokevirtual net/minecraft/network/play/server/S18PacketEntityTeleport.toh ()I
      // 035: putfield EntityLivingBase.hsa I
      // 038: aload 3
      // 039: aload 1
      // 03a: invokevirtual net/minecraft/network/play/server/S18PacketEntityTeleport.toj ()I
      // 03d: putfield EntityLivingBase.mvw I
      // 040: aload 3
      // 041: goto 048
      // 044: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 047: athrow
      // 048: getfield EntityLivingBase.w12 I
      // 04b: i2d
      // 04c: ldc2_w 32.0
      // 04f: ddiv
      // 050: dstore 4
      // 052: aload 3
      // 053: getfield EntityLivingBase.hsa I
      // 056: i2d
      // 057: ldc2_w 32.0
      // 05a: ddiv
      // 05b: dstore 6
      // 05d: aload 3
      // 05e: getfield EntityLivingBase.mvw I
      // 061: i2d
      // 062: ldc2_w 32.0
      // 065: ddiv
      // 066: dstore 8
      // 068: aload 1
      // 069: invokevirtual net/minecraft/network/play/server/S18PacketEntityTeleport.oxy ()B
      // 06c: sipush 360
      // 06f: imul
      // 070: i2f
      // 071: ldc 256.0
      // 073: nop
      // 074: fdiv
      // 075: fstore 10
      // 077: aload 1
      // 078: invokevirtual net/minecraft/network/play/server/S18PacketEntityTeleport.zw8 ()B
      // 07b: sipush 360
      // 07e: imul
      // 07f: i2f
      // 080: ldc 256.0
      // 082: nop
      // 083: fdiv
      // 084: fstore 11
      // 086: aload 3
      // 087: iload 2
      // 088: ifeq 111
      // 08b: getfield EntityLivingBase.o2v D
      // 08e: dload 4
      // 090: dsub
      // 091: invokestatic java/lang/Math.abs (D)D
      // 094: ldc2_w 0.03125
      // 097: dcmpg
      // 098: ifge 109
      // 09b: goto 0a2
      // 09e: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a1: athrow
      // 0a2: aload 3
      // 0a3: iload 2
      // 0a4: ifeq 111
      // 0a7: goto 0ae
      // 0aa: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ad: athrow
      // 0ae: getfield EntityLivingBase.kfp D
      // 0b1: dload 6
      // 0b3: dsub
      // 0b4: invokestatic java/lang/Math.abs (D)D
      // 0b7: ldc2_w 0.015625
      // 0ba: dcmpg
      // 0bb: ifge 109
      // 0be: goto 0c5
      // 0c1: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c4: athrow
      // 0c5: aload 3
      // 0c6: iload 2
      // 0c7: ifeq 111
      // 0ca: goto 0d1
      // 0cd: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d0: athrow
      // 0d1: getfield EntityLivingBase.vbd D
      // 0d4: dload 8
      // 0d6: dsub
      // 0d7: invokestatic java/lang/Math.abs (D)D
      // 0da: ldc2_w 0.03125
      // 0dd: dcmpg
      // 0de: ifge 109
      // 0e1: goto 0e8
      // 0e4: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e7: athrow
      // 0e8: aload 3
      // 0e9: aload 3
      // 0ea: getfield EntityLivingBase.o2v D
      // 0ed: aload 3
      // 0ee: getfield EntityLivingBase.kfp D
      // 0f1: aload 3
      // 0f2: getfield EntityLivingBase.vbd D
      // 0f5: fload 10
      // 0f7: fload 11
      // 0f9: bipush 3
      // 0fa: bipush 1
      // 0fb: invokevirtual EntityLivingBase.ltu (DDDFFIZ)V
      // 0fe: iload 2
      // 0ff: ifne 120
      // 102: goto 109
      // 105: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 108: athrow
      // 109: aload 3
      // 10a: goto 111
      // 10d: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 110: athrow
      // 111: dload 4
      // 113: dload 6
      // 115: dload 8
      // 117: fload 10
      // 119: fload 11
      // 11b: bipush 3
      // 11c: bipush 1
      // 11d: invokevirtual EntityLivingBase.ltu (DDDFFIZ)V
      // 120: aload 3
      // 121: aload 1
      // 122: invokevirtual net/minecraft/network/play/server/S18PacketEntityTeleport.any ()Z
      // 125: putfield EntityLivingBase.lfk Z
      // 128: return
   }

   @Override
   public void wjr(S09PacketHeldItemChange param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: aload 0
      // 06: aload 0
      // 07: getfield p_k.bol Lc05;
      // 0a: invokestatic et9.hqd (Lmz2;Lyw3;Llg9;)V
      // 0d: aload 1
      // 0e: invokevirtual net/minecraft/network/play/server/S09PacketHeldItemChange.q81 ()I
      // 11: iload 2
      // 12: ifne 2a
      // 15: iflt 48
      // 18: goto 1f
      // 1b: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: aload 1
      // 20: invokevirtual net/minecraft/network/play/server/S09PacketHeldItemChange.q81 ()I
      // 23: goto 2a
      // 26: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29: athrow
      // 2a: invokestatic jnq.jxk ()I
      // 2d: if_icmpge 48
      // 30: aload 0
      // 31: getfield p_k.bol Lc05;
      // 34: getfield Minecraft.vg8 Ll86;
      // 37: getfield EntityPlayerSP.up_ Ljnq;
      // 3a: aload 1
      // 3b: invokevirtual net/minecraft/network/play/server/S09PacketHeldItemChange.q81 ()I
      // 3e: putfield jnq.nb5 I
      // 41: goto 48
      // 44: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 47: athrow
      // 48: return
   }

   @Override
   public void qlx(S14PacketEntity param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: aload 0
      // 02: aload 0
      // 03: getfield p_k.bol Lc05;
      // 06: invokestatic et9.hqd (Lmz2;Lyw3;Llg9;)V
      // 09: invokestatic OpaquePredicate.b ()I
      // 0c: aload 1
      // 0d: aload 0
      // 0e: getfield p_k.y40 Lkh3;
      // 11: invokevirtual net/minecraft/network/play/server/S14PacketEntity.dgu (Lt9d;)Li2h;
      // 14: astore 3
      // 15: istore 2
      // 16: aload 3
      // 17: iload 2
      // 18: ifeq 54
      // 1b: ifnull ea
      // 1e: goto 25
      // 21: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: aload 3
      // 26: dup
      // 27: getfield EntityLivingBase.w12 I
      // 2a: aload 1
      // 2b: invokevirtual net/minecraft/network/play/server/S14PacketEntity.cjz ()B
      // 2e: iadd
      // 2f: putfield EntityLivingBase.w12 I
      // 32: aload 3
      // 33: dup
      // 34: getfield EntityLivingBase.hsa I
      // 37: aload 1
      // 38: invokevirtual net/minecraft/network/play/server/S14PacketEntity.h2w ()B
      // 3b: iadd
      // 3c: putfield EntityLivingBase.hsa I
      // 3f: aload 3
      // 40: dup
      // 41: getfield EntityLivingBase.mvw I
      // 44: aload 1
      // 45: invokevirtual net/minecraft/network/play/server/S14PacketEntity._m2 ()B
      // 48: iadd
      // 49: putfield EntityLivingBase.mvw I
      // 4c: aload 3
      // 4d: goto 54
      // 50: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 53: athrow
      // 54: getfield EntityLivingBase.w12 I
      // 57: i2d
      // 58: ldc2_w 32.0
      // 5b: ddiv
      // 5c: dstore 4
      // 5e: aload 3
      // 5f: getfield EntityLivingBase.hsa I
      // 62: i2d
      // 63: ldc2_w 32.0
      // 66: ddiv
      // 67: dstore 6
      // 69: aload 3
      // 6a: getfield EntityLivingBase.mvw I
      // 6d: i2d
      // 6e: ldc2_w 32.0
      // 71: ddiv
      // 72: dstore 8
      // 74: aload 1
      // 75: invokevirtual net/minecraft/network/play/server/S14PacketEntity.mqm ()Z
      // 78: iload 2
      // 79: ifeq 95
      // 7c: ifeq 9d
      // 7f: goto 86
      // 82: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 85: athrow
      // 86: aload 1
      // 87: invokevirtual net/minecraft/network/play/server/S14PacketEntity.v4q ()B
      // 8a: sipush 360
      // 8d: imul
      // 8e: goto 95
      // 91: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 94: athrow
      // 95: i2f
      // 96: ldc 256.0
      // 98: nop
      // 99: fdiv
      // 9a: goto a1
      // 9d: aload 3
      // 9e: getfield EntityLivingBase.x5k F
      // a1: fstore 10
      // a3: aload 1
      // a4: invokevirtual net/minecraft/network/play/server/S14PacketEntity.mqm ()Z
      // a7: iload 2
      // a8: ifeq c4
      // ab: ifeq cc
      // ae: goto b5
      // b1: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b4: athrow
      // b5: aload 1
      // b6: invokevirtual net/minecraft/network/play/server/S14PacketEntity._xs ()B
      // b9: sipush 360
      // bc: imul
      // bd: goto c4
      // c0: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c3: athrow
      // c4: i2f
      // c5: ldc 256.0
      // c7: nop
      // c8: fdiv
      // c9: goto d0
      // cc: aload 3
      // cd: getfield EntityLivingBase.y2i F
      // d0: fstore 11
      // d2: aload 3
      // d3: dload 4
      // d5: dload 6
      // d7: dload 8
      // d9: fload 10
      // db: fload 11
      // dd: bipush 3
      // de: bipush 0
      // df: invokevirtual EntityLivingBase.ltu (DDDFFIZ)V
      // e2: aload 3
      // e3: aload 1
      // e4: invokevirtual net/minecraft/network/play/server/S14PacketEntity.gf6 ()Z
      // e7: putfield EntityLivingBase.lfk Z
      // ea: return
   }

   @Override
   public void ces(S19PacketEntityHeadLook var1) {
      et9.hqd(var1, this, this.bol);
      EntityLivingBase var2 = var1.sec(this.y40);
      if (var2 != null) {
         float var3 = (float)(var1.x59() * 360) / 256.0F;
         var2.jo1(var3);
      }
   }

   @Override
   public void ajs(S13PacketDestroyEntities var1) {
      et9.hqd(var1, this, this.bol);
      int var10000 = OpaquePredicate.c();
      int var3 = 0;
      int var2 = var10000;

      while (var3 < var1.v9l().length) {
         this.y40.i8e(var1.v9l()[var3]);
         var3++;
         if (var2 != 0) {
            break;
         }
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   @Override
   public void th7(S08PacketPlayerPosLook var1) {
      et9.hqd(var1, this, this.bol);
      int var10000 = OpaquePredicate.c();
      EntityPlayerSP var3 = this.bol.vg8;
      int var2 = var10000;
      double var4 = var1.xr4();
      double var6 = var1.mvt();
      double var8 = var1.isl();
      float var10 = var1.q30();
      float var11 = var1.ovw();

      label139: {
         label125: {
            label124: {
               try {
                  if (var2 != 0) {
                     break label124;
                  }

                  if (!var1._7h().contains(S08PacketPlayerPosLook$bdv.uws)) {
                     break label125;
                  }
               } catch (IllegalStateException var22) {
                  throw a(var22);
               }

               var4 += var3.o2v;
            }

            try {
               if (var2 == 0) {
                  break label139;
               }
            } catch (IllegalStateException var21) {
               boolean var10001 = false;
               throw a(var21);
            }
         }

         try {
            var3.icv = 0.0;
         } catch (IllegalStateException var20) {
            boolean var28 = false;
            throw a(var20);
         }
      }

      label140: {
         if (var1._7h().contains(S08PacketPlayerPosLook$bdv.yu5)) {
            var6 += var3.kfp;

            try {
               if (var2 == 0) {
                  break label140;
               }
            } catch (IllegalStateException var19) {
               boolean var29 = false;
               throw a(var19);
            }
         }

         try {
            var3.mop = 0.0;
         } catch (IllegalStateException var18) {
            boolean var30 = false;
            throw a(var18);
         }
      }

      label141: {
         if (var1._7h().contains(S08PacketPlayerPosLook$bdv.qh1)) {
            var8 += var3.vbd;

            try {
               if (var2 == 0) {
                  break label141;
               }
            } catch (IllegalStateException var17) {
               boolean var31 = false;
               throw a(var17);
            }
         }

         try {
            var3.bw4 = 0.0;
         } catch (IllegalStateException var16) {
            boolean var32 = false;
            throw a(var16);
         }
      }

      label88: {
         label87: {
            try {
               var26 = var1._7h().contains(S08PacketPlayerPosLook$bdv.ybj);
               if (var2 != 0) {
                  break label88;
               }

               if (!var26) {
                  break label87;
               }
            } catch (IllegalStateException var15) {
               throw a(var15);
            }

            var11 += var3.y2i;
         }

         var26 = var1._7h().contains(S08PacketPlayerPosLook$bdv.a76);
      }

      label78: {
         label77: {
            label76: {
               try {
                  if (var2 != 0) {
                     break label77;
                  }

                  if (!var26) {
                     break label76;
                  }
               } catch (IllegalStateException var14) {
                  throw a(var14);
               }

               var10 += var3.x5k;
            }

            try {
               var3.xe8(var4, var6, var8, var10, var11);
               this._us.k7f(new C03PacketPlayer$C06PacketPlayerPosLook(var3.o2v, var3.aaw().bx_, var3.vbd, var3.x5k, var3.y2i, false));
               var27 = this;
               if (var2 != 0) {
                  break label78;
               }

               var26 = this.t2e;
            } catch (IllegalStateException var13) {
               throw a(var13);
            }
         }

         try {
            if (var26) {
               return;
            }

            this.bol.vg8.bc1 = this.bol.vg8.o2v;
            this.bol.vg8.o_z = this.bol.vg8.kfp;
            this.bol.vg8.a4d = this.bol.vg8.vbd;
            this.t2e = true;
            var27 = this;
         } catch (IllegalStateException var12) {
            throw a(var12);
         }
      }

      var27.bol.z2i((ShaderHelper)null);
   }

   @Override
   public void Event(S22PacketMultiBlockChange var1) {
      et9.hqd(var1, this, this.bol);
      S22PacketMultiBlockChange$_to[] var3 = var1.s1k();
      int var10000 = OpaquePredicate.b();
      int var4 = var3.length;
      int var2 = var10000;
      int var5 = 0;

      while (var5 < var4) {
         S22PacketMultiBlockChange$_to var6 = var3[var5];
         this.y40.blc(var6.p31(), var6.il5());
         var5++;
         if (var2 == 0) {
            break;
         }
      }
   }

   @Override
   public void zxk(S21PacketChunkData param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: aload 0
      // 06: aload 0
      // 07: getfield p_k.bol Lc05;
      // 0a: invokestatic et9.hqd (Lmz2;Lyw3;Llg9;)V
      // 0d: iload 2
      // 0e: ifne 7b
      // 11: aload 1
      // 12: invokevirtual net/minecraft/network/play/server/S21PacketChunkData.imn ()Z
      // 15: ifeq 52
      // 18: goto 1f
      // 1b: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: aload 1
      // 20: invokevirtual net/minecraft/network/play/server/S21PacketChunkData.n9c ()I
      // 23: ifne 42
      // 26: goto 2d
      // 29: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c: athrow
      // 2d: aload 0
      // 2e: getfield p_k.y40 Lkh3;
      // 31: aload 1
      // 32: invokevirtual net/minecraft/network/play/server/S21PacketChunkData.f4z ()I
      // 35: aload 1
      // 36: invokevirtual net/minecraft/network/play/server/S21PacketChunkData.h_1 ()I
      // 39: bipush 0
      // 3a: invokevirtual WorldClient.ef0 (IIZ)V
      // 3d: return
      // 3e: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41: athrow
      // 42: aload 0
      // 43: getfield p_k.y40 Lkh3;
      // 46: aload 1
      // 47: invokevirtual net/minecraft/network/play/server/S21PacketChunkData.f4z ()I
      // 4a: aload 1
      // 4b: invokevirtual net/minecraft/network/play/server/S21PacketChunkData.h_1 ()I
      // 4e: bipush 1
      // 4f: invokevirtual WorldClient.ef0 (IIZ)V
      // 52: aload 0
      // 53: getfield p_k.y40 Lkh3;
      // 56: aload 1
      // 57: invokevirtual net/minecraft/network/play/server/S21PacketChunkData.f4z ()I
      // 5a: bipush 4
      // 5b: ishl
      // 5c: bipush 0
      // 5d: aload 1
      // 5e: invokevirtual net/minecraft/network/play/server/S21PacketChunkData.h_1 ()I
      // 61: bipush 4
      // 62: ishl
      // 63: aload 1
      // 64: invokevirtual net/minecraft/network/play/server/S21PacketChunkData.f4z ()I
      // 67: bipush 4
      // 68: ishl
      // 69: bipush 15
      // 6b: iadd
      // 6c: sipush 256
      // 6f: aload 1
      // 70: invokevirtual net/minecraft/network/play/server/S21PacketChunkData.h_1 ()I
      // 73: bipush 4
      // 74: ishl
      // 75: bipush 15
      // 77: iadd
      // 78: invokevirtual WorldClient.fx0 (IIIIII)V
      // 7b: aload 0
      // 7c: getfield p_k.y40 Lkh3;
      // 7f: aload 1
      // 80: invokevirtual net/minecraft/network/play/server/S21PacketChunkData.f4z ()I
      // 83: aload 1
      // 84: invokevirtual net/minecraft/network/play/server/S21PacketChunkData.h_1 ()I
      // 87: invokevirtual WorldClient.o5h (II)Ltts;
      // 8a: astore 3
      // 8b: aload 3
      // 8c: iload 2
      // 8d: ifne f2
      // 90: aload 1
      // 91: invokevirtual net/minecraft/network/play/server/S21PacketChunkData.uph ()[B
      // 94: aload 1
      // 95: invokevirtual net/minecraft/network/play/server/S21PacketChunkData.n9c ()I
      // 98: aload 1
      // 99: invokevirtual net/minecraft/network/play/server/S21PacketChunkData.imn ()Z
      // 9c: invokevirtual tts._uu ([BIZ)V
      // 9f: aload 0
      // a0: getfield p_k.y40 Lkh3;
      // a3: aload 1
      // a4: invokevirtual net/minecraft/network/play/server/S21PacketChunkData.f4z ()I
      // a7: bipush 4
      // a8: ishl
      // a9: bipush 0
      // aa: aload 1
      // ab: invokevirtual net/minecraft/network/play/server/S21PacketChunkData.h_1 ()I
      // ae: bipush 4
      // af: ishl
      // b0: aload 1
      // b1: invokevirtual net/minecraft/network/play/server/S21PacketChunkData.f4z ()I
      // b4: bipush 4
      // b5: ishl
      // b6: bipush 15
      // b8: iadd
      // b9: sipush 256
      // bc: aload 1
      // bd: invokevirtual net/minecraft/network/play/server/S21PacketChunkData.h_1 ()I
      // c0: bipush 4
      // c1: ishl
      // c2: bipush 15
      // c4: iadd
      // c5: invokevirtual WorldClient.pa7 (IIIIII)V
      // c8: aload 1
      // c9: invokevirtual net/minecraft/network/play/server/S21PacketChunkData.imn ()Z
      // cc: ifeq ea
      // cf: goto d6
      // d2: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // d5: athrow
      // d6: aload 0
      // d7: getfield p_k.y40 Lkh3;
      // da: getfield WorldClient.vzz Lupn;
      // dd: instanceof ure
      // e0: ifne f5
      // e3: goto ea
      // e6: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // e9: athrow
      // ea: aload 3
      // eb: goto f2
      // ee: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // f1: athrow
      // f2: invokevirtual tts.e8r ()V
      // f5: return
   }

   @Override
   public void tfd(S23PacketBlockChange var1) {
      et9.hqd(var1, this, this.bol);
      this.y40.blc(var1.p71(), var1.jzh());
   }

   @Override
   public void e5w(S40PacketDisconnect var1) {
      this._us.g8c(var1.f70());
   }

   @Override
   public void az3(ekw param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic p_k.a J
      // 03: ldc2_w 88180376430060
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: getfield p_k.bol Lc05;
      // 11: aconst_null
      // 12: checkcast WorldClient
      // 15: invokevirtual Minecraft.jk1 (Lkh3;)V
      // 18: aload 0
      // 19: iload 4
      // 1b: ifeq 60
      // 1e: getfield p_k.zap Lgbe;
      // 21: ifnull 58
      // 24: goto 2b
      // 27: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: aload 0
      // 2c: getfield p_k.bol Lc05;
      // 2f: new yk0
      // 32: dup
      // 33: aload 0
      // 34: getfield p_k.zap Lgbe;
      // 37: sipush 20560
      // 3a: ldc2_w 5933088471615481975
      // 3d: lload 2
      // 3e: lxor
      // 3f: invokedynamic h (IJ)Ljava/lang/String; bsm=p_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: nop
      // 45: aload 1
      // 46: invokespecial yk0.<init> (Lgbe;Ljava/lang/String;Lekw;)V
      // 49: invokevirtual Minecraft.z2i (Lgbe;)V
      // 4c: iload 4
      // 4e: ifne 8a
      // 51: goto 58
      // 54: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 57: athrow
      // 58: aload 0
      // 59: goto 60
      // 5c: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5f: athrow
      // 60: getfield p_k.bol Lc05;
      // 63: new yk0
      // 66: dup
      // 67: new s9r
      // 6a: dup
      // 6b: new MainMenuScreen
      // 6e: dup
      // 6f: invokespecial MainMenuScreen.<init> ()V
      // 72: invokespecial s9r.<init> (Lgbe;)V
      // 75: sipush 31252
      // 78: ldc2_w 6790957333425816101
      // 7b: lload 2
      // 7c: lxor
      // 7d: invokedynamic h (IJ)Ljava/lang/String; bsm=p_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 82: nop
      // 83: aload 1
      // 84: invokespecial yk0.<init> (Lgbe;Ljava/lang/String;Lekw;)V
      // 87: invokevirtual Minecraft.z2i (Lgbe;)V
      // 8a: return
   }

   public void sxi(mz2 var1) {
      this._us.k7f(var1);
   }

   @Override
   public void y9y(S0DPacketCollectItem param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic p_k.a J
      // 003: ldc2_w 81029950410022
      // 006: lxor
      // 007: lstore 2
      // 008: aload 1
      // 009: aload 0
      // 00a: aload 0
      // 00b: getfield p_k.bol Lc05;
      // 00e: invokestatic et9.hqd (Lmz2;Lyw3;Llg9;)V
      // 011: invokestatic OpaquePredicate.b ()I
      // 014: aload 0
      // 015: getfield p_k.y40 Lkh3;
      // 018: aload 1
      // 019: invokevirtual net/minecraft/network/play/server/S0DPacketCollectItem.m3j ()I
      // 01c: invokevirtual WorldClient.oks (I)Li2h;
      // 01f: astore 5
      // 021: aload 0
      // 022: getfield p_k.y40 Lkh3;
      // 025: aload 1
      // 026: invokevirtual net/minecraft/network/play/server/S0DPacketCollectItem.v11 ()I
      // 029: invokevirtual WorldClient.oks (I)Li2h;
      // 02c: checkcast Entity
      // 02f: astore 6
      // 031: istore 4
      // 033: aload 6
      // 035: iload 4
      // 037: ifeq 04f
      // 03a: ifnonnull 04d
      // 03d: goto 044
      // 040: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 043: athrow
      // 044: aload 0
      // 045: getfield p_k.bol Lc05;
      // 048: getfield Minecraft.vg8 Ll86;
      // 04b: astore 6
      // 04d: aload 5
      // 04f: iload 4
      // 051: ifeq 060
      // 054: ifnull 103
      // 057: goto 05e
      // 05a: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05d: athrow
      // 05e: aload 5
      // 060: instanceof uno
      // 063: ifeq 0a3
      // 066: aload 0
      // 067: getfield p_k.y40 Lkh3;
      // 06a: aload 5
      // 06c: sipush 18502
      // 06f: ldc2_w 2129218344370985138
      // 072: lload 2
      // 073: lxor
      // 074: invokedynamic h (IJ)Ljava/lang/String; bsm=p_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 079: nop
      // 07a: ldc 0.2
      // 07c: nop
      // 07d: aload 0
      // 07e: getfield p_k.g1h Ljava/util/Random;
      // 081: invokevirtual java/util/Random.nextFloat ()F
      // 084: aload 0
      // 085: getfield p_k.g1h Ljava/util/Random;
      // 088: invokevirtual java/util/Random.nextFloat ()F
      // 08b: fsub
      // 08c: ldc 0.7
      // 08e: nop
      // 08f: fmul
      // 090: fconst_1
      // 091: fadd
      // 092: fconst_2
      // 093: fmul
      // 094: invokevirtual WorldClient.yfq (Li2h;Ljava/lang/String;FF)V
      // 097: iload 4
      // 099: ifne 0db
      // 09c: goto 0a3
      // 09f: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a2: athrow
      // 0a3: aload 0
      // 0a4: getfield p_k.y40 Lkh3;
      // 0a7: aload 5
      // 0a9: sipush 28739
      // 0ac: ldc2_w 4793275860772905131
      // 0af: lload 2
      // 0b0: lxor
      // 0b1: invokedynamic h (IJ)Ljava/lang/String; bsm=p_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b6: nop
      // 0b7: ldc 0.2
      // 0b9: nop
      // 0ba: aload 0
      // 0bb: getfield p_k.g1h Ljava/util/Random;
      // 0be: invokevirtual java/util/Random.nextFloat ()F
      // 0c1: aload 0
      // 0c2: getfield p_k.g1h Ljava/util/Random;
      // 0c5: invokevirtual java/util/Random.nextFloat ()F
      // 0c8: fsub
      // 0c9: ldc 0.7
      // 0cb: nop
      // 0cc: fmul
      // 0cd: fconst_1
      // 0ce: fadd
      // 0cf: fconst_2
      // 0d0: fmul
      // 0d1: invokevirtual WorldClient.yfq (Li2h;Ljava/lang/String;FF)V
      // 0d4: goto 0db
      // 0d7: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0da: athrow
      // 0db: aload 0
      // 0dc: getfield p_k.bol Lc05;
      // 0df: getfield Minecraft.i4p Ljux;
      // 0e2: new lur
      // 0e5: dup
      // 0e6: aload 0
      // 0e7: getfield p_k.y40 Lkh3;
      // 0ea: aload 5
      // 0ec: aload 6
      // 0ee: ldc 0.5
      // 0f0: nop
      // 0f1: invokespecial lur.<init> (Lt9d;Li2h;Li2h;F)V
      // 0f4: invokevirtual jux.o4t (Lflo;)V
      // 0f7: aload 0
      // 0f8: getfield p_k.y40 Lkh3;
      // 0fb: aload 1
      // 0fc: invokevirtual net/minecraft/network/play/server/S0DPacketCollectItem.m3j ()I
      // 0ff: invokevirtual WorldClient.i8e (I)Li2h;
      // 102: pop
      // 103: return
   }

   @Override
   public void y36(S02PacketChat param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: aload 0
      // 06: aload 0
      // 07: getfield p_k.bol Lc05;
      // 0a: invokestatic et9.hqd (Lmz2;Lyw3;Llg9;)V
      // 0d: iload 2
      // 0e: ifne 36
      // 11: aload 1
      // 12: invokevirtual net/minecraft/network/play/server/S02PacketChat.i53 ()B
      // 15: bipush 2
      // 16: if_icmpne 3a
      // 19: goto 20
      // 1c: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: aload 0
      // 21: getfield p_k.bol Lc05;
      // 24: getfield Minecraft.t43 Ld1f;
      // 27: aload 1
      // 28: invokevirtual net/minecraft/network/play/server/S02PacketChat.m4c ()Lekw;
      // 2b: bipush 0
      // 2c: invokevirtual d1f.rol (Lekw;Z)V
      // 2f: goto 36
      // 32: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 35: athrow
      // 36: iload 2
      // 37: ifeq 52
      // 3a: aload 0
      // 3b: getfield p_k.bol Lc05;
      // 3e: getfield Minecraft.t43 Ld1f;
      // 41: invokevirtual d1f.lcg ()Lsxg;
      // 44: aload 1
      // 45: invokevirtual net/minecraft/network/play/server/S02PacketChat.m4c ()Lekw;
      // 48: invokevirtual sxg.obg (Lekw;)V
      // 4b: goto 52
      // 4e: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 51: athrow
      // 52: return
   }

   @Override
   public void v7u(S0BPacketAnimation param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: aload 0
      // 02: aload 0
      // 03: getfield p_k.bol Lc05;
      // 06: invokestatic et9.hqd (Lmz2;Lyw3;Llg9;)V
      // 09: invokestatic OpaquePredicate.b ()I
      // 0c: aconst_null
      // 0d: astore 3
      // 0e: istore 2
      // 0f: aload 0
      // 10: getfield p_k.y40 Lkh3;
      // 13: aload 1
      // 14: invokevirtual net/minecraft/network/play/server/S0BPacketAnimation._d6 ()I
      // 17: invokevirtual WorldClient.oks (I)Li2h;
      // 1a: astore 3
      // 1b: aload 3
      // 1c: ifnull f3
      // 1f: aload 1
      // 20: invokevirtual net/minecraft/network/play/server/S0BPacketAnimation.ser ()I
      // 23: iload 2
      // 24: ifeq 52
      // 27: goto 2e
      // 2a: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d: athrow
      // 2e: ifne 47
      // 31: goto 38
      // 34: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37: athrow
      // 38: aload 3
      // 39: checkcast Entity
      // 3c: astore 4
      // 3e: aload 4
      // 40: invokevirtual Entity.hgb ()V
      // 43: iload 2
      // 44: ifne f3
      // 47: aload 1
      // 48: invokevirtual net/minecraft/network/play/server/S0BPacketAnimation.ser ()I
      // 4b: goto 52
      // 4e: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 51: athrow
      // 52: bipush 1
      // 53: iload 2
      // 54: ifeq 7c
      // 57: if_icmpne 70
      // 5a: goto 61
      // 5d: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 60: athrow
      // 61: aload 3
      // 62: invokevirtual EntityLivingBase.h38 ()V
      // 65: iload 2
      // 66: ifne f3
      // 69: goto 70
      // 6c: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6f: athrow
      // 70: aload 1
      // 71: invokevirtual net/minecraft/network/play/server/S0BPacketAnimation.ser ()I
      // 74: bipush 2
      // 75: goto 7c
      // 78: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7b: athrow
      // 7c: iload 2
      // 7d: ifeq a8
      // 80: if_icmpne 9c
      // 83: goto 8a
      // 86: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 89: athrow
      // 8a: aload 3
      // 8b: checkcast ha9
      // 8e: astore 4
      // 90: aload 4
      // 92: bipush 0
      // 93: bipush 0
      // 94: bipush 0
      // 95: invokevirtual ha9.thu (ZZZ)V
      // 98: iload 2
      // 99: ifne f3
      // 9c: aload 1
      // 9d: invokevirtual net/minecraft/network/play/server/S0BPacketAnimation.ser ()I
      // a0: bipush 4
      // a1: goto a8
      // a4: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a7: athrow
      // a8: iload 2
      // a9: ifeq db
      // ac: if_icmpne cf
      // af: goto b6
      // b2: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b5: athrow
      // b6: aload 0
      // b7: getfield p_k.bol Lc05;
      // ba: getfield Minecraft.i4p Ljux;
      // bd: aload 3
      // be: getstatic w_0.fzw Lw_0;
      // c1: invokevirtual jux.hro (Li2h;Lw_0;)V
      // c4: iload 2
      // c5: ifne f3
      // c8: goto cf
      // cb: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ce: athrow
      // cf: aload 1
      // d0: invokevirtual net/minecraft/network/play/server/S0BPacketAnimation.ser ()I
      // d3: bipush 5
      // d4: goto db
      // d7: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // da: athrow
      // db: if_icmpne f3
      // de: aload 0
      // df: getfield p_k.bol Lc05;
      // e2: getfield Minecraft.i4p Ljux;
      // e5: aload 3
      // e6: getstatic w_0.k6p Lw_0;
      // e9: invokevirtual jux.hro (Li2h;Lw_0;)V
      // ec: goto f3
      // ef: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // f2: athrow
      // f3: return
   }

   @Override
   public void usm(S0APacketUseBed var1) {
      et9.hqd(var1, this, this.bol);
      var1.zi5(this.y40).zv1(var1.akm());
   }

   @Override
   public void xts(S0FPacketSpawnMob var1) {
      et9.hqd(var1, this, this.bol);
      double var3 = (double)var1.als() / 32.0;
      int var10000 = OpaquePredicate.c();
      double var5 = (double)var1.vlp() / 32.0;
      double var7 = (double)var1.s_z() / 32.0;
      float var9 = (float)(var1.arc() * 360) / 256.0F;
      int var2 = var10000;
      float var10 = (float)(var1.xhx() * 360) / 256.0F;
      Entity var11 = (Entity)y65.sh5(var1.tpt(), this.bol.tij);
      var11.w12 = var1.als();
      var11.hsa = var1.vlp();
      var11.mvw = var1.s_z();
      var11.ksw = var11.q6c = (float)(var1.s9d() * 360) / 256.0F;
      EntityLivingBase[] var12 = var11.u_g();

      label46: {
         label50: {
            try {
               if (var2 != 0) {
                  break label46;
               }

               if (var12 == null) {
                  break label50;
               }
            } catch (IllegalStateException var17) {
               throw a(var17);
            }

            int var13 = var1.pkf() - var11.jwu();
            int var14 = 0;

            while (var14 < var12.length) {
               try {
                  var12[var14].i6d(var12[var14].jwu() + var13);
                  var14++;
                  if (var2 != 0) {
                     break label46;
                  }

                  if (var2 != 0) {
                     break;
                  }
               } catch (IllegalStateException var16) {
                  throw a(var16);
               }
            }
         }

         var11.i6d(var1.pkf());
         var11.xe8(var3, var5, var7, var9, var10);
         var11.icv = (double)((float)var1.m6c() / 8000.0F);
         var11.mop = (double)((float)var1.opk() / 8000.0F);
         var11.bw4 = (double)((float)var1.po_() / 8000.0F);
         this.y40.fih(var1.pkf(), var11);
      }

      List var18 = var1.gd4();

      try {
         if (var18 != null) {
            var11.a0c().z3t(var18);
         }
      } catch (IllegalStateException var15) {
         throw a(var15);
      }
   }

   @Override
   public void p02(S03PacketTimeUpdate var1) {
      et9.hqd(var1, this, this.bol);
      this.bol.tij.f1m(var1.acv());
      this.bol.tij.p7c(var1.a7c());
   }

   @Override
   public void oz9(S05PacketSpawnPosition var1) {
      et9.hqd(var1, this, this.bol);
      this.bol.vg8.i9g(var1._ry(), true);
      this.bol.tij.r7d().d2x(var1._ry());
   }

   @Override
   public void m41(S1BPacketEntityAttach param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic p_k.a J
      // 003: ldc2_w 27100376709003
      // 006: lxor
      // 007: lstore 2
      // 008: aload 1
      // 009: aload 0
      // 00a: aload 0
      // 00b: getfield p_k.bol Lc05;
      // 00e: invokestatic et9.hqd (Lmz2;Lyw3;Llg9;)V
      // 011: invokestatic OpaquePredicate.b ()I
      // 014: aload 0
      // 015: getfield p_k.y40 Lkh3;
      // 018: aload 1
      // 019: invokevirtual net/minecraft/network/play/server/S1BPacketEntityAttach.sem ()I
      // 01c: invokevirtual WorldClient.oks (I)Li2h;
      // 01f: astore 5
      // 021: istore 4
      // 023: aload 0
      // 024: getfield p_k.y40 Lkh3;
      // 027: aload 1
      // 028: invokevirtual net/minecraft/network/play/server/S1BPacketEntityAttach.bbw ()I
      // 02b: invokevirtual WorldClient.oks (I)Li2h;
      // 02e: astore 6
      // 030: aload 1
      // 031: invokevirtual net/minecraft/network/play/server/S1BPacketEntityAttach.dcg ()I
      // 034: iload 4
      // 036: ifeq 149
      // 039: ifne 13e
      // 03c: goto 043
      // 03f: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 042: athrow
      // 043: bipush 0
      // 044: istore 7
      // 046: aload 1
      // 047: invokevirtual net/minecraft/network/play/server/S1BPacketEntityAttach.sem ()I
      // 04a: iload 4
      // 04c: ifeq 0d1
      // 04f: aload 0
      // 050: getfield p_k.bol Lc05;
      // 053: getfield Minecraft.vg8 Ll86;
      // 056: invokevirtual EntityPlayerSP.jwu ()I
      // 059: if_icmpne 0b9
      // 05c: goto 063
      // 05f: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 062: athrow
      // 063: aload 0
      // 064: getfield p_k.bol Lc05;
      // 067: getfield Minecraft.vg8 Ll86;
      // 06a: astore 5
      // 06c: aload 6
      // 06e: iload 4
      // 070: ifeq 095
      // 073: instanceof w54
      // 076: ifeq 090
      // 079: goto 080
      // 07c: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07f: athrow
      // 080: aload 6
      // 082: checkcast w54
      // 085: bipush 0
      // 086: invokevirtual w54.w8z (Z)V
      // 089: goto 090
      // 08c: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08f: athrow
      // 090: aload 5
      // 092: getfield EntityLivingBase.hzp Li2h;
      // 095: iload 4
      // 097: ifeq 0a6
      // 09a: ifnonnull 0b1
      // 09d: goto 0a4
      // 0a0: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a3: athrow
      // 0a4: aload 6
      // 0a6: ifnull 0b1
      // 0a9: bipush 1
      // 0aa: goto 0b2
      // 0ad: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b0: athrow
      // 0b1: bipush 0
      // 0b2: istore 7
      // 0b4: iload 4
      // 0b6: ifne 0e4
      // 0b9: aload 6
      // 0bb: iload 4
      // 0bd: ifeq 0e6
      // 0c0: goto 0c7
      // 0c3: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c6: athrow
      // 0c7: instanceof w54
      // 0ca: goto 0d1
      // 0cd: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d0: athrow
      // 0d1: ifeq 0e4
      // 0d4: aload 6
      // 0d6: checkcast w54
      // 0d9: bipush 1
      // 0da: invokevirtual w54.w8z (Z)V
      // 0dd: goto 0e4
      // 0e0: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e3: athrow
      // 0e4: aload 5
      // 0e6: iload 4
      // 0e8: ifeq 0f8
      // 0eb: ifnonnull 0f6
      // 0ee: goto 0f5
      // 0f1: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f4: athrow
      // 0f5: return
      // 0f6: aload 5
      // 0f8: aload 6
      // 0fa: invokevirtual EntityLivingBase.nw9 (Li2h;)V
      // 0fd: iload 7
      // 0ff: ifeq 139
      // 102: aload 0
      // 103: getfield p_k.bol Lc05;
      // 106: getfield Minecraft.oxn Lmoh;
      // 109: astore 8
      // 10b: aload 0
      // 10c: getfield p_k.bol Lc05;
      // 10f: getfield Minecraft.t43 Ld1f;
      // 112: sipush 13996
      // 115: ldc2_w 1132573677432839402
      // 118: lload 2
      // 119: lxor
      // 11a: invokedynamic h (IJ)Ljava/lang/String; bsm=p_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11f: nop
      // 120: bipush 1
      // 121: anewarray 27
      // 124: dup
      // 125: bipush 0
      // 126: aload 8
      // 128: getfield moh.e5o Lm7l;
      // 12b: invokevirtual m7l.xbs ()I
      // 12e: invokestatic moh.wx5 (I)Ljava/lang/String;
      // 131: aastore
      // 132: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 135: bipush 0
      // 136: invokevirtual d1f.ys0 (Ljava/lang/String;Z)V
      // 139: iload 4
      // 13b: ifne 1ad
      // 13e: aload 1
      // 13f: invokevirtual net/minecraft/network/play/server/S1BPacketEntityAttach.dcg ()I
      // 142: goto 149
      // 145: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 148: athrow
      // 149: iload 4
      // 14b: ifeq 171
      // 14e: bipush 1
      // 14f: if_icmpne 1ad
      // 152: goto 159
      // 155: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 158: athrow
      // 159: aload 5
      // 15b: iload 4
      // 15d: ifeq 176
      // 160: goto 167
      // 163: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 166: athrow
      // 167: instanceof yqv
      // 16a: goto 171
      // 16d: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 170: athrow
      // 171: ifeq 1ad
      // 174: aload 6
      // 176: iload 4
      // 178: ifeq 1a5
      // 17b: ifnull 19c
      // 17e: goto 185
      // 181: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 184: athrow
      // 185: aload 5
      // 187: checkcast yqv
      // 18a: aload 6
      // 18c: bipush 0
      // 18d: invokevirtual yqv.dt4 (Li2h;Z)V
      // 190: iload 4
      // 192: ifne 1ad
      // 195: goto 19c
      // 198: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19b: athrow
      // 19c: aload 5
      // 19e: goto 1a5
      // 1a1: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a4: athrow
      // 1a5: checkcast yqv
      // 1a8: bipush 0
      // 1a9: bipush 0
      // 1aa: invokevirtual yqv.xqh (ZZ)V
      // 1ad: return
   }

   @Override
   public void sgx(S19PacketEntityStatus param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: aload 0
      // 02: aload 0
      // 03: getfield p_k.bol Lc05;
      // 06: invokestatic et9.hqd (Lmz2;Lyw3;Llg9;)V
      // 09: invokestatic OpaquePredicate.b ()I
      // 0c: aload 1
      // 0d: aload 0
      // 0e: getfield p_k.y40 Lkh3;
      // 11: invokevirtual net/minecraft/network/play/server/S19PacketEntityStatus.csv (Lt9d;)Li2h;
      // 14: astore 3
      // 15: istore 2
      // 16: aload 3
      // 17: ifnull 59
      // 1a: aload 1
      // 1b: invokevirtual net/minecraft/network/play/server/S19PacketEntityStatus.s3_ ()B
      // 1e: bipush 21
      // 20: if_icmpne 4a
      // 23: goto 2a
      // 26: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29: athrow
      // 2a: aload 0
      // 2b: getfield p_k.bol Lc05;
      // 2e: invokevirtual Minecraft.yp9 ()Ldbu;
      // 31: new gji
      // 34: dup
      // 35: aload 3
      // 36: checkcast c9p
      // 39: invokespecial gji.<init> (Lc9p;)V
      // 3c: invokevirtual dbu.mak (Ljp4;)V
      // 3f: iload 2
      // 40: ifne 59
      // 43: goto 4a
      // 46: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 49: athrow
      // 4a: aload 3
      // 4b: aload 1
      // 4c: invokevirtual net/minecraft/network/play/server/S19PacketEntityStatus.s3_ ()B
      // 4f: invokevirtual EntityLivingBase.ptf (B)V
      // 52: goto 59
      // 55: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 58: athrow
      // 59: return
   }

   @Override
   public void oe4(S06PacketUpdateHealth var1) {
      et9.hqd(var1, this, this.bol);
      this.bol.vg8.y11(var1.fih());
      this.bol.vg8.wvq()._fj(var1.slz());
      this.bol.vg8.wvq().tew(var1.ax8());
   }

   @Override
   public void d91(S1FPacketSetExperience var1) {
      et9.hqd(var1, this, this.bol);
      this.bol.vg8.jnt(var1.dev(), var1.yvv(), var1._rj());
   }

   @Override
   public void fdc(S07PacketRespawn var1) {
      int var2 = OpaquePredicate.b();

      label20: {
         try {
            et9.hqd(var1, this, this.bol);
            if (var2 == 0) {
               return;
            }

            if (var1.qti() == this.bol.vg8.ohd) {
               break label20;
            }
         } catch (IllegalStateException var4) {
            throw a(var4);
         }

         this.t2e = false;
         uci var3 = this.y40.fgp();
         this.y40 = new WorldClient(this, new h50(0L, var1.e15(), false, this.bol.tij.r7d().lce(), var1.vl4()), var1.qti(), var1.cno(), this.bol.ba0);
         this.y40.ie6(var3);
         this.bol.jk1(this.y40);
         this.bol.vg8.ohd = var1.qti();
         this.bol.z2i(new ph6(this));
      }

      this.bol.bj3(var1.qti());
      this.bol.l7q.qm5(var1.e15());
      EventBus.esg(new Event());
   }

   @Override
   public void jay(S27PacketExplosion var1) {
      et9.hqd(var1, this, this.bol);
      vu6 var2 = new vu6(this.bol.tij, (EntityLivingBase)null, var1.v5n(), var1.h_4(), var1.lw7(), var1.y3k(), var1.njs());
      var2.vw3(true);
      this.bol.vg8.icv = this.bol.vg8.icv + (double)var1.gri();
      this.bol.vg8.mop = this.bol.vg8.mop + (double)var1.jpf();
      this.bol.vg8.bw4 = this.bol.vg8.bw4 + (double)var1.dtb();
   }

   @Override
   public void twv(S2DPacketOpenWindow param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic p_k.a J
      // 003: ldc2_w 104687187687196
      // 006: lxor
      // 007: lstore 2
      // 008: aload 1
      // 009: aload 0
      // 00a: aload 0
      // 00b: getfield p_k.bol Lc05;
      // 00e: invokestatic et9.hqd (Lmz2;Lyw3;Llg9;)V
      // 011: invokestatic OpaquePredicate.b ()I
      // 014: aload 0
      // 015: getfield p_k.bol Lc05;
      // 018: getfield Minecraft.vg8 Ll86;
      // 01b: astore 5
      // 01d: istore 4
      // 01f: sipush 23411
      // 022: ldc2_w 8403143238069268899
      // 025: lload 2
      // 026: lxor
      // 027: invokedynamic h (IJ)Ljava/lang/String; bsm=p_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02c: nop
      // 02d: aload 1
      // 02e: invokevirtual net/minecraft/network/play/server/S2DPacketOpenWindow._p9 ()Ljava/lang/String;
      // 031: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 034: iload 4
      // 036: ifeq 08b
      // 039: ifeq 06f
      // 03c: goto 043
      // 03f: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 042: athrow
      // 043: aload 5
      // 045: new goq
      // 048: dup
      // 049: aload 1
      // 04a: invokevirtual net/minecraft/network/play/server/S2DPacketOpenWindow.ot8 ()Lekw;
      // 04d: aload 1
      // 04e: invokevirtual net/minecraft/network/play/server/S2DPacketOpenWindow.dz1 ()I
      // 051: invokespecial goq.<init> (Lekw;I)V
      // 054: invokevirtual EntityPlayerSP.a_o (Lrsi;)V
      // 057: aload 5
      // 059: getfield EntityPlayerSP.daw L_jc;
      // 05c: aload 1
      // 05d: invokevirtual net/minecraft/network/play/server/S2DPacketOpenWindow.cru ()I
      // 060: putfield _jc.h7l I
      // 063: iload 4
      // 065: ifne 1a3
      // 068: goto 06f
      // 06b: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06e: athrow
      // 06f: sipush 8500
      // 072: ldc2_w 978755356674182132
      // 075: lload 2
      // 076: lxor
      // 077: invokedynamic h (IJ)Ljava/lang/String; bsm=p_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07c: nop
      // 07d: aload 1
      // 07e: invokevirtual net/minecraft/network/play/server/S2DPacketOpenWindow._p9 ()Ljava/lang/String;
      // 081: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 084: goto 08b
      // 087: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08a: athrow
      // 08b: iload 4
      // 08d: ifeq 0e0
      // 090: ifeq 0c4
      // 093: goto 09a
      // 096: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 099: athrow
      // 09a: aload 5
      // 09c: new uw8
      // 09f: dup
      // 0a0: aload 5
      // 0a2: aload 1
      // 0a3: invokevirtual net/minecraft/network/play/server/S2DPacketOpenWindow.ot8 ()Lekw;
      // 0a6: invokespecial uw8.<init> (Lha9;Lekw;)V
      // 0a9: invokevirtual EntityPlayerSP.vhi (La7q;)V
      // 0ac: aload 5
      // 0ae: getfield EntityPlayerSP.daw L_jc;
      // 0b1: aload 1
      // 0b2: invokevirtual net/minecraft/network/play/server/S2DPacketOpenWindow.cru ()I
      // 0b5: putfield _jc.h7l I
      // 0b8: iload 4
      // 0ba: ifne 1a3
      // 0bd: goto 0c4
      // 0c0: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c3: athrow
      // 0c4: sipush 2392
      // 0c7: ldc2_w 4871114926728340363
      // 0ca: lload 2
      // 0cb: lxor
      // 0cc: invokedynamic h (IJ)Ljava/lang/String; bsm=p_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: nop
      // 0d2: aload 1
      // 0d3: invokevirtual net/minecraft/network/play/server/S2DPacketOpenWindow._p9 ()Ljava/lang/String;
      // 0d6: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0d9: goto 0e0
      // 0dc: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0df: athrow
      // 0e0: iload 4
      // 0e2: ifeq 14c
      // 0e5: ifeq 141
      // 0e8: goto 0ef
      // 0eb: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ee: athrow
      // 0ef: aload 0
      // 0f0: getfield p_k.y40 Lkh3;
      // 0f3: aload 1
      // 0f4: invokevirtual net/minecraft/network/play/server/S2DPacketOpenWindow.qyz ()I
      // 0f7: invokevirtual WorldClient.oks (I)Li2h;
      // 0fa: astore 6
      // 0fc: iload 4
      // 0fe: ifeq 130
      // 101: aload 6
      // 103: instanceof zfo
      // 106: ifeq 13c
      // 109: goto 110
      // 10c: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10f: athrow
      // 110: aload 5
      // 112: aload 6
      // 114: checkcast zfo
      // 117: new _d3
      // 11a: dup
      // 11b: aload 1
      // 11c: invokevirtual net/minecraft/network/play/server/S2DPacketOpenWindow.ot8 ()Lekw;
      // 11f: aload 1
      // 120: invokevirtual net/minecraft/network/play/server/S2DPacketOpenWindow.dz1 ()I
      // 123: invokespecial _d3.<init> (Lekw;I)V
      // 126: invokevirtual EntityPlayerSP.b_m (Lzfo;Lrsi;)V
      // 129: goto 130
      // 12c: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12f: athrow
      // 130: aload 5
      // 132: getfield EntityPlayerSP.daw L_jc;
      // 135: aload 1
      // 136: invokevirtual net/minecraft/network/play/server/S2DPacketOpenWindow.cru ()I
      // 139: putfield _jc.h7l I
      // 13c: iload 4
      // 13e: ifne 1a3
      // 141: aload 1
      // 142: invokevirtual net/minecraft/network/play/server/S2DPacketOpenWindow.jir ()Z
      // 145: goto 14c
      // 148: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14b: athrow
      // 14c: ifne 17b
      // 14f: aload 5
      // 151: new g0q
      // 154: dup
      // 155: aload 1
      // 156: invokevirtual net/minecraft/network/play/server/S2DPacketOpenWindow._p9 ()Ljava/lang/String;
      // 159: aload 1
      // 15a: invokevirtual net/minecraft/network/play/server/S2DPacketOpenWindow.ot8 ()Lekw;
      // 15d: invokespecial g0q.<init> (Ljava/lang/String;Lekw;)V
      // 160: invokevirtual EntityPlayerSP.xz_ (L_83;)V
      // 163: aload 5
      // 165: getfield EntityPlayerSP.daw L_jc;
      // 168: aload 1
      // 169: invokevirtual net/minecraft/network/play/server/S2DPacketOpenWindow.cru ()I
      // 16c: putfield _jc.h7l I
      // 16f: iload 4
      // 171: ifne 1a3
      // 174: goto 17b
      // 177: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17a: athrow
      // 17b: new tw2
      // 17e: dup
      // 17f: aload 1
      // 180: invokevirtual net/minecraft/network/play/server/S2DPacketOpenWindow._p9 ()Ljava/lang/String;
      // 183: aload 1
      // 184: invokevirtual net/minecraft/network/play/server/S2DPacketOpenWindow.ot8 ()Lekw;
      // 187: aload 1
      // 188: invokevirtual net/minecraft/network/play/server/S2DPacketOpenWindow.dz1 ()I
      // 18b: invokespecial tw2.<init> (Ljava/lang/String;Lekw;I)V
      // 18e: astore 6
      // 190: aload 5
      // 192: aload 6
      // 194: invokevirtual EntityPlayerSP.a_o (Lrsi;)V
      // 197: aload 5
      // 199: getfield EntityPlayerSP.daw L_jc;
      // 19c: aload 1
      // 19d: invokevirtual net/minecraft/network/play/server/S2DPacketOpenWindow.cru ()I
      // 1a0: putfield _jc.h7l I
      // 1a3: return
   }

   @Override
   public void a0d(S2FPacketSetSlot param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: aload 0
      // 002: aload 0
      // 003: getfield p_k.bol Lc05;
      // 006: invokestatic et9.hqd (Lmz2;Lyw3;Llg9;)V
      // 009: invokestatic OpaquePredicate.b ()I
      // 00c: aload 0
      // 00d: getfield p_k.bol Lc05;
      // 010: getfield Minecraft.vg8 Ll86;
      // 013: astore 3
      // 014: istore 2
      // 015: aload 1
      // 016: invokevirtual net/minecraft/network/play/server/S2FPacketSetSlot.s_u ()I
      // 019: iload 2
      // 01a: ifeq 046
      // 01d: bipush -1
      // 01e: if_icmpne 03e
      // 021: goto 028
      // 024: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 027: athrow
      // 028: aload 3
      // 029: getfield ha9.up_ Ljnq;
      // 02c: aload 1
      // 02d: invokevirtual net/minecraft/network/play/server/S2FPacketSetSlot.zia ()Lerg;
      // 030: invokevirtual jnq.uej (Lerg;)V
      // 033: iload 2
      // 034: ifne 1ab
      // 037: goto 03e
      // 03a: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03d: athrow
      // 03e: bipush 0
      // 03f: goto 046
      // 042: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 045: athrow
      // 046: istore 4
      // 048: aload 0
      // 049: getfield p_k.bol Lc05;
      // 04c: getfield Minecraft.u0y Lgbe;
      // 04f: instanceof qpp
      // 052: iload 2
      // 053: ifeq 097
      // 056: ifeq 093
      // 059: goto 060
      // 05c: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05f: athrow
      // 060: aload 0
      // 061: getfield p_k.bol Lc05;
      // 064: getfield Minecraft.u0y Lgbe;
      // 067: checkcast qpp
      // 06a: astore 5
      // 06c: aload 5
      // 06e: invokevirtual qpp.skv ()I
      // 071: iload 2
      // 072: ifeq 08d
      // 075: getstatic uja.xp0 Luja;
      // 078: invokevirtual uja.wvr ()I
      // 07b: if_icmpeq 090
      // 07e: goto 085
      // 081: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 084: athrow
      // 085: bipush 1
      // 086: goto 08d
      // 089: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08c: athrow
      // 08d: goto 091
      // 090: bipush 0
      // 091: istore 4
      // 093: aload 1
      // 094: invokevirtual net/minecraft/network/play/server/S2FPacketSetSlot.s_u ()I
      // 097: iload 2
      // 098: ifeq 162
      // 09b: ifne 157
      // 09e: goto 0a5
      // 0a1: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a4: athrow
      // 0a5: aload 1
      // 0a6: invokevirtual net/minecraft/network/play/server/S2FPacketSetSlot.yo5 ()I
      // 0a9: bipush 36
      // 0ab: iload 2
      // 0ac: ifeq 174
      // 0af: goto 0b6
      // 0b2: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b5: athrow
      // 0b6: if_icmplt 157
      // 0b9: goto 0c0
      // 0bc: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bf: athrow
      // 0c0: aload 1
      // 0c1: invokevirtual net/minecraft/network/play/server/S2FPacketSetSlot.yo5 ()I
      // 0c4: bipush 45
      // 0c6: iload 2
      // 0c7: ifeq 174
      // 0ca: goto 0d1
      // 0cd: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d0: athrow
      // 0d1: if_icmpge 157
      // 0d4: goto 0db
      // 0d7: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0da: athrow
      // 0db: aload 3
      // 0dc: getfield ha9.fv9 L_jc;
      // 0df: aload 1
      // 0e0: invokevirtual net/minecraft/network/play/server/S2FPacketSetSlot.yo5 ()I
      // 0e3: invokevirtual _jc.ajr (I)Lvrx;
      // 0e6: invokevirtual vrx.x4s ()Lerg;
      // 0e9: astore 5
      // 0eb: iload 2
      // 0ec: ifeq 153
      // 0ef: aload 1
      // 0f0: invokevirtual net/minecraft/network/play/server/S2FPacketSetSlot.zia ()Lerg;
      // 0f3: ifnull 144
      // 0f6: goto 0fd
      // 0f9: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fc: athrow
      // 0fd: aload 5
      // 0ff: iload 2
      // 100: ifeq 140
      // 103: goto 10a
      // 106: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 109: athrow
      // 10a: ifnull 135
      // 10d: goto 114
      // 110: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 113: athrow
      // 114: aload 5
      // 116: iload 2
      // 117: ifeq 140
      // 11a: goto 121
      // 11d: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 120: athrow
      // 121: getfield erg.qd2 I
      // 124: aload 1
      // 125: invokevirtual net/minecraft/network/play/server/S2FPacketSetSlot.zia ()Lerg;
      // 128: getfield erg.qd2 I
      // 12b: if_icmpge 144
      // 12e: goto 135
      // 131: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 134: athrow
      // 135: aload 1
      // 136: invokevirtual net/minecraft/network/play/server/S2FPacketSetSlot.zia ()Lerg;
      // 139: goto 140
      // 13c: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13f: athrow
      // 140: bipush 5
      // 141: putfield erg.i27 I
      // 144: aload 3
      // 145: getfield ha9.fv9 L_jc;
      // 148: aload 1
      // 149: invokevirtual net/minecraft/network/play/server/S2FPacketSetSlot.yo5 ()I
      // 14c: aload 1
      // 14d: invokevirtual net/minecraft/network/play/server/S2FPacketSetSlot.zia ()Lerg;
      // 150: invokevirtual _jc.tm6 (ILerg;)V
      // 153: iload 2
      // 154: ifne 1ab
      // 157: aload 1
      // 158: invokevirtual net/minecraft/network/play/server/S2FPacketSetSlot.s_u ()I
      // 15b: goto 162
      // 15e: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 161: athrow
      // 162: iload 2
      // 163: ifeq 182
      // 166: aload 3
      // 167: getfield ha9.daw L_jc;
      // 16a: getfield _jc.h7l I
      // 16d: goto 174
      // 170: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 173: athrow
      // 174: if_icmpne 1ab
      // 177: aload 1
      // 178: invokevirtual net/minecraft/network/play/server/S2FPacketSetSlot.s_u ()I
      // 17b: goto 182
      // 17e: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 181: athrow
      // 182: iload 2
      // 183: ifeq 192
      // 186: ifne 195
      // 189: goto 190
      // 18c: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18f: athrow
      // 190: iload 4
      // 192: ifne 1ab
      // 195: aload 3
      // 196: getfield ha9.daw L_jc;
      // 199: aload 1
      // 19a: invokevirtual net/minecraft/network/play/server/S2FPacketSetSlot.yo5 ()I
      // 19d: aload 1
      // 19e: invokevirtual net/minecraft/network/play/server/S2FPacketSetSlot.zia ()Lerg;
      // 1a1: invokevirtual _jc.tm6 (ILerg;)V
      // 1a4: goto 1ab
      // 1a7: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1aa: athrow
      // 1ab: return
   }

   @Override
   public void luq(S32PacketConfirmTransaction param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: aload 0
      // 02: aload 0
      // 03: getfield p_k.bol Lc05;
      // 06: invokestatic et9.hqd (Lmz2;Lyw3;Llg9;)V
      // 09: invokestatic OpaquePredicate.b ()I
      // 0c: aconst_null
      // 0d: astore 3
      // 0e: aload 0
      // 0f: getfield p_k.bol Lc05;
      // 12: getfield Minecraft.vg8 Ll86;
      // 15: astore 4
      // 17: istore 2
      // 18: aload 1
      // 19: invokevirtual net/minecraft/network/play/server/S32PacketConfirmTransaction.dtk ()I
      // 1c: iload 2
      // 1d: ifeq 37
      // 20: ifne 33
      // 23: goto 2a
      // 26: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29: athrow
      // 2a: aload 4
      // 2c: getfield ha9.fv9 L_jc;
      // 2f: astore 3
      // 30: goto 48
      // 33: aload 1
      // 34: invokevirtual net/minecraft/network/play/server/S32PacketConfirmTransaction.dtk ()I
      // 37: aload 4
      // 39: getfield ha9.daw L_jc;
      // 3c: getfield _jc.h7l I
      // 3f: if_icmpne 48
      // 42: aload 4
      // 44: getfield ha9.daw L_jc;
      // 47: astore 3
      // 48: aload 3
      // 49: ifnull 75
      // 4c: aload 1
      // 4d: invokevirtual net/minecraft/network/play/server/S32PacketConfirmTransaction.p1c ()Z
      // 50: ifne 75
      // 53: goto 5a
      // 56: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 59: athrow
      // 5a: aload 0
      // 5b: new net/minecraft/network/play/client/C0FPacketConfirmTransaction
      // 5e: dup
      // 5f: aload 1
      // 60: invokevirtual net/minecraft/network/play/server/S32PacketConfirmTransaction.dtk ()I
      // 63: aload 1
      // 64: invokevirtual net/minecraft/network/play/server/S32PacketConfirmTransaction.ms2 ()S
      // 67: bipush 1
      // 68: invokespecial net/minecraft/network/play/client/C0FPacketConfirmTransaction.<init> (ISZ)V
      // 6b: invokevirtual p_k.sxi (Lmz2;)V
      // 6e: goto 75
      // 71: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 74: athrow
      // 75: return
   }

   @Override
   public void d70(S30PacketWindowItems param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: aload 0
      // 02: aload 0
      // 03: getfield p_k.bol Lc05;
      // 06: invokestatic et9.hqd (Lmz2;Lyw3;Llg9;)V
      // 09: invokestatic OpaquePredicate.b ()I
      // 0c: aload 0
      // 0d: getfield p_k.bol Lc05;
      // 10: getfield Minecraft.vg8 Ll86;
      // 13: astore 3
      // 14: istore 2
      // 15: aload 1
      // 16: invokevirtual net/minecraft/network/play/server/S30PacketWindowItems.e_2 ()I
      // 19: iload 2
      // 1a: ifeq 48
      // 1d: ifne 3d
      // 20: goto 27
      // 23: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26: athrow
      // 27: aload 3
      // 28: getfield ha9.fv9 L_jc;
      // 2b: aload 1
      // 2c: invokevirtual net/minecraft/network/play/server/S30PacketWindowItems.rwk ()[Lerg;
      // 2f: invokevirtual _jc.eeg ([Lerg;)V
      // 32: iload 2
      // 33: ifne 64
      // 36: goto 3d
      // 39: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c: athrow
      // 3d: aload 1
      // 3e: invokevirtual net/minecraft/network/play/server/S30PacketWindowItems.e_2 ()I
      // 41: goto 48
      // 44: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 47: athrow
      // 48: aload 3
      // 49: getfield ha9.daw L_jc;
      // 4c: getfield _jc.h7l I
      // 4f: if_icmpne 64
      // 52: aload 3
      // 53: getfield ha9.daw L_jc;
      // 56: aload 1
      // 57: invokevirtual net/minecraft/network/play/server/S30PacketWindowItems.rwk ()[Lerg;
      // 5a: invokevirtual _jc.eeg ([Lerg;)V
      // 5d: goto 64
      // 60: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 63: athrow
      // 64: return
   }

   @Override
   public void qya(S36PacketSignEditorOpen var1) {
      int var2 = OpaquePredicate.b();
      et9.hqd(var1, this, this.bol);
      Object var3 = this.y40.getTileEntity(var1.oeb());

      label20: {
         try {
            if (var2 == 0) {
               return;
            }

            if (var3 instanceof TileEntitySign) {
               break label20;
            }
         } catch (IllegalStateException var4) {
            throw a(var4);
         }

         var3 = new TileEntitySign();
         ((pyk)var3)._cg(this.y40);
         ((pyk)var3).xej(var1.oeb());
      }

      this.bol.vg8.v6x((TileEntitySign)var3);
   }

   @Override
   public void _63(S33PacketUpdateSign param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic p_k.a J
      // 003: ldc2_w 40135694339554
      // 006: lxor
      // 007: lstore 2
      // 008: aload 1
      // 009: aload 0
      // 00a: aload 0
      // 00b: getfield p_k.bol Lc05;
      // 00e: invokestatic et9.hqd (Lmz2;Lyw3;Llg9;)V
      // 011: invokestatic OpaquePredicate.b ()I
      // 014: bipush 0
      // 015: istore 5
      // 017: istore 4
      // 019: aload 0
      // 01a: getfield p_k.bol Lc05;
      // 01d: getfield Minecraft.tij Lkh3;
      // 020: aload 1
      // 021: invokevirtual net/minecraft/network/play/server/S33PacketUpdateSign.mmn ()Lmew;
      // 024: invokevirtual WorldClient.xjm (Lmew;)Z
      // 027: iload 4
      // 029: ifeq 095
      // 02c: ifeq 093
      // 02f: goto 036
      // 032: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 035: athrow
      // 036: aload 0
      // 037: getfield p_k.bol Lc05;
      // 03a: getfield Minecraft.tij Lkh3;
      // 03d: aload 1
      // 03e: invokevirtual net/minecraft/network/play/server/S33PacketUpdateSign.mmn ()Lmew;
      // 041: invokevirtual WorldClient.getTileEntity (Lmew;)Lpyk;
      // 044: astore 6
      // 046: aload 6
      // 048: instanceof net/minecraft/tileentity/TileEntitySign
      // 04b: iload 4
      // 04d: ifeq 095
      // 050: ifeq 093
      // 053: goto 05a
      // 056: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 059: athrow
      // 05a: aload 6
      // 05c: checkcast net/minecraft/tileentity/TileEntitySign
      // 05f: astore 7
      // 061: aload 7
      // 063: invokevirtual net/minecraft/tileentity/TileEntitySign.z41 ()Z
      // 066: iload 4
      // 068: ifeq 091
      // 06b: ifeq 090
      // 06e: goto 075
      // 071: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 074: athrow
      // 075: aload 1
      // 076: invokevirtual net/minecraft/network/play/server/S33PacketUpdateSign.iqy ()[Lekw;
      // 079: bipush 0
      // 07a: aload 7
      // 07c: getfield net/minecraft/tileentity/TileEntitySign.lvt [Lekw;
      // 07f: bipush 0
      // 080: bipush 4
      // 081: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 084: aload 7
      // 086: invokevirtual net/minecraft/tileentity/TileEntitySign.r5t ()V
      // 089: goto 090
      // 08c: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08f: athrow
      // 090: bipush 1
      // 091: istore 5
      // 093: iload 5
      // 095: ifne 128
      // 098: aload 0
      // 099: getfield p_k.bol Lc05;
      // 09c: getfield Minecraft.vg8 Ll86;
      // 09f: iload 4
      // 0a1: ifeq 0c3
      // 0a4: goto 0ab
      // 0a7: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0aa: athrow
      // 0ab: ifnull 128
      // 0ae: goto 0b5
      // 0b1: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b4: athrow
      // 0b5: aload 0
      // 0b6: getfield p_k.bol Lc05;
      // 0b9: getfield Minecraft.vg8 Ll86;
      // 0bc: goto 0c3
      // 0bf: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c2: athrow
      // 0c3: new tao
      // 0c6: dup
      // 0c7: new java/lang/StringBuilder
      // 0ca: dup
      // 0cb: invokespecial java/lang/StringBuilder.<init> ()V
      // 0ce: sipush 16907
      // 0d1: ldc2_w 4997438843104236082
      // 0d4: lload 2
      // 0d5: lxor
      // 0d6: invokedynamic h (IJ)Ljava/lang/String; bsm=p_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0db: nop
      // 0dc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0df: aload 1
      // 0e0: invokevirtual net/minecraft/network/play/server/S33PacketUpdateSign.mmn ()Lmew;
      // 0e3: invokevirtual mew.getX ()I
      // 0e6: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0e9: sipush 13137
      // 0ec: ldc2_w 4607018370273010539
      // 0ef: lload 2
      // 0f0: lxor
      // 0f1: invokedynamic h (IJ)Ljava/lang/String; bsm=p_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f6: nop
      // 0f7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0fa: aload 1
      // 0fb: invokevirtual net/minecraft/network/play/server/S33PacketUpdateSign.mmn ()Lmew;
      // 0fe: invokevirtual mew.getY ()I
      // 101: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 104: sipush 7708
      // 107: ldc2_w 6406620259492941351
      // 10a: lload 2
      // 10b: lxor
      // 10c: invokedynamic h (IJ)Ljava/lang/String; bsm=p_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 111: nop
      // 112: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 115: aload 1
      // 116: invokevirtual net/minecraft/network/play/server/S33PacketUpdateSign.mmn ()Lmew;
      // 119: invokevirtual mew.getZ ()I
      // 11c: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 11f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 122: invokespecial tao.<init> (Ljava/lang/String;)V
      // 125: invokevirtual EntityPlayerSP.a0d (Lekw;)V
      // 128: return
   }

   @Override
   public void x0j(S35PacketUpdateTileEntity param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 2
      // 004: aload 1
      // 005: aload 0
      // 006: aload 0
      // 007: getfield p_k.bol Lc05;
      // 00a: invokestatic et9.hqd (Lmz2;Lyw3;Llg9;)V
      // 00d: aload 0
      // 00e: getfield p_k.bol Lc05;
      // 011: getfield Minecraft.tij Lkh3;
      // 014: aload 1
      // 015: invokevirtual net/minecraft/network/play/server/S35PacketUpdateTileEntity.dox ()Lmew;
      // 018: iload 2
      // 019: ifeq 03b
      // 01c: invokevirtual WorldClient.xjm (Lmew;)Z
      // 01f: ifeq 16d
      // 022: goto 029
      // 025: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 028: athrow
      // 029: aload 0
      // 02a: getfield p_k.bol Lc05;
      // 02d: getfield Minecraft.tij Lkh3;
      // 030: aload 1
      // 031: invokevirtual net/minecraft/network/play/server/S35PacketUpdateTileEntity.dox ()Lmew;
      // 034: goto 03b
      // 037: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03a: athrow
      // 03b: invokevirtual WorldClient.getTileEntity (Lmew;)Lpyk;
      // 03e: astore 3
      // 03f: aload 1
      // 040: invokevirtual net/minecraft/network/play/server/S35PacketUpdateTileEntity.o2i ()I
      // 043: istore 4
      // 045: iload 4
      // 047: bipush 1
      // 048: iload 2
      // 049: ifeq 079
      // 04c: if_icmpne 06f
      // 04f: goto 056
      // 052: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 055: athrow
      // 056: aload 3
      // 057: iload 2
      // 058: ifeq 166
      // 05b: goto 062
      // 05e: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 061: athrow
      // 062: instanceof net/minecraft/tileentity/TileEntityMobSpawner
      // 065: ifne 165
      // 068: goto 06f
      // 06b: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06e: athrow
      // 06f: iload 4
      // 071: bipush 2
      // 072: goto 079
      // 075: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 078: athrow
      // 079: iload 2
      // 07a: ifeq 0aa
      // 07d: if_icmpne 0a0
      // 080: goto 087
      // 083: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 086: athrow
      // 087: aload 3
      // 088: iload 2
      // 089: ifeq 166
      // 08c: goto 093
      // 08f: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 092: athrow
      // 093: instanceof net/minecraft/tileentity/TileEntityCommandBlock
      // 096: ifne 165
      // 099: goto 0a0
      // 09c: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09f: athrow
      // 0a0: iload 4
      // 0a2: bipush 3
      // 0a3: goto 0aa
      // 0a6: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a9: athrow
      // 0aa: iload 2
      // 0ab: ifeq 0db
      // 0ae: if_icmpne 0d1
      // 0b1: goto 0b8
      // 0b4: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b7: athrow
      // 0b8: aload 3
      // 0b9: iload 2
      // 0ba: ifeq 166
      // 0bd: goto 0c4
      // 0c0: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c3: athrow
      // 0c4: instanceof net/minecraft/tileentity/TileEntityBeacon
      // 0c7: ifne 165
      // 0ca: goto 0d1
      // 0cd: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d0: athrow
      // 0d1: iload 4
      // 0d3: bipush 4
      // 0d4: goto 0db
      // 0d7: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0da: athrow
      // 0db: iload 2
      // 0dc: ifeq 10c
      // 0df: if_icmpne 102
      // 0e2: goto 0e9
      // 0e5: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e8: athrow
      // 0e9: aload 3
      // 0ea: iload 2
      // 0eb: ifeq 166
      // 0ee: goto 0f5
      // 0f1: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f4: athrow
      // 0f5: instanceof net/minecraft/tileentity/TileEntitySkull
      // 0f8: ifne 165
      // 0fb: goto 102
      // 0fe: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 101: athrow
      // 102: iload 4
      // 104: bipush 5
      // 105: goto 10c
      // 108: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10b: athrow
      // 10c: iload 2
      // 10d: ifeq 149
      // 110: if_icmpne 133
      // 113: goto 11a
      // 116: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 119: athrow
      // 11a: aload 3
      // 11b: iload 2
      // 11c: ifeq 166
      // 11f: goto 126
      // 122: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 125: athrow
      // 126: instanceof net/minecraft/tileentity/TileEntityFlowerPot
      // 129: ifne 165
      // 12c: goto 133
      // 12f: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 132: athrow
      // 133: iload 4
      // 135: iload 2
      // 136: ifeq 162
      // 139: goto 140
      // 13c: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13f: athrow
      // 140: bipush 6
      // 142: goto 149
      // 145: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 148: athrow
      // 149: if_icmpne 16d
      // 14c: aload 3
      // 14d: iload 2
      // 14e: ifeq 166
      // 151: goto 158
      // 154: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 157: athrow
      // 158: instanceof net/minecraft/tileentity/TileEntityBanner
      // 15b: goto 162
      // 15e: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 161: athrow
      // 162: ifeq 16d
      // 165: aload 3
      // 166: aload 1
      // 167: invokevirtual net/minecraft/network/play/server/S35PacketUpdateTileEntity.bxo ()Lbdo;
      // 16a: invokevirtual pyk.agl (Lbdo;)V
      // 16d: return
   }

   @Override
   public void b33(S31PacketWindowProperty param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: aload 0
      // 02: aload 0
      // 03: getfield p_k.bol Lc05;
      // 06: invokestatic et9.hqd (Lmz2;Lyw3;Llg9;)V
      // 09: invokestatic OpaquePredicate.c ()I
      // 0c: aload 0
      // 0d: getfield p_k.bol Lc05;
      // 10: getfield Minecraft.vg8 Ll86;
      // 13: astore 3
      // 14: istore 2
      // 15: aload 3
      // 16: getfield ha9.daw L_jc;
      // 19: iload 2
      // 1a: ifne 32
      // 1d: ifnull 5d
      // 20: goto 27
      // 23: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26: athrow
      // 27: aload 3
      // 28: getfield ha9.daw L_jc;
      // 2b: goto 32
      // 2e: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: iload 2
      // 33: ifne 52
      // 36: getfield _jc.h7l I
      // 39: aload 1
      // 3a: invokevirtual net/minecraft/network/play/server/S31PacketWindowProperty.m1d ()I
      // 3d: if_icmpne 5d
      // 40: goto 47
      // 43: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 46: athrow
      // 47: aload 3
      // 48: getfield ha9.daw L_jc;
      // 4b: goto 52
      // 4e: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 51: athrow
      // 52: aload 1
      // 53: invokevirtual net/minecraft/network/play/server/S31PacketWindowProperty.k0r ()I
      // 56: aload 1
      // 57: invokevirtual net/minecraft/network/play/server/S31PacketWindowProperty.fv6 ()I
      // 5a: invokevirtual _jc.l0n (II)V
      // 5d: return
   }

   @Override
   public void j2v(S04PacketEntityEquipment var1) {
      et9.hqd(var1, this, this.bol);
      int var10000 = OpaquePredicate.b();
      EntityLivingBase var3 = this.y40.oks(var1.z63());
      int var2 = var10000;

      label20: {
         try {
            var5 = var3;
            if (var2 == 0) {
               break label20;
            }

            if (var3 == null) {
               return;
            }
         } catch (IllegalStateException var4) {
            throw a(var4);
         }

         var5 = var3;
      }

      var5.fga(var1.uu8(), var1.ywl());
   }

   @Override
   public void kww(S2EPacketCloseWindow var1) {
      et9.hqd(var1, this, this.bol);
      this.bol.vg8.n9l();
   }

   @Override
   public void jhp(S24PacketBlockAction var1) {
      et9.hqd(var1, this, this.bol);
      this.bol.tij.dfj(var1.rlo(), var1.uym(), var1._74(), var1.en9());
   }

   @Override
   public void collectTargets(S25PacketBlockBreakAnim var1) {
      et9.hqd(var1, this, this.bol);
      this.bol.tij.vn_(var1.enb(), var1.nxc(), var1.x30());
   }

   @Override
   public void k0h(S26PacketMapChunkBulk param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: aload 0
      // 02: aload 0
      // 03: getfield p_k.bol Lc05;
      // 06: invokestatic et9.hqd (Lmz2;Lyw3;Llg9;)V
      // 09: invokestatic OpaquePredicate.b ()I
      // 0c: bipush 0
      // 0d: istore 3
      // 0e: istore 2
      // 0f: iload 3
      // 10: aload 1
      // 11: invokevirtual net/minecraft/network/play/server/S26PacketMapChunkBulk.rpa ()I
      // 14: if_icmpge bb
      // 17: aload 1
      // 18: iload 3
      // 19: invokevirtual net/minecraft/network/play/server/S26PacketMapChunkBulk.lu7 (I)I
      // 1c: istore 4
      // 1e: aload 1
      // 1f: iload 3
      // 20: invokevirtual net/minecraft/network/play/server/S26PacketMapChunkBulk._d7 (I)I
      // 23: istore 5
      // 25: aload 0
      // 26: getfield p_k.y40 Lkh3;
      // 29: iload 4
      // 2b: iload 5
      // 2d: bipush 1
      // 2e: invokevirtual WorldClient.ef0 (IIZ)V
      // 31: aload 0
      // 32: getfield p_k.y40 Lkh3;
      // 35: iload 4
      // 37: bipush 4
      // 38: ishl
      // 39: bipush 0
      // 3a: iload 5
      // 3c: bipush 4
      // 3d: ishl
      // 3e: iload 4
      // 40: bipush 4
      // 41: ishl
      // 42: bipush 15
      // 44: iadd
      // 45: sipush 256
      // 48: iload 5
      // 4a: bipush 4
      // 4b: ishl
      // 4c: bipush 15
      // 4e: iadd
      // 4f: invokevirtual WorldClient.fx0 (IIIIII)V
      // 52: aload 0
      // 53: getfield p_k.y40 Lkh3;
      // 56: iload 4
      // 58: iload 5
      // 5a: invokevirtual WorldClient.o5h (II)Ltts;
      // 5d: astore 6
      // 5f: aload 6
      // 61: aload 1
      // 62: iload 3
      // 63: invokevirtual net/minecraft/network/play/server/S26PacketMapChunkBulk.s15 (I)[B
      // 66: aload 1
      // 67: iload 3
      // 68: invokevirtual net/minecraft/network/play/server/S26PacketMapChunkBulk.jwi (I)I
      // 6b: bipush 1
      // 6c: invokevirtual tts._uu ([BIZ)V
      // 6f: aload 0
      // 70: getfield p_k.y40 Lkh3;
      // 73: iload 4
      // 75: bipush 4
      // 76: ishl
      // 77: bipush 0
      // 78: iload 5
      // 7a: bipush 4
      // 7b: ishl
      // 7c: iload 4
      // 7e: bipush 4
      // 7f: ishl
      // 80: bipush 15
      // 82: iadd
      // 83: sipush 256
      // 86: iload 5
      // 88: bipush 4
      // 89: ishl
      // 8a: bipush 15
      // 8c: iadd
      // 8d: invokevirtual WorldClient.pa7 (IIIIII)V
      // 90: iload 2
      // 91: ifeq b7
      // 94: aload 0
      // 95: getfield p_k.y40 Lkh3;
      // 98: getfield WorldClient.vzz Lupn;
      // 9b: instanceof ure
      // 9e: ifne b4
      // a1: goto a8
      // a4: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a7: athrow
      // a8: aload 6
      // aa: invokevirtual tts.e8r ()V
      // ad: goto b4
      // b0: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b3: athrow
      // b4: iinc 3 1
      // b7: iload 2
      // b8: ifne 0f
      // bb: return
   }

   @Override
   public void fq1(S2BPacketChangeGameState param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic p_k.a J
      // 003: ldc2_w 91476410924423
      // 006: lxor
      // 007: lstore 2
      // 008: aload 1
      // 009: aload 0
      // 00a: aload 0
      // 00b: getfield p_k.bol Lc05;
      // 00e: invokestatic et9.hqd (Lmz2;Lyw3;Llg9;)V
      // 011: invokestatic OpaquePredicate.c ()I
      // 014: aload 0
      // 015: getfield p_k.bol Lc05;
      // 018: getfield Minecraft.vg8 Ll86;
      // 01b: astore 5
      // 01d: aload 1
      // 01e: invokevirtual net/minecraft/network/play/server/S2BPacketChangeGameState.f50 ()I
      // 021: istore 6
      // 023: istore 4
      // 025: aload 1
      // 026: invokevirtual net/minecraft/network/play/server/S2BPacketChangeGameState.xs5 ()F
      // 029: fstore 7
      // 02b: fload 7
      // 02d: ldc 0.5
      // 02f: nop
      // 030: fadd
      // 031: invokestatic fe6.tpk (F)I
      // 034: istore 8
      // 036: iload 6
      // 038: iload 4
      // 03a: ifne 092
      // 03d: iflt 090
      // 040: goto 047
      // 043: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 046: athrow
      // 047: iload 6
      // 049: getstatic net/minecraft/network/play/server/S2BPacketChangeGameState.t56 [Ljava/lang/String;
      // 04c: arraylength
      // 04d: iload 4
      // 04f: ifne 093
      // 052: goto 059
      // 055: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 058: athrow
      // 059: if_icmpge 090
      // 05c: goto 063
      // 05f: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 062: athrow
      // 063: getstatic net/minecraft/network/play/server/S2BPacketChangeGameState.t56 [Ljava/lang/String;
      // 066: iload 6
      // 068: aaload
      // 069: ifnull 090
      // 06c: goto 073
      // 06f: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 072: athrow
      // 073: aload 5
      // 075: new hsu
      // 078: dup
      // 079: getstatic net/minecraft/network/play/server/S2BPacketChangeGameState.t56 [Ljava/lang/String;
      // 07c: iload 6
      // 07e: aaload
      // 07f: bipush 0
      // 080: anewarray 27
      // 083: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 086: invokevirtual ha9.tog (Lekw;)V
      // 089: goto 090
      // 08c: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08f: athrow
      // 090: iload 6
      // 092: bipush 1
      // 093: iload 4
      // 095: ifne 0cb
      // 098: if_icmpne 0c1
      // 09b: goto 0a2
      // 09e: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a1: athrow
      // 0a2: aload 0
      // 0a3: getfield p_k.y40 Lkh3;
      // 0a6: invokevirtual WorldClient.r7d ()Lcog;
      // 0a9: bipush 1
      // 0aa: invokevirtual cog.do3 (Z)V
      // 0ad: aload 0
      // 0ae: getfield p_k.y40 Lkh3;
      // 0b1: fconst_0
      // 0b2: invokevirtual WorldClient.cbc (F)V
      // 0b5: iload 4
      // 0b7: ifeq 3f1
      // 0ba: goto 0c1
      // 0bd: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c0: athrow
      // 0c1: iload 6
      // 0c3: bipush 2
      // 0c4: goto 0cb
      // 0c7: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ca: athrow
      // 0cb: iload 4
      // 0cd: ifne 103
      // 0d0: if_icmpne 0f9
      // 0d3: goto 0da
      // 0d6: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d9: athrow
      // 0da: aload 0
      // 0db: getfield p_k.y40 Lkh3;
      // 0de: invokevirtual WorldClient.r7d ()Lcog;
      // 0e1: bipush 0
      // 0e2: invokevirtual cog.do3 (Z)V
      // 0e5: aload 0
      // 0e6: getfield p_k.y40 Lkh3;
      // 0e9: fconst_1
      // 0ea: invokevirtual WorldClient.cbc (F)V
      // 0ed: iload 4
      // 0ef: ifeq 3f1
      // 0f2: goto 0f9
      // 0f5: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f8: athrow
      // 0f9: iload 6
      // 0fb: bipush 3
      // 0fc: goto 103
      // 0ff: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 102: athrow
      // 103: iload 4
      // 105: ifne 137
      // 108: if_icmpne 12d
      // 10b: goto 112
      // 10e: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 111: athrow
      // 112: aload 0
      // 113: getfield p_k.bol Lc05;
      // 116: getfield Minecraft.l7q Lhh6;
      // 119: iload 8
      // 11b: invokestatic h50$f05.e9x (I)Lh50$f05;
      // 11e: invokevirtual hh6.qm5 (Lh50$f05;)V
      // 121: iload 4
      // 123: ifeq 3f1
      // 126: goto 12d
      // 129: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12c: athrow
      // 12d: iload 6
      // 12f: bipush 4
      // 130: goto 137
      // 133: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 136: athrow
      // 137: iload 4
      // 139: ifne 16a
      // 13c: if_icmpne 160
      // 13f: goto 146
      // 142: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 145: athrow
      // 146: aload 0
      // 147: getfield p_k.bol Lc05;
      // 14a: new bbk
      // 14d: dup
      // 14e: invokespecial bbk.<init> ()V
      // 151: invokevirtual Minecraft.z2i (Lgbe;)V
      // 154: iload 4
      // 156: ifeq 3f1
      // 159: goto 160
      // 15c: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15f: athrow
      // 160: iload 6
      // 162: bipush 5
      // 163: goto 16a
      // 166: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 169: athrow
      // 16a: iload 4
      // 16c: ifne 2eb
      // 16f: if_icmpne 2e0
      // 172: goto 179
      // 175: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 178: athrow
      // 179: aload 0
      // 17a: getfield p_k.bol Lc05;
      // 17d: getfield Minecraft.oxn Lmoh;
      // 180: astore 9
      // 182: fload 7
      // 184: fconst_0
      // 185: fcmpl
      // 186: iload 4
      // 188: ifne 1bc
      // 18b: ifne 1af
      // 18e: goto 195
      // 191: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 194: athrow
      // 195: aload 0
      // 196: getfield p_k.bol Lc05;
      // 199: new t3z
      // 19c: dup
      // 19d: invokespecial t3z.<init> ()V
      // 1a0: invokevirtual Minecraft.z2i (Lgbe;)V
      // 1a3: iload 4
      // 1a5: ifeq 2db
      // 1a8: goto 1af
      // 1ab: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ae: athrow
      // 1af: fload 7
      // 1b1: ldc 101.0
      // 1b3: nop
      // 1b4: fcmpl
      // 1b5: goto 1bc
      // 1b8: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1bb: athrow
      // 1bc: iload 4
      // 1be: ifne 242
      // 1c1: ifne 235
      // 1c4: goto 1cb
      // 1c7: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ca: athrow
      // 1cb: aload 0
      // 1cc: getfield p_k.bol Lc05;
      // 1cf: getfield Minecraft.t43 Ld1f;
      // 1d2: invokevirtual d1f.lcg ()Lsxg;
      // 1d5: new hsu
      // 1d8: dup
      // 1d9: sipush 32249
      // 1dc: ldc2_w 304273446037069227
      // 1df: lload 2
      // 1e0: lxor
      // 1e1: invokedynamic h (IJ)Ljava/lang/String; bsm=p_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e6: nop
      // 1e7: bipush 4
      // 1e8: anewarray 27
      // 1eb: dup
      // 1ec: bipush 0
      // 1ed: aload 9
      // 1ef: getfield moh.mn1 Lm7l;
      // 1f2: invokevirtual m7l.xbs ()I
      // 1f5: invokestatic moh.wx5 (I)Ljava/lang/String;
      // 1f8: aastore
      // 1f9: dup
      // 1fa: bipush 1
      // 1fb: aload 9
      // 1fd: getfield moh._70 Lm7l;
      // 200: invokevirtual m7l.xbs ()I
      // 203: invokestatic moh.wx5 (I)Ljava/lang/String;
      // 206: aastore
      // 207: dup
      // 208: bipush 2
      // 209: aload 9
      // 20b: getfield moh.tup Lm7l;
      // 20e: invokevirtual m7l.xbs ()I
      // 211: invokestatic moh.wx5 (I)Ljava/lang/String;
      // 214: aastore
      // 215: dup
      // 216: bipush 3
      // 217: aload 9
      // 219: getfield moh.asx Lm7l;
      // 21c: invokevirtual m7l.xbs ()I
      // 21f: invokestatic moh.wx5 (I)Ljava/lang/String;
      // 222: aastore
      // 223: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 226: invokevirtual sxg.obg (Lekw;)V
      // 229: iload 4
      // 22b: ifeq 2db
      // 22e: goto 235
      // 231: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 234: athrow
      // 235: fload 7
      // 237: ldc 102.0
      // 239: nop
      // 23a: fcmpl
      // 23b: goto 242
      // 23e: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 241: athrow
      // 242: iload 4
      // 244: ifne 29e
      // 247: ifne 291
      // 24a: goto 251
      // 24d: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 250: athrow
      // 251: aload 0
      // 252: getfield p_k.bol Lc05;
      // 255: getfield Minecraft.t43 Ld1f;
      // 258: invokevirtual d1f.lcg ()Lsxg;
      // 25b: new hsu
      // 25e: dup
      // 25f: sipush 3362
      // 262: ldc2_w 5426023626319097202
      // 265: lload 2
      // 266: lxor
      // 267: invokedynamic h (IJ)Ljava/lang/String; bsm=p_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26c: nop
      // 26d: bipush 1
      // 26e: anewarray 27
      // 271: dup
      // 272: bipush 0
      // 273: aload 9
      // 275: getfield moh.nfb Lm7l;
      // 278: invokevirtual m7l.xbs ()I
      // 27b: invokestatic moh.wx5 (I)Ljava/lang/String;
      // 27e: aastore
      // 27f: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 282: invokevirtual sxg.obg (Lekw;)V
      // 285: iload 4
      // 287: ifeq 2db
      // 28a: goto 291
      // 28d: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 290: athrow
      // 291: fload 7
      // 293: ldc 103.0
      // 295: nop
      // 296: fcmpl
      // 297: goto 29e
      // 29a: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29d: athrow
      // 29e: ifne 2db
      // 2a1: aload 0
      // 2a2: getfield p_k.bol Lc05;
      // 2a5: getfield Minecraft.t43 Ld1f;
      // 2a8: invokevirtual d1f.lcg ()Lsxg;
      // 2ab: new hsu
      // 2ae: dup
      // 2af: bipush 39
      // 2b1: ldc2_w 2403930843645599866
      // 2b4: lload 2
      // 2b5: lxor
      // 2b6: invokedynamic h (IJ)Ljava/lang/String; bsm=p_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2bb: nop
      // 2bc: bipush 1
      // 2bd: anewarray 27
      // 2c0: dup
      // 2c1: bipush 0
      // 2c2: aload 9
      // 2c4: getfield moh.iaz Lm7l;
      // 2c7: invokevirtual m7l.xbs ()I
      // 2ca: invokestatic moh.wx5 (I)Ljava/lang/String;
      // 2cd: aastore
      // 2ce: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 2d1: invokevirtual sxg.obg (Lekw;)V
      // 2d4: goto 2db
      // 2d7: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2da: athrow
      // 2db: iload 4
      // 2dd: ifeq 3f1
      // 2e0: iload 6
      // 2e2: bipush 6
      // 2e4: goto 2eb
      // 2e7: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2ea: athrow
      // 2eb: iload 4
      // 2ed: ifne 343
      // 2f0: if_icmpne 338
      // 2f3: goto 2fa
      // 2f6: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f9: athrow
      // 2fa: aload 0
      // 2fb: getfield p_k.y40 Lkh3;
      // 2fe: aload 5
      // 300: getfield ha9.o2v D
      // 303: aload 5
      // 305: getfield ha9.kfp D
      // 308: aload 5
      // 30a: invokevirtual ha9.c5y ()F
      // 30d: f2d
      // 30e: dadd
      // 30f: aload 5
      // 311: getfield ha9.vbd D
      // 314: sipush 23658
      // 317: ldc2_w 2725107441664015405
      // 31a: lload 2
      // 31b: lxor
      // 31c: invokedynamic h (IJ)Ljava/lang/String; bsm=p_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 321: nop
      // 322: ldc 0.18
      // 324: nop
      // 325: ldc 0.45
      // 327: nop
      // 328: bipush 0
      // 329: invokevirtual WorldClient.wd_ (DDDLjava/lang/String;FFZ)V
      // 32c: iload 4
      // 32e: ifeq 3f1
      // 331: goto 338
      // 334: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 337: athrow
      // 338: iload 6
      // 33a: bipush 7
      // 33c: goto 343
      // 33f: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 342: athrow
      // 343: iload 4
      // 345: ifne 372
      // 348: if_icmpne 367
      // 34b: goto 352
      // 34e: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 351: athrow
      // 352: aload 0
      // 353: getfield p_k.y40 Lkh3;
      // 356: fload 7
      // 358: invokevirtual WorldClient.cbc (F)V
      // 35b: iload 4
      // 35d: ifeq 3f1
      // 360: goto 367
      // 363: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 366: athrow
      // 367: iload 6
      // 369: bipush 8
      // 36b: goto 372
      // 36e: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 371: athrow
      // 372: iload 4
      // 374: ifne 3a1
      // 377: if_icmpne 396
      // 37a: goto 381
      // 37d: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 380: athrow
      // 381: aload 0
      // 382: getfield p_k.y40 Lkh3;
      // 385: fload 7
      // 387: invokevirtual WorldClient.wmg (F)V
      // 38a: iload 4
      // 38c: ifeq 3f1
      // 38f: goto 396
      // 392: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 395: athrow
      // 396: iload 6
      // 398: bipush 10
      // 39a: goto 3a1
      // 39d: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a0: athrow
      // 3a1: if_icmpne 3f1
      // 3a4: aload 0
      // 3a5: getfield p_k.y40 Lkh3;
      // 3a8: getstatic w_0.tum Lw_0;
      // 3ab: aload 5
      // 3ad: getfield ha9.o2v D
      // 3b0: aload 5
      // 3b2: getfield ha9.kfp D
      // 3b5: aload 5
      // 3b7: getfield ha9.vbd D
      // 3ba: dconst_0
      // 3bb: dconst_0
      // 3bc: dconst_0
      // 3bd: bipush 0
      // 3be: newarray 10
      // 3c0: invokevirtual WorldClient.zvy (Lw_0;DDDDDD[I)V
      // 3c3: aload 0
      // 3c4: getfield p_k.y40 Lkh3;
      // 3c7: aload 5
      // 3c9: getfield ha9.o2v D
      // 3cc: aload 5
      // 3ce: getfield ha9.kfp D
      // 3d1: aload 5
      // 3d3: getfield ha9.vbd D
      // 3d6: sipush 17417
      // 3d9: ldc2_w 7804876788840571974
      // 3dc: lload 2
      // 3dd: lxor
      // 3de: invokedynamic h (IJ)Ljava/lang/String; bsm=p_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e3: nop
      // 3e4: fconst_1
      // 3e5: fconst_1
      // 3e6: bipush 0
      // 3e7: invokevirtual WorldClient.wd_ (DDDLjava/lang/String;FFZ)V
      // 3ea: goto 3f1
      // 3ed: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3f0: athrow
      // 3f1: return
   }

   @Override
   public void msb(S34PacketMaps var1) {
      et9.hqd(var1, this, this.bol);
      ucr var2 = f58.mam(var1.bki(), this.bol.tij);
      var1.uou(var2);
      this.bol.x0p.g16().qxz(var2);
   }

   @Override
   public void nzf(S28PacketEffect param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: aload 0
      // 06: aload 0
      // 07: getfield p_k.bol Lc05;
      // 0a: invokestatic et9.hqd (Lmz2;Lyw3;Llg9;)V
      // 0d: iload 2
      // 0e: ifne 3c
      // 11: aload 1
      // 12: invokevirtual net/minecraft/network/play/server/S28PacketEffect.cc4 ()Z
      // 15: ifeq 40
      // 18: goto 1f
      // 1b: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: aload 0
      // 20: getfield p_k.bol Lc05;
      // 23: getfield Minecraft.tij Lkh3;
      // 26: aload 1
      // 27: invokevirtual net/minecraft/network/play/server/S28PacketEffect.eip ()I
      // 2a: aload 1
      // 2b: invokevirtual net/minecraft/network/play/server/S28PacketEffect.ad5 ()Lmew;
      // 2e: aload 1
      // 2f: invokevirtual net/minecraft/network/play/server/S28PacketEffect.p_2 ()I
      // 32: invokevirtual WorldClient.addSubEngine (ILmew;I)V
      // 35: goto 3c
      // 38: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b: athrow
      // 3c: iload 2
      // 3d: ifeq 5d
      // 40: aload 0
      // 41: getfield p_k.bol Lc05;
      // 44: getfield Minecraft.tij Lkh3;
      // 47: aload 1
      // 48: invokevirtual net/minecraft/network/play/server/S28PacketEffect.eip ()I
      // 4b: aload 1
      // 4c: invokevirtual net/minecraft/network/play/server/S28PacketEffect.ad5 ()Lmew;
      // 4f: aload 1
      // 50: invokevirtual net/minecraft/network/play/server/S28PacketEffect.p_2 ()I
      // 53: invokevirtual WorldClient.qca (ILmew;I)V
      // 56: goto 5d
      // 59: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5c: athrow
      // 5d: return
   }

   @Override
   public void w17(S37PacketStatistics param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: aload 0
      // 002: aload 0
      // 003: getfield p_k.bol Lc05;
      // 006: invokestatic et9.hqd (Lmz2;Lyw3;Llg9;)V
      // 009: invokestatic OpaquePredicate.c ()I
      // 00c: bipush 0
      // 00d: istore 3
      // 00e: istore 2
      // 00f: aload 1
      // 010: invokevirtual net/minecraft/network/play/server/S37PacketStatistics.jmb ()Ljava/util/Map;
      // 013: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 018: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 01d: astore 4
      // 01f: aload 4
      // 021: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 026: ifeq 138
      // 029: aload 4
      // 02b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 030: checkcast java/util/Map$Entry
      // 033: astore 5
      // 035: aload 5
      // 037: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 03c: checkcast _ss
      // 03f: astore 6
      // 041: aload 5
      // 043: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 048: checkcast java/lang/Integer
      // 04b: invokevirtual java/lang/Integer.intValue ()I
      // 04e: istore 7
      // 050: iload 2
      // 051: ifne 134
      // 054: aload 6
      // 056: invokevirtual _ss.koi ()Z
      // 059: iload 2
      // 05a: ifne 13c
      // 05d: goto 064
      // 060: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 063: athrow
      // 064: ifeq 11c
      // 067: goto 06e
      // 06a: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06d: athrow
      // 06e: iload 7
      // 070: iload 2
      // 071: ifne 090
      // 074: goto 07b
      // 077: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07a: athrow
      // 07b: ifle 11c
      // 07e: goto 085
      // 081: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 084: athrow
      // 085: aload 0
      // 086: getfield p_k.jqy Z
      // 089: goto 090
      // 08c: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08f: athrow
      // 090: iload 2
      // 091: ifne 11b
      // 094: ifeq 11a
      // 097: goto 09e
      // 09a: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09d: athrow
      // 09e: aload 0
      // 09f: getfield p_k.bol Lc05;
      // 0a2: getfield Minecraft.vg8 Ll86;
      // 0a5: invokevirtual EntityPlayerSP.hgi ()Lik0;
      // 0a8: aload 6
      // 0aa: invokevirtual ik0.zgq (L_ss;)I
      // 0ad: iload 2
      // 0ae: ifne 11b
      // 0b1: goto 0b8
      // 0b4: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b7: athrow
      // 0b8: ifne 11a
      // 0bb: goto 0c2
      // 0be: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c1: athrow
      // 0c2: aload 6
      // 0c4: checkcast l7l
      // 0c7: astore 8
      // 0c9: aload 0
      // 0ca: getfield p_k.bol Lc05;
      // 0cd: getfield Minecraft.nff Lroz;
      // 0d0: aload 8
      // 0d2: invokevirtual roz.ky_ (Ll7l;)V
      // 0d5: aload 0
      // 0d6: getfield p_k.bol Lc05;
      // 0d9: invokevirtual Minecraft.vnk ()Ltyh;
      // 0dc: new amc
      // 0df: dup
      // 0e0: aload 8
      // 0e2: invokespecial amc.<init> (Ll7l;)V
      // 0e5: lconst_0
      // 0e6: invokeinterface tyh.gfs (Lnoz;J)V 4
      // 0eb: iload 2
      // 0ec: ifne 110
      // 0ef: aload 6
      // 0f1: getstatic y8d.j5f Ll7l;
      // 0f4: if_acmpne 11a
      // 0f7: goto 0fe
      // 0fa: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fd: athrow
      // 0fe: aload 0
      // 0ff: getfield p_k.bol Lc05;
      // 102: getfield Minecraft.oxn Lmoh;
      // 105: bipush 0
      // 106: putfield moh.pk8 Z
      // 109: goto 110
      // 10c: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10f: athrow
      // 110: aload 0
      // 111: getfield p_k.bol Lc05;
      // 114: getfield Minecraft.oxn Lmoh;
      // 117: invokevirtual moh.cmo ()V
      // 11a: bipush 1
      // 11b: istore 3
      // 11c: aload 0
      // 11d: getfield p_k.bol Lc05;
      // 120: getfield Minecraft.vg8 Ll86;
      // 123: invokevirtual EntityPlayerSP.hgi ()Lik0;
      // 126: aload 0
      // 127: getfield p_k.bol Lc05;
      // 12a: getfield Minecraft.vg8 Ll86;
      // 12d: aload 6
      // 12f: iload 7
      // 131: invokevirtual ik0.xzh (Lha9;L_ss;I)V
      // 134: iload 2
      // 135: ifeq 01f
      // 138: aload 0
      // 139: getfield p_k.jqy Z
      // 13c: iload 2
      // 13d: ifne 1ad
      // 140: ifne 193
      // 143: goto 14a
      // 146: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 149: athrow
      // 14a: iload 3
      // 14b: iload 2
      // 14c: ifne 1ad
      // 14f: goto 156
      // 152: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 155: athrow
      // 156: ifne 193
      // 159: goto 160
      // 15c: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15f: athrow
      // 160: aload 0
      // 161: getfield p_k.bol Lc05;
      // 164: getfield Minecraft.oxn Lmoh;
      // 167: getfield moh.pk8 Z
      // 16a: iload 2
      // 16b: ifne 1ad
      // 16e: goto 175
      // 171: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 174: athrow
      // 175: ifeq 193
      // 178: goto 17f
      // 17b: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17e: athrow
      // 17f: aload 0
      // 180: getfield p_k.bol Lc05;
      // 183: getfield Minecraft.nff Lroz;
      // 186: getstatic y8d.j5f Ll7l;
      // 189: invokevirtual roz.vax (Ll7l;)V
      // 18c: goto 193
      // 18f: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 192: athrow
      // 193: aload 0
      // 194: bipush 1
      // 195: putfield p_k.jqy Z
      // 198: aload 0
      // 199: getfield p_k.bol Lc05;
      // 19c: getfield Minecraft.u0y Lgbe;
      // 19f: iload 2
      // 1a0: ifne 1be
      // 1a3: instanceof yxa
      // 1a6: goto 1ad
      // 1a9: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ac: athrow
      // 1ad: ifeq 1c6
      // 1b0: aload 0
      // 1b1: getfield p_k.bol Lc05;
      // 1b4: getfield Minecraft.u0y Lgbe;
      // 1b7: goto 1be
      // 1ba: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1bd: athrow
      // 1be: checkcast yxa
      // 1c1: invokeinterface yxa.fyj ()V 1
      // 1c6: return
   }

   @Override
   public void ntc(S1DPacketEntityEffect var1) {
      et9.hqd(var1, this, this.bol);
      EntityLivingBase var2 = this.y40.oks(var1._6l());
      if (var2 instanceof Entity) {
         sdj var3 = new sdj(var1.tmj(), var1.bh9(), var1.zex(), false, var1.fww());
         var3.wmv(var1.vh4());
         ((Entity)var2).gmn(var3);
      }
   }

   @Override
   public void wno(S42PacketCombatEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: aload 0
      // 02: aload 0
      // 03: getfield p_k.bol Lc05;
      // 06: invokestatic et9.hqd (Lmz2;Lyw3;Llg9;)V
      // 09: invokestatic OpaquePredicate.b ()I
      // 0c: aload 0
      // 0d: getfield p_k.y40 Lkh3;
      // 10: aload 1
      // 11: getfield net/minecraft/network/play/server/S42PacketCombatEvent.e92 I
      // 14: invokevirtual WorldClient.oks (I)Li2h;
      // 17: astore 3
      // 18: istore 2
      // 19: aload 3
      // 1a: iload 2
      // 1b: ifeq 33
      // 1e: instanceof Entity
      // 21: ifeq 39
      // 24: goto 2b
      // 27: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: aload 3
      // 2c: goto 33
      // 2f: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32: athrow
      // 33: checkcast Entity
      // 36: goto 3a
      // 39: aconst_null
      // 3a: astore 4
      // 3c: aload 1
      // 3d: getfield net/minecraft/network/play/server/S42PacketCombatEvent.qt6 Lnet/minecraft/network/play/server/S42PacketCombatEvent$cwk;
      // 40: getstatic net/minecraft/network/play/server/S42PacketCombatEvent$cwk.ks3 Lnet/minecraft/network/play/server/S42PacketCombatEvent$cwk;
      // 43: iload 2
      // 44: ifeq 96
      // 47: if_acmpne 88
      // 4a: goto 51
      // 4d: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 50: athrow
      // 51: sipush 1000
      // 54: aload 1
      // 55: getfield net/minecraft/network/play/server/S42PacketCombatEvent.k6d I
      // 58: imul
      // 59: bipush 20
      // 5b: idiv
      // 5c: i2l
      // 5d: lstore 5
      // 5f: new p_7
      // 62: dup
      // 63: aload 0
      // 64: getfield p_k.bol Lc05;
      // 67: getfield Minecraft.vg8 Ll86;
      // 6a: aload 4
      // 6c: invokespecial p_7.<init> (Lg_3;Lg_3;)V
      // 6f: astore 7
      // 71: aload 0
      // 72: getfield p_k.bol Lc05;
      // 75: invokevirtual Minecraft.vnk ()Ltyh;
      // 78: aload 7
      // 7a: lconst_0
      // 7b: lload 5
      // 7d: lsub
      // 7e: lconst_0
      // 7f: invokeinterface tyh.kpr (Lnoz;JJ)V 6
      // 84: iload 2
      // 85: ifne d6
      // 88: aload 1
      // 89: getfield net/minecraft/network/play/server/S42PacketCombatEvent.qt6 Lnet/minecraft/network/play/server/S42PacketCombatEvent$cwk;
      // 8c: getstatic net/minecraft/network/play/server/S42PacketCombatEvent$cwk.mx5 Lnet/minecraft/network/play/server/S42PacketCombatEvent$cwk;
      // 8f: goto 96
      // 92: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 95: athrow
      // 96: if_acmpne d6
      // 99: aload 0
      // 9a: getfield p_k.y40 Lkh3;
      // 9d: aload 1
      // 9e: getfield net/minecraft/network/play/server/S42PacketCombatEvent.gzf I
      // a1: invokevirtual WorldClient.oks (I)Li2h;
      // a4: astore 5
      // a6: aload 5
      // a8: instanceof ha9
      // ab: ifeq d6
      // ae: new vdp
      // b1: dup
      // b2: aload 5
      // b4: checkcast ha9
      // b7: aload 4
      // b9: invokespecial vdp.<init> (Lg_3;Lg_3;)V
      // bc: astore 6
      // be: aload 6
      // c0: aload 1
      // c1: getfield net/minecraft/network/play/server/S42PacketCombatEvent.iri Ljava/lang/String;
      // c4: invokevirtual vdp.p7i (Ljava/lang/String;)V
      // c7: aload 0
      // c8: getfield p_k.bol Lc05;
      // cb: invokevirtual Minecraft.vnk ()Ltyh;
      // ce: aload 6
      // d0: lconst_0
      // d1: invokeinterface tyh.gfs (Lnoz;J)V 4
      // d6: return
   }

   @Override
   public void yux(S41PacketServerDifficulty var1) {
      et9.hqd(var1, this, this.bol);
      this.bol.tij.r7d().jbe(var1.k86());
      this.bol.tij.r7d().mik(var1.q83());
   }

   @Override
   public void qqb(S43PacketCamera var1) {
      et9.hqd(var1, this, this.bol);
      EntityLivingBase var2 = var1.bcy(this.y40);

      try {
         if (var2 != null) {
            this.bol.gri(var2);
         }
      } catch (IllegalStateException var3) {
         throw a(var3);
      }
   }

   @Override
   public void o8p(S44PacketWorldBorder var1) {
      et9.hqd(var1, this, this.bol);
      var1.nfv(this.y40.fve());
   }

   @Override
   public void bob(S45PacketTitle param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: aload 0
      // 02: aload 0
      // 03: getfield p_k.bol Lc05;
      // 06: invokestatic et9.hqd (Lmz2;Lyw3;Llg9;)V
      // 09: invokestatic OpaquePredicate.b ()I
      // 0c: aload 1
      // 0d: invokevirtual net/minecraft/network/play/server/S45PacketTitle.j8z ()Lnet/minecraft/network/play/server/S45PacketTitle$_f9;
      // 10: astore 3
      // 11: aconst_null
      // 12: astore 4
      // 14: aconst_null
      // 15: astore 5
      // 17: istore 2
      // 18: aload 1
      // 19: invokevirtual net/minecraft/network/play/server/S45PacketTitle.uwr ()Lekw;
      // 1c: iload 2
      // 1d: ifeq 35
      // 20: ifnull 3d
      // 23: goto 2a
      // 26: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29: athrow
      // 2a: aload 1
      // 2b: invokevirtual net/minecraft/network/play/server/S45PacketTitle.uwr ()Lekw;
      // 2e: goto 35
      // 31: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 34: athrow
      // 35: invokeinterface ekw._2o ()Ljava/lang/String; 1
      // 3a: goto 40
      // 3d: ldc ""
      // 3f: nop
      // 40: astore 6
      // 42: getstatic p_k$4.ja0 [I
      // 45: aload 3
      // 46: invokevirtual net/minecraft/network/play/server/S45PacketTitle$_f9.ordinal ()I
      // 49: iaload
      // 4a: tableswitch 70 1 3 26 33 40
      // 64: aload 6
      // 66: astore 4
      // 68: goto 90
      // 6b: aload 6
      // 6d: astore 5
      // 6f: goto 90
      // 72: aload 0
      // 73: getfield p_k.bol Lc05;
      // 76: getfield Minecraft.t43 Ld1f;
      // 79: ldc ""
      // 7b: nop
      // 7c: ldc ""
      // 7e: nop
      // 7f: bipush -1
      // 80: bipush -1
      // 81: bipush -1
      // 82: invokevirtual d1f.ovp (Ljava/lang/String;Ljava/lang/String;III)V
      // 85: aload 0
      // 86: getfield p_k.bol Lc05;
      // 89: getfield Minecraft.t43 Ld1f;
      // 8c: invokevirtual d1f.xbm ()V
      // 8f: return
      // 90: aload 0
      // 91: getfield p_k.bol Lc05;
      // 94: getfield Minecraft.t43 Ld1f;
      // 97: aload 4
      // 99: aload 5
      // 9b: aload 1
      // 9c: invokevirtual net/minecraft/network/play/server/S45PacketTitle.owk ()I
      // 9f: aload 1
      // a0: invokevirtual net/minecraft/network/play/server/S45PacketTitle.y8o ()I
      // a3: aload 1
      // a4: invokevirtual net/minecraft/network/play/server/S45PacketTitle.t6u ()I
      // a7: invokevirtual d1f.ovp (Ljava/lang/String;Ljava/lang/String;III)V
      // aa: return
   }

   @Override
   public void h3r(S46PacketSetCompressionLevel param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield p_k._us Lhv0;
      // 08: iload 2
      // 09: ifeq 24
      // 0c: invokevirtual hv0.mwg ()Z
      // 0f: ifne 2b
      // 12: goto 19
      // 15: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield p_k._us Lhv0;
      // 1d: goto 24
      // 20: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23: athrow
      // 24: aload 1
      // 25: invokevirtual net/minecraft/network/play/server/S46PacketSetCompressionLevel.zub ()I
      // 28: invokevirtual hv0.ya5 (I)V
      // 2b: return
   }

   @Override
   public void kln(S47PacketPlayerListHeaderFooter param1) {
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
      // 05: getfield p_k.bol Lc05;
      // 08: getfield Minecraft.t43 Ld1f;
      // 0b: invokevirtual d1f.l0z ()Lvg2;
      // 0e: aload 1
      // 0f: iload 2
      // 10: ifne 31
      // 13: invokevirtual net/minecraft/network/play/server/S47PacketPlayerListHeaderFooter.kjr ()Lekw;
      // 16: invokeinterface ekw._2o ()Ljava/lang/String; 1
      // 1b: invokevirtual java/lang/String.length ()I
      // 1e: ifne 30
      // 21: goto 28
      // 24: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27: athrow
      // 28: aconst_null
      // 29: goto 34
      // 2c: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f: athrow
      // 30: aload 1
      // 31: invokevirtual net/minecraft/network/play/server/S47PacketPlayerListHeaderFooter.kjr ()Lekw;
      // 34: invokevirtual vg2.b8o (Lekw;)V
      // 37: aload 0
      // 38: getfield p_k.bol Lc05;
      // 3b: getfield Minecraft.t43 Ld1f;
      // 3e: invokevirtual d1f.l0z ()Lvg2;
      // 41: aload 1
      // 42: iload 2
      // 43: ifne 64
      // 46: invokevirtual net/minecraft/network/play/server/S47PacketPlayerListHeaderFooter.xch ()Lekw;
      // 49: invokeinterface ekw._2o ()Ljava/lang/String; 1
      // 4e: invokevirtual java/lang/String.length ()I
      // 51: ifne 63
      // 54: goto 5b
      // 57: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5a: athrow
      // 5b: aconst_null
      // 5c: goto 67
      // 5f: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 1
      // 64: invokevirtual net/minecraft/network/play/server/S47PacketPlayerListHeaderFooter.xch ()Lekw;
      // 67: invokevirtual vg2.sid (Lekw;)V
      // 6a: return
   }

   @Override
   public void qfr(S1EPacketRemoveEntityEffect param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: aload 0
      // 02: aload 0
      // 03: getfield p_k.bol Lc05;
      // 06: invokestatic et9.hqd (Lmz2;Lyw3;Llg9;)V
      // 09: invokestatic OpaquePredicate.b ()I
      // 0c: aload 0
      // 0d: getfield p_k.y40 Lkh3;
      // 10: aload 1
      // 11: invokevirtual net/minecraft/network/play/server/S1EPacketRemoveEntityEffect.pj2 ()I
      // 14: invokevirtual WorldClient.oks (I)Li2h;
      // 17: astore 3
      // 18: istore 2
      // 19: aload 3
      // 1a: iload 2
      // 1b: ifeq 33
      // 1e: instanceof Entity
      // 21: ifeq 3d
      // 24: goto 2b
      // 27: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: aload 3
      // 2c: goto 33
      // 2f: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32: athrow
      // 33: checkcast Entity
      // 36: aload 1
      // 37: invokevirtual net/minecraft/network/play/server/S1EPacketRemoveEntityEffect.rs0 ()I
      // 3a: invokevirtual Entity.zrt (I)V
      // 3d: return
   }

   @Override
   public void oon(S38PacketPlayerListItem param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: aload 0
      // 002: aload 0
      // 003: getfield p_k.bol Lc05;
      // 006: invokestatic et9.hqd (Lmz2;Lyw3;Llg9;)V
      // 009: invokestatic OpaquePredicate.b ()I
      // 00c: aload 1
      // 00d: invokevirtual net/minecraft/network/play/server/S38PacketPlayerListItem.hyk ()Ljava/util/List;
      // 010: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 015: astore 3
      // 016: istore 2
      // 017: aload 3
      // 018: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 01d: ifeq 13e
      // 020: aload 3
      // 021: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 026: checkcast net/minecraft/network/play/server/S38PacketPlayerListItem$b1f
      // 029: astore 4
      // 02b: aload 1
      // 02c: invokevirtual net/minecraft/network/play/server/S38PacketPlayerListItem._7a ()Lnet/minecraft/network/play/server/S38PacketPlayerListItem$a1f;
      // 02f: iload 2
      // 030: ifeq 075
      // 033: getstatic net/minecraft/network/play/server/S38PacketPlayerListItem$a1f.vl6 Lnet/minecraft/network/play/server/S38PacketPlayerListItem$a1f;
      // 036: if_acmpne 05d
      // 039: goto 040
      // 03c: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03f: athrow
      // 040: aload 0
      // 041: getfield p_k.z5d Ljava/util/Map;
      // 044: aload 4
      // 046: invokevirtual net/minecraft/network/play/server/S38PacketPlayerListItem$b1f.duk ()Lcom/mojang/authlib/GameProfile;
      // 049: invokevirtual com/mojang/authlib/GameProfile.getId ()Ljava/util/UUID;
      // 04c: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 051: pop
      // 052: iload 2
      // 053: ifne 13a
      // 056: goto 05d
      // 059: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05c: athrow
      // 05d: aload 0
      // 05e: getfield p_k.z5d Ljava/util/Map;
      // 061: aload 4
      // 063: invokevirtual net/minecraft/network/play/server/S38PacketPlayerListItem$b1f.duk ()Lcom/mojang/authlib/GameProfile;
      // 066: invokevirtual com/mojang/authlib/GameProfile.getId ()Ljava/util/UUID;
      // 069: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 06e: goto 075
      // 071: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 074: athrow
      // 075: checkcast hv2
      // 078: astore 5
      // 07a: aload 1
      // 07b: invokevirtual net/minecraft/network/play/server/S38PacketPlayerListItem._7a ()Lnet/minecraft/network/play/server/S38PacketPlayerListItem$a1f;
      // 07e: iload 2
      // 07f: ifeq 0ad
      // 082: getstatic net/minecraft/network/play/server/S38PacketPlayerListItem$a1f.om8 Lnet/minecraft/network/play/server/S38PacketPlayerListItem$a1f;
      // 085: if_acmpne 0ae
      // 088: goto 08f
      // 08b: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08e: athrow
      // 08f: new hv2
      // 092: dup
      // 093: aload 4
      // 095: invokespecial hv2.<init> (Lnet/minecraft/network/play/server/S38PacketPlayerListItem$b1f;)V
      // 098: astore 5
      // 09a: aload 0
      // 09b: getfield p_k.z5d Ljava/util/Map;
      // 09e: aload 5
      // 0a0: invokevirtual hv2.pbs ()Lcom/mojang/authlib/GameProfile;
      // 0a3: invokevirtual com/mojang/authlib/GameProfile.getId ()Ljava/util/UUID;
      // 0a6: aload 5
      // 0a8: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0ad: pop
      // 0ae: aload 5
      // 0b0: ifnull 13a
      // 0b3: getstatic p_k$4.rd_ [I
      // 0b6: aload 1
      // 0b7: invokevirtual net/minecraft/network/play/server/S38PacketPlayerListItem._7a ()Lnet/minecraft/network/play/server/S38PacketPlayerListItem$a1f;
      // 0ba: invokevirtual net/minecraft/network/play/server/S38PacketPlayerListItem$a1f.ordinal ()I
      // 0bd: iaload
      // 0be: tableswitch 124 1 4 34 65 86 107
      // 0dc: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0df: athrow
      // 0e0: aload 5
      // 0e2: aload 4
      // 0e4: invokevirtual net/minecraft/network/play/server/S38PacketPlayerListItem$b1f.izc ()Lh50$f05;
      // 0e7: invokevirtual hv2.ivv (Lh50$f05;)V
      // 0ea: aload 5
      // 0ec: aload 4
      // 0ee: invokevirtual net/minecraft/network/play/server/S38PacketPlayerListItem$b1f.pst ()I
      // 0f1: invokevirtual hv2.n_6 (I)V
      // 0f4: iload 2
      // 0f5: ifne 13a
      // 0f8: goto 0ff
      // 0fb: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fe: athrow
      // 0ff: aload 5
      // 101: aload 4
      // 103: invokevirtual net/minecraft/network/play/server/S38PacketPlayerListItem$b1f.izc ()Lh50$f05;
      // 106: invokevirtual hv2.ivv (Lh50$f05;)V
      // 109: iload 2
      // 10a: ifne 13a
      // 10d: goto 114
      // 110: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 113: athrow
      // 114: aload 5
      // 116: aload 4
      // 118: invokevirtual net/minecraft/network/play/server/S38PacketPlayerListItem$b1f.pst ()I
      // 11b: invokevirtual hv2.n_6 (I)V
      // 11e: iload 2
      // 11f: ifne 13a
      // 122: goto 129
      // 125: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 128: athrow
      // 129: aload 5
      // 12b: aload 4
      // 12d: invokevirtual net/minecraft/network/play/server/S38PacketPlayerListItem$b1f.bek ()Lekw;
      // 130: invokevirtual hv2.d5f (Lekw;)V
      // 133: goto 13a
      // 136: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 139: athrow
      // 13a: iload 2
      // 13b: ifne 017
      // 13e: return
   }

   @Override
   public void xcg(S00PacketKeepAlive var1) {
      this.sxi(new C00PacketKeepAlive(var1._g8()));
   }

   @Override
   public void j_n(S39PacketPlayerAbilities var1) {
      et9.hqd(var1, this, this.bol);
      EntityPlayerSP var2 = this.bol.vg8;
      var2.lls.wzx = var1.lbk();
      var2.lls.g40 = var1.cbr();
      var2.lls.lez = var1.pps();
      var2.lls.wvp = var1.ujl();
      var2.lls.e7s(var1.d0w());
      var2.lls.ftd(var1.sxo());
   }

   @Override
   public void wsc(S3APacketTabComplete param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: aload 0
      // 02: aload 0
      // 03: getfield p_k.bol Lc05;
      // 06: invokestatic et9.hqd (Lmz2;Lyw3;Llg9;)V
      // 09: invokestatic OpaquePredicate.c ()I
      // 0c: aload 1
      // 0d: invokevirtual net/minecraft/network/play/server/S3APacketTabComplete.ul9 ()[Ljava/lang/String;
      // 10: astore 3
      // 11: istore 2
      // 12: aload 0
      // 13: getfield p_k.bol Lc05;
      // 16: getfield Minecraft.u0y Lgbe;
      // 19: iload 2
      // 1a: ifne 38
      // 1d: instanceof _ov
      // 20: ifeq 43
      // 23: goto 2a
      // 26: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29: athrow
      // 2a: aload 0
      // 2b: getfield p_k.bol Lc05;
      // 2e: getfield Minecraft.u0y Lgbe;
      // 31: goto 38
      // 34: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37: athrow
      // 38: checkcast _ov
      // 3b: astore 4
      // 3d: aload 4
      // 3f: aload 3
      // 40: invokevirtual _ov.cpv ([Ljava/lang/String;)V
      // 43: return
   }

   @Override
   public void ouw(S29PacketSoundEffect var1) {
      et9.hqd(var1, this, this.bol);
      this.bol.tij.wd_(var1.jxh(), var1.gd3(), var1.gjx(), var1.lio(), var1.grx(), var1.nrl(), false);
   }

   @Override
   public void ei2(S48PacketResourcePackSend param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic p_k.a J
      // 003: ldc2_w 126093411140305
      // 006: lxor
      // 007: lstore 2
      // 008: aload 1
      // 009: invokevirtual net/minecraft/network/play/server/S48PacketResourcePackSend.ota ()Ljava/lang/String;
      // 00c: astore 5
      // 00e: invokestatic OpaquePredicate.c ()I
      // 011: aload 1
      // 012: invokevirtual net/minecraft/network/play/server/S48PacketResourcePackSend.noh ()Ljava/lang/String;
      // 015: astore 6
      // 017: istore 4
      // 019: aload 5
      // 01b: sipush 25856
      // 01e: ldc2_w 1922234945637595650
      // 021: lload 2
      // 022: lxor
      // 023: invokedynamic h (IJ)Ljava/lang/String; bsm=p_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 028: nop
      // 029: iload 4
      // 02b: ifne 052
      // 02e: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 031: ifeq 0f0
      // 034: goto 03b
      // 037: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03a: athrow
      // 03b: aload 5
      // 03d: sipush 27142
      // 040: ldc2_w 2357370042335048982
      // 043: lload 2
      // 044: lxor
      // 045: invokedynamic h (IJ)Ljava/lang/String; bsm=p_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04a: nop
      // 04b: goto 052
      // 04e: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 051: athrow
      // 052: invokevirtual java/lang/String.length ()I
      // 055: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 058: astore 7
      // 05a: new java/io/File
      // 05d: dup
      // 05e: aload 0
      // 05f: getfield p_k.bol Lc05;
      // 062: getfield Minecraft.glh Ljava/io/File;
      // 065: sipush 1299
      // 068: ldc2_w 860401584909113864
      // 06b: lload 2
      // 06c: lxor
      // 06d: invokedynamic h (IJ)Ljava/lang/String; bsm=p_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 072: nop
      // 073: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 076: astore 8
      // 078: new java/io/File
      // 07b: dup
      // 07c: aload 8
      // 07e: aload 7
      // 080: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 083: astore 9
      // 085: iload 4
      // 087: ifne 0cc
      // 08a: aload 9
      // 08c: invokevirtual java/io/File.isFile ()Z
      // 08f: ifeq 0d1
      // 092: goto 099
      // 095: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 098: athrow
      // 099: aload 0
      // 09a: getfield p_k._us Lhv0;
      // 09d: new net/minecraft/network/play/client/C19PacketResourcePackStatus
      // 0a0: dup
      // 0a1: aload 6
      // 0a3: getstatic net/minecraft/network/play/client/C19PacketResourcePackStatus$lun.off Lnet/minecraft/network/play/client/C19PacketResourcePackStatus$lun;
      // 0a6: invokespecial net/minecraft/network/play/client/C19PacketResourcePackStatus.<init> (Ljava/lang/String;Lnet/minecraft/network/play/client/C19PacketResourcePackStatus$lun;)V
      // 0a9: invokevirtual hv0.k7f (Lmz2;)V
      // 0ac: aload 0
      // 0ad: getfield p_k.bol Lc05;
      // 0b0: invokevirtual Minecraft.h3p ()Lw69;
      // 0b3: aload 9
      // 0b5: invokevirtual w69.rsf (Ljava/io/File;)Lcom/google/common/util/concurrent/ListenableFuture;
      // 0b8: new p_k$1
      // 0bb: dup
      // 0bc: aload 0
      // 0bd: aload 6
      // 0bf: invokespecial p_k$1.<init> (Lp_k;Ljava/lang/String;)V
      // 0c2: invokestatic com/google/common/util/concurrent/Futures.addCallback (Lcom/google/common/util/concurrent/ListenableFuture;Lcom/google/common/util/concurrent/FutureCallback;)V
      // 0c5: goto 0cc
      // 0c8: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0cb: athrow
      // 0cc: iload 4
      // 0ce: ifeq 0eb
      // 0d1: aload 0
      // 0d2: getfield p_k._us Lhv0;
      // 0d5: new net/minecraft/network/play/client/C19PacketResourcePackStatus
      // 0d8: dup
      // 0d9: aload 6
      // 0db: getstatic net/minecraft/network/play/client/C19PacketResourcePackStatus$lun.htm Lnet/minecraft/network/play/client/C19PacketResourcePackStatus$lun;
      // 0de: invokespecial net/minecraft/network/play/client/C19PacketResourcePackStatus.<init> (Ljava/lang/String;Lnet/minecraft/network/play/client/C19PacketResourcePackStatus$lun;)V
      // 0e1: invokevirtual hv0.k7f (Lmz2;)V
      // 0e4: goto 0eb
      // 0e7: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ea: athrow
      // 0eb: iload 4
      // 0ed: ifeq 1e4
      // 0f0: aload 0
      // 0f1: getfield p_k.bol Lc05;
      // 0f4: invokevirtual Minecraft.fcm ()Lr1l;
      // 0f7: iload 4
      // 0f9: ifne 184
      // 0fc: goto 103
      // 0ff: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 102: athrow
      // 103: ifnull 16a
      // 106: goto 10d
      // 109: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10c: athrow
      // 10d: aload 0
      // 10e: getfield p_k.bol Lc05;
      // 111: invokevirtual Minecraft.fcm ()Lr1l;
      // 114: iload 4
      // 116: ifne 184
      // 119: goto 120
      // 11c: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11f: athrow
      // 120: invokevirtual r1l.u9n ()Lr1l$pyk;
      // 123: getstatic r1l$pyk.mw_ Lr1l$pyk;
      // 126: if_acmpne 16a
      // 129: goto 130
      // 12c: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12f: athrow
      // 130: aload 0
      // 131: getfield p_k._us Lhv0;
      // 134: new net/minecraft/network/play/client/C19PacketResourcePackStatus
      // 137: dup
      // 138: aload 6
      // 13a: getstatic net/minecraft/network/play/client/C19PacketResourcePackStatus$lun.off Lnet/minecraft/network/play/client/C19PacketResourcePackStatus$lun;
      // 13d: invokespecial net/minecraft/network/play/client/C19PacketResourcePackStatus.<init> (Ljava/lang/String;Lnet/minecraft/network/play/client/C19PacketResourcePackStatus$lun;)V
      // 140: invokevirtual hv0.k7f (Lmz2;)V
      // 143: aload 0
      // 144: getfield p_k.bol Lc05;
      // 147: invokevirtual Minecraft.h3p ()Lw69;
      // 14a: aload 5
      // 14c: aload 6
      // 14e: invokevirtual w69.rao (Ljava/lang/String;Ljava/lang/String;)Lcom/google/common/util/concurrent/ListenableFuture;
      // 151: new p_k$2
      // 154: dup
      // 155: aload 0
      // 156: aload 6
      // 158: invokespecial p_k$2.<init> (Lp_k;Ljava/lang/String;)V
      // 15b: invokestatic com/google/common/util/concurrent/Futures.addCallback (Lcom/google/common/util/concurrent/ListenableFuture;Lcom/google/common/util/concurrent/FutureCallback;)V
      // 15e: iload 4
      // 160: ifeq 1e4
      // 163: goto 16a
      // 166: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 169: athrow
      // 16a: aload 0
      // 16b: getfield p_k.bol Lc05;
      // 16e: iload 4
      // 170: ifne 1d4
      // 173: goto 17a
      // 176: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 179: athrow
      // 17a: invokevirtual Minecraft.fcm ()Lr1l;
      // 17d: goto 184
      // 180: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 183: athrow
      // 184: ifnull 1c9
      // 187: aload 0
      // 188: getfield p_k.bol Lc05;
      // 18b: iload 4
      // 18d: ifne 1d4
      // 190: goto 197
      // 193: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 196: athrow
      // 197: invokevirtual Minecraft.fcm ()Lr1l;
      // 19a: invokevirtual r1l.u9n ()Lr1l$pyk;
      // 19d: getstatic r1l$pyk.h8i Lr1l$pyk;
      // 1a0: if_acmpeq 1c9
      // 1a3: goto 1aa
      // 1a6: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a9: athrow
      // 1aa: aload 0
      // 1ab: getfield p_k._us Lhv0;
      // 1ae: new net/minecraft/network/play/client/C19PacketResourcePackStatus
      // 1b1: dup
      // 1b2: aload 6
      // 1b4: getstatic net/minecraft/network/play/client/C19PacketResourcePackStatus$lun.r0c Lnet/minecraft/network/play/client/C19PacketResourcePackStatus$lun;
      // 1b7: invokespecial net/minecraft/network/play/client/C19PacketResourcePackStatus.<init> (Ljava/lang/String;Lnet/minecraft/network/play/client/C19PacketResourcePackStatus$lun;)V
      // 1ba: invokevirtual hv0.k7f (Lmz2;)V
      // 1bd: iload 4
      // 1bf: ifeq 1e4
      // 1c2: goto 1c9
      // 1c5: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c8: athrow
      // 1c9: aload 0
      // 1ca: getfield p_k.bol Lc05;
      // 1cd: goto 1d4
      // 1d0: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d3: athrow
      // 1d4: new p_k$3
      // 1d7: dup
      // 1d8: aload 0
      // 1d9: aload 6
      // 1db: aload 5
      // 1dd: invokespecial p_k$3.<init> (Lp_k;Ljava/lang/String;Ljava/lang/String;)V
      // 1e0: invokevirtual Minecraft.acd (Ljava/lang/Runnable;)Lcom/google/common/util/concurrent/ListenableFuture;
      // 1e3: pop
      // 1e4: return
   }

   @Override
   public void wlg(S49PacketUpdateEntityNBT var1) {
      et9.hqd(var1, this, this.bol);
      int var10000 = OpaquePredicate.b();
      EntityLivingBase var3 = var1.eor(this.y40);
      int var2 = var10000;

      label20: {
         try {
            var5 = var3;
            if (var2 == 0) {
               break label20;
            }

            if (var3 == null) {
               return;
            }
         } catch (IllegalStateException var4) {
            throw a(var4);
         }

         var5 = var3;
      }

      var5.yhf(var1.k1k());
   }

   @Override
   public void skf(S3FPacketCustomPayload param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic p_k.a J
      // 003: ldc2_w 54000112505541
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 4
      // 00d: aload 1
      // 00e: aload 0
      // 00f: aload 0
      // 010: getfield p_k.bol Lc05;
      // 013: invokestatic et9.hqd (Lmz2;Lyw3;Llg9;)V
      // 016: sipush 5940
      // 019: ldc2_w 3348603801567500321
      // 01c: lload 2
      // 01d: lxor
      // 01e: invokedynamic h (IJ)Ljava/lang/String; bsm=p_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 023: nop
      // 024: aload 1
      // 025: invokevirtual net/minecraft/network/play/server/S3FPacketCustomPayload.wn5 ()Ljava/lang/String;
      // 028: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 02b: iload 4
      // 02d: ifne 113
      // 030: ifeq 0f7
      // 033: goto 03a
      // 036: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 039: athrow
      // 03a: aload 1
      // 03b: invokevirtual net/minecraft/network/play/server/S3FPacketCustomPayload.n_k ()Lnfj;
      // 03e: astore 5
      // 040: aload 5
      // 042: invokevirtual nfj.readInt ()I
      // 045: istore 6
      // 047: aload 0
      // 048: getfield p_k.bol Lc05;
      // 04b: getfield Minecraft.u0y Lgbe;
      // 04e: astore 7
      // 050: iload 4
      // 052: ifne 0c1
      // 055: aload 7
      // 057: ifnull 0bb
      // 05a: goto 061
      // 05d: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 060: athrow
      // 061: aload 7
      // 063: instanceof qyg
      // 066: iload 4
      // 068: ifne 0c0
      // 06b: goto 072
      // 06e: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 071: athrow
      // 072: ifeq 0bb
      // 075: goto 07c
      // 078: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07b: athrow
      // 07c: iload 6
      // 07e: iload 4
      // 080: ifne 0c0
      // 083: goto 08a
      // 086: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 089: athrow
      // 08a: aload 0
      // 08b: getfield p_k.bol Lc05;
      // 08e: getfield Minecraft.vg8 Ll86;
      // 091: getfield EntityPlayerSP.daw L_jc;
      // 094: getfield _jc.h7l I
      // 097: if_icmpne 0bb
      // 09a: goto 0a1
      // 09d: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a0: athrow
      // 0a1: aload 7
      // 0a3: checkcast qyg
      // 0a6: invokevirtual qyg.tju ()La7q;
      // 0a9: astore 8
      // 0ab: aload 5
      // 0ad: invokestatic skn.nw5 (Lnfj;)Lskn;
      // 0b0: astore 9
      // 0b2: aload 8
      // 0b4: aload 9
      // 0b6: invokeinterface a7q.sw4 (Lskn;)V 2
      // 0bb: aload 5
      // 0bd: invokevirtual nfj.release ()Z
      // 0c0: pop
      // 0c1: goto 0f2
      // 0c4: astore 6
      // 0c6: getstatic p_k.xfk Lorg/apache/logging/log4j/Logger;
      // 0c9: sipush 11991
      // 0cc: ldc2_w 6641211185574486468
      // 0cf: lload 2
      // 0d0: lxor
      // 0d1: invokedynamic h (IJ)Ljava/lang/String; bsm=p_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d6: nop
      // 0d7: aload 6
      // 0d9: invokeinterface org/apache/logging/log4j/Logger.error (Ljava/lang/String;Ljava/lang/Throwable;)V 3
      // 0de: aload 5
      // 0e0: invokevirtual nfj.release ()Z
      // 0e3: pop
      // 0e4: goto 0f2
      // 0e7: astore 10
      // 0e9: aload 5
      // 0eb: invokevirtual nfj.release ()Z
      // 0ee: pop
      // 0ef: aload 10
      // 0f1: athrow
      // 0f2: iload 4
      // 0f4: ifeq 1a8
      // 0f7: sipush 29523
      // 0fa: ldc2_w 4689296432817142857
      // 0fd: lload 2
      // 0fe: lxor
      // 0ff: invokedynamic h (IJ)Ljava/lang/String; bsm=p_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 104: nop
      // 105: aload 1
      // 106: invokevirtual net/minecraft/network/play/server/S3FPacketCustomPayload.wn5 ()Ljava/lang/String;
      // 109: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 10c: goto 113
      // 10f: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 112: athrow
      // 113: iload 4
      // 115: ifne 15e
      // 118: ifeq 142
      // 11b: goto 122
      // 11e: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 121: athrow
      // 122: aload 0
      // 123: getfield p_k.bol Lc05;
      // 126: getfield Minecraft.vg8 Ll86;
      // 129: aload 1
      // 12a: invokevirtual net/minecraft/network/play/server/S3FPacketCustomPayload.n_k ()Lnfj;
      // 12d: sipush 32767
      // 130: invokevirtual nfj.oa5 (I)Ljava/lang/String;
      // 133: invokevirtual EntityPlayerSP.r0f (Ljava/lang/String;)V
      // 136: iload 4
      // 138: ifeq 1a8
      // 13b: goto 142
      // 13e: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 141: athrow
      // 142: sipush 11788
      // 145: ldc2_w 7565706123953185053
      // 148: lload 2
      // 149: lxor
      // 14a: invokedynamic h (IJ)Ljava/lang/String; bsm=p_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14f: nop
      // 150: aload 1
      // 151: invokevirtual net/minecraft/network/play/server/S3FPacketCustomPayload.wn5 ()Ljava/lang/String;
      // 154: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 157: goto 15e
      // 15a: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15d: athrow
      // 15e: ifeq 1a8
      // 161: aload 0
      // 162: getfield p_k.bol Lc05;
      // 165: getfield Minecraft.vg8 Ll86;
      // 168: invokevirtual EntityPlayerSP.b5z ()Lerg;
      // 16b: astore 5
      // 16d: aload 5
      // 16f: iload 4
      // 171: ifne 180
      // 174: ifnull 1a8
      // 177: goto 17e
      // 17a: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17d: athrow
      // 17e: aload 5
      // 180: invokevirtual erg.gn1 ()Lu7m;
      // 183: getstatic xbr._h5 Lu7m;
      // 186: if_acmpne 1a8
      // 189: aload 0
      // 18a: getfield p_k.bol Lc05;
      // 18d: new y3n
      // 190: dup
      // 191: aload 0
      // 192: getfield p_k.bol Lc05;
      // 195: getfield Minecraft.vg8 Ll86;
      // 198: aload 5
      // 19a: bipush 0
      // 19b: invokespecial y3n.<init> (Lha9;Lerg;Z)V
      // 19e: invokevirtual Minecraft.z2i (Lgbe;)V
      // 1a1: goto 1a8
      // 1a4: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a7: athrow
      // 1a8: return
   }

   @Override
   public void ett(S3BPacketScoreboardObjective param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: aload 0
      // 02: aload 0
      // 03: getfield p_k.bol Lc05;
      // 06: invokestatic et9.hqd (Lmz2;Lyw3;Llg9;)V
      // 09: invokestatic OpaquePredicate.b ()I
      // 0c: aload 0
      // 0d: getfield p_k.y40 Lkh3;
      // 10: invokevirtual WorldClient.fgp ()Luci;
      // 13: astore 3
      // 14: istore 2
      // 15: aload 1
      // 16: invokevirtual net/minecraft/network/play/server/S3BPacketScoreboardObjective.sl2 ()I
      // 19: ifne 3f
      // 1c: aload 3
      // 1d: aload 1
      // 1e: invokevirtual net/minecraft/network/play/server/S3BPacketScoreboardObjective.ylr ()Ljava/lang/String;
      // 21: getstatic z0w.euo Lz0w;
      // 24: invokevirtual uci.oda (Ljava/lang/String;Lz0w;)Lsa6;
      // 27: astore 4
      // 29: aload 4
      // 2b: aload 1
      // 2c: invokevirtual net/minecraft/network/play/server/S3BPacketScoreboardObjective.m93 ()Ljava/lang/String;
      // 2f: invokevirtual sa6.mf7 (Ljava/lang/String;)V
      // 32: aload 4
      // 34: aload 1
      // 35: invokevirtual net/minecraft/network/play/server/S3BPacketScoreboardObjective.xfv ()Lz0w$enz;
      // 38: invokevirtual sa6.oaj (Lz0w$enz;)V
      // 3b: iload 2
      // 3c: ifne 95
      // 3f: aload 3
      // 40: aload 1
      // 41: invokevirtual net/minecraft/network/play/server/S3BPacketScoreboardObjective.ylr ()Ljava/lang/String;
      // 44: invokevirtual uci.vp8 (Ljava/lang/String;)Lsa6;
      // 47: astore 4
      // 49: aload 1
      // 4a: invokevirtual net/minecraft/network/play/server/S3BPacketScoreboardObjective.sl2 ()I
      // 4d: bipush 1
      // 4e: iload 2
      // 4f: ifeq 79
      // 52: if_icmpne 6d
      // 55: goto 5c
      // 58: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5b: athrow
      // 5c: aload 3
      // 5d: aload 4
      // 5f: invokevirtual uci.hew (Lsa6;)V
      // 62: iload 2
      // 63: ifne 95
      // 66: goto 6d
      // 69: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6c: athrow
      // 6d: aload 1
      // 6e: invokevirtual net/minecraft/network/play/server/S3BPacketScoreboardObjective.sl2 ()I
      // 71: bipush 2
      // 72: goto 79
      // 75: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 78: athrow
      // 79: if_icmpne 95
      // 7c: aload 4
      // 7e: aload 1
      // 7f: invokevirtual net/minecraft/network/play/server/S3BPacketScoreboardObjective.m93 ()Ljava/lang/String;
      // 82: invokevirtual sa6.mf7 (Ljava/lang/String;)V
      // 85: aload 4
      // 87: aload 1
      // 88: invokevirtual net/minecraft/network/play/server/S3BPacketScoreboardObjective.xfv ()Lz0w$enz;
      // 8b: invokevirtual sa6.oaj (Lz0w$enz;)V
      // 8e: goto 95
      // 91: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 94: athrow
      // 95: return
   }

   @Override
   public void zk9(S3CPacketUpdateScore param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: aload 0
      // 02: aload 0
      // 03: getfield p_k.bol Lc05;
      // 06: invokestatic et9.hqd (Lmz2;Lyw3;Llg9;)V
      // 09: aload 0
      // 0a: getfield p_k.y40 Lkh3;
      // 0d: invokevirtual WorldClient.fgp ()Luci;
      // 10: astore 3
      // 11: invokestatic OpaquePredicate.c ()I
      // 14: aload 3
      // 15: aload 1
      // 16: invokevirtual net/minecraft/network/play/server/S3CPacketUpdateScore.cqn ()Ljava/lang/String;
      // 19: invokevirtual uci.vp8 (Ljava/lang/String;)Lsa6;
      // 1c: astore 4
      // 1e: istore 2
      // 1f: aload 1
      // 20: invokevirtual net/minecraft/network/play/server/S3CPacketUpdateScore.yga ()Lnet/minecraft/network/play/server/S3CPacketUpdateScore$f8u;
      // 23: getstatic net/minecraft/network/play/server/S3CPacketUpdateScore$f8u.tkq Lnet/minecraft/network/play/server/S3CPacketUpdateScore$f8u;
      // 26: iload 2
      // 27: ifne 66
      // 2a: if_acmpne 4d
      // 2d: goto 34
      // 30: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 33: athrow
      // 34: aload 3
      // 35: aload 1
      // 36: invokevirtual net/minecraft/network/play/server/S3CPacketUpdateScore.op2 ()Ljava/lang/String;
      // 39: aload 4
      // 3b: invokevirtual uci.jte (Ljava/lang/String;Lsa6;)Lr11;
      // 3e: astore 5
      // 40: aload 5
      // 42: aload 1
      // 43: invokevirtual net/minecraft/network/play/server/S3CPacketUpdateScore.uk9 ()I
      // 46: invokevirtual r11.ndm (I)V
      // 49: iload 2
      // 4a: ifeq a7
      // 4d: aload 1
      // 4e: iload 2
      // 4f: ifne 6a
      // 52: goto 59
      // 55: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 58: athrow
      // 59: invokevirtual net/minecraft/network/play/server/S3CPacketUpdateScore.yga ()Lnet/minecraft/network/play/server/S3CPacketUpdateScore$f8u;
      // 5c: getstatic net/minecraft/network/play/server/S3CPacketUpdateScore$f8u.yqa Lnet/minecraft/network/play/server/S3CPacketUpdateScore$f8u;
      // 5f: goto 66
      // 62: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 65: athrow
      // 66: if_acmpne a7
      // 69: aload 1
      // 6a: invokevirtual net/minecraft/network/play/server/S3CPacketUpdateScore.cqn ()Ljava/lang/String;
      // 6d: invokestatic jfy.hez (Ljava/lang/String;)Z
      // 70: ifeq 8a
      // 73: aload 3
      // 74: aload 1
      // 75: invokevirtual net/minecraft/network/play/server/S3CPacketUpdateScore.op2 ()Ljava/lang/String;
      // 78: aconst_null
      // 79: checkcast sa6
      // 7c: invokevirtual uci.ex1 (Ljava/lang/String;Lsa6;)V
      // 7f: iload 2
      // 80: ifeq a7
      // 83: goto 8a
      // 86: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 89: athrow
      // 8a: aload 4
      // 8c: ifnull a7
      // 8f: goto 96
      // 92: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 95: athrow
      // 96: aload 3
      // 97: aload 1
      // 98: invokevirtual net/minecraft/network/play/server/S3CPacketUpdateScore.op2 ()Ljava/lang/String;
      // 9b: aload 4
      // 9d: invokevirtual uci.ex1 (Ljava/lang/String;Lsa6;)V
      // a0: goto a7
      // a3: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a6: athrow
      // a7: return
   }

   @Override
   public void rgi(S3DPacketDisplayScoreboard param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: aload 0
      // 06: aload 0
      // 07: getfield p_k.bol Lc05;
      // 0a: invokestatic et9.hqd (Lmz2;Lyw3;Llg9;)V
      // 0d: aload 0
      // 0e: getfield p_k.y40 Lkh3;
      // 11: invokevirtual WorldClient.fgp ()Luci;
      // 14: astore 3
      // 15: iload 2
      // 16: ifeq 3d
      // 19: aload 1
      // 1a: invokevirtual net/minecraft/network/play/server/S3DPacketDisplayScoreboard.rjo ()Ljava/lang/String;
      // 1d: invokevirtual java/lang/String.length ()I
      // 20: ifne 41
      // 23: goto 2a
      // 26: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29: athrow
      // 2a: aload 3
      // 2b: aload 1
      // 2c: invokevirtual net/minecraft/network/play/server/S3DPacketDisplayScoreboard.pb9 ()I
      // 2f: aconst_null
      // 30: checkcast sa6
      // 33: invokevirtual uci.zux (ILsa6;)V
      // 36: goto 3d
      // 39: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c: athrow
      // 3d: iload 2
      // 3e: ifne 55
      // 41: aload 3
      // 42: aload 1
      // 43: invokevirtual net/minecraft/network/play/server/S3DPacketDisplayScoreboard.rjo ()Ljava/lang/String;
      // 46: invokevirtual uci.vp8 (Ljava/lang/String;)Lsa6;
      // 49: astore 4
      // 4b: aload 3
      // 4c: aload 1
      // 4d: invokevirtual net/minecraft/network/play/server/S3DPacketDisplayScoreboard.pb9 ()I
      // 50: aload 4
      // 52: invokevirtual uci.zux (ILsa6;)V
      // 55: return
   }

   @Override
   public void n_s(S3EPacketTeams param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: aload 0
      // 002: aload 0
      // 003: getfield p_k.bol Lc05;
      // 006: invokestatic et9.hqd (Lmz2;Lyw3;Llg9;)V
      // 009: invokestatic OpaquePredicate.c ()I
      // 00c: aload 0
      // 00d: getfield p_k.y40 Lkh3;
      // 010: invokevirtual WorldClient.fgp ()Luci;
      // 013: astore 3
      // 014: istore 2
      // 015: aload 1
      // 016: invokevirtual net/minecraft/network/play/server/S3EPacketTeams.zo9 ()I
      // 019: ifne 02a
      // 01c: aload 3
      // 01d: aload 1
      // 01e: invokevirtual net/minecraft/network/play/server/S3EPacketTeams.lpn ()Ljava/lang/String;
      // 021: invokevirtual uci.g_e (Ljava/lang/String;)Lq2m;
      // 024: astore 4
      // 026: iload 2
      // 027: ifeq 034
      // 02a: aload 3
      // 02b: aload 1
      // 02c: invokevirtual net/minecraft/network/play/server/S3EPacketTeams.lpn ()Ljava/lang/String;
      // 02f: invokevirtual uci.l2u (Ljava/lang/String;)Lq2m;
      // 032: astore 4
      // 034: aload 1
      // 035: iload 2
      // 036: ifne 098
      // 039: invokevirtual net/minecraft/network/play/server/S3EPacketTeams.zo9 ()I
      // 03c: ifeq 060
      // 03f: goto 046
      // 042: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 045: athrow
      // 046: aload 1
      // 047: invokevirtual net/minecraft/network/play/server/S3EPacketTeams.zo9 ()I
      // 04a: iload 2
      // 04b: ifne 0c6
      // 04e: goto 055
      // 051: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 054: athrow
      // 055: bipush 2
      // 056: if_icmpne 0b7
      // 059: goto 060
      // 05c: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05f: athrow
      // 060: aload 4
      // 062: aload 1
      // 063: invokevirtual net/minecraft/network/play/server/S3EPacketTeams.u47 ()Ljava/lang/String;
      // 066: invokevirtual q2m.l7j (Ljava/lang/String;)V
      // 069: aload 4
      // 06b: aload 1
      // 06c: invokevirtual net/minecraft/network/play/server/S3EPacketTeams.wto ()Ljava/lang/String;
      // 06f: invokevirtual q2m.b6t (Ljava/lang/String;)V
      // 072: aload 4
      // 074: aload 1
      // 075: invokevirtual net/minecraft/network/play/server/S3EPacketTeams.tlo ()Ljava/lang/String;
      // 078: invokevirtual q2m.kln (Ljava/lang/String;)V
      // 07b: aload 4
      // 07d: aload 1
      // 07e: invokevirtual net/minecraft/network/play/server/S3EPacketTeams.r8g ()I
      // 081: invokestatic syo.wgd (I)Lsyo;
      // 084: invokevirtual q2m.w8o (Lsyo;)V
      // 087: aload 4
      // 089: aload 1
      // 08a: invokevirtual net/minecraft/network/play/server/S3EPacketTeams.hnz ()I
      // 08d: invokevirtual q2m.nrr (I)V
      // 090: aload 1
      // 091: goto 098
      // 094: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 097: athrow
      // 098: iload 2
      // 099: ifne 0b8
      // 09c: invokevirtual net/minecraft/network/play/server/S3EPacketTeams.o1y ()Ljava/lang/String;
      // 09f: invokestatic n_0$ajs.qnh (Ljava/lang/String;)Ln_0$ajs;
      // 0a2: astore 5
      // 0a4: aload 5
      // 0a6: ifnull 0b7
      // 0a9: aload 4
      // 0ab: aload 5
      // 0ad: invokevirtual q2m.f59 (Ln_0$ajs;)V
      // 0b0: goto 0b7
      // 0b3: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b6: athrow
      // 0b7: aload 1
      // 0b8: iload 2
      // 0b9: ifne 0e4
      // 0bc: invokevirtual net/minecraft/network/play/server/S3EPacketTeams.zo9 ()I
      // 0bf: goto 0c6
      // 0c2: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c5: athrow
      // 0c6: ifeq 0e3
      // 0c9: aload 1
      // 0ca: invokevirtual net/minecraft/network/play/server/S3EPacketTeams.zo9 ()I
      // 0cd: bipush 3
      // 0ce: iload 2
      // 0cf: ifne 123
      // 0d2: goto 0d9
      // 0d5: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d8: athrow
      // 0d9: if_icmpne 11e
      // 0dc: goto 0e3
      // 0df: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e2: athrow
      // 0e3: aload 1
      // 0e4: invokevirtual net/minecraft/network/play/server/S3EPacketTeams.pgm ()Ljava/util/Collection;
      // 0e7: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 0ec: astore 5
      // 0ee: aload 5
      // 0f0: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0f5: ifeq 11e
      // 0f8: aload 5
      // 0fa: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0ff: checkcast java/lang/String
      // 102: astore 6
      // 104: aload 3
      // 105: aload 6
      // 107: aload 1
      // 108: invokevirtual net/minecraft/network/play/server/S3EPacketTeams.lpn ()Ljava/lang/String;
      // 10b: invokevirtual uci.g_l (Ljava/lang/String;Ljava/lang/String;)Z
      // 10e: pop
      // 10f: iload 2
      // 110: ifne 169
      // 113: iload 2
      // 114: ifeq 0ee
      // 117: goto 11e
      // 11a: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11d: athrow
      // 11e: aload 1
      // 11f: invokevirtual net/minecraft/network/play/server/S3EPacketTeams.zo9 ()I
      // 122: bipush 4
      // 123: iload 2
      // 124: ifne 16e
      // 127: if_icmpne 169
      // 12a: goto 131
      // 12d: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 130: athrow
      // 131: aload 1
      // 132: invokevirtual net/minecraft/network/play/server/S3EPacketTeams.pgm ()Ljava/util/Collection;
      // 135: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 13a: astore 5
      // 13c: aload 5
      // 13e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 143: ifeq 169
      // 146: aload 5
      // 148: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 14d: checkcast java/lang/String
      // 150: astore 6
      // 152: aload 3
      // 153: aload 6
      // 155: aload 4
      // 157: invokevirtual uci.srl (Ljava/lang/String;Lq2m;)V
      // 15a: iload 2
      // 15b: ifne 17e
      // 15e: iload 2
      // 15f: ifeq 13c
      // 162: goto 169
      // 165: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 168: athrow
      // 169: aload 1
      // 16a: invokevirtual net/minecraft/network/play/server/S3EPacketTeams.zo9 ()I
      // 16d: bipush 1
      // 16e: if_icmpne 17e
      // 171: aload 3
      // 172: aload 4
      // 174: invokevirtual uci.bss (Lq2m;)V
      // 177: goto 17e
      // 17a: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17d: athrow
      // 17e: return
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   @Override
   public void anq(S2APacketParticles var1) {
      long var2 = a ^ 25096477030828L;
      int var4 = OpaquePredicate.c();

      int var10000;
      label70: {
         label64: {
            try {
               et9.hqd(var1, this, this.bol);
               var10000 = var1.eea();
               if (var4 != 0) {
                  break label70;
               }

               if (var10000 != 0) {
                  break label64;
               }
            } catch (Throwable var23) {
               throw a(var23);
            }

            double var5 = (double)(var1.gzr() * var1.rr_());
            double var7 = (double)(var1.gzr() * var1.u35());
            double var9 = (double)(var1.gzr() * var1.xjs());

            try {
               this.y40.h2r(var1.gl6(), var1.ci5(), var1._ns(), var1.e8b(), var1.i0a(), var5, var7, var9, var1.xd8());
            } catch (Throwable var20) {
               xfk.warn(a<"h">(60, 564703641140864065L ^ var2) + var1.gl6());
            }

            try {
               if (var4 == 0) {
                  return;
               }
            } catch (Throwable var22) {
               boolean var10001 = false;
               throw a(var22);
            }
         }

         try {
            var10000 = 0;
         } catch (Throwable var21) {
            boolean var26 = false;
            throw a(var21);
         }
      }

      int var24 = var10000;

      while (var24 < var1.eea()) {
         double var6 = this.g1h.nextGaussian() * (double)var1.rr_();
         double var8 = this.g1h.nextGaussian() * (double)var1.u35();
         double var10 = this.g1h.nextGaussian() * (double)var1.xjs();
         double var12 = this.g1h.nextGaussian() * (double)var1.gzr();
         double var14 = this.g1h.nextGaussian() * (double)var1.gzr();
         double var16 = this.g1h.nextGaussian() * (double)var1.gzr();

         try {
            this.y40.h2r(var1.gl6(), var1.ci5(), var1._ns() + var6, var1.e8b() + var8, var1.i0a() + var10, var12, var14, var16, var1.xd8());
         } catch (Throwable var19) {
            xfk.warn(a<"h">(10022, 2952785275803435860L ^ var2) + var1.gl6());
            return;
         }

         var24++;
         if (var4 != 0) {
            break;
         }
      }
   }

   @Override
   public void zip(S20PacketEntityProperties param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic p_k.a J
      // 003: ldc2_w 11601525837006
      // 006: lxor
      // 007: lstore 2
      // 008: aload 1
      // 009: aload 0
      // 00a: aload 0
      // 00b: getfield p_k.bol Lc05;
      // 00e: invokestatic et9.hqd (Lmz2;Lyw3;Llg9;)V
      // 011: invokestatic OpaquePredicate.b ()I
      // 014: aload 0
      // 015: getfield p_k.y40 Lkh3;
      // 018: aload 1
      // 019: invokevirtual net/minecraft/network/play/server/S20PacketEntityProperties.kmq ()I
      // 01c: invokevirtual WorldClient.oks (I)Li2h;
      // 01f: astore 5
      // 021: istore 4
      // 023: aload 5
      // 025: iload 4
      // 027: ifeq 036
      // 02a: ifnull 12d
      // 02d: goto 034
      // 030: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 033: athrow
      // 034: aload 5
      // 036: iload 4
      // 038: ifeq 07c
      // 03b: instanceof Entity
      // 03e: ifne 07a
      // 041: goto 048
      // 044: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 047: athrow
      // 048: new java/lang/IllegalStateException
      // 04b: dup
      // 04c: new java/lang/StringBuilder
      // 04f: dup
      // 050: invokespecial java/lang/StringBuilder.<init> ()V
      // 053: sipush 7492
      // 056: ldc2_w 7868210443956915267
      // 059: lload 2
      // 05a: lxor
      // 05b: invokedynamic h (IJ)Ljava/lang/String; bsm=p_k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 060: nop
      // 061: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 064: aload 5
      // 066: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 069: ldc ")"
      // 06b: nop
      // 06c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 06f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 072: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 075: athrow
      // 076: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 079: athrow
      // 07a: aload 5
      // 07c: checkcast Entity
      // 07f: invokevirtual Entity.s_a ()Losd;
      // 082: astore 6
      // 084: aload 1
      // 085: invokevirtual net/minecraft/network/play/server/S20PacketEntityProperties.nev ()Ljava/util/List;
      // 088: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 08d: astore 7
      // 08f: aload 7
      // 091: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 096: ifeq 12d
      // 099: aload 7
      // 09b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0a0: checkcast net/minecraft/network/play/server/S20PacketEntityProperties$bw1
      // 0a3: astore 8
      // 0a5: aload 6
      // 0a7: aload 8
      // 0a9: invokevirtual net/minecraft/network/play/server/S20PacketEntityProperties$bw1.zpz ()Ljava/lang/String;
      // 0ac: invokevirtual osd.srq (Ljava/lang/String;)L_4o;
      // 0af: astore 9
      // 0b1: aload 9
      // 0b3: iload 4
      // 0b5: ifeq 0ee
      // 0b8: ifnonnull 0e0
      // 0bb: goto 0c2
      // 0be: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c1: athrow
      // 0c2: aload 6
      // 0c4: new oik
      // 0c7: dup
      // 0c8: aconst_null
      // 0c9: checkcast w9p
      // 0cc: aload 8
      // 0ce: invokevirtual net/minecraft/network/play/server/S20PacketEntityProperties$bw1.zpz ()Ljava/lang/String;
      // 0d1: dconst_0
      // 0d2: ldc2_w 2.2250738585072014E-308
      // 0d5: ldc2_w 1.7976931348623157E308
      // 0d8: invokespecial oik.<init> (Lw9p;Ljava/lang/String;DDD)V
      // 0db: invokevirtual osd.ylc (Lw9p;)L_4o;
      // 0de: astore 9
      // 0e0: aload 9
      // 0e2: aload 8
      // 0e4: invokevirtual net/minecraft/network/play/server/S20PacketEntityProperties$bw1.p76 ()D
      // 0e7: invokeinterface _4o.zf7 (D)V 3
      // 0ec: aload 9
      // 0ee: invokeinterface _4o.inp ()V 1
      // 0f3: aload 8
      // 0f5: invokevirtual net/minecraft/network/play/server/S20PacketEntityProperties$bw1.wa2 ()Ljava/util/Collection;
      // 0f8: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 0fd: astore 10
      // 0ff: aload 10
      // 101: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 106: ifeq 128
      // 109: aload 10
      // 10b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 110: checkcast xk5
      // 113: astore 11
      // 115: aload 9
      // 117: aload 11
      // 119: invokeinterface _4o.vcr (Lxk5;)V 2
      // 11e: iload 4
      // 120: ifeq 08f
      // 123: iload 4
      // 125: ifne 0ff
      // 128: iload 4
      // 12a: ifne 08f
      // 12d: return
   }

   public hv0 _m3() {
      return this._us;
   }

   public Collection l0e() {
      return this.z5d.values();
   }

   public hv2 txu(UUID var1) {
      return (hv2)this.z5d.get(var1);
   }

   public hv2 cj2(String param1) {
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
      // 05: getfield p_k.z5d Ljava/util/Map;
      // 08: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // 0d: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 12: astore 3
      // 13: aload 3
      // 14: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 19: ifeq 4f
      // 1c: aload 3
      // 1d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 22: checkcast hv2
      // 25: astore 4
      // 27: aload 4
      // 29: iload 2
      // 2a: ifne 4a
      // 2d: invokevirtual hv2.pbs ()Lcom/mojang/authlib/GameProfile;
      // 30: invokevirtual com/mojang/authlib/GameProfile.getName ()Ljava/lang/String;
      // 33: aload 1
      // 34: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 37: ifeq 4b
      // 3a: goto 41
      // 3d: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 40: athrow
      // 41: aload 4
      // 43: goto 4a
      // 46: invokestatic p_k.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 49: athrow
      // 4a: areturn
      // 4b: iload 2
      // 4c: ifeq 13
      // 4f: aconst_null
      // 50: areturn
   }

   public GameProfile w29() {
      return this.usb;
   }

   public static hv0 c1i(p_k var0) {
      return var0._us;
   }

   public static Minecraft lmd(p_k var0, Minecraft var1) {
      return var0.bol = var1;
   }

   public static Minecraft ovw(p_k var0) {
      return var0.bol;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-172848942359475699L, 1829633144148603395L, MethodHandles.lookup().lookupClass()).a(7034257324271L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 14872373704561L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[27];
      int var7 = 0;
      String var6 = "EåÃü{db:>é\u0015yö\u00ad]\u001e\u0010ã\u0084X';>âMáí<¾A®¯F8\u001e{L\u0019ûÉ®Ó\u008fT¼Æ\u0006\u0006ø@\u0007\u009fnãm»æü_$á¬V\u0016\u009d\tÝ\u000enB;o\u000f\u0016ÌM´\u0001\u0088\u0018\u0000cºÞs\u0004Â°a\u008f(\u0082×*Mÿx\u001a/\u0006?Ø\u0098\"²µ¬«Ò,eÎû<°N'Þ«¢¹Ç£Z$\u0081\u0090;\u0018G¶ £¼\u001eÓ»|°ý|=¥CuåE\u00022\u000f\u0092iOßl\u009cÎ´\u0016~g\u0083e¤(G\u009eàzéçm\u008cW#ðÉ©§\u0080\u0087\\\u0082\u0082×wíæ\u000faOã£öyL>\u009fõëÚãA\u0087ò 3 Ã\u001cH\u0018Ó\u0080#*\u009a\u0003!\u0004\u001fÓ·Ê¦\u0012Ä|rå\u0099\u0083Ú?\u008b²\u000f«@\tuT\\}\u0013ýqÚ ¯´\u0098\u0094©dû'ä.¡u\u0003,¨þÚý\u0095\u0085îaÍ\u0013N\b\nÆWÚ\u000b)ujÖ5\u0086¢óì[)@ \u0004uÄ\u009aÃÌèÍ\u009d\u001e@m_ê\"´\u000f>\u0081E±vêýí·/\u0098;\u0083i9\u001a\u0001\u00151XhË¼5GÝ\u0005 ò¶\u001fùÀCKC·¦1M£\nÞw¶Ñi\u0003\u001a\u0002d:]\f}j\u001e\u0014\u0018\u001dmCÑè\"T*¾=ßÙ\u0099G\u001b¹\u0001TÆÒ Ðmt \u0098\u0007\u009f\u0003no\u0096T\u009ba4G\u0085©ô;\u008a¬\u001e\u0099#÷>;ÓMÕ;ýq\u0082\f\u0018@Õ\u008cJ\u0082ÎÚW^\u0003\u000e\u001eÒ\u0084¤\u008c29:sçzO®(¾oÚ\u0017éO{Ç\u0004Ê¹Ú\u008fÌ\u0082Ô?³»O(6(=&ÃB¢ÀùU'Í\u0091ì:0\\U\u0083 n\u0087\u0087|Þ&à\u000b*\u0096ãxúß,_Íü\rRY9KV5Ú Î¾\u009d\u0014\u0010\u0018\u0018Ö\u0016´§h×[\u0004R\u00931*à¯ù(«J¥Ö\u000bÕ\u001c8³g0\u0092¼\u008a\fµ/\u0084L¼è9¸°ù\u009e¸SNÂ\u0000G5<\u00030MEmë\u0000ö\u008e\u0096ø\u0080x\u0096ê*\"íQÇÏ*¡HÛ\t¥\bÅÕp\u0007ÆàaDaÛ\u001aÂ_lþ¨Qu;k'Øúy\u0004º«à-J\u0018ê8®û\fYÔ\u0086ñuq\u0086'\u0012D;ý\fÝ\u001eõ«¯\u009f>7âUè>oh#ólý\u000b¬\u0099pØò\u0010h8\u0007)õÖ¼$\u0004ÙëH¶¼\u0095\u0010ô\u009c]Èäz>ÐiË%ö\u008a\u008a\u000b\u0016E\u009b\u008d\u0013\u009aÚÅÀ-(%\u0013&¤\u0082p\u0010\u0013\u001f?ô¿\u0086ÌD\u009c#ç.\u0090 ¢\u0084\u008eù]úX\u00039åÇt\u00155N>¾ëã TU¦dâkrrÐF(¹í\fo3W\u0014w'ô&\u00ad¿'\u0018R8Ê\u0097*l\u0010'Bp{\u008b3\u008b²\\à\r/j<k-\u0018RÂé\u009d*\u001dÚ#èûºü-µ\b\u0003\u0016ö Ú§\u009eÂ00\r¸Ã3ÏI\u0015Ûß#÷\u0003R\u009e-ø\u0097j\u009aÅEº\u0096#ÛfÛzø¯¨Ð\u008aÝt\u0090>ù¿LþC8\u009fL1\u0085~\u0018\u00140\u0086Ì¥T\u001a\rÆ¨ð¡Ú\u001dý³Ýsí3\u001cÉÊè a\u0091\u009263mYÉÙ2»S&f\u001e%\u0085xÜ§8=\u0005ÿ!\n¿Eo\u001c²\u0084 \u0002oÉ\u0091ÊJ\u0006\u0003[ð³\u0006þ×È\u009d\u000bu§âûG¥ØPKù~\u0003IÌO";
      int var8 = "EåÃü{db:>é\u0015yö\u00ad]\u001e\u0010ã\u0084X';>âMáí<¾A®¯F8\u001e{L\u0019ûÉ®Ó\u008fT¼Æ\u0006\u0006ø@\u0007\u009fnãm»æü_$á¬V\u0016\u009d\tÝ\u000enB;o\u000f\u0016ÌM´\u0001\u0088\u0018\u0000cºÞs\u0004Â°a\u008f(\u0082×*Mÿx\u001a/\u0006?Ø\u0098\"²µ¬«Ò,eÎû<°N'Þ«¢¹Ç£Z$\u0081\u0090;\u0018G¶ £¼\u001eÓ»|°ý|=¥CuåE\u00022\u000f\u0092iOßl\u009cÎ´\u0016~g\u0083e¤(G\u009eàzéçm\u008cW#ðÉ©§\u0080\u0087\\\u0082\u0082×wíæ\u000faOã£öyL>\u009fõëÚãA\u0087ò 3 Ã\u001cH\u0018Ó\u0080#*\u009a\u0003!\u0004\u001fÓ·Ê¦\u0012Ä|rå\u0099\u0083Ú?\u008b²\u000f«@\tuT\\}\u0013ýqÚ ¯´\u0098\u0094©dû'ä.¡u\u0003,¨þÚý\u0095\u0085îaÍ\u0013N\b\nÆWÚ\u000b)ujÖ5\u0086¢óì[)@ \u0004uÄ\u009aÃÌèÍ\u009d\u001e@m_ê\"´\u000f>\u0081E±vêýí·/\u0098;\u0083i9\u001a\u0001\u00151XhË¼5GÝ\u0005 ò¶\u001fùÀCKC·¦1M£\nÞw¶Ñi\u0003\u001a\u0002d:]\f}j\u001e\u0014\u0018\u001dmCÑè\"T*¾=ßÙ\u0099G\u001b¹\u0001TÆÒ Ðmt \u0098\u0007\u009f\u0003no\u0096T\u009ba4G\u0085©ô;\u008a¬\u001e\u0099#÷>;ÓMÕ;ýq\u0082\f\u0018@Õ\u008cJ\u0082ÎÚW^\u0003\u000e\u001eÒ\u0084¤\u008c29:sçzO®(¾oÚ\u0017éO{Ç\u0004Ê¹Ú\u008fÌ\u0082Ô?³»O(6(=&ÃB¢ÀùU'Í\u0091ì:0\\U\u0083 n\u0087\u0087|Þ&à\u000b*\u0096ãxúß,_Íü\rRY9KV5Ú Î¾\u009d\u0014\u0010\u0018\u0018Ö\u0016´§h×[\u0004R\u00931*à¯ù(«J¥Ö\u000bÕ\u001c8³g0\u0092¼\u008a\fµ/\u0084L¼è9¸°ù\u009e¸SNÂ\u0000G5<\u00030MEmë\u0000ö\u008e\u0096ø\u0080x\u0096ê*\"íQÇÏ*¡HÛ\t¥\bÅÕp\u0007ÆàaDaÛ\u001aÂ_lþ¨Qu;k'Øúy\u0004º«à-J\u0018ê8®û\fYÔ\u0086ñuq\u0086'\u0012D;ý\fÝ\u001eõ«¯\u009f>7âUè>oh#ólý\u000b¬\u0099pØò\u0010h8\u0007)õÖ¼$\u0004ÙëH¶¼\u0095\u0010ô\u009c]Èäz>ÐiË%ö\u008a\u008a\u000b\u0016E\u009b\u008d\u0013\u009aÚÅÀ-(%\u0013&¤\u0082p\u0010\u0013\u001f?ô¿\u0086ÌD\u009c#ç.\u0090 ¢\u0084\u008eù]úX\u00039åÇt\u00155N>¾ëã TU¦dâkrrÐF(¹í\fo3W\u0014w'ô&\u00ad¿'\u0018R8Ê\u0097*l\u0010'Bp{\u008b3\u008b²\\à\r/j<k-\u0018RÂé\u009d*\u001dÚ#èûºü-µ\b\u0003\u0016ö Ú§\u009eÂ00\r¸Ã3ÏI\u0015Ûß#÷\u0003R\u009e-ø\u0097j\u009aÅEº\u0096#ÛfÛzø¯¨Ð\u008aÝt\u0090>ù¿LþC8\u009fL1\u0085~\u0018\u00140\u0086Ì¥T\u001a\rÆ¨ð¡Ú\u001dý³Ýsí3\u001cÉÊè a\u0091\u009263mYÉÙ2»S&f\u001e%\u0085xÜ§8=\u0005ÿ!\n¿Eo\u001c²\u0084 \u0002oÉ\u0091ÊJ\u0006\u0003[ð³\u0006þ×È\u009d\u000bu§âûG¥ØPKù~\u0003IÌO"
         .length();
      char var5 = 16;
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
                     c = new String[27];
                     xfk = LogManager.getLogger();
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

                  var6 = "!I\u0082ÿDmÃÌÞ\n*Ò6·\u009b\"gì:Õ!ìÀYlÝâ\u0083`}H\t'ÑÐ\u0083ú\u001bPÄ D\fç\u0097\u00837És\u007f\u0086Û~]yÔ\u009cAó\t\u001cnMñ´Ô\u0000º!\u008c\u0000Ì5";
                  var8 = "!I\u0082ÿDmÃÌÞ\n*Ò6·\u009b\"gì:Õ!ìÀYlÝâ\u0083`}H\t'ÑÐ\u0083ú\u001bPÄ D\fç\u0097\u00837És\u007f\u0086Û~]yÔ\u009cAó\t\u001cnMñ´Ô\u0000º!\u008c\u0000Ì5"
                     .length();
                  var5 = '(';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 28738;
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
            throw new RuntimeException("p_k", var10);
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
         throw new RuntimeException("p_k" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
