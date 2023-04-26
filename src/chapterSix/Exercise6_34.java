package chapterSix;

public class Exercise6_34 {
    public static void main(String[] args) {
        int count = 1;
        while (count <= 256) {
            String binary = Integer.toBinaryString(count);
            String octa = Integer.toOctalString(count);
            String hexa = Integer.toHexString(count);
            System.out.printf("%d\t%s\t%s\t%s\t\n", count, binary, octa, hexa);
            count++;
        }
    }
}
