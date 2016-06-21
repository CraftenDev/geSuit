package net.cubespace.geSuit.configs;

import net.cubespace.Yamler.Config.YamlConfig;
import net.cubespace.geSuit.geSuit;

import java.io.File;

public class TeleportConfig extends YamlConfig {
    public TeleportConfig() {
        CONFIG_FILE = new File(geSuit.instance.getDataFolder(), "teleport.yml");
    }

    public Integer TeleportRequestExpireTime = 10;
}
