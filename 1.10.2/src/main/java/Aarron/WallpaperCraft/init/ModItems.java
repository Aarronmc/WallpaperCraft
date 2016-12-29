package Aarron.WallpaperCraft.init;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import Aarron.WallpaperCraft.items.*;



public class ModItems {

    //public static spectrum spectrum;
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
	public static PressFancyTiles PressFancyTiles;
	public static PressStamp PressStamp;
	public static PressJewel PressJewel;
	public static PressWoodPlank PressWoodPlank;
	public static PressWool PressWool;
	public static PressCheckered PressCheckered;
	public static PressAuraLamp PressAuraLamp;
	


    public static void init() {
    	//spectrum = new spectrum();
    	PressBlank = new PressBlank();
    	PressDiagonallyDotted = new PressDiagonallyDotted();
    	PressDotted = new PressDotted();
    	PressStriped = new PressStriped();
    	PressFloral = new PressFloral();
    	PressDamask = new PressDamask();
    	PressClay = new PressClay();
    	PressTintedGlass = new PressTintedGlass();
    	PressTexturedGlass = new PressTexturedGlass();
    	PressFrostedGlass = new PressFrostedGlass();
    	PressBrick = new PressBrick();
    	PressStoneBrick = new PressStoneBrick();
    	PressStoneLamp = new PressStoneLamp();
    	PressRippled = new PressRippled();
    	PressFancyTiles = new PressFancyTiles();
    	PressStamp = new PressStamp();
    	PressJewel = new PressJewel();
    	PressWoodPlank = new PressWoodPlank();
    	PressWool = new PressWool();
    	PressCheckered = new PressCheckered();
    	PressAuraLamp = new PressAuraLamp();

    	
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
    	//spectrum.initModel();
    	PressBlank.initModel();
    	PressDiagonallyDotted.initModel();   	
    	PressDotted.initModel();
    	PressStriped.initModel();
    	PressFloral.initModel();
    	PressDamask.initModel();
    	PressClay.initModel();
    	PressTintedGlass.initModel();
    	PressTexturedGlass.initModel();
    	PressFrostedGlass.initModel();
    	PressBrick.initModel();
    	PressStoneBrick.initModel();
    	PressStoneLamp.initModel();
    	PressRippled.initModel();
    	PressFancyTiles.initModel();
    	PressStamp.initModel();
    	PressJewel.initModel();
    	PressWoodPlank.initModel();
     	PressWool.initModel();
    	PressCheckered.initModel();
    	PressAuraLamp.initModel();
    	
    	
    }

}