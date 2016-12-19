package com.Aarron.WallpaperCraft.blocks;

import java.util.List;
import java.util.Random;

import com.Aarron.WallpaperCraft.creativeTab.Tab;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPane;
import net.minecraft.block.BlockStainedGlassPane;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class pane extends BlockStainedGlassPane
{
	private static final IIcon[] paneTextures = new IIcon[15];
    private static final IIcon[] topPaneTextures = new IIcon[15];
    
	public pane() {
		super();
		this.setBlockName("TintedPaneRed");
		this.setHardness(1.25F);
		this.setResistance(6.0F);
		this.setHarvestLevel("pickaxe", 0);
		this.setStepSound(soundTypeGlass);
		this.setCreativeTab(Tab.WPtab);

	}
	    
	@SideOnly(Side.CLIENT)
	public IIcon func_149735_b(int par1, int par2){
		return paneTextures[par2 % paneTextures.length];
	}

	@SideOnly(Side.CLIENT)
	public IIcon func_150104_b(int par1){
		return topPaneTextures[par1 % paneTextures.length];
	}
	
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs tab, List list){
        for (int i = 0; i < paneTextures.length; i++){
            list.add(new ItemStack(item, 1, i));
        }
    }

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister reg){
        for(int i = 0; i < paneTextures.length; ++i){
        	paneTextures[i] = reg.registerIcon("wp:TintedGlassRed-" + i);        
        	topPaneTextures[i] = reg.registerIcon("wp:TintedPaneTop-" + i);
        }
    }
	
    @Override
	public int damageDropped(int meta) {
		return meta;
    }


    @Override
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_){
    	return Item.getItemFromBlock(this);
    }
}