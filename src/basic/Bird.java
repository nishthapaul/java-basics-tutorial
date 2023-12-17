package basic;

public class Bird {
    int a = 10;
    static int color = 3;
    int eyes;
    void fly() {
        System.out.println(eyes);
        System.out.println("Flying");
    }
    Bird() {
        int a = 20;
        System.out.println(a);
        eyes = 8;
        System.out.println("default constructor");
        System.out.println(color);
    }
    Bird (int a, int b) {
        System.out.println("parameterized constructor");
        System.out.println(a  + b);
    }

    {
        System.out.println("non static block");
    }

    static {
        System.out.println("static block");
    }

    public static void main(String[] args) {

        Bird obj;
        obj = new Bird();
        Bird.color = 2;

//        Bird.staticFunction();

        Bird secondBird = new Bird();
        obj.eyes = 4;
        obj.fly();

        secondBird.eyes = 2;

    }
}
