package com.Aarron.WallpaperCraft.CreativeTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.Aarron.WallpaperCraft.Blocks.CoreBlock;

public class Tab {

	public static final CreativeTabs WPtab = new CreativeTabs("WPtab") {
		@Override public ItemStack getIconItemStack() {
			ItemStack iStack = new ItemStack(CoreBlock.SolidBlue, 1, 13);
			return iStack;
			}
		@Override
			public Item getTabIconItem() {
			return null;
		    }
	};
}