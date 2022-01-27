package powercraft.core;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import powercraft.api.item.PC_Item;
import powercraft.api.registry.PC_GresRegistry;
import powercraft.api.registry.PC_LangRegistry;
import powercraft.api.registry.PC_LangRegistry.LangEntry;
import powercraft.api.registry.PC_MSGRegistry;

public class PCco_ItemOreSniffer extends PC_Item
{
    public PCco_ItemOreSniffer(int id)
    {
    	super(id);
        setMaxStackSize(1);
        setMaxDamage(500);
        setIconIndex(1);
        setCreativeTab(CreativeTabs.tabTools);
    }

    @Override
    public boolean onItemUse(ItemStack itemstack, EntityPlayer entityplayer, World world, int i, int j, int k, int l, float par8, float par9, float par10)
    {
        if (world.isRemote)
        {
            PC_GresRegistry.openGres("OreSnifferResultScreen", entityplayer, null, i, j, k, l);
        }

        itemstack.damageItem(1, entityplayer);
        return false;
    }

    @Override
    public void addInformation(ItemStack itemStack, EntityPlayer player, List list, boolean b)
    {
        list.add(PC_LangRegistry.tr("pc.sniffer.desc"));
    }

	@Override
	public Object msg(int msg, Object... obj) {
		switch(msg){
		case PC_MSGRegistry.MSG_DEFAULT_NAME:
			List<LangEntry> names = (List<LangEntry>)obj[0];
			names.add(new LangEntry(getItemName(), "Ore Sniffer"));
            return names;
		}
		return null;
	}
}
