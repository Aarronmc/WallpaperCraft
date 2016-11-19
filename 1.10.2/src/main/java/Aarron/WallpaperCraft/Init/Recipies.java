package Aarron.WallpaperCraft.Init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import Aarron.WallpaperCraft.Recipes.RecipeBlankPress;





public class Recipies {
	
	
	
	public static void init() {
		
       GameRegistry.addRecipe(new RecipeBlankPress());
		
       GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.PressBlank, 4),
    		   " P ", "PWP", " P ", 'P', Items.PAPER, 'W', "plankWood"));
       
       GameRegistry.addRecipe(new ItemStack(ModItems.PressDiagonallyDotted, 1),
    		   "PF", 'P', ModItems.PressBlank, 'F', new ItemStack(Items.STICK, 3));
       
       GameRegistry.addRecipe(new ItemStack(ModItems.PressStriped, 1),
    		   "PF", 'P', ModItems.PressBlank, 'F', new ItemStack(Blocks.QUARTZ_BLOCK, 1, 2));
      
       GameRegistry.addRecipe(new ItemStack(ModItems.PressFloral, 1),
    		   "PF", 'P', ModItems.PressBlank, 'F', new ItemStack(Blocks.RED_FLOWER, 1, OreDictionary.WILDCARD_VALUE));
       
       GameRegistry.addRecipe(new ItemStack(ModItems.PressClay, 1),
    		   "PF", 'P', ModItems.PressBlank, 'F', new ItemStack(Blocks.CLAY, 1));
       
       GameRegistry.addRecipe(new ItemStack(ModItems.PressTintedGlass, 1),
    		   "PGF", 'P', ModItems.PressBlank, 'G', Blocks.GLASS, 'F', new ItemStack(Items.DYE, 1, OreDictionary.WILDCARD_VALUE));
       
       GameRegistry.addRecipe(new ItemStack(ModItems.PressTexturedGlass, 1),
    		   "FP", 'P', ModItems.PressBlank, 'F', new ItemStack(Blocks.GLASS, 1));
       
       GameRegistry.addRecipe(new ItemStack(ModItems.PressFrostedGlass, 1),
       		   "PGF", 'P', ModItems.PressBlank, 'G', Blocks.GLASS, 'F', Blocks.SAND);
       
       GameRegistry.addRecipe(new ItemStack(ModItems.PressBrick, 1),
    		   "FP", 'P', ModItems.PressBlank, 'F', Blocks.BRICK_BLOCK);
       
       GameRegistry.addRecipe(new ItemStack(ModItems.PressDotted, 1),
   		       "FP", 'P', ModItems.PressBlank, 'F', Items.MELON_SEEDS);
       
       GameRegistry.addRecipe(new ItemStack(ModItems.PressCheckered, 1),
    		   "PF", 'P', ModItems.PressBlank, 'F', Blocks.TRAPDOOR);

		
		
	
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
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedRed, 1, 0), new Object[] {ModItems.PressDiagonallyDotted, new ItemStack(ModBlocks.SolidRed, 1, OreDictionary.WILDCARD_VALUE)}
    				);
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedRed, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.DiagonallyDottedRed, 1, i%15)});
        						}
      					
      				
       //Recipes For Diagonally Dotted Purple Blocks
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedPurple, 1, 0), new Object[] {ModItems.PressDiagonallyDotted, new ItemStack(ModBlocks.SolidPurple, 1, OreDictionary.WILDCARD_VALUE)}
        			);
        	        	for (int i = 0; i < 15; i++) {
    						GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedPurple, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.DiagonallyDottedPurple, 1, i%15)});
    							}

        	        	
       //Recipes For Diagonally Dotted Blue Blocks
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedBlue, 1, 0), new Object[] {ModItems.PressDiagonallyDotted, new ItemStack(ModBlocks.SolidBlue, 1, OreDictionary.WILDCARD_VALUE)}
        		 	);
         				for (int i = 0; i < 15; i++) {
         					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedBlue, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.DiagonallyDottedBlue, 1, i%15)});
         						}

       				
       //Recipes For Diagonally Dotted Cyan Blocks
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedCyan, 1, 0), new Object[] {ModItems.PressDiagonallyDotted, new ItemStack(ModBlocks.SolidCyan, 1, OreDictionary.WILDCARD_VALUE)}
           	        );
        				for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedCyan, 1, (i+1)%10), new Object[] {new ItemStack(ModBlocks.DiagonallyDottedCyan, 1, i%10)});
        							}

        				
      //Recipes For Diagonally Dotted Green Blocks
      GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedGreen, 1, 0), new Object[] {ModItems.PressDiagonallyDotted, new ItemStack(ModBlocks.SolidGreen, 1, OreDictionary.WILDCARD_VALUE)}
        			);
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedGreen, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.DiagonallyDottedGreen, 1, i%15)});
        						}

        				
       //Recipes For Diagonally Dotted Yellow Blocks
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedYellow, 1, 0), new Object[] {ModItems.PressDiagonallyDotted, new ItemStack(ModBlocks.SolidYellow, 1, OreDictionary.WILDCARD_VALUE)}
        	       	);
        	        	for (int i = 0; i < 15; i++) {
        	        		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedYellow, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.DiagonallyDottedYellow, 1, i%15)});
        	        			}
        	        	
        	        	
       //Recipes For Diagonally Dotted Brown Blocks
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedBrown, 1, 0), new Object[] {ModItems.PressDiagonallyDotted, new ItemStack(ModBlocks.SolidBrown, 1, OreDictionary.WILDCARD_VALUE)}
         	        );
        				for (int i = 0; i < 15; i++) {
       	         			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedBrown, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.DiagonallyDottedBrown, 1, i%15)});
         	         				}
    	
        				
       //Recipes For Diagonally Dotted Gray Blocks
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedGray, 1, 0), new Object[] {ModItems.PressDiagonallyDotted, new ItemStack(ModBlocks.SolidGray, 1, OreDictionary.WILDCARD_VALUE)}
           	       	);
        	        	for (int i = 0; i < 15; i++) {
        	        		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedGray, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.DiagonallyDottedGray, 1, i%15)});
        	        			}
        

       //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
 
       //Recipes For Striped Red Blocks
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedRed, 1, 0), new Object[] {ModItems.PressStriped, new ItemStack(ModBlocks.SolidRed, 1, OreDictionary.WILDCARD_VALUE)}
    				);
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedRed, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.StripedRed, 1, i%15)});
        						}
      					
      				
       //Recipes For Striped Purple Blocks
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedPurple, 1, 0), new Object[] {ModItems.PressStriped, new ItemStack(ModBlocks.SolidPurple, 1, OreDictionary.WILDCARD_VALUE)}
        			);
        	        	for (int i = 0; i < 15; i++) {
    						GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedPurple, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.StripedPurple, 1, i%15)});
    							}

        	        	
       //Recipes For Striped Blue Blocks
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedBlue, 1, 0), new Object[] {ModItems.PressStriped, new ItemStack(ModBlocks.SolidBlue, 1, OreDictionary.WILDCARD_VALUE)}
        		 	);
         				for (int i = 0; i < 15; i++) {
         					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedBlue, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.StripedBlue, 1, i%15)});
         						}

       				
       //Recipes For Striped Cyan Blocks
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedCyan, 1, 0), new Object[] {ModItems.PressStriped, new ItemStack(ModBlocks.SolidCyan, 1, OreDictionary.WILDCARD_VALUE)}
           	        );
        				for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedCyan, 1, (i+1)%10), new Object[] {new ItemStack(ModBlocks.StripedCyan, 1, i%10)});
        							}

        				
      //Recipes For Striped Green Blocks
      GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedGreen, 1, 0), new Object[] {ModItems.PressStriped, new ItemStack(ModBlocks.SolidGreen, 1, OreDictionary.WILDCARD_VALUE)}
        			);
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedGreen, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.StripedGreen, 1, i%15)});
        						}

        				
       //Recipes For Striped Yellow Blocks
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedYellow, 1, 0), new Object[] {ModItems.PressStriped, new ItemStack(ModBlocks.SolidYellow, 1, OreDictionary.WILDCARD_VALUE)}
        	       	);
        	        	for (int i = 0; i < 15; i++) {
        	        		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedYellow, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.StripedYellow, 1, i%15)});
        	        			}
        	        	
        	        	
       //Recipes For Striped Brown Blocks
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedBrown, 1, 0), new Object[] {ModItems.PressStriped, new ItemStack(ModBlocks.SolidBrown, 1, OreDictionary.WILDCARD_VALUE)}
         	        );
        				for (int i = 0; i < 15; i++) {
       	         			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedBrown, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.StripedBrown, 1, i%15)});
         	         				}
    	
        				
       //Recipes For Striped Gray Blocks
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedGray, 1, 0), new Object[] {ModItems.PressStriped, new ItemStack(ModBlocks.SolidGray, 1, OreDictionary.WILDCARD_VALUE)}
           	       	);
        	        	for (int i = 0; i < 15; i++) {
        	        		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedGray, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.StripedGray, 1, i%15)});
        	        			}

	        			
       //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
 
       //Recipes For Floral Red Blocks
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralRed, 1, 0), new Object[] {ModItems.PressFloral, new ItemStack(ModBlocks.SolidRed, 1, OreDictionary.WILDCARD_VALUE)}
    				);
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralRed, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.FloralRed, 1, i%15)});
        						}
      					
      				
       //Recipes For Floral Purple Blocks
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralPurple, 1, 0), new Object[] {ModItems.PressFloral, new ItemStack(ModBlocks.SolidPurple, 1, OreDictionary.WILDCARD_VALUE)}
        			);
        	        	for (int i = 0; i < 15; i++) {
    						GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralPurple, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.FloralPurple, 1, i%15)});
    							}

        	        	
       //Recipes For Floral Blue Blocks
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralBlue, 1, 0), new Object[] {ModItems.PressFloral, new ItemStack(ModBlocks.SolidBlue, 1, OreDictionary.WILDCARD_VALUE)}
        		 	);
         				for (int i = 0; i < 15; i++) {
         					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralBlue, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.FloralBlue, 1, i%15)});
         						}

       				
       //Recipes For Floral Cyan Blocks
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralCyan, 1, 0), new Object[] {ModItems.PressFloral, new ItemStack(ModBlocks.SolidCyan, 1, OreDictionary.WILDCARD_VALUE)}
           	        );
        				for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralCyan, 1, (i+1)%10), new Object[] {new ItemStack(ModBlocks.FloralCyan, 1, i%10)});
        							}

        				
      //Recipes For Floral Green Blocks
      GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralGreen, 1, 0), new Object[] {ModItems.PressFloral, new ItemStack(ModBlocks.SolidGreen, 1, OreDictionary.WILDCARD_VALUE)}
        			);
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralGreen, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.FloralGreen, 1, i%15)});
        						}

        				
       //Recipes For Floral Yellow Blocks
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralYellow, 1, 0), new Object[] {ModItems.PressFloral, new ItemStack(ModBlocks.SolidYellow, 1, OreDictionary.WILDCARD_VALUE)}
        	       	);
        	        	for (int i = 0; i < 15; i++) {
        	        		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralYellow, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.FloralYellow, 1, i%15)});
        	        			}
        	        	
        	        	
       //Recipes For Floral Brown Blocks
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralBrown, 1, 0), new Object[] {ModItems.PressFloral, new ItemStack(ModBlocks.SolidBrown, 1, OreDictionary.WILDCARD_VALUE)}
         	        );
        				for (int i = 0; i < 15; i++) {
       	         			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralBrown, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.FloralBrown, 1, i%15)});
         	         				}
    	
        				
       //Recipes For Floral Gray Blocks
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralGray, 1, 0), new Object[] {ModItems.PressFloral, new ItemStack(ModBlocks.SolidGray, 1, OreDictionary.WILDCARD_VALUE)}
           	       	);
        	        	for (int i = 0; i < 15; i++) {
        	        		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralGray, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.FloralGray, 1, i%15)});
        	        			}
        

       //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
 
       //Recipes For Red Clay Blocks
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.ClayRed, 1, 0), new Object[] {ModItems.PressClay, new ItemStack(ModBlocks.SolidRed, 1, OreDictionary.WILDCARD_VALUE)}
    				);
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.ClayRed, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.ClayRed, 1, i%15)});
        						}
      					
      				
       //Recipes For Purple Clay Blocks
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.ClayPurple, 1, 0), new Object[] {ModItems.PressClay, new ItemStack(ModBlocks.SolidPurple, 1, OreDictionary.WILDCARD_VALUE)}
        			);
        	        	for (int i = 0; i < 15; i++) {
    						GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.ClayPurple, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.ClayPurple, 1, i%15)});
    							}

        	        	
       //Recipes For Blue Clay Blocks
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.ClayBlue, 1, 0), new Object[] {ModItems.PressClay, new ItemStack(ModBlocks.SolidBlue, 1, OreDictionary.WILDCARD_VALUE)}
        		 	);
         				for (int i = 0; i < 15; i++) {
         					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.ClayBlue, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.ClayBlue, 1, i%15)});
         						}

       				
       //Recipes For Cyan Clay Blocks
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.ClayCyan, 1, 0), new Object[] {ModItems.PressClay, new ItemStack(ModBlocks.SolidCyan, 1, OreDictionary.WILDCARD_VALUE)}
           	        );
        				for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.ClayCyan, 1, (i+1)%10), new Object[] {new ItemStack(ModBlocks.ClayCyan, 1, i%10)});
        							}

        				
      //Recipes For Green Clay Blocks
      GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.ClayGreen, 1, 0), new Object[] {ModItems.PressClay, new ItemStack(ModBlocks.SolidGreen, 1, OreDictionary.WILDCARD_VALUE)}
        			);
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.ClayGreen, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.ClayGreen, 1, i%15)});
        						}

        				
       //Recipes For Yellow Clay Blocks
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.ClayYellow, 1, 0), new Object[] {ModItems.PressClay, new ItemStack(ModBlocks.SolidYellow, 1, OreDictionary.WILDCARD_VALUE)}
        	       	);
        	        	for (int i = 0; i < 15; i++) {
        	        		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.ClayYellow, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.ClayYellow, 1, i%15)});
        	        			}
        	        	
        	        	
       //Recipes For Brown Clay Blocks
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.ClayBrown, 1, 0), new Object[] {ModItems.PressClay, new ItemStack(ModBlocks.SolidBrown, 1, OreDictionary.WILDCARD_VALUE)}
         	        );
        				for (int i = 0; i < 15; i++) {
       	         			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.ClayBrown, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.ClayBrown, 1, i%15)});
         	         				}
    	
        				
       //Recipes For Gray Clay Blocks
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.ClayGray, 1, 0), new Object[] {ModItems.PressClay, new ItemStack(ModBlocks.SolidGray, 1, OreDictionary.WILDCARD_VALUE)}
           	       	);
        	        	for (int i = 0; i < 15; i++) {
        	        		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.ClayGray, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.ClayGray, 1, i%15)});
        	        			}
                
                
       //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
 
       //Recipes For Red Tinted Glass
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassRed, 1, 0), new Object[] {ModItems.PressTintedGlass, new ItemStack(Blocks.STAINED_GLASS, 1, 14)}
    				);
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassRed, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.TintedGlassRed, 1, i%15)});
        						}
      					
      				
       //Recipes For Purple Tinted Glass
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassPurple, 1, 0), new Object[] {ModItems.PressTintedGlass, new ItemStack(Blocks.STAINED_GLASS, 1, 10)}
        			);
        	        	for (int i = 0; i < 15; i++) {
    						GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassPurple, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.TintedGlassPurple, 1, i%15)});
    							}

        	        	
       //Recipes For Blue Tinted Glass
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassBlue, 1, 0), new Object[] {ModItems.PressTintedGlass, new ItemStack(Blocks.STAINED_GLASS, 1, 11)}
        		 	);
         				for (int i = 0; i < 15; i++) {
         					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassBlue, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.TintedGlassBlue, 1, i%15)});
         						}

       				
       //Recipes For Cyan Tinted Glass
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassCyan, 1, 0), new Object[] {ModItems.PressTintedGlass, new ItemStack(Blocks.STAINED_GLASS, 1, 9)}
           	        );
        				for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassCyan, 1, (i+1)%10), new Object[] {new ItemStack(ModBlocks.TintedGlassCyan, 1, i%10)});
        							}

        				
      //Recipes For Green Tinted Glass
      GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassGreen, 1, 0), new Object[] {ModItems.PressTintedGlass, new ItemStack(Blocks.STAINED_GLASS, 1, 13)}
        			);
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassGreen, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.TintedGlassGreen, 1, i%15)});
        						}

        				
       //Recipes For Yellow Tinted Glass
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassYellow, 1, 0), new Object[] {ModItems.PressTintedGlass, new ItemStack(Blocks.STAINED_GLASS, 1, 4)}
        	       	);
        	        	for (int i = 0; i < 15; i++) {
        	        		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassYellow, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.TintedGlassYellow, 1, i%15)});
        	        			}
        	        	
        	        	
       //Recipes For Brown Tinted Glass
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassBrown, 1, 0), new Object[] {ModItems.PressTintedGlass, new ItemStack(Blocks.STAINED_GLASS, 1, 12)}
         	        );
        				for (int i = 0; i < 15; i++) {
       	         			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassBrown, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.TintedGlassBrown, 1, i%15)});
         	         				}
    	
        				
       //Recipes For Gray Tinted Glass
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassGray, 1, 0), new Object[] {ModItems.PressTintedGlass, new ItemStack(Blocks.STAINED_GLASS, 1, 7)}
           	       	);
        	        	for (int i = 0; i < 15; i++) {
        	        		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassGray, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.TintedGlassGray, 1, i%15)});
        	        			}    
        
       //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
 
       //Recipes For Red Textured Glass
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassRed, 1, 0), new Object[] {ModItems.PressTexturedGlass, new ItemStack(Blocks.STAINED_GLASS, 1, 14)}
    				);
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassRed, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.TexturedGlassRed, 1, i%15)});
        						}
      					
      				
       //Recipes For Purple Textured Glass
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassPurple, 1, 0), new Object[] {ModItems.PressTexturedGlass, new ItemStack(Blocks.STAINED_GLASS, 1, 10)}
        			);
        	        	for (int i = 0; i < 15; i++) {
    						GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassPurple, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.TexturedGlassPurple, 1, i%15)});
    							}

        	        	
       //Recipes For Blue Textured Glass
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassBlue, 1, 0), new Object[] {ModItems.PressTexturedGlass, new ItemStack(Blocks.STAINED_GLASS, 1, 11)}
        		 	);
         				for (int i = 0; i < 15; i++) {
         					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassBlue, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.TexturedGlassBlue, 1, i%15)});
         						}

       				
       //Recipes For Cyan Textured Glass
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassCyan, 1, 0), new Object[] {ModItems.PressTexturedGlass, new ItemStack(Blocks.STAINED_GLASS, 1, 9)}
           	        );
        				for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassCyan, 1, (i+1)%10), new Object[] {new ItemStack(ModBlocks.TexturedGlassCyan, 1, i%10)});
        							}

        				
      //Recipes For Green Textured Glass
      GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassGreen, 1, 0), new Object[] {ModItems.PressTexturedGlass, new ItemStack(Blocks.STAINED_GLASS, 1, 13)}
        			);
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassGreen, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.TexturedGlassGreen, 1, i%15)});
        						}

        				
       //Recipes For Yellow Textured Glass
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassYellow, 1, 0), new Object[] {ModItems.PressTexturedGlass, new ItemStack(Blocks.STAINED_GLASS, 1, 4)}
        	       	);
        	        	for (int i = 0; i < 15; i++) {
        	        		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassYellow, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.TexturedGlassYellow, 1, i%15)});
        	        			}
        	        	
        	        	
       //Recipes For Brown Textured Glass
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassBrown, 1, 0), new Object[] {ModItems.PressTexturedGlass, new ItemStack(Blocks.STAINED_GLASS, 1, 12)}
         	        );
        				for (int i = 0; i < 15; i++) {
       	         			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassBrown, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.TexturedGlassBrown, 1, i%15)});
         	         				}
    	
        				
       //Recipes For Gray Textured Glass
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassGray, 1, 0), new Object[] {ModItems.PressTexturedGlass, new ItemStack(Blocks.STAINED_GLASS, 1, 7)}
           	       	);
        	        	for (int i = 0; i < 15; i++) {
        	        		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassGray, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.TexturedGlassGray, 1, i%15)});
        	        			}

    					
       //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
 
       //Recipes For Red Frosted Glass
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FrostedGlassRed, 1, 0), new Object[] {ModItems.PressFrostedGlass, new ItemStack(Blocks.STAINED_GLASS, 1, 14)}
    				);
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FrostedGlassRed, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.FrostedGlassRed, 1, i%15)});
        						}
      					
      				
       //Recipes For Purple Frosted Glass
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FrostedGlassPurple, 1, 0), new Object[] {ModItems.PressFrostedGlass, new ItemStack(Blocks.STAINED_GLASS, 1, 10)}
        			);
        	        	for (int i = 0; i < 15; i++) {
    						GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FrostedGlassPurple, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.FrostedGlassPurple, 1, i%15)});
    							}

        	        	
       //Recipes For Blue Frosted Glass
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FrostedGlassBlue, 1, 0), new Object[] {ModItems.PressFrostedGlass, new ItemStack(Blocks.STAINED_GLASS, 1, 11)}
        		 	);
         				for (int i = 0; i < 15; i++) {
         					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FrostedGlassBlue, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.FrostedGlassBlue, 1, i%15)});
         						}

       				
       //Recipes For Cyan Frosted Glass
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FrostedGlassCyan, 1, 0), new Object[] {ModItems.PressFrostedGlass, new ItemStack(Blocks.STAINED_GLASS, 1, 9)}
           	        );
        				for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FrostedGlassCyan, 1, (i+1)%10), new Object[] {new ItemStack(ModBlocks.FrostedGlassCyan, 1, i%10)});
        							}

        				
      //Recipes For Green Frosted Glass
      GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FrostedGlassGreen, 1, 0), new Object[] {ModItems.PressFrostedGlass, new ItemStack(Blocks.STAINED_GLASS, 1, 13)}
        			);
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FrostedGlassGreen, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.FrostedGlassGreen, 1, i%15)});
        						}

        				
       //Recipes For Yellow Frosted Glass
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FrostedGlassYellow, 1, 0), new Object[] {ModItems.PressFrostedGlass, new ItemStack(Blocks.STAINED_GLASS, 1, 4)}
        	       	);
        	        	for (int i = 0; i < 15; i++) {
        	        		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FrostedGlassYellow, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.FrostedGlassYellow, 1, i%15)});
        	        			}
        	        	
        	        	
       //Recipes For Brown Frosted Glass
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FrostedGlassBrown, 1, 0), new Object[] {ModItems.PressFrostedGlass, new ItemStack(Blocks.STAINED_GLASS, 1, 12)}
         	        );
        				for (int i = 0; i < 15; i++) {
       	         			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FrostedGlassBrown, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.FrostedGlassBrown, 1, i%15)});
         	         				}
    	
        				
       //Recipes For Gray Frosted Glass
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FrostedGlassGray, 1, 0), new Object[] {ModItems.PressFrostedGlass, new ItemStack(Blocks.STAINED_GLASS, 1, 7)}
           	       	);
        	        	for (int i = 0; i < 15; i++) {
        	        		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FrostedGlassGray, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.FrostedGlassGray, 1, i%15)});
        	        			}

    					
       //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
 
       //Recipes For Red Brick Blocks
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickRed, 1, 0), new Object[] {ModItems.PressBrick, new ItemStack(ModBlocks.SolidRed, 1, OreDictionary.WILDCARD_VALUE)}
    				);
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickRed, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.BrickRed, 1, i%15)});
        						}
      					
      				
       //Recipes For Purple Brick Blocks
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickPurple, 1, 0), new Object[] {ModItems.PressBrick, new ItemStack(ModBlocks.SolidPurple, 1, OreDictionary.WILDCARD_VALUE)}
        			);
        	        	for (int i = 0; i < 15; i++) {
    						GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickPurple, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.BrickPurple, 1, i%15)});
    							}

        	        	
       //Recipes For Blue Brick Blocks
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickBlue, 1, 0), new Object[] {ModItems.PressBrick, new ItemStack(ModBlocks.SolidBlue, 1, OreDictionary.WILDCARD_VALUE)}
        		 	);
         				for (int i = 0; i < 15; i++) {
         					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickBlue, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.BrickBlue, 1, i%15)});
         						}

       				
       //Recipes For Cyan Brick Blocks
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickCyan, 1, 0), new Object[] {ModItems.PressBrick, new ItemStack(ModBlocks.SolidCyan, 1, OreDictionary.WILDCARD_VALUE)}
           	        );
        				for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickCyan, 1, (i+1)%10), new Object[] {new ItemStack(ModBlocks.BrickCyan, 1, i%10)});
        							}

        				
      //Recipes For Green Brick Blocks
      GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickGreen, 1, 0), new Object[] {ModItems.PressBrick, new ItemStack(ModBlocks.SolidGreen, 1, OreDictionary.WILDCARD_VALUE)}
        			);
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickGreen, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.BrickGreen, 1, i%15)});
        						}

        				
       //Recipes For Yellow Brick Blocks
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickYellow, 1, 0), new Object[] {ModItems.PressBrick, new ItemStack(ModBlocks.SolidYellow, 1, OreDictionary.WILDCARD_VALUE)}
        	       	);
        	        	for (int i = 0; i < 15; i++) {
        	        		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickYellow, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.BrickYellow, 1, i%15)});
        	        			}
        	        	
        	        	
       //Recipes For Brown Brick Blocks
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickBrown, 1, 0), new Object[] {ModItems.PressBrick, new ItemStack(ModBlocks.SolidBrown, 1, OreDictionary.WILDCARD_VALUE)}
         	        );
        				for (int i = 0; i < 15; i++) {
       	         			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickBrown, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.BrickBrown, 1, i%15)});
         	         				}
    	
        				
       //Recipes For Gray Brick Blocks
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickGray, 1, 0), new Object[] {ModItems.PressBrick, new ItemStack(ModBlocks.SolidGray, 1, OreDictionary.WILDCARD_VALUE)}
           	       	);
        	        	for (int i = 0; i < 15; i++) {
        	        		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickGray, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.BrickGray, 1, i%15)});
        	        			}
        
        	        	
       //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
 
       //Recipes For Red Dotted Carpet
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedCarpetRed, 1, 0), new Object[] {ModItems.PressDotted, new ItemStack(Blocks.WOOL, 1, 14)}
    				);
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedCarpetRed, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.DottedCarpetRed, 1, i%15)});
        						}
      					
      				
       //Recipes For Purple Dotted Carpet
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedCarpetPurple, 1, 0), new Object[] {ModItems.PressDotted, new ItemStack(Blocks.WOOL, 1, 10)}
        			);
        	        	for (int i = 0; i < 15; i++) {
    						GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedCarpetPurple, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.DottedCarpetPurple, 1, i%15)});
    							}

        	        	
       //Recipes For Blue Dotted Carpet
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedCarpetBlue, 1, 0), new Object[] {ModItems.PressDotted, new ItemStack(Blocks.WOOL, 1, 11)}
        		 	);
         				for (int i = 0; i < 15; i++) {
         					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedCarpetBlue, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.DottedCarpetBlue, 1, i%15)});
         						}

       				
       //Recipes For Cyan Dotted Carpet
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedCarpetCyan, 1, 0), new Object[] {ModItems.PressDotted, new ItemStack(Blocks.WOOL, 1, 9)}
           	        );
        				for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedCarpetCyan, 1, (i+1)%10), new Object[] {new ItemStack(ModBlocks.DottedCarpetCyan, 1, i%10)});
        							}

        				
      //Recipes For Green Dotted Carpet
      GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedCarpetGreen, 1, 0), new Object[] {ModItems.PressDotted, new ItemStack(Blocks.WOOL, 1, 13)}
        			);
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedCarpetGreen, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.DottedCarpetGreen, 1, i%15)});
        						}

        				
       //Recipes For Yellow Dotted Carpet
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedCarpetYellow, 1, 0), new Object[] {ModItems.PressDotted, new ItemStack(Blocks.WOOL, 1, 4)}
        	       	);
        	        	for (int i = 0; i < 15; i++) {
        	        		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedCarpetYellow, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.DottedCarpetYellow, 1, i%15)});
        	        			}
        	        	
        	        	
       //Recipes For Brown Dotted Carpet
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedCarpetBrown, 1, 0), new Object[] {ModItems.PressDotted, new ItemStack(Blocks.WOOL, 1, 12)}
         	        );
        				for (int i = 0; i < 15; i++) {
       	         			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedCarpetBrown, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.DottedCarpetBrown, 1, i%15)});
         	         				}
    	
        				
       //Recipes For Gray Dotted Carpet
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedCarpetGray, 1, 0), new Object[] {ModItems.PressDotted, new ItemStack(Blocks.WOOL, 1, 7)}
           	       	);
        	        	for (int i = 0; i < 15; i++) {
        	        		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedCarpetGray, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.DottedCarpetGray, 1, i%15)});
        	        			}

        	        	
    	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	

		//Recipes for Red Dotted Rugs
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.DottedRugRed, 3, 0), "WW", 'W', new ItemStack(ModBlocks.DottedCarpetRed, 1,OreDictionary.WILDCARD_VALUE)
    				);
    					for (int i = 0; i < 15; i++) {
    						GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedRugRed, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.DottedRugRed, 1, i%15)});
    							}
    					
        
		//Recipes for Purple Dotted Rugs
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.DottedRugPurple, 3, 0), "WW", 'W', new ItemStack(ModBlocks.DottedCarpetPurple, 1,OreDictionary.WILDCARD_VALUE)
    				);
    					for (int i = 0; i < 15; i++) {
    						GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedRugPurple, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.DottedRugPurple, 1, i%15)});
    							}
    					
        
		//Recipes for Blue Dotted Rugs
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.DottedRugBlue, 3, 0), "WW", 'W', new ItemStack(ModBlocks.DottedCarpetBlue, 1,OreDictionary.WILDCARD_VALUE)
    				);
    					for (int i = 0; i < 15; i++) {
    						GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedRugBlue, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.DottedRugBlue, 1, i%15)});
    							}
    					
        
		//Recipes for Cyan Dotted Rugs
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.DottedRugCyan, 3, 0), "WW", 'W', new ItemStack(ModBlocks.DottedCarpetCyan, 1,OreDictionary.WILDCARD_VALUE)
    				);
    					for (int i = 0; i < 10; i++) {
    						GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedRugCyan, 1, (i+1)%10), new Object[] {new ItemStack(ModBlocks.DottedRugCyan, 1, i%10)});
    							}
    					
        
		//Recipes for Green Dotted Rugs
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.DottedRugGreen, 3, 0), "WW", 'W', new ItemStack(ModBlocks.DottedCarpetGreen, 1,OreDictionary.WILDCARD_VALUE)
    				);
    					for (int i = 0; i < 15; i++) {
    						GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedRugGreen, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.DottedRugGreen, 1, i%15)});
    							}
    					
        
		//Recipes for Yellow Dotted Rugs
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.DottedRugYellow, 3, 0), "WW", 'W', new ItemStack(ModBlocks.DottedCarpetYellow, 1,OreDictionary.WILDCARD_VALUE)
    				);
    					for (int i = 0; i < 15; i++) {
    						GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedRugYellow, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.DottedRugYellow, 1, i%15)});
    							}
    					
        
		//Recipes for Brown Dotted Rugs
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.DottedRugBrown, 3, 0), "WW", 'W', new ItemStack(ModBlocks.DottedCarpetBrown, 1,OreDictionary.WILDCARD_VALUE)
    				);
    					for (int i = 0; i < 15; i++) {
    						GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedRugBrown, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.DottedRugBrown, 1, i%15)});
    							}
    					
        
		//Recipes for Gray Dotted Rugs
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.DottedRugGray, 3, 0), "WW", 'W', new ItemStack(ModBlocks.DottedCarpetGray, 1,OreDictionary.WILDCARD_VALUE)
    				);
    					for (int i = 0; i < 15; i++) {
    						GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedRugGray, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.DottedRugGray, 1, i%15)});
    							}

    					
       //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
 
       //Recipes For Red Checkered Carpet
  	   GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredCarpetRed, 1, 0), new Object[] {ModItems.PressCheckered, new ItemStack(Blocks.WOOL, 1, 14)}
    				);
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredCarpetRed, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.CheckeredCarpetRed, 1, i%15)});
        						}
      					
      				
       //Recipes For Purple Checkered Carpet
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredCarpetPurple, 1, 0), new Object[] {ModItems.PressCheckered, new ItemStack(Blocks.WOOL, 1, 10)}
        			);
        	        	for (int i = 0; i < 15; i++) {
    						GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredCarpetPurple, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.CheckeredCarpetPurple, 1, i%15)});
    							}

        	        	
       //Recipes For Blue Checkered Carpet
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredCarpetBlue, 1, 0), new Object[] {ModItems.PressCheckered, new ItemStack(Blocks.WOOL, 1, 11)}
        		 	);
         				for (int i = 0; i < 15; i++) {
         					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredCarpetBlue, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.CheckeredCarpetBlue, 1, i%15)});
         						}

       				
       //Recipes For Cyan Checkered Carpet
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredCarpetCyan, 1, 0), new Object[] {ModItems.PressCheckered, new ItemStack(Blocks.WOOL, 1, 9)}
           	        );
        				for (int i = 0; i < 15; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredCarpetCyan, 1, (i+1)%10), new Object[] {new ItemStack(ModBlocks.CheckeredCarpetCyan, 1, i%10)});
        							}

        				
      //Recipes For Green Checkered Carpet
      GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredCarpetGreen, 1, 0), new Object[] {ModItems.PressCheckered, new ItemStack(Blocks.WOOL, 1, 13)}
        			);
        				for (int i = 0; i < 15; i++) {
        					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredCarpetGreen, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.CheckeredCarpetGreen, 1, i%15)});
        						}

        				
       //Recipes For Yellow Checkered Carpet
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredCarpetYellow, 1, 0), new Object[] {ModItems.PressCheckered, new ItemStack(Blocks.WOOL, 1, 4)}
        	       	);
        	        	for (int i = 0; i < 15; i++) {
        	        		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredCarpetYellow, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.CheckeredCarpetYellow, 1, i%15)});
        	        			}
        	        	
        	        	
       //Recipes For Brown Checkered Carpet
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredCarpetBrown, 1, 0), new Object[] {ModItems.PressCheckered, new ItemStack(Blocks.WOOL, 1, 12)}
         	        );
        				for (int i = 0; i < 15; i++) {
       	         			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredCarpetBrown, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.CheckeredCarpetBrown, 1, i%15)});
         	         				}
    	
        				
       //Recipes For Gray Checkered Carpet
       GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredCarpetGray, 1, 0), new Object[] {ModItems.PressCheckered, new ItemStack(Blocks.WOOL, 1, 7)}
           	       	);
        	        	for (int i = 0; i < 15; i++) {
        	        		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredCarpetGray, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.CheckeredCarpetGray, 1, i%15)});
        	        			}
    	
    	
    	   	    	
    	
    	
    	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	

		//Recipes for Red Checkered Rugs
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.CheckeredRugRed, 3, 0), "WW", 'W', new ItemStack(ModBlocks.CheckeredCarpetRed, 1,OreDictionary.WILDCARD_VALUE)
    				);
    					for (int i = 0; i < 15; i++) {
    						GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredRugRed, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.CheckeredRugRed, 1, i%15)});
    							}
    					
        
		//Recipes for Purple Checkered Rugs
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.CheckeredRugPurple, 3, 0), "WW", 'W', new ItemStack(ModBlocks.CheckeredCarpetPurple, 1,OreDictionary.WILDCARD_VALUE)
    				);
    					for (int i = 0; i < 15; i++) {
    						GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredRugPurple, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.CheckeredRugPurple, 1, i%15)});
    							}
    					
        
		//Recipes for Blue Checkered Rugs
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.CheckeredRugBlue, 3, 0), "WW", 'W', new ItemStack(ModBlocks.CheckeredCarpetBlue, 1,OreDictionary.WILDCARD_VALUE)
    				);
    					for (int i = 0; i < 15; i++) {
    						GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredRugBlue, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.CheckeredRugBlue, 1, i%15)});
    							}
    					
        
		//Recipes for Cyan Checkered Rugs
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.CheckeredRugCyan, 3, 0), "WW", 'W', new ItemStack(ModBlocks.CheckeredCarpetCyan, 1,OreDictionary.WILDCARD_VALUE)
    				);
    					for (int i = 0; i < 10; i++) {
    						GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredRugCyan, 1, (i+1)%10), new Object[] {new ItemStack(ModBlocks.CheckeredRugCyan, 1, i%10)});
    							}
    					
        
		//Recipes for Green Checkered Rugs
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.CheckeredRugGreen, 3, 0), "WW", 'W', new ItemStack(ModBlocks.CheckeredCarpetGreen, 1,OreDictionary.WILDCARD_VALUE)
    				);
    					for (int i = 0; i < 15; i++) {
    						GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredRugGreen, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.CheckeredRugGreen, 1, i%15)});
    							}
    					
        
		//Recipes for Yellow Checkered Rugs
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.CheckeredRugYellow, 3, 0), "WW", 'W', new ItemStack(ModBlocks.CheckeredCarpetYellow, 1,OreDictionary.WILDCARD_VALUE)
    				);
    					for (int i = 0; i < 15; i++) {
    						GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredRugYellow, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.CheckeredRugYellow, 1, i%15)});
    							}
    					
        
		//Recipes for Brown Checkered Rugs
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.CheckeredRugBrown, 3, 0), "WW", 'W', new ItemStack(ModBlocks.CheckeredCarpetBrown, 1,OreDictionary.WILDCARD_VALUE)
    				);
    					for (int i = 0; i < 15; i++) {
    						GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredRugBrown, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.CheckeredRugBrown, 1, i%15)});
    							}
    					
        
		//Recipes for Gray Checkered Rugs
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.CheckeredRugGray, 3, 0), "WW", 'W', new ItemStack(ModBlocks.CheckeredCarpetGray, 1,OreDictionary.WILDCARD_VALUE)
    				);
    					for (int i = 0; i < 15; i++) {
    						GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredRugGray, 1, (i+1)%15), new Object[] {new ItemStack(ModBlocks.CheckeredRugGray, 1, i%15)});
    							}


    	}
    }