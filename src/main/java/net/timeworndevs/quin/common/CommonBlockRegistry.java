package net.timeworndevs.quin.common;

import com.terraformersmc.terraform.sign.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallSignBlock;
import com.terraformersmc.terraform.wood.block.PillarLogHelper;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.impl.blockrenderlayer.BlockRenderLayerMapImpl;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.timeworndevs.quin.QuinMain;
import net.timeworndevs.quin.block.TreeTapBlock;
import net.timeworndevs.quin.init.QuinRegistry;


public class CommonBlockRegistry {

    public static Block RESIN_BLOCK;
    public static TreeTapBlock TREE_TAP;

    //driftwood, again...
    public static Block DRIFTWOOD_LOG;
    public static Block DRIFTWOOD;
    public static Block DRIFTWOOD_PLANKS;
    public static Block DRIFTWOOD_STAIRS;
    public static Block DRIFTWOOD_SLAB;
    public static Block DRIFTWOOD_FENCE;
    public static Block DRIFTWOOD_FENCE_GATE;
    public static Block DRIFTWOOD_DOOR;
    public static Block DRIFTWOOD_TRAPDOOR;
    public static Block DRIFTWOOD_PRESSURE_PLATE;
    public static Block DRIFTWOOD_BUTTON;

    public static Block ROPE;

    public static Block TINTED_CRYSTAL;
    public static Block WHITE_CRYSTAL;
    public static Block LIGHT_GRAY_CRYSTAL;
    public static Block GRAY_CRYSTAL;
    public static Block BLACK_CRYSTAL;
    public static Block BROWN_CRYSTAL;
    public static Block RED_CRYSTAL;
    public static Block ORANGE_CRYSTAL;
    public static Block YELLOW_CRYSTAL;
    public static Block LIME_CRYSTAL;
    public static Block GREEN_CRYSTAL;
    public static Block CYAN_CRYSTAL;
    public static Block LIGHT_BLUE_CRYSTAL;
    public static Block BLUE_CRYSTAL;
    public static Block PURPLE_CRYSTAL;
    public static Block MAGENTA_CRYSTAL;
    public static Block PINK_CRYSTAL;


    //public static TerraformSignBlock DRIFTWOOD_SIGN;
    //public static TerraformWallSignBlock DRIFTWOOD_WALL_SIGN;
    //public static TerraformHangingSignBlock DRIFTWOOD_HANGING_SIGN;
    //public static TerraformWallHangingSignBlock DRIFTWOOD_WALL_HANGING_SIGN;

    public static void register() {
        RESIN_BLOCK = QuinRegistry.register("resin_block", new Block(FabricBlockSettings.of().mapColor(MapColor.BROWN).strength(0).sounds(BlockSoundGroup.PACKED_MUD)));
        TREE_TAP = QuinRegistry.register("tree_tap", new TreeTapBlock(FabricBlockSettings.of().mapColor(MapColor.OAK_TAN).strength(2,3).sounds(BlockSoundGroup.WOOD).requiresTool()));

        DRIFTWOOD_LOG = QuinRegistry.register("driftwood_log", new PillarBlock(FabricBlockSettings.of().mapColor(MapColor.OFF_WHITE).sounds(BlockSoundGroup.NETHER_WOOD).strength(2.0F)));
        DRIFTWOOD = QuinRegistry.register("driftwood", new PillarBlock(FabricBlockSettings.of().mapColor(MapColor.OFF_WHITE).sounds(BlockSoundGroup.NETHER_WOOD).strength(2.0F)));
        DRIFTWOOD_PLANKS = QuinRegistry.register("driftwood_planks", new Block(FabricBlockSettings.of().mapColor(MapColor.OFF_WHITE).sounds(BlockSoundGroup.NETHER_WOOD).strength(2.0F, 3.0F)));
        DRIFTWOOD_STAIRS = QuinRegistry.register("driftwood_stairs", new StairsBlock(DRIFTWOOD_PLANKS.getDefaultState(), FabricBlockSettings.of().mapColor(MapColor.OFF_WHITE).sounds(BlockSoundGroup.NETHER_WOOD).strength(2.0F, 3.0F)));
        DRIFTWOOD_SLAB = QuinRegistry.register("driftwood_slab", new SlabBlock(FabricBlockSettings.of().mapColor(MapColor.OFF_WHITE).sounds(BlockSoundGroup.NETHER_WOOD).strength(2.0F, 3.0F)));
        DRIFTWOOD_FENCE = QuinRegistry.register("driftwood_fence", new FenceBlock(FabricBlockSettings.of().mapColor(MapColor.OFF_WHITE).sounds(BlockSoundGroup.NETHER_WOOD).strength(2.0F, 3.0F)));
        DRIFTWOOD_FENCE_GATE = QuinRegistry.register("driftwood_fence_gate", new FenceGateBlock(FabricBlockSettings.of().mapColor(MapColor.OFF_WHITE).sounds(BlockSoundGroup.NETHER_WOOD).strength(2.0F, 3.0F), WoodType.CRIMSON));
        DRIFTWOOD_DOOR = QuinRegistry.register("driftwood_door", new DoorBlock(FabricBlockSettings.of().mapColor(MapColor.OFF_WHITE).sounds(BlockSoundGroup.NETHER_WOOD).strength(3.0F), BlockSetType.CRIMSON));
        DRIFTWOOD_TRAPDOOR = QuinRegistry.register("driftwood_trapdoor", new TrapdoorBlock(FabricBlockSettings.of().mapColor(MapColor.OFF_WHITE).sounds(BlockSoundGroup.NETHER_WOOD).strength(3.0F), BlockSetType.CRIMSON));
        DRIFTWOOD_PRESSURE_PLATE = QuinRegistry.register("driftwood_pressure_plate", new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of().mapColor(MapColor.OFF_WHITE).sounds(BlockSoundGroup.NETHER_WOOD).strength(0.5F).pistonBehavior(PistonBehavior.DESTROY),BlockSetType.CRIMSON));
        DRIFTWOOD_BUTTON = QuinRegistry.register("driftwood_button", new ButtonBlock(FabricBlockSettings.of().mapColor(MapColor.OFF_WHITE).sounds(BlockSoundGroup.NETHER_WOOD).pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CRIMSON, 30, true));

