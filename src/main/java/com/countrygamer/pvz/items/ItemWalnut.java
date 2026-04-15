package com.countrygamer.pvz.items;

import com.countrygamer.pvz.lib.RegistryHandler;
import net.minecraft.block.Block;

import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import com.countrygamer.pvz.PvZ;
import com.countrygamer.pvz.entities.mobs.plants.EntityWalnut;

import static com.countrygamer.pvz.PvZ.darkenedGrass;
import static com.countrygamer.pvz.PvZ.endowedGrass;
import static net.minecraft.block.Blocks.DIRT;
import static net.minecraft.block.Blocks.GRASS_BLOCK;

public class ItemWalnut extends Item {
	public ItemWalnut() {
		super(new Item.Properties());
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity playerEntity, Hand hand) {
		ItemStack stack = playerEntity.getHeldItem(hand);
		BlockPos pos = playerEntity.getPosition();

		// Ensuring the Block Position is correctly referenced
		BlockPos newPos = new BlockPos(pos);

		// Checking if the block is a valid type
		if ((world.getBlockState(newPos).getBlock() == Blocks.GRASS_BLOCK ||
				world.getBlockState(newPos).getBlock() == Blocks.DIRT ||
				world.getBlockState(newPos).getBlock() == endowedGrass ||
				world.getBlockState(newPos).getBlock() == darkenedGrass)) {

			if (!playerEntity.abilities.isCreativeMode) {
				stack.shrink(1);
			}

			// Creating and spawning the entity
			LivingEntity ent = new EntityWalnut(RegistryHandler.WALNUT, world); // Replace with your actual entity type
			ent.setLocationAndAngles(pos.getX() + 0.5D, pos.getY() + 1, pos.getZ() + 0.5D, 0.0F, 0.0F);

			if (!world.isRemote) {
				world.addEntity(ent);
			}

			return new ActionResult<>(ActionResultType.SUCCESS, stack);
		}

		return new ActionResult<>(ActionResultType.FAIL, stack);
	}
