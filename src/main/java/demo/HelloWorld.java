package demo;

public class HelloWorld {

    private String message;

    public void init() {
        System.out.println("Bean is going though init.");
    }
    
    public void destroy() {
        System.out.println("Bean will destroy now.");
    }
    
    public void getMessage() {
        System.out.println("Your message: " + message);
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
