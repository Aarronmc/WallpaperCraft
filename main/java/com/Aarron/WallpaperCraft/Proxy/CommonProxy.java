package com.Aarron.WallpaperCraft.Proxy;

import com.Aarron.WallpaperCraft.Main;
import com.Aarron.WallpaperCraft.Blocks.CoreBlock;
import com.Aarron.WallpaperCraft.Crafting.Recipies;


import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.EventBus;
import cpw.mods.fml.common.network.FMLEventChannel;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
    	CoreBlock.init();
    	

    }

    public void init(FMLInitializationEvent e) {
    	Recipies.init();

    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}