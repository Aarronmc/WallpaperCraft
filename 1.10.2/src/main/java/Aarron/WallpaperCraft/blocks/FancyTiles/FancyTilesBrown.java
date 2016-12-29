package Aarron.WallpaperCraft.blocks.FancyTiles;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import Aarron.WallpaperCraft.blockStates.BlockStates;
import Aarron.WallpaperCraft.blockStates.BlockTypes;
import Aarron.WallpaperCraft.blocks.IMetaBlock;


public class FancyTilesBrown extends IMetaBlock<BlockTypes> {

	public FancyTilesBrown() {
		super(Material.ROCK, "fancytilesbrown");
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