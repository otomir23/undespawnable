package me.otomir23.undespawnable

import com.mojang.serialization.Codec
import me.otomir23.undespawnable.Undespawnable.Companion.MOD_ID
import net.minecraft.component.ComponentType
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier

object Components {
    @get:JvmName("DESPAWN_TIME_COMPONENT")
    val DESPAWN_TIME_COMPONENT: ComponentType<Int> = Registry.register(
        Registries.DATA_COMPONENT_TYPE,
        Identifier.of(MOD_ID, "despawn_time"),
        ComponentType.builder<Int>().codec(Codec.INT).build()
    )

    val ADD_DESPAWN_TIME_ENCHANTMENT_EFFECT = Registry.register(
        Registries.ENCHANTMENT_EFFECT_COMPONENT_TYPE,
        Identifier.of(MOD_ID, "add_despawn_time"),
        ComponentType.builder<List<AddDespawnTimeEnchantmentEffect>>().codec(
            AddDespawnTimeEnchantmentEffect.CODEC.codec().listOf()
        ).build()
    )
}