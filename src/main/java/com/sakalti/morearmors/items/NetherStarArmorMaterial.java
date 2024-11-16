package com.sakalti.morearmors.items;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.crafting.Ingredient;

public class NetherStarArmorMaterial implements ArmorMaterial {
    private static final int[] DURABILITY = new int[]{555, 675, 640, 512};
    private static final int[] DEFENSE = new int[]{5, 8, 6, 5};  // 合計22

    @Override
    public int getDurabilityForSlot(EquipmentSlot slot) {
        return DURABILITY[slot.getIndex()];
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot slot) {
        return DEFENSE[slot.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return 20;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ARMOR_EQUIP_NETHERITE;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.of(net.minecraft.world.item.Items.NETHER_STAR);
    }

    @Override
    public String getName() {
        return "nether_star_armor";
    }

    @Override
    public float getToughness() {
        return 3.5f;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.6f;
    }
}
