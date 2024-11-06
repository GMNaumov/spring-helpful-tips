package com.ngm.projects;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // Избавляемся от головной боли с закрытием context-а - используем человеческий try с ресурсами
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            
            // Отдельно двигатель создавать не нужно, всё будет считано из файла конфигурации XML
            Vehicle vehicle = context.getBean("car", Car.class);

            vehicle.start();
        }
    }
}
