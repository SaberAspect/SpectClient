package me.saber.spectclient.mods;

public enum Category {

    HUD("Hud"), PLAYER("Player"), COMBAT("Combat"), MOVEMENT("Movement"), RENDER("Render");

    public String name;

    Category(String name)
    {
        this.name=name;
    }


}
