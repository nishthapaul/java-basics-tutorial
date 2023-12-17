package basic;

public class Child extends Parent {
    // Overloading - static polymorphism
    void build() { // Overriding - inheritance - runtime polymorphism
        System.out.println("Child");
    }

    static void staticFunction() {
        System.out.println("static in child");
    }

    Child() {
        System.out.println("Constructyor in child");
    }

    public static void main(String[] args) {
        System.out.println("Object 1 ..................");
        Parent p = new Parent(4);
        p.build(); // -> Parent
        p.staticFunction(); // -> static in parent

        System.out.println("Object 2 ..................");
        Child child = new Child();
        child.build(); //  child
        child.staticFunction(); /// static in child

        System.out.println("Object 3 ..................");
        Parent newParent = new Child();
        newParent.build(); // child
        newParent.staticFunction(); // static in parent

    }
}