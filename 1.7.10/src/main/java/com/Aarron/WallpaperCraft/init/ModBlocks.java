package com.Aarron.WallpaperCraft.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import com.Aarron.WallpaperCraft.blocks.bricks.*;
import com.Aarron.WallpaperCraft.blocks.carpet.*;
import com.Aarron.WallpaperCraft.blocks.clay.*;
import com.Aarron.WallpaperCraft.blocks.damask.*;
import com.Aarron.WallpaperCraft.blocks.dotted.*;
import com.Aarron.WallpaperCraft.blocks.floral.*;
import com.Aarron.WallpaperCraft.blocks.glass.*;
import com.Aarron.WallpaperCraft.blocks.glass.panes.*;
import com.Aarron.WallpaperCraft.blocks.jewel.Jewel;
import com.Aarron.WallpaperCraft.blocks.lamps.*;
import com.Aarron.WallpaperCraft.blocks.planks.*;
import com.Aarron.WallpaperCraft.blocks.rippled.*;
import com.Aarron.WallpaperCraft.blocks.solid.*;
import com.Aarron.WallpaperCraft.blocks.stamp.Stamp;
import com.Aarron.WallpaperCraft.blocks.striped.*;
import com.Aarron.WallpaperCraft.blocks.wool.*;
import com.Aarron.WallpaperCraft.blocks.fancytiles.*;
import com.Aarron.WallpaperCraft.creativeTab.Tab;
import com.Aarron.WallpaperCraft.handler.ConfigHandler;
import com.Aarron.WallpaperCraft.items.ItemSolidBlock;
import com.Aarron.WallpaperCraft.items.ItemSolidBlock2;
import com.Aarron.WallpaperCraft.items.ItemSolidBlock3;
import com.Aarron.WallpaperCraft.blocks.pane;

import cpw.mods.fml.common.registry.GameRegistry;

public final class ModBlocks {

	
	//Creating The Solid Blocks
    public static SolidRedBlocks SolidRed;
    public static SolidPurpleBlocks SolidPurple;
    public static SolidBlueBlocks SolidBlue;
    public static SolidCyanBlocks SolidCyan;
    public static SolidGreenBlocks SolidGreen;
    public static SolidYellowBlocks SolidYellow;
    public static SolidBrownBlocks SolidBrown;
    public static SolidGrayBlocks SolidGray;
    
    //Creating The Diagonally Dotted Blocks
    public static DiagonallyDottedRed DiagonallyDottedRed;
    public static DiagonallyDottedPurple DiagonallyDottedPurple;
    public static DiagonallyDottedBlue DiagonallyDottedBlue;
    public static DiagonallyDottedCyan DiagonallyDottedCyan;
    public static DiagonallyDottedGreen DiagonallyDottedGreen;
    public static DiagonallyDottedYellow DiagonallyDottedYellow;
    public static DiagonallyDottedBrown DiagonallyDottedBrown;
    public static DiagonallyDottedGray DiagonallyDottedGray;
        
    //Creating The Diagonally Dotted Blocks
    public static DottedRed DottedRed;
    public static DottedPurple DottedPurple;
    public static DottedBlue DottedBlue;
    public static DottedCyan DottedCyan;
    public static DottedGreen DottedGreen;
    public static DottedYellow DottedYellow;
    public static DottedBrown DottedBrown;
    public static DottedGray DottedGray;

    //Creating The Striped Blocks
    public static StripedRed StripedRed;
    public static StripedPurple StripedPurple;
    public static StripedBlue StripedBlue;
    public static StripedCyan StripedCyan;
    public static StripedGreen StripedGreen;
    public static StripedYellow StripedYellow;
    public static StripedBrown StripedBrown;
    public static StripedGray StripedGray;
    
    //Creating The Floral Blocks
    public static FloralRed FloralRed;
    public static FloralPurple FloralPurple;
    public static FloralBlue FloralBlue;
    public static FloralCyan FloralCyan;
    public static FloralGreen FloralGreen;
    public static FloralYellow FloralYellow;
    public static FloralBrown FloralBrown;
    public static FloralGray FloralGray;
    
    //Creating The Damask Blocks
    public static DamaskRed DamaskRed;
    public static DamaskPurple DamaskPurple;
    public static DamaskBlue DamaskBlue;
    public static DamaskCyan DamaskCyan;
    public static DamaskGreen DamaskGreen;
    public static DamaskYellow DamaskYellow;
    public static DamaskBrown DamaskBrown;
    public static DamaskGray DamaskGray;
    
    //Creating The Clay Blocks
    public static ClayRed ClayRed;
    public static ClayPurple ClayPurple;
    public static ClayBlue ClayBlue;
    public static ClayCyan ClayCyan;
    public static ClayGreen ClayGreen;
    public static ClayYellow ClayYellow;
    public static ClayBrown ClayBrown;
    public static ClayGray ClayGray;
    
    //Creating The Brick Blocks
    public static BrickRed BrickRed;
    public static BrickPurple BrickPurple;
    public static BrickBlue BrickBlue;
    public static BrickCyan BrickCyan;
    public static BrickGreen BrickGreen;
    public static BrickYellow BrickYellow;
    public static BrickBrown BrickBrown;
    public static BrickGray BrickGray;
    
    //Creating The Stone Brick Blocks
    public static StoneBrickRed StoneBrickRed;
    public static StoneBrickPurple StoneBrickPurple;
    public static StoneBrickBlue StoneBrickBlue;
    public static StoneBrickCyan StoneBrickCyan;
    public static StoneBrickGreen StoneBrickGreen;
    public static StoneBrickYellow StoneBrickYellow;
    public static StoneBrickBrown StoneBrickBrown;
    public static StoneBrickGray StoneBrickGray;
    
    //Creating The Stone Brick Blocks
    public static StoneLampRed StoneLampRed;
    public static StoneLampPurple StoneLampPurple;
    public static StoneLampBlue StoneLampBlue;
    public static StoneLampCyan StoneLampCyan;
    public static StoneLampGreen StoneLampGreen;
    public static StoneLampYellow StoneLampYellow;
    public static StoneLampBrown StoneLampBrown;
    public static StoneLampGray StoneLampGray;
          
