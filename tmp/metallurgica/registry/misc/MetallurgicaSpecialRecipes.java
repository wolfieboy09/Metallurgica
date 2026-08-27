package dev.metallurgists.metallurgica.registry.misc;

import dev.metallurgists.metallurgica.Metallurgica;
import dev.metallurgists.metallurgica.content.items.reaction.FluidReactionRecipe;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class MetallurgicaSpecialRecipes {
    public static final net.neoforged.neoforge.registries.DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS = DeferredRegister.create(Registries.RECIPE_SERIALIZER, Metallurgica.ID);
    public static final DeferredRegister<RecipeType<?>> RECIPE_TYPES = DeferredRegister.create(Registries.RECIPE_TYPE, Metallurgica.ID);

    public static final DeferredHolder<RecipeType<?>,RecipeType<Recipe<?>>> FLUID_REACTION = RECIPE_TYPES.register("fluid_reaction", () ->
            new RecipeType<>() {
                @Override
                public String toString() {
                    return FluidReactionRecipe.Serializer.CATEGORY;
                }
            });

    public static final DeferredHolder<RecipeSerializer<?>,RecipeSerializer<FluidReactionRecipe>> FLUID_REACTION_SERIALIZER = RECIPE_SERIALIZERS.register("fluid_reaction", FluidReactionRecipe.Serializer::new);


    public static void register(IEventBus bus) {
        RECIPE_SERIALIZERS.register(bus);
        RECIPE_TYPES.register(bus);
    }
}
