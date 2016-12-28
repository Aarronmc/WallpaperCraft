package com.Aarron.WallpaperCraft.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

public class ItemSolidBlock3 extends ItemBlockWithMetadata {

    public ItemSolidBlock3(Block block){
		super(block, block);

	}
    
    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return this.getUnlocalizedName() + "_" + stack.getItemDamage();
    }

}
