package me.botsko.elixr.commands.arguments;

import me.botsko.elixr.commands.exceptions.CommandArgumentException;

public class ArgumentCurrencyValidator implements ArgumentValidator {

    /**
     * 
     */
    public void validate(String arg) throws CommandArgumentException {
        try {
            Float.parseFloat( arg );
        } catch( NumberFormatException e ){
            throw new CommandArgumentException("Argument "+arg+" invalid: must be currency");
        }
    }
}