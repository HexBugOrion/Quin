package net.timeworndevs.quin.common;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.timeworndevs.quin.init.QuinRegistry;


public class CommonItemRegistry {

    public static Item RESIN;

    public static BlockItem RESIN_BLOCK;

    public static BlockItem DRIFTWOOD_LOG;
    public static BlockItem DRIFTWOOD;
    public static BlockItem DRIFTWOOD_PLANKS;
    public static BlockItem DRIFTWOOD_STAIRS;
    public static BlockItem DRIFTWOOD_SLAB;
    public static BlockItem DRIFTWOOD_FENCE;
    public static BlockItem DRIFTWOOD_FENCE_GATE;
    public static BlockItem DRIFTWOOD_DOOR;
    public static BlockItem DRIFTWOOD_TRAPDOOR;
    public static BlockItem DRIFTWOOD_PRESSURE_PLATE;
    public static BlockItem DRIFTWOOD_BUTTON;

    public static SignItem DRIFTWOOD_SIGN;
    public static HangingSignItem DRIFTWOOD_HANGING_SIGN;

    public static void register(){
        RESIN = QuinRegistry.register("resin", new Item(new Item.Settings()));
        RESIN_BLOCK = QuinRegistry.register("resin_block", new BlockItem(CommonBlockRegistry.RESIN_BLOCK, new Item.Settings()));

        DRIFTWOOD_LOG = QuinRegistry.register("driftwood_log", new BlockItem(CommonBlockRegistry.DRIFTWOOD_LOG, new Item.Settings()));
        DRIFTWOOD = QuinRegistry.register("driftwood", new BlockItem(CommonBlockRegistry.DRIFTWOOD, new Item.Settings()));
        DRIFTWOOD_PLANKS = QuinRegistry.register("driftwood_planks", new BlockItem(CommonBlockRegistry.DRIFTWOOD_PLANKS, new Item.Settings()));
        DRIFTWOOD_STAIRS = QuinRegistry.register("driftwood_stairs", new BlockItem(CommonBlockRegistry.DRIFTWOOD_STAIRS, new Item.Settings()));
        DRIFTWOOD_SLAB = QuinRegistry.register("driftwood_slab", new BlockItem(CommonBlockRegistry.DRIFTWOOD_SLAB, new Item.Settings()));
        DRIFTWOOD_FENCE = QuinRegistry.register("driftwood_fence", new BlockItem(CommonBlockRegistry.DRIFTWOOD_FENCE, new Item.Settings()));
        DRIFTWOOD_FENCE_GATE = QuinRegistry.register("driftwood_fence_gate", new BlockItem(CommonBlockRegistry.DRIFTWOOD_FENCE_GATE, new Item.Settings()));
        DRIFTWOOD_DOOR = QuinRegistry.register("driftwood_door", new BlockItem(CommonBlockRegistry.DRIFTWOOD_DOOR, new Item.Settings()));
        DRIFTWOOD_TRAPDOOR = QuinRegistry.register("driftwood_trapdoor", new BlockItem(CommonBlockRegistry.DRIFTWOOD_TRAPDOOR, new Item.Settings()));
        DRIFTWOOD_PRESSURE_PLATE = QuinRegistry.register("driftwood_pressure_plate", new BlockItem(CommonBlockRegistry.DRIFTWOOD_PRESSURE_PLATE, new Item.Settings()));
        DRIFTWOOD_BUTTON = QuinRegistry.register("driftwood_button", new BlockItem(CommonBlockRegistry.DRIFTWOOD_BUTTON, new Item.Settings()));
        itemGroupAdditions();
    }

    public static void itemGroupAdditions(){

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(Items.WARPED_BUTTON, DRIFTWOOD_LOG);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(DRIFTWOOD_LOG, DRIFTWOOD);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(DRIFTWOOD, DRIFTWOOD_PLANKS);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(DRIFTWOOD_PLANKS, DRIFTWOOD_STAIRS);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(DRIFTWOOD_STAIRS, DRIFTWOOD_SLAB);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(DRIFTWOOD_SLAB, DRIFTWOOD_FENCE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(DRIFTWOOD_FENCE, DRIFTWOOD_FENCE_GATE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(DRIFTWOOD_FENCE_GATE, DRIFTWOOD_DOOR);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(DRIFTWOOD_DOOR, DRIFTWOOD_TRAPDOOR);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(DRIFTWOOD_TRAPDOOR, DRIFTWOOD_PRESSURE_PLATE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(DRIFTWOOD_PRESSURE_PLATE, DRIFTWOOD_BUTTON);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> {content.addAfter(Items.WARPED_HANGING_SIGN, DRIFTWOOD_SIGN);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> {content.addAfter(DRIFTWOOD_SIGN, DRIFTWOOD_HANGING_SIGN);});
    }
}
