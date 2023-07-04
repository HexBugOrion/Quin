package net.timeworndevs.quin;

import net.fabricmc.api.ModInitializer;
import net.timeworndevs.quin.common.CommonBlockRegistry;
import net.timeworndevs.quin.common.CommonDeprecatedRegistry;
import net.timeworndevs.quin.common.CommonItemRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QuinMain implements ModInitializer {
	public static final String MODID = "quin";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {
		//CommonDeprecatedRegistry.register();
		CommonBlockRegistry.register();
		CommonItemRegistry.register();
	}
}
