package net.xtradavido.actualhay.block;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.xtradavido.actualhay.ActualHay;

public class ModBlocks {
    public static final Block STRAW_BLOCK = registerBlock("straw_block",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.YELLOW).instrument(NoteBlockInstrument.BANJO).strength(0.5F).sounds(BlockSoundGroup.GRASS).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(ActualHay.MOD_ID, "straw_block")))));
    public static final Block HAY_CARPET = registerBlock("hay_carpet",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.YELLOW).strength(0.5F).sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(ActualHay.MOD_ID, "hay_carpet")))));
    public static final Block STRAW_CARPET = registerBlock("straw_carpet",
            new CarpetBlock(AbstractBlock.Settings.create().mapColor(MapColor.YELLOW).strength(0.5F).sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(ActualHay.MOD_ID, "straw_carpet")))));
    public static final Block THATCH_BLOCK = registerBlock("thatch_block",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.YELLOW).strength(0.5F).sounds(BlockSoundGroup.GRASS).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(ActualHay.MOD_ID, "thatch_block")))));
    public static final Block THATCH_SLAB = registerBlock("thatch_slab",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.YELLOW).strength(0.5F).sounds(BlockSoundGroup.GRASS).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(ActualHay.MOD_ID, "thatch_slab")))));
    public static final Block THATCH_STAIRS = registerBlock("thatch_stairs",
            new StairsBlock(ModBlocks.THATCH_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().mapColor(MapColor.YELLOW).strength(0.5F).sounds(BlockSoundGroup.GRASS).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(ActualHay.MOD_ID, "thatch_stairs")))));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(ActualHay.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(ActualHay.MOD_ID, name),
                new BlockItem(block, new Item.Settings().registryKey(itemRegistryKeyOf(name))));
    }

    private static RegistryKey<Item> itemRegistryKeyOf(String path) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(ActualHay.MOD_ID, path));
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
        ActualHay.LOGGER.info("Registering Mod Blocks for " + ActualHay.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModBlocks::customNatural);
    }
}
