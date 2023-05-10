package assignmentTwo;

public class ListConcatinationTwo {
    public int [] arrayCon (int [] arraysOne, int [] arrayTwo) {
        int [] array = new int [arraysOne.length + arrayTwo.length];
        int countThree = 0;
        for (int count = 0; countThree < array.length; count++) {
            array[countThree] += arraysOne[count];
            countThree+=2;
        }

        int countFour = 1;
        for (int count = 0; countFour < array.length; count++) {
                array[countFour] += arrayTwo[count];
            countFour+=2;
        }
        return array;
    }



}
