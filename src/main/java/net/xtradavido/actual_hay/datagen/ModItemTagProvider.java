package net.xtradavido.actual_hay.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.xtradavido.actual_hay.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.CHICKEN_FOOD)
                .add(ModItems.GRAIN);
        getOrCreateTagBuilder(ItemTags.COW_FOOD)
                .add(ModItems.HAY);
        getOrCreateTagBuilder(ItemTags.GOAT_FOOD)
                .add(ModItems.HAY);
        getOrCreateTagBuilder(ItemTags.HORSE_FOOD)
                .add(ModItems.HAY);
        getOrCreateTagBuilder(ItemTags.LLAMA_FOOD)
                .add(ModItems.HAY);
        getOrCreateTagBuilder(ItemTags.PARROT_FOOD)
                .add(ModItems.GRAIN);
        getOrCreateTagBuilder(ItemTags.SHEEP_FOOD)
                .add(ModItems.HAY);
        getOrCreateTagBuilder(ItemTags.VILLAGER_PICKS_UP)
                .add(ModItems.STRAW);
        getOrCreateTagBuilder(ItemTags.VILLAGER_PLANTABLE_SEEDS)
            .add(ModItems.GRAIN);
    }
}
