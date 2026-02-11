class Parent {
    void show() {
        System.out.println("This is parent class");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("This is child class");
    }
}

public class Downcasting {
    public static void main(String[] args) {

        Parent p = new Child();
        Child c = (Child) p;      // downcasting

        c.show();
        c.display();
    }
}

