package harry.mod.objects.items.tools;

import java.util.Set;

import com.google.common.collect.Sets;

import harry.mod.Main;
import harry.mod.init.ItemInit;
import harry.mod.util.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class ToolAxe extends ItemTool implements IHasModel
{
	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE);

	private ToolMaterial material;
    public ToolAxe(String name, ToolMaterial material)
    {
        super(material, EFFECTIVE_ON);
        this.material = material;
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.TOOLS);
        
        ItemInit.ITEMS.add(this);
    }

    public float getStrVsBlock(ItemStack stack, IBlockState state)
    {
        Material tmaterial = state.getMaterial();
        return tmaterial != Material.WOOD && tmaterial != Material.PLANTS && tmaterial != Material.VINE ? this.material.getEfficiency()/3 : this.material.getEfficiency();
    }

    @Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
