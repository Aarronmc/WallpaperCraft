package com.Aarron.WallpaperCraft.Items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

public class ItemSolidBlock extends ItemBlockWithMetadata {

    public ItemSolidBlock(Block block){
		super(block, block);

	}
    
    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return this.getUnlocalizedName() + "_" + stack.getItemDamage();
    }

}
