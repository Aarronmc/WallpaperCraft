package com.Aarron.WallpaperCraft.Items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.Aarron.WallpaperCraft.CreativeTab.Tab;

	public class PressBlank extends Item {
		public PressBlank() {
			setUnlocalizedName("PressBlank");
			setTextureName("wp:pressblank");
			setCreativeTab(Tab.WPtab);
		}

		@Override
		public void addInformation(ItemStack itemStack, EntityPlayer player, List tooltipLines, boolean advancedTooltips) {
			tooltipLines.add("Combine this with an item to make a patern press.");
		
		}

}