package me.otomir23.undespawnable

import me.otomir23.undespawnable.Undespawnable.Companion.MOD_ID
import net.minecraft.registry.RegistryKey
import net.minecraft.registry.RegistryKeys
import net.minecraft.util.Identifier

object Enchantments {
    val PERSISTENCE = RegistryKey.of(RegistryKeys.ENCHANTMENT, Identifier.of(MOD_ID, "persistence"))
}