package net.chukkthedukk.chukksmod.item;

import net.chukkthedukk.chukksmod.ChukksMod;
import net.chukkthedukk.chukksmod.block.ModBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup CHUKKSMOD_ITEMS = FabricItemGroupBuilder.build(new Identifier(ChukksMod.MOD_ID, "chukksmod_items"),
            () -> new ItemStack(ModItems.IRIDIUM_INGOT));
    public static final ItemGroup CHUKKSMOD_BLOCKS = FabricItemGroupBuilder.build(new Identifier(ChukksMod.MOD_ID, "chukksmod_blocks"),
            () -> new ItemStack(ModBlocks.IRIDIUM_BLOCK));
}

