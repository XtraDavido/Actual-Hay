package net.xtradavido.actual_hay.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.xtradavido.actual_hay.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
//        getOrCreateTagBuilder(BlockTags.EDIBLE_FOR_SHEEP)
//                .add(ModBlocks.WILD_WHEAT);
//        getOrCreateTagBuilder(BlockTags.REPLACEABLE_BY_MUSHROOMS)
//                .add(ModBlocks.WILD_WHEAT);
//        getOrCreateTagBuilder(BlockTags.REPLACEABLE_BY_TREES)
//                .add(ModBlocks.WILD_WHEAT);
        getOrCreateTagBuilder(BlockTags.SLABS)
            .add(ModBlocks.THATCH_SLAB);
        getOrCreateTagBuilder(BlockTags.STAIRS)
                .add(ModBlocks.THATCH_STAIRS);
        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
            .add(ModBlocks.HAY_CARPET,
                ModBlocks.STRAW_BLOCK,
                ModBlocks.STRAW_CARPET,
                ModBlocks.THATCH_BLOCK,
                ModBlocks.THATCH_SLAB,
                ModBlocks.THATCH_STAIRS);
    }
}
