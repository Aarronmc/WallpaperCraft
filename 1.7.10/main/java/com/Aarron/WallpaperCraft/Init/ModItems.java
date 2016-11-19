
package com.Aarron.WallpaperCraft.Init;

import net.minecraft.item.Item;
import com.Aarron.WallpaperCraft.CreativeTab.Tab;
import cpw.mods.fml.common.registry.GameRegistry;
import com.Aarron.WallpaperCraft.Items.*;

public final class ModItems {
	
	
	public static PressBlank PressBlank;
	public static PressBrick PressBrick;
	public static PressCheckered PressCheckered;
	public static PressClay PressClay;
	public static PressDiagonallyDotted PressDiagonallyDotted;
	public static PressDotted PressDotted;
	public static PressFloral PressFloral;
	public static PressStriped PressStriped;
	public static PressFrostedGlass PressFrostedGlass;
	public static PressTexturedGlass PressTexturedGlass;
	public static PressTintedGlass PressTintedGlass;
	//public static Spectrum spectrum;
	
	



	public static void registerItems() {
		PressBlank = registerItem(new PressBlank());
		PressBrick = registerItem(new PressBrick());
		PressCheckered = registerItem(new PressCheckered());
		PressClay = registerItem(new PressClay());
		PressDiagonallyDotted = registerItem(new PressDiagonallyDotted());
		PressDotted = registerItem(new PressDotted());
		PressFloral = registerItem(new PressFloral());
		PressStriped = registerItem(new PressStriped());
		PressFrostedGlass = registerItem(new PressFrostedGlass());
		PressTexturedGlass = registerItem(new PressTexturedGlass());
		PressTintedGlass = registerItem(new PressTintedGlass());
		//spectrum = registerItem(new Spectrum());
		
		

	}

	private static <T extends Item> T registerItem(T item) {
		GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
		return item;
	}
}

