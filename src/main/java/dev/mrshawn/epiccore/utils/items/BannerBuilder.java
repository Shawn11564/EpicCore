package dev.mrshawn.epiccore.utils.items;

import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BannerMeta;

public class BannerBuilder extends ItemBuilder {

	private final BannerMeta bannerMeta;

	public BannerBuilder(Material material) {
		super(material);
		bannerMeta = (BannerMeta) meta;
	}

	public BannerBuilder(Material material, int amount) {
		super(material, amount);
		bannerMeta = (BannerMeta) meta;
	}

	public BannerBuilder addPattern(DyeColor color, PatternType patternType) {
		bannerMeta.addPattern(new Pattern(color, patternType));
		return this;
	}

	@Override
	public ItemStack build() {
		bannerMeta.setLore(lore);
		enchants.forEach(item::addUnsafeEnchantment);
		bannerMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(bannerMeta);
		return item;
	}

}
