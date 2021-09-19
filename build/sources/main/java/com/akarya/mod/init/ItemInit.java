package com.akarya.mod.init;

import com.akarya.mod.objects.items.*;
import com.akarya.mod.objects.items.armor.ArmorMod;
import com.akarya.mod.util.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;

import java.util.*;

public class ItemInit
{
    public static List<Item> ITEMS = new ArrayList<Item>();

    public static final Item.ToolMaterial AKARYIA_TOOL = EnumHelper.addToolMaterial("akaryia_tool", 5, 3000, 25.0F, 5.0F, 18);
    public static final Item.ToolMaterial INERTHIUM_TOOL = EnumHelper.addToolMaterial("inerthium_tool", 5, 5000, 30.0F, 5.0F, 18);
    public static final Item.ToolMaterial AKARYIA_SWORD_TOOL = EnumHelper.addToolMaterial("akaryia_sword", 5, 3000, 25.0F, 8.0F, 18);
    public static final Item.ToolMaterial INERTHIUM_SWORD_TOOL = EnumHelper.addToolMaterial("inerthium_sword", 5, 5000, 30.0F, 12.0F, 18);

    public static final ItemArmor.ArmorMaterial AKARYIA_ARMOR = EnumHelper.addArmorMaterial("akaryia_armor", Reference.MODID + ":akaryiamod", 75, new int[] {6, 8, 7, 5}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F);
    public static final ItemArmor.ArmorMaterial INERTHIUM_ARMOR = EnumHelper.addArmorMaterial("inerthium_armor", Reference.MODID + ":inerthium", 75, new int[] {10, 12, 11, 8}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F);

    public static final Item AKARYIA_INGOT = new ItemBase("akaryia_ingot");
    public static final Item INERTHIUM_INGOT = new ItemBase("inerthium_ingot");
    public static final Item STICK = new Stick("stick");

    //tools
    public static final Item AKARYIA_PICKAXE = new ItemPickaxeMod("akaryia_pickaxe", AKARYIA_TOOL);
    public static final Item AKARYIA_SHOVEL = new ItemShovelMod("akaryia_shovel", AKARYIA_TOOL);
    public static final Item AKARYIA_SWORD = new ItemSwordMod("akaryia_sword", AKARYIA_SWORD_TOOL);

    public static final Item INERTHIUM_PICKAXE = new ItemPickaxeMod("inerthium_pickaxe", INERTHIUM_TOOL);
    public static final Item INERTHIUM_SHOVEL = new ItemShovelMod("inerthium_shovel", INERTHIUM_TOOL);
    public static final Item INERTHIUM_SWORD = new ItemSwordMod("inerthium_sword", INERTHIUM_SWORD_TOOL);

    public static final Item AKARYIA_HELMET = new ArmorMod("akaryia_helmet", AKARYIA_ARMOR, 1, EntityEquipmentSlot.HEAD);
    public static final Item AKARYIA_CHESTPLATE = new ArmorMod("akaryia_chestplate", AKARYIA_ARMOR, 1, EntityEquipmentSlot.CHEST);
    public static final Item AKARYIA_LEGGINGS = new ArmorMod("akaryia_leggings", AKARYIA_ARMOR, 2, EntityEquipmentSlot.LEGS);
    public static final Item AKARYIA_BOOTS = new ArmorMod("akaryia_boots", AKARYIA_ARMOR, 1, EntityEquipmentSlot.FEET);

    public static final Item INERTHIUM_HELMET = new ArmorMod("inerthium_helmet", INERTHIUM_ARMOR, 1, EntityEquipmentSlot.HEAD);
    public static final Item INERTHIUM_CHESTPLATE = new ArmorMod("inerthium_chestplate", INERTHIUM_ARMOR, 1, EntityEquipmentSlot.CHEST);
    public static final Item INERTIHUM_LEGGINGS = new ArmorMod("inerthium_leggings", INERTHIUM_ARMOR, 2, EntityEquipmentSlot.LEGS);
    public static final Item INERTHIUM_BOOTS = new ArmorMod("inerthium_boots", INERTHIUM_ARMOR, 1, EntityEquipmentSlot.FEET);
}
