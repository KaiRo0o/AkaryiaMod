package com.akarya.mod.init;

import com.akarya.mod.objects.blocks.AkaryiaOreBlock;
import com.akarya.mod.objects.blocks.BlockBasic;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class BlockInit
{
    public static List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block AKARYIA_BLOCK = new BlockBasic("akaryia_block", Material.ROCK);
    public static final Block INERTHIUM_BLOCK = new BlockBasic("inerthium_block", Material.ROCK);

    public static final Block AKARYIA_ORE = new AkaryiaOreBlock("akaryia_ore", Material.ROCK);
}
