package net.truebat.batfirstmod;

import net.fabricmc.api.ModInitializer;

import net.truebat.batfirstmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BatFirstMod implements ModInitializer {
	public static final String MOD_ID = "batfirstmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}