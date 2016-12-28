package com.Aarron.WallpaperCraft.handler;

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;
import com.Aarron.WallpaperCraft.network.MetaCycle;


public class PacketHandler {
    private static int packetId = 0;

    public static SimpleNetworkWrapper NETWORK_WRAPPER = null;

    public PacketHandler() {
    }

    public static int nextID() {
        return packetId++;
    }

    public static void registerMessages(String channelName) {
    	NETWORK_WRAPPER = NetworkRegistry.INSTANCE.newSimpleChannel(channelName);
        registerMessages();
    }

    public static void registerMessages() {
        // Register messages which are sent from the client to the server here:
    	NETWORK_WRAPPER.registerMessage(MetaCycle.Handler.class, MetaCycle .class, nextID(), Side.SERVER);
    }
}