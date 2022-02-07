package net.chukkthedukk.chukksmod.block;

import net.chukkthedukk.chukksmod.ChukksMod;
import net.chukkthedukk.chukksmod.block.custom.*;
import net.chukkthedukk.chukksmod.item.ModItemGroup;
import net.chukkthedukk.chukksmod.item.ModItems;
import net.chukkthedukk.chukksmod.world.features.tree.EndwoodSaplingGenerator;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.SignType;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block IRIDIUM_ORE = registerBlock("iridium_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool()), ModItemGroup.CHUKKSMOD_BLOCKS);
    public static final Block IRIDIUM_BLOCK = registerBlock("iridium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(7.5f).requiresTool()), ModItemGroup.CHUKKSMOD_BLOCKS);

    public static final Block ENDWOOD_LOG = registerBlock("endwood_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), ModItemGroup.CHUKKSMOD_BLOCKS);
    public static final Block ENDWOOD_WOOD = registerBlock("endwood_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)), ModItemGroup.CHUKKSMOD_BLOCKS);
    public static final Block STRIPPED_ENDWOOD_LOG = registerBlock("stripped_endwood_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)), ModItemGroup.CHUKKSMOD_BLOCKS);
    public static final Block STRIPPED_ENDWOOD_WOOD = registerBlock("stripped_endwood_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)), ModItemGroup.CHUKKSMOD_BLOCKS);
    public static final Block ENDWOOD_PLANKS = registerBlock("endwood_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroup.CHUKKSMOD_BLOCKS);
    public static final Block ENDWOOD_LEAVES = registerBlock("endwood_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)), ModItemGroup.CHUKKSMOD_BLOCKS);
    public static final Block ENDWOOD_SAPLING = registerBlock("endwood_sapling",
            new ModSaplingBlock(new EndwoodSaplingGenerator(),
                    FabricBlockSettings.copy(Blocks.OAK_SAPLING)), ModItemGroup.CHUKKSMOD_BLOCKS);
    public static final Block ENDWOOD_BUTTON = registerBlock("endwood_button",
            new ModWoodenButtonBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(4.0f).noCollision()), ModItemGroup.CHUKKSMOD_BLOCKS);
    public static final Block ENDWOOD_PRESSURE_PLATE = registerBlock("endwood_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.WOOD)
                    .strength(4.0f)), ModItemGroup.CHUKKSMOD_BLOCKS);
    public static final Block ENDWOOD_FENCE = registerBlock("endwood_fence",
            new FenceBlock(FabricBlockSettings.of(Material.WOOD) .strength(4.0f)), ModItemGroup.CHUKKSMOD_BLOCKS);
    public static final Block ENDWOOD_FENCE_GATE = registerBlock("endwood_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.WOOD) .strength(4.0f)), ModItemGroup.CHUKKSMOD_BLOCKS);
    public static final Block ENDWOOD_STAIRS = registerBlock("endwood_stairs",
            new ModStairsBlock(ModBlocks.ENDWOOD_PLANKS.getDefaultState(),
                    FabricBlockSettings.of(Material.WOOD).strength(4.0f)), ModItemGroup.CHUKKSMOD_BLOCKS);
    public static final Block ENDWOOD_SLAB = registerBlock("endwood_slab",
            new SlabBlock(FabricBlockSettings.of(Material.WOOD).strength(4.0f)), ModItemGroup.CHUKKSMOD_BLOCKS);
    public static final Block ENDWOOD_SIGN = registerSignBlock("endwood_sign",
            new ModSignBlock(AbstractBlock.Settings.of(Material.WOOD).strength(4.0f).noCollision(), SignType.OAK));
    public static final Block ENDWOOD_WALL_SIGN = registerSignBlock("endwood_wall_sign",
            new ModWallSignBlock(AbstractBlock.Settings.of(Material.WOOD).strength(4.0f).noCollision(), SignType.OAK));

    private static Block registerBlockWithoutBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.BLOCK, new Identifier(ChukksMod.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockitem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(ChukksMod.MOD_ID, name), block);
    }

    private static Block registerSignBlock(String name, Block block) {
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