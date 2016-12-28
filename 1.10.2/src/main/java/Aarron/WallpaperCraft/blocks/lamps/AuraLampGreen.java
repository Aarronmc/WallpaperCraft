package Aarron.WallpaperCraft.blocks.lamps;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import Aarron.WallpaperCraft.blockStates.BlockStates;
import Aarron.WallpaperCraft.blockStates.BlockTypes;
import Aarron.WallpaperCraft.blocks.IMetaBlock;


public class AuraLampGreen extends IMetaBlock<BlockTypes> {

	public AuraLampGreen() {
		super(Material.ROCK, "auralampgreen");
		this.setSoundType(SoundType.GLASS);
		this.setHardness(1.5F);
		this.setLightLevel(1.0F);
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