package Aarron.WallpaperCraft.Proxy;

import java.io.File;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import Aarron.WallpaperCraft.Compatability.ChiselSupport;
import Aarron.WallpaperCraft.Init.ModBlocks;
import Aarron.WallpaperCraft.Init.Recipies;
import Aarron.WallpaperCraft.Handler.ConfigHandler;

public class CommonProxy {
	
	public static Configuration config;

	public void preInit(FMLPreInitializationEvent event) {
	       File directory = event.getModConfigurationDirectory();
	        config = new Configuration(new File(directory.getPath(), "WallpaperCraft.cfg"));
	        ConfigHandler.readConfig();
	        
	    	if (ConfigHandler.enableChisel == true){
	    		if (Loader.isModLoaded("chisel")){
	    			ChiselSupport.init();}
	        else System.out.print("Install Chisel and set 'enableChisel' to true in the WallpaperCraft config file to enable Chisel intergration ");    			   		
	    		}
				
		ModBlocks.init();
	}

	public void init(FMLInitializationEvent event) {
		Recipies.init();		
	}

	public void postInit(FMLPostInitializationEvent event) {
        if (config.hasChanged()) {
            config.save();
        }
		
	}

}	