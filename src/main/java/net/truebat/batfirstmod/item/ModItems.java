package net.truebat.batfirstmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.truebat.batfirstmod.BatFirstMod;

public class ModItems {
    public static final Item COPPER_SWORD = registerItem("copper_sword", new Item(new FabricItemSettings()));
    public static final Item COPPER_PICKAXE = registerItem("copper_pickaxe", new Item(new FabricItemSettings()));
    private static Item registerItem(String name , Item item){
        return Registry.register(Registries.ITEM, new Identifier(BatFirstMod.MOD_ID,name),item);
    }
    private static void addItemsToCombatTab(FabricItemGroupEntries e){
        e.add(COPPER_SWORD);
        e.add(COPPER_PICKAXE);
    }
    public static void registerModItems(){
        BatFirstMod.LOGGER.info("Registering mod items for "+BatFirstMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatTab);
    }
}
