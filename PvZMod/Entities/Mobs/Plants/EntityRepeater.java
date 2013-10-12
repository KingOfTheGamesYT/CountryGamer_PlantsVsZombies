package CountryGamer_PlantsVsZombies.PvZMod.Entities.Mobs.Plants;

import CountryGamer_PlantsVsZombies.PvZMod.PvZ_Main;
import CountryGamer_PlantsVsZombies.PvZMod.Entities.Projectiles.EntityPeaPod;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAITasks;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityRepeater extends EntityPlantShooterBase
{
  public EntityRepeater(World par1World)
  {
    super(par1World, new ItemStack(PvZ_Main.basicPlants, 1, 3));

    setTexture("/mods/CountryGamer_PlantsVsZombies/textures/mobs/Pea Shooter.png");
  }

  protected void dropFewItems(boolean par1, int par2) {
    dropItem(PvZ_Main.peaPod.itemID, 2);
  }

  public EntityThrowable entitySelect(World world)
  {
    EntityPeaPod ent = new EntityPeaPod(world, this);
    return ent;
  }

  public void ai()
  {
    this.tasks.addTask(1, new EntityAIArrowAttack(this, 0.0D, 25, this.range));

    this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityLiving.class, 0, true, false, IMob.mobSelector));

    this.tasks.addTask(9, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
    this.tasks.addTask(10, new EntityAILookIdle(this));
  }
}