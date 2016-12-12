package Aarron.WallpaperCraft.blocks.clay;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import Aarron.WallpaperCraft.blockStates.BlockStates;
import Aarron.WallpaperCraft.blockStates.BlockTypes;
import Aarron.WallpaperCraft.blocks.IMetaBlock;


public class ClayRed extends IMetaBlock<BlockTypes> {

	public ClayRed() {
		super(Material.ROCK, "ClayRed");
		this.setSoundType(SoundType.STONE);
		this.setHardness(1.25F);
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