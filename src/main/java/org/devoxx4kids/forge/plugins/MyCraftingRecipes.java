package org.devoxx4kids.forge.plugins;

import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class MyCraftingRecipes {
	public static IRecipe obsidian() {
		return new ShapedOreRecipe(new ItemStack(Blocks.obsidian), 
				new Object[]{
            "AAA",
            "AAA",
            "AAA",
            'A', Items.cookie
		});
	}
	
	public static IRecipe fourApples() {
		return new ShapedOreRecipe(new ItemStack(Items.apple, 4), new Object[]{
	        "AA",
	        "AA",
	        'A', Blocks.cobblestone
		});
	}
	
	public static IRecipe dye() {
		return new ShapedOreRecipe(new ItemStack(Items.dye, 2, 15), new Object[]{
	        "AB ",
	        "AAC",
	        "A  ",
	        'A', Items.cookie, 'B', Blocks.dirt, 'C', new ItemStack(Items.dye, 1, 1)
		});
	}

	public static IRecipe redWool() {
		return new ShapelessOreRecipe(new ItemStack(Items.dye, 2, 1), new Object[] {
         new ItemStack(Items.dye, 1, 1), Items.redstone
		});
	}
	
	public static IRecipe netherStar() {
		return new ShapedOreRecipe(new ItemStack(Items.apple, 1), new Object[]{
	        "DED",
	        "LNL",
	        "DED",
	        'D', Blocks.diamond_block,
	        'E', Blocks.emerald_block,
	        'L', Blocks.lapis_block,
	        'N', Blocks.redstone_block
		});
	}
	
	public static IRecipe diamond() {
		return new ShapelessOreRecipe(new ItemStack(Items.diamond, 1), 
				new ItemStack(Blocks.grass, 5),
				new ItemStack(Blocks.dirt, 3),
				new ItemStack(Items.paper, 3));
	}
}
