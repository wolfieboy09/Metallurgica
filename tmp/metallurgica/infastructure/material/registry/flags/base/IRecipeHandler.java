package dev.metallurgists.metallurgica.infastructure.material.registry.flags.base;

import dev.metallurgists.metallurgica.infastructure.material.Material;
import net.minecraft.data.recipes.RecipeOutput;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public interface IRecipeHandler {

    void run(@NotNull Consumer<RecipeOutput> provider, @NotNull Material material);
}
