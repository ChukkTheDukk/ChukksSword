package net.chukkthedukk.chukksmod.util;

import net.chukkthedukk.chukksmod.ChukksMod;
import net.fabricmc.fabric.api.tag.TagFactory;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;
import org.lwjgl.system.CallbackI;

public class ModTags {
    public static class Blocks {
        public static final Tag.Identified<Block> ENDWOOD_SAPLING_GROWABLE_BLOCKS =
                createTag("endwood_sapling_growable_blocks");

        private static Tag.Identified<Block> createTag(String name) {
            return TagFactory.BLOCK.create(new Identifier(ChukksMod.MOD_ID, name));
        }

        private static Tag.Identified<Block> createCommonTag(String name) {
            return TagFactory.BLOCK.create(new Identifier("c", name));
        }
    }

    public static class Items {
        public static final Tag.Identified<Item> IRIDIUM_INGOTS = createCommonTag("iridium_ingots");
        public static final Tag.Identified<Item> IRIDIUM_NUGGETS = createCommonTag("iridium_nuggets");

        private static Tag.Identified<Item> createTag(String name) {
            return TagFactory.ITEM.create(new Identifier(ChukksMod.MOD_ID, name));
        }

        private static Tag.Identified<Item> createCommonTag(String name) {
            return TagFactory.ITEM.create(new Identifier("c", name));
        }
    }

}
