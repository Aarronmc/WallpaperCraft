package com.Aarron.WallpaperCraft.blocks.glass.panes;

import java.util.List;

import net.minecraft.block.BlockStainedGlassPane;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import com.Aarron.WallpaperCraft.creativeTab.Tab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TexturedPaneRed extends BlockStainedGlassPane
{
	private static final IIcon[] paneTextures = new IIcon[15];
    private static final IIcon[] topPaneTextures = new IIcon[15];
    
	public TexturedPaneRed() {
		super();
		this.setBlockName("TexturedPaneRed");
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
        	paneTextures[i] = reg.registerIcon("wp:TexturedGlassRed-" + i);     
        }
        for(int j = 0; j < 15; ++j){	
        	topPaneTextures[j] = reg.registerIcon("wp:TexturedPaneTopRed-" + j);
        }
    }
	
    @Override
	public int damageDropped(int meta) {
		return meta;
    }
}