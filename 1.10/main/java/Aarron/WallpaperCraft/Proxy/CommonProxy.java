package Aarron.WallpaperCraft.Proxy;

import Aarron.WallpaperCraft.Init.ModBlocks;
import Aarron.WallpaperCraft.Init.Recipies;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent event) {
		ModBlocks.init();
	}

	public void init(FMLInitializationEvent event) {
		Recipies.init();		
	}

	public void postInit(FMLPostInitializationEvent event) {
		
	}

}	