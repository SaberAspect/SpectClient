package me.saber.spectclient;

import me.saber.spectclient.event.spectclientEventHandler;
import me.saber.spectclient.mods.ModManager;
import me.saber.spectclient.utils.Refs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.logging.log4j.Logger;


/**
 * @author SaberAspect
 * @since 8/11/22
 *
 * Based on the Forge Documentation, I have found this to be the best way
 */
@net.minecraftforge.fml.common.Mod(modid = Refs.MODID, name = Refs.NAME, version = Refs.VERSION, clientSideOnly = Refs.CLIENTSIDE, acceptedMinecraftVersions = Refs.ACCEPTEDVERSION)
@SideOnly(Side.CLIENT)
public class Client
{
    //Used for keeping track of how long the client has been running for
    public static long startTime = -1, endTime = -1, elapsedTime = -1;
    private static Logger logger;
    public static ModManager modManager;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        startTime = System.currentTimeMillis();

    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {


        modManager = new ModManager();
        logger.info("ModManager Initialized");


    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        endTime = System.currentTimeMillis();
        elapsedTime = (endTime - startTime)/1000;
        logger.info("SpectClient Initialized took " + elapsedTime + "s");

    }

    public static long getElapsedTime()
    {
        return elapsedTime;
    }
}
