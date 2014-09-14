package org.devoxx4kids.forge.plugins;

import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class PlayerLogged {
	@SubscribeEvent
    public void init(PlayerEvent.PlayerLoggedInEvent event) {
    	System.out.println(event.player.getGameProfile().getName() + " logged in");
    }

	@SubscribeEvent
    public void init(PlayerEvent.PlayerLoggedOutEvent event) {
    	System.out.println(event.player.getGameProfile().getName() + " logged out");
    }
}
