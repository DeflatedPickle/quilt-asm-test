package com.example.example_mod.mixin;

import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

public class EnchantmentTargetStick extends EnchantmentTargetMixin {
	@Override
	public boolean isAcceptableItem(Item item) {
		return item == Items.STICK;
	}
}

@Mixin(EnchantmentTarget.class)
abstract class EnchantmentTargetMixin {
	@Shadow
	public abstract boolean isAcceptableItem(Item item);
}
