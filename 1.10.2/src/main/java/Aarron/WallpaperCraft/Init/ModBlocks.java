package Aarron.WallpaperCraft.init;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;
import Aarron.WallpaperCraft.blocks.bricks.BrickBlue;
import Aarron.WallpaperCraft.blocks.bricks.BrickBrown;
import Aarron.WallpaperCraft.blocks.bricks.BrickCyan;
import Aarron.WallpaperCraft.blocks.bricks.BrickGray;
import Aarron.WallpaperCraft.blocks.bricks.BrickGreen;
import Aarron.WallpaperCraft.blocks.bricks.BrickPurple;
import Aarron.WallpaperCraft.blocks.bricks.BrickRed;
import Aarron.WallpaperCraft.blocks.bricks.BrickYellow;
import Aarron.WallpaperCraft.blocks.bricks.StoneBrickBlue;
import Aarron.WallpaperCraft.blocks.bricks.StoneBrickBrown;
import Aarron.WallpaperCraft.blocks.bricks.StoneBrickCyan;
import Aarron.WallpaperCraft.blocks.bricks.StoneBrickGray;
import Aarron.WallpaperCraft.blocks.bricks.StoneBrickGreen;
import Aarron.WallpaperCraft.blocks.bricks.StoneBrickPurple;
import Aarron.WallpaperCraft.blocks.bricks.StoneBrickRed;
import Aarron.WallpaperCraft.blocks.bricks.StoneBrickYellow;
import Aarron.WallpaperCraft.blocks.carpets.CheckeredCarpetBlue;
import Aarron.WallpaperCraft.blocks.carpets.CheckeredCarpetBrown;
import Aarron.WallpaperCraft.blocks.carpets.CheckeredCarpetCyan;
import Aarron.WallpaperCraft.blocks.carpets.CheckeredCarpetGray;
import Aarron.WallpaperCraft.blocks.carpets.CheckeredCarpetGreen;
import Aarron.WallpaperCraft.blocks.carpets.CheckeredCarpetPurple;
import Aarron.WallpaperCraft.blocks.carpets.CheckeredCarpetRed;
import Aarron.WallpaperCraft.blocks.carpets.CheckeredCarpetYellow;
import Aarron.WallpaperCraft.blocks.carpets.WoolCarpetBlue;
import Aarron.WallpaperCraft.blocks.carpets.WoolCarpetBrown;
import Aarron.WallpaperCraft.blocks.carpets.WoolCarpetCyan;
import Aarron.WallpaperCraft.blocks.carpets.WoolCarpetGray;
import Aarron.WallpaperCraft.blocks.carpets.WoolCarpetGreen;
import Aarron.WallpaperCraft.blocks.carpets.WoolCarpetPurple;
import Aarron.WallpaperCraft.blocks.carpets.WoolCarpetRed;
import Aarron.WallpaperCraft.blocks.carpets.WoolCarpetYellow;
import Aarron.WallpaperCraft.blocks.clay.ClayBlue;
import Aarron.WallpaperCraft.blocks.clay.ClayBrown;
import Aarron.WallpaperCraft.blocks.clay.ClayCyan;
import Aarron.WallpaperCraft.blocks.clay.ClayGray;
import Aarron.WallpaperCraft.blocks.clay.ClayGreen;
import Aarron.WallpaperCraft.blocks.clay.ClayPurple;
import Aarron.WallpaperCraft.blocks.clay.ClayRed;
import Aarron.WallpaperCraft.blocks.clay.ClayYellow;
import Aarron.WallpaperCraft.blocks.dotted.DiagonallyDottedBlue;
import Aarron.WallpaperCraft.blocks.dotted.DiagonallyDottedBrown;
import Aarron.WallpaperCraft.blocks.dotted.DiagonallyDottedCyan;
import Aarron.WallpaperCraft.blocks.dotted.DiagonallyDottedGray;
import Aarron.WallpaperCraft.blocks.dotted.DiagonallyDottedGreen;
import Aarron.WallpaperCraft.blocks.dotted.DiagonallyDottedPurple;
import Aarron.WallpaperCraft.blocks.dotted.DiagonallyDottedRed;
import Aarron.WallpaperCraft.blocks.dotted.DiagonallyDottedYellow;
import Aarron.WallpaperCraft.blocks.dotted.DottedBlue;
import Aarron.WallpaperCraft.blocks.dotted.DottedBrown;
import Aarron.WallpaperCraft.blocks.dotted.DottedCyan;
import Aarron.WallpaperCraft.blocks.dotted.DottedGray;
import Aarron.WallpaperCraft.blocks.dotted.DottedGreen;
import Aarron.WallpaperCraft.blocks.dotted.DottedPurple;
import Aarron.WallpaperCraft.blocks.dotted.DottedRed;
import Aarron.WallpaperCraft.blocks.dotted.DottedYellow;
import Aarron.WallpaperCraft.blocks.floral.FloralBlue;
import Aarron.WallpaperCraft.blocks.floral.FloralBrown;
import Aarron.WallpaperCraft.blocks.floral.FloralCyan;
import Aarron.WallpaperCraft.blocks.floral.FloralGray;
import Aarron.WallpaperCraft.blocks.floral.FloralGreen;
import Aarron.WallpaperCraft.blocks.floral.FloralPurple;
import Aarron.WallpaperCraft.blocks.floral.FloralRed;
import Aarron.WallpaperCraft.blocks.floral.FloralYellow;
import Aarron.WallpaperCraft.blocks.glass.FrostedGlassBlue;
import Aarron.WallpaperCraft.blocks.glass.FrostedGlassBrown;
import Aarron.WallpaperCraft.blocks.glass.FrostedGlassCyan;
import Aarron.WallpaperCraft.blocks.glass.FrostedGlassGray;
import Aarron.WallpaperCraft.blocks.glass.FrostedGlassGreen;
import Aarron.WallpaperCraft.blocks.glass.FrostedGlassPurple;
import Aarron.WallpaperCraft.blocks.glass.FrostedGlassRed;
import Aarron.WallpaperCraft.blocks.glass.FrostedGlassYellow;
import Aarron.WallpaperCraft.blocks.glass.TexturedGlassBlue;
import Aarron.WallpaperCraft.blocks.glass.TexturedGlassBrown;
import Aarron.WallpaperCraft.blocks.glass.TexturedGlassCyan;
import Aarron.WallpaperCraft.blocks.glass.TexturedGlassGray;
import Aarron.WallpaperCraft.blocks.glass.TexturedGlassGreen;
import Aarron.WallpaperCraft.blocks.glass.TexturedGlassPurple;
import Aarron.WallpaperCraft.blocks.glass.TexturedGlassRed;
import Aarron.WallpaperCraft.blocks.glass.TexturedGlassYellow;
import Aarron.WallpaperCraft.blocks.glass.TintedGlassBlue;
import Aarron.WallpaperCraft.blocks.glass.TintedGlassBrown;
import Aarron.WallpaperCraft.blocks.glass.TintedGlassCyan;
import Aarron.WallpaperCraft.blocks.glass.TintedGlassGray;
import Aarron.WallpaperCraft.blocks.glass.TintedGlassGreen;
import Aarron.WallpaperCraft.blocks.glass.TintedGlassPurple;
import Aarron.WallpaperCraft.blocks.glass.TintedGlassRed;
import Aarron.WallpaperCraft.blocks.glass.TintedGlassYellow;
import Aarron.WallpaperCraft.blocks.lamps.StoneLampBlue;
import Aarron.WallpaperCraft.blocks.lamps.StoneLampBrown;
import Aarron.WallpaperCraft.blocks.lamps.StoneLampCyan;
import Aarron.WallpaperCraft.blocks.lamps.StoneLampGray;
import Aarron.WallpaperCraft.blocks.lamps.StoneLampGreen;
import Aarron.WallpaperCraft.blocks.lamps.StoneLampPurple;
import Aarron.WallpaperCraft.blocks.lamps.StoneLampRed;
import Aarron.WallpaperCraft.blocks.lamps.StoneLampYellow;
import Aarron.WallpaperCraft.blocks.planks.WoodPlankBlue;
import Aarron.WallpaperCraft.blocks.planks.WoodPlankBrown;
import Aarron.WallpaperCraft.blocks.planks.WoodPlankCyan;
import Aarron.WallpaperCraft.blocks.planks.WoodPlankGray;
import Aarron.WallpaperCraft.blocks.planks.WoodPlankGreen;
import Aarron.WallpaperCraft.blocks.planks.WoodPlankPurple;
import Aarron.WallpaperCraft.blocks.planks.WoodPlankRed;
import Aarron.WallpaperCraft.blocks.planks.WoodPlankYellow;
import Aarron.WallpaperCraft.blocks.rippled.RippledBlue;
import Aarron.WallpaperCraft.blocks.rippled.RippledBrown;
import Aarron.WallpaperCraft.blocks.rippled.RippledCyan;
import Aarron.WallpaperCraft.blocks.rippled.RippledGray;
import Aarron.WallpaperCraft.blocks.rippled.RippledGreen;
import Aarron.WallpaperCraft.blocks.rippled.RippledPurple;
import Aarron.WallpaperCraft.blocks.rippled.RippledRed;
import Aarron.WallpaperCraft.blocks.rippled.RippledYellow;
import Aarron.WallpaperCraft.blocks.solid.SolidBlue;
import Aarron.WallpaperCraft.blocks.solid.SolidBrown;
import Aarron.WallpaperCraft.blocks.solid.SolidCyan;
import Aarron.WallpaperCraft.blocks.solid.SolidGray;
import Aarron.WallpaperCraft.blocks.solid.SolidGreen;
import Aarron.WallpaperCraft.blocks.solid.SolidPurple;
import Aarron.WallpaperCraft.blocks.solid.SolidRed;
import Aarron.WallpaperCraft.blocks.solid.SolidYellow;
import Aarron.WallpaperCraft.blocks.stamp.Stamp;
import Aarron.WallpaperCraft.blocks.striped.StripedBlue;
import Aarron.WallpaperCraft.blocks.striped.StripedBrown;
import Aarron.WallpaperCraft.blocks.striped.StripedCyan;
import Aarron.WallpaperCraft.blocks.striped.StripedGray;
import Aarron.WallpaperCraft.blocks.striped.StripedGreen;
import Aarron.WallpaperCraft.blocks.striped.StripedPurple;
import Aarron.WallpaperCraft.blocks.striped.StripedRed;
import Aarron.WallpaperCraft.blocks.striped.StripedYellow;
import Aarron.WallpaperCraft.blocks.wool.CheckeredWoolBlue;
import Aarron.WallpaperCraft.blocks.wool.CheckeredWoolBrown;
import Aarron.WallpaperCraft.blocks.wool.CheckeredWoolCyan;
import Aarron.WallpaperCraft.blocks.wool.CheckeredWoolGray;
import Aarron.WallpaperCraft.blocks.wool.CheckeredWoolGreen;
import Aarron.WallpaperCraft.blocks.wool.CheckeredWoolPurple;
import Aarron.WallpaperCraft.blocks.wool.CheckeredWoolRed;
import Aarron.WallpaperCraft.blocks.wool.CheckeredWoolYellow;
import Aarron.WallpaperCraft.blocks.wool.WoolBlue;
import Aarron.WallpaperCraft.blocks.wool.WoolBrown;
import Aarron.WallpaperCraft.blocks.wool.WoolCyan;
import Aarron.WallpaperCraft.blocks.wool.WoolGray;
import Aarron.WallpaperCraft.blocks.wool.WoolGreen;
import Aarron.WallpaperCraft.blocks.wool.WoolPurple;
import Aarron.WallpaperCraft.blocks.wool.WoolRed;
import Aarron.WallpaperCraft.blocks.wool.WoolYellow;
import Aarron.WallpaperCraft.blocks.glass.panes.*;


