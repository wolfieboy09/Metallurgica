package dev.metallurgists.metallurgica;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.common.NeoForge;

@Mod(value = Metallurgica.MOD_ID, dist = Dist.CLIENT)
public class MetallurgicaClient {
    public MetallurgicaClient(IEventBus modEventBus) {
        IEventBus forgeEventBus = NeoForge.EVENT_BUS;

        onCtorClient(modEventBus,forgeEventBus);
    }
    
    public static void onCtorClient(IEventBus modEventBus, IEventBus forgeEventBus) {
        modEventBus.addListener(MetallurgicaClient::clientInit);
    }

    public static void clientInit(final FMLClientSetupEvent event) {

    }
}
