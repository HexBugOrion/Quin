package net.timeworndevs.quin;

import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Blocks;
import net.timeworndevs.quin.common.CommonRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QuinMain implements ModInitializer {
	public static final String MODID = "quin";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {
		CommonRegistry.register();
	}
}
