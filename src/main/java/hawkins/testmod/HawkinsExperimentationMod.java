package hawkins.testmod;

import hawkins.testmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HawkinsExperimentationMod implements ModInitializer {
	public static final String MOD_ID = "hawkins_experimentation_mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}