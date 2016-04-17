package me.botsko.prism.actions;

import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import me.botsko.elixr.MaterialAliases;
import me.botsko.prism.actionlibs.ActionType;
import me.botsko.prism.actionlibs.QueryParameters;
import me.botsko.prism.appliers.ChangeResult;

public interface Handler {

    /**
     * 
     * @param pl
     */
    void setPlugin(Plugin pl);

    /**
     * @return the id
     */
    int getId();

    /**
     * @param id
     *            the id to set
     */
    void setId(int id);

    /**
     * @return the action_time
     */
    String getUnixEpoch();

    /**
     * @return the display_date
     */
    String getDisplayDate();

    /**
     * @return the display_time
     */
    String getDisplayTime();

    /**
     * @param display_time
     *            the display_time to set
     */
    void setUnixEpoch(String epoch);

    /**
     * 
     * @return
     */
    String getTimeSince();

    /**
     * @return the action_type
     */
    ActionType getType();

    /**
     * 
     * @param type
     */
    void setType(ActionType type);

    /**
     * @return the world_name
     */
    String getWorldName();

    /**
     * @param world_name
     *            the world_name to set
     */
    void setWorldName(String world_name);

    /**
     * @return the player_name
     */
    String getPlayerName();

    /**
     * @param player_name
     *            the player_name to set
     */
    void setPlayerName(String player_name);

    /**
     * @return the x
     */
    double getX();

    /**
     * @param x
     *            the x to set
     */
    void setX(double x);

    /**
     * @return the y
     */
    double getY();

    /**
     * @param y
     *            the y to set
     */
    void setY(double y);

    /**
     * @return the z
     */
    double getZ();

    /**
     * @param z
     *            the z to set
     */
    void setZ(double z);

    /**
     * 
     * @param id
     */
    void setBlockId(int id);

    /**
     * 
     * @param id
     */
    void setBlockSubId(int id);

    /**
     * 
     */
    int getBlockId();

    /**
     * 
     */
    int getBlockSubId();

    /**
     * 
     * @param id
     */
    void setOldBlockId(int id);

    /**
     * 
     * @param id
     */
    void setOldBlockSubId(int id);

    /**
     * 
     */
    int getOldBlockId();

    /**
     * 
     */
    int getOldBlockSubId();

    /**
     * @return the data
     */
    String getData();

    // Cauldron start
    /**
     * @return the data
     */
    String getTileEntityData();

    /**
     * @param data the data to set
     */
    void setTileEntityData(String data);
    // Cauldron end

    /**
     * @param data
     *            the data to set
     */
    void setData(String data);

    /**
     * 
     * @param m
     */
    void setMaterialAliases(MaterialAliases m);

    /**
     * 
     * @param aggregateCount
     */
    void setAggregateCount(int aggregateCount);

    /**
     * 
     * @return
     */
    int getAggregateCount();

    /**
     * 
     */
    String getNiceName();

    /**
     * 
     */
    void save();

    /**
     *
     */
    boolean isCanceled();

    /**
     * 
     * @param cancel
     */
    void setCanceled(boolean cancel);

    /**
     * 
     * @param player
     * @param parameters
     * @param is_preview
     * @return
     */
    ChangeResult applyRollback(Player player, QueryParameters parameters, boolean is_preview);

    /**
     * 
     * @param player
     * @param parameters
     * @param is_preview
     * @return
     */
    ChangeResult applyRestore(Player player, QueryParameters parameters, boolean is_preview);

    /**
     * 
     * @param player
     * @param parameters
     * @param is_preview
     * @return
     */
    ChangeResult applyUndo(Player player, QueryParameters parameters, boolean is_preview);

    /**
     * 
     * @param player
     * @param parameters
     * @param is_preview
     * @return
     */
    ChangeResult applyDeferred(Player player, QueryParameters parameters, boolean is_preview);

}