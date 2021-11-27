package net.ferderplays.FerderFreeClient.modules.combat;

import net.ferderplays.FerderFreeClient.utils.McUtil.mc;
import net.ferderplays.FerderFreeClient.utils.McUtil.player;
import net.ferderplays.FerderFreeClient.utils.McUtil.world;
import net.ferderplays.FerderFreeClient.utils.McUtil.server;
import net.ferderplays.FerderFreeClient.utils.McUtil.entity;
import net.ferderplays.FerderFreeClient.utils.McUtil.players_on_server;
import net.ferderplays.FerderFreeClient.modules.module.*;

public class CrystallAura extends module {
    this.enum = "CrystallAura";
    public static String range;
    private CrystallAura() {
        private static final Settings place_range = '<range>' = this.range.set(place_range.set());
        private static final Settings place_mode = '<MAINHAND/OFFHAND>' = this.place_mode.set();
        private static final Settings break_range = '<range>' = this.range.set(break_range.set());
        private static final Settings switch_mode = '<MAINHHAND/OFFHAND>' = this.switch_mode.set();
    }
    void onEnable() {
        enabled = "CrystallAura";
        switch (place_range) {
            case 1:
                this.range.place_range.set(BLOCKS.distance(1));
                break;
            case 2:
                this.range.place_range.set(BLOCKS.distance(2));
                break;
            case 3:
                this.range.place_range.set(BLOCKS.distance(3));
                break;
            case 4:
                this.range.place_range.set(BLOCKS.distance(4));
                break;
            case 5:
                this.range.place_range.set(BLOCKS.distance(5));
                break;
            case 6:
                this.range.place_range.set(BLOCKS.distance(6));
                break;
            case 7:
                this.range.place_range.set(BLOCKS.distance(7));
                break;
            case 8:
                this.range.place_range.set(BLOCKS.distance(8));
                break;
            case 9:
                this.range.place_range.set(BLOCKS.distance(9));
                break;
            case 10:
                this.range.place_range.set(BLOCKS.distance(10));
                break;
        }
        switch (break_range) {
            case 1:
                this.range.break_range.set(BLOCKS.distance(1));
                break;
            case 2:
                this.range.break_range.set(BLOCKS.distance(2));
                break;
            case 3:
                this.range.break_range.set(BLOCKS.distance(3));
                break;
            case 4:
                this.range.break_range.set(BLOCKS.distance(4));
                break;
            case 5:
                this.range.break_range.set(BLOCKS.distance(5));
                break;
            case 6:
                this.range.break_range.set(BLOCKS.distance(6));
                break;
            case 7:
                this.range.break_range.set(BLOCKS.distance(7));
                break;
            case 8:
                this.range.break_range.set(BLOCKS.distance(8));
                break;
            case 9:
                this.range.break_range.set(BLOCKS.distance(9));
                break;
            case 10:
                this.range.break_range.set(BLOCKS.distance(10));
                break;
        }
        switch (place_mode) {
            case MAINHAND:
                this.place_mode.set(enum.MAINHAND);
                break;
            case OFFHAND:
                this.place_mode.set(enum.OFFHAND);
                break;
        }
        switch (switch_mode) {
            case MAINHAND:
                this.switch_mode.set(enum.MAINHAND);
                break;
            case OFFHAND:
                this.switch_mode.set(enum.OFFHAND);
                break;
        }
    }
}