package hell0hd.midas.registry.item.component;

import hell0hd.midas.MidasConfig;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties GOLDEN_HEAD = new FoodProperties.Builder().nutrition(MidasConfig.goldenHeadNutrition).saturationModifier(MidasConfig.goldenHeadSaturation).alwaysEdible().build();
}
