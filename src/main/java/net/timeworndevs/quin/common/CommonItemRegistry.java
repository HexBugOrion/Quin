package net.timeworndevs.quin.common;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.Blocks;
import net.minecraft.block.CactusBlock;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.item.*;
import net.timeworndevs.quin.init.QuinRegistry;


public class CommonItemRegistry {

    public static Item RESIN;
    public static Item RESIN_CHISEL;
    public static Item SAP_BOTTLE;
    public static Item SYRUP_BOTTLE;
    public static BlockItem RESIN_BLOCK;
    public static BlockItem TREE_TAP;

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

    //public static SignItem DRIFTWOOD_SIGN;
    //public static HangingSignItem DRIFTWOOD_HANGING_SIGN;


    public static void register(){
        RESIN = QuinRegistry.register("resin", new Item(new Item.Settings()));
        RESIN_BLOCK = QuinRegistry.register("resin_block", new BlockItem(CommonBlockRegistry.RESIN_BLOCK, new Item.Settings()));
        TREE_TAP = QuinRegistry.register("tree_tap", new BlockItem(CommonBlockRegistry.TREE_TAP, new Item.Settings()));
        SAP_BOTTLE = QuinRegistry.register("sap_bottle", new Item(new Item.Settings()));
        SYRUP_BOTTLE = QuinRegistry.register("syrup_bottle", new HoneyBottleItem(new Item.Settings().food(FoodComponents.HONEY_BOTTLE).recipeRemainder(Items.GLASS_BOTTLE)));
        RESIN_CHISEL = QuinRegistry.register("resin_chisel", new Item(new Item.Settings().maxDamage(238)));

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

        //DRIFTWOOD_SIGN = QuinRegistry.register("driftwood_sign", new SignItem(new Item.Settings().maxCount(16),CommonBlockRegistry.DRIFTWOOD_SIGN, CommonBlockRegistry.DRIFTWOOD_WALL_SIGN));
        //DRIFTWOOD_HANGING_SIGN = QuinRegistry.register("driftwood_hanging_sign", new HangingSignItem(CommonBlockRegistry.DRIFTWOOD_HANGING_SIGN, CommonBlockRegistry.DRIFTWOOD_WALL_HANGING_SIGN, new Item.Settings().maxCount(16)));

        itemGroupAdditions();
    }

    public static void itemGroupAdditions(){

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(RESIN_BLOCK);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.addAfter(Items.EXPERIENCE_BOTTLE, RESIN);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {content.addAfter(RESIN, SAP_BOTTLE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(content -> {content.addAfter(Items.HONEY_BOTTLE, SYRUP_BOTTLE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> {content.addAfter(Items.BEEHIVE, TREE_TAP);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {content.add(RESIN_CHISEL);});

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
        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> {content.addAfter(Items.WARPED_HANGING_SIGN, DRIFTWOOD_SIGN);});
        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> {content.addAfter(DRIFTWOOD_SIGN, DRIFTWOOD_HANGING_SIGN);});

        addFurnaceFuels();
    }

    public static void addFurnaceFuels() {
        FuelRegistry fuelRegistry = FuelRegistry.INSTANCE;

        fuelRegistry.add(RESIN, 800);
        fuelRegistry.add(RESIN_BLOCK, 7200);
    }
}
