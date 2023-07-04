package net.timeworndevs.quin.common;


import com.terraformersmc.terraform.sign.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallSignBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.timeworndevs.quin.QuinMain;
import net.timeworndevs.quin.block.TreeTapBlock;

public class CommonDeprecatedRegistry {

    //todo: rewrite everything, and I mean, EVERYTHING.

    public static final Item RESIN = new Item(new FabricItemSettings());
    public static final Block RESIN_BLOCK = new Block(FabricBlockSettings.of().mapColor(MapColor.BROWN).sounds(BlockSoundGroup.PACKED_MUD).strength(0,0));

    public static final TreeTapBlock TREE_TAP = new TreeTapBlock(FabricBlockSettings.of().mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD).strength(2,3).requiresTool());

    public static final Item RESIN_CHISEL = new Item(new FabricItemSettings().maxDamage(238));

    public static final Item SAP_BOTTLE = new Item(new FabricItemSettings().maxCount(16));
    public static final Item SYRUP_BOTTLE = new HoneyBottleItem(new FabricItemSettings().maxCount(16).food(FoodComponents.HONEY_BOTTLE).recipeRemainder(Items.GLASS_BOTTLE));


    public static final Item GELRENE_CUBE = new Item(new FabricItemSettings());
    public static final Block GELRENE_BLOCK = new Block(FabricBlockSettings.of().mapColor(MapColor.PALE_GREEN).sounds(BlockSoundGroup.CALCITE));

    //Driftwood Set!
    public static final PillarBlock DRIFTWOOD_LOG = new PillarBlock(FabricBlockSettings.of().mapColor(MapColor.OFF_WHITE).strength(2.0f).sounds(BlockSoundGroup.NETHER_WOOD));
    public static final PillarBlock DRIFTWOOD = new PillarBlock(FabricBlockSettings.of().mapColor(MapColor.OFF_WHITE).strength(2.0f).sounds(BlockSoundGroup.NETHER_WOOD));
    public static final Block DRIFTWOOD_PLANKS = new Block(FabricBlockSettings.of().mapColor(MapColor.OFF_WHITE).strength(2.0F, 3.0F).sounds(BlockSoundGroup.NETHER_WOOD));
    public static final StairsBlock DRIFTWOOD_STAIRS = new StairsBlock(DRIFTWOOD_PLANKS.getDefaultState(),FabricBlockSettings.of().mapColor(MapColor.OFF_WHITE).strength(2.0F, 3.0F).sounds(BlockSoundGroup.NETHER_WOOD));
    public static final SlabBlock DRIFTWOOD_SLAB = new SlabBlock(FabricBlockSettings.of().mapColor(MapColor.OFF_WHITE).strength(2.0F, 3.0F).sounds(BlockSoundGroup.NETHER_WOOD));
    public static final FenceBlock DRIFTWOOD_FENCE = new FenceBlock(FabricBlockSettings.of().mapColor(MapColor.OFF_WHITE).strength(2.0F, 3.0F).sounds(BlockSoundGroup.NETHER_WOOD));
    public static final FenceGateBlock DRIFTWOOD_FENCE_GATE = new FenceGateBlock(FabricBlockSettings.of().mapColor(MapColor.OFF_WHITE).strength(2.0F, 3.0F).sounds(BlockSoundGroup.NETHER_WOOD), WoodType.CRIMSON);
    public static final DoorBlock DRIFTWOOD_DOOR = new DoorBlock(FabricBlockSettings.of().mapColor(MapColor.OFF_WHITE), BlockSetType.CRIMSON);
    public static final TrapdoorBlock DRIFTWOOD_TRAPDOOR = new TrapdoorBlock(FabricBlockSettings.of().mapColor(MapColor.OFF_WHITE), BlockSetType.CRIMSON);
    public static final PressurePlateBlock DRIFTWOOD_PRESSURE_PLATE = new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of().mapColor(MapColor.OFF_WHITE), BlockSetType.CRIMSON);
    public static final ButtonBlock DRIFTWOOD_BUTTON = new ButtonBlock(FabricBlockSettings.of().mapColor(MapColor.OFF_WHITE).pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CRIMSON, 30, true);

    //todo: fix these goddamn idiotic signs and their fucking loot tables
    public static final Identifier DRIFTWOOD_SIGN_TEXTURE = Identifier.of(QuinMain.MODID, "entity/signs/driftwood_sign");
    public static final TerraformSignBlock DRIFTWOOD_SIGN = new TerraformSignBlock(DRIFTWOOD_SIGN_TEXTURE, FabricBlockSettings.of().mapColor(MapColor.OFF_WHITE).sounds(BlockSoundGroup.NETHER_WOOD).noCollision());
    public static final TerraformWallSignBlock DRIFTWOOD_WALL_SIGN = new TerraformWallSignBlock(DRIFTWOOD_SIGN_TEXTURE, FabricBlockSettings.of().mapColor(MapColor.OFF_WHITE).sounds(BlockSoundGroup.NETHER_WOOD).noCollision().dropsLike(DRIFTWOOD_SIGN));
    public static final Identifier DRIFTWOOD_HANGING_SIGN_TEXTURE = Identifier.of(QuinMain.MODID, "entity/signs/hanging/driftwood");
    public static final Identifier DRIFTWOOD_HANGING_SIGN_GUI = Identifier.of(QuinMain.MODID, "textures/gui/hanging_signs/driftwood");
    public static final TerraformHangingSignBlock DRIFTWOOD_HANGING_SIGN = new TerraformHangingSignBlock(DRIFTWOOD_HANGING_SIGN_TEXTURE, DRIFTWOOD_HANGING_SIGN_GUI, FabricBlockSettings.of().mapColor(MapColor.OFF_WHITE).sounds(BlockSoundGroup.NETHER_WOOD).noCollision());
    public static final TerraformWallHangingSignBlock DRIFTWOOD_WALL_HANGING_SIGN = new TerraformWallHangingSignBlock(DRIFTWOOD_HANGING_SIGN_TEXTURE, DRIFTWOOD_HANGING_SIGN_GUI, FabricBlockSettings.of().mapColor(MapColor.OFF_WHITE).sounds(BlockSoundGroup.NETHER_WOOD).noCollision().dropsLike(DRIFTWOOD_HANGING_SIGN));

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

        Registry.register(Registries.ITEM, new Identifier(QuinMain.MODID, "gelrene_cube"), GELRENE_CUBE);

        Registry.register(Registries.BLOCK, new Identifier(QuinMain.MODID, "gelrene_block"), GELRENE_BLOCK);
        Registry.register(Registries.ITEM, new Identifier(QuinMain.MODID, "gelrene_block"), new BlockItem(GELRENE_BLOCK, new FabricItemSettings()));

    }
}
