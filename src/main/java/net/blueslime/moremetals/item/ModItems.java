package net.blueslime.moremetals.item;
import net.blueslime.moremetals.MoreMetals;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.minecraft.item.Items.register;

public class ModItems {

    public static final Item SILVER_INGOT = register("silver_ingot", Item::new, new Item.Settings());

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MoreMetals.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MoreMetals.LOGGER.info("Registering Mod Items for " + MoreMetals.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(SILVER_INGOT);
        });

    }
}