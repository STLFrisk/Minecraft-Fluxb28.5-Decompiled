import net.minecraft.network.play.server.S00PacketKeepAlive;
import net.minecraft.network.play.server.S01PacketJoinGame;
import net.minecraft.network.play.server.S02PacketChat;
import net.minecraft.network.play.server.S03PacketTimeUpdate;
import net.minecraft.network.play.server.S04PacketEntityEquipment;
import net.minecraft.network.play.server.S05PacketSpawnPosition;
import net.minecraft.network.play.server.S06PacketUpdateHealth;
import net.minecraft.network.play.server.S07PacketRespawn;
import net.minecraft.network.play.server.S08PacketPlayerPosLook;
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

public interface jsv extends yw3 {
   void tif(S0EPacketSpawnObject var1);

   void xwb(S11PacketSpawnExperienceOrb var1);

   void hq1(S2CPacketSpawnGlobalEntity var1);

   void xts(S0FPacketSpawnMob var1);

   void ett(S3BPacketScoreboardObjective var1);

   void qsp(S10PacketSpawnPainting var1);

   void rio(S0CPacketSpawnPlayer var1);

   void v7u(S0BPacketAnimation var1);

   void w17(S37PacketStatistics var1);

   void y6j(S25PacketBlockBreakAnim var1);

   void qya(S36PacketSignEditorOpen var1);

   void x0j(S35PacketUpdateTileEntity var1);

   void jhp(S24PacketBlockAction var1);

   void tfd(S23PacketBlockChange var1);

   void y36(S02PacketChat var1);

   void wsc(S3APacketTabComplete var1);

   void q8e(S22PacketMultiBlockChange var1);

   void msb(S34PacketMaps var1);

   void luq(S32PacketConfirmTransaction var1);

   void kww(S2EPacketCloseWindow var1);

   void d70(S30PacketWindowItems var1);

   void twv(S2DPacketOpenWindow var1);

   void b33(S31PacketWindowProperty var1);

   void a0d(S2FPacketSetSlot var1);

   void skf(S3FPacketCustomPayload var1);

   void e5w(S40PacketDisconnect var1);

   void usm(S0APacketUseBed var1);

   void sgx(S19PacketEntityStatus var1);

   void m41(S1BPacketEntityAttach var1);

   void jay(S27PacketExplosion var1);

   void fq1(S2BPacketChangeGameState var1);

   void xcg(S00PacketKeepAlive var1);

   void zxk(S21PacketChunkData var1);

   void k0h(S26PacketMapChunkBulk var1);

   void nzf(S28PacketEffect var1);

   void yuf(S01PacketJoinGame var1);

   void qlx(S14PacketEntity var1);

   void th7(S08PacketPlayerPosLook var1);

   void anq(S2APacketParticles var1);

   void j_n(S39PacketPlayerAbilities var1);

   void oon(S38PacketPlayerListItem var1);

   void ajs(S13PacketDestroyEntities var1);

   void qfr(S1EPacketRemoveEntityEffect var1);

   void fdc(S07PacketRespawn var1);

   void ces(S19PacketEntityHeadLook var1);

   void wjr(S09PacketHeldItemChange var1);

   void rgi(S3DPacketDisplayScoreboard var1);

   void dgq(S1CPacketEntityMetadata var1);

   void uia(S12PacketEntityVelocity var1);

   void j2v(S04PacketEntityEquipment var1);

   void d91(S1FPacketSetExperience var1);

   void oe4(S06PacketUpdateHealth var1);

   void n_s(S3EPacketTeams var1);

   void zk9(S3CPacketUpdateScore var1);

   void oz9(S05PacketSpawnPosition var1);

   void p02(S03PacketTimeUpdate var1);

   void _63(S33PacketUpdateSign var1);

   void ouw(S29PacketSoundEffect var1);

   void y9y(S0DPacketCollectItem var1);

   void fch(S18PacketEntityTeleport var1);

   void zip(S20PacketEntityProperties var1);

   void ntc(S1DPacketEntityEffect var1);

   void wno(S42PacketCombatEvent var1);

   void yux(S41PacketServerDifficulty var1);

   void qqb(S43PacketCamera var1);

   void o8p(S44PacketWorldBorder var1);

   void bob(S45PacketTitle var1);

   void h3r(S46PacketSetCompressionLevel var1);

   void kln(S47PacketPlayerListHeaderFooter var1);

   void ei2(S48PacketResourcePackSend var1);

   void wlg(S49PacketUpdateEntityNBT var1);
}
