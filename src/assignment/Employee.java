package assignment;

public class Employee {
    public static void main(String[] args) {
        String str1 =  new String("abc");
        String str2 = new String("abc");
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
    }
}
