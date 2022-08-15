package me.saber.spectclient.utils;

import net.minecraft.client.Minecraft;

/**
 * @author SaberAspect
 * @since 8/11/22
 *
 */
public class Refs {

    //Basic client specifications
    public static final String MODID = "spc";
    public static final String NAME = "SpectClient";
    public static final String VERSION = "1.0";
    public static final boolean CLIENTSIDE = true;
    public static final String ACCEPTEDVERSION = "1.12.2";

    public static final String ClientPrefix = "&&";

    //Use this globaly instead of having to create multiple Minecraft objects
    public static final Minecraft mc = Minecraft.getMinecraft();

    //Making sure that the localPlayer and world are created
    //Returns false if there was no null since we are checking for a null
    public static boolean nullCheck()
    {
        return mc.player == null && mc.world == null;

    }
}
