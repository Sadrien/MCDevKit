package harry.mod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.*;

public class RecipeInit 
{
public static void init() {
		
		/** Smelting Recipes**/
		GameRegistry.addSmelting(
				new ItemStack(BlockInit.ORE_OVERWORLD, 1, 0), 
				new ItemStack(ItemInit.INGOT_COPPER, 1, 0), 1.0f);
	}
}
