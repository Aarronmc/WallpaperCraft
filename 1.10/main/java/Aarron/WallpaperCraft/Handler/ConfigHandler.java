package Aarron.WallpaperCraft.Handler;

import Aarron.WallpaperCraft.Proxy.CommonProxy;
import net.minecraftforge.common.config.Configuration;

public class ConfigHandler {
	

    private static final String MOD_INTEGRATION = "MOD INTEGRATION";


    // This values below you can access elsewhere in your mod:
    public static boolean enableChisel = true;
    public static boolean hidefromJEI = false;

    // Call this from CommonProxy.preInit(). It will create our config if it doesn't
    // exist yet and read the values if it does exist.
    public static void readConfig() {
        Configuration cfg = CommonProxy.config;
        try {
            cfg.load();
            initGeneralConfig(cfg);
        } finally {
            if (cfg.hasChanged()) {
                cfg.save();
            }
        }
    }

    private static void initGeneralConfig(Configuration cfg) {
        cfg.addCustomCategoryComment(MOD_INTEGRATION, "These options will alow you to decide how WallpaperCraft interacts with other mods.");
        // cfg.getBoolean() will get the value in the config if it is already specified there. If not it will create the value.
        enableChisel = cfg.getBoolean("enableChisel", MOD_INTEGRATION, true, "Setting this to false will dissable Chisel integration.");
        hidefromJEI = cfg.getBoolean("hidefromJEI", MOD_INTEGRATION, false, "Setting this to true will hide all WallpaperCraft sub colours and will only show the first colour option for each block(note these will still be availabvle in the creative inventory and will still be craftable).");
    }


}
