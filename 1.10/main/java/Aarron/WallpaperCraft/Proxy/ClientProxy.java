package Aarron.WallpaperCraft.Proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import Aarron.WallpaperCraft.Init.ModBlocks;

public class ClientProxy extends CommonProxy{

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
		
		ModBlocks.initModels();
		}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
	}

	@Override
	public void postInit(FMLPostInitializationEvent event) {
		super.postInit(event);
	}

}	