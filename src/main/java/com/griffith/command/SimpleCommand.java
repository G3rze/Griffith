package com.griffith.command;

import com.griffith.bot.Builder;
import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.interactions.commands.SlashCommandInteraction;

public abstract class SimpleCommand {
  public Builder bot;
  public String name;
  public String description;
  public Permission permission;
  public Permission botPermission;

  protected SimpleCommand(Builder bot) {
    this.bot = bot;
  }

  public abstract void execute(SlashCommandInteraction event);
}