        //final Identifier DRIFTWOOD_SIGN_TEXTURE = Identifier.of(QuinMain.MODID, "entity/signs/driftwood_sign");
        //DRIFTWOOD_SIGN = QuinRegistry.register("driftwood_sign", new TerraformSignBlock(DRIFTWOOD_SIGN_TEXTURE, FabricBlockSettings.of().mapColor(MapColor.OFF_WHITE).sounds(BlockSoundGroup.NETHER_WOOD).noCollision()));
        //DRIFTWOOD_WALL_SIGN = QuinRegistry.register("driftwood_Wall_sign", new TerraformWallSignBlock(DRIFTWOOD_SIGN_TEXTURE, FabricBlockSettings.of().mapColor(MapColor.OFF_WHITE).sounds(BlockSoundGroup.NETHER_WOOD).noCollision().dropsLike(DRIFTWOOD_SIGN)));
        //final Identifier DRIFTWOOD_HANGING_SIGN_TEXTURE = Identifier.of(QuinMain.MODID, "entity/signs/hanging/driftwood");
        //final Identifier DRIFTWOOD_HANGING_SIGN_GUI_TEXTURE = Identifier.of(QuinMain.MODID, "textures/gui/hanging_signs/driftwood");
        //DRIFTWOOD_HANGING_SIGN = QuinRegistry.register("driftwood_hanging_sign", new TerraformHangingSignBlock(DRIFTWOOD_HANGING_SIGN_TEXTURE, DRIFTWOOD_HANGING_SIGN_GUI_TEXTURE, FabricBlockSettings.of().mapColor(MapColor.OFF_WHITE).sounds(BlockSoundGroup.NETHER_WOOD).noCollision()));
        //DRIFTWOOD_WALL_HANGING_SIGN = QuinRegistry.register("driftwood_wall_hanging_sign", new TerraformWallHangingSignBlock(DRIFTWOOD_HANGING_SIGN_TEXTURE, DRIFTWOOD_HANGING_SIGN_GUI_TEXTURE, FabricBlockSettings.of().mapColor(MapColor.OFF_WHITE).sounds(BlockSoundGroup.NETHER_WOOD).noCollision().dropsLike(DRIFTWOOD_HANGING_SIGN)));

