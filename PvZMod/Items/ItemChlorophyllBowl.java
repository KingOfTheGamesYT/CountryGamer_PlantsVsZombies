package CountryGamer_PlantsVsZombies.PvZMod.Items;

import CountryGamer_PlantsVsZombies.PvZMod.PvZ_Main;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.entity.player.PlayerCapabilities;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemChlorophyllBowl extends ItemBase
{
  public ItemChlorophyllBowl(int id)
  {
    super(id);
  }

  public boolean onItemUse(ItemStack item, EntityPlayer player, World world, int x, int y, int z, int side, float xOffset, float yOffset, float zOffset)
  {
    if ((player.capabilities.isCreativeMode) || (player.inventory.consumeInventoryItem(this.itemID)))
    {
      if ((world.getBlockId(x, y + 1, z) == 0) && 
        (!world.isRemote)) {
        world.setBlock(x, y + 1, z, PvZ_Main.chlorophyllBowl.blockID);
      }

    }

    return true;
  }
}