public class ModBlocks {
	
	public static void init() {
		registerBlocks();
	}
	public static SolidRed SolidRed = new SolidRed();
	public static SolidPurple SolidPurple = new SolidPurple();
	public static SolidBlue SolidBlue = new SolidBlue();
	public static SolidCyan SolidCyan = new SolidCyan();
	public static SolidGreen SolidGreen = new SolidGreen();
	public static SolidYellow SolidYellow = new SolidYellow();
	public static SolidBrown SolidBrown = new SolidBrown();
	public static SolidGray SolidGray = new SolidGray();

	public static DiagonallyDottedRed DiagonallyDottedRed = new DiagonallyDottedRed();
	public static DiagonallyDottedPurple DiagonallyDottedPurple = new DiagonallyDottedPurple();
	public static DiagonallyDottedBlue DiagonallyDottedBlue = new DiagonallyDottedBlue();
	public static DiagonallyDottedCyan DiagonallyDottedCyan = new DiagonallyDottedCyan();
	public static DiagonallyDottedGreen DiagonallyDottedGreen = new DiagonallyDottedGreen();
	public static DiagonallyDottedYellow DiagonallyDottedYellow = new DiagonallyDottedYellow();
	public static DiagonallyDottedBrown DiagonallyDottedBrown = new DiagonallyDottedBrown();
	public static DiagonallyDottedGray DiagonallyDottedGray = new DiagonallyDottedGray();
	
