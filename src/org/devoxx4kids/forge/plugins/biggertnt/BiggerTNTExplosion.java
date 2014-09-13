package org.devoxx4kids.forge.plugins.biggertnt;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

@Mod(name = BiggerTNTExplosion.NAME, modid = BiggerTNTExplosion.MODID, version = BiggerTNTExplosion.VERSION)
public class BiggerTNTExplosion
{
    public static final String MODID = "biggertnt";
    public static final String VERSION = "1.0";
    public static final String NAME = "1.7.10";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	System.out.println(NAME + " mod loaded");
    	MinecraftForge.EVENT_BUS.register(this);
    }
    
    @SubscribeEvent
    public void init(EntityJoinWorldEvent event)
    {
    	if (!(event.entity instanceof EntityTNTPrimed))
    		return;
    	
//    	EntityItem splosion = new EntityItem(event.world,
//    			event.entity.posX,
//				event.entity.posY,
//				event.entity.posZ,
//				new ItemStack(Blocks.dirt,1,0));
//		event.world.spawnEntityInWorld(splosion);
		event.world.createExplosion(event.entity,
    			event.entity.posX,
				event.entity.posY,
				event.entity.posZ,
				25.0F, true);
//		event.world.removeEntity(splosion);
    }
    
}
