package me.botsko.prism.wands;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public interface Wand {

    /**
     * 
     */
    void playerLeftClick(Player player, Location loc);

    /**
     * 
     */
    void playerRightClick(Player player, Location loc);

    /**
     * 
     * @param player
     * @param entity
     */
    void playerRightClick(Player player, Entity entity);

    /**
     * 
     * @param given
     */
    void setItemWasGiven(boolean given);

    /**
     * 
     * @return
     */
    boolean itemWasGiven();

    /**
     * 
     * @param mode
     */
    void setWandMode(String mode);

    /**
     * 
     * @param mode
     */
    String getWandMode();

    /**
     * @return the item_id
     */
    int getItemId();

    /**
     * @param item_id
     *            the item_id to set
     */
    void setItemId(int item_id);

    /**
     * @return the item_subid
     */
    byte getItemSubId();

    /**
     * @param item_subid
     *            the item_subid to set
     */
    void setItemSubId(byte item_subid);

    /**
     * 
     * @param key
     */
    void setItemFromKey(String key);

    /**
     * 
     * @param item
     */
    void setOriginallyHeldItem(ItemStack item);

    /**
     * 
     * @param player
     */
    void disable(Player player);

}