package com.example.example_mod;

import com.chocohead.mm.api.ClassTinkerers;
import net.fabricmc.loader.FabricLoader;
import org.quiltmc.loader.api.QuiltLoader;

public class ExampleEarlyRiser implements Runnable {
	@Override
	public void run() {
		var remapper = QuiltLoader.getMappingResolver();

		String enchantmentTarget = remapper.mapClassName("intermediary", "net.minecraft.class_1886");
		ClassTinkerers.enumBuilder(enchantmentTarget)
			.addEnumSubclass("STICK", "com.example.example_mod.mixin.EnchantmentTargetStick")
			.build();
	}
}
