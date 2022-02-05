package net.chukkthedukk.chukksmod.registries;

import net.chukkthedukk.chukksmod.block.ModBlocks;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class ModRegistries {

    public static void registerStrippables() {
        StrippableBlockRegistry.register(ModBlocks.ENDWOOD_LOG, ModBlocks.STRIPPED_ENDWOOD_LOG);
        StrippableBlockRegistry.register(ModBlocks.ENDWOOD_WOOD, ModBlocks.STRIPPED_ENDWOOD_WOOD);
    }
}
