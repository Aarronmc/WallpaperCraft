package com.Aarron.WallpaperCraft.handler;

import org.lwjgl.input.Keyboard;

import com.Aarron.WallpaperCraft.network.MetaCycle;
import com.Aarron.WallpaperCraft.items.ItemSolidBlock;
import com.Aarron.WallpaperCraft.items.ItemSolidBlock2;
import com.Aarron.WallpaperCraft.items.ItemSolidBlock3;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.MouseEvent;


public class EventHandler {
	@SideOnly(Side.CLIENT)
	@SubscribeEvent
    public void onMouseEvent(MouseEvent event)
    {
      EntityPlayer entityPlayer = Minecraft.getMinecraft().thePlayer;
     
      {
        ItemStack itemStack = entityPlayer.getHeldItem();
        if ((Keyboard.isKeyDown(184)) || (Keyboard.isKeyDown(56)) || (Keyboard.isKeyDown(157)) || (Keyboard.isKeyDown(29)))
        {
        if ((itemStack != null) && ((itemStack.getItem() instanceof ItemSolidBlock)) || 
        		(itemStack != null) && ((itemStack.getItem()instanceof ItemSolidBlock2)) || 
        			(itemStack != null) && ((itemStack.getItem()instanceof ItemSolidBlock3)))
        {
          if (event.dwheel != 0) {
        	  PacketHandler.NETWORK_WRAPPER.sendToServer(new MetaCycle(event.dwheel > 0));
          }
          event.setCanceled(true);
        	}
        }
      }
    }   
}


