package dev.metallurgists.metallurgica.registry;

import dev.metallurgists.metallurgica.Metallurgica;
import dev.metallurgists.metallurgica.lang.MetallurgicaLang;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class MetallurgicaTags {
    public enum NameSpace {
        MOD(Metallurgica.MOD_ID),
        COMMON("c");

        public final String id;
        NameSpace(String id) {
            this.id = id;
        }
    }

    public enum Blocks {
        C_ORES(NameSpace.COMMON, "ores"),
        ;

        public final TagKey<Block> tag;

        Blocks() {
            this(NameSpace.MOD);
        }

        Blocks(NameSpace namespace) {
            this(namespace, null);
        }

        Blocks(NameSpace namespace, String path) {
            ResourceLocation id = ResourceLocation.fromNamespaceAndPath(namespace.id, path == null ? MetallurgicaLang.asId(name()) : path);
            this.tag = BlockTags.create(id);
        }

        Blocks(String namespace, String path) {
            this.tag = BlockTags.create(ResourceLocation.fromNamespaceAndPath(namespace, path));
        }
    }
}
