package net.xtradavido.actual_hay;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.xtradavido.actual_hay.datagen.ModBlockTagProvider;
import net.xtradavido.actual_hay.datagen.ModItemTagProvider;
import net.xtradavido.actual_hay.datagen.ModLootTableProvider;

public class ActualHayDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModLootTableProvider::new);
	}
}
