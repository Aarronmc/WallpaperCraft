
package com.Aarron.WallpaperCraft.init;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

import com.Aarron.WallpaperCraft.creativeTab.Tab;
import com.Aarron.WallpaperCraft.handler.ConfigHandler;
import com.Aarron.WallpaperCraft.items.*;

public final class ModItems {
	
	
	public static PressBlank PressBlank;
	public static PressDiagonallyDotted PressDiagonallyDotted;
	public static PressDotted PressDotted;
	public static PressStriped PressStriped;
	public static PressFloral PressFloral;
	public static PressDamask PressDamask;
	public static PressClay PressClay;
	public static PressTintedGlass PressTintedGlass;
	public static PressTexturedGlass PressTexturedGlass;
	public static PressFrostedGlass PressFrostedGlass;
	public static PressBrick PressBrick;
	public static PressStoneBrick PressStoneBrick;
	public static PressStoneLamp PressStoneLamp;
	public static PressRippled PressRippled;
	public static PressStamp PressStamp;
	public static PressWoodPlank PressWoodPlank;
	public static PressWool PressWool;
	public static PressCheckered PressCheckered;
	//public static Spectrum spectrum;
	
	



	public static void registerItems() {
		PressBlank = registerItem(new PressBlank());
		PressDiagonallyDotted = registerItem(new PressDiagonallyDotted());
		PressDotted = registerItem(new PressDotted());
		PressStriped = registerItem(new PressStriped());
		PressFloral = registerItem(new PressFloral());
		PressDamask = registerItem(new PressDamask());
		PressClay = registerItem(new PressClay());
		PressTintedGlass = registerItem(new PressTintedGlass());
		PressTexturedGlass = registerItem(new PressTexturedGlass());
		PressFrostedGlass = registerItem(new PressFrostedGlass());
		PressBrick = registerItem(new PressBrick());
		PressStoneBrick = registerItem(new PressStoneBrick());
		PressStoneLamp = registerItem(new PressStoneLamp());
		PressRippled = registerItem(new PressRippled());
		PressStamp = registerItem(new PressStamp());
		PressWoodPlank = registerItem(new PressWoodPlank());
		PressWool = registerItem(new PressWool());
		PressCheckered = registerItem(new PressCheckered());
		//spectrum = registerItem(new Spectrum());
		
		

	}

	private static <T extends Item> T registerItem(T item) {
		GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
		return item;
	}
}

