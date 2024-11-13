package com.sakalti.morearmors.item;

import com.sakalti.morearmors.MoreArmors;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = MoreArmors.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MechanicalArmorRegister {

    @ObjectHolder(MoreArmors.MODID + ":mechanical_helmet")
    public static final Item MECHANICAL_HELMET = null;

    @ObjectHolder(MoreArmors.MODID + ":mechanical_chestplate")
    public static final Item MECHANICAL_CHESTPLATE = null;

    @ObjectHolder(MoreArmors.MODID + ":mechanical_leggings")
    public static final Item MECHANICAL_LEGGINGS = null;

    @ObjectHolder(MoreArmors.MODID + ":mechanical_boots")
    public static final Item MECHANICAL_BOOTS = null;

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
            new MechanicalArmor(EquipmentSlotType.HEAD).setRegistryName(MoreArmors.MODID, "mechanical_helmet"),
            new MechanicalArmor(EquipmentSlotType.CHEST).setRegistryName(MoreArmors.MODID, "mechanical_chestplate"),
            new MechanicalArmor(EquipmentSlotType.LEGS).setRegistryName(MoreArmors.MODID, "mechanical_leggings"),
            new MechanicalArmor(EquipmentSlotType.FEET).setRegistryName(MoreArmors.MODID, "mechanical_boots")
        );
    }
}
