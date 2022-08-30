package com.countrygamer.pvz.entities.mobs.zombies;

import com.countrygamer.pvz.PvZ;

import com.countrygamer.pvz.lib.RegistryHandler;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityFootballZombie extends ZombieEntity {
  public EntityFootballZombie(EntityType<EntityFootballZombie> entityFootballZombieEntityType, World world) {
    super(world);

    setItemStackToSlot(EquipmentSlotType.HEAD, new ItemStack(RegistryHandler.footballHelm.get()));
    setItemStackToSlot(EquipmentSlotType.CHEST, new ItemStack(RegistryHandler.footballChest.get()));
    setItemStackToSlot(EquipmentSlotType.LEGS, new ItemStack(RegistryHandler.footballLegs.get()));
    setItemStackToSlot(EquipmentSlotType.FEET, new ItemStack(RegistryHandler.footballBoots.get()));
  }

}