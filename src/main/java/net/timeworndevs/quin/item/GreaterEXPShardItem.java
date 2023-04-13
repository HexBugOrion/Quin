package net.timeworndevs.quin.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class GreaterEXPShardItem extends Item {
    public GreaterEXPShardItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        user.addExperience(32);

        user.playSound(SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);

        ItemStack itemStack = user.getStackInHand(hand);

        if (!user.getAbilities().creativeMode) {
            itemStack.decrement(1);
        }

        return super.use(world, user, hand);
    }
}
