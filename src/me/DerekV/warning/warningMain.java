package me.DerekV.warning;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class warningMain extends JavaPlugin{
	
	public final Logger logger = Logger.getLogger("Minecraft");
	public static warningMain plugin;
	
	static File WarnFile;
	static FileConfiguration Warn;
	
	
	@Override
	public void onEnable(){
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " Version" + pdfFile.getVersion() + " Has been Enabled!");
		getConfig().options().copyDefaults(true);
		saveConfig();
		
		WarnFile = new File(getDataFolder(), "Warn.yml");
		Warn = YamlConfiguration.loadConfiguration(WarnFile);
		saveStats();
		
	}
	@Override
	public void onDisable(){
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " Version" + pdfFile.getVersion() + " Has been Dsiabled!");
		
	}
	
	
	public void saveStats(){
		try {
		Warn.save(WarnFile);
		} catch (Exception e) {
			
		}
		}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		Player player = (Player) sender;		
		if(commandLabel.equalsIgnoreCase("admin")){
					if(args.length == 0){
					player.sendMessage(ChatColor.RED + "Incorrect Usage");
					}
					else if(args.length >=1){
					if(args[0].equalsIgnoreCase("ban")){
						player.sendMessage("Banned");
					}else if(args[0].equalsIgnoreCase("kick")){
						
						
						
					}else if(args[0].equalsIgnoreCase("vanish")){
						
					}
					
					}
					
					
					
					
					
					
					
		}
		return false;
		
	}

	
	
}
