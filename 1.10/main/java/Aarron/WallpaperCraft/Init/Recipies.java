package Aarron.WallpaperCraft.Init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;





public class Recipies {
	
	
	
	public static void init() {
		
		//Recipes for SolidRedBlock
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.SolidRed, 9, 0), 
        		"CCC",
        		"CCC",
        		"CCC",
        		 'C', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 14)    	
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidRed, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.SolidRed, 1, i%15)});
        }
    	
    	//Recipes for SolidPurpleBlocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.SolidPurple, 9, 0), 
        		"CCC",
        		"CCC",
        		"CCC",
        		 'C', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 10)   	
          	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidPurple, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.SolidPurple, 1, i%15)});
        }
	
    	//Recipes for SolidBlueBlocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.SolidBlue, 9, 0), 
        		"CCC",
        		"CCC",
        		"CCC",
        		 'C', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 11)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidBlue, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.SolidBlue, 1, i%15)});
        }

    	//Recipes for SolidBrownBlocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.SolidBrown, 9, 0), 
        		"CCC",
        		"CCC",
        		"CCC",
        		 'C', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 12)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidBrown, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.SolidBrown, 1, i%15)});
        }

    	//Recipes for SolidCyanBlocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.SolidCyan, 9, 0), 
        		"CCC",
        		"CCC",
        		"CCC",
        		 'C', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 9)
            );
    	
        for (int i = 0; i < 10; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidCyan, 1, (i+1)%10), new Object[] {new ItemStack(ModBlocks.SolidCyan, 1, i%10)});
        }

    	//Recipes for SolidGreenBlocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.SolidGreen, 9, 0), 
        		"CCC",
        		"CCC",
        		"CCC",
        		 'C', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 13)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidGreen, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.SolidGreen, 1, i%15)});
        }

    	//Recipes for SolidYellowBlocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.SolidYellow, 9, 0), 
        		"CCC",
        		"CCC",
        		"CCC",
        		 'C', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 4)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidYellow, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.SolidYellow, 1, i%15)});
        }
    		
    	//Recipes for SolidGrayBlocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.SolidGray, 9, 0), 
        		"CCC",
        		"CCC",
        		"CCC",
        		 'C', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 7)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidGray, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.SolidGray, 1, i%15)});
        }
    	
    	
    	   	    	
    	
    	
    	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
    	
    	
    	
    	
    	//Recipes For Diagonally Dotted Red Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.DiagonallyDottedRed, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        		 'S', new ItemStack(Blocks.DIRT, 1, 2), 'C', new ItemStack(ModBlocks.SolidRed, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedRed, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.DiagonallyDottedRed, 1, i%15)});
        }

    	//Recipes For Diagonally Dotted Purple Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.DiagonallyDottedPurple, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        		 'S', new ItemStack(Blocks.DIRT, 1, 2), 'C', new ItemStack(ModBlocks.SolidPurple, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedPurple, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.DiagonallyDottedPurple, 1, i%15)});
        }

    	//Recipes For Diagonally Dotted Blue Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.DiagonallyDottedBlue, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        	     'S', new ItemStack(Blocks.DIRT, 1, 2), 'C', new ItemStack(ModBlocks.SolidBlue, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedBlue, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.DiagonallyDottedBlue, 1, i%15)});
        }

    	//Recipes For Diagonally Dotted Brown Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.DiagonallyDottedBrown, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
       		     'S', new ItemStack(Blocks.DIRT, 1, 2), 'C', new ItemStack(ModBlocks.SolidBrown, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedBrown, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.DiagonallyDottedBrown, 1, i%15)});
        }
    	
    	//Recipes For Diagonally Dotted Cyan Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.DiagonallyDottedCyan, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        	   	 'S', new ItemStack(Blocks.DIRT, 1, 2), 'C', new ItemStack(ModBlocks.SolidCyan, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 10; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedCyan, 1, (i+1)%10), new Object[] {new ItemStack(ModBlocks.DiagonallyDottedCyan, 1, i%10)});
        }

    	//Recipes For Diagonally Dotted Green Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.DiagonallyDottedGreen, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        		 'S', new ItemStack(Blocks.DIRT, 1, 2), 'C', new ItemStack(ModBlocks.SolidGreen, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedGreen, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.DiagonallyDottedGreen, 1, i%15)});
        }

    	//Recipes For Diagonally Dotted Yellow Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.DiagonallyDottedYellow, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        		 'S', new ItemStack(Blocks.DIRT, 1, 2), 'C', new ItemStack(ModBlocks.SolidYellow, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedYellow, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.DiagonallyDottedYellow, 1, i%15)});
        }

    	//Recipes For Diagonally Dotted Gray Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.DiagonallyDottedGray, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        		 'S', new ItemStack(Blocks.DIRT, 1, 2), 'C', new ItemStack(ModBlocks.SolidGray, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedGray, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.DiagonallyDottedGray, 1, i%15)});
        }
        
        
        
        
        
    	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
    	
    	
    	
    	
        //Recipes For Stripes Red Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.StripedRed, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        	   	 'S', new ItemStack(Blocks.QUARTZ_BLOCK, 1, 2), 'C', new ItemStack(ModBlocks.SolidRed, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedRed, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.StripedRed, 1, i%15)});
        }
        
        //Recipes For Stripes Purple Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.StripedPurple, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        	   	 'S', new ItemStack(Blocks.QUARTZ_BLOCK, 1, 2), 'C', new ItemStack(ModBlocks.SolidPurple, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedPurple, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.StripedPurple, 1, i%15)});
        }
        
        //Recipes For Stripes Blue Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.StripedBlue, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        	   	 'S', new ItemStack(Blocks.QUARTZ_BLOCK, 1, 2), 'C', new ItemStack(ModBlocks.SolidBlue, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedBlue, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.StripedBlue, 1, i%15)});
        }
        
        //Recipes For Stripes Brown Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.StripedBrown, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        	   	 'S', new ItemStack(Blocks.QUARTZ_BLOCK, 1, 2), 'C', new ItemStack(ModBlocks.SolidBrown, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedBrown, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.StripedBrown, 1, i%15)});
        }
        
        //Recipes For Stripes Cyan Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.StripedCyan, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        	   	 'S', new ItemStack(Blocks.QUARTZ_BLOCK, 1, 2), 'C', new ItemStack(ModBlocks.SolidCyan, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 10; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedCyan, 1, (i+1)%10), new Object[] {new ItemStack(ModBlocks.StripedCyan, 1, i%10)});
        }
        
        //Recipes For Stripes Green Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.StripedGreen, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        	   	 'S', new ItemStack(Blocks.QUARTZ_BLOCK, 1, 2), 'C', new ItemStack(ModBlocks.SolidGreen, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedGreen, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.StripedGreen, 1, i%15)});
        }
        
        //Recipes For Stripes Yellow Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.StripedYellow, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        	   	 'S', new ItemStack(Blocks.QUARTZ_BLOCK, 1, 2), 'C', new ItemStack(ModBlocks.SolidYellow, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedYellow, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.StripedYellow, 1, i%15)});
        }
        
        //Recipes For Stripes Gray Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.StripedGray, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        	   	 'S', new ItemStack(Blocks.QUARTZ_BLOCK, 1, 2), 'C', new ItemStack(ModBlocks.SolidGray, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedGray, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.StripedGray, 1, i%15)});
        }
        
        
        
        
        
    	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
    	
    	
    	
    	
        //Recipes For Floral Red Blocks
        GameRegistry.addRecipe(new ItemStack(ModBlocks.FloralRed, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        		 'S', new ItemStack(Blocks.RED_FLOWER, 1,OreDictionary.WILDCARD_VALUE), 'C', new ItemStack(ModBlocks.SolidRed, 1, OreDictionary.WILDCARD_VALUE)
        );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralRed, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.FloralRed, 1, i%15)});
        }
        
        //Recipes For Floral Purple Blocks
        GameRegistry.addRecipe(new ItemStack(ModBlocks.FloralPurple, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        		 'S', new ItemStack(Blocks.RED_FLOWER, 1,OreDictionary.WILDCARD_VALUE), 'C', new ItemStack(ModBlocks.SolidPurple, 1, OreDictionary.WILDCARD_VALUE)
        );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralPurple, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.FloralPurple, 1, i%15)});
        }
        
        //Recipes For Floral Blue Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.FloralBlue, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        		 'S', new ItemStack(Blocks.RED_FLOWER, 1,OreDictionary.WILDCARD_VALUE), 'C', new ItemStack(ModBlocks.SolidBlue, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralBlue, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.FloralBlue, 1, i%15)});
        }
        
        //Recipes For Floral Brown Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.FloralBrown, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        		 'S', new ItemStack(Blocks.RED_FLOWER, 1,OreDictionary.WILDCARD_VALUE), 'C', new ItemStack(ModBlocks.SolidBrown, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralBrown, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.FloralBrown, 1, i%15)});
        }
        
        //Recipes For Floral Cyan Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.FloralCyan, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        		 'S', new ItemStack(Blocks.RED_FLOWER, 1,OreDictionary.WILDCARD_VALUE), 'C', new ItemStack(ModBlocks.SolidCyan, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 10; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralCyan, 1, (i+1)%10), new Object[] {new ItemStack(ModBlocks.FloralCyan, 1, i%10)});
        }
        
        //Recipes For Floral Green Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.FloralGreen, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        		 'S', new ItemStack(Blocks.RED_FLOWER, 1,OreDictionary.WILDCARD_VALUE), 'C', new ItemStack(ModBlocks.SolidGreen, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralGreen, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.FloralGreen, 1, i%15)});
        }
        
        //Recipes For Floral Yellow Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.FloralYellow, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        		 'S', new ItemStack(Blocks.RED_FLOWER, 1,OreDictionary.WILDCARD_VALUE), 'C', new ItemStack(ModBlocks.SolidYellow, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralYellow, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.FloralYellow, 1, i%15)});
        }
        
        //Recipes For Floral Gray Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.FloralGray, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        		 'S', new ItemStack(Blocks.RED_FLOWER, 1,OreDictionary.WILDCARD_VALUE), 'C', new ItemStack(ModBlocks.SolidGray, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralGray, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.FloralGray, 1, i%15)});
        }
        
        
        
        
        
    	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
    	
    	
    	
    	
        //Recipes For Clay Red Blocks
        GameRegistry.addRecipe(new ItemStack(ModBlocks.ClayRed, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        		 'S', Blocks.CLAY, 'C', new ItemStack(ModBlocks.SolidRed, 1, OreDictionary.WILDCARD_VALUE)
        );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.ClayRed, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.ClayRed, 1, i%15)});
        }
        
        //Recipes For Clay Purple Blocks
        GameRegistry.addRecipe(new ItemStack(ModBlocks.ClayPurple),
        		" S ",
        		"SCS",
        		" S ",
        		 'S', Blocks.CLAY, 'C', new ItemStack(ModBlocks.SolidPurple, 1, OreDictionary.WILDCARD_VALUE)
        );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.ClayPurple, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.ClayPurple, 1, i%15)});
        }
        
        //Recipes For Clay Blue Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.ClayBlue, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        		 'S', Blocks.CLAY, 'C', new ItemStack(ModBlocks.SolidBlue, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.ClayBlue, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.ClayBlue, 1, i%15)});
        }
        
        //Recipes For Clay Brown Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.ClayBrown, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        	 	 'S', Blocks.CLAY, 'C', new ItemStack(ModBlocks.SolidBrown, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.ClayBrown, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.ClayBrown, 1, i%15)});
        }
        
        //Recipes For Clay Cyan Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.ClayCyan, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        		 'S', Blocks.CLAY, 'C', new ItemStack(ModBlocks.SolidCyan, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 10; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.ClayCyan, 1, (i+1)%10), new Object[] {new ItemStack(ModBlocks.ClayCyan, 1, i%10)});
        }
        
        //Recipes For Clay Green Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.ClayGreen, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        		 'S', Blocks.CLAY, 'C', new ItemStack(ModBlocks.SolidGreen, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.ClayGreen, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.ClayGreen, 1, i%15)});
        }
        
        //Recipes For Clay Yellow Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.ClayYellow, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        		 'S', Blocks.CLAY, 'C', new ItemStack(ModBlocks.SolidYellow, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.ClayYellow, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.ClayYellow, 1, i%15)});
        }
        
        //Recipes For Clay Gray Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.ClayGray, 4, 0), 
        		" S ",
        		"SCS",
        		" S ",
        		 'S', Blocks.CLAY, 'C', new ItemStack(ModBlocks.SolidGray, 1, OreDictionary.WILDCARD_VALUE)
            );
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.ClayGray, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.ClayGray, 1, i%15)});
        }
        
        
        
        
        
    	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
    	
    	
    	
    	
		//Recipes for Red Tinted Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.TintedGlassRed, 8, 0), 
        		"GGG",
        		"GCG",
        		"GGG",
        		 'C', new ItemStack(ModBlocks.SolidRed, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.GLASS
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassRed, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.TintedGlassRed, 1, i%15)});
        }
        
		//Recipes for Purple Tinted Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.TintedGlassPurple, 8, 0), 
        		"GGG",
        		"GCG",
        		"GGG",
        		 'C', new ItemStack(ModBlocks.SolidPurple, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.GLASS
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassPurple, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.TintedGlassPurple, 1, i%15)});
        }
        
		//Recipes for Blue Tinted Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.TintedGlassBlue, 8, 0), 
        		"GGG",
        		"GCG",
        		"GGG",
        		 'C', new ItemStack(ModBlocks.SolidBlue, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.GLASS
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassBlue, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.TintedGlassBlue, 1, i%15)});
        }
        
		//Recipes for Cyan Tinted Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.TintedGlassCyan, 8, 0), 
        		"GGG",
        		"GCG",
        		"GGG",
        		 'C', new ItemStack(ModBlocks.SolidCyan, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.GLASS
        	);
    	
        for (int i = 0; i < 10; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassCyan, 1, (i+1)%10), new Object[] {new ItemStack(ModBlocks.TintedGlassCyan, 1, i%10)});
        }
        
		//Recipes for Green Tinted Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.TintedGlassGreen, 8, 0), 
        		"GGG",
        		"GCG",
        		"GGG",
        		 'C', new ItemStack(ModBlocks.SolidGreen, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.GLASS
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassGreen, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.TintedGlassGreen, 1, i%15)});
        }
        
		//Recipes for Yellow Tinted Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.TintedGlassYellow, 8, 0), 
        		"GGG",
        		"GCG",
        		"GGG",
        		 'C', new ItemStack(ModBlocks.SolidYellow, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.GLASS
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassYellow, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.TintedGlassYellow, 1, i%15)});
        }
        
		//Recipes for Brown Tinted Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.TintedGlassBrown, 8, 0), 
        		"GGG",
        		"GCG",
        		"GGG",
        		 'C', new ItemStack(ModBlocks.SolidBrown, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.GLASS
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassBrown, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.TintedGlassBrown, 1, i%15)});
        }
        
		//Recipes for Gray Tinted Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.TintedGlassGray, 8, 0), 
        		"GGG",
        		"GCG",
        		"GGG",
        		 'C', new ItemStack(ModBlocks.SolidGray, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.GLASS
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassGray, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.TintedGlassGray, 1, i%15)});
        }
        
        
        
        
        
    	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
    	
    	
    	
    	
		//Recipes for Red Textured Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.TexturedGlassRed, 4, 0), 
        		" G ",
        		"GCG",
        		" G ",
        		 'C', new ItemStack(ModBlocks.SolidRed, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.GLASS
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassRed, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.TexturedGlassRed, 1, i%15)});
        }
        
		//Recipes for Purple Textured Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.TexturedGlassPurple, 4, 0), 
        		" G ",
        		"GCG",
        		" G ",
        		 'C', new ItemStack(ModBlocks.SolidPurple, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.GLASS
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassPurple, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.TexturedGlassPurple, 1, i%15)});
        }
        
		//Recipes for Blue Textured Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.TexturedGlassBlue, 4, 0), 
        		" G ",
        		"GCG",
        		" G ",
        		 'C', new ItemStack(ModBlocks.SolidBlue, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.GLASS
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassBlue, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.TexturedGlassBlue, 1, i%15)});
        }
        
		//Recipes for Cyan Textured Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.TexturedGlassCyan, 4, 0), 
        		" G ",
        		"GCG",
        		" G ",
        		 'C', new ItemStack(ModBlocks.SolidCyan, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.GLASS
        	);
    	
        for (int i = 0; i < 10; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassCyan, 1, (i+1)%10), new Object[] {new ItemStack(ModBlocks.TexturedGlassCyan, 1, i%10)});
        }
        
		//Recipes for Green Textured Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.TexturedGlassGreen, 4, 0), 
        		" G ",
        		"GCG",
        		" G ",
        		 'C', new ItemStack(ModBlocks.SolidGreen, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.GLASS
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassGreen, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.TexturedGlassGreen, 1, i%15)});
        }
        
		//Recipes for Yellow Textured Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.TexturedGlassYellow, 4, 0), 
        		" G ",
        		"GCG",
        		" G ",
        		 'C', new ItemStack(ModBlocks.SolidYellow, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.GLASS
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassYellow, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.TexturedGlassYellow, 1, i%15)});
        }
        
		//Recipes for Brown Textured Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.TexturedGlassBrown, 4, 0), 
        		" G ",
        		"GCG",
        		" G ",
        		 'C', new ItemStack(ModBlocks.SolidBrown, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.GLASS
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassBrown, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.TexturedGlassBrown, 1, i%15)});
        }
        
		//Recipes for Gray Textured Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.TexturedGlassGray, 4, 0), 
        		" G ",
        		"GCG",
        		" G ",
        		 'C', new ItemStack(ModBlocks.SolidGray, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.GLASS
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassGray, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.TexturedGlassGray, 1, i%15)});
        }
        
        
        
        
        
    	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
    	
    	
    	
    	
		//Recipes for Red Frosted Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.FrostedGlassRed, 4, 0), 
        		"G G",
        		" C ",
        		"G G",
        		 'C', new ItemStack(ModBlocks.SolidRed, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.GLASS
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FrostedGlassRed, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.FrostedGlassRed, 1, i%15)});
        }
        
		//Recipes for Purple Frosted Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.FrostedGlassPurple, 4, 0), 
        		"G G",
        		" C ",
        		"G G",
        		 'C', new ItemStack(ModBlocks.SolidPurple, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.GLASS
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FrostedGlassPurple, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.FrostedGlassPurple, 1, i%15)});
        }
        
		//Recipes for Blue Frosted Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.FrostedGlassBlue, 4, 0), 
        		"G G",
        		" C ",
        		"G G",
        		 'C', new ItemStack(ModBlocks.SolidBlue, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.GLASS
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FrostedGlassBlue, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.FrostedGlassBlue, 1, i%15)});
        }
        
		//Recipes for Cyan Frosted Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.FrostedGlassCyan, 4, 0), 
        		"G G",
        		" C ",
        		"G G",
        		 'C', new ItemStack(ModBlocks.SolidCyan, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.GLASS
        	);
    	
        for (int i = 0; i < 10; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FrostedGlassCyan, 1, (i+1)%10), new Object[] {new ItemStack(ModBlocks.FrostedGlassCyan, 1, i%10)});
        }
        
		//Recipes for Green Frosted Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.FrostedGlassGreen, 4, 0), 
        		"G G",
        		" C ",
        		"G G",
        		 'C', new ItemStack(ModBlocks.SolidGreen, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.GLASS
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FrostedGlassGreen, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.FrostedGlassGreen, 1, i%15)});
        }
        
		//Recipes for Yellow Frosted Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.FrostedGlassYellow, 4, 0), 
        		"G G",
        		" C ",
        		"G G",
        		 'C', new ItemStack(ModBlocks.SolidYellow, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.GLASS
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FrostedGlassYellow, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.FrostedGlassYellow, 1, i%15)});
        }
        
		//Recipes for Brown Frosted Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.FrostedGlassBrown, 4, 0), 
        		"G G",
        		" C ",
        		"G G",
        		 'C', new ItemStack(ModBlocks.SolidBrown, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.GLASS
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FrostedGlassBrown, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.FrostedGlassBrown, 1, i%15)});
        }
        
		//Recipes for Gray Frosted Glass Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.FrostedGlassGray, 4, 0), 
        		"G G",
        		" C ",
        		"G G",
        		 'C', new ItemStack(ModBlocks.SolidGray, 1, OreDictionary.WILDCARD_VALUE), 'G', Blocks.GLASS
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FrostedGlassGray, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.FrostedGlassGray, 1, i%15)});
        }
        
        
        
        
        
    	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
    	
    	
    	
    	
		//Recipes for Red Brick Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.BrickRed, 8, 0), 
        		"BBB",
        		"BCB",
        		"BBB",
        		 'C', new ItemStack(ModBlocks.SolidRed, 1, OreDictionary.WILDCARD_VALUE), 'B', Blocks.BRICK_BLOCK
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickRed, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.BrickRed, 1, i%15)});
        }
        
		//Recipes for Purple Brick Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.BrickPurple, 8, 0), 
        		"BBB",
        		"BCB",
        		"BBB",
        		 'C', new ItemStack(ModBlocks.SolidPurple, 1, OreDictionary.WILDCARD_VALUE), 'B', Blocks.BRICK_BLOCK
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickPurple, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.BrickPurple, 1, i%15)});
        }
        
		//Recipes for Blue Brick Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.BrickBlue, 8, 0), 
        		"BBB",
        		"BCB",
        		"BBB",
        		 'C', new ItemStack(ModBlocks.SolidBlue, 1, OreDictionary.WILDCARD_VALUE), 'B', Blocks.BRICK_BLOCK
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickBlue, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.BrickBlue, 1, i%15)});
        }
        
		//Recipes for Cyan Brick Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.BrickCyan, 8, 0), 
        		"BBB",
        		"BCB",
        		"BBB",
        		 'C', new ItemStack(ModBlocks.SolidCyan, 1, OreDictionary.WILDCARD_VALUE), 'B', Blocks.BRICK_BLOCK
        	);
    	
        for (int i = 0; i < 10; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickCyan, 1, (i+1)%10), new Object[] {new ItemStack(ModBlocks.BrickCyan, 1, i%10)});
        }
        
		//Recipes for Green Brick Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.BrickGreen, 8, 0), 
        		"BBB",
        		"BCB",
        		"BBB",
        		 'C', new ItemStack(ModBlocks.SolidGreen, 1, OreDictionary.WILDCARD_VALUE), 'B', Blocks.BRICK_BLOCK
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickGreen, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.BrickGreen, 1, i%15)});
        }
        
		//Recipes for Yellow Brick Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.BrickYellow, 8, 0), 
        		"BBB",
        		"BCB",
        		"BBB",
        		 'C', new ItemStack(ModBlocks.SolidYellow, 1, OreDictionary.WILDCARD_VALUE), 'B', Blocks.BRICK_BLOCK
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickYellow, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.BrickYellow, 1, i%15)});
        }
        
		//Recipes for Brown Brick Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.BrickBrown, 8, 0), 
        		"BBB",
        		"BCB",
        		"BBB",
        		 'C', new ItemStack(ModBlocks.SolidBrown, 1, OreDictionary.WILDCARD_VALUE), 'B', Blocks.BRICK_BLOCK
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickBrown, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.BrickBrown, 1, i%15)});
        }
        
		//Recipes for Gray Brick Blocks
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.BrickGray, 8, 0), 
        		"BBB",
        		"BCB",
        		"BBB",
        		 'C', new ItemStack(ModBlocks.SolidGray, 1, OreDictionary.WILDCARD_VALUE), 'B', Blocks.BRICK_BLOCK
        	);
    	
        for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickGray, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.BrickGray, 1, i%15)});
        }
        
    	
    	}
    }