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

public class TintedPaneCyan extends BlockStainedGlassPane
{
	private static final IIcon[] paneTextures = new IIcon[10];
    private static final IIcon[] topPaneTextures = new IIcon[10];
    
	public TintedPaneCyan() {
		super();
		this.setBlockName("TintedPaneCyan");
		this.setHardness(0.3F);
		this.setResistance(6.0F);
		this.setHarvestLevel("pickaxe", 0);
		this.setStepSound(soundTypeGlass);
		this.setCreativeTab(Tab.WPtab);

	}
	    
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int par1, int par2){
		if (par2 > 9)
			par2 = 0;
		return paneTextures[par2];
	}

	@SideOnly(Side.CLIENT)
	public IIcon func_150104_b(int par1){
		if (par1 > 9)
			par1 = 0;
		return topPaneTextures[par1];
	}
	
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs tab, List list){
        for (int i = 0; i < 10; i++){
            list.add(new ItemStack(item, 1, i));
        }
    }

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister reg){
        for(int i = 0; i < 10; ++i){
        	paneTextures[i] = reg.registerIcon("wp:TintedGlassCyan-" + i);     
        }
        for(int j = 0; j < 10; ++j){	
        	topPaneTextures[j] = reg.registerIcon("wp:TintedPaneTopCyan-" + j);
        }
    }
	
    @Override
	public int damageDropped(int meta) {
		return meta;
    }
}