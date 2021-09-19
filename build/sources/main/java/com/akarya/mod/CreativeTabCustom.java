package com.akarya.mod;

import com.akarya.mod.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabCustom extends CreativeTabs
{
    public CreativeTabCustom(String label)
    {
        super(label);
    }

    @Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(ItemInit.AKARYIA_INGOT);
    }


}
