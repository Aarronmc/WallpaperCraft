package Aarron.WallpaperCraft.Blocks.Bricks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import Aarron.WallpaperCraft.BlockStates.BlockStates;
import Aarron.WallpaperCraft.BlockStates.BlockTypes;
import Aarron.WallpaperCraft.Blocks.MetaBlock;


public class BrickBlue extends MetaBlock<BlockTypes> {

	public BrickBlue() {
		super(Material.ROCK, "BrickBlue");
		this.setSoundType(SoundType.STONE);
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