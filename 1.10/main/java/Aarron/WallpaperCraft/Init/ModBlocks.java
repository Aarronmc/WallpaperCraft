package Aarron.WallpaperCraft.Init;


import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import Aarron.WallpaperCraft.Blocks.Bricks.*;
import Aarron.WallpaperCraft.Blocks.Carpets.Checkered.*;
import Aarron.WallpaperCraft.Blocks.Carpets.Dotted.*;
import Aarron.WallpaperCraft.Blocks.Rugs.Dotted.*;
import Aarron.WallpaperCraft.Blocks.Rugs.Checkered.*;
import Aarron.WallpaperCraft.Blocks.Clay.*;
import Aarron.WallpaperCraft.Blocks.Dotted.*;
import Aarron.WallpaperCraft.Blocks.Floral.*;
import Aarron.WallpaperCraft.Blocks.Glass.*;
import Aarron.WallpaperCraft.Blocks.Solid.*;
import Aarron.WallpaperCraft.Blocks.Striped.*;


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
	
	public static CheckeredCarpetRed CheckeredCarpetRed = new CheckeredCarpetRed();
	public static CheckeredCarpetPurple CheckeredCarpetPurple = new CheckeredCarpetPurple();
	public static CheckeredCarpetBlue CheckeredCarpetBlue = new CheckeredCarpetBlue();
	public static CheckeredCarpetCyan CheckeredCarpetCyan = new CheckeredCarpetCyan();
	public static CheckeredCarpetGreen CheckeredCarpetGreen = new CheckeredCarpetGreen();
	public static CheckeredCarpetYellow CheckeredCarpetYellow = new CheckeredCarpetYellow();
	public static CheckeredCarpetBrown CheckeredCarpetBrown = new CheckeredCarpetBrown();
	public static CheckeredCarpetGray CheckeredCarpetGray = new CheckeredCarpetGray();

	public static CheckeredRugRed CheckeredRugRed = new CheckeredRugRed();
	public static CheckeredRugPurple CheckeredRugPurple = new CheckeredRugPurple();
	public static CheckeredRugBlue CheckeredRugBlue = new CheckeredRugBlue();
	public static CheckeredRugCyan CheckeredRugCyan = new CheckeredRugCyan();
	public static CheckeredRugGreen CheckeredRugGreen = new CheckeredRugGreen();
	public static CheckeredRugYellow CheckeredRugYellow = new CheckeredRugYellow();
	public static CheckeredRugBrown CheckeredRugBrown = new CheckeredRugBrown();
	public static CheckeredRugGray CheckeredRugGray = new CheckeredRugGray();

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
		
		CheckeredCarpetRed.initModel();
		CheckeredCarpetPurple.initModel();
		CheckeredCarpetBlue.initModel();
		CheckeredCarpetCyan.initModel();
		CheckeredCarpetGreen.initModel();
		CheckeredCarpetYellow.initModel();
		CheckeredCarpetBrown.initModel();
		CheckeredCarpetGray.initModel();

		CheckeredRugRed.initModel();
		CheckeredRugPurple.initModel();
		CheckeredRugBlue.initModel();
		CheckeredRugCyan.initModel();
		CheckeredRugGreen.initModel();
		CheckeredRugYellow.initModel();
		CheckeredRugBrown.initModel();
		CheckeredRugGray.initModel();
	
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
		
		GameRegistry.register(CheckeredCarpetRed);
		GameRegistry.register(CheckeredCarpetPurple);
		GameRegistry.register(CheckeredCarpetBlue);
		GameRegistry.register(CheckeredCarpetCyan);
		GameRegistry.register(CheckeredCarpetGreen);
		GameRegistry.register(CheckeredCarpetYellow);
		GameRegistry.register(CheckeredCarpetBrown);
		GameRegistry.register(CheckeredCarpetGray);
	
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