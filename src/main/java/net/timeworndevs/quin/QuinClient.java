package net.timeworndevs.quin;

import com.terraformersmc.terraform.sign.SpriteIdentifierRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.TexturedRenderLayers;
import net.minecraft.client.util.SpriteIdentifier;
import net.timeworndevs.quin.common.CommonBlockRegistry;

public class QuinClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        initializeTextures();
        addRendering();
    }

    private static void initializeTextures() {
        //SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, CommonBlockRegistry.DRIFTWOOD_SIGN.getTexture()));
        //SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, CommonBlockRegistry.DRIFTWOOD_HANGING_SIGN.getTexture()));
    }


    public static void addRendering() {
        RenderLayer cutOut = RenderLayer.getCutout();
        RenderLayer translucent = RenderLayer.getTranslucent();

        BlockRenderLayerMap.INSTANCE.putBlocks(translucent, CommonBlockRegistry.WHITE_CRYSTAL, CommonBlockRegistry.LIGHT_GRAY_CRYSTAL, CommonBlockRegistry.GRAY_CRYSTAL, CommonBlockRegistry.BLACK_CRYSTAL, CommonBlockRegistry.BROWN_CRYSTAL, CommonBlockRegistry.RED_CRYSTAL, CommonBlockRegistry.ORANGE_CRYSTAL, CommonBlockRegistry.YELLOW_CRYSTAL, CommonBlockRegistry.LIME_CRYSTAL, CommonBlockRegistry.GREEN_CRYSTAL, CommonBlockRegistry.CYAN_CRYSTAL, CommonBlockRegistry.LIGHT_BLUE_CRYSTAL, CommonBlockRegistry.BLUE_CRYSTAL, CommonBlockRegistry.PURPLE_CRYSTAL, CommonBlockRegistry.MAGENTA_CRYSTAL, CommonBlockRegistry.PINK_CRYSTAL, CommonBlockRegistry.TINTED_CRYSTAL);
    }
}
