package com.sakalti.morearmors.item;

import com.sakalti.morearmors.MoreArmors;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = MoreArmors.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(MoreArmors.MODID)
public class CrystalArmorRegister {
    
    public static final Item CRYSTAL_HELMET = null;
    public static final Item CRYSTAL_CHESTPLATE = null;
    public static final Item CRYSTAL_LEGGINGS = null;
    public static final Item CRYSTAL_BOOTS = null;

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
            new CrystalArmor(EquipmentSlotType.HEAD).setRegistryName(new ResourceLocation(MoreArmors.MODID, "crystal_helmet")),
            new CrystalArmor(EquipmentSlotType.CHEST).setRegistryName(new ResourceLocation(MoreArmors.MODID, "crystal_chestplate")),
            new CrystalArmor(EquipmentSlotType.LEGS).setRegistryName(new ResourceLocation(MoreArmors.MODID, "crystal_leggings")),
            new CrystalArmor(EquipmentSlotType.FEET).setRegistryName(new ResourceLocation(MoreArmors.MODID, "crystal_boots"))
        );
    }
}
