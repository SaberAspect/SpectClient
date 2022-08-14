package me.saber.spectclient.mods;

/**
 * @author SaberAspect
 * @since 8/11/22
 *
 */
public enum Category {

    //Categories for the eventual clickGui
    HUD("Hud"), PLAYER("Player"), COMBAT("Combat"), MOVEMENT("Movement"), RENDER("Render");

    public final String name;

    Category(String name)
    {
        this.name=name;
    }


}
