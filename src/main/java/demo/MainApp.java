package demo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.di.TextEditor;

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

        TextEditor textEditor = (TextEditor) context.getBean("text_editor");
        textEditor.checkSpelling();
        
        context.registerShutdownHook();
    }
}
