package com.realmsunleashed;

import com.realmsunleashed.init.BlockInit;
import com.realmsunleashed.init.ItemGroupInit;
import com.realmsunleashed.init.ItemInit;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MagicUnleashed implements ModInitializer {
	public static final String MOD_ID = "magic_unleashed";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Loading...");
		ItemInit.load();
		BlockInit.load();
		ItemGroupInit.load();
	}

	public static Identifier id(String path) {
		return  Identifier.of(MOD_ID, path);
	}


}