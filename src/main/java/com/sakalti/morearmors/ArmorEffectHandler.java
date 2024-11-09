package com.sakalti.morearmors;

import com.sakalti.morearmors.items.NetherStarArmor;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MoreArmors.MODID)
public class ArmorEffectHandler {

    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        Player player = event.player;

        // プレイヤーがネザースターアーマーをフルセットで装備しているか確認
        if (isWearingFullNetherStarArmor(player)) {
            if (!player.hasEffect(MobEffects.FIRE_RESISTANCE)) {
                player.addEffect(new net.minecraft.world.effect.MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20, 0, true, false));
            }
        }
    }

    private static boolean isWearingFullNetherStarArmor(Player player) {
        for (ItemStack itemStack : player.getArmorSlots()) {
            if (!(itemStack.getItem() instanceof NetherStarArmor)) {
                return false;
            }
        }
        return true;
    }
}
