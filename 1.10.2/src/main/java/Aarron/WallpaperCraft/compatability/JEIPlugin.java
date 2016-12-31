package Aarron.WallpaperCraft.compatability;

import javax.annotation.Nonnull;

import mezz.jei.api.BlankModPlugin;
import mezz.jei.api.IJeiHelpers;
import mezz.jei.api.IModRegistry;
import net.minecraft.item.ItemStack;
import Aarron.WallpaperCraft.handler.ConfigHandler;
import Aarron.WallpaperCraft.init.ModBlocks;
import Aarron.WallpaperCraft.recipes.*;

@mezz.jei.api.JEIPlugin
public class JEIPlugin extends BlankModPlugin {
	
	public static IJeiHelpers  jeiHelper;

    @Override
    public void register(@Nonnull IModRegistry registry)
    {
    	 jeiHelper = registry.getJeiHelpers();
    	 
    	 
    	 jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.SolidGreen,0, 4));
	        
	    	if (ConfigHandler.hidefromJEI == true){
	    		
	    		for (int i = 1; i < 15; i ++) {
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.SolidRed,0, + i));
	    		 	jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.SolidPurple,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.SolidBlue,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.SolidGreen,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.SolidYellow,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.SolidBrown,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.SolidGray,0, + i));

	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.DiagonallyDottedRed,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.DiagonallyDottedPurple,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.DiagonallyDottedBlue,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.DiagonallyDottedGreen,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.DiagonallyDottedYellow,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.DiagonallyDottedBrown,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.DiagonallyDottedGray,0, + i));
	    			
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.StripedRed,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.StripedPurple,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.StripedBlue,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.StripedGreen,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.StripedYellow,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.StripedBrown,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.StripedGray,0, + i));

	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.FloralRed,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.FloralPurple,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.FloralBlue,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.FloralGreen,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.FloralYellow,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.FloralBrown,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.FloralGray,0, + i));

	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.DamaskRed,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.DamaskPurple,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.DamaskBlue,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.DamaskGreen,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.DamaskYellow,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.DamaskBrown,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.DamaskGray,0, + i));

	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.ClayRed,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.ClayPurple,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.ClayBlue,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.ClayGreen,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.ClayYellow,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.ClayBrown,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.ClayGray,0, + i));
	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.BrickRed,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.BrickPurple,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.BrickBlue,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.BrickGreen,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.BrickYellow,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.BrickBrown,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.BrickGray,0, + i));

	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.StoneBrickRed,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.StoneBrickPurple,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.StoneBrickBlue,0, + i));	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.StoneBrickGreen,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.StoneBrickYellow,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.StoneBrickBrown,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.StoneBrickGray,0, + i));
	    			
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.ColouredBrickRed,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.ColouredBrickPurple,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.ColouredBrickBlue,0, + i));	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.ColouredBrickGreen,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.ColouredBrickYellow,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.ColouredBrickBrown,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.ColouredBrickGray,0, + i));

	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.StoneLampRed,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.StoneLampPurple,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.StoneLampBlue,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.StoneLampGreen,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.StoneLampYellow,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.StoneLampBrown,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.StoneLampGray,0, + i));

	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.RippledRed,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.RippledPurple,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.RippledBlue,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.RippledGreen,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.RippledYellow,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.RippledBrown,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.RippledGray,0, + i));
	    			
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.FancyTilesRed,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.FancyTilesPurple,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.FancyTilesBlue,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.FancyTilesGreen,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.FancyTilesYellow,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.FancyTilesBrown,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.FancyTilesGray,0, + i));

	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.WoodPlankRed,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.WoodPlankPurple,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.WoodPlankBlue,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.WoodPlankGreen,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.WoodPlankYellow,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.WoodPlankBrown,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.WoodPlankGray,0, + i));

	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.DottedRed,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.DottedPurple,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.DottedBlue,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.DottedGreen,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.DottedYellow,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.DottedBrown,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.DottedGray,0, + i));

	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.WoolRed,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.WoolPurple,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.WoolBlue,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.WoolGreen,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.WoolYellow,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.WoolBrown,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.WoolGray,0, + i));

	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.WoolCarpetRed,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.WoolCarpetPurple,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.WoolCarpetBlue,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.WoolCarpetGreen,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.WoolCarpetYellow,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.WoolCarpetBrown,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.WoolCarpetGray,0, + i));

	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.CheckeredWoolRed,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.CheckeredWoolPurple,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.CheckeredWoolBlue,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.CheckeredWoolGreen,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.CheckeredWoolYellow,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.CheckeredWoolBrown,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.CheckeredWoolGray,0, + i));
	    			
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.CheckeredCarpetRed,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.CheckeredCarpetPurple,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.CheckeredCarpetBlue,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.CheckeredCarpetGreen,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.CheckeredCarpetYellow,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.CheckeredCarpetBrown,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.CheckeredCarpetGray,0, + i));

	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.TintedGlassRed,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.TintedGlassPurple,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.TintedGlassBlue,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.TintedGlassGreen,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.TintedGlassYellow,0, + i));	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.TintedGlassBrown,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.TintedGlassGray,0, + i));

	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.TexturedGlassRed,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.TexturedGlassPurple,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.TexturedGlassBlue,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.TexturedGlassGreen,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.TexturedGlassYellow,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.TexturedGlassBrown,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.TexturedGlassGray,0, + i));

	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.FrostedGlassRed,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.FrostedGlassPurple,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.FrostedGlassBlue,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.FrostedGlassGreen,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.FrostedGlassYellow,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.FrostedGlassBrown,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.FrostedGlassGray,0, + i));
	    			
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.AuraLampRed,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.AuraLampPurple,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.AuraLampBlue,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.AuraLampGreen,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.AuraLampYellow,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.AuraLampBrown,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.AuraLampGray,0, + i));
	    		}
	    		
	    		for (int i = 1; i < 10; i ++) {
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.SolidCyan,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.DiagonallyDottedCyan,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.StripedCyan,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.FloralCyan,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.DamaskCyan,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.ClayCyan,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.BrickCyan,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.ColouredBrickCyan,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.StoneBrickCyan,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.StoneLampCyan,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.RippledCyan,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.FancyTilesCyan,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.WoodPlankCyan,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.DottedCyan,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.WoolCyan,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.WoolCarpetCyan,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.CheckeredWoolCyan,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.CheckeredCarpetCyan,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.TintedGlassCyan,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.TexturedGlassCyan,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.FrostedGlassCyan,0, + i));
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.AuraLampCyan,0, + i));
	    			
	    		}
	    			


  		
	        
	    		           			   		
	    		
	}
  }
}