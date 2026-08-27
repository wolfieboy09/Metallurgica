package dev.metallurgists.metallurgica;

//import dev.metallurgists.metallurgica.foundation.material.block.renderer.MaterialCogWheelRenderer;
//import dev.metallurgists.metallurgica.foundation.ponder.MetallurgicaPonderPlugin;
//import dev.metallurgists.metallurgica.registry.MetallurgicaPartialModels;
//import dev.metallurgists.metallurgica.registry.material.init.MetMaterialBlockEntities;
//import dev.metallurgists.metallurgica.registry.material.init.MetMaterialPartialModels;
import net.createmod.ponder.foundation.PonderIndex;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;

@Mod(value = Metallurgica.ID, dist = Dist.CLIENT)
public class MetallurgicaClient {
    public MetallurgicaClient(IEventBus modEventBus) {
        IEventBus forgeEventBus = NeoForge.EVENT_BUS;
//        MetallurgicaPartialModels.init();
//        MetMaterialPartialModels.clientInit();

        onCtorClient(modEventBus,forgeEventBus);
    }
    
    public static void onCtorClient(IEventBus modEventBus, IEventBus forgeEventBus) {
        modEventBus.addListener(MetallurgicaClient::clientInit);
    }

    public static void clientInit(final FMLClientSetupEvent event) {
//        PonderIndex.addPlugin(new MetallurgicaPonderPlugin());
//
//        BlockEntityRenderers.register(MetMaterialBlockEntities.materialCogwheel.get(), MaterialCogWheelRenderer::new);
    }


}
