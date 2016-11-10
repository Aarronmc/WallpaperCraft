package com.Aarron.WallpaperCraft.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.Aarron.WallpaperCraft.Items.ItemSolidBlock;

import cpw.mods.fml.common.registry.GameRegistry;

public final class CoreBlock {

	
	//Creating The Solid Coloured Blocks
    public static SolidRedBlocks SolidRed;
    public static SolidPurpleBlocks SolidPurple;
    public static SolidBlueBlocks SolidBlue;
    public static SolidCyanBlocks SolidCyan;
    public static SolidGreenBlocks SolidGreen;
    public static SolidYellowBlocks SolidYellow;
    public static SolidBrownBlocks SolidBrown;
    public static SolidGrayBlocks SolidGray;
    
    //Creating The Diagonally Dotted Coloured Blocks
    public static DiagonallyDottedRed DiagonallyDottedRed;
    public static DiagonallyDottedPurple DiagonallyDottedPurple;
    public static DiagonallyDottedBlue DiagonallyDottedBlue;
    public static DiagonallyDottedCyan DiagonallyDottedCyan;
    public static DiagonallyDottedGreen DiagonallyDottedGreen;
    public static DiagonallyDottedYellow DiagonallyDottedYellow;
    public static DiagonallyDottedBrown DiagonallyDottedBrown;
    public static DiagonallyDottedGray DiagonallyDottedGray;

    //Creating The Stripes Coloured Blocks
    public static StripedRed StripedRed;
    public static StripedPurple StripedPurple;
    public static StripedBlue StripedBlue;
    public static StripedCyan StripedCyan;
    public static StripedGreen StripedGreen;
    public static StripedYellow StripedYellow;
    public static StripedBrown StripedBrown;
    public static StripedGray StripedGray;
    
    //Creating The Floral Coloured Blocks
    public static FloralRed FloralRed;
    public static FloralPurple FloralPurple;
    public static FloralBlue FloralBlue;
    public static FloralCyan FloralCyan;
    public static FloralGreen FloralGreen;
    public static FloralYellow FloralYellow;
    public static FloralBrown FloralBrown;
    public static FloralGray FloralGray;
    
    //Creating The Clay Coloured Blocks
    public static ClayRed ClayRed;
    public static ClayPurple ClayPurple;
    public static ClayBlue ClayBlue;
    public static ClayCyan ClayCyan;
    public static ClayGreen ClayGreen;
    public static ClayYellow ClayYellow;
    public static ClayBrown ClayBrown;
    public static ClayGray ClayGray;
    
    //Creating The Glass Coloured Blocks
    public static GlassRed GlassRed;
    public static GlassPurple GlassPurple;
    public static GlassBlue GlassBlue;
    public static GlassCyan GlassCyan;
    public static GlassGreen GlassGreen;
    public static GlassYellow GlassYellow;
    public static GlassBrown GlassBrown;
    public static GlassGray GlassGray;
    
    
    
    
    
    
    

