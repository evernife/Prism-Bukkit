package me.botsko.elixr.commands.arguments;

import me.botsko.elixr.commands.exceptions.CommandArgumentException;

public interface ArgumentValidator {

    public void validate( String arg ) throws CommandArgumentException;
    
}