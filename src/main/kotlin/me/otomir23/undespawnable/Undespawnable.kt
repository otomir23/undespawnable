package me.otomir23.undespawnable

import me.otomir23.undespawnable.Components.DESPAWN_TIME_COMPONENT
import me.otomir23.undespawnable.Components.ADD_DESPAWN_TIME_ENCHANTMENT_EFFECT
import me.otomir23.undespawnable.Enchantments.PERSISTENCE
import net.fabricmc.api.ModInitializer

class Undespawnable : ModInitializer {
    companion object {
        const val MOD_ID = "undespawnable"
    }

    override fun onInitialize() {
        DESPAWN_TIME_COMPONENT
        ADD_DESPAWN_TIME_ENCHANTMENT_EFFECT
        PERSISTENCE
    }
}
