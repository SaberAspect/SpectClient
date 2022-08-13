package me.saber.spectclient;

import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

//Author - SaberAspect
//Written on 8/12/2022

@net.minecraftforge.fml.common.Mod(modid = Client.MODID, name = Client.NAME, version = Client.VERSION)
public class Client
{

    public static final String MODID = "spc";
    public static final String NAME = "";
    public static final String VERSION = "1.0";

    private static Logger logger;



    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        logger.info("SpectClient Initialized");
    }
}
