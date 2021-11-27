package net.ferderplays.FerderFreeClient.modules.Client;

import net.ferderplays.FerderFreeClient.utils.McUtil.mc;
import net.ferderplays.FerderFreeClient.utils.McUtil.player;
import net.ferderplays.FerderFreeClient.utils.McUtil.title;
import net.ferderplays.FerderFreeClient.modules.*;

public class hud extends module {
    this.enum = "HUD";
    ArrayList<String> enabled_modules = new ArrayList<String>();
    enabled_modules.add(enabled);
    public hud() {
        private static Settings watermark = '<oldfrog/oldfag/TWObTWOt/FerderFreeClient/FFCHack>' = this.mc.setTitle();
        private static Settings enabled_module_case  = '<uppercase/lowercase>' = this.enabled_module_case.set();
    }
    void onEnable() {
        enabled = "HUD";
        switch (watermark) {
            case OLDFROG:
                this.mc.setTitle("OldFrog on top!");
                break;
            case OLDFAG:
                this.mc.setTitle("OldFag on top!");
                break;
            case TWObTWOt:
                this.mc.setTitle("nawfag killa!" + "2b2t on top!");
                break;
            case FerderFreeClient:
                this.mc.setTitle("NAWFAGS ARE THE BEST!" + "FerderFreeClient on top!");
                break;
        }

        switch (enabled_module_case) {
            case uppercase:
                this.modules_lol.display(enabled_modules).toUpperCase();
                break;
            case lowercase:
                this.modules_lol.display(enabled_modules).toLowerCase();
                break;
        }

        interface modules_lol {
            String length = enabled_modules.getLength();
            this.display(enabled_modules);
        }
    }
}