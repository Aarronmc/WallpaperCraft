package com.Aarron.WallpaperCraft.blocks;

import java.util.List;

import com.Aarron.WallpaperCraft.Main;
import com.Aarron.WallpaperCraft.creativeTab.Tab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.block.Block;

public class TestCarpet extends Block {

public IIcon[] icons = new IIcon[15];

	public TestCarpet(String unlocalizedName, Material material) {
		super(material);
		this.setBlockName("TestCarpet");
		this.setHardness(1.25F);
		this.setResistance(6.0F);
		this.setHarvestLevel("pickaxe", 0);
		this.setStepSound(soundTypeWood);
		this.setCreativeTab(Tab.WPtab);
	}
	
	
    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess world, int x, int y, int z, int face)
    {
        return face == 1 ? true : super.shouldSideBeRendered(world, x, y, z, face);
    }
    
    
    // Can this block stay at this position.  Similar to canPlaceBlockAt except gets checked often with plants.
    public boolean canBlockStay(World world, int x, int y, int z)
    {
        return !world.isAirBlock(x, y - 1, z);
    }
    
    /**
     * Sets the block's bounds for rendering it as an item
     */
    public void setBlockBoundsForItemRender()
    {
        this.func_150089_b(0);
    }
    
    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor Block
     */
    public void onNeighborBlockChange(World world, int x, int y, int z, Block face)
    {
        this.func_150090_e(world, x, y, z);
    }

    private boolean func_150090_e(World world, int x, int y, int z)
    {
        if (!this.canBlockStay(world, x, y, z))
        {
            this.dropBlockAsItem(world, x, y, z, world.getBlockMetadata(x, y, z), 0);
            world.setBlockToAir(x, y, z);
            return false;
        }
        else
        {
            return true;
        }
    }
    
    /**
     * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z
     */
    public boolean canPlaceBlockAt(World wolrd, int x, int y, int z)
    {
        return super.canPlaceBlockAt(wolrd, x, y, z) && this.canBlockStay(wolrd, x, y, z);
    }
    
    /**
     * Updates the blocks bounds based on its current state. Args: world, x, y, z
     */
    public void setBlockBoundsBasedOnState(IBlockAccess world, int x, int y, int z)
    {
        this.func_150089_b(world.getBlockMetadata(x, y, z));
    }

    protected void func_150089_b(int p_150089_1_)
    {
        byte b0 = 0;
        float f = (float)(1 * (1 + b0)) / 16.0F;
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, f, 1.0F);
    }
    
    public boolean renderAsNormalBlock()
    {
        return false;
    }
    
    public boolean isOpaqueCube()
    {
        return false;
    }
    
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z)
    {
        byte b0 = 0;
        float f = 0.0625F;
        return AxisAlignedBB.getBoundingBox((double)x + this.minX, (double)y + this.minY, (double)z + this.minZ, (double)x + this.maxX, (double)((float)y + (float)b0 * f), (double)z + this.maxZ);
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
			this.icons[i] = reg.registerIcon("wp:DiagonallyDottedBlue-" + i);
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