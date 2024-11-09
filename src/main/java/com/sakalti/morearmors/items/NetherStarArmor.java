package com.sakalti.morearmors.items;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;

public class NetherStarArmor extends ArmorItem {
    public NetherStarArmor(EquipmentSlot slot, Properties properties) {
        super(new NetherStarArmorMaterial(), slot, properties);
    }

    @Override
    public String getArmorTexture(ItemStack stack, EquipmentSlot slot, String type) {
        return slot == EquipmentSlot.LEGS ? "morearmors:textures/models/armor/nether_star_armor_2.png" : "morearmors:textures/models/armor/nether_star_armor_1.png";
    }
}