    //Registering The Solid Coloured Blocks
    public static final void init() {
        GameRegistry.registerBlock(SolidRed = new SolidRedBlocks("SolidRedBlocks", Material.cloth), ItemSolidBlock.class, "SolidRedBlocks");
        GameRegistry.registerBlock(SolidPurple = new SolidPurpleBlocks("SolidPurpleBlocks", Material.cloth), ItemSolidBlock.class, "SolidPurpleBlocks");
        GameRegistry.registerBlock(SolidBlue = new SolidBlueBlocks("SolidBlueBlocks", Material.cloth), ItemSolidBlock.class, "SolidBlueBlocks");
        GameRegistry.registerBlock(SolidCyan = new SolidCyanBlocks("SolidCyanBlocks", Material.cloth), ItemSolidBlock.class, "SolidCyanBlocks");
        GameRegistry.registerBlock(SolidGreen = new SolidGreenBlocks("SolidGreenBlocks", Material.cloth), ItemSolidBlock.class, "SolidGreenBlocks");
        GameRegistry.registerBlock(SolidYellow = new SolidYellowBlocks("SolidYellowBlocks", Material.cloth), ItemSolidBlock.class, "SolidYellowBlocks");
        GameRegistry.registerBlock(SolidBrown = new SolidBrownBlocks("SolidBrownBlocks", Material.cloth), ItemSolidBlock.class, "SolidBrownBlocks");
        GameRegistry.registerBlock(SolidGray = new SolidGrayBlocks("SolidGrayBlocks", Material.cloth), ItemSolidBlock.class, "SolidGrayBlocks");
        
        
        
    //Registering The Diagonally Dotted Coloured Blocks
        GameRegistry.registerBlock(DiagonallyDottedRed = new DiagonallyDottedRed("DiagonallyDottedRed", Material.cloth), ItemSolidBlock.class, "DiagonallyDottedRed");
        GameRegistry.registerBlock(DiagonallyDottedPurple = new DiagonallyDottedPurple("DiagonallyDottedPurple", Material.cloth), ItemSolidBlock.class, "DiagonallyDottedPurple");
        GameRegistry.registerBlock(DiagonallyDottedBlue = new DiagonallyDottedBlue("DiagonallyDottedBlue", Material.cloth), ItemSolidBlock.class, "DiagonallyDottedBlue");
        GameRegistry.registerBlock(DiagonallyDottedCyan = new DiagonallyDottedCyan("DiagonallyDottedCyan", Material.cloth), ItemSolidBlock.class, "DiagonallyDottedCyan");
        GameRegistry.registerBlock(DiagonallyDottedGreen = new DiagonallyDottedGreen("DiagonallyDottedGreen", Material.cloth), ItemSolidBlock.class, "DiagonallyDottedGreen");
        GameRegistry.registerBlock(DiagonallyDottedYellow = new DiagonallyDottedYellow("DiagonallyDottedYellow", Material.cloth), ItemSolidBlock.class, "DiagonallyDottedYellow");
        GameRegistry.registerBlock(DiagonallyDottedBrown = new DiagonallyDottedBrown("DiagonallyDottedBrown", Material.cloth), ItemSolidBlock.class, "DiagonallyDottedBrown");
        GameRegistry.registerBlock(DiagonallyDottedGray = new DiagonallyDottedGray("DiagonallyDottedGray", Material.cloth), ItemSolidBlock.class, "DiagonallyDottedGray");
        
        
        
      //Registering The Striped  Coloured Blocks
        GameRegistry.registerBlock(StripedRed = new StripedRed("StripedRed", Material.cloth), ItemSolidBlock.class, "StripedRed");
        GameRegistry.registerBlock(StripedPurple = new StripedPurple("StripedPurple", Material.cloth), ItemSolidBlock.class, "StripedPurple");
        GameRegistry.registerBlock(StripedBlue = new StripedBlue("StripedBlue", Material.cloth), ItemSolidBlock.class, "StripedBlue");
        GameRegistry.registerBlock(StripedCyan = new StripedCyan("StripedCyan", Material.cloth), ItemSolidBlock.class, "StripedCyan");
        GameRegistry.registerBlock(StripedGreen = new StripedGreen("StripedGreen", Material.cloth), ItemSolidBlock.class, "StripedGreen");
        GameRegistry.registerBlock(StripedYellow = new StripedYellow("StripedYellow", Material.cloth), ItemSolidBlock.class, "StripedYellow");
        GameRegistry.registerBlock(StripedBrown = new StripedBrown("StripedBrown", Material.cloth), ItemSolidBlock.class, "StripedBrown");
        GameRegistry.registerBlock(StripedGray = new StripedGray("StripedGray", Material.cloth), ItemSolidBlock.class, "StripedGray");
        
        
        
		// Registering The Floral  Coloured Blocks
        GameRegistry.registerBlock(FloralRed = new FloralRed("FloralRed", Material.cloth), ItemSolidBlock.class, "FloralRed");
        GameRegistry.registerBlock(FloralPurple = new FloralPurple("FloralPurple", Material.cloth), ItemSolidBlock.class, "FloralPurple");
        GameRegistry.registerBlock(FloralBlue = new FloralBlue("FloralBlue", Material.cloth), ItemSolidBlock.class, "FloralBlue");
        GameRegistry.registerBlock(FloralCyan = new FloralCyan("FloralCyan", Material.cloth), ItemSolidBlock.class, "FloralCyan");
        GameRegistry.registerBlock(FloralGreen = new FloralGreen("FloralGreen", Material.cloth), ItemSolidBlock.class, "FloralGreen");
        GameRegistry.registerBlock(FloralYellow = new FloralYellow("FloralYellow", Material.cloth), ItemSolidBlock.class, "FloralYellow");
        GameRegistry.registerBlock(FloralBrown = new FloralBrown("FloralBrown", Material.cloth), ItemSolidBlock.class, "FloralBrown");
        GameRegistry.registerBlock(FloralGray = new FloralGray("FloralGray", Material.cloth), ItemSolidBlock.class, "FloralGray");
        
        
        
		// Registering The Clay  Coloured Blocks
        GameRegistry.registerBlock(ClayRed = new ClayRed("ClayRed", Material.cloth), ItemSolidBlock.class, "ClayRed");
        GameRegistry.registerBlock(ClayPurple = new ClayPurple("ClayPurple", Material.cloth), ItemSolidBlock.class, "ClayPurple");
        GameRegistry.registerBlock(ClayBlue = new ClayBlue("ClayBlue", Material.cloth), ItemSolidBlock.class, "ClayBlue");
        GameRegistry.registerBlock(ClayCyan = new ClayCyan("ClayCyan", Material.cloth), ItemSolidBlock.class, "ClayCyan");
        GameRegistry.registerBlock(ClayGreen = new ClayGreen("ClayGreen", Material.cloth), ItemSolidBlock.class, "ClayGreen");
        GameRegistry.registerBlock(ClayYellow = new ClayYellow("ClayYellow", Material.cloth), ItemSolidBlock.class, "ClayYellow");
        GameRegistry.registerBlock(ClayBrown = new ClayBrown("ClayBrown", Material.cloth), ItemSolidBlock.class, "ClayBrown");
        GameRegistry.registerBlock(ClayGray = new ClayGray("ClayGray", Material.cloth), ItemSolidBlock.class, "ClayGray");
        
        
        
        // Registering The Glass Coloured Blocks
        GameRegistry.registerBlock(GlassRed = new GlassRed("GlassRed", Material.glass), ItemSolidBlock.class, "GlassRed");
        GameRegistry.registerBlock(GlassPurple = new GlassPurple("GlassPurple", Material.glass), ItemSolidBlock.class, "GlassPurple");
        GameRegistry.registerBlock(GlassBlue = new GlassBlue("GlassBlue", Material.glass), ItemSolidBlock.class, "GlassBlue");
        GameRegistry.registerBlock(GlassCyan = new GlassCyan("GlassCyan", Material.glass), ItemSolidBlock.class, "GlassCyan");
        GameRegistry.registerBlock(GlassGreen = new GlassGreen("GlassGreen", Material.glass), ItemSolidBlock.class, "GlassGreen");
        GameRegistry.registerBlock(GlassYellow = new GlassYellow("GlassYellow", Material.glass), ItemSolidBlock.class, "GlassYellow");
        GameRegistry.registerBlock(GlassBrown = new GlassBrown("GlassBrown", Material.glass), ItemSolidBlock.class, "GlassBrown");
        GameRegistry.registerBlock(GlassGray = new GlassGray("GlassGray", Material.glass), ItemSolidBlock.class, "GlassGray");


      
    }
}