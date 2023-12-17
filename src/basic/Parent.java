package basic;

public class Parent {
    void build() {
        System.out.println("Parent");
    }

    static void staticFunction() {
        System.out.println("static in parent");
    }

    public Parent() {
        System.out.println("Constructor in parent");
    }

    public Parent(int a) {
        System.out.println("Parameterized Constructor in parent");
    }
}