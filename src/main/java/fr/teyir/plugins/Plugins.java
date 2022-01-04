package fr.teyir.plugins;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.plugin.Plugin;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Plugins  extends PlaceholderExpansion {


    @Override
    public boolean canRegister() {
        return true;
    }


    // Version de l'expansion
    @Override
    public String getVersion() {
        return "1.0";
    }


    /**
     * Register expansion author
     * @author Teyir
     *
     */

    @Override
    public String getAuthor() {
        return "Teyir";
    }


    // Expansion prefix
    @Override
    public String getIdentifier() {
        return "plugins";
    }

    public String onPlaceholderRequest(Player p, String identifier){

        // Get all the plugins into an array
        if (identifier.equalsIgnoreCase("list")) {

            Plugin[] plugins = Bukkit.getPluginManager().getPlugins();

            return Arrays.toString(plugins);
        }

        // Get the number of plugins
        if (identifier.startsWith("getnumberplugins")){
            Integer getPluginNumber = Bukkit.getPluginManager().getPlugins().length;

            return String.valueOf(getPluginNumber);
        }

        // Get the plugin + version
        if (identifier.startsWith("getplugin_")){

            String value = identifier.split("(?i)getplugin_")[1];
            Plugin getPlugin = Bukkit.getPluginManager().getPlugin(value);

            return String.valueOf(getPlugin);
        }

        // Check if the plugin is enabled
        if (identifier.startsWith("isenabled_")){

            String value = identifier.split("(?i)isenabled_")[1];
            boolean isenabled = Bukkit.getPluginManager().isPluginEnabled(value);

            return String.valueOf(isenabled);
        }

        // Gets all permissions.
        if (identifier.startsWith("getpermissions_")){
            String value = identifier.split("(?i)getpermissions_")[1];

            StringBuilder permissions = new StringBuilder();

            Bukkit.getPluginManager().getPlugin(value).getDescription().getPermissions().forEach(permission ->
                    permissions.append(permission.getName()).append(", "));

            return String.valueOf(permissions);
        }

        // Get the author name
        if (identifier.startsWith("getauthor_")){

            String value = identifier.split("(?i)getauthor_")[1];
            List<String> getAuthor = Bukkit.getPluginManager().getPlugin(value).getDescription().getAuthors();

            return String.valueOf(getAuthor);
        }

        // Get the description
        if (identifier.startsWith("getdescription_")){

            String value = identifier.split("(?i)getdescription_")[1];
            String getDescription = Bukkit.getPluginManager().getPlugin(value).getDescription().getDescription();

            return String.valueOf(getDescription);
        }

        // Get the prefix
        if (identifier.startsWith("getprefix_")){

            String value = identifier.split("(?i)getprefix_")[1];
            String getPrefix = Bukkit.getPluginManager().getPlugin(value).getDescription().getPrefix();

            return String.valueOf(getPrefix);
        }

        // Get the website
        if (identifier.startsWith("getwebsite_")){

            String value = identifier.split("(?i)getwebsite_")[1];
            String getWebsite = Bukkit.getPluginManager().getPlugin(value).getDescription().getWebsite();

            return String.valueOf(getWebsite);
        }

        // Get all commandes
        if (identifier.startsWith("getcommands_")){

            String value = identifier.split("(?i)getcommands_")[1];
            Map<String, Map<String, Object>> getCommands = Bukkit.getPluginManager().getPlugin(value).getDescription().getCommands();

            return String.valueOf(getCommands);
        }

        // Get the contributors
        if (identifier.startsWith("getcontributors_")){

            String value = identifier.split("(?i)getcontributors_")[1];
            List<String> getContributors = Bukkit.getPluginManager().getPlugin(value).getDescription().getContributors();

            return String.valueOf(getContributors);
        }



        return "&cInvalid placeholder";
    }


}