    //Creating The Rippled Blocks
    public static RippledRed RippledRed;
    public static RippledPurple RippledPurple;
    public static RippledBlue RippledBlue;
    public static RippledCyan RippledCyan;
    public static RippledGreen RippledGreen;
    public static RippledYellow RippledYellow;
    public static RippledBrown RippledBrown;
    public static RippledGray RippledGray;
    
    //Creating The Fancy Tiles
    public static FancyTilesRed FancyTilesRed;
    public static FancyTilesPurple FancyTilesPurple;
    public static FancyTilesBlue FancyTilesBlue;
    public static FancyTilesCyan FancyTilesCyan;
    public static FancyTilesGreen FancyTilesGreen;
    public static FancyTilesYellow FancyTilesYellow;
    public static FancyTilesBrown FancyTilesBrown;
    public static FancyTilesGray FancyTilesGray;
    
    //Creating the Stamp Pattern blocks
    public static Stamp Stamp;
    
    //Creating the Jewel Pattern blocks
    public static Jewel Jewel;
    
    //Creating The Wooden Planks
    public static WoodPlankRed WoodPlankRed;
    public static WoodPlankPurple WoodPlankPurple;
    public static WoodPlankBlue WoodPlankBlue;
    public static WoodPlankCyan WoodPlankCyan;
    public static WoodPlankGreen WoodPlankGreen;
    public static WoodPlankYellow WoodPlankYellow;
    public static WoodPlankBrown WoodPlankBrown;
    public static WoodPlankGray WoodPlankGray;
    
    //Creating The Wool Blocks
    public static WoolRed WoolRed;
    public static WoolPurple WoolPurple;
    public static WoolBlue WoolBlue;
    public static WoolCyan WoolCyan;
    public static WoolGreen WoolGreen;
    public static WoolYellow WoolYellow;
    public static WoolBrown WoolBrown;
    public static WoolGray WoolGray;
        
    //Creating The Checkered Wool Blocks
    public static CheckeredWoolRed CheckeredWoolRed;
    public static CheckeredWoolPurple CheckeredWoolPurple;
    public static CheckeredWoolBlue CheckeredWoolBlue;
    public static CheckeredWoolCyan CheckeredWoolCyan;
    public static CheckeredWoolGreen CheckeredWoolGreen;
    public static CheckeredWoolYellow CheckeredWoolYellow;
    public static CheckeredWoolBrown CheckeredWoolBrown;
    public static CheckeredWoolGray CheckeredWoolGray;
    
    //Creating The Aura Lamps 
    public static AuraLampRed AuraLampRed;
    public static AuraLampPurple AuraLampPurple;
    public static AuraLampBlue AuraLampBlue;
    public static AuraLampCyan AuraLampCyan;
    public static AuraLampGreen AuraLampGreen;
    public static AuraLampYellow AuraLampYellow;
    public static AuraLampBrown AuraLampBrown;
    public static AuraLampGray AuraLampGray;
        
    //Creating The Tinted Glass Blocks
    public static TintedGlassRed TintedGlassRed;
    public static TintedGlassPurple TintedGlassPurple;
    public static TintedGlassBlue TintedGlassBlue;
    public static TintedGlassCyan TintedGlassCyan;
    public static TintedGlassGreen TintedGlassGreen;
    public static TintedGlassYellow TintedGlassYellow;
    public static TintedGlassBrown TintedGlassBrown;
    public static TintedGlassGray TintedGlassGray;
    
    //Creating The Textured Glass Blocks
    public static TexturedGlassRed TexturedGlassRed;
    public static TexturedGlassPurple TexturedGlassPurple;
    public static TexturedGlassBlue TexturedGlassBlue;
    public static TexturedGlassCyan TexturedGlassCyan;
    public static TexturedGlassGreen TexturedGlassGreen;
    public static TexturedGlassYellow TexturedGlassYellow;
    public static TexturedGlassBrown TexturedGlassBrown;
    public static TexturedGlassGray TexturedGlassGray;
    
    //Creating The Frosted Glass Blocks
    public static FrostedGlassRed FrostedGlassRed;
    public static FrostedGlassPurple FrostedGlassPurple;
    public static FrostedGlassBlue FrostedGlassBlue;
    public static FrostedGlassCyan FrostedGlassCyan;
    public static FrostedGlassGreen FrostedGlassGreen;
    public static FrostedGlassYellow FrostedGlassYellow;
    public static FrostedGlassBrown FrostedGlassBrown;
    public static FrostedGlassGray FrostedGlassGray;
    
    //Creating The Tinted Glass Panes
    public static TintedPaneRed TintedPaneRed;
    public static TintedPanePurple TintedPanePurple;
    public static TintedPaneBlue TintedPaneBlue;
    public static TintedPaneCyan TintedPaneCyan;
    public static TintedPaneGreen TintedPaneGreen;
    public static TintedPaneYellow TintedPaneYellow;
    public static TintedPaneBrown TintedPaneBrown;
    public static TintedPaneGray TintedPaneGray;
    
    //Creating The Textured Glass Panes
    public static TexturedPaneRed TexturedPaneRed;
    public static TexturedPanePurple TexturedPanePurple;
    public static TexturedPaneBlue TexturedPaneBlue;
    public static TexturedPaneCyan TexturedPaneCyan;
    public static TexturedPaneGreen TexturedPaneGreen;
    public static TexturedPaneYellow TexturedPaneYellow;
    public static TexturedPaneBrown TexturedPaneBrown;
    public static TexturedPaneGray TexturedPaneGray;
    
    //Creating The Tinted Glass Panes
    public static FrostedPaneRed FrostedPaneRed;
    public static FrostedPanePurple FrostedPanePurple;
    public static FrostedPaneBlue FrostedPaneBlue;
    public static FrostedPaneCyan FrostedPaneCyan;
    public static FrostedPaneGreen FrostedPaneGreen;
    public static FrostedPaneYellow FrostedPaneYellow;
    public static FrostedPaneBrown FrostedPaneBrown;
    public static FrostedPaneGray FrostedPaneGray;
    
