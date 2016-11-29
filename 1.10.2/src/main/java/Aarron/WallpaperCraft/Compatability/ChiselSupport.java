package Aarron.WallpaperCraft.compatability;

import net.minecraft.block.state.IBlockState;
import team.chisel.api.carving.CarvingUtils;
import team.chisel.api.carving.ICarvingGroup;
import team.chisel.api.carving.ICarvingRegistry;
import Aarron.WallpaperCraft.blockStates.BlockTypes;
import Aarron.WallpaperCraft.blockStates.BlockTypes2;
import Aarron.WallpaperCraft.blockStates.BlockTypes3;
import Aarron.WallpaperCraft.init.ModBlocks;



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
		
		ICarvingGroup StoneBrickRed = getGroup(chisel, "StoneBrickRed");
		ICarvingGroup StoneBrickPurple = getGroup(chisel, "StoneBrickPurple");
		ICarvingGroup StoneBrickBlue = getGroup(chisel, "StoneBrickBlue");
		ICarvingGroup StoneBrickCyan = getGroup(chisel, "StoneBrickCyan");
		ICarvingGroup StoneBrickGreen = getGroup(chisel, "StoneBrickGreen");
		ICarvingGroup StoneBrickYellow = getGroup(chisel, "StoneBrickYellow");
		ICarvingGroup StoneBrickBrown = getGroup(chisel, "StoneBrickBrown");
		ICarvingGroup StoneBrickGray = getGroup(chisel, "StoneBrickGray");
		
		ICarvingGroup RippledRed = getGroup(chisel, "RippledRed");
		ICarvingGroup RippledPurple = getGroup(chisel, "RippledPurple");
		ICarvingGroup RippledBlue = getGroup(chisel, "RippledBlue");
		ICarvingGroup RippledCyan = getGroup(chisel, "RippledCyan");
		ICarvingGroup RippledGreen = getGroup(chisel, "RippledGreen");
		ICarvingGroup RippledYellow = getGroup(chisel, "RippledYellow");
		ICarvingGroup RippledBrown = getGroup(chisel, "RippledBrown");
		ICarvingGroup RippledGray = getGroup(chisel, "RippledGray");
		
		ICarvingGroup Stamp = getGroup(chisel, "Stamp");
		
		ICarvingGroup WoodPlankRed = getGroup(chisel, "WoodPlankRed");
		ICarvingGroup WoodPlankPurple = getGroup(chisel, "WoodPlankPurple");
		ICarvingGroup WoodPlankBlue = getGroup(chisel, "WoodPlankBlue");
		ICarvingGroup WoodPlankCyan = getGroup(chisel, "WoodPlankCyan");
		ICarvingGroup WoodPlankGreen = getGroup(chisel, "WoodPlankGreen");
		ICarvingGroup WoodPlankYellow = getGroup(chisel, "WoodPlankYellow");
		ICarvingGroup WoodPlankBrown = getGroup(chisel, "WoodPlankBrown");
		ICarvingGroup WoodPlankGray = getGroup(chisel, "WoodPlankGray");
		
		ICarvingGroup DottedRed = getGroup(chisel, "DottedRed");
		ICarvingGroup DottedPurple = getGroup(chisel, "DottedPurple");
		ICarvingGroup DottedBlue = getGroup(chisel, "DottedBlue");
		ICarvingGroup DottedCyan = getGroup(chisel, "DottedCyan");
		ICarvingGroup DottedGreen = getGroup(chisel, "DottedGreen");
		ICarvingGroup DottedYellow = getGroup(chisel, "DottedYellow");
		ICarvingGroup DottedBrown = getGroup(chisel, "DottedBrown");
		ICarvingGroup DottedGray = getGroup(chisel, "DottedGray");
				
		ICarvingGroup WoolRed = getGroup(chisel, "WoolRed");
		ICarvingGroup WoolPurple = getGroup(chisel, "WoolPurple");
		ICarvingGroup WoolBlue = getGroup(chisel, "WoolBlue");
		ICarvingGroup WoolCyan = getGroup(chisel, "WoolCyan");
		ICarvingGroup WoolGreen = getGroup(chisel, "WoolGreen");
		ICarvingGroup WoolYellow = getGroup(chisel, "WoolYellow");
		ICarvingGroup WoolBrown = getGroup(chisel, "WoolBrown");
		ICarvingGroup WoolGray = getGroup(chisel, "WoolGray");
		
		ICarvingGroup WoolCarpetRed = getGroup(chisel, "WoolCarpetRed");
		ICarvingGroup WoolCarpetPurple = getGroup(chisel, "WoolCarpetPurple");
		ICarvingGroup WoolCarpetBlue = getGroup(chisel, "WoolCarpetBlue");
		ICarvingGroup WoolCarpetCyan = getGroup(chisel, "WoolCarpetCyan");
		ICarvingGroup WoolCarpetGreen = getGroup(chisel, "WoolCarpetGreen");
		ICarvingGroup WoolCarpetYellow = getGroup(chisel, "WoolCarpetYellow");
		ICarvingGroup WoolCarpetBrown = getGroup(chisel, "WoolCarpetBrown");
		ICarvingGroup WoolCarpetGray = getGroup(chisel, "WoolCarpetGray");
		
		ICarvingGroup CheckeredWoolRed = getGroup(chisel, "CheckeredWoolRed");
		ICarvingGroup CheckeredWoolPurple = getGroup(chisel, "CheckeredWoolPurple");
		ICarvingGroup CheckeredWoolBlue = getGroup(chisel, "CheckeredWoolBlue");
		ICarvingGroup CheckeredWoolCyan = getGroup(chisel, "CheckeredWoolCyan");
		ICarvingGroup CheckeredWoolGreen = getGroup(chisel, "CheckeredWoolGreen");
		ICarvingGroup CheckeredWoolYellow = getGroup(chisel, "CheckeredWoolYellow");
		ICarvingGroup CheckeredWoolBrown = getGroup(chisel, "CheckeredWoolBrown");
		ICarvingGroup CheckeredWoolGray = getGroup(chisel, "CheckeredWoolGray");
		
		ICarvingGroup CheckeredCarpetRed = getGroup(chisel, "CheckeredCarpetRed");
		ICarvingGroup CheckeredCarpetPurple = getGroup(chisel, "CheckeredCarpetPurple");
		ICarvingGroup CheckeredCarpetBlue = getGroup(chisel, "CheckeredCarpetBlue");
		ICarvingGroup CheckeredCarpetCyan = getGroup(chisel, "CheckeredCarpetCyan");
		ICarvingGroup CheckeredCarpetGreen = getGroup(chisel, "CheckeredCarpetGreen");
		ICarvingGroup CheckeredCarpetYellow = getGroup(chisel, "CheckeredCarpetYellow");
		ICarvingGroup CheckeredCarpetBrown = getGroup(chisel, "CheckeredCarpetBrown");
		ICarvingGroup CheckeredCarpetGray = getGroup(chisel, "CheckeredCarpetGray");

		
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
		
		chisel.addGroup(StoneBrickRed);
		chisel.addGroup(StoneBrickPurple);
		chisel.addGroup(StoneBrickBlue);
		chisel.addGroup(StoneBrickCyan);
		chisel.addGroup(StoneBrickGreen);
		chisel.addGroup(StoneBrickYellow);
		chisel.addGroup(StoneBrickBrown);
		chisel.addGroup(StoneBrickGray);
		
		chisel.addGroup(RippledRed);
		chisel.addGroup(RippledPurple);
		chisel.addGroup(RippledBlue);
		chisel.addGroup(RippledCyan);
		chisel.addGroup(RippledGreen);
		chisel.addGroup(RippledYellow);
		chisel.addGroup(RippledBrown);
		chisel.addGroup(RippledGray);
		
		chisel.addGroup(Stamp);
		
		chisel.addGroup(WoodPlankRed);
		chisel.addGroup(WoodPlankPurple);
		chisel.addGroup(WoodPlankBlue);
		chisel.addGroup(WoodPlankCyan);
		chisel.addGroup(WoodPlankGreen);
		chisel.addGroup(WoodPlankYellow);
		chisel.addGroup(WoodPlankBrown);
		chisel.addGroup(WoodPlankGray);
		
		chisel.addGroup(DottedRed);
		chisel.addGroup(DottedPurple);
		chisel.addGroup(DottedBlue);
		chisel.addGroup(DottedCyan);
		chisel.addGroup(DottedGreen);
		chisel.addGroup(DottedYellow);
		chisel.addGroup(DottedBrown);
		chisel.addGroup(DottedGray);
				
		chisel.addGroup(WoolRed);
		chisel.addGroup(WoolPurple);
		chisel.addGroup(WoolBlue);
		chisel.addGroup(WoolCyan);
		chisel.addGroup(WoolGreen);
		chisel.addGroup(WoolYellow);
		chisel.addGroup(WoolBrown);
		chisel.addGroup(WoolGray);
		
		chisel.addGroup(WoolCarpetRed);
		chisel.addGroup(WoolCarpetPurple);
		chisel.addGroup(WoolCarpetBlue);
		chisel.addGroup(WoolCarpetCyan);
		chisel.addGroup(WoolCarpetGreen);
		chisel.addGroup(WoolCarpetYellow);
		chisel.addGroup(WoolCarpetBrown);
		chisel.addGroup(WoolCarpetGray);
		
		chisel.addGroup(CheckeredWoolRed);
		chisel.addGroup(CheckeredWoolPurple);
		chisel.addGroup(CheckeredWoolBlue);
		chisel.addGroup(CheckeredWoolCyan);
		chisel.addGroup(CheckeredWoolGreen);
		chisel.addGroup(CheckeredWoolYellow);
		chisel.addGroup(CheckeredWoolBrown);
		chisel.addGroup(CheckeredWoolGray);
		
		chisel.addGroup(CheckeredCarpetRed);
		chisel.addGroup(CheckeredCarpetPurple);
		chisel.addGroup(CheckeredCarpetBlue);
		chisel.addGroup(CheckeredCarpetCyan);
		chisel.addGroup(CheckeredCarpetGreen);
		chisel.addGroup(CheckeredCarpetYellow);
		chisel.addGroup(CheckeredCarpetBrown);
		chisel.addGroup(CheckeredCarpetGray);
		
		

		
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
			
			
			
			IBlockState StoneBrickRedState = ModBlocks.StoneBrickRed.getStateFromMeta(type.getMeta());
			IBlockState StoneBrickPurpleState = ModBlocks.StoneBrickPurple.getStateFromMeta(type.getMeta());
			IBlockState StoneBrickBlueState = ModBlocks.StoneBrickBlue.getStateFromMeta(type.getMeta());
			IBlockState StoneBrickgreenState = ModBlocks.StoneBrickGreen.getStateFromMeta(type.getMeta());
			IBlockState StoneBrickYellowState = ModBlocks.StoneBrickYellow.getStateFromMeta(type.getMeta());
			IBlockState StoneBrickBrownState = ModBlocks.StoneBrickBrown.getStateFromMeta(type.getMeta());
			IBlockState StoneBrickGrayState = ModBlocks.StoneBrickGray.getStateFromMeta(type.getMeta());

			chisel.addVariation(StoneBrickRed.getName(), StoneBrickRedState, 99);
			chisel.addVariation(StoneBrickPurple.getName(), StoneBrickPurpleState, 99);
			chisel.addVariation(StoneBrickBlue.getName(), StoneBrickBlueState, 99);
			chisel.addVariation(StoneBrickGreen.getName(), StoneBrickgreenState, 99);
			chisel.addVariation(StoneBrickYellow.getName(), StoneBrickYellowState, 99);
			chisel.addVariation(StoneBrickBrown.getName(), StoneBrickBrownState, 99);
			chisel.addVariation(StoneBrickGray.getName(), StoneBrickGrayState, 99);
			
			
			
			IBlockState RippledRedState = ModBlocks.RippledRed.getStateFromMeta(type.getMeta());
			IBlockState RippledPurpleState = ModBlocks.RippledPurple.getStateFromMeta(type.getMeta());
			IBlockState RippledBlueState = ModBlocks.RippledBlue.getStateFromMeta(type.getMeta());
			IBlockState RippledgreenState = ModBlocks.RippledGreen.getStateFromMeta(type.getMeta());
			IBlockState RippledYellowState = ModBlocks.RippledYellow.getStateFromMeta(type.getMeta());
			IBlockState RippledBrownState = ModBlocks.RippledBrown.getStateFromMeta(type.getMeta());
			IBlockState RippledGrayState = ModBlocks.RippledGray.getStateFromMeta(type.getMeta());

			chisel.addVariation(RippledRed.getName(), RippledRedState, 99);
			chisel.addVariation(RippledPurple.getName(), RippledPurpleState, 99);
			chisel.addVariation(RippledBlue.getName(), RippledBlueState, 99);
			chisel.addVariation(RippledGreen.getName(), RippledgreenState, 99);
			chisel.addVariation(RippledYellow.getName(), RippledYellowState, 99);
			chisel.addVariation(RippledBrown.getName(), RippledBrownState, 99);
			chisel.addVariation(RippledGray.getName(), RippledGrayState, 99);
			
			
			
			
			IBlockState WoodPlankRedState = ModBlocks.WoodPlankRed.getStateFromMeta(type.getMeta());
			IBlockState WoodPlankPurpleState = ModBlocks.WoodPlankPurple.getStateFromMeta(type.getMeta());
			IBlockState WoodPlankBlueState = ModBlocks.WoodPlankBlue.getStateFromMeta(type.getMeta());
			IBlockState WoodPlankgreenState = ModBlocks.WoodPlankGreen.getStateFromMeta(type.getMeta());
			IBlockState WoodPlankYellowState = ModBlocks.WoodPlankYellow.getStateFromMeta(type.getMeta());
			IBlockState WoodPlankBrownState = ModBlocks.WoodPlankBrown.getStateFromMeta(type.getMeta());
			IBlockState WoodPlankGrayState = ModBlocks.WoodPlankGray.getStateFromMeta(type.getMeta());

			chisel.addVariation(WoodPlankRed.getName(), WoodPlankRedState, 99);
			chisel.addVariation(WoodPlankPurple.getName(), WoodPlankPurpleState, 99);
			chisel.addVariation(WoodPlankBlue.getName(), WoodPlankBlueState, 99);
			chisel.addVariation(WoodPlankGreen.getName(), WoodPlankgreenState, 99);
			chisel.addVariation(WoodPlankYellow.getName(), WoodPlankYellowState, 99);
			chisel.addVariation(WoodPlankBrown.getName(), WoodPlankBrownState, 99);
			chisel.addVariation(WoodPlankGray.getName(), WoodPlankGrayState, 99);
			
			
			
			IBlockState DottedRedState = ModBlocks.DottedRed.getStateFromMeta(type.getMeta());
			IBlockState DottedPurpleState = ModBlocks.DottedPurple.getStateFromMeta(type.getMeta());
			IBlockState DottedBlueState = ModBlocks.DottedBlue.getStateFromMeta(type.getMeta());
			IBlockState DottedgreenState = ModBlocks.DottedGreen.getStateFromMeta(type.getMeta());
			IBlockState DottedYellowState = ModBlocks.DottedYellow.getStateFromMeta(type.getMeta());
			IBlockState DottedBrownState = ModBlocks.DottedBrown.getStateFromMeta(type.getMeta());
			IBlockState DottedGrayState = ModBlocks.DottedGray.getStateFromMeta(type.getMeta());

			chisel.addVariation(DottedRed.getName(), DottedRedState, 99);
			chisel.addVariation(DottedPurple.getName(), DottedPurpleState, 99);
			chisel.addVariation(DottedBlue.getName(), DottedBlueState, 99);
			chisel.addVariation(DottedGreen.getName(), DottedgreenState, 99);
			chisel.addVariation(DottedYellow.getName(), DottedYellowState, 99);
			chisel.addVariation(DottedBrown.getName(), DottedBrownState, 99);
			chisel.addVariation(DottedGray.getName(), DottedGrayState, 99);
			
			
			
			IBlockState CheckeredWoolRedState = ModBlocks.CheckeredWoolRed.getStateFromMeta(type.getMeta());
			IBlockState CheckeredWoolPurpleState = ModBlocks.CheckeredWoolPurple.getStateFromMeta(type.getMeta());
			IBlockState CheckeredWoolBlueState = ModBlocks.CheckeredWoolBlue.getStateFromMeta(type.getMeta());
			IBlockState CheckeredWoolgreenState = ModBlocks.CheckeredWoolGreen.getStateFromMeta(type.getMeta());
			IBlockState CheckeredWoolYellowState = ModBlocks.CheckeredWoolYellow.getStateFromMeta(type.getMeta());
			IBlockState CheckeredWoolBrownState = ModBlocks.CheckeredWoolBrown.getStateFromMeta(type.getMeta());
			IBlockState CheckeredWoolGrayState = ModBlocks.CheckeredWoolGray.getStateFromMeta(type.getMeta());

			chisel.addVariation(CheckeredWoolRed.getName(), CheckeredWoolRedState, 99);
			chisel.addVariation(CheckeredWoolPurple.getName(), CheckeredWoolPurpleState, 99);
			chisel.addVariation(CheckeredWoolBlue.getName(), CheckeredWoolBlueState, 99);
			chisel.addVariation(CheckeredWoolGreen.getName(), CheckeredWoolgreenState, 99);
			chisel.addVariation(CheckeredWoolYellow.getName(), CheckeredWoolYellowState, 99);
			chisel.addVariation(CheckeredWoolBrown.getName(), CheckeredWoolBrownState, 99);
			chisel.addVariation(CheckeredWoolGray.getName(), CheckeredWoolGrayState, 99);
						
			
			
			IBlockState WoolRedState = ModBlocks.WoolRed.getStateFromMeta(type.getMeta());
			IBlockState WoolPurpleState = ModBlocks.WoolPurple.getStateFromMeta(type.getMeta());
			IBlockState WoolBlueState = ModBlocks.WoolBlue.getStateFromMeta(type.getMeta());
			IBlockState WoolgreenState = ModBlocks.WoolGreen.getStateFromMeta(type.getMeta());
			IBlockState WoolYellowState = ModBlocks.WoolYellow.getStateFromMeta(type.getMeta());
			IBlockState WoolBrownState = ModBlocks.WoolBrown.getStateFromMeta(type.getMeta());
			IBlockState WoolGrayState = ModBlocks.WoolGray.getStateFromMeta(type.getMeta());

			chisel.addVariation(WoolRed.getName(), WoolRedState, 99);
			chisel.addVariation(WoolPurple.getName(), WoolPurpleState, 99);
			chisel.addVariation(WoolBlue.getName(), WoolBlueState, 99);
			chisel.addVariation(WoolGreen.getName(), WoolgreenState, 99);
			chisel.addVariation(WoolYellow.getName(), WoolYellowState, 99);
			chisel.addVariation(WoolBrown.getName(), WoolBrownState, 99);
			chisel.addVariation(WoolGray.getName(), WoolGrayState, 99);
					
			
			
			IBlockState WoolCarpetRedState = ModBlocks.WoolCarpetRed.getStateFromMeta(type.getMeta());
			IBlockState WoolCarpetPurpleState = ModBlocks.WoolCarpetPurple.getStateFromMeta(type.getMeta());
			IBlockState WoolCarpetBlueState = ModBlocks.WoolCarpetBlue.getStateFromMeta(type.getMeta());
			IBlockState WoolCarpetgreenState = ModBlocks.WoolCarpetGreen.getStateFromMeta(type.getMeta());
			IBlockState WoolCarpetYellowState = ModBlocks.WoolCarpetYellow.getStateFromMeta(type.getMeta());
			IBlockState WoolCarpetBrownState = ModBlocks.WoolCarpetBrown.getStateFromMeta(type.getMeta());
			IBlockState WoolCarpetGrayState = ModBlocks.WoolCarpetGray.getStateFromMeta(type.getMeta());

			chisel.addVariation(WoolCarpetRed.getName(), WoolCarpetRedState, 99);
			chisel.addVariation(WoolCarpetPurple.getName(), WoolCarpetPurpleState, 99);
			chisel.addVariation(WoolCarpetBlue.getName(), WoolCarpetBlueState, 99);
			chisel.addVariation(WoolCarpetGreen.getName(), WoolCarpetgreenState, 99);
			chisel.addVariation(WoolCarpetYellow.getName(), WoolCarpetYellowState, 99);
			chisel.addVariation(WoolCarpetBrown.getName(), WoolCarpetBrownState, 99);
			chisel.addVariation(WoolCarpetGray.getName(), WoolCarpetGrayState, 99);
		
			
			
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
			
			IBlockState StoneBrickCyanState = ModBlocks.StoneBrickCyan.getStateFromMeta(type.getMeta());
			chisel.addVariation(StoneBrickCyan.getName(), StoneBrickCyanState, 99);
			
			IBlockState RippledCyanState = ModBlocks.RippledCyan.getStateFromMeta(type.getMeta());
			chisel.addVariation(RippledCyan.getName(), RippledCyanState, 99);
			
			IBlockState WoodPlankCyanState = ModBlocks.WoodPlankCyan.getStateFromMeta(type.getMeta());
			chisel.addVariation(WoodPlankCyan.getName(), WoodPlankCyanState, 99);
			
			IBlockState DottedCyanState = ModBlocks.DottedCyan.getStateFromMeta(type.getMeta());
			chisel.addVariation(DottedCyan.getName(), DottedCyanState, 99);
						
			IBlockState WoolCyanState = ModBlocks.WoolCyan.getStateFromMeta(type.getMeta());
			chisel.addVariation(WoolCyan.getName(), WoolCyanState, 99);
			
			IBlockState WoolCarpetCyanState = ModBlocks.WoolCarpetCyan.getStateFromMeta(type.getMeta());
			chisel.addVariation(WoolCarpetCyan.getName(), WoolCarpetCyanState, 99);
			
			IBlockState CheckeredWoolCyanState = ModBlocks.CheckeredWoolCyan.getStateFromMeta(type.getMeta());
			chisel.addVariation(CheckeredWoolCyan.getName(), CheckeredWoolCyanState, 99);
			
			IBlockState CheckeredCarpetCyanState = ModBlocks.CheckeredCarpetCyan.getStateFromMeta(type.getMeta());
			chisel.addVariation(CheckeredCarpetCyan.getName(), CheckeredCarpetCyanState, 99);

		}
		
		for (BlockTypes3 type : BlockTypes3.values()) {
			IBlockState StampState = ModBlocks.Stamp.getStateFromMeta(type.getMeta());
			chisel.addVariation(Stamp.getName(), StampState, 99);
		}
		

	}


	
	private static ICarvingGroup getGroup(ICarvingRegistry chisel, String name) {
		ICarvingGroup group = CarvingUtils.getDefaultGroupFor(name);
		chisel.addGroup(group);
		return group;
	}
}