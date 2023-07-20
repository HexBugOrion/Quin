package net.timeworndevs.quin.block;

import net.minecraft.block.*;
import net.minecraft.fluid.Fluids;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

public class UnderwaterTorchBlock extends Block implements Waterloggable {
    public static final BooleanProperty WATERLOGGED;
    protected static final VoxelShape BOUNDING_SHAPE = Block.createCuboidShape(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);
    protected final ParticleEffect particle;

    public UnderwaterTorchBlock(Settings settings, ParticleEffect particle) {
        super(settings);
        this.particle = particle;
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context){
        return BOUNDING_SHAPE;
    }

    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos){
        if ((Boolean)state.get(WATERLOGGED)){
            world.scheduleBlockTick(pos, Blocks.WATER, Fluids.WATER.getTickRate(world));
        }
        return direction == Direction.DOWN && !this.canPlaceAt(state, world, pos) ? Blocks.AIR.getDefaultState() : super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos){
        return sideCoversSmallSquare(world, pos.down(), Direction.UP);
    }

    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        double d = (double)pos.getX() + 0.5;
        double e = (double)pos.getY() + 0.7;
        double f = (double)pos.getZ() + 0.5;
        world.addParticle(ParticleTypes.GLOW, d, e, f, 0.0, 0.0, 0.0);
        world.addParticle(this.particle, d, e, f, 0.0, 0.0, 0.0);
    }

    static {
        WATERLOGGED = Properties.WATERLOGGED;
    }
}
