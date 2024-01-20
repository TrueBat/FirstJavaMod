package net.truebat.batfirstmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.truebat.batfirstmod.BatFirstMod;

public class ModItems {
    public static final Item COPPER_SWORD = registerItem("copper_sword",
            new SwordItem(ModToolMaterial.COPPER, 3, -2.4f, new FabricItemSettings()));
    public static final Item COPPER_PICKAXE = registerItem("copper_pickaxe",
            new PickaxeItem(ModToolMaterial.COPPER, 1, -2.8f,new FabricItemSettings()));
    public static final Item COPPER_AXE = registerItem("copper_axe",
            new AxeItem(ModToolMaterial.COPPER, 5.5f, -3f, new FabricItemSettings()));
    public static final Item COPPER_SHOVEL = registerItem("copper_shovel",
            new ShovelItem(ModToolMaterial.COPPER, 1.5f, -3f,new FabricItemSettings()));
    public static final Item COPPER_HOE = registerItem("copper_hoe",
            new HoeItem(ModToolMaterial.COPPER, -2, -1f,new FabricItemSettings()));

    public static final Item COPPER_HELMET = registerItem("copper_helmet",
            new ArmorItem(ModArmorMaterial.COPPER, ArmorItem.Type.HELMET ,new FabricItemSettings()));
    public static final Item COPPER_CHESTPLATE = registerItem("copper_chestplate",
            new ArmorItem(ModArmorMaterial.COPPER, ArmorItem.Type.CHESTPLATE ,new FabricItemSettings()));
    public static final Item COPPER_LEGGINGS = registerItem("copper_leggings",
            new ArmorItem(ModArmorMaterial.COPPER, ArmorItem.Type.LEGGINGS ,new FabricItemSettings()));
    public static final Item COPPER_BOOTS = registerItem("copper_boots",
            new ArmorItem(ModArmorMaterial.COPPER, ArmorItem.Type.BOOTS ,new FabricItemSettings()));


    private static Item registerItem(String name , Item item){
        return Registry.register(Registries.ITEM, new Identifier(BatFirstMod.MOD_ID,name),item);
    }


    private static void addItemsToCombatTab(FabricItemGroupEntries e){
        e.add(COPPER_SWORD);
        e.add(COPPER_AXE);
        e.add(COPPER_HELMET);
        e.add(COPPER_CHESTPLATE);
        e.add(COPPER_LEGGINGS);
        e.add(COPPER_BOOTS);
    }
    private static void addItemsToToolsTab(FabricItemGroupEntries e){
        e.add(COPPER_PICKAXE);
        e.add(COPPER_SHOVEL);
        e.add(COPPER_HOE);
        e.add(COPPER_AXE);
    }
    public static void registerModItems(){
        BatFirstMod.LOGGER.info("Registering mod items for "+BatFirstMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatTab);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToToolsTab);
    }
}
