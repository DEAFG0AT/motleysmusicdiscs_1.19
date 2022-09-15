package com.gracemotley.motleysmusicdiscs.sound;

import com.gracemotley.motleysmusicdiscs.MotleysMusicDiscs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.rmi.registry.Registry;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MotleysMusicDiscs.MOD_ID);


    public static RegistryObject<SoundEvent> CONTENT_BOBURNHAM = registerSoundEvent("content_boburnham");
    public static RegistryObject<SoundEvent> COMEDY_BOBURNHAM = registerSoundEvent("comedy_boburnham");
    public static RegistryObject<SoundEvent> FACETIMEWITHMYMOM_BOBURNHAM = registerSoundEvent("facetimewithmymom_boburnham");
    public static RegistryObject<SoundEvent> HOWTHEWORLDWORKS_BOBURNHAM = registerSoundEvent("howtheworldworks_boburnham");
    public static RegistryObject<SoundEvent> WHITEWOMANSINSTAGRAM_BOBURNHAM = registerSoundEvent("whitewomansinstagram_boburnham");
    public static RegistryObject<SoundEvent> UNPAIDINTERN_BOBURNHAM = registerSoundEvent("unpaidintern_boburnham");
    public static RegistryObject<SoundEvent> BEZOSI_BOBURNHAM = registerSoundEvent("bezosi_boburnham");
    public static RegistryObject<SoundEvent> SEXTING_BOBURNHAM = registerSoundEvent("sexting_boburnham");
    public static RegistryObject<SoundEvent> LOOKWHOSINSIDEAGAIN_BOBURNHAM = registerSoundEvent("lookwhosinsideagain_boburnham");
    public static RegistryObject<SoundEvent> PROBLEMATIC_BOBURNHAM = registerSoundEvent("problematic_boburnham");
    public static RegistryObject<SoundEvent> THIRTY_BOBURNHAM = registerSoundEvent("thirty_boburnham");
    public static RegistryObject<SoundEvent> DONTWANNAKNOW_BOBURNHAM = registerSoundEvent("dontwannaknow_boburnham");
    public static RegistryObject<SoundEvent> SHIT_BOBURNHAM = registerSoundEvent("shit_boburnham");
    public static RegistryObject<SoundEvent> WELCOMETOTHEINTERNET_BOBURNHAM = registerSoundEvent("welcometotheinternet_boburnham");
    public static RegistryObject<SoundEvent> BEZOSII_BOBURNHAM = registerSoundEvent("bezosii_boburnham");
    public static RegistryObject<SoundEvent> THATFUNNYFEELING_BOBURNHAM = registerSoundEvent("thatfunnyfeeling_boburnham");
    public static RegistryObject<SoundEvent> ALLEYESONME_BOBURNHAM = registerSoundEvent("alleyesonme_boburnham");
    public static RegistryObject<SoundEvent> GOODBYE_BOBURNHAM = registerSoundEvent("goodbye_boburnham");
    public static RegistryObject<SoundEvent> ANYDAYNOW_BOBURNHAM = registerSoundEvent("anydaynow_boburnham");


    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(MotleysMusicDiscs.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
