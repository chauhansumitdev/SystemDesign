package OOP;

public class Str {
    public static void main(String[] args) {
        String s1 = "hello";

        StringBuilder sb = new StringBuilder("hello");
        System.out.println(s1 == sb.toString());
    }
}
