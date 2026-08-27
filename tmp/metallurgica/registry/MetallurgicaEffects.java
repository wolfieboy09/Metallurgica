package dev.metallurgists.metallurgica.registry;

import dev.metallurgists.metallurgica.Metallurgica;
import dev.metallurgists.metallurgica.experimental.burns.ChemicalBurnEffect;
import dev.metallurgists.metallurgica.experimental.exposure_effects.LeadPoisoningEffect;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffect;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredHolder;

public class MetallurgicaEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS = DeferredRegister.create(Registries.MOB_EFFECT, Metallurgica.ID);
    
    public static final DeferredHolder<MobEffect,LeadPoisoningEffect> LEAD_POISONING = MOB_EFFECTS.register("lead_poisoning", () -> new LeadPoisoningEffect(0x4a5961));
    public static final DeferredHolder<MobEffect,ChemicalBurnEffect> CHEMICAL_BURN_EFFECT = MOB_EFFECTS.register("chemical_burn_effect", () -> new ChemicalBurnEffect(0x4a5961));


    public static void register(IEventBus modEventBus){
        MOB_EFFECTS.register(modEventBus);
    }
    
}