	public static DottedRed DottedRed = new DottedRed();
	public static DottedPurple DottedPurple = new DottedPurple();
	public static DottedBlue DottedBlue = new DottedBlue();
	public static DottedCyan DottedCyan = new DottedCyan();
	public static DottedGreen DottedGreen = new DottedGreen();
	public static DottedYellow DottedYellow = new DottedYellow();
	public static DottedBrown DottedBrown = new DottedBrown();
	public static DottedGray DottedGray = new DottedGray();
		
	public static StripedRed StripedRed = new StripedRed();
	public static StripedPurple StripedPurple = new StripedPurple();
	public static StripedBlue StripedBlue = new StripedBlue();
	public static StripedCyan StripedCyan = new StripedCyan();
	public static StripedGreen StripedGreen = new StripedGreen();
	public static StripedYellow StripedYellow = new StripedYellow();
	public static StripedBrown StripedBrown = new StripedBrown();
	public static StripedGray StripedGray = new StripedGray();
	
	public static FloralRed FloralRed = new FloralRed();
	public static FloralPurple FloralPurple = new FloralPurple();
	public static FloralBlue FloralBlue = new FloralBlue();
	public static FloralCyan FloralCyan = new FloralCyan();
	public static FloralGreen FloralGreen = new FloralGreen();
	public static FloralYellow FloralYellow = new FloralYellow();
	public static FloralBrown FloralBrown = new FloralBrown();
	public static FloralGray FloralGray = new FloralGray();

