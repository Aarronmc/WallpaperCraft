package Aarron.WallpaperCraft.init;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import Aarron.WallpaperCraft.items.*;



public class ModItems {

    //public static spectrum spectrum;
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
	


    public static void init() {
    	//spectrum = new spectrum();
    	PressBlank = new PressBlank();
    	PressBrick = new PressBrick();
    	PressCheckered = new PressCheckered();
    	PressClay = new PressClay();
    	PressDiagonallyDotted = new PressDiagonallyDotted();
    	PressDotted = new PressDotted();
    	PressFloral = new PressFloral();
    	PressStriped = new PressStriped();
    	PressFrostedGlass = new PressFrostedGlass();
    	PressTexturedGlass = new PressTexturedGlass();
    	PressTintedGlass = new PressTintedGlass();


    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
    	//spectrum.initModel();
    	PressBlank.initModel();
    	PressBrick.initModel();
    	PressCheckered.initModel();
    	PressClay.initModel();
    	PressDiagonallyDotted.initModel();
    	PressDotted.initModel();
    	PressFloral.initModel();
    	PressStriped.initModel();
    	PressFrostedGlass.initModel();
    	PressTexturedGlass.initModel();
    	PressTintedGlass.initModel();


    }

}