package xyz.tildejustin.tntmod.mixins;

import net.minecraft.world.explosion.Explosion;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(Explosion.class)
public abstract class ExplosionMixin {
    @ModifyArg(method = "affectWorld", at = @At(value = "INVOKE", target = "Lnet/minecraft/block/Block;randomDropAsItem(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/BlockState;FI)V"), index = 3)
    private float modifyDropRate(float i) {
        return 1f;
    }
}