	public static ClayRed ClayRed = new ClayRed();
	public static ClayPurple ClayPurple = new ClayPurple();
	public static ClayBlue ClayBlue = new ClayBlue();
	public static ClayCyan ClayCyan = new ClayCyan();
	public static ClayGreen ClayGreen = new ClayGreen();
	public static ClayYellow ClayYellow = new ClayYellow();
	public static ClayBrown ClayBrown = new ClayBrown();
	public static ClayGray ClayGray = new ClayGray();
	
	public static BrickRed BrickRed = new BrickRed();
	public static BrickPurple BrickPurple = new BrickPurple();
	public static BrickBlue BrickBlue = new BrickBlue();
	public static BrickCyan BrickCyan = new BrickCyan();
	public static BrickGreen BrickGreen = new BrickGreen();
	public static BrickYellow BrickYellow = new BrickYellow();
	public static BrickBrown BrickBrown = new BrickBrown();
	public static BrickGray BrickGray = new BrickGray();
	
	public static StoneBrickRed StoneBrickRed = new StoneBrickRed();
	public static StoneBrickPurple StoneBrickPurple = new StoneBrickPurple();
	public static StoneBrickBlue StoneBrickBlue = new StoneBrickBlue();
	public static StoneBrickCyan StoneBrickCyan = new StoneBrickCyan();
	public static StoneBrickGreen StoneBrickGreen = new StoneBrickGreen();
	public static StoneBrickYellow StoneBrickYellow = new StoneBrickYellow();
	public static StoneBrickBrown StoneBrickBrown = new StoneBrickBrown();
	public static StoneBrickGray StoneBrickGray = new StoneBrickGray();
	
	public static StoneLampRed StoneLampRed = new StoneLampRed();
	public static StoneLampPurple StoneLampPurple = new StoneLampPurple();
	public static StoneLampBlue StoneLampBlue = new StoneLampBlue();
	public static StoneLampCyan StoneLampCyan = new StoneLampCyan();
	public static StoneLampGreen StoneLampGreen = new StoneLampGreen();
	public static StoneLampYellow StoneLampYellow = new StoneLampYellow();
	public static StoneLampBrown StoneLampBrown = new StoneLampBrown();
	public static StoneLampGray StoneLampGray = new StoneLampGray();
		
	public static RippledRed RippledRed = new RippledRed();
	public static RippledPurple RippledPurple = new RippledPurple();
	public static RippledBlue RippledBlue = new RippledBlue();
	public static RippledCyan RippledCyan = new RippledCyan();
	public static RippledGreen RippledGreen = new RippledGreen();
	public static RippledYellow RippledYellow = new RippledYellow();
	public static RippledBrown RippledBrown = new RippledBrown();
	public static RippledGray RippledGray = new RippledGray();
	
	public static Stamp Stamp = new Stamp();
	
	public static WoodPlankRed WoodPlankRed = new WoodPlankRed();
	public static WoodPlankPurple WoodPlankPurple = new WoodPlankPurple();
	public static WoodPlankBlue WoodPlankBlue = new WoodPlankBlue();
	public static WoodPlankCyan WoodPlankCyan = new WoodPlankCyan();
	public static WoodPlankGreen WoodPlankGreen = new WoodPlankGreen();
	public static WoodPlankYellow WoodPlankYellow = new WoodPlankYellow();
	public static WoodPlankBrown WoodPlankBrown = new WoodPlankBrown();
	public static WoodPlankGray WoodPlankGray = new WoodPlankGray();
	
