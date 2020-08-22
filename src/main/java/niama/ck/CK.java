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
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Map;

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

    @EventHandler
    public void onInventoryOpenEvent(final InventoryOpenEvent e) {
        final ItemStack[] l = e.getInventory().getStorageContents();
        if (e.getInventory().getType().equals((Object) InventoryType.SHULKER_BOX)) {
            for (int s = l.length, i = 0; i < s; ++i) {
                if (l[i] != null && l[i].getType().equals((Object) Material.DIAMOND_SWORD)) {
                }
                final Map<Enchantment, Integer> m = (Map<Enchantment, Integer>) l[i].getEnchantments();
                for (final Enchantment key : m.keySet()) {
                    if (m.get(key) > key.getMaxLevel()) {
                        l[i].removeEnchantment(key);
                        l[i].addEnchantment(key, key.getMaxLevel());
                    }
                    if (l[i].getAmount() > l[i].getMaxStackSize()) {
                        l[i].setAmount(l[i].getMaxStackSize());
                    }
                }
                final ItemStack tl = l[i];
                if (tl.getAmount() > tl.getMaxStackSize()) {
                    tl.setAmount(tl.getMaxStackSize());
                }
            }
            for (int s2 = l.length, i2 = 0; i2 < s2; ++i2) {
                if (l[i2] != null && l[i2].getType().equals((Object) Material.GOLD_SWORD)) {
                    final Map<Enchantment, Integer> m2 = (Map<Enchantment, Integer>) l[i2].getEnchantments();
                    for (final Enchantment key : m2.keySet()) {
                        if (m2.get(key) > key.getMaxLevel()) {
                            l[i2].removeEnchantment(key);
                            l[i2].addEnchantment(key, key.getMaxLevel());
                        }
                        if (l[i2].getAmount() > l[i2].getMaxStackSize()) {
                            l[i2].setAmount(l[i2].getMaxStackSize());
                        }
                    }
                }
                final ItemStack tl2 = l[i2];
                if (tl2.getAmount() > tl2.getMaxStackSize()) {
                    tl2.setAmount(tl2.getMaxStackSize());
                }
            }
            for (int s2 = l.length, i3 = 0; i3 < s2; ++i3) {
                if (l[i3] != null && l[i3].getType().equals((Object) Material.TOTEM)) {
                    final Map<Enchantment, Integer> m3 = (Map<Enchantment, Integer>) l[i3].getEnchantments();
                    for (final Enchantment key : m3.keySet()) {
                        if (m3.get(key) > key.getMaxLevel()) {
                            l[i3].removeEnchantment(key);
                            l[i3].addEnchantment(key, key.getMaxLevel());
                        }
                        if (l[i3].getAmount() > l[i3].getMaxStackSize()) {
                            l[i3].setAmount(l[i3].getMaxStackSize());
                        }
                    }
                }
                final ItemStack tl2 = l[i3];
                if (tl2.getAmount() > tl2.getMaxStackSize()) {
                    tl2.setAmount(tl2.getMaxStackSize());
                }
            }
        }
        if (e.getInventory().getType().equals((Object) InventoryType.CHEST)) {
            for (int g = l.length, t = 0; t < g; ++t) {
                if (l[t] != null && l[t].getType().equals((Object) Material.TOTEM)) {
                    final Map<Enchantment, Integer> n = (Map<Enchantment, Integer>) l[t].getEnchantments();
                    for (final Enchantment key : n.keySet()) {
                        if (n.get(key) > key.getMaxLevel()) {
                            l[t].removeEnchantment(key);
                            l[t].addEnchantment(key, key.getMaxLevel());
                        }
                        if (l[t].getAmount() > l[t].getMaxStackSize()) {
                            l[t].setAmount(l[t].getMaxStackSize());
                        }
                    }
                }
                final ItemStack tg = l[t];
                if (tg.getAmount() > tg.getMaxStackSize()) {
                    tg.setAmount(tg.getMaxStackSize());
                }
            }
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
                final ItemStack tg2 = l[d2];
                if (tg2.getAmount() > tg2.getMaxStackSize()) {
                    tg2.setAmount(tg2.getMaxStackSize());
                }
            }
            for (int g3 = l.length, g2 = 0; g2 < g3; ++g2) {
                if (l[g2] != null && l[g2].getType().equals((Object) Material.GOLD_SWORD)) {
                    final Map<Enchantment, Integer> n2 = (Map<Enchantment, Integer>) l[g2].getEnchantments();
                    for (final Enchantment key : n2.keySet()) {
                        if (n2.get(key) > key.getMaxLevel()) {
                            l[g2].removeEnchantment(key);
                            l[g2].addEnchantment(key, key.getMaxLevel());
                        }
                        if (l[g2].getAmount() > l[g2].getMaxStackSize()) {
                            l[g2].setAmount(l[g2].getMaxStackSize());
                        }
                    }
                }
                final ItemStack tg2 = l[g2];
                if (tg2.getAmount() > tg2.getMaxStackSize()) {
                    tg2.setAmount(tg2.getMaxStackSize());
                }
            }
        }
        if (e.getInventory().getType().equals((Object) InventoryType.PLAYER)) {
            for (int y = l.length, r = 0; r < y; ++r) {
                if (l[r] != null && l[r].getType().equals((Object) Material.TOTEM)) {
                    final Map<Enchantment, Integer> o = (Map<Enchantment, Integer>) l[r].getEnchantments();
                    for (final Enchantment key : o.keySet()) {
                        if (o.get(key) > key.getMaxLevel()) {
                            l[r].removeEnchantment(key);
                            l[r].addEnchantment(key, key.getMaxLevel());
                        }
                        if (l[r].getAmount() > l[r].getMaxStackSize()) {
                            l[r].setAmount(l[r].getMaxStackSize());
                        }
                    }
                }
                final ItemStack te = l[r];
                if (te.getAmount() > te.getMaxStackSize()) {
                    te.setAmount(te.getMaxStackSize());
                }
            }
            for (int y = l.length, r = 0; r < y; ++r) {
                if (l[r] != null && l[r].getType().equals((Object) Material.DIAMOND_SWORD)) {
                    final Map<Enchantment, Integer> o = (Map<Enchantment, Integer>) l[r].getEnchantments();
                    for (final Enchantment key : o.keySet()) {
                        if (o.get(key) > key.getMaxLevel()) {
                            l[r].removeEnchantment(key);
                            l[r].addEnchantment(key, key.getMaxLevel());
                        }
                        if (l[r].getAmount() > l[r].getMaxStackSize()) {
                            l[r].setAmount(l[r].getMaxStackSize());
                        }
                    }
                }
                final ItemStack te = l[r];
                if (te.getAmount() > te.getMaxStackSize()) {
                    te.setAmount(te.getMaxStackSize());
                }
            }
            for (int y = l.length, r = 0; r < y; ++r) {
                if (l[r] != null && l[r].getType().equals((Object) Material.GOLD_SWORD)) {
                    final Map<Enchantment, Integer> o = (Map<Enchantment, Integer>) l[r].getEnchantments();
                    for (final Enchantment key : o.keySet()) {
                        if (o.get(key) > key.getMaxLevel()) {
                            l[r].removeEnchantment(key);
                            l[r].addEnchantment(key, key.getMaxLevel());
                        }
                        if (l[r].getAmount() > l[r].getMaxStackSize()) {
                            l[r].setAmount(l[r].getMaxStackSize());
                        }
                    }
                }
                final ItemStack te = l[r];
                if (te.getAmount() > te.getMaxStackSize()) {
                    te.setAmount(te.getMaxStackSize());
                }
            }
        }
    }

    @EventHandler
    public void onInventoryCloseEvent(final InventoryCloseEvent e) {
        if (e.getInventory().getType().equals((Object) InventoryType.HOPPER)) {
            final ItemStack[] l = e.getPlayer().getInventory().getStorageContents();
            for (int s = l.length, i = 0; i < s; ++i) {
                if (l[i] != null && l[i].getType().equals((Object) Material.DIAMOND_SWORD)) {
                    final Map<Enchantment, Integer> m = (Map<Enchantment, Integer>) l[i].getEnchantments();
                    for (final Enchantment key : m.keySet()) {
                        if (m.get(key) > key.getMaxLevel()) {
                            l[i].removeEnchantment(key);
                            l[i].addEnchantment(key, key.getMaxLevel());
                        }
                    }
                }
            }
            for (int s = l.length, i = 0; i < s; ++i) {
                if (l[i] != null && l[i].getType().equals((Object) Material.GOLD_SWORD)) {
                    final Map<Enchantment, Integer> m = (Map<Enchantment, Integer>) l[i].getEnchantments();
                    for (final Enchantment key : m.keySet()) {
                        if (m.get(key) > key.getMaxLevel()) {
                            l[i].removeEnchantment(key);
                            l[i].addEnchantment(key, key.getMaxLevel());
                        }
                    }
                }
            }
            ItemStack[] storageContents;
            for (int length = (storageContents = e.getInventory().getStorageContents()).length, j = 0; j < length; ++j) {
                final ItemStack di = storageContents[j];
                if (di.getType().equals((Object) Material.DIAMOND_SWORD)) {
                    final Map<Enchantment, Integer> hm = (Map<Enchantment, Integer>) di.getEnchantments();
                    for (final Enchantment hkey : hm.keySet()) {
                        if (hm.get(hkey) > hkey.getMaxLevel()) {
                            di.removeEnchantment(hkey);
                            di.addEnchantment(hkey, hkey.getMaxLevel());
                        }
                    }
                }
            }
            for (int length = (storageContents = e.getInventory().getStorageContents()).length, j = 0; j < length; ++j) {
                final ItemStack di = storageContents[j];
                if (di.getType().equals((Object) Material.GOLD_SWORD)) {
                    final Map<Enchantment, Integer> hm = (Map<Enchantment, Integer>) di.getEnchantments();
                    for (final Enchantment hkey : hm.keySet()) {
                        if (hm.get(hkey) > hkey.getMaxLevel()) {
                            di.removeEnchantment(hkey);
                            di.addEnchantment(hkey, hkey.getMaxLevel());
                        }
                    }
                }
            }
        }
        if (e.getInventory().getType().equals((Object) InventoryType.DISPENSER)) {
            final ItemStack[] l = e.getPlayer().getInventory().getStorageContents();
            for (int s = l.length, i = 0; i < s; ++i) {
                if (l[i] != null && l[i].getType().equals((Object) Material.DIAMOND_SWORD)) {
                    final Map<Enchantment, Integer> m = (Map<Enchantment, Integer>) l[i].getEnchantments();
                    for (final Enchantment key : m.keySet()) {
                        if (m.get(key) > key.getMaxLevel()) {
                            l[i].removeEnchantment(key);
                            l[i].addEnchantment(key, key.getMaxLevel());
                        }
                    }
                }
            }
            for (int s = l.length, i = 0; i < s; ++i) {
                if (l[i] != null && l[i].getType().equals((Object) Material.GOLD_SWORD)) {
                    final Map<Enchantment, Integer> m = (Map<Enchantment, Integer>) l[i].getEnchantments();
                    for (final Enchantment key : m.keySet()) {
                        if (m.get(key) > key.getMaxLevel()) {
                            l[i].removeEnchantment(key);
                            l[i].addEnchantment(key, key.getMaxLevel());
                        }
                    }
                }
            }
            ItemStack[] storageContents;
            for (int length = (storageContents = e.getInventory().getStorageContents()).length, j = 0; j < length; ++j) {
                final ItemStack di = storageContents[j];
                if (di.getType().equals((Object) Material.GOLD_SWORD)) {
                    final Map<Enchantment, Integer> hm = (Map<Enchantment, Integer>) di.getEnchantments();
                    for (final Enchantment hkey : hm.keySet()) {
                        if (hm.get(hkey) > hkey.getMaxLevel()) {
                            di.removeEnchantment(hkey);
                            di.addEnchantment(hkey, hkey.getMaxLevel());
                        }
                    }
                }
            }
            for (int length = (storageContents = e.getInventory().getStorageContents()).length, j = 0; j < length; ++j) {
                final ItemStack di = storageContents[j];
                if (di.getType().equals((Object) Material.DIAMOND_SWORD)) {
                    final Map<Enchantment, Integer> hm = (Map<Enchantment, Integer>) di.getEnchantments();
                    for (final Enchantment hkey : hm.keySet()) {
                        if (hm.get(hkey) > hkey.getMaxLevel()) {
                            di.removeEnchantment(hkey);
                            di.addEnchantment(hkey, hkey.getMaxLevel());
                        }
                    }
                }
            }
        }
    }

    @EventHandler
    public void onEntityPickupItemEvent(final EntityPickupItemEvent e) {
        final ItemStack I = e.getItem().getItemStack();
        if (I != null && I.getType().equals((Object) Material.DIAMOND_SWORD)) {
            final Map<Enchantment, Integer> m = (Map<Enchantment, Integer>) I.getEnchantments();
            for (final Enchantment key : m.keySet()) {
                if (m.get(key) > key.getMaxLevel()) {
                    I.removeEnchantment(key);
                    I.addEnchantment(key, key.getMaxLevel());
                }
            }
        }
        if (I != null && I.getType().equals((Object) Material.GOLD_SWORD)) {
            final Map<Enchantment, Integer> m = (Map<Enchantment, Integer>) I.getEnchantments();
            for (final Enchantment key : m.keySet()) {
                if (m.get(key) > key.getMaxLevel()) {
                    I.removeEnchantment(key);
                    I.addEnchantment(key, key.getMaxLevel());
                }
            }
        }
        if (I != null && I.getType().equals((Object) Material.ENDER_PEARL)) {
            final Map<Enchantment, Integer> o = (Map<Enchantment, Integer>) I.getEnchantments();
            for (final Enchantment key : o.keySet()) {
                if (o.get(key) > key.getMaxLevel()) {
                    I.removeEnchantment(key);
                    I.addEnchantment(key, key.getMaxLevel());
                }
                if (I.getAmount() > I.getMaxStackSize()) {
                    I.setAmount(I.getMaxStackSize());
                }
            }
            final ItemStack te = I;
            if (te.getAmount() > te.getMaxStackSize()) {
                te.setAmount(te.getMaxStackSize());
            }
        }
    }

    @EventHandler
    public void onInventoryMoveItemEvent(final InventoryMoveItemEvent e) {
        final ItemStack l = e.getItem();
        if (l != null && l.getType().equals((Object) Material.DIAMOND_SWORD)) {
            final Map<Enchantment, Integer> m = (Map<Enchantment, Integer>) l.getEnchantments();
            for (final Enchantment key : m.keySet()) {
                if (m.get(key) > key.getMaxLevel()) {
                    l.removeEnchantment(key);
                    l.addEnchantment(key, key.getMaxLevel());
                }
                if (l.getAmount() > l.getMaxStackSize()) {
                    l.setAmount(l.getMaxStackSize());
                }
                final ItemStack te = l;
                if (te.getAmount() > te.getMaxStackSize()) {
                    te.setAmount(te.getMaxStackSize());
                }
            }
        }
        if (l != null && l.getType().equals((Object) Material.GOLD_SWORD)) {
            final Map<Enchantment, Integer> m = (Map<Enchantment, Integer>) l.getEnchantments();
            for (final Enchantment key : m.keySet()) {
                if (m.get(key) > key.getMaxLevel()) {
                    l.removeEnchantment(key);
                    l.addEnchantment(key, key.getMaxLevel());
                }
                if (l.getAmount() > l.getMaxStackSize()) {
                    l.setAmount(l.getMaxStackSize());
                }
                final ItemStack te = l;
                if (te.getAmount() > te.getMaxStackSize()) {
                    te.setAmount(te.getMaxStackSize());
                }
            }
        }
        if (l != null && l.getType().equals((Object) Material.ENDER_PEARL)) {
            final Map<Enchantment, Integer> o = (Map<Enchantment, Integer>) l.getEnchantments();
            for (final Enchantment key : o.keySet()) {
                if (o.get(key) > key.getMaxLevel()) {
                    l.removeEnchantment(key);
                    l.addEnchantment(key, key.getMaxLevel());
                }
                if (l.getAmount() > l.getMaxStackSize()) {
                    l.setAmount(l.getMaxStackSize());
                }
            }
            final ItemStack te = l;
            if (te.getAmount() > te.getMaxStackSize()) {
                te.setAmount(te.getMaxStackSize());
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
