package net.shivanshplays1.helpmepls;

import net.fabricmc.api.ModInitializer;

import net.shivanshplays1.helpmepls.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Helpmepls implements ModInitializer {
	public static final String MOD_ID = "helpmepls";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}