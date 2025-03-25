package net.xtradavido.actual_hay.util;

import net.fabricmc.fabric.api.registry.FuelRegistryEvents;
import net.minecraft.block.Blocks;
import net.xtradavido.actual_hay.block.ModBlocks;
import net.xtradavido.actual_hay.item.ModItems;

public class ModFuelItems {
    public static void registerFuelItems() {
        FuelRegistryEvents.BUILD.register((builder, context) -> {
            builder.add(ModItems.DRIED_GRASS_ITEM, 50);
            builder.add(ModItems.HAY, 50);
            builder.add(ModItems.STRAW, 50);
            builder.add(Blocks.HAY_BLOCK, 500);
            builder.add(ModBlocks.HAY_CARPET, 333);
            builder.add(ModBlocks.STRAW_BLOCK, 500);
            builder.add(ModBlocks.STRAW_CARPET, 333);
            builder.add(ModBlocks.THATCH_BLOCK, 500);
            builder.add(ModBlocks.THATCH_SLAB, 250);
            builder.add(ModBlocks.THATCH_STAIRS, 500);
        });
    }
}
