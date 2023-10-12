package com.alexzander700.autochat.commands;


import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandManager;
import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource;
import net.minecraft.network.message.MessageType;
import net.minecraft.text.Text;

public final class SimpleEcho {
    public static void register(CommandDispatcher<FabricClientCommandSource> dispatcher){
        dispatcher.register(ClientCommandManager.literal("test").executes(ctx -> {

            return 0;
        }));
    }

    public static int solve(ClientCommandManager source, String message) {
        final Text text = Text.literal(message).formatted();

        
        return Command.SINGLE_SUCCESS;
    }
}
