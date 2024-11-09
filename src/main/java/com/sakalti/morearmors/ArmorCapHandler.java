package com.sakalti.morearmors;

import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MoreArmors.MODID)
public class ArmorCapHandler {

    private static final double MAX_ARMOR_VALUE = 100.0;  // 必要に応じて最大防御力を設定

    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        Player player = event.player;

        if (player.isAlive()) {
            // プレイヤーの防御力を強制的に上限値まで引き上げる
            if (player.getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ARMOR).getBaseValue() < MAX_ARMOR_VALUE) {
                player.getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ARMOR).setBaseValue(MAX_ARMOR_VALUE);
            }
        }
    }
}
