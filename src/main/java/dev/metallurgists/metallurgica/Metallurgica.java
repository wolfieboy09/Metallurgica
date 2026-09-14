package dev.metallurgists.metallurgica;

import com.mojang.logging.LogUtils;
import com.simibubi.create.foundation.item.ItemDescription;
import com.simibubi.create.foundation.item.KineticStats;
import com.simibubi.create.foundation.item.TooltipModifier;
import dev.metallurgists.metallurgica.foundation.registrate.MetallurgicaRegistrate;
import net.createmod.catnip.lang.FontHelper;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.event.server.ServerAboutToStartEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

import static com.simibubi.create.foundation.item.TooltipHelper.styleFromColor;

@Mod(Metallurgica.MOD_ID)
public class Metallurgica {
    public static final String MOD_ID = "metallurgica";
    public static final Logger LOGGER = LogUtils.getLogger();

    public static final FontHelper.Palette PALETTE = new FontHelper.Palette(styleFromColor(0x383d59), styleFromColor(0x717388));

    public static final MetallurgicaRegistrate REGISTRATE = MetallurgicaRegistrate.create(MOD_ID);

    
    public Metallurgica(IEventBus modEventBus, ModContainer modContainer) {
        REGISTRATE.registerEventListeners(modEventBus);
    }
    
    @SubscribeEvent
    public void onServerStart(ServerAboutToStartEvent event) {
        LOGGER.info("Thanks for using Metallurgica! Expect a severe lack of ores in your world :3");
    }

    public static ResourceLocation asResource(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }
}