	public static WoolRed WoolRed = new WoolRed();
	public static WoolPurple WoolPurple = new WoolPurple();
	public static WoolBlue WoolBlue = new WoolBlue();
	public static WoolCyan WoolCyan = new WoolCyan();
	public static WoolGreen WoolGreen = new WoolGreen();
	public static WoolYellow WoolYellow = new WoolYellow();
	public static WoolBrown WoolBrown = new WoolBrown();
	public static WoolGray WoolGray = new WoolGray();
	
	public static CheckeredWoolRed CheckeredWoolRed = new CheckeredWoolRed();
	public static CheckeredWoolPurple CheckeredWoolPurple = new CheckeredWoolPurple();
	public static CheckeredWoolBlue CheckeredWoolBlue = new CheckeredWoolBlue();
	public static CheckeredWoolCyan CheckeredWoolCyan = new CheckeredWoolCyan();
	public static CheckeredWoolGreen CheckeredWoolGreen = new CheckeredWoolGreen();
	public static CheckeredWoolYellow CheckeredWoolYellow = new CheckeredWoolYellow();
	public static CheckeredWoolBrown CheckeredWoolBrown = new CheckeredWoolBrown();
	public static CheckeredWoolGray CheckeredWoolGray = new CheckeredWoolGray();

	public static TintedGlassRed TintedGlassRed = new TintedGlassRed();
	public static TintedGlassPurple TintedGlassPurple = new TintedGlassPurple();
	public static TintedGlassBlue TintedGlassBlue = new TintedGlassBlue();
	public static TintedGlassCyan TintedGlassCyan = new TintedGlassCyan();
	public static TintedGlassGreen TintedGlassGreen = new TintedGlassGreen();
	public static TintedGlassYellow TintedGlassYellow = new TintedGlassYellow();
	public static TintedGlassBrown TintedGlassBrown = new TintedGlassBrown();
	public static TintedGlassGray TintedGlassGray = new TintedGlassGray();
	
	public static TexturedGlassRed TexturedGlassRed = new TexturedGlassRed();
	public static TexturedGlassPurple TexturedGlassPurple = new TexturedGlassPurple();
	public static TexturedGlassBlue TexturedGlassBlue = new TexturedGlassBlue();
	public static TexturedGlassCyan TexturedGlassCyan = new TexturedGlassCyan();
	public static TexturedGlassGreen TexturedGlassGreen = new TexturedGlassGreen();
	public static TexturedGlassYellow TexturedGlassYellow = new TexturedGlassYellow();
	public static TexturedGlassBrown TexturedGlassBrown = new TexturedGlassBrown();
	public static TexturedGlassGray TexturedGlassGray = new TexturedGlassGray();
	
	public static FrostedGlassRed FrostedGlassRed = new FrostedGlassRed();
	public static FrostedGlassPurple FrostedGlassPurple = new FrostedGlassPurple();
	public static FrostedGlassBlue FrostedGlassBlue = new FrostedGlassBlue();
	public static FrostedGlassCyan FrostedGlassCyan = new FrostedGlassCyan();
	public static FrostedGlassGreen FrostedGlassGreen = new FrostedGlassGreen();
	public static FrostedGlassYellow FrostedGlassYellow = new FrostedGlassYellow();
	public static FrostedGlassBrown FrostedGlassBrown = new FrostedGlassBrown();
	public static FrostedGlassGray FrostedGlassGray = new FrostedGlassGray();
				
	public static WoolCarpetRed WoolCarpetRed = new WoolCarpetRed();
	public static WoolCarpetPurple WoolCarpetPurple = new WoolCarpetPurple();
	public static WoolCarpetBlue WoolCarpetBlue = new WoolCarpetBlue();
	public static WoolCarpetCyan WoolCarpetCyan = new WoolCarpetCyan();
	public static WoolCarpetGreen WoolCarpetGreen = new WoolCarpetGreen();
	public static WoolCarpetYellow WoolCarpetYellow = new WoolCarpetYellow();
	public static WoolCarpetBrown WoolCarpetBrown = new WoolCarpetBrown();
	public static WoolCarpetGray WoolCarpetGray = new WoolCarpetGray();
			
