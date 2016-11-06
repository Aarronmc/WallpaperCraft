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
    public static SolidBrownBlocks SolidBrown;
    public static SolidCyanBlocks SolidCyan;
    public static SolidGreenBlocks SolidGreen;
    public static SolidYellowBlocks SolidYellow;
    public static SolidGrayBlocks SolidGray;
    
    //Creating The Diagonally Dotted Coloured Blocks
    public static DiagonallyDottedRed DiagonallyDottedRed;
    public static DiagonallyDottedBlue DiagonallyDottedBlue;
    public static DiagonallyDottedPurple DiagonallyDottedPurple;
    public static DiagonallyDottedBrown DiagonallyDottedBrown;
    public static DiagonallyDottedCyan DiagonallyDottedCyan;
    public static DiagonallyDottedGreen DiagonallyDottedGreen;
    public static DiagonallyDottedYellow DiagonallyDottedYellow;
    public static DiagonallyDottedGray DiagonallyDottedGray;

    //Creating The Stripes Coloured Blocks
    public static StripesRed StripesRed;
    public static StripesBlue StripesBlue;
    public static StripesPurple StripesPurple;
    public static StripesBrown StripesBrown;
    public static StripesCyan StripesCyan;
    public static StripesGreen StripesGreen;
    public static StripesYellow StripesYellow;
    public static StripesGray StripesGray;
    
    //Creating The Floral Coloured Blocks
    public static FloralRed FloralRed;
    public static FloralBlue FloralBlue;
    public static FloralPurple FloralPurple;
    public static FloralBrown FloralBrown;
    public static FloralCyan FloralCyan;
    public static FloralGreen FloralGreen;
    public static FloralYellow FloralYellow;
    public static FloralGray FloralGray;
    
    //Creating The Clay Coloured Blocks
    public static ClayRed ClayRed;
    public static ClayBlue ClayBlue;
    public static ClayPurple ClayPurple;
    public static ClayBrown ClayBrown;
    public static ClayCyan ClayCyan;
    public static ClayGreen ClayGreen;
    public static ClayYellow ClayYellow;
    public static ClayGray ClayGray;
    
    
    
    
    
    

    //Registering The Solid Coloured Blocks
    public static final void init() {
        GameRegistry.registerBlock(SolidRed = new SolidRedBlocks("SolidRedBlocks", Material.cloth), ItemSolidBlock.class, "SolidRedBlocks");
        GameRegistry.registerBlock(SolidPurple = new SolidPurpleBlocks("SolidPurpleBlocks", Material.cloth), ItemSolidBlock.class, "SolidPurpleBlocks");
        GameRegistry.registerBlock(SolidBlue = new SolidBlueBlocks("SolidBlueBlocks", Material.cloth), ItemSolidBlock.class, "SolidBlueBlocks");
        GameRegistry.registerBlock(SolidBrown = new SolidBrownBlocks("SolidBrownBlocks", Material.cloth), ItemSolidBlock.class, "SolidBrownBlocks");
        GameRegistry.registerBlock(SolidCyan = new SolidCyanBlocks("SolidCyanBlocks", Material.cloth), ItemSolidBlock.class, "SolidCyanBlocks");
        GameRegistry.registerBlock(SolidGreen = new SolidGreenBlocks("SolidGreenBlocks", Material.cloth), ItemSolidBlock.class, "SolidGreenBlocks");
        GameRegistry.registerBlock(SolidYellow = new SolidYellowBlocks("SolidYellowBlocks", Material.cloth), ItemSolidBlock.class, "SolidYellowBlocks");
        GameRegistry.registerBlock(SolidGray = new SolidGrayBlocks("SolidGrayBlocks", Material.cloth), ItemSolidBlock.class, "SolidGrayBlocks");
        
        
        
    //Registering The Diagonally Dotted Coloured Blocks
        GameRegistry.registerBlock(DiagonallyDottedRed = new DiagonallyDottedRed("DiagonallyDottedRed", Material.cloth), ItemSolidBlock.class, "DiagonallyDottedRed");
        GameRegistry.registerBlock(DiagonallyDottedPurple = new DiagonallyDottedPurple("DiagonallyDottedPurple", Material.cloth), ItemSolidBlock.class, "DiagonallyDottedPurple");
        GameRegistry.registerBlock(DiagonallyDottedBlue = new DiagonallyDottedBlue("DiagonallyDottedBlue", Material.cloth), ItemSolidBlock.class, "DiagonallyDottedBlue");
        GameRegistry.registerBlock(DiagonallyDottedBrown = new DiagonallyDottedBrown("DiagonallyDottedBrown", Material.cloth), ItemSolidBlock.class, "DiagonallyDottedBrown");
        GameRegistry.registerBlock(DiagonallyDottedCyan = new DiagonallyDottedCyan("DiagonallyDottedCyan", Material.cloth), ItemSolidBlock.class, "DiagonallyDottedCyan");
        GameRegistry.registerBlock(DiagonallyDottedGreen = new DiagonallyDottedGreen("DiagonallyDottedGreen", Material.cloth), ItemSolidBlock.class, "DiagonallyDottedGreen");
        GameRegistry.registerBlock(DiagonallyDottedYellow = new DiagonallyDottedYellow("DiagonallyDottedYellow", Material.cloth), ItemSolidBlock.class, "DiagonallyDottedYellow");
        GameRegistry.registerBlock(DiagonallyDottedGray = new DiagonallyDottedGray("DiagonallyDottedGray", Material.cloth), ItemSolidBlock.class, "DiagonallyDottedGray");
        
        
        
      //Registering The Stripes  Coloured Blocks
        GameRegistry.registerBlock(StripesRed = new StripesRed("StripesRed", Material.cloth), ItemSolidBlock.class, "StripesRed");
        GameRegistry.registerBlock(StripesBlue = new StripesBlue("StripesBlue", Material.cloth), ItemSolidBlock.class, "StripesBlue");
        GameRegistry.registerBlock(StripesPurple = new StripesPurple("StripesPurple", Material.cloth), ItemSolidBlock.class, "StripesPurple");
        GameRegistry.registerBlock(StripesBrown = new StripesBrown("StripesBrown", Material.cloth), ItemSolidBlock.class, "StripesBrown");
        GameRegistry.registerBlock(StripesCyan = new StripesCyan("StripesCyan", Material.cloth), ItemSolidBlock.class, "StripesCyan");
        GameRegistry.registerBlock(StripesGreen = new StripesGreen("StripesGreen", Material.cloth), ItemSolidBlock.class, "StripesGreen");
        GameRegistry.registerBlock(StripesYellow = new StripesYellow("StripesYellow", Material.cloth), ItemSolidBlock.class, "StripesYellow");
        GameRegistry.registerBlock(StripesGray = new StripesGray("StripesGray", Material.cloth), ItemSolidBlock.class, "StripesGray");
        
        
        
		// Registering The Floral  Coloured Blocks
        GameRegistry.registerBlock(FloralRed = new FloralRed("FloralRed", Material.cloth), ItemSolidBlock.class, "FloralRed");
        GameRegistry.registerBlock(FloralBlue = new FloralBlue("FloralBlue", Material.cloth), ItemSolidBlock.class, "FloralBlue");
        GameRegistry.registerBlock(FloralPurple = new FloralPurple("FloralPurple", Material.cloth), ItemSolidBlock.class, "FloralPurple");
        GameRegistry.registerBlock(FloralBrown = new FloralBrown("FloralBrown", Material.cloth), ItemSolidBlock.class, "FloralBrown");
        GameRegistry.registerBlock(FloralCyan = new FloralCyan("FloralCyan", Material.cloth), ItemSolidBlock.class, "FloralCyan");
        GameRegistry.registerBlock(FloralGreen = new FloralGreen("FloralGreen", Material.cloth), ItemSolidBlock.class, "FloralGreen");
        GameRegistry.registerBlock(FloralYellow = new FloralYellow("FloralYellow", Material.cloth), ItemSolidBlock.class, "FloralYellow");
        GameRegistry.registerBlock(FloralGray = new FloralGray("FloralGray", Material.cloth), ItemSolidBlock.class, "FloralGray");
        
        
        
		// Registering The Clay  Coloured Blocks
        GameRegistry.registerBlock(ClayRed = new ClayRed("ClayRed", Material.cloth), ItemSolidBlock.class, "ClayRed");
        GameRegistry.registerBlock(ClayBlue = new ClayBlue("ClayBlue", Material.cloth), ItemSolidBlock.class, "ClayBlue");
        GameRegistry.registerBlock(ClayPurple = new ClayPurple("ClayPurple", Material.cloth), ItemSolidBlock.class, "ClayPurple");
        GameRegistry.registerBlock(ClayBrown = new ClayBrown("ClayBrown", Material.cloth), ItemSolidBlock.class, "ClayBrown");
        GameRegistry.registerBlock(ClayCyan = new ClayCyan("ClayCyan", Material.cloth), ItemSolidBlock.class, "ClayCyan");
        GameRegistry.registerBlock(ClayGreen = new ClayGreen("ClayGreen", Material.cloth), ItemSolidBlock.class, "ClayGreen");
        GameRegistry.registerBlock(ClayYellow = new ClayYellow("ClayYellow", Material.cloth), ItemSolidBlock.class, "ClayYellow");
        GameRegistry.registerBlock(ClayGray = new ClayGray("ClayGray", Material.cloth), ItemSolidBlock.class, "ClayGray");


      
    }
}