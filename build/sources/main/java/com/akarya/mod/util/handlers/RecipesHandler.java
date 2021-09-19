package com.akarya.mod.util.handlers;

import com.akarya.mod.init.BlockInit;
import com.akarya.mod.init.ItemInit;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipesHandler
{

    public static void registerRecipes()
    {
        GameRegistry.addSmelting(BlockInit.AKARYIA_ORE, new ItemStack(ItemInit.AKARYIA_INGOT, 1), 0.5F);
    }

}
