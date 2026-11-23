package net.mintyparadice.expendable.item;

import net.minecraft.world.item.Item;
import net.mintyparadice.expendable.Expendable;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Expendable.MOD_ID);

    public static final DeferredItem<Item> FELSHALE = ITEMS.register("felshale",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

