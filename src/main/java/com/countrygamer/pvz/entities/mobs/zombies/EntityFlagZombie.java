package com.countrygamer.pvz.entities.mobs.zombies;

import com.countrygamer.pvz.lib.RegistryHandler;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.countrygamer.pvz.PvZ;

public class EntityFlagZombie extends ZombieEntity {

	public EntityFlagZombie(EntityType<EntityFlagZombie> entityFlagZombieEntityType, World world) {
		super(world);

		this.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(RegistryHandler.flag.get()));
	}
	
	/*
	public void onUpdate() {
		int minZombies = 1, maxZombies = 10;
		List list = this.worldObj.getEntitiesWithinAABB(EntityZombie.class,
				AxisAlignedBB.getBoundingBox(this.posX - 5, this.posY - 1,
						this.posY - 5, this.posX + 5, this.posY + 2,
						this.posZ + 5));
		Random rand = new Random();
		int randInt = rand.nextInt((maxZombies - minZombies) + 1) + minZombies;
		if (list.size() + randInt <= maxZombies) {
			int var = rand.nextInt(5);
			switch (var = 1) {
			case 0:
				for (int i = 0; i < randInt; i++) {
					EntityZombie ent = new EntityZombie(this.worldObj);
					ent.setPosition(this.posX, this.posY + 1.0D, this.posZ);
					if (!this.worldObj.isRemote)
						this.worldObj.spawnEntityInWorld(ent);
				}
				break;
			case 1:
				for (int i = 0; i < randInt; i++) {
					EntityFootballZombie ent = new EntityFootballZombie(
							this.worldObj);
					ent.setPosition(this.posX, this.posY + 1.0D, this.posZ);
					if (!this.worldObj.isRemote)
						this.worldObj.spawnEntityInWorld(ent);
				}
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			}
		}

	}
	*/
	
	
}