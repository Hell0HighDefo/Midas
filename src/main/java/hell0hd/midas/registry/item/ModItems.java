package hell0hd.midas.registry.item;

import hell0hd.midas.Midas;
import hell0hd.midas.MidasConfig;
import hell0hd.midas.registry.item.component.ModConsumables;
import hell0hd.midas.registry.item.component.ModFoods;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Rarity;

import java.util.function.Function;

public class ModItems {
    public static final Item GOLDEN_HEAD = registerItem("golden_head", properties -> new Item(properties.food(ModFoods.GOLDEN_HEAD, ModConsumables.GOLDEN_HEAD).rarity(Rarity.UNCOMMON).useCooldown(MidasConfig.goldenHeadCooldown)));
    public static final Item GOLDEN_ZOMBIE_HEAD = registerItem("golden_zombie_head", properties -> new Item(properties.food(ModFoods.GOLDEN_HEAD, ModConsumables.GOLDEN_ZOMBIE_HEAD).rarity(Rarity.UNCOMMON).useCooldown(MidasConfig.goldenHeadCooldown)));
    public static final Item GOLDEN_CREEPER_HEAD = registerItem("golden_creeper_head", properties -> new Item(properties.food(ModFoods.GOLDEN_HEAD, ModConsumables.GOLDEN_CREEPER_HEAD).rarity(Rarity.UNCOMMON).useCooldown(MidasConfig.goldenHeadCooldown)));
    public static final Item GOLDEN_SKULL = registerItem("golden_skull", properties -> new Item(properties.food(ModFoods.GOLDEN_HEAD, ModConsumables.GOLDEN_SKULL).rarity(Rarity.UNCOMMON).useCooldown(MidasConfig.goldenHeadCooldown)));
    public static final Item GOLDEN_WITHER_SKELETON_SKULL = registerItem("golden_wither_skeleton_skull", properties -> new Item(properties.food(ModFoods.GOLDEN_HEAD, ModConsumables.GOLDEN_WITHER_SKELETON_SKULL).rarity(Rarity.RARE).useCooldown(MidasConfig.goldenHeadCooldown)));
    public static final Item GOLDEN_PIGLIN_HEAD = registerItem("golden_piglin_head", properties -> new Item(properties.food(ModFoods.GOLDEN_HEAD, ModConsumables.GOLDEN_PIGLIN_HEAD).rarity(Rarity.UNCOMMON).useCooldown(MidasConfig.goldenHeadCooldown)));
    public static final Item GOLDEN_DRAGON_HEAD = registerItem("golden_dragon_head", properties -> new Item(properties.food(ModFoods.GOLDEN_HEAD, ModConsumables.GOLDEN_DRAGON_HEAD).rarity(Rarity.EPIC).useCooldown(MidasConfig.goldenHeadCooldown)));


    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Midas.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Midas.MOD_ID, name)))));
    }

    public static void registerModItems() {
        Midas.LOGGER.info(Midas.MOD_ID + " items initialized");

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.FOOD_AND_DRINKS).register(output -> {
            output.insertAfter(Items.ENCHANTED_GOLDEN_APPLE, GOLDEN_HEAD, GOLDEN_SKULL, GOLDEN_WITHER_SKELETON_SKULL, GOLDEN_ZOMBIE_HEAD, GOLDEN_CREEPER_HEAD, GOLDEN_PIGLIN_HEAD, GOLDEN_DRAGON_HEAD);
        });
    }
}
