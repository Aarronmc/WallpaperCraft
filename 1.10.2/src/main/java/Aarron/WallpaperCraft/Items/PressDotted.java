package Aarron.WallpaperCraft.items;

import java.util.List;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;



public class PressDotted extends Item {

    public PressDotted() {
        setRegistryName("pressdotted");
        setUnlocalizedName("pressdotted");
        setContainerItem(this);
        GameRegistry.register(this);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
    
	@Override
	public void addInformation(ItemStack itemStack, EntityPlayer player, List tooltipLines, boolean advancedTooltips) {
		tooltipLines.add("Combine this with any solid colored block to apply the Dotted pattern.");
	}

}