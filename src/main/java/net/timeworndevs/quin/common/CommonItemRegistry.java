package net.timeworndevs.quin.common;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.Blocks;
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

    public static BlockItem ROPE;

    public static BlockItem TINTED_CRYSTAL;
    public static BlockItem WHITE_CRYSTAL;
    public static BlockItem LIGHT_GRAY_CRYSTAL;
    public static BlockItem GRAY_CRYSTAL;
    public static BlockItem BLACK_CRYSTAL;
    public static BlockItem BROWN_CRYSTAL;
    public static BlockItem RED_CRYSTAL;
    public static BlockItem ORANGE_CRYSTAL;
    public static BlockItem YELLOW_CRYSTAL;
    public static BlockItem LIME_CRYSTAL;
    public static BlockItem GREEN_CRYSTAL;
    public static BlockItem CYAN_CRYSTAL;
    public static BlockItem LIGHT_BLUE_CRYSTAL;
    public static BlockItem BLUE_CRYSTAL;
    public static BlockItem PURPLE_CRYSTAL;
    public static BlockItem MAGENTA_CRYSTAL;
    public static BlockItem PINK_CRYSTAL;

    public static BlockItem OXIDIZED_COPPER_PANEL;
    public static BlockItem WEATHERED_COPPER_PANEL;
    public static BlockItem EXPOSED_COPPER_PANEL;
    public static BlockItem COPPER_PANEL;
    public static BlockItem WAXED_OXIDIZED_COPPER_PANEL;
    public static BlockItem WAXED_WEATHERED_COPPER_PANEL;
    public static BlockItem WAXED_EXPOSED_COPPER_PANEL;
    public static BlockItem WAXED_COPPER_PANEL;


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

        ROPE = QuinRegistry.register("rope", new BlockItem(CommonBlockRegistry.ROPE, new Item.Settings()));


        TINTED_CRYSTAL = QuinRegistry.register("tinted_crystal", new BlockItem(CommonBlockRegistry.TINTED_CRYSTAL, new Item.Settings()));
        WHITE_CRYSTAL = QuinRegistry.register("white_crystal", new BlockItem(CommonBlockRegistry.WHITE_CRYSTAL, new Item.Settings()));
        LIGHT_GRAY_CRYSTAL = QuinRegistry.register("light_gray_crystal", new BlockItem(CommonBlockRegistry.LIGHT_GRAY_CRYSTAL, new Item.Settings()));
        GRAY_CRYSTAL = QuinRegistry.register("gray_crystal", new BlockItem(CommonBlockRegistry.GRAY_CRYSTAL, new Item.Settings()));
        BLACK_CRYSTAL = QuinRegistry.register("black_crystal", new BlockItem(CommonBlockRegistry.BLACK_CRYSTAL, new Item.Settings()));
        BROWN_CRYSTAL = QuinRegistry.register("brown_crystal", new BlockItem(CommonBlockRegistry.BROWN_CRYSTAL, new Item.Settings()));
        RED_CRYSTAL = QuinRegistry.register("red_crystal", new BlockItem(CommonBlockRegistry.RED_CRYSTAL, new Item.Settings()));
        ORANGE_CRYSTAL = QuinRegistry.register("orange_crystal", new BlockItem(CommonBlockRegistry.ORANGE_CRYSTAL, new Item.Settings()));
        YELLOW_CRYSTAL = QuinRegistry.register("yellow_crystal", new BlockItem(CommonBlockRegistry.YELLOW_CRYSTAL, new Item.Settings()));
        LIME_CRYSTAL = QuinRegistry.register("lime_crystal", new BlockItem(CommonBlockRegistry.LIME_CRYSTAL, new Item.Settings()));
        GREEN_CRYSTAL = QuinRegistry.register("green_crystal", new BlockItem(CommonBlockRegistry.GREEN_CRYSTAL, new Item.Settings()));
        CYAN_CRYSTAL = QuinRegistry.register("cyan_crystal", new BlockItem(CommonBlockRegistry.CYAN_CRYSTAL, new Item.Settings()));
        LIGHT_BLUE_CRYSTAL = QuinRegistry.register("light_blue_crystal", new BlockItem(CommonBlockRegistry.LIGHT_BLUE_CRYSTAL, new Item.Settings()));
        BLUE_CRYSTAL = QuinRegistry.register("blue_crystal", new BlockItem(CommonBlockRegistry.BLUE_CRYSTAL, new Item.Settings()));
        PURPLE_CRYSTAL = QuinRegistry.register("purple_crystal", new BlockItem(CommonBlockRegistry.PURPLE_CRYSTAL, new Item.Settings()));
        MAGENTA_CRYSTAL = QuinRegistry.register("magenta_crystal", new BlockItem(CommonBlockRegistry.MAGENTA_CRYSTAL, new Item.Settings()));
        PINK_CRYSTAL = QuinRegistry.register("pink_crystal", new BlockItem(CommonBlockRegistry.PINK_CRYSTAL, new Item.Settings()));

        OXIDIZED_COPPER_PANEL = QuinRegistry.register("oxidized_copper_panel", new BlockItem(CommonBlockRegistry.OXIDIZED_COPPER_PANEL, new Item.Settings()));
        WEATHERED_COPPER_PANEL = QuinRegistry.register("weathered_copper_panel", new BlockItem(CommonBlockRegistry.WEATHERED_COPPER_PANEL, new Item.Settings()));
        EXPOSED_COPPER_PANEL = QuinRegistry.register("exposed_copper_panel", new BlockItem(CommonBlockRegistry.EXPOSED_COPPER_PANEL, new Item.Settings()));
        COPPER_PANEL = QuinRegistry.register("copper_panel", new BlockItem(CommonBlockRegistry.COPPER_PANEL, new Item.Settings()));

        WAXED_OXIDIZED_COPPER_PANEL = QuinRegistry.register("waxed_oxidized_copper_panel", new BlockItem(CommonBlockRegistry.WAXED_OXIDIZED_COPPER_PANEL, new Item.Settings()));
        WAXED_WEATHERED_COPPER_PANEL = QuinRegistry.register("waxed_weathered_copper_panel", new BlockItem(CommonBlockRegistry.WAXED_WEATHERED_COPPER_PANEL, new Item.Settings()));
        WAXED_EXPOSED_COPPER_PANEL = QuinRegistry.register("waxed_exposed_copper_panel", new BlockItem(CommonBlockRegistry.WAXED_EXPOSED_COPPER_PANEL, new Item.Settings()));
        WAXED_COPPER_PANEL = QuinRegistry.register("waxed_copper_panel", new BlockItem(CommonBlockRegistry.WAXED_COPPER_PANEL, new Item.Settings()));

        itemGroupAdditions();
        addFurnaceFuels();
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

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(Items.CHAIN, ROPE);});

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(TINTED_CRYSTAL);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(WHITE_CRYSTAL);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(LIGHT_GRAY_CRYSTAL);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(GRAY_CRYSTAL);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(BLACK_CRYSTAL);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(BROWN_CRYSTAL);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(RED_CRYSTAL);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(ORANGE_CRYSTAL);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(YELLOW_CRYSTAL);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(LIME_CRYSTAL);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(GREEN_CRYSTAL);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(CYAN_CRYSTAL);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(LIGHT_BLUE_CRYSTAL);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(BLUE_CRYSTAL);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(PURPLE_CRYSTAL);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(MAGENTA_CRYSTAL);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {content.add(PINK_CRYSTAL);});

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(Items.OXIDIZED_COPPER, OXIDIZED_COPPER_PANEL);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(Items.WEATHERED_COPPER, WEATHERED_COPPER_PANEL);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(Items.EXPOSED_COPPER, EXPOSED_COPPER_PANEL);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(Items.COPPER_BLOCK, COPPER_PANEL);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(Items.WAXED_OXIDIZED_COPPER, WAXED_OXIDIZED_COPPER_PANEL);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(Items.WAXED_WEATHERED_COPPER, WAXED_WEATHERED_COPPER_PANEL);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(Items.WAXED_EXPOSED_COPPER, WAXED_EXPOSED_COPPER_PANEL);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.addAfter(Items.WAXED_COPPER_BLOCK, WAXED_COPPER_PANEL);});
    }

    public static void addFurnaceFuels() {
        FuelRegistry fuelRegistry = FuelRegistry.INSTANCE;

        fuelRegistry.add(RESIN, 800);
        fuelRegistry.add(RESIN_BLOCK, 7200);
    }
}
