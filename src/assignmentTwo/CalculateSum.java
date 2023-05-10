package assignmentTwo;

public class CalculateSum {

    public int cakcualteArraySumWithForLoop(int [] arrays) {
        int total = 0;
        for (int count = 0; count < arrays.length; count++) {
            total+=arrays[count];
        }
        return total;
    }

    public int cakcualteArraySumWithWhileLoop(int [] arrays) {
        int total = 0;
        int count = 0;
        while ( count < arrays.length) {
            total+=arrays[count];
            count++;
        }
        return total;
    }

    public int cakcualteArraySumWithDoWhileLoop(int [] arrays) {
        int total = 0;
        int count = 0;
        do {
            total+=arrays[count];
            count++;

        }
        while ( count < arrays.length);
        return total;
    }
}
