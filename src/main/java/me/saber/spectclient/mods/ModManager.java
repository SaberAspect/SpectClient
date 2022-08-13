package me.saber.spectclient.mods;

import me.saber.spectclient.mods.render.FullBright;

import java.util.ArrayList;

public class ModManager {

    public ArrayList<Mod> modules = new ArrayList<>();

    public void ModuleManager()
    {
        addMod(new FullBright());
    }

    public void addMod(Mod mod)
    {
        modules.add(mod);
    }

    public Mod getModByName(String name)
    {
        for(Mod m : modules)
        {
            if(m.getName().equalsIgnoreCase(name))
                return m;
        }
        return null;
    }
    public Mod getModByCategory(Category c)
    {
        for(Mod m : modules)
            if(m.getC().equals(c))
                return m;
        return null;
    }


}
