package Aarron.WallpaperCraft.blocks.carpets.dotted;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import Aarron.WallpaperCraft.blockStates.BlockStates;
import Aarron.WallpaperCraft.blockStates.BlockTypes;
import Aarron.WallpaperCraft.blocks.IMetaBlock;


public class DottedCarpetPurple extends IMetaBlock<BlockTypes> {

	public DottedCarpetPurple() {
		super(Material.CLOTH, "DottedCarpetPurple");
		this.setSoundType(SoundType.CLOTH);
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