package Aarron.WallpaperCraft.Init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;



public final class ModCreativeTabs
{
    private ModCreativeTabs () { }

    public static final CreativeTabs WPtab = new CreativeTabs("WPtab") {
        @SideOnly(Side.CLIENT)
		@Override public ItemStack getIconItemStack() {
			ItemStack iStack = new ItemStack(ModBlocks.SolidBlue, 1, 13);
			return iStack;
			}
        
        @Override
        public int getIconItemDamage () {
            return 1;
        }
        
		@Override
			public Item getTabIconItem() {
			return null;
		    }
	};
}