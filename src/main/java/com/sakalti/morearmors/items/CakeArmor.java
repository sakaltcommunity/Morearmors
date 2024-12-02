
package com.sakalti.morearmors.item;

import com.sakalti.morearmors.MoreArmors;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class CakeArmor extends ArmorItem {

    public CakeArmor(EquipmentSlotType slot) {
        super(new CakeArmorMaterial(), slot, new Item.Properties().group(ItemGroup.COMBAT));
    }

    @SubscribeEvent
    public static void onLivingUpdate(LivingEvent.LivingUpdateEvent event) {
        if (isWearingFullSet(event.getEntityLiving())) {
            event.getEntityLiving().addPotionEffect(new EffectInstance(Effects.REGENERATION, 100, 2, true, false, true));
        }
    }

    private static boolean isWearingFullSet(LivingEntity entity) {
        return entity.getItemStackFromSlot(EquipmentSlotType.HEAD).getItem() instanceof CakeArmor &&
               entity.getItemStackFromSlot(EquipmentSlotType.CHEST).getItem() instanceof CakeArmor &&
               entity.getItemStackFromSlot(EquipmentSlotType.LEGS).getItem() instanceof CakeArmor &&
               entity.getItemStackFromSlot(EquipmentSlotType.FEET).getItem() instanceof CakeArmor;
    }
}
