package org.devoxx4kids.forge.plugins;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(name = MyMod.NAME, modid = MyMod.MODID, version = MyMod.VERSION)
public class MyMod {
    public static final String MODID = "mymod";
    public static final String VERSION = "1.0";
    public static final String NAME = "1.7.10";
    
    @EventHandler
    public void preinit(FMLPreInitializationEvent event) {
    	GameRegistry.addRecipe(MyCraftingRecipes.obsidian());
    	GameRegistry.addRecipe(MyCraftingRecipes.fourApples());
    	GameRegistry.addRecipe(MyCraftingRecipes.dye());
    	GameRegistry.addRecipe(MyCraftingRecipes.netherStar());
    	GameRegistry.addRecipe(MyCraftingRecipes.diamond());
    	
    	GameRegistry.addSmelting(new ItemStack(Items.egg, 1), 
    			new ItemStack(Blocks.dragon_egg, 2), 
    			2.0f);
    	GameRegistry.addSmelting(new ItemStack(Blocks.stone_stairs, 1), 
    			new ItemStack(Blocks.stone, 10), 
    			2.0f);
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
    	System.out.println(NAME + " mod loaded");
//    	MinecraftForge.EVENT_BUS.register(new BiggerTNTExplosion());
//    	MinecraftForge.EVENT_BUS.register(new ZombieDiamonds());
//    	MinecraftForge.EVENT_BUS.register(new PlayerLogged());
    	MinecraftForge.EVENT_BUS.register(new BlockMoney());
    }
}