	public static CheckeredCarpetRed CheckeredCarpetRed = new CheckeredCarpetRed();
	public static CheckeredCarpetPurple CheckeredCarpetPurple = new CheckeredCarpetPurple();
	public static CheckeredCarpetBlue CheckeredCarpetBlue = new CheckeredCarpetBlue();
	public static CheckeredCarpetCyan CheckeredCarpetCyan = new CheckeredCarpetCyan();
	public static CheckeredCarpetGreen CheckeredCarpetGreen = new CheckeredCarpetGreen();
	public static CheckeredCarpetYellow CheckeredCarpetYellow = new CheckeredCarpetYellow();
	public static CheckeredCarpetBrown CheckeredCarpetBrown = new CheckeredCarpetBrown();
	public static CheckeredCarpetGray CheckeredCarpetGray = new CheckeredCarpetGray();


	
	
	


	
	@SideOnly(Side.CLIENT)
	public static void initModels() {		
		SolidRed.initModel();
		SolidPurple.initModel();
		SolidBlue.initModel();
		SolidCyan.initModel();
		SolidGreen.initModel();
		SolidYellow.initModel();
		SolidBrown.initModel();
		SolidGray.initModel();
		
		DiagonallyDottedRed.initModel();
		DiagonallyDottedPurple.initModel();
		DiagonallyDottedBlue.initModel();
		DiagonallyDottedCyan.initModel();
		DiagonallyDottedGreen.initModel();
		DiagonallyDottedYellow.initModel();
		DiagonallyDottedBrown.initModel();
		DiagonallyDottedGray.initModel();
		
		DottedRed.initModel();
		DottedPurple.initModel();
		DottedBlue.initModel();
		DottedCyan.initModel();
		DottedGreen.initModel();
		DottedYellow.initModel();
		DottedBrown.initModel();
		DottedGray.initModel();

		StripedRed.initModel();
		StripedPurple.initModel();
		StripedBlue.initModel();
		StripedCyan.initModel();
		StripedGreen.initModel();
		StripedYellow.initModel();
		StripedBrown.initModel();
		StripedGray.initModel();
		
		FloralRed.initModel();
		FloralPurple.initModel();
		FloralBlue.initModel();
		FloralCyan.initModel();
		FloralGreen.initModel();
		FloralYellow.initModel();
		FloralBrown.initModel();
		FloralGray.initModel();
		
		ClayRed.initModel();
		ClayPurple.initModel();
		ClayBlue.initModel();
		ClayCyan.initModel();
		ClayGreen.initModel();
		ClayYellow.initModel();
		ClayBrown.initModel();
		ClayGray.initModel();
		
		BrickRed.initModel();
		BrickPurple.initModel();
		BrickBlue.initModel();
		BrickCyan.initModel();
		BrickGreen.initModel();
		BrickYellow.initModel();
		BrickBrown.initModel();
		BrickGray.initModel();
		
		StoneBrickRed.initModel();
		StoneBrickPurple.initModel();
		StoneBrickBlue.initModel();
		StoneBrickCyan.initModel();
		StoneBrickGreen.initModel();
		StoneBrickYellow.initModel();
		StoneBrickBrown.initModel();
		StoneBrickGray.initModel();
		
		StoneLampRed.initModel();
		StoneLampPurple.initModel();
		StoneLampBlue.initModel();
		StoneLampCyan.initModel();
		StoneLampGreen.initModel();
		StoneLampYellow.initModel();
		StoneLampBrown.initModel();
		StoneLampGray.initModel();
				
		RippledRed.initModel();
		RippledPurple.initModel();
		RippledBlue.initModel();
		RippledCyan.initModel();
		RippledGreen.initModel();
		RippledYellow.initModel();
		RippledBrown.initModel();
		RippledGray.initModel();
		
		Stamp.initModel();
		
		WoodPlankRed.initModel();
		WoodPlankPurple.initModel();
		WoodPlankBlue.initModel();
		WoodPlankCyan.initModel();
		WoodPlankGreen.initModel();
		WoodPlankYellow.initModel();
		WoodPlankBrown.initModel();
		WoodPlankGray.initModel();
		
		WoolRed.initModel();
		WoolPurple.initModel();
		WoolBlue.initModel();
		WoolCyan.initModel();
		WoolGreen.initModel();
		WoolYellow.initModel();
		WoolBrown.initModel();
		WoolGray.initModel();
		
		CheckeredWoolRed.initModel();
		CheckeredWoolPurple.initModel();
		CheckeredWoolBlue.initModel();
		CheckeredWoolCyan.initModel();
		CheckeredWoolGreen.initModel();
		CheckeredWoolYellow.initModel();
		CheckeredWoolBrown.initModel();
		CheckeredWoolGray.initModel();
	
		TintedGlassRed.initModel();
		TintedGlassPurple.initModel();
		TintedGlassBlue.initModel();
		TintedGlassCyan.initModel();
		TintedGlassGreen.initModel();
		TintedGlassYellow.initModel();
		TintedGlassBrown.initModel();
		TintedGlassGray.initModel();
		
		TexturedGlassRed.initModel();
		TexturedGlassPurple.initModel();
		TexturedGlassBlue.initModel();
		TexturedGlassCyan.initModel();
		TexturedGlassGreen.initModel();
		TexturedGlassYellow.initModel();
		TexturedGlassBrown.initModel();
		TexturedGlassGray.initModel();
		
		FrostedGlassRed.initModel();
		FrostedGlassPurple.initModel();
		FrostedGlassBlue.initModel();
		FrostedGlassCyan.initModel();
		FrostedGlassGreen.initModel();
		FrostedGlassYellow.initModel();
		FrostedGlassBrown.initModel();
		FrostedGlassGray.initModel();
		
		WoolCarpetRed.initModel();
		WoolCarpetPurple.initModel();
		WoolCarpetBlue.initModel();
		WoolCarpetCyan.initModel();
		WoolCarpetGreen.initModel();
		WoolCarpetYellow.initModel();
		WoolCarpetBrown.initModel();
		WoolCarpetGray.initModel();

		CheckeredCarpetRed.initModel();
		CheckeredCarpetPurple.initModel();
		CheckeredCarpetBlue.initModel();
		CheckeredCarpetCyan.initModel();
		CheckeredCarpetGreen.initModel();
		CheckeredCarpetYellow.initModel();
		CheckeredCarpetBrown.initModel();
		CheckeredCarpetGray.initModel();

		

	}
	
