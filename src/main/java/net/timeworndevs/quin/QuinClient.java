package net.timeworndevs.quin;

import com.terraformersmc.terraform.sign.SpriteIdentifierRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.render.TexturedRenderLayers;
import net.minecraft.client.util.SpriteIdentifier;
import net.timeworndevs.quin.common.CommonBlockRegistry;

public class QuinClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        initializeTextures();
    }

    private static void initializeTextures() {
        //SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, CommonBlockRegistry.DRIFTWOOD_SIGN.getTexture()));
        //SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, CommonBlockRegistry.DRIFTWOOD_HANGING_SIGN.getTexture()));
    }
}
