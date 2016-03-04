package demo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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

        TextEditor textEditor = (TextEditor) context.getBean("text_editor");
        textEditor.checkSpelling();
        
        TextEditor2 textEditor2 = (TextEditor2) context.getBean("text_editor2");
        textEditor2.checkSpelling();
        
        TextEditor3 textEditor3 = (TextEditor3) context.getBean("text_editor3");
        textEditor3.checkSpelling();
        
        JavaCollection jc = (JavaCollection) context.getBean("java_collection");
        jc.getAddressList();
        jc.getAddressSet();
        jc.getAddressMap();
        jc.getAddressProp();
        
        context.registerShutdownHook();
    }
}
