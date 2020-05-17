package com.mDinardo08.PlaceAndGrind.util;

import com.mDinardo08.PlaceAndGrind.PlaceAndGrind;
import com.mDinardo08.PlaceAndGrind.blocks.BlockItemBase;
import com.mDinardo08.PlaceAndGrind.blocks.PlacerBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<Item>(ForgeRegistries.ITEMS, PlaceAndGrind.ModId);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<Block>(ForgeRegistries.BLOCKS, PlaceAndGrind.ModId);

    public static void init() {
            ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
            BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }


    public static final RegistryObject<Block> PLACER_BLOCK = BLOCKS.register("placer_block", PlacerBlock::new);

    public static final RegistryObject<Item> PLACER_BLOCK_ITEM = ITEMS.register("placer_block",()-> new BlockItemBase(PLACER_BLOCK.get()));
}