	private static void registerBlocks() {
		GameRegistry.register(SolidRed);
		GameRegistry.register(SolidPurple);
		GameRegistry.register(SolidBlue);
		GameRegistry.register(SolidCyan);
		GameRegistry.register(SolidGreen);
		GameRegistry.register(SolidYellow);
		GameRegistry.register(SolidBrown);
		GameRegistry.register(SolidGray);
		
		GameRegistry.register(DiagonallyDottedRed);
		GameRegistry.register(DiagonallyDottedPurple);
		GameRegistry.register(DiagonallyDottedBlue);
		GameRegistry.register(DiagonallyDottedCyan);
		GameRegistry.register(DiagonallyDottedGreen);
		GameRegistry.register(DiagonallyDottedYellow);
		GameRegistry.register(DiagonallyDottedBrown);
		GameRegistry.register(DiagonallyDottedGray);
		
		GameRegistry.register(DottedRed);
		GameRegistry.register(DottedPurple);
		GameRegistry.register(DottedBlue);
		GameRegistry.register(DottedCyan);
		GameRegistry.register(DottedGreen);
		GameRegistry.register(DottedYellow);
		GameRegistry.register(DottedBrown);
		GameRegistry.register(DottedGray);
		
		GameRegistry.register(StripedRed);
		GameRegistry.register(StripedPurple);
		GameRegistry.register(StripedBlue);
		GameRegistry.register(StripedCyan);
		GameRegistry.register(StripedGreen);
		GameRegistry.register(StripedYellow);
		GameRegistry.register(StripedBrown);
		GameRegistry.register(StripedGray);
		
		GameRegistry.register(FloralRed);
		GameRegistry.register(FloralPurple);
		GameRegistry.register(FloralBlue);
		GameRegistry.register(FloralCyan);
		GameRegistry.register(FloralGreen);
		GameRegistry.register(FloralYellow);
		GameRegistry.register(FloralBrown);
		GameRegistry.register(FloralGray);
		
		GameRegistry.register(ClayRed);
		GameRegistry.register(ClayPurple);
		GameRegistry.register(ClayBlue);
		GameRegistry.register(ClayCyan);
		GameRegistry.register(ClayGreen);
		GameRegistry.register(ClayYellow);
		GameRegistry.register(ClayBrown);
		GameRegistry.register(ClayGray);
		
		GameRegistry.register(BrickRed);
		GameRegistry.register(BrickPurple);
		GameRegistry.register(BrickBlue);
		GameRegistry.register(BrickCyan);
		GameRegistry.register(BrickGreen);
		GameRegistry.register(BrickYellow);
		GameRegistry.register(BrickBrown);
		GameRegistry.register(BrickGray);
		
		GameRegistry.register(StoneBrickRed);
		GameRegistry.register(StoneBrickPurple);
		GameRegistry.register(StoneBrickBlue);
		GameRegistry.register(StoneBrickCyan);
		GameRegistry.register(StoneBrickGreen);
		GameRegistry.register(StoneBrickYellow);
		GameRegistry.register(StoneBrickBrown);
		GameRegistry.register(StoneBrickGray);
		
		GameRegistry.register(StoneLampRed);
		GameRegistry.register(StoneLampPurple);
		GameRegistry.register(StoneLampBlue);
		GameRegistry.register(StoneLampCyan);
		GameRegistry.register(StoneLampGreen);
		GameRegistry.register(StoneLampYellow);
		GameRegistry.register(StoneLampBrown);
		GameRegistry.register(StoneLampGray);
				
		GameRegistry.register(RippledRed);
		GameRegistry.register(RippledPurple);
		GameRegistry.register(RippledBlue);
		GameRegistry.register(RippledCyan);
		GameRegistry.register(RippledGreen);
		GameRegistry.register(RippledYellow);
		GameRegistry.register(RippledBrown);
		GameRegistry.register(RippledGray);
		
		GameRegistry.register(Stamp);
		
		GameRegistry.register(WoodPlankRed);
		GameRegistry.register(WoodPlankPurple);
		GameRegistry.register(WoodPlankBlue);
		GameRegistry.register(WoodPlankCyan);
		GameRegistry.register(WoodPlankGreen);
		GameRegistry.register(WoodPlankYellow);
		GameRegistry.register(WoodPlankBrown);
		GameRegistry.register(WoodPlankGray);
		
		GameRegistry.register(WoolRed);
		GameRegistry.register(WoolPurple);
		GameRegistry.register(WoolBlue);
		GameRegistry.register(WoolCyan);
		GameRegistry.register(WoolGreen);
		GameRegistry.register(WoolYellow);
		GameRegistry.register(WoolBrown);
		GameRegistry.register(WoolGray);
		
		GameRegistry.register(CheckeredWoolRed);
		GameRegistry.register(CheckeredWoolPurple);
		GameRegistry.register(CheckeredWoolBlue);
		GameRegistry.register(CheckeredWoolCyan);
		GameRegistry.register(CheckeredWoolGreen);
		GameRegistry.register(CheckeredWoolYellow);
		GameRegistry.register(CheckeredWoolBrown);
		GameRegistry.register(CheckeredWoolGray);

		GameRegistry.register(TintedGlassRed);
		GameRegistry.register(TintedGlassPurple);
		GameRegistry.register(TintedGlassBlue);
		GameRegistry.register(TintedGlassCyan);
		GameRegistry.register(TintedGlassGreen);
		GameRegistry.register(TintedGlassYellow);
		GameRegistry.register(TintedGlassBrown);
		GameRegistry.register(TintedGlassGray);
		
		GameRegistry.register(TexturedGlassRed);
		GameRegistry.register(TexturedGlassPurple);
		GameRegistry.register(TexturedGlassBlue);
		GameRegistry.register(TexturedGlassCyan);
		GameRegistry.register(TexturedGlassGreen);
		GameRegistry.register(TexturedGlassYellow);
		GameRegistry.register(TexturedGlassBrown);
		GameRegistry.register(TexturedGlassGray);
		
		GameRegistry.register(FrostedGlassRed);
		GameRegistry.register(FrostedGlassPurple);
		GameRegistry.register(FrostedGlassBlue);
		GameRegistry.register(FrostedGlassCyan);
		GameRegistry.register(FrostedGlassGreen);
		GameRegistry.register(FrostedGlassYellow);
		GameRegistry.register(FrostedGlassBrown);
		GameRegistry.register(FrostedGlassGray);		
				
		GameRegistry.register(WoolCarpetRed);
		GameRegistry.register(WoolCarpetPurple);
		GameRegistry.register(WoolCarpetBlue);
		GameRegistry.register(WoolCarpetCyan);
		GameRegistry.register(WoolCarpetGreen);
		GameRegistry.register(WoolCarpetYellow);
		GameRegistry.register(WoolCarpetBrown);
		GameRegistry.register(WoolCarpetGray);
		
		GameRegistry.register(CheckeredCarpetRed);
		GameRegistry.register(CheckeredCarpetPurple);
		GameRegistry.register(CheckeredCarpetBlue);
		GameRegistry.register(CheckeredCarpetCyan);
		GameRegistry.register(CheckeredCarpetGreen);
		GameRegistry.register(CheckeredCarpetYellow);
		GameRegistry.register(CheckeredCarpetBrown);
		GameRegistry.register(CheckeredCarpetGray);
		
		
		
		
		
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