package demo;

public class HelloWorld {

    private String message1;
    private String message2;

    public void init() {
        System.out.println("Bean " + getClass().getSimpleName() + " is going though init.");
    }
    
    public void destroy() {
        System.out.println("Bean " + getClass().getSimpleName() + " will destroy now.");
    }
    
    public void getMessage1() {
        System.out.println("Your message1: " + message1);
    }

    public void setMessage1(String message1) {
        this.message1 = message1;
    }
    
    public String getMessage2() {
        System.out.println("Your message2: " + message2);
        return message2;
    }

    public void setMessage2(String message2) {
        this.message2 = message2;
    }
}
