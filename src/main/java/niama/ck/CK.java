package niama.ck;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.*;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityPickupItemEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryMoveItemEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

//unused//
@SuppressWarnings("unused")
public class CK extends JavaPlugin implements Listener {
    Map<Location, Integer> m;
    private InventoryCloseEvent e;
    public void register() {
        this.getServer().getPluginManager().registerEvents((Listener) this, (Plugin) this);
    }

    public void onEnable() {
        this.getLogger().info("***************************");
        this.getLogger().info("WDNMD NMSL");
        this.register();
    }

    public void onDisable() {
        this.getLogger().info("***************************");
        this.getLogger().info("WDNMD NMSL");
    }

    private static final List<Material> sword = Arrays.asList(Material.DIAMOND_SWORD,Material.GOLD_SWORD,Material.IRON_AXE,Material.STONE_SWORD,Material.WOOD_SWORD);
    @EventHandler
    public void onInventoryOpenEvent(InventoryOpenEvent e) {
        ItemStack[] l = e.getInventory().getStorageContents();
        for (int s = l.length, i = 0; i < s; ++i) {
            if (l[i] != null) {
                Material material = l[i].getType();
                if(sword.contains(material)){
                    Map<Enchantment, Integer> m = l[i].getEnchantments();
                    for (Enchantment key : m.keySet()) {
                        if (m.get(key) > key.getMaxLevel()) {
                            l[i].removeEnchantment(key);
                            l[i].addEnchantment(key, key.getMaxLevel());
                        }
                    }
                    ItemStack tl = l[i];
                    if (tl.getAmount() > tl.getMaxStackSize()) {
                        tl.setAmount(tl.getMaxStackSize());
                    }
                }
            }
        }
    }

    @EventHandler
    public void onInventoryCloseEvent(InventoryCloseEvent e) {
        ItemStack[] l = e.getPlayer().getInventory().getStorageContents();
        for (int s = l.length, i = 0; i < s; i++) {
            if (l[i] != null) {
                Material material = l[i].getType();
                if (sword.contains(material)) {
                    Map<Enchantment, Integer> m = l[i].getEnchantments();
                    for (Enchantment key : m.keySet()) {
                        if (m.get(key) > key.getMaxLevel()) {
                            l[i].removeEnchantment(key);
                            l[i].addEnchantment(key, key.getMaxLevel());
                        }
                    }
                }
                ItemStack tl = l[i];
                if (tl.getAmount() > tl.getMaxStackSize()) {
                    tl.setAmount(tl.getMaxStackSize());
                }
            }
        }
    }

    @EventHandler
    public void onEntityPickupItemEvent(EntityPickupItemEvent e) {
        ItemStack itemStack = e.getItem().getItemStack();
        if (itemStack != null) {
            Material material = itemStack.getType();
            if (sword.contains(material)){
                Map<Enchantment, Integer> m = itemStack.getEnchantments();
                for (Enchantment key : m.keySet()) {
                    if (m.get(key) > key.getMaxLevel()) {
                        itemStack.removeEnchantment(key);
                        itemStack.addEnchantment(key, key.getMaxLevel());
                    }
                }
            }
        }
    }

    @EventHandler
    public void onInventoryMoveItemEvent(final InventoryMoveItemEvent e) {
        final ItemStack l = e.getItem();
        if (l != null && l.getType().equals(Material.DIAMOND_SWORD)) {
            final Map<Enchantment, Integer> m = l.getEnchantments();
            for (final Enchantment key : m.keySet()) {
                if (m.get(key) > key.getMaxLevel()) {
                    l.removeEnchantment(key);
                    l.addEnchantment(key, key.getMaxLevel());
                }
                if (l.getAmount() > l.getMaxStackSize()) {
                    l.setAmount(l.getMaxStackSize());
                }
                if (l.getAmount() > l.getMaxStackSize()) {
                    l.setAmount(l.getMaxStackSize());
                }
            }
        }
        if (l != null && l.getType().equals(Material.GOLD_SWORD)) {
            final Map<Enchantment, Integer> m = l.getEnchantments();
            for (final Enchantment key : m.keySet()) {
                if (m.get(key) > key.getMaxLevel()) {
                    l.removeEnchantment(key);
                    l.addEnchantment(key, key.getMaxLevel());
                }
                if (l.getAmount() > l.getMaxStackSize()) {
                    l.setAmount(l.getMaxStackSize());
                }
                if (l.getAmount() > l.getMaxStackSize()) {
                    l.setAmount(l.getMaxStackSize());
                }
            }
        }
    }

