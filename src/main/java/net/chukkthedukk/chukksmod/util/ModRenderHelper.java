package net.chukkthedukk.chukksmod.util;

import net.chukkthedukk.chukksmod.block.ModBlocks;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class ModRenderHelper {
    public static void setRenderLayers() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ENDWOOD_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ENDWOOD_LEAVES, RenderLayer.getCutout());
    }
}
