package net.chukkthedukk.chukksmod.item;

import net.chukkthedukk.chukksmod.ChukksMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item FIRE_DRAGON_SWORD =registerItem( "fire_dragon_sword",
        new Item(new FabricItemSettings().group(ItemGroup.COMBAT)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ChukksMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        ChukksMod.LOGGER.info("Registering Mod Items for " + ChukksMod.MOD_ID);
    }

}
