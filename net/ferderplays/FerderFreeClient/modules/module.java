package net.ferderplays.FerderFreeClient.modules;

import net.ferderplays.FerderFreeClient.utils.McUtil.mc;
import net.ferderplays.FerderFreeClient.utils.McUtil.player;
import net.ferderplays.FerderFreeClient.utils.McUtil.world;
import net.ferderplays.FerderFreeClient.utils.McUtil.server;
import net.ferderplays.FerderFreeClient.utils.McUtil.entity;
import net.ferderplays.FerderFreeClient.utils.McUtil.players_on_server;
import net.ferderplays.FerderFreeClient.modules.Client;
import net.ferderplays.FerderFreeClient.modules.Combat;
import net.ferderplays.FerderFreeClient.modules.Combat.CrystallAura;
import net.ferderplays.FerderFreeClient.modules.Discord;
import net.ferderplays.FerderFreeClient.modules.Exploits;
import net.ferderplays.FerderFreeClient.modules.Misc;
import net.ferderplays.FerderFreeClient.modules.Player;
import net.ferderplays.FerderFreeClient.modules.World;
import net.ferderplays.FerderFreeClient.FerderFreeClient;

public class module extends FerderFreeClient {
    public static String module;
    public static String Settings;
    boolean enabled;
    int KeyBind;

    public module(String module, int KeyBind, boolean enabled) {
        enum Category {
            COMBAT("Combat"),
            EXPLOITS("Exploits"),
            PLAYER("Player"),
            MISC("Misc"),
            WORLD("World"),
            CLIENT("Client"),
            DISCORD("Discord");
        }

        enum Modules {
            CRYSTALLAURA("CrystallAura");
        }
    }

    void onEnable() {
        enabled = !enabled;
    }

    void onPressed(KeyBind) {
        onEnable();
    }
}