package com.Pdiddy973.AllTheCompressed.blocks.minecraft;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class Netherrack extends Block {
    public Netherrack() {
        super(Properties.of(Material.STONE)
                .sound(SoundType.NETHERRACK)
                .strength(15f, 1200f)
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(2)
                .requiresCorrectToolForDrops());
    }
}
