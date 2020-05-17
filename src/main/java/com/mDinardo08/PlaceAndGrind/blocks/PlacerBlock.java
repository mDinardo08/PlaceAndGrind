package com.mDinardo08.PlaceAndGrind.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class PlacerBlock extends Block {
    public PlacerBlock() {
        super(Block.Properties.create(Material.ROCK)
        .hardnessAndResistance(5.0f, 6.50f)
        .sound(SoundType.STONE)
        .harvestLevel(1)
        .harvestTool(ToolType.PICKAXE));
    }
}
