package net.chukkthedukk.chukksmod.block;

import net.chukkthedukk.chukksmod.ChukksMod;
import net.chukkthedukk.chukksmod.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block IRIDIUM_ORE = registerBlock( "iridium_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool()), ModItemGroup.CHUKKSMOD_BLOCKS);
    public static final Block IRIDIUM_BLOCK = registerBlock( "iridium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(7.5f).requiresTool()), ModItemGroup.CHUKKSMOD_BLOCKS);


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockitem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(ChukksMod.MOD_ID, name), block);
    }

    private static Item registerBlockitem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(ChukksMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        ChukksMod.LOGGER.info("Registering ModBlocks for " + ChukksMod.MOD_ID);
    }
}
