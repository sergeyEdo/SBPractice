package commands;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Аннотация для всех классов команд.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface CommandAnnotation {
    String commandName() default "";
    String commandDescription() default "";
}