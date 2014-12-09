package com.themobiusarchives.gingerbreadmod.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes
{
	public static void init()
	{
		GameRegistry.addRecipe(new ItemStack(ModBlocks.light_gingerbread), "ses", "sws", "ses",
				'e', new ItemStack(Items.egg),
				's', new ItemStack(Items.sugar),
				'w', new ItemStack(Items.wheat));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.dark_gingerbread), "ses", "cwc", "ses",
				'e', new ItemStack(Items.egg),
				's', new ItemStack(Items.sugar),
				'w', new ItemStack(Items.wheat),
				'c', new ItemStack(Items.dye, 1, 3));
	}
}
