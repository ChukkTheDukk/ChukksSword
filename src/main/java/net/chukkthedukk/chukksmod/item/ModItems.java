package net.chukkthedukk.chukksmod.item;

import net.chukkthedukk.chukksmod.ChukksMod;
import net.chukkthedukk.chukksmod.EnderToolMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item FIRE_DRAGON_SWORD =registerItem( "fire_dragon_sword",
        new Item(new FabricItemSettings().group(ModItemGroup.CHUKKSMOD)));
    public static final Item ENDER_DRAGON_SWORD_HANDLE =registerItem( "ender_dragon_sword_handle",
            new Item(new FabricItemSettings().group(ModItemGroup.CHUKKSMOD)));
    public static final Item ENDER_DRAGON_SWORD_HILT =registerItem( "ender_dragon_sword_hilt",
            new Item(new FabricItemSettings().group(ModItemGroup.CHUKKSMOD)));
    public static final Item PEZZOTTAITE_BLADE =registerItem( "pezzottaite_blade",
            new Item(new FabricItemSettings().group(ModItemGroup.CHUKKSMOD)));
    public static final Item ENDER_DRAGON_SWORD =registerItem( "ender_dragon_sword",
            new SwordItem(EnderToolMaterial.INSTANCE, 6, -2.4f, new Item.Settings().group(ModItemGroup.CHUKKSMOD)));
    public static final Item PEZZOTTAITE =registerItem( "pezzottaite",
            new Item(new FabricItemSettings().group(ModItemGroup.CHUKKSMOD)));
    public static final Item IRIDIUM_INGOT =registerItem( "iridium_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.CHUKKSMOD)));
    public static final Item IRIDIUM_NUGGET =registerItem( "iridium_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.CHUKKSMOD)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ChukksMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        ChukksMod.LOGGER.info("Registering Mod Items for " + ChukksMod.MOD_ID);
    }

}
