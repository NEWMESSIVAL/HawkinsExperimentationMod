package hawkins.testmod.item;

import hawkins.testmod.HawkinsExperimentationMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item HYTALE_SWORD = registerItem("hytale_iron_sword",
            new Item(new Item.Settings().maxCount(1)));

    public static final Item TEST = registerItem("test",
            new Item(new Item.Settings().maxCount(1)));

    public static final Item BLAZE_TORCH = registerItem("blaze_torch",
            new Item(new Item.Settings().maxCount(1)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(HawkinsExperimentationMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        HawkinsExperimentationMod.LOGGER.info("Registering Mod Items for " + HawkinsExperimentationMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(HYTALE_SWORD);
            fabricItemGroupEntries.add(TEST);
            fabricItemGroupEntries.add(BLAZE_TORCH);
        });
    }
}
