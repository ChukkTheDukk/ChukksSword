package net.chukkthedukk.chukksmod.world.gen;

import net.chukkthedukk.chukksmod.world.features.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class ModTreeGeneration {

    public static void generateTrees() {
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),
                GenerationStep.Feature.SURFACE_STRUCTURES, ModPlacedFeatures.ENDWOOD_TREE_KEY);
    }

}
