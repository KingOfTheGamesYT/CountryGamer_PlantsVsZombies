package com.countrygamer.pvz.entities.mobs.zombies;

import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;

public class EntityExplorerZombie extends ZombieEntity {

	public EntityExplorerZombie(EntityType<EntityExplorerZombie> entityExplorerZombieEntityType, World world) {
		super(world);

		this.setItemStackToSlot(EquipmentSlotType.HEAD, new ItemStack(Items.LEATHER_HELMET));
		this.setItemStackToSlot(EquipmentSlotType.CHEST, new ItemStack(Items.LEATHER_CHESTPLATE));
		this.setItemStackToSlot(EquipmentSlotType.LEGS, new ItemStack(Items.LEATHER_LEGGINGS));
		this.setItemStackToSlot(EquipmentSlotType.FEET, new ItemStack(Items.LEATHER_BOOTS));
		this.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(Blocks.TORCH));

	}
}
