package assignmentTwo;

public class ArrayOdd {
    public String getArrayInOddPosition (int [] arrays) {
        String oddNumber = "";
        for(int element = 0; element < arrays.length; element++) {
            if ((element +1) % 2 != 0) {

                oddNumber +=  arrays[element] + " ";
            }
        }
        return oddNumber;
    }
}
