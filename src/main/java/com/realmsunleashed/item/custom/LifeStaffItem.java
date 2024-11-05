package com.realmsunleashed.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class LifeStaffItem extends Item {
    public LifeStaffItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {


        return super.useOnEntity(stack, user, entity, hand);
    }
}

public class LifeStaff extends SwordItem {
    public LifeStaff(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }
}
