package net.xtradavido.actual_hay;

import net.fabricmc.api.ModInitializer;

import net.xtradavido.actual_hay.block.ModBlocks;
import net.xtradavido.actual_hay.item.ModItems;
import net.xtradavido.actual_hay.util.ModFuelItems;
import net.xtradavido.actual_hay.util.ModLootTables;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ActualHay implements ModInitializer {
	public static final String MOD_ID = "actual_hay";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModFuelItems.registerFuelItems();
		ModLootTables.modifyLootTables();
	}
}