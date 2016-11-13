package com.Aarron.WallpaperCraft.Compatibility;

import net.minecraft.block.Block;

import com.Aarron.WallpaperCraft.Blocks.CoreBlock;
import com.cricketcraft.chisel.api.carving.CarvingUtils;

public class ChiselSupport {




	public static void init(){
		addToChisle("Solid Red Blocks", CoreBlock.SolidRed, 14);
		addToChisle("Solid Purple Blocks", CoreBlock.SolidPurple, 14);
		addToChisle("Solid Blue Blocks", CoreBlock.SolidBlue, 14);
		addToChisle("Solid Cyan Blocks", CoreBlock.SolidCyan, 9);
		addToChisle("Solid Green Blocks", CoreBlock.SolidGreen, 14);
		addToChisle("Solid Yellow Blocks", CoreBlock.SolidYellow, 14);
		addToChisle("Solid Brown Blocks", CoreBlock.SolidBrown, 14);
		addToChisle("Solid Gray Blocks", CoreBlock.SolidGray, 14);
		
		addToChisle("Diagonally Dotted Red Blocks", CoreBlock.DiagonallyDottedRed, 14);
		addToChisle("Diagonally Dotted Purple Blocks", CoreBlock.DiagonallyDottedPurple, 14);
		addToChisle("Diagonally Dotted Blue Blocks", CoreBlock.DiagonallyDottedBlue, 14);
		addToChisle("Diagonally Dotted Cyan Blocks", CoreBlock.DiagonallyDottedCyan, 9);
		addToChisle("Diagonally Dotted Green Blocks", CoreBlock.DiagonallyDottedGreen, 14);
		addToChisle("Diagonally Dotted Yellow Blocks", CoreBlock.DiagonallyDottedYellow, 14);
		addToChisle("Diagonally Dotted Brown Blocks", CoreBlock.DiagonallyDottedBrown, 14);
		addToChisle("Diagonally Dotted Gray Blocks", CoreBlock.DiagonallyDottedGray, 14);
		
		addToChisle("Striped Red Blocks", CoreBlock.StripedRed, 14);
		addToChisle("Striped Purple Blocks", CoreBlock.StripedPurple, 14);
		addToChisle("Striped Blue Blocks", CoreBlock.StripedBlue, 14);
		addToChisle("Striped Cyan Blocks", CoreBlock.StripedCyan, 9);
		addToChisle("Striped Green Blocks", CoreBlock.StripedGreen, 14);
		addToChisle("Striped Yellow Blocks", CoreBlock.StripedYellow, 14);
		addToChisle("Striped Brown Blocks", CoreBlock.StripedBrown, 14);
		addToChisle("Striped Gray Blocks", CoreBlock.StripedGray, 14);
		
		addToChisle("Floral Red Blocks", CoreBlock.FloralRed, 14);
		addToChisle("Floral Purple Blocks", CoreBlock.FloralPurple, 14);
		addToChisle("Floral Blue Blocks", CoreBlock.FloralBlue, 14);
		addToChisle("Floral Cyan Blocks", CoreBlock.FloralCyan, 9);
		addToChisle("Floral Green Blocks", CoreBlock.FloralGreen, 14);
		addToChisle("Floral Yellow Blocks", CoreBlock.FloralYellow, 14);
		addToChisle("Floral Brown Blocks", CoreBlock.FloralBrown, 14);
		addToChisle("Floral Gray Blocks", CoreBlock.FloralGray, 14);
		
		addToChisle("Clay Red Blocks", CoreBlock.ClayRed, 14);
		addToChisle("Clay Purple Blocks", CoreBlock.ClayPurple, 14);
		addToChisle("Clay Blue Blocks", CoreBlock.ClayBlue, 14);
		addToChisle("Clay Cyan Blocks", CoreBlock.ClayCyan, 9);
		addToChisle("Clay Green Blocks", CoreBlock.ClayGreen, 14);
		addToChisle("Clay Yellow Blocks", CoreBlock.ClayYellow, 14);
		addToChisle("Clay Brown Blocks", CoreBlock.ClayBrown, 14);
		addToChisle("Clay Gray Blocks", CoreBlock.ClayGray, 14);
		
		addToChisle("Tinted Glass Red Blocks", CoreBlock.TintedGlassRed, 14);
		addToChisle("Tinted Glass Purple Blocks", CoreBlock.TintedGlassPurple, 14);
		addToChisle("Tinted Glass Blue Blocks", CoreBlock.TintedGlassBlue, 14);
		addToChisle("Tinted Glass Cyan Blocks", CoreBlock.TintedGlassCyan, 9);
		addToChisle("Tinted Glass Green Blocks", CoreBlock.TintedGlassGreen, 14);
		addToChisle("Tinted Glass Yellow Blocks", CoreBlock.TintedGlassYellow, 14);
		addToChisle("Tinted Glass Brown Blocks", CoreBlock.TintedGlassBrown, 14);
		addToChisle("Tinted Glass Gray Blocks", CoreBlock.TintedGlassGray, 14);
		
		addToChisle("Textured Glass Red Blocks", CoreBlock.TexGlassRed, 14);
		addToChisle("Textured Glass Purple Blocks", CoreBlock.TexGlassPurple, 14);
		addToChisle("Textured Glass Blue Blocks", CoreBlock.TexGlassBlue, 14);
		addToChisle("Textured Glass Cyan Blocks", CoreBlock.TexGlassCyan, 9);
		addToChisle("Textured Glass Green Blocks", CoreBlock.TexGlassGreen, 14);
		addToChisle("Textured Glass Yellow Blocks", CoreBlock.TexGlassYellow, 14);
		addToChisle("Textured Glass Brown Blocks", CoreBlock.TexGlassBrown, 14);
		addToChisle("Textured Glass Gray Blocks", CoreBlock.TexGlassGray, 14);
		
		addToChisle("Frosted Glass Red Blocks", CoreBlock.FrostedGlassRed, 14);
		addToChisle("Frosted Glass Purple Blocks", CoreBlock.FrostedGlassPurple, 14);
		addToChisle("Frosted Glass Blue Blocks", CoreBlock.FrostedGlassBlue, 14);
		addToChisle("Frosted Glass Cyan Blocks", CoreBlock.FrostedGlassCyan, 9);
		addToChisle("Frosted Glass Green Blocks", CoreBlock.FrostedGlassGreen, 14);
		addToChisle("Frosted Glass Yellow Blocks", CoreBlock.FrostedGlassYellow, 14);
		addToChisle("Frosted Glass Brown Blocks", CoreBlock.FrostedGlassBrown, 14);
		addToChisle("Frosted Glass Gray Blocks", CoreBlock.FrostedGlassGray, 14);
		
		
		
	}


	private static void addToChisle(String groupName, Block block, int maxMeta) {
        for (int meta = 0; meta <= maxMeta; meta++)
            CarvingUtils.chisel.addVariation(groupName, block, meta, meta);
}
}