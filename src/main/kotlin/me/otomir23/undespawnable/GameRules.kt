package me.otomir23.undespawnable

import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry
import net.fabricmc.fabric.api.gamerule.v1.GameRuleFactory
import net.minecraft.world.GameRules

object GameRules {
    @JvmField
    val ITEM_DESPAWN_TIME = GameRuleRegistry.register("itemDespawnTime", GameRules.Category.DROPS, GameRuleFactory.createIntRule(6000))
}