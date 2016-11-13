package com.Aarron.WallpaperCraft.Handler;

import java.io.File;

import com.Aarron.WallpaperCraft.Main;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

public class ConfigHandler {
	

    // Main config
    public static boolean enableChisel = true;
    public static boolean enableMicroblocks = true;
 

    public static Configuration config;



    public static void init(File configFile)
    {

        // Create configuration object from config file
        if (config == null) {
            config = new Configuration(configFile);
            loadConfig();
        }

    }



    private static void loadConfig()
    {
        // Load properties
    	enableChisel = config.getBoolean("enableChisel", Configuration.CATEGORY_GENERAL, true, "Setting this to false will dissable Chisel integration.");
    	enableMicroblocks = config.getBoolean("enableMicroblocks", Configuration.CATEGORY_GENERAL, true, "Setting this to false will dissable Forge Microblocks integration.");

        // saving the configuration to its file
        if (config.hasChanged()) {
            config.save();
        }
    }



    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(Main.MODID)) {
            // Resync config
            loadConfig();
        }
    }

}