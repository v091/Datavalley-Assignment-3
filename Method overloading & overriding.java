class Parent {
    
    public void display() {
        System.out.println("Parent's display method");
    }


    public void show() {
        System.out.println("Parent's show method");
    }
}

class Child extends Parent {
  
    @Override
    public void show() {
        System.out.println("Child's overridden show method");
    }

    // Method Overloading
    public void display(String message) {
        System.out.println("Child's overloaded display method: " + message);
    }
}

public class over {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.display(); 
        parent.show();    

        Child child = new Child();
        child.display();          
        child.display("Hello");   
        child.show();             
    }
}
