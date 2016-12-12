package Aarron.WallpaperCraft.init;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import Aarron.WallpaperCraft.handler.ConfigHandler;
import Aarron.WallpaperCraft.items.*;



public class ModItems {

    //public static spectrum spectrum;
	public static PressBlank PressBlank;
	public static PressDiagonallyDotted PressDiagonallyDotted;
	public static PressDotted PressDotted;
	public static PressStriped PressStriped;
	public static PressFloral PressFloral;
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
	


    public static void init() {
    	//spectrum = new spectrum();
    	PressBlank = new PressBlank();
    	PressDiagonallyDotted = new PressDiagonallyDotted();
    	PressDotted = new PressDotted();
    	PressStriped = new PressStriped();
    	PressFloral = new PressFloral();
    	PressClay = new PressClay();
    	PressTintedGlass = new PressTintedGlass();
    	PressTexturedGlass = new PressTexturedGlass();
    	PressFrostedGlass = new PressFrostedGlass();
    	PressBrick = new PressBrick();
    	PressStoneBrick = new PressStoneBrick();
    	PressStoneLamp = new PressStoneLamp();
    	PressRippled = new PressRippled();
    	PressStamp = new PressStamp();
    	PressWoodPlank = new PressWoodPlank();
    	PressWool = new PressWool();
    	PressCheckered = new PressCheckered();

    	
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
    	//spectrum.initModel();
    	PressBlank.initModel();
    	PressDiagonallyDotted.initModel();   	
    	PressDotted.initModel();
    	PressStriped.initModel();
    	PressFloral.initModel();
    	PressClay.initModel();
    	PressTintedGlass.initModel();
    	PressTexturedGlass.initModel();
    	PressFrostedGlass.initModel();
    	PressBrick.initModel();
    	PressStoneBrick.initModel();
    	PressStoneLamp.initModel();
    	PressRippled.initModel();
    	PressStamp.initModel();
    	PressWoodPlank.initModel();
     	PressWool.initModel();
    	PressCheckered.initModel();
    	
    	
    }

}