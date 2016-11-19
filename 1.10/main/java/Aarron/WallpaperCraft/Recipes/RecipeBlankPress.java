package package Aarron.WallpaperCraft.Recipes;

import java.util.List;

import net.minecraft.block.*;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.*;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.oredict.OreDictionary;

import Aarron.WallpaperCraft.Init.ModItems;

public class RecipeBlankPress implements IRecipe {

	@Override
	public boolean matches(InventoryCrafting inv, World worldIn) {
		int axeCount = 0;
		int plankCount = 0;
		for (int i = 0; i < inv.getSizeInventory(); ++i) {
			if (inv.getStackInSlot(i) == null) {
				continue;
			}
			if (inv.getStackInSlot(i).getItem() instanceof ItemAxe) {
				axeCount++;
			}

			if (Block.getBlockFromItem(inv.getStackInSlot(i).getItem()) instanceof BlockPlanks) {
				plankCount++;
			}
		}
		List<ItemStack> list = OreDictionary.getOres("plankWood");
		return axeCount == 1 && plankCount == 1;
	}

	@Override
	public ItemStack getCraftingResult(InventoryCrafting inv) {
		ItemStack axeStack = null;
		ItemStack plankStack = null;
		int axeCount = 0;
		int plankCount = 0;

		// First we get the axe and ensure there is only one axe in the grid
		for (int i = 0; i < inv.getSizeInventory(); ++i) {
			if (inv.getStackInSlot(i) != null && inv.getStackInSlot(i).getItem() instanceof ItemAxe) {
				axeCount++;
				if (axeCount > 1) {
					return null;
				}
				axeStack = inv.getStackInSlot(i);
			}
		}

		// Now we ensure there is only 1 stack of planks in the grid
		for (int i = 0; i < inv.getSizeInventory(); ++i) {
			if (inv.getStackInSlot(i) != null && Block.getBlockFromItem(inv.getStackInSlot(i).getItem()) instanceof BlockPlanks) {
				plankCount++;
				if (plankCount > 1) {
					return null;
				}
				plankStack = inv.getStackInSlot(i);
			}
		}

		// ensure we have at least 1 axe and 1 plank
		if (axeStack == null || plankStack == null) {
			return null;
		}

		return new ItemStack(ModItems.PressBlank, 4);
	}

	@Override
	public int getRecipeSize() {
		return 2;
	}

	@Override
	public ItemStack getRecipeOutput() {
		return null;
	}

	@Override
	public ItemStack[] getRemainingItems(InventoryCrafting inv) {
		ItemStack[] remainingItems = new ItemStack[inv.getSizeInventory()];
		ItemStack axeStack = null;
		ItemStack newStack = null;
		ItemStack plankStack = null;
		for (int i = 0; i < inv.getSizeInventory(); ++i) {
			if (inv.getStackInSlot(i) != null && inv.getStackInSlot(i).getItem() instanceof ItemAxe) {
				axeStack = inv.getStackInSlot(i);
				int currentDamage = axeStack.getItemDamage();
				int maxDamage = axeStack.getMaxDamage();
				if (currentDamage + 1 < maxDamage) {
					newStack = axeStack.copy();
					newStack.setItemDamage(currentDamage + 1);
					remainingItems[i] = newStack;
				}
				else {
					axeStack = null;
				}
			}
			if (inv.getStackInSlot(i) != null && OreDictionary.getOres("plankWood").contains(inv.getStackInSlot(i).getItem())) {
				plankStack = inv.getStackInSlot(i);
				if (plankStack.stackSize > 1) {
					plankStack.stackSize--;
					remainingItems[i] = plankStack;
				}
				else {
					plankStack = null;
				}
			}
		}
		if (newStack == null && plankStack == null) {
			remainingItems = null;
		}
		return remainingItems != null ? remainingItems : ForgeHooks.defaultRecipeGetRemainingItems(inv);
	}

}
