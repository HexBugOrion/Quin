package net.timeworndevs.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.timeworndevs.quin.common.CommonBlockRegistry;
import net.timeworndevs.quin.common.CommonItemRegistry;

public class DataGenMain implements DataGeneratorEntrypoint {

    private static class ModelGen extends FabricModelProvider {

        public ModelGen(FabricDataOutput output) {
            super(output);
        }

        @Override
        public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        }

        @Override
        public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        }
    }

    private class LootTableGen extends FabricBlockLootTableProvider {

        protected LootTableGen(FabricDataOutput dataOutput) {
            super(dataOutput);
        }

        @Override
        public void generate() {
        }
    }

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(ModelGen::new);
        pack.addProvider(LootTableGen::new);
    }
}
