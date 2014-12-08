package com.themobiusarchives.gingerbreadmod;

import com.themobiusarchives.gingerbreadmod.init.ModBlocks;
import com.themobiusarchives.gingerbreadmod.reference.Reference;

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
		
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		ModBlocks.init();
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
