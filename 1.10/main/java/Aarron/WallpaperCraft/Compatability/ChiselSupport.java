package Aarron.WallpaperCraft.Compatability;

import Aarron.WallpaperCraft.BlockStates.BlockTypes;
import Aarron.WallpaperCraft.BlockStates.BlockTypes2;
import Aarron.WallpaperCraft.Init.ModBlocks;
import net.minecraft.block.state.IBlockState;
import team.chisel.api.carving.CarvingUtils;
import team.chisel.api.carving.ICarvingGroup;
import team.chisel.api.carving.ICarvingRegistry;



public class ChiselSupport {
	
	
    
	public static void init() {
		ICarvingRegistry chisel = CarvingUtils.getChiselRegistry();
		if (chisel == null) {
			return;
		}
		
		ICarvingGroup SolidRed = getGroup(chisel, "SolidRed");
		ICarvingGroup SolidPurple = getGroup(chisel, "SolidPurple");
		ICarvingGroup SolidBlue = getGroup(chisel, "SolidBlue");
		ICarvingGroup SolidCyan = getGroup(chisel, "SolidCyan");
		ICarvingGroup SolidGreen = getGroup(chisel, "SolidGreen");
		ICarvingGroup SolidYellow = getGroup(chisel, "SolidYellow");
		ICarvingGroup SolidBrown = getGroup(chisel, "SolidBrown");
		ICarvingGroup SolidGray = getGroup(chisel, "SolidGray");
		
		ICarvingGroup DiagonallyDottedRed = getGroup(chisel, "DiagonallyDottedRed");
		ICarvingGroup DiagonallyDottedPurple = getGroup(chisel, "DiagonallyDottedPurple");
		ICarvingGroup DiagonallyDottedBlue = getGroup(chisel, "DiagonallyDottedBlue");
		ICarvingGroup DiagonallyDottedCyan = getGroup(chisel, "DiagonallyDottedCyan");
		ICarvingGroup DiagonallyDottedGreen = getGroup(chisel, "DiagonallyDottedGreen");
		ICarvingGroup DiagonallyDottedYellow = getGroup(chisel, "DiagonallyDottedYellow");
		ICarvingGroup DiagonallyDottedBrown = getGroup(chisel, "DiagonallyDottedBrown");
		ICarvingGroup DiagonallyDottedGray = getGroup(chisel, "DiagonallyDottedGray");
		
		ICarvingGroup StripedRed = getGroup(chisel, "StripedRed");
		ICarvingGroup StripedPurple = getGroup(chisel, "StripedPurple");
		ICarvingGroup StripedBlue = getGroup(chisel, "StripedBlue");
		ICarvingGroup StripedCyan = getGroup(chisel, "StripedCyan");
		ICarvingGroup StripedGreen = getGroup(chisel, "StripedGreen");
		ICarvingGroup StripedYellow = getGroup(chisel, "StripedYellow");
		ICarvingGroup StripedBrown = getGroup(chisel, "StripedBrown");
		ICarvingGroup StripedGray = getGroup(chisel, "StripedGray");
		
		ICarvingGroup FloralRed = getGroup(chisel, "FloralRed");
		ICarvingGroup FloralPurple = getGroup(chisel, "FloralPurple");
		ICarvingGroup FloralBlue = getGroup(chisel, "FloralBlue");
		ICarvingGroup FloralCyan = getGroup(chisel, "FloralCyan");
		ICarvingGroup FloralGreen = getGroup(chisel, "FloralGreen");
		ICarvingGroup FloralYellow = getGroup(chisel, "FloralYellow");
		ICarvingGroup FloralBrown = getGroup(chisel, "FloralBrown");
		ICarvingGroup FloralGray = getGroup(chisel, "FloralGray");
		
		ICarvingGroup ClayRed = getGroup(chisel, "ClayRed");
		ICarvingGroup ClayPurple = getGroup(chisel, "ClayPurple");
		ICarvingGroup ClayBlue = getGroup(chisel, "ClayBlue");
		ICarvingGroup ClayCyan = getGroup(chisel, "ClayCyan");
		ICarvingGroup ClayGreen = getGroup(chisel, "ClayGreen");
		ICarvingGroup ClayYellow = getGroup(chisel, "ClayYellow");
		ICarvingGroup ClayBrown = getGroup(chisel, "ClayBrown");
		ICarvingGroup ClayGray = getGroup(chisel, "ClayGray");
		
		ICarvingGroup TintedGlassRed = getGroup(chisel, "TintedGlassRed");
		ICarvingGroup TintedGlassPurple = getGroup(chisel, "TintedGlassPurple");
		ICarvingGroup TintedGlassBlue = getGroup(chisel, "TintedGlassBlue");
		ICarvingGroup TintedGlassCyan = getGroup(chisel, "TintedGlassCyan");
		ICarvingGroup TintedGlassGreen = getGroup(chisel, "TintedGlassGreen");
		ICarvingGroup TintedGlassYellow = getGroup(chisel, "TintedGlassYellow");
		ICarvingGroup TintedGlassBrown = getGroup(chisel, "TintedGlassBrown");
		ICarvingGroup TintedGlassGray = getGroup(chisel, "TintedGlassGray");
		
		ICarvingGroup TexturedGlassRed = getGroup(chisel, "TexturedGlassRed");
		ICarvingGroup TexturedGlassPurple = getGroup(chisel, "TexturedGlassPurple");
		ICarvingGroup TexturedGlassBlue = getGroup(chisel, "TexturedGlassBlue");
		ICarvingGroup TexturedGlassCyan = getGroup(chisel, "TexturedGlassCyan");
		ICarvingGroup TexturedGlassGreen = getGroup(chisel, "TexturedGlassGreen");
		ICarvingGroup TexturedGlassYellow = getGroup(chisel, "TexturedGlassYellow");
		ICarvingGroup TexturedGlassBrown = getGroup(chisel, "TexturedGlassBrown");
		ICarvingGroup TexturedGlassGray = getGroup(chisel, "TexturedGlassGray");
		
		ICarvingGroup FrostedGlassRed = getGroup(chisel, "FrostedGlassRed");
		ICarvingGroup FrostedGlassPurple = getGroup(chisel, "FrostedGlassPurple");
		ICarvingGroup FrostedGlassBlue = getGroup(chisel, "FrostedGlassBlue");
		ICarvingGroup FrostedGlassCyan = getGroup(chisel, "FrostedGlassCyan");
		ICarvingGroup FrostedGlassGreen = getGroup(chisel, "FrostedGlassGreen");
		ICarvingGroup FrostedGlassYellow = getGroup(chisel, "FrostedGlassYellow");
		ICarvingGroup FrostedGlassBrown = getGroup(chisel, "FrostedGlassBrown");
		ICarvingGroup FrostedGlassGray = getGroup(chisel, "FrostedGlassGray");
		
		ICarvingGroup BrickRed = getGroup(chisel, "BrickRed");
		ICarvingGroup BrickPurple = getGroup(chisel, "BrickPurple");
		ICarvingGroup BrickBlue = getGroup(chisel, "BrickBlue");
		ICarvingGroup BrickCyan = getGroup(chisel, "BrickCyan");
		ICarvingGroup BrickGreen = getGroup(chisel, "BrickGreen");
		ICarvingGroup BrickYellow = getGroup(chisel, "BrickYellow");
		ICarvingGroup BrickBrown = getGroup(chisel, "BrickBrown");
		ICarvingGroup BrickGray = getGroup(chisel, "BrickGray");
		
		ICarvingGroup DottedCarpetRed = getGroup(chisel, "DottedCarpetRed");
		ICarvingGroup DottedCarpetPurple = getGroup(chisel, "DottedCarpetPurple");
		ICarvingGroup DottedCarpetBlue = getGroup(chisel, "DottedCarpetBlue");
		ICarvingGroup DottedCarpetCyan = getGroup(chisel, "DottedCarpetCyan");
		ICarvingGroup DottedCarpetGreen = getGroup(chisel, "DottedCarpetGreen");
		ICarvingGroup DottedCarpetYellow = getGroup(chisel, "DottedCarpetYellow");
		ICarvingGroup DottedCarpetBrown = getGroup(chisel, "DottedCarpetBrown");
		ICarvingGroup DottedCarpetGray = getGroup(chisel, "DottedCarpetGray");
				
		ICarvingGroup DottedRugRed = getGroup(chisel, "DottedRugRed");
		ICarvingGroup DottedRugPurple = getGroup(chisel, "DottedRugPurple");
		ICarvingGroup DottedRugBlue = getGroup(chisel, "DottedRugBlue");
		ICarvingGroup DottedRugCyan = getGroup(chisel, "DottedRugCyan");
		ICarvingGroup DottedRugGreen = getGroup(chisel, "DottedRugGreen");
		ICarvingGroup DottedRugYellow = getGroup(chisel, "DottedRugYellow");
		ICarvingGroup DottedRugBrown = getGroup(chisel, "DottedRugBrown");
		ICarvingGroup DottedRugGray = getGroup(chisel, "DottedRugGray");
		
		ICarvingGroup CheckeredCarpetRed = getGroup(chisel, "CheckeredCarpetRed");
		ICarvingGroup CheckeredCarpetPurple = getGroup(chisel, "CheckeredCarpetPurple");
		ICarvingGroup CheckeredCarpetBlue = getGroup(chisel, "CheckeredCarpetBlue");
		ICarvingGroup CheckeredCarpetCyan = getGroup(chisel, "CheckeredCarpetCyan");
		ICarvingGroup CheckeredCarpetGreen = getGroup(chisel, "CheckeredCarpetGreen");
		ICarvingGroup CheckeredCarpetYellow = getGroup(chisel, "CheckeredCarpetYellow");
		ICarvingGroup CheckeredCarpetBrown = getGroup(chisel, "CheckeredCarpetBrown");
		ICarvingGroup CheckeredCarpetGray = getGroup(chisel, "CheckeredCarpetGray");
		
		ICarvingGroup CheckeredRugRed = getGroup(chisel, "CheckeredRugRed");
		ICarvingGroup CheckeredRugPurple = getGroup(chisel, "CheckeredRugPurple");
		ICarvingGroup CheckeredRugBlue = getGroup(chisel, "CheckeredRugBlue");
		ICarvingGroup CheckeredRugCyan = getGroup(chisel, "CheckeredRugCyan");
		ICarvingGroup CheckeredRugGreen = getGroup(chisel, "CheckeredRugGreen");
		ICarvingGroup CheckeredRugYellow = getGroup(chisel, "CheckeredRugYellow");
		ICarvingGroup CheckeredRugBrown = getGroup(chisel, "CheckeredRugBrown");
		ICarvingGroup CheckeredRugGray = getGroup(chisel, "CheckeredRugGray");

		
		chisel.addGroup(SolidRed);
		chisel.addGroup(SolidPurple);
		chisel.addGroup(SolidBlue);
		chisel.addGroup(SolidCyan);
		chisel.addGroup(SolidGreen);
		chisel.addGroup(SolidYellow);
		chisel.addGroup(SolidBrown);
		chisel.addGroup(SolidGray);
		
		chisel.addGroup(DiagonallyDottedRed);
		chisel.addGroup(DiagonallyDottedPurple);
		chisel.addGroup(DiagonallyDottedBlue);
		chisel.addGroup(DiagonallyDottedCyan);
		chisel.addGroup(DiagonallyDottedGreen);
		chisel.addGroup(DiagonallyDottedYellow);
		chisel.addGroup(DiagonallyDottedBrown);
		chisel.addGroup(DiagonallyDottedGray);
		
		chisel.addGroup(StripedRed);
		chisel.addGroup(StripedPurple);
		chisel.addGroup(StripedBlue);
		chisel.addGroup(StripedCyan);
		chisel.addGroup(StripedGreen);
		chisel.addGroup(StripedYellow);
		chisel.addGroup(StripedBrown);
		chisel.addGroup(StripedGray);
		
		chisel.addGroup(FloralRed);
		chisel.addGroup(FloralPurple);
		chisel.addGroup(FloralBlue);
		chisel.addGroup(FloralCyan);
		chisel.addGroup(FloralGreen);
		chisel.addGroup(FloralYellow);
		chisel.addGroup(FloralBrown);
		chisel.addGroup(FloralGray);
		
		chisel.addGroup(ClayRed);
		chisel.addGroup(ClayPurple);
		chisel.addGroup(ClayBlue);
		chisel.addGroup(ClayCyan);
		chisel.addGroup(ClayGreen);
		chisel.addGroup(ClayYellow);
		chisel.addGroup(ClayBrown);
		chisel.addGroup(ClayGray);
		
		chisel.addGroup(TintedGlassRed);
		chisel.addGroup(TintedGlassPurple);
		chisel.addGroup(TintedGlassBlue);
		chisel.addGroup(TintedGlassCyan);
		chisel.addGroup(TintedGlassGreen);
		chisel.addGroup(TintedGlassYellow);
		chisel.addGroup(TintedGlassBrown);
		chisel.addGroup(TintedGlassGray);
		
		chisel.addGroup(TexturedGlassRed);
		chisel.addGroup(TexturedGlassPurple);
		chisel.addGroup(TexturedGlassBlue);
		chisel.addGroup(TexturedGlassCyan);
		chisel.addGroup(TexturedGlassGreen);
		chisel.addGroup(TexturedGlassYellow);
		chisel.addGroup(TexturedGlassBrown);
		chisel.addGroup(TexturedGlassGray);
		
		chisel.addGroup(FrostedGlassRed);
		chisel.addGroup(FrostedGlassPurple);
		chisel.addGroup(FrostedGlassBlue);
		chisel.addGroup(FrostedGlassCyan);
		chisel.addGroup(FrostedGlassGreen);
		chisel.addGroup(FrostedGlassYellow);
		chisel.addGroup(FrostedGlassBrown);
		chisel.addGroup(FrostedGlassGray);
		
		chisel.addGroup(BrickRed);
		chisel.addGroup(BrickPurple);
		chisel.addGroup(BrickBlue);
		chisel.addGroup(BrickCyan);
		chisel.addGroup(BrickGreen);
		chisel.addGroup(BrickYellow);
		chisel.addGroup(BrickBrown);
		chisel.addGroup(BrickGray);
		
		chisel.addGroup(DottedCarpetRed);
		chisel.addGroup(DottedCarpetPurple);
		chisel.addGroup(DottedCarpetBlue);
		chisel.addGroup(DottedCarpetCyan);
		chisel.addGroup(DottedCarpetGreen);
		chisel.addGroup(DottedCarpetYellow);
		chisel.addGroup(DottedCarpetBrown);
		chisel.addGroup(DottedCarpetGray);
		
		chisel.addGroup(DottedRugRed);
		chisel.addGroup(DottedRugPurple);
		chisel.addGroup(DottedRugBlue);
		chisel.addGroup(DottedRugCyan);
		chisel.addGroup(DottedRugGreen);
		chisel.addGroup(DottedRugYellow);
		chisel.addGroup(DottedRugBrown);
		chisel.addGroup(DottedRugGray);
		
		chisel.addGroup(CheckeredCarpetRed);
		chisel.addGroup(CheckeredCarpetPurple);
		chisel.addGroup(CheckeredCarpetBlue);
		chisel.addGroup(CheckeredCarpetCyan);
		chisel.addGroup(CheckeredCarpetGreen);
		chisel.addGroup(CheckeredCarpetYellow);
		chisel.addGroup(CheckeredCarpetBrown);
		chisel.addGroup(CheckeredCarpetGray);
		
		chisel.addGroup(CheckeredRugRed);
		chisel.addGroup(CheckeredRugPurple);
		chisel.addGroup(CheckeredRugBlue);
		chisel.addGroup(CheckeredRugCyan);
		chisel.addGroup(CheckeredRugGreen);
		chisel.addGroup(CheckeredRugYellow);
		chisel.addGroup(CheckeredRugBrown);
		chisel.addGroup(CheckeredRugGray);
		
		

		
		for (BlockTypes type : BlockTypes.values()) {
			IBlockState SolidRedState = ModBlocks.SolidRed.getStateFromMeta(type.getMeta());
			IBlockState SolidPurpleState = ModBlocks.SolidPurple.getStateFromMeta(type.getMeta());
			IBlockState SolidBlueState = ModBlocks.SolidBlue.getStateFromMeta(type.getMeta());
			IBlockState SolidgreenState = ModBlocks.SolidGreen.getStateFromMeta(type.getMeta());
			IBlockState SolidYellowState = ModBlocks.SolidYellow.getStateFromMeta(type.getMeta());
			IBlockState SolidBrownState = ModBlocks.SolidBrown.getStateFromMeta(type.getMeta());
			IBlockState SolidGrayState = ModBlocks.SolidGray.getStateFromMeta(type.getMeta());
			
			chisel.addVariation(SolidRed.getName(), SolidRedState, 99);
			chisel.addVariation(SolidPurple.getName(), SolidPurpleState, 99);
			chisel.addVariation(SolidBlue.getName(), SolidBlueState, 99);
			chisel.addVariation(SolidGreen.getName(), SolidgreenState, 99);
			chisel.addVariation(SolidYellow.getName(), SolidYellowState, 99);
			chisel.addVariation(SolidBrown.getName(), SolidBrownState, 99);
			chisel.addVariation(SolidGray.getName(), SolidGrayState, 99);
			
			
			
			IBlockState DiagonallyDottedRedState = ModBlocks.DiagonallyDottedRed.getStateFromMeta(type.getMeta());
			IBlockState DiagonallyDottedPurpleState = ModBlocks.DiagonallyDottedPurple.getStateFromMeta(type.getMeta());
			IBlockState DiagonallyDottedBlueState = ModBlocks.DiagonallyDottedBlue.getStateFromMeta(type.getMeta());
			IBlockState DiagonallyDottedgreenState = ModBlocks.DiagonallyDottedGreen.getStateFromMeta(type.getMeta());
			IBlockState DiagonallyDottedYellowState = ModBlocks.DiagonallyDottedYellow.getStateFromMeta(type.getMeta());
			IBlockState DiagonallyDottedBrownState = ModBlocks.DiagonallyDottedBrown.getStateFromMeta(type.getMeta());
			IBlockState DiagonallyDottedGrayState = ModBlocks.DiagonallyDottedGray.getStateFromMeta(type.getMeta());

			chisel.addVariation(DiagonallyDottedRed.getName(), DiagonallyDottedRedState, 99);
			chisel.addVariation(DiagonallyDottedPurple.getName(), DiagonallyDottedPurpleState, 99);
			chisel.addVariation(DiagonallyDottedBlue.getName(), DiagonallyDottedBlueState, 99);
			chisel.addVariation(DiagonallyDottedGreen.getName(), DiagonallyDottedgreenState, 99);
			chisel.addVariation(DiagonallyDottedYellow.getName(), DiagonallyDottedYellowState, 99);
			chisel.addVariation(DiagonallyDottedBrown.getName(), DiagonallyDottedBrownState, 99);
			chisel.addVariation(DiagonallyDottedGray.getName(), DiagonallyDottedGrayState, 99);
			
			
			
			IBlockState StripedRedState = ModBlocks.StripedRed.getStateFromMeta(type.getMeta());
			IBlockState StripedPurpleState = ModBlocks.StripedPurple.getStateFromMeta(type.getMeta());
			IBlockState StripedBlueState = ModBlocks.StripedBlue.getStateFromMeta(type.getMeta());
			IBlockState StripedgreenState = ModBlocks.StripedGreen.getStateFromMeta(type.getMeta());
			IBlockState StripedYellowState = ModBlocks.StripedYellow.getStateFromMeta(type.getMeta());
			IBlockState StripedBrownState = ModBlocks.StripedBrown.getStateFromMeta(type.getMeta());
			IBlockState StripedGrayState = ModBlocks.StripedGray.getStateFromMeta(type.getMeta());

			chisel.addVariation(StripedRed.getName(), StripedRedState, 99);
			chisel.addVariation(StripedPurple.getName(), StripedPurpleState, 99);
			chisel.addVariation(StripedBlue.getName(), StripedBlueState, 99);
			chisel.addVariation(StripedGreen.getName(), StripedgreenState, 99);
			chisel.addVariation(StripedYellow.getName(), StripedYellowState, 99);
			chisel.addVariation(StripedBrown.getName(), StripedBrownState, 99);
			chisel.addVariation(StripedGray.getName(), StripedGrayState, 99);
			
			
			
			IBlockState FloralRedState = ModBlocks.FloralRed.getStateFromMeta(type.getMeta());
			IBlockState FloralPurpleState = ModBlocks.FloralPurple.getStateFromMeta(type.getMeta());
			IBlockState FloralBlueState = ModBlocks.FloralBlue.getStateFromMeta(type.getMeta());
			IBlockState FloralgreenState = ModBlocks.FloralGreen.getStateFromMeta(type.getMeta());
			IBlockState FloralYellowState = ModBlocks.FloralYellow.getStateFromMeta(type.getMeta());
			IBlockState FloralBrownState = ModBlocks.FloralBrown.getStateFromMeta(type.getMeta());
			IBlockState FloralGrayState = ModBlocks.FloralGray.getStateFromMeta(type.getMeta());

			chisel.addVariation(FloralRed.getName(), FloralRedState, 99);
			chisel.addVariation(FloralPurple.getName(), FloralPurpleState, 99);
			chisel.addVariation(FloralBlue.getName(), FloralBlueState, 99);
			chisel.addVariation(FloralGreen.getName(), FloralgreenState, 99);
			chisel.addVariation(FloralYellow.getName(), FloralYellowState, 99);
			chisel.addVariation(FloralBrown.getName(), FloralBrownState, 99);
			chisel.addVariation(FloralGray.getName(), FloralGrayState, 99);
			
			
			
			IBlockState ClayRedState = ModBlocks.ClayRed.getStateFromMeta(type.getMeta());
			IBlockState ClayPurpleState = ModBlocks.ClayPurple.getStateFromMeta(type.getMeta());
			IBlockState ClayBlueState = ModBlocks.ClayBlue.getStateFromMeta(type.getMeta());
			IBlockState ClaygreenState = ModBlocks.ClayGreen.getStateFromMeta(type.getMeta());
			IBlockState ClayYellowState = ModBlocks.ClayYellow.getStateFromMeta(type.getMeta());
			IBlockState ClayBrownState = ModBlocks.ClayBrown.getStateFromMeta(type.getMeta());
			IBlockState ClayGrayState = ModBlocks.ClayGray.getStateFromMeta(type.getMeta());

			chisel.addVariation(ClayRed.getName(), ClayRedState, 99);
			chisel.addVariation(ClayPurple.getName(), ClayPurpleState, 99);
			chisel.addVariation(ClayBlue.getName(), ClayBlueState, 99);
			chisel.addVariation(ClayGreen.getName(), ClaygreenState, 99);
			chisel.addVariation(ClayYellow.getName(), ClayYellowState, 99);
			chisel.addVariation(ClayBrown.getName(), ClayBrownState, 99);
			chisel.addVariation(ClayGray.getName(), ClayGrayState, 99);
			
			
			
			IBlockState TintedGlassRedState = ModBlocks.TintedGlassRed.getStateFromMeta(type.getMeta());
			IBlockState TintedGlassPurpleState = ModBlocks.TintedGlassPurple.getStateFromMeta(type.getMeta());
			IBlockState TintedGlassBlueState = ModBlocks.TintedGlassBlue.getStateFromMeta(type.getMeta());
			IBlockState TintedGlassgreenState = ModBlocks.TintedGlassGreen.getStateFromMeta(type.getMeta());
			IBlockState TintedGlassYellowState = ModBlocks.TintedGlassYellow.getStateFromMeta(type.getMeta());
			IBlockState TintedGlassBrownState = ModBlocks.TintedGlassBrown.getStateFromMeta(type.getMeta());
			IBlockState TintedGlassGrayState = ModBlocks.TintedGlassGray.getStateFromMeta(type.getMeta());

			chisel.addVariation(TintedGlassRed.getName(), TintedGlassRedState, 99);
			chisel.addVariation(TintedGlassPurple.getName(), TintedGlassPurpleState, 99);
			chisel.addVariation(TintedGlassBlue.getName(), TintedGlassBlueState, 99);
			chisel.addVariation(TintedGlassGreen.getName(), TintedGlassgreenState, 99);
			chisel.addVariation(TintedGlassYellow.getName(), TintedGlassYellowState, 99);
			chisel.addVariation(TintedGlassBrown.getName(), TintedGlassBrownState, 99);
			chisel.addVariation(TintedGlassGray.getName(), TintedGlassGrayState, 99);
			
			
			
			IBlockState TexturedGlassRedState = ModBlocks.TexturedGlassRed.getStateFromMeta(type.getMeta());
			IBlockState TexturedGlassPurpleState = ModBlocks.TexturedGlassPurple.getStateFromMeta(type.getMeta());
			IBlockState TexturedGlassBlueState = ModBlocks.TexturedGlassBlue.getStateFromMeta(type.getMeta());
			IBlockState TexturedGlassgreenState = ModBlocks.TexturedGlassGreen.getStateFromMeta(type.getMeta());
			IBlockState TexturedGlassYellowState = ModBlocks.TexturedGlassYellow.getStateFromMeta(type.getMeta());
			IBlockState TexturedGlassBrownState = ModBlocks.TexturedGlassBrown.getStateFromMeta(type.getMeta());
			IBlockState TexturedGlassGrayState = ModBlocks.TexturedGlassGray.getStateFromMeta(type.getMeta());

			chisel.addVariation(TexturedGlassRed.getName(), TexturedGlassRedState, 99);
			chisel.addVariation(TexturedGlassPurple.getName(), TexturedGlassPurpleState, 99);
			chisel.addVariation(TexturedGlassBlue.getName(), TexturedGlassBlueState, 99);
			chisel.addVariation(TexturedGlassGreen.getName(), TexturedGlassgreenState, 99);
			chisel.addVariation(TexturedGlassYellow.getName(), TexturedGlassYellowState, 99);
			chisel.addVariation(TexturedGlassBrown.getName(), TexturedGlassBrownState, 99);
			chisel.addVariation(TexturedGlassGray.getName(), TexturedGlassGrayState, 99);
			
			
			
			IBlockState FrostedGlassRedState = ModBlocks.FrostedGlassRed.getStateFromMeta(type.getMeta());
			IBlockState FrostedGlassPurpleState = ModBlocks.FrostedGlassPurple.getStateFromMeta(type.getMeta());
			IBlockState FrostedGlassBlueState = ModBlocks.FrostedGlassBlue.getStateFromMeta(type.getMeta());
			IBlockState FrostedGlassgreenState = ModBlocks.FrostedGlassGreen.getStateFromMeta(type.getMeta());
			IBlockState FrostedGlassYellowState = ModBlocks.FrostedGlassYellow.getStateFromMeta(type.getMeta());
			IBlockState FrostedGlassBrownState = ModBlocks.FrostedGlassBrown.getStateFromMeta(type.getMeta());
			IBlockState FrostedGlassGrayState = ModBlocks.FrostedGlassGray.getStateFromMeta(type.getMeta());

			chisel.addVariation(FrostedGlassRed.getName(), FrostedGlassRedState, 99);
			chisel.addVariation(FrostedGlassPurple.getName(), FrostedGlassPurpleState, 99);
			chisel.addVariation(FrostedGlassBlue.getName(), FrostedGlassBlueState, 99);
			chisel.addVariation(FrostedGlassGreen.getName(), FrostedGlassgreenState, 99);
			chisel.addVariation(FrostedGlassYellow.getName(), FrostedGlassYellowState, 99);
			chisel.addVariation(FrostedGlassBrown.getName(), FrostedGlassBrownState, 99);
			chisel.addVariation(FrostedGlassGray.getName(), FrostedGlassGrayState, 99);
			
			
			
			IBlockState BrickRedState = ModBlocks.BrickRed.getStateFromMeta(type.getMeta());
			IBlockState BrickPurpleState = ModBlocks.BrickPurple.getStateFromMeta(type.getMeta());
			IBlockState BrickBlueState = ModBlocks.BrickBlue.getStateFromMeta(type.getMeta());
			IBlockState BrickgreenState = ModBlocks.BrickGreen.getStateFromMeta(type.getMeta());
			IBlockState BrickYellowState = ModBlocks.BrickYellow.getStateFromMeta(type.getMeta());
			IBlockState BrickBrownState = ModBlocks.BrickBrown.getStateFromMeta(type.getMeta());
			IBlockState BrickGrayState = ModBlocks.BrickGray.getStateFromMeta(type.getMeta());

			chisel.addVariation(BrickRed.getName(), BrickRedState, 99);
			chisel.addVariation(BrickPurple.getName(), BrickPurpleState, 99);
			chisel.addVariation(BrickBlue.getName(), BrickBlueState, 99);
			chisel.addVariation(BrickGreen.getName(), BrickgreenState, 99);
			chisel.addVariation(BrickYellow.getName(), BrickYellowState, 99);
			chisel.addVariation(BrickBrown.getName(), BrickBrownState, 99);
			chisel.addVariation(BrickGray.getName(), BrickGrayState, 99);
			
			
			
			IBlockState DottedCarpetRedState = ModBlocks.DottedCarpetRed.getStateFromMeta(type.getMeta());
			IBlockState DottedCarpetPurpleState = ModBlocks.DottedCarpetPurple.getStateFromMeta(type.getMeta());
			IBlockState DottedCarpetBlueState = ModBlocks.DottedCarpetBlue.getStateFromMeta(type.getMeta());
			IBlockState DottedCarpetgreenState = ModBlocks.DottedCarpetGreen.getStateFromMeta(type.getMeta());
			IBlockState DottedCarpetYellowState = ModBlocks.DottedCarpetYellow.getStateFromMeta(type.getMeta());
			IBlockState DottedCarpetBrownState = ModBlocks.DottedCarpetBrown.getStateFromMeta(type.getMeta());
			IBlockState DottedCarpetGrayState = ModBlocks.DottedCarpetGray.getStateFromMeta(type.getMeta());

			chisel.addVariation(DottedCarpetRed.getName(), DottedCarpetRedState, 99);
			chisel.addVariation(DottedCarpetPurple.getName(), DottedCarpetPurpleState, 99);
			chisel.addVariation(DottedCarpetBlue.getName(), DottedCarpetBlueState, 99);
			chisel.addVariation(DottedCarpetGreen.getName(), DottedCarpetgreenState, 99);
			chisel.addVariation(DottedCarpetYellow.getName(), DottedCarpetYellowState, 99);
			chisel.addVariation(DottedCarpetBrown.getName(), DottedCarpetBrownState, 99);
			chisel.addVariation(DottedCarpetGray.getName(), DottedCarpetGrayState, 99);

			
			
			
			IBlockState DottedRugRedState = ModBlocks.DottedRugRed.getStateFromMeta(type.getMeta());
			IBlockState DottedRugPurpleState = ModBlocks.DottedRugPurple.getStateFromMeta(type.getMeta());
			IBlockState DottedRugBlueState = ModBlocks.DottedRugBlue.getStateFromMeta(type.getMeta());
			IBlockState DottedRuggreenState = ModBlocks.DottedRugGreen.getStateFromMeta(type.getMeta());
			IBlockState DottedRugYellowState = ModBlocks.DottedRugYellow.getStateFromMeta(type.getMeta());
			IBlockState DottedRugBrownState = ModBlocks.DottedRugBrown.getStateFromMeta(type.getMeta());
			IBlockState DottedRugGrayState = ModBlocks.DottedRugGray.getStateFromMeta(type.getMeta());

			chisel.addVariation(DottedRugRed.getName(), DottedRugRedState, 99);
			chisel.addVariation(DottedRugPurple.getName(), DottedRugPurpleState, 99);
			chisel.addVariation(DottedRugBlue.getName(), DottedRugBlueState, 99);
			chisel.addVariation(DottedRugGreen.getName(), DottedRuggreenState, 99);
			chisel.addVariation(DottedRugYellow.getName(), DottedRugYellowState, 99);
			chisel.addVariation(DottedRugBrown.getName(), DottedRugBrownState, 99);
			chisel.addVariation(DottedRugGray.getName(), DottedRugGrayState, 99);
			
			
			
			IBlockState CheckeredCarpetRedState = ModBlocks.CheckeredCarpetRed.getStateFromMeta(type.getMeta());
			IBlockState CheckeredCarpetPurpleState = ModBlocks.CheckeredCarpetPurple.getStateFromMeta(type.getMeta());
			IBlockState CheckeredCarpetBlueState = ModBlocks.CheckeredCarpetBlue.getStateFromMeta(type.getMeta());
			IBlockState CheckeredCarpetgreenState = ModBlocks.CheckeredCarpetGreen.getStateFromMeta(type.getMeta());
			IBlockState CheckeredCarpetYellowState = ModBlocks.CheckeredCarpetYellow.getStateFromMeta(type.getMeta());
			IBlockState CheckeredCarpetBrownState = ModBlocks.CheckeredCarpetBrown.getStateFromMeta(type.getMeta());
			IBlockState CheckeredCarpetGrayState = ModBlocks.CheckeredCarpetGray.getStateFromMeta(type.getMeta());

			chisel.addVariation(CheckeredCarpetRed.getName(), CheckeredCarpetRedState, 99);
			chisel.addVariation(CheckeredCarpetPurple.getName(), CheckeredCarpetPurpleState, 99);
			chisel.addVariation(CheckeredCarpetBlue.getName(), CheckeredCarpetBlueState, 99);
			chisel.addVariation(CheckeredCarpetGreen.getName(), CheckeredCarpetgreenState, 99);
			chisel.addVariation(CheckeredCarpetYellow.getName(), CheckeredCarpetYellowState, 99);
			chisel.addVariation(CheckeredCarpetBrown.getName(), CheckeredCarpetBrownState, 99);
			chisel.addVariation(CheckeredCarpetGray.getName(), CheckeredCarpetGrayState, 99);

			
			
			
			IBlockState CheckeredRugRedState = ModBlocks.CheckeredRugRed.getStateFromMeta(type.getMeta());
			IBlockState CheckeredRugPurpleState = ModBlocks.CheckeredRugPurple.getStateFromMeta(type.getMeta());
			IBlockState CheckeredRugBlueState = ModBlocks.CheckeredRugBlue.getStateFromMeta(type.getMeta());
			IBlockState CheckeredRuggreenState = ModBlocks.CheckeredRugGreen.getStateFromMeta(type.getMeta());
			IBlockState CheckeredRugYellowState = ModBlocks.CheckeredRugYellow.getStateFromMeta(type.getMeta());
			IBlockState CheckeredRugBrownState = ModBlocks.CheckeredRugBrown.getStateFromMeta(type.getMeta());
			IBlockState CheckeredRugGrayState = ModBlocks.CheckeredRugGray.getStateFromMeta(type.getMeta());

			chisel.addVariation(CheckeredRugRed.getName(), CheckeredRugRedState, 99);
			chisel.addVariation(CheckeredRugPurple.getName(), CheckeredRugPurpleState, 99);
			chisel.addVariation(CheckeredRugBlue.getName(), CheckeredRugBlueState, 99);
			chisel.addVariation(CheckeredRugGreen.getName(), CheckeredRuggreenState, 99);
			chisel.addVariation(CheckeredRugYellow.getName(), CheckeredRugYellowState, 99);
			chisel.addVariation(CheckeredRugBrown.getName(), CheckeredRugBrownState, 99);
			chisel.addVariation(CheckeredRugGray.getName(), CheckeredRugGrayState, 99);
			
			
			


		}
		
		
		for (BlockTypes2 type : BlockTypes2.values()) {
			IBlockState SolidCyanState = ModBlocks.SolidCyan.getStateFromMeta(type.getMeta());
			chisel.addVariation(SolidCyan.getName(), SolidCyanState, 99);
			
			IBlockState DiagonallyDottedCyanState = ModBlocks.DiagonallyDottedCyan.getStateFromMeta(type.getMeta());
			chisel.addVariation(DiagonallyDottedCyan.getName(), DiagonallyDottedCyanState, 99);
			
			IBlockState StripedCyanState = ModBlocks.StripedCyan.getStateFromMeta(type.getMeta());
			chisel.addVariation(StripedCyan.getName(), StripedCyanState, 99);
			
			IBlockState FloralCyanState = ModBlocks.FloralCyan.getStateFromMeta(type.getMeta());
			chisel.addVariation(FloralCyan.getName(), FloralCyanState, 99);
			
			IBlockState ClayCyanState = ModBlocks.ClayCyan.getStateFromMeta(type.getMeta());
			chisel.addVariation(ClayCyan.getName(), ClayCyanState, 99);
			
			IBlockState TintedGlassCyanState = ModBlocks.TintedGlassCyan.getStateFromMeta(type.getMeta());
			chisel.addVariation(TintedGlassCyan.getName(), TintedGlassCyanState, 99);
			
			IBlockState TexturedGlassCyanState = ModBlocks.TexturedGlassCyan.getStateFromMeta(type.getMeta());
			chisel.addVariation(TexturedGlassCyan.getName(), TexturedGlassCyanState, 99);
			
			IBlockState FrostedGlassCyanState = ModBlocks.FrostedGlassCyan.getStateFromMeta(type.getMeta());
			chisel.addVariation(FrostedGlassCyan.getName(), FrostedGlassCyanState, 99);
			
			IBlockState BrickCyanState = ModBlocks.BrickCyan.getStateFromMeta(type.getMeta());
			chisel.addVariation(BrickCyan.getName(), BrickCyanState, 99);
			
			IBlockState DottedCarpetCyanState = ModBlocks.DottedCarpetCyan.getStateFromMeta(type.getMeta());
			chisel.addVariation(DottedCarpetCyan.getName(), DottedCarpetCyanState, 99);
		
			IBlockState DottedRugCyanState = ModBlocks.DottedRugCyan.getStateFromMeta(type.getMeta());
			chisel.addVariation(DottedRugCyan.getName(), DottedRugCyanState, 99);
			
			IBlockState CheckeredCarpetCyanState = ModBlocks.CheckeredCarpetCyan.getStateFromMeta(type.getMeta());
			chisel.addVariation(CheckeredCarpetCyan.getName(), CheckeredCarpetCyanState, 99);
			
			IBlockState CheckeredRugCyanState = ModBlocks.CheckeredRugCyan.getStateFromMeta(type.getMeta());
			chisel.addVariation(CheckeredRugCyan.getName(), CheckeredRugCyanState, 99);

		}
		

	}


	
	private static ICarvingGroup getGroup(ICarvingRegistry chisel, String name) {
		ICarvingGroup group = CarvingUtils.getDefaultGroupFor(name);
		chisel.addGroup(group);
		return group;
	}
}