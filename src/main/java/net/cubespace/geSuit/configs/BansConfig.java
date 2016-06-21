package net.cubespace.geSuit.configs;

import net.cubespace.Yamler.Config.YamlConfig;
import net.cubespace.geSuit.geSuit;

import java.io.File;

public class BansConfig extends YamlConfig {
    public BansConfig() {
        CONFIG_FILE = new File(geSuit.instance.getDataFolder(), "bans.yml");
    }

    public Boolean Enabled = true;
    public Boolean BroadcastBans = true;
    public Boolean BroadcastKicks = true;
    public Boolean DetectAltAccounts = true;
    public Boolean ShowAltAccountsOnlyIfBanned = true;
}
