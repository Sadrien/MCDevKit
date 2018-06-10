package harry.mod.init;

import java.util.ArrayList;
import java.util.List;

import harry.mod.objects.armour.ArmourBase;
import harry.mod.objects.items.ItemBase;
import harry.mod.objects.items.tools.ToolAxe;
import harry.mod.objects.items.tools.ToolHoe;
import harry.mod.objects.items.tools.ToolPickaxe;
import harry.mod.objects.items.tools.ToolShovel;
import harry.mod.objects.items.tools.ToolSword;
import harry.mod.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Items
	public static final Item INGOT_COPPER = new ItemBase("ingot_copper");
	
	//Tools
	public static final Item AXE_COPPER = new ToolAxe("axe_copper", MaterialInit.TOOL_COPPER);
	public static final Item HOE_COPPER = new ToolHoe("hoe_copper", MaterialInit.TOOL_COPPER);
	public static final Item PICKAXE_COPPER = new ToolPickaxe("pickaxe_copper", MaterialInit.TOOL_COPPER);
	public static final Item SHOVEL_COPPER = new ToolShovel("shovel_copper", MaterialInit.TOOL_COPPER);
	public static final Item SWORD_COPPER = new ToolSword("sword_copper", MaterialInit.TOOL_COPPER);
	
	//Armour
	public static final Item HELMET_COPPER = new ArmourBase("helmet_copper", MaterialInit.ARMOUR_COPPER, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_COPPER = new ArmourBase("chestplate_copper", MaterialInit.ARMOUR_COPPER, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_COPPER = new ArmourBase("leggings_copper", MaterialInit.ARMOUR_COPPER, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_COPPER = new ArmourBase("boots_copper", MaterialInit.ARMOUR_COPPER, 1, EntityEquipmentSlot.FEET);
}
