package net.chukkthedukk.chukksmod.world.gen;

import net.chukkthedukk.chukksmod.world.features.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.client.render.DimensionEffects;
import net.minecraft.tag.Tag;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.FeatureSize;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.treedecorator.TreeDecorator;
import net.minecraft.world.gen.trunk.TrunkPlacer;

import java.util.List;

public class ModTreeGeneration {

    public static void generateTrees() {
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),
                GenerationStep.Feature.SURFACE_STRUCTURES, ModPlacedFeatures.ENDWOOD_TREE_KEY);
    }
}
