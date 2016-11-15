package Aarron.WallpaperCraft.Init;


import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import Aarron.WallpaperCraft.Blocks.Bricks.BrickBlue;
import Aarron.WallpaperCraft.Blocks.Bricks.BrickBrown;
import Aarron.WallpaperCraft.Blocks.Bricks.BrickCyan;
import Aarron.WallpaperCraft.Blocks.Bricks.BrickGray;
import Aarron.WallpaperCraft.Blocks.Bricks.BrickGreen;
import Aarron.WallpaperCraft.Blocks.Bricks.BrickPurple;
import Aarron.WallpaperCraft.Blocks.Bricks.BrickRed;
import Aarron.WallpaperCraft.Blocks.Bricks.BrickYellow;
import Aarron.WallpaperCraft.Blocks.Carpets.Dotted.*;
import Aarron.WallpaperCraft.Blocks.Clay.ClayBlue;
import Aarron.WallpaperCraft.Blocks.Clay.ClayBrown;
import Aarron.WallpaperCraft.Blocks.Clay.ClayCyan;
import Aarron.WallpaperCraft.Blocks.Clay.ClayGray;
import Aarron.WallpaperCraft.Blocks.Clay.ClayGreen;
import Aarron.WallpaperCraft.Blocks.Clay.ClayPurple;
import Aarron.WallpaperCraft.Blocks.Clay.ClayRed;
import Aarron.WallpaperCraft.Blocks.Clay.ClayYellow;
import Aarron.WallpaperCraft.Blocks.Dotted.DiagonallyDottedBlue;
import Aarron.WallpaperCraft.Blocks.Dotted.DiagonallyDottedBrown;
import Aarron.WallpaperCraft.Blocks.Dotted.DiagonallyDottedCyan;
import Aarron.WallpaperCraft.Blocks.Dotted.DiagonallyDottedGray;
import Aarron.WallpaperCraft.Blocks.Dotted.DiagonallyDottedGreen;
import Aarron.WallpaperCraft.Blocks.Dotted.DiagonallyDottedPurple;
import Aarron.WallpaperCraft.Blocks.Dotted.DiagonallyDottedRed;
import Aarron.WallpaperCraft.Blocks.Dotted.DiagonallyDottedYellow;
import Aarron.WallpaperCraft.Blocks.Floral.FloralBlue;
import Aarron.WallpaperCraft.Blocks.Floral.FloralBrown;
import Aarron.WallpaperCraft.Blocks.Floral.FloralCyan;
import Aarron.WallpaperCraft.Blocks.Floral.FloralGray;
import Aarron.WallpaperCraft.Blocks.Floral.FloralGreen;
import Aarron.WallpaperCraft.Blocks.Floral.FloralPurple;
import Aarron.WallpaperCraft.Blocks.Floral.FloralRed;
import Aarron.WallpaperCraft.Blocks.Floral.FloralYellow;
import Aarron.WallpaperCraft.Blocks.Glass.FrostedGlassBlue;
import Aarron.WallpaperCraft.Blocks.Glass.FrostedGlassBrown;
import Aarron.WallpaperCraft.Blocks.Glass.FrostedGlassCyan;
import Aarron.WallpaperCraft.Blocks.Glass.FrostedGlassGray;
import Aarron.WallpaperCraft.Blocks.Glass.FrostedGlassGreen;
import Aarron.WallpaperCraft.Blocks.Glass.FrostedGlassPurple;
import Aarron.WallpaperCraft.Blocks.Glass.FrostedGlassRed;
import Aarron.WallpaperCraft.Blocks.Glass.FrostedGlassYellow;
import Aarron.WallpaperCraft.Blocks.Glass.TexturedGlassBlue;
import Aarron.WallpaperCraft.Blocks.Glass.TexturedGlassBrown;
import Aarron.WallpaperCraft.Blocks.Glass.TexturedGlassCyan;
import Aarron.WallpaperCraft.Blocks.Glass.TexturedGlassGray;
import Aarron.WallpaperCraft.Blocks.Glass.TexturedGlassGreen;
import Aarron.WallpaperCraft.Blocks.Glass.TexturedGlassPurple;
import Aarron.WallpaperCraft.Blocks.Glass.TexturedGlassRed;
import Aarron.WallpaperCraft.Blocks.Glass.TexturedGlassYellow;
import Aarron.WallpaperCraft.Blocks.Glass.TintedGlassBlue;
import Aarron.WallpaperCraft.Blocks.Glass.TintedGlassBrown;
import Aarron.WallpaperCraft.Blocks.Glass.TintedGlassCyan;
import Aarron.WallpaperCraft.Blocks.Glass.TintedGlassGray;
import Aarron.WallpaperCraft.Blocks.Glass.TintedGlassGreen;
import Aarron.WallpaperCraft.Blocks.Glass.TintedGlassPurple;
import Aarron.WallpaperCraft.Blocks.Glass.TintedGlassRed;
import Aarron.WallpaperCraft.Blocks.Glass.TintedGlassYellow;
import Aarron.WallpaperCraft.Blocks.Rugs.Dotted.DottedRugBlue;
import Aarron.WallpaperCraft.Blocks.Rugs.Dotted.DottedRugBrown;
import Aarron.WallpaperCraft.Blocks.Rugs.Dotted.DottedRugCyan;
import Aarron.WallpaperCraft.Blocks.Rugs.Dotted.DottedRugGray;
import Aarron.WallpaperCraft.Blocks.Rugs.Dotted.DottedRugGreen;
import Aarron.WallpaperCraft.Blocks.Rugs.Dotted.DottedRugPurple;
import Aarron.WallpaperCraft.Blocks.Rugs.Dotted.DottedRugRed;
import Aarron.WallpaperCraft.Blocks.Rugs.Dotted.DottedRugYellow;
import Aarron.WallpaperCraft.Blocks.Solid.SolidBlue;
import Aarron.WallpaperCraft.Blocks.Solid.SolidBrown;
import Aarron.WallpaperCraft.Blocks.Solid.SolidCyan;
import Aarron.WallpaperCraft.Blocks.Solid.SolidGray;
import Aarron.WallpaperCraft.Blocks.Solid.SolidGreen;
import Aarron.WallpaperCraft.Blocks.Solid.SolidPurple;
import Aarron.WallpaperCraft.Blocks.Solid.SolidRed;
import Aarron.WallpaperCraft.Blocks.Solid.SolidYellow;
import Aarron.WallpaperCraft.Blocks.Striped.StripedBlue;
import Aarron.WallpaperCraft.Blocks.Striped.StripedBrown;
import Aarron.WallpaperCraft.Blocks.Striped.StripedCyan;
import Aarron.WallpaperCraft.Blocks.Striped.StripedGray;
import Aarron.WallpaperCraft.Blocks.Striped.StripedGreen;
import Aarron.WallpaperCraft.Blocks.Striped.StripedPurple;
import Aarron.WallpaperCraft.Blocks.Striped.StripedRed;
import Aarron.WallpaperCraft.Blocks.Striped.StripedYellow;

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

	public static DottedCarpetRed DottedCarpetRed = new DottedCarpetRed();
	public static DottedCarpetPurple DottedCarpetPurple = new DottedCarpetPurple();
	public static DottedCarpetBlue DottedCarpetBlue = new DottedCarpetBlue();
	public static DottedCarpetCyan DottedCarpetCyan = new DottedCarpetCyan();
	public static DottedCarpetGreen DottedCarpetGreen = new DottedCarpetGreen();
	public static DottedCarpetYellow DottedCarpetYellow = new DottedCarpetYellow();
	public static DottedCarpetBrown DottedCarpetBrown = new DottedCarpetBrown();
	public static DottedCarpetGray DottedCarpetGray = new DottedCarpetGray();

	public static DottedRugRed DottedRugRed = new DottedRugRed();
	public static DottedRugPurple DottedRugPurple = new DottedRugPurple();
	public static DottedRugBlue DottedRugBlue = new DottedRugBlue();
	public static DottedRugCyan DottedRugCyan = new DottedRugCyan();
	public static DottedRugGreen DottedRugGreen = new DottedRugGreen();
	public static DottedRugYellow DottedRugYellow = new DottedRugYellow();
	public static DottedRugBrown DottedRugBrown = new DottedRugBrown();
	public static DottedRugGray DottedRugGray = new DottedRugGray();

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

		DottedCarpetRed.initModel();
		DottedCarpetPurple.initModel();
		DottedCarpetBlue.initModel();
		DottedCarpetCyan.initModel();
		DottedCarpetGreen.initModel();
		DottedCarpetYellow.initModel();
		DottedCarpetBrown.initModel();
		DottedCarpetGray.initModel();

		DottedRugRed.initModel();
		DottedRugPurple.initModel();
		DottedRugBlue.initModel();
		DottedRugCyan.initModel();
		DottedRugGreen.initModel();
		DottedRugYellow.initModel();
		DottedRugBrown.initModel();
		DottedRugGray.initModel();
	
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

		GameRegistry.register(DottedCarpetRed);
		GameRegistry.register(DottedCarpetPurple);
		GameRegistry.register(DottedCarpetBlue);
		GameRegistry.register(DottedCarpetCyan);
		GameRegistry.register(DottedCarpetGreen);
		GameRegistry.register(DottedCarpetYellow);
		GameRegistry.register(DottedCarpetBrown);
		GameRegistry.register(DottedCarpetGray);
	
		GameRegistry.register(DottedRugRed);
		GameRegistry.register(DottedRugPurple);
		GameRegistry.register(DottedRugBlue);
		GameRegistry.register(DottedRugCyan);
		GameRegistry.register(DottedRugGreen);
		GameRegistry.register(DottedRugYellow);
		GameRegistry.register(DottedRugBrown);
		GameRegistry.register(DottedRugGray);

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

		

	}
}