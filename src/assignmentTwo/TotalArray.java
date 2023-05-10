package assignmentTwo;

public class TotalArray {
    public int total (int [] array) {
        int total =0;
        for (int count = 0; count < array.length; count++) {
            total+= array[count];
            System.out.println(total);
        }
        return total;
    }
}
