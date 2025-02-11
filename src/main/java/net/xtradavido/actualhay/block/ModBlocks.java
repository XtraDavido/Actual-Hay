package net.xtradavido.actualhay.block;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.xtradavido.actualhay.ActualHay;

public class ModBlocks {
    public static final Block STRAW_BLOCK = registerBlock("straw_block",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.YELLOW).instrument(NoteBlockInstrument.BANJO).strength(0.5F).sounds(BlockSoundGroup.GRASS)));
    public static final Block HAY_CARPET = registerBlock("hay_carpet",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.YELLOW).strength(0.5F).sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block STRAW_CARPET = registerBlock("straw_carpet",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.YELLOW).strength(0.5F).sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block THATCH_BLOCK = registerBlock("thatch_block",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.YELLOW).strength(0.5F).sounds(BlockSoundGroup.GRASS)));
    public static final Block THATCH_SLAB = registerBlock("thatch_slab",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.YELLOW).strength(0.5F).sounds(BlockSoundGroup.GRASS)));
    public static final Block THATCH_STAIRS = registerBlock("thatch_stairs",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.YELLOW).strength(0.5F).sounds(BlockSoundGroup.GRASS)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(ActualHay.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(ActualHay.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    private static void customNatural(FabricItemGroupEntries entries) {
        entries.add(STRAW_BLOCK);
        entries.add(HAY_CARPET);
        entries.add(STRAW_CARPET);
        entries.add(THATCH_BLOCK);
        entries.add(THATCH_SLAB);
        entries.add(THATCH_STAIRS);
    }

    public static void registerModBlocks() {
        ActualHay.LOGGER.info("Registring Mod Blocks for " + ActualHay.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModBlocks::customNatural);
    }
}
