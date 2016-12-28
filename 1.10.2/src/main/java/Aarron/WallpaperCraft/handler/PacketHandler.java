package Aarron.WallpaperCraft.handler;

import Aarron.WallpaperCraft.network.MetaCycle;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

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