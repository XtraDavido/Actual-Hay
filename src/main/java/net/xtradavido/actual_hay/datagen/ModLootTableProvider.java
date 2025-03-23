package net.xtradavido.actual_hay.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.xtradavido.actual_hay.block.ModBlocks;
import net.xtradavido.actual_hay.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
//        addDrop(Blocks.SHORT_GRASS, shortPlantDrops(Blocks.SHORT_GRASS));
//        addDrop(Blocks.TALL_GRASS, tallPlantDrops(Blocks.TALL_GRASS, Blocks.SHORT_GRASS));
//        addDrop(Blocks.WHEAT, cropDrops(Blocks.WHEAT, ModItems.STRAW, Items.WHEAT_SEEDS));

        addDrop(ModBlocks.HAY_CARPET);
        addDrop(ModBlocks.STRAW_BLOCK);
        addDrop(ModBlocks.STRAW_CARPET);
        addDrop(ModBlocks.THATCH_BLOCK);
        addDrop(ModBlocks.THATCH_SLAB);
        addDrop(ModBlocks.THATCH_STAIRS);
//        addDrop(ModBlocks.WILD_WHEAT, cropDrops(Blocks.WILD_WHEAT, ModItems.STRAW, Items.WHEAT_SEEDS));
    }
}