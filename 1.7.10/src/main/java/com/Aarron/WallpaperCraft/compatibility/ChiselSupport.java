package com.Aarron.WallpaperCraft.compatibility;

import net.minecraft.block.Block;

import com.Aarron.WallpaperCraft.handler.ConfigHandler;
import com.Aarron.WallpaperCraft.init.ModBlocks;
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
				
		addToChisle("Dotted Red Blocks", ModBlocks.DottedRed, 14);
		addToChisle("Dotted Purple Blocks", ModBlocks.DottedPurple, 14);
		addToChisle("Dotted Blue Blocks", ModBlocks.DottedBlue, 14);
		addToChisle("Dotted Cyan Blocks", ModBlocks.DottedCyan, 9);
		addToChisle("Dotted Green Blocks", ModBlocks.DottedGreen, 14);
		addToChisle("Dotted Yellow Blocks", ModBlocks.DottedYellow, 14);
		addToChisle("Dotted Brown Blocks", ModBlocks.DottedBrown, 14);
		addToChisle("Dotted Gray Blocks", ModBlocks.DottedGray, 14);
		
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
		
		addToChisle("Damask Red Blocks", ModBlocks.DamaskRed, 14);
		addToChisle("Damask Purple Blocks", ModBlocks.DamaskPurple, 14);
		addToChisle("Damask Blue Blocks", ModBlocks.DamaskBlue, 14);
		addToChisle("Damask Cyan Blocks", ModBlocks.DamaskCyan, 9);
		addToChisle("Damask Green Blocks", ModBlocks.DamaskGreen, 14);
		addToChisle("Damask Yellow Blocks", ModBlocks.DamaskYellow, 14);
		addToChisle("Damask Brown Blocks", ModBlocks.DamaskBrown, 14);
		addToChisle("Damask Gray Blocks", ModBlocks.DamaskGray, 14);
		
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
		
		addToChisle("Tinted Panes Red", ModBlocks.TintedPaneRed, 14);
		addToChisle("Tinted Panes Purple", ModBlocks.TintedPanePurple, 14);
		addToChisle("Tinted Panes Blue", ModBlocks.TintedPaneBlue, 14);
		addToChisle("Tinted Panes Cyan", ModBlocks.TintedPaneCyan, 9);
		addToChisle("Tinted Panes Green", ModBlocks.TintedPaneGreen, 14);
		addToChisle("Tinted Panes Yellow", ModBlocks.TintedPaneYellow, 14);
		addToChisle("Tinted Panes Brown", ModBlocks.TintedPaneBrown, 14);
		addToChisle("Tinted Panes Gray", ModBlocks.TintedPaneGray, 14);
				
		addToChisle("Textured Panes Red", ModBlocks.TexturedPaneRed, 14);
		addToChisle("Textured Panes Purple", ModBlocks.TexturedPanePurple, 14);
		addToChisle("Textured Panes Blue", ModBlocks.TexturedPaneBlue, 14);
		addToChisle("Textured Panes Cyan", ModBlocks.TexturedPaneCyan, 9);
		addToChisle("Textured Panes Green", ModBlocks.TexturedPaneGreen, 14);
		addToChisle("Textured Panes Yellow", ModBlocks.TexturedPaneYellow, 14);
		addToChisle("Textured Panes Brown", ModBlocks.TexturedPaneBrown, 14);
		addToChisle("Textured Panes Gray", ModBlocks.TexturedPaneGray, 14);
		
		addToChisle("Frosted Panes Red", ModBlocks.FrostedPaneRed, 14);
		addToChisle("Frosted Panes Purple", ModBlocks.FrostedPanePurple, 14);
		addToChisle("Frosted Panes Blue", ModBlocks.FrostedPaneBlue, 14);
		addToChisle("Frosted Panes Cyan", ModBlocks.FrostedPaneCyan, 9);
		addToChisle("Frosted Panes Green", ModBlocks.FrostedPaneGreen, 14);
		addToChisle("Frosted Panes Yellow", ModBlocks.FrostedPaneYellow, 14);
		addToChisle("Frosted Panes Brown", ModBlocks.FrostedPaneBrown, 14);
		addToChisle("Frosted Panes Gray", ModBlocks.FrostedPaneGray, 14);
		
		addToChisle("Brick Red Blocks", ModBlocks.BrickRed, 14);
		addToChisle("Brick Purple Blocks", ModBlocks.BrickPurple, 14);
		addToChisle("Brick Blue Blocks", ModBlocks.BrickBlue, 14);
		addToChisle("Brick Cyan Blocks", ModBlocks.BrickCyan, 9);
		addToChisle("Brick Green Blocks", ModBlocks.BrickGreen, 14);
		addToChisle("Brick Yellow Blocks", ModBlocks.BrickYellow, 14);
		addToChisle("Brick Brown Blocks", ModBlocks.BrickBrown, 14);
		addToChisle("Brick Gray Blocks", ModBlocks.BrickGray, 14);
		
		addToChisle("Stone Brick Red Blocks", ModBlocks.StoneBrickRed, 14);
		addToChisle("Stone Brick Purple Blocks", ModBlocks.StoneBrickPurple, 14);
		addToChisle("Stone Brick Blue Blocks", ModBlocks.StoneBrickBlue, 14);
		addToChisle("Stone Brick Cyan Blocks", ModBlocks.StoneBrickCyan, 9);
		addToChisle("Stone Brick Green Blocks", ModBlocks.StoneBrickGreen, 14);
		addToChisle("Stone Brick Yellow Blocks", ModBlocks.StoneBrickYellow, 14);
		addToChisle("Stone Brick Brown Blocks", ModBlocks.StoneBrickBrown, 14);
		addToChisle("Stone Brick Gray Blocks", ModBlocks.StoneBrickGray, 14);
		
		addToChisle("Stone Lamp Red Blocks", ModBlocks.StoneLampRed, 14);
		addToChisle("Stone Lamp Purple Blocks", ModBlocks.StoneLampPurple, 14);
		addToChisle("Stone Lamp Blue Blocks", ModBlocks.StoneLampBlue, 14);
		addToChisle("Stone Lamp Cyan Blocks", ModBlocks.StoneLampCyan, 9);
		addToChisle("Stone Lamp Green Blocks", ModBlocks.StoneLampGreen, 14);
		addToChisle("Stone Lamp Yellow Blocks", ModBlocks.StoneLampYellow, 14);
		addToChisle("Stone Lamp Brown Blocks", ModBlocks.StoneLampBrown, 14);
		addToChisle("Stone Lamp Gray Blocks", ModBlocks.StoneLampGray, 14);
		
		addToChisle("Red Rippled Blocks", ModBlocks.RippledRed, 14);
		addToChisle("Purple Rippled Blocks", ModBlocks.RippledPurple, 14);
		addToChisle("Blue Rippled Blocks", ModBlocks.RippledBlue, 14);
		addToChisle("Cyan Rippled Blocks", ModBlocks.RippledCyan, 9);
		addToChisle("Green Rippled Blocks", ModBlocks.RippledGreen, 14);
		addToChisle("Yellow Rippled Blocks", ModBlocks.RippledYellow, 14);
		addToChisle("Brown Rippled Blocks", ModBlocks.RippledBrown, 14);
		addToChisle("Gray Rippled Blocks", ModBlocks.RippledGray, 14);
		
		addToChisle("Wood Planks Red Blocks", ModBlocks.WoodPlankRed, 14);
		addToChisle("Wood Planks Purple Blocks", ModBlocks.WoodPlankPurple, 14);
		addToChisle("Wood Planks Blue Blocks", ModBlocks.WoodPlankBlue, 14);
		addToChisle("Wood Planks Cyan Blocks", ModBlocks.WoodPlankCyan, 9);
		addToChisle("Wood Planks Green Blocks", ModBlocks.WoodPlankGreen, 14);
		addToChisle("Wood Planks Yellow Blocks", ModBlocks.WoodPlankYellow, 14);
		addToChisle("Wood Planks Brown Blocks", ModBlocks.WoodPlankBrown, 14);
		addToChisle("Wood Planks Gray Blocks", ModBlocks.WoodPlankGray, 14);
		
		addToChisle("Wool Red Blocks", ModBlocks.WoolRed, 14);
		addToChisle("Wool Purple Blocks", ModBlocks.WoolPurple, 14);
		addToChisle("Wool Blue Blocks", ModBlocks.WoolBlue, 14);
		addToChisle("Wool Cyan Blocks", ModBlocks.WoolCyan, 9);
		addToChisle("Wool Green Blocks", ModBlocks.WoolGreen, 14);
		addToChisle("Wool Yellow Blocks", ModBlocks.WoolYellow, 14);
		addToChisle("Wool Brown Blocks", ModBlocks.WoolBrown, 14);
		addToChisle("Wool Gray Blocks", ModBlocks.WoolGray, 14);
		
		addToChisle("Wool Red Carpets", ModBlocks.WoolCarpetRed, 14);
		addToChisle("Wool Purple Carpets", ModBlocks.WoolCarpetPurple, 14);
		addToChisle("Wool Blue Carpets", ModBlocks.WoolCarpetBlue, 14);
		addToChisle("Wool Cyan Carpets", ModBlocks.WoolCarpetCyan, 9);
		addToChisle("Wool Green Carpets", ModBlocks.WoolCarpetGreen, 14);
		addToChisle("Wool Yellow Carpets", ModBlocks.WoolCarpetYellow, 14);
		addToChisle("Wool Brown Carpets", ModBlocks.WoolCarpetBrown, 14);
		addToChisle("Wool Gray Carpets", ModBlocks.WoolCarpetGray, 14);
			
		addToChisle("Checkered Red Wool", ModBlocks.CheckeredWoolRed, 14);
		addToChisle("Checkered Purple Wool", ModBlocks.CheckeredWoolPurple, 14);
		addToChisle("Checkered Blue Wool", ModBlocks.CheckeredWoolBlue, 14);
		addToChisle("Checkered Cyan Wool", ModBlocks.CheckeredWoolCyan, 9);
		addToChisle("Checkered Green Wool", ModBlocks.CheckeredWoolGreen, 14);
		addToChisle("Checkered Yellow Wool", ModBlocks.CheckeredWoolYellow, 14);
		addToChisle("Checkered Brown Wool", ModBlocks.CheckeredWoolBrown, 14);
		addToChisle("Checkered Gray Wool", ModBlocks.CheckeredWoolGray, 14);
		
		addToChisle("Checkered Red Carpets", ModBlocks.CheckeredCarpetRed, 14);
		addToChisle("Checkered Purple Carpets", ModBlocks.CheckeredCarpetPurple, 14);
		addToChisle("Checkered Blue Carpets", ModBlocks.CheckeredCarpetBlue, 14);
		addToChisle("Checkered Cyan Carpets", ModBlocks.CheckeredCarpetCyan, 9);
		addToChisle("Checkered Green Carpets", ModBlocks.CheckeredCarpetGreen, 14);
		addToChisle("Checkered Yellow Carpets", ModBlocks.CheckeredCarpetYellow, 14);
		addToChisle("Checkered Brown Carpets", ModBlocks.CheckeredCarpetBrown, 14);
		addToChisle("Checkered Gray Carpets", ModBlocks.CheckeredCarpetGray, 14);
		
		addToChisle("Stamp Blocks", ModBlocks.Stamp, 15);
		
		
		
	}


	private static void addToChisle(String groupName, Block block, int maxMeta) {
        for (int meta = 0; meta <= maxMeta; meta++)
            CarvingUtils.chisel.addVariation(groupName, block, meta, meta);
}
}