    @EventHandler
    public void onPlace(final BlockPlaceEvent e) {
        final Block block = e.getBlockPlaced();
        if (block.getState() instanceof Chest || block.getState() instanceof DoubleChest) {
            final Location loc = e.getBlock().getLocation();
            final Location locfinal = new Location(e.getBlock().getWorld(), (double) loc.getBlockX(), (double) (loc.getBlockY() - 1), (double) loc.getBlockZ());
            final Block block2 = locfinal.getBlock();
            if (block2.getState() instanceof Hopper) {
                final Chest chest = (Chest) block.getState();
                final ItemStack[] l = chest.getInventory().getStorageContents();
                for (int g2 = l.length, d2 = 0; d2 < g2; ++d2) {
                    if (l[d2] != null && l[d2].getType().equals((Object) Material.DIAMOND_SWORD)) {
                        final Map<Enchantment, Integer> n2 = (Map<Enchantment, Integer>) l[d2].getEnchantments();
                        for (final Enchantment key : n2.keySet()) {
                            if (n2.get(key) > key.getMaxLevel()) {
                                l[d2].removeEnchantment(key);
                                l[d2].addEnchantment(key, key.getMaxLevel());
                            }
                            if (l[d2].getAmount() > l[d2].getMaxStackSize()) {
                                l[d2].setAmount(l[d2].getMaxStackSize());
                            }
                        }
                    }
                    if (l[d2] != null && l[d2].getType().equals((Object) Material.GOLD_SWORD)) {
                        final Map<Enchantment, Integer> n2 = (Map<Enchantment, Integer>) l[d2].getEnchantments();
                        for (final Enchantment key : n2.keySet()) {
                            if (n2.get(key) > key.getMaxLevel()) {
                                l[d2].removeEnchantment(key);
                                l[d2].addEnchantment(key, key.getMaxLevel());
                            }
                            if (l[d2].getAmount() > l[d2].getMaxStackSize()) {
                                l[d2].setAmount(l[d2].getMaxStackSize());
                            }
                            final ItemStack tg2 = l[d2];
                            if (tg2.getAmount() > tg2.getMaxStackSize()) {
                                tg2.setAmount(tg2.getMaxStackSize());
                            }
                        }
                    }
                }
            }
        }
        if (block.getState() instanceof ShulkerBox) {
            final Location loc = e.getBlock().getLocation();
            final Location locfinal = new Location(e.getBlock().getWorld(), (double) loc.getBlockX(), (double) (loc.getBlockY() - 1), (double) loc.getBlockZ());
            final Block block2 = locfinal.getBlock();
            if (block2.getState() instanceof Hopper) {
                final ShulkerBox box = (ShulkerBox) block.getState();
                final ItemStack[] i = box.getInventory().getStorageContents();
                for (int g2 = i.length, d2 = 0; d2 < g2; ++d2) {
                    if (i[d2] != null && i[d2].getType().equals((Object) Material.DIAMOND_SWORD)) {
                        final Map<Enchantment, Integer> n2 = (Map<Enchantment, Integer>) i[d2].getEnchantments();
                        for (final Enchantment key : n2.keySet()) {
                            if (n2.get(key) > key.getMaxLevel()) {
                                i[d2].removeEnchantment(key);
                                i[d2].addEnchantment(key, key.getMaxLevel());
                            }
                            if (i[d2].getAmount() > i[d2].getMaxStackSize()) {
                                i[d2].setAmount(i[d2].getMaxStackSize());
                            }
                        }
                    }
                    if (i[d2] != null && i[d2].getType().equals((Object) Material.GOLD_SWORD)) {
                        final Map<Enchantment, Integer> n2 = (Map<Enchantment, Integer>) i[d2].getEnchantments();
                        for (final Enchantment key : n2.keySet()) {
                            if (n2.get(key) > key.getMaxLevel()) {
                                i[d2].removeEnchantment(key);
                                i[d2].addEnchantment(key, key.getMaxLevel());
                            }
                            if (i[d2].getAmount() > i[d2].getMaxStackSize()) {
                                i[d2].setAmount(i[d2].getMaxStackSize());
                            }
                        }
                    }
                }
            }
        }
    }
}
