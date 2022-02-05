package net.chukkthedukk.chukksmod.block;

import net.chukkthedukk.chukksmod.ChukksMod;
import net.chukkthedukk.chukksmod.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.mixin.object.builder.AbstractBlockSettingsAccessor;
import net.fabricmc.fabric.mixin.object.builder.AbstractBlockSettingsMixin;
import net.minecraft.block.*;
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

    public static final Block ENDWOOD_LOG = registerBlock( "endwood_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), ModItemGroup.CHUKKSMOD_BLOCKS);
    public static final Block ENDWOOD_WOOD = registerBlock( "endwood_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)), ModItemGroup.CHUKKSMOD_BLOCKS);
    public static final Block STRIPPED_ENDWOOD_LOG = registerBlock( "stripped_endwood_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)), ModItemGroup.CHUKKSMOD_BLOCKS);
    public static final Block STRIPPED_ENDWOOD_WOOD = registerBlock( "stripped_endwood_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)), ModItemGroup.CHUKKSMOD_BLOCKS);
    public static final Block ENDWOOD_PLANKS = registerBlock( "endwood_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroup.CHUKKSMOD_BLOCKS);

    private static Block registerBlockWithoutBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.BLOCK, new Identifier(ChukksMod.MOD_ID, name), block);
    }

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
