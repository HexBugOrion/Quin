package net.timeworndevs.quin.init;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.timeworndevs.quin.QuinMain;

//Terraformers code borrowed for the sake of all that is holy
public class QuinRegistry {

    public QuinRegistry() {
        return;
    }

    public static BlockItem registerBlockItem(String name, Block block) {
        BlockItem item = new BlockItem(block, new Item.Settings());
        return register(name, item);
    }

    public static <I extends Item> I register(String name, I item){
        if(item instanceof BlockItem blockItem) {
            blockItem.appendBlocks(Item.BLOCK_ITEMS, blockItem);
        }
        return Registry.register(Registries.ITEM, Identifier.of(QuinMain.MODID, name), item);
    }

    public static <B extends Block> B register(String name, B block){
        return Registry.register(Registries.BLOCK, Identifier.of(QuinMain.MODID, name), block);
    }
}
