package com.Aarron.WallpaperCraft.items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.Aarron.WallpaperCraft.creativeTab.Tab;

	public class PressFrostedGlass extends Item {
		public PressFrostedGlass() {
			setUnlocalizedName("pressfrostedglass");
			setTextureName("wp:pressfrostedglass");
			setContainerItem(this);
			setCreativeTab(Tab.WPtab);
		}

		@Override
		public void addInformation(ItemStack itemStack, EntityPlayer player, List tooltipLines, boolean advancedTooltips) {
			tooltipLines.add("Combine this with any stained glass to apply the Frosted pattern.");
		
		}
		
		@Override 
		public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemstack) {
			
	     return false;
	     
	    }

}