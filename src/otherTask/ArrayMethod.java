package otherTask;

public class ArrayMethod {


    public int [] intArray (int [] myArray) {
        myArray = new int[10];
            for (int index = 0; index < myArray.length; index++) {
             myArray [index] += index + 1;
            }

            return myArray;
        }

}
