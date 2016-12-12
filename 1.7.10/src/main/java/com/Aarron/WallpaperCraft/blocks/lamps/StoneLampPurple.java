package com.Aarron.WallpaperCraft.blocks.lamps;

import java.util.List;

import com.Aarron.WallpaperCraft.Main;
import com.Aarron.WallpaperCraft.creativeTab.Tab;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.block.Block;

public class StoneLampPurple extends Block {

public IIcon[] icons = new IIcon[15];

	public StoneLampPurple(String unlocalizedName, Material material) {
		super(material);
		this.setBlockName("StoneLampPurple");
		this.setHardness(1.5F);
		this.setResistance(6.0F);
		this.setHarvestLevel("pickaxe", 0);
		this.setStepSound(soundTypeStone);
		this.setCreativeTab(Tab.WPtab);
		this.setLightLevel(1.0F);
	}

	@Override //Sets how many variations there are
	public IIcon getIcon(int side, int meta) {
		if (meta > 15)
			meta = 0;
		return this.icons[meta];

	}

	@Override //Registers the textures for each block. This is where I set the texture name.
	public void registerBlockIcons(IIconRegister reg) {
		for (int i = 0; i < 15; i ++) {
			this.icons[i] = reg.registerIcon("wp:StoneLampPurple-" + i);
		}
}

	@Override //Makes it so that the block dropped has a meta value equal to the block broken
	public int damageDropped(int meta) {
		return meta;
}

	@Override //Tells Minecraft to assign a creative tab for each meta value of the block
	public void getSubBlocks(Item item, CreativeTabs tab, List list) {
		for (int i = 0; i < 15; i ++) {
			list.add(new ItemStack(item, 1, i));
		}
} 
}