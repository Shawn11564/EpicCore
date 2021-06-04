package dev.mrshawn.epiccore;

import dev.mrshawn.epiccore.utils.chat.Chat;
import org.bukkit.plugin.java.JavaPlugin;

public final class EpicCore extends JavaPlugin {

	@Override
	public void onEnable() {
		Chat.log(this, "&aEpicCore Enabled!");
	}

}
