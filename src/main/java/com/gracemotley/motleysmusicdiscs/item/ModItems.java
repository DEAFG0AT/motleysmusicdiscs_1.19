package com.gracemotley.motleysmusicdiscs.item;

import com.gracemotley.motleysmusicdiscs.MotleysMusicDiscs;
import com.gracemotley.motleysmusicdiscs.sound.ModSounds;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MotleysMusicDiscs.MOD_ID);



public static final RegistryObject<Item> CONTENT_BOBURNHAM_MUSIC_DISC = ITEMS.register("content_boburnham_music_disc",
        () -> new RecordItem(4, ModSounds.CONTENT_BOBURNHAM,
                new Item.Properties().tab(ModCreativeModTab.DISC_TAB).stacksTo(1).rarity(Rarity.RARE)));
public static final RegistryObject<Item> COMEDY_BOBURNHAM_MUSIC_DISC = ITEMS.register("comedy_boburnham_music_disc",
        () -> new RecordItem(4, ModSounds.COMEDY_BOBURNHAM,
                new Item.Properties().tab(ModCreativeModTab.DISC_TAB).stacksTo(1).rarity(Rarity.RARE)));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
