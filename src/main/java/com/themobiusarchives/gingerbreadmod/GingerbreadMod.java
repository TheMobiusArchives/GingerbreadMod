package com.themobiusarchives.gingerbreadmod;

import com.themobiusarchives.gingerbreadmod.init.ModBlocks;
import com.themobiusarchives.gingerbreadmod.init.Recipes;
import com.themobiusarchives.gingerbreadmod.reference.Reference;
import com.themobiusarchives.gingerbreadmod.util.LogHelper;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class GingerbreadMod {
	
	@Mod.Instance("GingerbreadMod")
	public static GingerbreadMod instance;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ModBlocks.init();
		LogHelper.info("Pre-initializaiton complete!");
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		Recipes.init();
		LogHelper.info("Initializaiton complete!");
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		LogHelper.info("Post-initializaiton complete!");
	}
}
