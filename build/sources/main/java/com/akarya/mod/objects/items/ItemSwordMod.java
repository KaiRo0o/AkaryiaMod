package com.akarya.mod.objects.items;

import com.akarya.mod.Main;
import com.akarya.mod.init.ItemInit;
import com.akarya.mod.util.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ItemSwordMod extends ItemSword implements IHasModel
{
    public ItemSwordMod(String name, ToolMaterial material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.CustomTab);
        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0);
    }

}
