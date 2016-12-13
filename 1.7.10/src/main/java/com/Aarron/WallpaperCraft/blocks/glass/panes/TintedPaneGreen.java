package com.Aarron.WallpaperCraft.blocks.glass.panes;

import java.util.List;
import java.util.Random;

import net.minecraft.block.BlockStainedGlassPane;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import com.Aarron.WallpaperCraft.creativeTab.Tab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TintedPaneGreen extends BlockStainedGlassPane
{
	private static final IIcon[] paneTextures = new IIcon[15];
    private static final IIcon[] topPaneTextures = new IIcon[15];
    
	public TintedPaneGreen() {
		super();
		this.setBlockName("TintedPaneGreen");
		this.setHardness(0.3F);
		this.setResistance(6.0F);
		this.setHarvestLevel("pickaxe", 0);
		this.setStepSound(soundTypeGlass);
		this.setCreativeTab(Tab.WPtab);

	}
	    
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int par1, int par2){
		if (par2 > 15)
			par2 = 0;
		return paneTextures[par2];
	}

	@SideOnly(Side.CLIENT)
	public IIcon func_150104_b(int par1){
		if (par1 > 15)
			par1 = 0;
		return topPaneTextures[par1];
	}
	
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs tab, List list){
        for (int i = 0; i < 15; i++){
            list.add(new ItemStack(item, 1, i));
        }
    }

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister reg){
        for(int i = 0; i < 15; ++i){
        	paneTextures[i] = reg.registerIcon("wp:TintedGlassGreen-" + i);     
        }
        for(int j = 0; j < 15; ++j){	
        	topPaneTextures[j] = reg.registerIcon("wp:TintedPaneTopGreen-" + j);
        }
    }
	
    @Override
	public int damageDropped(int meta) {
		return meta;
    }

    public int quantityDropped(Random p_149745_1_)
    {
        return 1;
    }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return Item.getItemFromBlock(this);
    }
}