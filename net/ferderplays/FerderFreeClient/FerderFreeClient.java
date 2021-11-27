package net.ferderplays.FerderFreeClient;

import net.ferderplays.FerderFreeClient.*;

public class FerderFreeClient {
    public static final String MOD_ID = "FerderFreeClient";
    public static final String MOD_VERSION = "b0.0.1";
    public static final String MOD_development = "FFC development";
    public static final String mcversion = "1.12.2-forge-14.23.5.2855";
    void setMcTitle(String[] args) {
        if (this.fml.intializing()) {
            Display.setTitle(MOD_ID + "|" + "initializing");
        }
        if (this.mc.isRunning()) {
            Display.setTitle(MOD_ID +MOD"|" + "running");
        }
    }
}