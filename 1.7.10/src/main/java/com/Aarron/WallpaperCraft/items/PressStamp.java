package com.Aarron.WallpaperCraft.items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.Aarron.WallpaperCraft.creativeTab.Tab;

	public class PressStamp extends Item {
		public PressStamp() {
			setUnlocalizedName("pressstamp");
			setTextureName("wp:pressstamp");
			setContainerItem(this);
			setCreativeTab(Tab.WPtab);
		}

		@Override
		public void addInformation(ItemStack itemStack, EntityPlayer player, List tooltipLines, boolean advancedTooltips) {
			tooltipLines.add("Combine this with any solid colored block to apply the Stamp pattern.");
		
		}

}