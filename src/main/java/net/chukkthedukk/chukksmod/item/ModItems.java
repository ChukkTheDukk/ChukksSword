package net.chukkthedukk.chukksmod.item;

import net.chukkthedukk.chukksmod.ChukksMod;
import net.chukkthedukk.chukksmod.EnderToolMaterial;
import net.chukkthedukk.chukksmod.TeleportationItem;
import net.chukkthedukk.chukksmod.block.ModBlocks;
import net.chukkthedukk.chukksmod.item.custom.ModSignItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.Item;
import net.minecraft.item.SignItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item FIRE_DRAGON_SWORD =registerItem( "fire_dragon_sword",
            new Item(new FabricItemSettings().group(ModItemGroup.CHUKKSMOD_ITEMS)));
    public static final Item ENDER_DRAGON_SWORD_HANDLE =registerItem( "ender_dragon_sword_handle",
            new Item(new FabricItemSettings().group(ModItemGroup.CHUKKSMOD_ITEMS)));
    public static final Item ENDER_DRAGON_SWORD_HILT =registerItem( "ender_dragon_sword_hilt",
            new Item(new FabricItemSettings().group(ModItemGroup.CHUKKSMOD_ITEMS)));
    public static final Item PEZZOTTAITE_BLADE =registerItem( "pezzottaite_blade",
            new Item(new FabricItemSettings().group(ModItemGroup.CHUKKSMOD_ITEMS)));
    //public static final Item ENDER_DRAGON_SWORD =registerItem( "ender_dragon_sword",
            //new SwordItem(EnderToolMaterial.INSTANCE, 6, -2.4f, new Item.Settings().group(ModItemGroup.CHUKKSMOD_ITEMS)));
    public static final Item PEZZOTTAITE =registerItem( "pezzottaite",
            new Item(new FabricItemSettings().group(ModItemGroup.CHUKKSMOD_ITEMS)));
    public static final Item IRIDIUM_INGOT =registerItem( "iridium_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.CHUKKSMOD_ITEMS)));
    public static final Item IRIDIUM_NUGGET =registerItem( "iridium_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.CHUKKSMOD_ITEMS)));
    public static final Item OBSIDIAN_ROD =registerItem( "obsidian_rod",
            new Item(new FabricItemSettings().group(ModItemGroup.CHUKKSMOD_ITEMS)));
    public static final Item DRAGON_HORN =registerItem( "dragon_horn",
            new Item(new FabricItemSettings().group(ModItemGroup.CHUKKSMOD_ITEMS)));
    public static final Item ENDER_SHARD =registerItem( "ender_shard",
            new Item(new FabricItemSettings().group(ModItemGroup.CHUKKSMOD_ITEMS)));
    public static final Item ENDER_DRAGON_SWORD =registerItem( "ender_dragon_sword",
            new TeleportationItem(EnderToolMaterial.INSTANCE, 6, 1.6f, new Item.Settings().group(ModItemGroup.CHUKKSMOD_ITEMS)));
    public static final Item ENDWOOD_SIGN_ITEM = registerItem("endwood_sign",
            new ModSignItem(new Item.Settings().maxCount(16).group(ModItemGroup.CHUKKSMOD_BLOCKS),
                    ModBlocks.ENDWOOD_SIGN, ModBlocks.ENDWOOD_WALL_SIGN));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ChukksMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        ChukksMod.LOGGER.info("Registering Mod Items for " + ChukksMod.MOD_ID);
    }

}
