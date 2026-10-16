package net.arikia.dev.drpc;

import net.arikia.dev.drpc.callbacks.DisconnectedCallback;
import net.arikia.dev.drpc.callbacks.ErroredCallback;
import net.arikia.dev.drpc.callbacks.JoinGameCallback;
import net.arikia.dev.drpc.callbacks.JoinRequestCallback;
import net.arikia.dev.drpc.callbacks.ReadyCallback;
import net.arikia.dev.drpc.callbacks.SpectateGameCallback;

public class DiscordEventHandlers$Builder {
   public DiscordEventHandlers h = new DiscordEventHandlers();

   public DiscordEventHandlers$Builder setReadyEventHandler(ReadyCallback var1) {
      this.h.ready = var1;
      return this;
   }

   public DiscordEventHandlers$Builder setDisconnectedEventHandler(DisconnectedCallback var1) {
      this.h.disconnected = var1;
      return this;
   }

   public DiscordEventHandlers$Builder setErroredEventHandler(ErroredCallback var1) {
      this.h.errored = var1;
      return this;
   }

   public DiscordEventHandlers$Builder setJoinGameEventHandler(JoinGameCallback var1) {
      this.h.joinGame = var1;
      return this;
   }

   public DiscordEventHandlers$Builder setSpectateGameEventHandler(SpectateGameCallback var1) {
      this.h.spectateGame = var1;
      return this;
   }

   public DiscordEventHandlers$Builder setJoinRequestEventHandler(JoinRequestCallback var1) {
      this.h.joinRequest = var1;
      return this;
   }

   public DiscordEventHandlers build() {
      return this.h;
   }
}
