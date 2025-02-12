package net.xtradavido.actualhay;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.xtradavido.actualhay.datagen.ModBlockTagProvider;
import net.xtradavido.actualhay.datagen.ModItemTagProvider;
import net.xtradavido.actualhay.datagen.ModLootTableProvider;
import net.xtradavido.actualhay.datagen.ModModelProvider;

public class ActualHayDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModModelProvider::new);
	}
}
