package com.Aarron.WallpaperCraft.proxy;

import java.io.File;

import net.minecraftforge.common.MinecraftForge;

import com.Aarron.WallpaperCraft.compatibility.ChiselSupport;
import com.Aarron.WallpaperCraft.compatibility.MicroblocksSupport;
import com.Aarron.WallpaperCraft.crafting.Recipies;
import com.Aarron.WallpaperCraft.handler.ConfigHandler;
import com.Aarron.WallpaperCraft.handler.EventHandler;
import com.Aarron.WallpaperCraft.handler.PacketHandler;
import com.Aarron.WallpaperCraft.init.ModBlocks;
import com.Aarron.WallpaperCraft.init.ModItems;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;



public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
    	ModBlocks.init();
    	ModItems.registerItems();
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
    	MinecraftForge.EVENT_BUS.register(new EventHandler());
		PacketHandler.registerMessages("MetaCycle");
    	
    	}

    public void postInit(FMLPostInitializationEvent e) {

    }
}