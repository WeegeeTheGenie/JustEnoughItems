package mezz.jei.util;

import mezz.jei.config.Constants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class Log {
	private static final Logger LOGGER = LogManager.getLogger(Constants.MOD_ID);

	public static Logger get() {
		return LOGGER;
	}

	private Log() {
	}
}
