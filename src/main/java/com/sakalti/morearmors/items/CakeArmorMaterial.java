package com.sakalti.morearmors.item;

import com.sakalti.morearmors.MoreArmors;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Ingredient;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public class CakeArmorMaterial implements IArmorMaterial {

    @Override
    public int getDurability(EquipmentSlotType slot) {
        switch (slot) {
            case HEAD: return 125;
            case CHEST: return 180;
            case LEGS: return 168;
            case FEET: return 135;
            default: return 0;
        }
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slot) {
        switch (slot) {
            case HEAD: return 2;
            case CHEST: return 3;
            case LEGS: return 2;
            case FEET: return 1;
            default: return 0;
        }
    }

    @Override
    public int getEnchantability() {
        return 8;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return SoundEvents.ITEM_ARMOR_EQUIP_LEATHER;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return Ingredient.fromItems(net.minecraft.item.Items.CAKE);
    }

    @Override
    public String getName() {
        return "cake";
    }

    @Override
    public float getToughness() {
        return 0.8;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.75;
    }
}
