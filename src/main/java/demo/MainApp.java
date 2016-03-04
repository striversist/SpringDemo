package demo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        
        HelloWorld obj1 = (HelloWorld) context.getBean("hello_world");
        obj1.getMessage1();
        obj1.getMessage2();
        
        HelloChina obj2 = (HelloChina) context.getBean("hello_china");
        obj2.getMessage1();
        obj2.getMessage2();
        obj2.getMessage3();
        
        context.registerShutdownHook();
    }
}
