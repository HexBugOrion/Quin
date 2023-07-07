package net.timeworndevs.quin.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

//todo: Do I need a mixin to make this work?
public class GelrenePileBlock extends Block {
    public GelrenePileBlock(Settings settings) {
        super(settings);
    }

    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity){
        entity.damage(world.getDamageSources().generic(), 1.0f);
    }
}
