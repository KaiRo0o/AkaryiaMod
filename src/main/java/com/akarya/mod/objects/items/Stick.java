package com.akarya.mod.objects.items;

import com.akarya.mod.Main;
import com.akarya.mod.init.ItemInit;
import com.akarya.mod.util.interfaces.IHasModel;
import net.minecraft.item.Item;

public class Stick extends Item implements IHasModel {



    public Stick(String name)
    {

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.CustomTab);
        setMaxStackSize(90);
        ItemInit.ITEMS.add(this);

    }

    @Override
    public void registerModels()
    {
        Main.proxy.registerItemRenderer(this, 0);
    }
}
