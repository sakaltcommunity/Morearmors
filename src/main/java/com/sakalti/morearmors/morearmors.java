package com.sakalti.morearmors;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(MoreArmors.MODID)
public class MoreArmors {
    public static final String MODID = "morearmors";
    private static final Logger LOGGER = LogManager.getLogger();

    public MoreArmors() {
        // イベントバスにMODのライフサイクルイベントを登録
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        // 防御力上限解除とフルセットボーナス効果のイベントを登録
        MinecraftForge.EVENT_BUS.register(new ArmorCapHandler());
        MinecraftForge.EVENT_BUS.register(new ArmorEffectHandler());
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("More Armors MOD がセットアップされました！");
    }
}
