package me.otomir23.undespawnable.mixin;

import me.otomir23.undespawnable.AddDespawnTimeEnchantmentEffect;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import me.otomir23.undespawnable.Components;

@Mixin(ItemEntity.class)
public abstract class ItemEntityAgeInit {
    @Shadow @Final private static int DESPAWN_AGE;

    @Accessor("itemAge")
    public abstract void setItemAge(int itemAge);

    @Inject(method = "<init>(Lnet/minecraft/world/World;DDDLnet/minecraft/item/ItemStack;DDD)V", at = @At("TAIL"))
    public void overrideAge(World world, double x, double y, double z, ItemStack stack, double velocityX, double velocityY, double velocityZ, CallbackInfo ci){
        if(world.isClient())
            return;
        var despawnTime = stack.getOrDefault(Components.INSTANCE.DESPAWN_TIME_COMPONENT(), DESPAWN_AGE + AddDespawnTimeEnchantmentEffect.Companion.getDespawnTimeBonus(stack));
        setItemAge(DESPAWN_AGE - despawnTime);
    }
}
