package otherTask;

public class AruthMain {
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();
        System.out.println(arithmetic.add(2, 3));
        System.out.println(arithmetic.add(2, 3, 4));
        System.out.println(arithmetic.add(2, 3.0));
    }
}
