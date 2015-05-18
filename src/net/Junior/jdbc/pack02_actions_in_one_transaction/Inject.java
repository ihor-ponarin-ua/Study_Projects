package net.Junior.jdbc.pack02_actions_in_one_transaction;

import java.lang.annotation.*;

/**
 * Created by root on 25.04.2015.
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Inject {
    public String value();
}
/*
Аннотация, которая вешается на поле, в которое необходимо инъекцировать зависимость (инициализироваь бином).
Аннотация помечана несколькими метаанотациями:
@Documented - аннотация будет отображаться в javadoc
@Target(ElementType.FIELD) - аннотация может вешаться только на поля
@Retention(RetentionPolicy.RUNTIME) - аннотация будет присутствовать на всех этапах: в сорцах, после компиляции,
в момент выполнения.
 */