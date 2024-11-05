package com.realmsunleashed.item;

import com.realmsunleashed.MagicUnleashed;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;

import java.util.Optional;

public class ItemGroupInit {
    private static final Text MAGIC_UNLEASHED = Text.translatable("itemGroup." + MagicUnleashed.MOD_ID + ".magic_group");

    public static final ItemGroup MAGIC_GROUP = register("magic_unleashed", FabricItemGroup.builder()
            .displayName(MAGIC_UNLEASHED)
            .icon(ItemInit.TEST_WAND::getDefaultStack)
            .entries((displayContext, entries) -> Registries.ITEM.getIds()
                    .stream()
                    .filter(key -> key.getNamespace().equals(MagicUnleashed.MOD_ID))
                    .map(Registries.ITEM::getOrEmpty)
                    .map(Optional::orElseThrow)
                    .forEach(entries::add))
            .build());

    public static <T extends ItemGroup> T register(String name, T itemGroup) {
        return Registry.register(Registries.ITEM_GROUP, MagicUnleashed.id(name), itemGroup);
    }

    public static void load(){}
}
