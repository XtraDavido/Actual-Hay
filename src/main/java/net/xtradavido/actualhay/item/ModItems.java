package net.xtradavido.actualhay.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.xtradavido.actualhay.ActualHay;

public class ModItems {
    public static final Item GRASS_ITEM = registerItem("grass", new Item(new Item.Settings().registryKey(itemRegistryKeyOf("grass"))));
    public static final Item DRIED_GRASS_ITEM = registerItem("dried_grass", new Item(new Item.Settings().registryKey(itemRegistryKeyOf("dried_grass"))));
    public static final Item HAY = registerItem("hay", new Item(new Item.Settings().registryKey(itemRegistryKeyOf("hay"))));
    public static final Item GRAIN = registerItem("grain", new Item(new Item.Settings().registryKey(itemRegistryKeyOf("grain"))));
    public static final Item STRAW = registerItem("straw", new Item(new Item.Settings().registryKey(itemRegistryKeyOf("straw"))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ActualHay.MOD_ID, name), item);
    }

    private static RegistryKey<Item> itemRegistryKeyOf(String path) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(ActualHay.MOD_ID, path));
    }

    private static void customIngredients(FabricItemGroupEntries entries) {
        entries.add(HAY);
        entries.add(GRAIN);
        entries.add(STRAW);
    }
    private static void customNatural(FabricItemGroupEntries entries) {
        entries.add(GRASS_ITEM);
        entries.add(DRIED_GRASS_ITEM);
    }

    public static void registerModItems() {
        ActualHay.LOGGER.info("Registering Mod Items for " + ActualHay.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::customIngredients);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::customNatural);
    }
}
