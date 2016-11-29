package Aarron.WallpaperCraft.handler;

import net.minecraftforge.common.config.Configuration;
import Aarron.WallpaperCraft.proxy.CommonProxy;

public class ConfigHandler {
	

    private static final String MOD_INTEGRATION = "MOD INTEGRATION";
//  private static final String BLOCKS = "DISSABLE A BLOCK TYPE";


    // This values below you can access elsewhere in your mod:
    public static boolean enableChisel = true;
    public static boolean hidefromJEI = false;
    
/*	Enable once you have time to stop blocks being registered.
  
    public static boolean enableDiagonallyDotted = true;
    public static boolean enableStriped = true;
    public static boolean enableFloral = true;
    public static boolean enableClay = true;
    public static boolean enableBrick = true;
    public static boolean enableTintedGlass = true;
    public static boolean enableTexturedGlass = true;
    public static boolean enableFrostedGlass = true;
    public static boolean enableDottedCarpet_Rugs = true;
    public static boolean enableStripedCarpet_Rugs = true;
*/      

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
        cfg.addCustomCategoryComment(MOD_INTEGRATION, "These options will allow you to decide how WallpaperCraft interacts with other mods.");
        // cfg.getBoolean() will get the value in the config if it is already specified there. If not it will create the value.
        enableChisel = cfg.getBoolean("enableChisel", MOD_INTEGRATION, true, "Setting this to false will dissable Chisel integration.");
        hidefromJEI = cfg.getBoolean("hidefromJEI", MOD_INTEGRATION, false, "Setting this to true will hide all WallpaperCraft sub colours and will"
      + " only show the firstcolour option for each block(note these will still be availabvle in the creative inventory and will still be craftable).");
        
/*       
        cfg.addCustomCategoryComment(BLOCKS, "These options will allow you to remove any of the WallpaperCraft blocks from the game");
        enableDiagonallyDotted = cfg.getBoolean("enableDiagonallyDotted", BLOCKS, true, "Enable Diagonally Dotted block types?");
        enableStriped = cfg.getBoolean("enableStriped", BLOCKS, true, "Enable Striped block types?");
        enableFloral = cfg.getBoolean("enableFloral", BLOCKS, true, "Enable Floral block types?");
        enableClay = cfg.getBoolean("enableClay", BLOCKS, true, "Enable Clay block types?");
        enableBrick = cfg.getBoolean("enableBrick", BLOCKS, true, "Enable Brick block types?");
        enableTintedGlass = cfg.getBoolean("enableTintedGlass", BLOCKS, true, "Enable Tinted Glass block type?");
        enableTexturedGlass = cfg.getBoolean("enableTexturedGlass", BLOCKS, true, "Enable Textured Glass block type?");
        enableFrostedGlass = cfg.getBoolean("enableFrostedGlass", BLOCKS, true, "Enable Frosted Glass block type?");
        enableDottedCarpet_Rugs = cfg.getBoolean("enableDottedCarpet&Rugs", BLOCKS, true, "Enable Dotted Carpet & Rug block type?");
        enableStripedCarpet_Rugs = cfg.getBoolean("enableStripedCarpet&Rugs", BLOCKS, true, "Enable Striped Carpet & Rug block type?");
*/        
       
    }


}
