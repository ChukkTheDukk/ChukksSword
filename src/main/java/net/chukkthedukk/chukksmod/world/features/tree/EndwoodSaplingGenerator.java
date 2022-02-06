package net.chukkthedukk.chukksmod.world.features.tree;

import net.chukkthedukk.chukksmod.world.features.ModConfiguredFeatures;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class EndwoodSaplingGenerator extends SaplingGenerator {
    @Nullable
    @Override
    protected ConfiguredFeature<?, ?> getTreeFeature(Random random, boolean bees) {
        return ModConfiguredFeatures.ENDWOOD_TREE;
    }
}
