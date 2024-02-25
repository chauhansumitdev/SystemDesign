package misc;

public class Generics {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        box.setValue(100);
        System.out.println(box.getValue());

        Box<String> stringBox = new Box<>();
        stringBox.setValue("this is the string value");
        System.out.println(stringBox.getValue());
    }
}
