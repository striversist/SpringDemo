package demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.annotations.HelloWorldConfig;
import demo.annotations.Student;
import demo.annotations.TextEditor4;
import demo.di.JavaCollection;
import demo.di.TextEditor;
import demo.di.TextEditor2;
import demo.di.TextEditor3;

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

        AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext();
        context2.register(HelloWorldConfig.class);
        context2.refresh();
        HelloWorld obj3 = (HelloWorld) context2.getBean(HelloWorld.class);
        obj3.setMessage1("from annoatation config");
        obj3.getMessage1();

        TextEditor textEditor = (TextEditor) context.getBean("text_editor");
        textEditor.checkSpelling();
        
        TextEditor2 textEditor2 = (TextEditor2) context.getBean("text_editor2");
        textEditor2.checkSpelling();
        
        TextEditor3 textEditor3 = (TextEditor3) context.getBean("text_editor3");
        textEditor3.checkSpelling();
        
        TextEditor4 textEditor4 = (TextEditor4) context.getBean("text_editor4");
        textEditor4.checkSpelling();
        
        JavaCollection jc = (JavaCollection) context.getBean("java_collection");
        jc.getAddressList();
        jc.getAddressSet();
        jc.getAddressMap();
        jc.getAddressProp();
        
        Student student = (Student) context.getBean("student");
        System.out.println("Student name: " + student.getName());
        System.out.println("Student age: " + student.getAge());
        
        context.registerShutdownHook();
    }
}
