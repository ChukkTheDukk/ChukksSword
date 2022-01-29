package net.chukkthedukk.chukksmod.item;

import net.chukkthedukk.chukksmod.ChukksMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup CHUKKSMOD = FabricItemGroupBuilder.build(new Identifier(ChukksMod.MOD_ID, "chukksmod"),
            () -> new ItemStack(ModItems.ENDER_DRAGON_SWORD));
}
