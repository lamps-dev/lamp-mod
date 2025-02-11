package net.lamp.lampmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.lamp.lampmod.LampMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SALMA_MEOWS = registerItem("salma_meow", new Item(new Item.Settings()));
    public static final Item MEOW = registerItem("meow", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(LampMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        LampMod.LOGGER.info("I am currently working to register the mod's items for you without your help. Thanks to my perfectly coded functionality by Lamp :) (Totally not just a logger.) It's registering for " + LampMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(SALMA_MEOWS);
        });
    }
}
