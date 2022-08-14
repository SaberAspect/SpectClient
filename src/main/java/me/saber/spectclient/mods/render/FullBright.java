package me.saber.spectclient.mods.render;

import me.saber.spectclient.mods.Category;
import me.saber.spectclient.mods.Mod;
import me.saber.spectclient.utils.Refs;
import org.lwjgl.input.Keyboard;

/**
 * @author SaberAspect
 * @since 8/14/22
 *
 * Basic Fullbright, does what the description says, add potion and gamma settings
 */
public class FullBright extends Mod {

    public FullBright() {
        super("FullBright", "Makes your game bright!", Category.RENDER);
        this.setKey(Keyboard.KEY_G);
    }

    private float oldGamma;
    @Override
    public void onEnable()
    {
        oldGamma = Refs.mc.gameSettings.gammaSetting;
        Refs.mc.gameSettings.gammaSetting = 100f;
    }
    @Override
    public void onDisable() {
        Refs.mc.gameSettings.gammaSetting = oldGamma;
    }



}
