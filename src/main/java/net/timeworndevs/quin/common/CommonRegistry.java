package net.timeworndevs.quin.common;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.advancement.criterion.FishingRodHookedCriterion;
import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.timeworndevs.quin.QuinMain;
import net.timeworndevs.quin.block.TreeTapBlock;

public class CommonRegistry {

    //preparations for registry rework
    private static Block registerBlock(String id, Block block) {
        return (Block)Registry.register(Registries.BLOCK, id, block);
    }

    public static final Item RESIN = new Item(new FabricItemSettings());
    public static final Block RESIN_BLOCK = new Block(FabricBlockSettings.of().mapColor(MapColor.BROWN).sounds(BlockSoundGroup.PACKED_MUD).strength(0,0));

    public static final TreeTapBlock TREE_TAP = new TreeTapBlock(FabricBlockSettings.of().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(2,3).requiresTool());

    public static final Item RESIN_CHISEL = new Item(new FabricItemSettings().maxDamage(238));

    public static final Item SAP_BOTTLE = new Item(new FabricItemSettings().maxCount(16));
    public static final Item SYRUP_BOTTLE = new HoneyBottleItem(new FabricItemSettings().maxCount(16).food(FoodComponents.HONEY_BOTTLE).recipeRemainder(Items.GLASS_BOTTLE));

    //public static final Item ENDER_LOIN = new Item(new FabricItemSettings());
    //public static final Item RAW_ENDER_LOIN = new Item(new FabricItemSettings());

    //public static final Item DOUBLOON = new Item(new FabricItemSettings());

    public static final Item GELRENE_CUBE = new Item(new FabricItemSettings());
    public static final Block GELRENE_BLOCK = new Block(FabricBlockSettings.of().mapColor(MapColor.PALE_GREEN).sounds(BlockSoundGroup.CALCITE));

    //public static final PettyEXPShardItem PETTY_EXP_SHARD = new PettyEXPShardItem(new FabricItemSettings());
    //public static final MediumEXPShardItem MEDIUM_EXP_SHARD = new MediumEXPShardItem(new FabricItemSettings());
    //public static final GreaterEXPShardItem GREATER_EXP_SHARD = new GreaterEXPShardItem(new FabricItemSettings());

    public static final PillarBlock DRIFTWOOD_LOG = new PillarBlock(FabricBlockSettings.of().mapColor(MapColor.OFF_WHITE).strength(2.0f).sounds(BlockSoundGroup.NETHER_WOOD));
    public static final Block DRIFTWOOD_PLANKS = new Block(FabricBlockSettings.of().mapColor(MapColor.OFF_WHITE).strength(2.0F, 3.0F).sounds(BlockSoundGroup.NETHER_WOOD));
    public static final DoorBlock DRIFTWOOD_DOOR = new DoorBlock(FabricBlockSettings.of().mapColor(MapColor.OFF_WHITE), BlockSetType.CRIMSON);


    public static void register() {
        Registry.register(Registries.ITEM, new Identifier(QuinMain.MODID, "resin"), RESIN);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.addAfter(Items.EXPERIENCE_BOTTLE, RESIN);});

        Registry.register(Registries.BLOCK, new Identifier(QuinMain.MODID, "resin_block"), RESIN_BLOCK);
        Registry.register(Registries.ITEM, new Identifier(QuinMain.MODID, "resin_block"), new BlockItem(RESIN_BLOCK, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(RESIN_BLOCK);});

        Registry.register(Registries.BLOCK, new Identifier(QuinMain.MODID, "tree_tap"), TREE_TAP);
        Registry.register(Registries.ITEM, new Identifier(QuinMain.MODID, "tree_tap"), new BlockItem(TREE_TAP, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content->{content.add(TREE_TAP);});

        Registry.register(Registries.ITEM, new Identifier(QuinMain.MODID, "resin_chisel"), RESIN_CHISEL);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {content.add(RESIN_CHISEL);});

        Registry.register(Registries.ITEM, new Identifier(QuinMain.MODID, "sap_bottle"), SAP_BOTTLE);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.addAfter(RESIN, SAP_BOTTLE);});

        Registry.register(Registries.ITEM, new Identifier(QuinMain.MODID, "syrup_bottle"), SYRUP_BOTTLE);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(content -> {content.addAfter(Items.HONEY_BOTTLE, SYRUP_BOTTLE);});

        //Registry.register(Registries.ITEM, new Identifier(QuinMain.MODID, "ender_loin"), ENDER_LOIN);
        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(content -> {content.addAfter(SYRUP_BOTTLE, ENDER_LOIN);});

        //Registry.register(Registries.ITEM, new Identifier(QuinMain.MODID, "raw_ender_loin"), RAW_ENDER_LOIN);
        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(content -> {content.addAfter(ENDER_LOIN, RAW_ENDER_LOIN);});

        //Registry.register(Registries.ITEM, new Identifier(QuinMain.MODID, "doubloon"), DOUBLOON);
        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content ->{content.addAfter(Items.EMERALD, DOUBLOON);});

        Registry.register(Registries.ITEM, new Identifier(QuinMain.MODID, "gelrene_cube"), GELRENE_CUBE);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content ->{content.addAfter(SAP_BOTTLE, GELRENE_CUBE);});

        Registry.register(Registries.BLOCK, new Identifier(QuinMain.MODID, "gelrene_block"), GELRENE_BLOCK);
        Registry.register(Registries.ITEM, new Identifier(QuinMain.MODID, "gelrene_block"), new BlockItem(GELRENE_BLOCK, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(GELRENE_BLOCK);});

        //Registry.register(Registries.ITEM, new Identifier(QuinMain.MODID, "petty_shard"), PETTY_EXP_SHARD);
        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content ->{content.addAfter(GELRENE_CUBE, PETTY_EXP_SHARD);});

        //Registry.register(Registries.ITEM, new Identifier(QuinMain.MODID, "medium_shard"), MEDIUM_EXP_SHARD);
        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content ->{content.addAfter(PETTY_EXP_SHARD, MEDIUM_EXP_SHARD);});

        //Registry.register(Registries.ITEM, new Identifier(QuinMain.MODID, "greater_shard"), GREATER_EXP_SHARD);
        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content ->{content.addAfter(MEDIUM_EXP_SHARD, GREATER_EXP_SHARD);});

        //logs
        Registry.register(Registries.BLOCK, new Identifier(QuinMain.MODID, "driftwood_log"), DRIFTWOOD_LOG);
        Registry.register(Registries.ITEM, new Identifier(QuinMain.MODID, "driftwood_log"), new BlockItem(DRIFTWOOD_LOG, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(DRIFTWOOD_LOG);});

        //planks
        Registry.register(Registries.BLOCK, new Identifier(QuinMain.MODID, "driftwood_planks"), DRIFTWOOD_PLANKS);
        Registry.register(Registries.ITEM, new Identifier(QuinMain.MODID, "driftwood_planks"), new BlockItem(DRIFTWOOD_PLANKS, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(DRIFTWOOD_PLANKS);});

        //door
        Registry.register(Registries.BLOCK, new Identifier(QuinMain.MODID, "driftwood_door"), DRIFTWOOD_DOOR);
        Registry.register(Registries.ITEM, new Identifier(QuinMain.MODID, "driftwood_door"), new BlockItem(DRIFTWOOD_DOOR, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(DRIFTWOOD_DOOR);});
    }
}
