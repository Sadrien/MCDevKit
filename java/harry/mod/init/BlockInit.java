package harry.mod.init;

import java.util.ArrayList;
import java.util.List;

import harry.mod.objects.blocks.Bases.BlockBase;
import harry.mod.objects.blocks.Bases.BlockBaseDirts;
import harry.mod.objects.blocks.Bases.BlockBaseLeaf;
import harry.mod.objects.blocks.Bases.BlockBaseLogs;
import harry.mod.objects.blocks.Bases.BlockBaseOres;
import harry.mod.objects.blocks.Bases.BlockBasePlanks;
import harry.mod.objects.blocks.Bases.BlockBaseSaplings;
import harry.mod.objects.blocks.custom.BlockSantaHat;
import harry.mod.objects.blocks.machines.sinterer.BlockSinteringFurnace;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BLOCK_COPPER = new BlockBase("block_copper", Material.IRON);
	
	public static final Block ORE_END = new BlockBaseOres("ore_end", "end");
	public static final Block ORE_OVERWORLD = new BlockBaseOres("ore_overworld", "overworld");
	public static final Block ORE_NETHER = new BlockBaseOres("ore_nether", "nether");
	
	public static final Block PLANKS = new BlockBasePlanks("planks");
	public static final Block LOGS = new BlockBaseLogs("log");
	public static final Block LEAVES = new BlockBaseLeaf("leaves");
	public static final Block SAPLINGS = new BlockBaseSaplings("sapling");	
	public static final Block DIRT = new BlockBaseDirts("dirt");
	
	public static final Block SANTA_HAT = new BlockSantaHat("santa_hat");
	
	public static final Block SINTERING_FURNACE = new BlockSinteringFurnace("sintering_furnace");

}
