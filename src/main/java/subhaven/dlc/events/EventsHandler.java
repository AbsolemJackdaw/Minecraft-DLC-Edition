package subhaven.dlc.events;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class EventsHandler {

    @SubscribeEvent
    public static void unBreakableOres(PlayerEvent.BreakSpeed event) {
       Block block = event.getState().getBlock();

        if (block == Blocks.COAL_ORE || block == Blocks.REDSTONE_ORE || block == Blocks.LIT_REDSTONE_ORE || block == Blocks.LAPIS_ORE || block == Blocks.IRON_ORE || block == Blocks.GOLD_ORE ||block == Blocks.DIAMOND_ORE || block == Blocks.EMERALD_ORE || block == Blocks.QUARTZ_ORE){
            event.setCanceled(true);
        }
    }
}