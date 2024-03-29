package ru.job4j.beanFactory;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.job4j.beanFactory.data.StartUI;

public class ContextByJavaBasedConfig {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext("ru.job4j.beanFactory");
        var ui = context.getBean(StartUI.class);
        ui.add("Petr Arsentev");
        ui.add("Ivan ivanov");
        ui.print();
    }
}
