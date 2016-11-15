package Aarron.WallpaperCraft.Blocks.Solid;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import Aarron.WallpaperCraft.BlockStates.BlockStates;
import Aarron.WallpaperCraft.BlockStates.BlockTypes;
import Aarron.WallpaperCraft.Blocks.MetaBlock;


public class SolidBrown extends MetaBlock<BlockTypes> {

	public SolidBrown() {
		super(Material.WOOD, "SolidBrown");
		this.setSoundType(SoundType.WOOD);
	}

	@Override
	protected BlockTypes getDefaultStateVariant() {
		return BlockTypes.Zero;
	}

	@Override
	protected BlockTypes fromMeta(int meta) {
		return BlockTypes.fromMeta(meta);
	}

	@Override
	protected PropertyEnum<BlockTypes> getVariantEnum() {
		return BlockStates.WPblocks;
	}
}