package me.saber.spectclient.mods;

public class Mod {

    String name, description;
    Category c;
    int keyCode;
    public Mod(String name, String description, Category c)
    {
        this.name = name;
        this.description = description;
        this.c = c;
        this.keyCode = 0;
    }

    public int getKeyCode() {
        return keyCode;
    }

    public void setKeyCode(int keyCode) {
        this.keyCode = keyCode;
    }

    public Category getC() {
        return c;
    }

    public void setC(Category c) {
        this.c = c;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void onEnable(){}
    public void onDisable(){}
    public void onRender(){}
    public void onUpdate(){}
}
