package Aarron.WallpaperCraft.compatability;

import javax.annotation.Nonnull;

import mezz.jei.api.BlankModPlugin;
import mezz.jei.api.IJeiHelpers;
import mezz.jei.api.IModRegistry;
import net.minecraft.item.ItemStack;
import Aarron.WallpaperCraft.handler.ConfigHandler;
import Aarron.WallpaperCraft.init.ModBlocks;

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
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.SolidPurple,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.SolidBlue,0, + i));
	    		} 
	    		for (int i = 1; i < 10; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.SolidCyan,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.SolidGreen,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.SolidYellow,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.SolidBrown,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.SolidGray,0, + i));
	    		}
	    		
	    		
	    		for (int i = 1; i < 15; i ++) {
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.DiagonallyDottedRed,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.DiagonallyDottedPurple,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.DiagonallyDottedBlue,0, + i));
	    		} 
	    		for (int i = 1; i < 10; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.DiagonallyDottedCyan,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.DiagonallyDottedGreen,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.DiagonallyDottedYellow,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.DiagonallyDottedBrown,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.DiagonallyDottedGray,0, + i));
	    		}
	    		
	    		
	    		for (int i = 1; i < 15; i ++) {
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.StripedRed,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.StripedPurple,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.StripedBlue,0, + i));
	    		} 
	    		for (int i = 1; i < 10; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.StripedCyan,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.StripedGreen,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.StripedYellow,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.StripedBrown,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.StripedGray,0, + i));
	    		}
	    			    		
	    		
	    		for (int i = 1; i < 15; i ++) {
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.FloralRed,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.FloralPurple,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.FloralBlue,0, + i));
	    		} 
	    		for (int i = 1; i < 10; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.FloralCyan,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.FloralGreen,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.FloralYellow,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.FloralBrown,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.FloralGray,0, + i));
	    		}
	    		
	    		
	    		for (int i = 1; i < 15; i ++) {
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.ClayRed,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.ClayPurple,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.ClayBlue,0, + i));
	    		} 
	    		for (int i = 1; i < 10; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.ClayCyan,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.ClayGreen,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.ClayYellow,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.ClayBrown,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.ClayGray,0, + i));
	    		}
	    		
	    		
	    		for (int i = 1; i < 15; i ++) {
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.BrickRed,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.BrickPurple,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.BrickBlue,0, + i));
	    		} 
	    		for (int i = 1; i < 10; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.BrickCyan,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.BrickGreen,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.BrickYellow,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.BrickBrown,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.BrickGray,0, + i));
	    		}
	    		
	    		
	    		for (int i = 1; i < 15; i ++) {
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.DottedCarpetRed,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.DottedCarpetPurple,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.DottedCarpetBlue,0, + i));
	    		} 
	    		for (int i = 1; i < 10; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.DottedCarpetCyan,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.DottedCarpetGreen,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.DottedCarpetYellow,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.DottedCarpetBrown,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.DottedCarpetGray,0, + i));
	    		}
	    		
	    		
	    		for (int i = 1; i < 15; i ++) {
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.CheckeredCarpetRed,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.CheckeredCarpetPurple,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.CheckeredCarpetBlue,0, + i));
	    		} 
	    		for (int i = 1; i < 10; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.CheckeredCarpetCyan,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.CheckeredCarpetGreen,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.CheckeredCarpetYellow,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.CheckeredCarpetBrown,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.CheckeredCarpetGray,0, + i));
	    		}
	    		
	
	    		for (int i = 1; i < 15; i ++) {
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.TintedGlassRed,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.TintedGlassPurple,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.TintedGlassBlue,0, + i));
	    		} 
	    		for (int i = 1; i < 10; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.TintedGlassCyan,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.TintedGlassGreen,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.TintedGlassYellow,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.TintedGlassBrown,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.TintedGlassGray,0, + i));
	    		}
	    		

	    		for (int i = 1; i < 15; i ++) {
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.TexturedGlassRed,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.TexturedGlassPurple,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.TexturedGlassBlue,0, + i));
	    		} 
	    		for (int i = 1; i < 10; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.TexturedGlassCyan,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.TexturedGlassGreen,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.TexturedGlassYellow,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.TexturedGlassBrown,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.TexturedGlassGray,0, + i));
	    		}	
	    		

	    		for (int i = 1; i < 15; i ++) {
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.FrostedGlassRed,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.FrostedGlassPurple,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.FrostedGlassBlue,0, + i));
	    		} 
	    		for (int i = 1; i < 10; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.FrostedGlassCyan,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.FrostedGlassGreen,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.FrostedGlassYellow,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.FrostedGlassBrown,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.FrostedGlassGray,0, + i));
	    		}
	    		
	    		
	    		for (int i = 1; i < 15; i ++) {
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.CheckeredRugRed,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.CheckeredRugPurple,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.CheckeredRugBlue,0, + i));
	    		} 
	    		for (int i = 1; i < 10; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.CheckeredRugCyan,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.CheckeredRugGreen,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.CheckeredRugYellow,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.CheckeredRugBrown,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.CheckeredRugGray,0, + i));
	    		}
	    		
	    		
	    		for (int i = 1; i < 15; i ++) {
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.DottedRugRed,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.DottedRugPurple,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.DottedRugBlue,0, + i));
	    		} 
	    		for (int i = 1; i < 10; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.DottedRugCyan,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.DottedRugGreen,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.DottedRugYellow,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.DottedRugBrown,0, + i));
	    		}
	    		for (int i = 1; i < 15; i ++) {	
	    			jeiHelper.getItemBlacklist().addItemToBlacklist(new ItemStack(ModBlocks.DottedRugGray,0, + i));
	    		}
	    		
	        
	    		           			   		
	    		
	}
  }
}