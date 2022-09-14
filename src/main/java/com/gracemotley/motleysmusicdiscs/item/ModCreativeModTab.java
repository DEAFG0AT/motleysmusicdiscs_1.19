package com.gracemotley.motleysmusicdiscs.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModTab {
    public static final CreativeModeTab DISC_TAB = new CreativeModeTab("disctab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CONTENT_BOBURNHAM_MUSIC_DISC.get());
        }
    };
}
