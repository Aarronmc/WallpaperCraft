package com.Aarron.WallpaperCraft.Proxy;

import java.io.File;
import com.Aarron.WallpaperCraft.Blocks.CoreBlock;
import com.Aarron.WallpaperCraft.Compatibility.ChiselSupport;
import com.Aarron.WallpaperCraft.Compatibility.MicroblocksSupport;
import com.Aarron.WallpaperCraft.Crafting.Recipies;
import com.Aarron.WallpaperCraft.Handler.ConfigHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;



public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
    	CoreBlock.init();
        ConfigHandler.init(e.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigHandler());

    }

    public void init(FMLInitializationEvent e) {
    	Recipies.init();
    	
    	if (ConfigHandler.enableChisel == true){
    		if (Loader.isModLoaded("chisel")){
    			ChiselSupport.init();}
        else System.out.print("Install Chisel and set 'enableChisel' to true in the WallpaperCraft config file to enable Chisel intergration ");    			   		
    		}

    	if (ConfigHandler.enableMicroblocks == true){
    		if (Loader.isModLoaded("ForgeMicroblock")){
    			MicroblocksSupport.init();}
    	else System.out.print("Install Forge Microblocks and set 'enableMicroblocks' to true in the WallpaperCraft config file to enable Forge Microblocks intergration ");
    		}
    	
    	}

    public void postInit(FMLPostInitializationEvent e) {

    }
}