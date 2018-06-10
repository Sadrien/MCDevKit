package harry.mod.util.handlers;

import harry.mod.objects.blocks.machines.sinterer.TileEntitySinteringFurnace;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler 
{
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntitySinteringFurnace.class, "sintering_furnace");
	}
}
