package com.countrygamer.pvz.lib;

import com.countrygamer.pvz.PvZ;
import com.countrygamer.pvz.entities.mobs.zombies.EntityExplorerZombie;
import com.countrygamer.pvz.entities.mobs.zombies.EntityFlagZombie;
import com.countrygamer.pvz.entities.mobs.zombies.EntityFootballZombie;
import com.countrygamer.pvz.items.ItemFootballBoots;
import com.countrygamer.pvz.items.ItemFootballChest;
import com.countrygamer.pvz.items.ItemFootballHelm;
import com.countrygamer.pvz.items.ItemFootballLegs;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

        public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, PvZ.MOD_ID);
        public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, PvZ.MOD_ID);
        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PvZ.MOD_ID);

        public static void init() {
                BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
                ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
                ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        }

        //Entities
        public static final RegistryObject<EntityType<EntityExplorerZombie>> Explorer = ENTITIES
                .register("explorer",
                        () -> EntityType.Builder.<EntityExplorerZombie>create(EntityExplorerZombie::new, EntityClassification.MONSTER)
                                .size(1.0f, 0.3f)
                                .build(new ResourceLocation(PvZ.MOD_ID, "explorer").toString()));

        public static final RegistryObject<EntityType<EntityFootballZombie>> Football = ENTITIES
                .register("football",
                        () -> EntityType.Builder.<EntityFootballZombie>create(EntityFootballZombie::new, EntityClassification.MONSTER)
                                .size(1.0f, 0.3f)
                                .build(new ResourceLocation(PvZ.MOD_ID, "football").toString()));


        public static final RegistryObject<EntityType<EntityFlagZombie>> Flag = ENTITIES
                .register("flag",
                        () -> EntityType.Builder.<EntityFlagZombie>create(EntityFlagZombie::new, EntityClassification.MONSTER)
                                .size(1.0f, 0.3f)
                                .build(new ResourceLocation(PvZ.MOD_ID, "flag").toString()));


        //Armor
        public static final RegistryObject<ItemFootballBoots> footballBoots = ITEMS.register("football_boots", ItemFootballBoots::new);
        public static final RegistryObject<ItemFootballChest> footballChest = ITEMS.register("football_chest", ItemFootballChest::new);
        public static final RegistryObject<ItemFootballHelm> footballHelm = ITEMS.register("football_helmet", ItemFootballHelm::new);
        public static final RegistryObject<ItemFootballLegs> footballLegs = ITEMS.register("football_legs", ItemFootballLegs::new);








}