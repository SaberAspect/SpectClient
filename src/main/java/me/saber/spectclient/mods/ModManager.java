package me.saber.spectclient.mods;

import me.saber.spectclient.mods.movement.Sprint;
import me.saber.spectclient.mods.render.FullBright;
import net.minecraftforge.fml.common.gameevent.TickEvent;

import java.util.ArrayList;

/**
 * @author SaberAspect
 * @since 8/11/22
 *
 */
public class ModManager {

    public final ArrayList<Mod> modules = new ArrayList<>();


    //Where we initialize our mods
    public ModManager()
    {
        modules.add(new FullBright());
        modules.add(new Sprint());
    }



    //Getting mod stuff, will be used later with other mods
    public Mod getModByName(String name)
    {
        for(Mod m : modules)
        {
            if(m.getName().equalsIgnoreCase(name))
                return m;
        }
        return null;
    }
    //Sorting by category, for the clickGui
    public Mod getModByCategory(Category c)
    {
        for(Mod m : modules)
            if(m.getC().equals(c))
                return m;
        return null;
    }

    //Update function, if the current mod in the index is toggled, we update it
    public void update()
    {
        for(Mod mods : modules)
            if(mods.isToggled()) {
                mods.onUpdate();

            }
    }

}
