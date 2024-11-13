package com.sakalti.morearmors.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import com.sakalti.morearmors.MoreArmors;

@Mod.EventBusSubscriber
public class MechanicalArmor extends ArmorItem {

    public static final IArmorMaterial MECHANICAL_ARMOR_MATERIAL = new IArmorMaterial() {
        @Override
        public int getDurability(EquipmentSlotType slot) {
            return ArmorMaterial.NETHERITE.getDurability(slot) + 100;
        }

        @Override
        public int getDamageReductionAmount(EquipmentSlotType slot) {
            switch (slot) {
                case HEAD:
                    return 4;
                case CHEST:
                    return 7;
                case LEGS:
                    return 6;
                case FEET:
                    return 4;
                default:
                    return 0;
            }
        }

        @Override
        public int getEnchantability() {
            return 15;
        }

        @Override
        public SoundEvent getSoundEvent() {
            return SoundEvents.ITEM_ARMOR_EQUIP_IRON;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return Ingredient.fromItems(net.minecraft.item.Items.REDSTONE);
        }

        @Override
        public String getName() {
            return "mechanical";
        }

        @Override
        public float getToughness() {
            return 3.0f;
        }

        @Override
        public float getKnockbackResistance() {
            return 0.1f;
        }
    };

    public MechanicalArmor(EquipmentSlotType slot) {
        super(MECHANICAL_ARMOR_MATERIAL, slot, new Item.Properties().group(ItemGroup.COMBAT));
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        return new ResourceLocation(MoreArmors.MODID, "textures/models/armor/mechanical_armor_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png").toString();
    }

    @SubscribeEvent
    public static void onLivingUpdate(LivingEvent.LivingUpdateEvent event) {
        if (isWearingFullSet(event.getEntityLiving())) {
            event.getEntityLiving().addPotionEffect(new EffectInstance(Effects.SPEED, 10, 1, true, false, true));
        }
    }

    private static boolean isWearingFullSet(LivingEntity entity) {
        return entity.getItemStackFromSlot(EquipmentSlotType.HEAD).getItem() instanceof MechanicalArmor &&
               entity.getItemStackFromSlot(EquipmentSlotType.CHEST).getItem() instanceof MechanicalArmor &&
               entity.getItemStackFromSlot(EquipmentSlotType.LEGS).getItem() instanceof MechanicalArmor &&
               entity.getItemStackFromSlot(EquipmentSlotType.FEET).getItem() instanceof MechanicalArmor;
    }
}
