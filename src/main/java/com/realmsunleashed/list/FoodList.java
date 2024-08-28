package com.realmsunleashed.list;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.component.type.FoodComponents;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class FoodList {
    public static final FoodComponent SHROOM_COMPONENT = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(.3F)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 20 * 30, 2), 1F)
            .build();
}
