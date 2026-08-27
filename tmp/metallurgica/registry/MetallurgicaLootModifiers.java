package dev.metallurgists.metallurgica.registry;

import dev.metallurgists.metallurgica.infastructure.loot_modifier.ReplaceItemLootModifier;
import com.mojang.serialization.MapCodec;
import net.neoforged.neoforge.common.loot.IGlobalLootModifier;
import net.neoforged.neoforge.common.loot.LootModifier;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredHolder;

public class MetallurgicaLootModifiers {
    public static final DeferredRegister<MapCodec<? extends IGlobalLootModifier>> LOOT_MODIFIERS;
    public static final DeferredHolder<MapCodec<? extends IGlobalLootModifier>,MapCodec<ReplaceItemLootModifier>> REPLACE_ITEM_LOOT_MODIFIER;
    
    public MetallurgicaLootModifiers() {
    }
    
    static {
        LOOT_MODIFIERS = DeferredRegister.create(NeoForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, "metallurgica");
        REPLACE_ITEM_LOOT_MODIFIER = LOOT_MODIFIERS.register("replace_item_loot_modifier", () -> ReplaceItemLootModifier.CODEC);
    }
}
