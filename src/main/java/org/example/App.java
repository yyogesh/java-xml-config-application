package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // System.out.println( "Hello Spring!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_config.xml");
        Developer developer = context.getBean("coder", Developer.class);
       // Developer developer = (Developer) context.getBean("coder");
       // developer.setName("ABC");
        System.out.println(developer.getName());
        developer.coding();

        Developer developer1 = (Developer) context.getBean("coder");
//        developer1.setName("XYZ");
        System.out.println(developer1.getName());
        developer1.coding();
    }
}
