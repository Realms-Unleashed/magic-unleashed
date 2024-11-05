package com.realmsunleashed.item;

import com.realmsunleashed.MagicUnleashed;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class BlockInit {

    public static final Block MAGIC_BLOCK = registerWithItem("magic_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(1.5F,6F)
                    .requiresTool()));

    public static final Block SHROOM = registerWithItem("shroom",
            new Block(AbstractBlock.Settings.create()));



    public static <T extends Block> T register(String name, T block) {
        return Registry.register(Registries.BLOCK, MagicUnleashed.id(name),block);
    }

    public static <T extends Block> T registerWithItem(String name, T block, Item.Settings settings) {
        T registered = register(name, block);
        ItemInit.register(name, new BlockItem(registered, settings));
        return registered;
    }

    public static <T extends Block> T registerWithItem(String name, T block) {
        return registerWithItem(name, block, new Item.Settings());
    }

    public static void load(){
    }
}
