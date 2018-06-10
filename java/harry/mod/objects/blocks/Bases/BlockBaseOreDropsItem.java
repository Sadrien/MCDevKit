package harry.mod.objects.blocks.Bases;

import java.util.Random;

import harry.mod.init.BlockInit;
import harry.mod.init.ItemInit;
import harry.mod.util.interfaces.IHasModel;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBaseOreDropsItem extends BlockBaseOres implements IHasModel
{
	/**super(String name); **/
	public BlockBaseOreDropsItem(String name, String dimension)
	   {
			super(name, dimension);
		   	setUnlocalizedName(name);
			setRegistryName(name);
			setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
			
			BlockInit.BLOCKS.add(this);
			ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	   }
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) 
	{
		
		return null; 
		/**
		 specify item or block  to be returned by its STATIC NAME or its STATIC_NAME and metadata
		 in your init.BlockInit and init.ItemInit(or other name)
		 **/
		//ex: {return ItemInit.RUBY;}
       
	}
	
	/**
     * Get the quantity dropped based on the given fortune level
     */
	@Override
    public int quantityDroppedWithBonus(int fortune, Random random)
    {
        if (fortune > 0 && Item.getItemFromBlock(this) != this.getItemDropped((IBlockState)this.getBlockState().getValidStates().iterator().next(), random, fortune))
        {
            int i = random.nextInt(fortune + 2) - 1;

            if (i < 0)
            {
                i = 0;
            }

            return this.quantityDropped(random) * (i + 1);
        }
        else
        {
            return this.quantityDropped(random);
        }
    }
	
	
}
