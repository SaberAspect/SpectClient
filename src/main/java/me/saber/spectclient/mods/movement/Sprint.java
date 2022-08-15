package me.saber.spectclient.mods.movement;

import me.saber.spectclient.mods.Category;
import me.saber.spectclient.mods.Mod;
import me.saber.spectclient.utils.Refs;
import net.minecraft.potion.Potion;
import org.lwjgl.input.Keyboard;

import java.util.Objects;


/**
 * @author SaberAspect
 * @since 8/14/22
 *
 * A simple yet effective sprint module, add more stuff and making flashy plz
 */
public class Sprint extends Mod {
    public Sprint() {
        super("Sprint", "Allways sprint", Category.MOVEMENT);
        this.setKey(Keyboard.KEY_H);
    }


    @Override
    public void onUpdate()  {

        if(Refs.mc.player.isCreative()) {
            if(!Refs.mc.player.isPotionActive(Objects.requireNonNull(Potion.getPotionById(2))) || !Refs.mc.player.collided)
            {
                Refs.mc.player.setSprinting(true);

            }
        }
       else if(Refs.mc.player.getFoodStats().getFoodLevel() > 6 && Refs.mc.player.onGround &&  !Refs.mc.player.isPotionActive(Objects.requireNonNull(Potion.getPotionById(2))) &&
        !Refs.mc.player.collidedHorizontally && Refs.mc.player.lastTickPosX != Refs.mc.player.posX) {

            Refs.mc.player.setSprinting(true);
        }
    }
}
