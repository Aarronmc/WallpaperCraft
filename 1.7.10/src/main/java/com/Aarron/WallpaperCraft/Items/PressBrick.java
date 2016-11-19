package com.Aarron.WallpaperCraft.Items;

import java.util.List;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraftforge.client.IItemRenderer;

import com.Aarron.WallpaperCraft.CreativeTab.Tab;


	public class PressBrick extends Item {
		public PressBrick() {
			setUnlocalizedName("PressBrick");
			setTextureName("wp:pressbrick");
			setContainerItem(this);
			setCreativeTab(Tab.WPtab);
		}

		@Override
		public void addInformation(ItemStack itemStack, EntityPlayer player, List tooltipLines, boolean advancedTooltips) {
			tooltipLines.add("Changes the patern on blocks");
		
		}
		

	
}


