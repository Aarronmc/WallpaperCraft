package Aarron.WallpaperCraft.proxy;

import java.io.File;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import Aarron.WallpaperCraft.compatability.ChiselSupport;
import Aarron.WallpaperCraft.handler.ConfigHandler;
import Aarron.WallpaperCraft.handler.EventHandler;
import Aarron.WallpaperCraft.handler.PacketHandler;
import Aarron.WallpaperCraft.init.ModBlocks;
import Aarron.WallpaperCraft.init.ModItems;
import Aarron.WallpaperCraft.recipes.Recipies;

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
	    
	//    if (ConfigHandler.enableForestry == true){
    //		if (Loader.isModLoaded("forestry")){
    //			ChiselSupport.init();}
    //    else System.out.print("Install Chisel and set 'enableChisel' to true in the WallpaperCraft config file to enable Chisel intergration ");    			   		
    //		}
				
		ModBlocks.init();
		ModItems.init();
	}

	public void init(FMLInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(new EventHandler());
		PacketHandler.registerMessages("MetaCycle");
		Recipies.init();
				

	}

	public void postInit(FMLPostInitializationEvent event) {
        if (config.hasChanged()) {
            config.save();
        }
		
	}

}	