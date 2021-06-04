package dev.mrshawn.epiccore.utils.items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.UUID;

public class SkullBuilder extends ItemBuilder {

	private final SkullMeta skullMeta;

	public SkullBuilder(Material material) {
		super(material);
		skullMeta = (SkullMeta) meta;
	}

	public SkullBuilder(Material material, int amount) {
		super(material, amount);
		skullMeta = (SkullMeta) meta;
	}

	public SkullBuilder setOwner(UUID owner) {
		skullMeta.setOwningPlayer(Bukkit.getOfflinePlayer(owner));
		return this;
	}

	public SkullBuilder setOwner(String owner) {
		skullMeta.setOwningPlayer(Bukkit.getOfflinePlayer(owner));
		return this;
	}

	@Override
	public ItemStack build() {
		skullMeta.setLore(lore);
		enchants.forEach(item::addUnsafeEnchantment);
		item.setItemMeta(skullMeta);
		return item;
	}
}
