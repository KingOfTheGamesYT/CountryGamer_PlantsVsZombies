package com.countrygamer.pvz.items;

import com.countrygamer.pvz.PvZ;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class ItemFootballLegs extends ArmorItem {
	private static IArmorMaterial iArmorMaterial = new IArmorMaterial() {

		public int getDurability(EquipmentSlotType slotIn) {
			return 181;
		}

		@Override
		public int getDamageReductionAmount(EquipmentSlotType slotIn) {
			return 3;
		}

		@Override
		public int getEnchantability() {
			return 12;
		}

		@Override
		public SoundEvent getSoundEvent() {
			return SoundEvents.ITEM_ARMOR_EQUIP_GENERIC;
		}

		@Override
		public Ingredient getRepairMaterial() {
			return null;

		}

		@Override
		public String getName() {
			return PvZ.MOD_ID + ":football";
		}

		@Override
		public float getToughness() {
			return 0.0F;
		}

		@Override
		public float getKnockbackResistance() {
			return 0.0F;
		}

	};

	public ItemFootballLegs() {
		super(iArmorMaterial, (EquipmentSlotType.LEGS), (new Properties()));
	}

	public ItemFootballLegs(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builderIn) {
		super(materialIn, slot, builderIn);
	}

	public void unlockDestroyACH(PlayerEntity entity, World world) {
		if (world instanceof ServerWorld) {
			ServerPlayerEntity serverPlayerEntity = (ServerPlayerEntity)entity;
		}
	}

}