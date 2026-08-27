package dev.metallurgists.metallurgica.infastructure.material;

import com.tterrag.registrate.AbstractRegistrate;
import com.tterrag.registrate.util.entry.RegistryEntry;
import net.minecraftforge.registries.RegistryObject;
import net.neoforged.neoforge.registries.DeferredHolder;

public class MaterialEntry<T extends Material> extends RegistryEntry<T,T> {
    public MaterialEntry(AbstractRegistrate<?> owner, DeferredHolder<T,T> delegate) {
        super(owner, delegate);
    }

    public static <T extends Material> MaterialEntry<T> cast(RegistryEntry<T,T> entry) {
        return RegistryEntry.cast(MaterialEntry.class, entry);
    }
}
