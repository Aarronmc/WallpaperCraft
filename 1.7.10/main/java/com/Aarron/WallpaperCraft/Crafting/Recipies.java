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
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.StripedRed, 4, 0), 
        		"SPS",
        		"PCP",
        		"SPS",
        	   	 'S', new ItemStack(Blocks.quartz_block, 1, 2), 'P', Items.paper, 'C', new ItemStack(CoreBlock.SolidRed, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.StripedRed, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.StripedRed, 1, i%14)});
        }
        
        //Recipes For Stripes Purple Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.StripedPurple, 4, 0), 
        		"SPS",
        		"PCP",
        		"SPS",
        	   	 'S', new ItemStack(Blocks.quartz_block, 1, 2), 'P', Items.paper, 'C', new ItemStack(CoreBlock.SolidPurple, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.StripedPurple, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.StripedPurple, 1, i%14)});
        }
        
        //Recipes For Stripes Blue Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.StripedBlue, 4, 0), 
        		"SPS",
        		"PCP",
        		"SPS",
        	   	 'S', new ItemStack(Blocks.quartz_block, 1, 2), 'P', Items.paper, 'C', new ItemStack(CoreBlock.SolidBlue, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.StripedBlue, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.StripedBlue, 1, i%14)});
        }
        
        //Recipes For Stripes Brown Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.StripedBrown, 4, 0), 
        		"SPS",
        		"PCP",
        		"SPS",
        	   	 'S', new ItemStack(Blocks.quartz_block, 1, 2), 'P', Items.paper, 'C', new ItemStack(CoreBlock.SolidBrown, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.StripedBrown, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.StripedBrown, 1, i%14)});
        }
        
        //Recipes For Stripes Cyan Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.StripedCyan, 4, 0), 
        		"SPS",
        		"PCP",
        		"SPS",
        	   	 'S', new ItemStack(Blocks.quartz_block, 1, 2), 'P', Items.paper, 'C', new ItemStack(CoreBlock.SolidCyan, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 9; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.StripedCyan, 1, (i+1)%9), new Object[] {new ItemStack(CoreBlock.StripedCyan, 1, i%9)});
        }
        
        //Recipes For Stripes Green Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.StripedGreen, 4, 0), 
        		"SPS",
        		"PCP",
        		"SPS",
        	   	 'S', new ItemStack(Blocks.quartz_block, 1, 2), 'P', Items.paper, 'C', new ItemStack(CoreBlock.SolidGreen, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.StripedGreen, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.StripedGreen, 1, i%14)});
        }
        
        //Recipes For Stripes Yellow Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.StripedYellow, 4, 0), 
        		"SPS",
        		"PCP",
        		"SPS",
        	   	 'S', new ItemStack(Blocks.quartz_block, 1, 2), 'P', Items.paper, 'C', new ItemStack(CoreBlock.SolidYellow, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.StripedYellow, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.StripedYellow, 1, i%14)});
        }
        
        //Recipes For Stripes Gray Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.StripedGray, 4, 0), 
        		"SPS",
        		"PCP",
        		"SPS",
        	   	 'S', new ItemStack(Blocks.quartz_block, 1, 2), 'P', Items.paper, 'C', new ItemStack(CoreBlock.SolidGray, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.StripedGray, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.StripedGray, 1, i%14)});
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
        		 'S', Items.clay_ball, 'P', Items.paper, 'C', new ItemStack(CoreBlock.SolidRed, 1, OreDictionary.WILDCARD_VALUE)
        );
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.ClayRed, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.ClayRed, 1, i%14)});
        }
        
        //Recipes For Clay Purple Blocks
        GameRegistry.addRecipe(new ItemStack(CoreBlock.ClayPurple),
        		"SPS",
        		"PCP",
        		"SPS",
        		 'S', Items.clay_ball, 'P', Items.paper, 'C', new ItemStack(CoreBlock.SolidPurple, 1, OreDictionary.WILDCARD_VALUE)
        );
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.ClayPurple, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.ClayPurple, 1, i%14)});
        }
        
        //Recipes For Clay Blue Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.ClayBlue, 4, 0), 
        		"SPS",
        		"PCP",
        		"SPS",
        		 'S', Items.clay_ball, 'P', Items.paper, 'C', new ItemStack(CoreBlock.SolidBlue, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.ClayBlue, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.ClayBlue, 1, i%14)});
        }
        
        //Recipes For Clay Brown Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.ClayBrown, 4, 0), 
        		"SPS",
        		"PCP",
        		"SPS",
        	 	 'S', Items.clay_ball, 'P', Items.paper, 'C', new ItemStack(CoreBlock.SolidBrown, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.ClayBrown, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.ClayBrown, 1, i%14)});
        }
        
        //Recipes For Clay Cyan Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.ClayCyan, 4, 0), 
        		"SPS",
        		"PCP",
        		"SPS",
        		 'S', Items.clay_ball, 'P', Items.paper, 'C', new ItemStack(CoreBlock.SolidCyan, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 9; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.ClayCyan, 1, (i+1)%9), new Object[] {new ItemStack(CoreBlock.ClayCyan, 1, i%9)});
        }
        
        //Recipes For Clay Green Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.ClayGreen, 4, 0), 
        		"SPS",
        		"PCP",
        		"SPS",
        		 'S', Items.clay_ball, 'P', Items.paper, 'C', new ItemStack(CoreBlock.SolidGreen, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.ClayGreen, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.ClayGreen, 1, i%14)});
        }
        
        //Recipes For Clay Yellow Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.ClayYellow, 4, 0), 
        		"SPS",
        		"PCP",
        		"SPS",
        		 'S', Items.clay_ball, 'P', Items.paper, 'C', new ItemStack(CoreBlock.SolidYellow, 1, OreDictionary.WILDCARD_VALUE)
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
        
        
        
        
        
    	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
    	
    	
    	
    	
		//Recipes for Red Tinted Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.TintedGlassRed, 8, 0), 
        		"GGG",
        		"GCG",
        		"GGG",
        		 'C', new ItemStack(CoreBlock.SolidRed, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.glass
        	);
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.TintedGlassRed, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.TintedGlassRed, 1, i%14)});
        }
        
		//Recipes for Purple Tinted Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.TintedGlassPurple, 8, 0), 
        		"GGG",
        		"GCG",
        		"GGG",
        		 'C', new ItemStack(CoreBlock.SolidPurple, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.glass
        	);
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.TintedGlassPurple, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.TintedGlassPurple, 1, i%14)});
        }
        
		//Recipes for Blue Tinted Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.TintedGlassBlue, 8, 0), 
        		"GGG",
        		"GCG",
        		"GGG",
        		 'C', new ItemStack(CoreBlock.SolidBlue, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.glass
        	);
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.TintedGlassBlue, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.TintedGlassBlue, 1, i%14)});
        }
        
		//Recipes for Cyan Tinted Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.TintedGlassCyan, 8, 0), 
        		"GGG",
        		"GCG",
        		"GGG",
        		 'C', new ItemStack(CoreBlock.SolidCyan, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.glass
        	);
    	
        for (int i = 0; i < 9; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.TintedGlassCyan, 1, (i+1)%9), new Object[] {new ItemStack(CoreBlock.TintedGlassCyan, 1, i%9)});
        }
        
		//Recipes for Green Tinted Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.TintedGlassGreen, 8, 0), 
        		"GGG",
        		"GCG",
        		"GGG",
        		 'C', new ItemStack(CoreBlock.SolidGreen, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.glass
        	);
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.TintedGlassGreen, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.TintedGlassGreen, 1, i%14)});
        }
        
		//Recipes for Yellow Tinted Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.TintedGlassYellow, 8, 0), 
        		"GGG",
        		"GCG",
        		"GGG",
        		 'C', new ItemStack(CoreBlock.SolidYellow, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.glass
        	);
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.TintedGlassYellow, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.TintedGlassYellow, 1, i%14)});
        }
        
		//Recipes for Brown Tinted Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.TintedGlassBrown, 8, 0), 
        		"GGG",
        		"GCG",
        		"GGG",
        		 'C', new ItemStack(CoreBlock.SolidBrown, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.glass
        	);
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.TintedGlassBrown, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.TintedGlassBrown, 1, i%14)});
        }
        
		//Recipes for Gray Tinted Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.TintedGlassGray, 8, 0), 
        		"GGG",
        		"GCG",
        		"GGG",
        		 'C', new ItemStack(CoreBlock.SolidGray, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.glass
        	);
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.TintedGlassGray, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.TintedGlassGray, 1, i%14)});
        }
        
        
        
        
        
    	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
    	
    	
    	
    	
		//Recipes for Red Textured Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.TexGlassRed, 4, 0), 
        		" G ",
        		"GCG",
        		" G ",
        		 'C', new ItemStack(CoreBlock.SolidRed, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.glass
        	);
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.TexGlassRed, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.TexGlassRed, 1, i%14)});
        }
        
		//Recipes for Purple Textured Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.TexGlassPurple, 4, 0), 
        		" G ",
        		"GCG",
        		" G ",
        		 'C', new ItemStack(CoreBlock.SolidPurple, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.glass
        	);
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.TexGlassPurple, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.TexGlassPurple, 1, i%14)});
        }
        
		//Recipes for Blue Textured Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.TexGlassBlue, 4, 0), 
        		" G ",
        		"GCG",
        		" G ",
        		 'C', new ItemStack(CoreBlock.SolidBlue, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.glass
        	);
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.TexGlassBlue, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.TexGlassBlue, 1, i%14)});
        }
        
		//Recipes for Cyan Textured Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.TexGlassCyan, 4, 0), 
        		" G ",
        		"GCG",
        		" G ",
        		 'C', new ItemStack(CoreBlock.SolidCyan, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.glass
        	);
    	
        for (int i = 0; i < 9; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.TexGlassCyan, 1, (i+1)%9), new Object[] {new ItemStack(CoreBlock.TexGlassCyan, 1, i%9)});
        }
        
		//Recipes for Green Textured Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.TexGlassGreen, 4, 0), 
        		" G ",
        		"GCG",
        		" G ",
        		 'C', new ItemStack(CoreBlock.SolidGreen, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.glass
        	);
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.TexGlassGreen, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.TexGlassGreen, 1, i%14)});
        }
        
		//Recipes for Yellow Textured Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.TexGlassYellow, 4, 0), 
        		" G ",
        		"GCG",
        		" G ",
        		 'C', new ItemStack(CoreBlock.SolidYellow, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.glass
        	);
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.TexGlassYellow, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.TexGlassYellow, 1, i%14)});
        }
        
		//Recipes for Brown Textured Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.TexGlassBrown, 4, 0), 
        		" G ",
        		"GCG",
        		" G ",
        		 'C', new ItemStack(CoreBlock.SolidBrown, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.glass
        	);
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.TexGlassBrown, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.TexGlassBrown, 1, i%14)});
        }
        
		//Recipes for Gray Textured Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.TexGlassGray, 4, 0), 
        		" G ",
        		"GCG",
        		" G ",
        		 'C', new ItemStack(CoreBlock.SolidGray, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.glass
        	);
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.TexGlassGray, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.TexGlassGray, 1, i%14)});
        }
        
        
        
        
        
    	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
    	
    	
    	
    	
		//Recipes for Red Frosted Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.FrostedGlassRed, 4, 0), 
        		"G G",
        		" C ",
        		"G G",
        		 'C', new ItemStack(CoreBlock.SolidRed, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.glass
        	);
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.FrostedGlassRed, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.FrostedGlassRed, 1, i%14)});
        }
        
		//Recipes for Purple Frosted Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.FrostedGlassPurple, 4, 0), 
        		"G G",
        		" C ",
        		"G G",
        		 'C', new ItemStack(CoreBlock.SolidPurple, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.glass
        	);
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.FrostedGlassPurple, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.FrostedGlassPurple, 1, i%14)});
        }
        
		//Recipes for Blue Frosted Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.FrostedGlassBlue, 4, 0), 
        		"G G",
        		" C ",
        		"G G",
        		 'C', new ItemStack(CoreBlock.SolidBlue, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.glass
        	);
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.FrostedGlassBlue, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.FrostedGlassBlue, 1, i%14)});
        }
        
		//Recipes for Cyan Frosted Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.FrostedGlassCyan, 4, 0), 
        		"G G",
        		" C ",
        		"G G",
        		 'C', new ItemStack(CoreBlock.SolidCyan, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.glass
        	);
    	
        for (int i = 0; i < 9; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.FrostedGlassCyan, 1, (i+1)%9), new Object[] {new ItemStack(CoreBlock.FrostedGlassCyan, 1, i%9)});
        }
        
		//Recipes for Green Frosted Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.FrostedGlassGreen, 4, 0), 
        		"G G",
        		" C ",
        		"G G",
        		 'C', new ItemStack(CoreBlock.SolidGreen, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.glass
        	);
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.FrostedGlassGreen, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.FrostedGlassGreen, 1, i%14)});
        }
        
		//Recipes for Yellow Frosted Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.FrostedGlassYellow, 4, 0), 
        		"G G",
        		" C ",
        		"G G",
        		 'C', new ItemStack(CoreBlock.SolidYellow, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.glass
        	);
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.FrostedGlassYellow, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.FrostedGlassYellow, 1, i%14)});
        }
        
		//Recipes for Brown Frosted Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.FrostedGlassBrown, 4, 0), 
        		"G G",
        		" C ",
        		"G G",
        		 'C', new ItemStack(CoreBlock.SolidBrown, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.glass
        	);
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.FrostedGlassBrown, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.FrostedGlassBrown, 1, i%14)});
        }
        
		//Recipes for Gray Frosted Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.FrostedGlassGray, 4, 0), 
        		"G G",
        		" C ",
        		"G G",
        		 'C', new ItemStack(CoreBlock.SolidGray, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.glass
        	);
    	
        for (int i = 0; i < 14; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.FrostedGlassGray, 1, (i+1)%14), new Object[] {new ItemStack(CoreBlock.FrostedGlassGray, 1, i%14)});
        }
        
    	
    	}
    }