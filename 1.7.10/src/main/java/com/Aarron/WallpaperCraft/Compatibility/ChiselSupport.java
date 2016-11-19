package com.Aarron.WallpaperCraft.Compatibility;

import net.minecraft.block.Block;

import com.Aarron.WallpaperCraft.Init.ModBlocks;
import com.cricketcraft.chisel.api.carving.CarvingUtils;

public class ChiselSupport {




	public static void init(){
		addToChisle("Solid Red Blocks", ModBlocks.SolidRed, 14);
		addToChisle("Solid Purple Blocks", ModBlocks.SolidPurple, 14);
		addToChisle("Solid Blue Blocks", ModBlocks.SolidBlue, 14);
		addToChisle("Solid Cyan Blocks", ModBlocks.SolidCyan, 9);
		addToChisle("Solid Green Blocks", ModBlocks.SolidGreen, 14);
		addToChisle("Solid Yellow Blocks", ModBlocks.SolidYellow, 14);
		addToChisle("Solid Brown Blocks", ModBlocks.SolidBrown, 14);
		addToChisle("Solid Gray Blocks", ModBlocks.SolidGray, 14);
		
		addToChisle("Diagonally Dotted Red Blocks", ModBlocks.DiagonallyDottedRed, 14);
		addToChisle("Diagonally Dotted Purple Blocks", ModBlocks.DiagonallyDottedPurple, 14);
		addToChisle("Diagonally Dotted Blue Blocks", ModBlocks.DiagonallyDottedBlue, 14);
		addToChisle("Diagonally Dotted Cyan Blocks", ModBlocks.DiagonallyDottedCyan, 9);
		addToChisle("Diagonally Dotted Green Blocks", ModBlocks.DiagonallyDottedGreen, 14);
		addToChisle("Diagonally Dotted Yellow Blocks", ModBlocks.DiagonallyDottedYellow, 14);
		addToChisle("Diagonally Dotted Brown Blocks", ModBlocks.DiagonallyDottedBrown, 14);
		addToChisle("Diagonally Dotted Gray Blocks", ModBlocks.DiagonallyDottedGray, 14);
		
		addToChisle("Striped Red Blocks", ModBlocks.StripedRed, 14);
		addToChisle("Striped Purple Blocks", ModBlocks.StripedPurple, 14);
		addToChisle("Striped Blue Blocks", ModBlocks.StripedBlue, 14);
		addToChisle("Striped Cyan Blocks", ModBlocks.StripedCyan, 9);
		addToChisle("Striped Green Blocks", ModBlocks.StripedGreen, 14);
		addToChisle("Striped Yellow Blocks", ModBlocks.StripedYellow, 14);
		addToChisle("Striped Brown Blocks", ModBlocks.StripedBrown, 14);
		addToChisle("Striped Gray Blocks", ModBlocks.StripedGray, 14);
		
		addToChisle("Floral Red Blocks", ModBlocks.FloralRed, 14);
		addToChisle("Floral Purple Blocks", ModBlocks.FloralPurple, 14);
		addToChisle("Floral Blue Blocks", ModBlocks.FloralBlue, 14);
		addToChisle("Floral Cyan Blocks", ModBlocks.FloralCyan, 9);
		addToChisle("Floral Green Blocks", ModBlocks.FloralGreen, 14);
		addToChisle("Floral Yellow Blocks", ModBlocks.FloralYellow, 14);
		addToChisle("Floral Brown Blocks", ModBlocks.FloralBrown, 14);
		addToChisle("Floral Gray Blocks", ModBlocks.FloralGray, 14);
		
		addToChisle("Clay Red Blocks", ModBlocks.ClayRed, 14);
		addToChisle("Clay Purple Blocks", ModBlocks.ClayPurple, 14);
		addToChisle("Clay Blue Blocks", ModBlocks.ClayBlue, 14);
		addToChisle("Clay Cyan Blocks", ModBlocks.ClayCyan, 9);
		addToChisle("Clay Green Blocks", ModBlocks.ClayGreen, 14);
		addToChisle("Clay Yellow Blocks", ModBlocks.ClayYellow, 14);
		addToChisle("Clay Brown Blocks", ModBlocks.ClayBrown, 14);
		addToChisle("Clay Gray Blocks", ModBlocks.ClayGray, 14);
		
		addToChisle("Tinted Glass Red Blocks", ModBlocks.TintedGlassRed, 14);
		addToChisle("Tinted Glass Purple Blocks", ModBlocks.TintedGlassPurple, 14);
		addToChisle("Tinted Glass Blue Blocks", ModBlocks.TintedGlassBlue, 14);
		addToChisle("Tinted Glass Cyan Blocks", ModBlocks.TintedGlassCyan, 9);
		addToChisle("Tinted Glass Green Blocks", ModBlocks.TintedGlassGreen, 14);
		addToChisle("Tinted Glass Yellow Blocks", ModBlocks.TintedGlassYellow, 14);
		addToChisle("Tinted Glass Brown Blocks", ModBlocks.TintedGlassBrown, 14);
		addToChisle("Tinted Glass Gray Blocks", ModBlocks.TintedGlassGray, 14);
		
		addToChisle("Textured Glass Red Blocks", ModBlocks.TexturedGlassRed, 14);
		addToChisle("Textured Glass Purple Blocks", ModBlocks.TexturedGlassPurple, 14);
		addToChisle("Textured Glass Blue Blocks", ModBlocks.TexturedGlassBlue, 14);
		addToChisle("Textured Glass Cyan Blocks", ModBlocks.TexturedGlassCyan, 9);
		addToChisle("Textured Glass Green Blocks", ModBlocks.TexturedGlassGreen, 14);
		addToChisle("Textured Glass Yellow Blocks", ModBlocks.TexturedGlassYellow, 14);
		addToChisle("Textured Glass Brown Blocks", ModBlocks.TexturedGlassBrown, 14);
		addToChisle("Textured Glass Gray Blocks", ModBlocks.TexturedGlassGray, 14);
		
		addToChisle("Frosted Glass Red Blocks", ModBlocks.FrostedGlassRed, 14);
		addToChisle("Frosted Glass Purple Blocks", ModBlocks.FrostedGlassPurple, 14);
		addToChisle("Frosted Glass Blue Blocks", ModBlocks.FrostedGlassBlue, 14);
		addToChisle("Frosted Glass Cyan Blocks", ModBlocks.FrostedGlassCyan, 9);
		addToChisle("Frosted Glass Green Blocks", ModBlocks.FrostedGlassGreen, 14);
		addToChisle("Frosted Glass Yellow Blocks", ModBlocks.FrostedGlassYellow, 14);
		addToChisle("Frosted Glass Brown Blocks", ModBlocks.FrostedGlassBrown, 14);
		addToChisle("Frosted Glass Gray Blocks", ModBlocks.FrostedGlassGray, 14);
		
		addToChisle("Brick Red Blocks", ModBlocks.BrickRed, 14);
		addToChisle("Brick Purple Blocks", ModBlocks.BrickPurple, 14);
		addToChisle("Brick Blue Blocks", ModBlocks.BrickBlue, 14);
		addToChisle("Brick Cyan Blocks", ModBlocks.BrickCyan, 9);
		addToChisle("Brick Green Blocks", ModBlocks.BrickGreen, 14);
		addToChisle("Brick Yellow Blocks", ModBlocks.BrickYellow, 14);
		addToChisle("Brick Brown Blocks", ModBlocks.BrickBrown, 14);
		addToChisle("Brick Gray Blocks", ModBlocks.BrickGray, 14);
		
		addToChisle("Dotted Carpet Red Blocks", ModBlocks.DottedCarpetRed, 14);
		addToChisle("Dotted Carpet Purple Blocks", ModBlocks.DottedCarpetPurple, 14);
		addToChisle("Dotted Carpet Blue Blocks", ModBlocks.DottedCarpetBlue, 14);
		addToChisle("Dotted Carpet Cyan Blocks", ModBlocks.DottedCarpetCyan, 9);
		addToChisle("Dotted Carpet Green Blocks", ModBlocks.DottedCarpetGreen, 14);
		addToChisle("Dotted Carpet Yellow Blocks", ModBlocks.DottedCarpetYellow, 14);
		addToChisle("Dotted Carpet Brown Blocks", ModBlocks.DottedCarpetBrown, 14);
		addToChisle("Dotted Carpet Gray Blocks", ModBlocks.DottedCarpetGray, 14);
		
		addToChisle("Checkered Carpet Red Blocks", ModBlocks.CheckeredCarpetRed, 14);
		addToChisle("Checkered Carpet Purple Blocks", ModBlocks.CheckeredCarpetPurple, 14);
		addToChisle("Checkered Carpet Blue Blocks", ModBlocks.CheckeredCarpetBlue, 14);
		addToChisle("Checkered Carpet Cyan Blocks", ModBlocks.CheckeredCarpetCyan, 9);
		addToChisle("Checkered Carpet Green Blocks", ModBlocks.CheckeredCarpetGreen, 14);
		addToChisle("Checkered Carpet Yellow Blocks", ModBlocks.CheckeredCarpetYellow, 14);
		addToChisle("Checkered Carpet Brown Blocks", ModBlocks.CheckeredCarpetBrown, 14);
		addToChisle("Checkered Carpet Gray Blocks", ModBlocks.CheckeredCarpetGray, 14);
		
		addToChisle("Dotted Red Rugs", ModBlocks.DottedRugRed, 14);
		addToChisle("Dotted Purple Rugs", ModBlocks.DottedRugPurple, 14);
		addToChisle("Dotted Blue Rugs", ModBlocks.DottedRugBlue, 14);
		addToChisle("Dotted Cyan Rugs", ModBlocks.DottedRugCyan, 9);
		addToChisle("Dotted Green Rugs", ModBlocks.DottedRugGreen, 14);
		addToChisle("Dotted Yellow Rugs", ModBlocks.DottedRugYellow, 14);
		addToChisle("Dotted Brown Rugs", ModBlocks.DottedRugBrown, 14);
		addToChisle("Dotted Gray Rugs", ModBlocks.DottedRugGray, 14);
		
		addToChisle("Checkered Red Rugs", ModBlocks.CheckeredRugRed, 14);
		addToChisle("Checkered Purple Rugs", ModBlocks.CheckeredRugPurple, 14);
		addToChisle("Checkered Blue Rugs", ModBlocks.CheckeredRugBlue, 14);
		addToChisle("Checkered Cyan Rugs", ModBlocks.CheckeredRugCyan, 9);
		addToChisle("Checkered Green Rugs", ModBlocks.CheckeredRugGreen, 14);
		addToChisle("Checkered Yellow Rugs", ModBlocks.CheckeredRugYellow, 14);
		addToChisle("Checkered Brown Rugs", ModBlocks.CheckeredRugBrown, 14);
		addToChisle("Checkered Gray Rugs", ModBlocks.CheckeredRugGray, 14);
		
		
		
	}


	private static void addToChisle(String groupName, Block block, int maxMeta) {
        for (int meta = 0; meta <= maxMeta; meta++)
            CarvingUtils.chisel.addVariation(groupName, block, meta, meta);
}
}