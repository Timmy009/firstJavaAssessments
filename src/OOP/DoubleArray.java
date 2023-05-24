package OOP;

public class DoubleArray {
    public int [] doubledArray (int [] arrays) {
        int [] result = new int[arrays.length * 2];
        for (int count = 0; count < arrays.length; count++) {
            result[count] = arrays[count];
        }
        return result;
    }

    public int [] doubledArrayDuplicateRemoval(int [] arrays) {
        int [] result = new int[arrays.length * 2];
        for (int count = 0; count < arrays.length; count++) {
            result[count] = arrays[count];
        }

        for (int count = 0; count < result.length; count++) {
            for (int countTwo = count + 1; countTwo < result.length; countTwo++) {

                if (result[count] == result[countTwo]) {
                    result[countTwo] = 0;
                }
            }

        }
        return result;
    }

}
