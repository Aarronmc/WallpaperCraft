package com.Aarron.WallpaperCraft.Items;

import java.util.List;

import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.IItemRenderer.ItemRenderType;
import net.minecraftforge.client.IItemRenderer.ItemRendererHelper;

import org.lwjgl.opengl.GL11;

import com.Aarron.WallpaperCraft.CreativeTab.Tab;

	public class PressFrostedGlass extends Item implements IItemRenderer{
		public PressFrostedGlass() {
			setUnlocalizedName("PressFrostedGlass");
			setTextureName("wp:pressfrostedglass");
			setContainerItem(this);
			setCreativeTab(Tab.WPtab);
		}

		@Override
		public void addInformation(ItemStack itemStack, EntityPlayer player, List tooltipLines, boolean advancedTooltips) {
			tooltipLines.add("Changes the patern on blocks");
		
		}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		return type != ItemRenderType.INVENTORY;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
		return helper == ItemRendererHelper.ENTITY_BOBBING || helper == ItemRendererHelper.ENTITY_ROTATION;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		IIcon icon = item.getIconIndex();
		Tessellator tessellator = Tessellator.instance;
		
		GL11.glPushMatrix();
		
		if (type == ItemRenderType.ENTITY) {
			GL11.glTranslatef(-0.5F, -0.25F, 0.0F);
	    }
		
		GL11.glEnable(GL11.GL_BLEND);
		ItemRenderer.renderItemIn2D(tessellator, icon.getMaxU(), icon.getMinV(), icon.getMinU(), icon.getMaxV(), icon.getIconWidth(), icon.getIconHeight(), 0.0625F);
		GL11.glDisable(GL11.GL_BLEND);
		
		GL11.glPopMatrix();
	}
	
}