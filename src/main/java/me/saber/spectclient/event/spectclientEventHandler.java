package me.saber.spectclient.event;

import me.saber.spectclient.Client;
import me.saber.spectclient.utils.Refs;
import net.minecraft.client.gui.GuiChat;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import org.lwjgl.input.Keyboard;

/**
 * @author SaberAspect
 * @since 8/11/22
 *
 */
@Mod.EventBusSubscriber()
public class spectclientEventHandler {


    //Test event don't need this
    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void pickupItem(EntityItemPickupEvent event)
    {
        System.out.println("Item picked up!");
    }
    //Update event, used with onUpdate so that modules get updated every tick
    @SubscribeEvent(priority = EventPriority.HIGH)
    public static void onTick(TickEvent.ClientTickEvent event)
    {
        if(Refs.nullCheck()) {
            return;
        }
        Client.modManager.update();
    }
    /*
    Key event, loops through all modules in the array and checks if they are toggled,
    if so, we get the current key press and compare it to the getKey of that module
     */
    @SubscribeEvent(priority = EventPriority.HIGH)
    public static void key(InputEvent.KeyInputEvent event)
    {
        if(!Refs.nullCheck())
        {
            try
            {
                if(Keyboard.isCreated())
                {
                    if(Keyboard.getEventKeyState())
                    {
                        int code = Keyboard.getEventKey();
                        if(code <=0)
                            return;
                        for(me.saber.spectclient.mods.Mod m : Client.modManager.modules)
                        {
                            if(m.isToggled())
                                m.onKeyPress();
                            if(m.getKey() == code)
                            {
                                m.toggle();
                                return;
                            }
                        }
                        if(code == Keyboard.KEY_PERIOD)
                        {
                            Refs.mc.displayGuiScreen(new GuiChat("."));
                        }
                    }
                }
            }catch (Exception e)
            {
                e.printStackTrace();
            }

        }
    }
}
