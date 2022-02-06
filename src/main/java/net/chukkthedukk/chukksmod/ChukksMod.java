package net.chukkthedukk.chukksmod;

import net.chukkthedukk.chukksmod.block.ModBlocks;
import net.chukkthedukk.chukksmod.item.ModItems;
import net.chukkthedukk.chukksmod.registries.ModRegistries;
import net.chukkthedukk.chukksmod.util.ModRenderHelper;
import net.chukkthedukk.chukksmod.world.features.ModConfiguredFeatures;
import net.chukkthedukk.chukksmod.world.gen.ModWorldGen;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChukksMod implements ModInitializer {
	public static final String MOD_ID = "chukksmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModConfiguredFeatures.registerConfiguredFeatures();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModRegistries.registerStrippables();

		ModRenderHelper.setRenderLayers();

		ModWorldGen.generateModWorldGen();

	}
}
