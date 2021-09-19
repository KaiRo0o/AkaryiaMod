package com.akarya.mod;

import com.akarya.mod.init.ItemInit;
import com.akarya.mod.proxy.CommonProxy;
import com.akarya.mod.util.Reference;
import com.akarya.mod.util.handlers.RegistryHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.Display;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main {

    @Mod.Instance
    public static Main instance;

    public static CreativeTabs CustomTab = new CreativeTabCustom("Akaryia");

    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
    public static CommonProxy proxy;

    public static Logger logger;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent e)
    {
        logger = e.getModLog();

        proxy.preInit();

        RegistryHandler.preInitRegistries();
    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent e)
    {
        Display.setTitle("Akaryia - 1.0");
        RegistryHandler.initRegistries();
    }

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent e)
    {

    }

}
