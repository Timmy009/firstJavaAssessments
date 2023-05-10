package assignmentTwo;
public class LargestNumber {

    public int getMaximumNumber(int[] arrays) {

    int largestNumber = arrays[0];
        for (int count = 0; count < arrays.length; count++) {

            if (arrays[count] > largestNumber) {
                largestNumber = arrays[count];
            }


            }
        return largestNumber;
        }
    }