    //Creating The Wool Carpets
    public static WoolCarpetRed WoolCarpetRed;
    public static WoolCarpetPurple WoolCarpetPurple;
    public static WoolCarpetBlue WoolCarpetBlue;
    public static WoolCarpetCyan WoolCarpetCyan;
    public static WoolCarpetGreen WoolCarpetGreen;
    public static WoolCarpetYellow WoolCarpetYellow;
    public static WoolCarpetBrown WoolCarpetBrown;
    public static WoolCarpetGray WoolCarpetGray;
    
    //Creating The Dotted Carpets
    public static CheckeredCarpetRed CheckeredCarpetRed;
    public static CheckeredCarpetPurple CheckeredCarpetPurple;
    public static CheckeredCarpetBlue CheckeredCarpetBlue;
    public static CheckeredCarpetCyan CheckeredCarpetCyan;
    public static CheckeredCarpetGreen CheckeredCarpetGreen;
    public static CheckeredCarpetYellow CheckeredCarpetYellow;
    public static CheckeredCarpetBrown CheckeredCarpetBrown;
    public static CheckeredCarpetGray CheckeredCarpetGray;   

    

    

    //Registering The Solid Blocks
    public static final void init() {
        GameRegistry.registerBlock(SolidRed = new SolidRedBlocks("SolidRedBlocks", Material.rock), ItemSolidBlock.class, "SolidRedBlocks");
        GameRegistry.registerBlock(SolidPurple = new SolidPurpleBlocks("SolidPurpleBlocks", Material.rock), ItemSolidBlock.class, "SolidPurpleBlocks");
        GameRegistry.registerBlock(SolidBlue = new SolidBlueBlocks("SolidBlueBlocks", Material.rock), ItemSolidBlock.class, "SolidBlueBlocks");
        GameRegistry.registerBlock(SolidCyan = new SolidCyanBlocks("SolidCyanBlocks", Material.rock), ItemSolidBlock2.class, "SolidCyanBlocks");
        GameRegistry.registerBlock(SolidGreen = new SolidGreenBlocks("SolidGreenBlocks", Material.rock), ItemSolidBlock.class, "SolidGreenBlocks");
        GameRegistry.registerBlock(SolidYellow = new SolidYellowBlocks("SolidYellowBlocks", Material.rock), ItemSolidBlock.class, "SolidYellowBlocks");
        GameRegistry.registerBlock(SolidBrown = new SolidBrownBlocks("SolidBrownBlocks", Material.rock), ItemSolidBlock.class, "SolidBrownBlocks");
        GameRegistry.registerBlock(SolidGray = new SolidGrayBlocks("SolidGrayBlocks", Material.rock), ItemSolidBlock.class, "SolidGrayBlocks");

        //Registering The Diagonally Dotted Blocks
        GameRegistry.registerBlock(DiagonallyDottedRed = new DiagonallyDottedRed("DiagonallyDottedRed", Material.wood), ItemSolidBlock.class, "DiagonallyDottedRed");
        GameRegistry.registerBlock(DiagonallyDottedPurple = new DiagonallyDottedPurple("DiagonallyDottedPurple", Material.wood), ItemSolidBlock.class, "DiagonallyDottedPurple");
        GameRegistry.registerBlock(DiagonallyDottedBlue = new DiagonallyDottedBlue("DiagonallyDottedBlue", Material.wood), ItemSolidBlock.class, "DiagonallyDottedBlue");
        GameRegistry.registerBlock(DiagonallyDottedCyan = new DiagonallyDottedCyan("DiagonallyDottedCyan", Material.wood), ItemSolidBlock2.class, "DiagonallyDottedCyan");
        GameRegistry.registerBlock(DiagonallyDottedGreen = new DiagonallyDottedGreen("DiagonallyDottedGreen", Material.wood), ItemSolidBlock.class, "DiagonallyDottedGreen");
        GameRegistry.registerBlock(DiagonallyDottedYellow = new DiagonallyDottedYellow("DiagonallyDottedYellow", Material.wood), ItemSolidBlock.class, "DiagonallyDottedYellow");
        GameRegistry.registerBlock(DiagonallyDottedBrown = new DiagonallyDottedBrown("DiagonallyDottedBrown", Material.wood), ItemSolidBlock.class, "DiagonallyDottedBrown");
        GameRegistry.registerBlock(DiagonallyDottedGray = new DiagonallyDottedGray("DiagonallyDottedGray", Material.wood), ItemSolidBlock.class, "DiagonallyDottedGray");
                
        //Registering The Dotted Blocks
        GameRegistry.registerBlock(DottedRed = new DottedRed("DottedRed", Material.wood), ItemSolidBlock.class, "DottedRed");
        GameRegistry.registerBlock(DottedPurple = new DottedPurple("DottedPurple", Material.wood), ItemSolidBlock.class, "DottedPurple");
        GameRegistry.registerBlock(DottedBlue = new DottedBlue("DottedBlue", Material.wood), ItemSolidBlock.class, "DottedBlue");
        GameRegistry.registerBlock(DottedCyan = new DottedCyan("DottedCyan", Material.wood), ItemSolidBlock2.class, "DottedCyan");
        GameRegistry.registerBlock(DottedGreen = new DottedGreen("DottedGreen", Material.wood), ItemSolidBlock.class, "DottedGreen");
        GameRegistry.registerBlock(DottedYellow = new DottedYellow("DottedYellow", Material.wood), ItemSolidBlock.class, "DottedYellow");
        GameRegistry.registerBlock(DottedBrown = new DottedBrown("DottedBrown", Material.wood), ItemSolidBlock.class, "DottedBrown");
        GameRegistry.registerBlock(DottedGray = new DottedGray("DottedGray", Material.wood), ItemSolidBlock.class, "DottedGray");
        
        //Registering The Striped Blocks
        GameRegistry.registerBlock(StripedRed = new StripedRed("StripedRed", Material.wood), ItemSolidBlock.class, "StripedRed");
        GameRegistry.registerBlock(StripedPurple = new StripedPurple("StripedPurple", Material.wood), ItemSolidBlock.class, "StripedPurple");
        GameRegistry.registerBlock(StripedBlue = new StripedBlue("StripedBlue", Material.wood), ItemSolidBlock.class, "StripedBlue");
        GameRegistry.registerBlock(StripedCyan = new StripedCyan("StripedCyan", Material.wood), ItemSolidBlock2.class, "StripedCyan");
        GameRegistry.registerBlock(StripedGreen = new StripedGreen("StripedGreen", Material.wood), ItemSolidBlock.class, "StripedGreen");
        GameRegistry.registerBlock(StripedYellow = new StripedYellow("StripedYellow", Material.wood), ItemSolidBlock.class, "StripedYellow");
        GameRegistry.registerBlock(StripedBrown = new StripedBrown("StripedBrown", Material.wood), ItemSolidBlock.class, "StripedBrown");
        GameRegistry.registerBlock(StripedGray = new StripedGray("StripedGray", Material.wood), ItemSolidBlock.class, "StripedGray");
        
		// Registering The Floral Blocks
        GameRegistry.registerBlock(FloralRed = new FloralRed("FloralRed", Material.wood), ItemSolidBlock.class, "FloralRed");
        GameRegistry.registerBlock(FloralPurple = new FloralPurple("FloralPurple", Material.wood), ItemSolidBlock.class, "FloralPurple");
        GameRegistry.registerBlock(FloralBlue = new FloralBlue("FloralBlue", Material.wood), ItemSolidBlock.class, "FloralBlue");
        GameRegistry.registerBlock(FloralCyan = new FloralCyan("FloralCyan", Material.wood), ItemSolidBlock2.class, "FloralCyan");
        GameRegistry.registerBlock(FloralGreen = new FloralGreen("FloralGreen", Material.wood), ItemSolidBlock.class, "FloralGreen");
        GameRegistry.registerBlock(FloralYellow = new FloralYellow("FloralYellow", Material.wood), ItemSolidBlock.class, "FloralYellow");
        GameRegistry.registerBlock(FloralBrown = new FloralBrown("FloralBrown", Material.wood), ItemSolidBlock.class, "FloralBrown");
        GameRegistry.registerBlock(FloralGray = new FloralGray("FloralGray", Material.wood), ItemSolidBlock.class, "FloralGray");
        
        // Registering The Damask Blocks
        GameRegistry.registerBlock(DamaskRed = new DamaskRed("DamaskRed", Material.wood), ItemSolidBlock.class, "DamaskRed");
        GameRegistry.registerBlock(DamaskPurple = new DamaskPurple("DamaskPurple", Material.wood), ItemSolidBlock.class, "DamaskPurple");
        GameRegistry.registerBlock(DamaskBlue = new DamaskBlue("DamaskBlue", Material.wood), ItemSolidBlock.class, "DamaskBlue");
        GameRegistry.registerBlock(DamaskCyan = new DamaskCyan("DamaskCyan", Material.wood), ItemSolidBlock2.class, "DamaskCyan");
        GameRegistry.registerBlock(DamaskGreen = new DamaskGreen("DamaskGreen", Material.wood), ItemSolidBlock.class, "DamaskGreen");
        GameRegistry.registerBlock(DamaskYellow = new DamaskYellow("DamaskYellow", Material.wood), ItemSolidBlock.class, "DamaskYellow");
        GameRegistry.registerBlock(DamaskBrown = new DamaskBrown("DamaskBrown", Material.wood), ItemSolidBlock.class, "DamaskBrown");
        GameRegistry.registerBlock(DamaskGray = new DamaskGray("DamaskGray", Material.wood), ItemSolidBlock.class, "DamaskGray");
        
		// Registering The Clay Blocks
        GameRegistry.registerBlock(ClayRed = new ClayRed("ClayRed", Material.rock), ItemSolidBlock.class, "ClayRed");
        GameRegistry.registerBlock(ClayPurple = new ClayPurple("ClayPurple", Material.rock), ItemSolidBlock.class, "ClayPurple");
        GameRegistry.registerBlock(ClayBlue = new ClayBlue("ClayBlue", Material.rock), ItemSolidBlock.class, "ClayBlue");
        GameRegistry.registerBlock(ClayCyan = new ClayCyan("ClayCyan", Material.rock), ItemSolidBlock2.class, "ClayCyan");
        GameRegistry.registerBlock(ClayGreen = new ClayGreen("ClayGreen", Material.rock), ItemSolidBlock.class, "ClayGreen");
        GameRegistry.registerBlock(ClayYellow = new ClayYellow("ClayYellow", Material.rock), ItemSolidBlock.class, "ClayYellow");
        GameRegistry.registerBlock(ClayBrown = new ClayBrown("ClayBrown", Material.rock), ItemSolidBlock.class, "ClayBrown");
        GameRegistry.registerBlock(ClayGray = new ClayGray("ClayGray", Material.rock), ItemSolidBlock.class, "ClayGray");
        
        // Registering The Brick Blocks
        GameRegistry.registerBlock(BrickRed = new BrickRed("BrickRed", Material.rock), ItemSolidBlock.class, "BrickRed");
        GameRegistry.registerBlock(BrickPurple = new BrickPurple("BrickPurple", Material.rock), ItemSolidBlock.class, "BrickPurple");
        GameRegistry.registerBlock(BrickBlue = new BrickBlue("BrickBlue", Material.rock), ItemSolidBlock.class, "BrickBlue");
        GameRegistry.registerBlock(BrickCyan = new BrickCyan("BrickCyan", Material.rock), ItemSolidBlock2.class, "BrickCyan");
        GameRegistry.registerBlock(BrickGreen = new BrickGreen("BrickGreen", Material.rock), ItemSolidBlock.class, "BrickGreen");
        GameRegistry.registerBlock(BrickYellow = new BrickYellow("BrickYellow", Material.rock), ItemSolidBlock.class, "BrickYellow");
        GameRegistry.registerBlock(BrickBrown = new BrickBrown("BrickBrown", Material.rock), ItemSolidBlock.class, "BrickBrown");
        GameRegistry.registerBlock(BrickGray = new BrickGray("BrickGray", Material.rock), ItemSolidBlock.class, "BrickGray");
        
        // Registering The Stone Brick Blocks
        GameRegistry.registerBlock(StoneBrickRed = new StoneBrickRed("StoneBrickRed", Material.rock), ItemSolidBlock.class, "StoneBrickRed");
        GameRegistry.registerBlock(StoneBrickPurple = new StoneBrickPurple("StoneBrickPurple", Material.rock), ItemSolidBlock.class, "StoneBrickPurple");
        GameRegistry.registerBlock(StoneBrickBlue = new StoneBrickBlue("StoneBrickBlue", Material.rock), ItemSolidBlock.class, "StoneBrickBlue");
        GameRegistry.registerBlock(StoneBrickCyan = new StoneBrickCyan("StoneBrickCyan", Material.rock), ItemSolidBlock2.class, "StoneBrickCyan");
        GameRegistry.registerBlock(StoneBrickGreen = new StoneBrickGreen("StoneBrickGreen", Material.rock), ItemSolidBlock.class, "StoneBrickGreen");
        GameRegistry.registerBlock(StoneBrickYellow = new StoneBrickYellow("StoneBrickYellow", Material.rock), ItemSolidBlock.class, "StoneBrickYellow");
        GameRegistry.registerBlock(StoneBrickBrown = new StoneBrickBrown("StoneBrickBrown", Material.rock), ItemSolidBlock.class, "StoneBrickBrown");
        GameRegistry.registerBlock(StoneBrickGray = new StoneBrickGray("StoneBrickGray", Material.rock), ItemSolidBlock.class, "StoneBrickGray");
        
        // Registering The Stone Lamp Blocks
        GameRegistry.registerBlock(StoneLampRed = new StoneLampRed("StoneLampRed", Material.rock), ItemSolidBlock.class, "StoneLampRed");
        GameRegistry.registerBlock(StoneLampPurple = new StoneLampPurple("StoneLampPurple", Material.rock), ItemSolidBlock.class, "StoneLampPurple");
        GameRegistry.registerBlock(StoneLampBlue = new StoneLampBlue("StoneLampBlue", Material.rock), ItemSolidBlock.class, "StoneLampBlue");
        GameRegistry.registerBlock(StoneLampCyan = new StoneLampCyan("StoneLampCyan", Material.rock), ItemSolidBlock2.class, "StoneLampCyan");
        GameRegistry.registerBlock(StoneLampGreen = new StoneLampGreen("StoneLampGreen", Material.rock), ItemSolidBlock.class, "StoneLampGreen");
        GameRegistry.registerBlock(StoneLampYellow = new StoneLampYellow("StoneLampYellow", Material.rock), ItemSolidBlock.class, "StoneLampYellow");
        GameRegistry.registerBlock(StoneLampBrown = new StoneLampBrown("StoneLampBrown", Material.rock), ItemSolidBlock.class, "StoneLampBrown");
        GameRegistry.registerBlock(StoneLampGray = new StoneLampGray("StoneLampGray", Material.rock), ItemSolidBlock.class, "StoneLampGray");
                
        // Registering The Rippled Blocks
        GameRegistry.registerBlock(RippledRed = new RippledRed("RippledRed", Material.wood), ItemSolidBlock.class, "RippledRed");
        GameRegistry.registerBlock(RippledPurple = new RippledPurple("RippledPurple", Material.wood), ItemSolidBlock.class, "RippledPurple");
        GameRegistry.registerBlock(RippledBlue = new RippledBlue("RippledBlue", Material.wood), ItemSolidBlock.class, "RippledBlue");
        GameRegistry.registerBlock(RippledCyan = new RippledCyan("RippledCyan", Material.wood), ItemSolidBlock2.class, "RippledCyan");
        GameRegistry.registerBlock(RippledGreen = new RippledGreen("RippledGreen", Material.wood), ItemSolidBlock.class, "RippledGreen");
        GameRegistry.registerBlock(RippledYellow = new RippledYellow("RippledYellow", Material.wood), ItemSolidBlock.class, "RippledYellow");
        GameRegistry.registerBlock(RippledBrown = new RippledBrown("RippledBrown", Material.wood), ItemSolidBlock.class, "RippledBrown");
        GameRegistry.registerBlock(RippledGray = new RippledGray("RippledGray", Material.wood), ItemSolidBlock.class, "RippledGray");
        
        // Registering The Fancy Tiles
        GameRegistry.registerBlock(FancyTilesRed = new FancyTilesRed("FancyTilesRed", Material.wood), ItemSolidBlock.class, "FancyTilesRed");
        GameRegistry.registerBlock(FancyTilesPurple = new FancyTilesPurple("FancyTilesPurple", Material.wood), ItemSolidBlock.class, "FancyTilesPurple");
        GameRegistry.registerBlock(FancyTilesBlue = new FancyTilesBlue("FancyTilesBlue", Material.wood), ItemSolidBlock.class, "FancyTilesBlue");
        GameRegistry.registerBlock(FancyTilesCyan = new FancyTilesCyan("FancyTilesCyan", Material.wood), ItemSolidBlock2.class, "FancyTilesCyan");
        GameRegistry.registerBlock(FancyTilesGreen = new FancyTilesGreen("FancyTilesGreen", Material.wood), ItemSolidBlock.class, "FancyTilesGreen");
        GameRegistry.registerBlock(FancyTilesYellow = new FancyTilesYellow("FancyTilesYellow", Material.wood), ItemSolidBlock.class, "FancyTilesYellow");
        GameRegistry.registerBlock(FancyTilesBrown = new FancyTilesBrown("FancyTilesBrown", Material.wood), ItemSolidBlock.class, "FancyTilesBrown");
        GameRegistry.registerBlock(FancyTilesGray = new FancyTilesGray("FancyTilesGray", Material.wood), ItemSolidBlock.class, "FancyTilesGray");
        
        // Registering the Stamp Pattern Blocks
        GameRegistry.registerBlock(Stamp = new Stamp("Stamp", Material.wood), ItemSolidBlock3.class, "Stamp");
        
        // Registering the Jewel Pattern Blocks
        GameRegistry.registerBlock(Jewel = new Jewel("Jewel", Material.wood), ItemSolidBlock3.class, "Jewel");
        
        // Registering The Wood Planks
        GameRegistry.registerBlock(WoodPlankRed = new WoodPlankRed("WoodPlankRed", Material.wood), ItemSolidBlock.class, "WoodPlankRed");
        GameRegistry.registerBlock(WoodPlankPurple = new WoodPlankPurple("WoodPlankPurple", Material.wood), ItemSolidBlock.class, "WoodPlankPurple");
        GameRegistry.registerBlock(WoodPlankBlue = new WoodPlankBlue("WoodPlankBlue", Material.wood), ItemSolidBlock.class, "WoodPlankBlue");
        GameRegistry.registerBlock(WoodPlankCyan = new WoodPlankCyan("WoodPlankCyan", Material.wood), ItemSolidBlock2.class, "WoodPlankCyan");
        GameRegistry.registerBlock(WoodPlankGreen = new WoodPlankGreen("WoodPlankGreen", Material.wood), ItemSolidBlock.class, "WoodPlankGreen");
        GameRegistry.registerBlock(WoodPlankYellow = new WoodPlankYellow("WoodPlankYellow", Material.wood), ItemSolidBlock.class, "WoodPlankYellow");
        GameRegistry.registerBlock(WoodPlankBrown = new WoodPlankBrown("WoodPlankBrown", Material.wood), ItemSolidBlock.class, "WoodPlankBrown");
        GameRegistry.registerBlock(WoodPlankGray = new WoodPlankGray("WoodPlankGray", Material.wood), ItemSolidBlock.class, "WoodPlankGray");
        
        // Registering The Wool Blocks
        GameRegistry.registerBlock(WoolRed = new WoolRed("WoolRed", Material.cloth), ItemSolidBlock.class, "WoolRed");
        GameRegistry.registerBlock(WoolPurple = new WoolPurple("WoolPurple", Material.cloth), ItemSolidBlock.class, "WoolPurple");
        GameRegistry.registerBlock(WoolBlue = new WoolBlue("WoolBlue", Material.cloth), ItemSolidBlock.class, "WoolBlue");
        GameRegistry.registerBlock(WoolCyan = new WoolCyan("WoolCyan", Material.cloth), ItemSolidBlock2.class, "WoolCyan");
        GameRegistry.registerBlock(WoolGreen = new WoolGreen("WoolGreen", Material.cloth), ItemSolidBlock.class, "WoolGreen");
        GameRegistry.registerBlock(WoolYellow = new WoolYellow("WoolYellow", Material.cloth), ItemSolidBlock.class, "WoolYellow");
        GameRegistry.registerBlock(WoolBrown = new WoolBrown("WoolBrown", Material.cloth), ItemSolidBlock.class, "WoolBrown");
        GameRegistry.registerBlock(WoolGray = new WoolGray("WoolGray", Material.cloth), ItemSolidBlock.class, "WoolGray");
        
        // Registering The Checkered Wool Blocks
        GameRegistry.registerBlock(CheckeredWoolRed = new CheckeredWoolRed("CheckeredWoolRed", Material.cloth), ItemSolidBlock.class, "CheckeredWoolRed");
        GameRegistry.registerBlock(CheckeredWoolPurple = new CheckeredWoolPurple("CheckeredWoolPurple", Material.cloth), ItemSolidBlock.class, "CheckeredWoolPurple");
        GameRegistry.registerBlock(CheckeredWoolBlue = new CheckeredWoolBlue("CheckeredWoolBlue", Material.cloth), ItemSolidBlock.class, "CheckeredWoolBlue");
        GameRegistry.registerBlock(CheckeredWoolCyan = new CheckeredWoolCyan("CheckeredWoolCyan", Material.cloth), ItemSolidBlock2.class, "CheckeredWoolCyan");
        GameRegistry.registerBlock(CheckeredWoolGreen = new CheckeredWoolGreen("CheckeredWoolGreen", Material.cloth), ItemSolidBlock.class, "CheckeredWoolGreen");
        GameRegistry.registerBlock(CheckeredWoolYellow = new CheckeredWoolYellow("CheckeredWoolYellow", Material.cloth), ItemSolidBlock.class, "CheckeredWoolYellow");
        GameRegistry.registerBlock(CheckeredWoolBrown = new CheckeredWoolBrown("CheckeredWoolBrown", Material.cloth), ItemSolidBlock.class, "CheckeredWoolBrown");
        GameRegistry.registerBlock(CheckeredWoolGray = new CheckeredWoolGray("CheckeredWoolGray", Material.cloth), ItemSolidBlock.class, "CheckeredWoolGray");
        
        // Registering The Aura Lamp Blocks
        GameRegistry.registerBlock(AuraLampRed = new AuraLampRed("AuraLampRed", Material.glass), ItemSolidBlock.class, "AuraLampRed");
        GameRegistry.registerBlock(AuraLampPurple = new AuraLampPurple("AuraLampPurple", Material.glass), ItemSolidBlock.class, "AuraLampPurple");
        GameRegistry.registerBlock(AuraLampBlue = new AuraLampBlue("AuraLampBlue", Material.glass), ItemSolidBlock.class, "AuraLampBlue");
        GameRegistry.registerBlock(AuraLampCyan = new AuraLampCyan("AuraLampCyan", Material.glass), ItemSolidBlock2.class, "AuraLampCyan");
        GameRegistry.registerBlock(AuraLampGreen = new AuraLampGreen("AuraLampGreen", Material.glass), ItemSolidBlock.class, "AuraLampGreen");
        GameRegistry.registerBlock(AuraLampYellow = new AuraLampYellow("AuraLampYellow", Material.glass), ItemSolidBlock.class, "AuraLampYellow");
        GameRegistry.registerBlock(AuraLampBrown = new AuraLampBrown("AuraLampBrown", Material.glass), ItemSolidBlock.class, "AuraLampBrown");
        GameRegistry.registerBlock(AuraLampGray = new AuraLampGray("AuraLampGray", Material.glass), ItemSolidBlock.class, "AuraLampGray");
        
        // Registering The Tinted Glass Blocks
        GameRegistry.registerBlock(TintedGlassRed = new TintedGlassRed("TintedGlassRed", Material.glass), ItemSolidBlock.class, "TintedGlassRed");
        GameRegistry.registerBlock(TintedGlassPurple = new TintedGlassPurple("TintedGlassPurple", Material.glass), ItemSolidBlock.class, "TintedGlassPurple");
        GameRegistry.registerBlock(TintedGlassBlue = new TintedGlassBlue("TintedGlassBlue", Material.glass), ItemSolidBlock.class, "TintedGlassBlue");
        GameRegistry.registerBlock(TintedGlassCyan = new TintedGlassCyan("TintedGlassCyan", Material.glass), ItemSolidBlock2.class, "TintedGlassCyan");
        GameRegistry.registerBlock(TintedGlassGreen = new TintedGlassGreen("TintedGlassGreen", Material.glass), ItemSolidBlock.class, "TintedGlassGreen");
        GameRegistry.registerBlock(TintedGlassYellow = new TintedGlassYellow("TintedGlassYellow", Material.glass), ItemSolidBlock.class, "TintedGlassYellow");
        GameRegistry.registerBlock(TintedGlassBrown = new TintedGlassBrown("TintedGlassBrown", Material.glass), ItemSolidBlock.class, "TintedGlassBrown");
        GameRegistry.registerBlock(TintedGlassGray = new TintedGlassGray("TintedGlassGray", Material.glass), ItemSolidBlock.class, "TintedGlassGray");      
        
        // Registering The Textured Glass Blocks
        GameRegistry.registerBlock(TexturedGlassRed = new TexturedGlassRed("TexturedGlassRed", Material.glass), ItemSolidBlock.class, "TexturedGlassRed");
        GameRegistry.registerBlock(TexturedGlassPurple = new TexturedGlassPurple("TexturedGlassPurple", Material.glass), ItemSolidBlock.class, "TexturedGlassPurple");
        GameRegistry.registerBlock(TexturedGlassBlue = new TexturedGlassBlue("TexturedGlassBlue", Material.glass), ItemSolidBlock.class, "TexturedGlassBlue");
        GameRegistry.registerBlock(TexturedGlassCyan = new TexturedGlassCyan("TexturedGlassCyan", Material.glass), ItemSolidBlock2.class, "TexturedGlassCyan");
        GameRegistry.registerBlock(TexturedGlassGreen = new TexturedGlassGreen("TexturedGlassGreen", Material.glass), ItemSolidBlock.class, "TexturedGlassGreen");
        GameRegistry.registerBlock(TexturedGlassYellow = new TexturedGlassYellow("TexturedGlassYellow", Material.glass), ItemSolidBlock.class, "TexturedGlassYellow");
        GameRegistry.registerBlock(TexturedGlassBrown = new TexturedGlassBrown("TexturedGlassBrown", Material.glass), ItemSolidBlock.class, "TexturedGlassBrown");
        GameRegistry.registerBlock(TexturedGlassGray = new TexturedGlassGray("TexturedGlassGray", Material.glass), ItemSolidBlock.class, "TexturedGlassGray");      
        
        // Registering The Frosted Glass Blocks
        GameRegistry.registerBlock(FrostedGlassRed = new FrostedGlassRed("FrostedGlassRed", Material.glass), ItemSolidBlock.class, "FrostedGlassRed");
        GameRegistry.registerBlock(FrostedGlassPurple = new FrostedGlassPurple("FrostedGlassPurple", Material.glass), ItemSolidBlock.class, "FrostedGlassPurple");
        GameRegistry.registerBlock(FrostedGlassBlue = new FrostedGlassBlue("FrostedGlassBlue", Material.glass), ItemSolidBlock.class, "FrostedGlassBlue");
        GameRegistry.registerBlock(FrostedGlassCyan = new FrostedGlassCyan("FrostedGlassCyan", Material.glass), ItemSolidBlock2.class, "FrostedGlassCyan");
        GameRegistry.registerBlock(FrostedGlassGreen = new FrostedGlassGreen("FrostedGlassGreen", Material.glass), ItemSolidBlock.class, "FrostedGlassGreen");
        GameRegistry.registerBlock(FrostedGlassYellow = new FrostedGlassYellow("FrostedGlassYellow", Material.glass), ItemSolidBlock.class, "FrostedGlassYellow");
        GameRegistry.registerBlock(FrostedGlassBrown = new FrostedGlassBrown("FrostedGlassBrown", Material.glass), ItemSolidBlock.class, "FrostedGlassBrown");
        GameRegistry.registerBlock(FrostedGlassGray = new FrostedGlassGray("FrostedGlassGray", Material.glass), ItemSolidBlock.class, "FrostedGlassGray");
        
        // Registering The Tinted Glass Panes
        GameRegistry.registerBlock(TintedPaneRed = new TintedPaneRed(), ItemSolidBlock.class, "TintedPaneRed");
        GameRegistry.registerBlock(TintedPanePurple = new TintedPanePurple(), ItemSolidBlock.class, "TintedPanePurple");
        GameRegistry.registerBlock(TintedPaneBlue = new TintedPaneBlue(), ItemSolidBlock.class, "TintedPaneBlue");
        GameRegistry.registerBlock(TintedPaneCyan = new TintedPaneCyan(), ItemSolidBlock2.class, "TintedPaneCyan");
        GameRegistry.registerBlock(TintedPaneGreen = new TintedPaneGreen(), ItemSolidBlock.class, "TintedPaneGreen");
        GameRegistry.registerBlock(TintedPaneYellow = new TintedPaneYellow(), ItemSolidBlock.class, "TintedPaneYellow");
        GameRegistry.registerBlock(TintedPaneBrown = new TintedPaneBrown(), ItemSolidBlock.class, "TintedPaneBrown");
        GameRegistry.registerBlock(TintedPaneGray = new TintedPaneGray(), ItemSolidBlock.class, "TintedPaneGray");  
        
        // Registering The Textured Glass Panes
        GameRegistry.registerBlock(TexturedPaneRed = new TexturedPaneRed(), ItemSolidBlock.class, "TexturedPaneRed");
        GameRegistry.registerBlock(TexturedPanePurple = new TexturedPanePurple(), ItemSolidBlock.class, "TexturedPanePurple");
        GameRegistry.registerBlock(TexturedPaneBlue = new TexturedPaneBlue(), ItemSolidBlock.class, "TexturedPaneBlue");
        GameRegistry.registerBlock(TexturedPaneCyan = new TexturedPaneCyan(), ItemSolidBlock2.class, "TexturedPaneCyan");
        GameRegistry.registerBlock(TexturedPaneGreen = new TexturedPaneGreen(), ItemSolidBlock.class, "TexturedPaneGreen");
        GameRegistry.registerBlock(TexturedPaneYellow = new TexturedPaneYellow(), ItemSolidBlock.class, "TexturedPaneYellow");
        GameRegistry.registerBlock(TexturedPaneBrown = new TexturedPaneBrown(), ItemSolidBlock.class, "TexturedPaneBrown");
        GameRegistry.registerBlock(TexturedPaneGray = new TexturedPaneGray(), ItemSolidBlock.class, "TexturedPaneGray"); 
        
        // Registering The Frosted Glass Panes
        GameRegistry.registerBlock(FrostedPaneRed = new FrostedPaneRed(), ItemSolidBlock.class, "FrostedPaneRed");
        GameRegistry.registerBlock(FrostedPanePurple = new FrostedPanePurple(), ItemSolidBlock.class, "FrostedPanePurple");
        GameRegistry.registerBlock(FrostedPaneBlue = new FrostedPaneBlue(), ItemSolidBlock.class, "FrostedPaneBlue");
        GameRegistry.registerBlock(FrostedPaneCyan = new FrostedPaneCyan(), ItemSolidBlock2.class, "FrostedPaneCyan");
        GameRegistry.registerBlock(FrostedPaneGreen = new FrostedPaneGreen(), ItemSolidBlock.class, "FrostedPaneGreen");
        GameRegistry.registerBlock(FrostedPaneYellow = new FrostedPaneYellow(), ItemSolidBlock.class, "FrostedPaneYellow");
        GameRegistry.registerBlock(FrostedPaneBrown = new FrostedPaneBrown(), ItemSolidBlock.class, "FrostedPaneBrown");
        GameRegistry.registerBlock(FrostedPaneGray = new FrostedPaneGray(), ItemSolidBlock.class, "FrostedPaneGray");  
                
        // Registering The Wool Carpets
        GameRegistry.registerBlock(WoolCarpetRed = new WoolCarpetRed("WoolCarpetRed", Material.carpet), ItemSolidBlock.class, "WoolCarpetRed");
        GameRegistry.registerBlock(WoolCarpetPurple = new WoolCarpetPurple("WoolCarpetPurple", Material.carpet), ItemSolidBlock.class, "WoolCarpetPurple");
        GameRegistry.registerBlock(WoolCarpetBlue = new WoolCarpetBlue("WoolCarpetBlue", Material.carpet), ItemSolidBlock.class, "WoolCarpetBlue");
        GameRegistry.registerBlock(WoolCarpetCyan = new WoolCarpetCyan("WoolCarpetCyan", Material.carpet), ItemSolidBlock2.class, "WoolCarpetCyan");
        GameRegistry.registerBlock(WoolCarpetGreen = new WoolCarpetGreen("WoolCarpetGreen", Material.carpet), ItemSolidBlock.class, "WoolCarpetGreen");
        GameRegistry.registerBlock(WoolCarpetYellow = new WoolCarpetYellow("WoolCarpetYellow", Material.carpet), ItemSolidBlock.class, "WoolCarpetYellow");
        GameRegistry.registerBlock(WoolCarpetBrown = new WoolCarpetBrown("WoolCarpetBrown", Material.carpet), ItemSolidBlock.class, "WoolCarpetBrown");
        GameRegistry.registerBlock(WoolCarpetGray = new WoolCarpetGray("WoolCarpetGray", Material.carpet), ItemSolidBlock.class, "WoolCarpetGray");
        
        // Registering The Checkered Carpets
        GameRegistry.registerBlock(CheckeredCarpetRed = new CheckeredCarpetRed("CheckeredCarpetRed", Material.carpet), ItemSolidBlock.class, "CheckeredCarpetRed");
        GameRegistry.registerBlock(CheckeredCarpetPurple = new CheckeredCarpetPurple("CheckeredCarpetPurple", Material.carpet), ItemSolidBlock.class, "CheckeredCarpetPurple");
        GameRegistry.registerBlock(CheckeredCarpetBlue = new CheckeredCarpetBlue("CheckeredCarpetBlue", Material.carpet), ItemSolidBlock.class, "CheckeredCarpetBlue");
        GameRegistry.registerBlock(CheckeredCarpetCyan = new CheckeredCarpetCyan("CheckeredCarpetCyan", Material.carpet), ItemSolidBlock2.class, "CheckeredCarpetCyan");
        GameRegistry.registerBlock(CheckeredCarpetGreen = new CheckeredCarpetGreen("CheckeredCarpetGreen", Material.carpet), ItemSolidBlock.class, "CheckeredCarpetGreen");
        GameRegistry.registerBlock(CheckeredCarpetYellow = new CheckeredCarpetYellow("CheckeredCarpetYellow", Material.carpet), ItemSolidBlock.class, "CheckeredCarpetYellow");
        GameRegistry.registerBlock(CheckeredCarpetBrown = new CheckeredCarpetBrown("CheckeredCarpetBrown", Material.carpet), ItemSolidBlock.class, "CheckeredCarpetBrown");
        GameRegistry.registerBlock(CheckeredCarpetGray = new CheckeredCarpetGray("CheckeredCarpetGray", Material.carpet), ItemSolidBlock.class, "CheckeredCarpetGray");
        
        
            
        //OreDict Registration.
        OreDictionary.registerOre("solidWPBlocks", new ItemStack(SolidRed, 1, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre("solidWPBlocks", new ItemStack(SolidPurple, 1, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre("solidWPBlocks", new ItemStack(SolidBlue, 1, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre("solidWPBlocks", new ItemStack(SolidCyan, 1, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre("solidWPBlocks", new ItemStack(SolidGreen, 1, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre("solidWPBlocks", new ItemStack(SolidYellow, 1, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre("solidWPBlocks", new ItemStack(SolidBrown, 1, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre("solidWPBlocks", new ItemStack(SolidGray, 1, OreDictionary.WILDCARD_VALUE));
        


      
    }
}