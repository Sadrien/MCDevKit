package harry.mod.util.handlers;

import harry.mod.Main;
import harry.mod.init.BiomeInit;
import harry.mod.init.BlockInit;
import harry.mod.init.EntityInit;
import harry.mod.init.ItemInit;
import harry.mod.init.RecipeInit;
import harry.mod.util.interfaces.IHasModel;
import harry.mod.world.gen.WorldGenCustomOres;
import harry.mod.world.gen.WorldGenCustomStructures;
import harry.mod.world.types.WorldTypeCopper;
import harry.mod.world.types.WorldTypeCustom;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.world.WorldType;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@EventBusSubscriber
public class RegistryHandler 
{
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
		TileEntityHandler.registerTileEntities();
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		for(Item item : ItemInit.ITEMS)
		{
			if(item instanceof IHasModel)
			{
				((IHasModel)item).registerModels();
			}
		}
		
		for(Block block : BlockInit.BLOCKS)
		{
			if(block instanceof IHasModel)
			{
				((IHasModel)block).registerModels();
			}
		}
	}
	
	public static void preInitRegistries()
	{
		GameRegistry.registerWorldGenerator(new WorldGenCustomOres(), 0);
		GameRegistry.registerWorldGenerator(new WorldGenCustomStructures(), 0);
		
		BiomeInit.registerBiomes();
		//DimensionInit.registerDimensions();
		
		EntityInit.registerEntities();
		RenderHandler.registerEntityRenders();
	}
	
	public static void initRegistries()
	{
		SoundsHandler.registerSounds();
		NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new GuiHandler());
		RecipeInit.init();
	}
	
	public static void postInitRegistries()
	{
		WorldType COPPER = new WorldTypeCopper();
		WorldType CUSTOM = new WorldTypeCustom();
	}
	
	public static void serverRegistries(FMLServerStartingEvent event)
	{
		//event.registerServerCommand(new CommandDimensionTeleport());
	}
}
