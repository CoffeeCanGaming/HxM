package coffee.hxm.hunterxminer;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import org.apache.logging.log4j.Logger;

import coffee.hxm.hunterxminer.ItemsBlocks;
import coffee.hxm.hunterxminer.lib.References;
import coffee.hxm.hunterxminer.proxies.ClientProxy;
import coffee.hxm.hunterxminer.proxies.CommonProxy;

@Mod(modid = References.MODID, name = References.MODNAME, version = References.MODVER)


public class HXHMain
{
	@SidedProxy(clientSide = "coffee.hxm.hunterxminer.proxies.ClientProxy", serverSide = "coffee.hxm.hunterxminer.proxies.CommonProxy")
	public static CommonProxy proxy;
	public static ClientProxy cproxy;
	
   @Instance
   public static HXHMain instance;
   
    private static Logger logger = FMLLog.getLogger();

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger.info("PreInit");
        coffee.hxm.hunterxminer.ItemsBlocks.initBlocks();
        coffee.hxm.hunterxminer.ItemsBlocks.initItems();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        logger.info("Init");
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) 
    {
    	logger.info("PostInit");
    }
}
