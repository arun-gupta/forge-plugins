package org.devoxx4kids.forge.plugins;

import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class BiggerTNTExplosion {
	@SubscribeEvent
    public void init(EntityJoinWorldEvent event) {
    	if (!(event.entity instanceof EntityTNTPrimed))
    		return;
    	
		event.world.createExplosion(event.entity,
    			event.entity.posX,
				event.entity.posY,
				event.entity.posZ,
				25.0F, true);
    }
}
