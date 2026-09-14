package hell0hd.midas.client.datagen;

import hell0hd.midas.registry.item.ModItems;
import hell0hd.midas.registry.tag.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class MidasRecipeProvider extends FabricRecipeProvider {
    public MidasRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registryLookup, RecipeOutput exporter) {
        return new RecipeProvider(registryLookup, exporter) {
            @Override
            public void buildRecipes() {
                HolderLookup.RegistryLookup<Item> itemLookup = registries.lookupOrThrow(Registries.ITEM);
                shaped(RecipeCategory.FOOD, ModItems.GOLDEN_HEAD, 1)
                        .pattern("ggg")
                        .pattern("ghg")
                        .pattern("ggg")
                        .define('g', Items.GOLD_INGOT)
                        .define('h', Items.PLAYER_HEAD)
                        .unlockedBy(getHasName(ModItems.GOLDEN_HEAD), has(ModTags.Items.GOLDEN_HEADS))
                        .group("golden_heads")
                        .save(output);
                shaped(RecipeCategory.FOOD, ModItems.GOLDEN_SKULL, 1)
                        .pattern("ggg")
                        .pattern("ghg")
                        .pattern("ggg")
                        .define('g', Items.GOLD_INGOT)
                        .define('h', Items.SKELETON_SKULL)
                        .unlockedBy(getHasName(ModItems.GOLDEN_SKULL), has(ModTags.Items.GOLDEN_HEADS))
                        .group("golden_heads")
                        .save(output);
                shaped(RecipeCategory.FOOD, ModItems.GOLDEN_WITHER_SKELETON_SKULL, 1)
                        .pattern("ggg")
                        .pattern("ghg")
                        .pattern("ggg")
                        .define('g', Items.GOLD_INGOT)
                        .define('h', Items.WITHER_SKELETON_SKULL)
                        .unlockedBy(getHasName(ModItems.GOLDEN_WITHER_SKELETON_SKULL), has(ModTags.Items.GOLDEN_HEADS))
                        .group("golden_heads")
                        .save(output);
                shaped(RecipeCategory.FOOD, ModItems.GOLDEN_ZOMBIE_HEAD, 1)
                        .pattern("ggg")
                        .pattern("ghg")
                        .pattern("ggg")
                        .define('g', Items.GOLD_INGOT)
                        .define('h', Items.ZOMBIE_HEAD)
                        .unlockedBy(getHasName(ModItems.GOLDEN_ZOMBIE_HEAD), has(ModTags.Items.GOLDEN_HEADS))
                        .group("golden_heads")
                        .save(output);
                shaped(RecipeCategory.FOOD, ModItems.GOLDEN_CREEPER_HEAD, 1)
                        .pattern("ggg")
                        .pattern("ghg")
                        .pattern("ggg")
                        .define('g', Items.GOLD_INGOT)
                        .define('h', Items.CREEPER_HEAD)
                        .unlockedBy(getHasName(ModItems.GOLDEN_CREEPER_HEAD), has(ModTags.Items.GOLDEN_HEADS))
                        .group("golden_heads")
                        .save(output);
                shaped(RecipeCategory.FOOD, ModItems.GOLDEN_PIGLIN_HEAD, 1)
                        .pattern("ggg")
                        .pattern("ghg")
                        .pattern("ggg")
                        .define('g', Items.GOLD_INGOT)
                        .define('h', Items.PIGLIN_HEAD)
                        .unlockedBy(getHasName(ModItems.GOLDEN_PIGLIN_HEAD), has(ModTags.Items.GOLDEN_HEADS))
                        .group("golden_heads")
                        .save(output);
                shaped(RecipeCategory.FOOD, ModItems.GOLDEN_DRAGON_HEAD, 1)
                        .pattern("ggg")
                        .pattern("ghg")
                        .pattern("ggg")
                        .define('g', Items.GOLD_INGOT)
                        .define('h', Items.DRAGON_HEAD)
                        .unlockedBy(getHasName(ModItems.GOLDEN_DRAGON_HEAD), has(ModTags.Items.GOLDEN_HEADS))
                        .group("golden_heads")
                        .save(output);
            }
        };
    }

    @Override
    public String getName() {
        return "MidasRecipeProvider";
    }
}
