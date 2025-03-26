package net.xtradavido.actual_hay.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.fabricmc.fabric.mixin.loot.LootTableAccessor;
import net.minecraft.block.Blocks;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import net.xtradavido.actual_hay.item.ModItems;

public class ModLootTables {

    private static final Identifier WHEAT_ID
            = Identifier.of("minecraft", "blocks/wheat");

    public static void modifyLootTables() {
//        LootTableEvents.REPLACE.register((key, original, source, registries) -> {
//            if (Blocks.WHEAT.getLootTableKey().map(wheatKey -> wheatKey == key).orElse(false)) {
//                LootTable.builder().modifyPools()
//                ((LootTableAccessor) original).fabric_getPools()
//                tableBuilder.modifyPools(builder -> builder.build().eq.entries.getFirst().)
//            }
//        });
    }
}