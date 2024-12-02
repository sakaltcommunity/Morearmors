package com.sakalti.morearmors.item;

import com.sakalti.morearmors.MoreArmors;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(MoreArmors.MODID)
public class CakeArmorRegister {

    public static final Item CAKE_HELMET = null;
    public static final Item CAKE_CHESTPLATE = null;
    public static final Item CAKE_LEGGINGS = null;
    public static final Item CAKE_BOOTS = null;

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
            new CakeArmor(EquipmentSlotType.HEAD).setRegistryName(new ResourceLocation(MoreArmors.MODID, "cake_helmet")),
            new CakeArmor(EquipmentSlotType.CHEST).setRegistryName(new ResourceLocation(MoreArmors.MODID, "cake_chestplate")),
            new CakeArmor(EquipmentSlotType.LEGS).setRegistryName(new ResourceLocation(MoreArmors.MODID, "cake_leggings")),
            new CakeArmor(EquipmentSlotType.FEET).setRegistryName(new ResourceLocation(MoreArmors.MODID, "cake_boots"))
        );
    }
}
