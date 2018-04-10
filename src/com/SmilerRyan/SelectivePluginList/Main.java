package com.SmilerRyan.SelectivePluginList;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import java.io.File;
import java.util.ArrayList;

public class Main extends org.bukkit.plugin.java.JavaPlugin {
  
	public void onEnable() {
		File file = new File(getDataFolder(), "config.yml");
		if (!file.exists()) {saveDefaultConfig();} else {}
		getCommand("spl").setExecutor(this);
	 }
	
  public void onDisable() {}
  
  public boolean onCommand(org.bukkit.command.CommandSender sender, Command cmd, String msg, String[] args) {

if ((sender instanceof Player)) {
      
if (cmd.getName().equalsIgnoreCase("spl")) {
Plugin[] pluginslist = org.bukkit.Bukkit.getServer().getPluginManager().getPlugins();

String pluginlist = "";

for(Plugin p : pluginslist){
	if (p.isEnabled()) {
		
		ArrayList<String> frozen = new ArrayList<String>();
		for(String ignored : getConfig().getStringList("hide")) {frozen.add(ignored);}
		
		if ( frozen.contains(p.getName()) ) {} else {pluginlist = pluginlist + ChatColor.GREEN + p.getName() + ChatColor.WHITE + ", ";}
		} else {pluginlist = pluginlist + ChatColor.RED + p.getName() + ChatColor.WHITE + ", ";}
}

pluginlist = pluginlist + ChatColor.GREEN + getConfig().getStringList("hide").size() + " hidden";
int shownplugins = pluginslist.length - getConfig().getStringList("hide").size();
sender.sendMessage(ChatColor.WHITE + "Plugins: (" + shownplugins + "): " + pluginlist);
}}
return false;
}}