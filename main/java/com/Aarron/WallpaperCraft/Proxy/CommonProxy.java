package com.Aarron.WallpaperCraft.Proxy;

import com.Aarron.WallpaperCraft.Blocks.CoreBlock;
import com.Aarron.WallpaperCraft.Compatibility.MicroblocksSupport;
import com.Aarron.WallpaperCraft.Crafting.Recipies;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
    	CoreBlock.init();
    	

    }

    public void init(FMLInitializationEvent e) {
    	Recipies.init();
    	
    	if (Loader.isModLoaded("ForgeMicroblock")){
    		MicroblocksSupport.init();}
    	else System.out.print("Forge Micro blocks not detected");
    	
    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}