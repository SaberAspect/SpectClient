package me.saber.spectclient.mods.movement;

import me.saber.spectclient.mods.Category;
import me.saber.spectclient.mods.Mod;
import me.saber.spectclient.utils.Refs;
import org.lwjgl.input.Keyboard;

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
    public void onUpdate()
    {

        Refs.mc.player.setSprinting(true);
    }

}
