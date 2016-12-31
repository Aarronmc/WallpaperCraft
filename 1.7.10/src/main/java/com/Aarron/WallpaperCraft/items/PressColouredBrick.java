package com.Aarron.WallpaperCraft.items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.Aarron.WallpaperCraft.creativeTab.Tab;

	public class PressColouredBrick extends Item {
		public PressColouredBrick() {
			setUnlocalizedName("presscolouredbrick");
			setTextureName("wp:presscolouredbrick");
			setContainerItem(this);
			setCreativeTab(Tab.WPtab);
		}

		@Override
		public void addInformation(ItemStack itemStack, EntityPlayer player, List tooltipLines, boolean advancedTooltips) {
			tooltipLines.add("Combine this with any solid colored block to apply the Colored Brick pattern.");
		
		}
		
		@Override 
		public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemstack) {
			
	     return false;
	     
	    }

}