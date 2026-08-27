package dev.metallurgists.metallurgica.foundation.data.runtime;

import com.simibubi.create.content.processing.recipe.ProcessingRecipeParams;
import dev.metallurgists.metallurgica.Metallurgica;
import com.simibubi.create.content.processing.recipe.ProcessingRecipe;
import com.simibubi.create.content.processing.recipe.ProcessingRecipeBuilder;
import net.minecraft.data.recipes.RecipeOutput;

import java.util.Collections;
import java.util.function.Consumer;
//TODO
//public class RuntimeProcessingRecipeBuilder<P extends ProcessingRecipeParams, T extends ProcessingRecipe<?, P>, S extends ProcessingRecipeBuilder<P, T, S>> extends ProcessingRecipeBuilder<P,T,S> {
//    Consumer<RecipeOutput> consumer;
//
//    public RuntimeProcessingRecipeBuilder(ProcessingRecipe.Factory<P,T> factory, Consumer<RecipeOutput> consumer, String recipePath) {
//        super(factory, Metallurgica.asResource("runtime_generated/" + recipePath));
//        this.consumer = consumer;
//    }
//
//    @Override
//    public T build() {
//        T t = super.build();
//        DataGenResult<T> result = new DataGenResult<>(t, Collections.emptyList());
//        consumer.accept(result);
//        return t;
//    }
//}
