package com.realmsunleashed.item;

import com.realmsunleashed.MagicUnleashed;
import com.realmsunleashed.list.FoodList;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ItemInit {
    public static final Item TEST_WAND = register("test_wand", new Item(new Item.Settings()));

    public static final Item  SHROOMS = register("shroom",
            new Item(new Item.Settings().food(FoodList.SHROOM_COMPONENT).maxCount(16)));


    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, MagicUnleashed.id(name), item);
    }

    public static void load() {}
}
