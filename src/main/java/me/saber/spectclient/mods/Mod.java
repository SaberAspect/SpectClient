package me.saber.spectclient.mods;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.gameevent.TickEvent;

/**
 * @author SaberAspect
 * @since 8/11/22
 *
 */
public class Mod {

    //Basic mod stuff, nothing fancy here
    private String name, description;
    private Category c;
    private int key;
    private boolean toggled, enabled;
    public Mod(String name, String description, Category c)
    {
        super();
        this.name = name;
        this.description = description;
        this.c = c;
        this.key = 0;
        this.toggled = false;
        this.enabled = false;
    }



    //Basic getters and setters, again nothing fancy
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

    public int getKey()
    {return key;}
    public void setKey(final int key){
        this.key = key;

    }
    //Toggling stuff, enabling stuff and rendering stuff(Hopefully!)
    public boolean isToggled()
    {
       return toggled;
    }

    public void toggle()
    {
        this.toggled = !this.toggled;
        if(this.toggled)
            enable();
        else
            disable();
    }
    public void enable(){
        if(!enabled) {
                this.enabled = true;
            try {
                this.onEnable();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void disable(){
        if(enabled) {
            this.enabled = false;
            try {
                this.onDisable();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    protected void onEnable() {
        MinecraftForge.EVENT_BUS.register(this);
    }
    protected void onDisable(){
        MinecraftForge.EVENT_BUS.unregister(this);
    }
    public void onRender(){}
    public void onUpdate(){}
    public void onKeyPress(){}
}
