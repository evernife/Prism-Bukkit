package me.botsko.elixr.commands.arguments;

import me.botsko.elixr.commands.exceptions.CommandArgumentException;

public class ArgumentIntegerValidator implements ArgumentValidator {

    /**
     * 
     */
    public void validate(String arg) throws CommandArgumentException {
        try {
            Integer.parseInt( arg );
        } catch( NumberFormatException e ){
            throw new CommandArgumentException("Argument "+arg+" invalid: must be a number");
        }
    }
}