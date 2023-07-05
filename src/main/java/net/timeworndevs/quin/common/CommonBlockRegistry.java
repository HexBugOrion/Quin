package net.timeworndevs.quin.common;

import com.terraformersmc.terraform.sign.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallSignBlock;
import com.terraformersmc.terraform.wood.block.PillarLogHelper;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.sound.BlockSoundGroup;
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

    public static TerraformSignBlock DRIFTWOOD_SIGN;
    public static TerraformWallSignBlock DRIFTWOOD_WALL_SIGN;
    public static TerraformHangingSignBlock DRIFTWOOD_HANGING_SIGN;
    public static TerraformWallHangingSignBlock DRIFTWOOD_WALL_HANGING_SIGN;

    public static void register() {
        RESIN_BLOCK = QuinRegistry.register("resin_block", new Block(FabricBlockSettings.of().mapColor(MapColor.BROWN).strength(0).sounds(BlockSoundGroup.PACKED_MUD)));
        TREE_TAP = QuinRegistry.register("tree_tap", new TreeTapBlock(FabricBlockSettings.of().mapColor(MapColor.OAK_TAN).strength(2,3).sounds(BlockSoundGroup.WOOD).requiresTool()));

        DRIFTWOOD_LOG = QuinRegistry.register("driftwood_log", new PillarBlock(FabricBlockSettings.of().mapColor(MapColor.OFF_WHITE).sounds(BlockSoundGroup.NETHER_WOOD)));
        DRIFTWOOD = QuinRegistry.register("driftwood", new PillarBlock(FabricBlockSettings.of().mapColor(MapColor.OFF_WHITE).sounds(BlockSoundGroup.NETHER_WOOD)));
        DRIFTWOOD_PLANKS = QuinRegistry.register("driftwood_planks", new Block(FabricBlockSettings.of().mapColor(MapColor.OFF_WHITE).sounds(BlockSoundGroup.NETHER_WOOD)));
        DRIFTWOOD_STAIRS = QuinRegistry.register("driftwood_stairs", new StairsBlock(DRIFTWOOD_PLANKS.getDefaultState(), FabricBlockSettings.of().mapColor(MapColor.OFF_WHITE).sounds(BlockSoundGroup.NETHER_WOOD)));
        DRIFTWOOD_SLAB = QuinRegistry.register("driftwood_slab", new SlabBlock(FabricBlockSettings.of().mapColor(MapColor.OFF_WHITE).sounds(BlockSoundGroup.NETHER_WOOD)));
        DRIFTWOOD_FENCE = QuinRegistry.register("driftwood_fence", new FenceBlock(FabricBlockSettings.of().mapColor(MapColor.OFF_WHITE).sounds(BlockSoundGroup.NETHER_WOOD)));
        DRIFTWOOD_FENCE_GATE = QuinRegistry.register("driftwood_fence_gate", new FenceGateBlock(FabricBlockSettings.of().mapColor(MapColor.OFF_WHITE).sounds(BlockSoundGroup.NETHER_WOOD), WoodType.CRIMSON));
        DRIFTWOOD_DOOR = QuinRegistry.register("driftwood_door", new DoorBlock(FabricBlockSettings.of().mapColor(MapColor.OFF_WHITE).sounds(BlockSoundGroup.NETHER_WOOD), BlockSetType.CRIMSON));
        DRIFTWOOD_TRAPDOOR = QuinRegistry.register("driftwood_trapdoor", new TrapdoorBlock(FabricBlockSettings.of().mapColor(MapColor.OFF_WHITE).sounds(BlockSoundGroup.NETHER_WOOD), BlockSetType.CRIMSON));
        DRIFTWOOD_PRESSURE_PLATE = QuinRegistry.register("driftwood_pressure_plate", new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of().mapColor(MapColor.OFF_WHITE).sounds(BlockSoundGroup.NETHER_WOOD).pistonBehavior(PistonBehavior.DESTROY),BlockSetType.CRIMSON));
        DRIFTWOOD_BUTTON = QuinRegistry.register("driftwood_button", new ButtonBlock(FabricBlockSettings.of().mapColor(MapColor.OFF_WHITE).sounds(BlockSoundGroup.NETHER_WOOD).pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CRIMSON, 30, true));

        final Identifier DRIFTWOOD_SIGN_TEXTURE = Identifier.of(QuinMain.MODID, "entity/signs/driftwood_sign");
        DRIFTWOOD_SIGN = QuinRegistry.register("driftwood_sign", new TerraformSignBlock(DRIFTWOOD_SIGN_TEXTURE, FabricBlockSettings.of().mapColor(MapColor.OFF_WHITE).sounds(BlockSoundGroup.NETHER_WOOD).noCollision()));
        DRIFTWOOD_WALL_SIGN = QuinRegistry.register("driftwood_Wall_sign", new TerraformWallSignBlock(DRIFTWOOD_SIGN_TEXTURE, FabricBlockSettings.of().mapColor(MapColor.OFF_WHITE).sounds(BlockSoundGroup.NETHER_WOOD).noCollision().dropsLike(DRIFTWOOD_SIGN)));
        final Identifier DRIFTWOOD_HANGING_SIGN_TEXTURE = Identifier.of(QuinMain.MODID, "entity/signs/hanging/driftwood");
        final Identifier DRIFTWOOD_HANGING_SIGN_GUI_TEXTURE = Identifier.of(QuinMain.MODID, "textures/gui/hanging_signs/driftwood");
        DRIFTWOOD_HANGING_SIGN = QuinRegistry.register("driftwood_hanging_sign", new TerraformHangingSignBlock(DRIFTWOOD_HANGING_SIGN_TEXTURE, DRIFTWOOD_HANGING_SIGN_GUI_TEXTURE, FabricBlockSettings.of().mapColor(MapColor.OFF_WHITE).sounds(BlockSoundGroup.NETHER_WOOD).noCollision()));
        DRIFTWOOD_WALL_HANGING_SIGN = QuinRegistry.register("driftwood_wall_hanging_sign", new TerraformWallHangingSignBlock(DRIFTWOOD_HANGING_SIGN_TEXTURE, DRIFTWOOD_HANGING_SIGN_GUI_TEXTURE, FabricBlockSettings.of().mapColor(MapColor.OFF_WHITE).sounds(BlockSoundGroup.NETHER_WOOD).noCollision().dropsLike(DRIFTWOOD_HANGING_SIGN)));

    }

    public static void addBurnables() {
        FlammableBlockRegistry flammableRegistry = FlammableBlockRegistry.getDefaultInstance();

        flammableRegistry.add(RESIN_BLOCK,5,6);
    }
}