        ROPE = QuinRegistry.register("rope", new ChainBlock(FabricBlockSettings.of().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOL).noCollision()));

        TINTED_CRYSTAL = QuinRegistry.register("tinted_crystal", new TintedGlassBlock(FabricBlockSettings.of().nonOpaque().strength(0.3F).sounds(BlockSoundGroup.GLASS)));
        WHITE_CRYSTAL = QuinRegistry.register("white_crystal", new StainedGlassBlock(DyeColor.WHITE, FabricBlockSettings.of().nonOpaque().strength(0.3F).sounds(BlockSoundGroup.GLASS).requiresTool()));
        LIGHT_GRAY_CRYSTAL = QuinRegistry.register("light_gray_crystal", new StainedGlassBlock(DyeColor.LIGHT_GRAY, FabricBlockSettings.of().nonOpaque().strength(0.3F).sounds(BlockSoundGroup.GLASS).requiresTool()));
        GRAY_CRYSTAL = QuinRegistry.register("gray_crystal", new StainedGlassBlock(DyeColor.GRAY, FabricBlockSettings.of().nonOpaque().strength(0.3F).sounds(BlockSoundGroup.GLASS).requiresTool()));
        BLACK_CRYSTAL = QuinRegistry.register("black_crystal", new StainedGlassBlock(DyeColor.BLACK, FabricBlockSettings.of().nonOpaque().strength(0.3F).sounds(BlockSoundGroup.GLASS).requiresTool()));
        BROWN_CRYSTAL = QuinRegistry.register("brown_crystal", new StainedGlassBlock(DyeColor.BROWN, FabricBlockSettings.of().nonOpaque().strength(0.3F).sounds(BlockSoundGroup.GLASS).requiresTool()));
        RED_CRYSTAL = QuinRegistry.register("red_crystal", new StainedGlassBlock(DyeColor.RED, FabricBlockSettings.of().nonOpaque().strength(0.3F).sounds(BlockSoundGroup.GLASS).requiresTool()));
        ORANGE_CRYSTAL = QuinRegistry.register("orange_crystal", new StainedGlassBlock(DyeColor.ORANGE, FabricBlockSettings.of().nonOpaque().strength(0.3F).sounds(BlockSoundGroup.GLASS).requiresTool()));
        YELLOW_CRYSTAL = QuinRegistry.register("yellow_crystal", new StainedGlassBlock(DyeColor.YELLOW, FabricBlockSettings.of().nonOpaque().strength(0.3F).sounds(BlockSoundGroup.GLASS).requiresTool()));
        LIME_CRYSTAL = QuinRegistry.register("lime_crystal", new StainedGlassBlock(DyeColor.LIME, FabricBlockSettings.of().nonOpaque().strength(0.3F).sounds(BlockSoundGroup.GLASS).requiresTool()));
        GREEN_CRYSTAL = QuinRegistry.register("green_crystal", new StainedGlassBlock(DyeColor.GREEN, FabricBlockSettings.of().nonOpaque().strength(0.3F).sounds(BlockSoundGroup.GLASS).requiresTool()));
        CYAN_CRYSTAL = QuinRegistry.register("cyan_crystal", new StainedGlassBlock(DyeColor.CYAN, FabricBlockSettings.of().nonOpaque().strength(0.3F).sounds(BlockSoundGroup.GLASS).requiresTool()));
        LIGHT_BLUE_CRYSTAL = QuinRegistry.register("light_blue_crystal", new StainedGlassBlock(DyeColor.LIGHT_BLUE, FabricBlockSettings.of().nonOpaque().strength(0.3F).sounds(BlockSoundGroup.GLASS).requiresTool()));
        BLUE_CRYSTAL = QuinRegistry.register("blue_crystal", new StainedGlassBlock(DyeColor.BLUE, FabricBlockSettings.of().nonOpaque().strength(0.3F).sounds(BlockSoundGroup.GLASS).requiresTool()));
        PURPLE_CRYSTAL = QuinRegistry.register("purple_crystal", new StainedGlassBlock(DyeColor.PURPLE, FabricBlockSettings.of().nonOpaque().strength(0.3F).sounds(BlockSoundGroup.GLASS).requiresTool()));
        MAGENTA_CRYSTAL = QuinRegistry.register("magenta_crystal", new StainedGlassBlock(DyeColor.MAGENTA, FabricBlockSettings.of().nonOpaque().strength(0.3F).sounds(BlockSoundGroup.GLASS).requiresTool()));
        PINK_CRYSTAL = QuinRegistry.register("pink_crystal", new StainedGlassBlock(DyeColor.PINK, FabricBlockSettings.of().nonOpaque().strength(0.3F).sounds(BlockSoundGroup.GLASS).requiresTool()));

        addBurnables();
    }


    public static void addBurnables() {
        FlammableBlockRegistry flammableRegistry = FlammableBlockRegistry.getDefaultInstance();

        flammableRegistry.add(RESIN_BLOCK,10,60);
    }

}
