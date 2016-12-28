package Aarron.WallpaperCraft.blocks.bricks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import Aarron.WallpaperCraft.blockStates.BlockStates;
import Aarron.WallpaperCraft.blockStates.BlockTypes;
import Aarron.WallpaperCraft.blocks.IMetaBlock;
import Aarron.WallpaperCraft.blocks.IVariantDefinition;


public class BrickBlue extends IMetaBlock<BlockTypes>  {

	public BrickBlue() {
		super(Material.ROCK, "brickblue");
		this.setSoundType(SoundType.STONE);
		this.setHardness(2.0F);
		
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