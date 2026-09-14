package hell0hd.midas.registry.loot;

import hell0hd.midas.registry.item.ModItems;
import net.fabricmc.fabric.api.loot.v3.FabricLootTableBuilder;
import net.fabricmc.fabric.api.loot.v3.LootTableSource;
import net.minecraft.core.HolderLookup;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

public class ModLootTableModifiers {
    public static void modifyLootTables(ResourceKey<LootTable> key, FabricLootTableBuilder builder,
                                        LootTableSource source, HolderLookup.Provider provider) {


        if (key.identifier().equals(Identifier.withDefaultNamespace("chests/nether_bridge"))) {
            LootPool.Builder poolBuilder = LootPool.lootPool()
                    .setRolls(UniformGenerator.between(1, 2))
                    .when(LootItemRandomChanceCondition.randomChance(0.025f))
                    .add(LootItem.lootTableItem(ModItems.GOLDEN_PIGLIN_HEAD))
                    .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1f)));
            builder.pool(poolBuilder.build());
        }

        if (key.identifier().equals(Identifier.withDefaultNamespace("chests/bastion_bridge"))) {
            LootPool.Builder poolBuilder = LootPool.lootPool()
                    .setRolls(UniformGenerator.between(1, 2))
                    .when(LootItemRandomChanceCondition.randomChance(0.15f))
                    .add(LootItem.lootTableItem(ModItems.GOLDEN_HEAD))
                    .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1f)));
            builder.pool(poolBuilder.build());
        }

        if (key.identifier().equals(Identifier.withDefaultNamespace("chests/bastion_other"))) {
            LootPool.Builder poolBuilder = LootPool.lootPool()
                    .setRolls(UniformGenerator.between(1, 2))
                    .when(LootItemRandomChanceCondition.randomChance(0.15f))
                    .add(LootItem.lootTableItem(ModItems.GOLDEN_HEAD))
                    .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1f)));
            builder.pool(poolBuilder.build());
        }


        if (key.identifier().equals(Identifier.withDefaultNamespace("chests/bastion_treasure"))) {
            LootPool.Builder poolBuilder = LootPool.lootPool()
                    .setRolls(UniformGenerator.between(1, 3))
                    .when(LootItemRandomChanceCondition.randomChance(0.35f))
                    .add(LootItem.lootTableItem(ModItems.GOLDEN_HEAD))
                    .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1f)));
            builder.pool(poolBuilder.build());
        }

        if (key.identifier().equals(Identifier.withDefaultNamespace("chests/bastion_treasure"))) {
            LootPool.Builder poolBuilder = LootPool.lootPool()
                    .setRolls(UniformGenerator.between(1, 2))
                    .when(LootItemRandomChanceCondition.randomChance(0.1f))
                    .add(LootItem.lootTableItem(ModItems.GOLDEN_WITHER_SKELETON_SKULL))
                    .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1f)));
            builder.pool(poolBuilder.build());
        }

        if (key.identifier().equals(Identifier.withDefaultNamespace("chests/ruined_portal"))) {
            LootPool.Builder poolBuilder = LootPool.lootPool()
                    .setRolls(ConstantValue.exactly(1f))
                    .when(LootItemRandomChanceCondition.randomChance(0.075f))
                    .add(LootItem.lootTableItem(ModItems.GOLDEN_HEAD))
                    .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1f)));
            builder.pool(poolBuilder.build());
        }
    }
}