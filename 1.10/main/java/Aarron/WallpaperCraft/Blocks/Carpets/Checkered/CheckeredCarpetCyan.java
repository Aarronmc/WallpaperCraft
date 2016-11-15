package Aarron.WallpaperCraft.Blocks.Carpets.Checkered;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import Aarron.WallpaperCraft.BlockStates.BlockStates;
import Aarron.WallpaperCraft.BlockStates.BlockTypes2;
import Aarron.WallpaperCraft.Blocks.MetaBlock;


public class CheckeredCarpetCyan extends MetaBlock<BlockTypes2> {

	public CheckeredCarpetCyan() {
		super(Material.ROCK, "CheckeredCarpetCyan");
		this.setSoundType(SoundType.STONE);
	}

	@Override
	protected BlockTypes2 getDefaultStateVariant() {
		return BlockTypes2.Zero;
	}

	@Override
	protected BlockTypes2 fromMeta(int meta) {
		return BlockTypes2.fromMeta(meta);
	}

	@Override
	protected PropertyEnum<BlockTypes2> getVariantEnum() {
		return BlockStates.WPblocks2;
	}
}