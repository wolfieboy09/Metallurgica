package dev.metallurgists.metallurgica.datagen;

import dev.metallurgists.metallurgica.Metallurgica;
import dev.metallurgists.metallurgica.datagen.loot.MetallurgicaGLMProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = Metallurgica.MOD_ID)
public class MetallurgicaDataGen {
    @SubscribeEvent
    public static void onGatherData(GatherDataEvent event) {
        PackOutput output = event.getGenerator().getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        event.getGenerator().addProvider(event.includeServer(), new MetallurgicaGLMProvider(output, lookupProvider));
    }
}
