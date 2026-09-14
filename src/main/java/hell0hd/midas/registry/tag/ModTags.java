package hell0hd.midas.registry.tag;

import hell0hd.midas.Midas;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {

    public static class Items {
        public static final TagKey<Item> GOLDEN_HEADS = registerItemTag("golden_heads");
    }

    private static TagKey<Item> registerItemTag(String name){
        return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Midas.MOD_ID, name));
    }
}
