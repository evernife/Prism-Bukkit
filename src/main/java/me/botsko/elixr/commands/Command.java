package me.botsko.elixr.commands;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import me.botsko.elixr.commands.arguments.Argument;
import me.botsko.elixr.commands.arguments.Flag;


@Retention(RetentionPolicy.RUNTIME)
public @interface Command {
    
    String[] aliases();

    String desc() default "";
    
    String[] permissions() default {};
    
    Argument[] arguments() default {};
    
    Flag[] flags() default {};
    
    boolean allowsConsole() default true;
    
    boolean playerRequired() default false;

}