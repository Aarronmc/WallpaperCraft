package Aarron.WallpaperCraft.network;

import Aarron.WallpaperCraft.blockStates.BlockTypes;
import Aarron.WallpaperCraft.blockStates.BlockTypes2;
import Aarron.WallpaperCraft.blocks.ItemBlockMeta;
import Aarron.WallpaperCraft.blocks.ItemBlockMeta2;
import Aarron.WallpaperCraft.blocks.ItemBlockMeta3;
import io.netty.buffer.ByteBuf;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class MetaCycle implements IMessage {

    public boolean increment;

    public MetaCycle() {

    }

    public MetaCycle(boolean increment) {
        this.increment = increment;
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        this.increment = buf.readBoolean();
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeBoolean(increment);
    }

    public static class Handler implements  IMessageHandler<MetaCycle, IMessage> {
        @Override
        public IMessage onMessage(MetaCycle message, MessageContext ctx) {
            ItemStack held = ctx.getServerHandler().playerEntity.getHeldItemMainhand();
            if (held.getItem() instanceof ItemBlockMeta) {
                int damage = held.getItemDamage();
                held.setItemDamage(MathHelper.clamp_int(damage + (message.increment ? -1 : 1), 0, 14));
                if (damage == held.getItemDamage()) {
                    if (held.getItemDamage() == 0)
                        held.setItemDamage(14);
                    else if (held.getItemDamage() == 14)
                        held.setItemDamage(0);
                	}
            	}
            if (held.getItem() instanceof ItemBlockMeta2) {
                int damage = held.getItemDamage();
                held.setItemDamage(MathHelper.clamp_int(damage + (message.increment ? -1 : 1), 0, 9));
                if (damage == held.getItemDamage()) {
                    if (held.getItemDamage() == 0)
                        held.setItemDamage(9);
                    else if (held.getItemDamage() == 9)
                        held.setItemDamage(0);
                	}
            	}
            if (held.getItem() instanceof ItemBlockMeta3) {
                int damage = held.getItemDamage();
                held.setItemDamage(MathHelper.clamp_int(damage + (message.increment ? -1 : 1), 0, 15));
                if (damage == held.getItemDamage()) {
                    if (held.getItemDamage() == 0)
                        held.setItemDamage(15);
                    else if (held.getItemDamage() == 15)
                        held.setItemDamage(0);
                	}
            	}
            
            return null;
        
            }
        }
    }
