package CountryGamer_PlantsVsZombies.PvZMod.Entities.Projectiles;

import java.util.Random;

import CountryGamer_PlantsVsZombies.PvZMod.PvZ_Main;
import CountryGamer_PlantsVsZombies.PvZMod.PvZ_Util;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntitySunlight extends EntityPodBase
{
  public byte damage = 2;
  public boolean toDamage = false;
  public EntityLivingBase target = null;

  public EntitySunlight(World world) {
    super(world);
  }
  public EntitySunlight(World world, EntityLivingBase entLiv) {
    super(world, entLiv);
  }
  public EntitySunlight(World world, double x, double y, double z) {
    super(world, x, y, z);
  }
  public boolean canAttackWithItem() {
    return false; } 
  protected float getGravityVelocity() { return 0.01F;
  }

  protected void onImpact(MovingObjectPosition movObjPos)
  {
    int x = movObjPos.blockX; int y = movObjPos.blockY; int z = movObjPos.blockZ;
    World world = this.worldObj;
    EntityPlayer player = (EntityPlayer)getThrower();
    Random itemRand = new Random();

    int blockid = world.getBlockId(x, y, z);
    if ((blockid == Block.dirt.blockID) || (blockid == Block.grass.blockID) || (blockid == Block.mycelium.blockID))
    {
      world.setBlock(x, y, z, PvZ_Main.endowedGrass.blockID);
      setDead();
      return;
    }
    if (blockid == PvZ_Main.darkenedGrass.blockID) {
      PvZ_Util.spawnItem(world, x, y, z, new ItemStack(PvZ_Main.moonlight, 1));
      world.setBlock(x, y, z, PvZ_Main.endowedGrass.blockID);
      setDead();
      return;
    }
    PvZ_Util.spawnItem(world, x, y, z, new ItemStack(PvZ_Main.sunlight, 1));
    setDead();
  }
}