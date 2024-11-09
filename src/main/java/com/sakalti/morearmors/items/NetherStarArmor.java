package com.sakalti.morearmors.items;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;

public class NetherStarArmor extends ArmorItem {
    public NetherStarArmor(EquipmentSlot slot, Properties properties) {
        super(new NetherStarArmorMaterial(), slot, properties);
    }

    @Override
    public boolean isEnchantable(ItemStack stack) {
        return true;  // エンチャント可能にする
    }

    @Override
    public String getArmorTexture(ItemStack stack, EquipmentSlot slot, String type) {
        return slot == EquipmentSlot.LEGS ? "morearmors:textures/models/armor/nether_star_armor_2.png" : "morearmors:textures/models/armor/nether_star_armor_1.png";
    }

    // クリエイティブタブを指定
    @Override
    public CreativeModeTabs getCreativeModeTabs() {
        return CreativeModeTabs.COMBAT;
    }
}
