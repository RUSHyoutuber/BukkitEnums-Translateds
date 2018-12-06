package rush.enums.Exemplos;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import rush.enums.EnchantmentName;
import rush.enums.EntityName;
import rush.enums.GameModeName;
import rush.enums.InventoryName;
import rush.enums.ItemName;
import rush.enums.PotionName;
import rush.enums.WorldName;

public class Exemplos {
	
	public void exemplo() {
		
		ItemStack item = new ItemStack(Material.WOOL);
		String nomeDoItem = ItemName.valueOf(item).getName();
		System.out.println(nomeDoItem);
		
		World mundo = Bukkit.getWorlds().get(0);
		String tipoDoMundo = WorldName.valueOf(mundo).getName();
		System.out.println(tipoDoMundo);
		
		Entity mob = mundo.spawnEntity(mundo.getSpawnLocation(), EntityType.CHICKEN);
		String tipoDoMob = EntityName.valueOf(mob).getName();
		System.out.println(tipoDoMob);
		
		GameMode gamemode = Bukkit.getPlayer("RUSHyoutuber").getGameMode();
		String nomeDoGm = GameModeName.valueOf(gamemode).getName();
		System.out.println(nomeDoGm);
		
		Inventory inventario = Bukkit.createInventory(null, 27);
		String tipoDoInv = InventoryName.valueOf(inventario).getName();
		System.out.println(tipoDoInv);
		
		PotionEffect pocao = new PotionEffect(PotionEffectType.CONFUSION, 10, 2);
		String nomeDoEfeito = PotionName.valueOf(pocao).getName();
		System.out.println(nomeDoEfeito);
		
		item.addEnchantment(Enchantment.ARROW_DAMAGE, 4);
		Enchantment enchant = item.getEnchantments().keySet().iterator().next();
		String nomeDoEnchant = EnchantmentName.valueOf(enchant).getName();
		System.out.println(nomeDoEnchant);
	}
	
}