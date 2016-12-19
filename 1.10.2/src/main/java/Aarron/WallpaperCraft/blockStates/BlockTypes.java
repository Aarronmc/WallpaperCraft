package Aarron.WallpaperCraft.blockStates;

import net.minecraft.item.EnumDyeColor;
import net.minecraft.util.IStringSerializable;
import Aarron.WallpaperCraft.blocks.IVariantDefinition;

public enum BlockTypes implements IStringSerializable, IVariantDefinition {
	Zero(0, "0"),
	One(1, "1"),
	Two(2, "2"),
	Three(3, "3"),
	Four(4, "4"),
	Five(5, "5"),
	Six(6, "6"),
	Seven(7, "7"),
	Eight(8, "8"),
	Nine(9, "9"),
	Ten(10, "10"),
	Eleven(11, "11"),
	Tweleve(12, "12"),
	Thirteen(13, "13"),
	Fourteen(14, "14");
	
	
	private final int meta;
	private final String name;
	
	private BlockTypes(int id, String name) {
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
	
	public static BlockTypes fromMeta(int meta) {
		for (BlockTypes type : BlockTypes.values()) {
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