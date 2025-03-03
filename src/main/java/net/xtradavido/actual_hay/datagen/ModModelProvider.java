package net.xtradavido.actual_hay.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;
import net.xtradavido.actual_hay.block.ModBlocks;
import net.xtradavido.actual_hay.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerPaleMossCarpet(ModBlocks.HAY_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.STRAW_BLOCK,ModBlocks.STRAW_CARPET);

        BlockStateModelGenerator.BlockTexturePool thatchTexturePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.THATCH_BLOCK);
        thatchTexturePool.slab(ModBlocks.THATCH_SLAB);
        thatchTexturePool.stairs(ModBlocks.THATCH_STAIRS);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.GRASS_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.DRIED_GRASS_ITEM, Models.GENERATED);

        itemModelGenerator.register(ModItems.GRAIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.HAY, Models.GENERATED);
        itemModelGenerator.register(ModItems.STRAW, Models.GENERATED);
    }
}
