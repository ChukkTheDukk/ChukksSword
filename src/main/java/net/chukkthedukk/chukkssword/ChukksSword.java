package net.chukkthedukk.chukkssword;

import net.chukkthedukk.chukkssword.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChukksSword implements ModInitializer {
	public static final String MOD_ID = "chukkssword";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

	}
}
