package Aarron.WallpaperCraft.Proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import Aarron.WallpaperCraft.Compatability.ChiselSupport;
import Aarron.WallpaperCraft.Init.ModBlocks;
import Aarron.WallpaperCraft.Init.Recipies;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent event) {
		ModBlocks.init();
		ChiselSupport.init();
	}

	public void init(FMLInitializationEvent event) {
		Recipies.init();		
	}

	public void postInit(FMLPostInitializationEvent event) {
		
	}

}	