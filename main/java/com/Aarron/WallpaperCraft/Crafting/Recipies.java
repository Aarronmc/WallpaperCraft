package com.Aarron.WallpaperCraft.Crafting;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import com.Aarron.WallpaperCraft.Blocks.CoreBlock;

import cpw.mods.fml.common.registry.GameRegistry;

public class Recipies {
	
	
	
	public static void init() {
		
		//Recipes for SolidRedBlock
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.SolidRed, 9, 0), 
        		"CCC",
        		"CCC",
        		"CCC",
        		 'C', new ItemStack(Blocks.stained_hardened_clay, 1, 14)    	
        	);
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.SolidRed, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.SolidRed, 1, i%14)});
        }
    	
    	//Recipes for SolidPurpleBlocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.SolidPurple, 9, 0), 
        		"CCC",
        		"CCC",
        		"CCC",
        		 'C', new ItemStack(Blocks.stained_hardened_clay, 1, 10)   	
          	);
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.SolidPurple, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.SolidPurple, 1, i%14)});
        }
	
    	//Recipes for SolidBlueBlocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.SolidBlue, 9, 0), 
        		"CCC",
        		"CCC",
        		"CCC",
        		 'C', new ItemStack(Blocks.stained_hardened_clay, 1, 11)
            );
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.SolidBlue, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.SolidBlue, 1, i%14)});
        }

    	//Recipes for SolidBrownBlocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.SolidBrown, 9, 0), 
        		"CCC",
        		"CCC",
        		"CCC",
        		 'C', new ItemStack(Blocks.stained_hardened_clay, 1, 12)
            );
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.SolidBrown, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.SolidBrown, 1, i%14)});
        }

    	//Recipes for SolidCyanBlocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.SolidCyan, 9, 0), 
        		"CCC",
        		"CCC",
        		"CCC",
        		 'C', new ItemStack(Blocks.stained_hardened_clay, 1, 9)
            );
    	
        for (int i = 0; i < 9; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.SolidCyan, 1, (i+1)%9), new Object[] {new ItemStack(CoreBlock.SolidCyan, 1, i%9)});
        }

    	//Recipes for SolidGreenBlocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.SolidGreen, 9, 0), 
        		"CCC",
        		"CCC",
        		"CCC",
        		 'C', new ItemStack(Blocks.stained_hardened_clay, 1, 13)
            );
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.SolidGreen, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.SolidGreen, 1, i%14)});
        }

    	//Recipes for SolidYellowBlocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.SolidYellow, 9, 0), 
        		"CCC",
        		"CCC",
        		"CCC",
        		 'C', new ItemStack(Blocks.stained_hardened_clay, 1, 4)
            );
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.SolidYellow, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.SolidYellow, 1, i%14)});
        }
    		
    	//Recipes for SolidGrayBlocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.SolidGray, 9, 0), 
        		"CCC",
        		"CCC",
        		"CCC",
        		 'C', new ItemStack(Blocks.stained_hardened_clay, 1, 7)
            );
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.SolidGray, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.SolidGray, 1, i%14)});
        }
    	
    	
    	   	    	
    	
    	
    	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
    	
    	
    	
    	
    	//Recipes For Diagonally Dotted Red Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.DiagonallyDottedRed, 4, 0), 
        		"SPS",
        		"PCP",
        		"SPS",
        		 'S', new ItemStack(Blocks.dirt, 1, 2), 'P', Items.paper, 'C', new ItemStack(CoreBlock.SolidRed, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.DiagonallyDottedRed, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.DiagonallyDottedRed, 1, i%14)});
        }

    	//Recipes For Diagonally Dotted Purple Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.DiagonallyDottedPurple, 4, 0), 
        		"SPS",
        		"PCP",
        		"SPS",
        		 'S', new ItemStack(Blocks.dirt, 1, 2), 'P', Items.paper, 'C', new ItemStack(CoreBlock.SolidPurple, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.DiagonallyDottedPurple, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.DiagonallyDottedPurple, 1, i%14)});
        }

    	//Recipes For Diagonally Dotted Blue Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.DiagonallyDottedBlue, 4, 0), 
        		"SPS",
        		"PCP",
        		"SPS",
        	     'S', new ItemStack(Blocks.dirt, 1, 2), 'P', Items.paper, 'C', new ItemStack(CoreBlock.SolidBlue, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.DiagonallyDottedBlue, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.DiagonallyDottedBlue, 1, i%14)});
        }

    	//Recipes For Diagonally Dotted Brown Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.DiagonallyDottedBrown, 4, 0), 
        		"SPS",
        		"PCP",
        		"SPS",
       		     'S', new ItemStack(Blocks.dirt, 1, 2), 'P', Items.paper, 'C', new ItemStack(CoreBlock.SolidBrown, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.DiagonallyDottedBrown, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.DiagonallyDottedBrown, 1, i%14)});
        }
    	
    	//Recipes For Diagonally Dotted Cyan Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.DiagonallyDottedCyan, 4, 0), 
        		"SPS",
        		"PCP",
        		"SPS",
        	   	 'S', new ItemStack(Blocks.dirt, 1, 2), 'P', Items.paper, 'C', new ItemStack(CoreBlock.SolidCyan, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 9; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.DiagonallyDottedCyan, 1, (i+1)%9), new Object[] {new ItemStack(CoreBlock.DiagonallyDottedCyan, 1, i%9)});
        }

    	//Recipes For Diagonally Dotted Green Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.DiagonallyDottedGreen, 4, 0), 
        		"SPS",
        		"PCP",
        		"SPS",
        		 'S', new ItemStack(Blocks.dirt, 1, 2), 'P', Items.paper, 'C', new ItemStack(CoreBlock.SolidGreen, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.DiagonallyDottedGreen, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.DiagonallyDottedGreen, 1, i%14)});
        }

    	//Recipes For Diagonally Dotted Yellow Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.DiagonallyDottedYellow, 4, 0), 
        		"SPS",
        		"PCP",
        		"SPS",
        		 'S', new ItemStack(Blocks.dirt, 1, 2), 'P', Items.paper, 'C', new ItemStack(CoreBlock.SolidYellow, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.DiagonallyDottedYellow, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.DiagonallyDottedYellow, 1, i%14)});
        }

    	//Recipes For Diagonally Dotted Gray Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.DiagonallyDottedGray, 4, 0), 
        		"SPS",
        		"PCP",
        		"SPS",
        		 'S', new ItemStack(Blocks.dirt, 1, 2), 'P', Items.paper, 'C', new ItemStack(CoreBlock.SolidGray, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.DiagonallyDottedGray, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.DiagonallyDottedGray, 1, i%14)});
        }
        
        
        
        
        
    	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
    	
    	
    	
    	
        //Recipes For Stripes Red Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.StripesRed, 4, 0), 
        		"SPS",
        		"PCP",
        		"SPS",
        	   	 'S', new ItemStack(Blocks.quartz_block, 1, 2), 'P', Items.paper, 'C', new ItemStack(CoreBlock.SolidRed, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.StripesRed, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.StripesRed, 1, i%14)});
        }
        
        //Recipes For Stripes Purple Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.StripesPurple, 4, 0), 
        		"SPS",
        		"PCP",
        		"SPS",
        	   	 'S', new ItemStack(Blocks.quartz_block, 1, 2), 'P', Items.paper, 'C', new ItemStack(CoreBlock.SolidPurple, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.StripesPurple, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.StripesPurple, 1, i%14)});
        }
        
        //Recipes For Stripes Blue Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.StripesBlue, 4, 0), 
        		"SPS",
        		"PCP",
        		"SPS",
        	   	 'S', new ItemStack(Blocks.quartz_block, 1, 2), 'P', Items.paper, 'C', new ItemStack(CoreBlock.SolidBlue, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.StripesBlue, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.StripesBlue, 1, i%14)});
        }
        
        //Recipes For Stripes Brown Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.StripesBrown, 4, 0), 
        		"SPS",
        		"PCP",
        		"SPS",
        	   	 'S', new ItemStack(Blocks.quartz_block, 1, 2), 'P', Items.paper, 'C', new ItemStack(CoreBlock.SolidBrown, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.StripesBrown, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.StripesBrown, 1, i%14)});
        }
        
        //Recipes For Stripes Cyan Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.StripesCyan, 4, 0), 
        		"SPS",
        		"PCP",
        		"SPS",
        	   	 'S', new ItemStack(Blocks.quartz_block, 1, 2), 'P', Items.paper, 'C', new ItemStack(CoreBlock.SolidCyan, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 9; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.StripesCyan, 1, (i+1)%9), new Object[] {new ItemStack(CoreBlock.StripesCyan, 1, i%9)});
        }
        
        //Recipes For Stripes Green Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.StripesGreen, 4, 0), 
        		"SPS",
        		"PCP",
        		"SPS",
        	   	 'S', new ItemStack(Blocks.quartz_block, 1, 2), 'P', Items.paper, 'C', new ItemStack(CoreBlock.SolidGreen, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.StripesGreen, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.StripesGreen, 1, i%14)});
        }
        
        //Recipes For Stripes Yellow Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.StripesYellow, 4, 0), 
        		"SPS",
        		"PCP",
        		"SPS",
        	   	 'S', new ItemStack(Blocks.quartz_block, 1, 2), 'P', Items.paper, 'C', new ItemStack(CoreBlock.SolidYellow, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.StripesYellow, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.StripesYellow, 1, i%14)});
        }
        
        //Recipes For Stripes Gray Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.StripesGray, 4, 0), 
        		"SPS",
        		"PCP",
        		"SPS",
        	   	 'S', new ItemStack(Blocks.quartz_block, 1, 2), 'P', Items.paper, 'C', new ItemStack(CoreBlock.SolidGray, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.StripesGray, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.StripesGray, 1, i%14)});
        }
        
        
        
        
        
    	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
    	
    	
    	
    	
        //Recipes For Floral Red Blocks
        GameRegistry.addRecipe(new ItemStack(CoreBlock.FloralRed),
        		"SPS",
        		"PCP",
        		"SPS",
        		 'S', new ItemStack(Blocks.red_flower, 1,OreDictionary.WILDCARD_VALUE), 'P', Items.paper, 'C', new ItemStack(CoreBlock.SolidRed, 1, OreDictionary.WILDCARD_VALUE)
        );
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.FloralRed, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.FloralRed, 1, i%14)});
        }
        
        //Recipes For Floral Purple Blocks
        GameRegistry.addRecipe(new ItemStack(CoreBlock.FloralPurple),
        		"SPS",
        		"PCP",
        		"SPS",
        		 'S', new ItemStack(Blocks.red_flower, 1,OreDictionary.WILDCARD_VALUE), 'P', Items.paper, 'C', new ItemStack(CoreBlock.SolidPurple, 1, OreDictionary.WILDCARD_VALUE)
        );
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.FloralPurple, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.FloralPurple, 1, i%14)});
        }
        
        //Recipes For Floral Blue Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.FloralBlue, 4, 0), 
        		"SPS",
        		"PCP",
        		"SPS",
        		 'S', new ItemStack(Blocks.red_flower, 1,OreDictionary.WILDCARD_VALUE), 'P', Items.paper, 'C', new ItemStack(CoreBlock.SolidBlue, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.FloralBlue, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.FloralBlue, 1, i%14)});
        }
        
        //Recipes For Floral Brown Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.FloralBrown, 4, 0), 
        		"SPS",
        		"PCP",
        		"SPS",
        		 'S', new ItemStack(Blocks.red_flower, 1,OreDictionary.WILDCARD_VALUE), 'P', Items.paper, 'C', new ItemStack(CoreBlock.SolidBrown, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.FloralBrown, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.FloralBrown, 1, i%14)});
        }
        
        //Recipes For Floral Cyan Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.FloralCyan, 4, 0), 
        		"SPS",
        		"PCP",
        		"SPS",
        		 'S', new ItemStack(Blocks.red_flower, 1,OreDictionary.WILDCARD_VALUE), 'P', Items.paper, 'C', new ItemStack(CoreBlock.SolidCyan, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 9; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.FloralCyan, 1, (i+1)%9), new Object[] {new ItemStack(CoreBlock.FloralCyan, 1, i%9)});
        }
        
        //Recipes For Floral Green Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.FloralGreen, 4, 0), 
        		"SPS",
        		"PCP",
        		"SPS",
        		 'S', new ItemStack(Blocks.red_flower, 1,OreDictionary.WILDCARD_VALUE), 'P', Items.paper, 'C', new ItemStack(CoreBlock.SolidGreen, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.FloralGreen, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.FloralGreen, 1, i%14)});
        }
        
        //Recipes For Floral Yellow Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.FloralYellow, 4, 0), 
        		"SPS",
        		"PCP",
        		"SPS",
        		 'S', new ItemStack(Blocks.red_flower, 1,OreDictionary.WILDCARD_VALUE), 'P', Items.paper, 'C', new ItemStack(CoreBlock.SolidYellow, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.FloralYellow, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.FloralYellow, 1, i%14)});
        }
        
        //Recipes For Floral Gray Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.FloralGray, 4, 0), 
        		"SPS",
        		"PCP",
        		"SPS",
        		 'S', new ItemStack(Blocks.red_flower, 1,OreDictionary.WILDCARD_VALUE), 'P', Items.paper, 'C', new ItemStack(CoreBlock.SolidGray, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.FloralGray, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.FloralGray, 1, i%14)});
        }
        
        
        
        
        
    	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
    	
    	
    	
    	
        //Recipes For Clay Red Blocks
        GameRegistry.addRecipe(new ItemStack(CoreBlock.ClayRed),
        		"SPS",
        		"PCP",
        		"SPS",
        		 'S', Items.clay_ball, 'P', Items.paper, 'C', new ItemStack(CoreBlock.SolidGray, 1, OreDictionary.WILDCARD_VALUE)
        );
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.ClayRed, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.ClayRed, 1, i%14)});
        }
        
        //Recipes For Clay Purple Blocks
        GameRegistry.addRecipe(new ItemStack(CoreBlock.ClayPurple),
        		"SPS",
        		"PCP",
        		"SPS",
        		 'S', Items.clay_ball, 'P', Items.paper, 'C', new ItemStack(CoreBlock.SolidGray, 1, OreDictionary.WILDCARD_VALUE)
        );
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.ClayPurple, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.ClayPurple, 1, i%14)});
        }
        
        //Recipes For Clay Blue Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.ClayBlue, 4, 0), 
        		"SPS",
        		"PCP",
        		"SPS",
        		 'S', Items.clay_ball, 'P', Items.paper, 'C', new ItemStack(CoreBlock.SolidGray, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.ClayBlue, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.ClayBlue, 1, i%14)});
        }
        
        //Recipes For Clay Brown Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.ClayBrown, 4, 0), 
        		"SPS",
        		"PCP",
        		"SPS",
        	 	 'S', Items.clay_ball, 'P', Items.paper, 'C', new ItemStack(CoreBlock.SolidGray, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.ClayBrown, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.ClayBrown, 1, i%14)});
        }
        
        //Recipes For Clay Cyan Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.ClayCyan, 4, 0), 
        		"SPS",
        		"PCP",
        		"SPS",
        		 'S', Items.clay_ball, 'P', Items.paper, 'C', new ItemStack(CoreBlock.SolidGray, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 9; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.ClayCyan, 1, (i+1)%9), new Object[] {new ItemStack(CoreBlock.ClayCyan, 1, i%9)});
        }
        
        //Recipes For Clay Green Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.ClayGreen, 4, 0), 
        		"SPS",
        		"PCP",
        		"SPS",
        		 'S', Items.clay_ball, 'P', Items.paper, 'C', new ItemStack(CoreBlock.SolidGray, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.ClayGreen, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.ClayGreen, 1, i%14)});
        }
        
        //Recipes For Clay Yellow Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.ClayYellow, 4, 0), 
        		"SPS",
        		"PCP",
        		"SPS",
        		 'S', Items.clay_ball, 'P', Items.paper, 'C', new ItemStack(CoreBlock.SolidGray, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.ClayYellow, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.ClayYellow, 1, i%14)});
        }
        
        //Recipes For Clay Gray Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.ClayGray, 4, 0), 
        		"SPS",
        		"PCP",
        		"SPS",
        		 'S', Items.clay_ball, 'P', Items.paper, 'C', new ItemStack(CoreBlock.SolidGray, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.ClayGray, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.ClayGray, 1, i%14)});
        }
    
    	
    	}
    }