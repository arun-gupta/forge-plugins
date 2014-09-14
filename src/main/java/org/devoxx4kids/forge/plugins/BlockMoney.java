package org.devoxx4kids.forge.plugins;

import java.util.HashMap;

import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class BlockMoney {
	HashMap<String, Float> money = new HashMap();
	public static final float moneyToReward = 0.1f;
	
//	@SubscribeEvent
//	public void playerJoin(PlayerEvent.PlayerLoggedInEvent event) {
//		if (!money.containsKey(event.player.getGameProfile().getName())) {
//			money.put(event.player.getGameProfile().getName(), 0F);
//		}
//	}
	
	@SubscribeEvent
    public void init(EntityJoinWorldEvent event) {
    	if (!(event.entity instanceof EntityPlayer))
    		return;
    	
    	money.put(((EntityPlayer)event.entity).getGameProfile().getName(), 0F);
    }
	
	@SubscribeEvent
    public void placeOrBreakBlock(PlayerInteractEvent event) {
		if (event.action == PlayerInteractEvent.Action.RIGHT_CLICK_BLOCK ||
				event.action == PlayerInteractEvent.Action.LEFT_CLICK_BLOCK) {
			money.put(event.entityPlayer.getGameProfile().getName(), 
					money.get(event.entityPlayer.getGameProfile().getName()) + moneyToReward);
			
			event.entityPlayer.addChatMessage(new ChatComponentText(EnumChatFormatting.GOLD +
					"You now have " +
					EnumChatFormatting.GREEN +
					String.format("%.2f", money.get(event.entityPlayer))));
		}
    }

}
