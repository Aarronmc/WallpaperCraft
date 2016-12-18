package com.Aarron.WallpaperCraft.crafting;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import com.Aarron.WallpaperCraft.init.ModBlocks;
import com.Aarron.WallpaperCraft.init.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class Recipies {
	
	
	public static void init() {
		
		
		////////////////////////////////////		PATTERN PRESS RECIPIES		////////////////////////////////////
		

       GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.PressBlank, 4),
    		   " P ", "PWP", " P ", 'P', Items.paper, 'W', "plankWood"));
       
       GameRegistry.addRecipe(new ItemStack(ModItems.PressDiagonallyDotted, 1),
    		   "FP", 'P', ModItems.PressBlank, 'F', new ItemStack(Items.stick, 3));
       
       GameRegistry.addRecipe(new ItemStack(ModItems.PressStriped, 1),
    		   "FP", 'P', ModItems.PressBlank, 'F', new ItemStack(Blocks.quartz_block, 1, 2));
      
       GameRegistry.addRecipe(new ItemStack(ModItems.PressFloral, 1),
    		   "FP", 'P', ModItems.PressBlank, 'F', new ItemStack(Blocks.red_flower, 1, OreDictionary.WILDCARD_VALUE));
       
       GameRegistry.addRecipe(new ItemStack(ModItems.PressDamask, 1),
    		   "FP", 'P', ModItems.PressBlank, 'F', new ItemStack(Blocks.double_plant, 1, 4));
       
       GameRegistry.addRecipe(new ItemStack(ModItems.PressClay, 1),
    		   "FP", 'P', ModItems.PressBlank, 'F', new ItemStack(Blocks.hardened_clay, 1));
              
       GameRegistry.addRecipe(new ItemStack(ModItems.PressTintedGlass, 1),
    		   "GPF", 'P', ModItems.PressBlank, 'G', Blocks.glass, 'F', new ItemStack(Items.dye, 1, OreDictionary.WILDCARD_VALUE));
       
       GameRegistry.addRecipe(new ItemStack(ModItems.PressTexturedGlass, 1),
    		   "GP", 'P', ModItems.PressBlank, 'G', new ItemStack(Blocks.glass, 1));
       
       GameRegistry.addRecipe(new ItemStack(ModItems.PressFrostedGlass, 1),
       		   "GPF", 'P', ModItems.PressBlank, 'G', Blocks.glass, 'F', Blocks.sand);
       
       GameRegistry.addRecipe(new ItemStack(ModItems.PressBrick, 1),
    		   "FP", 'P', ModItems.PressBlank, 'F', Blocks.brick_block);
       
       GameRegistry.addRecipe(new ItemStack(ModItems.PressStoneBrick, 1),
    		   "FP", 'P', ModItems.PressBlank, 'F', Blocks.stonebrick);
       
       GameRegistry.addRecipe(new ItemStack(ModItems.PressStoneLamp, 1),
    		   "FPS", 'P', ModItems.PressBlank, 'F', Blocks.glowstone, 'S', Blocks.stone);
       
       GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.PressWoodPlank, 1),
    		   "FP", 'P', ModItems.PressBlank, 'F', "plankWood"));
       
       GameRegistry.addRecipe(new ItemStack(ModItems.PressDotted, 1),
   		       "FP", 'P', ModItems.PressBlank, 'F', Items.melon_seeds);
       
       GameRegistry.addRecipe(new ItemStack(ModItems.PressCheckered, 1),
    		   "FP", 'P', ModItems.PressBlank, 'F', Blocks.trapdoor);
              
       GameRegistry.addRecipe(new ItemStack(ModItems.PressWool, 1),
    		   "FP", 'P', ModItems.PressBlank, 'F', new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE));
       
       GameRegistry.addRecipe(new ItemStack(ModItems.PressRippled, 1),
    		   "FP", 'P', ModItems.PressBlank, 'F', Items.string);
       
       GameRegistry.addRecipe(new ItemStack(ModItems.PressStamp, 1),
    		   "FP", 'P', ModItems.PressBlank, 'F', new ItemStack(Blocks.stone_slab, 1, 0));
       
       
       
       
       ////////////////////////////////////		16 BLOCK VARIANT RECIPIES		////////////////////////////////////	
       
       //Recipes for Stamp Blocks
       for (int j = 0; j < 16; j++) {
       GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.Stamp, 1, j),
    		   "FP", 'F', ModItems.PressStamp, 'P', "solidWPBlocks"));}
       				for (int i = 0; i < 16; i++) {
       					GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.Stamp, 1, (i+1)%16), new ItemStack(ModBlocks.Stamp, 1, i%16));}
       				

       
       

		
	   ////////////////////////////////////		115 BLOCK VARIANT RECIPIES		////////////////////////////////////

       //Recipes for Solid block
       for (int j = 0, i = 0; j < 15 || j < 10; j++, i++) {
    	   if ( j < 15){
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.SolidRed, 9, 0), "CCC", "CCC", "CCC", 'C', new ItemStack(Blocks.stained_hardened_clay, 1, 14));
    		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidRed, 1, (j+1)%15), new Object[] {new ItemStack(ModBlocks.SolidRed, 1, j%15)});
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.SolidPurple, 9, 0), "CCC", "CCC", "CCC", 'C', new ItemStack(Blocks.stained_hardened_clay, 1, 10));
    		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidPurple, 1, (j+1)%15), new Object[] {new ItemStack(ModBlocks.SolidPurple, 1, j%15)});
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.SolidBlue, 9, 0), "CCC", "CCC", "CCC", 'C', new ItemStack(Blocks.stained_hardened_clay, 1, 11));
    		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidBlue, 1, (j+1)%15), new Object[] {new ItemStack(ModBlocks.SolidBlue, 1, j%15)});
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.SolidGreen, 9, 0), "CCC", "CCC", "CCC", 'C', new ItemStack(Blocks.stained_hardened_clay, 1, 13));
    		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidGreen, 1, (j+1)%15), new Object[] {new ItemStack(ModBlocks.SolidGreen, 1, j%15)});
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.SolidYellow, 9, 0), "CCC", "CCC", "CCC", 'C', new ItemStack(Blocks.stained_hardened_clay, 1, 4));
    		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidYellow, 1, (j+1)%15), new Object[] {new ItemStack(ModBlocks.SolidYellow, 1, j%15)});
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.SolidBrown, 9, 0), "CCC", "CCC", "CCC", 'C', new ItemStack(Blocks.stained_hardened_clay, 1, 12));
    		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidBrown, 1, (j+1)%15), new Object[] {new ItemStack(ModBlocks.SolidBrown, 1, j%15)});
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.SolidGray, 9, 0), "CCC", "CCC", "CCC", 'C', new ItemStack(Blocks.stained_hardened_clay, 1, 7));
    	   }
    	   if ( i < 10){
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.SolidCyan, 9, 0), "CCC", "CCC", "CCC", 'C', new ItemStack(Blocks.stained_hardened_clay, 1, 9));
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidCyan, 1, (i+1)%10), new Object[] {new ItemStack(ModBlocks.SolidCyan, 1, i%10)});
    	   }
       }
       
       				
       				
    	
 
       //Recipes for Diagonally Dotted blocks
       for (int j = 0, i = 0; j < 15 || i < 10; j++, i++) {
    	   if ( j < 15){
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedRed, 1, j), ModItems.PressDiagonallyDotted, new ItemStack(ModBlocks.SolidRed, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedRed, 1, (j+1)%15), new ItemStack(ModBlocks.DiagonallyDottedRed, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedPurple, 1, j), ModItems.PressDiagonallyDotted, new ItemStack(ModBlocks.SolidPurple, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedPurple, 1, (j+1)%15), new ItemStack(ModBlocks.DiagonallyDottedPurple, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedBlue, 1, j), ModItems.PressDiagonallyDotted, new ItemStack(ModBlocks.SolidBlue, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedBlue, 1, (j+1)%15), new ItemStack(ModBlocks.DiagonallyDottedBlue, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedGreen, 1, j), ModItems.PressDiagonallyDotted, new ItemStack(ModBlocks.SolidGreen, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedGreen, 1, (j+1)%15), new ItemStack(ModBlocks.DiagonallyDottedGreen, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedYellow, 1, j), ModItems.PressDiagonallyDotted, new ItemStack(ModBlocks.SolidYellow, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedYellow, 1, (j+1)%15), new ItemStack(ModBlocks.DiagonallyDottedYellow, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedBrown, 1, j), ModItems.PressDiagonallyDotted, new ItemStack(ModBlocks.SolidBrown, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedBrown, 1, (j+1)%15), new ItemStack(ModBlocks.DiagonallyDottedBrown, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedGray, 1, j), ModItems.PressDiagonallyDotted, new ItemStack(ModBlocks.SolidGray, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedGray, 1, (j+1)%15), new ItemStack(ModBlocks.DiagonallyDottedGray, 1, j%15));
    	   }
  	   	   if ( i < 10){
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedCyan, 1, i), ModItems.PressDiagonallyDotted, new ItemStack(ModBlocks.SolidCyan, 1, i));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DiagonallyDottedCyan, 1, (i+1)%10), new ItemStack(ModBlocks.DiagonallyDottedCyan, 1, i%10));
  	   	   }
       }
          	
 
       //Recipes for Dotted blocks
       for (int j = 0, i = 0; j < 15 || i < 10; j++, i++) {
    	   if ( j < 15){
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedRed, 1, j), ModItems.PressDotted, new ItemStack(ModBlocks.SolidRed, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedRed, 1, (j+1)%15), new ItemStack(ModBlocks.DottedRed, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedPurple, 1, j), ModItems.PressDotted, new ItemStack(ModBlocks.SolidPurple, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedPurple, 1, (j+1)%15), new ItemStack(ModBlocks.DottedPurple, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedBlue, 1, j), ModItems.PressDotted, new ItemStack(ModBlocks.SolidBlue, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedBlue, 1, (j+1)%15), new ItemStack(ModBlocks.DottedBlue, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedGreen, 1, j), ModItems.PressDotted, new ItemStack(ModBlocks.SolidGreen, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedGreen, 1, (j+1)%15), new ItemStack(ModBlocks.DottedGreen, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedYellow, 1, j), ModItems.PressDotted, new ItemStack(ModBlocks.SolidYellow, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedYellow, 1, (j+1)%15), new ItemStack(ModBlocks.DottedYellow, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedBrown, 1, j), ModItems.PressDotted, new ItemStack(ModBlocks.SolidBrown, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedBrown, 1, (j+1)%15), new ItemStack(ModBlocks.DottedBrown, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedGray, 1, j), ModItems.PressDotted, new ItemStack(ModBlocks.SolidGray, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedGray, 1, (j+1)%15), new ItemStack(ModBlocks.DottedGray, 1, j%15));
    	   }
  	   	   if ( i < 10){
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedCyan, 1, i), ModItems.PressDotted, new ItemStack(ModBlocks.SolidCyan, 1, i));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DottedCyan, 1, (i+1)%10), new ItemStack(ModBlocks.DottedCyan, 1, i%10));
  	   	   }
       }

 
       //Recipes for Striped blocks
       for (int j = 0, i = 0; j < 15 || i < 10; j++, i++) {
    	   if ( j < 15){
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedRed, 1, j), ModItems.PressStriped, new ItemStack(ModBlocks.SolidRed, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedRed, 1, (j+1)%15), new ItemStack(ModBlocks.StripedRed, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedPurple, 1, j), ModItems.PressStriped, new ItemStack(ModBlocks.SolidPurple, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedPurple, 1, (j+1)%15), new ItemStack(ModBlocks.StripedPurple, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedBlue, 1, j), ModItems.PressStriped, new ItemStack(ModBlocks.SolidBlue, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedBlue, 1, (j+1)%15), new ItemStack(ModBlocks.StripedBlue, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedGreen, 1, j), ModItems.PressStriped, new ItemStack(ModBlocks.SolidGreen, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedGreen, 1, (j+1)%15), new ItemStack(ModBlocks.StripedGreen, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedYellow, 1, j), ModItems.PressStriped, new ItemStack(ModBlocks.SolidYellow, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedYellow, 1, (j+1)%15), new ItemStack(ModBlocks.StripedYellow, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedBrown, 1, j), ModItems.PressStriped, new ItemStack(ModBlocks.SolidBrown, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedBrown, 1, (j+1)%15), new ItemStack(ModBlocks.StripedBrown, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedGray, 1, j), ModItems.PressStriped, new ItemStack(ModBlocks.SolidGray, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedGray, 1, (j+1)%15), new ItemStack(ModBlocks.StripedGray, 1, j%15));
    	   }
  	   	   if ( i < 10){
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedCyan, 1, i), ModItems.PressStriped, new ItemStack(ModBlocks.SolidCyan, 1, i));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StripedCyan, 1, (i+1)%10), new ItemStack(ModBlocks.StripedCyan, 1, i%10));
  	   	   }
       }
       
       //Recipes for Floral blocks
       for (int j = 0, i = 0; j < 15 || i < 10; j++, i++) {
    	   if ( j < 15){
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralRed, 1, j), ModItems.PressFloral, new ItemStack(ModBlocks.SolidRed, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralRed, 1, (j+1)%15), new ItemStack(ModBlocks.FloralRed, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralPurple, 1, j), ModItems.PressFloral, new ItemStack(ModBlocks.SolidPurple, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralPurple, 1, (j+1)%15), new ItemStack(ModBlocks.FloralPurple, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralBlue, 1, j), ModItems.PressFloral, new ItemStack(ModBlocks.SolidBlue, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralBlue, 1, (j+1)%15), new ItemStack(ModBlocks.FloralBlue, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralGreen, 1, j), ModItems.PressFloral, new ItemStack(ModBlocks.SolidGreen, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralGreen, 1, (j+1)%15), new ItemStack(ModBlocks.FloralGreen, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralYellow, 1, j), ModItems.PressFloral, new ItemStack(ModBlocks.SolidYellow, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralYellow, 1, (j+1)%15), new ItemStack(ModBlocks.FloralYellow, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralBrown, 1, j), ModItems.PressFloral, new ItemStack(ModBlocks.SolidBrown, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralBrown, 1, (j+1)%15), new ItemStack(ModBlocks.FloralBrown, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralGray, 1, j), ModItems.PressFloral, new ItemStack(ModBlocks.SolidGray, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralGray, 1, (j+1)%15), new ItemStack(ModBlocks.FloralGray, 1, j%15));
    	   }
  	   	   if ( i < 10){
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralCyan, 1, i), ModItems.PressFloral, new ItemStack(ModBlocks.SolidCyan, 1, i));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.FloralCyan, 1, (i+1)%10), new ItemStack(ModBlocks.FloralCyan, 1, i%10));
  	   	   }
       }
    	
 
       //Recipes for Damask blocks
       for (int j = 0, i = 0; j < 15 || i < 10; j++, i++) {
    	   if ( j < 15){
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DamaskRed, 1, j), ModItems.PressDamask, new ItemStack(ModBlocks.SolidRed, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DamaskRed, 1, (j+1)%15), new ItemStack(ModBlocks.DamaskRed, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DamaskPurple, 1, j), ModItems.PressDamask, new ItemStack(ModBlocks.SolidPurple, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DamaskPurple, 1, (j+1)%15), new ItemStack(ModBlocks.DamaskPurple, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DamaskBlue, 1, j), ModItems.PressDamask, new ItemStack(ModBlocks.SolidBlue, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DamaskBlue, 1, (j+1)%15), new ItemStack(ModBlocks.DamaskBlue, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DamaskGreen, 1, j), ModItems.PressDamask, new ItemStack(ModBlocks.SolidGreen, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DamaskGreen, 1, (j+1)%15), new ItemStack(ModBlocks.DamaskGreen, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DamaskYellow, 1, j), ModItems.PressDamask, new ItemStack(ModBlocks.SolidYellow, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DamaskYellow, 1, (j+1)%15), new ItemStack(ModBlocks.DamaskYellow, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DamaskBrown, 1, j), ModItems.PressDamask, new ItemStack(ModBlocks.SolidBrown, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DamaskBrown, 1, (j+1)%15), new ItemStack(ModBlocks.DamaskBrown, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DamaskGray, 1, j), ModItems.PressDamask, new ItemStack(ModBlocks.SolidGray, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DamaskGray, 1, (j+1)%15), new ItemStack(ModBlocks.DamaskGray, 1, j%15));
    	   }
  	   	   if ( i < 10){
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DamaskCyan, 1, i), ModItems.PressDamask, new ItemStack(ModBlocks.SolidCyan, 1, i));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.DamaskCyan, 1, (i+1)%10), new ItemStack(ModBlocks.DamaskCyan, 1, i%10));
  	   	   }
       }
    	
 
       //Recipes For Rippled blocks
       for (int j = 0, i = 0; j < 15 || i < 10; j++, i++) {
    	   if ( j < 15){
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.RippledRed, 1, j), ModItems.PressRippled, new ItemStack(ModBlocks.SolidRed, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.RippledRed, 1, (j+1)%15), new ItemStack(ModBlocks.RippledRed, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.RippledPurple, 1, j), ModItems.PressRippled, new ItemStack(ModBlocks.SolidPurple, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.RippledPurple, 1, (j+1)%15), new ItemStack(ModBlocks.RippledPurple, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.RippledBlue, 1, j), ModItems.PressRippled, new ItemStack(ModBlocks.SolidBlue, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.RippledBlue, 1, (j+1)%15), new ItemStack(ModBlocks.RippledBlue, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.RippledGreen, 1, j), ModItems.PressRippled, new ItemStack(ModBlocks.SolidGreen, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.RippledGreen, 1, (j+1)%15), new ItemStack(ModBlocks.RippledGreen, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.RippledYellow, 1, j), ModItems.PressRippled, new ItemStack(ModBlocks.SolidYellow, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.RippledYellow, 1, (j+1)%15), new ItemStack(ModBlocks.RippledYellow, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.RippledBrown, 1, j), ModItems.PressRippled, new ItemStack(ModBlocks.SolidBrown, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.RippledBrown, 1, (j+1)%15), new ItemStack(ModBlocks.RippledBrown, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.RippledGray, 1, j), ModItems.PressRippled, new ItemStack(ModBlocks.SolidGray, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.RippledGray, 1, (j+1)%15), new ItemStack(ModBlocks.RippledGray, 1, j%15));
    	   }
  	   	   if ( i < 10){
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.RippledCyan, 1, i), ModItems.PressRippled, new ItemStack(ModBlocks.SolidCyan, 1, i));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.RippledCyan, 1, (i+1)%10), new ItemStack(ModBlocks.RippledCyan, 1, i%10));
  	   	   }
       }
    	
 
       //Recipes for Wooden planks
       for (int j = 0, i = 0; j < 15 || i < 10; j++, i++) {
    	   if ( j < 15){
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoodPlankRed, 1, j), ModItems.PressWoodPlank, new ItemStack(ModBlocks.SolidRed, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoodPlankRed, 1, (j+1)%15), new ItemStack(ModBlocks.WoodPlankRed, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoodPlankPurple, 1, j), ModItems.PressWoodPlank, new ItemStack(ModBlocks.SolidPurple, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoodPlankPurple, 1, (j+1)%15), new ItemStack(ModBlocks.WoodPlankPurple, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoodPlankBlue, 1, j), ModItems.PressWoodPlank, new ItemStack(ModBlocks.SolidBlue, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoodPlankBlue, 1, (j+1)%15), new ItemStack(ModBlocks.WoodPlankBlue, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoodPlankGreen, 1, j), ModItems.PressWoodPlank, new ItemStack(ModBlocks.SolidGreen, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoodPlankGreen, 1, (j+1)%15), new ItemStack(ModBlocks.WoodPlankGreen, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoodPlankYellow, 1, j), ModItems.PressWoodPlank, new ItemStack(ModBlocks.SolidYellow, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoodPlankYellow, 1, (j+1)%15), new ItemStack(ModBlocks.WoodPlankYellow, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoodPlankBrown, 1, j), ModItems.PressWoodPlank, new ItemStack(ModBlocks.SolidBrown, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoodPlankBrown, 1, (j+1)%15), new ItemStack(ModBlocks.WoodPlankBrown, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoodPlankGray, 1, j), ModItems.PressWoodPlank, new ItemStack(ModBlocks.SolidGray, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoodPlankGray, 1, (j+1)%15), new ItemStack(ModBlocks.WoodPlankGray, 1, j%15));
    	   }
  	   	   if ( i < 10){
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoodPlankCyan, 1, i), ModItems.PressWoodPlank, new ItemStack(ModBlocks.SolidCyan, 1, i));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoodPlankCyan, 1, (i+1)%10), new ItemStack(ModBlocks.WoodPlankCyan, 1, i%10));
  	   	   }
       }
    	
 
       //Recipes for Tinted glass
       for (int j = 0, i = 0; j < 15 || i < 10; j++, i++) {
    	   if ( j < 15){
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassRed, 1, 0), ModItems.PressTintedGlass, new ItemStack(Blocks.stained_glass, 1, 14));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassRed, 1, (j+1)%15), new ItemStack(ModBlocks.TintedGlassRed, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassPurple, 1, 0), ModItems.PressTintedGlass, new ItemStack(Blocks.stained_glass, 1, 10));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassPurple, 1, (j+1)%15), new ItemStack(ModBlocks.TintedGlassPurple, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassBlue, 1, 0), ModItems.PressTintedGlass, new ItemStack(Blocks.stained_glass, 1, 11));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassBlue, 1, (j+1)%15), new ItemStack(ModBlocks.TintedGlassBlue, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassGreen, 1, 0), ModItems.PressTintedGlass, new ItemStack(Blocks.stained_glass, 1, 13));
       		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassGreen, 1, (j+1)%15), new ItemStack(ModBlocks.TintedGlassGreen, 1, j%15));
       	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassYellow, 1, 0), ModItems.PressTintedGlass, new ItemStack(Blocks.stained_glass, 1, 4));
       		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassYellow, 1, (j+1)%15), new ItemStack(ModBlocks.TintedGlassYellow, 1, j%15));
       	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassBrown, 1, 0), ModItems.PressTintedGlass, new ItemStack(Blocks.stained_glass, 1, 12));
       		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassBrown, 1, (j+1)%15), new ItemStack(ModBlocks.TintedGlassBrown, 1, j%15));
       	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassGray, 1, 0), ModItems.PressTintedGlass, new ItemStack(Blocks.stained_glass, 1, 7));
       		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassGray, 1, (j+1)%15), new ItemStack(ModBlocks.TintedGlassGray, 1, j%15));
    	   }
  	   	   if ( j < 10){
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassCyan, 1, 0), ModItems.PressTintedGlass, new ItemStack(Blocks.stained_glass, 1, 9));
       		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassCyan, 1, (i+1)%10), new ItemStack(ModBlocks.TintedGlassCyan, 1, i%10));
  	 	   }
       }

       
       //Recipes for Textured glass
       for (int j = 0, i = 0; j < 15 || i < 10; j++, i++) {
    	   if ( j < 15){
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassRed, 1, 0), ModItems.PressTexturedGlass, new ItemStack(Blocks.stained_glass, 1, 14));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassRed, 1, (j+1)%15), new ItemStack(ModBlocks.TexturedGlassRed, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassPurple, 1, 0), ModItems.PressTexturedGlass, new ItemStack(Blocks.stained_glass, 1, 10));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassPurple, 1, (j+1)%15), new ItemStack(ModBlocks.TexturedGlassPurple, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassBlue, 1, 0), ModItems.PressTexturedGlass, new ItemStack(Blocks.stained_glass, 1, 11));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassBlue, 1, (j+1)%15), new ItemStack(ModBlocks.TexturedGlassBlue, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassGreen, 1, 0), ModItems.PressTexturedGlass, new ItemStack(Blocks.stained_glass, 1, 13));
       		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassGreen, 1, (j+1)%15), new ItemStack(ModBlocks.TexturedGlassGreen, 1, j%15));
       	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassYellow, 1, 0), ModItems.PressTexturedGlass, new ItemStack(Blocks.stained_glass, 1, 4));
       		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassYellow, 1, (j+1)%15), new ItemStack(ModBlocks.TexturedGlassYellow, 1, j%15));
       	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassBrown, 1, 0), ModItems.PressTexturedGlass, new ItemStack(Blocks.stained_glass, 1, 12));
       		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassBrown, 1, (j+1)%15), new ItemStack(ModBlocks.TexturedGlassBrown, 1, j%15));
       	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassGray, 1, 0), ModItems.PressTexturedGlass, new ItemStack(Blocks.stained_glass, 1, 7));
       		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassGray, 1, (j+1)%15), new ItemStack(ModBlocks.TexturedGlassGray, 1, j%15));
    	   }
  	   	   if ( j < 10){
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassCyan, 1, 0), ModItems.PressTexturedGlass, new ItemStack(Blocks.stained_glass, 1, 9));
       		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TexturedGlassCyan, 1, (i+1)%10), new ItemStack(ModBlocks.TexturedGlassCyan, 1, i%10));
  	 	   }
       }
    	
 
       //Recipes for Frosted glass
       for (int j = 0, i = 0; j < 15 || i < 10; j++, i++) {
    	   if ( j < 15){
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassRed, 1, 0), ModItems.PressTintedGlass, new ItemStack(Blocks.stained_glass, 1, 14));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassRed, 1, (j+1)%15), new ItemStack(ModBlocks.TintedGlassRed, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassPurple, 1, 0), ModItems.PressTintedGlass, new ItemStack(Blocks.stained_glass, 1, 10));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassPurple, 1, (j+1)%15), new ItemStack(ModBlocks.TintedGlassPurple, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassBlue, 1, 0), ModItems.PressTintedGlass, new ItemStack(Blocks.stained_glass, 1, 11));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassBlue, 1, (j+1)%15), new ItemStack(ModBlocks.TintedGlassBlue, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassGreen, 1, 0), ModItems.PressTintedGlass, new ItemStack(Blocks.stained_glass, 1, 13));
       		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassGreen, 1, (j+1)%15), new ItemStack(ModBlocks.TintedGlassGreen, 1, j%15));
       	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassYellow, 1, 0), ModItems.PressTintedGlass, new ItemStack(Blocks.stained_glass, 1, 4));
       		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassYellow, 1, (j+1)%15), new ItemStack(ModBlocks.TintedGlassYellow, 1, j%15));
       	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassBrown, 1, 0), ModItems.PressTintedGlass, new ItemStack(Blocks.stained_glass, 1, 12));
       		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassBrown, 1, (j+1)%15), new ItemStack(ModBlocks.TintedGlassBrown, 1, j%15));
       	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassGray, 1, 0), ModItems.PressTintedGlass, new ItemStack(Blocks.stained_glass, 1, 7));
       		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassGray, 1, (j+1)%15), new ItemStack(ModBlocks.TintedGlassGray, 1, j%15));
    	   }
  	   	   if ( j < 10){
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassCyan, 1, 0), ModItems.PressTintedGlass, new ItemStack(Blocks.stained_glass, 1, 9));
       		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.TintedGlassCyan, 1, (i+1)%10), new ItemStack(ModBlocks.TintedGlassCyan, 1, i%10));
  	 	   }
       }
    	
 
       //Recipes for Bricks
       for (int j = 0, i = 0; j < 15 || i < 10; j++, i++) {
    	   if ( j < 15){
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickRed, 1, j), ModItems.PressBrick, new ItemStack(ModBlocks.SolidRed, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickRed, 1, (j+1)%15), new ItemStack(ModBlocks.BrickRed, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickPurple, 1, j), ModItems.PressBrick, new ItemStack(ModBlocks.SolidPurple, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickPurple, 1, (j+1)%15), new ItemStack(ModBlocks.BrickPurple, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickBlue, 1, j), ModItems.PressBrick, new ItemStack(ModBlocks.SolidBlue, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickBlue, 1, (j+1)%15), new ItemStack(ModBlocks.BrickBlue, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickGreen, 1, j), ModItems.PressBrick, new ItemStack(ModBlocks.SolidGreen, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickGreen, 1, (j+1)%15), new ItemStack(ModBlocks.BrickGreen, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickYellow, 1, j), ModItems.PressBrick, new ItemStack(ModBlocks.SolidYellow, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickYellow, 1, (j+1)%15), new ItemStack(ModBlocks.BrickYellow, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickBrown, 1, j), ModItems.PressBrick, new ItemStack(ModBlocks.SolidBrown, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickBrown, 1, (j+1)%15), new ItemStack(ModBlocks.BrickBrown, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickGray, 1, j), ModItems.PressBrick, new ItemStack(ModBlocks.SolidGray, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickGray, 1, (j+1)%15), new ItemStack(ModBlocks.BrickGray, 1, j%15));
    	   }
  	   	   if ( i < 10){
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickCyan, 1, i), ModItems.PressBrick, new ItemStack(ModBlocks.SolidCyan, 1, i));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BrickCyan, 1, (i+1)%10), new ItemStack(ModBlocks.BrickCyan, 1, i%10));
  	   	   }
       }
    	
 
       //Recipes for Stone Bricks
       for (int j = 0, i = 0; j < 15 || i < 10; j++, i++) {
    	   if ( j < 15){
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StoneBrickRed, 1, j), ModItems.PressStoneBrick, new ItemStack(ModBlocks.SolidRed, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StoneBrickRed, 1, (j+1)%15), new ItemStack(ModBlocks.StoneBrickRed, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StoneBrickPurple, 1, j), ModItems.PressStoneBrick, new ItemStack(ModBlocks.SolidPurple, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StoneBrickPurple, 1, (j+1)%15), new ItemStack(ModBlocks.StoneBrickPurple, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StoneBrickBlue, 1, j), ModItems.PressStoneBrick, new ItemStack(ModBlocks.SolidBlue, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StoneBrickBlue, 1, (j+1)%15), new ItemStack(ModBlocks.StoneBrickBlue, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StoneBrickGreen, 1, j), ModItems.PressStoneBrick, new ItemStack(ModBlocks.SolidGreen, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StoneBrickGreen, 1, (j+1)%15), new ItemStack(ModBlocks.StoneBrickGreen, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StoneBrickYellow, 1, j), ModItems.PressStoneBrick, new ItemStack(ModBlocks.SolidYellow, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StoneBrickYellow, 1, (j+1)%15), new ItemStack(ModBlocks.StoneBrickYellow, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StoneBrickBrown, 1, j), ModItems.PressStoneBrick, new ItemStack(ModBlocks.SolidBrown, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StoneBrickBrown, 1, (j+1)%15), new ItemStack(ModBlocks.StoneBrickBrown, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StoneBrickGray, 1, j), ModItems.PressStoneBrick, new ItemStack(ModBlocks.SolidGray, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StoneBrickGray, 1, (j+1)%15), new ItemStack(ModBlocks.StoneBrickGray, 1, j%15));
    	   }
  	   	   if ( i < 10){
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StoneBrickCyan, 1, i), ModItems.PressStoneBrick, new ItemStack(ModBlocks.SolidCyan, 1, i));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StoneBrickCyan, 1, (i+1)%10), new ItemStack(ModBlocks.StoneBrickCyan, 1, i%10));
  	   	   }
       }
    	
 
       //Recipes for Stone Lamps
       for (int j = 0, i = 0; j < 15 || i < 10; j++, i++) {
    	   if ( j < 15){
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StoneLampRed, 1, j), ModItems.PressStoneLamp, new ItemStack(ModBlocks.SolidRed, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StoneLampRed, 1, (j+1)%15), new ItemStack(ModBlocks.StoneLampRed, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StoneLampPurple, 1, j), ModItems.PressStoneLamp, new ItemStack(ModBlocks.SolidPurple, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StoneLampPurple, 1, (j+1)%15), new ItemStack(ModBlocks.StoneLampPurple, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StoneLampBlue, 1, j), ModItems.PressStoneLamp, new ItemStack(ModBlocks.SolidBlue, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StoneLampBlue, 1, (j+1)%15), new ItemStack(ModBlocks.StoneLampBlue, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StoneLampGreen, 1, j), ModItems.PressStoneLamp, new ItemStack(ModBlocks.SolidGreen, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StoneLampGreen, 1, (j+1)%15), new ItemStack(ModBlocks.StoneLampGreen, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StoneLampYellow, 1, j), ModItems.PressStoneLamp, new ItemStack(ModBlocks.SolidYellow, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StoneLampYellow, 1, (j+1)%15), new ItemStack(ModBlocks.StoneLampYellow, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StoneLampBrown, 1, j), ModItems.PressStoneLamp, new ItemStack(ModBlocks.SolidBrown, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StoneLampBrown, 1, (j+1)%15), new ItemStack(ModBlocks.StoneLampBrown, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StoneLampGray, 1, j), ModItems.PressStoneLamp, new ItemStack(ModBlocks.SolidGray, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StoneLampGray, 1, (j+1)%15), new ItemStack(ModBlocks.StoneLampGray, 1, j%15));
    	   }
  	   	   if ( i < 10){
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StoneLampCyan, 1, i), ModItems.PressStoneLamp, new ItemStack(ModBlocks.SolidCyan, 1, i));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.StoneLampCyan, 1, (i+1)%10), new ItemStack(ModBlocks.StoneLampCyan, 1, i%10));
  	   	   }
       }
    	
 
       //Recipes for Wool
       for (int j = 0, i = 0; j < 15 || i < 10; j++, i++) {
    	   if ( j < 15){
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoolRed, 1, j), ModItems.PressWool, new ItemStack(ModBlocks.SolidRed, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoolRed, 1, (j+1)%15), new ItemStack(ModBlocks.WoolRed, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoolPurple, 1, j), ModItems.PressWool, new ItemStack(ModBlocks.SolidPurple, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoolPurple, 1, (j+1)%15), new ItemStack(ModBlocks.WoolPurple, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoolBlue, 1, j), ModItems.PressWool, new ItemStack(ModBlocks.SolidBlue, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoolBlue, 1, (j+1)%15), new ItemStack(ModBlocks.WoolBlue, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoolGreen, 1, j), ModItems.PressWool, new ItemStack(ModBlocks.SolidGreen, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoolGreen, 1, (j+1)%15), new ItemStack(ModBlocks.WoolGreen, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoolYellow, 1, j), ModItems.PressWool, new ItemStack(ModBlocks.SolidYellow, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoolYellow, 1, (j+1)%15), new ItemStack(ModBlocks.WoolYellow, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoolBrown, 1, j), ModItems.PressWool, new ItemStack(ModBlocks.SolidBrown, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoolBrown, 1, (j+1)%15), new ItemStack(ModBlocks.WoolBrown, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoolGray, 1, j), ModItems.PressWool, new ItemStack(ModBlocks.SolidGray, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoolGray, 1, (j+1)%15), new ItemStack(ModBlocks.WoolGray, 1, j%15));
    	   }
  	   	   if ( i < 10){
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoolCyan, 1, i), ModItems.PressWool, new ItemStack(ModBlocks.SolidCyan, 1, i));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoolCyan, 1, (i+1)%10), new ItemStack(ModBlocks.WoolCyan, 1, i%10));
  	   	   }
       }
    	

		//Recipes for Red Wool Carpets
       for (int j = 0, i = 0; j < 15 || i < 10; j++, i++) {
    	   if ( j < 15){
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.WoolCarpetRed, 3, j), "WW", 'W', new ItemStack(ModBlocks.WoolRed, 1, j));
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoolCarpetRed, 1, (j+1)%15), new Object[] {new ItemStack(ModBlocks.WoolCarpetRed, 1, j%15)});
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.WoolCarpetPurple, 3, j), "WW", 'W', new ItemStack(ModBlocks.WoolPurple, 1, j));
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoolCarpetPurple, 1, (j+1)%15), new Object[] {new ItemStack(ModBlocks.WoolCarpetPurple, 1, j%15)});
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.WoolCarpetBlue, 3, j), "WW", 'W', new ItemStack(ModBlocks.WoolBlue, 1, j));
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoolCarpetBlue, 1, (j+1)%15), new Object[] {new ItemStack(ModBlocks.WoolCarpetBlue, 1, j%15)});
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.WoolCarpetGreen, 3, j), "WW", 'W', new ItemStack(ModBlocks.WoolGreen, 1, j));
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoolCarpetGreen, 1, (j+1)%15), new Object[] {new ItemStack(ModBlocks.WoolCarpetGreen, 1, j%15)});
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.WoolCarpetYellow, 3, j), "WW", 'W', new ItemStack(ModBlocks.WoolYellow, 1, j));
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoolCarpetYellow, 1, (j+1)%15), new Object[] {new ItemStack(ModBlocks.WoolCarpetYellow, 1, j%15)});
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.WoolCarpetBrown, 3, j), "WW", 'W', new ItemStack(ModBlocks.WoolBrown, 1, j));
    		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoolCarpetBrown, 1, (j+1)%15), new Object[] {new ItemStack(ModBlocks.WoolCarpetBrown, 1, j%15)});
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.WoolCarpetGray, 3, j), "WW", 'W', new ItemStack(ModBlocks.WoolGray, 1, j));
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoolCarpetGray, 1, (j+1)%15), new Object[] {new ItemStack(ModBlocks.WoolCarpetGray, 1, j%15)});
    	   }
    	   if ( i < 10){
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.WoolCarpetCyan, 3, i), "WW", 'W', new ItemStack(ModBlocks.WoolCyan, 1, i));
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.WoolCarpetCyan, 1, (i+1)%10), new Object[] {new ItemStack(ModBlocks.WoolCarpetCyan, 1, i%10)});
    	   }
       }

       
       //Recipes Checkered Wool
       for (int j = 0, i = 0; j < 15 || i < 10; j++, i++) {
    	   if ( j < 15){
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredWoolRed, 1, j), ModItems.PressCheckered, new ItemStack(ModBlocks.SolidRed, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredWoolRed, 1, (j+1)%15), new ItemStack(ModBlocks.CheckeredWoolRed, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredWoolPurple, 1, j), ModItems.PressCheckered, new ItemStack(ModBlocks.SolidPurple, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredWoolPurple, 1, (j+1)%15), new ItemStack(ModBlocks.CheckeredWoolPurple, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredWoolBlue, 1, j), ModItems.PressCheckered, new ItemStack(ModBlocks.SolidBlue, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredWoolBlue, 1, (j+1)%15), new ItemStack(ModBlocks.CheckeredWoolBlue, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredWoolGreen, 1, j), ModItems.PressCheckered, new ItemStack(ModBlocks.SolidGreen, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredWoolGreen, 1, (j+1)%15), new ItemStack(ModBlocks.CheckeredWoolGreen, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredWoolYellow, 1, j), ModItems.PressCheckered, new ItemStack(ModBlocks.SolidYellow, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredWoolYellow, 1, (j+1)%15), new ItemStack(ModBlocks.CheckeredWoolYellow, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredWoolBrown, 1, j), ModItems.PressCheckered, new ItemStack(ModBlocks.SolidBrown, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredWoolBrown, 1, (j+1)%15), new ItemStack(ModBlocks.CheckeredWoolBrown, 1, j%15));
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredWoolGray, 1, j), ModItems.PressCheckered, new ItemStack(ModBlocks.SolidGray, 1, j));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredWoolGray, 1, (j+1)%15), new ItemStack(ModBlocks.CheckeredWoolGray, 1, j%15));
    	   }
  	   	   if ( i < 10){
  	   	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredWoolCyan, 1, i), ModItems.PressCheckered, new ItemStack(ModBlocks.SolidCyan, 1, i));
  	   		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredWoolCyan, 1, (i+1)%10), new ItemStack(ModBlocks.CheckeredWoolCyan, 1, i%10));
  	   	   }
       }
    	

		//Recipes for Checkered Carpets
       for (int j = 0, i = 0; j < 15 || i < 10; j++, i++) {
    	   if ( j < 15){
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.CheckeredCarpetRed, 3, j), "WW", 'W', new ItemStack(ModBlocks.CheckeredWoolRed, 1, j));
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredCarpetRed, 1, (j+1)%15), new Object[] {new ItemStack(ModBlocks.CheckeredCarpetRed, 1, j%15)});
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.CheckeredCarpetPurple, 3, j), "WW", 'W', new ItemStack(ModBlocks.CheckeredWoolPurple, 1, j));
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredCarpetPurple, 1, (j+1)%15), new Object[] {new ItemStack(ModBlocks.CheckeredCarpetPurple, 1, j%15)});
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.CheckeredCarpetBlue, 3, j), "WW", 'W', new ItemStack(ModBlocks.CheckeredWoolBlue, 1, j));
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredCarpetBlue, 1, (j+1)%15), new Object[] {new ItemStack(ModBlocks.CheckeredCarpetBlue, 1, j%15)});
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.CheckeredCarpetGreen, 3, j), "WW", 'W', new ItemStack(ModBlocks.CheckeredWoolGreen, 1, j));
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredCarpetGreen, 1, (j+1)%15), new Object[] {new ItemStack(ModBlocks.CheckeredCarpetGreen, 1, j%15)});
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.CheckeredCarpetYellow, 3, j), "WW", 'W', new ItemStack(ModBlocks.CheckeredWoolYellow, 1, j));
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredCarpetYellow, 1, (j+1)%15), new Object[] {new ItemStack(ModBlocks.CheckeredCarpetYellow, 1, j%15)});
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.CheckeredCarpetBrown, 3, j), "WW", 'W', new ItemStack(ModBlocks.CheckeredWoolBrown, 1, j));
    		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredCarpetBrown, 1, (j+1)%15), new Object[] {new ItemStack(ModBlocks.CheckeredCarpetBrown, 1, j%15)});
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.CheckeredCarpetGray, 3, j), "WW", 'W', new ItemStack(ModBlocks.CheckeredWoolGray, 1, j));
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredCarpetGray, 1, (j+1)%15), new Object[] {new ItemStack(ModBlocks.CheckeredCarpetGray, 1, j%15)});
    	   }
    	   if ( i < 10){
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.CheckeredCarpetCyan, 3, i), "WW", 'W', new ItemStack(ModBlocks.CheckeredWoolCyan, 1, i));
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CheckeredCarpetCyan, 1, (i+1)%10), new Object[] {new ItemStack(ModBlocks.CheckeredCarpetCyan, 1, i%10)});
    	   }
       }
    					
    					
				////////////////////////////////////		UNCRAFTING		////////////////////////////////////
    	for (int j = 0; j < 15; j++) {	        	
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidRed, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.DiagonallyDottedRed, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidPurple, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.DiagonallyDottedPurple, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidBlue, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.DiagonallyDottedBlue, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidGreen, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.DiagonallyDottedGreen, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidYellow, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.DiagonallyDottedYellow, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidBrown, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.DiagonallyDottedBrown, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidGray, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.DiagonallyDottedGray, 1, j));
     	
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidRed, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.DottedRed, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidPurple, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.DottedPurple, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidBlue, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.DottedBlue, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidGreen, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.DottedGreen, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidYellow, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.DottedYellow, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidBrown, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.DottedBrown, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidGray, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.DottedGray, 1, j));
    	
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidRed, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.StripedRed, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidPurple, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.StripedPurple, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidBlue, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.StripedBlue, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidGreen, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.StripedGreen, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidYellow, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.StripedYellow, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidBrown, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.StripedBrown, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidGray, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.StripedGray, 1, j));
    	
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidRed, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.FloralRed, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidPurple, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.FloralPurple, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidBlue, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.FloralBlue, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidGreen, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.FloralGreen, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidYellow, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.FloralYellow, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidBrown, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.FloralBrown, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidGray, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.FloralGray, 1, j));
    	
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidRed, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.DamaskRed, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidPurple, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.DamaskPurple, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidBlue, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.DamaskBlue, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidGreen, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.DamaskGreen, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidYellow, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.DamaskYellow, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidBrown, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.DamaskBrown, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidGray, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.DamaskGray, 1, j));
    	
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidRed, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.ClayRed, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidPurple, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.ClayPurple, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidBlue, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.ClayBlue, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidGreen, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.ClayGreen, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidYellow, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.ClayYellow, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidBrown, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.ClayBrown, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidGray, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.ClayGray, 1, j));
    	
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidRed, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.BrickRed, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidPurple, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.BrickPurple, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidBlue, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.BrickBlue, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidGreen, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.BrickGreen, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidYellow, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.BrickYellow, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidBrown, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.BrickBrown, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidGray, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.BrickGray, 1, j));
    	
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidRed, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.StoneBrickRed, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidPurple, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.StoneBrickPurple, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidBlue, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.StoneBrickBlue, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidGreen, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.StoneBrickGreen, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidYellow, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.StoneBrickYellow, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidBrown, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.StoneBrickBrown, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidGray, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.StoneBrickGray, 1, j));
    	
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidRed, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.StoneLampRed, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidPurple, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.StoneLampPurple, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidBlue, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.StoneLampBlue, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidGreen, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.StoneLampGreen, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidYellow, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.StoneLampYellow, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidBrown, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.StoneLampBrown, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidGray, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.StoneLampGray, 1, j));
    	
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidRed, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.RippledRed, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidPurple, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.RippledPurple, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidBlue, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.RippledBlue, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidGreen, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.RippledGreen, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidYellow, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.RippledYellow, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidBrown, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.RippledBrown, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidGray, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.RippledGray, 1, j));
    	
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidRed, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.WoodPlankRed, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidPurple, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.WoodPlankPurple, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidBlue, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.WoodPlankBlue, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidGreen, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.WoodPlankGreen, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidYellow, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.WoodPlankYellow, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidBrown, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.WoodPlankBrown, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidGray, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.WoodPlankGray, 1, j));
    	
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidRed, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.WoolRed, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidPurple, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.WoolPurple, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidBlue, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.WoolBlue, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidGreen, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.WoolGreen, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidYellow, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.WoolYellow, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidBrown, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.WoolBrown, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidGray, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.WoolGray, 1, j));
    	
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidRed, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.CheckeredWoolRed, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidPurple, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.CheckeredWoolPurple, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidBlue, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.CheckeredWoolBlue, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidGreen, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.CheckeredWoolGreen, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidYellow, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.CheckeredWoolYellow, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidBrown, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.CheckeredWoolBrown, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidGray, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.CheckeredWoolGray, 1, j)
    			);}
    	
    	for (int j = 0; j < 10; j++) {
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidCyan, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.DiagonallyDottedCyan, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidCyan, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.DottedCyan, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidCyan, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.StripedCyan, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidCyan, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.FloralCyan, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidCyan, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.DamaskCyan, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidCyan, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.ClayCyan, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidCyan, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.BrickCyan, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidCyan, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.StoneBrickCyan, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidCyan, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.StoneLampCyan, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidCyan, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.RippledCyan, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidCyan, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.WoodPlankCyan, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidCyan, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.WoolCyan, 1, j));
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidCyan, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.CheckeredWoolCyan, 1, j)
    			);}
    	
    	for (int j = 0; j < 16; j++) {    	
    	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.SolidRed, 1, j), new ItemStack (ModItems.PressBlank.setContainerItem(ModItems.PressBlank)), new ItemStack(ModBlocks.Stamp, 1, j)
    			);}
    	

    	}
    }