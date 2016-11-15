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
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.SolidRed, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.SolidRed, 1, i%15)});
        }
    	
    	//Recipes for SolidPurpleBlocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.SolidPurple, 9, 0), 
        		"CCC",
        		"CCC",
        		"CCC",
        		 'C', new ItemStack(Blocks.stained_hardened_clay, 1, 10)   	
          	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.SolidPurple, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.SolidPurple, 1, i%15)});
        }
	
    	//Recipes for SolidBlueBlocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.SolidBlue, 9, 0), 
        		"CCC",
        		"CCC",
        		"CCC",
        		 'C', new ItemStack(Blocks.stained_hardened_clay, 1, 11)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.SolidBlue, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.SolidBlue, 1, i%15)});
        }

    	//Recipes for SolidBrownBlocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.SolidBrown, 9, 0), 
        		"CCC",
        		"CCC",
        		"CCC",
        		 'C', new ItemStack(Blocks.stained_hardened_clay, 1, 12)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.SolidBrown, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.SolidBrown, 1, i%15)});
        }

    	//Recipes for SolidCyanBlocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.SolidCyan, 9, 0), 
        		"CCC",
        		"CCC",
        		"CCC",
        		 'C', new ItemStack(Blocks.stained_hardened_clay, 1, 9)
            );
    	
        for (int i = 0; i < 10; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.SolidCyan, 1, (i+1)%10), new Object[] {new ItemStack(CoreBlock.SolidCyan, 1, i%10)});
        }

    	//Recipes for SolidGreenBlocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.SolidGreen, 9, 0), 
        		"CCC",
        		"CCC",
        		"CCC",
        		 'C', new ItemStack(Blocks.stained_hardened_clay, 1, 13)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.SolidGreen, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.SolidGreen, 1, i%15)});
        }

    	//Recipes for SolidYellowBlocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.SolidYellow, 9, 0), 
        		"CCC",
        		"CCC",
        		"CCC",
        		 'C', new ItemStack(Blocks.stained_hardened_clay, 1, 4)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.SolidYellow, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.SolidYellow, 1, i%15)});
        }
    		
    	//Recipes for SolidGrayBlocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.SolidGray, 9, 0), 
        		"CCC",
        		"CCC",
        		"CCC",
        		 'C', new ItemStack(Blocks.stained_hardened_clay, 1, 7)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.SolidGray, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.SolidGray, 1, i%15)});
        }
    	
    	
    	   	    	
    	
    	
    	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
    	
    	
    	
    	
    	//Recipes For Diagonally Dotted Red Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.DiagonallyDottedRed, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        		 'S', new ItemStack(Blocks.dirt, 1, 2), 'C', new ItemStack(CoreBlock.SolidRed, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.DiagonallyDottedRed, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.DiagonallyDottedRed, 1, i%15)});
        }

    	//Recipes For Diagonally Dotted Purple Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.DiagonallyDottedPurple, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        		 'S', new ItemStack(Blocks.dirt, 1, 2), 'C', new ItemStack(CoreBlock.SolidPurple, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.DiagonallyDottedPurple, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.DiagonallyDottedPurple, 1, i%15)});
        }

    	//Recipes For Diagonally Dotted Blue Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.DiagonallyDottedBlue, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        	     'S', new ItemStack(Blocks.dirt, 1, 2), 'C', new ItemStack(CoreBlock.SolidBlue, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.DiagonallyDottedBlue, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.DiagonallyDottedBlue, 1, i%15)});
        }

    	//Recipes For Diagonally Dotted Brown Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.DiagonallyDottedBrown, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
       		     'S', new ItemStack(Blocks.dirt, 1, 2), 'C', new ItemStack(CoreBlock.SolidBrown, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.DiagonallyDottedBrown, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.DiagonallyDottedBrown, 1, i%15)});
        }
    	
    	//Recipes For Diagonally Dotted Cyan Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.DiagonallyDottedCyan, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        	   	 'S', new ItemStack(Blocks.dirt, 1, 2), 'C', new ItemStack(CoreBlock.SolidCyan, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 10; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.DiagonallyDottedCyan, 1, (i+1)%10), new Object[] {new ItemStack(CoreBlock.DiagonallyDottedCyan, 1, i%10)});
        }

    	//Recipes For Diagonally Dotted Green Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.DiagonallyDottedGreen, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        		 'S', new ItemStack(Blocks.dirt, 1, 2), 'C', new ItemStack(CoreBlock.SolidGreen, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.DiagonallyDottedGreen, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.DiagonallyDottedGreen, 1, i%15)});
        }

    	//Recipes For Diagonally Dotted Yellow Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.DiagonallyDottedYellow, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        		 'S', new ItemStack(Blocks.dirt, 1, 2), 'C', new ItemStack(CoreBlock.SolidYellow, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.DiagonallyDottedYellow, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.DiagonallyDottedYellow, 1, i%15)});
        }

    	//Recipes For Diagonally Dotted Gray Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.DiagonallyDottedGray, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        		 'S', new ItemStack(Blocks.dirt, 1, 2), 'C', new ItemStack(CoreBlock.SolidGray, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.DiagonallyDottedGray, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.DiagonallyDottedGray, 1, i%15)});
        }
        
        
        
        
        
    	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
    	
    	
    	
    	
        //Recipes For Stripes Red Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.StripedRed, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        	   	 'S', new ItemStack(Blocks.quartz_block, 1, 2), 'C', new ItemStack(CoreBlock.SolidRed, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.StripedRed, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.StripedRed, 1, i%15)});
        }
        
        //Recipes For Stripes Purple Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.StripedPurple, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        	   	 'S', new ItemStack(Blocks.quartz_block, 1, 2), 'C', new ItemStack(CoreBlock.SolidPurple, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.StripedPurple, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.StripedPurple, 1, i%15)});
        }
        
        //Recipes For Stripes Blue Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.StripedBlue, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        	   	 'S', new ItemStack(Blocks.quartz_block, 1, 2), 'C', new ItemStack(CoreBlock.SolidBlue, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.StripedBlue, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.StripedBlue, 1, i%15)});
        }
        
        //Recipes For Stripes Brown Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.StripedBrown, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        	   	 'S', new ItemStack(Blocks.quartz_block, 1, 2), 'C', new ItemStack(CoreBlock.SolidBrown, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.StripedBrown, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.StripedBrown, 1, i%15)});
        }
        
        //Recipes For Stripes Cyan Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.StripedCyan, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        	   	 'S', new ItemStack(Blocks.quartz_block, 1, 2), 'C', new ItemStack(CoreBlock.SolidCyan, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 10; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.StripedCyan, 1, (i+1)%10), new Object[] {new ItemStack(CoreBlock.StripedCyan, 1, i%10)});
        }
        
        //Recipes For Stripes Green Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.StripedGreen, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        	   	 'S', new ItemStack(Blocks.quartz_block, 1, 2), 'C', new ItemStack(CoreBlock.SolidGreen, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.StripedGreen, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.StripedGreen, 1, i%15)});
        }
        
        //Recipes For Stripes Yellow Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.StripedYellow, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        	   	 'S', new ItemStack(Blocks.quartz_block, 1, 2), 'C', new ItemStack(CoreBlock.SolidYellow, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.StripedYellow, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.StripedYellow, 1, i%15)});
        }
        
        //Recipes For Stripes Gray Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.StripedGray, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        	   	 'S', new ItemStack(Blocks.quartz_block, 1, 2), 'C', new ItemStack(CoreBlock.SolidGray, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.StripedGray, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.StripedGray, 1, i%15)});
        }
        
        
        
        
        
    	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
    	
    	
    	
    	
        //Recipes For Floral Red Blocks
        GameRegistry.addRecipe(new ItemStack(CoreBlock.FloralRed, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        		 'S', new ItemStack(Blocks.red_flower, 1,OreDictionary.WILDCARD_VALUE), 'C', new ItemStack(CoreBlock.SolidRed, 1, OreDictionary.WILDCARD_VALUE)
        );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.FloralRed, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.FloralRed, 1, i%15)});
        }
        
        //Recipes For Floral Purple Blocks
        GameRegistry.addRecipe(new ItemStack(CoreBlock.FloralPurple),
        		" S ",
        		"SCS",
        		" S ",
        		 'S', new ItemStack(Blocks.red_flower, 1,OreDictionary.WILDCARD_VALUE), 'C', new ItemStack(CoreBlock.SolidPurple, 1, OreDictionary.WILDCARD_VALUE)
        );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.FloralPurple, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.FloralPurple, 1, i%15)});
        }
        
        //Recipes For Floral Blue Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.FloralBlue, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        		 'S', new ItemStack(Blocks.red_flower, 1,OreDictionary.WILDCARD_VALUE), 'C', new ItemStack(CoreBlock.SolidBlue, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.FloralBlue, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.FloralBlue, 1, i%15)});
        }
        
        //Recipes For Floral Brown Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.FloralBrown, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        		 'S', new ItemStack(Blocks.red_flower, 1,OreDictionary.WILDCARD_VALUE), 'C', new ItemStack(CoreBlock.SolidBrown, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.FloralBrown, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.FloralBrown, 1, i%15)});
        }
        
        //Recipes For Floral Cyan Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.FloralCyan, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        		 'S', new ItemStack(Blocks.red_flower, 1,OreDictionary.WILDCARD_VALUE), 'C', new ItemStack(CoreBlock.SolidCyan, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 10; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.FloralCyan, 1, (i+1)%10), new Object[] {new ItemStack(CoreBlock.FloralCyan, 1, i%10)});
        }
        
        //Recipes For Floral Green Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.FloralGreen, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        		 'S', new ItemStack(Blocks.red_flower, 1,OreDictionary.WILDCARD_VALUE), 'C', new ItemStack(CoreBlock.SolidGreen, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.FloralGreen, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.FloralGreen, 1, i%15)});
        }
        
        //Recipes For Floral Yellow Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.FloralYellow, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        		 'S', new ItemStack(Blocks.red_flower, 1,OreDictionary.WILDCARD_VALUE), 'C', new ItemStack(CoreBlock.SolidYellow, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.FloralYellow, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.FloralYellow, 1, i%15)});
        }
        
        //Recipes For Floral Gray Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.FloralGray, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        		 'S', new ItemStack(Blocks.red_flower, 1,OreDictionary.WILDCARD_VALUE), 'C', new ItemStack(CoreBlock.SolidGray, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.FloralGray, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.FloralGray, 1, i%15)});
        }
        
        
        
        
        
    	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
    	
    	
    	
    	
        //Recipes For Clay Red Blocks
        GameRegistry.addRecipe(new ItemStack(CoreBlock.ClayRed),
        		" S ",
        		"SCS",
        		" S ",
        		 'S', Blocks.clay, 'C', new ItemStack(CoreBlock.SolidRed, 1, OreDictionary.WILDCARD_VALUE)
        );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.ClayRed, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.ClayRed, 1, i%15)});
        }
        
        //Recipes For Clay Purple Blocks
        GameRegistry.addRecipe(new ItemStack(CoreBlock.ClayPurple),
        		" S ",
        		"SCS",
        		" S ",
        		 'S', Blocks.clay, 'C', new ItemStack(CoreBlock.SolidPurple, 1, OreDictionary.WILDCARD_VALUE)
        );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.ClayPurple, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.ClayPurple, 1, i%15)});
        }
        
        //Recipes For Clay Blue Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.ClayBlue, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        		 'S', Blocks.clay, 'C', new ItemStack(CoreBlock.SolidBlue, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.ClayBlue, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.ClayBlue, 1, i%15)});
        }
        
        //Recipes For Clay Brown Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.ClayBrown, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        	 	 'S', Blocks.clay, 'C', new ItemStack(CoreBlock.SolidBrown, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.ClayBrown, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.ClayBrown, 1, i%15)});
        }
        
        //Recipes For Clay Cyan Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.ClayCyan, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        		 'S', Blocks.clay, 'C', new ItemStack(CoreBlock.SolidCyan, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 10; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.ClayCyan, 1, (i+1)%10), new Object[] {new ItemStack(CoreBlock.ClayCyan, 1, i%10)});
        }
        
        //Recipes For Clay Green Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.ClayGreen, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        		 'S', Blocks.clay, 'C', new ItemStack(CoreBlock.SolidGreen, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.ClayGreen, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.ClayGreen, 1, i%15)});
        }
        
        //Recipes For Clay Yellow Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.ClayYellow, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        		 'S', Blocks.clay, 'C', new ItemStack(CoreBlock.SolidYellow, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.ClayYellow, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.ClayYellow, 1, i%15)});
        }
        
        //Recipes For Clay Gray Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.ClayGray, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        		 'S', Blocks.clay, 'C', new ItemStack(CoreBlock.SolidGray, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.ClayGray, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.ClayGray, 1, i%15)});
        }
        
        
        
        
        
    	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
    	
    	
    	
    	
		//Recipes for Red Tinted Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.TintedGlassRed, 4, 0), 
        		"GGG",
        		"GCG",
        		"GGG",
        		 'C', new ItemStack(CoreBlock.SolidRed, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.glass
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.TintedGlassRed, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.TintedGlassRed, 1, i%15)});
        }
        
		//Recipes for Purple Tinted Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.TintedGlassPurple, 4, 0), 
        		"GGG",
        		"GCG",
        		"GGG",
        		 'C', new ItemStack(CoreBlock.SolidPurple, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.glass
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.TintedGlassPurple, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.TintedGlassPurple, 1, i%15)});
        }
        
		//Recipes for Blue Tinted Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.TintedGlassBlue, 4, 0), 
        		"GGG",
        		"GCG",
        		"GGG",
        		 'C', new ItemStack(CoreBlock.SolidBlue, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.glass
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.TintedGlassBlue, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.TintedGlassBlue, 1, i%15)});
        }
        
		//Recipes for Cyan Tinted Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.TintedGlassCyan, 4, 0), 
        		"GGG",
        		"GCG",
        		"GGG",
        		 'C', new ItemStack(CoreBlock.SolidCyan, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.glass
        	);
    	
        for (int i = 0; i < 10; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.TintedGlassCyan, 1, (i+1)%10), new Object[] {new ItemStack(CoreBlock.TintedGlassCyan, 1, i%10)});
        }
        
		//Recipes for Green Tinted Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.TintedGlassGreen, 4, 0), 
        		"GGG",
        		"GCG",
        		"GGG",
        		 'C', new ItemStack(CoreBlock.SolidGreen, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.glass
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.TintedGlassGreen, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.TintedGlassGreen, 1, i%15)});
        }
        
		//Recipes for Yellow Tinted Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.TintedGlassYellow, 4, 0), 
        		"GGG",
        		"GCG",
        		"GGG",
        		 'C', new ItemStack(CoreBlock.SolidYellow, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.glass
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.TintedGlassYellow, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.TintedGlassYellow, 1, i%15)});
        }
        
		//Recipes for Brown Tinted Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.TintedGlassBrown, 4, 0), 
        		"GGG",
        		"GCG",
        		"GGG",
        		 'C', new ItemStack(CoreBlock.SolidBrown, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.glass
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.TintedGlassBrown, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.TintedGlassBrown, 1, i%15)});
        }
        
		//Recipes for Gray Tinted Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.TintedGlassGray, 4, 0), 
        		"GGG",
        		"GCG",
        		"GGG",
        		 'C', new ItemStack(CoreBlock.SolidGray, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.glass
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.TintedGlassGray, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.TintedGlassGray, 1, i%15)});
        }
        
        
        
        
        
    	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
    	
    	
    	
    	
		//Recipes for Red Textured Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.TexGlassRed, 4, 0), 
        		" G ",
        		"GCG",
        		" G ",
        		 'C', new ItemStack(CoreBlock.SolidRed, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.glass
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.TexGlassRed, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.TexGlassRed, 1, i%15)});
        }
        
		//Recipes for Purple Textured Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.TexGlassPurple, 4, 0), 
        		" G ",
        		"GCG",
        		" G ",
        		 'C', new ItemStack(CoreBlock.SolidPurple, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.glass
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.TexGlassPurple, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.TexGlassPurple, 1, i%15)});
        }
        
		//Recipes for Blue Textured Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.TexGlassBlue, 4, 0), 
        		" G ",
        		"GCG",
        		" G ",
        		 'C', new ItemStack(CoreBlock.SolidBlue, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.glass
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.TexGlassBlue, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.TexGlassBlue, 1, i%15)});
        }
        
		//Recipes for Cyan Textured Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.TexGlassCyan, 4, 0), 
        		" G ",
        		"GCG",
        		" G ",
        		 'C', new ItemStack(CoreBlock.SolidCyan, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.glass
        	);
    	
        for (int i = 0; i < 10; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.TexGlassCyan, 1, (i+1)%10), new Object[] {new ItemStack(CoreBlock.TexGlassCyan, 1, i%10)});
        }
        
		//Recipes for Green Textured Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.TexGlassGreen, 4, 0), 
        		" G ",
        		"GCG",
        		" G ",
        		 'C', new ItemStack(CoreBlock.SolidGreen, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.glass
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.TexGlassGreen, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.TexGlassGreen, 1, i%15)});
        }
        
		//Recipes for Yellow Textured Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.TexGlassYellow, 4, 0), 
        		" G ",
        		"GCG",
        		" G ",
        		 'C', new ItemStack(CoreBlock.SolidYellow, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.glass
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.TexGlassYellow, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.TexGlassYellow, 1, i%15)});
        }
        
		//Recipes for Brown Textured Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.TexGlassBrown, 4, 0), 
        		" G ",
        		"GCG",
        		" G ",
        		 'C', new ItemStack(CoreBlock.SolidBrown, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.glass
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.TexGlassBrown, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.TexGlassBrown, 1, i%15)});
        }
        
		//Recipes for Gray Textured Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.TexGlassGray, 4, 0), 
        		" G ",
        		"GCG",
        		" G ",
        		 'C', new ItemStack(CoreBlock.SolidGray, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.glass
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.TexGlassGray, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.TexGlassGray, 1, i%15)});
        }
        
        
        
        
        
    	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
    	
    	
    	
    	
		//Recipes for Red Frosted Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.FrostedGlassRed, 4, 0), 
        		"G G",
        		" C ",
        		"G G",
        		 'C', new ItemStack(CoreBlock.SolidRed, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.glass
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.FrostedGlassRed, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.FrostedGlassRed, 1, i%15)});
        }
        
		//Recipes for Purple Frosted Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.FrostedGlassPurple, 4, 0), 
        		"G G",
        		" C ",
        		"G G",
        		 'C', new ItemStack(CoreBlock.SolidPurple, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.glass
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.FrostedGlassPurple, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.FrostedGlassPurple, 1, i%15)});
        }
        
		//Recipes for Blue Frosted Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.FrostedGlassBlue, 4, 0), 
        		"G G",
        		" C ",
        		"G G",
        		 'C', new ItemStack(CoreBlock.SolidBlue, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.glass
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.FrostedGlassBlue, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.FrostedGlassBlue, 1, i%15)});
        }
        
		//Recipes for Cyan Frosted Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.FrostedGlassCyan, 4, 0), 
        		"G G",
        		" C ",
        		"G G",
        		 'C', new ItemStack(CoreBlock.SolidCyan, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.glass
        	);
    	
        for (int i = 0; i < 10; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.FrostedGlassCyan, 1, (i+1)%10), new Object[] {new ItemStack(CoreBlock.FrostedGlassCyan, 1, i%10)});
        }
        
		//Recipes for Green Frosted Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.FrostedGlassGreen, 4, 0), 
        		"G G",
        		" C ",
        		"G G",
        		 'C', new ItemStack(CoreBlock.SolidGreen, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.glass
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.FrostedGlassGreen, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.FrostedGlassGreen, 1, i%15)});
        }
        
		//Recipes for Yellow Frosted Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.FrostedGlassYellow, 4, 0), 
        		"G G",
        		" C ",
        		"G G",
        		 'C', new ItemStack(CoreBlock.SolidYellow, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.glass
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.FrostedGlassYellow, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.FrostedGlassYellow, 1, i%15)});
        }
        
		//Recipes for Brown Frosted Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.FrostedGlassBrown, 4, 0), 
        		"G G",
        		" C ",
        		"G G",
        		 'C', new ItemStack(CoreBlock.SolidBrown, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.glass
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.FrostedGlassBrown, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.FrostedGlassBrown, 1, i%15)});
        }
        
		//Recipes for Gray Frosted Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.FrostedGlassGray, 4, 0), 
        		"G G",
        		" C ",
        		"G G",
        		 'C', new ItemStack(CoreBlock.SolidGray, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.glass
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.FrostedGlassGray, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.FrostedGlassGray, 1, i%15)});
        }
        
        
        
        
        
    	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
    	
    	
    	
    	
		//Recipes for Red Brick Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.BrickRed, 4, 0), 
        		"BBB",
        		"BCB",
        		"BBB",
        		 'C', new ItemStack(CoreBlock.SolidRed, 1, OreDictionary.WILDCARD_VALUE), 'B', Blocks.brick_block
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.BrickRed, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.BrickRed, 1, i%15)});
        }
        
		//Recipes for Purple Brick Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.BrickPurple, 4, 0), 
        		"BBB",
        		"BCB",
        		"BBB",
        		 'C', new ItemStack(CoreBlock.SolidPurple, 1, OreDictionary.WILDCARD_VALUE), 'B', Blocks.brick_block
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.BrickPurple, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.BrickPurple, 1, i%15)});
        }
        
		//Recipes for Blue Brick Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.BrickBlue, 4, 0), 
        		"BBB",
        		"BCB",
        		"BBB",
        		 'C', new ItemStack(CoreBlock.SolidBlue, 1, OreDictionary.WILDCARD_VALUE), 'B', Blocks.brick_block
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.BrickBlue, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.BrickBlue, 1, i%15)});
        }
        
		//Recipes for Cyan Brick Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.BrickCyan, 4, 0), 
        		"BBB",
        		"BCB",
        		"BBB",
        		 'C', new ItemStack(CoreBlock.SolidCyan, 1, OreDictionary.WILDCARD_VALUE), 'B', Blocks.brick_block
        	);
    	
        for (int i = 0; i < 10; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.BrickCyan, 1, (i+1)%10), new Object[] {new ItemStack(CoreBlock.BrickCyan, 1, i%10)});
        }
        
		//Recipes for Green Brick Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.BrickGreen, 4, 0), 
        		"BBB",
        		"BCB",
        		"BBB",
        		 'C', new ItemStack(CoreBlock.SolidGreen, 1, OreDictionary.WILDCARD_VALUE), 'B', Blocks.brick_block
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.BrickGreen, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.BrickGreen, 1, i%15)});
        }
        
		//Recipes for Yellow Brick Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.BrickYellow, 4, 0), 
        		"BBB",
        		"BCB",
        		"BBB",
        		 'C', new ItemStack(CoreBlock.SolidYellow, 1, OreDictionary.WILDCARD_VALUE), 'B', Blocks.brick_block
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.BrickYellow, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.BrickYellow, 1, i%15)});
        }
        
		//Recipes for Brown Brick Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.BrickBrown, 4, 0), 
        		"BBB",
        		"BCB",
        		"BBB",
        		 'C', new ItemStack(CoreBlock.SolidBrown, 1, OreDictionary.WILDCARD_VALUE), 'B', Blocks.brick_block
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.BrickBrown, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.BrickBrown, 1, i%15)});
        }
        
		//Recipes for Gray Brick Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.BrickGray, 4, 0), 
        		"BBB",
        		"BCB",
        		"BBB",
        		 'C', new ItemStack(CoreBlock.SolidGray, 1, OreDictionary.WILDCARD_VALUE), 'B', Blocks.brick_block
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.BrickGray, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.BrickGray, 1, i%15)});
        }
        
        
        
        
        
    	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
    	
    	
    	
    	
		//Recipes for Red Dotted Carpet Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.DottedCarpetRed, 4, 0), 
        		"WWW",
        		"WCW",
        		"WWW",
        		 'C', new ItemStack(CoreBlock.SolidRed, 1, OreDictionary.WILDCARD_VALUE), 'W', new ItemStack(Blocks.wool, 1,OreDictionary.WILDCARD_VALUE)
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.DottedCarpetRed, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.DottedCarpetRed, 1, i%15)});
        }
        
		//Recipes for Purple Dotted Carpet Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.DottedCarpetPurple, 4, 0), 
        		"WWW",
        		"WCW",
        		"WWW",
        		 'C', new ItemStack(CoreBlock.SolidPurple, 1, OreDictionary.WILDCARD_VALUE), 'W', new ItemStack(Blocks.wool, 1,OreDictionary.WILDCARD_VALUE)
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.DottedCarpetPurple, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.DottedCarpetPurple, 1, i%15)});
        }
        
		//Recipes for Blue Dotted Carpet Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.DottedCarpetBlue, 4, 0), 
        		"WWW",
        		"WCW",
        		"WWW",
        		 'C', new ItemStack(CoreBlock.SolidBlue, 1, OreDictionary.WILDCARD_VALUE), 'W', new ItemStack(Blocks.wool, 1,OreDictionary.WILDCARD_VALUE)
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.DottedCarpetBlue, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.DottedCarpetBlue, 1, i%15)});
        }
        
		//Recipes for Cyan Dotted Carpet Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.DottedCarpetCyan, 4, 0), 
        		"WWW",
        		"WCW",
        		"WWW",
        		 'C', new ItemStack(CoreBlock.SolidCyan, 1, OreDictionary.WILDCARD_VALUE), 'W', new ItemStack(Blocks.wool, 1,OreDictionary.WILDCARD_VALUE)
        	);
    	
        for (int i = 0; i < 10; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.DottedCarpetCyan, 1, (i+1)%10), new Object[] {new ItemStack(CoreBlock.DottedCarpetCyan, 1, i%10)});
        }
        
		//Recipes for Green Dotted Carpet Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.DottedCarpetGreen, 4, 0), 
        		"WWW",
        		"WCW",
        		"WWW",
        		 'C', new ItemStack(CoreBlock.SolidGreen, 1, OreDictionary.WILDCARD_VALUE), 'W', new ItemStack(Blocks.wool, 1,OreDictionary.WILDCARD_VALUE)
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.DottedCarpetGreen, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.DottedCarpetGreen, 1, i%15)});
        }
        
		//Recipes for Yellow Dotted Carpet Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.DottedCarpetYellow, 4, 0), 
        		"WWW",
        		"WCW",
        		"WWW",
        		 'C', new ItemStack(CoreBlock.SolidYellow, 1, OreDictionary.WILDCARD_VALUE), 'W', new ItemStack(Blocks.wool, 1,OreDictionary.WILDCARD_VALUE)
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.DottedCarpetYellow, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.DottedCarpetYellow, 1, i%15)});
        }
        
		//Recipes for Brown Dotted Carpet Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.DottedCarpetBrown, 4, 0), 
        		"WWW",
        		"WCW",
        		"WWW",
        		 'C', new ItemStack(CoreBlock.SolidBrown, 1, OreDictionary.WILDCARD_VALUE), 'W', new ItemStack(Blocks.wool, 1,OreDictionary.WILDCARD_VALUE)
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.DottedCarpetBrown, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.DottedCarpetBrown, 1, i%15)});
        }
        
		//Recipes for Gray Dotted Carpet Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.DottedCarpetGray, 4, 0), 
        		"WWW",
        		"WCW",
        		"WWW",
        		 'C', new ItemStack(CoreBlock.SolidGray, 1, OreDictionary.WILDCARD_VALUE), 'W', new ItemStack(Blocks.wool, 1,OreDictionary.WILDCARD_VALUE)
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.DottedCarpetGray, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.DottedCarpetGray, 1, i%15)});
        }
    	
    	
    	   	    	
    	
    	
    	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
    	
    	
    	
    	
		//Recipes for Red Dotted Rugs
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.DottedRugRed, 3, 0), 
        		"WW",
        		 'W', new ItemStack(CoreBlock.DottedCarpetRed, 1,OreDictionary.WILDCARD_VALUE)
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.DottedRugRed, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.DottedRugRed, 1, i%15)});
        }
        
		//Recipes for Purple Dotted Rugs
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.DottedRugPurple, 3, 0), 
        		"WW",
        		 'W', new ItemStack(CoreBlock.DottedCarpetPurple, 1,OreDictionary.WILDCARD_VALUE)
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.DottedRugPurple, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.DottedRugPurple, 1, i%15)});
        }
        
		//Recipes for Blue Dotted Rugs
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.DottedRugBlue, 3, 0), 
        		"WW",
        		 'W', new ItemStack(CoreBlock.DottedCarpetBlue, 1,OreDictionary.WILDCARD_VALUE)
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.DottedRugBlue, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.DottedRugBlue, 1, i%15)});
        }
        
		//Recipes for Cyan Dotted Rugs
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.DottedRugCyan, 3, 0), 
        		"WW",
        		 'W', new ItemStack(CoreBlock.DottedCarpetCyan, 1,OreDictionary.WILDCARD_VALUE)
        	);
    	
        for (int i = 0; i < 10; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.DottedRugCyan, 1, (i+1)%10), new Object[] {new ItemStack(CoreBlock.DottedRugCyan, 1, i%10)});
        }
        
		//Recipes for Green Dotted Rugs
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.DottedRugGreen, 3, 0), 
        		"WW",
        		 'W', new ItemStack(CoreBlock.DottedCarpetGreen, 1,OreDictionary.WILDCARD_VALUE)
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.DottedRugGreen, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.DottedRugGreen, 1, i%15)});
        }
        
		//Recipes for Yellow Dotted Rugs
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.DottedRugYellow, 3, 0), 
        		"WW",
        		 'W', new ItemStack(CoreBlock.DottedCarpetYellow, 1,OreDictionary.WILDCARD_VALUE)
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.DottedRugYellow, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.DottedRugYellow, 1, i%15)});
        }
        
		//Recipes for Brown Dotted Rugs
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.DottedRugBrown, 3, 0), 
        		"WW",
        		 'W', new ItemStack(CoreBlock.DottedCarpetBrown, 1,OreDictionary.WILDCARD_VALUE)
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.DottedRugBrown, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.DottedRugBrown, 1, i%15)});
        }
        
		//Recipes for Gray Dotted Rugs
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.DottedRugGray, 3, 0), 
        		"WW",
        		 'W', new ItemStack(CoreBlock.DottedCarpetGray, 1,OreDictionary.WILDCARD_VALUE)
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.DottedRugGray, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.DottedRugGray, 1, i%15)});
        }

        
        
        
        
        
        
    	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
    	
    	
    	
    	
		//Recipes for Red Checkered Carpet Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.CheckeredCarpetRed, 4, 0), 
        		" W ",
        		"WCW",
        		" W ",
        		 'C', new ItemStack(CoreBlock.SolidRed, 1, OreDictionary.WILDCARD_VALUE), 'W', new ItemStack(Blocks.wool, 1,OreDictionary.WILDCARD_VALUE)
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.CheckeredCarpetRed, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.CheckeredCarpetRed, 1, i%15)});
        }
        
		//Recipes for Purple Checkered Carpet Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.CheckeredCarpetPurple, 4, 0), 
        		" W ",
        		"WCW",
        		" W ",
        		 'C', new ItemStack(CoreBlock.SolidPurple, 1, OreDictionary.WILDCARD_VALUE), 'W', new ItemStack(Blocks.wool, 1,OreDictionary.WILDCARD_VALUE)
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.CheckeredCarpetPurple, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.CheckeredCarpetPurple, 1, i%15)});
        }
        
		//Recipes for Blue Checkered Carpet Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.CheckeredCarpetBlue, 4, 0), 
        		" W ",
        		"WCW",
        		" W ",
        		 'C', new ItemStack(CoreBlock.SolidBlue, 1, OreDictionary.WILDCARD_VALUE), 'W', new ItemStack(Blocks.wool, 1,OreDictionary.WILDCARD_VALUE)
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.CheckeredCarpetBlue, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.CheckeredCarpetBlue, 1, i%15)});
        }
        
		//Recipes for Cyan Checkered Carpet Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.CheckeredCarpetCyan, 4, 0), 
        		" W ",
        		"WCW",
        		" W ",
        		 'C', new ItemStack(CoreBlock.SolidCyan, 1, OreDictionary.WILDCARD_VALUE), 'W', new ItemStack(Blocks.wool, 1,OreDictionary.WILDCARD_VALUE)
        	);
    	
        for (int i = 0; i < 10; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.CheckeredCarpetCyan, 1, (i+1)%10), new Object[] {new ItemStack(CoreBlock.CheckeredCarpetCyan, 1, i%10)});
        }
        
		//Recipes for Green Checkered Carpet Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.CheckeredCarpetGreen, 4, 0), 
        		" W ",
        		"WCW",
        		" W ",
        		 'C', new ItemStack(CoreBlock.SolidGreen, 1, OreDictionary.WILDCARD_VALUE), 'W', new ItemStack(Blocks.wool, 1,OreDictionary.WILDCARD_VALUE)
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.CheckeredCarpetGreen, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.CheckeredCarpetGreen, 1, i%15)});
        }
        
		//Recipes for Yellow Checkered Carpet Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.CheckeredCarpetYellow, 4, 0), 
        		" W ",
        		"WCW",
        		" W ",
        		 'C', new ItemStack(CoreBlock.SolidYellow, 1, OreDictionary.WILDCARD_VALUE), 'W', new ItemStack(Blocks.wool, 1,OreDictionary.WILDCARD_VALUE)
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.CheckeredCarpetYellow, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.CheckeredCarpetYellow, 1, i%15)});
        }
        
		//Recipes for Brown Checkered Carpet Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.CheckeredCarpetBrown, 4, 0), 
        		" W ",
        		"WCW",
        		" W ",
        		 'C', new ItemStack(CoreBlock.SolidBrown, 1, OreDictionary.WILDCARD_VALUE), 'W', new ItemStack(Blocks.wool, 1,OreDictionary.WILDCARD_VALUE)
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.CheckeredCarpetBrown, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.CheckeredCarpetBrown, 1, i%15)});
        }
        
		//Recipes for Gray Checkered Carpet Blocks
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.CheckeredCarpetGray, 4, 0), 
        		" W ",
        		"WCW",
        		" W ",
        		 'C', new ItemStack(CoreBlock.SolidGray, 1, OreDictionary.WILDCARD_VALUE), 'W', new ItemStack(Blocks.wool, 1,OreDictionary.WILDCARD_VALUE)
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.CheckeredCarpetGray, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.CheckeredCarpetGray, 1, i%15)});
        }
    	
    	
    	   	    	
    	
    	
    	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
    	
    	
    	
    	
		//Recipes for Red Checkered Rugs
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.CheckeredRugRed, 3, 0), 
        		"WW",
        		 'W', new ItemStack(CoreBlock.CheckeredCarpetRed, 1,OreDictionary.WILDCARD_VALUE)
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.CheckeredRugRed, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.CheckeredRugRed, 1, i%15)});
        }
        
		//Recipes for Purple Checkered Rugs
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.CheckeredRugPurple, 3, 0), 
        		"WW",
        		 'W', new ItemStack(CoreBlock.CheckeredCarpetPurple, 1,OreDictionary.WILDCARD_VALUE)
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.CheckeredRugPurple, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.CheckeredRugPurple, 1, i%15)});
        }
        
		//Recipes for Blue Checkered Rugs
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.CheckeredRugBlue, 3, 0), 
        		"WW",
        		 'W', new ItemStack(CoreBlock.CheckeredCarpetBlue, 1,OreDictionary.WILDCARD_VALUE)
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.CheckeredRugBlue, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.CheckeredRugBlue, 1, i%15)});
        }
        
		//Recipes for Cyan Checkered Rugs
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.CheckeredRugCyan, 3, 0), 
        		"WW",
        		 'W', new ItemStack(CoreBlock.CheckeredCarpetCyan, 1,OreDictionary.WILDCARD_VALUE)
        	);
    	
        for (int i = 0; i < 10; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.CheckeredRugCyan, 1, (i+1)%10), new Object[] {new ItemStack(CoreBlock.CheckeredRugCyan, 1, i%10)});
        }
        
		//Recipes for Green Checkered Rugs
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.CheckeredRugGreen, 3, 0), 
        		"WW",
        		 'W', new ItemStack(CoreBlock.CheckeredCarpetGreen, 1,OreDictionary.WILDCARD_VALUE)
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.CheckeredRugGreen, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.CheckeredRugGreen, 1, i%15)});
        }
        
		//Recipes for Yellow Checkered Rugs
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.CheckeredRugYellow, 3, 0), 
        		"WW",
        		 'W', new ItemStack(CoreBlock.CheckeredCarpetYellow, 1,OreDictionary.WILDCARD_VALUE)
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.CheckeredRugYellow, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.CheckeredRugYellow, 1, i%15)});
        }
        
		//Recipes for Brown Checkered Rugs
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.CheckeredRugBrown, 3, 0), 
        		"WW",
        		 'W', new ItemStack(CoreBlock.CheckeredCarpetBrown, 1,OreDictionary.WILDCARD_VALUE)
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.CheckeredRugBrown, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.CheckeredRugBrown, 1, i%15)});
        }
        
		//Recipes for Gray Checkered Rugs
    	GameRegistry.addRecipe(new ItemStack(CoreBlock.CheckeredRugGray, 3, 0), 
        		"WW",
        		 'W', new ItemStack(CoreBlock.CheckeredCarpetGray, 1,OreDictionary.WILDCARD_VALUE)
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(CoreBlock.CheckeredRugGray, 1, (i+1)%15), new Object[] {new ItemStack(CoreBlock.CheckeredRugGray, 1, i%15)});
        }
		
        
    	
    	}
    }