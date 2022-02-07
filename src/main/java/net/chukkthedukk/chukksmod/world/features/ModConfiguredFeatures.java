package net.chukkthedukk.chukksmod.world.features;

import net.chukkthedukk.chukksmod.ChukksMod;
import net.chukkthedukk.chukksmod.block.ModBlocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

public class ModConfiguredFeatures {

    public static final ConfiguredFeature<TreeFeatureConfig, ?> ENDWOOD_TREE = register("endwood",
            Feature.TREE.configure(new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.ENDWOOD_LOG),
                new StraightTrunkPlacer(7, 4, 5),
                BlockStateProvider.of(ModBlocks.ENDWOOD_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build()));

    public static final ConfiguredFeature<RandomFeatureConfig, ?> ENDWOOD_TREE_RANDOM = register("endwood_feature",
        Feature.RANDOM_SELECTOR.configure(new RandomFeatureConfig(List.of(new RandomFeatureEntry(
                ENDWOOD_TREE.withWouldSurviveFilter(ModBlocks.ENDWOOD_SAPLING), 0.1f)),
                ENDWOOD_TREE.withWouldSurviveFilter(ModBlocks.ENDWOOD_SAPLING))));

    public static <FC extends FeatureConfig> ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> configuredFeature) {
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(ChukksMod.MOD_ID, name),
                configuredFeature);
    }

    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + ChukksMod.MOD_ID);
    }
}
