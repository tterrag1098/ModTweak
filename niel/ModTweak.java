package niel;


import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import niel.lib.ModLib;
import niel.mod.Block.ModTweakBlock;
import niel.mod.Item.ModTweakItem;
import niel.proxy.CommonProxy;


@Mod(modid = ModLib.MOD_ID, name = ModLib.MOD_NAME, version = ModLib.VERSION)
public class ModTweak {

    @Instance(ModLib.MOD_ID)
    public static ModTweak instance;

    @SidedProxy(clientSide = ModLib.CLIENT_PROXY_CLASS, serverSide = ModLib.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

        ModTweakItem.init();
        ModTweakBlock.init();

    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        ModTweakItem.addNames();
        ModTweakItem.registerRecipes();
        ModTweakBlock.addNames();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

}
}