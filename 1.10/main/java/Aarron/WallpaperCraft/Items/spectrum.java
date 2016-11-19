/*

package Aarron.WallpaperCraft.Items;

import java.util.List;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import team.chisel.api.carving.ICarvingVariation;

public class spectrum extends Item {

    public spectrum() {
        setRegistryName("spectrum");
        setUnlocalizedName("spectrum");
        setContainerItem(this);
        GameRegistry.register(this);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
    
	@Override
	public void addInformation(ItemStack itemStack, EntityPlayer player, List tooltipLines, boolean advancedTooltips) {
		tooltipLines.add("Changes the colour of blocks");
	}
	
	
	
	//To be uncommented when the Chisel API updates to a verson with IChiselItem
	/*
    @Override
    public boolean canOpenGui(World world, EntityPlayer player, ItemStack chisel) {
        return false;
    }

    @Override
    public boolean onChisel(World world, ItemStack chisel, ICarvingVariation target) {
        return false;
    }

    @Override
    public boolean canChisel(World world, ItemStack chisel, ICarvingVariation target) {
        return false;
    }

    @Override
    public boolean canChiselBlock(World world, EntityPlayer player, int x, int y, int z, Block block, int metadata) {
        return true;
    }

	@Override
	public boolean hasModes(ItemStack chisel) {
		return false;
	}
	
}

*/