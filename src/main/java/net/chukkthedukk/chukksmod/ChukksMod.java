package net.chukkthedukk.chukksmod;

import net.chukkthedukk.chukksmod.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChukksMod implements ModInitializer {
	public static final String MOD_ID = "chukksmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

	}
}
