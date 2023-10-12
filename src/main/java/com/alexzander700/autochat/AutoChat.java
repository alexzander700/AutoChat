package com.alexzander700.autochat;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class AutoChat implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("alex-auto-chat");

    @Override
    public void onInitialize() {
        LOGGER.info("Auto Chat has begun initializing.");

        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> register(dispatcher));
    }
}
