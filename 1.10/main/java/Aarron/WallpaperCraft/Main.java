package Aarron.WallpaperCraft;

import Aarron.WallpaperCraft.Proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;



	
	@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
	public class Main {


	    
	    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	    public static CommonProxy proxy;
	    

	    @Instance
	    public static Main instance = new Main();

	     
	    @EventHandler
	    public void preInit(FMLPreInitializationEvent event) {
	        this.proxy.preInit(event);
	                
	    }
	        
	    @EventHandler
	    public void init(FMLInitializationEvent event) {
	        this.proxy.init(event);
	                
	    }
	        
	    @EventHandler
	    public void postInit(FMLPostInitializationEvent event) {
	    	this.proxy.postInit(event);
	                
	    }
	}



