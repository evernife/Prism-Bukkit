package me.botsko.elixr.commands.arguments;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Flag {

    String[] aliases();
    
    boolean acceptsValue() default false;
    
}