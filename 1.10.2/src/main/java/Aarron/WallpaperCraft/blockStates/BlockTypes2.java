package Aarron.WallpaperCraft.blockStates;

import net.minecraft.util.IStringSerializable;
import Aarron.WallpaperCraft.blocks.IVariantDefinition;

public enum BlockTypes2 implements IStringSerializable, IVariantDefinition {
	Zero(0, "0"),
	One(1, "1"),
	Two(2, "2"),
	Three(3, "3"),
	Four(4, "4"),
	Five(5, "5"),
	Six(6, "6"),
	Seven(7, "7"),
	Eight(8, "8"),
	Nine(9, "9");
	
	private final int meta;
	private final String name;
	
	private BlockTypes2(int id, String name) {
		this.meta = id;
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}
	
	public int getMeta() {
		return meta;
	}
	
	public static BlockTypes2 fromMeta(int meta) {
		for (BlockTypes2 type : BlockTypes2.values()) {
			if (type.getMeta() == meta) {
				return type;
			}
		}
		
		throw new IllegalArgumentException("meta cannot be " + meta);
	}

	@Override
	public String getVariantName() {
		return "type";
	}
}