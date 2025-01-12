package me.otomir23.undespawnable

import com.mojang.serialization.MapCodec
import com.mojang.serialization.codecs.RecordCodecBuilder
import net.minecraft.component.DataComponentTypes
import net.minecraft.component.type.ItemEnchantmentsComponent
import net.minecraft.enchantment.EnchantmentLevelBasedValue
import net.minecraft.item.ItemStack

@JvmRecord
data class AddDespawnTimeEnchantmentEffect(val amount: EnchantmentLevelBasedValue) {
    companion object {
        fun getDespawnTimeBonus(stack: ItemStack): Int {
            val enchantments = stack.getOrDefault(
                DataComponentTypes.ENCHANTMENTS,
                ItemEnchantmentsComponent.DEFAULT
            )
            val time = enchantments.enchantmentEntries.sumOf {
                it.key.value().getEffect(Components.ADD_DESPAWN_TIME_ENCHANTMENT_EFFECT).sumOf { e ->
                    e.amount.getValue(it.intValue).toInt()
                }
            }
            return time
        }

        val CODEC: MapCodec<AddDespawnTimeEnchantmentEffect> = RecordCodecBuilder.mapCodec { instance ->
            instance.group(
                EnchantmentLevelBasedValue.CODEC.fieldOf("amount").forGetter { it.amount },
            ).apply(
                instance
            ) { AddDespawnTimeEnchantmentEffect(it) }
        }
    }
}