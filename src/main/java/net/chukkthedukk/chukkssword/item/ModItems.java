package net.chukkthedukk.chukkssword.item;

import net.chukkthedukk.chukkssword.ChukksSword;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item FIRE_DRAGON_SWORD =registerItem( "fire_dragon_sword",
        new Item(new FabricItemSettings().group(ItemGroup.COMBAT)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ChukksSword.MOD_ID, name), item);
    }

    public static void registerModItems(){
        ChukksSword.LOGGER.info("Registering Mod Items for " + ChukksSword.MOD_ID);
    }

}
