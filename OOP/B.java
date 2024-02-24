package OOP;

public class B extends A {
    public void print(){
        System.out.println("B");
    }

    public static void main(String[] args) {
        B obj = new B();
        obj.print();

        A obj2 = new B();
        obj2.print();

        obj2.add(10, 23);
    }
}
