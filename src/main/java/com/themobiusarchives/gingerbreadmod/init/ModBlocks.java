package com.themobiusarchives.gingerbreadmod.init;

import com.themobiusarchives.gingerbreadmod.block.BlockGM;
import com.themobiusarchives.gingerbreadmod.block.BlockLightGingerbread;
import com.themobiusarchives.gingerbreadmod.block.BlockDarkGingerbread;
import com.themobiusarchives.gingerbreadmod.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
	public static final BlockGM light_gingerbread = new BlockLightGingerbread();
	public static final BlockGM dark_gingerbread = new BlockDarkGingerbread();
	
	public static void init()
	{
		GameRegistry.registerBlock(light_gingerbread, "light_gingerbread");
		GameRegistry.registerBlock(dark_gingerbread, "dark_gingerbread");
	}
}
