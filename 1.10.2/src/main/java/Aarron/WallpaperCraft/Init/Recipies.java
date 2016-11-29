package Aarron.WallpaperCraft.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import Aarron.WallpaperCraft.init.ModBlocks;
import Aarron.WallpaperCraft.init.ModItems;


public class Recipies {
	
	
	public static void init() {
		
		
		////////////////////////////////////		PATTERN PRESS RECIPIES		////////////////////////////////////
		
			
	 //GameRegistry.addRecipe(new RecipeBlankPress());

       GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.PressBlank, 4),
    		   " P ", "PWP", " P ", 'P', Items.PAPER, 'W', "plankWood"));
       
       GameRegistry.addRecipe(new ItemStack(ModItems.PressDiagonallyDotted, 1),
    		   "FP", 'P', ModItems.PressBlank, 'F', new ItemStack(Items.STICK, 3));
       
       GameRegistry.addRecipe(new ItemStack(ModItems.PressStriped, 1),
    		   "FP", 'P', ModItems.PressBlank, 'F', new ItemStack(Blocks.QUARTZ_BLOCK, 1, 2));
      
       GameRegistry.addRecipe(new ItemStack(ModItems.PressFloral, 1),
    		   "FP", 'P', ModItems.PressBlank, 'F', new ItemStack(Blocks.RED_FLOWER, 1, OreDictionary.WILDCARD_VALUE));
       
       GameRegistry.addRecipe(new ItemStack(ModItems.PressClay, 1),
    		   "FP", 'P', ModItems.PressBlank, 'F', new ItemStack(Blocks.CLAY, 1));
       
       GameRegistry.addRecipe(new ItemStack(ModItems.PressTintedGlass, 1),
    		   "GPF", 'P', ModItems.PressBlank, 'G', Blocks.GLASS, 'F', new ItemStack(Items.DYE, 1, OreDictionary.WILDCARD_VALUE));
       
       GameRegistry.addRecipe(new ItemStack(ModItems.PressTexturedGlass, 1),
    		   "GP", 'P', ModItems.PressBlank, 'G', new ItemStack(Blocks.GLASS, 1));
       
       GameRegistry.addRecipe(new ItemStack(ModItems.PressFrostedGlass, 1),
       		   "GPF", 'P', ModItems.PressBlank, 'G', Blocks.GLASS, 'F', Blocks.SAND);
       
       GameRegistry.addRecipe(new ItemStack(ModItems.PressBrick, 1),
    		   "FP", 'P', ModItems.PressBlank, 'F', Blocks.BRICK_BLOCK);
       
       GameRegistry.addRecipe(new ItemStack(ModItems.PressStoneBrick, 1),
    		   "FP", 'P', ModItems.PressBlank, 'F', Blocks.STONEBRICK);
       
       GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.PressWoodPlank, 1),
    		   "FP", 'P', ModItems.PressBlank, 'F', "plankWood"));
       
       GameRegistry.addRecipe(new ItemStack(ModItems.PressDotted, 1),
   		       "FP", 'P', ModItems.PressBlank, 'F', Items.MELON_SEEDS);
       
       GameRegistry.addRecipe(new ItemStack(ModItems.PressCheckered, 1),
    		   "FP", 'P', ModItems.PressBlank, 'F', Blocks.TRAPDOOR);
       
       GameRegistry.addRecipe(new ItemStack(ModItems.PressWool, 1),
    		   "FP", 'P', ModItems.PressBlank, 'F', new ItemStack(Blocks.WOOL, 1, OreDictionary.WILDCARD_VALUE));
       
       GameRegistry.addRecipe(new ItemStack(ModItems.PressRippled, 1),
    		   "FP", 'P', ModItems.PressBlank, 'F', Items.STRING);
       
       GameRegistry.addRecipe(new ItemStack(ModItems.PressStamp, 1),
    		   "FP", 'P', ModItems.PressBlank, 'F', new ItemStack(Blocks.STONE_SLAB, 1, 0));
       
       
       
       
       ////////////////////////////////////		16 BLOCK VARIANT RECIPIES		////////////////////////////////////	
       
       //Recipes for Stamp Blocks
       for (int j = 0; j < 15; j++) {
       GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.Stamp, 1, j),
    		   "FP", 'P', ModItems.PressStamp, 'F', "solidWPBlocks"));}
       				for (int i = 0; i < 16; i++) {
       					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.Stamp, 1, (i+1)%16), new ItemStack(ModBlocks.Stamp, 1, i%16));}
       				       				

       
       

		
	   ////////////////////////////////////		115 BLOCK VARIANT RECIPIES		////////////////////////////////////

       //Recipes for Solid Red Block
       GameRegistry.addRecipe(new ItemStack(ModBlocks.SolidRed, 9, 0), 
        		"CCC", "CCC", "CCC", 'C', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 14)
    				);   	
    					for (int i = 0; i < 15; i++) {
    						GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidRed, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.SolidRed, 1, i%15)});
    							}
    					
    					
       //Recipes for Solid Purple Blocks
       GameRegistry.addRecipe(new ItemStack(ModBlocks.SolidPurple, 9, 0), 
    			"CCC", "CCC", "CCC", 'C', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 10)
    				);   	
    					for (int i = 0; i < 15; i++) {
    						GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidPurple, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.SolidPurple, 1, i%15)});
    			    			}


       //Recipes for Solid Blue Blocks
       GameRegistry.addRecipe(new ItemStack(ModBlocks.SolidBlue, 9, 0), 
        		"CCC", "CCC", "CCC", 'C', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 11)
    				);   	
    					for (int i = 0; i < 15; i++) {
    						GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidBlue, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.SolidBlue, 1, i%15)});
    							}
    					
    					
       //Recipes for Solid Cyan Blocks
       GameRegistry.addRecipe(new ItemStack(ModBlocks.SolidCyan, 9, 0), 
    			"CCC", "CCC", "CCC", 'C', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 9)
    			    );   	
    			    	for (int i = 0; i < 10; i++) {
    			    		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidCyan, 1, (i+1)%10), new Object[] {new ItemStack(ModBlocks.SolidCyan, 1, i%10)});
    			    			}
    					
    			    	
       //Recipes for Solid Brown Blocks
       GameRegistry.addRecipe(new ItemStack(ModBlocks.SolidBrown, 9, 0), 
    			"CCC", "CCC", "CCC", 'C', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 12)
    				);   	
    			    	for (int i = 0; i < 15; i++) {
    			    		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidBrown, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.SolidBrown, 1, i%15)});
    			    			}    	

    			    	
       //Recipes for Solid Green Blocks
       GameRegistry.addRecipe(new ItemStack(ModBlocks.SolidGreen, 9, 0), 
    			"CCC", "CCC", "CCC", 'C', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 13)
    				);
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidGreen, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.SolidGreen, 1, i%15)});
        						}

        				
      //Recipes for Solid Yellow Blocks
      GameRegistry.addRecipe(new ItemStack(ModBlocks.SolidYellow, 9, 0), 
    			"CCC", "CCC", "CCC", 'C', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 4)
					);
    					for (int i = 0; i < 15; i++) {
    						GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidYellow, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.SolidYellow, 1, i%15)});
    							}
    		
    					
       //Recipes for Solid Gray Blocks
       GameRegistry.addRecipe(new ItemStack(ModBlocks.SolidGray, 9, 0), 
    			"CCC", "CCC", "CCC", 'C', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 7)
					);
    					for (int i = 0; i < 15; i++) {
    						GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidGray, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.SolidGray, 1, i%15)});
    							}
		
    				
       //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
 
       //Recipes For Diagonally Dotted Red Blocks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedRed, 1, j), ModItems.PressDiagonallyDotted, new ItemStack(ModBlocks.SolidRed, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedRed, 1, (i+1)%15), new ItemStack(ModBlocks.DiagonallyDottedRed, 1, i%15));
        						}
      					
      				
       //Recipes For Diagonally Dotted Purple Blocks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedRed, 1, j), ModItems.PressDiagonallyDotted, new ItemStack(ModBlocks.SolidRed, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedRed, 1, (i+1)%15), new ItemStack(ModBlocks.DiagonallyDottedRed, 1, i%15));
        						}
      					
      				
       //Recipes For Diagonally Dotted Purple Blocks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedPurple, 1, j), ModItems.PressDiagonallyDotted, new ItemStack(ModBlocks.SolidPurple, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedPurple, 1, (i+1)%15), new ItemStack(ModBlocks.DiagonallyDottedPurple, 1, i%15));
        						}

        	        	
       //Recipes For Diagonally Dotted Blue Blocks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedBlue, 1, j), ModItems.PressDiagonallyDotted, new ItemStack(ModBlocks.SolidBlue, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedBlue, 1, (i+1)%15), new ItemStack(ModBlocks.DiagonallyDottedBlue, 1, i%15));
        						}

       				
       //Recipes For Diagonally Dotted Cyan Blocks
       for (int j = 0; j < 10; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedCyan, 1, j), ModItems.PressDiagonallyDotted, new ItemStack(ModBlocks.SolidCyan, 1, j)
    				);}
        				for (int i = 0; i < 10; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedCyan, 1, (i+1)%10), new ItemStack(ModBlocks.DiagonallyDottedCyan, 1, i%10));
        						}

        				
      //Recipes For Diagonally Dotted Green Blocks
      for (int j = 0; j < 15; j++) {	        	
  	  GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedGreen, 1, j), ModItems.PressDiagonallyDotted, new ItemStack(ModBlocks.SolidGreen, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedGreen, 1, (i+1)%15), new ItemStack(ModBlocks.DiagonallyDottedGreen, 1, i%15));
        						}

        				
       //Recipes For Diagonally Dotted Yellow Blocks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedYellow, 1, j), ModItems.PressDiagonallyDotted, new ItemStack(ModBlocks.SolidYellow, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedYellow, 1, (i+1)%15), new ItemStack(ModBlocks.DiagonallyDottedYellow, 1, i%15));
        						}
        	        	
        	        	
       //Recipes For Diagonally Dotted Brown Blocks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedBrown, 1, j), ModItems.PressDiagonallyDotted, new ItemStack(ModBlocks.SolidBrown, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedBrown, 1, (i+1)%15), new ItemStack(ModBlocks.DiagonallyDottedBrown, 1, i%15));
        						}
    	
        				
       //Recipes For Diagonally Dotted Gray Blocks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedGray, 1, j), ModItems.PressDiagonallyDotted, new ItemStack(ModBlocks.SolidGray, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedGray, 1, (i+1)%15), new ItemStack(ModBlocks.DiagonallyDottedGray, 1, i%15));
        						}
        				
    				
       //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
 
       //Recipes For Dotted Red Blocks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedRed, 1, j), ModItems.PressDotted, new ItemStack(ModBlocks.SolidRed, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedRed, 1, (i+1)%15), new ItemStack(ModBlocks.DottedRed, 1, i%15));
        						}
      					
      				
       //Recipes For Dotted Purple Blocks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedRed, 1, j), ModItems.PressDotted, new ItemStack(ModBlocks.SolidRed, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedRed, 1, (i+1)%15), new ItemStack(ModBlocks.DottedRed, 1, i%15));
        						}
      					
      				
       //Recipes For Dotted Purple Blocks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedPurple, 1, j), ModItems.PressDotted, new ItemStack(ModBlocks.SolidPurple, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedPurple, 1, (i+1)%15), new ItemStack(ModBlocks.DottedPurple, 1, i%15));
        						}

        	        	
       //Recipes For Dotted Blue Blocks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedBlue, 1, j), ModItems.PressDotted, new ItemStack(ModBlocks.SolidBlue, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedBlue, 1, (i+1)%15), new ItemStack(ModBlocks.DottedBlue, 1, i%15));
        						}

       				
       //Recipes For Dotted Cyan Blocks
       for (int j = 0; j < 10; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedCyan, 1, j), ModItems.PressDotted, new ItemStack(ModBlocks.SolidCyan, 1, j)
    				);}
        				for (int i = 0; i < 10; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedCyan, 1, (i+1)%10), new ItemStack(ModBlocks.DottedCyan, 1, i%10));
        						}

        				
      //Recipes For Dotted Green Blocks
      for (int j = 0; j < 15; j++) {	        	
  	  GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedGreen, 1, j), ModItems.PressDotted, new ItemStack(ModBlocks.SolidGreen, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedGreen, 1, (i+1)%15), new ItemStack(ModBlocks.DottedGreen, 1, i%15));
        						}

        				
       //Recipes For Dotted Yellow Blocks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedYellow, 1, j), ModItems.PressDotted, new ItemStack(ModBlocks.SolidYellow, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedYellow, 1, (i+1)%15), new ItemStack(ModBlocks.DottedYellow, 1, i%15));
        						}
        	        	
        	        	
       //Recipes For Dotted Brown Blocks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedBrown, 1, j), ModItems.PressDotted, new ItemStack(ModBlocks.SolidBrown, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedBrown, 1, (i+1)%15), new ItemStack(ModBlocks.DottedBrown, 1, i%15));
        						}
    	
        				
       //Recipes For Dotted Gray Blocks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedGray, 1, j), ModItems.PressDotted, new ItemStack(ModBlocks.SolidGray, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedGray, 1, (i+1)%15), new ItemStack(ModBlocks.DottedGray, 1, i%15));
        						}
        

       //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
 
       //Recipes For Red Striped Blocks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedRed, 1, j), ModItems.PressStriped, new ItemStack(ModBlocks.SolidRed, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedRed, 1, (i+1)%15), new ItemStack(ModBlocks.StripedRed, 1, i%15));
        						}
      					
      				
       //Recipes For Purple Striped Blocks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedPurple, 1, j), ModItems.PressStriped, new ItemStack(ModBlocks.SolidPurple, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedPurple, 1, (i+1)%15), new ItemStack(ModBlocks.StripedPurple, 1, i%15));
        						}

        	        	
       //Recipes For Blue Striped Blocks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedBlue, 1, j), ModItems.PressStriped, new ItemStack(ModBlocks.SolidBlue, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedBlue, 1, (i+1)%15), new ItemStack(ModBlocks.StripedBlue, 1, i%15));
        						}

       				
       //Recipes For Cyan Striped Blocks
       for (int j = 0; j < 10; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedCyan, 1, j), ModItems.PressStriped, new ItemStack(ModBlocks.SolidCyan, 1, j)
    				);}
        				for (int i = 0; i < 10; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedCyan, 1, (i+1)%10), new ItemStack(ModBlocks.StripedCyan, 1, i%10));
        						}

        				
      //Recipes For Green Striped Blocks
      for (int j = 0; j < 15; j++) {	        	
  	  GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedGreen, 1, j), ModItems.PressStriped, new ItemStack(ModBlocks.SolidGreen, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedGreen, 1, (i+1)%15), new ItemStack(ModBlocks.StripedGreen, 1, i%15));
        						}

        				
       //Recipes For Yellow Striped Blocks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedYellow, 1, j), ModItems.PressStriped, new ItemStack(ModBlocks.SolidYellow, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedYellow, 1, (i+1)%15), new ItemStack(ModBlocks.StripedYellow, 1, i%15));
        						}
        	        	
        	        	
       //Recipes For Brown Striped Blocks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedBrown, 1, j), ModItems.PressStriped, new ItemStack(ModBlocks.SolidBrown, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedBrown, 1, (i+1)%15), new ItemStack(ModBlocks.StripedBrown, 1, i%15));
        						}
    	
        				
       //Recipes For Gray Striped Blocks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedGray, 1, j), ModItems.PressStriped, new ItemStack(ModBlocks.SolidGray, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedGray, 1, (i+1)%15), new ItemStack(ModBlocks.StripedGray, 1, i%15));
        						}

	        			
       //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
 
       //Recipes For Red Floral Blocks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralRed, 1, j), ModItems.PressFloral, new ItemStack(ModBlocks.SolidRed, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralRed, 1, (i+1)%15), new ItemStack(ModBlocks.FloralRed, 1, i%15));
        						}
      					
      				
       //Recipes For Purple Floral Blocks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralPurple, 1, j), ModItems.PressFloral, new ItemStack(ModBlocks.SolidPurple, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralPurple, 1, (i+1)%15), new ItemStack(ModBlocks.FloralPurple, 1, i%15));
        						}

        	        	
       //Recipes For Blue Floral Blocks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralBlue, 1, j), ModItems.PressFloral, new ItemStack(ModBlocks.SolidBlue, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralBlue, 1, (i+1)%15), new ItemStack(ModBlocks.FloralBlue, 1, i%15));
        						}

       				
       //Recipes For Cyan Floral Blocks
       for (int j = 0; j < 10; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralCyan, 1, j), ModItems.PressFloral, new ItemStack(ModBlocks.SolidCyan, 1, j)
    				);}
        				for (int i = 0; i < 10; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralCyan, 1, (i+1)%10), new ItemStack(ModBlocks.FloralCyan, 1, i%10));
        						}

        				
      //Recipes For Green Floral Blocks
      for (int j = 0; j < 15; j++) {	        	
  	  GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralGreen, 1, j), ModItems.PressFloral, new ItemStack(ModBlocks.SolidGreen, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralGreen, 1, (i+1)%15), new ItemStack(ModBlocks.FloralGreen, 1, i%15));
        						}

        				
       //Recipes For Yellow Floral Blocks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralYellow, 1, j), ModItems.PressFloral, new ItemStack(ModBlocks.SolidYellow, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralYellow, 1, (i+1)%15), new ItemStack(ModBlocks.FloralYellow, 1, i%15));
        						}
        	        	
        	        	
       //Recipes For Brown Floral Blocks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralBrown, 1, j), ModItems.PressFloral, new ItemStack(ModBlocks.SolidBrown, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralBrown, 1, (i+1)%15), new ItemStack(ModBlocks.FloralBrown, 1, i%15));
        						}
    	
        				
       //Recipes For Gray Floral Blocks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralGray, 1, j), ModItems.PressFloral, new ItemStack(ModBlocks.SolidGray, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralGray, 1, (i+1)%15), new ItemStack(ModBlocks.FloralGray, 1, i%15));
        						}
        

       //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
 
       //Recipes For Red Clay Blocks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.ClayRed, 1, j), ModItems.PressClay, new ItemStack(ModBlocks.SolidRed, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.ClayRed, 1, (i+1)%15), new ItemStack(ModBlocks.ClayRed, 1, i%15));
        						}
      					
      				
       //Recipes For Purple Clay Blocks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.ClayPurple, 1, j), ModItems.PressClay, new ItemStack(ModBlocks.SolidPurple, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.ClayPurple, 1, (i+1)%15), new ItemStack(ModBlocks.ClayPurple, 1, i%15));
        						}

        	        	
       //Recipes For Blue Clay Blocks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.ClayBlue, 1, j), ModItems.PressClay, new ItemStack(ModBlocks.SolidBlue, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.ClayBlue, 1, (i+1)%15), new ItemStack(ModBlocks.ClayBlue, 1, i%15));
        						}

       				
       //Recipes For Cyan Clay Blocks
       for (int j = 0; j < 10; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.ClayCyan, 1, j), ModItems.PressClay, new ItemStack(ModBlocks.SolidCyan, 1, j)
    				);}
        				for (int i = 0; i < 10; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.ClayCyan, 1, (i+1)%10), new ItemStack(ModBlocks.ClayCyan, 1, i%10));
        						}

        				
      //Recipes For Green Clay Blocks
      for (int j = 0; j < 15; j++) {	        	
  	  GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.ClayGreen, 1, j), ModItems.PressClay, new ItemStack(ModBlocks.SolidGreen, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.ClayGreen, 1, (i+1)%15), new ItemStack(ModBlocks.ClayGreen, 1, i%15));
        						}

        				
       //Recipes For Yellow Clay Blocks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.ClayYellow, 1, j), ModItems.PressClay, new ItemStack(ModBlocks.SolidYellow, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.ClayYellow, 1, (i+1)%15), new ItemStack(ModBlocks.ClayYellow, 1, i%15));
        						}
        	        	
        	        	
       //Recipes For Brown Clay Blocks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.ClayBrown, 1, j), ModItems.PressClay, new ItemStack(ModBlocks.SolidBrown, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.ClayBrown, 1, (i+1)%15), new ItemStack(ModBlocks.ClayBrown, 1, i%15));
        						}
    	
        				
       //Recipes For Gray Clay Blocks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.ClayGray, 1, j), ModItems.PressClay, new ItemStack(ModBlocks.SolidGray, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.ClayGray, 1, (i+1)%15), new ItemStack(ModBlocks.ClayGray, 1, i%15));
        						}
        				        				
	        			
       //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
 
       //Recipes For Rippled Red Blocks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.RippledRed, 1, j), ModItems.PressRippled, new ItemStack(ModBlocks.SolidRed, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.RippledRed, 1, (i+1)%15), new ItemStack(ModBlocks.RippledRed, 1, i%15));
        						}
      					
      				
       //Recipes For Rippled Purple Blocks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.RippledPurple, 1, j), ModItems.PressRippled, new ItemStack(ModBlocks.SolidPurple, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.RippledPurple, 1, (i+1)%15), new ItemStack(ModBlocks.RippledPurple, 1, i%15));
        						}

        	        	
       //Recipes For Rippled Blue Blocks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.RippledBlue, 1, j), ModItems.PressRippled, new ItemStack(ModBlocks.SolidBlue, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.RippledBlue, 1, (i+1)%15), new ItemStack(ModBlocks.RippledBlue, 1, i%15));
        						}

       				
       //Recipes For Rippled Cyan Blocks
       for (int j = 0; j < 10; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.RippledCyan, 1, j), ModItems.PressRippled, new ItemStack(ModBlocks.SolidCyan, 1, j)
    				);}
        				for (int i = 0; i < 10; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.RippledCyan, 1, (i+1)%10), new ItemStack(ModBlocks.RippledCyan, 1, i%10));
        						}

        				
      //Recipes For Rippled Green Blocks
      for (int j = 0; j < 15; j++) {	        	
  	  GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.RippledGreen, 1, j), ModItems.PressRippled, new ItemStack(ModBlocks.SolidGreen, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.RippledGreen, 1, (i+1)%15), new ItemStack(ModBlocks.RippledGreen, 1, i%15));
        						}

        				
       //Recipes For Rippled Yellow Blocks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.RippledYellow, 1, j), ModItems.PressRippled, new ItemStack(ModBlocks.SolidYellow, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.RippledYellow, 1, (i+1)%15), new ItemStack(ModBlocks.RippledYellow, 1, i%15));
        						}
        	        	
        	        	
       //Recipes For Rippled Brown Blocks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.RippledBrown, 1, j), ModItems.PressRippled, new ItemStack(ModBlocks.SolidBrown, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.RippledBrown, 1, (i+1)%15), new ItemStack(ModBlocks.RippledBrown, 1, i%15));
        						}
    	
        				
       //Recipes For Rippled Gray Blocks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.RippledGray, 1, j), ModItems.PressRippled, new ItemStack(ModBlocks.SolidGray, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.RippledGray, 1, (i+1)%15), new ItemStack(ModBlocks.RippledGray, 1, i%15));
        						}
        				        				
	        			
       //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
 
       //Recipes For Red Wooden Planks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoodPlankRed, 1, j), ModItems.PressWoodPlank, new ItemStack(ModBlocks.SolidRed, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoodPlankRed, 1, (i+1)%15), new ItemStack(ModBlocks.WoodPlankRed, 1, i%15));
        						}
      					
      				
       //Recipes For Purple Wooden Planks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoodPlankPurple, 1, j), ModItems.PressWoodPlank, new ItemStack(ModBlocks.SolidPurple, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoodPlankPurple, 1, (i+1)%15), new ItemStack(ModBlocks.WoodPlankPurple, 1, i%15));
        						}

        	        	
       //Recipes For Blue Wooden Planks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoodPlankBlue, 1, j), ModItems.PressWoodPlank, new ItemStack(ModBlocks.SolidBlue, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoodPlankBlue, 1, (i+1)%15), new ItemStack(ModBlocks.WoodPlankBlue, 1, i%15));
        						}

       				
       //Recipes For Cyan Wooden Planks
       for (int j = 0; j < 10; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoodPlankCyan, 1, j), ModItems.PressWoodPlank, new ItemStack(ModBlocks.SolidCyan, 1, j)
    				);}
        				for (int i = 0; i < 10; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoodPlankCyan, 1, (i+1)%10), new ItemStack(ModBlocks.WoodPlankCyan, 1, i%10));
        						}

        				
      //Recipes For Green Wooden Planks
      for (int j = 0; j < 15; j++) {	        	
  	  GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoodPlankGreen, 1, j), ModItems.PressWoodPlank, new ItemStack(ModBlocks.SolidGreen, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoodPlankGreen, 1, (i+1)%15), new ItemStack(ModBlocks.WoodPlankGreen, 1, i%15));
        						}

        				
       //Recipes For Yellow Wooden Planks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoodPlankYellow, 1, j), ModItems.PressWoodPlank, new ItemStack(ModBlocks.SolidYellow, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoodPlankYellow, 1, (i+1)%15), new ItemStack(ModBlocks.WoodPlankYellow, 1, i%15));
        						}
        	        	
        	        	
       //Recipes For Brown Wooden Planks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoodPlankBrown, 1, j), ModItems.PressWoodPlank, new ItemStack(ModBlocks.SolidBrown, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoodPlankBrown, 1, (i+1)%15), new ItemStack(ModBlocks.WoodPlankBrown, 1, i%15));
        						}
    	
        				
       //Recipes For Gray Wooden Planks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoodPlankGray, 1, j), ModItems.PressWoodPlank, new ItemStack(ModBlocks.SolidGray, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoodPlankGray, 1, (i+1)%15), new ItemStack(ModBlocks.WoodPlankGray, 1, i%15));
        						}
                
                
       //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
 
       //Recipes For Red Tinted Glass
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassRed, 1, 0), ModItems.PressTintedGlass, new ItemStack(Blocks.STAINED_GLASS, 1, 14)
    				);
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassRed, 1, (i+1)%15), new ItemStack(ModBlocks.TintedGlassRed, 1, i%15));
        						}
      					
      				
       //Recipes For Purple Tinted Glass
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassPurple, 1, 0), ModItems.PressTintedGlass, new ItemStack(Blocks.STAINED_GLASS, 1, 10)
        			);
        	        	for (int i = 0; i < 15; i++) {
    						GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassPurple, 1, (i+1)%15), new ItemStack(ModBlocks.TintedGlassPurple, 1, i%15));
    							}

        	        	
       //Recipes For Blue Tinted Glass
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassBlue, 1, 0), ModItems.PressTintedGlass, new ItemStack(Blocks.STAINED_GLASS, 1, 11)
        		 	);
         				for (int i = 0; i < 15; i++) {
         					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassBlue, 1, (i+1)%15), new ItemStack(ModBlocks.TintedGlassBlue, 1, i%15));
         						}

       				
       //Recipes For Cyan Tinted Glass
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassCyan, 1, 0), ModItems.PressTintedGlass, new ItemStack(Blocks.STAINED_GLASS, 1, 9)
           	        );
        				for (int i = 0; i < 10; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassCyan, 1, (i+1)%10), new ItemStack(ModBlocks.TintedGlassCyan, 1, i%10));
        							}

        				
      //Recipes For Green Tinted Glass
      GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassGreen, 1, 0), ModItems.PressTintedGlass, new ItemStack(Blocks.STAINED_GLASS, 1, 13)
        			);
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassGreen, 1, (i+1)%15), new ItemStack(ModBlocks.TintedGlassGreen, 1, i%15));
        						}

        				
       //Recipes For Yellow Tinted Glass
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassYellow, 1, 0), ModItems.PressTintedGlass, new ItemStack(Blocks.STAINED_GLASS, 1, 4)
        	       	);
        	        	for (int i = 0; i < 15; i++) {
        	        		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassYellow, 1, (i+1)%15), new ItemStack(ModBlocks.TintedGlassYellow, 1, i%15));
        	        			}
        	        	
        	        	
       //Recipes For Brown Tinted Glass
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassBrown, 1, 0), ModItems.PressTintedGlass, new ItemStack(Blocks.STAINED_GLASS, 1, 12)
         	        );
        				for (int i = 0; i < 15; i++) {
       	         			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassBrown, 1, (i+1)%15), new ItemStack(ModBlocks.TintedGlassBrown, 1, i%15));
         	         				}
    	
        				
       //Recipes For Gray Tinted Glass
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassGray, 1, 0), ModItems.PressTintedGlass, new ItemStack(Blocks.STAINED_GLASS, 1, 7)
           	       	);
        	        	for (int i = 0; i < 15; i++) {
        	        		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassGray, 1, (i+1)%15), new ItemStack(ModBlocks.TintedGlassGray, 1, i%15));
        	        			}    
        
       //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
 
       //Recipes For Red Textured Glass
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassRed, 1, 0), ModItems.PressTexturedGlass, new ItemStack(Blocks.STAINED_GLASS, 1, 14)
    				);
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassRed, 1, (i+1)%15), new ItemStack(ModBlocks.TexturedGlassRed, 1, i%15));
        						}
      					
      				
       //Recipes For Purple Textured Glass
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassPurple, 1, 0), ModItems.PressTexturedGlass, new ItemStack(Blocks.STAINED_GLASS, 1, 10)
        			);
        	        	for (int i = 0; i < 15; i++) {
    						GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassPurple, 1, (i+1)%15), new ItemStack(ModBlocks.TexturedGlassPurple, 1, i%15));
    							}

        	        	
       //Recipes For Blue Textured Glass
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassBlue, 1, 0), ModItems.PressTexturedGlass, new ItemStack(Blocks.STAINED_GLASS, 1, 11)
        		 	);
         				for (int i = 0; i < 15; i++) {
         					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassBlue, 1, (i+1)%15), new ItemStack(ModBlocks.TexturedGlassBlue, 1, i%15));
         						}

       				
       //Recipes For Cyan Textured Glass
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassCyan, 1, 0), ModItems.PressTexturedGlass, new ItemStack(Blocks.STAINED_GLASS, 1, 9)
           	        );
        				for (int i = 0; i < 10; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassCyan, 1, (i+1)%10), new ItemStack(ModBlocks.TexturedGlassCyan, 1, i%10));
        							}

        				
      //Recipes For Green Textured Glass
      GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassGreen, 1, 0), ModItems.PressTexturedGlass, new ItemStack(Blocks.STAINED_GLASS, 1, 13)
        			);
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassGreen, 1, (i+1)%15), new ItemStack(ModBlocks.TexturedGlassGreen, 1, i%15));
        						}

        				
       //Recipes For Yellow Textured Glass
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassYellow, 1, 0), ModItems.PressTexturedGlass, new ItemStack(Blocks.STAINED_GLASS, 1, 4)
        	       	);
        	        	for (int i = 0; i < 15; i++) {
        	        		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassYellow, 1, (i+1)%15), new ItemStack(ModBlocks.TexturedGlassYellow, 1, i%15));
        	        			}
        	        	
        	        	
       //Recipes For Brown Textured Glass
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassBrown, 1, 0), ModItems.PressTexturedGlass, new ItemStack(Blocks.STAINED_GLASS, 1, 12)
         	        );
        				for (int i = 0; i < 15; i++) {
       	         			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassBrown, 1, (i+1)%15), new ItemStack(ModBlocks.TexturedGlassBrown, 1, i%15));
         	         				}
    	
        				
       //Recipes For Gray Textured Glass
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassGray, 1, 0), ModItems.PressTexturedGlass, new ItemStack(Blocks.STAINED_GLASS, 1, 7)
           	       	);
        	        	for (int i = 0; i < 15; i++) {
        	        		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassGray, 1, (i+1)%15), new ItemStack(ModBlocks.TexturedGlassGray, 1, i%15));
        	        			}

    					
       //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
 
       //Recipes For Red Frosted Glass
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FrostedGlassRed, 1, 0), ModItems.PressFrostedGlass, new ItemStack(Blocks.STAINED_GLASS, 1, 14)
    				);
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FrostedGlassRed, 1, (i+1)%15), new ItemStack(ModBlocks.FrostedGlassRed, 1, i%15));
        						}
      					
      				
       //Recipes For Purple Frosted Glass
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FrostedGlassPurple, 1, 0), ModItems.PressFrostedGlass, new ItemStack(Blocks.STAINED_GLASS, 1, 10)
        			);
        	        	for (int i = 0; i < 15; i++) {
    						GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FrostedGlassPurple, 1, (i+1)%15), new ItemStack(ModBlocks.FrostedGlassPurple, 1, i%15));
    							}

        	        	
       //Recipes For Blue Frosted Glass
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FrostedGlassBlue, 1, 0), ModItems.PressFrostedGlass, new ItemStack(Blocks.STAINED_GLASS, 1, 11)
        		 	);
         				for (int i = 0; i < 15; i++) {
         					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FrostedGlassBlue, 1, (i+1)%15), new ItemStack(ModBlocks.FrostedGlassBlue, 1, i%15));
         						}

       				
       //Recipes For Cyan Frosted Glass
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FrostedGlassCyan, 1, 0), ModItems.PressFrostedGlass, new ItemStack(Blocks.STAINED_GLASS, 1, 9)
           	        );
        				for (int i = 0; i < 10; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FrostedGlassCyan, 1, (i+1)%10), new ItemStack(ModBlocks.FrostedGlassCyan, 1, i%10));
        							}

        				
      //Recipes For Green Frosted Glass
      GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FrostedGlassGreen, 1, 0), ModItems.PressFrostedGlass, new ItemStack(Blocks.STAINED_GLASS, 1, 13)
        			);
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FrostedGlassGreen, 1, (i+1)%15), new ItemStack(ModBlocks.FrostedGlassGreen, 1, i%15));
        						}

        				
       //Recipes For Yellow Frosted Glass
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FrostedGlassYellow, 1, 0), ModItems.PressFrostedGlass, new ItemStack(Blocks.STAINED_GLASS, 1, 4)
        	       	);
        	        	for (int i = 0; i < 15; i++) {
        	        		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FrostedGlassYellow, 1, (i+1)%15), new ItemStack(ModBlocks.FrostedGlassYellow, 1, i%15));
        	        			}
        	        	
        	        	
       //Recipes For Brown Frosted Glass
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FrostedGlassBrown, 1, 0), ModItems.PressFrostedGlass, new ItemStack(Blocks.STAINED_GLASS, 1, 12)
         	        );
        				for (int i = 0; i < 15; i++) {
       	         			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FrostedGlassBrown, 1, (i+1)%15), new ItemStack(ModBlocks.FrostedGlassBrown, 1, i%15));
         	         				}
    	
        				
       //Recipes For Gray Frosted Glass
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FrostedGlassGray, 1, 0), ModItems.PressFrostedGlass, new ItemStack(Blocks.STAINED_GLASS, 1, 7)
           	       	);
        	        	for (int i = 0; i < 15; i++) {
        	        		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FrostedGlassGray, 1, (i+1)%15), new ItemStack(ModBlocks.FrostedGlassGray, 1, i%15));
        	        			}

    					
       //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
 
       //Recipes For Red Brick Blocks
  	   for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickRed, 1, j), ModItems.PressBrick, new ItemStack(ModBlocks.SolidRed, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickRed, 1, (i+1)%15), new ItemStack(ModBlocks.BrickRed, 1, i%15));
        						}
      					
      				
       //Recipes For Purple Brick Blocks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickPurple, 1, j), ModItems.PressBrick, new ItemStack(ModBlocks.SolidPurple, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickPurple, 1, (i+1)%15), new ItemStack(ModBlocks.BrickPurple, 1, i%15));
        						}

        	        	
       //Recipes For Blue Brick Blocks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickBlue, 1, j), ModItems.PressBrick, new ItemStack(ModBlocks.SolidBlue, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickBlue, 1, (i+1)%15), new ItemStack(ModBlocks.BrickBlue, 1, i%15));
        						}

       				
       //Recipes For Cyan Brick Blocks
       for (int j = 0; j < 10; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickCyan, 1, j), ModItems.PressBrick, new ItemStack(ModBlocks.SolidCyan, 1, j)
    				);}
        				for (int i = 0; i < 10; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickCyan, 1, (i+1)%10), new ItemStack(ModBlocks.BrickCyan, 1, i%10));
        						}

        				
      //Recipes For Green Brick Blocks
      for (int j = 0; j < 15; j++) {	        	
  	  GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickGreen, 1, j), ModItems.PressBrick, new ItemStack(ModBlocks.SolidGreen, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickGreen, 1, (i+1)%15), new ItemStack(ModBlocks.BrickGreen, 1, i%15));
        						}

        				
       //Recipes For Yellow Brick Blocks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickYellow, 1, j), ModItems.PressBrick, new ItemStack(ModBlocks.SolidYellow, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickYellow, 1, (i+1)%15), new ItemStack(ModBlocks.BrickYellow, 1, i%15));
        						}
        	        	
        	        	
       //Recipes For Brown Brick Blocks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickBrown, 1, j), ModItems.PressBrick, new ItemStack(ModBlocks.SolidBrown, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickBrown, 1, (i+1)%15), new ItemStack(ModBlocks.BrickBrown, 1, i%15));
        						}
    	
        				
       //Recipes For Gray Brick Blocks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickGray, 1, j), ModItems.PressBrick, new ItemStack(ModBlocks.SolidGray, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickGray, 1, (i+1)%15), new ItemStack(ModBlocks.BrickGray, 1, i%15));
        						}
        	        	
    					
       //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
 
       //Recipes For Red Stone Brick Blocks
  	   for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StoneBrickRed, 1, j), ModItems.PressStoneBrick, new ItemStack(ModBlocks.SolidRed, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StoneBrickRed, 1, (i+1)%15), new ItemStack(ModBlocks.StoneBrickRed, 1, i%15));
        						}
      					
      				
       //Recipes For Purple Stone Brick Blocks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StoneBrickPurple, 1, j), ModItems.PressStoneBrick, new ItemStack(ModBlocks.SolidPurple, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StoneBrickPurple, 1, (i+1)%15), new ItemStack(ModBlocks.StoneBrickPurple, 1, i%15));
        						}

        	        	
       //Recipes For Blue Stone Brick Blocks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StoneBrickBlue, 1, j), ModItems.PressStoneBrick, new ItemStack(ModBlocks.SolidBlue, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StoneBrickBlue, 1, (i+1)%15), new ItemStack(ModBlocks.StoneBrickBlue, 1, i%15));
        						}

       				
       //Recipes For Cyan Stone Brick Blocks
       for (int j = 0; j < 10; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StoneBrickCyan, 1, j), ModItems.PressStoneBrick, new ItemStack(ModBlocks.SolidCyan, 1, j)
    				);}
        				for (int i = 0; i < 10; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StoneBrickCyan, 1, (i+1)%10), new ItemStack(ModBlocks.StoneBrickCyan, 1, i%10));
        						}

        				
      //Recipes For Green Stone Brick Blocks
      for (int j = 0; j < 15; j++) {	        	
  	  GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StoneBrickGreen, 1, j), ModItems.PressStoneBrick, new ItemStack(ModBlocks.SolidGreen, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StoneBrickGreen, 1, (i+1)%15), new ItemStack(ModBlocks.StoneBrickGreen, 1, i%15));
        						}

        				
       //Recipes For Yellow Stone Brick Blocks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StoneBrickYellow, 1, j), ModItems.PressStoneBrick, new ItemStack(ModBlocks.SolidYellow, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StoneBrickYellow, 1, (i+1)%15), new ItemStack(ModBlocks.StoneBrickYellow, 1, i%15));
        						}
        	        	
        	        	
       //Recipes For Brown Stone Brick Blocks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StoneBrickBrown, 1, j), ModItems.PressStoneBrick, new ItemStack(ModBlocks.SolidBrown, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StoneBrickBrown, 1, (i+1)%15), new ItemStack(ModBlocks.StoneBrickBrown, 1, i%15));
        						}
    	
        				
       //Recipes For Gray Stone Brick Blocks
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StoneBrickGray, 1, j), ModItems.PressStoneBrick, new ItemStack(ModBlocks.SolidGray, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StoneBrickGray, 1, (i+1)%15), new ItemStack(ModBlocks.StoneBrickGray, 1, i%15));
        						}
        	        	        

       //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
 
       //Recipes For Red Wool
  	   for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoolRed, 1, j), ModItems.PressWool, new ItemStack(ModBlocks.SolidRed, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoolRed, 1, (i+1)%15), new ItemStack(ModBlocks.WoolRed, 1, i%15));
        						}
      					
      				
       //Recipes For Purple Wool
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoolPurple, 1, j), ModItems.PressWool, new ItemStack(ModBlocks.SolidPurple, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoolPurple, 1, (i+1)%15), new ItemStack(ModBlocks.WoolPurple, 1, i%15));
        						}

        	        	
       //Recipes For Blue Wool
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoolBlue, 1, j), ModItems.PressWool, new ItemStack(ModBlocks.SolidBlue, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoolBlue, 1, (i+1)%15), new ItemStack(ModBlocks.WoolBlue, 1, i%15));
        						}

       				
       //Recipes For Cyan Wool
       for (int j = 0; j < 10; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoolCyan, 1, j), ModItems.PressWool, new ItemStack(ModBlocks.SolidCyan, 1, j)
    				);}
        				for (int i = 0; i < 10; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoolCyan, 1, (i+1)%10), new ItemStack(ModBlocks.WoolCyan, 1, i%10));
        						}

        				
      //Recipes For Green Wool
      for (int j = 0; j < 15; j++) {	        	
  	  GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoolGreen, 1, j), ModItems.PressWool, new ItemStack(ModBlocks.SolidGreen, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoolGreen, 1, (i+1)%15), new ItemStack(ModBlocks.WoolGreen, 1, i%15));
        						}

        				
       //Recipes For Yellow Wool
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoolYellow, 1, j), ModItems.PressWool, new ItemStack(ModBlocks.SolidYellow, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoolYellow, 1, (i+1)%15), new ItemStack(ModBlocks.WoolYellow, 1, i%15));
        						}
        	        	
        	        	
       //Recipes For Brown Wool
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoolBrown, 1, j), ModItems.PressWool, new ItemStack(ModBlocks.SolidBrown, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoolBrown, 1, (i+1)%15), new ItemStack(ModBlocks.WoolBrown, 1, i%15));
        						}
    	
        				
       //Recipes For Gray Wool
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoolGray, 1, j), ModItems.PressWool, new ItemStack(ModBlocks.SolidGray, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoolGray, 1, (i+1)%15), new ItemStack(ModBlocks.WoolGray, 1, i%15));
        						}
        				        				

    	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	

		//Recipes for Red Wool Carpets
        for (int j = 0; j < 15; j++) {	 
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.WoolCarpetRed, 3, j), "WW", 'W', new ItemStack(ModBlocks.WoolRed, 1, j)
    				);}
    					for (int i = 0; i < 15; i++) {
    						GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoolCarpetRed, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.WoolCarpetRed, 1, i%15)});
    							}
    					
        
		//Recipes for Purple Wool Carpets
    	for (int j = 0; j < 15; j++) {	 
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.WoolCarpetPurple, 3, j), "WW", 'W', new ItemStack(ModBlocks.WoolPurple, 1, j)
    				);}
    					for (int i = 0; i < 15; i++) {
    						GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoolCarpetPurple, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.WoolCarpetPurple, 1, i%15)});
    							}
    					
        
		//Recipes for Blue Wool Carpets
    	for (int j = 0; j < 15; j++) {	 
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.WoolCarpetBlue, 3, j), "WW", 'W', new ItemStack(ModBlocks.WoolBlue, 1, j)
    				);}
    					for (int i = 0; i < 15; i++) {
    						GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoolCarpetBlue, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.WoolCarpetBlue, 1, i%15)});
    							}
    					
        
		//Recipes for Cyan Wool Carpets
    	for (int j = 0; j < 10; j++) {
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.WoolCarpetCyan, 3, j), "WW", 'W', new ItemStack(ModBlocks.WoolCyan, 1, j)
    				);}
    					for (int i = 0; i < 10; i++) {
    						GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoolCarpetCyan, 1, (i+1)%10), new Object[] {new ItemStack(ModBlocks.WoolCarpetCyan, 1, i%10)});
    							}
    					
        
		//Recipes for Green Wool Carpets
    	for (int j = 0; j < 15; j++) {
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.WoolCarpetGreen, 3, j), "WW", 'W', new ItemStack(ModBlocks.WoolGreen, 1, j)
    				);}
    					for (int i = 0; i < 15; i++) {
    						GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoolCarpetGreen, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.WoolCarpetGreen, 1, i%15)});
    							}
    					
        
		//Recipes for Yellow Wool Carpets
    	for (int j = 0; j < 15; j++) {
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.WoolCarpetYellow, 3, j), "WW", 'W', new ItemStack(ModBlocks.WoolYellow, 1, j)
    				);}
    					for (int i = 0; i < 15; i++) {
    						GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoolCarpetYellow, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.WoolCarpetYellow, 1, i%15)});
    							}
    					
        
		//Recipes for Brown Wool Carpets
    	for (int j = 0; j < 15; j++) {
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.WoolCarpetBrown, 3, j), "WW", 'W', new ItemStack(ModBlocks.WoolBrown, 1, j)
    				);}
    					for (int i = 0; i < 15; i++) {
    						GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoolCarpetBrown, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.WoolCarpetBrown, 1, i%15)});
    							}
    					
        
		//Recipes for Gray Wool Carpets
    	for (int j = 0; j < 15; j++) {
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.WoolCarpetGray, 3, j), "WW", 'W', new ItemStack(ModBlocks.WoolGray, 1, j)
    				);}
    					for (int i = 0; i < 15; i++) {
    						GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoolCarpetGray, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.WoolCarpetGray, 1, i%15)});
    							}


       //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
 
       //Recipes For Red Checkered Wool
  	   for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredWoolRed, 1, j), ModItems.PressCheckered, new ItemStack(ModBlocks.SolidRed, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredWoolRed, 1, (i+1)%15), new ItemStack(ModBlocks.CheckeredWoolRed, 1, i%15));
        						}
      					
      				
       //Recipes For Purple Checkered Wool
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredWoolPurple, 1, j), ModItems.PressCheckered, new ItemStack(ModBlocks.SolidPurple, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredWoolPurple, 1, (i+1)%15), new ItemStack(ModBlocks.CheckeredWoolPurple, 1, i%15));
        						}

        	        	
       //Recipes For Blue Checkered Wool
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredWoolBlue, 1, j), ModItems.PressCheckered, new ItemStack(ModBlocks.SolidBlue, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredWoolBlue, 1, (i+1)%15), new ItemStack(ModBlocks.CheckeredWoolBlue, 1, i%15));
        						}

       				
       //Recipes For Cyan Checkered Wool
       for (int j = 0; j < 10; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredWoolCyan, 1, j), ModItems.PressCheckered, new ItemStack(ModBlocks.SolidCyan, 1, j)
    				);}
        				for (int i = 0; i < 10; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredWoolCyan, 1, (i+1)%10), new ItemStack(ModBlocks.CheckeredWoolCyan, 1, i%10));
        						}

        				
      //Recipes For Green Checkered Wool
      for (int j = 0; j < 15; j++) {	        	
  	  GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredWoolGreen, 1, j), ModItems.PressCheckered, new ItemStack(ModBlocks.SolidGreen, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredWoolGreen, 1, (i+1)%15), new ItemStack(ModBlocks.CheckeredWoolGreen, 1, i%15));
        						}

        				
       //Recipes For Yellow Checkered Wool
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredWoolYellow, 1, j), ModItems.PressCheckered, new ItemStack(ModBlocks.SolidYellow, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredWoolYellow, 1, (i+1)%15), new ItemStack(ModBlocks.CheckeredWoolYellow, 1, i%15));
        						}
        	        	
        	        	
       //Recipes For Brown Checkered Wool
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredWoolBrown, 1, j), ModItems.PressCheckered, new ItemStack(ModBlocks.SolidBrown, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredWoolBrown, 1, (i+1)%15), new ItemStack(ModBlocks.CheckeredWoolBrown, 1, i%15));
        						}
    	
        				
       //Recipes For Gray Checkered Wool
       for (int j = 0; j < 15; j++) {	        	
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredWoolGray, 1, j), ModItems.PressCheckered, new ItemStack(ModBlocks.SolidGray, 1, j)
    				);}
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredWoolGray, 1, (i+1)%15), new ItemStack(ModBlocks.CheckeredWoolGray, 1, i%15));
        						}
    	
    	
    	   	    	
    	
    	
    	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	

		//Recipes for Red Checkered Carpets
        for (int j = 0; j < 15; j++) {	 
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.CheckeredCarpetRed, 3, j), "WW", 'W', new ItemStack(ModBlocks.CheckeredWoolRed, 1, j)
    				);}
    					for (int i = 0; i < 15; i++) {
    						GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredCarpetRed, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.CheckeredCarpetRed, 1, i%15)});
    							}
    					
        
		//Recipes for Purple Checkered Carpets
    	for (int j = 0; j < 15; j++) {	 
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.CheckeredCarpetPurple, 3, j), "WW", 'W', new ItemStack(ModBlocks.CheckeredWoolPurple, 1, j)
    				);}
    					for (int i = 0; i < 15; i++) {
    						GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredCarpetPurple, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.CheckeredCarpetPurple, 1, i%15)});
    							}
    					
        
		//Recipes for Blue Checkered Carpets
    	for (int j = 0; j < 15; j++) {	 
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.CheckeredCarpetBlue, 3, j), "WW", 'W', new ItemStack(ModBlocks.CheckeredWoolBlue, 1, j)
    				);}
    					for (int i = 0; i < 15; i++) {
    						GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredCarpetBlue, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.CheckeredCarpetBlue, 1, i%15)});
    							}
    					
        
		//Recipes for Cyan Checkered Carpets
    	for (int j = 0; j < 10; j++) {
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.CheckeredCarpetCyan, 3, j), "WW", 'W', new ItemStack(ModBlocks.CheckeredWoolCyan, 1, j)
    				);}
    					for (int i = 0; i < 10; i++) {
    						GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredCarpetCyan, 1, (i+1)%10), new Object[] {new ItemStack(ModBlocks.CheckeredCarpetCyan, 1, i%10)});
    							}
    					
        
		//Recipes for Green Checkered Carpets
    	for (int j = 0; j < 15; j++) {
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.CheckeredCarpetGreen, 3, j), "WW", 'W', new ItemStack(ModBlocks.CheckeredWoolGreen, 1, j)
    				);}
    					for (int i = 0; i < 15; i++) {
    						GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredCarpetGreen, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.CheckeredCarpetGreen, 1, i%15)});
    							}
    					
        
		//Recipes for Yellow Checkered Carpets
    	for (int j = 0; j < 15; j++) {
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.CheckeredCarpetYellow, 3, j), "WW", 'W', new ItemStack(ModBlocks.CheckeredWoolYellow, 1, j)
    				);}
    					for (int i = 0; i < 15; i++) {
    						GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredCarpetYellow, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.CheckeredCarpetYellow, 1, i%15)});
    							}
    					
        
		//Recipes for Brown Checkered Carpets
    	for (int j = 0; j < 15; j++) {
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.CheckeredCarpetBrown, 3, j), "WW", 'W', new ItemStack(ModBlocks.CheckeredWoolBrown, 1, j)
    				);}
    					for (int i = 0; i < 15; i++) {
    						GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredCarpetBrown, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.CheckeredCarpetBrown, 1, i%15)});
    							}
    					
        
		//Recipes for Gray Checkered Carpets
    	for (int j = 0; j < 15; j++) {
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.CheckeredCarpetGray, 3, j), "WW", 'W', new ItemStack(ModBlocks.CheckeredWoolGray, 1, j)
    				);}
    					for (int i = 0; i < 15; i++) {
    						GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredCarpetGray, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.CheckeredCarpetGray, 1, i%15)});
    							}


    	}
    }